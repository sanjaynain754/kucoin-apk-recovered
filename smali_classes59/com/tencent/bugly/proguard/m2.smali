.class public Lcom/tencent/bugly/proguard/m2;
.super Lcom/tencent/bugly/proguard/hf;
.source "BUGLY"


# static fields
.field public static final A:Ljava/lang/String; = "fragment_life_monitor"

.field public static final t:Ljava/lang/String; = "common"

.field public static final u:Ljava/lang/String; = "suspend_thread_feature"

.field public static final v:Ljava/lang/String; = "enable_oom_hprof"

.field public static final w:Ljava/lang/String; = "enable_gc_info"

.field public static final x:Ljava/lang/String; = "ignore_origin_printer"

.field public static final y:Ljava/lang/String; = "enable_encrypt_attachment"

.field public static final z:Ljava/lang/String; = "enable_new_anr_scheme"


# instance fields
.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;)V

    .line 4
    const/4 p1, 0x0

    .line 5
    .line 6
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/m2;->n:Z

    .line 7
    .line 8
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/m2;->o:Z

    .line 9
    .line 10
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/m2;->p:Z

    .line 11
    .line 12
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/m2;->q:Z

    .line 13
    .line 14
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/m2;->r:Z

    .line 15
    .line 16
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/m2;->s:Z

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 16
    const-string v0, "common"

    return-object v0
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    const-string/jumbo v0, "suspend_thread_feature"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/m2;->n:Z

    .line 3
    :cond_0
    const-string v0, "enable_oom_hprof"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/m2;->o:Z

    .line 5
    :cond_1
    const-string v0, "enable_gc_info"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 6
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/m2;->p:Z

    .line 7
    :cond_2
    const-string v0, "ignore_origin_printer"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 8
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/m2;->q:Z

    .line 9
    :cond_3
    const-string v0, "enable_encrypt_attachment"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 10
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/m2;->r:Z

    .line 11
    :cond_4
    const-string v0, "enable_new_anr_scheme"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 12
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/m2;->s:Z

    .line 13
    :cond_5
    const-string v0, "fragment_life_monitor"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 14
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 15
    invoke-static {}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->enableFragmentLifecycleMonitor()V

    :cond_6
    return-void
.end method

.method public c()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/m2;->q:Z

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

.method public d()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/m2;->r:Z

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
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/m2;->p:Z

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

.method public f()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/m2;->s:Z

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

.method public g()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/m2;->o:Z

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

.method public h()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/m2;->n:Z

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
