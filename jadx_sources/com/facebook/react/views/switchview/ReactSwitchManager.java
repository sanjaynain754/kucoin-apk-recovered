package com.facebook.react.views.switchview;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.AndroidSwitchManagerDelegate;
import com.facebook.react.viewmanagers.AndroidSwitchManagerInterface;
import com.facebook.yoga.AbstractC6262a;
import com.facebook.yoga.YogaMeasureMode;
import p193d7.C36635h;
import p193d7.InterfaceC36634g;

/* JADX INFO: loaded from: classes45.dex */
public class ReactSwitchManager extends SimpleViewManager<ReactSwitch> implements AndroidSwitchManagerInterface<ReactSwitch> {
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new CompoundButton.OnCheckedChangeListener() { // from class: com.facebook.react.views.switchview.ReactSwitchManager.1
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            ReactContext reactContext = (ReactContext) compoundButton.getContext();
            int id2 = compoundButton.getId();
            UIManagerHelper.getEventDispatcherForReactTag(reactContext, id2).dispatchEvent(new ReactSwitchEvent(UIManagerHelper.getSurfaceId(reactContext), id2, z11));
        }
    };
    public static final String REACT_CLASS = "AndroidSwitch";
    private final ViewManagerDelegate<ReactSwitch> mDelegate = new AndroidSwitchManagerDelegate(this);

    public static class ReactSwitchShadowNode extends LayoutShadowNode implements InterfaceC36634g {
        private int mHeight;
        private boolean mMeasured;
        private int mWidth;

        private ReactSwitchShadowNode() {
            initMeasureFunction();
        }

        @Override // p193d7.InterfaceC36634g
        public long measure(AbstractC6262a abstractC6262a, float f11, YogaMeasureMode yogaMeasureMode, float f12, YogaMeasureMode yogaMeasureMode2) {
            if (!this.mMeasured) {
                ReactSwitch reactSwitch = new ReactSwitch(getThemedContext());
                reactSwitch.setShowText(false);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                reactSwitch.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                this.mWidth = reactSwitch.getMeasuredWidth();
                this.mHeight = reactSwitch.getMeasuredHeight();
                this.mMeasured = true;
            }
            return C36635h.m81967b(this.mWidth, this.mHeight);
        }

        private void initMeasureFunction() {
            setMeasureFunction(this);
        }
    }

    private static void setValueInternal(ReactSwitch reactSwitch, boolean z11) {
        reactSwitch.setOnCheckedChangeListener(null);
        reactSwitch.setOn(z11);
        reactSwitch.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(ThemedReactContext themedReactContext, ReactSwitch reactSwitch) {
        reactSwitch.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new ReactSwitchShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactSwitch createViewInstance(ThemedReactContext themedReactContext) {
        ReactSwitch reactSwitch = new ReactSwitch(themedReactContext);
        reactSwitch.setShowText(false);
        return reactSwitch;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<ReactSwitch> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return ReactSwitchShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f11, YogaMeasureMode yogaMeasureMode, float f12, YogaMeasureMode yogaMeasureMode2, @Nullable float[] fArr) {
        ReactSwitch reactSwitch = new ReactSwitch(context);
        reactSwitch.setShowText(false);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        reactSwitch.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        return C36635h.m81966a(PixelUtil.toDIPFromPixel(reactSwitch.getMeasuredWidth()), PixelUtil.toDIPFromPixel(reactSwitch.getMeasuredHeight()));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NonNull ReactSwitch reactSwitch, String str, @Nullable ReadableArray readableArray) {
        str.getClass();
        if (str.equals("setNativeValue")) {
            boolean z11 = false;
            if (readableArray != null && readableArray.getBoolean(0)) {
                z11 = true;
            }
            setValueInternal(reactSwitch, z11);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setBackgroundColor(ReactSwitch reactSwitch, @ColorInt int i11) {
        reactSwitch.setBackgroundColor(i11);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(defaultBoolean = false, name = "disabled")
    public void setDisabled(ReactSwitch reactSwitch, boolean z11) {
        reactSwitch.setEnabled(!z11);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(ReactSwitch reactSwitch, boolean z11) {
        reactSwitch.setEnabled(z11);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    public void setNativeValue(ReactSwitch reactSwitch, boolean z11) {
        setValueInternal(reactSwitch, z11);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(name = ViewProps.ON)
    public void setOn(ReactSwitch reactSwitch, boolean z11) {
        setValueInternal(reactSwitch, z11);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(customType = "Color", name = "thumbColor")
    public void setThumbColor(ReactSwitch reactSwitch, @Nullable Integer num) {
        reactSwitch.setThumbColor(num);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(ReactSwitch reactSwitch, @Nullable Integer num) {
        setThumbColor(reactSwitch, num);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(customType = "Color", name = "trackColorForFalse")
    public void setTrackColorForFalse(ReactSwitch reactSwitch, @Nullable Integer num) {
        reactSwitch.setTrackColorForFalse(num);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(customType = "Color", name = "trackColorForTrue")
    public void setTrackColorForTrue(ReactSwitch reactSwitch, @Nullable Integer num) {
        reactSwitch.setTrackColorForTrue(num);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(customType = "Color", name = "trackTintColor")
    public void setTrackTintColor(ReactSwitch reactSwitch, @Nullable Integer num) {
        reactSwitch.setTrackColor(num);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(name = "value")
    public void setValue(ReactSwitch reactSwitch, boolean z11) {
        setValueInternal(reactSwitch, z11);
    }
}
