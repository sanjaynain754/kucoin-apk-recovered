.class public Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$InnerAudioAVSyncStrategy;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$InnerFeatureType;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$InnerThreadPriority;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$InnerVideoHevcSeiType;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$InnerVideoH264SeiType;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$InnerMediaType;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$InnerSubtitleFormat;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$InnerAudioSampleFormat;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$InnerVideoColorSpace;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$InnerPixelFormat;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$InnerReduceLantencyType;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$InnerDrmType;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$InnerHDRType;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$InnerAudioCodecType;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$InnerVideoCodecType;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$InnerAudioDecoderType;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$InnerVideoDecoderType;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$InnerBufferStrategy;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$InnerDemuxerType;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$NativePropertyId;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$NativeConnectionConfig;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$NativeConnectionAction;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$NativeOptionalId;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$NativeInitConfig;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$TPOptionalId;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$OptionalIdType;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$TPMsgInfo;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$NativeMsgInfo;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$NativeErrorType;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$TPErrorType;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$NativeSwitchDefMode;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$TPSwitchDefMode;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$NativeSeekMode;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$TPSeekMode;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$TP_SUBTITLE_OUTPUT_TYPE;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$MEDIA_TYPE;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$TP_AUDIO_SAMPLE_FORMAT;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$TP_VIDEO_COLOR_SPACE;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$TP_VIDEO_PIXEL_FORMAT;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$PlayerType;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$TP_HDR_TYPE;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$TP_DRM_TYPE;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$TP_AUDIO_DECODER_TYPE;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$TP_AUDIO_CODEC_TYPE;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$TP_VIDEO_DECODER_TYPE;,
        Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$TP_VIDEO_CODEC_TYPE;
    }
.end annotation


# static fields
.field public static final MEDIA_TYPE_ATTACHMENT:I = 0x4
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapMediaType;
        value = 0x4
    .end annotation
.end field

.field public static final MEDIA_TYPE_AUDIO:I = 0x1
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapMediaType;
        value = 0x1
    .end annotation
.end field

.field public static final MEDIA_TYPE_DATA:I = 0x2
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapMediaType;
        value = 0x2
    .end annotation
.end field

.field public static final MEDIA_TYPE_SUBTITLE:I = 0x3
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapMediaType;
        value = 0x3
    .end annotation
.end field

.field public static final MEDIA_TYPE_UNKNOWN:I = -0x1
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapMediaType;
        value = -0x1
    .end annotation
.end field

.field public static final MEDIA_TYPE_VIDEO:I = 0x0
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapMediaType;
        value = 0x0
    .end annotation
.end field

.field public static final PLAYER_DESC_ID_ANDROIDPLAYER:I = 0x1

.field public static final PLAYER_DESC_ID_THUMBPLAYER:I = 0x2

.field public static final PLAYER_DESC_ID_THUMBPLAYER_SOFT:I = 0x3

.field public static final PLAYER_DESC_ID_UNKNOWN:I = 0x0

.field public static final TP_ACODEC_TYPE_AAC:I = 0x138a
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioCodecType;
        value = 0x138a
    .end annotation
.end field

.field public static final TP_ACODEC_TYPE_AC3:I = 0x138b
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioCodecType;
        value = 0x138b
    .end annotation
.end field

.field public static final TP_ACODEC_TYPE_DTS:I = 0x138c
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioCodecType;
        value = 0x138c
    .end annotation
.end field

.field public static final TP_ACODEC_TYPE_EAC3:I = 0x13b0
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioCodecType;
        value = 0x13b0
    .end annotation
.end field

.field public static final TP_ACODEC_TYPE_FLAC:I = 0x1394
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioCodecType;
        value = 0x1394
    .end annotation
.end field

.field public static final TP_ACODEC_TYPE_UNKNOWN:I = -0x1

.field public static final TP_AUDIO_DECODER_DOLBY:I = 0x4
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioDecoderType;
        value = 0x4
    .end annotation
.end field

