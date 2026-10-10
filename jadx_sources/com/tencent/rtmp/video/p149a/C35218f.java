package com.tencent.rtmp.video.p149a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.tencent.liteav.audio2.SystemLoopbackRecorder2;
import com.tencent.rtmp.video.BaseBridge;
import com.tencent.rtmp.video.ScreenCaptureService;
import com.tencent.rtmp.video.TXScreenCapture;
import com.tencent.rtmp.video.VirtualDisplayListener;
import com.tencent.rtmp.video.VirtualDisplayWrapper;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.rtmp.video.a.f */
/* JADX INFO: loaded from: classes56.dex */
public final class C35218f {

    /* JADX INFO: renamed from: e */
    MediaProjection f75456e;

    /* JADX INFO: renamed from: a */
    public WeakReference<Activity> f75452a = null;

    /* JADX INFO: renamed from: d */
    final Map<Surface, a> f75455d = new HashMap();

    /* JADX INFO: renamed from: f */
    boolean f75457f = false;

    /* JADX INFO: renamed from: g */
    final Runnable f75458g = RunnableC35219g.m77317a(this);

    /* JADX INFO: renamed from: h */
    final Runnable f75459h = RunnableC35220h.m77318a(this);

    /* JADX INFO: renamed from: i */
    final MediaProjection.Callback f75460i = new AnonymousClass1();

    /* JADX INFO: renamed from: b */
    final Handler f75453b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    public final C35213a f75454c = new C35213a();

    /* JADX INFO: renamed from: com.tencent.rtmp.video.a.f$1, reason: invalid class name */
    public class AnonymousClass1 extends MediaProjection.Callback {
        public AnonymousClass1() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m77316a(C35218f c35218f) {
            HashMap map = new HashMap(c35218f.f75455d);
            c35218f.f75455d.clear();
            for (a aVar : map.values()) {
                VirtualDisplayListener virtualDisplayListener = aVar.f75465d;
                if (virtualDisplayListener != null) {
                    if (aVar.f75466e != null) {
                        virtualDisplayListener.onCaptureError();
                    } else {
                        virtualDisplayListener.onStartFinish(false, false);
                    }
                }
            }
            c35218f.m77315c();
        }

        @Override // android.media.projection.MediaProjection.Callback
        public final void onStop() {
            BaseBridge.printLog("VirtualDisplayManager", "MediaProjection session is no longer valid");
            C35218f c35218f = C35218f.this;
            c35218f.f75454c.m77301a(RunnableC35225m.m77323a(c35218f));
        }
    }

    /* JADX INFO: renamed from: com.tencent.rtmp.video.a.f$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public Surface f75462a;

        /* JADX INFO: renamed from: b */
        public int f75463b;

        /* JADX INFO: renamed from: c */
        public int f75464c;

        /* JADX INFO: renamed from: d */
        public VirtualDisplayListener f75465d;

        /* JADX INFO: renamed from: e */
        public VirtualDisplayWrapper f75466e;

        private a() {
        }

        public /* synthetic */ a(byte b11) {
            this();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m77309a() {
        Context appContext = BaseBridge.getAppContext();
        if (appContext == null) {
            BaseBridge.printLog("VirtualDisplayManager", "context is null!");
            return;
        }
        Intent intent = new Intent(appContext, (Class<?>) TXScreenCapture.TXScreenCaptureAssistantActivity.class);
        intent.addFlags(268435456);
        appContext.startActivity(intent);
    }

    /* JADX INFO: renamed from: b */
    public final void m77314b() {
        for (a aVar : this.f75455d.values()) {
            if (aVar.f75466e == null) {
                try {
                    aVar.f75466e = new VirtualDisplayWrapper(this.f75456e.createVirtualDisplay("TXCScreenCapture", aVar.f75463b, aVar.f75464c, 1, 1, aVar.f75462a, null, null));
                    BaseBridge.printLog("VirtualDisplayManager", "create VirtualDisplay " + aVar.f75466e);
                    VirtualDisplayListener virtualDisplayListener = aVar.f75465d;
                    if (virtualDisplayListener != null) {
                        virtualDisplayListener.onVirtualDisplayCreate(aVar.f75466e);
                        aVar.f75465d.onStartFinish(true, false);
                    }
                } catch (Throwable th2) {
                    BaseBridge.printLog("VirtualDisplayManager", "create VirtualDisplay error ".concat(String.valueOf(th2)));
                    VirtualDisplayListener virtualDisplayListener2 = aVar.f75465d;
                    if (virtualDisplayListener2 != null) {
                        virtualDisplayListener2.onStartFinish(false, false);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m77311d() {
        BaseBridge.printLog("VirtualDisplayManager", "stopScreenCaptureService");
        try {
            Context appContext = BaseBridge.getAppContext();
            if (appContext == null) {
                BaseBridge.printLog("VirtualDisplayManager", "context is null!");
            } else {
                appContext.stopService(new Intent(appContext, (Class<?>) ScreenCaptureService.class));
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m77315c() {
        if (this.f75455d.isEmpty()) {
            BaseBridge.printLog("VirtualDisplayManager", "Stop media projection session " + this.f75456e);
            if (this.f75456e != null) {
                m77310b(null);
                try {
                    this.f75456e.unregisterCallback(this.f75460i);
                    this.f75456e.stop();
                } catch (Throwable th2) {
                    BaseBridge.printLog("VirtualDisplayManager", "stop media projection session with exception ".concat(String.valueOf(th2)));
                }
                this.f75456e = null;
            }
            m77311d();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m77313a(MediaProjection mediaProjection) {
        this.f75454c.m77301a(RunnableC35224l.m77322a(this, mediaProjection));
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m77312a(Activity activity) {
        BaseBridge.printLog("VirtualDisplayManager", "Register request permission activity:".concat(String.valueOf(activity)));
        this.f75452a = new WeakReference<>(activity);
    }

    /* JADX INFO: renamed from: b */
    public static void m77310b(MediaProjection mediaProjection) {
        try {
            try {
                int i11 = SystemLoopbackRecorder2.f73342a;
                SystemLoopbackRecorder2.class.getMethod("notifyMediaProjectionState", MediaProjection.class).invoke(null, mediaProjection);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e11) {
                e = e11;
                BaseBridge.printLog("VirtualDisplayManager", "fail to send media projection session " + e.getMessage());
            }
        } catch (IllegalAccessException e12) {
            e = e12;
            BaseBridge.printLog("VirtualDisplayManager", "fail to send media projection session " + e.getMessage());
        } catch (NoSuchMethodException e13) {
            e = e13;
            BaseBridge.printLog("VirtualDisplayManager", "fail to send media projection session " + e.getMessage());
        } catch (InvocationTargetException e14) {
            e = e14;
            BaseBridge.printLog("VirtualDisplayManager", "fail to send media projection session " + e.getMessage());
        }
    }
}
