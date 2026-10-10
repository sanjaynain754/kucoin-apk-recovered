package com.kubi.futures.trade.welfare.distribution;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.kumex.data.market.model.DistributionRetentionEntity;
import com.kubi.sdk.BaseViewModel;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p725wh.InterfaceC45831a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DistributionBonusMainDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR%\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "api", "Lcom/kubi/futures/data/welfare/IWelfareApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/futures/data/welfare/IWelfareApi;", "api$delegate", "Lkotlin/Lazy;", "retentionLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "Lcom/kubi/kumex/data/market/model/DistributionRetentionEntity;", "getRetentionLiveData", "()Landroidx/lifecycle/MutableLiveData;", "fetchRetentionData", "", "code", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DistributionBonusMainViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f24682X = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DistributionBonusMainViewModel.m28475r();
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Pair<Boolean, DistributionRetentionEntity>> f24683Y = new MutableLiveData<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final InterfaceC45831a m28476t() {
        return (InterfaceC45831a) this.f24682X.getValue();
    }

    /* JADX INFO: renamed from: s */
    public final void m28477s(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new DistributionBonusMainViewModel$fetchRetentionData$1(this, code, null), 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final MutableLiveData<Pair<Boolean, DistributionRetentionEntity>> m28478u() {
        return this.f24683Y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final InterfaceC45831a m28475r() {
        return (InterfaceC45831a) C42597a.m93387c().create(InterfaceC45831a.class);
    }
}
