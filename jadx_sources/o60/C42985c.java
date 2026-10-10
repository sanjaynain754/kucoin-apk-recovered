package o60;

import cm.LotCostDeltaResult;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.data.trade.model.CostResult;
import com.kubi.kumex.data.trade.model.LiquidationPriceResult;
import com.kubi.kumex.data.trade.model.MaxQtyResult;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p595rg.InterfaceC44073a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: o60.c */
/* JADX INFO: compiled from: ICalculateApiDelegate.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J$\u0010\r\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0096@¢\u0006\u0002\u0010\u0012J$\u0010\u0013\u001a\u00020\u00142\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0096@¢\u0006\u0002\u0010\u0012J$\u0010\u0015\u001a\u00020\u00162\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0096@¢\u0006\u0002\u0010\u0012J$\u0010\u0017\u001a\u00020\u00182\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0096@¢\u0006\u0002\u0010\u0012R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/unify/unify/common/calculate/ICalculateApiDelegate;", "Lcom/kubi/function/common/IMultiCalculateApi;", "<init>", "()V", "api", "Lcom/kubi/unify/unify/common/calculate/ICalculateApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/unify/unify/common/calculate/ICalculateApi;", "api$delegate", "Lkotlin/Lazy;", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "fetchMaxQty", "Lcom/kubi/kumex/data/trade/model/MaxQtyResult;", ReportDataTable.COLUMN_PARAMS, "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCost", "Lcom/kubi/kumex/data/trade/model/CostResult;", "fetchLiquidationPrice", "Lcom/kubi/kumex/data/trade/model/LiquidationPriceResult;", "fetchLotCostDelta", "Lcom/kubi/kumex/data/trade/model/LotCostDeltaResult;", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42985c implements InterfaceC44073a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f95117a = LazyKt.lazy(new Function0() { // from class: o60.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C42985c.m94402a0();
        }
    });

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.UNIFIED;
    }

    /* JADX INFO: renamed from: x0 */
    public final InterfaceC42983a m94407x0() {
        return (InterfaceC42983a) this.f95117a.getValue();
    }

    /* JADX INFO: renamed from: a0 */
    public static final InterfaceC42983a m94402a0() {
        return (InterfaceC42983a) C42597a.m93388d().create(InterfaceC42983a.class);
    }

    @Override // p595rg.InterfaceC44073a
    @Nullable
    /* JADX INFO: renamed from: F */
    public Object mo94403F(@NotNull Map<String, String> map, @NotNull Continuation<? super LiquidationPriceResult> continuation) {
        return m94407x0().m94397F(map, continuation);
    }

    @Override // p595rg.InterfaceC44073a
    @Nullable
    /* JADX INFO: renamed from: l */
    public Object mo94404l(@NotNull Map<String, String> map, @NotNull Continuation<? super MaxQtyResult> continuation) {
        return m94407x0().m94398l(map, continuation);
    }

    @Override // p595rg.InterfaceC44073a
    @Nullable
    /* JADX INFO: renamed from: q */
    public Object mo94405q(@NotNull Map<String, String> map, @NotNull Continuation<? super LotCostDeltaResult> continuation) {
        return m94407x0().m94399q(map, continuation);
    }

    @Override // p595rg.InterfaceC44073a
    @Nullable
    /* JADX INFO: renamed from: w */
    public Object mo94406w(@NotNull Map<String, String> map, @NotNull Continuation<? super CostResult> continuation) {
        return m94407x0().m94400w(map, continuation);
    }
}
