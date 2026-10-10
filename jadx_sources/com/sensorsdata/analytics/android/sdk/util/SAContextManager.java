package com.sensorsdata.analytics.android.sdk.util;

import android.content.Context;
import android.text.TextUtils;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class SAContextManager {
    private boolean isAppStartSuccess;
    private String mAndroidId;
    private final Context mContext;
    private Map<String, Object> mDeviceInfo;
    private boolean mDisableTrackDeviceId;

    private void setupDeviceInfo() {
        HashMap map = new HashMap();
        String harmonyOSVersion = DeviceUtils.getHarmonyOSVersion();
        if (TextUtils.isEmpty(harmonyOSVersion)) {
            map.put("$os", KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID);
            map.put("$os_version", DeviceUtils.getOS());
        } else {
            map.put("$os", "HarmonyOS");
            map.put("$os_version", harmonyOSVersion);
        }
        map.put("$lib", KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID);
        map.put("$lib_version", SensorsDataAPI.sharedInstance().getSDKVersion());
        map.put("$manufacturer", DeviceUtils.getManufacturer());
        map.put("$model", DeviceUtils.getModel());
        map.put("$brand", DeviceUtils.getBrand());
        map.put("$app_version", AppInfoUtils.getAppVersionName(this.mContext));
        int[] deviceSize = DeviceUtils.getDeviceSize(this.mContext);
        map.put("$screen_width", Integer.valueOf(deviceSize[0]));
        map.put("$screen_height", Integer.valueOf(deviceSize[1]));
        String carrier = SensorsDataUtils.getCarrier(this.mContext);
        if (!TextUtils.isEmpty(carrier)) {
            map.put("$carrier", carrier);
        }
        String androidID = SensorsDataUtils.getAndroidID(this.mContext);
        this.mAndroidId = androidID;
        if (!this.mDisableTrackDeviceId && !TextUtils.isEmpty(androidID)) {
            map.put("$device_id", this.mAndroidId);
        }
        Integer zoneOffset = TimeUtils.getZoneOffset();
        if (zoneOffset != null) {
            map.put("$timezone_offset", zoneOffset);
        }
        map.put("$app_id", AppInfoUtils.getProcessName(this.mContext));
        map.put("$app_name", AppInfoUtils.getAppName(this.mContext));
        this.mDeviceInfo = Collections.unmodifiableMap(map);
    }

    public void addKeyIfExist(JSONObject jSONObject, String str) {
        try {
            if (this.mDeviceInfo == null && AbstractSensorsDataAPI.getConfigOptions().isDataCollectEnable()) {
                setupDeviceInfo();
            }
            Map<String, Object> map = this.mDeviceInfo;
            if (map == null || !map.containsKey(str)) {
                return;
            }
            jSONObject.put(str, this.mDeviceInfo.get(str));
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public String getAndroidId() {
        if (TextUtils.isEmpty(this.mAndroidId) && AbstractSensorsDataAPI.getConfigOptions().isDataCollectEnable()) {
            this.mAndroidId = SensorsDataUtils.getAndroidID(this.mContext);
        }
        return this.mAndroidId;
    }

    public Map<String, Object> getDeviceInfo() {
        try {
            if (this.mDeviceInfo == null && AbstractSensorsDataAPI.getConfigOptions().isDataCollectEnable()) {
                setupDeviceInfo();
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
        return this.mDeviceInfo;
    }

    public JSONObject getPresetProperties() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.mDeviceInfo == null) {
                setupDeviceInfo();
            }
            jSONObject.put("$app_version", this.mDeviceInfo.get("$app_version"));
            jSONObject.put("$lib", KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID);
            jSONObject.put("$lib_version", this.mDeviceInfo.get("$lib_version"));
            jSONObject.put("$manufacturer", this.mDeviceInfo.get("$manufacturer"));
            jSONObject.put("$model", this.mDeviceInfo.get("$model"));
            jSONObject.put("$brand", this.mDeviceInfo.get("$brand"));
            jSONObject.put("$os", this.mDeviceInfo.get("$os"));
            jSONObject.put("$os_version", this.mDeviceInfo.get("$os_version"));
            jSONObject.put("$screen_height", this.mDeviceInfo.get("$screen_height"));
            jSONObject.put("$screen_width", this.mDeviceInfo.get("$screen_width"));
            String strNetworkType = NetworkUtils.networkType(this.mContext);
            jSONObject.put("$wifi", "WIFI".equals(strNetworkType));
            jSONObject.put("$network_type", strNetworkType);
            jSONObject.put("$carrier", this.mDeviceInfo.get("$carrier"));
            jSONObject.put("$app_id", this.mDeviceInfo.get("$app_id"));
            jSONObject.put("$timezone_offset", this.mDeviceInfo.get("$timezone_offset"));
            if (this.mDeviceInfo.containsKey("$device_id")) {
                jSONObject.put("$device_id", this.mDeviceInfo.get("$device_id"));
            }
            jSONObject.put("$app_name", this.mDeviceInfo.get("$app_name"));
            return jSONObject;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return jSONObject;
        }
    }

    public boolean isAppStartSuccess() {
        return this.isAppStartSuccess;
    }

    public void setAppStartSuccess(boolean z11) {
        this.isAppStartSuccess = z11;
    }

    public SAContextManager(Context context, boolean z11) {
        this.mContext = context;
        this.mDisableTrackDeviceId = z11;
    }
}
