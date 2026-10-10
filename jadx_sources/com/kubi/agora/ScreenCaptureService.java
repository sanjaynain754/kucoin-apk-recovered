package com.kubi.agora;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.provider.Settings;
import androidx.browser.trusted.C0671f;
import androidx.media3.common.util.C2818i;
import com.kubi.sdk.BaseApplication;
import com.kubi.widget.web.ui.KWebContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: ScreenCaptureService.kt */
/* JADX INFO: loaded from: classes63.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0002J\b\u0010\u0013\u001a\u00020\rH\u0002J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/agora/ScreenCaptureService;", "Landroid/app/Service;", "<init>", "()V", "floatingWindowManager", "Lcom/kubi/agora/FloatingWindowManager;", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", "startId", "requestScreenShare", "", "tryInitFloatingWindowManager", "onBind", "Landroid/os/IBinder;", "onDestroy", "hideFloatingWindow", "createNotificationChannel", "dispatchProjectionReady", "projection", "Landroid/media/projection/MediaProjection;", "dispatchProjectionError", "message", "", "ProjectionReadyCallback", "Companion", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ScreenCaptureService extends Service {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f15296c = new Companion(null);

    /* JADX INFO: renamed from: d */
    public static boolean f15297d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public static volatile InterfaceC9383a f15298e;

    /* JADX INFO: renamed from: f */
    public static volatile int f15299f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public static volatile Intent f15300g;

    /* JADX INFO: renamed from: b */
    @Nullable
    public FloatingWindowManager f15301b;

    /* JADX INFO: compiled from: ScreenCaptureService.kt */
    @Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020%J\u0018\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010\u001fJ\u0006\u0010*\u001a\u00020%J\u0010\u0010+\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010-J\u000e\u0010.\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006/"}, m90084d2 = {"Lcom/kubi/agora/ScreenCaptureService$Companion;", "", "<init>", "()V", "ACTION_SHOW_FLOATING", "", "ACTION_STOP_FLOATING", "ACTION_START_SCREEN_SHARE", "ACTION_STOP_SCREEN_SHARE", "TAG", "CHANNEL_ID", "NOTIFICATION_ID", "", "NOTIFICATION_CHANNEL_NAME", "isFloatWindowShowing", "", "()Z", "setFloatWindowShowing", "(Z)V", "pendingCallback", "Lcom/kubi/agora/ScreenCaptureService$ProjectionReadyCallback;", "getPendingCallback$AgoraLib_googleRelease", "()Lcom/kubi/agora/ScreenCaptureService$ProjectionReadyCallback;", "setPendingCallback$AgoraLib_googleRelease", "(Lcom/kubi/agora/ScreenCaptureService$ProjectionReadyCallback;)V", "pendingResultCode", "getPendingResultCode$AgoraLib_googleRelease", "()I", "setPendingResultCode$AgoraLib_googleRelease", "(I)V", "pendingResultData", "Landroid/content/Intent;", "getPendingResultData$AgoraLib_googleRelease", "()Landroid/content/Intent;", "setPendingResultData$AgoraLib_googleRelease", "(Landroid/content/Intent;)V", "stopFloating", "", "startFloatingWithWebView", "startShareScreen", "resultCode", "data", "stopShareScreen", "canDrawOverlays", "context", "Landroid/content/Context;", "overlayPermissionIntent", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final Intent overlayPermissionIntent(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
        }

        public final void startFloatingWithWebView() {
            Context applicationContext = BaseApplication.INSTANCE.get().getApplicationContext();
            Intent intent = new Intent(applicationContext, (Class<?>) ScreenCaptureService.class);
            intent.setAction("io.agora.action.ACTION_SHOW_FLOATING");
            applicationContext.startService(intent);
        }

        public final void startShareScreen(int resultCode, @Nullable Intent data) {
            C44128b.m97259c("ScreenCaptureService", "[startShareScreen] resultCode=" + resultCode + ", data=" + data);
            Context applicationContext = BaseApplication.INSTANCE.get().getApplicationContext();
            setPendingResultCode$AgoraLib_googleRelease(resultCode);
            setPendingResultData$AgoraLib_googleRelease(data);
            Intent intent = new Intent(applicationContext, (Class<?>) ScreenCaptureService.class);
            intent.setAction("io.agora.action.ACTION_START_SCREEN_SHARE");
            if (Build.VERSION.SDK_INT >= 26) {
                applicationContext.startForegroundService(intent);
            } else {
                applicationContext.startService(intent);
            }
        }

        public final void stopFloating() {
            Context applicationContext = BaseApplication.INSTANCE.get().getApplicationContext();
            Intent intent = new Intent(applicationContext, (Class<?>) ScreenCaptureService.class);
            intent.setAction("io.agora.action.ACTION_STOP_FLOATING");
            applicationContext.startService(intent);
        }

        public final void stopShareScreen() {
            Context applicationContext = BaseApplication.INSTANCE.get().getApplicationContext();
            Intent intent = new Intent(applicationContext, (Class<?>) ScreenCaptureService.class);
            intent.setAction("io.agora.action.ACTION_STOP_SCREEN_SHARE");
            applicationContext.startService(intent);
        }

        public final boolean canDrawOverlays(@Nullable Context context) {
            if (Settings.canDrawOverlays(context)) {
                return true;
            }
            return false;
        }

        @Nullable
        public final InterfaceC9383a getPendingCallback$AgoraLib_googleRelease() {
            return ScreenCaptureService.f15298e;
        }

        public final int getPendingResultCode$AgoraLib_googleRelease() {
            return ScreenCaptureService.f15299f;
        }

        @Nullable
        public final Intent getPendingResultData$AgoraLib_googleRelease() {
            return ScreenCaptureService.f15300g;
        }

        public final boolean isFloatWindowShowing() {
            return ScreenCaptureService.f15297d;
        }

        public final void setFloatWindowShowing(boolean z11) {
            ScreenCaptureService.f15297d = z11;
        }

        public final void setPendingCallback$AgoraLib_googleRelease(@Nullable InterfaceC9383a interfaceC9383a) {
            ScreenCaptureService.f15298e = interfaceC9383a;
        }

        public final void setPendingResultCode$AgoraLib_googleRelease(int i11) {
            ScreenCaptureService.f15299f = i11;
        }

        public final void setPendingResultData$AgoraLib_googleRelease(@Nullable Intent intent) {
            ScreenCaptureService.f15300g = intent;
        }
    }

    /* JADX INFO: renamed from: com.kubi.agora.ScreenCaptureService$a */
    /* JADX INFO: compiled from: ScreenCaptureService.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/agora/ScreenCaptureService$ProjectionReadyCallback;", "", "onProjectionReady", "", "projection", "Landroid/media/projection/MediaProjection;", "onProjectionError", "message", "", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC9383a {
        /* JADX INFO: renamed from: a */
        void mo14884a(@NotNull String str);

        /* JADX INFO: renamed from: b */
        void mo14885b(@NotNull MediaProjection mediaProjection);
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        if (intent == null) {
            stopSelf();
            return 2;
        }
        String action = intent.getAction();
        if (Intrinsics.areEqual("io.agora.action.ACTION_START_SCREEN_SHARE", action)) {
            m14900o();
        } else if (Intrinsics.areEqual("io.agora.action.ACTION_SHOW_FLOATING", action)) {
            f15297d = true;
            KWebContainer kWebContainerM14918l = AgoraShareScreenManager.f15305a.m14918l();
            if (kWebContainerM14918l != null) {
                m14901p();
                FloatingWindowManager floatingWindowManager = this.f15301b;
                if (floatingWindowManager != null) {
                    floatingWindowManager.m14866l(kWebContainerM14918l, new Runnable() { // from class: com.kubi.agora.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            ScreenCaptureService.m14895n();
                        }
                    });
                }
            }
        } else if (Intrinsics.areEqual("io.agora.action.ACTION_STOP_FLOATING", action)) {
            m14899m();
        } else if (Intrinsics.areEqual("io.agora.action.ACTION_STOP_SCREEN_SHARE", action)) {
            stopForeground(1);
            stopSelf();
        }
        return 2;
    }

    /* JADX INFO: renamed from: n */
    public static final void m14895n() {
        AgoraScreenShareWebActivity.Companion.jumpToAgoraScreenSharePage$default(AgoraScreenShareWebActivity.f15187x, null, 1, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m14896j() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        C2818i.m2978a();
        NotificationChannel notificationChannelM1622a = C0671f.m1622a("screen_capture_channel", "Screen Capture", 2);
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannelM1622a);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m14897k(String str) {
        InterfaceC9383a interfaceC9383a = f15298e;
        if (interfaceC9383a != null) {
            f15298e = null;
            interfaceC9383a.mo14884a(str);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m14898l(MediaProjection mediaProjection) {
        InterfaceC9383a interfaceC9383a = f15298e;
        if (interfaceC9383a != null) {
            f15298e = null;
            interfaceC9383a.mo14885b(mediaProjection);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m14899m() {
        FloatingWindowManager floatingWindowManager = this.f15301b;
        if (floatingWindowManager != null) {
            floatingWindowManager.m14863i();
            floatingWindowManager.m14864j();
        }
        f15297d = false;
    }

    /* JADX INFO: renamed from: o */
    public final void m14900o() {
        try {
            m14896j();
            if (Build.VERSION.SDK_INT >= 29) {
                startForeground(1001, ScreenCaptureNotificationFactory.f15332a.m14951a(this, "screen_capture_channel"), 32);
            } else {
                startForeground(1001, ScreenCaptureNotificationFactory.f15332a.m14951a(this, "screen_capture_channel"));
            }
            int i11 = f15299f;
            Intent intent = f15300g;
            f15299f = 0;
            f15300g = null;
            if (intent == null) {
                C44128b.m97259c("ScreenCaptureService", "[tryScreenShare] resultData is null");
                m14897k("MediaProjection resultData is null");
                stopSelf();
            } else {
                Object systemService = getSystemService("media_projection");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
                MediaProjection mediaProjection = ((MediaProjectionManager) systemService).getMediaProjection(i11, intent);
                Intrinsics.checkNotNull(mediaProjection);
                m14898l(mediaProjection);
            }
        } catch (Exception e11) {
            C44128b.m97262f("ScreenCaptureService", "[tryScreenShare] failed: " + e11.getMessage(), e11);
            String message = e11.getMessage();
            if (message == null) {
                message = "Unknown projection error";
            }
            m14897k(message);
            stopSelf();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m14901p() {
        if (this.f15301b == null) {
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            this.f15301b = new FloatingWindowManager(applicationContext);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        m14899m();
        super.onDestroy();
    }
}
