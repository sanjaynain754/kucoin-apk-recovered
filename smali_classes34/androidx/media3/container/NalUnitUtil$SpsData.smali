.class public final Landroidx/media3/container/NalUnitUtil$SpsData;
.super Ljava/lang/Object;
.source "NalUnitUtil.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/container/NalUnitUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SpsData"
.end annotation


# instance fields
.field public final bitDepthChromaMinus8:I

.field public final bitDepthLumaMinus8:I

.field public final colorRange:I

.field public final colorSpace:I

.field public final colorTransfer:I

.field public final constraintsFlagsAndReservedZero2Bits:I

.field public final deltaPicOrderAlwaysZeroFlag:Z

.field public final frameMbsOnlyFlag:Z

.field public final frameNumLength:I

.field public final height:I

.field public final levelIdc:I

.field public final maxNumRefFrames:I

.field public final maxNumReorderFrames:I

.field public final picOrderCntLsbLength:I

.field public final picOrderCountType:I

.field public final pixelWidthHeightRatio:F

.field public final profileIdc:I

.field public final separateColorPlaneFlag:Z

.field public final seqParameterSetId:I

.field public final width:I


# direct methods
.method public constructor <init>(IIIIIIIFIIZZIIIZIIII)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Landroidx/media3/container/NalUnitUtil$SpsData;->profileIdc:I

    .line 6
    .line 7
    iput p2, p0, Landroidx/media3/container/NalUnitUtil$SpsData;->constraintsFlagsAndReservedZero2Bits:I

    .line 8
    .line 9
    iput p3, p0, Landroidx/media3/container/NalUnitUtil$SpsData;->levelIdc:I

    .line 10
    .line 11
    iput p4, p0, Landroidx/media3/container/NalUnitUtil$SpsData;->seqParameterSetId:I

    .line 12
    .line 13
    iput p5, p0, Landroidx/media3/container/NalUnitUtil$SpsData;->maxNumRefFrames:I

    .line 14
    .line 15
    iput p6, p0, Landroidx/media3/container/NalUnitUtil$SpsData;->width:I

    .line 16
    .line 17
    iput p7, p0, Landroidx/media3/container/NalUnitUtil$SpsData;->height:I

    .line 18
    .line 19
    iput p8, p0, Landroidx/media3/container/NalUnitUtil$SpsData;->pixelWidthHeightRatio:F

    .line 20
    .line 21
    iput p9, p0, Landroidx/media3/container/NalUnitUtil$SpsData;->bitDepthLumaMinus8:I

    .line 22
    .line 23
    iput p10, p0, Landroidx/media3/container/NalUnitUtil$SpsData;->bitDepthChromaMinus8:I

    .line 24
    .line 25
    iput-boolean p11, p0, Landroidx/media3/container/NalUnitUtil$SpsData;->separateColorPlaneFlag:Z

    .line 26
    .line 27
    iput-boolean p12, p0, Landroidx/media3/container/NalUnitUtil$SpsData;->frameMbsOnlyFlag:Z

    .line 28
    .line 29
    iput p13, p0, Landroidx/media3/container/NalUnitUtil$SpsData;->frameNumLength:I

    .line 30
    .line 31
    iput p14, p0, Landroidx/media3/container/NalUnitUtil$SpsData;->picOrderCountType:I

    .line 32
    .line 33
    iput p15, p0, Landroidx/media3/container/NalUnitUtil$SpsData;->picOrderCntLsbLength:I

    .line 34
    .line 35
    move/from16 p1, p16

    .line 36
    .line 37
    iput-boolean p1, p0, Landroidx/media3/container/NalUnitUtil$SpsData;->deltaPicOrderAlwaysZeroFlag:Z

    .line 38
    .line 39
    move/from16 p1, p17

    .line 40
    .line 41
    iput p1, p0, Landroidx/media3/container/NalUnitUtil$SpsData;->colorSpace:I

    .line 42
    .line 43
    move/from16 p1, p18

    .line 44
    .line 45
    iput p1, p0, Landroidx/media3/container/NalUnitUtil$SpsData;->colorRange:I

    .line 46
    .line 47
    move/from16 p1, p19

    .line 48
    .line 49
    iput p1, p0, Landroidx/media3/container/NalUnitUtil$SpsData;->colorTransfer:I

    .line 50
    .line 51
    move/from16 p1, p20

    .line 52
    .line 53
    iput p1, p0, Landroidx/media3/container/NalUnitUtil$SpsData;->maxNumReorderFrames:I

    .line 54
    return-void
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
.end method
