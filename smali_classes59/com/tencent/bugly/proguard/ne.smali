.class public Lcom/tencent/bugly/proguard/ne;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/t9;


# static fields
.field public static final b:I = 0x2710


# instance fields
.field public a:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/ne;->a:J

    .line 8
    return-void
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
.method public a(Ljava/lang/String;)Ljava/util/Map;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 10
    const-string v1, "_value"

    const-string v2, "_key"

    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    return-object v4

    .line 11
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    move-result-object v5

    if-nez v5, :cond_1

    return-object v4

    .line 12
    :cond_1
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/ne;->b()V

    .line 13
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 14
    :try_start_0
    const-string/jumbo v7, "t_p_ctx"

    .line 15
    const-string v6, "_process_launch_id"

    const-string v8, "_tm"

    filled-new-array {v6, v2, v1, v8}, [Ljava/lang/String;

    move-result-object v8

    .line 16
    const-string v9, "_process_launch_id = ? "

    .line 17
    filled-new-array/range {p1 .. p1}, [Ljava/lang/String;

    move-result-object v10

    .line 18
    const-string v13, "_tm desc"

    const/4 v15, 0x0

    const/16 v16, 0x1

    const/4 v6, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    .line 19
    invoke-virtual/range {v5 .. v16}, Lcom/tencent/bugly/proguard/e4;->a(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;Z)Landroid/database/Cursor;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 20
    :cond_2
    :goto_0
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 21
    invoke-interface {v4, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v4, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 22
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    invoke-interface {v4, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 23
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_2

    if-nez v6, :cond_3

    .line 24
    const-string v6, ""

    :cond_3
    invoke-virtual {v3, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v1, 0x0

    .line 25
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "ProcessContext, load count:%s"

    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 26
    :cond_4
    invoke-virtual {v0, v4}, Lcom/tencent/bugly/proguard/ne;->a(Landroid/database/Cursor;)V

    .line 27
    const-string v1, "load"

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/ne;->c(Ljava/lang/String;)V

    return-object v3
.end method

.method public a()V
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/ne;->b()V

    .line 29
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/ne;->c()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/ne;->a(Ljava/util/List;)V

    .line 30
    const-string v0, "clear expired data"

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/ne;->c(Ljava/lang/String;)V

    return-void
.end method

.method public final a(Landroid/database/Cursor;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 46
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method public final a(Lcom/tencent/bugly/proguard/e4;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 6

    .line 42
    :try_start_0
    const-string/jumbo v1, "t_p_ctx"

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v0, p1

    move-object v2, p2

    move-object v3, p3

    .line 43
    invoke-virtual/range {v0 .. v5}, Lcom/tencent/bugly/proguard/e4;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;Z)I

    move-result p1

    if-gez p1, :cond_0

    .line 44
    const-string p2, "ProcessContext, deleteExpiredData fail result: %s"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    .line 45
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/bugly/proguard/ne;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    if-eqz p2, :cond_3

    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/ne;->b()V

    .line 5
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 6
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 7
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, p1, v1, v0}, Lcom/tencent/bugly/proguard/ne;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 9
    :cond_2
    const-string/jumbo p1, "update-map"

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/ne;->c(Ljava/lang/String;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_4

    .line 31
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 32
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    .line 33
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v2, v1, 0x1d

    const/16 v3, 0x1e

    .line 34
    rem-int/2addr v2, v3

    .line 35
    new-instance v4, Ljava/lang/StringBuilder;

    const/16 v5, 0x400

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v5, 0x0

    move v6, v5

    move v7, v6

    :goto_0
    if-ge v6, v2, :cond_4

    if-ge v7, v1, :cond_4

    .line 36
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 37
    const-string v8, "_process_launch_id"

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " IN ("

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v8, v5

    :goto_1
    if-ge v8, v3, :cond_3

    if-ge v7, v1, :cond_3

    if-lez v8, :cond_2

    .line 38
    const-string v9, ","

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    :cond_2
    const-string v9, "\""

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 40
    :cond_3
    const-string v8, ")"

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {p0, v0, v8, v9}, Lcom/tencent/bugly/proguard/ne;->a(Lcom/tencent/bugly/proguard/e4;Ljava/lang/String;[Ljava/lang/String;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/ContentValues;
    .locals 2

    .line 4
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 5
    const-string v1, "_process_launch_id"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    const-string p1, "_key"

    invoke-virtual {v0, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p3, :cond_0

    .line 7
    const-string p3, ""

    :cond_0
    const-string p1, "_value"

    invoke-virtual {v0, p1, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string p2, "_tm"

    invoke-virtual {v0, p2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    return-object v0
.end method

.method public final b()V
    .locals 2

    .line 9
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->i:Z

    if-eqz v0, :cond_0

    .line 10
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/ne;->a:J

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    .line 3
    const-string v1, "_process_launch_id = ?"

    invoke-virtual {p0, v0, v1, p1}, Lcom/tencent/bugly/proguard/ne;->a(Lcom/tencent/bugly/proguard/e4;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public final c()Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "_process_launch_id"

    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    move-result-object v1

    const/4 v13, 0x0

    if-nez v1, :cond_0

    return-object v13

    .line 2
    :cond_0
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 3
    :try_start_0
    const-string v15, "count"

    .line 4
    const-string/jumbo v3, "t_p_ctx"

    .line 5
    const-string v2, "count(*) as count"

    const-string v4, "max(_tm) as max_time"

    filled-new-array {v0, v2, v4}, [Ljava/lang/String;

    move-result-object v4

    .line 6
    const-string v7, "_process_launch_id"

    .line 7
    const-string v9, "max_time desc"

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v2, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    .line 8
    invoke-virtual/range {v1 .. v12}, Lcom/tencent/bugly/proguard/e4;->a(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;Z)Landroid/database/Cursor;

    move-result-object v13

    if-eqz v13, :cond_3

    const/4 v1, 0x0

    .line 9
    :cond_1
    :goto_0
    invoke-interface {v13}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 10
    invoke-interface {v13, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v13, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 11
    invoke-interface {v13, v15}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    if-ltz v3, :cond_2

    add-int/2addr v1, v3

    :cond_2
    const/16 v3, 0x2710

    if-lt v1, v3, :cond_1

    .line 12
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    .line 13
    :cond_3
    const-string v0, "ProcessContext, query expired process launch id size {%s}"

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    move-object/from16 v1, p0

    goto :goto_3

    .line 14
    :goto_2
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    goto :goto_1

    .line 15
    :goto_3
    invoke-virtual {v1, v13}, Lcom/tencent/bugly/proguard/ne;->a(Landroid/database/Cursor;)V

    return-object v14
.end method

.method public final c(Ljava/lang/String;)V
    .locals 4

    .line 22
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->i:Z

    if-eqz v0, :cond_0

    .line 23
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/tencent/bugly/proguard/ne;->a:J

    sub-long/2addr v0, v2

    .line 24
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "ProcessContext %s cost %s ms"

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 16
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 17
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/bugly/proguard/ne;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/ContentValues;

    move-result-object p3

    .line 18
    const-string/jumbo v1, "t_p_ctx"

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 19
    invoke-virtual {v0, v1, p3, v2, v3}, Lcom/tencent/bugly/proguard/e4;->a(Ljava/lang/String;Landroid/content/ContentValues;Lcom/tencent/bugly/proguard/d4;Z)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p3, v0, v2

    if-gez p3, :cond_1

    .line 20
    const-string p3, "ProcessContext, update fail processLaunchID: %s, key: %s"

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p3, p1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 21
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    :cond_1
    :goto_0
    return-void
.end method
