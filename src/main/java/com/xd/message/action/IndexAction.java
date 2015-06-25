package com.xd.message.action;


import com.bastengao.struts2.freeroute.annotation.Route;

/**
 * Created by michael on 15-6-24.
 */

public class IndexAction {

    @Route(value = "/blueplanet/device/deleteDevice", params = {"deviceId", "verifyCode"})
    public String index() {
        return "";
    }

}
