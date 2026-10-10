.class final Lcom/appsflyer/internal/AFe1nSDK$5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appsflyer/internal/AFe1nSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private synthetic getCurrencyIso4217Code:Lcom/appsflyer/internal/AFe1nSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFe1nSDK;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1nSDK$5;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFe1nSDK;

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
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1nSDK$5;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFe1nSDK;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/appsflyer/internal/AFe1nSDK;->component1:Ljava/util/NavigableSet;

    .line 5
    monitor-enter v0

    .line 6
    .line 7
    :try_start_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1nSDK$5;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFe1nSDK;

    .line 8
    .line 9
    iget-object v1, v1, Lcom/appsflyer/internal/AFe1nSDK;->component1:Ljava/util/NavigableSet;

    .line 10
    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/NavigableSet;->pollFirst()Ljava/lang/Object;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    check-cast v1, Lcom/appsflyer/internal/AFe1mSDK;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    .line 22
    goto/16 :goto_0

    .line 23
    .line 24
    :cond_0
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1nSDK$5;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFe1nSDK;

    .line 25
    .line 26
    iget-object v2, v2, Lcom/appsflyer/internal/AFe1nSDK;->component4:Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 30
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/appsflyer/internal/AFe1mSDK;->getCurrencyIso4217Code()J

    .line 34
    move-result-wide v2

    .line 35
    .line 36
    new-instance v0, Lcom/appsflyer/internal/AFe1lSDK;

    .line 37
    .line 38
    .line 39
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 40
    move-result-object v4

    .line 41
    .line 42
    .line 43
    invoke-direct {v0, v4}, Lcom/appsflyer/internal/AFe1lSDK;-><init>(Ljava/lang/Thread;)V

    .line 44
    .line 45
    const-wide/16 v4, 0x0

    .line 46
    .line 47
    cmp-long v4, v2, v4

    .line 48
    .line 49
    if-lez v4, :cond_1

    .line 50
    .line 51
    iget-object v4, p0, Lcom/appsflyer/internal/AFe1nSDK$5;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFe1nSDK;

    .line 52
    .line 53
    iget-object v4, v4, Lcom/appsflyer/internal/AFe1nSDK;->AFAdRevenueData:Ljava/util/Timer;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 57
    .line 58
    :cond_1
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1nSDK$5;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFe1nSDK;

    .line 59
    .line 60
    iget-object v3, v2, Lcom/appsflyer/internal/AFe1nSDK;->getMonetizationNetwork:Ljava/util/concurrent/Executor;

    .line 61
    .line 62
    new-instance v4, Lcom/appsflyer/internal/AFe1nSDK$1;

    .line 63
    .line 64
    .line 65
    invoke-direct {v4, v2, v1}, Lcom/appsflyer/internal/AFe1nSDK$1;-><init>(Lcom/appsflyer/internal/AFe1nSDK;Lcom/appsflyer/internal/AFe1mSDK;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 69
    .line 70
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1nSDK$5;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFe1nSDK;

    .line 71
    .line 72
    iget-object v2, v2, Lcom/appsflyer/internal/AFe1nSDK;->component1:Ljava/util/NavigableSet;

    .line 73
    .line 74
    .line 75
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 76
    move-result v2

    .line 77
    .line 78
    if-nez v2, :cond_2

    .line 79
    .line 80
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1nSDK$5;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFe1nSDK;

    .line 81
    .line 82
    iget-object v3, v2, Lcom/appsflyer/internal/AFe1nSDK;->getCurrencyIso4217Code:Ljava/util/concurrent/ExecutorService;

    .line 83
    .line 84
    new-instance v4, Lcom/appsflyer/internal/AFe1nSDK$5;

    .line 85
    .line 86
    .line 87
    invoke-direct {v4, v2}, Lcom/appsflyer/internal/AFe1nSDK$5;-><init>(Lcom/appsflyer/internal/AFe1nSDK;)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v3, v4}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 91
    .line 92
    :cond_2
    :try_start_1
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 93
    .line 94
    sget-object v3, Lcom/appsflyer/internal/AFh1ySDK;->component4:Lcom/appsflyer/internal/AFh1ySDK;

    .line 95
    .line 96
    .line 97
    const-string/jumbo v4, "starting task execution: "

    .line 98
    .line 99
    .line 100
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 101
    move-result-object v5

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    move-result-object v4

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v3, v4}, Lcom/appsflyer/internal/AFg1bSDK;->d(Lcom/appsflyer/internal/AFh1ySDK;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Lcom/appsflyer/internal/AFe1mSDK;->component1()Lcom/appsflyer/internal/AFe1qSDK;

    .line 112
    move-result-object v2

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/util/TimerTask;->cancel()Z

    .line 116
    .line 117
    iget-object v3, p0, Lcom/appsflyer/internal/AFe1nSDK$5;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFe1nSDK;

    .line 118
    .line 119
    iget-object v4, v3, Lcom/appsflyer/internal/AFe1nSDK;->getMonetizationNetwork:Ljava/util/concurrent/Executor;

    .line 120
    .line 121
    new-instance v5, Lcom/appsflyer/internal/AFe1nSDK$3;

    .line 122
    .line 123
    .line 124
    invoke-direct {v5, v3, v1, v2}, Lcom/appsflyer/internal/AFe1nSDK$3;-><init>(Lcom/appsflyer/internal/AFe1nSDK;Lcom/appsflyer/internal/AFe1mSDK;Lcom/appsflyer/internal/AFe1qSDK;)V

    .line 125
    .line 126
    .line 127
    invoke-interface {v4, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/InterruptedIOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 128
    return-void

    .line 129
    .line 130
    .line 131
    :catchall_1
    invoke-virtual {v0}, Ljava/util/TimerTask;->cancel()Z

    .line 132
    .line 133
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1nSDK$5;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFe1nSDK;

    .line 134
    .line 135
    sget-object v2, Lcom/appsflyer/internal/AFe1qSDK;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFe1qSDK;

    .line 136
    .line 137
    iget-object v3, v0, Lcom/appsflyer/internal/AFe1nSDK;->getMonetizationNetwork:Ljava/util/concurrent/Executor;

    .line 138
    .line 139
    new-instance v4, Lcom/appsflyer/internal/AFe1nSDK$3;

    .line 140
    .line 141
    .line 142
    invoke-direct {v4, v0, v1, v2}, Lcom/appsflyer/internal/AFe1nSDK$3;-><init>(Lcom/appsflyer/internal/AFe1nSDK;Lcom/appsflyer/internal/AFe1mSDK;Lcom/appsflyer/internal/AFe1qSDK;)V

    .line 143
    .line 144
    .line 145
    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 146
    return-void

    .line 147
    .line 148
    :catch_0
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 149
    .line 150
    sget-object v2, Lcom/appsflyer/internal/AFh1ySDK;->component4:Lcom/appsflyer/internal/AFh1ySDK;

    .line 151
    .line 152
    .line 153
    const-string/jumbo v3, "task was interrupted: "

    .line 154
    .line 155
    .line 156
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 157
    move-result-object v4

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    move-result-object v3

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v2, v3}, Lcom/appsflyer/internal/AFg1bSDK;->d(Lcom/appsflyer/internal/AFh1ySDK;Ljava/lang/String;)V

    .line 165
    .line 166
    sget-object v0, Lcom/appsflyer/internal/AFe1qSDK;->getMonetizationNetwork:Lcom/appsflyer/internal/AFe1qSDK;

    .line 167
    .line 168
    iput-object v0, v1, Lcom/appsflyer/internal/AFe1mSDK;->AFAdRevenueData:Lcom/appsflyer/internal/AFe1qSDK;

    .line 169
    .line 170
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1nSDK$5;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFe1nSDK;

    .line 171
    .line 172
    iget-object v3, v2, Lcom/appsflyer/internal/AFe1nSDK;->getMonetizationNetwork:Ljava/util/concurrent/Executor;

    .line 173
    .line 174
    new-instance v4, Lcom/appsflyer/internal/AFe1nSDK$3;

    .line 175
    .line 176
    .line 177
    invoke-direct {v4, v2, v1, v0}, Lcom/appsflyer/internal/AFe1nSDK$3;-><init>(Lcom/appsflyer/internal/AFe1nSDK;Lcom/appsflyer/internal/AFe1mSDK;Lcom/appsflyer/internal/AFe1qSDK;)V

    .line 178
    .line 179
    .line 180
    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 181
    return-void

    .line 182
    :goto_0
    monitor-exit v0

    .line 183
    throw v1
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
.end method
