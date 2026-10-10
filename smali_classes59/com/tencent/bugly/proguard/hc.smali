.class public Lcom/tencent/bugly/proguard/hc;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final k:Ljava/lang/String; = "RMonitor_MemoryQuantile"

.field public static final l:Ljava/lang/String; = "fg_"

.field public static final m:Ljava/lang/String; = "bg_"

.field public static final n:Ljava/lang/String; = "stage_"

.field public static final o:Ljava/lang/String; = "user_custom_"

.field public static final p:Ljava/lang/String; = "process_launch_id_"

.field public static final q:Ljava/lang/String; = "launch_id_"

.field public static final r:Ljava/lang/String; = "java_"

.field public static final s:Ljava/lang/String; = "pss_"

.field public static final t:Ljava/lang/String; = "vss_"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/tencent/bugly/proguard/fc;

.field public final c:Lcom/tencent/bugly/proguard/fc;

.field public final d:Lcom/tencent/bugly/proguard/fc;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/hc;)V
    .locals 2

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->e:Ljava/lang/String;

    .line 16
    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->f:Ljava/lang/String;

    .line 17
    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->g:Ljava/lang/String;

    .line 18
    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->h:Ljava/lang/String;

    .line 19
    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->i:Ljava/lang/String;

    .line 20
    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->j:Ljava/lang/String;

    .line 21
    iget-object v0, p1, Lcom/tencent/bugly/proguard/hc;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->a:Ljava/lang/String;

    .line 22
    new-instance v0, Lcom/tencent/bugly/proguard/fc;

    iget-object v1, p1, Lcom/tencent/bugly/proguard/hc;->b:Lcom/tencent/bugly/proguard/fc;

    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/fc;-><init>(Lcom/tencent/bugly/proguard/fc;)V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->b:Lcom/tencent/bugly/proguard/fc;

    .line 23
    new-instance v0, Lcom/tencent/bugly/proguard/fc;

    iget-object v1, p1, Lcom/tencent/bugly/proguard/hc;->c:Lcom/tencent/bugly/proguard/fc;

    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/fc;-><init>(Lcom/tencent/bugly/proguard/fc;)V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->c:Lcom/tencent/bugly/proguard/fc;

    .line 24
    new-instance v0, Lcom/tencent/bugly/proguard/fc;

    iget-object v1, p1, Lcom/tencent/bugly/proguard/hc;->d:Lcom/tencent/bugly/proguard/fc;

    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/fc;-><init>(Lcom/tencent/bugly/proguard/fc;)V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->d:Lcom/tencent/bugly/proguard/fc;

    .line 25
    iget-object v0, p1, Lcom/tencent/bugly/proguard/hc;->e:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->e:Ljava/lang/String;

    .line 26
    iget-object v0, p1, Lcom/tencent/bugly/proguard/hc;->f:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->f:Ljava/lang/String;

    .line 27
    iget-object v0, p1, Lcom/tencent/bugly/proguard/hc;->g:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->g:Ljava/lang/String;

    .line 28
    iget-object v0, p1, Lcom/tencent/bugly/proguard/hc;->h:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->h:Ljava/lang/String;

    .line 29
    iget-object v0, p1, Lcom/tencent/bugly/proguard/hc;->i:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->i:Ljava/lang/String;

    .line 30
    iget-object p1, p1, Lcom/tencent/bugly/proguard/hc;->j:Ljava/lang/String;

    iput-object p1, p0, Lcom/tencent/bugly/proguard/hc;->j:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->e:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->f:Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->g:Ljava/lang/String;

    .line 5
    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->h:Ljava/lang/String;

    .line 6
    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->i:Ljava/lang/String;

    .line 7
    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->j:Ljava/lang/String;

    .line 8
    iput-object p1, p0, Lcom/tencent/bugly/proguard/hc;->a:Ljava/lang/String;

    .line 9
    new-instance v1, Lcom/tencent/bugly/proguard/fc;

    invoke-direct {v1, v0, p1}, Lcom/tencent/bugly/proguard/fc;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/tencent/bugly/proguard/hc;->b:Lcom/tencent/bugly/proguard/fc;

    .line 10
    new-instance v0, Lcom/tencent/bugly/proguard/fc;

    const-string v1, "fg_"

    invoke-direct {v0, v1, p1}, Lcom/tencent/bugly/proguard/fc;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->c:Lcom/tencent/bugly/proguard/fc;

    .line 11
    new-instance v0, Lcom/tencent/bugly/proguard/fc;

    const-string v1, "bg_"

    invoke-direct {v0, v1, p1}, Lcom/tencent/bugly/proguard/fc;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->d:Lcom/tencent/bugly/proguard/fc;

    .line 12
    invoke-static {}, Lcom/tencent/bugly/proguard/ch;->d()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/hc;->i:Ljava/lang/String;

    .line 13
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/tencent/bugly/proguard/ch;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/hc;->j:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lcom/tencent/bugly/proguard/fc;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->d:Lcom/tencent/bugly/proguard/fc;

    return-object v0
