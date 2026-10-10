package com.kubi.network.websocket.observable;

import bs.C4647a;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import com.kubi.network.api.subscribe.utils.ChannelUtilsKt;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.SocketRequest;
import er.C37237b;
import er.InterfaceC37236a;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import p183cs.C36524a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SocketObservable.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0002B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u001c\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, m90084d2 = {"Lcom/kubi/network/websocket/observable/SocketDisposable;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lio/reactivex/disposables/Disposable;", "Ljava/lang/Runnable;", "Lcom/kubi/network/websocket/model/SocketRequest;", "subscribe", "Lio/reactivex/Observer;", "Lcom/kubi/network/websocket/model/Message;", "downstream", "Ler/a;", "client", "<init>", "(Lcom/kubi/network/websocket/model/SocketRequest;Lio/reactivex/Observer;Ler/a;)V", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "msg", "", "c", "(Lcom/kubi/network/api/subscribe/model/SubscribeMessage;)V", "it", "e", "(Lcom/kubi/network/websocket/model/Message;)V", "", "d", "(Ljava/lang/Throwable;)V", "", "isDisposed", "()Z", "run", "()V", "dispose", "Lcom/kubi/network/websocket/model/SocketRequest;", "Lio/reactivex/Observer;", "Ler/a;", "", "disposeLock", "Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasRegister", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lio/reactivex/disposables/CompositeDisposable;", "msgDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "network-adapter-subscribe-old_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSocketObservable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketObservable.kt\ncom/kubi/network/websocket/observable/SocketDisposable\n+ 2 NetAdptSubOldIssue.kt\ncom/kubi/network/websocket/exception/NetAdptSubOldIssueKt\n*L\n1#1,104:1\n44#2,8:105\n*S KotlinDebug\n*F\n+ 1 SocketObservable.kt\ncom/kubi/network/websocket/observable/SocketDisposable\n*L\n99#1:105,8\n*E\n"})
final class SocketDisposable extends AtomicReference<Disposable> implements Runnable, Disposable {

    @NotNull
    private final InterfaceC37236a client;

    @NotNull
    private final Object disposeLock;

    @NotNull
    private final Observer<? super Message> downstream;

    @NotNull
    private final AtomicBoolean hasRegister;

    @NotNull
    private final io.reactivex.disposables.CompositeDisposable msgDisposable;

    @NotNull
    private final SocketRequest subscribe;

    public /* synthetic */ SocketDisposable(SocketRequest socketRequest, Observer observer, InterfaceC37236a interfaceC37236a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(socketRequest, observer, (i11 & 4) != 0 ? C37237b.m83278a() : interfaceC37236a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m43130f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: renamed from: g */
    public static final void m43131g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        synchronized (this.disposeLock) {
            DisposableHelper.dispose(this);
        }
        if (this.hasRegister.compareAndSet(true, false)) {
            this.msgDisposable.clear();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: isDisposed */
    public boolean getDisposed() {
        boolean zIsDisposed;
        synchronized (this.disposeLock) {
            zIsDisposed = DisposableHelper.isDisposed(get());
        }
        return zIsDisposed;
    }

    public SocketDisposable(@NotNull SocketRequest subscribe, @NotNull Observer<? super Message> downstream, @NotNull InterfaceC37236a client) {
        Intrinsics.checkNotNullParameter(subscribe, "subscribe");
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        Intrinsics.checkNotNullParameter(client, "client");
        this.subscribe = subscribe;
        this.downstream = downstream;
        this.client = client;
        this.disposeLock = new Object();
        this.hasRegister = new AtomicBoolean(false);
        this.msgDisposable = new io.reactivex.disposables.CompositeDisposable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final void m43127c(SubscribeMessage msg) {
        if (getDisposed()) {
            return;
        }
        m43129e(C36524a.m81795b(msg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final void m43128d(Throwable it) {
        if (!getDisposed()) {
            try {
                this.downstream.onError(it);
                dispose();
            } catch (Throwable th2) {
                try {
                    C4647a.m4598b(th2, "SocketObservable");
                } finally {
                    dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m43129e(Message it) {
        if (!getDisposed()) {
            try {
                this.downstream.onNext(it);
            } catch (Throwable th2) {
                m43128d(th2);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!getDisposed() && this.hasRegister.compareAndSet(false, true)) {
            Observable observableM42744h = ChannelUtilsKt.m42744h(this.client, this.subscribe.getTopic(), null, 2, null);
            final Function1<SubscribeMessage, Unit> function1 = new Function1<SubscribeMessage, Unit>() { // from class: com.kubi.network.websocket.observable.SocketDisposable.run.1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SubscribeMessage subscribeMessage) {
                    invoke2(subscribeMessage);
                    return Unit.INSTANCE;
                }

                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SubscribeMessage it) {
                    SocketDisposable socketDisposable = SocketDisposable.this;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    socketDisposable.m43127c(it);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.network.websocket.observable.d
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SocketDisposable.m43130f(function1, obj);
                }
            };
            final Function1<Throwable, Unit> function2 = new Function1<Throwable, Unit>() { // from class: com.kubi.network.websocket.observable.SocketDisposable.run.2
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    invoke2(th2);
                    return Unit.INSTANCE;
                }

                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable it) {
                    SocketDisposable socketDisposable = SocketDisposable.this;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    socketDisposable.m43128d(it);
                }
            };
            Disposable disposableSubscribe = observableM42744h.subscribe(consumer, new Consumer() { // from class: com.kubi.network.websocket.observable.e
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SocketDisposable.m43131g(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "override fun run() {\n   …sposable)\n        }\n    }");
            DisposableKt.addTo(disposableSubscribe, this.msgDisposable);
        }
    }
}
