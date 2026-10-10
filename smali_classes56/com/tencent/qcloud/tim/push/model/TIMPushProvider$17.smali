.class Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$17;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(Lcom/tencent/imsdk/v2/V2TIMMessage;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/tencent/imsdk/v2/V2TIMMessage;

.field public final synthetic b:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;


# direct methods
.method public constructor <init>(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Lcom/tencent/imsdk/v2/V2TIMMessage;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$17;->b:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$17;->a:Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$17;->a:Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const-string v1, "message is null"

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    return-void

    .line 15
    .line 16
    :cond_0
    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$17;->b:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getSender()Ljava/lang/String;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v0}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->b(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Ljava/lang/String;)Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a()Ljava/lang/String;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    const-string v1, "message is self and return"

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    return-void

    .line 37
    .line 38
    :cond_1
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$17;->a:Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getOfflinePushInfo()Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    if-eqz v0, :cond_6

    .line 45
    .line 46
    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$17;->b:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v0}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;)Z

    .line 50
    move-result v1

    .line 51
    .line 52
    if-nez v1, :cond_2

    .line 53
    goto :goto_1

    .line 54
    .line 55
    :cond_2
    new-instance v1, Lcom/tencent/qcloud/tim/push/TIMPushMessage;

    .line 56
    .line 57
    .line 58
    invoke-direct {v1}, Lcom/tencent/qcloud/tim/push/TIMPushMessage;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->getTitle()Ljava/lang/String;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Lcom/tencent/qcloud/tim/push/TIMPushMessage;->setTitle(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->getDesc()Ljava/lang/String;

    .line 69
    move-result-object v2

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v2}, Lcom/tencent/qcloud/tim/push/TIMPushMessage;->setDesc(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->getExt()[B

    .line 76
    move-result-object v0

    .line 77
    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    new-instance v2, Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    invoke-direct {v2, v0}, Ljava/lang/String;-><init>([B)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, v2}, Lcom/tencent/qcloud/tim/push/TIMPushMessage;->setExt(Ljava/lang/String;)V

    .line 87
    .line 88
    :cond_3
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$17;->a:Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getMsgID()Ljava/lang/String;

    .line 92
    move-result-object v0

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v0}, Lcom/tencent/qcloud/tim/push/TIMPushMessage;->setMessageID(Ljava/lang/String;)V

    .line 96
    .line 97
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$17;->b:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    .line 98
    .line 99
    .line 100
    invoke-static {v0}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;)Ljava/util/List;

    .line 101
    move-result-object v0

    .line 102
    .line 103
    .line 104
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 105
    move-result-object v0

    .line 106
    .line 107
    .line 108
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    move-result v2

    .line 110
    .line 111
    if-eqz v2, :cond_4

    .line 112
    .line 113
    .line 114
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    move-result-object v2

    .line 116
    .line 117
    check-cast v2, Lcom/tencent/qcloud/tim/push/TIMPushListener;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v1}, Lcom/tencent/qcloud/tim/push/TIMPushListener;->onRecvPushMessage(Lcom/tencent/qcloud/tim/push/TIMPushMessage;)V

    .line 121
    goto :goto_0

    .line 122
    .line 123
    .line 124
    :cond_4
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    .line 125
    move-result-object v0

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMManager;->getLoginUser()Ljava/lang/String;

    .line 129
    move-result-object v0

    .line 130
    .line 131
    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$17;->a:Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getSender()Ljava/lang/String;

    .line 135
    move-result-object v1

    .line 136
    .line 137
    .line 138
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 139
    move-result v0

    .line 140
    .line 141
    if-eqz v0, :cond_5

    .line 142
    .line 143
    .line 144
    invoke-static {}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a()Ljava/lang/String;

    .line 145
    move-result-object v0

    .line 146
    .line 147
    const-string v1, "message is self"

    .line 148
    .line 149
    .line 150
    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    return-void

    .line 152
    .line 153
    :cond_5
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$17;->b:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    .line 154
    .line 155
    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$17;->a:Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 156
    .line 157
    .line 158
    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->b(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Lcom/tencent/imsdk/v2/V2TIMMessage;)V

    .line 159
    return-void

    .line 160
    .line 161
    .line 162
    :cond_6
    :goto_1
    invoke-static {}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a()Ljava/lang/String;

    .line 163
    move-result-object v0

    .line 164
    .line 165
    const-string v1, "offlinePushInfo is null"

    .line 166
    .line 167
    .line 168
    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    return-void
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
