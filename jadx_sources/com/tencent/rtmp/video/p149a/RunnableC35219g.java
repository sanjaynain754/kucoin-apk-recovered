package com.tencent.rtmp.video.p149a;

import android.app.Activity;
import com.tencent.rtmp.video.BaseBridge;
import com.tencent.rtmp.video.TXScreenCapture;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.tencent.rtmp.video.a.g */
/* JADX INFO: loaded from: classes56.dex */
final /* synthetic */ class RunnableC35219g implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C35218f f75467a;

    /* JADX INFO: renamed from: a */
    public static Runnable m77317a(C35218f c35218f) {
        return new RunnableC35219g(c35218f);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C35218f c35218f = this.f75467a;
        WeakReference<Activity> weakReference = c35218f.f75452a;
        TXScreenCapture.TXScreenCaptureAssistantActivity tXScreenCaptureAssistantActivity = weakReference != null ? (TXScreenCapture.TXScreenCaptureAssistantActivity) weakReference.get() : null;
        if (tXScreenCaptureAssistantActivity != null && !tXScreenCaptureAssistantActivity.isStop()) {
            BaseBridge.printLog("VirtualDisplayManager", "Activity is already started:".concat(String.valueOf(tXScreenCaptureAssistantActivity)));
            return;
        }
        if (c35218f.f75456e != null) {
            BaseBridge.printLog("VirtualDisplayManager", "MediaProjection is already started:" + c35218f.f75456e);
        } else {
            if (tXScreenCaptureAssistantActivity != null) {
                BaseBridge.printLog("VirtualDisplayManager", "Finish old activity:".concat(String.valueOf(tXScreenCaptureAssistantActivity)));
                tXScreenCaptureAssistantActivity.finish();
            }
            C35218f.m77309a();
        }
    }

    private RunnableC35219g(C35218f c35218f) {
        this.f75467a = c35218f;
    }
}
