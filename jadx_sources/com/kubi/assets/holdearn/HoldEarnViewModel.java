package com.kubi.assets.holdearn;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kubi.assets.bill.AccountBillApi;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.flow.InterfaceC41673r;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: HoldEarnViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/assets/holdearn/HoldEarnViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "api", "Lcom/kubi/assets/bill/AccountBillApi;", "kotlin.jvm.PlatformType", "_effect", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/kubi/assets/holdearn/HoldEarnEffect;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "haveJumpToHoldEarnPage", "Landroidx/lifecycle/MutableLiveData;", "", "getHaveJumpToHoldEarnPage", "()Landroidx/lifecycle/MutableLiveData;", "switchHoldEarn", "", "isOpen", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HoldEarnViewModel extends ViewModel {

    /* JADX INFO: renamed from: V */
    public final AccountBillApi f17745V = (AccountBillApi) C42597a.m93386b().create(AccountBillApi.class);

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC41668m<HoldEarnEffect> f17746W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC41673r<HoldEarnEffect> f17747X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Boolean> f17748Y;

    @NotNull
    /* JADX INFO: renamed from: n */
    public final InterfaceC41673r<HoldEarnEffect> m17386n() {
        return this.f17747X;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final MutableLiveData<Boolean> m17387o() {
        return this.f17748Y;
    }

    public HoldEarnViewModel() {
        InterfaceC41668m<HoldEarnEffect> interfaceC41668mM91001b = C41674s.m91001b(0, 0, null, 7, null);
        this.f17746W = interfaceC41668mM91001b;
        this.f17747X = C41636g.m90905b(interfaceC41668mM91001b);
        this.f17748Y = new MutableLiveData<>();
    }

    /* JADX INFO: renamed from: p */
    public final void m17388p(int i11) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new HoldEarnViewModel$switchHoldEarn$1(this, i11, null), 2, null);
    }
}
