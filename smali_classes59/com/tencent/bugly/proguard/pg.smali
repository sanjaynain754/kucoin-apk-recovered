.class public Lcom/tencent/bugly/proguard/pg;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static f:I = 0x3e8

.field public static g:Lcom/tencent/bugly/proguard/pg; = null

.field public static final h:Ljava/lang/String; = "gateway"

.field public static final i:Ljava/lang/String; = "device"

.field public static final j:J = 0x200000L

.field public static final k:J = 0x200000L

.field public static l:J = 0xf731400L

.field public static final m:I = 0x32

.field public static final n:I = 0x32

.field public static final o:I = 0xc8

.field public static final p:I = 0x64

.field public static final q:I = 0x1f4

.field public static r:Ljava/lang/String;


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/c1;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/tencent/bugly/proguard/m0;

.field public final c:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

.field public d:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

.field public e:Landroid/content/Context;


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
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/bugly/proguard/pg;->d:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 7
    .line 8
    iput-object p1, p0, Lcom/tencent/bugly/proguard/pg;->e:Landroid/content/Context;

    .line 9
    .line 10
    new-instance p1, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 11
    .line 12
    .line 13
    invoke-direct {p1}, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;-><init>()V

    .line 14
    .line 15
    iput-object p1, p0, Lcom/tencent/bugly/proguard/pg;->c:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 16
    .line 17
    iput-object p2, p0, Lcom/tencent/bugly/proguard/pg;->a:Ljava/util/List;

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    iput-object p1, p0, Lcom/tencent/bugly/proguard/pg;->b:Lcom/tencent/bugly/proguard/m0;

    .line 24
    return-void
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

.method public static synthetic a(Lcom/tencent/bugly/proguard/pg;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/pg;->e:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/pg;Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;)Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/pg;->d:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    return-object p1
.end method

.method public static declared-synchronized a(Landroid/content/Context;Ljava/util/List;)Lcom/tencent/bugly/proguard/pg;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/c1;",
            ">;)",
            "Lcom/tencent/bugly/proguard/pg;"
        }
    .end annotation

    const-class v0, Lcom/tencent/bugly/proguard/pg;

    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/pg;->g:Lcom/tencent/bugly/proguard/pg;

    if-nez v1, :cond_0

    .line 5
    new-instance v1, Lcom/tencent/bugly/proguard/pg;

    invoke-direct {v1, p0, p1}, Lcom/tencent/bugly/proguard/pg;-><init>(Landroid/content/Context;Ljava/util/List;)V

    sput-object v1, Lcom/tencent/bugly/proguard/pg;->g:Lcom/tencent/bugly/proguard/pg;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 6
    :cond_0
    :goto_0
    sget-object p0, Lcom/tencent/bugly/proguard/pg;->g:Lcom/tencent/bugly/proguard/pg;
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

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 3
    sget-object v0, Lcom/tencent/bugly/proguard/pg;->r:Ljava/lang/String;

    return-object v0
.end method

