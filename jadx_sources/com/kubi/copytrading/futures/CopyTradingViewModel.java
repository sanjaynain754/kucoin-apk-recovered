package com.kubi.copytrading.futures;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.kubi.copytrading.CopyTradingConfig;
import com.kubi.copytrading.CopytdApi;
import com.kubi.mvi.p102vm.BaseVM;
import com.kubi.user.config.UserInfo;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: CopyTradingViewModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0012\u001a\u00020\u0013J\u0015\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\r0\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/copytrading/futures/CopyTradingViewModel;", "Lcom/kubi/mvi/vm/BaseVM;", "<init>", "()V", "api", "Lcom/kubi/copytrading/CopytdApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/copytrading/CopytdApi;", "api$delegate", "Lkotlin/Lazy;", "_copyPositionCount", "Landroidx/lifecycle/MutableLiveData;", "", "copyPositionCount", "Landroidx/lifecycle/LiveData;", "getCopyPositionCount", "()Landroidx/lifecycle/LiveData;", "fetchCopyTrading", "", "resetCopyPositionCount", "value", "(Ljava/lang/Integer;)V", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CopyTradingViewModel extends BaseVM {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f19899V = LazyKt.lazy(new Function0() { // from class: com.kubi.copytrading.futures.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CopyTradingViewModel.m20861q();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<Integer> f19900W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final LiveData<Integer> f19901X;

    /* JADX INFO: renamed from: r */
    public final void m20862r() {
        if (CopyTradingConfig.f19710a.m20609z() && UserInfo.a.n()) {
            launchOnMain(new CopyTradingViewModel$fetchCopyTrading$1(this, null));
        } else {
            this.f19900W.setValue(0);
        }
    }

    /* JADX INFO: renamed from: s */
    public final CopytdApi m20863s() {
        return (CopytdApi) this.f19899V.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final LiveData<Integer> m20864t() {
        return this.f19901X;
    }

    /* JADX INFO: renamed from: u */
    public final void m20865u(@Nullable Integer num) {
        this.f19900W.setValue(num);
    }

    public CopyTradingViewModel() {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(0);
        this.f19900W = mutableLiveData;
        this.f19901X = mutableLiveData;
    }

    /* JADX INFO: renamed from: q */
    public static final CopytdApi m20861q() {
        return (CopytdApi) C42597a.m93388d().create(CopytdApi.class);
    }
}
