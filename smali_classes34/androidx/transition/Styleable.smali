.class Landroidx/transition/Styleable;
.super Ljava/lang/Object;
.source "Styleable.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "InlinedApi"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/Styleable$PatternPathMotion;,
        Landroidx/transition/Styleable$ArcMotion;,
        Landroidx/transition/Styleable$TransitionSet;,
        Landroidx/transition/Styleable$Slide;,
        Landroidx/transition/Styleable$ChangeTransform;,
        Landroidx/transition/Styleable$Fade;,
        Landroidx/transition/Styleable$VisibilityTransition;,
        Landroidx/transition/Styleable$ChangeBounds;,
        Landroidx/transition/Styleable$Transition;,
        Landroidx/transition/Styleable$TransitionManager;,
        Landroidx/transition/Styleable$TransitionTarget;
    }
.end annotation


# static fields
.field static final ARC_MOTION:[I
    .annotation build Landroidx/annotation/StyleableRes;
    .end annotation
.end field

.field static final CHANGE_BOUNDS:[I
    .annotation build Landroidx/annotation/StyleableRes;
    .end annotation
.end field

.field static final CHANGE_TRANSFORM:[I
    .annotation build Landroidx/annotation/StyleableRes;
    .end annotation
.end field

.field static final FADE:[I
    .annotation build Landroidx/annotation/StyleableRes;
    .end annotation
.end field

.field static final PATTERN_PATH_MOTION:[I
    .annotation build Landroidx/annotation/StyleableRes;
    .end annotation
.end field

.field static final SLIDE:[I
    .annotation build Landroidx/annotation/StyleableRes;
    .end annotation
.end field

.field static final TRANSITION:[I
    .annotation build Landroidx/annotation/StyleableRes;
    .end annotation
.end field

.field static final TRANSITION_MANAGER:[I
    .annotation build Landroidx/annotation/StyleableRes;
    .end annotation
.end field

.field static final TRANSITION_SET:[I
    .annotation build Landroidx/annotation/StyleableRes;
    .end annotation
.end field

.field static final TRANSITION_TARGET:[I
    .annotation build Landroidx/annotation/StyleableRes;
    .end annotation
.end field

.field static final VISIBILITY_TRANSITION:[I
    .annotation build Landroidx/annotation/StyleableRes;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x6

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    .line 6
    fill-array-data v0, :array_0

    .line 7
    .line 8
    sput-object v0, Landroidx/transition/Styleable;->TRANSITION_TARGET:[I

    .line 9
    .line 10
    .line 11
    const v0, 0x10103de

    .line 12
    .line 13
    .line 14
    const v1, 0x10103df

    .line 15
    .line 16
    .line 17
    const v2, 0x10103dd

    .line 18
    .line 19
    .line 20
    filled-new-array {v2, v0, v1}, [I

    .line 21
    move-result-object v0

    .line 22
    .line 23
    sput-object v0, Landroidx/transition/Styleable;->TRANSITION_MANAGER:[I

    .line 24
    .line 25
    .line 26
    const v0, 0x10103e2

    .line 27
    .line 28
    .line 29
    const v1, 0x101044f

    .line 30
    .line 31
    .line 32
    const v2, 0x1010141

    .line 33
    .line 34
    .line 35
    const v3, 0x1010198

    .line 36
    .line 37
    .line 38
    filled-new-array {v2, v3, v0, v1}, [I

    .line 39
    move-result-object v0

    .line 40
    .line 41
    sput-object v0, Landroidx/transition/Styleable;->TRANSITION:[I

    .line 42
    .line 43
    .line 44
    const v0, 0x10104cf

    .line 45
    .line 46
    .line 47
    filled-new-array {v0}, [I

    .line 48
    move-result-object v0

    .line 49
    .line 50
    sput-object v0, Landroidx/transition/Styleable;->CHANGE_BOUNDS:[I

    .line 51
    .line 52
    .line 53
    const v0, 0x101047c

    .line 54
    .line 55
    .line 56
    filled-new-array {v0}, [I

    .line 57
    move-result-object v0

    .line 58
    .line 59
    sput-object v0, Landroidx/transition/Styleable;->VISIBILITY_TRANSITION:[I

    .line 60
    .line 61
    .line 62
    const v0, 0x10103e1

    .line 63
    .line 64
    .line 65
    filled-new-array {v0}, [I

    .line 66
    move-result-object v0

    .line 67
    .line 68
    sput-object v0, Landroidx/transition/Styleable;->FADE:[I

    .line 69
    .line 70
    .line 71
    const v0, 0x10104bc

    .line 72
    .line 73
    .line 74
    const v1, 0x10104bd

    .line 75
    .line 76
    .line 77
    filled-new-array {v0, v1}, [I

    .line 78
    move-result-object v0

    .line 79
    .line 80
    sput-object v0, Landroidx/transition/Styleable;->CHANGE_TRANSFORM:[I

    .line 81
    .line 82
    .line 83
    const v0, 0x1010430

    .line 84
    .line 85
    .line 86
    filled-new-array {v0}, [I

    .line 87
    move-result-object v0

    .line 88
    .line 89
    sput-object v0, Landroidx/transition/Styleable;->SLIDE:[I

    .line 90
    .line 91
    .line 92
    const v0, 0x10103e0

    .line 93
    .line 94
    .line 95
    filled-new-array {v0}, [I

    .line 96
    move-result-object v0

    .line 97
    .line 98
    sput-object v0, Landroidx/transition/Styleable;->TRANSITION_SET:[I

    .line 99
    .line 100
    .line 101
    const v0, 0x101047e

    .line 102
    .line 103
    .line 104
    const v1, 0x101047f

    .line 105
    .line 106
    .line 107
    const v2, 0x101047d

    .line 108
    .line 109
    .line 110
    filled-new-array {v2, v0, v1}, [I

    .line 111
    move-result-object v0

    .line 112
    .line 113
    sput-object v0, Landroidx/transition/Styleable;->ARC_MOTION:[I

    .line 114
    .line 115
    .line 116
    const v0, 0x10104ca

    .line 117
    .line 118
    .line 119
    filled-new-array {v0}, [I

    .line 120
    move-result-object v0

    .line 121
    .line 122
    sput-object v0, Landroidx/transition/Styleable;->PATTERN_PATH_MOTION:[I

    .line 123
    return-void

    .line 124
    nop

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
    :array_0
    .array-data 4
        0x101002f
        0x10103dc
        0x1010441
        0x1010442
        0x101044d
        0x101044e
    .end array-data
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
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
