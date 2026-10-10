.class public Lcom/tencent/bugly/proguard/dh;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final g:Ljava/lang/String; = "trace_id"

.field public static final h:Ljava/lang/String; = "span_id"

.field public static final i:Ljava/lang/String; = "parent_span_id"

.field public static final j:Ljava/lang/String; = "name"

.field public static final k:Ljava/lang/String; = "start_time_unix_ms"

.field public static final l:Ljava/lang/String; = "end_time_unix_ms"

.field public static final m:Ljava/lang/String; = "kind"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Lcom/tencent/bugly/proguard/dh;

.field public final e:J

.field public f:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/dh;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/dh;->f:J

    .line 3
    iput-object p1, p0, Lcom/tencent/bugly/proguard/dh;->a:Ljava/lang/String;

    .line 4
    invoke-static {}, Lcom/tencent/bugly/proguard/ch;->b()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/dh;->b:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lcom/tencent/bugly/proguard/dh;->c:Ljava/lang/String;

    .line 6
    iput-object p3, p0, Lcom/tencent/bugly/proguard/dh;->d:Lcom/tencent/bugly/proguard/dh;

    .line 7
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/tencent/bugly/proguard/dh;->e:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/dh;JJ)V
    .locals 2

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 9
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/dh;->f:J

    .line 10
    iput-object p1, p0, Lcom/tencent/bugly/proguard/dh;->a:Ljava/lang/String;

    .line 11
    invoke-static {}, Lcom/tencent/bugly/proguard/ch;->b()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/dh;->b:Ljava/lang/String;

    .line 12
    iput-object p2, p0, Lcom/tencent/bugly/proguard/dh;->c:Ljava/lang/String;

    .line 13
    iput-object p3, p0, Lcom/tencent/bugly/proguard/dh;->d:Lcom/tencent/bugly/proguard/dh;

    .line 14
    iput-wide p4, p0, Lcom/tencent/bugly/proguard/dh;->e:J

    .line 15
    iput-wide p6, p0, Lcom/tencent/bugly/proguard/dh;->f:J

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/dh;->e:J

    return-wide v0
.end method

.method public final a(JJJ)J
    .locals 0

    .line 1
    add-long/2addr p5, p1

    sub-long/2addr p5, p3

    return-wide p5
.end method

.method public a(JJ)Lorg/json/JSONObject;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 3
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    iget-object v1, p0, Lcom/tencent/bugly/proguard/dh;->a:Ljava/lang/String;

    const-string/jumbo v2, "trace_id"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 5
    iget-object v1, p0, Lcom/tencent/bugly/proguard/dh;->b:Ljava/lang/String;

    const-string/jumbo v2, "span_id"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 6
    iget-object v1, p0, Lcom/tencent/bugly/proguard/dh;->d:Lcom/tencent/bugly/proguard/dh;

    if-nez v1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    iget-object v1, v1, Lcom/tencent/bugly/proguard/dh;->b:Ljava/lang/String;

    :goto_0
    const-string/jumbo v2, "parent_span_id"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 7
    iget-object v1, p0, Lcom/tencent/bugly/proguard/dh;->c:Ljava/lang/String;

    const-string/jumbo v2, "name"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 8
    iget-wide v4, p0, Lcom/tencent/bugly/proguard/dh;->e:J

    move-object v3, p0

    move-wide v6, p1

    move-wide v8, p3

    .line 9
    invoke-virtual/range {v3 .. v9}, Lcom/tencent/bugly/proguard/dh;->a(JJJ)J

    move-result-wide p1

    move-object v1, v3

    move-wide v4, v6

    move-wide v6, v8

    .line 10
    const-string/jumbo p3, "start_time_unix_ms"

    invoke-virtual {v0, p3, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 11
    iget-wide v2, v1, Lcom/tencent/bugly/proguard/dh;->f:J

    .line 12
    invoke-virtual/range {v1 .. v7}, Lcom/tencent/bugly/proguard/dh;->a(JJJ)J

    move-result-wide p1

    .line 13
    const-string p3, "end_time_unix_ms"

    invoke-virtual {v0, p3, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 14
    const-string p1, "kind"

    const-string p2, "interval"

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0
.end method

.method public b()Z
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/dh;->f:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public c()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/dh;->f:J

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

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "{name: "

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    iget-object v1, p0, Lcom/tencent/bugly/proguard/dh;->c:Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v1, ", cost: "

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/dh;->f:J

    .line 21
    .line 22
    iget-wide v3, p0, Lcom/tencent/bugly/proguard/dh;->e:J

    .line 23
    sub-long/2addr v1, v3

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v1, ", parentSpan: "

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    iget-object v1, p0, Lcom/tencent/bugly/proguard/dh;->d:Lcom/tencent/bugly/proguard/dh;

    .line 34
    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    const-string v1, ""

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_0
    iget-object v1, v1, Lcom/tencent/bugly/proguard/dh;->c:Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    :goto_0
    const-string/jumbo v2, "}"

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1, v2}, Lcom/tencent/bugly/proguard/xh;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    move-result-object v0

    .line 48
    return-object v0
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
