package com.tencent.rtmp.downloader.p147a;

import android.app.Application;
import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.txcplayer.p131a.C34804a;
import com.tencent.liteav.txcplayer.p131a.C34806c;
import com.tencent.liteav.txcvodplayer.p133b.C34836c;
import com.tencent.liteav.txcvodplayer.p133b.C34837d;
import com.tencent.liteav.txcvodplayer.p133b.C34839f;
import com.tencent.liteav.txcvodplayer.p133b.C34840g;
import com.tencent.liteav.txcvodplayer.p133b.InterfaceC34838e;
import com.tencent.liteav.txcvodplayer.p134c.C34841a;
import com.tencent.rtmp.TXPlayerAuthBuilder;
import com.tencent.rtmp.TXPlayerDrmBuilder;
import com.tencent.rtmp.downloader.ITXVodDownloadListener;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import com.tencent.rtmp.downloader.TXVodDownloadManager;
import com.tencent.rtmp.downloader.TXVodDownloadMediaInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.rtmp.downloader.a.b */
/* JADX INFO: loaded from: classes56.dex */
public final class C35204b {

    /* JADX INFO: renamed from: a */
    public C35206d f75389a;

    /* JADX INFO: renamed from: b */
    public ArrayList<C35205c> f75390b;

    /* JADX INFO: renamed from: c */
    public ITXVodDownloadListener f75391c;

    /* JADX INFO: renamed from: d */
    C35206d.a f75392d = new C35206d.a() { // from class: com.tencent.rtmp.downloader.a.b.3
        @Override // com.tencent.rtmp.downloader.p147a.C35206d.a
        /* JADX INFO: renamed from: a */
        public final void mo77268a(C35205c c35205c) {
            if (c35205c != null) {
                LiteavLog.m76087i("TXVodDownloadManagerImpl", "downloadBegin " + c35205c.getPlayPath());
                c35205c.m77287d(1);
                C35204b.m77253a(C35204b.this, c35205c);
                ITXVodDownloadListener iTXVodDownloadListener = C35204b.this.f75391c;
                if (iTXVodDownloadListener != null) {
                    iTXVodDownloadListener.onDownloadStart(c35205c);
                }
            }
        }

        @Override // com.tencent.rtmp.downloader.p147a.C35206d.a
        /* JADX INFO: renamed from: b */
        public final void mo77270b(C35205c c35205c) {
            if (c35205c != null) {
                LiteavLog.m76087i("TXVodDownloadManagerImpl", "downloadEnd " + c35205c.getPlayPath());
                c35205c.m77287d(2);
                C35204b.m77253a(C35204b.this, c35205c);
                synchronized (C35204b.this.f75390b) {
                    C35204b.this.f75390b.remove(c35205c);
                }
                ITXVodDownloadListener iTXVodDownloadListener = C35204b.this.f75391c;
                if (iTXVodDownloadListener != null) {
                    iTXVodDownloadListener.onDownloadStop(c35205c);
                }
            }
        }

        @Override // com.tencent.rtmp.downloader.p147a.C35206d.a
        /* JADX INFO: renamed from: c */
        public final void mo77271c(C35205c c35205c) {
            if (c35205c != null) {
                LiteavLog.m76087i("TXVodDownloadManagerImpl", "downloadFinish " + c35205c.getPlayPath());
                c35205c.m77287d(4);
                C35204b.m77253a(C35204b.this, c35205c);
                synchronized (C35204b.this.f75390b) {
                    C35204b.this.f75390b.remove(c35205c);
                }
                ITXVodDownloadListener iTXVodDownloadListener = C35204b.this.f75391c;
                if (iTXVodDownloadListener != null) {
                    iTXVodDownloadListener.onDownloadFinish(c35205c);
                }
            }
        }

        @Override // com.tencent.rtmp.downloader.p147a.C35206d.a
        /* JADX INFO: renamed from: d */
        public final void mo77272d(C35205c c35205c) {
            ITXVodDownloadListener iTXVodDownloadListener;
            if (c35205c == null || (iTXVodDownloadListener = C35204b.this.f75391c) == null) {
                return;
            }
            iTXVodDownloadListener.onDownloadProgress(c35205c);
        }

        @Override // com.tencent.rtmp.downloader.p147a.C35206d.a
        /* JADX INFO: renamed from: a */
        public final void mo77269a(C35205c c35205c, int i11, String str) {
            if (c35205c != null) {
                LiteavLog.m76093w("TXVodDownloadManagerImpl", "downloadError " + c35205c.getPlayPath() + C33627eb.f69716f + i11 + " ： " + str);
                c35205c.m77287d(3);
                C35204b.m77253a(C35204b.this, c35205c);
                synchronized (C35204b.this.f75390b) {
                    C35204b.this.f75390b.remove(c35205c);
                }
                if (C35204b.this.f75391c != null) {
                    if (c35205c.getDownloadState() == 2) {
                        C35204b.this.f75391c.onDownloadStop(c35205c);
                        return;
                    }
                    if (i11 == 1008) {
                        C35204b.this.f75391c.onDownloadError(c35205c, TXVodDownloadManager.DOWNLOAD_HLS_KEY_ERROR, str);
                    } else if (i11 == 14020003) {
                        C35204b.this.f75391c.onDownloadError(c35205c, TXVodDownloadManager.DOWNLOAD_403FORBIDDEN, str);
                    } else {
                        C35204b.this.f75391c.onDownloadError(c35205c, TXVodDownloadManager.DOWNLOAD_DISCONNECT, str);
                    }
                }
            }
        }
    };

