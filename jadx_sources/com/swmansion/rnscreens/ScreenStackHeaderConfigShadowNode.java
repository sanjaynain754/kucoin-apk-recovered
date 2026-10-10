package com.swmansion.rnscreens;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.swmansion.rnscreens.utils.PaddingBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScreenStackHeaderConfigShadowNode.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderConfigShadowNode;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "context", "Lcom/facebook/react/bridge/ReactContext;", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", ViewProps.PADDING_START, "", "getPaddingStart", "()F", "setPaddingStart", "(F)V", ViewProps.PADDING_END, "getPaddingEnd", "setPaddingEnd", "height", "getHeight", "setHeight", "setLocalData", "", "data", "", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ScreenStackHeaderConfigShadowNode extends LayoutShadowNode {

    @NotNull
    private ReactContext context;
    private float height;
    private float paddingEnd;
    private float paddingStart;

    public ScreenStackHeaderConfigShadowNode(@NotNull ReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getPaddingEnd() {
        return this.paddingEnd;
    }

    public final float getPaddingStart() {
        return this.paddingStart;
    }

    public final void setHeight(float f11) {
        this.height = f11;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setLocalData(@Nullable Object data) {
        if (!(data instanceof PaddingBundle)) {
            super.setLocalData(data);
            return;
        }
        PaddingBundle paddingBundle = (PaddingBundle) data;
        this.paddingStart = paddingBundle.getPaddingStart();
        this.paddingEnd = paddingBundle.getPaddingEnd();
        this.height = paddingBundle.getHeight();
        setPadding(4, this.paddingStart);
        setPadding(5, this.paddingEnd);
        setPosition(1, -this.height);
    }

    public final void setPaddingEnd(float f11) {
        this.paddingEnd = f11;
    }

    public final void setPaddingStart(float f11) {
        this.paddingStart = f11;
    }
}
