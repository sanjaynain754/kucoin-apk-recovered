.class public Lcom/tencent/thumbplayer/tcmedia/adapter/a/b/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/thumbplayer/tcmedia/adapter/a/b/c$a;
    }
.end annotation


# static fields
.field private static a:Ljava/lang/String; = "TPThumbPlayerUtils"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method private static a(J)J
    .locals 8

    .line 1
    const-class v0, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapSubtitleRenderParams;

    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMapUtil;->getEntrySetOfToNativeMap(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v1, 0x0

    move-wide v3, v1

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    and-long/2addr v6, p0

    cmp-long v6, v6, v1

    if-lez v6, :cond_0

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    or-long/2addr v3, v5

    goto :goto_0

    :cond_1
    return-wide v3
.end method

.method public static a(Lcom/tencent/thumbplayer/tcmedia/core/common/TPAudioFrame;)Lcom/tencent/thumbplayer/tcmedia/api/TPAudioFrameBuffer;
    .locals 5

    .line 2
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/api/TPAudioFrameBuffer;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPAudioFrameBuffer;-><init>()V

    const-class v1, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioSampleFormat;

    iget v2, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPAudioFrame;->format:I

    invoke-static {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMapUtil;->toTPIntValue(Ljava/lang/Class;I)I

    move-result v1

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPAudioFrameBuffer;->format:I

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPAudioFrame;->data:[[B

    iput-object v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPAudioFrameBuffer;->data:[[B

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPAudioFrame;->linesize:[I

    iput-object v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPAudioFrameBuffer;->size:[I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPAudioFrame;->sampleRate:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPAudioFrameBuffer;->sampleRate:I

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPAudioFrame;->channelLayout:J

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPAudioFrameBuffer;->channelLayout:J

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPAudioFrame;->ptsUs:J

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPAudioFrameBuffer;->ptsMs:J

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPAudioFrame;->nbSamples:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPAudioFrameBuffer;->nbSamples:I

    iget p0, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPAudioFrame;->channels:I

    iput p0, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPAudioFrameBuffer;->channels:I

    return-object v0
.end method

.method public static a(Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaTrackDashFormat;)Lcom/tencent/thumbplayer/tcmedia/api/TPDashFormat;
    .locals 2

    .line 3
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDashFormat;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPDashFormat;-><init>()V

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaTrackDashFormat;->representationId:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDashFormat;->representationId:Ljava/lang/String;

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaTrackDashFormat;->codecs:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDashFormat;->codecs:Ljava/lang/String;

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaTrackDashFormat;->mimeType:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDashFormat;->mimeType:Ljava/lang/String;

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaTrackDashFormat;->language:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDashFormat;->language:Ljava/lang/String;

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaTrackDashFormat;->label:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDashFormat;->label:Ljava/lang/String;

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaTrackDashFormat;->width:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDashFormat;->width:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaTrackDashFormat;->height:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDashFormat;->height:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaTrackDashFormat;->bandwidth:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDashFormat;->bandwidth:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaTrackDashFormat;->audioChannels:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDashFormat;->audioChannels:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaTrackDashFormat;->audioSamplingRate:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDashFormat;->audioSamplingRate:I

    iget p0, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaTrackDashFormat;->frameRate:F

    iput p0, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDashFormat;->frameRate:F

    return-object v0
.end method

.method public static a(Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerDrmParams;)Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;
    .locals 3

    .line 4
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;-><init>()V

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerDrmParams;->mSecureLevel:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;->drmSecureLevel:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerDrmParams;->mSupportSecureDecoder:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;->drmSupportSecureDecoder:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerDrmParams;->mSupportSecureDecrypt:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;->drmSupportSecureDecrypt:I

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerDrmParams;->mComponentName:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;->drmComponentName:Ljava/lang/String;

    const-class v1, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapReportDrmType;

    iget v2, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerDrmParams;->mDrmType:I

    invoke-static {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMapUtil;->toTPIntValue(Ljava/lang/Class;I)I

    move-result v1

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;->drmType:I

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerDrmParams;->mPrepareSTimeMs:J

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;->drmPrepareStartTimeMs:J

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerDrmParams;->mPrepareETimeMs:J

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;->drmPrepareEndTimeMs:J

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerDrmParams;->mOpenSessionSTimeMs:J

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;->drmOpenSessionStartTimeMs:J

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerDrmParams;->mOpenSessionETimeMs:J

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;->drmOpenSessionEndTimeMs:J

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerDrmParams;->mGetProvisionReqSTimeMs:J

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;->drmGetProvisionReqStartTimeMs:J

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerDrmParams;->mGetProvisionReqETimeMs:J

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;->drmGetProvisionReqEndTimeMs:J

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerDrmParams;->mSendProvisionReqTimeMs:J

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;->drmSendProvisionReqTimeMs:J

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerDrmParams;->mRecvProvisionRespTimeMs:J

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;->drmRecvProvisionRespTimeMs:J

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerDrmParams;->mProvideProvisionRespSTimeMs:J

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;->drmProvideProvisionRespStartTimeMs:J

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerDrmParams;->mProvideProvisionRespETimeMs:J

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;->drmProvideProvisionRespEndTimeMs:J

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerDrmParams;->mGetKeyReqSTimeMs:J

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;->drmGetKeyReqStartTimeMs:J

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerDrmParams;->mGetKeyReqETimeMs:J

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;->drmGetKeyReqEndTimeMs:J

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerDrmParams;->mSendKeyReqTimeMs:J

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;->drmSendKeyReqTimeMs:J

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerDrmParams;->mRecvKeyRespTimeMs:J

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;->drmRecvKeyRespTimeMs:J

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerDrmParams;->mProvideKeyRespSTimeMs:J

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;->drmProvideKeyRespStartTimeMs:J

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerDrmParams;->mProvideKeyRespETimeMs:J

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;->drmProvideKeyRespEndTimeMs:J

    return-object v0
.end method

.method public static a(Lcom/tencent/thumbplayer/tcmedia/core/common/TPDetailInfo;)Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerDetailInfo;
    .locals 6

    .line 5
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerDetailInfo;

    const-class v1, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapDetailInfoType;

    iget v2, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPDetailInfo;->type:I

    invoke-static {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMapUtil;->toTPIntValue(Ljava/lang/Class;I)I

    move-result v1

    iget-wide v2, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPDetailInfo;->timeSince1970Us:J

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerDetailInfo;-><init>(IJ)V

    return-object v0
.end method

.method public static a(Lcom/tencent/thumbplayer/tcmedia/core/player/ITPNativePlayerMessageCallback$MediaCodecInfo;)Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPMediaCodecInfo;
    .locals 3

    .line 6
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPMediaCodecInfo;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPMediaCodecInfo;-><init>()V

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/ITPNativePlayerMessageCallback$MediaCodecInfo;->mediaType:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_1

    sget v1, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPMediaCodecInfo;->TP_DEC_MEDIA_TYPE_UNKNOWN:I

    :goto_0
    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPMediaCodecInfo;->mediaType:I

    goto :goto_1

    :cond_1
    sget v1, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPMediaCodecInfo;->TP_DEC_MEDIA_TYPE_AUDIO:I

    goto :goto_0

    :cond_2
    sget v1, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPMediaCodecInfo;->TP_DEC_MEDIA_TYPE_VIDEO:I

    goto :goto_0

    :goto_1
    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/ITPNativePlayerMessageCallback$MediaCodecInfo;->infoType:I

    if-eqz v1, :cond_4

    if-eq v1, v2, :cond_3

    sget v1, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPMediaCodecInfo;->TP_INFO_UNKNOWN:I

    :goto_2
    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPMediaCodecInfo;->infoType:I

    goto :goto_3

    :cond_3
    sget v1, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPMediaCodecInfo;->TP_INFO_MEDIA_CODEC_EXCEPTION:I

    goto :goto_2

    :cond_4
    sget v1, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPMediaCodecInfo;->TP_INFO_MEDIA_CODEC_READY:I

    goto :goto_2

    :goto_3
    iget-object p0, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/ITPNativePlayerMessageCallback$MediaCodecInfo;->msg:Ljava/lang/String;

    iput-object p0, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPMediaCodecInfo;->msg:Ljava/lang/String;

    return-object v0
.end method

.method public static a(Lcom/tencent/thumbplayer/tcmedia/core/player/ITPNativePlayerMessageCallback$MediaDrmInfo;)Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPMediaDrmInfo;
    .locals 2

    .line 7
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPMediaDrmInfo;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPMediaDrmInfo;-><init>()V

    iget-boolean v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/ITPNativePlayerMessageCallback$MediaDrmInfo;->supportSecureDecoder:Z

    iput-boolean v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPMediaDrmInfo;->supportSecureDecoder:Z

    iget-boolean v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/ITPNativePlayerMessageCallback$MediaDrmInfo;->supportSecureDecrypt:Z

    iput-boolean v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPMediaDrmInfo;->supportSecureDecrypt:Z

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/ITPNativePlayerMessageCallback$MediaDrmInfo;->componentName:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPMediaDrmInfo;->componentName:Ljava/lang/String;

    const-class v1, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapDrmType;

    iget p0, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/ITPNativePlayerMessageCallback$MediaDrmInfo;->drmType:I

    invoke-static {v1, p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMapUtil;->toTPIntValue(Ljava/lang/Class;I)I

    move-result p0

    iput p0, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPMediaDrmInfo;->drmType:I

    return-object v0
.end method

.method public static a(Lcom/tencent/thumbplayer/tcmedia/core/player/ITPNativePlayerMessageCallback$VideoCropInfo;)Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoCropInfo;
    .locals 2

    .line 8
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoCropInfo;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoCropInfo;-><init>()V

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/ITPNativePlayerMessageCallback$VideoCropInfo;->width:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoCropInfo;->width:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/ITPNativePlayerMessageCallback$VideoCropInfo;->height:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoCropInfo;->height:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/ITPNativePlayerMessageCallback$VideoCropInfo;->cropLeft:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoCropInfo;->cropLeft:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/ITPNativePlayerMessageCallback$VideoCropInfo;->cropRight:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoCropInfo;->cropRight:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/ITPNativePlayerMessageCallback$VideoCropInfo;->cropTop:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoCropInfo;->cropTop:I

    iget p0, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/ITPNativePlayerMessageCallback$VideoCropInfo;->cropBottom:I

    iput p0, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoCropInfo;->cropBottom:I

    return-object v0
.end method

.method public static a(Lcom/tencent/thumbplayer/tcmedia/core/player/ITPNativePlayerMessageCallback$VideoSeiInfo;)Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoSeiInfo;
    .locals 3

    .line 9
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoSeiInfo;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoSeiInfo;-><init>()V

    const-class v1, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapCodecType;

    iget v2, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/ITPNativePlayerMessageCallback$VideoSeiInfo;->videoCodecType:I

    invoke-static {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMapUtil;->toTPIntValue(Ljava/lang/Class;I)I

    move-result v1

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoSeiInfo;->videoCodecType:I

    iget-boolean v2, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/ITPNativePlayerMessageCallback$VideoSeiInfo;->isSpecialType:Z

    if-eqz v2, :cond_1

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/ITPNativePlayerMessageCallback$VideoSeiInfo;->videoSeiType:I

    :goto_0
    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoSeiInfo;->videoSeiType:I

    goto :goto_2

    :cond_1
    const/16 v2, 0x1a

    if-ne v1, v2, :cond_2

    const-class v1, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapVideoH264SeiType;

    :goto_1
    iget v2, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/ITPNativePlayerMessageCallback$VideoSeiInfo;->videoSeiType:I

    invoke-static {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMapUtil;->toTPIntValue(Ljava/lang/Class;I)I

    move-result v1

    goto :goto_0

    :cond_2
    const/16 v2, 0xac

    if-ne v1, v2, :cond_3

    const-class v1, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapVideoHevcSeiType;

    goto :goto_1

    :cond_3
    :goto_2
    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/ITPNativePlayerMessageCallback$VideoSeiInfo;->dataSize:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoSeiInfo;->seiDataSize:I

    iget-object p0, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/ITPNativePlayerMessageCallback$VideoSeiInfo;->data:[B

    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p0

    iput-object p0, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoSeiInfo;->seiData:[B

    return-object v0
.end method

.method public static a(Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;)Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;
    .locals 5

    .line 10
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;-><init>()V

    const-class v1, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapMediaType;

    iget v2, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->mediaType:I

    invoke-static {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMapUtil;->toTPIntValue(Ljava/lang/Class;I)I

    move-result v1

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->mediaType:I

    if-nez v1, :cond_1

    const-class v1, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapPixelFormat;

    :goto_0
    iget v2, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->format:I

    invoke-static {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMapUtil;->toTPIntValue(Ljava/lang/Class;I)I

    move-result v1

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->format:I

    goto :goto_1

    :cond_1
    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    const-class v1, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioSampleFormat;

    goto :goto_0

    :cond_2
    :goto_1
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->data:[[B

    iput-object v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->data:[[B

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->linesize:[I

    iput-object v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->size:[I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->sampleRate:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->sampleRate:I

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->channelLayout:J

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->channelLayout:J

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->ptsUs:J

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->ptsMs:J

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->nbSamples:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->nbSamples:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->channels:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->channels:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->width:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->width:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->height:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->height:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->sampleAspectRatioNum:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->sampleAspectRatioNum:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->sampleAspectRatioDen:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->sampleAspectRatioDen:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->rotation:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->rotation:I

    iget-object p0, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->perfData:Ljava/util/HashMap;

    iput-object p0, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->perfData:Ljava/util/HashMap;

    return-object v0
.end method

.method public static a(Lcom/tencent/thumbplayer/tcmedia/core/common/TPSubtitleFrame;)Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;
    .locals 5

    .line 11
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;-><init>()V

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSubtitleFrame;->data:[[B

    iput-object v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;->data:[[B

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSubtitleFrame;->linesize:[I

    iput-object v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;->lineSize:[I

    const-class v1, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapSubtitleFormat;

    iget v2, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSubtitleFrame;->format:I

    invoke-static {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMapUtil;->toTPIntValue(Ljava/lang/Class;I)I

    move-result v1

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;->format:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSubtitleFrame;->height:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;->srcHeight:I

    iget v2, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSubtitleFrame;->width:I

    iput v2, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;->srcWidth:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;->dstHeight:I

    iput v2, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;->dstWidth:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSubtitleFrame;->rotation:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;->rotation:I

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSubtitleFrame;->ptsUs:J

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;->ptsMs:J

    return-object v0
.end method

.method public static a(Lcom/tencent/thumbplayer/tcmedia/core/player/TPNativePlayerSurfaceDolbyVisionInfo;)Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceDolbyVisionInfo;
    .locals 2

    .line 12
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceDolbyVisionInfo;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceDolbyVisionInfo;-><init>()V

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPNativePlayerSurfaceDolbyVisionInfo;->mProfile:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceDolbyVisionInfo;->mProfile:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPNativePlayerSurfaceDolbyVisionInfo;->mLevel:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceDolbyVisionInfo;->mLevel:I

    iget p0, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPNativePlayerSurfaceDolbyVisionInfo;->mBlSignalCompatibilityId:I

    iput p0, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceDolbyVisionInfo;->mBlSignalCompatibilityId:I

    return-object v0
.end method

.method private static a(Lcom/tencent/thumbplayer/tcmedia/core/player/TPNativePlayerSurfaceRenderInfo$TPVideoCropInfo;)Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceRenderInfo$TPVideoCropInfo;
    .locals 2

    .line 13
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceRenderInfo$TPVideoCropInfo;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceRenderInfo$TPVideoCropInfo;-><init>()V

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPNativePlayerSurfaceRenderInfo$TPVideoCropInfo;->cropLeft:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceRenderInfo$TPVideoCropInfo;->cropLeft:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPNativePlayerSurfaceRenderInfo$TPVideoCropInfo;->cropRight:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceRenderInfo$TPVideoCropInfo;->cropRight:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPNativePlayerSurfaceRenderInfo$TPVideoCropInfo;->cropTop:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceRenderInfo$TPVideoCropInfo;->cropTop:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPNativePlayerSurfaceRenderInfo$TPVideoCropInfo;->cropBottom:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceRenderInfo$TPVideoCropInfo;->cropBottom:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPNativePlayerSurfaceRenderInfo$TPVideoCropInfo;->width:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceRenderInfo$TPVideoCropInfo;->width:I

    iget p0, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPNativePlayerSurfaceRenderInfo$TPVideoCropInfo;->height:I

    iput p0, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceRenderInfo$TPVideoCropInfo;->height:I

    return-object v0
.end method

.method public static a(Lcom/tencent/thumbplayer/tcmedia/core/player/TPNativePlayerSurfaceRenderInfo;)Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceRenderInfo;
    .locals 2

    .line 14
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceRenderInfo;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceRenderInfo;-><init>()V

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPNativePlayerSurfaceRenderInfo;->displayWidth:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceRenderInfo;->displayWidth:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPNativePlayerSurfaceRenderInfo;->displayHeight:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceRenderInfo;->displayHeight:I

    iget-object p0, p0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPNativePlayerSurfaceRenderInfo;->videoCropInfo:Lcom/tencent/thumbplayer/tcmedia/core/player/TPNativePlayerSurfaceRenderInfo$TPVideoCropInfo;

    invoke-static {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b/c;->a(Lcom/tencent/thumbplayer/tcmedia/core/player/TPNativePlayerSurfaceRenderInfo$TPVideoCropInfo;)Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceRenderInfo$TPVideoCropInfo;

    move-result-object p0

    iput-object p0, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceRenderInfo;->videoCropInfo:Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceRenderInfo$TPVideoCropInfo;

    return-object v0
.end method

.method public static a(Lcom/tencent/thumbplayer/tcmedia/core/common/TPVideoFrame;)Lcom/tencent/thumbplayer/tcmedia/api/TPVideoFrameBuffer;
    .locals 5

    .line 15
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoFrameBuffer;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoFrameBuffer;-><init>()V

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPVideoFrame;->data:[[B

    iput-object v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoFrameBuffer;->data:[[B

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPVideoFrame;->linesize:[I

    iput-object v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoFrameBuffer;->lineSize:[I

    const-class v1, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapPixelFormat;

    iget v2, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPVideoFrame;->format:I

    invoke-static {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMapUtil;->toTPIntValue(Ljava/lang/Class;I)I

    move-result v1

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoFrameBuffer;->format:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPVideoFrame;->height:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoFrameBuffer;->srcHeight:I

    iget v2, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPVideoFrame;->width:I

    iput v2, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoFrameBuffer;->srcWidth:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoFrameBuffer;->dstHeight:I

    iput v2, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoFrameBuffer;->dstWidth:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPVideoFrame;->sampleAspectRatioDen:I

    if-lez v1, :cond_0

    iget v3, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPVideoFrame;->sampleAspectRatioNum:I

    if-lez v3, :cond_0

    int-to-float v3, v3

    int-to-float v1, v1

    div-float/2addr v3, v1

    int-to-float v1, v2

    mul-float/2addr v3, v1

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v1

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoFrameBuffer;->dstWidth:I

    :cond_0
    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPVideoFrame;->rotation:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoFrameBuffer;->rotation:I

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPVideoFrame;->ptsUs:J

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoFrameBuffer;->ptsMs:J

    return-object v0
.end method

.method public static a(Lcom/tencent/thumbplayer/tcmedia/core/common/TPVideoPacket;)Lcom/tencent/thumbplayer/tcmedia/api/TPVideoPacketBuffer;
    .locals 5

    .line 16
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoPacketBuffer;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoPacketBuffer;-><init>()V

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPVideoPacket;->mData:[B

    iput-object v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoPacketBuffer;->mData:[B

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPVideoPacket;->mSize:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoPacketBuffer;->mSize:I

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPVideoPacket;->mPtsUs:J

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoPacketBuffer;->mPtsMs:J

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPVideoPacket;->mDtsUs:J

    div-long/2addr v1, v3

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoPacketBuffer;->mDtsMs:J

    iget-object p0, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPVideoPacket;->mDolbyVisionInfo:Lcom/tencent/thumbplayer/tcmedia/core/player/TPNativePlayerSurfaceDolbyVisionInfo;

    invoke-static {p0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b/c;->a(Lcom/tencent/thumbplayer/tcmedia/core/player/TPNativePlayerSurfaceDolbyVisionInfo;)Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceDolbyVisionInfo;

    move-result-object p0

    iput-object p0, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoPacketBuffer;->mDolbyVisionInfo:Lcom/tencent/thumbplayer/tcmedia/api/TPSurfaceDolbyVisionInfo;

    return-object v0
.end method

.method public static a(Lcom/tencent/thumbplayer/tcmedia/api/TPAudioAttributes;)Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeAudioAttributes;
    .locals 4

    .line 17
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/api/TPAudioAttributes;->getUsage()I

    move-result v0

    const-class v1, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapTPAudioAttributeUsage;

    invoke-static {v1, v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMapUtil;->toNativeIntValue(Ljava/lang/Class;I)I

    move-result v0

    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/api/TPAudioAttributes;->getContentType()I

    move-result v2

    invoke-static {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMapUtil;->toNativeIntValue(Ljava/lang/Class;I)I

    move-result v1

    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/api/TPAudioAttributes;->getFlags()I

    move-result v2

    const/4 v3, 0x1

    and-int/2addr v2, v3

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/api/TPAudioAttributes;->getFlags()I

    move-result v2

    and-int/lit8 v2, v2, 0x10

    if-eqz v2, :cond_2

    or-int/lit8 v3, v3, 0x10

    :cond_2
    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/api/TPAudioAttributes;->getFlags()I

    move-result p0

    and-int/lit16 p0, p0, 0x100

    if-eqz p0, :cond_3

    or-int/lit16 v3, v3, 0x100

    :cond_3
    new-instance p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeAudioAttributes$Builder;

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeAudioAttributes$Builder;-><init>()V

    invoke-virtual {p0, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeAudioAttributes$Builder;->setUsage(I)Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeAudioAttributes$Builder;

    move-result-object p0

    invoke-virtual {p0, v1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeAudioAttributes$Builder;->setContentType(I)Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeAudioAttributes$Builder;

    move-result-object p0

    invoke-virtual {p0, v3}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeAudioAttributes$Builder;->setFlags(I)Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeAudioAttributes$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeAudioAttributes$Builder;->build()Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeAudioAttributes;

    move-result-object p0

    return-object p0
.end method

.method public static a(Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;)Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;
    .locals 5

    .line 18
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;-><init>()V

    const-class v1, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapMediaType;

    iget v2, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->mediaType:I

    invoke-static {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMapUtil;->toNativeIntValue(Ljava/lang/Class;I)I

    move-result v1

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->mediaType:I

    if-nez v1, :cond_1

    const-class v1, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapPixelFormat;

    :goto_0
    iget v2, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->format:I

    invoke-static {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMapUtil;->toNativeIntValue(Ljava/lang/Class;I)I

    move-result v1

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->format:I

    goto :goto_1

    :cond_1
    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    const-class v1, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioSampleFormat;

    goto :goto_0

    :cond_2
    :goto_1
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->data:[[B

    iput-object v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->data:[[B

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->size:[I

    iput-object v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->linesize:[I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->sampleRate:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->sampleRate:I

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->channelLayout:J

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->channelLayout:J

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->ptsMs:J

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->ptsUs:J

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->nbSamples:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->nbSamples:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->channels:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->channels:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->width:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->width:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->height:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->height:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->sampleAspectRatioNum:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->sampleAspectRatioNum:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->sampleAspectRatioDen:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->sampleAspectRatioDen:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->rotation:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->rotation:I

    iget-object p0, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;->perfData:Ljava/util/HashMap;

    iput-object p0, v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPPostProcessFrame;->perfData:Ljava/util/HashMap;

    return-object v0
.end method

.method public static a(Lcom/tencent/thumbplayer/tcmedia/api/TPJitterBufferConfig;)Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig;
    .locals 3

    .line 19
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig$Builder;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig$Builder;-><init>()V

    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/api/TPJitterBufferConfig;->getMinDecreaseDurationMs()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig$Builder;->setMinDecreaseDurationMs(J)Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/api/TPJitterBufferConfig;->getMaxIncreaseDurationMs()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig$Builder;->setMaxIncreaseDurationMs(J)Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/api/TPJitterBufferConfig;->getPerIncreaseDurationMs()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig$Builder;->setPerIncreaseDurationMs(J)Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/api/TPJitterBufferConfig;->getPerDecreaseDurationMs()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig$Builder;->setPerDecreaseDurationMs(J)Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/api/TPJitterBufferConfig;->getAdjustIntervalThresholdMs()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig$Builder;->setAdjustIntervalThresholdMs(J)Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/api/TPJitterBufferConfig;->getFrozenThresholdMs()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig$Builder;->setFrozenThresholdMs(J)Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig$Builder;->build()Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig;

    move-result-object p0

    return-object p0
.end method

.method public static a(Lcom/tencent/thumbplayer/tcmedia/api/TPRemoteSdpInfo;)Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeRemoteSdpInfo;
    .locals 2

    .line 20
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeRemoteSdpInfo;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeRemoteSdpInfo;-><init>()V

    iget-boolean v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPRemoteSdpInfo;->isSuccess:Z

    iput-boolean v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeRemoteSdpInfo;->isSuccess:Z

    iget-object p0, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPRemoteSdpInfo;->remoteSdp:Ljava/lang/String;

    iput-object p0, v0, Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeRemoteSdpInfo;->remoteSdp:Ljava/lang/String;

    return-object v0
.end method

.method public static a(Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;)Lcom/tencent/thumbplayer/tcmedia/core/subtitle/TPNativeSubtitleRenderParams;
    .locals 3

    .line 21
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/core/subtitle/TPNativeSubtitleRenderParams;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/core/subtitle/TPNativeSubtitleRenderParams;-><init>()V

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->canvasWidth:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/subtitle/TPNativeSubtitleRenderParams;->canvasWidth:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->canvasHeight:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/subtitle/TPNativeSubtitleRenderParams;->canvasHeight:I

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->paramFlags:J

    invoke-static {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b/c;->a(J)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/subtitle/TPNativeSubtitleRenderParams;->paramFlags:J

    iget-wide v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->paramPriorityFlags:J

    invoke-static {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b/c;->a(J)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/subtitle/TPNativeSubtitleRenderParams;->paramPriorityFlags:J

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->familyName:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/subtitle/TPNativeSubtitleRenderParams;->familyName:Ljava/lang/String;

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->fontSize:F

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/subtitle/TPNativeSubtitleRenderParams;->fontSize:F

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->fontColor:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/subtitle/TPNativeSubtitleRenderParams;->fontColor:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->fontStyleFlags:I

    int-to-long v1, v1

    invoke-static {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b/c;->b(J)I

    move-result v1

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/subtitle/TPNativeSubtitleRenderParams;->fontStyleFlags:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->outlineWidth:F

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/subtitle/TPNativeSubtitleRenderParams;->outlineWidth:F

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->outlineColor:I

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/subtitle/TPNativeSubtitleRenderParams;->outlineColor:I

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->lineSpace:F

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/subtitle/TPNativeSubtitleRenderParams;->lineSpace:F

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->startMargin:F

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/subtitle/TPNativeSubtitleRenderParams;->startMargin:F

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->endMargin:F

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/subtitle/TPNativeSubtitleRenderParams;->endMargin:F

    iget v1, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->verticalMargin:F

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/subtitle/TPNativeSubtitleRenderParams;->verticalMargin:F

    iget p0, p0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->fontScale:F

    iput p0, v0, Lcom/tencent/thumbplayer/tcmedia/core/subtitle/TPNativeSubtitleRenderParams;->fontScale:F

    return-object v0
.end method

.method private static b(J)I
    .locals 7

    .line 1
    .line 2
    const-class v0, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapSubtitleFontStyle;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMapUtil;->getEntrySetOfToNativeMap(Ljava/lang/Class;)Ljava/util/Set;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    .line 14
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    move-result v2

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    check-cast v2, Ljava/util/Map$Entry;

    .line 24
    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 27
    move-result-object v3

    .line 28
    .line 29
    check-cast v3, Ljava/lang/Number;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 33
    move-result v3

    .line 34
    int-to-long v3, v3

    .line 35
    and-long/2addr v3, p0

    .line 36
    .line 37
    const-wide/16 v5, 0x0

    .line 38
    .line 39
    cmp-long v3, v3, v5

    .line 40
    .line 41
    if-lez v3, :cond_0

    .line 42
    .line 43
    .line 44
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 45
    move-result-object v2

    .line 46
    .line 47
    check-cast v2, Ljava/lang/Number;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 51
    move-result v2

    .line 52
    or-int/2addr v1, v2

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    return v1
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
.end method
