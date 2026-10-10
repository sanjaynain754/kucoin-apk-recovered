package com.swmansion.worklets;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.concurrent.atomic.AtomicBoolean;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes59.dex */
public class AndroidUIScheduler {

    /* JADX INFO: renamed from: a */
    public final ReactApplicationContext f68474a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f68475b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c */
    public final Runnable f68476c = new Runnable() { // from class: wb0.a
        @Override // java.lang.Runnable
        public final void run() {
            this.f103208b.m72131d();
        }
    };

    @InterfaceC44695a
    private final HybridData mHybridData = initHybrid();

    /* JADX INFO: renamed from: com.swmansion.worklets.AndroidUIScheduler$a */
    public class C33505a extends GuardedRunnable {
        public C33505a(JSExceptionHandler jSExceptionHandler) {
            super(jSExceptionHandler);
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            AndroidUIScheduler.this.f68476c.run();
        }
    }

    private native HybridData initHybrid();

    public native void invalidate();

    public native void triggerUI();

    @InterfaceC44695a
    private void scheduleTriggerOnUI() {
        UiThreadUtil.runOnUiThread(new C33505a(this.f68474a.getExceptionHandler()));
    }

    /* JADX INFO: renamed from: c */
    public void m72130c() {
        synchronized (this.f68475b) {
            this.f68475b.set(false);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m72131d() {
        synchronized (this.f68475b) {
            try {
                if (this.f68475b.get()) {
                    triggerUI();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public AndroidUIScheduler(ReactApplicationContext reactApplicationContext) {
        this.f68474a = reactApplicationContext;
    }
}
