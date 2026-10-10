.class public Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;
.super Landroidx/media3/exoplayer/dash/manifest/SegmentBase;
.source "SegmentBase.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/dash/manifest/SegmentBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SingleSegmentBase"
.end annotation


# instance fields
.field final indexLength:J

.field final indexStart:J


# direct methods
.method public constructor <init>()V
    .locals 10

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x1

    const-wide/16 v4, 0x0

    move-object v0, p0

    .line 4
    invoke-direct/range {v0 .. v9}, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;-><init>(Landroidx/media3/exoplayer/dash/manifest/RangedUri;JJJJ)V

    return-void
.end method

.method public constructor <init>(Landroidx/media3/exoplayer/dash/manifest/RangedUri;JJJJ)V
    .locals 0
    .param p1    # Landroidx/media3/exoplayer/dash/manifest/RangedUri;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct/range {p0 .. p5}, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;-><init>(Landroidx/media3/exoplayer/dash/manifest/RangedUri;JJ)V

    move-object p1, p0

    .line 2
    iput-wide p6, p1, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;->indexStart:J

    .line 3
    iput-wide p8, p1, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;->indexLength:J

    return-void
.end method


# virtual methods
.method public getIndex()Landroidx/media3/exoplayer/dash/manifest/RangedUri;
    .locals 6
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-wide v4, p0, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;->indexLength:J

    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v0, v4, v0

    .line 7
    .line 8
    if-gtz v0, :cond_0

    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    .line 12
    :cond_0
    new-instance v0, Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    iget-wide v2, p0, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;->indexStart:J

    .line 16
    .line 17
    .line 18
    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/dash/manifest/RangedUri;-><init>(Ljava/lang/String;JJ)V

    .line 19
    return-object v0
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
.end method
