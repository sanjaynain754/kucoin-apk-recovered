.class public Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig$Builder;
    }
.end annotation


# instance fields
.field private mAdjustIntervalThresholdMs:J

.field private mFrozenThresholdMs:J

.field private mMaxIncreaseDurationMs:J

.field private mMinDecreaseDurationMs:J

.field private mPerDecreaseDurationMs:J

.field private mPerIncreaseDurationMs:J


# direct methods
.method public constructor <init>(JJJJJJ)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-wide p1, p0, Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig;->mMinDecreaseDurationMs:J

    .line 6
    .line 7
    iput-wide p3, p0, Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig;->mMaxIncreaseDurationMs:J

    .line 8
    .line 9
    iput-wide p5, p0, Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig;->mPerIncreaseDurationMs:J

    .line 10
    .line 11
    iput-wide p7, p0, Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig;->mPerDecreaseDurationMs:J

    .line 12
    .line 13
    iput-wide p9, p0, Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig;->mAdjustIntervalThresholdMs:J

    .line 14
    .line 15
    iput-wide p11, p0, Lcom/tencent/thumbplayer/tcmedia/core/demuxer/TPNativeJitterBufferConfig;->mFrozenThresholdMs:J

    .line 16
    return-void
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
.end method
