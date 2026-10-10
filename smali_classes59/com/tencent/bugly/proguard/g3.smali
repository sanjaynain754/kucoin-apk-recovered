.class public Lcom/tencent/bugly/proguard/g3;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/l8;


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
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;
    .locals 1

    .line 1
    .line 2
    const-string v0, "http"

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Lcom/tencent/bugly/proguard/c8;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p1}, Lcom/tencent/bugly/proguard/c8;-><init>(Ljava/lang/String;)V

    .line 14
    return-object v0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return-object p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;
    .locals 1

    .line 1
    .line 2
    const-string v0, "crash"

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance p1, Lcom/tencent/bugly/proguard/f3;

    .line 11
    .line 12
    .line 13
    invoke-direct {p1}, Lcom/tencent/bugly/proguard/f3;-><init>()V

    .line 14
    return-object p1

    .line 15
    .line 16
    :cond_0
    const-string v0, "emulator"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    new-instance p1, Lcom/tencent/bugly/proguard/z4;

    .line 25
    .line 26
    .line 27
    invoke-direct {p1}, Lcom/tencent/bugly/proguard/z4;-><init>()V

    .line 28
    return-object p1

    .line 29
    .line 30
    :cond_1
    const-string v0, "application_exit"

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    move-result v0

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    new-instance p1, Lcom/tencent/bugly/proguard/j5;

    .line 39
    .line 40
    .line 41
    invoke-direct {p1}, Lcom/tencent/bugly/proguard/j5;-><init>()V

    .line 42
    return-object p1

    .line 43
    .line 44
    :cond_2
    const-string v0, "crash_report"

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    move-result v0

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    new-instance p1, Lcom/tencent/bugly/proguard/s3;

    .line 53
    .line 54
    .line 55
    invoke-direct {p1}, Lcom/tencent/bugly/proguard/s3;-><init>()V

    .line 56
    return-object p1

    .line 57
    .line 58
    :cond_3
    const-string v0, "error_report"

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    move-result v0

    .line 63
    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    new-instance p1, Lcom/tencent/bugly/proguard/d5;

    .line 67
    .line 68
    .line 69
    invoke-direct {p1}, Lcom/tencent/bugly/proguard/d5;-><init>()V

    .line 70
    return-object p1

    .line 71
    .line 72
    .line 73
    :cond_4
    const-string/jumbo v0, "userinfo_report"

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    move-result v0

    .line 78
    .line 79
    if-eqz v0, :cond_5

    .line 80
    .line 81
    new-instance p1, Lcom/tencent/bugly/proguard/zh;

    .line 82
    .line 83
    .line 84
    invoke-direct {p1}, Lcom/tencent/bugly/proguard/zh;-><init>()V

    .line 85
    return-object p1

    .line 86
    .line 87
    .line 88
    :cond_5
    const-string/jumbo v0, "replay_report"

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    move-result p1

    .line 93
    .line 94
    if-eqz p1, :cond_6

    .line 95
    .line 96
    new-instance p1, Lcom/tencent/bugly/proguard/kf;

    .line 97
    .line 98
    .line 99
    invoke-direct {p1}, Lcom/tencent/bugly/proguard/kf;-><init>()V

    .line 100
    return-object p1

    .line 101
    :cond_6
    const/4 p1, 0x0

    .line 102
    return-object p1
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
