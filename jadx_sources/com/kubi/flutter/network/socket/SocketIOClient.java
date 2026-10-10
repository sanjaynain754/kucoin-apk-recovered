package com.kubi.flutter.network.socket;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.flutter.network.channel.NetworkChannel;
import com.kubi.network.api.model.NetworkMessage;
import er.InterfaceC37236a;
import gg.C37917a;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p263fg.C37460i;
import p263fg.InterfaceC37458g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: SocketIOClient.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096@¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/flutter/network/socket/SocketIOClient;", "Lcom/kubi/flutter/network/socket/a;", "", "channelName", "Lfg/g;", "Lfg/i;", "channelCodec", "Lcom/kubi/flutter/network/channel/NetworkChannel;", "channelProxy", "<init>", "(Ljava/lang/String;Lfg/g;Lcom/kubi/flutter/network/channel/NetworkChannel;)V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "", "arguments", "k", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "i", "r", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "Ljava/lang/String;", "Lfg/g;", CmcdData.Factory.STREAM_TYPE_LIVE, "Lcom/kubi/flutter/network/channel/NetworkChannel;", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SocketIOClient extends AbstractC12616a {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final String channelName;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC37458g<C37460i> channelCodec;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final NetworkChannel channelProxy;

    /* JADX INFO: renamed from: com.kubi.flutter.network.socket.SocketIOClient$a */
    /* JADX INFO: compiled from: SocketIOClient.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSocketIOClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketIOClient.kt\ncom/kubi/flutter/network/socket/SocketIOClient$observeMessage$2\n+ 2 NetFlutterIssue.kt\ncom/kubi/flutter/network/exception/NetFlutterIssueKt\n*L\n1#1,75:1\n55#2,6:76\n*S KotlinDebug\n*F\n+ 1 SocketIOClient.kt\ncom/kubi/flutter/network/socket/SocketIOClient$observeMessage$2\n*L\n41#1:76,6\n*E\n"})
    public static final class C12612a<T> implements InterfaceC41635f {
        public C12612a() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(NetworkMessage<?> networkMessage, Continuation<? super Unit> continuation) {
            try {
                SocketIOClient socketIOClient = SocketIOClient.this;
                socketIOClient.m23800f("message", socketIOClient.channelCodec.mo84253b(networkMessage));
            } catch (Throwable th2) {
                String str = SocketIOClient.this.channelName;
                if (C37917a.m85739b(th2)) {
                    C44128b.m97263g("NetFlutterIssue", th2);
                } else {
                    C37917a.m85740c(th2, str);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.network.socket.SocketIOClient$onAttachedToEngine$1 */
    /* JADX INFO: compiled from: SocketIOClient.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.kubi.flutter.network.socket.SocketIOClient$onAttachedToEngine$1", m90122f = "SocketIOClient.kt", m90123i = {}, m90124l = {32}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C126151 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C126151(Continuation<? super C126151> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SocketIOClient.this.new C126151(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C126151) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                SocketIOClient socketIOClient = SocketIOClient.this;
                this.label = 1;
                if (socketIOClient.m23833r(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocketIOClient(@NotNull String channelName, @NotNull InterfaceC37458g<C37460i> channelCodec, @NotNull NetworkChannel channelProxy) {
        super(channelName, channelProxy);
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        Intrinsics.checkNotNullParameter(channelCodec, "channelCodec");
        Intrinsics.checkNotNullParameter(channelProxy, "channelProxy");
        this.channelName = channelName;
        this.channelCodec = channelCodec;
        this.channelProxy = channelProxy;
    }

    @Override // com.kubi.flutter.network.socket.AbstractC12616a
    @Nullable
    /* JADX INFO: renamed from: i */
    public Object mo23831i(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.kubi.flutter.network.channel.BaseNetworkClient, com.kubi.flutter.network.channel.InterfaceC12605c
    public void onAttachedToEngine(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        super.onAttachedToEngine(binding);
        C41696j.m91104d(getNetworkScope(), null, null, new C126151(null), 3, null);
    }

    @Override // com.kubi.flutter.network.socket.AbstractC12616a
    @Nullable
    /* JADX INFO: renamed from: k */
    public Object mo23832k(@Nullable Object obj, @NotNull Continuation<Object> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new SocketIOClient$handleRequest$2(this, obj, null), continuation);
    }

    /* JADX INFO: renamed from: r */
    public final Object m23833r(Continuation<? super Unit> continuation) {
        InterfaceC41634e<NetworkMessage<?>> interfaceC41634eMo42859d;
        InterfaceC37236a networkClient = getNetworkClient();
        if (networkClient != null && (interfaceC41634eMo42859d = networkClient.mo42859d()) != null) {
            Object objCollect = interfaceC41634eMo42859d.collect(new C12612a(), continuation);
            if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objCollect;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
