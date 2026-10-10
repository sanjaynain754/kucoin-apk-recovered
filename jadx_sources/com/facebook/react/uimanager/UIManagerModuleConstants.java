package com.facebook.react.uimanager;

import android.widget.ImageView;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.events.TouchEventType;
import com.facebook.react.views.textinput.ReactContentSizeChangedEvent;
import com.facebook.react.views.textinput.ReactTextChangedEvent;
import com.reactnativecommunity.webview.events.TopLoadingErrorEvent;
import com.reactnativecommunity.webview.events.TopLoadingFinishEvent;
import com.reactnativecommunity.webview.events.TopLoadingStartEvent;
import com.reactnativecommunity.webview.events.TopMessageEvent;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
class UIManagerModuleConstants {
    public static final String ACTION_DISMISSED = "dismissed";
    public static final String ACTION_ITEM_SELECTED = "itemSelected";

    public static Map getBubblingEventTypeConstants() {
        return MapBuilder.builder().put(ReactTextChangedEvent.EVENT_NAME, MapBuilder.m10222of("phasedRegistrationNames", MapBuilder.m10223of("bubbled", "onChange", "captured", "onChangeCapture"))).put("topSelect", MapBuilder.m10222of("phasedRegistrationNames", MapBuilder.m10223of("bubbled", "onSelect", "captured", "onSelectCapture"))).put(TouchEventType.getJSEventName(TouchEventType.START), MapBuilder.m10222of("phasedRegistrationNames", MapBuilder.m10223of("bubbled", "onTouchStart", "captured", "onTouchStartCapture"))).put(TouchEventType.getJSEventName(TouchEventType.MOVE), MapBuilder.m10222of("phasedRegistrationNames", MapBuilder.m10223of("bubbled", "onTouchMove", "captured", "onTouchMoveCapture"))).put(TouchEventType.getJSEventName(TouchEventType.END), MapBuilder.m10222of("phasedRegistrationNames", MapBuilder.m10223of("bubbled", "onTouchEnd", "captured", "onTouchEndCapture"))).put(TouchEventType.getJSEventName(TouchEventType.CANCEL), MapBuilder.m10222of("phasedRegistrationNames", MapBuilder.m10223of("bubbled", "onTouchCancel", "captured", "onTouchCancelCapture"))).build();
    }

    public static Map<String, Object> getConstants() {
        HashMap mapNewHashMap = MapBuilder.newHashMap();
        mapNewHashMap.put("UIView", MapBuilder.m10222of("ContentMode", MapBuilder.m10224of("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal()))));
        mapNewHashMap.put("StyleConstants", MapBuilder.m10222of("PointerEventsValues", MapBuilder.m10225of("none", Integer.valueOf(PointerEvents.NONE.ordinal()), "boxNone", Integer.valueOf(PointerEvents.BOX_NONE.ordinal()), "boxOnly", Integer.valueOf(PointerEvents.BOX_ONLY.ordinal()), "unspecified", Integer.valueOf(PointerEvents.AUTO.ordinal()))));
        mapNewHashMap.put("AccessibilityEventTypes", MapBuilder.m10224of("typeWindowStateChanged", 32, "typeViewFocused", 8, "typeViewClicked", 1));
        return mapNewHashMap;
    }

    public static Map getDirectEventTypeConstants() {
        return MapBuilder.builder().put(ReactContentSizeChangedEvent.EVENT_NAME, MapBuilder.m10222of("registrationName", "onContentSizeChange")).put("topLayout", MapBuilder.m10222of("registrationName", ViewProps.ON_LAYOUT)).put(TopLoadingErrorEvent.EVENT_NAME, MapBuilder.m10222of("registrationName", "onLoadingError")).put(TopLoadingFinishEvent.EVENT_NAME, MapBuilder.m10222of("registrationName", "onLoadingFinish")).put(TopLoadingStartEvent.EVENT_NAME, MapBuilder.m10222of("registrationName", "onLoadingStart")).put("topSelectionChange", MapBuilder.m10222of("registrationName", "onSelectionChange")).put(TopMessageEvent.EVENT_NAME, MapBuilder.m10222of("registrationName", "onMessage")).put("topScrollBeginDrag", MapBuilder.m10222of("registrationName", "onScrollBeginDrag")).put("topScrollEndDrag", MapBuilder.m10222of("registrationName", "onScrollEndDrag")).put("topScroll", MapBuilder.m10222of("registrationName", "onScroll")).put("topMomentumScrollBegin", MapBuilder.m10222of("registrationName", "onMomentumScrollBegin")).put("topMomentumScrollEnd", MapBuilder.m10222of("registrationName", "onMomentumScrollEnd")).build();
    }
}
