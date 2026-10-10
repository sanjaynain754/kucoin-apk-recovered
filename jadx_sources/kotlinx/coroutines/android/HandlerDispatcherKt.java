package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.VisibleForTesting;
import com.facebook.react.bridge.BaseJavaModule;
import java.lang.reflect.InvocationTargetException;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41708m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u001f\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\n\u001a\u00020\u0000*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0010\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a\u0010\u0010\u000f\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u001d\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a%\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u0019\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u001e\"\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001f¨\u0006 "}, m90084d2 = {"Landroid/os/Handler;", "", "name", "Lkotlinx/coroutines/android/HandlerDispatcher;", "from", "(Landroid/os/Handler;Ljava/lang/String;)Lkotlinx/coroutines/android/HandlerDispatcher;", "asCoroutineDispatcher", "Landroid/os/Looper;", "", BaseJavaModule.METHOD_TYPE_ASYNC, "asHandler", "(Landroid/os/Looper;Z)Landroid/os/Handler;", "", "awaitFrame", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFrameSlowPath", "Lkotlinx/coroutines/m;", "cont", "", "updateChoreographerAndPostFrameCallback", "(Lkotlinx/coroutines/m;)V", "Landroid/view/Choreographer;", "choreographer", "postFrameCallback", "(Landroid/view/Choreographer;Lkotlinx/coroutines/m;)V", "MAX_DELAY", "J", "Main", "Lkotlinx/coroutines/android/HandlerDispatcher;", "getMain$annotations", "()V", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n426#2,11:213\n426#2,11:224\n1#3:235\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n*L\n184#1:213,11\n192#1:224,11\n*E\n"})
public final class HandlerDispatcherKt {
    private static final long MAX_DELAY = 4611686018427387903L;

    @JvmField
    @Nullable
    public static final HandlerDispatcher Main;

    @Nullable
    private static volatile Choreographer choreographer;

    static {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(new HandlerContext(asHandler(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Main = (HandlerDispatcher) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }

    @JvmOverloads
    @JvmName(name = "from")
    @NotNull
    public static final HandlerDispatcher from(@NotNull Handler handler) {
        return from$default(handler, null, 1, null);
    }

    @VisibleForTesting
    @NotNull
    public static final Handler asHandler(@NotNull Looper looper, boolean z11) throws IllegalAccessException, InvocationTargetException {
        if (!z11) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    @Nullable
    public static final Object awaitFrame(@NotNull Continuation<? super Long> continuation) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            return awaitFrameSlowPath(continuation);
        }
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        postFrameCallback(choreographer2, c41716o);
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitFrameSlowPath(Continuation<? super Long> continuation) {
        final C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            updateChoreographerAndPostFrameCallback(c41716o);
        } else {
            C41782z0.m91393c().dispatch(c41716o.get$context(), new Runnable() { // from class: kotlinx.coroutines.android.HandlerDispatcherKt$awaitFrameSlowPath$2$1
                @Override // java.lang.Runnable
                public final void run() {
                    HandlerDispatcherKt.updateChoreographerAndPostFrameCallback(c41716o);
                }
            });
        }
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }

    @JvmOverloads
    @JvmName(name = "from")
    @NotNull
    public static final HandlerDispatcher from(@NotNull Handler handler, @Nullable String str) {
        return new HandlerContext(handler, str);
    }

    public static /* synthetic */ HandlerDispatcher from$default(Handler handler, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        return from(handler, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postFrameCallback(Choreographer choreographer2, final InterfaceC41708m<? super Long> interfaceC41708m) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: kotlinx.coroutines.android.d
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j11) {
                HandlerDispatcherKt.postFrameCallback$lambda$5(interfaceC41708m, j11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateChoreographerAndPostFrameCallback(InterfaceC41708m<? super Long> interfaceC41708m) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            Intrinsics.checkNotNull(choreographer2);
            choreographer = choreographer2;
        }
        postFrameCallback(choreographer2, interfaceC41708m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postFrameCallback$lambda$5(InterfaceC41708m interfaceC41708m, long j11) {
        interfaceC41708m.mo91114B(C41782z0.m91393c(), Long.valueOf(j11));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void getMain$annotations() {
    }
}
