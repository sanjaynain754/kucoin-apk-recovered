package com.reactnativecommunity.blurview;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ThemedReactContext;
import eightbitlab.com.blurview.BlurView;
import java.util.Objects;

/* JADX INFO: renamed from: com.reactnativecommunity.blurview.a */
/* JADX INFO: compiled from: BlurViewManagerImpl.java */
/* JADX INFO: loaded from: classes59.dex */
public class C27494a {
    /* JADX INFO: renamed from: e */
    public static void m68106e(BlurView blurView, int i11) {
        blurView.m83190d(i11);
        blurView.invalidate();
    }

    /* JADX INFO: renamed from: a */
    public static BlurView m68102a(ThemedReactContext themedReactContext) {
        BlurView blurView = new BlurView(themedReactContext);
        Activity currentActivity = themedReactContext.getCurrentActivity();
        Objects.requireNonNull(currentActivity);
        View decorView = currentActivity.getWindow().getDecorView();
        blurView.m83192f((ViewGroup) decorView.findViewById(R.id.content)).mo99867f(decorView.getBackground()).mo99864c(10.0f);
        return blurView;
    }

    /* JADX INFO: renamed from: b */
    public static void m68103b(BlurView blurView, boolean z11) {
        blurView.m83188b(z11);
        blurView.invalidate();
    }

    /* JADX INFO: renamed from: c */
    public static void m68104c(BlurView blurView, boolean z11) {
        blurView.m83189c(z11);
    }

    /* JADX INFO: renamed from: d */
    public static void m68105d(BlurView blurView, int i11) {
        blurView.m83191e(i11);
        blurView.invalidate();
    }
}
