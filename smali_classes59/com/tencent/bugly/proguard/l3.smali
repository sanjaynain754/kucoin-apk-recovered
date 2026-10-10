.class public Lcom/tencent/bugly/proguard/l3;
.super Lcom/tencent/bugly/proguard/c1;
.source "BUGLY"


# static fields
.field public static final h:I = 0x3ec

.field public static i:I

.field public static j:Lcom/tencent/bugly/proguard/l3;


# instance fields
.field public e:J

.field public f:Lcom/tencent/bugly/proguard/b2$a;

.field public g:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/l3;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/l3;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/proguard/l3;->j:Lcom/tencent/bugly/proguard/l3;

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

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/c1;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/l3;->g:Z

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

.method public static b()Lcom/tencent/bugly/proguard/l3;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/l3;->j:Lcom/tencent/bugly/proguard/l3;

    .line 3
    .line 4
    const/16 v1, 0x3ec

    .line 5
    .line 6
    iput v1, v0, Lcom/tencent/bugly/proguard/c1;->a:I

    .line 7
    return-object v0
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


# virtual methods
.method public final declared-synchronized a(Landroid/content/Context;Lcom/tencent/bugly/proguard/b2;)V
    .locals 4

    monitor-enter p0

    if-nez p2, :cond_0

    monitor-exit p0

    return-void

    .line 37
    :cond_0
    :try_start_0
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/b2;->j()Ljava/lang/String;

    move-result-object v0

    .line 38
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 39
    invoke-static {p1}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p1

    iput-object v0, p1, Lcom/tencent/bugly/proguard/l2;->O:Ljava/lang/String;

    .line 40
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string/jumbo v0, "setted libBugly.so file path :%s"

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 41
    :cond_1
    :goto_0
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/b2;->g()Lcom/tencent/bugly/proguard/b2$a;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 42
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/b2;->g()Lcom/tencent/bugly/proguard/b2$a;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/l3;->f:Lcom/tencent/bugly/proguard/b2$a;

    const/4 p1, 0x0

    .line 43
    new-array p1, p1, [Ljava/lang/Object;

    const-string/jumbo v0, "setted CrashHanldeCallback"

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 44
    :cond_2
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/b2;->c()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_3

    .line 45
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/b2;->c()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/tencent/bugly/proguard/l3;->e:J

    .line 46
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string/jumbo p2, "setted delay: %d"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized a(Landroid/content/Context;ZLcom/tencent/bugly/proguard/b2;)V
    .locals 11

    monitor-enter p0

    if-eqz p1, :cond_9

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/l3;->g:Z

    if-eqz v0, :cond_0

    goto/16 :goto_7

    :cond_0
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "Initializing crash module."

    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/q3;->a()Lcom/tencent/bugly/proguard/q3;

    move-result-object v1

    sget v2, Lcom/tencent/bugly/proguard/l3;->i:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    sput v2, Lcom/tencent/bugly/proguard/l3;->i:I

    const/16 v4, 0x3ec

    invoke-virtual {v1, v4, v2}, Lcom/tencent/bugly/proguard/q3;->a(II)V

    .line 4
    iput-boolean v3, p0, Lcom/tencent/bugly/proguard/l3;->g:Z

    .line 5
    sput-object p1, Lcom/tencent/bugly/proguard/r3;->a:Landroid/content/Context;

    .line 6
    invoke-virtual {p0, p1, p3}, Lcom/tencent/bugly/proguard/l3;->a(Landroid/content/Context;Lcom/tencent/bugly/proguard/b2;)V

    .line 7
    iget-object v8, p0, Lcom/tencent/bugly/proguard/l3;->f:Lcom/tencent/bugly/proguard/b2$a;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v5, 0x3ec

    move-object v6, p1

    move v7, p2

    invoke-static/range {v5 .. v10}, Lcom/tencent/bugly/proguard/k3;->a(ILandroid/content/Context;ZLcom/tencent/bugly/proguard/b2$a;Lcom/tencent/bugly/proguard/zf;Ljava/lang/String;)Lcom/tencent/bugly/proguard/k3;

    move-result-object p1

    .line 8
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k3;->z()V

    if-eqz p3, :cond_2

    .line 9
    invoke-virtual {p3}, Lcom/tencent/bugly/proguard/b2;->e()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/tencent/bugly/proguard/k3;->a(I)V

    .line 10
    invoke-virtual {p3}, Lcom/tencent/bugly/proguard/b2;->f()Z

    move-result p2

    invoke-virtual {p1, p2}, Lcom/tencent/bugly/proguard/k3;->a(Z)V

    .line 11
    invoke-virtual {p3}, Lcom/tencent/bugly/proguard/b2;->u()Z

    move-result p2

    sput-boolean p2, Lcom/tencent/bugly/proguard/k3;->I:Z

    .line 12
    invoke-static {v6}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p2

    .line 13
    invoke-virtual {p3}, Lcom/tencent/bugly/proguard/b2;->p()Z

    move-result v1

    invoke-virtual {p2, v1}, Lcom/tencent/bugly/proguard/l2;->d(Z)V

    .line 14
    invoke-virtual {p3}, Lcom/tencent/bugly/proguard/b2;->n()Z

    move-result p2

    if-nez p2, :cond_1

    .line 15
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k3;->B()V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_6

    .line 16
    :cond_1
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k3;->y()V

    goto :goto_0

    .line 17
    :cond_2
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k3;->y()V

    .line 18
    :goto_0
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k3;->b()V

    if-eqz p3, :cond_4

    .line 19
    invoke-virtual {p3}, Lcom/tencent/bugly/proguard/b2;->o()Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_1

    .line 20
    :cond_3
    const-string p2, "[crash] Closed native crash monitor!"

    new-array v1, v0, [Ljava/lang/Object;

    .line 21
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v2, p2, v1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 22
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k3;->f()V

    goto :goto_2

    .line 23
    :cond_4
    :goto_1
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k3;->A()V

    :goto_2
    if-eqz p3, :cond_6

    .line 24
    invoke-virtual {p3}, Lcom/tencent/bugly/proguard/b2;->m()Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_3

    .line 25
    :cond_5
    const-string p2, "[crash] Closed ANR monitor!"

    new-array v0, v0, [Ljava/lang/Object;

    .line 26
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v1, p2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 27
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k3;->d()V

    goto :goto_4

    .line 28
    :cond_6
    :goto_3
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k3;->x()V

    :goto_4
    if-eqz p3, :cond_7

    .line 29
    invoke-virtual {p3}, Lcom/tencent/bugly/proguard/b2;->r()Z

    move-result p2

    sput-boolean p2, Lcom/tencent/bugly/proguard/k3;->w:Z

    :cond_7
    if-eqz p3, :cond_8

    .line 30
    invoke-virtual {p3}, Lcom/tencent/bugly/proguard/b2;->c()J

    move-result-wide p2

    goto :goto_5

    :cond_8
    const-wide/16 p2, 0x0

    .line 31
    :goto_5
    invoke-virtual {p1, p2, p3, v3}, Lcom/tencent/bugly/proguard/k3;->a(JZ)V

    .line 32
    invoke-static {v6}, Lcom/tencent/bugly/proguard/n5;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/n5;

    .line 33
    invoke-static {}, Lcom/tencent/bugly/proguard/w1;->b()Lcom/tencent/bugly/proguard/w1;

    move-result-object p1

    .line 34
    const-string p2, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {p1, p2}, Lcom/tencent/bugly/proguard/w1;->a(Ljava/lang/String;)V

    .line 35
    invoke-virtual {p1, v6}, Lcom/tencent/bugly/proguard/w1;->a(Landroid/content/Context;)V

    .line 36
    invoke-static {}, Lcom/tencent/bugly/proguard/q3;->a()Lcom/tencent/bugly/proguard/q3;

    move-result-object p1

    sget p2, Lcom/tencent/bugly/proguard/l3;->i:I

    sub-int/2addr p2, v3

    sput p2, Lcom/tencent/bugly/proguard/l3;->i:I

    invoke-virtual {p1, v4, p2}, Lcom/tencent/bugly/proguard/q3;->a(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_6
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_9
    :goto_7
    monitor-exit p0

    return-void
.end method

.method public a(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;)V
    .locals 1

    if-nez p1, :cond_0

    goto :goto_0

    .line 47
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 48
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/k3;->a(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public a()[Ljava/lang/String;
    .locals 1

    .line 49
    const-string/jumbo v0, "t_cr"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized c()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/l3;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit p0

    .line 5
    return v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
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
