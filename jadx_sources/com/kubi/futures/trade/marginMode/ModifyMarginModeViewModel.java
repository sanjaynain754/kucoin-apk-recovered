package com.kubi.futures.trade.marginMode;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kubi.kumex.data.platform.model.ModifyMarginModeResultEntity;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModifyMarginModeViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR#\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/futures/trade/marginMode/ModifyMarginModeViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "loading", "Landroidx/lifecycle/MutableLiveData;", "", "getLoading", "()Landroidx/lifecycle/MutableLiveData;", "submitResult", "Lkotlin/Pair;", "Lcom/kubi/kumex/data/platform/model/ModifyMarginModeResultEntity;", "getSubmitResult", "submitMarginMode", "", "symbol", "", "marginMode", "isTrial", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ModifyMarginModeViewModel extends ViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final MutableLiveData<Boolean> f23800V = new MutableLiveData<>();

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<Pair<Boolean, ModifyMarginModeResultEntity>> f23801W = new MutableLiveData<>();

    @NotNull
    /* JADX INFO: renamed from: n */
    public final MutableLiveData<Boolean> m27026n() {
        return this.f23800V;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final MutableLiveData<Pair<Boolean, ModifyMarginModeResultEntity>> m27027o() {
        return this.f23801W;
    }

    /* JADX INFO: renamed from: p */
    public final void m27028p(@NotNull String symbol, @NotNull String marginMode, boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(marginMode, "marginMode");
        this.f23800V.setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new ModifyMarginModeViewModel$submitMarginMode$1(this, symbol, marginMode, z11, null), 2, null);
    }
}
