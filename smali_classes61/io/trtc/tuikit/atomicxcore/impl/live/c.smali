.class public final Lio/trtc/tuikit/atomicxcore/impl/live/c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;


# direct methods
.method public constructor <init>(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/c;->a:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;

    .line 3
    const/4 p1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    return-void
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
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    .line 2
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;

    .line 3
    .line 4
    const-string v0, "$this$notify"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/c;->a:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;

    .line 10
    .line 11
    const-string v1, "battleInfo"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    new-instance v2, Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;

    .line 17
    .line 18
    iget-object v3, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;->battleId:Ljava/lang/String;

    .line 19
    .line 20
    const-string v1, "battleId"

    .line 21
    .line 22
    .line 23
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    iget-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;->config:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;

    .line 26
    .line 27
    const-string v4, "config"

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    const-string v4, "battleConfig"

    .line 33
    .line 34
    .line 35
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    new-instance v4, Lio/trtc/tuikit/atomicxcore/api/live/BattleConfig;

    .line 38
    .line 39
    iget v5, v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;->duration:I

    .line 40
    .line 41
    iget-boolean v6, v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;->needResponse:Z

    .line 42
    .line 43
    iget-object v1, v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;->extensionInfo:Ljava/lang/String;

    .line 44
    .line 45
    const-string v7, "extensionInfo"

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {v4, v5, v6, v1}, Lio/trtc/tuikit/atomicxcore/api/live/BattleConfig;-><init>(IZLjava/lang/String;)V

    .line 52
    .line 53
    iget-wide v5, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;->startTime:J

    .line 54
    .line 55
    iget-wide v7, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;->endTime:J

    .line 56
    .line 57
    .line 58
    invoke-direct/range {v2 .. v8}, Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/BattleConfig;JJ)V

    .line 59
    .line 60
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleEndedReason;->TIME_OVER:Lio/trtc/tuikit/atomicxcore/api/live/BattleEndedReason;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v2, v0}, Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;->onBattleEnded(Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;Lio/trtc/tuikit/atomicxcore/api/live/BattleEndedReason;)V

    .line 64
    .line 65
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 66
    return-object p1
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
