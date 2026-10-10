package com.swmansion.rnscreens;

import android.view.ViewGroup;
import androidx.annotation.UiThread;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.StateWrapper;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: FabricEnabledViewGroup.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007J \u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0004J \u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0007R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/swmansion/rnscreens/FabricEnabledViewGroup;", "Landroid/view/ViewGroup;", "context", "Lcom/facebook/react/bridge/ReactContext;", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "mStateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "lastWidth", "", "lastHeight", "lastHeaderHeight", "setStateWrapper", "", "wrapper", "updateScreenSizeFabric", "width", "", "height", "headerHeight", "updateState", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public abstract class FabricEnabledViewGroup extends ViewGroup {
    private float lastHeaderHeight;
    private float lastHeight;
    private float lastWidth;

    @Nullable
    private StateWrapper mStateWrapper;

    @UiThread
    public final void updateState(int width, int height, int headerHeight) {
        float dIPFromPixel = PixelUtil.toDIPFromPixel(width);
        float dIPFromPixel2 = PixelUtil.toDIPFromPixel(height);
        float dIPFromPixel3 = PixelUtil.toDIPFromPixel(headerHeight);
        if (Math.abs(this.lastWidth - dIPFromPixel) >= 0.9f || Math.abs(this.lastHeight - dIPFromPixel2) >= 0.9f || Math.abs(this.lastHeaderHeight - dIPFromPixel3) >= 0.9f) {
            this.lastWidth = dIPFromPixel;
            this.lastHeight = dIPFromPixel2;
            this.lastHeaderHeight = dIPFromPixel3;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble(TUIConstants.TUIBeauty.PARAM_NAME_FRAME_WIDTH, dIPFromPixel);
            writableNativeMap.putDouble(TUIConstants.TUIBeauty.PARAM_NAME_FRAME_HEIGHT, dIPFromPixel2);
            writableNativeMap.putDouble("contentOffsetX", 0.0d);
            writableNativeMap.putDouble("contentOffsetY", dIPFromPixel3);
            StateWrapper stateWrapper = this.mStateWrapper;
            if (stateWrapper != null) {
                stateWrapper.updateState(writableNativeMap);
            }
        }
    }

    public final void setStateWrapper(@Nullable StateWrapper wrapper) {
        this.mStateWrapper = wrapper;
    }

    public FabricEnabledViewGroup(@Nullable ReactContext reactContext) {
        super(reactContext);
    }

    public final void updateScreenSizeFabric(int width, int height, int headerHeight) {
        updateState(width, height, headerHeight);
    }
}
