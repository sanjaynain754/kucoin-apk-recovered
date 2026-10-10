.class public Lcom/tencent/bugly/proguard/rh;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final A:I = 0x2

.field public static final B:Ljava/lang/String; = "BUGLY_SYNC_UPLOAD"

.field public static final C:Ljava/lang/String; = "BUGLY_ASYNC_UPLOAD"

.field public static final l:I = 0x1

.field public static final m:I = 0x2

.field public static final n:I = 0x0

.field public static final o:I = 0x1

.field public static final p:I = 0x2

.field public static final q:J = 0x7530L

.field public static final r:Ljava/lang/String; = "security_info"

.field public static final s:J = 0x7530L

.field public static final t:I = 0x1388

.field public static final u:I = 0x80

.field public static final v:J = 0xf731400L

.field public static final w:I = 0x4

.field public static final x:I = 0x22b

.field public static final y:Ljava/lang/String; = "security_info"

.field public static z:Lcom/tencent/bugly/proguard/rh;


# instance fields
.field public final a:Lcom/tencent/bugly/proguard/e4;

.field public final b:Landroid/content/Context;

.field public c:Lcom/tencent/bugly/proguard/qh;

.field public d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public e:J

.field public f:J

.field public g:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ljava/lang/Object;

.field public j:J

.field public k:I


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

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/rh;->d:Ljava/util/Map;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/bugly/proguard/rh;->g:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 18
    .line 19
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 23
    .line 24
    iput-object v0, p0, Lcom/tencent/bugly/proguard/rh;->h:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 25
    .line 26
    new-instance v0, Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    iput-object v0, p0, Lcom/tencent/bugly/proguard/rh;->i:Ljava/lang/Object;

    .line 32
    .line 33
    const-wide/16 v0, 0x0

    .line 34
    .line 35
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/rh;->j:J

    .line 36
    const/4 v0, 0x0

    .line 37
    .line 38
    iput v0, p0, Lcom/tencent/bugly/proguard/rh;->k:I

    .line 39
    .line 40
    iput-object p1, p0, Lcom/tencent/bugly/proguard/rh;->b:Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    iput-object p1, p0, Lcom/tencent/bugly/proguard/rh;->a:Lcom/tencent/bugly/proguard/e4;

    .line 47
    return-void
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

.method public static declared-synchronized a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/rh;
    .locals 2

    const-class v0, Lcom/tencent/bugly/proguard/rh;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/rh;->z:Lcom/tencent/bugly/proguard/rh;

    if-nez v1, :cond_0

    .line 3
    new-instance v1, Lcom/tencent/bugly/proguard/rh;

    invoke-direct {v1, p0}, Lcom/tencent/bugly/proguard/rh;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/tencent/bugly/proguard/rh;->z:Lcom/tencent/bugly/proguard/rh;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 4
    :cond_0
    :goto_0
    sget-object p0, Lcom/tencent/bugly/proguard/rh;->z:Lcom/tencent/bugly/proguard/rh;
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

