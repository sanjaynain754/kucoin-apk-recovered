.class public final Lio/trtc/tuikit/atomicxcore/impl/live/E0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$StopLiveCallback;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/live/N0;

.field public final synthetic b:Lio/trtc/tuikit/atomicxcore/api/live/StopLiveCompletionHandler;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/live/N0;Lio/trtc/tuikit/atomicxcore/api/live/StopLiveCompletionHandler;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/E0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/E0;->b:Lio/trtc/tuikit/atomicxcore/api/live/StopLiveCompletionHandler;

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
    .locals 27

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    const-string v3, "error"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    const-string v3, "message"

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    iget-object v4, v0, Lio/trtc/tuikit/atomicxcore/impl/live/E0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 19
    .line 20
    iget-object v4, v4, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->d:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 21
    .line 22
    new-instance v5, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v6, "endLive onError: "

    .line 25
    .line 26
    .line 27
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v6, ", "

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    move-result-object v5

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    const/4 v3, 0x2

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, v3, v5}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 53
    .line 54
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/E0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 55
    .line 56
    iget-object v3, v3, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->c:Lkotlinx/coroutines/flow/n;

    .line 57
    .line 58
    new-instance v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 59
    .line 60
    .line 61
    const v25, 0x7ffff

    .line 62
    .line 63
    const/16 v26, 0x0

    .line 64
    const/4 v5, 0x0

    .line 65
    const/4 v6, 0x0

    .line 66
    const/4 v7, 0x0

    .line 67
    const/4 v8, 0x0

    .line 68
    const/4 v9, 0x0

    .line 69
    const/4 v10, 0x0

    .line 70
    const/4 v11, 0x0

    .line 71
    const/4 v12, 0x0

    .line 72
    const/4 v13, 0x0

    .line 73
    const/4 v14, 0x0

    .line 74
    const/4 v15, 0x0

    .line 75
    .line 76
    const/16 v16, 0x0

    .line 77
    .line 78
    const/16 v17, 0x0

    .line 79
    .line 80
    const/16 v18, 0x0

    .line 81
    .line 82
    const/16 v19, 0x0

    .line 83
    .line 84
    const-wide/16 v20, 0x0

    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const/16 v23, 0x0

    .line 89
    .line 90
    const/16 v24, 0x0

    .line 91
    .line 92
    .line 93
    invoke-direct/range {v4 .. v26}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZILio/trtc/tuikit/atomicxcore/api/live/TakeSeatMode;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ILio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;JIZLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v3, v4}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 97
    .line 98
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/E0;->b:Lio/trtc/tuikit/atomicxcore/api/live/StopLiveCompletionHandler;

    .line 99
    .line 100
    if-eqz v3, :cond_0

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->getValue()I

    .line 104
    move-result v1

    .line 105
    .line 106
    .line 107
    invoke-interface {v3, v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/StopLiveCompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 108
    :cond_0
    return-void
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

.method public final onSuccess(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;)V
    .locals 26

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    const-string/jumbo v2, "statisticData"

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/live/E0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 13
    .line 14
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->d:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 15
    .line 16
    const-string v3, "message"

    .line 17
    const/4 v4, 0x0

    .line 18
    .line 19
    const-string v5, "endLive onSuccess"

    .line 20
    .line 21
    .line 22
    invoke-static {v2, v5, v3, v4, v5}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 23
    .line 24
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/live/E0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 25
    .line 26
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->c:Lkotlinx/coroutines/flow/n;

    .line 27
    .line 28
    new-instance v3, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 29
    .line 30
    .line 31
    const v24, 0x7ffff

    .line 32
    .line 33
    const/16 v25, 0x0

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v8, 0x0

    .line 39
    const/4 v9, 0x0

    .line 40
    const/4 v10, 0x0

    .line 41
    const/4 v11, 0x0

    .line 42
    const/4 v12, 0x0

    .line 43
    const/4 v13, 0x0

    .line 44
    const/4 v14, 0x0

    .line 45
    const/4 v15, 0x0

    .line 46
    .line 47
    const/16 v16, 0x0

    .line 48
    .line 49
    const/16 v17, 0x0

    .line 50
    .line 51
    const/16 v18, 0x0

    .line 52
    .line 53
    const-wide/16 v19, 0x0

    .line 54
    .line 55
    const/16 v21, 0x0

    .line 56
    .line 57
    const/16 v22, 0x0

    .line 58
    .line 59
    const/16 v23, 0x0

    .line 60
    .line 61
    .line 62
    invoke-direct/range {v3 .. v25}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZILio/trtc/tuikit/atomicxcore/api/live/TakeSeatMode;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ILio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;JIZLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v2, v3}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 66
    .line 67
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/live/E0;->b:Lio/trtc/tuikit/atomicxcore/api/live/StopLiveCompletionHandler;

    .line 68
    .line 69
    if-eqz v2, :cond_0

    .line 70
    .line 71
    .line 72
    invoke-interface {v2, v1}, Lio/trtc/tuikit/atomicxcore/api/live/StopLiveCompletionHandler;->onSuccess(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;)V

    .line 73
    :cond_0
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
