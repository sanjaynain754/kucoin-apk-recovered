package sg;

import com.kubi.kumex.data.platform.model.AllContractLeverageUpdateRequest;
import com.kubi.kumex.data.platform.model.GrayCrossModeEntity;
import com.kubi.kumex.data.platform.model.MarginModeInfoEntity;
import com.kubi.kumex.data.platform.model.ModifyMarginModeResultEntity;
import com.kubi.kumex.data.platform.model.SubmitCrossLeverageEntity;
import com.kubi.kumex.data.trade.model.CrossHedgeQtyMarginEntity;
import com.kubi.kumex.data.trade.model.PositionOrderHoldMarginEntity;
import com.kubi.kumex.data.trade.model.QuoteEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p559qg.InterfaceC43729a;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: sg.b */
/* JADX INFO: compiled from: ICrossBizInterface.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\fH&J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u0007H&J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/function/cross/IMultiCrossApi;", "Lcom/kubi/function/IMultiFunction;", "fetchCrossModeGray", "Lcom/kubi/kumex/data/platform/model/GrayCrossModeEntity;", "isTrial", "", "symbol", "", "fetchAllContractsMarginMode", "", "Lcom/kubi/kumex/data/trade/model/QuoteEntity;", "fetchMarginMode", "", "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;", "submitMarginMode", "Lcom/kubi/kumex/data/platform/model/ModifyMarginModeResultEntity;", "map", "submitCrossLeverage", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/platform/model/SubmitCrossLeverageEntity;", "submitAllContractsLeverage", "Lcom/kubi/kumex/data/platform/model/AllContractLeverageUpdateRequest;", "fetchActiveOrderStatistics", "Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMarginEntity;", "symbols", "fetchPosOrderMargin", "Lcom/kubi/kumex/data/trade/model/PositionOrderHoldMarginEntity;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC44405b extends InterfaceC43729a {
    /* JADX INFO: renamed from: o0 */
    static /* synthetic */ Object m97938o0(InterfaceC44405b interfaceC44405b, String str, Continuation<? super PositionOrderHoldMarginEntity> continuation) {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I0 */
    GrayCrossModeEntity mo24476I0(boolean z11, @NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: M0 */
    CrossHedgeQtyMarginEntity mo24478M0(boolean z11, @NotNull String str);

    /* JADX INFO: renamed from: f0 */
    boolean mo24481f0(boolean z11, @NotNull SubmitCrossLeverageEntity submitCrossLeverageEntity);

    @NotNull
    /* JADX INFO: renamed from: g1 */
    ModifyMarginModeResultEntity mo24483g1(boolean z11, @NotNull Map<String, String> map);

    @NotNull
    /* JADX INFO: renamed from: i0 */
    Map<String, MarginModeInfoEntity> mo24484i0(boolean z11, @NotNull String str);

    @Nullable
    /* JADX INFO: renamed from: n0 */
    List<QuoteEntity> mo24485n0(boolean z11);

    /* JADX INFO: renamed from: Y */
    static /* synthetic */ CrossHedgeQtyMarginEntity m97937Y(InterfaceC44405b interfaceC44405b, boolean z11, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchActiveOrderStatistics");
        }
        if ((i11 & 2) != 0) {
            str = "";
        }
        return interfaceC44405b.mo24478M0(z11, str);
    }

    /* JADX INFO: renamed from: D */
    default boolean mo24473D(@NotNull AllContractLeverageUpdateRequest entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        throw new UnsupportedOperationException("batch leverage only support classic self funds");
    }

    @Nullable
    /* JADX INFO: renamed from: L */
    default Object mo24477L(@NotNull String str, @NotNull Continuation<? super PositionOrderHoldMarginEntity> continuation) {
        return m97938o0(this, str, continuation);
    }
}
