package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGFilterManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class RNSVGFilterManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGFilterManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGFilterManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        String str2;
        str.getClass();
        switch (str) {
            case "primitiveUnits":
                ((RNSVGFilterManagerInterface) this.mViewManager).setPrimitiveUnits(t11, (String) obj);
                break;
            case "height":
                ((RNSVGFilterManagerInterface) this.mViewManager).setHeight(t11, new DynamicFromObject(obj));
                break;
            case "filterUnits":
                ((RNSVGFilterManagerInterface) this.mViewManager).setFilterUnits(t11, (String) obj);
                break;
            case "x":
                ((RNSVGFilterManagerInterface) this.mViewManager).setX(t11, new DynamicFromObject(obj));
                break;
            case "y":
                ((RNSVGFilterManagerInterface) this.mViewManager).setY(t11, new DynamicFromObject(obj));
                break;
            case "name":
                RNSVGFilterManagerInterface rNSVGFilterManagerInterface = (RNSVGFilterManagerInterface) this.mViewManager;
                if (obj == null) {
                    str2 = null;
                } else {
                    str2 = (String) obj;
                }
                rNSVGFilterManagerInterface.setName(t11, str2);
                break;
            case "width":
                ((RNSVGFilterManagerInterface) this.mViewManager).setWidth(t11, new DynamicFromObject(obj));
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }
}
