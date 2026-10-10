.class public Li7/e;
.super Lcom/fasterxml/jackson/core/f;
.source "JsonWriteContext.java"


# instance fields
.field public final c:Li7/e;

.field public d:Li7/b;

.field public e:Li7/e;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/Object;

.field public h:Z


# direct methods
.method public constructor <init>(ILi7/e;Li7/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/f;-><init>()V

    .line 2
    iput p1, p0, Lcom/fasterxml/jackson/core/f;->a:I

    .line 3
    iput-object p2, p0, Li7/e;->c:Li7/e;

    .line 4
    iput-object p3, p0, Li7/e;->d:Li7/b;

    const/4 p1, -0x1

    .line 5
    iput p1, p0, Lcom/fasterxml/jackson/core/f;->b:I

    return-void
.end method

.method public constructor <init>(ILi7/e;Li7/b;Ljava/lang/Object;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/f;-><init>()V

    .line 7
    iput p1, p0, Lcom/fasterxml/jackson/core/f;->a:I

    .line 8
    iput-object p2, p0, Li7/e;->c:Li7/e;

    .line 9
    iput-object p3, p0, Li7/e;->d:Li7/b;

    const/4 p1, -0x1

    .line 10
    iput p1, p0, Lcom/fasterxml/jackson/core/f;->b:I

    .line 11
    iput-object p4, p0, Li7/e;->g:Ljava/lang/Object;

    return-void
.end method

.method private final k(Li7/b;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonProcessingException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1, p2}, Li7/b;->c(Ljava/lang/String;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Li7/b;->b()Ljava/lang/Object;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    new-instance v0, Lcom/fasterxml/jackson/core/JsonGenerationException;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    const-string v2, "Duplicate field \'"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string p2, "\'"

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    move-result-object p2

    .line 35
    .line 36
    instance-of v1, p1, Lcom/fasterxml/jackson/core/JsonGenerator;

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    check-cast p1, Lcom/fasterxml/jackson/core/JsonGenerator;

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 p1, 0x0

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-direct {v0, p2, p1}, Lcom/fasterxml/jackson/core/JsonGenerationException;-><init>(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonGenerator;)V

    .line 46
    throw v0

    .line 47
    :cond_1
    return-void
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
.end method

.method public static q(Li7/b;)Li7/e;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Li7/e;

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p0}, Li7/e;-><init>(ILi7/e;Li7/b;)V

    .line 8
    return-object v0
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


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Li7/e;->f:Ljava/lang/String;

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

.method public c()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Li7/e;->g:Ljava/lang/Object;

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

.method public bridge synthetic e()Lcom/fasterxml/jackson/core/f;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Li7/e;->s()Li7/e;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public i(Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Li7/e;->g:Ljava/lang/Object;

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

.method public l()Li7/e;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Li7/e;->g:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v0, p0, Li7/e;->c:Li7/e;

    .line 6
    return-object v0
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

.method public m()Li7/e;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Li7/e;->e:Li7/e;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    new-instance v0, Li7/e;

    .line 8
    .line 9
    iget-object v2, p0, Li7/e;->d:Li7/b;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    const/4 v2, 0x0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {v2}, Li7/b;->a()Li7/b;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-direct {v0, v1, p0, v2}, Li7/e;-><init>(ILi7/e;Li7/b;)V

    .line 21
    .line 22
    iput-object v0, p0, Li7/e;->e:Li7/e;

    .line 23
    return-object v0

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-virtual {v0, v1}, Li7/e;->t(I)Li7/e;

    .line 27
    move-result-object v0

    .line 28
    return-object v0
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

.method public n(Ljava/lang/Object;)Li7/e;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Li7/e;->e:Li7/e;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    new-instance v0, Li7/e;

    .line 8
    .line 9
    iget-object v2, p0, Li7/e;->d:Li7/b;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    const/4 v2, 0x0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {v2}, Li7/b;->a()Li7/b;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-direct {v0, v1, p0, v2, p1}, Li7/e;-><init>(ILi7/e;Li7/b;Ljava/lang/Object;)V

    .line 21
    .line 22
    iput-object v0, p0, Li7/e;->e:Li7/e;

    .line 23
    return-object v0

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-virtual {v0, v1, p1}, Li7/e;->u(ILjava/lang/Object;)Li7/e;

    .line 27
    move-result-object p1

    .line 28
    return-object p1
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

.method public o()Li7/e;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Li7/e;->e:Li7/e;

    .line 3
    const/4 v1, 0x2

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    new-instance v0, Li7/e;

    .line 8
    .line 9
    iget-object v2, p0, Li7/e;->d:Li7/b;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    const/4 v2, 0x0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {v2}, Li7/b;->a()Li7/b;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-direct {v0, v1, p0, v2}, Li7/e;-><init>(ILi7/e;Li7/b;)V

    .line 21
    .line 22
    iput-object v0, p0, Li7/e;->e:Li7/e;

    .line 23
    return-object v0

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-virtual {v0, v1}, Li7/e;->t(I)Li7/e;

    .line 27
    move-result-object v0

    .line 28
    return-object v0
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

.method public p(Ljava/lang/Object;)Li7/e;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Li7/e;->e:Li7/e;

    .line 3
    const/4 v1, 0x2

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    new-instance v0, Li7/e;

    .line 8
    .line 9
    iget-object v2, p0, Li7/e;->d:Li7/b;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    const/4 v2, 0x0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {v2}, Li7/b;->a()Li7/b;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-direct {v0, v1, p0, v2, p1}, Li7/e;-><init>(ILi7/e;Li7/b;Ljava/lang/Object;)V

    .line 21
    .line 22
    iput-object v0, p0, Li7/e;->e:Li7/e;

    .line 23
    return-object v0

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-virtual {v0, v1, p1}, Li7/e;->u(ILjava/lang/Object;)Li7/e;

    .line 27
    move-result-object p1

    .line 28
    return-object p1
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

.method public r()Li7/b;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Li7/e;->d:Li7/b;

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

.method public final s()Li7/e;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Li7/e;->c:Li7/e;

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

.method public t(I)Li7/e;
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/fasterxml/jackson/core/f;->a:I

    .line 3
    const/4 p1, -0x1

    .line 4
    .line 5
    iput p1, p0, Lcom/fasterxml/jackson/core/f;->b:I

    .line 6
    const/4 p1, 0x0

    .line 7
    .line 8
    iput-object p1, p0, Li7/e;->f:Ljava/lang/String;

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    iput-boolean v0, p0, Li7/e;->h:Z

    .line 12
    .line 13
    iput-object p1, p0, Li7/e;->g:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object p1, p0, Li7/e;->d:Li7/b;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Li7/b;->d()V

    .line 21
    :cond_0
    return-object p0
    .line 22
    .line 23
.end method

.method public u(ILjava/lang/Object;)Li7/e;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/fasterxml/jackson/core/f;->a:I

    .line 3
    const/4 p1, -0x1

    .line 4
    .line 5
    iput p1, p0, Lcom/fasterxml/jackson/core/f;->b:I

    .line 6
    const/4 p1, 0x0

    .line 7
    .line 8
    iput-object p1, p0, Li7/e;->f:Ljava/lang/String;

    .line 9
    const/4 p1, 0x0

    .line 10
    .line 11
    iput-boolean p1, p0, Li7/e;->h:Z

    .line 12
    .line 13
    iput-object p2, p0, Li7/e;->g:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object p1, p0, Li7/e;->d:Li7/b;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Li7/b;->d()V

    .line 21
    :cond_0
    return-object p0
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

.method public v(Li7/b;)Li7/e;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Li7/e;->d:Li7/b;

    .line 3
    return-object p0
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

.method public w(Ljava/lang/String;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonProcessingException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/fasterxml/jackson/core/f;->a:I

    .line 3
    const/4 v1, 0x2

    .line 4
    .line 5
    if-ne v0, v1, :cond_3

    .line 6
    .line 7
    iget-boolean v0, p0, Li7/e;->h:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x1

    .line 12
    .line 13
    iput-boolean v0, p0, Li7/e;->h:Z

    .line 14
    .line 15
    iput-object p1, p0, Li7/e;->f:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v1, p0, Li7/e;->d:Li7/b;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v1, p1}, Li7/e;->k(Li7/b;Ljava/lang/String;)V

    .line 23
    .line 24
    :cond_1
    iget p1, p0, Lcom/fasterxml/jackson/core/f;->b:I

    .line 25
    .line 26
    if-gez p1, :cond_2

    .line 27
    const/4 p1, 0x0

    .line 28
    return p1

    .line 29
    :cond_2
    return v0

    .line 30
    :cond_3
    :goto_0
    const/4 p1, 0x4

    .line 31
    return p1
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

.method public x()I
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lcom/fasterxml/jackson/core/f;->a:I

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x2

    .line 6
    .line 7
    if-ne v0, v3, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, Li7/e;->h:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    const/4 v0, 0x5

    .line 13
    return v0

    .line 14
    .line 15
    :cond_0
    iput-boolean v1, p0, Li7/e;->h:Z

    .line 16
    .line 17
    iget v0, p0, Lcom/fasterxml/jackson/core/f;->b:I

    .line 18
    add-int/2addr v0, v2

    .line 19
    .line 20
    iput v0, p0, Lcom/fasterxml/jackson/core/f;->b:I

    .line 21
    return v3

    .line 22
    .line 23
    :cond_1
    if-ne v0, v2, :cond_3

    .line 24
    .line 25
    iget v0, p0, Lcom/fasterxml/jackson/core/f;->b:I

    .line 26
    .line 27
    add-int/lit8 v3, v0, 0x1

    .line 28
    .line 29
    iput v3, p0, Lcom/fasterxml/jackson/core/f;->b:I

    .line 30
    .line 31
    if-gez v0, :cond_2

    .line 32
    return v1

    .line 33
    :cond_2
    return v2

    .line 34
    .line 35
    :cond_3
    iget v0, p0, Lcom/fasterxml/jackson/core/f;->b:I

    .line 36
    add-int/2addr v0, v2

    .line 37
    .line 38
    iput v0, p0, Lcom/fasterxml/jackson/core/f;->b:I

    .line 39
    .line 40
    if-nez v0, :cond_4

    .line 41
    return v1

    .line 42
    :cond_4
    const/4 v0, 0x3

    .line 43
    return v0
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
