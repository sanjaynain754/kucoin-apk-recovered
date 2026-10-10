.class public final Lcom/google/zxing/datamatrix/detector/Detector;
.super Ljava/lang/Object;
.source "Detector.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitionsComparator;,
        Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;
    }
.end annotation


# instance fields
.field private final image:Lcom/google/zxing/common/BitMatrix;

.field private final rectangleDetector:Lcom/google/zxing/common/detector/WhiteRectangleDetector;


# direct methods
.method public constructor <init>(Lcom/google/zxing/common/BitMatrix;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/zxing/datamatrix/detector/Detector;->image:Lcom/google/zxing/common/BitMatrix;

    .line 6
    .line 7
    new-instance v0, Lcom/google/zxing/common/detector/WhiteRectangleDetector;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, p1}, Lcom/google/zxing/common/detector/WhiteRectangleDetector;-><init>(Lcom/google/zxing/common/BitMatrix;)V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/google/zxing/datamatrix/detector/Detector;->rectangleDetector:Lcom/google/zxing/common/detector/WhiteRectangleDetector;

    .line 13
    return-void
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

.method private correctTopRight(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;I)Lcom/google/zxing/ResultPoint;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {p1, p2}, Lcom/google/zxing/datamatrix/detector/Detector;->distance(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)I

    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    int-to-float p5, p5

    .line 7
    div-float/2addr v0, p5

    .line 8
    .line 9
    .line 10
    invoke-static {p3, p4}, Lcom/google/zxing/datamatrix/detector/Detector;->distance(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)I

    .line 11
    move-result v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p4}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 15
    move-result v2

    .line 16
    .line 17
    .line 18
    invoke-virtual {p3}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 19
    move-result v3

    .line 20
    sub-float/2addr v2, v3

    .line 21
    int-to-float v1, v1

    .line 22
    div-float/2addr v2, v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p4}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 26
    move-result v3

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 30
    move-result v4

    .line 31
    sub-float/2addr v3, v4

    .line 32
    div-float/2addr v3, v1

    .line 33
    .line 34
    new-instance v1, Lcom/google/zxing/ResultPoint;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p4}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 38
    move-result v4

    .line 39
    mul-float/2addr v2, v0

    .line 40
    add-float/2addr v4, v2

    .line 41
    .line 42
    .line 43
    invoke-virtual {p4}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 44
    move-result v2

    .line 45
    mul-float/2addr v0, v3

    .line 46
    add-float/2addr v2, v0

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, v4, v2}, Lcom/google/zxing/ResultPoint;-><init>(FF)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1, p3}, Lcom/google/zxing/datamatrix/detector/Detector;->distance(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)I

    .line 53
    move-result p1

    .line 54
    int-to-float p1, p1

    .line 55
    div-float/2addr p1, p5

    .line 56
    .line 57
    .line 58
    invoke-static {p2, p4}, Lcom/google/zxing/datamatrix/detector/Detector;->distance(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)I

    .line 59
    move-result p5

    .line 60
    .line 61
    .line 62
    invoke-virtual {p4}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 63
    move-result v0

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 67
    move-result v2

    .line 68
    sub-float/2addr v0, v2

    .line 69
    int-to-float p5, p5

    .line 70
    div-float/2addr v0, p5

    .line 71
    .line 72
    .line 73
    invoke-virtual {p4}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 74
    move-result v2

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 78
    move-result v3

    .line 79
    sub-float/2addr v2, v3

    .line 80
    div-float/2addr v2, p5

    .line 81
    .line 82
    new-instance p5, Lcom/google/zxing/ResultPoint;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p4}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 86
    move-result v3

    .line 87
    mul-float/2addr v0, p1

    .line 88
    add-float/2addr v3, v0

    .line 89
    .line 90
    .line 91
    invoke-virtual {p4}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 92
    move-result p4

    .line 93
    mul-float/2addr p1, v2

    .line 94
    add-float/2addr p4, p1

    .line 95
    .line 96
    .line 97
    invoke-direct {p5, v3, p4}, Lcom/google/zxing/ResultPoint;-><init>(FF)V

    .line 98
    .line 99
    .line 100
    invoke-direct {p0, v1}, Lcom/google/zxing/datamatrix/detector/Detector;->isValid(Lcom/google/zxing/ResultPoint;)Z

    .line 101
    move-result p1

    .line 102
    .line 103
    if-nez p1, :cond_1

    .line 104
    .line 105
    .line 106
    invoke-direct {p0, p5}, Lcom/google/zxing/datamatrix/detector/Detector;->isValid(Lcom/google/zxing/ResultPoint;)Z

    .line 107
    move-result p1

    .line 108
    .line 109
    if-eqz p1, :cond_0

    .line 110
    goto :goto_1

    .line 111
    :cond_0
    const/4 p1, 0x0

    .line 112
    return-object p1

    .line 113
    .line 114
    .line 115
    :cond_1
    invoke-direct {p0, p5}, Lcom/google/zxing/datamatrix/detector/Detector;->isValid(Lcom/google/zxing/ResultPoint;)Z

    .line 116
    move-result p1

    .line 117
    .line 118
    if-nez p1, :cond_2

    .line 119
    goto :goto_0

    .line 120
    .line 121
    .line 122
    :cond_2
    invoke-direct {p0, p3, v1}, Lcom/google/zxing/datamatrix/detector/Detector;->transitionsBetween(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;

    .line 123
    move-result-object p1

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;->getTransitions()I

    .line 127
    move-result p1

    .line 128
    .line 129
    .line 130
    invoke-direct {p0, p2, v1}, Lcom/google/zxing/datamatrix/detector/Detector;->transitionsBetween(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;

    .line 131
    move-result-object p4

    .line 132
    .line 133
    .line 134
    invoke-virtual {p4}, Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;->getTransitions()I

    .line 135
    move-result p4

    .line 136
    sub-int/2addr p1, p4

    .line 137
    .line 138
    .line 139
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 140
    move-result p1

    .line 141
    .line 142
    .line 143
    invoke-direct {p0, p3, p5}, Lcom/google/zxing/datamatrix/detector/Detector;->transitionsBetween(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;

    .line 144
    move-result-object p3

    .line 145
    .line 146
    .line 147
    invoke-virtual {p3}, Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;->getTransitions()I

    .line 148
    move-result p3

    .line 149
    .line 150
    .line 151
    invoke-direct {p0, p2, p5}, Lcom/google/zxing/datamatrix/detector/Detector;->transitionsBetween(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;

    .line 152
    move-result-object p2

    .line 153
    .line 154
    .line 155
    invoke-virtual {p2}, Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;->getTransitions()I

    .line 156
    move-result p2

    .line 157
    sub-int/2addr p3, p2

    .line 158
    .line 159
    .line 160
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 161
    move-result p2

    .line 162
    .line 163
    if-gt p1, p2, :cond_3

    .line 164
    :goto_0
    return-object v1

    .line 165
    :cond_3
    :goto_1
    return-object p5
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
.end method

.method private correctTopRightRectangular(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;II)Lcom/google/zxing/ResultPoint;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {p1, p2}, Lcom/google/zxing/datamatrix/detector/Detector;->distance(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)I

    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    int-to-float v1, p5

    .line 7
    div-float/2addr v0, v1

    .line 8
    .line 9
    .line 10
    invoke-static {p3, p4}, Lcom/google/zxing/datamatrix/detector/Detector;->distance(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)I

    .line 11
    move-result v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p4}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 15
    move-result v2

    .line 16
    .line 17
    .line 18
    invoke-virtual {p3}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 19
    move-result v3

    .line 20
    sub-float/2addr v2, v3

    .line 21
    int-to-float v1, v1

    .line 22
    div-float/2addr v2, v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p4}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 26
    move-result v3

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 30
    move-result v4

    .line 31
    sub-float/2addr v3, v4

    .line 32
    div-float/2addr v3, v1

    .line 33
    .line 34
    new-instance v1, Lcom/google/zxing/ResultPoint;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p4}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 38
    move-result v4

    .line 39
    mul-float/2addr v2, v0

    .line 40
    add-float/2addr v4, v2

    .line 41
    .line 42
    .line 43
    invoke-virtual {p4}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 44
    move-result v2

    .line 45
    mul-float/2addr v0, v3

    .line 46
    add-float/2addr v2, v0

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, v4, v2}, Lcom/google/zxing/ResultPoint;-><init>(FF)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1, p3}, Lcom/google/zxing/datamatrix/detector/Detector;->distance(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)I

    .line 53
    move-result p1

    .line 54
    int-to-float p1, p1

    .line 55
    int-to-float v0, p6

    .line 56
    div-float/2addr p1, v0

    .line 57
    .line 58
    .line 59
    invoke-static {p2, p4}, Lcom/google/zxing/datamatrix/detector/Detector;->distance(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)I

    .line 60
    move-result v0

    .line 61
    .line 62
    .line 63
    invoke-virtual {p4}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 64
    move-result v2

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 68
    move-result v3

    .line 69
    sub-float/2addr v2, v3

    .line 70
    int-to-float v0, v0

    .line 71
    div-float/2addr v2, v0

    .line 72
    .line 73
    .line 74
    invoke-virtual {p4}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 75
    move-result v3

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 79
    move-result v4

    .line 80
    sub-float/2addr v3, v4

    .line 81
    div-float/2addr v3, v0

    .line 82
    .line 83
    new-instance v0, Lcom/google/zxing/ResultPoint;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p4}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 87
    move-result v4

    .line 88
    mul-float/2addr v2, p1

    .line 89
    add-float/2addr v4, v2

    .line 90
    .line 91
    .line 92
    invoke-virtual {p4}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 93
    move-result p4

    .line 94
    mul-float/2addr p1, v3

    .line 95
    add-float/2addr p4, p1

    .line 96
    .line 97
    .line 98
    invoke-direct {v0, v4, p4}, Lcom/google/zxing/ResultPoint;-><init>(FF)V

    .line 99
    .line 100
    .line 101
    invoke-direct {p0, v1}, Lcom/google/zxing/datamatrix/detector/Detector;->isValid(Lcom/google/zxing/ResultPoint;)Z

    .line 102
    move-result p1

    .line 103
    .line 104
    if-nez p1, :cond_1

    .line 105
    .line 106
    .line 107
    invoke-direct {p0, v0}, Lcom/google/zxing/datamatrix/detector/Detector;->isValid(Lcom/google/zxing/ResultPoint;)Z

    .line 108
    move-result p1

    .line 109
    .line 110
    if-eqz p1, :cond_0

    .line 111
    goto :goto_1

    .line 112
    :cond_0
    const/4 p1, 0x0

    .line 113
    return-object p1

    .line 114
    .line 115
    .line 116
    :cond_1
    invoke-direct {p0, v0}, Lcom/google/zxing/datamatrix/detector/Detector;->isValid(Lcom/google/zxing/ResultPoint;)Z

    .line 117
    move-result p1

    .line 118
    .line 119
    if-nez p1, :cond_2

    .line 120
    goto :goto_0

    .line 121
    .line 122
    .line 123
    :cond_2
    invoke-direct {p0, p3, v1}, Lcom/google/zxing/datamatrix/detector/Detector;->transitionsBetween(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;

    .line 124
    move-result-object p1

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;->getTransitions()I

    .line 128
    move-result p1

    .line 129
    .line 130
    sub-int p1, p5, p1

    .line 131
    .line 132
    .line 133
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 134
    move-result p1

    .line 135
    .line 136
    .line 137
    invoke-direct {p0, p2, v1}, Lcom/google/zxing/datamatrix/detector/Detector;->transitionsBetween(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;

    .line 138
    move-result-object p4

    .line 139
    .line 140
    .line 141
    invoke-virtual {p4}, Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;->getTransitions()I

    .line 142
    move-result p4

    .line 143
    .line 144
    sub-int p4, p6, p4

    .line 145
    .line 146
    .line 147
    invoke-static {p4}, Ljava/lang/Math;->abs(I)I

    .line 148
    move-result p4

    .line 149
    add-int/2addr p1, p4

    .line 150
    .line 151
    .line 152
    invoke-direct {p0, p3, v0}, Lcom/google/zxing/datamatrix/detector/Detector;->transitionsBetween(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;

    .line 153
    move-result-object p3

    .line 154
    .line 155
    .line 156
    invoke-virtual {p3}, Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;->getTransitions()I

    .line 157
    move-result p3

    .line 158
    sub-int/2addr p5, p3

    .line 159
    .line 160
    .line 161
    invoke-static {p5}, Ljava/lang/Math;->abs(I)I

    .line 162
    move-result p3

    .line 163
    .line 164
    .line 165
    invoke-direct {p0, p2, v0}, Lcom/google/zxing/datamatrix/detector/Detector;->transitionsBetween(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;

    .line 166
    move-result-object p2

    .line 167
    .line 168
    .line 169
    invoke-virtual {p2}, Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;->getTransitions()I

    .line 170
    move-result p2

    .line 171
    sub-int/2addr p6, p2

    .line 172
    .line 173
    .line 174
    invoke-static {p6}, Ljava/lang/Math;->abs(I)I

    .line 175
    move-result p2

    .line 176
    add-int/2addr p3, p2

    .line 177
    .line 178
    if-gt p1, p3, :cond_3

    .line 179
    :goto_0
    return-object v1

    .line 180
    :cond_3
    :goto_1
    return-object v0
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
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
.end method

.method private static distance(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/google/zxing/ResultPoint;->distance(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)F

    .line 4
    move-result p0

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lcom/google/zxing/common/detector/MathUtils;->round(F)I

    .line 8
    move-result p0

    .line 9
    return p0
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
.end method

.method private static increment(Ljava/util/Map;Lcom/google/zxing/ResultPoint;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/google/zxing/ResultPoint;",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/google/zxing/ResultPoint;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Ljava/lang/Integer;

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    goto :goto_0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 14
    move-result v0

    .line 15
    add-int/2addr v1, v0

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    return-void
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
.end method

.method private isValid(Lcom/google/zxing/ResultPoint;)Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    cmpl-float v0, v0, v1

    .line 8
    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 13
    move-result v0

    .line 14
    .line 15
    iget-object v2, p0, Lcom/google/zxing/datamatrix/detector/Detector;->image:Lcom/google/zxing/common/BitMatrix;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/google/zxing/common/BitMatrix;->getWidth()I

    .line 19
    move-result v2

    .line 20
    int-to-float v2, v2

    .line 21
    .line 22
    cmpg-float v0, v0, v2

    .line 23
    .line 24
    if-gez v0, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 28
    move-result v0

    .line 29
    .line 30
    cmpl-float v0, v0, v1

    .line 31
    .line 32
    if-lez v0, :cond_0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 36
    move-result p1

    .line 37
    .line 38
    iget-object v0, p0, Lcom/google/zxing/datamatrix/detector/Detector;->image:Lcom/google/zxing/common/BitMatrix;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/google/zxing/common/BitMatrix;->getHeight()I

    .line 42
    move-result v0

    .line 43
    int-to-float v0, v0

    .line 44
    .line 45
    cmpg-float p1, p1, v0

    .line 46
    .line 47
    if-gez p1, :cond_0

    .line 48
    const/4 p1, 0x1

    .line 49
    return p1

    .line 50
    :cond_0
    const/4 p1, 0x0

    .line 51
    return p1
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

.method private static sampleGrid(Lcom/google/zxing/common/BitMatrix;Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;II)Lcom/google/zxing/common/BitMatrix;
    .locals 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/google/zxing/common/GridSampler;->getInstance()Lcom/google/zxing/common/GridSampler;

    .line 4
    move-result-object v1

    .line 5
    .line 6
    move/from16 v3, p5

    .line 7
    int-to-float v0, v3

    .line 8
    .line 9
    const/high16 v2, 0x3f000000    # 0.5f

    .line 10
    .line 11
    sub-float v7, v0, v2

    .line 12
    .line 13
    move/from16 v4, p6

    .line 14
    int-to-float v0, v4

    .line 15
    .line 16
    sub-float v10, v0, v2

    .line 17
    .line 18
    .line 19
    invoke-virtual/range {p1 .. p1}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 20
    move-result v13

    .line 21
    .line 22
    .line 23
    invoke-virtual/range {p1 .. p1}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 24
    move-result v14

    .line 25
    .line 26
    .line 27
    invoke-virtual/range {p4 .. p4}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 28
    move-result v15

    .line 29
    .line 30
    .line 31
    invoke-virtual/range {p4 .. p4}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 32
    move-result v16

    .line 33
    .line 34
    .line 35
    invoke-virtual/range {p3 .. p3}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 36
    move-result v17

    .line 37
    .line 38
    .line 39
    invoke-virtual/range {p3 .. p3}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 40
    move-result v18

    .line 41
    .line 42
    .line 43
    invoke-virtual/range {p2 .. p2}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 44
    move-result v19

    .line 45
    .line 46
    .line 47
    invoke-virtual/range {p2 .. p2}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 48
    move-result v20

    .line 49
    .line 50
    const/high16 v5, 0x3f000000    # 0.5f

    .line 51
    .line 52
    const/high16 v6, 0x3f000000    # 0.5f

    .line 53
    .line 54
    const/high16 v8, 0x3f000000    # 0.5f

    .line 55
    .line 56
    const/high16 v11, 0x3f000000    # 0.5f

    .line 57
    move v9, v7

    .line 58
    move v12, v10

    .line 59
    .line 60
    move-object/from16 v2, p0

    .line 61
    .line 62
    .line 63
    invoke-virtual/range {v1 .. v20}, Lcom/google/zxing/common/GridSampler;->sampleGrid(Lcom/google/zxing/common/BitMatrix;IIFFFFFFFFFFFFFFFF)Lcom/google/zxing/common/BitMatrix;

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
.end method

.method private transitionsBetween(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;
    .locals 17

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 6
    move-result v1

    .line 7
    float-to-int v1, v1

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p1 .. p1}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 11
    move-result v2

    .line 12
    float-to-int v2, v2

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {p2 .. p2}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 16
    move-result v3

    .line 17
    float-to-int v3, v3

    .line 18
    .line 19
    .line 20
    invoke-virtual/range {p2 .. p2}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 21
    move-result v4

    .line 22
    float-to-int v4, v4

    .line 23
    .line 24
    sub-int v5, v4, v2

    .line 25
    .line 26
    .line 27
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    .line 28
    move-result v5

    .line 29
    .line 30
    sub-int v6, v3, v1

    .line 31
    .line 32
    .line 33
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    .line 34
    move-result v6

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x1

    .line 37
    .line 38
    if-le v5, v6, :cond_0

    .line 39
    move v5, v8

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v5, v7

    .line 42
    .line 43
    :goto_0
    if-eqz v5, :cond_1

    .line 44
    .line 45
    move/from16 v16, v2

    .line 46
    move v2, v1

    .line 47
    .line 48
    move/from16 v1, v16

    .line 49
    .line 50
    move/from16 v16, v4

    .line 51
    move v4, v3

    .line 52
    .line 53
    move/from16 v3, v16

    .line 54
    .line 55
    :cond_1
    sub-int v6, v3, v1

    .line 56
    .line 57
    .line 58
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    .line 59
    move-result v6

    .line 60
    .line 61
    sub-int v9, v4, v2

    .line 62
    .line 63
    .line 64
    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    .line 65
    move-result v9

    .line 66
    neg-int v10, v6

    .line 67
    .line 68
    div-int/lit8 v10, v10, 0x2

    .line 69
    const/4 v11, -0x1

    .line 70
    .line 71
    if-ge v2, v4, :cond_2

    .line 72
    move v12, v8

    .line 73
    goto :goto_1

    .line 74
    :cond_2
    move v12, v11

    .line 75
    .line 76
    :goto_1
    if-ge v1, v3, :cond_3

    .line 77
    goto :goto_2

    .line 78
    :cond_3
    move v8, v11

    .line 79
    .line 80
    :goto_2
    iget-object v11, v0, Lcom/google/zxing/datamatrix/detector/Detector;->image:Lcom/google/zxing/common/BitMatrix;

    .line 81
    .line 82
    if-eqz v5, :cond_4

    .line 83
    move v13, v2

    .line 84
    goto :goto_3

    .line 85
    :cond_4
    move v13, v1

    .line 86
    .line 87
    :goto_3
    if-eqz v5, :cond_5

    .line 88
    move v14, v1

    .line 89
    goto :goto_4

    .line 90
    :cond_5
    move v14, v2

    .line 91
    .line 92
    .line 93
    :goto_4
    invoke-virtual {v11, v13, v14}, Lcom/google/zxing/common/BitMatrix;->get(II)Z

    .line 94
    move-result v11

    .line 95
    .line 96
    :goto_5
    if-eq v1, v3, :cond_a

    .line 97
    .line 98
    iget-object v13, v0, Lcom/google/zxing/datamatrix/detector/Detector;->image:Lcom/google/zxing/common/BitMatrix;

    .line 99
    .line 100
    if-eqz v5, :cond_6

    .line 101
    move v14, v2

    .line 102
    goto :goto_6

    .line 103
    :cond_6
    move v14, v1

    .line 104
    .line 105
    :goto_6
    if-eqz v5, :cond_7

    .line 106
    move v15, v1

    .line 107
    goto :goto_7

    .line 108
    :cond_7
    move v15, v2

    .line 109
    .line 110
    .line 111
    :goto_7
    invoke-virtual {v13, v14, v15}, Lcom/google/zxing/common/BitMatrix;->get(II)Z

    .line 112
    move-result v13

    .line 113
    .line 114
    if-eq v13, v11, :cond_8

    .line 115
    .line 116
    add-int/lit8 v7, v7, 0x1

    .line 117
    move v11, v13

    .line 118
    :cond_8
    add-int/2addr v10, v9

    .line 119
    .line 120
    if-lez v10, :cond_9

    .line 121
    .line 122
    if-eq v2, v4, :cond_a

    .line 123
    add-int/2addr v2, v12

    .line 124
    sub-int/2addr v10, v6

    .line 125
    :cond_9
    add-int/2addr v1, v8

    .line 126
    goto :goto_5

    .line 127
    .line 128
    :cond_a
    new-instance v1, Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;

    .line 129
    const/4 v2, 0x0

    .line 130
    .line 131
    move-object/from16 v3, p1

    .line 132
    .line 133
    move-object/from16 v4, p2

    .line 134
    .line 135
    .line 136
    invoke-direct {v1, v3, v4, v7, v2}, Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;-><init>(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;ILcom/google/zxing/datamatrix/detector/Detector$1;)V

    .line 137
    return-object v1
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


# virtual methods
.method public detect()Lcom/google/zxing/common/DetectorResult;
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/google/zxing/datamatrix/detector/Detector;->rectangleDetector:Lcom/google/zxing/common/detector/WhiteRectangleDetector;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/google/zxing/common/detector/WhiteRectangleDetector;->detect()[Lcom/google/zxing/ResultPoint;

    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    aget-object v3, v1, v2

    .line 12
    const/4 v7, 0x1

    .line 13
    .line 14
    aget-object v4, v1, v7

    .line 15
    const/4 v6, 0x2

    .line 16
    .line 17
    aget-object v5, v1, v6

    .line 18
    const/4 v8, 0x3

    .line 19
    .line 20
    aget-object v1, v1, v8

    .line 21
    .line 22
    new-instance v8, Ljava/util/ArrayList;

    .line 23
    const/4 v9, 0x4

    .line 24
    .line 25
    .line 26
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v3, v4}, Lcom/google/zxing/datamatrix/detector/Detector;->transitionsBetween(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;

    .line 30
    move-result-object v9

    .line 31
    .line 32
    .line 33
    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, v3, v5}, Lcom/google/zxing/datamatrix/detector/Detector;->transitionsBetween(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;

    .line 37
    move-result-object v9

    .line 38
    .line 39
    .line 40
    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    invoke-direct {v0, v4, v1}, Lcom/google/zxing/datamatrix/detector/Detector;->transitionsBetween(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;

    .line 44
    move-result-object v9

    .line 45
    .line 46
    .line 47
    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    invoke-direct {v0, v5, v1}, Lcom/google/zxing/datamatrix/detector/Detector;->transitionsBetween(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;

    .line 51
    move-result-object v9

    .line 52
    .line 53
    .line 54
    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    new-instance v9, Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitionsComparator;

    .line 57
    const/4 v10, 0x0

    .line 58
    .line 59
    .line 60
    invoke-direct {v9, v10}, Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitionsComparator;-><init>(Lcom/google/zxing/datamatrix/detector/Detector$1;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v8, v9}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    move-result-object v9

    .line 68
    .line 69
    check-cast v9, Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;

    .line 70
    .line 71
    .line 72
    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    move-result-object v8

    .line 74
    .line 75
    check-cast v8, Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;

    .line 76
    .line 77
    new-instance v11, Ljava/util/HashMap;

    .line 78
    .line 79
    .line 80
    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v9}, Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;->getFrom()Lcom/google/zxing/ResultPoint;

    .line 84
    move-result-object v12

    .line 85
    .line 86
    .line 87
    invoke-static {v11, v12}, Lcom/google/zxing/datamatrix/detector/Detector;->increment(Ljava/util/Map;Lcom/google/zxing/ResultPoint;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v9}, Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;->getTo()Lcom/google/zxing/ResultPoint;

    .line 91
    move-result-object v9

    .line 92
    .line 93
    .line 94
    invoke-static {v11, v9}, Lcom/google/zxing/datamatrix/detector/Detector;->increment(Ljava/util/Map;Lcom/google/zxing/ResultPoint;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v8}, Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;->getFrom()Lcom/google/zxing/ResultPoint;

    .line 98
    move-result-object v9

    .line 99
    .line 100
    .line 101
    invoke-static {v11, v9}, Lcom/google/zxing/datamatrix/detector/Detector;->increment(Ljava/util/Map;Lcom/google/zxing/ResultPoint;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v8}, Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;->getTo()Lcom/google/zxing/ResultPoint;

    .line 105
    move-result-object v8

    .line 106
    .line 107
    .line 108
    invoke-static {v11, v8}, Lcom/google/zxing/datamatrix/detector/Detector;->increment(Ljava/util/Map;Lcom/google/zxing/ResultPoint;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v11}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 112
    move-result-object v8

    .line 113
    .line 114
    .line 115
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 116
    move-result-object v8

    .line 117
    move-object v9, v10

    .line 118
    move-object v12, v9

    .line 119
    .line 120
    .line 121
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    move-result v13

    .line 123
    .line 124
    if-eqz v13, :cond_2

    .line 125
    .line 126
    .line 127
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    move-result-object v13

    .line 129
    .line 130
    check-cast v13, Ljava/util/Map$Entry;

    .line 131
    .line 132
    .line 133
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 134
    move-result-object v14

    .line 135
    .line 136
    check-cast v14, Lcom/google/zxing/ResultPoint;

    .line 137
    .line 138
    .line 139
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 140
    move-result-object v13

    .line 141
    .line 142
    check-cast v13, Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 146
    move-result v13

    .line 147
    .line 148
    if-ne v13, v6, :cond_0

    .line 149
    move-object v9, v14

    .line 150
    goto :goto_0

    .line 151
    .line 152
    :cond_0
    if-nez v10, :cond_1

    .line 153
    move-object v10, v14

    .line 154
    goto :goto_0

    .line 155
    :cond_1
    move-object v12, v14

    .line 156
    goto :goto_0

    .line 157
    .line 158
    :cond_2
    if-eqz v10, :cond_f

    .line 159
    .line 160
    if-eqz v9, :cond_f

    .line 161
    .line 162
    if-eqz v12, :cond_f

    .line 163
    .line 164
    .line 165
    filled-new-array {v10, v9, v12}, [Lcom/google/zxing/ResultPoint;

    .line 166
    move-result-object v8

    .line 167
    .line 168
    .line 169
    invoke-static {v8}, Lcom/google/zxing/ResultPoint;->orderBestPatterns([Lcom/google/zxing/ResultPoint;)V

    .line 170
    .line 171
    aget-object v15, v8, v2

    .line 172
    .line 173
    aget-object v14, v8, v7

    .line 174
    .line 175
    aget-object v13, v8, v6

    .line 176
    .line 177
    .line 178
    invoke-interface {v11, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 179
    move-result v2

    .line 180
    .line 181
    if-nez v2, :cond_3

    .line 182
    move-object v4, v3

    .line 183
    goto :goto_1

    .line 184
    .line 185
    .line 186
    :cond_3
    invoke-interface {v11, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 187
    move-result v2

    .line 188
    .line 189
    if-nez v2, :cond_4

    .line 190
    goto :goto_1

    .line 191
    .line 192
    .line 193
    :cond_4
    invoke-interface {v11, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 194
    move-result v2

    .line 195
    .line 196
    if-nez v2, :cond_5

    .line 197
    move-object v4, v5

    .line 198
    goto :goto_1

    .line 199
    :cond_5
    move-object v4, v1

    .line 200
    .line 201
    .line 202
    :goto_1
    invoke-direct {v0, v13, v4}, Lcom/google/zxing/datamatrix/detector/Detector;->transitionsBetween(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;

    .line 203
    move-result-object v1

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1}, Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;->getTransitions()I

    .line 207
    move-result v1

    .line 208
    .line 209
    .line 210
    invoke-direct {v0, v15, v4}, Lcom/google/zxing/datamatrix/detector/Detector;->transitionsBetween(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;

    .line 211
    move-result-object v2

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;->getTransitions()I

    .line 215
    move-result v2

    .line 216
    .line 217
    and-int/lit8 v3, v1, 0x1

    .line 218
    .line 219
    if-ne v3, v7, :cond_6

    .line 220
    .line 221
    add-int/lit8 v1, v1, 0x1

    .line 222
    .line 223
    :cond_6
    add-int/lit8 v5, v1, 0x2

    .line 224
    .line 225
    and-int/lit8 v1, v2, 0x1

    .line 226
    .line 227
    if-ne v1, v7, :cond_7

    .line 228
    .line 229
    add-int/lit8 v2, v2, 0x1

    .line 230
    :cond_7
    add-int/2addr v2, v6

    .line 231
    .line 232
    mul-int/lit8 v1, v5, 0x4

    .line 233
    .line 234
    mul-int/lit8 v3, v2, 0x7

    .line 235
    .line 236
    if-ge v1, v3, :cond_8

    .line 237
    .line 238
    mul-int/lit8 v1, v2, 0x4

    .line 239
    .line 240
    mul-int/lit8 v3, v5, 0x7

    .line 241
    .line 242
    if-lt v1, v3, :cond_9

    .line 243
    :cond_8
    move v6, v2

    .line 244
    move-object v3, v13

    .line 245
    move-object v1, v14

    .line 246
    move-object v2, v15

    .line 247
    goto :goto_3

    .line 248
    .line 249
    .line 250
    :cond_9
    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    .line 251
    move-result v5

    .line 252
    move-object v3, v13

    .line 253
    move-object v1, v14

    .line 254
    move-object v2, v15

    .line 255
    .line 256
    .line 257
    invoke-direct/range {v0 .. v5}, Lcom/google/zxing/datamatrix/detector/Detector;->correctTopRight(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;I)Lcom/google/zxing/ResultPoint;

    .line 258
    move-result-object v5

    .line 259
    .line 260
    if-nez v5, :cond_a

    .line 261
    goto :goto_2

    .line 262
    :cond_a
    move-object v4, v5

    .line 263
    .line 264
    .line 265
    :goto_2
    invoke-direct {v0, v3, v4}, Lcom/google/zxing/datamatrix/detector/Detector;->transitionsBetween(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;

    .line 266
    move-result-object v2

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2}, Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;->getTransitions()I

    .line 270
    move-result v2

    .line 271
    .line 272
    .line 273
    invoke-direct {v0, v15, v4}, Lcom/google/zxing/datamatrix/detector/Detector;->transitionsBetween(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;

    .line 274
    move-result-object v5

    .line 275
    .line 276
    .line 277
    invoke-virtual {v5}, Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;->getTransitions()I

    .line 278
    move-result v5

    .line 279
    .line 280
    .line 281
    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    .line 282
    move-result v2

    .line 283
    .line 284
    add-int/lit8 v5, v2, 0x1

    .line 285
    .line 286
    and-int/lit8 v8, v5, 0x1

    .line 287
    .line 288
    if-ne v8, v7, :cond_b

    .line 289
    .line 290
    add-int/lit8 v5, v2, 0x2

    .line 291
    .line 292
    :cond_b
    move/from16 v17, v5

    .line 293
    .line 294
    iget-object v12, v0, Lcom/google/zxing/datamatrix/detector/Detector;->image:Lcom/google/zxing/common/BitMatrix;

    .line 295
    .line 296
    move/from16 v18, v17

    .line 297
    move-object v14, v1

    .line 298
    move-object v13, v3

    .line 299
    .line 300
    move-object/from16 v16, v4

    .line 301
    .line 302
    .line 303
    invoke-static/range {v12 .. v18}, Lcom/google/zxing/datamatrix/detector/Detector;->sampleGrid(Lcom/google/zxing/common/BitMatrix;Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;II)Lcom/google/zxing/common/BitMatrix;

    .line 304
    move-result-object v1

    .line 305
    goto :goto_5

    .line 306
    .line 307
    .line 308
    :goto_3
    invoke-direct/range {v0 .. v6}, Lcom/google/zxing/datamatrix/detector/Detector;->correctTopRightRectangular(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;II)Lcom/google/zxing/ResultPoint;

    .line 309
    move-result-object v5

    .line 310
    move-object v15, v2

    .line 311
    .line 312
    if-nez v5, :cond_c

    .line 313
    goto :goto_4

    .line 314
    :cond_c
    move-object v4, v5

    .line 315
    .line 316
    .line 317
    :goto_4
    invoke-direct {v0, v3, v4}, Lcom/google/zxing/datamatrix/detector/Detector;->transitionsBetween(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;

    .line 318
    move-result-object v2

    .line 319
    .line 320
    .line 321
    invoke-virtual {v2}, Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;->getTransitions()I

    .line 322
    move-result v2

    .line 323
    .line 324
    .line 325
    invoke-direct {v0, v15, v4}, Lcom/google/zxing/datamatrix/detector/Detector;->transitionsBetween(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;

    .line 326
    move-result-object v5

    .line 327
    .line 328
    .line 329
    invoke-virtual {v5}, Lcom/google/zxing/datamatrix/detector/Detector$ResultPointsAndTransitions;->getTransitions()I

    .line 330
    move-result v5

    .line 331
    .line 332
    and-int/lit8 v6, v2, 0x1

    .line 333
    .line 334
    if-ne v6, v7, :cond_d

    .line 335
    .line 336
    add-int/lit8 v2, v2, 0x1

    .line 337
    .line 338
    :cond_d
    move/from16 v17, v2

    .line 339
    .line 340
    and-int/lit8 v2, v5, 0x1

    .line 341
    .line 342
    if-ne v2, v7, :cond_e

    .line 343
    .line 344
    add-int/lit8 v5, v5, 0x1

    .line 345
    .line 346
    :cond_e
    move/from16 v18, v5

    .line 347
    .line 348
    iget-object v12, v0, Lcom/google/zxing/datamatrix/detector/Detector;->image:Lcom/google/zxing/common/BitMatrix;

    .line 349
    move-object v14, v1

    .line 350
    move-object v13, v3

    .line 351
    .line 352
    move-object/from16 v16, v4

    .line 353
    .line 354
    .line 355
    invoke-static/range {v12 .. v18}, Lcom/google/zxing/datamatrix/detector/Detector;->sampleGrid(Lcom/google/zxing/common/BitMatrix;Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;II)Lcom/google/zxing/common/BitMatrix;

    .line 356
    move-result-object v1

    .line 357
    .line 358
    :goto_5
    new-instance v2, Lcom/google/zxing/common/DetectorResult;

    .line 359
    .line 360
    .line 361
    filled-new-array {v3, v14, v15, v4}, [Lcom/google/zxing/ResultPoint;

    .line 362
    move-result-object v3

    .line 363
    .line 364
    .line 365
    invoke-direct {v2, v1, v3}, Lcom/google/zxing/common/DetectorResult;-><init>(Lcom/google/zxing/common/BitMatrix;[Lcom/google/zxing/ResultPoint;)V

    .line 366
    return-object v2

    .line 367
    .line 368
    .line 369
    :cond_f
    invoke-static {}, Lcom/google/zxing/NotFoundException;->getNotFoundInstance()Lcom/google/zxing/NotFoundException;

    .line 370
    move-result-object v1

    .line 371
    throw v1
.end method
