package com.kubi.sdk.flutter.delegate;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.MainThread;
import com.kubi.sdk.flutter.exception.FlutterIssueException;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.engine.FlutterEngine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p609ry.C44199a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.sdk.flutter.delegate.i, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FlutterEngineShutdownHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0003Jb\u0010\u0013\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00152\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00152\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/sdk/flutter/delegate/FlutterEngineShutdownHelper;", "", "<init>", "()V", "DESTROY_DELAY_MS", "", "TAG", "", "mainHandler", "Landroid/os/Handler;", "clearScribeMethodHandler", "", "flutterEngine", "Lio/flutter/embedding/engine/FlutterEngine;", "removeFlutterViewFromParent", "flutterView", "Lio/flutter/embedding/android/FlutterView;", "disableSemantics", "disableSemanticsOnMain", "shutdown", "onBeforeDetach", "Lkotlin/Function0;", "onAfterDetach", "onBeforeDestroy", "onAfterDestroy", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlutterEngineShutdownHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterEngineShutdownHelper.kt\ncom/kubi/sdk/flutter/delegate/FlutterEngineShutdownHelper\n+ 2 FlutterIssue.kt\ncom/kubi/sdk/flutter/exception/FlutterIssueKt\n*L\n1#1,104:1\n44#2,15:105\n44#2,15:120\n44#2,15:135\n44#2,15:150\n44#2,15:165\n*S KotlinDebug\n*F\n+ 1 FlutterEngineShutdownHelper.kt\ncom/kubi/sdk/flutter/delegate/FlutterEngineShutdownHelper\n*L\n26#1:105,15\n36#1:120,15\n62#1:135,15\n97#1:150,15\n89#1:165,15\n*E\n"})
public final class FlutterEngineShutdownHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FlutterEngineShutdownHelper f46676a = new FlutterEngineShutdownHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Handler f46677b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f */
    public static final void m56805f(FlutterEngine flutterEngine) {
        f46676a.m56811g(flutterEngine);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m56806j(FlutterEngineShutdownHelper flutterEngineShutdownHelper, FlutterView flutterView, FlutterEngine flutterEngine, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function0 = null;
        }
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        if ((i11 & 16) != 0) {
            function2 = null;
        }
        if ((i11 & 32) != 0) {
            function3 = null;
        }
        flutterEngineShutdownHelper.m56813i(flutterView, flutterEngine, function0, function1, function2, function3);
    }

    /* JADX INFO: renamed from: k */
    public static final void m56807k(final FlutterEngine flutterEngine, Function0 function0, FlutterView flutterView, Function0 function1, final Function0 function2, final Function0 function3) {
        Object objM103844constructorimpl;
        FlutterEngineShutdownHelper flutterEngineShutdownHelper = f46676a;
        try {
            Result.Companion companion = Result.INSTANCE;
            flutterEngineShutdownHelper.m56809d(flutterEngine);
            flutterEngineShutdownHelper.m56810e(flutterEngine);
            if (function0 != null) {
                function0.invoke();
            }
            if (flutterView != null) {
                flutterView.detachFromFlutterEngine();
            }
            if (function1 != null) {
                function1.invoke();
            }
            flutterEngineShutdownHelper.m56812h(flutterView);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            String message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(thM103847exceptionOrNullimpl, "FlutterEngineShutdown detach failed");
            } else {
                C43846g.m96568c(new FlutterIssueException(thM103847exceptionOrNullimpl, "FlutterEngineShutdown detach failed", true, null, 8, null), null, 2, null);
            }
        }
        f46677b.postDelayed(new Runnable() { // from class: com.kubi.sdk.flutter.delegate.h
            @Override // java.lang.Runnable
            public final void run() {
                FlutterEngineShutdownHelper.m56808l(function2, function3, flutterEngine);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: l */
    public static final void m56808l(Function0 function0, Function0 function1, FlutterEngine flutterEngine) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (function1 != null) {
                function1.invoke();
            }
            flutterEngine.destroy();
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            String message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(thM103847exceptionOrNullimpl, "FlutterEngineShutdown destroy failed");
            } else {
                C43846g.m96568c(new FlutterIssueException(thM103847exceptionOrNullimpl, "FlutterEngineShutdown destroy failed", true, null, 8, null), null, 2, null);
            }
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m56809d(@Nullable FlutterEngine flutterEngine) {
        Object objM103844constructorimpl;
        if (flutterEngine == null || !FlutterAnrStopgapConfig.f46661a.m56793c()) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            flutterEngine.getScribeChannel().setScribeMethodHandler(null);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            String message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(thM103847exceptionOrNullimpl, "FlutterEngineShutdown clear scribe channel failed");
            } else {
                C43846g.m96568c(new FlutterIssueException(thM103847exceptionOrNullimpl, "FlutterEngineShutdown clear scribe channel failed", true, null, 8, null), null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m56810e(@Nullable final FlutterEngine flutterEngine) {
        if (flutterEngine == null || !FlutterAnrStopgapConfig.f46661a.m56793c()) {
            return;
        }
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            m56811g(flutterEngine);
        } else {
            f46677b.post(new Runnable() { // from class: com.kubi.sdk.flutter.delegate.f
                @Override // java.lang.Runnable
                public final void run() {
                    FlutterEngineShutdownHelper.m56805f(flutterEngine);
                }
            });
        }
    }

    @MainThread
    /* JADX INFO: renamed from: g */
    public final void m56811g(FlutterEngine flutterEngine) {
        Object objM103844constructorimpl;
        if (FlutterAnrStopgapConfig.f46661a.m56793c()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                flutterEngine.getRenderer().setSemanticsEnabled(false);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                String message = thM103847exceptionOrNullimpl.getMessage();
                if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                    C44199a.m97421b(thM103847exceptionOrNullimpl, "FlutterEngineShutdown disable semantics failed");
                } else {
                    C43846g.m96568c(new FlutterIssueException(thM103847exceptionOrNullimpl, "FlutterEngineShutdown disable semantics failed", true, null, 8, null), null, 2, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m56812h(@Nullable FlutterView flutterView) {
        Object objM103844constructorimpl;
        Unit unit;
        if (flutterView == null || !FlutterAnrStopgapConfig.f46661a.m56793c()) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            ViewParent parent = flutterView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(flutterView);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            String message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(thM103847exceptionOrNullimpl, "FlutterEngineShutdown remove flutter view failed");
            } else {
                C43846g.m96568c(new FlutterIssueException(thM103847exceptionOrNullimpl, "FlutterEngineShutdown remove flutter view failed", true, null, 8, null), null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m56813i(@Nullable final FlutterView flutterView, @Nullable final FlutterEngine flutterEngine, @Nullable final Function0<Unit> function0, @Nullable final Function0<Unit> function1, @Nullable final Function0<Unit> function2, @Nullable final Function0<Unit> function3) {
        if (flutterEngine != null) {
            f46677b.post(new Runnable() { // from class: com.kubi.sdk.flutter.delegate.g
                @Override // java.lang.Runnable
                public final void run() {
                    FlutterEngineShutdownHelper.m56807k(flutterEngine, function0, flutterView, function1, function3, function2);
                }
            });
        } else if (function3 != null) {
            function3.invoke();
        }
    }
}
