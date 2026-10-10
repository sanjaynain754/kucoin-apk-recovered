package com.kubi.flutter.network.socket;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkResponse;
import er.InterfaceC37236a;
import fr.InterfaceC37581b;
import fr.InterfaceC37582c;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.InterfaceC41708m;
import kotlinx.coroutines.InterfaceC41709m0;
import p263fg.C37460i;
import p263fg.InterfaceC37458g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SocketIOClient.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)Ljava/lang/Object;"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "com.kubi.flutter.network.socket.SocketIOClient$handleRequest$2", m90122f = "SocketIOClient.kt", m90123i = {}, m90124l = {76}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nSocketIOClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketIOClient.kt\ncom/kubi/flutter/network/socket/SocketIOClient$handleRequest$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,75:1\n314#2,11:76\n*S KotlinDebug\n*F\n+ 1 SocketIOClient.kt\ncom/kubi/flutter/network/socket/SocketIOClient$handleRequest$2\n*L\n47#1:76,11\n*E\n"})
public final class SocketIOClient$handleRequest$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Object>, Object> {
    final /* synthetic */ Object $arguments;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SocketIOClient this$0;

    /* JADX INFO: renamed from: com.kubi.flutter.network.socket.SocketIOClient$handleRequest$2$a */
    /* JADX INFO: compiled from: SocketIOClient.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C12613a implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC37581b f22026b;

        public C12613a(InterfaceC37581b interfaceC37581b) {
            this.f22026b = interfaceC37581b;
        }

        /* JADX INFO: renamed from: a */
        public final void m23835a(Throwable th2) {
            this.f22026b.cancel();
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m23835a(th2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.network.socket.SocketIOClient$handleRequest$2$b */
    /* JADX INFO: compiled from: SocketIOClient.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"com/kubi/flutter/network/socket/SocketIOClient$handleRequest$2$b", "Lfr/c;", "", "exception", "", "onFailure", "(Ljava/lang/Throwable;)V", "Lcom/kubi/network/api/model/NetworkResponse;", "response", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/api/model/NetworkResponse;)V", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C12614b implements InterfaceC37582c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC41708m<Object> f22027a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SocketIOClient f22028b;

        public C12614b(InterfaceC41708m<Object> interfaceC41708m, SocketIOClient socketIOClient) {
            this.f22027a = interfaceC41708m;
            this.f22028b = socketIOClient;
        }

        @Override // fr.InterfaceC37582c
        /* JADX INFO: renamed from: a */
        public void mo23836a(NetworkResponse<?> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                InterfaceC41708m<Object> interfaceC41708m = this.f22027a;
                Result.Companion companion = Result.INSTANCE;
                interfaceC41708m.resumeWith(Result.m103844constructorimpl(this.f22028b.channelCodec.mo84254c(response)));
            } catch (Throwable th2) {
                InterfaceC41708m<Object> interfaceC41708m2 = this.f22027a;
                Result.Companion companion2 = Result.INSTANCE;
                interfaceC41708m2.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(th2)));
            }
        }

        @Override // fr.InterfaceC37582c
        public void onFailure(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            InterfaceC41708m<Object> interfaceC41708m = this.f22027a;
            Result.Companion companion = Result.INSTANCE;
            interfaceC41708m.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(exception)));
        }

        @Override // fr.InterfaceC37582c
        /* JADX INFO: renamed from: b */
        public InterfaceC37582c mo23837b(Executor executor) {
            return InterfaceC37582c.a.m84719c(this, executor);
        }
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Object> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<Object>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocketIOClient$handleRequest$2(SocketIOClient socketIOClient, Object obj, Continuation<? super SocketIOClient$handleRequest$2> continuation) {
        super(2, continuation);
        this.this$0 = socketIOClient;
        this.$arguments = obj;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SocketIOClient$handleRequest$2(this.this$0, this.$arguments, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<Object> continuation) {
        return ((SocketIOClient$handleRequest$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SocketIOClient socketIOClient = this.this$0;
        Object obj2 = this.$arguments;
        this.L$0 = socketIOClient;
        this.L$1 = obj2;
        this.label = 1;
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(this), 1);
        c41716o.m91142E();
        InterfaceC37236a networkClient = socketIOClient.getNetworkClient();
        if (networkClient != null) {
            InterfaceC37458g interfaceC37458g = socketIOClient.channelCodec;
            if (obj2 == null) {
                Result.Companion companion = Result.INSTANCE;
                c41716o.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(new NullPointerException("arguments is null"))));
            } else {
                InterfaceC37581b interfaceC37581bMo42861f = networkClient.mo42861f(((C37460i) interfaceC37458g.mo84252a(obj2)).getRequest());
                if (interfaceC37581bMo42861f != null) {
                    c41716o.mo91119t(new C12613a(interfaceC37581bMo42861f));
                    interfaceC37581bMo42861f.mo42941a(new C12614b(c41716o, socketIOClient));
                }
            }
        }
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(this);
        }
        if (objM91171w == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM91171w;
    }
}
