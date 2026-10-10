package com.tencent.qcloud.tuicore;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.kubi.p110rn.Constants;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.imsdk.p128v2.V2TIMUserFullInfo;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes56.dex */
public class TUIConfig {
    private static final String CRASH_LOG_DIR_SUFFIX = "/crash/";
    private static final String FILE_DOWNLOAD_DIR_SUFFIX = "/file/download/";
    public static final String IMAGE_BASE_DIR_SUFFIX = "/image/";
    private static final String IMAGE_DOWNLOAD_DIR_SUFFIX = "/image/download/";
    private static final String MEDIA_DIR_SUFFIX = "/media/";
    public static final String RECORD_DIR_SUFFIX = "/record/";
    private static final String RECORD_DOWNLOAD_DIR_SUFFIX = "/record/download/";
    public static final String TUICORE_SETTINGS_SP_NAME = "TUICoreSettings";
    public static final int TUI_HOST_TYPE_IMAPP = 0;
    public static final int TUI_HOST_TYPE_RTCUBE = 1;
    public static final String VIDEO_BASE_DIR_SUFFIX = "/video/";
    private static final String VIDEO_DOWNLOAD_DIR_SUFFIX = "/video/download/";
    private static Context appContext = null;
    private static String appDir = "";
    private static Map<String, Object> customDataMap = new HashMap();
    private static int defaultAvatarImage = 0;
    private static int defaultGroupAvatarImage = 0;
    private static boolean enableGroupGridAvatar = true;
    private static int gender = 0;
    private static boolean initialized = false;
    private static int selfAllowType = 0;
    private static long selfBirthDay = 0;
    private static String selfFaceUrl = "";
    private static String selfNickName = "";
    private static String selfSignature = "";
    private static int tuiHostType;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m77051a() {
        File file = new File(getMediaDir());
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(getRecordDir());
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file3 = new File(getRecordDownloadDir());
        if (!file3.exists()) {
            file3.mkdirs();
        }
        File file4 = new File(getVideoDownloadDir());
        if (!file4.exists()) {
            file4.mkdirs();
        }
        File file5 = new File(getImageDownloadDir());
        if (!file5.exists()) {
            file5.mkdirs();
        }
        File file6 = new File(getImageBaseDir());
        if (!file6.exists()) {
            file6.mkdirs();
        }
        File file7 = new File(getVideoBaseDir());
        if (!file7.exists()) {
            file7.mkdirs();
        }
        File file8 = new File(getFileDownloadDir());
        if (!file8.exists()) {
            file8.mkdirs();
        }
        File file9 = new File(getCrashLogDir());
        if (file9.exists()) {
            return;
        }
        file9.mkdirs();
    }

    public static void clearSelfInfo() {
        selfFaceUrl = "";
        selfNickName = "";
        selfAllowType = 0;
        selfBirthDay = 0L;
        selfSignature = "";
    }

    public static Context getAppContext() {
        return appContext;
    }

    public static String getCrashLogDir() {
        return getDefaultAppDir() + CRASH_LOG_DIR_SUFFIX;
    }

    public static Object getCustomData(String str) {
        return customDataMap.get(str);
    }

    public static String getDefaultAppDir() {
        if (TextUtils.isEmpty(appDir)) {
            Context appContext2 = appContext;
            if (appContext2 == null) {
                if (TUIRouter.getContext() != null) {
                    appContext2 = TUIRouter.getContext();
                } else {
                    appContext2 = TUILogin.getAppContext() != null ? TUILogin.getAppContext() : null;
                }
            }
            if (appContext2 != null) {
                appDir = appContext2.getFilesDir().getAbsolutePath();
            }
        }
        return appDir;
    }

    public static int getDefaultAvatarImage() {
        return defaultAvatarImage;
    }

    public static int getDefaultGroupAvatarImage() {
        return defaultGroupAvatarImage;
    }

    public static String getFileDownloadDir() {
        return getDefaultAppDir() + FILE_DOWNLOAD_DIR_SUFFIX;
    }

    public static int getGender() {
        return gender;
    }

    public static String getImageBaseDir() {
        return getDefaultAppDir() + IMAGE_BASE_DIR_SUFFIX;
    }

    public static String getImageDownloadDir() {
        return getDefaultAppDir() + IMAGE_DOWNLOAD_DIR_SUFFIX;
    }

    public static String getMediaDir() {
        return getDefaultAppDir() + MEDIA_DIR_SUFFIX;
    }

    public static String getRecordDir() {
        return getDefaultAppDir() + RECORD_DIR_SUFFIX;
    }

    public static String getRecordDownloadDir() {
        return getDefaultAppDir() + RECORD_DOWNLOAD_DIR_SUFFIX;
    }