.end method

.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo p1, "stage_"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/tencent/bugly/proguard/hc;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public a(JJJLjava/lang/String;Ljava/lang/String;)V
    .locals 10

    move-object/from16 v0, p7

    .line 2
    iget-object v1, p0, Lcom/tencent/bugly/proguard/hc;->b:Lcom/tencent/bugly/proguard/fc;

    move-wide v2, p1

    move-wide v4, p3

    move-wide v6, p5

    invoke-virtual/range {v1 .. v7}, Lcom/tencent/bugly/proguard/fc;->a(JJJ)V

    .line 3
    iget-object v2, p0, Lcom/tencent/bugly/proguard/hc;->c:Lcom/tencent/bugly/proguard/fc;

    move-wide v3, p1

    move-wide v5, p3

    move-wide v7, p5

    invoke-virtual/range {v2 .. v8}, Lcom/tencent/bugly/proguard/fc;->a(JJJ)V

    .line 4
    iget-object v3, p0, Lcom/tencent/bugly/proguard/hc;->d:Lcom/tencent/bugly/proguard/fc;

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v4, 0x0

    invoke-virtual/range {v3 .. v9}, Lcom/tencent/bugly/proguard/fc;->a(JJJ)V

    .line 5
    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->e:Ljava/lang/String;

    .line 6
    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->f:Ljava/lang/String;

    .line 7
    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->g:Ljava/lang/String;

    move-object/from16 p1, p8

    .line 8
    iput-object p1, p0, Lcom/tencent/bugly/proguard/hc;->h:Ljava/lang/String;

    return-void
.end method

