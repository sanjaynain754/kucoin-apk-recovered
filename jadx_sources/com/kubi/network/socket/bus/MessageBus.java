package com.kubi.network.socket.bus;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkMessage;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41718o1;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41668m;
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

/* JADX INFO: compiled from: MessageBus.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/network/socket/bus/MessageBus;", "", "", "Lcom/kubi/network/socket/bus/a;", "interceptors", "<init>", "(Ljava/util/List;)V", "Lkotlinx/coroutines/flow/e;", "Lcom/kubi/network/api/model/NetworkMessage;", "d", "()Lkotlinx/coroutines/flow/e;", "any", "", "c", "(Lcom/kubi/network/api/model/NetworkMessage;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/List;", "Lkotlinx/coroutines/flow/m;", "b", "Lkotlinx/coroutines/flow/m;", "pipeline", "Lkotlinx/coroutines/m0;", "Lkotlinx/coroutines/m0;", "coroutineScope", "Lcom/kubi/network/socket/bus/InterceptorChain;", "Lcom/kubi/network/socket/bus/InterceptorChain;", "chain", "e", "Companion", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMessageBus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageBus.kt\ncom/kubi/network/socket/bus/MessageBus\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,54:1\n49#2,4:55\n*S KotlinDebug\n*F\n+ 1 MessageBus.kt\ncom/kubi/network/socket/bus/MessageBus\n*L\n29#1:55,4\n*E\n"})
public final class MessageBus {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC19345a> interceptors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41668m<NetworkMessage<?>> pipeline;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41709m0 coroutineScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterceptorChain chain;

    /* JADX INFO: renamed from: com.kubi.network.socket.bus.MessageBus$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"com/kubi/network/socket/bus/MessageBus$a", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 MessageBus.kt\ncom/kubi/network/socket/bus/MessageBus\n+ 3 NetCoreSocketIssue.kt\ncom/kubi/network/socket/exception/NetCoreSocketIssueKt\n*L\n1#1,110:1\n29#2:111\n52#3,33:112\n*S KotlinDebug\n*F\n+ 1 MessageBus.kt\ncom/kubi/network/socket/bus/MessageBus\n*L\n29#1:112,33\n*E\n"})
    public static final class C19344a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
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
                C44128b.m97263g("MessageBus", exception);
            } else {
                C44170a.m97380b(exception, "MessageBus");
            }
        }

        public C19344a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageBus(@NotNull List<? extends InterfaceC19345a> interceptors) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        this.interceptors = interceptors;
        this.pipeline = C41674s.m91001b(0, Integer.MAX_VALUE, BufferOverflow.SUSPEND, 1, null);
        this.coroutineScope = C41713n0.m91125a(new CoroutineName("MessageBus").plus(C41718o1.m91179c(C42917g.m94140f("MessageBus"))).plus(new C19344a(CoroutineExceptionHandler.INSTANCE)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MessageBus$chain$1$1(this));
        arrayList.addAll(interceptors);
        this.chain = new InterceptorChain(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public final void m42902c(@NotNull NetworkMessage<?> any) {
        Intrinsics.checkNotNullParameter(any, "any");
        C41696j.m91104d(this.coroutineScope, null, null, new MessageBus$dispatch$1(this, any, null), 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC41634e<NetworkMessage<?>> m42903d() {
        return this.pipeline;
    }
}
