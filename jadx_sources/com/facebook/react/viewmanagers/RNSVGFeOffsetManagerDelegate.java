package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class RNSVGFeOffsetManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGFeOffsetManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGFeOffsetManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        String str2 = null;
        switch (str) {
            case "height":
                ((RNSVGFeOffsetManagerInterface) this.mViewManager).setHeight(t11, new DynamicFromObject(obj));
                break;
            case "result":
                RNSVGFeOffsetManagerInterface rNSVGFeOffsetManagerInterface = (RNSVGFeOffsetManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGFeOffsetManagerInterface.setResult(t11, str2);
                break;
            case "x":
                ((RNSVGFeOffsetManagerInterface) this.mViewManager).setX(t11, new DynamicFromObject(obj));
                break;
            case "y":
                ((RNSVGFeOffsetManagerInterface) this.mViewManager).setY(t11, new DynamicFromObject(obj));
                break;
            case "dx":
                ((RNSVGFeOffsetManagerInterface) this.mViewManager).setDx(t11, new DynamicFromObject(obj));
                break;
            case "dy":
                ((RNSVGFeOffsetManagerInterface) this.mViewManager).setDy(t11, new DynamicFromObject(obj));
                break;
            case "in1":
                RNSVGFeOffsetManagerInterface rNSVGFeOffsetManagerInterface2 = (RNSVGFeOffsetManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGFeOffsetManagerInterface2.setIn1(t11, str2);
                break;
            case "width":
                ((RNSVGFeOffsetManagerInterface) this.mViewManager).setWidth(t11, new DynamicFromObject(obj));
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }
}
