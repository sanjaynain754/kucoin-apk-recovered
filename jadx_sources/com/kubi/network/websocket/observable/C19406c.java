package com.kubi.network.websocket.observable;

import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.Request;
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

/* JADX INFO: renamed from: com.kubi.network.websocket.observable.c */
/* JADX INFO: compiled from: CompositeObservable.kt */
/* JADX INFO: loaded from: classes12.dex */
@Deprecated(message = "建议直接使用RESTful方式", replaceWith = @ReplaceWith(expression = "KCNetwork", imports = {}))
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/network/websocket/observable/c;", "Lio/reactivex/Observable;", "Lcom/kubi/network/websocket/model/Message;", "Lcom/kubi/network/websocket/model/Request;", "subscribe", "unsubscribe", "restful", "", "waitHeartbeat", "Ler/a;", "client", "<init>", "(Lcom/kubi/network/websocket/model/Request;Lcom/kubi/network/websocket/model/Request;Lcom/kubi/network/websocket/model/Message;ZLer/a;)V", "Lio/reactivex/Observer;", "observer", "", "subscribeActual", "(Lio/reactivex/Observer;)V", "b", "Lcom/kubi/network/websocket/model/Request;", "c", "d", "Lcom/kubi/network/websocket/model/Message;", "e", "Z", "f", "Ler/a;", "network-adapter-subscribe-old_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19406c extends Observable<Message> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Request subscribe;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final Request unsubscribe;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final Message restful;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean waitHeartbeat;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC37236a client;

    public /* synthetic */ C19406c(Request request, Request request2, Message message, boolean z11, InterfaceC37236a interfaceC37236a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(request, (i11 & 2) != 0 ? null : request2, (i11 & 4) != 0 ? null : message, (i11 & 8) != 0 ? true : z11, (i11 & 16) != 0 ? C37237b.m83278a() : interfaceC37236a);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(@NotNull Observer<? super Message> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        CompositeDisposable compositeDisposable = new CompositeDisposable(this.subscribe, observer, this.restful, this.waitHeartbeat, this.client);
        observer.onSubscribe(compositeDisposable);
        compositeDisposable.run();
    }

    public C19406c(@NotNull Request subscribe, @Nullable Request request, @Nullable Message message, boolean z11, @NotNull InterfaceC37236a client) {
        Intrinsics.checkNotNullParameter(subscribe, "subscribe");
        Intrinsics.checkNotNullParameter(client, "client");
        this.subscribe = subscribe;
        this.unsubscribe = request;
        this.restful = message;
        this.waitHeartbeat = z11;
        this.client = client;
    }
}
