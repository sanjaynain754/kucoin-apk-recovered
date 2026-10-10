package com.kubi.core.biz.symbolbarold;

import com.kubi.core.base.arch.mvi.AbsTradeBaseBizVM;
import com.kubi.core.utils.C12462a;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.margin.api.IMarginService;
import com.kubi.spot.api.ISpotCommonService;
import ee.C37136a;
import gf.C37890n;
import java.math.BigDecimal;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p569qq.C43852m;
import p827zc.AbstractC46753c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import se.InterfaceC44395a;

/* JADX INFO: renamed from: com.kubi.core.biz.symbolbarold.a0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SymbolBarVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/core/biz/symbolbarold/SymbolBarVM;", "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizVM;", "Lcom/kubi/core/biz/symbolbarold/SymbolBarContract$UiIntent;", "Lcom/kubi/core/biz/symbolbarold/SymbolBarContract$UiState;", "repoProvider", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "<init>", "(Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;)V", "api", "Lcom/kubi/core/spot/business/mvi/ISpotTradeApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/core/spot/business/mvi/ISpotTradeApi;", "api$delegate", "Lkotlin/Lazy;", "initState", "getInitState", "()Lcom/kubi/core/biz/symbolbarold/SymbolBarContract$UiState;", "sendBizIntent", "", "intent", "updateLeverInfo", "symbolInfoEntity", "Lcom/kubi/data/entity/SymbolInfoEntity;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SymbolBarVM extends AbsTradeBaseBizVM<SymbolBarContract$UiIntent, UiState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f20897X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SymbolBarVM(@NotNull AbstractC46753c repoProvider) {
        super(repoProvider);
        Intrinsics.checkNotNullParameter(repoProvider, "repoProvider");
        this.f20897X = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.symbolbarold.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SymbolBarVM.m22824t();
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static final UiState m22825w(SymbolBarContract$UiIntent symbolBarContract$UiIntent, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UiState.copy$default(updateState, ((SymbolBarContract$UiIntent.SymbolChange) symbolBarContract$UiIntent).getSymbol(), null, 2, null);
    }

    /* JADX INFO: renamed from: y */
    public static final UiState m22826y(SymbolInfoEntity symbolInfoEntity, boolean z11, boolean z12, BigDecimal bigDecimal, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        String symbol = symbolInfoEntity.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        return UiState.copy$default(updateState, null, new LeverConfig(symbol, z11 || z12, bigDecimal, z12), 1, null);
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public UiState getInitState() {
        return new UiState(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public void m22828v(@NotNull final SymbolBarContract$UiIntent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent instanceof SymbolBarContract$UiIntent.SymbolChange) {
            updateState(new Function1() { // from class: com.kubi.core.biz.symbolbarold.y
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SymbolBarVM.m22825w(intent, (UiState) obj);
                }
            });
            SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(((SymbolBarContract$UiIntent.SymbolChange) intent).getSymbol());
            if (symbolInfoEntityM85601B != null) {
                m22829x(symbolInfoEntityM85601B);
                return;
            }
            return;
        }
        if (intent instanceof SymbolBarContract$UiIntent.TradePanelModelChange) {
            getF20069V().getF104577b().mo85485c(((SymbolBarContract$UiIntent.TradePanelModelChange) intent).getMode());
            return;
        }
        if (!(intent instanceof SymbolBarContract$UiIntent.ToLeverActivity)) {
            throw new NoWhenBranchMatchedException();
        }
        C43852m.m96591c(C12462a.m23402a(), "marginButton", null, null, 12, null);
        String symbol = ((UiState) getState()).getSymbol();
        if (symbol != null) {
            IMarginService.m37900d0(C37136a.f82407a.m83062a(), symbol, ((SymbolBarContract$UiIntent.ToLeverActivity) intent).getIsIsolatedEnable(), false, null, 12, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final InterfaceC44395a m22824t() {
        return (InterfaceC44395a) C42597a.m93387c().create(InterfaceC44395a.class);
    }

    /* JADX INFO: renamed from: x */
    public final void m22829x(final SymbolInfoEntity symbolInfoEntity) {
        final boolean zIsMarginEnabled = symbolInfoEntity.isMarginEnabled();
        final boolean zIsIsolatedMarginTradeEnabled = symbolInfoEntity.isIsolatedMarginTradeEnabled();
        if (ISpotCommonService.f49644a.get().mo59961e()) {
            IMarginService iMarginServiceM83062a = C37136a.f82407a.m83062a();
            String symbol = symbolInfoEntity.getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            final BigDecimal bigDecimalM89921F = C41014a.m89921F(iMarginServiceM83062a.mo37937g0(zIsIsolatedMarginTradeEnabled, symbol), "10");
            updateState(new Function1() { // from class: com.kubi.core.biz.symbolbarold.z
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SymbolBarVM.m22826y(symbolInfoEntity, zIsMarginEnabled, zIsIsolatedMarginTradeEnabled, bigDecimalM89921F, (UiState) obj);
                }
            });
        }
    }
}
