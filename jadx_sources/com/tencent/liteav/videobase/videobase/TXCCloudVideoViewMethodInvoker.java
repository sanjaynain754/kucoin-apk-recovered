package com.tencent.liteav.videobase.videobase;

import android.view.TextureView;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.rtmp.p148ui.AndroidViewEventListener;
import com.tencent.rtmp.p148ui.TXCloudVideoView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class TXCCloudVideoViewMethodInvoker {
    private static final String TAG = "TXCCloudVideoViewMethodInvoker";

    private static Object callMethod(TXCloudVideoView tXCloudVideoView, String str, Class<?>[] clsArr, Object... objArr) {
        if (tXCloudVideoView == null) {
            LiteavLog.m76093w(TAG, str + ",TXCloudVideoView is null.");
            return null;
        }
        try {
            Method declaredMethod = TXCloudVideoView.class.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(tXCloudVideoView, objArr);
        } catch (Throwable th2) {
            LiteavLog.m76084e(TAG, str + ",Exception:", th2);
            return null;
        }
    }

    public static TextureView getFreeTextureView(TXCloudVideoView tXCloudVideoView) {
        Object objCallMethod = callMethod(tXCloudVideoView, "getFreeInnerTextureView", new Class[0], new Object[0]);
        if (objCallMethod instanceof TextureView) {
            return (TextureView) objCallMethod;
        }
        return null;
    }

    public static TextureView getTextureViewSetByUser(TXCloudVideoView tXCloudVideoView) {
        Object objCallMethod = callMethod(tXCloudVideoView, "getTextureViewSetByUser", new Class[0], new Object[0]);
        if (objCallMethod instanceof TextureView) {
            return (TextureView) objCallMethod;
        }
        return null;
    }

    public static void addViewInternal(TXCloudVideoView tXCloudVideoView, TextureView textureView) {
        callMethod(tXCloudVideoView, "addViewInternal", new Class[]{TextureView.class}, textureView);
    }

    public static Object getGLContextFromView(DisplayTarget displayTarget) {
        if (displayTarget == null || displayTarget.getTXCloudVideoView() == null) {
            return null;
        }
        return displayTarget.getTXCloudVideoView().getOpenGLContext();
    }

    public static void notifyFirstFrameRendered(TXCloudVideoView tXCloudVideoView, TextureView textureView) {
        callMethod(tXCloudVideoView, "notifyFirstFrameRendered", new Class[]{TextureView.class}, textureView);
    }

    public static void removeViewInternal(TXCloudVideoView tXCloudVideoView, TextureView textureView, boolean z11) {
        callMethod(tXCloudVideoView, "removeViewInternal", new Class[]{TextureView.class, Boolean.TYPE}, textureView, Boolean.valueOf(z11));
    }

    public static void setAndroidViewEventListener(TXCloudVideoView tXCloudVideoView, AndroidViewEventListener androidViewEventListener) {
        callMethod(tXCloudVideoView, "setAndroidViewEventListener", new Class[]{AndroidViewEventListener.class}, androidViewEventListener);
    }

    public static void setBackgroundColorForInternalView(TXCloudVideoView tXCloudVideoView, int i11) {
        callMethod(tXCloudVideoView, "setBackgroundColorForInternalView", new Class[]{Integer.TYPE}, Integer.valueOf(i11));
    }

    public static void setTouchToFocusEnabled(TXCloudVideoView tXCloudVideoView, boolean z11) {
        callMethod(tXCloudVideoView, "setTouchToFocusEnabled", new Class[]{Boolean.TYPE}, Boolean.valueOf(z11));
    }

    public static void setZoomEnabled(TXCloudVideoView tXCloudVideoView, boolean z11) {
        callMethod(tXCloudVideoView, "setZoomEnabled", new Class[]{Boolean.TYPE}, Boolean.valueOf(z11));
    }

    public static void showFocusView(TXCloudVideoView tXCloudVideoView, int i11, int i12, int i13, int i14) {
        Class cls = Integer.TYPE;
        callMethod(tXCloudVideoView, "showFocusView", new Class[]{cls, cls, cls, cls}, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }
}
