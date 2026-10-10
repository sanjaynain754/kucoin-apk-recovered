package com.tencent.imsdk.manager;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class CustomServerInfo {
    public List<ServerAddress> longconnectionAddressList = new ArrayList();
    public List<ServerAddress> shortconnectionAddressList = new ArrayList();
    public String serverPublicKey = "";

    public static class ServerAddress {

        /* JADX INFO: renamed from: ip */
        public String f73266ip = "";
        public int port = 0;
        public boolean isIPv6 = false;
        public boolean isQuic = false;
        public boolean isTLS = false;
    }
}
