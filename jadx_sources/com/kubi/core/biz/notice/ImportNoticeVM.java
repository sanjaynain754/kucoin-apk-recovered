package com.kubi.core.biz.notice;

import af.C0299d;
import androidx.lifecycle.ViewModelKt;
import com.kubi.core.base.arch.mvi.AbsTradeBaseBizVM;
import com.kubi.core.biz.banner.IRestfulApi;
import com.kubi.network.restful.C19321b;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import er.C37237b;
import gr.C38000b;
import gr.C38006h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p827zc.AbstractC46753c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import se.InterfaceC44395a;

/* JADX INFO: compiled from: ImportNoticeVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0016\u0010!\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0082@¢\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, m90084d2 = {"Lcom/kubi/core/biz/notice/ImportNoticeVM;", "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizVM;", "Lcom/kubi/core/biz/notice/ImportNoticeContract$UiIntent;", "Lcom/kubi/core/biz/notice/ImportNoticeContract$UiState;", "repoProvider", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "<init>", "(Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;)V", "api", "Lcom/kubi/core/spot/business/mvi/ISpotTradeApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/core/spot/business/mvi/ISpotTradeApi;", "api$delegate", "Lkotlin/Lazy;", "protocolScope", "Lcom/kubi/core/spot/utils/ParentCoroutineScope;", "subPushChannelApi", "Lcom/kubi/core/biz/banner/IRestfulApi;", "getSubPushChannelApi", "()Lcom/kubi/core/biz/banner/IRestfulApi;", "subPushChannelApi$delegate", "initState", "getInitState", "()Lcom/kubi/core/biz/notice/ImportNoticeContract$UiState;", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "", "sendBizIntent", "intent", "fetchGetImportantNoticeList", "Lkotlinx/coroutines/Job;", "symbol", "", "getRiskWarning", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscribeBannerData", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ImportNoticeVM extends AbsTradeBaseBizVM<ImportNoticeContract$UiIntent, UiState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f20540X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final C0299d f20541Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f20542Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImportNoticeVM(@NotNull AbstractC46753c repoProvider) {
        super(repoProvider);
        Intrinsics.checkNotNullParameter(repoProvider, "repoProvider");
        this.f20540X = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.notice.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImportNoticeVM.m22041z();
            }
        });
        this.f20541Y = new C0299d(C42911a.m94120b());
        this.f20542Z = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.notice.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImportNoticeVM.m22030H();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final InterfaceC44395a m22027B() {
        return (InterfaceC44395a) this.f20540X.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final IRestfulApi m22028E() {
        return (IRestfulApi) this.f20542Z.getValue();
    }

    /* JADX INFO: renamed from: G */
    public static final UiState m22029G(ImportNoticeContract$UiIntent importNoticeContract$UiIntent, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UiState.copy$default(updateState, ((ImportNoticeContract$UiIntent.SymbolChange) importNoticeContract$UiIntent).getSymbol(), null, null, false, false, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final IRestfulApi m22030H() {
        return (IRestfulApi) new C19321b.a().m42777b(new C38000b(C37237b.m83282e("network/channel_default"))).m42778c(new C38006h()).m42776a().m42772b(IRestfulApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final InterfaceC41775x1 m22031I(String str) {
        return C41696j.m91104d(this.f20541Y, null, null, new ImportNoticeVM$subscribeBannerData$1(this, str, null), 3, null);
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public UiState getInitState() {
        return new UiState(null, null, null, false, false, false, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public void m22045F(@NotNull final ImportNoticeContract$UiIntent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.m21025p(intent);
        if (intent instanceof ImportNoticeContract$UiIntent.SymbolChange) {
            updateState(new Function1() { // from class: com.kubi.core.biz.notice.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ImportNoticeVM.m22029G(intent, (UiState) obj);
                }
            });
            String symbol = ((ImportNoticeContract$UiIntent.SymbolChange) intent).getSymbol();
            if (symbol != null) {
                m22042A(symbol);
                return;
            }
            return;
        }
        if (!(intent instanceof ImportNoticeContract$UiIntent.GetNoticeList)) {
            throw new NoWhenBranchMatchedException();
        }
        String symbol2 = ((UiState) getState()).getSymbol();
        if (symbol2 != null) {
            m22042A(symbol2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final InterfaceC44395a m22041z() {
        return (InterfaceC44395a) C42597a.m93387c().create(InterfaceC44395a.class);
    }

    /* JADX INFO: renamed from: A */
    public final InterfaceC41775x1 m22042A(String str) {
        return C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new ImportNoticeVM$fetchGetImportantNoticeList$1(this, str, null), 3, null);
    }

    /* JADX INFO: renamed from: D */
    public final Object m22044D(String str, Continuation<? super Unit> continuation) {
        Object objM42823d = RetrofitFlowExKt.m42823d(m22027B().m97923b(str), false, new ImportNoticeVM$getRiskWarning$2(this, str, null), continuation);
        if (objM42823d == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM42823d;
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        this.f20541Y.close();
    }
}
