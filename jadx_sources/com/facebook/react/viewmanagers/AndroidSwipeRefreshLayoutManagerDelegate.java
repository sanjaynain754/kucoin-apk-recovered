package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.AndroidSwipeRefreshLayoutManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class AndroidSwipeRefreshLayoutManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & AndroidSwipeRefreshLayoutManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        switch (str) {
            case "enabled":
                ((AndroidSwipeRefreshLayoutManagerInterface) this.mViewManager).setEnabled(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "colors":
                ((AndroidSwipeRefreshLayoutManagerInterface) this.mViewManager).setColors(t11, (ReadableArray) obj);
                break;
            case "progressBackgroundColor":
                ((AndroidSwipeRefreshLayoutManagerInterface) this.mViewManager).setProgressBackgroundColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "progressViewOffset":
                ((AndroidSwipeRefreshLayoutManagerInterface) this.mViewManager).setProgressViewOffset(t11, obj == null ? 0.0f : ((Double) obj).floatValue());
                break;
            case "refreshing":
                ((AndroidSwipeRefreshLayoutManagerInterface) this.mViewManager).setRefreshing(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "size":
                ((AndroidSwipeRefreshLayoutManagerInterface) this.mViewManager).setSize(t11, (String) obj);
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public AndroidSwipeRefreshLayoutManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void receiveCommand(T t11, String str, @Nullable ReadableArray readableArray) {
        str.getClass();
        if (!str.equals("setNativeRefreshing")) {
            return;
        }
        ((AndroidSwipeRefreshLayoutManagerInterface) this.mViewManager).setNativeRefreshing(t11, readableArray.getBoolean(0));
    }
}
