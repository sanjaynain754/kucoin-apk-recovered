package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
public abstract class NativeToastAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ToastAndroid";

    public abstract Map<String, Object> getTypedExportedConstants();

    @ReactMethod
    @InterfaceC44695a
    public abstract void show(String str, double d11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void showWithGravity(String str, double d11, double d12);

    @ReactMethod
    @InterfaceC44695a
    public abstract void showWithGravityAndOffset(String str, double d11, double d12, double d13, double d14);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ToastAndroid";
    }

    public NativeToastAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @InterfaceC44695a
    public final Map<String, Object> getConstants() {
        Map<String, Object> typedExportedConstants = getTypedExportedConstants();
        if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
            HashSet hashSet = new HashSet(Arrays.asList("BOTTOM", "CENTER", SharedPositionInfo.SIDE_LONG, SharedPositionInfo.SIDE_SHORT, "TOP"));
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet(typedExportedConstants.keySet());
            hashSet3.removeAll(hashSet);
            hashSet3.removeAll(hashSet2);
            if (hashSet3.isEmpty()) {
                hashSet.removeAll(typedExportedConstants.keySet());
                if (!hashSet.isEmpty()) {
                    throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", hashSet));
                }
            } else {
                throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", hashSet3));
            }
        }
        return typedExportedConstants;
    }
}
