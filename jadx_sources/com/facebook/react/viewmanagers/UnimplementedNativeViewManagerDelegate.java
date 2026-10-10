package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.UnimplementedNativeViewManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class UnimplementedNativeViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & UnimplementedNativeViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public UnimplementedNativeViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        String str2;
        str.getClass();
        if (!str.equals("name")) {
            super.setProperty(t11, str, obj);
            return;
        }
        UnimplementedNativeViewManagerInterface unimplementedNativeViewManagerInterface = (UnimplementedNativeViewManagerInterface) this.mViewManager;
        if (obj == null) {
            str2 = "";
        } else {
            str2 = (String) obj;
        }
        unimplementedNativeViewManagerInterface.setName(t11, str2);
    }
}
