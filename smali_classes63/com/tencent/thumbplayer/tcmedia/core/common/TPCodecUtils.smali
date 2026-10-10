.class public Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$VideoSwCapabilityModel;,
        Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$DefinitionName;
    }
.end annotation


# static fields
.field public static final CAP_AUDIO_AAC:I = 0x8

.field public static final CAP_AUDIO_DD:I = 0x10

.field public static final CAP_AUDIO_DDP:I = 0x20

.field public static final CAP_AUDIO_DTS:I = 0x80

.field public static final CAP_AUDIO_FLAC:I = 0x40

.field public static final CAP_VIDEO_AVC:I = 0x1

.field public static final CAP_VIDEO_HEVC:I = 0x2

.field public static final CAP_VIDEO_VP8:I = 0x100

.field public static final CAP_VIDEO_VP9:I = 0x4

.field public static final PLAYER_LEVEL_0:I = 0x0

.field public static final PLAYER_LEVEL_1:I = 0x1

.field public static final PLAYER_LEVEL_11:I = 0xb

.field public static final PLAYER_LEVEL_16:I = 0x10

.field public static final PLAYER_LEVEL_21:I = 0x15

.field public static final PLAYER_LEVEL_26:I = 0x1a

.field public static final PLAYER_LEVEL_28:I = 0x1c

.field public static final PLAYER_LEVEL_33:I = 0x21

.field public static final PLAYER_LEVEL_6:I = 0x6

.field public static final PLAYER_LEVEL_UNKNOWN:I = -0x1

.field private static final TAG:Ljava/lang/String; = "TPCodecUtils"

.field private static final VVC_SHD_HISI_CPU_NAME:Ljava/lang/String; = "Kirin9000E"

.field private static final VVC_SHD_MTK_CPU_NAME:Ljava/lang/String; = "MT6893"

.field private static final VVC_SHD_QUALCOMMN_CPU_NAME:Ljava/lang/String; = "SM8250"

.field private static final VVC_SHD_SAMSUNG_CPU_NAME:Ljava/lang/String; = "Exynos2100"

.field private static mAACMaxSupportedBitrate:I = 0x7c830

.field private static mAACMaxSupportedChannels:I = 0x8

.field private static mAACMaxSupportedSamplerate:I = 0x17700

.field private static mAMediaCodecBlackListInstance:Ljava/util/ArrayList; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static mAMediaCodecBlackListModel:Ljava/util/ArrayList; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected static mAMediaCodecCapList:Ljava/util/ArrayList; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static mAV1SWMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability; = null

.field private static mAVCSWMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability; = null

.field private static mAVS3WMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability; = null

.field private static mAudioMaxCapCodecInstance:Ljava/util/HashMap; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static mAvs3DeviceLevel:I = -0x1

.field private static mCodecCapBlackList:Ljava/util/HashMap; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static mCodecCapWhiteList:Ljava/util/HashMap; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static mContext:Landroid/content/Context; = null

.field private static mDDPMaxSupportedBitrate:I = 0x5dc000

.field private static mDDPMaxSupportedChannels:I = 0x8

.field private static mDDPMaxSupportedSamplerate:I = 0xbb80

.field private static mDefinitionNameToDecodeLevelTable:Ljava/util/HashMap; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$DefinitionName;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static mDrmL1BlackList:Ljava/util/HashMap; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private static mFLACMaxSupportedBitrate:I = 0x1406f40

.field private static mFLACMaxSupportedChannels:I = 0x8

.field private static mFLACMaxSupportedSamplerate:I = 0x2ee00

.field private static mFhdAvs3HisiIndex:I = 0x0

.field private static mFhdAvs3QualcommIndex:I = 0x0

.field private static mHDRTypeToHDRHardwareCodecWhiteListMap:Ljava/util/HashMap; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;",
            ">;>;"
        }
    .end annotation
.end field

.field private static mHDRTypeToHDRSoftwareCodecWhiteListMap:Ljava/util/HashMap; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;",
            ">;>;"
        }
    .end annotation
.end field

.field private static mHDRVividSupportVersionMap:Ljava/util/HashMap; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;",
            ">;"
        }
    .end annotation
.end field

.field private static mHEVCSWMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability; = null

.field private static mHdHevcHisiIndex:I = 0x0

.field private static mHdHevcMtkIndex:I = 0x0

.field private static mHdHevcQualcommIndex:I = 0x0

.field private static mHdHevcSamsungIndex:I = 0x0

.field private static mHdrBlackMap:Ljava/util/HashMap; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;",
            ">;>;"
        }
    .end annotation
.end field

.field private static mHdrWhiteMap:Ljava/util/HashMap; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;",
            ">;>;"
        }
    .end annotation
.end field

.field private static mHevcDeviceLevel:I = -0x1

.field private static mIsFFmpegCapGot:Z = false

.field private static mIsInitDone:Z = false

.field private static mLocalCache:Lcom/tencent/thumbplayer/tcmedia/core/thirdparties/LocalCache; = null

.field private static mMaxACodecHwCapabilityMap:Ljava/util/HashMap; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;",
            ">;"
        }
    .end annotation
.end field

.field private static mMaxACodecSwCapabilityMap:Ljava/util/HashMap; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;",
            ">;"
        }
    .end annotation
.end field

.field private static mMaxVCodecHwCapabilityMap:Ljava/util/HashMap; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;",
            ">;"
        }
    .end annotation
.end field

.field private static mMaxVCodecSwCapabilityMap:Ljava/util/HashMap; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;",
            ">;"
        }
    .end annotation
.end field

.field private static mPreferredSoftwareComponent:Z = false

.field private static mShdAvs3QualcommIndex:I = 0x0

.field private static mShdHevcHisiIndex:I = 0x0

.field private static mShdHevcMtkIndex:I = 0x0

.field private static mShdHevcQualcommIndex:I = 0x0

.field private static mShdHevcSamsungIndex:I = 0x0

.field private static mSupportedMediaCodec:Ljava/util/ArrayList; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static mVMediaCodecBlackListModel:Ljava/util/ArrayList; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected static mVMediaCodecCapList:Ljava/util/ArrayList; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static mVP8SWMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability; = null

.field private static mVP9SWMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability; = null

.field private static mVVCSWMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability; = null

.field private static mVideoCodecIdToSwCapabilityModel:Landroid/util/SparseArray; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$VideoSwCapabilityModel;",
            ">;"
        }
    .end annotation
.end field

.field private static mVvcDeviceLevel:I = -0x1

