package com.swmansion.reanimated;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.UIManagerHelper;

/* JADX INFO: loaded from: classes59.dex */
class ReaCompatibility {
    private FabricUIManager fabricUIManager;

    public void registerFabricEventListener(NodesManager nodesManager) {
        FabricUIManager fabricUIManager = this.fabricUIManager;
        if (fabricUIManager != null) {
            fabricUIManager.getEventDispatcher().addListener(nodesManager);
        }
    }

    public void unregisterFabricEventListener(NodesManager nodesManager) {
        FabricUIManager fabricUIManager = this.fabricUIManager;
        if (fabricUIManager != null) {
            fabricUIManager.getEventDispatcher().removeListener(nodesManager);
        }
    }

    public ReaCompatibility(ReactApplicationContext reactApplicationContext) {
        this.fabricUIManager = (FabricUIManager) UIManagerHelper.getUIManager(reactApplicationContext, 2);
    }
}
