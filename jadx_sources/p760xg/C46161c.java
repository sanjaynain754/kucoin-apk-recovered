package p760xg;

import am.HistoryFundsParams;
import am.HistoryProfitDetailParams;
import am.HistoryProfitParams;
import am.HistoryTradeRecordParams;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.credentials.provider.CredentialEntry;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.data.assets.model.ProfitDetailItemEntity;
import com.kubi.kumex.data.assets.model.ProfitRecordEntity;
import com.kubi.kumex.data.assets.model.ProfitShareEntity;
import com.kubi.kumex.data.assets.model.TradeRecordEntity;
import com.kubi.kumex.entity.FundsRecordEntity;
import com.kubi.sdk.PageEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.HashMap;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p595rg.InterfaceC44074b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xg.c */
/* JADX INFO: compiled from: IHistoryApiDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0010\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0010\u001a\u00020\u0018H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e2\u0006\u0010\u0010\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\""}, m90084d2 = {"Lcom/kubi/futures/classic/common/history/IHistoryApiDelegate;", "Lcom/kubi/function/common/IMultiHistoryApi;", "<init>", "()V", "api", "Lcom/kubi/futures/classic/common/history/IHistoryApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/futures/classic/common/history/IHistoryApi;", "api$delegate", "Lkotlin/Lazy;", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "fetchProfitRecord", "Lcom/kubi/sdk/PageEntity;", "Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/kumex/data/assets/model/HistoryProfitParams;", "fetchProfitDetail", "Lcom/kubi/kumex/data/assets/model/ProfitDetailItemEntity;", "Lcom/kubi/kumex/data/assets/model/HistoryProfitDetailParams;", "fetchFundsRecord", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/kumex/entity/FundsRecordEntity;", "Lcom/kubi/kumex/data/assets/model/HistoryFundsParams;", "fetchTradeRecord", "Lcom/kubi/kumex/data/assets/model/TradeRecordEntity;", "Lcom/kubi/kumex/data/assets/model/HistoryTradeRecordParams;", "fetchProfitShare", "Lcom/kubi/kumex/data/assets/model/ProfitShareEntity;", "pnlId", "", "closeTime", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46161c implements InterfaceC44074b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f103662a = LazyKt.lazy(new Function0() { // from class: xg.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C46161c.m101761a0();
        }
    });

    @Override // p595rg.InterfaceC44074b
    @NotNull
    /* JADX INFO: renamed from: K0 */
    public PageEntity<ProfitRecordEntity> mo83052K0(@NotNull HistoryProfitParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        HashMap<String, Object> mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m90091to("pageSize", Integer.valueOf(params.getPageSize())), TuplesKt.m90091to(TypedValues.CycleType.S_WAVE_OFFSET, Integer.valueOf(params.getCurrentPage())), TuplesKt.m90091to("isUseOffset", Boolean.TRUE));
        Integer trialOffset = params.getTrialOffset();
        if (trialOffset != null) {
            mapHashMapOf.put("trialOffset", Integer.valueOf(trialOffset.intValue()));
        }
        String symbol = params.getSymbol();
        if (symbol != null) {
            mapHashMapOf.put("symbol", symbol);
        }
        Long beginTime = params.getBeginTime();
        if (beginTime != null) {
            mapHashMapOf.put("beginTime", Long.valueOf(beginTime.longValue()));
        }
        Long endTime = params.getEndTime();
        if (endTime != null) {
            mapHashMapOf.put("endTime", Long.valueOf(endTime.longValue()));
        }
        String currency = params.getCurrency();
        if (currency != null) {
            mapHashMapOf.put(FirebaseAnalytics.Param.CURRENCY, currency);
        }
        return m101762x0().m101755a(mapHashMapOf);
    }

    @Override // p595rg.InterfaceC44074b
    @NotNull
    /* JADX INFO: renamed from: O0 */
    public PageEntity<TradeRecordEntity> mo83053O0(@NotNull HistoryTradeRecordParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        HashMap map = new HashMap();
        map.put(TypedValues.CycleType.S_WAVE_OFFSET, Integer.valueOf(params.getOffset()));
        map.put("trialOffset", Integer.valueOf(params.getTrialOffset()));
        map.put("isUseOffset", CredentialEntry.TRUE_STRING);
        map.put("currentPage", Integer.valueOf(params.getCurrentPage()));
        map.put("pageSize", Integer.valueOf(params.getPageSize()));
        String symbol = params.getSymbol();
        if (symbol != null) {
            map.put("symbol", symbol);
        }
        String type = params.getType();
        if (type != null) {
            map.put("orderType", type);
        }
        String orderId = params.getOrderId();
        if (orderId != null) {
            map.put("orderId", orderId);
        }
        Long beginTime = params.getBeginTime();
        if (beginTime != null) {
            map.put("start", Long.valueOf(beginTime.longValue()));
        }
        Long endTime = params.getEndTime();
        if (endTime != null) {
            map.put("end", Long.valueOf(endTime.longValue()));
        }
        return m101762x0().m101758d(map);
    }

    @Override // p595rg.InterfaceC44074b
    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public BasePageEntity<FundsRecordEntity> mo83054Q0(@NotNull HistoryFundsParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        HashMap<String, Object> mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m90091to("currentPage", Integer.valueOf(params.getCurrentPage())), TuplesKt.m90091to("pageSize", Integer.valueOf(params.getPageSize())), TuplesKt.m90091to("beginTime", Long.valueOf(params.getBeginTime())));
        String currency = params.getCurrency();
        if (currency != null) {
            mapHashMapOf.put(FirebaseAnalytics.Param.CURRENCY, currency);
        }
        String type = params.getType();
        if (type != null) {
            mapHashMapOf.put("type", type);
        }
        String side = params.getSide();
        if (side != null) {
            mapHashMapOf.put("side", side);
        }
        Long endTime = params.getEndTime();
        if (endTime != null) {
            mapHashMapOf.put("endTime", Long.valueOf(endTime.longValue()));
        }
        String fundsType = params.getFundsType();
        if (fundsType != null) {
            mapHashMapOf.put("fundsType", fundsType);
        }
        return m101762x0().m101756b(mapHashMapOf);
    }

    @Override // p595rg.InterfaceC44074b
    @Nullable
    /* JADX INFO: renamed from: c */
    public ProfitShareEntity mo83055c(@NotNull String pnlId, long j11) {
        Intrinsics.checkNotNullParameter(pnlId, "pnlId");
        return m101762x0().m101757c(pnlId, j11);
    }

    @Override // p595rg.InterfaceC44074b
    @NotNull
    /* JADX INFO: renamed from: c0 */
    public PageEntity<ProfitDetailItemEntity> mo83056c0(@NotNull HistoryProfitDetailParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        HashMap<String, Object> mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m90091to("realisedPnlId", params.getId()), TuplesKt.m90091to("page", Integer.valueOf(params.getCurrentPage())), TuplesKt.m90091to("size", Integer.valueOf(params.getPageSize())));
        Boolean isTrialFunds = params.getIsTrialFunds();
        if (isTrialFunds != null) {
            mapHashMapOf.put("isTrialFunds", isTrialFunds);
        }
        return m101762x0().m101759e(mapHashMapOf);
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.CLASSIC;
    }

    /* JADX INFO: renamed from: x0 */
    public final InterfaceC46159a m101762x0() {
        return (InterfaceC46159a) this.f103662a.getValue();
    }

    /* JADX INFO: renamed from: a0 */
    public static final InterfaceC46159a m101761a0() {
        return (InterfaceC46159a) C42597a.m93391g().create(InterfaceC46159a.class);
    }
}
