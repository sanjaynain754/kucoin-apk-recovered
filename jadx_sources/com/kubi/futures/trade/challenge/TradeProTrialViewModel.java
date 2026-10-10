package com.kubi.futures.trade.challenge;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.mvi.p102vm.BaseVM;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: TradeProTrialState.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u0012\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u001a\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\b\u0010\u0018\u001a\u00020\u000bH\u0002R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/futures/trade/challenge/TradeProTrialViewModel;", "Lcom/kubi/mvi/vm/BaseVM;", "<init>", "()V", "tradeProTrialState", "Landroidx/lifecycle/LiveData;", "Lcom/kubi/futures/trade/challenge/TradeProTrialState;", "getTradeProTrialState", "()Landroidx/lifecycle/LiveData;", "activateLoading", "Landroidx/lifecycle/MutableLiveData;", "", "getActivateLoading", "()Landroidx/lifecycle/MutableLiveData;", "activateSuccess", "getActivateSuccess", "markTrialUsed", "", "markTrialActivated", "refreshFromChallenge", "symbol", "", "activateChallengeTrial", "code", "canRefreshChallenge", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradeProTrialViewModel extends BaseVM {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final LiveData<TradeProTrialState> f23748V = TradeProTrialStateStore.f23763a.m26983d();

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<Boolean> f23749W = new MutableLiveData<>();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<Boolean> f23750X = new MutableLiveData<>();

    /* JADX INFO: renamed from: n */
    public final boolean m26965n() {
        BrokerConfig brokerConfig = BrokerConfig.f19211a;
        if (brokerConfig.m20201d().mo4515x() != MultiBizType.CLASSIC) {
            return false;
        }
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        return kuMexDepend.m35905g().c() && kuMexDepend.m35906h() && brokerConfig.m20201d().mo20229O();
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final MutableLiveData<Boolean> m26966o() {
        return this.f23749W;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final MutableLiveData<Boolean> m26967p() {
        return this.f23750X;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final LiveData<TradeProTrialState> m26968q() {
        return this.f23748V;
    }

    /* JADX INFO: renamed from: r */
    public final void m26969r() {
        TradeProTrialStateStore.f23763a.m26985f();
    }

    /* JADX INFO: renamed from: s */
    public final void m26970s() {
        TradeProTrialStateStore.f23763a.m26986g();
    }

    /* JADX INFO: renamed from: b */
    public final void m26964b(@Nullable String str, @Nullable String str2) {
        String strM66668h = C27041f.m66668h(str);
        String strM66668h2 = C27041f.m66668h(str2);
        if (StringsKt.isBlank(strM66668h)) {
            return;
        }
        this.f23749W.postValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new TradeProTrialViewModel$activateChallengeTrial$1(strM66668h, this, strM66668h2, null), 2, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m26971t(@Nullable String str) {
        String strM66668h = C27041f.m66668h(str);
        if (m26965n() && !StringsKt.isBlank(strM66668h)) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new TradeProTrialViewModel$refreshFromChallenge$1(strM66668h, TradeProTrialStateStore.f23763a.m26987h(), null), 2, null);
        } else {
            TradeProTrialStateStore.m26980c(TradeProTrialStateStore.f23763a, 0L, 1, null);
        }
    }
}
