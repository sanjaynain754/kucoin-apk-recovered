.class public Lcom/tencent/bugly/proguard/ni$a;
.super Landroid/os/Handler;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/ni;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/tencent/bugly/proguard/ni;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/ni;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/ni$a;->a:Lcom/tencent/bugly/proguard/ni;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

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
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HandlerLeak"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 4
    .line 5
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 6
    .line 7
    instance-of v1, v0, Landroid/os/Bundle;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Landroid/os/Bundle;

    .line 12
    .line 13
    const-string v1, "invoke-args"

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    const-string v2, "invoke-resp"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iget-object v2, p0, Lcom/tencent/bugly/proguard/ni$a;->a:Lcom/tencent/bugly/proguard/ni;

    .line 26
    .line 27
    iget v3, p1, Landroid/os/Message;->what:I

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v3, v1}, Lcom/tencent/bugly/proguard/ni;->a(Lcom/tencent/bugly/proguard/ni;ILandroid/os/Bundle;)Landroid/os/Bundle;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    new-instance v2, Landroid/os/Messenger;

    .line 34
    .line 35
    .line 36
    invoke-direct {v2, v0}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    .line 37
    .line 38
    :try_start_0
    iget p1, p1, Landroid/os/Message;->what:I

    .line 39
    const/4 v0, 0x0

    .line 40
    .line 41
    .line 42
    invoke-static {v0, p1, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, p1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    return-void

    .line 48
    :catch_0
    move-exception p1

    .line 49
    const/4 v0, 0x0

    .line 50
    .line 51
    new-array v0, v0, [Ljava/lang/Object;

    .line 52
    .line 53
    const-string v1, "Matrix.WarmUpService"

    .line 54
    .line 55
    const-string v2, ""

    .line 56
    .line 57
    .line 58
    invoke-static {v1, p1, v2, v0}, Lcom/tencent/bugly/proguard/pb;->a(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    :cond_0
    return-void
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
