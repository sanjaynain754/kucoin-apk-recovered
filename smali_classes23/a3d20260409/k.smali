.class public La3d20260409/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lai/advance/common/recorder_old/VideoRecorder;

.field public b:Lorg/json/JSONObject;

.field public c:I

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public a()Lorg/json/JSONObject;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/k;->b:Lorg/json/JSONObject;

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
    .line 19
    .line 20
.end method

.method public b(III)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, La3d20260409/k;->d:I

    .line 3
    .line 4
    iput p2, p0, La3d20260409/k;->e:I

    .line 5
    .line 6
    iput p3, p0, La3d20260409/k;->c:I

    .line 7
    return-void
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
.end method

.method public c(Li/w;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/k;->a:Lai/advance/common/recorder_old/VideoRecorder;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lai/advance/common/recorder_old/VideoRecorder;->n(Li/w;)V

    .line 8
    :cond_0
    return-void
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
.end method

.method public d(Ljava/lang/String;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/k;->a:Lai/advance/common/recorder_old/VideoRecorder;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_5

    .line 6
    .line 7
    new-instance v0, Lai/advance/common/recorder_old/VideoRecorder;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Lai/advance/common/recorder_old/VideoRecorder;-><init>()V

    .line 11
    .line 12
    iput-object v0, p0, La3d20260409/k;->a:Lai/advance/common/recorder_old/VideoRecorder;

    .line 13
    .line 14
    iget v2, p0, La3d20260409/k;->c:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v2}, Lai/advance/common/recorder_old/VideoRecorder;->s(I)V

    .line 18
    .line 19
    .line 20
    invoke-static {}, La3d20260409/v;->R()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lk/g;->g(Ljava/lang/String;)Z

    .line 25
    move-result v2

    .line 26
    .line 27
    if-eqz v2, :cond_4

    .line 28
    .line 29
    new-instance v2, Lorg/json/JSONObject;

    .line 30
    .line 31
    .line 32
    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    const-string v0, "bitRate"

    .line 35
    .line 36
    .line 37
    invoke-static {v2, v0}, Lk/g;->d(Lorg/json/JSONObject;Ljava/lang/String;)I

    .line 38
    move-result v0

    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    iget-object v3, p0, La3d20260409/k;->a:Lai/advance/common/recorder_old/VideoRecorder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v0}, Lai/advance/common/recorder_old/VideoRecorder;->o(I)V

    .line 46
    .line 47
    :cond_0
    const-string v3, "frameRate"

    .line 48
    .line 49
    .line 50
    invoke-static {v2, v3}, Lk/g;->d(Lorg/json/JSONObject;Ljava/lang/String;)I

    .line 51
    move-result v3

    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    iget-object v4, p0, La3d20260409/k;->a:Lai/advance/common/recorder_old/VideoRecorder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4, v3}, Lai/advance/common/recorder_old/VideoRecorder;->q(I)V

    .line 59
    .line 60
    :cond_1
    const-string v3, "encodeQueueMaxSize"

    .line 61
    .line 62
    .line 63
    invoke-static {v2, v3}, Lk/g;->d(Lorg/json/JSONObject;Ljava/lang/String;)I

    .line 64
    move-result v3

    .line 65
    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    iget-object v0, p0, La3d20260409/k;->a:Lai/advance/common/recorder_old/VideoRecorder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v3}, Lai/advance/common/recorder_old/VideoRecorder;->p(I)V

    .line 72
    .line 73
    :cond_2
    const-string v0, "color19DeviceModelList"

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    .line 82
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 83
    move-result v2

    .line 84
    .line 85
    if-ge v1, v2, :cond_4

    .line 86
    .line 87
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 91
    move-result-object v3

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    move-result v2

    .line 96
    .line 97
    if-eqz v2, :cond_3

    .line 98
    .line 99
    iget-object v2, p0, La3d20260409/k;->a:Lai/advance/common/recorder_old/VideoRecorder;

    .line 100
    .line 101
    const/16 v3, 0x13

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v3}, Lai/advance/common/recorder_old/VideoRecorder;->r(I)V

    .line 105
    .line 106
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 107
    goto :goto_0

    .line 108
    .line 109
    :cond_4
    new-instance v0, Ljava/io/File;

    .line 110
    .line 111
    .line 112
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    iget-object p1, p0, La3d20260409/k;->a:Lai/advance/common/recorder_old/VideoRecorder;

    .line 115
    .line 116
    iget v1, p0, La3d20260409/k;->d:I

    .line 117
    .line 118
    iget v2, p0, La3d20260409/k;->e:I

    .line 119
    .line 120
    sget v3, La3d20260409/s;->m:I

    .line 121
    .line 122
    mul-int/lit16 v3, v3, 0x3e8

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v1, v2, v3, v0}, Lai/advance/common/recorder_old/VideoRecorder;->t(IIILjava/io/File;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 129
    move-result-object p1

    .line 130
    .line 131
    .line 132
    invoke-static {p1}, La3d20260409/j3d20260409;->O0ooEoo0oo(Ljava/lang/String;)V

    .line 133
    const/4 p1, 0x1

    .line 134
    return p1

    .line 135
    :cond_5
    return v1
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
.end method

.method public e()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/k;->a:Lai/advance/common/recorder_old/VideoRecorder;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lai/advance/common/recorder_old/VideoRecorder;->m()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public f()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/k;->a:Lai/advance/common/recorder_old/VideoRecorder;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lai/advance/common/recorder_old/VideoRecorder;->m()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, La3d20260409/k;->a:Lai/advance/common/recorder_old/VideoRecorder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lai/advance/common/recorder_old/VideoRecorder;->u()V

    .line 16
    .line 17
    iget-object v0, p0, La3d20260409/k;->a:Lai/advance/common/recorder_old/VideoRecorder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lai/advance/common/recorder_old/VideoRecorder;->l()Lorg/json/JSONObject;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    iput-object v0, p0, La3d20260409/k;->b:Lorg/json/JSONObject;

    .line 24
    const/4 v0, 0x0

    .line 25
    .line 26
    iput-object v0, p0, La3d20260409/k;->a:Lai/advance/common/recorder_old/VideoRecorder;

    .line 27
    :cond_0
    return-void
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
    .line 79
    .line 80
.end method

.method public g()Z
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, La3d20260409/s;->l:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-static {}, La3d20260409/v;->C()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method
