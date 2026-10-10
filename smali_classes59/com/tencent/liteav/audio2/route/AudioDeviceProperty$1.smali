.class final Lcom/tencent/liteav/audio2/route/AudioDeviceProperty$1;
.super Landroid/media/AudioDeviceCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;->buildAudioDeviceCallback()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty$1;->a:Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Landroid/media/AudioDeviceCallback;-><init>()V

    .line 6
    return-void
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
.end method


# virtual methods
.method public final onAudioDevicesAdded([Landroid/media/AudioDeviceInfo;)V
    .locals 9

    .line 1
    array-length v0, p1

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_4

    .line 6
    .line 7
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v1, "add device size "

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    array-length v1, p1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x0

    .line 22
    .line 23
    new-array v2, v1, [Ljava/lang/Object;

    .line 24
    .line 25
    const-string v3, "AudioDeviceProperty"

    .line 26
    .line 27
    .line 28
    invoke-static {v3, v0, v2}, Lcom/tencent/liteav/base/Log;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    .line 30
    iget-object v0, p0, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty$1;->a:Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;

    .line 31
    const/4 v2, 0x1

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v2}, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;->access$002(Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;Z)Z

    .line 35
    array-length v0, p1

    .line 36
    move v4, v1

    .line 37
    .line 38
    :goto_0
    if-ge v4, v0, :cond_7

    .line 39
    .line 40
    aget-object v5, p1, v4

    .line 41
    .line 42
    new-instance v6, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v7, "added device type is "

    .line 45
    .line 46
    .line 47
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 51
    move-result v7

    .line 52
    .line 53
    .line 54
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v7, " sink: "

    .line 57
    .line 58
    .line 59
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5}, Landroid/media/AudioDeviceInfo;->isSink()Z

    .line 63
    move-result v7

    .line 64
    .line 65
    .line 66
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v7, " product name: "

    .line 69
    .line 70
    .line 71
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5}, Landroid/media/AudioDeviceInfo;->getProductName()Ljava/lang/CharSequence;

    .line 75
    move-result-object v7

    .line 76
    .line 77
    .line 78
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    move-result-object v6

    .line 83
    .line 84
    new-array v7, v1, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    invoke-static {v3, v6, v7}, Lcom/tencent/liteav/base/Log;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v5}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 91
    move-result v6

    .line 92
    .line 93
    const/16 v7, 0x8

    .line 94
    .line 95
    if-eq v6, v7, :cond_5

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 99
    move-result v6

    .line 100
    .line 101
    const/16 v7, 0x1a

    .line 102
    .line 103
    if-ne v6, v7, :cond_1

    .line 104
    goto :goto_2

    .line 105
    .line 106
    .line 107
    :cond_1
    invoke-virtual {v5}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 108
    move-result v6

    .line 109
    .line 110
    const/16 v7, 0xb

    .line 111
    .line 112
    if-eq v6, v7, :cond_4

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 116
    move-result v6

    .line 117
    .line 118
    const/16 v7, 0xc

    .line 119
    .line 120
    if-eq v6, v7, :cond_4

    .line 121
    .line 122
    .line 123
    invoke-virtual {v5}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 124
    move-result v6

    .line 125
    .line 126
    const/16 v7, 0x16

    .line 127
    .line 128
    if-ne v6, v7, :cond_2

    .line 129
    goto :goto_1

    .line 130
    .line 131
    .line 132
    :cond_2
    invoke-virtual {v5}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 133
    move-result v6

    .line 134
    const/4 v7, 0x3

    .line 135
    .line 136
    if-eq v6, v7, :cond_3

    .line 137
    .line 138
    .line 139
    invoke-virtual {v5}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 140
    move-result v5

    .line 141
    const/4 v6, 0x4

    .line 142
    .line 143
    if-ne v5, v6, :cond_6

    .line 144
    .line 145
    :cond_3
    iget-object v5, p0, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty$1;->a:Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;

    .line 146
    .line 147
    .line 148
    invoke-static {v5}, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;->access$100(Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;)J

    .line 149
    move-result-wide v5

    .line 150
    .line 151
    .line 152
    invoke-static {v5, v6, v2}, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;->access$400(JZ)V

    .line 153
    goto :goto_3

    .line 154
    .line 155
    :cond_4
    :goto_1
    iget-object v6, p0, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty$1;->a:Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;

    .line 156
    .line 157
    .line 158
    invoke-static {v6}, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;->access$100(Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;)J

    .line 159
    move-result-wide v6

    .line 160
    .line 161
    .line 162
    invoke-virtual {v5}, Landroid/media/AudioDeviceInfo;->getProductName()Ljava/lang/CharSequence;

    .line 163
    move-result-object v5

    .line 164
    .line 165
    .line 166
    invoke-interface {v5}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 167
    move-result-object v5

    .line 168
    .line 169
    iget-object v8, p0, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty$1;->a:Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v8}, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;->isUsbHeadsetAvailable()Z

    .line 173
    move-result v8

    .line 174
    .line 175
    .line 176
    invoke-static {v6, v7, v5, v8}, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;->access$300(JLjava/lang/String;Z)V

    .line 177
    goto :goto_3

    .line 178
    .line 179
    :cond_5
    :goto_2
    iget-object v5, p0, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty$1;->a:Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;

    .line 180
    .line 181
    .line 182
    invoke-static {v5}, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;->access$100(Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;)J

    .line 183
    move-result-wide v5

    .line 184
    .line 185
    .line 186
    invoke-static {v5, v6, v2}, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;->access$200(JZ)V

    .line 187
    .line 188
    :cond_6
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 189
    .line 190
    goto/16 :goto_0

    .line 191
    :cond_7
    :goto_4
    return-void
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

