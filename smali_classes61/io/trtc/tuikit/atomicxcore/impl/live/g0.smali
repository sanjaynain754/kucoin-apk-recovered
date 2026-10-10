.class public final Lio/trtc/tuikit/atomicxcore/impl/live/g0;
.super Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$Observer;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/live/i0;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/live/i0;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/g0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$Observer;-><init>()V

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
.end method


# virtual methods
.method public final onReceiveLikesMessage(Ljava/lang/String;JLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "roomID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "sender"

    .line 8
    .line 9
    .line 10
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/g0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 13
    .line 14
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/i0;->b:Lkotlinx/coroutines/flow/n;

    .line 15
    .line 16
    .line 17
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p4}, Lio/trtc/tuikit/atomicxcore/impl/live/j0;->a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 25
    move-result-object p4

    .line 26
    .line 27
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/g0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 28
    .line 29
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/i0;->c:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 30
    .line 31
    const-string v1, "message"

    .line 32
    const/4 v2, 0x0

    .line 33
    .line 34
    const-string v3, "Listener: onReceiveLikesMessage called"

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v3, v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 38
    .line 39
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/g0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 40
    .line 41
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/i0;->d:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 42
    .line 43
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/f0;

    .line 44
    .line 45
    .line 46
    invoke-direct {v1, p1, p2, p3, p4}, Lio/trtc/tuikit/atomicxcore/impl/live/f0;-><init>(Ljava/lang/String;JLio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Lkotlin/jvm/functions/Function1;)V

    .line 50
    return-void
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
.end method
