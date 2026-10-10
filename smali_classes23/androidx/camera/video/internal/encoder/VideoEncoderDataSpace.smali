.class public abstract Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;
.super Ljava/lang/Object;
.source "VideoEncoderDataSpace.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# static fields
.field public static final ENCODER_DATA_SPACE_BT2020_HLG:Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;

.field public static final ENCODER_DATA_SPACE_BT2020_PQ:Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;

.field public static final ENCODER_DATA_SPACE_BT709:Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;

.field public static final ENCODER_DATA_SPACE_SRGB:Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;

.field public static final ENCODER_DATA_SPACE_UNSPECIFIED:Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;

.field public static final VIDEO_COLOR_RANGE_UNSPECIFIED:I

.field public static final VIDEO_COLOR_STANDARD_UNSPECIFIED:I

.field public static final VIDEO_COLOR_TRANSFER_UNSPECIFIED:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-static {v0, v0, v0}, Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;->create(III)Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;

    .line 5
    move-result-object v0

    .line 6
    .line 7
    sput-object v0, Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;->ENCODER_DATA_SPACE_UNSPECIFIED:Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;

    .line 8
    const/4 v0, 0x2

    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x3

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2, v0}, Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;->create(III)Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sput-object v0, Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;->ENCODER_DATA_SPACE_BT709:Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2, v1}, Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;->create(III)Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    sput-object v0, Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;->ENCODER_DATA_SPACE_SRGB:Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;

    .line 23
    const/4 v0, 0x7

    .line 24
    const/4 v2, 0x6

    .line 25
    .line 26
    .line 27
    invoke-static {v2, v0, v1}, Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;->create(III)Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    sput-object v0, Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;->ENCODER_DATA_SPACE_BT2020_HLG:Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v2, v1}, Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;->create(III)Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    sput-object v0, Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;->ENCODER_DATA_SPACE_BT2020_PQ:Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;

    .line 37
    return-void
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
.end method

.method public static create(III)Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/video/internal/encoder/AutoValue_VideoEncoderDataSpace;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Landroidx/camera/video/internal/encoder/AutoValue_VideoEncoderDataSpace;-><init>(III)V

    .line 6
    return-object v0
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
.end method


# virtual methods
.method public abstract getRange()I
.end method

.method public abstract getStandard()I
.end method

.method public abstract getTransfer()I
.end method
