package com.tencent.thumbplayer.tcmedia.core.downloadproxy.service;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPreLoadListenerAidl;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.TPDownloadParamAidl;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDLProxyInitParam;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadParam;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyFactory;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyHelper;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.apiinner.TPListenerManager;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.jni.TPDownloadProxyNative;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLProxyLog;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLProxyUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes63.dex */
public class TPDownloadProxyService extends Service {
    private static final String FILE_NAME = "TPDownloadProxyService";
    private int pid = -1;
    private TPDownloadProxyFactoryAidl.Stub downloadProxyFactory = null;

    public class DownloadProxy extends ITPDownloadProxyAidl.Stub {
        private ITPDownloadProxy downloadProxy;

        public DownloadProxy(int i11) {
            this.downloadProxy = null;
            this.downloadProxy = TPDownloadProxyFactory.getTPDownloadProxy(i11);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public boolean checkResourceExist(String str, String str2, long j11) throws RemoteException {
            try {
                return this.downloadProxy.checkResourceExist(str, str2, j11);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "checkResourceExist failed, error:" + th2.toString());
                return false;
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int checkResourceStatus(String str, String str2, int i11) {
            try {
                return this.downloadProxy.checkResourceStatus(str, str2, i11);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "checkResourceStatus failed, error:" + th2.toString());
                return -1;
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int clearCache(String str, String str2, int i11, long j11) {
            try {
                return this.downloadProxy.clearCache(str, str2, i11, j11);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "clearCache failed, error:" + th2.toString());
                return -1;
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int deleteOfflineLicenseKeySetId(String str, String str2, String str3) {
            try {
                return this.downloadProxy.deleteOfflineLicenseKeySetId(str, str2, str3);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "deleteOfflineLicenseKeySetId failed, error:" + th2.toString());
                return -1;
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public String getClipPlayUrl(int i11, int i12, int i13) {
            return this.downloadProxy.getClipPlayUrl(i11, i12, i13);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public String getNativeInfo(int i11) {
            try {
                return this.downloadProxy.getNativeInfo(i11);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getNativeInfo failed, error:" + th2.toString());
                return null;
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public byte[] getOfflineLicenseKeySetId(String str, String str2, String str3) {
            try {
                return this.downloadProxy.getOfflineLicenseKeySetId(str, str2, str3);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getOfflineLicenseKeySetId failed, error:" + th2.toString());
                return null;
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public String getPlayErrorCodeStr(int i11) {
            return this.downloadProxy.getPlayErrorCodeStr(i11);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public String getPlayUrl(int i11, int i12) {
            return this.downloadProxy.getPlayUrl(i11, i12);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public float getResourceDownloadProgress(String str, String str2, long j11) throws RemoteException {
            try {
                return this.downloadProxy.getResourceDownloadProgress(str, str2, j11);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getResourceDownloadProgress failed, error:" + th2.toString());
                return 0.0f;
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public long getResourceSize(String str, String str2) {
            try {
                return this.downloadProxy.getResourceSize(str, str2);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getResourceSize failed, error:" + th2.toString());
                return -1L;
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int init(String str) {
            try {
                TPDLProxyInitParam tPDLProxyInitParam = (TPDLProxyInitParam) TPDLProxyUtils.serializeToObject(str);
                if (tPDLProxyInitParam != null) {
                    return this.downloadProxy.init(TPDownloadProxyHelper.getContext(), tPDLProxyInitParam);
                }
                TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "param is null");
                return -1;
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "init failed, error:" + th2.toString());
                return -2;
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int pauseDownload(int i11) {
            return this.downloadProxy.pauseDownload(i11);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void pushEvent(int i11) {
            this.downloadProxy.pushEvent(i11);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int removeStorageCache(String str, long j11) throws RemoteException {
            try {
                return this.downloadProxy.removeStorageCache(str, j11);
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "removeStorageCache failed, error:" + th2.toString());
                return -1;
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int resumeDownload(int i11) {
            return this.downloadProxy.resumeDownload(i11);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public boolean setClipInfo(int i11, int i12, String str, TPDownloadParamAidl tPDownloadParamAidl) {
            return this.downloadProxy.setClipInfo(i11, i12, str, new TPDownloadParam(tPDownloadParamAidl.getUrlList(), tPDownloadParamAidl.getDlType(), tPDownloadParamAidl.getExtInfoMap()));
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void setMaxStorageSizeMB(long j11) {
            this.downloadProxy.setMaxStorageSizeMB(j11);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void setPlayState(int i11, int i12) {
            this.downloadProxy.setPlayState(i11, i12);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void setUserData(Map map) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (entry != null) {
                        try {
                            if (entry.getValue() != null) {
                                this.downloadProxy.setUserData((String) entry.getKey(), entry.getValue());
                            }
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "setUserData failed, error:" + th2.toString());
                        }
                    }
                }
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int startClipPlay(String str, int i11, final ITPPlayListenerAidl iTPPlayListenerAidl) {
            return this.downloadProxy.startClipPlay(str, i11, new ITPPlayListener() { // from class: com.tencent.thumbplayer.tcmedia.core.downloadproxy.service.TPDownloadProxyService.DownloadProxy.2
                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                public Object getPlayInfo(long j11) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            return iTPPlayListenerAidl2.getPlayInfo(Long.toString(j11));
                        }
                        return null;
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getPlayInfo type failed, error:" + th2.toString());
                        return null;
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                public long getAdvRemainTime() {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            return iTPPlayListenerAidl2.getAdvRemainTime();
                        }
                        return -1L;
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getAdvRemainTime failed, error:" + th2.toString());
                        return -1L;
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                public String getContentType(int i12, String str2) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        return iTPPlayListenerAidl2 != null ? iTPPlayListenerAidl2.getContentType(i12, str2) : "";
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getContentType key failed, error:" + th2.toString());
                        return "";
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                public int getCurrentPlayClipNo() {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            return iTPPlayListenerAidl2.getCurrentPlayClipNo();
                        }
                        return -1;
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getCurrentPlayClipNo failed, error:" + th2.toString());
                        return -1;
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                public long[] getCurrentPlayOffset() {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            return iTPPlayListenerAidl2.getCurrentPlayOffset();
                        }
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getCurrentPlayOffset failed, error:" + th2.toString());
                    }
                    return new long[]{-1, -1};
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                public long getCurrentPosition() {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            return iTPPlayListenerAidl2.getCurrentPosition();
                        }
                        return -1L;
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getCurrentPosition failed, error:" + th2.toString());
                        return -1L;
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                public String getDataFilePath(int i12, String str2) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        return iTPPlayListenerAidl2 != null ? iTPPlayListenerAidl2.getDataFilePath(i12, str2) : "";
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getDataFilePath key failed, error:" + th2.toString());
                        return "";
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                public long getDataTotalSize(int i12, String str2) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            return iTPPlayListenerAidl2.getDataTotalSize(i12, str2);
                        }
                        return -1L;
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getDataTotalSize key failed, error:" + th2.toString());
                        return -1L;
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                public long getPlayerBufferLength() {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            return iTPPlayListenerAidl2.getPlayerBufferLength();
                        }
                        return -1L;
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getPlayerBufferLength failed, error:" + th2.toString());
                        return -1L;
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                public void onDownloadCdnUrlExpired(Map<String, String> map) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            iTPPlayListenerAidl2.onDownloadCdnUrlExpired(map);
                        }
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadCdnUrlExpired failed, error:" + th2.toString());
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                public void onDownloadCdnUrlInfoUpdate(String str2, String str3, String str4, String str5) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            iTPPlayListenerAidl2.onDownloadCdnUrlInfoUpdate(str2, str3, str4, str5);
                        }
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadCdnUrlInfoUpdate failed, error:" + th2.toString());
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                public void onDownloadCdnUrlUpdate(String str2) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            iTPPlayListenerAidl2.onDownloadCdnUrlUpdate(str2);
                        }
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadCdnUrlUpdate failed, error:" + th2.toString());
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                public void onDownloadError(int i12, int i13, String str2) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            iTPPlayListenerAidl2.onDownloadError(i12, i13, str2);
                        }
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadError failed, error:" + th2.toString());
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                public void onDownloadFinish() {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            iTPPlayListenerAidl2.onDownloadFinish();
                        }
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadFinish failed, error:" + th2.toString());
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                public void onDownloadProgressUpdate(int i12, int i13, long j11, long j12, String str2) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            iTPPlayListenerAidl2.onDownloadProgressUpdate(i12, i13, j11, j12, str2);
                        }
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadProgressUpdate failed, error:" + th2.toString());
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                public void onDownloadProtocolUpdate(String str2, String str3) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            iTPPlayListenerAidl2.onDownloadProtocolUpdate(str2, str3);
                        }
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadProtocolUpdate failed, error:" + th2.toString());
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                public void onDownloadStatusUpdate(int i12) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            iTPPlayListenerAidl2.onDownloadStatusUpdate(i12);
                        }
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadStatusUpdate failed, error:" + th2.toString());
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                public Object onPlayCallback(int i12, Object obj, Object obj2, Object obj3, Object obj4) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        if (obj != null) {
                            arrayList.add(obj);
                        }
                        if (obj != null) {
                            arrayList.add(obj2);
                        }
                        if (obj != null) {
                            arrayList.add(obj3);
                        }
                        ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 == null) {
                            return null;
                        }
                        iTPPlayListenerAidl2.onPlayCallback(i12, arrayList);
                        return null;
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onPlayCallback failed, error:" + th2.toString());
                        return null;
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                public int onReadData(int i12, String str2, long j11, long j12) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            return iTPPlayListenerAidl2.onReadData(i12, str2, j11, j12);
                        }
                        return -1;
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onReadData key failed, error:" + th2.toString());
                        return -1;
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                public int onStartReadData(int i12, String str2, long j11, long j12) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            return iTPPlayListenerAidl2.onStartReadData(i12, str2, j11, j12);
                        }
                        return -1;
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onStartReadData key failed, error:" + th2.toString());
                        return -1;
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                public int onStopReadData(int i12, String str2, int i13) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            return iTPPlayListenerAidl2.onStopReadData(i12, str2, i13);
                        }
                        return -1;
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onStopReadData key failed, error:" + th2.toString());
                        return -1;
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                public Object getPlayInfo(String str2) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            return iTPPlayListenerAidl2.getPlayInfo(str2);
                        }
                        return null;
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getPlayInfo key failed, error:" + th2.toString());
                        return null;
                    }
                }
            });
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int startClipPreload(String str, int i11, final ITPPreLoadListenerAidl iTPPreLoadListenerAidl) {
            return this.downloadProxy.startClipPreload(str, i11, new ITPPreLoadListener() { // from class: com.tencent.thumbplayer.tcmedia.core.downloadproxy.service.TPDownloadProxyService.DownloadProxy.4
                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener
                public void onPrepareDownloadProgressUpdate(int i12, int i13, long j11, long j12, String str2) {
                    try {
                        ITPPreLoadListenerAidl iTPPreLoadListenerAidl2 = iTPPreLoadListenerAidl;
                        if (iTPPreLoadListenerAidl2 != null) {
                            iTPPreLoadListenerAidl2.onPrepareDownloadProgressUpdate(i12, i13, j11, j12, str2);
                        }
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onPrepareDownloadProgressUpdate failed, error:" + th2.toString());
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener
                public void onPrepareError(int i12, int i13, String str2) {
                    try {
                        ITPPreLoadListenerAidl iTPPreLoadListenerAidl2 = iTPPreLoadListenerAidl;
                        if (iTPPreLoadListenerAidl2 != null) {
                            iTPPreLoadListenerAidl2.onPrepareError(i12, i13, str2);
                        }
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onPrepareError failed, error:" + th2.toString());
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener
                public void onPrepareOK() {
                    try {
                        ITPPreLoadListenerAidl iTPPreLoadListenerAidl2 = iTPPreLoadListenerAidl;
                        if (iTPPreLoadListenerAidl2 != null) {
                            iTPPreLoadListenerAidl2.onPrepareOK();
                        }
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onPrepareOK failed, error:" + th2.toString());
                    }
                }
            });
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int startPlay(String str, TPDownloadParamAidl tPDownloadParamAidl, final ITPPlayListenerAidl iTPPlayListenerAidl) {
            try {
                return this.downloadProxy.startPlay(str, new TPDownloadParam(tPDownloadParamAidl.getUrlList(), tPDownloadParamAidl.getDlType(), tPDownloadParamAidl.getExtInfoMap()), new ITPPlayListener() { // from class: com.tencent.thumbplayer.tcmedia.core.downloadproxy.service.TPDownloadProxyService.DownloadProxy.1
                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                    public Object getPlayInfo(long j11) {
                        try {
                            return iTPPlayListenerAidl.getPlayInfo(Long.toString(j11));
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getPlayInfo type failed, error:" + th2.toString());
                            return null;
                        }
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                    public long getAdvRemainTime() {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                return iTPPlayListenerAidl2.getAdvRemainTime();
                            }
                            return -1L;
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getAdvRemainTime failed, error:" + th2.toString());
                            return -1L;
                        }
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                    public String getContentType(int i11, String str2) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            return iTPPlayListenerAidl2 != null ? iTPPlayListenerAidl2.getContentType(i11, str2) : "";
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getContentType key failed, error:" + th2.toString());
                            return "";
                        }
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                    public int getCurrentPlayClipNo() {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                return iTPPlayListenerAidl2.getCurrentPlayClipNo();
                            }
                            return -1;
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getCurrentPlayClipInfo failed, error:" + th2.toString());
                            return -1;
                        }
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                    public long[] getCurrentPlayOffset() {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                return iTPPlayListenerAidl2.getCurrentPlayOffset();
                            }
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getCurrentPlayOffset failed, error:" + th2.toString());
                        }
                        return new long[]{-1, -1};
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                    public long getCurrentPosition() {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                return iTPPlayListenerAidl2.getCurrentPosition();
                            }
                            return -1L;
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getCurrentPosition failed, error:" + th2.toString());
                            return -1L;
                        }
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                    public String getDataFilePath(int i11, String str2) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            return iTPPlayListenerAidl2 != null ? iTPPlayListenerAidl2.getDataFilePath(i11, str2) : "";
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getDataFilePath key failed, error:" + th2.toString());
                            return "";
                        }
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                    public long getDataTotalSize(int i11, String str2) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                return iTPPlayListenerAidl2.getDataTotalSize(i11, str2);
                            }
                            return -1L;
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getDataTotalSize key failed, error:" + th2.toString());
                            return -1L;
                        }
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                    public long getPlayerBufferLength() {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                return iTPPlayListenerAidl2.getPlayerBufferLength();
                            }
                            return -1L;
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getPlayerBufferLength failed, error:" + th2.toString());
                            return -1L;
                        }
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                    public void onDownloadCdnUrlExpired(Map<String, String> map) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                iTPPlayListenerAidl2.onDownloadCdnUrlExpired(map);
                            }
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadCdnUrlExpired failed, error:" + th2.toString());
                        }
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                    public void onDownloadCdnUrlInfoUpdate(String str2, String str3, String str4, String str5) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                iTPPlayListenerAidl2.onDownloadCdnUrlInfoUpdate(str2, str3, str4, str5);
                            }
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadCdnUrlInfoUpdate failed, error:" + th2.toString());
                        }
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                    public void onDownloadCdnUrlUpdate(String str2) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                iTPPlayListenerAidl2.onDownloadCdnUrlUpdate(str2);
                            }
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadCdnUrlUpdate failed, error:" + th2.toString());
                        }
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                    public void onDownloadError(int i11, int i12, String str2) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                iTPPlayListenerAidl2.onDownloadError(i11, i12, str2);
                            }
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadError failed, error:" + th2.toString());
                        }
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                    public void onDownloadFinish() {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                iTPPlayListenerAidl2.onDownloadFinish();
                            }
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownlaodFinish failed, error:" + th2.toString());
                        }
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                    public void onDownloadProgressUpdate(int i11, int i12, long j11, long j12, String str2) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                iTPPlayListenerAidl2.onDownloadProgressUpdate(i11, i12, j11, j12, str2);
                            }
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownlaodProgressUpdate failed, error:" + th2.toString());
                        }
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                    public void onDownloadProtocolUpdate(String str2, String str3) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                iTPPlayListenerAidl2.onDownloadProtocolUpdate(str2, str3);
                            }
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadProtocolUpdate failed, error:" + th2.toString());
                        }
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                    public void onDownloadStatusUpdate(int i11) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                iTPPlayListenerAidl2.onDownloadStatusUpdate(i11);
                            }
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadStatusUpdate failed, error:" + th2.toString());
                        }
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                    public Object onPlayCallback(int i11, Object obj, Object obj2, Object obj3, Object obj4) {
                        try {
                            ArrayList arrayList = new ArrayList();
                            if (obj != null) {
                                arrayList.add(obj);
                            }
                            if (obj2 != null) {
                                arrayList.add(obj2);
                            }
                            if (obj3 != null) {
                                arrayList.add(obj3);
                            }
                            ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 == null) {
                                return null;
                            }
                            iTPPlayListenerAidl2.onPlayCallback(i11, arrayList);
                            return null;
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onPlayCallback failed, error:" + th2.toString());
                            return null;
                        }
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                    public int onReadData(int i11, String str2, long j11, long j12) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                return iTPPlayListenerAidl2.onReadData(i11, str2, j11, j12);
                            }
                            return -1;
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onReadData key failed, error:" + th2.toString());
                            return -1;
                        }
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                    public int onStartReadData(int i11, String str2, long j11, long j12) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                return iTPPlayListenerAidl2.onStartReadData(i11, str2, j11, j12);
                            }
                            return -1;
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onStartReadData key failed, error:" + th2.toString());
                            return -1;
                        }
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                    public int onStopReadData(int i11, String str2, int i12) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                return iTPPlayListenerAidl2.onStopReadData(i11, str2, i12);
                            }
                            return -1;
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onStopReadData key failed, error:" + th2.toString());
                            return -1;
                        }
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
                    public Object getPlayInfo(String str2) {
                        try {
                            return iTPPlayListenerAidl.getPlayInfo(str2);
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getPlayInfo key failed, error:" + th2.toString());
                            return null;
                        }
                    }
                });
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startPlay failed, error:" + th2.toString());
                return -1;
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int startPreload(String str, TPDownloadParamAidl tPDownloadParamAidl, final ITPPreLoadListenerAidl iTPPreLoadListenerAidl) {
            return this.downloadProxy.startPreload(str, new TPDownloadParam(tPDownloadParamAidl.getUrlList(), tPDownloadParamAidl.getDlType(), tPDownloadParamAidl.getExtInfoMap()), new ITPPreLoadListener() { // from class: com.tencent.thumbplayer.tcmedia.core.downloadproxy.service.TPDownloadProxyService.DownloadProxy.3
                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener
                public void onPrepareDownloadProgressUpdate(int i11, int i12, long j11, long j12, String str2) {
                    try {
                        ITPPreLoadListenerAidl iTPPreLoadListenerAidl2 = iTPPreLoadListenerAidl;
                        if (iTPPreLoadListenerAidl2 != null) {
                            iTPPreLoadListenerAidl2.onPrepareDownloadProgressUpdate(i11, i12, j11, j12, str2);
                        }
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onPrepareDownloadProgressUpdate failed, error:" + th2.toString());
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener
                public void onPrepareError(int i11, int i12, String str2) {
                    try {
                        ITPPreLoadListenerAidl iTPPreLoadListenerAidl2 = iTPPreLoadListenerAidl;
                        if (iTPPreLoadListenerAidl2 != null) {
                            iTPPreLoadListenerAidl2.onPrepareError(i11, i12, str2);
                        }
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onPrepareError failed, error:" + th2.toString());
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener
                public void onPrepareOK() {
                    try {
                        ITPPreLoadListenerAidl iTPPreLoadListenerAidl2 = iTPPreLoadListenerAidl;
                        if (iTPPreLoadListenerAidl2 != null) {
                            iTPPreLoadListenerAidl2.onPrepareOK();
                        }
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onPrepareOK failed, error:" + th2.toString());
                    }
                }
            });
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void startTask(int i11) {
            this.downloadProxy.startTask(i11);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void stopPlay(int i11) {
            this.downloadProxy.stopPlay(i11);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void stopPreload(int i11) {
            this.downloadProxy.stopPreload(i11);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void updateTaskInfo(int i11, Map map) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (entry != null) {
                        try {
                            if (entry.getValue() != null) {
                                this.downloadProxy.updateTaskInfo(i11, (String) entry.getKey(), entry.getValue());
                            }
                        } catch (Throwable th2) {
                            TPDLProxyLog.m78074e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "updateTaskInfo failed, error:" + th2.toString());
                        }
                    }
                }
            }
        }
    }

    public class DownloadProxyFactory extends TPDownloadProxyFactoryAidl.Stub {
        private HashMap<Integer, ITPDownloadProxyAidl> mvTPDownloadProxyMap;

        private DownloadProxyFactory() {
            this.mvTPDownloadProxyMap = new HashMap<>();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl
        public synchronized ITPDownloadProxyAidl getTPDownloadProxy(int i11) {
            ITPDownloadProxyAidl downloadProxy;
            downloadProxy = this.mvTPDownloadProxyMap.get(Integer.valueOf(i11));
            if (downloadProxy == null) {
                downloadProxy = TPDownloadProxyService.this.new DownloadProxy(i11);
                this.mvTPDownloadProxyMap.put(Integer.valueOf(i11), downloadProxy);
            }
            return downloadProxy;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl
        public String getNativeVersion() {
            return TPDownloadProxyFactory.getNativeVersion();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl
        public boolean isReadyForDownload() {
            return TPDownloadProxyFactory.isReadyForDownload();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl
        public boolean isReadyForPlay() {
            return TPDownloadProxyFactory.isReadyForPlay();
        }
    }

    private boolean isExistMainProcess() {
        int i11;
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) getSystemService("activity")).getRunningAppProcesses()) {
                String str = runningAppProcessInfo.processName;
                if (!TextUtils.isEmpty(str) && str.equals(getPackageName())) {
                    int i12 = this.pid;
                    if (i12 != -1 && i12 != (i11 = runningAppProcessInfo.pid)) {
                        this.pid = i11;
                        return false;
                    }
                    this.pid = runningAppProcessInfo.pid;
                    TPDLProxyLog.m78075i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "app main exist!");
                    return true;
                }
            }
        } catch (Throwable th2) {
            TPDLProxyLog.m78075i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "isExistMainProcess failed, error:" + th2.toString());
        }
        return false;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (this.downloadProxyFactory == null) {
            this.downloadProxyFactory = new DownloadProxyFactory();
        }
        TPDLProxyLog.m78075i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "on bind!");
        isExistMainProcess();
        return this.downloadProxyFactory;
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        TPDLProxyLog.m78075i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "on rebind!");
        isExistMainProcess();
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        TPDLProxyLog.m78075i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "on unbind!");
        super.onUnbind(intent);
        if (isExistMainProcess()) {
            return true;
        }
        try {
            TPDownloadProxyNative.getInstance().stopAllDownload(3);
            TPListenerManager.getInstance().removeAllPlayListener();
            TPListenerManager.getInstance().removeAllPreLoadListener();
            return true;
        } catch (Throwable th2) {
            TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, th2.toString());
            return true;
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        super.onStartCommand(intent, i11, i12);
        TPDLProxyLog.m78075i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "on start command!");
        return 2;
    }
}
