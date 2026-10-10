.class public final Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$registerBroadcastReceiver$1;
.super Landroid/content/BroadcastReceiver;
.source "NetworkInfoStore.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "com/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$registerBroadcastReceiver$1",
        "Landroid/content/BroadcastReceiver;",
        "lastConnected",
        "",
        "onReceive",
        "",
        "context",
        "Landroid/content/Context;",
        "intent",
        "Landroid/content/Intent;",
        "tuilivekit_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public a:Z

.field public final synthetic b:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "intent"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object p2, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$registerBroadcastReceiver$1;->b:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;

    .line 13
    .line 14
    .line 15
    invoke-static {p2, p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->d(Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;Landroid/content/Context;)Z

    .line 16
    move-result p1

    .line 17
    .line 18
    iget-boolean p2, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$registerBroadcastReceiver$1;->a:Z

    .line 19
    .line 20
    if-eq p1, p2, :cond_0

    .line 21
    .line 22
    iput-boolean p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$registerBroadcastReceiver$1;->a:Z

    .line 23
    .line 24
    iget-object p2, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$registerBroadcastReceiver$1;->b:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->i()Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 28
    move-result-object p2

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->l()Lkotlinx/coroutines/flow/n;

    .line 32
    move-result-object p2

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    .line 39
    invoke-interface {p2, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 40
    :cond_0
    return-void
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
.end method
