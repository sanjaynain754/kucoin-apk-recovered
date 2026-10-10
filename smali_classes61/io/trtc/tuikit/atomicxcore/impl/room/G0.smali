.class public final Lio/trtc/tuikit/atomicxcore/impl/room/G0;
.super Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/room/T0;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/G0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;-><init>()V

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
.method public final onAllUserCameraDisableChanged(Ljava/lang/String;Z)V
    .locals 24

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "roomID"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/G0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 12
    .line 13
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->c:Lkotlinx/coroutines/flow/n;

    .line 14
    .line 15
    .line 16
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;->getRoomID()Ljava/lang/String;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    move-result v1

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/G0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 32
    .line 33
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->c:Lkotlinx/coroutines/flow/n;

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 37
    move-result-object v2

    .line 38
    move-object v3, v2

    .line 39
    .line 40
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 41
    .line 42
    const/16 v22, 0x6fff

    .line 43
    .line 44
    const/16 v23, 0x0

    .line 45
    const/4 v4, 0x0

    .line 46
    const/4 v5, 0x0

    .line 47
    const/4 v6, 0x0

    .line 48
    const/4 v7, 0x0

    .line 49
    .line 50
    const-wide/16 v8, 0x0

    .line 51
    const/4 v10, 0x0

    .line 52
    .line 53
    const-wide/16 v11, 0x0

    .line 54
    .line 55
    const-wide/16 v13, 0x0

    .line 56
    const/4 v15, 0x0

    .line 57
    .line 58
    const/16 v16, 0x0

    .line 59
    .line 60
    const/16 v17, 0x0

    .line 61
    .line 62
    const/16 v18, 0x0

    .line 63
    .line 64
    const/16 v20, 0x0

    .line 65
    .line 66
    const/16 v21, 0x0

    .line 67
    .line 68
    move/from16 v19, p2

    .line 69
    .line 70
    .line 71
    invoke-static/range {v3 .. v23}, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;IJLio/trtc/tuikit/atomicxcore/api/room/RoomStatus;JJILjava/util/List;Ljava/lang/String;ZZZZILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 72
    move-result-object v3

    .line 73
    .line 74
    .line 75
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    move-result v2

    .line 77
    .line 78
    if-eqz v2, :cond_0

    .line 79
    :cond_1
    return-void
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

.method public final onAllUserMicrophoneDisableChanged(Ljava/lang/String;Z)V
    .locals 24

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "roomID"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/G0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 12
    .line 13
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->c:Lkotlinx/coroutines/flow/n;

    .line 14
    .line 15
    .line 16
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;->getRoomID()Ljava/lang/String;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    move-result v1

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/G0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 32
    .line 33
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->c:Lkotlinx/coroutines/flow/n;

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 37
    move-result-object v2

    .line 38
    move-object v3, v2

    .line 39
    .line 40
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 41
    .line 42
    const/16 v22, 0x77ff

    .line 43
    .line 44
    const/16 v23, 0x0

    .line 45
    const/4 v4, 0x0

    .line 46
    const/4 v5, 0x0

    .line 47
    const/4 v6, 0x0

    .line 48
    const/4 v7, 0x0

    .line 49
    .line 50
    const-wide/16 v8, 0x0

    .line 51
    const/4 v10, 0x0

    .line 52
    .line 53
    const-wide/16 v11, 0x0

    .line 54
    .line 55
    const-wide/16 v13, 0x0

    .line 56
    const/4 v15, 0x0

    .line 57
    .line 58
    const/16 v16, 0x0

    .line 59
    .line 60
    const/16 v17, 0x0

    .line 61
    .line 62
    const/16 v19, 0x0

    .line 63
    .line 64
    const/16 v20, 0x0

    .line 65
    .line 66
    const/16 v21, 0x0

    .line 67
    .line 68
    move/from16 v18, p2

    .line 69
    .line 70
    .line 71
    invoke-static/range {v3 .. v23}, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;IJLio/trtc/tuikit/atomicxcore/api/room/RoomStatus;JJILjava/util/List;Ljava/lang/String;ZZZZILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 72
    move-result-object v3

    .line 73
    .line 74
    .line 75
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    move-result v2

    .line 77
    .line 78
    if-eqz v2, :cond_0

    .line 79
    :cond_1
    return-void
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

