package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.NoSuchElementException;
import kotlinx.coroutines.C41783z1;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.C41654h;
import kotlinx.coroutines.flow.internal.C41658l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001ar\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00022F\u0010\n\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003H\u0086@¢\u0006\u0004\b\u000b\u0010\f\u001a\"\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a \u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u000f\u0010\u000e\u001aD\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014\u001a\"\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0015\u0010\u000e\u001aF\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010H\u0086@¢\u0006\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, m90084d2 = {ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/e;", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "accumulator", "value", "Lkotlin/coroutines/Continuation;", "", "operation", "e", "(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlin/Function2;", "", "predicate", "b", "(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "d", "kotlinx-coroutines-core"}, m90085k = 5, m90086mv = {2, 1, 0}, m90088xi = 48, m90089xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,168:1\n124#2,17:169\n124#2,17:186\n124#2,17:203\n124#2,17:220\n124#2,17:237\n*S KotlinDebug\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n68#1:169,17\n88#1:186,17\n102#1:203,17\n120#1:220,17\n133#1:237,17\n*E\n"})
public final /* synthetic */ class FlowKt__ReduceKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$a */
    /* JADX INFO: compiled from: Limit.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"kotlinx/coroutines/flow/FlowKt__ReduceKt$a", "Lkotlinx/coroutines/flow/f;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,131:1\n89#2,2:132\n*E\n"})
    public static final class C41607a<T> implements InterfaceC41635f<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Ref.ObjectRef f91591b;

        public C41607a(Ref.ObjectRef objectRef) {
            this.f91591b = objectRef;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public Object emit(T t11, Continuation<? super Unit> continuation) {
            this.f91591b.element = t11;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$b */
    /* JADX INFO: compiled from: Limit.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"kotlinx/coroutines/flow/FlowKt__ReduceKt$b", "Lkotlinx/coroutines/flow/f;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,131:1\n121#2,2:132\n*E\n"})
    public static final class C41608b<T> implements InterfaceC41635f<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Ref.ObjectRef f91592b;

        public C41608b(Ref.ObjectRef objectRef) {
            this.f91592b = objectRef;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public Object emit(T t11, Continuation<? super Unit> continuation) {
            this.f91592b.element = t11;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$c */
    /* JADX INFO: compiled from: Limit.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"kotlinx/coroutines/flow/FlowKt__ReduceKt$c", "Lkotlinx/coroutines/flow/f;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,131:1\n70#2,8:132\n*E\n"})
    public static final class C41609c<T> implements InterfaceC41635f<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Ref.ObjectRef f91593b;

        public C41609c(Ref.ObjectRef objectRef) {
            this.f91593b = objectRef;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public Object emit(T t11, Continuation<? super Unit> continuation) {
            Ref.ObjectRef objectRef = this.f91593b;
            T t12 = objectRef.element;
            T t13 = (T) C41658l.f91700a;
            if (t12 == t13) {
                objectRef.element = t11;
                return Unit.INSTANCE;
            }
            objectRef.element = t13;
            throw new AbortFlowException(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Object m90790a(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Continuation<? super T> continuation) {
        FlowKt__ReduceKt$first$1 flowKt__ReduceKt$first$1;
        Ref.ObjectRef objectRef;
        AbortFlowException e11;
        InterfaceC41635f<? super Object> interfaceC41635f;
        if (continuation instanceof FlowKt__ReduceKt$first$1) {
            flowKt__ReduceKt$first$1 = (FlowKt__ReduceKt$first$1) continuation;
            int i11 = flowKt__ReduceKt$first$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$1.label = i11 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(continuation);
            }
        } else {
            flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(continuation);
        }
        Object obj = flowKt__ReduceKt$first$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = flowKt__ReduceKt$first$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) C41658l.f91700a;
            InterfaceC41635f<? super Object> c41607a = new C41607a<>(objectRef2);
            try {
                flowKt__ReduceKt$first$1.L$0 = objectRef2;
                flowKt__ReduceKt$first$1.L$1 = c41607a;
                flowKt__ReduceKt$first$1.label = 1;
                if (interfaceC41634e.collect(c41607a, flowKt__ReduceKt$first$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e12) {
                objectRef = objectRef2;
                e11 = e12;
                interfaceC41635f = c41607a;
                C41654h.m90983a(e11, interfaceC41635f);
                C41783z1.m91406l(flowKt__ReduceKt$first$1.get$context());
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC41635f = (C41607a) flowKt__ReduceKt$first$1.L$1;
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$first$1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (AbortFlowException e13) {
                e11 = e13;
                C41654h.m90983a(e11, interfaceC41635f);
                C41783z1.m91406l(flowKt__ReduceKt$first$1.get$context());
            }
        }
        T t11 = objectRef.element;
        if (t11 != C41658l.f91700a) {
            return t11;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m90791b(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        FlowKt__ReduceKt$first$3 flowKt__ReduceKt$first$3;
        Ref.ObjectRef objectRef;
        AbortFlowException e11;
        InterfaceC41635f<? super Object> interfaceC41635f;
        if (continuation instanceof FlowKt__ReduceKt$first$3) {
            flowKt__ReduceKt$first$3 = (FlowKt__ReduceKt$first$3) continuation;
            int i11 = flowKt__ReduceKt$first$3.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$3.label = i11 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(continuation);
            }
        } else {
            flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(continuation);
        }
        Object obj = flowKt__ReduceKt$first$3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = flowKt__ReduceKt$first$3.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) C41658l.f91700a;
            InterfaceC41635f<? super Object> flowKt__ReduceKt$first$$inlined$collectWhile$2 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2<>(function2, objectRef2);
            try {
                flowKt__ReduceKt$first$3.L$0 = objectRef2;
                flowKt__ReduceKt$first$3.L$1 = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                flowKt__ReduceKt$first$3.label = 1;
                if (interfaceC41634e.collect(flowKt__ReduceKt$first$$inlined$collectWhile$2, flowKt__ReduceKt$first$3) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e12) {
                objectRef = objectRef2;
                e11 = e12;
                interfaceC41635f = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                C41654h.m90983a(e11, interfaceC41635f);
                C41783z1.m91406l(flowKt__ReduceKt$first$3.get$context());
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC41635f = (FlowKt__ReduceKt$first$$inlined$collectWhile$2) flowKt__ReduceKt$first$3.L$1;
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$first$3.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (AbortFlowException e13) {
                e11 = e13;
                C41654h.m90983a(e11, interfaceC41635f);
                C41783z1.m91406l(flowKt__ReduceKt$first$3.get$context());
            }
        }
        T t11 = objectRef.element;
        if (t11 != C41658l.f91700a) {
            return t11;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T> Object m90792c(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Continuation<? super T> continuation) {
        FlowKt__ReduceKt$firstOrNull$1 flowKt__ReduceKt$firstOrNull$1;
        Ref.ObjectRef objectRef;
        AbortFlowException e11;
        InterfaceC41635f<? super Object> interfaceC41635f;
        if (continuation instanceof FlowKt__ReduceKt$firstOrNull$1) {
            flowKt__ReduceKt$firstOrNull$1 = (FlowKt__ReduceKt$firstOrNull$1) continuation;
            int i11 = flowKt__ReduceKt$firstOrNull$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$1.label = i11 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(continuation);
            }
        } else {
            flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(continuation);
        }
        Object obj = flowKt__ReduceKt$firstOrNull$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = flowKt__ReduceKt$firstOrNull$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            InterfaceC41635f<? super Object> c41608b = new C41608b<>(objectRef2);
            try {
                flowKt__ReduceKt$firstOrNull$1.L$0 = objectRef2;
                flowKt__ReduceKt$firstOrNull$1.L$1 = c41608b;
                flowKt__ReduceKt$firstOrNull$1.label = 1;
                if (interfaceC41634e.collect(c41608b, flowKt__ReduceKt$firstOrNull$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e12) {
                objectRef = objectRef2;
                e11 = e12;
                interfaceC41635f = c41608b;
                C41654h.m90983a(e11, interfaceC41635f);
                C41783z1.m91406l(flowKt__ReduceKt$firstOrNull$1.get$context());
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC41635f = (C41608b) flowKt__ReduceKt$firstOrNull$1.L$1;
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$firstOrNull$1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (AbortFlowException e13) {
                e11 = e13;
                C41654h.m90983a(e11, interfaceC41635f);
                C41783z1.m91406l(flowKt__ReduceKt$firstOrNull$1.get$context());
            }
        }
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final <T> Object m90793d(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        FlowKt__ReduceKt$firstOrNull$3 flowKt__ReduceKt$firstOrNull$3;
        Ref.ObjectRef objectRef;
        AbortFlowException e11;
        InterfaceC41635f<? super Object> interfaceC41635f;
        if (continuation instanceof FlowKt__ReduceKt$firstOrNull$3) {
            flowKt__ReduceKt$firstOrNull$3 = (FlowKt__ReduceKt$firstOrNull$3) continuation;
            int i11 = flowKt__ReduceKt$firstOrNull$3.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$3.label = i11 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$firstOrNull$3 = new FlowKt__ReduceKt$firstOrNull$3(continuation);
            }
        } else {
            flowKt__ReduceKt$firstOrNull$3 = new FlowKt__ReduceKt$firstOrNull$3(continuation);
        }
        Object obj = flowKt__ReduceKt$firstOrNull$3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = flowKt__ReduceKt$firstOrNull$3.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            InterfaceC41635f<? super Object> flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = new FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2<>(function2, objectRef2);
            try {
                flowKt__ReduceKt$firstOrNull$3.L$0 = objectRef2;
                flowKt__ReduceKt$firstOrNull$3.L$1 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                flowKt__ReduceKt$firstOrNull$3.label = 1;
                if (interfaceC41634e.collect(flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2, flowKt__ReduceKt$firstOrNull$3) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e12) {
                objectRef = objectRef2;
                e11 = e12;
                interfaceC41635f = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                C41654h.m90983a(e11, interfaceC41635f);
                C41783z1.m91406l(flowKt__ReduceKt$firstOrNull$3.get$context());
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC41635f = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) flowKt__ReduceKt$firstOrNull$3.L$1;
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$firstOrNull$3.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (AbortFlowException e13) {
                e11 = e13;
                C41654h.m90983a(e11, interfaceC41635f);
                C41783z1.m91406l(flowKt__ReduceKt$firstOrNull$3.get$context());
            }
        }
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, og0.a0] */
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final <S, T extends S> Object m90794e(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Function3<? super S, ? super T, ? super Continuation<? super S>, ? extends Object> function3, @NotNull Continuation<? super S> continuation) {
        FlowKt__ReduceKt$reduce$1 flowKt__ReduceKt$reduce$1;
        Ref.ObjectRef objectRef;
        if (continuation instanceof FlowKt__ReduceKt$reduce$1) {
            flowKt__ReduceKt$reduce$1 = (FlowKt__ReduceKt$reduce$1) continuation;
            int i11 = flowKt__ReduceKt$reduce$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$reduce$1.label = i11 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$reduce$1 = new FlowKt__ReduceKt$reduce$1(continuation);
            }
        } else {
            flowKt__ReduceKt$reduce$1 = new FlowKt__ReduceKt$reduce$1(continuation);
        }
        Object obj = flowKt__ReduceKt$reduce$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = flowKt__ReduceKt$reduce$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = C41658l.f91700a;
            InterfaceC41635f<? super Object> flowKt__ReduceKt$reduce$2 = new FlowKt__ReduceKt$reduce$2<>(objectRef2, function3);
            flowKt__ReduceKt$reduce$1.L$0 = objectRef2;
            flowKt__ReduceKt$reduce$1.label = 1;
            if (interfaceC41634e.collect(flowKt__ReduceKt$reduce$2, flowKt__ReduceKt$reduce$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$reduce$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        T t11 = objectRef.element;
        if (t11 != C41658l.f91700a) {
            return t11;
        }
        throw new NoSuchElementException("Empty flow can't be reduced");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: f */
    public static final <T> Object m90795f(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Continuation<? super T> continuation) {
        FlowKt__ReduceKt$singleOrNull$1 flowKt__ReduceKt$singleOrNull$1;
        Ref.ObjectRef objectRef;
        AbortFlowException e11;
        InterfaceC41635f<? super Object> interfaceC41635f;
        if (continuation instanceof FlowKt__ReduceKt$singleOrNull$1) {
            flowKt__ReduceKt$singleOrNull$1 = (FlowKt__ReduceKt$singleOrNull$1) continuation;
            int i11 = flowKt__ReduceKt$singleOrNull$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$singleOrNull$1.label = i11 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$singleOrNull$1 = new FlowKt__ReduceKt$singleOrNull$1(continuation);
            }
        } else {
            flowKt__ReduceKt$singleOrNull$1 = new FlowKt__ReduceKt$singleOrNull$1(continuation);
        }
        Object obj = flowKt__ReduceKt$singleOrNull$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = flowKt__ReduceKt$singleOrNull$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) C41658l.f91700a;
            InterfaceC41635f<? super Object> c41609c = new C41609c<>(objectRef2);
            try {
                flowKt__ReduceKt$singleOrNull$1.L$0 = objectRef2;
                flowKt__ReduceKt$singleOrNull$1.L$1 = c41609c;
                flowKt__ReduceKt$singleOrNull$1.label = 1;
                if (interfaceC41634e.collect(c41609c, flowKt__ReduceKt$singleOrNull$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e12) {
                objectRef = objectRef2;
                e11 = e12;
                interfaceC41635f = c41609c;
                C41654h.m90983a(e11, interfaceC41635f);
                C41783z1.m91406l(flowKt__ReduceKt$singleOrNull$1.get$context());
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC41635f = (C41609c) flowKt__ReduceKt$singleOrNull$1.L$1;
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$singleOrNull$1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (AbortFlowException e13) {
                e11 = e13;
                C41654h.m90983a(e11, interfaceC41635f);
                C41783z1.m91406l(flowKt__ReduceKt$singleOrNull$1.get$context());
            }
        }
        T t11 = objectRef.element;
        if (t11 == C41658l.f91700a) {
            return null;
        }
        return t11;
    }
}
