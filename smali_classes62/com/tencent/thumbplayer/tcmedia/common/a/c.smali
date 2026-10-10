.class public Lcom/tencent/thumbplayer/tcmedia/common/a/c;
.super Ljava/lang/Object;


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
.end method

.method private a(Lcom/tencent/thumbplayer/tcmedia/common/a/d$a;Lcom/tencent/thumbplayer/tcmedia/common/a/a;)V
    .locals 2

    .line 2
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/common/a/c;->b()Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;->getMaxProfile()I

    move-result v1

    iput v1, p1, Lcom/tencent/thumbplayer/tcmedia/common/a/d$a;->a:I

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;->getMaxLevel()I

    move-result v0

    iput v0, p1, Lcom/tencent/thumbplayer/tcmedia/common/a/d$a;->b:I

    :cond_0
    invoke-virtual {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/common/a/d$a;->a(Lcom/tencent/thumbplayer/tcmedia/common/a/a;)V

    return-void
.end method

.method private a(Lcom/tencent/thumbplayer/tcmedia/common/a/d$b;Lcom/tencent/thumbplayer/tcmedia/common/a/a;)V
    .locals 3

    .line 3
    sget v0, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->SDK_INT:I

    iput v0, p1, Lcom/tencent/thumbplayer/tcmedia/common/a/d$b;->c:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/config/TPPlayerConfig;->getPlatform()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/thumbplayer/tcmedia/common/a/d$b;->a:Ljava/lang/String;

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/config/TPPlayerConfig;->getPlatform()I

    move-result v0

    iput v0, p1, Lcom/tencent/thumbplayer/tcmedia/common/a/d$b;->b:I

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getOsVersion()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Android %s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/thumbplayer/tcmedia/common/a/d$b;->d:Ljava/lang/String;

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getDeviceManufacturer()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%s_%s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/thumbplayer/tcmedia/common/a/d$b;->e:Ljava/lang/String;

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->getCpuHarewareName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/thumbplayer/tcmedia/common/a/d$b;->g:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/common/a/d$b;->a(Lcom/tencent/thumbplayer/tcmedia/common/a/a;)V

    return-void
.end method

.method private a(Lcom/tencent/thumbplayer/tcmedia/common/a/d$c;Lcom/tencent/thumbplayer/tcmedia/common/a/a;)V
    .locals 2

    .line 4
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/common/a/c;->e()Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;->getMaxProfile()I

    move-result v1

    iput v1, p1, Lcom/tencent/thumbplayer/tcmedia/common/a/d$c;->a:I

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;->getMaxLevel()I

    move-result v0

    iput v0, p1, Lcom/tencent/thumbplayer/tcmedia/common/a/d$c;->b:I

    :cond_0
    invoke-virtual {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/common/a/d$c;->a(Lcom/tencent/thumbplayer/tcmedia/common/a/a;)V

    return-void
.end method

.method private a(Lcom/tencent/thumbplayer/tcmedia/common/a/d$d;Lcom/tencent/thumbplayer/tcmedia/common/a/a;)V
    .locals 2

    .line 5
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/common/a/c;->d()Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;->getMaxProfile()I

    move-result v1

    iput v1, p1, Lcom/tencent/thumbplayer/tcmedia/common/a/d$d;->a:I

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;->getMaxLevel()I

    move-result v0

    iput v0, p1, Lcom/tencent/thumbplayer/tcmedia/common/a/d$d;->b:I

    :cond_0
    invoke-virtual {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/common/a/d$d;->a(Lcom/tencent/thumbplayer/tcmedia/common/a/a;)V

    return-void
.end method

.method private a(Lcom/tencent/thumbplayer/tcmedia/common/a/d$e;Lcom/tencent/thumbplayer/tcmedia/common/a/a;)V
    .locals 2

    .line 6
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/common/a/c;->c()Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;->getMaxProfile()I

    move-result v1

    iput v1, p1, Lcom/tencent/thumbplayer/tcmedia/common/a/d$e;->a:I

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;->getMaxLevel()I

    move-result v0

    iput v0, p1, Lcom/tencent/thumbplayer/tcmedia/common/a/d$e;->b:I

    :cond_0
    invoke-virtual {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/common/a/d$e;->a(Lcom/tencent/thumbplayer/tcmedia/common/a/a;)V

    return-void
.end method

.method private static b()Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;
    .locals 3

    .line 1
    .line 2
    const/16 v0, 0x405

    .line 3
    .line 4
    const/16 v1, 0x66

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-static {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/api/capability/TPCapability;->getThumbPlayerVCodecTypeMaxCapability(II)Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;

    .line 9
    move-result-object v0
    :try_end_0
    .catch Lcom/tencent/thumbplayer/tcmedia/api/TPNativeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    goto :goto_0

    .line 11
    :catch_0
    move-exception v0

    .line 12
    .line 13
    const-string v1, "TPDeviceCapabilityReportManager"

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v0}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    move-object v0, v2

    .line 18
    .line 19
    :goto_0
    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;->mDefaultVCodecCapability:Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;

    .line 20
    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    return-object v2

    .line 23
    :cond_0
    return-object v0
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
.end method

.method private static c()Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;
    .locals 3

    .line 1
    .line 2
    const/16 v0, 0xa6

    .line 3
    .line 4
    const/16 v1, 0x66

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-static {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/api/capability/TPCapability;->getThumbPlayerVCodecTypeMaxCapability(II)Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;

    .line 9
    move-result-object v0
    :try_end_0
    .catch Lcom/tencent/thumbplayer/tcmedia/api/TPNativeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    goto :goto_0

    .line 11
    :catch_0
    move-exception v0

    .line 12
    .line 13
    const-string v1, "TPDeviceCapabilityReportManager"

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v0}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    move-object v0, v2

    .line 18
    .line 19
    :goto_0
    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;->mDefaultVCodecCapability:Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;

    .line 20
    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    return-object v2

    .line 23
    :cond_0
    return-object v0
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
.end method

.method private static d()Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;
    .locals 3

    .line 1
    .line 2
    const/16 v0, 0x8a

    .line 3
    .line 4
    const/16 v1, 0x66

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-static {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/api/capability/TPCapability;->getThumbPlayerVCodecTypeMaxCapability(II)Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;

    .line 9
    move-result-object v0
    :try_end_0
    .catch Lcom/tencent/thumbplayer/tcmedia/api/TPNativeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    goto :goto_0

    .line 11
    :catch_0
    move-exception v0

    .line 12
    .line 13
    const-string v1, "TPDeviceCapabilityReportManager"

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v0}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    move-object v0, v2

    .line 18
    .line 19
    :goto_0
    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;->mDefaultVCodecCapability:Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;

    .line 20
    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    return-object v2

    .line 23
    :cond_0
    return-object v0
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
.end method

.method private static e()Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;
    .locals 3

    .line 1
    .line 2
    const/16 v0, 0xac

    .line 3
    .line 4
    const/16 v1, 0x66

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-static {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/api/capability/TPCapability;->getThumbPlayerVCodecTypeMaxCapability(II)Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;

    .line 9
    move-result-object v0
    :try_end_0
    .catch Lcom/tencent/thumbplayer/tcmedia/api/TPNativeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    goto :goto_0

    .line 11
    :catch_0
    move-exception v0

    .line 12
    .line 13
    const-string v1, "TPDeviceCapabilityReportManager"

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v0}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    move-object v0, v2

    .line 18
    .line 19
    :goto_0
    sget-object v1, Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;->mDefaultVCodecCapability:Lcom/tencent/thumbplayer/tcmedia/api/capability/TPVCodecCapabilityForGet;

    .line 20
    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    return-object v2

    .line 23
    :cond_0
    return-object v0
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
.end method

.method private f()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/common/a/d;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/common/a/d;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/tencent/thumbplayer/tcmedia/utils/l;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/tencent/thumbplayer/tcmedia/utils/l;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/common/a/d;->a()Lcom/tencent/thumbplayer/tcmedia/common/a/d$b;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v2, v1}, Lcom/tencent/thumbplayer/tcmedia/common/a/c;->a(Lcom/tencent/thumbplayer/tcmedia/common/a/d$b;Lcom/tencent/thumbplayer/tcmedia/common/a/a;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/common/a/d;->b()Lcom/tencent/thumbplayer/tcmedia/common/a/d$a;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, v2, v1}, Lcom/tencent/thumbplayer/tcmedia/common/a/c;->a(Lcom/tencent/thumbplayer/tcmedia/common/a/d$a;Lcom/tencent/thumbplayer/tcmedia/common/a/a;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/common/a/d;->c()Lcom/tencent/thumbplayer/tcmedia/common/a/d$e;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, v2, v1}, Lcom/tencent/thumbplayer/tcmedia/common/a/c;->a(Lcom/tencent/thumbplayer/tcmedia/common/a/d$e;Lcom/tencent/thumbplayer/tcmedia/common/a/a;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/common/a/d;->d()Lcom/tencent/thumbplayer/tcmedia/common/a/d$d;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, v2, v1}, Lcom/tencent/thumbplayer/tcmedia/common/a/c;->a(Lcom/tencent/thumbplayer/tcmedia/common/a/d$d;Lcom/tencent/thumbplayer/tcmedia/common/a/a;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/common/a/d;->e()Lcom/tencent/thumbplayer/tcmedia/common/a/d$c;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, v0, v1}, Lcom/tencent/thumbplayer/tcmedia/common/a/c;->a(Lcom/tencent/thumbplayer/tcmedia/common/a/d$c;Lcom/tencent/thumbplayer/tcmedia/common/a/a;)V

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
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/common/a/c;->f()V

    return-void
.end method
