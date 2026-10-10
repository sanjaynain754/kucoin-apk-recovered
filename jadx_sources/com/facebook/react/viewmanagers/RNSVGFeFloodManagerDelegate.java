package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class RNSVGFeFloodManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGFeFloodManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGFeFloodManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        float fFloatValue;
        String str2;
        str.getClass();
        switch (str) {
            case "floodColor":
                ((RNSVGFeFloodManagerInterface) this.mViewManager).setFloodColor(t11, new DynamicFromObject(obj));
                break;
            case "height":
                ((RNSVGFeFloodManagerInterface) this.mViewManager).setHeight(t11, new DynamicFromObject(obj));
                break;
            case "floodOpacity":
                RNSVGFeFloodManagerInterface rNSVGFeFloodManagerInterface = (RNSVGFeFloodManagerInterface) this.mViewManager;
                if (obj == null) {
                    fFloatValue = 1.0f;
                } else {
                    fFloatValue = ((Double) obj).floatValue();
                }
                rNSVGFeFloodManagerInterface.setFloodOpacity(t11, fFloatValue);
                break;
            case "result":
                RNSVGFeFloodManagerInterface rNSVGFeFloodManagerInterface2 = (RNSVGFeFloodManagerInterface) this.mViewManager;
                if (obj == null) {
                    str2 = null;
                } else {
                    str2 = (String) obj;
                }
                rNSVGFeFloodManagerInterface2.setResult(t11, str2);
                break;
            case "x":
                ((RNSVGFeFloodManagerInterface) this.mViewManager).setX(t11, new DynamicFromObject(obj));
                break;
            case "y":
                ((RNSVGFeFloodManagerInterface) this.mViewManager).setY(t11, new DynamicFromObject(obj));
                break;
            case "width":
                ((RNSVGFeFloodManagerInterface) this.mViewManager).setWidth(t11, new DynamicFromObject(obj));
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }
}
