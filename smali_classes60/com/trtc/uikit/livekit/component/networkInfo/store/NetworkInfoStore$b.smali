.class public final Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$b;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "NetworkInfoStore.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017\u00a8\u0006\u0008"
    }
    d2 = {
        "com/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$registerNetworkCallback$1",
        "Landroid/net/ConnectivityManager$NetworkCallback;",
        "onCapabilitiesChanged",
        "",
        "network",
        "Landroid/net/Network;",
        "networkCapabilities",
        "Landroid/net/NetworkCapabilities;",
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
.field public final synthetic a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$b;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;

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
.end method


# virtual methods
.method public onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 1
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x17
    .end annotation

    .line 1
    .line 2
    const-string v0, "network"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string p1, "networkCapabilities"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const/16 p1, 0x10

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2, p1}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 16
    move-result p1

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$b;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a(Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;)Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    const-string p2, "network status changed: Network is connected and available"

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$b;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->i()Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->l()Lkotlinx/coroutines/flow/n;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 45
    return-void

    .line 46
    .line 47
    :cond_0
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$b;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;

    .line 48
    .line 49
    .line 50
    invoke-static {p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a(Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;)Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    const-string p2, "network status changed: Network is not available"

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, p2}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 57
    .line 58
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$b;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->i()Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->l()Lkotlinx/coroutines/flow/n;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 72
    return-void
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method
