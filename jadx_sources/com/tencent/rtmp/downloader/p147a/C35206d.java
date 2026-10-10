package com.tencent.rtmp.downloader.p147a;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.sdk.common.HouseBuilder;
import com.tencent.liteav.txcplayer.common.C34810b;
import com.tencent.liteav.txcplayer.common.C34811c;
import com.tencent.liteav.txcplayer.p131a.C34804a;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPOfflineDownloadListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDLProxyInitParam;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadParam;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.rtmp.downloader.a.d */
/* JADX INFO: loaded from: classes56.dex */
public class C35206d {

    /* JADX INFO: renamed from: e */
    private static C35206d f75402e;

    /* JADX INFO: renamed from: a */
    public String f75403a;

    /* JADX INFO: renamed from: b */
    public a f75404b;

    /* JADX INFO: renamed from: c */
    public Map<String, String> f75405c;

    /* JADX INFO: renamed from: d */
    public ITPDownloadProxy f75406d = TPDownloadProxyFactory.getTPDownloadProxy(2330303);

    /* JADX INFO: renamed from: com.tencent.rtmp.downloader.a.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo77268a(C35205c c35205c);

        /* JADX INFO: renamed from: a */
        void mo77269a(C35205c c35205c, int i11, String str);

        /* JADX INFO: renamed from: b */
        void mo77270b(C35205c c35205c);

        /* JADX INFO: renamed from: c */
        void mo77271c(C35205c c35205c);

