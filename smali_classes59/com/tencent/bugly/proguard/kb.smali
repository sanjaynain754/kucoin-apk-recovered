.class public Lcom/tencent/bugly/proguard/kb;
.super Lcom/tencent/bugly/proguard/hf;
.source "BUGLY"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# static fields
.field public static final A:F = 0.1f

.field public static final B:I = 0x1e

.field public static final C:J = 0x14L

.field public static final D:J = 0xbb8L

.field public static final E:J = 0x2bf20L

.field public static final F:J = 0xc8L

.field public static final G:J = 0x34L

.field public static final H:J = 0xbb8L

.field public static final I:Z = true

.field public static final J:Ljava/lang/String; = "msg"

.field public static final K:Ljava/lang/String; = "vsync"

.field public static final L:Ljava/lang/String; = "msg"

.field public static final y:J = 0x5L

.field public static final z:I = 0x64


# instance fields
.field public n:F

.field public o:Z

.field public p:Z

.field public q:J

.field public r:Z

.field public s:I

.field public t:J

.field public u:J

.field public v:J

.field public w:Z

.field public x:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 6

    const v4, 0x3dcccccd    # 0.1f

    const/16 v5, 0xc8

    .line 1
    const-string v1, "looper_stack"

    const/4 v2, 0x0

    const/16 v3, 0x64

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;ZIFI)V

    const/4 v1, 0x0

    .line 2
    iput v1, v0, Lcom/tencent/bugly/proguard/kb;->n:F

    const/4 v1, 0x1

    .line 3
    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/kb;->o:Z

    .line 4
    iput-boolean v2, v0, Lcom/tencent/bugly/proguard/kb;->p:Z

    const-wide/16 v2, 0x34

    .line 5
    iput-wide v2, v0, Lcom/tencent/bugly/proguard/kb;->q:J

    .line 6
    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/kb;->r:Z

    const/16 v2, 0x1e

    .line 7
    iput v2, v0, Lcom/tencent/bugly/proguard/kb;->s:I

    const-wide/16 v2, 0x14

    .line 8
    iput-wide v2, v0, Lcom/tencent/bugly/proguard/kb;->t:J

    const-wide/16 v2, 0xbb8

    .line 9
    iput-wide v2, v0, Lcom/tencent/bugly/proguard/kb;->u:J

    const-wide/32 v2, 0x2bf20

    .line 10
    iput-wide v2, v0, Lcom/tencent/bugly/proguard/kb;->v:J

    .line 11
    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/kb;->w:Z

    .line 12
    const-string/jumbo v1, "msg"

    iput-object v1, v0, Lcom/tencent/bugly/proguard/kb;->x:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/tencent/bugly/proguard/kb;)V
    .locals 3

    .line 13
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/hf;-><init>(Lcom/tencent/bugly/proguard/hf;)V

    const/4 v0, 0x0

    .line 14
    iput v0, p0, Lcom/tencent/bugly/proguard/kb;->n:F

    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/kb;->o:Z

    const/4 v1, 0x0

    .line 16
    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/kb;->p:Z

    const-wide/16 v1, 0x34

    .line 17
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/kb;->q:J

    .line 18
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/kb;->r:Z

    const/16 v1, 0x1e

    .line 19
    iput v1, p0, Lcom/tencent/bugly/proguard/kb;->s:I

    const-wide/16 v1, 0x14

    .line 20
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/kb;->t:J

    const-wide/16 v1, 0xbb8

    .line 21
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/kb;->u:J

    const-wide/32 v1, 0x2bf20

    .line 22
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/kb;->v:J

    .line 23
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/kb;->w:Z

    .line 24
    const-string/jumbo v0, "msg"

    iput-object v0, p0, Lcom/tencent/bugly/proguard/kb;->x:Ljava/lang/String;

    .line 25
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/kb;->a(Lcom/tencent/bugly/proguard/hf;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/hf;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lcom/tencent/bugly/proguard/hf;)V

    .line 2
    instance-of v0, p1, Lcom/tencent/bugly/proguard/kb;

    if-eqz v0, :cond_1

    .line 3
    check-cast p1, Lcom/tencent/bugly/proguard/kb;

    .line 4
    iget v0, p1, Lcom/tencent/bugly/proguard/kb;->n:F

    iput v0, p0, Lcom/tencent/bugly/proguard/kb;->n:F

    .line 5
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/kb;->p:Z

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/kb;->p:Z

    .line 6
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/kb;->o:Z

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/kb;->o:Z

    .line 7
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/kb;->q:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/kb;->q:J

    .line 8
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/kb;->r:Z

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/kb;->r:Z

    .line 9
    iget v0, p1, Lcom/tencent/bugly/proguard/kb;->s:I

    iput v0, p0, Lcom/tencent/bugly/proguard/kb;->s:I

    .line 10
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/kb;->t:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/kb;->t:J

    .line 11
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/kb;->u:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/kb;->u:J

    .line 12
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/kb;->v:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/kb;->v:J

    .line 13
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/kb;->w:Z

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/kb;->w:Z

    .line 14
    iget-object p1, p1, Lcom/tencent/bugly/proguard/kb;->x:Ljava/lang/String;

    iput-object p1, p0, Lcom/tencent/bugly/proguard/kb;->x:Ljava/lang/String;

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 9

    const-string/jumbo v0, "vsync"

    const-string/jumbo v1, "msg"

    const-string v2, "detect_strategy"

    const-string/jumbo v3, "suspend_before_get_stack"

    const-string/jumbo v4, "stack_interval_ms"

    if-nez p1, :cond_0

    goto :goto_2

    .line 15
    :cond_0
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lorg/json/JSONObject;)V

    .line 16
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/kb;->b(Lorg/json/JSONObject;)V

    .line 17
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 18
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v4

    const-wide/16 v6, 0x5

    cmp-long v8, v4, v6

    if-gez v8, :cond_1

    move-wide v4, v6

    .line 19
    :cond_1
    iput-wide v4, p0, Lcom/tencent/bugly/proguard/kb;->q:J

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 20
    :cond_2
    :goto_0
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/kb;->c(Lorg/json/JSONObject;)V

    .line 21
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 22
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    iput-boolean v3, p0, Lcom/tencent/bugly/proguard/kb;->w:Z

    .line 23
    :cond_3
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 24
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 26
    iput-object v1, p0, Lcom/tencent/bugly/proguard/kb;->x:Ljava/lang/String;

    return-void

    .line 27
    :cond_4
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 28
    iput-object v0, p0, Lcom/tencent/bugly/proguard/kb;->x:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 29
    :goto_1
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 30
    const-string v1, "LooperConfigParser, t: "

    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/mf;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    .line 31
    const-string v1, "RMonitor_config"

    filled-new-array {v1, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public b()Lcom/tencent/bugly/proguard/hf;
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/bugly/proguard/kb;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/kb;-><init>(Lcom/tencent/bugly/proguard/kb;)V

    return-object v0
.end method

.method public final b(Lorg/json/JSONObject;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 2
    const-string/jumbo v0, "quick_trace_ratio"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, p0, Lcom/tencent/bugly/proguard/kb;->n:F

    .line 4
    :cond_0
    const-string/jumbo v0, "quick_trace_record"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/kb;->o:Z

    .line 6
    :cond_1
    const-string/jumbo v0, "quick_trace_protect"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 7
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/kb;->p:Z

    :cond_2
    return-void
.end method

.method public final c(Lorg/json/JSONObject;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 2
    const-string v0, "enable_validate"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/kb;->r:Z

    .line 4
    :cond_0
    const-string v0, "long_lag_slice_count"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 5
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    if-gtz v0, :cond_1

    const/16 v0, 0x1e

    .line 6
    :cond_1
    iput v0, p0, Lcom/tencent/bugly/proguard/kb;->s:I

    .line 7
    :cond_2
    const-string v0, "collect_stack_delay_in_ms"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_4

    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_3

    const-wide/16 v0, 0x14

    .line 9
    :cond_3
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/kb;->t:J

    .line 10
    :cond_4
    const-string v0, "long_lag_in_ms"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 11
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_5

    const-wide/16 v0, 0xbb8

    .line 12
    :cond_5
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/kb;->u:J

    .line 13
    :cond_6
    const-string v0, "lag_max_cost_in_ms"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 14
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long p1, v0, v2

    if-gtz p1, :cond_7

    const-wide/32 v0, 0x2bf20

    .line 15
    :cond_7
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/kb;->v:J

    :cond_8
    return-void
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/kb;->p:Z

    return v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/kb;->b()Lcom/tencent/bugly/proguard/hf;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public d()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/kb;->o:Z

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

.method public e()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/kb;->r:Z

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

.method public f()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/kb;->t:J

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

.method public g()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/kb;->v:J

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

.method public h()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/kb;->u:J

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

.method public i()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/kb;->s:I

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

.method public j()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/kb;->n:F

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

.method public k()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/kb;->w:Z

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

.method public l()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/kb;->q:J

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
