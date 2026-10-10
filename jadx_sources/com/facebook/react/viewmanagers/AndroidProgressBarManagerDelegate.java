package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class AndroidProgressBarManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & AndroidProgressBarManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        switch (str) {
            case "progress":
                ((AndroidProgressBarManagerInterface) this.mViewManager).setProgress(t11, obj == null ? 0.0d : ((Double) obj).doubleValue());
                break;
            case "testID":
                ((AndroidProgressBarManagerInterface) this.mViewManager).setTestID(t11, obj == null ? "" : (String) obj);
                break;
            case "typeAttr":
                ((AndroidProgressBarManagerInterface) this.mViewManager).setTypeAttr(t11, obj != null ? (String) obj : null);
                break;
            case "color":
                ((AndroidProgressBarManagerInterface) this.mViewManager).setColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "indeterminate":
                ((AndroidProgressBarManagerInterface) this.mViewManager).setIndeterminate(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "animating":
                ((AndroidProgressBarManagerInterface) this.mViewManager).setAnimating(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "styleAttr":
                ((AndroidProgressBarManagerInterface) this.mViewManager).setStyleAttr(t11, obj != null ? (String) obj : null);
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public AndroidProgressBarManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }
}
