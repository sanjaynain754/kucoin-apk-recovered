package com.kubi.futures.trade.welfare.vm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialEntity;
import com.kubi.mvi.p102vm.BaseVM;
import com.kubi.network.retrofit.utils.C19331c;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FuturesTrialHistoryViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/vm/FuturesTrialHistoryViewModel;", "Lcom/kubi/mvi/vm/BaseVM;", "<init>", "()V", "trialExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "trialLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialEntity;", "getTrialLiveData", "()Landroidx/lifecycle/MutableLiveData;", "loadingStatus", "", "fetchTrialList", "", "status", "", "page", "pageSize", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesTrialHistoryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesTrialHistoryViewModel.kt\ncom/kubi/futures/trade/welfare/vm/FuturesTrialHistoryViewModel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,51:1\n47#2,4:52\n*S KotlinDebug\n*F\n+ 1 FuturesTrialHistoryViewModel.kt\ncom/kubi/futures/trade/welfare/vm/FuturesTrialHistoryViewModel\n*L\n22#1:52,4\n*E\n"})
public final class FuturesTrialHistoryViewModel extends BaseVM {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final CoroutineExceptionHandler f24918V = new C14416a(CoroutineExceptionHandler.INSTANCE, this);

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<Pair<Boolean, FuturesWelfareTrialEntity>> f24919W = new MutableLiveData<>();

    /* JADX INFO: renamed from: X */
    public volatile int f24920X;

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.vm.FuturesTrialHistoryViewModel$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 FuturesTrialHistoryViewModel.kt\ncom/kubi/futures/trade/welfare/vm/FuturesTrialHistoryViewModel\n*L\n1#1,49:1\n23#2,7:50\n*E\n"})
    public static final class C14416a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FuturesTrialHistoryViewModel f24921b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14416a(CoroutineExceptionHandler.Companion companion, FuturesTrialHistoryViewModel futuresTrialHistoryViewModel) {
            super(companion);
            this.f24921b = futuresTrialHistoryViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            if (this.f24921b.f24920X > 0) {
                C19331c.m42836c(exception, null, 2, null);
            } else {
                this.f24921b.m28746n().postValue(new Pair<>(Boolean.FALSE, null));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m28745e(@NotNull String status, int i11, int i12) {
        Intrinsics.checkNotNullParameter(status, "status");
        if (this.f24920X == 0) {
            this.f24919W.setValue(new Pair<>(Boolean.TRUE, null));
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(this.f24918V), null, new FuturesTrialHistoryViewModel$fetchTrialList$1(status, i11, i12, this, null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final MutableLiveData<Pair<Boolean, FuturesWelfareTrialEntity>> m28746n() {
        return this.f24919W;
    }
}
