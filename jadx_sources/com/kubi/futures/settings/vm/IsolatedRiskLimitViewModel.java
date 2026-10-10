package com.kubi.futures.settings.vm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.data.platform.model.ContractRiskLimitEntity;
import com.kubi.sdk.BaseViewModel;
import java.util.List;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Triple;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IsolatedRiskLimitViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007J\u001e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015R3\u0010\u0004\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/futures/settings/vm/IsolatedRiskLimitViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "riskLimit", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Triple;", "", "", "Lcom/kubi/kumex/data/platform/model/ContractRiskLimitEntity;", "getRiskLimit", "()Landroidx/lifecycle/MutableLiveData;", "submitResult", "getSubmitResult", "fetchRiskLimit", "", "symbol", "", "isTrial", "submitRiskLimit", FirebaseAnalytics.Param.LEVEL, "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class IsolatedRiskLimitViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<Triple<Boolean, List<ContractRiskLimitEntity>, ContractRiskLimitEntity>> f23493X = new MutableLiveData<>();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Boolean> f23494Y = new MutableLiveData<>();

    /* JADX INFO: renamed from: p */
    public final void m26394p(@NotNull String symbol, boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new IsolatedRiskLimitViewModel$fetchRiskLimit$1(symbol, z11, this, null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final MutableLiveData<Triple<Boolean, List<ContractRiskLimitEntity>, ContractRiskLimitEntity>> m26395q() {
        return this.f23493X;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final MutableLiveData<Boolean> m26396r() {
        return this.f23494Y;
    }

    /* JADX INFO: renamed from: s */
    public final void m26397s(@NotNull String symbol, boolean z11, int i11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new IsolatedRiskLimitViewModel$submitRiskLimit$1(this, z11, symbol, i11, null), 2, null);
    }
}
