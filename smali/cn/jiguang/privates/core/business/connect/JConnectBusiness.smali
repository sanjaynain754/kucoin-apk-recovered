.class public Lcn/jiguang/privates/core/business/connect/JConnectBusiness;
.super Ljava/lang/Object;
.source "JConnectBusiness.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "JConnectBusiness"

.field private static volatile instance:Lcn/jiguang/privates/core/business/connect/JConnectBusiness;


# instance fields
.field private ackFailedCount:I

.field private final tcpClient:Lcn/jiguang/privates/core/business/connect/tcp/TcpClient;

.field private final udpClient:Lcn/jiguang/privates/core/business/connect/udp/UdpClient;


# direct methods
.method static constructor <clinit>()V
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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcn/jiguang/privates/core/business/connect/udp/UdpClient;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcn/jiguang/privates/core/business/connect/udp/UdpClient;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->udpClient:Lcn/jiguang/privates/core/business/connect/udp/UdpClient;

    .line 11
    .line 12
    new-instance v0, Lcn/jiguang/privates/core/business/connect/tcp/TcpClient;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lcn/jiguang/privates/core/business/connect/tcp/TcpClient;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->tcpClient:Lcn/jiguang/privates/core/business/connect/tcp/TcpClient;

    .line 18
    const/4 v0, 0x0

    .line 19
    .line 20
    iput v0, p0, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->ackFailedCount:I

    .line 21
    return-void
    .line 22
.end method

.method public static getInstance()Lcn/jiguang/privates/core/business/connect/JConnectBusiness;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->instance:Lcn/jiguang/privates/core/business/connect/JConnectBusiness;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-class v0, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;

    .line 7
    monitor-enter v0

    .line 8
    .line 9
    :try_start_0
    new-instance v1, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1}, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;-><init>()V

    .line 13
    .line 14
    sput-object v1, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->instance:Lcn/jiguang/privates/core/business/connect/JConnectBusiness;

    .line 15
    monitor-exit v0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw v1

    .line 20
    .line 21
    :cond_0
    :goto_0
    sget-object v0, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->instance:Lcn/jiguang/privates/core/business/connect/JConnectBusiness;

    .line 22
    return-object v0
.end method


# virtual methods
.method public isTcpConnecting()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->tcpClient:Lcn/jiguang/privates/core/business/connect/tcp/TcpClient;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcn/jiguang/privates/core/business/connect/tcp/TcpClient;->isTcpConnecting()Z

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public onAckFailed(Landroid/content/Context;)V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->ackFailedCount:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    iput v0, p0, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->ackFailedCount:I

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    const-string v1, "onAckFailed :"

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    iget v1, p0, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->ackFailedCount:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    const-string v1, "JConnectBusiness"

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v0}, Lcn/jiguang/privates/common/log/JCommonLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    iget v0, p0, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->ackFailedCount:I

    .line 33
    const/4 v1, 0x5

    .line 34
    .line 35
    if-ge v0, v1, :cond_0

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->stopHeartbeat(Landroid/content/Context;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1}, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->startHeartbeat(Landroid/content/Context;)V

    .line 42
    return-void

    .line 43
    :cond_0
    const/4 v0, 0x0

    .line 44
    .line 45
    iput v0, p0, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->ackFailedCount:I

    .line 46
    .line 47
    const/16 v0, 0xbb1

    .line 48
    const/4 v1, 0x0

    .line 49
    .line 50
    .line 51
    invoke-static {p1, v0, v1}, Lcn/jiguang/privates/common/api/JCommonPrivatesApi;->sendMessageToRemoteProcess(Landroid/content/Context;ILandroid/os/Bundle;)V

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
.end method

