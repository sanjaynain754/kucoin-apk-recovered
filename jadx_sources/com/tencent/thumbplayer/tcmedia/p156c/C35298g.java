package com.tencent.thumbplayer.tcmedia.p156c;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.thumbplayer.tcmedia.api.proxy.ITPPreloadProxy;
import com.tencent.thumbplayer.tcmedia.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.tcmedia.config.TPPlayerConfig;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.g */
/* JADX INFO: loaded from: classes62.dex */
public class C35298g implements ITPPreloadProxy {

    /* JADX INFO: renamed from: a */
    private Context f75940a;

    /* JADX INFO: renamed from: b */
    private int f75941b;

    /* JADX INFO: renamed from: c */
    private ITPDownloadProxy f75942c;

    /* JADX INFO: renamed from: f */
    private boolean f75945f = false;

    /* JADX INFO: renamed from: d */
    private a f75943d = new a();

    /* JADX INFO: renamed from: e */
    private ITPPreloadProxy.IPreloadListener f75944e = new C35297f("TPPreloadProxyImpl");

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.g$a */
    public class a implements ITPDLProxyLogListener, ITPPreLoadListener {
        private a() {
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener
        /* JADX INFO: renamed from: d */
        public int mo78015d(String str, int i11, String str2, String str3) {
            TPLogUtil.m78796d(str2, "[" + str + C33844oi.f71346o + i11 + "] " + str3);
            return 0;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener
        /* JADX INFO: renamed from: e */
        public int mo78016e(String str, int i11, String str2, String str3) {
            TPLogUtil.m78797e(str2, "[" + str + C33844oi.f71346o + i11 + "] " + str3);
            return 0;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener
        /* JADX INFO: renamed from: i */
        public int mo78017i(String str, int i11, String str2, String str3) {
            TPLogUtil.m78800i(str2, "[" + str + C33844oi.f71346o + i11 + "] " + str3);
            return 0;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener
        public void onPrepareDownloadProgressUpdate(int i11, int i12, long j11, long j12, String str) {
            C35298g.this.f75944e.onPrepareDownloadProgressUpdate(i11, i12, j11, j12);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener
        public void onPrepareError(int i11, int i12, String str) {
            C35298g.this.f75944e.onPrepareError();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener
        public void onPrepareOK() {
            C35298g.this.f75944e.onPrepareSuccess();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener
        /* JADX INFO: renamed from: w */
        public int mo78018w(String str, int i11, String str2, String str3) {
            TPLogUtil.m78802w(str2, "[" + str + C33844oi.f71346o + i11 + "] " + str3);
            return 0;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPreloadProxy
    public String getPlayErrorCodeStr(int i11) {
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPreloadProxy
    public int startPreload(String str, TPDownloadParamData tPDownloadParamData) {
        return startPreload(str, tPDownloadParamData, null);
    }

    /* JADX INFO: renamed from: a */
    private void m78014a() {
        int i11 = 3;
        while (i11 > 0 && !this.f75945f) {
            try {
                InterfaceC35293b interfaceC35293bM78027a = C35300i.m78021a().m78027a(this.f75941b);
                if (interfaceC35293bM78027a != null && interfaceC35293bM78027a.mo77963a() != null) {
                    ITPDownloadProxy iTPDownloadProxyMo77963a = interfaceC35293bM78027a.mo77963a();
                    this.f75942c = iTPDownloadProxyMo77963a;
                    iTPDownloadProxyMo77963a.setLogListener(this.f75943d);
                    this.f75942c.setUserData("qq_is_vip", Boolean.valueOf(TPPlayerConfig.isUserIsVip()));
                    if (!TextUtils.isEmpty(TPPlayerConfig.getUserUin())) {
                        this.f75942c.setUserData(TPDownloadProxyEnum.USER_UIN, TPPlayerConfig.getUserUin());
                    }
                    if (!TextUtils.isEmpty(TPPlayerConfig.getAppVersionName(this.f75940a))) {
                        this.f75942c.setUserData(TPDownloadProxyEnum.USER_APP_VERSION, TPPlayerConfig.getAppVersionName(this.f75940a));
                    }
                    if (TPPlayerConfig.getBuildNumber(this.f75940a) != -1) {
                        this.f75942c.setUserData(TPDownloadProxyEnum.USER_APP_VERSION_CODE, String.valueOf(TPPlayerConfig.getBuildNumber(this.f75940a)));
                    }
                    this.f75942c.setUserData(TPDownloadProxyEnum.USER_UPC, TPPlayerConfig.getUserUpc());
                    this.f75942c.setUserData(TPDownloadProxyEnum.USER_UPC_STATE, Integer.valueOf(TPPlayerConfig.getUserUpcState()));
                    this.f75942c.setUserData(TPDownloadProxyEnum.USER_EXTERNAL_NETWORK_IP, TPPlayerConfig.getOutNetIp());
                    this.f75945f = true;
                    return;
                }
                i11--;
                TPLogUtil.m78797e("TPPreloadProxyImpl", "p2p so load failed");
            } catch (Exception e11) {
                i11--;
                TPLogUtil.m78798e("TPPreloadProxyImpl", e11);
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPreloadProxy
    public boolean isAvailable() {
        return this.f75942c != null && this.f75945f;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPreloadProxy
    public void setPreloadListener(ITPPreloadProxy.IPreloadListener iPreloadListener) {
        if (iPreloadListener == null) {
            this.f75944e = new C35297f("TPPreloadProxyImpl");
        } else {
            this.f75944e = iPreloadListener;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPreloadProxy
    public int startClipPreload(String str, ArrayList<TPDownloadParamData> arrayList) {
        TPLogUtil.m78800i("TPPreloadProxyImpl", "[startClipPreload] Preloading clips.");
        if (arrayList == null) {
            TPLogUtil.m78797e("TPPreloadProxyImpl", "[startClipPreload] Fail to start clip preload: null download parameter list.");
            return -1;
        }
        if (!isAvailable()) {
            m78014a();
            if (!isAvailable()) {
                TPLogUtil.m78797e("TPPreloadProxyImpl", "[startClipPreload] Fail to initialize proxy.");
                return -1;
            }
        }
        int iStartClipPreload = this.f75942c.startClipPreload(str, arrayList.size(), this.f75943d);
        if (iStartClipPreload <= 0) {
            TPLogUtil.m78797e("TPPreloadProxyImpl", "[startClipPreload] Fail to start clip preload: invalid preload ID.");
            stopPreload(iStartClipPreload);
            return -1;
        }
        int i11 = 1;
        for (TPDownloadParamData tPDownloadParamData : arrayList) {
            if (!this.f75942c.setClipInfo(iStartClipPreload, i11, tPDownloadParamData.getDownloadFileID(), C35302k.m78032a(tPDownloadParamData.getUrl(), tPDownloadParamData, null, null))) {
                TPLogUtil.m78797e("TPPreloadProxyImpl", "[startClipPreload] Fail to set clip info.");
                stopPreload(iStartClipPreload);
                return -1;
            }
            i11++;
        }
        try {
            this.f75942c.startTask(iStartClipPreload);
            return iStartClipPreload;
        } catch (Throwable th2) {
            TPLogUtil.m78797e("TPPreloadProxyImpl", "[startClipPreload] Fail to start task: " + th2.toString());
            stopPreload(iStartClipPreload);
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPreloadProxy
    public int startPreload(String str, TPDownloadParamData tPDownloadParamData, Map<String, String> map) {
        if (!isAvailable()) {
            m78014a();
            if (!isAvailable()) {
                return -1;
            }
        }
        if (tPDownloadParamData != null) {
            try {
                return this.f75942c.startPreload(str, C35302k.m78032a(null, tPDownloadParamData, map, null), this.f75943d);
            } catch (Throwable th2) {
                TPLogUtil.m78798e("TPPreloadProxyImpl", th2);
            }
        }
        return -1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPreloadProxy
    public void stopPreload(int i11) {
        ITPDownloadProxy iTPDownloadProxy = this.f75942c;
        if (iTPDownloadProxy == null) {
            return;
        }
        try {
            iTPDownloadProxy.stopPreload(i11);
        } catch (Throwable th2) {
            TPLogUtil.m78798e("TPPreloadProxyImpl", th2);
        }
    }

    public C35298g(Context context, int i11) {
        this.f75940a = context;
        this.f75941b = i11;
        m78014a();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPreloadProxy
    public void pushEvent(int i11) {
        if (!isAvailable()) {
            return;
        }
        try {
            this.f75942c.pushEvent(i11);
        } catch (Throwable th2) {
            TPLogUtil.m78798e("TPPreloadProxyImpl", th2);
        }
    }
}
