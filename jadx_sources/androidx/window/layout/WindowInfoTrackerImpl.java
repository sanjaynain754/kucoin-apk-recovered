package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.core.util.Consumer;
import androidx.credentials.ExecutorC1980h;
import androidx.window.layout.adapter.WindowBackend;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.channels.InterfaceC41574m;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WindowInfoTrackerImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Landroidx/window/layout/WindowInfoTrackerImpl;", "Landroidx/window/layout/WindowInfoTracker;", "Landroidx/window/layout/WindowMetricsCalculator;", "windowMetricsCalculator", "Landroidx/window/layout/adapter/WindowBackend;", "windowBackend", "<init>", "(Landroidx/window/layout/WindowMetricsCalculator;Landroidx/window/layout/adapter/WindowBackend;)V", "Landroid/content/Context;", "context", "Lkotlinx/coroutines/flow/e;", "Landroidx/window/layout/WindowLayoutInfo;", "windowLayoutInfo", "(Landroid/content/Context;)Lkotlinx/coroutines/flow/e;", "Landroid/app/Activity;", "activity", "(Landroid/app/Activity;)Lkotlinx/coroutines/flow/e;", "Landroidx/window/layout/WindowMetricsCalculator;", "Landroidx/window/layout/adapter/WindowBackend;", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class WindowInfoTrackerImpl implements WindowInfoTracker {

    @NotNull
    private final WindowBackend windowBackend;

    @NotNull
    private final WindowMetricsCalculator windowMetricsCalculator;

    /* JADX INFO: renamed from: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1 */
    /* JADX INFO: compiled from: WindowInfoTrackerImpl.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"Lkotlinx/coroutines/channels/m;", "Landroidx/window/layout/WindowLayoutInfo;", "", "<anonymous>", "(Lkotlinx/coroutines/channels/m;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
    @DebugMetadata(m90121c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", m90122f = "WindowInfoTrackerImpl.kt", m90123i = {}, m90124l = {50}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C42651 extends SuspendLambda implements Function2<InterfaceC41574m<? super WindowLayoutInfo>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42651(Context context, Continuation<? super C42651> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C42651 c42651 = WindowInfoTrackerImpl.this.new C42651(this.$context, continuation);
            c42651.L$0 = obj;
            return c42651;
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41574m<? super WindowLayoutInfo> interfaceC41574m, @Nullable Continuation<? super Unit> continuation) {
            return ((C42651) create(interfaceC41574m, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
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
                final InterfaceC41574m interfaceC41574m = (InterfaceC41574m) this.L$0;
                final Consumer<WindowLayoutInfo> consumer = new Consumer() { // from class: androidx.window.layout.a
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj2) {
                        interfaceC41574m.mo90594e((WindowLayoutInfo) obj2);
                    }
                };
                WindowInfoTrackerImpl.this.windowBackend.registerLayoutChangeCallback(this.$context, new ExecutorC1980h(), consumer);
                final WindowInfoTrackerImpl windowInfoTrackerImpl = WindowInfoTrackerImpl.this;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.window.layout.WindowInfoTrackerImpl.windowLayoutInfo.1.2
                    @Override // p852kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        windowInfoTrackerImpl.windowBackend.unregisterLayoutChangeCallback(consumer);
                    }
                };
                this.label = 1;
                if (ProduceKt.m90681a(interfaceC41574m, function0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2 */
    /* JADX INFO: compiled from: WindowInfoTrackerImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"Lkotlinx/coroutines/channels/m;", "Landroidx/window/layout/WindowLayoutInfo;", "", "<anonymous>", "(Lkotlinx/coroutines/channels/m;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
    @DebugMetadata(m90121c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2", m90122f = "WindowInfoTrackerImpl.kt", m90123i = {}, m90124l = {63}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C42662 extends SuspendLambda implements Function2<InterfaceC41574m<? super WindowLayoutInfo>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42662(Activity activity, Continuation<? super C42662> continuation) {
            super(2, continuation);
            this.$activity = activity;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C42662 c42662 = WindowInfoTrackerImpl.this.new C42662(this.$activity, continuation);
            c42662.L$0 = obj;
            return c42662;
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41574m<? super WindowLayoutInfo> interfaceC41574m, @Nullable Continuation<? super Unit> continuation) {
            return ((C42662) create(interfaceC41574m, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
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
                final InterfaceC41574m interfaceC41574m = (InterfaceC41574m) this.L$0;
                final Consumer<WindowLayoutInfo> consumer = new Consumer() { // from class: androidx.window.layout.b
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj2) {
                        interfaceC41574m.mo90594e((WindowLayoutInfo) obj2);
                    }
                };
                WindowInfoTrackerImpl.this.windowBackend.registerLayoutChangeCallback(this.$activity, new ExecutorC1980h(), consumer);
                final WindowInfoTrackerImpl windowInfoTrackerImpl = WindowInfoTrackerImpl.this;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.window.layout.WindowInfoTrackerImpl.windowLayoutInfo.2.2
                    @Override // p852kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        windowInfoTrackerImpl.windowBackend.unregisterLayoutChangeCallback(consumer);
                    }
                };
                this.label = 1;
                if (ProduceKt.m90681a(interfaceC41574m, function0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.window.layout.WindowInfoTracker
    @NotNull
    public InterfaceC41634e<WindowLayoutInfo> windowLayoutInfo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C41636g.m90890N(C41636g.m90913f(new C42651(context, null)), C41782z0.m91393c());
    }

    public WindowInfoTrackerImpl(@NotNull WindowMetricsCalculator windowMetricsCalculator, @NotNull WindowBackend windowBackend) {
        Intrinsics.checkNotNullParameter(windowMetricsCalculator, "windowMetricsCalculator");
        Intrinsics.checkNotNullParameter(windowBackend, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }

    @Override // androidx.window.layout.WindowInfoTracker
    @NotNull
    public InterfaceC41634e<WindowLayoutInfo> windowLayoutInfo(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return C41636g.m90890N(C41636g.m90913f(new C42662(activity, null)), C41782z0.m91393c());
    }
}
