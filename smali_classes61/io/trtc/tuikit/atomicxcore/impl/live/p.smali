.class public final Lio/trtc/tuikit/atomicxcore/impl/live/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleRequestCallback;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/live/q;

.field public final synthetic b:Lio/trtc/tuikit/atomicxcore/api/live/BattleRequestCallback;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/live/q;Lio/trtc/tuikit/atomicxcore/api/live/BattleRequestCallback;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/p;->a:Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/p;->b:Lio/trtc/tuikit/atomicxcore/api/live/BattleRequestCallback;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
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
.end method


# virtual methods
.method public final onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "error"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "s"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/p;->a:Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 13
    .line 14
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->d:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v2, "Response: requestBattle failed code="

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->getValue()I

    .line 25
    move-result v2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v2, ", message="

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    const-string v2, "message"

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    const/4 v2, 0x2

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 53
    .line 54
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/p;->b:Lio/trtc/tuikit/atomicxcore/api/live/BattleRequestCallback;

    .line 55
    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->getValue()I

    .line 60
    move-result p1

    .line 61
    .line 62
    .line 63
    invoke-interface {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/live/BattleRequestCallback;->onError(ILjava/lang/String;)V

    .line 64
    :cond_0
    return-void
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
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
.end method

.method public final onSuccess(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;Ljava/util/Map;)V
    .locals 9

    .line 1
    .line 2
    const-string v0, "battleInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v1, "map"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/p;->a:Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 13
    .line 14
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/live/q;->d:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    const-string v2, "message"

    .line 20
    .line 21
    const-string v3, "Response: requestBattle success"

    .line 22
    .line 23
    .line 24
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    const/4 v2, 0x0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 29
    .line 30
    new-instance v1, Ljava/util/ArrayList;

    .line 31
    .line 32
    .line 33
    invoke-interface {p2}, Ljava/util/Map;->size()I

    .line 34
    move-result v2

    .line 35
    .line 36
    .line 37
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 41
    move-result-object p2

    .line 42
    .line 43
    .line 44
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 45
    move-result-object p2

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    move-result v2

    .line 50
    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    .line 54
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    move-result-object v2

    .line 56
    .line 57
    check-cast v2, Ljava/util/Map$Entry;

    .line 58
    .line 59
    .line 60
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 61
    move-result-object v3

    .line 62
    .line 63
    check-cast v3, Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 67
    move-result-object v2

    .line 68
    .line 69
    check-cast v2, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleCode;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleCode;->getValue()I

    .line 73
    move-result v2

    .line 74
    .line 75
    .line 76
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    move-result-object v2

    .line 78
    .line 79
    .line 80
    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 81
    move-result-object v2

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    goto :goto_0

    .line 86
    .line 87
    .line 88
    :cond_0
    invoke-static {v1}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 89
    move-result-object p2

    .line 90
    .line 91
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/p;->b:Lio/trtc/tuikit/atomicxcore/api/live/BattleRequestCallback;

    .line 92
    .line 93
    if-eqz v1, :cond_1

    .line 94
    .line 95
    .line 96
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    new-instance v2, Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;

    .line 99
    .line 100
    iget-object v3, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;->battleId:Ljava/lang/String;

    .line 101
    .line 102
    const-string v0, "battleId"

    .line 103
    .line 104
    .line 105
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    iget-object v0, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;->config:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;

    .line 108
    .line 109
    const-string v4, "config"

    .line 110
    .line 111
    .line 112
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    const-string v4, "battleConfig"

    .line 115
    .line 116
    .line 117
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    new-instance v4, Lio/trtc/tuikit/atomicxcore/api/live/BattleConfig;

    .line 120
    .line 121
    iget v5, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;->duration:I

    .line 122
    .line 123
    iget-boolean v6, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;->needResponse:Z

    .line 124
    .line 125
    iget-object v0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;->extensionInfo:Ljava/lang/String;

    .line 126
    .line 127
    const-string v7, "extensionInfo"

    .line 128
    .line 129
    .line 130
    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-direct {v4, v5, v6, v0}, Lio/trtc/tuikit/atomicxcore/api/live/BattleConfig;-><init>(IZLjava/lang/String;)V

    .line 134
    .line 135
    iget-wide v5, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;->startTime:J

    .line 136
    .line 137
    iget-wide v7, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;->endTime:J

    .line 138
    .line 139
    .line 140
    invoke-direct/range {v2 .. v8}, Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/BattleConfig;JJ)V

    .line 141
    .line 142
    .line 143
    invoke-interface {v1, v2, p2}, Lio/trtc/tuikit/atomicxcore/api/live/BattleRequestCallback;->onSuccess(Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;Ljava/util/Map;)V

    .line 144
    :cond_1
    return-void
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
.end method