.method public a(Landroid/content/SharedPreferences$Editor;)V
    .locals 2

    .line 18
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->b:Lcom/tencent/bugly/proguard/fc;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/fc;->a(Landroid/content/SharedPreferences$Editor;)V

    .line 19
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->c:Lcom/tencent/bugly/proguard/fc;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/fc;->a(Landroid/content/SharedPreferences$Editor;)V

    .line 20
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->d:Lcom/tencent/bugly/proguard/fc;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/fc;->a(Landroid/content/SharedPreferences$Editor;)V

    .line 21
    const-string v0, "java_"

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/hc;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/bugly/proguard/hc;->e:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 22
    const-string/jumbo v0, "pss_"

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/hc;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/bugly/proguard/hc;->f:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 23
    const-string/jumbo v0, "vss_"

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/hc;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/bugly/proguard/hc;->g:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 24
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/hc;->h()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/bugly/proguard/hc;->h:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 25
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/hc;->g()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/bugly/proguard/hc;->i:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 26
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/hc;->d()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/bugly/proguard/hc;->j:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 27
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method public a(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/String;ZZZ)V
    .locals 0

    if-eqz p4, :cond_0

    .line 9
    iput-object p2, p0, Lcom/tencent/bugly/proguard/hc;->e:Ljava/lang/String;

    .line 10
    const-string p4, "java_"

    invoke-virtual {p0, p4}, Lcom/tencent/bugly/proguard/hc;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-interface {p1, p4, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :cond_0
    if-eqz p5, :cond_1

    .line 11
    iput-object p2, p0, Lcom/tencent/bugly/proguard/hc;->f:Ljava/lang/String;

    .line 12
    const-string/jumbo p4, "pss_"

    invoke-virtual {p0, p4}, Lcom/tencent/bugly/proguard/hc;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-interface {p1, p4, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :cond_1
    if-eqz p6, :cond_2

    .line 13
    iput-object p2, p0, Lcom/tencent/bugly/proguard/hc;->g:Ljava/lang/String;

    .line 14
    const-string/jumbo p4, "vss_"

    invoke-virtual {p0, p4}, Lcom/tencent/bugly/proguard/hc;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-interface {p1, p4, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 15
    :cond_2
    iget-object p2, p0, Lcom/tencent/bugly/proguard/hc;->h:Ljava/lang/String;

    invoke-static {p2, p3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 16
    iput-object p3, p0, Lcom/tencent/bugly/proguard/hc;->h:Ljava/lang/String;

    .line 17
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/hc;->h()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :cond_3
    return-void
.end method

.method public a(Landroid/content/SharedPreferences;)V
    .locals 2

    .line 28
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->b:Lcom/tencent/bugly/proguard/fc;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/fc;->a(Landroid/content/SharedPreferences;)V

    .line 29
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->c:Lcom/tencent/bugly/proguard/fc;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/fc;->a(Landroid/content/SharedPreferences;)V

    .line 30
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->d:Lcom/tencent/bugly/proguard/fc;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/fc;->a(Landroid/content/SharedPreferences;)V

    .line 31
    const-string v0, "java_"

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/hc;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->e:Ljava/lang/String;

    .line 32
    const-string/jumbo v0, "pss_"

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/hc;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->f:Ljava/lang/String;

    .line 33
    const-string/jumbo v0, "vss_"

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/hc;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->g:Ljava/lang/String;

    .line 34
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/hc;->h()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->h:Ljava/lang/String;

    .line 35
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/hc;->d()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/hc;->j:Ljava/lang/String;

    .line 36
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/hc;->g()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/hc;->i:Ljava/lang/String;

    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 37
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->b:Lcom/tencent/bugly/proguard/fc;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/fc;->a(Lorg/json/JSONObject;)V

    .line 38
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->c:Lcom/tencent/bugly/proguard/fc;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/fc;->a(Lorg/json/JSONObject;)V

    .line 39
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->d:Lcom/tencent/bugly/proguard/fc;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/fc;->a(Lorg/json/JSONObject;)V

    .line 40
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 41
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->e:Ljava/lang/String;

    const-string v1, "java_stage"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 42
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 43
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->f:Ljava/lang/String;

    const-string/jumbo v1, "pss_stage"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 44
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->g:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 45
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->g:Ljava/lang/String;

    const-string/jumbo v1, "vss_stage"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 46
    :cond_2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 47
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/hc;->h:Ljava/lang/String;

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 48
    const-string/jumbo v1, "user_custom"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 49
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_MemoryQuantile"

    const-string/jumbo v2, "packJson"

    invoke-virtual {v0, v1, v2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    return-void
.end method

.method public b()Lcom/tencent/bugly/proguard/fc;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->c:Lcom/tencent/bugly/proguard/fc;

    .line 3
    return-object v0
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

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->j:Ljava/lang/String;

    .line 3
    return-object v0
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

.method public final d()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "launch_id_"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v1, p0, Lcom/tencent/bugly/proguard/hc;->a:Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public e()Lcom/tencent/bugly/proguard/fc;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->b:Lcom/tencent/bugly/proguard/fc;

    .line 3
    return-object v0
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

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    .line 6
    :cond_0
    instance-of v0, p1, Lcom/tencent/bugly/proguard/hc;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    return v1

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lcom/tencent/bugly/proguard/hc;

    .line 13
    .line 14
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->b:Lcom/tencent/bugly/proguard/fc;

    .line 15
    .line 16
    iget-object v2, p1, Lcom/tencent/bugly/proguard/hc;->b:Lcom/tencent/bugly/proguard/fc;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Lcom/tencent/bugly/proguard/fc;->equals(Ljava/lang/Object;)Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    return v1

    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->c:Lcom/tencent/bugly/proguard/fc;

    .line 26
    .line 27
    iget-object v2, p1, Lcom/tencent/bugly/proguard/hc;->c:Lcom/tencent/bugly/proguard/fc;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v2}, Lcom/tencent/bugly/proguard/fc;->equals(Ljava/lang/Object;)Z

    .line 31
    move-result v0

    .line 32
    .line 33
    if-nez v0, :cond_3

    .line 34
    return v1

    .line 35
    .line 36
    :cond_3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->d:Lcom/tencent/bugly/proguard/fc;

    .line 37
    .line 38
    iget-object v2, p1, Lcom/tencent/bugly/proguard/hc;->d:Lcom/tencent/bugly/proguard/fc;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, Lcom/tencent/bugly/proguard/fc;->equals(Ljava/lang/Object;)Z

    .line 42
    move-result v0

    .line 43
    .line 44
    if-nez v0, :cond_4

    .line 45
    return v1

    .line 46
    .line 47
    :cond_4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->e:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v2, p1, Lcom/tencent/bugly/proguard/hc;->e:Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 53
    move-result v0

    .line 54
    .line 55
    if-nez v0, :cond_5

    .line 56
    return v1

    .line 57
    .line 58
    :cond_5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->f:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v2, p1, Lcom/tencent/bugly/proguard/hc;->f:Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 64
    move-result v0

    .line 65
    .line 66
    if-nez v0, :cond_6

    .line 67
    return v1

    .line 68
    .line 69
    :cond_6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->g:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v2, p1, Lcom/tencent/bugly/proguard/hc;->g:Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    invoke-static {v0, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 75
    move-result v0

    .line 76
    .line 77
    if-nez v0, :cond_7

    .line 78
    return v1

    .line 79
    .line 80
    :cond_7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->h:Ljava/lang/String;

    .line 81
    .line 82
    iget-object p1, p1, Lcom/tencent/bugly/proguard/hc;->h:Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 86
    move-result p1

    .line 87
    return p1
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->i:Ljava/lang/String;

    .line 3
    return-object v0
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

.method public final g()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "process_launch_id_"

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    iget-object v1, p0, Lcom/tencent/bugly/proguard/hc;->a:Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    return-object v0
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
.end method

.method public final h()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "user_custom_"

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    iget-object v1, p0, Lcom/tencent/bugly/proguard/hc;->a:Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    return-object v0
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
.end method

.method public i()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hc;->b:Lcom/tencent/bugly/proguard/fc;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/fc;->g()Z

    .line 6
    move-result v0

    .line 7
    return v0
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
