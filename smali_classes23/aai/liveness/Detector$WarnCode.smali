.class public final enum Laai/liveness/Detector$WarnCode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Laai/liveness/Detector$WarnCode;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum CHECK_FACE_FRONTAL:Laai/liveness/Detector$WarnCode;

.field public static final enum ERROR_FACEMISSING:Laai/liveness/Detector$WarnCode;

.field public static final enum ERROR_MUCHMOTION:Laai/liveness/Detector$WarnCode;

.field public static final enum ERROR_MULTIPLEFACES:Laai/liveness/Detector$WarnCode;

.field public static final enum FACECAPTURE:Laai/liveness/Detector$WarnCode;

.field public static final enum FACEINACTION:Laai/liveness/Detector$WarnCode;

.field public static final enum FACELARGE:Laai/liveness/Detector$WarnCode;

.field public static final enum FACEMISSING:Laai/liveness/Detector$WarnCode;

.field public static final enum FACENOTCENTER:Laai/liveness/Detector$WarnCode;

.field public static final enum FACENOTFRONTAL:Laai/liveness/Detector$WarnCode;

.field public static final enum FACENOTSTILL:Laai/liveness/Detector$WarnCode;

.field public static final enum FACESMALL:Laai/liveness/Detector$WarnCode;

.field public static final enum MOVE_TOO_FAST:Laai/liveness/Detector$WarnCode;

.field public static final enum OK:Laai/liveness/Detector$WarnCode;

.field public static final enum OK_ACTIONDONE:Laai/liveness/Detector$WarnCode;

.field public static final enum OK_COUNTING:Laai/liveness/Detector$WarnCode;

.field public static final enum OK_DEFAULT:Laai/liveness/Detector$WarnCode;

.field public static final enum PLEASE_BLINK:Laai/liveness/Detector$WarnCode;

.field public static final enum WARN_EYE_OCCLUSION:Laai/liveness/Detector$WarnCode;

.field public static final enum WARN_FACE_BIAS_BOTTOM:Laai/liveness/Detector$WarnCode;

.field public static final enum WARN_FACE_BIAS_LEFT:Laai/liveness/Detector$WarnCode;

.field public static final enum WARN_FACE_BIAS_RIGHT:Laai/liveness/Detector$WarnCode;

.field public static final enum WARN_FACE_BIAS_UP:Laai/liveness/Detector$WarnCode;

.field public static final enum WARN_LARGE_YAW:Laai/liveness/Detector$WarnCode;

.field public static final enum WARN_MOTION:Laai/liveness/Detector$WarnCode;

.field public static final enum WARN_MOUTH_OCCLUSION:Laai/liveness/Detector$WarnCode;

.field public static final enum WARN_MOUTH_OCCLUSION_IN_MOTION:Laai/liveness/Detector$WarnCode;

.field public static final enum WARN_MULTIPLEFACES:Laai/liveness/Detector$WarnCode;

.field public static final enum WARN_TOOLIGHT:Laai/liveness/Detector$WarnCode;

.field public static final enum WARN_WEAKLIGHT:Laai/liveness/Detector$WarnCode;

