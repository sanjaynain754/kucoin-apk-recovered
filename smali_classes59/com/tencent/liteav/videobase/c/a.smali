.class public final Lcom/tencent/liteav/videobase/c/a;
.super Lcom/tencent/liteav/videobase/c/e;
.source "SourceFile"


# static fields
.field private static final j:[F

.field private static final k:[F

.field private static final l:[F

.field private static final m:[F

.field private static final n:[F

.field private static final o:[F


# instance fields
.field private p:I

.field private q:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    const/16 v0, 0x9

    .line 3
    .line 4
    new-array v1, v0, [F

    .line 5
    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    sput-object v1, Lcom/tencent/liteav/videobase/c/a;->j:[F

    .line 10
    .line 11
    new-array v1, v0, [F

    .line 12
    .line 13
    .line 14
    fill-array-data v1, :array_1

    .line 15
    .line 16
    sput-object v1, Lcom/tencent/liteav/videobase/c/a;->k:[F

    .line 17
    .line 18
    new-array v1, v0, [F

    .line 19
    .line 20
    .line 21
    fill-array-data v1, :array_2

    .line 22
    .line 23
    sput-object v1, Lcom/tencent/liteav/videobase/c/a;->l:[F

    .line 24
    .line 25
    new-array v0, v0, [F

    .line 26
    .line 27
    .line 28
    fill-array-data v0, :array_3

    .line 29
    .line 30
    sput-object v0, Lcom/tencent/liteav/videobase/c/a;->m:[F

    .line 31
    const/4 v0, 0x3

    .line 32
    .line 33
    new-array v1, v0, [F

    .line 34
    .line 35
    .line 36
    fill-array-data v1, :array_4

    .line 37
    .line 38
    sput-object v1, Lcom/tencent/liteav/videobase/c/a;->n:[F

    .line 39
    .line 40
    new-array v0, v0, [F

    .line 41
    .line 42
    .line 43
    fill-array-data v0, :array_5

    .line 44
    .line 45
    sput-object v0, Lcom/tencent/liteav/videobase/c/a;->o:[F

    .line 46
    return-void

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
    :array_0
    .array-data 4
        0x3f950b0f    # 1.1644f
        0x3f950b0f    # 1.1644f
        0x3f950b0f    # 1.1644f
        0x0
        -0x413765fe    # -0.3918f
        0x400119ce    # 2.0172f
        0x3fcc49ba    # 1.596f
        -0x40afdf3b    # -0.813f
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
        -0x414fd220    # -0.3441f
        0x3fe2d0e5    # 1.772f
        0x3fb374bc    # 1.402f
        -0x40c930be    # -0.7141f
        0x0
    .end array-data

    :array_2
    .array-data 4
        0x3f950b0f    # 1.1644f
        0x3f950b0f    # 1.1644f
        0x3f950b0f    # 1.1644f
        0x0
        -0x41a5aee6    # -0.2132f
        0x40073190    # 2.1124f
        0x3fe57732    # 1.7927f
        -0x40f793de    # -0.5329f
        0x0
    .end array-data

    :array_3
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
        -0x41c0346e    # -0.1873f
        0x3fed844d    # 1.8556f
        0x3fc9930c    # 1.5748f
        -0x41105532    # -0.4681f
        0x0
    .end array-data

    :array_4
    .array-data 4
        -0x427f7f7f
        -0x40ff7f7f
        -0x40ff7f7f
    .end array-data

    :array_5
    .array-data 4
        0x0
        -0x40ff7f7f
        -0x40ff7f7f
    .end array-data
.end method

.method public constructor <init>(Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nuniform mat4 textureTransform;\nvarying highp vec2 textureCoordinate;\nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}"

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "precision highp float;\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform sampler2D uvTexture;\nuniform mat3 convertMatrix;\nuniform vec3 offset;\n\nvoid main()\n{\n    highp vec3 yuvColor;\n    highp vec3 rgbColor;\n\n    // Get the YUV values\n    yuvColor.x = texture2D(inputImageTexture, textureCoordinate).r;\n    yuvColor.y = texture2D(uvTexture, vec2(textureCoordinate.x, textureCoordinate.y * 0.5)).r;\n    yuvColor.z = texture2D(uvTexture, vec2(textureCoordinate.x, textureCoordinate.y * 0.5 + 0.5)).r;\n\n    // Do the color transform\n    yuvColor += offset;\n    rgbColor = convertMatrix * yuvColor;\n\n    gl_FragColor = vec4(rgbColor, 1.0);\n}"

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0, v1, p1, p2}, Lcom/tencent/liteav/videobase/c/e;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;)V

    .line 9
    return-void
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
.end method

.method public static synthetic a(Lcom/tencent/liteav/videobase/c/a;)V
    .locals 5

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/liteav/videobase/a/a;->f:I

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 6
    .line 7
    iget v0, p0, Lcom/tencent/liteav/videobase/c/a;->q:I

    .line 8
    .line 9
    sget-object v1, Lcom/tencent/liteav/videobase/c/a$1;->a:[I

    .line 10
    .line 11
    iget-object v2, p0, Lcom/tencent/liteav/videobase/c/e;->i:Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 15
    move-result v2

    .line 16
    .line 17
    aget v1, v1, v2

    .line 18
    const/4 v2, 0x1

    .line 19
    .line 20
    if-eq v1, v2, :cond_0

    .line 21
    .line 22
    sget-object v1, Lcom/tencent/liteav/videobase/c/a;->n:[F

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_0
    sget-object v1, Lcom/tencent/liteav/videobase/c/a;->o:[F

    .line 26
    :goto_0
    const/4 v3, 0x0

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v2, v1, v3}, Landroid/opengl/GLES20;->glUniform3fv(II[FI)V

    .line 30
    .line 31
    iget v0, p0, Lcom/tencent/liteav/videobase/c/a;->p:I

    .line 32
    .line 33
    iget-object v1, p0, Lcom/tencent/liteav/videobase/c/e;->h:Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    sget-object v4, Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;->a:Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;

    .line 38
    .line 39
    if-ne v1, v4, :cond_2

    .line 40
    .line 41
    :cond_1
    sget-object v1, Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;->b:Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;

    .line 42
    .line 43
    :cond_2
    iget-object p0, p0, Lcom/tencent/liteav/videobase/c/e;->i:Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;

    .line 44
    .line 45
    if-eqz p0, :cond_3

    .line 46
    .line 47
    sget-object v4, Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;->a:Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;

    .line 48
    .line 49
    if-ne p0, v4, :cond_4

    .line 50
    .line 51
    :cond_3
    sget-object p0, Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;->b:Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;

    .line 52
    .line 53
    :cond_4
    sget-object v4, Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;->b:Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;

    .line 54
    .line 55
    if-ne v1, v4, :cond_5

    .line 56
    .line 57
    sget-object v1, Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;->b:Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;

    .line 58
    .line 59
    if-eq p0, v1, :cond_7

    .line 60
    .line 61
    sget-object v1, Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;->c:Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;

    .line 62
    .line 63
    if-ne p0, v1, :cond_7

    .line 64
    .line 65
    sget-object p0, Lcom/tencent/liteav/videobase/c/a;->k:[F

    .line 66
    goto :goto_1

    .line 67
    .line 68
    :cond_5
    sget-object v4, Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;->c:Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;

    .line 69
    .line 70
    if-ne v1, v4, :cond_7

    .line 71
    .line 72
    sget-object v1, Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;->b:Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;

    .line 73
    .line 74
    if-ne p0, v1, :cond_6

    .line 75
    .line 76
    sget-object p0, Lcom/tencent/liteav/videobase/c/a;->l:[F

    .line 77
    goto :goto_1

    .line 78
    .line 79
    :cond_6
    sget-object v1, Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;->c:Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;

    .line 80
    .line 81
    if-ne p0, v1, :cond_7

    .line 82
    .line 83
    sget-object p0, Lcom/tencent/liteav/videobase/c/a;->m:[F

    .line 84
    goto :goto_1

    .line 85
    .line 86
    :cond_7
    sget-object p0, Lcom/tencent/liteav/videobase/c/a;->j:[F

    .line 87
    .line 88
    .line 89
    :goto_1
    invoke-static {v0, v2, v3, p0, v3}, Landroid/opengl/GLES20;->glUniformMatrix3fv(IIZ[FI)V

    .line 90
    return-void
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


# virtual methods
.method public final b(Lcom/tencent/liteav/videobase/frame/e;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/tencent/liteav/videobase/c/e;->b(Lcom/tencent/liteav/videobase/frame/e;)V

    .line 4
    .line 5
    iget p1, p0, Lcom/tencent/liteav/videobase/a/a;->f:I

    .line 6
    .line 7
    const-string v0, "convertMatrix"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 11
    move-result p1

    .line 12
    .line 13
    iput p1, p0, Lcom/tencent/liteav/videobase/c/a;->p:I

    .line 14
    .line 15
    iget p1, p0, Lcom/tencent/liteav/videobase/a/a;->f:I

    .line 16
    .line 17
    .line 18
    const-string/jumbo v0, "offset"

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v0}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 22
    move-result p1

    .line 23
    .line 24
    iput p1, p0, Lcom/tencent/liteav/videobase/c/a;->q:I

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, Lcom/tencent/liteav/videobase/c/b;->a(Lcom/tencent/liteav/videobase/c/a;)Ljava/lang/Runnable;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/videobase/a/a;->a(Ljava/lang/Runnable;)V

    .line 32
    return-void
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
.end method

.method public final d()I
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x1909

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
.end method
