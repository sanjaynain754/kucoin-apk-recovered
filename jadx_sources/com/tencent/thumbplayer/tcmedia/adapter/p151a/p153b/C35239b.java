package com.tencent.thumbplayer.tcmedia.adapter.p151a.p153b;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.thumbplayer.tcmedia.adapter.C35249g;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35231a;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPNativeKeyMap;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPNativeKeyMapUtil;
import com.tencent.thumbplayer.tcmedia.api.TPAudioAttributes;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureCallBack;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureParams;
import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.api.TPDashFormat;
import com.tencent.thumbplayer.tcmedia.api.TPHlsTag;
import com.tencent.thumbplayer.tcmedia.api.TPJitterBufferConfig;
import com.tencent.thumbplayer.tcmedia.api.TPOptionalParam;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMsg;
import com.tencent.thumbplayer.tcmedia.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPProgramInfo;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleRenderModel;
import com.tencent.thumbplayer.tcmedia.api.TPTrackInfo;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.tcmedia.core.common.TPAudioFrame;
import com.tencent.thumbplayer.tcmedia.core.common.TPDetailInfo;
import com.tencent.thumbplayer.tcmedia.core.common.TPGeneralError;
import com.tencent.thumbplayer.tcmedia.core.common.TPMediaTrackHlsTag;
import com.tencent.thumbplayer.tcmedia.core.common.TPMediaTrackInfo;
import com.tencent.thumbplayer.tcmedia.core.common.TPPostProcessFrame;
import com.tencent.thumbplayer.tcmedia.core.common.TPSubtitleFrame;
import com.tencent.thumbplayer.tcmedia.core.common.TPVideoFrame;
import com.tencent.thumbplayer.tcmedia.core.demuxer.ITPNativeDemuxerCallback;
import com.tencent.thumbplayer.tcmedia.core.demuxer.TPNativeRemoteSdpInfo;
import com.tencent.thumbplayer.tcmedia.core.imagegenerator.TPImageGeneratorParams;
import com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerAudioFrameCallback;
import com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerEventRecordCallback;
import com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerMessageCallback;
import com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerPostProcessFrameCallback;
import com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerSubtitleFrameCallback;
import com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerVideoFrameCallback;
import com.tencent.thumbplayer.tcmedia.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.tcmedia.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.tcmedia.core.player.TPNativePlayer;
import com.tencent.thumbplayer.tcmedia.core.player.TPNativePlayerInitConfig;
import com.tencent.thumbplayer.tcmedia.core.player.TPNativePlayerProgramInfo;
import com.tencent.thumbplayer.tcmedia.p150a.C35229d;
import com.tencent.thumbplayer.tcmedia.p160e.C35351a;
import com.tencent.thumbplayer.tcmedia.p160e.C35352b;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.b.b */
/* JADX INFO: loaded from: classes62.dex */
public class C35239b implements InterfaceC35237b {

