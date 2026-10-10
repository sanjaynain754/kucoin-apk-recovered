package p595rg;

import cm.LotCostDeltaResult;
import com.kubi.kumex.data.trade.model.CostResult;
import com.kubi.kumex.data.trade.model.LiquidationPriceResult;
import com.kubi.kumex.data.trade.model.MaxQtyResult;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p559qg.InterfaceC43729a;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.QueryMap;

/* JADX INFO: renamed from: rg.a */
/* JADX INFO: compiled from: IMultiCalculateApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H¦@¢\u0006\u0002\u0010\u0007J&\u0010\b\u001a\u00020\t2\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H¦@¢\u0006\u0002\u0010\u0007J&\u0010\n\u001a\u00020\u000b2\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H¦@¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\r2\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H¦@¢\u0006\u0002\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/function/common/IMultiCalculateApi;", "Lcom/kubi/function/IMultiFunction;", "fetchMaxQty", "Lcom/kubi/kumex/data/trade/model/MaxQtyResult;", ReportDataTable.COLUMN_PARAMS, "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCost", "Lcom/kubi/kumex/data/trade/model/CostResult;", "fetchLiquidationPrice", "Lcom/kubi/kumex/data/trade/model/LiquidationPriceResult;", "fetchLotCostDelta", "Lcom/kubi/kumex/data/trade/model/LotCostDeltaResult;", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC44073a extends InterfaceC43729a {
    @Nullable
    /* JADX INFO: renamed from: F */
    Object mo94403F(@QueryMap @NotNull Map<String, String> map, @NotNull Continuation<? super LiquidationPriceResult> continuation);

    @Nullable
    /* JADX INFO: renamed from: l */
    Object mo94404l(@QueryMap @NotNull Map<String, String> map, @NotNull Continuation<? super MaxQtyResult> continuation);

    @Nullable
    /* JADX INFO: renamed from: q */
    Object mo94405q(@QueryMap @NotNull Map<String, String> map, @NotNull Continuation<? super LotCostDeltaResult> continuation);

    @Nullable
    /* JADX INFO: renamed from: w */
    Object mo94406w(@QueryMap @NotNull Map<String, String> map, @NotNull Continuation<? super CostResult> continuation);
}
