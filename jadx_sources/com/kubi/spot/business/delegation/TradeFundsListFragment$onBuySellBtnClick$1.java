package com.kubi.spot.business.delegation;

import com.kubi.data.DataInitManager;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.spot.R$string;
import com.kubi.utils.ToastCompat;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: TradeFundsListFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.business.delegation.TradeFundsListFragment$onBuySellBtnClick$1", m90122f = "TradeFundsListFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TradeFundsListFragment$onBuySellBtnClick$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $symbols;
    int label;
    final /* synthetic */ TradeFundsListFragment this$0;

    /* JADX INFO: renamed from: i */
    public static final Unit m60710i(TradeFundsListFragment tradeFundsListFragment, ArrayList arrayList) throws Exception {
        BaseFragment.hideLoadingDialog$default(tradeFundsListFragment, false, 1, null);
        if (arrayList.isEmpty()) {
            ToastCompat.m66437C(R$string.coin_no_data);
        } else {
            Intrinsics.checkNotNull(arrayList);
            tradeFundsListFragment.m60684o4(arrayList);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m60712k(TradeFundsListFragment tradeFundsListFragment, Throwable th2) {
        BaseFragment.hideLoadingDialog$default(tradeFundsListFragment, false, 1, null);
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeFundsListFragment$onBuySellBtnClick$1(TradeFundsListFragment tradeFundsListFragment, String str, Continuation<? super TradeFundsListFragment$onBuySellBtnClick$1> continuation) {
        super(2, continuation);
        this.this$0 = tradeFundsListFragment;
        this.$symbols = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeFundsListFragment$onBuySellBtnClick$1(this.this$0, this.$symbols, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TradeFundsListFragment$onBuySellBtnClick$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m60711j(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m60713l(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Observable observableObserveOn = this.this$0.m60677V3().getF50606a().m82933a(this.$symbols, "android/" + DataInitManager.f21486a.m23668i().mo23678f() + "_spot_funds_buysell").compose(C24217a1.m58390n()).observeOn(AndroidSchedulers.mainThread());
            final TradeFundsListFragment tradeFundsListFragment = this.this$0;
            final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.delegation.x0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TradeFundsListFragment$onBuySellBtnClick$1.m60710i(tradeFundsListFragment, (ArrayList) obj2);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.spot.business.delegation.y0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) {
                    TradeFundsListFragment$onBuySellBtnClick$1.m60711j(function1, obj2);
                }
            };
            final TradeFundsListFragment tradeFundsListFragment2 = this.this$0;
            final Function1 function2 = new Function1() { // from class: com.kubi.spot.business.delegation.z0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TradeFundsListFragment$onBuySellBtnClick$1.m60712k(tradeFundsListFragment2, (Throwable) obj2);
                }
            };
            Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.business.delegation.a1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) {
                    TradeFundsListFragment$onBuySellBtnClick$1.m60713l(function2, obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, this.this$0.getDestroyDisposable());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
