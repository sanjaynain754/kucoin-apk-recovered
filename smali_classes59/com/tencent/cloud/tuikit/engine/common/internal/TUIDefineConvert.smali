.class public Lcom/tencent/cloud/tuikit/engine/common/internal/TUIDefineConvert;
.super Ljava/lang/Object;
.source "TUIDefineConvert.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "TUIDefineConvert"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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

.method public static convertJSONToRoomInfo(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;-><init>()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    const-string/jumbo v1, "roomId"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomId:Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    const-string/jumbo v1, "ownerId"

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerId:Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    const-string/jumbo v1, "ownerName"

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerName:Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    const-string/jumbo v1, "ownerAvatarUrl"

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerAvatarUrl:Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    const-string/jumbo v1, "roomType"

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 48
    move-result v1

    .line 49
    .line 50
    .line 51
    invoke-static {v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomType:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;

    .line 55
    .line 56
    .line 57
    const-string/jumbo v1, "roomName"

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    move-result-object v1

    .line 62
    .line 63
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->name:Ljava/lang/String;

    .line 64
    .line 65
    const-string v1, "cameraDisable"

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 69
    move-result v1

    .line 70
    .line 71
    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isCameraDisableForAllUser:Z

    .line 72
    .line 73
    .line 74
    const-string/jumbo v1, "microphoneDisable"

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 78
    move-result v1

    .line 79
    .line 80
    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isMicrophoneDisableForAllUser:Z

    .line 81
    .line 82
    .line 83
    const-string/jumbo v1, "screenShareDisable"

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 87
    move-result v1

    .line 88
    .line 89
    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isScreenShareDisableForAllUser:Z

    .line 90
    .line 91
    .line 92
    const-string/jumbo v1, "messageDisable"

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 96
    move-result v1

    .line 97
    .line 98
    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isMessageDisableForAllUser:Z

    .line 99
    .line 100
    const-string v1, "isSeatEnabled"

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 104
    move-result v1

    .line 105
    .line 106
    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isSeatEnabled:Z

    .line 107
    .line 108
    .line 109
    const-string/jumbo v1, "seatMode"

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 113
    move-result v1

    .line 114
    .line 115
    .line 116
    invoke-static {v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    .line 117
    move-result-object v1

    .line 118
    .line 119
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->seatMode:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    .line 120
    .line 121
    const-string v1, "maxSeatCount"

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 125
    move-result v1

    .line 126
    .line 127
    iput v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->maxSeatCount:I

    .line 128
    .line 129
    .line 130
    const-string/jumbo v1, "password"

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    move-result-object v1

    .line 135
    .line 136
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->password:Ljava/lang/String;

    .line 137
    .line 138
    const-string v1, "createTime"

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 142
    move-result-wide v1

    .line 143
    .line 144
    const-wide/16 v3, 0x3e8

    .line 145
    mul-long/2addr v1, v3

    .line 146
    .line 147
    iput-wide v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->createTime:J

    .line 148
    .line 149
    .line 150
    const-string/jumbo v1, "roomMemberCount"

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 154
    move-result p0

    .line 155
    .line 156
    iput p0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->memberCount:I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    return-object v0

    .line 158
    :catch_0
    move-exception p0

    .line 159
    .line 160
    new-instance v1, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    const-string v2, "convertJSONToRoomInfo error:"

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 172
    move-result-object p0

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    move-result-object p0

    .line 180
    .line 181
    const-string v1, "TUIDefineConvert"

    .line 182
    .line 183
    .line 184
    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    return-object v0
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
.end method

.method public static convertJSONToUserInfo(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;-><init>()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    const-string/jumbo v1, "userId"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userId:Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    const-string/jumbo v1, "userName"

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userName:Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    const-string/jumbo v1, "nameCard"

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->nameCard:Ljava/lang/String;

    .line 33
    .line 34
    const-string v1, "avatarUrl"

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->avatarUrl:Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    const-string/jumbo v1, "userRole"

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 47
    move-result v1

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userRole:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    .line 54
    .line 55
    const-string v1, "hasAudioStream"

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 59
    move-result v1

    .line 60
    .line 61
    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->hasAudioStream:Z

    .line 62
    .line 63
    const-string v1, "hasVideoStream"

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 67
    move-result v1

    .line 68
    .line 69
    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->hasVideoStream:Z

    .line 70
    .line 71
    const-string v1, "hasScreenStream"

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 75
    move-result v1

    .line 76
    .line 77
    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->hasScreenStream:Z

    .line 78
    .line 79
    const-string v1, "isMessageDisabled"

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 83
    move-result p0

    .line 84
    .line 85
    iput-boolean p0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->isMessageDisabled:Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    return-object v0

    .line 87
    :catch_0
    move-exception p0

    .line 88
    .line 89
    new-instance v1, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    .line 94
    const-string v2, "convertJSONToUserInfo error:"

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 101
    move-result-object p0

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    move-result-object p0

    .line 109
    .line 110
    const-string v1, "TUIDefineConvert"

    .line 111
    .line 112
    .line 113
    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    return-object v0
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
.end method

.method public static convertStringToRoomInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;
    .locals 2

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/common/internal/TUIDefineConvert;->convertJSONToRoomInfo(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 9
    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    return-object p0

    .line 11
    :catch_0
    move-exception p0

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    const-string v1, "convertStringToRoomInfo error:"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 25
    move-result-object p0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    const-string v0, "TUIDefineConvert"

    .line 35
    .line 36
    .line 37
    invoke-static {v0, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    new-instance p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 40
    .line 41
    .line 42
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;-><init>()V

    .line 43
    return-object p0
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

.method public static convertStringToUserInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;
    .locals 2

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/common/internal/TUIDefineConvert;->convertJSONToUserInfo(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 9
    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    return-object p0

    .line 11
    :catch_0
    move-exception p0

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    const-string v1, "convertStringToUserInfo error:"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 25
    move-result-object p0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    const-string v0, "TUIDefineConvert"

    .line 35
    .line 36
    .line 37
    invoke-static {v0, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    new-instance p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 40
    .line 41
    .line 42
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;-><init>()V

    .line 43
    return-object p0
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
