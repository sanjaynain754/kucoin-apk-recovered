package com.kubi.network.websocket.observable;

import bs.C4647a;
import com.kubi.network.api.subscribe.model.PeriodRequest;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import com.kubi.network.api.subscribe.model.SubscribeRequest;
import com.kubi.network.api.subscribe.utils.C19319e;
import com.kubi.network.api.subscribe.utils.ChannelUtilsKt;
import com.kubi.network.websocket.model.HeartbeatRequest;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.Request;
import com.kubi.network.websocket.model.SocketRequest;
import er.C37237b;
import er.InterfaceC37236a;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p183cs.C36524a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CompositeObservable.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0002B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u001c\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, m90084d2 = {"Lcom/kubi/network/websocket/observable/CompositeDisposable;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lio/reactivex/disposables/Disposable;", "Ljava/lang/Runnable;", "Lcom/kubi/network/websocket/model/Request;", "subscribe", "Lio/reactivex/Observer;", "Lcom/kubi/network/websocket/model/Message;", "downstream", "restful", "", "waitHeartbeat", "Ler/a;", "client", "<init>", "(Lcom/kubi/network/websocket/model/Request;Lio/reactivex/Observer;Lcom/kubi/network/websocket/model/Message;ZLer/a;)V", "it", "", "e", "(Lcom/kubi/network/websocket/model/Message;)V", "", "d", "(Ljava/lang/Throwable;)V", "isDisposed", "()Z", "run", "()V", "dispose", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "msg", "c", "(Lcom/kubi/network/api/subscribe/model/SubscribeMessage;)V", "Lcom/kubi/network/websocket/model/Request;", "Lio/reactivex/Observer;", "Lcom/kubi/network/websocket/model/Message;", "Z", "Ler/a;", "", "disposeLock", "Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasRegister", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasHeartbeat", "Lio/reactivex/disposables/CompositeDisposable;", "msgDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "network-adapter-subscribe-old_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCompositeObservable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositeObservable.kt\ncom/kubi/network/websocket/observable/CompositeDisposable\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 NetAdptSubOldIssue.kt\ncom/kubi/network/websocket/exception/NetAdptSubOldIssueKt\n*L\n1#1,143:1\n1559#2:144\n1590#2,4:145\n44#3,8:149\n*S KotlinDebug\n*F\n+ 1 CompositeObservable.kt\ncom/kubi/network/websocket/observable/CompositeDisposable\n*L\n71#1:144\n71#1:145,4\n138#1:149,8\n*E\n"})
final class CompositeDisposable extends AtomicReference<Disposable> implements Runnable, Disposable {

    @NotNull
    private final InterfaceC37236a client;

    @NotNull
    private final Object disposeLock;

    @NotNull
    private final Observer<? super Message> downstream;

    @NotNull
    private final AtomicBoolean hasHeartbeat;

    @NotNull
    private final AtomicBoolean hasRegister;

    @NotNull
    private final io.reactivex.disposables.CompositeDisposable msgDisposable;

    @Nullable
    private final Message restful;

    @NotNull
    private final Request subscribe;
    private final boolean waitHeartbeat;

    public /* synthetic */ CompositeDisposable(Request request, Observer observer, Message message, boolean z11, InterfaceC37236a interfaceC37236a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(request, observer, (i11 & 4) != 0 ? null : message, (i11 & 8) != 0 ? true : z11, (i11 & 16) != 0 ? C37237b.m83278a() : interfaceC37236a);
    }

