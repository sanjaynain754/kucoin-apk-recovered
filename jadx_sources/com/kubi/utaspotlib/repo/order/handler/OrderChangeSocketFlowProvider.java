package com.kubi.utaspotlib.repo.order.handler;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.network.restful.C19321b;
import er.C37237b;
import gr.C38000b;
import gr.C38006h;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import n70.InterfaceC42771a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.time.DurationKt;
import p852kotlin.time.DurationUnit;

/* JADX INFO: compiled from: OrderChangeSocketFlowProvider.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ-\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u000b\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/utaspotlib/repo/order/handler/OrderChangeSocketFlowProvider;", "", "<init>", "()V", "unifyWsApi", "Lcom/kubi/utaspotlib/api/OrdersWsApi;", "getUnifyWsApi", "()Lcom/kubi/utaspotlib/api/OrdersWsApi;", "unifyWsApi$delegate", "Lkotlin/Lazy;", "createOrderChangeSocketFlow", "Lkotlinx/coroutines/flow/Flow;", "", "throttleLatest", ExifInterface.GPS_DIRECTION_TRUE, "timeout", "Lkotlin/time/Duration;", "throttleLatest-HG0u8IE", "(Lkotlinx/coroutines/flow/Flow;J)Lkotlinx/coroutines/flow/Flow;", "Companion", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOrderChangeSocketFlowProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderChangeSocketFlowProvider.kt\ncom/kubi/utaspotlib/repo/order/handler/OrderChangeSocketFlowProvider\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,55:1\n17#2:56\n19#2:60\n46#3:57\n51#3:59\n105#4:58\n*S KotlinDebug\n*F\n+ 1 OrderChangeSocketFlowProvider.kt\ncom/kubi/utaspotlib/repo/order/handler/OrderChangeSocketFlowProvider\n*L\n45#1:56\n45#1:60\n45#1:57\n45#1:59\n45#1:58\n*E\n"})
public final class OrderChangeSocketFlowProvider {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f54193b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f54194a = LazyKt.lazy(new Function0() { // from class: com.kubi.utaspotlib.repo.order.handler.e0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OrderChangeSocketFlowProvider.m66250e();
        }
    });

    /* JADX INFO: compiled from: OrderChangeSocketFlowProvider.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/utaspotlib/repo/order/handler/OrderChangeSocketFlowProvider$Companion;", "", "<init>", "()V", "CLIENT_UNIFIED", "", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC42771a m66250e() {
        return (InterfaceC42771a) new C19321b.a().m42777b(new C38000b(C37237b.m83282e("network/channel_unified"))).m42778c(new C38006h()).m42776a().m42772b(InterfaceC42771a.class);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC42771a m66252c() {
        return (InterfaceC42771a) this.f54194a.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC41634e<String> m66251b() {
        final InterfaceC41634e interfaceC41634eM93706b = InterfaceC42771a.m93706b(m66252c(), null, 1, null);
        return m66253d(C41636g.m90935r(C41636g.m90939v(new InterfaceC41634e<String>() { // from class: com.kubi.utaspotlib.repo.order.handler.OrderChangeSocketFlowProvider$createOrderChangeSocketFlow$$inlined$filter$1

            /* JADX INFO: renamed from: com.kubi.utaspotlib.repo.order.handler.OrderChangeSocketFlowProvider$createOrderChangeSocketFlow$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 OrderChangeSocketFlowProvider.kt\ncom/kubi/utaspotlib/repo/order/handler/OrderChangeSocketFlowProvider\n*L\n1#1,49:1\n18#2:50\n19#2:52\n45#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f54196b;

                /* JADX INFO: renamed from: com.kubi.utaspotlib.repo.order.handler.OrderChangeSocketFlowProvider$createOrderChangeSocketFlow$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.utaspotlib.repo.order.handler.OrderChangeSocketFlowProvider$createOrderChangeSocketFlow$$inlined$filter$1$2", m90122f = "OrderChangeSocketFlowProvider.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC41635f interfaceC41635f) {
                    this.f54196b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f54196b;
                        if (((String) obj).length() > 0) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super String> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM93706b.collect(new AnonymousClass2(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        })), DurationKt.toDuration(1, DurationUnit.SECONDS));
    }

    /* JADX INFO: renamed from: d */
    public final <T> InterfaceC41634e<T> m66253d(InterfaceC41634e<? extends T> interfaceC41634e, long j11) {
        return C41636g.m90896T(C41636g.m90935r(interfaceC41634e), new OrderChangeSocketFlowProvider$throttleLatest$1(j11, null));
    }
}
