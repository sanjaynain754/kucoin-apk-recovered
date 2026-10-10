.class public final Lcom/tencent/bugly/proguard/lc;
.super Lcom/tencent/bugly/proguard/kc;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/common/looper/IFrame;
.implements Lcom/tencent/bugly/proguard/lh$b;


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    api = 0x10
.end annotation


# instance fields
.field public j:Lcom/tencent/bugly/proguard/lh;

.field public k:Z

.field public l:J

.field public m:Lcom/tencent/bugly/proguard/f7;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/kc;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/bugly/proguard/lc;->j:Lcom/tencent/bugly/proguard/lh;

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/lc;->k:Z

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/lc;->l:J

    .line 14
    .line 15
    new-instance v0, Lcom/tencent/bugly/proguard/f7;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/f7;-><init>()V

    .line 19
    .line 20
    iput-object v0, p0, Lcom/tencent/bugly/proguard/lc;->m:Lcom/tencent/bugly/proguard/f7;

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/tencent/bugly/proguard/lh;->b()Lcom/tencent/bugly/proguard/lh;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    iput-object v0, p0, Lcom/tencent/bugly/proguard/lc;->j:Lcom/tencent/bugly/proguard/lh;

    .line 27
    return-void
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
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/lc;->k:Z

    return-void
.end method

.method public a(Ljava/lang/String;J)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/tencent/bugly/proguard/kc;->a(Ljava/lang/String;J)Z

    move-result p1

    if-eqz p1, :cond_1

    const-wide/16 p2, 0x0

    .line 2
    iput-wide p2, p0, Lcom/tencent/bugly/proguard/lc;->l:J

    .line 3
    iget-object p2, p0, Lcom/tencent/bugly/proguard/lc;->j:Lcom/tencent/bugly/proguard/lh;

    if-eqz p2, :cond_0

    .line 4
    invoke-virtual {p2, p0}, Lcom/tencent/bugly/proguard/lh;->a(Lcom/tencent/bugly/proguard/lh$b;)V

    .line 5
    :cond_0
    sget-object p2, Lcom/tencent/bugly/common/looper/FrameManager;->Companion:Lcom/tencent/bugly/common/looper/FrameManager$Companion;

    invoke-virtual {p2, p0}, Lcom/tencent/bugly/common/looper/FrameManager$Companion;->register(Lcom/tencent/bugly/common/looper/IFrame;)V

    :cond_1
    return p1
.end method

.method public doFrame(J)V
    .locals 9

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/lc;->l:J

    .line 3
    .line 4
    cmp-long v2, p1, v0

    .line 5
    .line 6
    if-ltz v2, :cond_0

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v2, v0, v2

    .line 11
    .line 12
    if-nez v2, :cond_1

    .line 13
    :cond_0
    move-wide v4, p1

    .line 14
    goto :goto_2

    .line 15
    .line 16
    :cond_1
    iget-object v2, p0, Lcom/tencent/bugly/proguard/lc;->j:Lcom/tencent/bugly/proguard/lh;

    .line 17
    .line 18
    if-eqz v2, :cond_2

    .line 19
    .line 20
    iget-boolean v2, p0, Lcom/tencent/bugly/proguard/lc;->k:Z

    .line 21
    const/4 v3, 0x0

    .line 22
    .line 23
    iput-boolean v3, p0, Lcom/tencent/bugly/proguard/lc;->k:Z

    .line 24
    :goto_0
    move v8, v2

    .line 25
    goto :goto_1

    .line 26
    :cond_2
    const/4 v2, 0x1

    .line 27
    goto :goto_0

    .line 28
    .line 29
    :goto_1
    sub-long v6, p1, v0

    .line 30
    .line 31
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/lc;->l:J

    .line 32
    .line 33
    iget-object v3, p0, Lcom/tencent/bugly/proguard/lc;->m:Lcom/tencent/bugly/proguard/f7;

    .line 34
    move-wide v4, p1

    .line 35
    .line 36
    .line 37
    invoke-virtual/range {v3 .. v8}, Lcom/tencent/bugly/proguard/f7;->a(JJZ)V

    .line 38
    .line 39
    iget-object p1, p0, Lcom/tencent/bugly/proguard/lc;->m:Lcom/tencent/bugly/proguard/f7;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/kc;->b(Lcom/tencent/bugly/proguard/f7;)V

    .line 43
    return-void

    .line 44
    .line 45
    :goto_2
    iput-wide v4, p0, Lcom/tencent/bugly/proguard/lc;->l:J

    .line 46
    return-void
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

.method public e()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/tencent/bugly/proguard/kc;->e()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v1, Lcom/tencent/bugly/common/looper/FrameManager;->Companion:Lcom/tencent/bugly/common/looper/FrameManager$Companion;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, p0}, Lcom/tencent/bugly/common/looper/FrameManager$Companion;->unRegister(Lcom/tencent/bugly/common/looper/IFrame;)V

    .line 12
    :cond_0
    return v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public f()Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/tencent/bugly/proguard/kc;->f()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/lc;->l:J

    .line 11
    .line 12
    sget-object v1, Lcom/tencent/bugly/common/looper/FrameManager;->Companion:Lcom/tencent/bugly/common/looper/FrameManager$Companion;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p0}, Lcom/tencent/bugly/common/looper/FrameManager$Companion;->register(Lcom/tencent/bugly/common/looper/IFrame;)V

    .line 16
    :cond_0
    return v0
    .line 17
.end method

.method public g()Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/tencent/bugly/proguard/kc;->g()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/lc;->l:J

    .line 11
    .line 12
    iget-object v1, p0, Lcom/tencent/bugly/proguard/lc;->j:Lcom/tencent/bugly/proguard/lh;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p0}, Lcom/tencent/bugly/proguard/lh;->b(Lcom/tencent/bugly/proguard/lh$b;)V

    .line 18
    .line 19
    :cond_0
    sget-object v1, Lcom/tencent/bugly/common/looper/FrameManager;->Companion:Lcom/tencent/bugly/common/looper/FrameManager$Companion;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p0}, Lcom/tencent/bugly/common/looper/FrameManager$Companion;->unRegister(Lcom/tencent/bugly/common/looper/IFrame;)V

    .line 23
    :cond_1
    return v0
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
.end method

.method public isOpen()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/kc;->c:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/kc;->c()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
.end method
