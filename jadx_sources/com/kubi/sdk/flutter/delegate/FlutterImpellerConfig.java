package com.kubi.sdk.flutter.delegate;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.utils.extensions.C27025c;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.sdk.flutter.delegate.l, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FlutterImpellerConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007¨\u0006\r"}, m90084d2 = {"Lcom/kubi/sdk/flutter/delegate/FlutterImpellerConfig;", "", "<init>", "()V", "flutterDisableImpellerSwitch", "", "getFlutterDisableImpellerSwitch", "()Z", "flutterDisableImpellerSwitch$delegate", "Lkotlin/Lazy;", "flutterBugfixAndroidCode27", "getFlutterBugfixAndroidCode27", "flutterBugfixAndroidCode27$delegate", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlutterImpellerConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterImpellerConfig.kt\ncom/kubi/sdk/flutter/delegate/FlutterImpellerConfig\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,16:1\n35#2,4:17\n39#2:23\n35#2,4:24\n39#2:30\n44#3,2:21\n44#3,2:28\n*S KotlinDebug\n*F\n+ 1 FlutterImpellerConfig.kt\ncom/kubi/sdk/flutter/delegate/FlutterImpellerConfig\n*L\n9#1:17,4\n9#1:23\n13#1:24,4\n13#1:30\n9#1:21,2\n13#1:28,2\n*E\n"})
public final class FlutterImpellerConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FlutterImpellerConfig f46678a = new FlutterImpellerConfig();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f46679b = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.flutter.delegate.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(FlutterImpellerConfig.m56817d());
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f46680c = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.flutter.delegate.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(FlutterImpellerConfig.m56816c());
        }
    });

    /* JADX INFO: renamed from: com.kubi.sdk.flutter.delegate.l$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.sdk.flutter.delegate.l$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class b extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m56816c() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("android_flutter_bugfix_for_android_code_27", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m56817d() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("android_flutter_disable_impeller_switch", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m56818e() {
        return ((Boolean) f46680c.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m56819f() {
        return ((Boolean) f46679b.getValue()).booleanValue();
    }
}
