package com.tencent.thumbplayer.tcmedia.tplayer;

import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.api.ITPPlayer;
import com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener;
import com.tencent.thumbplayer.tcmedia.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerDetailInfo;
import com.tencent.thumbplayer.tcmedia.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPRemoteSdpInfo;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPVideoFrameBuffer;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.c */
/* JADX INFO: loaded from: classes64.dex */
public class C35412c implements ITPPlayerListener.IOnAudioFrameOutputListener, ITPPlayerListener.IOnAudioProcessFrameOutputListener, ITPPlayerListener.IOnCompletionListener, ITPPlayerListener.IOnDemuxerListener, ITPPlayerListener.IOnDetailInfoListener, ITPPlayerListener.IOnErrorListener, ITPPlayerListener.IOnInfoListener, ITPPlayerListener.IOnPreparedListener, ITPPlayerListener.IOnSeekCompleteListener, ITPPlayerListener.IOnStateChangeListener, ITPPlayerListener.IOnStopAsyncCompleteListener, ITPPlayerListener.IOnSubtitleDataListener, ITPPlayerListener.IOnSubtitleFrameOutListener, ITPPlayerListener.IOnVideoFrameOutListener, ITPPlayerListener.IOnVideoProcessFrameOutputListener, ITPPlayerListener.IOnVideoSizeChangedListener {

    /* JADX INFO: renamed from: a */
    private ITPPlayerListener.IOnPreparedListener f76465a;

    /* JADX INFO: renamed from: b */
    private ITPPlayerListener.IOnCompletionListener f76466b;

    /* JADX INFO: renamed from: c */
    private ITPPlayerListener.IOnInfoListener f76467c;

    /* JADX INFO: renamed from: d */
    private ITPPlayerListener.IOnErrorListener f76468d;

    /* JADX INFO: renamed from: e */
    private ITPPlayerListener.IOnSeekCompleteListener f76469e;

    /* JADX INFO: renamed from: f */
    private ITPPlayerListener.IOnVideoSizeChangedListener f76470f;

    /* JADX INFO: renamed from: g */
    private ITPPlayerListener.IOnSubtitleDataListener f76471g;

    /* JADX INFO: renamed from: h */
    private ITPPlayerListener.IOnSubtitleFrameOutListener f76472h;

    /* JADX INFO: renamed from: i */
    private ITPPlayerListener.IOnVideoFrameOutListener f76473i;

    /* JADX INFO: renamed from: j */
    private ITPPlayerListener.IOnAudioFrameOutputListener f76474j;

    /* JADX INFO: renamed from: k */
    private ITPPlayerListener.IOnVideoProcessFrameOutputListener f76475k;

    /* JADX INFO: renamed from: l */
    private ITPPlayerListener.IOnAudioProcessFrameOutputListener f76476l;

    /* JADX INFO: renamed from: m */
    private ITPPlayerListener.IOnStateChangeListener f76477m;

    /* JADX INFO: renamed from: n */
    private ITPPlayerListener.IOnStopAsyncCompleteListener f76478n;

    /* JADX INFO: renamed from: o */
    private ITPPlayerListener.IOnDetailInfoListener f76479o;

    /* JADX INFO: renamed from: p */
    private ITPPlayerListener.IOnDemuxerListener f76480p;

    /* JADX INFO: renamed from: q */
    private a f76481q;

    /* JADX INFO: renamed from: r */
    private String f76482r = "TPPlayerListenerS";

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.c$a */
    public static class a implements ITPPlayerListener.IOnAudioFrameOutputListener, ITPPlayerListener.IOnAudioProcessFrameOutputListener, ITPPlayerListener.IOnCompletionListener, ITPPlayerListener.IOnDemuxerListener, ITPPlayerListener.IOnDetailInfoListener, ITPPlayerListener.IOnErrorListener, ITPPlayerListener.IOnInfoListener, ITPPlayerListener.IOnPreparedListener, ITPPlayerListener.IOnSeekCompleteListener, ITPPlayerListener.IOnStateChangeListener, ITPPlayerListener.IOnStopAsyncCompleteListener, ITPPlayerListener.IOnSubtitleDataListener, ITPPlayerListener.IOnSubtitleFrameOutListener, ITPPlayerListener.IOnVideoFrameOutListener, ITPPlayerListener.IOnVideoProcessFrameOutputListener, ITPPlayerListener.IOnVideoSizeChangedListener {

