package org.xfs.test.study.xstream.mode;

import java.io.Serializable;
import java.util.List;


@SuppressWarnings("serial")
public class G7RequestModel implements Serializable {
    private String appkey;
    private String appsecret;
    private String regname;

    private List<Item> items;

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret;
    }

    public String getRegname() {
        return regname;
    }

    public void setRegname(String regname) {
        this.regname = regname;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }


}
