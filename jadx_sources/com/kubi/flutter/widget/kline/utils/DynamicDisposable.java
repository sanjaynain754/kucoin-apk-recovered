package com.kubi.flutter.widget.kline.utils;

import com.kubi.network.websocket.model.Message;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p499og.C43043a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DynamicObservable.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0002B+\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0017H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/utils/DynamicDisposable;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lio/reactivex/disposables/Disposable;", "Ljava/lang/Runnable;", "obtainObs", "Lkotlin/Function0;", "Lio/reactivex/Observable;", "Lcom/kubi/network/websocket/model/Message;", "downstream", "Lio/reactivex/Observer;", "<init>", "(Lkotlin/jvm/functions/Function0;Lio/reactivex/Observer;)V", "currentObs", "dynamicDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "isDisposed", "", "run", "", "dispose", "onNext", "it", "onError", "", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDynamicObservable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicObservable.kt\ncom/kubi/flutter/widget/kline/utils/DynamicDisposable\n+ 2 KLineIssue.kt\ncom/kubi/flutter/widget/kline/exception/KLineIssueKt\n*L\n1#1,81:1\n45#2,4:82\n*S KotlinDebug\n*F\n+ 1 DynamicObservable.kt\ncom/kubi/flutter/widget/kline/utils/DynamicDisposable\n*L\n76#1:82,4\n*E\n"})
final class DynamicDisposable extends AtomicReference<Disposable> implements Runnable, Disposable {

    @NotNull
    private Observable<Message> currentObs;

    @NotNull
    private final Observer<? super Message> downstream;

    @NotNull
    private final CompositeDisposable dynamicDisposable;

    @NotNull
    private final Function0<Observable<Message>> obtainObs;

    /* JADX WARN: Multi-variable type inference failed */
    public DynamicDisposable(@NotNull Function0<? extends Observable<Message>> obtainObs, @NotNull Observer<? super Message> downstream) {
        Intrinsics.checkNotNullParameter(obtainObs, "obtainObs");
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.obtainObs = obtainObs;
        this.downstream = downstream;
        this.currentObs = (Observable) obtainObs.invoke();
        this.dynamicDisposable = new CompositeDisposable();
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m24381g(DynamicDisposable dynamicDisposable, Message message) {
        if (Intrinsics.areEqual(dynamicDisposable.obtainObs.invoke(), dynamicDisposable.currentObs)) {
            Intrinsics.checkNotNull(message);
            dynamicDisposable.m24385f(message);
        } else {
            dynamicDisposable.currentObs = dynamicDisposable.obtainObs.invoke();
            dynamicDisposable.run();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    private final void m24380e(Throwable th2) {
        if (!getDisposed()) {
            try {
                this.downstream.onError(th2);
                dispose();
            } catch (Throwable th3) {
                try {
                    if (!C42899b.m94075e(th3)) {
                        C43043a.m94532c(th3, "DynamicObservable");
                    }
                } finally {
                    dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m24382h(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m24383i(DynamicDisposable dynamicDisposable, Throwable th2) {
        Intrinsics.checkNotNull(th2);
        dynamicDisposable.m24380e(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final void m24384j(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this);
        this.dynamicDisposable.dispose();
    }

    /* JADX INFO: renamed from: f */
    public final void m24385f(Message message) {
        if (!getDisposed()) {
            try {
                this.downstream.onNext(message);
            } catch (Throwable th2) {
                m24380e(th2);
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: isDisposed */
    public boolean getDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // java.lang.Runnable
    public void run() {
        if (getDisposed()) {
            return;
        }
        this.dynamicDisposable.clear();
        Observable<Message> observable = this.currentObs;
        final Function1 function1 = new Function1() { // from class: com.kubi.flutter.widget.kline.utils.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DynamicDisposable.m24381g(this.f22488b, (Message) obj);
            }
        };
        Consumer<? super Message> consumer = new Consumer() { // from class: com.kubi.flutter.widget.kline.utils.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DynamicDisposable.m24382h(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.flutter.widget.kline.utils.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DynamicDisposable.m24383i(this.f22490b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observable.subscribe(consumer, new Consumer() { // from class: com.kubi.flutter.widget.kline.utils.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DynamicDisposable.m24384j(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, this.dynamicDisposable);
    }
}
