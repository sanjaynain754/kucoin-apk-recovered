package com.facebook.react.runtime;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaJSExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.devsupport.ReactInstanceDevHelper;
import com.facebook.react.interfaces.TaskInterface;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.runtime.internal.bolts.Task;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReactHostImplDevHelper.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/facebook/react/runtime/ReactHostImplDevHelper;", "Lcom/facebook/react/devsupport/ReactInstanceDevHelper;", "delegate", "Lcom/facebook/react/runtime/ReactHostImpl;", "<init>", "(Lcom/facebook/react/runtime/ReactHostImpl;)V", "onReloadWithJSDebugger", "", "proxyExecutorFactory", "Lcom/facebook/react/bridge/JavaJSExecutor$Factory;", "onJSBundleLoadedFromServer", "toggleElementInspector", "getCurrentActivity", "Landroid/app/Activity;", "getJavaScriptExecutorFactory", "Lcom/facebook/react/bridge/JavaScriptExecutorFactory;", "createRootView", "Landroid/view/View;", "appKey", "", "destroyRootView", "rootView", "reload", CmcdData.Factory.STREAMING_FORMAT_SS, "loadBundle", "Lcom/facebook/react/interfaces/TaskInterface;", "", "bundleLoader", "Lcom/facebook/react/bridge/JSBundleLoader;", "getCurrentReactContext", "Lcom/facebook/react/bridge/ReactContext;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ReactHostImplDevHelper implements ReactInstanceDevHelper {

    @NotNull
    private final ReactHostImpl delegate;

    public ReactHostImplDevHelper(@NotNull ReactHostImpl delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
    @Nullable
    public View createRootView(@NotNull String appKey) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || this.delegate.isSurfaceWithModuleNameAttached(appKey)) {
            return null;
        }
        ReactSurfaceImpl reactSurfaceImplCreateWithView = ReactSurfaceImpl.createWithView(currentActivity, appKey, new Bundle());
        Intrinsics.checkNotNullExpressionValue(reactSurfaceImplCreateWithView, "createWithView(...)");
        reactSurfaceImplCreateWithView.attach(this.delegate);
        reactSurfaceImplCreateWithView.start();
        return reactSurfaceImplCreateWithView.getView();
    }

    @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
    @Nullable
    public Activity getCurrentActivity() {
        return this.delegate.getLastUsedActivity();
    }

    @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
    @Nullable
    public ReactContext getCurrentReactContext() {
        return this.delegate.getCurrentReactContext();
    }

    @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
    @NotNull
    public JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        throw new IllegalStateException("Not implemented for bridgeless mode");
    }

    @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
    @NotNull
    public TaskInterface<Boolean> loadBundle(@NotNull JSBundleLoader bundleLoader) {
        Intrinsics.checkNotNullParameter(bundleLoader, "bundleLoader");
        Task<Boolean> taskLoadBundle = this.delegate.loadBundle(bundleLoader);
        Intrinsics.checkNotNullExpressionValue(taskLoadBundle, "loadBundle(...)");
        return taskLoadBundle;
    }

    @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
    public void toggleElementInspector() {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        ReactContext currentReactContext = this.delegate.getCurrentReactContext();
        if (currentReactContext == null || (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) currentReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) == null) {
            return;
        }
        rCTDeviceEventEmitter.emit("toggleElementInspector", null);
    }

    @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
    public void destroyRootView(@NotNull View rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
    }

    @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
    public void onReloadWithJSDebugger(@NotNull JavaJSExecutor.Factory proxyExecutorFactory) {
        Intrinsics.checkNotNullParameter(proxyExecutorFactory, "proxyExecutorFactory");
    }

    @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
    public void reload(@NotNull String s11) {
        Intrinsics.checkNotNullParameter(s11, "s");
        this.delegate.reload(s11);
    }

    @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
    public void onJSBundleLoadedFromServer() {
    }
}
