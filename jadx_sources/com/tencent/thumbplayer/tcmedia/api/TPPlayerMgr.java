package com.tencent.thumbplayer.tcmedia.api;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.p153b.C35238a;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPNativeKeyMapUtil;
import com.tencent.thumbplayer.tcmedia.common.p158a.C35305b;
import com.tencent.thumbplayer.tcmedia.common.p158a.C35306c;
import com.tencent.thumbplayer.tcmedia.config.TPPlayerConfig;
import com.tencent.thumbplayer.tcmedia.core.common.ITPNativeLibraryExternalLoader;
import com.tencent.thumbplayer.tcmedia.core.common.ITPNativeLogCallback;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLibraryLoader;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLog;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tcmedia.core.common.TPThumbplayerCapabilityHelper;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyNativeLibLoader;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPProxyAdapter;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyHelper;
import com.tencent.thumbplayer.tcmedia.p156c.C35300i;
import com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35293b;
import com.tencent.thumbplayer.tcmedia.utils.C35422b;
import com.tencent.thumbplayer.tcmedia.utils.C35424d;
import com.tencent.thumbplayer.tcmedia.utils.C35426f;
import com.tencent.thumbplayer.tcmedia.utils.C35429i;
import com.tencent.thumbplayer.tcmedia.utils.C35435o;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes62.dex */
public class TPPlayerMgr {
    public static final String BEACON_LOG_HOST_KEY = "beacon_log_host";
    public static final String BEACON_POLICY_HOST_KEY = "beacon_policy_host";
    public static final int EVENT_ID_APP_ENTER_BACKGROUND = 100001;
    public static final int EVENT_ID_APP_ENTER_FOREGROUND = 100002;
    public static final int INVALID_CELLULAR_FLOW = -1;
    public static final int INVALID_SUGGEST_BITRATE = -1;
    public static final String PLYAER_HOST_KEY = "player_host_config";
    public static final String PROPERTY_AB_USER_ID = "PROPERTY_AbUserId";
    public static final String PROPERTY_ENABLE_DATA_REPORT = "PROPERTY_EnableDataReport";
    public static final String PROPERTY_ENABLE_NEW_REPORT = "PROPERTY_EnableNewReport";
    public static final String PROPERTY_ENABLE_PLAYER_REPORT = "PROPERTY_EnablePlayerReport";
    public static final String PROPERTY_MEDIA_DRM_REUSE = "PROPERTY_MediaDrmReuse";
    public static final String PROPERTY_PROXY_MAX_USE_MEMORY_MB = "PROPERTY_ProxyMaxUseMemoryMB";
    public static final String PROPERTY_VIDEO_MEDIACODEC_CO_EXIST_MAX_CNT = "PROPERTY_VideoMediaCodecCoexistMaxCnt";
    public static final String PROPERTY_WIDEVINE_PROVISIONING_SERVER_URL = "PROPERTY_WidevineProvisioningServerUrl";
    public static final String PROXY_HOST_KEY = "httpproxy_config";
    private static final String TAG = "TPThumbPlayer[TPPlayerMgr.java]";
    public static final String TP_DOWNLOAD_PROXY_MODULE_NAME = "DownloadProxy";
    public static final String TP_PLAYERCORE_MODULE_NAME = "TPCore";
    private static Context mAppContext;
    private static final HashMap<String, ITPPropertyHandler<Boolean>> mBooleanPropertyNameToPropertyHandlerTables;
    private static final HashMap<String, ITPPropertyHandler<Integer>> mIntegerPropertyNameToPropertyHandlerTables;
    private static boolean mIsInit;
    private static final HashMap<String, ITPPropertyHandler<Long>> mLongPropertyNameToPropertyHandlerTables;
    private static final HashMap<String, ITPPropertyHandler<String>> mStringPropertyNameToPropertyHandlerTables;
    private static final HashMap<String, Boolean> mBoolPropertyNameToValueCache = new HashMap<>();
    private static final HashMap<String, Integer> mIntegerPropertyNameToValueCache = new HashMap<>();
    private static final HashMap<String, String> mStringPropertyNameToValueCache = new HashMap<>();
    private static final HashMap<String, Long> mLongPropertyNameToValueCache = new HashMap<>();

