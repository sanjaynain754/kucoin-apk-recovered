package p693vj;

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

/* JADX INFO: renamed from: vj.b */
/* JADX INFO: compiled from: HomeRNConfig.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0006\u0010\u0010\u001a\u00020\f\u001a\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f\u001a\u0006\u0010\u0014\u001a\u00020\u0001\"\u001b\u0010\u0000\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0006\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0003\"\u0004\b\u0007\u0010\b\"\u001a\u0010\t\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0003\"\u0004\b\n\u0010\b\"\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m90084d2 = {"homeUseRn", "", "getHomeUseRn", "()Z", "homeUseRn$delegate", "Lkotlin/Lazy;", "isHomeRNLoadFail", "setHomeRNLoadFail", "(Z)V", "isHomeRNFragmentLoaded", "setHomeRNFragmentLoaded", "isHomeRNFragmentLoadedIndex", "", "()I", "setHomeRNFragmentLoadedIndex", "(I)V", "onHomeRNFragmentCreateView", "onHomeRNFragmentDestroyView", "", "index", "isHomeUseRN", "HomeApi_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeRNConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeRNConfig.kt\ncom/kubi/homern/api/HomeRNConfigKt\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,40:1\n35#2,4:41\n39#2:47\n44#3,2:45\n*S KotlinDebug\n*F\n+ 1 HomeRNConfig.kt\ncom/kubi/homern/api/HomeRNConfigKt\n*L\n13#1:41,4\n13#1:47\n13#1:45,2\n*E\n"})
public final class C45557b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Lazy f102659a = LazyKt.lazy(new Function0() { // from class: vj.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C45557b.m100612c());
        }
    });

    /* JADX INFO: renamed from: b */
    public static volatile boolean f102660b;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f102661c;

    /* JADX INFO: renamed from: d */
    public static volatile int f102662d;

    /* JADX INFO: renamed from: vj.b$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m100611b() {
        return ((Boolean) f102659a.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m100612c() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("platform_home_use_rn", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m100613d() {
        return f102661c;
    }

    /* JADX INFO: renamed from: f */
    public static final int m100615f() {
        f102662d++;
        f102661c = true;
        return f102662d;
    }

    /* JADX INFO: renamed from: g */
    public static final void m100616g(int i11) {
        if (i11 == f102662d) {
            f102661c = false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m100617h(boolean z11) {
        f102660b = z11;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m100614e() {
        if (m100611b() && !f102660b) {
            return true;
        }
        return false;
    }
}
