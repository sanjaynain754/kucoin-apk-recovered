.class public Lcom/tencent/bugly/proguard/q3;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static e:Lcom/tencent/bugly/proguard/q3; = null

.field public static final f:Ljava/lang/String; = "crashrecord"

.field public static final g:I = 0x2

.field public static final h:I = 0x5265c00

.field public static final i:I = 0x5265c00

.field public static final j:J


# instance fields
.field public a:Landroid/content/Context;

.field public b:Ljava/lang/String;

.field public c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/proguard/p3;",
            ">;>;"
        }
    .end annotation
.end field

.field public d:Landroid/content/SharedPreferences;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    sput-wide v0, Lcom/tencent/bugly/proguard/q3;->j:J

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

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tencent/bugly/proguard/q3;->a:Landroid/content/Context;

    .line 6
    .line 7
    new-instance v0, Ljava/util/HashMap;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/tencent/bugly/proguard/q3;->c:Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iget-object v0, v0, Lcom/tencent/bugly/proguard/l2;->f:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/tencent/bugly/proguard/q3;->b:Ljava/lang/String;

    .line 21
    .line 22
    const-string v0, "crashrecord"

    .line 23
    const/4 v1, 0x0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    iput-object p1, p0, Lcom/tencent/bugly/proguard/q3;->d:Landroid/content/SharedPreferences;

    .line 30
    return-void
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
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public static declared-synchronized a()Lcom/tencent/bugly/proguard/q3;
    .locals 2

    const-class v0, Lcom/tencent/bugly/proguard/q3;

    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/q3;->e:Lcom/tencent/bugly/proguard/q3;
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

.method public static declared-synchronized a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/q3;
    .locals 2

    const-class v0, Lcom/tencent/bugly/proguard/q3;

    monitor-enter v0

    .line 5
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/q3;->e:Lcom/tencent/bugly/proguard/q3;

    if-nez v1, :cond_0

    .line 6
    new-instance v1, Lcom/tencent/bugly/proguard/q3;

    invoke-direct {v1, p0}, Lcom/tencent/bugly/proguard/q3;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/tencent/bugly/proguard/q3;->e:Lcom/tencent/bugly/proguard/q3;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 7
    :cond_0
    :goto_0
    sget-object p0, Lcom/tencent/bugly/proguard/q3;->e:Lcom/tencent/bugly/proguard/q3;
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

.method public static synthetic a(Lcom/tencent/bugly/proguard/q3;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/q3;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/q3;I)Ljava/util/List;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/q3;->c(I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/q3;ILjava/util/List;)V
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/q3;->a(ILjava/util/List;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/p3;Lcom/tencent/bugly/proguard/p3;)Z
    .locals 0

    .line 3
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/q3;->c(Lcom/tencent/bugly/proguard/p3;Lcom/tencent/bugly/proguard/p3;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/tencent/bugly/proguard/q3;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/q3;->c:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic b(Lcom/tencent/bugly/proguard/p3;Lcom/tencent/bugly/proguard/p3;)Z
    .locals 0

    .line 2
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/q3;->d(Lcom/tencent/bugly/proguard/p3;Lcom/tencent/bugly/proguard/p3;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/tencent/bugly/proguard/q3;I)Z
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/q3;->b(I)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Lcom/tencent/bugly/proguard/q3;)Landroid/content/SharedPreferences;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/q3;->d:Landroid/content/SharedPreferences;

    return-object p0
.end method

.method public static c(Lcom/tencent/bugly/proguard/p3;Lcom/tencent/bugly/proguard/p3;)Z
    .locals 4

    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/p3;->h:J

    iget-wide v2, p1, Lcom/tencent/bugly/proguard/p3;->h:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object p0, p0, Lcom/tencent/bugly/proguard/p3;->c:Ljava/lang/String;

    if-eqz p0, :cond_0

    iget-object p1, p1, Lcom/tencent/bugly/proguard/p3;->c:Ljava/lang/String;

    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static d(Lcom/tencent/bugly/proguard/p3;Lcom/tencent/bugly/proguard/p3;)Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/p3;->f:Ljava/lang/String;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p1, Lcom/tencent/bugly/proguard/p3;->f:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/p3;->g:Ljava/lang/String;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object p1, p1, Lcom/tencent/bugly/proguard/p3;->g:Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 22
    move-result p1

    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    :cond_1
    iget p0, p0, Lcom/tencent/bugly/proguard/p3;->e:I

    .line 27
    .line 28
    if-gtz p0, :cond_3

    .line 29
    :cond_2
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_3
    const/4 p0, 0x0

    .line 32
    return p0
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method


