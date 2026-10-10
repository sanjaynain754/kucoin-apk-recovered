package com.tencent.rtmp.downloader;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.sdk.common.HouseBuilder;
import com.tencent.liteav.txcplayer.common.C34810b;
import com.tencent.liteav.txcplayer.common.C34811c;
import com.tencent.liteav.txcplayer.p131a.C34804a;
import com.tencent.liteav.txcvodplayer.hlsencoder.TXCHLSEncoder;
import com.tencent.liteav.txcvodplayer.p133b.C34836c;
import com.tencent.liteav.txcvodplayer.p134c.C34841a;
import com.tencent.rtmp.TXPlayInfoParams;
import com.tencent.rtmp.TXPlayerDrmBuilder;
import com.tencent.rtmp.TXVodConstants;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDLProxyInitParam;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadParam;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes56.dex */
public class TXVodPreloadManager {
    private static final String TAG = "TXVodPreloadManager";
    private static final String THUMB_PLAYER_GUID = "liteav_tbplayer_android_";
    private static final int THUMB_PLAYER_PLATFORM_ID = 2330303;
    private static Context mAppContext;
    private boolean mInit;
    private ITPDownloadProxy mTpDownloadProxy;

    /* JADX INFO: renamed from: com.tencent.rtmp.downloader.TXVodPreloadManager$a */
    public static class C35201a {

        /* JADX INFO: renamed from: a */
        static TXVodPreloadManager f75384a = new TXVodPreloadManager();
    }

    /* JADX INFO: renamed from: com.tencent.rtmp.downloader.TXVodPreloadManager$b */
    public static class C35202b implements ITPPreLoadListener {

        /* JADX INFO: renamed from: a */
        int f75385a = -1;

        /* JADX INFO: renamed from: b */
        private final ITXVodPreloadListener f75386b;

        /* JADX INFO: renamed from: c */
        private final String f75387c;

        /* JADX INFO: renamed from: d */
        private ITPDownloadProxy f75388d;

