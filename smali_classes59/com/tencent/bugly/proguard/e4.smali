.class public Lcom/tencent/bugly/proguard/e4;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/e4$a;
    }
.end annotation


# static fields
.field public static a:Lcom/tencent/bugly/proguard/e4;

.field public static b:Lcom/tencent/bugly/proguard/f4;

.field public static c:Z


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

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/c1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/bugly/proguard/f4;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p1, p2}, Lcom/tencent/bugly/proguard/f4;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 9
    .line 10
    sput-object v0, Lcom/tencent/bugly/proguard/e4;->b:Lcom/tencent/bugly/proguard/f4;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
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
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/e4;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;)I
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/tencent/bugly/proguard/e4;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;)I

    move-result p0

    return p0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/e4;Ljava/lang/String;Landroid/content/ContentValues;Lcom/tencent/bugly/proguard/d4;)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/bugly/proguard/e4;->a(Ljava/lang/String;Landroid/content/ContentValues;Lcom/tencent/bugly/proguard/d4;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/e4;ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;)Landroid/database/Cursor;
    .locals 0

    .line 3
    invoke-virtual/range {p0 .. p10}, Lcom/tencent/bugly/proguard/e4;->a(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;)Landroid/database/Cursor;

    move-result-object p0

    return-object p0
.end method

.method public static declared-synchronized a()Lcom/tencent/bugly/proguard/e4;
    .locals 2

    const-class v0, Lcom/tencent/bugly/proguard/e4;

    monitor-enter v0

    .line 10
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/e4;->a:Lcom/tencent/bugly/proguard/e4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static declared-synchronized a(Landroid/content/Context;Ljava/util/List;)Lcom/tencent/bugly/proguard/e4;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/c1;",
            ">;)",
            "Lcom/tencent/bugly/proguard/e4;"
        }
    .end annotation

    const-class v0, Lcom/tencent/bugly/proguard/e4;

    monitor-enter v0

    .line 7
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/e4;->a:Lcom/tencent/bugly/proguard/e4;

    if-nez v1, :cond_0

    .line 8
    new-instance v1, Lcom/tencent/bugly/proguard/e4;

    invoke-direct {v1, p0, p1}, Lcom/tencent/bugly/proguard/e4;-><init>(Landroid/content/Context;Ljava/util/List;)V

    sput-object v1, Lcom/tencent/bugly/proguard/e4;->a:Lcom/tencent/bugly/proguard/e4;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 9
    :cond_0
    :goto_0
    sget-object p0, Lcom/tencent/bugly/proguard/e4;->a:Lcom/tencent/bugly/proguard/e4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/e4;ILcom/tencent/bugly/proguard/d4;)Ljava/util/Map;
    .locals 0

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/e4;->a(ILcom/tencent/bugly/proguard/d4;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/e4;ILjava/lang/String;Lcom/tencent/bugly/proguard/d4;)Z
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/bugly/proguard/e4;->a(ILjava/lang/String;Lcom/tencent/bugly/proguard/d4;)Z

    move-result p0

    return p0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/e4;ILjava/lang/String;[BLcom/tencent/bugly/proguard/d4;)Z
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/tencent/bugly/proguard/e4;->a(ILjava/lang/String;[BLcom/tencent/bugly/proguard/d4;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final declared-synchronized a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;)I
    .locals 4

    monitor-enter p0

    const/4 v0, 0x0

    .line 50
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x0

    .line 51
    :try_start_1
    sget-object v3, Lcom/tencent/bugly/proguard/e4;->b:Lcom/tencent/bugly/proguard/f4;

    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/f4;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 52
    invoke-virtual {v2, p1, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    if-eqz p4, :cond_1

    .line 53
    :try_start_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p4, p1}, Lcom/tencent/bugly/proguard/d4;->a(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_6

    .line 54
    :cond_1
    :goto_1
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz p1, :cond_4

    if-eqz v2, :cond_4

    goto :goto_4

    .line 55
    :goto_2
    :try_start_3
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 56
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception p1

    goto :goto_5

    :cond_2
    :goto_3
    if-eqz p4, :cond_3

    .line 57
    :try_start_4
    invoke-interface {p4, v1}, Lcom/tencent/bugly/proguard/d4;->a(Ljava/lang/Object;)V

    .line 58
    :cond_3
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z

    if-eqz p1, :cond_4

    if-eqz v2, :cond_4

    .line 59
    :goto_4
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 60
    :cond_4
    monitor-exit p0

    return v0

    :goto_5
    if-eqz p4, :cond_5

    .line 61
    :try_start_5
    invoke-interface {p4, v1}, Lcom/tencent/bugly/proguard/d4;->a(Ljava/lang/Object;)V

    .line 62
    :cond_5
    sget-boolean p2, Lcom/tencent/bugly/proguard/e4;->c:Z

    if-eqz p2, :cond_6

    if-eqz v2, :cond_6

    .line 63
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 64
    :cond_6
    throw p1

    :goto_6
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;Z)I
    .locals 1

    if-nez p5, :cond_0

    .line 21
    new-instance p5, Lcom/tencent/bugly/proguard/e4$a;

    const/4 v0, 0x2

    invoke-direct {p5, p0, v0, p4}, Lcom/tencent/bugly/proguard/e4$a;-><init>(Lcom/tencent/bugly/proguard/e4;ILcom/tencent/bugly/proguard/d4;)V

    .line 22
    invoke-virtual {p5, p1, p2, p3}, Lcom/tencent/bugly/proguard/e4$a;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 23
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;)Z

    const/4 p1, 0x0

    return p1

    .line 24
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/tencent/bugly/proguard/e4;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;)I

    move-result p1

    return p1
