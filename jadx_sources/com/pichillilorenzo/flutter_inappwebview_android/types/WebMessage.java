package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class WebMessage {
    public String data;
    public List<WebMessagePort> ports;

    public void dispose() {
        List<WebMessagePort> list = this.ports;
        if (list != null) {
            list.clear();
        }
    }

    public WebMessage(String str, List<WebMessagePort> list) {
        this.data = str;
        this.ports = list;
    }
}
