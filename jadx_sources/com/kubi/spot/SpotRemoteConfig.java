package com.kubi.spot;

import androidx.annotation.Keep;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.spot.SpotRemoteConfig;
import com.kubi.utils.ThemisUtils;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SpotRemoteConfig.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001!B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001d\u001a\u00020\u000bJ\u0006\u0010\u001e\u001a\u00020\u000bJ\u0006\u0010\u001f\u001a\u00020\u000bJ\u0006\u0010 \u001a\u00020\u000bR\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0010\u0010\rR\u001b\u0010\u0012\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0013\u0010\rR\u001b\u0010\u0015\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0016\u0010\rR\u001b\u0010\u0018\u001a\u00020\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\t\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, m90084d2 = {"Lcom/kubi/spot/SpotRemoteConfig;", "", "<init>", "()V", "tradeCloudConfig", "Lcom/kubi/spot/SpotRemoteConfig$TradeConfig;", "getTradeCloudConfig", "()Lcom/kubi/spot/SpotRemoteConfig$TradeConfig;", "tradeCloudConfig$delegate", "Lkotlin/Lazy;", "amendOrderCloudConfig", "", "getAmendOrderCloudConfig", "()Z", "amendOrderCloudConfig$delegate", "marginAmendOrderCloudConfig", "getMarginAmendOrderCloudConfig", "marginAmendOrderCloudConfig$delegate", "aiKlineRnEntryConfig", "getAiKlineRnEntryConfig", "aiKlineRnEntryConfig$delegate", "klineSportMarginShareConfig", "getKlineSportMarginShareConfig", "klineSportMarginShareConfig$delegate", "latestPriceUpdateInterval", "", "getLatestPriceUpdateInterval", "()I", "latestPriceUpdateInterval$delegate", "tradeAmendOrder", "marginTradeAmendOrder", "shareIconConfig", "rnAiEntryShow", "TradeConfig", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotRemoteConfig.kt\ncom/kubi/spot/SpotRemoteConfig\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,87:1\n35#2,4:88\n39#2:94\n35#2,4:95\n39#2:101\n35#2,4:102\n39#2:108\n35#2,4:109\n39#2:115\n35#2,4:116\n39#2:122\n44#3,2:92\n44#3,2:99\n44#3,2:106\n44#3,2:113\n44#3,2:120\n*S KotlinDebug\n*F\n+ 1 SpotRemoteConfig.kt\ncom/kubi/spot/SpotRemoteConfig\n*L\n20#1:88,4\n20#1:94\n24#1:95,4\n24#1:101\n28#1:102,4\n28#1:108\n35#1:109,4\n35#1:115\n43#1:116,4\n43#1:122\n20#1:92,2\n24#1:99,2\n28#1:106,2\n35#1:113,2\n43#1:120,2\n*E\n"})
public final class SpotRemoteConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SpotRemoteConfig f49637a = new SpotRemoteConfig();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f49638b = LazyKt.lazy(new Function0() { // from class: d20.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpotRemoteConfig.m59943v();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f49639c = LazyKt.lazy(new Function0() { // from class: d20.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(SpotRemoteConfig.m59939h());
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy f49640d = LazyKt.lazy(new Function0() { // from class: d20.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(SpotRemoteConfig.m59942q());
        }
    });

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Lazy f49641e = LazyKt.lazy(new Function0() { // from class: d20.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(SpotRemoteConfig.m59938g());
        }
    });

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Lazy f49642f = LazyKt.lazy(new Function0() { // from class: d20.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(SpotRemoteConfig.m59940o());
        }
    });

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Lazy f49643g = LazyKt.lazy(new Function0() { // from class: d20.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(SpotRemoteConfig.m59941p());
        }
    });

    /* JADX INFO: compiled from: SpotRemoteConfig.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/spot/SpotRemoteConfig$TradeConfig;", "", "strongDeviceUpdateInterval", "", "weakDeviceUpdateInterval", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getStrongDeviceUpdateInterval", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWeakDeviceUpdateInterval", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/kubi/spot/SpotRemoteConfig$TradeConfig;", "equals", "", "other", "hashCode", "toString", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class TradeConfig {

        @Nullable
        private final Integer strongDeviceUpdateInterval;

        @Nullable
        private final Integer weakDeviceUpdateInterval;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TradeConfig)) {
                return false;
            }
            TradeConfig tradeConfig = (TradeConfig) other;
            return Intrinsics.areEqual(this.strongDeviceUpdateInterval, tradeConfig.strongDeviceUpdateInterval) && Intrinsics.areEqual(this.weakDeviceUpdateInterval, tradeConfig.weakDeviceUpdateInterval);
        }

        public static /* synthetic */ TradeConfig copy$default(TradeConfig tradeConfig, Integer num, Integer num2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = tradeConfig.strongDeviceUpdateInterval;
            }
            if ((i11 & 2) != 0) {
                num2 = tradeConfig.weakDeviceUpdateInterval;
            }
            return tradeConfig.copy(num, num2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getStrongDeviceUpdateInterval() {
            return this.strongDeviceUpdateInterval;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getWeakDeviceUpdateInterval() {
            return this.weakDeviceUpdateInterval;
        }

        @NotNull
        public final TradeConfig copy(@Nullable Integer strongDeviceUpdateInterval, @Nullable Integer weakDeviceUpdateInterval) {
            return new TradeConfig(strongDeviceUpdateInterval, weakDeviceUpdateInterval);
        }

        @Nullable
        public final Integer getStrongDeviceUpdateInterval() {
            return this.strongDeviceUpdateInterval;
        }

        @Nullable
        public final Integer getWeakDeviceUpdateInterval() {
            return this.weakDeviceUpdateInterval;
        }

        public int hashCode() {
            Integer num = this.strongDeviceUpdateInterval;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.weakDeviceUpdateInterval;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TradeConfig(strongDeviceUpdateInterval=" + this.strongDeviceUpdateInterval + ", weakDeviceUpdateInterval=" + this.weakDeviceUpdateInterval + ')';
        }

        public TradeConfig(@Nullable Integer num, @Nullable Integer num2) {
            this.strongDeviceUpdateInterval = num;
            this.weakDeviceUpdateInterval = num2;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.SpotRemoteConfig$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C24653a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.SpotRemoteConfig$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C24654b extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.SpotRemoteConfig$c */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C24655c extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.SpotRemoteConfig$d */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C24656d extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.SpotRemoteConfig$e */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C24657e extends TypeToken<TradeConfig> {
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m59938g() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C24653a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kLine_rn_ai_entry_show", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m59939h() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C24654b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("trade_amend_order", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m59940o() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C24655c().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kLine_spot_share_show", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    /* JADX INFO: renamed from: p */
    public static final int m59941p() {
        SpotRemoteConfig spotRemoteConfig = f49637a;
        TradeConfig tradeConfigM59949n = spotRemoteConfig.m59949n();
        int iM66651k = C27039d.m66651k(tradeConfigM59949n != null ? tradeConfigM59949n.getWeakDeviceUpdateInterval() : null, 666);
        TradeConfig tradeConfigM59949n2 = spotRemoteConfig.m59949n();
        return ThemisUtils.f54260a.m66413b() ? iM66651k : C27039d.m66651k(tradeConfigM59949n2 != null ? tradeConfigM59949n2.getStrongDeviceUpdateInterval() : null, 333);
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m59942q() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C24656d().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("margin_trade_amend_order", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    /* JADX INFO: renamed from: v */
    public static final TradeConfig m59943v() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C24657e().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("spot_one_key_enable", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return (TradeConfig) objM20457a;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m59944i() {
        return ((Boolean) f49641e.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m59945j() {
        return ((Boolean) f49639c.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m59946k() {
        return ((Boolean) f49642f.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    public final int m59947l() {
        return ((Number) f49643g.getValue()).intValue();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m59948m() {
        return ((Boolean) f49640d.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: n */
    public final TradeConfig m59949n() {
        return (TradeConfig) f49638b.getValue();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m59950r() {
        return m59948m();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m59951s() {
        return m59944i();
    }

    /* JADX INFO: renamed from: t */
    public final boolean m59952t() {
        return m59946k();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m59953u() {
        return m59945j();
    }
}
