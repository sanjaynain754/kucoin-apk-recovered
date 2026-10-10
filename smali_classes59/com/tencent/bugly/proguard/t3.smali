.class public Lcom/tencent/bugly/proguard/t3;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static a:Z = false

.field public static b:Z = false

.field public static final c:I = 0x1

.field public static final d:I = 0x2

.field public static final e:Ljava/lang/String; = "https://rmonitor.qq.com"

.field public static final f:Ljava/lang/String; = "https://pro.bugly.qq.com"

.field public static final g:Ljava/lang/String; = "https://android.bugly.tencent.com"

.field public static final h:Ljava/lang/String; = "https://cloud.bugly.qq.com"


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

.method public static a(Ljava/lang/String;)V
    .locals 1

    .line 21
    sget-boolean v0, Lcom/tencent/bugly/proguard/t3;->a:Z

    if-eqz v0, :cond_0

    .line 22
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/l2;->h(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    const/4 p2, 0x0

    .line 1
    :try_start_0
    sget-boolean v0, Lcom/tencent/bugly/proguard/t3;->b:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lcom/tencent/bugly/proguard/t3;->b:Z

    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/tencent/bugly/proguard/rh;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/rh;

    .line 4
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    .line 5
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/tencent/bugly/proguard/l2;->e(Ljava/lang/String;)V

    .line 6
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l2;->i(Ljava/lang/String;)V

    .line 7
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/l2;->k0:Z

    .line 8
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/l2;->z0:Z

    .line 9
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/pg;->a(Landroid/content/Context;Ljava/util/List;)Lcom/tencent/bugly/proguard/pg;

    .line 10
    new-instance p0, Lcom/tencent/bugly/proguard/v1;

    .line 11
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lcom/tencent/bugly/proguard/v1;-><init>(Landroid/content/Context;Z)V

    sput-object p0, Lcom/tencent/bugly/proguard/sa;->p:Lcom/tencent/bugly/proguard/v1;

    .line 12
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    move-result-object p0

    .line 13
    const-string p1, "crash_report"

    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/base/config/b;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 14
    instance-of p1, p0, Lcom/tencent/bugly/proguard/s3;

    if-eqz p1, :cond_0

    check-cast p0, Lcom/tencent/bugly/proguard/s3;

    .line 15
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/s3;->b()Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-nez p0, :cond_0

    .line 16
    const-string p0, "crash report is disabled, please modify your project\'s setting"

    new-array p1, p2, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 17
    sput-boolean p2, Lcom/tencent/bugly/proguard/t3;->a:Z

    return-void

    :catchall_0
    move-exception p0

    goto :goto_0

    .line 18
    :cond_0
    sput-boolean v0, Lcom/tencent/bugly/proguard/t3;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 19
    :goto_0
    sput-boolean p2, Lcom/tencent/bugly/proguard/t3;->a:Z

    .line 20
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    :cond_1
    return-void
.end method

.method public static a(Z)V
    .locals 1

    .line 23
    sget-boolean v0, Lcom/tencent/bugly/proguard/t3;->a:Z

    if-eqz v0, :cond_0

    .line 24
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/l2;->a(Ljava/lang/Boolean;)V

    :cond_0
    return-void
.end method

.method public static a(Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/i3;",
            ">;)Z"
        }
    .end annotation

    .line 25
    sget-boolean v0, Lcom/tencent/bugly/proguard/t3;->a:Z

    if-eqz v0, :cond_1

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 27
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/i3;

    .line 28
    invoke-static {v1}, Lcom/tencent/bugly/proguard/ci;->a(Lcom/tencent/bugly/proguard/i3;)Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v0}, Lcom/tencent/bugly/proguard/t3;->b(Ljava/util/List;)Z

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    .line 30
    new-array v0, p0, [Ljava/lang/Object;

    const-string/jumbo v1, "uploadExceptionData failed, please call init first"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    return p0
.end method

.method public static b(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/tencent/bugly/proguard/t3;->a:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/l2;->m(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static b(Ljava/util/List;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            ">;)Z"
        }
    .end annotation

    .line 3
    sget-boolean v0, Lcom/tencent/bugly/proguard/t3;->a:Z

    if-eqz v0, :cond_0

    .line 4
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    move-result-object v1

    .line 5
    invoke-static {}, Lcom/tencent/bugly/proguard/rh;->d()Lcom/tencent/bugly/proguard/rh;

    move-result-object v2

    const-wide/16 v4, 0x0

    const/4 v6, 0x1

    move-object v3, p0

    .line 6
    invoke-static/range {v1 .. v6}, Lcom/tencent/bugly/proguard/v3;->a(Landroid/content/Context;Lcom/tencent/bugly/proguard/rh;Ljava/util/List;JZ)V

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static c(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/tencent/bugly/proguard/t3;->a:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/l2;->g(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static c(Ljava/util/List;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/uh;",
            ">;)Z"
        }
    .end annotation

    .line 3
    sget-boolean v0, Lcom/tencent/bugly/proguard/t3;->a:Z

    if-eqz v0, :cond_2

    .line 4
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/proguard/uh;

    .line 5
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 6
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ci;->a(Lcom/tencent/bugly/proguard/uh;)Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/uh;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    sget-object v0, Lcom/tencent/bugly/proguard/sa;->p:Lcom/tencent/bugly/proguard/v1;

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/v1;->b(I)V

    goto :goto_1

    .line 9
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/sa;->p:Lcom/tencent/bugly/proguard/v1;

    const/4 v3, 0x2

    invoke-virtual {v0, v3}, Lcom/tencent/bugly/proguard/v1;->b(I)V

    .line 10
    :goto_1
    sget-object v0, Lcom/tencent/bugly/proguard/sa;->p:Lcom/tencent/bugly/proguard/v1;

    invoke-virtual {v0, v2, v1}, Lcom/tencent/bugly/proguard/v1;->a(Ljava/util/List;Z)V

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    const/4 p0, 0x0

    .line 11
    new-array v0, p0, [Ljava/lang/Object;

    const-string/jumbo v1, "uploadUserInfoData failed, please call init first"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    return p0
.end method

.method public static d(Ljava/lang/String;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/tencent/bugly/proguard/d2;->a(Ljava/lang/String;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
