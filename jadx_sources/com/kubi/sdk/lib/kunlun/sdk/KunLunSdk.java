package com.kubi.sdk.lib.kunlun.sdk;

import android.app.Application;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.config.RemoteConfig;
import com.kubi.sdk.lib.kunlun.sdk.KunLunSdk;
import com.kubi.sdk.lib.kunlun.sdk.config.KunlunRemoteConfig;
import com.kubi.sdk.lib.kunlun.sdk.handler.KunlunRecorder;
import com.kubi.sdk.lib.kunlun.sdk.handler.KunlunReporter;
import com.kubi.utils.C27100x0;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p352iz.InterfaceC40193a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KunLunSdk.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0003J\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u0003J\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0003J\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0003J)\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u0003R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010&\u001a\u0004\b \u0010'\"\u0004\b(\u0010)R\"\u00101\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010:\u001a\u0002078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b+\u00109R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010<¨\u0006>"}, m90084d2 = {"Lcom/kubi/sdk/lib/kunlun/sdk/KunLunSdk;", "", "<init>", "()V", "Landroid/app/Application;", "context", "Liz/a;", "configProvider", "", "isDebug", "", "g", "(Landroid/app/Application;Liz/a;Z)V", CmcdData.Factory.STREAM_TYPE_LIVE, "n", "k", "m", "", "eventName", "", "labels", "q", "(Ljava/lang/String;Ljava/util/Map;)V", "", "values", "o", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "i", "Lcom/kubi/sdk/lib/kunlun/sdk/handler/KunlunRecorder;", "b", "Lcom/kubi/sdk/lib/kunlun/sdk/handler/KunlunRecorder;", "recorder", "c", "Landroid/app/Application;", "d", "()Landroid/app/Application;", "setContext$kunlun_sdk_release", "(Landroid/app/Application;)V", "Liz/a;", "()Liz/a;", "setConfigProvider$kunlun_sdk_release", "(Liz/a;)V", "Lcom/kubi/sdk/lib/kunlun/sdk/config/KunlunRemoteConfig;", "e", "Lcom/kubi/sdk/lib/kunlun/sdk/config/KunlunRemoteConfig;", "f", "()Lcom/kubi/sdk/lib/kunlun/sdk/config/KunlunRemoteConfig;", "j", "(Lcom/kubi/sdk/lib/kunlun/sdk/config/KunlunRemoteConfig;)V", "remoteConfig", "Z", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Z", "setDebug$kunlun_sdk_release", "(Z)V", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ExecutorService;", "()Ljava/util/concurrent/ExecutorService;", "eventExecutor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "collectStatus", "kunlun-sdk_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class KunLunSdk {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static Application context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static InterfaceC40193a configProvider;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static boolean isDebug;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KunLunSdk f46915a = new KunLunSdk();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final KunlunRecorder recorder = new KunlunRecorder();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static KunlunRemoteConfig remoteConfig = new KunlunRemoteConfig(0, false, 0, 0, 0, 0, 63, null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final ExecutorService eventExecutor = C42917g.m94140f("kunlun-TaskExecuteThread");

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static AtomicBoolean collectStatus = new AtomicBoolean(true);

    /* JADX INFO: renamed from: p */
    public static final void m57115p(String eventName, Map values, Map labels) {
        Intrinsics.checkNotNullParameter(eventName, "$eventName");
        Intrinsics.checkNotNullParameter(values, "$values");
        Intrinsics.checkNotNullParameter(labels, "$labels");
        recorder.m57162c(eventName, values, labels);
    }

    /* JADX INFO: renamed from: r */
    public static final void m57116r(String eventName, Map labels) {
        Intrinsics.checkNotNullParameter(eventName, "$eventName");
        Intrinsics.checkNotNullParameter(labels, "$labels");
        recorder.m57163d(eventName, labels);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final InterfaceC40193a m57117c() {
        return configProvider;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Application m57118d() {
        return context;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final ExecutorService m57119e() {
        return eventExecutor;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final KunlunRemoteConfig m57120f() {
        return remoteConfig;
    }

    /* JADX INFO: renamed from: g */
    public final void m57121g(@NotNull Application context2, @NotNull InterfaceC40193a configProvider2, boolean isDebug2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(configProvider2, "configProvider");
        context = context2;
        configProvider = configProvider2;
        isDebug = isDebug2;
        C27100x0.m66923d(new Function0<Unit>() { // from class: com.kubi.sdk.lib.kunlun.sdk.KunLunSdk$init$1
            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                KunlunRemoteConfig kunlunRemoteConfig = (KunlunRemoteConfig) RemoteConfig.m20457a("kunlun_sdk_android", KunlunRemoteConfig.class);
                if (kunlunRemoteConfig != null) {
                    KunLunSdk.f46915a.m57124j(kunlunRemoteConfig);
                }
            }
        });
        if (remoteConfig.isKunlunOpen()) {
            KunlunReporter.f46937a.m57174j(recorder);
            m57123i();
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m57122h() {
        return isDebug;
    }

    /* JADX INFO: renamed from: i */
    public final void m57123i() {
        Application application = context;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new KunlunActivityLifecycleCallbacks());
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m57124j(@NotNull KunlunRemoteConfig kunlunRemoteConfig) {
        Intrinsics.checkNotNullParameter(kunlunRemoteConfig, "<set-?>");
        remoteConfig = kunlunRemoteConfig;
    }

    /* JADX INFO: renamed from: k */
    public final void m57125k() {
        collectStatus.compareAndSet(false, true);
    }

    /* JADX INFO: renamed from: l */
    public final void m57126l() {
        KunlunReporter.f46937a.m57170e(true);
    }

    /* JADX INFO: renamed from: m */
    public final void m57127m() {
        collectStatus.compareAndSet(true, false);
    }

    /* JADX INFO: renamed from: n */
    public final void m57128n() {
        KunlunReporter.f46937a.m57170e(false);
    }

    /* JADX INFO: renamed from: o */
    public final void m57129o(@NotNull final String eventName, @NotNull final Map<String, Number> values, @NotNull final Map<String, Object> labels) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(labels, "labels");
        if (remoteConfig.isKunlunOpen() && collectStatus.get()) {
            eventExecutor.execute(new Runnable() { // from class: hz.c
                @Override // java.lang.Runnable
                public final void run() {
                    KunLunSdk.m57115p(eventName, values, labels);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m57130q(@NotNull final String eventName, @NotNull final Map<String, Object> labels) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(labels, "labels");
        if (remoteConfig.isKunlunOpen() && collectStatus.get()) {
            eventExecutor.execute(new Runnable() { // from class: hz.b
                @Override // java.lang.Runnable
                public final void run() {
                    KunLunSdk.m57116r(eventName, labels);
                }
            });
        }
    }
}