.field public static final synthetic b:[Laai/liveness/Detector$WarnCode;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 3
    .line 4
    const-string v1, "FACEMISSING"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Laai/liveness/Detector$WarnCode;->FACEMISSING:Laai/liveness/Detector$WarnCode;

    .line 11
    .line 12
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 13
    .line 14
    const-string v1, "FACELARGE"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v0, Laai/liveness/Detector$WarnCode;->FACELARGE:Laai/liveness/Detector$WarnCode;

    .line 21
    .line 22
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 23
    .line 24
    const-string v1, "FACESMALL"

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v0, Laai/liveness/Detector$WarnCode;->FACESMALL:Laai/liveness/Detector$WarnCode;

    .line 31
    .line 32
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 33
    .line 34
    const-string v1, "FACENOTCENTER"

    .line 35
    const/4 v2, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    sput-object v0, Laai/liveness/Detector$WarnCode;->FACENOTCENTER:Laai/liveness/Detector$WarnCode;

    .line 41
    .line 42
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 43
    .line 44
    const-string v1, "FACENOTFRONTAL"

    .line 45
    const/4 v2, 0x4

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 49
    .line 50
    sput-object v0, Laai/liveness/Detector$WarnCode;->FACENOTFRONTAL:Laai/liveness/Detector$WarnCode;

    .line 51
    .line 52
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 53
    .line 54
    const-string v1, "FACENOTSTILL"

    .line 55
    const/4 v2, 0x5

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 59
    .line 60
    sput-object v0, Laai/liveness/Detector$WarnCode;->FACENOTSTILL:Laai/liveness/Detector$WarnCode;

    .line 61
    .line 62
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 63
    .line 64
    const-string v1, "CHECK_FACE_FRONTAL"

    .line 65
    const/4 v2, 0x6

    .line 66
    .line 67
    .line 68
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 69
    .line 70
    sput-object v0, Laai/liveness/Detector$WarnCode;->CHECK_FACE_FRONTAL:Laai/liveness/Detector$WarnCode;

    .line 71
    .line 72
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 73
    .line 74
    const-string v1, "WARN_MULTIPLEFACES"

    .line 75
    const/4 v2, 0x7

    .line 76
    .line 77
    .line 78
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 79
    .line 80
    sput-object v0, Laai/liveness/Detector$WarnCode;->WARN_MULTIPLEFACES:Laai/liveness/Detector$WarnCode;

    .line 81
    .line 82
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 83
    .line 84
    const-string v1, "WARN_EYE_OCCLUSION"

    .line 85
    .line 86
    const/16 v2, 0x8

    .line 87
    .line 88
    .line 89
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 90
    .line 91
    sput-object v0, Laai/liveness/Detector$WarnCode;->WARN_EYE_OCCLUSION:Laai/liveness/Detector$WarnCode;

    .line 92
    .line 93
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 94
    .line 95
    const-string v1, "WARN_MOUTH_OCCLUSION"

    .line 96
    .line 97
    const/16 v2, 0x9

    .line 98
    .line 99
    .line 100
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 101
    .line 102
    sput-object v0, Laai/liveness/Detector$WarnCode;->WARN_MOUTH_OCCLUSION:Laai/liveness/Detector$WarnCode;

    .line 103
    .line 104
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 105
    .line 106
    const-string v1, "FACECAPTURE"

    .line 107
    .line 108
    const/16 v2, 0xa

    .line 109
    .line 110
    .line 111
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 112
    .line 113
    sput-object v0, Laai/liveness/Detector$WarnCode;->FACECAPTURE:Laai/liveness/Detector$WarnCode;

    .line 114
    .line 115
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 116
    .line 117
    const-string v1, "FACEINACTION"

    .line 118
    .line 119
    const/16 v2, 0xb

    .line 120
    .line 121
    .line 122
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 123
    .line 124
    sput-object v0, Laai/liveness/Detector$WarnCode;->FACEINACTION:Laai/liveness/Detector$WarnCode;

    .line 125
    .line 126
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 127
    .line 128
    const-string v1, "OK_ACTIONDONE"

    .line 129
    .line 130
    const/16 v2, 0xc

    .line 131
    .line 132
    .line 133
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 134
    .line 135
    sput-object v0, Laai/liveness/Detector$WarnCode;->OK_ACTIONDONE:Laai/liveness/Detector$WarnCode;

    .line 136
    .line 137
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 138
    .line 139
    const-string v1, "ERROR_MULTIPLEFACES"

    .line 140
    .line 141
    const/16 v2, 0xd

    .line 142
    .line 143
    .line 144
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 145
    .line 146
    sput-object v0, Laai/liveness/Detector$WarnCode;->ERROR_MULTIPLEFACES:Laai/liveness/Detector$WarnCode;

    .line 147
    .line 148
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 149
    .line 150
    const-string v1, "ERROR_FACEMISSING"

    .line 151
    .line 152
    const/16 v2, 0xe

    .line 153
    .line 154
    .line 155
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 156
    .line 157
    sput-object v0, Laai/liveness/Detector$WarnCode;->ERROR_FACEMISSING:Laai/liveness/Detector$WarnCode;

    .line 158
    .line 159
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 160
    .line 161
    const-string v1, "ERROR_MUCHMOTION"

    .line 162
    .line 163
    const/16 v2, 0xf

    .line 164
    .line 165
    .line 166
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 167
    .line 168
    sput-object v0, Laai/liveness/Detector$WarnCode;->ERROR_MUCHMOTION:Laai/liveness/Detector$WarnCode;

    .line 169
    .line 170
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 171
    .line 172
    const-string v1, "OK_COUNTING"

    .line 173
    .line 174
    const/16 v2, 0x10

    .line 175
    .line 176
    .line 177
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 178
    .line 179
    sput-object v0, Laai/liveness/Detector$WarnCode;->OK_COUNTING:Laai/liveness/Detector$WarnCode;

    .line 180
    .line 181
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 182
    .line 183
    const-string v1, "OK_DEFAULT"

    .line 184
    .line 185
    const/16 v2, 0x11

    .line 186
    .line 187
    .line 188
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 189
    .line 190
    sput-object v0, Laai/liveness/Detector$WarnCode;->OK_DEFAULT:Laai/liveness/Detector$WarnCode;

    .line 191
    .line 192
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 193
    .line 194
    const-string v1, "WARN_MOTION"

    .line 195
    .line 196
    const/16 v2, 0x12

    .line 197
    .line 198
    .line 199
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 200
    .line 201
    sput-object v0, Laai/liveness/Detector$WarnCode;->WARN_MOTION:Laai/liveness/Detector$WarnCode;

    .line 202
    .line 203
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 204
    .line 205
    const-string v1, "WARN_LARGE_YAW"

    .line 206
    .line 207
    const/16 v2, 0x13

    .line 208
    .line 209
    .line 210
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 211
    .line 212
    sput-object v0, Laai/liveness/Detector$WarnCode;->WARN_LARGE_YAW:Laai/liveness/Detector$WarnCode;

    .line 213
    .line 214
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 215
    .line 216
    const-string v1, "WARN_MOUTH_OCCLUSION_IN_MOTION"

    .line 217
    .line 218
    const/16 v2, 0x14

    .line 219
    .line 220
    .line 221
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 222
    .line 223
    sput-object v0, Laai/liveness/Detector$WarnCode;->WARN_MOUTH_OCCLUSION_IN_MOTION:Laai/liveness/Detector$WarnCode;

    .line 224
    .line 225
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 226
    .line 227
    const-string v1, "WARN_FACE_BIAS_RIGHT"

    .line 228
    .line 229
    const/16 v2, 0x15

    .line 230
    .line 231
    .line 232
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 233
    .line 234
    sput-object v0, Laai/liveness/Detector$WarnCode;->WARN_FACE_BIAS_RIGHT:Laai/liveness/Detector$WarnCode;

    .line 235
    .line 236
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 237
    .line 238
    const-string v1, "WARN_FACE_BIAS_LEFT"

    .line 239
    .line 240
    const/16 v2, 0x16

    .line 241
    .line 242
    .line 243
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 244
    .line 245
    sput-object v0, Laai/liveness/Detector$WarnCode;->WARN_FACE_BIAS_LEFT:Laai/liveness/Detector$WarnCode;

    .line 246
    .line 247
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 248
    .line 249
    const-string v1, "WARN_FACE_BIAS_BOTTOM"

    .line 250
    .line 251
    const/16 v2, 0x17

    .line 252
    .line 253
    .line 254
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 255
    .line 256
    sput-object v0, Laai/liveness/Detector$WarnCode;->WARN_FACE_BIAS_BOTTOM:Laai/liveness/Detector$WarnCode;

    .line 257
    .line 258
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 259
    .line 260
    const-string v1, "WARN_FACE_BIAS_UP"

    .line 261
    .line 262
    const/16 v2, 0x18

    .line 263
    .line 264
    .line 265
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 266
    .line 267
    sput-object v0, Laai/liveness/Detector$WarnCode;->WARN_FACE_BIAS_UP:Laai/liveness/Detector$WarnCode;

    .line 268
    .line 269
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 270
    .line 271
    const-string v1, "WARN_WEAKLIGHT"

    .line 272
    .line 273
    const/16 v2, 0x19

    .line 274
    .line 275
    .line 276
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 277
    .line 278
    sput-object v0, Laai/liveness/Detector$WarnCode;->WARN_WEAKLIGHT:Laai/liveness/Detector$WarnCode;

    .line 279
    .line 280
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 281
    .line 282
    const-string v1, "WARN_TOOLIGHT"

    .line 283
    .line 284
    const/16 v2, 0x1a

    .line 285
    .line 286
    .line 287
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 288
    .line 289
    sput-object v0, Laai/liveness/Detector$WarnCode;->WARN_TOOLIGHT:Laai/liveness/Detector$WarnCode;

    .line 290
    .line 291
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 292
    .line 293
    const-string v1, "OK"

    .line 294
    .line 295
    const/16 v2, 0x1b

    .line 296
    .line 297
    .line 298
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 299
    .line 300
    sput-object v0, Laai/liveness/Detector$WarnCode;->OK:Laai/liveness/Detector$WarnCode;

    .line 301
    .line 302
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 303
    .line 304
    const-string v1, "PLEASE_BLINK"

    .line 305
    .line 306
    const/16 v2, 0x1c

    .line 307
    .line 308
    .line 309
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 310
    .line 311
    sput-object v0, Laai/liveness/Detector$WarnCode;->PLEASE_BLINK:Laai/liveness/Detector$WarnCode;

    .line 312
    .line 313
    new-instance v0, Laai/liveness/Detector$WarnCode;

    .line 314
    .line 315
    const-string v1, "MOVE_TOO_FAST"

    .line 316
    .line 317
    const/16 v2, 0x1d

    .line 318
    .line 319
    .line 320
    invoke-direct {v0, v1, v2}, Laai/liveness/Detector$WarnCode;-><init>(Ljava/lang/String;I)V

    .line 321
    .line 322
    sput-object v0, Laai/liveness/Detector$WarnCode;->MOVE_TOO_FAST:Laai/liveness/Detector$WarnCode;

    .line 323
    .line 324
    .line 325
    invoke-static {}, Laai/liveness/Detector$WarnCode;->a()[Laai/liveness/Detector$WarnCode;

    .line 326
    move-result-object v0

    .line 327
    .line 328
    sput-object v0, Laai/liveness/Detector$WarnCode;->b:[Laai/liveness/Detector$WarnCode;

    .line 329
    return-void
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

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

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
.end method

.method public static synthetic a()[Laai/liveness/Detector$WarnCode;
    .locals 31

    .line 1
    .line 2
    sget-object v1, Laai/liveness/Detector$WarnCode;->FACEMISSING:Laai/liveness/Detector$WarnCode;

    .line 3
    .line 4
    sget-object v2, Laai/liveness/Detector$WarnCode;->FACELARGE:Laai/liveness/Detector$WarnCode;

    .line 5
    .line 6
    sget-object v3, Laai/liveness/Detector$WarnCode;->FACESMALL:Laai/liveness/Detector$WarnCode;

    .line 7
    .line 8
    sget-object v4, Laai/liveness/Detector$WarnCode;->FACENOTCENTER:Laai/liveness/Detector$WarnCode;

    .line 9
    .line 10
    sget-object v5, Laai/liveness/Detector$WarnCode;->FACENOTFRONTAL:Laai/liveness/Detector$WarnCode;

    .line 11
    .line 12
    sget-object v6, Laai/liveness/Detector$WarnCode;->FACENOTSTILL:Laai/liveness/Detector$WarnCode;

    .line 13
    .line 14
    sget-object v7, Laai/liveness/Detector$WarnCode;->CHECK_FACE_FRONTAL:Laai/liveness/Detector$WarnCode;

    .line 15
    .line 16
    sget-object v8, Laai/liveness/Detector$WarnCode;->WARN_MULTIPLEFACES:Laai/liveness/Detector$WarnCode;

    .line 17
    .line 18
    sget-object v9, Laai/liveness/Detector$WarnCode;->WARN_EYE_OCCLUSION:Laai/liveness/Detector$WarnCode;

    .line 19
    .line 20
    sget-object v10, Laai/liveness/Detector$WarnCode;->WARN_MOUTH_OCCLUSION:Laai/liveness/Detector$WarnCode;

    .line 21
    .line 22
    sget-object v11, Laai/liveness/Detector$WarnCode;->FACECAPTURE:Laai/liveness/Detector$WarnCode;

    .line 23
    .line 24
    sget-object v12, Laai/liveness/Detector$WarnCode;->FACEINACTION:Laai/liveness/Detector$WarnCode;

    .line 25
    .line 26
    sget-object v13, Laai/liveness/Detector$WarnCode;->OK_ACTIONDONE:Laai/liveness/Detector$WarnCode;

    .line 27
    .line 28
    sget-object v14, Laai/liveness/Detector$WarnCode;->ERROR_MULTIPLEFACES:Laai/liveness/Detector$WarnCode;

    .line 29
    .line 30
    sget-object v15, Laai/liveness/Detector$WarnCode;->ERROR_FACEMISSING:Laai/liveness/Detector$WarnCode;

    .line 31
    .line 32
    sget-object v16, Laai/liveness/Detector$WarnCode;->ERROR_MUCHMOTION:Laai/liveness/Detector$WarnCode;

    .line 33
    .line 34
    sget-object v17, Laai/liveness/Detector$WarnCode;->OK_COUNTING:Laai/liveness/Detector$WarnCode;

    .line 35
    .line 36
    sget-object v18, Laai/liveness/Detector$WarnCode;->OK_DEFAULT:Laai/liveness/Detector$WarnCode;

    .line 37
    .line 38
    sget-object v19, Laai/liveness/Detector$WarnCode;->WARN_MOTION:Laai/liveness/Detector$WarnCode;

    .line 39
    .line 40
    sget-object v20, Laai/liveness/Detector$WarnCode;->WARN_LARGE_YAW:Laai/liveness/Detector$WarnCode;

    .line 41
    .line 42
    sget-object v21, Laai/liveness/Detector$WarnCode;->WARN_MOUTH_OCCLUSION_IN_MOTION:Laai/liveness/Detector$WarnCode;

    .line 43
    .line 44
    sget-object v22, Laai/liveness/Detector$WarnCode;->WARN_FACE_BIAS_RIGHT:Laai/liveness/Detector$WarnCode;

    .line 45
    .line 46
    sget-object v23, Laai/liveness/Detector$WarnCode;->WARN_FACE_BIAS_LEFT:Laai/liveness/Detector$WarnCode;

    .line 47
    .line 48
    sget-object v24, Laai/liveness/Detector$WarnCode;->WARN_FACE_BIAS_BOTTOM:Laai/liveness/Detector$WarnCode;

    .line 49
    .line 50
    sget-object v25, Laai/liveness/Detector$WarnCode;->WARN_FACE_BIAS_UP:Laai/liveness/Detector$WarnCode;

    .line 51
    .line 52
    sget-object v26, Laai/liveness/Detector$WarnCode;->WARN_WEAKLIGHT:Laai/liveness/Detector$WarnCode;

    .line 53
    .line 54
    sget-object v27, Laai/liveness/Detector$WarnCode;->WARN_TOOLIGHT:Laai/liveness/Detector$WarnCode;

    .line 55
    .line 56
    sget-object v28, Laai/liveness/Detector$WarnCode;->OK:Laai/liveness/Detector$WarnCode;

    .line 57
    .line 58
    sget-object v29, Laai/liveness/Detector$WarnCode;->PLEASE_BLINK:Laai/liveness/Detector$WarnCode;

    .line 59
    .line 60
    sget-object v30, Laai/liveness/Detector$WarnCode;->MOVE_TOO_FAST:Laai/liveness/Detector$WarnCode;

    .line 61
    .line 62
    .line 63
    filled-new-array/range {v1 .. v30}, [Laai/liveness/Detector$WarnCode;

    .line 64
    move-result-object v0

    .line 65
    return-object v0
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
.end method

.method public static valueOf(Ljava/lang/String;)Laai/liveness/Detector$WarnCode;
    .locals 1

    .line 1
    .line 2
    const-class v0, Laai/liveness/Detector$WarnCode;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Laai/liveness/Detector$WarnCode;

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

.method public static values()[Laai/liveness/Detector$WarnCode;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Laai/liveness/Detector$WarnCode;->b:[Laai/liveness/Detector$WarnCode;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Laai/liveness/Detector$WarnCode;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Laai/liveness/Detector$WarnCode;

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
    .line 19
    .line 20
.end method