.method public final onAudioDevicesRemoved([Landroid/media/AudioDeviceInfo;)V
    .locals 8

    .line 1
    array-length v0, p1

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_3

    .line 6
    .line 7
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    const-string/jumbo v1, "remove device size "

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    array-length v1, p1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x0

    .line 23
    .line 24
    new-array v2, v1, [Ljava/lang/Object;

    .line 25
    .line 26
    const-string v3, "AudioDeviceProperty"

    .line 27
    .line 28
    .line 29
    invoke-static {v3, v0, v2}, Lcom/tencent/liteav/base/Log;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    array-length v0, p1

    .line 31
    move v2, v1

    .line 32
    .line 33
    :goto_0
    if-ge v2, v0, :cond_7

    .line 34
    .line 35
    aget-object v4, p1, v2

    .line 36
    .line 37
    new-instance v5, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string/jumbo v6, "removed device type is "

    .line 41
    .line 42
    .line 43
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 47
    move-result v6

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v6, " sink: "

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4}, Landroid/media/AudioDeviceInfo;->isSink()Z

    .line 59
    move-result v6

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v6, " product name: "

    .line 65
    .line 66
    .line 67
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, Landroid/media/AudioDeviceInfo;->getProductName()Ljava/lang/CharSequence;

    .line 71
    move-result-object v6

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    move-result-object v5

    .line 79
    .line 80
    new-array v6, v1, [Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    invoke-static {v3, v5, v6}, Lcom/tencent/liteav/base/Log;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 87
    move-result v5

    .line 88
    .line 89
    const/16 v6, 0x8

    .line 90
    .line 91
    if-eq v5, v6, :cond_1

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 95
    move-result v5

    .line 96
    const/4 v6, 0x7

    .line 97
    .line 98
    if-eq v5, v6, :cond_1

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 102
    move-result v5

    .line 103
    .line 104
    const/16 v6, 0x1a

    .line 105
    .line 106
    if-ne v5, v6, :cond_2

    .line 107
    .line 108
    :cond_1
    iget-object v5, p0, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty$1;->a:Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v5}, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;->isBluetoothHeadsetConnected()Z

    .line 112
    move-result v5

    .line 113
    .line 114
    if-nez v5, :cond_2

    .line 115
    .line 116
    iget-object v4, p0, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty$1;->a:Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;

    .line 117
    .line 118
    .line 119
    invoke-static {v4}, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;->access$100(Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;)J

    .line 120
    move-result-wide v4

    .line 121
    .line 122
    .line 123
    invoke-static {v4, v5, v1}, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;->access$200(JZ)V

    .line 124
    goto :goto_2

    .line 125
    .line 126
    .line 127
    :cond_2
    invoke-virtual {v4}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 128
    move-result v5

    .line 129
    .line 130
    const/16 v6, 0xb

    .line 131
    .line 132
    if-eq v5, v6, :cond_5

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 136
    move-result v5

    .line 137
    .line 138
    const/16 v6, 0xc

    .line 139
    .line 140
    if-eq v5, v6, :cond_5

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 144
    move-result v5

    .line 145
    .line 146
    const/16 v6, 0x16

    .line 147
    .line 148
    if-ne v5, v6, :cond_3

    .line 149
    goto :goto_1

    .line 150
    .line 151
    .line 152
    :cond_3
    invoke-virtual {v4}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 153
    move-result v5

    .line 154
    const/4 v6, 0x3

    .line 155
    .line 156
    if-eq v5, v6, :cond_4

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 160
    move-result v4

    .line 161
    const/4 v5, 0x4

    .line 162
    .line 163
    if-ne v4, v5, :cond_6

    .line 164
    .line 165
    :cond_4
    iget-object v4, p0, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty$1;->a:Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;

    .line 166
    .line 167
    .line 168
    invoke-static {v4}, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;->access$100(Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;)J

    .line 169
    move-result-wide v4

    .line 170
    .line 171
    .line 172
    invoke-static {v4, v5, v1}, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;->access$400(JZ)V

    .line 173
    goto :goto_2

    .line 174
    .line 175
    :cond_5
    :goto_1
    iget-object v5, p0, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty$1;->a:Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;

    .line 176
    .line 177
    .line 178
    invoke-static {v5}, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;->access$100(Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;)J

    .line 179
    move-result-wide v5

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4}, Landroid/media/AudioDeviceInfo;->getProductName()Ljava/lang/CharSequence;

    .line 183
    move-result-object v4

    .line 184
    .line 185
    .line 186
    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 187
    move-result-object v4

    .line 188
    .line 189
    iget-object v7, p0, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty$1;->a:Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v7}, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;->isUsbHeadsetAvailable()Z

    .line 193
    move-result v7

    .line 194
    .line 195
    .line 196
    invoke-static {v5, v6, v4, v7}, Lcom/tencent/liteav/audio2/route/AudioDeviceProperty;->access$300(JLjava/lang/String;Z)V

    .line 197
    .line 198
    :cond_6
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 199
    .line 200
    goto/16 :goto_0

    .line 201
    :cond_7
    :goto_3
    return-void
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
