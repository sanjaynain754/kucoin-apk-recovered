.class public Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;
.super Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;
.source "TUIRoomEngineImpl.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "TUIRoomEngineImpl"

.field private static sAppContext:Landroid/content/Context;

.field private static sInstance:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;

.field private static final sMainHandler:Landroid/os/Handler;


# instance fields
.field private mObserverProxy:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;

.field private mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroid/os/Handler;

    .line 3
    .line 4
    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 10
    .line 11
    sput-object v0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->sMainHandler:Landroid/os/Handler;

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/f1;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/f1;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Z)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 12
    return-void
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

.method public static synthetic A(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->setLoginInfo(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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
.end method

.method public static synthetic B(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->openLocalCamera(ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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
.end method

.method public static synthetic C(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->muteRemoteAudioStream(Ljava/lang/String;Z)V

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

.method public static synthetic D(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->moveToSeat(ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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

.method public static synthetic E(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->updateAudioQuality(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;)V

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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static synthetic F(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->startScreenSharing()V

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
.end method

.method public static synthetic G(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchParam;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    const-string v1, ""

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    move-object v2, v1

    .line 14
    goto :goto_0

    .line 15
    .line 16
    :cond_0
    iget-object v2, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchParam;->keyword:Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    if-nez p1, :cond_1

    .line 22
    goto :goto_1

    .line 23
    .line 24
    :cond_1
    iget-object v1, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchParam;->cursor:Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    :goto_1
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/impl/room/w0;

    .line 30
    .line 31
    .line 32
    invoke-direct {p1, p0, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/w0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchCallback;)V

    .line 33
    .line 34
    .line 35
    const-string/jumbo p2, "searchUsers"

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, p2, v0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->callAPI(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeDefine$APICallRespondCallback;)Ljava/lang/String;

    .line 39
    return-void
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

.method public static synthetic H(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->moveUserToSeatByAdminResponse(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;Ljava/lang/String;)V

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

.method public static synthetic I(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->updateRoomSeatModeByAdmin(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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

.method public static synthetic J(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->setLocalVideoView(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/rtmp/ui/TXCloudVideoView;)V

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

.method public static synthetic K(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->leaveSeat(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static synthetic L(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;ILjava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->kickUserOffSeatByAdmin(ILjava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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

.method public static synthetic M(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Z)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->enableGravitySensor(Z)V

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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static synthetic N(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->setSelfInfo(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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
.end method

.method public static synthetic O(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetSeatListCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->getSeatList(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetSeatListCallback;)V

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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static synthetic P(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V
    .locals 1

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$EnterRoomOptions;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$EnterRoomOptions;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->enterRoom(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$EnterRoomOptions;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V

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
.end method

.method public static synthetic Q(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V
    .locals 2

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;->CONFERENCE:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;

    .line 5
    .line 6
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$EnterRoomOptions;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$EnterRoomOptions;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->enterRoom(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$EnterRoomOptions;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V

    .line 13
    return-void
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

.method public static synthetic R(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Ljava/util/HashMap;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->setCustomInfoForUser(Ljava/lang/String;Ljava/util/HashMap;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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
.end method

.method public static synthetic S(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->unmuteLocalAudio(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static synthetic T(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestListCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->getSeatApplicationList(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestListCallback;)V

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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static synthetic U(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ResolutionMode;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->setVideoResolutionMode(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ResolutionMode;)V

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

.method public static synthetic V(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->addObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

    .line 6
    .line 7
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mObserverProxy:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;->addObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

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

.method public static synthetic W(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->destroyRoom(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static synthetic X(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->lockSeatByAdmin(ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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
.end method

.method public static synthetic Y(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->fetchRoomInfo(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V

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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static synthetic Z(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->createRoom(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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

.method public static synthetic a(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;ILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->kickUserOffSeatByAdmin(ILjava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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
.end method

.method public static synthetic a0(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$EnterRoomOptions;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->enterRoom(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$EnterRoomOptions;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V

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

.method public static synthetic b(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->openLocalMicrophone(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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

.method public static synthetic b0(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->disableDeviceForAllUserByAdmin(ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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
.end method

.method public static synthetic c(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Z)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->enableSystemAudioSharing(Z)V

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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static synthetic c0(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->responseRemoteRequest(Ljava/lang/String;ZLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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
.end method

.method private callAPI(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeDefine$APICallRespondCallback;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeDefine$APICallRespondCallback;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lorg/json/JSONArray;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p2}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    iget-object p2, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->getPipelineBridge()Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;

    .line 11
    move-result-object p2

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, p1, v0, p3}, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->callAPI(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeDefine$APICallRespondCallback;)Ljava/lang/String;

    .line 19
    move-result-object p1

    .line 20
    return-object p1
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

.method public static callExperimentalAPI(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 7
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 8
    const-string v1, "api"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 9
    const-string v1, "createSubRoom"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 10
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->createSubRoom()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p1

    goto :goto_0

    .line 11
    :cond_0
    const-string v1, "destroySubRoom"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 12
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->destroySubRoom(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 13
    :goto_0
    const-string v0, "TUIRoomEngineImpl"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    :cond_1
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->callExperimentalAPI(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private callExperimentalAPIResponse(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ExperimentalAPIResponseCallback;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->SUCCESS:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 6
    .line 7
    if-ne p2, v0, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-static {p4}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->StringToJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 11
    move-result-object p2

    .line 12
    const/4 p3, 0x0

    .line 13
    .line 14
    const-class p4, Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-static {p2, p3, p4}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 18
    move-result-object p2

    .line 19
    .line 20
    check-cast p2, Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    invoke-interface {p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ExperimentalAPIResponseCallback;->onResponse(Ljava/lang/String;)V

    .line 24
    return-void

    .line 25
    .line 26
    :cond_1
    new-instance p4, Ljava/util/HashMap;

    .line 27
    .line 28
    .line 29
    invoke-direct {p4}, Ljava/util/HashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->getValue()I

    .line 33
    move-result p2

    .line 34
    .line 35
    .line 36
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    move-result-object p2

    .line 38
    .line 39
    const-string v0, "code"

    .line 40
    .line 41
    .line 42
    invoke-virtual {p4, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    if-nez p3, :cond_2

    .line 45
    .line 46
    const-string p3, ""

    .line 47
    .line 48
    .line 49
    :cond_2
    const-string/jumbo p2, "message"

    .line 50
    .line 51
    .line 52
    invoke-virtual {p4, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    new-instance p2, Lorg/json/JSONObject;

    .line 55
    .line 56
    .line 57
    invoke-direct {p2, p4}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 61
    move-result-object p2

    .line 62
    .line 63
    .line 64
    invoke-interface {p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ExperimentalAPIResponseCallback;->onResponse(Ljava/lang/String;)V

    .line 65
    return-void
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
.end method

.method private static createSubRoom()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;-><init>(Z)V

    .line 7
    return-object v0
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

.method public static synthetic d(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;ILjava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->addCategoryTagForUsers(ILjava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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
.end method

.method public static synthetic d0(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->getBannedUserListResponse(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;Ljava/lang/String;)V

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

.method public static destroySharedInstance()V
    .locals 2

    .line 1
    .line 2
    const-class v0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->destroy()V

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    sput-object v1, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->sInstance:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;

    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw v1
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
.end method

.method private static destroySubRoom(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    .line 2
    instance-of v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->destroy()V

    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
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

.method public static synthetic e(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MoveSeatPolicy;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    const-string p1, ""

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    if-eqz p3, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MoveSeatPolicy;->getValue()I

    .line 29
    move-result p1

    .line 30
    goto :goto_1

    .line 31
    .line 32
    :cond_1
    sget-object p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MoveSeatPolicy;->ABORT_WHEN_OCCUPIED:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MoveSeatPolicy;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MoveSeatPolicy;->getValue()I

    .line 36
    move-result p1

    .line 37
    .line 38
    .line 39
    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    .line 43
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/impl/room/k0;

    .line 46
    .line 47
    .line 48
    invoke-direct {p1, p0, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/k0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 49
    .line 50
    .line 51
    const-string/jumbo p2, "moveUserToSeatByAdmin"

    .line 52
    .line 53
    .line 54
    invoke-direct {p0, p2, v0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->callAPI(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeDefine$APICallRespondCallback;)Ljava/lang/String;

    .line 55
    return-void
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

.method public static synthetic e0(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/impl/room/s1;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/s1;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)V

    .line 14
    .line 15
    const-string p1, "getBannedUserList"

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->callAPI(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeDefine$APICallRespondCallback;)Ljava/lang/String;

    .line 19
    return-void
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

.method public static synthetic f(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SendCustomMessageCallback;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->sendCustomMessageResponse(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SendCustomMessageCallback;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;Ljava/lang/String;)V

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

.method public static synthetic f0(ILjava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->sAppContext:Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->login(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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
.end method

.method public static synthetic g(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;ZLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->responseRemoteRequest(Ljava/lang/String;ZLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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

.method public static synthetic g0(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ExperimentalAPIResponseCallback;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->callExperimentalAPIResponse(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ExperimentalAPIResponseCallback;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;Ljava/lang/String;)V

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

.method private getBannedUserListResponse(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->SUCCESS:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 6
    .line 7
    if-eq v0, p2, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 11
    return-void

    .line 12
    .line 13
    .line 14
    :cond_1
    invoke-static {p4}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->StringToJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 15
    move-result-object p2

    .line 16
    .line 17
    if-nez p2, :cond_2

    .line 18
    .line 19
    sget-object p2, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->INVALID_PARAMETER:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 23
    return-void

    .line 24
    :cond_2
    const/4 p3, 0x0

    .line 25
    .line 26
    const-class p4, Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    invoke-static {p2, p3, p4}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 30
    move-result-object p3

    .line 31
    .line 32
    check-cast p3, Ljava/lang/Integer;

    .line 33
    const/4 p4, 0x1

    .line 34
    .line 35
    const-class v0, Lorg/json/JSONArray;

    .line 36
    .line 37
    .line 38
    invoke-static {p2, p4, v0}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 39
    move-result-object p2

    .line 40
    .line 41
    check-cast p2, Lorg/json/JSONArray;

    .line 42
    .line 43
    .line 44
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getUserInfoListFromJSONArray(Lorg/json/JSONArray;)Ljava/util/List;

    .line 45
    move-result-object p2

    .line 46
    .line 47
    new-instance p4, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserListResult;

    .line 48
    .line 49
    .line 50
    invoke-direct {p4}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserListResult;-><init>()V

    .line 51
    .line 52
    if-nez p3, :cond_3

    .line 53
    .line 54
    const-wide/16 v0, 0x0

    .line 55
    goto :goto_0

    .line 56
    .line 57
    .line 58
    :cond_3
    invoke-virtual {p3}, Ljava/lang/Integer;->longValue()J

    .line 59
    move-result-wide v0

    .line 60
    .line 61
    :goto_0
    iput-wide v0, p4, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserListResult;->nextSequence:J

    .line 62
    .line 63
    iput-object p2, p4, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserListResult;->userInfoList:Ljava/util/List;

    .line 64
    .line 65
    .line 66
    invoke-interface {p1, p4}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;->onSuccess(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserListResult;)V

    .line 67
    return-void
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
.end method

.method private getConferenceInvitationManager()Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->getConferenceInvitationManager()Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method private getConferenceListManager()Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->getConferenceListManager()Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method private getLiveGiftManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->getLiveGiftManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method private getLiveLayoutManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveLayoutManager;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->getLiveLayoutManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveLayoutManager;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method private getLiveListManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->getLiveListManager()Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerImpl;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->getSelfInfo()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;

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

.method public static synthetic h(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->changeUserRole(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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
.end method

.method public static synthetic h0(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->setRemoteVideoView(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/rtmp/ui/TXCloudVideoView;)V

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
.end method

.method public static synthetic i(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SendTextMessageCallback;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->sendTextMessageResponse(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SendTextMessageCallback;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;Ljava/lang/String;)V

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

.method public static synthetic i0(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->cancelRequest(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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

.method private isSyncAPI(Ljava/lang/String;Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lorg/json/JSONArray;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p2}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    iget-object p2, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->getPipelineBridge()Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;

    .line 11
    move-result-object p2

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, p1, v0}, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->isSyncAPI(Ljava/lang/String;Ljava/lang/String;)Z

    .line 19
    move-result p1

    .line 20
    return p1
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

.method public static synthetic j(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;IJLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->getUserListByTag(IJLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)V

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
.end method

.method public static synthetic j0(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->setLocalVideoView(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V

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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static synthetic k(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->stopScreenSharing()V

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
.end method

.method public static synthetic k0(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;ILjava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->removeCategoryTagForUsers(ILjava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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
.end method

.method public static synthetic l(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;ZLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->disableSendingMessageByAdmin(ZLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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
.end method

.method public static synthetic l0(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Z)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;-><init>(Z)V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 11
    .line 12
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;

    .line 13
    .line 14
    .line 15
    invoke-direct {p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;-><init>()V

    .line 16
    .line 17
    iput-object p1, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mObserverProxy:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;

    .line 18
    .line 19
    iget-object p1, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->getPipelineBridge()Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mObserverProxy:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p0}, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->addObserver(Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeObserver;)V

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
.end method

.method public static login(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sput-object v0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->sAppContext:Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    move-result-object p0

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/common/ContextProvider;->setContext(Landroid/content/Context;)V

    .line 14
    .line 15
    new-instance p0, Lcom/tencent/cloud/tuikit/engine/impl/room/h1;

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/h1;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 22
    return-void
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
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/s0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/s0;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public static synthetic m(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->fetchRoomInfo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V

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
.end method

.method public static synthetic m0(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->exitRoom(ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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

.method private moveUserToSeatByAdminResponse(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    sget-object p4, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->SUCCESS:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 6
    .line 7
    if-eq p4, p2, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 11
    return-void

    .line 12
    .line 13
    .line 14
    :cond_1
    invoke-interface {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;->onSuccess()V

    .line 15
    return-void
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
.end method

.method public static synthetic n(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$PlayCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->startPlayRemoteVideo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$PlayCallback;)V

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
.end method

.method public static synthetic n0(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ExperimentalAPIResponseCallback;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/a;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/a;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ExperimentalAPIResponseCallback;)V

    .line 9
    .line 10
    const-string p2, "callExperimentalAPI"

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p2, p1, v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->callAPI(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeDefine$APICallRespondCallback;)Ljava/lang/String;

    .line 14
    return-void
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

.method public static synthetic o(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomMetadataCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->getRoomMetadata(Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomMetadataCallback;)V

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

.method public static synthetic o0(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->closeRemoteDeviceByAdmin(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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
.end method

.method public static synthetic p(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->kickRemoteUserOutOfRoom(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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

.method public static synthetic p0(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->updateRoomNameByAdmin(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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

.method public static synthetic q(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;JLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->getUserList(JLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)V

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

.method public static synthetic q0(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->removeObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

    .line 6
    .line 7
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mObserverProxy:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;->removeObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

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

.method public static synthetic r(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchCallback;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->searchUsersResponse(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchCallback;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;Ljava/lang/String;)V

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

.method public static synthetic r0(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomVideoEncoderParams;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->updateVideoQualityEx(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomVideoEncoderParams;)V

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

.method private static runOnMainThread(Ljava/lang/Runnable;)V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->sMainHandler:Landroid/os/Handler;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 16
    return-void

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic s(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SendCustomMessageCallback;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    iget-object v1, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;->businessId:Ljava/lang/String;

    .line 11
    .line 12
    const-string v2, ""

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v1, v2

    .line 17
    .line 18
    :goto_0
    const-string v3, "businessId"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    iget-object p1, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;->data:Ljava/lang/String;

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    move-object v2, p1

    .line 27
    .line 28
    :cond_1
    const-string p1, "data"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    new-instance p1, Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/h0;

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, p0, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/h0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SendCustomMessageCallback;)V

    .line 45
    .line 46
    .line 47
    const-string/jumbo p2, "sendCustomMessage"

    .line 48
    .line 49
    .line 50
    invoke-direct {p0, p2, p1, v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->callAPI(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeDefine$APICallRespondCallback;)Ljava/lang/String;

    .line 51
    return-void
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

.method public static synthetic s0(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->updateRoomPasswordByAdmin(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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

.method private searchUsersResponse(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchCallback;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->SUCCESS:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 6
    .line 7
    if-eq v0, p2, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 11
    return-void

    .line 12
    .line 13
    .line 14
    :cond_1
    invoke-static {p4}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->StringToJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 15
    move-result-object p2

    .line 16
    const/4 p3, 0x0

    .line 17
    .line 18
    const-class p4, Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    invoke-static {p2, p3, p4}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 22
    move-result-object p2

    .line 23
    .line 24
    check-cast p2, Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getUserSearchResultFromJSONArray(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchResult;

    .line 28
    move-result-object p2

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchCallback;->onSuccess(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchResult;)V

    .line 32
    return-void
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
.end method

.method private sendCustomMessageResponse(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SendCustomMessageCallback;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->SUCCESS:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 6
    .line 7
    if-eq v0, p2, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SendCustomMessageCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 11
    return-void

    .line 12
    .line 13
    .line 14
    :cond_1
    invoke-static {p4}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->StringToJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 15
    move-result-object p2

    .line 16
    const/4 p3, 0x0

    .line 17
    .line 18
    const-class p4, Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    invoke-static {p2, p3, p4}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 22
    move-result-object p2

    .line 23
    .line 24
    check-cast p2, Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getRoomCustomMessageFromJSONObject(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;

    .line 28
    move-result-object p2

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SendCustomMessageCallback;->onSuccess(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;)V

    .line 32
    return-void
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
.end method

.method private sendTextMessageResponse(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SendTextMessageCallback;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->SUCCESS:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 6
    .line 7
    if-eq v0, p2, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SendTextMessageCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 11
    return-void

    .line 12
    .line 13
    .line 14
    :cond_1
    invoke-static {p4}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->StringToJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 15
    move-result-object p2

    .line 16
    const/4 p3, 0x0

    .line 17
    .line 18
    const-class p4, Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    invoke-static {p2, p3, p4}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 22
    move-result-object p2

    .line 23
    .line 24
    check-cast p2, Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getRoomTextMessageFromJSONObject(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;

    .line 28
    move-result-object p2

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SendTextMessageCallback;->onSuccess(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;)V

    .line 32
    return-void
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
.end method

.method public static setSelfInfo(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/o;

    invoke-direct {v0, p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/o;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static setSelfInfo(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/t1;

    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/t1;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static sharedInstance()Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;
    .locals 3

    .line 1
    .line 2
    const-class v0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->sInstance:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;

    .line 10
    const/4 v2, 0x1

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;-><init>(Z)V

    .line 14
    .line 15
    sput-object v1, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->sInstance:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    goto :goto_1

    .line 19
    .line 20
    :cond_0
    :goto_0
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->sInstance:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;

    .line 21
    monitor-exit v0

    .line 22
    return-object v1

    .line 23
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw v1
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
.end method

.method public static synthetic t(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->stopPlayRemoteVideo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;)V

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

.method public static synthetic t0(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/util/HashMap;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->setRoomMetadataByAdmin(Ljava/util/HashMap;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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

.method public static synthetic u(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->muteLocalAudio()V

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
.end method

.method public static synthetic u0(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->disableSendingMessageForAllUser(ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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

.method public static synthetic v(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->changeUserNameCard(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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
.end method

.method public static synthetic w(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->updateVideoQuality(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;)V

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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static synthetic x(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->logout(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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

.method public static synthetic y(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserInfoCallback;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->getUserInfo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserInfoCallback;)V

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

.method public static synthetic z(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SendTextMessageCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    iget-object v1, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;->textContent:Ljava/lang/String;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    const-string v1, ""

    .line 16
    .line 17
    .line 18
    :goto_0
    const-string/jumbo v2, "textContent"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    iget-object p1, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;->extensionInfo:Ljava/util/Map;

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    goto :goto_1

    .line 27
    .line 28
    :cond_1
    new-instance p1, Ljava/util/HashMap;

    .line 29
    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 32
    .line 33
    :goto_1
    const-string v1, "extensionInfo"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    new-instance p1, Ljava/util/ArrayList;

    .line 39
    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/c0;

    .line 47
    .line 48
    .line 49
    invoke-direct {v0, p0, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/c0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SendTextMessageCallback;)V

    .line 50
    .line 51
    .line 52
    const-string/jumbo p2, "sendTextMessage"

    .line 53
    .line 54
    .line 55
    invoke-direct {p0, p2, p1, v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->callAPI(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeDefine$APICallRespondCallback;)Ljava/lang/String;

    .line 56
    return-void
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


# virtual methods
.method public addCategoryTagForUsers(ILjava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1
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

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/i;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/i;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;ILjava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public addObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/u0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/u0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public applyToAdminToOpenLocalDevice(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->applyToAdminToOpenLocalDevice(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
.end method

.method public callExperimentalAPI(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ExperimentalAPIResponseCallback;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    const-string v1, ""

    if-nez p1, :cond_0

    move-object p1, v1

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3
    const-string p1, "callExperimentalAPI"

    invoke-direct {p0, p1, v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->isSyncAPI(Ljava/lang/String;Ljava/util/List;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 4
    sget-object p2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->sMainHandler:Landroid/os/Handler;

    invoke-virtual {p2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    if-eq p2, v2, :cond_1

    return-object v1

    :cond_1
    const/4 p2, 0x0

    .line 5
    invoke-direct {p0, p1, v0, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->callAPI(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeDefine$APICallRespondCallback;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 6
    :cond_2
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/impl/room/s;

    invoke-direct {p1, p0, v0, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/s;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ExperimentalAPIResponseCallback;)V

    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

    return-object v1
.end method

.method public cancelRequest(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/e0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/e0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public changeUserNameCard(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/t0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/t0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public changeUserRole(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/l;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/l;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public closeLocalCamera()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/impl/room/g1;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/g1;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
.end method

.method public closeLocalMicrophone()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/impl/room/i0;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/i0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
.end method

.method public closeRemoteDeviceByAdmin(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/c;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/c;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public createRoom(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/f0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/f0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public destroy()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->destroy()V

    .line 8
    .line 9
    :cond_0
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->sMainHandler:Landroid/os/Handler;

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 14
    .line 15
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mObserverProxy:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;->destroy()V

    .line 19
    return-void
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
.end method

.method public destroyRoom(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/x1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/x1;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public disableDeviceForAllUserByAdmin(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/n;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p2, p1, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/n;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public disableSendingMessageByAdmin(Ljava/lang/String;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/g;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p2, p1, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/g;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;ZLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public disableSendingMessageForAllUser(ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/v;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/v;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public enableGravitySensor(Z)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/p0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/p0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Z)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public enableSystemAudioSharing(Z)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/f;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/f;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Z)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public enterRoom(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/q1;

    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/q1;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V

    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public enterRoom(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$EnterRoomOptions;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V
    .locals 6

    .line 3
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/g0;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/tencent/cloud/tuikit/engine/impl/room/g0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$EnterRoomOptions;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V

    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public enterRoom(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V
    .locals 1

    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/q0;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/q0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V

    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public exitRoom(ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/e;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/e;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public fetchRoomInfo(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/m;

    invoke-direct {v0, p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/m;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V

    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public fetchRoomInfo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V
    .locals 1

    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/l0;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/l0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V

    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public getAudioEffectManager()Lcom/tencent/liteav/audio/TXAudioEffectManager;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->getTRTCCloud()Lcom/tencent/trtc/TRTCCloud;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/trtc/TRTCCloud;->getAudioEffectManager()Lcom/tencent/liteav/audio/TXAudioEffectManager;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getBannedUserList(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/j0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/j0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public getBeautyManager()Lcom/tencent/liteav/beauty/TXBeautyManager;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->getTRTCCloud()Lcom/tencent/trtc/TRTCCloud;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/trtc/TRTCCloud;->getBeautyManager()Lcom/tencent/liteav/beauty/TXBeautyManager;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getDeviceManager()Lcom/tencent/liteav/device/TXDeviceManager;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->getTRTCCloud()Lcom/tencent/trtc/TRTCCloud;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/trtc/TRTCCloud;->getDeviceManager()Lcom/tencent/liteav/device/TXDeviceManager;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getExtension(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;)Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;->DEVICE_MANAGER:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->getMediaDeviceManager()Lcom/tencent/cloud/tuikit/engine/extension/TUIRoomDeviceManager;

    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;->LIVE_LIST_MANAGER:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->getLiveListManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager;

    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    .line 28
    :cond_1
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;->CONFERENCE_LIST_MANAGER:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    move-result v0

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->getConferenceListManager()Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;

    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    .line 41
    :cond_2
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;->CONFERENCE_INVITATION_MANAGER:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    move-result v0

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    .line 50
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->getConferenceInvitationManager()Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;

    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    .line 54
    :cond_3
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;->LIVE_LAYOUT_MANAGER:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    move-result v0

    .line 59
    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    .line 63
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->getLiveLayoutManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveLayoutManager;

    .line 64
    move-result-object p1

    .line 65
    return-object p1

    .line 66
    .line 67
    :cond_4
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;->LIVE_GIFT_MANAGER:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    move-result p1

    .line 72
    .line 73
    if-eqz p1, :cond_5

    .line 74
    .line 75
    .line 76
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->getLiveGiftManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager;

    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    :cond_5
    const/4 p1, 0x0

    .line 80
    return-object p1
    .line 81
.end method

.method public getLiveBattleManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->getLiveBattleManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public getLiveConnectionManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->getLiveConnectionManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public getMediaDeviceManager()Lcom/tencent/cloud/tuikit/engine/extension/TUIRoomDeviceManager;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->getMediaDeviceManager()Lcom/tencent/cloud/tuikit/engine/extension/TUIRoomDeviceManager;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public getRoomMetadata(Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomMetadataCallback;)V
    .locals 1
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

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/v1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/v1;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomMetadataCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public getSeatApplicationList(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestListCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/u;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/u;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestListCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public getSeatList(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetSeatListCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/n1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/n1;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetSeatListCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public getSongListManager()Lcom/tencent/cloud/tuikit/engine/extension/TUISongListManager;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->getSongListManager()Lcom/tencent/cloud/tuikit/engine/extension/TUISongListManager;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public getTRTCCloud()Lcom/tencent/trtc/TRTCCloud;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->getTRTCCloud()Lcom/tencent/trtc/TRTCCloud;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public getUserInfo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserInfoCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/b0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/b0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserInfoCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public getUserList(JLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/u1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/u1;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;JLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public getUserListByTag(IJLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)V
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/v0;

    .line 3
    move-object v1, p0

    .line 4
    move v2, p1

    .line 5
    move-wide v3, p2

    .line 6
    move-object v5, p4

    .line 7
    .line 8
    .line 9
    invoke-direct/range {v0 .. v5}, Lcom/tencent/cloud/tuikit/engine/impl/room/v0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;IJLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 13
    return-void
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

.method public kickRemoteUserOutOfRoom(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/x0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/x0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public kickUserOffSeatByAdmin(ILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/b1;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/b1;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;ILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public kickUserOffSeatByAdmin(ILjava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 6

    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/r1;

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/tencent/cloud/tuikit/engine/impl/room/r1;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;ILjava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public leaveSeat(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/n0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/n0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public lockSeatByAdmin(ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/q;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/q;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public moveToSeat(ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/d0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/d0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public moveUserToSeatByAdmin(Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MoveSeatPolicy;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/e1;

    .line 3
    move-object v1, p0

    .line 4
    move-object v2, p1

    .line 5
    move v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p4

    .line 8
    .line 9
    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/tencent/cloud/tuikit/engine/impl/room/e1;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MoveSeatPolicy;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 14
    return-void
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
.end method

.method public muteLocalAudio()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/x;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/x;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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
.end method

.method public muteRemoteAudioStream(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/r;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/r;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Z)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public openLocalCamera(ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/o0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/o0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public openLocalMicrophone(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/c1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/c1;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public openRemoteDeviceByAdmin(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->openRemoteDeviceByAdmin(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
.end method

.method public querySeatList()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;",
            ">;"
        }
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
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->sMainHandler:Landroid/os/Handler;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    if-eq v1, v2, :cond_0

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string/jumbo v2, "querySeatList"

    .line 27
    const/4 v3, 0x0

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, v2, v1, v3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->callAPI(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeDefine$APICallRespondCallback;)Ljava/lang/String;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    if-nez v1, :cond_1

    .line 34
    goto :goto_0

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-static {v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->StringToJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 44
    move-result v2

    .line 45
    .line 46
    if-nez v2, :cond_2

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/4 v2, 0x0

    .line 49
    .line 50
    .line 51
    :try_start_0
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    .line 55
    invoke-static {v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getSeatListFromJSONArray(Lorg/json/JSONArray;)Ljava/util/List;

    .line 56
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    return-object v0

    .line 58
    :catch_0
    move-exception v1

    .line 59
    .line 60
    new-instance v2, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    const-string/jumbo v3, "parse querySeatList failed, error: "

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    move-result-object v1

    .line 77
    .line 78
    const-string v2, "TUIRoomEngineImpl"

    .line 79
    .line 80
    .line 81
    invoke-static {v2, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    :cond_3
    :goto_0
    return-object v0
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
.end method

.method public removeCategoryTagForUsers(ILjava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1
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

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/a0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/a0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;ILjava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public removeObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/i1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/i1;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public responseRemoteRequest(Ljava/lang/String;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/d1;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/d1;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public responseRemoteRequest(Ljava/lang/String;ZLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 6

    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/y;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/tencent/cloud/tuikit/engine/impl/room/y;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;ZLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public searchUsers(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchParam;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/w;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/w;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchParam;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public sendCustomMessage(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SendCustomMessageCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/t;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/t;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SendCustomMessageCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public sendTextMessage(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SendTextMessageCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/k1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/k1;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SendTextMessageCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public setBeautyLevel(IF)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->getTRTCCloud()Lcom/tencent/trtc/TRTCCloud;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/trtc/TRTCCloud;->getBeautyManager()Lcom/tencent/liteav/beauty/TXBeautyManager;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1}, Lcom/tencent/liteav/beauty/TXBeautyManager;->setBeautyStyle(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, p2}, Lcom/tencent/liteav/beauty/TXBeautyManager;->setBeautyLevel(F)V

    .line 15
    return-void
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

.method public setCustomInfoForUser(Ljava/lang/String;Ljava/util/HashMap;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1
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

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/k;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/k;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Ljava/util/HashMap;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public setLocalVideoMuteImage(Landroid/graphics/Bitmap;)V
    .locals 2

    .line 1
    const/4 v0, 0x5

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->getTRTCCloud()Lcom/tencent/trtc/TRTCCloud;

    .line 5
    move-result-object v1

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p1, v0}, Lcom/tencent/trtc/TRTCCloud;->setVideoMuteImage(Landroid/graphics/Bitmap;I)V

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

.method public setLocalVideoView(Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V
    .locals 1

    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/r0;

    invoke-direct {v0, p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/r0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V

    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setLocalVideoView(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/m1;

    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/m1;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V

    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setRemoteVideoView(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/p;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/p;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public setRoomMetadataByAdmin(Ljava/util/HashMap;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1
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

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/m0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/m0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/util/HashMap;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public setVideoResolutionMode(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ResolutionMode;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/l1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/l1;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ResolutionMode;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public setWhitenessLevel(F)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->getTRTCCloud()Lcom/tencent/trtc/TRTCCloud;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/trtc/TRTCCloud;->getBeautyManager()Lcom/tencent/liteav/beauty/TXBeautyManager;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1}, Lcom/tencent/liteav/beauty/TXBeautyManager;->setWhitenessLevel(F)V

    .line 12
    return-void
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

.method public startPlayRemoteVideo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$PlayCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/z0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/z0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$PlayCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public startPushLocalVideo()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/impl/room/h;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/h;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
.end method

.method public startScreenSharing()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/a1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/a1;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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
.end method

.method public stopPlayRemoteVideo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/o1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/o1;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public stopPushLocalVideo()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/impl/room/z;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/z;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
.end method

.method public stopScreenSharing()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/y1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/y1;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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
.end method

.method public switchCamera(Z)I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->getMediaDeviceManager()Lcom/tencent/cloud/tuikit/engine/extension/TUIRoomDeviceManager;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/cloud/tuikit/engine/extension/TUIRoomDeviceManager;->switchCamera(Z)V

    .line 8
    const/4 p1, 0x0

    .line 9
    return p1
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

.method public takeSeat(IILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->takeSeat(IILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    move-result-object p1

    return-object p1
.end method

.method public takeSeat(IILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCompletion;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->takeSeat(IILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCompletion;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    move-result-object p1

    return-object p1
.end method

.method public takeUserOnSeatByAdmin(ILjava/lang/String;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->takeUserOnSeatByAdmin(ILjava/lang/String;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    move-result-object p1

    return-object p1
.end method

.method public takeUserOnSeatByAdmin(ILjava/lang/String;ILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCompletion;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->mTUIRoomEngineJni:Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;

    move v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->takeUserOnSeatByAdmin(ILjava/lang/String;ILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCompletion;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    move-result-object p1

    return-object p1
.end method

.method public unmuteLocalAudio(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/p1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/p1;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public updateAudioQuality(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/w1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/w1;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public updateRoomNameByAdmin(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/y0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/y0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public updateRoomPasswordByAdmin(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/j1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/j1;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public updateRoomSeatModeByAdmin(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/b;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public updateVideoQuality(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/j;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/j;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public updateVideoQualityEx(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomVideoEncoderParams;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/d;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/d;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomVideoEncoderParams;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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
