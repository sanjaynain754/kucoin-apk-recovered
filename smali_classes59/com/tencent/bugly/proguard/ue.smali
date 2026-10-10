.class public Lcom/tencent/bugly/proguard/ue;
.super Ljava/lang/Object;
.source "BUGLY"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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

.method public static a([BLjava/lang/Class;)Lcom/tencent/bugly/proguard/JceStruct;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/tencent/bugly/proguard/JceStruct;",
            ">([B",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    .line 74
    array-length v1, p0

    if-gtz v1, :cond_0

    goto :goto_0

    .line 75
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/bugly/proguard/JceStruct;

    .line 76
    new-instance v1, Lcom/tencent/bugly/proguard/ka;

    invoke-direct {v1, p0}, Lcom/tencent/bugly/proguard/ka;-><init>([B)V

    .line 77
    const-string/jumbo p0, "utf-8"

    .line 78
    iput-object p0, v1, Lcom/tencent/bugly/proguard/ka;->b:Ljava/lang/String;

    .line 79
    invoke-virtual {p1, v1}, Lcom/tencent/bugly/proguard/JceStruct;->a(Lcom/tencent/bugly/proguard/ka;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p0

    .line 80
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 81
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static a(Landroid/content/Context;IZ[B)Lcom/tencent/bugly/proguard/tf;
    .locals 10

    const-string p2, ""

    const-string v0, ""

    const-string v1, ""

    const-string v2, ""

    const-string v3, ""

    .line 82
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object v4

    .line 83
    invoke-static {}, Lcom/tencent/bugly/proguard/pg;->b()Lcom/tencent/bugly/proguard/pg;

    move-result-object v5

    invoke-virtual {v5}, Lcom/tencent/bugly/proguard/pg;->c()Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v4, :cond_7

    if-nez v5, :cond_0

    goto/16 :goto_5

    .line 84
    :cond_0
    :try_start_0
    new-instance v7, Lcom/tencent/bugly/proguard/tf;

    invoke-direct {v7}, Lcom/tencent/bugly/proguard/tf;-><init>()V

    .line 85
    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 86
    :try_start_1
    iget-byte v8, v4, Lcom/tencent/bugly/proguard/l2;->d:B

    iput v8, v7, Lcom/tencent/bugly/proguard/tf;->q:I

    .line 87
    invoke-virtual {v4}, Lcom/tencent/bugly/proguard/l2;->e()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, Lcom/tencent/bugly/proguard/tf;->r:Ljava/lang/String;

    .line 88
    iget-object v8, v4, Lcom/tencent/bugly/proguard/l2;->e:Ljava/lang/String;

    iput-object v8, v7, Lcom/tencent/bugly/proguard/tf;->s:Ljava/lang/String;

    .line 89
    iget-object v8, v4, Lcom/tencent/bugly/proguard/l2;->F:Ljava/lang/String;

    iput-object v8, v7, Lcom/tencent/bugly/proguard/tf;->t:Ljava/lang/String;

    .line 90
    invoke-virtual {v4}, Lcom/tencent/bugly/proguard/l2;->d()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, Lcom/tencent/bugly/proguard/tf;->u:Ljava/lang/String;

    .line 91
    iget-object v8, v4, Lcom/tencent/bugly/proguard/l2;->k:Ljava/lang/String;

    iput-object v8, v7, Lcom/tencent/bugly/proguard/tf;->v:Ljava/lang/String;

    .line 92
    iput p1, v7, Lcom/tencent/bugly/proguard/tf;->w:I

    if-nez p3, :cond_1

    .line 93
    const-string p1, ""

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p3

    goto :goto_0

    :catchall_0
    move-exception p0

    goto/16 :goto_3

    :cond_1
    :goto_0
    iput-object p3, v7, Lcom/tencent/bugly/proguard/tf;->x:[B

    .line 94
    invoke-virtual {v4}, Lcom/tencent/bugly/proguard/l2;->o()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v7, Lcom/tencent/bugly/proguard/tf;->y:Ljava/lang/String;

    .line 95
    iget-object p1, v4, Lcom/tencent/bugly/proguard/l2;->o:Ljava/lang/String;

    iput-object p1, v7, Lcom/tencent/bugly/proguard/tf;->z:Ljava/lang/String;

    .line 96
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, v7, Lcom/tencent/bugly/proguard/tf;->A:Ljava/util/Map;

    .line 97
    invoke-virtual {v4}, Lcom/tencent/bugly/proguard/l2;->B()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v7, Lcom/tencent/bugly/proguard/tf;->B:Ljava/lang/String;

    .line 98
    iget-wide v8, v5, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->m:J

    iput-wide v8, v7, Lcom/tencent/bugly/proguard/tf;->C:J

    .line 99
    invoke-virtual {v4}, Lcom/tencent/bugly/proguard/l2;->n()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v7, Lcom/tencent/bugly/proguard/tf;->E:Ljava/lang/String;

    .line 100
    invoke-static {p0}, Lcom/tencent/bugly/proguard/o4;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v7, Lcom/tencent/bugly/proguard/tf;->F:Ljava/lang/String;

    .line 101
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p0

    iput-wide p0, v7, Lcom/tencent/bugly/proguard/tf;->G:J

    .line 102
    invoke-virtual {v4}, Lcom/tencent/bugly/proguard/l2;->w()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v7, Lcom/tencent/bugly/proguard/tf;->I:Ljava/lang/String;

    .line 103
    iget-object p0, v7, Lcom/tencent/bugly/proguard/tf;->F:Ljava/lang/String;

    iput-object p0, v7, Lcom/tencent/bugly/proguard/tf;->M:Ljava/lang/String;

    .line 104
    const-string p0, "com.tencent.bugly"

    iput-object p0, v7, Lcom/tencent/bugly/proguard/tf;->D:Ljava/lang/String;

    .line 105
    iget-object p0, v7, Lcom/tencent/bugly/proguard/tf;->A:Ljava/util/Map;

    const-string p1, "A26"

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/tencent/bugly/proguard/l2;->x()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    iget-object p0, v7, Lcom/tencent/bugly/proguard/tf;->A:Ljava/util/Map;

    const-string p1, "A62"

    const-string p3, ""

    invoke-interface {p0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    iget-object p0, v7, Lcom/tencent/bugly/proguard/tf;->A:Ljava/util/Map;

    const-string p1, "A63"

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/tencent/bugly/proguard/l2;->I()Z

    move-result v2

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    iget-object p0, v7, Lcom/tencent/bugly/proguard/tf;->A:Ljava/util/Map;

    const-string p1, "F11"

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, v4, Lcom/tencent/bugly/proguard/l2;->i0:Z

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    iget-object p0, v7, Lcom/tencent/bugly/proguard/tf;->A:Ljava/util/Map;

    const-string p1, "F12"

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v0, v4, Lcom/tencent/bugly/proguard/l2;->h0:Z

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    iget-object p0, v7, Lcom/tencent/bugly/proguard/tf;->A:Ljava/util/Map;

    const-string p1, "D3"

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, v4, Lcom/tencent/bugly/proguard/l2;->H:Ljava/lang/String;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    sget-object p0, Lcom/tencent/bugly/proguard/rc;->d:Ljava/util/List;

    if-eqz p0, :cond_3

    .line 112
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/bugly/proguard/c1;

    .line 113
    iget-object p2, p1, Lcom/tencent/bugly/proguard/c1;->c:Ljava/lang/String;

    if-eqz p2, :cond_2

    iget-object p1, p1, Lcom/tencent/bugly/proguard/c1;->d:Ljava/lang/String;

    if-eqz p1, :cond_2

    .line 114
    iget-object p3, v7, Lcom/tencent/bugly/proguard/tf;->A:Ljava/util/Map;

    invoke-interface {p3, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 115
    :cond_3
    iget-object p0, v7, Lcom/tencent/bugly/proguard/tf;->A:Ljava/util/Map;

    const-string p1, "G15"

    invoke-static {}, Lcom/tencent/bugly/proguard/u7;->c()Lcom/tencent/bugly/proguard/u7;

    move-result-object p2

    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/u7;->a()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    iget-object p0, v7, Lcom/tencent/bugly/proguard/tf;->A:Ljava/util/Map;

    const-string p1, "D4"

    invoke-static {}, Lcom/tencent/bugly/proguard/u7;->c()Lcom/tencent/bugly/proguard/u7;

    move-result-object p2

    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/u7;->b()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    iget-object p0, v7, Lcom/tencent/bugly/proguard/tf;->A:Ljava/util/Map;

    const-string p1, "G10"

    const-string p2, "G10"

    const-string p3, ""

    invoke-static {p2, p3}, Lcom/tencent/bugly/proguard/bi;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 119
    :try_start_2
    invoke-virtual {v4}, Lcom/tencent/bugly/proguard/l2;->g()Ljava/util/Map;

    move-result-object p0

    if-eqz p0, :cond_5

    .line 120
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_4
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    .line 121
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_4

    .line 122
    iget-object p2, v7, Lcom/tencent/bugly/proguard/tf;->A:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-interface {p2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p0

    goto :goto_4

    :cond_5
    return-object v7

    .line 123
    :goto_3
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 124
    :goto_4
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_6

    .line 125
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_6
    return-object v6

    :cond_7
    :goto_5
    const/4 p0, 0x0

    .line 126
    new-array p0, p0, [Ljava/lang/Object;

    const-string p1, "Can not create request pkg for parameters is invalid."

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v6
.end method

.method public static a(Lcom/tencent/bugly/crashreport/biz/UserInfoBean;Lcom/tencent/bugly/proguard/l2;)Lcom/tencent/bugly/proguard/tg;
    .locals 7

    const/4 p1, 0x0

    if-nez p0, :cond_0

    return-object p1

    .line 1
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/tg;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/tg;-><init>()V

    .line 2
    iget-wide v1, p0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->f:J

    iput-wide v1, v0, Lcom/tencent/bugly/proguard/tg;->q:J

    .line 3
    iget-object v1, p0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->k:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/bugly/proguard/tg;->u:Ljava/lang/String;

    .line 4
    iget-object v1, p0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->d:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/bugly/proguard/tg;->t:Ljava/lang/String;

    .line 5
    iget-object v1, p0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->e:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/bugly/proguard/tg;->s:Ljava/lang/String;

    .line 6
    iget v1, p0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->p:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/tg;->x:Z

    .line 7
    iget v1, p0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->c:I

    if-eq v1, v2, :cond_8

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-eq v1, v4, :cond_7

    const/4 v5, 0x3

    if-eq v1, v5, :cond_6

    if-eq v1, v3, :cond_5

    const/16 v3, 0x8

    if-eq v1, v3, :cond_4

    const/16 v3, 0x9

    if-eq v1, v3, :cond_3

    const/16 v3, 0xa

    if-lt v1, v3, :cond_2

    const/16 v3, 0x14

    if-ge v1, v3, :cond_2

    int-to-byte p1, v1

    .line 8
    iput-byte p1, v0, Lcom/tencent/bugly/proguard/tg;->r:B

    goto :goto_1

    .line 9
    :cond_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string/jumbo v0, "unknown uinfo type %d "

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object p1

    .line 10
    :cond_3
    iput-byte v3, v0, Lcom/tencent/bugly/proguard/tg;->r:B

    goto :goto_1

    .line 11
    :cond_4
    iput-byte v3, v0, Lcom/tencent/bugly/proguard/tg;->r:B

    goto :goto_1

    .line 12
    :cond_5
    iput-byte v5, v0, Lcom/tencent/bugly/proguard/tg;->r:B

    goto :goto_1

    .line 13
    :cond_6
    iput-byte v4, v0, Lcom/tencent/bugly/proguard/tg;->r:B

    goto :goto_1

    .line 14
    :cond_7
    iput-byte v3, v0, Lcom/tencent/bugly/proguard/tg;->r:B

    goto :goto_1

    .line 15
    :cond_8
    iput-byte v2, v0, Lcom/tencent/bugly/proguard/tg;->r:B

    .line 16
    :goto_1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, v0, Lcom/tencent/bugly/proguard/tg;->v:Ljava/util/Map;

    .line 17
    iget v1, p0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->q:I

    const-string v3, ""

    if-ltz v1, :cond_9

    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->q:I

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v4, "C01"

    invoke-interface {p1, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    :cond_9
    iget p1, p0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->r:I

    if-ltz p1, :cond_a

    .line 20
    iget-object p1, v0, Lcom/tencent/bugly/proguard/tg;->v:Ljava/util/Map;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->r:I

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v4, "C02"

    invoke-interface {p1, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    :cond_a
    iget-object p1, p0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->s:Ljava/util/Map;

    if-eqz p1, :cond_b

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result p1

    if-lez p1, :cond_b

    .line 22
    iget-object p1, p0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->s:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 23
    iget-object v4, v0, Lcom/tencent/bugly/proguard/tg;->v:Ljava/util/Map;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "C03_"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 24
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 25
    invoke-interface {v4, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 26
    :cond_b
    iget-object p1, p0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->t:Ljava/util/Map;

    if-eqz p1, :cond_c

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result p1

    if-lez p1, :cond_c

    .line 27
    iget-object p1, p0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->t:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 28
    iget-object v4, v0, Lcom/tencent/bugly/proguard/tg;->v:Ljava/util/Map;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "C04_"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 29
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 30
    invoke-interface {v4, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 31
    :cond_c
    iget-object p1, v0, Lcom/tencent/bugly/proguard/tg;->v:Ljava/util/Map;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v4, p0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->m:Z

    xor-int/2addr v2, v4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "A36"

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    iget-object p1, v0, Lcom/tencent/bugly/proguard/tg;->v:Ljava/util/Map;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v4, p0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->h:J

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "F02"

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    iget-object p1, v0, Lcom/tencent/bugly/proguard/tg;->v:Ljava/util/Map;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v4, p0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->i:J

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "F03"

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    iget-object p1, v0, Lcom/tencent/bugly/proguard/tg;->v:Ljava/util/Map;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->k:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "F04"

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    iget-object p1, v0, Lcom/tencent/bugly/proguard/tg;->v:Ljava/util/Map;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v4, p0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->j:J

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "F05"

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    iget-object p1, v0, Lcom/tencent/bugly/proguard/tg;->v:Ljava/util/Map;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "F06"

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    iget-object p1, v0, Lcom/tencent/bugly/proguard/tg;->v:Ljava/util/Map;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->l:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "F10"

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    const-string/jumbo p1, "user_custom"

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 39
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_d

    .line 40
    iget-object p1, v0, Lcom/tencent/bugly/proguard/tg;->v:Ljava/util/Map;

    const-string v1, "C04_user_custom"

    invoke-interface {p1, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    :cond_d
    iget-byte p0, v0, Lcom/tencent/bugly/proguard/tg;->r:B

    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    iget-object p1, v0, Lcom/tencent/bugly/proguard/tg;->v:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string/jumbo p1, "summary type %d vm:%d"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static a([BLcom/tencent/bugly/crashreport/common/strategy/StrategyBean;Z)Lcom/tencent/bugly/proguard/vf;
    .locals 2

    const-class p1, Lcom/tencent/bugly/proguard/vf;

    const/4 p2, 0x0

    if-eqz p0, :cond_1

    .line 140
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/proguard/nh;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/nh;-><init>()V

    .line 141
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/nh;->g()V

    .line 142
    const-string/jumbo v1, "utf-8"

    .line 143
    iput-object v1, v0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 144
    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/nh;->a([B)V

    .line 145
    const-string p0, "detail"

    new-instance v1, Lcom/tencent/bugly/proguard/vf;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/vf;-><init>()V

    invoke-virtual {v0, p0, v1}, Lcom/tencent/bugly/proguard/mh;->d(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 146
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    invoke-virtual {p1, p0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/tencent/bugly/proguard/vf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    return-object p2

    .line 148
    :goto_0
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 149
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    return-object p2
.end method

.method public static a(Ljava/util/List;I)Lcom/tencent/bugly/proguard/wh;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/crashreport/biz/UserInfoBean;",
            ">;I)",
            "Lcom/tencent/bugly/proguard/wh;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_7

    .line 42
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_2

    .line 43
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v0

    .line 44
    :cond_1
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/l2;->Q()Ljava/lang/String;

    .line 45
    new-instance v2, Lcom/tencent/bugly/proguard/wh;

    invoke-direct {v2}, Lcom/tencent/bugly/proguard/wh;-><init>()V

    .line 46
    iget-object v3, v1, Lcom/tencent/bugly/proguard/l2;->f:Ljava/lang/String;

    iput-object v3, v2, Lcom/tencent/bugly/proguard/wh;->r:Ljava/lang/String;

    .line 47
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/l2;->n()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/tencent/bugly/proguard/wh;->s:Ljava/lang/String;

    .line 48
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 49
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

    .line 50
    invoke-static {v4, v1}, Lcom/tencent/bugly/proguard/ue;->a(Lcom/tencent/bugly/crashreport/biz/UserInfoBean;Lcom/tencent/bugly/proguard/l2;)Lcom/tencent/bugly/proguard/tg;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 51
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 52
    :cond_3
    iput-object v3, v2, Lcom/tencent/bugly/proguard/wh;->t:Ljava/util/ArrayList;

    .line 53
    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    iput-object p0, v2, Lcom/tencent/bugly/proguard/wh;->u:Ljava/util/Map;

    .line 54
    const-string v3, "A7"

    const-string v4, ""

    invoke-interface {p0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    iget-object p0, v2, Lcom/tencent/bugly/proguard/wh;->u:Ljava/util/Map;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/l2;->k()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "A6"

    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    iget-object p0, v2, Lcom/tencent/bugly/proguard/wh;->u:Ljava/util/Map;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/l2;->m()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "A5"

    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    iget-object p0, v2, Lcom/tencent/bugly/proguard/wh;->u:Ljava/util/Map;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/l2;->C()J

    move-result-wide v5

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "A2"

    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    iget-object p0, v2, Lcom/tencent/bugly/proguard/wh;->u:Ljava/util/Map;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/l2;->C()J

    move-result-wide v5

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "A1"

    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    iget-object p0, v2, Lcom/tencent/bugly/proguard/wh;->u:Ljava/util/Map;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, v1, Lcom/tencent/bugly/proguard/l2;->o:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "A24"

    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    iget-object p0, v2, Lcom/tencent/bugly/proguard/wh;->u:Ljava/util/Map;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/l2;->E()J

    move-result-wide v5

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "A17"

    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    iget-object p0, v2, Lcom/tencent/bugly/proguard/wh;->u:Ljava/util/Map;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/l2;->j()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "A15"

    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    iget-object p0, v2, Lcom/tencent/bugly/proguard/wh;->u:Ljava/util/Map;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/l2;->t()Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "A13"

    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    iget-object p0, v2, Lcom/tencent/bugly/proguard/wh;->u:Ljava/util/Map;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, v1, Lcom/tencent/bugly/proguard/l2;->e0:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "F08"

    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    iget-object p0, v2, Lcom/tencent/bugly/proguard/wh;->u:Ljava/util/Map;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v1, Lcom/tencent/bugly/proguard/l2;->f0:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "F09"

    invoke-interface {p0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/l2;->h()Ljava/util/Map;

    move-result-object p0

    if-eqz p0, :cond_4

    .line 66
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v1

    if-lez v1, :cond_4

    .line 67
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 68
    iget-object v3, v2, Lcom/tencent/bugly/proguard/wh;->u:Ljava/util/Map;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "C04_"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 69
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 70
    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    const/4 p0, 0x1

    if-eq p1, p0, :cond_6

    const/4 p0, 0x2

    if-eq p1, p0, :cond_5

    .line 71
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string/jumbo p1, "unknown up type %d "

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v0

    .line 72
    :cond_5
    iput-byte p0, v2, Lcom/tencent/bugly/proguard/wh;->q:B

    return-object v2

    .line 73
    :cond_6
    iput-byte p0, v2, Lcom/tencent/bugly/proguard/wh;->q:B

    return-object v2

    :cond_7
    :goto_2
    return-object v0
.end method

.method public static a(Lcom/tencent/bugly/proguard/JceStruct;)[B
    .locals 2

    .line 150
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/proguard/la;

    const/16 v1, 0x80

    .line 151
    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/la;-><init>(I)V

    .line 152
    const-string/jumbo v1, "utf-8"

    .line 153
    iput-object v1, v0, Lcom/tencent/bugly/proguard/la;->b:Ljava/lang/String;

    .line 154
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/JceStruct;->a(Lcom/tencent/bugly/proguard/la;)V

    .line 155
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/la;->b()[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 156
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 157
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static a(Ljava/lang/Object;)[B
    .locals 3

    .line 127
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/proguard/nh;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/nh;-><init>()V

    .line 128
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/nh;->g()V

    .line 129
    const-string/jumbo v1, "utf-8"

    .line 130
    iput-object v1, v0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 131
    iget-object v1, v0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    const/4 v2, 0x1

    iput v2, v1, Lcom/tencent/bugly/proguard/sf;->t:I

    .line 132
    const-string v2, "RqdServer"

    .line 133
    iput-object v2, v1, Lcom/tencent/bugly/proguard/sf;->u:Ljava/lang/String;

    .line 134
    const-string/jumbo v2, "sync"

    .line 135
    iput-object v2, v1, Lcom/tencent/bugly/proguard/sf;->v:Ljava/lang/String;

    .line 136
    const-string v1, "detail"

    invoke-virtual {v0, v1, p0}, Lcom/tencent/bugly/proguard/nh;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 137
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/nh;->b()[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 138
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 139
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
