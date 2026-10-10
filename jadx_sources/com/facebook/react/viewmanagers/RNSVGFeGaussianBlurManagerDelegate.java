package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class RNSVGFeGaussianBlurManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGFeGaussianBlurManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGFeGaussianBlurManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        String str2 = null;
        float fFloatValue = 0.0f;
        switch (str) {
            case "height":
                ((RNSVGFeGaussianBlurManagerInterface) this.mViewManager).setHeight(t11, new DynamicFromObject(obj));
                break;
            case "result":
                RNSVGFeGaussianBlurManagerInterface rNSVGFeGaussianBlurManagerInterface = (RNSVGFeGaussianBlurManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGFeGaussianBlurManagerInterface.setResult(t11, str2);
                break;
            case "x":
                ((RNSVGFeGaussianBlurManagerInterface) this.mViewManager).setX(t11, new DynamicFromObject(obj));
                break;
            case "y":
                ((RNSVGFeGaussianBlurManagerInterface) this.mViewManager).setY(t11, new DynamicFromObject(obj));
                break;
            case "in1":
                RNSVGFeGaussianBlurManagerInterface rNSVGFeGaussianBlurManagerInterface2 = (RNSVGFeGaussianBlurManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGFeGaussianBlurManagerInterface2.setIn1(t11, str2);
                break;
            case "width":
                ((RNSVGFeGaussianBlurManagerInterface) this.mViewManager).setWidth(t11, new DynamicFromObject(obj));
                break;
            case "edgeMode":
                ((RNSVGFeGaussianBlurManagerInterface) this.mViewManager).setEdgeMode(t11, (String) obj);
                break;
            case "stdDeviationX":
                RNSVGFeGaussianBlurManagerInterface rNSVGFeGaussianBlurManagerInterface3 = (RNSVGFeGaussianBlurManagerInterface) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                rNSVGFeGaussianBlurManagerInterface3.setStdDeviationX(t11, fFloatValue);
                break;
            case "stdDeviationY":
                RNSVGFeGaussianBlurManagerInterface rNSVGFeGaussianBlurManagerInterface4 = (RNSVGFeGaussianBlurManagerInterface) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                rNSVGFeGaussianBlurManagerInterface4.setStdDeviationY(t11, fFloatValue);
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }
}
