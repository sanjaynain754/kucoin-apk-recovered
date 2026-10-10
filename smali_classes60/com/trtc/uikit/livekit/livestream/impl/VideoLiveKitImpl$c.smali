.class public final Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$c;
.super Landroid/telephony/PhoneStateListener;
.source "VideoLiveKitImpl.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$PhoneCallStateListener;",
        "Landroid/telephony/PhoneStateListener;",
        "<init>",
        "(Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;)V",
        "onCallStateChanged",
        "",
        "state",
        "",
        "incomingNumber",
        "",
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
.field public final synthetic a:Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$c;->a:Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

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
.method public onCallStateChanged(ILjava/lang/String;)V
    .locals 3
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Landroid/telephony/PhoneStateListener;->onCallStateChanged(ILjava/lang/String;)V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$c;->a:Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;->c(Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;)Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    const-string v2, "onCallStateChanged, state:"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v2, ", incomingNumber:"

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    move-result-object p2

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p2}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 38
    .line 39
    if-eqz p1, :cond_1

    .line 40
    const/4 p2, 0x2

    .line 41
    .line 42
    if-eq p1, p2, :cond_0

    .line 43
    .line 44
    iget-object p1, p0, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$c;->a:Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;

    .line 45
    .line 46
    .line 47
    invoke-static {p1}, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;->f(Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;)V

    .line 48
    return-void

    .line 49
    .line 50
    :cond_0
    iget-object p1, p0, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$c;->a:Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;->t()V

    .line 54
    return-void

    .line 55
    .line 56
    :cond_1
    iget-object p1, p0, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$c;->a:Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;

    .line 57
    .line 58
    .line 59
    invoke-static {p1}, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;->f(Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;)V

    .line 60
    return-void
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
