package p311hf;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.utils.extensions.C27025c;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: hf.i */
/* JADX INFO: compiled from: UnifiedBizApiRemoteConfig.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\u0005J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/data/config/UnifiedBizApiRemoteConfig;", "", "<init>", "()V", "KEY_UNIFIED_BIZ_API", "", "OLD_PREFIX", "NEW_PREFIX", "REVERSE_POSITION_PATH", "SCALED_ORDER_PATH", "SCALED_ORDER_V2_PATH", "CANCEL_ALL_ORDER_PATH", "CANCEL_ALL_ADVANCED_ORDER_PATH", "reversePositionPath", "scaledOrderPath", "scaledOrderV2Path", "cancelAllOrderPath", "cancelAllAdvancedOrderPath", "resolvePath", "oldPath", "isUnifiedBizApiEnabled", "", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifiedBizApiRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifiedBizApiRemoteConfig.kt\ncom/kubi/data/config/UnifiedBizApiRemoteConfig\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,43:1\n35#2,4:44\n39#2:50\n44#3,2:48\n*S KotlinDebug\n*F\n+ 1 UnifiedBizApiRemoteConfig.kt\ncom/kubi/data/config/UnifiedBizApiRemoteConfig\n*L\n40#1:44,4\n40#1:50\n40#1:48,2\n*E\n"})
public final class C38191i {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38191i f85893a = new C38191i();

    /* JADX INFO: renamed from: hf.i$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m86168a() {
        return m86171d("ultra-trade/unified/inner/advanced/cancel-all");
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m86169b() {
        return m86171d("ultra-trade/unified/inner/orders/cancel-all");
    }

    /* JADX INFO: renamed from: c */
    public final boolean m86170c() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("unified_biz_Api", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m86172e() {
        return m86171d("ultra-trade/unified/inner/position/reverse");
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m86173f() {
        return m86171d("ultra-trade/unified/inner/order/scaled");
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m86174g() {
        return m86171d("ultra-trade/unified/inner/v2/order/scaled");
    }

    /* JADX INFO: renamed from: d */
    public final String m86171d(String str) {
        if (m86170c()) {
            return StringsKt.replaceFirst$default(str, "ultra-trade", "ultra-trade-biz", false, 4, (Object) null);
        }
        return str;
    }
}
