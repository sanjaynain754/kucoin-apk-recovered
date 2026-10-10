.class public final enum Lcom/appsflyer/MediationNetwork;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/MediationNetwork;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0015\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017"
    }
    d2 = {
        "Lcom/appsflyer/MediationNetwork;",
        "",
        "",
        "p0",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "value",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "IRONSOURCE",
        "APPLOVIN_MAX",
        "GOOGLE_ADMOB",
        "FYBER",
        "APPODEAL",
        "ADMOST",
        "TOPON",
        "TRADPLUS",
        "YANDEX",
        "CHARTBOOST",
        "UNITY",
        "TOPON_PTE",
        "CUSTOM_MEDIATION",
        "DIRECT_MONETIZATION_NETWORK"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum ADMOST:Lcom/appsflyer/MediationNetwork;

.field public static final enum APPLOVIN_MAX:Lcom/appsflyer/MediationNetwork;

.field public static final enum APPODEAL:Lcom/appsflyer/MediationNetwork;

.field public static final enum CHARTBOOST:Lcom/appsflyer/MediationNetwork;

.field public static final enum CUSTOM_MEDIATION:Lcom/appsflyer/MediationNetwork;

.field public static final enum DIRECT_MONETIZATION_NETWORK:Lcom/appsflyer/MediationNetwork;

.field public static final enum FYBER:Lcom/appsflyer/MediationNetwork;

.field public static final enum GOOGLE_ADMOB:Lcom/appsflyer/MediationNetwork;

.field public static final enum IRONSOURCE:Lcom/appsflyer/MediationNetwork;

.field public static final enum TOPON:Lcom/appsflyer/MediationNetwork;

.field public static final enum TOPON_PTE:Lcom/appsflyer/MediationNetwork;

.field public static final enum TRADPLUS:Lcom/appsflyer/MediationNetwork;

.field public static final enum UNITY:Lcom/appsflyer/MediationNetwork;

.field public static final enum YANDEX:Lcom/appsflyer/MediationNetwork;

.field private static final synthetic getMediationNetwork:[Lcom/appsflyer/MediationNetwork;


# instance fields
.field private final value:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    .line 2
    new-instance v0, Lcom/appsflyer/MediationNetwork;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-string v2, "ironsource"

    .line 6
    .line 7
    const-string v3, "IRONSOURCE"

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v3, v1, v2}, Lcom/appsflyer/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 11
    .line 12
    sput-object v0, Lcom/appsflyer/MediationNetwork;->IRONSOURCE:Lcom/appsflyer/MediationNetwork;

    .line 13
    .line 14
    new-instance v1, Lcom/appsflyer/MediationNetwork;

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    const-string v3, "applovinmax"

    .line 18
    .line 19
    const-string v4, "APPLOVIN_MAX"

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, v4, v2, v3}, Lcom/appsflyer/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 23
    .line 24
    sput-object v1, Lcom/appsflyer/MediationNetwork;->APPLOVIN_MAX:Lcom/appsflyer/MediationNetwork;

    .line 25
    .line 26
    new-instance v2, Lcom/appsflyer/MediationNetwork;

    .line 27
    const/4 v3, 0x2

    .line 28
    .line 29
    const-string v4, "googleadmob"

    .line 30
    .line 31
    const-string v5, "GOOGLE_ADMOB"

    .line 32
    .line 33
    .line 34
    invoke-direct {v2, v5, v3, v4}, Lcom/appsflyer/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 35
    .line 36
    sput-object v2, Lcom/appsflyer/MediationNetwork;->GOOGLE_ADMOB:Lcom/appsflyer/MediationNetwork;

    .line 37
    .line 38
    new-instance v3, Lcom/appsflyer/MediationNetwork;

    .line 39
    const/4 v4, 0x3

    .line 40
    .line 41
    const-string v5, "fyber"

    .line 42
    .line 43
    const-string v6, "FYBER"

    .line 44
    .line 45
    .line 46
    invoke-direct {v3, v6, v4, v5}, Lcom/appsflyer/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 47
    .line 48
    sput-object v3, Lcom/appsflyer/MediationNetwork;->FYBER:Lcom/appsflyer/MediationNetwork;

    .line 49
    .line 50
    new-instance v4, Lcom/appsflyer/MediationNetwork;

    .line 51
    const/4 v5, 0x4

    .line 52
    .line 53
    const-string v6, "appodeal"

    .line 54
    .line 55
    const-string v7, "APPODEAL"

    .line 56
    .line 57
    .line 58
    invoke-direct {v4, v7, v5, v6}, Lcom/appsflyer/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 59
    .line 60
    sput-object v4, Lcom/appsflyer/MediationNetwork;->APPODEAL:Lcom/appsflyer/MediationNetwork;

    .line 61
    .line 62
    new-instance v5, Lcom/appsflyer/MediationNetwork;

    .line 63
    const/4 v6, 0x5

    .line 64
    .line 65
    const-string v7, "Admost"

    .line 66
    .line 67
    const-string v8, "ADMOST"

    .line 68
    .line 69
    .line 70
    invoke-direct {v5, v8, v6, v7}, Lcom/appsflyer/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 71
    .line 72
    sput-object v5, Lcom/appsflyer/MediationNetwork;->ADMOST:Lcom/appsflyer/MediationNetwork;

    .line 73
    .line 74
    new-instance v6, Lcom/appsflyer/MediationNetwork;

    .line 75
    const/4 v7, 0x6

    .line 76
    .line 77
    const-string v8, "Topon"

    .line 78
    .line 79
    const-string v9, "TOPON"

    .line 80
    .line 81
    .line 82
    invoke-direct {v6, v9, v7, v8}, Lcom/appsflyer/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 83
    .line 84
    sput-object v6, Lcom/appsflyer/MediationNetwork;->TOPON:Lcom/appsflyer/MediationNetwork;

    .line 85
    .line 86
    new-instance v7, Lcom/appsflyer/MediationNetwork;

    .line 87
    const/4 v8, 0x7

    .line 88
    .line 89
    const-string v9, "Tradplus"

    .line 90
    .line 91
    const-string v10, "TRADPLUS"

    .line 92
    .line 93
    .line 94
    invoke-direct {v7, v10, v8, v9}, Lcom/appsflyer/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 95
    .line 96
    sput-object v7, Lcom/appsflyer/MediationNetwork;->TRADPLUS:Lcom/appsflyer/MediationNetwork;

    .line 97
    .line 98
    new-instance v8, Lcom/appsflyer/MediationNetwork;

    .line 99
    .line 100
    const/16 v9, 0x8

    .line 101
    .line 102
    const-string v10, "Yandex"

    .line 103
    .line 104
    const-string v11, "YANDEX"

    .line 105
    .line 106
    .line 107
    invoke-direct {v8, v11, v9, v10}, Lcom/appsflyer/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 108
    .line 109
    sput-object v8, Lcom/appsflyer/MediationNetwork;->YANDEX:Lcom/appsflyer/MediationNetwork;

    .line 110
    .line 111
    new-instance v9, Lcom/appsflyer/MediationNetwork;

    .line 112
    .line 113
    const/16 v10, 0x9

    .line 114
    .line 115
    const-string v11, "chartboost"

    .line 116
    .line 117
    const-string v12, "CHARTBOOST"

    .line 118
    .line 119
    .line 120
    invoke-direct {v9, v12, v10, v11}, Lcom/appsflyer/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 121
    .line 122
    sput-object v9, Lcom/appsflyer/MediationNetwork;->CHARTBOOST:Lcom/appsflyer/MediationNetwork;

    .line 123
    .line 124
    new-instance v10, Lcom/appsflyer/MediationNetwork;

    .line 125
    .line 126
    const/16 v11, 0xa

    .line 127
    .line 128
    const-string v12, "Unity"

    .line 129
    .line 130
    const-string v13, "UNITY"

    .line 131
    .line 132
    .line 133
    invoke-direct {v10, v13, v11, v12}, Lcom/appsflyer/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 134
    .line 135
    sput-object v10, Lcom/appsflyer/MediationNetwork;->UNITY:Lcom/appsflyer/MediationNetwork;

    .line 136
    .line 137
    new-instance v11, Lcom/appsflyer/MediationNetwork;

    .line 138
    .line 139
    const/16 v12, 0xb

    .line 140
    .line 141
    .line 142
    const-string/jumbo v13, "toponpte"

    .line 143
    .line 144
    const-string v14, "TOPON_PTE"

    .line 145
    .line 146
    .line 147
    invoke-direct {v11, v14, v12, v13}, Lcom/appsflyer/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 148
    .line 149
    sput-object v11, Lcom/appsflyer/MediationNetwork;->TOPON_PTE:Lcom/appsflyer/MediationNetwork;

    .line 150
    .line 151
    new-instance v12, Lcom/appsflyer/MediationNetwork;

    .line 152
    .line 153
    const/16 v13, 0xc

    .line 154
    .line 155
    const-string v14, "customMediation"

    .line 156
    .line 157
    const-string v15, "CUSTOM_MEDIATION"

    .line 158
    .line 159
    .line 160
    invoke-direct {v12, v15, v13, v14}, Lcom/appsflyer/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 161
    .line 162
    sput-object v12, Lcom/appsflyer/MediationNetwork;->CUSTOM_MEDIATION:Lcom/appsflyer/MediationNetwork;

    .line 163
    .line 164
    new-instance v13, Lcom/appsflyer/MediationNetwork;

    .line 165
    .line 166
    const/16 v14, 0xd

    .line 167
    .line 168
    const-string v15, "directMonetizationNetwork"

    .line 169
    .line 170
    move-object/from16 v16, v0

    .line 171
    .line 172
    const-string v0, "DIRECT_MONETIZATION_NETWORK"

    .line 173
    .line 174
    .line 175
    invoke-direct {v13, v0, v14, v15}, Lcom/appsflyer/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 176
    .line 177
    sput-object v13, Lcom/appsflyer/MediationNetwork;->DIRECT_MONETIZATION_NETWORK:Lcom/appsflyer/MediationNetwork;

    .line 178
    .line 179
    move-object/from16 v0, v16

    .line 180
    .line 181
    .line 182
    filled-new-array/range {v0 .. v13}, [Lcom/appsflyer/MediationNetwork;

    .line 183
    move-result-object v0

    .line 184
    .line 185
    sput-object v0, Lcom/appsflyer/MediationNetwork;->getMediationNetwork:[Lcom/appsflyer/MediationNetwork;

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

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput-object p3, p0, Lcom/appsflyer/MediationNetwork;->value:Ljava/lang/String;

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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/MediationNetwork;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/appsflyer/MediationNetwork;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/appsflyer/MediationNetwork;

    .line 9
    return-object p0
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

.method public static values()[Lcom/appsflyer/MediationNetwork;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/appsflyer/MediationNetwork;->getMediationNetwork:[Lcom/appsflyer/MediationNetwork;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/appsflyer/MediationNetwork;

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
    .line 18
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "getValue"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/appsflyer/MediationNetwork;->value:Ljava/lang/String;

    .line 3
    return-object v0
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
.end method
