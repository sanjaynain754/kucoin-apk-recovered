package com.facebook.react.runtime;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.UiThread;
import androidx.camera.view.C1454t;
import com.facebook.react.ReactHost;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.fabric.SurfaceHandlerBinding;
import com.facebook.react.interfaces.TaskInterface;
import com.facebook.react.interfaces.fabric.ReactSurface;
import com.facebook.react.interfaces.fabric.SurfaceHandler;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.runtime.internal.bolts.Task;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes45.dex */
public class ReactSurfaceImpl implements ReactSurface {
    private Context mContext;
    private final AtomicReference<ReactHostImpl> mReactHost;
    private final SurfaceHandler mSurfaceHandler;
    private final AtomicReference<ReactSurfaceView> mSurfaceView;

    public ReactSurfaceImpl(Context context, String str, Bundle bundle) {
        this(new SurfaceHandlerBinding(str), context);
        this.mSurfaceHandler.setProps(bundle == null ? new WritableNativeMap() : (NativeMap) Arguments.fromBundle(bundle));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.mSurfaceHandler.setLayoutConstraints(View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE), 0, 0, doRTLSwap(context), isRTL(context), getPixelDensity(context));
    }

    @UiThread
    public synchronized void updateLayoutSpecs(int i11, int i12, int i13, int i14) {
        this.mSurfaceHandler.setLayoutConstraints(i11, i12, i13, i14, doRTLSwap(this.mContext), isRTL(this.mContext), getPixelDensity(this.mContext));
    }

    public static ReactSurfaceImpl createWithView(Context context, String str, Bundle bundle) {
        ReactSurfaceImpl reactSurfaceImpl = new ReactSurfaceImpl(context, str, bundle);
        reactSurfaceImpl.attachView(new ReactSurfaceView(context, reactSurfaceImpl));
        return reactSurfaceImpl;
    }

    public void attach(ReactHost reactHost) {
        boolean z11 = reactHost instanceof ReactHostImpl;
        if (z11 && !C1454t.m2255a(this.mReactHost, null, (ReactHostImpl) reactHost)) {
            throw new IllegalStateException("This surface is already attached to a host!");
        }
        if (!z11) {
            throw new IllegalArgumentException("ReactSurfaceImpl.attach can only attach to ReactHostImpl.");
        }
    }

    public void attachView(ReactSurfaceView reactSurfaceView) {
        if (!C1454t.m2255a(this.mSurfaceView, null, reactSurfaceView)) {
            throw new IllegalStateException("Trying to call ReactSurface.attachView(), but the view is already attached.");
        }
        this.mContext = reactSurfaceView.getContext();
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public void clear() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.runtime.a1
            @Override // java.lang.Runnable
            public final void run() {
                this.f9824b.lambda$clear$0();
            }
        });
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public void detach() {
        this.mReactHost.set(null);
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public Context getContext() {
        return this.mContext;
    }

    public EventDispatcher getEventDispatcher() {
        ReactHostImpl reactHostImpl = this.mReactHost.get();
        if (reactHostImpl == null) {
            return null;
        }
        return reactHostImpl.getEventDispatcher();
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public String getModuleName() {
        return this.mSurfaceHandler.getModuleName();
    }

    @VisibleForTesting
    public ReactHostImpl getReactHost() {
        return this.mReactHost.get();
    }

    public SurfaceHandler getSurfaceHandler() {
        return this.mSurfaceHandler;
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public int getSurfaceID() {
        return this.mSurfaceHandler.getSurfaceId();
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public ViewGroup getView() {
        return this.mSurfaceView.get();
    }

    @VisibleForTesting
    public boolean isAttached() {
        return this.mReactHost.get() != null;
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public boolean isRunning() {
        return this.mSurfaceHandler.isRunning();
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public TaskInterface<Void> prerender() {
        ReactHostImpl reactHostImpl = this.mReactHost.get();
        return reactHostImpl == null ? Task.forError(new IllegalStateException("Trying to call ReactSurface.prerender(), but no ReactHost is attached.")) : reactHostImpl.prerenderSurface(this);
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public TaskInterface<Void> start() {
        if (this.mSurfaceView.get() == null) {
            return Task.forError(new IllegalStateException("Trying to call ReactSurface.start(), but view is not created."));
        }
        ReactHostImpl reactHostImpl = this.mReactHost.get();
        return reactHostImpl == null ? Task.forError(new IllegalStateException("Trying to call ReactSurface.start(), but no ReactHost is attached.")) : reactHostImpl.startSurface(this);
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public TaskInterface<Void> stop() {
        ReactHostImpl reactHostImpl = this.mReactHost.get();
        return reactHostImpl == null ? Task.forError(new IllegalStateException("Trying to call ReactSurface.stop(), but no ReactHost is attached.")) : reactHostImpl.stopSurface(this);
    }

    public void updateInitProps(Bundle bundle) {
        this.mSurfaceHandler.setProps((NativeMap) Arguments.fromBundle(bundle));
    }

    private static boolean doRTLSwap(Context context) {
        return I18nUtil.getInstance().doLeftAndRightSwapInRTL(context);
    }

    private static float getPixelDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    private static boolean isRTL(Context context) {
        return I18nUtil.getInstance().isRTL(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clear$0() {
        ReactSurfaceView reactSurfaceView = (ReactSurfaceView) getView();
        if (reactSurfaceView != null) {
            reactSurfaceView.removeAllViews();
            reactSurfaceView.setId(-1);
        }
    }

    @VisibleForTesting
    public ReactSurfaceImpl(SurfaceHandler surfaceHandler, Context context) {
        this.mSurfaceView = new AtomicReference<>(null);
        this.mReactHost = new AtomicReference<>(null);
        this.mSurfaceHandler = surfaceHandler;
        this.mContext = context;
    }
}
