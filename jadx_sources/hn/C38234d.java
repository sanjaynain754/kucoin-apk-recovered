package hn;

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

/* JADX INFO: renamed from: hn.d */
/* JADX INFO: compiled from: KycRemoteConfigHelper.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0014\u001a\u00020\tJ\u0006\u0010\u0015\u001a\u00020\tJ\u0006\u0010\u0016\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/kyc/helper/KycRemoteConfigHelper;", "", "<init>", "()V", "KEY_H5_KYC_FLOW", "", "KEY_OLD_RN_KYC_FLOW", "KEY_UNIFIED_RN_KYC_FLOW", "useH5KycFlow", "", "getUseH5KycFlow", "()Z", "useH5KycFlow$delegate", "Lkotlin/Lazy;", "useOldRnKycFlow", "getUseOldRnKycFlow", "useOldRnKycFlow$delegate", "useUnifiedRnKycFlow", "getUseUnifiedRnKycFlow", "useUnifiedRnKycFlow$delegate", "shouldUseH5KycFlow", "shouldUseOldRnKycFlow", "shouldUseUnifiedRnKycFlow", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKycRemoteConfigHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KycRemoteConfigHelper.kt\ncom/kubi/kyc/helper/KycRemoteConfigHelper\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,50:1\n35#2,4:51\n39#2:57\n35#2,4:58\n39#2:64\n35#2,4:65\n39#2:71\n44#3,2:55\n44#3,2:62\n44#3,2:69\n*S KotlinDebug\n*F\n+ 1 KycRemoteConfigHelper.kt\ncom/kubi/kyc/helper/KycRemoteConfigHelper\n*L\n17#1:51,4\n17#1:57\n20#1:58,4\n20#1:64\n24#1:65,4\n24#1:71\n17#1:55,2\n20#1:62,2\n24#1:69,2\n*E\n"})
public final class C38234d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38234d f85931a = new C38234d();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f85932b = LazyKt.lazy(new Function0() { // from class: hn.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C38234d.m86307j());
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f85933c = LazyKt.lazy(new Function0() { // from class: hn.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C38234d.m86308k());
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy f85934d = LazyKt.lazy(new Function0() { // from class: hn.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C38234d.m86309l());
        }
    });

    /* JADX INFO: renamed from: hn.d$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: hn.d$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class b extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: hn.d$c */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class c extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m86307j() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("platform_kyc_h5_enable", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m86308k() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("platform_kyc_new_rn", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m86309l() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new c().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("platform_kyc_unified_rn", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m86310d() {
        return ((Boolean) f85932b.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m86311e() {
        return ((Boolean) f85933c.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m86312f() {
        return ((Boolean) f85934d.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m86313g() {
        return m86310d();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m86314h() {
        return m86311e();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m86315i() {
        return m86312f();
    }
}
