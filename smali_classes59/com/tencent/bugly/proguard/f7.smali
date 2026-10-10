.class public Lcom/tencent/bugly/proguard/f7;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final e:J = 0xf4240L

.field public static final f:J = 0x45d964b800L


# instance fields
.field public a:J

.field public b:J

.field public c:J

.field public d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/f7;->d:Z

    .line 7
    return-void
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


# virtual methods
.method public a()J
    .locals 4

    .line 9
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/f7;->c:J

    iget-wide v2, p0, Lcom/tencent/bugly/proguard/f7;->b:J

    add-long/2addr v0, v2

    iget-wide v2, p0, Lcom/tencent/bugly/proguard/f7;->a:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public a(JJZ)V
    .locals 0

    .line 5
    iput-wide p3, p0, Lcom/tencent/bugly/proguard/f7;->c:J

    .line 6
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/f7;->a:J

    .line 7
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/f7;->b:J

    .line 8
    iput-boolean p5, p0, Lcom/tencent/bugly/proguard/f7;->d:Z

    return-void
.end method

.method public a(Landroid/view/FrameMetrics;)V
    .locals 2
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x1a
    .end annotation

    const/4 v0, 0x1

    .line 1
    :try_start_0
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/f7;->d:Z

    const/16 v0, 0xa

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/f7;->a:J

    const/16 v0, 0xb

    .line 3
    invoke-virtual {p1, v0}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/f7;->b:J

    const/16 v0, 0x8

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/f7;->c:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public b()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/f7;->a:J

    .line 3
    return-wide v0
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
.end method

.method public c()Z
    .locals 12

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/f7;->a:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v4, v0, v2

    .line 7
    const/4 v5, 0x1

    .line 8
    .line 9
    if-lez v4, :cond_3

    .line 10
    .line 11
    iget-wide v6, p0, Lcom/tencent/bugly/proguard/f7;->b:J

    .line 12
    .line 13
    cmp-long v4, v6, v2

    .line 14
    .line 15
    if-gtz v4, :cond_0

    .line 16
    goto :goto_0

    .line 17
    .line 18
    :cond_0
    iget-wide v8, p0, Lcom/tencent/bugly/proguard/f7;->c:J

    .line 19
    .line 20
    cmp-long v4, v8, v2

    .line 21
    .line 22
    if-ltz v4, :cond_3

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    const-wide v10, 0x45d964b800L

    .line 28
    .line 29
    cmp-long v4, v8, v10

    .line 30
    .line 31
    if-lez v4, :cond_1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    sub-long/2addr v6, v0

    .line 34
    .line 35
    cmp-long v0, v6, v2

    .line 36
    .line 37
    if-ltz v0, :cond_3

    .line 38
    .line 39
    cmp-long v0, v6, v10

    .line 40
    .line 41
    if-lez v0, :cond_2

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    const/4 v0, 0x0

    .line 44
    return v0

    .line 45
    :cond_3
    :goto_0
    return v5
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
.end method

.method public d()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/f7;->d:Z

    .line 3
    return v0
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
.end method