    public static int getSelfAllowType() {
        return selfAllowType;
    }

    public static long getSelfBirthDay() {
        return selfBirthDay;
    }

    public static String getSelfFaceUrl() {
        return selfFaceUrl;
    }

    public static String getSelfNickName() {
        return selfNickName;
    }

    public static String getSelfSignature() {
        return selfSignature;
    }

    public static int getTUIHostType() {
        return tuiHostType;
    }

    public static String getVideoBaseDir() {
        return getDefaultAppDir() + VIDEO_BASE_DIR_SUFFIX;
    }

    public static String getVideoDownloadDir() {
        return getDefaultAppDir() + VIDEO_DOWNLOAD_DIR_SUFFIX;
    }

    public static void init(Context context) {
        if (initialized) {
            return;
        }
        appContext = context;
        initPath();
        initialized = true;
    }

    public static void initPath() {
        new Thread(new Runnable() { // from class: com.tencent.qcloud.tuicore.b
            @Override // java.lang.Runnable
            public final void run() {
                TUIConfig.m77051a();
            }
        }).start();
    }

    public static boolean isEnableGroupGridAvatar() {
        return enableGroupGridAvatar;
    }

    public static void setCustomData(String str, Object obj) {
        customDataMap.put(str, obj);
    }

    public static void setDefaultAppDir(String str) {
        appDir = str;
    }

    public static void setDefaultAvatarImage(int i11) {
        defaultAvatarImage = i11;
    }

    public static void setDefaultGroupAvatarImage(int i11) {
        defaultGroupAvatarImage = i11;
    }

    public static void setEnableGroupGridAvatar(boolean z11) {
        enableGroupGridAvatar = z11;
    }

    public static void setGender(int i11) {
        gender = i11;
    }

    public static void setSceneOptimizParams(final String str) {
        new Thread(new Runnable() { // from class: com.tencent.qcloud.tuicore.TUIConfig.1
            @Override // java.lang.Runnable
            public void run() {
                String packageName;
                try {
                    if (TUIConfig.getAppContext() == null) {
                        packageName = "";
                    } else {
                        packageName = TUIConfig.getAppContext().getPackageName();
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL("https://demos.trtc.tencent-cloud.com/prod/base/v1/events/stat").openConnection()));
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(5000);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    String str2 = TUILogin.getSdkAppId() + "";
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TUIConstants.TUICalling.PARAM_NAME_SDK_APP_ID, str2);
                    jSONObject.put(C33556b3.f69066l2, "");
                    jSONObject.put(Constants.COMPONENT, str);
                    jSONObject.put(TPDownloadProxyEnum.DLPARAM_PACKAGE, packageName);
                    String userId = TUILogin.getUserId();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("userId", userId);
                    jSONObject2.put("event", "useScenario");
                    jSONObject2.put("msg", jSONObject);
                    String strValueOf = String.valueOf(jSONObject2);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(strValueOf.getBytes());
                    outputStream.flush();
                    outputStream.close();
                    if (httpURLConnection.getResponseCode() == 200) {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i11 = inputStream.read(bArr);
                            if (i11 != -1) {
                                byteArrayOutputStream.write(bArr, 0, i11);
                            } else {
                                Log.d("setSceneOptimizParams", "msg:" + new String(byteArrayOutputStream.toByteArray()));
                                inputStream.close();
                                byteArrayOutputStream.close();
                                httpURLConnection.disconnect();
                                return;
                            }
                        }
                    } else {
                        Log.d("setSceneOptimizParams", "ResponseCode:" + httpURLConnection.getResponseCode());
                    }
                } catch (Exception unused) {
                    Log.d("TUICore", "setSceneOptimizParams exception");
                }
            }
        }).start();
    }

    public static void setSelfAllowType(int i11) {
        selfAllowType = i11;
    }

    public static void setSelfBirthDay(long j11) {
        selfBirthDay = j11;
    }

    public static void setSelfFaceUrl(String str) {
        selfFaceUrl = str;
    }

    public static void setSelfNickName(String str) {
        selfNickName = str;
    }

    public static void setSelfSignature(String str) {
        selfSignature = str;
    }

    public static void setTUIHostType(int i11) {
        tuiHostType = i11;
    }

    public static void setSelfInfo(V2TIMUserFullInfo v2TIMUserFullInfo) {
        selfFaceUrl = v2TIMUserFullInfo.getFaceUrl();
        selfNickName = v2TIMUserFullInfo.getNickName();
        selfAllowType = v2TIMUserFullInfo.getAllowType();
        selfBirthDay = v2TIMUserFullInfo.getBirthday();
        selfSignature = v2TIMUserFullInfo.getSelfSignature();
        gender = v2TIMUserFullInfo.getGender();
    }
}
