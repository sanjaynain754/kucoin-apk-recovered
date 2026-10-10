.class public final Ljumio/core/G1;
.super Ljumio/core/C1;
.source "SourceFile"


# static fields
.field public static final l:Lcom/jumio/commons/camera/renderer/opengl/GLUtils$SamplerShaderProgram$Companion;


# instance fields
.field public i:I

.field public j:I

.field public k:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/commons/camera/renderer/opengl/GLUtils$SamplerShaderProgram$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/jumio/commons/camera/renderer/opengl/GLUtils$SamplerShaderProgram$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Ljumio/core/G1;->l:Lcom/jumio/commons/camera/renderer/opengl/GLUtils$SamplerShaderProgram$Companion;

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
.end method

.method public constructor <init>(Ljumio/core/e1;Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "vTextureCoord"

    .line 4
    .line 5
    const-string v1, "sTexture"

    .line 6
    .line 7
    const-string v2, "dynamicRange"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v2, "shaderProvider"

    .line 13
    .line 14
    .line 15
    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljumio/core/e1;->a()Z

    .line 19
    move-result p1

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    sget-object p1, Ljumio/core/H1;->a:[I

    .line 24
    .line 25
    const-string p1, "\n\t\t#version 300 es\n\t\tin vec4 aPosition;\n\t\tin vec4 aTextureCoord;\n\t\tuniform mat4 uTexMatrix;\n\t\tuniform mat4 uTransMatrix;\n\t\tout vec2 vTextureCoord;\n\t\tvoid main() {\n\t\t  gl_Position = uTransMatrix * aPosition;\n\t\t  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n\t\t}\n\t"

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_0
    sget-object p1, Ljumio/core/H1;->a:[I

    .line 29
    .line 30
    const-string p1, "\n\t\tuniform mat4 uTexMatrix;\n\t\tuniform mat4 uTransMatrix;\n\t\tattribute vec4 aPosition;\n\t\tattribute vec4 aTextureCoord;\n\t\tvarying vec2 vTextureCoord;\n\t\tvoid main() {\n\t\t\tgl_Position = uTransMatrix * aPosition;\n\t\t\tvTextureCoord = (uTexMatrix * aTextureCoord).xy;\n\t\t}\n\t"

    .line 31
    .line 32
    .line 33
    :goto_0
    :try_start_0
    invoke-interface {p2, v1, v0}, Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;->createFragmentShader(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    move-result-object p2

    .line 35
    .line 36
    if-eqz p2, :cond_1

    .line 37
    const/4 v2, 0x0

    .line 38
    const/4 v3, 0x2

    .line 39
    const/4 v4, 0x0

    .line 40
    .line 41
    .line 42
    invoke-static {p2, v0, v4, v3, v2}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 43
    move-result v0

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    .line 48
    invoke-static {p2, v1, v4, v3, v2}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 49
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    .line 54
    invoke-direct {p0, p1, p2}, Ljumio/core/C1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    const/4 p1, -0x1

    .line 56
    .line 57
    iput p1, p0, Ljumio/core/G1;->i:I

    .line 58
    .line 59
    iput p1, p0, Ljumio/core/G1;->j:I

    .line 60
    .line 61
    iput p1, p0, Ljumio/core/G1;->k:I

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Ljumio/core/G1;->a()V

    .line 65
    return-void

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    goto :goto_1

    .line 68
    .line 69
    :cond_1
    :try_start_1
    const-string p1, "Invalid fragment shader"

    .line 70
    .line 71
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 72
    .line 73
    .line 74
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 75
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    .line 77
    :goto_1
    instance-of p2, p1, Ljava/lang/IllegalArgumentException;

    .line 78
    .line 79
    if-eqz p2, :cond_2

    .line 80
    throw p1

    .line 81
    .line 82
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 83
    .line 84
    const-string v0, "Unable retrieve fragment shader source"

    .line 85
    .line 86
    .line 87
    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 88
    throw p2
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
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Ljumio/core/C1;->a()V

    .line 4
    .line 5
    iget v0, p0, Ljumio/core/C1;->a:I

    .line 6
    .line 7
    const-string v1, "sTexture"

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 11
    move-result v0

    .line 12
    .line 13
    iput v0, p0, Ljumio/core/G1;->i:I

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Ljumio/core/H1;->a(ILjava/lang/String;)V

    .line 17
    .line 18
    iget v0, p0, Ljumio/core/C1;->a:I

    .line 19
    .line 20
    const-string v1, "aTextureCoord"

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 24
    move-result v0

    .line 25
    .line 26
    iput v0, p0, Ljumio/core/G1;->k:I

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, Ljumio/core/H1;->a(ILjava/lang/String;)V

    .line 30
    .line 31
    iget v0, p0, Ljumio/core/C1;->a:I

    .line 32
    .line 33
    .line 34
    const-string/jumbo v1, "uTexMatrix"

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 38
    move-result v0

    .line 39
    .line 40
    iput v0, p0, Ljumio/core/G1;->j:I

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v1}, Ljumio/core/H1;->a(ILjava/lang/String;)V

    .line 44
    return-void
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
.end method

.method public final b()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Ljumio/core/C1;->b()V

    .line 4
    .line 5
    iget v0, p0, Ljumio/core/G1;->i:I

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 10
    .line 11
    iget v0, p0, Ljumio/core/G1;->k:I

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 15
    .line 16
    const-string v0, "glEnableVertexAttribArray"

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Ljumio/core/H1;->b(Ljava/lang/String;)V

    .line 20
    .line 21
    iget v1, p0, Ljumio/core/G1;->k:I

    .line 22
    const/4 v4, 0x0

    .line 23
    .line 24
    sget-object v6, Ljumio/core/H1;->g:Ljava/nio/FloatBuffer;

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    const/16 v3, 0x1406

    .line 28
    const/4 v5, 0x0

    .line 29
    .line 30
    .line 31
    invoke-static/range {v1 .. v6}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 32
    .line 33
    const-string v0, "glVertexAttribPointer"

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Ljumio/core/H1;->b(Ljava/lang/String;)V

    .line 37
    return-void
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
.end method
