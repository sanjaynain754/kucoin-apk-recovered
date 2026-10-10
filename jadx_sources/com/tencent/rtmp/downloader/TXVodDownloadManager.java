package com.tencent.rtmp.downloader;

import android.text.TextUtils;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.txcplayer.common.C34810b;
import com.tencent.liteav.txcvodplayer.hlsencoder.TXCHLSEncoder;
import com.tencent.liteav.txcvodplayer.p133b.C34836c;
import com.tencent.liteav.txcvodplayer.p134c.C34841a;
import com.tencent.rtmp.TXPlayInfoParams;
import com.tencent.rtmp.TXPlayerDrmBuilder;
import com.tencent.rtmp.downloader.ITXVodDownloadListener;
import com.tencent.rtmp.downloader.TXVodDownloadManager;
import com.tencent.rtmp.downloader.p147a.C35203a;
import com.tencent.rtmp.downloader.p147a.C35204b;
import com.tencent.rtmp.downloader.p147a.C35205c;
import com.tencent.rtmp.downloader.p147a.C35206d;
import java.io.File;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public class TXVodDownloadManager {
    public static final int DOWNLOAD_403FORBIDDEN = -5008;
    public static final int DOWNLOAD_AUTH_FAILED = -5001;
    public static final int DOWNLOAD_DISCONNECT = -5005;
    public static final int DOWNLOAD_FORMAT_ERROR = -5004;
    public static final int DOWNLOAD_HLS_KEY_ERROR = -5006;
    public static final int DOWNLOAD_NO_FILE = -5003;
    public static final int DOWNLOAD_PATH_ERROR = -5007;
    public static final int DOWNLOAD_SUCCESS = 0;
    private static final String TAG = "TXVodDownloadManager";
    private static TXVodDownloadManager sInstance;
    private final C35204b mManagerImpl = new C35204b();

    @Deprecated
    public TXVodDownloadMediaInfo getDownloadMediaInfo(int i11, String str, int i12) {
        return this.mManagerImpl.m77259a(i11, str, i12, "");
    }

    @Deprecated
    public TXVodDownloadMediaInfo startDownloadUrl(String str) {
        return startDownloadUrl(str, -1L, "default");
    }

    public static TXVodDownloadManager getInstance() {
        synchronized (TXVodDownloadManager.class) {
            try {
                if (sInstance == null) {
                    sInstance = new TXVodDownloadManager();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sInstance;
    }

    @Deprecated
    public boolean deleteDownloadFile(String str) {
        return this.mManagerImpl.m77266a(str);
    }

    public boolean deleteDownloadMediaInfo(TXVodDownloadMediaInfo tXVodDownloadMediaInfo) {
        return this.mManagerImpl.m77267b(tXVodDownloadMediaInfo);
    }

    public TXVodDownloadMediaInfo getDownloadMediaInfo(int i11, String str, int i12, String str2) {
        return this.mManagerImpl.m77259a(i11, str, i12, str2);
    }

    public List<TXVodDownloadMediaInfo> getDownloadMediaInfoList() {
        return this.mManagerImpl.m77264a();
    }

    @Deprecated
    public void setDownloadPath(String str) {
        C35206d c35206d = this.mManagerImpl.f75389a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strM76231a = C34810b.m76231a();
        c35206d.f75403a = strM76231a;
        if (TextUtils.isEmpty(strM76231a)) {
            String str2 = str + "/txcache";
            c35206d.f75403a = str2;
            C34810b.m76233a(str2);
        }
        try {
            new File(c35206d.f75403a).mkdirs();
        } catch (Exception e11) {
            LiteavLog.m76083e("ThumbPlayerDownloader", "setDownloadPath exception: " + e11.getLocalizedMessage());
        }
    }

    public void setHeaders(Map<String, String> map) {
        this.mManagerImpl.f75389a.f75405c = map;
    }

    public void setListener(ITXVodDownloadListener iTXVodDownloadListener) {
        this.mManagerImpl.f75391c = iTXVodDownloadListener;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public TXVodDownloadMediaInfo startDownload(TXVodDownloadDataSource tXVodDownloadDataSource) {
        C35204b c35204b = this.mManagerImpl;
        if (tXVodDownloadDataSource != null && !TextUtils.isEmpty(tXVodDownloadDataSource.getUrl())) {
            return c35204b.m77263a(tXVodDownloadDataSource.getUrl(), tXVodDownloadDataSource.getQuality(), tXVodDownloadDataSource.getUserName(), tXVodDownloadDataSource.getEncryptedLevel());
        }
        if (tXVodDownloadDataSource.getAuthBuilder() != null) {
            LiteavLog.m76093w("TXVodDownloadManagerImpl", "startDownloadV2");
            return c35204b.m77261a(tXVodDownloadDataSource);
        }
        LiteavLog.m76093w("TXVodDownloadManagerImpl", "startDownloadV4");
        C35203a c35203a = new C35203a(tXVodDownloadDataSource.getAppId(), tXVodDownloadDataSource.getFileId(), tXVodDownloadDataSource.getQuality(), tXVodDownloadDataSource.getPSign(), tXVodDownloadDataSource.getUserName());
        C35205c c35205c = new C35205c();
        c35205c.m77279a(c35203a);
        C35205c c35205cM77262a = c35204b.m77262a((TXVodDownloadMediaInfo) c35205c);
        if (c35205cM77262a != null) {
            return c35205cM77262a;
        }
        new C34836c(new TXPlayInfoParams(c35203a.getAppId(), c35203a.getFileId(), c35203a.getPSign())).m76376a(new C34836c.a() { // from class: com.tencent.rtmp.downloader.a.b.2

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C35205c f75398a;

            @Override // com.tencent.liteav.txcvodplayer.p133b.C34836c.a
            /* JADX INFO: renamed from: a */
            public final void mo75989a(C34836c c34836c, TXPlayInfoParams tXPlayInfoParams) {
                C34836c.b bVar;
                LiteavLog.m76087i("TXVodDownloadManagerImpl", "onSuccess: protocol params = " + tXPlayInfoParams.toString());
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
                if ("SimpleAES".equalsIgnoreCase(c34836c.m76388l()) && (bVar = c34836c.f73947d) != null && !TextUtils.isEmpty(bVar.f73966a)) {
                    C35203a c35203a2 = (C35203a) c35205c.getDataSource();
                    String strM76425a = TXCHLSEncoder.m76425a(c35203a2.getAppId(), c35203a2.getUserName(), c35203a2.getFileId(), c35203a2.getQuality());
                    String strM76427a = TXCHLSEncoder.m76427a(strM76425a, bVar.f73966a);
                    String strM76427a2 = TXCHLSEncoder.m76427a(strM76425a, bVar.f73967b);
                    if (TextUtils.isEmpty(strM76427a) || TextUtils.isEmpty(strM76427a2)) {
                        LiteavLog.m76083e("TXVodDownloadManagerImpl", "create local key exception!");
                        return;
                    } else {
                        c35203a2.m77250a(strM76427a);
                        c35203a2.m77251b(strM76427a2);
                        C34841a.m76410a().m76416a(tXPlayInfoParams.getAppId(), tXPlayInfoParams.getFileId(), bVar);
                    }
                }
                C35204b.m77254a(C35204b.this, c35205c, c34836c);
            }

            public AnonymousClass2() {
                c35205c = c35205c;
            }

            @Override // com.tencent.liteav.txcvodplayer.p133b.C34836c.a
            /* JADX INFO: renamed from: a */
            public final void mo75988a(int i11, String str) {
                LiteavLog.m76093w("TXVodDownloadManagerImpl", "onFail: errorCode = " + i11 + " message = " + str);
                synchronized (C35204b.this.f75390b) {
                    C35204b.this.f75390b.remove(c35205c);
                }
                ITXVodDownloadListener iTXVodDownloadListener = C35204b.this.f75391c;
                if (iTXVodDownloadListener != null) {
                    iTXVodDownloadListener.onDownloadError(c35205c, i11 == -1 ? TXVodDownloadManager.DOWNLOAD_DISCONNECT : TXVodDownloadManager.DOWNLOAD_AUTH_FAILED, str);
                }
            }
        });
        return c35205c;
    }

    public TXVodDownloadMediaInfo startDownloadDrm(TXPlayerDrmBuilder tXPlayerDrmBuilder, long j11, String str) {
        C35204b c35204b = this.mManagerImpl;
        C35205c c35205c = new C35205c();
        c35205c.m77283b(tXPlayerDrmBuilder.getPlayUrl());
        c35205c.m77286c(str);
        c35205c.m77285c(j11);
        c35205c.m77278a(tXPlayerDrmBuilder);
        C35205c c35205cM77262a = c35204b.m77262a((TXVodDownloadMediaInfo) c35205c);
        if (c35205cM77262a != null) {
            return c35205cM77262a;
        }
        c35204b.m77265a(c35205c);
        return c35205c;
    }

    @Deprecated
    public TXVodDownloadMediaInfo startDownloadUrl(String str, String str2) {
        return startDownloadUrl(str, -1L, str2);
    }

    public void stopDownload(TXVodDownloadMediaInfo tXVodDownloadMediaInfo) {
        C35206d.a aVar;
        C35204b c35204b = this.mManagerImpl;
        if (tXVodDownloadMediaInfo != null) {
            if (tXVodDownloadMediaInfo.getTaskId() < 0) {
                LiteavLog.m76093w("TXVodDownloadManagerImpl", "stop download not start task");
                return;
            }
            synchronized (c35204b.f75390b) {
                try {
                    for (C35205c c35205c : c35204b.f75390b) {
                        if (c35205c.getTaskId() == tXVodDownloadMediaInfo.getTaskId()) {
                            C35206d c35206d = c35204b.f75389a;
                            if (c35206d.f75406d.pauseDownload(c35205c.getTaskId()) == 0 && (aVar = c35206d.f75404b) != null) {
                                aVar.mo77270b(c35205c);
                            }
                            LiteavLog.m76087i("TXVodDownloadManagerImpl", "stop download " + tXVodDownloadMediaInfo.getUrl());
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private TXVodDownloadManager() {
    }

    @Deprecated
    public TXVodDownloadMediaInfo getDownloadMediaInfo(String str) {
        return getDownloadMediaInfo(str, -1L, "");
    }

    public TXVodDownloadMediaInfo startDownloadUrl(String str, long j11, String str2) {
        return this.mManagerImpl.m77263a(str, j11, str2, 0);
    }

    public TXVodDownloadMediaInfo getDownloadMediaInfo(String str, long j11, String str2) {
        return this.mManagerImpl.m77260a(str, j11, str2);
    }
}
