package androidx.lifecycle;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.channels.InterfaceC41574m;
import kotlinx.coroutines.channels.InterfaceC41577p;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/e;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle$State;", "minActiveState", "flowWithLifecycle", "(Lkotlinx/coroutines/flow/e;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;)Lkotlinx/coroutines/flow/e;", "lifecycle-runtime_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class FlowExtKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1 */
    /* JADX INFO: compiled from: FlowExt.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/channels/m;", "", "<anonymous>", "(Lkotlinx/coroutines/channels/m;)V"}, m90085k = 3, m90086mv = {2, 0, 0})
    @DebugMetadata(m90121c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", m90122f = "FlowExt.kt", m90123i = {0}, m90124l = {90}, m90125m = "invokeSuspend", m90126n = {"$this$callbackFlow"}, m90127s = {"L$0"})
    public static final class C26121<T> extends SuspendLambda implements Function2<InterfaceC41574m<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Lifecycle $lifecycle;
        final /* synthetic */ Lifecycle.State $minActiveState;
        final /* synthetic */ InterfaceC41634e<T> $this_flowWithLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: FlowExt.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 0, 0})
        @DebugMetadata(m90121c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", m90122f = "FlowExt.kt", m90123i = {}, m90124l = {90}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            final /* synthetic */ InterfaceC41574m<T> $$this$callbackFlow;
            final /* synthetic */ InterfaceC41634e<T> $this_flowWithLifecycle;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(InterfaceC41634e<? extends T> interfaceC41634e, InterfaceC41574m<? super T> interfaceC41574m, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$this_flowWithLifecycle = interfaceC41634e;
                this.$$this$callbackFlow = interfaceC41574m;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$this_flowWithLifecycle, this.$$this$callbackFlow, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    InterfaceC41634e<T> interfaceC41634e = this.$this_flowWithLifecycle;
                    final InterfaceC41574m<T> interfaceC41574m = this.$$this$callbackFlow;
                    InterfaceC41635f<? super T> interfaceC41635f = new InterfaceC41635f() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                        @Override // kotlinx.coroutines.flow.InterfaceC41635f
                        public final Object emit(T t11, Continuation<? super Unit> continuation) {
                            Object objSend = interfaceC41574m.send(t11, continuation);
                            return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (interfaceC41634e.collect(interfaceC41635f, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26121(Lifecycle lifecycle, Lifecycle.State state, InterfaceC41634e<? extends T> interfaceC41634e, Continuation<? super C26121> continuation) {
            super(2, continuation);
            this.$lifecycle = lifecycle;
            this.$minActiveState = state;
            this.$this_flowWithLifecycle = interfaceC41634e;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26121 c26121 = new C26121(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, continuation);
            c26121.L$0 = obj;
            return c26121;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41574m<? super T> interfaceC41574m, Continuation<? super Unit> continuation) {
            return ((C26121) create(interfaceC41574m, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC41574m interfaceC41574m;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    interfaceC41574m = (InterfaceC41574m) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41574m interfaceC41574m2 = (InterfaceC41574m) this.L$0;
                Lifecycle lifecycle = this.$lifecycle;
                Lifecycle.State state = this.$minActiveState;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_flowWithLifecycle, interfaceC41574m2, null);
                this.L$0 = interfaceC41574m2;
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC41574m = interfaceC41574m2;
            }
            InterfaceC41577p.a.m90714a(interfaceC41574m, null, 1, null);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final <T> InterfaceC41634e<T> flowWithLifecycle(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Lifecycle lifecycle, @NotNull Lifecycle.State minActiveState) {
        Intrinsics.checkNotNullParameter(interfaceC41634e, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(minActiveState, "minActiveState");
        return C41636g.m90913f(new C26121(lifecycle, minActiveState, interfaceC41634e, null));
    }

    public static /* synthetic */ InterfaceC41634e flowWithLifecycle$default(InterfaceC41634e interfaceC41634e, Lifecycle lifecycle, Lifecycle.State state, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(interfaceC41634e, lifecycle, state);
    }
}
