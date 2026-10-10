.class public La3d20260409/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lorg/json/JSONObject;

.field public b:Laai/liveness/Detector$WarnCode;

.field public c:Lintl/o0oOOOOOooooo;

.field public d:Lintl/o0oOOOOOooooo;

.field public e:La3d20260409/e;

.field public f:Ljava/lang/String;

.field public g:Z

.field public h:Ljava/lang/String;

.field public i:Z

.field public j:I

.field public k:I

.field public l:D

.field public m:Z


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
.method public a(Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "faceInfo"

    .line 3
    .line 4
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    iput-object v1, p0, La3d20260409/b;->a:Lorg/json/JSONObject;

    .line 10
    .line 11
    const-string p1, "code"

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    .line 24
    :try_start_1
    invoke-static {p1}, Laai/liveness/Detector$WarnCode;->valueOf(Ljava/lang/String;)Laai/liveness/Detector$WarnCode;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    iput-object p1, p0, La3d20260409/b;->b:Laai/liveness/Detector$WarnCode;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 28
    .line 29
    :catch_0
    :cond_0
    :try_start_2
    iget-object p1, p0, La3d20260409/b;->b:Laai/liveness/Detector$WarnCode;

    .line 30
    .line 31
    sget-object v1, Laai/liveness/Detector$WarnCode;->ERROR_FACEMISSING:Laai/liveness/Detector$WarnCode;

    .line 32
    .line 33
    if-ne p1, v1, :cond_1

    .line 34
    .line 35
    sget-object p1, Laai/liveness/Detector$WarnCode;->FACEMISSING:Laai/liveness/Detector$WarnCode;

    .line 36
    .line 37
    iput-object p1, p0, La3d20260409/b;->b:Laai/liveness/Detector$WarnCode;

    .line 38
    .line 39
    :cond_1
    iget-object p1, p0, La3d20260409/b;->b:Laai/liveness/Detector$WarnCode;

    .line 40
    .line 41
    sget-object v1, Laai/liveness/Detector$WarnCode;->ERROR_MULTIPLEFACES:Laai/liveness/Detector$WarnCode;

    .line 42
    .line 43
    if-ne p1, v1, :cond_2

    .line 44
    .line 45
    sget-object p1, Laai/liveness/Detector$WarnCode;->WARN_MULTIPLEFACES:Laai/liveness/Detector$WarnCode;

    .line 46
    .line 47
    iput-object p1, p0, La3d20260409/b;->b:Laai/liveness/Detector$WarnCode;

    .line 48
    .line 49
    :cond_2
    iget-object p1, p0, La3d20260409/b;->a:Lorg/json/JSONObject;

    .line 50
    .line 51
    const-string v1, "curStage"

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    .line 58
    invoke-static {p1}, Lintl/o0oOOOOOooooo;->valueOf(Ljava/lang/String;)Lintl/o0oOOOOOooooo;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    iput-object p1, p0, La3d20260409/b;->c:Lintl/o0oOOOOOooooo;

    .line 62
    .line 63
    iget-object p1, p0, La3d20260409/b;->a:Lorg/json/JSONObject;

    .line 64
    .line 65
    .line 66
    const-string/jumbo v1, "nextStage"

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    .line 73
    invoke-static {p1}, Lintl/o0oOOOOOooooo;->valueOf(Ljava/lang/String;)Lintl/o0oOOOOOooooo;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    iput-object p1, p0, La3d20260409/b;->d:Lintl/o0oOOOOOooooo;

    .line 77
    .line 78
    iget-object p1, p0, La3d20260409/b;->a:Lorg/json/JSONObject;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    const-string v1, ""

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    move-result p1

    .line 89
    .line 90
    if-nez p1, :cond_3

    .line 91
    .line 92
    new-instance p1, Lorg/json/JSONObject;

    .line 93
    .line 94
    iget-object v1, p0, La3d20260409/b;->a:Lorg/json/JSONObject;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    move-result-object v0

    .line 99
    .line 100
    .line 101
    invoke-direct {p1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-static {p1}, La3d20260409/e$a;->a(Lorg/json/JSONObject;)La3d20260409/e;

    .line 105
    move-result-object p1

    .line 106
    .line 107
    iput-object p1, p0, La3d20260409/b;->e:La3d20260409/e;

    .line 108
    .line 109
    :cond_3
    iget-object p1, p0, La3d20260409/b;->a:Lorg/json/JSONObject;

    .line 110
    .line 111
    const-string v0, "debugInfo"

    .line 112
    .line 113
    const-string v1, "No debug info found"

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    move-result-object p1

    .line 118
    .line 119
    iput-object p1, p0, La3d20260409/b;->f:Ljava/lang/String;

    .line 120
    .line 121
    iget-object p1, p0, La3d20260409/b;->a:Lorg/json/JSONObject;

    .line 122
    .line 123
    .line 124
    const-string/jumbo v0, "snapshot"

    .line 125
    const/4 v1, 0x0

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 129
    move-result p1

    .line 130
    .line 131
    iput-boolean p1, p0, La3d20260409/b;->i:Z

    .line 132
    .line 133
    iget-object p1, p0, La3d20260409/b;->a:Lorg/json/JSONObject;

    .line 134
    .line 135
    const-string v0, "isFrontal"

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 139
    move-result p1

    .line 140
    .line 141
    iput-boolean p1, p0, La3d20260409/b;->g:Z

    .line 142
    .line 143
    iget-object p1, p0, La3d20260409/b;->a:Lorg/json/JSONObject;

    .line 144
    .line 145
    .line 146
    const-string/jumbo v0, "snapshotName"

    .line 147
    .line 148
    iget-object v1, p0, La3d20260409/b;->b:Laai/liveness/Detector$WarnCode;

    .line 149
    .line 150
    .line 151
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 152
    move-result-object v1

    .line 153
    .line 154
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 158
    move-result-object v1

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 162
    move-result-object p1

    .line 163
    .line 164
    iput-object p1, p0, La3d20260409/b;->h:Ljava/lang/String;

    .line 165
    .line 166
    iget-object p1, p0, La3d20260409/b;->a:Lorg/json/JSONObject;

    .line 167
    .line 168
    const-string v0, "isEyeClosed"

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 172
    move-result p1

    .line 173
    .line 174
    iput-boolean p1, p0, La3d20260409/b;->m:Z

    .line 175
    .line 176
    iget-object p1, p0, La3d20260409/b;->a:Lorg/json/JSONObject;

    .line 177
    .line 178
    const-string v0, "blinkCaptureScore"

    .line 179
    .line 180
    const-wide/16 v1, 0x0

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 184
    move-result-wide v0

    .line 185
    .line 186
    iput-wide v0, p0, La3d20260409/b;->l:D
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 187
    :catch_1
    return-void
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