        /* JADX INFO: renamed from: a */
        private void m77247a(int i11) {
            ITPDownloadProxy iTPDownloadProxy = this.f75388d;
            if (iTPDownloadProxy != null) {
                iTPDownloadProxy.stopPreload(i11);
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener
        public final void onPrepareDownloadProgressUpdate(int i11, int i12, long j11, long j12, String str) {
            LiteavLog.m76087i(TXVodPreloadManager.TAG, "preload: prepare process:" + i11 + "," + i12 + "," + j11 + "," + j12);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener
        public final void onPrepareError(int i11, int i12, String str) {
            LiteavLog.m76083e(TXVodPreloadManager.TAG, "preload error: moduleId: " + i11 + ", errorCode: " + i12 + ", extInfo: " + str);
            ITXVodPreloadListener iTXVodPreloadListener = this.f75386b;
            if (iTXVodPreloadListener != null) {
                iTXVodPreloadListener.onError(this.f75385a, this.f75387c, i12, str);
            }
            m77247a(this.f75385a);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener
        public final void onPrepareOK() {
            LiteavLog.m76079d(TXVodPreloadManager.TAG, "preload: onPrepareOK");
            ITXVodPreloadListener iTXVodPreloadListener = this.f75386b;
            if (iTXVodPreloadListener != null) {
                iTXVodPreloadListener.onComplete(this.f75385a, this.f75387c);
            }
            m77247a(this.f75385a);
        }

        public C35202b(ITPDownloadProxy iTPDownloadProxy, String str, ITXVodPreloadListener iTXVodPreloadListener) {
            this.f75387c = str;
            this.f75386b = iTXVodPreloadListener;
            this.f75388d = iTPDownloadProxy;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int checkDlType(int i11, String str) {
        if (i11 == 1) {
            return 3;
        }
        if (i11 == 2) {
            return 5;
        }
        if (i11 == 3) {
            return 10;
        }
        if (i11 != 4) {
            return (!TextUtils.isEmpty(str) && C34804a.m76217d(str).endsWith(".mp4")) ? 10 : 0;
        }
        return 19;
    }

    private synchronized Pair<Integer, String> checkInit() {
        ITPDownloadProxy tPDownloadProxy = TPDownloadProxyFactory.getTPDownloadProxy(THUMB_PLAYER_PLATFORM_ID);
        this.mTpDownloadProxy = tPDownloadProxy;
        if (tPDownloadProxy == null) {
            LiteavLog.m76083e(TAG, "Inner error(-3).");
            return new Pair<>(-3, "Inner error.");
        }
        int iM76235b = C34810b.m76235b();
        if (iM76235b < 0) {
            LiteavLog.m76083e(TAG, "MaxCacheSize not set(-1).");
            return new Pair<>(-1, "MaxCacheSize not set.");
        }
        String strM76231a = C34810b.m76231a();
        if (TextUtils.equals(strM76231a, "NO_SET")) {
            LiteavLog.m76083e(TAG, "CacheFolderPath not set(-2).");
            return new Pair<>(-2, "CacheFolderPath not set.");
        }
        if (!this.mInit) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("VodCacheReserveSizeMB", iM76235b);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            this.mTpDownloadProxy.init(mAppContext, new TPDLProxyInitParam(THUMB_PLAYER_PLATFORM_ID, "1.0.0", THUMB_PLAYER_GUID + mAppContext.getPackageName(), null, strM76231a, jSONObject.toString()));
            this.mInit = true;
        }
        this.mTpDownloadProxy.updateStoragePath(strM76231a);
        this.mTpDownloadProxy.setMaxStorageSizeMB(iM76235b);
        return new Pair<>(0, null);
    }

    public int startPreload(String str, float f11, long j11, ITXVodPreloadListener iTXVodPreloadListener) {
        LiteavLog.m76087i(TAG, "startPreload for url, url: " + str + " ,preloadSizeMB: " + f11 + " ,preferredResolution: " + j11 + " ,listener: " + iTXVodPreloadListener);
        return startPreload(str, f11, j11, iTXVodPreloadListener, 0, 0, null, "");
    }

    private TXVodPreloadManager() {
        this.mInit = false;
    }

    public static TXVodPreloadManager getInstance(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        mAppContext = applicationContext;
        ContextUtils.initApplicationContext(applicationContext);
        ContextUtils.setDataDirectorySuffix("liteav");
        return C35201a.f75384a;
    }

    public void stopPreload(int i11) {
        LiteavLog.m76087i(TAG, "stopPreload, taskID: ".concat(String.valueOf(i11)));
        if (((Integer) checkInit().first).intValue() < 0) {
            return;
        }
        this.mTpDownloadProxy.stopPreload(i11);
    }

    private int startPreload(String str, float f11, long j11, ITXVodPreloadListener iTXVodPreloadListener, int i11, int i12, Map<String, String> map, String str2) {
        Pair<Integer, String> pairCheckInit = checkInit();
        if (((Integer) pairCheckInit.first).intValue() < 0) {
            if (iTXVodPreloadListener != null) {
                iTXVodPreloadListener.onError(-1, str, ((Integer) pairCheckInit.first).intValue(), (String) pairCheckInit.second);
            }
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        HashMap map2 = new HashMap();
        if (map != null && map.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(map);
            map2.put(TPDownloadProxyEnum.DLPARAM_URL_HEADER, arrayList2);
        }
        map2.put(TPDownloadProxyEnum.DLPARAM_PRELOAD_SIZE, Long.valueOf((long) (f11 * 1024.0f * 1024.0f)));
        map2.put(TPDownloadProxyEnum.DLPARAM_PREFERRED_RESOLUTION, Long.valueOf(j11));
        if (i12 == 2 && C34811c.m76238a(HouseBuilder.EnumC34765a.PLAYER_PREMIUM)) {
            map2.put(TPDownloadProxyEnum.DLPARAM_CACHE_NEED_ENCRYPT, Boolean.TRUE);
        }
        if (!TextUtils.isEmpty(str2) && C34811c.m76238a(HouseBuilder.EnumC34765a.PLAYER_PREMIUM)) {
            map2.put(TPDownloadProxyEnum.DLPARAM_PREFERRED_AUDIO_TRACK, str2);
        }
        TPDownloadParam tPDownloadParam = new TPDownloadParam(arrayList, checkDlType(i11, str), map2);
        C35202b c35202b = new C35202b(this.mTpDownloadProxy, str, iTXVodPreloadListener);
        int iStartPreload = this.mTpDownloadProxy.startPreload(C34804a.m76217d(str), tPDownloadParam, c35202b);
        c35202b.f75385a = iStartPreload;
        LiteavLog.m76087i(TAG, "startPreload for url success, url: " + str + " ,taskID: " + iStartPreload);
        return iStartPreload;
    }

    public int startPreload(final TXPlayInfoParams tXPlayInfoParams, final float f11, final long j11, final ITXVodFilePreloadListener iTXVodFilePreloadListener) throws RuntimeException {
        LiteavLog.m76087i(TAG, "startPreload for TXPlayInfoParams, playInfoParams: " + tXPlayInfoParams + " ,preloadSizeMB: " + f11 + " ,preferredResolution: " + j11 + " ,listener: " + iTXVodFilePreloadListener);
        if (tXPlayInfoParams != null && !TextUtils.isEmpty(tXPlayInfoParams.getUrl()) && TextUtils.isEmpty(tXPlayInfoParams.getFileId())) {
            return startPreload(tXPlayInfoParams.getUrl(), f11, j11, iTXVodFilePreloadListener, checkDlType(tXPlayInfoParams.getMediaType(), tXPlayInfoParams.getUrl()), tXPlayInfoParams.getEncryptedMp4Level(), tXPlayInfoParams.getHeaders(), tXPlayInfoParams.getPreferAudioTrack());
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            Pair<Integer, String> pairCheckInit = checkInit();
            if (((Integer) pairCheckInit.first).intValue() < 0) {
                if (iTXVodFilePreloadListener != null) {
                    iTXVodFilePreloadListener.onError(-1, "", ((Integer) pairCheckInit.first).intValue(), (String) pairCheckInit.second);
                }
                return -1;
            }
            if (tXPlayInfoParams == null || tXPlayInfoParams.getAppId() == 0 || TextUtils.isEmpty(tXPlayInfoParams.getFileId())) {
                if (iTXVodFilePreloadListener != null) {
                    iTXVodFilePreloadListener.onError(-1, "", -1, " invalid params, appId or fileId is null");
                }
                return -1;
            }
            final AtomicInteger atomicInteger = new AtomicInteger(-1);
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            new C34836c(tXPlayInfoParams).m76376a(new C34836c.a() { // from class: com.tencent.rtmp.downloader.TXVodPreloadManager.1
                @Override // com.tencent.liteav.txcvodplayer.p133b.C34836c.a
                /* JADX INFO: renamed from: a */
                public final void mo75989a(C34836c c34836c, TXPlayInfoParams tXPlayInfoParams2) {
                    Pair pair;
                    Bundle bundle = new Bundle();
                    long j12 = j11;
                    String strM76378b = c34836c.m76378b();
                    String strM76388l = c34836c.m76388l();
                    if (TextUtils.isEmpty(strM76388l)) {
                        strM76388l = "plain";
                    }
                    if ("plain".equalsIgnoreCase(strM76388l)) {
                        pair = new Pair(strM76378b, C34804a.m76214a(strM76378b, tXPlayInfoParams2.getFileId(), strM76388l, tXPlayInfoParams2.getAppId()));
                    } else {
                        String strM76375a = c34836c.m76375a("Widevine");
                        boolean zIsEmpty = TextUtils.isEmpty(strM76375a);
                        if ("SimpleAES".equalsIgnoreCase(c34836c.m76388l()) || !zIsEmpty) {
                            if (!zIsEmpty) {
                                strM76378b = strM76375a;
                            }
                            C34836c.b bVar = c34836c.f73947d;
                            if (bVar == null || TextUtils.isEmpty(bVar.f73966a)) {
                                LiteavLog.m76083e("VodPreloadUtil", "overlayKey is null fileId=" + tXPlayInfoParams2.getFileId());
                                pair = new Pair(strM76378b, strM76378b);
                            } else {
                                String strM76425a = TXCHLSEncoder.m76425a(tXPlayInfoParams2.getAppId(), "default", tXPlayInfoParams2.getFileId(), 0);
                                String strM76427a = TXCHLSEncoder.m76427a(strM76425a, bVar.f73966a);
                                String strM76427a2 = TXCHLSEncoder.m76427a(strM76425a, bVar.f73967b);
                                if (TextUtils.isEmpty(strM76427a) || TextUtils.isEmpty(strM76427a2)) {
                                    LiteavLog.m76083e("VodPreloadUtil", "create local key exception for fileId=" + tXPlayInfoParams2.getFileId());
                                    pair = new Pair(strM76378b, strM76378b);
                                } else {
                                    C34841a.m76410a().m76416a(tXPlayInfoParams2.getAppId(), tXPlayInfoParams2.getFileId(), bVar);
                                    String strM76213a = C34804a.m76213a(strM76378b, c34836c.m76380d());
                                    String strM76214a = C34804a.m76214a(strM76213a, tXPlayInfoParams2.getFileId(), strM76388l, tXPlayInfoParams2.getAppId());
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(strM76214a);
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("&oversign=");
                                    sb3.append(tXPlayInfoParams2.getAppId());
                                    sb3.append("&o1=default&o2=");
                                    sb3.append(tXPlayInfoParams2.getFileId());
                                    sb3.append("&o3=&o4=");
                                    sb3.append(strM76427a);
                                    sb3.append("&o5=");
                                    sb3.append(strM76427a2);
                                    if (j12 > 0) {
                                        sb3.append("&o6=");
                                        sb3.append(j12);
                                    }
                                    String strM76389m = c34836c.m76389m();
                                    if (!TextUtils.isEmpty(strM76389m)) {
                                        sb3.append("&o7=");
                                        sb3.append(strM76389m);
                                    }
                                    if (sb3.length() > 0) {
                                        sb3.append("&oversign=");
                                    }
                                    sb2.append(sb3.toString());
                                    pair = new Pair(strM76213a, sb2.toString());
                                }
                            }
                        } else {
                            LiteavLog.m76083e("VodPreloadUtil", "invalid drmType=" + c34836c.m76388l() + " ,fileId=" + tXPlayInfoParams2.getFileId());
                            pair = new Pair(strM76378b, strM76378b);
                        }
                    }
                    bundle.putString("EVT_PLAY_URL", (String) pair.second);
                    bundle.putString("EVT_PLAY_COVER_URL", c34836c.m76379c());
                    bundle.putString("EVT_PLAY_NAME", c34836c.m76381e());
                    bundle.putString("EVT_PLAY_DESCRIPTION", c34836c.m76382f());
                    bundle.putInt("EVT_PLAY_DURATION", c34836c.m76383g());
                    bundle.putString(TXVodConstants.EVT_DRM_TYPE, TextUtils.isEmpty(c34836c.m76388l()) ? "plain" : c34836c.m76388l());
                    C34836c.c cVarM76385i = c34836c.m76385i();
                    if (cVarM76385i != null) {
                        bundle.putString(TXVodConstants.EVT_IMAGESPRIT_WEBVTTURL, cVarM76385i.f73971b);
                        bundle.putStringArrayList(TXVodConstants.EVT_IMAGESPRIT_IMAGEURL_LIST, cVarM76385i.f73970a);
                    }
                    List<C34836c.d> listM76386j = c34836c.m76386j();
                    if (listM76386j != null && !listM76386j.isEmpty()) {
                        ArrayList<String> arrayList = new ArrayList<>();
                        float[] fArr = new float[listM76386j.size()];
                        for (int i11 = 0; i11 < listM76386j.size(); i11++) {
                            arrayList.add(listM76386j.get(i11).f73972a);
                            fArr[i11] = listM76386j.get(i11).f73973b;
                        }
                        bundle.putStringArrayList(TXVodConstants.EVT_KEY_FRAME_CONTENT_LIST, arrayList);
                        bundle.putFloatArray(TXVodConstants.EVT_KEY_FRAME_TIME_LIST, fArr);
                    }
                    bundle.putString(TXVodConstants.EVT_DRM_TYPE, c34836c.m76388l());
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(pair.first);
                    HashMap map = new HashMap();
                    if (tXPlayInfoParams.getHeaders() != null && tXPlayInfoParams.getHeaders().size() > 0) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(tXPlayInfoParams.getHeaders());
                        map.put(TPDownloadProxyEnum.DLPARAM_URL_HEADER, arrayList3);
                    }
                    map.put(TPDownloadProxyEnum.DLPARAM_PRELOAD_SIZE, Float.valueOf(f11 * 1024.0f * 1024.0f));
                    map.put(TPDownloadProxyEnum.DLPARAM_PREFERRED_RESOLUTION, Long.valueOf(j11));
                    if (tXPlayInfoParams.getEncryptedMp4Level() == 2 && C34811c.m76238a(HouseBuilder.EnumC34765a.PLAYER_PREMIUM)) {
                        map.put(TPDownloadProxyEnum.DLPARAM_CACHE_NEED_ENCRYPT, Boolean.TRUE);
                    }
                    if (!TextUtils.isEmpty(c34836c.m76389m())) {
                        map.put(TPDownloadProxyEnum.DLPARAM_KEY_LICENSE_URL, c34836c.m76389m());
                        map.put(TPDownloadProxyEnum.DLPARAM_DEVICE_CERTIFICATE_URL, new TXPlayerDrmBuilder().getDeviceCertificateUrl());
                    }
                    if (!TextUtils.isEmpty(tXPlayInfoParams.getPreferAudioTrack()) && C34811c.m76238a(HouseBuilder.EnumC34765a.PLAYER_PREMIUM)) {
                        map.put(TPDownloadProxyEnum.DLPARAM_PREFERRED_AUDIO_TRACK, tXPlayInfoParams.getPreferAudioTrack());
                    }
                    TPDownloadParam tPDownloadParam = new TPDownloadParam(arrayList2, TXVodPreloadManager.this.checkDlType(tXPlayInfoParams.getMediaType(), (String) pair.first), map);
                    C35202b c35202b = new C35202b(TXVodPreloadManager.this.mTpDownloadProxy, (String) pair.second, iTXVodFilePreloadListener);
                    int iStartPreload = TXVodPreloadManager.this.mTpDownloadProxy.startPreload(C34804a.m76217d((String) pair.first), tPDownloadParam, c35202b);
                    c35202b.f75385a = iStartPreload;
                    atomicInteger.set(iStartPreload);
                    countDownLatch.countDown();
                    if (iTXVodFilePreloadListener != null) {
                        LiteavLog.m76087i(TXVodPreloadManager.TAG, "startPreload for TXPlayInfoParams success, playInfoParams: " + tXPlayInfoParams + " ,taskID: " + iStartPreload);
                        iTXVodFilePreloadListener.onStart(iStartPreload, tXPlayInfoParams2.getFileId(), (String) pair.second, bundle);
                    }
                }

                @Override // com.tencent.liteav.txcvodplayer.p133b.C34836c.a
                /* JADX INFO: renamed from: a */
                public final void mo75988a(int i11, String str) {
                    countDownLatch.countDown();
                    if (iTXVodFilePreloadListener != null) {
                        LiteavLog.m76087i(TXVodPreloadManager.TAG, "startPreload for TXPlayInfoParams failed, playInfoParams: " + tXPlayInfoParams + " ,getPlayInfo failed: " + str);
                        iTXVodFilePreloadListener.onError(-1, "", i11, "getPlayInfo failed: ".concat(String.valueOf(str)));
                    }
                }
            });
            try {
                countDownLatch.await(8L, TimeUnit.SECONDS);
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
            return atomicInteger.get();
        }
        LiteavLog.m76083e(TAG, "startPreload for TXPlayInfoParams can not be called on the main thread.");
        throw new RuntimeException("startPreload for TXPlayInfoParams can not be called on the main thread.");
    }
}
