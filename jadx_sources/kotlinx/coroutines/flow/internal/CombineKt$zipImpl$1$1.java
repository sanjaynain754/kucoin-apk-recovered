package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41781z;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.InterfaceC41576o;
import kotlinx.coroutines.channels.InterfaceC41577p;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import og0.C43059h0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", m90122f = "Combine.kt", m90123i = {0, 0}, m90124l = {123}, m90125m = "invokeSuspend", m90126n = {"second", "collectJob"}, m90127s = {"L$0", "L$1"})
public final class CombineKt$zipImpl$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC41634e<T1> $flow;
    final /* synthetic */ InterfaceC41634e<T2> $flow2;
    final /* synthetic */ InterfaceC41635f<R> $this_unsafeFlow;
    final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 */
    /* JADX INFO: compiled from: Combine.kt */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", m90122f = "Combine.kt", m90123i = {}, m90124l = {124}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C416432 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        final /* synthetic */ Object $cnt;
        final /* synthetic */ InterfaceC41781z $collectJob;
        final /* synthetic */ InterfaceC41634e<T1> $flow;
        final /* synthetic */ CoroutineContext $scopeContext;
        final /* synthetic */ InterfaceC41576o<Object> $second;
        final /* synthetic */ InterfaceC41635f<R> $this_unsafeFlow;
        final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> $transform;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Combine.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        public static final class AnonymousClass1<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ CoroutineContext f91677b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Object f91678c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ InterfaceC41576o<Object> f91679d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ InterfaceC41635f<R> f91680e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> f91681f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ InterfaceC41781z f91682g;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Combine.kt */
            @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
            @DebugMetadata(m90121c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", m90122f = "Combine.kt", m90123i = {}, m90124l = {126, 129, 129}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
            @SourceDebugExtension({"SMAP\nCombine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,140:1\n994#2:141\n14#3:142\n*S KotlinDebug\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1\n*L\n126#1:141\n129#1:142\n*E\n"})
            public static final class C470111 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
                final /* synthetic */ InterfaceC41781z $collectJob;
                final /* synthetic */ InterfaceC41576o<Object> $second;
                final /* synthetic */ InterfaceC41635f<R> $this_unsafeFlow;
                final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> $transform;
                final /* synthetic */ T1 $value;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C470111(InterfaceC41576o<? extends Object> interfaceC41576o, InterfaceC41635f<? super R> interfaceC41635f, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3, T1 t11, InterfaceC41781z interfaceC41781z, Continuation<? super C470111> continuation) {
                    super(2, continuation);
                    this.$second = interfaceC41576o;
                    this.$this_unsafeFlow = interfaceC41635f;
                    this.$transform = function3;
                    this.$value = t11;
                    this.$collectJob = interfaceC41781z;
                }

                @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C470111(this.$second, this.$this_unsafeFlow, this.$transform, this.$value, this.$collectJob, continuation);
                }

                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                    return ((C470111) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
                
                    if (r1.emit(r9, r8) == r0) goto L29;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.flow.f] */
                /* JADX WARN: Type inference failed for: r1v6 */
                /* JADX WARN: Type inference failed for: r1v7 */
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
                @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objMo90611p;
                    ?? r11;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.label;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 == 3) {
                                    ResultKt.throwOnFailure(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.L$0;
                                ResultKt.throwOnFailure(obj);
                                r11 = interfaceC41635f;
                                this.L$0 = null;
                                this.label = 3;
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            objMo90611p = ((ChannelResult) obj).getHolder();
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    InterfaceC41576o<Object> interfaceC41576o = this.$second;
                    this.label = 1;
                    objMo90611p = interfaceC41576o.mo90611p(this);
                    if (objMo90611p != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                    InterfaceC41781z interfaceC41781z = this.$collectJob;
                    if (objMo90611p instanceof ChannelResult.C41560b) {
                        Throwable thM90672e = ChannelResult.m90672e(objMo90611p);
                        if (thM90672e == null) {
                            throw new AbortFlowException(interfaceC41781z);
                        }
                        throw thM90672e;
                    }
                    Object obj2 = this.$this_unsafeFlow;
                    Function3 function3 = this.$transform;
                    Object obj3 = this.$value;
                    if (objMo90611p == C41658l.f91700a) {
                        objMo90611p = null;
                    }
                    this.L$0 = obj2;
                    this.label = 2;
                    obj = function3.invoke(obj3, objMo90611p, this);
                    r11 = obj2;
                    if (obj != coroutine_suspended) {
                        this.L$0 = null;
                        this.label = 3;
                    }
                    return coroutine_suspended;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(CoroutineContext coroutineContext, Object obj, InterfaceC41576o<? extends Object> interfaceC41576o, InterfaceC41635f<? super R> interfaceC41635f, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3, InterfaceC41781z interfaceC41781z) {
                this.f91677b = coroutineContext;
                this.f91678c = obj;
                this.f91679d = interfaceC41576o;
                this.f91680e = interfaceC41635f;
                this.f91681f = function3;
                this.f91682g = interfaceC41781z;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public final Object emit(T1 t11, Continuation<? super Unit> continuation) {
                CombineKt$zipImpl$1$1$2$1$emit$1 combineKt$zipImpl$1$1$2$1$emit$1;
                if (continuation instanceof CombineKt$zipImpl$1$1$2$1$emit$1) {
                    combineKt$zipImpl$1$1$2$1$emit$1 = (CombineKt$zipImpl$1$1$2$1$emit$1) continuation;
                    int i11 = combineKt$zipImpl$1$1$2$1$emit$1.label;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        combineKt$zipImpl$1$1$2$1$emit$1.label = i11 - Integer.MIN_VALUE;
                    } else {
                        combineKt$zipImpl$1$1$2$1$emit$1 = new CombineKt$zipImpl$1$1$2$1$emit$1(this, continuation);
                    }
                } else {
                    combineKt$zipImpl$1$1$2$1$emit$1 = new CombineKt$zipImpl$1$1$2$1$emit$1(this, continuation);
                }
                Object obj = combineKt$zipImpl$1$1$2$1$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = combineKt$zipImpl$1$1$2$1$emit$1.label;
                if (i12 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext coroutineContext = this.f91677b;
                    Unit unit = Unit.INSTANCE;
                    Object obj2 = this.f91678c;
                    C470111 c470111 = new C470111(this.f91679d, this.f91680e, this.f91681f, t11, this.f91682g, null);
                    combineKt$zipImpl$1$1$2$1$emit$1.label = 1;
                    if (C41650d.m90980c(coroutineContext, unit, obj2, c470111, combineKt$zipImpl$1$1$2$1$emit$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C416432(InterfaceC41634e<? extends T1> interfaceC41634e, CoroutineContext coroutineContext, Object obj, InterfaceC41576o<? extends Object> interfaceC41576o, InterfaceC41635f<? super R> interfaceC41635f, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3, InterfaceC41781z interfaceC41781z, Continuation<? super C416432> continuation) {
            super(2, continuation);
            this.$flow = interfaceC41634e;
            this.$scopeContext = coroutineContext;
            this.$cnt = obj;
            this.$second = interfaceC41576o;
            this.$this_unsafeFlow = interfaceC41635f;
            this.$transform = function3;
            this.$collectJob = interfaceC41781z;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C416432(this.$flow, this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, this.$collectJob, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((C416432) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 for r10v1 'this'  kotlin.coroutines.Continuation
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                p852kotlin.ResultKt.throwOnFailure(r11)
                goto L36
            Lf:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L17:
                p852kotlin.ResultKt.throwOnFailure(r11)
                kotlinx.coroutines.flow.e<T1> r11 = r10.$flow
                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1 r3 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1
                kotlin.coroutines.CoroutineContext r4 = r10.$scopeContext
                java.lang.Object r5 = r10.$cnt
                kotlinx.coroutines.channels.o<java.lang.Object> r6 = r10.$second
                kotlinx.coroutines.flow.f<R> r7 = r10.$this_unsafeFlow
                kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r8 = r10.$transform
                kotlinx.coroutines.z r9 = r10.$collectJob
                r3.<init>(r4, r5, r6, r7, r8, r9)
                r10.label = r2
                java.lang.Object r11 = r11.collect(r3, r10)
                if (r11 != r0) goto L36
                return r0
            L36:
                kotlin.Unit r11 = p852kotlin.Unit.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.C416432.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$a */
    /* JADX INFO: compiled from: Combine.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C41644a implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41781z f91683b;

        public C41644a(InterfaceC41781z interfaceC41781z) {
            this.f91683b = interfaceC41781z;
        }

        /* JADX INFO: renamed from: a */
        public final void m90960a(Throwable th2) {
            if (this.f91683b.isActive()) {
                this.f91683b.mo90415a(new AbortFlowException(this.f91683b));
            }
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m90960a(th2);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$zipImpl$1$1(InterfaceC41634e<? extends T2> interfaceC41634e, InterfaceC41634e<? extends T1> interfaceC41634e2, InterfaceC41635f<? super R> interfaceC41635f, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super CombineKt$zipImpl$1$1> continuation) {
        super(2, continuation);
        this.$flow2 = interfaceC41634e;
        this.$flow = interfaceC41634e2;
        this.$this_unsafeFlow = interfaceC41635f;
        this.$transform = function3;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.$flow2, this.$flow, this.$this_unsafeFlow, this.$transform, continuation);
        combineKt$zipImpl$1$1.L$0 = obj;
        return combineKt$zipImpl$1$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CombineKt$zipImpl$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC41576o interfaceC41576o;
        InterfaceC41781z interfaceC41781z;
        InterfaceC41576o interfaceC41576o2;
        InterfaceC41781z interfaceC41781z2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
            InterfaceC41576o interfaceC41576oM90684d = ProduceKt.m90684d(interfaceC41709m0, null, 0, new CombineKt$zipImpl$1$1$second$1(this.$flow2, null), 3, null);
            InterfaceC41781z interfaceC41781zM90358b = JobKt__JobKt.m90358b(null, 1, null);
            Intrinsics.checkNotNull(interfaceC41576oM90684d, "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<*>");
            ((InterfaceC41577p) interfaceC41576oM90684d).mo90591d(new C41644a(interfaceC41781zM90358b));
            try {
                CoroutineContext coroutineContext = interfaceC41709m0.getCoroutineContext();
                Object objM94588g = C43059h0.m94588g(coroutineContext);
                CoroutineContext coroutineContextPlus = interfaceC41709m0.getCoroutineContext().plus(interfaceC41781zM90358b);
                try {
                    try {
                        Unit unit = Unit.INSTANCE;
                        try {
                            C416432 c416432 = new C416432(this.$flow, coroutineContext, objM94588g, interfaceC41576oM90684d, this.$this_unsafeFlow, this.$transform, interfaceC41781zM90358b, null);
                            interfaceC41576o = interfaceC41576oM90684d;
                            interfaceC41781z = interfaceC41781zM90358b;
                            try {
                                this.L$0 = interfaceC41576o;
                                this.L$1 = interfaceC41781z;
                                this.label = 1;
                                if (C41650d.m90981d(coroutineContextPlus, unit, null, c416432, this, 4, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                interfaceC41576o2 = interfaceC41576o;
                            } catch (AbortFlowException e11) {
                                e = e11;
                                interfaceC41781z2 = interfaceC41781z;
                                interfaceC41576o2 = interfaceC41576o;
                                C41654h.m90983a(e, interfaceC41781z2);
                            } catch (Throwable th2) {
                                th = th2;
                                interfaceC41576o2 = interfaceC41576o;
                                InterfaceC41576o.a.m90713a(interfaceC41576o2, null, 1, null);
                                throw th;
                            }
                        } catch (AbortFlowException e12) {
                            e = e12;
                            interfaceC41576o = interfaceC41576oM90684d;
                            interfaceC41781z = interfaceC41781zM90358b;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC41576o = interfaceC41576oM90684d;
                    }
                } catch (AbortFlowException e13) {
                    e = e13;
                    interfaceC41781z = interfaceC41781zM90358b;
                    interfaceC41576o = interfaceC41576oM90684d;
                }
            } catch (AbortFlowException e14) {
                e = e14;
                interfaceC41576o = interfaceC41576oM90684d;
                interfaceC41781z = interfaceC41781zM90358b;
            } catch (Throwable th4) {
                th = th4;
                interfaceC41576o = interfaceC41576oM90684d;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC41781z2 = (InterfaceC41781z) this.L$1;
            interfaceC41576o2 = (InterfaceC41576o) this.L$0;
            try {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (AbortFlowException e15) {
                    e = e15;
                    C41654h.m90983a(e, interfaceC41781z2);
                }
            } catch (Throwable th5) {
                th = th5;
                InterfaceC41576o.a.m90713a(interfaceC41576o2, null, 1, null);
                throw th;
            }
        }
        InterfaceC41576o.a.m90713a(interfaceC41576o2, null, 1, null);
        return Unit.INSTANCE;
    }
}
