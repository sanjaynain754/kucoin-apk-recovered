package com.kubi.core.biz.kline;

import com.kubi.core.base.TradeAccountType;
import com.kubi.core.base.arch.mvi.AbsTradeBaseBizVM;
import com.kubi.core.base.quote.inner.NftInfoObserverHandler;
import com.kubi.utils.C27063n;
import io.reactivex.disposables.CompositeDisposable;
import org.jetbrains.annotations.NotNull;
import p756xc.NFTInfoResponse;
import p756xc.NTFInfo;
import p756xc.Request;
import p827zc.AbstractC46753c;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.kline.q, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KLineNtfVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/core/biz/kline/KLineNtfVM;", "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizVM;", "Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent;", "Lcom/kubi/core/biz/kline/KLineNtfContract$UiState;", "repoProvider", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "<init>", "(Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;)V", "destroyDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "initState", "getInitState", "()Lcom/kubi/core/biz/kline/KLineNtfContract$UiState;", "onCleared", "", "sendBizIntent", "intent", "getKLinePosition", "Lcom/kubi/core/biz/kline/KLinePosition;", "reloadNftInfo", "symbol", "", "isAutoShow", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KLineNtfVM extends AbsTradeBaseBizVM<KLineNtfContract$UiIntent, UiState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final CompositeDisposable f20418X;

    /* JADX INFO: renamed from: A */
    public final KLinePosition m21795A() {
        int iM66765c = C27063n.m66765c("k_panel_position", 0, 1, null);
        if (iM66765c == 0) {
            return KLinePosition.c.f20421a;
        }
        if (iM66765c != 1) {
            return iM66765c != 2 ? KLinePosition.c.f20421a : KLinePosition.b.f20420a;
        }
        return KLinePosition.a.f20419a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineNtfVM(@NotNull AbstractC46753c repoProvider) {
        super(repoProvider);
        Intrinsics.checkNotNullParameter(repoProvider, "repoProvider");
        this.f20418X = new CompositeDisposable();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public static final Unit m21777D(KLineNtfVM kLineNtfVM, String str, final NFTInfoResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSymbol(), ((UiState) kLineNtfVM.getState()).getSymbol())) {
            final boolean zM21796B = kLineNtfVM.m21796B(str);
            if (zM21796B) {
                KLineStorageId.f20422a.m21802c(it.getSymbol());
            }
            kLineNtfVM.updateState(new Function1() { // from class: com.kubi.core.biz.kline.p
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KLineNtfVM.m21778E(it, zM21796B, (UiState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static final UiState m21778E(NFTInfoResponse nFTInfoResponse, boolean z11, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UiState.copy$default(updateState, null, nFTInfoResponse.getInfo(), null, false, false, z11, 29, null);
    }

    /* JADX INFO: renamed from: G */
    public static final UiState m21779G(KLineNtfContract$UiIntent kLineNtfContract$UiIntent, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UiState.copy$default(updateState, ((KLineNtfContract$UiIntent.SymbolChange) kLineNtfContract$UiIntent).getSymbol(), new NTFInfo(null, null, false, null, 15, null), null, false, false, false, 60, null);
    }

    /* JADX INFO: renamed from: H */
    public static final UiState m21780H(UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UiState.copy$default(updateState, null, null, null, true, false, false, 55, null);
    }

    /* JADX INFO: renamed from: I */
    public static final UiState m21781I(UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UiState.copy$default(updateState, null, null, null, false, false, false, 55, null);
    }

    /* JADX INFO: renamed from: J */
    public static final UiState m21782J(KLinePosition kLinePosition, boolean z11, boolean z12, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UiState.copy$default(updateState, null, null, kLinePosition, false, z11, z12, 11, null);
    }

    /* JADX INFO: renamed from: K */
    public static final UiState m21783K(boolean z11, boolean z12, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UiState.copy$default(updateState, null, null, null, false, z11, z12, 15, null);
    }

    /* JADX INFO: renamed from: L */
    public static final UiState m21784L(UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UiState.copy$default(updateState, null, null, null, false, false, false, 47, null);
    }

    /* JADX INFO: renamed from: M */
    public static final UiState m21785M(UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UiState.copy$default(updateState, null, null, null, false, true, false, 47, null);
    }

    /* JADX INFO: renamed from: C */
    public final void m21797C(final String str) {
        new NftInfoObserverHandler().mo21152a(new Request(str), this.f20418X, new Function1() { // from class: com.kubi.core.biz.kline.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KLineNtfVM.m21777D(this.f20414b, str, (NFTInfoResponse) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public void m21798F(@NotNull final KLineNtfContract$UiIntent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.m21025p(intent);
        if (intent instanceof KLineNtfContract$UiIntent.SymbolChange) {
            KLineNtfContract$UiIntent.SymbolChange symbolChange = (KLineNtfContract$UiIntent.SymbolChange) intent;
            if (!Intrinsics.areEqual(symbolChange.getTradeAccountType(), TradeAccountType.Margin.INSTANCE) && !Intrinsics.areEqual(symbolChange.getTradeAccountType(), TradeAccountType.IsolatedMargin.INSTANCE)) {
                m21797C(symbolChange.getSymbol());
            }
            updateState(new Function1() { // from class: com.kubi.core.biz.kline.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KLineNtfVM.m21779G(intent, (UiState) obj);
                }
            });
            return;
        }
        if (intent instanceof KLineNtfContract$UiIntent.ChangeInCallAuctionTrade) {
            if (((KLineNtfContract$UiIntent.ChangeInCallAuctionTrade) intent).getIsInCallAuctionTrade()) {
                updateState(new Function1() { // from class: com.kubi.core.biz.kline.i
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return KLineNtfVM.m21780H((UiState) obj);
                    }
                });
                return;
            } else {
                updateState(new Function1() { // from class: com.kubi.core.biz.kline.j
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return KLineNtfVM.m21781I((UiState) obj);
                    }
                });
                return;
            }
        }
        final boolean z11 = false;
        if (intent instanceof KLineNtfContract$UiIntent.RefreshPosition) {
            final KLinePosition kLinePositionM21795A = m21795A();
            final boolean z12 = !Intrinsics.areEqual(kLinePositionM21795A, KLinePosition.b.f20420a) && ((UiState) getState()).getIsShowKLineContent();
            if ((!Intrinsics.areEqual(kLinePositionM21795A, KLinePosition.c.f20421a) || !z12 || !((UiState) getState()).getIsShowNftContent()) && ((UiState) getState()).getIsShowNftContent()) {
                z11 = true;
            }
            updateState(new Function1() { // from class: com.kubi.core.biz.kline.k
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KLineNtfVM.m21782J(kLinePositionM21795A, z12, z11, (UiState) obj);
                }
            });
            return;
        }
        if (!(intent instanceof KLineNtfContract$UiIntent.ClickNftToggleBtn)) {
            if (intent instanceof KLineNtfContract$UiIntent.KLineHide) {
                updateState(new Function1() { // from class: com.kubi.core.biz.kline.m
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return KLineNtfVM.m21784L((UiState) obj);
                    }
                });
                return;
            } else {
                if (!(intent instanceof KLineNtfContract$UiIntent.KLineShow)) {
                    throw new NoWhenBranchMatchedException();
                }
                updateState(new Function1() { // from class: com.kubi.core.biz.kline.n
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return KLineNtfVM.m21785M((UiState) obj);
                    }
                });
                return;
            }
        }
        boolean isShowNftContent = ((UiState) getState()).getIsShowNftContent();
        final boolean z13 = !isShowNftContent;
        if ((isShowNftContent || C11898b.m21767f() || !C11898b.m21769h()) && ((UiState) getState()).getIsShowKLineContent()) {
            z11 = true;
        }
        updateState(new Function1() { // from class: com.kubi.core.biz.kline.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KLineNtfVM.m21783K(z11, z13, (UiState) obj);
            }
        });
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public UiState getInitState() {
        return new UiState(null, null, null, false, false, false, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public final boolean m21796B(String str) {
        if (C11898b.m21769h() && ((UiState) getState()).getIsShowKLineContent()) {
            return false;
        }
        return !KLineStorageId.f20422a.m21801b(str);
    }

    @Override // com.kubi.mvi.state.BaseStateVM, com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f20418X.clear();
    }
}
