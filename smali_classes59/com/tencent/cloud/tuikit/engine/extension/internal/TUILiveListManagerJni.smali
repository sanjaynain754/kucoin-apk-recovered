.class public Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni;
.super Ljava/lang/Object;
.source "TUILiveListManagerJni.java"


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "tuikit::extension"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfoListCallback;,
        Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfoCallback;,
        Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$ActionCallback;,
        Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfo;
    }
.end annotation


# instance fields
.field private mCategoryMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field private mNativeTUILiveListManagerJni:J

.field private final mObserverList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$Observer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(J)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni;->mCategoryMap:Ljava/util/HashMap;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni;->mObserverList:Ljava/util/List;

    .line 18
    .line 19
    iput-wide p1, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni;->mNativeTUILiveListManagerJni:J

    .line 20
    .line 21
    const-wide/16 v0, 0x0

    .line 22
    .line 23
    cmp-long v0, p1, v0

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-static {p1, p2, p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni;->nativeSetObserver(JLjava/lang/Object;)V

    .line 29
    :cond_0
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
.end method

.method private copyOnReadListeners()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$Observer;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni;->mObserverList:Ljava/util/List;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 8
    return-object v0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static createLiveInfo(Ljava/lang/String;Ljava/lang/String;[IZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;ZZIIILjava/lang/String;Z)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;
    .locals 12
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    move-object/from16 v0, p6

    move-object/from16 v1, p7

    move-object/from16 v2, p8

    move-wide/from16 v3, p9

    move-object/from16 v5, p11

    move-object/from16 v6, p13

    move/from16 v7, p14

    move/from16 v8, p15

    move/from16 v9, p18

    .line 1
    new-instance v10, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    invoke-direct {v10}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;-><init>()V

    .line 2
    iput-object v5, v10, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomId:Ljava/lang/String;

    .line 3
    invoke-static/range {p12 .. p12}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;

    move-result-object v11

    iput-object v11, v10, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomType:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;

    .line 4
    iput-object v6, v10, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->name:Ljava/lang/String;

    .line 5
    iput-boolean v7, v10, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isMessageDisableForAllUser:Z

    .line 6
    iput-boolean v8, v10, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isSeatEnabled:Z

    .line 7
    invoke-static/range {p17 .. p17}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    move-result-object v11

    iput-object v11, v10, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->seatMode:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    .line 8
    iput v9, v10, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->maxSeatCount:I

    .line 9
    iput-object v0, v10, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerId:Ljava/lang/String;

    .line 10
    iput-object v1, v10, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerName:Ljava/lang/String;

    .line 11
    iput-object v2, v10, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerAvatarUrl:Ljava/lang/String;

    .line 12
    iput-wide v3, v10, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->createTime:J

    .line 13
    new-instance v11, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

    invoke-direct {v11}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;-><init>()V

    .line 14
    iput-object v5, v11, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->roomId:Ljava/lang/String;

    .line 15
    iput-object v6, v11, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->name:Ljava/lang/String;

    move-object/from16 v5, p19

    .line 16
    iput-object v5, v11, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->notice:Ljava/lang/String;

    .line 17
    iput-boolean v7, v11, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->isMessageDisableForAllUser:Z

    .line 18
    iput-boolean p3, v11, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->isPublicVisible:Z

    .line 19
    iput-boolean v8, v11, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->isSeatEnabled:Z

    move/from16 v5, p20

    .line 20
    iput-boolean v5, v11, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->keepOwnerOnSeat:Z

    .line 21
    iput v9, v11, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->maxSeatCount:I

    move/from16 v5, p16

    .line 22
    iput v5, v11, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->seatLayoutTemplateId:I

    .line 23
    invoke-static/range {p17 .. p17}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    move-result-object v5

    iput-object v5, v11, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->seatMode:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    .line 24
    iput-object p0, v11, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->coverUrl:Ljava/lang/String;

    .line 25
    iput-object p1, v11, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->backgroundUrl:Ljava/lang/String;

    .line 26
    new-instance p0, Ljava/util/ArrayList;

    array-length p1, p2

    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    array-length p1, p2

    const/4 v5, 0x0

    :goto_0
    if-ge v5, p1, :cond_0

    aget v6, p2, v5

    .line 28
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {p0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 29
    :cond_0
    iput-object p0, v11, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->categoryList:Ljava/util/List;

    move/from16 p0, p4

    .line 30
    iput p0, v11, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->activityStatus:I

    .line 31
    iput-object v0, v11, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->ownerId:Ljava/lang/String;

    .line 32
    iput-object v1, v11, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->ownerName:Ljava/lang/String;

    .line 33
    iput-object v2, v11, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->ownerAvatarUrl:Ljava/lang/String;

    .line 34
    iput-wide v3, v11, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->createTime:J

    move/from16 p0, p5

    .line 35
    iput p0, v11, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->viewCount:I

    .line 36
    iput-object v10, v11, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->roomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    return-object v11
.end method

.method public static createLiveStatisticsData(IIIIIII)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;-><init>()V

    .line 6
    .line 7
    iput p0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;->totalViewers:I

    .line 8
    .line 9
    iput p1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;->totalGiftsSent:I

    .line 10
    .line 11
    iput p2, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;->totalGiftCoins:I

    .line 12
    .line 13
    iput p3, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;->totalUniqueGiftSenders:I

    .line 14
    .line 15
    iput p4, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;->totalLikesReceived:I

    .line 16
    .line 17
    iput p5, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;->totalMessageCount:I

    .line 18
    .line 19
    iput p6, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;->liveDuration:I

    .line 20
    return-object v0
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
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
.end method

.method private static native nativeFetchLiveList(JLjava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfoListCallback;)V
.end method

.method private static native nativeGetLiveInfo(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfoCallback;)V
.end method

.method private static native nativeSetLiveInfo(JLcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfo;ILcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$ActionCallback;)V
.end method

.method private static native nativeSetObserver(JLjava/lang/Object;)V
.end method


# virtual methods
.method public addObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$Observer;)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni;->mObserverList:Ljava/util/List;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni;->mObserverList:Ljava/util/List;

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    :cond_1
    :goto_0
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public createLiveInfoListResult(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Z[I[I[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[J[Ljava/lang/String;[I[Ljava/lang/String;[Z[Z[I[I[I[Ljava/lang/String;[Z)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoListResult;
    .locals 6
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    move-object/from16 v0, p11

    .line 1
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoListResult;

    invoke-direct {v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoListResult;-><init>()V

    .line 2
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoListResult;->liveInfoList:Ljava/util/List;

    .line 3
    iput-object p1, v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoListResult;->cursor:Ljava/lang/String;

    const/4 p1, 0x0

    .line 4
    :goto_0
    array-length v2, v0

    if-ge p1, v2, :cond_1

    .line 5
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    invoke-direct {v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;-><init>()V

    .line 6
    aget-object v3, v0, p1

    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomId:Ljava/lang/String;

    .line 7
    aget v3, p12, p1

    invoke-static {v3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;

    move-result-object v3

    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomType:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;

    .line 8
    aget-object v3, p13, p1

    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->name:Ljava/lang/String;

    .line 9
    aget-boolean v3, p14, p1

    iput-boolean v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isMessageDisableForAllUser:Z

    .line 10
    aget-boolean v3, p15, p1

    iput-boolean v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isSeatEnabled:Z

    .line 11
    aget v3, p17, p1

    invoke-static {v3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    move-result-object v3

    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->seatMode:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    .line 12
    aget v3, p18, p1

    iput v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->maxSeatCount:I

    .line 13
    aget-object v3, p7, p1

    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerId:Ljava/lang/String;

    .line 14
    aget-object v3, p8, p1

    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerName:Ljava/lang/String;

    .line 15
    aget-object v3, p9, p1

    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerAvatarUrl:Ljava/lang/String;

    .line 16
    aget-wide v3, p10, p1

    iput-wide v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->createTime:J

    .line 17
    new-instance v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

    invoke-direct {v3}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;-><init>()V

    .line 18
    aget-object v4, v0, p1

    iput-object v4, v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->roomId:Ljava/lang/String;

    .line 19
    aget-object v4, p13, p1

    iput-object v4, v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->name:Ljava/lang/String;

    .line 20
    aget-object v4, p19, p1

    iput-object v4, v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->notice:Ljava/lang/String;

    .line 21
    aget-boolean v4, p14, p1

    iput-boolean v4, v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->isMessageDisableForAllUser:Z

    .line 22
    aget-boolean v4, p4, p1

    iput-boolean v4, v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->isPublicVisible:Z

    .line 23
    aget-boolean v4, p15, p1

    iput-boolean v4, v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->isSeatEnabled:Z

    .line 24
    aget-boolean v4, p20, p1

    iput-boolean v4, v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->keepOwnerOnSeat:Z

    .line 25
    aget v4, p18, p1

    iput v4, v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->maxSeatCount:I

    .line 26
    aget v4, p16, p1

    iput v4, v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->seatLayoutTemplateId:I

    .line 27
    aget v4, p17, p1

    invoke-static {v4}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    move-result-object v4

    iput-object v4, v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->seatMode:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    .line 28
    aget-object v4, p2, p1

    iput-object v4, v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->coverUrl:Ljava/lang/String;

    .line 29
    aget-object v4, p3, p1

    iput-object v4, v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->backgroundUrl:Ljava/lang/String;

    .line 30
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni;->mCategoryMap:Ljava/util/HashMap;

    iget-object v5, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomId:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni;->mCategoryMap:Ljava/util/HashMap;

    iget-object v5, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomId:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto :goto_1

    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    iput-object v4, v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->categoryList:Ljava/util/List;

    .line 31
    aget v4, p5, p1

    iput v4, v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->activityStatus:I

    .line 32
    aget-object v4, p7, p1

    iput-object v4, v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->ownerId:Ljava/lang/String;

    .line 33
    aget-object v4, p8, p1

    iput-object v4, v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->ownerName:Ljava/lang/String;

    .line 34
    aget-object v4, p9, p1

    iput-object v4, v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->ownerAvatarUrl:Ljava/lang/String;

    .line 35
    aget-wide v4, p10, p1

    iput-wide v4, v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->createTime:J

    .line 36
    aget v4, p6, p1

    iput v4, v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->viewCount:I

    .line 37
    iput-object v2, v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->roomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 38
    iget-object v2, v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoListResult;->liveInfoList:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto/16 :goto_0

    .line 39
    :cond_1
    iget-object p1, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni;->mCategoryMap:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    return-object v1
.end method

.method public fetchLiveList(Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoListCallback;)V
    .locals 3

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni;->mNativeTUILiveListManagerJni:J

    .line 3
    .line 4
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfoListCallback;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2, p3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfoListCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoListCallback;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, p1, p2, v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni;->nativeFetchLiveList(JLjava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfoListCallback;)V

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
.end method

.method public getLiveInfo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;)V
    .locals 3

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni;->mNativeTUILiveListManagerJni:J

    .line 3
    .line 4
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfoCallback;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2, p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfoCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, p1, v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni;->nativeGetLiveInfo(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfoCallback;)V

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
.end method

.method public onLiveInfoChanged(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;I)V
    .locals 3
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->NAME:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->getValue()I

    .line 11
    move-result v2

    .line 12
    and-int/2addr v2, p2

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    :cond_0
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->NOTICE:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->getValue()I

    .line 23
    move-result v2

    .line 24
    and-int/2addr v2, p2

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    :cond_1
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->DISABLE_MESSAGE:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->getValue()I

    .line 35
    move-result v2

    .line 36
    and-int/2addr v2, p2

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    :cond_2
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->PUBLISH:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->getValue()I

    .line 47
    move-result v2

    .line 48
    and-int/2addr v2, p2

    .line 49
    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    .line 53
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    :cond_3
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->TAKE_SEAT_MODE:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->getValue()I

    .line 59
    move-result v2

    .line 60
    and-int/2addr v2, p2

    .line 61
    .line 62
    if-eqz v2, :cond_4

    .line 63
    .line 64
    .line 65
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    :cond_4
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->COVER_URL:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->getValue()I

    .line 71
    move-result v2

    .line 72
    and-int/2addr v2, p2

    .line 73
    .line 74
    if-eqz v2, :cond_5

    .line 75
    .line 76
    .line 77
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    :cond_5
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->BACKGROUND_URL:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->getValue()I

    .line 83
    move-result v2

    .line 84
    and-int/2addr v2, p2

    .line 85
    .line 86
    if-eqz v2, :cond_6

    .line 87
    .line 88
    .line 89
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    :cond_6
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->CATEGORY:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->getValue()I

    .line 95
    move-result v2

    .line 96
    and-int/2addr v2, p2

    .line 97
    .line 98
    if-eqz v2, :cond_7

    .line 99
    .line 100
    .line 101
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    :cond_7
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->ACTIVITY_STATUS:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->getValue()I

    .line 107
    move-result v2

    .line 108
    and-int/2addr v2, p2

    .line 109
    .line 110
    if-eqz v2, :cond_8

    .line 111
    .line 112
    .line 113
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    :cond_8
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->SEAT_LAYOUT_TEMPLATE_ID:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->getValue()I

    .line 119
    move-result v2

    .line 120
    and-int/2addr p2, v2

    .line 121
    .line 122
    if-eqz p2, :cond_9

    .line 123
    .line 124
    .line 125
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    :cond_9
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni;->copyOnReadListeners()Ljava/util/List;

    .line 129
    move-result-object p2

    .line 130
    .line 131
    .line 132
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 133
    move-result-object p2

    .line 134
    .line 135
    .line 136
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    move-result v1

    .line 138
    .line 139
    if-eqz v1, :cond_a

    .line 140
    .line 141
    .line 142
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    move-result-object v1

    .line 144
    .line 145
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$Observer;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, p1, v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$Observer;->onLiveInfoChanged(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;Ljava/util/List;)V

    .line 149
    goto :goto_0

    .line 150
    :cond_a
    return-void
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
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public onLiveStatisticsChanged(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;I)V
    .locals 3
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;->TOTAL_VIEWERS:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;->getValue()I

    .line 11
    move-result v2

    .line 12
    and-int/2addr v2, p3

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    :cond_0
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;->TOTAL_GIFTS_SENT:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;->getValue()I

    .line 23
    move-result v2

    .line 24
    and-int/2addr v2, p3

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    :cond_1
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;->TOTAL_GIFT_COINS:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;->getValue()I

    .line 35
    move-result v2

    .line 36
    and-int/2addr v2, p3

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    :cond_2
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;->TOTAL_UNIQUE_GIFT_SENDERS:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;->getValue()I

    .line 47
    move-result v2

    .line 48
    and-int/2addr v2, p3

    .line 49
    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    .line 53
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    :cond_3
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;->TOTAL_LIKES_RECEIVED:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;->getValue()I

    .line 59
    move-result v2

    .line 60
    and-int/2addr v2, p3

    .line 61
    .line 62
    if-eqz v2, :cond_4

    .line 63
    .line 64
    .line 65
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    :cond_4
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;->TOTAL_MESSAGE_COUNT:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;->getValue()I

    .line 71
    move-result v2

    .line 72
    and-int/2addr p3, v2

    .line 73
    .line 74
    if-eqz p3, :cond_5

    .line 75
    .line 76
    .line 77
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    :cond_5
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni;->copyOnReadListeners()Ljava/util/List;

    .line 81
    move-result-object p3

    .line 82
    .line 83
    .line 84
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 85
    move-result-object p3

    .line 86
    .line 87
    .line 88
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    move-result v1

    .line 90
    .line 91
    if-eqz v1, :cond_6

    .line 92
    .line 93
    .line 94
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    move-result-object v1

    .line 96
    .line 97
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$Observer;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, p1, p2, v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$Observer;->onLiveStatisticsChanged(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;Ljava/util/List;)V

    .line 101
    goto :goto_0

    .line 102
    :cond_6
    return-void
    .line 103
    .line 104
    .line 105
.end method

.method public removeObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$Observer;)V
    .locals 1

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni;->mObserverList:Ljava/util/List;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

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
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setLiveInfo(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni;->mNativeTUILiveListManagerJni:J

    .line 3
    .line 4
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfo;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2, p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfo;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;)V

    .line 8
    .line 9
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$ActionCallback;

    .line 10
    .line 11
    .line 12
    invoke-direct {p1, p3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, v2, p2, p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni;->nativeSetLiveInfo(JLcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfo;ILcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$ActionCallback;)V

    .line 16
    return-void
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
.end method

.method public stashLiveInfoCategoryList(Ljava/lang/String;[I)V
    .locals 4
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    array-length v1, p2

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 7
    array-length v1, p2

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    :goto_0
    if-ge v2, v1, :cond_0

    .line 11
    .line 12
    aget v3, p2, v2

    .line 13
    .line 14
    .line 15
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    move-result-object v3

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_0
    iget-object p2, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni;->mCategoryMap:Ljava/util/HashMap;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method
