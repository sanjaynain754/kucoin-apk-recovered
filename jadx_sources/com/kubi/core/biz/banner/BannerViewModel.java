package com.kubi.core.biz.banner;

import af.C0299d;
import androidx.lifecycle.ViewModelKt;
import com.kubi.core.base.arch.mvi.AbsTradeBaseBizVM;
import com.kubi.core.spot.entity.SpotBannerEntity;
import com.kubi.network.restful.C19321b;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import er.C37237b;
import gr.C38000b;
import gr.C38006h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p827zc.AbstractC46753c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import se.InterfaceC44395a;

/* JADX INFO: compiled from: BannerViewModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u001f\u001a\u00020 H\u0002R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, m90084d2 = {"Lcom/kubi/core/biz/banner/BannerViewModel;", "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizVM;", "Lcom/kubi/core/biz/banner/SpotBannerContract$Intent;", "Lcom/kubi/core/biz/banner/SpotBannerContract$SpotBannerUiState;", "repoProvider", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "<init>", "(Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;)V", "api", "Lcom/kubi/core/spot/business/mvi/ISpotTradeApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/core/spot/business/mvi/ISpotTradeApi;", "api$delegate", "Lkotlin/Lazy;", "protocolScope", "Lcom/kubi/core/spot/utils/ParentCoroutineScope;", "subPushChannelApi", "Lcom/kubi/core/biz/banner/IRestfulApi;", "getSubPushChannelApi", "()Lcom/kubi/core/biz/banner/IRestfulApi;", "subPushChannelApi$delegate", "initState", "getInitState", "()Lcom/kubi/core/biz/banner/SpotBannerContract$SpotBannerUiState;", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "", "sendBizIntent", "intent", "fetchGetNoticeList", "Lkotlinx/coroutines/Job;", "symbol", "", "subscribeBannerData", "getNoticeList", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/core/spot/entity/SpotBannerEntity;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BannerViewModel extends AbsTradeBaseBizVM<SpotBannerContract$Intent, SpotBannerUiState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f20138X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final C0299d f20139Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f20140Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerViewModel(@NotNull AbstractC46753c repoProvider) {
        super(repoProvider);
        Intrinsics.checkNotNullParameter(repoProvider, "repoProvider");
        this.f20138X = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.banner.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BannerViewModel.m21260z();
            }
        });
        this.f20139Y = new C0299d(C42911a.m94120b());
        this.f20140Z = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.banner.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BannerViewModel.m21250I();
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public static final SpotBannerUiState m21248G(SpotBannerUiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return SpotBannerUiState.copy$default(updateState, CollectionsKt.emptyList(), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    public static final SpotBannerUiState m21249H(BannerViewModel bannerViewModel, SpotBannerUiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return SpotBannerUiState.copy$default(updateState, ((SpotBannerUiState) bannerViewModel.getState()).getBannerNoticeList(), null, 2, null);
    }

    /* JADX INFO: renamed from: I */
    public static final IRestfulApi m21250I() {
        return (IRestfulApi) new C19321b.a().m42777b(new C38000b(C37237b.m83282e("network/channel_default"))).m42778c(new C38006h()).m42776a().m42772b(IRestfulApi.class);
    }

    /* JADX INFO: renamed from: B */
    public final InterfaceC44395a m21262B() {
        return (InterfaceC44395a) this.f20138X.getValue();
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public SpotBannerUiState getInitState() {
        return new SpotBannerUiState(null, null, 3, null);
    }

    /* JADX INFO: renamed from: E */
    public final IRestfulApi m21265E() {
        return (IRestfulApi) this.f20140Z.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public void m21266F(@NotNull SpotBannerContract$Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.m21025p(intent);
        if (intent instanceof SpotBannerContract$Intent.SymbolChange) {
            updateState(new Function1() { // from class: com.kubi.core.biz.banner.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BannerViewModel.m21248G((SpotBannerUiState) obj);
                }
            });
            m21261A(((SpotBannerContract$Intent.SymbolChange) intent).getSymbol());
            return;
        }
        if (intent instanceof SpotBannerContract$Intent.GetNoticeList) {
            m21261A(((SpotBannerContract$Intent.GetNoticeList) intent).getSymbol());
            return;
        }
        if (intent instanceof SpotBannerContract$Intent.JumpDetails) {
            new SpotBannerDataOperator(((SpotBannerUiState) getState()).getBannerNoticeList()).m21300c(((SpotBannerContract$Intent.JumpDetails) intent).getCurrentIndex());
            Unit unit = Unit.INSTANCE;
        } else {
            if (!(intent instanceof SpotBannerContract$Intent.Close)) {
                throw new NoWhenBranchMatchedException();
            }
            new SpotBannerDataOperator(((SpotBannerUiState) getState()).getBannerNoticeList()).m21298a(((SpotBannerContract$Intent.Close) intent).getBannerEntity());
            updateState(new Function1() { // from class: com.kubi.core.biz.banner.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BannerViewModel.m21249H(this.f20148b, (SpotBannerUiState) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: J */
    public final InterfaceC41775x1 m21267J(String str) {
        return C41696j.m91104d(this.f20139Y, null, null, new BannerViewModel$subscribeBannerData$1(this, str, null), 3, null);
    }

    /* JADX INFO: renamed from: z */
    public static final InterfaceC44395a m21260z() {
        return (InterfaceC44395a) C42597a.m93387c().create(InterfaceC44395a.class);
    }

    /* JADX INFO: renamed from: A */
    public final InterfaceC41775x1 m21261A(String str) {
        return C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new BannerViewModel$fetchGetNoticeList$1(this, str, null), 3, null);
    }

    /* JADX INFO: renamed from: D */
    public final InterfaceC41634e<SpotBannerEntity> m21264D(String str) {
        return m21262B().m97924c("KC", "default", str);
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        this.f20139Y.close();
    }
}