    /* JADX INFO: renamed from: e */
    private C34806c f75393e;

    /* JADX INFO: renamed from: b */
    private static Context m77255b() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
            if (method == null) {
                return null;
            }
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, new Object[0]);
            Method method2 = objInvoke.getClass().getMethod("getApplication", new Class[0]);
            if (method2 == null) {
                return null;
            }
            return ((Application) method2.invoke(objInvoke, new Object[0])).getApplicationContext();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private C35205c m77258d(TXVodDownloadMediaInfo tXVodDownloadMediaInfo) {
        C35205c c35205c = null;
        if (tXVodDownloadMediaInfo == null) {
            return null;
        }
        synchronized (this.f75390b) {
            try {
                for (C35205c c35205c2 : this.f75390b) {
                    if (c35205c2.getPlayPath().equals(tXVodDownloadMediaInfo.getPlayPath())) {
                        c35205c = c35205c2;
                        break;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c35205c;
    }

    /* JADX INFO: renamed from: a */
    public final C35205c m77263a(String str, long j11, String str2, int i11) {
        C35205c c35205c = new C35205c();
        c35205c.m77283b(str);
        c35205c.m77286c(str2);
        c35205c.m77289f(i11);
        c35205c.m77285c(j11);
        C35205c c35205cM77262a = m77262a((TXVodDownloadMediaInfo) c35205c);
        if (c35205cM77262a != null) {
            return c35205cM77262a;
        }
        m77265a(c35205c);
        return c35205c;
    }

    public C35204b() {
        Context contextM77255b = m77255b();
        C35206d c35206dM77291a = C35206d.m77291a(contextM77255b);
        this.f75389a = c35206dM77291a;
        if (c35206dM77291a != null) {
            c35206dM77291a.f75404b = this.f75392d;
        }
        this.f75390b = new ArrayList<>();
        if (contextM77255b != null) {
            ContextUtils.initApplicationContext(contextM77255b);
            ContextUtils.setDataDirectorySuffix("liteav");
            this.f75393e = new C34806c("vod_download");
        }
    }

    /* JADX INFO: renamed from: c */
    private String m77257c(TXVodDownloadMediaInfo tXVodDownloadMediaInfo) {
        TXVodDownloadDataSource dataSource = tXVodDownloadMediaInfo.getDataSource();
        if (dataSource == null) {
            if (TextUtils.isEmpty(tXVodDownloadMediaInfo.getUrl())) {
                return null;
            }
            String str = "_" + C34804a.m76215b(tXVodDownloadMediaInfo.getUrl());
            if (!TextUtils.isEmpty(this.f75393e.m76227b(str))) {
                return str;
            }
            String str2 = tXVodDownloadMediaInfo.getUserName() + str;
            if (TextUtils.isEmpty(this.f75393e.m76227b(str2)) && tXVodDownloadMediaInfo.getPreferredResolution() > 0) {
                return str2 + "_" + tXVodDownloadMediaInfo.getPreferredResolution();
            }
            return str2;
        }
        if (TextUtils.isEmpty(dataSource.getFileId())) {
            return null;
        }
        return dataSource.getUserName() + "_" + dataSource.getAppId() + "_" + dataSource.getFileId() + "_" + dataSource.getQuality();
    }

    /* JADX INFO: renamed from: a */
    public final C35205c m77262a(TXVodDownloadMediaInfo tXVodDownloadMediaInfo) {
        C35205c c35205cM77256b;
        String strM77257c = m77257c(tXVodDownloadMediaInfo);
        if (TextUtils.isEmpty(strM77257c)) {
            return null;
        }
        String strM76227b = this.f75393e.m76227b(strM77257c);
        if (TextUtils.isEmpty(strM76227b) || (c35205cM77256b = m77256b(strM76227b)) == null) {
            return null;
        }
        LiteavLog.m76087i("TXVodDownloadManagerImpl", "partly download, resume download");
        c35205cM77256b.m77289f(tXVodDownloadMediaInfo.getEncryptedLevel());
        m77265a(c35205cM77256b);
        return c35205cM77256b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m77267b(TXVodDownloadMediaInfo tXVodDownloadMediaInfo) {
        TXPlayerDrmBuilder drmBuilder;
        synchronized (this.f75390b) {
            try {
                for (C35205c c35205c : this.f75390b) {
                    if (!TextUtils.isEmpty(c35205c.getPlayPath()) && c35205c.getPlayPath().equals(tXVodDownloadMediaInfo.getPlayPath())) {
                        LiteavLog.m76083e("TXVodDownloadManagerImpl", "file is downloading, can not be delete");
                        return false;
                    }
                }
                C35206d c35206d = this.f75389a;
                String playPath = tXVodDownloadMediaInfo.getPlayPath();
                boolean zM77294a = c35206d.m77294a(playPath, tXVodDownloadMediaInfo.getPreferredResolution());
                if (zM77294a && (drmBuilder = tXVodDownloadMediaInfo.getDrmBuilder()) != null) {
                    String playUrl = drmBuilder.getPlayUrl();
                    String keyLicenseUrl = drmBuilder.getKeyLicenseUrl();
                    if (!TextUtils.isEmpty(playUrl) && !TextUtils.isEmpty(keyLicenseUrl)) {
                        String strSubstring = playPath.substring(0, playPath.indexOf("?"));
                        zM77294a = c35206d.f75406d.deleteOfflineLicenseKeySetId(strSubstring.substring(0, strSubstring.lastIndexOf("/")), playUrl, keyLicenseUrl) == 0;
                    }
                }
                if (zM77294a) {
                    String strM77257c = m77257c(tXVodDownloadMediaInfo);
                    C34806c c34806c = this.f75393e;
                    if (c34806c != null) {
                        c34806c.m76225a(strM77257c);
                        this.f75393e.m76225a(strM77257c + "_kv");
                        this.f75393e.m76224a();
                        TXVodDownloadDataSource dataSource = tXVodDownloadMediaInfo.getDataSource();
                        if (dataSource != null && !TextUtils.isEmpty(dataSource.getOverlayKey())) {
                            C34841a c34841aM76410a = C34841a.m76410a();
                            int appId = dataSource.getAppId();
                            String fileId = dataSource.getFileId();
                            if (!TextUtils.isEmpty(fileId)) {
                                c34841aM76410a.f74012a.m76225a(C34841a.m76414b(appId, fileId));
                                c34841aM76410a.f74012a.m76224a();
                            }
                        }
                        LiteavLog.m76087i("TXVodDownloadManagerImpl", "delete DownloadMediaInfo and file complete");
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C35205c m77261a(final TXVodDownloadDataSource tXVodDownloadDataSource) {
        final C35203a c35203a;
        final C35205c c35205c = new C35205c();
        if (TextUtils.isEmpty(tXVodDownloadDataSource.getTemplateName())) {
            c35203a = new C35203a(tXVodDownloadDataSource.getAuthBuilder(), tXVodDownloadDataSource.getQuality());
        } else {
            c35203a = new C35203a(tXVodDownloadDataSource.getAuthBuilder(), tXVodDownloadDataSource.getTemplateName());
        }
        c35205c.m77279a(c35203a);
        C35205c c35205cM77262a = m77262a((TXVodDownloadMediaInfo) c35205c);
        if (c35205cM77262a != null) {
            return c35205cM77262a;
        }
        if (tXVodDownloadDataSource.getAuthBuilder() == null) {
            return null;
        }
        TXPlayerAuthBuilder authBuilder = c35203a.getAuthBuilder();
        C34837d c34837d = new C34837d();
        c34837d.f73984e = authBuilder.isHttps();
        c34837d.m76393a(new InterfaceC34838e() { // from class: com.tencent.rtmp.downloader.a.b.1
            @Override // com.tencent.liteav.txcvodplayer.p133b.InterfaceC34838e
            /* JADX INFO: renamed from: a */
            public final void mo75986a(C34837d c34837d2) {
                String templateName;
                String str;
                List<Integer> list;
                String str2;
                if (c35205c.getDownloadState() == 2) {
                    synchronized (C35204b.this.f75390b) {
                        C35204b.this.f75390b.remove(c35205c);
                    }
                    ITXVodDownloadListener iTXVodDownloadListener = C35204b.this.f75391c;
                    if (iTXVodDownloadListener != null) {
                        iTXVodDownloadListener.onDownloadStop(c35205c);
                    }
                    LiteavLog.m76093w("TXVodDownloadManagerImpl", "Download task canceled");
                    return;
                }
                C34839f c34839fM76392a = c34837d2.m76392a();
                C34840g c34840gM76404f = null;
                if (tXVodDownloadDataSource.getQuality() != 1000) {
                    int quality = c35203a.getQuality();
                    if (quality != 0) {
                        String strM77249b = C35203a.m77249b(quality);
                        List<C34839f.a> listM76409k = c34839fM76392a.m76409k();
                        if (listM76409k == null) {
                            list = null;
                            break;
                        }
                        Iterator<C34839f.a> it = listM76409k.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                list = null;
                                break;
                            }
                            C34839f.a next = it.next();
                            if (next.f73999a.equals(strM77249b)) {
                                list = next.f74001c;
                                break;
                            }
                        }
                        if (list != null) {
                            for (C34840g c34840g : c34839fM76392a.m76403e()) {
                                if (list.contains(Integer.valueOf(c34840g.f74010i)) && ((str2 = c34840g.f74008g) == null || str2.contains("hls"))) {
                                    c34840gM76404f = c34840g;
                                    break;
                                }
                            }
                        }
                    } else {
                        c34840gM76404f = c34839fM76392a.m76404f();
                    }
                } else if (tXVodDownloadDataSource.getTemplateName() != null && (templateName = c35203a.getTemplateName()) != null) {
                    for (C34840g c34840g2 : c34839fM76392a.m76403e()) {
                        if (templateName.equals(c34840g2.f74009h) && ((str = c34840g2.f74008g) == null || str.contains("hls"))) {
                            c34840gM76404f = c34840g2;
                            break;
                        }
                    }
                }
                if (c34840gM76404f == null) {
                    synchronized (C35204b.this.f75390b) {
                        C35204b.this.f75390b.remove(c35205c);
                    }
                    ITXVodDownloadListener iTXVodDownloadListener2 = C35204b.this.f75391c;
                    if (iTXVodDownloadListener2 != null) {
                        iTXVodDownloadListener2.onDownloadError(c35205c, TXVodDownloadManager.DOWNLOAD_NO_FILE, "No such resolution");
                        return;
                    }
                    return;
                }
                String strM76213a = c34840gM76404f.f74002a;
                TXVodDownloadDataSource tXVodDownloadDataSource2 = tXVodDownloadDataSource;
                if (tXVodDownloadDataSource2 != null) {
                    strM76213a = C34804a.m76213a(strM76213a, tXVodDownloadDataSource2.getToken());
                }
                c35205c.m77283b(strM76213a);
                c35205c.m77276a(c34840gM76404f.f74005d);
                c35205c.m77275a(c34840gM76404f.f74006e * 1000);
                C35204b.this.m77265a(c35205c);
            }

            @Override // com.tencent.liteav.txcvodplayer.p133b.InterfaceC34838e
            /* JADX INFO: renamed from: a */
            public final void mo75987a(C34837d c34837d2, String str, int i11) {
                synchronized (C35204b.this.f75390b) {
                    C35204b.this.f75390b.remove(c35205c);
                }
                ITXVodDownloadListener iTXVodDownloadListener = C35204b.this.f75391c;
                if (iTXVodDownloadListener != null) {
                    iTXVodDownloadListener.onDownloadError(c35205c, TXVodDownloadManager.DOWNLOAD_AUTH_FAILED, str);
                }
            }
        });
        if (c34837d.m76391a(authBuilder.getAppId(), authBuilder.getFileId(), authBuilder.getTimeout(), authBuilder.getUs(), authBuilder.getExper(), authBuilder.getSign()) == 0) {
            c35205c.m77277a(c34837d);
            synchronized (this.f75390b) {
                this.f75390b.add(c35205c);
            }
            return c35205c;
        }
        LiteavLog.m76083e("TXVodDownloadManagerImpl", "unable to getPlayInfo");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m77265a(C35205c c35205c) {
        String url = c35205c.getUrl();
        if (TextUtils.isEmpty(url)) {
            return;
        }
        c35205c.m77280a(m77252a(this.f75389a.m77293a(url), c35205c));
        if (c35205c.getPlayPath() == null) {
            ITXVodDownloadListener iTXVodDownloadListener = this.f75391c;
            if (iTXVodDownloadListener != null) {
                iTXVodDownloadListener.onDownloadError(c35205c, TXVodDownloadManager.DOWNLOAD_PATH_ERROR, "Failed to create local path");
                return;
            }
            return;
        }
        LiteavLog.m76087i("TXVodDownloadManagerImpl", "download url " + url + " to " + c35205c.getPlayPath());
        synchronized (this.f75390b) {
            this.f75390b.add(c35205c);
        }
        c35205c.m77284c(this.f75389a.m77296c(c35205c));
        if (c35205c.getTaskId() < 0) {
            LiteavLog.m76083e("TXVodDownloadManagerImpl", "start download failed");
            ITXVodDownloadListener iTXVodDownloadListener2 = this.f75391c;
            if (iTXVodDownloadListener2 != null) {
                iTXVodDownloadListener2.onDownloadError(c35205c, TXVodDownloadManager.DOWNLOAD_FORMAT_ERROR, "Internal error");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private C35205c m77256b(String str) {
        C35203a c35203a;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        byte[] bArrDecode = Base64.decode(str, 2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
        C35205c c35205cCreateFromParcel = C35205c.CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        if (c35205cCreateFromParcel == null) {
            return null;
        }
        if (m77258d(c35205cCreateFromParcel) == null) {
            if (c35205cCreateFromParcel.getDownloadState() == 1) {
                c35205cCreateFromParcel.m77287d(2);
                c35205cCreateFromParcel.m77274a(this.f75389a.m77292a(c35205cCreateFromParcel));
            }
            if (!this.f75389a.m77295b(c35205cCreateFromParcel)) {
                c35205cCreateFromParcel.m77273a();
            }
        }
        if (!c35205cCreateFromParcel.getPlayPath().contains("&oversign=") && (c35203a = (C35203a) c35205cCreateFromParcel.getDataSource()) != null && !TextUtils.isEmpty(c35203a.getOverlayKey())) {
            c35205cCreateFromParcel.m77280a(m77252a(c35205cCreateFromParcel.getPlayPath(), c35205cCreateFromParcel));
        }
        return c35205cCreateFromParcel;
    }

    /* JADX INFO: renamed from: a */
    private static String m77252a(String str, C35205c c35205c) {
        TXVodDownloadDataSource dataSource = c35205c.getDataSource();
        StringBuilder sb2 = new StringBuilder();
        if (dataSource != null && !TextUtils.isEmpty(dataSource.getOverlayKey())) {
            sb2.append("&oversign=");
            sb2.append(dataSource.getAppId());
            sb2.append("&o1=");
            sb2.append(dataSource.getUserName());
            sb2.append("&o2=");
            sb2.append(dataSource.getFileId());
            sb2.append("&o3=");
            sb2.append(dataSource.getQuality());
            sb2.append("&o4=");
            sb2.append(dataSource.getOverlayKey());
            sb2.append("&o5=");
            sb2.append(dataSource.getOverlayIv());
        }
        if (c35205c.getPreferredResolution() > 0) {
            if (sb2.length() == 0) {
                sb2.append("&oversign=");
            }
            sb2.append("&o6=");
            sb2.append(c35205c.getPreferredResolution());
        }
        TXPlayerDrmBuilder drmBuilder = c35205c.getDrmBuilder();
        if (drmBuilder != null) {
            String keyLicenseUrl = drmBuilder.getKeyLicenseUrl();
            if (!TextUtils.isEmpty(keyLicenseUrl)) {
                if (sb2.length() == 0) {
                    sb2.append("&oversign=");
                }
                sb2.append("&o7=");
                sb2.append(keyLicenseUrl);
            }
        }
        if (sb2.length() <= 0) {
            return str;
        }
        sb2.append("&oversign=");
        return str.concat(sb2.toString());
    }

    /* JADX INFO: renamed from: a */
    public final boolean m77266a(String str) {
        LiteavLog.m76087i("TXVodDownloadManagerImpl", "delete file ".concat(String.valueOf(str)));
        synchronized (this.f75390b) {
            try {
                for (C35205c c35205c : this.f75390b) {
                    if (c35205c.getPlayPath() != null && c35205c.getPlayPath().equals(str)) {
                        LiteavLog.m76083e("TXVodDownloadManagerImpl", "file is downloading, can not be delete");
                        return false;
                    }
                }
                return this.f75389a.m77294a(str, -1L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final List<TXVodDownloadMediaInfo> m77264a() {
        C34806c c34806c = this.f75393e;
        if (c34806c != null) {
            try {
                String[] strArrM76228b = c34806c.m76228b();
                if (strArrM76228b == null) {
                    return new ArrayList(0);
                }
                ArrayList arrayList = new ArrayList(strArrM76228b.length);
                for (String str : strArrM76228b) {
                    C35205c c35205cM77256b = m77256b(this.f75393e.m76227b(str));
                    C35205c c35205cM77258d = m77258d(c35205cM77256b);
                    if (c35205cM77258d != null) {
                        arrayList.add(c35205cM77258d);
                    } else if (c35205cM77256b != null) {
                        arrayList.add(c35205cM77256b);
                    }
                }
                return arrayList;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return new ArrayList(0);
    }

    /* JADX INFO: renamed from: a */
    public final TXVodDownloadMediaInfo m77259a(int i11, String str, int i12, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f75390b) {
            try {
                for (C35205c c35205c : this.f75390b) {
                    TXVodDownloadDataSource dataSource = c35205c.getDataSource();
                    if (dataSource != null && dataSource.getAppId() == i11 && dataSource.getFileId().equals(str) && dataSource.getQuality() == i12) {
                        return c35205c;
                    }
                }
                if (this.f75393e == null) {
                    return null;
                }
                C35205c c35205c2 = new C35205c();
                c35205c2.m77279a(new C35203a(i11, str, i12, null, str2));
                return m77256b(this.f75393e.m76227b(m77257c(c35205c2)));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final TXVodDownloadMediaInfo m77260a(String str, long j11, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f75390b) {
            try {
                for (C35205c c35205c : this.f75390b) {
                    if (c35205c.getUrl() != null && c35205c.getUrl().equals(str)) {
                        return c35205c;
                    }
                }
                if (this.f75393e == null) {
                    return null;
                }
                C35205c c35205c2 = new C35205c();
                c35205c2.m77283b(str);
                c35205c2.m77286c(str2);
                if (j11 > 0) {
                    c35205c2.m77285c(j11);
                }
                return m77256b(this.f75393e.m76227b(m77257c(c35205c2)));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00da A[ADDED_TO_REGION, REMOVE] */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m77254a(C35204b c35204b, C35205c c35205c, C34836c c34836c) {
        TXPlayerDrmBuilder tXPlayerDrmBuilder;
        long jM76384h;
        List<C34836c.e> listM76387k;
        List<C34836c.e> listM76387k2;
        int iAbs;
        if (c34836c != null && c35205c.getDataSource() != null) {
            String strM76378b = c34836c.m76378b();
            String strM76375a = c34836c.m76375a("Widevine");
            C34836c.e eVar = null;
            if (!TextUtils.isEmpty(strM76375a)) {
                tXPlayerDrmBuilder = new TXPlayerDrmBuilder(c34836c.m76389m(), strM76375a);
            } else {
                strM76375a = C34804a.m76213a(strM76378b, c34836c.m76380d());
                tXPlayerDrmBuilder = null;
            }
            if (TextUtils.isEmpty(strM76375a)) {
                ITXVodDownloadListener iTXVodDownloadListener = c35204b.f75391c;
                if (iTXVodDownloadListener != null) {
                    iTXVodDownloadListener.onDownloadError(c35205c, TXVodDownloadManager.DOWNLOAD_AUTH_FAILED, "get substream infos failure");
                    return;
                }
                return;
            }
            c35205c.m77275a(c34836c.m76383g() * 1000);
            int iM77248a = C35203a.m77248a(c35205c.getDataSource().getQuality());
            long j11 = -1;
            if (iM77248a > 0 && (listM76387k2 = c34836c.m76387k()) != null && listM76387k2.size() > 0) {
                int i11 = 0;
                int i12 = Integer.MAX_VALUE;
                int i13 = 0;
                while (true) {
                    if (i11 >= listM76387k2.size()) {
                        i11 = i13;
                        break;
                    }
                    C34836c.e eVar2 = listM76387k2.get(i11);
                    int iMin = Math.min(eVar2.f73975b, eVar2.f73976c);
                    if (iM77248a >= iMin && (iAbs = Math.abs(iM77248a - iMin)) <= i12) {
                        if (iAbs == 0) {
                            break;
                        }
                        i13 = i11;
                        i12 = iAbs;
                    }
                    i11++;
                }
                C34836c.e eVar3 = listM76387k2.get(i11);
                j11 = eVar3.f73975b * eVar3.f73976c;
            }
            if (j11 > 0 && (listM76387k = c34836c.m76387k()) != null && listM76387k.size() != 0) {
                for (C34836c.e eVar4 : listM76387k) {
                    if (j11 == eVar4.f73976c * eVar4.f73975b) {
                        eVar = eVar4;
                        break;
                    }
                }
                if (eVar != null) {
                    jM76384h = eVar.f73978e;
                    if (jM76384h <= 0) {
                        jM76384h = c34836c.m76384h();
                    }
                } else {
                    jM76384h = c34836c.m76384h();
                }
            } else {
                jM76384h = c34836c.m76384h();
            }
            c35205c.m77276a(jM76384h);
            c35205c.m77283b(strM76375a);
            c35205c.m77285c(j11);
            if (tXPlayerDrmBuilder != null) {
                c35205c.m77278a(tXPlayerDrmBuilder);
            }
            c35204b.m77265a(c35205c);
            return;
        }
        ITXVodDownloadListener iTXVodDownloadListener2 = c35204b.f75391c;
        if (iTXVodDownloadListener2 != null) {
            iTXVodDownloadListener2.onDownloadError(c35205c, TXVodDownloadManager.DOWNLOAD_AUTH_FAILED, "get substream infos failure");
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m77253a(C35204b c35204b, C35205c c35205c) {
        String str;
        if (c35204b.f75393e != null) {
            if (c35205c == null) {
                str = "";
            } else {
                Parcel parcelObtain = Parcel.obtain();
                c35205c.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                String strEncodeToString = Base64.encodeToString(parcelObtain.marshall(), 2);
                parcelObtain.recycle();
                str = strEncodeToString;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String strM77257c = c35204b.m77257c(c35205c);
            if (TextUtils.isEmpty(strM77257c)) {
                return;
            }
            c35204b.f75393e.m76226a(strM77257c, str);
            c35204b.f75393e.m76224a();
            LiteavLog.m76087i("TXVodDownloadManagerImpl", "saveDownloadMediaInfo key: " + strM77257c + "| mediaInfo: " + str);
        }
    }
}
