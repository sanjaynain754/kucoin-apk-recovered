package com.tencent.liteav.thumbplayer;

import android.util.Log;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.rtmp.TXVodConstants;
import com.tencent.thumbplayer.tcmedia.api.ITPPlayer;
import com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener;
import com.tencent.thumbplayer.tcmedia.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMsg;
import com.tencent.thumbplayer.tcmedia.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPVideoFrameBuffer;

/* JADX INFO: loaded from: classes59.dex */
class ThumbMediaPlayerListener implements ITPPlayerListener.IOnAudioFrameOutputListener, ITPPlayerListener.IOnAudioProcessFrameOutputListener, ITPPlayerListener.IOnCompletionListener, ITPPlayerListener.IOnErrorListener, ITPPlayerListener.IOnInfoListener, ITPPlayerListener.IOnPreparedListener, ITPPlayerListener.IOnSeekCompleteListener, ITPPlayerListener.IOnStateChangeListener, ITPPlayerListener.IOnStopAsyncCompleteListener, ITPPlayerListener.IOnSubtitleDataListener, ITPPlayerListener.IOnSubtitleFrameOutListener, ITPPlayerListener.IOnVideoFrameOutListener, ITPPlayerListener.IOnVideoProcessFrameOutputListener, ITPPlayerListener.IOnVideoSizeChangedListener {
    private static final int ERROR_DEMUXER_PREPARE_TIMEOUT = 1104;
    private final String TAG = ThumbMediaPlayerListener.class.getName();
    private final ThumbMediaPlayer mThumbMediaPlayer;

    private int transferInfo(int i11) {
        if (i11 == 4) {
            return TXVodConstants.VOD_PLAY_EVT_SELECT_TRACK_COMPLETE;
        }
        if (i11 == 104) {
            return 2008;
        }
        if (i11 == 503) {
            return TXVodConstants.VOD_PLAY_EVT_VIDEO_SEI;
        }
        if (i11 == 1001) {
            innerLogI("TP_PLAYER_INFO_LONG0_ALL_DOWNLOAD_FINISH");
            ThumbMediaPlayer thumbMediaPlayer = this.mThumbMediaPlayer;
            if (thumbMediaPlayer != null) {
                thumbMediaPlayer.updateTcpSpeed(0L);
            }
        } else {
            if (i11 == 1006) {
                return 1006;
            }
            if (i11 == 1008) {
                return -2303;
            }
            if (i11 == 1018) {
                return 2002;
            }
            if (i11 == 106) {
                ThumbMediaPlayer thumbMediaPlayer2 = this.mThumbMediaPlayer;
                if (thumbMediaPlayer2 != null) {
                    thumbMediaPlayer2.onReceiveFirstVideoRenderEvent();
                    return -1;
                }
            } else if (i11 == 107) {
                ThumbMediaPlayer thumbMediaPlayer3 = this.mThumbMediaPlayer;
                if (thumbMediaPlayer3 != null) {
                    thumbMediaPlayer3.onReceiveFirstPacketReadEvent();
                    return -1;
                }
            } else {
                if (i11 == 200) {
                    return 2007;
                }
                if (i11 == 201) {
                    return 2014;
                }
            }
        }
        return -1;
    }

    private void innerLogE(String str) {
        LiteavLog.m76083e(this.TAG, "[" + hashCode() + "], " + str);
    }

