.class public final Lio/trtc/tuikit/atomicxcore/impl/live/h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;

.field public final synthetic b:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

.field public final synthetic c:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;


# direct methods
.method public constructor <init>(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/h;->a:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/h;->b:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    .line 5
    .line 6
    iput-object p3, p0, Lio/trtc/tuikit/atomicxcore/impl/live/h;->c:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    .line 7
    const/4 p1, 0x1

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

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


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

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
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/h;->a:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;->battleId:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "battleId"

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/h;->b:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/impl/live/a;->a(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;)Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/h;->c:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    .line 25
    .line 26
    .line 27
    invoke-static {v2}, Lio/trtc/tuikit/atomicxcore/impl/live/a;->a(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;)Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;->onBattleRequestTimeout(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)V

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 34
    return-object p1
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
