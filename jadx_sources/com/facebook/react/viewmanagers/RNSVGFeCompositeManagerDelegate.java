package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class RNSVGFeCompositeManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGFeCompositeManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGFeCompositeManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        String str2 = null;
        float fFloatValue = 0.0f;
        switch (str) {
            case "height":
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setHeight(t11, new DynamicFromObject(obj));
                break;
            case "result":
                RNSVGFeCompositeManagerInterface rNSVGFeCompositeManagerInterface = (RNSVGFeCompositeManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGFeCompositeManagerInterface.setResult(t11, str2);
                break;
            case "x":
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setX(t11, new DynamicFromObject(obj));
                break;
            case "y":
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setY(t11, new DynamicFromObject(obj));
                break;
            case "k1":
                RNSVGFeCompositeManagerInterface rNSVGFeCompositeManagerInterface2 = (RNSVGFeCompositeManagerInterface) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                rNSVGFeCompositeManagerInterface2.setK1(t11, fFloatValue);
                break;
            case "k2":
                RNSVGFeCompositeManagerInterface rNSVGFeCompositeManagerInterface3 = (RNSVGFeCompositeManagerInterface) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                rNSVGFeCompositeManagerInterface3.setK2(t11, fFloatValue);
                break;
            case "k3":
                RNSVGFeCompositeManagerInterface rNSVGFeCompositeManagerInterface4 = (RNSVGFeCompositeManagerInterface) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                rNSVGFeCompositeManagerInterface4.setK3(t11, fFloatValue);
                break;
            case "k4":
                RNSVGFeCompositeManagerInterface rNSVGFeCompositeManagerInterface5 = (RNSVGFeCompositeManagerInterface) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                rNSVGFeCompositeManagerInterface5.setK4(t11, fFloatValue);
                break;
            case "in1":
                RNSVGFeCompositeManagerInterface rNSVGFeCompositeManagerInterface6 = (RNSVGFeCompositeManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGFeCompositeManagerInterface6.setIn1(t11, str2);
                break;
            case "in2":
                RNSVGFeCompositeManagerInterface rNSVGFeCompositeManagerInterface7 = (RNSVGFeCompositeManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGFeCompositeManagerInterface7.setIn2(t11, str2);
                break;
            case "width":
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setWidth(t11, new DynamicFromObject(obj));
                break;
            case "operator1":
                ((RNSVGFeCompositeManagerInterface) this.mViewManager).setOperator1(t11, (String) obj);
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }
}
