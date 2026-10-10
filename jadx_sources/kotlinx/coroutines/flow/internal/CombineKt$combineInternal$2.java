package kotlinx.coroutines.flow.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.channels.InterfaceC41565d;
import kotlinx.coroutines.channels.InterfaceC41577p;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.IndexedValue;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", m90122f = "Combine.kt", m90123i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m90124l = {51, 73, 76}, m90125m = "invokeSuspend", m90126n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, m90127s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
public final class CombineKt$combineInternal$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<T[]> $arrayFactory;
    final /* synthetic */ InterfaceC41634e<T>[] $flows;
    final /* synthetic */ InterfaceC41635f<R> $this_combineInternal;
    final /* synthetic */ Function3<InterfaceC41635f<? super R>, T[], Continuation<? super Unit>, Object> $transform;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 */
    /* JADX INFO: compiled from: Combine.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", m90122f = "Combine.kt", m90123i = {}, m90124l = {28}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C416421 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC41634e<T>[] $flows;

        /* JADX INFO: renamed from: $i */
        final /* synthetic */ int f91674$i;
        final /* synthetic */ AtomicInteger $nonClosed;
        final /* synthetic */ InterfaceC41565d<IndexedValue<Object>> $resultChannel;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: Combine.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        public static final class AnonymousClass1<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC41565d<IndexedValue<Object>> f91675b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f91676c;

            public AnonymousClass1(InterfaceC41565d<IndexedValue<Object>> interfaceC41565d, int i11) {
                this.f91675b = interfaceC41565d;
                this.f91676c = i11;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
            
                if (kotlinx.coroutines.C41552b3.m90496a(r0) == r1) goto L21;
             */
            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t11, Continuation<? super Unit> continuation) {
                CombineKt$combineInternal$2$1$1$emit$1 combineKt$combineInternal$2$1$1$emit$1;
                if (continuation instanceof CombineKt$combineInternal$2$1$1$emit$1) {
                    combineKt$combineInternal$2$1$1$emit$1 = (CombineKt$combineInternal$2$1$1$emit$1) continuation;
                    int i11 = combineKt$combineInternal$2$1$1$emit$1.label;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        combineKt$combineInternal$2$1$1$emit$1.label = i11 - Integer.MIN_VALUE;
                    } else {
                        combineKt$combineInternal$2$1$1$emit$1 = new CombineKt$combineInternal$2$1$1$emit$1(this, continuation);
                    }
                } else {
                    combineKt$combineInternal$2$1$1$emit$1 = new CombineKt$combineInternal$2$1$1$emit$1(this, continuation);
                }
                Object obj = combineKt$combineInternal$2$1$1$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = combineKt$combineInternal$2$1$1$emit$1.label;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                InterfaceC41565d<IndexedValue<Object>> interfaceC41565d = this.f91675b;
                IndexedValue<Object> indexedValue = new IndexedValue<>(this.f91676c, t11);
                combineKt$combineInternal$2$1$1$emit$1.label = 1;
                if (interfaceC41565d.send(indexedValue, combineKt$combineInternal$2$1$1$emit$1) != coroutine_suspended) {
                }
                return coroutine_suspended;
                combineKt$combineInternal$2$1$1$emit$1.label = 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C416421(InterfaceC41634e<? extends T>[] interfaceC41634eArr, int i11, AtomicInteger atomicInteger, InterfaceC41565d<IndexedValue<Object>> interfaceC41565d, Continuation<? super C416421> continuation) {
            super(2, continuation);
            this.$flows = interfaceC41634eArr;
            this.f91674$i = i11;
            this.$nonClosed = atomicInteger;
            this.$resultChannel = interfaceC41565d;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C416421(this.$flows, this.f91674$i, this.$nonClosed, this.$resultChannel, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C416421) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC41634e[] interfaceC41634eArr = this.$flows;
                    int i12 = this.f91674$i;
                    InterfaceC41634e interfaceC41634e = interfaceC41634eArr[i12];
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$resultChannel, i12);
                    this.label = 1;
                    if (interfaceC41634e.collect(anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (this.$nonClosed.decrementAndGet() == 0) {
                    InterfaceC41577p.a.m90714a(this.$resultChannel, null, 1, null);
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                if (this.$nonClosed.decrementAndGet() == 0) {
                    InterfaceC41577p.a.m90714a(this.$resultChannel, null, 1, null);
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$combineInternal$2(InterfaceC41634e<? extends T>[] interfaceC41634eArr, Function0<T[]> function0, Function3<? super InterfaceC41635f<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, InterfaceC41635f<? super R> interfaceC41635f, Continuation<? super CombineKt$combineInternal$2> continuation) {
        super(2, continuation);
        this.$flows = interfaceC41634eArr;
        this.$arrayFactory = function0;
        this.$transform = function3;
        this.$this_combineInternal = interfaceC41635f;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, continuation);
        combineKt$combineInternal$2.L$0 = obj;
        return combineKt$combineInternal$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CombineKt$combineInternal$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e6 A[EDGE_INSN: B:35:0x00e6->B:44:0x0129 BREAK  A[LOOP:0: B:28:0x00c1->B:47:?]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:41:0x0109  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[LOOP:0: B:28:0x00c1->B:47:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0106 -> B:44:0x0129). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0126 -> B:44:0x0129). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:41:0x0109
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