    @Retention(RetentionPolicy.SOURCE)
    public @interface BooleanProperty {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface EventId {
    }

    public interface ITPPropertyHandler<T> {
        T getPropertyValue();

        void setPropertyValue(T t11);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface IntegerProperty {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LongProperty {
    }

    public interface OnLogListener {
        /* JADX INFO: renamed from: d */
        int m77856d(String str, String str2);

        /* JADX INFO: renamed from: e */
        int m77857e(String str, String str2);

        /* JADX INFO: renamed from: i */
        int m77858i(String str, String str2);

        /* JADX INFO: renamed from: v */
        int m77859v(String str, String str2);

        /* JADX INFO: renamed from: w */
        int m77860w(String str, String str2);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StringProperty {
    }

    @Deprecated
    public static synchronized boolean getPropertyBoolean(String str) {
        return getPropertyBoolean(str, false);
    }

    @Deprecated
    public static synchronized int getPropertyInteger(String str) {
        return getPropertyInteger(str, 0);
    }

    @Deprecated
    public static long getPropertyLong(String str) {
        return getPropertyLong(str, 0L);
    }

    @Deprecated
    public static String getPropertyString(String str) {
        return getPropertyString(str, "");
    }

    public static void initSdk(Context context, TPInitParams tPInitParams) {
        TPSystemInfo.setDeviceName(tPInitParams.getDeviceName());
        initSdk(context, tPInitParams.getGuid(), tPInitParams.getPlatform());
    }

    static {
        HashMap<String, ITPPropertyHandler<Boolean>> map = new HashMap<>();
        mBooleanPropertyNameToPropertyHandlerTables = map;
        map.put(PROPERTY_MEDIA_DRM_REUSE, new ITPPropertyHandler<Boolean>() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final Boolean getPropertyValue() {
                return Boolean.valueOf(TPPlayerConfig.getMediaDrmReuseEnable());
            }

            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final void setPropertyValue(Boolean bool) {
                TPPlayerConfig.setMediaDrmReuseEnable(bool.booleanValue());
            }
        });
        map.put(PROPERTY_ENABLE_DATA_REPORT, new ITPPropertyHandler<Boolean>() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final Boolean getPropertyValue() {
                return Boolean.valueOf(TPPlayerConfig.isDataReportEnable());
            }

            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final void setPropertyValue(Boolean bool) {
                TPLogUtil.m78797e(TPPlayerMgr.TAG, "set data report enable : ".concat(String.valueOf(bool)));
                TPPlayerConfig.setDataReportEnable(bool.booleanValue());
                C35300i.m78021a().m78029a(bool.booleanValue());
            }
        });
        map.put(PROPERTY_ENABLE_PLAYER_REPORT, new ITPPropertyHandler<Boolean>() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final Boolean getPropertyValue() {
                return Boolean.valueOf(TPPlayerConfig.isPlayerReportEnable());
            }

            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final void setPropertyValue(Boolean bool) {
                TPLogUtil.m78797e(TPPlayerMgr.TAG, "set player report enable : ".concat(String.valueOf(bool)));
                TPPlayerConfig.setPlayerReportEnable(bool.booleanValue());
            }
        });
        map.put(PROPERTY_ENABLE_NEW_REPORT, new ITPPropertyHandler<Boolean>() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final Boolean getPropertyValue() {
                return Boolean.valueOf(TPPlayerConfig.getNewReportEnable());
            }

            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final void setPropertyValue(Boolean bool) {
                TPLogUtil.m78797e(TPPlayerMgr.TAG, "set new report enable : ".concat(String.valueOf(bool)));
                TPPlayerConfig.setNewReportEnable(bool.booleanValue());
            }
        });
        HashMap<String, ITPPropertyHandler<String>> map2 = new HashMap<>();
        mStringPropertyNameToPropertyHandlerTables = map2;
        map2.put(PROPERTY_AB_USER_ID, new ITPPropertyHandler<String>() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.10
            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final String getPropertyValue() {
                return TPPlayerConfig.getAbUserId();
            }

            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final void setPropertyValue(String str) {
                TPPlayerConfig.setAbUserId(str);
            }
        });
        map2.put(PROPERTY_WIDEVINE_PROVISIONING_SERVER_URL, new ITPPropertyHandler<String>() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.11
            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final String getPropertyValue() {
                return TPPlayerConfig.getWidevineProvisioningServerUrl();
            }

            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final void setPropertyValue(String str) {
                TPPlayerConfig.setWidevineProvisioningServerUrl(str);
            }
        });
        HashMap<String, ITPPropertyHandler<Integer>> map3 = new HashMap<>();
        mIntegerPropertyNameToPropertyHandlerTables = map3;
        map3.put(PROPERTY_VIDEO_MEDIACODEC_CO_EXIST_MAX_CNT, new ITPPropertyHandler<Integer>() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final Integer getPropertyValue() {
                return Integer.valueOf(TPPlayerConfig.getVideoMediaCodecCoexistMaxCnt());
            }

            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final void setPropertyValue(Integer num) {
                TPPlayerConfig.setVideoMediaCodecCoexistMaxCnt(num.intValue());
            }
        });
        HashMap<String, ITPPropertyHandler<Long>> map4 = new HashMap<>();
        mLongPropertyNameToPropertyHandlerTables = map4;
        map4.put(PROPERTY_PROXY_MAX_USE_MEMORY_MB, new ITPPropertyHandler<Long>() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final Long getPropertyValue() {
                return Long.valueOf(TPPlayerConfig.getProxyMaxUseMemoryMB());
            }

            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final void setPropertyValue(Long l11) {
                TPPlayerConfig.setProxyMaxUseMemoryMB(l11.longValue());
                C35300i.m78021a().m78030b(l11.longValue());
            }
        });
    }

    public static Context getAppContext() {
        return mAppContext;
    }

    public static String getLibVersion(String str) {
        if (!mIsInit) {
            throw new IllegalStateException("player not initialized");
        }
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(TP_DOWNLOAD_PROXY_MODULE_NAME)) {
                return TPDownloadProxyHelper.getNativeLibVersion();
            }
            if (str.equals(TP_PLAYERCORE_MODULE_NAME)) {
                return TPNativeLibraryLoader.getLibVersion();
            }
        }
        throw new IllegalArgumentException("libName:".concat(String.valueOf(str)));
    }

    public static synchronized boolean getPropertyBoolean(String str, boolean z11) {
        Boolean bool = mBoolPropertyNameToValueCache.get(str);
        if (bool == null) {
            return z11;
        }
        return bool.booleanValue();
    }

    public static synchronized int getPropertyInteger(String str, int i11) {
        Integer num = mIntegerPropertyNameToValueCache.get(str);
        if (num == null) {
            return i11;
        }
        return num.intValue();
    }

    public static synchronized long getPropertyLong(String str, long j11) {
        Long l11 = mLongPropertyNameToValueCache.get(str);
        if (l11 == null) {
            return j11;
        }
        return l11.longValue();
    }

    public static synchronized String getPropertyString(String str, String str2) {
        String str3;
        str3 = mStringPropertyNameToValueCache.get(str);
        return str3 == null ? str2 : str3;
    }

    public static String getThumbPlayerVersion() {
        return TPPlayerConfig.VERSION;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void initInAsyncThread() {
        C35424d c35424d = new C35424d();
        c35424d.m78856a();
        C35305b.m78040a(mAppContext.getApplicationContext());
        TPLogUtil.m78800i(TAG, "Init SDK, initAsyncWithWait  TPBeaconReportWrapper init, times: " + c35424d.m78860e());
        C35238a.m77560a(mAppContext);
        TPLogUtil.m78800i(TAG, "Init SDK, initAsyncWithWait  TPDrmCapability init, times: " + c35424d.m78860e());
        TPThumbplayerCapabilityHelper.init(mAppContext, true);
        TPLogUtil.m78800i(TAG, "Init SDK, initAsyncWithWait all times: " + c35424d.m78859d());
    }

    public static synchronized void initSdk(Context context, String str, int i11) {
        String str2;
        String str3;
        if (mIsInit) {
            TPLogUtil.m78800i(TAG, "Init SDK, has init sdk");
            return;
        }
        mIsInit = true;
        C35424d c35424d = new C35424d();
        c35424d.m78856a();
        preInitSync(context, str, i11);
        Future<Boolean> futureInitAsyncWithWait = initAsyncWithWait();
        initSync();
        initAsyncWithoutWait();
        c35424d.m78857b();
        try {
            try {
                if (futureInitAsyncWithWait.get().booleanValue()) {
                    TPLogUtil.m78800i(TAG, "Init SDK, TPPlayer  wait initSync finish, times: " + c35424d.m78858c());
                }
            } catch (InterruptedException unused) {
                str2 = TAG;
                str3 = "Init SDK, TPPlayer wait initSync InterruptedException, times: " + c35424d.m78858c();
                TPLogUtil.m78797e(str2, str3);
            }
        } catch (ExecutionException unused2) {
            str2 = TAG;
            str3 = "Init SDK, TPPlayer wait initSync ExecutionException, times: " + c35424d.m78858c();
            TPLogUtil.m78797e(str2, str3);
        }
        TPLogUtil.m78800i(TAG, "Init SDK, TPPlayer all times: " + c35424d.m78859d());
    }

    private static void initSync() {
        C35424d c35424d = new C35424d();
        c35424d.m78856a();
        try {
            TPNativeLibraryLoader.loadLibIfNeeded(mAppContext);
        } catch (UnsupportedOperationException e11) {
            TPLogUtil.m78798e(TAG, e11);
        }
        TPLogUtil.m78800i(TAG, "Init SDK, initSync so load times: " + c35424d.m78859d());
    }

    private static void preInitSync(Context context, String str, int i11) {
        C35424d c35424d = new C35424d();
        c35424d.m78856a();
        mAppContext = context.getApplicationContext();
        TPPlayerConfig.setGuid(str);
        TPPlayerConfig.setPlatform(i11);
        TPNativeLog.setLogCallback(new ITPNativeLogCallback() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.1
            @Override // com.tencent.thumbplayer.tcmedia.core.common.ITPNativeLogCallback
            public final void onPrintLog(int i12, String str2, String str3) {
                if (i12 == 0) {
                    TPLogUtil.m78801v(str2, str3);
                    return;
                }
                if (i12 == 1) {
                    TPLogUtil.m78796d(str2, str3);
                    return;
                }
                if (i12 == 2) {
                    TPLogUtil.m78800i(str2, str3);
                } else if (i12 == 3) {
                    TPLogUtil.m78802w(str2, str3);
                } else {
                    if (i12 != 4) {
                        return;
                    }
                    TPLogUtil.m78797e(str2, str3);
                }
            }
        });
        TPLogUtil.m78800i(TAG, "Init SDK, preInitSync all times: " + c35424d.m78859d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void setExternalProperties() {
        try {
            for (Map.Entry<String, Boolean> entry : mBoolPropertyNameToValueCache.entrySet()) {
                ITPPropertyHandler<Boolean> iTPPropertyHandler = mBooleanPropertyNameToPropertyHandlerTables.get(entry.getKey());
                if (iTPPropertyHandler != null) {
                    iTPPropertyHandler.setPropertyValue(entry.getValue());
                }
            }
            for (Map.Entry<String, Integer> entry2 : mIntegerPropertyNameToValueCache.entrySet()) {
                ITPPropertyHandler<Integer> iTPPropertyHandler2 = mIntegerPropertyNameToPropertyHandlerTables.get(entry2.getKey());
                if (iTPPropertyHandler2 != null) {
                    iTPPropertyHandler2.setPropertyValue(entry2.getValue());
                }
            }
            for (Map.Entry<String, String> entry3 : mStringPropertyNameToValueCache.entrySet()) {
                ITPPropertyHandler<String> iTPPropertyHandler3 = mStringPropertyNameToPropertyHandlerTables.get(entry3.getKey());
                if (iTPPropertyHandler3 != null) {
                    iTPPropertyHandler3.setPropertyValue(entry3.getValue());
                }
            }
            for (Map.Entry<String, Long> entry4 : mLongPropertyNameToValueCache.entrySet()) {
                ITPPropertyHandler<Long> iTPPropertyHandler4 = mLongPropertyNameToPropertyHandlerTables.get(entry4.getKey());
                if (iTPPropertyHandler4 != null) {
                    iTPPropertyHandler4.setPropertyValue(entry4.getValue());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void setLibLoader(final ITPModuleLoader iTPModuleLoader) {
        if (mIsInit) {
            throw new IllegalStateException("player has init");
        }
        TPNativeLibraryLoader.setLibLoader(new ITPNativeLibraryExternalLoader() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.4
            @Override // com.tencent.thumbplayer.tcmedia.core.common.ITPNativeLibraryExternalLoader
            public final boolean loadLib(String str, String str2) {
                ITPModuleLoader iTPModuleLoader2 = iTPModuleLoader;
                if (iTPModuleLoader2 == null) {
                    return false;
                }
                try {
                    iTPModuleLoader2.loadLibrary(str, str2);
                    return true;
                } catch (Throwable th2) {
                    TPLogUtil.m78798e(TPPlayerMgr.TAG, th2);
                    return false;
                }
            }
        });
        TPDownloadProxyHelper.setNativeLibLoader(new ITPDLProxyNativeLibLoader() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.5
            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyNativeLibLoader
            public final boolean loadLib(String str, String str2) {
                ITPModuleLoader iTPModuleLoader2 = iTPModuleLoader;
                if (iTPModuleLoader2 == null) {
                    return false;
                }
                try {
                    iTPModuleLoader2.loadLibrary(str, str2);
                    return true;
                } catch (Throwable th2) {
                    TPLogUtil.m78798e(TPPlayerMgr.TAG, th2);
                    return false;
                }
            }
        });
    }

    public static synchronized void setPropertyBool(String str, boolean z11) {
        if (!mIsInit) {
            mBoolPropertyNameToValueCache.put(str, Boolean.valueOf(z11));
            return;
        }
        ITPPropertyHandler<Boolean> iTPPropertyHandler = mBooleanPropertyNameToPropertyHandlerTables.get(str);
        if (iTPPropertyHandler == null) {
            TPLogUtil.m78802w(TAG, "not found handler of property, propertyName:".concat(String.valueOf(str)));
        } else {
            iTPPropertyHandler.setPropertyValue(Boolean.valueOf(z11));
            mBoolPropertyNameToValueCache.put(str, Boolean.valueOf(z11));
        }
    }

    public static synchronized void setPropertyInteger(String str, int i11) {
        if (!mIsInit) {
            mIntegerPropertyNameToValueCache.put(str, Integer.valueOf(i11));
            return;
        }
        ITPPropertyHandler<Integer> iTPPropertyHandler = mIntegerPropertyNameToPropertyHandlerTables.get(str);
        if (iTPPropertyHandler == null) {
            TPLogUtil.m78802w(TAG, "not found handler of property, propertyName:".concat(String.valueOf(str)));
        } else {
            iTPPropertyHandler.setPropertyValue(Integer.valueOf(i11));
            mIntegerPropertyNameToValueCache.put(str, Integer.valueOf(i11));
        }
    }

    public static synchronized void setPropertyLong(String str, long j11) {
        if (!mIsInit) {
            mLongPropertyNameToValueCache.put(str, Long.valueOf(j11));
            return;
        }
        ITPPropertyHandler<Long> iTPPropertyHandler = mLongPropertyNameToPropertyHandlerTables.get(str);
        if (iTPPropertyHandler == null) {
            TPLogUtil.m78802w(TAG, "not found handler of property, propertyName:".concat(String.valueOf(str)));
        } else {
            iTPPropertyHandler.setPropertyValue(Long.valueOf(j11));
            mLongPropertyNameToValueCache.put(str, Long.valueOf(j11));
        }
    }

    public static synchronized void setPropertyString(String str, String str2) {
        if (!mIsInit) {
            mStringPropertyNameToValueCache.put(str, str2);
            return;
        }
        ITPPropertyHandler<String> iTPPropertyHandler = mStringPropertyNameToPropertyHandlerTables.get(str);
        if (iTPPropertyHandler == null) {
            TPLogUtil.m78802w(TAG, "not found handler of property, propertyName:".concat(String.valueOf(str)));
        } else {
            iTPPropertyHandler.setPropertyValue(str2);
            mStringPropertyNameToValueCache.put(str, str2);
        }
    }

    public static void setProxyMaxStorageSizeMB(long j11) {
        TPLogUtil.m78800i(TAG, "setProxyMaxStorageSize: " + j11 + " MB.");
        TPPlayerConfig.setProxyMaxStorageSizeMB(j11);
        C35300i.m78021a().m78028a(j11);
    }

    public static int getCellularDataCost() {
        ITPDownloadProxy iTPDownloadProxyMo77963a;
        InterfaceC35293b interfaceC35293bM78027a = C35300i.m78021a().m78027a(TPPlayerConfig.getProxyServiceType());
        if (interfaceC35293bM78027a == null || (iTPDownloadProxyMo77963a = interfaceC35293bM78027a.mo77963a()) == null) {
            return -1;
        }
        return C35422b.m78842a(iTPDownloadProxyMo77963a.getNativeInfo(2), -1);
    }

    public static int getOfflineRecordDurationMs(String str, String str2) {
        return TPDownloadProxyHelper.getRecordDuration(str, str2);
    }

    public static String getOfflineRecordVinfo(String str, String str2) {
        return TPDownloadProxyHelper.checkVideoStatus(str, str2);
    }

    public static int getSuggestedBitrate() {
        ITPDownloadProxy iTPDownloadProxyMo77963a;
        InterfaceC35293b interfaceC35293bM78027a = C35300i.m78021a().m78027a(TPPlayerConfig.getProxyServiceType());
        if (interfaceC35293bM78027a == null || (iTPDownloadProxyMo77963a = interfaceC35293bM78027a.mo77963a()) == null) {
            return -1;
        }
        return C35422b.m78842a(iTPDownloadProxyMo77963a.getNativeInfo(0), -1);
    }

    private static Future<Boolean> initAsyncWithWait() {
        return C35435o.m78917a().m78923c().submit(new Callable<Boolean>() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public final Boolean call() {
                TPPlayerMgr.initInAsyncThread();
                return Boolean.TRUE;
            }
        });
    }

    private static void initAsyncWithoutWait() {
        C35435o.m78917a().m78924d().execute(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.3
            @Override // java.lang.Runnable
            public final void run() {
                C35424d c35424d = new C35424d();
                c35424d.m78856a();
                TPNativeKeyMapUtil.init();
                TPLogUtil.m78800i(TPPlayerMgr.TAG, "Init SDK, initAsyncWithoutWait  nativeKeyMap init, times: " + c35424d.m78858c());
                C35429i.m78882a().m78893a(TPPlayerMgr.mAppContext);
                new C35306c().m78052a();
                TPPlayerMgr.setExternalProperties();
                TPLogUtil.m78800i(TPPlayerMgr.TAG, "Init SDK, initAsyncWithoutWait all times: " + c35424d.m78859d());
            }
        });
    }

    public static boolean isProxyEnable() {
        if (TPPlayerConfig.isUseP2P() && TPDownloadProxyHelper.isReadyForPlay()) {
            return true;
        }
        return false;
    }

    public static boolean isThumbPlayerEnable() {
        return TPNativeLibraryLoader.isLibLoadedAndTryToLoad();
    }

    public static void postEvent(int i11, int i12, int i13, Object obj) {
        C35426f.m78865a(i11, i12, i13, obj);
    }

    public static void setDebugEnable(boolean z11) {
        TPPlayerConfig.setDebugEnable(z11);
    }

    public static void setHost(String str) {
        TPPlayerConfig.parseHostConfig(str);
    }

    public static void setOnLogListener(OnLogListener onLogListener) {
        TPLogUtil.setOnLogListener(onLogListener);
    }

    public static void setOutNetIP(String str) {
        TPPlayerConfig.setOutNetIp(str);
    }

    public static void setProxyEnable(boolean z11) {
        TPPlayerConfig.setP2PEnable(z11);
    }

    public static void setProxyServiceType(int i11) {
        TPPlayerConfig.setProxyServiceType(i11);
    }

    public static void setTPProxyAdapter(ITPProxyAdapter iTPProxyAdapter) {
        TPDownloadProxyHelper.setTPProxyAdapter(iTPProxyAdapter);
    }

    public static void setUpcInfo(String str, int i11) {
        TPPlayerConfig.setUserUpc(str);
        TPPlayerConfig.setUserUpcState(i11);
        C35426f.m78865a(100003, i11, 0, str);
    }

    public static void setUserInfo(String str, boolean z11) {
        TPPlayerConfig.setUserUin(str);
        TPPlayerConfig.setUserIsVip(z11);
    }
}
