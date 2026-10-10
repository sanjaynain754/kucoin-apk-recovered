package com.swmansion.rnscreens;

import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.events.ScreenTransitionProgressEvent;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p633t6.InterfaceC44695a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScreensModule.kt */
/* JADX INFO: loaded from: classes59.dex */
@ReactModule(name = "RNSModule")
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0082 J\u0011\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0082 J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0017\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0003J\u001f\u0010\u001d\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001e\u001a\u00020\u001fH\u0003¢\u0006\u0002\u0010 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/swmansion/rnscreens/ScreensModule;", "Lcom/swmansion/rnscreens/NativeScreensModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "topScreenId", "", "installedJsiPtr", "", "isActiveTransition", "Ljava/util/concurrent/atomic/AtomicBoolean;", "proxy", "Lcom/swmansion/rnscreens/NativeProxy;", "nativeInstall", "", "jsiPtr", "nativeUninstall", "invalidate", "initialize", "getName", "", "startTransition", "", "reactTag", "(Ljava/lang/Integer;)[I", "updateTransition", "progress", "", "finishTransition", "canceled", "", "(Ljava/lang/Integer;Z)V", "Companion", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ScreensModule extends NativeScreensModuleSpec {

    @NotNull
    public static final String NAME = "RNSModule";
    private long installedJsiPtr;

    @NotNull
    private final AtomicBoolean isActiveTransition;

    @Nullable
    private NativeProxy proxy;

    @NotNull
    private final ReactApplicationContext reactContext;
    private int topScreenId;

    private final native void nativeInstall(long jsiPtr);

    private final native void nativeUninstall(long jsiPtr);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreensModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.topScreenId = -1;
        this.isActiveTransition = new AtomicBoolean(false);
        try {
            System.loadLibrary("rnscreens");
            JavaScriptContextHolder javaScriptContextHolder = getReactApplicationContext().getJavaScriptContextHolder();
            if (javaScriptContextHolder == null) {
                Log.e("[RNScreens]", "Could not install JSI bindings.");
                return;
            }
            long j11 = javaScriptContextHolder.get();
            if (j11 != 0) {
                nativeInstall(j11);
                this.installedJsiPtr = j11;
            }
        } catch (UnsatisfiedLinkError unused) {
            Log.w("[RNScreens]", "Could not load RNScreens module.");
        }
    }

    @Override // com.swmansion.rnscreens.NativeScreensModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "RNSModule";
    }

    @InterfaceC44695a
    private final void finishTransition(Integer reactTag, boolean canceled) {
        View viewResolveView;
        UiThreadUtil.assertOnUiThread();
        if (this.isActiveTransition.get() && reactTag != null) {
            UIManager uIManagerForReactTag = UIManagerHelper.getUIManagerForReactTag(this.reactContext, reactTag.intValue());
            if (uIManagerForReactTag != null) {
                viewResolveView = uIManagerForReactTag.resolveView(reactTag.intValue());
            } else {
                viewResolveView = null;
            }
            if (viewResolveView instanceof ScreenStack) {
                if (canceled) {
                    ((ScreenStack) viewResolveView).detachBelowTop();
                } else {
                    ((ScreenStack) viewResolveView).notifyTopDetached();
                }
                this.isActiveTransition.set(false);
            }
            this.topScreenId = -1;
            return;
        }
        Log.e("[RNScreens]", "Unable to call `finishTransition` method before transition start.");
    }

    @InterfaceC44695a
    private final int[] startTransition(Integer reactTag) {
        View viewResolveView;
        ScreenStack screenStack;
        ArrayList<ScreenStackFragmentWrapper> fragments;
        int size;
        UiThreadUtil.assertOnUiThread();
        if (!this.isActiveTransition.get() && reactTag != null) {
            this.topScreenId = -1;
            int[] iArr = {-1, -1};
            UIManager uIManagerForReactTag = UIManagerHelper.getUIManagerForReactTag(this.reactContext, reactTag.intValue());
            if (uIManagerForReactTag != null) {
                viewResolveView = uIManagerForReactTag.resolveView(reactTag.intValue());
            } else {
                viewResolveView = null;
            }
            if ((viewResolveView instanceof ScreenStack) && (size = (fragments = (screenStack = (ScreenStack) viewResolveView).getFragments()).size()) > 1) {
                this.isActiveTransition.set(true);
                screenStack.attachBelowTop();
                int id2 = fragments.get(size - 1).getScreen().getId();
                this.topScreenId = id2;
                iArr[0] = id2;
                iArr[1] = fragments.get(size - 2).getScreen().getId();
            }
            return iArr;
        }
        return new int[]{-1, -1};
    }

    @InterfaceC44695a
    private final void updateTransition(double progress) {
        UiThreadUtil.assertOnUiThread();
        if (this.topScreenId != -1) {
            float f11 = (float) progress;
            short coalescingKey = ScreenFragment.INSTANCE.getCoalescingKey(f11);
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.reactContext, this.topScreenId);
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(new ScreenTransitionProgressEvent(UIManagerHelper.getSurfaceId(this.reactContext), this.topScreenId, f11, true, true, coalescingKey));
            }
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        FabricUIManager fabricUIManager;
        super.initialize();
        if (!getReactApplicationContext().hasActiveReactInstance()) {
            Log.w("[RNScreens]", "initialize: skipped — no active React instance (instance already destroyed)");
            return;
        }
        UIManager uIManager = UIManagerHelper.getUIManager(this.reactContext, 2);
        if (uIManager instanceof FabricUIManager) {
            fabricUIManager = (FabricUIManager) uIManager;
        } else {
            fabricUIManager = null;
        }
        if (fabricUIManager == null) {
            Log.w("[RNScreens]", "initialize: skipped — FabricUIManager is null or not ready");
            return;
        }
        NativeProxy nativeProxy = new NativeProxy();
        nativeProxy.nativeAddMutationsListener(fabricUIManager);
        this.proxy = nativeProxy;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        long j11 = this.installedJsiPtr;
        if (j11 != 0) {
            nativeUninstall(j11);
            this.installedJsiPtr = 0L;
        }
    }
}
