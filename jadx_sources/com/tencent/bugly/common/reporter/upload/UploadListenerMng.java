package com.tencent.bugly.common.reporter.upload;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class UploadListenerMng {

    /* JADX INFO: renamed from: a */
    public static List<IUploadListener> f68515a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a */
    public static void m72171a(String str, String str2) {
        Iterator<IUploadListener> it = f68515a.iterator();
        while (it.hasNext()) {
            it.next().onReportFailure(str, str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m72172b(String str, String str2) {
        Iterator<IUploadListener> it = f68515a.iterator();
        while (it.hasNext()) {
            it.next().onReportSuccess(str, str2);
        }
    }

    public static void registerListener(IUploadListener iUploadListener) {
        if (f68515a.contains(iUploadListener)) {
            return;
        }
        f68515a.add(iUploadListener);
    }
}
