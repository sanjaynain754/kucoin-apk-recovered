.class public Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l111l11111lIl;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l111l11111lIl<",
        "Lcom/ishumei/smantifraud/l111l11111Il/l111l11111Il;",
        ">;"
    }
.end annotation


# static fields
.field private static final l1111l111111Il:Ljava/lang/String; = "Smlog"

.field private static l111l11111lIl:Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;


# instance fields
.field private l111l11111I1l:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static declared-synchronized l1111l111111Il()Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;
    .locals 2

    .line 1
    const-class v0, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;->l111l11111lIl:Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;

    if-nez v1, :cond_0

    new-instance v1, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;

    invoke-direct {v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;-><init>()V

    sput-object v1, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;->l111l11111lIl:Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;->l111l11111lIl:Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static synthetic l1111l111111Il(Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;)Ljava/lang/String;
    .locals 2

    .line 2
    invoke-static {}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111l1Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111l1Il;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111l1Il;->l111l11111lIl()Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111Il;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111Il;->l111l11111I1l()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    move p0, v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    sget-object v1, Lcom/ishumei/smantifraud/SmAntiFraud;->option:Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;

    invoke-virtual {v1}, Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;->l111l1111lI1l()Z

    move-result v1

    if-eqz p0, :cond_2

    const/4 v0, 0x2

    :cond_2
    or-int p0, v1, v0

    invoke-static {}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l1111l111111Il(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l1111l111111Il(Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;->l111l11111I1l:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic l1111l111111Il(Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;Lcom/ishumei/smantifraud/l111l11111Il/l111l11111Il;)V
    .locals 2

    .line 4
    const-string p0, "Smlog"

    const-string/jumbo v0, "success"

    invoke-static {p0, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111Il;

    move-result-object p0

    iget v0, p1, Lcom/ishumei/smantifraud/l111l11111Il/l111l11111Il;->l1111l111111Il:I

    iget v1, p1, Lcom/ishumei/smantifraud/l111l11111Il/l111l11111Il;->l111l11111lIl:I

    invoke-virtual {p0, v0, v1}, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111Il;->l1111l111111Il(II)V

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;

    move-result-object p0

    invoke-virtual {p1}, Lcom/ishumei/smantifraud/l111l11111Il/l111l11111Il;->l111l11111lIl()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l1111l111111Il(Ljava/lang/String;Z)V

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;->l111l11111lIl()V

    return-void
.end method

.method public static synthetic l1111l111111Il(Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;Ljava/lang/String;)V
    .locals 2

    .line 5
    iget p1, p1, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;->l1111l111111Il:I

    const/16 v0, 0x76e

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;->l111l11111I1l:Ljava/lang/String;

    invoke-static {}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111l1Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111l1Il;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111l1Il;->l111l11111lIl()Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111Il;

    move-result-object v1

    invoke-static {p2, v0, v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l1111l111111Il(Ljava/lang/String;Ljava/lang/String;Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111Il;)V

    :cond_0
    if-lez p1, :cond_1

    const/4 p1, -0x3

    :cond_1
    invoke-static {}, Lcom/ishumei/smantifraud/SmAntiFraud;->getServerIdCallback()Lcom/ishumei/smantifraud/SmAntiFraud$IServerSmidCallback;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-static {}, Lcom/ishumei/smantifraud/SmAntiFraud;->getServerIdCallback()Lcom/ishumei/smantifraud/SmAntiFraud$IServerSmidCallback;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/ishumei/smantifraud/SmAntiFraud$IServerSmidCallback;->onError(I)V

    :cond_2
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;->l111l11111I1l:Ljava/lang/String;

    return-void
.end method

.method public static synthetic l1111l111111Il(Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;Ljava/lang/Throwable;)V
    .locals 3

    .line 6
    invoke-static {}, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111I1l$l1111l111111Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111I1l;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111I1l;->l1111l111111Il(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl$3;

    sget-object v1, Lcom/ishumei/smantifraud/SmAntiFraud;->option:Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;

    invoke-virtual {v1}, Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;->l11l1111I1ll()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/ishumei/smantifraud/SmAntiFraud;->option:Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;

    invoke-virtual {v2}, Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;->l11l1111Il()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2, p1}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl$3;-><init>(Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;->l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;)V

    return-void
.end method

.method private l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;Ljava/lang/String;)V
    .locals 2

    .line 8
    iget p1, p1, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;->l1111l111111Il:I

    const/16 v0, 0x76e

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;->l111l11111I1l:Ljava/lang/String;

    invoke-static {}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111l1Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111l1Il;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111l1Il;->l111l11111lIl()Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111Il;

    move-result-object v1

    invoke-static {p2, v0, v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l1111l111111Il(Ljava/lang/String;Ljava/lang/String;Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111Il;)V

    :cond_0
    if-lez p1, :cond_1

    const/4 p1, -0x3

    :cond_1
    invoke-static {}, Lcom/ishumei/smantifraud/SmAntiFraud;->getServerIdCallback()Lcom/ishumei/smantifraud/SmAntiFraud$IServerSmidCallback;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-static {}, Lcom/ishumei/smantifraud/SmAntiFraud;->getServerIdCallback()Lcom/ishumei/smantifraud/SmAntiFraud$IServerSmidCallback;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/ishumei/smantifraud/SmAntiFraud$IServerSmidCallback;->onError(I)V

    :cond_2
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;->l111l11111I1l:Ljava/lang/String;

    return-void
.end method

.method private l1111l111111Il(Ljava/lang/Throwable;)V
    .locals 3

    .line 11
    invoke-static {}, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111I1l$l1111l111111Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111I1l;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111I1l;->l1111l111111Il(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl$3;

    sget-object v1, Lcom/ishumei/smantifraud/SmAntiFraud;->option:Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;

    invoke-virtual {v1}, Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;->l11l1111I1ll()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/ishumei/smantifraud/SmAntiFraud;->option:Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;

    invoke-virtual {v2}, Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;->l11l1111Il()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2, p1}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl$3;-><init>(Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;->l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;)V

    return-void
.end method

.method private static l111l11111lIl()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111l1Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111l1Il;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111l1Il;->l111l11111lIl()Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111Il;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111Il;->l111l11111I1l()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    sget-object v2, Lcom/ishumei/smantifraud/SmAntiFraud;->option:Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;

    invoke-virtual {v2}, Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;->l111l1111lI1l()Z

    move-result v2

    if-eqz v0, :cond_2

    const/4 v1, 0x2

    :cond_2
    or-int v0, v2, v1

    invoke-static {}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l1111l111111Il(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static l111l11111lIl(Lcom/ishumei/smantifraud/l111l11111Il/l111l11111Il;)V
    .locals 3

    .line 2
    const-string v0, "Smlog"

    const-string/jumbo v1, "success"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111Il;

    move-result-object v0

    iget v1, p0, Lcom/ishumei/smantifraud/l111l11111Il/l111l11111Il;->l1111l111111Il:I

    iget v2, p0, Lcom/ishumei/smantifraud/l111l11111Il/l111l11111Il;->l111l11111lIl:I

    invoke-virtual {v0, v1, v2}, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111Il;->l1111l111111Il(II)V

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ishumei/smantifraud/l111l11111Il/l111l11111Il;->l111l11111lIl()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l1111l111111Il(Ljava/lang/String;Z)V

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;->l111l11111lIl()V

    return-void
.end method


# virtual methods
.method public l1111l111111Il(Lcom/ishumei/smantifraud/l111l11111Il/l111l11111Il;)V
    .locals 3

    .line 7
    const-string v0, "Smlog"

    const-string/jumbo v1, "success"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111Il;

    move-result-object v0

    iget v1, p1, Lcom/ishumei/smantifraud/l111l11111Il/l111l11111Il;->l1111l111111Il:I

    iget v2, p1, Lcom/ishumei/smantifraud/l111l11111Il/l111l11111Il;->l111l11111lIl:I

    invoke-virtual {v0, v1, v2}, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111Il;->l1111l111111Il(II)V

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ishumei/smantifraud/l111l11111Il/l111l11111Il;->l111l11111lIl()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l1111l111111Il(Ljava/lang/String;Z)V

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;->l111l11111lIl()V

    return-void
.end method

.method public bridge synthetic l1111l111111Il(Ljava/lang/Object;)V
    .locals 0

    .line 9
    check-cast p1, Lcom/ishumei/smantifraud/l111l11111Il/l111l11111Il;

    invoke-virtual {p0, p1}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;->l1111l111111Il(Lcom/ishumei/smantifraud/l111l11111Il/l111l11111Il;)V

    return-void
.end method

.method public final l1111l111111Il(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 10
    new-instance v0, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl$2;

    new-instance v5, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl$1;

    invoke-direct {v5, p0, p2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl$1;-><init>(Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;Ljava/lang/String;)V

    move-object v4, p0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl$2;-><init>(Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111llIl;Ljava/lang/String;Ljava/lang/String;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l111l11111lIl;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l1111l111111Il;)V

    new-instance p1, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il;

    const/4 p2, 0x0

    const/4 v1, 0x0

    const/16 v2, 0x7530

    invoke-direct {p1, v2, p2, v1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il;-><init>(IIF)V

    invoke-virtual {v0, p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1l;)Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;->l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;)V

    return-void
.end method
