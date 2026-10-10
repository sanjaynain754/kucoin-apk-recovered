package m30;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: m30.c */
/* JADX INFO: compiled from: TradeBaseRemoteConfig.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007¨\u0006\r"}, m90084d2 = {"Lcom/kubi/tradebase/config/TradeBaseRemoteConfig;", "", "<init>", "()V", "segmentOrderVisible", "", "getSegmentOrderVisible", "()Z", "segmentOrderVisible$delegate", "Lkotlin/Lazy;", "hiddenOrderVisible", "getHiddenOrderVisible", "hiddenOrderVisible$delegate", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeBaseRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeBaseRemoteConfig.kt\ncom/kubi/tradebase/config/TradeBaseRemoteConfig\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,20:1\n35#2,4:21\n39#2:27\n35#2,4:28\n39#2:34\n44#3,2:25\n44#3,2:32\n*S KotlinDebug\n*F\n+ 1 TradeBaseRemoteConfig.kt\ncom/kubi/tradebase/config/TradeBaseRemoteConfig\n*L\n11#1:21,4\n11#1:27\n17#1:28,4\n17#1:34\n11#1:25,2\n17#1:32,2\n*E\n"})
public final class C42422c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42422c f94040a = new C42422c();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f94041b = LazyKt.lazy(new Function0() { // from class: m30.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C42422c.m93119f());
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f94042c = LazyKt.lazy(new Function0() { // from class: m30.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C42422c.m93118e());
        }
    });

    /* JADX INFO: renamed from: m30.c$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: m30.c$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class b extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m93118e() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kumex_hidden_order_visible", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        Boolean bool = (Boolean) objM20457a;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m93119f() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("segment_order_visible", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        Boolean bool = (Boolean) objM20457a;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m93120c() {
        return ((Boolean) f94042c.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m93121d() {
        return ((Boolean) f94041b.getValue()).booleanValue();
    }
}
