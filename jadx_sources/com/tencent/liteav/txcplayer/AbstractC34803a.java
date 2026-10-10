package com.tencent.liteav.txcplayer;

import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleFrameBuffer;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.liteav.txcplayer.a */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC34803a implements ITXVCubePlayer {
    private boolean mEnableRenderProcess = false;
    private ITXVCubePlayer.InterfaceC34795c mOnBufferingUpdateListener;
    private ITXVCubePlayer.InterfaceC34796d mOnCompletionListener;
    private ITXVCubePlayer.InterfaceC34797e mOnErrorListener;
    private ITXVCubePlayer.InterfaceC34793a mOnGetTargetState;
    private ITXVCubePlayer.InterfaceC34798f mOnInfoListener;
    private ITXVCubePlayer.InterfaceC34799g mOnPreparedListener;
    private ITXVCubePlayer.InterfaceC34800h mOnSeekCompleteListener;
    private ITXVCubePlayer.InterfaceC34801i mOnSubtitleDataListener;
    private ITXVCubePlayer.InterfaceC34794b mOnSubtitleFrameDataListener;
    private ITXVCubePlayer.InterfaceC34802j mOnVideoSizeChangedListener;

    public void resetListeners() {
        this.mOnPreparedListener = null;
        this.mOnBufferingUpdateListener = null;
        this.mOnCompletionListener = null;
        this.mOnSeekCompleteListener = null;
        this.mOnVideoSizeChangedListener = null;
        this.mOnErrorListener = null;
        this.mOnInfoListener = null;
        this.mOnSubtitleDataListener = null;
        this.mOnSubtitleFrameDataListener = null;
    }

    public int getTXCVodVideoViewTargetState() {
        ITXVCubePlayer.InterfaceC34793a interfaceC34793a = this.mOnGetTargetState;
        if (interfaceC34793a != null) {
            return interfaceC34793a.mo76205a();
        }
        return 0;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public boolean isEnableRenderProcess() {
        return this.mEnableRenderProcess;
    }

    public final void notifyOnCompletion() {
        ITXVCubePlayer.InterfaceC34796d interfaceC34796d = this.mOnCompletionListener;
        if (interfaceC34796d != null) {
            interfaceC34796d.mo76206a();
        }
    }

    public final boolean notifyOnError(int i11, int i12) {
        ITXVCubePlayer.InterfaceC34797e interfaceC34797e = this.mOnErrorListener;
        if (interfaceC34797e == null) {
            return false;
        }
        interfaceC34797e.mo76207a(i11, i12);
        return true;
    }

    public final boolean notifyOnInfo(int i11, int i12, int i13, Object obj) {
        ITXVCubePlayer.InterfaceC34798f interfaceC34798f = this.mOnInfoListener;
        return interfaceC34798f != null && interfaceC34798f.mo76208a(i11, i12, i13, obj);
    }

    public final void notifyOnPrepared() {
        ITXVCubePlayer.InterfaceC34799g interfaceC34799g = this.mOnPreparedListener;
        if (interfaceC34799g != null) {
            interfaceC34799g.mo76209a(this);
        }
    }

    public final void notifyOnSeekComplete() {
        ITXVCubePlayer.InterfaceC34800h interfaceC34800h = this.mOnSeekCompleteListener;
        if (interfaceC34800h != null) {
            interfaceC34800h.mo76210a();
        }
    }

    public final void notifyOnSubtitleData(TPSubtitleData tPSubtitleData) {
        ITXVCubePlayer.InterfaceC34801i interfaceC34801i = this.mOnSubtitleDataListener;
        if (interfaceC34801i != null) {
            interfaceC34801i.mo75993a(this, tPSubtitleData);
        }
    }

    public final void notifyOnVideoSizeChanged(int i11, int i12, int i13, int i14, String str) {
        ITXVCubePlayer.InterfaceC34802j interfaceC34802j = this.mOnVideoSizeChangedListener;
        if (interfaceC34802j != null) {
            interfaceC34802j.mo76211a(this, i11, i12, str);
        }
    }

    public final void notifySubtitleFrameData(TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
        ITXVCubePlayer.InterfaceC34794b interfaceC34794b = this.mOnSubtitleFrameDataListener;
        if (interfaceC34794b != null) {
            interfaceC34794b.mo75992a(this, tPSubtitleFrameBuffer);
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setEnableRenderProcess(boolean z11) {
        this.mEnableRenderProcess = z11;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnBufferingUpdateListener(ITXVCubePlayer.InterfaceC34795c interfaceC34795c) {
        this.mOnBufferingUpdateListener = interfaceC34795c;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnCompletionListener(ITXVCubePlayer.InterfaceC34796d interfaceC34796d) {
        this.mOnCompletionListener = interfaceC34796d;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnErrorListener(ITXVCubePlayer.InterfaceC34797e interfaceC34797e) {
        this.mOnErrorListener = interfaceC34797e;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setOnGetTXCVodVideoViewTargetState(ITXVCubePlayer.InterfaceC34793a interfaceC34793a) {
        this.mOnGetTargetState = interfaceC34793a;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnInfoListener(ITXVCubePlayer.InterfaceC34798f interfaceC34798f) {
        this.mOnInfoListener = interfaceC34798f;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnPreparedListener(ITXVCubePlayer.InterfaceC34799g interfaceC34799g) {
        this.mOnPreparedListener = interfaceC34799g;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnSeekCompleteListener(ITXVCubePlayer.InterfaceC34800h interfaceC34800h) {
        this.mOnSeekCompleteListener = interfaceC34800h;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnSubtitleDataListener(ITXVCubePlayer.InterfaceC34801i interfaceC34801i) {
        this.mOnSubtitleDataListener = interfaceC34801i;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnSubtitleFrameDataListener(ITXVCubePlayer.InterfaceC34794b interfaceC34794b) {
        this.mOnSubtitleFrameDataListener = interfaceC34794b;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnVideoSizeChangedListener(ITXVCubePlayer.InterfaceC34802j interfaceC34802j) {
        this.mOnVideoSizeChangedListener = interfaceC34802j;
    }

    public final void notifyOnBufferingUpdate(int i11) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setPrivateConfig(Map<String, Object> map) {
    }
}
