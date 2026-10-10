.class public Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;
.super Ljava/lang/Object;
.source "PermissionRequester.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$RequestData;,
        Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$Result;
    }
.end annotation


# static fields
.field public static final BG_START_PERMISSION:Ljava/lang/String; = "PermissionStartActivityFromBackground"

.field public static final FLOAT_PERMISSION:Ljava/lang/String; = "PermissionOverlayWindows"

.field public static final PERMISSION_NOTIFY_EVENT_KEY:Ljava/lang/String; = "PERMISSION_NOTIFY_EVENT_KEY"

.field public static final PERMISSION_NOTIFY_EVENT_SUB_KEY:Ljava/lang/String; = "PERMISSION_NOTIFY_EVENT_SUB_KEY"

.field public static final PERMISSION_REQUEST_KEY:Ljava/lang/String; = "PERMISSION_REQUEST_KEY"

.field public static final PERMISSION_RESULT:Ljava/lang/String; = "PERMISSION_RESULT"

.field private static final TAG:Ljava/lang/String; = "PermissionRequester"

.field private static sIsRequesting:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static final sLock:Ljava/lang/Object;


# instance fields
.field private mDescription:Ljava/lang/String;

.field private mDirectPermissionList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mIndirectPermissionList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mPermissionCallback:Lcom/tencent/qcloud/tuicore/permission/PermissionCallback;

.field private mPermissionNotification:Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;

