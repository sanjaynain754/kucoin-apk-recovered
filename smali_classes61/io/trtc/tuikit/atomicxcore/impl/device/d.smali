.class public final Lio/trtc/tuikit/atomicxcore/impl/device/d;
.super Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;
.source "SourceFile"


# static fields
.field public static final h:Lkotlin/Lazy;


# instance fields
.field public final a:Lkotlinx/coroutines/flow/n;

.field public final b:Lkotlinx/coroutines/flow/n;

.field public final c:Lkotlinx/coroutines/flow/n;

.field public final d:Lkotlinx/coroutines/flow/n;

.field public final e:Lio/trtc/tuikit/atomicxcore/impl/common/r;

.field public final f:Lcom/tencent/liteav/audio/TXAudioEffectManager;

.field public final g:Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectState;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/b;->a:Lio/trtc/tuikit/atomicxcore/impl/device/b;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sput-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 9
    return-void
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
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/AudioChangerType;->NONE:Lio/trtc/tuikit/atomicxcore/api/device/AudioChangerType;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->a:Lkotlinx/coroutines/flow/n;

    .line 12
    .line 13
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/AudioReverbType;->NONE:Lio/trtc/tuikit/atomicxcore/api/device/AudioReverbType;

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->b:Lkotlinx/coroutines/flow/n;

    .line 20
    .line 21
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    invoke-static {v2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->c:Lkotlinx/coroutines/flow/n;

    .line 28
    .line 29
    const/16 v3, 0x64

    .line 30
    .line 31
    .line 32
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    .line 36
    invoke-static {v3}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 37
    move-result-object v3

    .line 38
    .line 39
    iput-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->d:Lkotlinx/coroutines/flow/n;

    .line 40
    .line 41
    const-string v4, "file"

    .line 42
    .line 43
    const-string v5, "AtomicXCore-Live"

    .line 44
    .line 45
    const-string v6, "AudioEffectStoreImpl"

    .line 46
    .line 47
    .line 48
    invoke-static {v6, v4, v5, v6}, Lio/trtc/tuikit/atomicxcore/api/view/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 49
    move-result-object v4

    .line 50
    .line 51
    iput-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->e:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 55
    move-result-object v4

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getTRTCCloud()Lcom/tencent/trtc/TRTCCloud;

    .line 59
    move-result-object v4

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Lcom/tencent/trtc/TRTCCloud;->getAudioEffectManager()Lcom/tencent/liteav/audio/TXAudioEffectManager;

    .line 63
    move-result-object v4

    .line 64
    .line 65
    iput-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->f:Lcom/tencent/liteav/audio/TXAudioEffectManager;

    .line 66
    .line 67
    new-instance v4, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectState;

    .line 68
    .line 69
    .line 70
    invoke-direct {v4, v0, v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectState;-><init>(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V

    .line 71
    .line 72
    iput-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->g:Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectState;

    .line 73
    return-void
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
.end method


# virtual methods
.method public final getAudioEffectState()Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectState;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->g:Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectState;

    .line 3
    return-object v0
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
.end method

.method public final reset()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->e:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    const-string v1, "API: reset called"

    .line 5
    .line 6
    const-string v2, "message"

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 11
    .line 12
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/AudioChangerType;->NONE:Lio/trtc/tuikit/atomicxcore/api/device/AudioChangerType;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/device/d;->setAudioChangerType(Lio/trtc/tuikit/atomicxcore/api/device/AudioChangerType;)V

    .line 16
    .line 17
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/AudioReverbType;->NONE:Lio/trtc/tuikit/atomicxcore/api/device/AudioReverbType;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/device/d;->setAudioReverbType(Lio/trtc/tuikit/atomicxcore/api/device/AudioReverbType;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v3}, Lio/trtc/tuikit/atomicxcore/impl/device/d;->setVoiceEarMonitorEnable(Z)V

    .line 24
    .line 25
    const/16 v0, 0x64

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/device/d;->setVoiceEarMonitorVolume(I)V

    .line 29
    return-void
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
.end method

.method public final setAudioChangerType(Lio/trtc/tuikit/atomicxcore/api/device/AudioChangerType;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "type"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->e:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "API: setAudioChangerType called with type="

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v2, ", currentType="

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->a:Lkotlinx/coroutines/flow/n;

    .line 26
    .line 27
    .line 28
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    const-string v2, "message"

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    const/4 v2, 0x0

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 49
    .line 50
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->a:Lkotlinx/coroutines/flow/n;

    .line 51
    .line 52
    .line 53
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 54
    .line 55
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->f:Lcom/tencent/liteav/audio/TXAudioEffectManager;

    .line 56
    .line 57
    const-string v1, "audioChangerType"

    .line 58
    .line 59
    .line 60
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/device/a;->a:[I

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 66
    move-result p1

    .line 67
    .line 68
    aget p1, v1, p1

    .line 69
    .line 70
    .line 71
    packed-switch p1, :pswitch_data_0

    .line 72
    .line 73
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 74
    .line 75
    .line 76
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 77
    throw p1

    .line 78
    .line 79
    :pswitch_0
    sget-object p1, Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;->TXLiveVoiceChangerType_11:Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;

    .line 80
    goto :goto_0

    .line 81
    .line 82
    :pswitch_1
    sget-object p1, Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;->TXLiveVoiceChangerType_10:Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;

    .line 83
    goto :goto_0

    .line 84
    .line 85
    :pswitch_2
    sget-object p1, Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;->TXLiveVoiceChangerType_9:Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;

    .line 86
    goto :goto_0

    .line 87
    .line 88
    :pswitch_3
    sget-object p1, Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;->TXLiveVoiceChangerType_8:Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;

    .line 89
    goto :goto_0

    .line 90
    .line 91
    :pswitch_4
    sget-object p1, Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;->TXLiveVoiceChangerType_7:Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;

    .line 92
    goto :goto_0

    .line 93
    .line 94
    :pswitch_5
    sget-object p1, Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;->TXLiveVoiceChangerType_6:Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;

    .line 95
    goto :goto_0

    .line 96
    .line 97
    :pswitch_6
    sget-object p1, Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;->TXLiveVoiceChangerType_5:Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;

    .line 98
    goto :goto_0

    .line 99
    .line 100
    :pswitch_7
    sget-object p1, Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;->TXLiveVoiceChangerType_4:Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;

    .line 101
    goto :goto_0

    .line 102
    .line 103
    :pswitch_8
    sget-object p1, Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;->TXLiveVoiceChangerType_3:Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;

    .line 104
    goto :goto_0

    .line 105
    .line 106
    :pswitch_9
    sget-object p1, Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;->TXLiveVoiceChangerType_2:Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;

    .line 107
    goto :goto_0

    .line 108
    .line 109
    :pswitch_a
    sget-object p1, Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;->TXLiveVoiceChangerType_1:Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;

    .line 110
    goto :goto_0

    .line 111
    .line 112
    :pswitch_b
    sget-object p1, Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;->TXLiveVoiceChangerType_0:Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;

    .line 113
    .line 114
    .line 115
    :goto_0
    invoke-interface {v0, p1}, Lcom/tencent/liteav/audio/TXAudioEffectManager;->setVoiceChangerType(Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceChangerType;)V

    .line 116
    return-void

    .line 117
    .line 118
    .line 119
    .line 120
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final setAudioReverbType(Lio/trtc/tuikit/atomicxcore/api/device/AudioReverbType;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "type"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->e:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "API: setAudioReverbType called with type="

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v2, ", currentType="

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->b:Lkotlinx/coroutines/flow/n;

    .line 26
    .line 27
    .line 28
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    const-string v2, "message"

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    const/4 v2, 0x0

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 49
    .line 50
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->b:Lkotlinx/coroutines/flow/n;

    .line 51
    .line 52
    .line 53
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 54
    .line 55
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->f:Lcom/tencent/liteav/audio/TXAudioEffectManager;

    .line 56
    .line 57
    const-string v1, "audioReverbType"

    .line 58
    .line 59
    .line 60
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/device/a;->b:[I

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 66
    move-result p1

    .line 67
    .line 68
    aget p1, v1, p1

    .line 69
    .line 70
    .line 71
    packed-switch p1, :pswitch_data_0

    .line 72
    .line 73
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 74
    .line 75
    .line 76
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 77
    throw p1

    .line 78
    .line 79
    :pswitch_0
    sget-object p1, Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceReverbType;->TXLiveVoiceReverbType_7:Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceReverbType;

    .line 80
    goto :goto_0

    .line 81
    .line 82
    :pswitch_1
    sget-object p1, Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceReverbType;->TXLiveVoiceReverbType_6:Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceReverbType;

    .line 83
    goto :goto_0

    .line 84
    .line 85
    :pswitch_2
    sget-object p1, Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceReverbType;->TXLiveVoiceReverbType_5:Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceReverbType;

    .line 86
    goto :goto_0

    .line 87
    .line 88
    :pswitch_3
    sget-object p1, Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceReverbType;->TXLiveVoiceReverbType_4:Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceReverbType;

    .line 89
    goto :goto_0

    .line 90
    .line 91
    :pswitch_4
    sget-object p1, Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceReverbType;->TXLiveVoiceReverbType_3:Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceReverbType;

    .line 92
    goto :goto_0

    .line 93
    .line 94
    :pswitch_5
    sget-object p1, Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceReverbType;->TXLiveVoiceReverbType_2:Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceReverbType;

    .line 95
    goto :goto_0

    .line 96
    .line 97
    :pswitch_6
    sget-object p1, Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceReverbType;->TXLiveVoiceReverbType_1:Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceReverbType;

    .line 98
    goto :goto_0

    .line 99
    .line 100
    :pswitch_7
    sget-object p1, Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceReverbType;->TXLiveVoiceReverbType_0:Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceReverbType;

    .line 101
    .line 102
    .line 103
    :goto_0
    invoke-interface {v0, p1}, Lcom/tencent/liteav/audio/TXAudioEffectManager;->setVoiceReverbType(Lcom/tencent/liteav/audio/TXAudioEffectManager$TXVoiceReverbType;)V

    .line 104
    return-void

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final setVoiceEarMonitorEnable(Z)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->e:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: setVoiceEarMonitorEnable called with enable="

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, ", currentEnable="

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->c:Lkotlinx/coroutines/flow/n;

    .line 20
    .line 21
    .line 22
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    check-cast v2, Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    move-result v2

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    const-string v2, "message"

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    const/4 v2, 0x0

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 49
    .line 50
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->c:Lkotlinx/coroutines/flow/n;

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 58
    .line 59
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->f:Lcom/tencent/liteav/audio/TXAudioEffectManager;

    .line 60
    .line 61
    .line 62
    invoke-interface {v0, p1}, Lcom/tencent/liteav/audio/TXAudioEffectManager;->enableVoiceEarMonitor(Z)V

    .line 63
    return-void
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
.end method

.method public final setVoiceEarMonitorVolume(I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->e:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: setVoiceEarMonitorVolume called with volume="

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, ", enable="

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->c:Lkotlinx/coroutines/flow/n;

    .line 20
    .line 21
    .line 22
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    check-cast v2, Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    move-result v2

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    const-string v2, "message"

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    const/4 v2, 0x0

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 49
    .line 50
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->d:Lkotlinx/coroutines/flow/n;

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 58
    .line 59
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->f:Lcom/tencent/liteav/audio/TXAudioEffectManager;

    .line 60
    .line 61
    .line 62
    invoke-interface {v0, p1}, Lcom/tencent/liteav/audio/TXAudioEffectManager;->setVoiceEarMonitorVolume(I)V

    .line 63
    return-void
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
.end method