.field public static final TP_AUDIO_DECODER_FFMPEG:I = 0x1
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioDecoderType;
        value = 0x1
    .end annotation
.end field

.field public static final TP_AUDIO_DECODER_MEDIACODEC:I = 0x2
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioDecoderType;
        value = 0x2
    .end annotation
.end field

.field public static final TP_AUDIO_DECODER_STANDALONE:I = 0x5
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioDecoderType;
        value = 0x5
    .end annotation
.end field

.field public static final TP_AUDIO_RENDERER_TYPE_AAUDIO:I = 0x2

.field public static final TP_AUDIO_RENDERER_TYPE_AUDIOTRACK:I = 0x1

.field public static final TP_AUDIO_RENDERER_TYPE_OBOE:I = 0x3

.field public static final TP_AUDIO_RENDERER_TYPE_OPENAL:I = 0x5

.field public static final TP_AUDIO_RENDERER_TYPE_OPENSL:I = 0x4

.field public static final TP_AUDIO_SAMPLE_FORMAT_DBL:I = 0x4
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioSampleFormat;
        value = 0x4
    .end annotation
.end field

.field public static final TP_AUDIO_SAMPLE_FORMAT_DBLP:I = 0x9
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioSampleFormat;
        value = 0x9
    .end annotation
.end field

.field public static final TP_AUDIO_SAMPLE_FORMAT_FLT:I = 0x3
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioSampleFormat;
        value = 0x3
    .end annotation
.end field

.field public static final TP_AUDIO_SAMPLE_FORMAT_FLTP:I = 0x8
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioSampleFormat;
        value = 0x8
    .end annotation
.end field

.field public static final TP_AUDIO_SAMPLE_FORMAT_NONE:I = -0x1
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioSampleFormat;
        value = -0x1
    .end annotation
.end field

.field public static final TP_AUDIO_SAMPLE_FORMAT_S16:I = 0x1
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioSampleFormat;
        value = 0x1
    .end annotation
.end field

.field public static final TP_AUDIO_SAMPLE_FORMAT_S16P:I = 0x6
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioSampleFormat;
        value = 0x6
    .end annotation
.end field

.field public static final TP_AUDIO_SAMPLE_FORMAT_S32:I = 0x2
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioSampleFormat;
        value = 0x2
    .end annotation
.end field

.field public static final TP_AUDIO_SAMPLE_FORMAT_S32P:I = 0x7
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioSampleFormat;
        value = 0x7
    .end annotation
.end field

.field public static final TP_AUDIO_SAMPLE_FORMAT_S64:I = 0xa
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioSampleFormat;
        value = 0xa
    .end annotation
.end field

.field public static final TP_AUDIO_SAMPLE_FORMAT_S64P:I = 0xb
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioSampleFormat;
        value = 0xb
    .end annotation
.end field

.field public static final TP_AUDIO_SAMPLE_FORMAT_U8:I = 0x0
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioSampleFormat;
        value = 0x0
    .end annotation
.end field

.field public static final TP_AUDIO_SAMPLE_FORMAT_U8P:I = 0x5
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapAudioSampleFormat;
        value = 0x5
    .end annotation
.end field

.field public static final TP_BUFFER_STRATEGY_AUTO:I = -0x1
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapBufferStrategy;
        value = -0x1
    .end annotation
.end field

.field public static final TP_BUFFER_STRATEGY_JITTER:I = 0x2
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapBufferStrategy;
        value = 0x2
    .end annotation
.end field

.field public static final TP_BUFFER_STRATEGY_MIN:I = 0x3
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapBufferStrategy;
        value = 0x3
    .end annotation
.end field

.field public static final TP_BUFFER_STRATEGY_NORMAL:I = 0x1
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapBufferStrategy;
        value = 0x1
    .end annotation
.end field

.field public static final TP_BUFFER_STRATEGY_UNABLE:I = 0x0
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapBufferStrategy;
        value = 0x0
    .end annotation
.end field

.field public static final TP_DECODER_UNKNOWN:I = -0x1

