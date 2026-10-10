.class public Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "ConnectivityBroadcastReceiver.java"

# interfaces
.implements Lio/flutter/plugin/common/EventChannel$StreamHandler;


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Lse0/a;

.field public d:Lio/flutter/plugin/common/EventChannel$EventSink;

.field public final e:Landroid/os/Handler;

.field public f:Landroid/net/ConnectivityManager$NetworkCallback;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lse0/a;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroid/os/Handler;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 13
    .line 14
    iput-object v0, p0, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->e:Landroid/os/Handler;

    .line 15
    .line 16
    iput-object p1, p0, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->b:Landroid/content/Context;

    .line 17
    .line 18
    iput-object p2, p0, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->c:Lse0/a;

    .line 19
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
.end method

.method public static synthetic a(Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->f()V

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
    .line 23
    .line 24
.end method

.method public static synthetic b(Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;Ljava/util/List;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->g(Ljava/util/List;)V

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
.end method

.method public static bridge synthetic c(Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;)Lse0/a;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->c:Lse0/a;

    .line 3
    return-object p0
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
.end method

.method public static bridge synthetic d(Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->h()V

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
    .line 23
    .line 24
.end method

.method public static bridge synthetic e(Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;Ljava/util/List;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->i(Ljava/util/List;)V

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
.end method


# virtual methods
.method public final synthetic f()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->d:Lio/flutter/plugin/common/EventChannel$EventSink;

    .line 3
    .line 4
    iget-object v1, p0, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->c:Lse0/a;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lse0/a;->d()Ljava/util/List;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public final synthetic g(Ljava/util/List;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->d:Lio/flutter/plugin/common/EventChannel$EventSink;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

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
.end method

.method public final h()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lse0/c;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lse0/c;-><init>(Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;)V

    .line 6
    .line 7
    iget-object v1, p0, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->e:Landroid/os/Handler;

    .line 8
    .line 9
    const-wide/16 v2, 0x1f4

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public final i(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lse0/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lse0/b;-><init>(Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;Ljava/util/List;)V

    .line 6
    .line 7
    iget-object p1, p0, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->e:Landroid/os/Handler;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    return-void
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
.end method

.method public onCancel(Ljava/lang/Object;)V
    .locals 1

    .line 1
    .line 2
    iget-object p1, p0, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->f:Landroid/net/ConnectivityManager$NetworkCallback;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->c:Lse0/a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lse0/a;->c()Landroid/net/ConnectivityManager;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    iget-object v0, p0, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->f:Landroid/net/ConnectivityManager$NetworkCallback;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 16
    const/4 p1, 0x0

    .line 17
    .line 18
    iput-object p1, p0, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->f:Landroid/net/ConnectivityManager$NetworkCallback;

    .line 19
    :cond_0
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 0

    .line 1
    .line 2
    iput-object p2, p0, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->d:Lio/flutter/plugin/common/EventChannel$EventSink;

    .line 3
    .line 4
    new-instance p1, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver$a;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, p0}, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver$a;-><init>(Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;)V

    .line 8
    .line 9
    iput-object p1, p0, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->f:Landroid/net/ConnectivityManager$NetworkCallback;

    .line 10
    .line 11
    iget-object p1, p0, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->c:Lse0/a;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lse0/a;->c()Landroid/net/ConnectivityManager;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    iget-object p2, p0, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->f:Landroid/net/ConnectivityManager$NetworkCallback;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p2}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 21
    .line 22
    iget-object p1, p0, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->c:Lse0/a;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lse0/a;->d()Ljava/util/List;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->i(Ljava/util/List;)V

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
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    .line 2
    iget-object p1, p0, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->d:Lio/flutter/plugin/common/EventChannel$EventSink;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object p2, p0, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->c:Lse0/a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Lse0/a;->d()Ljava/util/List;

    .line 10
    move-result-object p2

    .line 11
    .line 12
    .line 13
    invoke-interface {p1, p2}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    .line 14
    :cond_0
    return-void
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
.end method
