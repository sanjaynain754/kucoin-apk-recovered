package androidx.lifecycle;

import kotlinx.coroutines.AbstractC41586e2;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41708m;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.C44087f;
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: RepeatOnLifecycle.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001aE\u0010\n\u001a\u00020\u0006*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0086@¢\u0006\u0004\b\n\u0010\r¨\u0006\u000e"}, m90084d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "state", "Lkotlin/Function2;", "Lkotlinx/coroutines/m0;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "repeatOnLifecycle", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-runtime_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class RepeatOnLifecycleKt {

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3 */
    /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 0, 0})
    @DebugMetadata(m90121c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", m90122f = "RepeatOnLifecycle.kt", m90123i = {}, m90124l = {83}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C26243 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ Lifecycle.State $state;
        final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 0, 0})
        @DebugMetadata(m90121c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", m90122f = "RepeatOnLifecycle.kt", m90123i = {0, 0}, m90124l = {BuiltinOperator.RIGHT_SHIFT}, m90125m = "invokeSuspend", m90126n = {"launchedJob", "observer"}, m90127s = {"L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n318#2,11:161\n1#3:172\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n*L\n96#1:161,11\n*E\n"})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            final /* synthetic */ InterfaceC41709m0 $$this$coroutineScope;
            final /* synthetic */ Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> $block;
            final /* synthetic */ Lifecycle.State $state;
            final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, InterfaceC41709m0 interfaceC41709m0, Function2<? super InterfaceC41709m0, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$this_repeatOnLifecycle = lifecycle;
                this.$state = state;
                this.$$this$coroutineScope = interfaceC41709m0;
                this.$block = function2;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:28:0x00af  */
            /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
            /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
            /* JADX WARN: Code duplicated, block: B:45:? A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r4v3, types: [T, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, java.lang.Object] */
            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Ref.ObjectRef objectRef;
                Throwable th2;
                Ref.ObjectRef objectRef2;
                InterfaceC41775x1 interfaceC41775x1;
                LifecycleEventObserver lifecycleEventObserver;
                InterfaceC41775x1 interfaceC41775x2;
                LifecycleEventObserver lifecycleEventObserver2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 == 1) {
                        objectRef = (Ref.ObjectRef) this.L$1;
                        objectRef2 = (Ref.ObjectRef) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            interfaceC41775x2 = (InterfaceC41775x1) objectRef2.element;
                            if (interfaceC41775x2 != null) {
                                InterfaceC41775x1.a.m91377a(interfaceC41775x2, null, 1, null);
                            }
                            lifecycleEventObserver2 = (LifecycleEventObserver) objectRef.element;
                            if (lifecycleEventObserver2 != null) {
                                this.$this_repeatOnLifecycle.removeObserver(lifecycleEventObserver2);
                            }
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            th2 = th3;
                            interfaceC41775x1 = (InterfaceC41775x1) objectRef2.element;
                            if (interfaceC41775x1 != null) {
                                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
                            }
                            lifecycleEventObserver = (LifecycleEventObserver) objectRef.element;
                            if (lifecycleEventObserver != null) {
                                this.$this_repeatOnLifecycle.removeObserver(lifecycleEventObserver);
                                throw th2;
                            }
                            throw th2;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.$this_repeatOnLifecycle.getState() == Lifecycle.State.DESTROYED) {
                    return Unit.INSTANCE;
                }
                final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                objectRef = new Ref.ObjectRef();
                try {
                    Lifecycle.State state = this.$state;
                    Lifecycle lifecycle = this.$this_repeatOnLifecycle;
                    final InterfaceC41709m0 interfaceC41709m0 = this.$$this$coroutineScope;
                    final Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> function2 = this.$block;
                    this.L$0 = objectRef3;
                    this.L$1 = objectRef;
                    this.L$2 = state;
                    this.L$3 = lifecycle;
                    this.L$4 = interfaceC41709m0;
                    this.L$5 = function2;
                    this.label = 1;
                    final C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(this), 1);
                    c41716o.m91142E();
                    Lifecycle.Event.Companion companion = Lifecycle.Event.INSTANCE;
                    final Lifecycle.Event eventUpTo = companion.upTo(state);
                    final Lifecycle.Event eventDownFrom = companion.downFrom(state);
                    final InterfaceC44082a interfaceC44082aM97144b = C44087f.m97144b(false, 1, null);
                    ?? r11 = new LifecycleEventObserver() { // from class: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1

                        /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1 */
                        /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
                        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 0, 0})
                        @DebugMetadata(m90121c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", m90122f = "RepeatOnLifecycle.kt", m90123i = {0, 1}, m90124l = {165, 110}, m90125m = "invokeSuspend", m90126n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, m90127s = {"L$0", "L$0"})
                        @SourceDebugExtension({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,160:1\n116#2,10:161\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1\n*L\n110#1:161,10\n*E\n"})
                        public static final class C26251 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
                            final /* synthetic */ Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> $block;
                            final /* synthetic */ InterfaceC44082a $mutex;
                            Object L$0;
                            Object L$1;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public C26251(InterfaceC44082a interfaceC44082a, Function2<? super InterfaceC41709m0, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C26251> continuation) {
                                super(2, continuation);
                                this.$mutex = interfaceC44082a;
                                this.$block = function2;
                            }

                            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new C26251(this.$mutex, this.$block, continuation);
                            }

                            @Override // p852kotlin.jvm.functions.Function2
                            public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
                                return ((C26251) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) throws Throwable {
                                InterfaceC44082a interfaceC44082a;
                                Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> function2;
                                InterfaceC44082a interfaceC44082a2;
                                Throwable th2;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i11 = this.label;
                                try {
                                    if (i11 != 0) {
                                        if (i11 != 1) {
                                            if (i11 == 2) {
                                                interfaceC44082a2 = (InterfaceC44082a) this.L$0;
                                                try {
                                                    ResultKt.throwOnFailure(obj);
                                                    Unit unit = Unit.INSTANCE;
                                                    interfaceC44082a2.mo91345e(null);
                                                    return Unit.INSTANCE;
                                                } catch (Throwable th3) {
                                                    th2 = th3;
                                                    interfaceC44082a2.mo91345e(null);
                                                    throw th2;
                                                }
                                            }
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        function2 = (Function2) this.L$1;
                                        InterfaceC44082a interfaceC44082a3 = (InterfaceC44082a) this.L$0;
                                        ResultKt.throwOnFailure(obj);
                                        interfaceC44082a = interfaceC44082a3;
                                    } else {
                                        ResultKt.throwOnFailure(obj);
                                        interfaceC44082a = this.$mutex;
                                        function2 = this.$block;
                                        this.L$0 = interfaceC44082a;
                                        this.L$1 = function2;
                                        this.label = 1;
                                        if (interfaceC44082a.mo91344d(null, this) != coroutine_suspended) {
                                        }
                                        return coroutine_suspended;
                                    }
                                    RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(function2, null);
                                    this.L$0 = interfaceC44082a;
                                    this.L$1 = null;
                                    this.label = 2;
                                    if (C41713n0.m91130f(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) != coroutine_suspended) {
                                        interfaceC44082a2 = interfaceC44082a;
                                        Unit unit2 = Unit.INSTANCE;
                                        interfaceC44082a2.mo91345e(null);
                                        return Unit.INSTANCE;
                                    }
                                    return coroutine_suspended;
                                } catch (Throwable th4) {
                                    interfaceC44082a2 = interfaceC44082a;
                                    th2 = th4;
                                    interfaceC44082a2.mo91345e(null);
                                    throw th2;
                                }
                            }
                        }

                        /* JADX WARN: Type inference failed for: r9v5, types: [T, kotlinx.coroutines.x1] */
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                            Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
                            Intrinsics.checkNotNullParameter(event, "event");
                            if (event == eventUpTo) {
                                objectRef3.element = C41696j.m91104d(interfaceC41709m0, null, null, new C26251(interfaceC44082aM97144b, function2, null), 3, null);
                                return;
                            }
                            if (event == eventDownFrom) {
                                InterfaceC41775x1 interfaceC41775x3 = objectRef3.element;
                                if (interfaceC41775x3 != null) {
                                    InterfaceC41775x1.a.m91377a(interfaceC41775x3, null, 1, null);
                                }
                                objectRef3.element = null;
                            }
                            if (event == Lifecycle.Event.ON_DESTROY) {
                                InterfaceC41708m<Unit> interfaceC41708m = c41716o;
                                Result.Companion companion2 = Result.INSTANCE;
                                interfaceC41708m.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
                            }
                        }
                    };
                    objectRef.element = r11;
                    Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                    lifecycle.addObserver((LifecycleEventObserver) r11);
                    Object objM91171w = c41716o.m91171w();
                    if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (objM91171w == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef2 = objectRef3;
                    interfaceC41775x2 = (InterfaceC41775x1) objectRef2.element;
                    if (interfaceC41775x2 != null) {
                        InterfaceC41775x1.a.m91377a(interfaceC41775x2, null, 1, null);
                    }
                    lifecycleEventObserver2 = (LifecycleEventObserver) objectRef.element;
                    if (lifecycleEventObserver2 != null) {
                        this.$this_repeatOnLifecycle.removeObserver(lifecycleEventObserver2);
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th4) {
                    th2 = th4;
                    objectRef2 = objectRef3;
                    interfaceC41775x1 = (InterfaceC41775x1) objectRef2.element;
                    if (interfaceC41775x1 != null) {
                        InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
                    }
                    lifecycleEventObserver = (LifecycleEventObserver) objectRef.element;
                    if (lifecycleEventObserver != null) {
                        this.$this_repeatOnLifecycle.removeObserver(lifecycleEventObserver);
                        throw th2;
                    }
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26243(Lifecycle lifecycle, Lifecycle.State state, Function2<? super InterfaceC41709m0, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C26243> continuation) {
            super(2, continuation);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$block = function2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26243 c26243 = new C26243(this.$this_repeatOnLifecycle, this.$state, this.$block, continuation);
            c26243.L$0 = obj;
            return c26243;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C26243) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
                AbstractC41586e2 immediate = C41782z0.m91393c().getImmediate();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, interfaceC41709m0, this.$block, null);
                this.label = 1;
                if (C41686h.m91049g(immediate, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Nullable
    public static final Object repeatOnLifecycle(@NotNull Lifecycle lifecycle, @NotNull Lifecycle.State state, @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        if (state == Lifecycle.State.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
            return Unit.INSTANCE;
        }
        Object objM91130f = C41713n0.m91130f(new C26243(lifecycle, state, function2, null), continuation);
        return objM91130f == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91130f : Unit.INSTANCE;
    }

    @Nullable
    public static final Object repeatOnLifecycle(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.State state, @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objRepeatOnLifecycle = repeatOnLifecycle(lifecycleOwner.getLifecycle(), state, function2, continuation);
        return objRepeatOnLifecycle == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRepeatOnLifecycle : Unit.INSTANCE;
    }
}
