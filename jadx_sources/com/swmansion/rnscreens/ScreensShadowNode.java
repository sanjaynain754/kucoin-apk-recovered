package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.NativeViewHierarchyOptimizer;
import com.facebook.react.uimanager.UIBlock;
import com.facebook.react.uimanager.UIManagerModule;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScreensShadowNode.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/swmansion/rnscreens/ScreensShadowNode;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "context", "Lcom/facebook/react/bridge/ReactContext;", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "onBeforeLayout", "", "nativeViewHierarchyOptimizer", "Lcom/facebook/react/uimanager/NativeViewHierarchyOptimizer;", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ScreensShadowNode extends LayoutShadowNode {

    @NotNull
    private ReactContext context;

    public ScreensShadowNode(@NotNull ReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBeforeLayout$lambda$0(ScreensShadowNode screensShadowNode, NativeViewHierarchyManager nativeViewHierarchyManager) {
        if (nativeViewHierarchyManager == null) {
            return;
        }
        View viewResolveView = nativeViewHierarchyManager.resolveView(screensShadowNode.getReactTag());
        if (viewResolveView instanceof ScreenContainer) {
            ((ScreenContainer) viewResolveView).performUpdates();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void onBeforeLayout(@NotNull NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        Intrinsics.checkNotNullParameter(nativeViewHierarchyOptimizer, "nativeViewHierarchyOptimizer");
        super.onBeforeLayout(nativeViewHierarchyOptimizer);
        UIManagerModule uIManagerModule = (UIManagerModule) this.context.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.addUIBlock(new UIBlock() { // from class: com.swmansion.rnscreens.b0
                @Override // com.facebook.react.uimanager.UIBlock
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    ScreensShadowNode.onBeforeLayout$lambda$0(this.f68430a, nativeViewHierarchyManager);
                }
            });
        }
    }
}
