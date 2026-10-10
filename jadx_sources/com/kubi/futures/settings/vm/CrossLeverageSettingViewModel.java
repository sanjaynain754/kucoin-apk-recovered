package com.kubi.futures.settings.vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import cm.C5003h;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.compliance.leverage.EuropeUnlockLeverageViewModel;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.service.KuMexDepend;
import com.tencent.bugly.proguard.C33556b3;
import java.math.BigDecimal;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;
import th.InterfaceC44980d;

/* JADX INFO: compiled from: CrossLeverageSettingViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\nJ\u001e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\nJ\u0016\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aJ\u0010\u0010 \u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0006\u0010!\u001a\u00020\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR%\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00100\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR%\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00100\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\b¨\u0006\""}, m90084d2 = {"Lcom/kubi/futures/settings/vm/CrossLeverageSettingViewModel;", "Lcom/kubi/futures/compliance/leverage/EuropeUnlockLeverageViewModel;", "<init>", "()V", "userMaxLeverage", "Landroidx/lifecycle/MutableLiveData;", "Ljava/math/BigDecimal;", "getUserMaxLeverage", "()Landroidx/lifecycle/MutableLiveData;", "_crossTrialMaxLeverage", "", "crossTrialMaxLeverage", "Landroidx/lifecycle/LiveData;", "getCrossTrialMaxLeverage", "()Landroidx/lifecycle/LiveData;", "submitResult", "Lkotlin/Pair;", "", "getSubmitResult", "batchSubmitResult", "getBatchSubmitResult", "unifyPosOrderMargin", "getUnifyPosOrderMargin", "fetchUserMaxLeverage", "", "symbol", "", "isTrial", "submitLeverage", "leverage", "submitAllLeverage", "primarySymbol", "fetchUnifyPosOrderMargin", "getUsefulLeverage", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class CrossLeverageSettingViewModel extends EuropeUnlockLeverageViewModel {

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<BigDecimal> f23478a0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<Boolean> f23479b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final LiveData<Boolean> f23480c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<Pair<Boolean, Throwable>> f23481d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final MutableLiveData<Pair<Boolean, Throwable>> f23482e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final MutableLiveData<BigDecimal> f23483f0;

    @NotNull
    /* JADX INFO: renamed from: A */
    public final MutableLiveData<Pair<Boolean, Throwable>> m26357A() {
        return this.f23482e0;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final LiveData<Boolean> m26358B() {
        return this.f23480c0;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final MutableLiveData<Pair<Boolean, Throwable>> m26359C() {
        return this.f23481d0;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public MutableLiveData<BigDecimal> mo26360D() {
        return this.f23483f0;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final BigDecimal m26361E() {
        return KuMexDepend.f30378a.m35905g().c() ? C5003h.m5397a(this.f23478a0.getValue()) : new BigDecimal(5);
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final MutableLiveData<BigDecimal> m26362F() {
        return this.f23478a0;
    }

    /* JADX INFO: renamed from: G */
    public final void m26363G(@NotNull String primarySymbol, @NotNull String leverage) {
        Intrinsics.checkNotNullParameter(primarySymbol, "primarySymbol");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new CrossLeverageSettingViewModel$submitAllLeverage$1(primarySymbol, leverage, this, null), 2, null);
    }

    /* JADX INFO: renamed from: H */
    public final void m26364H(@NotNull String symbol, @NotNull String leverage, boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new CrossLeverageSettingViewModel$submitLeverage$1(z11, symbol, leverage, this, null), 2, null);
    }

    /* JADX INFO: renamed from: y */
    public void mo26365y(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new CrossLeverageSettingViewModel$fetchUnifyPosOrderMargin$1(symbol, this, null), 2, null);
    }

    /* JADX INFO: renamed from: z */
    public final void m26366z(@NotNull String symbol, boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), symbol, false, 2, null);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new CrossLeverageSettingViewModel$fetchUserMaxLeverage$1(z11, symbol, this, C41014a.m89921F(contractEntityM99529O != null ? contractEntityM99529O.getMaxLeverage() : null, C33556b3.f68995S), null), 2, null);
    }

    public CrossLeverageSettingViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.f23479b0 = mutableLiveData;
        this.f23480c0 = mutableLiveData;
        this.f23481d0 = new MutableLiveData<>();
        this.f23482e0 = new MutableLiveData<>();
        this.f23483f0 = new MutableLiveData<>();
    }
}