.field private mPermissions:[Ljava/lang/String;

.field private mSettingsTip:Ljava/lang/String;

.field private mTitle:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->sLock:Ljava/lang/Object;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 14
    .line 15
    sput-object v0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->sIsRequesting:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    return-void
.end method

.method private varargs constructor <init>([Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mDirectPermissionList:Ljava/util/List;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mIndirectPermissionList:Ljava/util/List;

    .line 18
    .line 19
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mPermissions:[Ljava/lang/String;

    .line 20
    array-length v0, p1

    .line 21
    const/4 v1, 0x0

    .line 22
    .line 23
    :goto_0
    if-ge v1, v0, :cond_2

    .line 24
    .line 25
    aget-object v2, p1, v1

    .line 26
    .line 27
    const-string v3, "PermissionOverlayWindows"

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    move-result v3

    .line 32
    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    const-string v3, "PermissionStartActivityFromBackground"

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    move-result v3

    .line 40
    .line 41
    if-eqz v3, :cond_0

    .line 42
    goto :goto_1

    .line 43
    .line 44
    :cond_0
    iget-object v3, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mDirectPermissionList:Ljava/util/List;

    .line 45
    .line 46
    .line 47
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    goto :goto_2

    .line 49
    .line 50
    :cond_1
    :goto_1
    iget-object v3, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mIndirectPermissionList:Ljava/util/List;

    .line 51
    .line 52
    .line 53
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 56
    goto :goto_0

    .line 57
    .line 58
    :cond_2
    new-instance p1, Lcom/tencent/qcloud/tuicore/permission/d;

    .line 59
    .line 60
    .line 61
    invoke-direct {p1, p0}, Lcom/tencent/qcloud/tuicore/permission/d;-><init>(Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;)V

    .line 62
    .line 63
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mPermissionNotification:Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;

    .line 64
    return-void
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
.end method

.method public static synthetic a(Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    goto :goto_0

    .line 7
    .line 8
    :cond_0
    const-string p1, "PERMISSION_RESULT"

    .line 9
    .line 10
    .line 11
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    if-nez p1, :cond_1

    .line 15
    :goto_0
    return-void

    .line 16
    .line 17
    :cond_1
    check-cast p1, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$Result;

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->notifyPermissionRequestResult(Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$Result;)V

    .line 21
    return-void
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
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
.end method

.method private findUnauthorizedPermissions([Ljava/lang/String;)[Ljava/lang/String;
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIConfig;->getAppContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string v0, "PermissionRequester"

    .line 9
    .line 10
    const-string v1, "findUnauthorizedPermissions appContext is null"

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    return-object p1

    .line 15
    .line 16
    :cond_0
    new-instance v1, Ljava/util/LinkedList;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 20
    array-length v2, p1

    .line 21
    const/4 v3, 0x0

    .line 22
    move v4, v3

    .line 23
    .line 24
    :goto_0
    if-ge v4, v2, :cond_2

    .line 25
    .line 26
    aget-object v5, p1, v4

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v5}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 30
    move-result v6

    .line 31
    .line 32
    if-eqz v6, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_2
    new-array p1, v3, [Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    invoke-interface {v1, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    check-cast p1, [Ljava/lang/String;

    .line 47
    return-object p1
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
.end method

.method private has(Ljava/lang/String;)Z
    .locals 2

    .line 7
    invoke-static {}, Lcom/tencent/qcloud/tuicore/util/TUIBuild;->getVersionInt()I

    move-result v0

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    .line 8
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIConfig;->getAppContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private hasBgStartPermission()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/qcloud/tuicore/util/TUIBuild;->isBrandHuawei()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/tencent/qcloud/tuicore/util/TUIBuild;->isHarmonyOS()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIConfig;->getAppContext()Landroid/content/Context;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v0}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->isHarmonyBgStartPermissionAllowed(Landroid/content/Context;)Z

    .line 20
    move-result v0

    .line 21
    return v0

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-static {}, Lcom/tencent/qcloud/tuicore/util/TUIBuild;->isBrandVivo()Z

    .line 25
    move-result v0

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIConfig;->getAppContext()Landroid/content/Context;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, v0}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->isVivoBgStartPermissionAllowed(Landroid/content/Context;)Z

    .line 35
    move-result v0

    .line 36
    return v0

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-static {}, Lcom/tencent/qcloud/tuicore/util/TUIBuild;->isBrandXiaoMi()Z

    .line 40
    move-result v0

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lcom/tencent/qcloud/tuicore/util/TUIBuild;->isMiuiOptimization()Z

    .line 46
    move-result v0

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIConfig;->getAppContext()Landroid/content/Context;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    .line 55
    invoke-direct {p0, v0}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->isXiaomiBgStartPermissionAllowed(Landroid/content/Context;)Z

    .line 56
    move-result v0

    .line 57
    return v0

    .line 58
    .line 59
    .line 60
    :cond_2
    invoke-direct {p0}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->hasFloatPermission()Z

    .line 61
    move-result v0

    .line 62
    return v0
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
.end method

.method private hasFloatPermission()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIConfig;->getAppContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 8
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return v0

    .line 10
    :catch_0
    move-exception v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 14
    const/4 v0, 0x0

    .line 15
    return v0
    .line 16
.end method

.method private isHarmonyBgStartPermissionAllowed(Landroid/content/Context;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    const-string v1, "appops"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    check-cast v1, Landroid/app/AppOpsManager;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    return v0

    .line 13
    .line 14
    :cond_0
    const-string v2, "com.huawei.android.app.AppOpsManagerEx"

    .line 15
    .line 16
    .line 17
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    const-string v3, "checkHwOpNoThrow"

    .line 21
    .line 22
    const-class v4, Landroid/app/AppOpsManager;

    .line 23
    .line 24
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 25
    .line 26
    const-class v6, Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    filled-new-array {v4, v5, v5, v6}, [Ljava/lang/Class;

    .line 30
    move-result-object v4

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    .line 41
    const v4, 0x186a0

    .line 42
    .line 43
    .line 44
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    move-result-object v4

    .line 46
    .line 47
    .line 48
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 49
    move-result v5

    .line 50
    .line 51
    .line 52
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    move-result-object v5

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    .line 60
    filled-new-array {v1, v4, v5, p1}, [Ljava/lang/Object;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v2, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    check-cast p1, Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 71
    move-result p1

    .line 72
    .line 73
    const-string v1, "PermissionRequester"

    .line 74
    .line 75
    new-instance v2, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    const-string v3, "isHarmonyBgStartPermissionAllowed, result: "

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    const/4 v3, 0x1

    .line 85
    .line 86
    if-nez p1, :cond_1

    .line 87
    move v4, v3

    .line 88
    goto :goto_0

    .line 89
    :cond_1
    move v4, v0

    .line 90
    .line 91
    .line 92
    :goto_0
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    move-result-object v2

    .line 97
    .line 98
    .line 99
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    .line 101
    if-nez p1, :cond_2

    .line 102
    return v3

    .line 103
    :cond_2
    return v0

    .line 104
    :catch_0
    move-exception p1

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 108
    return v0
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method private isVivoBgStartPermissionAllowed(Landroid/content/Context;)Z
    .locals 8

    .line 1
    const/4 v1, 0x0

    .line 2
    .line 3
    :try_start_0
    const-string v0, "content://com.vivo.permissionmanager.provider.permission/start_bg_activity"

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 7
    move-result-object v3

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    const-string v5, "pkgname = ?"

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    filled-new-array {p1}, [Ljava/lang/String;

    .line 21
    move-result-object v6

    .line 22
    const/4 v7, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    .line 25
    .line 26
    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    return v1

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 34
    move-result v0

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    const-string v0, "currentstate"

    .line 39
    .line 40
    .line 41
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 42
    move-result v0

    .line 43
    .line 44
    .line 45
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 46
    move-result v0

    .line 47
    .line 48
    .line 49
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 50
    .line 51
    const-string p1, "PermissionRequester"

    .line 52
    .line 53
    new-instance v2, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    const-string v3, "isVivoBgStartPermissionAllowed, result: "

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    const/4 v3, 0x1

    .line 63
    .line 64
    if-nez v0, :cond_1

    .line 65
    move v4, v3

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    move v4, v1

    .line 68
    .line 69
    .line 70
    :goto_0
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    move-result-object v2

    .line 75
    .line 76
    .line 77
    invoke-static {p1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 78
    .line 79
    if-nez v0, :cond_2

    .line 80
    return v3

    .line 81
    :cond_2
    return v1

    .line 82
    :catch_0
    move-exception v0

    .line 83
    move-object p1, v0

    .line 84
    goto :goto_1

    .line 85
    .line 86
    .line 87
    :cond_3
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    goto :goto_2

    .line 89
    .line 90
    .line 91
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 92
    :goto_2
    return v1
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
.end method

.method private isXiaomiBgStartPermissionAllowed(Landroid/content/Context;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    const-string v1, "appops"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    check-cast v1, Landroid/app/AppOpsManager;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    return v0

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    const-string v3, "checkOpNoThrow"

    .line 19
    .line 20
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 21
    .line 22
    const-class v5, Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    filled-new-array {v4, v4, v5}, [Ljava/lang/Class;

    .line 26
    move-result-object v4

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 30
    move-result-object v2

    .line 31
    const/4 v3, 0x1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 35
    .line 36
    const/16 v4, 0x2725

    .line 37
    .line 38
    .line 39
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    move-result-object v4

    .line 41
    .line 42
    .line 43
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 44
    move-result v5

    .line 45
    .line 46
    .line 47
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    move-result-object v5

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    .line 55
    filled-new-array {v4, v5, p1}, [Ljava/lang/Object;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    check-cast p1, Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 66
    move-result p1

    .line 67
    .line 68
    const-string v1, "PermissionRequester"

    .line 69
    .line 70
    new-instance v2, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    const-string v4, "isXiaomiBgStartPermissionAllowed, result: "

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    if-nez p1, :cond_1

    .line 81
    move v4, v3

    .line 82
    goto :goto_0

    .line 83
    :cond_1
    move v4, v0

    .line 84
    .line 85
    .line 86
    :goto_0
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    move-result-object v2

    .line 91
    .line 92
    .line 93
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    .line 95
    if-nez p1, :cond_2

    .line 96
    return v3

    .line 97
    :cond_2
    return v0

    .line 98
    :catch_0
    move-exception p1

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 102
    return v0
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
.end method

.method public static varargs newInstance([Ljava/lang/String;)Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;
    .locals 1
    .param p0    # [Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation

        .annotation build Landroidx/annotation/Size;
            min = 0x1L
        .end annotation
    .end param

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;-><init>([Ljava/lang/String;)V

    .line 6
    return-object v0
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

.method private notifyPermissionRequestResult(Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$Result;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "PERMISSION_NOTIFY_EVENT_SUB_KEY"

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mPermissionNotification:Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;

    .line 5
    .line 6
    const-string v2, "PERMISSION_NOTIFY_EVENT_KEY"

    .line 7
    .line 8
    .line 9
    invoke-static {v2, v0, v1}, Lcom/tencent/qcloud/tuicore/TUICore;->unRegisterEvent(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;)V

    .line 10
    .line 11
    sget-object v0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->sIsRequesting:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 16
    .line 17
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mPermissionCallback:Lcom/tencent/qcloud/tuicore/permission/PermissionCallback;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    return-void

    .line 21
    .line 22
    :cond_0
    sget-object v0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$Result;->Granted:Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$Result;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    move-result v0

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object p1, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mPermissionCallback:Lcom/tencent/qcloud/tuicore/permission/PermissionCallback;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/tencent/qcloud/tuicore/permission/PermissionCallback;->onGranted()V

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :cond_1
    sget-object v0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$Result;->Requesting:Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$Result;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    move-result p1

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    iget-object p1, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mPermissionCallback:Lcom/tencent/qcloud/tuicore/permission/PermissionCallback;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/tencent/qcloud/tuicore/permission/PermissionCallback;->onRequesting()V

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :cond_2
    iget-object p1, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mPermissionCallback:Lcom/tencent/qcloud/tuicore/permission/PermissionCallback;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/tencent/qcloud/tuicore/permission/PermissionCallback;->onDenied()V

    .line 54
    :goto_0
    const/4 p1, 0x0

    .line 55
    .line 56
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mPermissionCallback:Lcom/tencent/qcloud/tuicore/permission/PermissionCallback;

    .line 57
    return-void
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
.end method

.method private requestDirectPermission([Ljava/lang/String;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->sLock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->sIsRequesting:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 9
    move-result v1

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    const-string p1, "PermissionRequester"

    .line 14
    .line 15
    const-string v1, "can not request during requesting"

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    .line 20
    iget-object p1, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mPermissionCallback:Lcom/tencent/qcloud/tuicore/permission/PermissionCallback;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/tencent/qcloud/tuicore/permission/PermissionCallback;->onRequesting()V

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    monitor-exit v0

    .line 30
    return-void

    .line 31
    .line 32
    :cond_1
    sget-object v1, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->sIsRequesting:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    const/4 v2, 0x1

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 37
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    const-string v0, "PERMISSION_NOTIFY_EVENT_KEY"

    .line 40
    .line 41
    const-string v1, "PERMISSION_NOTIFY_EVENT_SUB_KEY"

    .line 42
    .line 43
    iget-object v2, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mPermissionNotification:Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1, v2}, Lcom/tencent/qcloud/tuicore/TUICore;->registerEvent(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;)V

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lcom/tencent/qcloud/tuicore/util/TUIBuild;->getVersionInt()I

    .line 50
    move-result v0

    .line 51
    .line 52
    const/16 v1, 0x17

    .line 53
    .line 54
    if-ge v0, v1, :cond_2

    .line 55
    .line 56
    const-string p1, "PermissionRequester"

    .line 57
    .line 58
    const-string v0, "current version is lower than 23"

    .line 59
    .line 60
    .line 61
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    sget-object p1, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$Result;->Granted:Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$Result;

    .line 64
    .line 65
    .line 66
    invoke-direct {p0, p1}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->notifyPermissionRequestResult(Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$Result;)V

    .line 67
    return-void

    .line 68
    .line 69
    .line 70
    :cond_2
    invoke-direct {p0, p1}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->findUnauthorizedPermissions([Ljava/lang/String;)[Ljava/lang/String;

    .line 71
    move-result-object p1

    .line 72
    array-length v0, p1

    .line 73
    .line 74
    if-gtz v0, :cond_3

    .line 75
    .line 76
    sget-object p1, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$Result;->Granted:Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$Result;

    .line 77
    .line 78
    .line 79
    invoke-direct {p0, p1}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->notifyPermissionRequestResult(Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$Result;)V

    .line 80
    return-void

    .line 81
    .line 82
    :cond_3
    new-instance v0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$RequestData;

    .line 83
    .line 84
    iget-object v1, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mTitle:Ljava/lang/String;

    .line 85
    .line 86
    iget-object v2, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mDescription:Ljava/lang/String;

    .line 87
    .line 88
    iget-object v3, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mSettingsTip:Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    invoke-direct {v0, v1, v2, v3, p1}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$RequestData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-direct {p0, v0}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->startPermissionActivity(Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$RequestData;)V

    .line 95
    return-void

    .line 96
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    throw p1
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
.end method

.method private startAppDetailsSettingsByBrand()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/qcloud/tuicore/util/TUIBuild;->isBrandVivo()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIConfig;->getAppContext()Landroid/content/Context;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, v0}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->startVivoPermissionSettings(Landroid/content/Context;)V

    .line 14
    return-void

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {}, Lcom/tencent/qcloud/tuicore/util/TUIBuild;->isBrandHuawei()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIConfig;->getAppContext()Landroid/content/Context;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v0}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->startHuaweiPermissionSettings(Landroid/content/Context;)V

    .line 28
    return-void

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-static {}, Lcom/tencent/qcloud/tuicore/util/TUIBuild;->isBrandXiaoMi()Z

    .line 32
    move-result v0

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIConfig;->getAppContext()Landroid/content/Context;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-direct {p0, v0}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->startXiaomiPermissionSettings(Landroid/content/Context;)V

    .line 42
    return-void

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIConfig;->getAppContext()Landroid/content/Context;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, v0}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->startCommonSettings(Landroid/content/Context;)V

    .line 50
    return-void
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
.end method

.method private startCommonSettings(Landroid/content/Context;)V
    .locals 3

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    .line 3
    .line 4
    const-string v1, "android.settings.action.MANAGE_OVERLAY_PERMISSION"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    const-string v2, "package:"

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 36
    .line 37
    const/high16 v1, 0x10000000

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    return-void

    .line 45
    :catch_0
    move-exception p1

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 49
    return-void
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
.end method

.method private startHuaweiPermissionSettings(Landroid/content/Context;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/qcloud/tuicore/util/TUIBuild;->isHarmonyOS()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    const-string v1, "PermissionRequester"

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "The device is not Harmony or cannot get system operator"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->startCommonSettings(Landroid/content/Context;)V

    .line 17
    return-void

    .line 18
    .line 19
    :cond_0
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 23
    .line 24
    const-string v2, "packageName"

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 28
    move-result-object v3

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 32
    .line 33
    new-instance v2, Landroid/content/ComponentName;

    .line 34
    .line 35
    const-string v3, "com.huawei.systemmanager"

    .line 36
    .line 37
    const-string v4, "com.huawei.permissionmanager.ui.MainActivity"

    .line 38
    .line 39
    .line 40
    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 44
    .line 45
    const/high16 v2, 0x10000000

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    sget v2, Lcom/tencent/qcloud/tuicore/R$string;->core_float_permission_hint_harmony:I

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Lcom/tencent/qcloud/tuicore/util/ToastUtil;->toastShortMessage(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    return-void

    .line 66
    .line 67
    :catch_0
    const-string v0, "startHuaweiPermissionSettings: open common settings"

    .line 68
    .line 69
    .line 70
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    invoke-direct {p0, p1}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->startCommonSettings(Landroid/content/Context;)V

    .line 74
    return-void
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
.end method

.method private startPermissionActivity(Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$RequestData;)V
    .locals 3
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x17
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIConfig;->getAppContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    new-instance v1, Landroid/content/Intent;

    .line 10
    .line 11
    const-class v2, Lcom/tencent/qcloud/tuicore/permission/PermissionActivity;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 15
    .line 16
    const-string v2, "PERMISSION_REQUEST_KEY"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 20
    .line 21
    const/high16 p1, 0x10000000

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 28
    return-void
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
.end method

.method private startVivoPermissionSettings(Landroid/content/Context;)V
    .locals 3

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 6
    .line 7
    const-string v1, "com.vivo.permissionmanager"

    .line 8
    .line 9
    const-string v2, "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 13
    .line 14
    const-string v1, "secure.intent.action.softPermissionDetail"

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 18
    .line 19
    const-string v1, "packagename"

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 27
    .line 28
    const/high16 v1, 0x10000000

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    sget v1, Lcom/tencent/qcloud/tuicore/R$string;->core_float_permission_hint:I

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Lcom/tencent/qcloud/tuicore/util/ToastUtil;->toastShortMessage(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    return-void

    .line 49
    .line 50
    :catch_0
    const-string v0, "PermissionRequester"

    .line 51
    .line 52
    const-string v1, "startVivoPermissionSettings: open common settings"

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    invoke-direct {p0, p1}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->startCommonSettings(Landroid/content/Context;)V

    .line 59
    return-void
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
.end method

.method private startXiaomiPermissionSettings(Landroid/content/Context;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/qcloud/tuicore/util/TUIBuild;->isMiuiOptimization()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    const-string v1, "PermissionRequester"

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "The device do not open miuiOptimization or cannot get miui property"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->startCommonSettings(Landroid/content/Context;)V

    .line 17
    return-void

    .line 18
    .line 19
    :cond_0
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    .line 20
    .line 21
    const-string v2, "miui.intent.action.APP_PERM_EDITOR"

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    const-string v2, "com.miui.securitycenter"

    .line 27
    .line 28
    const-string v3, "com.miui.permcenter.permissions.PermissionsEditorActivity"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 32
    .line 33
    const-string v2, "extra_pkgname"

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 37
    move-result-object v3

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 41
    .line 42
    const/high16 v2, 0x10000000

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    sget v2, Lcom/tencent/qcloud/tuicore/R$string;->core_float_permission_hint:I

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, Lcom/tencent/qcloud/tuicore/util/ToastUtil;->toastShortMessage(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    return-void

    .line 63
    .line 64
    :catch_0
    const-string v0, "startXiaomiPermissionSettings: open common settings"

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    invoke-direct {p0, p1}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->startCommonSettings(Landroid/content/Context;)V

    .line 71
    return-void
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
.end method


# virtual methods
.method public callback(Lcom/tencent/qcloud/tuicore/permission/PermissionCallback;)Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;
    .locals 0
    .param p1    # Lcom/tencent/qcloud/tuicore/permission/PermissionCallback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mPermissionCallback:Lcom/tencent/qcloud/tuicore/permission/PermissionCallback;

    .line 3
    return-object p0
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
    .line 23
    .line 24
.end method

.method public description(Ljava/lang/String;)Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mDescription:Ljava/lang/String;

    .line 3
    return-object p0
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
    .line 23
    .line 24
.end method

.method public has()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mIndirectPermissionList:Ljava/util/List;

    const-string v1, "PermissionStartActivityFromBackground"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 2
    invoke-direct {p0}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->hasFloatPermission()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->hasBgStartPermission()Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    :cond_0
    return v1

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mIndirectPermissionList:Ljava/util/List;

    const-string v3, "PermissionOverlayWindows"

    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4
    invoke-direct {p0}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->hasFloatPermission()Z

    move-result v0

    return v0

    .line 5
    :cond_2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mDirectPermissionList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 6
    invoke-direct {p0, v3}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->has(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    return v1

    :cond_4
    return v2
.end method

.method public request()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "request, directPermissionList: "

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mDirectPermissionList:Ljava/util/List;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, " ,indirectPermissionList:  "

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mIndirectPermissionList:Ljava/util/List;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    const-string v1, "PermissionRequester"

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mDirectPermissionList:Ljava/util/List;

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 42
    move-result v0

    .line 43
    .line 44
    if-lez v0, :cond_0

    .line 45
    .line 46
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mDirectPermissionList:Ljava/util/List;

    .line 47
    const/4 v1, 0x0

    .line 48
    .line 49
    new-array v1, v1, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    check-cast v0, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    invoke-direct {p0, v0}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->requestDirectPermission([Ljava/lang/String;)V

    .line 59
    .line 60
    :cond_0
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mIndirectPermissionList:Ljava/util/List;

    .line 61
    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 66
    move-result v0

    .line 67
    .line 68
    if-lez v0, :cond_1

    .line 69
    .line 70
    .line 71
    invoke-direct {p0}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->startAppDetailsSettingsByBrand()V

    .line 72
    :cond_1
    return-void
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
.end method

.method public settingsTip(Ljava/lang/String;)Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mSettingsTip:Ljava/lang/String;

    .line 3
    return-object p0
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
    .line 23
    .line 24
.end method

.method public title(Ljava/lang/String;)Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester;->mTitle:Ljava/lang/String;

    .line 3
    return-object p0
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
    .line 23
    .line 24
.end method
