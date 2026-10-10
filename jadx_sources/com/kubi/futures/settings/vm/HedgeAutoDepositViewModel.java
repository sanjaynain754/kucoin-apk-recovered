package com.kubi.futures.settings.vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.kumex.data.trade.model.AutoDepositStatus;
import com.kubi.kumex.data.trade.model.SubmitAutoDepositEntity;
import com.kubi.sdk.BaseViewModel;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HedgeAutoDepositViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007R\"\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/futures/settings/vm/HedgeAutoDepositViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "_result", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "", "submitResult", "Landroidx/lifecycle/LiveData;", "getSubmitResult", "()Landroidx/lifecycle/LiveData;", "submitHedgeAutoDeposit", "", "symbol", "", "isTrial", "longOpen", "shortOpen", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HedgeAutoDepositViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<Pair<Boolean, Throwable>> f23484X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final LiveData<Pair<Boolean, Throwable>> f23485Y;

    @NotNull
    /* JADX INFO: renamed from: q */
    public final LiveData<Pair<Boolean, Throwable>> m26376q() {
        return this.f23485Y;
    }

    /* JADX INFO: renamed from: r */
    public final void m26377r(@NotNull String symbol, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new HedgeAutoDepositViewModel$submitHedgeAutoDeposit$1(z11, new SubmitAutoDepositEntity(symbol, new AutoDepositStatus(Boolean.valueOf(z12), Boolean.valueOf(z13), null, 4, null)), this, null), 2, null);
    }

    public HedgeAutoDepositViewModel() {
        MutableLiveData<Pair<Boolean, Throwable>> mutableLiveData = new MutableLiveData<>();
        this.f23484X = mutableLiveData;
        this.f23485Y = mutableLiveData;
    }
}
