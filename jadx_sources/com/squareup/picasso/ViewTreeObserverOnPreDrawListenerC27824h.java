package com.squareup.picasso;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.squareup.picasso.h */
/* JADX INFO: compiled from: DeferredRequestCreator.java */
/* JADX INFO: loaded from: classes59.dex */
public class ViewTreeObserverOnPreDrawListenerC27824h implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b */
    public final C27835s f56754b;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public final WeakReference<ImageView> f56755c;

    /* JADX INFO: renamed from: a */
    public void m68851a() {
        this.f56754b.m68903a();
        ImageView imageView = this.f56755c.get();
        if (imageView == null) {
            return;
        }
        this.f56755c.clear();
        imageView.removeOnAttachStateChangeListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ImageView imageView = this.f56755c.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            imageView.removeOnAttachStateChangeListener(this);
            viewTreeObserver.removeOnPreDrawListener(this);
            this.f56755c.clear();
            this.f56754b.m68910h().m68909g(width, height).m68907e(imageView, null);
        }
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC27824h(C27835s c27835s, ImageView imageView, InterfaceC27821e interfaceC27821e) {
        this.f56754b = c27835s;
        this.f56755c = new WeakReference<>(imageView);
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            onViewAttachedToWindow(imageView);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