        /* JADX INFO: renamed from: a */
        private String f76483a;

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnAudioProcessFrameOutputListener
        public TPPostProcessFrameBuffer onAudioProcessFrameOut(ITPPlayer iTPPlayer, TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            return null;
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnDemuxerListener
        public TPRemoteSdpInfo onSdpExchange(ITPPlayer iTPPlayer, String str, int i11) {
            return null;
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnVideoProcessFrameOutputListener
        public TPPostProcessFrameBuffer onVideoProcessFrameOut(ITPPlayer iTPPlayer, TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            return null;
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnSeekCompleteListener
        public void onSeekComplete(ITPPlayer iTPPlayer) {
            TPLogUtil.m78800i(this.f76483a, " empty player listener , notify , onSeekComplete");
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnSubtitleDataListener
        public void onSubtitleData(ITPPlayer iTPPlayer, TPSubtitleData tPSubtitleData) {
            TPLogUtil.m78800i(this.f76483a, " empty player listener , notify , onSubtitleData");
        }

        public a(String str) {
            this.f76483a = str;
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnErrorListener
        public void onError(ITPPlayer iTPPlayer, int i11, int i12, long j11, long j12) {
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnInfoListener
        public void onInfo(ITPPlayer iTPPlayer, int i11, long j11, long j12, Object obj) {
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnVideoSizeChangedListener
        public void onVideoSizeChanged(ITPPlayer iTPPlayer, long j11, long j12) {
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnAudioFrameOutputListener
        public void onAudioFrameOut(ITPPlayer iTPPlayer, TPAudioFrameBuffer tPAudioFrameBuffer) {
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnDetailInfoListener
        public void onDetailInfo(ITPPlayer iTPPlayer, TPPlayerDetailInfo tPPlayerDetailInfo) {
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnStateChangeListener
        public void onStateChange(int i11, int i12) {
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnSubtitleFrameOutListener
        public void onSubtitleFrameOut(ITPPlayer iTPPlayer, TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnVideoFrameOutListener
        public void onVideoFrameOut(ITPPlayer iTPPlayer, TPVideoFrameBuffer tPVideoFrameBuffer) {
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnCompletionListener
        public void onCompletion(ITPPlayer iTPPlayer) {
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnPreparedListener
        public void onPrepared(ITPPlayer iTPPlayer) {
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnStopAsyncCompleteListener
        public void onStopAsyncComplete(ITPPlayer iTPPlayer) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m78669a() {
        a aVar = this.f76481q;
        this.f76465a = aVar;
        this.f76466b = aVar;
        this.f76467c = aVar;
        this.f76468d = aVar;
        this.f76469e = aVar;
        this.f76470f = aVar;
        this.f76471g = aVar;
        this.f76473i = aVar;
        this.f76474j = aVar;
        this.f76477m = aVar;
        this.f76478n = aVar;
        this.f76479o = aVar;
        this.f76480p = aVar;
    }

    /* JADX INFO: renamed from: a */
    public void m78670a(ITPPlayerListener.IOnAudioFrameOutputListener iOnAudioFrameOutputListener) {
        if (iOnAudioFrameOutputListener == null) {
            iOnAudioFrameOutputListener = this.f76481q;
        }
        this.f76474j = iOnAudioFrameOutputListener;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnAudioFrameOutputListener
    public void onAudioFrameOut(ITPPlayer iTPPlayer, TPAudioFrameBuffer tPAudioFrameBuffer) {
        this.f76474j.onAudioFrameOut(iTPPlayer, tPAudioFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnAudioProcessFrameOutputListener
    public TPPostProcessFrameBuffer onAudioProcessFrameOut(ITPPlayer iTPPlayer, TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        return this.f76476l.onAudioProcessFrameOut(iTPPlayer, tPPostProcessFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnCompletionListener
    public void onCompletion(ITPPlayer iTPPlayer) {
        this.f76466b.onCompletion(iTPPlayer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnDetailInfoListener
    public void onDetailInfo(ITPPlayer iTPPlayer, TPPlayerDetailInfo tPPlayerDetailInfo) {
        this.f76479o.onDetailInfo(iTPPlayer, tPPlayerDetailInfo);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnErrorListener
    public void onError(ITPPlayer iTPPlayer, int i11, int i12, long j11, long j12) {
        this.f76468d.onError(iTPPlayer, i11, i12, j11, j12);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnInfoListener
    public void onInfo(ITPPlayer iTPPlayer, int i11, long j11, long j12, Object obj) {
        this.f76467c.onInfo(iTPPlayer, i11, j11, j12, obj);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnPreparedListener
    public void onPrepared(ITPPlayer iTPPlayer) {
        this.f76465a.onPrepared(iTPPlayer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnDemuxerListener
    public TPRemoteSdpInfo onSdpExchange(ITPPlayer iTPPlayer, String str, int i11) {
        return this.f76480p.onSdpExchange(iTPPlayer, str, i11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnSeekCompleteListener
    public void onSeekComplete(ITPPlayer iTPPlayer) {
        this.f76469e.onSeekComplete(iTPPlayer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnStateChangeListener
    public void onStateChange(int i11, int i12) {
        this.f76477m.onStateChange(i11, i12);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnStopAsyncCompleteListener
    public void onStopAsyncComplete(ITPPlayer iTPPlayer) {
        this.f76478n.onStopAsyncComplete(iTPPlayer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnSubtitleDataListener
    public void onSubtitleData(ITPPlayer iTPPlayer, TPSubtitleData tPSubtitleData) {
        this.f76471g.onSubtitleData(iTPPlayer, tPSubtitleData);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnSubtitleFrameOutListener
    public void onSubtitleFrameOut(ITPPlayer iTPPlayer, TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
        this.f76472h.onSubtitleFrameOut(iTPPlayer, tPSubtitleFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnVideoFrameOutListener
    public void onVideoFrameOut(ITPPlayer iTPPlayer, TPVideoFrameBuffer tPVideoFrameBuffer) {
        this.f76473i.onVideoFrameOut(iTPPlayer, tPVideoFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnVideoProcessFrameOutputListener
    public TPPostProcessFrameBuffer onVideoProcessFrameOut(ITPPlayer iTPPlayer, TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        return this.f76475k.onVideoProcessFrameOut(iTPPlayer, tPPostProcessFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnVideoSizeChangedListener
    public void onVideoSizeChanged(ITPPlayer iTPPlayer, long j11, long j12) {
        this.f76470f.onVideoSizeChanged(iTPPlayer, j11, j12);
    }

    public C35412c(String str) {
        m78686a(str);
        a aVar = new a(this.f76482r);
        this.f76481q = aVar;
        this.f76465a = aVar;
        this.f76466b = aVar;
        this.f76467c = aVar;
        this.f76468d = aVar;
        this.f76469e = aVar;
        this.f76470f = aVar;
        this.f76471g = aVar;
        this.f76472h = aVar;
        this.f76473i = aVar;
        this.f76474j = aVar;
        this.f76475k = aVar;
        this.f76476l = aVar;
        this.f76477m = aVar;
        this.f76478n = aVar;
        this.f76479o = aVar;
        this.f76480p = aVar;
    }

    /* JADX INFO: renamed from: a */
    public void m78671a(ITPPlayerListener.IOnAudioProcessFrameOutputListener iOnAudioProcessFrameOutputListener) {
        if (iOnAudioProcessFrameOutputListener == null) {
            iOnAudioProcessFrameOutputListener = this.f76481q;
        }
        this.f76476l = iOnAudioProcessFrameOutputListener;
    }

    /* JADX INFO: renamed from: a */
    public void m78672a(ITPPlayerListener.IOnCompletionListener iOnCompletionListener) {
        if (iOnCompletionListener == null) {
            iOnCompletionListener = this.f76481q;
        }
        this.f76466b = iOnCompletionListener;
    }

    /* JADX INFO: renamed from: a */
    public void m78673a(ITPPlayerListener.IOnDemuxerListener iOnDemuxerListener) {
        if (iOnDemuxerListener == null) {
            iOnDemuxerListener = this.f76481q;
        }
        this.f76480p = iOnDemuxerListener;
    }

    /* JADX INFO: renamed from: a */
    public void m78674a(ITPPlayerListener.IOnDetailInfoListener iOnDetailInfoListener) {
        if (iOnDetailInfoListener == null) {
            iOnDetailInfoListener = this.f76481q;
        }
        this.f76479o = iOnDetailInfoListener;
    }

    /* JADX INFO: renamed from: a */
    public void m78675a(ITPPlayerListener.IOnErrorListener iOnErrorListener) {
        if (iOnErrorListener == null) {
            iOnErrorListener = this.f76481q;
        }
        this.f76468d = iOnErrorListener;
    }

    /* JADX INFO: renamed from: a */
    public void m78676a(ITPPlayerListener.IOnInfoListener iOnInfoListener) {
        if (iOnInfoListener == null) {
            iOnInfoListener = this.f76481q;
        }
        this.f76467c = iOnInfoListener;
    }

    /* JADX INFO: renamed from: a */
    public void m78677a(ITPPlayerListener.IOnPreparedListener iOnPreparedListener) {
        if (iOnPreparedListener == null) {
            iOnPreparedListener = this.f76481q;
        }
        this.f76465a = iOnPreparedListener;
    }

    /* JADX INFO: renamed from: a */
    public void m78678a(ITPPlayerListener.IOnSeekCompleteListener iOnSeekCompleteListener) {
        if (iOnSeekCompleteListener == null) {
            iOnSeekCompleteListener = this.f76481q;
        }
        this.f76469e = iOnSeekCompleteListener;
    }

    /* JADX INFO: renamed from: a */
    public void m78679a(ITPPlayerListener.IOnStateChangeListener iOnStateChangeListener) {
        if (iOnStateChangeListener == null) {
            iOnStateChangeListener = this.f76481q;
        }
        this.f76477m = iOnStateChangeListener;
    }

    /* JADX INFO: renamed from: a */
    public void m78680a(ITPPlayerListener.IOnStopAsyncCompleteListener iOnStopAsyncCompleteListener) {
        if (iOnStopAsyncCompleteListener == null) {
            iOnStopAsyncCompleteListener = this.f76481q;
        }
        this.f76478n = iOnStopAsyncCompleteListener;
    }

    /* JADX INFO: renamed from: a */
    public void m78681a(ITPPlayerListener.IOnSubtitleDataListener iOnSubtitleDataListener) {
        if (iOnSubtitleDataListener == null) {
            iOnSubtitleDataListener = this.f76481q;
        }
        this.f76471g = iOnSubtitleDataListener;
    }

    /* JADX INFO: renamed from: a */
    public void m78682a(ITPPlayerListener.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
        if (iOnSubtitleFrameOutListener == null) {
            iOnSubtitleFrameOutListener = this.f76481q;
        }
        this.f76472h = iOnSubtitleFrameOutListener;
    }

    /* JADX INFO: renamed from: a */
    public void m78683a(ITPPlayerListener.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        if (iOnVideoFrameOutListener == null) {
            iOnVideoFrameOutListener = this.f76481q;
        }
        this.f76473i = iOnVideoFrameOutListener;
    }

    /* JADX INFO: renamed from: a */
    public void m78684a(ITPPlayerListener.IOnVideoProcessFrameOutputListener iOnVideoProcessFrameOutputListener) {
        if (iOnVideoProcessFrameOutputListener == null) {
            iOnVideoProcessFrameOutputListener = this.f76481q;
        }
        this.f76475k = iOnVideoProcessFrameOutputListener;
    }

    /* JADX INFO: renamed from: a */
    public void m78685a(ITPPlayerListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        if (iOnVideoSizeChangedListener == null) {
            iOnVideoSizeChangedListener = this.f76481q;
        }
        this.f76470f = iOnVideoSizeChangedListener;
    }

    /* JADX INFO: renamed from: a */
    public void m78686a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f76482r = "TPPlayerListenerS";
        } else {
            this.f76482r = str;
        }
        a aVar = this.f76481q;
        if (aVar != null) {
            aVar.f76483a = str;
        }
    }
}
