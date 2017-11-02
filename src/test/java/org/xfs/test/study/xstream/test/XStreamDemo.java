package org.xfs.test.study.xstream.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.xfs.core.util.string.StringUtil;
import org.xfs.test.study.xstream.mode.DataModel;
import org.xfs.test.study.xstream.mode.G7RequestModel;
import org.xfs.test.study.xstream.mode.Item;

import com.thoughtworks.xstream.XStream;


public class XStreamDemo {

    public static void main(String[] args) throws Exception {
        String xml = read("E:\\xml\\g7.xml", "UTF-8");
        // System.out.println("xml:" + xml);


        XStream xstream = new XStream();
        xstream.alias("root", DataModel.class);
        xstream.alias("", G7RequestModel.class);
        // xstream.
        // xstream.alias("items", Item.class);
        xstream.alias("item", Item.class);

        // String toXM2 = xstream.toXML(createG7Object());
        xstream.addImplicitCollection(Item.class, "list", G7RequestModel.class);

        String toXMl = xstream.toXML(createData());

        // DataModel g8 = (DataModel) xstream.fromXML(xml);
        // System.out.println("toXM1:" + toXM);
        System.out.println("toXM2:" + toXMl);

        // System.out.println(g8.getData().getItems().get(2).getName() + "object:" + g8.getData().getAppsecret());

        // System.out.println(g8.getItems().get(2).getName() + "object:" + g8.getAppsecret());
        // System.out.println(xstream.toXML(g7).replace("org.xfs.test.study.xstream.mode.G7RequestModel", "root"));

    }

    /**
     * 制定编码读取文件
     * 
     * @param dir 文件路径
     * @param charset 编码格式
     * @return
     * @throws Exception
     */
    public static String read(String dir, String charset) throws Exception {
        StringBuilder buf = new StringBuilder();
        FileInputStream fis = new FileInputStream(new File(dir));
        InputStreamReader isr = null;
        if (StringUtil.isEmpty(charset)) {
            isr = new InputStreamReader(fis);
        } else {
            isr = new InputStreamReader(fis, charset);
        }
        BufferedReader br = new BufferedReader(isr);
        try {
            String str = null;
            while ((str = br.readLine()) != null) {
                buf.append(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            fis.close();
            isr.close();
            br.close();
        }
        return buf.toString();

    }

    public static G7RequestModel createG7Object() {
        G7RequestModel g7 = new G7RequestModel();
        g7.setAppkey("6952bcd6-b18b-4cf6-b2d4-42eff28fce07");
        g7.setAppsecret("7c67d096-734b-45cf-b279-852c0bd8474f");
        g7.setRegname("沪DB0821");


        List<Item> items = new ArrayList<Item>();
        Item item1 = new Item();
        item1.setCode("a");
        item1.setName("AAA");
        Item item2 = new Item();
        item2.setCode("b");
        item2.setName("BBB");
        items.add(item2);
        items.add(item1);
        g7.setItems(items);


        return g7;
    }

    public static DataModel createData() {
        DataModel data = new DataModel();
        data.setData(createG7Object());
        return data;
    }
}
