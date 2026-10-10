package com.sensorsdata.analytics.android.sdk.advert.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbAdapter;
import com.sensorsdata.analytics.android.sdk.exceptions.InvalidDataException;
import com.sensorsdata.analytics.android.sdk.util.SADataHelper;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class ChannelUtils {
    private static final String SHARED_PREF_CORRECT_TRACK_INSTALLATION = "sensorsdata.correct.track.installation";
    private static final String SHARED_PREF_UTM_FILE = "sensorsdata.utm";
    private static final String UTM_CAMPAIGN_KEY = "SENSORS_ANALYTICS_UTM_CAMPAIGN";
    private static final String UTM_CONTENT_KEY = "SENSORS_ANALYTICS_UTM_CONTENT";
    private static final String UTM_MEDIUM_KEY = "SENSORS_ANALYTICS_UTM_MEDIUM";
    private static final String UTM_SOURCE_KEY = "SENSORS_ANALYTICS_UTM_SOURCE";
    private static final String UTM_TERM_KEY = "SENSORS_ANALYTICS_UTM_TERM";
    private static HashSet<String> sChannelSourceKeySet = new HashSet<>();
    private static final HashMap<String, String> UTM_MAP = new HashMap<String, String>() { // from class: com.sensorsdata.analytics.android.sdk.advert.utils.ChannelUtils.1
        {
            put(ChannelUtils.UTM_SOURCE_KEY, "$utm_source");
            put(ChannelUtils.UTM_MEDIUM_KEY, "$utm_medium");
            put(ChannelUtils.UTM_TERM_KEY, "$utm_term");
            put(ChannelUtils.UTM_CONTENT_KEY, "$utm_content");
            put(ChannelUtils.UTM_CAMPAIGN_KEY, "$utm_campaign");
        }
    };
    private static final HashMap<String, String> UTM_LINK_MAP = new HashMap<String, String>() { // from class: com.sensorsdata.analytics.android.sdk.advert.utils.ChannelUtils.2
        {
            put(ChannelUtils.UTM_SOURCE_KEY, "utm_source");
            put(ChannelUtils.UTM_MEDIUM_KEY, "utm_medium");
            put(ChannelUtils.UTM_TERM_KEY, "utm_term");
            put(ChannelUtils.UTM_CONTENT_KEY, "utm_content");
            put(ChannelUtils.UTM_CAMPAIGN_KEY, "utm_campaign");
        }
    };
    private static final Map<String, String> LATEST_UTM_MAP = new HashMap<String, String>() { // from class: com.sensorsdata.analytics.android.sdk.advert.utils.ChannelUtils.3
        {
            put(ChannelUtils.UTM_SOURCE_KEY, "$latest_utm_source");
            put(ChannelUtils.UTM_MEDIUM_KEY, "$latest_utm_medium");
            put(ChannelUtils.UTM_TERM_KEY, "$latest_utm_term");
            put(ChannelUtils.UTM_CONTENT_KEY, "$latest_utm_content");
            put(ChannelUtils.UTM_CAMPAIGN_KEY, "$latest_utm_campaign");
        }
    };
    private static Map<String, String> sUtmProperties = new HashMap();
    private static Map<String, String> sLatestUtmProperties = new HashMap();

    public static boolean checkDeviceInfo(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("##");
            HashMap map = new HashMap();
            if (strArrSplit.length == 0) {
                return false;
            }
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.trim().split("=");
                if (strArrSplit2.length == 2) {
                    map.put(strArrSplit2[0], strArrSplit2[1]);
                }
            }
            if (map.isEmpty()) {
                return false;
            }
            if ((map.containsKey("oaid") && TextUtils.equals((CharSequence) map.get("oaid"), OaidHelper.getOAID(context))) || ((map.containsKey("imei") && TextUtils.equals((CharSequence) map.get("imei"), SensorsDataUtils.getIMEI(context))) || ((map.containsKey("imei_old") && TextUtils.equals((CharSequence) map.get("imei_old"), SensorsDataUtils.getIMEIOld(context))) || ((map.containsKey("imei_slot1") && TextUtils.equals((CharSequence) map.get("imei_slot1"), SensorsDataUtils.getSlot(context, 0))) || ((map.containsKey("imei_slot2") && TextUtils.equals((CharSequence) map.get("imei_slot2"), SensorsDataUtils.getSlot(context, 1))) || ((map.containsKey("imei_meid") && TextUtils.equals((CharSequence) map.get("imei_meid"), SensorsDataUtils.getMEID(context))) || ((map.containsKey("android_id") && TextUtils.equals((CharSequence) map.get("android_id"), SensorsDataUtils.getAndroidID(context))) || (map.containsKey(TPDownloadProxyEnum.USER_MAC) && TextUtils.equals((CharSequence) map.get(TPDownloadProxyEnum.USER_MAC), SensorsDataUtils.getMacAddress(context)))))))))) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasLinkUtmProperties(Set<String> set) {
        if (set != null && !set.isEmpty()) {
            for (Map.Entry<String, String> entry : UTM_LINK_MAP.entrySet()) {
                if (entry != null && set.contains(entry.getValue())) {
                    return true;
                }
            }
            for (String str : sChannelSourceKeySet) {
                if (!TextUtils.isEmpty(str) && sChannelSourceKeySet.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasUtmByMetaData(Context context) {
        if (context == null) {
            return false;
        }
        for (Map.Entry<String, String> entry : UTM_MAP.entrySet()) {
            if (entry != null && !TextUtils.isEmpty(getApplicationMetaData(context, entry.getKey()))) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasUtmProperties(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        for (Map.Entry<String, String> entry : UTM_MAP.entrySet()) {
            if (entry != null && jSONObject.has(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCorrectTrackInstallation(Context context) {
        try {
            return SensorsDataUtils.getSharedPreferences(context).getBoolean(SHARED_PREF_CORRECT_TRACK_INSTALLATION, false);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return false;
        }
    }

    public static boolean isGetDeviceInfo(Context context, String str, String str2) {
        try {
            return (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(SensorsDataUtils.getIMEI(context)) && TextUtils.isEmpty(SensorsDataUtils.getIMEIOld(context)) && TextUtils.isEmpty(SensorsDataUtils.getSlot(context, 0)) && TextUtils.isEmpty(SensorsDataUtils.getSlot(context, 1)) && TextUtils.isEmpty(SensorsDataUtils.getMEID(context))) ? false : true;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return false;
        }
    }

    public static JSONObject checkOrSetChannelCallbackEvent(boolean z11, String str, JSONObject jSONObject, Context context) {
        if (z11) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("$is_channel_callback_event", isFirstChannelEvent(str));
                if (context != null && !hasUtmProperties(jSONObject)) {
                    mergeUtmByMetaData(context, jSONObject);
                }
                jSONObject.put("$channel_device_info", "1");
            } catch (JSONException e11) {
                SALog.printStackTrace(e11);
            }
        }
        return jSONObject;
    }

    public static void clearMemoryUtm() {
        sUtmProperties.clear();
        sLatestUtmProperties.clear();
    }

    public static JSONObject getLatestUtmProperties() {
        return sLatestUtmProperties.size() > 0 ? new JSONObject(sLatestUtmProperties) : new JSONObject();
    }

    public static JSONObject getUtmProperties() {
        return sUtmProperties.size() > 0 ? new JSONObject(sUtmProperties) : new JSONObject();
    }

    public static void mergeUtmByMetaData(Context context, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        for (Map.Entry<String, String> entry : UTM_MAP.entrySet()) {
            if (entry != null) {
                String applicationMetaData = getApplicationMetaData(context, entry.getKey());
                if (!TextUtils.isEmpty(applicationMetaData)) {
                    jSONObject.put(entry.getValue(), applicationMetaData);
                }
            }
        }
    }

    public static void mergeUtmToEndData(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.startsWith("$latest") || next.startsWith("_latest")) {
                    jSONObject2.put(next, jSONObject.getString(next));
                }
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public static void parseParams(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        for (Map.Entry<String, String> entry : UTM_LINK_MAP.entrySet()) {
            String str = map.get(entry.getValue());
            if (!TextUtils.isEmpty(str)) {
                sUtmProperties.put(UTM_MAP.get(entry.getKey()), str);
                sLatestUtmProperties.put(LATEST_UTM_MAP.get(entry.getKey()), str);
            }
        }
        for (String str2 : sChannelSourceKeySet) {
            try {
                SADataHelper.assertKey(str2);
                String str3 = map.get(str2);
                if (!TextUtils.isEmpty(str3)) {
                    sUtmProperties.put(str2, str3);
                    sLatestUtmProperties.put("_latest_" + str2, str3);
                }
            } catch (InvalidDataException e11) {
                SALog.printStackTrace(e11);
            }
        }
    }

    public static void removeDeepLinkInfo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.startsWith("$latest") || next.startsWith("_latest")) {
                    itKeys.remove();
                }
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public static void saveDeepLinkInfo(Context context) {
        try {
            if (sLatestUtmProperties.size() > 0) {
                SensorsDataUtils.getSharedPreferences(context).edit().putString(SHARED_PREF_UTM_FILE, sLatestUtmProperties.toString()).apply();
            } else {
                clearLocalUtm(context);
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public static void setSourceChannelKeys(String... strArr) {
        sChannelSourceKeySet.clear();
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                sChannelSourceKeySet.add(str);
            }
        }
    }

    public static void clearLocalUtm(Context context) {
        try {
            SensorsDataUtils.getSharedPreferences(context).edit().putString(SHARED_PREF_UTM_FILE, "").apply();
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public static void clearUtm(Context context) {
        clearMemoryUtm();
        clearLocalUtm(context);
    }

    private static String getApplicationMetaData(Context context, String str) {
        int i11;
        try {
            ApplicationInfo applicationInfo = context.getApplicationContext().getPackageManager().getApplicationInfo(context.getApplicationContext().getPackageName(), 128);
            String string = applicationInfo.metaData.getString(str);
            if (string == null) {
                i11 = applicationInfo.metaData.getInt(str, -1);
            } else {
                i11 = -1;
            }
            if (i11 != -1) {
                return String.valueOf(i11);
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getDeviceInfo(Context context, String str, String str2) {
        return String.format("android_id=%s##imei=%s##imei_old=%s##imei_slot1=%s##imei_slot2=%s##imei_meid=%s##mac=%s##oaid=%s", str, SensorsDataUtils.getIMEI(context), SensorsDataUtils.getIMEIOld(context), SensorsDataUtils.getSlot(context, 0), SensorsDataUtils.getSlot(context, 1), SensorsDataUtils.getMEID(context), SensorsDataUtils.getMacAddress(context), str2);
    }

    public static boolean isFirstChannelEvent(String str) {
        boolean zIsFirstChannelEvent = DbAdapter.getInstance().isFirstChannelEvent(str);
        if (zIsFirstChannelEvent) {
            DbAdapter.getInstance().addChannelEvent(str);
        }
        return zIsFirstChannelEvent;
    }

    public static boolean isTrackInstallation(Context context) {
        try {
            return SensorsDataUtils.getSharedPreferences(context).contains(SHARED_PREF_CORRECT_TRACK_INSTALLATION);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return false;
        }
    }

    public static void loadUtmByLocal(Context context) {
        try {
            SharedPreferences sharedPreferences = SensorsDataUtils.getSharedPreferences(context);
            sLatestUtmProperties.clear();
            String string = sharedPreferences.getString(SHARED_PREF_UTM_FILE, "");
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<Map.Entry<String, String>> it = LATEST_UTM_MAP.entrySet().iterator();
                while (it.hasNext()) {
                    String value = it.next().getValue();
                    if (jSONObject.has(value)) {
                        sLatestUtmProperties.put(value, jSONObject.optString(value));
                    }
                }
                Iterator<String> it2 = sChannelSourceKeySet.iterator();
                while (it2.hasNext()) {
                    String str = "_latest_" + it2.next();
                    if (jSONObject.has(str)) {
                        sLatestUtmProperties.put(str, jSONObject.optString(str));
                    }
                }
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public static void saveCorrectTrackInstallation(Context context, boolean z11) {
        try {
            SensorsDataUtils.getSharedPreferences(context).edit().putBoolean(SHARED_PREF_CORRECT_TRACK_INSTALLATION, z11).apply();
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }
}
