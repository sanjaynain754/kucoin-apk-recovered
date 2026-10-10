package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.DebuggingOverlayManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class DebuggingOverlayManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & DebuggingOverlayManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public DebuggingOverlayManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void receiveCommand(T t11, String str, @Nullable ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "clearElementsHighlights":
                ((DebuggingOverlayManagerInterface) this.mViewManager).clearElementsHighlights(t11);
                break;
            case "highlightTraceUpdates":
                ((DebuggingOverlayManagerInterface) this.mViewManager).highlightTraceUpdates(t11, readableArray.getArray(0));
                break;
            case "highlightElements":
                ((DebuggingOverlayManagerInterface) this.mViewManager).highlightElements(t11, readableArray.getArray(0));
                break;
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        super.setProperty(t11, str, obj);
    }
}
