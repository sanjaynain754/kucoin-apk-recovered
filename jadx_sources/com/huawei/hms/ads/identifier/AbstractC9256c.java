package com.huawei.hms.ads.identifier;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.ads.identifier.c */
/* JADX INFO: loaded from: classes56.dex */
public abstract class AbstractC9256c {

    /* JADX INFO: renamed from: a */
    public static final ThreadPoolExecutor f13265a = new ThreadPoolExecutor(0, 3, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(2048), new ThreadPoolExecutor.DiscardPolicy());
}
