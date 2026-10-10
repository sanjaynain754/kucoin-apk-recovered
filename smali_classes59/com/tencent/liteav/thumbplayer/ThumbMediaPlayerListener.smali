.class Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnAudioFrameOutputListener;
.implements Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnAudioProcessFrameOutputListener;
.implements Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnCompletionListener;
.implements Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnErrorListener;
.implements Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnInfoListener;
.implements Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnPreparedListener;
.implements Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSeekCompleteListener;
.implements Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnStateChangeListener;
.implements Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnStopAsyncCompleteListener;
.implements Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSubtitleDataListener;
.implements Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSubtitleFrameOutListener;
.implements Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoFrameOutListener;
.implements Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoProcessFrameOutputListener;
.implements Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoSizeChangedListener;


# static fields
.field private static final ERROR_DEMUXER_PREPARE_TIMEOUT:I = 0x450


# instance fields
.field private final TAG:Ljava/lang/String;

.field private final mThumbMediaPlayer:Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-class v0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iput-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->TAG:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->mThumbMediaPlayer:Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;

    .line 14
    return-void
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

.method private innerLogE(Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->TAG:Ljava/lang/String;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "["

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 13
    move-result v2

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v2, "], "

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-static {v0, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    return-void
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

.method private innerLogI(Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->TAG:Ljava/lang/String;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "["

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 13
    move-result v2

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v2, "], "

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-static {v0, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    return-void
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

.method private transferError(II)I
    .locals 4

    .line 1
    .line 2
    const/16 v0, 0x3e9

    .line 3
    .line 4
    const/16 v1, -0x1772

    .line 5
    .line 6
    if-eq p1, v0, :cond_b

    .line 7
    .line 8
    const/16 v0, 0x44c

    .line 9
    .line 10
    if-eq p1, v0, :cond_9

    .line 11
    .line 12
    const/16 v0, 0x4b0

    .line 13
    .line 14
    const/16 v2, 0x4c4

    .line 15
    .line 16
    if-eq p1, v0, :cond_7

    .line 17
    .line 18
    const/16 v0, 0x514

    .line 19
    .line 20
    if-eq p1, v0, :cond_6

    .line 21
    .line 22
    const/16 v0, 0x640

    .line 23
    .line 24
    if-eq p1, v0, :cond_5

    .line 25
    .line 26
    const/16 v0, 0xfa0

    .line 27
    .line 28
    if-eq p1, v0, :cond_4

    .line 29
    .line 30
    const/16 v0, 0x4ba

    .line 31
    .line 32
    if-eq p1, v0, :cond_3

    .line 33
    .line 34
    const/16 v0, 0x4bb

    .line 35
    .line 36
    if-eq p1, v0, :cond_3

    .line 37
    .line 38
    if-eq p1, v2, :cond_7

    .line 39
    .line 40
    const/16 v0, 0x4c5

    .line 41
    .line 42
    if-eq p1, v0, :cond_7

    .line 43
    .line 44
    const/16 v0, 0x4ce

    .line 45
    .line 46
    if-eq p1, v0, :cond_2

    .line 47
    .line 48
    const/16 v0, 0x4cf

    .line 49
    .line 50
    if-eq p1, v0, :cond_2

    .line 51
    .line 52
    const/16 v0, 0x7d0

    .line 53
    .line 54
    if-eq p1, v0, :cond_1

    .line 55
    .line 56
    const/16 v0, 0x7d1

    .line 57
    .line 58
    if-eq p1, v0, :cond_0

    .line 59
    .line 60
    .line 61
    packed-switch p1, :pswitch_data_0

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :pswitch_0
    const/16 v1, -0x1775

    .line 66
    goto :goto_0

    .line 67
    .line 68
    :cond_0
    const/16 v1, -0x8fd

    .line 69
    goto :goto_0

    .line 70
    .line 71
    :cond_1
    const/16 v1, -0x1774

    .line 72
    goto :goto_0

    .line 73
    .line 74
    :cond_2
    const/16 v1, -0x1778

    .line 75
    goto :goto_0

    .line 76
    .line 77
    :cond_3
    const/16 v1, -0x1777

    .line 78
    goto :goto_0

    .line 79
    .line 80
    :cond_4
    const/16 v1, -0x177b

    .line 81
    goto :goto_0

    .line 82
    .line 83
    :cond_5
    const/16 v1, -0x177a

    .line 84
    goto :goto_0

    .line 85
    .line 86
    :cond_6
    const/16 v1, -0x1779

    .line 87
    goto :goto_0

    .line 88
    .line 89
    :cond_7
    const/16 v1, -0x1776

    .line 90
    .line 91
    if-ne p1, v2, :cond_c

    .line 92
    .line 93
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->mThumbMediaPlayer:Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;

    .line 94
    .line 95
    if-eqz v0, :cond_c

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->getTPPPlayer()Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 99
    move-result-object v0

    .line 100
    const/4 v2, 0x0

    .line 101
    .line 102
    .line 103
    invoke-interface {v0, v2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->getPropertyString(I)Ljava/lang/String;

    .line 104
    move-result-object v0

    .line 105
    .line 106
    if-eqz v0, :cond_c

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 110
    move-result-object v2

    .line 111
    .line 112
    const-string v3, "hevc"

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 116
    move-result v2

    .line 117
    .line 118
    if-nez v2, :cond_8

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 122
    move-result-object v0

    .line 123
    .line 124
    const-string v2, "h265"

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 128
    move-result v0

    .line 129
    .line 130
    if-eqz v0, :cond_c

    .line 131
    .line 132
    :cond_8
    const/16 v0, -0x900

    .line 133
    move v1, v0

    .line 134
    goto :goto_0

    .line 135
    .line 136
    .line 137
    :cond_9
    :pswitch_1
    const v0, 0xa8ea30

    .line 138
    .line 139
    if-lt p2, v0, :cond_a

    .line 140
    .line 141
    .line 142
    const v0, 0xa91140

    .line 143
    .line 144
    if-ge p2, v0, :cond_a

    .line 145
    .line 146
    const/16 v1, -0x17d5

    .line 147
    goto :goto_0

    .line 148
    .line 149
    :cond_a
    const/16 v1, -0x1773

    .line 150
    goto :goto_0

    .line 151
    .line 152
    .line 153
    :cond_b
    const v0, 0xa80038

    .line 154
    .line 155
    if-ne p2, v0, :cond_c

    .line 156
    .line 157
    const/16 v1, -0x901

    .line 158
    .line 159
    :cond_c
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    const-string v2, "[transferError], errorType: "

    .line 162
    .line 163
    .line 164
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    const-string p1, " ,errorCode: "

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    const-string p1, " ,vodErrorEvent: "

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    move-result-object p1

    .line 188
    .line 189
    .line 190
    invoke-direct {p0, p1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->innerLogI(Ljava/lang/String;)V

    .line 191
    return v1

    .line 192
    nop

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
    :pswitch_data_0
    .packed-switch 0x44e
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
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

.method private transferInfo(I)I
    .locals 4

    .line 1
    const/4 v0, 0x4

    .line 2
    .line 3
    if-eq p1, v0, :cond_b

    .line 4
    .line 5
    const/16 v0, 0x68

    .line 6
    .line 7
    if-eq p1, v0, :cond_a

    .line 8
    .line 9
    const/16 v0, 0x1f7

    .line 10
    .line 11
    if-eq p1, v0, :cond_9

    .line 12
    .line 13
    const/16 v0, 0x3e9

    .line 14
    const/4 v1, -0x1

    .line 15
    .line 16
    if-eq p1, v0, :cond_7

    .line 17
    .line 18
    const/16 v0, 0x3ee

    .line 19
    .line 20
    if-eq p1, v0, :cond_6

    .line 21
    .line 22
    const/16 v0, 0x3f0

    .line 23
    .line 24
    if-eq p1, v0, :cond_5

    .line 25
    .line 26
    const/16 v0, 0x3fa

    .line 27
    .line 28
    if-eq p1, v0, :cond_4

    .line 29
    .line 30
    const/16 v0, 0x6a

    .line 31
    .line 32
    if-eq p1, v0, :cond_3

    .line 33
    .line 34
    const/16 v0, 0x6b

    .line 35
    .line 36
    if-eq p1, v0, :cond_2

    .line 37
    .line 38
    const/16 v0, 0xc8

    .line 39
    .line 40
    if-eq p1, v0, :cond_1

    .line 41
    .line 42
    const/16 v0, 0xc9

    .line 43
    .line 44
    if-eq p1, v0, :cond_0

    .line 45
    goto :goto_0

    .line 46
    .line 47
    :cond_0
    const/16 p1, 0x7de

    .line 48
    return p1

    .line 49
    .line 50
    :cond_1
    const/16 p1, 0x7d7

    .line 51
    return p1

    .line 52
    .line 53
    :cond_2
    iget-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->mThumbMediaPlayer:Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;

    .line 54
    .line 55
    if-eqz p1, :cond_8

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->onReceiveFirstPacketReadEvent()V

    .line 59
    return v1

    .line 60
    .line 61
    :cond_3
    iget-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->mThumbMediaPlayer:Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;

    .line 62
    .line 63
    if-eqz p1, :cond_8

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->onReceiveFirstVideoRenderEvent()V

    .line 67
    return v1

    .line 68
    .line 69
    :cond_4
    const/16 p1, 0x7d2

    .line 70
    return p1

    .line 71
    .line 72
    :cond_5
    const/16 p1, -0x8ff

    .line 73
    return p1

    .line 74
    :cond_6
    return v0

    .line 75
    .line 76
    :cond_7
    const-string p1, "TP_PLAYER_INFO_LONG0_ALL_DOWNLOAD_FINISH"

    .line 77
    .line 78
    .line 79
    invoke-direct {p0, p1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->innerLogI(Ljava/lang/String;)V

    .line 80
    .line 81
    iget-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->mThumbMediaPlayer:Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;

    .line 82
    .line 83
    if-eqz p1, :cond_8

    .line 84
    .line 85
    const-wide/16 v2, 0x0

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v2, v3}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->updateTcpSpeed(J)V

    .line 89
    :cond_8
    :goto_0
    return v1

    .line 90
    .line 91
    :cond_9
    const/16 p1, 0x7ee

    .line 92
    return p1

    .line 93
    .line 94
    :cond_a
    const/16 p1, 0x7d8

    .line 95
    return p1

    .line 96
    .line 97
    :cond_b
    const/16 p1, 0x7e4

    .line 98
    return p1
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


# virtual methods
.method public attachToPlayer()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->mThumbMediaPlayer:Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->getTPPPlayer()Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, p0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setOnPreparedListener(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnPreparedListener;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setOnCompletionListener(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnCompletionListener;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, p0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setOnInfoListener(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnInfoListener;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, p0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setOnErrorListener(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnErrorListener;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, p0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setOnSeekCompleteListener(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSeekCompleteListener;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, p0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setOnVideoSizeChangedListener(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoSizeChangedListener;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, p0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setOnSubtitleDataListener(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSubtitleDataListener;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, p0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setOnSubtitleFrameOutListener(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSubtitleFrameOutListener;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, p0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setOnVideoFrameOutListener(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoFrameOutListener;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, p0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setOnAudioFrameOutputListener(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnAudioFrameOutputListener;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v0, p0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setOnVideoProcessFrameOutputListener(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoProcessFrameOutputListener;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, p0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setOnAudioProcessFrameOutputListener(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnAudioProcessFrameOutputListener;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v0, p0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setOnPlayerStateChangeListener(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnStateChangeListener;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v0, p0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setOnStopAsyncCompleteListener(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnStopAsyncCompleteListener;)V

    .line 53
    :cond_0
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public onAudioFrameOut(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPAudioFrameBuffer;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public onAudioProcessFrameOut(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;)Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;
    .locals 0

    .line 1
    return-object p2
    .line 2
    .line 3
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
.end method

.method public onCompletion(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;)V
    .locals 0

    .line 1
    .line 2
    iget-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->mThumbMediaPlayer:Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/tencent/liteav/txcplayer/a;->notifyOnCompletion()V

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
    .line 25
.end method

.method public onError(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;IIJJ)V
    .locals 1

    .line 1
    .line 2
    const/16 p1, 0x3e8

    .line 3
    .line 4
    if-eq p2, p1, :cond_0

    .line 5
    .line 6
    :try_start_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string/jumbo v0, "onError type: "

    .line 10
    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v0, " code: "

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v0, " arg1: "

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string p4, " arg2: "

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, p6, p7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    .line 46
    invoke-direct {p0, p1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->innerLogE(Ljava/lang/String;)V

    .line 47
    .line 48
    iget-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->mThumbMediaPlayer:Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;

    .line 49
    .line 50
    if-eqz p1, :cond_0

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, p2, p3}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->transferError(II)I

    .line 54
    move-result p2

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, p2, p3}, Lcom/tencent/liteav/txcplayer/a;->notifyOnError(II)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    return-void

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 63
    .line 64
    new-instance p2, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string/jumbo p3, "onError, e= "

    .line 68
    .line 69
    .line 70
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    move-result-object p1

    .line 82
    .line 83
    .line 84
    invoke-direct {p0, p1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->innerLogE(Ljava/lang/String;)V

    .line 85
    :cond_0
    return-void
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
.end method

.method public onInfo(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;IJJLjava/lang/Object;)V
    .locals 6

    .line 1
    .line 2
    iget-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->mThumbMediaPlayer:Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;

    .line 3
    .line 4
    if-eqz p1, :cond_5

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->transferInfo(I)I

    .line 8
    move-result p2

    .line 9
    long-to-int p3, p3

    .line 10
    .line 11
    if-eqz p7, :cond_0

    .line 12
    .line 13
    instance-of p4, p7, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPCDNURLInfo;

    .line 14
    .line 15
    if-eqz p4, :cond_0

    .line 16
    move-object p4, p7

    .line 17
    .line 18
    check-cast p4, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPCDNURLInfo;

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string/jumbo v1, "onInfo TPCDNURLInfo:cdnIp:"

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    iget-object v1, p4, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPCDNURLInfo;->cdnIp:Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v1, ":uIp:"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    iget-object v1, p4, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPCDNURLInfo;->uIp:Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v1, ": url: "

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    iget-object v1, p4, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPCDNURLInfo;->url:Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v1, ":errorStr: "

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    iget-object p4, p4, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPCDNURLInfo;->errorStr:Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    move-result-object p4

    .line 66
    .line 67
    .line 68
    invoke-direct {p0, p4}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->innerLogI(Ljava/lang/String;)V

    .line 69
    .line 70
    :cond_0
    if-eqz p7, :cond_3

    .line 71
    .line 72
    instance-of p4, p7, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPDownLoadProgressInfo;

    .line 73
    .line 74
    if-eqz p4, :cond_3

    .line 75
    move-object p4, p7

    .line 76
    .line 77
    check-cast p4, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPDownLoadProgressInfo;

    .line 78
    .line 79
    iget-wide v0, p4, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPDownLoadProgressInfo;->totalFileSize:J

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v0, v1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->updateBitrate(J)V

    .line 83
    .line 84
    iget v0, p4, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPDownLoadProgressInfo;->downloadSpeedKBps:I

    .line 85
    int-to-long v0, v0

    .line 86
    .line 87
    const-wide/16 v2, 0x0

    .line 88
    .line 89
    cmp-long v2, v0, v2

    .line 90
    .line 91
    if-gez v2, :cond_2

    .line 92
    .line 93
    iget-object p4, p4, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPDownLoadProgressInfo;->extraInfo:Ljava/lang/String;

    .line 94
    .line 95
    if-eqz p4, :cond_2

    .line 96
    .line 97
    const-string v2, ","

    .line 98
    .line 99
    .line 100
    invoke-virtual {p4, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 101
    move-result-object p4

    .line 102
    .line 103
    if-eqz p4, :cond_2

    .line 104
    array-length v2, p4

    .line 105
    const/4 v3, 0x0

    .line 106
    .line 107
    :goto_0
    if-ge v3, v2, :cond_2

    .line 108
    .line 109
    aget-object v4, p4, v3

    .line 110
    .line 111
    if-eqz v4, :cond_1

    .line 112
    .line 113
    const-string v5, "httpAvgSpeedKB"

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 117
    move-result v5

    .line 118
    .line 119
    if-eqz v5, :cond_1

    .line 120
    .line 121
    const-string p4, ":"

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4, p4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 125
    move-result p4

    .line 126
    .line 127
    add-int/lit8 p4, p4, 0x1

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 131
    move-result v0

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4, p4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 135
    move-result-object p4

    .line 136
    .line 137
    .line 138
    invoke-virtual {p4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 139
    move-result-object p4

    .line 140
    .line 141
    .line 142
    invoke-static {p4}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    .line 143
    move-result-object p4

    .line 144
    .line 145
    .line 146
    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    .line 147
    move-result-wide v0

    .line 148
    goto :goto_1

    .line 149
    .line 150
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 151
    goto :goto_0

    .line 152
    .line 153
    :cond_2
    :goto_1
    const-wide/16 v2, 0x400

    .line 154
    mul-long/2addr v0, v2

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, v0, v1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->updateTcpSpeed(J)V

    .line 158
    .line 159
    :cond_3
    instance-of p4, p7, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoCropInfo;

    .line 160
    .line 161
    if-eqz p4, :cond_4

    .line 162
    move-object p4, p7

    .line 163
    .line 164
    check-cast p4, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoCropInfo;

    .line 165
    .line 166
    new-instance v0, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string/jumbo v1, "onInfo TPVideoCropInfo:cropBottom:"

    .line 170
    .line 171
    .line 172
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    iget v1, p4, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoCropInfo;->cropBottom:I

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    const-string v1, ":cropLeft:"

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    iget v1, p4, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoCropInfo;->cropLeft:I

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    const-string v1, ": cropRight: "

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    iget v1, p4, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoCropInfo;->cropRight:I

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    const-string v1, ":cropTop: "

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    iget v1, p4, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoCropInfo;->cropTop:I

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    const-string v1, ":height:"

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    iget v1, p4, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoCropInfo;->height:I

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    const-string v1, ":width:"

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    iget p4, p4, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoCropInfo;->width:I

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    move-result-object p4

    .line 232
    .line 233
    .line 234
    invoke-direct {p0, p4}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->innerLogI(Ljava/lang/String;)V

    .line 235
    :cond_4
    long-to-int p4, p5

    .line 236
    .line 237
    .line 238
    invoke-virtual {p1, p2, p3, p4, p7}, Lcom/tencent/liteav/txcplayer/a;->notifyOnInfo(IIILjava/lang/Object;)Z

    .line 239
    :cond_5
    return-void
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
.end method

.method public onPrepared(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    const-string/jumbo p1, "onPrepared"

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->innerLogI(Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->mThumbMediaPlayer:Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/tencent/liteav/txcplayer/a;->notifyOnPrepared()V

    .line 14
    :cond_0
    return-void
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

.method public onSeekComplete(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;)V
    .locals 0

    .line 1
    .line 2
    const-string p1, " onSeekComplete"

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->innerLogI(Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->mThumbMediaPlayer:Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/tencent/liteav/txcplayer/a;->notifyOnSeekComplete()V

    .line 13
    :cond_0
    return-void
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

.method public onStateChange(II)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public onStopAsyncComplete(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
    .line 24
    .line 25
.end method

.method public onSubtitleData(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleData;)V
    .locals 0

    .line 1
    .line 2
    iget-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->mThumbMediaPlayer:Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/tencent/liteav/txcplayer/a;->notifyOnSubtitleData(Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleData;)V

    .line 10
    :cond_0
    return-void
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
.end method

.method public onSubtitleFrameOut(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;)V
    .locals 0

    .line 1
    .line 2
    iget-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->mThumbMediaPlayer:Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p2}, Lcom/tencent/liteav/txcplayer/a;->notifySubtitleFrameData(Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;)V

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
.end method

.method public onVideoFrameOut(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPVideoFrameBuffer;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public onVideoProcessFrameOut(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;)Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;
    .locals 0

    .line 1
    return-object p2
    .line 2
    .line 3
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
.end method

.method public onVideoSizeChanged(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;JJ)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->mThumbMediaPlayer:Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string/jumbo v1, "onVideoSizeChanged width: "

    .line 10
    .line 11
    .line 12
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, " ,height: "

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, p1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->innerLogI(Ljava/lang/String;)V

    .line 31
    long-to-int v1, p2

    .line 32
    long-to-int v2, p4

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->getVideoSarNum()I

    .line 36
    move-result v3

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->getVideoSarDen()I

    .line 40
    move-result v4

    .line 41
    const/4 v5, 0x0

    .line 42
    .line 43
    .line 44
    invoke-virtual/range {v0 .. v5}, Lcom/tencent/liteav/txcplayer/a;->notifyOnVideoSizeChanged(IIIILjava/lang/String;)V

    .line 45
    :cond_0
    return-void
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
