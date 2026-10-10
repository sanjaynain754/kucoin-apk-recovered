.class public Lcom/tencent/bugly/proguard/g1;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/g1$a;
    }
.end annotation


# static fields
.field public static final r:Ljava/lang/String; = "BatteryElementMetricItem"

.field public static final synthetic s:Z = true


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:J

.field public l:J

.field public m:J

.field public n:Ljava/lang/String;

.field public o:Lorg/json/JSONObject;

.field public p:Lorg/json/JSONObject;

.field public q:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/proguard/g1$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/bugly/proguard/g1;->b:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/tencent/bugly/proguard/g1;->c:Ljava/lang/String;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/tencent/bugly/proguard/g1;->d:Ljava/lang/String;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/tencent/bugly/proguard/g1;->e:Ljava/lang/String;

    .line 14
    const/4 v1, 0x0

    .line 15
    .line 16
    iput v1, p0, Lcom/tencent/bugly/proguard/g1;->f:I

    .line 17
    .line 18
    iput v1, p0, Lcom/tencent/bugly/proguard/g1;->g:I

    .line 19
    .line 20
    iput v1, p0, Lcom/tencent/bugly/proguard/g1;->h:I

    .line 21
    .line 22
    iput v1, p0, Lcom/tencent/bugly/proguard/g1;->i:I

    .line 23
    .line 24
    iput v1, p0, Lcom/tencent/bugly/proguard/g1;->j:I

    .line 25
    .line 26
    const-wide/16 v1, 0x0

    .line 27
    .line 28
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/g1;->k:J

    .line 29
    .line 30
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/g1;->l:J

    .line 31
    .line 32
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/g1;->m:J

    .line 33
    .line 34
    iput-object v0, p0, Lcom/tencent/bugly/proguard/g1;->n:Ljava/lang/String;

    .line 35
    .line 36
    new-instance v0, Lorg/json/JSONObject;

    .line 37
    .line 38
    .line 39
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 40
    .line 41
    iput-object v0, p0, Lcom/tencent/bugly/proguard/g1;->o:Lorg/json/JSONObject;

    .line 42
    .line 43
    new-instance v0, Lorg/json/JSONObject;

    .line 44
    .line 45
    .line 46
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 47
    .line 48
    iput-object v0, p0, Lcom/tencent/bugly/proguard/g1;->p:Lorg/json/JSONObject;

    .line 49
    .line 50
    new-instance v0, Ljava/util/HashMap;

    .line 51
    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 54
    .line 55
    iput-object v0, p0, Lcom/tencent/bugly/proguard/g1;->q:Ljava/util/HashMap;

    .line 56
    return-void
    .line 57
.end method


# virtual methods
.method public a()Lorg/json/JSONObject;
    .locals 7

    .line 10
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/g1;->p:Lorg/json/JSONObject;

    .line 11
    :try_start_0
    const-string v1, "element"

    const-string v2, "cpu"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 12
    iget-object v0, p0, Lcom/tencent/bugly/proguard/g1;->p:Lorg/json/JSONObject;

    const-string v1, "cpu_core"

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 13
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 14
    iget-object v1, p0, Lcom/tencent/bugly/proguard/g1;->q:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 15
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 16
    const-string/jumbo v4, "scene"

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 17
    const-string/jumbo v4, "total_cpu_time_in_ms"

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tencent/bugly/proguard/g1$a;

    iget-wide v5, v5, Lcom/tencent/bugly/proguard/g1$a;->b:J

    invoke-virtual {v3, v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 18
    const-string/jumbo v4, "process_cpu_time_in_ms"

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/g1$a;

    iget-wide v5, v2, Lcom/tencent/bugly/proguard/g1$a;->a:J

    invoke-virtual {v3, v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 19
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    .line 20
    :cond_0
    iget-object v1, p0, Lcom/tencent/bugly/proguard/g1;->p:Lorg/json/JSONObject;

    const-string v2, "cpu_time_details"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 21
    :goto_1
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v2, "BatteryElementMetricItem"

    invoke-virtual {v1, v2, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    :goto_2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/g1;->p:Lorg/json/JSONObject;

    return-object v0
.end method

.method public a(Ljava/lang/String;JJ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/g1;->q:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/g1;->q:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/bugly/proguard/g1$a;

    .line 3
    sget-boolean v0, Lcom/tencent/bugly/proguard/g1;->s:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    .line 4
    :cond_1
    :goto_0
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/g1$a;->b:J

    add-long/2addr v0, p2

    iput-wide v0, p1, Lcom/tencent/bugly/proguard/g1$a;->b:J

    .line 5
    iget-wide p2, p1, Lcom/tencent/bugly/proguard/g1$a;->a:J

    add-long/2addr p2, p4

    iput-wide p2, p1, Lcom/tencent/bugly/proguard/g1$a;->a:J

    return-void

    .line 6
    :cond_2
    new-instance v0, Lcom/tencent/bugly/proguard/g1$a;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/g1$a;-><init>(Lcom/tencent/bugly/proguard/g1;)V

    .line 7
    iput-wide p4, v0, Lcom/tencent/bugly/proguard/g1$a;->a:J

    .line 8
    iput-wide p2, v0, Lcom/tencent/bugly/proguard/g1$a;->b:J

    .line 9
    iget-object p2, p0, Lcom/tencent/bugly/proguard/g1;->q:Ljava/util/HashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
