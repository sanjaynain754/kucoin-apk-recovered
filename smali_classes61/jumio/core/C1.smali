.class public abstract Ljumio/core/C1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    .line 2
    const-string v0, "glAttachShader"

    .line 3
    .line 4
    const-string v1, "Could not link program: "

    .line 5
    .line 6
    .line 7
    const-string/jumbo v2, "vertexShaderSource"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v2, "fragmentShaderSource"

    .line 13
    .line 14
    .line 15
    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const/4 v2, -0x1

    .line 20
    .line 21
    iput v2, p0, Ljumio/core/C1;->b:I

    .line 22
    .line 23
    iput v2, p0, Ljumio/core/C1;->c:I

    .line 24
    .line 25
    iput v2, p0, Ljumio/core/C1;->d:I

    .line 26
    .line 27
    iput v2, p0, Ljumio/core/C1;->e:I

    .line 28
    .line 29
    iput v2, p0, Ljumio/core/C1;->f:I

    .line 30
    .line 31
    iput v2, p0, Ljumio/core/C1;->g:I

    .line 32
    .line 33
    iput v2, p0, Ljumio/core/C1;->h:I

    .line 34
    .line 35
    .line 36
    const v3, 0x8b31

    .line 37
    .line 38
    .line 39
    :try_start_0
    invoke-static {v3, p1}, Ljumio/core/H1;->b(ILjava/lang/String;)I

    .line 40
    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_6

    .line 41
    .line 42
    .line 43
    const v3, 0x8b30

    .line 44
    .line 45
    .line 46
    :try_start_1
    invoke-static {v3, p2}, Ljumio/core/H1;->b(ILjava/lang/String;)I

    .line 47
    move-result p2
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_4

    .line 48
    .line 49
    .line 50
    :try_start_2
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    .line 51
    move-result v3
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    .line 52
    .line 53
    :try_start_3
    const-string v4, "glCreateProgram"

    .line 54
    .line 55
    .line 56
    invoke-static {v4}, Ljumio/core/H1;->b(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v3, p1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 60
    .line 61
    .line 62
    invoke-static {v0}, Ljumio/core/H1;->b(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v3, p2}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Ljumio/core/H1;->b(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v3}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    .line 72
    const/4 v0, 0x1

    .line 73
    .line 74
    new-array v4, v0, [I

    .line 75
    .line 76
    .line 77
    const v5, 0x8b82

    .line 78
    const/4 v6, 0x0

    .line 79
    .line 80
    .line 81
    invoke-static {v3, v5, v4, v6}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 82
    .line 83
    aget v4, v4, v6

    .line 84
    .line 85
    if-ne v4, v0, :cond_0

    .line 86
    .line 87
    iput v3, p0, Ljumio/core/C1;->a:I
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_0

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Ljumio/core/C1;->a()V

    .line 91
    return-void

    .line 92
    :catch_0
    move-exception v0

    .line 93
    goto :goto_2

    .line 94
    :catch_1
    move-exception v0

    .line 95
    goto :goto_3

    .line 96
    .line 97
    :cond_0
    :try_start_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v3}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    .line 104
    move-result-object v1

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    move-result-object v0

    .line 112
    .line 113
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    .line 120
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 121
    throw v1
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_0

    .line 122
    :catch_2
    move-exception v0

    .line 123
    move v3, v2

    .line 124
    goto :goto_2

    .line 125
    :catch_3
    move-exception v0

    .line 126
    move v3, v2

    .line 127
    goto :goto_3

    .line 128
    :catch_4
    move-exception v0

    .line 129
    move p2, v2

    .line 130
    :goto_0
    move v3, p2

    .line 131
    goto :goto_2

    .line 132
    :catch_5
    move-exception v0

    .line 133
    move p2, v2

    .line 134
    :goto_1
    move v3, p2

    .line 135
    goto :goto_3

    .line 136
    :catch_6
    move-exception v0

    .line 137
    move p1, v2

    .line 138
    move p2, p1

    .line 139
    goto :goto_0

    .line 140
    .line 141
    :goto_2
    if-eq p1, v2, :cond_1

    .line 142
    .line 143
    .line 144
    invoke-static {p1}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 145
    .line 146
    :cond_1
    if-eq p2, v2, :cond_2

    .line 147
    .line 148
    .line 149
    invoke-static {p2}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 150
    .line 151
    :cond_2
    if-eq v3, v2, :cond_3

    .line 152
    .line 153
    .line 154
    invoke-static {v3}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    .line 155
    :cond_3
    throw v0

    .line 156
    :catch_7
    move-exception v0

    .line 157
    move p1, v2

    .line 158
    move p2, p1

    .line 159
    goto :goto_1

    .line 160
    .line 161
    :goto_3
    if-eq p1, v2, :cond_4

    .line 162
    .line 163
    .line 164
    invoke-static {p1}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 165
    .line 166
    :cond_4
    if-eq p2, v2, :cond_5

    .line 167
    .line 168
    .line 169
    invoke-static {p2}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 170
    .line 171
    :cond_5
    if-eq v3, v2, :cond_6

    .line 172
    .line 173
    .line 174
    invoke-static {v3}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    .line 175
    :cond_6
    throw v0
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
.method public a()V
    .locals 2

    .line 10
    iget v0, p0, Ljumio/core/C1;->a:I

    const-string v1, "aPosition"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljumio/core/C1;->f:I

    .line 11
    invoke-static {v0, v1}, Ljumio/core/H1;->a(ILjava/lang/String;)V

    .line 12
    iget v0, p0, Ljumio/core/C1;->a:I

    const-string/jumbo v1, "uTransMatrix"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljumio/core/C1;->b:I

    .line 13
    invoke-static {v0, v1}, Ljumio/core/H1;->a(ILjava/lang/String;)V

    .line 14
    iget v0, p0, Ljumio/core/C1;->a:I

    const-string/jumbo v1, "uAlphaScale"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljumio/core/C1;->c:I

    .line 15
    iget v0, p0, Ljumio/core/C1;->a:I

    const-string/jumbo v1, "uResolution"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljumio/core/C1;->d:I

    .line 16
    iget v0, p0, Ljumio/core/C1;->a:I

    const-string/jumbo v1, "uScaleFactor"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljumio/core/C1;->e:I

    .line 17
    iget v0, p0, Ljumio/core/C1;->a:I

    const-string/jumbo v1, "uIntensity"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljumio/core/C1;->g:I

    .line 18
    iget v0, p0, Ljumio/core/C1;->a:I

    const-string/jumbo v1, "uRadius"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljumio/core/C1;->h:I

    return-void
.end method

.method public final a(F)V
    .locals 2

    .line 4
    iget v0, p0, Ljumio/core/C1;->g:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return-void

    .line 5
    :cond_0
    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glUniform1f(IF)V

    .line 6
    const-string p1, "glUniform1f"

    invoke-static {p1}, Ljumio/core/H1;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final a(FF)V
    .locals 2

    .line 1
    iget v0, p0, Ljumio/core/C1;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {v0, p1, p2}, Landroid/opengl/GLES20;->glUniform2f(IFF)V

    .line 3
    const-string p1, "glUniform2f"

    invoke-static {p1}, Ljumio/core/H1;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final a(I)V
    .locals 2

    .line 7
    iget v0, p0, Ljumio/core/C1;->h:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return-void

    .line 8
    :cond_0
    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 9
    const-string p1, "glUniform1i"

    invoke-static {p1}, Ljumio/core/H1;->b(Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 7

    .line 1
    iget v0, p0, Ljumio/core/C1;->a:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 2
    const-string v0, "glUseProgram"

    invoke-static {v0}, Ljumio/core/H1;->b(Ljava/lang/String;)V

    .line 3
    iget v0, p0, Ljumio/core/C1;->f:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 4
    const-string v0, "glEnableVertexAttribArray"

    invoke-static {v0}, Ljumio/core/H1;->b(Ljava/lang/String;)V

    .line 5
    iget v1, p0, Ljumio/core/C1;->f:I

    const/4 v4, 0x0

    .line 6
    sget-object v6, Ljumio/core/H1;->f:Ljava/nio/FloatBuffer;

    const/4 v2, 0x2

    const/16 v3, 0x1406

    const/4 v5, 0x0

    .line 7
    invoke-static/range {v1 .. v6}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 8
    const-string v0, "glVertexAttribPointer"

    invoke-static {v0}, Ljumio/core/H1;->b(Ljava/lang/String;)V

    const/16 v0, 0x10

    .line 9
    new-array v0, v0, [F

    const/4 v1, 0x0

    .line 10
    invoke-static {v0, v1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 11
    const-string/jumbo v2, "transformMat"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    iget v2, p0, Ljumio/core/C1;->b:I

    const/4 v3, 0x1

    invoke-static {v2, v3, v1, v0, v1}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 13
    const-string v0, "glUniformMatrix4fv"

    invoke-static {v0}, Ljumio/core/H1;->b(Ljava/lang/String;)V

    .line 14
    iget v0, p0, Ljumio/core/C1;->c:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    const/high16 v1, 0x3f800000    # 1.0f

    .line 15
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glUniform1f(IF)V

    .line 16
    const-string v0, "glUniform1f"

    invoke-static {v0}, Ljumio/core/H1;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final b(F)V
    .locals 2

    .line 17
    iget v0, p0, Ljumio/core/C1;->e:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return-void

    .line 18
    :cond_0
    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glUniform1f(IF)V

    .line 19
    const-string p1, "glUniform1f"

    invoke-static {p1}, Ljumio/core/H1;->b(Ljava/lang/String;)V

    return-void
.end method