.method public onAckSuccess(Landroid/content/Context;Landroid/os/Bundle;)V
    .locals 6

    .line 1
    .line 2
    const-string v0, "protocol"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    check-cast p2, Lcn/jiguang/privates/core/api/JProtocol;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lcn/jiguang/privates/core/api/JProtocol;->getBody()[B

    .line 12
    move-result-object p2

    .line 13
    .line 14
    .line 15
    invoke-static {p2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 16
    move-result-object p2

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    .line 20
    move-result v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    .line 24
    move-result v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    .line 28
    move-result v2

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getLong()J

    .line 32
    move-result-wide v3

    .line 33
    .line 34
    new-instance p2, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    const-string v5, "onAckSuccess command:"

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v5, ", result:"

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v1, ", code:"

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v1, ", serverTime:"

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    move-result-object p2

    .line 74
    .line 75
    const-string v1, "JConnectBusiness"

    .line 76
    .line 77
    .line 78
    invoke-static {v1, p2}, Lcn/jiguang/privates/common/log/JCommonLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    const/4 p2, 0x2

    .line 80
    .line 81
    if-ne v0, p2, :cond_0

    .line 82
    .line 83
    const-string p2, "onHeartbeatSuccess"

    .line 84
    .line 85
    .line 86
    invoke-static {v1, p2}, Lcn/jiguang/privates/common/log/JCommonLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    const/4 p2, 0x0

    .line 88
    .line 89
    iput p2, p0, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->ackFailedCount:I

    .line 90
    .line 91
    const/16 p2, 0x7d3

    .line 92
    const/4 v0, 0x0

    .line 93
    .line 94
    .line 95
    invoke-static {p1, p2, v0}, Lcn/jiguang/privates/common/api/JCommonPrivatesApi;->sendMessageToRemoteProcess(Landroid/content/Context;ILandroid/os/Bundle;)V

    .line 96
    .line 97
    const/16 p2, 0xbb5

    .line 98
    .line 99
    .line 100
    invoke-static {p1, p2, v0}, Lcn/jiguang/privates/common/api/JCommonPrivatesApi;->sendMessageToRemoteProcess(Landroid/content/Context;ILandroid/os/Bundle;)V

    .line 101
    .line 102
    const/16 p2, 0x8b9

    .line 103
    .line 104
    .line 105
    invoke-static {p1, p2, v0}, Lcn/jiguang/privates/common/api/JCommonPrivatesApi;->sendMessageToRemoteProcess(Landroid/content/Context;ILandroid/os/Bundle;)V

    .line 106
    :cond_0
    return-void
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
.end method

.method public onTcpConnected(Landroid/content/Context;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcn/jiguang/privates/common/global/JGlobal;->getCommonReceiver(Landroid/content/Context;)Lcn/jiguang/privates/common/component/JCommonReceiver;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v1, 0x1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1, v1}, Lcn/jiguang/privates/common/component/JCommonReceiver;->onConnectStatus(Landroid/content/Context;Z)V

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
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public onTcpDisConnected(Landroid/content/Context;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcn/jiguang/privates/common/global/JGlobal;->getCommonReceiver(Landroid/content/Context;)Lcn/jiguang/privates/common/component/JCommonReceiver;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v1, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1, v1}, Lcn/jiguang/privates/common/component/JCommonReceiver;->onConnectStatus(Landroid/content/Context;Z)V

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
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public send(Landroid/content/Context;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->tcpClient:Lcn/jiguang/privates/core/business/connect/tcp/TcpClient;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcn/jiguang/privates/core/business/connect/tcp/TcpClient;->send(Landroid/content/Context;Landroid/os/Bundle;)V

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
.end method

.method public startConnect(Landroid/content/Context;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcn/jiguang/privates/core/cache/JCoreConfig;->getConnectState(Landroid/content/Context;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    const-string v1, "JConnectBusiness"

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "connect state is false, can\'t startConnect"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, p1}, Lcn/jiguang/privates/common/log/JCommonLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    return-void

    .line 15
    .line 16
    .line 17
    :cond_0
    const-string/jumbo v0, "startConnect"

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v0}, Lcn/jiguang/privates/common/log/JCommonLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    iget-object v0, p0, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->udpClient:Lcn/jiguang/privates/core/business/connect/udp/UdpClient;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lcn/jiguang/privates/core/business/connect/udp/UdpClient;->startConnect(Landroid/content/Context;)V

    .line 26
    .line 27
    iget-object v0, p0, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->tcpClient:Lcn/jiguang/privates/core/business/connect/tcp/TcpClient;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Lcn/jiguang/privates/core/business/connect/tcp/TcpClient;->startConnect(Landroid/content/Context;)V

    .line 31
    return-void
.end method

.method public startHeartbeat(Landroid/content/Context;)V
    .locals 8

    .line 1
    .line 2
    const-string v0, "JConnectBusiness"

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "startHeartbeat"

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcn/jiguang/privates/common/log/JCommonLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    const/4 v5, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lcn/jiguang/privates/core/global/JCoreGlobal;->getHeartbeatInterval()J

    .line 13
    move-result-wide v6

    .line 14
    .line 15
    const-string v3, "JIGUANG-PRIVATES-CORE"

    .line 16
    .line 17
    const/16 v4, 0xbb0

    .line 18
    move-object v2, p1

    .line 19
    .line 20
    .line 21
    invoke-static/range {v2 .. v7}, Lcn/jiguang/privates/common/api/JCommonPrivatesApi;->sendMessageDelayed(Landroid/content/Context;Ljava/lang/String;ILandroid/os/Bundle;J)V

    .line 22
    .line 23
    .line 24
    invoke-static {v2}, Lcn/jiguang/privates/core/protocol/JCoreProtocol;->packageHeartbeatBody(Landroid/content/Context;)[B

    .line 25
    move-result-object p1

    .line 26
    .line 27
    new-instance v0, Lcn/jiguang/privates/core/api/JProtocol;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0}, Lcn/jiguang/privates/core/api/JProtocol;-><init>()V

    .line 31
    const/4 v1, 0x2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lcn/jiguang/privates/core/api/JProtocol;->setCommand(I)Lcn/jiguang/privates/core/api/JProtocol;

    .line 35
    move-result-object v0

    .line 36
    const/4 v1, 0x4

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lcn/jiguang/privates/core/api/JProtocol;->setVersion(I)Lcn/jiguang/privates/core/api/JProtocol;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p1}, Lcn/jiguang/privates/core/api/JProtocol;->setBody([B)Lcn/jiguang/privates/core/api/JProtocol;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    const-string v0, "JIGUANG-PRIVATES-CORE"

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0}, Lcn/jiguang/privates/core/api/JProtocol;->setThreadName(Ljava/lang/String;)Lcn/jiguang/privates/core/api/JProtocol;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    new-instance v0, Landroid/os/Bundle;

    .line 53
    .line 54
    .line 55
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 56
    .line 57
    const-string v1, "protocol"

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v2, v0}, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->send(Landroid/content/Context;Landroid/os/Bundle;)V

    .line 64
    return-void
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
.end method

.method public stopConnect(Landroid/content/Context;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "JConnectBusiness"

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "stopConnect"

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcn/jiguang/privates/common/log/JCommonLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    iget-object v0, p0, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->udpClient:Lcn/jiguang/privates/core/business/connect/udp/UdpClient;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcn/jiguang/privates/core/business/connect/udp/UdpClient;->stopConnect(Landroid/content/Context;)V

    .line 14
    .line 15
    iget-object v0, p0, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->tcpClient:Lcn/jiguang/privates/core/business/connect/tcp/TcpClient;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcn/jiguang/privates/core/business/connect/tcp/TcpClient;->stopConnect(Landroid/content/Context;)V

    .line 19
    return-void
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
.end method

.method public stopHeartbeat(Landroid/content/Context;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "JConnectBusiness"

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "stopHeartbeat"

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcn/jiguang/privates/common/log/JCommonLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    const-string v0, "JIGUANG-PRIVATES-CORE"

    .line 11
    .line 12
    const/16 v1, 0xbb0

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0, v1}, Lcn/jiguang/privates/common/api/JCommonPrivatesApi;->removeMessages(Landroid/content/Context;Ljava/lang/String;I)V

    .line 16
    return-void
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
.end method

.method public turnOffConnect(Landroid/content/Context;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "JConnectBusiness"

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "turnOffConnect"

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcn/jiguang/privates/common/log/JCommonLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0}, Lcn/jiguang/privates/core/cache/JCoreConfig;->setConnectState(Landroid/content/Context;Z)V

    .line 13
    .line 14
    const/16 v0, 0xbb1

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0, v1}, Lcn/jiguang/privates/common/api/JCommonPrivatesApi;->sendMessageToRemoteProcess(Landroid/content/Context;ILandroid/os/Bundle;)V

    .line 19
    return-void
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
.end method

.method public turnOnConnect(Landroid/content/Context;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "JConnectBusiness"

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "turnOnConnect"

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcn/jiguang/privates/common/log/JCommonLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0}, Lcn/jiguang/privates/core/cache/JCoreConfig;->setConnectState(Landroid/content/Context;Z)V

    .line 13
    .line 14
    const/16 v0, 0xbb2

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0, v1}, Lcn/jiguang/privates/common/api/JCommonPrivatesApi;->sendMessageToRemoteProcess(Landroid/content/Context;ILandroid/os/Bundle;)V

    .line 19
    return-void
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
.end method
