package com.facebook.react.uimanager;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.ReadableArray;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ViewManagerDelegate.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\u00020\u0003J)\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\nJ)\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0002\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m90084d2 = {"Lcom/facebook/react/uimanager/ViewManagerDelegate;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/View;", "", "setProperty", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "propName", "", "value", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V", "receiveCommand", "commandName", "args", "Lcom/facebook/react/bridge/ReadableArray;", "(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface ViewManagerDelegate<T extends View> {
    void receiveCommand(T view, @Nullable String commandName, @Nullable ReadableArray args);

    void setProperty(T view, @Nullable String propName, @Nullable Object value);
}
