package com.kubi.user.google;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
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
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.user.google.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: GoogleSignInAvailability.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/user/google/GoogleSignInAvailability;", "", "<init>", "()V", "TAG", "", "KEY_APP_THIRD_GOOGLE", "isSupportThirdGoogle", "", "()Z", "isSupportThirdGoogle$delegate", "Lkotlin/Lazy;", "isAvailable", "context", "Landroid/content/Context;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGoogleSignInAvailability.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleSignInAvailability.kt\ncom/kubi/user/google/GoogleSignInAvailability\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,35:1\n35#2,4:36\n39#2:42\n44#3,2:40\n*S KotlinDebug\n*F\n+ 1 GoogleSignInAvailability.kt\ncom/kubi/user/google/GoogleSignInAvailability\n*L\n20#1:36,4\n20#1:42\n20#1:40,2\n*E\n"})
public final class GoogleSignInAvailability {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final GoogleSignInAvailability f53666a = new GoogleSignInAvailability();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f53667b = LazyKt.lazy(new Function0() { // from class: com.kubi.user.google.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(GoogleSignInAvailability.m65488d());
        }
    });

    /* JADX INFO: renamed from: com.kubi.user.google.b$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m65488d() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("uc_app_support_third_google", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m65489b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!m65490c()) {
            return false;
        }
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context.getApplicationContext()) == 0;
        } catch (Throwable th2) {
            C44128b.m97262f("GoogleSignInAvailability", "gms check exception", th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m65490c() {
        return ((Boolean) f53667b.getValue()).booleanValue();
    }
}
