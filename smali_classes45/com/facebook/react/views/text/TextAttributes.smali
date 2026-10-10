.class public Lcom/facebook/react/views/text/TextAttributes;
.super Ljava/lang/Object;
.source "TextAttributes.java"


# static fields
.field public static final DEFAULT_MAX_FONT_SIZE_MULTIPLIER:F


# instance fields
.field private mAllowFontScaling:Z

.field private mFontSize:F

.field private mHeightOfTallestInlineViewOrImage:F

.field private mLetterSpacing:F

.field private mLineHeight:F

.field private mMaxFontSizeMultiplier:F

.field private mTextTransform:Lcom/facebook/react/views/text/TextTransform;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mAllowFontScaling:Z

    .line 7
    .line 8
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 9
    .line 10
    iput v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mFontSize:F

    .line 11
    .line 12
    iput v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mLineHeight:F

    .line 13
    .line 14
    iput v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mLetterSpacing:F

    .line 15
    .line 16
    iput v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mMaxFontSizeMultiplier:F

    .line 17
    .line 18
    iput v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mHeightOfTallestInlineViewOrImage:F

    .line 19
    .line 20
    sget-object v0, Lcom/facebook/react/views/text/TextTransform;->UNSET:Lcom/facebook/react/views/text/TextTransform;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mTextTransform:Lcom/facebook/react/views/text/TextTransform;

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
.end method


# virtual methods
.method public applyChild(Lcom/facebook/react/views/text/TextAttributes;)Lcom/facebook/react/views/text/TextAttributes;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/views/text/TextAttributes;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/views/text/TextAttributes;-><init>()V

    .line 6
    .line 7
    iget-boolean v1, p0, Lcom/facebook/react/views/text/TextAttributes;->mAllowFontScaling:Z

    .line 8
    .line 9
    iput-boolean v1, v0, Lcom/facebook/react/views/text/TextAttributes;->mAllowFontScaling:Z

    .line 10
    .line 11
    iget v1, p1, Lcom/facebook/react/views/text/TextAttributes;->mFontSize:F

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    iget v1, p1, Lcom/facebook/react/views/text/TextAttributes;->mFontSize:F

    .line 20
    goto :goto_0

    .line 21
    .line 22
    :cond_0
    iget v1, p0, Lcom/facebook/react/views/text/TextAttributes;->mFontSize:F

    .line 23
    .line 24
    :goto_0
    iput v1, v0, Lcom/facebook/react/views/text/TextAttributes;->mFontSize:F

    .line 25
    .line 26
    iget v1, p1, Lcom/facebook/react/views/text/TextAttributes;->mLineHeight:F

    .line 27
    .line 28
    .line 29
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 30
    move-result v1

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    iget v1, p1, Lcom/facebook/react/views/text/TextAttributes;->mLineHeight:F

    .line 35
    goto :goto_1

    .line 36
    .line 37
    :cond_1
    iget v1, p0, Lcom/facebook/react/views/text/TextAttributes;->mLineHeight:F

    .line 38
    .line 39
    :goto_1
    iput v1, v0, Lcom/facebook/react/views/text/TextAttributes;->mLineHeight:F

    .line 40
    .line 41
    iget v1, p1, Lcom/facebook/react/views/text/TextAttributes;->mLetterSpacing:F

    .line 42
    .line 43
    .line 44
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 45
    move-result v1

    .line 46
    .line 47
    if-nez v1, :cond_2

    .line 48
    .line 49
    iget v1, p1, Lcom/facebook/react/views/text/TextAttributes;->mLetterSpacing:F

    .line 50
    goto :goto_2

    .line 51
    .line 52
    :cond_2
    iget v1, p0, Lcom/facebook/react/views/text/TextAttributes;->mLetterSpacing:F

    .line 53
    .line 54
    :goto_2
    iput v1, v0, Lcom/facebook/react/views/text/TextAttributes;->mLetterSpacing:F

    .line 55
    .line 56
    iget v1, p1, Lcom/facebook/react/views/text/TextAttributes;->mMaxFontSizeMultiplier:F

    .line 57
    .line 58
    .line 59
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 60
    move-result v1

    .line 61
    .line 62
    if-nez v1, :cond_3

    .line 63
    .line 64
    iget v1, p1, Lcom/facebook/react/views/text/TextAttributes;->mMaxFontSizeMultiplier:F

    .line 65
    goto :goto_3

    .line 66
    .line 67
    :cond_3
    iget v1, p0, Lcom/facebook/react/views/text/TextAttributes;->mMaxFontSizeMultiplier:F

    .line 68
    .line 69
    :goto_3
    iput v1, v0, Lcom/facebook/react/views/text/TextAttributes;->mMaxFontSizeMultiplier:F

    .line 70
    .line 71
    iget v1, p1, Lcom/facebook/react/views/text/TextAttributes;->mHeightOfTallestInlineViewOrImage:F

    .line 72
    .line 73
    .line 74
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 75
    move-result v1

    .line 76
    .line 77
    if-nez v1, :cond_4

    .line 78
    .line 79
    iget v1, p1, Lcom/facebook/react/views/text/TextAttributes;->mHeightOfTallestInlineViewOrImage:F

    .line 80
    goto :goto_4

    .line 81
    .line 82
    :cond_4
    iget v1, p0, Lcom/facebook/react/views/text/TextAttributes;->mHeightOfTallestInlineViewOrImage:F

    .line 83
    .line 84
    :goto_4
    iput v1, v0, Lcom/facebook/react/views/text/TextAttributes;->mHeightOfTallestInlineViewOrImage:F

    .line 85
    .line 86
    iget-object p1, p1, Lcom/facebook/react/views/text/TextAttributes;->mTextTransform:Lcom/facebook/react/views/text/TextTransform;

    .line 87
    .line 88
    sget-object v1, Lcom/facebook/react/views/text/TextTransform;->UNSET:Lcom/facebook/react/views/text/TextTransform;

    .line 89
    .line 90
    if-eq p1, v1, :cond_5

    .line 91
    goto :goto_5

    .line 92
    .line 93
    :cond_5
    iget-object p1, p0, Lcom/facebook/react/views/text/TextAttributes;->mTextTransform:Lcom/facebook/react/views/text/TextTransform;

    .line 94
    .line 95
    :goto_5
    iput-object p1, v0, Lcom/facebook/react/views/text/TextAttributes;->mTextTransform:Lcom/facebook/react/views/text/TextTransform;

    .line 96
    return-object v0
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
.end method

