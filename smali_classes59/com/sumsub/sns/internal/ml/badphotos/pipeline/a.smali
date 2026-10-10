.class public final Lcom/sumsub/sns/internal/ml/badphotos/pipeline/a;
.super Lcom/sumsub/sns/internal/ml/core/pipeline/core/a;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/internal/ml/core/pipeline/core/a;-><init>()V

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
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/ml/core/pipeline/a;

    .line 3
    .line 4
    iget v0, p1, Lcom/sumsub/sns/internal/ml/core/pipeline/a;->a:I

    .line 5
    .line 6
    iget v1, p1, Lcom/sumsub/sns/internal/ml/core/pipeline/a;->b:I

    .line 7
    .line 8
    iget-object p1, p1, Lcom/sumsub/sns/internal/ml/core/pipeline/a;->c:[I

    .line 9
    .line 10
    mul-int v2, v0, v1

    .line 11
    const/4 v3, 0x3

    .line 12
    mul-int/2addr v2, v3

    .line 13
    .line 14
    new-array v2, v2, [F

    .line 15
    array-length v4, p1

    .line 16
    const/4 v5, 0x0

    .line 17
    move v6, v5

    .line 18
    move v7, v6

    .line 19
    .line 20
    :goto_0
    const/high16 v8, 0x437f0000    # 255.0f

    .line 21
    .line 22
    if-ge v6, v4, :cond_0

    .line 23
    .line 24
    aget v9, p1, v6

    .line 25
    .line 26
    add-int/lit8 v10, v7, 0x1

    .line 27
    .line 28
    shr-int/lit8 v9, v9, 0x10

    .line 29
    .line 30
    and-int/lit16 v9, v9, 0xff

    .line 31
    int-to-float v9, v9

    .line 32
    div-float/2addr v9, v8

    .line 33
    .line 34
    aput v9, v2, v7

    .line 35
    .line 36
    add-int/lit8 v6, v6, 0x1

    .line 37
    move v7, v10

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    array-length v4, p1

    .line 40
    move v6, v5

    .line 41
    .line 42
    :goto_1
    if-ge v6, v4, :cond_1

    .line 43
    .line 44
    aget v9, p1, v6

    .line 45
    .line 46
    add-int/lit8 v10, v7, 0x1

    .line 47
    .line 48
    shr-int/lit8 v9, v9, 0x8

    .line 49
    .line 50
    and-int/lit16 v9, v9, 0xff

    .line 51
    int-to-float v9, v9

    .line 52
    div-float/2addr v9, v8

    .line 53
    .line 54
    aput v9, v2, v7

    .line 55
    .line 56
    add-int/lit8 v6, v6, 0x1

    .line 57
    move v7, v10

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    array-length v4, p1

    .line 60
    .line 61
    :goto_2
    if-ge v5, v4, :cond_2

    .line 62
    .line 63
    aget v6, p1, v5

    .line 64
    .line 65
    add-int/lit8 v9, v7, 0x1

    .line 66
    .line 67
    and-int/lit16 v6, v6, 0xff

    .line 68
    int-to-float v6, v6

    .line 69
    div-float/2addr v6, v8

    .line 70
    .line 71
    aput v6, v2, v7

    .line 72
    .line 73
    add-int/lit8 v5, v5, 0x1

    .line 74
    move v7, v9

    .line 75
    goto :goto_2

    .line 76
    :cond_2
    const/4 p1, 0x1

    .line 77
    .line 78
    .line 79
    filled-new-array {p1, v3, v1, v0}, [I

    .line 80
    move-result-object p1

    .line 81
    .line 82
    new-instance v0, Lcom/sumsub/sns/internal/ml/core/buffer/a;

    .line 83
    .line 84
    .line 85
    invoke-direct {v0, v2, p1}, Lcom/sumsub/sns/internal/ml/core/buffer/a;-><init>([F[I)V

    .line 86
    return-object v0
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
.end method
