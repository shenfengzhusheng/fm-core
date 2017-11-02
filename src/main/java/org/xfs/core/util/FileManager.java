package org.xfs.core.util;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import org.springframework.util.StringUtils;

/**
 * 文件管理
 * 
 * @author
 * @since Jan 16, 2010
 */
public class FileManager {

    /** 获取文件夹中所有文件的绝对路径 */
    public static List<String> getFilePaths(File file) {

        List<String> fl = new LinkedList<String>();

        if (file.isFile()) {
            String path = file.getAbsolutePath();
            fl.add(path);
        } else if (file.isDirectory()) {
            String[] list = file.list();
            for (int i = 0; i < list.length; i++) {
                File nf = new File(file.getPath() + "/" + list[i]);
                fl.addAll(getFilePaths(nf));
            }

        }
        return fl;
    }

    /** 复制单个文件 */
    public static boolean copyfile(String oldpath, String newpath) {

        try {
            int count = 0;
            FileInputStream fis = new FileInputStream(oldpath);
            FileOutputStream fos = new FileOutputStream(newpath);
            byte[] buf = new byte[1444];
            while ((count = fis.read(buf)) != -1)
                fos.write(buf, 0, count);
            fos.close();
            fis.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /** 删除一个文件 **/
    public static boolean deletefile(String path) {

        try {
            File file = new File(path);
            return file.delete();

        } catch (Exception e) {
            return false;
        }
    }

    /** 移动一个文件 （物理移动文件，速度较慢） */
    public static boolean movefile(String oldpath, String newpath) {

        return copyfile(oldpath, newpath) && deletefile(oldpath);

    }

    /**
     * 重命名文件，可用于在同一盘中移动文件，速度稍快
     * 
     * @throws Exception
     */
    public static boolean renameTo(String sourcePath, String destPath) throws Exception {

        File source = new File(sourcePath);
        File dest = new File(destPath);

        return source.renameTo(dest);
    }

    /***
     * 文本文件转换为字符串， 去掉一行前后的空白符
     */
    public static String toString(String dir) throws Exception {

        List<String> lines = read(dir);

        StringBuffer sb = new StringBuffer();

        for (String line : lines) {
            sb.append(line.trim());
        }

        return sb.toString();
    }

    /***
     * 文本文件转换为字符串
     */
    public static String toStringNoTrim(String dir) throws Exception {
        List<String> lines = read(dir);
        StringBuffer sb = new StringBuffer();
        for (String line : lines) {
            sb.append(line);
        }
        return sb.toString();
    }

    /**
     * 默认编码格式读取文件，方法重写
     * 
     * @param dir
     * @return
     * @throws Exception
     */
    public static List<String> read(String dir) throws Exception {
        return read(dir, "UTF-8");
    }

    /**
     * 制定编码读取文件
     * 
     * @param dir 文件路径
     * @param charset 编码格式
     * @return
     * @throws Exception
     */
    public static List<String> read(String dir, String charset) throws Exception {
        List<String> lineList = new ArrayList<String>();
        FileInputStream fis = new FileInputStream(new File(dir));
        InputStreamReader isr = null;
        if (StringUtils.isEmpty(charset)) {
            isr = new InputStreamReader(fis);
        } else {
            isr = new InputStreamReader(fis, charset);
        }
        BufferedReader br = new BufferedReader(isr);
        try {
            String str = null;
            while ((str = br.readLine()) != null) {
                lineList.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            fis.close();
            isr.close();
            br.close();
        }
        return lineList;

    }

    /** text file to UTF-8 ByteArrayInputStream */
    public static ByteArrayInputStream fileToStream(String dir) throws Exception {

        String str = toString(dir);
        ByteArrayInputStream bais = new ByteArrayInputStream(str.getBytes("UTF-8"));

        return bais;

    }

    /** 生成新文件 */
    public static void write(List<String> lineList, String dest, String encoding) throws IOException {

        File file = new File(dest);
        FileOutputStream fos = new FileOutputStream(file);
        OutputStreamWriter osw = new OutputStreamWriter(fos, encoding);

        for (String line : lineList) {
            osw.write(line);
        }

        osw.flush();
        osw.close();
    }

    /** 字符串写到文件 */
    public static void write(String content, String dest) throws IOException {

        File file = new File(dest);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        FileOutputStream fos = new FileOutputStream(file);
        OutputStreamWriter osw = new OutputStreamWriter(fos);

        osw.write(content);

        osw.flush();
        osw.close();
    }

    /** 字符串写到文件：使用指定的字符编码 */
    public static void write(String content, String dest, String charset) throws Exception {

        File file = new File(dest);
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        try {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            fos = new FileOutputStream(file);
            osw = new OutputStreamWriter(fos, charset);
            osw.write(content);
            osw.flush();
        } catch (Throwable e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        } finally {
            if (fos != null) {
                osw.close();
            }
            if (fos != null) {
                fos.close();
            }
        }
    }

    // ----------------------------------------------------------------------------
    // driver methods
    public static void main(String[] args) throws Exception {
        String content = toString("E:\\EDI\\feiyang\\odb.txt", "gbk");
        System.out.println(content);
    }

    /**
     * webRoot路径
     */
    private static String webRoot_path = null;

    /**
     * getWebRootPath：获得WebRoot路径
     * 
     * @return
     */
    public static String getWebRootPath() {

        if (webRoot_path == null) {
            String user_dir = System.getProperty("user.dir");
            String file_separator = System.getProperty("file.separator");
            webRoot_path = user_dir + file_separator + "WebRoot";
        }
        return webRoot_path;
    }

    /**
     * readPropertiesFile：读取Properties文件
     * 
     * @param file_path
     * @throws Exception
     */
    public static Properties readPropertiesFile(String properties__path) throws Exception {
        try {
            Properties properties = new Properties();
            properties.load(ClassLoader.getSystemResourceAsStream(properties__path));
            return properties;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * getProperty：获取信息
     * 
     * @throws Exception
     */
    public static String getProperty(Properties prop, String code) throws Exception {
        return new String(prop.getProperty(code).getBytes(InterfacesConstant.CHARSET_ISO88591), "UTF-8");
    }

    // add at 2013-03-25 by yebo
    /**
     * getFileName：获得文件名
     * 
     * @return
     * @throws Exception
     */
    public static String getFileName(String path) throws Exception {
        String n = null;
        if (!StringUtils.isEmpty(path)) {
            n = path.substring(path.lastIndexOf("/") + 1);
        }
        return n;
    }



    // add at 2013-04-15 by yebo PG系统对接项目 start
    /**
     * 制定编码格式读取文件
     * 
     * @param dir 文件路径
     * @param charset 编码格式
     * @return 文件内容
     * @throws Exception
     */
    public static String toString(String dir, String charset) throws Exception {

        List<String> lines = read(dir, charset);

        StringBuffer sb = new StringBuffer();

        for (String line : lines) {
            sb.append(line.trim());
        }

        return sb.toString();
    }

    // add at 2013-04-15 by yebo PG系统对接项目 end
    // add at 2013-11-14 by yebo 亚马逊华东仓储项目 start
    /**
     * getBytesFromFile：文件转化为字节数组
     * 
     * @param file
     * @return
     * @throws Exception
     */
    public static byte[] toByte(File file) throws Exception {
        byte[] ret = null;
        try {
            if (file == null || !file.exists()) {
                return null;
            }
            FileInputStream in = new FileInputStream(file);
            ByteArrayOutputStream out = new ByteArrayOutputStream(4096);
            byte[] buff = new byte[4096];
            int n;
            while ((n = in.read(buff)) != -1) {
                out.write(buff, 0, n);
            }
            in.close();
            out.close();
            ret = out.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
        return ret;
    }

    /**
     * 把字节数组保存为文件
     * 
     * @param b
     * @param path
     * @return
     */
    public static File toFile(byte[] b, String path) throws Exception {
        File f = null;
        FileOutputStream fis = null;
        BufferedOutputStream bos = null;
        try {
            f = new File(path);
            fis = new FileOutputStream(f);
            bos = new BufferedOutputStream(fis);
            bos.write(b);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (bos != null) {
                bos.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
        return f;
    }

    /**
     * getSuffix：文件后缀名获得
     * 
     * @param file_name
     * @return
     */
    public static String getSuffix(String file_name) {
        String s = "";
        if (file_name != null) {
            int i = file_name.lastIndexOf(".");
            if (i > 0) {
                s = file_name.substring(i + 1);
            }
        }
        return s;
    }

    /**
     * contactFile：拼接文件(使用RandomAccessFile)
     * 
     * @param file_lst 预拼接文件列表
     * @param dest_path 目标文件路径
     * @return 拼接后的文件
     */
    public static File contactFile(List<String> file_lst, String dest_path) throws Exception {
        if (file_lst != null && !StringUtils.isEmpty(dest_path)) {
            java.io.FileOutputStream out = null;
            try {
                File dst = new File(dest_path);
                out = new java.io.FileOutputStream(dst);
                for (String path : file_lst) {
                    FileInputStream in = null;
                    try {
                        in = new FileInputStream(new File(path));
                        byte[] b = new byte[4096];
                        int i = 0;
                        while ((i = in.read(b)) != -1) {
                            out.write(b, 0, i);
                        }
                    } finally {
                        if (in != null) {
                            in.close();
                        }
                    }
                }
                return dst;
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            } finally {
                if (out != null) {
                    out.flush();
                    out.close();
                }
            }
        }
        return null;
    }

    // add at 2013-11-14 by yebo 亚马逊华东仓储项目 end



    private static int cnt = 0;
    public static String systemPath;

    public static synchronized String createtFileName(String ext) {
        if (ext == null)
            ext = "txt";
        java.util.Date dt = new java.util.Date(System.currentTimeMillis());
        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String fileName = fmt.format(dt);
        cnt = (cnt + 1) % 100; // You are free the set %100 to 1000,100000
        StringBuffer sBuf = new StringBuffer("0000").append(cnt);
        // Format length, the file name will be same length
        sBuf.delete(0, sBuf.length() - 2);
        fileName = fileName + "_" + sBuf.toString() + "." + ext;
        return fileName;
    }

    public static synchronized String createtFileLogName(String ext, String sign) {
        if (ext == null)
            ext = "txt";
        java.util.Date dt = new java.util.Date(System.currentTimeMillis());
        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String fileName = fmt.format(dt);
        cnt = (cnt + 1) % 100; // You are free the set %100 to 1000,100000
        StringBuffer sBuf = new StringBuffer("0000").append(cnt);
        // Format length, the file name will be same length
        sBuf.delete(0, sBuf.length() - 2);
        fileName = fileName + sign + sBuf.toString() + "." + ext;
        return fileName;
    }

    public static boolean isLinux() {
        String str = System.getProperty("os.name").toUpperCase();
        if (str.indexOf("WINDOWS") == -1) {
            return true;
        }
        return false;
    }

    public static String getSystemPath() {
        String sysPath = System.getenv("windir");
        if (!isLinux())
            systemPath = sysPath + "\\temp\\";
        else
            systemPath = "/var/tmp/";
        return systemPath;
    }

    public static String getExcelPath() {
        String sysPath = System.getenv("windir");
        if (!isLinux())
            systemPath = sysPath + "\\temp\\excel\\";
        else
            systemPath = "/var/tmp/excel/";
        return systemPath;
    }

    public static String UploadFile(File fileName) {
        String filePath = getSystemPath();
        String sendfile = null;
        try {
            InputStream stream = new FileInputStream(fileName);
            OutputStream bos = new FileOutputStream(filePath + fileName.getName());
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = stream.read(buffer, 0, 8192)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            bos.close();
            stream.close();
            sendfile = filePath + fileName.getName();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
        }
        return sendfile;
    }

    /**
     * 复制单个文件
     * 
     * @param oldPath String 原文件路径 如：c:/fqf.txt
     * @param newPath String 复制后路径 如：f:/fqf.txt
     * @return boolean
     */
    public void copyFile(String oldPath, String newPath) {
        try {
            int bytesum = 0;
            int byteread = 0;
            File oldfile = new File(oldPath);
            if (oldfile.exists()) { // 文件存在时
                InputStream inStream = new FileInputStream(oldPath); // 读入原文件
                FileOutputStream fs = new FileOutputStream(newPath);
                try {
                    byte[] buffer = new byte[1444];
                    while ((byteread = inStream.read(buffer)) != -1) {
                        bytesum += byteread; // 字节数 文件大小
                        System.out.println(bytesum);
                        fs.write(buffer, 0, byteread);
                    }
                } finally {
                    fs.close();
                    inStream.close();

                }
            }
        } catch (Exception e) {
            System.out.println("复制单个文件操作出错");
            e.printStackTrace();

        }

    }

    /**
     * 复制整个文件夹内容
     * 
     * @param oldPath String 原文件路径 如：c:/fqf
     * @param newPath String 复制后路径 如：f:/fqf/ff
     * @return boolean
     */
    public void copyFolder(String oldPath, String newPath) {

        try {
            (new File(newPath)).mkdirs(); // 如果文件夹不存在 则建立新文件夹
            File a = new File(oldPath);
            String[] file = a.list();
            File temp = null;
            for (int i = 0; i < file.length; i++) {
                if (oldPath.endsWith(File.separator)) {
                    temp = new File(oldPath + file[i]);
                } else {
                    temp = new File(oldPath + File.separator + file[i]);
                }

                if (temp.isFile()) {
                    FileInputStream input = new FileInputStream(temp);
                    FileOutputStream output = new FileOutputStream(newPath + "/" + (temp.getName()).toString());
                    byte[] b = new byte[1024 * 5];
                    int len;
                    while ((len = input.read(b)) != -1) {
                        output.write(b, 0, len);
                    }
                    output.flush();
                    output.close();
                    input.close();
                }
                if (temp.isDirectory()) {// 如果是子文件夹
                    copyFolder(oldPath + "/" + file[i], newPath + "/" + file[i]);
                }
            }
        } catch (Exception e) {
            System.out.println("复制整个文件夹内容操作出错");
            e.printStackTrace();

        }

    }
}
