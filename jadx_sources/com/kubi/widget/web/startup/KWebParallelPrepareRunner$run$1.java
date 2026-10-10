package com.kubi.widget.web.startup;

import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KWebParallelPrepareRunner.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.widget.web.startup.KWebParallelPrepareRunner$run$1", m90122f = "KWebParallelPrepareRunner.kt", m90123i = {}, m90124l = {26}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KWebParallelPrepareRunner$run$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Experiment, Unit> $applyExperiment;
    final /* synthetic */ Function0<Unit> $applySiteAndBase;
    final /* synthetic */ Function1<Ssg, Unit> $applySsg;
    final /* synthetic */ Function1<WhitePage, Unit> $applyWhitePage;
    final /* synthetic */ Function0<Experiment> $prepareExperiment;
    final /* synthetic */ Function0<Ssg> $prepareSsg;
    final /* synthetic */ Function0<WhitePage> $prepareWhitePage;
    final /* synthetic */ Function0<Unit> $registerSsgObserver;
    int label;
    final /* synthetic */ KWebParallelPrepareRunner this$0;

    /* JADX INFO: renamed from: com.kubi.widget.web.startup.KWebParallelPrepareRunner$run$1$1 */
    /* JADX INFO: compiled from: KWebParallelPrepareRunner.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.widget.web.startup.KWebParallelPrepareRunner$run$1$1", m90122f = "KWebParallelPrepareRunner.kt", m90123i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, m90124l = {32, 34, 35}, m90125m = "invokeSuspend", m90126n = {"$this$supervisorScope", "experiment", "whitePage", "ssg", "$this$supervisorScope", "experiment", "whitePage", "ssg", "$this$supervisorScope", "experiment", "whitePage", "ssg"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    public static final class C271981 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Experiment, Unit> $applyExperiment;
        final /* synthetic */ Function0<Unit> $applySiteAndBase;
        final /* synthetic */ Function1<Ssg, Unit> $applySsg;
        final /* synthetic */ Function1<WhitePage, Unit> $applyWhitePage;
        final /* synthetic */ Function0<Experiment> $prepareExperiment;
        final /* synthetic */ Function0<Ssg> $prepareSsg;
        final /* synthetic */ Function0<WhitePage> $prepareWhitePage;
        final /* synthetic */ Function0<Unit> $registerSsgObserver;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ KWebParallelPrepareRunner this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C271981(KWebParallelPrepareRunner kWebParallelPrepareRunner, Function1<? super Experiment, Unit> function1, Function0<Unit> function0, Function1<? super WhitePage, Unit> function2, Function1<? super Ssg, Unit> function3, Function0<Unit> function4, Function0<? extends Experiment> function5, Function0<? extends WhitePage> function6, Function0<? extends Ssg> function7, Continuation<? super C271981> continuation) {
            super(2, continuation);
            this.this$0 = kWebParallelPrepareRunner;
            this.$applyExperiment = function1;
            this.$applySiteAndBase = function0;
            this.$applyWhitePage = function2;
            this.$applySsg = function3;
            this.$registerSsgObserver = function4;
            this.$prepareExperiment = function5;
            this.$prepareWhitePage = function6;
            this.$prepareSsg = function7;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C271981 c271981 = new C271981(this.this$0, this.$applyExperiment, this.$applySiteAndBase, this.$applyWhitePage, this.$applySsg, this.$registerSsgObserver, this.$prepareExperiment, this.$prepareWhitePage, this.$prepareSsg, continuation);
            c271981.L$0 = obj;
            return c271981;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C271981) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0115  */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC41729r0 interfaceC41729r0;
            Function1 function1;
            InterfaceC41729r0 interfaceC41729r1;
            InterfaceC41729r0 interfaceC41729r2;
            Function1 function2;
            Function1 function3;
            Object objMo91198h;
            Function1 function4;
            InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC41729r0 interfaceC41729r0M91102b = C41696j.m91102b(interfaceC41709m0, this.this$0.f55236a, null, new KWebParallelPrepareRunner$run$1$1$experiment$1(this.$prepareExperiment, null), 2, null);
                InterfaceC41729r0 interfaceC41729r0M91102b2 = C41696j.m91102b(interfaceC41709m0, this.this$0.f55236a, null, new KWebParallelPrepareRunner$run$1$1$whitePage$1(this.$prepareWhitePage, null), 2, null);
                InterfaceC41729r0 interfaceC41729r0M91102b3 = C41696j.m91102b(interfaceC41709m0, this.this$0.f55236a, null, new KWebParallelPrepareRunner$run$1$1$ssg$1(this.$prepareSsg, null), 2, null);
                Function1 function5 = this.$applyExperiment;
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
                this.L$2 = interfaceC41729r0M91102b2;
                this.L$3 = interfaceC41729r0M91102b3;
                this.L$4 = function5;
                this.label = 1;
                Object objMo91198h2 = interfaceC41729r0M91102b.mo91198h(this);
                if (objMo91198h2 != coroutine_suspended) {
                    interfaceC41729r0 = interfaceC41729r0M91102b3;
                    function1 = function5;
                    interfaceC41729r1 = interfaceC41729r0M91102b;
                    obj = objMo91198h2;
                    interfaceC41729r2 = interfaceC41729r0M91102b2;
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                function1 = (Function1) this.L$4;
                interfaceC41729r0 = (InterfaceC41729r0) this.L$3;
                interfaceC41729r2 = (InterfaceC41729r0) this.L$2;
                interfaceC41729r1 = (InterfaceC41729r0) this.L$1;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 == 2) {
                    function2 = (Function1) this.L$4;
                    interfaceC41729r0 = (InterfaceC41729r0) this.L$3;
                    interfaceC41729r2 = (InterfaceC41729r0) this.L$2;
                    interfaceC41729r1 = (InterfaceC41729r0) this.L$1;
                    ResultKt.throwOnFailure(obj);
                    Object value = ((Result) obj).getValue();
                    ResultKt.throwOnFailure(value);
                    function2.invoke(value);
                    function3 = this.$applySsg;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r2);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                    this.L$4 = function3;
                    this.label = 3;
                    objMo91198h = interfaceC41729r0.mo91198h(this);
                    if (objMo91198h != coroutine_suspended) {
                        function4 = function3;
                        obj = objMo91198h;
                    }
                    return coroutine_suspended;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function4 = (Function1) this.L$4;
                ResultKt.throwOnFailure(obj);
            }
            function4.invoke(obj);
            this.$registerSsgObserver.invoke();
            return Unit.INSTANCE;
            function1.invoke(obj);
            this.$applySiteAndBase.invoke();
            function2 = this.$applyWhitePage;
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
            this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r2);
            this.L$3 = interfaceC41729r0;
            this.L$4 = function2;
            this.label = 2;
            obj = interfaceC41729r2.mo91198h(this);
            if (obj != coroutine_suspended) {
                Object value2 = ((Result) obj).getValue();
                ResultKt.throwOnFailure(value2);
                function2.invoke(value2);
                function3 = this.$applySsg;
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
                this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r2);
                this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                this.L$4 = function3;
                this.label = 3;
                objMo91198h = interfaceC41729r0.mo91198h(this);
                if (objMo91198h != coroutine_suspended) {
                    function4 = function3;
                    obj = objMo91198h;
                    function4.invoke(obj);
                    this.$registerSsgObserver.invoke();
                    return Unit.INSTANCE;
                }
            }
            return coroutine_suspended;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KWebParallelPrepareRunner$run$1(KWebParallelPrepareRunner kWebParallelPrepareRunner, Function1<? super Experiment, Unit> function1, Function0<Unit> function0, Function1<? super WhitePage, Unit> function2, Function1<? super Ssg, Unit> function3, Function0<Unit> function4, Function0<? extends Experiment> function5, Function0<? extends WhitePage> function6, Function0<? extends Ssg> function7, Continuation<? super KWebParallelPrepareRunner$run$1> continuation) {
        super(2, continuation);
        this.this$0 = kWebParallelPrepareRunner;
        this.$applyExperiment = function1;
        this.$applySiteAndBase = function0;
        this.$applyWhitePage = function2;
        this.$applySsg = function3;
        this.$registerSsgObserver = function4;
        this.$prepareExperiment = function5;
        this.$prepareWhitePage = function6;
        this.$prepareSsg = function7;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KWebParallelPrepareRunner$run$1(this.this$0, this.$applyExperiment, this.$applySiteAndBase, this.$applyWhitePage, this.$applySsg, this.$registerSsgObserver, this.$prepareExperiment, this.$prepareWhitePage, this.$prepareSsg, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KWebParallelPrepareRunner$run$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C271981 c271981 = new C271981(this.this$0, this.$applyExperiment, this.$applySiteAndBase, this.$applyWhitePage, this.$applySsg, this.$registerSsgObserver, this.$prepareExperiment, this.$prepareWhitePage, this.$prepareSsg, null);
            this.label = 1;
            if (C41727q2.m91193c(c271981, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
