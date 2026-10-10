.class final Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;
.super Ljava/lang/Object;
.source "RtspClient.java"

# interfaces
.implements Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$MessageListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/rtsp/RtspClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "MessageListener"
.end annotation


# instance fields
.field private final messageHandler:Landroid/os/Handler;

.field final synthetic this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/rtsp/RtspClient;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroidx/media3/common/util/Util;->createHandlerForCurrentLooper()Landroid/os/Handler;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->messageHandler:Landroid/os/Handler;

    .line 12
    return-void
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

.method public static synthetic a(Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;Ljava/util/List;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->handleRtspMessage(Ljava/util/List;)V

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
.end method

.method private handleRtspMessage(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$900(Landroidx/media3/exoplayer/rtsp/RtspClient;Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/RtspMessageUtil;->isRtspResponse(Ljava/util/List;)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->handleRtspResponse(Ljava/util/List;)V

    .line 15
    return-void

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->handleRtspRequest(Ljava/util/List;)V

    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private handleRtspRequest(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1100(Landroidx/media3/exoplayer/rtsp/RtspClient;)Landroidx/media3/exoplayer/rtsp/RtspClient$MessageSender;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/RtspMessageUtil;->parseRequest(Ljava/util/List;)Landroidx/media3/exoplayer/rtsp/RtspRequest;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    iget-object p1, p1, Landroidx/media3/exoplayer/rtsp/RtspRequest;->headers:Landroidx/media3/exoplayer/rtsp/RtspHeaders;

    .line 13
    .line 14
    const-string v1, "CSeq"

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v1}, Landroidx/media3/exoplayer/rtsp/RtspHeaders;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    check-cast p1, Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 28
    move-result p1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageSender;->sendMethodNotAllowedResponse(I)V

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
.end method

.method private handleRtspResponse(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/RtspMessageUtil;->parseResponse(Ljava/util/List;)Landroidx/media3/exoplayer/rtsp/RtspResponse;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iget-object v0, p1, Landroidx/media3/exoplayer/rtsp/RtspResponse;->headers:Landroidx/media3/exoplayer/rtsp/RtspHeaders;

    .line 7
    .line 8
    const-string v1, "CSeq"

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/rtsp/RtspHeaders;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 22
    move-result v0

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$800(Landroidx/media3/exoplayer/rtsp/RtspClient;)Landroid/util/SparseArray;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    check-cast v1, Landroidx/media3/exoplayer/rtsp/RtspRequest;

    .line 35
    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    goto/16 :goto_6

    .line 39
    .line 40
    :cond_0
    iget-object v2, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 41
    .line 42
    .line 43
    invoke-static {v2}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$800(Landroidx/media3/exoplayer/rtsp/RtspClient;)Landroid/util/SparseArray;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->remove(I)V

    .line 48
    .line 49
    iget v0, v1, Landroidx/media3/exoplayer/rtsp/RtspRequest;->method:I

    .line 50
    .line 51
    :try_start_0
    iget v2, p1, Landroidx/media3/exoplayer/rtsp/RtspResponse;->status:I
    :try_end_0
    .catch Landroidx/media3/common/ParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    const/16 v3, 0xc8

    .line 54
    .line 55
    const-string v4, "Transport"

    .line 56
    const/4 v5, 0x0

    .line 57
    .line 58
    if-eq v2, v3, :cond_b

    .line 59
    .line 60
    const/16 v3, 0x191

    .line 61
    const/4 v6, 0x0

    .line 62
    .line 63
    const-string v7, " "

    .line 64
    .line 65
    if-eq v2, v3, :cond_6

    .line 66
    .line 67
    const/16 v3, 0x1cd

    .line 68
    .line 69
    if-eq v2, v3, :cond_4

    .line 70
    .line 71
    const/16 v1, 0x12d

    .line 72
    .line 73
    if-eq v2, v1, :cond_1

    .line 74
    .line 75
    const/16 v1, 0x12e

    .line 76
    .line 77
    if-eq v2, v1, :cond_1

    .line 78
    .line 79
    :try_start_1
    iget-object v1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 80
    .line 81
    new-instance v2, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$RtspPlaybackException;

    .line 82
    .line 83
    new-instance v3, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspMessageUtil;->toMethodString(I)Ljava/lang/String;

    .line 90
    move-result-object v0

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    iget p1, p1, Landroidx/media3/exoplayer/rtsp/RtspResponse;->status:I

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    move-result-object p1

    .line 106
    .line 107
    .line 108
    invoke-direct {v2, p1}, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$RtspPlaybackException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-static {v1, v2}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$700(Landroidx/media3/exoplayer/rtsp/RtspClient;Ljava/lang/Throwable;)V

    .line 112
    return-void

    .line 113
    :catch_0
    move-exception p1

    .line 114
    .line 115
    goto/16 :goto_5

    .line 116
    :catch_1
    move-exception p1

    .line 117
    .line 118
    goto/16 :goto_5

    .line 119
    .line 120
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 121
    .line 122
    .line 123
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$100(Landroidx/media3/exoplayer/rtsp/RtspClient;)I

    .line 124
    move-result v0

    .line 125
    const/4 v1, -0x1

    .line 126
    .line 127
    if-eq v0, v1, :cond_2

    .line 128
    .line 129
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 130
    .line 131
    .line 132
    invoke-static {v0, v6}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$102(Landroidx/media3/exoplayer/rtsp/RtspClient;I)I

    .line 133
    .line 134
    :cond_2
    iget-object p1, p1, Landroidx/media3/exoplayer/rtsp/RtspResponse;->headers:Landroidx/media3/exoplayer/rtsp/RtspHeaders;

    .line 135
    .line 136
    const-string v0, "Location"

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/rtsp/RtspHeaders;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    move-result-object p1

    .line 141
    .line 142
    if-nez p1, :cond_3

    .line 143
    .line 144
    iget-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 145
    .line 146
    .line 147
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1200(Landroidx/media3/exoplayer/rtsp/RtspClient;)Landroidx/media3/exoplayer/rtsp/RtspClient$SessionInfoListener;

    .line 148
    move-result-object p1

    .line 149
    .line 150
    const-string v0, "Redirection without new location."

    .line 151
    .line 152
    .line 153
    invoke-interface {p1, v0, v5}, Landroidx/media3/exoplayer/rtsp/RtspClient$SessionInfoListener;->onSessionTimelineRequestFailed(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 154
    return-void

    .line 155
    .line 156
    .line 157
    :cond_3
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 158
    move-result-object p1

    .line 159
    .line 160
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 161
    .line 162
    .line 163
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/RtspMessageUtil;->removeUserInfo(Landroid/net/Uri;)Landroid/net/Uri;

    .line 164
    move-result-object v1

    .line 165
    .line 166
    .line 167
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1302(Landroidx/media3/exoplayer/rtsp/RtspClient;Landroid/net/Uri;)Landroid/net/Uri;

    .line 168
    .line 169
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 170
    .line 171
    .line 172
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/RtspMessageUtil;->parseUserInfo(Landroid/net/Uri;)Landroidx/media3/exoplayer/rtsp/RtspMessageUtil$RtspAuthUserInfo;

    .line 173
    move-result-object p1

    .line 174
    .line 175
    .line 176
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$602(Landroidx/media3/exoplayer/rtsp/RtspClient;Landroidx/media3/exoplayer/rtsp/RtspMessageUtil$RtspAuthUserInfo;)Landroidx/media3/exoplayer/rtsp/RtspMessageUtil$RtspAuthUserInfo;

    .line 177
    .line 178
    iget-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 179
    .line 180
    .line 181
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1100(Landroidx/media3/exoplayer/rtsp/RtspClient;)Landroidx/media3/exoplayer/rtsp/RtspClient$MessageSender;

    .line 182
    move-result-object p1

    .line 183
    .line 184
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 185
    .line 186
    .line 187
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1300(Landroidx/media3/exoplayer/rtsp/RtspClient;)Landroid/net/Uri;

    .line 188
    move-result-object v0

    .line 189
    .line 190
    iget-object v1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 191
    .line 192
    .line 193
    invoke-static {v1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$300(Landroidx/media3/exoplayer/rtsp/RtspClient;)Ljava/lang/String;

    .line 194
    move-result-object v1

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1, v0, v1}, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageSender;->sendDescribeRequest(Landroid/net/Uri;Ljava/lang/String;)V

    .line 198
    return-void

    .line 199
    .line 200
    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 204
    .line 205
    .line 206
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspMessageUtil;->toMethodString(I)Ljava/lang/String;

    .line 207
    move-result-object v3

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    iget p1, p1, Landroidx/media3/exoplayer/rtsp/RtspResponse;->status:I

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 222
    move-result-object p1

    .line 223
    .line 224
    iget-object v1, v1, Landroidx/media3/exoplayer/rtsp/RtspRequest;->headers:Landroidx/media3/exoplayer/rtsp/RtspHeaders;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1, v4}, Landroidx/media3/exoplayer/rtsp/RtspHeaders;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 228
    move-result-object v1

    .line 229
    .line 230
    .line 231
    invoke-static {v1}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    move-result-object v1

    .line 233
    .line 234
    check-cast v1, Ljava/lang/String;

    .line 235
    .line 236
    iget-object v2, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 237
    .line 238
    const/16 v3, 0xa

    .line 239
    .line 240
    if-ne v0, v3, :cond_5

    .line 241
    .line 242
    const-string v0, "TCP"

    .line 243
    .line 244
    .line 245
    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 246
    move-result v0

    .line 247
    .line 248
    if-nez v0, :cond_5

    .line 249
    .line 250
    new-instance v0, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$RtspUdpUnsupportedTransportException;

    .line 251
    .line 252
    .line 253
    invoke-direct {v0, p1}, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$RtspUdpUnsupportedTransportException;-><init>(Ljava/lang/String;)V

    .line 254
    goto :goto_0

    .line 255
    .line 256
    :cond_5
    new-instance v0, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$RtspPlaybackException;

    .line 257
    .line 258
    .line 259
    invoke-direct {v0, p1}, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$RtspPlaybackException;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    :goto_0
    invoke-static {v2, v0}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$700(Landroidx/media3/exoplayer/rtsp/RtspClient;Ljava/lang/Throwable;)V

    .line 263
    return-void

    .line 264
    .line 265
    :cond_6
    iget-object v1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 266
    .line 267
    .line 268
    invoke-static {v1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$600(Landroidx/media3/exoplayer/rtsp/RtspClient;)Landroidx/media3/exoplayer/rtsp/RtspMessageUtil$RtspAuthUserInfo;

    .line 269
    move-result-object v1

    .line 270
    .line 271
    if-eqz v1, :cond_a

    .line 272
    .line 273
    iget-object v1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 274
    .line 275
    .line 276
    invoke-static {v1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1400(Landroidx/media3/exoplayer/rtsp/RtspClient;)Z

    .line 277
    move-result v1

    .line 278
    .line 279
    if-nez v1, :cond_a

    .line 280
    .line 281
    iget-object p1, p1, Landroidx/media3/exoplayer/rtsp/RtspResponse;->headers:Landroidx/media3/exoplayer/rtsp/RtspHeaders;

    .line 282
    .line 283
    const-string v0, "WWW-Authenticate"

    .line 284
    .line 285
    .line 286
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/rtsp/RtspHeaders;->values(Ljava/lang/String;)Lcom/google/common/collect/ImmutableList;

    .line 287
    move-result-object p1

    .line 288
    .line 289
    .line 290
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 291
    move-result v0

    .line 292
    .line 293
    if-nez v0, :cond_9

    .line 294
    .line 295
    .line 296
    :goto_1
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 297
    move-result v0

    .line 298
    .line 299
    if-ge v6, v0, :cond_8

    .line 300
    .line 301
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 302
    .line 303
    .line 304
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 305
    move-result-object v1

    .line 306
    .line 307
    check-cast v1, Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    invoke-static {v1}, Landroidx/media3/exoplayer/rtsp/RtspMessageUtil;->parseWwwAuthenticateHeader(Ljava/lang/String;)Landroidx/media3/exoplayer/rtsp/RtspAuthenticationInfo;

    .line 311
    move-result-object v1

    .line 312
    .line 313
    .line 314
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$502(Landroidx/media3/exoplayer/rtsp/RtspClient;Landroidx/media3/exoplayer/rtsp/RtspAuthenticationInfo;)Landroidx/media3/exoplayer/rtsp/RtspAuthenticationInfo;

    .line 315
    .line 316
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 317
    .line 318
    .line 319
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$500(Landroidx/media3/exoplayer/rtsp/RtspClient;)Landroidx/media3/exoplayer/rtsp/RtspAuthenticationInfo;

    .line 320
    move-result-object v0

    .line 321
    .line 322
    iget v0, v0, Landroidx/media3/exoplayer/rtsp/RtspAuthenticationInfo;->authenticationMechanism:I

    .line 323
    const/4 v1, 0x2

    .line 324
    .line 325
    if-ne v0, v1, :cond_7

    .line 326
    goto :goto_2

    .line 327
    .line 328
    :cond_7
    add-int/lit8 v6, v6, 0x1

    .line 329
    goto :goto_1

    .line 330
    .line 331
    :cond_8
    :goto_2
    iget-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 332
    .line 333
    .line 334
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1100(Landroidx/media3/exoplayer/rtsp/RtspClient;)Landroidx/media3/exoplayer/rtsp/RtspClient$MessageSender;

    .line 335
    move-result-object p1

    .line 336
    .line 337
    .line 338
    invoke-virtual {p1}, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageSender;->retryLastRequest()V

    .line 339
    .line 340
    iget-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 341
    const/4 v0, 0x1

    .line 342
    .line 343
    .line 344
    invoke-static {p1, v0}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1402(Landroidx/media3/exoplayer/rtsp/RtspClient;Z)Z

    .line 345
    return-void

    .line 346
    .line 347
    :cond_9
    const-string p1, "Missing WWW-Authenticate header in a 401 response."

    .line 348
    .line 349
    .line 350
    invoke-static {p1, v5}, Landroidx/media3/common/ParserException;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 351
    move-result-object p1

    .line 352
    throw p1

    .line 353
    .line 354
    :cond_a
    iget-object v1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 355
    .line 356
    new-instance v2, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$RtspPlaybackException;

    .line 357
    .line 358
    new-instance v3, Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 362
    .line 363
    .line 364
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspMessageUtil;->toMethodString(I)Ljava/lang/String;

    .line 365
    move-result-object v0

    .line 366
    .line 367
    .line 368
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    iget p1, p1, Landroidx/media3/exoplayer/rtsp/RtspResponse;->status:I

    .line 374
    .line 375
    .line 376
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 380
    move-result-object p1

    .line 381
    .line 382
    .line 383
    invoke-direct {v2, p1}, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$RtspPlaybackException;-><init>(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    invoke-static {v1, v2}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$700(Landroidx/media3/exoplayer/rtsp/RtspClient;Ljava/lang/Throwable;)V

    .line 387
    return-void

    .line 388
    .line 389
    .line 390
    :cond_b
    packed-switch v0, :pswitch_data_0

    .line 391
    .line 392
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 393
    .line 394
    .line 395
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 396
    throw p1

    .line 397
    .line 398
    :pswitch_0
    iget-object v0, p1, Landroidx/media3/exoplayer/rtsp/RtspResponse;->headers:Landroidx/media3/exoplayer/rtsp/RtspHeaders;

    .line 399
    .line 400
    const-string v1, "Session"

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/rtsp/RtspHeaders;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 404
    move-result-object v0

    .line 405
    .line 406
    iget-object v1, p1, Landroidx/media3/exoplayer/rtsp/RtspResponse;->headers:Landroidx/media3/exoplayer/rtsp/RtspHeaders;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v1, v4}, Landroidx/media3/exoplayer/rtsp/RtspHeaders;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 410
    move-result-object v1

    .line 411
    .line 412
    if-eqz v0, :cond_c

    .line 413
    .line 414
    if-eqz v1, :cond_c

    .line 415
    .line 416
    .line 417
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspMessageUtil;->parseSessionHeader(Ljava/lang/String;)Landroidx/media3/exoplayer/rtsp/RtspMessageUtil$RtspSessionHeader;

    .line 418
    move-result-object v0

    .line 419
    .line 420
    new-instance v2, Landroidx/media3/exoplayer/rtsp/RtspSetupResponse;

    .line 421
    .line 422
    iget p1, p1, Landroidx/media3/exoplayer/rtsp/RtspResponse;->status:I

    .line 423
    .line 424
    .line 425
    invoke-direct {v2, p1, v0, v1}, Landroidx/media3/exoplayer/rtsp/RtspSetupResponse;-><init>(ILandroidx/media3/exoplayer/rtsp/RtspMessageUtil$RtspSessionHeader;Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    invoke-direct {p0, v2}, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->onSetupResponseReceived(Landroidx/media3/exoplayer/rtsp/RtspSetupResponse;)V

    .line 429
    .line 430
    goto/16 :goto_6

    .line 431
    .line 432
    :cond_c
    const-string p1, "Missing mandatory session or transport header"

    .line 433
    .line 434
    .line 435
    invoke-static {p1, v5}, Landroidx/media3/common/ParserException;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 436
    move-result-object p1

    .line 437
    throw p1

    .line 438
    .line 439
    :pswitch_1
    iget-object v0, p1, Landroidx/media3/exoplayer/rtsp/RtspResponse;->headers:Landroidx/media3/exoplayer/rtsp/RtspHeaders;

    .line 440
    .line 441
    const-string v1, "Range"

    .line 442
    .line 443
    .line 444
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/rtsp/RtspHeaders;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 445
    move-result-object v0

    .line 446
    .line 447
    if-nez v0, :cond_d

    .line 448
    .line 449
    sget-object v0, Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;->DEFAULT:Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;

    .line 450
    goto :goto_3

    .line 451
    .line 452
    .line 453
    :cond_d
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;->parseTiming(Ljava/lang/String;)Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;

    .line 454
    move-result-object v0
    :try_end_1
    .catch Landroidx/media3/common/ParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 455
    .line 456
    :goto_3
    :try_start_2
    iget-object v1, p1, Landroidx/media3/exoplayer/rtsp/RtspResponse;->headers:Landroidx/media3/exoplayer/rtsp/RtspHeaders;

    .line 457
    .line 458
    const-string v2, "RTP-Info"

    .line 459
    .line 460
    .line 461
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/rtsp/RtspHeaders;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 462
    move-result-object v1

    .line 463
    .line 464
    if-nez v1, :cond_e

    .line 465
    .line 466
    .line 467
    invoke-static {}, Lcom/google/common/collect/ImmutableList;->of()Lcom/google/common/collect/ImmutableList;

    .line 468
    move-result-object v1

    .line 469
    goto :goto_4

    .line 470
    .line 471
    :cond_e
    iget-object v2, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 472
    .line 473
    .line 474
    invoke-static {v2}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1300(Landroidx/media3/exoplayer/rtsp/RtspClient;)Landroid/net/Uri;

    .line 475
    move-result-object v2

    .line 476
    .line 477
    .line 478
    invoke-static {v1, v2}, Landroidx/media3/exoplayer/rtsp/RtspTrackTiming;->parseTrackTiming(Ljava/lang/String;Landroid/net/Uri;)Lcom/google/common/collect/ImmutableList;

    .line 479
    move-result-object v1
    :try_end_2
    .catch Landroidx/media3/common/ParserException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    .line 480
    goto :goto_4

    .line 481
    .line 482
    .line 483
    :catch_2
    :try_start_3
    invoke-static {}, Lcom/google/common/collect/ImmutableList;->of()Lcom/google/common/collect/ImmutableList;

    .line 484
    move-result-object v1

    .line 485
    .line 486
    :goto_4
    new-instance v2, Landroidx/media3/exoplayer/rtsp/RtspPlayResponse;

    .line 487
    .line 488
    iget p1, p1, Landroidx/media3/exoplayer/rtsp/RtspResponse;->status:I

    .line 489
    .line 490
    .line 491
    invoke-direct {v2, p1, v0, v1}, Landroidx/media3/exoplayer/rtsp/RtspPlayResponse;-><init>(ILandroidx/media3/exoplayer/rtsp/RtspSessionTiming;Ljava/util/List;)V

    .line 492
    .line 493
    .line 494
    invoke-direct {p0, v2}, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->onPlayResponseReceived(Landroidx/media3/exoplayer/rtsp/RtspPlayResponse;)V

    .line 495
    goto :goto_6

    .line 496
    .line 497
    .line 498
    :pswitch_2
    invoke-direct {p0}, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->onPauseResponseReceived()V

    .line 499
    goto :goto_6

    .line 500
    .line 501
    :pswitch_3
    new-instance v0, Landroidx/media3/exoplayer/rtsp/RtspOptionsResponse;

    .line 502
    .line 503
    iget-object p1, p1, Landroidx/media3/exoplayer/rtsp/RtspResponse;->headers:Landroidx/media3/exoplayer/rtsp/RtspHeaders;

    .line 504
    .line 505
    const-string v1, "Public"

    .line 506
    .line 507
    .line 508
    invoke-virtual {p1, v1}, Landroidx/media3/exoplayer/rtsp/RtspHeaders;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 509
    move-result-object p1

    .line 510
    .line 511
    .line 512
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/RtspMessageUtil;->parsePublicHeader(Ljava/lang/String;)Lcom/google/common/collect/ImmutableList;

    .line 513
    move-result-object p1

    .line 514
    .line 515
    .line 516
    invoke-direct {v0, v2, p1}, Landroidx/media3/exoplayer/rtsp/RtspOptionsResponse;-><init>(ILjava/util/List;)V

    .line 517
    .line 518
    .line 519
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->onOptionsResponseReceived(Landroidx/media3/exoplayer/rtsp/RtspOptionsResponse;)V

    .line 520
    goto :goto_6

    .line 521
    .line 522
    :pswitch_4
    new-instance v0, Landroidx/media3/exoplayer/rtsp/RtspDescribeResponse;

    .line 523
    .line 524
    iget-object v1, p1, Landroidx/media3/exoplayer/rtsp/RtspResponse;->headers:Landroidx/media3/exoplayer/rtsp/RtspHeaders;

    .line 525
    .line 526
    iget-object p1, p1, Landroidx/media3/exoplayer/rtsp/RtspResponse;->messageBody:Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/SessionDescriptionParser;->parse(Ljava/lang/String;)Landroidx/media3/exoplayer/rtsp/SessionDescription;

    .line 530
    move-result-object p1

    .line 531
    .line 532
    .line 533
    invoke-direct {v0, v1, v2, p1}, Landroidx/media3/exoplayer/rtsp/RtspDescribeResponse;-><init>(Landroidx/media3/exoplayer/rtsp/RtspHeaders;ILandroidx/media3/exoplayer/rtsp/SessionDescription;)V

    .line 534
    .line 535
    .line 536
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->onDescribeResponseReceived(Landroidx/media3/exoplayer/rtsp/RtspDescribeResponse;)V
    :try_end_3
    .catch Landroidx/media3/common/ParserException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_0

    .line 537
    goto :goto_6

    .line 538
    .line 539
    :goto_5
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 540
    .line 541
    new-instance v1, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$RtspPlaybackException;

    .line 542
    .line 543
    .line 544
    invoke-direct {v1, p1}, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$RtspPlaybackException;-><init>(Ljava/lang/Throwable;)V

    .line 545
    .line 546
    .line 547
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$700(Landroidx/media3/exoplayer/rtsp/RtspClient;Ljava/lang/Throwable;)V

    .line 548
    :goto_6
    :pswitch_5
    return-void

    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_5
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_0
        :pswitch_5
        :pswitch_5
    .end packed-switch
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
.end method

.method private onDescribeResponseReceived(Landroidx/media3/exoplayer/rtsp/RtspDescribeResponse;)V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;->DEFAULT:Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;

    .line 3
    .line 4
    iget-object v1, p1, Landroidx/media3/exoplayer/rtsp/RtspDescribeResponse;->sessionDescription:Landroidx/media3/exoplayer/rtsp/SessionDescription;

    .line 5
    .line 6
    iget-object v1, v1, Landroidx/media3/exoplayer/rtsp/SessionDescription;->attributes:Lcom/google/common/collect/ImmutableMap;

    .line 7
    .line 8
    .line 9
    const-string/jumbo v2, "range"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Lcom/google/common/collect/ImmutableMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    check-cast v1, Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    .line 20
    :try_start_0
    invoke-static {v1}, Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;->parseTiming(Ljava/lang/String;)Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;

    .line 21
    move-result-object v0
    :try_end_0
    .catch Landroidx/media3/common/ParserException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception p1

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1200(Landroidx/media3/exoplayer/rtsp/RtspClient;)Landroidx/media3/exoplayer/rtsp/RtspClient$SessionInfoListener;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    const-string v1, "SDP format error."

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v1, p1}, Landroidx/media3/exoplayer/rtsp/RtspClient$SessionInfoListener;->onSessionTimelineRequestFailed(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    return-void

    .line 36
    .line 37
    :cond_0
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 38
    .line 39
    .line 40
    invoke-static {v1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1300(Landroidx/media3/exoplayer/rtsp/RtspClient;)Landroid/net/Uri;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-static {p1, v1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1700(Landroidx/media3/exoplayer/rtsp/RtspDescribeResponse;Landroid/net/Uri;)Lcom/google/common/collect/ImmutableList;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 49
    move-result v1

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    iget-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1200(Landroidx/media3/exoplayer/rtsp/RtspClient;)Landroidx/media3/exoplayer/rtsp/RtspClient$SessionInfoListener;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    const-string v0, "No playable track."

    .line 60
    const/4 v1, 0x0

    .line 61
    .line 62
    .line 63
    invoke-interface {p1, v0, v1}, Landroidx/media3/exoplayer/rtsp/RtspClient$SessionInfoListener;->onSessionTimelineRequestFailed(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    return-void

    .line 65
    .line 66
    :cond_1
    iget-object v1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 67
    .line 68
    .line 69
    invoke-static {v1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1200(Landroidx/media3/exoplayer/rtsp/RtspClient;)Landroidx/media3/exoplayer/rtsp/RtspClient$SessionInfoListener;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    .line 73
    invoke-interface {v1, v0, p1}, Landroidx/media3/exoplayer/rtsp/RtspClient$SessionInfoListener;->onSessionTimelineUpdated(Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;Lcom/google/common/collect/ImmutableList;)V

    .line 74
    .line 75
    iget-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 76
    const/4 v0, 0x1

    .line 77
    .line 78
    .line 79
    invoke-static {p1, v0}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1802(Landroidx/media3/exoplayer/rtsp/RtspClient;Z)Z

    .line 80
    return-void
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

.method private onOptionsResponseReceived(Landroidx/media3/exoplayer/rtsp/RtspOptionsResponse;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1500(Landroidx/media3/exoplayer/rtsp/RtspClient;)Landroidx/media3/exoplayer/rtsp/RtspClient$KeepAliveMonitor;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    iget-object p1, p1, Landroidx/media3/exoplayer/rtsp/RtspOptionsResponse;->supportedMethods:Lcom/google/common/collect/ImmutableList;

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1600(Ljava/util/List;)Z

    .line 15
    move-result p1

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1100(Landroidx/media3/exoplayer/rtsp/RtspClient;)Landroidx/media3/exoplayer/rtsp/RtspClient$MessageSender;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1300(Landroidx/media3/exoplayer/rtsp/RtspClient;)Landroid/net/Uri;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    iget-object v1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$300(Landroidx/media3/exoplayer/rtsp/RtspClient;)Ljava/lang/String;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0, v1}, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageSender;->sendDescribeRequest(Landroid/net/Uri;Ljava/lang/String;)V

    .line 39
    return-void

    .line 40
    .line 41
    :cond_1
    iget-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 42
    .line 43
    .line 44
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1200(Landroidx/media3/exoplayer/rtsp/RtspClient;)Landroidx/media3/exoplayer/rtsp/RtspClient$SessionInfoListener;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    const-string v0, "DESCRIBE not supported."

    .line 48
    const/4 v1, 0x0

    .line 49
    .line 50
    .line 51
    invoke-interface {p1, v0, v1}, Landroidx/media3/exoplayer/rtsp/RtspClient$SessionInfoListener;->onSessionTimelineRequestFailed(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    return-void
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
.end method

.method private onPauseResponseReceived()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$100(Landroidx/media3/exoplayer/rtsp/RtspClient;)I

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x1

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    move v0, v3

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v0, v2

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkState(Z)V

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v3}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$102(Landroidx/media3/exoplayer/rtsp/RtspClient;I)I

    .line 23
    .line 24
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v2}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$202(Landroidx/media3/exoplayer/rtsp/RtspClient;Z)Z

    .line 28
    .line 29
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$2100(Landroidx/media3/exoplayer/rtsp/RtspClient;)J

    .line 33
    move-result-wide v0

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 39
    .line 40
    cmp-long v0, v0, v2

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$2100(Landroidx/media3/exoplayer/rtsp/RtspClient;)J

    .line 48
    move-result-wide v1

    .line 49
    .line 50
    .line 51
    invoke-static {v1, v2}, Landroidx/media3/common/util/Util;->usToMs(J)J

    .line 52
    move-result-wide v1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Landroidx/media3/exoplayer/rtsp/RtspClient;->startPlayback(J)V

    .line 56
    :cond_1
    return-void
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
.end method

.method private onPlayResponseReceived(Landroidx/media3/exoplayer/rtsp/RtspPlayResponse;)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$100(Landroidx/media3/exoplayer/rtsp/RtspClient;)I

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    const/4 v2, 0x1

    .line 9
    .line 10
    if-eq v0, v2, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$100(Landroidx/media3/exoplayer/rtsp/RtspClient;)I

    .line 16
    move-result v0

    .line 17
    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v2, 0x0

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    invoke-static {v2}, Landroidx/media3/common/util/Assertions;->checkState(Z)V

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$102(Landroidx/media3/exoplayer/rtsp/RtspClient;I)I

    .line 29
    .line 30
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1500(Landroidx/media3/exoplayer/rtsp/RtspClient;)Landroidx/media3/exoplayer/rtsp/RtspClient$KeepAliveMonitor;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 39
    .line 40
    new-instance v1, Landroidx/media3/exoplayer/rtsp/RtspClient$KeepAliveMonitor;

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1900(Landroidx/media3/exoplayer/rtsp/RtspClient;)J

    .line 44
    move-result-wide v2

    .line 45
    .line 46
    const-wide/16 v4, 0x2

    .line 47
    div-long/2addr v2, v4

    .line 48
    .line 49
    .line 50
    invoke-direct {v1, v0, v2, v3}, Landroidx/media3/exoplayer/rtsp/RtspClient$KeepAliveMonitor;-><init>(Landroidx/media3/exoplayer/rtsp/RtspClient;J)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1502(Landroidx/media3/exoplayer/rtsp/RtspClient;Landroidx/media3/exoplayer/rtsp/RtspClient$KeepAliveMonitor;)Landroidx/media3/exoplayer/rtsp/RtspClient$KeepAliveMonitor;

    .line 54
    .line 55
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1500(Landroidx/media3/exoplayer/rtsp/RtspClient;)Landroidx/media3/exoplayer/rtsp/RtspClient$KeepAliveMonitor;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Landroidx/media3/exoplayer/rtsp/RtspClient$KeepAliveMonitor;->start()V

    .line 63
    .line 64
    :cond_2
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 70
    .line 71
    .line 72
    invoke-static {v0, v1, v2}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$2102(Landroidx/media3/exoplayer/rtsp/RtspClient;J)J

    .line 73
    .line 74
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$2200(Landroidx/media3/exoplayer/rtsp/RtspClient;)Landroidx/media3/exoplayer/rtsp/RtspClient$PlaybackEventListener;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    iget-object v1, p1, Landroidx/media3/exoplayer/rtsp/RtspPlayResponse;->sessionTiming:Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;

    .line 81
    .line 82
    iget-wide v1, v1, Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;->startTimeMs:J

    .line 83
    .line 84
    .line 85
    invoke-static {v1, v2}, Landroidx/media3/common/util/Util;->msToUs(J)J

    .line 86
    move-result-wide v1

    .line 87
    .line 88
    iget-object p1, p1, Landroidx/media3/exoplayer/rtsp/RtspPlayResponse;->trackTimingList:Lcom/google/common/collect/ImmutableList;

    .line 89
    .line 90
    .line 91
    invoke-interface {v0, v1, v2, p1}, Landroidx/media3/exoplayer/rtsp/RtspClient$PlaybackEventListener;->onPlaybackStarted(JLcom/google/common/collect/ImmutableList;)V

    .line 92
    return-void
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

.method private onSetupResponseReceived(Landroidx/media3/exoplayer/rtsp/RtspSetupResponse;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$100(Landroidx/media3/exoplayer/rtsp/RtspClient;)I

    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    const/4 v2, 0x1

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    move v0, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkState(Z)V

    .line 17
    .line 18
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v2}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$102(Landroidx/media3/exoplayer/rtsp/RtspClient;I)I

    .line 22
    .line 23
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 24
    .line 25
    iget-object v1, p1, Landroidx/media3/exoplayer/rtsp/RtspSetupResponse;->sessionHeader:Landroidx/media3/exoplayer/rtsp/RtspMessageUtil$RtspSessionHeader;

    .line 26
    .line 27
    iget-object v1, v1, Landroidx/media3/exoplayer/rtsp/RtspMessageUtil$RtspSessionHeader;->sessionId:Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$302(Landroidx/media3/exoplayer/rtsp/RtspClient;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 33
    .line 34
    iget-object p1, p1, Landroidx/media3/exoplayer/rtsp/RtspSetupResponse;->sessionHeader:Landroidx/media3/exoplayer/rtsp/RtspMessageUtil$RtspSessionHeader;

    .line 35
    .line 36
    iget-wide v1, p1, Landroidx/media3/exoplayer/rtsp/RtspMessageUtil$RtspSessionHeader;->timeoutMs:J

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1, v2}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1902(Landroidx/media3/exoplayer/rtsp/RtspClient;J)J

    .line 40
    .line 41
    iget-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 42
    .line 43
    .line 44
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$2000(Landroidx/media3/exoplayer/rtsp/RtspClient;)V

    .line 45
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
.end method


# virtual methods
.method public onRtspMessageReceived(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;->messageHandler:Landroid/os/Handler;

    .line 3
    .line 4
    new-instance v1, Landroidx/media3/exoplayer/rtsp/c;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Landroidx/media3/exoplayer/rtsp/c;-><init>(Landroidx/media3/exoplayer/rtsp/RtspClient$MessageListener;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    return-void
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