    /* JADX INFO: renamed from: a */
    static final Set<Integer> f75649a = new HashSet<Integer>() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.b.b.8
        {
            add(503);
        }
    };

    /* JADX INFO: renamed from: b */
    private TPNativePlayer f75650b;

    /* JADX INFO: renamed from: c */
    private TPNativePlayerInitConfig f75651c;

    /* JADX INFO: renamed from: d */
    private a f75652d;

    /* JADX INFO: renamed from: e */
    private C35249g f75653e;

    /* JADX INFO: renamed from: f */
    private InterfaceC35231a f75654f;

    /* JADX INFO: renamed from: g */
    private C35351a f75655g;

    /* JADX INFO: renamed from: h */
    private ITPNativePlayerMessageCallback f75656h = new ITPNativePlayerMessageCallback() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.b.b.1
        /* JADX INFO: renamed from: a */
        private void m77600a(int i11, Object obj) {
            if (C35239b.this.f75652d != null) {
                Message.obtain(C35239b.this.f75652d, i11, obj).sendToTarget();
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerMessageCallback
        public void onASyncCallResult(int i11, long j11, int i12, int i13) {
            C35239b.this.f75655g.m78140b("onASyncCallResult, callType:" + i11 + ", opaque:" + j11 + ", errorType:" + i12 + ", errorCode:" + i13);
            b bVar = new b();
            bVar.f75672a = i11;
            bVar.f75673b = j11;
            bVar.f75674c = i12;
            bVar.f75675d = i13;
            m77600a(1, bVar);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerMessageCallback
        public void onDetailInfo(TPDetailInfo tPDetailInfo) {
            C35239b.this.f75655g.m78140b("onDetailInfo, type:" + tPDetailInfo.type + ", time:" + tPDetailInfo.timeSince1970Us);
            m77600a(5, tPDetailInfo);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerMessageCallback
        public void onError(int i11, int i12) {
            C35239b.this.f75655g.m78141c("onError, msgType:" + i11 + ", errorCode:" + i12);
            c cVar = new c();
            cVar.f75676a = i11;
            cVar.f75677b = i12;
            m77600a(4, cVar);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerMessageCallback
        public void onInfoLong(int i11, long j11, long j12) {
            if (i11 == 253) {
                C35238a.m77565b(TPNativeKeyMapUtil.toTPIntValue(TPNativeKeyMap.MapDrmType.class, (int) j11));
                return;
            }
            d dVar = new d();
            dVar.f75678a = i11;
            dVar.f75679b = j11;
            dVar.f75680c = j12;
            m77600a(2, dVar);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerMessageCallback
        public void onInfoObject(int i11, Object obj, long j11, long j12) {
            if (!C35239b.this.m77597d(i11)) {
                C35239b.this.f75655g.m78140b("onInfoObject, infoType:" + i11 + ", objParam:" + obj);
            }
            e eVar = new e();
            eVar.f75681a = i11;
            eVar.f75682b = obj;
            eVar.f75683c = j11;
            eVar.f75684d = j12;
            m77600a(3, eVar);
        }
    };

    /* JADX INFO: renamed from: i */
    private ITPNativePlayerAudioFrameCallback f75657i = new ITPNativePlayerAudioFrameCallback() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.b.b.2
        @Override // com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerAudioFrameCallback
        public void onAudioFrame(TPAudioFrame tPAudioFrame, int i11) {
            C35239b.this.f75653e.mo77486a(C35240c.m77607a(tPAudioFrame));
        }
    };

    /* JADX INFO: renamed from: j */
    private ITPNativePlayerVideoFrameCallback f75658j = new ITPNativePlayerVideoFrameCallback() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.b.b.3
        @Override // com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerVideoFrameCallback
        public void onVideoFrame(TPVideoFrame tPVideoFrame, int i11) {
            C35239b.this.f75653e.mo77488a(C35240c.m77620a(tPVideoFrame));
        }
    };

    /* JADX INFO: renamed from: k */
    private ITPNativePlayerSubtitleFrameCallback f75659k = new ITPNativePlayerSubtitleFrameCallback() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.b.b.4
        @Override // com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerSubtitleFrameCallback
        public void onSubtitleFrame(TPSubtitleFrame tPSubtitleFrame, int i11) {
            C35239b.this.f75653e.mo77636a(C35240c.m77616a(tPSubtitleFrame));
        }
    };

    /* JADX INFO: renamed from: l */
    private ITPNativePlayerPostProcessFrameCallback f75660l = new ITPNativePlayerPostProcessFrameCallback() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.b.b.5
        @Override // com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerPostProcessFrameCallback
        public TPPostProcessFrame onPostProcessFrame(TPPostProcessFrame tPPostProcessFrame, int i11) {
            TPPostProcessFrameBuffer tPPostProcessFrameBufferMo77489b;
            TPPostProcessFrameBuffer tPPostProcessFrameBufferM77615a = C35240c.m77615a(tPPostProcessFrame);
            tPPostProcessFrameBufferM77615a.eventFlag = i11;
            int i12 = tPPostProcessFrame.mediaType;
            if (i12 == 0) {
                tPPostProcessFrameBufferMo77489b = C35239b.this.f75653e.mo77481a(tPPostProcessFrameBufferM77615a);
            } else if (i12 == 1) {
                tPPostProcessFrameBufferMo77489b = C35239b.this.f75653e.mo77489b(tPPostProcessFrameBufferM77615a);
            } else {
                return null;
            }
            return C35240c.m77623a(tPPostProcessFrameBufferMo77489b);
        }
    };

    /* JADX INFO: renamed from: m */
    private ITPNativeDemuxerCallback f75661m = new ITPNativeDemuxerCallback() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.b.b.6
        @Override // com.tencent.thumbplayer.tcmedia.core.demuxer.ITPNativeDemuxerCallback
        public void onDurationUpdated() {
            C35239b.this.f75653e.mo77632d();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.demuxer.ITPNativeDemuxerCallback
        public TPNativeRemoteSdpInfo onSdpExchange(String str, int i11) {
            return C35240c.m77625a(C35239b.this.f75653e.mo77631a(str, i11));
        }
    };

    /* JADX INFO: renamed from: n */
    private ITPNativePlayerEventRecordCallback f75662n = new ITPNativePlayerEventRecordCallback() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.b.b.7
        @Override // com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerEventRecordCallback
        public void onDrmInfo(TPGeneralPlayFlowParams.TPPlayerDrmParams tPPlayerDrmParams) {
            if (tPPlayerDrmParams == null) {
                C35239b.this.f75655g.m78143e("Native DrmInfo is null!");
                return;
            }
            C35239b.this.f75655g.m78141c("onDrmInfo");
            C35239b.this.f75653e.mo77634a(C35240c.m77609a(tPPlayerDrmParams));
        }
    };

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.b.b$a */
    public class a extends Handler {

        /* JADX INFO: renamed from: b */
        private WeakReference<C35239b> f75671b;

        /* JADX INFO: renamed from: a */
        private void m77601a(@TPCommonEnum.NativeErrorType int i11, int i12) {
            C35239b.this.f75653e.mo77483a(TPNativeKeyMapUtil.toTPIntValue(TPNativeKeyMap.MapErrorType.class, i11), i12, 0L, 0L);
        }

        public a(Looper looper, C35239b c35239b) {
            super(looper);
            this.f75671b = new WeakReference<>(c35239b);
        }

        /* JADX INFO: renamed from: a */
        private void m77602a(b bVar) {
            int i11 = bVar.f75672a;
            if (i11 == 1) {
                C35239b.this.m77588b();
            } else if (i11 != 2) {
                C35239b.this.m77581a(bVar);
            } else {
                C35239b.this.m77594c();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f75671b.get() == null) {
                C35239b.this.f75655g.m78143e("mWeakRef is null");
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                m77602a((b) message.obj);
                return;
            }
            if (i11 == 2) {
                m77603a((d) message.obj);
                return;
            }
            if (i11 == 3) {
                m77604a((e) message.obj);
                return;
            }
            if (i11 == 4) {
                c cVar = (c) message.obj;
                m77601a(cVar.f75676a, cVar.f75677b);
            } else {
                if (i11 == 5) {
                    m77605a((TPDetailInfo) message.obj);
                    return;
                }
                C35239b.this.f75655g.m78142d("message :" + message.what + "  not recognition");
            }
        }

        /* JADX INFO: renamed from: a */
        private void m77603a(d dVar) {
            int i11 = dVar.f75678a;
            if (i11 == 154) {
                C35239b.this.m77595d();
            } else if (i11 != 250) {
                C35239b.this.m77571a(i11, dVar);
            } else {
                C35239b.this.m77580a(dVar.f75679b, dVar.f75680c);
            }
        }

        /* JADX INFO: renamed from: a */
        private void m77604a(e eVar) {
            int i11 = eVar.f75681a;
            if (i11 != 502) {
                C35239b.this.m77572a(i11, eVar);
            } else if (eVar.f75682b instanceof String) {
                TPSubtitleData tPSubtitleData = new TPSubtitleData();
                tPSubtitleData.subtitleData = (String) eVar.f75682b;
                tPSubtitleData.trackIndex = eVar.f75683c;
                C35239b.this.f75653e.mo77487a(tPSubtitleData);
            }
        }

        /* JADX INFO: renamed from: a */
        private void m77605a(TPDetailInfo tPDetailInfo) {
            C35239b.this.f75653e.mo77633a(C35240c.m77610a(tPDetailInfo));
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.b.b$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        @TPCommonEnum.NativeMsgInfo
        int f75672a;

        /* JADX INFO: renamed from: b */
        long f75673b;

        /* JADX INFO: renamed from: c */
        int f75674c;

        /* JADX INFO: renamed from: d */
        int f75675d;
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.b.b$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        int f75676a;

        /* JADX INFO: renamed from: b */
        int f75677b;
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.b.b$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        int f75678a;

        /* JADX INFO: renamed from: b */
        long f75679b;

        /* JADX INFO: renamed from: c */
        long f75680c;
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.b.b$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        int f75681a;

        /* JADX INFO: renamed from: b */
        Object f75682b;

        /* JADX INFO: renamed from: c */
        long f75683c;

        /* JADX INFO: renamed from: d */
        long f75684d;
    }

    /* JADX INFO: renamed from: a */
    private TPProgramInfo m77567a(TPNativePlayerProgramInfo tPNativePlayerProgramInfo) {
        if (tPNativePlayerProgramInfo == null) {
            return null;
        }
        TPProgramInfo tPProgramInfo = new TPProgramInfo();
        tPProgramInfo.url = tPNativePlayerProgramInfo.url;
        tPProgramInfo.bandwidth = tPNativePlayerProgramInfo.bandwidth;
        tPProgramInfo.resolution = tPNativePlayerProgramInfo.resolution;
        tPProgramInfo.programId = tPNativePlayerProgramInfo.programId;
        tPProgramInfo.actived = tPNativePlayerProgramInfo.actived;
        return tPProgramInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m77595d() {
        this.f75653e.mo77490b();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: b */
    public long mo77458b(int i11) {
        m77570a();
        int nativeIntValue = TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapPropertyId.class, i11);
        if (nativeIntValue >= 0) {
            return this.f75650b.getPropertyLong(nativeIntValue);
        }
        this.f75655g.m78142d("paramId not found, return -1");
        return -1L;
    }

    /* JADX INFO: renamed from: a */
    private TPTrackInfo m77568a(TPMediaTrackInfo tPMediaTrackInfo) {
        TPTrackInfo tPTrackInfo = new TPTrackInfo();
        tPTrackInfo.name = tPMediaTrackInfo.trackName;
        tPTrackInfo.trackType = tPMediaTrackInfo.trackType;
        int i11 = tPMediaTrackInfo.contianerType;
        tPTrackInfo.containerType = i11;
        if (i11 == 1) {
            TPHlsTag tPHlsTag = tPTrackInfo.hlsTag;
            TPMediaTrackHlsTag tPMediaTrackHlsTag = tPMediaTrackInfo.hlsTag;
            tPHlsTag.name = tPMediaTrackHlsTag.name;
            tPHlsTag.bandwidth = tPMediaTrackHlsTag.bandwidth;
            tPHlsTag.resolution = tPMediaTrackHlsTag.resolution;
            tPHlsTag.framerate = tPMediaTrackHlsTag.framerate;
            tPHlsTag.codecs = tPMediaTrackHlsTag.codecs;
            tPHlsTag.groupId = tPMediaTrackHlsTag.groupId;
            String str = tPMediaTrackHlsTag.language;
            tPHlsTag.language = str;
            tPTrackInfo.language = str;
        } else if (i11 == 2) {
            TPDashFormat tPDashFormatM77608a = C35240c.m77608a(tPMediaTrackInfo.dashFormat);
            tPTrackInfo.dashFormat = tPDashFormatM77608a;
            tPTrackInfo.language = tPDashFormatM77608a.language;
        }
        tPTrackInfo.isExclusive = tPMediaTrackInfo.isExclusive;
        tPTrackInfo.isSelected = tPMediaTrackInfo.isSelected;
        tPTrackInfo.isInternal = tPMediaTrackInfo.isInternal;
        return tPTrackInfo;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: c */
    public TPDynamicStatisticParams mo77462c(boolean z11) {
        TPNativePlayer tPNativePlayer = this.f75650b;
        if (tPNativePlayer == null) {
            return null;
        }
        return tPNativePlayer.getDynamicStatisticParams(z11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: g */
    public void mo77465g() {
        this.f75655g.m78141c("prepare");
        m77570a();
        this.f75650b.setInitConfig(this.f75651c);
        if (this.f75650b.prepare() != 0) {
            throw new IllegalStateException("prepare failed!!");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: h */
    public void mo77466h() {
        this.f75655g.m78141c("prepareAsync");
        m77570a();
        this.f75650b.setInitConfig(this.f75651c);
        if (this.f75650b.prepareAsync() != 0) {
            throw new IllegalStateException("prepareAsync failed!!");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: i */
    public void mo77467i() {
        this.f75655g.m78141c("start");
        m77570a();
        if (this.f75650b.start() != 0) {
            throw new IllegalStateException("start failed!!");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: j */
    public void mo77468j() {
        this.f75655g.m78141c("pause");
        m77570a();
        if (this.f75650b.pause() != 0) {
            throw new IllegalStateException("pause failed!!");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: k */
    public void mo77469k() {
        this.f75655g.m78141c(InterfaceC33730j9.f70350a);
        m77570a();
        this.f75655g.m78141c("stop before");
        int iStop = this.f75650b.stop();
        this.f75655g.m78141c("stop after");
        if (iStop != 0) {
            throw new IllegalStateException("stop failed!!");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: l */
    public void mo77470l() {
        this.f75655g.m78141c("reset");
        if (this.f75650b == null) {
            this.f75655g.m78142d("reset, player has released.");
            return;
        }
        this.f75655g.m78141c("reset before");
        this.f75650b.reset();
        a aVar = this.f75652d;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
        this.f75655g.m78141c("reset after");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: m */
    public void mo77471m() {
        this.f75655g.m78141c("release");
        TPNativePlayer tPNativePlayer = this.f75650b;
        if (tPNativePlayer != null) {
            tPNativePlayer.release();
            this.f75650b = null;
        }
        InterfaceC35231a interfaceC35231a = this.f75654f;
        if (interfaceC35231a != null) {
            interfaceC35231a.mo77349a();
            this.f75654f = null;
        }
        a aVar = this.f75652d;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
            this.f75652d = null;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: n */
    public long mo77472n() {
        TPNativePlayer tPNativePlayer = this.f75650b;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getDurationMs();
        }
        this.f75655g.m78141c("player has released, return 0");
        return 0L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: o */
    public long mo77473o() {
        TPNativePlayer tPNativePlayer = this.f75650b;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getCurrentPositionMs();
        }
        this.f75655g.m78141c("player has released, return 0");
        return 0L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: p */
    public long mo77474p() {
        TPNativePlayer tPNativePlayer = this.f75650b;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getBufferedDurationMs() + this.f75650b.getCurrentPositionMs();
        }
        this.f75655g.m78141c("player has released, return 0");
        return 0L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: q */
    public int mo77475q() {
        TPNativePlayer tPNativePlayer = this.f75650b;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getVideoWidth();
        }
        this.f75655g.m78141c("player has released, return 0");
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: r */
    public int mo77476r() {
        TPNativePlayer tPNativePlayer = this.f75650b;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getVideoHeight();
        }
        this.f75655g.m78141c("player has released, return 0");
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: s */
    public TPTrackInfo[] mo77477s() {
        TPNativePlayer tPNativePlayer = this.f75650b;
        TPTrackInfo[] tPTrackInfoArr = null;
        if (tPNativePlayer == null) {
            this.f75655g.m78141c("player has released, return 0");
            return null;
        }
        TPMediaTrackInfo[] trackInfo = tPNativePlayer.getTrackInfo();
        if (trackInfo != null && trackInfo.length > 0) {
            tPTrackInfoArr = new TPTrackInfo[trackInfo.length];
            for (int i11 = 0; i11 < trackInfo.length; i11++) {
                tPTrackInfoArr[i11] = m77568a(trackInfo[i11]);
            }
        }
        return tPTrackInfoArr;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: t */
    public TPProgramInfo[] mo77478t() {
        TPNativePlayer tPNativePlayer = this.f75650b;
        TPProgramInfo[] tPProgramInfoArr = null;
        if (tPNativePlayer == null) {
            this.f75655g.m78141c("player has released, return 0");
            return null;
        }
        TPNativePlayerProgramInfo[] programInfo = tPNativePlayer.getProgramInfo();
        if (programInfo != null && programInfo.length > 0) {
            tPProgramInfoArr = new TPProgramInfo[programInfo.length];
            for (int i11 = 0; i11 < programInfo.length; i11++) {
                tPProgramInfoArr[i11] = m77567a(programInfo[i11]);
            }
        }
        return tPProgramInfoArr;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: u */
    public long[] mo77479u() {
        TPNativePlayer tPNativePlayer = this.f75650b;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getDemuxerOffsetInFile();
        }
        this.f75655g.m78141c("player has released, return -1");
        return new long[]{-1, -1};
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: v */
    public TPGeneralPlayFlowParams mo77480v() {
        TPNativePlayer tPNativePlayer = this.f75650b;
        if (tPNativePlayer == null) {
            return null;
        }
        return tPNativePlayer.getGeneralPlayFlowParams();
    }

    public C35239b(Context context, C35352b c35352b) {
        this.f75655g = new C35351a(c35352b, "TPThumbPlayer");
        TPNativePlayer tPNativePlayer = new TPNativePlayer(context);
        this.f75650b = tPNativePlayer;
        tPNativePlayer.setMessageCallback(this.f75656h);
        this.f75650b.setAudioFrameCallback(this.f75657i);
        this.f75650b.setVideoFrameCallback(this.f75658j);
        this.f75650b.setSubtitleFrameCallback(this.f75659k);
        this.f75650b.setPostProcessFrameCallback(this.f75660l);
        this.f75650b.setDemuxerCallback(this.f75661m);
        this.f75650b.setEventRecordCallback(this.f75662n);
        this.f75651c = new TPNativePlayerInitConfig();
        this.f75653e = new C35249g(this.f75655g.m78139b());
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            this.f75652d = new a(looperMyLooper, this);
            return;
        }
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            this.f75652d = new a(mainLooper, this);
        } else {
            this.f75652d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m77588b() {
        this.f75653e.mo77482a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public boolean m77597d(int i11) {
        return f75649a.contains(Integer.valueOf(i11));
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: c */
    public String mo77463c(int i11) {
        this.f75655g.m78140b("getPropertyString:".concat(String.valueOf(i11)));
        m77570a();
        try {
            int nativeIntValue = TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapPropertyId.class, i11);
            if (nativeIntValue >= 0) {
                return this.f75650b.getPropertyString(nativeIntValue);
            }
            this.f75655g.m78142d("getPropertyString, tpToNativeValue(TPNativeKeyMap.MapPropertyId.class," + i11 + "), return" + nativeIntValue);
            return "";
        } catch (IllegalArgumentException unused) {
            this.f75655g.m78142d("paramId not found, return");
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private void m77570a() {
        if (this.f75650b == null) {
            throw new IllegalStateException("player has release");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m77594c() {
        this.f75653e.mo77491c();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: b */
    public void mo77459b(float f11) {
        this.f75655g.m78141c("setPlaySpeedRatio:".concat(String.valueOf(f11)));
        TPNativePlayer tPNativePlayer = this.f75650b;
        if (tPNativePlayer == null) {
            this.f75655g.m78142d("player has released, return");
        } else {
            tPNativePlayer.setPlaybackRate(f11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77422a(float f11) {
        this.f75655g.m78141c("setAudioGainRatio:".concat(String.valueOf(f11)));
        TPNativePlayer tPNativePlayer = this.f75650b;
        if (tPNativePlayer == null) {
            this.f75655g.m78142d("player has released, return");
        } else {
            tPNativePlayer.setAudioVolume(f11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: b */
    public void mo77460b(int i11, long j11) {
        this.f75655g.m78141c("selectTrack");
        TPNativePlayer tPNativePlayer = this.f75650b;
        if (tPNativePlayer == null) {
            this.f75655g.m78142d("player has released, return");
        } else {
            tPNativePlayer.deselectTrackAsync(i11, j11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: c */
    public void mo77464c(int i11, long j11) {
        this.f75655g.m78141c("selectProgram, programIndex:".concat(String.valueOf(i11)));
        TPNativePlayer tPNativePlayer = this.f75650b;
        if (tPNativePlayer == null) {
            this.f75655g.m78142d("player has released, return");
        } else {
            tPNativePlayer.selectProgramAsync(i11, j11);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m77589b(@TPCommonEnum.TPOptionalId int i11, TPOptionalParam.OptionalParamBoolean optionalParamBoolean) {
        C35240c.a aVarConvertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i11);
        if (aVarConvertToNativeOptionalId.m77628a()) {
            this.f75655g.m78143e("player optionalIdMapping string is invalid, not found in array, id: ".concat(String.valueOf(i11)));
            return;
        }
        if (aVarConvertToNativeOptionalId.m77629b() == 3) {
            this.f75650b.setOptionLong(aVarConvertToNativeOptionalId.m77630c(), optionalParamBoolean.value ? 1L : 0L, 0L);
            return;
        }
        this.f75655g.m78143e("optionID type:" + aVarConvertToNativeOptionalId.m77629b() + " is not implement");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77423a(int i11) {
        this.f75655g.m78141c("seekTo:".concat(String.valueOf(i11)));
        m77570a();
        if (this.f75650b.seekToAsync(i11, 1, 0L) == 0) {
            return;
        }
        throw new IllegalStateException("seek to position:" + i11 + " failed!!");
    }

    /* JADX INFO: renamed from: b */
    private void m77590b(@TPCommonEnum.TPOptionalId int i11, TPOptionalParam.OptionalParamLong optionalParamLong) {
        C35240c.a aVarConvertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i11);
        if (aVarConvertToNativeOptionalId.m77628a()) {
            this.f75655g.m78143e("player optionalIdMapping long is invalid, not found in array, id: ".concat(String.valueOf(i11)));
            return;
        }
        int iM77629b = aVarConvertToNativeOptionalId.m77629b();
        if (iM77629b == 1 || iM77629b == 3 || iM77629b == 4) {
            this.f75650b.setOptionLong(aVarConvertToNativeOptionalId.m77630c(), optionalParamLong.value, optionalParamLong.param1);
            return;
        }
        this.f75655g.m78143e("optionID type:" + aVarConvertToNativeOptionalId.m77629b() + " is not implement");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77424a(int i11, @TPCommonEnum.TPSeekMode int i12) {
        this.f75655g.m78141c("seekTo:" + i11 + " mode:" + i12);
        m77570a();
        if (this.f75650b.seekToAsync(i11, TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapSeekMode.class, i12), 0L) == 0) {
            return;
        }
        throw new IllegalStateException("seek to position:" + i11 + " failed!!");
    }

    /* JADX INFO: renamed from: b */
    private void m77591b(int i11, TPOptionalParam.OptionalParamObject optionalParamObject) {
        C35240c.a aVarConvertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i11);
        if (aVarConvertToNativeOptionalId == null) {
            this.f75655g.m78143e("player optionaIdMapping object is invalid, not found in array, id: ".concat(String.valueOf(i11)));
            return;
        }
        if (aVarConvertToNativeOptionalId.m77630c() == 1001) {
            this.f75650b.setOptionObject(aVarConvertToNativeOptionalId.m77630c(), C35240c.m77626a((TPSubtitleRenderModel) optionalParamObject.objectValue));
            return;
        }
        this.f75655g.m78143e("optionID type:" + aVarConvertToNativeOptionalId.m77629b() + " is not implement");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77425a(int i11, long j11) {
        this.f75655g.m78141c("selectTrack");
        TPNativePlayer tPNativePlayer = this.f75650b;
        if (tPNativePlayer == null) {
            this.f75655g.m78142d("player has released, return");
        } else {
            tPNativePlayer.selectTrackAsync(i11, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77571a(@TPCommonEnum.NativeErrorType int i11, d dVar) {
        Class cls;
        int tPIntValue = TPNativeKeyMapUtil.toTPIntValue(TPNativeKeyMap.MapMsgInfo.class, i11);
        if (tPIntValue < 0) {
            this.f75655g.m78142d("msgType:" + i11 + ", cannot convert to thumbPlayer Info");
            return;
        }
        long tPIntValue2 = dVar.f75679b;
        long j11 = dVar.f75680c;
        if (tPIntValue != 203) {
            if (tPIntValue != 204) {
                this.f75655g.m78142d("unhandled thumbPlayerInfo=".concat(String.valueOf(tPIntValue)));
            } else {
                cls = TPNativeKeyMap.MapVideoDecoderType.class;
            }
            this.f75653e.mo77484a(tPIntValue, tPIntValue2, j11, (Object) null);
        }
        cls = TPNativeKeyMap.MapAudioDecoderType.class;
        tPIntValue2 = TPNativeKeyMapUtil.toTPIntValue(cls, (int) tPIntValue2);
        this.f75653e.mo77484a(tPIntValue, tPIntValue2, j11, (Object) null);
    }

    /* JADX INFO: renamed from: b */
    private void m77592b(@TPCommonEnum.TPOptionalId int i11, TPOptionalParam.OptionalParamString optionalParamString) {
        C35240c.a aVarConvertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i11);
        if (aVarConvertToNativeOptionalId.m77628a()) {
            this.f75655g.m78143e("player optionalIdMapping string is invalid, not found in array, id: ".concat(String.valueOf(i11)));
            return;
        }
        if (aVarConvertToNativeOptionalId.m77629b() == 2) {
            this.f75650b.setOptionObject(aVarConvertToNativeOptionalId.m77630c(), optionalParamString.value);
            return;
        }
        this.f75655g.m78143e("optionID type:" + aVarConvertToNativeOptionalId.m77629b() + " is not implement");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77572a(@TPCommonEnum.NativeMsgInfo int i11, e eVar) {
        Object objM77613a;
        int tPIntValue = TPNativeKeyMapUtil.toTPIntValue(TPNativeKeyMap.MapMsgInfo.class, i11);
        if (tPIntValue < 0 || (objM77613a = eVar.f75682b) == null) {
            this.f75655g.m78142d("msgType:" + i11 + ", cannot convert to thumbPlayer Info");
            return;
        }
        switch (tPIntValue) {
            case 500:
                objM77613a = C35240c.m77613a((ITPNativePlayerMessageCallback.VideoCropInfo) objM77613a);
                break;
            case 502:
                objM77613a = C35240c.m77611a((ITPNativePlayerMessageCallback.MediaCodecInfo) objM77613a);
                break;
            case 503:
                objM77613a = C35240c.m77614a((ITPNativePlayerMessageCallback.VideoSeiInfo) objM77613a);
                break;
            case 505:
                objM77613a = C35240c.m77612a((ITPNativePlayerMessageCallback.MediaDrmInfo) objM77613a);
                break;
            case 506:
                objM77613a = (String) objM77613a;
                this.f75655g.m78140b("TP_PLAYER_INFO_OBJECT_SUBTITLE_NOTE:".concat(String.valueOf(objM77613a)));
                break;
        }
        this.f75653e.mo77484a(tPIntValue, 0L, 0L, objM77613a);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: b */
    public void mo77461b(boolean z11) {
        this.f75655g.m78141c("setLoopback:".concat(String.valueOf(z11)));
        TPNativePlayer tPNativePlayer = this.f75650b;
        if (tPNativePlayer == null) {
            this.f75655g.m78142d("player has released, return");
        } else {
            tPNativePlayer.setLoopback(z11, 0L, -1L);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m77573a(@TPCommonEnum.TPOptionalId int i11, TPOptionalParam.OptionalParamBoolean optionalParamBoolean) {
        C35240c.a aVarConvertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i11);
        if (aVarConvertToNativeOptionalId.m77628a()) {
            this.f75655g.m78143e("player optionalIdMapping boolean is invalid, not found in array, id: ".concat(String.valueOf(i11)));
            return;
        }
        if (aVarConvertToNativeOptionalId.m77629b() == 3) {
            this.f75651c.setBool(aVarConvertToNativeOptionalId.m77630c(), optionalParamBoolean.value);
            return;
        }
        this.f75655g.m78143e("optionID type:" + aVarConvertToNativeOptionalId.m77629b() + " is not implement");
    }

    /* JADX INFO: renamed from: a */
    private void m77574a(@TPCommonEnum.TPOptionalId int i11, TPOptionalParam.OptionalParamFloat optionalParamFloat) {
        C35240c.a aVarConvertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i11);
        if (aVarConvertToNativeOptionalId.m77628a()) {
            this.f75655g.m78143e("player optionalIdMapping float is invalid, not found in array, id: ".concat(String.valueOf(i11)));
            return;
        }
        if (7 == aVarConvertToNativeOptionalId.m77629b()) {
            this.f75651c.setFloat(aVarConvertToNativeOptionalId.m77630c(), optionalParamFloat.value);
            return;
        }
        this.f75655g.m78143e("optionID:" + aVarConvertToNativeOptionalId.m77630c() + " is not float");
    }

    /* JADX INFO: renamed from: a */
    private void m77575a(@TPCommonEnum.TPOptionalId int i11, TPOptionalParam.OptionalParamLong optionalParamLong) {
        C35240c.a aVarConvertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i11);
        if (aVarConvertToNativeOptionalId.m77628a()) {
            this.f75655g.m78143e("player optionalIdMapping long is invalid, not found in array, id: ".concat(String.valueOf(i11)));
            return;
        }
        int iM77629b = aVarConvertToNativeOptionalId.m77629b();
        if (iM77629b == 1) {
            this.f75651c.setLong(aVarConvertToNativeOptionalId.m77630c(), optionalParamLong.value);
            return;
        }
        if (iM77629b == 3) {
            this.f75651c.setBool(aVarConvertToNativeOptionalId.m77630c(), optionalParamLong.value > 0);
            return;
        }
        if (iM77629b == 4) {
            this.f75651c.setInt(aVarConvertToNativeOptionalId.m77630c(), (int) optionalParamLong.value);
            return;
        }
        this.f75655g.m78143e("optionID type:" + aVarConvertToNativeOptionalId.m77629b() + " is not implement");
    }

    /* JADX INFO: renamed from: a */
    private void m77576a(@TPCommonEnum.TPOptionalId int i11, TPOptionalParam.OptionalParamObject optionalParamObject) {
        C35240c.a aVarConvertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i11);
        if (aVarConvertToNativeOptionalId == null) {
            this.f75655g.m78143e("convertToNativeOptionalId failed, key: ".concat(String.valueOf(i11)));
            return;
        }
        if (aVarConvertToNativeOptionalId.m77628a()) {
            this.f75655g.m78143e("player optionalIdMapping object is invalid, not found in array, id: ".concat(String.valueOf(i11)));
            return;
        }
        int iM77630c = aVarConvertToNativeOptionalId.m77630c();
        if (iM77630c == 126) {
            this.f75651c.setObject(aVarConvertToNativeOptionalId.m77630c(), C35240c.m77624a((TPJitterBufferConfig) optionalParamObject.objectValue));
        } else {
            if (iM77630c == 414) {
                this.f75651c.setObject(aVarConvertToNativeOptionalId.m77630c(), C35240c.m77622a((TPAudioAttributes) optionalParamObject.objectValue));
                return;
            }
            this.f75655g.m78143e("optionID type:" + aVarConvertToNativeOptionalId.m77629b() + " is not implement");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m77577a(@TPCommonEnum.TPOptionalId int i11, TPOptionalParam.OptionalParamQueueInt optionalParamQueueInt) {
        C35240c.a aVarConvertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i11);
        if (aVarConvertToNativeOptionalId.m77628a()) {
            this.f75655g.m78143e("player optionalIdMapping queue_int is invalid, not found in array, id: ".concat(String.valueOf(i11)));
            return;
        }
        int[] iArr = optionalParamQueueInt.queueValue;
        if (iArr == null || iArr.length == 0) {
            this.f75655g.m78143e("queueint params is empty in".concat(String.valueOf(i11)));
            return;
        }
        if (aVarConvertToNativeOptionalId.m77629b() == 5) {
            for (int i12 = 0; i12 < optionalParamQueueInt.queueValue.length; i12++) {
                this.f75651c.addQueueInt(aVarConvertToNativeOptionalId.m77630c(), optionalParamQueueInt.queueValue[i12]);
            }
            return;
        }
        this.f75655g.m78143e("optionID type:" + aVarConvertToNativeOptionalId.m77629b() + " is not implement");
    }

    /* JADX INFO: renamed from: a */
    private void m77578a(@TPCommonEnum.TPOptionalId int i11, TPOptionalParam.OptionalParamQueueString optionalParamQueueString) {
        C35240c.a aVarConvertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i11);
        if (aVarConvertToNativeOptionalId.m77628a()) {
            this.f75655g.m78143e("player optionalIdMapping queue_string is invalid, not found in array, id: ".concat(String.valueOf(i11)));
            return;
        }
        String[] strArr = optionalParamQueueString.queueValue;
        if (strArr == null || strArr.length == 0) {
            this.f75655g.m78143e("queue String params is empty in".concat(String.valueOf(i11)));
            return;
        }
        if (aVarConvertToNativeOptionalId.m77629b() == 6) {
            for (int i12 = 0; i12 < optionalParamQueueString.queueValue.length; i12++) {
                this.f75651c.addQueueString(aVarConvertToNativeOptionalId.m77630c(), optionalParamQueueString.queueValue[i12]);
            }
            return;
        }
        this.f75655g.m78143e("optionID type:" + aVarConvertToNativeOptionalId.m77629b() + " is not implement");
    }

    /* JADX INFO: renamed from: a */
    private void m77579a(int i11, TPOptionalParam.OptionalParamString optionalParamString) {
        C35240c.a aVarConvertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i11);
        if (aVarConvertToNativeOptionalId.m77628a()) {
            this.f75655g.m78143e("player optionalIdMapping string is invalid, not found in array, id: ".concat(String.valueOf(i11)));
            return;
        }
        if (2 == aVarConvertToNativeOptionalId.m77629b()) {
            this.f75651c.setString(aVarConvertToNativeOptionalId.m77630c(), optionalParamString.value);
            return;
        }
        this.f75655g.m78143e("optionID:" + aVarConvertToNativeOptionalId.m77630c() + " is not string");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77580a(long j11, long j12) {
        this.f75653e.mo77485a(j11, j12);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77426a(AssetFileDescriptor assetFileDescriptor) throws IOException {
        if (assetFileDescriptor == null) {
            throw new IllegalStateException("setDataSource url afd is null!!");
        }
        int iDetachFd = assetFileDescriptor.getParcelFileDescriptor().detachFd();
        long startOffset = assetFileDescriptor.getStartOffset();
        long length = assetFileDescriptor.getLength();
        ParcelFileDescriptor parcelFileDescriptorFromFd = ParcelFileDescriptor.fromFd(iDetachFd);
        int iDetachFd2 = parcelFileDescriptorFromFd.detachFd();
        parcelFileDescriptorFromFd.close();
        assetFileDescriptor.close();
        this.f75655g.m78141c("setDataSource: " + assetFileDescriptor + ", playFd: " + iDetachFd + ", offset: " + startOffset + ", length: " + length + ", captureFd: " + iDetachFd2);
        m77570a();
        if (this.f75650b.setDataSource(iDetachFd, startOffset, length) != 0) {
            throw new IllegalStateException("setDataSource url afd failed!!");
        }
        this.f75654f = new C35229d(iDetachFd2, startOffset, length);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77427a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        if (parcelFileDescriptor == null) {
            throw new IllegalStateException("setDataSource url pfd is null!!");
        }
        int iDetachFd = parcelFileDescriptor.detachFd();
        ParcelFileDescriptor parcelFileDescriptorFromFd = ParcelFileDescriptor.fromFd(iDetachFd);
        int iDetachFd2 = parcelFileDescriptorFromFd.detachFd();
        parcelFileDescriptorFromFd.close();
        parcelFileDescriptor.close();
        this.f75655g.m78141c("setDataSource: " + parcelFileDescriptor + ", playFd:" + iDetachFd + ", captureFd: " + iDetachFd2);
        m77570a();
        if (this.f75650b.setDataSource(iDetachFd, 0L, 0L) != 0) {
            throw new IllegalStateException("setDataSource url pfd failed!!");
        }
        this.f75654f = new C35229d(iDetachFd2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77428a(Surface surface) {
        C35351a c35351a = this.f75655g;
        StringBuilder sb2 = new StringBuilder("setSurface, surface is null ? : ");
        sb2.append(surface == null);
        c35351a.m78141c(sb2.toString());
        TPNativePlayer tPNativePlayer = this.f75650b;
        if (tPNativePlayer == null) {
            this.f75655g.m78142d("player has released, return");
        } else if (tPNativePlayer.setVideoSurface(surface) != 0) {
            throw new IllegalStateException("setSurface failed!!");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77429a(SurfaceHolder surfaceHolder) {
        C35351a c35351a = this.f75655g;
        StringBuilder sb2 = new StringBuilder("SurfaceHolder, surfaceHolder is null ? : ");
        sb2.append(surfaceHolder == null);
        c35351a.m78141c(sb2.toString());
        if (this.f75650b == null) {
            this.f75655g.m78142d("player has released, return");
        } else if (surfaceHolder != null && surfaceHolder.getSurface() == null) {
            this.f75655g.m78143e("SurfaceHolder，err.");
        } else {
            if (this.f75650b.setVideoSurface(surfaceHolder == null ? null : surfaceHolder.getSurface()) != 0) {
                throw new IllegalStateException("setSurface failed!!");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77581a(b bVar) {
        this.f75653e.mo77484a(TPNativeKeyMapUtil.toTPIntValue(TPNativeKeyMap.MapMsgInfo.class, bVar.f75672a), bVar.f75674c, bVar.f75675d, Long.valueOf(bVar.f75673b));
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77430a(C35241c.a aVar) {
        this.f75653e.m77781a(aVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77431a(C35241c.b bVar) {
        this.f75653e.m77782a(bVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77432a(C35241c.c cVar) {
        this.f75653e.m77783a(cVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77433a(C35241c.d dVar) {
        this.f75653e.m77784a(dVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77434a(C35241c.e eVar) {
        this.f75653e.m77785a(eVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77435a(C35241c.f fVar) {
        this.f75653e.m77786a(fVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77436a(C35241c.g gVar) {
        this.f75653e.m77787a(gVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77437a(C35241c.h hVar) {
        this.f75653e.m77788a(hVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77438a(C35241c.i iVar) {
        this.f75653e.m77789a(iVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77439a(C35241c.j jVar) {
        this.f75653e.m77790a(jVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77440a(C35241c.l lVar) {
        this.f75653e.m77792a(lVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77441a(C35241c.m mVar) {
        this.f75653e.m77793a(mVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77442a(C35241c.n nVar) {
        this.f75653e.m77794a(nVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77443a(C35241c.o oVar) {
        this.f75653e.m77795a(oVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77444a(C35241c.p pVar) {
        this.f75653e.m77796a(pVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77445a(TPCaptureParams tPCaptureParams, TPCaptureCallBack tPCaptureCallBack) {
        this.f75655g.m78141c("captureVideo, params".concat(String.valueOf(tPCaptureParams)));
        if (this.f75654f == null) {
            tPCaptureCallBack.onCaptureVideoFailed(TPGeneralError.UNMATCHED_STATE);
            return;
        }
        TPImageGeneratorParams tPImageGeneratorParams = new TPImageGeneratorParams();
        tPImageGeneratorParams.width = tPCaptureParams.width;
        tPImageGeneratorParams.height = tPCaptureParams.height;
        tPImageGeneratorParams.format = tPCaptureParams.format;
        tPImageGeneratorParams.requestedTimeMsToleranceAfter = tPCaptureParams.requestedTimeMsToleranceAfter;
        tPImageGeneratorParams.requestedTimeMsToleranceBefore = tPCaptureParams.requestedTimeMsToleranceBefore;
        this.f75654f.mo77350a(mo77473o(), tPImageGeneratorParams, tPCaptureCallBack);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77446a(TPOptionalParam tPOptionalParam) {
        if (this.f75650b == null) {
            this.f75655g.m78142d("player has released, return");
            return;
        }
        if (tPOptionalParam.getParamType() == 1) {
            if (tPOptionalParam.getKey() < 500) {
                m77573a(tPOptionalParam.getKey(), tPOptionalParam.getParamBoolean());
                return;
            } else {
                m77589b(tPOptionalParam.getKey(), tPOptionalParam.getParamBoolean());
                return;
            }
        }
        if (tPOptionalParam.getParamType() == 2) {
            if (tPOptionalParam.getKey() < 500) {
                m77575a(tPOptionalParam.getKey(), tPOptionalParam.getParamLong());
                return;
            } else {
                m77590b(tPOptionalParam.getKey(), tPOptionalParam.getParamLong());
                return;
            }
        }
        if (tPOptionalParam.getParamType() == 6) {
            if (tPOptionalParam.getKey() < 500) {
                m77574a(tPOptionalParam.getKey(), tPOptionalParam.getParamFloat());
                return;
            }
            return;
        }
        if (tPOptionalParam.getParamType() == 3) {
            if (tPOptionalParam.getKey() < 500) {
                m77579a(tPOptionalParam.getKey(), tPOptionalParam.getParamString());
                return;
            } else {
                m77592b(tPOptionalParam.getKey(), tPOptionalParam.getParamString());
                return;
            }
        }
        if (tPOptionalParam.getParamType() == 4) {
            if (tPOptionalParam.getKey() < 500) {
                m77577a(tPOptionalParam.getKey(), tPOptionalParam.getParamQueueInt());
            }
        } else if (tPOptionalParam.getParamType() == 5) {
            if (tPOptionalParam.getKey() < 500) {
                m77578a(tPOptionalParam.getKey(), tPOptionalParam.getParamQueueString());
            }
        } else if (tPOptionalParam.getParamType() == 7) {
            if (tPOptionalParam.getKey() < 500) {
                m77576a(tPOptionalParam.getKey(), tPOptionalParam.getParamObject());
            } else {
                m77591b(tPOptionalParam.getKey(), tPOptionalParam.getParamObject());
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77447a(ITPMediaAsset iTPMediaAsset) {
        this.f75655g.m78141c("setDataSource: ".concat(String.valueOf(iTPMediaAsset)));
        m77570a();
        if (iTPMediaAsset == null) {
            throw new IllegalStateException("media asset is null!");
        }
        String url = iTPMediaAsset.getUrl();
        Map<String, String> httpHeader = iTPMediaAsset.getHttpHeader();
        if ((httpHeader == null ? this.f75650b.setDataSource(url) : this.f75650b.setDataSource(url, httpHeader)) != 0) {
            throw new IllegalStateException("setDataSource mediaAsset failed!!");
        }
        this.f75654f = new C35229d(url);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77448a(ITPMediaAsset iTPMediaAsset, @TPCommonEnum.TPSwitchDefMode int i11, long j11) {
        this.f75655g.m78141c("switchDefinition mediaAsset:" + iTPMediaAsset + " opaque:" + j11);
        m77570a();
        if (iTPMediaAsset != null) {
            int nativeIntValue = TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapSwitchDefMode.class, i11);
            Map<String, String> httpHeader = iTPMediaAsset.getHttpHeader();
            if ((httpHeader == null ? this.f75650b.switchDefinitionAsync(iTPMediaAsset.getUrl(), nativeIntValue, j11) : this.f75650b.switchDefinitionAsync(iTPMediaAsset.getUrl(), httpHeader, nativeIntValue, j11)) != 0) {
                throw new IllegalStateException("switchDefinition in invalid state");
            }
            this.f75654f = new C35229d(iTPMediaAsset.getUrl());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77449a(C35352b c35352b) {
        this.f75655g.m78136a(new C35352b(c35352b, "TPThumbPlayer"));
        if (c35352b != null) {
            this.f75653e.m77797a(this.f75655g.m78135a().m78145a());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77450a(String str) {
        this.f75655g.m78141c("setAudioNormalizeVolumeParams:".concat(String.valueOf(str)));
        TPNativePlayer tPNativePlayer = this.f75650b;
        if (tPNativePlayer == null) {
            this.f75655g.m78142d("player has released, return");
        } else {
            tPNativePlayer.setAudioNormalizeVolumeParams(str);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77451a(String str, @TPCommonEnum.TPSwitchDefMode int i11, long j11) {
        this.f75655g.m78141c("switchDefinition url:" + str + " opaque:" + j11);
        m77570a();
        if (this.f75650b.switchDefinitionAsync(str, TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapSwitchDefMode.class, i11), j11) != 0) {
            throw new IllegalStateException("switchDefinition in invalid state");
        }
        InterfaceC35231a interfaceC35231a = this.f75654f;
        if (interfaceC35231a != null) {
            interfaceC35231a.mo77349a();
            this.f75654f = null;
        }
        this.f75654f = new C35229d(str);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77452a(String str, Map<String, String> map) {
        this.f75655g.m78141c("setDataSource: ".concat(String.valueOf(str)));
        m77570a();
        if (this.f75650b.setDataSource(str, map) != 0) {
            throw new IllegalStateException("setDataSource url and header failed!!");
        }
        this.f75654f = new C35229d(str);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77453a(String str, Map<String, String> map, @TPCommonEnum.TPSwitchDefMode int i11, long j11) {
        this.f75655g.m78141c("switchDefinition url:" + str + "httpHeader:" + map + " opaque:" + j11);
        m77570a();
        if (this.f75650b.switchDefinitionAsync(str, map, TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapSwitchDefMode.class, i11), j11) != 0) {
            throw new IllegalStateException("switchDefinition in invalid state");
        }
        InterfaceC35231a interfaceC35231a = this.f75654f;
        if (interfaceC35231a != null) {
            interfaceC35231a.mo77349a();
            this.f75654f = null;
        }
        this.f75654f = new C35229d(str);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77454a(String str, Map<String, String> map, String str2, String str3) {
        this.f75655g.m78141c("addSubtitleSource");
        TPNativePlayer tPNativePlayer = this.f75650b;
        if (tPNativePlayer == null) {
            this.f75655g.m78142d("player has released, return");
        } else {
            tPNativePlayer.addSubtitleTrackSource(str, str3, map);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77455a(String str, Map<String, String> map, String str2, List<TPOptionalParam> list) {
        this.f75655g.m78141c("addAudioTrackSource");
        if (this.f75650b == null) {
            this.f75655g.m78142d("player has released, return");
            return;
        }
        TPPlayerMsg.TPAudioTrackInfo tPAudioTrackInfo = new TPPlayerMsg.TPAudioTrackInfo();
        tPAudioTrackInfo.audioTrackUrl = str;
        tPAudioTrackInfo.paramData = list;
        C35249g c35249g = this.f75653e;
        if (c35249g != null) {
            c35249g.mo77484a(1012, 0L, 0L, tPAudioTrackInfo);
        }
        if (TextUtils.isEmpty(tPAudioTrackInfo.proxyUrl)) {
            this.f75650b.addAudioTrackSource(tPAudioTrackInfo.audioTrackUrl, str2, tPAudioTrackInfo.httpHeader);
        } else {
            this.f75650b.addAudioTrackSource(tPAudioTrackInfo.proxyUrl, str2, tPAudioTrackInfo.httpHeader);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77456a(boolean z11) {
        this.f75655g.m78141c("setOutputMute:".concat(String.valueOf(z11)));
        TPNativePlayer tPNativePlayer = this.f75650b;
        if (tPNativePlayer == null) {
            this.f75655g.m78142d("player has released, return");
        } else {
            tPNativePlayer.setAudioMute(z11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77457a(boolean z11, long j11, long j12) {
        this.f75655g.m78141c("setLoopback:" + z11 + " loopStartPositionMs:" + j11 + " loopEndPositionMs:" + j12);
        TPNativePlayer tPNativePlayer = this.f75650b;
        if (tPNativePlayer == null) {
            this.f75655g.m78142d("player has released, return");
        } else if (tPNativePlayer.setLoopback(z11, j11, j12) != 0) {
            throw new IllegalStateException("set loopback failed!!");
        }
    }
}
