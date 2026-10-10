package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001aG\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0005\u001a0\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013\u001aG\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0004\b\u0014\u0010\f¨\u0006\u0015"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/e;", "", "count", "b", "(Lkotlinx/coroutines/flow/e;I)Lkotlinx/coroutines/flow/e;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "predicate", "c", "(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;", "e", "Lkotlinx/coroutines/flow/f;", "value", "ownershipMarker", "", "d", "(Lkotlinx/coroutines/flow/f;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "kotlinx-coroutines-core"}, m90085k = 5, m90086mv = {2, 1, 0}, m90088xi = 48, m90089xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,141:1\n1#2:142\n105#3:143\n105#3:144\n105#3:145\n105#3:146\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n19#1:143\n30#1:144\n49#1:145\n81#1:146\n*E\n"})
public final /* synthetic */ class FlowKt__LimitKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$a */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    /* JADX INFO: loaded from: classes61.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$a", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,108:1\n20#2,5:109\n*E\n"})
    public static final class C41602a<T> implements InterfaceC41634e<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41634e f91570b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f91571c;

        public C41602a(InterfaceC41634e interfaceC41634e, int i11) {
            this.f91570b = interfaceC41634e;
            this.f91571c = i11;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41634e
        public Object collect(InterfaceC41635f<? super T> interfaceC41635f, Continuation<? super Unit> continuation) {
            Object objCollect = this.f91570b.collect(new FlowKt__LimitKt$drop$2$1(new Ref.IntRef(), this.f91571c, interfaceC41635f), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$b */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$b", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,108:1\n31#2,10:109\n*E\n"})
    public static final class C41603b<T> implements InterfaceC41634e<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41634e f91572b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function2 f91573c;

        public C41603b(InterfaceC41634e interfaceC41634e, Function2 function2) {
            this.f91572b = interfaceC41634e;
            this.f91573c = function2;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41634e
        public Object collect(InterfaceC41635f<? super T> interfaceC41635f, Continuation<? super Unit> continuation) {
            Object objCollect = this.f91572b.collect(new FlowKt__LimitKt$dropWhile$1$1(new Ref.BooleanRef(), interfaceC41635f, this.f91573c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceC41634e<T> m90781b(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, int i11) {
        if (i11 >= 0) {
            return new C41602a(interfaceC41634e, i11);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i11).toString());
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T> InterfaceC41634e<T> m90782c(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return new C41603b(interfaceC41634e, function2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final <T> Object m90783d(InterfaceC41635f<? super T> interfaceC41635f, T t11, Object obj, Continuation<? super Unit> continuation) {
        FlowKt__LimitKt$emitAbort$1 flowKt__LimitKt$emitAbort$1;
        if (continuation instanceof FlowKt__LimitKt$emitAbort$1) {
            flowKt__LimitKt$emitAbort$1 = (FlowKt__LimitKt$emitAbort$1) continuation;
            int i11 = flowKt__LimitKt$emitAbort$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$emitAbort$1.label = i11 - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(continuation);
            }
        } else {
            flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(continuation);
        }
        Object obj2 = flowKt__LimitKt$emitAbort$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = flowKt__LimitKt$emitAbort$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            flowKt__LimitKt$emitAbort$1.L$0 = obj;
            flowKt__LimitKt$emitAbort$1.label = 1;
            if (interfaceC41635f.emit(t11, flowKt__LimitKt$emitAbort$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = flowKt__LimitKt$emitAbort$1.L$0;
            ResultKt.throwOnFailure(obj2);
        }
        throw new AbortFlowException(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> InterfaceC41634e<T> m90784e(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, int i11) {
        if (i11 > 0) {
            return new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(interfaceC41634e, i11);
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " should be positive").toString());
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final <T> InterfaceC41634e<T> m90785f(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(interfaceC41634e, function2);
    }
}
