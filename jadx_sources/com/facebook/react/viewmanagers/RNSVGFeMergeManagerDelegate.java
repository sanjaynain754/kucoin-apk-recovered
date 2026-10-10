package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGFeMergeManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class RNSVGFeMergeManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGFeMergeManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGFeMergeManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        String str2;
        str.getClass();
        switch (str) {
            case "height":
                ((RNSVGFeMergeManagerInterface) this.mViewManager).setHeight(t11, new DynamicFromObject(obj));
                break;
            case "result":
                RNSVGFeMergeManagerInterface rNSVGFeMergeManagerInterface = (RNSVGFeMergeManagerInterface) this.mViewManager;
                if (obj == null) {
                    str2 = null;
                } else {
                    str2 = (String) obj;
                }
                rNSVGFeMergeManagerInterface.setResult(t11, str2);
                break;
            case "x":
                ((RNSVGFeMergeManagerInterface) this.mViewManager).setX(t11, new DynamicFromObject(obj));
                break;
            case "y":
                ((RNSVGFeMergeManagerInterface) this.mViewManager).setY(t11, new DynamicFromObject(obj));
                break;
            case "nodes":
                ((RNSVGFeMergeManagerInterface) this.mViewManager).setNodes(t11, (ReadableArray) obj);
                break;
            case "width":
                ((RNSVGFeMergeManagerInterface) this.mViewManager).setWidth(t11, new DynamicFromObject(obj));
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }
}
