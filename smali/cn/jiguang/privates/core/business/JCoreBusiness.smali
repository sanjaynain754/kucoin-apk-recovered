.class public Lcn/jiguang/privates/core/business/JCoreBusiness;
.super Ljava/lang/Object;
.source "JCoreBusiness.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "JCoreBusiness"

.field private static volatile instance:Lcn/jiguang/privates/core/business/JCoreBusiness;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
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
.end method

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static getInstance()Lcn/jiguang/privates/core/business/JCoreBusiness;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcn/jiguang/privates/core/business/JCoreBusiness;->instance:Lcn/jiguang/privates/core/business/JCoreBusiness;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-class v0, Lcn/jiguang/privates/core/business/JCoreBusiness;

    .line 7
    monitor-enter v0

    .line 8
    .line 9
    :try_start_0
    new-instance v1, Lcn/jiguang/privates/core/business/JCoreBusiness;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1}, Lcn/jiguang/privates/core/business/JCoreBusiness;-><init>()V

    .line 13
    .line 14
    sput-object v1, Lcn/jiguang/privates/core/business/JCoreBusiness;->instance:Lcn/jiguang/privates/core/business/JCoreBusiness;

    .line 15
    monitor-exit v0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw v1

    .line 20
    .line 21
    :cond_0
    :goto_0
    sget-object v0, Lcn/jiguang/privates/core/business/JCoreBusiness;->instance:Lcn/jiguang/privates/core/business/JCoreBusiness;

    .line 22
    return-object v0
.end method


