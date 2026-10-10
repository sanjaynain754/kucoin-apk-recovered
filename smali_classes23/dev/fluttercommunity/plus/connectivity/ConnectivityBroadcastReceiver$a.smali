.class public Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver$a;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "ConnectivityBroadcastReceiver.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;


# direct methods
.method public constructor <init>(Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver$a;->a:Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

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


# virtual methods
.method public onAvailable(Landroid/net/Network;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver$a;->a:Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->c(Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;)Lse0/a;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, p1}, Lse0/a;->a(Landroid/net/Network;)Ljava/util/List;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-static {v0, p1}, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->e(Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;Ljava/util/List;)V

    .line 14
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
.end method

.method public onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 1

    .line 1
    .line 2
    iget-object p1, p0, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver$a;->a:Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->c(Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;)Lse0/a;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p2}, Lse0/a;->b(Landroid/net/NetworkCapabilities;)Ljava/util/List;

    .line 10
    move-result-object p2

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p2}, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->e(Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;Ljava/util/List;)V

    .line 14
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

.method public onLost(Landroid/net/Network;)V
    .locals 0

    .line 1
    .line 2
    iget-object p1, p0, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver$a;->a:Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;->d(Ldev/fluttercommunity/plus/connectivity/ConnectivityBroadcastReceiver;)V

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