        /* JADX INFO: renamed from: d */
        void mo77272d(C35205c c35205c);
    }

    /* JADX INFO: renamed from: a */
    public static C35206d m77291a(Context context) {
        synchronized (C35206d.class) {
            try {
                if (f75402e == null) {
                    f75402e = new C35206d(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f75402e;
    }

    private C35206d(Context context) {
        File externalFilesDir;
        if (context != null) {
            String strM76231a = C34810b.m76231a();
            this.f75403a = strM76231a;
            try {
                if (TextUtils.isEmpty(strM76231a) && (externalFilesDir = context.getExternalFilesDir(null)) != null) {
                    this.f75403a = externalFilesDir.getAbsolutePath() + "/txcache";
                }
                if (!TextUtils.isEmpty(this.f75403a)) {
                    File file = new File(this.f75403a);
                    if (!file.exists() || !file.isDirectory()) {
                        file.mkdirs();
                    }
                }
            } catch (Exception e11) {
                LiteavLog.m76083e("ThumbPlayerDownloader", "downloader init exception: " + e11.getLocalizedMessage());
            }
            this.f75406d.init(context, new TPDLProxyInitParam(2330303, "1.0.0", "liteav_tbplayer_android_" + context.getPackageName(), this.f75403a));
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m77295b(C35205c c35205c) {
        String playPath = c35205c.getPlayPath();
        if (TextUtils.isEmpty(playPath)) {
            return false;
        }
        String strSubstring = playPath.substring(0, playPath.indexOf("?"));
        String strSubstring2 = strSubstring.substring(0, strSubstring.lastIndexOf("/"));
        String strSubstring3 = strSubstring.substring(strSubstring.lastIndexOf("/") + 1);
        this.f75406d.updateStoragePath(strSubstring2);
        return this.f75406d.checkResourceExist(strSubstring2, strSubstring3, c35205c.getPreferredResolution());
    }

    /* JADX INFO: renamed from: c */
    public final int m77296c(final C35205c c35205c) {
        String playPath = c35205c.getPlayPath();
        if (TextUtils.isEmpty(playPath)) {
            return -1;
        }
        String strSubstring = playPath.substring(0, playPath.indexOf("?"));
        String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf("/") + 1);
        String url = c35205c.getUrl();
        ArrayList arrayList = new ArrayList();
        arrayList.add(url);
        TPDownloadParam tPDownloadParam = new TPDownloadParam(arrayList, 0, null);
        HashMap map = new HashMap();
        Map<String, String> map2 = this.f75405c;
        if (map2 != null && map2.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(this.f75405c);
            map.put(TPDownloadProxyEnum.DLPARAM_URL_HEADER, arrayList2);
        }
        long preferredResolution = c35205c.getPreferredResolution();
        if (preferredResolution > 0) {
            map.put(TPDownloadProxyEnum.DLPARAM_OFFLINE_SCHEDULER_LEVEL, 4);
            map.put(TPDownloadProxyEnum.DLPARAM_PREFERRED_RESOLUTION, Long.valueOf(preferredResolution));
        }
        if (c35205c.getEncryptedLevel() == 2 && C34811c.m76238a(HouseBuilder.EnumC34765a.PLAYER_PREMIUM)) {
            map.put(TPDownloadProxyEnum.DLPARAM_CACHE_NEED_ENCRYPT, Boolean.TRUE);
        }
        if (c35205c.getDrmBuilder() != null) {
            map.put(TPDownloadProxyEnum.DLPARAM_KEY_LICENSE_URL, c35205c.getDrmBuilder().getKeyLicenseUrl());
            map.put(TPDownloadProxyEnum.DLPARAM_DEVICE_CERTIFICATE_URL, c35205c.getDrmBuilder().getDeviceCertificateUrl());
        }
        tPDownloadParam.setExtInfoMap(map);
        int iStartOfflineDownload = this.f75406d.startOfflineDownload(strSubstring2, tPDownloadParam, new ITPOfflineDownloadListener() { // from class: com.tencent.rtmp.downloader.a.d.1
            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPOfflineDownloadListener
            public final void onDownloadCdnUrlExpired(Map<String, String> map3) {
                LiteavLog.m76087i("ThumbPlayerDownloader", "onDownloadCdnUrlExpired!");
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPOfflineDownloadListener
            public final void onDownloadError(int i11, int i12, String str) {
                LiteavLog.m76083e("ThumbPlayerDownloader", "offline download error! moduleID:" + i11 + ", errCode:" + i12);
                if (C35206d.this.f75404b != null) {
                    C35206d.this.f75404b.mo77269a(c35205c, i12, str);
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPOfflineDownloadListener
            public final void onDownloadFinish() {
                if (C35206d.this.f75404b != null) {
                    C35206d.this.f75404b.mo77271c(c35205c);
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPOfflineDownloadListener
            public final void onDownloadProgressUpdate(int i11, int i12, long j11, long j12, String str) {
                if (j11 > 1024 && j11 != c35205c.getDownloadSize()) {
                    c35205c.m77282b(j11);
                }
                if (c35205c.getSize() <= 0 && j12 > 0) {
                    c35205c.m77276a(j12);
                }
                if (i11 > 0) {
                    c35205c.m77281b(i11);
                }
                if (c35205c.getDuration() <= 0 && !TextUtils.isEmpty(str) && str.contains("totalDuration")) {
                    for (String str2 : str.split(",")) {
                        if (str2.contains("totalDuration")) {
                            c35205c.m77275a(Integer.valueOf(str2.split(C33844oi.f71346o)[1]).intValue() * 1000);
                            break;
                        }
                    }
                }
                c35205c.m77288e(i12);
                if (C35206d.this.f75404b != null) {
                    C35206d.this.f75404b.mo77272d(c35205c);
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPOfflineDownloadListener
            public final void onDownloadProtocolUpdate(String str, String str2) {
                LiteavLog.m76087i("ThumbPlayerDownloader", "onDownloadProtocolUpdate! protocol:" + str + ", protocolVer:" + str2);
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPOfflineDownloadListener
            public final void onDownloadStatusUpdate(int i11) {
                LiteavLog.m76087i("ThumbPlayerDownloader", "onDownloadStatusUpdate! statusCode:".concat(String.valueOf(i11)));
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPOfflineDownloadListener
            public final void onDownloadCdnUrlUpdate(String str) {
                LiteavLog.m76087i("ThumbPlayerDownloader", "onDownloadCdnUrlUpdate! url:".concat(String.valueOf(str)));
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPOfflineDownloadListener
            public final void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
            }
        });
        c35205c.m77284c(iStartOfflineDownload);
        a aVar = this.f75404b;
        if (aVar != null) {
            aVar.mo77268a(c35205c);
        }
        return iStartOfflineDownload;
    }

    /* JADX INFO: renamed from: a */
    public final String m77293a(String str) {
        String strM76231a = C34810b.m76231a();
        if (!TextUtils.equals(this.f75403a, strM76231a)) {
            if (!TextUtils.isEmpty(strM76231a)) {
                this.f75403a = strM76231a;
            } else {
                C34810b.m76233a(this.f75403a);
            }
        }
        this.f75406d.updateStoragePath(this.f75403a);
        return this.f75403a + "/" + C34804a.m76217d(str) + "?" + str;
    }

    /* JADX INFO: renamed from: a */
    public final float m77292a(C35205c c35205c) {
        String playPath = c35205c.getPlayPath();
        if (TextUtils.isEmpty(playPath)) {
            return 0.0f;
        }
        String strSubstring = playPath.substring(0, playPath.indexOf("?"));
        return this.f75406d.getResourceDownloadProgress(strSubstring.substring(0, strSubstring.lastIndexOf("/")), strSubstring.substring(strSubstring.lastIndexOf("/") + 1), c35205c.getPreferredResolution());
    }

    /* JADX INFO: renamed from: a */
    public final boolean m77294a(String str, long j11) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.trim().endsWith(".sqlite")) {
            return new File(str).delete();
        }
        String strSubstring = str.substring(0, str.indexOf("?"));
        String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf("/") + 1);
        if (!TextUtils.isEmpty(strSubstring2)) {
            String strSubstring3 = strSubstring.substring(0, strSubstring.lastIndexOf("/"));
            this.f75406d.updateStoragePath(strSubstring3);
            if (this.f75406d.clearCache(strSubstring3, strSubstring2, 1, j11) == 0) {
                return true;
            }
        }
        return false;
    }
}
