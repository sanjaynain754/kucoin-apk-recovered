.class public Lcom/tencent/bugly/proguard/be;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/ae;


# static fields
.field public static final c:Ljava/lang/String; = "RMonitor_link"

.field public static final d:I = 0x1f4

.field public static final e:I = 0x177

.field public static final f:I = 0x64


# instance fields
.field public final a:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lcom/tencent/bugly/proguard/va;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lcom/tencent/bugly/proguard/wa;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/LinkedList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/be;->a:Ljava/util/LinkedList;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;J)Lcom/tencent/bugly/proguard/va;
    .locals 8

    .line 13
    iget-object v0, p0, Lcom/tencent/bugly/proguard/be;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide v1, 0x7fffffffffffffffL

    const/4 v3, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/tencent/bugly/proguard/va;

    .line 14
    iget-object v5, v4, Lcom/tencent/bugly/proguard/va;->a:Ljava/lang/String;

    invoke-static {p1, v5}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_0

    iget-object v5, v4, Lcom/tencent/bugly/proguard/va;->b:Ljava/lang/String;

    invoke-static {p2, v5}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 15
    iget-wide v5, v4, Lcom/tencent/bugly/proguard/va;->g:J

    sub-long/2addr v5, p3

    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    cmp-long v7, v5, v1

    if-gez v7, :cond_0

    move-object v3, v4

    move-wide v1, v5

    goto :goto_0

    :cond_1
    return-object v3
.end method

.method public a()Lcom/tencent/bugly/proguard/wa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/be;->b:Lcom/tencent/bugly/proguard/wa;

    return-object v0
.end method

