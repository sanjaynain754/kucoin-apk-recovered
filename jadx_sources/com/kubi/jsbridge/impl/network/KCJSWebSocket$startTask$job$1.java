package com.kubi.jsbridge.impl.network;

import com.kubi.config.exception.KCConfigException;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import com.kubi.p110rn.core.socket.KRNSocketNativeBridge;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: KCJSWebSocket.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.jsbridge.impl.network.KCJSWebSocket$startTask$job$1", m90122f = "KCJSWebSocket.kt", m90123i = {0}, m90124l = {256}, m90125m = "invokeSuspend", m90126n = {"flow"}, m90127s = {"L$0"})
public final class KCJSWebSocket$startTask$job$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $taskId;
    final /* synthetic */ int $throttle;
    final /* synthetic */ long $throttleInterval;
    final /* synthetic */ String $topic;
    final /* synthetic */ IKrnSocketWsApi $wsApi;
    Object L$0;
    int label;
    final /* synthetic */ KCJSWebSocket this$0;

    /* JADX INFO: renamed from: com.kubi.jsbridge.impl.network.KCJSWebSocket$startTask$job$1$1 */
    /* JADX INFO: compiled from: KCJSWebSocket.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "e", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.jsbridge.impl.network.KCJSWebSocket$startTask$job$1$1", m90122f = "KCJSWebSocket.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nKCJSWebSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCJSWebSocket.kt\ncom/kubi/jsbridge/impl/network/KCJSWebSocket$startTask$job$1$1\n+ 2 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,337:1\n44#2,2:338\n*S KotlinDebug\n*F\n+ 1 KCJSWebSocket.kt\ncom/kubi/jsbridge/impl/network/KCJSWebSocket$startTask$job$1$1\n*L\n254#1:338,2\n*E\n"})
    public static final class C152591 extends SuspendLambda implements Function3<InterfaceC41635f<? super SubscribeMessage>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $taskId;
        final /* synthetic */ String $topic;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152591(String str, String str2, Continuation<? super C152591> continuation) {
            super(3, continuation);
            this.$taskId = str;
            this.$topic = str2;
        }

        @Override // p852kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC41635f<? super SubscribeMessage> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
            C152591 c152591 = new C152591(this.$taskId, this.$topic, continuation);
            c152591.L$0 = th2;
            return c152591.invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C43846g.m96568c(new KCConfigException(th2, "KCJSWebSocket", false, null, 8, null), null, 2, null);
            C44128b.m97262f("KCJSWebSocket", "binary subscribe error: taskId=" + this.$taskId + ", topic=" + this.$topic, th2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.jsbridge.impl.network.KCJSWebSocket$startTask$job$1$a */
    /* JADX INFO: compiled from: KCJSWebSocket.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nKCJSWebSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCJSWebSocket.kt\ncom/kubi/jsbridge/impl/network/KCJSWebSocket$startTask$job$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n1#2:338\n*E\n"})
    public static final class C15260a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ KCJSWebSocket f27449b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f27450c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f27451d;

        public C15260a(KCJSWebSocket kCJSWebSocket, String str, String str2) {
            this.f27449b = kCJSWebSocket;
            this.f27450c = str;
            this.f27451d = str2;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(SubscribeMessage subscribeMessage, Continuation<? super Unit> continuation) {
            if (subscribeMessage == null) {
                return Unit.INSTANCE;
            }
            byte[] bArrM31721d = this.f27449b.m31721d(subscribeMessage.getExtension());
            if (bArrM31721d != null) {
                String str = this.f27450c;
                String topic = subscribeMessage.getTopic();
                KRNSocketNativeBridge.emit(str, "socket", topic.length() == 0 ? this.f27451d : topic, subscribeMessage.getSubject(), 0, bArrM31721d, true, null);
            } else {
                String data = subscribeMessage.getData();
                if (data == null) {
                    return Unit.INSTANCE;
                }
                String str2 = this.f27450c;
                String topic2 = subscribeMessage.getTopic();
                KRNSocketNativeBridge.emit(str2, "socket", topic2.length() == 0 ? this.f27451d : topic2, subscribeMessage.getSubject(), 0, null, false, data);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCJSWebSocket$startTask$job$1(IKrnSocketWsApi iKrnSocketWsApi, String str, int i11, long j11, String str2, KCJSWebSocket kCJSWebSocket, Continuation<? super KCJSWebSocket$startTask$job$1> continuation) {
        super(2, continuation);
        this.$wsApi = iKrnSocketWsApi;
        this.$topic = str;
        this.$throttle = i11;
        this.$throttleInterval = j11;
        this.$taskId = str2;
        this.this$0 = kCJSWebSocket;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCJSWebSocket$startTask$job$1(this.$wsApi, this.$topic, this.$throttle, this.$throttleInterval, this.$taskId, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCJSWebSocket$startTask$job$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e<SubscribeMessage> interfaceC41634eM31820a = this.$wsApi.m31820a(this.$topic);
            if (this.$throttle == 1) {
                long j11 = this.$throttleInterval;
                if (j11 > 0) {
                    interfaceC41634eM31820a = C41636g.m90906b0(interfaceC41634eM31820a, j11);
                }
            }
            InterfaceC41634e interfaceC41634eM90917h = C41636g.m90917h(interfaceC41634eM31820a, new C152591(this.$taskId, this.$topic, null));
            C15260a c15260a = new C15260a(this.this$0, this.$taskId, this.$topic);
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41634eM31820a);
            this.label = 1;
            if (interfaceC41634eM90917h.collect(c15260a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
