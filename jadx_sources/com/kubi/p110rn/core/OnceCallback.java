package com.kubi.p110rn.core;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.JSExceptionHandler;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReactInstanceHelper.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0007J\u0014\u0010\u0013\u001a\u00020\u00072\n\u0010\u0010\u001a\u00060\u0014j\u0002`\u0015H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/rn/core/OnceCallback;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/facebook/react/bridge/JSExceptionHandler;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/coroutines/Continuation;", "onCompleted", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function0;)V", "isResumed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "resume", "value", "(Ljava/lang/Object;)V", "resumeWithException", "e", "", "cancel", "handleException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OnceCallback<T> implements JSExceptionHandler {

    @NotNull
    private final Continuation<T> callback;

    @NotNull
    private final AtomicBoolean isResumed;

    @NotNull
    private final Function0<Unit> onCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public OnceCallback(@NotNull Continuation<? super T> callback, @NotNull Function0<Unit> onCompleted) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(onCompleted, "onCompleted");
        this.callback = callback;
        this.onCompleted = onCompleted;
        this.isResumed = new AtomicBoolean(false);
    }

    public final void cancel() {
        if (this.isResumed.compareAndSet(false, true)) {
            this.onCompleted.invoke();
        }
    }

    @Override // com.facebook.react.bridge.JSExceptionHandler
    public void handleException(@NotNull Exception e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        resumeWithException(e11);
    }

    public final void resume(T value) {
        if (this.isResumed.compareAndSet(false, true)) {
            try {
                this.callback.resumeWith(Result.m103844constructorimpl(value));
            } finally {
                this.onCompleted.invoke();
            }
        }
    }

    public final void resumeWithException(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        if (this.isResumed.compareAndSet(false, true)) {
            try {
                Continuation<T> continuation = this.callback;
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(e11)));
            } finally {
                this.onCompleted.invoke();
            }
        }
    }

    public /* synthetic */ OnceCallback(Continuation continuation, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(continuation, (i11 & 2) != 0 ? new Function0() { // from class: com.kubi.rn.core.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : function0);
    }
}
