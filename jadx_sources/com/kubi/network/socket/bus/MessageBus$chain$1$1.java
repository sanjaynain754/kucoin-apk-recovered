package com.kubi.network.socket.bus;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkMessage;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import kotlinx.coroutines.flow.InterfaceC41668m;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p605rr.C44170a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: MessageBus.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m90084d2 = {"com/kubi/network/socket/bus/MessageBus$chain$1$1", "Lcom/kubi/network/socket/bus/a;", "Lcom/kubi/network/api/model/NetworkMessage;", "msg", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/api/model/NetworkMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMessageBus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageBus.kt\ncom/kubi/network/socket/bus/MessageBus$chain$1$1\n+ 2 NetCoreSocketIssue.kt\ncom/kubi/network/socket/exception/NetCoreSocketIssueKt\n*L\n1#1,54:1\n52#2,33:55\n*S KotlinDebug\n*F\n+ 1 MessageBus.kt\ncom/kubi/network/socket/bus/MessageBus$chain$1$1\n*L\n36#1:55,33\n*E\n"})
public final class MessageBus$chain$1$1 implements InterfaceC19345a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MessageBus f36021a;

    public MessageBus$chain$1$1(MessageBus messageBus) {
        this.f36021a = messageBus;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.network.socket.bus.InterfaceC19345a
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo42904a(@NotNull NetworkMessage<?> networkMessage, @NotNull Continuation<? super Boolean> continuation) {
        MessageBus$chain$1$1$intercept$1 messageBus$chain$1$1$intercept$1;
        boolean zStartsWith$default;
        String message;
        if (continuation instanceof MessageBus$chain$1$1$intercept$1) {
            messageBus$chain$1$1$intercept$1 = (MessageBus$chain$1$1$intercept$1) continuation;
            int i11 = messageBus$chain$1$1$intercept$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                messageBus$chain$1$1$intercept$1.label = i11 - Integer.MIN_VALUE;
            } else {
                messageBus$chain$1$1$intercept$1 = new MessageBus$chain$1$1$intercept$1(this, continuation);
            }
        } else {
            messageBus$chain$1$1$intercept$1 = new MessageBus$chain$1$1$intercept$1(this, continuation);
        }
        Object obj = messageBus$chain$1$1$intercept$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = messageBus$chain$1$1$intercept$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC41668m interfaceC41668m = this.f36021a.pipeline;
                messageBus$chain$1$1$intercept$1.label = 1;
                if (interfaceC41668m.emit(networkMessage, messageBus$chain$1$1$intercept$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e11) {
            if ((e11 instanceof UnknownHostException) || (e11 instanceof SocketException) || (e11 instanceof SocketTimeoutException) || (e11 instanceof SSLException) || (e11 instanceof SSLProtocolException) || (e11 instanceof SSLPeerUnverifiedException) || (e11 instanceof ConnectionShutdownException)) {
                zStartsWith$default = true;
            } else {
                zStartsWith$default = false;
                if (e11 instanceof SecurityException) {
                    String message2 = e11.getMessage();
                    if (message2 != null) {
                        zStartsWith$default = StringsKt.startsWith$default(message2, "Package android does not belong to", false, 2, (Object) null);
                    }
                } else if ((e11 instanceof IOException) && (message = e11.getMessage()) != null && (StringsKt.startsWith$default(message, "Required SETTINGS preface not received", false, 2, (Object) null) || StringsKt.startsWith$default(message, "Unexpected response code for CONNECT", false, 2, (Object) null) || StringsKt.startsWith$default(message, "exhausted all routes", false, 2, (Object) null) || StringsKt.startsWith$default(message, "unexpected end of stream", false, 2, (Object) null) || StringsKt.startsWith$default(message, "stream was reset: CANCEL", false, 2, (Object) null) || StringsKt.startsWith$default(message, "Software caused connection abort", false, 2, (Object) null) || message.equals("closed"))) {
                    zStartsWith$default = true;
                }
            }
            if (zStartsWith$default) {
                C44128b.m97263g("MessageBus", e11);
            } else {
                C44170a.m97380b(e11, "MessageBus");
            }
        }
        return Boxing.boxBoolean(true);
    }
}
