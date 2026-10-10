package com.kubi.p110rn.core;

import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.ReactContext;
import com.kubi.sdk.pkg.bundle.LoadBundleConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReactInstanceHelper.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/rn/core/SplitBundleLoader;", "", "instanceManager", "Lcom/facebook/react/ReactInstanceManager;", "loaderType", "", "loadBundleConfig", "Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;", "exceptionHandler", "Lcom/kubi/rn/core/EngineExceptionHandler;", "<init>", "(Lcom/facebook/react/ReactInstanceManager;ILcom/kubi/sdk/pkg/bundle/LoadBundleConfig;Lcom/kubi/rn/core/EngineExceptionHandler;)V", "getInstanceManager", "()Lcom/facebook/react/ReactInstanceManager;", "getLoaderType", "()I", "getLoadBundleConfig", "()Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;", "getExceptionHandler", "()Lcom/kubi/rn/core/EngineExceptionHandler;", "loadSplitBundle", "", "fcpTracker", "Lcom/kubi/rn/core/KrnFcpTracker;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SplitBundleLoader {

    @Nullable
    private final EngineExceptionHandler exceptionHandler;

    @NotNull
    private final ReactInstanceManager instanceManager;

    @NotNull
    private final LoadBundleConfig loadBundleConfig;
    private final int loaderType;

    public SplitBundleLoader(@NotNull ReactInstanceManager instanceManager, int i11, @NotNull LoadBundleConfig loadBundleConfig, @Nullable EngineExceptionHandler engineExceptionHandler) {
        Intrinsics.checkNotNullParameter(instanceManager, "instanceManager");
        Intrinsics.checkNotNullParameter(loadBundleConfig, "loadBundleConfig");
        this.instanceManager = instanceManager;
        this.loaderType = i11;
        this.loadBundleConfig = loadBundleConfig;
        this.exceptionHandler = engineExceptionHandler;
    }

    public static /* synthetic */ void loadSplitBundle$default(SplitBundleLoader splitBundleLoader, KrnFcpTracker krnFcpTracker, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            krnFcpTracker = null;
        }
        splitBundleLoader.loadSplitBundle(krnFcpTracker);
    }

    @Nullable
    public final EngineExceptionHandler getExceptionHandler() {
        return this.exceptionHandler;
    }

    @NotNull
    public final ReactInstanceManager getInstanceManager() {
        return this.instanceManager;
    }

    @NotNull
    public final LoadBundleConfig getLoadBundleConfig() {
        return this.loadBundleConfig;
    }

    public final int getLoaderType() {
        return this.loaderType;
    }

    public final void loadSplitBundle(@Nullable final KrnFcpTracker fcpTracker) {
        ReactContext currentReactContext;
        String childBundleFilePath = this.loadBundleConfig.getChildBundleFilePath();
        if (childBundleFilePath == null || (currentReactContext = this.instanceManager.getCurrentReactContext()) == null) {
            return;
        }
        if (fcpTracker != null) {
            fcpTracker.setLoadBizBundleStart(System.currentTimeMillis());
        }
        currentReactContext.getCatalystInstance().loadScriptFromFile(childBundleFilePath, childBundleFilePath, false);
        currentReactContext.runOnJSQueueThread(new Runnable() { // from class: com.kubi.rn.core.g0
            @Override // java.lang.Runnable
            public final void run() {
                SplitBundleLoader.loadSplitBundle$lambda$1(fcpTracker);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadSplitBundle$lambda$1(KrnFcpTracker krnFcpTracker) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (krnFcpTracker != null) {
            krnFcpTracker.setLoadBizBundleEnd(jCurrentTimeMillis);
            krnFcpTracker.setPageRenderStart(jCurrentTimeMillis);
        }
    }

    public /* synthetic */ SplitBundleLoader(ReactInstanceManager reactInstanceManager, int i11, LoadBundleConfig loadBundleConfig, EngineExceptionHandler engineExceptionHandler, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactInstanceManager, i11, loadBundleConfig, (i12 & 8) != 0 ? null : engineExceptionHandler);
    }
}
