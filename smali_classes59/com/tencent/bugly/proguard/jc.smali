.class public Lcom/tencent/bugly/proguard/jc;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:J = 0xaL

.field public static final b:J = 0x1f4L

.field public static final c:J = 0x2932e00L

.field public static final d:I = 0x0

.field public static final e:I = 0x1

.field public static final f:I = 0x2

.field public static final g:I = 0x4

.field public static final h:I = 0x8

.field public static final i:I = 0x10

.field public static final j:I = 0x20

.field public static final k:I = 0x40

.field public static final l:I = 0x80


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
.end method

.method public static a(Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;)I
    .locals 6

    const/4 v0, 0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    const-wide/16 v1, 0x1f4

    .line 1
    invoke-static {p0, v1, v2}, Lcom/tencent/bugly/proguard/jc;->a(Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;J)Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    .line 2
    :cond_1
    iget-object v0, p0, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->refreshCount:[J

    invoke-static {v0}, Lcom/tencent/bugly/proguard/jc;->b([J)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_2

    const/16 v0, 0x40

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 3
    :goto_0
    iget-object p0, p0, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->refreshDuration:[J

    invoke-static {p0}, Lcom/tencent/bugly/proguard/jc;->b([J)J

    move-result-wide v4

    cmp-long p0, v4, v2

    if-gtz p0, :cond_3

    or-int/lit16 p0, v0, 0x80

    return p0

    :cond_3
    return v0
.end method

.method public static a(Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;J)Z
    .locals 2
    .param p0    # Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 4
    iget-wide v0, p0, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->totalDuration:J

    cmp-long p1, v0, p1

    if-ltz p1, :cond_1

    iget-wide p1, p0, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->suspendDuration:J

    cmp-long p1, v0, p1

    if-ltz p1, :cond_1

    iget-wide p0, p0, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->hitchesDuration:J

    cmp-long p0, v0, p0

    if-gez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static a([J)Z
    .locals 7

    .line 5
    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-wide v3, p0, v2

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-gez v3, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static b(Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;)I
    .locals 5

    const/4 v0, 0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    const-wide/16 v1, 0xa

    .line 1
    invoke-static {p0, v1, v2}, Lcom/tencent/bugly/proguard/jc;->a(Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;J)Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    .line 2
    :cond_1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/jc;->c(Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;)I

    move-result v0

    .line 3
    iget-wide v1, p0, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->totalDuration:J

    const-wide/32 v3, 0x2932e00

    cmp-long v1, v1, v3

    if-lez v1, :cond_2

    or-int/lit8 v0, v0, 0x2

    .line 4
    :cond_2
    iget-object v1, p0, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->refreshDuration:[J

    invoke-static {v1}, Lcom/tencent/bugly/proguard/jc;->b([J)J

    move-result-wide v1

    .line 5
    iget-wide v3, p0, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->totalDuration:J

    cmp-long p0, v1, v3

    if-lez p0, :cond_3

    or-int/lit16 p0, v0, 0x80

    return p0

    :cond_3
    return v0
.end method

.method public static b([J)J
    .locals 6

    .line 6
    array-length v0, p0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    aget-wide v4, p0, v3

    add-long/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-wide v1
.end method

.method public static c(Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;)I
    .locals 6

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->suspendDuration:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-gez v0, :cond_0

    .line 9
    const/4 v0, 0x4

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    .line 13
    :goto_0
    iget-wide v4, p0, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->hitchesDuration:J

    .line 14
    .line 15
    cmp-long v1, v4, v2

    .line 16
    .line 17
    if-gez v1, :cond_1

    .line 18
    .line 19
    or-int/lit8 v0, v0, 0x8

    .line 20
    .line 21
    :cond_1
    iget-object v1, p0, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->refreshCount:[J

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Lcom/tencent/bugly/proguard/jc;->a([J)Z

    .line 25
    move-result v1

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    or-int/lit8 v0, v0, 0x10

    .line 30
    .line 31
    :cond_2
    iget-object p0, p0, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->refreshDuration:[J

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, Lcom/tencent/bugly/proguard/jc;->a([J)Z

    .line 35
    move-result p0

    .line 36
    .line 37
    if-eqz p0, :cond_3

    .line 38
    .line 39
    or-int/lit8 p0, v0, 0x20

    .line 40
    return p0

    .line 41
    :cond_3
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
.end method
