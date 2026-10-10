.class public Lcom/tencent/bugly/proguard/sa;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/sa$b;
    }
.end annotation


# static fields
.field public static final a:I = 0x3e9

.field public static final b:I = 0x1

.field public static final c:I = 0x0

.field public static d:Z = false

.field public static final e:I = 0xa

.field public static final f:J = 0x7530L

.field public static final g:J = 0x493e0L

.field public static final h:J = 0x1499700L

.field public static i:I = 0xa

.field public static j:J = 0x493e0L

.field public static k:J = 0x7530L

.field public static l:J = 0x0L

.field public static m:I = 0x0

.field public static n:J = 0x0L

.field public static o:J = 0x0L

.field public static p:Lcom/tencent/bugly/proguard/v1; = null

.field public static q:J = 0x0L

.field public static r:Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback; = null

.field public static s:Ljava/lang/Class; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static t:Z = true

.field public static u:Z = false

.field public static final v:J = 0x3e8L

.field public static w:J = 0x3e8L

.field public static x:J


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

.method public static synthetic a(J)J
    .locals 0

    .line 3
    sput-wide p0, Lcom/tencent/bugly/proguard/sa;->q:J

    return-wide p0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    invoke-static {}, Lcom/tencent/bugly/proguard/bi;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    const-string p0, "\n"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Landroid/content/Context;Lcom/tencent/bugly/proguard/b2;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/sa;->c(Landroid/content/Context;Lcom/tencent/bugly/proguard/b2;)V

    return-void
.end method

.method public static a(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;Z)V
    .locals 4

    .line 18
    sget-object v0, Lcom/tencent/bugly/proguard/sa;->p:Lcom/tencent/bugly/proguard/v1;

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 19
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/v1;->c(Z)V

    :cond_0
    if-nez p0, :cond_1

    goto :goto_0

    .line 20
    :cond_1
    iget-wide v0, p0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->n:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_2

    .line 21
    sput-wide v0, Lcom/tencent/bugly/proguard/sa;->k:J

    .line 22
    :cond_2
    iget p1, p0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->s:I

    if-lez p1, :cond_3

    .line 23
    sput p1, Lcom/tencent/bugly/proguard/sa;->i:I

    .line 24
    :cond_3
    iget-wide p0, p0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->t:J

    cmp-long v0, p0, v2

    if-lez v0, :cond_4

    .line 25
    sput-wide p0, Lcom/tencent/bugly/proguard/sa;->j:J

    :cond_4
    :goto_0
    return-void
.end method

.method public static a(ZJ)V
    .locals 2

    .line 15
    sput-boolean p0, Lcom/tencent/bugly/proguard/sa;->u:Z

    const-wide/16 v0, 0x0

    cmp-long p0, p1, v0

    if-lez p0, :cond_0

    .line 16
    sput-wide p1, Lcom/tencent/bugly/proguard/sa;->w:J

    return-void

    :cond_0
    const-wide/16 p0, 0x3e8

    .line 17
    sput-wide p0, Lcom/tencent/bugly/proguard/sa;->w:J

    return-void
.end method

.method public static synthetic a()Z
    .locals 1

    .line 2
    sget-boolean v0, Lcom/tencent/bugly/proguard/sa;->u:Z

    return v0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 11

    .line 4
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/l2;->f:Ljava/lang/String;

    .line 6
    sget-object v1, Lcom/tencent/bugly/proguard/sa;->p:Lcom/tencent/bugly/proguard/v1;

    invoke-virtual {v1, v0}, Lcom/tencent/bugly/proguard/v1;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    move v3, v2

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_6

    .line 8
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

    .line 9
    iget-object v5, v4, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->o:Ljava/lang/String;

    iget-object v6, p0, Lcom/tencent/bugly/proguard/l2;->F:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_1

    .line 10
    :cond_1
    iget v5, v4, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->c:I

    if-eq v5, v1, :cond_2

    goto :goto_1

    .line 11
    :cond_2
    invoke-static {}, Lcom/tencent/bugly/proguard/bi;->b()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v9, v5, v7

    if-gtz v9, :cond_3

    return v1

    .line 12
    :cond_3
    iget-wide v9, v4, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->f:J

    cmp-long v5, v9, v5

    if-gez v5, :cond_4

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 13
    :cond_4
    iget-wide v0, v4, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->g:J

    cmp-long p0, v0, v7

    if-gtz p0, :cond_5

    .line 14
    sget-object p0, Lcom/tencent/bugly/proguard/sa;->p:Lcom/tencent/bugly/proguard/v1;

    invoke-virtual {p0, v2}, Lcom/tencent/bugly/proguard/v1;->c(Z)V

    :cond_5
    return v2

    :cond_6
    return v1
