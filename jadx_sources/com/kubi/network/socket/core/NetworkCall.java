package com.kubi.network.socket.core;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkRequest;
import com.kubi.network.api.model.NetworkResponse;
import com.kubi.network.socket.WebSocketClient;
import com.kubi.network.socket.exception.RequestCancelException;
import com.kubi.network.socket.exception.RequestTimeoutException;
import com.tencent.qcloud.tuicore.TUIConstants;
import fr.InterfaceC37581b;
import fr.InterfaceC37582c;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o00.C42917g;
import okio.AsyncTimeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p570qr.C43864j;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NetworkCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001&B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0010J\u001b\u0010\u001a\u001a\u00020\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, m90084d2 = {"Lcom/kubi/network/socket/core/NetworkCall;", "Lfr/b;", "Lcom/kubi/network/socket/WebSocketClient;", "client", "Lcom/kubi/network/socket/WebSocketClient$a;", "config", "Lcom/kubi/network/api/model/NetworkRequest;", "request", "<init>", "(Lcom/kubi/network/socket/WebSocketClient;Lcom/kubi/network/socket/WebSocketClient$a;Lcom/kubi/network/api/model/NetworkRequest;)V", "Lfr/c;", TUIConstants.TUIChat.CALL_BACK, "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lfr/c;)V", "cancel", "()V", "", "isCancelled", "()Z", "Lcom/kubi/network/api/model/NetworkResponse;", "g", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "", "e", "d", "(Ljava/lang/Throwable;)V", "Lcom/kubi/network/socket/WebSocketClient;", "b", "Lcom/kubi/network/socket/WebSocketClient$a;", "c", "Lcom/kubi/network/api/model/NetworkRequest;", "Z", "canceled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "AsyncCall", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNetworkCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkCall.kt\ncom/kubi/network/socket/core/NetworkCall\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
public final class NetworkCall implements InterfaceC37581b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WebSocketClient client;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final WebSocketClient.C19339a config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final NetworkRequest request;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public volatile boolean canceled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean executed;

    /* JADX INFO: compiled from: NetworkCall.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0001\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/network/socket/core/NetworkCall$AsyncCall;", "", "Lfr/c;", TUIConstants.TUIChat.CALL_BACK, "<init>", "(Lcom/kubi/network/socket/core/NetworkCall;Lfr/c;)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfr/c;", "com/kubi/network/socket/core/NetworkCall$AsyncCall$a", "b", "Lcom/kubi/network/socket/core/NetworkCall$AsyncCall$a;", "timeout", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public final class AsyncCall {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC37582c callback;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final C19354a timeout;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ NetworkCall f36055c;

        /* JADX INFO: renamed from: com.kubi.network.socket.core.NetworkCall$AsyncCall$a */
        /* JADX INFO: compiled from: NetworkCall.kt */
        @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"com/kubi/network/socket/core/NetworkCall$AsyncCall$a", "Lokio/AsyncTimeout;", "", "timedOut", "()V", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        public static final class C19354a extends AsyncTimeout {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ NetworkCall f36056a;

            public C19354a(NetworkCall networkCall) {
                this.f36056a = networkCall;
            }

            @Override // okio.AsyncTimeout
            public void timedOut() {
                this.f36056a.cancel();
            }
        }

        public AsyncCall(@NotNull NetworkCall networkCall, InterfaceC37582c callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f36055c = networkCall;
            this.callback = callback;
            C19354a c19354a = new C19354a(networkCall);
            c19354a.timeout(networkCall.config.getCallTimeout(), TimeUnit.MILLISECONDS);
            this.timeout = c19354a;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0057 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:12:0x0029, B:23:0x004d, B:25:0x0057, B:26:0x0068, B:27:0x006d), top: B:37:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x0068 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:12:0x0029, B:23:0x004d, B:25:0x0057, B:26:0x0068, B:27:0x006d), top: B:37:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x0079  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        /* JADX INFO: renamed from: a */
        public final Object m42945a(@NotNull Continuation<? super Unit> continuation) {
            NetworkCall$AsyncCall$executeOnSingleThread$1 networkCall$AsyncCall$executeOnSingleThread$1;
            AsyncCall asyncCall;
            NetworkResponse<?> networkResponse;
            if (continuation instanceof NetworkCall$AsyncCall$executeOnSingleThread$1) {
                networkCall$AsyncCall$executeOnSingleThread$1 = (NetworkCall$AsyncCall$executeOnSingleThread$1) continuation;
                int i11 = networkCall$AsyncCall$executeOnSingleThread$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    networkCall$AsyncCall$executeOnSingleThread$1.label = i11 - Integer.MIN_VALUE;
                } else {
                    networkCall$AsyncCall$executeOnSingleThread$1 = new NetworkCall$AsyncCall$executeOnSingleThread$1(this, continuation);
                }
            } else {
                networkCall$AsyncCall$executeOnSingleThread$1 = new NetworkCall$AsyncCall$executeOnSingleThread$1(this, continuation);
            }
            Object objM42944g = networkCall$AsyncCall$executeOnSingleThread$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = networkCall$AsyncCall$executeOnSingleThread$1.label;
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM42944g);
                try {
                    this.timeout.enter();
                    NetworkCall networkCall = this.f36055c;
                    networkCall$AsyncCall$executeOnSingleThread$1.L$0 = this;
                    networkCall$AsyncCall$executeOnSingleThread$1.label = 1;
                    objM42944g = networkCall.m42944g(networkCall$AsyncCall$executeOnSingleThread$1);
                    if (objM42944g == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    asyncCall = this;
                    networkResponse = (NetworkResponse) objM42944g;
                    if (!asyncCall.f36055c.getCanceled()) {
                        throw new RequestCancelException();
                    }
                    asyncCall.timeout.exit();
                    asyncCall.callback.mo23836a(networkResponse);
                    NetworkCall.m42940e(asyncCall.f36055c, null, 1, null);
                } catch (Throwable th2) {
                    th = th2;
                    asyncCall = this;
                    if (asyncCall.timeout.exit()) {
                        th = new RequestTimeoutException(th);
                    }
                    asyncCall.callback.onFailure(th);
                    asyncCall.f36055c.m42942d(th);
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                asyncCall = (AsyncCall) networkCall$AsyncCall$executeOnSingleThread$1.L$0;
                try {
                    ResultKt.throwOnFailure(objM42944g);
                    networkResponse = (NetworkResponse) objM42944g;
                    if (!asyncCall.f36055c.getCanceled()) {
                        throw new RequestCancelException();
                    }
                    asyncCall.timeout.exit();
                    asyncCall.callback.mo23836a(networkResponse);
                    NetworkCall.m42940e(asyncCall.f36055c, null, 1, null);
                } catch (Throwable th3) {
                    th = th3;
                    if (asyncCall.timeout.exit()) {
                        th = new RequestTimeoutException(th);
                    }
                    asyncCall.callback.onFailure(th);
                    asyncCall.f36055c.m42942d(th);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public NetworkCall(@NotNull WebSocketClient client, @NotNull WebSocketClient.C19339a config, @NotNull NetworkRequest request) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(request, "request");
        this.client = client;
        this.config = config;
        this.request = request;
        this.executed = new AtomicBoolean();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m42940e(NetworkCall networkCall, Throwable th2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            th2 = null;
        }
        networkCall.m42942d(th2);
    }

    @Override // fr.InterfaceC37581b
    /* JADX INFO: renamed from: a */
    public void mo42941a(@NotNull InterfaceC37582c callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("already execute");
        }
        m42943f();
        this.client.getDispatcher().m42937b(new AsyncCall(this, callback.mo23837b(C42917g.m94139e())));
    }

    /* JADX INFO: renamed from: d */
    public final void m42942d(Throwable e11) {
        if (e11 != null) {
            this.config.getRequestTrack().m100143b(this.request.getId(), e11);
        } else {
            this.config.getRequestTrack().m100142a(this.request.getId());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m42943f() {
        this.config.getRequestTrack().m100144c(this.request);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m42944g(@NotNull Continuation<? super NetworkResponse<?>> continuation) {
        ArrayList arrayList = new ArrayList();
        CollectionsKt.addAll(arrayList, this.config.m42880n());
        arrayList.add(new C43864j(this.client));
        return new C19357c(arrayList, 0, this.request, this).mo42946a(this.request, continuation);
    }

    @Override // fr.InterfaceC37581b
    /* JADX INFO: renamed from: isCancelled, reason: from getter */
    public boolean getCanceled() {
        return this.canceled;
    }

    @Override // fr.InterfaceC37581b
    public void cancel() {
        if (getCanceled()) {
            return;
        }
        this.canceled = true;
    }
}
