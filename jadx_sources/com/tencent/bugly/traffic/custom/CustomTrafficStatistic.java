package com.tencent.bugly.traffic.custom;

import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class CustomTrafficStatistic {

    /* JADX INFO: renamed from: c */
    public static final String f72669c = "CustomTrafficStatistic";

    /* JADX INFO: renamed from: d */
    public static volatile boolean f72670d = false;

    /* JADX INFO: renamed from: e */
    public static volatile CustomTrafficStatistic f72671e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f72672f = false;

    /* JADX INFO: renamed from: g */
    public static final int f72673g = 100;

    /* JADX INFO: renamed from: h */
    public static final int f72674h = 60000;

    /* JADX INFO: renamed from: a */
    public final ConcurrentLinkedQueue<SocketInfo> f72675a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: b */
    public final ConcurrentLinkedQueue<SocketInfo> f72676b = new ConcurrentLinkedQueue<>();

    public static CustomTrafficStatistic getInstance() {
        if (f72671e == null) {
            synchronized (CustomTrafficStatistic.class) {
                try {
                    if (f72671e == null) {
                        f72671e = new CustomTrafficStatistic();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        f72672f = ConfigProxy.INSTANCE.getConfig().m77072c("traffic_detail").config.f70122g;
        return f72671e;
    }

    public void addHttpToQueue(SocketInfo socketInfo) {
        if (f72672f) {
            this.f72675a.add(socketInfo);
        } else {
            Logger.INSTANCE.mo77132i(f72669c, "addHttpToQueue failed");
        }
    }

    public ConcurrentLinkedQueue<SocketInfo> getHttpQueue() {
        return this.f72675a;
    }

    public ConcurrentLinkedQueue<SocketInfo> getSocketToQueue() {
        return this.f72676b;
    }
}
