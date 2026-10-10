package com.facebook.react.uimanager.events;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.common.ViewUtil;
import p302h6.C38115a;

/* JADX INFO: loaded from: classes45.dex */
class ReactEventEmitter implements RCTModernEventEmitter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ReactEventEmitter";
    private final ReactApplicationContext mReactContext;

    @Nullable
    private RCTModernEventEmitter mFabricEventEmitter = null;

    @Nullable
    private RCTEventEmitter mDefaultEventEmitter = null;

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i11, String str, @Nullable WritableMap writableMap) {
        receiveEvent(-1, i11, str, writableMap);
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        C38115a.m86045a(writableArray.size() > 0);
        if (ViewUtil.getUIManagerType(writableArray.getMap(0).getInt("target")) != 1 || getDefaultEventEmitter() == null) {
            return;
        }
        this.mDefaultEventEmitter.receiveTouches(str, writableArray, writableArray2);
    }

    public void register(int i11, RCTModernEventEmitter rCTModernEventEmitter) {
        this.mFabricEventEmitter = rCTModernEventEmitter;
    }

    public void unregister(int i11) {
        if (i11 == 1) {
            this.mDefaultEventEmitter = null;
        } else {
            this.mFabricEventEmitter = null;
        }
    }

    @Nullable
    private RCTEventEmitter getDefaultEventEmitter() {
        if (this.mDefaultEventEmitter == null) {
            if (this.mReactContext.hasActiveReactInstance()) {
                this.mDefaultEventEmitter = (RCTEventEmitter) this.mReactContext.getJSModule(RCTEventEmitter.class);
            } else {
                ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot get RCTEventEmitter from Context, no active Catalyst instance!"));
            }
        }
        return this.mDefaultEventEmitter;
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i11, int i12, String str, @Nullable WritableMap writableMap) {
        receiveEvent(i11, i12, str, false, 0, writableMap, 2);
    }

    public void register(int i11, RCTEventEmitter rCTEventEmitter) {
        this.mDefaultEventEmitter = rCTEventEmitter;
    }

    public ReactEventEmitter(ReactApplicationContext reactApplicationContext) {
        this.mReactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i11, int i12, String str, boolean z11, int i13, @Nullable WritableMap writableMap, int i14) {
        RCTModernEventEmitter rCTModernEventEmitter;
        int uIManagerType = ViewUtil.getUIManagerType(i12, i11);
        if (uIManagerType == 2 && (rCTModernEventEmitter = this.mFabricEventEmitter) != null) {
            rCTModernEventEmitter.receiveEvent(i11, i12, str, z11, i13, writableMap, i14);
            return;
        }
        if (uIManagerType == 1) {
            RCTEventEmitter defaultEventEmitter = getDefaultEventEmitter();
            if (defaultEventEmitter != null) {
                defaultEventEmitter.receiveEvent(i12, str, writableMap);
                return;
            }
            return;
        }
        ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot find EventEmitter for receiveEvent: SurfaceId[" + i11 + "] ReactTag[" + i12 + "] UIManagerType[" + uIManagerType + "] EventName[" + str + "]"));
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveTouches(TouchEvent touchEvent) {
        RCTModernEventEmitter rCTModernEventEmitter;
        int viewTag = touchEvent.getViewTag();
        int uIManagerType = ViewUtil.getUIManagerType(touchEvent.getViewTag(), touchEvent.getSurfaceId());
        if (uIManagerType == 2 && (rCTModernEventEmitter = this.mFabricEventEmitter) != null) {
            TouchesHelper.sendTouchEvent(rCTModernEventEmitter, touchEvent);
            return;
        }
        if (uIManagerType == 1 && getDefaultEventEmitter() != null) {
            TouchesHelper.sendTouchesLegacy(this.mDefaultEventEmitter, touchEvent);
            return;
        }
        ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot find EventEmitter for receivedTouches: ReactTag[" + viewTag + "] UIManagerType[" + uIManagerType + "] EventName[" + touchEvent.getEventName() + "]"));
    }
}
