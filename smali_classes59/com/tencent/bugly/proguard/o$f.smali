.class public final Lcom/tencent/bugly/proguard/o$f;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


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

.method public static a([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/o$e;
    .locals 4

    .line 1
    .line 2
    const-string v0, "Bugly.AlarmHooker"

    .line 3
    .line 4
    if-nez p0, :cond_0

    .line 5
    const/4 p0, 0x0

    .line 6
    .line 7
    new-array p0, p0, [Ljava/lang/Object;

    .line 8
    .line 9
    const-string v1, "createSetArgs args null"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    .line 16
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    sget-object v3, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    filled-new-array {v2, v3, v1}, [Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    const-string v2, "createSetArgs apiLevel:%d, codeName:%s, versionRelease:%s"

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v2, v1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0}, Lcom/tencent/bugly/proguard/o$f;->g([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/o$e;

    .line 39
    move-result-object p0

    .line 40
    return-object p0
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

.method public static b([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/o$e;
    .locals 6

    .line 1
    array-length v0, p0

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    const-string v3, "Bugly.AlarmHooker"

    .line 7
    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    array-length p0, p0

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    move-result-object p0

    .line 14
    .line 15
    .line 16
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 17
    move-result-object p0

    .line 18
    .line 19
    const-string v0, "createSetArgs args length invalid : %d"

    .line 20
    .line 21
    .line 22
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    return-object v2

    .line 24
    .line 25
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/o$e;

    .line 26
    .line 27
    .line 28
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/o$e;-><init>()V

    .line 29
    const/4 v1, 0x1

    .line 30
    .line 31
    aget-object v1, p0, v1

    .line 32
    .line 33
    instance-of v4, v1, Ljava/lang/Integer;

    .line 34
    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    .line 38
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 39
    move-result-object p0

    .line 40
    .line 41
    const-string v0, "createSetArgs args idx 1 not Integer, %s"

    .line 42
    .line 43
    .line 44
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    return-object v2

    .line 46
    .line 47
    :cond_1
    check-cast v1, Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 51
    move-result v1

    .line 52
    .line 53
    iput v1, v0, Lcom/tencent/bugly/proguard/o$e;->a:I

    .line 54
    const/4 v1, 0x2

    .line 55
    .line 56
    aget-object v1, p0, v1

    .line 57
    .line 58
    instance-of v4, v1, Ljava/lang/Long;

    .line 59
    .line 60
    if-nez v4, :cond_2

    .line 61
    .line 62
    .line 63
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 64
    move-result-object p0

    .line 65
    .line 66
    const-string v0, "createSetArgs args idx 2 not Long, %s"

    .line 67
    .line 68
    .line 69
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    return-object v2

    .line 71
    .line 72
    :cond_2
    check-cast v1, Ljava/lang/Long;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 76
    move-result-wide v4

    .line 77
    .line 78
    iput-wide v4, v0, Lcom/tencent/bugly/proguard/o$e;->b:J

    .line 79
    const/4 v1, 0x3

    .line 80
    .line 81
    aget-object v1, p0, v1

    .line 82
    .line 83
    instance-of v4, v1, Ljava/lang/Long;

    .line 84
    .line 85
    if-nez v4, :cond_3

    .line 86
    .line 87
    .line 88
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 89
    move-result-object p0

    .line 90
    .line 91
    const-string v0, "createSetArgs args idx 3 not Long, %s"

    .line 92
    .line 93
    .line 94
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    return-object v2

    .line 96
    .line 97
    :cond_3
    check-cast v1, Ljava/lang/Long;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 101
    move-result-wide v4

    .line 102
    .line 103
    iput-wide v4, v0, Lcom/tencent/bugly/proguard/o$e;->c:J

    .line 104
    const/4 v1, 0x4

    .line 105
    .line 106
    aget-object v1, p0, v1

    .line 107
    .line 108
    instance-of v4, v1, Ljava/lang/Long;

    .line 109
    .line 110
    if-nez v4, :cond_4

    .line 111
    .line 112
    .line 113
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 114
    move-result-object p0

    .line 115
    .line 116
    const-string v0, "createSetArgs args idx 4 not Long, %s"

    .line 117
    .line 118
    .line 119
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    return-object v2

    .line 121
    .line 122
    :cond_4
    check-cast v1, Ljava/lang/Long;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 126
    move-result-wide v4

    .line 127
    .line 128
    iput-wide v4, v0, Lcom/tencent/bugly/proguard/o$e;->d:J

    .line 129
    const/4 v1, 0x5

    .line 130
    .line 131
    aget-object v1, p0, v1

    .line 132
    .line 133
    instance-of v4, v1, Ljava/lang/Integer;

    .line 134
    .line 135
    if-nez v4, :cond_5

    .line 136
    .line 137
    .line 138
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 139
    move-result-object p0

    .line 140
    .line 141
    const-string v0, "createSetArgs args idx 5 not Integer, %s"

    .line 142
    .line 143
    .line 144
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    return-object v2

    .line 146
    .line 147
    :cond_5
    check-cast v1, Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 151
    move-result v1

    .line 152
    .line 153
    iput v1, v0, Lcom/tencent/bugly/proguard/o$e;->e:I

    .line 154
    const/4 v1, 0x6

    .line 155
    .line 156
    aget-object p0, p0, v1

    .line 157
    .line 158
    if-eqz p0, :cond_6

    .line 159
    .line 160
    instance-of v1, p0, Landroid/app/PendingIntent;

    .line 161
    .line 162
    if-nez v1, :cond_6

    .line 163
    .line 164
    .line 165
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 166
    move-result-object p0

    .line 167
    .line 168
    const-string v0, "createSetArgs args idx 6 not PendingIntent, %s"

    .line 169
    .line 170
    .line 171
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    return-object v2

    .line 173
    .line 174
    :cond_6
    check-cast p0, Landroid/app/PendingIntent;

    .line 175
    .line 176
    iput-object p0, v0, Lcom/tencent/bugly/proguard/o$e;->f:Landroid/app/PendingIntent;

    .line 177
    return-object v0
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

.method public static c([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/o$e;
    .locals 6

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x0

    .line 4
    .line 5
    const-string v3, "Bugly.AlarmHooker"

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    array-length p0, p0

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    .line 15
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 16
    move-result-object p0

    .line 17
    .line 18
    const-string v0, "createSetArgs args length invalid : %d"

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    return-object v2

    .line 23
    .line 24
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/o$e;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/o$e;-><init>()V

    .line 28
    const/4 v1, 0x0

    .line 29
    .line 30
    aget-object v1, p0, v1

    .line 31
    .line 32
    instance-of v4, v1, Ljava/lang/Integer;

    .line 33
    .line 34
    if-nez v4, :cond_1

    .line 35
    .line 36
    .line 37
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 38
    move-result-object p0

    .line 39
    .line 40
    const-string v0, "createSetArgs args idx 0 not Integer, %s"

    .line 41
    .line 42
    .line 43
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    return-object v2

    .line 45
    .line 46
    :cond_1
    check-cast v1, Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 50
    move-result v1

    .line 51
    .line 52
    iput v1, v0, Lcom/tencent/bugly/proguard/o$e;->a:I

    .line 53
    const/4 v1, 0x1

    .line 54
    .line 55
    aget-object v1, p0, v1

    .line 56
    .line 57
    instance-of v4, v1, Ljava/lang/Long;

    .line 58
    .line 59
    if-nez v4, :cond_2

    .line 60
    .line 61
    .line 62
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 63
    move-result-object p0

    .line 64
    .line 65
    const-string v0, "createSetArgs args idx 1 not Long, %s"

    .line 66
    .line 67
    .line 68
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    return-object v2

    .line 70
    .line 71
    :cond_2
    check-cast v1, Ljava/lang/Long;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 75
    move-result-wide v4

    .line 76
    .line 77
    iput-wide v4, v0, Lcom/tencent/bugly/proguard/o$e;->b:J

    .line 78
    const/4 v1, 0x2

    .line 79
    .line 80
    aget-object p0, p0, v1

    .line 81
    .line 82
    if-eqz p0, :cond_3

    .line 83
    .line 84
    instance-of v1, p0, Landroid/app/PendingIntent;

    .line 85
    .line 86
    if-nez v1, :cond_3

    .line 87
    .line 88
    .line 89
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 90
    move-result-object p0

    .line 91
    .line 92
    const-string v0, "createSetArgs args idx 2 not PendingIntent, %s"

    .line 93
    .line 94
    .line 95
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    return-object v2

    .line 97
    .line 98
    :cond_3
    check-cast p0, Landroid/app/PendingIntent;

    .line 99
    .line 100
    iput-object p0, v0, Lcom/tencent/bugly/proguard/o$e;->f:Landroid/app/PendingIntent;

    .line 101
    return-object v0
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

.method public static d([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/o$e;
    .locals 6

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x4

    .line 3
    const/4 v2, 0x0

    .line 4
    .line 5
    const-string v3, "Bugly.AlarmHooker"

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    array-length p0, p0

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    .line 15
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 16
    move-result-object p0

    .line 17
    .line 18
    const-string v0, "createSetArgs args length invalid : %d"

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    return-object v2

    .line 23
    .line 24
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/o$e;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/o$e;-><init>()V

    .line 28
    const/4 v1, 0x0

    .line 29
    .line 30
    aget-object v1, p0, v1

    .line 31
    .line 32
    instance-of v4, v1, Ljava/lang/Integer;

    .line 33
    .line 34
    if-nez v4, :cond_1

    .line 35
    .line 36
    .line 37
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 38
    move-result-object p0

    .line 39
    .line 40
    const-string v0, "createSetArgs args idx 0 not Integer, %s"

    .line 41
    .line 42
    .line 43
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    return-object v2

    .line 45
    .line 46
    :cond_1
    check-cast v1, Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 50
    move-result v1

    .line 51
    .line 52
    iput v1, v0, Lcom/tencent/bugly/proguard/o$e;->a:I

    .line 53
    const/4 v1, 0x1

    .line 54
    .line 55
    aget-object v1, p0, v1

    .line 56
    .line 57
    instance-of v4, v1, Ljava/lang/Long;

    .line 58
    .line 59
    if-nez v4, :cond_2

    .line 60
    .line 61
    .line 62
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 63
    move-result-object p0

    .line 64
    .line 65
    const-string v0, "createSetArgs args idx 1 not Long, %s"

    .line 66
    .line 67
    .line 68
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    return-object v2

    .line 70
    .line 71
    :cond_2
    check-cast v1, Ljava/lang/Long;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 75
    move-result-wide v4

    .line 76
    .line 77
    iput-wide v4, v0, Lcom/tencent/bugly/proguard/o$e;->b:J

    .line 78
    const/4 v1, 0x2

    .line 79
    .line 80
    aget-object v1, p0, v1

    .line 81
    .line 82
    instance-of v4, v1, Ljava/lang/Long;

    .line 83
    .line 84
    if-nez v4, :cond_3

    .line 85
    .line 86
    .line 87
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 88
    move-result-object p0

    .line 89
    .line 90
    const-string v0, "createSetArgs args idx 2 not Long, %s"

    .line 91
    .line 92
    .line 93
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    return-object v2

    .line 95
    .line 96
    :cond_3
    check-cast v1, Ljava/lang/Long;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 100
    move-result-wide v4

    .line 101
    .line 102
    iput-wide v4, v0, Lcom/tencent/bugly/proguard/o$e;->d:J

    .line 103
    const/4 v1, 0x3

    .line 104
    .line 105
    aget-object p0, p0, v1

    .line 106
    .line 107
    if-eqz p0, :cond_4

    .line 108
    .line 109
    instance-of v1, p0, Landroid/app/PendingIntent;

    .line 110
    .line 111
    if-nez v1, :cond_4

    .line 112
    .line 113
    .line 114
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 115
    move-result-object p0

    .line 116
    .line 117
    const-string v0, "createSetArgs args idx 3 not PendingIntent, %s"

    .line 118
    .line 119
    .line 120
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    return-object v2

    .line 122
    .line 123
    :cond_4
    check-cast p0, Landroid/app/PendingIntent;

    .line 124
    .line 125
    iput-object p0, v0, Lcom/tencent/bugly/proguard/o$e;->f:Landroid/app/PendingIntent;

    .line 126
    return-object v0
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

.method public static e([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/o$e;
    .locals 6

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x7

    .line 3
    const/4 v2, 0x0

    .line 4
    .line 5
    const-string v3, "Bugly.AlarmHooker"

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    array-length v0, p0

    .line 9
    const/4 v1, 0x6

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    array-length p0, p0

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    move-result-object p0

    .line 17
    .line 18
    .line 19
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 20
    move-result-object p0

    .line 21
    .line 22
    const-string v0, "createSetArgs args length invalid : %d"

    .line 23
    .line 24
    .line 25
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    return-object v2

    .line 27
    .line 28
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/o$e;

    .line 29
    .line 30
    .line 31
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/o$e;-><init>()V

    .line 32
    const/4 v1, 0x0

    .line 33
    .line 34
    aget-object v1, p0, v1

    .line 35
    .line 36
    instance-of v4, v1, Ljava/lang/Integer;

    .line 37
    .line 38
    if-nez v4, :cond_1

    .line 39
    .line 40
    .line 41
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 42
    move-result-object p0

    .line 43
    .line 44
    const-string v0, "createSetArgs args idx 0 not Integer, %s"

    .line 45
    .line 46
    .line 47
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    return-object v2

    .line 49
    .line 50
    :cond_1
    check-cast v1, Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 54
    move-result v1

    .line 55
    .line 56
    iput v1, v0, Lcom/tencent/bugly/proguard/o$e;->a:I

    .line 57
    const/4 v1, 0x1

    .line 58
    .line 59
    aget-object v1, p0, v1

    .line 60
    .line 61
    instance-of v4, v1, Ljava/lang/Long;

    .line 62
    .line 63
    if-nez v4, :cond_2

    .line 64
    .line 65
    .line 66
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 67
    move-result-object p0

    .line 68
    .line 69
    const-string v0, "createSetArgs args idx 1 not Long, %s"

    .line 70
    .line 71
    .line 72
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    return-object v2

    .line 74
    .line 75
    :cond_2
    check-cast v1, Ljava/lang/Long;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 79
    move-result-wide v4

    .line 80
    .line 81
    iput-wide v4, v0, Lcom/tencent/bugly/proguard/o$e;->b:J

    .line 82
    const/4 v1, 0x2

    .line 83
    .line 84
    aget-object v1, p0, v1

    .line 85
    .line 86
    instance-of v4, v1, Ljava/lang/Long;

    .line 87
    .line 88
    if-nez v4, :cond_3

    .line 89
    .line 90
    .line 91
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 92
    move-result-object p0

    .line 93
    .line 94
    const-string v0, "createSetArgs args idx 2 not Long, %s"

    .line 95
    .line 96
    .line 97
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    return-object v2

    .line 99
    .line 100
    :cond_3
    check-cast v1, Ljava/lang/Long;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 104
    move-result-wide v4

    .line 105
    .line 106
    iput-wide v4, v0, Lcom/tencent/bugly/proguard/o$e;->c:J

    .line 107
    const/4 v1, 0x3

    .line 108
    .line 109
    aget-object v1, p0, v1

    .line 110
    .line 111
    instance-of v4, v1, Ljava/lang/Long;

    .line 112
    .line 113
    if-nez v4, :cond_4

    .line 114
    .line 115
    .line 116
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 117
    move-result-object p0

    .line 118
    .line 119
    const-string v0, "createSetArgs args idx 3 not Long, %s"

    .line 120
    .line 121
    .line 122
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    return-object v2

    .line 124
    .line 125
    :cond_4
    check-cast v1, Ljava/lang/Long;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 129
    move-result-wide v4

    .line 130
    .line 131
    iput-wide v4, v0, Lcom/tencent/bugly/proguard/o$e;->d:J

    .line 132
    const/4 v1, 0x4

    .line 133
    .line 134
    aget-object p0, p0, v1

    .line 135
    .line 136
    if-eqz p0, :cond_5

    .line 137
    .line 138
    instance-of v1, p0, Landroid/app/PendingIntent;

    .line 139
    .line 140
    if-nez v1, :cond_5

    .line 141
    .line 142
    .line 143
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 144
    move-result-object p0

    .line 145
    .line 146
    const-string v0, "createSetArgs args idx 4 not PendingIntent, %s"

    .line 147
    .line 148
    .line 149
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    return-object v2

    .line 151
    .line 152
    :cond_5
    check-cast p0, Landroid/app/PendingIntent;

    .line 153
    .line 154
    iput-object p0, v0, Lcom/tencent/bugly/proguard/o$e;->f:Landroid/app/PendingIntent;

    .line 155
    return-object v0
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

.method public static f([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/o$e;
    .locals 6

    .line 1
    array-length v0, p0

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    const-string v3, "Bugly.AlarmHooker"

    .line 7
    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    array-length p0, p0

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    move-result-object p0

    .line 14
    .line 15
    .line 16
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 17
    move-result-object p0

    .line 18
    .line 19
    const-string v0, "createSetArgs args length invalid : %d"

    .line 20
    .line 21
    .line 22
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    return-object v2

    .line 24
    .line 25
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/o$e;

    .line 26
    .line 27
    .line 28
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/o$e;-><init>()V

    .line 29
    const/4 v1, 0x0

    .line 30
    .line 31
    aget-object v1, p0, v1

    .line 32
    .line 33
    instance-of v4, v1, Ljava/lang/Integer;

    .line 34
    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    .line 38
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 39
    move-result-object p0

    .line 40
    .line 41
    const-string v0, "createSetArgs args idx 0 not Integer, %s"

    .line 42
    .line 43
    .line 44
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    return-object v2

    .line 46
    .line 47
    :cond_1
    check-cast v1, Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 51
    move-result v1

    .line 52
    .line 53
    iput v1, v0, Lcom/tencent/bugly/proguard/o$e;->a:I

    .line 54
    const/4 v1, 0x1

    .line 55
    .line 56
    aget-object v1, p0, v1

    .line 57
    .line 58
    instance-of v4, v1, Ljava/lang/Long;

    .line 59
    .line 60
    if-nez v4, :cond_2

    .line 61
    .line 62
    .line 63
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 64
    move-result-object p0

    .line 65
    .line 66
    const-string v0, "createSetArgs args idx 1 not Long, %s"

    .line 67
    .line 68
    .line 69
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    return-object v2

    .line 71
    .line 72
    :cond_2
    check-cast v1, Ljava/lang/Long;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 76
    move-result-wide v4

    .line 77
    .line 78
    iput-wide v4, v0, Lcom/tencent/bugly/proguard/o$e;->b:J

    .line 79
    const/4 v1, 0x2

    .line 80
    .line 81
    aget-object v1, p0, v1

    .line 82
    .line 83
    instance-of v4, v1, Ljava/lang/Long;

    .line 84
    .line 85
    if-nez v4, :cond_3

    .line 86
    .line 87
    .line 88
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 89
    move-result-object p0

    .line 90
    .line 91
    const-string v0, "createSetArgs args idx 2 not Long, %s"

    .line 92
    .line 93
    .line 94
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    return-object v2

    .line 96
    .line 97
    :cond_3
    check-cast v1, Ljava/lang/Long;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 101
    move-result-wide v4

    .line 102
    .line 103
    iput-wide v4, v0, Lcom/tencent/bugly/proguard/o$e;->c:J

    .line 104
    const/4 v1, 0x3

    .line 105
    .line 106
    aget-object v1, p0, v1

    .line 107
    .line 108
    instance-of v4, v1, Ljava/lang/Long;

    .line 109
    .line 110
    if-nez v4, :cond_4

    .line 111
    .line 112
    .line 113
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 114
    move-result-object p0

    .line 115
    .line 116
    const-string v0, "createSetArgs args idx 3 not Long, %s"

    .line 117
    .line 118
    .line 119
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    return-object v2

    .line 121
    .line 122
    :cond_4
    check-cast v1, Ljava/lang/Long;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 126
    move-result-wide v4

    .line 127
    .line 128
    iput-wide v4, v0, Lcom/tencent/bugly/proguard/o$e;->d:J

    .line 129
    const/4 v1, 0x4

    .line 130
    .line 131
    aget-object v1, p0, v1

    .line 132
    .line 133
    instance-of v4, v1, Ljava/lang/Integer;

    .line 134
    .line 135
    if-nez v4, :cond_5

    .line 136
    .line 137
    .line 138
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 139
    move-result-object p0

    .line 140
    .line 141
    const-string v0, "createSetArgs args idx 4 not Integer, %s"

    .line 142
    .line 143
    .line 144
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    return-object v2

    .line 146
    .line 147
    :cond_5
    check-cast v1, Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 151
    move-result v1

    .line 152
    .line 153
    iput v1, v0, Lcom/tencent/bugly/proguard/o$e;->e:I

    .line 154
    const/4 v1, 0x5

    .line 155
    .line 156
    aget-object p0, p0, v1

    .line 157
    .line 158
    if-eqz p0, :cond_6

    .line 159
    .line 160
    instance-of v1, p0, Landroid/app/PendingIntent;

    .line 161
    .line 162
    if-nez v1, :cond_6

    .line 163
    .line 164
    .line 165
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 166
    move-result-object p0

    .line 167
    .line 168
    const-string v0, "createSetArgs args idx 5 not PendingIntent, %s"

    .line 169
    .line 170
    .line 171
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    return-object v2

    .line 173
    .line 174
    :cond_6
    check-cast p0, Landroid/app/PendingIntent;

    .line 175
    .line 176
    iput-object p0, v0, Lcom/tencent/bugly/proguard/o$e;->f:Landroid/app/PendingIntent;

    .line 177
    return-object v0
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

.method public static g([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/o$e;
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    move-result-object v1

    .line 6
    .line 7
    .line 8
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    const-string v2, "Bugly.AlarmHooker"

    .line 12
    .line 13
    const-string v3, "createSetArgsAccordingToArgsLength: length:%s"

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v3, v1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    const/4 v1, 0x3

    .line 18
    .line 19
    if-eq v0, v1, :cond_3

    .line 20
    const/4 v1, 0x4

    .line 21
    .line 22
    if-eq v0, v1, :cond_2

    .line 23
    const/4 v1, 0x6

    .line 24
    .line 25
    if-eq v0, v1, :cond_1

    .line 26
    const/4 v1, 0x7

    .line 27
    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    .line 30
    const/16 v1, 0x8

    .line 31
    .line 32
    if-eq v0, v1, :cond_0

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, Lcom/tencent/bugly/proguard/o$f;->b([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/o$e;

    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-static {p0}, Lcom/tencent/bugly/proguard/o$f;->f([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/o$e;

    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/o$f;->e([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/o$e;

    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-static {p0}, Lcom/tencent/bugly/proguard/o$f;->d([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/o$e;

    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    .line 54
    .line 55
    :cond_3
    invoke-static {p0}, Lcom/tencent/bugly/proguard/o$f;->c([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/o$e;

    .line 56
    move-result-object p0

    .line 57
    return-object p0
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
