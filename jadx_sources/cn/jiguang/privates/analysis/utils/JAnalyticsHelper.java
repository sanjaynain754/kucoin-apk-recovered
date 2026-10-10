package cn.jiguang.privates.analysis.utils;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.common.utils.DeviceUtil;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class JAnalyticsHelper {
    private static final String TAG = "JAnalyticsHelper";
    private static Pattern keyPattern = Pattern.compile("^[a-zA-Z0-9_]+");

    public static String getBundleString(Bundle bundle, String str) {
        Object obj;
        if (bundle == null || (obj = bundle.get(str)) == null) {
            return null;
        }
        return obj.toString();
    }

    public static boolean isValidKey(String str) {
        try {
            if (str == null) {
                JCommonLog.m5433w(TAG, "key is null");
                return false;
            }
            if (!keyPattern.matcher(str).matches()) {
                JCommonLog.m5433w(TAG, "key is invalid, key:" + str);
                return false;
            }
            if (str.getBytes().length <= 256) {
                return true;
            }
            JCommonLog.m5433w(TAG, "key: [" + str + "] length can't be no more than 256");
            return false;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "isValidKey t:" + th2.getMessage());
            return false;
        }
    }

    private static String cutoutString(String str) {
        try {
            byte[] bytes = str.getBytes("utf-8");
            if (256 > bytes.length) {
                return str;
            }
            String str2 = new String(bytes, 0, 256, "utf-8");
            JCommonLog.m5430d(TAG, "cutout value:" + str2);
            return str2;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "cutoutString failed " + th2.getMessage());
            return str;
        }
    }

    public static Object cutoutValue(Object obj) {
        try {
            if (obj instanceof String) {
                return cutoutString((String) obj);
            }
            if (obj instanceof Short) {
                return Short.valueOf(cutoutString(Short.toString(((Short) obj).shortValue())));
            }
            if (obj instanceof Integer) {
                return Integer.valueOf(cutoutString(Integer.toString(((Integer) obj).intValue())));
            }
            if (obj instanceof Long) {
                return Long.valueOf(cutoutString(Long.toString(((Long) obj).longValue())));
            }
            if (obj instanceof Float) {
                return Float.valueOf(cutoutString(Float.toString(((Float) obj).floatValue())));
            }
            if (obj instanceof Double) {
                return Double.valueOf(cutoutString(Double.toString(((Double) obj).doubleValue())));
            }
            if (obj instanceof Byte) {
                return Byte.valueOf(cutoutString(Byte.toString(((Byte) obj).byteValue())));
            }
            if (obj instanceof Boolean) {
                return obj;
            }
            JCommonLog.m5433w(TAG, "value:" + obj + " is no basic data type");
            return null;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "cutoutValue failed " + th2.getMessage());
            return obj;
        }
    }

    public static JSONObject getDeviceInfo(Context context) {
        String str;
        try {
            String cpuInfo = DeviceUtil.getCpuInfo();
            String resolution = DeviceUtil.getResolution(context);
            Locale locale = Locale.ENGLISH;
            String str2 = String.format(locale, "%.1f", Double.valueOf(DeviceUtil.getScreenSize(context)));
            String str3 = String.format(locale, Build.VERSION.RELEASE, new Object[0]);
            String str4 = String.format(locale, Build.MODEL, new Object[0]);
            String str5 = String.format(locale, Build.BRAND, new Object[0]);
            String str6 = String.format(locale, Build.PRODUCT, new Object[0]);
            String str7 = String.format(locale, Build.FINGERPRINT, new Object[0]);
            String string = context.getResources().getConfiguration().locale.toString();
            String str8 = String.format(locale, Build.MANUFACTURER, new Object[0]);
            long rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
            if (rawOffset > 0) {
                str = "+" + rawOffset;
            } else if (rawOffset < 0) {
                str = C33820nf.f71144W + rawOffset;
            } else {
                str = "" + rawOffset;
            }
            long ramSize = DeviceUtil.getRamSize(context);
            long romSize = DeviceUtil.getRomSize(context);
            int cpuCoreCount = DeviceUtil.getCpuCoreCount();
            String cpuHardwareInfo = DeviceUtil.getCpuHardwareInfo();
            int cPUMaxFreqKHz = DeviceUtil.getCPUMaxFreqKHz();
            String str9 = str;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cpu_info", TextUtils.isEmpty(cpuInfo) ? "" : cpuInfo);
            jSONObject.put("cpu_count", cpuCoreCount);
            jSONObject.put("cpu_max_freq", cPUMaxFreqKHz);
            jSONObject.put("cpu_hardware", cpuHardwareInfo);
            jSONObject.put("ram", ramSize);
            jSONObject.put("rom", romSize);
            jSONObject.put("resolution", TextUtils.isEmpty(resolution) ? "" : resolution);
            jSONObject.put("screensize", TextUtils.isEmpty(str2) ? "" : str2);
            jSONObject.put("os_version", TextUtils.isEmpty(str3) ? "" : str3);
            jSONObject.put("model", TextUtils.isEmpty(str4) ? "" : str4);
            jSONObject.put(C33820nf.f71125D, TextUtils.isEmpty(str5) ? "" : str5);
            if (TextUtils.isEmpty(str6)) {
                str6 = "";
            }
            jSONObject.put("product", str6);
            TextUtils.isEmpty("");
            jSONObject.put("serial", "");
            if (TextUtils.isEmpty(str7)) {
                str7 = "";
            }
            jSONObject.put("fingerprint", str7);
            if (TextUtils.isEmpty(string)) {
                string = "";
            }
            jSONObject.put("language", string);
            jSONObject.put("manufacturer", TextUtils.isEmpty(str8) ? "" : str8);
            jSONObject.put("timezone", TextUtils.isEmpty(str9) ? "" : str9);
            jSONObject.put(TPDownloadProxyEnum.USER_MAC, "");
            jSONObject.put("meid", "");
            return jSONObject;
        } catch (JSONException e11) {
            JCommonLog.m5433w(TAG, "package json exception: " + e11.getMessage());
            return null;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "getDeviceInfo exception: " + th2.getMessage());
            return null;
        }
    }

    public static String getMD5String(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[charArray.length];
            for (int i11 = 0; i11 < charArray.length; i11++) {
                bArr[i11] = (byte) charArray[i11];
            }
            byte[] bArrDigest = messageDigest.digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b11 : bArrDigest) {
                int i12 = b11 & 255;
                if (i12 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i12));
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean isValidId(String str) {
        try {
            if (str == null) {
                JCommonLog.m5433w(TAG, "id is null");
                return false;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (str.getBytes().length <= 256) {
                return true;
            }
            JCommonLog.m5433w(TAG, "id: [" + str + "] length can't be no more than 256");
            return false;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "isValidId t:" + th2.getMessage());
            return false;
        }
    }

    public static boolean isValidValue(Object obj) {
        if (obj != null) {
            return true;
        }
        try {
            JCommonLog.m5433w(TAG, "value is null");
            return false;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "isValidValue t:" + th2.getMessage());
            return true;
        }
    }

    public static boolean isValidParam(String str, Object obj) {
        if (isValidKey(str) && isValidValue(obj)) {
            return true;
        }
        return false;
    }
}
