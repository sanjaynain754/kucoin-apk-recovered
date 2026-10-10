package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class RNSScreenStackHeaderConfigManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSScreenStackHeaderConfigManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        switch (str) {
            case "translucent":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTranslucent(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "titleColor":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTitleColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "blurEffect":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBlurEffect(t11, (String) obj);
                break;
            case "largeTitleColor":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "titleFontFamily":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTitleFontFamily(t11, obj != null ? (String) obj : null);
                break;
            case "disableBackButtonMenu":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setDisableBackButtonMenu(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "titleFontWeight":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTitleFontWeight(t11, obj != null ? (String) obj : null);
                break;
            case "hidden":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setHidden(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "largeTitleFontSize":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleFontSize(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "backButtonDisplayMode":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackButtonDisplayMode(t11, (String) obj);
                break;
            case "backTitleVisible":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackTitleVisible(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "direction":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setDirection(t11, (String) obj);
                break;
            case "largeTitleBackgroundColor":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleBackgroundColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "backButtonInCustomView":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackButtonInCustomView(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "largeTitleFontFamily":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleFontFamily(t11, obj != null ? (String) obj : null);
                break;
            case "color":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "title":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTitle(t11, obj != null ? (String) obj : null);
                break;
            case "backTitleFontSize":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackTitleFontSize(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "backTitleFontFamily":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackTitleFontFamily(t11, obj != null ? (String) obj : null);
                break;
            case "hideShadow":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setHideShadow(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "largeTitleFontWeight":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleFontWeight(t11, obj != null ? (String) obj : null);
                break;
            case "hideBackButton":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setHideBackButton(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "backgroundColor":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackgroundColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "backTitle":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackTitle(t11, obj != null ? (String) obj : null);
                break;
            case "titleFontSize":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTitleFontSize(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "largeTitleHideShadow":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleHideShadow(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "largeTitle":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitle(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "topInsetEnabled":
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTopInsetEnabled(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSScreenStackHeaderConfigManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }
}
