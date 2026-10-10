package com.facebook.react.uimanager;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
@Deprecated(forRemoval = true, since = "Deprecated class since v0.73.0, please use com.facebook.react.uimanager.StateWrapper instead.")
public class FabricViewStateManager {
    private static final String TAG = "FabricViewStateManager";

    @Nullable
    private StateWrapper mStateWrapper = null;

    @Deprecated
    public interface HasFabricViewStateManager {
        FabricViewStateManager getFabricViewStateManager();
    }

    @Deprecated
    public interface StateUpdateCallback {
        WritableMap getStateUpdate();
    }

    private void setState(@Nullable StateWrapper stateWrapper, StateUpdateCallback stateUpdateCallback, int i11) {
        WritableMap stateUpdate;
        if (stateWrapper == null) {
            C45999a.m101507m(TAG, "setState called without a StateWrapper");
        } else if (stateWrapper == this.mStateWrapper && i11 <= 60 && (stateUpdate = stateUpdateCallback.getStateUpdate()) != null) {
            stateWrapper.updateState(stateUpdate);
        }
    }

    @Nullable
    @Deprecated
    public ReadableMap getStateData() {
        StateWrapper stateWrapper = this.mStateWrapper;
        if (stateWrapper != null) {
            return stateWrapper.getStateData();
        }
        return null;
    }

    @Deprecated
    public boolean hasStateWrapper() {
        return this.mStateWrapper != null;
    }

    @Deprecated
    public void setStateWrapper(StateWrapper stateWrapper) {
        this.mStateWrapper = stateWrapper;
    }

    @Deprecated
    public void setState(StateUpdateCallback stateUpdateCallback) {
        setState(this.mStateWrapper, stateUpdateCallback, 0);
    }
}
