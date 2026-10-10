package com.kubi.futures.settings.vm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import java.math.BigDecimal;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifyCrossLeverageSettingViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/futures/settings/vm/UnifyCrossLeverageSettingViewModel;", "Lcom/kubi/futures/settings/vm/CrossLeverageSettingViewModel;", "<init>", "()V", "unifyPosOrderMargin", "Landroidx/lifecycle/MutableLiveData;", "Ljava/math/BigDecimal;", "getUnifyPosOrderMargin", "()Landroidx/lifecycle/MutableLiveData;", "fetchUnifyPosOrderMargin", "", "symbol", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class UnifyCrossLeverageSettingViewModel extends CrossLeverageSettingViewModel {

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final MutableLiveData<BigDecimal> f23504g0 = new MutableLiveData<>();

    @Override // com.kubi.futures.settings.vm.CrossLeverageSettingViewModel
    @NotNull
    /* JADX INFO: renamed from: D */
    public MutableLiveData<BigDecimal> mo26360D() {
        return this.f23504g0;
    }

    @Override // com.kubi.futures.settings.vm.CrossLeverageSettingViewModel
    /* JADX INFO: renamed from: y */
    public void mo26365y(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new UnifyCrossLeverageSettingViewModel$fetchUnifyPosOrderMargin$1(symbol, this, null), 2, null);
    }
}
