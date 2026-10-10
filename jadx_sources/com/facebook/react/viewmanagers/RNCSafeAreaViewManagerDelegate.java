package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNCSafeAreaViewManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class RNCSafeAreaViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNCSafeAreaViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNCSafeAreaViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        if (!str.equals("mode")) {
            if (!str.equals("edges")) {
                super.setProperty(t11, str, obj);
                return;
            } else {
                ((RNCSafeAreaViewManagerInterface) this.mViewManager).setEdges(t11, (ReadableMap) obj);
                return;
            }
        }
        ((RNCSafeAreaViewManagerInterface) this.mViewManager).setMode(t11, (String) obj);
    }
}
