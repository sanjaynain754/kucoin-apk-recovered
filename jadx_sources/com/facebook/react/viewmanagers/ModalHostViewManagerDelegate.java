package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.ModalHostViewManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class ModalHostViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & ModalHostViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public ModalHostViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        boolean zBooleanValue3 = false;
        boolean zBooleanValue4 = false;
        boolean zBooleanValue5 = false;
        boolean zBooleanValue6 = false;
        int iIntValue = 0;
        switch (str) {
            case "presentationStyle":
                ((ModalHostViewManagerInterface) this.mViewManager).setPresentationStyle(t11, (String) obj);
                break;
            case "supportedOrientations":
                ((ModalHostViewManagerInterface) this.mViewManager).setSupportedOrientations(t11, (ReadableArray) obj);
                break;
            case "transparent":
                ModalHostViewManagerInterface modalHostViewManagerInterface = (ModalHostViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue = ((Boolean) obj).booleanValue();
                }
                modalHostViewManagerInterface.setTransparent(t11, zBooleanValue);
                break;
            case "identifier":
                ModalHostViewManagerInterface modalHostViewManagerInterface2 = (ModalHostViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    iIntValue = ((Double) obj).intValue();
                }
                modalHostViewManagerInterface2.setIdentifier(t11, iIntValue);
                break;
            case "statusBarTranslucent":
                ModalHostViewManagerInterface modalHostViewManagerInterface3 = (ModalHostViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue6 = ((Boolean) obj).booleanValue();
                }
                modalHostViewManagerInterface3.setStatusBarTranslucent(t11, zBooleanValue6);
                break;
            case "animated":
                ModalHostViewManagerInterface modalHostViewManagerInterface4 = (ModalHostViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue5 = ((Boolean) obj).booleanValue();
                }
                modalHostViewManagerInterface4.setAnimated(t11, zBooleanValue5);
                break;
            case "visible":
                ModalHostViewManagerInterface modalHostViewManagerInterface5 = (ModalHostViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue4 = ((Boolean) obj).booleanValue();
                }
                modalHostViewManagerInterface5.setVisible(t11, zBooleanValue4);
                break;
            case "navigationBarTranslucent":
                ModalHostViewManagerInterface modalHostViewManagerInterface6 = (ModalHostViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue3 = ((Boolean) obj).booleanValue();
                }
                modalHostViewManagerInterface6.setNavigationBarTranslucent(t11, zBooleanValue3);
                break;
            case "hardwareAccelerated":
                ModalHostViewManagerInterface modalHostViewManagerInterface7 = (ModalHostViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue2 = ((Boolean) obj).booleanValue();
                }
                modalHostViewManagerInterface7.setHardwareAccelerated(t11, zBooleanValue2);
                break;
            case "animationType":
                ((ModalHostViewManagerInterface) this.mViewManager).setAnimationType(t11, (String) obj);
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }
}
