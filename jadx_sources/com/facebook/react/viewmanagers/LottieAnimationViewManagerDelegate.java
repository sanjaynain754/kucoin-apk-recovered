package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class LottieAnimationViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & LottieAnimationViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void receiveCommand(T t11, String str, @Nullable ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "resume":
                ((LottieAnimationViewManagerInterface) this.mViewManager).resume(t11);
                break;
            case "play":
                ((LottieAnimationViewManagerInterface) this.mViewManager).play(t11, readableArray.getInt(0), readableArray.getInt(1));
                break;
            case "pause":
                ((LottieAnimationViewManagerInterface) this.mViewManager).pause(t11);
                break;
            case "reset":
                ((LottieAnimationViewManagerInterface) this.mViewManager).reset(t11);
                break;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public LottieAnimationViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        float fFloatValue;
        double dDoubleValue;
        str.getClass();
        boolean zBooleanValue = false;
        String str2 = null;
        switch (str) {
            case "imageAssetsFolder":
                LottieAnimationViewManagerInterface lottieAnimationViewManagerInterface = (LottieAnimationViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                lottieAnimationViewManagerInterface.setImageAssetsFolder(t11, str2);
                break;
            case "sourceURL":
                LottieAnimationViewManagerInterface lottieAnimationViewManagerInterface2 = (LottieAnimationViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                lottieAnimationViewManagerInterface2.setSourceURL(t11, str2);
                break;
            case "textFiltersIOS":
                ((LottieAnimationViewManagerInterface) this.mViewManager).setTextFiltersIOS(t11, (ReadableArray) obj);
                break;
            case "sourceJson":
                LottieAnimationViewManagerInterface lottieAnimationViewManagerInterface3 = (LottieAnimationViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                lottieAnimationViewManagerInterface3.setSourceJson(t11, str2);
                break;
            case "sourceName":
                LottieAnimationViewManagerInterface lottieAnimationViewManagerInterface4 = (LottieAnimationViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                lottieAnimationViewManagerInterface4.setSourceName(t11, str2);
                break;
            case "cacheComposition":
                LottieAnimationViewManagerInterface lottieAnimationViewManagerInterface5 = (LottieAnimationViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue = ((Boolean) obj).booleanValue();
                }
                lottieAnimationViewManagerInterface5.setCacheComposition(t11, zBooleanValue);
                break;
            case "progress":
                LottieAnimationViewManagerInterface lottieAnimationViewManagerInterface6 = (LottieAnimationViewManagerInterface) this.mViewManager;
                if (obj == null) {
                    fFloatValue = 0.0f;
                } else {
                    fFloatValue = ((Double) obj).floatValue();
                }
                lottieAnimationViewManagerInterface6.setProgress(t11, fFloatValue);
                break;
            case "textFiltersAndroid":
                ((LottieAnimationViewManagerInterface) this.mViewManager).setTextFiltersAndroid(t11, (ReadableArray) obj);
                break;
            case "sourceDotLottieURI":
                LottieAnimationViewManagerInterface lottieAnimationViewManagerInterface7 = (LottieAnimationViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                lottieAnimationViewManagerInterface7.setSourceDotLottieURI(t11, str2);
                break;
            case "loop":
                LottieAnimationViewManagerInterface lottieAnimationViewManagerInterface8 = (LottieAnimationViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue = ((Boolean) obj).booleanValue();
                }
                lottieAnimationViewManagerInterface8.setLoop(t11, zBooleanValue);
                break;
            case "dummy":
                ((LottieAnimationViewManagerInterface) this.mViewManager).setDummy(t11, (ReadableMap) obj);
                break;
            case "speed":
                LottieAnimationViewManagerInterface lottieAnimationViewManagerInterface9 = (LottieAnimationViewManagerInterface) this.mViewManager;
                if (obj == null) {
                    dDoubleValue = 0.0d;
                } else {
                    dDoubleValue = ((Double) obj).doubleValue();
                }
                lottieAnimationViewManagerInterface9.setSpeed(t11, dDoubleValue);
                break;
            case "hardwareAccelerationAndroid":
                LottieAnimationViewManagerInterface lottieAnimationViewManagerInterface10 = (LottieAnimationViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue = ((Boolean) obj).booleanValue();
                }
                lottieAnimationViewManagerInterface10.setHardwareAccelerationAndroid(t11, zBooleanValue);
                break;
            case "enableSafeModeAndroid":
                LottieAnimationViewManagerInterface lottieAnimationViewManagerInterface11 = (LottieAnimationViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue = ((Boolean) obj).booleanValue();
                }
                lottieAnimationViewManagerInterface11.setEnableSafeModeAndroid(t11, zBooleanValue);
                break;
            case "renderMode":
                LottieAnimationViewManagerInterface lottieAnimationViewManagerInterface12 = (LottieAnimationViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                lottieAnimationViewManagerInterface12.setRenderMode(t11, str2);
                break;
            case "colorFilters":
                ((LottieAnimationViewManagerInterface) this.mViewManager).setColorFilters(t11, (ReadableArray) obj);
                break;
            case "autoPlay":
                LottieAnimationViewManagerInterface lottieAnimationViewManagerInterface13 = (LottieAnimationViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue = ((Boolean) obj).booleanValue();
                }
                lottieAnimationViewManagerInterface13.setAutoPlay(t11, zBooleanValue);
                break;
            case "resizeMode":
                LottieAnimationViewManagerInterface lottieAnimationViewManagerInterface14 = (LottieAnimationViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                lottieAnimationViewManagerInterface14.setResizeMode(t11, str2);
                break;
            case "enableMergePathsAndroidForKitKatAndAbove":
                LottieAnimationViewManagerInterface lottieAnimationViewManagerInterface15 = (LottieAnimationViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue = ((Boolean) obj).booleanValue();
                }
                lottieAnimationViewManagerInterface15.setEnableMergePathsAndroidForKitKatAndAbove(t11, zBooleanValue);
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }
}
