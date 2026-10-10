package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C41689h2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.C41783z1;
import kotlinx.coroutines.InterfaceC41550b1;
import kotlinx.coroutines.InterfaceC41708m;
import kotlinx.coroutines.InterfaceC41758t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.time.DurationKt;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0013J%\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\u001a\u0010,\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, m90084d2 = {"Lkotlinx/coroutines/android/HandlerContext;", "Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/t0;", "Landroid/os/Handler;", "handler", "", "name", "", "invokeImmediately", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "cancelOnRejection", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "isDispatchNeeded", "(Lkotlin/coroutines/CoroutineContext;)Z", "dispatch", "", "timeMillis", "Lkotlinx/coroutines/m;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/m;)V", "Lkotlinx/coroutines/b1;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/b1;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Handler;", "Ljava/lang/String;", "Z", "immediate", "Lkotlinx/coroutines/android/HandlerContext;", "getImmediate", "()Lkotlinx/coroutines/android/HandlerContext;", "kotlinx-coroutines-android"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1#2:213\n*E\n"})
public final class HandlerContext extends HandlerDispatcher implements InterfaceC41758t0 {

    @NotNull
    private final Handler handler;

    @NotNull
    private final HandlerContext immediate;
    private final boolean invokeImmediately;

    @Nullable
    private final String name;

    private HandlerContext(Handler handler, String str, boolean z11) {
        super(null);
        this.handler = handler;
        this.name = str;
        this.invokeImmediately = z11;
        this.immediate = z11 ? this : new HandlerContext(handler, str, true);
    }

    private final void cancelOnRejection(CoroutineContext context, Runnable block) {
        C41783z1.m91397c(context, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C41782z0.m91392b().dispatch(context, block);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeOnTimeout$lambda$3(HandlerContext handlerContext, Runnable runnable) {
        handlerContext.handler.removeCallbacks(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleResumeAfterDelay$lambda$1(InterfaceC41708m interfaceC41708m, HandlerContext handlerContext) {
        interfaceC41708m.mo91114B(handlerContext, Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scheduleResumeAfterDelay$lambda$2(HandlerContext handlerContext, Runnable runnable, Throwable th2) {
        handlerContext.handler.removeCallbacks(runnable);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    public void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        if (this.handler.post(block)) {
            return;
        }
        cancelOnRejection(context, block);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof HandlerContext)) {
            return false;
        }
        HandlerContext handlerContext = (HandlerContext) other;
        return handlerContext.handler == this.handler && handlerContext.invokeImmediately == this.invokeImmediately;
    }

    public int hashCode() {
        return System.identityHashCode(this.handler) ^ (this.invokeImmediately ? 1231 : 1237);
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.InterfaceC41758t0
    @NotNull
    public InterfaceC41550b1 invokeOnTimeout(long timeMillis, @NotNull final Runnable block, @NotNull CoroutineContext context) {
        if (this.handler.postDelayed(block, RangesKt.coerceAtMost(timeMillis, DurationKt.MAX_MILLIS))) {
            return new InterfaceC41550b1() { // from class: kotlinx.coroutines.android.a
                @Override // kotlinx.coroutines.InterfaceC41550b1
                public final void dispose() {
                    HandlerContext.invokeOnTimeout$lambda$3(this.f91452b, block);
                }
            };
        }
        cancelOnRejection(context, block);
        return C41689h2.f91736b;
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    public boolean isDispatchNeeded(@NotNull CoroutineContext context) {
        return (this.invokeImmediately && Intrinsics.areEqual(Looper.myLooper(), this.handler.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.InterfaceC41758t0
    public void scheduleResumeAfterDelay(long timeMillis, @NotNull final InterfaceC41708m<? super Unit> continuation) {
        final Runnable runnable = new Runnable() { // from class: kotlinx.coroutines.android.b
            @Override // java.lang.Runnable
            public final void run() {
                HandlerContext.scheduleResumeAfterDelay$lambda$1(continuation, this);
            }
        };
        if (this.handler.postDelayed(runnable, RangesKt.coerceAtMost(timeMillis, DurationKt.MAX_MILLIS))) {
            continuation.mo91119t(new Function1() { // from class: kotlinx.coroutines.android.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HandlerContext.scheduleResumeAfterDelay$lambda$2(this.f91456b, runnable, (Throwable) obj);
                }
            });
        } else {
            cancelOnRejection(continuation.get$context(), runnable);
        }
    }

    @Override // kotlinx.coroutines.AbstractC41586e2
    @NotNull
    public HandlerContext getImmediate() {
        return this.immediate;
    }

    @Override // kotlinx.coroutines.AbstractC41586e2, kotlinx.coroutines.AbstractC41697j0
    @NotNull
    /* JADX INFO: renamed from: toString */
    public String getName() {
        String stringInternalImpl = toStringInternalImpl();
        if (stringInternalImpl == null) {
            String string = this.name;
            if (string == null) {
                string = this.handler.toString();
            }
            if (this.invokeImmediately) {
                return string + ".immediate";
            }
            return string;
        }
        return stringInternalImpl;
    }

    public /* synthetic */ HandlerContext(Handler handler, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i11 & 2) != 0 ? null : str);
    }

    public HandlerContext(@NotNull Handler handler, @Nullable String str) {
        this(handler, str, false);
    }
}
