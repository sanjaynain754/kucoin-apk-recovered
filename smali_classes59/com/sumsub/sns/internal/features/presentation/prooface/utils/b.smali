.class public abstract Lcom/sumsub/sns/internal/features/presentation/prooface/utils/b;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static a(Landroid/graphics/Bitmap;)Lkotlin/Pair;
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    .line 5
    :try_start_0
    invoke-static {p0, v0, v0, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v1, v1}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 10
    move-result p0

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 14
    move-result v0

    .line 15
    int-to-double v2, v0

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    const-wide v4, 0x406fe00000000000L    # 255.0

    .line 21
    div-double/2addr v2, v4

    .line 22
    .line 23
    .line 24
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 25
    move-result v0

    .line 26
    int-to-double v6, v0

    .line 27
    div-double/2addr v6, v4

    .line 28
    .line 29
    .line 30
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 31
    move-result v0

    .line 32
    int-to-double v8, v0

    .line 33
    div-double/2addr v8, v4

    .line 34
    .line 35
    new-instance v0, Lkotlin/Pair;

    .line 36
    .line 37
    .line 38
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    move-result-object p0

    .line 40
    .line 41
    const/16 v4, 0xc8

    .line 42
    int-to-float v4, v4

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    const-wide v10, 0x3fcb367a0f9096bcL    # 0.2126

    .line 48
    mul-double/2addr v2, v10

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    const-wide v10, 0x3fe6e2eb1c432ca5L    # 0.7152

    .line 54
    mul-double/2addr v6, v10

    .line 55
    add-double/2addr v6, v2

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    const-wide v2, 0x3fb27bb2fec56d5dL    # 0.0722

    .line 61
    mul-double/2addr v8, v2

    .line 62
    add-double/2addr v8, v6

    .line 63
    double-to-float v2, v8

    .line 64
    mul-float/2addr v4, v2

    .line 65
    .line 66
    .line 67
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 68
    move-result-object v2

    .line 69
    .line 70
    .line 71
    invoke-direct {v0, p0, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    return-object v0

    .line 73
    .line 74
    :catch_0
    new-instance p0, Lkotlin/Pair;

    .line 75
    .line 76
    .line 77
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    move-result-object v0

    .line 79
    const/4 v1, 0x0

    .line 80
    .line 81
    .line 82
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 83
    move-result-object v1

    .line 84
    .line 85
    .line 86
    invoke-direct {p0, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    return-object p0
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
.end method
