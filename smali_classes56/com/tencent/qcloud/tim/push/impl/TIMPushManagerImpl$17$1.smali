.class Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17;->onSuccess(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17;


# direct methods
.method public constructor <init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17$1;->a:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17;

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
    .locals 13

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17$1;->a:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17;

    .line 3
    .line 4
    iget v1, v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17;->a:I

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    iget-object v1, v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17;->b:Lcom/tencent/qcloud/tim/push/TIMPushCallback;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17;->c:Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;Ljava/lang/Object;)V

    .line 14
    .line 15
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17$1;->a:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17;->e:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->b(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getPushChannelId()I

    .line 28
    move-result v0

    .line 29
    .line 30
    const/16 v1, 0x7d2

    .line 31
    .line 32
    if-ne v0, v1, :cond_0

    .line 33
    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    const-string v1, "notificationEnabled:"

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17$1;->a:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17;

    .line 45
    .line 46
    iget-object v1, v1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17;->e:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;

    .line 47
    .line 48
    .line 49
    invoke-static {v1}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;)Landroid/content/Context;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    .line 53
    invoke-static {v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Landroid/content/Context;)I

    .line 54
    move-result v1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v1, "|floatPermission:"

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->n()Z

    .line 66
    move-result v1

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v1, "|bgStartPermission:"

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-static {}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->m()Z

    .line 78
    move-result v1

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    move-result-object v9

    .line 86
    .line 87
    .line 88
    invoke-static {}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a()Ljava/lang/String;

    .line 89
    move-result-object v0

    .line 90
    .line 91
    .line 92
    invoke-static {v0, v9}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17$1;->a:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17;

    .line 95
    .line 96
    iget-object v2, v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17;->e:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;

    .line 97
    .line 98
    .line 99
    invoke-static {}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->c()Ljava/lang/String;

    .line 100
    move-result-object v10

    .line 101
    .line 102
    .line 103
    invoke-static {}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->h()Ljava/lang/String;

    .line 104
    move-result-object v11

    .line 105
    .line 106
    const-wide/16 v7, 0x1

    .line 107
    const/4 v12, 0x0

    .line 108
    .line 109
    const-wide/16 v3, 0x4

    .line 110
    .line 111
    const-wide/16 v5, 0x1

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v2 .. v12}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    .line 115
    :cond_0
    return-void

    .line 116
    .line 117
    .line 118
    :cond_1
    invoke-static {}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a()Ljava/lang/String;

    .line 119
    move-result-object v0

    .line 120
    .line 121
    new-instance v1, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    const-string v2, "setOfflinePushConfig finished, but push token report failed, errCode = "

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    iget-object v2, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17$1;->a:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17;

    .line 132
    .line 133
    iget v2, v2, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17;->a:I

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    const-string v2, ", errMsg = "

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    iget-object v2, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17$1;->a:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17;

    .line 144
    .line 145
    iget-object v2, v2, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17;->d:Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    move-result-object v1

    .line 153
    .line 154
    .line 155
    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17$1;->a:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17;

    .line 158
    .line 159
    iget-object v1, v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17;->b:Lcom/tencent/qcloud/tim/push/TIMPushCallback;

    .line 160
    .line 161
    iget v2, v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17;->a:I

    .line 162
    .line 163
    iget-object v0, v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17;->d:Ljava/lang/String;

    .line 164
    const/4 v3, 0x0

    .line 165
    .line 166
    .line 167
    invoke-static {v1, v2, v0, v3}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    .line 168
    return-void
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
