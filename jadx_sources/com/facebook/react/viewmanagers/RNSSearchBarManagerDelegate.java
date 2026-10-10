package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSSearchBarManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class RNSSearchBarManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSSearchBarManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        switch (str) {
            case "hideNavigationBar":
                ((RNSSearchBarManagerInterface) this.mViewManager).setHideNavigationBar(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "headerIconColor":
                ((RNSSearchBarManagerInterface) this.mViewManager).setHeaderIconColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "autoCapitalize":
                ((RNSSearchBarManagerInterface) this.mViewManager).setAutoCapitalize(t11, (String) obj);
                break;
            case "textColor":
                ((RNSSearchBarManagerInterface) this.mViewManager).setTextColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "barTintColor":
                ((RNSSearchBarManagerInterface) this.mViewManager).setBarTintColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "hintTextColor":
                ((RNSSearchBarManagerInterface) this.mViewManager).setHintTextColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "hideWhenScrolling":
                ((RNSSearchBarManagerInterface) this.mViewManager).setHideWhenScrolling(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "cancelButtonText":
                ((RNSSearchBarManagerInterface) this.mViewManager).setCancelButtonText(t11, obj != null ? (String) obj : null);
                break;
            case "disableBackButtonOverride":
                ((RNSSearchBarManagerInterface) this.mViewManager).setDisableBackButtonOverride(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "shouldShowHintSearchIcon":
                ((RNSSearchBarManagerInterface) this.mViewManager).setShouldShowHintSearchIcon(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "placeholder":
                ((RNSSearchBarManagerInterface) this.mViewManager).setPlaceholder(t11, obj != null ? (String) obj : null);
                break;
            case "tintColor":
                ((RNSSearchBarManagerInterface) this.mViewManager).setTintColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "obscureBackground":
                ((RNSSearchBarManagerInterface) this.mViewManager).setObscureBackground(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "inputType":
                ((RNSSearchBarManagerInterface) this.mViewManager).setInputType(t11, obj != null ? (String) obj : null);
                break;
            case "placement":
                ((RNSSearchBarManagerInterface) this.mViewManager).setPlacement(t11, (String) obj);
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSSearchBarManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void receiveCommand(T t11, String str, @Nullable ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "cancelSearch":
                ((RNSSearchBarManagerInterface) this.mViewManager).cancelSearch(t11);
                break;
            case "clearText":
                ((RNSSearchBarManagerInterface) this.mViewManager).clearText(t11);
                break;
            case "toggleCancelButton":
                ((RNSSearchBarManagerInterface) this.mViewManager).toggleCancelButton(t11, readableArray.getBoolean(0));
                break;
            case "blur":
                ((RNSSearchBarManagerInterface) this.mViewManager).blur(t11);
                break;
            case "focus":
                ((RNSSearchBarManagerInterface) this.mViewManager).focus(t11);
                break;
            case "setText":
                ((RNSSearchBarManagerInterface) this.mViewManager).setText(t11, readableArray.getString(0));
                break;
        }
    }
}