    private void innerLogI(String str) {
        LiteavLog.m76087i(this.TAG, "[" + hashCode() + "], " + str);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0057  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    private int transferError(int i11, int i12) {
        ThumbMediaPlayer thumbMediaPlayer;
        String propertyString;
        int i13 = TXVodConstants.VOD_PLAY_ERR_GENERAL;
        if (i11 != 1001) {
            if (i11 == 1100) {
                if (i12 < 11070000 || i12 >= 11080000) {
                    i13 = TXVodConstants.VOD_PLAY_ERR_DEMUXER_FAIL;
                } else {
                    i13 = TXVodConstants.VOD_PLAY_ERR_DRM;
                }
            } else if (i11 == 1200) {
                i13 = TXVodConstants.VOD_PLAY_ERR_DECODE_VIDEO_FAIL;
                if (i11 == 1220 && (thumbMediaPlayer = this.mThumbMediaPlayer) != null && (propertyString = thumbMediaPlayer.getTPPPlayer().getPropertyString(0)) != null && (propertyString.toLowerCase().contains("hevc") || propertyString.toLowerCase().contains("h265"))) {
                    i13 = -2304;
                }
            } else if (i11 == 1300) {
                i13 = TXVodConstants.VOD_PLAY_ERR_RENDER_FAIL;
            } else if (i11 == 1600) {
                i13 = TXVodConstants.VOD_PLAY_ERR_PROCESS_VIDEO_FAIL;
            } else if (i11 == 4000) {
                i13 = TXVodConstants.VOD_PLAY_ERR_DOWNLOAD_FAIL;
            } else if (i11 == 1210 || i11 == 1211) {
                i13 = TXVodConstants.VOD_PLAY_ERR_DECODE_AUDIO_FAIL;
            } else if (i11 == 1220 || i11 == 1221) {
                i13 = TXVodConstants.VOD_PLAY_ERR_DECODE_VIDEO_FAIL;
                if (i11 == 1220) {
                    i13 = -2304;
                }
            } else if (i11 == 1230 || i11 == 1231) {
                i13 = TXVodConstants.VOD_PLAY_ERR_DECODE_SUBTITLE_FAIL;
            } else if (i11 == 2000) {
                i13 = TXVodConstants.VOD_PLAY_ERR_SYSTEM_PLAY_FAIL;
            } else if (i11 != 2001) {
                switch (i11) {
                    case 1102:
                        if (i12 < 11070000) {
                            i13 = TXVodConstants.VOD_PLAY_ERR_DEMUXER_FAIL;
                        } else {
                            i13 = TXVodConstants.VOD_PLAY_ERR_DEMUXER_FAIL;
                        }
                        break;
                    case 1103:
                    case 1104:
                        i13 = TXVodConstants.VOD_PLAY_ERR_DEMUXER_TIMEOUT;
                        break;
                }
            } else {
                i13 = -2301;
            }
        } else if (i12 == 11010104) {
            i13 = -2305;
        }
        innerLogI("[transferError], errorType: " + i11 + " ,errorCode: " + i12 + " ,vodErrorEvent: " + i13);
        return i13;
    }

    public void attachToPlayer() {
        ITPPlayer tPPPlayer;
        ThumbMediaPlayer thumbMediaPlayer = this.mThumbMediaPlayer;
        if (thumbMediaPlayer == null || (tPPPlayer = thumbMediaPlayer.getTPPPlayer()) == null) {
            return;
        }
        tPPPlayer.setOnPreparedListener(this);
        tPPPlayer.setOnCompletionListener(this);
        tPPPlayer.setOnInfoListener(this);
        tPPPlayer.setOnErrorListener(this);
        tPPPlayer.setOnSeekCompleteListener(this);
        tPPPlayer.setOnVideoSizeChangedListener(this);
        tPPPlayer.setOnSubtitleDataListener(this);
        tPPPlayer.setOnSubtitleFrameOutListener(this);
        tPPPlayer.setOnVideoFrameOutListener(this);
        tPPPlayer.setOnAudioFrameOutputListener(this);
        tPPPlayer.setOnVideoProcessFrameOutputListener(this);
        tPPPlayer.setOnAudioProcessFrameOutputListener(this);
        tPPPlayer.setOnPlayerStateChangeListener(this);
        tPPPlayer.setOnStopAsyncCompleteListener(this);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnCompletionListener
    public void onCompletion(ITPPlayer iTPPlayer) {
        ThumbMediaPlayer thumbMediaPlayer = this.mThumbMediaPlayer;
        if (thumbMediaPlayer != null) {
            thumbMediaPlayer.notifyOnCompletion();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnErrorListener
    public void onError(ITPPlayer iTPPlayer, int i11, int i12, long j11, long j12) {
        if (i11 != 1000) {
            try {
                innerLogE("onError type: " + i11 + " code: " + i12 + " arg1: " + j11 + " arg2: " + j12);
                ThumbMediaPlayer thumbMediaPlayer = this.mThumbMediaPlayer;
                if (thumbMediaPlayer != null) {
                    thumbMediaPlayer.notifyOnError(transferError(i11, i12), i12);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
                innerLogE("onError, e= " + Log.getStackTraceString(th2));
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnInfoListener
    public void onInfo(ITPPlayer iTPPlayer, int i11, long j11, long j12, Object obj) {
        String str;
        String[] strArrSplit;
        ThumbMediaPlayer thumbMediaPlayer = this.mThumbMediaPlayer;
        if (thumbMediaPlayer != null) {
            int iTransferInfo = transferInfo(i11);
            int i12 = (int) j11;
            if (obj != null && (obj instanceof TPPlayerMsg.TPCDNURLInfo)) {
                TPPlayerMsg.TPCDNURLInfo tPCDNURLInfo = (TPPlayerMsg.TPCDNURLInfo) obj;
                innerLogI("onInfo TPCDNURLInfo:cdnIp:" + tPCDNURLInfo.cdnIp + ":uIp:" + tPCDNURLInfo.uIp + ": url: " + tPCDNURLInfo.url + ":errorStr: " + tPCDNURLInfo.errorStr);
            }
            if (obj != null && (obj instanceof TPPlayerMsg.TPDownLoadProgressInfo)) {
                TPPlayerMsg.TPDownLoadProgressInfo tPDownLoadProgressInfo = (TPPlayerMsg.TPDownLoadProgressInfo) obj;
                thumbMediaPlayer.updateBitrate(tPDownLoadProgressInfo.totalFileSize);
                long jLongValue = tPDownLoadProgressInfo.downloadSpeedKBps;
                if (jLongValue < 0 && (str = tPDownLoadProgressInfo.extraInfo) != null && (strArrSplit = str.split(",")) != null) {
                    for (String str2 : strArrSplit) {
                        if (str2 != null && str2.contains("httpAvgSpeedKB")) {
                            jLongValue = Long.valueOf(str2.substring(str2.indexOf(C33844oi.f71346o) + 1, str2.length()).trim()).longValue();
                            break;
                        }
                    }
                }
                thumbMediaPlayer.updateTcpSpeed(jLongValue * 1024);
            }
            if (obj instanceof TPPlayerMsg.TPVideoCropInfo) {
                TPPlayerMsg.TPVideoCropInfo tPVideoCropInfo = (TPPlayerMsg.TPVideoCropInfo) obj;
                innerLogI("onInfo TPVideoCropInfo:cropBottom:" + tPVideoCropInfo.cropBottom + ":cropLeft:" + tPVideoCropInfo.cropLeft + ": cropRight: " + tPVideoCropInfo.cropRight + ":cropTop: " + tPVideoCropInfo.cropTop + ":height:" + tPVideoCropInfo.height + ":width:" + tPVideoCropInfo.width);
            }
            thumbMediaPlayer.notifyOnInfo(iTransferInfo, i12, (int) j12, obj);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnSeekCompleteListener
    public void onSeekComplete(ITPPlayer iTPPlayer) {
        innerLogI(" onSeekComplete");
        ThumbMediaPlayer thumbMediaPlayer = this.mThumbMediaPlayer;
        if (thumbMediaPlayer != null) {
            thumbMediaPlayer.notifyOnSeekComplete();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnSubtitleDataListener
    public void onSubtitleData(ITPPlayer iTPPlayer, TPSubtitleData tPSubtitleData) {
        ThumbMediaPlayer thumbMediaPlayer = this.mThumbMediaPlayer;
        if (thumbMediaPlayer == null || tPSubtitleData == null) {
            return;
        }
        thumbMediaPlayer.notifyOnSubtitleData(tPSubtitleData);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnSubtitleFrameOutListener
    public void onSubtitleFrameOut(ITPPlayer iTPPlayer, TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
        ThumbMediaPlayer thumbMediaPlayer = this.mThumbMediaPlayer;
        if (thumbMediaPlayer != null) {
            thumbMediaPlayer.notifySubtitleFrameData(tPSubtitleFrameBuffer);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnVideoSizeChangedListener
    public void onVideoSizeChanged(ITPPlayer iTPPlayer, long j11, long j12) {
        ThumbMediaPlayer thumbMediaPlayer = this.mThumbMediaPlayer;
        if (thumbMediaPlayer != null) {
            innerLogI("onVideoSizeChanged width: " + j11 + " ,height: " + j12);
            thumbMediaPlayer.notifyOnVideoSizeChanged((int) j11, (int) j12, thumbMediaPlayer.getVideoSarNum(), thumbMediaPlayer.getVideoSarDen(), null);
        }
    }

    public ThumbMediaPlayerListener(ThumbMediaPlayer thumbMediaPlayer) {
        this.mThumbMediaPlayer = thumbMediaPlayer;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnPreparedListener
    public void onPrepared(ITPPlayer iTPPlayer) {
        innerLogI("onPrepared");
        ThumbMediaPlayer thumbMediaPlayer = this.mThumbMediaPlayer;
        if (thumbMediaPlayer != null) {
            thumbMediaPlayer.notifyOnPrepared();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnStopAsyncCompleteListener
    public void onStopAsyncComplete(ITPPlayer iTPPlayer) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnAudioFrameOutputListener
    public void onAudioFrameOut(ITPPlayer iTPPlayer, TPAudioFrameBuffer tPAudioFrameBuffer) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnAudioProcessFrameOutputListener
    public TPPostProcessFrameBuffer onAudioProcessFrameOut(ITPPlayer iTPPlayer, TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        return tPPostProcessFrameBuffer;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnStateChangeListener
    public void onStateChange(int i11, int i12) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnVideoFrameOutListener
    public void onVideoFrameOut(ITPPlayer iTPPlayer, TPVideoFrameBuffer tPVideoFrameBuffer) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnVideoProcessFrameOutputListener
    public TPPostProcessFrameBuffer onVideoProcessFrameOut(ITPPlayer iTPPlayer, TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        return tPPostProcessFrameBuffer;
    }
}
