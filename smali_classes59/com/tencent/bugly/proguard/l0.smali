.class public Lcom/tencent/bugly/proguard/l0;
.super Lcom/tencent/bugly/proguard/hf;
.source "BUGLY"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# static fields
.field public static final v:Z


# instance fields
.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:Z

.field public s:Z

.field public t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public u:Ljava/util/List;
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

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    .line 1
    const-string v1, "asan"

    const/4 v2, 0x0

    const/16 v3, 0x3e8

    const/high16 v4, 0x3f800000    # 1.0f

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;ZIFFI)V

    const/16 v1, 0x2000

    .line 2
    iput v1, v0, Lcom/tencent/bugly/proguard/l0;->n:I

    const/16 v1, 0x1000

    .line 3
    iput v1, v0, Lcom/tencent/bugly/proguard/l0;->o:I

    const/4 v1, 0x5

    .line 4
    iput v1, v0, Lcom/tencent/bugly/proguard/l0;->p:I

    const/16 v1, 0x1e

    .line 5
    iput v1, v0, Lcom/tencent/bugly/proguard/l0;->q:I

    const/4 v1, 0x0

    .line 6
    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/l0;->r:Z

    .line 7
    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/l0;->s:Z

    .line 8
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/tencent/bugly/proguard/l0;->t:Ljava/util/List;

    .line 9
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/tencent/bugly/proguard/l0;->u:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/tencent/bugly/proguard/l0;)V
    .locals 1

    .line 10
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/hf;-><init>(Lcom/tencent/bugly/proguard/hf;)V

    const/16 v0, 0x2000

    .line 11
    iput v0, p0, Lcom/tencent/bugly/proguard/l0;->n:I

    const/16 v0, 0x1000

    .line 12
    iput v0, p0, Lcom/tencent/bugly/proguard/l0;->o:I

    const/4 v0, 0x5

    .line 13
    iput v0, p0, Lcom/tencent/bugly/proguard/l0;->p:I

    const/16 v0, 0x1e

    .line 14
    iput v0, p0, Lcom/tencent/bugly/proguard/l0;->q:I

    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/l0;->r:Z

    .line 16
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/l0;->s:Z

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/l0;->t:Ljava/util/List;

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/l0;->u:Ljava/util/List;

    .line 19
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l0;->a(Lcom/tencent/bugly/proguard/hf;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/hf;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lcom/tencent/bugly/proguard/hf;)V

    .line 2
    instance-of v0, p1, Lcom/tencent/bugly/proguard/l0;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/tencent/bugly/proguard/l0;

    .line 4
    iget v0, p1, Lcom/tencent/bugly/proguard/l0;->n:I

    iput v0, p0, Lcom/tencent/bugly/proguard/l0;->n:I

    .line 5
    iget v0, p1, Lcom/tencent/bugly/proguard/l0;->o:I

    iput v0, p0, Lcom/tencent/bugly/proguard/l0;->o:I

    .line 6
    iget v0, p1, Lcom/tencent/bugly/proguard/l0;->p:I

    iput v0, p0, Lcom/tencent/bugly/proguard/l0;->p:I

    .line 7
    iget v0, p1, Lcom/tencent/bugly/proguard/l0;->q:I

    iput v0, p0, Lcom/tencent/bugly/proguard/l0;->q:I

    .line 8
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/l0;->r:Z

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/l0;->r:Z

    .line 9
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/l0;->s:Z

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/l0;->s:Z

    .line 10
    iget-object v0, p1, Lcom/tencent/bugly/proguard/l0;->t:Ljava/util/List;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/l0;->t:Ljava/util/List;

    .line 11
    iget-object p1, p1, Lcom/tencent/bugly/proguard/l0;->u:Ljava/util/List;

    iput-object p1, p0, Lcom/tencent/bugly/proguard/l0;->u:Ljava/util/List;

    :cond_0
    return-void
.end method

.method public final a(Ljava/util/List;Lorg/json/JSONArray;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/json/JSONArray;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    :try_start_0
    invoke-virtual {p2}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 15
    invoke-virtual {p2, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 17
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v0, "RMonitor_config"

    invoke-virtual {p2, v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 12
    :cond_0
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lorg/json/JSONObject;)V

    .line 13
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l0;->b(Lorg/json/JSONObject;)V

    return-void
.end method

.method public bridge synthetic b()Lcom/tencent/bugly/proguard/hf;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l0;->c()Lcom/tencent/bugly/proguard/l0;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lorg/json/JSONObject;)V
    .locals 10

    const-string v0, "ignore_so_patterns"

    const-string/jumbo v1, "target_so_patterns"

    const-string v2, "ignore_overlapped_reading"

    const-string/jumbo v3, "right_side_perfect_align"

    const-string v4, "left_side_align_percentage"

    const-string v5, "max_sample_gap_count"

    const-string/jumbo v6, "slot_count"

    const-string/jumbo v7, "slot_size"

    .line 2
    :try_start_0
    invoke-virtual {p1, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    const/4 v9, 0x0

    if-eqz v8, :cond_0

    .line 3
    invoke-virtual {p1, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v7

    .line 4
    invoke-static {v7, v9}, Ljava/lang/Math;->max(II)I

    move-result v7

    iput v7, p0, Lcom/tencent/bugly/proguard/l0;->n:I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 5
    :cond_0
    :goto_0
    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 6
    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 7
    invoke-static {v6, v9}, Ljava/lang/Math;->max(II)I

    move-result v6

    iput v6, p0, Lcom/tencent/bugly/proguard/l0;->o:I

    .line 8
    :cond_1
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 9
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 10
    invoke-static {v5, v9}, Ljava/lang/Math;->max(II)I

    move-result v5

    iput v5, p0, Lcom/tencent/bugly/proguard/l0;->p:I

    .line 11
    :cond_2
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 12
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    const/16 v5, 0x64

    .line 13
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-static {v4, v9}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, p0, Lcom/tencent/bugly/proguard/l0;->q:I

    .line 14
    :cond_3
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 15
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v3

    iput-boolean v3, p0, Lcom/tencent/bugly/proguard/l0;->r:Z

    .line 16
    :cond_4
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 17
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/tencent/bugly/proguard/l0;->s:Z

    .line 18
    :cond_5
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 19
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 20
    iget-object v2, p0, Lcom/tencent/bugly/proguard/l0;->t:Ljava/util/List;

    invoke-virtual {p0, v2, v1}, Lcom/tencent/bugly/proguard/l0;->a(Ljava/util/List;Lorg/json/JSONArray;)V

    .line 21
    :cond_6
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 22
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    .line 23
    iget-object v0, p0, Lcom/tencent/bugly/proguard/l0;->u:Ljava/util/List;

    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/proguard/l0;->a(Ljava/util/List;Lorg/json/JSONArray;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 24
    :goto_1
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_config"

    const-string/jumbo v2, "parse asan config failed"

    invoke-virtual {v0, v1, v2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    return-void
.end method

.method public c()Lcom/tencent/bugly/proguard/l0;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/l0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/l0;-><init>(Lcom/tencent/bugly/proguard/l0;)V

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
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l0;->c()Lcom/tencent/bugly/proguard/l0;

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
