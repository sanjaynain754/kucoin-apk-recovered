package com.kubi.futures.trade.welfare.vm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.mvi.p102vm.BaseVM;
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

/* JADX INFO: compiled from: FuturesTrialRulesViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/vm/FuturesTrialRulesViewModel;", "Lcom/kubi/mvi/vm/BaseVM;", "<init>", "()V", "trialExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "trial", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "getTrial", "()Landroidx/lifecycle/MutableLiveData;", "fetchTrialDetails", "", "id", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesTrialRulesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesTrialRulesViewModel.kt\ncom/kubi/futures/trade/welfare/vm/FuturesTrialRulesViewModel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,36:1\n47#2,4:37\n*S KotlinDebug\n*F\n+ 1 FuturesTrialRulesViewModel.kt\ncom/kubi/futures/trade/welfare/vm/FuturesTrialRulesViewModel\n*L\n21#1:37,4\n*E\n"})
public final class FuturesTrialRulesViewModel extends BaseVM {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final CoroutineExceptionHandler f24922V = new C14417a(CoroutineExceptionHandler.INSTANCE, this);

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<Pair<Boolean, FuturesWelfareTrialItemEntity>> f24923W = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.vm.FuturesTrialRulesViewModel$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 FuturesTrialRulesViewModel.kt\ncom/kubi/futures/trade/welfare/vm/FuturesTrialRulesViewModel\n*L\n1#1,49:1\n22#2,2:50\n*E\n"})
    public static final class C14417a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FuturesTrialRulesViewModel f24924b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14417a(CoroutineExceptionHandler.Companion companion, FuturesTrialRulesViewModel futuresTrialRulesViewModel) {
            super(companion);
            this.f24924b = futuresTrialRulesViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            this.f24924b.m28748n().postValue(new Pair<>(Boolean.FALSE, null));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m28747d(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(this.f24922V), null, new FuturesTrialRulesViewModel$fetchTrialDetails$1(id2, this, null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final MutableLiveData<Pair<Boolean, FuturesWelfareTrialItemEntity>> m28748n() {
        return this.f24923W;
    }
}
