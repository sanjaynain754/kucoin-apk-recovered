package com.kubi.network.websocket.observable;

import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.SocketRequest;
import er.C37237b;
import er.InterfaceC37236a;
import io.reactivex.Observable;
import io.reactivex.Observer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.network.websocket.observable.f */
/* JADX INFO: compiled from: SocketObservable.kt */
/* JADX INFO: loaded from: classes12.dex */
@Deprecated(message = "建议直接使用RESTful方式", replaceWith = @ReplaceWith(expression = "KCNetwork", imports = {}))
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/network/websocket/observable/f;", "Lio/reactivex/Observable;", "Lcom/kubi/network/websocket/model/Message;", "Lcom/kubi/network/websocket/model/SocketRequest;", "subscribe", "unsubscribe", "Ler/a;", "client", "<init>", "(Lcom/kubi/network/websocket/model/SocketRequest;Lcom/kubi/network/websocket/model/SocketRequest;Ler/a;)V", "Lio/reactivex/Observer;", "observer", "", "subscribeActual", "(Lio/reactivex/Observer;)V", "b", "Lcom/kubi/network/websocket/model/SocketRequest;", "c", "d", "Ler/a;", "network-adapter-subscribe-old_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19409f extends Observable<Message> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final SocketRequest subscribe;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final SocketRequest unsubscribe;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC37236a client;

    public /* synthetic */ C19409f(SocketRequest socketRequest, SocketRequest socketRequest2, InterfaceC37236a interfaceC37236a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(socketRequest, (i11 & 2) != 0 ? null : socketRequest2, (i11 & 4) != 0 ? C37237b.m83278a() : interfaceC37236a);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(@NotNull Observer<? super Message> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        SocketDisposable socketDisposable = new SocketDisposable(this.subscribe, observer, this.client);
        observer.onSubscribe(socketDisposable);
        socketDisposable.run();
    }

    public C19409f(@NotNull SocketRequest subscribe, @Nullable SocketRequest socketRequest, @NotNull InterfaceC37236a client) {
        Intrinsics.checkNotNullParameter(subscribe, "subscribe");
        Intrinsics.checkNotNullParameter(client, "client");
        this.subscribe = subscribe;
        this.unsubscribe = socketRequest;
        this.client = client;
    }
}