.method public final a(Lcom/tencent/bugly/proguard/va;Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/proguard/va;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/va;",
            ">;"
        }
    .end annotation

    .line 21
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/be;->a(Lcom/tencent/bugly/proguard/va;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 22
    iget-object v0, p0, Lcom/tencent/bugly/proguard/be;->a:Ljava/util/LinkedList;

    invoke-virtual {p0, p1, p2, v0}, Lcom/tencent/bugly/proguard/be;->a(Lcom/tencent/bugly/proguard/va;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 23
    :cond_0
    iget-object v0, p1, Lcom/tencent/bugly/proguard/va;->c:Ljava/lang/String;

    iget-object v1, p1, Lcom/tencent/bugly/proguard/va;->d:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/tencent/bugly/proguard/be;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 24
    invoke-virtual {p0, p1, p2, v0}, Lcom/tencent/bugly/proguard/be;->a(Lcom/tencent/bugly/proguard/va;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/tencent/bugly/proguard/va;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/proguard/va;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/va;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/va;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p3, :cond_4

    .line 25
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    .line 26
    :cond_0
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/va;

    if-nez v1, :cond_2

    .line 27
    const-string v2, ""

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/va;->a()Ljava/lang/String;

    move-result-object v2

    .line 28
    :goto_1
    invoke-interface {p2, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p1, v1}, Lcom/tencent/bugly/proguard/va;->a(Lcom/tencent/bugly/proguard/va;)Z

    move-result v2

    if-eqz v2, :cond_1

    if-nez v0, :cond_3

    .line 29
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 30
    :cond_3
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    :goto_2
    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/va;",
            ">;"
        }
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/tencent/bugly/proguard/be;->b:Lcom/tencent/bugly/proguard/wa;

    if-eqz v0, :cond_0

    .line 32
    invoke-interface {v0, p1, p2}, Lcom/tencent/bugly/proguard/wa;->loadFromDB(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final a(JJI)V
    .locals 6

    .line 16
    iget-object v0, p0, Lcom/tencent/bugly/proguard/be;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_0
    if-ltz v0, :cond_2

    .line 17
    iget-object v2, p0, Lcom/tencent/bugly/proguard/be;->a:Ljava/util/LinkedList;

    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/va;

    if-lt v1, p5, :cond_0

    .line 18
    iget-object v3, p0, Lcom/tencent/bugly/proguard/be;->a:Ljava/util/LinkedList;

    invoke-virtual {v3, v2}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    .line 19
    :cond_0
    iget-wide v3, v2, Lcom/tencent/bugly/proguard/va;->f:J

    cmp-long v5, p1, v3

    if-gtz v5, :cond_1

    cmp-long v3, v3, p3

    if-gtz v3, :cond_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 20
    :cond_1
    iget-object v3, p0, Lcom/tencent/bugly/proguard/be;->a:Ljava/util/LinkedList;

    invoke-virtual {v3, v2}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/wa;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/be;->b:Lcom/tencent/bugly/proguard/wa;

    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 1

    if-nez p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {p1}, Lcom/tencent/bugly/proguard/va;->a(Lorg/json/JSONObject;)Lcom/tencent/bugly/proguard/va;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/va;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/tencent/bugly/proguard/be;->a:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/be;->a:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 6
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/be;->b()V

    .line 7
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/be;->b(Lcom/tencent/bugly/proguard/va;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Lorg/json/JSONObject;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    .line 8
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    invoke-static {p1}, Lcom/tencent/bugly/proguard/va;->a(Lorg/json/JSONObject;)Lcom/tencent/bugly/proguard/va;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/be;->a(Lcom/tencent/bugly/proguard/va;Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 11
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 12
    :cond_2
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/be;->b(Lorg/json/JSONObject;Ljava/util/List;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final a(Lcom/tencent/bugly/proguard/va;)Z
    .locals 1
    .param p1    # Lcom/tencent/bugly/proguard/va;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 33
    iget-object p1, p1, Lcom/tencent/bugly/proguard/va;->d:Ljava/lang/String;

    invoke-static {}, Lcom/tencent/bugly/proguard/ch;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    return p1
.end method

.method public final b()V
    .locals 10

    .line 13
    iget-object v0, p0, Lcom/tencent/bugly/proguard/be;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    const/16 v1, 0x1f4

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 14
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    const-wide/16 v2, 0x3c

    add-long v7, v0, v2

    const-wide/16 v2, 0xe10

    sub-long v5, v0, v2

    const/16 v9, 0x1f4

    move-object v4, p0

    .line 15
    invoke-virtual/range {v4 .. v9}, Lcom/tencent/bugly/proguard/be;->a(JJI)V

    .line 16
    iget-object v2, v4, Lcom/tencent/bugly/proguard/be;->a:Ljava/util/LinkedList;

    invoke-virtual {v2}, Ljava/util/LinkedList;->size()I

    move-result v2

    const/16 v3, 0x177

    if-le v2, v3, :cond_1

    const-wide/16 v2, 0x708

    sub-long v5, v0, v2

    const/16 v9, 0x64

    .line 17
    invoke-virtual/range {v4 .. v9}, Lcom/tencent/bugly/proguard/be;->a(JJI)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final b(Lcom/tencent/bugly/proguard/va;)V
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/tencent/bugly/proguard/be;->b:Lcom/tencent/bugly/proguard/wa;

    if-eqz v0, :cond_0

    .line 19
    invoke-interface {v0, p1}, Lcom/tencent/bugly/proguard/wa;->saveToDB(Lcom/tencent/bugly/proguard/va;)Z

    :cond_0
    return-void
.end method

.method public final b(Lorg/json/JSONObject;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/va;",
            ">;)V"
        }
    .end annotation

    const-string v0, "Attributes"

    .line 1
    :try_start_0
    new-instance v1, Ljava/util/HashSet;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 2
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/va;

    .line 3
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/va;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 4
    :cond_0
    new-instance p2, Lorg/json/JSONArray;

    invoke-direct {p2}, Lorg/json/JSONArray;-><init>()V

    .line 5
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 6
    invoke-virtual {p2, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_1

    .line 7
    :cond_1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v2, "linkages"

    if-nez v1, :cond_2

    .line 8
    :try_start_1
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 9
    invoke-virtual {v1, v2, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 10
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-void

    .line 11
    :cond_2
    invoke-virtual {v1, v2, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    .line 12
    :goto_2
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "collect plugin link data fail for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "RMonitor_link"

    filled-new-array {v0, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    return-void
.end method
