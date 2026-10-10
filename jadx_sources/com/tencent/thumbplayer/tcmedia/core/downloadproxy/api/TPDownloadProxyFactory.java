package com.tencent.thumbplayer.tcmedia.core.downloadproxy.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.client.TPDownloadProxyClient;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.jni.TPDownloadProxyNative;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.service.TPDownloadProxyService;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLProxyLog;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes63.dex */
public class TPDownloadProxyFactory {
    private static final String FILE_NAME = "TPDownloadProxyFactory";
    private static TPDownloadProxyFactoryAidl downloadProxyFactoryAidl;
    private static Object mMapObject = new Object();
    private static HashMap<Integer, ITPDownloadProxy> mvTPDownloadProxyMap = new HashMap<>();
    private static HashMap<Integer, TPDownloadProxyClient> mvTPDownloadProxyClientMap = new HashMap<>();
    private static boolean mUseService = false;
    private static boolean mCanUseAIDL = false;
    private static boolean mIsReadyForDownload = false;
    private static TPDLProxyBindServiceCallback mCallback = null;
    private static ServiceConnection mConnection = new ServiceConnection() { // from class: com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyFactory.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            TPDownloadProxyFactoryAidl unused = TPDownloadProxyFactory.downloadProxyFactoryAidl = TPDownloadProxyFactoryAidl.Stub.asInterface(iBinder);
            try {
                for (Map.Entry entry : TPDownloadProxyFactory.mvTPDownloadProxyClientMap.entrySet()) {
                    ((TPDownloadProxyClient) entry.getValue()).updateAidl(TPDownloadProxyFactory.downloadProxyFactoryAidl.getTPDownloadProxy(((Integer) entry.getKey()).intValue()));
                }
            } catch (Throwable th2) {
                TPDLProxyLog.m78075i(TPDownloadProxyFactory.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onServiceConnected failed, error:" + th2.toString());
            }
            TPDLProxyLog.m78075i(TPDownloadProxyFactory.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "on service connected!");
            if (TPDownloadProxyFactory.downloadProxyFactoryAidl == null) {
                TPDLProxyLog.m78075i(TPDownloadProxyFactory.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "on service connected, aidl is null!");
                return;
            }
            TPDLProxyLog.m78075i(TPDownloadProxyFactory.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "on service connected, aidl not null!");
            TPDownloadProxyFactory.setCanUseAIDL(true);
            if (TPDownloadProxyFactory.mCallback != null) {
                TPDownloadProxyFactory.mCallback.onBindSuccess();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            TPDLProxyLog.m78075i(TPDownloadProxyFactory.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "on service disconnected");
            TPDownloadProxyFactoryAidl unused = TPDownloadProxyFactory.downloadProxyFactoryAidl = null;
            TPDownloadProxyFactory.setCanUseAIDL(false);
            TPDownloadProxyFactory.ensurePlayManagerService(TPDownloadProxyFactory.mCallback);
        }
    };

    public static ITPDownloadProxy getTPDownloadProxy(int i11) {
        ITPDownloadProxy tPDownloadProxy;
        if (i11 <= 0) {
            TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getTPDownloadProxy is invalid, serviceType:".concat(String.valueOf(i11)));
            return null;
        }
        if (mUseService) {
            if (!mCanUseAIDL) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getTPDownloadProxy failed, can't use aidl!");
                return null;
            }
            try {
                return getTPDownloadProxyService(i11);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getTPDownloadProxy failed, error:" + th2.toString());
                return null;
            }
        }
        synchronized (mMapObject) {
            try {
                tPDownloadProxy = mvTPDownloadProxyMap.get(Integer.valueOf(i11));
                if (tPDownloadProxy == null) {
                    tPDownloadProxy = new TPDownloadProxy(i11);
                    mvTPDownloadProxyMap.put(Integer.valueOf(i11), tPDownloadProxy);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return tPDownloadProxy;
    }

    public static synchronized boolean canUseService() {
        if (!mUseService) {
            return true;
        }
        if (!mCanUseAIDL) {
            return false;
        }
        TPDownloadProxyFactoryAidl tPDownloadProxyFactoryAidl = downloadProxyFactoryAidl;
        if (tPDownloadProxyFactoryAidl != null) {
            try {
                tPDownloadProxyFactoryAidl.isReadyForPlay();
                return true;
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "canUseService failed, error:" + th2.toString());
            }
        }
        return false;
    }

    public static synchronized boolean getCanUseAIDL() {
        return mCanUseAIDL;
    }

    public static String getNativeVersion() {
        if (!mUseService) {
            return TPDownloadProxyNative.getInstance().getNativeVersion();
        }
        if (!mCanUseAIDL) {
            return TPDownloadProxyNative.getInstance().getNativeVersion();
        }
        TPDownloadProxyFactoryAidl tPDownloadProxyFactoryAidl = downloadProxyFactoryAidl;
        if (tPDownloadProxyFactoryAidl != null) {
            try {
                return tPDownloadProxyFactoryAidl.getNativeVersion();
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getNativeVersion failed, error:" + th2.toString());
            }
        }
        return TPDownloadProxyNative.getInstance().getNativeVersion();
    }

    private static synchronized ITPDownloadProxy getTPDownloadProxyService(int i11) {
        TPDownloadProxyClient tPDownloadProxyClient;
        try {
            if (downloadProxyFactoryAidl == null) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getTPDownloadProxyService failed, aidl is null!");
                return null;
            }
            synchronized (mvTPDownloadProxyClientMap) {
                try {
                    tPDownloadProxyClient = mvTPDownloadProxyClientMap.get(Integer.valueOf(i11));
                    if (tPDownloadProxyClient == null) {
                        try {
                            tPDownloadProxyClient = new TPDownloadProxyClient(downloadProxyFactoryAidl.getTPDownloadProxy(i11));
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getTPDownloadProxyService failed, error:" + th2.toString());
                        }
                    }
                    mvTPDownloadProxyClientMap.put(Integer.valueOf(i11), tPDownloadProxyClient);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return tPDownloadProxyClient;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public static boolean getUseService() {
        return mUseService;
    }

    public static synchronized boolean isReadyForDownload() {
        try {
            boolean zIsReadyForDownload = false;
            if (!mUseService) {
                TPDLProxyLog.m78075i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "isReadyForDownload ret:" + mIsReadyForDownload);
                return mIsReadyForDownload;
            }
            if (!mCanUseAIDL) {
                return false;
            }
            TPDownloadProxyFactoryAidl tPDownloadProxyFactoryAidl = downloadProxyFactoryAidl;
            if (tPDownloadProxyFactoryAidl != null) {
                try {
                    zIsReadyForDownload = tPDownloadProxyFactoryAidl.isReadyForDownload();
                } catch (Throwable th2) {
                    TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "isReadyForDownload failed, error:" + th2.toString());
                }
            }
            return zIsReadyForDownload;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static synchronized boolean isReadyForPlay() {
        try {
            boolean zIsReadyForPlay = false;
            if (!mUseService) {
                boolean zIsReadyForWork = TPDownloadProxyNative.getInstance().isReadyForWork();
                TPDLProxyLog.m78075i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "isReadyForPlay ret:".concat(String.valueOf(zIsReadyForWork)));
                return zIsReadyForWork;
            }
            if (!mCanUseAIDL) {
                return false;
            }
            TPDownloadProxyFactoryAidl tPDownloadProxyFactoryAidl = downloadProxyFactoryAidl;
            if (tPDownloadProxyFactoryAidl != null) {
                try {
                    zIsReadyForPlay = tPDownloadProxyFactoryAidl.isReadyForPlay();
                } catch (Throwable th2) {
                    TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "isReadyForPlay failed, error:" + th2.toString());
                }
            }
            return zIsReadyForPlay;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void setCanUseAIDL(boolean z11) {
        mCanUseAIDL = z11;
    }

    public static synchronized void setReadyForDownload(boolean z11) {
        mIsReadyForDownload = z11;
    }

    public static void setUseService(boolean z11) {
        mUseService = z11;
    }

    public static boolean ensurePlayManagerService(TPDLProxyBindServiceCallback tPDLProxyBindServiceCallback) {
        Context context = TPDownloadProxyHelper.getContext();
        if (context == null) {
            TPDLProxyLog.m78075i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "ensurePlayManagerService get context null!");
            return false;
        }
        mCallback = tPDLProxyBindServiceCallback;
        TPDLProxyLog.m78075i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "ensurePlayManagerService ok");
        try {
            Intent intent = new Intent(context, (Class<?>) TPDownloadProxyService.class);
            context.startService(intent);
            if (!context.bindService(intent, mConnection, 1)) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "ensurePlayManagerService bind service failed!");
            }
            return true;
        } catch (Throwable th2) {
            TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "ensurePlayManagerService failed, error:" + th2.toString());
            return false;
        }
    }
}
