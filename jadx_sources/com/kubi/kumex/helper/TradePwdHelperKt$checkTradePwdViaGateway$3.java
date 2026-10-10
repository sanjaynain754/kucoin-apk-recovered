package com.kubi.kumex.helper;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import o00.C42916f;
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

/* JADX INFO: compiled from: TradePwdHelper.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "validationToken", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.helper.TradePwdHelperKt$checkTradePwdViaGateway$3", m90122f = "TradePwdHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TradePwdHelperKt$checkTradePwdViaGateway$3 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Disposable, Unit> $addDisposable;
    final /* synthetic */ Consumer<Object> $consumer;
    final /* synthetic */ Consumer<Throwable> $errorCallBack;
    final /* synthetic */ Function1<String, Observable<Object>> $observableFactory;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TradePwdHelperKt$checkTradePwdViaGateway$3(Function1<? super Disposable, Unit> function1, Function1<? super String, ? extends Observable<Object>> function2, Consumer<Object> consumer, Consumer<Throwable> consumer2, Continuation<? super TradePwdHelperKt$checkTradePwdViaGateway$3> continuation) {
        super(2, continuation);
        this.$addDisposable = function1;
        this.$observableFactory = function2;
        this.$consumer = consumer;
        this.$errorCallBack = consumer2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TradePwdHelperKt$checkTradePwdViaGateway$3 tradePwdHelperKt$checkTradePwdViaGateway$3 = new TradePwdHelperKt$checkTradePwdViaGateway$3(this.$addDisposable, this.$observableFactory, this.$consumer, this.$errorCallBack, continuation);
        tradePwdHelperKt$checkTradePwdViaGateway$3.L$0 = obj;
        return tradePwdHelperKt$checkTradePwdViaGateway$3;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((TradePwdHelperKt$checkTradePwdViaGateway$3) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Function1<Disposable, Unit> function1 = this.$addDisposable;
        Observable<Object> observableObserveOn = this.$observableFactory.invoke(str).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Consumer<Object> consumer = this.$consumer;
        Consumer<? super Object> consumer2 = new Consumer() { // from class: com.kubi.kumex.helper.d1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) throws Exception {
                TradePwdHelperKt$checkTradePwdViaGateway$3.m33951h(consumer, obj2);
            }
        };
        final Consumer<Throwable> consumer3 = this.$errorCallBack;
        final Function1 function2 = new Function1() { // from class: com.kubi.kumex.helper.e1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return TradePwdHelperKt$checkTradePwdViaGateway$3.m33952i(consumer3, (Throwable) obj2);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer2, new Consumer() { // from class: com.kubi.kumex.helper.f1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                TradePwdHelperKt$checkTradePwdViaGateway$3.m33953j(function2, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        function1.invoke(disposableSubscribe);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final void m33951h(Consumer consumer, Object obj) throws Exception {
        consumer.accept(obj);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m33952i(Consumer consumer, Throwable th2) throws Exception {
        consumer.accept(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final void m33953j(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
