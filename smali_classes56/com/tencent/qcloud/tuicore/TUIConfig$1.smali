.class final Lcom/tencent/qcloud/tuicore/TUIConfig$1;
.super Ljava/lang/Object;
.source "TUIConfig.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/qcloud/tuicore/TUIConfig;->setSceneOptimizParams(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field final synthetic val$scene:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/TUIConfig$1;->val$scene:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIConfig;->getAppContext()Landroid/content/Context;

    .line 4
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    :try_start_1
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIConfig;->getAppContext()Landroid/content/Context;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v0, v1

    .line 19
    .line 20
    :goto_0
    new-instance v2, Ljava/net/URL;

    .line 21
    .line 22
    const-string v3, "https://demos.trtc.tencent-cloud.com/prod/base/v1/events/stat"

    .line 23
    .line 24
    .line 25
    invoke-direct {v2, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    invoke-static {v2}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->instrument(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    check-cast v2, Ljava/net/URLConnection;

    .line 36
    .line 37
    check-cast v2, Ljava/net/HttpURLConnection;

    .line 38
    .line 39
    const/16 v3, 0x1388

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 46
    const/4 v3, 0x1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 53
    const/4 v3, 0x0

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 57
    .line 58
    const-string v4, "POST"

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v4}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 62
    .line 63
    const-string v4, "Content-Type"

    .line 64
    .line 65
    const-string v5, "application/json"

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v4, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    new-instance v4, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUILogin;->getSdkAppId()I

    .line 77
    move-result v5

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    move-result-object v4

    .line 88
    .line 89
    new-instance v5, Lorg/json/JSONObject;

    .line 90
    .line 91
    .line 92
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 93
    .line 94
    const-string v6, "sdkappid"

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5, v6, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 98
    .line 99
    const-string v4, "bundleId"

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 103
    .line 104
    const-string v1, "component"

    .line 105
    .line 106
    iget-object v4, p0, Lcom/tencent/qcloud/tuicore/TUIConfig$1;->val$scene:Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v5, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 110
    .line 111
    const-string v1, "package"

    .line 112
    .line 113
    .line 114
    invoke-virtual {v5, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 115
    .line 116
    .line 117
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUILogin;->getUserId()Ljava/lang/String;

    .line 118
    move-result-object v0

    .line 119
    .line 120
    new-instance v1, Lorg/json/JSONObject;

    .line 121
    .line 122
    .line 123
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 124
    .line 125
    const-string v4, "userId"

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 129
    .line 130
    const-string v0, "event"

    .line 131
    .line 132
    const-string v4, "useScenario"

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 136
    .line 137
    const-string v0, "msg"

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 141
    .line 142
    .line 143
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 144
    move-result-object v0

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 148
    move-result-object v1

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 152
    move-result-object v0

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 165
    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 166
    .line 167
    const/16 v1, 0xc8

    .line 168
    .line 169
    const-string v4, "setSceneOptimizParams"

    .line 170
    .line 171
    if-ne v0, v1, :cond_2

    .line 172
    .line 173
    .line 174
    :try_start_2
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 175
    move-result-object v0

    .line 176
    .line 177
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 178
    .line 179
    .line 180
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 181
    .line 182
    const/16 v5, 0x400

    .line 183
    .line 184
    new-array v5, v5, [B

    .line 185
    .line 186
    .line 187
    :goto_1
    invoke-virtual {v0, v5}, Ljava/io/InputStream;->read([B)I

    .line 188
    move-result v6

    .line 189
    const/4 v7, -0x1

    .line 190
    .line 191
    if-eq v6, v7, :cond_1

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, v5, v3, v6}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 195
    goto :goto_1

    .line 196
    .line 197
    :cond_1
    new-instance v3, Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 201
    move-result-object v5

    .line 202
    .line 203
    .line 204
    invoke-direct {v3, v5}, Ljava/lang/String;-><init>([B)V

    .line 205
    .line 206
    new-instance v5, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 210
    .line 211
    const-string v6, "msg:"

    .line 212
    .line 213
    .line 214
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    move-result-object v3

    .line 222
    .line 223
    .line 224
    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 234
    return-void

    .line 235
    .line 236
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 240
    .line 241
    const-string v1, "ResponseCode:"

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 248
    move-result v1

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    move-result-object v0

    .line 256
    .line 257
    .line 258
    invoke-static {v4, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 259
    return-void

    .line 260
    .line 261
    :catch_0
    const-string v0, "TUICore"

    .line 262
    .line 263
    const-string v1, "setSceneOptimizParams exception"

    .line 264
    .line 265
    .line 266
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 267
    return-void
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
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
.end method