.field public static final TP_DEMUXER_FFMPEG:I = 0x0
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapDemuxerType;
        value = 0x0
    .end annotation
.end field

.field public static final TP_DEMUXER_STANDALONE:I = 0x1
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapDemuxerType;
        value = 0x1
    .end annotation
.end field

.field public static final TP_DEMUXER_UNKNOWN:I = -0x1
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapDemuxerType;
        value = -0x1
    .end annotation
.end field

.field public static final TP_DRM_TYPE_CHINADRM_2_0:I = 0x3
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapDrmType;
        value = 0x3
    .end annotation
.end field

.field public static final TP_DRM_TYPE_CHINADRM_HW:I = 0x2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final TP_DRM_TYPE_NONE:I = -0x1
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapDrmType;
        value = -0x1
    .end annotation
.end field

.field public static final TP_DRM_TYPE_UNITEND:I = 0x2
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapDrmType;
        value = 0x2
    .end annotation
.end field

.field public static final TP_DRM_TYPE_WIDEVINE_HW:I = 0x0
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapDrmType;
        value = 0x0
    .end annotation
.end field

.field public static final TP_HDR_TYPE_HDR10:I = 0x0
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapHdrType;
        value = 0x0
    .end annotation
.end field

.field public static final TP_HDR_TYPE_HDR10PLUS:I = 0x1
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapHdrType;
        value = 0x1
    .end annotation
.end field

.field public static final TP_HDR_TYPE_HDRDOLBYVISION:I = 0x2
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapHdrType;
        value = 0x2
    .end annotation
.end field

.field public static final TP_HDR_TYPE_HDRHLG:I = 0x3
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapHdrType;
        value = 0x3
    .end annotation
.end field

.field public static final TP_HDR_TYPE_HDRVIVID:I = 0x4
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapHdrType;
        value = 0x4
    .end annotation
.end field

.field public static final TP_REDUCE_LIVE_LATENCY_ACTION_NONE:I = 0x0
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapReduceLantencyType;
        value = 0x0
    .end annotation
.end field

.field public static final TP_REDUCE_LIVE_LATENCY_ACTION_SKIP_FRAME:I = 0x2
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapReduceLantencyType;
        value = 0x2
    .end annotation
.end field

.field public static final TP_REDUCE_LIVE_LATENCY_ACTION_SPEED_UP:I = 0x1
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapReduceLantencyType;
        value = 0x1
    .end annotation
.end field

.field public static final TP_RENDERER_TYPE_NONE:I = -0x1

.field public static final TP_SUBTITLE_OUTPUT_RGBA:I = 0x1

.field public static final TP_SUBTITLE_OUTPUT_TEXT:I = 0x0

.field public static final TP_VCODEC_TYPE_AV1:I = 0x405
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapCodecType;
        value = 0x405
    .end annotation
.end field

.field public static final TP_VCODEC_TYPE_AVS3:I = 0xc0
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapCodecType;
        value = 0xc0
    .end annotation
.end field

.field public static final TP_VCODEC_TYPE_H264:I = 0x1a
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapCodecType;
        value = 0x1a
    .end annotation
.end field

.field public static final TP_VCODEC_TYPE_HEVC:I = 0xac
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapCodecType;
        value = 0xac
    .end annotation
.end field

.field public static final TP_VCODEC_TYPE_UNKNOWN:I = 0x0
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapCodecType;
        value = -0x1
    .end annotation
.end field

.field public static final TP_VCODEC_TYPE_VP8:I = 0x8a
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapCodecType;
        value = 0x8a
    .end annotation
.end field

.field public static final TP_VCODEC_TYPE_VP9:I = 0xa6
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapCodecType;
        value = 0xa6
    .end annotation
.end field

.field public static final TP_VCODEC_TYPE_VVC:I = 0xc1
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapCodecType;
        value = 0xc1
    .end annotation
.end field

.field public static final TP_VIDEO_COLOR_SPACE_BT2020_CL:I = 0xa
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapVideoColorSpace;
        value = 0xa
    .end annotation