.method public getAllowFontScaling()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mAllowFontScaling:Z

    .line 3
    return v0
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

.method public getEffectiveFontSize()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mFontSize:F

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mFontSize:F

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    const/high16 v0, 0x41600000    # 14.0f

    .line 14
    .line 15
    :goto_0
    iget-boolean v1, p0, Lcom/facebook/react/views/text/TextAttributes;->mAllowFontScaling:Z

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveMaxFontSizeMultiplier()F

    .line 21
    move-result v1

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromSP(FF)F

    .line 25
    move-result v0

    .line 26
    float-to-double v0, v0

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 30
    move-result-wide v0

    .line 31
    :goto_1
    double-to-int v0, v0

    .line 32
    return v0

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 36
    move-result v0

    .line 37
    float-to-double v0, v0

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 41
    move-result-wide v0

    .line 42
    goto :goto_1
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
.end method

.method public getEffectiveLetterSpacing()F
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mLetterSpacing:F

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 11
    return v0

    .line 12
    .line 13
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mAllowFontScaling:Z

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mLetterSpacing:F

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveMaxFontSizeMultiplier()F

    .line 21
    move-result v1

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromSP(FF)F

    .line 25
    move-result v0

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_1
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mLetterSpacing:F

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 32
    move-result v0

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveFontSize()I

    .line 36
    move-result v1

    .line 37
    int-to-float v1, v1

    .line 38
    div-float/2addr v0, v1

    .line 39
    return v0
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
.end method

.method public getEffectiveLineHeight()F
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mLineHeight:F

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 11
    return v0

    .line 12
    .line 13
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mAllowFontScaling:Z

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mLineHeight:F

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveMaxFontSizeMultiplier()F

    .line 21
    move-result v1

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromSP(FF)F

    .line 25
    move-result v0

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_1
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mLineHeight:F

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 32
    move-result v0

    .line 33
    .line 34
    :goto_0
    iget v1, p0, Lcom/facebook/react/views/text/TextAttributes;->mHeightOfTallestInlineViewOrImage:F

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 38
    move-result v1

    .line 39
    .line 40
    if-nez v1, :cond_2

    .line 41
    .line 42
    iget v1, p0, Lcom/facebook/react/views/text/TextAttributes;->mHeightOfTallestInlineViewOrImage:F

    .line 43
    .line 44
    cmpl-float v2, v1, v0

    .line 45
    .line 46
    if-lez v2, :cond_2

    .line 47
    return v1

    .line 48
    :cond_2
    return v0
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
.end method

