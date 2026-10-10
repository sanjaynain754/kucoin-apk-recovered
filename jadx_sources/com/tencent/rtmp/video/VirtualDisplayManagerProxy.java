package com.tencent.rtmp.video;

import android.app.Activity;
import android.media.projection.MediaProjection;
import android.view.Surface;
import com.tencent.rtmp.video.p149a.C35218f;
import com.tencent.rtmp.video.p149a.RunnableC35221i;
import com.tencent.rtmp.video.p149a.RunnableC35222j;
import com.tencent.rtmp.video.p149a.RunnableC35223k;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes56.dex */
public class VirtualDisplayManagerProxy {
    private static volatile VirtualDisplayManagerProxy sInstance;
    private C35218f mVirtualDisplayManager = new C35218f();

    public static VirtualDisplayManagerProxy getInstance() {
        if (sInstance == null) {
            synchronized (VirtualDisplayManagerProxy.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new VirtualDisplayManagerProxy();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return sInstance;
    }

    public void registerRequestPermissionActivity(Activity activity) {
        this.mVirtualDisplayManager.m77312a(activity);
    }

    public void signalSessionRequestFinish(MediaProjection mediaProjection) {
        this.mVirtualDisplayManager.m77313a(mediaProjection);
    }

    public void startVirtualDisplaySync(Surface surface, int i11, int i12, MediaProjection mediaProjection, VirtualDisplayListener virtualDisplayListener) {
        C35218f c35218f = this.mVirtualDisplayManager;
        BaseBridge.printLog("VirtualDisplayManager", "startVirtualDisplaySync, surface:" + surface + ", width:" + i11 + ", height:" + i12 + ", mediaProjection: " + mediaProjection + ", listener:" + virtualDisplayListener + ". version:0.0.0.0");
        c35218f.f75454c.m77303b(RunnableC35221i.m77319a(c35218f, surface, i11, i12, mediaProjection, virtualDisplayListener));
    }

    public void stopVirtualDisplaySync(Surface surface) {
        C35218f c35218f = this.mVirtualDisplayManager;
        BaseBridge.printLog("VirtualDisplayManager", "stopVirtualDisplaySync, surface:".concat(String.valueOf(surface)));
        c35218f.f75454c.m77303b(RunnableC35222j.m77320a(c35218f, surface));
    }

    public void unRegisterRequestPermissionActivity(Activity activity) {
        C35218f c35218f = this.mVirtualDisplayManager;
        BaseBridge.printLog("VirtualDisplayManager", "UnRegister request permission activity:".concat(String.valueOf(activity)));
        WeakReference<Activity> weakReference = c35218f.f75452a;
        if (weakReference == null || weakReference.get() != activity) {
            return;
        }
        c35218f.f75452a = null;
    }

    public void updateVirtualDisplaySizeSync(Surface surface, int i11, int i12, VirtualDisplayListener virtualDisplayListener) {
        C35218f c35218f = this.mVirtualDisplayManager;
        BaseBridge.printLog("VirtualDisplayManager", "updateVirtualDisplaySizeSync, surface:" + surface + ", width:" + i11 + ", height:" + i12 + ", listener:" + virtualDisplayListener);
        c35218f.f75454c.m77303b(RunnableC35223k.m77321a(c35218f, surface, i11, i12, virtualDisplayListener));
    }

    private VirtualDisplayManagerProxy() {
    }
}
