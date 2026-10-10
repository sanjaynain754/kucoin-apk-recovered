package com.datavisor.vangogh.util.network;

import java.net.InetAddress;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import okhttp3.Dns;

/* JADX INFO: loaded from: classes34.dex */
public class AnyCastDNS implements Dns {
    Map<String, String> anyCastDNS;

    @Override // okhttp3.Dns
    public List<InetAddress> lookup(String str) {
        Map<String, String> map = this.anyCastDNS;
        return (map == null || !map.containsKey(str)) ? Dns.SYSTEM.lookup(str) : Collections.singletonList(InetAddress.getByName(this.anyCastDNS.get(str)));
    }

    public AnyCastDNS(Map<String, String> map) {
        this.anyCastDNS = map;
    }
}