.end field

.field public static final TP_VIDEO_COLOR_SPACE_BT2020_NCL:I = 0x9
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapVideoColorSpace;
        value = 0x9
    .end annotation
.end field

.field public static final TP_VIDEO_COLOR_SPACE_BT470BG:I = 0x5
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapVideoColorSpace;
        value = 0x5
    .end annotation
.end field

.field public static final TP_VIDEO_COLOR_SPACE_BT709:I = 0x1
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapVideoColorSpace;
        value = 0x1
    .end annotation
.end field

.field public static final TP_VIDEO_COLOR_SPACE_CHROMA_DERIVED_CL:I = 0xd
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapVideoColorSpace;
        value = 0xd
    .end annotation
.end field

.field public static final TP_VIDEO_COLOR_SPACE_CHROMA_DERIVED_NCL:I = 0xc
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapVideoColorSpace;
        value = 0xc
    .end annotation
.end field

.field public static final TP_VIDEO_COLOR_SPACE_FCC:I = 0x4
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapVideoColorSpace;
        value = 0x4
    .end annotation
.end field

.field public static final TP_VIDEO_COLOR_SPACE_ICTCP:I = 0xe
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapVideoColorSpace;
        value = 0xe
    .end annotation
.end field

.field public static final TP_VIDEO_COLOR_SPACE_RESERVED:I = 0x3
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapVideoColorSpace;
        value = 0x3
    .end annotation
.end field

.field public static final TP_VIDEO_COLOR_SPACE_RGB:I = 0x0
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapVideoColorSpace;
        value = 0x0
    .end annotation
.end field

.field public static final TP_VIDEO_COLOR_SPACE_SMPTE170M:I = 0x6
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapVideoColorSpace;
        value = 0x6
    .end annotation
.end field

.field public static final TP_VIDEO_COLOR_SPACE_SMPTE2085:I = 0xb
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapVideoColorSpace;
        value = 0xb
    .end annotation
.end field

.field public static final TP_VIDEO_COLOR_SPACE_SMPTE240M:I = 0x7
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapVideoColorSpace;
        value = 0x7
    .end annotation
.end field

.field public static final TP_VIDEO_COLOR_SPACE_UNSPECIFIED:I = 0x2
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapVideoColorSpace;
        value = 0x2
    .end annotation
.end field

.field public static final TP_VIDEO_COLOR_SPACE_YCGCO:I = 0x8
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapVideoColorSpace;
        value = 0x8
    .end annotation
.end field

.field public static final TP_VIDEO_DECODER_FFMPEG:I = 0x65
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapVideoDecoderType;
        value = 0x65
    .end annotation
.end field

.field public static final TP_VIDEO_DECODER_MEDIACODEC:I = 0x66
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapVideoDecoderType;
        value = 0x66
    .end annotation
.end field

.field public static final TP_VIDEO_DECODER_STANDALONE:I = 0x68
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapVideoDecoderType;
        value = 0x68
    .end annotation
.end field

.field public static final TP_VIDEO_OUTPUT_FORMAT_NONE:I = -0x1
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapPixelFormat;
        value = -0x1
    .end annotation
.end field

.field public static final TP_VIDEO_OUTPUT_FORMAT_RGB565:I = 0x25
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapPixelFormat;
        value = 0x25
    .end annotation
.end field

.field public static final TP_VIDEO_OUTPUT_FORMAT_RGBA:I = 0x1a
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapPixelFormat;
        value = 0x1a
    .end annotation
.end field

.field public static final TP_VIDEO_OUTPUT_FORMAT_YUV420P:I = 0x0
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapPixelFormat;
        value = 0x0
    .end annotation
.end field

.field public static final TP_VIDEO_OUTPUT_FORMAT_YUVJ420P:I = 0xc
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapPixelFormat;
        value = 0xc
    .end annotation
.end field

.field public static final TP_VIDEO_RENDERER_TYPE_OPENGL:I = 0x65


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
