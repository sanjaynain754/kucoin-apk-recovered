.class final enum Lcom/horcrux/svg/TextProperties$AlignmentBaseline;
.super Ljava/lang/Enum;
.source "TextProperties.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/horcrux/svg/TextProperties$AlignmentBaseline;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum afterEdge:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

.field public static final enum alphabetic:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

.field public static final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/horcrux/svg/TextProperties$AlignmentBaseline;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum baseline:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

.field public static final enum beforeEdge:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

.field public static final enum bottom:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

.field public static final synthetic c:[Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

.field public static final enum center:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

.field public static final enum central:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

.field public static final enum hanging:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

.field public static final enum ideographic:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

.field public static final enum mathematical:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

.field public static final enum middle:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

.field public static final enum textAfterEdge:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

.field public static final enum textBeforeEdge:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

.field public static final enum textBottom:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

.field public static final enum textTop:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

.field public static final enum top:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;


# instance fields
.field private final alignment:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 3
    .line 4
    const-string v1, "baseline"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v1}, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    sput-object v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->baseline:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 11
    .line 12
    new-instance v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 13
    const/4 v1, 0x1

    .line 14
    .line 15
    const-string v3, "text-bottom"

    .line 16
    .line 17
    const-string v4, "textBottom"

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v4, v1, v3}, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    sput-object v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->textBottom:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 23
    .line 24
    new-instance v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 25
    .line 26
    const-string v1, "alphabetic"

    .line 27
    const/4 v3, 0x2

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v1, v3, v1}, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 31
    .line 32
    sput-object v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->alphabetic:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 33
    .line 34
    new-instance v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 35
    .line 36
    const-string v1, "ideographic"

    .line 37
    const/4 v3, 0x3

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v1, v3, v1}, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 41
    .line 42
    sput-object v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->ideographic:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 43
    .line 44
    new-instance v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 45
    .line 46
    const-string v1, "middle"

    .line 47
    const/4 v3, 0x4

    .line 48
    .line 49
    .line 50
    invoke-direct {v0, v1, v3, v1}, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 51
    .line 52
    sput-object v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->middle:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 53
    .line 54
    new-instance v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 55
    .line 56
    const-string v1, "central"

    .line 57
    const/4 v3, 0x5

    .line 58
    .line 59
    .line 60
    invoke-direct {v0, v1, v3, v1}, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 61
    .line 62
    sput-object v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->central:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 63
    .line 64
    new-instance v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 65
    .line 66
    const-string v1, "mathematical"

    .line 67
    const/4 v3, 0x6

    .line 68
    .line 69
    .line 70
    invoke-direct {v0, v1, v3, v1}, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 71
    .line 72
    sput-object v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->mathematical:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 73
    .line 74
    new-instance v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 75
    const/4 v1, 0x7

    .line 76
    .line 77
    const-string v3, "text-top"

    .line 78
    .line 79
    const-string v4, "textTop"

    .line 80
    .line 81
    .line 82
    invoke-direct {v0, v4, v1, v3}, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 83
    .line 84
    sput-object v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->textTop:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 85
    .line 86
    new-instance v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 87
    .line 88
    const-string v1, "bottom"

    .line 89
    .line 90
    const/16 v3, 0x8

    .line 91
    .line 92
    .line 93
    invoke-direct {v0, v1, v3, v1}, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 94
    .line 95
    sput-object v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->bottom:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 96
    .line 97
    new-instance v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 98
    .line 99
    const-string v1, "center"

    .line 100
    .line 101
    const/16 v3, 0x9

    .line 102
    .line 103
    .line 104
    invoke-direct {v0, v1, v3, v1}, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 105
    .line 106
    sput-object v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->center:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 107
    .line 108
    new-instance v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 109
    .line 110
    const-string v1, "top"

    .line 111
    .line 112
    const/16 v3, 0xa

    .line 113
    .line 114
    .line 115
    invoke-direct {v0, v1, v3, v1}, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 116
    .line 117
    sput-object v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->top:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 118
    .line 119
    new-instance v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 120
    .line 121
    const/16 v1, 0xb

    .line 122
    .line 123
    const-string v3, "text-before-edge"

    .line 124
    .line 125
    const-string v4, "textBeforeEdge"

    .line 126
    .line 127
    .line 128
    invoke-direct {v0, v4, v1, v3}, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 129
    .line 130
    sput-object v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->textBeforeEdge:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 131
    .line 132
    new-instance v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 133
    .line 134
    const/16 v1, 0xc

    .line 135
    .line 136
    const-string v3, "text-after-edge"

    .line 137
    .line 138
    const-string v4, "textAfterEdge"

    .line 139
    .line 140
    .line 141
    invoke-direct {v0, v4, v1, v3}, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 142
    .line 143
    sput-object v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->textAfterEdge:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 144
    .line 145
    new-instance v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 146
    .line 147
    const/16 v1, 0xd

    .line 148
    .line 149
    const-string v3, "before-edge"

    .line 150
    .line 151
    const-string v4, "beforeEdge"

    .line 152
    .line 153
    .line 154
    invoke-direct {v0, v4, v1, v3}, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 155
    .line 156
    sput-object v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->beforeEdge:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 157
    .line 158
    new-instance v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 159
    .line 160
    const/16 v1, 0xe

    .line 161
    .line 162
    const-string v3, "after-edge"

    .line 163
    .line 164
    const-string v4, "afterEdge"

    .line 165
    .line 166
    .line 167
    invoke-direct {v0, v4, v1, v3}, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 168
    .line 169
    sput-object v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->afterEdge:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 170
    .line 171
    new-instance v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 172
    .line 173
    const-string v1, "hanging"

    .line 174
    .line 175
    const/16 v3, 0xf

    .line 176
    .line 177
    .line 178
    invoke-direct {v0, v1, v3, v1}, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 179
    .line 180
    sput-object v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->hanging:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 181
    .line 182
    .line 183
    invoke-static {}, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->a()[Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 184
    move-result-object v0

    .line 185
    .line 186
    sput-object v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->c:[Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 187
    .line 188
    new-instance v0, Ljava/util/HashMap;

    .line 189
    .line 190
    .line 191
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 192
    .line 193
    sput-object v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->b:Ljava/util/Map;

    .line 194
    .line 195
    .line 196
    invoke-static {}, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->values()[Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 197
    move-result-object v0

    .line 198
    array-length v1, v0

    .line 199
    .line 200
    :goto_0
    if-ge v2, v1, :cond_0

    .line 201
    .line 202
    aget-object v3, v0, v2

    .line 203
    .line 204
    sget-object v4, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->b:Ljava/util/Map;

    .line 205
    .line 206
    iget-object v5, v3, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->alignment:Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    add-int/lit8 v2, v2, 0x1

    .line 212
    goto :goto_0

    .line 213
    :cond_0
    return-void
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

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
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
    iput-object p3, p0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->alignment:Ljava/lang/String;

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

.method public static synthetic a()[Lcom/horcrux/svg/TextProperties$AlignmentBaseline;
    .locals 17

    .line 1
    .line 2
    sget-object v1, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->baseline:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 3
    .line 4
    sget-object v2, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->textBottom:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 5
    .line 6
    sget-object v3, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->alphabetic:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 7
    .line 8
    sget-object v4, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->ideographic:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 9
    .line 10
    sget-object v5, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->middle:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 11
    .line 12
    sget-object v6, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->central:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 13
    .line 14
    sget-object v7, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->mathematical:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 15
    .line 16
    sget-object v8, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->textTop:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 17
    .line 18
    sget-object v9, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->bottom:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 19
    .line 20
    sget-object v10, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->center:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 21
    .line 22
    sget-object v11, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->top:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 23
    .line 24
    sget-object v12, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->textBeforeEdge:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 25
    .line 26
    sget-object v13, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->textAfterEdge:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 27
    .line 28
    sget-object v14, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->beforeEdge:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 29
    .line 30
    sget-object v15, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->afterEdge:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 31
    .line 32
    sget-object v16, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->hanging:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 33
    .line 34
    .line 35
    filled-new-array/range {v1 .. v16}, [Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 36
    move-result-object v0

    .line 37
    return-object v0
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
.end method

.method public static getEnum(Ljava/lang/String;)Lcom/horcrux/svg/TextProperties$AlignmentBaseline;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->b:Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 6
    move-result v1

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    check-cast p0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 15
    return-object p0

    .line 16
    .line 17
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    const-string v2, "Unknown String Value: "

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    move-result-object p0

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    throw v0
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

.method public static valueOf(Ljava/lang/String;)Lcom/horcrux/svg/TextProperties$AlignmentBaseline;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

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
    .line 24
.end method

.method public static values()[Lcom/horcrux/svg/TextProperties$AlignmentBaseline;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->c:[Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->alignment:Ljava/lang/String;

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
.end method
