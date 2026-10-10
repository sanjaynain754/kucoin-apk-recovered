package com.swmansion.rnscreens;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderSubviewManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderSubviewManagerInterface;
import com.jumio.core.constants.ConstantsKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScreenStackHeaderSubviewManager.kt */
/* JADX INFO: loaded from: classes59.dex */
@ReactModule(name = ScreenStackHeaderSubviewManager.REACT_CLASS)
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0018B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0017J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0014R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/ScreenStackHeaderSubview;", "Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderSubviewManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getName", "", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "setType", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "type", "updateState", "", "props", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "getDelegate", "Companion", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ScreenStackHeaderSubviewManager extends ViewGroupManager<ScreenStackHeaderSubview> implements RNSScreenStackHeaderSubviewManagerInterface<ScreenStackHeaderSubview> {

    @NotNull
    public static final String REACT_CLASS = "RNSScreenStackHeaderSubview";

    @NotNull
    private final ViewManagerDelegate<ScreenStackHeaderSubview> delegate = new RNSScreenStackHeaderSubviewManagerDelegate(this);

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ScreenStackHeaderSubview createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ScreenStackHeaderSubview(context);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<ScreenStackHeaderSubview> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderSubviewManagerInterface
    @ReactProp(name = "type")
    public void setType(@NotNull ScreenStackHeaderSubview view, @Nullable String type) {
        ScreenStackHeaderSubview.Type type2;
        Intrinsics.checkNotNullParameter(view, "view");
        if (type != null) {
            switch (type.hashCode()) {
                case -1364013995:
                    if (type.equals(TtmlNode.CENTER)) {
                        type2 = ScreenStackHeaderSubview.Type.CENTER;
                        view.setType(type2);
                        return;
                    }
                    break;
                case 3015911:
                    if (type.equals(ConstantsKt.FACE_CAPTURE_MODE_BACK)) {
                        type2 = ScreenStackHeaderSubview.Type.BACK;
                        view.setType(type2);
                        return;
                    }
                    break;
                case 3317767:
                    if (type.equals("left")) {
                        type2 = ScreenStackHeaderSubview.Type.LEFT;
                        view.setType(type2);
                        return;
                    }
                    break;
                case 108511772:
                    if (type.equals("right")) {
                        type2 = ScreenStackHeaderSubview.Type.RIGHT;
                        view.setType(type2);
                        return;
                    }
                    break;
                case 1778179403:
                    if (type.equals("searchBar")) {
                        type2 = ScreenStackHeaderSubview.Type.SEARCH_BAR;
                        view.setType(type2);
                        return;
                    }
                    break;
            }
        }
        throw new JSApplicationIllegalArgumentException("Unknown type " + type);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Object updateState(@NotNull ScreenStackHeaderSubview view, @Nullable ReactStylesDiffMap props, @Nullable StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStateWrapper(stateWrapper);
        return super.updateState(view, props, stateWrapper);
    }
}