.method public static synthetic a(Lcom/tencent/bugly/proguard/rh;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/rh;->i:Ljava/lang/Object;

    return-object p0
.end method

.method public static a(Ljava/util/concurrent/LinkedBlockingQueue;Ljava/util/concurrent/LinkedBlockingQueue;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Ljava/lang/Runnable;",
            ">;",
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Ljava/lang/Runnable;",
            ">;I)V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_1

    .line 75
    invoke-virtual {p0}, Ljava/util/concurrent/LinkedBlockingQueue;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    if-nez v1, :cond_0

    goto :goto_2

    .line 76
    :cond_0
    :try_start_0
    invoke-virtual {p1, v1}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V

    .line 77
    invoke-virtual {p0}, Ljava/util/concurrent/LinkedBlockingQueue;->poll()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    .line 78
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    .line 79
    const-string v2, "[UploadManager] Failed to add upload task to temp urgent queue: %s"

    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_2
    return-void
.end method

.method public static synthetic b(Lcom/tencent/bugly/proguard/rh;)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/tencent/bugly/proguard/rh;->k:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/tencent/bugly/proguard/rh;->k:I

    return v0
.end method

.method public static declared-synchronized d()Lcom/tencent/bugly/proguard/rh;
    .locals 2

    .line 1
    .line 2
    const-class v0, Lcom/tencent/bugly/proguard/rh;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/rh;->z:Lcom/tencent/bugly/proguard/rh;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    throw v1
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public a(Z)J
    .locals 9

    .line 23
    invoke-static {}, Lcom/tencent/bugly/proguard/bi;->b()J

    move-result-wide v0

    const/4 v2, 0x3

    if-eqz p1, :cond_0

    const/4 v3, 0x5

    goto :goto_0

    :cond_0
    move v3, v2

    .line 24
    :goto_0
    iget-object v4, p0, Lcom/tencent/bugly/proguard/rh;->a:Lcom/tencent/bugly/proguard/e4;

    invoke-virtual {v4, v3}, Lcom/tencent/bugly/proguard/e4;->a(I)Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 25
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_3

    const/4 p1, 0x0

    const-wide/16 v5, 0x0

    .line 26
    :try_start_0
    invoke-interface {v4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/bugly/proguard/ab;

    .line 27
    iget-wide v7, p1, Lcom/tencent/bugly/proguard/ab;->e:J

    cmp-long v0, v7, v0

    if-ltz v0, :cond_2

    .line 28
    iget-object v0, p1, Lcom/tencent/bugly/proguard/ab;->g:[B

    invoke-static {v0}, Lcom/tencent/bugly/proguard/bi;->b([B)J

    move-result-wide v5

    if-ne v3, v2, :cond_1

    .line 29
    iput-wide v5, p0, Lcom/tencent/bugly/proguard/rh;->e:J

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 30
    :cond_1
    iput-wide v5, p0, Lcom/tencent/bugly/proguard/rh;->f:J

    .line 31
    :goto_1
    invoke-interface {v4, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    .line 32
    :goto_2
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    .line 33
    :cond_2
    :goto_3
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_5

    .line 34
    iget-object p1, p0, Lcom/tencent/bugly/proguard/rh;->a:Lcom/tencent/bugly/proguard/e4;

    invoke-virtual {p1, v4}, Lcom/tencent/bugly/proguard/e4;->a(Ljava/util/List;)V

    goto :goto_4

    :cond_3
    if-eqz p1, :cond_4

    .line 35
    iget-wide v5, p0, Lcom/tencent/bugly/proguard/rh;->f:J

    goto :goto_4

    :cond_4
    iget-wide v5, p0, Lcom/tencent/bugly/proguard/rh;->e:J

    :cond_5
    :goto_4
    const-wide/16 v0, 0x400

    .line 36
    div-long v0, v5, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "[UploadManager] Local network consume: %d KB"

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-wide v5
.end method

.method public a()V
    .locals 3

    .line 37
    iget-object v0, p0, Lcom/tencent/bugly/proguard/rh;->a:Lcom/tencent/bugly/proguard/e4;

    const/4 v1, 0x5

    .line 38
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/e4;->a(I)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 39
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v1, 0x0

    .line 40
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/rh;->f:J

    .line 41
    iget-object v1, p0, Lcom/tencent/bugly/proguard/rh;->a:Lcom/tencent/bugly/proguard/e4;

    invoke-virtual {v1, v0}, Lcom/tencent/bugly/proguard/e4;->a(Ljava/util/List;)V

    const/4 v0, 0x0

    .line 42
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "[UploadManager] Clear network consume of stuck."

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public a(II[BLjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/qh;IIZLjava/util/Map;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II[B",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/proguard/qh;",
            "IIZ",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 10
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/proguard/sh;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/rh;->b:Landroid/content/Context;

    const/4 v8, 0x1

    const/4 v11, 0x0

    move v2, p1

    move v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move-object/from16 v12, p10

    invoke-direct/range {v0 .. v12}, Lcom/tencent/bugly/proguard/sh;-><init>(Landroid/content/Context;II[BLjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/qh;ZIIZLjava/util/Map;)V

    move-object p2, v0

    const/4 p1, 0x0

    const-wide/16 v0, 0x0

    move/from16 p4, p1

    move/from16 p3, p9

    move-wide/from16 p5, v0

    move-object p1, p0

    .line 11
    invoke-virtual/range {p1 .. p6}, Lcom/tencent/bugly/proguard/rh;->a(Ljava/lang/Runnable;ZZJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    .line 12
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 13
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    return-void
.end method

.method public a(II[BLjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/qh;JZ)V
    .locals 10

    .line 5
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/proguard/sh;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/rh;->b:Landroid/content/Context;

    const/4 v8, 0x1

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/tencent/bugly/proguard/sh;-><init>(Landroid/content/Context;II[BLjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/qh;ZZ)V

    move-object p2, v0

    const/4 p3, 0x1

    const/4 p4, 0x1

    move-object p1, p0

    move-wide/from16 p5, p7

    .line 6
    invoke-virtual/range {p1 .. p6}, Lcom/tencent/bugly/proguard/rh;->a(Ljava/lang/Runnable;ZZJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    .line 7
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 8
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    return-void
.end method

.method public a(II[BLjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/qh;ZLjava/util/Map;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II[B",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/proguard/qh;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v9, p7

    move-object/from16 v10, p8

    .line 14
    invoke-virtual/range {v0 .. v10}, Lcom/tencent/bugly/proguard/rh;->a(II[BLjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/qh;IIZLjava/util/Map;)V

    return-void
.end method

.method public declared-synchronized a(IJ)V
    .locals 3

    monitor-enter p0

    if-ltz p1, :cond_0

    .line 54
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/rh;->d:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    new-instance v0, Lcom/tencent/bugly/proguard/ab;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/ab;-><init>()V

    .line 56
    iput p1, v0, Lcom/tencent/bugly/proguard/ab;->b:I

    .line 57
    iput-wide p2, v0, Lcom/tencent/bugly/proguard/ab;->e:J

    .line 58
    const-string v1, ""

    iput-object v1, v0, Lcom/tencent/bugly/proguard/ab;->c:Ljava/lang/String;

    .line 59
    const-string v1, ""

    iput-object v1, v0, Lcom/tencent/bugly/proguard/ab;->d:Ljava/lang/String;

    const/4 v1, 0x0

    .line 60
    new-array v1, v1, [B

    iput-object v1, v0, Lcom/tencent/bugly/proguard/ab;->g:[B

    .line 61
    iget-object v1, p0, Lcom/tencent/bugly/proguard/rh;->a:Lcom/tencent/bugly/proguard/e4;

    invoke-virtual {v1, p1}, Lcom/tencent/bugly/proguard/e4;->c(I)V

    .line 62
    iget-object v1, p0, Lcom/tencent/bugly/proguard/rh;->a:Lcom/tencent/bugly/proguard/e4;

    invoke-virtual {v1, v0}, Lcom/tencent/bugly/proguard/e4;->d(Lcom/tencent/bugly/proguard/ab;)Z

    .line 63
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 64
    invoke-static {p2, p3}, Lcom/tencent/bugly/proguard/bi;->a(J)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    .line 65
    const-string p2, "[UploadManager] Uploading(ID:%d) time: %s"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 66
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "[UploadManager] Unknown uploading ID: %d"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public a(ILcom/tencent/bugly/proguard/tf;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/qh;JZ)V
    .locals 10

    .line 9
    iget v2, p2, Lcom/tencent/bugly/proguard/tf;->w:I

    invoke-static {p2}, Lcom/tencent/bugly/proguard/ue;->a(Ljava/lang/Object;)[B

    move-result-object v3

    move-object v0, p0

    move v1, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-wide/from16 v7, p6

    move/from16 v9, p8

    invoke-virtual/range {v0 .. v9}, Lcom/tencent/bugly/proguard/rh;->a(II[BLjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/qh;JZ)V

    return-void
.end method

.method public a(ILcom/tencent/bugly/proguard/tf;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/qh;Z)V
    .locals 11

    .line 22
    iget v2, p2, Lcom/tencent/bugly/proguard/tf;->w:I

    invoke-static {p2}, Lcom/tencent/bugly/proguard/ue;->a(Ljava/lang/Object;)[B

    move-result-object v3

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move v1, p1

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move/from16 v9, p6

    invoke-virtual/range {v0 .. v10}, Lcom/tencent/bugly/proguard/rh;->a(II[BLjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/qh;IIZLjava/util/Map;)V

    return-void
.end method

.method public final a(ILjava/util/concurrent/LinkedBlockingQueue;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Ljava/lang/Runnable;",
            ">;)V"
        }
    .end annotation

    if-lez p1, :cond_0

    .line 80
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    .line 81
    const-string v1, "[UploadManager] Execute upload tasks of queue which has %d tasks (pid=%d | tid=%d)"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 82
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 83
    new-instance v1, Lcom/tencent/bugly/proguard/rh$b;

    invoke-direct {v1, p0, p1, p2}, Lcom/tencent/bugly/proguard/rh$b;-><init>(Lcom/tencent/bugly/proguard/rh;ILjava/util/concurrent/LinkedBlockingQueue;)V

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method public a(I[BLjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/qh;ZZ)V
    .locals 11

    if-eqz p7, :cond_0

    .line 15
    :try_start_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 16
    const-string v1, "Content-Encoding"

    const-string v2, "encrypt"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    const-string v1, "X-ENCRYPTION-VERSION"

    const-string/jumbo v2, "v3"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    move-object v9, v0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 18
    :goto_1
    new-instance v1, Lcom/tencent/bugly/proguard/ai;

    iget-object v2, p0, Lcom/tencent/bugly/proguard/rh;->b:Landroid/content/Context;

    const/16 v4, 0x348

    move v3, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    move-object/from16 v8, p5

    move/from16 v10, p7

    invoke-direct/range {v1 .. v10}, Lcom/tencent/bugly/proguard/ai;-><init>(Landroid/content/Context;II[BLjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/qh;Ljava/util/Map;Z)V

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move/from16 v3, p6

    move-object v2, v1

    move-object v1, p0

    .line 19
    invoke-virtual/range {v1 .. v6}, Lcom/tencent/bugly/proguard/rh;->a(Ljava/lang/Runnable;ZZJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 20
    :goto_2
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    return-void
.end method

.method public declared-synchronized a(JZ)V
    .locals 4

    monitor-enter p0

    if-eqz p3, :cond_0

    const/4 v0, 0x5

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    .line 43
    :goto_0
    :try_start_0
    new-instance v1, Lcom/tencent/bugly/proguard/ab;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/ab;-><init>()V

    .line 44
    iput v0, v1, Lcom/tencent/bugly/proguard/ab;->b:I

    .line 45
    invoke-static {}, Lcom/tencent/bugly/proguard/bi;->b()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/tencent/bugly/proguard/ab;->e:J

    .line 46
    const-string v2, ""

    iput-object v2, v1, Lcom/tencent/bugly/proguard/ab;->c:Ljava/lang/String;

    .line 47
    const-string v2, ""

    iput-object v2, v1, Lcom/tencent/bugly/proguard/ab;->d:Ljava/lang/String;

    .line 48
    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/bi;->b(J)[B

    move-result-object v2

    iput-object v2, v1, Lcom/tencent/bugly/proguard/ab;->g:[B

    .line 49
    iget-object v2, p0, Lcom/tencent/bugly/proguard/rh;->a:Lcom/tencent/bugly/proguard/e4;

    invoke-virtual {v2, v0}, Lcom/tencent/bugly/proguard/e4;->c(I)V

    .line 50
    iget-object v0, p0, Lcom/tencent/bugly/proguard/rh;->a:Lcom/tencent/bugly/proguard/e4;

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/e4;->d(Lcom/tencent/bugly/proguard/ab;)Z

    if-eqz p3, :cond_1

    .line 51
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/rh;->f:J

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 52
    :cond_1
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/rh;->e:J

    :goto_1
    const-wide/16 v0, 0x400

    .line 53
    div-long/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "[UploadManager] Network total consume: %d KB"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final a(Ljava/lang/Runnable;J)V
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 93
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "[UploadManager] Upload task should not be null"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 94
    :cond_0
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    .line 95
    const-string v2, "[UploadManager] Execute synchronized upload task (pid=%d | tid=%d)"

    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 96
    const-string v1, "BUGLY_SYNC_UPLOAD"

    invoke-static {p1, v1}, Lcom/tencent/bugly/proguard/bi;->a(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Thread;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    .line 97
    new-array p2, v0, [Ljava/lang/Object;

    .line 98
    sget-object p3, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string v0, "[UploadManager] Failed to start a thread to execute synchronized upload task, add it to queue."

    invoke-static {p3, v0, p2}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 99
    invoke-virtual {p0, p1, v2}, Lcom/tencent/bugly/proguard/rh;->a(Ljava/lang/Runnable;Z)Z

    return-void

    .line 100
    :cond_1
    :try_start_0
    invoke-virtual {v1, p2, p3}, Ljava/lang/Thread;->join(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p2

    .line 101
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    .line 102
    sget-object p3, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string v1, "[UploadManager] Failed to join upload synchronized task with message: %s. Add it to queue."

    invoke-static {p3, v1, p2}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 103
    invoke-virtual {p0, p1, v2}, Lcom/tencent/bugly/proguard/rh;->a(Ljava/lang/Runnable;Z)Z

    .line 104
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/rh;->b(I)V

    return-void
.end method

.method public a(Ljava/lang/Runnable;ZZJ)V
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 105
    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "[UploadManager] Upload task should not be null"

    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 106
    :cond_0
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 107
    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    .line 108
    const-string v2, "[UploadManager] Add upload task (pid=%d | tid=%d)"

    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    if-eqz p3, :cond_1

    .line 109
    invoke-virtual {p0, p1, p4, p5}, Lcom/tencent/bugly/proguard/rh;->a(Ljava/lang/Runnable;J)V

    return-void

    .line 110
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/rh;->a(Ljava/lang/Runnable;Z)Z

    .line 111
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/rh;->b(I)V

    return-void
.end method

.method public a(I)Z
    .locals 7

    .line 67
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->i:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 68
    new-array p1, v2, [Ljava/lang/Object;

    const-string v0, "Uploading frequency will not be checked if SDK is in debug mode."

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v1

    .line 69
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/rh;->c(I)J

    move-result-wide v5

    sub-long/2addr v3, v5

    const-wide/16 v5, 0x3e8

    .line 70
    div-long v5, v3, v5

    .line 71
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 72
    const-string v0, "[UploadManager] Time interval is %d seconds since last uploading(ID: %d)."

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    const-wide/16 v5, 0x7530

    cmp-long p1, v3, v5

    if-gez p1, :cond_1

    const-wide/16 v0, 0x1e

    .line 73
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 74
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string v1, "[UploadManager] Data only be uploaded once in %d seconds."

    invoke-static {v0, v1, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return v2

    :cond_1
    return v1
.end method

.method public final a(Ljava/lang/Runnable;Z)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 84
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "[UploadManager] Upload task should not be null"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v0

    .line 85
    :cond_0
    :try_start_0
    const-string v1, "[UploadManager] Add upload task to queue (pid=%d | tid=%d)"

    .line 86
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    .line 87
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 88
    iget-object v1, p0, Lcom/tencent/bugly/proguard/rh;->i:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p2, :cond_1

    .line 89
    :try_start_1
    iget-object p2, p0, Lcom/tencent/bugly/proguard/rh;->g:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 90
    :cond_1
    iget-object p2, p0, Lcom/tencent/bugly/proguard/rh;->h:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V

    .line 91
    :goto_0
    monitor-exit v1

    const/4 p1, 0x1

    return p1

    :goto_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    .line 92
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "[UploadManager] Failed to add upload task to queue: %s"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v0
.end method

.method public b()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/rh;->a:Lcom/tencent/bugly/proguard/e4;

    const/4 v1, 0x3

    .line 3
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/e4;->a(I)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v1, 0x0

    .line 5
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/rh;->e:J

    .line 6
    iget-object v1, p0, Lcom/tencent/bugly/proguard/rh;->a:Lcom/tencent/bugly/proguard/e4;

    invoke-virtual {v1, v0}, Lcom/tencent/bugly/proguard/e4;->a(Ljava/util/List;)V

    const/4 v0, 0x0

    .line 7
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "[UploadManager] Clear network consume."

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public final b(I)V
    .locals 8

    const/4 v0, 0x0

    if-gez p1, :cond_0

    .line 8
    new-array p1, v0, [Ljava/lang/Object;

    const-string v0, "[UploadManager] Number of task to execute should >= 0"

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 9
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object v1

    .line 10
    new-instance v2, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v2}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 11
    new-instance v3, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v3}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 12
    iget-object v4, p0, Lcom/tencent/bugly/proguard/rh;->i:Ljava/lang/Object;

    monitor-enter v4

    .line 13
    :try_start_0
    const-string v5, "[UploadManager] Try to poll all upload task need and put them into temp queue (pid=%d | tid=%d)"

    .line 14
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v6, v7}, [Ljava/lang/Object;

    move-result-object v6

    .line 15
    invoke-static {v5, v6}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 16
    iget-object v5, p0, Lcom/tencent/bugly/proguard/rh;->g:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v5}, Ljava/util/concurrent/LinkedBlockingQueue;->size()I

    move-result v5

    .line 17
    iget-object v6, p0, Lcom/tencent/bugly/proguard/rh;->h:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v6}, Ljava/util/concurrent/LinkedBlockingQueue;->size()I

    move-result v6

    if-nez v5, :cond_1

    if-nez v6, :cond_1

    .line 18
    const-string p1, "[UploadManager] There is no upload task in queue."

    new-array v0, v0, [Ljava/lang/Object;

    .line 19
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v1, p1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 20
    monitor-exit v4

    return-void

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    if-ge p1, v5, :cond_3

    move v6, v0

    goto :goto_1

    :cond_3
    add-int v7, v5, v6

    if-ge p1, v7, :cond_4

    sub-int v6, p1, v5

    :cond_4
    :goto_0
    move p1, v5

    :goto_1
    if-eqz v1, :cond_6

    .line 21
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/m0;->d()Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    move v0, v6

    .line 22
    :cond_6
    :goto_2
    iget-object v1, p0, Lcom/tencent/bugly/proguard/rh;->g:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-static {v1, v2, p1}, Lcom/tencent/bugly/proguard/rh;->a(Ljava/util/concurrent/LinkedBlockingQueue;Ljava/util/concurrent/LinkedBlockingQueue;I)V

    .line 23
    iget-object v1, p0, Lcom/tencent/bugly/proguard/rh;->h:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-static {v1, v3, v0}, Lcom/tencent/bugly/proguard/rh;->a(Ljava/util/concurrent/LinkedBlockingQueue;Ljava/util/concurrent/LinkedBlockingQueue;I)V

    .line 24
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    invoke-virtual {p0, p1, v2}, Lcom/tencent/bugly/proguard/rh;->b(ILjava/util/concurrent/LinkedBlockingQueue;)V

    .line 26
    invoke-virtual {p0, v0, v3}, Lcom/tencent/bugly/proguard/rh;->a(ILjava/util/concurrent/LinkedBlockingQueue;)V

    return-void

    .line 27
    :goto_3
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final b(ILjava/util/concurrent/LinkedBlockingQueue;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Ljava/lang/Runnable;",
            ">;)V"
        }
    .end annotation

    .line 28
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object v0

    if-lez p1, :cond_0

    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v1

    .line 30
    const-string v2, "[UploadManager] Execute urgent upload tasks of queue which has %d tasks (pid=%d | tid=%d)"

    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    :cond_0
    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, p1, :cond_4

    .line 31
    invoke-virtual {p2}, Ljava/util/concurrent/LinkedBlockingQueue;->poll()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Runnable;

    if-nez v3, :cond_1

    goto :goto_3

    .line 32
    :cond_1
    iget-object v4, p0, Lcom/tencent/bugly/proguard/rh;->i:Ljava/lang/Object;

    monitor-enter v4

    .line 33
    :try_start_0
    iget v5, p0, Lcom/tencent/bugly/proguard/rh;->k:I

    const/4 v6, 0x2

    if-lt v5, v6, :cond_2

    if-eqz v0, :cond_2

    .line 34
    invoke-virtual {v0, v3}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;)Z

    .line 35
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 36
    :cond_2
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    const-string v4, "BUGLY_ASYNC_UPLOAD"

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const-string v5, "[UploadManager] Create and start a new thread to execute a upload task: %s"

    invoke-static {v5, v4}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 38
    new-instance v4, Lcom/tencent/bugly/proguard/rh$a;

    invoke-direct {v4, p0, v3}, Lcom/tencent/bugly/proguard/rh$a;-><init>(Lcom/tencent/bugly/proguard/rh;Ljava/lang/Runnable;)V

    const-string v5, "BUGLY_ASYNC_UPLOAD"

    invoke-static {v4, v5}, Lcom/tencent/bugly/proguard/bi;->a(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Thread;

    move-result-object v4

    const/4 v5, 0x1

    if-eqz v4, :cond_3

    .line 39
    iget-object v4, p0, Lcom/tencent/bugly/proguard/rh;->i:Ljava/lang/Object;

    monitor-enter v4

    .line 40
    :try_start_1
    iget v3, p0, Lcom/tencent/bugly/proguard/rh;->k:I

    add-int/2addr v3, v5

    iput v3, p0, Lcom/tencent/bugly/proguard/rh;->k:I

    .line 41
    monitor-exit v4

    goto :goto_1

    :catchall_1
    move-exception p1

    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p1

    .line 42
    :cond_3
    const-string v4, "[UploadManager] Failed to start a thread to execute asynchronous upload task,will try again next time."

    new-array v6, v1, [Ljava/lang/Object;

    .line 43
    sget-object v7, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v7, v4, v6}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 44
    invoke-virtual {p0, v3, v5}, Lcom/tencent/bugly/proguard/rh;->a(Ljava/lang/Runnable;Z)Z

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 45
    :goto_2
    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_4
    :goto_3
    return-void
.end method

.method public declared-synchronized c(I)J
    .locals 2

    monitor-enter p0

    if-ltz p1, :cond_0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/rh;->d:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_1

    .line 2
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 3
    :cond_0
    :try_start_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "[UploadManager] Unknown upload ID: %d"

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    monitor-exit p0

    const-wide/16 v0, 0x0

    return-wide v0

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final c()Z
    .locals 6

    .line 4
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    .line 5
    const-string v1, "[UploadManager] Drop security info of database (pid=%d | tid=%d)"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    const/4 v0, 0x0

    .line 6
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    move-result-object v1

    if-nez v1, :cond_0

    .line 7
    const-string v1, "[UploadManager] Failed to get Database"

    new-array v2, v0, [Ljava/lang/Object;

    .line 8
    sget-object v3, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v3, v1, v2}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return v0

    :catchall_0
    move-exception v1

    goto :goto_0

    .line 9
    :cond_0
    const-string/jumbo v2, "security_info"

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/16 v5, 0x22b

    invoke-virtual {v1, v5, v2, v3, v4}, Lcom/tencent/bugly/proguard/e4;->a(ILjava/lang/String;Lcom/tencent/bugly/proguard/d4;Z)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    .line 10
    :goto_0
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/Throwable;)Z

    return v0
.end method
