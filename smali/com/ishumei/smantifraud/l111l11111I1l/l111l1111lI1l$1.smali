.class final Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l;->l1111l111111Il(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private synthetic l1111l111111Il:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l$1;->l1111l111111Il:Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p2}, Lcom/ishumei/smantifraud/IService$l1111l111111Il;->l1111l111111Il(Landroid/os/IBinder;)Lcom/ishumei/smantifraud/IService;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-interface {p1}, Lcom/ishumei/smantifraud/IService;->hasF()Z

    .line 8
    move-result p2

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l;->l1111l111111Il(Z)Z

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Lcom/ishumei/smantifraud/IService;->hasBI()Z

    .line 15
    move-result p2

    .line 16
    .line 17
    .line 18
    invoke-static {p2}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l;->l111l11111lIl(Z)Z

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Lcom/ishumei/smantifraud/IService;->hasMagiskMount()Z

    .line 22
    move-result p1

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l;->l111l11111I1l(Z)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    :catch_0
    iget-object p1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l$1;->l1111l111111Il:Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 31
    return-void
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
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
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
.end method