.field private static mWideVineBlackListModel:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVMediaCodecCapList:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAMediaCodecCapList:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVMediaCodecBlackListModel:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAMediaCodecBlackListModel:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAMediaCodecBlackListInstance:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mSupportedMediaCodec:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHdrWhiteMap:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHdrBlackMap:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRTypeToHDRSoftwareCodecWhiteListMap:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRTypeToHDRHardwareCodecWhiteListMap:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAudioMaxCapCodecInstance:Ljava/util/HashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mWideVineBlackListModel:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mDrmL1BlackList:Ljava/util/HashMap;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mIsInitDone:Z

    sput-boolean v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mPreferredSoftwareComponent:Z

    const/16 v1, 0x20

    sput v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mShdHevcQualcommIndex:I

    const/16 v1, 0x14

    sput v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHdHevcQualcommIndex:I

    const/16 v1, 0xc

    sput v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mShdHevcMtkIndex:I

    const/16 v1, 0x8

    sput v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHdHevcMtkIndex:I

    sput v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mShdHevcHisiIndex:I

    const/4 v2, 0x3

    sput v2, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHdHevcHisiIndex:I

    sput v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mShdHevcSamsungIndex:I

    const/4 v1, 0x5

    sput v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHdHevcSamsungIndex:I

    const/16 v3, 0x3a

    sput v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mFhdAvs3QualcommIndex:I

    const/16 v3, 0x37

    sput v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mShdAvs3QualcommIndex:I

    const/16 v3, 0xe

    sput v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mFhdAvs3HisiIndex:I

    new-instance v3, Landroid/util/SparseArray;

    invoke-direct {v3}, Landroid/util/SparseArray;-><init>()V

    sput-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVideoCodecIdToSwCapabilityModel:Landroid/util/SparseArray;

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    sput-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mDefinitionNameToDecodeLevelTable:Ljava/util/HashMap;

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    sput-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mCodecCapWhiteList:Ljava/util/HashMap;

    const/16 v4, 0xb

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "NX511J"

    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mCodecCapWhiteList:Ljava/util/HashMap;

    const-string v6, "Hi3798MV100"

    invoke-virtual {v3, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mCodecCapWhiteList:Ljava/util/HashMap;

    const-string v6, "\u957f\u8679\u667a\u80fd\u7535\u89c6"

    invoke-virtual {v3, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mCodecCapWhiteList:Ljava/util/HashMap;

    const-string v7, "Android TV on Tcl 901"

    invoke-virtual {v3, v7, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mCodecCapWhiteList:Ljava/util/HashMap;

    const-string v7, "xt880b"

    invoke-virtual {v3, v7, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mSupportedMediaCodec:Ljava/util/ArrayList;

    const-string v4, "video/avc"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mSupportedMediaCodec:Ljava/util/ArrayList;

    const-string v4, "video/hevc"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mSupportedMediaCodec:Ljava/util/ArrayList;

    const-string v4, "video/x-vnd.on2.vp8"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mSupportedMediaCodec:Ljava/util/ArrayList;

    const-string v4, "video/x-vnd.on2.vp9"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mSupportedMediaCodec:Ljava/util/ArrayList;

    const-string v4, "video/av01"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mSupportedMediaCodec:Ljava/util/ArrayList;

    const-string v4, "audio/mp4a-latm"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mSupportedMediaCodec:Ljava/util/ArrayList;

    const-string v4, "audio/ac3"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mSupportedMediaCodec:Ljava/util/ArrayList;

    const-string v4, "audio/eac3"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mSupportedMediaCodec:Ljava/util/ArrayList;

    const-string v4, "audio/eac3-joc"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mSupportedMediaCodec:Ljava/util/ArrayList;

    const-string v4, "audio/flac"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mSupportedMediaCodec:Ljava/util/ArrayList;

    const-string v4, "audio/vnd.dts"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAMediaCodecBlackListInstance:Ljava/util/ArrayList;

    const-string v4, "OMX.qti.audio.decoder.flac"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVMediaCodecBlackListModel:Ljava/util/ArrayList;

    const-string v4, "SM-J7008"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVMediaCodecBlackListModel:Ljava/util/ArrayList;

    const-string v4, "SM-J5008"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVMediaCodecBlackListModel:Ljava/util/ArrayList;

    const-string v4, "TCL i806"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVMediaCodecBlackListModel:Ljava/util/ArrayList;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVMediaCodecBlackListModel:Ljava/util/ArrayList;

    const-string v4, "vivo Y11i T"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVMediaCodecBlackListModel:Ljava/util/ArrayList;

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVMediaCodecBlackListModel:Ljava/util/ArrayList;

    const-string v4, "MI 1S"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVMediaCodecBlackListModel:Ljava/util/ArrayList;

    const-string v4, "SP9832A"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVMediaCodecBlackListModel:Ljava/util/ArrayList;

    const-string v4, "SP9830A"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVMediaCodecBlackListModel:Ljava/util/ArrayList;

    const-string v4, "VOTO GT17"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVMediaCodecBlackListModel:Ljava/util/ArrayList;

    const-string v4, "EVA-AL10"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    const v5, 0x98967f

    const v6, 0x10c985

    const/16 v7, 0x63

    invoke-direct {v4, v5, v6, v7, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v8, "TAS-AL00"

    invoke-virtual {v3, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v4, v5, v6, v7, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v8, "TAS-TL00"

    invoke-virtual {v3, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v4, v5, v6, v7, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v8, "TAS-AN00"

    invoke-virtual {v3, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v4, v5, v6, v7, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v8, "LIO-AN00"

    invoke-virtual {v3, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v4, v5, v6, v7, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v8, "LIO-AN00P"

    invoke-virtual {v3, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v4, v5, v6, v7, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v8, "LIO-AN00m"

    invoke-virtual {v3, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v4, v5, v6, v7, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v8, "LIO-TL00"

    invoke-virtual {v3, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v4, v5, v6, v7, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v8, "LIO-AL00"

    invoke-virtual {v3, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v4, v5, v6, v7, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v8, "ANA-AN00"

    invoke-virtual {v3, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v4, v5, v6, v7, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v8, "ANA-TN00"

    invoke-virtual {v3, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v4, v5, v6, v7, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v8, "ELS-AN00"

    invoke-virtual {v3, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v4, v5, v6, v7, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v6, "ELS-TN00"

    invoke-virtual {v3, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    const v6, 0x10c986

    invoke-direct {v4, v5, v6, v7, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v6, "ELS-AN10"

    invoke-virtual {v3, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    const v6, 0x10c976

    invoke-direct {v4, v5, v6, v7, v1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v8, "MRX-AL09"

    invoke-virtual {v3, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v4, v5, v6, v7, v1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v8, "MRX-AL19"

    invoke-virtual {v3, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v4, v5, v6, v7, v1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v8, "MRX-W09"

    invoke-virtual {v3, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v4, v5, v6, v7, v1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v8, "MRX-W19"

    invoke-virtual {v3, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v4, v5, v6, v7, v1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v8, "MRX-AN19"

    invoke-virtual {v3, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v4, v5, v6, v7, v1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v8, "MRX-W29"

    invoke-virtual {v3, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v4, v5, v6, v7, v1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v1, "MRX-W39"

    invoke-virtual {v3, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v0, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "OCE-AN00"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v0, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "OCE-AN10"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v0, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "OCE-AL50"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v0, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "OCE-AN50"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v0, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "NOH-NX9"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v0, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "NOH-AN00"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v0, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "NOH-AN01"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v0, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "NOH-AL00"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v0, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "NOP-AN00"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v0, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "JAD-AN00"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v0, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "JAD-AN10"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v0, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "JAD-AL50"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v0, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "JAD-AL60"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v0, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "JAD-N29"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v0, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "JAD-N09"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    const v4, 0x30dfb

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v6, "HEGE-550"

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v6, "HEGE-550B"

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v6, "HEGE-550C"

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v6, "HEGE-550X"

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v6, "HEGE-550AX"

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v6, "HEGE-560"

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v6, "HEGE-560B"

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "HEGE-570"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    const v4, 0x30dec

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "PLAT-760"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    const v4, 0x30df9

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v6, "KANT-350"

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v6, "KANT-350B"

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v6, "KANT-350C"

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v6, "KANT-350S"

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v6, "KANT-360"

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v6, "KANT-360S"

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v6, "KANT-370"

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "KANT-370S"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    const v4, 0x30df7

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v6, "KANT-359"

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "KANT-369"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v0, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "THAL-550"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v0, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "THAL-560"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v0, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "THAL-570"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v0, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "THAL-580"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v0, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "FREG-770"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v0, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "DESC-220"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    const v4, 0x9ba5ed

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v6, "DESC-250SY"

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v6, "DESC-250S"

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v6, "DESC-250SZ"

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v6, "DESC-250"

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v6, "DESC-260SY"

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v6, "DESC-260S"

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v6, "DESC-260SZ"

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "DESC-260"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    const v4, 0x9ba5e3

    invoke-direct {v3, v5, v4, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "DESC-270"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v0, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "SOKR-790A"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    invoke-direct {v3, v5, v0, v7, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;-><init>(IIII)V

    const-string v4, "VOLT-350S"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mWideVineBlackListModel:Ljava/util/ArrayList;

    const-string v3, "RVL-AL09"

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mWideVineBlackListModel:Ljava/util/ArrayList;

    const-string v3, "CLT-L29"

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mWideVineBlackListModel:Ljava/util/ArrayList;

    const-string v3, "ASUS_Z00AD"

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mDrmL1BlackList:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mWideVineBlackListModel:Ljava/util/ArrayList;

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVideoCodecIdToSwCapabilityModel:Landroid/util/SparseArray;

    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$VideoSwCapabilityModel$Builder;

    invoke-direct {v3}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$VideoSwCapabilityModel$Builder;-><init>()V

    sget-object v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$DefinitionName;->DEFINITION_720P:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$DefinitionName;

    const-string v5, "SM8250"

    invoke-virtual {v3, v0, v4, v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$VideoSwCapabilityModel$Builder;->addVideoDecCap(ILcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$DefinitionName;Ljava/lang/String;)Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$VideoSwCapabilityModel$Builder;

    move-result-object v3

    const/4 v5, 0x1

    const-string v6, "MT6893"

    invoke-virtual {v3, v5, v4, v6}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$VideoSwCapabilityModel$Builder;->addVideoDecCap(ILcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$DefinitionName;Ljava/lang/String;)Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$VideoSwCapabilityModel$Builder;

    move-result-object v3

    const/4 v5, 0x2

    const-string v6, "Kirin9000E"

    invoke-virtual {v3, v5, v4, v6}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$VideoSwCapabilityModel$Builder;->addVideoDecCap(ILcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$DefinitionName;Ljava/lang/String;)Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$VideoSwCapabilityModel$Builder;

    move-result-object v3

    const-string v5, "Exynos2100"

    invoke-virtual {v3, v2, v4, v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$VideoSwCapabilityModel$Builder;->addVideoDecCap(ILcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$DefinitionName;Ljava/lang/String;)Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$VideoSwCapabilityModel$Builder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$VideoSwCapabilityModel$Builder;->build()Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$VideoSwCapabilityModel;

    move-result-object v2

    const/16 v3, 0xc1

    invoke-virtual {v1, v3, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mDefinitionNameToDecodeLevelTable:Ljava/util/HashMap;

    const/16 v2, 0x15

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sput-boolean v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mIsFFmpegCapGot:Z

    new-instance v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    const/16 v2, 0x1e

    invoke-direct {v1, v0, v0, v0, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;-><init>(IIII)V

    sput-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAVCSWMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    new-instance v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    invoke-direct {v1, v0, v0, v0, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;-><init>(IIII)V

    sput-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHEVCSWMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    new-instance v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    invoke-direct {v1, v0, v0, v0, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;-><init>(IIII)V

    sput-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVP9SWMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    new-instance v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    invoke-direct {v1, v0, v0, v0, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;-><init>(IIII)V

    sput-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAVS3WMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    new-instance v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    invoke-direct {v1, v0, v0, v0, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;-><init>(IIII)V

    sput-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAV1SWMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    new-instance v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    invoke-direct {v1, v0, v0, v0, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;-><init>(IIII)V

    sput-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVP8SWMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    new-instance v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    invoke-direct {v1, v0, v0, v0, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;-><init>(IIII)V

    sput-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVVCSWMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxVCodecHwCapabilityMap:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxVCodecSwCapabilityMap:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxACodecHwCapabilityMap:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxACodecSwCapabilityMap:Ljava/util/HashMap;

    return-void
.end method

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
.end method

.method public static synthetic access$102(Z)Z
    .locals 0

    .line 1
    .line 2
    sput-boolean p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mIsInitDone:Z

    .line 3
    return p0
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
.end method

.method public static addDRMLevel1Blacklist(I)Z
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mDrmL1BlackList:Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mDrmL1BlackList:Ljava/util/HashMap;

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    check-cast v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getDeviceName()Ljava/lang/String;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 32
    move-result v1

    .line 33
    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getDeviceName()Ljava/lang/String;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    :cond_0
    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mDrmL1BlackList:Ljava/util/HashMap;

    .line 44
    .line 45
    .line 46
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mDrmL1BlackList:Ljava/util/HashMap;

    .line 53
    .line 54
    .line 55
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    move-result-object p0

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    :cond_1
    const/4 p0, 0x1

    .line 61
    return p0
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
.end method

.method public static addHDRBlackList(ILjava/lang/String;Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;)Z
    .locals 3

    .line 1
    .line 2
    if-nez p2, :cond_0

    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    .line 6
    :cond_0
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHdrBlackMap:Ljava/util/HashMap;

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHdrBlackMap:Ljava/util/HashMap;

    .line 19
    .line 20
    .line 21
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    check-cast v0, Ljava/util/HashMap;

    .line 29
    .line 30
    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHdrBlackMap:Ljava/util/HashMap;

    .line 31
    .line 32
    .line 33
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 41
    move-result v1

    .line 42
    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    sget-object p1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHdrBlackMap:Ljava/util/HashMap;

    .line 55
    .line 56
    .line 57
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    move-result-object p0

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    goto :goto_1

    .line 63
    .line 64
    :cond_2
    new-instance v0, Ljava/util/HashMap;

    .line 65
    .line 66
    .line 67
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 68
    goto :goto_0

    .line 69
    :goto_1
    const/4 p0, 0x1

    .line 70
    return p0
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
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
.end method

.method private static addHDRVersionRangeToWhiteList(ILcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;Ljava/util/HashMap;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Ljava/util/ArrayList;

    .line 21
    goto :goto_0

    .line 22
    .line 23
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 27
    :goto_0
    const/4 v1, 0x0

    .line 28
    .line 29
    .line 30
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 31
    move-result v2

    .line 32
    .line 33
    if-ge v1, v2, :cond_2

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    check-cast v2, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->isTheSameVersionRange(Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;)Z

    .line 43
    move-result v2

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    return-void

    .line 47
    .line 48
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 49
    goto :goto_1

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    move-result-object p0

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    return-void
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
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
.end method

.method public static addHDRVideoDecoderTypeWhiteList(IILcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;)Z
    .locals 2

    .line 1
    .line 2
    const/16 v0, 0x65

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eq p1, v0, :cond_1

    .line 6
    .line 7
    const/16 v0, 0x66

    .line 8
    .line 9
    if-eq p1, v0, :cond_0

    .line 10
    .line 11
    const-string p0, "TPCodecUtils"

    .line 12
    .line 13
    const-string p1, "addHDRVideoDecoderTypeWhiteList, decoder not support."

    .line 14
    const/4 p2, 0x3

    .line 15
    .line 16
    .line 17
    invoke-static {p2, p0, p1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    .line 18
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    .line 21
    :cond_0
    sget-object p1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRTypeToHDRHardwareCodecWhiteListMap:Ljava/util/HashMap;

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-static {p0, p2, p1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->addHDRVersionRangeToWhiteList(ILcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;Ljava/util/HashMap;)V

    .line 25
    return v1

    .line 26
    .line 27
    :cond_1
    sget-object p1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRTypeToHDRSoftwareCodecWhiteListMap:Ljava/util/HashMap;

    .line 28
    goto :goto_0
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
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
.end method

.method public static addHDRWhiteList(ILjava/lang/String;Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;)Z
    .locals 3

    .line 1
    .line 2
    if-nez p2, :cond_0

    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    .line 6
    :cond_0
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHdrWhiteMap:Ljava/util/HashMap;

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHdrWhiteMap:Ljava/util/HashMap;

    .line 19
    .line 20
    .line 21
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    check-cast v0, Ljava/util/HashMap;

    .line 29
    .line 30
    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHdrWhiteMap:Ljava/util/HashMap;

    .line 31
    .line 32
    .line 33
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 41
    move-result v1

    .line 42
    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    sget-object p1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHdrWhiteMap:Ljava/util/HashMap;

    .line 55
    .line 56
    .line 57
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    move-result-object p0

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    goto :goto_1

    .line 63
    .line 64
    :cond_2
    new-instance v0, Ljava/util/HashMap;

    .line 65
    .line 66
    .line 67
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 68
    goto :goto_0

    .line 69
    :goto_1
    const/4 p0, 0x1

    .line 70
    return p0
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
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
.end method

.method public static checkHDRVividSupportByVersion(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 13

    .line 1
    .line 2
    const-string v0, "."

    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x3

    .line 6
    .line 7
    .line 8
    filled-new-array {v1, v2, v2, v3}, [I

    .line 9
    move-result-object v4

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    move-result v5

    .line 14
    .line 15
    const-string v6, "TPCodecUtils"

    .line 16
    const/4 v7, -0x1

    .line 17
    const/4 v8, 0x4

    .line 18
    const/4 v9, 0x0

    .line 19
    .line 20
    if-nez v5, :cond_8

    .line 21
    .line 22
    const-string v5, "\\."

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 26
    move-result-object v5

    .line 27
    array-length v10, v5

    .line 28
    .line 29
    if-ne v10, v8, :cond_8

    .line 30
    .line 31
    aget-object v10, v5, v9

    .line 32
    .line 33
    const-string v11, " "

    .line 34
    .line 35
    .line 36
    invoke-virtual {v10, v11}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 37
    move-result-object v10

    .line 38
    array-length v11, v10

    .line 39
    .line 40
    if-ne v11, v1, :cond_0

    .line 41
    .line 42
    aget-object v10, v10, v2

    .line 43
    .line 44
    if-eqz v10, :cond_0

    .line 45
    .line 46
    aput-object v10, v5, v9

    .line 47
    .line 48
    :cond_0
    aget-object v10, v5, v3

    .line 49
    .line 50
    const-string v11, "\\("

    .line 51
    .line 52
    .line 53
    invoke-virtual {v10, v11}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 54
    move-result-object v10

    .line 55
    array-length v11, v10

    .line 56
    .line 57
    if-ne v11, v1, :cond_1

    .line 58
    .line 59
    aget-object v10, v10, v9

    .line 60
    .line 61
    if-eqz v10, :cond_1

    .line 62
    .line 63
    aput-object v10, v5, v3

    .line 64
    :cond_1
    move v10, v9

    .line 65
    .line 66
    :goto_0
    if-ge v10, v8, :cond_3

    .line 67
    .line 68
    aget-object v11, v5, v10

    .line 69
    .line 70
    if-eqz v11, :cond_8

    .line 71
    .line 72
    .line 73
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 74
    move-result v11

    .line 75
    .line 76
    aget v12, v4, v10

    .line 77
    .line 78
    if-eq v11, v12, :cond_2

    .line 79
    .line 80
    goto/16 :goto_7

    .line 81
    .line 82
    :cond_2
    add-int/lit8 v10, v10, 0x1

    .line 83
    goto :goto_0

    .line 84
    .line 85
    .line 86
    :cond_3
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 87
    move-result v4

    .line 88
    .line 89
    if-ne v4, v7, :cond_4

    .line 90
    move v5, v9

    .line 91
    goto :goto_1

    .line 92
    .line 93
    :cond_4
    add-int/lit8 v5, v4, -0x2

    .line 94
    .line 95
    .line 96
    invoke-static {p1, v5, v4}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getValueFromSubstring(Ljava/lang/String;II)I

    .line 97
    move-result v5
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_3

    .line 98
    :goto_1
    add-int/2addr v4, v2

    .line 99
    .line 100
    .line 101
    :try_start_1
    invoke-virtual {p1, v0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 102
    move-result v4

    .line 103
    .line 104
    if-ne v4, v7, :cond_5

    .line 105
    move v10, v9

    .line 106
    goto :goto_2

    .line 107
    .line 108
    :cond_5
    add-int/lit8 v10, v4, -0x1

    .line 109
    .line 110
    .line 111
    invoke-static {p1, v10, v4}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getValueFromSubstring(Ljava/lang/String;II)I

    .line 112
    move-result v10
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_2

    .line 113
    :goto_2
    add-int/2addr v4, v2

    .line 114
    .line 115
    .line 116
    :try_start_2
    invoke-virtual {p1, v0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 117
    move-result v0

    .line 118
    .line 119
    if-ne v0, v7, :cond_6

    .line 120
    move v4, v9

    .line 121
    goto :goto_3

    .line 122
    .line 123
    :cond_6
    add-int/lit8 v4, v0, -0x1

    .line 124
    .line 125
    .line 126
    invoke-static {p1, v4, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getValueFromSubstring(Ljava/lang/String;II)I

    .line 127
    move-result v4
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 128
    .line 129
    :goto_3
    if-ne v0, v7, :cond_7

    .line 130
    goto :goto_5

    .line 131
    .line 132
    :cond_7
    add-int/lit8 v11, v0, 0x1

    .line 133
    add-int/2addr v0, v8

    .line 134
    .line 135
    .line 136
    :try_start_3
    invoke-static {p1, v11, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getValueFromSubstring(Ljava/lang/String;II)I

    .line 137
    move-result p1
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_0

    .line 138
    goto :goto_6

    .line 139
    :catch_0
    move-exception p1

    .line 140
    goto :goto_4

    .line 141
    :catch_1
    move-exception p1

    .line 142
    move v4, v9

    .line 143
    goto :goto_4

    .line 144
    :catch_2
    move-exception p1

    .line 145
    move v4, v9

    .line 146
    move v10, v4

    .line 147
    goto :goto_4

    .line 148
    :catch_3
    move-exception p1

    .line 149
    move v4, v9

    .line 150
    move v5, v4

    .line 151
    move v10, v5

    .line 152
    .line 153
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    const-string v11, "checkHDRVividSupportByVersion failed(versionValue):"

    .line 156
    .line 157
    .line 158
    invoke-direct {v0, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 162
    move-result-object p1

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    move-result-object p1

    .line 170
    .line 171
    .line 172
    invoke-static {v8, v6, p1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    .line 173
    :goto_5
    move p1, v9

    .line 174
    .line 175
    .line 176
    :goto_6
    const v0, 0x186a0

    .line 177
    mul-int/2addr v5, v0

    .line 178
    .line 179
    mul-int/lit16 v10, v10, 0x2710

    .line 180
    add-int/2addr v5, v10

    .line 181
    .line 182
    mul-int/lit16 v4, v4, 0x3e8

    .line 183
    add-int/2addr v5, v4

    .line 184
    add-int/2addr v5, p1

    .line 185
    goto :goto_8

    .line 186
    :cond_8
    :goto_7
    move v5, v9

    .line 187
    .line 188
    .line 189
    :goto_8
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 190
    move-result p1

    .line 191
    .line 192
    if-nez p1, :cond_a

    .line 193
    .line 194
    const-string p1, "patch"

    .line 195
    .line 196
    .line 197
    invoke-virtual {p2, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 198
    move-result-object v0

    .line 199
    array-length v4, v0

    .line 200
    .line 201
    if-ne v4, v1, :cond_a

    .line 202
    .line 203
    aget-object v0, v0, v2

    .line 204
    .line 205
    if-eqz v0, :cond_a

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 209
    move-result v0

    .line 210
    .line 211
    if-ne v0, v3, :cond_a

    .line 212
    .line 213
    .line 214
    :try_start_4
    invoke-virtual {p2, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 215
    move-result p1

    .line 216
    .line 217
    if-ne p1, v7, :cond_9

    .line 218
    goto :goto_9

    .line 219
    .line 220
    :cond_9
    add-int/lit8 v0, p1, 0x5

    .line 221
    .line 222
    add-int/lit8 p1, p1, 0x7

    .line 223
    .line 224
    .line 225
    invoke-static {p2, v0, p1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getValueFromSubstring(Ljava/lang/String;II)I

    .line 226
    move-result p1
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_4

    .line 227
    goto :goto_a

    .line 228
    :catch_4
    move-exception p1

    .line 229
    .line 230
    new-instance v0, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    const-string v3, "checkHDRVividSupportByVersion failed(patchValue):"

    .line 233
    .line 234
    .line 235
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 239
    move-result-object p1

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    move-result-object p1

    .line 247
    .line 248
    .line 249
    invoke-static {v8, v6, p1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    .line 250
    :cond_a
    :goto_9
    move p1, v9

    .line 251
    .line 252
    .line 253
    :goto_a
    invoke-static {p0, v5, p1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->isInHDRVividWhiteList(Ljava/lang/String;II)Z

    .line 254
    move-result v0

    .line 255
    .line 256
    const-string v3, " patch:"

    .line 257
    .line 258
    const-string v4, " version:"

    .line 259
    .line 260
    if-eqz v0, :cond_b

    .line 261
    .line 262
    new-instance p1, Ljava/lang/StringBuilder;

    .line 263
    .line 264
    const-string v0, "checkHDRVividSupportByVersion in HDRVivid whitelist, model:"

    .line 265
    .line 266
    .line 267
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 286
    move-result-object p0

    .line 287
    .line 288
    .line 289
    invoke-static {v1, v6, p0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    .line 290
    return v2

    .line 291
    .line 292
    .line 293
    :cond_b
    invoke-static {p0, v5, p1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->isInHDRVividBlackList(Ljava/lang/String;II)Z

    .line 294
    move-result v0

    .line 295
    .line 296
    if-eqz v0, :cond_c

    .line 297
    .line 298
    new-instance p1, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    const-string v0, "checkHDRVividSupportByVersion in HDRVivid blacklist, model:"

    .line 301
    .line 302
    .line 303
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 322
    move-result-object p0

    .line 323
    .line 324
    .line 325
    invoke-static {v1, v6, p0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    .line 326
    return v9

    .line 327
    .line 328
    :cond_c
    sget-object p2, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    .line 329
    .line 330
    .line 331
    invoke-virtual {p2, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 332
    move-result p2

    .line 333
    .line 334
    if-eqz p2, :cond_e

    .line 335
    .line 336
    sget-object p2, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRVividSupportVersionMap:Ljava/util/HashMap;

    .line 337
    .line 338
    .line 339
    invoke-virtual {p2, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    move-result-object p0

    .line 341
    .line 342
    check-cast p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    .line 343
    .line 344
    iget p2, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;->upperboundSystemVersion:I

    .line 345
    .line 346
    if-gt v5, p2, :cond_e

    .line 347
    .line 348
    iget p2, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;->lowerboundSystemVersion:I

    .line 349
    .line 350
    if-le v5, p2, :cond_d

    .line 351
    return v2

    .line 352
    .line 353
    :cond_d
    if-ne v5, p2, :cond_e

    .line 354
    .line 355
    iget p2, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;->upperboundPatchVersion:I

    .line 356
    .line 357
    if-gt p1, p2, :cond_e

    .line 358
    .line 359
    iget p0, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;->lowerboundPatchVersion:I

    .line 360
    .line 361
    if-lt p1, p0, :cond_e

    .line 362
    return v2

    .line 363
    :cond_e
    return v9
.end method

.method private static convertDefinitionNameToDecodeLevel(Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$DefinitionName;)I
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mDefinitionNameToDecodeLevelTable:Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Ljava/lang/Integer;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, -0x1

    .line 17
    return p0
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
.end method

.method public static convertDolbyVisionToOmxLevel(I)I
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    shl-int/2addr v0, p0

    .line 3
    .line 4
    const-string v1, "TPCodecUtils"

    .line 5
    const/4 v2, 0x2

    .line 6
    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    const/16 v3, 0x100

    .line 10
    .line 11
    if-gt v0, v3, :cond_0

    .line 12
    .line 13
    new-instance v3, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v4, "convertDolbyVisionToOmxLevel dolbyVisionLevel:"

    .line 16
    .line 17
    .line 18
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string p0, " omxLevel:"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    move-result-object p0

    .line 34
    .line 35
    .line 36
    invoke-static {v2, v1, p0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    .line 37
    return v0

    .line 38
    .line 39
    :cond_0
    const-string v0, "convertDolbyVisionToOmxLevel Unsupported level"

    .line 40
    .line 41
    .line 42
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 43
    move-result-object v3

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    .line 50
    invoke-static {v2, v1, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    .line 51
    return p0
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
.end method

.method public static convertDolbyVisionToOmxProfile(I)I
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    shl-int/2addr v0, p0

    .line 3
    .line 4
    const-string v1, "TPCodecUtils"

    .line 5
    const/4 v2, 0x2

    .line 6
    .line 7
    if-lez p0, :cond_0

    .line 8
    .line 9
    const/16 v3, 0x200

    .line 10
    .line 11
    if-gt p0, v3, :cond_0

    .line 12
    .line 13
    new-instance v3, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v4, "convertDolbyVisionToOmxProfile dolbyVisionProfile:"

    .line 16
    .line 17
    .line 18
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string p0, " omxProfile:"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    move-result-object p0

    .line 34
    .line 35
    .line 36
    invoke-static {v2, v1, p0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    .line 37
    return v0

    .line 38
    .line 39
    :cond_0
    const-string v0, "convertDolbyVisionToOmxProfile Unsupported profile"

    .line 40
    .line 41
    .line 42
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 43
    move-result-object v3

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    .line 50
    invoke-static {v2, v1, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    .line 51
    return p0
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
.end method

.method public static enableDrmL3(Z)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getDeviceName()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    sget-object p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mWideVineBlackListModel:Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 17
    move-result p0

    .line 18
    .line 19
    if-nez p0, :cond_1

    .line 20
    .line 21
    sget-object p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mWideVineBlackListModel:Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getDeviceName()Ljava/lang/String;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    :goto_0
    sget-object p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mDrmL1BlackList:Ljava/util/HashMap;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    sget-object p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mDrmL1BlackList:Ljava/util/HashMap;

    .line 36
    .line 37
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mWideVineBlackListModel:Ljava/util/ArrayList;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    return-void

    .line 42
    .line 43
    :cond_0
    sget-object p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mWideVineBlackListModel:Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 47
    move-result p0

    .line 48
    .line 49
    if-eqz p0, :cond_1

    .line 50
    .line 51
    sget-object p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mWideVineBlackListModel:Ljava/util/ArrayList;

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getDeviceName()Ljava/lang/String;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    return-void
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
.end method

.method public static declared-synchronized getACodecSWMaxCapabilityMap()Ljava/util/HashMap;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    const-class v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;

    .line 3
    monitor-enter v1

    .line 4
    .line 5
    :try_start_0
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxACodecSwCapabilityMap:Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxACodecSwCapabilityMap:Ljava/util/HashMap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    monitor-exit v1

    .line 15
    return-object v0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    :try_start_1
    new-instance v2, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    .line 20
    .line 21
    sget v5, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAACMaxSupportedSamplerate:I

    .line 22
    .line 23
    sget v6, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAACMaxSupportedBitrate:I

    .line 24
    .line 25
    sget v7, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAACMaxSupportedChannels:I

    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v2 .. v7}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;-><init>(IIIII)V

    .line 31
    .line 32
    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    .line 33
    .line 34
    sget v6, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mFLACMaxSupportedSamplerate:I

    .line 35
    .line 36
    sget v7, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mFLACMaxSupportedBitrate:I

    .line 37
    .line 38
    sget v8, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mFLACMaxSupportedChannels:I

    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x0

    .line 41
    .line 42
    .line 43
    invoke-direct/range {v3 .. v8}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;-><init>(IIIII)V

    .line 44
    .line 45
    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    .line 46
    .line 47
    sget v7, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mDDPMaxSupportedSamplerate:I

    .line 48
    .line 49
    sget v8, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mDDPMaxSupportedBitrate:I

    .line 50
    .line 51
    sget v9, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mDDPMaxSupportedChannels:I

    .line 52
    const/4 v5, 0x0

    .line 53
    const/4 v6, 0x0

    .line 54
    .line 55
    .line 56
    invoke-direct/range {v4 .. v9}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;-><init>(IIIII)V

    .line 57
    .line 58
    new-instance v5, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    .line 59
    .line 60
    sget v8, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mDDPMaxSupportedSamplerate:I

    .line 61
    .line 62
    sget v9, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mDDPMaxSupportedBitrate:I

    .line 63
    .line 64
    sget v10, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mDDPMaxSupportedChannels:I

    .line 65
    const/4 v6, 0x0

    .line 66
    const/4 v7, 0x0

    .line 67
    .line 68
    .line 69
    invoke-direct/range {v5 .. v10}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;-><init>(IIIII)V

    .line 70
    .line 71
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxACodecSwCapabilityMap:Ljava/util/HashMap;

    .line 72
    .line 73
    const/16 v6, 0x138a

    .line 74
    .line 75
    .line 76
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    move-result-object v6

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxACodecSwCapabilityMap:Ljava/util/HashMap;

    .line 83
    .line 84
    const/16 v2, 0x1394

    .line 85
    .line 86
    .line 87
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    move-result-object v2

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxACodecSwCapabilityMap:Ljava/util/HashMap;

    .line 94
    .line 95
    const/16 v2, 0x138b

    .line 96
    .line 97
    .line 98
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    move-result-object v2

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxACodecSwCapabilityMap:Ljava/util/HashMap;

    .line 105
    .line 106
    const/16 v2, 0x13b0

    .line 107
    .line 108
    .line 109
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    move-result-object v2

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxACodecSwCapabilityMap:Ljava/util/HashMap;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 116
    monitor-exit v1

    .line 117
    return-object v0

    .line 118
    .line 119
    :catch_0
    :try_start_2
    const-string v0, "TPCodecUtils"

    .line 120
    .line 121
    const-string v2, "getACodecSWMaxCapabilityMap exception"

    .line 122
    const/4 v3, 0x4

    .line 123
    .line 124
    .line 125
    invoke-static {v3, v0, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 126
    monitor-exit v1

    .line 127
    const/4 v0, 0x0

    .line 128
    return-object v0

    .line 129
    :goto_0
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 130
    throw v0
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
.end method

.method public static declared-synchronized getAMediaCodecMaxCapabilityMap()Ljava/util/HashMap;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    const-class v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;

    .line 3
    monitor-enter v1

    .line 4
    .line 5
    :try_start_0
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxACodecHwCapabilityMap:Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxACodecHwCapabilityMap:Ljava/util/HashMap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    monitor-exit v1

    .line 15
    return-object v0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    .line 18
    goto/16 :goto_4

    .line 19
    .line 20
    :cond_0
    :try_start_1
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mLocalCache:Lcom/tencent/thumbplayer/tcmedia/core/thirdparties/LocalCache;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderList;->getTPMediaDecoderInfos(Lcom/tencent/thumbplayer/tcmedia/core/thirdparties/LocalCache;)[Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;

    .line 24
    move-result-object v0

    .line 25
    array-length v2, v0

    .line 26
    const/4 v3, 0x0

    .line 27
    .line 28
    :goto_0
    if-ge v3, v2, :cond_4

    .line 29
    .line 30
    aget-object v4, v0, v3

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getDecoderMimeType()Ljava/lang/String;

    .line 34
    move-result-object v5

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->isAudio()Z

    .line 38
    move-result v6

    .line 39
    .line 40
    if-eqz v6, :cond_3

    .line 41
    .line 42
    .line 43
    invoke-static {v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->isSupportedMediaCodec(Ljava/lang/String;)Z

    .line 44
    move-result v6

    .line 45
    .line 46
    if-eqz v6, :cond_3

    .line 47
    .line 48
    .line 49
    invoke-static {v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->isInMediaCodecBlackList(Ljava/lang/String;)Z

    .line 50
    move-result v6

    .line 51
    .line 52
    if-nez v6, :cond_3

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getDecoderName()Ljava/lang/String;

    .line 56
    move-result-object v6

    .line 57
    .line 58
    .line 59
    invoke-static {v6}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->isAMediaCodecBlackListInstance(Ljava/lang/String;)Z

    .line 60
    move-result v6

    .line 61
    .line 62
    if-nez v6, :cond_3

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getMaxProfileLevel()Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo$DecoderProfileLevel;

    .line 66
    move-result-object v6

    .line 67
    .line 68
    new-instance v7, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    .line 69
    .line 70
    iget v8, v6, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo$DecoderProfileLevel;->profile:I

    .line 71
    .line 72
    iget v9, v6, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo$DecoderProfileLevel;->level:I

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getMaxAudioSampleRate()I

    .line 76
    move-result v10

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getMaxAudioBitRate()I

    .line 80
    move-result v11

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getMaxAudioChannels()I

    .line 84
    move-result v12

    .line 85
    .line 86
    .line 87
    invoke-direct/range {v7 .. v12}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;-><init>(IIIII)V

    .line 88
    .line 89
    sget-object v6, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxACodecHwCapabilityMap:Ljava/util/HashMap;

    .line 90
    .line 91
    .line 92
    invoke-static {v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getSupportedCodecId(Ljava/lang/String;)I

    .line 93
    move-result v8

    .line 94
    .line 95
    .line 96
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    move-result-object v8

    .line 98
    .line 99
    .line 100
    invoke-virtual {v6, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 101
    move-result v6

    .line 102
    .line 103
    if-eqz v6, :cond_2

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getMaxAudioSampleRate()I

    .line 107
    move-result v6

    .line 108
    .line 109
    sget-object v8, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxACodecHwCapabilityMap:Ljava/util/HashMap;

    .line 110
    .line 111
    .line 112
    invoke-static {v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getSupportedCodecId(Ljava/lang/String;)I

    .line 113
    move-result v9

    .line 114
    .line 115
    .line 116
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    move-result-object v9

    .line 118
    .line 119
    .line 120
    invoke-virtual {v8, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    move-result-object v8

    .line 122
    .line 123
    check-cast v8, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    .line 124
    .line 125
    iget v8, v8, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;->maxSampleRate:I

    .line 126
    .line 127
    if-gt v6, v8, :cond_1

    .line 128
    .line 129
    const-string v6, "audio/eac3-joc"

    .line 130
    .line 131
    .line 132
    invoke-static {v5, v6}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 133
    move-result v6

    .line 134
    .line 135
    if-eqz v6, :cond_3

    .line 136
    goto :goto_1

    .line 137
    :catch_0
    move-exception v0

    .line 138
    goto :goto_3

    .line 139
    .line 140
    .line 141
    :cond_1
    :goto_1
    invoke-static {v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getSupportedCodecId(Ljava/lang/String;)I

    .line 142
    move-result v6

    .line 143
    .line 144
    .line 145
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    move-result-object v6

    .line 147
    .line 148
    sget-object v8, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxACodecHwCapabilityMap:Ljava/util/HashMap;

    .line 149
    .line 150
    .line 151
    invoke-static {v6, v7, v8}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/HashMap;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v4}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getDecoderName()Ljava/lang/String;

    .line 155
    move-result-object v4

    .line 156
    .line 157
    sget-object v6, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAudioMaxCapCodecInstance:Ljava/util/HashMap;

    .line 158
    .line 159
    .line 160
    invoke-static {v5, v4, v6}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/HashMap;)V

    .line 161
    goto :goto_2

    .line 162
    .line 163
    .line 164
    :cond_2
    invoke-static {v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getSupportedCodecId(Ljava/lang/String;)I

    .line 165
    move-result v6

    .line 166
    .line 167
    .line 168
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    move-result-object v6

    .line 170
    .line 171
    sget-object v8, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxACodecHwCapabilityMap:Ljava/util/HashMap;

    .line 172
    .line 173
    .line 174
    invoke-static {v6, v7, v8}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/HashMap;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getDecoderName()Ljava/lang/String;

    .line 178
    move-result-object v4

    .line 179
    .line 180
    sget-object v6, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAudioMaxCapCodecInstance:Ljava/util/HashMap;

    .line 181
    .line 182
    .line 183
    invoke-static {v5, v4, v6}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/HashMap;)V

    .line 184
    .line 185
    sget-object v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAMediaCodecCapList:Ljava/util/ArrayList;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 189
    .line 190
    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 191
    .line 192
    goto/16 :goto_0

    .line 193
    .line 194
    :goto_3
    :try_start_2
    const-string v2, "TPCodecUtils"

    .line 195
    .line 196
    new-instance v3, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    const-string v4, "getAMediaCodecMaxCapabilityMap failed:"

    .line 199
    .line 200
    .line 201
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 205
    move-result-object v0

    .line 206
    .line 207
    .line 208
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    move-result-object v0

    .line 213
    const/4 v3, 0x4

    .line 214
    .line 215
    .line 216
    invoke-static {v3, v2, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    .line 217
    .line 218
    :cond_4
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxACodecHwCapabilityMap:Ljava/util/HashMap;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 219
    monitor-exit v1

    .line 220
    return-object v0

    .line 221
    :goto_4
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 222
    throw v0
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
.end method

.method public static getAV1SWDecodeLevel()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getDecodeLevelByCoresAndFreq()I

    .line 4
    move-result v0

    .line 5
    return v0
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
.end method

.method public static getAudioMediaCodecPassThroughCap(III)Z
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x138c

    .line 3
    .line 4
    if-eq p0, v0, :cond_0

    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    .line 8
    :cond_0
    const/16 p0, 0x14

    .line 9
    .line 10
    if-ne p1, p0, :cond_1

    .line 11
    const/4 p0, 0x7

    .line 12
    goto :goto_1

    .line 13
    .line 14
    :cond_1
    const/16 p0, 0x32

    .line 15
    .line 16
    if-eq p1, p0, :cond_3

    .line 17
    .line 18
    const/16 p0, 0x3c

    .line 19
    .line 20
    if-ne p1, p0, :cond_2

    .line 21
    goto :goto_0

    .line 22
    :cond_2
    const/4 p0, 0x1

    .line 23
    goto :goto_1

    .line 24
    .line 25
    :cond_3
    :goto_0
    const/16 p0, 0x8

    .line 26
    .line 27
    .line 28
    :goto_1
    invoke-static {p0, p2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPAudioPassThroughPluginDetector;->isAudioPassThroughSupport(II)Z

    .line 29
    move-result p0

    .line 30
    return p0
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
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
.end method

.method public static getAvs3SWDecodeLevel()I
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getCpuHarewareName()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getCpuHWProducter(Ljava/lang/String;)I

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getCpuHWProductIndex(Ljava/lang/String;)I

    .line 12
    move-result v2

    .line 13
    .line 14
    new-instance v3, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v4, "[getAvs3SWDecodeLevel], mCpuHWProducter = "

    .line 17
    .line 18
    .line 19
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v4, ", getMaxCpuFreq() = "

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getMaxCpuFreq()J

    .line 31
    move-result-wide v4

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v4, ", numCores = "

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getNumCores()I

    .line 43
    move-result v4

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v4, ", mCpuHWProductIdx="

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v4, ", hardware="

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    move-result-object v0

    .line 67
    const/4 v3, 0x2

    .line 68
    .line 69
    const-string v4, "TPCodecUtils"

    .line 70
    .line 71
    .line 72
    invoke-static {v3, v4, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    sget v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAvs3DeviceLevel:I

    .line 75
    const/4 v4, -0x1

    .line 76
    .line 77
    if-eq v4, v0, :cond_0

    .line 78
    return v0

    .line 79
    :cond_0
    const/4 v0, 0x0

    .line 80
    .line 81
    sput v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAvs3DeviceLevel:I

    .line 82
    .line 83
    if-eq v4, v1, :cond_2

    .line 84
    .line 85
    const/16 v0, 0x1a

    .line 86
    .line 87
    if-eqz v1, :cond_3

    .line 88
    const/4 v4, 0x1

    .line 89
    .line 90
    if-eq v1, v4, :cond_2

    .line 91
    .line 92
    if-eq v1, v3, :cond_1

    .line 93
    const/4 v0, 0x3

    .line 94
    .line 95
    if-eq v1, v0, :cond_2

    .line 96
    goto :goto_1

    .line 97
    .line 98
    :cond_1
    sget v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mFhdAvs3HisiIndex:I

    .line 99
    .line 100
    if-lt v2, v1, :cond_2

    .line 101
    .line 102
    :goto_0
    sput v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAvs3DeviceLevel:I

    .line 103
    goto :goto_1

    .line 104
    .line 105
    .line 106
    :cond_2
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getDecodeLevelByCoresAndFreq()I

    .line 107
    move-result v0

    .line 108
    goto :goto_0

    .line 109
    .line 110
    :cond_3
    sget v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mFhdAvs3QualcommIndex:I

    .line 111
    .line 112
    if-lt v2, v1, :cond_4

    .line 113
    goto :goto_0

    .line 114
    .line 115
    :cond_4
    sget v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mShdAvs3QualcommIndex:I

    .line 116
    .line 117
    if-lt v2, v0, :cond_2

    .line 118
    .line 119
    const/16 v0, 0x15

    .line 120
    goto :goto_0

    .line 121
    .line 122
    :goto_1
    sget v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAvs3DeviceLevel:I

    .line 123
    return v0
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
.end method

.method private static getDecodeLevelByCoresAndFreq()I
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getNumCores()I

    .line 4
    move-result v0

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    const/16 v2, 0x10

    .line 9
    .line 10
    const/16 v3, 0x15

    .line 11
    .line 12
    const-wide/16 v4, 0x3e8

    .line 13
    .line 14
    if-lt v0, v1, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getMaxCpuFreq()J

    .line 18
    move-result-wide v0

    .line 19
    div-long/2addr v0, v4

    .line 20
    .line 21
    const-wide/16 v4, 0x4b0

    .line 22
    .line 23
    cmp-long v0, v0, v4

    .line 24
    .line 25
    if-ltz v0, :cond_0

    .line 26
    return v3

    .line 27
    :cond_0
    return v2

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getNumCores()I

    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x6

    .line 33
    .line 34
    if-lt v0, v1, :cond_3

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getMaxCpuFreq()J

    .line 38
    move-result-wide v0

    .line 39
    div-long/2addr v0, v4

    .line 40
    .line 41
    const-wide/16 v4, 0x578

    .line 42
    .line 43
    cmp-long v0, v0, v4

    .line 44
    .line 45
    if-ltz v0, :cond_2

    .line 46
    return v3

    .line 47
    :cond_2
    return v2

    .line 48
    .line 49
    .line 50
    :cond_3
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getNumCores()I

    .line 51
    move-result v0

    .line 52
    const/4 v6, 0x4

    .line 53
    .line 54
    if-lt v0, v6, :cond_5

    .line 55
    .line 56
    .line 57
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getMaxCpuFreq()J

    .line 58
    move-result-wide v0

    .line 59
    div-long/2addr v0, v4

    .line 60
    .line 61
    const-wide/16 v4, 0x640

    .line 62
    .line 63
    cmp-long v0, v0, v4

    .line 64
    .line 65
    if-ltz v0, :cond_4

    .line 66
    return v3

    .line 67
    :cond_4
    return v2

    .line 68
    :cond_5
    return v1
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
.end method

.method public static declared-synchronized getDecoderMaxCapabilityMapAsync()V
    .locals 3

    .line 1
    .line 2
    const-class v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-boolean v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mIsInitDone:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/Thread;

    .line 12
    .line 13
    new-instance v2, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$1;

    .line 14
    .line 15
    .line 16
    invoke-direct {v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$1;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    const-string v2, "TP_codec_init_thread"

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    monitor-exit v0

    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 32
    throw v1
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
.end method

.method public static getDecoderName(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 7

    .line 1
    .line 2
    const-string v0, "audio"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    const-string p1, "audio/eac3"

    .line 11
    .line 12
    .line 13
    invoke-static {p0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 14
    move-result p1

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    sget-object p1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAudioMaxCapCodecInstance:Ljava/util/HashMap;

    .line 19
    .line 20
    const-string v0, "audio/eac3-joc"

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 24
    move-result p1

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    sget-object p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAudioMaxCapCodecInstance:Ljava/util/HashMap;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    check-cast p0, Ljava/lang/String;

    .line 35
    return-object p0

    .line 36
    .line 37
    :cond_0
    sget-object p1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAudioMaxCapCodecInstance:Ljava/util/HashMap;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 41
    move-result p1

    .line 42
    .line 43
    if-eqz p1, :cond_8

    .line 44
    .line 45
    sget-object p1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAudioMaxCapCodecInstance:Ljava/util/HashMap;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    move-result-object p0

    .line 50
    .line 51
    check-cast p0, Ljava/lang/String;

    .line 52
    return-object p0

    .line 53
    .line 54
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 55
    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mLocalCache:Lcom/tencent/thumbplayer/tcmedia/core/thirdparties/LocalCache;

    .line 60
    .line 61
    .line 62
    invoke-static {v1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderList;->getTPMediaDecoderInfos(Lcom/tencent/thumbplayer/tcmedia/core/thirdparties/LocalCache;)[Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;

    .line 63
    move-result-object v1

    .line 64
    array-length v2, v1

    .line 65
    const/4 v3, 0x0

    .line 66
    move v4, v3

    .line 67
    .line 68
    :goto_0
    if-ge v4, v2, :cond_3

    .line 69
    .line 70
    aget-object v5, v1, v4

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getDecoderMimeType()Ljava/lang/String;

    .line 74
    move-result-object v6

    .line 75
    .line 76
    .line 77
    invoke-static {p0, v6}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 78
    move-result v6

    .line 79
    .line 80
    if-eqz v6, :cond_2

    .line 81
    .line 82
    .line 83
    invoke-virtual {v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->isSecureDecoder()Z

    .line 84
    move-result v6

    .line 85
    .line 86
    if-ne v6, p1, :cond_2

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 92
    goto :goto_0

    .line 93
    .line 94
    .line 95
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 96
    move-result-object p0

    .line 97
    .line 98
    .line 99
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    move-result p1

    .line 101
    .line 102
    if-eqz p1, :cond_7

    .line 103
    .line 104
    .line 105
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    move-result-object p1

    .line 107
    .line 108
    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->isVideo()Z

    .line 112
    move-result v1

    .line 113
    .line 114
    if-eqz v1, :cond_5

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->isVideoSofwareDecoder()Z

    .line 118
    move-result v1

    .line 119
    .line 120
    sget-boolean v2, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mPreferredSoftwareComponent:Z

    .line 121
    .line 122
    if-eq v1, v2, :cond_6

    .line 123
    .line 124
    .line 125
    :cond_5
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->isAudio()Z

    .line 126
    move-result v1

    .line 127
    .line 128
    if-eqz v1, :cond_4

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->isAudioSofwareDecoder()Z

    .line 132
    move-result v1

    .line 133
    .line 134
    sget-boolean v2, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mPreferredSoftwareComponent:Z

    .line 135
    .line 136
    if-ne v1, v2, :cond_4

    .line 137
    .line 138
    .line 139
    :cond_6
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getDecoderName()Ljava/lang/String;

    .line 140
    move-result-object p0

    .line 141
    return-object p0

    .line 142
    .line 143
    .line 144
    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 145
    move-result p0

    .line 146
    .line 147
    if-nez p0, :cond_8

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 151
    move-result-object p0

    .line 152
    .line 153
    check-cast p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getDecoderName()Ljava/lang/String;

    .line 157
    move-result-object p0

    .line 158
    return-object p0

    .line 159
    :cond_8
    const/4 p0, 0x0

    .line 160
    return-object p0
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
.end method

.method public static getDisplayVersion()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
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
.end method

.method public static getDolbyVisionDecoderName(Ljava/lang/String;IIZ)Ljava/lang/String;
    .locals 12

    .line 1
    .line 2
    const-string p2, "video/dolby-vision"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, p0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    return-object v0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-static {p1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->convertDolbyVisionToOmxProfile(I)I

    .line 14
    move-result p2

    .line 15
    .line 16
    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mLocalCache:Lcom/tencent/thumbplayer/tcmedia/core/thirdparties/LocalCache;

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderList;->getTPMediaDecoderInfos(Lcom/tencent/thumbplayer/tcmedia/core/thirdparties/LocalCache;)[Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;

    .line 20
    move-result-object v1

    .line 21
    array-length v2, v1

    .line 22
    const/4 v3, 0x0

    .line 23
    move v4, v3

    .line 24
    .line 25
    :goto_0
    if-ge v4, v2, :cond_3

    .line 26
    .line 27
    aget-object v5, v1, v4

    .line 28
    .line 29
    .line 30
    invoke-virtual {v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getProfileLevels()[Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo$DecoderProfileLevel;

    .line 31
    move-result-object v6

    .line 32
    .line 33
    .line 34
    invoke-virtual {v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getDecoderMimeType()Ljava/lang/String;

    .line 35
    move-result-object v7

    .line 36
    .line 37
    .line 38
    invoke-static {v7, p0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 39
    move-result v7

    .line 40
    .line 41
    if-eqz v7, :cond_2

    .line 42
    array-length v7, v6

    .line 43
    move v8, v3

    .line 44
    .line 45
    :goto_1
    if-ge v8, v7, :cond_2

    .line 46
    .line 47
    aget-object v9, v6, v8

    .line 48
    .line 49
    iget v10, v9, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo$DecoderProfileLevel;->profile:I

    .line 50
    .line 51
    if-ne v10, p2, :cond_1

    .line 52
    .line 53
    new-instance v10, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v11, "getDolbyVisionDecoderName  profile:"

    .line 56
    .line 57
    .line 58
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    iget v9, v9, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo$DecoderProfileLevel;->profile:I

    .line 61
    .line 62
    .line 63
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v9, " dvProfile:"

    .line 66
    .line 67
    .line 68
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v9, " bSecure:"

    .line 74
    .line 75
    .line 76
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v10, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const-string v9, " name:"

    .line 82
    .line 83
    .line 84
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getDecoderName()Ljava/lang/String;

    .line 88
    move-result-object v9

    .line 89
    .line 90
    .line 91
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    move-result-object v9

    .line 96
    const/4 v10, 0x1

    .line 97
    .line 98
    const-string v11, "TPCodecUtils"

    .line 99
    .line 100
    .line 101
    invoke-static {v10, v11, v9}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->isSecureDecoder()Z

    .line 105
    move-result v9

    .line 106
    .line 107
    if-ne v9, p3, :cond_1

    .line 108
    .line 109
    .line 110
    invoke-virtual {v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getDecoderName()Ljava/lang/String;

    .line 111
    move-result-object p0

    .line 112
    return-object p0

    .line 113
    .line 114
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 115
    goto :goto_1

    .line 116
    .line 117
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 118
    goto :goto_0

    .line 119
    :cond_3
    return-object v0
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
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
.end method

.method public static getHevcSWDecodeLevel()I
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getCpuHarewareName()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getCpuHWProducter(Ljava/lang/String;)I

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getCpuHWProductIndex(Ljava/lang/String;)I

    .line 12
    move-result v2

    .line 13
    .line 14
    new-instance v3, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v4, "[getHevcSWDecodeLevel], mCpuHWProducter = "

    .line 17
    .line 18
    .line 19
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v4, ", getMaxCpuFreq() = "

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getMaxCpuFreq()J

    .line 31
    move-result-wide v4

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v4, ", numCores = "

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getNumCores()I

    .line 43
    move-result v4

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v4, ", mCpuHWProductIdx="

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v4, ", hardware="

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    move-result-object v0

    .line 67
    const/4 v3, 0x2

    .line 68
    .line 69
    const-string v4, "TPCodecUtils"

    .line 70
    .line 71
    .line 72
    invoke-static {v3, v4, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    sget v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHevcDeviceLevel:I

    .line 75
    const/4 v4, -0x1

    .line 76
    .line 77
    if-eq v4, v0, :cond_0

    .line 78
    return v0

    .line 79
    :cond_0
    const/4 v0, 0x0

    .line 80
    .line 81
    sput v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHevcDeviceLevel:I

    .line 82
    .line 83
    if-eq v4, v1, :cond_5

    .line 84
    .line 85
    const/16 v0, 0x10

    .line 86
    .line 87
    const/16 v4, 0x15

    .line 88
    .line 89
    if-eqz v1, :cond_8

    .line 90
    const/4 v5, 0x1

    .line 91
    .line 92
    if-eq v1, v5, :cond_6

    .line 93
    .line 94
    if-eq v1, v3, :cond_3

    .line 95
    const/4 v3, 0x3

    .line 96
    .line 97
    if-eq v1, v3, :cond_1

    .line 98
    goto :goto_2

    .line 99
    .line 100
    :cond_1
    sget v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mShdHevcSamsungIndex:I

    .line 101
    .line 102
    if-lt v2, v1, :cond_2

    .line 103
    .line 104
    :goto_0
    sput v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHevcDeviceLevel:I

    .line 105
    goto :goto_2

    .line 106
    .line 107
    :cond_2
    sget v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHdHevcSamsungIndex:I

    .line 108
    .line 109
    if-lt v2, v1, :cond_5

    .line 110
    .line 111
    :goto_1
    sput v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHevcDeviceLevel:I

    .line 112
    goto :goto_2

    .line 113
    .line 114
    :cond_3
    sget v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mShdHevcHisiIndex:I

    .line 115
    .line 116
    if-lt v2, v1, :cond_4

    .line 117
    goto :goto_0

    .line 118
    .line 119
    :cond_4
    sget v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHdHevcHisiIndex:I

    .line 120
    .line 121
    if-lt v2, v1, :cond_5

    .line 122
    goto :goto_1

    .line 123
    .line 124
    .line 125
    :cond_5
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getDecodeLevelByCoresAndFreq()I

    .line 126
    move-result v0

    .line 127
    goto :goto_1

    .line 128
    .line 129
    :cond_6
    sget v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mShdHevcMtkIndex:I

    .line 130
    .line 131
    if-lt v2, v1, :cond_7

    .line 132
    goto :goto_0

    .line 133
    .line 134
    :cond_7
    sget v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHdHevcMtkIndex:I

    .line 135
    .line 136
    if-lt v2, v1, :cond_5

    .line 137
    goto :goto_1

    .line 138
    .line 139
    :cond_8
    sget v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mShdHevcQualcommIndex:I

    .line 140
    .line 141
    if-lt v2, v1, :cond_9

    .line 142
    goto :goto_0

    .line 143
    .line 144
    :cond_9
    sget v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHdHevcQualcommIndex:I

    .line 145
    .line 146
    if-lt v2, v1, :cond_5

    .line 147
    goto :goto_1

    .line 148
    .line 149
    :goto_2
    sget v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHevcDeviceLevel:I

    .line 150
    return v0
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
.end method

.method public static getMaxLumaSample(Ljava/lang/String;I)I
    .locals 1

    .line 1
    .line 2
    const-string v0, "video/avc"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaCodecProfileLevel;->getAVCMaxLumaSample(I)I

    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    .line 15
    :cond_0
    const-string v0, "video/hevc"

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaCodecProfileLevel;->getHEVCMaxLumaSample(I)I

    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    .line 28
    :cond_1
    const-string v0, "video/x-vnd.on2.vp8"

    .line 29
    .line 30
    .line 31
    invoke-static {p0, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 32
    move-result v0

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaCodecProfileLevel;->getVP8MaxLumaSample(I)I

    .line 38
    move-result p0

    .line 39
    return p0

    .line 40
    .line 41
    :cond_2
    const-string v0, "video/x-vnd.on2.vp9"

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 45
    move-result v0

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    .line 50
    invoke-static {p1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaCodecProfileLevel;->getVP9MaxLumaSample(I)I

    .line 51
    move-result p0

    .line 52
    return p0

    .line 53
    .line 54
    :cond_3
    const-string v0, "video/av01"

    .line 55
    .line 56
    .line 57
    invoke-static {p0, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 58
    move-result p0

    .line 59
    .line 60
    if-eqz p0, :cond_4

    .line 61
    .line 62
    .line 63
    invoke-static {p1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaCodecProfileLevel;->getAV1MaxLumaSample(I)I

    .line 64
    move-result p0

    .line 65
    return p0

    .line 66
    :cond_4
    const/4 p0, 0x0

    .line 67
    return p0
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
.end method

.method public static declared-synchronized getMaxSupportedFrameRatesFor(IIII)I
    .locals 14

    .line 1
    .line 2
    const-class v6, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;

    .line 3
    monitor-enter v6

    .line 4
    .line 5
    const/16 v0, 0x65

    .line 6
    .line 7
    const/16 v1, 0x1e

    .line 8
    .line 9
    if-eq p0, v0, :cond_5

    .line 10
    const/4 v0, -0x1

    .line 11
    .line 12
    if-ne p0, v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_4

    .line 15
    .line 16
    .line 17
    :cond_0
    :try_start_0
    invoke-static {p1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getSupportedHWMimeType(I)Ljava/lang/String;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 22
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    monitor-exit v6

    .line 26
    return v1

    .line 27
    .line 28
    .line 29
    :cond_1
    :try_start_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    .line 32
    :try_start_2
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mLocalCache:Lcom/tencent/thumbplayer/tcmedia/core/thirdparties/LocalCache;

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderList;->getTPMediaDecoderInfos(Lcom/tencent/thumbplayer/tcmedia/core/thirdparties/LocalCache;)[Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;

    .line 36
    move-result-object v0

    .line 37
    array-length v1, v0

    .line 38
    const/4 v8, 0x0

    .line 39
    move v2, v8

    .line 40
    .line 41
    :goto_0
    if-ge v2, v1, :cond_4

    .line 42
    .line 43
    aget-object v3, v0, v2

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getDecoderMimeType()Ljava/lang/String;

    .line 47
    move-result-object v4

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    move-result v4

    .line 52
    .line 53
    if-eqz v4, :cond_3

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getDecoderMaxWidth()I

    .line 57
    move-result v0

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getDecoderMaxHeight()I

    .line 61
    move-result v1

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getDecoderLumaWidth()I

    .line 65
    move-result v2

    .line 66
    move-object p0, v3

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getDecoderLumaHeight()I

    .line 70
    move-result v3

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getDecoderMaxFrameRateForMaxLuma()I

    .line 74
    move-result v9

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getDecoderMaxFrameRate()I

    .line 78
    move-result p0

    .line 79
    .line 80
    move/from16 v4, p2

    .line 81
    .line 82
    move/from16 v5, p3

    .line 83
    .line 84
    .line 85
    invoke-static/range {v0 .. v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->isLimitMaxWidthOrMaxHeight(IIIIII)Z

    .line 86
    move-result v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 87
    .line 88
    if-eqz v1, :cond_2

    .line 89
    monitor-exit v6

    .line 90
    return v8

    .line 91
    .line 92
    :cond_2
    mul-int v1, v0, v3

    .line 93
    int-to-long v1, v1

    .line 94
    .line 95
    mul-int v8, v4, v5

    .line 96
    int-to-long v10, v8

    .line 97
    .line 98
    const-wide/16 v12, 0x1

    .line 99
    .line 100
    .line 101
    :try_start_3
    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->max(JJ)J

    .line 102
    move-result-wide v10

    .line 103
    div-long/2addr v1, v10

    .line 104
    long-to-int v1, v1

    .line 105
    mul-int/2addr v1, v9

    .line 106
    const/4 v2, 0x1

    .line 107
    .line 108
    .line 109
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 110
    move-result v1

    .line 111
    .line 112
    .line 113
    invoke-static {p0, v1}, Ljava/lang/Math;->min(II)I

    .line 114
    move-result p0

    .line 115
    .line 116
    .line 117
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    move-result-object v7

    .line 119
    .line 120
    const-string p0, "TPCodecUtils"

    .line 121
    .line 122
    new-instance v1, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string v2, "getSupportedFrameRatesFor max width:"

    .line 125
    .line 126
    .line 127
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    const-string v0, " max height:"

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    const-string v0, " max framerate for max resolution:"

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    const-string v0, " current width:"

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    const-string v0, " height:"

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    const-string v0, " max support framerate:"

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    move-result-object v0

    .line 175
    const/4 v1, 0x2

    .line 176
    .line 177
    .line 178
    invoke-static {v1, p0, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 179
    goto :goto_2

    .line 180
    :catchall_0
    move-exception v0

    .line 181
    move-object p0, v0

    .line 182
    goto :goto_3

    .line 183
    :catch_0
    move-exception v0

    .line 184
    move-object p0, v0

    .line 185
    goto :goto_1

    .line 186
    .line 187
    :cond_3
    move/from16 v4, p2

    .line 188
    .line 189
    move/from16 v5, p3

    .line 190
    .line 191
    add-int/lit8 v2, v2, 0x1

    .line 192
    .line 193
    goto/16 :goto_0

    .line 194
    .line 195
    :goto_1
    :try_start_4
    const-string v0, "TPCodecUtils"

    .line 196
    .line 197
    new-instance v1, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    const-string v2, "getMaxSupportedFrameRatesFor failed:"

    .line 200
    .line 201
    .line 202
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 206
    move-result-object p0

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 213
    move-result-object p0

    .line 214
    const/4 v1, 0x4

    .line 215
    .line 216
    .line 217
    invoke-static {v1, v0, p0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    :cond_4
    :goto_2
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 221
    move-result p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 222
    monitor-exit v6

    .line 223
    return p0

    .line 224
    :goto_3
    :try_start_5
    monitor-exit v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 225
    throw p0

    .line 226
    :cond_5
    :goto_4
    monitor-exit v6

    .line 227
    return v1
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
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
.end method

.method private static getSoftMaxSamples(I)I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-eq p0, v0, :cond_7

    .line 4
    const/4 v0, 0x6

    .line 5
    .line 6
    if-eq p0, v0, :cond_6

    .line 7
    .line 8
    const/16 v0, 0xb

    .line 9
    .line 10
    if-eq p0, v0, :cond_5

    .line 11
    .line 12
    const/16 v0, 0x10

    .line 13
    .line 14
    if-eq p0, v0, :cond_4

    .line 15
    .line 16
    const/16 v0, 0x15

    .line 17
    .line 18
    if-eq p0, v0, :cond_3

    .line 19
    .line 20
    const/16 v0, 0x1a

    .line 21
    .line 22
    if-eq p0, v0, :cond_2

    .line 23
    .line 24
    const/16 v0, 0x1c

    .line 25
    .line 26
    if-eq p0, v0, :cond_1

    .line 27
    .line 28
    const/16 v0, 0x21

    .line 29
    .line 30
    if-eq p0, v0, :cond_0

    .line 31
    const/4 p0, 0x0

    .line 32
    return p0

    .line 33
    .line 34
    :cond_0
    const/high16 p0, 0x870000

    .line 35
    return p0

    .line 36
    .line 37
    .line 38
    :cond_1
    const p0, 0x7e9000

    .line 39
    return p0

    .line 40
    .line 41
    .line 42
    :cond_2
    const p0, 0x1fa400

    .line 43
    return p0

    .line 44
    .line 45
    .line 46
    :cond_3
    const p0, 0xe1000

    .line 47
    return p0

    .line 48
    .line 49
    .line 50
    :cond_4
    const p0, 0x75300

    .line 51
    return p0

    .line 52
    .line 53
    .line 54
    :cond_5
    const p0, 0x63600

    .line 55
    return p0

    .line 56
    .line 57
    .line 58
    :cond_6
    const p0, 0x4b000

    .line 59
    return p0

    .line 60
    .line 61
    .line 62
    :cond_7
    const p0, 0x1fa40

    .line 63
    return p0
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
.end method

.method private static getSupportedCodecId(Ljava/lang/String;)I
    .locals 1

    .line 1
    .line 2
    const-string v0, "video/avc"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/16 p0, 0x1a

    .line 11
    return p0

    .line 12
    .line 13
    :cond_0
    const-string v0, "video/hevc"

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const/16 p0, 0xac

    .line 22
    return p0

    .line 23
    .line 24
    :cond_1
    const-string v0, "video/x-vnd.on2.vp8"

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 28
    move-result v0

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    const/16 p0, 0x8a

    .line 33
    return p0

    .line 34
    .line 35
    :cond_2
    const-string v0, "video/x-vnd.on2.vp9"

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 39
    move-result v0

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    const/16 p0, 0xa6

    .line 44
    return p0

    .line 45
    .line 46
    :cond_3
    const-string v0, "video/av01"

    .line 47
    .line 48
    .line 49
    invoke-static {p0, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 50
    move-result v0

    .line 51
    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    const/16 p0, 0x405

    .line 55
    return p0

    .line 56
    .line 57
    :cond_4
    const-string v0, "audio/mp4a-latm"

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 61
    move-result v0

    .line 62
    .line 63
    if-eqz v0, :cond_5

    .line 64
    .line 65
    const/16 p0, 0x138a

    .line 66
    return p0

    .line 67
    .line 68
    :cond_5
    const-string v0, "audio/ac3"

    .line 69
    .line 70
    .line 71
    invoke-static {p0, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 72
    move-result v0

    .line 73
    .line 74
    if-eqz v0, :cond_6

    .line 75
    .line 76
    const/16 p0, 0x138b

    .line 77
    return p0

    .line 78
    .line 79
    :cond_6
    const-string v0, "audio/eac3"

    .line 80
    .line 81
    .line 82
    invoke-static {p0, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 83
    move-result v0

    .line 84
    .line 85
    if-nez v0, :cond_a

    .line 86
    .line 87
    const-string v0, "audio/eac3-joc"

    .line 88
    .line 89
    .line 90
    invoke-static {p0, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 91
    move-result v0

    .line 92
    .line 93
    if-eqz v0, :cond_7

    .line 94
    goto :goto_0

    .line 95
    .line 96
    :cond_7
    const-string v0, "audio/flac"

    .line 97
    .line 98
    .line 99
    invoke-static {p0, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 100
    move-result v0

    .line 101
    .line 102
    if-eqz v0, :cond_8

    .line 103
    .line 104
    const/16 p0, 0x1394

    .line 105
    return p0

    .line 106
    .line 107
    :cond_8
    const-string v0, "audio/vnd.dts"

    .line 108
    .line 109
    .line 110
    invoke-static {p0, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 111
    move-result p0

    .line 112
    .line 113
    if-eqz p0, :cond_9

    .line 114
    .line 115
    const/16 p0, 0x138c

    .line 116
    return p0

    .line 117
    :cond_9
    const/4 p0, -0x1

    .line 118
    return p0

    .line 119
    .line 120
    :cond_a
    :goto_0
    const/16 p0, 0x13b0

    .line 121
    return p0
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
.end method

.method private static getSupportedHWMimeType(I)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x1a

    .line 3
    .line 4
    if-eq p0, v0, :cond_4

    .line 5
    .line 6
    const/16 v0, 0x8a

    .line 7
    .line 8
    if-eq p0, v0, :cond_3

    .line 9
    .line 10
    const/16 v0, 0xa6

    .line 11
    .line 12
    if-eq p0, v0, :cond_2

    .line 13
    .line 14
    const/16 v0, 0xac

    .line 15
    .line 16
    if-eq p0, v0, :cond_1

    .line 17
    .line 18
    const/16 v0, 0x405

    .line 19
    .line 20
    if-eq p0, v0, :cond_0

    .line 21
    .line 22
    const-string p0, ""

    .line 23
    return-object p0

    .line 24
    .line 25
    :cond_0
    const-string p0, "video/av01"

    .line 26
    return-object p0

    .line 27
    .line 28
    :cond_1
    const-string p0, "video/hevc"

    .line 29
    return-object p0

    .line 30
    .line 31
    :cond_2
    const-string p0, "video/x-vnd.on2.vp9"

    .line 32
    return-object p0

    .line 33
    .line 34
    :cond_3
    const-string p0, "video/x-vnd.on2.vp8"

    .line 35
    return-object p0

    .line 36
    .line 37
    :cond_4
    const-string p0, "video/avc"

    .line 38
    return-object p0
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
.end method

.method public static getSystemPatchVersion()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
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
.end method

.method public static declared-synchronized getVCodecSWMaxCapabilityMap()Ljava/util/HashMap;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mIsFFmpegCapGot:Z

    if-eqz v1, :cond_0

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxVCodecSwCapabilityMap:Ljava/util/HashMap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto/16 :goto_0

    :cond_0
    :try_start_1
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getHevcSWDecodeLevel()I

    move-result v1

    invoke-static {v1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getSoftMaxSamples(I)I

    move-result v2

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getAvs3SWDecodeLevel()I

    move-result v3

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getAV1SWDecodeLevel()I

    move-result v4

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getVvcSWDecodeLevel()I

    move-result v5

    invoke-static {v3}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getSoftMaxSamples(I)I

    move-result v6

    invoke-static {v4}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getSoftMaxSamples(I)I

    move-result v7

    invoke-static {v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getSoftMaxSamples(I)I

    move-result v8

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "getVCodecSWMaxCapabilityMap, hevcDecodeLevel:"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", avs3DecodeLevel:"

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", AV1DecodeLevel:"

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", vvcDecodeLevel:"

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x2

    invoke-static {v3, v1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;)V

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAVCSWMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    iput v2, v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;->maxLumaSamples:I

    const/16 v4, 0x40

    iput v4, v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;->maxProfile:I

    const/high16 v4, 0x10000

    iput v4, v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;->maxLevel:I

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxVCodecSwCapabilityMap:Ljava/util/HashMap;

    const/16 v4, 0x1a

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v5, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAVCSWMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHEVCSWMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    iput v2, v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;->maxLumaSamples:I

    iput v3, v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;->maxProfile:I

    const/high16 v4, 0x2000000

    iput v4, v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;->maxLevel:I

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxVCodecSwCapabilityMap:Ljava/util/HashMap;

    const/16 v4, 0xac

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v5, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHEVCSWMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVP9SWMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    iput v2, v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;->maxLumaSamples:I

    const/16 v4, 0x8

    iput v4, v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;->maxProfile:I

    const/16 v5, 0x2000

    iput v5, v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;->maxLevel:I

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxVCodecSwCapabilityMap:Ljava/util/HashMap;

    const/16 v5, 0xa6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    sget-object v9, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVP9SWMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    invoke-virtual {v1, v5, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVP8SWMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    iput v2, v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;->maxLumaSamples:I

    const/4 v5, 0x1

    iput v5, v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;->maxProfile:I

    iput v4, v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;->maxLevel:I

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxVCodecSwCapabilityMap:Ljava/util/HashMap;

    const/16 v4, 0x8a

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v9, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVP8SWMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    invoke-virtual {v1, v4, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAVS3WMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    iput v6, v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;->maxLumaSamples:I

    const/4 v4, 0x0

    iput v4, v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;->maxProfile:I

    iput v4, v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;->maxLevel:I

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxVCodecSwCapabilityMap:Ljava/util/HashMap;

    const/16 v9, 0xc0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    sget-object v10, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAVS3WMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    invoke-virtual {v1, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAV1SWMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    iput v7, v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;->maxLumaSamples:I

    iput v4, v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;->maxProfile:I

    iput v4, v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;->maxLevel:I

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxVCodecSwCapabilityMap:Ljava/util/HashMap;

    const/16 v9, 0x405

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    sget-object v10, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAV1SWMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    invoke-virtual {v1, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVVCSWMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    iput v8, v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;->maxLumaSamples:I

    iput v4, v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;->maxProfile:I

    iput v4, v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;->maxLevel:I

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxVCodecSwCapabilityMap:Ljava/util/HashMap;

    const/16 v4, 0xc1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v9, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVVCSWMaxCapability:Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    invoke-virtual {v1, v4, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "getVCodecSWMaxCapabilityMap success, maxHevcLumaSamples:"

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", maxAvs3LumaSamples:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", maxAV1LumaSamples:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", maxVvcLumaSamples:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;)V

    sput-boolean v5, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mIsFFmpegCapGot:Z

    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxVCodecSwCapabilityMap:Ljava/util/HashMap;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v1

    :catch_0
    :try_start_2
    const-string v1, "TPCodecUtils"

    const-string v2, "getVCodecSWMaxCapabilityMap exception"

    const/4 v3, 0x4

    invoke-static {v3, v1, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    :goto_0
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method public static declared-synchronized getVMediaCodecMaxCapabilityMap()Ljava/util/HashMap;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    const-class v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxVCodecHwCapabilityMap:Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 9
    move-result v1

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const-string v1, "TPCodecUtils"

    .line 14
    .line 15
    const-string v2, "return memory stored video max cap map"

    .line 16
    const/4 v3, 0x2

    .line 17
    .line 18
    .line 19
    invoke-static {v3, v1, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxVCodecHwCapabilityMap:Ljava/util/HashMap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    monitor-exit v0

    .line 23
    return-object v1

    .line 24
    :catchall_0
    move-exception v1

    .line 25
    .line 26
    goto/16 :goto_3

    .line 27
    .line 28
    :cond_0
    :try_start_1
    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mLocalCache:Lcom/tencent/thumbplayer/tcmedia/core/thirdparties/LocalCache;

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderList;->getTPMediaDecoderInfos(Lcom/tencent/thumbplayer/tcmedia/core/thirdparties/LocalCache;)[Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;

    .line 32
    move-result-object v1

    .line 33
    array-length v2, v1

    .line 34
    const/4 v3, 0x0

    .line 35
    .line 36
    :goto_0
    if-ge v3, v2, :cond_3

    .line 37
    .line 38
    aget-object v4, v1, v3

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getDecoderMimeType()Ljava/lang/String;

    .line 42
    move-result-object v5

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->isVideo()Z

    .line 46
    move-result v6

    .line 47
    .line 48
    if-eqz v6, :cond_2

    .line 49
    .line 50
    sget-object v6, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVMediaCodecCapList:Ljava/util/ArrayList;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    invoke-static {v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->isSupportedMediaCodec(Ljava/lang/String;)Z

    .line 57
    move-result v6

    .line 58
    .line 59
    if-eqz v6, :cond_2

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->isSecureDecoder()Z

    .line 63
    move-result v6

    .line 64
    .line 65
    if-nez v6, :cond_2

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getMaxProfileLevel()Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo$DecoderProfileLevel;

    .line 69
    move-result-object v6

    .line 70
    .line 71
    new-instance v7, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    .line 72
    .line 73
    iget v8, v6, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo$DecoderProfileLevel;->level:I

    .line 74
    .line 75
    .line 76
    invoke-static {v5, v8}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getMaxLumaSample(Ljava/lang/String;I)I

    .line 77
    move-result v8

    .line 78
    .line 79
    iget v9, v6, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo$DecoderProfileLevel;->profile:I

    .line 80
    .line 81
    iget v10, v6, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo$DecoderProfileLevel;->level:I

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getDecoderMaxFrameRateForMaxLuma()I

    .line 85
    move-result v4

    .line 86
    .line 87
    .line 88
    invoke-direct {v7, v8, v9, v10, v4}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;-><init>(IIII)V

    .line 89
    .line 90
    sget-object v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxVCodecHwCapabilityMap:Ljava/util/HashMap;

    .line 91
    .line 92
    .line 93
    invoke-static {v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getSupportedCodecId(Ljava/lang/String;)I

    .line 94
    move-result v8

    .line 95
    .line 96
    .line 97
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    move-result-object v8

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 102
    move-result v4

    .line 103
    .line 104
    if-eqz v4, :cond_1

    .line 105
    .line 106
    iget v4, v6, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo$DecoderProfileLevel;->level:I

    .line 107
    .line 108
    sget-object v6, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxVCodecHwCapabilityMap:Ljava/util/HashMap;

    .line 109
    .line 110
    .line 111
    invoke-static {v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getSupportedCodecId(Ljava/lang/String;)I

    .line 112
    move-result v8

    .line 113
    .line 114
    .line 115
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    move-result-object v8

    .line 117
    .line 118
    .line 119
    invoke-virtual {v6, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    move-result-object v6

    .line 121
    .line 122
    check-cast v6, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;

    .line 123
    .line 124
    iget v6, v6, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPCodecMaxCapability;->maxLevel:I

    .line 125
    .line 126
    if-le v4, v6, :cond_2

    .line 127
    goto :goto_1

    .line 128
    :catch_0
    move-exception v1

    .line 129
    goto :goto_2

    .line 130
    .line 131
    .line 132
    :cond_1
    :goto_1
    invoke-static {v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getSupportedCodecId(Ljava/lang/String;)I

    .line 133
    move-result v4

    .line 134
    .line 135
    .line 136
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    move-result-object v4

    .line 138
    .line 139
    sget-object v5, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxVCodecHwCapabilityMap:Ljava/util/HashMap;

    .line 140
    .line 141
    .line 142
    invoke-static {v4, v7, v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/HashMap;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 143
    .line 144
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 145
    goto :goto_0

    .line 146
    .line 147
    :goto_2
    :try_start_2
    const-string v2, "TPCodecUtils"

    .line 148
    .line 149
    new-instance v3, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    const-string v4, "getVMediaCodecMaxCapabilityMap failed:"

    .line 152
    .line 153
    .line 154
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 158
    move-result-object v1

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    move-result-object v1

    .line 166
    const/4 v3, 0x4

    .line 167
    .line 168
    .line 169
    invoke-static {v3, v2, v1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    .line 170
    .line 171
    :cond_3
    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mMaxVCodecHwCapabilityMap:Ljava/util/HashMap;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 172
    monitor-exit v0

    .line 173
    return-object v1

    .line 174
    :goto_3
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 175
    throw v1
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
.end method

.method private static getValueFromSubstring(Ljava/lang/String;II)I
    .locals 1

    .line 1
    .line 2
    if-gez p1, :cond_0

    .line 3
    const/4 p1, 0x0

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    move-result v0

    .line 8
    .line 9
    if-lt p2, v0, :cond_1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 13
    move-result p2

    .line 14
    .line 15
    add-int/lit8 p2, p2, -0x1

    .line 16
    .line 17
    :cond_1
    if-le p1, p2, :cond_2

    .line 18
    move p1, p2

    .line 19
    .line 20
    .line 21
    :cond_2
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 22
    move-result-object p0

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 26
    move-result p0

    .line 27
    return p0
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
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
.end method

.method private static getVvcSWDecodeLevel()I
    .locals 7

    .line 1
    .line 2
    sget v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVvcDeviceLevel:I

    .line 3
    const/4 v1, -0x1

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    return v0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getCpuHarewareName()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getCpuHWProducter(Ljava/lang/String;)I

    .line 14
    move-result v2

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getCpuHWProductIndex(Ljava/lang/String;)I

    .line 18
    move-result v3

    .line 19
    .line 20
    new-instance v4, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v5, "[getVvcSWDecodeLevel], mCpuHWProducer = "

    .line 23
    .line 24
    .line 25
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v5, ", getMaxCpuFreq() = "

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getMaxCpuFreq()J

    .line 37
    move-result-wide v5

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v5, ", numCores = "

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getNumCores()I

    .line 49
    move-result v5

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v5, ", mCpuHWProductIdx = "

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v5, ", hardware = "

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    move-result-object v0

    .line 73
    const/4 v4, 0x2

    .line 74
    .line 75
    const-string v5, "TPCodecUtils"

    .line 76
    .line 77
    .line 78
    invoke-static {v4, v5, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    .line 79
    const/4 v0, 0x3

    .line 80
    const/4 v4, 0x0

    .line 81
    .line 82
    if-ne v2, v1, :cond_1

    .line 83
    .line 84
    const-string v1, "current cpu manufacturer is not listed in the performance list, cpuHwProducer:"

    .line 85
    .line 86
    .line 87
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 88
    move-result-object v2

    .line 89
    .line 90
    .line 91
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    .line 95
    invoke-static {v0, v5, v1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    sput v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVvcDeviceLevel:I

    .line 98
    return v4

    .line 99
    .line 100
    :cond_1
    if-ne v3, v1, :cond_2

    .line 101
    .line 102
    const-string v1, "current cpu model is not listed in the performance list, cpuHwProductIdx:"

    .line 103
    .line 104
    .line 105
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 106
    move-result-object v2

    .line 107
    goto :goto_0

    .line 108
    .line 109
    :cond_2
    const/16 v0, 0xc1

    .line 110
    .line 111
    .line 112
    invoke-static {v0, v2, v3}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->selectBestDecodeLevelFromCapabilityTable(III)I

    .line 113
    move-result v0

    .line 114
    .line 115
    if-eq v0, v1, :cond_3

    .line 116
    move v4, v0

    .line 117
    .line 118
    :cond_3
    sput v4, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVvcDeviceLevel:I

    .line 119
    return v4
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
.end method

.method public static declared-synchronized init(Landroid/content/Context;Z)V
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    move-result-object p0

    .line 8
    .line 9
    sput-object p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mContext:Landroid/content/Context;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lcom/tencent/thumbplayer/tcmedia/core/thirdparties/LocalCache;->get(Landroid/content/Context;)Lcom/tencent/thumbplayer/tcmedia/core/thirdparties/LocalCache;

    .line 15
    move-result-object p0

    .line 16
    .line 17
    sput-object p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mLocalCache:Lcom/tencent/thumbplayer/tcmedia/core/thirdparties/LocalCache;

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    .line 23
    :cond_0
    :goto_0
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getDecoderMaxCapabilityMapAsync()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw p0
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
.end method

.method public static isAMediaCodecBlackListInstance(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAMediaCodecBlackListInstance:Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 6
    move-result p0

    .line 7
    return p0
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
.end method

.method public static isAMediaCodecBlackListModel()Z
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAMediaCodecBlackListModel:Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getDeviceName()Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 10
    move-result v0

    .line 11
    return v0
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
.end method

.method public static isBlackListType(Ljava/lang/String;)Z
    .locals 3

    .line 1
    .line 2
    const-string v0, "PRO 7-H"

    .line 3
    .line 4
    const-string v1, "PRO+7+Plus"

    .line 5
    .line 6
    const-string v2, "PRO 7 Plus"

    .line 7
    .line 8
    .line 9
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getDeviceName()Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const-string v0, "video/hevc"

    .line 27
    .line 28
    .line 29
    invoke-static {p0, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 30
    move-result p0

    .line 31
    .line 32
    if-eqz p0, :cond_0

    .line 33
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_0
    const/4 p0, 0x0

    .line 36
    return p0
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
.end method

.method private static declared-synchronized isHDR10Support(I)Z
    .locals 9

    .line 1
    .line 2
    const-class v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mLocalCache:Lcom/tencent/thumbplayer/tcmedia/core/thirdparties/LocalCache;

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderList;->getTPMediaDecoderInfos(Lcom/tencent/thumbplayer/tcmedia/core/thirdparties/LocalCache;)[Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;

    .line 9
    move-result-object v1

    .line 10
    array-length v2, v1

    .line 11
    const/4 v3, 0x0

    .line 12
    move v4, v3

    .line 13
    .line 14
    :goto_0
    if-ge v4, v2, :cond_2

    .line 15
    .line 16
    aget-object v5, v1, v4

    .line 17
    .line 18
    .line 19
    invoke-virtual {v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getDecoderMimeType()Ljava/lang/String;

    .line 20
    move-result-object v6

    .line 21
    .line 22
    const-string v7, "video/hevc"

    .line 23
    .line 24
    .line 25
    invoke-static {v6, v7}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 26
    move-result v6

    .line 27
    .line 28
    if-eqz v6, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getProfileLevels()[Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo$DecoderProfileLevel;

    .line 32
    move-result-object v5

    .line 33
    array-length v6, v5

    .line 34
    move v7, v3

    .line 35
    .line 36
    :goto_1
    if-ge v7, v6, :cond_1

    .line 37
    .line 38
    aget-object v8, v5, v7

    .line 39
    .line 40
    iget v8, v8, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo$DecoderProfileLevel;->profile:I

    .line 41
    .line 42
    if-ne v8, p0, :cond_0

    .line 43
    .line 44
    const-string v1, "TPCodecUtils"

    .line 45
    .line 46
    const-string v2, "support hdr10 "

    .line 47
    .line 48
    .line 49
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 50
    move-result-object p0

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    move-result-object p0

    .line 55
    const/4 v2, 0x2

    .line 56
    .line 57
    .line 58
    invoke-static {v2, v1, p0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    monitor-exit v0

    .line 60
    const/4 p0, 0x1

    .line 61
    return p0

    .line 62
    :catchall_0
    move-exception p0

    .line 63
    goto :goto_2

    .line 64
    .line 65
    :cond_0
    add-int/lit8 v7, v7, 0x1

    .line 66
    goto :goto_1

    .line 67
    .line 68
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    monitor-exit v0

    .line 71
    return v3

    .line 72
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    throw p0
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
.end method

.method private static declared-synchronized isHDRDVSupport(II)Z
    .locals 10

    .line 1
    .line 2
    const-class v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    :try_start_0
    sget-object p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVMediaCodecCapList:Ljava/util/ArrayList;

    .line 10
    .line 11
    const-string p1, "video/dolby-vision"

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 15
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    monitor-exit v0

    .line 17
    return p0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_2

    .line 20
    .line 21
    :cond_0
    :try_start_1
    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mLocalCache:Lcom/tencent/thumbplayer/tcmedia/core/thirdparties/LocalCache;

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderList;->getTPMediaDecoderInfos(Lcom/tencent/thumbplayer/tcmedia/core/thirdparties/LocalCache;)[Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;

    .line 25
    move-result-object v1

    .line 26
    array-length v2, v1

    .line 27
    const/4 v3, 0x0

    .line 28
    move v4, v3

    .line 29
    .line 30
    :goto_0
    if-ge v4, v2, :cond_3

    .line 31
    .line 32
    aget-object v5, v1, v4

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getDecoderMimeType()Ljava/lang/String;

    .line 36
    move-result-object v6

    .line 37
    .line 38
    const-string v7, "video/dolby-vision"

    .line 39
    .line 40
    .line 41
    invoke-static {v6, v7}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 42
    move-result v6

    .line 43
    .line 44
    if-eqz v6, :cond_2

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo;->getProfileLevels()[Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo$DecoderProfileLevel;

    .line 48
    move-result-object v5

    .line 49
    array-length v6, v5

    .line 50
    move v7, v3

    .line 51
    .line 52
    :goto_1
    if-ge v7, v6, :cond_2

    .line 53
    .line 54
    aget-object v8, v5, v7

    .line 55
    .line 56
    iget v9, v8, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo$DecoderProfileLevel;->profile:I

    .line 57
    .line 58
    if-ne v9, p0, :cond_1

    .line 59
    .line 60
    iget v8, v8, Lcom/tencent/thumbplayer/tcmedia/core/common/TPMediaDecoderInfo$DecoderProfileLevel;->level:I

    .line 61
    .line 62
    if-ne v8, p1, :cond_1

    .line 63
    .line 64
    const-string p0, "TPCodecUtils"

    .line 65
    .line 66
    const-string p1, "support dolbyvision"

    .line 67
    const/4 v1, 0x2

    .line 68
    .line 69
    .line 70
    invoke-static {v1, p0, p1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    monitor-exit v0

    .line 72
    const/4 p0, 0x1

    .line 73
    return p0

    .line 74
    .line 75
    :cond_1
    add-int/lit8 v7, v7, 0x1

    .line 76
    goto :goto_1

    .line 77
    .line 78
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 79
    goto :goto_0

    .line 80
    :cond_3
    monitor-exit v0

    .line 81
    return v3

    .line 82
    :goto_2
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 83
    throw p0
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
.end method

.method public static isHDRDecoderTypeSupport(II)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    const-string v1, "TPCodecUtils"

    .line 4
    const/4 v2, 0x3

    .line 5
    .line 6
    const/16 v3, 0x66

    .line 7
    .line 8
    if-eq p1, v3, :cond_0

    .line 9
    .line 10
    const/16 v4, 0x65

    .line 11
    .line 12
    if-eq p1, v4, :cond_0

    .line 13
    .line 14
    const-string p0, "isHDRDecodeTypeSupport, not support decoderType, decoderType = "

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    move-result-object p0

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-static {v2, v1, p0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    .line 26
    return v0

    .line 27
    .line 28
    :cond_0
    if-ne p1, v3, :cond_1

    .line 29
    .line 30
    sget-object p1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRTypeToHDRHardwareCodecWhiteListMap:Ljava/util/HashMap;

    .line 31
    goto :goto_1

    .line 32
    .line 33
    :cond_1
    sget-object p1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHDRTypeToHDRSoftwareCodecWhiteListMap:Ljava/util/HashMap;

    .line 34
    .line 35
    .line 36
    :goto_1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    move-result-object v3

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 41
    move-result v3

    .line 42
    .line 43
    if-nez v3, :cond_2

    .line 44
    .line 45
    const-string p1, "isHDRDecodeTypeSupport, not config hdrType whiteList, hdrType = "

    .line 46
    .line 47
    .line 48
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 49
    move-result-object p0

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    move-result-object p0

    .line 54
    goto :goto_0

    .line 55
    .line 56
    .line 57
    :cond_2
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    move-result-object p0

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    move-result-object p0

    .line 63
    .line 64
    check-cast p0, Ljava/util/ArrayList;

    .line 65
    .line 66
    .line 67
    invoke-static {p0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->isInHDRVersionRangeWhiteList(Ljava/util/ArrayList;)Z

    .line 68
    move-result p0

    .line 69
    return p0
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
.end method

.method public static isHDRsupport(III)Z
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->isHDRDVSupport(II)Z

    .line 7
    move-result p0

    .line 8
    return p0

    .line 9
    .line 10
    :cond_0
    if-nez p0, :cond_1

    .line 11
    .line 12
    const/16 p0, 0x1000

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->isHDR10Support(I)Z

    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_1
    const/4 p1, 0x1

    .line 19
    .line 20
    if-ne p0, p1, :cond_2

    .line 21
    .line 22
    const/16 p0, 0x2000

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->isHDR10Support(I)Z

    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :cond_2
    const/4 p1, 0x4

    .line 29
    .line 30
    if-ne p0, p1, :cond_3

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getDisplayVersion()Ljava/lang/String;

    .line 34
    move-result-object p0

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->getSystemPatchVersion()Ljava/lang/String;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    move-result-object p2

    .line 43
    .line 44
    const-string v1, "isHDRsupport(HDRVivid):display version:"

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    move-result-object p2

    .line 49
    .line 50
    const-string v1, "TPCodecUtils"

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v1, p2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    move-result-object p2

    .line 58
    .line 59
    const-string v2, "isHDRsupport(HDRVivid):patch version:"

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    move-result-object p2

    .line 64
    .line 65
    .line 66
    invoke-static {v0, v1, p2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getDeviceName()Ljava/lang/String;

    .line 70
    move-result-object p2

    .line 71
    .line 72
    .line 73
    invoke-static {p2, p0, p1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->checkHDRVividSupportByVersion(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 74
    move-result p0

    .line 75
    return p0

    .line 76
    :cond_3
    const/4 p0, 0x0

    .line 77
    return p0
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
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
.end method

.method public static isInDRMLevel1Blacklist(I)Z
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mDrmL1BlackList:Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mDrmL1BlackList:Ljava/util/HashMap;

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    move-result-object p0

    .line 23
    .line 24
    check-cast p0, Ljava/util/ArrayList;

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getDeviceName()Ljava/lang/String;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0
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
.end method

.method private static isInHDRVersionRangeWhiteList(Ljava/util/ArrayList;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    return v0

    .line 5
    :cond_0
    move v1, v0

    .line 6
    .line 7
    .line 8
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 9
    move-result v2

    .line 10
    .line 11
    if-ge v1, v2, :cond_2

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    check-cast v2, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    .line 18
    .line 19
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 20
    .line 21
    iget v4, v2, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;->upperboundAndroidAPILevel:I

    .line 22
    .line 23
    if-gt v3, v4, :cond_1

    .line 24
    .line 25
    iget v2, v2, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;->lowerboundAndroidAPILevel:I

    .line 26
    .line 27
    if-lt v3, v2, :cond_1

    .line 28
    .line 29
    const-string p0, "TPCodecUtils"

    .line 30
    .line 31
    const-string v0, "inHDRVersionRangeWhiteList!"

    .line 32
    const/4 v1, 0x2

    .line 33
    .line 34
    .line 35
    invoke-static {v1, p0, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    .line 36
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    .line 39
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return v0
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
.end method

.method public static isInHDRVividBlackList(Ljava/lang/String;II)Z
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHdrBlackMap:Ljava/util/HashMap;

    .line 3
    const/4 v1, 0x4

    .line 4
    .line 5
    .line 6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 11
    move-result v0

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHdrBlackMap:Ljava/util/HashMap;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    check-cast v0, Ljava/util/HashMap;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 26
    move-result v1

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    check-cast p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    .line 35
    .line 36
    iget v0, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;->upperboundSystemVersion:I

    .line 37
    .line 38
    if-gt p1, v0, :cond_0

    .line 39
    .line 40
    iget v0, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;->lowerboundSystemVersion:I

    .line 41
    .line 42
    if-lt p1, v0, :cond_0

    .line 43
    .line 44
    iget p1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;->upperboundPatchVersion:I

    .line 45
    .line 46
    if-gt p2, p1, :cond_0

    .line 47
    .line 48
    iget p0, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;->lowerboundPatchVersion:I

    .line 49
    .line 50
    if-lt p2, p0, :cond_0

    .line 51
    const/4 p0, 0x1

    .line 52
    return p0

    .line 53
    :cond_0
    return v2
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
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
.end method

.method public static isInHDRVividWhiteList(Ljava/lang/String;II)Z
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHdrWhiteMap:Ljava/util/HashMap;

    .line 3
    const/4 v1, 0x4

    .line 4
    .line 5
    .line 6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 11
    move-result v0

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mHdrWhiteMap:Ljava/util/HashMap;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    check-cast v0, Ljava/util/HashMap;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 26
    move-result v1

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    check-cast p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;

    .line 35
    .line 36
    iget v0, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;->upperboundSystemVersion:I

    .line 37
    .line 38
    if-gt p1, v0, :cond_0

    .line 39
    .line 40
    iget v0, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;->lowerboundSystemVersion:I

    .line 41
    .line 42
    if-lt p1, v0, :cond_0

    .line 43
    .line 44
    iget p1, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;->upperboundPatchVersion:I

    .line 45
    .line 46
    if-gt p2, p1, :cond_0

    .line 47
    .line 48
    iget p0, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;->lowerboundPatchVersion:I

    .line 49
    .line 50
    if-lt p2, p0, :cond_0

    .line 51
    const/4 p0, 0x1

    .line 52
    return p0

    .line 53
    :cond_0
    return v2
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
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
.end method

.method public static isInMediaCodecBlackList(Ljava/lang/String;)Z
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getDeviceName()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    if-nez v1, :cond_12

    .line 12
    .line 13
    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mCodecCapBlackList:Ljava/util/HashMap;

    .line 14
    .line 15
    if-eqz v1, :cond_12

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 19
    move-result v1

    .line 20
    .line 21
    if-eqz v1, :cond_12

    .line 22
    .line 23
    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mCodecCapBlackList:Ljava/util/HashMap;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    check-cast v0, Ljava/lang/Integer;

    .line 30
    .line 31
    const-string v1, "video/avc"

    .line 32
    .line 33
    .line 34
    invoke-static {p0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 35
    move-result v1

    .line 36
    const/4 v3, 0x1

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 42
    move-result p0

    .line 43
    and-int/2addr p0, v3

    .line 44
    .line 45
    if-eqz p0, :cond_0

    .line 46
    return v3

    .line 47
    :cond_0
    return v2

    .line 48
    .line 49
    :cond_1
    const-string v1, "video/hevc"

    .line 50
    .line 51
    .line 52
    invoke-static {p0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 53
    move-result v1

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 59
    move-result p0

    .line 60
    .line 61
    and-int/lit8 p0, p0, 0x2

    .line 62
    .line 63
    if-eqz p0, :cond_2

    .line 64
    return v3

    .line 65
    :cond_2
    return v2

    .line 66
    .line 67
    :cond_3
    const-string v1, "video/x-vnd.on2.vp8"

    .line 68
    .line 69
    .line 70
    invoke-static {p0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 71
    move-result v1

    .line 72
    .line 73
    if-eqz v1, :cond_5

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 77
    move-result p0

    .line 78
    .line 79
    and-int/lit16 p0, p0, 0x100

    .line 80
    .line 81
    if-eqz p0, :cond_4

    .line 82
    return v3

    .line 83
    :cond_4
    return v2

    .line 84
    .line 85
    :cond_5
    const-string v1, "video/x-vnd.on2.vp9"

    .line 86
    .line 87
    .line 88
    invoke-static {p0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 89
    move-result v1

    .line 90
    .line 91
    if-eqz v1, :cond_7

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 95
    move-result p0

    .line 96
    .line 97
    and-int/lit8 p0, p0, 0x4

    .line 98
    .line 99
    if-eqz p0, :cond_6

    .line 100
    return v3

    .line 101
    :cond_6
    return v2

    .line 102
    .line 103
    :cond_7
    const-string v1, "audio/mp4a-latm"

    .line 104
    .line 105
    .line 106
    invoke-static {p0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 107
    move-result v1

    .line 108
    .line 109
    if-eqz v1, :cond_9

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 113
    move-result p0

    .line 114
    .line 115
    and-int/lit8 p0, p0, 0x8

    .line 116
    .line 117
    if-eqz p0, :cond_8

    .line 118
    return v3

    .line 119
    :cond_8
    return v2

    .line 120
    .line 121
    :cond_9
    const-string v1, "audio/ac3"

    .line 122
    .line 123
    .line 124
    invoke-static {p0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 125
    move-result v1

    .line 126
    .line 127
    if-eqz v1, :cond_b

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 131
    move-result p0

    .line 132
    .line 133
    and-int/lit8 p0, p0, 0x10

    .line 134
    .line 135
    if-eqz p0, :cond_a

    .line 136
    return v3

    .line 137
    :cond_a
    return v2

    .line 138
    .line 139
    :cond_b
    const-string v1, "audio/eac3"

    .line 140
    .line 141
    .line 142
    invoke-static {p0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 143
    move-result v1

    .line 144
    .line 145
    if-eqz v1, :cond_d

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 149
    move-result p0

    .line 150
    .line 151
    and-int/lit8 p0, p0, 0x20

    .line 152
    .line 153
    if-eqz p0, :cond_c

    .line 154
    return v3

    .line 155
    :cond_c
    return v2

    .line 156
    .line 157
    :cond_d
    const-string v1, "audio/flac"

    .line 158
    .line 159
    .line 160
    invoke-static {p0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 161
    move-result v1

    .line 162
    .line 163
    if-eqz v1, :cond_f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 167
    move-result p0

    .line 168
    .line 169
    and-int/lit8 p0, p0, 0x40

    .line 170
    .line 171
    if-eqz p0, :cond_e

    .line 172
    return v3

    .line 173
    :cond_e
    return v2

    .line 174
    .line 175
    :cond_f
    const-string v1, "audio/vnd.dts"

    .line 176
    .line 177
    .line 178
    invoke-static {p0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 179
    move-result v1

    .line 180
    .line 181
    if-eqz v1, :cond_11

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 185
    move-result p0

    .line 186
    .line 187
    and-int/lit16 p0, p0, 0x80

    .line 188
    .line 189
    if-eqz p0, :cond_10

    .line 190
    return v3

    .line 191
    :cond_10
    return v2

    .line 192
    .line 193
    :cond_11
    const-string v1, "audio/eac3-joc"

    .line 194
    .line 195
    .line 196
    invoke-static {p0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 197
    move-result p0

    .line 198
    .line 199
    if-eqz p0, :cond_12

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 203
    move-result p0

    .line 204
    .line 205
    and-int/lit8 p0, p0, 0x20

    .line 206
    .line 207
    if-eqz p0, :cond_12

    .line 208
    return v3

    .line 209
    :cond_12
    return v2
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
.end method

.method public static isInMediaCodecWhiteList(Ljava/lang/String;)Z
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getDeviceName()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    if-nez v1, :cond_10

    .line 12
    .line 13
    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mCodecCapWhiteList:Ljava/util/HashMap;

    .line 14
    .line 15
    if-eqz v1, :cond_10

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 19
    move-result v1

    .line 20
    .line 21
    if-eqz v1, :cond_10

    .line 22
    .line 23
    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mCodecCapWhiteList:Ljava/util/HashMap;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    check-cast v0, Ljava/lang/Integer;

    .line 30
    .line 31
    const-string v1, "video/avc"

    .line 32
    .line 33
    .line 34
    invoke-static {p0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 35
    move-result v1

    .line 36
    const/4 v3, 0x1

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 42
    move-result p0

    .line 43
    and-int/2addr p0, v3

    .line 44
    .line 45
    if-eqz p0, :cond_0

    .line 46
    return v3

    .line 47
    :cond_0
    return v2

    .line 48
    .line 49
    :cond_1
    const-string v1, "video/hevc"

    .line 50
    .line 51
    .line 52
    invoke-static {p0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 53
    move-result v1

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 59
    move-result p0

    .line 60
    .line 61
    and-int/lit8 p0, p0, 0x2

    .line 62
    .line 63
    if-eqz p0, :cond_2

    .line 64
    return v3

    .line 65
    :cond_2
    return v2

    .line 66
    .line 67
    :cond_3
    const-string v1, "video/x-vnd.on2.vp8"

    .line 68
    .line 69
    .line 70
    invoke-static {p0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 71
    move-result v1

    .line 72
    .line 73
    if-eqz v1, :cond_5

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 77
    move-result p0

    .line 78
    .line 79
    and-int/lit16 p0, p0, 0x100

    .line 80
    .line 81
    if-eqz p0, :cond_4

    .line 82
    return v3

    .line 83
    :cond_4
    return v2

    .line 84
    .line 85
    :cond_5
    const-string v1, "video/x-vnd.on2.vp9"

    .line 86
    .line 87
    .line 88
    invoke-static {p0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 89
    move-result v1

    .line 90
    .line 91
    if-eqz v1, :cond_7

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 95
    move-result p0

    .line 96
    .line 97
    and-int/lit8 p0, p0, 0x4

    .line 98
    .line 99
    if-eqz p0, :cond_6

    .line 100
    return v3

    .line 101
    :cond_6
    return v2

    .line 102
    .line 103
    :cond_7
    const-string v1, "audio/mp4a-latm"

    .line 104
    .line 105
    .line 106
    invoke-static {p0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 107
    move-result v1

    .line 108
    .line 109
    if-eqz v1, :cond_9

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 113
    move-result p0

    .line 114
    .line 115
    and-int/lit8 p0, p0, 0x8

    .line 116
    .line 117
    if-eqz p0, :cond_8

    .line 118
    return v3

    .line 119
    :cond_8
    return v2

    .line 120
    .line 121
    :cond_9
    const-string v1, "audio/ac3"

    .line 122
    .line 123
    .line 124
    invoke-static {p0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 125
    move-result v1

    .line 126
    .line 127
    if-eqz v1, :cond_b

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 131
    move-result p0

    .line 132
    .line 133
    and-int/lit8 p0, p0, 0x10

    .line 134
    .line 135
    if-eqz p0, :cond_a

    .line 136
    return v3

    .line 137
    :cond_a
    return v2

    .line 138
    .line 139
    :cond_b
    const-string v1, "audio/eac3"

    .line 140
    .line 141
    .line 142
    invoke-static {p0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 143
    move-result v1

    .line 144
    .line 145
    if-eqz v1, :cond_d

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 149
    move-result p0

    .line 150
    .line 151
    and-int/lit8 p0, p0, 0x20

    .line 152
    .line 153
    if-eqz p0, :cond_c

    .line 154
    return v3

    .line 155
    :cond_c
    return v2

    .line 156
    .line 157
    :cond_d
    const-string v1, "audio/flac"

    .line 158
    .line 159
    .line 160
    invoke-static {p0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 161
    move-result v1

    .line 162
    .line 163
    if-eqz v1, :cond_f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 167
    move-result p0

    .line 168
    .line 169
    and-int/lit8 p0, p0, 0x40

    .line 170
    .line 171
    if-eqz p0, :cond_e

    .line 172
    return v3

    .line 173
    :cond_e
    return v2

    .line 174
    .line 175
    :cond_f
    const-string v1, "audio/vnd.dts"

    .line 176
    .line 177
    .line 178
    invoke-static {p0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 179
    move-result p0

    .line 180
    .line 181
    if-eqz p0, :cond_10

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 185
    move-result p0

    .line 186
    .line 187
    and-int/lit16 p0, p0, 0x80

    .line 188
    .line 189
    if-eqz p0, :cond_10

    .line 190
    return v3

    .line 191
    :cond_10
    return v2
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
.end method

.method private static isLimitMaxWidthOrMaxHeight(IIIIII)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    if-le p4, p5, :cond_0

    if-gt p4, p0, :cond_1

    if-gt p5, p3, :cond_1

    :cond_0
    if-ge p4, p5, :cond_4

    if-gt p4, p2, :cond_1

    if-le p5, p1, :cond_4

    :cond_1
    if-le p4, p5, :cond_2

    mul-int/2addr p3, p0

    goto :goto_0

    :cond_2
    mul-int p3, p2, p1

    :goto_0
    const-string p2, " maxHeight:"

    const-string v1, " height:"

    const-string v2, "getSupportedFrameRatesFor width:"

    const-string v3, "TPCodecUtils"

    if-lt p0, p4, :cond_3

    if-lt p1, p5, :cond_3

    mul-int v4, p4, p5

    if-lt p3, v4, :cond_3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, " limit maxLumaWidth or maxLumaHeight, but not limit maxLumaSamples, do support! maxWidth:"

    invoke-virtual {v4, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " maxLumaSamples:"

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x2

    invoke-static {p1, v3, p0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    return v0

    :cond_3
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, " do not support! maxWidth:"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x4

    invoke-static {p1, v3, p0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0

    :cond_4
    return v0
.end method

.method public static declared-synchronized isMediaCodecDDPlusSupported()Z
    .locals 4

    .line 1
    .line 2
    const-class v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->isAMediaCodecBlackListModel()Z

    .line 7
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    monitor-exit v0

    .line 12
    return v2

    .line 13
    .line 14
    :cond_0
    :try_start_1
    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAMediaCodecCapList:Ljava/util/ArrayList;

    .line 15
    .line 16
    const-string v3, "audio/eac3"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAMediaCodecCapList:Ljava/util/ArrayList;

    .line 25
    .line 26
    const-string v3, "audio/eac3-joc"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 30
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    monitor-exit v0

    .line 35
    return v2

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    :goto_0
    monitor-exit v0

    .line 39
    const/4 v0, 0x1

    .line 40
    return v0

    .line 41
    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    throw v1
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
.end method

.method public static declared-synchronized isMediaCodecDolbyDSSupported()Z
    .locals 3

    .line 1
    .line 2
    const-class v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->isAMediaCodecBlackListModel()Z

    .line 7
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    monitor-exit v0

    .line 11
    const/4 v0, 0x0

    .line 12
    return v0

    .line 13
    .line 14
    :cond_0
    :try_start_1
    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mAMediaCodecCapList:Ljava/util/ArrayList;

    .line 15
    .line 16
    const-string v2, "audio/ac3"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 20
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    monitor-exit v0

    .line 22
    return v1

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 25
    throw v1
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
.end method

.method private static isSupportedMediaCodec(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mSupportedMediaCodec:Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 6
    move-result p0

    .line 7
    return p0
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
.end method

.method private static isTheSameVersionRange(Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;)Z
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;->lowerboundPatchVersion:I

    .line 3
    .line 4
    iget v1, p1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;->lowerboundPatchVersion:I

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget v0, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;->lowerboundSystemVersion:I

    .line 9
    .line 10
    iget v1, p1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;->lowerboundSystemVersion:I

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    iget v0, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;->upperboundPatchVersion:I

    .line 15
    .line 16
    iget v1, p1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;->upperboundPatchVersion:I

    .line 17
    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    iget p0, p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;->upperboundSystemVersion:I

    .line 21
    .line 22
    iget p1, p1, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecCapability$TPHdrSupportVersionRange;->upperboundSystemVersion:I

    .line 23
    .line 24
    if-ne p0, p1, :cond_0

    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0
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
.end method

.method public static isVMediaCodecBlackListModel()Z
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVMediaCodecBlackListModel:Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getDeviceName()Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 10
    move-result v0

    .line 11
    return v0
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
.end method

.method private static replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(TK;TT;",
            "Ljava/util/HashMap<",
            "TK;TT;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    return-void

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p2, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    return-void
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
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
.end method

.method private static selectBestDecodeLevelFromCapabilityTable(III)I
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mVideoCodecIdToSwCapabilityModel:Landroid/util/SparseArray;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$VideoSwCapabilityModel;

    .line 9
    .line 10
    const-string v1, "TPCodecUtils"

    .line 11
    const/4 v2, 0x3

    .line 12
    const/4 v3, -0x1

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const-string p1, "No corresponding codec id found, codecId:"

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 20
    move-result-object p0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    move-result-object p0

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-static {v2, v1, p0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;Ljava/lang/String;)V

    .line 28
    return v3

    .line 29
    .line 30
    :cond_0
    iget-object p0, v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$VideoSwCapabilityModel;->mCpuProducerToAllDefinitionDecTable:Landroid/util/SparseArray;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 34
    move-result-object p0

    .line 35
    .line 36
    check-cast p0, Ljava/util/HashMap;

    .line 37
    .line 38
    if-eqz p0, :cond_4

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/util/HashMap;->isEmpty()Z

    .line 42
    move-result v0

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    goto :goto_2

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$DefinitionName;->values()[Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$DefinitionName;

    .line 49
    move-result-object v0

    .line 50
    array-length v1, v0

    .line 51
    const/4 v2, 0x0

    .line 52
    .line 53
    :goto_1
    if-ge v2, v1, :cond_3

    .line 54
    .line 55
    aget-object v4, v0, v2

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    move-result-object v5

    .line 60
    .line 61
    check-cast v5, Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 65
    move-result v6

    .line 66
    .line 67
    if-nez v6, :cond_2

    .line 68
    .line 69
    .line 70
    invoke-static {p1, v5}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getCpuHWProductIndex(ILjava/lang/String;)I

    .line 71
    move-result v5

    .line 72
    .line 73
    if-lt p2, v5, :cond_2

    .line 74
    .line 75
    .line 76
    invoke-static {v4}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->convertDefinitionNameToDecodeLevel(Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils$DefinitionName;)I

    .line 77
    move-result p0

    .line 78
    return p0

    .line 79
    .line 80
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    return v3

    .line 83
    .line 84
    :cond_4
    :goto_2
    const-string p0, "No corresponding cpu producer found, cpuHwProducer:"

    .line 85
    .line 86
    .line 87
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 88
    move-result-object p1

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    move-result-object p0

    .line 93
    goto :goto_0
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
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
.end method

.method public static setMediaCodecPreferredSoftwareComponent(Z)V
    .locals 0

    .line 1
    .line 2
    sput-boolean p0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPCodecUtils;->mPreferredSoftwareComponent:Z

    .line 3
    return-void
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
.end method
