package com.kubi.futures.settings.vm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.sdk.BaseViewModel;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModifyPositionModeViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/futures/settings/vm/ModifyPositionModeViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "loading", "Landroidx/lifecycle/MutableLiveData;", "", "getLoading", "()Landroidx/lifecycle/MutableLiveData;", DbParams.KEY_CHANNEL_RESULT, "Lkotlin/Pair;", "", "getResult", "submitPositionMode", "", "positionMode", "", "isTrial", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ModifyPositionModeViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<Boolean> f23495X = new MutableLiveData<>();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Pair<Boolean, Throwable>> f23496Y = new MutableLiveData<>();

    @NotNull
    /* JADX INFO: renamed from: p */
    public final MutableLiveData<Boolean> m26402p() {
        return this.f23495X;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final MutableLiveData<Pair<Boolean, Throwable>> m26403q() {
        return this.f23496Y;
    }

    /* JADX INFO: renamed from: r */
    public final void m26404r(@NotNull String positionMode, boolean z11) {
        Intrinsics.checkNotNullParameter(positionMode, "positionMode");
        this.f23495X.setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new ModifyPositionModeViewModel$submitPositionMode$1(positionMode, z11, this, null), 2, null);
    }
}
