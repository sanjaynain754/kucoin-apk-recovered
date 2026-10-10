.class public final Lcom/kubi/market/monitor/lib/ui/floating/window/w0$a;
.super Ljava/lang/Object;
.source "FloatingActionManager.kt"

# interfaces
.implements Lcom/blankj/utilcode/util/o0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/market/monitor/lib/ui/floating/window/w0;->W0(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "com/kubi/market/monitor/lib/ui/floating/window/FloatingActionManager$registerAppStatusChangedListener$1",
        "Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;",
        "onBackground",
        "",
        "activity",
        "Landroid/app/Activity;",
        "onForeground",
        "MarketMonitorLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


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


# virtual methods
.method public onBackground(Landroid/app/Activity;)V
    .locals 3

    .line 1
    .line 2
    sget-object p1, Lcom/kubi/market/monitor/lib/ui/floating/window/w0;->a:Lcom/kubi/market/monitor/lib/ui/floating/window/w0;

    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x2

    .line 5
    .line 6
    const-string v2, "onBackground"

    .line 7
    .line 8
    .line 9
    invoke-static {p1, v2, v0, v1, v0}, Lcom/kubi/market/monitor/lib/ui/floating/window/w0;->k0(Lcom/kubi/market/monitor/lib/ui/floating/window/w0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 10
    const/4 v0, 0x1

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/kubi/market/monitor/lib/ui/floating/window/w0;->X(Z)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 17
    move-result-wide v1

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2}, Lcom/kubi/market/monitor/lib/ui/floating/window/w0;->Y(J)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/kubi/market/monitor/lib/ui/floating/window/w0;->o2()V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v0}, Lcom/kubi/market/monitor/lib/ui/floating/window/w0;->W(Lcom/kubi/market/monitor/lib/ui/floating/window/w0;Z)V

    .line 27
    return-void
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
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public onForeground(Landroid/app/Activity;)V
    .locals 4

    .line 1
    const/4 p1, 0x0

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/kubi/market/monitor/lib/ui/floating/window/w0;->X(Z)V

    .line 5
    .line 6
    sget-object v0, Lcom/kubi/market/monitor/lib/ui/floating/window/w0;->a:Lcom/kubi/market/monitor/lib/ui/floating/window/w0;

    .line 7
    .line 8
    const-string v1, "onForeground"

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x2

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, v2, v3, v2}, Lcom/kubi/market/monitor/lib/ui/floating/window/w0;->k0(Lcom/kubi/market/monitor/lib/ui/floating/window/w0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, p1}, Lcom/kubi/market/monitor/lib/ui/floating/window/w0;->W(Lcom/kubi/market/monitor/lib/ui/floating/window/w0;Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/kubi/market/monitor/lib/ui/floating/window/w0;->N0()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    return-void

    .line 24
    :cond_0
    const/4 v1, 0x1

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1, p1, v3, v2}, Lcom/kubi/market/monitor/lib/ui/floating/window/w0;->j1(Lcom/kubi/market/monitor/lib/ui/floating/window/w0;ZZILjava/lang/Object;)I

    .line 28
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
    .line 58
    .line 59
    .line 60
    .line 61
.end method