.end method

.method public static synthetic b()I
    .locals 1

    .line 1
    sget v0, Lcom/tencent/bugly/proguard/sa;->i:I

    return v0
.end method

.method public static synthetic b(J)J
    .locals 0

    .line 2
    sput-wide p0, Lcom/tencent/bugly/proguard/sa;->x:J

    return-wide p0
.end method

.method public static b(Landroid/content/Context;)V
    .locals 1

    .line 17
    sget-boolean v0, Lcom/tencent/bugly/proguard/sa;->d:Z

    if-eqz v0, :cond_1

    if-nez p0, :cond_0

    goto :goto_0

    .line 18
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/sa;->r()V

    const/4 p0, 0x0

    .line 19
    sput-boolean p0, Lcom/tencent/bugly/proguard/sa;->d:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public static b(Landroid/content/Context;Lcom/tencent/bugly/proguard/b2;)V
    .locals 4

    .line 3
    sget-boolean v0, Lcom/tencent/bugly/proguard/sa;->d:Z

    if-eqz v0, :cond_0

    goto :goto_2

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    iget-boolean v0, v0, Lcom/tencent/bugly/proguard/l2;->i:Z

    sput-boolean v0, Lcom/tencent/bugly/proguard/sa;->t:Z

    .line 5
    new-instance v0, Lcom/tencent/bugly/proguard/v1;

    sget-boolean v1, Lcom/tencent/bugly/proguard/sa;->t:Z

    invoke-direct {v0, p0, v1}, Lcom/tencent/bugly/proguard/v1;-><init>(Landroid/content/Context;Z)V

    sput-object v0, Lcom/tencent/bugly/proguard/sa;->p:Lcom/tencent/bugly/proguard/v1;

    .line 6
    :try_start_0
    invoke-static {p0}, Lcom/tencent/bugly/proguard/sa;->c(Landroid/content/Context;)V

    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 8
    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_1

    .line 9
    check-cast v0, Landroid/app/Application;

    invoke-static {v0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->init(Landroid/app/Application;)V

    .line 10
    invoke-static {}, Lcom/tencent/bugly/proguard/sa;->q()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 11
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 12
    sput-boolean v0, Lcom/tencent/bugly/proguard/sa;->d:Z

    const-wide/16 v0, 0x0

    if-eqz p1, :cond_2

    .line 13
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/b2;->k()Ljava/lang/Class;

    move-result-object v2

    sput-object v2, Lcom/tencent/bugly/proguard/sa;->s:Ljava/lang/Class;

    .line 14
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/b2;->c()J

    move-result-wide v2

    goto :goto_1

    :cond_2
    move-wide v2, v0

    :goto_1
    cmp-long v0, v2, v0

    if-gtz v0, :cond_3

    .line 15
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/sa;->c(Landroid/content/Context;Lcom/tencent/bugly/proguard/b2;)V

    goto :goto_2

    .line 16
    :cond_3
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object v0

    new-instance v1, Lcom/tencent/bugly/proguard/sa$a;

    invoke-direct {v1, p0, p1}, Lcom/tencent/bugly/proguard/sa$a;-><init>(Landroid/content/Context;Lcom/tencent/bugly/proguard/b2;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;J)Z

    :goto_2
    return-void
.end method

.method public static synthetic c(J)J
    .locals 0

    .line 2
    sput-wide p0, Lcom/tencent/bugly/proguard/sa;->n:J

    return-wide p0
.end method

.method public static c(Landroid/content/Context;)V
    .locals 2

    .line 10
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 11
    :cond_0
    sget-object v1, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->INSTANCE:Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;

    invoke-virtual {v1, p0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->isCurrentAppOnForeground(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    .line 12
    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/l2;->a(Z)V

    return-void

    .line 13
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/tencent/bugly/proguard/sa;->x:J

    return-void
.end method

.method public static c(Landroid/content/Context;Lcom/tencent/bugly/proguard/b2;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/b2;->v()Z

    move-result v0

    .line 4
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/b2;->q()Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 5
    invoke-static {p0}, Lcom/tencent/bugly/proguard/sa;->a(Landroid/content/Context;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_1

    .line 6
    :cond_1
    sget-boolean p0, Lcom/tencent/bugly/proguard/sa;->t:Z

    if-eqz p0, :cond_2

    .line 7
    invoke-static {}, Lcom/tencent/bugly/proguard/sa;->o()V

    .line 8
    sget-object p0, Lcom/tencent/bugly/proguard/sa;->p:Lcom/tencent/bugly/proguard/v1;

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/v1;->a()V

    .line 9
    sget-object p0, Lcom/tencent/bugly/proguard/sa;->p:Lcom/tencent/bugly/proguard/v1;

    const-wide/32 v0, 0x1499700

    invoke-virtual {p0, v0, v1}, Lcom/tencent/bugly/proguard/v1;->b(J)V

    :cond_2
    :goto_1
    return-void
.end method

.method public static synthetic c()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/tencent/bugly/proguard/sa;->t:Z

    return v0
.end method

.method public static synthetic d()J
    .locals 2

    .line 1
    sget-wide v0, Lcom/tencent/bugly/proguard/sa;->q:J

    return-wide v0
.end method

.method public static d(J)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-gez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/tencent/bugly/proguard/pg;->b()Lcom/tencent/bugly/proguard/pg;

    move-result-object p0

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/pg;->c()Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    move-result-object p0

    iget-wide p0, p0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->n:J

    .line 3
    :cond_0
    sput-wide p0, Lcom/tencent/bugly/proguard/sa;->l:J

    return-void
.end method

.method public static synthetic e()J
    .locals 2

    .line 1
    .line 2
    sget-wide v0, Lcom/tencent/bugly/proguard/sa;->j:J

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

.method public static synthetic f()J
    .locals 2

    .line 1
    .line 2
    sget-wide v0, Lcom/tencent/bugly/proguard/sa;->x:J

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

.method public static synthetic g()J
    .locals 2

    .line 1
    .line 2
    sget-wide v0, Lcom/tencent/bugly/proguard/sa;->w:J

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

.method public static synthetic h()Ljava/lang/Class;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/sa;->s:Ljava/lang/Class;

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

.method public static synthetic i()J
    .locals 2

    .line 1
    .line 2
    sget-wide v0, Lcom/tencent/bugly/proguard/sa;->o:J

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

.method public static synthetic j()J
    .locals 2

    .line 1
    .line 2
    sget-wide v0, Lcom/tencent/bugly/proguard/sa;->n:J

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

.method public static synthetic k()J
    .locals 2

    .line 1
    .line 2
    sget-wide v0, Lcom/tencent/bugly/proguard/sa;->l:J

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

.method public static synthetic l()J
    .locals 2

    .line 1
    .line 2
    sget-wide v0, Lcom/tencent/bugly/proguard/sa;->k:J

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

.method public static synthetic m()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/tencent/bugly/proguard/sa;->m:I

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

.method public static synthetic n()I
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/tencent/bugly/proguard/sa;->m:I

    .line 3
    .line 4
    add-int/lit8 v1, v0, 0x1

    .line 5
    .line 6
    sput v1, Lcom/tencent/bugly/proguard/sa;->m:I

    .line 7
    return v0
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

.method public static o()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    sput-wide v0, Lcom/tencent/bugly/proguard/sa;->o:J

    .line 7
    .line 8
    sget-object v0, Lcom/tencent/bugly/proguard/sa;->p:Lcom/tencent/bugly/proguard/v1;

    .line 9
    const/4 v1, 0x1

    .line 10
    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, v1, v2, v3}, Lcom/tencent/bugly/proguard/v1;->a(IZJ)V

    .line 15
    const/4 v0, 0x0

    .line 16
    .line 17
    new-array v0, v0, [Ljava/lang/Object;

    .line 18
    .line 19
    const-string v1, "[session] launch app, new start"

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 23
    return-void
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
.end method

.method public static p()V
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/sa;->p:Lcom/tencent/bugly/proguard/v1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v4, v1, v2, v3}, Lcom/tencent/bugly/proguard/v1;->a(IZJ)V

    .line 12
    :cond_0
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static q()V
    .locals 2

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lcom/tencent/bugly/proguard/sa;->r:Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/tencent/bugly/proguard/sa$b;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/sa$b;-><init>()V

    .line 10
    .line 11
    sput-object v0, Lcom/tencent/bugly/proguard/sa;->r:Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;

    .line 12
    .line 13
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/sa;->r:Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->register(Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    return-void

    .line 18
    :catch_0
    move-exception v0

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    .line 22
    move-result v1

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 28
    :cond_1
    return-void
    .line 29
    .line 30
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
.end method

.method public static r()V
    .locals 2

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lcom/tencent/bugly/proguard/sa;->r:Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->unRegister(Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    return-void

    .line 9
    :catch_0
    move-exception v0

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    .line 13
    move-result v1

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 19
    :cond_0
    return-void
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
.end method