.end method

.method public final declared-synchronized a(Ljava/lang/String;Landroid/content/ContentValues;Lcom/tencent/bugly/proguard/d4;)J
    .locals 8

    monitor-enter p0

    const-wide/16 v0, -0x1

    .line 25
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v3, 0x0

    .line 26
    :try_start_1
    sget-object v4, Lcom/tencent/bugly/proguard/e4;->b:Lcom/tencent/bugly/proguard/f4;

    invoke-virtual {v4}, Lcom/tencent/bugly/proguard/f4;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    if-eqz v3, :cond_1

    if-eqz p2, :cond_1

    .line 27
    const-string v4, "_id"

    invoke-virtual {v3, p1, v4, p2}, Landroid/database/sqlite/SQLiteDatabase;->replace(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long p2, v4, v6

    if-ltz p2, :cond_0

    .line 28
    const-string p2, "[Database] insert %s success."

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 29
    :cond_0
    const-string p2, "[Database] replace %s error."

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    move-wide v0, v4

    :cond_1
    if-eqz p3, :cond_2

    .line 30
    :try_start_2
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/tencent/bugly/proguard/d4;->a(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_6

    .line 31
    :cond_2
    :goto_1
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz p1, :cond_5

    if-eqz v3, :cond_5

    goto :goto_4

    .line 32
    :goto_2
    :try_start_3
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 33
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception p1

    goto :goto_5

    :cond_3
    :goto_3
    if-eqz p3, :cond_4

    .line 34
    :try_start_4
    invoke-interface {p3, v2}, Lcom/tencent/bugly/proguard/d4;->a(Ljava/lang/Object;)V

    .line 35
    :cond_4
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z

    if-eqz p1, :cond_5

    if-eqz v3, :cond_5

    .line 36
    :goto_4
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 37
    :cond_5
    monitor-exit p0

    return-wide v0

    :goto_5
    if-eqz p3, :cond_6

    .line 38
    :try_start_5
    invoke-interface {p3, v2}, Lcom/tencent/bugly/proguard/d4;->a(Ljava/lang/Object;)V

    .line 39
    :cond_6
    sget-boolean p2, Lcom/tencent/bugly/proguard/e4;->c:Z

    if-eqz p2, :cond_7

    if-eqz v3, :cond_7

    .line 40
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 41
    :cond_7
    throw p1

    :goto_6
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1
.end method

.method public a(Ljava/lang/String;Landroid/content/ContentValues;Lcom/tencent/bugly/proguard/d4;Z)J
    .locals 1

    if-nez p4, :cond_0

    .line 11
    new-instance p4, Lcom/tencent/bugly/proguard/e4$a;

    const/4 v0, 0x1

    invoke-direct {p4, p0, v0, p3}, Lcom/tencent/bugly/proguard/e4$a;-><init>(Lcom/tencent/bugly/proguard/e4;ILcom/tencent/bugly/proguard/d4;)V

    .line 12
    iput-object p1, p4, Lcom/tencent/bugly/proguard/e4$a;->d:Ljava/lang/String;

    .line 13
    iput-object p2, p4, Lcom/tencent/bugly/proguard/e4$a;->e:Landroid/content/ContentValues;

    .line 14
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;)Z

    const-wide/16 p1, 0x0

    return-wide p1

    .line 15
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/bugly/proguard/e4;->a(Ljava/lang/String;Landroid/content/ContentValues;Lcom/tencent/bugly/proguard/d4;)J

    move-result-wide p1

    return-wide p1
.end method

.method public a(Lcom/tencent/bugly/proguard/ab;)Landroid/content/ContentValues;
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 151
    :cond_0
    :try_start_0
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 152
    iget-wide v2, p1, Lcom/tencent/bugly/proguard/ab;->a:J

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-lez v4, :cond_1

    .line 153
    const-string v4, "_id"

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 154
    :cond_1
    :goto_0
    const-string v2, "_tp"

    iget v3, p1, Lcom/tencent/bugly/proguard/ab;->b:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 155
    const-string v2, "_pc"

    iget-object v3, p1, Lcom/tencent/bugly/proguard/ab;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    const-string v2, "_th"

    iget-object v3, p1, Lcom/tencent/bugly/proguard/ab;->d:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    const-string v2, "_tm"

    iget-wide v3, p1, Lcom/tencent/bugly/proguard/ab;->e:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 158
    iget-object p1, p1, Lcom/tencent/bugly/proguard/ab;->g:[B

    if-eqz p1, :cond_2

    .line 159
    const-string v2, "_dt"

    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    return-object v1

    .line 160
    :goto_1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 161
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3
    return-object v0
.end method

.method public a(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;Z)Landroid/database/Cursor;
    .locals 12

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v10, p5

    move/from16 v11, p6

    .line 16
    invoke-virtual/range {v0 .. v11}, Lcom/tencent/bugly/proguard/e4;->a(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;Z)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized a(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;)Landroid/database/Cursor;
    .locals 13

    move-object/from16 v1, p10

    monitor-enter p0

    const/4 v2, 0x0

    .line 42
    :try_start_0
    sget-object v0, Lcom/tencent/bugly/proguard/e4;->b:Lcom/tencent/bugly/proguard/f4;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/f4;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    if-eqz v3, :cond_0

    move v4, p1

    move-object v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    .line 43
    invoke-virtual/range {v3 .. v12}, Landroid/database/sqlite/SQLiteDatabase;->query(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz v1, :cond_2

    goto :goto_3

    .line 44
    :goto_1
    :try_start_1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 45
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v0

    goto :goto_5

    :cond_1
    :goto_2
    if-eqz v1, :cond_2

    .line 46
    :goto_3
    :try_start_2
    invoke-interface {v1, v2}, Lcom/tencent/bugly/proguard/d4;->a(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v0

    move-object p1, v0

    goto :goto_6

    .line 47
    :cond_2
    :goto_4
    monitor-exit p0

    return-object v2

    :goto_5
    if-eqz v1, :cond_3

    .line 48
    :try_start_3
    invoke-interface {v1, v2}, Lcom/tencent/bugly/proguard/d4;->a(Ljava/lang/Object;)V

    .line 49
    :cond_3
    throw p1

    :goto_6
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw p1
.end method

.method public a(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;Z)Landroid/database/Cursor;
    .locals 10

    if-nez p11, :cond_0

    .line 17
    new-instance v0, Lcom/tencent/bugly/proguard/e4$a;

    const/4 v1, 0x3

    move-object/from16 v2, p10

    invoke-direct {v0, p0, v1, v2}, Lcom/tencent/bugly/proguard/e4$a;-><init>(Lcom/tencent/bugly/proguard/e4;ILcom/tencent/bugly/proguard/d4;)V

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    .line 18
    invoke-virtual/range {v0 .. v9}, Lcom/tencent/bugly/proguard/e4$a;->a(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;)Z

    const/4 p1, 0x0

    return-object p1

    :cond_0
    move-object/from16 v2, p10

    .line 20
    invoke-virtual/range {p0 .. p10}, Lcom/tencent/bugly/proguard/e4;->a(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/database/Cursor;)Lcom/tencent/bugly/proguard/ab;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 162
    :cond_0
    :try_start_0
    new-instance v1, Lcom/tencent/bugly/proguard/ab;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/ab;-><init>()V

    .line 163
    const-string v2, "_id"

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/tencent/bugly/proguard/ab;->a:J

    .line 164
    const-string v2, "_tp"

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    iput v2, v1, Lcom/tencent/bugly/proguard/ab;->b:I

    .line 165
    const-string v2, "_pc"

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/tencent/bugly/proguard/ab;->c:Ljava/lang/String;

    .line 166
    const-string v2, "_th"

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/tencent/bugly/proguard/ab;->d:Ljava/lang/String;

    .line 167
    const-string v2, "_tm"

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/tencent/bugly/proguard/ab;->e:J

    .line 168
    const-string v2, "_dt"

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object p1

    iput-object p1, v1, Lcom/tencent/bugly/proguard/ab;->g:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :catchall_0
    move-exception p1

    .line 169
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 170
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    return-object v0
.end method

.method public declared-synchronized a(I)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/ab;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "_tp = "

    .line 99
    sget-object v1, Lcom/tencent/bugly/proguard/e4;->b:Lcom/tencent/bugly/proguard/f4;

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/f4;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x0

    if-eqz v2, :cond_c

    if-ltz p1, :cond_0

    .line 100
    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    move-object v5, p1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v3, v1

    goto/16 :goto_3

    :cond_0
    move-object v5, v1

    .line 101
    :goto_0
    const-string/jumbo v3, "t_lr"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 102
    invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p1, :cond_3

    if-eqz p1, :cond_1

    .line 103
    :try_start_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object p1, v0

    goto/16 :goto_7

    .line 104
    :cond_1
    :goto_1
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z

    if-eqz p1, :cond_2

    .line 105
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_2
    monitor-exit p0

    return-object v1

    .line 106
    :cond_3
    :try_start_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 108
    :goto_2
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 109
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/e4;->a(Landroid/database/Cursor;)Lcom/tencent/bugly/proguard/ab;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 110
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v3, p1

    move-object p1, v0

    goto :goto_3

    .line 111
    :cond_4
    :try_start_4
    const-string v4, "_id"

    invoke-interface {p1, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {p1, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    .line 112
    const-string v6, " or "

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "_id"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " = "

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_2

    .line 114
    :catchall_3
    :try_start_5
    const-string v4, "[Database] unknown id."

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v4, v5}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_2

    .line 115
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 116
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_6

    const/4 v4, 0x4

    .line 117
    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 118
    const-string/jumbo v4, "t_lr"

    invoke-virtual {v2, v4, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    .line 119
    const-string v4, "[Database] deleted %s illegal data %d"

    const-string/jumbo v5, "t_lr"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v5, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 120
    :cond_6
    :try_start_6
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 121
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z

    if-eqz p1, :cond_7

    .line 122
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :cond_7
    monitor-exit p0

    return-object v3

    .line 123
    :goto_3
    :try_start_7
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 124
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_4

    :catchall_4
    move-exception v0

    move-object p1, v0

    goto :goto_5

    :cond_8
    :goto_4
    if-eqz v3, :cond_9

    .line 125
    :try_start_8
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 126
    :cond_9
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z

    if-eqz p1, :cond_c

    .line 127
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteClosable;->close()V

    goto :goto_6

    :goto_5
    if-eqz v3, :cond_a

    .line 128
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 129
    :cond_a
    sget-boolean v0, Lcom/tencent/bugly/proguard/e4;->c:Z

    if-eqz v0, :cond_b

    .line 130
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 131
    :cond_b
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :cond_c
    :goto_6
    monitor-exit p0

    return-object v1

    :goto_7
    :try_start_9
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    throw p1
.end method

.method public final a(ILcom/tencent/bugly/proguard/d4;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/tencent/bugly/proguard/d4;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[B>;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 89
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/e4;->b(I)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 90
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 91
    :try_start_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/proguard/ab;

    .line 92
    iget-object v2, v0, Lcom/tencent/bugly/proguard/ab;->g:[B

    if-eqz v2, :cond_0

    .line 93
    iget-object v0, v0, Lcom/tencent/bugly/proguard/ab;->f:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    move-object v0, v1

    goto :goto_2

    :goto_1
    move-object v0, v1

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_2
    if-eqz p2, :cond_3

    .line 94
    invoke-interface {p2, v0}, Lcom/tencent/bugly/proguard/d4;->a(Ljava/lang/Object;)V

    :cond_3
    return-object v0

    .line 95
    :goto_3
    :try_start_2
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 96
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception p1

    goto :goto_5

    :cond_4
    :goto_4
    if-eqz p2, :cond_5

    .line 97
    invoke-interface {p2, v0}, Lcom/tencent/bugly/proguard/d4;->a(Ljava/lang/Object;)V

    :cond_5
    return-object v0

    :goto_5
    if-eqz p2, :cond_6

    invoke-interface {p2, v0}, Lcom/tencent/bugly/proguard/d4;->a(Ljava/lang/Object;)V

    .line 98
    :cond_6
    throw p1
.end method

.method public a(ILcom/tencent/bugly/proguard/d4;Z)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/tencent/bugly/proguard/d4;",
            "Z)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[B>;"
        }
    .end annotation

    if-nez p3, :cond_0

    .line 69
    new-instance p3, Lcom/tencent/bugly/proguard/e4$a;

    const/4 v0, 0x5

    invoke-direct {p3, p0, v0, p2}, Lcom/tencent/bugly/proguard/e4$a;-><init>(Lcom/tencent/bugly/proguard/e4;ILcom/tencent/bugly/proguard/d4;)V

    .line 70
    iput p1, p3, Lcom/tencent/bugly/proguard/e4$a;->p:I

    .line 71
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;)Z

    const/4 p1, 0x0

    return-object p1

    .line 72
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/e4;->a(ILcom/tencent/bugly/proguard/d4;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/ab;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    if-eqz p1, :cond_6

    .line 132
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_6

    .line 133
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/e4;->b:Lcom/tencent/bugly/proguard/f4;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/f4;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 134
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/ab;

    .line 136
    const-string v3, " or _id = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, v2, Lcom/tencent/bugly/proguard/ab;->a:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_5

    .line 137
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 138
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_2

    const/4 v2, 0x4

    .line 139
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :cond_2
    const/4 v2, 0x0

    .line 140
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->setLength(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 141
    :try_start_1
    const-string/jumbo v1, "t_lr"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1

    .line 142
    const-string v1, "[Database] deleted %s data %d"

    const-string/jumbo v2, "t_lr"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v2, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 143
    :try_start_2
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p1, :cond_5

    goto :goto_2

    :catchall_1
    move-exception p1

    .line 144
    :try_start_3
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 145
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p1

    goto :goto_3

    .line 146
    :cond_3
    :goto_1
    :try_start_4
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z

    if-eqz p1, :cond_5

    .line 147
    :goto_2
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteClosable;->close()V

    goto :goto_4

    .line 148
    :goto_3
    sget-boolean v1, Lcom/tencent/bugly/proguard/e4;->c:Z

    if-eqz v1, :cond_4

    .line 149
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 150
    :cond_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_5
    :goto_4
    monitor-exit p0

    return-void

    :goto_5
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1

    :cond_6
    :goto_6
    monitor-exit p0

    return-void
.end method

.method public final declared-synchronized a(ILjava/lang/String;Lcom/tencent/bugly/proguard/d4;)Z
    .locals 7

    monitor-enter p0

    :try_start_0
    const-string v0, " and _tp = \""

    const-string v1, "_id = "

    const-string v2, "_id = "
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 171
    :try_start_1
    sget-object v5, Lcom/tencent/bugly/proguard/e4;->b:Lcom/tencent/bugly/proguard/f4;

    invoke-virtual {v5}, Lcom/tencent/bugly/proguard/f4;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-eqz v5, :cond_1

    .line 172
    :try_start_2
    invoke-static {p2}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 173
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :catchall_0
    move-exception p1

    move-object v3, v5

    goto :goto_2

    .line 174
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\""

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 175
    :goto_0
    const-string/jumbo p2, "t_pf"

    invoke-virtual {v5, p2, p1, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1

    .line 176
    const-string p2, "[Database] deleted %s data %d"

    const-string/jumbo v0, "t_pf"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-lez p1, :cond_1

    const/4 v4, 0x1

    :cond_1
    if-eqz p3, :cond_2

    .line 177
    :try_start_3
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/tencent/bugly/proguard/d4;->a(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_6

    .line 178
    :cond_2
    :goto_1
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz p1, :cond_5

    if-eqz v5, :cond_5

    goto :goto_4

    :catchall_2
    move-exception p1

    .line 179
    :goto_2
    :try_start_4
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 180
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception p1

    goto :goto_5

    :cond_3
    :goto_3
    if-eqz p3, :cond_4

    .line 181
    :try_start_5
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p3, p1}, Lcom/tencent/bugly/proguard/d4;->a(Ljava/lang/Object;)V

    .line 182
    :cond_4
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z

    if-eqz p1, :cond_5

    if-eqz v3, :cond_5

    move-object v5, v3

    .line 183
    :goto_4
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 184
    :cond_5
    monitor-exit p0

    return v4

    :goto_5
    if-eqz p3, :cond_6

    .line 185
    :try_start_6
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p3, p2}, Lcom/tencent/bugly/proguard/d4;->a(Ljava/lang/Object;)V

    .line 186
    :cond_6
    sget-boolean p2, Lcom/tencent/bugly/proguard/e4;->c:Z

    if-eqz p2, :cond_7

    if-eqz v3, :cond_7

    .line 187
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 188
    :cond_7
    throw p1

    :goto_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw p1
.end method

.method public a(ILjava/lang/String;Lcom/tencent/bugly/proguard/d4;Z)Z
    .locals 1

    if-nez p4, :cond_0

    .line 73
    new-instance p4, Lcom/tencent/bugly/proguard/e4$a;

    const/4 v0, 0x6

    invoke-direct {p4, p0, v0, p3}, Lcom/tencent/bugly/proguard/e4$a;-><init>(Lcom/tencent/bugly/proguard/e4;ILcom/tencent/bugly/proguard/d4;)V

    .line 74
    iput p1, p4, Lcom/tencent/bugly/proguard/e4$a;->p:I

    .line 75
    iput-object p2, p4, Lcom/tencent/bugly/proguard/e4$a;->q:Ljava/lang/String;

    .line 76
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;)Z

    const/4 p1, 0x0

    return p1

    .line 77
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/bugly/proguard/e4;->a(ILjava/lang/String;Lcom/tencent/bugly/proguard/d4;)Z

    move-result p1

    return p1
.end method

.method public final a(ILjava/lang/String;[BLcom/tencent/bugly/proguard/d4;)Z
    .locals 3

    .line 78
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/proguard/ab;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/ab;-><init>()V

    int-to-long v1, p1

    .line 79
    iput-wide v1, v0, Lcom/tencent/bugly/proguard/ab;->a:J

    .line 80
    iput-object p2, v0, Lcom/tencent/bugly/proguard/ab;->f:Ljava/lang/String;

    .line 81
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, v0, Lcom/tencent/bugly/proguard/ab;->e:J

    .line 82
    iput-object p3, v0, Lcom/tencent/bugly/proguard/ab;->g:[B

    .line 83
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/e4;->c(Lcom/tencent/bugly/proguard/ab;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p4, :cond_0

    .line 84
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p4, p2}, Lcom/tencent/bugly/proguard/d4;->a(Ljava/lang/Object;)V

    :cond_0
    return p1

    :catchall_0
    move-exception p1

    .line 85
    :try_start_1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 86
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    if-eqz p4, :cond_2

    .line 87
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p4, p1}, Lcom/tencent/bugly/proguard/d4;->a(Ljava/lang/Object;)V

    :cond_2
    const/4 p1, 0x0

    return p1

    :goto_1
    if-eqz p4, :cond_3

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p4, p2}, Lcom/tencent/bugly/proguard/d4;->a(Ljava/lang/Object;)V

    .line 88
    :cond_3
    throw p1
.end method

.method public a(ILjava/lang/String;[BLcom/tencent/bugly/proguard/d4;Z)Z
    .locals 1

    if-nez p5, :cond_0

    .line 65
    new-instance p5, Lcom/tencent/bugly/proguard/e4$a;

    const/4 v0, 0x4

    invoke-direct {p5, p0, v0, p4}, Lcom/tencent/bugly/proguard/e4$a;-><init>(Lcom/tencent/bugly/proguard/e4;ILcom/tencent/bugly/proguard/d4;)V

    .line 66
    invoke-virtual {p5, p1, p2, p3}, Lcom/tencent/bugly/proguard/e4$a;->a(ILjava/lang/String;[B)V

    .line 67
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;)Z

    const/4 p1, 0x1

    return p1

    .line 68
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/tencent/bugly/proguard/e4;->a(ILjava/lang/String;[BLcom/tencent/bugly/proguard/d4;)Z

    move-result p1

    return p1
.end method

.method public b(Lcom/tencent/bugly/proguard/ab;)Landroid/content/ContentValues;
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 35
    iget-object v1, p1, Lcom/tencent/bugly/proguard/ab;->f:Ljava/lang/String;

    invoke-static {v1}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    .line 36
    :cond_0
    :try_start_0
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 37
    iget-wide v2, p1, Lcom/tencent/bugly/proguard/ab;->a:J

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-lez v4, :cond_1

    .line 38
    const-string v4, "_id"

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    const-string v2, "_tp"

    iget-object v3, p1, Lcom/tencent/bugly/proguard/ab;->f:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    const-string v2, "_tm"

    iget-wide v3, p1, Lcom/tencent/bugly/proguard/ab;->e:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 41
    iget-object p1, p1, Lcom/tencent/bugly/proguard/ab;->g:[B

    if-eqz p1, :cond_2

    .line 42
    const-string v2, "_dt"

    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    return-object v1

    .line 43
    :goto_1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 44
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3
    :goto_2
    return-object v0
.end method

.method public b(Landroid/database/Cursor;)Lcom/tencent/bugly/proguard/ab;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 45
    :cond_0
    :try_start_0
    new-instance v1, Lcom/tencent/bugly/proguard/ab;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/ab;-><init>()V

    .line 46
    const-string v2, "_id"

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/tencent/bugly/proguard/ab;->a:J

    .line 47
    const-string v2, "_tm"

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/tencent/bugly/proguard/ab;->e:J

    .line 48
    const-string v2, "_tp"

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/tencent/bugly/proguard/ab;->f:Ljava/lang/String;

    .line 49
    const-string v2, "_dt"

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object p1

    iput-object p1, v1, Lcom/tencent/bugly/proguard/ab;->g:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :catchall_0
    move-exception p1

    .line 50
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 51
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    return-object v0
.end method

.method public final declared-synchronized b(I)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/ab;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "_id = "
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    .line 1
    :try_start_1
    sget-object v2, Lcom/tencent/bugly/proguard/e4;->b:Lcom/tencent/bugly/proguard/f4;

    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/f4;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    if-eqz v3, :cond_7

    .line 2
    :try_start_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 3
    const-string/jumbo v4, "t_pf"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 4
    invoke-virtual/range {v3 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-nez v2, :cond_2

    if-eqz v2, :cond_0

    .line 5
    :try_start_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_6

    .line 6
    :cond_0
    :goto_0
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z

    if-eqz p1, :cond_1

    .line 7
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_1
    monitor-exit p0

    return-object v1

    .line 8
    :cond_2
    :try_start_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 10
    :goto_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 11
    invoke-virtual {p0, v2}, Lcom/tencent/bugly/proguard/e4;->b(Landroid/database/Cursor;)Lcom/tencent/bugly/proguard/ab;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 12
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object p1, v0

    goto/16 :goto_2

    .line 13
    :cond_3
    :try_start_5
    const-string v5, "_tp"

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 14
    const-string v7, " or "

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "_tp"

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " = "

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_1

    .line 15
    :catchall_2
    :try_start_6
    const-string v5, "[Database] unknown id."

    const/4 v7, 0x0

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {v5, v7}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_1

    .line 16
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    if-lez v5, :cond_5

    .line 17
    const-string v5, " and "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "_id"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " = "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/4 p1, 0x4

    .line 18
    invoke-virtual {v6, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 19
    const-string/jumbo v0, "t_pf"

    invoke-virtual {v3, v0, p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1

    .line 20
    const-string v0, "[Database] deleted %s illegal data %d."

    const-string/jumbo v5, "t_pf"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v5, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 21
    :cond_5
    :try_start_7
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 22
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z

    if-eqz p1, :cond_6

    .line 23
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :cond_6
    monitor-exit p0

    return-object v4

    :catchall_3
    move-exception v0

    move-object p1, v0

    move-object v2, v1

    goto :goto_2

    .line 24
    :cond_7
    :try_start_8
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    if-eqz p1, :cond_a

    if-eqz v3, :cond_a

    goto :goto_4

    :catchall_4
    move-exception v0

    move-object p1, v0

    move-object v2, v1

    move-object v3, v2

    .line 25
    :goto_2
    :try_start_9
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 26
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    goto :goto_3

    :catchall_5
    move-exception v0

    move-object p1, v0

    goto :goto_5

    :cond_8
    :goto_3
    if-eqz v2, :cond_9

    .line 27
    :try_start_a
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 28
    :cond_9
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z

    if-eqz p1, :cond_a

    if-eqz v3, :cond_a

    .line 29
    :goto_4
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 30
    :cond_a
    monitor-exit p0

    return-object v1

    :goto_5
    if-eqz v2, :cond_b

    .line 31
    :try_start_b
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 32
    :cond_b
    sget-boolean v0, Lcom/tencent/bugly/proguard/e4;->c:Z

    if-eqz v0, :cond_c

    if-eqz v3, :cond_c

    .line 33
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 34
    :cond_c
    throw p1

    :goto_6
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    throw p1
.end method

.method public declared-synchronized c(I)V
    .locals 4

    monitor-enter p0

    :try_start_0
    const-string v0, "_tp = "

    .line 19
    sget-object v1, Lcom/tencent/bugly/proguard/e4;->b:Lcom/tencent/bugly/proguard/f4;

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/f4;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_3

    const/4 v2, 0x0

    if-ltz p1, :cond_0

    .line 20
    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    move-object p1, v2

    .line 21
    :goto_0
    const-string/jumbo v0, "t_lr"

    invoke-virtual {v1, v0, p1, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1

    .line 22
    const-string v0, "[Database] deleted %s data %d"

    const-string/jumbo v2, "t_lr"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v2, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    :try_start_2
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz p1, :cond_3

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_6

    .line 24
    :goto_1
    :try_start_3
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 25
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception p1

    goto :goto_4

    .line 26
    :cond_1
    :goto_2
    :try_start_4
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z

    if-eqz p1, :cond_3

    .line 27
    :goto_3
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V

    goto :goto_5

    .line 28
    :goto_4
    sget-boolean v0, Lcom/tencent/bugly/proguard/e4;->c:Z

    if-eqz v0, :cond_2

    .line 29
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 30
    :cond_2
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_3
    :goto_5
    monitor-exit p0

    return-void

    :goto_6
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1
.end method

.method public final declared-synchronized c(Lcom/tencent/bugly/proguard/ab;)Z
    .locals 6

    monitor-enter p0

    const/4 v0, 0x0

    if-nez p1, :cond_0

    monitor-exit p0

    return v0

    :cond_0
    const/4 v1, 0x0

    .line 1
    :try_start_0
    sget-object v2, Lcom/tencent/bugly/proguard/e4;->b:Lcom/tencent/bugly/proguard/f4;

    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/f4;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 2
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/e4;->b(Lcom/tencent/bugly/proguard/ab;)Landroid/content/ContentValues;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 3
    const-string/jumbo v3, "t_pf"

    const-string v4, "_id"

    invoke-virtual {v1, v3, v4, v2}, Landroid/database/sqlite/SQLiteDatabase;->replace(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-ltz v4, :cond_2

    .line 4
    const-string v4, "[Database] insert %s success."

    const-string/jumbo v5, "t_pf"

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 5
    iput-wide v2, p1, Lcom/tencent/bugly/proguard/ab;->a:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    :try_start_1
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z

    if-eqz p1, :cond_1

    .line 7
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    :goto_0
    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :catchall_1
    move-exception p1

    goto :goto_1

    .line 8
    :cond_2
    :try_start_2
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z

    if-eqz p1, :cond_3

    .line 9
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_3
    monitor-exit p0

    return v0

    .line 10
    :cond_4
    :try_start_3
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z

    if-eqz p1, :cond_5

    if-eqz v1, :cond_5

    .line 11
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_5
    monitor-exit p0

    return v0

    .line 12
    :goto_1
    :try_start_4
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 13
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception p1

    goto :goto_3

    .line 14
    :cond_6
    :goto_2
    :try_start_5
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z

    if-eqz p1, :cond_7

    if-eqz v1, :cond_7

    .line 15
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_7
    monitor-exit p0

    return v0

    .line 16
    :goto_3
    :try_start_6
    sget-boolean v0, Lcom/tencent/bugly/proguard/e4;->c:Z

    if-eqz v0, :cond_8

    if-eqz v1, :cond_8

    .line 17
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 18
    :cond_8
    throw p1

    :goto_4
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p1
.end method

.method public declared-synchronized d(Lcom/tencent/bugly/proguard/ab;)Z
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    monitor-exit p0

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    .line 9
    :try_start_0
    sget-object v2, Lcom/tencent/bugly/proguard/e4;->b:Lcom/tencent/bugly/proguard/f4;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/f4;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    if-eqz v1, :cond_4

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/e4;->a(Lcom/tencent/bugly/proguard/ab;)Landroid/content/ContentValues;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    if-eqz v2, :cond_4

    .line 22
    .line 23
    .line 24
    const-string/jumbo v3, "t_lr"

    .line 25
    .line 26
    const-string v4, "_id"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v3, v4, v2}, Landroid/database/sqlite/SQLiteDatabase;->replace(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 30
    move-result-wide v2

    .line 31
    .line 32
    const-wide/16 v4, 0x0

    .line 33
    .line 34
    cmp-long v4, v2, v4

    .line 35
    .line 36
    if-ltz v4, :cond_2

    .line 37
    .line 38
    const-string v4, "[Database] insert %s success."

    .line 39
    .line 40
    .line 41
    const-string/jumbo v5, "t_lr"

    .line 42
    .line 43
    .line 44
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 45
    move-result-object v5

    .line 46
    .line 47
    .line 48
    invoke-static {v4, v5}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 49
    .line 50
    iput-wide v2, p1, Lcom/tencent/bugly/proguard/ab;->a:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 51
    .line 52
    :try_start_1
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z

    .line 53
    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    goto :goto_4

    .line 61
    :cond_1
    :goto_0
    monitor-exit p0

    .line 62
    const/4 p1, 0x1

    .line 63
    return p1

    .line 64
    :catchall_1
    move-exception p1

    .line 65
    goto :goto_1

    .line 66
    .line 67
    :cond_2
    :try_start_2
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z

    .line 68
    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 73
    :cond_3
    monitor-exit p0

    .line 74
    return v0

    .line 75
    .line 76
    :cond_4
    :try_start_3
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z

    .line 77
    .line 78
    if-eqz p1, :cond_5

    .line 79
    .line 80
    if-eqz v1, :cond_5

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 84
    :cond_5
    monitor-exit p0

    .line 85
    return v0

    .line 86
    .line 87
    .line 88
    :goto_1
    :try_start_4
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    .line 89
    move-result v2

    .line 90
    .line 91
    if-nez v2, :cond_6

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 95
    goto :goto_2

    .line 96
    :catchall_2
    move-exception p1

    .line 97
    goto :goto_3

    .line 98
    .line 99
    :cond_6
    :goto_2
    :try_start_5
    sget-boolean p1, Lcom/tencent/bugly/proguard/e4;->c:Z

    .line 100
    .line 101
    if-eqz p1, :cond_7

    .line 102
    .line 103
    if-eqz v1, :cond_7

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 107
    :cond_7
    monitor-exit p0

    .line 108
    return v0

    .line 109
    .line 110
    :goto_3
    :try_start_6
    sget-boolean v0, Lcom/tencent/bugly/proguard/e4;->c:Z

    .line 111
    .line 112
    if-eqz v0, :cond_8

    .line 113
    .line 114
    if-eqz v1, :cond_8

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 118
    :cond_8
    throw p1

    .line 119
    :goto_4
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 120
    throw p1
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
