package com.swmansion.reanimated;

import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.interop.UIBlock;
import com.facebook.react.fabric.interop.UIBlockViewResolver;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.UIManagerModuleListener;
import com.swmansion.worklets.WorkletsModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes59.dex */
@ReactModule(name = NativeReanimatedModuleSpec.NAME)
public class ReanimatedModule extends NativeReanimatedModuleSpec implements LifecycleEventListener, UIManagerModuleListener, UIManagerListener {
    private NodesManager mNodesManager;
    private ArrayList<UIThreadOperation> mOperations;
    private Runnable mUnsubscribe;
    private final WorkletsModule mWorkletsModule;

    public interface UIThreadOperation {
        void execute(NodesManager nodesManager);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        final ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        final UIManager fabricUIManager = reactApplicationContext.getFabricUIManager();
        if (!(fabricUIManager instanceof FabricUIManager)) {
            throw new RuntimeException("[Reanimated] Failed to obtain instance of FabricUIManager.");
        }
        ((FabricUIManager) fabricUIManager).addUIManagerEventListener(this);
        this.mUnsubscribe = Utils.combineRunnables(this.mUnsubscribe, new Runnable() { // from class: com.swmansion.reanimated.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f68405b.lambda$initialize$2(fabricUIManager);
            }
        });
        reactApplicationContext.addLifecycleEventListener(this);
        this.mUnsubscribe = Utils.combineRunnables(this.mUnsubscribe, new Runnable() { // from class: com.swmansion.reanimated.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f68407b.lambda$initialize$4(reactApplicationContext);
            }
        });
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(@NonNull UIManager uIManager) {
        if (this.mOperations.isEmpty()) {
            return;
        }
        final ArrayList<UIThreadOperation> arrayList = this.mOperations;
        this.mOperations = new ArrayList<>();
        if (!(uIManager instanceof FabricUIManager)) {
            throw new RuntimeException("[Reanimated] Failed to obtain instance of FabricUIManager.");
        }
        ((FabricUIManager) uIManager).addUIBlock(new UIBlock() { // from class: com.swmansion.reanimated.d
            @Override // com.facebook.react.fabric.interop.UIBlock
            public final void execute(UIBlockViewResolver uIBlockViewResolver) {
                this.f68401a.lambda$willDispatchViewUpdates$0(arrayList, uIBlockViewResolver);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$2(UIManager uIManager) {
        ((FabricUIManager) uIManager).removeUIManagerEventListener(this);
    }

    public NodesManager getNodesManager() {
        if (this.mNodesManager == null) {
            this.mNodesManager = new NodesManager(getReactApplicationContext(), this.mWorkletsModule);
        }
        return this.mNodesManager;
    }

    public WorkletsModule getWorkletsModule() {
        return this.mWorkletsModule;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        NodesManager nodesManager = this.mNodesManager;
        if (nodesManager != null) {
            nodesManager.onHostPause();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        NodesManager nodesManager = this.mNodesManager;
        if (nodesManager != null) {
            nodesManager.onHostResume();
        }
    }

    public ReanimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mOperations = new ArrayList<>();
        this.mUnsubscribe = new Runnable() { // from class: com.swmansion.reanimated.f
            @Override // java.lang.Runnable
            public final void run() {
                ReanimatedModule.m72067d();
            }
        };
        this.mWorkletsModule = (WorkletsModule) reactApplicationContext.getNativeModule(WorkletsModule.class);
    }

    private /* synthetic */ void lambda$initialize$3(UIManagerModule uIManagerModule) {
        uIManagerModule.removeUIManagerListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$4(ReactApplicationContext reactApplicationContext) {
        reactApplicationContext.removeLifecycleEventListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$willDispatchViewUpdates$0(ArrayList arrayList, UIBlockViewResolver uIBlockViewResolver) {
        NodesManager nodesManager = getNodesManager();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((UIThreadOperation) it.next()).execute(nodesManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$willDispatchViewUpdates$5(ArrayList arrayList, NativeViewHierarchyManager nativeViewHierarchyManager) {
        NodesManager nodesManager = getNodesManager();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((UIThreadOperation) it.next()).execute(nodesManager);
        }
    }

    @Override // com.swmansion.reanimated.NativeReanimatedModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean installTurboModule() {
        boolean z11;
        JavaScriptContextHolder javaScriptContextHolder = getReactApplicationContext().getJavaScriptContextHolder();
        Objects.requireNonNull(javaScriptContextHolder);
        if (javaScriptContextHolder.get() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Utils.isChromeDebugger = z11;
        if (!z11) {
            getNodesManager().initWithContext(getReactApplicationContext());
            return true;
        }
        Log.w("[REANIMATED]", "Unable to create Reanimated Native Module. You can ignore this message if you are using Chrome Debugger now.");
        return false;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        NodesManager nodesManager = this.mNodesManager;
        if (nodesManager != null) {
            nodesManager.invalidate();
        }
        this.mUnsubscribe.run();
    }

    @Override // com.facebook.react.uimanager.UIManagerModuleListener
    public void willDispatchViewUpdates(UIManagerModule uIManagerModule) {
        if (this.mOperations.isEmpty()) {
            return;
        }
        final ArrayList<UIThreadOperation> arrayList = this.mOperations;
        this.mOperations = new ArrayList<>();
        uIManagerModule.addUIBlock(new com.facebook.react.uimanager.UIBlock() { // from class: com.swmansion.reanimated.e
            @Override // com.facebook.react.uimanager.UIBlock
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                this.f68403a.lambda$willDispatchViewUpdates$5(arrayList, nativeViewHierarchyManager);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m72067d() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(@NonNull UIManager uIManager) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(@NonNull UIManager uIManager) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(@NonNull UIManager uIManager) {
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(@NonNull UIManager uIManager) {
    }
}
