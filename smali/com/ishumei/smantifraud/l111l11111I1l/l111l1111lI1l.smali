.class public final Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l;
.super Ljava/lang/Object;


# static fields
.field private static l1111l111111Il:Z

.field private static l111l11111I1l:Z

.field private static l111l11111Il:Z

.field private static l111l11111lIl:Z


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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static l1111l111111Il(Landroid/content/Context;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    sput-boolean v0, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l;->l1111l111111Il:Z

    :try_start_0
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/ishumei/smantifraud/IServiceImp;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance v2, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l$1;

    invoke-direct {v2, p0}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l$1;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x1

    invoke-virtual {p0, v1, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result p0

    sput-boolean p0, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l;->l111l11111Il:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    sput-boolean v0, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l;->l111l11111Il:Z

    return-void
.end method

.method public static l1111l111111Il()Z
    .locals 1

    .line 2
    sget-boolean v0, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l;->l1111l111111Il:Z

    return v0
.end method

.method public static synthetic l1111l111111Il(Z)Z
    .locals 0

    .line 3
    sput-boolean p0, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l;->l111l11111lIl:Z

    return p0
.end method

.method public static l111l11111I1l()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l;->l111l11111I1l:Z

    return v0
.end method

.method public static synthetic l111l11111I1l(Z)Z
    .locals 0

    .line 2
    sput-boolean p0, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l;->l1111l111111Il:Z

    return p0
.end method

.method public static l111l11111Il()Z
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l;->l111l11111Il:Z

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static l111l11111lIl()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l;->l111l11111lIl:Z

    return v0
.end method

.method public static synthetic l111l11111lIl(Z)Z
    .locals 0

    .line 2
    sput-boolean p0, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l;->l111l11111I1l:Z

    return p0
.end method
