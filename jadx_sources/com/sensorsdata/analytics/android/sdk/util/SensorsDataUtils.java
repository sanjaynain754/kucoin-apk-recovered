package com.sensorsdata.analytics.android.sdk.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import androidx.appcompat.app.AppCompatActivity;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import com.sensorsdata.analytics.android.sdk.AopConstants;
import com.sensorsdata.analytics.android.sdk.C27650R;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.ScreenAutoTracker;
import com.sensorsdata.analytics.android.sdk.SensorsDataAutoTrackAppViewScreenUrl;
import com.tencent.bugly.proguard.C33872q4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public final class SensorsDataUtils {
    public static final String COMMAND_HARMONYOS_VERSION = "getprop hw_sc.build.platform.version";
    private static final String SHARED_PREF_APP_VERSION = "sensorsdata.app.version";
    private static final String SHARED_PREF_DEVICE_ID_KEY = "sensorsdata.device.id";
    private static final String SHARED_PREF_EDITS_FILE = "sensorsdata";
    private static final String SHARED_PREF_USER_AGENT_KEY = "sensorsdata.user.agent";
    private static final String TAG = "SA.SensorsDataUtils";
    private static final String marshmallowMacAddress = "02:00:00:00:00:00";
    private static final Set<String> mPermissionGrantedSet = new HashSet();
    private static final Map<String, String> deviceUniqueIdentifiersMap = new HashMap();
    private static final Map<String, String> sCarrierMap = new HashMap<String, String>() { // from class: com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils.1
        {
            put("46000", "中国移动");
            put("46002", "中国移动");
            put("46007", "中国移动");
            put("46008", "中国移动");
            put("46001", "中国联通");
            put("46006", "中国联通");
            put("46009", "中国联通");
            put("46003", "中国电信");
            put("46005", "中国电信");
            put("46011", "中国电信");
            put("46004", "中国卫通");
            put("46020", "中国铁通");
        }
    };
    private static final List<String> mInvalidAndroidId = new ArrayList<String>() { // from class: com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils.2
        {
            add("9774d56d682e549c");
            add("0123456789abcdef");
        }
    };

    public static String getActivityTitle(Activity activity) {
        PackageManager packageManager;
        if (activity != null) {
            try {
                String toolbarTitle = getToolbarTitle(activity);
                if (TextUtils.isEmpty(toolbarTitle)) {
                    toolbarTitle = null;
                }
                if (TextUtils.isEmpty(toolbarTitle)) {
                    toolbarTitle = activity.getTitle().toString();
                }
                if (TextUtils.isEmpty(toolbarTitle) && (packageManager = activity.getPackageManager()) != null) {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(activity.getComponentName(), 0);
                    if (!TextUtils.isEmpty(activityInfo.loadLabel(packageManager))) {
                        return activityInfo.loadLabel(packageManager).toString();
                    }
                }
                return toolbarTitle;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    public static String getCarrier(Context context) {
        String simOperatorName;
        try {
            try {
                if (checkHasPermission(context, C33872q4.f71536c)) {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                        if (telephonyManager != null) {
                            String simOperator = telephonyManager.getSimOperator();
                            if (Build.VERSION.SDK_INT >= 28) {
                                CharSequence simCarrierIdName = telephonyManager.getSimCarrierIdName();
                                if (TextUtils.isEmpty(simCarrierIdName)) {
                                    simOperatorName = null;
                                } else {
                                    simOperatorName = simCarrierIdName.toString();
                                }
                            } else {
                                simOperatorName = null;
                            }
                            if (TextUtils.isEmpty(simOperatorName)) {
                                simOperatorName = telephonyManager.getSimState() == 5 ? telephonyManager.getSimOperatorName() : "未知";
                            }
                            if (!TextUtils.isEmpty(simOperator)) {
                                return operatorToCarrier(context, simOperator, simOperatorName);
                            }
                        }
                    } catch (Exception e11) {
                        SALog.printStackTrace(e11);
                    }
                }
            } catch (Error e12) {
                SALog.m68589i(TAG, e12.toString());
            }
        } catch (Exception e13) {
            SALog.printStackTrace(e13);
        }
        return null;
    }

    public static String getIMEIOld(Context context) {
        return getDeviceID(context, -1);
    }

    public static String getMEID(Context context) {
        return getDeviceID(context, -2);
    }

    public static String getScreenUrl(Object obj) {
        String strUrl = null;
        if (obj == null) {
            return null;
        }
        try {
            if (obj instanceof ScreenAutoTracker) {
                strUrl = ((ScreenAutoTracker) obj).getScreenUrl();
            } else {
                SensorsDataAutoTrackAppViewScreenUrl sensorsDataAutoTrackAppViewScreenUrl = (SensorsDataAutoTrackAppViewScreenUrl) obj.getClass().getAnnotation(SensorsDataAutoTrackAppViewScreenUrl.class);
                if (sensorsDataAutoTrackAppViewScreenUrl != null) {
                    strUrl = sensorsDataAutoTrackAppViewScreenUrl.url();
                }
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
        return strUrl == null ? obj.getClass().getCanonicalName() : strUrl;
    }

    @TargetApi(11)
    public static String getToolbarTitle(Activity activity) {
        Object objInvoke;
        CharSequence charSequence;
        try {
            if ("com.tencent.connect.common.AssistActivity".equals(activity.getClass().getCanonicalName())) {
                if (TextUtils.isEmpty(activity.getTitle())) {
                    return null;
                }
                return activity.getTitle().toString();
            }
            ActionBar actionBar = activity.getActionBar();
            if (actionBar == null) {
                try {
                    Class<?> clsCompatActivity = compatActivity();
                    if (clsCompatActivity != null && clsCompatActivity.isInstance(activity) && (objInvoke = activity.getClass().getMethod("getSupportActionBar", new Class[0]).invoke(activity, new Object[0])) != null && (charSequence = (CharSequence) objInvoke.getClass().getMethod("getTitle", new Class[0]).invoke(objInvoke, new Object[0])) != null) {
                        return charSequence.toString();
                    }
                } catch (Exception unused) {
                }
            } else if (!TextUtils.isEmpty(actionBar.getTitle())) {
                return actionBar.getTitle().toString();
            }
            return null;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public static boolean isDoubleClick(View view) {
        if (view == null) {
            return false;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i11 = C27650R.id.sensors_analytics_tag_view_onclick_timestamp;
            String str = (String) view.getTag(i11);
            if (!TextUtils.isEmpty(str) && jElapsedRealtime - Long.parseLong(str) < 500) {
                return true;
            }
            view.setTag(i11, String.valueOf(jElapsedRealtime));
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
        return false;
    }

    public static boolean checkHasPermission(Context context, String str) {
        Class<ContextCompat> cls;
        Class<ContextCompat> cls2 = ContextCompat.class;
        try {
            if (mPermissionGrantedSet.contains(str)) {
                return true;
            }
            try {
                int i11 = ContextCompat.RECEIVER_VISIBLE_TO_INSTANT_APPS;
                cls = cls2;
            } catch (Exception unused) {
                cls = null;
            }
            if (cls == null) {
                try {
                    int i12 = ContextCompat.RECEIVER_VISIBLE_TO_INSTANT_APPS;
                } catch (Exception unused2) {
                    cls2 = cls;
                }
            } else {
                cls2 = cls;
            }
            if (cls2 == null) {
                mPermissionGrantedSet.add(str);
                return true;
            }
            if (((Integer) cls2.getMethod("checkSelfPermission", Context.class, String.class).invoke(null, context, str)).intValue() == 0) {
                mPermissionGrantedSet.add(str);
                return true;
            }
            SALog.m68589i(TAG, "You can fix this by adding the following to your AndroidManifest.xml file:\n<uses-permission android:name=\"" + str + "\" />");
            return false;
        } catch (Exception e11) {
            SALog.m68589i(TAG, e11.toString());
            return true;
        }
    }

    private static Class<?> compatActivity() {
        Class<?> cls;
        try {
            int i11 = AppCompatActivity.f1176d;
            cls = AppCompatActivity.class;
        } catch (Exception unused) {
            cls = null;
        }
        if (cls == null) {
            try {
                int i12 = AppCompatActivity.f1176d;
                return AppCompatActivity.class;
            } catch (Exception unused2) {
            }
        }
        return cls;
    }

    private static String getCarrierFromJsonObject(JSONObject jSONObject, String str) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private static String getDeviceID(Context context, int i11) {
        TelephonyManager telephonyManager;
        String deviceId;
        String str = "";
        try {
            String str2 = "deviceID" + i11;
            Map<String, String> map = deviceUniqueIdentifiersMap;
            str = map.containsKey(str2) ? map.get(str2) : "";
            if (TextUtils.isEmpty(str) && hasReadPhoneStatePermission(context) && (telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)) != null) {
                if (i11 == -1) {
                    deviceId = telephonyManager.getDeviceId();
                } else {
                    deviceId = (i11 != -2 || Build.VERSION.SDK_INT < 26) ? telephonyManager.getDeviceId(i11) : telephonyManager.getMeid();
                }
                str = deviceId;
                map.put(str2, str);
            }
            return str;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return str;
        }
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    public static String getIMEI(Context context) {
        TelephonyManager telephonyManager;
        String imei;
        String str = "";
        try {
            Map<String, String> map = deviceUniqueIdentifiersMap;
            str = map.containsKey("IMEI") ? map.get("IMEI") : "";
            if (TextUtils.isEmpty(str) && hasReadPhoneStatePermission(context) && (telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)) != null) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 > 28) {
                    if (telephonyManager.hasCarrierPrivileges()) {
                        imei = telephonyManager.getImei();
                    }
                    map.put("IMEI", str);
                } else {
                    imei = i11 >= 26 ? telephonyManager.getImei() : telephonyManager.getDeviceId();
                }
                str = imei;
                map.put("IMEI", str);
            }
            return str;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return str;
        }
    }

    private static String getJsonFromAssets(String str, Context context) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(context.getAssets().open(str)));
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            sb2.append(line);
                        } catch (IOException e11) {
                            e = e11;
                            bufferedReader = bufferedReader2;
                            SALog.printStackTrace(e);
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return sb2.toString();
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e12) {
                                    SALog.printStackTrace(e12);
                                }
                            }
                            throw th;
                        }
                    }
                    bufferedReader2.close();
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e13) {
                e = e13;
            }
        } catch (IOException e14) {
            SALog.printStackTrace(e14);
        }
        return sb2.toString();
    }

    @SuppressLint({"HardwareIds"})
    public static String getMacAddress(Context context) {
        WifiManager wifiManager;
        WifiInfo connectionInfo;
        String str = marshmallowMacAddress;
        String macAddress = "";
        try {
            Map<String, String> map = deviceUniqueIdentifiersMap;
            macAddress = map.containsKey("macAddress") ? map.get("macAddress") : "";
            if (!TextUtils.isEmpty(macAddress) || !checkHasPermission(context, "android.permission.ACCESS_WIFI_STATE") || (wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi")) == null || (connectionInfo = wifiManager.getConnectionInfo()) == null || connectionInfo.getMacAddress() == null) {
                return macAddress;
            }
            macAddress = connectionInfo.getMacAddress();
            if (marshmallowMacAddress.equals(macAddress)) {
                String macAddressByInterface = getMacAddressByInterface();
                if (macAddressByInterface != null) {
                    str = macAddressByInterface;
                }
            } else {
                str = macAddress;
            }
            try {
                map.put("macAddress", str);
                return str;
            } catch (Exception e11) {
                e = e11;
                macAddress = str;
            }
        } catch (Exception e12) {
            e = e12;
        }
        SALog.printStackTrace(e);
        return macAddress;
    }

    public static void getScreenNameAndTitleFromActivity(JSONObject jSONObject, Activity activity) {
        PackageManager packageManager;
        if (activity == null || jSONObject == null) {
            return;
        }
        try {
            jSONObject.put(AopConstants.SCREEN_NAME, activity.getClass().getCanonicalName());
            String string = !TextUtils.isEmpty(activity.getTitle()) ? activity.getTitle().toString() : null;
            String toolbarTitle = getToolbarTitle(activity);
            if (!TextUtils.isEmpty(toolbarTitle)) {
                string = toolbarTitle;
            }
            if (TextUtils.isEmpty(string) && (packageManager = activity.getPackageManager()) != null) {
                string = packageManager.getActivityInfo(activity.getComponentName(), 0).loadLabel(packageManager).toString();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            jSONObject.put(AopConstants.TITLE, string);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    private static boolean hasReadPhoneStatePermission(Context context) {
        if (Build.VERSION.SDK_INT > 28) {
            if (checkHasPermission(context, "android.permission.READ_PRECISE_PHONE_STATE")) {
                return true;
            }
            SALog.m68589i(TAG, "Don't have permission android.permission.READ_PRECISE_PHONE_STATE,getDeviceID failed");
            return false;
        }
        if (checkHasPermission(context, C33872q4.f71536c)) {
            return true;
        }
        SALog.m68589i(TAG, "Don't have permission android.permission.READ_PHONE_STATE,getDeviceID failed");
        return false;
    }

    public static JSONObject mergeSuperJSONObject(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Iterator<String> itKeys2 = jSONObject2.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    if (!TextUtils.isEmpty(next) && next.equalsIgnoreCase(next2)) {
                        itKeys2.remove();
                    }
                }
            }
            mergeJSONObject(jSONObject, jSONObject2);
            return jSONObject2;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return jSONObject2;
        }
    }

    public static boolean checkVersionIsNew(Context context, String str) {
        try {
            SharedPreferences sharedPreferences = getSharedPreferences(context);
            String string = sharedPreferences.getString(SHARED_PREF_APP_VERSION, "");
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                sharedPreferences.edit().putString(SHARED_PREF_APP_VERSION, str).apply();
                return true;
            }
            return false;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return true;
        }
    }

    @SuppressLint({"HardwareIds"})
    public static String getAndroidID(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return "";
        }
    }

    private static String getMacAddressByInterface() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if ("wlan0".equalsIgnoreCase(networkInterface.getName())) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (byte b11 : hardwareAddress) {
                        sb2.append(String.format("%02X:", Byte.valueOf(b11)));
                    }
                    if (sb2.length() > 0) {
                        sb2.deleteCharAt(sb2.length() - 1);
                    }
                    return sb2.toString();
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static SharedPreferences getSharedPreferences(Context context) {
        return context.getSharedPreferences("sensorsdata", 0);
    }

    public static String getSlot(Context context, int i11) {
        return getDeviceID(context, i11);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:3:0x0004, B:10:0x0032, B:12:0x0038, B:15:0x0041, B:17:0x0047, B:9:0x002b, B:5:0x0012, B:7:0x0026), top: B:21:0x0004, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0047 A[Catch: Exception -> 0x003f, TRY_LEAVE, TryCatch #0 {Exception -> 0x003f, blocks: (B:3:0x0004, B:10:0x0032, B:12:0x0038, B:15:0x0041, B:17:0x0047, B:9:0x002b, B:5:0x0012, B:7:0x0026), top: B:21:0x0004, inners: #1 }] */
    @Deprecated
    public static String getUserAgent(Context context) {
        try {
            SharedPreferences sharedPreferences = getSharedPreferences(context);
            String string = sharedPreferences.getString(SHARED_PREF_USER_AGENT_KEY, null);
            if (TextUtils.isEmpty(string)) {
                try {
                    if (Class.forName("android.webkit.WebSettings").getMethod("getDefaultUserAgent", Context.class) != null) {
                        string = WebSettings.getDefaultUserAgent(context);
                        if (TextUtils.isEmpty(string)) {
                            string = System.getProperty("http.agent");
                        }
                        if (!TextUtils.isEmpty(string)) {
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.putString(SHARED_PREF_USER_AGENT_KEY, string);
                            editorEdit.apply();
                        }
                    } else {
                        if (TextUtils.isEmpty(string)) {
                            string = System.getProperty("http.agent");
                        }
                        if (!TextUtils.isEmpty(string)) {
                            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                            editorEdit2.putString(SHARED_PREF_USER_AGENT_KEY, string);
                            editorEdit2.apply();
                        }
                    }
                } catch (Exception unused) {
                    SALog.m68589i(TAG, "WebSettings NoSuchMethod: getDefaultUserAgent");
                }
            }
            return string;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return null;
        }
    }

    public static void handleSchemeUrl(Activity activity, Intent intent) {
        SASchemeHelper.handleSchemeUrl(activity, intent);
    }

    public static boolean isValidAndroidId(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return !mInvalidAndroidId.contains(str.toLowerCase(Locale.getDefault()));
    }

    public static void mergeJSONObject(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if ((obj instanceof Date) && !"$time".equals(next)) {
                    jSONObject2.put(next, TimeUtils.formatDate((Date) obj, Locale.CHINA));
                } else {
                    jSONObject2.put(next, obj);
                }
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    private static String operatorToCarrier(Context context, String str, String str2) throws Throwable {
        try {
            if (!TextUtils.isEmpty(str)) {
                Map<String, String> map = sCarrierMap;
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                String jsonFromAssets = getJsonFromAssets("sa_mcc_mnc_mini.json", context);
                if (TextUtils.isEmpty(jsonFromAssets)) {
                    map.put(str, str2);
                    return str2;
                }
                String carrierFromJsonObject = getCarrierFromJsonObject(new JSONObject(jsonFromAssets), str);
                if (!TextUtils.isEmpty(carrierFromJsonObject)) {
                    map.put(str, carrierFromJsonObject);
                    return carrierFromJsonObject;
                }
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
        return str2;
    }
}
