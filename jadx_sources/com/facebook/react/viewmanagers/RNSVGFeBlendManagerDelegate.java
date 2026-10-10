package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class RNSVGFeBlendManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGFeBlendManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGFeBlendManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        String str2 = null;
        switch (str) {
            case "height":
                ((RNSVGFeBlendManagerInterface) this.mViewManager).setHeight(t11, new DynamicFromObject(obj));
                break;
            case "result":
                RNSVGFeBlendManagerInterface rNSVGFeBlendManagerInterface = (RNSVGFeBlendManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGFeBlendManagerInterface.setResult(t11, str2);
                break;
            case "x":
                ((RNSVGFeBlendManagerInterface) this.mViewManager).setX(t11, new DynamicFromObject(obj));
                break;
            case "y":
                ((RNSVGFeBlendManagerInterface) this.mViewManager).setY(t11, new DynamicFromObject(obj));
                break;
            case "in1":
                RNSVGFeBlendManagerInterface rNSVGFeBlendManagerInterface2 = (RNSVGFeBlendManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGFeBlendManagerInterface2.setIn1(t11, str2);
                break;
            case "in2":
                RNSVGFeBlendManagerInterface rNSVGFeBlendManagerInterface3 = (RNSVGFeBlendManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGFeBlendManagerInterface3.setIn2(t11, str2);
                break;
            case "mode":
                ((RNSVGFeBlendManagerInterface) this.mViewManager).setMode(t11, (String) obj);
                break;
            case "width":
                ((RNSVGFeBlendManagerInterface) this.mViewManager).setWidth(t11, new DynamicFromObject(obj));
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }
}
