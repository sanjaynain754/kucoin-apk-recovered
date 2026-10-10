package com.kubi.futures.compliance;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.sdk.BaseViewModel;
import java.util.List;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import sh.EuropeComplianceLangEntity;

/* JADX INFO: compiled from: EuropeComplianceLangDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rR+\u0010\u0004\u001a\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/futures/compliance/EuropeComplianceLangViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "langLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "Lcom/kubi/futures/data/compliance/entity/EuropeComplianceLangEntity;", "", "getLangLiveData", "()Landroidx/lifecycle/MutableLiveData;", "fetchEuropeLang", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class EuropeComplianceLangViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<Pair<List<EuropeComplianceLangEntity>, Throwable>> f22573X = new MutableLiveData<>();

    @NotNull
    /* JADX INFO: renamed from: q */
    public final MutableLiveData<Pair<List<EuropeComplianceLangEntity>, Throwable>> m24541q() {
        return this.f22573X;
    }

    /* JADX INFO: renamed from: p */
    public final void m24540p() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new EuropeComplianceLangViewModel$fetchEuropeLang$1(this, null), 3, null);
    }
}
