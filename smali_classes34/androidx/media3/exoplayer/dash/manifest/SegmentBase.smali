.class public abstract Landroidx/media3/exoplayer/dash/manifest/SegmentBase;
.super Ljava/lang/Object;
.source "SegmentBase.java"


# annotations
.annotation build Landroidx/media3/common/util/UnstableApi;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTimelineElement;,
        Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;,
        Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;,
        Landroidx/media3/exoplayer/dash/manifest/SegmentBase$MultiSegmentBase;,
        Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;
    }
.end annotation


# instance fields
.field final initialization:Landroidx/media3/exoplayer/dash/manifest/RangedUri;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field final presentationTimeOffset:J

.field final timescale:J


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/dash/manifest/RangedUri;JJ)V
    .locals 0
    .param p1    # Landroidx/media3/exoplayer/dash/manifest/RangedUri;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;->initialization:Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 6
    .line 7
    iput-wide p2, p0, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;->timescale:J

    .line 8
    .line 9
    iput-wide p4, p0, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;->presentationTimeOffset:J

    .line 10
    return-void
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
.end method


# virtual methods
.method public getInitialization(Landroidx/media3/exoplayer/dash/manifest/Representation;)Landroidx/media3/exoplayer/dash/manifest/RangedUri;
    .locals 0
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object p1, p0, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;->initialization:Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 3
    return-object p1
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
.end method

.method public getPresentationTimeOffsetUs()J
    .locals 6

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;->presentationTimeOffset:J

    .line 3
    .line 4
    .line 5
    const-wide/32 v2, 0xf4240

    .line 6
    .line 7
    iget-wide v4, p0, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;->timescale:J

    .line 8
    .line 9
    .line 10
    invoke-static/range {v0 .. v5}, Landroidx/media3/common/util/Util;->scaleLargeTimestamp(JJJ)J

    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method
