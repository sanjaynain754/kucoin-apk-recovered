package com.tencent.thumbplayer.tcmedia.p156c;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.core.view.InputDeviceCompat;
import androidx.fragment.app.FragmentTransaction;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.C35243e;
import com.tencent.thumbplayer.tcmedia.api.TPOptionalParam;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMsg;
import com.tencent.thumbplayer.tcmedia.api.TPVideoInfo;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip;
import com.tencent.thumbplayer.tcmedia.api.proxy.ITPPlayerProxyListener;
import com.tencent.thumbplayer.tcmedia.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.tcmedia.config.TPPlayerConfig;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDLProxyMsg;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadParam;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.p155b.C35280e;
import com.tencent.thumbplayer.tcmedia.p155b.C35283h;
import com.tencent.thumbplayer.tcmedia.p155b.C35285j;
import com.tencent.thumbplayer.tcmedia.p155b.C35287l;
import com.tencent.thumbplayer.tcmedia.utils.C35422b;
import com.tencent.thumbplayer.tcmedia.utils.C35425e;
import com.tencent.thumbplayer.tcmedia.utils.C35426f;
import com.tencent.thumbplayer.tcmedia.utils.C35429i;
import com.tencent.thumbplayer.tcmedia.utils.C35433m;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.e */
/* JADX INFO: loaded from: classes62.dex */
public class C35296e implements InterfaceC35288a, C35426f.a, C35429i.b {

    /* JADX INFO: renamed from: g */
    private static int f75900g = -1;

    /* JADX INFO: renamed from: a */
    private Context f75901a;

    /* JADX INFO: renamed from: b */
    private a f75902b;

    /* JADX INFO: renamed from: c */
    private ITPDownloadProxy f75903c;

    /* JADX INFO: renamed from: e */
    private b f75905e;

    /* JADX INFO: renamed from: f */
    private ITPPlayListener f75906f;

    /* JADX INFO: renamed from: i */
    private ArrayList<TPDownloadParamData> f75908i;

    /* JADX INFO: renamed from: j */
    private String f75909j;

    /* JADX INFO: renamed from: k */
    private int f75910k;

    /* JADX INFO: renamed from: l */
    private TPVideoInfo f75911l;

    /* JADX INFO: renamed from: m */
    private String f75912m;

    /* JADX INFO: renamed from: o */
    private LinkedList<c> f75914o;

    /* JADX INFO: renamed from: p */
    private HashMap<String, Integer> f75915p;

    /* JADX INFO: renamed from: q */
    private long f75916q;

    /* JADX INFO: renamed from: r */
    private long f75917r;

    /* JADX INFO: renamed from: z */
    private C35433m f75925z;

    /* JADX INFO: renamed from: d */
    private int f75904d = 0;

    /* JADX INFO: renamed from: h */
    private int f75907h = f75900g;

    /* JADX INFO: renamed from: n */
    private ITPPlayerProxyListener f75913n = null;

    /* JADX INFO: renamed from: s */
    private boolean f75918s = false;

    /* JADX INFO: renamed from: t */
    private boolean f75919t = true;

    /* JADX INFO: renamed from: u */
    private boolean f75920u = false;

    /* JADX INFO: renamed from: v */
    private boolean f75921v = false;

    /* JADX INFO: renamed from: w */
    private boolean f75922w = false;

    /* JADX INFO: renamed from: x */
    private long f75923x = 100000000;

