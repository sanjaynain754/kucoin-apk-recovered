package com.kubi.margin.trade.dialog;

import com.kubi.margin.R$string;
import com.kubi.margin.trade.BaseMarginFragment;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.ToastCompat;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
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

/* JADX INFO: compiled from: MarginClosePositionDialog.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "validationToken", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.margin.trade.dialog.MarginClosePositionDialog$requestOrder$1", m90122f = "MarginClosePositionDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MarginClosePositionDialog$requestOrder$1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $model;
    final /* synthetic */ String $symbol;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarginClosePositionDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginClosePositionDialog$requestOrder$1(MarginClosePositionDialog marginClosePositionDialog, String str, String str2, Continuation<? super MarginClosePositionDialog$requestOrder$1> continuation) {
        super(2, continuation);
        this.this$0 = marginClosePositionDialog;
        this.$symbol = str;
        this.$model = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarginClosePositionDialog$requestOrder$1 marginClosePositionDialog$requestOrder$1 = new MarginClosePositionDialog$requestOrder$1(this.this$0, this.$symbol, this.$model, continuation);
        marginClosePositionDialog$requestOrder$1.L$0 = obj;
        return marginClosePositionDialog$requestOrder$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((MarginClosePositionDialog$requestOrder$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CompositeDisposable f43550u;
        String str = (String) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Observable<R> observableCompose = ((str == null || str.length() == 0) ? this.this$0.m40102O3().m102089Y(this.$symbol, this.$model) : this.this$0.m40102O3().m102090a(this.$symbol, this.$model, str)).compose(C24217a1.m58389m());
        final MarginClosePositionDialog marginClosePositionDialog = this.this$0;
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.dialog.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return MarginClosePositionDialog$requestOrder$1.m40131j(marginClosePositionDialog, (Disposable) obj2);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.margin.trade.dialog.a0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                MarginClosePositionDialog$requestOrder$1.m40132k(function1, obj2);
            }
        });
        final MarginClosePositionDialog marginClosePositionDialog2 = this.this$0;
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.trade.dialog.b0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) throws Exception {
                MarginClosePositionDialog$requestOrder$1.m40133l(marginClosePositionDialog2, obj2);
            }
        };
        final MarginClosePositionDialog marginClosePositionDialog3 = this.this$0;
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.dialog.c0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return MarginClosePositionDialog$requestOrder$1.m40134m(marginClosePositionDialog3, (Throwable) obj2);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.dialog.d0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                MarginClosePositionDialog$requestOrder$1.m40135n(function2, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        BaseMarginFragment baseMarginFragmentM40119U3 = this.this$0.m40119U3();
        if (baseMarginFragmentM40119U3 == null || (f43550u = baseMarginFragmentM40119U3.getDestroyDisposable()) == null) {
            f43550u = this.this$0.getF43550U();
        }
        DisposableKt.addTo(disposableSubscribe, f43550u);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m40131j(MarginClosePositionDialog marginClosePositionDialog, Disposable disposable) {
        BaseMarginFragment baseMarginFragmentM40119U3 = marginClosePositionDialog.m40119U3();
        if (baseMarginFragmentM40119U3 != null) {
            baseMarginFragmentM40119U3.showLoadingDialog();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m40132k(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l */
    public static final void m40133l(MarginClosePositionDialog marginClosePositionDialog, Object obj) throws Exception {
        BaseMarginFragment baseMarginFragmentM40119U3 = marginClosePositionDialog.m40119U3();
        if (baseMarginFragmentM40119U3 != null) {
            BaseFragment.hideLoadingDialog$default(baseMarginFragmentM40119U3, false, 1, null);
        }
        ToastCompat.m66437C(R$string.margin_one_key_close_ok_tips);
        Action f33757e0 = marginClosePositionDialog.getF33757e0();
        if (f33757e0 != null) {
            f33757e0.run();
        }
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m40134m(MarginClosePositionDialog marginClosePositionDialog, Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        C44128b.m97264h(th2);
        BaseMarginFragment baseMarginFragmentM40119U3 = marginClosePositionDialog.m40119U3();
        if (baseMarginFragmentM40119U3 != null) {
            BaseFragment.hideLoadingDialog$default(baseMarginFragmentM40119U3, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final void m40135n(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
