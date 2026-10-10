package vg;

import bm.FuturesTrackConfigs;
import com.kubi.broker.IBrokerConfig;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.R$string;
import com.kubi.kumex.entity.TradeTypeFilterData;
import com.kubi.kumex.logic.constant.OrderTradeType;
import com.kubi.kumex.utils.C17060n0;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37749a;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import m30.C42422c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p836zl.C46894j;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: vg.a */
/* JADX INFO: compiled from: FuturesClassicBroker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\"\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0016J\u001e\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110#H\u0016J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0005H\u0016J\b\u0010'\u001a\u00020\u0005H\u0016J\b\u0010(\u001a\u00020\u0005H\u0016J\b\u0010)\u001a\u00020\u0005H\u0016J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0010H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006,"}, m90084d2 = {"Lcom/kubi/futures/classic/FuturesClassicBroker;", "Lcom/kubi/broker/IBrokerConfig;", "<init>", "()V", "showTips", "", "getShowTips", "()Z", "setShowTips", "(Z)V", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "orderTradeTypes", "", "Lcom/kubi/kumex/logic/constant/OrderTradeType;", "settingMoreMenus", "", "", "isSupportTrial", "isSupportTwap", "isSupportCrossModel", "isSupportIsolatedModel", "isSupportHedgeModel", "isSupportNotification", "isSupportDisplayUserLimit", "maxLeverage", "Ljava/math/BigDecimal;", "jumpToTransfer", "", "settleCurrencyShow", "blockId", "locationId", "checkDefaultSymbol", "symbol", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Consumer;", "trackKeyConfigs", "Lcom/kubi/kumex/data/platform/model/FuturesTrackConfigs;", "isReversePositionEnable", "supportModifyRiskLimit", "isSupportModifyOrder", "isSupportBBO", "getTradeTypeFilterItems", "Lcom/kubi/kumex/entity/TradeTypeFilterData;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesClassicBroker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesClassicBroker.kt\ncom/kubi/futures/classic/FuturesClassicBroker\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,157:1\n135#2,2:158\n*S KotlinDebug\n*F\n+ 1 FuturesClassicBroker.kt\ncom/kubi/futures/classic/FuturesClassicBroker\n*L\n80#1:158,2\n*E\n"})
public final class C45527a implements IBrokerConfig {

    /* JADX INFO: renamed from: a */
    public boolean f102586a;

    @Override // com.kubi.broker.IBrokerConfig
    /* JADX INFO: renamed from: A0 */
    public boolean mo20222A0() {
        return true;
    }

    @Override // com.kubi.broker.IBrokerConfig
    /* JADX INFO: renamed from: E0 */
    public boolean mo20224E0() {
        return true;
    }

    @Override // com.kubi.broker.IBrokerConfig
    /* JADX INFO: renamed from: G0 */
    public boolean mo20225G0() {
        return true;
    }

    @Override // com.kubi.broker.IBrokerConfig
    /* JADX INFO: renamed from: O */
    public boolean mo20229O() {
        return true;
    }

    @Override // com.kubi.broker.IBrokerConfig
    /* JADX INFO: renamed from: Q */
    public boolean mo20230Q() {
        return true;
    }

    @Override // com.kubi.broker.IBrokerConfig
    /* JADX INFO: renamed from: T */
    public boolean mo20232T() {
        return true;
    }

    @Override // com.kubi.broker.IBrokerConfig
    /* JADX INFO: renamed from: U0 */
    public boolean mo20233U0() {
        return true;
    }

    @Override // com.kubi.broker.IBrokerConfig
    /* JADX INFO: renamed from: Y0 */
    public boolean mo20237Y0() {
        return true;
    }

    @Override // com.kubi.broker.IBrokerConfig
    /* JADX INFO: renamed from: o */
    public boolean mo20240o() {
        return true;
    }

    @Override // com.kubi.broker.IBrokerConfig
    /* JADX INFO: renamed from: v0 */
    public boolean mo20243v0() {
        return true;
    }

    @Override // com.kubi.broker.IBrokerConfig
    /* JADX INFO: renamed from: J0 */
    public boolean mo20227J0() {
        return C46392a.m102322d(C46894j.f104736a.m103274m("hedgeModePosition"), false);
    }

    @Override // com.kubi.broker.IBrokerConfig
    /* JADX INFO: renamed from: K */
    public void mo20228K(boolean z11) {
        this.f102586a = z11;
    }

    @Override // com.kubi.broker.IBrokerConfig
    @NotNull
    /* JADX INFO: renamed from: S0 */
    public List<String> mo20231S0() {
        return CollectionsKt.arrayListOf("brawl", "tradingBot", "fundingRate", "bonus", "calculator", "pnlAnalyze");
    }

    @Override // com.kubi.broker.IBrokerConfig
    @NotNull
    /* JADX INFO: renamed from: W */
    public List<TradeTypeFilterData> mo20235W() {
        List<TradeTypeFilterData> listMutableListOf = CollectionsKt.mutableListOf(new TradeTypeFilterData(R$string.all, null), new TradeTypeFilterData(R$string.limit_price, TUIConstants.TUIContact.LIMIT), new TradeTypeFilterData(R$string.market_price, "market"), new TradeTypeFilterData(R$string.condition_price, "limit_stop"), new TradeTypeFilterData(R$string.market_stop, "market_stop"));
        if (mo20236X0().contains(OrderTradeType.Tso)) {
            listMutableListOf.add(new TradeTypeFilterData(R$string.kumex_tso_order, "trailing_stop"));
        }
        listMutableListOf.add(new TradeTypeFilterData(R$string.force_close_position, "liquid"));
        if (mo20227J0()) {
            new TradeTypeFilterData(R$string.kumex_liquidation_reconciliation, "reconciliation");
        }
        listMutableListOf.add(new TradeTypeFilterData(R$string.auto_reduce_position, "adl"));
        return listMutableListOf;
    }

    @Override // com.kubi.broker.IBrokerConfig
    @NotNull
    /* JADX INFO: renamed from: s0 */
    public FuturesTrackConfigs mo20242s0() {
        return new FuturesTrackConfigs(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.kubi.broker.IBrokerConfig
    /* JADX INFO: renamed from: w0, reason: from getter */
    public boolean getF79458a() {
        return this.f102586a;
    }

    @Override // com.kubi.broker.IBrokerConfig, p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.CLASSIC;
    }

    @Override // com.kubi.broker.IBrokerConfig
    /* JADX INFO: renamed from: y0 */
    public void mo20245y0(@Nullable String str, @NotNull String blockId, @NotNull String locationId) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        C37304a c37304a = C37304a.f82764a;
        if (str == null) {
            str = "";
        }
        InterfaceC37749a.a.m85117l(c37304a, str, "MAIN", "CONTRACT", null, C43852m.m96601m(C17060n0.m36552b(), blockId, locationId), null, null, 104, null);
    }

    @Override // com.kubi.broker.IBrokerConfig
    @NotNull
    /* JADX INFO: renamed from: H */
    public String mo20226H(@NotNull String symbol, @NotNull Consumer<String> action) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(action, "action");
        return symbol;
    }

    @Override // com.kubi.broker.IBrokerConfig
    @NotNull
    /* JADX INFO: renamed from: V */
    public BigDecimal mo20234V() {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(Integer.MAX_VALUE);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf;
    }

    @Override // com.kubi.broker.IBrokerConfig
    @NotNull
    /* JADX INFO: renamed from: X0 */
    public List<OrderTradeType> mo20236X0() {
        List<OrderTradeType> mutableList = CollectionsKt.toMutableList((Collection) OrderTradeType.getEntries());
        mutableList.remove(OrderTradeType.Segment);
        if (!C42422c.f94040a.m93120c()) {
            mutableList.remove(OrderTradeType.Hidden);
        }
        return mutableList;
    }
}
