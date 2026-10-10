package cn.jiguang.privates.analysis.business.report;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.analysis.cache.JAnalysisConfig;
import cn.jiguang.privates.analysis.global.JAnalysisGlobal;
import cn.jiguang.privates.analysis.utils.HttpUtil;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.common.observer.JObservable;
import cn.jiguang.privates.common.observer.JObserver;
import cn.jiguang.privates.common.utils.AESUtil;
import cn.jiguang.privates.common.utils.DeviceUtil;
import cn.jiguang.privates.common.utils.GZipUtil;
import cn.jiguang.privates.common.utils.StringUtil;
import cn.jiguang.privates.common.utils.SystemUtil;
import cn.jiguang.privates.core.api.JCorePrivatesApi;
import cn.jiguang.privates.core.global.JCoreGlobal;
import com.tencent.bugly.proguard.C33844oi;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class JReportBusiness {
    public static final String KEY_ACCOUNT_ID = "account_id";
    private static final String KEY_APP_CHANNEL = "channel";
    private static final String KEY_APP_KEY = "app_key";
    private static final String KEY_APP_VERSION = "app_version";
    private static final String KEY_CARRIER = "carrier";
    private static final String KEY_CONTENT = "content";
    private static final String KEY_DEVICE_ID = "device_id";
    private static final String KEY_GENERATION = "generation";
    public static final String KEY_ITIME = "itime";
    private static final String KEY_MAC_ADDRESS = "mac_address";
    private static final String KEY_MANUFACTURER = "manufacturer";
    private static final String KEY_MODEL = "model";
    private static final String KEY_OS_VERSION = "os_version";
    private static final String KEY_PLATFORM = "platform";
    public static final String KEY_RANDOM_ID = "random_id";
    private static final String KEY_REGISTRATION_ID = "registration_id";
    private static final String KEY_RESOLUTION = "resolution";
    private static final String KEY_SSID = "ssid";
    public static final String KEY_TYPE = "type";
    private static final String KEY_UID = "uid";
    private static final String REPORT_FILE_PATH = "cn_jiguang_privates_analysis";
    private static final String REPORT_NORMAL_INTERFACE = "/v1/sdk/report";
    private static final String TAG = "JReportBusiness";
    private static volatile JReportBusiness instance;
    private String cacheParentPath;
    private boolean isReportCaching = false;

    public void report(Context context, String str, JSONObject jSONObject) {
        report(context, prepareReportJson(context, str, jSONObject));
    }

    public static JReportBusiness getInstance() {
        if (instance == null) {
            synchronized (JReportBusiness.class) {
                instance = new JReportBusiness();
            }
        }
        return instance;
    }

    private String getRandomString(int i11) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i12 = 0; i12 < i11; i12++) {
            stringBuffer.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(random.nextInt(62)));
        }
        return stringBuffer.toString();
    }

    private File saveReportContent(Context context, String str) {
        try {
            if (TextUtils.isEmpty(this.cacheParentPath)) {
                File filesDir = context.getFilesDir();
                String appKey = JGlobal.getAppKey(context);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(filesDir.getAbsolutePath());
                String str2 = File.separator;
                sb2.append(str2);
                sb2.append(REPORT_FILE_PATH);
                sb2.append(str2);
                sb2.append(appKey);
                this.cacheParentPath = sb2.toString();
            }
            String str3 = this.cacheParentPath + File.separator + System.currentTimeMillis();
            JCommonLog.m5430d(TAG, "save file:" + str3);
            File file = new File(str3);
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                return null;
            }
            if (!file.exists() && !file.createNewFile()) {
                return null;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(str.getBytes("UTF-8"));
            fileOutputStream.close();
            return file;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "saveReportContent failed " + th2.getMessage());
            return null;
        }
    }

    public void reportCache(Context context) {
        if (this.isReportCaching) {
            JCommonLog.m5430d(TAG, "is reporting cache");
            return;
        }
        JCommonLog.m5430d(TAG, "report cache begin");
        this.isReportCaching = true;
        if (TextUtils.isEmpty(this.cacheParentPath)) {
            this.isReportCaching = false;
            JCommonLog.m5430d(TAG, "there are no report cache");
            return;
        }
        File file = new File(this.cacheParentPath);
        if (!file.exists()) {
            this.isReportCaching = false;
            JCommonLog.m5430d(TAG, "there are no report cache");
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            this.isReportCaching = false;
            JCommonLog.m5430d(TAG, "there are no report cache");
            return;
        }
        List<File> listAsList = Arrays.asList(fileArrListFiles);
        Collections.sort(listAsList, new Comparator<File>() { // from class: cn.jiguang.privates.analysis.business.report.JReportBusiness.1
            @Override // java.util.Comparator
            public int compare(File file2, File file3) {
                long jLastModified = file2.lastModified() - file3.lastModified();
                if (jLastModified < 0) {
                    return -1;
                }
                return jLastModified > 0 ? 1 : 0;
            }
        });
        for (File file2 : listAsList) {
            if (file2.exists()) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file2);
                    byte[] bArr = new byte[fileInputStream.available()];
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                    String str = new String(bArr, "UTF-8");
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    JCommonLog.m5430d(TAG, "reportCache file:" + file2.getAbsolutePath());
                    report(context, jSONObject, file2);
                } catch (Throwable th2) {
                    JCommonLog.m5433w(TAG, "reportCache failed " + th2.getMessage());
                }
            } else {
                JCommonLog.m5430d(TAG, "cacheFile [" + file2.getAbsolutePath() + "] is no exist");
            }
        }
        this.isReportCaching = false;
        JCommonLog.m5430d(TAG, "report cache finish");
    }

    public JSONObject prepareReportJson(Context context, String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        try {
            jSONObject.put("type", str);
            jSONObject.put(KEY_RANDOM_ID, getRandomString(8));
            jSONObject.put("itime", System.currentTimeMillis() / 1000);
            String accountId = JAnalysisConfig.getAccountId(context);
            if (TextUtils.isEmpty(accountId)) {
                jSONObject2 = new JSONObject();
            } else {
                jSONObject2 = new JSONObject(accountId);
            }
            jSONObject.put("account_id", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONObject3.put("content", jSONArray);
            jSONObject3.put("platform", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY);
            jSONObject3.put(KEY_UID, JCorePrivatesApi.getUserId(context));
            jSONObject3.put("device_id", JGlobal.getDeviceId(context));
            jSONObject3.put("registration_id", JCorePrivatesApi.getRegistrationId(context));
            jSONObject3.put("app_version", JGlobal.getAppVersionName(context));
            jSONObject3.put("app_key", JGlobal.getAppKey(context));
            jSONObject3.put("channel", JGlobal.getAppChannel(context));
            jSONObject3.put("model", Build.MODEL);
            jSONObject3.put("manufacturer", Build.MANUFACTURER);
            jSONObject3.put("os_version", String.format(Locale.ENGLISH, Build.VERSION.RELEASE, new Object[0]));
            jSONObject3.put(KEY_RESOLUTION, DeviceUtil.getResolution(context));
            jSONObject3.put(KEY_MAC_ADDRESS, "");
            jSONObject3.put(KEY_CARRIER, DeviceUtil.getCarrier(context));
            jSONObject3.put("ssid", DeviceUtil.getSsid(context));
            jSONObject3.put(KEY_GENERATION, JGlobal.getNetworkName());
            for (JObserver jObserver : JObservable.getInstance().observeQueue) {
                if (jObserver.isSdk() && !TextUtils.isEmpty(jObserver.getSdkName()) && !TextUtils.isEmpty(jObserver.getSdkVersion())) {
                    jSONObject3.put(jObserver.getSdkName(), jObserver.getSdkVersion());
                }
            }
            return jSONObject3;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "prepareReportJson failed " + th2.getMessage());
            return null;
        }
    }

    public void report(Context context, JSONObject jSONObject) {
        try {
            if (report(context, jSONObject, saveReportContent(context, jSONObject.toString())) == 0) {
                reportCache(context);
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "report failed " + th2.getMessage());
        }
    }

    private int report(Context context, JSONObject jSONObject, File file) {
        try {
            if (!SystemUtil.isNetworkConnecting(context)) {
                JCommonLog.m5430d(TAG, "can't report, network is disConnected");
                return -1;
            }
            if (JAnalysisGlobal.getConfig().getReportNetworkState() == 1 && JGlobal.getNetworkType() != 1) {
                JCommonLog.m5433w(TAG, "can't report, current network is not wifi");
                return -1;
            }
            if (JAnalysisGlobal.getConfig().getReportNetworkState() == 2 && JGlobal.getNetworkType() <= 1) {
                JCommonLog.m5433w(TAG, "can't report, current network is not mobile");
                return -1;
            }
            Set<String> httpAddress = JCoreGlobal.getHttpAddress(context);
            if (httpAddress.isEmpty()) {
                return -1;
            }
            byte[] bArrZip = GZipUtil.zip(jSONObject.toString().getBytes("UTF-8"));
            String str = AESUtil.get16Md5AesKey(AESUtil.generateSeed());
            byte[] bArrEncryptBytes = AESUtil.encryptBytes(bArrZip, str, "Ps203a@K!sdkYO8T");
            String deviceId = JGlobal.getDeviceId(context);
            String str2 = "Basic " + Base64.encodeToString((deviceId + C33844oi.f71346o + StringUtil.getMD5Utf8(deviceId + StringUtil.getBytesMD5(bArrEncryptBytes)) + C33844oi.f71346o + str).getBytes(), 10);
            ArrayList<String> arrayList = new ArrayList();
            for (int i11 = 0; i11 < 3; i11++) {
                arrayList.addAll(httpAddress);
            }
            for (String str3 : arrayList) {
                if (!str3.contains(REPORT_NORMAL_INTERFACE)) {
                    str3 = str3 + REPORT_NORMAL_INTERFACE;
                }
                int iPost = HttpUtil.post(context, str3, str2, bArrEncryptBytes);
                if (iPost == 200) {
                    JCommonLog.m5430d(TAG, "report success url:" + str3 + ", fileName:" + file.getName() + JCommonLog.toLogString(jSONObject));
                    if (!file.exists()) {
                        return 0;
                    }
                    boolean zDelete = file.delete();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("delete ");
                    sb2.append(zDelete ? "success" : "failed");
                    sb2.append(" file:");
                    sb2.append(file.getAbsolutePath());
                    JCommonLog.m5430d(TAG, sb2.toString());
                    return 0;
                }
                JCommonLog.m5430d(TAG, "report failed code:" + iPost + ", url:" + str3 + ", file:" + file.getName() + JCommonLog.toLogString(jSONObject));
            }
            return -1;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "report failed " + th2.getMessage());
        }
    }
}
