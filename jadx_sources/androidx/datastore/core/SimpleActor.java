package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.channels.C41568g;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.InterfaceC41565d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SimpleActor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\t\u0012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R0\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m90084d2 = {"Landroidx/datastore/core/SimpleActor;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/m0;", "scope", "Lkotlin/Function1;", "", "", "onComplete", "Lkotlin/Function2;", "onUndeliveredElement", "Lkotlin/coroutines/Continuation;", "consumeMessage", "<init>", "(Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "msg", "offer", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/m0;", "Lkotlin/jvm/functions/Function2;", "Lkotlinx/coroutines/channels/d;", "messageQueue", "Lkotlinx/coroutines/channels/d;", "Landroidx/datastore/core/AtomicInt;", "remainingMessages", "Landroidx/datastore/core/AtomicInt;", "datastore-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSimpleActor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleActor.kt\nandroidx/datastore/core/SimpleActor\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,127:1\n548#2,5:128\n*S KotlinDebug\n*F\n+ 1 SimpleActor.kt\nandroidx/datastore/core/SimpleActor\n*L\n104#1:128,5\n*E\n"})
public final class SimpleActor<T> {

    @NotNull
    private final Function2<T, Continuation<? super Unit>, Object> consumeMessage;

    @NotNull
    private final InterfaceC41565d<T> messageQueue;

    @NotNull
    private final AtomicInt remainingMessages;

    @NotNull
    private final InterfaceC41709m0 scope;

    /* JADX INFO: renamed from: androidx.datastore.core.SimpleActor$offer$2 */
    /* JADX INFO: compiled from: SimpleActor.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
    @DebugMetadata(m90121c = "androidx.datastore.core.SimpleActor$offer$2", m90122f = "SimpleActor.kt", m90123i = {}, m90124l = {121, 121}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C23462 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ SimpleActor<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23462(SimpleActor<T> simpleActor, Continuation<? super C23462> continuation) {
            super(2, continuation);
            this.this$0 = simpleActor;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C23462(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C23462) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0051 A[PHI: r1 r6
          0x0051: PHI (r1v1 kotlin.jvm.functions.Function2) = (r1v2 kotlin.jvm.functions.Function2), (r1v4 kotlin.jvm.functions.Function2) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
          0x0051: PHI (r6v5 java.lang.Object) = (r6v12 java.lang.Object), (r6v0 java.lang.Object) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        
            if (r1.invoke(r6, r5) == r0) goto L17;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:18:0x005d). Please report as a decompilation issue!!! */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Function2 function2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    function2 = (Function2) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 2;
                }
            } else {
                ResultKt.throwOnFailure(obj);
                if (((SimpleActor) this.this$0).remainingMessages.get() <= 0) {
                    throw new IllegalStateException("Check failed.");
                }
                C41713n0.m91131g(((SimpleActor) this.this$0).scope);
                function2 = ((SimpleActor) this.this$0).consumeMessage;
                InterfaceC41565d interfaceC41565d = ((SimpleActor) this.this$0).messageQueue;
                this.L$0 = function2;
                this.label = 1;
                obj = interfaceC41565d.mo90550D(this);
                if (obj != coroutine_suspended) {
                    this.L$0 = null;
                    this.label = 2;
                }
                return coroutine_suspended;
            }
            if (((SimpleActor) this.this$0).remainingMessages.decrementAndGet() == 0) {
                return Unit.INSTANCE;
            }
            C41713n0.m91131g(((SimpleActor) this.this$0).scope);
            function2 = ((SimpleActor) this.this$0).consumeMessage;
            InterfaceC41565d interfaceC41565d2 = ((SimpleActor) this.this$0).messageQueue;
            this.L$0 = function2;
            this.label = 1;
            obj = interfaceC41565d2.mo90550D(this);
            if (obj != coroutine_suspended) {
                this.L$0 = null;
                this.label = 2;
            }
            return coroutine_suspended;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleActor(@NotNull InterfaceC41709m0 scope, @NotNull final Function1<? super Throwable, Unit> onComplete, @NotNull final Function2<? super T, ? super Throwable, Unit> onUndeliveredElement, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> consumeMessage) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.scope = scope;
        this.consumeMessage = consumeMessage;
        this.messageQueue = C41568g.m90691b(Integer.MAX_VALUE, null, null, 6, null);
        this.remainingMessages = new AtomicInt(0);
        InterfaceC41775x1 interfaceC41775x1 = (InterfaceC41775x1) scope.getCoroutineContext().get(InterfaceC41775x1.INSTANCE);
        if (interfaceC41775x1 != null) {
            interfaceC41775x1.mo90426j(new Function1<Throwable, Unit>() { // from class: androidx.datastore.core.SimpleActor.1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    invoke2(th2);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable Throwable th2) {
                    Unit unit;
                    onComplete.invoke(th2);
                    ((SimpleActor) this).messageQueue.mo90553F(th2);
                    do {
                        Object objM90673f = ChannelResult.m90673f(((SimpleActor) this).messageQueue.mo90609o());
                        if (objM90673f != null) {
                            onUndeliveredElement.invoke((T) objM90673f, th2);
                            unit = Unit.INSTANCE;
                        } else {
                            unit = null;
                        }
                    } while (unit != null);
                }
            });
        }
    }

    public final void offer(T msg) {
        Object objMo90594e = this.messageQueue.mo90594e(msg);
        if (objMo90594e instanceof ChannelResult.Closed) {
            Throwable thM90672e = ChannelResult.m90672e(objMo90594e);
            if (thM90672e != null) {
                throw thM90672e;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!ChannelResult.m90677j(objMo90594e)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.remainingMessages.getAndIncrement() == 0) {
            C41696j.m91104d(this.scope, null, null, new C23462(this, null), 3, null);
        }
    }
}
