.class Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->b(Lcom/tencent/qcloud/tim/push/bean/NotificationBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:I

.field public final synthetic c:Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;


# direct methods
.method public constructor <init>(Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder$1;->c:Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder$1;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput p3, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder$1;->b:I

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
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Ljava/net/URL;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder$1;->a:Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->instrument(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    check-cast v1, Ljava/net/URLConnection;

    .line 19
    .line 20
    check-cast v1, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 21
    .line 22
    const/16 v2, 0x1f40

    .line 23
    .line 24
    .line 25
    :try_start_1
    invoke-virtual {v1, v2}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 29
    const/4 v2, 0x1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/net/URLConnection;->connect()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 39
    move-result v2

    .line 40
    .line 41
    const/16 v3, 0xc8

    .line 42
    .line 43
    if-eq v2, v3, :cond_0

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->a()Ljava/lang/String;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    const-string v3, "HttpURLConnection failed"

    .line 50
    .line 51
    .line 52
    invoke-static {v2, v3}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 56
    return-void

    .line 57
    :catchall_0
    move-exception v2

    .line 58
    move-object v4, v0

    .line 59
    .line 60
    goto/16 :goto_5

    .line 61
    :catch_0
    move-exception v2

    .line 62
    move-object v3, v0

    .line 63
    .line 64
    goto/16 :goto_2

    .line 65
    .line 66
    .line 67
    :cond_0
    :try_start_2
    invoke-virtual {v1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 68
    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    .line 70
    :try_start_3
    new-instance v3, Ljava/io/File;

    .line 71
    .line 72
    iget-object v4, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder$1;->c:Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;

    .line 73
    .line 74
    .line 75
    invoke-static {v4}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->a(Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;)Landroid/content/Context;

    .line 76
    move-result-object v4

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 80
    move-result-object v4

    .line 81
    .line 82
    new-instance v5, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    const-string v6, "downloaded_image"

    .line 88
    .line 89
    .line 90
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    iget v6, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder$1;->b:I

    .line 93
    .line 94
    .line 95
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v6, ".jpg"

    .line 98
    .line 99
    .line 100
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    move-result-object v5

    .line 105
    .line 106
    .line 107
    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 108
    .line 109
    new-instance v4, Ljava/io/FileOutputStream;

    .line 110
    .line 111
    .line 112
    invoke-direct {v4, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 113
    .line 114
    const/16 v0, 0x1000

    .line 115
    .line 116
    :try_start_4
    new-array v0, v0, [B

    .line 117
    .line 118
    .line 119
    :goto_0
    invoke-virtual {v2, v0}, Ljava/io/InputStream;->read([B)I

    .line 120
    move-result v5

    .line 121
    const/4 v6, -0x1

    .line 122
    .line 123
    if-eq v5, v6, :cond_1

    .line 124
    const/4 v6, 0x0

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4, v0, v6, v5}, Ljava/io/OutputStream;->write([BII)V

    .line 128
    goto :goto_0

    .line 129
    :catchall_1
    move-exception v0

    .line 130
    .line 131
    goto/16 :goto_6

    .line 132
    :catch_1
    move-exception v0

    .line 133
    goto :goto_1

    .line 134
    .line 135
    .line 136
    :cond_1
    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 140
    move-result-object v0

    .line 141
    .line 142
    .line 143
    invoke-static {}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->a()Ljava/lang/String;

    .line 144
    move-result-object v3

    .line 145
    .line 146
    new-instance v5, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 150
    .line 151
    const-string v6, "imagePath ="

    .line 152
    .line 153
    .line 154
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    move-result-object v5

    .line 162
    .line 163
    .line 164
    invoke-static {v3, v5}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    .line 166
    iget-object v3, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder$1;->c:Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;

    .line 167
    .line 168
    iget v5, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder$1;->b:I

    .line 169
    .line 170
    .line 171
    invoke-static {v3, v5, v0}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->a(Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;ILjava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 172
    .line 173
    .line 174
    :try_start_5
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    .line 178
    goto :goto_4

    .line 179
    :goto_1
    move-object v7, v2

    .line 180
    move-object v2, v0

    .line 181
    move-object v0, v7

    .line 182
    goto :goto_3

    .line 183
    :catchall_2
    move-exception v3

    .line 184
    move-object v4, v0

    .line 185
    move-object v0, v2

    .line 186
    move-object v2, v3

    .line 187
    goto :goto_5

    .line 188
    :catch_2
    move-exception v3

    .line 189
    move-object v7, v3

    .line 190
    move-object v3, v2

    .line 191
    move-object v2, v7

    .line 192
    goto :goto_2

    .line 193
    :catchall_3
    move-exception v2

    .line 194
    move-object v1, v0

    .line 195
    move-object v4, v1

    .line 196
    goto :goto_5

    .line 197
    :catch_3
    move-exception v2

    .line 198
    move-object v1, v0

    .line 199
    move-object v3, v1

    .line 200
    :goto_2
    move-object v4, v0

    .line 201
    move-object v0, v3

    .line 202
    .line 203
    .line 204
    :goto_3
    :try_start_6
    invoke-static {}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->a()Ljava/lang/String;

    .line 205
    move-result-object v3

    .line 206
    .line 207
    new-instance v5, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 211
    .line 212
    const-string v6, "downloadResource failed e ="

    .line 213
    .line 214
    .line 215
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 222
    move-result-object v2

    .line 223
    .line 224
    .line 225
    invoke-static {v3, v2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 226
    .line 227
    if-eqz v0, :cond_2

    .line 228
    .line 229
    .line 230
    :try_start_7
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 231
    .line 232
    :cond_2
    if-eqz v4, :cond_3

    .line 233
    .line 234
    .line 235
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    .line 236
    .line 237
    :catch_4
    :cond_3
    if-eqz v1, :cond_4

    .line 238
    .line 239
    .line 240
    :catch_5
    :goto_4
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 241
    :cond_4
    return-void

    .line 242
    :catchall_4
    move-exception v2

    .line 243
    :goto_5
    move-object v7, v2

    .line 244
    move-object v2, v0

    .line 245
    move-object v0, v7

    .line 246
    .line 247
    :goto_6
    if-eqz v2, :cond_5

    .line 248
    .line 249
    .line 250
    :try_start_8
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 251
    .line 252
    :cond_5
    if-eqz v4, :cond_6

    .line 253
    .line 254
    .line 255
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    .line 256
    .line 257
    :catch_6
    :cond_6
    if-eqz v1, :cond_7

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 261
    :cond_7
    throw v0
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
