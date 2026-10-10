package com.kubi.futures.settings.vm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cm.UnifyChangeLeverageResult;
import com.kubi.kumex.utils.CoroutineExKt;
import com.kubi.network.retrofit.utils.C19331c;
import java.math.BigDecimal;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifyIsolatedLeverageSettingViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010J\u001e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010J\u001e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010J\u001e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010J&\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0018R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/futures/settings/vm/UnifyIsolatedLeverageSettingViewModel;", "Lcom/kubi/futures/settings/vm/UnifyCrossLeverageSettingViewModel;", "<init>", "()V", "current", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/kumex/data/trade/model/UnifyChangeLeverageResult;", "getCurrent", "()Landroidx/lifecycle/MutableLiveData;", TtmlNode.ANNOTATION_POSITION_AFTER, "getAfter", "afterJob", "Lkotlinx/coroutines/Job;", "fetchLeverageCalResultOfCurrent", "", "symbol", "", "leverage", "Ljava/math/BigDecimal;", "positionSide", "fetchLeverageCalResultOfAfter", "refreshCurrentByPosition", "refreshAfterByPosition", "fetchLeverageOfCalResult", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UnifyIsolatedLeverageSettingViewModel extends UnifyCrossLeverageSettingViewModel {

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final MutableLiveData<UnifyChangeLeverageResult> f23505h0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final MutableLiveData<UnifyChangeLeverageResult> f23506i0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: j0 */
    @Nullable
    public InterfaceC41775x1 f23507j0;

    /* JADX INFO: renamed from: N */
    public static final Unit m26430N(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C19331c.m42836c(it, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public final void m26431K(@NotNull String symbol, @NotNull BigDecimal leverage, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        if (leverage.compareTo(BigDecimal.ZERO) <= 0) {
            return;
        }
        InterfaceC41775x1 interfaceC41775x1 = this.f23507j0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f23507j0 = C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new C13519xe7b2da77(this, symbol, leverage, positionSide, null), 2, null);
    }

    /* JADX INFO: renamed from: L */
    public final void m26432L(@NotNull String symbol, @NotNull BigDecimal leverage, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        if (leverage.compareTo(BigDecimal.ZERO) <= 0) {
            return;
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new C13520xb0ee9354(this, symbol, leverage, positionSide, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: M */
    public final Object m26433M(String str, BigDecimal bigDecimal, String str2, Continuation<? super UnifyChangeLeverageResult> continuation) {
        UnifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$1 unifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$1;
        if (continuation instanceof UnifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$1) {
            unifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$1 = (UnifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$1) continuation;
            int i11 = unifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                unifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$1.label = i11 - Integer.MIN_VALUE;
            } else {
                unifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$1 = new UnifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$1(this, continuation);
            }
        } else {
            unifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$1 = new UnifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$1(this, continuation);
        }
        Object objM36471a = unifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = unifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM36471a);
            UnifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$2 unifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$2 = new UnifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$2(str, bigDecimal, str2, null);
            Function1 function1 = new Function1() { // from class: com.kubi.futures.settings.vm.o0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UnifyIsolatedLeverageSettingViewModel.m26430N((Throwable) obj);
                }
            };
            unifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            unifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$1.L$1 = SpillingKt.nullOutSpilledVariable(bigDecimal);
            unifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$1.L$2 = SpillingKt.nullOutSpilledVariable(str2);
            unifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$1.label = 1;
            objM36471a = CoroutineExKt.m36471a(unifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$2, function1, unifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$1);
            if (objM36471a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM36471a);
        }
        UnifyChangeLeverageResult unifyChangeLeverageResult = (UnifyChangeLeverageResult) objM36471a;
        return unifyChangeLeverageResult == null ? new UnifyChangeLeverageResult(null, null, null, null, null, 31, null) : unifyChangeLeverageResult;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final MutableLiveData<UnifyChangeLeverageResult> m26434O() {
        return this.f23506i0;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final MutableLiveData<UnifyChangeLeverageResult> m26435P() {
        return this.f23505h0;
    }

    /* JADX INFO: renamed from: Q */
    public final void m26436Q(@NotNull String symbol, @NotNull BigDecimal leverage, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        if (leverage.compareTo(BigDecimal.ZERO) <= 0) {
            return;
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new UnifyIsolatedLeverageSettingViewModel$refreshAfterByPosition$1(this, symbol, leverage, positionSide, null), 2, null);
    }

    /* JADX INFO: renamed from: R */
    public final void m26437R(@NotNull String symbol, @NotNull BigDecimal leverage, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        if (leverage.compareTo(BigDecimal.ZERO) <= 0) {
            return;
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new UnifyIsolatedLeverageSettingViewModel$refreshCurrentByPosition$1(this, symbol, leverage, positionSide, null), 2, null);
    }
}
