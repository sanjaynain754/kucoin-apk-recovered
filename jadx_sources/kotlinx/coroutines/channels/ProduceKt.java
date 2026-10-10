package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.C41687h0;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC41708m;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.BuilderInference;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.EmptyCoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0004\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001ad\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a§\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152-\b\u0002\u0010\u001d\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017j\u0004\u0018\u0001`\u001c2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0000¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m90084d2 = {"Lkotlinx/coroutines/channels/m;", "Lkotlin/Function0;", "", "block", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/channels/m;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/m0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "Lkotlinx/coroutines/channels/o;", "b", "(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/o;", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/CoroutineStart;", "start", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "c", "(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/o;", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nProduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,300:1\n1#2:301\n426#3,11:302\n*S KotlinDebug\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n*L\n63#1:302,11\n*E\n"})
public final class ProduceKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ProduceKt$a */
    /* JADX INFO: compiled from: Produce.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C41561a implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41708m<Unit> f91512b;

        /* JADX WARN: Multi-variable type inference failed */
        public C41561a(InterfaceC41708m<? super Unit> interfaceC41708m) {
            this.f91512b = interfaceC41708m;
        }

        /* JADX INFO: renamed from: a */
        public final void m90686a(Throwable th2) {
            InterfaceC41708m<Unit> interfaceC41708m = this.f91512b;
            Result.Companion companion = Result.INSTANCE;
            interfaceC41708m.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m90686a(th2);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <E> InterfaceC41576o<E> m90683c(@NotNull InterfaceC41709m0 interfaceC41709m0, @NotNull CoroutineContext coroutineContext, int i11, @NotNull BufferOverflow bufferOverflow, @NotNull CoroutineStart coroutineStart, @Nullable Function1<? super Throwable, Unit> function1, @BuilderInference @NotNull Function2<? super InterfaceC41574m<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        C41573l c41573l = new C41573l(C41687h0.m91060k(interfaceC41709m0, coroutineContext), C41568g.m90691b(i11, bufferOverflow, null, 4, null));
        if (function1 != null) {
            c41573l.mo90426j(function1);
        }
        c41573l.m90474X0(coroutineStart, c41573l, function2);
        return c41573l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m90681a(@NotNull InterfaceC41574m<?> interfaceC41574m, @NotNull Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) {
        ProduceKt$awaitClose$1 produceKt$awaitClose$1;
        if (continuation instanceof ProduceKt$awaitClose$1) {
            produceKt$awaitClose$1 = (ProduceKt$awaitClose$1) continuation;
            int i11 = produceKt$awaitClose$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                produceKt$awaitClose$1.label = i11 - Integer.MIN_VALUE;
            } else {
                produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(continuation);
            }
        } else {
            produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(continuation);
        }
        Object obj = produceKt$awaitClose$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = produceKt$awaitClose$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                if (produceKt$awaitClose$1.get$context().get(InterfaceC41775x1.INSTANCE) != interfaceC41574m) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                produceKt$awaitClose$1.L$0 = interfaceC41574m;
                produceKt$awaitClose$1.L$1 = function0;
                produceKt$awaitClose$1.label = 1;
                C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(produceKt$awaitClose$1), 1);
                c41716o.m91142E();
                interfaceC41574m.mo90591d(new C41561a(c41716o));
                Object objM91171w = c41716o.m91171w();
                if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(produceKt$awaitClose$1);
                }
                if (objM91171w == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = (Function0) produceKt$awaitClose$1.L$1;
                ResultKt.throwOnFailure(obj);
            }
            function0.invoke();
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            function0.invoke();
            throw th2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <E> InterfaceC41576o<E> m90682b(@NotNull InterfaceC41709m0 interfaceC41709m0, @NotNull CoroutineContext coroutineContext, int i11, @BuilderInference @NotNull Function2<? super InterfaceC41574m<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return m90683c(interfaceC41709m0, coroutineContext, i11, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, null, function2);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC41576o m90684d(InterfaceC41709m0 interfaceC41709m0, CoroutineContext coroutineContext, int i11, Function2 function2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return m90682b(interfaceC41709m0, coroutineContext, i11, function2);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ InterfaceC41576o m90685e(InterfaceC41709m0 interfaceC41709m0, CoroutineContext coroutineContext, int i11, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, Function1 function1, Function2 function2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i12 & 8) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        if ((i12 & 16) != 0) {
            function1 = null;
        }
        Function1 function3 = function1;
        return m90683c(interfaceC41709m0, coroutineContext, i11, bufferOverflow, coroutineStart, function3, function2);
    }
}
