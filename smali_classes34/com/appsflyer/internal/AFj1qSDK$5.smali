.class final Lcom/appsflyer/internal/AFj1qSDK$5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/appsflyer/internal/AFj1qSDK;->AFAdRevenueData(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private synthetic getMonetizationNetwork:Landroid/content/Context;

.field private synthetic getRevenue:Lcom/appsflyer/internal/AFj1qSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFj1qSDK;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/appsflyer/internal/AFj1qSDK$5;->getRevenue:Lcom/appsflyer/internal/AFj1qSDK;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/appsflyer/internal/AFj1qSDK$5;->getMonetizationNetwork:Landroid/content/Context;

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
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1qSDK$5;->getRevenue:Lcom/appsflyer/internal/AFj1qSDK;

    .line 3
    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    iput-wide v1, v0, Lcom/appsflyer/internal/AFj1tSDK;->component4:J

    .line 9
    .line 10
    sget-object v1, Lcom/appsflyer/internal/AFj1tSDK$AFa1ySDK;->getMediationNetwork:Lcom/appsflyer/internal/AFj1tSDK$AFa1ySDK;

    .line 11
    .line 12
    iput-object v1, v0, Lcom/appsflyer/internal/AFj1tSDK;->areAllFieldsValid:Lcom/appsflyer/internal/AFj1tSDK$AFa1ySDK;

    .line 13
    .line 14
    new-instance v1, Lcom/appsflyer/internal/AFj1tSDK$2;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v0}, Lcom/appsflyer/internal/AFj1tSDK$2;-><init>(Lcom/appsflyer/internal/AFj1tSDK;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/util/Observable;->addObserver(Ljava/util/Observer;)V

    .line 21
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, "content://"

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1qSDK$5;->getRevenue:Lcom/appsflyer/internal/AFj1qSDK;

    .line 30
    .line 31
    iget-object v1, v1, Lcom/appsflyer/internal/AFj1qSDK;->getMonetizationNetwork:Landroid/content/pm/ProviderInfo;

    .line 32
    .line 33
    iget-object v1, v1, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v1, "/transaction_id"

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 49
    move-result-object v2

    .line 50
    .line 51
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1qSDK$5;->getMonetizationNetwork:Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    invoke-static {v0, v2}, Lcom/appsflyer/internal/AFj1qSDK;->B_(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/ContentProviderClient;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    if-eqz v1, :cond_0

    .line 58
    .line 59
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v3, "app_id="

    .line 62
    .line 63
    .line 64
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    iget-object v3, p0, Lcom/appsflyer/internal/AFj1qSDK$5;->getMonetizationNetwork:Landroid/content/Context;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 70
    move-result-object v3

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    move-result-object v4

    .line 78
    const/4 v5, 0x0

    .line 79
    const/4 v6, 0x0

    .line 80
    const/4 v3, 0x0

    .line 81
    .line 82
    .line 83
    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentProviderClient;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 84
    move-result-object v0
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Landroid/content/ContentProviderClient;->close()V

    .line 88
    goto :goto_6

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    move-object v5, v0

    .line 91
    goto :goto_0

    .line 92
    :catch_0
    move-exception v0

    .line 93
    move-object v5, v0

    .line 94
    goto :goto_2

    .line 95
    :catch_1
    move-exception v0

    .line 96
    move-object v5, v0

    .line 97
    goto :goto_3

    .line 98
    .line 99
    :goto_0
    :try_start_1
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 100
    .line 101
    sget-object v3, Lcom/appsflyer/internal/AFh1ySDK;->afDebugLog:Lcom/appsflyer/internal/AFh1ySDK;

    .line 102
    .line 103
    const-string v4, "Error to get data from providerClient "

    .line 104
    const/4 v7, 0x1

    .line 105
    const/4 v8, 0x0

    .line 106
    const/4 v6, 0x0

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v2 .. v8}, Lcom/appsflyer/internal/AFg1bSDK;->e(Lcom/appsflyer/internal/AFh1ySDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 110
    .line 111
    .line 112
    :goto_1
    invoke-virtual {v1}, Landroid/content/ContentProviderClient;->close()V

    .line 113
    goto :goto_5

    .line 114
    :catchall_1
    move-exception v0

    .line 115
    goto :goto_4

    .line 116
    .line 117
    :goto_2
    :try_start_2
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 118
    .line 119
    sget-object v3, Lcom/appsflyer/internal/AFh1ySDK;->afDebugLog:Lcom/appsflyer/internal/AFh1ySDK;

    .line 120
    .line 121
    const-string v4, "Failed to query unstable content providerClient"

    .line 122
    const/4 v7, 0x1

    .line 123
    const/4 v8, 0x0

    .line 124
    const/4 v6, 0x0

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v2 .. v8}, Lcom/appsflyer/internal/AFg1bSDK;->e(Lcom/appsflyer/internal/AFh1ySDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V

    .line 128
    goto :goto_1

    .line 129
    .line 130
    :goto_3
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 131
    .line 132
    sget-object v3, Lcom/appsflyer/internal/AFh1ySDK;->afDebugLog:Lcom/appsflyer/internal/AFh1ySDK;

    .line 133
    .line 134
    const-string v4, "Failed to acquire unstable content providerClient"

    .line 135
    const/4 v7, 0x1

    .line 136
    const/4 v8, 0x0

    .line 137
    const/4 v6, 0x0

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v2 .. v8}, Lcom/appsflyer/internal/AFg1bSDK;->e(Lcom/appsflyer/internal/AFh1ySDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 141
    goto :goto_1

    .line 142
    .line 143
    .line 144
    :goto_4
    invoke-virtual {v1}, Landroid/content/ContentProviderClient;->close()V

    .line 145
    throw v0

    .line 146
    :cond_0
    :goto_5
    const/4 v0, 0x0

    .line 147
    .line 148
    .line 149
    :goto_6
    const-string/jumbo v1, "response"

    .line 150
    .line 151
    if-eqz v0, :cond_3

    .line 152
    .line 153
    .line 154
    const-string/jumbo v2, "transaction_id"

    .line 155
    .line 156
    .line 157
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 158
    move-result v2

    .line 159
    const/4 v3, -0x1

    .line 160
    .line 161
    if-ne v2, v3, :cond_1

    .line 162
    .line 163
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 164
    .line 165
    sget-object v3, Lcom/appsflyer/internal/AFh1ySDK;->afDebugLog:Lcom/appsflyer/internal/AFh1ySDK;

    .line 166
    .line 167
    const-string v4, "Wrong column name"

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v3, v4}, Lcom/appsflyer/internal/AFg1bSDK;->w(Lcom/appsflyer/internal/AFh1ySDK;Ljava/lang/String;)V

    .line 171
    .line 172
    iget-object v2, p0, Lcom/appsflyer/internal/AFj1qSDK$5;->getRevenue:Lcom/appsflyer/internal/AFj1qSDK;

    .line 173
    .line 174
    iget-object v2, v2, Lcom/appsflyer/internal/AFj1tSDK;->getMediationNetwork:Ljava/util/Map;

    .line 175
    .line 176
    const-string v3, "FEATURE_NOT_SUPPORTED"

    .line 177
    .line 178
    .line 179
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    goto :goto_7

    .line 181
    .line 182
    :cond_1
    iget-object v3, p0, Lcom/appsflyer/internal/AFj1qSDK$5;->getRevenue:Lcom/appsflyer/internal/AFj1qSDK;

    .line 183
    .line 184
    iget-object v3, v3, Lcom/appsflyer/internal/AFj1tSDK;->getMediationNetwork:Ljava/util/Map;

    .line 185
    .line 186
    const-string v4, "OK"

    .line 187
    .line 188
    .line 189
    invoke-interface {v3, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 193
    move-result v1

    .line 194
    .line 195
    if-eqz v1, :cond_2

    .line 196
    .line 197
    .line 198
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 199
    move-result-object v1

    .line 200
    .line 201
    .line 202
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 203
    .line 204
    if-eqz v1, :cond_2

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 208
    move-result v2

    .line 209
    .line 210
    if-nez v2, :cond_2

    .line 211
    .line 212
    iget-object v2, p0, Lcom/appsflyer/internal/AFj1qSDK$5;->getRevenue:Lcom/appsflyer/internal/AFj1qSDK;

    .line 213
    .line 214
    iget-object v2, v2, Lcom/appsflyer/internal/AFj1tSDK;->getMediationNetwork:Ljava/util/Map;

    .line 215
    .line 216
    .line 217
    const-string/jumbo v3, "referrer"

    .line 218
    .line 219
    .line 220
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    :cond_2
    :goto_7
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 224
    goto :goto_8

    .line 225
    .line 226
    :cond_3
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 227
    .line 228
    sget-object v2, Lcom/appsflyer/internal/AFh1ySDK;->afDebugLog:Lcom/appsflyer/internal/AFh1ySDK;

    .line 229
    .line 230
    const-string v3, "ContentProvider query failed, got null Cursor"

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, v2, v3}, Lcom/appsflyer/internal/AFg1bSDK;->w(Lcom/appsflyer/internal/AFh1ySDK;Ljava/lang/String;)V

    .line 234
    .line 235
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1qSDK$5;->getRevenue:Lcom/appsflyer/internal/AFj1qSDK;

    .line 236
    .line 237
    iget-object v0, v0, Lcom/appsflyer/internal/AFj1tSDK;->getMediationNetwork:Ljava/util/Map;

    .line 238
    .line 239
    const-string v2, "SERVICE_UNAVAILABLE"

    .line 240
    .line 241
    .line 242
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    :goto_8
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1qSDK$5;->getRevenue:Lcom/appsflyer/internal/AFj1qSDK;

    .line 245
    .line 246
    iget-object v1, v0, Lcom/appsflyer/internal/AFj1tSDK;->getMediationNetwork:Ljava/util/Map;

    .line 247
    .line 248
    iget-object v2, p0, Lcom/appsflyer/internal/AFj1qSDK$5;->getMonetizationNetwork:Landroid/content/Context;

    .line 249
    .line 250
    iget-object v0, v0, Lcom/appsflyer/internal/AFj1qSDK;->getMonetizationNetwork:Landroid/content/pm/ProviderInfo;

    .line 251
    .line 252
    iget-object v0, v0, Landroid/content/pm/PackageItemInfo;->packageName:Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    invoke-static {v2, v0}, Lcom/appsflyer/internal/AFj1jSDK;->getCurrencyIso4217Code(Landroid/content/Context;Ljava/lang/String;)J

    .line 256
    move-result-wide v2

    .line 257
    .line 258
    .line 259
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 260
    move-result-object v0

    .line 261
    .line 262
    const-string v2, "api_ver"

    .line 263
    .line 264
    .line 265
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1qSDK$5;->getRevenue:Lcom/appsflyer/internal/AFj1qSDK;

    .line 268
    .line 269
    iget-object v1, v0, Lcom/appsflyer/internal/AFj1tSDK;->getMediationNetwork:Ljava/util/Map;

    .line 270
    .line 271
    iget-object v2, p0, Lcom/appsflyer/internal/AFj1qSDK$5;->getMonetizationNetwork:Landroid/content/Context;

    .line 272
    .line 273
    iget-object v0, v0, Lcom/appsflyer/internal/AFj1qSDK;->getMonetizationNetwork:Landroid/content/pm/ProviderInfo;

    .line 274
    .line 275
    iget-object v0, v0, Landroid/content/pm/PackageItemInfo;->packageName:Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    invoke-static {v2, v0}, Lcom/appsflyer/internal/AFj1jSDK;->getMediationNetwork(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 279
    move-result-object v0

    .line 280
    .line 281
    const-string v2, "api_ver_name"

    .line 282
    .line 283
    .line 284
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1qSDK$5;->getRevenue:Lcom/appsflyer/internal/AFj1qSDK;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFj1tSDK;->getRevenue()V

    .line 290
    return-void
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