# virtual methods
.method public onCtrl(Landroid/content/Context;Landroid/os/Bundle;)V
    .locals 6

    .line 1
    .line 2
    const-string v0, "JCoreBusiness"

    .line 3
    .line 4
    const-string v1, "protocol"

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p2, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 8
    move-result-object p2

    .line 9
    .line 10
    check-cast p2, Lcn/jiguang/privates/core/api/JProtocol;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lcn/jiguang/privates/core/api/JProtocol;->getRid()J

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Lcn/jiguang/privates/core/api/JProtocol;->getBody()[B

    .line 17
    move-result-object p2

    .line 18
    .line 19
    .line 20
    invoke-static {p2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 21
    move-result-object p2

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getLong()J

    .line 25
    move-result-wide v2

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    .line 29
    move-result v4

    .line 30
    .line 31
    new-array v4, v4, [B

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, v4}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    new-instance p2, Ljava/lang/String;

    .line 37
    .line 38
    const-string v5, "UTF-8"

    .line 39
    .line 40
    .line 41
    invoke-direct {p2, v4, v5}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 42
    .line 43
    new-instance v4, Lcn/jiguang/privates/core/api/Outputer;

    .line 44
    .line 45
    .line 46
    invoke-direct {v4}, Lcn/jiguang/privates/core/api/Outputer;-><init>()V

    .line 47
    const/4 v5, 0x0

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, v5}, Lcn/jiguang/privates/core/api/Outputer;->writeU16(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v2, v3}, Lcn/jiguang/privates/core/api/Outputer;->writeU64(J)V

    .line 54
    .line 55
    const-string v5, ""

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5}, Ljava/lang/String;->getBytes()[B

    .line 59
    move-result-object v5

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, v5}, Lcn/jiguang/privates/core/api/Outputer;->writeByteArrayIncludeLength([B)V

    .line 63
    .line 64
    new-instance v5, Lcn/jiguang/privates/core/api/JProtocol;

    .line 65
    .line 66
    .line 67
    invoke-direct {v5}, Lcn/jiguang/privates/core/api/JProtocol;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5, v2, v3}, Lcn/jiguang/privates/core/api/JProtocol;->setRid(J)Lcn/jiguang/privates/core/api/JProtocol;

    .line 71
    move-result-object v2

    .line 72
    .line 73
    const/16 v3, 0x19

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v3}, Lcn/jiguang/privates/core/api/JProtocol;->setCommand(I)Lcn/jiguang/privates/core/api/JProtocol;

    .line 77
    move-result-object v2

    .line 78
    const/4 v3, 0x1

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v3}, Lcn/jiguang/privates/core/api/JProtocol;->setVersion(I)Lcn/jiguang/privates/core/api/JProtocol;

    .line 82
    move-result-object v2

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Lcn/jiguang/privates/core/api/Outputer;->toByteArray()[B

    .line 86
    move-result-object v3

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v3}, Lcn/jiguang/privates/core/api/JProtocol;->setBody([B)Lcn/jiguang/privates/core/api/JProtocol;

    .line 90
    move-result-object v2

    .line 91
    .line 92
    new-instance v3, Landroid/os/Bundle;

    .line 93
    .line 94
    .line 95
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 99
    .line 100
    const/16 v2, 0x8ae

    .line 101
    .line 102
    .line 103
    invoke-static {p1, v2, v3}, Lcn/jiguang/privates/common/api/JCommonPrivatesApi;->sendMessageToRemoteProcess(Landroid/content/Context;ILandroid/os/Bundle;)V

    .line 104
    .line 105
    new-instance v2, Lorg/json/JSONObject;

    .line 106
    .line 107
    .line 108
    invoke-direct {v2, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    new-instance p2, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    const-string v3, "onCtrl "

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-static {v2}, Lcn/jiguang/privates/common/log/JCommonLog;->toLogString(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 122
    move-result-object v3

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    move-result-object p2

    .line 130
    .line 131
    .line 132
    invoke-static {v0, p2}, Lcn/jiguang/privates/common/log/JCommonLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    const-string p2, "cmd"

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, p2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 138
    move-result p2

    .line 139
    .line 140
    const-string v3, "content"

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 144
    move-result-object v2

    .line 145
    .line 146
    new-instance v3, Landroid/os/Bundle;

    .line 147
    .line 148
    .line 149
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 153
    move-result-object v2

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-static {p1, p2, v3}, Lcn/jiguang/privates/common/api/JCommonPrivatesApi;->sendMessageToRemoteProcess(Landroid/content/Context;ILandroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    return-void

    .line 161
    :catchall_0
    move-exception p1

    .line 162
    .line 163
    new-instance p2, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    .line 168
    const-string v1, "onCtrl failed "

    .line 169
    .line 170
    .line 171
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 175
    move-result-object p1

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    move-result-object p1

    .line 183
    .line 184
    .line 185
    invoke-static {v0, p1}, Lcn/jiguang/privates/common/log/JCommonLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    return-void
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
.end method

.method public onMainLoginInfo(Landroid/content/Context;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    .line 2
    const-string p1, "code"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 6
    move-result p1

    .line 7
    .line 8
    const-string v0, "seed_id"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 12
    move-result v0

    .line 13
    .line 14
    .line 15
    const-string/jumbo v1, "server_time"

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 19
    move-result-wide v1

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lcn/jiguang/privates/core/global/JCoreGlobal;->setLoginCode(I)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lcn/jiguang/privates/core/global/JCoreGlobal;->setSeedId(I)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v2}, Lcn/jiguang/privates/core/global/JCoreGlobal;->setServerTime(J)V

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
.end method

.method public onMainRegisterInfo(Landroid/content/Context;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    .line 2
    const-string p1, "code"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    const-string/jumbo v0, "user_id"

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 13
    move-result-wide v0

    .line 14
    .line 15
    const-string v2, "registration_id"

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    const-string v3, "password"

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    move-result-object p2

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcn/jiguang/privates/core/global/JCoreGlobal;->setRegisterCode(I)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v1}, Lcn/jiguang/privates/core/global/JCoreGlobal;->setUserId(J)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2}, Lcn/jiguang/privates/core/global/JCoreGlobal;->setRegistrationId(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p2}, Lcn/jiguang/privates/core/global/JCoreGlobal;->setPassword(Ljava/lang/String;)V

    .line 38
    return-void
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
.end method

.method public onRemoteLoginInfo(Landroid/content/Context;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcn/jiguang/privates/core/cache/JCoreConfig;->getLoginCode(Landroid/content/Context;)I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lcn/jiguang/privates/core/cache/JCoreConfig;->getSeedId(Landroid/content/Context;)I

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lcn/jiguang/privates/core/cache/JCoreConfig;->getServerTime(Landroid/content/Context;)J

    .line 12
    move-result-wide v2

    .line 13
    .line 14
    new-instance v4, Landroid/os/Bundle;

    .line 15
    .line 16
    .line 17
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 18
    .line 19
    const-string v5, "code"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v4, v5, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 23
    .line 24
    const-string v0, "seed_id"

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 28
    .line 29
    .line 30
    const-string/jumbo v0, "server_time"

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4, v0, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 34
    .line 35
    const/16 v0, 0x836

    .line 36
    .line 37
    .line 38
    invoke-static {p1, v0, v4}, Lcn/jiguang/privates/common/api/JCommonPrivatesApi;->sendMessageToMainProcess(Landroid/content/Context;ILandroid/os/Bundle;)V

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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public onRemoteRegisterInfo(Landroid/content/Context;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcn/jiguang/privates/core/cache/JCoreConfig;->getRegisterCode(Landroid/content/Context;)I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lcn/jiguang/privates/core/cache/JCoreConfig;->getUserId(Landroid/content/Context;)J

    .line 8
    move-result-wide v1

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lcn/jiguang/privates/core/cache/JCoreConfig;->getRegistrationId(Landroid/content/Context;)Ljava/lang/String;

    .line 12
    move-result-object v3

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lcn/jiguang/privates/core/cache/JCoreConfig;->getPassword(Landroid/content/Context;)Ljava/lang/String;

    .line 16
    move-result-object v4

    .line 17
    .line 18
    new-instance v5, Landroid/os/Bundle;

    .line 19
    .line 20
    .line 21
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 22
    .line 23
    const-string v6, "code"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v5, v6, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    const-string/jumbo v0, "user_id"

    .line 30
    .line 31
    .line 32
    invoke-virtual {v5, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 33
    .line 34
    const-string v0, "registration_id"

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5, v0, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    const-string v0, "password"

    .line 40
    .line 41
    .line 42
    invoke-virtual {v5, v0, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    const/16 v0, 0x835

    .line 45
    .line 46
    .line 47
    invoke-static {p1, v0, v5}, Lcn/jiguang/privates/common/api/JCommonPrivatesApi;->sendMessageToMainProcess(Landroid/content/Context;ILandroid/os/Bundle;)V

    .line 48
    return-void
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
.end method
