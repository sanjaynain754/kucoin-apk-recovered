package w60;

import com.kubi.broker.MultiBizType;
import com.kubi.kumex.data.trade.model.ClosePositionSizeEntity;
import com.kubi.kumex.data.trade.model.PositionModeEntity;
import com.kubi.kumex.data.trade.model.SubmitAutoDepositEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import tg.InterfaceC44942a;

/* JADX INFO: renamed from: w60.a */
/* JADX INFO: compiled from: HedgeBizInterfaceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\tH\u0016¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/unify/unify/hedge/HedgeBizInterfaceImpl;", "Lcom/kubi/function/hedge/IHedgeBizInterface;", "<init>", "()V", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "fetchPositionModeAndSave", "", "isTrial", "", "observePositionMode", "Lkotlinx/coroutines/flow/Flow;", "getPositionModeFromCache", "fetchHedgeClosePositionSize", "", "Lcom/kubi/kumex/data/trade/model/ClosePositionSizeEntity;", "symbol", "submitHedgeAutoDepositMargin", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/trade/model/SubmitAutoDepositEntity;", "fetchHedgeAutoDepositMargin", "Lcom/kubi/kumex/data/trade/model/AutoDepositStatusEntity;", "submitPositionMode", "Lcom/kubi/kumex/data/trade/model/PositionModeEntity;", "positionMode", "hedgeFeatureAvailable", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45742a implements InterfaceC44942a {
    @Override // tg.InterfaceC44944c
    /* JADX INFO: renamed from: U */
    public boolean mo89034U() {
        return false;
    }

    @Override // tg.InterfaceC44944c
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public PositionModeEntity mo89032F0(boolean z11, @NotNull PositionModeEntity positionMode) {
        Intrinsics.checkNotNullParameter(positionMode, "positionMode");
        return positionMode;
    }

    @Override // tg.InterfaceC44944c
    @NotNull
    /* JADX INFO: renamed from: T0 */
    public Object mo89033T0(boolean z11, @NotNull SubmitAutoDepositEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return new Object();
    }

    @Override // tg.InterfaceC44943b
    @NotNull
    /* JADX INFO: renamed from: V0 */
    public String mo89035V0(boolean z11) {
        return "ONEWAY";
    }

    @Override // tg.InterfaceC44944c
    @NotNull
    /* JADX INFO: renamed from: W0 */
    public List<ClosePositionSizeEntity> mo89036W0(@NotNull String symbol, boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return CollectionsKt.emptyList();
    }

    @Override // tg.InterfaceC44943b
    @NotNull
    /* JADX INFO: renamed from: a0 */
    public String mo89037a0(boolean z11) {
        return "ONEWAY";
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.UNIFIED;
    }

    @Override // tg.InterfaceC44943b
    @NotNull
    /* JADX INFO: renamed from: x0 */
    public InterfaceC41634e<String> mo89038x0(boolean z11) {
        return C41636g.m90889M("ONEWAY");
    }
}