    /* JADX INFO: renamed from: f */
    public static final void m43122f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: renamed from: g */
    public static final void m43123g(Function1 tmp0, Object obj) {
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

    public CompositeDisposable(@NotNull Request subscribe, @NotNull Observer<? super Message> downstream, @Nullable Message message, boolean z11, @NotNull InterfaceC37236a client) {
        Intrinsics.checkNotNullParameter(subscribe, "subscribe");
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        Intrinsics.checkNotNullParameter(client, "client");
        this.subscribe = subscribe;
        this.downstream = downstream;
        this.restful = message;
        this.waitHeartbeat = z11;
        this.client = client;
        this.disposeLock = new Object();
        this.hasRegister = new AtomicBoolean(false);
        this.hasHeartbeat = new AtomicBoolean(!z11);
        this.msgDisposable = new io.reactivex.disposables.CompositeDisposable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final void m43120d(Throwable it) {
        if (!getDisposed()) {
            try {
                this.downstream.onError(it);
                dispose();
            } catch (Throwable th2) {
                try {
                    C4647a.m4598b(th2, "CompositeObservable");
                } finally {
                    dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m43121e(Message it) {
        if (!getDisposed()) {
            try {
                this.downstream.onNext(it);
            } catch (Throwable th2) {
                m43120d(th2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m43124c(SubscribeMessage msg) {
        if (!getDisposed()) {
            if (msg.isSocketMessage()) {
                if (this.hasHeartbeat.get()) {
                    m43121e(C36524a.m81795b(msg));
                }
            } else {
                this.hasHeartbeat.set(true);
                m43121e(C36524a.m81795b(msg));
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String id2;
        Observable<SubscribeMessage> observableM42744h;
        if (!getDisposed()) {
            int i11 = 0;
            if (this.hasRegister.compareAndSet(false, true)) {
                List<SocketRequest> socketRequest = this.subscribe.getSocketRequest();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(socketRequest, 10));
                for (Object obj : socketRequest) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    SocketRequest socketRequest2 = (SocketRequest) obj;
                    PeriodRequest periodRequestM81796c = null;
                    if (i11 == 0) {
                        InterfaceC37236a interfaceC37236a = this.client;
                        String topic = socketRequest2.getTopic();
                        HeartbeatRequest heartbeatRequest = this.subscribe.getHeartbeatRequest();
                        if (heartbeatRequest != null) {
                            periodRequestM81796c = C36524a.m81796c(heartbeatRequest, this.waitHeartbeat);
                        }
                        observableM42744h = ChannelUtilsKt.m42742f(interfaceC37236a, new SubscribeRequest(null, topic, null, periodRequestM81796c, 5, null));
                    } else {
                        observableM42744h = ChannelUtilsKt.m42744h(this.client, socketRequest2.getTopic(), null, 2, null);
                    }
                    arrayList.add(observableM42744h);
                    i11 = i12;
                }
                Observable observableMerge = Observable.merge(arrayList);
                Message message = this.restful;
                if (message != null) {
                    HeartbeatRequest heartbeatRequest2 = this.subscribe.getHeartbeatRequest();
                    if (heartbeatRequest2 == null || (id2 = heartbeatRequest2.getId()) == null) {
                        id2 = "";
                    }
                    observableMerge = observableMerge.startWith(C36524a.m81797d(message, id2));
                }
                if (this.subscribe.getSocketRequest().size() > 1) {
                    observableMerge = observableMerge.observeOn(C19319e.m42765d());
                }
                Observable observableDistinctUntilChanged = observableMerge.distinctUntilChanged();
                final Function1<SubscribeMessage, Unit> function1 = new Function1<SubscribeMessage, Unit>() { // from class: com.kubi.network.websocket.observable.CompositeDisposable.run.4
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
                        CompositeDisposable compositeDisposable = CompositeDisposable.this;
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        compositeDisposable.m43124c(it);
                    }
                };
                Consumer consumer = new Consumer() { // from class: com.kubi.network.websocket.observable.a
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj2) {
                        CompositeDisposable.m43122f(function1, obj2);
                    }
                };
                final Function1<Throwable, Unit> function2 = new Function1<Throwable, Unit>() { // from class: com.kubi.network.websocket.observable.CompositeDisposable.run.5
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
                        CompositeDisposable compositeDisposable = CompositeDisposable.this;
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        compositeDisposable.m43120d(it);
                    }
                };
                Disposable disposableSubscribe = observableDistinctUntilChanged.subscribe(consumer, new Consumer() { // from class: com.kubi.network.websocket.observable.b
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj2) {
                        CompositeDisposable.m43123g(function2, obj2);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "override fun run() {\n   …sposable)\n        }\n    }");
                DisposableKt.addTo(disposableSubscribe, this.msgDisposable);
            }
        }
    }
}
