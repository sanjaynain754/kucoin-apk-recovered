package p724wg;

import cm.LotCostDeltaResult;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.data.trade.model.CostResult;
import com.kubi.kumex.data.trade.model.LiquidationPriceResult;
import com.kubi.kumex.data.trade.model.MaxQtyResult;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p595rg.InterfaceC44073a;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: wg.a */
/* JADX INFO: compiled from: ICalculateApiDelegate.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0096@¢\u0006\u0002\u0010\tJ$\u0010\n\u001a\u00020\u000b2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0096@¢\u0006\u0002\u0010\tJ$\u0010\f\u001a\u00020\r2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0096@¢\u0006\u0002\u0010\tJ$\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0096@¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/futures/classic/common/calculate/ICalculateApiDelegate;", "Lcom/kubi/function/common/IMultiCalculateApi;", "<init>", "()V", "fetchMaxQty", "Lcom/kubi/kumex/data/trade/model/MaxQtyResult;", ReportDataTable.COLUMN_PARAMS, "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCost", "Lcom/kubi/kumex/data/trade/model/CostResult;", "fetchLiquidationPrice", "Lcom/kubi/kumex/data/trade/model/LiquidationPriceResult;", "fetchLotCostDelta", "Lcom/kubi/kumex/data/trade/model/LotCostDeltaResult;", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45827a implements InterfaceC44073a {
    @Override // p595rg.InterfaceC44073a
    @Nullable
    /* JADX INFO: renamed from: F */
    public Object mo94403F(@NotNull Map<String, String> map, @NotNull Continuation<? super LiquidationPriceResult> continuation) {
        return new LiquidationPriceResult(null, null, 3, null);
    }

    @Override // p595rg.InterfaceC44073a
    @Nullable
    /* JADX INFO: renamed from: l */
    public Object mo94404l(@NotNull Map<String, String> map, @NotNull Continuation<? super MaxQtyResult> continuation) {
        return new MaxQtyResult(null, null, null, null, 15, null);
    }

    @Override // p595rg.InterfaceC44073a
    @Nullable
    /* JADX INFO: renamed from: q */
    public Object mo94405q(@NotNull Map<String, String> map, @NotNull Continuation<? super LotCostDeltaResult> continuation) {
        return new LotCostDeltaResult(null, null, 3, null);
    }

    @Override // p595rg.InterfaceC44073a
    @Nullable
    /* JADX INFO: renamed from: w */
    public Object mo94406w(@NotNull Map<String, String> map, @NotNull Continuation<? super CostResult> continuation) {
        return new CostResult(null, null, 3, null);
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.CLASSIC;
    }
}
