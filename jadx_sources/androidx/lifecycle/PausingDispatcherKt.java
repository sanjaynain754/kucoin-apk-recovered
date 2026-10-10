package androidx.lifecycle;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: PausingDispatcher.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\b\u0010\t\u001aC\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\b\u0010\u000b\u001aC\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\f\u0010\t\u001aC\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\f\u0010\u000b\u001aC\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\r\u0010\t\u001aC\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\r\u0010\u000b\u001aK\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LifecycleOwner;", "Lkotlin/Function2;", "Lkotlinx/coroutines/m0;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "whenCreated", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/Lifecycle;", "(Landroidx/lifecycle/Lifecycle;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "whenStarted", "whenResumed", "Landroidx/lifecycle/Lifecycle$State;", "minState", "whenStateAtLeast", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-common"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@JvmName(name = "PausingDispatcherKt")
public final class PausingDispatcherKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2 */
    /* JADX INFO: compiled from: PausingDispatcher.jvm.kt */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/m0;", "<anonymous>"}, m90085k = 3, m90086mv = {2, 0, 0})
    @DebugMetadata(m90121c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", m90122f = "PausingDispatcher.jvm.kt", m90123i = {0}, m90124l = {213}, m90125m = "invokeSuspend", m90126n = {"controller"}, m90127s = {"L$0"})
    public static final class C26232<T> extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super T>, Object> {
        final /* synthetic */ Function2<InterfaceC41709m0, Continuation<? super T>, Object> $block;
        final /* synthetic */ Lifecycle.State $minState;
        final /* synthetic */ Lifecycle $this_whenStateAtLeast;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26232(Lifecycle lifecycle, Lifecycle.State state, Function2<? super InterfaceC41709m0, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super C26232> continuation) {
            super(2, continuation);
            this.$this_whenStateAtLeast = lifecycle;
            this.$minState = state;
            this.$block = function2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26232 c26232 = new C26232(this.$this_whenStateAtLeast, this.$minState, this.$block, continuation);
            c26232.L$0 = obj;
            return c26232;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super T> continuation) {
            return ((C26232) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            LifecycleController lifecycleController;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    lifecycleController = (LifecycleController) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        lifecycleController.finish();
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        lifecycleController.finish();
                        throw th;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC41775x1 interfaceC41775x1 = (InterfaceC41775x1) ((InterfaceC41709m0) this.L$0).getCoroutineContext().get(InterfaceC41775x1.INSTANCE);
            if (interfaceC41775x1 != null) {
                PausingDispatcher pausingDispatcher = new PausingDispatcher();
                LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, interfaceC41775x1);
                try {
                    Function2<InterfaceC41709m0, Continuation<? super T>, Object> function2 = this.$block;
                    this.L$0 = lifecycleController2;
                    this.label = 1;
                    obj = C41686h.m91049g(pausingDispatcher, function2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    lifecycleController = lifecycleController2;
                    lifecycleController.finish();
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    lifecycleController = lifecycleController2;
                    lifecycleController.finish();
                    throw th;
                }
            }
            throw new IllegalStateException("when[State] methods should have a parent job");
        }
    }

    @Deprecated(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final <T> Object whenCreated(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return whenCreated(lifecycleOwner.getLifecycle(), function2, continuation);
    }

    @Deprecated(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final <T> Object whenResumed(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return whenResumed(lifecycleOwner.getLifecycle(), function2, continuation);
    }

    @Deprecated(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final <T> Object whenStarted(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return whenStarted(lifecycleOwner.getLifecycle(), function2, continuation);
    }

    @Deprecated(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final <T> Object whenCreated(@NotNull Lifecycle lifecycle, @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, function2, continuation);
    }

    @Deprecated(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final <T> Object whenResumed(@NotNull Lifecycle lifecycle, @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, function2, continuation);
    }

    @Deprecated(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final <T> Object whenStarted(@NotNull Lifecycle lifecycle, @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, function2, continuation);
    }

    @Deprecated(message = "whenStateAtLeast has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStateAtLeast for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final <T> Object whenStateAtLeast(@NotNull Lifecycle lifecycle, @NotNull Lifecycle.State state, @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return C41686h.m91049g(C41782z0.m91393c().getImmediate(), new C26232(lifecycle, state, function2, null), continuation);
    }
}
