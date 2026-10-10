.class public Lcom/tencent/ugc/TXRecordCommon;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/ugc/TXRecordCommon$ITXBGMNotify;,
        Lcom/tencent/ugc/TXRecordCommon$TXUGCCustomConfig;,
        Lcom/tencent/ugc/TXRecordCommon$TXUGCSimpleConfig;,
        Lcom/tencent/ugc/TXRecordCommon$TXUGCAudioConfig;,
        Lcom/tencent/ugc/TXRecordCommon$ITXSnapshotListener;,
        Lcom/tencent/ugc/TXRecordCommon$ITXVideoRecordListener;,
        Lcom/tencent/ugc/TXRecordCommon$TXRecordResult;
    }
.end annotation


# static fields
.field public static final AUDIO_CHANNEL_MONO:I = 0x1

.field public static final AUDIO_CHANNEL_STEREO:I = 0x2

.field public static final AUDIO_SAMPLERATE_16000:I = 0x3e80

.field public static final AUDIO_SAMPLERATE_32000:I = 0x7d00

.field public static final AUDIO_SAMPLERATE_44100:I = 0xac44

.field public static final AUDIO_SAMPLERATE_48000:I = 0xbb80

.field public static final AUDIO_SAMPLERATE_8000:I = 0x1f40

.field public static final EVT_CAMERA_CANNOT_USE:I = 0x3

.field public static final EVT_DESCRIPTION:Ljava/lang/String; = "EVT_DESCRIPTION"

.field public static final EVT_ID_PAUSE:I = 0x1

.field public static final EVT_ID_RESUME:I = 0x2

.field public static final EVT_ID_STARTED:I = 0x6

.field public static final EVT_ID_VIDEO_GENERATED:I = 0x5

.field public static final EVT_MIC_CANNOT_USE:I = 0x4

.field public static final EVT_PARAM1:Ljava/lang/String; = "EVT_PARAM1"

.field public static final EVT_PARAM2:Ljava/lang/String; = "EVT_PARAM2"

.field public static final EVT_TIME:Ljava/lang/String; = "EVT_TIME"

.field public static final RECORD_PROFILE_BASELINE:I = 0x1

.field public static final RECORD_PROFILE_DEFAULT:I = 0x0

.field public static final RECORD_PROFILE_HIGH:I = 0x3

.field public static final RECORD_PROFILE_MAIN:I = 0x2

.field public static final RECORD_RESULT_COMPOSE_CANCEL:I = -0x7

.field public static final RECORD_RESULT_COMPOSE_INTERNAL_ERR:I = -0x9

.field public static final RECORD_RESULT_COMPOSE_SET_DST_PATH_ERR:I = -0x5

.field public static final RECORD_RESULT_COMPOSE_SET_SRC_PATH_ERR:I = -0x4

.field public static final RECORD_RESULT_COMPOSE_START_ERR:I = -0x6

.field public static final RECORD_RESULT_COMPOSE_VERIFY_FAIL:I = -0x8

.field public static final RECORD_RESULT_FAILED:I = -0x1

.field public static final RECORD_RESULT_FILE_ERR:I = -0x3

.field public static final RECORD_RESULT_OK:I = 0x0

.field public static final RECORD_RESULT_OK_LESS_THAN_MINDURATION:I = 0x1

.field public static final RECORD_RESULT_OK_REACHED_MAXDURATION:I = 0x2

.field public static final RECORD_RESULT_OK_WITHOUT_AUDIO:I = 0x4

.field public static final RECORD_RESULT_SUSPEND_FOR_NO_TASK:I = -0x2

.field public static final RECORD_SPEED_FAST:I = 0x3

.field public static final RECORD_SPEED_FASTEST:I = 0x4

.field public static final RECORD_SPEED_NORMAL:I = 0x2

.field public static final RECORD_SPEED_SLOW:I = 0x1

.field public static final RECORD_SPEED_SLOWEST:I = 0x0

.field public static final RECORD_TYPE_STREAM_SOURCE:I = 0x1

.field public static final START_AUDIO_RECORD_ERROR_INVALID_PARAMETER:I = -0x6