.method public getEffectiveMaxFontSizeMultiplier()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mMaxFontSizeMultiplier:F

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mMaxFontSizeMultiplier:F

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getFontSize()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mFontSize:F

    .line 3
    return v0
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

.method public getHeightOfTallestInlineViewOrImage()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mHeightOfTallestInlineViewOrImage:F

    .line 3
    return v0
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

.method public getLetterSpacing()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mLetterSpacing:F

    .line 3
    return v0
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

.method public getLineHeight()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mLineHeight:F

    .line 3
    return v0
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

.method public getMaxFontSizeMultiplier()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mMaxFontSizeMultiplier:F

    .line 3
    return v0
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

.method public getTextTransform()Lcom/facebook/react/views/text/TextTransform;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/views/text/TextAttributes;->mTextTransform:Lcom/facebook/react/views/text/TextTransform;

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

.method public setAllowFontScaling(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/facebook/react/views/text/TextAttributes;->mAllowFontScaling:Z

    .line 3
    return-void
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
.end method

.method public setFontSize(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/facebook/react/views/text/TextAttributes;->mFontSize:F

    .line 3
    return-void
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
.end method

.method public setHeightOfTallestInlineViewOrImage(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/facebook/react/views/text/TextAttributes;->mHeightOfTallestInlineViewOrImage:F

    .line 3
    return-void
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
.end method

.method public setLetterSpacing(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/facebook/react/views/text/TextAttributes;->mLetterSpacing:F

    .line 3
    return-void
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
.end method

.method public setLineHeight(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/facebook/react/views/text/TextAttributes;->mLineHeight:F

    .line 3
    return-void
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
.end method

.method public setMaxFontSizeMultiplier(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    cmpg-float v0, p1, v0

    .line 10
    .line 11
    if-gez v0, :cond_0

    .line 12
    .line 13
    const-string p1, "ReactNative"

    .line 14
    .line 15
    const-string v0, "maxFontSizeMultiplier must be NaN, 0, or >= 1"

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0}, Lx3/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 21
    .line 22
    iput p1, p0, Lcom/facebook/react/views/text/TextAttributes;->mMaxFontSizeMultiplier:F

    .line 23
    return-void

    .line 24
    .line 25
    :cond_0
    iput p1, p0, Lcom/facebook/react/views/text/TextAttributes;->mMaxFontSizeMultiplier:F

    .line 26
    return-void
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
.end method

.method public setTextTransform(Lcom/facebook/react/views/text/TextTransform;)V
    .locals 0
    .param p1    # Lcom/facebook/react/views/text/TextTransform;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/views/text/TextAttributes;->mTextTransform:Lcom/facebook/react/views/text/TextTransform;

    .line 3
    return-void
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
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "TextAttributes {\n  getAllowFontScaling(): "

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getAllowFontScaling()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v1, "\n  getFontSize(): "

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getFontSize()F

    .line 26
    move-result v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v1, "\n  getEffectiveFontSize(): "

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveFontSize()I

    .line 38
    move-result v1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v1, "\n  getHeightOfTallestInlineViewOrImage(): "

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getHeightOfTallestInlineViewOrImage()F

    .line 50
    move-result v1

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v1, "\n  getLetterSpacing(): "

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getLetterSpacing()F

    .line 62
    move-result v1

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v1, "\n  getEffectiveLetterSpacing(): "

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveLetterSpacing()F

    .line 74
    move-result v1

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    const-string v1, "\n  getLineHeight(): "

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getLineHeight()F

    .line 86
    move-result v1

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const-string v1, "\n  getEffectiveLineHeight(): "

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveLineHeight()F

    .line 98
    move-result v1

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v1, "\n  getTextTransform(): "

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getTextTransform()Lcom/facebook/react/views/text/TextTransform;

    .line 110
    move-result-object v1

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    const-string v1, "\n  getMaxFontSizeMultiplier(): "

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getMaxFontSizeMultiplier()F

    .line 122
    move-result v1

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    const-string v1, "\n  getEffectiveMaxFontSizeMultiplier(): "

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveMaxFontSizeMultiplier()F

    .line 134
    move-result v1

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    const-string v1, "\n}"

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    move-result-object v0

    .line 147
    return-object v0
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
.end method
