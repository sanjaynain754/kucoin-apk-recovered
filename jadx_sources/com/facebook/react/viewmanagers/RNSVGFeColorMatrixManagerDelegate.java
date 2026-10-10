package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class RNSVGFeColorMatrixManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGFeColorMatrixManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGFeColorMatrixManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        String str2 = null;
        switch (str) {
            case "height":
                ((RNSVGFeColorMatrixManagerInterface) this.mViewManager).setHeight(t11, new DynamicFromObject(obj));
                break;
            case "result":
                RNSVGFeColorMatrixManagerInterface rNSVGFeColorMatrixManagerInterface = (RNSVGFeColorMatrixManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGFeColorMatrixManagerInterface.setResult(t11, str2);
                break;
            case "values":
                ((RNSVGFeColorMatrixManagerInterface) this.mViewManager).setValues(t11, (ReadableArray) obj);
                break;
            case "x":
                ((RNSVGFeColorMatrixManagerInterface) this.mViewManager).setX(t11, new DynamicFromObject(obj));
                break;
            case "y":
                ((RNSVGFeColorMatrixManagerInterface) this.mViewManager).setY(t11, new DynamicFromObject(obj));
                break;
            case "in1":
                RNSVGFeColorMatrixManagerInterface rNSVGFeColorMatrixManagerInterface2 = (RNSVGFeColorMatrixManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGFeColorMatrixManagerInterface2.setIn1(t11, str2);
                break;
            case "type":
                ((RNSVGFeColorMatrixManagerInterface) this.mViewManager).setType(t11, (String) obj);
                break;
            case "width":
                ((RNSVGFeColorMatrixManagerInterface) this.mViewManager).setWidth(t11, new DynamicFromObject(obj));
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }
}