# virtual methods
.method public a(II)V
    .locals 2

    .line 9
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object v0

    new-instance v1, Lcom/tencent/bugly/proguard/q3$a;

    invoke-direct {v1, p0, p1, p2}, Lcom/tencent/bugly/proguard/q3$a;-><init>(Lcom/tencent/bugly/proguard/q3;II)V

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final declared-synchronized a(ILjava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/util/List<",
            "*>;>(ITT;)V"
        }
    .end annotation

    monitor-enter p0

    if-nez p2, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 10
    :try_start_0
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/tencent/bugly/proguard/q3;->a:Landroid/content/Context;

    const-string v3, "crashrecord"

    invoke-virtual {v2, v3, v0}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ""

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    .line 11
    :try_start_1
    new-instance v2, Ljava/io/ObjectOutputStream;

    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v2, v3}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 12
    :try_start_2
    invoke-virtual {v2, p2}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 13
    :try_start_3
    invoke-virtual {v2}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :catchall_2
    move-exception p2

    move-object v2, p1

    move-object p1, p2

    goto :goto_1

    :catch_1
    move-exception p2

    move-object v2, p1

    move-object p1, p2

    .line 14
    :goto_0
    :try_start_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 15
    const-string/jumbo p1, "open record file error"

    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz v2, :cond_2

    .line 16
    :try_start_5
    invoke-virtual {v2}, Ljava/io/ObjectOutputStream;->close()V

    goto :goto_2

    :goto_1
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/io/ObjectOutputStream;->close()V

    .line 17
    :cond_1
    throw p1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 18
    :catch_2
    :try_start_6
    new-array p1, v0, [Ljava/lang/Object;

    const-string/jumbo p2, "writeCrashRecord error"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :cond_2
    :goto_2
    monitor-exit p0

    return-void

    :goto_3
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw p1
.end method

.method public declared-synchronized a(I)Z
    .locals 4

    monitor-enter p0

    const/4 v0, 0x1

    .line 19
    :try_start_0
    iget-object v1, p0, Lcom/tencent/bugly/proguard/q3;->d:Landroid/content/SharedPreferences;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/tencent/bugly/proguard/q3;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 20
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object v1

    new-instance v2, Lcom/tencent/bugly/proguard/q3$b;

    invoke-direct {v2, p0, p1}, Lcom/tencent/bugly/proguard/q3$b;-><init>(Lcom/tencent/bugly/proguard/q3;I)V

    invoke-virtual {v1, v2}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    .line 21
    :try_start_1
    new-array p1, p1, [Ljava/lang/Object;

    const-string v1, "canInit error"

    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v0

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized b(I)Z
    .locals 12

    monitor-enter p0

    const/4 v0, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/q3;->c(I)Ljava/util/List;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    monitor-exit p0

    return v0

    .line 5
    :cond_0
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 6
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 7
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 8
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const-wide/32 v8, 0x5265c00

    if-eqz v7, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/tencent/bugly/proguard/p3;

    .line 9
    iget-object v10, v7, Lcom/tencent/bugly/proguard/p3;->c:Ljava/lang/String;

    if-eqz v10, :cond_2

    iget-object v11, p0, Lcom/tencent/bugly/proguard/q3;->b:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_2

    iget v10, v7, Lcom/tencent/bugly/proguard/p3;->e:I

    if-lez v10, :cond_2

    .line 10
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 11
    :cond_2
    :goto_1
    iget-wide v10, v7, Lcom/tencent/bugly/proguard/p3;->d:J

    add-long/2addr v10, v8

    cmp-long v8, v10, v2

    if-gez v8, :cond_1

    .line 12
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 13
    :cond_3
    invoke-static {v4}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 14
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v7, 0x2

    if-lt v6, v7, :cond_5

    .line 15
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x1

    if-lez v5, :cond_4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    sub-int/2addr v5, v6

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/tencent/bugly/proguard/p3;

    iget-wide v4, v4, Lcom/tencent/bugly/proguard/p3;->d:J

    add-long/2addr v4, v8

    cmp-long v2, v4, v2

    if-gez v2, :cond_4

    .line 16
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 17
    invoke-virtual {p0, p1, v1}, Lcom/tencent/bugly/proguard/q3;->a(ILjava/util/List;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v0

    :cond_4
    monitor-exit p0

    return v6

    .line 18
    :cond_5
    :try_start_2
    invoke-interface {v1, v5}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 19
    invoke-virtual {p0, p1, v1}, Lcom/tencent/bugly/proguard/q3;->a(ILjava/util/List;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return v0

    .line 20
    :catch_0
    :try_start_3
    new-array p1, v0, [Ljava/lang/Object;

    const-string v1, "isFrequentCrash failed"

    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return v0

    :goto_2
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public final declared-synchronized c(I)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/util/List<",
            "*>;>(I)TT;"
        }
    .end annotation

    monitor-enter p0

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 4
    :try_start_0
    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/tencent/bugly/proguard/q3;->a:Landroid/content/Context;

    const-string v4, "crashrecord"

    invoke-virtual {v3, v4, v1}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ""

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v3, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 5
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    monitor-exit p0

    return-object v0

    .line 6
    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/ObjectInputStream;

    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {p1, v3}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 7
    :try_start_2
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 8
    :try_start_3
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-object v2

    :catchall_0
    move-exception p1

    goto :goto_3

    :catchall_1
    move-exception v2

    goto :goto_1

    :catchall_2
    move-exception p1

    move-object v2, p1

    move-object p1, v0

    goto :goto_1

    :catch_0
    move-object p1, v0

    .line 9
    :catch_1
    :try_start_4
    const-string v2, "get object error"

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    if-eqz p1, :cond_2

    goto :goto_0

    :catch_2
    move-object p1, v0

    .line 10
    :catch_3
    const-string/jumbo v2, "open record file error"

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz p1, :cond_2

    .line 11
    :goto_0
    :try_start_5
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->close()V

    goto :goto_2

    :goto_1
    if-eqz p1, :cond_1

    .line 12
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->close()V

    .line 13
    :cond_1
    throw v2
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 14
    :catch_4
    :try_start_6
    new-array p1, v1, [Ljava/lang/Object;

    const-string/jumbo v1, "readCrashRecord error"

    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :cond_2
    :goto_2
    monitor-exit p0

    return-object v0

    :goto_3
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw p1
.end method