.method public final onRoomNameChanged(Ljava/lang/String;Ljava/lang/String;)V
    .locals 24

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "roomID"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    const-string v2, "roomName"

    .line 12
    .line 13
    move-object/from16 v5, p2

    .line 14
    .line 15
    .line 16
    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/G0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 19
    .line 20
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->c:Lkotlinx/coroutines/flow/n;

    .line 21
    .line 22
    .line 23
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;->getRoomID()Ljava/lang/String;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    move-result v1

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/G0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 39
    .line 40
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->c:Lkotlinx/coroutines/flow/n;

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 44
    move-result-object v2

    .line 45
    move-object v3, v2

    .line 46
    .line 47
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 48
    .line 49
    const/16 v22, 0x7ffd

    .line 50
    .line 51
    const/16 v23, 0x0

    .line 52
    const/4 v4, 0x0

    .line 53
    const/4 v6, 0x0

    .line 54
    const/4 v7, 0x0

    .line 55
    .line 56
    const-wide/16 v8, 0x0

    .line 57
    const/4 v10, 0x0

    .line 58
    .line 59
    const-wide/16 v11, 0x0

    .line 60
    .line 61
    const-wide/16 v13, 0x0

    .line 62
    const/4 v15, 0x0

    .line 63
    .line 64
    const/16 v16, 0x0

    .line 65
    .line 66
    const/16 v17, 0x0

    .line 67
    .line 68
    const/16 v18, 0x0

    .line 69
    .line 70
    const/16 v19, 0x0

    .line 71
    .line 72
    const/16 v20, 0x0

    .line 73
    .line 74
    const/16 v21, 0x0

    .line 75
    .line 76
    .line 77
    invoke-static/range {v3 .. v23}, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;IJLio/trtc/tuikit/atomicxcore/api/room/RoomStatus;JJILjava/util/List;Ljava/lang/String;ZZZZILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 78
    move-result-object v3

    .line 79
    .line 80
    .line 81
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    move-result v2

    .line 83
    .line 84
    if-eqz v2, :cond_0

    .line 85
    goto :goto_1

    .line 86
    .line 87
    :cond_0
    move-object/from16 v5, p2

    .line 88
    goto :goto_0

    .line 89
    :cond_1
    :goto_1
    return-void
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

.method public final onRoomUserCountChanged(Ljava/lang/String;I)V
    .locals 24

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "roomId"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/G0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 12
    .line 13
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->c:Lkotlinx/coroutines/flow/n;

    .line 14
    .line 15
    .line 16
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;->getRoomID()Ljava/lang/String;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    move-result v1

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/G0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 32
    .line 33
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->c:Lkotlinx/coroutines/flow/n;

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 37
    move-result-object v2

    .line 38
    move-object v3, v2

    .line 39
    .line 40
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 41
    .line 42
    const/16 v22, 0x7ff7

    .line 43
    .line 44
    const/16 v23, 0x0

    .line 45
    const/4 v4, 0x0

    .line 46
    const/4 v5, 0x0

    .line 47
    const/4 v6, 0x0

    .line 48
    .line 49
    const-wide/16 v8, 0x0

    .line 50
    const/4 v10, 0x0

    .line 51
    .line 52
    const-wide/16 v11, 0x0

    .line 53
    .line 54
    const-wide/16 v13, 0x0

    .line 55
    const/4 v15, 0x0

    .line 56
    .line 57
    const/16 v16, 0x0

    .line 58
    .line 59
    const/16 v17, 0x0

    .line 60
    .line 61
    const/16 v18, 0x0

    .line 62
    .line 63
    const/16 v19, 0x0

    .line 64
    .line 65
    const/16 v20, 0x0

    .line 66
    .line 67
    const/16 v21, 0x0

    .line 68
    .line 69
    move/from16 v7, p2

    .line 70
    .line 71
    .line 72
    invoke-static/range {v3 .. v23}, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;IJLio/trtc/tuikit/atomicxcore/api/room/RoomStatus;JJILjava/util/List;Ljava/lang/String;ZZZZILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 73
    move-result-object v3

    .line 74
    .line 75
    .line 76
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    move-result v2

    .line 78
    .line 79
    if-eqz v2, :cond_0

    .line 80
    :cond_1
    return-void
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

