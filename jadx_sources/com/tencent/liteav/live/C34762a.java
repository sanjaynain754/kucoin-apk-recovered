package com.tencent.liteav.live;

import com.tencent.rtmp.p148ui.TXCloudVideoView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.tencent.liteav.live.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C34762a {

    /* JADX INFO: renamed from: a */
    private static Method f73593a;

    /* JADX INFO: renamed from: b */
    private static Method f73594b;

    /* JADX INFO: renamed from: a */
    public static boolean m76163a(TXCloudVideoView tXCloudVideoView) {
        if (tXCloudVideoView == null) {
            return false;
        }
        try {
            Object objInvoke = f73594b.invoke(tXCloudVideoView, new Object[0]);
            if (objInvoke == null || !(objInvoke instanceof Boolean)) {
                return false;
            }
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    static {
        try {
            Method declaredMethod = TXCloudVideoView.class.getDeclaredMethod("setShowLogCallback", WeakReference.class);
            f73593a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = TXCloudVideoView.class.getDeclaredMethod("isShowLogEnabled", new Class[0]);
            f73594b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m76162a(TXCloudVideoView tXCloudVideoView, WeakReference<TXCloudVideoView.InterfaceC35208b> weakReference) {
        if (tXCloudVideoView == null) {
            return;
        }
        try {
            f73593a.invoke(tXCloudVideoView, weakReference);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
