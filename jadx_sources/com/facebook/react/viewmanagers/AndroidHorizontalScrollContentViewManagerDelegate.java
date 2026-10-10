package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.viewmanagers.AndroidHorizontalScrollContentViewManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class AndroidHorizontalScrollContentViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & AndroidHorizontalScrollContentViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public AndroidHorizontalScrollContentViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        boolean zBooleanValue;
        str.getClass();
        if (!str.equals(ReactClippingViewGroupHelper.PROP_REMOVE_CLIPPED_SUBVIEWS)) {
            super.setProperty(t11, str, obj);
            return;
        }
        AndroidHorizontalScrollContentViewManagerInterface androidHorizontalScrollContentViewManagerInterface = (AndroidHorizontalScrollContentViewManagerInterface) this.mViewManager;
        if (obj == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = ((Boolean) obj).booleanValue();
        }
        androidHorizontalScrollContentViewManagerInterface.setRemoveClippedSubviews(t11, zBooleanValue);
    }
}
