package com.kubi.homern.widgets.homeeditorautoscroll;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCHomeEditorAutoScrollCoordinatorManager.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0014J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0010H\u0007J\u001a\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0014H\u0007J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0014H\u0007J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0014H\u0007J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0014H\u0007¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/homern/widgets/homeeditorautoscroll/KCHomeEditorAutoScrollCoordinatorManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/kubi/homern/widgets/homeeditorautoscroll/KCHomeEditorAutoScrollCoordinatorView;", "<init>", "()V", "getName", "", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "setEnabled", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "value", "", "setBindingVersion", "", "setScrollViewNativeID", "setDragViewNativeID", "setTopEdgeActivationDistance", "", "setBottomEdgeActivationDistance", "setBottomOcclusionHeight", "setMaximumScrollSpeed", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCHomeEditorAutoScrollCoordinatorManager extends SimpleViewManager<KCHomeEditorAutoScrollCoordinatorView> {

    @NotNull
    public static final String NAME = "KCHomeEditorAutoScrollCoordinator";

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public KCHomeEditorAutoScrollCoordinatorView createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new KCHomeEditorAutoScrollCoordinatorView(context);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @ReactProp(defaultInt = 0, name = "bindingVersion")
    public final void setBindingVersion(@NotNull KCHomeEditorAutoScrollCoordinatorView view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBindingVersion(value);
    }

    @ReactProp(defaultFloat = 24.0f, name = "bottomEdgeActivationDistance")
    public final void setBottomEdgeActivationDistance(@NotNull KCHomeEditorAutoScrollCoordinatorView view, float value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBottomEdgeActivationDistanceDp(value);
    }

    @ReactProp(defaultFloat = 100.0f, name = "bottomOcclusionHeight")
    public final void setBottomOcclusionHeight(@NotNull KCHomeEditorAutoScrollCoordinatorView view, float value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBottomOcclusionHeightDp(value);
    }

    @ReactProp(name = "dragViewNativeID")
    public final void setDragViewNativeID(@NotNull KCHomeEditorAutoScrollCoordinatorView view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value == null) {
            value = "";
        }
        view.setDragViewNativeID(value);
    }

    @ReactProp(defaultBoolean = false, name = "enabled")
    public final void setEnabled(@NotNull KCHomeEditorAutoScrollCoordinatorView view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setCoordinatorEnabled(value);
    }

    @ReactProp(defaultFloat = 600.0f, name = "maximumScrollSpeed")
    public final void setMaximumScrollSpeed(@NotNull KCHomeEditorAutoScrollCoordinatorView view, float value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setMaximumScrollSpeedDp(value);
    }

    @ReactProp(name = "scrollViewNativeID")
    public final void setScrollViewNativeID(@NotNull KCHomeEditorAutoScrollCoordinatorView view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value == null) {
            value = "";
        }
        view.setScrollViewNativeID(value);
    }

    @ReactProp(defaultFloat = 0.0f, name = "topEdgeActivationDistance")
    public final void setTopEdgeActivationDistance(@NotNull KCHomeEditorAutoScrollCoordinatorView view, float value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTopEdgeActivationDistanceDp(value);
    }
}
