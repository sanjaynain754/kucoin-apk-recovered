package n60;

import bm.FuturesTrackConfigs;
import com.kubi.broker.IBrokerConfig;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.entity.TradeTypeFilterData;
import com.kubi.kumex.logic.constant.OrderTradeType;
import com.kubi.unify.R$string;
import com.kubi.unify.api.entity.UnifyOrderDisplayTypeEnum;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37749a;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import m30.C42422c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: n60.a */
/* JADX INFO: compiled from: FuturesUnifyBroker.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\"\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0016J\u001e\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110#H\u0016J\b\u0010$\u001a\u00020\u0005H\u0016J\b\u0010%\u001a\u00020&H\u0016J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0010H\u0016J\b\u0010)\u001a\u00020\u0005H\u0016J\b\u0010*\u001a\u00020\u0005H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020.H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006/"}, m90084d2 = {"Lcom/kubi/unify/unify/FuturesUnifyBroker;", "Lcom/kubi/broker/IBrokerConfig;", "<init>", "()V", "showTips", "", "getShowTips", "()Z", "setShowTips", "(Z)V", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "orderTradeTypes", "", "Lcom/kubi/kumex/logic/constant/OrderTradeType;", "settingMoreMenus", "", "", "isSupportTrial", "isSupportTwap", "isSupportCrossModel", "isSupportIsolatedModel", "isSupportHedgeModel", "isSupportNotification", "isSupportDisplayUserLimit", "maxLeverage", "Ljava/math/BigDecimal;", "jumpToTransfer", "", "settleCurrencyShow", "blockId", "locationId", "checkDefaultSymbol", "symbol", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Consumer;", "isSupportSharePosition", "limitCancelAllCount", "", "getTradeTypeFilterItems", "Lcom/kubi/kumex/entity/TradeTypeFilterData;", "isSupportModifyOrder", "isSupportIsolatedAutoAddMargin", "isReversePositionEnable", "isSupportBBO", "trackKeyConfigs", "Lcom/kubi/kumex/data/platform/model/FuturesTrackConfigs;", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesUnifyBroker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesUnifyBroker.kt\ncom/kubi/unify/unify/FuturesUnifyBroker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,143:1\n774#2:144\n865#2,2:145\n1563#2:147\n1634#2,3:148\n*S KotlinDebug\n*F\n+ 1 FuturesUnifyBroker.kt\ncom/kubi/unify/unify/FuturesUnifyBroker\n*L\n106#1:144\n106#1:145,2\n111#1:147\n111#1:148,3\n*E\n"})
public final class C42758a implements IBrokerConfig {

    /* JADX INFO: renamed from: a */
    public boolean f94715a;

    @Override // com.kubi.broker.IBrokerConfig
    /* JADX INFO: renamed from: A0 */
    public boolean mo20222A0() {
        return false;
    }

    @Override // com.kubi.broker.IBrokerConfig
    /* JADX INFO: renamed from: C0 */
    public boolean mo20223C0() {
        return false;
    }

    @Override // com.kubi.broker.IBrokerConfig
    /* JADX INFO: renamed from: G0 */
    public boolean mo20225G0() {
        return false;
    }

    @Override // com.kubi.broker.IBrokerConfig
    /* JADX INFO: renamed from: J0 */
    public boolean mo20227J0() {
        return false;
    }

    @Override // com.kubi.broker.IBrokerConfig
    /* JADX INFO: renamed from: O */
    public boolean mo20229O() {
        return false;
    }

    @Override // com.kubi.broker.IBrokerConfig
    /* JADX INFO: renamed from: Q */
    public boolean mo20230Q() {
        return false;
    }

    @Override // com.kubi.broker.IBrokerConfig
    /* JADX INFO: renamed from: T */
    public boolean mo20232T() {
        return false;
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
    /* JADX INFO: renamed from: j0 */
    public boolean mo20239j0() {
        return false;
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
    @NotNull
    /* JADX INFO: renamed from: H */
    public String mo20226H(@NotNull String symbol, @NotNull Consumer<String> action) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(action, "action");
        return symbol;
    }

    @Override // com.kubi.broker.IBrokerConfig
    /* JADX INFO: renamed from: K */
    public void mo20228K(boolean z11) {
        this.f94715a = z11;
    }

    @Override // com.kubi.broker.IBrokerConfig
    @NotNull
    /* JADX INFO: renamed from: S0 */
    public List<String> mo20231S0() {
        return CollectionsKt.arrayListOf("fundingRate", "pnlAnalyze");
    }

    @Override // com.kubi.broker.IBrokerConfig
    /* JADX INFO: renamed from: a1 */
    public int mo20238a1() {
        return 100;
    }

    @Override // com.kubi.broker.IBrokerConfig
    @NotNull
    /* JADX INFO: renamed from: s0 */
    public FuturesTrackConfigs mo20242s0() {
        return new FuturesTrackConfigs("B6UnifiedFuturesTrade", "B6UnifiedFuturesRiskLimit", null, "unified_posi_trade_results", "unified_trade_results", "unified_futures_trade_result", "unified_modify_order_result", "unified_click_submit_future_order", 4, null);
    }

    @Override // com.kubi.broker.IBrokerConfig
    /* JADX INFO: renamed from: w0, reason: from getter */
    public boolean getF94715a() {
        return this.f94715a;
    }

    @Override // com.kubi.broker.IBrokerConfig, p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.UNIFIED;
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
        InterfaceC37749a.a.m85117l(c37304a, str, "MAIN", "UNIFIED", null, C43852m.m96601m(mo20242s0().getFuturesPageId(), blockId, locationId), null, null, 104, null);
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
    /* JADX INFO: renamed from: W */
    public List<TradeTypeFilterData> mo20235W() {
        EnumEntries<UnifyOrderDisplayTypeEnum> entries = UnifyOrderDisplayTypeEnum.getEntries();
        ArrayList<UnifyOrderDisplayTypeEnum> arrayList = new ArrayList();
        for (UnifyOrderDisplayTypeEnum unifyOrderDisplayTypeEnum : entries) {
            UnifyOrderDisplayTypeEnum unifyOrderDisplayTypeEnum2 = unifyOrderDisplayTypeEnum;
            if (unifyOrderDisplayTypeEnum2.getType() != UnifyOrderDisplayTypeEnum.UTA_CON_LIMIT.getType() && unifyOrderDisplayTypeEnum2.getType() != UnifyOrderDisplayTypeEnum.UTA_CON_MARKET.getType() && (C42422c.f94040a.m93120c() || unifyOrderDisplayTypeEnum2.getType() != UnifyOrderDisplayTypeEnum.UTA_HIDDEN.getType())) {
                arrayList.add(unifyOrderDisplayTypeEnum);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (UnifyOrderDisplayTypeEnum unifyOrderDisplayTypeEnum3 : arrayList) {
            arrayList2.add(new TradeTypeFilterData(unifyOrderDisplayTypeEnum3.getDisplayString(), unifyOrderDisplayTypeEnum3.getTradeType()));
        }
        List<TradeTypeFilterData> mutableList = CollectionsKt.toMutableList((Collection) arrayList2);
        mutableList.add(0, new TradeTypeFilterData(R$string.all, null));
        return mutableList;
    }

    @Override // com.kubi.broker.IBrokerConfig
    @NotNull
    /* JADX INFO: renamed from: X0 */
    public List<OrderTradeType> mo20236X0() {
        List<OrderTradeType> mutableList = CollectionsKt.toMutableList((Collection) OrderTradeType.getEntries());
        mutableList.remove(OrderTradeType.Tso);
        C42422c c42422c = C42422c.f94040a;
        if (!c42422c.m93121d()) {
            mutableList.remove(OrderTradeType.Segment);
        }
        if (!c42422c.m93120c()) {
            mutableList.remove(OrderTradeType.Hidden);
        }
        return mutableList;
    }
}
