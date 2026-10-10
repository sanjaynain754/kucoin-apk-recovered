package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.SkiaPictureViewManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class SkiaPictureViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & SkiaPictureViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public SkiaPictureViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        boolean zBooleanValue = false;
        if (!str.equals("opaque")) {
            if (!str.equals("debug")) {
                super.setProperty(t11, str, obj);
                return;
            }
            SkiaPictureViewManagerInterface skiaPictureViewManagerInterface = (SkiaPictureViewManagerInterface) this.mViewManager;
            if (obj != null) {
                zBooleanValue = ((Boolean) obj).booleanValue();
            }
            skiaPictureViewManagerInterface.setDebug(t11, zBooleanValue);
            return;
        }
        SkiaPictureViewManagerInterface skiaPictureViewManagerInterface2 = (SkiaPictureViewManagerInterface) this.mViewManager;
        if (obj != null) {
            zBooleanValue = ((Boolean) obj).booleanValue();
        }
        skiaPictureViewManagerInterface2.setOpaque(t11, zBooleanValue);
    }
}