.method public final onScreenShareForAllUserDisableChanged(Ljava/lang/String;Z)V
    .locals 24

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "roomID"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/G0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 12
    .line 13
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->c:Lkotlinx/coroutines/flow/n;

    .line 14
    .line 15
    .line 16
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;->getRoomID()Ljava/lang/String;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    move-result v1

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/G0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 32
    .line 33
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->c:Lkotlinx/coroutines/flow/n;

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 37
    move-result-object v2

    .line 38
    move-object v3, v2

    .line 39
    .line 40
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 41
    .line 42
    const/16 v22, 0x3fff

    .line 43
    .line 44
    const/16 v23, 0x0

    .line 45
    const/4 v4, 0x0

    .line 46
    const/4 v5, 0x0

    .line 47
    const/4 v6, 0x0

    .line 48
    const/4 v7, 0x0

    .line 49
    .line 50
    const-wide/16 v8, 0x0

    .line 51
    const/4 v10, 0x0

    .line 52
    .line 53
    const-wide/16 v11, 0x0

    .line 54
    .line 55
    const-wide/16 v13, 0x0

    .line 56
    const/4 v15, 0x0

    .line 57
    .line 58
    const/16 v16, 0x0

    .line 59
    .line 60
    const/16 v17, 0x0

    .line 61
    .line 62
    const/16 v18, 0x0

    .line 63
    .line 64
    const/16 v19, 0x0

    .line 65
    .line 66
    const/16 v20, 0x0

    .line 67
    .line 68
    move/from16 v21, p2

    .line 69
    .line 70
    .line 71
    invoke-static/range {v3 .. v23}, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;IJLio/trtc/tuikit/atomicxcore/api/room/RoomStatus;JJILjava/util/List;Ljava/lang/String;ZZZZILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 72
    move-result-object v3

    .line 73
    .line 74
    .line 75
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    move-result v2

    .line 77
    .line 78
    if-eqz v2, :cond_0

    .line 79
    :cond_1
    return-void
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

.method public final onSendMessageForAllUserDisableChanged(Ljava/lang/String;Z)V
    .locals 24

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "roomID"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/G0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 12
    .line 13
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->c:Lkotlinx/coroutines/flow/n;

    .line 14
    .line 15
    .line 16
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;->getRoomID()Ljava/lang/String;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    move-result v1

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/G0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 32
    .line 33
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->c:Lkotlinx/coroutines/flow/n;

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 37
    move-result-object v2

    .line 38
    move-object v3, v2

    .line 39
    .line 40
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 41
    .line 42
    const/16 v22, 0x5fff

    .line 43
    .line 44
    const/16 v23, 0x0

    .line 45
    const/4 v4, 0x0

    .line 46
    const/4 v5, 0x0

    .line 47
    const/4 v6, 0x0

    .line 48
    const/4 v7, 0x0

    .line 49
    .line 50
    const-wide/16 v8, 0x0

    .line 51
    const/4 v10, 0x0

    .line 52
    .line 53
    const-wide/16 v11, 0x0

    .line 54
    .line 55
    const-wide/16 v13, 0x0

    .line 56
    const/4 v15, 0x0

    .line 57
    .line 58
    const/16 v16, 0x0

    .line 59
    .line 60
    const/16 v17, 0x0

    .line 61
    .line 62
    const/16 v18, 0x0

    .line 63
    .line 64
    const/16 v19, 0x0

    .line 65
    .line 66
    const/16 v21, 0x0

    .line 67
    .line 68
    move/from16 v20, p2

    .line 69
    .line 70
    .line 71
    invoke-static/range {v3 .. v23}, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;IJLio/trtc/tuikit/atomicxcore/api/room/RoomStatus;JJILjava/util/List;Ljava/lang/String;ZZZZILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 72
    move-result-object v3

    .line 73
    .line 74
    .line 75
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    move-result v2

    .line 77
    .line 78
    if-eqz v2, :cond_0

    .line 79
    :cond_1
    return-void
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
