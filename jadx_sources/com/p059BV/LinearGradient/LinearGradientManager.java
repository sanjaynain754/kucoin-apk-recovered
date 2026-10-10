package com.p059BV.LinearGradient;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

/* JADX INFO: loaded from: classes34.dex */
public class LinearGradientManager extends SimpleViewManager<LinearGradientView> {
    public static final String PROP_ANGLE = "angle";
    public static final String PROP_ANGLE_CENTER = "angleCenter";
    public static final String PROP_BORDER_RADII = "borderRadii";
    public static final String PROP_COLORS = "colors";
    public static final String PROP_END_POINT = "endPoint";
    public static final String PROP_LOCATIONS = "locations";
    public static final String PROP_START_POINT = "startPoint";
    public static final String PROP_USE_ANGLE = "useAngle";
    public static final String REACT_CLASS = "BVLinearGradient";

    @Override // com.facebook.react.uimanager.ViewManager
    public LinearGradientView createViewInstance(ThemedReactContext themedReactContext) {
        return new LinearGradientView(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = PROP_LOCATIONS)
    public void setLocations(LinearGradientView linearGradientView, ReadableArray readableArray) {
        if (readableArray != null) {
            linearGradientView.setLocations(readableArray);
        }
    }

    @ReactProp(defaultFloat = 45.0f, name = PROP_ANGLE)
    public void setAngle(LinearGradientView linearGradientView, float f11) {
        linearGradientView.setAngle(f11);
    }

    @ReactProp(name = PROP_ANGLE_CENTER)
    public void setAngleCenter(LinearGradientView linearGradientView, ReadableArray readableArray) {
        linearGradientView.setAngleCenter(readableArray);
    }

    @ReactProp(name = PROP_BORDER_RADII)
    public void setBorderRadii(LinearGradientView linearGradientView, ReadableArray readableArray) {
        linearGradientView.setBorderRadii(readableArray);
    }

    @ReactProp(name = PROP_COLORS)
    public void setColors(LinearGradientView linearGradientView, ReadableArray readableArray) {
        linearGradientView.setColors(readableArray);
    }

    @ReactProp(name = PROP_END_POINT)
    public void setEndPoint(LinearGradientView linearGradientView, ReadableArray readableArray) {
        linearGradientView.setEndPoint(readableArray);
    }

    @ReactProp(name = PROP_START_POINT)
    public void setStartPoint(LinearGradientView linearGradientView, ReadableArray readableArray) {
        linearGradientView.setStartPoint(readableArray);
    }

    @ReactProp(defaultBoolean = false, name = PROP_USE_ANGLE)
    public void setUseAngle(LinearGradientView linearGradientView, boolean z11) {
        linearGradientView.setUseAngle(z11);
    }
}
