.class public abstract Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;
.super Lcom/tencent/cloud/tuikit/engine/room/DeprecatedRoomEngineAPI;
.source "TUIRoomEngine.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/room/DeprecatedRoomEngineAPI;-><init>()V

    .line 4
    return-void
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
.end method

.method public static destroySharedInstance()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->destroySharedInstance()V

    .line 4
    return-void
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
.end method

.method public static getSelfInfo()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->getSelfInfo()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static login(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->login(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 4
    return-void
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
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
.end method

.method public static logout(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->logout(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 4
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static setSelfInfo(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 2
    invoke-static {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->setSelfInfo(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    return-void
.end method

.method public static setSelfInfo(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->setSelfInfo(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    return-void
.end method

.method public static sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method


# virtual methods
.method public abstract addCategoryTagForUsers(ILjava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;",
            ")V"
        }
    .end annotation
.end method

.method public abstract addObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V
.end method

.method public abstract applyToAdminToOpenLocalDevice(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;
.end method

.method public abstract callExperimentalAPI(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ExperimentalAPIResponseCallback;)Ljava/lang/Object;
.end method

.method public abstract cancelRequest(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract changeUserNameCard(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract changeUserRole(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract closeLocalCamera()V
.end method

.method public abstract closeLocalMicrophone()V
.end method

.method public abstract closeRemoteDeviceByAdmin(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract createRoom(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract destroyRoom(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract disableDeviceForAllUserByAdmin(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract disableSendingMessageByAdmin(Ljava/lang/String;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract disableSendingMessageForAllUser(ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract enableGravitySensor(Z)V
.end method

.method public abstract enableSystemAudioSharing(Z)V
.end method

.method public abstract enterRoom(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V
.end method

.method public abstract enterRoom(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$EnterRoomOptions;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V
.end method

.method public abstract enterRoom(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V
.end method

.method public abstract exitRoom(ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract fetchRoomInfo(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V
.end method

.method public abstract fetchRoomInfo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V
.end method

.method public abstract getBannedUserList(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)V
.end method

.method public abstract getExtension(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;)Ljava/lang/Object;
.end method

.method public abstract getLiveBattleManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;
.end method

.method public abstract getLiveConnectionManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager;
.end method

.method public abstract getMediaDeviceManager()Lcom/tencent/cloud/tuikit/engine/extension/TUIRoomDeviceManager;
.end method

.method public abstract getRoomMetadata(Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomMetadataCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomMetadataCallback;",
            ")V"
        }
    .end annotation
.end method

.method public abstract getSeatApplicationList(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestListCallback;)V
.end method

.method public abstract getSeatList(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetSeatListCallback;)V
.end method

.method public abstract getSongListManager()Lcom/tencent/cloud/tuikit/engine/extension/TUISongListManager;
.end method

.method public abstract getTRTCCloud()Lcom/tencent/trtc/TRTCCloud;
.end method

.method public abstract getUserInfo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserInfoCallback;)V
.end method

.method public abstract getUserList(JLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)V
.end method

.method public abstract getUserListByTag(IJLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)V
.end method

.method public abstract kickRemoteUserOutOfRoom(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract kickUserOffSeatByAdmin(ILjava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract leaveSeat(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract lockSeatByAdmin(ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract moveToSeat(ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract moveUserToSeatByAdmin(Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MoveSeatPolicy;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract muteLocalAudio()V
.end method

.method public abstract muteRemoteAudioStream(Ljava/lang/String;Z)V
.end method

.method public abstract openLocalCamera(ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract openLocalMicrophone(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract openRemoteDeviceByAdmin(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;
.end method

.method public abstract querySeatList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;",
            ">;"
        }
    .end annotation
.end method

.method public abstract removeCategoryTagForUsers(ILjava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;",
            ")V"
        }
    .end annotation
.end method

.method public abstract removeObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V
.end method

.method public abstract responseRemoteRequest(Ljava/lang/String;ZLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract searchUsers(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchParam;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchCallback;)V
.end method

.method public abstract sendCustomMessage(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SendCustomMessageCallback;)V
.end method

.method public abstract sendTextMessage(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SendTextMessageCallback;)V
.end method

.method public abstract setBeautyLevel(IF)V
.end method

.method public abstract setCustomInfoForUser(Ljava/lang/String;Ljava/util/HashMap;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "[B>;",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;",
            ")V"
        }
    .end annotation
.end method

.method public abstract setLocalVideoMuteImage(Landroid/graphics/Bitmap;)V
.end method

.method public abstract setLocalVideoView(Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V
.end method

.method public abstract setRemoteVideoView(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V
.end method

.method public abstract setRoomMetadataByAdmin(Ljava/util/HashMap;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;",
            ")V"
        }
    .end annotation
.end method

.method public abstract setVideoResolutionMode(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ResolutionMode;)V
.end method

.method public abstract setWhitenessLevel(F)V
.end method

.method public abstract startPlayRemoteVideo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$PlayCallback;)V
.end method

.method public abstract startPushLocalVideo()V
.end method

.method public abstract startScreenSharing()V
.end method

.method public abstract stopPlayRemoteVideo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;)V
.end method

.method public abstract stopPushLocalVideo()V
.end method

.method public abstract stopScreenSharing()V
.end method

.method public abstract takeSeat(IILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCompletion;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;
.end method

.method public abstract takeUserOnSeatByAdmin(ILjava/lang/String;ILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCompletion;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;
.end method

.method public abstract unmuteLocalAudio(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract updateAudioQuality(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;)V
.end method

.method public abstract updateRoomNameByAdmin(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract updateRoomPasswordByAdmin(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract updateRoomSeatModeByAdmin(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract updateVideoQuality(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;)V
.end method

.method public abstract updateVideoQualityEx(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomVideoEncoderParams;)V
.end method
