package com.google.firebase.perf.util;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes56.dex */
public class FirstDrawDoneListener implements ViewTreeObserver.OnDrawListener {
    private final Runnable callback;

    @SuppressLint({"ThreadPoolCreation"})
    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());
    private final AtomicReference<View> viewReference;

    public static void registerForNextDraw(View view, Runnable runnable) {
        FirstDrawDoneListener firstDrawDoneListener = new FirstDrawDoneListener(view, runnable);
        if (Build.VERSION.SDK_INT >= 26 || isAliveAndAttached(view)) {
            view.getViewTreeObserver().addOnDrawListener(firstDrawDoneListener);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.firebase.perf.util.FirstDrawDoneListener.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    view2.getViewTreeObserver().addOnDrawListener(FirstDrawDoneListener.this);
                    view2.removeOnAttachStateChangeListener(this);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                }
            });
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View andSet = this.viewReference.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.firebase.perf.util.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                FirstDrawDoneListener.m13845a(this.f12632b, andSet);
            }
        });
        this.mainThreadHandler.postAtFrontOfQueue(this.callback);
    }

    private FirstDrawDoneListener(View view, Runnable runnable) {
        this.viewReference = new AtomicReference<>(view);
        this.callback = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13845a(FirstDrawDoneListener firstDrawDoneListener, View view) {
        firstDrawDoneListener.getClass();
        view.getViewTreeObserver().removeOnDrawListener(firstDrawDoneListener);
    }

    private static boolean isAliveAndAttached(View view) {
        if (view.getViewTreeObserver().isAlive() && isAttachedToWindow(view)) {
            return true;
        }
        return false;
    }

    private static boolean isAttachedToWindow(View view) {
        return view.isAttachedToWindow();
    }
}
