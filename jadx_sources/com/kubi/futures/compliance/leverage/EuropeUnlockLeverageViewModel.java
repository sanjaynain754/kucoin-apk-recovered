package com.kubi.futures.compliance.leverage;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.futures.data.compliance.entity.EuropeUnlockLeverageLevelEntity;
import com.kubi.futures.data.compliance.entity.EuropeUnlockLeverageLevelTaskEntity;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.sdk.BaseViewModel;
import java.util.List;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import sh.EuropeUnlockLeverageComposeEntity;

/* JADX INFO: compiled from: EuropeUnlockLeverageViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fR'\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR-\u0010\u000b\u001a\u001e\u0012\u001a\u0012\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\n¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/futures/compliance/leverage/EuropeUnlockLeverageViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "levelLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageLevelEntity;", "", "getLevelLiveData", "()Landroidx/lifecycle/MutableLiveData;", "tasksLiveData", "", "Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageLevelTaskEntity;", "getTasksLiveData", "europeComposeData", "Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageComposeEntity;", "getEuropeComposeData", "fetchEuropeUnlockLeverageLevel", "", "fetchEuropeUnlockLeverageLevelTasks", "fetchEuropeComposeTasks", "getLevel", "getTasks", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class EuropeUnlockLeverageViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<Pair<EuropeUnlockLeverageLevelEntity, Throwable>> f22623X = new MutableLiveData<>();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Pair<List<EuropeUnlockLeverageLevelTaskEntity>, Throwable>> f22624Y = new MutableLiveData<>();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<EuropeUnlockLeverageComposeEntity> f22625Z = new MutableLiveData<>();

    /* JADX INFO: renamed from: p */
    public final void m24682p() {
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        if (kuMexDepend.m35905g().c() && kuMexDepend.m35906h()) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new EuropeUnlockLeverageViewModel$fetchEuropeComposeTasks$1(this, null), 2, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final MutableLiveData<EuropeUnlockLeverageComposeEntity> m24685s() {
        return this.f22625Z;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public final EuropeUnlockLeverageLevelEntity m24686t() {
        Pair<EuropeUnlockLeverageLevelEntity, Throwable> value = this.f22623X.getValue();
        if (value != null) {
            return value.getFirst();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final MutableLiveData<Pair<EuropeUnlockLeverageLevelEntity, Throwable>> m24687u() {
        return this.f22623X;
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public final List<EuropeUnlockLeverageLevelTaskEntity> m24688v() {
        Pair<List<EuropeUnlockLeverageLevelTaskEntity>, Throwable> value = this.f22624Y.getValue();
        if (value != null) {
            return value.getFirst();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final MutableLiveData<Pair<List<EuropeUnlockLeverageLevelTaskEntity>, Throwable>> m24689w() {
        return this.f22624Y;
    }

    /* JADX INFO: renamed from: q */
    public final void m24683q() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new EuropeUnlockLeverageViewModel$fetchEuropeUnlockLeverageLevel$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m24684r() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new C12889x820b8831(this, null), 2, null);
    }
}
