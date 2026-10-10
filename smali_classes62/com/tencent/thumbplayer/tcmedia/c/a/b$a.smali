.class Lcom/tencent/thumbplayer/tcmedia/c/a/b$a;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/thumbplayer/tcmedia/c/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/thumbplayer/tcmedia/c/a/b;


# direct methods
.method public constructor <init>(Lcom/tencent/thumbplayer/tcmedia/c/a/b;Landroid/os/Looper;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/c/a/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/c/a/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

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
    .line 215
    .line 216
.end method

.method private a(JJLjava/lang/String;II)V
    .locals 7

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tencent/thumbplayer/tcmedia/c/a/b$a;->a(JJ)Z

    move-result v6

    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/c/a/d;

    move-wide v1, p1

    move-wide v3, p3

    move v5, p7

    invoke-direct/range {v0 .. v6}, Lcom/tencent/thumbplayer/tcmedia/c/a/d;-><init>(JJIZ)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/c/a/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/c/a/b;

    invoke-static {p1}, Lcom/tencent/thumbplayer/tcmedia/c/a/b;->b(Lcom/tencent/thumbplayer/tcmedia/c/a/b;)Landroid/os/HandlerThread;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/c/a/d;->a(Landroid/os/Looper;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/c/a/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/c/a/b;

    invoke-virtual {p1, p6, p5}, Lcom/tencent/thumbplayer/tcmedia/c/a/b;->b(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/c/a/d;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/c/a/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/c/a/b;

    invoke-static {p1}, Lcom/tencent/thumbplayer/tcmedia/c/a/b;->c(Lcom/tencent/thumbplayer/tcmedia/c/a/b;)Lcom/tencent/thumbplayer/tcmedia/api/resourceloader/TPAssetResourceLoadingContentInformationRequest;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/c/a/d;->a(Lcom/tencent/thumbplayer/tcmedia/api/resourceloader/TPAssetResourceLoadingContentInformationRequest;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/c/a/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/c/a/b;

    invoke-static {p1}, Lcom/tencent/thumbplayer/tcmedia/c/a/b;->a(Lcom/tencent/thumbplayer/tcmedia/c/a/b;)Lcom/tencent/thumbplayer/tcmedia/api/resourceloader/ITPAssetResourceLoaderListener;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/api/resourceloader/ITPAssetResourceLoaderListener;->shouldWaitForLoadingOfRequestedResource(Lcom/tencent/thumbplayer/tcmedia/api/resourceloader/ITPAssetResourceLoadingRequest;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/c/a/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/c/a/b;

    invoke-static {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/c/a/b;->a(Lcom/tencent/thumbplayer/tcmedia/c/a/b;Lcom/tencent/thumbplayer/tcmedia/c/a/d;)V

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/c/a/b;->d()Ljava/lang/String;

    move-result-object p1

    const-string p2, "add to mLoadingRequests, requestId: "

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private a(JJ)Z
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/c/a/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/c/a/b;

    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/c/a/b;->d(Lcom/tencent/thumbplayer/tcmedia/c/a/b;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    add-long/2addr p3, p1

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/c/a/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/c/a/b;

    invoke-static {p1}, Lcom/tencent/thumbplayer/tcmedia/c/a/b;->d(Lcom/tencent/thumbplayer/tcmedia/c/a/b;)J

    move-result-wide p1

    cmp-long p1, p3, p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iget-object p2, p0, Lcom/tencent/thumbplayer/tcmedia/c/a/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/c/a/b;

    invoke-static {p2}, Lcom/tencent/thumbplayer/tcmedia/c/a/b;->e(Lcom/tencent/thumbplayer/tcmedia/c/a/b;)V

    :cond_1
    return p1
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/c/a/b;->d()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v2, "mCallbackForResourceLoaderHandler msg : "

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    iget v2, p1, Landroid/os/Message;->what:I

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/c/a/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/c/a/b;

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/c/a/b;->a(Lcom/tencent/thumbplayer/tcmedia/c/a/b;)Lcom/tencent/thumbplayer/tcmedia/api/resourceloader/ITPAssetResourceLoaderListener;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    .line 35
    .line 36
    const/16 v1, 0x100

    .line 37
    .line 38
    if-eq v0, v1, :cond_2

    .line 39
    .line 40
    const/16 v1, 0x101

    .line 41
    .line 42
    if-eq v0, v1, :cond_1

    .line 43
    :goto_0
    return-void

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/c/a/b;->d()Ljava/lang/String;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    const-string v1, "stop read data"

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/c/a/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/c/a/b;

    .line 55
    .line 56
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 57
    .line 58
    .line 59
    invoke-static {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/c/a/b;->a(Lcom/tencent/thumbplayer/tcmedia/c/a/b;I)V

    .line 60
    return-void

    .line 61
    .line 62
    .line 63
    :cond_2
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/c/a/b;->d()Ljava/lang/String;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    const-string v1, "start read data"

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Lcom/tencent/thumbplayer/tcmedia/c/a/b$b;

    .line 74
    .line 75
    iget-wide v2, v0, Lcom/tencent/thumbplayer/tcmedia/c/a/b$b;->a:J

    .line 76
    .line 77
    iget-wide v4, v0, Lcom/tencent/thumbplayer/tcmedia/c/a/b$b;->b:J

    .line 78
    .line 79
    iget-object v6, v0, Lcom/tencent/thumbplayer/tcmedia/c/a/b$b;->c:Ljava/lang/String;

    .line 80
    .line 81
    iget v7, p1, Landroid/os/Message;->arg1:I

    .line 82
    .line 83
    iget v8, p1, Landroid/os/Message;->arg2:I

    .line 84
    .line 85
    .line 86
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/c/a/b;->d()Ljava/lang/String;

    .line 87
    move-result-object p1

    .line 88
    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const-string v1, "start read data, requestStart: "

    .line 92
    .line 93
    .line 94
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    const-string v1, " requestEnd:"

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v1, " requestId:"

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    .line 120
    invoke-static {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/c/a/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/c/a/b;

    .line 123
    .line 124
    .line 125
    invoke-static {p1, v2, v3, v4, v5}, Lcom/tencent/thumbplayer/tcmedia/c/a/b;->a(Lcom/tencent/thumbplayer/tcmedia/c/a/b;JJ)J

    .line 126
    move-result-wide v4

    .line 127
    .line 128
    const-wide/16 v0, 0x0

    .line 129
    .line 130
    cmp-long p1, v4, v0

    .line 131
    .line 132
    if-gtz p1, :cond_3

    .line 133
    .line 134
    .line 135
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/c/a/b;->d()Ljava/lang/String;

    .line 136
    move-result-object p1

    .line 137
    .line 138
    const-string v0, "requestLength invalid, check requestStart and requestEnd"

    .line 139
    .line 140
    .line 141
    invoke-static {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    return-void

    .line 143
    :cond_3
    move-object v1, p0

    .line 144
    .line 145
    .line 146
    invoke-direct/range {v1 .. v8}, Lcom/tencent/thumbplayer/tcmedia/c/a/b$a;->a(JJLjava/lang/String;II)V

    .line 147
    return-void
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
.end method
