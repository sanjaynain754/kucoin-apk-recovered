.class public synthetic Laai/liveness/activity/LivenessActivity$f;
.super Ljava/lang/Object;
.source "LivenessActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laai/liveness/activity/LivenessActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1009
    name = null
.end annotation


# static fields
.field public static final synthetic a:[I

.field public static final synthetic b:[I

.field public static final synthetic c:[I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-static {}, Laai/liveness/Detector$DetectionFailedType;->values()[Laai/liveness/Detector$DetectionFailedType;

    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    sput-object v0, Laai/liveness/activity/LivenessActivity$f;->c:[I

    .line 10
    const/4 v1, 0x1

    .line 11
    .line 12
    :try_start_0
    sget-object v2, Laai/liveness/Detector$DetectionFailedType;->FACEMISSING:Laai/liveness/Detector$DetectionFailedType;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 16
    move-result v2

    .line 17
    .line 18
    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    :catch_0
    const/4 v0, 0x2

    .line 20
    .line 21
    :try_start_1
    sget-object v2, Laai/liveness/activity/LivenessActivity$f;->c:[I

    .line 22
    .line 23
    sget-object v3, Laai/liveness/Detector$DetectionFailedType;->TIMEOUT:Laai/liveness/Detector$DetectionFailedType;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 27
    move-result v3

    .line 28
    .line 29
    aput v0, v2, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    .line 30
    :catch_1
    const/4 v2, 0x3

    .line 31
    .line 32
    :try_start_2
    sget-object v3, Laai/liveness/activity/LivenessActivity$f;->c:[I

    .line 33
    .line 34
    sget-object v4, Laai/liveness/Detector$DetectionFailedType;->MULTIPLEFACE:Laai/liveness/Detector$DetectionFailedType;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 38
    move-result v4

    .line 39
    .line 40
    aput v2, v3, v4
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    .line 41
    :catch_2
    const/4 v3, 0x4

    .line 42
    .line 43
    :try_start_3
    sget-object v4, Laai/liveness/activity/LivenessActivity$f;->c:[I

    .line 44
    .line 45
    sget-object v5, Laai/liveness/Detector$DetectionFailedType;->MUCHMOTION:Laai/liveness/Detector$DetectionFailedType;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 49
    move-result v5

    .line 50
    .line 51
    aput v3, v4, v5
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    .line 52
    :catch_3
    const/4 v4, 0x5

    .line 53
    .line 54
    :try_start_4
    sget-object v5, Laai/liveness/activity/LivenessActivity$f;->c:[I

    .line 55
    .line 56
    sget-object v6, Laai/liveness/Detector$DetectionFailedType;->WEAKLIGHT:Laai/liveness/Detector$DetectionFailedType;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 60
    move-result v6

    .line 61
    .line 62
    aput v4, v5, v6
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    .line 63
    :catch_4
    const/4 v5, 0x6

    .line 64
    .line 65
    :try_start_5
    sget-object v6, Laai/liveness/activity/LivenessActivity$f;->c:[I

    .line 66
    .line 67
    sget-object v7, Laai/liveness/Detector$DetectionFailedType;->STRONGLIGHT:Laai/liveness/Detector$DetectionFailedType;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 71
    move-result v7

    .line 72
    .line 73
    aput v5, v6, v7
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    .line 74
    .line 75
    .line 76
    :catch_5
    invoke-static {}, Laai/liveness/Detector$WarnCode;->values()[Laai/liveness/Detector$WarnCode;

    .line 77
    move-result-object v6

    .line 78
    array-length v6, v6

    .line 79
    .line 80
    new-array v6, v6, [I

    .line 81
    .line 82
    sput-object v6, Laai/liveness/activity/LivenessActivity$f;->b:[I

    .line 83
    .line 84
    :try_start_6
    sget-object v7, Laai/liveness/Detector$WarnCode;->FACEMISSING:Laai/liveness/Detector$WarnCode;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 88
    move-result v7

    .line 89
    .line 90
    aput v1, v6, v7
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    .line 91
    .line 92
    :catch_6
    :try_start_7
    sget-object v6, Laai/liveness/activity/LivenessActivity$f;->b:[I

    .line 93
    .line 94
    sget-object v7, Laai/liveness/Detector$WarnCode;->FACESMALL:Laai/liveness/Detector$WarnCode;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 98
    move-result v7

    .line 99
    .line 100
    aput v0, v6, v7
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    .line 101
    .line 102
    :catch_7
    :try_start_8
    sget-object v6, Laai/liveness/activity/LivenessActivity$f;->b:[I

    .line 103
    .line 104
    sget-object v7, Laai/liveness/Detector$WarnCode;->FACELARGE:Laai/liveness/Detector$WarnCode;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 108
    move-result v7

    .line 109
    .line 110
    aput v2, v6, v7
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    .line 111
    .line 112
    :catch_8
    :try_start_9
    sget-object v6, Laai/liveness/activity/LivenessActivity$f;->b:[I

    .line 113
    .line 114
    sget-object v7, Laai/liveness/Detector$WarnCode;->FACENOTCENTER:Laai/liveness/Detector$WarnCode;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 118
    move-result v7

    .line 119
    .line 120
    aput v3, v6, v7
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    .line 121
    .line 122
    :catch_9
    :try_start_a
    sget-object v3, Laai/liveness/activity/LivenessActivity$f;->b:[I

    .line 123
    .line 124
    sget-object v6, Laai/liveness/Detector$WarnCode;->FACENOTFRONTAL:Laai/liveness/Detector$WarnCode;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 128
    move-result v6

    .line 129
    .line 130
    aput v4, v3, v6
    :try_end_a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_a} :catch_a

    .line 131
    .line 132
    :catch_a
    :try_start_b
    sget-object v3, Laai/liveness/activity/LivenessActivity$f;->b:[I

    .line 133
    .line 134
    sget-object v4, Laai/liveness/Detector$WarnCode;->FACENOTSTILL:Laai/liveness/Detector$WarnCode;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 138
    move-result v4

    .line 139
    .line 140
    aput v5, v3, v4
    :try_end_b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_b .. :try_end_b} :catch_b

    .line 141
    .line 142
    :catch_b
    :try_start_c
    sget-object v3, Laai/liveness/activity/LivenessActivity$f;->b:[I

    .line 143
    .line 144
    sget-object v4, Laai/liveness/Detector$WarnCode;->FACECAPTURE:Laai/liveness/Detector$WarnCode;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 148
    move-result v4

    .line 149
    const/4 v5, 0x7

    .line 150
    .line 151
    aput v5, v3, v4
    :try_end_c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_c .. :try_end_c} :catch_c

    .line 152
    .line 153
    :catch_c
    :try_start_d
    sget-object v3, Laai/liveness/activity/LivenessActivity$f;->b:[I

    .line 154
    .line 155
    sget-object v4, Laai/liveness/Detector$WarnCode;->WARN_EYE_OCCLUSION:Laai/liveness/Detector$WarnCode;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 159
    move-result v4

    .line 160
    .line 161
    const/16 v5, 0x8

    .line 162
    .line 163
    aput v5, v3, v4
    :try_end_d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_d .. :try_end_d} :catch_d

    .line 164
    .line 165
    :catch_d
    :try_start_e
    sget-object v3, Laai/liveness/activity/LivenessActivity$f;->b:[I

    .line 166
    .line 167
    sget-object v4, Laai/liveness/Detector$WarnCode;->WARN_MOUTH_OCCLUSION:Laai/liveness/Detector$WarnCode;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 171
    move-result v4

    .line 172
    .line 173
    const/16 v5, 0x9

    .line 174
    .line 175
    aput v5, v3, v4
    :try_end_e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_e .. :try_end_e} :catch_e

    .line 176
    .line 177
    :catch_e
    :try_start_f
    sget-object v3, Laai/liveness/activity/LivenessActivity$f;->b:[I

    .line 178
    .line 179
    sget-object v4, Laai/liveness/Detector$WarnCode;->WARN_WEAKLIGHT:Laai/liveness/Detector$WarnCode;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 183
    move-result v4

    .line 184
    .line 185
    const/16 v5, 0xa

    .line 186
    .line 187
    aput v5, v3, v4
    :try_end_f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_f .. :try_end_f} :catch_f

    .line 188
    .line 189
    :catch_f
    :try_start_10
    sget-object v3, Laai/liveness/activity/LivenessActivity$f;->b:[I

    .line 190
    .line 191
    sget-object v4, Laai/liveness/Detector$WarnCode;->WARN_TOOLIGHT:Laai/liveness/Detector$WarnCode;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 195
    move-result v4

    .line 196
    .line 197
    const/16 v5, 0xb

    .line 198
    .line 199
    aput v5, v3, v4
    :try_end_10
    .catch Ljava/lang/NoSuchFieldError; {:try_start_10 .. :try_end_10} :catch_10

    .line 200
    .line 201
    :catch_10
    :try_start_11
    sget-object v3, Laai/liveness/activity/LivenessActivity$f;->b:[I

    .line 202
    .line 203
    sget-object v4, Laai/liveness/Detector$WarnCode;->WARN_FACE_BIAS_BOTTOM:Laai/liveness/Detector$WarnCode;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 207
    move-result v4

    .line 208
    .line 209
    const/16 v5, 0xc

    .line 210
    .line 211
    aput v5, v3, v4
    :try_end_11
    .catch Ljava/lang/NoSuchFieldError; {:try_start_11 .. :try_end_11} :catch_11

    .line 212
    .line 213
    :catch_11
    :try_start_12
    sget-object v3, Laai/liveness/activity/LivenessActivity$f;->b:[I

    .line 214
    .line 215
    sget-object v4, Laai/liveness/Detector$WarnCode;->WARN_FACE_BIAS_UP:Laai/liveness/Detector$WarnCode;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 219
    move-result v4

    .line 220
    .line 221
    const/16 v5, 0xd

    .line 222
    .line 223
    aput v5, v3, v4
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_12 .. :try_end_12} :catch_12

    .line 224
    .line 225
    :catch_12
    :try_start_13
    sget-object v3, Laai/liveness/activity/LivenessActivity$f;->b:[I

    .line 226
    .line 227
    sget-object v4, Laai/liveness/Detector$WarnCode;->WARN_FACE_BIAS_RIGHT:Laai/liveness/Detector$WarnCode;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 231
    move-result v4

    .line 232
    .line 233
    const/16 v5, 0xe

    .line 234
    .line 235
    aput v5, v3, v4
    :try_end_13
    .catch Ljava/lang/NoSuchFieldError; {:try_start_13 .. :try_end_13} :catch_13

    .line 236
    .line 237
    :catch_13
    :try_start_14
    sget-object v3, Laai/liveness/activity/LivenessActivity$f;->b:[I

    .line 238
    .line 239
    sget-object v4, Laai/liveness/Detector$WarnCode;->WARN_FACE_BIAS_LEFT:Laai/liveness/Detector$WarnCode;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 243
    move-result v4

    .line 244
    .line 245
    const/16 v5, 0xf

    .line 246
    .line 247
    aput v5, v3, v4
    :try_end_14
    .catch Ljava/lang/NoSuchFieldError; {:try_start_14 .. :try_end_14} :catch_14

    .line 248
    .line 249
    :catch_14
    :try_start_15
    sget-object v3, Laai/liveness/activity/LivenessActivity$f;->b:[I

    .line 250
    .line 251
    sget-object v4, Laai/liveness/Detector$WarnCode;->PLEASE_BLINK:Laai/liveness/Detector$WarnCode;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 255
    move-result v4

    .line 256
    .line 257
    const/16 v5, 0x10

    .line 258
    .line 259
    aput v5, v3, v4
    :try_end_15
    .catch Ljava/lang/NoSuchFieldError; {:try_start_15 .. :try_end_15} :catch_15

    .line 260
    .line 261
    :catch_15
    :try_start_16
    sget-object v3, Laai/liveness/activity/LivenessActivity$f;->b:[I

    .line 262
    .line 263
    sget-object v4, Laai/liveness/Detector$WarnCode;->FACEINACTION:Laai/liveness/Detector$WarnCode;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 267
    move-result v4

    .line 268
    .line 269
    const/16 v5, 0x11

    .line 270
    .line 271
    aput v5, v3, v4
    :try_end_16
    .catch Ljava/lang/NoSuchFieldError; {:try_start_16 .. :try_end_16} :catch_16

    .line 272
    .line 273
    :catch_16
    :try_start_17
    sget-object v3, Laai/liveness/activity/LivenessActivity$f;->b:[I

    .line 274
    .line 275
    sget-object v4, Laai/liveness/Detector$WarnCode;->WARN_LARGE_YAW:Laai/liveness/Detector$WarnCode;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 279
    move-result v4

    .line 280
    .line 281
    const/16 v5, 0x12

    .line 282
    .line 283
    aput v5, v3, v4
    :try_end_17
    .catch Ljava/lang/NoSuchFieldError; {:try_start_17 .. :try_end_17} :catch_17

    .line 284
    .line 285
    :catch_17
    :try_start_18
    sget-object v3, Laai/liveness/activity/LivenessActivity$f;->b:[I

    .line 286
    .line 287
    sget-object v4, Laai/liveness/Detector$WarnCode;->WARN_MULTIPLEFACES:Laai/liveness/Detector$WarnCode;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 291
    move-result v4

    .line 292
    .line 293
    const/16 v5, 0x13

    .line 294
    .line 295
    aput v5, v3, v4
    :try_end_18
    .catch Ljava/lang/NoSuchFieldError; {:try_start_18 .. :try_end_18} :catch_18

    .line 296
    .line 297
    .line 298
    :catch_18
    invoke-static {}, Laai/liveness/Detector$DetectionType;->values()[Laai/liveness/Detector$DetectionType;

    .line 299
    move-result-object v3

    .line 300
    array-length v3, v3

    .line 301
    .line 302
    new-array v3, v3, [I

    .line 303
    .line 304
    sput-object v3, Laai/liveness/activity/LivenessActivity$f;->a:[I

    .line 305
    .line 306
    :try_start_19
    sget-object v4, Laai/liveness/Detector$DetectionType;->POS_YAW:Laai/liveness/Detector$DetectionType;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 310
    move-result v4

    .line 311
    .line 312
    aput v1, v3, v4
    :try_end_19
    .catch Ljava/lang/NoSuchFieldError; {:try_start_19 .. :try_end_19} :catch_19

    .line 313
    .line 314
    :catch_19
    :try_start_1a
    sget-object v1, Laai/liveness/activity/LivenessActivity$f;->a:[I

    .line 315
    .line 316
    sget-object v3, Laai/liveness/Detector$DetectionType;->MOUTH:Laai/liveness/Detector$DetectionType;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 320
    move-result v3

    .line 321
    .line 322
    aput v0, v1, v3
    :try_end_1a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1a .. :try_end_1a} :catch_1a

    .line 323
    .line 324
    :catch_1a
    :try_start_1b
    sget-object v0, Laai/liveness/activity/LivenessActivity$f;->a:[I

    .line 325
    .line 326
    sget-object v1, Laai/liveness/Detector$DetectionType;->BLINK:Laai/liveness/Detector$DetectionType;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 330
    move-result v1

    .line 331
    .line 332
    aput v2, v0, v1
    :try_end_1b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1b .. :try_end_1b} :catch_1b

    .line 333
    :catch_1b
    return-void
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