.field public static final START_AUDIO_RECORD_ERROR_LICENCE_VERIFICATION_FAILED:I = -0x5

.field public static final START_AUDIO_RECORD_ERROR_MIC_CANNOT_USE:I = -0x4

.field public static final START_AUDIO_RECORD_ERROR_PATH_IS_EMPTY:I = -0x2

.field public static final START_AUDIO_RECORD_OK:I = 0x0

.field public static final START_RECORD_ERR_API_IS_LOWER_THAN_18:I = -0x3

.field public static final START_RECORD_ERR_IS_IN_RECORDING:I = -0x1

.field public static final START_RECORD_ERR_LICENCE_VERIFICATION_FAILED:I = -0x5

.field public static final START_RECORD_ERR_NOT_INIT:I = -0x4

.field public static final START_RECORD_ERR_VIDEO_PATH_IS_EMPTY:I = -0x2

.field public static final START_RECORD_OK:I = 0x0

.field public static final VIDEO_ASPECT_RATIO_16_9:I = 0x3

.field public static final VIDEO_ASPECT_RATIO_1_1:I = 0x2

.field public static final VIDEO_ASPECT_RATIO_3_4:I = 0x1

.field public static final VIDEO_ASPECT_RATIO_4_3:I = 0x4

.field public static final VIDEO_ASPECT_RATIO_9_16:I = 0x0

.field public static final VIDEO_QUALITY_HIGH:I = 0x3

.field public static final VIDEO_QUALITY_LMEDIUM:I = 0x1

.field public static final VIDEO_QUALITY_LOW:I = 0x0

.field public static final VIDEO_QUALITY_MEDIUM:I = 0x2

.field public static final VIDEO_RENDER_MIRROR_TYPE_AUTO:I = 0x0

.field public static final VIDEO_RENDER_MIRROR_TYPE_DISABLE:I = 0x2

.field public static final VIDEO_RENDER_MIRROR_TYPE_ENABLE:I = 0x1

.field public static final VIDEO_RENDER_MODE_ADJUST_RESOLUTION:I = 0x1

.field public static final VIDEO_RENDER_MODE_FULL_FILL_SCREEN:I = 0x0

.field public static final VIDEO_RESOLUTION_1080_1920:I = 0x4

.field public static final VIDEO_RESOLUTION_360_640:I = 0x0

.field public static final VIDEO_RESOLUTION_480_640:I = 0x1

.field public static final VIDEO_RESOLUTION_540_960:I = 0x2

.field public static final VIDEO_RESOLUTION_720_1280:I = 0x3

.field public static final VIDOE_REVERB_TYPE_0:I = 0x0

.field public static final VIDOE_REVERB_TYPE_1:I = 0x1

.field public static final VIDOE_REVERB_TYPE_2:I = 0x2

.field public static final VIDOE_REVERB_TYPE_3:I = 0x3

.field public static final VIDOE_REVERB_TYPE_4:I = 0x4

.field public static final VIDOE_REVERB_TYPE_5:I = 0x5

.field public static final VIDOE_REVERB_TYPE_6:I = 0x6

.field public static final VIDOE_REVERB_TYPE_7:I = 0x7

.field public static final VIDOE_VOICECHANGER_TYPE_0:I = 0x0

.field public static final VIDOE_VOICECHANGER_TYPE_1:I = 0x1

.field public static final VIDOE_VOICECHANGER_TYPE_10:I = 0xa

.field public static final VIDOE_VOICECHANGER_TYPE_11:I = 0xb

.field public static final VIDOE_VOICECHANGER_TYPE_2:I = 0x2

.field public static final VIDOE_VOICECHANGER_TYPE_3:I = 0x3

.field public static final VIDOE_VOICECHANGER_TYPE_4:I = 0x4

.field public static final VIDOE_VOICECHANGER_TYPE_6:I = 0x6

.field public static final VIDOE_VOICECHANGER_TYPE_7:I = 0x7

.field public static final VIDOE_VOICECHANGER_TYPE_8:I = 0x8

.field public static final VIDOE_VOICECHANGER_TYPE_9:I = 0x9


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
.end method
