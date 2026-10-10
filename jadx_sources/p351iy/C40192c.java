package p351iy;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.sdk.config.KCTokenLifecycleConfig;
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

/* JADX INFO: renamed from: iy.c */
/* JADX INFO: compiled from: LoginServiceRemoteConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/sdk/config/LoginServiceRemoteConfig;", "", "<init>", "()V", "KEY_LOGIN_SERVICE_ROLLBACK", "", "KEY_SWITCH_ACCOUNT_SESSION_CLEAR_ROLLBACK", "loginServiceRollbackAb", "", "getLoginServiceRollbackAb", "()Z", "loginServiceRollbackAb$delegate", "Lkotlin/Lazy;", "KEY_UC_TOKEN_LIFECYCLE", "cachedUCTokenLifecycleConfig", "Lcom/kubi/sdk/config/KCTokenLifecycleConfig;", "getCachedUCTokenLifecycleConfig", "()Lcom/kubi/sdk/config/KCTokenLifecycleConfig;", "cachedUCTokenLifecycleConfig$delegate", "getKCTokenLifecycleConfig", "isUCTokenLifecycleEnabled", "switchAccountSessionClearRollback", "getSwitchAccountSessionClearRollback", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLoginServiceRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginServiceRemoteConfig.kt\ncom/kubi/sdk/config/LoginServiceRemoteConfig\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,55:1\n35#2,4:56\n39#2:62\n35#2,4:63\n39#2:69\n35#2,4:70\n39#2:76\n44#3,2:60\n44#3,2:67\n44#3,2:74\n*S KotlinDebug\n*F\n+ 1 LoginServiceRemoteConfig.kt\ncom/kubi/sdk/config/LoginServiceRemoteConfig\n*L\n52#1:56,4\n52#1:62\n17#1:63,4\n17#1:69\n30#1:70,4\n30#1:76\n52#1:60,2\n17#1:67,2\n30#1:74,2\n*E\n"})
public final class C40192c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C40192c f89321a = new C40192c();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f89322b = LazyKt.lazy(new Function0() { // from class: iy.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C40192c.m88541i());
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f89323c = LazyKt.lazy(new Function0() { // from class: iy.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C40192c.m88540c();
        }
    });

    /* JADX INFO: renamed from: iy.c$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<KCTokenLifecycleConfig> {
    }

    /* JADX INFO: renamed from: iy.c$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class b extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: c */
    public static final KCTokenLifecycleConfig m88540c() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_token_lifecycle", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        KCTokenLifecycleConfig kCTokenLifecycleConfig = (KCTokenLifecycleConfig) objM20457a;
        return kCTokenLifecycleConfig == null ? new KCTokenLifecycleConfig(false, 0L, 0L, false, false, null, 63, null) : kCTokenLifecycleConfig;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m88541i() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_login_service_rollback", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    /* JADX INFO: renamed from: d */
    public final KCTokenLifecycleConfig m88542d() {
        return (KCTokenLifecycleConfig) f89323c.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m88544f() {
        return ((Boolean) f89322b.getValue()).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final KCTokenLifecycleConfig m88543e() {
        return m88542d();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m88545g() {
        return m88542d().getEnabled();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m88546h() {
        return m88544f();
    }
}
