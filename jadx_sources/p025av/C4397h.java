package p025av;

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

/* JADX INFO: renamed from: av.h */
/* JADX INFO: compiled from: RemoteConfigConstants.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a\u0006\u0010\f\u001a\u00020\u0001\"\u001b\u0010\u0000\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\u0006\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\u0007\u0010\u0003\"\u001b\u0010\t\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\n\u0010\u0003\"\u001b\u0010\r\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u000e\u0010\u0003¨\u0006\u0010"}, m90084d2 = {"rnCurrencyFilterEnabled", "", "getRnCurrencyFilterEnabled", "()Z", "rnCurrencyFilterEnabled$delegate", "Lkotlin/Lazy;", "quoteMarketRnCoinInfoEnabled", "getQuoteMarketRnCoinInfoEnabled", "quoteMarketRnCoinInfoEnabled$delegate", "enableRnMarketTab", "getEnableRnMarketTab", "enableRnMarketTab$delegate", "isRnMarketTabReady", "quoteMarketRnRecommendEnabled", "getQuoteMarketRnRecommendEnabled", "quoteMarketRnRecommendEnabled$delegate", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRemoteConfigConstants.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfigConstants.kt\ncom/kubi/quotefacade/constant/RemoteConfigConstantsKt\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,47:1\n35#2,4:48\n39#2:54\n35#2,4:55\n39#2:61\n35#2,4:62\n39#2:68\n35#2,4:69\n39#2:75\n44#3,2:52\n44#3,2:59\n44#3,2:66\n44#3,2:73\n*S KotlinDebug\n*F\n+ 1 RemoteConfigConstants.kt\ncom/kubi/quotefacade/constant/RemoteConfigConstantsKt\n*L\n16#1:48,4\n16#1:54\n23#1:55,4\n23#1:61\n31#1:62,4\n31#1:68\n44#1:69,4\n44#1:75\n16#1:52,2\n23#1:59,2\n31#1:66,2\n44#1:73,2\n*E\n"})
public final class C4397h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Lazy f3826a = LazyKt.lazy(new Function0() { // from class: av.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C4397h.m4032m());
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f3827b = LazyKt.lazy(new Function0() { // from class: av.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C4397h.m4030k());
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f3828c = LazyKt.lazy(new Function0() { // from class: av.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C4397h.m4024e());
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy f3829d = LazyKt.lazy(new Function0() { // from class: av.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C4397h.m4031l());
        }
    });

    /* JADX INFO: renamed from: av.h$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: av.h$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class b extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: av.h$c */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class c extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: av.h$d */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class d extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m4024e() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("enable_rn_market_tab", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m4025f() {
        return ((Boolean) f3828c.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m4026g() {
        return ((Boolean) f3827b.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m4027h() {
        return ((Boolean) f3829d.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m4028i() {
        return ((Boolean) f3826a.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m4030k() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("quote_market_rn_coin_info_enabled", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m4031l() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new c().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("coin_detail_rn_recommend_enabled", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m4032m() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new d().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("rn_currency_filter_config", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m4029j() {
        return m4025f();
    }
}
