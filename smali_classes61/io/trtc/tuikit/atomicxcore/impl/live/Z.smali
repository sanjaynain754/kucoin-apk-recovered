.class public final Lio/trtc/tuikit/atomicxcore/impl/live/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoListCallback;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/live/c0;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Z;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Z;->b:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Z;->c:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    return-void
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
.method public final onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "error"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "message"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Z;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 13
    .line 14
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->i:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 15
    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v3, "getCoHostCandidates onError: "

    .line 19
    .line 20
    .line 21
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v3, ", "

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    const/4 v0, 0x2

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v0, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 47
    .line 48
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Z;->c:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 49
    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->getValue()I

    .line 54
    move-result p1

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 58
    :cond_0
    return-void
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

.method public final onSuccess(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoListResult;)V
    .locals 22

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "result"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/live/Z;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 12
    .line 13
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->i:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 14
    .line 15
    const-string v3, "message"

    .line 16
    const/4 v4, 0x0

    .line 17
    .line 18
    const-string v5, "getCoHostCandidates onSuccess"

    .line 19
    .line 20
    .line 21
    invoke-static {v2, v5, v3, v4, v5}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 22
    .line 23
    iget-object v2, v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoListResult;->liveInfoList:Ljava/util/List;

    .line 24
    .line 25
    iget-object v1, v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoListResult;->cursor:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/Z;->b:Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 31
    move-result v3

    .line 32
    .line 33
    const-string v4, "liveInfo"

    .line 34
    .line 35
    if-nez v3, :cond_2

    .line 36
    .line 37
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/Z;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 38
    .line 39
    iget-object v3, v3, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->e:Lkotlinx/coroutines/flow/n;

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-interface {v3}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 43
    move-result-object v5

    .line 44
    move-object v6, v5

    .line 45
    .line 46
    check-cast v6, Ljava/util/List;

    .line 47
    .line 48
    .line 49
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 50
    .line 51
    new-instance v6, Ljava/util/ArrayList;

    .line 52
    .line 53
    .line 54
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    move-result-object v7

    .line 59
    .line 60
    .line 61
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    move-result v8

    .line 63
    .line 64
    if-eqz v8, :cond_1

    .line 65
    .line 66
    .line 67
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    move-result-object v8

    .line 69
    .line 70
    check-cast v8, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

    .line 71
    .line 72
    .line 73
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    iget-object v14, v8, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->roomId:Ljava/lang/String;

    .line 79
    .line 80
    iget-object v10, v8, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->ownerId:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v11, v8, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->ownerName:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v12, v8, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->ownerAvatarUrl:Ljava/lang/String;

    .line 85
    .line 86
    new-instance v9, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 87
    .line 88
    .line 89
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 99
    .line 100
    const/16 v20, 0x3e8

    .line 101
    .line 102
    const/16 v21, 0x0

    .line 103
    const/4 v13, 0x0

    .line 104
    const/4 v15, 0x0

    .line 105
    .line 106
    const/16 v16, 0x0

    .line 107
    .line 108
    const/16 v17, 0x0

    .line 109
    .line 110
    const/16 v18, 0x0

    .line 111
    .line 112
    const/16 v19, 0x0

    .line 113
    .line 114
    .line 115
    invoke-direct/range {v9 .. v21}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/Role;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/live/SuspendStatus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    goto :goto_0

    .line 120
    .line 121
    .line 122
    :cond_1
    invoke-interface {v3, v5, v6}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    move-result v5

    .line 124
    .line 125
    if-eqz v5, :cond_0

    .line 126
    .line 127
    goto/16 :goto_5

    .line 128
    .line 129
    :cond_2
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/Z;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 130
    .line 131
    .line 132
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 139
    move-result v5

    .line 140
    .line 141
    if-eqz v5, :cond_3

    .line 142
    .line 143
    goto/16 :goto_5

    .line 144
    .line 145
    :cond_3
    iget-object v5, v3, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->e:Lkotlinx/coroutines/flow/n;

    .line 146
    .line 147
    .line 148
    invoke-interface {v5}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 149
    move-result-object v5

    .line 150
    .line 151
    check-cast v5, Ljava/lang/Iterable;

    .line 152
    .line 153
    new-instance v6, Ljava/util/ArrayList;

    .line 154
    .line 155
    const/16 v7, 0xa

    .line 156
    .line 157
    .line 158
    invoke-static {v5, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 159
    move-result v8

    .line 160
    .line 161
    .line 162
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 166
    move-result-object v5

    .line 167
    .line 168
    .line 169
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    move-result v8

    .line 171
    .line 172
    if-eqz v8, :cond_4

    .line 173
    .line 174
    .line 175
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    move-result-object v8

    .line 177
    .line 178
    check-cast v8, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v8}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getLiveID()Ljava/lang/String;

    .line 182
    move-result-object v8

    .line 183
    .line 184
    .line 185
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    goto :goto_1

    .line 187
    .line 188
    .line 189
    :cond_4
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 190
    move-result-object v5

    .line 191
    .line 192
    iget-object v6, v3, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->d:Lkotlinx/coroutines/flow/n;

    .line 193
    .line 194
    .line 195
    invoke-interface {v6}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 196
    move-result-object v6

    .line 197
    .line 198
    check-cast v6, Ljava/lang/Iterable;

    .line 199
    .line 200
    new-instance v8, Ljava/util/ArrayList;

    .line 201
    .line 202
    .line 203
    invoke-static {v6, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 204
    move-result v9

    .line 205
    .line 206
    .line 207
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 208
    .line 209
    .line 210
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 211
    move-result-object v6

    .line 212
    .line 213
    .line 214
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 215
    move-result v9

    .line 216
    .line 217
    if-eqz v9, :cond_5

    .line 218
    .line 219
    .line 220
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 221
    move-result-object v9

    .line 222
    .line 223
    check-cast v9, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v9}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getLiveID()Ljava/lang/String;

    .line 227
    move-result-object v9

    .line 228
    .line 229
    .line 230
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    goto :goto_2

    .line 232
    .line 233
    .line 234
    :cond_5
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 235
    move-result-object v6

    .line 236
    .line 237
    .line 238
    invoke-static {v5, v6}, Lkotlin/collections/SetsKt;->plus(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 239
    move-result-object v5

    .line 240
    .line 241
    new-instance v6, Ljava/util/ArrayList;

    .line 242
    .line 243
    .line 244
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 245
    .line 246
    .line 247
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 248
    move-result-object v2

    .line 249
    .line 250
    .line 251
    :cond_6
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 252
    move-result v8

    .line 253
    .line 254
    if-eqz v8, :cond_7

    .line 255
    .line 256
    .line 257
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 258
    move-result-object v8

    .line 259
    move-object v9, v8

    .line 260
    .line 261
    check-cast v9, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

    .line 262
    .line 263
    iget-object v9, v9, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->roomId:Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    invoke-interface {v5, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 267
    move-result v9

    .line 268
    .line 269
    if-nez v9, :cond_6

    .line 270
    .line 271
    .line 272
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 273
    goto :goto_3

    .line 274
    .line 275
    .line 276
    :cond_7
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 277
    move-result v2

    .line 278
    .line 279
    if-eqz v2, :cond_8

    .line 280
    goto :goto_5

    .line 281
    .line 282
    :cond_8
    new-instance v2, Ljava/util/ArrayList;

    .line 283
    .line 284
    .line 285
    invoke-static {v6, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 286
    move-result v5

    .line 287
    .line 288
    .line 289
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 293
    move-result-object v5

    .line 294
    .line 295
    .line 296
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 297
    move-result v6

    .line 298
    .line 299
    if-eqz v6, :cond_9

    .line 300
    .line 301
    .line 302
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 303
    move-result-object v6

    .line 304
    .line 305
    check-cast v6, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

    .line 306
    .line 307
    .line 308
    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 309
    .line 310
    iget-object v12, v6, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->roomId:Ljava/lang/String;

    .line 311
    .line 312
    iget-object v8, v6, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->ownerId:Ljava/lang/String;

    .line 313
    .line 314
    iget-object v9, v6, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->ownerName:Ljava/lang/String;

    .line 315
    .line 316
    iget-object v10, v6, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->ownerAvatarUrl:Ljava/lang/String;

    .line 317
    .line 318
    new-instance v7, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 319
    .line 320
    .line 321
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 331
    .line 332
    const/16 v18, 0x3e8

    .line 333
    .line 334
    const/16 v19, 0x0

    .line 335
    const/4 v11, 0x0

    .line 336
    const/4 v13, 0x0

    .line 337
    const/4 v14, 0x0

    .line 338
    const/4 v15, 0x0

    .line 339
    .line 340
    const/16 v16, 0x0

    .line 341
    .line 342
    const/16 v17, 0x0

    .line 343
    .line 344
    .line 345
    invoke-direct/range {v7 .. v19}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/Role;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/live/SuspendStatus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 349
    goto :goto_4

    .line 350
    .line 351
    :cond_9
    iget-object v3, v3, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->e:Lkotlinx/coroutines/flow/n;

    .line 352
    .line 353
    .line 354
    :cond_a
    invoke-interface {v3}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 355
    move-result-object v4

    .line 356
    move-object v5, v4

    .line 357
    .line 358
    check-cast v5, Ljava/util/List;

    .line 359
    .line 360
    .line 361
    invoke-static {v5, v2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 362
    move-result-object v5

    .line 363
    .line 364
    .line 365
    invoke-interface {v3, v4, v5}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 366
    move-result v4

    .line 367
    .line 368
    if-eqz v4, :cond_a

    .line 369
    .line 370
    :goto_5
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/live/Z;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 371
    .line 372
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->f:Lkotlinx/coroutines/flow/n;

    .line 373
    .line 374
    .line 375
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    invoke-interface {v2, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 379
    .line 380
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/live/Z;->c:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 381
    .line 382
    if-eqz v1, :cond_b

    .line 383
    .line 384
    .line 385
    invoke-interface {v1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onSuccess()V

    .line 386
    :cond_b
    return-void
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
.end method
