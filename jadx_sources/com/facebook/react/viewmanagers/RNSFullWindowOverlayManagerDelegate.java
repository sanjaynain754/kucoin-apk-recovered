package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSFullWindowOverlayManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class RNSFullWindowOverlayManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSFullWindowOverlayManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSFullWindowOverlayManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        boolean zBooleanValue;
        str.getClass();
        if (!str.equals("accessibilityContainerViewIsModal")) {
            super.setProperty(t11, str, obj);
            return;
        }
        RNSFullWindowOverlayManagerInterface rNSFullWindowOverlayManagerInterface = (RNSFullWindowOverlayManagerInterface) this.mViewManager;
        if (obj == null) {
            zBooleanValue = true;
        } else {
            zBooleanValue = ((Boolean) obj).booleanValue();
        }
        rNSFullWindowOverlayManagerInterface.setAccessibilityContainerViewIsModal(t11, zBooleanValue);
    }
}
