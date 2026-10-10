.class public final Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;
.super Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;
.source "TUILiveBattleManagerImpl.java"


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "tuikit::extension"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl$ActionCallbackJni;,
        Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl$BattleRequestCallbackJni;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "TUILiveBattleManagerImpl"


# instance fields
.field private final mMainHandler:Landroid/os/Handler;

.field private mNativeLiveBattleManagerJni:J

.field private final mObserverList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;",
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
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->mObserverList:Ljava/util/List;

    .line 11
    .line 12
    new-instance v0, Landroid/os/Handler;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 20
    .line 21
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->mMainHandler:Landroid/os/Handler;

    .line 22
    .line 23
    iput-wide p1, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->mNativeLiveBattleManagerJni:J

    .line 24
    .line 25
    const-wide/16 v0, 0x0

    .line 26
    .line 27
    cmp-long v0, p1, v0

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-static {p1, p2, p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->nativeSetObserver(JLjava/lang/Object;)V

    .line 33
    :cond_0
    return-void
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

.method public static synthetic a(Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->mNativeLiveBattleManagerJni:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long p0, v0, v2

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    new-instance p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl$ActionCallbackJni;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl$ActionCallbackJni;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1, p1, p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->nativeRejectBattle(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl$ActionCallbackJni;)V

    .line 17
    :cond_0
    return-void
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

.method public static synthetic b(Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->mObserverList:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->mObserverList:Ljava/util/List;

    .line 11
    .line 12
    .line 13
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    :cond_0
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
.end method

.method public static synthetic c(Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->mNativeLiveBattleManagerJni:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long p0, v0, v2

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    new-instance p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl$ActionCallbackJni;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl$ActionCallbackJni;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1, p1, p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->nativeExitBattle(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl$ActionCallbackJni;)V

    .line 17
    :cond_0
    return-void
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

.method private static convertJsonToBattleInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    return-object v1

    .line 9
    .line 10
    :cond_0
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;-><init>()V

    .line 14
    .line 15
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    new-instance p0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;-><init>()V

    .line 24
    .line 25
    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;->config:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;

    .line 26
    .line 27
    const-string v3, "extensionInfo"

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    move-result-object v3

    .line 32
    .line 33
    iput-object v3, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;->extensionInfo:Ljava/lang/String;

    .line 34
    .line 35
    iget-object p0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;->config:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;

    .line 36
    .line 37
    .line 38
    const-string/jumbo v3, "needResponse"

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 42
    move-result v3

    .line 43
    .line 44
    iput-boolean v3, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;->needResponse:Z

    .line 45
    .line 46
    iget-object p0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;->config:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;

    .line 47
    .line 48
    const-string v3, "duration"

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 52
    move-result v3

    .line 53
    .line 54
    iput v3, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;->duration:I

    .line 55
    .line 56
    const-string p0, "battleId"

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    move-result-object p0

    .line 61
    .line 62
    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;->battleId:Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    const-string/jumbo p0, "startTime"

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, p0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 69
    move-result p0

    .line 70
    int-to-long v3, p0

    .line 71
    .line 72
    iput-wide v3, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;->startTime:J

    .line 73
    .line 74
    const-string p0, "endTime"

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, p0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 78
    move-result p0

    .line 79
    int-to-long v3, p0

    .line 80
    .line 81
    iput-wide v3, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;->endTime:J

    .line 82
    .line 83
    const-string p0, "fromUser"

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    move-result-object p0

    .line 88
    .line 89
    .line 90
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->convertJsonToBattleUser(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    .line 91
    move-result-object p0

    .line 92
    .line 93
    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;->inviter:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    .line 94
    .line 95
    new-instance p0, Ljava/util/ArrayList;

    .line 96
    .line 97
    .line 98
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 99
    .line 100
    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;->inviteeList:Ljava/util/List;

    .line 101
    .line 102
    .line 103
    const-string/jumbo p0, "toUserList"

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, p0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 107
    move-result-object p0

    .line 108
    const/4 v2, 0x0

    .line 109
    .line 110
    .line 111
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 112
    move-result v3

    .line 113
    .line 114
    if-ge v2, v3, :cond_2

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 118
    move-result-object v3

    .line 119
    .line 120
    .line 121
    invoke-static {v3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->convertJsonToBattleUser(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    .line 122
    move-result-object v3

    .line 123
    .line 124
    if-eqz v3, :cond_1

    .line 125
    .line 126
    iget-object v4, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;->inviteeList:Ljava/util/List;

    .line 127
    .line 128
    .line 129
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    goto :goto_1

    .line 131
    :catch_0
    move-exception p0

    .line 132
    goto :goto_2

    .line 133
    .line 134
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 135
    goto :goto_0

    .line 136
    :cond_2
    return-object v0

    .line 137
    .line 138
    :goto_2
    const-string v0, "TUILiveBattleManagerImpl"

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 142
    move-result-object p0

    .line 143
    .line 144
    .line 145
    invoke-static {v0, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    return-object v1
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

.method private static convertJsonToBattleUser(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->convertJsonToBattleUser(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 3
    const-string v0, "TUILiveBattleManagerImpl"

    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private static convertJsonToBattleUser(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 4
    :cond_0
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    invoke-direct {v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;-><init>()V

    .line 5
    :try_start_0
    const-string/jumbo v2, "userId"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;->userId:Ljava/lang/String;

    .line 6
    const-string/jumbo v2, "userName"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;->userName:Ljava/lang/String;

    .line 7
    const-string v2, "avatarUrl"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;->avatarUrl:Ljava/lang/String;

    .line 8
    const-string/jumbo v2, "roomId"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;->roomId:Ljava/lang/String;

    .line 9
    const-string/jumbo v2, "score"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p0

    iput p0, v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;->score:I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p0

    .line 10
    const-string v1, "TUILiveBattleManagerImpl"

    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private static convertJsonToBattleUserList(Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;",
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
    if-eqz p0, :cond_1

    .line 8
    .line 9
    :try_start_0
    new-instance v1, Lorg/json/JSONArray;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 13
    const/4 p0, 0x0

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 17
    move-result v2

    .line 18
    .line 19
    if-ge p0, v2, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    .line 26
    invoke-static {v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->convertJsonToBattleUser(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    goto :goto_1

    .line 34
    :catch_0
    move-exception p0

    .line 35
    goto :goto_2

    .line 36
    .line 37
    :cond_0
    :goto_1
    add-int/lit8 p0, p0, 0x1

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :goto_2
    const-string v1, "TUILiveBattleManagerImpl"

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 44
    move-result-object p0

    .line 45
    .line 46
    .line 47
    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    :cond_1
    return-object v0
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
            "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->mObserverList:Ljava/util/List;

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

.method public static synthetic d(Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;Ljava/util/List;ILcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleRequestCallback;)V
    .locals 8

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->mNativeLiveBattleManagerJni:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long p0, v0, v2

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    iget v2, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;->duration:I

    .line 11
    .line 12
    iget-boolean v3, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;->needResponse:Z

    .line 13
    .line 14
    iget-object v4, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;->extensionInfo:Ljava/lang/String;

    .line 15
    const/4 p0, 0x0

    .line 16
    .line 17
    new-array p0, p0, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    invoke-interface {p2, p0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 21
    move-result-object p0

    .line 22
    move-object v5, p0

    .line 23
    .line 24
    check-cast v5, [Ljava/lang/String;

    .line 25
    .line 26
    new-instance v7, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl$BattleRequestCallbackJni;

    .line 27
    .line 28
    .line 29
    invoke-direct {v7, p1, p4}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl$BattleRequestCallbackJni;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleRequestCallback;)V

    .line 30
    move v6, p3

    .line 31
    .line 32
    .line 33
    invoke-static/range {v0 .. v7}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->nativeRequestBattle(JIZLjava/lang/String;[Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl$BattleRequestCallbackJni;)V

    .line 34
    :cond_0
    return-void
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

.method public static synthetic e(Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->mObserverList:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

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

.method public static synthetic f(Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->mObserverList:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    iput-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->mNativeLiveBattleManagerJni:J

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
.end method

.method public static synthetic g(Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->mNativeLiveBattleManagerJni:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long p0, v0, v2

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    const/4 p0, 0x0

    .line 10
    .line 11
    new-array p0, p0, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-interface {p2, p0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 15
    move-result-object p0

    .line 16
    .line 17
    check-cast p0, [Ljava/lang/String;

    .line 18
    .line 19
    new-instance p2, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl$ActionCallbackJni;

    .line 20
    .line 21
    .line 22
    invoke-direct {p2, p3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl$ActionCallbackJni;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1, p1, p0, p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->nativeCancelBattleRequest(JLjava/lang/String;[Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl$ActionCallbackJni;)V

    .line 26
    :cond_0
    return-void
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

.method public static synthetic h(Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->mNativeLiveBattleManagerJni:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long p0, v0, v2

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    new-instance p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl$ActionCallbackJni;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl$ActionCallbackJni;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1, p1, p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->nativeAcceptBattle(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl$ActionCallbackJni;)V

    .line 17
    :cond_0
    return-void
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

.method private static native nativeAcceptBattle(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl$ActionCallbackJni;)V
.end method

.method private static native nativeCancelBattleRequest(JLjava/lang/String;[Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl$ActionCallbackJni;)V
.end method

.method private static native nativeExitBattle(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl$ActionCallbackJni;)V
.end method

.method private static native nativeRejectBattle(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl$ActionCallbackJni;)V
.end method

.method private static native nativeRequestBattle(JIZLjava/lang/String;[Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl$BattleRequestCallbackJni;)V
.end method

.method private static native nativeSetObserver(JLjava/lang/Object;)V
.end method

.method private onBattleEnded(Ljava/lang/String;I)V
    .locals 3
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    goto :goto_1

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->convertJsonToBattleInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    move-result v1

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;

    .line 32
    .line 33
    .line 34
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleStoppedReason;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleStoppedReason;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, p1, v2}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;->onBattleEnded(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleStoppedReason;)V

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    :goto_1
    return-void
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
.end method

.method private onBattleRequestAccept(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    goto :goto_1

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->convertJsonToBattleInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->convertJsonToBattleUser(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    .line 19
    move-result-object p2

    .line 20
    .line 21
    .line 22
    invoke-static {p3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->convertJsonToBattleUser(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    .line 23
    move-result-object p3

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    move-result v1

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;->onBattleRequestAccept(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;)V

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    :goto_1
    return-void
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

.method private onBattleRequestCancelled(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    goto :goto_1

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->convertJsonToBattleInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->convertJsonToBattleUser(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    .line 19
    move-result-object p2

    .line 20
    .line 21
    .line 22
    invoke-static {p3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->convertJsonToBattleUser(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    .line 23
    move-result-object p3

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    move-result v1

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;->onBattleRequestCancelled(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;)V

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    :goto_1
    return-void
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

.method private onBattleRequestReceived(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    goto :goto_1

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->convertJsonToBattleInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->convertJsonToBattleUser(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    .line 19
    move-result-object p2

    .line 20
    .line 21
    .line 22
    invoke-static {p3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->convertJsonToBattleUser(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    .line 23
    move-result-object p3

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    move-result v1

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;->onBattleRequestReceived(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;)V

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    :goto_1
    return-void
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

.method private onBattleRequestReject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    goto :goto_1

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->convertJsonToBattleInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->convertJsonToBattleUser(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    .line 19
    move-result-object p2

    .line 20
    .line 21
    .line 22
    invoke-static {p3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->convertJsonToBattleUser(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    .line 23
    move-result-object p3

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    move-result v1

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;->onBattleRequestReject(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;)V

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    :goto_1
    return-void
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

.method private onBattleRequestTimeout(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    goto :goto_1

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->convertJsonToBattleInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->convertJsonToBattleUser(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    .line 19
    move-result-object p2

    .line 20
    .line 21
    .line 22
    invoke-static {p3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->convertJsonToBattleUser(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    .line 23
    move-result-object p3

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    move-result v1

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;->onBattleRequestTimeout(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;)V

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    :goto_1
    return-void
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

.method private onBattleScoreChanged(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    goto :goto_1

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->convertJsonToBattleUserList(Ljava/lang/String;)Ljava/util/List;

    .line 15
    move-result-object p2

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    move-result v1

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;->onBattleScoreChanged(Ljava/lang/String;Ljava/util/List;)V

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    :goto_1
    return-void
    .line 37
.end method

.method private onBattleStarted(Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    goto :goto_1

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->convertJsonToBattleInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    move-result v1

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, p1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;->onBattleStarted(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;)V

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    :goto_1
    return-void
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

.method private onUserExitBattle(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    goto :goto_1

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->convertJsonToBattleUser(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    .line 15
    move-result-object p2

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    move-result v1

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;->onUserExitBattle(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;)V

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    :goto_1
    return-void
    .line 37
.end method

.method private onUserJoinBattle(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    goto :goto_1

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->convertJsonToBattleUser(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    .line 15
    move-result-object p2

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    move-result v1

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;->onUserJoinBattle(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;)V

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    :goto_1
    return-void
    .line 37
.end method

.method private runOnMainThread(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->mMainHandler:Landroid/os/Handler;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

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


# virtual methods
.method public acceptBattle(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/internal/w;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/w;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public addObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/internal/a0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/a0;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public cancelBattleRequest(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    if-nez p2, :cond_1

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    sget-object p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->INVALID_PARAMETER:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 7
    .line 8
    .line 9
    const-string/jumbo p2, "userIdList is null"

    .line 10
    .line 11
    .line 12
    invoke-interface {p3, p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 13
    :cond_0
    return-void

    .line 14
    .line 15
    :cond_1
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/internal/y;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/y;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, v0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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
.end method

.method public destroy()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/internal/v;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/v;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public exitBattle(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/internal/x;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/x;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public rejectBattle(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/internal/u;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/u;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public removeObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/internal/z;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/z;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->runOnMainThread(Ljava/lang/Runnable;)V

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

.method public requestBattle(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;Ljava/util/List;ILcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleRequestCallback;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleRequestCallback;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    if-nez p2, :cond_1

    .line 3
    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    sget-object p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->INVALID_PARAMETER:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 7
    .line 8
    .line 9
    const-string/jumbo p2, "userIdList is null"

    .line 10
    .line 11
    .line 12
    invoke-interface {p4, p1, p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleRequestCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 13
    :cond_0
    return-void

    .line 14
    .line 15
    :cond_1
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/internal/b0;

    .line 16
    move-object v1, p0

    .line 17
    move-object v2, p1

    .line 18
    move-object v3, p2

    .line 19
    move v4, p3

    .line 20
    move-object v5, p4

    .line 21
    .line 22
    .line 23
    invoke-direct/range {v0 .. v5}, Lcom/tencent/cloud/tuikit/engine/extension/internal/b0;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;Ljava/util/List;ILcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleRequestCallback;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 27
    return-void
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
