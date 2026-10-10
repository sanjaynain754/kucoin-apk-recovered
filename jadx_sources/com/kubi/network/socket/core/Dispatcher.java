package com.kubi.network.socket.core;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41718o1;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42917g;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;
import p605rr.C44170a;
import p852kotlin.Metadata;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u0003R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/network/socket/core/Dispatcher;", "", "<init>", "()V", "Lcom/kubi/network/socket/core/NetworkCall$AsyncCall;", "Lcom/kubi/network/socket/core/NetworkCall;", "call", "", "b", "(Lcom/kubi/network/socket/core/NetworkCall$AsyncCall;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlinx/coroutines/m0;", "Lkotlinx/coroutines/m0;", "coroutineScope", "Companion", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dispatcher.kt\ncom/kubi/network/socket/core/Dispatcher\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,34:1\n49#2,4:35\n*S KotlinDebug\n*F\n+ 1 Dispatcher.kt\ncom/kubi/network/socket/core/Dispatcher\n*L\n20#1:35,4\n*E\n"})
public final class Dispatcher {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41709m0 coroutineScope = C41713n0.m91125a(new CoroutineName("Dispatcher").plus(C41718o1.m91179c(C42917g.m94140f("Dispatcher"))).plus(new C19353a(CoroutineExceptionHandler.INSTANCE)));

    /* JADX INFO: renamed from: com.kubi.network.socket.core.Dispatcher$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"com/kubi/network/socket/core/Dispatcher$a", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 Dispatcher.kt\ncom/kubi/network/socket/core/Dispatcher\n+ 3 NetCoreSocketIssue.kt\ncom/kubi/network/socket/exception/NetCoreSocketIssueKt\n*L\n1#1,110:1\n20#2:111\n52#3,33:112\n*S KotlinDebug\n*F\n+ 1 Dispatcher.kt\ncom/kubi/network/socket/core/Dispatcher\n*L\n20#1:112,33\n*E\n"})
    public static final class C19353a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        /* JADX WARN: Code duplicated, block: B:28:0x003e  */
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            String message;
            boolean zStartsWith$default = true;
            if (!(exception instanceof UnknownHostException) && !(exception instanceof SocketException) && !(exception instanceof SocketTimeoutException) && !(exception instanceof SSLException) && !(exception instanceof SSLProtocolException) && !(exception instanceof SSLPeerUnverifiedException) && !(exception instanceof ConnectionShutdownException)) {
                if (exception instanceof SecurityException) {
                    String message2 = exception.getMessage();
                    if (message2 != null) {
                        zStartsWith$default = StringsKt.startsWith$default(message2, "Package android does not belong to", false, 2, (Object) null);
                    } else {
                        zStartsWith$default = false;
                    }
                } else if (!(exception instanceof IOException) || (message = exception.getMessage()) == null || (!StringsKt.startsWith$default(message, "Required SETTINGS preface not received", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "Unexpected response code for CONNECT", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "exhausted all routes", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "unexpected end of stream", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "stream was reset: CANCEL", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "Software caused connection abort", false, 2, (Object) null) && !message.equals("closed"))) {
                    zStartsWith$default = false;
                }
            }
            if (zStartsWith$default) {
                C44128b.m97263g("Dispatcher", exception);
            } else {
                C44170a.m97380b(exception, "Dispatcher");
            }
        }

        public C19353a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m42937b(@NotNull NetworkCall.AsyncCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        C41696j.m91104d(this.coroutineScope, null, null, new Dispatcher$execute$1(call, null), 3, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m42936a() {
    }
}
