package com.sumsub.sns.internal.features.data.repository.socket;

import com.sumsub.sns.internal.core.domain.InterfaceC28584k;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.channels.InterfaceC41574m;
import okhttp3.Request;
import okhttp3.WebSocket;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.time.Duration;
import p852kotlin.time.DurationKt;
import p852kotlin.time.DurationUnit;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.socket.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30046l extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public WebSocket f60354a;

    /* JADX INFO: renamed from: b */
    public Ref.ObjectRef f60355b;

    /* JADX INFO: renamed from: c */
    public C30045k f60356c;

    /* JADX INFO: renamed from: d */
    public String f60357d;

    /* JADX INFO: renamed from: e */
    public int f60358e;

    /* JADX INFO: renamed from: f */
    public int f60359f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f60360g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C30050p f60361h;

    /* JADX WARN: Code duplicated, block: B:25:0x008f A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:23:0x0085, B:25:0x008f, B:28:0x00b2, B:30:0x00b8, B:31:0x00bc), top: B:57:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8 A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:23:0x0085, B:25:0x008f, B:28:0x00b2, B:30:0x00b8, B:31:0x00bc), top: B:57:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:37:0x0127 A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #0 {all -> 0x0059, blocks: (B:35:0x00dd, B:37:0x0127, B:18:0x0054), top: B:53:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x012d  */
    /* JADX WARN: Code duplicated, block: B:43:0x013b A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:8:0x0021, B:41:0x0131, B:43:0x013b, B:44:0x0144, B:15:0x0041), top: B:55:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:50:0x016d  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015e, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90351c(r11, r14) == r1) goto L46;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x008f, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v21, types: [T, kotlinx.coroutines.o] */
    /* JADX WARN: Type inference failed for: r7v17, types: [T, com.sumsub.sns.internal.features.data.repository.socket.WebSocketRepositoryImpl$State] */
    /* JADX WARN: Type inference failed for: r8v0, types: [T, com.sumsub.sns.internal.features.data.repository.socket.WebSocketRepositoryImpl$State] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x015e -> B:9:0x0024). Please report as a decompilation issue!!! */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        WebSocket webSocket;
        WebSocket webSocketNewWebSocket;
        C30045k c30045k;
        int i11;
        Ref.ObjectRef objectRef;
        WebSocket webSocket2;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        C30045k c30045k2;
        int i12;
        String str;
        Object objM91171w;
        String str2;
        Object objMo69411a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = this.f60359f;
        try {
            if (i13 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC41574m interfaceC41574m = (InterfaceC41574m) this.f60360g;
                Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                objectRef6.element = WebSocketRepositoryImpl$State.DEFAULT;
                c30045k = new C30045k(objectRef6, this.f60361h, objectRef5, interfaceC41574m);
                C33272c.f67816e.f67810a.mo68955d("webSocketFlow", "Start WebSocket flow", null);
                i11 = 0;
                objectRef = objectRef5;
                webSocket2 = null;
                objectRef2 = objectRef6;
                if (!((WebSocketRepositoryImpl$State) objectRef2.element).isDisconnected()) {
                    i11++;
                    C33272c.f67816e.f67810a.mo68955d("webSocketFlow", "WebSocket newWebSocket (attempt " + i11 + ")", null);
                }
                if (objectRef2.element == WebSocketRepositoryImpl$State.DISCONNECTING) {
                    objectRef2.element = WebSocketRepositoryImpl$State.DISCONNECTED;
                }
                C30050p c30050p = this.f60361h;
                str2 = c30050p.f60375e;
                InterfaceC28584k interfaceC28584k = c30050p.f60374d;
                this.f60360g = objectRef;
                this.f60354a = webSocket2;
                this.f60355b = objectRef2;
                this.f60356c = c30045k;
                this.f60357d = str2;
                this.f60358e = i11;
                this.f60359f = 1;
                objMo69411a = interfaceC28584k.mo69411a(this);
                if (objMo69411a != coroutine_suspended) {
                    i12 = i11;
                    obj = objMo69411a;
                    str = str2;
                    webSocketNewWebSocket = this.f60361h.f60371a.newWebSocket(new Request.Builder().url(str + obj).build(), c30045k);
                    this.f60360g = objectRef;
                    this.f60354a = webSocketNewWebSocket;
                    this.f60355b = objectRef2;
                    this.f60356c = c30045k;
                    this.f60357d = null;
                    this.f60358e = i12;
                    this.f60359f = 2;
                    ?? c41716o = new C41716o(IntrinsicsKt.intercepted(this), 1);
                    c41716o.m91142E();
                    objectRef.element = c41716o;
                    objM91171w = c41716o.m91171w();
                    if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (objM91171w != coroutine_suspended) {
                        c30045k2 = c30045k;
                        objectRef4 = objectRef2;
                        webSocket = webSocketNewWebSocket;
                        objectRef3 = objectRef;
                        if (!((WebSocketRepositoryImpl$State) objectRef4.element).isDisconnected()) {
                            C33272c.f67816e.f67810a.mo68955d("webSocketFlow", "WebSocket flow delay reconnect (10000ms)", null);
                        }
                        Duration.Companion companion = Duration.INSTANCE;
                        long duration = DurationKt.toDuration(10000L, DurationUnit.MILLISECONDS);
                        this.f60360g = objectRef3;
                        this.f60354a = webSocket;
                        this.f60355b = objectRef4;
                        this.f60356c = c30045k2;
                        this.f60358e = i12;
                        this.f60359f = 3;
                    }
                }
                return coroutine_suspended;
            }
            if (i13 == 1) {
                i12 = this.f60358e;
                str = this.f60357d;
                c30045k = this.f60356c;
                objectRef2 = this.f60355b;
                webSocketNewWebSocket = this.f60354a;
                objectRef = (Ref.ObjectRef) this.f60360g;
                try {
                    ResultKt.throwOnFailure(obj);
                    webSocketNewWebSocket = this.f60361h.f60371a.newWebSocket(new Request.Builder().url(str + obj).build(), c30045k);
                    this.f60360g = objectRef;
                    this.f60354a = webSocketNewWebSocket;
                    this.f60355b = objectRef2;
                    this.f60356c = c30045k;
                    this.f60357d = null;
                    this.f60358e = i12;
                    this.f60359f = 2;
                    ?? c41716o2 = new C41716o(IntrinsicsKt.intercepted(this), 1);
                    c41716o2.m91142E();
                    objectRef.element = c41716o2;
                    objM91171w = c41716o2.m91171w();
                    if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (objM91171w != coroutine_suspended) {
                        c30045k2 = c30045k;
                        objectRef4 = objectRef2;
                        webSocket = webSocketNewWebSocket;
                        objectRef3 = objectRef;
                        if (!((WebSocketRepositoryImpl$State) objectRef4.element).isDisconnected()) {
                            C33272c.f67816e.f67810a.mo68955d("webSocketFlow", "WebSocket flow delay reconnect (10000ms)", null);
                        }
                        Duration.Companion companion2 = Duration.INSTANCE;
                        long duration2 = DurationKt.toDuration(10000L, DurationUnit.MILLISECONDS);
                        this.f60360g = objectRef3;
                        this.f60354a = webSocket;
                        this.f60355b = objectRef4;
                        this.f60356c = c30045k2;
                        this.f60358e = i12;
                        this.f60359f = 3;
                    }
                    return coroutine_suspended;
                } catch (Throwable th2) {
                    th = th2;
                    C33270a c33270a = C33272c.f67816e;
                    c33270a.f67810a.mo68955d("webSocketFlow", "WebSocket finalization", null);
                    if (webSocketNewWebSocket != null) {
                        Boxing.boxBoolean(webSocketNewWebSocket.close(1000, "finalization"));
                    }
                    c33270a.f67810a.mo68955d("webSocketFlow", "Stop WebSocket flow", null);
                    throw th;
                }
            }
            try {
                if (i13 == 2) {
                    i12 = this.f60358e;
                    c30045k2 = this.f60356c;
                    objectRef4 = this.f60355b;
                    webSocket = this.f60354a;
                    objectRef3 = (Ref.ObjectRef) this.f60360g;
                    ResultKt.throwOnFailure(obj);
                    if (!((WebSocketRepositoryImpl$State) objectRef4.element).isDisconnected()) {
                        C33272c.f67816e.f67810a.mo68955d("webSocketFlow", "WebSocket flow delay reconnect (10000ms)", null);
                    }
                    Duration.Companion companion3 = Duration.INSTANCE;
                    long duration3 = DurationKt.toDuration(10000L, DurationUnit.MILLISECONDS);
                    this.f60360g = objectRef3;
                    this.f60354a = webSocket;
                    this.f60355b = objectRef4;
                    this.f60356c = c30045k2;
                    this.f60358e = i12;
                    this.f60359f = 3;
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i12 = this.f60358e;
                    c30045k2 = this.f60356c;
                    objectRef4 = this.f60355b;
                    webSocket = this.f60354a;
                    objectRef3 = (Ref.ObjectRef) this.f60360g;
                    ResultKt.throwOnFailure(obj);
                }
                i11 = i12;
                webSocket2 = webSocket;
                objectRef = objectRef3;
                objectRef2 = objectRef4;
                c30045k = c30045k2;
                if (!((WebSocketRepositoryImpl$State) objectRef2.element).isDisconnected()) {
                    i11++;
                    C33272c.f67816e.f67810a.mo68955d("webSocketFlow", "WebSocket newWebSocket (attempt " + i11 + ")", null);
                }
                if (objectRef2.element == WebSocketRepositoryImpl$State.DISCONNECTING) {
                    objectRef2.element = WebSocketRepositoryImpl$State.DISCONNECTED;
                }
                C30050p c30050p2 = this.f60361h;
                str2 = c30050p2.f60375e;
                InterfaceC28584k interfaceC28584k2 = c30050p2.f60374d;
                this.f60360g = objectRef;
                this.f60354a = webSocket2;
                this.f60355b = objectRef2;
                this.f60356c = c30045k;
                this.f60357d = str2;
                this.f60358e = i11;
                this.f60359f = 1;
                objMo69411a = interfaceC28584k2.mo69411a(this);
                if (objMo69411a != coroutine_suspended) {
                    i12 = i11;
                    obj = objMo69411a;
                    str = str2;
                    webSocketNewWebSocket = this.f60361h.f60371a.newWebSocket(new Request.Builder().url(str + obj).build(), c30045k);
                    this.f60360g = objectRef;
                    this.f60354a = webSocketNewWebSocket;
                    this.f60355b = objectRef2;
                    this.f60356c = c30045k;
                    this.f60357d = null;
                    this.f60358e = i12;
                    this.f60359f = 2;
                    ?? c41716o3 = new C41716o(IntrinsicsKt.intercepted(this), 1);
                    c41716o3.m91142E();
                    objectRef.element = c41716o3;
                    objM91171w = c41716o3.m91171w();
                    if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (objM91171w != coroutine_suspended) {
                        c30045k2 = c30045k;
                        objectRef4 = objectRef2;
                        webSocket = webSocketNewWebSocket;
                        objectRef3 = objectRef;
                        if (!((WebSocketRepositoryImpl$State) objectRef4.element).isDisconnected()) {
                            C33272c.f67816e.f67810a.mo68955d("webSocketFlow", "WebSocket flow delay reconnect (10000ms)", null);
                        }
                        Duration.Companion companion4 = Duration.INSTANCE;
                        long duration4 = DurationKt.toDuration(10000L, DurationUnit.MILLISECONDS);
                        this.f60360g = objectRef3;
                        this.f60354a = webSocket;
                        this.f60355b = objectRef4;
                        this.f60356c = c30045k2;
                        this.f60358e = i12;
                        this.f60359f = 3;
                    }
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                th = th3;
                webSocket = webSocket2;
                webSocketNewWebSocket = webSocket;
                C33270a c33270a2 = C33272c.f67816e;
                c33270a2.f67810a.mo68955d("webSocketFlow", "WebSocket finalization", null);
                if (webSocketNewWebSocket != null) {
                    Boxing.boxBoolean(webSocketNewWebSocket.close(1000, "finalization"));
                }
                c33270a2.f67810a.mo68955d("webSocketFlow", "Stop WebSocket flow", null);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30046l(C30050p c30050p, Continuation continuation) {
        super(2, continuation);
        this.f60361h = c30050p;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30046l c30046l = new C30046l(this.f60361h, continuation);
        c30046l.f60360g = obj;
        return c30046l;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C30046l c30046l = new C30046l(this.f60361h, (Continuation) obj2);
        c30046l.f60360g = (InterfaceC41574m) obj;
        return c30046l.invokeSuspend(Unit.INSTANCE);
    }
}
