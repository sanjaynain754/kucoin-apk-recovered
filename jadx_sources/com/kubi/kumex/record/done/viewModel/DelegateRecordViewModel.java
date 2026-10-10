package com.kubi.kumex.record.done.viewModel;

import androidx.lifecycle.MutableLiveData;
import com.kubi.sdk.BaseViewModel;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.kumex.record.done.viewModel.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DelegateRecordViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/kumex/record/done/viewModel/DelegateRecordViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "filtersInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/kumex/record/done/viewModel/FiltersInfo;", "getFiltersInfo", "()Landroidx/lifecycle/MutableLiveData;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DelegateRecordViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<FiltersInfo> f30222X = new MutableLiveData<>();

    @NotNull
    /* JADX INFO: renamed from: p */
    public final MutableLiveData<FiltersInfo> m35716p() {
        return this.f30222X;
    }
}
