.class public Lcom/tencent/bugly/proguard/wc;
.super Lcom/tencent/bugly/proguard/hf;
.source "BUGLY"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# static fields
.field public static final A:I = 0x5

.field public static final u:J = 0x10000000000L

.field public static final v:J = 0xdac00000L

.field public static final w:I = 0x1

.field public static final x:I = 0x2

.field public static final y:I = 0x3

.field public static final z:I = 0x4


# instance fields
.field public n:I

.field public o:J

.field public p:J

.field public q:Z

.field public r:Z

.field public s:I

.field public t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 7

    const v5, 0x3dcccccd    # 0.1f

    const/4 v6, 0x0

    .line 1
    const-string/jumbo v1, "native_memory"

    const/4 v2, 0x0

    const/16 v3, 0xa

    const/high16 v4, 0x3f000000    # 0.5f

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;ZIFFI)V

    const/16 v1, 0x1000

    .line 2
    iput v1, v0, Lcom/tencent/bugly/proguard/wc;->n:I

    const-wide/32 v1, 0x40000000

    .line 3
    iput-wide v1, v0, Lcom/tencent/bugly/proguard/wc;->o:J

    const-wide v1, 0x10000000000L

    .line 4
    iput-wide v1, v0, Lcom/tencent/bugly/proguard/wc;->p:J

    const/4 v1, 0x1

    .line 5
    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/wc;->q:Z

    const/4 v2, 0x0

    .line 6
    iput-boolean v2, v0, Lcom/tencent/bugly/proguard/wc;->r:Z

    .line 7
    iput v1, v0, Lcom/tencent/bugly/proguard/wc;->s:I

    .line 8
    new-instance v1, Lcom/tencent/bugly/proguard/wc$a;

    invoke-direct {v1, p0}, Lcom/tencent/bugly/proguard/wc$a;-><init>(Lcom/tencent/bugly/proguard/wc;)V

    iput-object v1, v0, Lcom/tencent/bugly/proguard/wc;->t:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/tencent/bugly/proguard/wc;)V
    .locals 2

    .line 9
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/hf;-><init>(Lcom/tencent/bugly/proguard/hf;)V

    const/16 v0, 0x1000

    .line 10
    iput v0, p0, Lcom/tencent/bugly/proguard/wc;->n:I

    const-wide/32 v0, 0x40000000

    .line 11
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/wc;->o:J

    const-wide v0, 0x10000000000L

    .line 12
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/wc;->p:J

    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/wc;->q:Z

    const/4 v1, 0x0

    .line 14
    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/wc;->r:Z

    .line 15
    iput v0, p0, Lcom/tencent/bugly/proguard/wc;->s:I

    .line 16
    new-instance v0, Lcom/tencent/bugly/proguard/wc$a;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/wc$a;-><init>(Lcom/tencent/bugly/proguard/wc;)V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/wc;->t:Ljava/util/List;

    .line 17
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/wc;->a(Lcom/tencent/bugly/proguard/hf;)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 10
    iput p1, p0, Lcom/tencent/bugly/proguard/wc;->n:I

    return-void
.end method

.method public a(J)V
    .locals 0

    .line 13
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/wc;->o:J

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/hf;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lcom/tencent/bugly/proguard/hf;)V

    .line 2
    instance-of v0, p1, Lcom/tencent/bugly/proguard/wc;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/tencent/bugly/proguard/wc;

    iget v0, p1, Lcom/tencent/bugly/proguard/wc;->n:I

    iput v0, p0, Lcom/tencent/bugly/proguard/wc;->n:I

    .line 4
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/wc;->o:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/wc;->o:J

    .line 5
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/wc;->p:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/wc;->p:J

    .line 6
    iget-object v0, p1, Lcom/tencent/bugly/proguard/wc;->t:Ljava/util/List;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/wc;->t:Ljava/util/List;

    .line 7
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/wc;->q:Z

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/wc;->q:Z

    .line 8
    iget v0, p1, Lcom/tencent/bugly/proguard/wc;->s:I

    iput v0, p0, Lcom/tencent/bugly/proguard/wc;->s:I

    .line 9
    iget-boolean p1, p1, Lcom/tencent/bugly/proguard/wc;->r:Z

    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/wc;->r:Z

    :cond_0
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 11
    iput-object p1, p0, Lcom/tencent/bugly/proguard/wc;->t:Ljava/util/List;

    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 7

    const-string/jumbo v0, "unwind_method"

    const-string v1, "enable_mmap_hook"

    const-string v2, "max_history_mem_size"

    const-string v3, "enable_libc_hook"

    const-string v4, "max_physical_pss"

    const-string v5, "app_min_size"

    if-nez p1, :cond_0

    goto :goto_2

    .line 14
    :cond_0
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lorg/json/JSONObject;)V

    .line 15
    :try_start_0
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 16
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 17
    invoke-virtual {p0, v5}, Lcom/tencent/bugly/proguard/wc;->a(I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 19
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    .line 20
    invoke-virtual {p0, v4, v5}, Lcom/tencent/bugly/proguard/wc;->a(J)V

    .line 21
    :cond_2
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 22
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v3

    .line 23
    invoke-virtual {p0, v3}, Lcom/tencent/bugly/proguard/wc;->a(Z)V

    .line 24
    :cond_3
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 25
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 26
    invoke-virtual {p0, v2}, Lcom/tencent/bugly/proguard/wc;->b(I)V

    .line 27
    :cond_4
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v2, 0x0

    .line 28
    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/wc;->r:Z

    .line 29
    :cond_5
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, 0x1

    .line 30
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/tencent/bugly/proguard/wc;->s:I

    .line 31
    :cond_6
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/wc;->b(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 32
    :goto_1
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_config"

    const-string/jumbo v2, "parsePluginConfig"

    invoke-virtual {v0, v1, v2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 12
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/wc;->q:Z

    return-void
.end method

.method public bridge synthetic b()Lcom/tencent/bugly/proguard/hf;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/wc;->c()Lcom/tencent/bugly/proguard/wc;

    move-result-object v0

    return-object v0
.end method

.method public b(I)V
    .locals 0

    if-lez p1, :cond_0

    .line 2
    sput p1, Lcom/tencent/bugly/proguard/ac;->F:I

    :cond_0
    return-void
.end method

.method public final b(Lorg/json/JSONObject;)V
    .locals 3

    const-string v0, "ignore_so_list"

    .line 3
    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    const/4 v0, 0x0

    .line 5
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 6
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 8
    iget-object v2, p0, Lcom/tencent/bugly/proguard/wc;->t:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 9
    :goto_2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_config"

    invoke-virtual {v0, v1, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public c()Lcom/tencent/bugly/proguard/wc;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/wc;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/wc;-><init>(Lcom/tencent/bugly/proguard/wc;)V

    .line 6
    return-object v0
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
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/wc;->c()Lcom/tencent/bugly/proguard/wc;

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

.method public d()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/wc;->n:I

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
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/wc;->q:Z

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

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/wc;->t:Ljava/util/List;

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

.method public g()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/wc;->r:Z

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

.method public h()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/wc;->o:J

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

.method public i()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/wc;->p:J

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

.method public j()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/wc;->s:I

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
