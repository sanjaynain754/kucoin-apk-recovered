package com.sumsub.sns.internal.features.data.repository.socket;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.AbstractC33293d;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.C41783z1;
import kotlinx.coroutines.channels.InterfaceC41574m;
import kotlinx.coroutines.channels.InterfaceC41577p;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import p852kotlin.Result;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.socket.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30045k extends WebSocketListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.ObjectRef f60350a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30050p f60351b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Ref.ObjectRef f60352c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC41574m f60353d;

    public C30045k(Ref.ObjectRef objectRef, C30050p c30050p, Ref.ObjectRef objectRef2, InterfaceC41574m interfaceC41574m) {
        this.f60350a = objectRef;
        this.f60351b = c30050p;
        this.f60352c = objectRef2;
        this.f60353d = interfaceC41574m;
    }

    @Override // okhttp3.WebSocketListener
    public final void onClosed(WebSocket webSocket, int i11, String str) {
        this.f60351b.m70078a(WebSocketRepository$ConnectionState.DISCONNECTED, "onClosed: code=" + i11 + " reason=" + str);
        InterfaceC41577p.a.m90714a(this.f60353d.getChannel(), null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v9, types: [T, com.sumsub.sns.internal.features.data.repository.socket.WebSocketRepositoryImpl$State] */
    @Override // okhttp3.WebSocketListener
    public final void onFailure(WebSocket webSocket, Throwable th2, Response response) {
        boolean z11;
        CoroutineContext context;
        Logger.DefaultImpls.e$default(C33272c.f67812a, "webSocketFlow", "WebSocketListener.onFailure: \n" + th2 + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + response, null, 4, null);
        Continuation continuation = (Continuation) this.f60352c.element;
        if (continuation != null && (context = continuation.getContext()) != null) {
            z11 = C41783z1.m91411q(context);
        }
        this.f60351b.m70078a(WebSocketRepository$ConnectionState.DISCONNECTED, "onFailure: " + th2 + ", isActive=" + z11);
        if (!((WebSocketRepositoryImpl$State) this.f60350a.element).isDisconnected()) {
            this.f60350a.element = WebSocketRepositoryImpl$State.DISCONNECTING;
        }
        if (z11) {
            try {
                Continuation continuation2 = (Continuation) this.f60352c.element;
                if (continuation2 != null) {
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
                }
            } catch (Exception e11) {
                C33272c c33272c = C33272c.f67812a;
                AbstractC33293d.m71623a("webSocketFlow", "Failed to resume", e11);
            }
            this.f60353d.mo90594e("");
        }
    }

    @Override // okhttp3.WebSocketListener
    public final void onMessage(WebSocket webSocket, String str) {
        Logger.DefaultImpls.d$default(C33272c.f67812a, "webSocketFlow", "WebSocketListener.onMessage: text=" + str, null, 4, null);
        this.f60353d.mo90594e(str);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.sumsub.sns.internal.features.data.repository.socket.WebSocketRepositoryImpl$State] */
    @Override // okhttp3.WebSocketListener
    public final void onOpen(WebSocket webSocket, Response response) {
        this.f60350a.element = WebSocketRepositoryImpl$State.CONNECTED;
        this.f60351b.m70078a(WebSocketRepository$ConnectionState.CONNECTED, "onOpen");
    }
}
