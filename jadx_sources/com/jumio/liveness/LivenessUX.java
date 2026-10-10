package com.jumio.liveness;

import android.os.SystemClock;
import android.view.Choreographer;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.SafeContinuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jdk7.AutoCloseableKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: LivenessUX.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u001f2\u00060\u0001j\u0002`\u0002:\u0003\u001d\u001e\u001fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0086 J\u0013\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0086 J\t\u0010\u000e\u001a\u00020\bH\u0086 J\u0011\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0082 J\t\u0010\u0011\u001a\u00020\bH\u0086 J\u0011\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0004H\u0086 J\t\u0010\u0014\u001a\u00020\bH\u0086 J\u0011\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0082 J\t\u0010\u0016\u001a\u00020\bH\u0096 J\u000e\u0010\u000b\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\u001aJ\b\u0010\u000f\u001a\u00020\bH\u0007J\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019¨\u0006 "}, m90084d2 = {"Lcom/jumio/liveness/LivenessUX;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "ptr", "", "<init>", "(J)V", "setEventHandler", "", "eventHandler", "Lcom/jumio/liveness/LivenessUX$EventHandler;", "run", "handler", "Lcom/jumio/liveness/LivenessUX$RunHandler;", "cancel", "onBeforeFrame", "timestampMillis", "onAfterFrame", "onReceiveNativeEvent", "nativeEvent", "confirmColorChange", "onVSync", "close", "isClosed", "", "()Z", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timestampNanos", "isRealtime", "EventHandler", "RunHandler", "Companion", "dasdk_withoutAssetsRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class LivenessUX implements AutoCloseable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final long ptr;

    /* JADX INFO: compiled from: LivenessUX.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0083 J\u0011\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0087 J\u0011\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\nH\u0087 ¨\u0006\u000b"}, m90084d2 = {"Lcom/jumio/liveness/LivenessUX$Companion;", "", "<init>", "()V", "loadType", "", "create", "Lcom/jumio/liveness/LivenessUX;", "configurations", "Lcom/jumio/liveness/PremiumLivenessConfigurations;", "Lcom/jumio/liveness/StandardLivenessConfigurations;", "dasdk_withoutAssetsRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final LivenessUX create(@NotNull PremiumLivenessConfigurations configurations) {
            return LivenessUX.create(configurations);
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final LivenessUX create(@NotNull StandardLivenessConfigurations configurations) {
            return LivenessUX.create(configurations);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final void loadType() {
            LivenessUX.loadType();
        }
    }

    /* JADX INFO: compiled from: LivenessUX.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m90084d2 = {"Lcom/jumio/liveness/LivenessUX$EventHandler;", "", "onReceiveEvent", "", "event", "Lcom/jumio/liveness/DaClient2$EventView;", "onReceiveEventForForwarding", "nativeEvent", "", "dasdk_withoutAssetsRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public interface EventHandler {
        void onReceiveEvent(@NotNull DaClient2.EventView event);

        void onReceiveEventForForwarding(long nativeEvent);
    }

    /* JADX INFO: compiled from: LivenessUX.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H&¨\u0006\u0007"}, m90084d2 = {"Lcom/jumio/liveness/LivenessUX$RunHandler;", "", "onFinishRun", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "dasdk_withoutAssetsRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public interface RunHandler {
        void onFinishRun(@Nullable Exception exception);
    }

    /* JADX INFO: renamed from: com.jumio.liveness.LivenessUX$run$2 */
    /* JADX INFO: compiled from: LivenessUX.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.jumio.liveness.LivenessUX$run$2", m90122f = "LivenessUX.kt", m90123i = {}, m90124l = {44}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C93142 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX INFO: renamed from: com.jumio.liveness.LivenessUX$run$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: LivenessUX.kt */
        @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, m90084d2 = {"com/jumio/liveness/LivenessUX$run$2$1", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "doFrame", "", "frameTimeNanos", "", "close", "dasdk_withoutAssetsRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
        public static final class AnonymousClass1 implements Choreographer.FrameCallback, AutoCloseable {
            final /* synthetic */ LivenessUX this$0;

            public AnonymousClass1(LivenessUX livenessUX) {
                this.this$0 = livenessUX;
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long frameTimeNanos) {
                if (this.this$0.ptr == 0) {
                    return;
                }
                this.this$0.onVSync(frameTimeNanos / ((long) 1000000));
                Choreographer.getInstance().postFrameCallback(this);
            }

            @Override // java.lang.AutoCloseable
            public void close() {
                Choreographer.getInstance().removeFrameCallback(this);
            }
        }

        public C93142(Continuation<? super C93142> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LivenessUX.this.new C93142(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C93142) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AutoCloseable autoCloseable;
            Throwable th2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    autoCloseable = (AutoCloseable) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            AutoCloseableKt.closeFinally(autoCloseable, th2);
                            throw th4;
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(LivenessUX.this);
                Choreographer.getInstance().postFrameCallback(anonymousClass1);
                LivenessUX livenessUX = LivenessUX.this;
                try {
                    this.L$0 = anonymousClass1;
                    this.L$1 = livenessUX;
                    this.L$2 = this;
                    this.label = 1;
                    final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
                    livenessUX.run(new RunHandler() { // from class: com.jumio.liveness.LivenessUX$run$2$3$1$1
                        @Override // com.jumio.liveness.LivenessUX.RunHandler
                        public final void onFinishRun(Exception exc) {
                            if (exc == null) {
                                Continuation<Unit> continuation = safeContinuation;
                                Result.Companion companion = Result.INSTANCE;
                                continuation.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
                            } else {
                                Continuation<Unit> continuation2 = safeContinuation;
                                Result.Companion companion2 = Result.INSTANCE;
                                continuation2.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(exc)));
                            }
                        }
                    });
                    Object orThrow = safeContinuation.getOrThrow();
                    if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (orThrow == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    autoCloseable = anonymousClass1;
                } catch (Throwable th5) {
                    autoCloseable = anonymousClass1;
                    th2 = th5;
                    throw th2;
                }
            }
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(autoCloseable, null);
            return Unit.INSTANCE;
        }
    }

    @JvmStatic
    @NotNull
    public static final native LivenessUX create(@NotNull PremiumLivenessConfigurations premiumLivenessConfigurations);

    @JvmStatic
    @NotNull
    public static final native LivenessUX create(@NotNull StandardLivenessConfigurations standardLivenessConfigurations);

    /* JADX INFO: Access modifiers changed from: private */
    @JvmStatic
    public static final native void loadType();

    private final native void onBeforeFrame(long timestampMillis);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void onVSync(long timestampMillis);

    public final native void cancel();

    @Override // java.lang.AutoCloseable
    public native void close();

    public final native void confirmColorChange();

    public final native void onAfterFrame();

    @Deprecated(message = "Integrate onBeforeFrame(timestampNanos: Long, isRealtime: Boolean) instead to enable future Photinus improvements")
    public final void onBeforeFrame() {
        onBeforeFrame(-1L);
    }

    public final native void onReceiveNativeEvent(long nativeEvent);

    @Nullable
    public final Object run(@NotNull Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C41782z0.m91393c(), new C93142(null), continuation);
        return objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91049g : Unit.INSTANCE;
    }

    public final native void run(@Nullable RunHandler handler);

    public final native void setEventHandler(@Nullable EventHandler eventHandler);

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        companion.loadType();
    }

    public final boolean isClosed() {
        return this.ptr == 0;
    }

    public final void onBeforeFrame(long timestampNanos, boolean isRealtime) {
        long jElapsedRealtime = timestampNanos / ((long) 1000000);
        if (isRealtime) {
            jElapsedRealtime -= SystemClock.elapsedRealtime() - SystemClock.uptimeMillis();
        }
        onBeforeFrame(jElapsedRealtime);
    }

    private LivenessUX(long j11) {
        this.ptr = j11;
    }
}
