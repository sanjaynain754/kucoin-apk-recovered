.class public final Lcom/tencent/bugly/proguard/ge$c;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/ge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
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

.method public static a([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/ge$b;
    .locals 4

    .line 1
    .line 2
    const-string v0, "Bugly.PowerHooker"

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
    const-string v1, "createAcquireWakeLockArgs args null"

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
    const-string v2, "createAcquireWakeLockArgs apiLevel:%d, codeName:%s, versionRelease:%s"

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v2, v1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0}, Lcom/tencent/bugly/proguard/ge$c;->d([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/ge$b;

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

.method public static b([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/ge$b;
    .locals 6

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x4

    .line 3
    const/4 v2, 0x0

    .line 4
    .line 5
    const-string v3, "Bugly.PowerHooker"

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
    const-string v0, "createAcquireWakeLockArgs4 args length invalid : %d"

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    return-object v2

    .line 23
    .line 24
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/ge$b;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/ge$b;-><init>()V

    .line 28
    const/4 v1, 0x2

    .line 29
    .line 30
    aget-object v1, p0, v1

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    instance-of v4, v1, Ljava/lang/String;

    .line 35
    .line 36
    if-nez v4, :cond_1

    .line 37
    .line 38
    .line 39
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 40
    move-result-object p0

    .line 41
    .line 42
    const-string v0, "createAcquireWakeLockArgs6 args idx 2 not String, %s"

    .line 43
    .line 44
    .line 45
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    return-object v2

    .line 47
    .line 48
    :cond_1
    check-cast v1, Ljava/lang/String;

    .line 49
    .line 50
    iput-object v1, v0, Lcom/tencent/bugly/proguard/ge$b;->c:Ljava/lang/String;

    .line 51
    const/4 v1, 0x3

    .line 52
    .line 53
    aget-object v1, p0, v1

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    instance-of v4, v1, Landroid/os/WorkSource;

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
    const-string v0, "createAcquireWakeLockArgs6 args idx 3 not WorkSource, %s"

    .line 66
    .line 67
    .line 68
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    return-object v2

    .line 70
    .line 71
    :cond_2
    check-cast v1, Landroid/os/WorkSource;

    .line 72
    .line 73
    iput-object v1, v0, Lcom/tencent/bugly/proguard/ge$b;->e:Landroid/os/WorkSource;

    .line 74
    const/4 v1, 0x0

    .line 75
    .line 76
    aget-object v1, p0, v1

    .line 77
    .line 78
    instance-of v4, v1, Ljava/lang/Integer;

    .line 79
    const/4 v5, 0x1

    .line 80
    .line 81
    if-eqz v4, :cond_4

    .line 82
    .line 83
    check-cast v1, Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 87
    move-result v1

    .line 88
    .line 89
    iput v1, v0, Lcom/tencent/bugly/proguard/ge$b;->b:I

    .line 90
    .line 91
    aget-object p0, p0, v5

    .line 92
    .line 93
    instance-of v1, p0, Landroid/os/IBinder;

    .line 94
    .line 95
    if-nez v1, :cond_3

    .line 96
    .line 97
    .line 98
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 99
    move-result-object p0

    .line 100
    .line 101
    const-string v0, "createAcquireWakeLockArgs6 args idx 1 not IBinder, %s"

    .line 102
    .line 103
    .line 104
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    return-object v2

    .line 106
    .line 107
    :cond_3
    check-cast p0, Landroid/os/IBinder;

    .line 108
    .line 109
    iput-object p0, v0, Lcom/tencent/bugly/proguard/ge$b;->a:Landroid/os/IBinder;

    .line 110
    return-object v0

    .line 111
    .line 112
    :cond_4
    instance-of v4, v1, Landroid/os/IBinder;

    .line 113
    .line 114
    if-eqz v4, :cond_6

    .line 115
    .line 116
    check-cast v1, Landroid/os/IBinder;

    .line 117
    .line 118
    iput-object v1, v0, Lcom/tencent/bugly/proguard/ge$b;->a:Landroid/os/IBinder;

    .line 119
    .line 120
    aget-object p0, p0, v5

    .line 121
    .line 122
    instance-of v1, p0, Ljava/lang/Integer;

    .line 123
    .line 124
    if-nez v1, :cond_5

    .line 125
    .line 126
    .line 127
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 128
    move-result-object p0

    .line 129
    .line 130
    const-string v0, "createAcquireWakeLockArgs4 args idx 1 not Integer, %s"

    .line 131
    .line 132
    .line 133
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    return-object v2

    .line 135
    .line 136
    :cond_5
    check-cast p0, Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 140
    move-result p0

    .line 141
    .line 142
    iput p0, v0, Lcom/tencent/bugly/proguard/ge$b;->b:I

    .line 143
    return-object v0

    .line 144
    .line 145
    .line 146
    :cond_6
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 147
    move-result-object p0

    .line 148
    .line 149
    const-string v0, "createAcquireWakeLockArgs4 args idx 0 not IBinder an Integer, %s"

    .line 150
    .line 151
    .line 152
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    return-object v2
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

.method public static c([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/ge$b;
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/ge$b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/ge$b;-><init>()V

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    aget-object v1, p0, v1

    .line 9
    .line 10
    instance-of v2, v1, Landroid/os/IBinder;

    .line 11
    const/4 v3, 0x0

    .line 12
    .line 13
    const-string v4, "Bugly.PowerHooker"

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    .line 18
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 19
    move-result-object p0

    .line 20
    .line 21
    const-string v0, "createAcquireWakeLockArgs6 args idx 0 not IBinder, %s"

    .line 22
    .line 23
    .line 24
    invoke-static {v4, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    return-object v3

    .line 26
    .line 27
    :cond_0
    check-cast v1, Landroid/os/IBinder;

    .line 28
    .line 29
    iput-object v1, v0, Lcom/tencent/bugly/proguard/ge$b;->a:Landroid/os/IBinder;

    .line 30
    const/4 v1, 0x1

    .line 31
    .line 32
    aget-object v1, p0, v1

    .line 33
    .line 34
    instance-of v2, v1, Ljava/lang/Integer;

    .line 35
    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    .line 39
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 40
    move-result-object p0

    .line 41
    .line 42
    const-string v0, "createAcquireWakeLockArgs6 args idx 1 not Integer, %s"

    .line 43
    .line 44
    .line 45
    invoke-static {v4, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    return-object v3

    .line 47
    .line 48
    :cond_1
    check-cast v1, Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 52
    move-result v1

    .line 53
    .line 54
    iput v1, v0, Lcom/tencent/bugly/proguard/ge$b;->b:I

    .line 55
    const/4 v1, 0x2

    .line 56
    .line 57
    aget-object v1, p0, v1

    .line 58
    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    instance-of v2, v1, Ljava/lang/String;

    .line 62
    .line 63
    if-nez v2, :cond_2

    .line 64
    .line 65
    .line 66
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 67
    move-result-object p0

    .line 68
    .line 69
    const-string v0, "createAcquireWakeLockArgs6 args idx 2 not String, %s"

    .line 70
    .line 71
    .line 72
    invoke-static {v4, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    return-object v3

    .line 74
    .line 75
    :cond_2
    check-cast v1, Ljava/lang/String;

    .line 76
    .line 77
    iput-object v1, v0, Lcom/tencent/bugly/proguard/ge$b;->c:Ljava/lang/String;

    .line 78
    const/4 v1, 0x3

    .line 79
    .line 80
    aget-object v1, p0, v1

    .line 81
    .line 82
    if-eqz v1, :cond_3

    .line 83
    .line 84
    instance-of v2, v1, Ljava/lang/String;

    .line 85
    .line 86
    if-nez v2, :cond_3

    .line 87
    .line 88
    .line 89
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 90
    move-result-object p0

    .line 91
    .line 92
    const-string v0, "createAcquireWakeLockArgs6 args idx 3 not String, %s"

    .line 93
    .line 94
    .line 95
    invoke-static {v4, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    return-object v3

    .line 97
    .line 98
    :cond_3
    check-cast v1, Ljava/lang/String;

    .line 99
    .line 100
    iput-object v1, v0, Lcom/tencent/bugly/proguard/ge$b;->d:Ljava/lang/String;

    .line 101
    const/4 v1, 0x4

    .line 102
    .line 103
    aget-object v1, p0, v1

    .line 104
    .line 105
    if-eqz v1, :cond_4

    .line 106
    .line 107
    instance-of v2, v1, Landroid/os/WorkSource;

    .line 108
    .line 109
    if-nez v2, :cond_4

    .line 110
    .line 111
    .line 112
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 113
    move-result-object p0

    .line 114
    .line 115
    const-string v0, "createAcquireWakeLockArgs6 args idx 4 not WorkSource, %s"

    .line 116
    .line 117
    .line 118
    invoke-static {v4, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    return-object v3

    .line 120
    .line 121
    :cond_4
    check-cast v1, Landroid/os/WorkSource;

    .line 122
    .line 123
    iput-object v1, v0, Lcom/tencent/bugly/proguard/ge$b;->e:Landroid/os/WorkSource;

    .line 124
    array-length v1, p0

    .line 125
    const/4 v2, 0x5

    .line 126
    .line 127
    if-ne v1, v2, :cond_5

    .line 128
    return-object v0

    .line 129
    .line 130
    :cond_5
    aget-object p0, p0, v2

    .line 131
    .line 132
    if-eqz p0, :cond_6

    .line 133
    .line 134
    instance-of v1, p0, Ljava/lang/String;

    .line 135
    .line 136
    if-nez v1, :cond_6

    .line 137
    .line 138
    .line 139
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 140
    move-result-object p0

    .line 141
    .line 142
    const-string v0, "createAcquireWakeLockArgs6 args idx 5 not String, %s"

    .line 143
    .line 144
    .line 145
    invoke-static {v4, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    return-object v3

    .line 147
    .line 148
    :cond_6
    check-cast p0, Ljava/lang/String;

    .line 149
    .line 150
    iput-object p0, v0, Lcom/tencent/bugly/proguard/ge$b;->f:Ljava/lang/String;

    .line 151
    return-object v0
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

.method public static d([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/ge$b;
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
    const-string v2, "Bugly.PowerHooker"

    .line 12
    .line 13
    const-string v3, "createAcquireWakeLockArgsAccordingToArgsLength: length:%s"

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v3, v1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    const/4 v1, 0x4

    .line 18
    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Lcom/tencent/bugly/proguard/ge$c;->c([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/ge$b;

    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-static {p0}, Lcom/tencent/bugly/proguard/ge$c;->b([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/ge$b;

    .line 28
    move-result-object p0

    .line 29
    return-object p0
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
.end method
