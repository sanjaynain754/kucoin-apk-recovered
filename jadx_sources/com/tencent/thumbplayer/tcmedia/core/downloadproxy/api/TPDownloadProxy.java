package com.tencent.thumbplayer.tcmedia.core.downloadproxy.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.apiinner.TPListenerManager;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.jni.TPDownloadProxyNative;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLFileSystem;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLProxyLog;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLProxyUtils;
import java.io.File;

/* JADX INFO: loaded from: classes63.dex */
public class TPDownloadProxy implements ITPDownloadProxy {
    private static final String FILE_NAME = "TPDownloadProxy";
    private int mServiceType;
    private String mCurrentStoragePath = "";
    private boolean mIsInit = false;
    private Context mContext = null;

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int clearCache(String str, String str2, int i11) {
        return clearCache(str, str2, i11, -1L);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public TPDLProxyMsg.TPPDTInfo[] getPDTInfos(int i11) {
        if (i11 > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDownloadProxyNative.getInstance().getPDTInfos(i11);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getPDTInfos failed, error:" + th2.toString());
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bf A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:12:0x0025, B:14:0x002f, B:17:0x003c, B:19:0x0042, B:20:0x004f, B:22:0x0059, B:23:0x0062, B:31:0x007c, B:32:0x0095, B:34:0x00a6, B:36:0x00ae, B:41:0x00e1, B:43:0x00fc, B:45:0x0101, B:46:0x0104, B:37:0x00bf, B:39:0x00c9, B:40:0x00cf, B:26:0x006e, B:28:0x0076), top: B:56:0x0025, outer: #0, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:12:0x0025, B:14:0x002f, B:17:0x003c, B:19:0x0042, B:20:0x004f, B:22:0x0059, B:23:0x0062, B:31:0x007c, B:32:0x0095, B:34:0x00a6, B:36:0x00ae, B:41:0x00e1, B:43:0x00fc, B:45:0x0101, B:46:0x0104, B:37:0x00bf, B:39:0x00c9, B:40:0x00cf, B:26:0x006e, B:28:0x0076), top: B:56:0x0025, outer: #0, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00fc A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:12:0x0025, B:14:0x002f, B:17:0x003c, B:19:0x0042, B:20:0x004f, B:22:0x0059, B:23:0x0062, B:31:0x007c, B:32:0x0095, B:34:0x00a6, B:36:0x00ae, B:41:0x00e1, B:43:0x00fc, B:45:0x0101, B:46:0x0104, B:37:0x00bf, B:39:0x00c9, B:40:0x00cf, B:26:0x006e, B:28:0x0076), top: B:56:0x0025, outer: #0, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0101 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:12:0x0025, B:14:0x002f, B:17:0x003c, B:19:0x0042, B:20:0x004f, B:22:0x0059, B:23:0x0062, B:31:0x007c, B:32:0x0095, B:34:0x00a6, B:36:0x00ae, B:41:0x00e1, B:43:0x00fc, B:45:0x0101, B:46:0x0104, B:37:0x00bf, B:39:0x00c9, B:40:0x00cf, B:26:0x006e, B:28:0x0076), top: B:56:0x0025, outer: #0, inners: #2 }] */
    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public synchronized int init(Context context, TPDLProxyInitParam tPDLProxyInitParam) {
        int iInitService;
        IntentFilter intentFilter;
        BroadcastReceiver broadcastReceiver;
        if (this.mIsInit) {
            TPDLProxyLog.m78075i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "download already init");
            return 0;
        }
        TPDownloadProxyNative.getInstance().setAppContext(context);
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                if (!TextUtils.isEmpty(tPDLProxyInitParam.getAppVer())) {
                    setUserData(TPDownloadProxyEnum.USER_APP_VERSION, tPDLProxyInitParam.getAppVer());
                }
                if (tPDLProxyInitParam.getPlatform() > 0) {
                    setUserData("platform", Integer.valueOf(tPDLProxyInitParam.getPlatform()));
                }
                if (!TextUtils.isEmpty(tPDLProxyInitParam.getGuid())) {
                    setUserData(TPDownloadProxyEnum.USER_GUID, tPDLProxyInitParam.getGuid());
                }
                String cacheDir = tPDLProxyInitParam.getCacheDir();
                if (!TextUtils.isEmpty(cacheDir) || context == null) {
                    TPListenerManager.getInstance().initHandler();
                    if (TextUtils.isEmpty(tPDLProxyInitParam.getDataDir()) || TextUtils.isEmpty(this.mCurrentStoragePath)) {
                        if (!TextUtils.isEmpty(tPDLProxyInitParam.getDataDir())) {
                            this.mCurrentStoragePath = tPDLProxyInitParam.getDataDir();
                        }
                        iInitService = TPDownloadProxyNative.getInstance().initService(this.mServiceType, cacheDir, tPDLProxyInitParam.getDataDir(), tPDLProxyInitParam.getConfigStr());
                    } else {
                        iInitService = TPDownloadProxyNative.getInstance().initService(this.mServiceType, cacheDir, this.mCurrentStoragePath, tPDLProxyInitParam.getConfigStr());
                    }
                    intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.USER_PRESENT");
                    broadcastReceiver = new BroadcastReceiver() { // from class: com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxy.2
                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context2, Intent intent) {
                            String action = intent.getAction();
                            if ("android.intent.action.SCREEN_OFF".equals(action)) {
                                TPDownloadProxy.this.pushEvent(20);
                            } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                                TPDownloadProxy.this.pushEvent(19);
                            }
                        }
                    };
                    if (context != null) {
                        context.registerReceiver(broadcastReceiver, intentFilter);
                    }
                    if (iInitService == 0) {
                        this.mIsInit = true;
                    }
                    this.mContext = context;
                    return iInitService;
                }
                try {
                    File properCacheDirectory = TPDLFileSystem.getProperCacheDirectory(context, "download");
                    if (properCacheDirectory != null) {
                        cacheDir = properCacheDirectory.getAbsolutePath();
                    }
                } catch (Throwable th2) {
                    TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "init get cache dir failed, error:" + th2.toString());
                }
                TPListenerManager.getInstance().initHandler();
                if (TextUtils.isEmpty(tPDLProxyInitParam.getDataDir())) {
                    if (!TextUtils.isEmpty(tPDLProxyInitParam.getDataDir())) {
                        this.mCurrentStoragePath = tPDLProxyInitParam.getDataDir();
                    }
                    iInitService = TPDownloadProxyNative.getInstance().initService(this.mServiceType, cacheDir, tPDLProxyInitParam.getDataDir(), tPDLProxyInitParam.getConfigStr());
                } else {
                    if (!TextUtils.isEmpty(tPDLProxyInitParam.getDataDir())) {
                        this.mCurrentStoragePath = tPDLProxyInitParam.getDataDir();
                    }
                    iInitService = TPDownloadProxyNative.getInstance().initService(this.mServiceType, cacheDir, tPDLProxyInitParam.getDataDir(), tPDLProxyInitParam.getConfigStr());
                }
                intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                broadcastReceiver = new BroadcastReceiver() { // from class: com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxy.2
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context2, Intent intent) {
                        String action = intent.getAction();
                        if ("android.intent.action.SCREEN_OFF".equals(action)) {
                            TPDownloadProxy.this.pushEvent(20);
                        } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                            TPDownloadProxy.this.pushEvent(19);
                        }
                    }
                };
                if (context != null) {
                    context.registerReceiver(broadcastReceiver, intentFilter);
                }
                if (iInitService == 0) {
                    this.mIsInit = true;
                }
                this.mContext = context;
                return iInitService;
            } catch (Throwable th3) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "init failed, error:" + th3.toString());
            }
            throw th;
        }
        return -1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int pauseDownload(int i11) {
        if (i11 > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDownloadProxyNative.getInstance().pauseDownload(i11);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "pauseDownload failed, error:" + th2.toString());
            }
        }
        return -1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int removeStorageCache(String str) {
        return removeStorageCache(str, -1L);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int resumeDownload(int i11) {
        if (i11 > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDownloadProxyNative.getInstance().resumeDownload(i11);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "resumeDownload failed, error:" + th2.toString());
            }
        }
        return -1;
    }

    private void getCellularNetwork(Context context) {
        if (context == null) {
            TPDLProxyLog.m78075i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network, context is null, can not set interface 4g");
            return;
        }
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        builder.addCapability(12);
        builder.addTransportType(0);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            TPDLProxyLog.m78075i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network, connectivityManager is null, can not set interface 4g");
        } else {
            connectivityManager.requestNetwork(builder.build(), new ConnectivityManager.NetworkCallback() { // from class: com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxy.1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    super.onAvailable(network);
                    TPListenerManager.getInstance().setNetwork(network);
                    long networkHandle = network.getNetworkHandle();
                    TPDLProxyLog.m78075i(TPDownloadProxy.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network, net_id_t: ".concat(String.valueOf(networkHandle)));
                    TPDownloadProxy.this.setUserData(TPDownloadProxyEnum.CELLULAR_NETWORK_INTERFACE_ID, Long.valueOf(networkHandle));
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    super.onLost(network);
                    TPDownloadProxy.this.setUserData(TPDownloadProxyEnum.CELLULAR_NETWORK_INTERFACE_ID, 0);
                    TPDLProxyLog.m78075i(TPDownloadProxy.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network failed");
                }
            });
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int clearCache(String str, String str2, int i11, long j11) {
        if (!TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return -1;
        }
        try {
            return TPDownloadProxyNative.getInstance().clearCache(str, str2, i11, j11);
        } catch (Throwable th2) {
            TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "clearCache failed, error:" + th2.toString());
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void pushEvent(int i11) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().pushEvent(i11);
                if (9 == i11) {
                    TPDLProxyLog.m78075i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network, update net interface info");
                    getCellularNetwork(this.mContext);
                }
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network pushEvent failed, error:" + th2.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int removeStorageCache(String str, long j11) {
        if (!TextUtils.isEmpty(str) && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDownloadProxyNative.getInstance().deleteCache(this.mCurrentStoragePath, str, j11);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "deleteCache failed, error:" + th2.toString());
            }
        }
        return -1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void setLogListener(ITPDLProxyLogListener iTPDLProxyLogListener) {
        TPDLProxyLog.setLogListener(this.mServiceType, iTPDLProxyLogListener);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void setPlayState(int i11, int i12) {
        if (i11 > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().setPlayerState(i11, i12);
                if (i12 == 1) {
                    long[] currentPlayOffset = TPListenerManager.getInstance().getPlaylistener(i11).getCurrentPlayOffset();
                    int currentPosition = (int) (TPListenerManager.getInstance().getPlaylistener(i11).getCurrentPosition() / 1000);
                    int playerBufferLength = (int) (TPListenerManager.getInstance().getPlaylistener(i11).getPlayerBufferLength() / 1000);
                    int advRemainTime = (int) (TPListenerManager.getInstance().getPlaylistener(i11).getAdvRemainTime() / 1000);
                    if (currentPlayOffset != null && currentPlayOffset.length == 2) {
                        TPDownloadProxyNative.getInstance().updateTaskInfo(i11, TPDownloadProxyEnum.TASKINFO_PLAY_OFFSET, currentPlayOffset[0] + ";" + currentPlayOffset[1]);
                    }
                    TPDownloadProxyNative.getInstance().updatePlayerPlayMsg(i11, currentPosition, playerBufferLength, advRemainTime);
                }
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "setPlayState failed, error:" + th2.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void setUserData(String str, Object obj) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                if (str.equalsIgnoreCase(TPDownloadProxyEnum.USER_APP_VERSION)) {
                    TPDownloadProxyNative.getInstance().setUserData(TPDownloadProxyEnum.USER_APP_VERSION, (String) obj);
                    return;
                }
                if (str.equalsIgnoreCase("platform")) {
                    TPDownloadProxyNative.getInstance().setUserData("platform", obj.toString());
                    return;
                }
                if (str.equalsIgnoreCase(TPDownloadProxyEnum.USER_GUID)) {
                    TPDownloadProxyNative.getInstance().setUserData(TPDownloadProxyEnum.USER_GUID, (String) obj);
                    return;
                }
                if (str.equalsIgnoreCase(TPDownloadProxyEnum.USER_IS_VIP)) {
                    TPDownloadProxyNative.getInstance().setUserData(TPDownloadProxyEnum.USER_IS_VIP, ((Boolean) obj).booleanValue() ? "1" : "0");
                    return;
                }
                if (str.equalsIgnoreCase(TPDownloadProxyEnum.USER_UPC)) {
                    TPDownloadProxyNative.getInstance().setUserData(TPDownloadProxyEnum.USER_UPC, (String) obj);
                    return;
                }
                if (str.equalsIgnoreCase(TPDownloadProxyEnum.USER_UPC_STATE)) {
                    TPDownloadProxyNative.getInstance().setUserData(TPDownloadProxyEnum.USER_UPC_STATE, obj.toString());
                } else if (str.equalsIgnoreCase(TPDownloadProxyEnum.USER_PROXY_CONFIG)) {
                    TPDownloadProxyNative.getInstance().setUserData(TPDownloadProxyEnum.USER_PROXY_CONFIG, obj.toString());
                } else {
                    TPDownloadProxyNative.getInstance().setUserData(str, obj.toString());
                }
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "setUserData failed, error:" + th2.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void startTask(int i11) {
        if (i11 > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().startDownload(i11);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startTask failed, error:" + th2.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void stopOfflineDownload(int i11) {
        if (i11 > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().stopDownload(i11);
                TPListenerManager.getInstance().removeOfflineDownloadListener(i11);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "stopOfflineDownload failed, error:" + th2.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void stopPlay(int i11) {
        if (i11 > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().stopDownload(i11);
                TPListenerManager.getInstance().removePlayListener(i11);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "stopPlay failed, error:" + th2.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void stopPreload(int i11) {
        if (i11 > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().stopDownload(i11);
                TPListenerManager.getInstance().removePreLoadListener(i11);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "stopPreload failed, error:" + th2.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void switchToResolution(int i11, int i12, int i13) {
        if (i12 == 0 || i13 == 0 || !TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return;
        }
        try {
            TPDownloadProxyNative.getInstance().switchToResolution(i11, i12, i13);
        } catch (Throwable th2) {
            TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "switchToResolution failed, error:" + th2.toString());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void updateTaskInfo(int i11, String str, Object obj) {
        if (i11 > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().updateTaskInfo(i11, str, obj.toString());
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "updateTaskInfo failed, error:" + th2.toString());
            }
        }
    }

    public TPDownloadProxy(int i11) {
        this.mServiceType = i11;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public boolean checkResourceExist(String str, String str2, long j11) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDownloadProxyNative.getInstance().checkResourceExist(str, str2, j11);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "checkResourceExist failed, error:" + th2.toString());
            }
        }
        return false;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int checkResourceStatus(String str, String str2, int i11) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDownloadProxyNative.getInstance().checkResourceStatus(str, str2, i11);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "checkResourceStatus failed, error:" + th2.toString());
                return -1;
            }
        }
        return -1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int deinit() {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                this.mIsInit = false;
                return TPDownloadProxyNative.getInstance().deInitService(this.mServiceType);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "deinit failed, error:" + th2.toString());
                return -1;
            }
        }
        return -1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int deleteOfflineLicenseKeySetId(String str, String str2, String str3) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDownloadProxyNative.getInstance().deleteOfflineLicenseKeySetId(str, str2, str3);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "deleteOfflineLicenseKeySetId failed, error:" + th2.toString());
                return -1;
            }
        }
        return -1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public String getClipPlayUrl(int i11, int i12, int i13) {
        String strByteArrayToString = "";
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                strByteArrayToString = TPDLProxyUtils.byteArrayToString(TPDownloadProxyNative.getInstance().getClipPlayUrl(i11, i12, i13));
                if (i13 != 2) {
                    TPDownloadProxyNative.getInstance().startDownload(i11);
                    return strByteArrayToString;
                }
                return strByteArrayToString;
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getClipPlayUrl failed, error:" + th2.toString());
            }
        }
        return strByteArrayToString;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public String getNativeInfo(int i11) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDLProxyUtils.byteArrayToString(TPDownloadProxyNative.getInstance().getNativeInfo(i11));
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getNativeInfo failed, error:" + th2.toString());
                return null;
            }
        }
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public byte[] getOfflineLicenseKeySetId(String str, String str2, String str3) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDownloadProxyNative.getInstance().getOfflineLicenseKeySetId(str, str2, str3);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getOfflineLicenseKeySetId failed, error:" + th2.toString());
                return null;
            }
        }
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public String getPlayErrorCodeStr(int i11) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDLProxyUtils.byteArrayToString(TPDownloadProxyNative.getInstance().getErrorCodeStr(i11));
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getPlayErrorCodeStr failed, error:" + th2.toString());
                return "";
            }
        }
        return "";
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public String getPlayUrl(int i11, int i12) {
        String strByteArrayToString = "";
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                strByteArrayToString = TPDLProxyUtils.byteArrayToString(TPDownloadProxyNative.getInstance().getClipPlayUrl(i11, 1, i12));
                if (i12 != 2) {
                    TPDownloadProxyNative.getInstance().startDownload(i11);
                    return strByteArrayToString;
                }
                return strByteArrayToString;
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getPlayUrl failed, error:" + th2.toString());
            }
        }
        return strByteArrayToString;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public float getResourceDownloadProgress(String str, String str2, long j11) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDownloadProxyNative.getInstance().getResourceDownloadProgress(str, str2, j11);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getResourceDownloadProgress failed, error:" + th2.toString());
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public long getResourceSize(String str, String str2) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDownloadProxyNative.getInstance().getResourceSize(str, str2);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getResourceSize failed, error:" + th2.toString());
                return -1L;
            }
        }
        return -1L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public boolean setClipInfo(int i11, int i12, String str, TPDownloadParam tPDownloadParam) {
        int dlType = tPDownloadParam.getDlType();
        if (tPDownloadParam.isOffline()) {
            dlType += 300;
        }
        int i13 = dlType;
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                if (TPDownloadProxyNative.getInstance().setClipInfo(i11, i12, str, i13, tPDownloadParam.getCdnUrls(), tPDownloadParam.getSavaPath(), tPDownloadParam.getExtraJsonInfo()) < 0) {
                    return false;
                }
                return true;
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "setClipInfo failed, error:" + th2.toString());
            }
        }
        return false;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void setMaxStorageSizeMB(long j11) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().setMaxStorageSizeMB(this.mServiceType, j11);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "setMaxStorageSizeMB failed, error:" + th2.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int startClipOfflineDownload(String str, int i11, ITPOfflineDownloadListener iTPOfflineDownloadListener) {
        int iCreateDownloadTask = -1;
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                iCreateDownloadTask = TPDownloadProxyNative.getInstance().createDownloadTask(this.mServiceType, str, 102, i11);
                TPListenerManager.getInstance().setOfflineDownloadListener(iCreateDownloadTask, iTPOfflineDownloadListener);
                return iCreateDownloadTask;
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startClipOfflineDownload failed, error:" + th2.toString());
            }
        }
        return iCreateDownloadTask;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int startClipPlay(String str, int i11, ITPPlayListener iTPPlayListener) {
        int iCreateDownloadTask = -1;
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                iCreateDownloadTask = TPDownloadProxyNative.getInstance().createDownloadTask(this.mServiceType, str, 2, i11);
                TPListenerManager.getInstance().setPlayListener(iCreateDownloadTask, iTPPlayListener);
                return iCreateDownloadTask;
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startClipPlay failed, error:" + th2.toString());
            }
        }
        return iCreateDownloadTask;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int startClipPreload(String str, int i11, ITPPreLoadListener iTPPreLoadListener) {
        int iCreateDownloadTask = -1;
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                iCreateDownloadTask = TPDownloadProxyNative.getInstance().createDownloadTask(this.mServiceType, str, 202, i11);
                TPListenerManager.getInstance().setPreLoadListener(iCreateDownloadTask, iTPPreLoadListener);
                return iCreateDownloadTask;
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startClipPreload failed, error:" + th2.toString());
            }
        }
        return iCreateDownloadTask;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int startOfflineDownload(String str, TPDownloadParam tPDownloadParam, ITPOfflineDownloadListener iTPOfflineDownloadListener) {
        Throwable th2;
        int i11 = -1;
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                int dlType = tPDownloadParam.getDlType() + 100;
                int iCreateDownloadTask = TPDownloadProxyNative.getInstance().createDownloadTask(this.mServiceType, str, dlType, tPDownloadParam.getClipCount());
                try {
                    TPListenerManager.getInstance().setOfflineDownloadListener(iCreateDownloadTask, iTPOfflineDownloadListener);
                    if (!TextUtils.isEmpty(tPDownloadParam.getKeyid())) {
                        str = tPDownloadParam.getKeyid();
                    }
                    TPDownloadProxyNative.getInstance().setClipInfo(iCreateDownloadTask, tPDownloadParam.getClipNo(), str, dlType, tPDownloadParam.getCdnUrls(), tPDownloadParam.getSavaPath(), tPDownloadParam.getExtraJsonInfo());
                    TPDownloadProxyNative.getInstance().startDownload(iCreateDownloadTask);
                    return iCreateDownloadTask;
                } catch (Throwable th3) {
                    th2 = th3;
                    i11 = iCreateDownloadTask;
                    TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "stopOfflineDownload failed, error:" + th2.toString());
                    return i11;
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
        }
        return i11;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int startPlay(String str, TPDownloadParam tPDownloadParam, ITPPlayListener iTPPlayListener) {
        Throwable th2;
        int dlType = tPDownloadParam.getDlType();
        if (iTPPlayListener != null) {
            tPDownloadParam.getExtInfoMap().put(TPDownloadProxyEnum.DLPARAM_ADV_REMAIN_TIME, Long.valueOf(iTPPlayListener.getAdvRemainTime() / 1000));
        }
        if (tPDownloadParam.isOffline()) {
            dlType += 300;
        }
        int i11 = -1;
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                if (tPDownloadParam.isAdaptive() && (dlType == 3 || dlType == 5)) {
                    dlType += 400;
                }
                int i12 = dlType;
                int iCreateDownloadTask = TPDownloadProxyNative.getInstance().createDownloadTask(this.mServiceType, str, i12, tPDownloadParam.getClipCount());
                try {
                    TPListenerManager.getInstance().setPlayListener(iCreateDownloadTask, iTPPlayListener);
                    if (!TextUtils.isEmpty(tPDownloadParam.getKeyid())) {
                        str = tPDownloadParam.getKeyid();
                    }
                    TPDownloadProxyNative.getInstance().setClipInfo(iCreateDownloadTask, tPDownloadParam.getClipNo(), str, i12, tPDownloadParam.getCdnUrls(), tPDownloadParam.getSavaPath(), tPDownloadParam.getExtraJsonInfo());
                    return iCreateDownloadTask;
                } catch (Throwable th3) {
                    th2 = th3;
                    i11 = iCreateDownloadTask;
                    TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startPlay failed, error:" + th2.toString());
                    return i11;
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
        }
        return i11;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int startPreload(String str, TPDownloadParam tPDownloadParam, ITPPreLoadListener iTPPreLoadListener) {
        Throwable th2;
        int i11 = -1;
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                int dlType = tPDownloadParam.getDlType() + 200;
                int iCreateDownloadTask = TPDownloadProxyNative.getInstance().createDownloadTask(this.mServiceType, str, dlType, tPDownloadParam.getClipCount());
                try {
                    TPListenerManager.getInstance().setPreLoadListener(iCreateDownloadTask, iTPPreLoadListener);
                    if (!TextUtils.isEmpty(tPDownloadParam.getKeyid())) {
                        str = tPDownloadParam.getKeyid();
                    }
                    TPDownloadProxyNative.getInstance().setClipInfo(iCreateDownloadTask, tPDownloadParam.getClipNo(), str, dlType, tPDownloadParam.getCdnUrls(), tPDownloadParam.getSavaPath(), tPDownloadParam.getExtraJsonInfo());
                    TPDownloadProxyNative.getInstance().startDownload(iCreateDownloadTask);
                    return iCreateDownloadTask;
                } catch (Throwable th3) {
                    th2 = th3;
                    i11 = iCreateDownloadTask;
                    TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startPreload failed, error:" + th2.toString());
                    return i11;
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
        }
        return i11;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void updateStoragePath(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.mCurrentStoragePath = str;
            TPDownloadProxyNative.getInstance().updateStoragePath(this.mServiceType, str);
        } catch (Throwable th2) {
            TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "updateStoragePath failed, error:" + th2.toString());
        }
    }
}