    /* JADX INFO: renamed from: y */
    private boolean f75924y = false;

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.e$a */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (C35296e.this.f75906f == null) {
                TPLogUtil.m78797e("TPThumbPlayer[TPPlayManagerImpl.java]", "handleMessage failed, mPlayListener is null and return");
            }
            int i11 = message.what;
            if (i11 == 4196) {
                C35296e.this.m77999g(message.arg1);
                return;
            }
            if (i11 == 4197) {
                C35296e.this.m78000h(message.arg1);
                return;
            }
            switch (i11) {
                case FragmentTransaction.TRANSIT_FRAGMENT_OPEN /* 4097 */:
                    C35296e.this.f75906f.onDownloadFinish();
                    break;
                case InputDeviceCompat.SOURCE_TOUCHSCREEN /* 4098 */:
                    C35296e.this.f75906f.onDownloadError(message.arg1, message.arg2, (String) message.obj);
                    break;
                case FragmentTransaction.TRANSIT_FRAGMENT_FADE /* 4099 */:
                    C35296e.this.f75906f.onDownloadCdnUrlUpdate((String) message.obj);
                    break;
                case FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_OPEN /* 4100 */:
                    TPPlayerMsg.TPCDNURLInfo tPCDNURLInfo = (TPPlayerMsg.TPCDNURLInfo) message.obj;
                    C35296e.this.f75906f.onDownloadCdnUrlInfoUpdate(tPCDNURLInfo.url, tPCDNURLInfo.cdnIp, tPCDNURLInfo.uIp, tPCDNURLInfo.errorStr);
                    break;
                case JAnalysisConstants.MainWhat.SET_STATIC_PROPERTY /* 4101 */:
                    C35296e.this.f75906f.onDownloadStatusUpdate(message.arg1);
                    break;
                case JAnalysisConstants.MainWhat.CLEAR_STATIC_PROPERTY /* 4102 */:
                    TPPlayerMsg.TPProtocolInfo tPProtocolInfo = (TPPlayerMsg.TPProtocolInfo) message.obj;
                    C35296e.this.f75906f.onDownloadProtocolUpdate(tPProtocolInfo.protocolName, tPProtocolInfo.protocolVersion);
                    break;
                case JAnalysisConstants.MainWhat.SET_DYNAMIC_PROPERTY /* 4103 */:
                    C35296e.this.f75906f.onDownloadCdnUrlExpired((Map) message.obj);
                    break;
                case JAnalysisConstants.MainWhat.CLEAR_DYNAMIC_PROPERTY /* 4104 */:
                    e eVar = (e) message.obj;
                    f fVar = (f) eVar.f75932a;
                    eVar.f75933b.m78863a(C35296e.this.f75906f.onPlayCallback(fVar.f75934a, fVar.f75935b, fVar.f75936c, fVar.f75937d, fVar.f75938e));
                    break;
                case 4105:
                    e eVar2 = (e) message.obj;
                    eVar2.f75933b.m78863a(C35296e.this.f75906f.getPlayInfo(((Long) eVar2.f75932a).longValue()));
                    break;
                case 4106:
                    TPPlayerMsg.TPDownLoadProgressInfo tPDownLoadProgressInfo = (TPPlayerMsg.TPDownLoadProgressInfo) message.obj;
                    C35296e.this.f75906f.onDownloadProgressUpdate((int) tPDownLoadProgressInfo.playableDurationMS, tPDownLoadProgressInfo.downloadSpeedKBps, tPDownLoadProgressInfo.currentDownloadSize, tPDownLoadProgressInfo.totalFileSize, tPDownLoadProgressInfo.extraInfo);
                    break;
                case 4107:
                    e eVar3 = (e) message.obj;
                    eVar3.f75933b.m78863a(C35296e.this.f75906f.getPlayInfo((String) eVar3.f75932a));
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.e$b */
    public class b implements ITPPlayListener {
        private b() {
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public Object getPlayInfo(long j11) {
            C35425e c35425e = new C35425e();
            e eVar = new e();
            eVar.f75932a = Long.valueOf(j11);
            eVar.f75933b = c35425e;
            C35296e.this.m77985a(4105, eVar);
            return C35296e.this.m77983a(c35425e);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long getAdvRemainTime() {
            return C35296e.this.f75906f.getAdvRemainTime();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public String getContentType(int i11, String str) {
            return C35296e.this.f75906f.getContentType(i11, str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public int getCurrentPlayClipNo() {
            return C35296e.this.f75906f.getCurrentPlayClipNo();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long[] getCurrentPlayOffset() {
            return C35296e.this.f75906f.getCurrentPlayOffset();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long getCurrentPosition() {
            return C35296e.this.f75906f.getCurrentPosition();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public String getDataFilePath(int i11, String str) {
            return C35296e.this.f75906f.getDataFilePath(i11, str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long getDataTotalSize(int i11, String str) {
            return C35296e.this.f75906f.getDataTotalSize(i11, str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public Object getPlayInfo(String str) {
            C35425e c35425e = new C35425e();
            e eVar = new e();
            eVar.f75932a = str;
            eVar.f75933b = c35425e;
            C35296e.this.m77985a(4107, eVar);
            return C35296e.this.m77983a(c35425e);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long getPlayerBufferLength() {
            return C35296e.this.f75906f.getPlayerBufferLength();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlExpired(Map<String, String> map) {
            C35296e.this.m77985a(JAnalysisConstants.MainWhat.SET_DYNAMIC_PROPERTY, map);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
            TPPlayerMsg.TPCDNURLInfo tPCDNURLInfo = new TPPlayerMsg.TPCDNURLInfo();
            tPCDNURLInfo.url = str;
            tPCDNURLInfo.cdnIp = str2;
            tPCDNURLInfo.uIp = str3;
            tPCDNURLInfo.errorStr = str4;
            C35296e.this.m77985a(FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_OPEN, tPCDNURLInfo);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlUpdate(String str) {
            C35296e.this.m77985a(FragmentTransaction.TRANSIT_FRAGMENT_FADE, str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadError(int i11, int i12, String str) {
            C35296e.this.m77984a(InputDeviceCompat.SOURCE_TOUCHSCREEN, i11, i12, str, false, false, 0L);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadFinish() {
            C35296e.this.m77985a(FragmentTransaction.TRANSIT_FRAGMENT_OPEN, (Object) null);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadProgressUpdate(int i11, int i12, long j11, long j12, String str) {
            TPPlayerMsg.TPDownLoadProgressInfo tPDownLoadProgressInfo = new TPPlayerMsg.TPDownLoadProgressInfo();
            tPDownLoadProgressInfo.playableDurationMS = i11;
            tPDownLoadProgressInfo.downloadSpeedKBps = i12;
            tPDownLoadProgressInfo.currentDownloadSize = j11;
            tPDownLoadProgressInfo.totalFileSize = j12;
            tPDownLoadProgressInfo.extraInfo = str;
            C35296e.this.m77985a(4106, tPDownLoadProgressInfo);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadProtocolUpdate(String str, String str2) {
            TPPlayerMsg.TPProtocolInfo tPProtocolInfo = new TPPlayerMsg.TPProtocolInfo();
            tPProtocolInfo.protocolVersion = str2;
            tPProtocolInfo.protocolName = str;
            C35296e.this.m77985a(JAnalysisConstants.MainWhat.CLEAR_STATIC_PROPERTY, tPProtocolInfo);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadStatusUpdate(int i11) {
            C35296e.this.m77984a(JAnalysisConstants.MainWhat.SET_STATIC_PROPERTY, i11, 0, null, false, false, 0L);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public Object onPlayCallback(int i11, Object obj, Object obj2, Object obj3, Object obj4) {
            f fVar = new f();
            fVar.f75934a = i11;
            fVar.f75935b = obj;
            fVar.f75936c = obj2;
            fVar.f75937d = obj3;
            fVar.f75938e = obj4;
            C35425e c35425e = new C35425e();
            e eVar = new e();
            eVar.f75932a = fVar;
            eVar.f75933b = c35425e;
            C35296e.this.m77985a(JAnalysisConstants.MainWhat.CLEAR_DYNAMIC_PROPERTY, eVar);
            return C35296e.this.m77983a(c35425e);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public int onReadData(int i11, String str, long j11, long j12) {
            return C35296e.this.f75906f.onReadData(i11, str, j11, j12);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public int onStartReadData(int i11, String str, long j11, long j12) {
            return C35296e.this.f75906f.onStartReadData(i11, str, j11, j12);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public int onStopReadData(int i11, String str, int i12) {
            return C35296e.this.f75906f.onStopReadData(i11, str, i12);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.e$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        Object f75932a;

        /* JADX INFO: renamed from: b */
        C35425e f75933b;

        private e() {
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.e$f */
    public static class f {

        /* JADX INFO: renamed from: a */
        int f75934a;

        /* JADX INFO: renamed from: b */
        Object f75935b;

        /* JADX INFO: renamed from: c */
        Object f75936c;

        /* JADX INFO: renamed from: d */
        Object f75937d;

        /* JADX INFO: renamed from: e */
        Object f75938e;

        private f() {
        }
    }

    /* JADX INFO: renamed from: a */
    private int m77973a(List<ITPMediaTrackClip> list, String str, ArrayList<TPDownloadParamData> arrayList) {
        int i11 = -1;
        if (C35422b.m78845a(list)) {
            TPLogUtil.m78802w("TPThumbPlayer[TPPlayManagerImpl.java]", "clipList is empty, return");
            return -1;
        }
        int size = list.size();
        HashMap map = new HashMap();
        int i12 = 1;
        for (int i13 = 0; i13 < size; i13++) {
            ITPMediaTrackClip iTPMediaTrackClip = list.get(i13);
            if ((iTPMediaTrackClip instanceof C35283h) && C35422b.m78849d(((C35283h) iTPMediaTrackClip).getFilePath())) {
                map.put(iTPMediaTrackClip, new d(i12, i13));
                i12++;
            }
        }
        if (C35422b.m78846a(map)) {
            TPLogUtil.m78800i("TPThumbPlayer[TPPlayManagerImpl.java]", "all urls is local file url, return");
            return -1;
        }
        try {
            int iStartClipPlay = this.f75903c.startClipPlay(str, map.size(), this.f75905e);
            try {
                if (iStartClipPlay <= 0) {
                    TPLogUtil.m78797e("TPThumbPlayer[TPPlayManagerImpl.java]", "p2p proxy start clip play failed, cause : playId < 0");
                    return iStartClipPlay;
                }
                for (Map.Entry entry : map.entrySet()) {
                    ITPMediaTrackClip iTPMediaTrackClip2 = (ITPMediaTrackClip) entry.getKey();
                    d dVar = (d) entry.getValue();
                    if (iTPMediaTrackClip2 instanceof C35283h) {
                        C35283h c35283h = (C35283h) iTPMediaTrackClip2;
                        TPDownloadParamData tPDownloadParamDataM77979a = m77979a(arrayList, dVar.f75931b);
                        if (tPDownloadParamDataM77979a == null) {
                            TPLogUtil.m78797e("TPThumbPlayer[TPPlayManagerImpl.java]", "fatal err, paramData is null.");
                            return -1;
                        }
                        TPLogUtil.m78797e("TPThumbPlayer[TPPlayManagerImpl.java]", "multi trackClipIndex:" + dVar.f75931b + ", download seq:" + dVar.f75930a + ", clip.url:" + c35283h.getUrl() + ", clip.getFilePath:" + c35283h.getFilePath() + ", paramData.savePath:" + tPDownloadParamDataM77979a.getSavePath() + ", paramData.DownloadFileID:" + tPDownloadParamDataM77979a.getDownloadFileID());
                        if (this.f75903c.setClipInfo(iStartClipPlay, dVar.f75930a, tPDownloadParamDataM77979a.getDownloadFileID(), m77981a(c35283h.getFilePath(), tPDownloadParamDataM77979a, c35283h.getHttpHeader(), m78008s()))) {
                            c35283h.m77870a(this.f75903c.getClipPlayUrl(iStartClipPlay, dVar.f75930a, 1));
                        }
                    }
                }
                return iStartClipPlay;
            } catch (Throwable th2) {
                th = th2;
                i11 = iStartClipPlay;
                TPLogUtil.m78798e("TPThumbPlayer[TPPlayManagerImpl.java]", th);
                return i11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: b */
    private ITPMediaAsset m77989b(ITPMediaAsset iTPMediaAsset) {
        List<ITPMediaTrackClip> listM77994c = m77994c(iTPMediaAsset);
        if (!C35422b.m78845a(listM77994c)) {
            this.f75910k = m77973a(listM77994c, m78006q(), this.f75908i);
            m78002m();
            m78003n();
        }
        return iTPMediaAsset;
    }

    /* JADX INFO: renamed from: c */
    private List<ITPMediaTrackClip> m77994c(ITPMediaAsset iTPMediaAsset) {
        ITPMediaTrack iTPMediaTrack;
        if (iTPMediaAsset instanceof C35280e) {
            List<ITPMediaTrack> allAVTracks = ((C35280e) iTPMediaAsset).getAllAVTracks();
            if (C35422b.m78845a(allAVTracks) || (iTPMediaTrack = allAVTracks.get(0)) == null || C35422b.m78845a(iTPMediaTrack.getAllTrackClips())) {
                return null;
            }
            return iTPMediaTrack.getAllTrackClips();
        }
        if (iTPMediaAsset instanceof ITPMediaTrack) {
            ITPMediaTrack iTPMediaTrack2 = (ITPMediaTrack) iTPMediaAsset;
            if (C35422b.m78845a(iTPMediaTrack2.getAllTrackClips())) {
                return null;
            }
            return iTPMediaTrack2.getAllTrackClips();
        }
        if (!(iTPMediaAsset instanceof ITPMediaTrackClip)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add((ITPMediaTrackClip) iTPMediaAsset);
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    private String m77998f(int i11) {
        switch (i11) {
            case FragmentTransaction.TRANSIT_FRAGMENT_OPEN /* 4097 */:
                return "onDownloadFinish";
            case InputDeviceCompat.SOURCE_TOUCHSCREEN /* 4098 */:
                return "onDownloadError";
            case FragmentTransaction.TRANSIT_FRAGMENT_FADE /* 4099 */:
                return "onDownloadCdnUrlUpdate";
            case FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_OPEN /* 4100 */:
                return "onDownloadCdnUrlInfoUpdate";
            case JAnalysisConstants.MainWhat.SET_STATIC_PROPERTY /* 4101 */:
                return "onDownloadStatusUpdate";
            case JAnalysisConstants.MainWhat.CLEAR_STATIC_PROPERTY /* 4102 */:
                return "onDownloadProtocolUpdate";
            case JAnalysisConstants.MainWhat.SET_DYNAMIC_PROPERTY /* 4103 */:
                return "onDownloadCdnUrlExpired";
            case JAnalysisConstants.MainWhat.CLEAR_DYNAMIC_PROPERTY /* 4104 */:
                return "onPlayCallback";
            case 4105:
            case 4107:
                return "getPlayInfo";
            case 4106:
                return "onDownloadProgressUpdate";
            default:
                return "unknown";
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: d */
    public void mo77905d() {
        TPLogUtil.m78796d("TPThumbPlayer[TPPlayManagerImpl.java]", "stopDownload, playId:" + this.f75910k);
        int i11 = this.f75910k;
        if (i11 > 0) {
            m77997e(i11);
        }
        this.f75910k = 0;
        if (!C35422b.m78845a(this.f75914o)) {
            for (c cVar : this.f75914o) {
                if (cVar != null) {
                    m77997e(cVar.f75929b);
                }
            }
            this.f75914o.clear();
        }
        if (!C35422b.m78846a(this.f75915p)) {
            Iterator<Integer> it = this.f75915p.values().iterator();
            while (it.hasNext()) {
                m77997e(it.next().intValue());
            }
            this.f75915p.clear();
        }
        m78004o();
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: e */
    public void mo77906e() {
        mo77905d();
        C35429i.m78882a().m78895b(this);
        C35426f.m78867b(this);
        m78009t();
        this.f75913n = null;
        this.f75906f = new C35297f("TPThumbPlayer[TPPlayManagerImpl.java]");
        this.f75905e = null;
        this.f75903c = null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: g */
    public String mo77908g() {
        if (m78005p()) {
            return null;
        }
        try {
            return this.f75903c.getPlayErrorCodeStr(this.f75910k);
        } catch (Throwable th2) {
            TPLogUtil.m78798e("TPThumbPlayer[TPPlayManagerImpl.java]", th2);
            return null;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: h */
    public void mo77909h() {
        if (m78005p()) {
            return;
        }
        m77995c(this.f75910k);
        if (!C35422b.m78845a(this.f75914o)) {
            for (c cVar : this.f75914o) {
                if (cVar != null) {
                    m77995c(cVar.f75929b);
                }
            }
        }
        if (C35422b.m78846a(this.f75915p)) {
            return;
        }
        Iterator<Integer> it = this.f75915p.values().iterator();
        while (it.hasNext()) {
            m77995c(it.next().intValue());
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.e$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        long f75928a;

        /* JADX INFO: renamed from: b */
        int f75929b;

        public c(long j11, int i11) {
            this.f75928a = j11;
            this.f75929b = i11;
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.e$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        int f75930a;

        /* JADX INFO: renamed from: b */
        int f75931b;

        public d(int i11, int i12) {
            this.f75930a = i11;
            this.f75931b = i12;
        }
    }

    /* JADX INFO: renamed from: b */
    private ITPMediaAsset m77990b(ITPMediaAsset iTPMediaAsset, long j11, TPVideoInfo tPVideoInfo) {
        List<ITPMediaTrackClip> listM77994c = m77994c(iTPMediaAsset);
        if (!C35422b.m78845a(listM77994c) && tPVideoInfo != null) {
            int iM77973a = m77973a(listM77994c, tPVideoInfo.getProxyFileID(), tPVideoInfo.getDownloadPraramList());
            if (iM77973a > 0) {
                this.f75914o.offer(new c(j11, iM77973a));
                TPLogUtil.m78800i("TPThumbPlayer[TPPlayManagerImpl.java]", "p2p proxy switch def sucess, defId:" + j11 + ",playId:" + iM77973a);
                return iTPMediaAsset;
            }
            TPLogUtil.m78797e("TPThumbPlayer[TPPlayManagerImpl.java]", "p2p proxy switch clip def failed, cause : playId < 0");
        }
        return iTPMediaAsset;
    }

    /* JADX INFO: renamed from: c */
    private void m77995c(int i11) {
        try {
            this.f75903c.pauseDownload(i11);
        } catch (Throwable th2) {
            TPLogUtil.m78799e("TPThumbPlayer[TPPlayManagerImpl.java]", th2, "p2p proxy pause download failed, taskId:".concat(String.valueOf(i11)));
        }
    }

    /* JADX INFO: renamed from: d */
    private void m77996d(int i11) {
        try {
            this.f75903c.resumeDownload(this.f75910k);
        } catch (Throwable th2) {
            TPLogUtil.m78799e("TPThumbPlayer[TPPlayManagerImpl.java]", th2, "p2p proxy resume download failed, taskId:".concat(String.valueOf(i11)));
        }
    }

    /* JADX INFO: renamed from: e */
    private void m77997e(int i11) {
        if (m78005p()) {
            return;
        }
        try {
            this.f75903c.stopPlay(i11);
        } catch (Throwable th2) {
            TPLogUtil.m78799e("TPThumbPlayer[TPPlayManagerImpl.java]", th2, "p2p proxy stop play failed, taskID:".concat(String.valueOf(i11)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m77999g(int i11) {
        int i12;
        switch (i11) {
            case TPPlayerMgr.EVENT_ID_APP_ENTER_BACKGROUND /* 100001 */:
                i12 = 13;
                break;
            case TPPlayerMgr.EVENT_ID_APP_ENTER_FOREGROUND /* 100002 */:
                i12 = 14;
                break;
            default:
                return;
        }
        m78012b(i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m78000h(int i11) {
        if (i11 == 1) {
            m78012b(1);
            m78012b(10);
        } else if (i11 == 2) {
            m78012b(2);
            m78012b(9);
        } else {
            if (i11 != 3) {
                return;
            }
            m78012b(2);
            m78012b(10);
        }
    }

    /* JADX INFO: renamed from: l */
    private boolean m78001l() {
        if (this.f75907h == f75900g) {
            this.f75907h = TPPlayerConfig.getProxyServiceType();
        }
        InterfaceC35293b interfaceC35293bM78027a = C35300i.m78021a().m78027a(this.f75907h);
        if (interfaceC35293bM78027a == null || interfaceC35293bM78027a.mo77963a() == null) {
            TPLogUtil.m78797e("TPThumbPlayer[TPPlayManagerImpl.java]", "initProxy failed, serviceType:" + this.f75907h + ", playProxyManager:" + interfaceC35293bM78027a);
            return false;
        }
        try {
            ITPDownloadProxy iTPDownloadProxyMo77963a = interfaceC35293bM78027a.mo77963a();
            this.f75903c = iTPDownloadProxyMo77963a;
            iTPDownloadProxyMo77963a.setUserData("qq_is_vip", Boolean.valueOf(TPPlayerConfig.isUserIsVip()));
            if (!TextUtils.isEmpty(TPPlayerConfig.getUserUin())) {
                this.f75903c.setUserData(TPDownloadProxyEnum.USER_UIN, TPPlayerConfig.getUserUin());
            }
            if (!TextUtils.isEmpty(TPPlayerConfig.getAppVersionName(this.f75901a))) {
                this.f75903c.setUserData(TPDownloadProxyEnum.USER_APP_VERSION, TPPlayerConfig.getAppVersionName(this.f75901a));
            }
            if (TPPlayerConfig.getBuildNumber(this.f75901a) != -1) {
                this.f75903c.setUserData(TPDownloadProxyEnum.USER_APP_VERSION_CODE, String.valueOf(TPPlayerConfig.getBuildNumber(this.f75901a)));
            }
            this.f75903c.setUserData(TPDownloadProxyEnum.USER_UPC, TPPlayerConfig.getUserUpc());
            this.f75903c.setUserData(TPDownloadProxyEnum.USER_UPC_STATE, Integer.valueOf(TPPlayerConfig.getUserUpcState()));
            this.f75903c.setUserData(TPDownloadProxyEnum.USER_EXTERNAL_NETWORK_IP, TPPlayerConfig.getOutNetIp());
            this.f75903c.setUserData(TPDownloadProxyEnum.TAB_ABUSERID, TPPlayerConfig.getAbUserId());
            return true;
        } catch (Throwable th2) {
            TPLogUtil.m78798e("TPThumbPlayer[TPPlayManagerImpl.java]", th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    private void m78002m() {
        try {
            this.f75903c.setPlayState(this.f75910k, this.f75919t ? 101 : 100);
        } catch (Throwable th2) {
            TPLogUtil.m78798e("TPThumbPlayer[TPPlayManagerImpl.java]", th2);
        }
    }

    /* JADX INFO: renamed from: n */
    private void m78003n() {
        int i11 = this.f75910k;
        if (i11 > 0) {
            this.f75903c.updateTaskInfo(i11, TPDownloadProxyEnum.TASKINFO_ADAPTIVE_DYNAMIC_SWITCH, Integer.valueOf((this.f75920u || this.f75921v) ? 1 : 0));
            this.f75903c.updateTaskInfo(this.f75910k, TPDownloadProxyEnum.TASKINFO_MAX_BITRATE, Long.valueOf(this.f75923x));
            this.f75903c.updateTaskInfo(this.f75910k, TPDownloadProxyEnum.DLPARAM_MULTI_NETWORK, Integer.valueOf(this.f75922w ? 1 : 0));
        }
    }

    /* JADX INFO: renamed from: o */
    private void m78004o() {
        TPLogUtil.m78796d("TPThumbPlayer[TPPlayManagerImpl.java]", "reset");
        this.f75909j = "";
        this.f75912m = "";
        this.f75911l = null;
        this.f75916q = 0L;
        this.f75917r = 0L;
        this.f75918s = false;
        this.f75919t = true;
        this.f75920u = false;
        this.f75921v = false;
        this.f75922w = false;
        if (!C35422b.m78845a(this.f75908i)) {
            this.f75908i.clear();
        }
        this.f75904d = 0;
        this.f75907h = f75900g;
        this.f75903c = null;
        this.f75923x = 100000000L;
    }

    /* JADX INFO: renamed from: q */
    private String m78006q() {
        return this.f75909j;
    }

    /* JADX INFO: renamed from: r */
    private void m78007r() {
        try {
            this.f75903c.setUserData(TPDownloadProxyEnum.DLPARAM_PLAY_START_TIME, Long.valueOf(this.f75916q));
            this.f75903c.setUserData(TPDownloadProxyEnum.DLPARAM_PLAY_END_TIME, Long.valueOf(this.f75917r));
        } catch (Throwable th2) {
            TPLogUtil.m78798e("TPThumbPlayer[TPPlayManagerImpl.java]", th2);
        }
    }

    /* JADX INFO: renamed from: s */
    private Map<String, Object> m78008s() {
        HashMap map = new HashMap();
        map.put(TPDownloadProxyEnum.DLPARAM_ADAPTIVE_TYPE, Integer.valueOf((this.f75921v || this.f75920u) ? 1 : 0));
        map.put(TPDownloadProxyEnum.DLPARAM_MULTI_NETWORK, Integer.valueOf(this.f75922w ? 1 : 0));
        return map;
    }

    /* JADX INFO: renamed from: t */
    private void m78009t() {
        TPLogUtil.m78796d("TPThumbPlayer[TPPlayManagerImpl.java]", "inner event : release handler");
        this.f75925z.writeLock().lock();
        a aVar = this.f75902b;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
            this.f75902b = null;
        }
        this.f75925z.writeLock().unlock();
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: a */
    public C35243e mo77886a(long j11, String str, TPVideoInfo tPVideoInfo, Map<String, String> map) {
        if (tPVideoInfo == null) {
            return new C35243e(str);
        }
        return m77974a(j11, str, (tPVideoInfo.getDownloadPraramList() == null || tPVideoInfo.getDownloadPraramList().size() <= 0) ? null : tPVideoInfo.getDownloadPraramList().get(0), map);
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: f */
    public boolean mo77907f() {
        return !m78005p();
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: j */
    public ITPPlayerProxyListener mo77911j() {
        return this.f75913n;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPlayerProxy
    public void setIsActive(boolean z11) {
        TPLogUtil.m78796d("TPThumbPlayer[TPPlayManagerImpl.java]", "setIsActive: ".concat(String.valueOf(z11)));
        this.f75919t = z11;
        if (m78005p()) {
            return;
        }
        m78002m();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPlayerProxy
    public void setProxyServiceType(int i11) {
        this.f75907h = i11;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPlayerProxy
    public void setTPPlayerProxyListener(ITPPlayerProxyListener iTPPlayerProxyListener) {
        this.f75913n = iTPPlayerProxyListener;
    }

    public C35296e(Context context, Looper looper) {
        this.f75901a = context;
        this.f75902b = new a(looper);
        C35426f.m78866a(this);
        C35429i.m78882a().m78894a(this);
        this.f75905e = new b();
        this.f75906f = new C35297f("TPThumbPlayer[TPPlayManagerImpl.java]");
        this.f75915p = new HashMap<>();
        this.f75908i = new ArrayList<>();
        this.f75925z = new C35433m();
    }

    /* JADX INFO: renamed from: a */
    private C35243e m77974a(long j11, String str, TPDownloadParamData tPDownloadParamData, Map<String, String> map) {
        C35243e c35243e = new C35243e(str);
        if (C35422b.m78849d(str) && !m78005p()) {
            if (this.f75914o == null) {
                this.f75914o = new LinkedList<>();
            }
            String downloadFileID = null;
            TPDownloadParam tPDownloadParamM77981a = tPDownloadParamData != null ? m77981a(str, tPDownloadParamData, map, m78008s()) : null;
            if (tPDownloadParamData != null) {
                try {
                    downloadFileID = tPDownloadParamData.getDownloadFileID();
                } catch (Throwable th2) {
                    TPLogUtil.m78799e("TPThumbPlayer[TPPlayManagerImpl.java]", th2, "p2p proxy switch def failed");
                }
            }
            int iStartPlay = this.f75903c.startPlay(downloadFileID, tPDownloadParamM77981a, this.f75905e);
            if (iStartPlay <= 0) {
                TPLogUtil.m78797e("TPThumbPlayer[TPPlayManagerImpl.java]", "p2p proxy switch def failed, cause : playId <= 0");
                return c35243e;
            }
            String playUrl = this.f75903c.getPlayUrl(iStartPlay, 1);
            if (TextUtils.isEmpty(playUrl)) {
                playUrl = str;
            }
            c35243e.m77642b(playUrl);
            String playUrl2 = this.f75903c.getPlayUrl(iStartPlay, 0);
            if (!TextUtils.isEmpty(playUrl2)) {
                str = playUrl2;
            }
            c35243e.m77640a(str);
            this.f75914o.offer(new c(j11, iStartPlay));
            TPLogUtil.m78800i("TPThumbPlayer[TPPlayManagerImpl.java]", "p2p proxy switch def sucess, defId:" + j11 + ",playId:" + iStartPlay);
            return c35243e;
        }
        return c35243e;
    }

    /* JADX INFO: renamed from: p */
    private boolean m78005p() {
        int i11;
        if (!TPPlayerConfig.isUseP2P()) {
            TPLogUtil.m78797e("TPThumbPlayer[TPPlayManagerImpl.java]", "config set don't use download proxy!");
            return true;
        }
        if (this.f75904d == 0) {
            if (m78001l()) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            this.f75904d = i11;
        }
        if (this.f75904d == 1) {
            return true;
        }
        return false;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: b */
    public void mo77903b() {
        if (m78005p()) {
            TPLogUtil.m78797e("TPThumbPlayer[TPPlayManagerImpl.java]", "stopRemuxer, download proxy init failed.");
            return;
        }
        if (this.f75918s) {
            int i11 = this.f75910k;
            if (i11 > 0) {
                m77997e(i11);
            }
            this.f75910k = 0;
            mo77887a(this.f75912m, (Map<String, String>) null);
        }
        this.f75918s = false;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: c */
    public boolean mo77904c() {
        LinkedList<c> linkedList;
        return (m78005p() || (linkedList = this.f75914o) == null || linkedList.size() <= 0) ? false : true;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: i */
    public void mo77910i() {
        if (!m78005p()) {
            m77996d(this.f75910k);
            if (!C35422b.m78845a(this.f75914o)) {
                for (c cVar : this.f75914o) {
                    if (cVar != null) {
                        m77996d(cVar.f75929b);
                    }
                }
            }
            if (!C35422b.m78846a(this.f75915p)) {
                Iterator<Integer> it = this.f75915p.values().iterator();
                while (it.hasNext()) {
                    m77996d(it.next().intValue());
                }
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: k */
    public TPDLProxyMsg.TPPDTInfo[] mo77912k() {
        ITPDownloadProxy iTPDownloadProxy;
        if (m78005p() || (iTPDownloadProxy = this.f75903c) == null) {
            return null;
        }
        return iTPDownloadProxy.getPDTInfos(this.f75910k);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPlayerProxy
    public void pushEvent(int i11) {
        if (m78005p()) {
            return;
        }
        try {
            m78012b(C35299h.m78020b(i11));
        } catch (IllegalArgumentException e11) {
            TPLogUtil.m78798e("TPThumbPlayer[TPPlayManagerImpl.java]", e11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: a */
    public C35243e mo77887a(String str, Map<String, String> map) {
        C35243e c35243e = new C35243e(str);
        if (C35422b.m78849d(str) && !m78005p()) {
            m78007r();
            this.f75912m = str;
            TPDownloadParamData tPDownloadParamDataM77979a = m77979a(this.f75908i, 0);
            if (this.f75924y && tPDownloadParamDataM77979a != null && tPDownloadParamDataM77979a.getDlType() == 1) {
                tPDownloadParamDataM77979a = new TPDownloadParamData(11);
            }
            TPDownloadParam tPDownloadParamM77981a = tPDownloadParamDataM77979a != null ? m77981a(str, tPDownloadParamDataM77979a, map, m78008s()) : null;
            try {
                StringBuilder sb2 = new StringBuilder("single url:");
                sb2.append(str);
                sb2.append(", paramData.savePath:");
                sb2.append(tPDownloadParamDataM77979a != null ? tPDownloadParamDataM77979a.getSavePath() : "null");
                sb2.append(", paramData.DownloadFileID:");
                sb2.append(tPDownloadParamDataM77979a != null ? tPDownloadParamDataM77979a.getDownloadFileID() : "null");
                TPLogUtil.m78796d("TPThumbPlayer[TPPlayManagerImpl.java]", sb2.toString());
                int iStartPlay = this.f75903c.startPlay(m78006q(), tPDownloadParamM77981a, this.f75905e);
                if (iStartPlay > 0) {
                    String playUrl = this.f75903c.getPlayUrl(iStartPlay, 0);
                    if (TextUtils.isEmpty(playUrl)) {
                        playUrl = str;
                    }
                    TPLogUtil.m78796d("TPThumbPlayer[TPPlayManagerImpl.java]", "startDownloadPlay, playId:".concat(String.valueOf(iStartPlay)));
                    c35243e.m77642b(playUrl);
                    String playUrl2 = this.f75903c.getPlayUrl(iStartPlay, 1);
                    if (!TextUtils.isEmpty(playUrl2)) {
                        str = playUrl2;
                    }
                    c35243e.m77640a(str);
                    this.f75910k = iStartPlay;
                    m78002m();
                    m78003n();
                    return c35243e;
                }
                TPLogUtil.m78797e("TPThumbPlayer[TPPlayManagerImpl.java]", "p2p proxy start play failed, cause : playId <= 0");
                return c35243e;
            } catch (Throwable th2) {
                TPLogUtil.m78799e("TPThumbPlayer[TPPlayManagerImpl.java]", th2, "p2p proxy start play failed");
            }
        }
        return c35243e;
    }

    /* JADX INFO: renamed from: b */
    public void m78012b(int i11) {
        if (m78005p()) {
            return;
        }
        try {
            this.f75903c.pushEvent(i11);
        } catch (Throwable th2) {
            TPLogUtil.m78799e("TPThumbPlayer[TPPlayManagerImpl.java]", th2, "p2p proxy pushEvent failed, event:".concat(String.valueOf(i11)));
        }
    }

    /* JADX INFO: renamed from: b */
    private void m77991b(TPVideoInfo tPVideoInfo) {
        String str;
        if (m78005p()) {
            return;
        }
        this.f75911l = tPVideoInfo;
        if (tPVideoInfo == null || tPVideoInfo.getDownloadPraramList() == null) {
            str = "video or downloadParamList is null, return";
        } else {
            if (this.f75910k > 0) {
                try {
                    ArrayList<TPDownloadParamData> downloadPraramList = tPVideoInfo.getDownloadPraramList();
                    for (int i11 = 0; i11 < downloadPraramList.size(); i11++) {
                        TPDownloadParamData tPDownloadParamData = downloadPraramList.get(i11);
                        if (!this.f75903c.setClipInfo(this.f75910k, tPDownloadParamData.getClipNo(), tPDownloadParamData.getDownloadFileID(), m77981a(tPDownloadParamData.getUrl(), tPDownloadParamData, (Map<String, String>) null, m78008s()))) {
                            TPLogUtil.m78802w("TPThumbPlayer[TPPlayManagerImpl.java]", "setClipInfo failed, playID:" + this.f75910k + ", clipNo:" + tPDownloadParamData.getClipNo() + ", downloadFileID:" + tPDownloadParamData.getDownloadFileID());
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    TPLogUtil.m78798e("TPThumbPlayer[TPPlayManagerImpl.java]", th2);
                    return;
                }
            }
            str = "p2p proxy not start, return";
        }
        TPLogUtil.m78802w("TPThumbPlayer[TPPlayManagerImpl.java]", str);
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: a */
    public ITPMediaAsset mo77888a(ITPMediaAsset iTPMediaAsset) {
        if (m78005p()) {
            return iTPMediaAsset;
        }
        m78007r();
        if (iTPMediaAsset instanceof C35285j) {
            return m77976a((C35285j) iTPMediaAsset);
        }
        return iTPMediaAsset instanceof C35287l ? m77977a((C35287l) iTPMediaAsset) : m77989b(iTPMediaAsset);
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: a */
    public ITPMediaAsset mo77889a(ITPMediaAsset iTPMediaAsset, long j11, TPVideoInfo tPVideoInfo) {
        if (m78005p() || iTPMediaAsset == null) {
            return iTPMediaAsset;
        }
        if (this.f75914o == null) {
            this.f75914o = new LinkedList<>();
        }
        if (tPVideoInfo == null) {
            return iTPMediaAsset;
        }
        if (iTPMediaAsset instanceof ITPMediaDRMAsset) {
            return m77975a((ITPMediaDRMAsset) iTPMediaAsset, j11, tPVideoInfo);
        }
        return iTPMediaAsset instanceof C35287l ? m77978a((C35287l) iTPMediaAsset, j11, tPVideoInfo) : m77990b(iTPMediaAsset, j11, tPVideoInfo);
    }

    /* JADX INFO: renamed from: a */
    private ITPMediaAsset m77975a(ITPMediaDRMAsset iTPMediaDRMAsset, long j11, TPVideoInfo tPVideoInfo) {
        iTPMediaDRMAsset.setDrmPlayUrl(m77974a(j11, iTPMediaDRMAsset.getDrmPlayUrl(), (tPVideoInfo.getDownloadPraramList() == null || tPVideoInfo.getDownloadPraramList().size() <= 0) ? null : tPVideoInfo.getDownloadPraramList().get(0), iTPMediaDRMAsset.getHttpHeader()).m77641b());
        return iTPMediaDRMAsset;
    }

    /* JADX INFO: renamed from: b */
    private boolean m77993b(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        HashMap map = new HashMap();
        map.put(TPDownloadProxyEnum.DLPARAM_DATA_TRANSFER_MODE, 1);
        try {
            return this.f75903c.setClipInfo(this.f75910k, 2, str2, new TPDownloadParam(arrayList, 3, map));
        } catch (Throwable th2) {
            TPLogUtil.m78798e("TPThumbPlayer[TPPlayManagerImpl.java]", th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private ITPMediaAsset m77976a(C35285j c35285j) {
        c35285j.setDrmPlayUrl(mo77887a(c35285j.getDrmPlayUrl(), c35285j.getHttpHeader()).m77641b());
        return c35285j;
    }

    /* JADX INFO: renamed from: a */
    private ITPMediaAsset m77977a(C35287l c35287l) {
        c35287l.setStreamUrl(mo77887a(c35287l.getStreamUrl(), c35287l.getHttpHeader()).m77641b());
        return c35287l;
    }

    /* JADX INFO: renamed from: a */
    private ITPMediaAsset m77978a(C35287l c35287l, long j11, TPVideoInfo tPVideoInfo) {
        c35287l.setStreamUrl(mo77886a(j11, c35287l.getStreamUrl(), tPVideoInfo, c35287l.getHttpHeader()).m77641b());
        return c35287l;
    }

    /* JADX INFO: renamed from: a */
    private TPDownloadParamData m77979a(ArrayList<TPDownloadParamData> arrayList, int i11) {
        if (C35422b.m78845a(arrayList) || i11 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i11);
    }

    /* JADX INFO: renamed from: a */
    private TPDownloadParam m77981a(String str, TPDownloadParamData tPDownloadParamData, Map<String, String> map, Map<String, Object> map2) {
        return C35302k.m78032a(str, tPDownloadParamData, map, map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public Object m77983a(C35425e c35425e) {
        try {
            return c35425e.m78862a(500L);
        } catch (Throwable th2) {
            TPLogUtil.m78797e("TPThumbPlayer[TPPlayManagerImpl.java]", "onPlayCallback getResult has exception:" + th2.toString());
            return null;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: a */
    public String mo77890a(int i11, String str, TPDownloadParamData tPDownloadParamData) {
        String strM78848c;
        TPDownloadParam tPDownloadParamM78032a;
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "return coz url is empty";
        } else if (!C35422b.m78849d(str)) {
            str2 = "return coz url is locol url, not need use proxy";
        } else {
            if (!m78005p()) {
                int i12 = 2;
                int i13 = 1;
                try {
                    if (tPDownloadParamData != null) {
                        tPDownloadParamM78032a = C35302k.m78032a(str, tPDownloadParamData, null, null);
                        if (tPDownloadParamData.getTaskType() != 1) {
                            i12 = 1;
                        }
                        strM78848c = tPDownloadParamData.getDownloadFileID();
                        if (TextUtils.isEmpty(strM78848c)) {
                            strM78848c = C35422b.m78848c(str);
                        }
                        i13 = i12;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(str);
                        TPDownloadParam tPDownloadParam = new TPDownloadParam(arrayList, i11 == 2 ? 3 : 0, null);
                        strM78848c = C35422b.m78848c(str);
                        tPDownloadParamM78032a = tPDownloadParam;
                    }
                    int iStartPlay = this.f75903c.startPlay(strM78848c, tPDownloadParamM78032a, this.f75905e);
                    if (iStartPlay <= 0) {
                        TPLogUtil.m78797e("TPThumbPlayer[TPPlayManagerImpl.java]", "p2p proxy start play failed, cause : playId <= 0");
                        return str;
                    }
                    TPLogUtil.m78796d("TPThumbPlayer[TPPlayManagerImpl.java]", "p2p proxy start play, url type".concat(String.valueOf(i13)));
                    String playUrl = this.f75903c.getPlayUrl(iStartPlay, i13);
                    this.f75915p.put(playUrl, Integer.valueOf(iStartPlay));
                    return playUrl;
                } catch (Throwable th2) {
                    TPLogUtil.m78797e("TPThumbPlayer[TPPlayManagerImpl.java]", "p2p proxy start play failed:".concat(String.valueOf(th2)));
                    return str;
                }
            }
            str2 = "return coz download proxy init failed";
        }
        TPLogUtil.m78802w("TPThumbPlayer[TPPlayManagerImpl.java]", str2);
        return str;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: a */
    public void mo77891a(float f11) {
        if (m78005p()) {
            return;
        }
        if (f11 <= 0.0f) {
            TPLogUtil.m78797e("TPThumbPlayer[TPPlayManagerImpl.java]", "set play speed ratio, value invalid:".concat(String.valueOf(f11)));
        } else {
            TPLogUtil.m78796d("TPThumbPlayer[TPPlayManagerImpl.java]", "set play speed value to proxy:".concat(String.valueOf(f11)));
            this.f75903c.updateTaskInfo(this.f75910k, TPDownloadProxyEnum.TASKINFO_SPEED_RATIO, Float.valueOf(f11));
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: a */
    public void mo77892a(int i11) {
        TPLogUtil.m78796d("TPThumbPlayer[TPPlayManagerImpl.java]", "setProxyPlayState: ".concat(String.valueOf(i11)));
        if (m78005p()) {
            return;
        }
        try {
            this.f75903c.setPlayState(this.f75910k, i11);
            if ((i11 == 5 || i11 == 0) && !C35422b.m78845a(this.f75914o)) {
                for (c cVar : this.f75914o) {
                    if (cVar != null) {
                        TPLogUtil.m78800i("TPThumbPlayer[TPPlayManagerImpl.java]", "setProxyPlayState definitionID:" + cVar.f75928a + ", taskID:" + cVar.f75929b + ", state:" + i11);
                        this.f75903c.setPlayState(cVar.f75929b, i11);
                    }
                }
            }
        } catch (Throwable th2) {
            TPLogUtil.m78798e("TPThumbPlayer[TPPlayManagerImpl.java]", th2);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.utils.C35429i.b
    /* JADX INFO: renamed from: a */
    public void mo78010a(int i11, int i12, int i13, int i14) {
        TPLogUtil.m78796d("TPThumbPlayer[TPPlayManagerImpl.java]", "onNetworkStatusChanged oldNetStatus: " + i11 + ", netStatus: " + i12);
        m77984a(4197, i12, 0, null, false, false, 0L);
    }

    @Override // com.tencent.thumbplayer.tcmedia.utils.C35426f.a
    /* JADX INFO: renamed from: a */
    public void mo78011a(int i11, int i12, int i13, Object obj) {
        TPLogUtil.m78796d("TPThumbPlayer[TPPlayManagerImpl.java]", "onEvent eventId: " + i11 + ", arg1: " + i12 + ", arg2: " + i13 + ", object" + obj);
        m77984a(4196, i11, 0, null, false, false, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77984a(int i11, int i12, int i13, Object obj, boolean z11, boolean z12, long j11) {
        StringBuilder sb2;
        String str;
        this.f75925z.readLock().lock();
        a aVar = this.f75902b;
        if (aVar != null) {
            if (z11 && obj == null) {
                sb2 = new StringBuilder();
                sb2.append(m77998f(i11));
                str = ", send failed , params null";
            } else {
                if (z12) {
                    aVar.removeMessages(i11);
                }
                Message messageObtainMessage = this.f75902b.obtainMessage();
                messageObtainMessage.what = i11;
                messageObtainMessage.arg1 = i12;
                messageObtainMessage.arg2 = i13;
                messageObtainMessage.obj = obj;
                this.f75902b.sendMessageDelayed(messageObtainMessage, j11);
            }
            this.f75925z.readLock().unlock();
        }
        sb2 = new StringBuilder();
        sb2.append(m77998f(i11));
        str = " , send failed , handler null";
        sb2.append(str);
        TPLogUtil.m78800i("TPThumbPlayer[TPPlayManagerImpl.java]", sb2.toString());
        this.f75925z.readLock().unlock();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77985a(int i11, Object obj) {
        m77984a(i11, 0, 0, obj, false, false, 0L);
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: a */
    public void mo77893a(long j11) {
        c cVar;
        if (m78005p()) {
            return;
        }
        try {
            if (C35422b.m78845a(this.f75914o)) {
                return;
            }
            c cVarPeek = this.f75914o.peek();
            while (true) {
                cVar = cVarPeek;
                if (cVar == null || cVar.f75928a == j11) {
                    break;
                }
                TPLogUtil.m78800i("TPThumbPlayer[TPPlayManagerImpl.java]", "stop proxy definitionID:" + cVar.f75928a + ", taskID:" + cVar.f75929b);
                m77997e(cVar.f75929b);
                this.f75914o.removeFirst();
                cVarPeek = this.f75914o.peek();
            }
            if (cVar != null) {
                TPLogUtil.m78800i("TPThumbPlayer[TPPlayManagerImpl.java]", "stop proxy task id:" + cVar.f75929b);
                m77997e(this.f75910k);
                this.f75910k = cVar.f75929b;
                m78002m();
                m78003n();
                this.f75914o.remove(cVar);
            }
        } catch (Exception e11) {
            TPLogUtil.m78799e("TPThumbPlayer[TPPlayManagerImpl.java]", e11, "playerSwitchDefComplete exception");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: a */
    public void mo77894a(long j11, long j12) {
        ITPDownloadProxy iTPDownloadProxy;
        if (m78005p() || (iTPDownloadProxy = this.f75903c) == null) {
            return;
        }
        iTPDownloadProxy.switchToResolution(this.f75910k, (int) j11, (int) j12);
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: a */
    public void mo77895a(TPOptionalParam tPOptionalParam) {
        if (m78005p() || tPOptionalParam == null) {
            return;
        }
        if (tPOptionalParam.getKey() == 100) {
            this.f75916q = tPOptionalParam.getParamLong().value;
            return;
        }
        if (tPOptionalParam.getKey() == 500) {
            try {
                long j11 = tPOptionalParam.getParamLong().value;
                this.f75917r = j11;
                if (this.f75910k > 0) {
                    this.f75903c.setUserData(TPDownloadProxyEnum.DLPARAM_PLAY_END_TIME, Long.valueOf(j11));
                    return;
                }
                return;
            } catch (Throwable th2) {
                TPLogUtil.m78798e("TPThumbPlayer[TPPlayManagerImpl.java]", th2);
                return;
            }
        }
        if (tPOptionalParam.getKey() == 503) {
            this.f75923x = tPOptionalParam.getParamLong().param1;
            m78003n();
            return;
        }
        if (tPOptionalParam.getKey() == 508) {
            this.f75920u = tPOptionalParam.getParamBoolean().value;
            m78003n();
        } else if (tPOptionalParam.getKey() == 504) {
            this.f75921v = tPOptionalParam.getParamLong().value != 0;
            m78003n();
        } else if (tPOptionalParam.getKey() == 509) {
            this.f75922w = tPOptionalParam.getParamBoolean().value;
            m78003n();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: a */
    public void mo77896a(TPVideoInfo tPVideoInfo) {
        if (tPVideoInfo == null) {
            TPLogUtil.m78797e("TPThumbPlayer[TPPlayManagerImpl.java]", "setVideoInfo, param is null ");
            return;
        }
        if (this.f75911l != null) {
            m77991b(tPVideoInfo);
        }
        this.f75911l = tPVideoInfo;
        TPLogUtil.m78796d("TPThumbPlayer[TPPlayManagerImpl.java]", "setVideoInfo, enter");
        this.f75909j = tPVideoInfo.getProxyFileID();
        if (!C35422b.m78845a(this.f75908i)) {
            this.f75908i.clear();
        }
        if (tPVideoInfo.getDownloadPraramList() == null || tPVideoInfo.getDownloadPraramList().size() <= 0) {
            return;
        }
        this.f75908i.addAll(tPVideoInfo.getDownloadPraramList());
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: a */
    public void mo77897a(ITPPlayListener iTPPlayListener) {
        if (iTPPlayListener == null) {
            this.f75906f = new C35297f("TPThumbPlayer[TPPlayManagerImpl.java]");
        } else {
            this.f75906f = iTPPlayListener;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: a */
    public void mo77898a(String str, Object obj) {
        ITPDownloadProxy iTPDownloadProxy = this.f75903c;
        if (iTPDownloadProxy != null) {
            iTPDownloadProxy.updateTaskInfo(this.f75910k, str, obj);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: a */
    public void mo77899a(String str, String str2) {
        if (!C35422b.m78849d(str) || TextUtils.isEmpty(str2)) {
            TPLogUtil.m78797e("TPThumbPlayer[TPPlayManagerImpl.java]", "startRemuxer, audioTrackUrl:" + str + ", keyId:" + str2);
            return;
        }
        if (m78005p()) {
            TPLogUtil.m78797e("TPThumbPlayer[TPPlayManagerImpl.java]", "startRemuxer, download proxy init failed.");
            return;
        }
        if (this.f75918s) {
            int i11 = this.f75910k;
            if (i11 > 0) {
                m77997e(i11);
            }
            this.f75910k = 0;
            mo77887a(this.f75912m, (Map<String, String>) null);
            if (!m77993b(str, str2)) {
                TPLogUtil.m78797e("TPThumbPlayer[TPPlayManagerImpl.java]", "startRemuxer, addAudioTrack err.");
                return;
            }
        } else if (!m77993b(str, str2)) {
            TPLogUtil.m78797e("TPThumbPlayer[TPPlayManagerImpl.java]", "startRemuxer, addAudioTrack err.");
            return;
        }
        this.f75918s = true;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: a */
    public void mo77900a(boolean z11) {
        this.f75924y = z11;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: a */
    public boolean mo77901a() {
        return this.f75924y;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a
    /* JADX INFO: renamed from: a */
    public byte[] mo77902a(String str, String str2, String str3) {
        ITPDownloadProxy iTPDownloadProxy;
        if (m78005p() || (iTPDownloadProxy = this.f75903c) == null) {
            return null;
        }
        return iTPDownloadProxy.getOfflineLicenseKeySetId(str, str2, str3);
    }
}