.method public static a(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;Lcom/tencent/bugly/proguard/bg;)V
    .locals 1

    .line 54
    iget-object v0, p1, Lcom/tencent/bugly/proguard/bg;->v:Lcom/tencent/bugly/proguard/ag;

    if-eqz v0, :cond_0

    .line 55
    iget-object v0, v0, Lcom/tencent/bugly/proguard/ag;->q:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 56
    iget-object p1, p1, Lcom/tencent/bugly/proguard/bg;->v:Lcom/tencent/bugly/proguard/ag;

    iget-object p1, p1, Lcom/tencent/bugly/proguard/ag;->q:Ljava/lang/String;

    iput-object p1, p0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->q:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    .line 16
    invoke-static {p0}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lcom/tencent/bugly/proguard/bi;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 17
    :cond_0
    sput-object p0, Lcom/tencent/bugly/proguard/pg;->r:Ljava/lang/String;

    return-void

    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 18
    new-array p0, p0, [Ljava/lang/Object;

    const-string v0, "URL user set is invalid."

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic b(Lcom/tencent/bugly/proguard/pg;)Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/pg;->d:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    return-object p0
.end method

.method public static declared-synchronized b()Lcom/tencent/bugly/proguard/pg;
    .locals 2

    const-class v0, Lcom/tencent/bugly/proguard/pg;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/pg;->g:Lcom/tencent/bugly/proguard/pg;
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

.method public static b(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;Lcom/tencent/bugly/proguard/bg;)V
    .locals 2

    .line 3
    sget-object v0, Lcom/tencent/bugly/proguard/pg;->r:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/tencent/bugly/proguard/pg;->r:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/bi;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 4
    :cond_0
    iget-object v0, p1, Lcom/tencent/bugly/proguard/bg;->t:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/bi;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p1, Lcom/tencent/bugly/proguard/bg;->t:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "[Strategy] Upload url changes to %s"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 6
    iget-object v0, p1, Lcom/tencent/bugly/proguard/bg;->t:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->o:Ljava/lang/String;

    .line 7
    :cond_1
    iget-object v0, p1, Lcom/tencent/bugly/proguard/bg;->u:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/bi;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    iget-object v0, p1, Lcom/tencent/bugly/proguard/bg;->u:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "[Strategy] Exception upload url changes to %s"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 9
    iget-object p1, p1, Lcom/tencent/bugly/proguard/bg;->u:Ljava/lang/String;

    iput-object p1, p0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->p:Ljava/lang/String;

    :cond_2
    return-void
.end method

.method public static c(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;Lcom/tencent/bugly/proguard/bg;)V
    .locals 6

    if-eqz p0, :cond_6

    if-nez p1, :cond_0

    goto/16 :goto_2

    .line 12
    :cond_0
    iget-object v0, p1, Lcom/tencent/bugly/proguard/bg;->w:Ljava/util/Map;

    if-eqz v0, :cond_6

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-gtz v0, :cond_1

    goto/16 :goto_2

    .line 13
    :cond_1
    iget-object v0, p1, Lcom/tencent/bugly/proguard/bg;->w:Ljava/util/Map;

    iput-object v0, p0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->r:Ljava/util/Map;

    .line 14
    const-string v1, "B11"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v3, "1"

    if-eqz v0, :cond_2

    .line 15
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->g:Z

    .line 16
    iget-object v0, p1, Lcom/tencent/bugly/proguard/bg;->w:Ljava/util/Map;

    const-string v4, "B3"

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 17
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    iput-wide v4, p0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->u:J

    .line 18
    :cond_3
    iget v0, p1, Lcom/tencent/bugly/proguard/bg;->B:I

    int-to-long v4, v0

    iput-wide v4, p0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->n:J

    .line 19
    iput-wide v4, p0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->t:J

    .line 20
    iget-object v0, p1, Lcom/tencent/bugly/proguard/bg;->w:Ljava/util/Map;

    .line 21
    const-string v4, "B27"

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 22
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_4

    .line 23
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_4

    .line 24
    iput v0, p0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->s:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 25
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v4

    if-nez v4, :cond_4

    .line 26
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 27
    :cond_4
    :goto_1
    iget-object p1, p1, Lcom/tencent/bugly/proguard/bg;->w:Ljava/util/Map;

    const-string v0, "B25"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_5

    .line 28
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    move v1, v2

    :cond_5
    iput-boolean v1, p0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->i:Z

    :cond_6
    :goto_2
    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 2

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pg;->b:Lcom/tencent/bugly/proguard/m0;

    new-instance v1, Lcom/tencent/bugly/proguard/pg$a;

    invoke-direct {v1, p0}, Lcom/tencent/bugly/proguard/pg$a;-><init>(Lcom/tencent/bugly/proguard/pg;)V

    invoke-virtual {v0, v1, p1, p2}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public a(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;Z)V
    .locals 4

    .line 8
    const-class v0, Lcom/tencent/bugly/proguard/sa;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "[Strategy] Notify %s"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 9
    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/sa;->a(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;Z)V

    .line 10
    iget-object p2, p0, Lcom/tencent/bugly/proguard/pg;->a:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/proguard/c1;

    .line 11
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    .line 12
    sget-object v3, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v3, v1, v2}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 13
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/c1;->a(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 14
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/Throwable;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/bg;)V
    .locals 13

    if-nez p1, :cond_0

    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pg;->d:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    if-eqz v0, :cond_1

    iget-wide v1, p1, Lcom/tencent/bugly/proguard/bg;->x:J

    iget-wide v3, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->m:J

    cmp-long v0, v1, v3

    if-nez v0, :cond_1

    :goto_0
    return-void

    .line 20
    :cond_1
    new-instance v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    invoke-direct {v0}, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;-><init>()V

    .line 21
    iget-boolean v1, p1, Lcom/tencent/bugly/proguard/bg;->q:Z

    iput-boolean v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->d:Z

    .line 22
    iget-boolean v1, p1, Lcom/tencent/bugly/proguard/bg;->s:Z

    iput-boolean v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->f:Z

    .line 23
    iget-boolean v1, p1, Lcom/tencent/bugly/proguard/bg;->r:Z

    iput-boolean v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->e:Z

    .line 24
    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/pg;->b(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;Lcom/tencent/bugly/proguard/bg;)V

    .line 25
    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/pg;->a(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;Lcom/tencent/bugly/proguard/bg;)V

    .line 26
    iget-wide v1, p1, Lcom/tencent/bugly/proguard/bg;->x:J

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-eqz v3, :cond_2

    .line 27
    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->m:J

    .line 28
    :cond_2
    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/pg;->c(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;Lcom/tencent/bugly/proguard/bg;)V

    .line 29
    iget-boolean v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->d:Z

    .line 30
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget-boolean v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->f:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iget-boolean v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iget-boolean v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->g:Z

    .line 31
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    iget-boolean v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->h:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    iget-boolean v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->k:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    iget-boolean v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->l:Z

    .line 32
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    iget-wide v9, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->n:J

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    iget-boolean v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->i:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    iget-wide v11, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->m:J

    .line 33
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    filled-new-array/range {v2 .. v11}, [Ljava/lang/Object;

    move-result-object v1

    .line 34
    const-string v2, "[Strategy] enableCrashReport:%b, enableQuery:%b, enableUserInfo:%b, enableAnr:%b, enableBlock:%b, enableSession:%b, enableSessionTimer:%b, sessionOverTime:%d, enableCocos:%b, strategyLastUpdateTime:%d"

    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 35
    iput-object v0, p0, Lcom/tencent/bugly/proguard/pg;->d:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 36
    iget-object v1, p1, Lcom/tencent/bugly/proguard/bg;->t:Ljava/lang/String;

    invoke-static {v1}, Lcom/tencent/bugly/proguard/bi;->e(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_3

    .line 37
    const-string v1, "[Strategy] download url is null"

    new-array v3, v2, [Ljava/lang/Object;

    .line 38
    sget-object v4, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v4, v1, v3}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 39
    iget-object v1, p0, Lcom/tencent/bugly/proguard/pg;->d:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    const-string v3, ""

    iput-object v3, v1, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->o:Ljava/lang/String;

    .line 40
    :cond_3
    iget-object p1, p1, Lcom/tencent/bugly/proguard/bg;->u:Ljava/lang/String;

    invoke-static {p1}, Lcom/tencent/bugly/proguard/bi;->e(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 41
    const-string p1, "[Strategy] download crashurl is null"

    new-array v1, v2, [Ljava/lang/Object;

    .line 42
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v2, p1, v1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 43
    iget-object p1, p0, Lcom/tencent/bugly/proguard/pg;->d:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    const-string v1, ""

    iput-object v1, p1, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->p:Ljava/lang/String;

    .line 44
    :cond_4
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    move-result-object p1

    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Lcom/tencent/bugly/proguard/e4;->c(I)V

    .line 45
    new-instance p1, Lcom/tencent/bugly/proguard/ab;

    invoke-direct {p1}, Lcom/tencent/bugly/proguard/ab;-><init>()V

    .line 46
    iput v1, p1, Lcom/tencent/bugly/proguard/ab;->b:I

    .line 47
    iget-wide v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->b:J

    iput-wide v1, p1, Lcom/tencent/bugly/proguard/ab;->a:J

    .line 48
    iget-wide v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->c:J

    iput-wide v1, p1, Lcom/tencent/bugly/proguard/ab;->e:J

    .line 49
    invoke-static {v0}, Lcom/tencent/bugly/proguard/bi;->a(Landroid/os/Parcelable;)[B

    move-result-object v1

    iput-object v1, p1, Lcom/tencent/bugly/proguard/ab;->g:[B

    .line 50
    const-class v1, Lcom/tencent/bugly/proguard/e4;

    monitor-enter v1

    .line 51
    :try_start_0
    sget-object v2, Lcom/tencent/bugly/proguard/e4;->a:Lcom/tencent/bugly/proguard/e4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    .line 52
    invoke-virtual {v2, p1}, Lcom/tencent/bugly/proguard/e4;->d(Lcom/tencent/bugly/proguard/ab;)Z

    const/4 p1, 0x1

    .line 53
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/proguard/pg;->a(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;Z)V

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    monitor-exit v1

    throw p1
.end method

.method public c()Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pg;->d:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->o:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/bi;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pg;->d:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    sget-object v1, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->w:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->o:Ljava/lang/String;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pg;->d:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    iget-object v0, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->p:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/bi;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pg;->d:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    sget-object v1, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->x:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->p:Ljava/lang/String;

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pg;->d:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    return-object v0

    .line 7
    :cond_2
    sget-object v0, Lcom/tencent/bugly/proguard/pg;->r:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/tencent/bugly/proguard/pg;->r:Ljava/lang/String;

    .line 8
    invoke-static {v0}, Lcom/tencent/bugly/proguard/bi;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 9
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pg;->c:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    sget-object v1, Lcom/tencent/bugly/proguard/pg;->r:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->o:Ljava/lang/String;

    .line 10
    iput-object v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->p:Ljava/lang/String;

    .line 11
    :cond_3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pg;->c:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    return-object v0
.end method

.method public declared-synchronized d()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pg;->d:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    monitor-exit p0

    .line 10
    return v0

    .line 11
    :catchall_0
    move-exception v0

    .line 12
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    throw v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public e()Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x2

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/e4;->a(I)Ljava/util/List;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 15
    move-result v1

    .line 16
    .line 17
    if-lez v1, :cond_0

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    check-cast v0, Lcom/tencent/bugly/proguard/ab;

    .line 25
    .line 26
    iget-object v0, v0, Lcom/tencent/bugly/proguard/ab;->g:[B

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    sget-object v1, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/bi;->a([BLandroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    check-cast v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 37
    return-object v0

    .line 38
    :cond_0
    const/4 v0, 0x0

    .line 39
    return-object v0
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
