package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNCSafeAreaViewManagerInterface;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SafeAreaViewManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0014J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0017J\u001a\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0017J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016¨\u0006 "}, m90084d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "Lcom/facebook/react/viewmanagers/RNCSafeAreaViewManagerInterface;", "Lcom/th3rdwave/safeareacontext/SafeAreaView;", "<init>", "()V", "getName", "", "getDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Lcom/facebook/react/views/view/ReactViewGroup;", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "createShadowNodeInstance", "Lcom/th3rdwave/safeareacontext/SafeAreaViewShadowNode;", "getShadowNodeClass", "Ljava/lang/Class;", "setMode", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "mode", "setEdges", "propList", "Lcom/facebook/react/bridge/ReadableMap;", "updateState", "", "props", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "Companion", "react-native-safe-area-context_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@ReactModule(name = SafeAreaViewManager.REACT_CLASS)
@SourceDebugExtension({"SMAP\nSafeAreaViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeAreaViewManager.kt\ncom/th3rdwave/safeareacontext/SafeAreaViewManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
public final class SafeAreaViewManager extends ReactViewManager implements RNCSafeAreaViewManagerInterface<SafeAreaView> {

    @NotNull
    public static final String REACT_CLASS = "RNCSafeAreaView";

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public ViewManagerDelegate<ReactViewGroup> getDelegate() {
        return null;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Class<SafeAreaViewShadowNode> getShadowNodeClass() {
        return SafeAreaViewShadowNode.class;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    @Override // com.facebook.react.viewmanagers.RNCSafeAreaViewManagerInterface
    @ReactProp(name = "edges")
    public void setEdges(@NotNull SafeAreaView view, @Nullable ReadableMap propList) {
        SafeAreaViewEdgeModes safeAreaViewEdgeModesValueOf;
        SafeAreaViewEdgeModes safeAreaViewEdgeModesValueOf2;
        SafeAreaViewEdgeModes safeAreaViewEdgeModesValueOf3;
        SafeAreaViewEdgeModes safeAreaViewEdgeModesValueOf4;
        Intrinsics.checkNotNullParameter(view, "view");
        if (propList != null) {
            String string = propList.getString(ViewProps.TOP);
            if (string != null) {
                String upperCase = string.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                safeAreaViewEdgeModesValueOf = SafeAreaViewEdgeModes.valueOf(upperCase);
                if (safeAreaViewEdgeModesValueOf == null) {
                    safeAreaViewEdgeModesValueOf = SafeAreaViewEdgeModes.OFF;
                }
            } else {
                safeAreaViewEdgeModesValueOf = SafeAreaViewEdgeModes.OFF;
            }
            String string2 = propList.getString("right");
            if (string2 != null) {
                String upperCase2 = string2.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                safeAreaViewEdgeModesValueOf2 = SafeAreaViewEdgeModes.valueOf(upperCase2);
                if (safeAreaViewEdgeModesValueOf2 == null) {
                    safeAreaViewEdgeModesValueOf2 = SafeAreaViewEdgeModes.OFF;
                }
            } else {
                safeAreaViewEdgeModesValueOf2 = SafeAreaViewEdgeModes.OFF;
            }
            String string3 = propList.getString(ViewProps.BOTTOM);
            if (string3 != null) {
                String upperCase3 = string3.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                safeAreaViewEdgeModesValueOf3 = SafeAreaViewEdgeModes.valueOf(upperCase3);
                if (safeAreaViewEdgeModesValueOf3 == null) {
                    safeAreaViewEdgeModesValueOf3 = SafeAreaViewEdgeModes.OFF;
                }
            } else {
                safeAreaViewEdgeModesValueOf3 = SafeAreaViewEdgeModes.OFF;
            }
            String string4 = propList.getString("left");
            if (string4 != null) {
                String upperCase4 = string4.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                safeAreaViewEdgeModesValueOf4 = SafeAreaViewEdgeModes.valueOf(upperCase4);
                if (safeAreaViewEdgeModesValueOf4 == null) {
                    safeAreaViewEdgeModesValueOf4 = SafeAreaViewEdgeModes.OFF;
                }
            } else {
                safeAreaViewEdgeModesValueOf4 = SafeAreaViewEdgeModes.OFF;
            }
            view.setEdges(new SafeAreaViewEdges(safeAreaViewEdgeModesValueOf, safeAreaViewEdgeModesValueOf2, safeAreaViewEdgeModesValueOf3, safeAreaViewEdgeModesValueOf4));
        }
    }

    @Override // com.facebook.react.viewmanagers.RNCSafeAreaViewManagerInterface
    @ReactProp(name = "mode")
    public void setMode(@NotNull SafeAreaView view, @Nullable String mode) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Intrinsics.areEqual(mode, ViewProps.PADDING)) {
            view.setMode(SafeAreaViewMode.PADDING);
        } else if (Intrinsics.areEqual(mode, ViewProps.MARGIN)) {
            view.setMode(SafeAreaViewMode.MARGIN);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Object updateState(@NotNull ReactViewGroup view, @Nullable ReactStylesDiffMap props, @Nullable StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((SafeAreaView) view).setStateWrapper(stateWrapper);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public SafeAreaViewShadowNode createShadowNodeInstance() {
        return new SafeAreaViewShadowNode();
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public SafeAreaView createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new SafeAreaView(context);
    }
}
