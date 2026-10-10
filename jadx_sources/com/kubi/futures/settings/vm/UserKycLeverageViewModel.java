package com.kubi.futures.settings.vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.futures.model.setting.KycLeverageEntity;
import com.kubi.mvi.p102vm.BaseVM;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p236em.C37213a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UserKycLeverageViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u000eR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/futures/settings/vm/UserKycLeverageViewModel;", "Lcom/kubi/mvi/vm/BaseVM;", "<init>", "()V", "_userKycLeverageInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/futures/model/setting/KycLeverageEntity;", "userKycLeverageInfo", "Landroidx/lifecycle/LiveData;", "getUserKycLeverageInfo", "()Landroidx/lifecycle/LiveData;", "fetchUserLeverageForKyc", "", "symbol", "", "marginMode", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UserKycLeverageViewModel extends BaseVM {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final MutableLiveData<KycLeverageEntity> f23508V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final LiveData<KycLeverageEntity> f23509W;

    /* JADX INFO: renamed from: d */
    public final void m26439d(@NotNull String symbol, @NotNull String marginMode) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(marginMode, "marginMode");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83253c()), null, new UserKycLeverageViewModel$fetchUserLeverageForKyc$1(symbol, marginMode, this, null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final LiveData<KycLeverageEntity> m26440n() {
        return this.f23509W;
    }

    public UserKycLeverageViewModel() {
        MutableLiveData<KycLeverageEntity> mutableLiveData = new MutableLiveData<>();
        this.f23508V = mutableLiveData;
        this.f23509W = mutableLiveData;
    }
}
