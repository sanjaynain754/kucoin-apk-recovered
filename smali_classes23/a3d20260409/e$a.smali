.class public La3d20260409/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La3d20260409/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public static a(Lorg/json/JSONObject;)La3d20260409/e;
    .locals 8

    .line 1
    .line 2
    :try_start_0
    new-instance v0, La3d20260409/e;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, La3d20260409/e;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v1, "leftEyeOpenProb"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    .line 12
    move-result-wide v1

    .line 13
    double-to-float v1, v1

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, La3d20260409/e;->d(La3d20260409/e;F)F

    .line 17
    .line 18
    .line 19
    const-string/jumbo v1, "rightEyeOpenProb"

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    .line 23
    move-result-wide v1

    .line 24
    double-to-float v1, v1

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1}, La3d20260409/e;->a(La3d20260409/e;F)F

    .line 28
    .line 29
    .line 30
    const-string/jumbo v1, "mouthOpenProb"

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    .line 34
    move-result-wide v1

    .line 35
    double-to-float v1, v1

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1}, La3d20260409/e;->f(La3d20260409/e;F)F

    .line 39
    .line 40
    const-string v1, "faceQuality"

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    .line 44
    move-result-wide v1

    .line 45
    double-to-float v1, v1

    .line 46
    .line 47
    iput v1, v0, La3d20260409/e;->e:F

    .line 48
    .line 49
    .line 50
    const-string/jumbo v1, "yaw"

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    .line 54
    move-result-wide v1

    .line 55
    double-to-float v1, v1

    .line 56
    .line 57
    .line 58
    invoke-static {v0, v1}, La3d20260409/e;->g(La3d20260409/e;F)F

    .line 59
    .line 60
    .line 61
    const-string/jumbo v1, "pitch"

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    .line 65
    move-result-wide v1

    .line 66
    double-to-float v1, v1

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v1}, La3d20260409/e;->h(La3d20260409/e;F)F

    .line 70
    .line 71
    .line 72
    const-string/jumbo v1, "roll"

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    .line 76
    move-result-wide v1

    .line 77
    double-to-float v1, v1

    .line 78
    .line 79
    .line 80
    invoke-static {v0, v1}, La3d20260409/e;->c(La3d20260409/e;F)F

    .line 81
    .line 82
    const-string v1, "faceBoundingbox"

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 86
    move-result-object v1

    .line 87
    .line 88
    iget-object v2, v0, La3d20260409/e;->a:Landroid/graphics/RectF;

    .line 89
    const/4 v3, 0x0

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->optDouble(I)D

    .line 93
    move-result-wide v4

    .line 94
    double-to-float v4, v4

    .line 95
    .line 96
    iput v4, v2, Landroid/graphics/RectF;->left:F

    .line 97
    .line 98
    iget-object v2, v0, La3d20260409/e;->a:Landroid/graphics/RectF;

    .line 99
    const/4 v4, 0x1

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->optDouble(I)D

    .line 103
    move-result-wide v4

    .line 104
    double-to-float v4, v4

    .line 105
    .line 106
    iput v4, v2, Landroid/graphics/RectF;->top:F

    .line 107
    .line 108
    iget-object v2, v0, La3d20260409/e;->a:Landroid/graphics/RectF;

    .line 109
    const/4 v4, 0x2

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->optDouble(I)D

    .line 113
    move-result-wide v5

    .line 114
    double-to-float v5, v5

    .line 115
    .line 116
    iput v5, v2, Landroid/graphics/RectF;->right:F

    .line 117
    .line 118
    iget-object v2, v0, La3d20260409/e;->a:Landroid/graphics/RectF;

    .line 119
    const/4 v5, 0x3

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v5}, Lorg/json/JSONArray;->optDouble(I)D

    .line 123
    move-result-wide v5

    .line 124
    double-to-float v1, v5

    .line 125
    .line 126
    iput v1, v2, Landroid/graphics/RectF;->bottom:F

    .line 127
    .line 128
    .line 129
    const-string/jumbo v1, "leftEyeRect"

    .line 130
    .line 131
    .line 132
    invoke-static {p0, v1}, La3d20260409/e;->e(Lorg/json/JSONObject;Ljava/lang/String;)Landroid/graphics/RectF;

    .line 133
    move-result-object v1

    .line 134
    .line 135
    iput-object v1, v0, La3d20260409/e;->j:Landroid/graphics/RectF;

    .line 136
    .line 137
    .line 138
    const-string/jumbo v1, "rightEyeRect"

    .line 139
    .line 140
    .line 141
    invoke-static {p0, v1}, La3d20260409/e;->e(Lorg/json/JSONObject;Ljava/lang/String;)Landroid/graphics/RectF;

    .line 142
    move-result-object v1

    .line 143
    .line 144
    iput-object v1, v0, La3d20260409/e;->k:Landroid/graphics/RectF;

    .line 145
    .line 146
    .line 147
    const-string/jumbo v1, "mouthRect"

    .line 148
    .line 149
    .line 150
    invoke-static {p0, v1}, La3d20260409/e;->e(Lorg/json/JSONObject;Ljava/lang/String;)Landroid/graphics/RectF;

    .line 151
    move-result-object v1

    .line 152
    .line 153
    iput-object v1, v0, La3d20260409/e;->l:Landroid/graphics/RectF;

    .line 154
    .line 155
    .line 156
    const-string/jumbo v1, "landmark"

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 160
    move-result-object p0

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 164
    move-result v1

    .line 165
    rem-int/2addr v1, v4

    .line 166
    .line 167
    if-nez v1, :cond_0

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 171
    move-result v1

    .line 172
    div-int/2addr v1, v4

    .line 173
    .line 174
    new-array v1, v1, [Landroid/graphics/PointF;

    .line 175
    .line 176
    iput-object v1, v0, La3d20260409/e;->i:[Landroid/graphics/PointF;

    .line 177
    move v1, v3

    .line 178
    .line 179
    .line 180
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 181
    move-result v2

    .line 182
    div-int/2addr v2, v4

    .line 183
    .line 184
    if-ge v3, v2, :cond_0

    .line 185
    .line 186
    iget-object v2, v0, La3d20260409/e;->i:[Landroid/graphics/PointF;

    .line 187
    .line 188
    new-instance v5, Landroid/graphics/PointF;

    .line 189
    .line 190
    .line 191
    invoke-direct {v5}, Landroid/graphics/PointF;-><init>()V

    .line 192
    .line 193
    aput-object v5, v2, v3

    .line 194
    .line 195
    iget-object v2, v0, La3d20260409/e;->i:[Landroid/graphics/PointF;

    .line 196
    .line 197
    aget-object v2, v2, v3

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->optDouble(I)D

    .line 201
    move-result-wide v5

    .line 202
    double-to-float v5, v5

    .line 203
    .line 204
    iput v5, v2, Landroid/graphics/PointF;->x:F

    .line 205
    .line 206
    add-int/lit8 v2, v1, 0x1

    .line 207
    .line 208
    iget-object v5, v0, La3d20260409/e;->i:[Landroid/graphics/PointF;

    .line 209
    .line 210
    aget-object v5, v5, v3

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->optDouble(I)D

    .line 214
    move-result-wide v6

    .line 215
    double-to-float v2, v6

    .line 216
    .line 217
    iput v2, v5, Landroid/graphics/PointF;->y:F
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 218
    .line 219
    add-int/lit8 v1, v1, 0x2

    .line 220
    .line 221
    add-int/lit8 v3, v3, 0x1

    .line 222
    goto :goto_0

    .line 223
    :cond_0
    return-object v0

    .line 224
    :catch_0
    const/4 p0, 0x0

    .line 225
    return-object p0
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method
