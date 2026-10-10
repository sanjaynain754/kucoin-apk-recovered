.class public Landroidx/camera/video/Quality;
.super Ljava/lang/Object;
.source "Quality.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/video/Quality$ConstantQuality;,
        Landroidx/camera/video/Quality$QualitySource;
    }
.end annotation


# static fields
.field public static final FHD:Landroidx/camera/video/Quality;

.field public static final HD:Landroidx/camera/video/Quality;

.field public static final HIGHEST:Landroidx/camera/video/Quality;

.field public static final LOWEST:Landroidx/camera/video/Quality;

.field static final NONE:Landroidx/camera/video/Quality;

.field private static final QUALITIES:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/camera/video/Quality;",
            ">;"
        }
    .end annotation
.end field

.field private static final QUALITIES_ORDER_BY_SIZE:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/video/Quality;",
            ">;"
        }
    .end annotation
.end field

.field public static final QUALITY_SOURCE_HIGH_SPEED:I = 0x2
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation
.end field

.field public static final QUALITY_SOURCE_REGULAR:I = 0x1
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation
.end field

.field public static final SD:Landroidx/camera/video/Quality;

.field public static final UHD:Landroidx/camera/video/Quality;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    .line 2
    new-instance v0, Landroid/util/Size;

    .line 3
    .line 4
    const/16 v1, 0x2d0

    .line 5
    .line 6
    const/16 v2, 0x1e0

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    .line 10
    .line 11
    new-instance v3, Landroid/util/Size;

    .line 12
    .line 13
    const/16 v4, 0x280

    .line 14
    .line 15
    .line 16
    invoke-direct {v3, v4, v2}, Landroid/util/Size;-><init>(II)V

    .line 17
    .line 18
    .line 19
    filled-new-array {v0, v3}, [Landroid/util/Size;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 28
    move-result-object v0

    .line 29
    const/4 v2, 0x4

    .line 30
    .line 31
    const/16 v3, 0x7d2

    .line 32
    .line 33
    const-string v4, "SD"

    .line 34
    .line 35
    .line 36
    invoke-static {v2, v3, v4, v0}, Landroidx/camera/video/Quality$ConstantQuality;->of(IILjava/lang/String;Ljava/util/List;)Landroidx/camera/video/Quality$ConstantQuality;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    sput-object v0, Landroidx/camera/video/Quality;->SD:Landroidx/camera/video/Quality;

    .line 40
    .line 41
    new-instance v3, Landroid/util/Size;

    .line 42
    .line 43
    const/16 v4, 0x500

    .line 44
    .line 45
    .line 46
    invoke-direct {v3, v4, v1}, Landroid/util/Size;-><init>(II)V

    .line 47
    .line 48
    .line 49
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 50
    move-result-object v1

    .line 51
    const/4 v3, 0x5

    .line 52
    .line 53
    const/16 v4, 0x7d3

    .line 54
    .line 55
    const-string v5, "HD"

    .line 56
    .line 57
    .line 58
    invoke-static {v3, v4, v5, v1}, Landroidx/camera/video/Quality$ConstantQuality;->of(IILjava/lang/String;Ljava/util/List;)Landroidx/camera/video/Quality$ConstantQuality;

    .line 59
    move-result-object v1

    .line 60
    .line 61
    sput-object v1, Landroidx/camera/video/Quality;->HD:Landroidx/camera/video/Quality;

    .line 62
    .line 63
    new-instance v4, Landroid/util/Size;

    .line 64
    .line 65
    const/16 v5, 0x780

    .line 66
    .line 67
    const/16 v6, 0x438

    .line 68
    .line 69
    .line 70
    invoke-direct {v4, v5, v6}, Landroid/util/Size;-><init>(II)V

    .line 71
    .line 72
    .line 73
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 74
    move-result-object v4

    .line 75
    const/4 v5, 0x6

    .line 76
    .line 77
    const/16 v6, 0x7d4

    .line 78
    .line 79
    const-string v7, "FHD"

    .line 80
    .line 81
    .line 82
    invoke-static {v5, v6, v7, v4}, Landroidx/camera/video/Quality$ConstantQuality;->of(IILjava/lang/String;Ljava/util/List;)Landroidx/camera/video/Quality$ConstantQuality;

    .line 83
    move-result-object v4

    .line 84
    .line 85
    sput-object v4, Landroidx/camera/video/Quality;->FHD:Landroidx/camera/video/Quality;

    .line 86
    .line 87
    new-instance v6, Landroid/util/Size;

    .line 88
    .line 89
    const/16 v7, 0xf00

    .line 90
    .line 91
    const/16 v8, 0x870

    .line 92
    .line 93
    .line 94
    invoke-direct {v6, v7, v8}, Landroid/util/Size;-><init>(II)V

    .line 95
    .line 96
    .line 97
    invoke-static {v6}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 98
    move-result-object v6

    .line 99
    .line 100
    const/16 v7, 0x8

    .line 101
    .line 102
    const/16 v8, 0x7d5

    .line 103
    .line 104
    const-string v9, "UHD"

    .line 105
    .line 106
    .line 107
    invoke-static {v7, v8, v9, v6}, Landroidx/camera/video/Quality$ConstantQuality;->of(IILjava/lang/String;Ljava/util/List;)Landroidx/camera/video/Quality$ConstantQuality;

    .line 108
    move-result-object v6

    .line 109
    .line 110
    sput-object v6, Landroidx/camera/video/Quality;->UHD:Landroidx/camera/video/Quality;

    .line 111
    .line 112
    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 113
    const/4 v8, 0x0

    .line 114
    .line 115
    const/16 v9, 0x7d0

    .line 116
    .line 117
    const-string v10, "LOWEST"

    .line 118
    .line 119
    .line 120
    invoke-static {v8, v9, v10, v7}, Landroidx/camera/video/Quality$ConstantQuality;->of(IILjava/lang/String;Ljava/util/List;)Landroidx/camera/video/Quality$ConstantQuality;

    .line 121
    move-result-object v9

    .line 122
    .line 123
    sput-object v9, Landroidx/camera/video/Quality;->LOWEST:Landroidx/camera/video/Quality;

    .line 124
    .line 125
    const/16 v10, 0x7d1

    .line 126
    .line 127
    const-string v11, "HIGHEST"

    .line 128
    const/4 v12, 0x1

    .line 129
    .line 130
    .line 131
    invoke-static {v12, v10, v11, v7}, Landroidx/camera/video/Quality$ConstantQuality;->of(IILjava/lang/String;Ljava/util/List;)Landroidx/camera/video/Quality$ConstantQuality;

    .line 132
    move-result-object v10

    .line 133
    .line 134
    sput-object v10, Landroidx/camera/video/Quality;->HIGHEST:Landroidx/camera/video/Quality;

    .line 135
    const/4 v11, -0x1

    .line 136
    .line 137
    const-string v13, "NONE"

    .line 138
    .line 139
    .line 140
    invoke-static {v11, v11, v13, v7}, Landroidx/camera/video/Quality$ConstantQuality;->of(IILjava/lang/String;Ljava/util/List;)Landroidx/camera/video/Quality$ConstantQuality;

    .line 141
    move-result-object v7

    .line 142
    .line 143
    sput-object v7, Landroidx/camera/video/Quality;->NONE:Landroidx/camera/video/Quality;

    .line 144
    .line 145
    new-instance v7, Ljava/util/HashSet;

    .line 146
    .line 147
    new-array v5, v5, [Landroidx/camera/video/Quality;

    .line 148
    .line 149
    aput-object v9, v5, v8

    .line 150
    .line 151
    aput-object v10, v5, v12

    .line 152
    const/4 v9, 0x2

    .line 153
    .line 154
    aput-object v0, v5, v9

    .line 155
    const/4 v10, 0x3

    .line 156
    .line 157
    aput-object v1, v5, v10

    .line 158
    .line 159
    aput-object v4, v5, v2

    .line 160
    .line 161
    aput-object v6, v5, v3

    .line 162
    .line 163
    .line 164
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 165
    move-result-object v3

    .line 166
    .line 167
    .line 168
    invoke-direct {v7, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 169
    .line 170
    sput-object v7, Landroidx/camera/video/Quality;->QUALITIES:Ljava/util/Set;

    .line 171
    .line 172
    new-array v2, v2, [Landroidx/camera/video/Quality;

    .line 173
    .line 174
    aput-object v6, v2, v8

    .line 175
    .line 176
    aput-object v4, v2, v12

    .line 177
    .line 178
    aput-object v1, v2, v9

    .line 179
    .line 180
    aput-object v0, v2, v10

    .line 181
    .line 182
    .line 183
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 184
    move-result-object v0

    .line 185
    .line 186
    sput-object v0, Landroidx/camera/video/Quality;->QUALITIES_ORDER_BY_SIZE:Ljava/util/List;

    .line 187
    return-void
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
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/camera/video/Quality$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/camera/video/Quality;-><init>()V

    return-void
.end method

.method public static containsQuality(Landroidx/camera/video/Quality;)Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Landroidx/camera/video/Quality;->QUALITIES:Ljava/util/Set;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    move-result p0

    .line 7
    return p0
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

.method public static getSortedQualities()Ljava/util/List;
    .locals 2
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/video/Quality;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    sget-object v1, Landroidx/camera/video/Quality;->QUALITIES_ORDER_BY_SIZE:Ljava/util/List;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

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
    .line 18
    .line 19
    .line 20
.end method
