package com.facebook.react.uimanager;

import android.view.Choreographer;
import com.facebook.react.bridge.ReactContext;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GuardedFrameCallback.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/facebook/react/uimanager/GuardedFrameCallback;", "Landroid/view/Choreographer$FrameCallback;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "doFrame", "", "frameTimeNanos", "", "doFrameGuarded", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public abstract class GuardedFrameCallback implements Choreographer.FrameCallback {

    @NotNull
    private final ReactContext reactContext;

    public abstract void doFrameGuarded(long frameTimeNanos);

    public GuardedFrameCallback(@NotNull ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        try {
            doFrameGuarded(frameTimeNanos);
        } catch (RuntimeException e11) {
            this.reactContext.handleException(e11);
        }
    }
}
