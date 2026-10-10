.class public Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;
.super Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;


# instance fields
.field private i:Z

.field private j:Z

.field private k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

.field private final l:Ljava/lang/Object;

.field private m:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation
.end field

.field private n:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;-><init>()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->i:Z

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->j:Z

    .line 10
    .line 11
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;-><init>()V

    .line 15
    .line 16
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->l:Ljava/lang/Object;

    .line 24
    const/4 v0, 0x0

    .line 25
    .line 26
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->m:Ljava/util/concurrent/Future;

    .line 27
    .line 28
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e$1;

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, p0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e$1;-><init>(Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;)V

    .line 32
    .line 33
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->n:Ljava/lang/Runnable;

    .line 34
    return-void
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
.end method

.method public static synthetic a(Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;Ljava/util/concurrent/Future;)Ljava/util/concurrent/Future;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->m:Ljava/util/concurrent/Future;

    return-object p1
.end method

.method private a(JILcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->b(JILcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;)Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;->b()Ljava/util/Map;

    move-result-object p1

    const-string p2, "reportLiveEndEvent"

    invoke-virtual {p0, p2, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->a(Ljava/lang/String;Ljava/util/Map;)V

    const-string p2, "live_end"

    invoke-virtual {p0, p2, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->b(Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {p0, p2, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->c(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private a(JILcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;)V
    .locals 5

    .line 5
    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->j:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/d/b$b;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/d/b$b;-><init>()V

    invoke-direct {p0, v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->h(Lcom/tencent/thumbplayer/tcmedia/d/b$a;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->j:Z

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-wide v3, v2, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->h:J

    sub-long/2addr v0, v3

    iget-wide v3, v2, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->m:J

    add-long/2addr v3, v0

    iput-wide v3, v2, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->m:J

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->d()V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "reportPlayerEndEvent playerStopTimeMs:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " errorCode:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TPLiveReporter"

    invoke-static {v1, v0}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, p4, p5}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->a(Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;)V

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->a(JILcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;)V

    return-void
.end method

.method private a(Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->b(Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;)Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;->b()Ljava/util/Map;

    move-result-object p1

    const-string p2, "reportLiveEndFlowEvent"

    invoke-virtual {p0, p2, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->a(Ljava/lang/String;Ljava/util/Map;)V

    const-string p2, "live_flow"

    invoke-virtual {p0, p2, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->b(Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {p0, p2, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->c(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private a(Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/a;Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;)V
    .locals 1

    .line 8
    iget-object v0, p2, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;->mPlayerBaseMediaParams:Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerBaseMediaParams;

    iget v0, v0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerBaseMediaParams;->mVideoDecoderType:I

    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/a;->q(I)V

    iget-object v0, p2, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;->mPlayerBaseMediaParams:Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerBaseMediaParams;

    iget v0, v0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerBaseMediaParams;->mAudioDecoderType:I

    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/a;->r(I)V

    iget-object v0, p2, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;->mPlayerBaseMediaParams:Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerBaseMediaParams;

    iget v0, v0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerBaseMediaParams;->mVideoRenderType:I

    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/a;->s(I)V

    iget-object v0, p2, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;->mPlayerBaseMediaParams:Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerBaseMediaParams;

    iget v0, v0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerBaseMediaParams;->mAudioRenderType:I

    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/a;->t(I)V

    iget-object p2, p2, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;->mPlayerBaseMediaParams:Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerBaseMediaParams;

    iget p2, p2, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerBaseMediaParams;->mDemuxerType:I

    invoke-virtual {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/a;->p(I)V

    return-void
.end method

.method private a(Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;)V
    .locals 2

    .line 9
    iget-object v0, p2, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;->mPlayerGeneralTrackingParams:Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;

    iget-wide v0, v0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;->mCoreApiPrepareTimeMs:J

    invoke-virtual {p1, v0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;->f(J)V

    iget-object v0, p2, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;->mPlayerGeneralTrackingParams:Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;

    iget-wide v0, v0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;->mCoreSchedulingThreadPrepareTimeMs:J

    invoke-virtual {p1, v0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;->g(J)V

    iget-object v0, p2, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;->mPlayerGeneralTrackingParams:Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;

    iget-wide v0, v0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;->mDemuxerThreadPrepareTimeMs:J

    invoke-virtual {p1, v0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;->h(J)V

    iget-object v0, p2, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;->mPlayerGeneralTrackingParams:Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;

    iget-wide v0, v0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;->mDemuxerOpenFileSTimeMs:J

    invoke-virtual {p1, v0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;->i(J)V

    iget-object v0, p2, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;->mPlayerGeneralTrackingParams:Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;

    iget-wide v0, v0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;->mCoreApiPrepareTimeMs:J

    invoke-virtual {p1, v0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;->j(J)V

    iget-object v0, p2, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;->mPlayerGeneralTrackingParams:Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;

    iget-wide v0, v0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;->mInitFirstClipPositionETimeMs:J

    invoke-virtual {p1, v0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;->k(J)V

    iget-object v0, p2, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;->mPlayerGeneralTrackingParams:Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;

    iget-wide v0, v0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;->mFirstVideoPacketReadETimeMs:J

    invoke-virtual {p1, v0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;->l(J)V

    iget-object v0, p2, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;->mPlayerGeneralTrackingParams:Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;

    iget-wide v0, v0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;->mFirstAudioPacketReadETimeMs:J

    invoke-virtual {p1, v0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;->m(J)V

    iget-object v0, p2, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;->mPlayerGeneralTrackingParams:Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;

    iget-wide v0, v0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;->mDemuxerThreadOnPreparedTimeMs:J

    invoke-virtual {p1, v0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;->n(J)V

    iget-object v0, p2, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;->mPlayerGeneralTrackingParams:Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;

    iget-wide v0, v0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;->mCoreSchedulingThreadOnPreparedTimeMs:J

    invoke-virtual {p1, v0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;->o(J)V

    iget-object v0, p2, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;->mPlayerGeneralTrackingParams:Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;

    iget-wide v0, v0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;->mVideoDecoderOpenedTimeMs:J

    invoke-virtual {p1, v0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;->q(J)V

    iget-object v0, p2, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;->mPlayerGeneralTrackingParams:Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;

    iget-wide v0, v0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;->mFirstVideoFrameRenderETimeMs:J

    invoke-virtual {p1, v0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;->r(J)V

    iget-object v0, p2, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;->mPlayerGeneralTrackingParams:Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;

    iget-wide v0, v0, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;->mAudioDecoderOpenedTimeMs:J

    invoke-virtual {p1, v0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;->s(J)V

    iget-object p2, p2, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;->mPlayerGeneralTrackingParams:Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;

    iget-wide v0, p2, Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams;->mFirstAudioFrameRenderETimeMs:J

    invoke-virtual {p1, v0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;->t(J)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;)Z
    .locals 0

    .line 10
    iget-boolean p0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->i:Z

    return p0
.end method

.method private b(JILcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;)Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/a;
    .locals 6

    .line 1
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/a;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/a;-><init>()V

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-wide v2, v1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->i:J

    iget-wide v4, v1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->g:J

    sub-long/2addr p1, v4

    add-long/2addr v2, p1

    iput-wide v2, v1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->i:J

    invoke-virtual {v0, v2, v3}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/a;->c(J)V

    invoke-virtual {v0, p3}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/a;->o(I)V

    invoke-direct {p0, v0, p4}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->a(Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/a;Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-object p1, p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;

    iget p2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->g:I

    add-int/lit8 p3, p2, 0x1

    iput p3, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->g:I

    invoke-virtual {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;->a(I)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->f:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/j;

    iget-object p2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-object p2, p2, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;

    invoke-virtual {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/j;->b(Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-object p1, p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;

    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;->a(Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;)V

    return-object v0
.end method

.method private b(Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;)Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;
    .locals 2

    .line 2
    new-instance p2, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;

    invoke-direct {p2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;-><init>()V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->e:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/l;

    iget-wide v0, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/l;->a:J

    invoke-virtual {p2, v0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;->c(J)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->e:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/l;

    iget-wide v0, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/l;->b:J

    invoke-virtual {p2, v0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;->d(J)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->e:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/l;

    iget-wide v0, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/l;->c:J

    invoke-virtual {p2, v0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;->e(J)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-wide v0, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->f:J

    invoke-virtual {p2, v0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;->p(J)V

    invoke-direct {p0, p2, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->a(Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-object p1, p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;

    iget v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->g:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->g:I

    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;->a(I)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->f:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/j;

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-object v0, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;

    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/j;->b(Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-object p1, p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;

    invoke-virtual {p2, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;->a(Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;)V

    return-object p2
.end method

.method public static synthetic b(Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;)Ljava/util/concurrent/Future;
    .locals 0

    .line 3
    iget-object p0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->m:Ljava/util/concurrent/Future;

    return-object p0
.end method

.method private c()V
    .locals 9

    .line 1
    const-string v0, "TPLiveReporter"

    const-string v1, "startPeriodReportTimer"

    invoke-static {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->l:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->m:Ljava/util/concurrent/Future;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/utils/o;->a()Lcom/tencent/thumbplayer/tcmedia/utils/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/utils/o;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    iget-object v3, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->n:Ljava/lang/Runnable;

    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x0

    const-wide/32 v6, 0xea60

    invoke-interface/range {v2 .. v8}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->m:Ljava/util/concurrent/Future;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private c(Lcom/tencent/thumbplayer/tcmedia/d/b$a;)V
    .locals 6

    .line 2
    instance-of v0, p1, Lcom/tencent/thumbplayer/tcmedia/d/b$o;

    const-string v1, "TPLiveReporter"

    if-nez v0, :cond_0

    const-string p1, "onPrepareDone fail:params is not match"

    invoke-static {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/d/b$o;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/d/b$a;->b()J

    move-result-wide v2

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->e:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/l;

    iget-wide v4, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/l;->c:J

    sub-long/2addr v2, v4

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/d/b$a;->b()J

    move-result-wide v4

    iput-wide v4, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->f:J

    const-string p1, "Live onPrepareDone timeMs:"

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    invoke-virtual {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->a(Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-object p1, p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;

    iget v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->g:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->g:I

    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;->a(I)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->f:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/j;

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-object v0, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;

    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/j;->b(Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    invoke-virtual {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->b(Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;)V

    new-instance p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/b;

    invoke-direct {p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/b;-><init>()V

    invoke-virtual {p1, v2, v3}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/b;->c(J)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-object v0, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;

    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;->a(Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;)V

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;->b()Ljava/util/Map;

    move-result-object p1

    const-string v0, "onPrepareDone"

    invoke-virtual {p0, v0, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->a(Ljava/lang/String;Ljava/util/Map;)V

    const-string v0, "live_first_load"

    invoke-virtual {p0, v0, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->b(Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {p0, v0, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->c(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private c(Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;)V
    .locals 3

    .line 3
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->a:Lcom/tencent/thumbplayer/tcmedia/api/reportv2/ITPReportInfoGetter;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/api/reportv2/ITPReportInfoGetter;->getPeriodExtendReportInfo()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_1

    const-string p1, "TPLiveReporter"

    const-string v0, "fillPeriodExtReportInfoToCommonParams fail, period ExtendReportInfo is null"

    invoke-static {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0, v1, v2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->a(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    iget-object v0, p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;->c(Ljava/util/Map;)V

    iget-object p1, p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;

    invoke-virtual {p1, v2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;->d(Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic c(Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->g()V

    return-void
.end method

.method private declared-synchronized d()V
    .locals 3

    .line 1
    monitor-enter p0

    :try_start_0
    const-string v0, "TPLiveReporter"

    const-string v1, "destroyPeriodReportTimer"

    invoke-static {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->l:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->m:Ljava/util/concurrent/Future;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->m:Ljava/util/concurrent/Future;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v1

    :catchall_1
    move-exception v0

    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method private d(Lcom/tencent/thumbplayer/tcmedia/d/b$a;)V
    .locals 6

    .line 2
    instance-of v0, p1, Lcom/tencent/thumbplayer/tcmedia/d/b$m;

    const-string v1, "TPLiveReporter"

    if-nez v0, :cond_0

    const-string p1, "onPlayerStart fail:params is not match"

    invoke-static {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/d/b$m;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->i:Z

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-wide v2, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->g:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/d/b$a;->b()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->g:J

    :cond_1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/d/b$a;->b()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->h:J

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Live onPlayerStart FirstStartTimeMs:"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-wide v2, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->g:J

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " mPlayerStartOccurElapsedTimeMs:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-wide v2, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->h:J

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->c()V

    return-void
.end method

.method private e()V
    .locals 2

    .line 1
    const-string v0, "TPLiveReporter"

    const-string v1, "onAppForeground"

    invoke-static {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-object v0, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->a(Ljava/lang/String;)V

    return-void
.end method

.method private e(Lcom/tencent/thumbplayer/tcmedia/d/b$a;)V
    .locals 7

    .line 2
    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->i:Z

    if-eqz v0, :cond_0

    const-string p1, "TPLiveReporter"

    const-string v0, "Player has been called End"

    invoke-static {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->i:Z

    invoke-virtual {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->a(Lcom/tencent/thumbplayer/tcmedia/d/b$a;)Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;

    move-result-object v5

    invoke-virtual {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->b(Lcom/tencent/thumbplayer/tcmedia/d/b$a;)Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;

    move-result-object v6

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/d/b$a;->b()J

    move-result-wide v2

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->a(JILcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;)V

    iget-object p1, v1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-object p1, p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->a(Ljava/lang/String;)V

    return-void
.end method

.method private f()V
    .locals 4

    .line 1
    const-string v0, "TPLiveReporter"

    const-string v1, "onAppBackground"

    invoke-static {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->i:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->b()Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->a(Z)Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->b(Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;)Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/d;

    move-result-object v0

    const-string v2, "live_flow"

    invoke-virtual {p0, v2, v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->a(Ljava/lang/String;Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-virtual {p0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->b()Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;

    move-result-object v0

    invoke-direct {p0, v2, v3, v1, v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->b(JILcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;)Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/a;

    move-result-object v0

    const-string v1, "live_end"

    invoke-virtual {p0, v1, v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->a(Ljava/lang/String;Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;)V

    return-void
.end method

.method private f(Lcom/tencent/thumbplayer/tcmedia/d/b$a;)V
    .locals 6

    .line 2
    iget-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->i:Z

    const-string v1, "TPLiveReporter"

    if-eqz v0, :cond_0

    const-string p1, "Player has been called End"

    invoke-static {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->i:Z

    instance-of v0, p1, Lcom/tencent/thumbplayer/tcmedia/d/b$i;

    if-nez v0, :cond_1

    const-string p1, "onPlayerError fail:params is not match"

    invoke-static {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/d/b$i;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/d/b$i;->e()I

    move-result v3

    invoke-virtual {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->a(Lcom/tencent/thumbplayer/tcmedia/d/b$a;)Lcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;

    move-result-object v4

    invoke-virtual {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->b(Lcom/tencent/thumbplayer/tcmedia/d/b$a;)Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;

    move-result-object v5

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/d/b$a;->b()J

    move-result-wide v1

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->a(JILcom/tencent/thumbplayer/tcmedia/core/player/TPGeneralPlayFlowParams;Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;)V

    iget-object p1, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-object p1, p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->a(Ljava/lang/String;)V

    return-void
.end method

.method private g()V
    .locals 5

    .line 1
    const-string v0, "TPLiveReporter"

    const-string v1, "periodReportEvent enter."

    invoke-static {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-wide v3, v2, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->h:J

    sub-long/2addr v0, v3

    iget-wide v3, v2, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->m:J

    add-long/2addr v3, v0

    iput-wide v3, v2, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->m:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, v2, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->h:J

    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/c;

    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/c;-><init>()V

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget v1, v1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->l:I

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/c;->o(I)V

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-wide v1, v1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->k:J

    invoke-virtual {v0, v1, v2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/c;->c(J)V

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-wide v1, v1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->m:J

    invoke-virtual {v0, v1, v2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/c;->d(J)V

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/a/a;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/a/a;->a(Z)Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;

    move-result-object v1

    iget-wide v2, v1, Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;->mMaxVideoStreamBitrate:J

    invoke-virtual {v0, v2, v3}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/c;->e(J)V

    iget-wide v2, v1, Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;->mAvgVideoStreamBitrate:J

    invoke-virtual {v0, v2, v3}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/c;->f(J)V

    iget-wide v2, v1, Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;->mMinVideoStreamBitrate:J

    invoke-virtual {v0, v2, v3}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/c;->g(J)V

    iget-wide v2, v1, Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;->mMaxVideoDecodeCostTimeMs:J

    invoke-virtual {v0, v2, v3}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/c;->h(J)V

    iget-wide v2, v1, Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;->mAvgVideoDecodeCostTimeMs:J

    invoke-virtual {v0, v2, v3}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/c;->i(J)V

    iget-wide v2, v1, Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;->mMinVideoDecodeCostTimeMs:J

    invoke-virtual {v0, v2, v3}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/c;->j(J)V

    iget v2, v1, Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;->mMaxVideoGopSize:I

    invoke-virtual {v0, v2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/c;->r(I)V

    iget v2, v1, Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;->mAvgVideoGopSize:I

    invoke-virtual {v0, v2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/c;->q(I)V

    iget v2, v1, Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;->mMinVideoGopSize:I

    invoke-virtual {v0, v2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/c;->p(I)V

    iget v2, v1, Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;->mVideoDecodeFrameCount:I

    invoke-virtual {v0, v2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/c;->s(I)V

    iget v2, v1, Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;->mVideoRenderFrameCount:I

    invoke-virtual {v0, v2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/c;->t(I)V

    iget-wide v2, v1, Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;->mVideoBufferedDurationMs:J

    invoke-virtual {v0, v2, v3}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/c;->k(J)V

    iget-wide v1, v1, Lcom/tencent/thumbplayer/tcmedia/core/player/TPDynamicStatisticParams;->mAudioBufferedDurationMs:J

    invoke-virtual {v0, v1, v2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a/c;->l(J)V

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    invoke-direct {p0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->c(Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;)V

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-object v1, v1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;

    iget v2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->g:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->g:I

    invoke-virtual {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;->a(I)V

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->f:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/j;

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-object v2, v2, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;

    invoke-virtual {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/j;->b(Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;)V

    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-object v1, v1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;->a(Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;)V

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;->b()Ljava/util/Map;

    move-result-object v0

    const-string v1, "periodReportEvent"

    invoke-virtual {p0, v1, v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->a(Ljava/lang/String;Ljava/util/Map;)V

    const-string v1, "live_period_report"

    invoke-virtual {p0, v1, v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->b(Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {p0, v1, v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->c(Ljava/lang/String;Ljava/util/Map;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    const/4 v1, 0x0

    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->l:I

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->k:J

    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->m:J

    iget-object v0, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;->c(Ljava/util/Map;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-object v0, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;

    invoke-virtual {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;->d(Ljava/util/Map;)V

    return-void
.end method

.method private g(Lcom/tencent/thumbplayer/tcmedia/d/b$a;)V
    .locals 4

    .line 2
    instance-of v0, p1, Lcom/tencent/thumbplayer/tcmedia/d/b$c;

    const-string v1, "TPLiveReporter"

    if-nez v0, :cond_0

    const-string p1, "onBufferingStart fail:params is not match"

    invoke-static {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/d/b$c;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->j:Z

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/d/b$a;->b()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->j:J

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Live onBufferingStart timeMs:"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-wide v2, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->j:J

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-wide v0, p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->j:J

    iget-wide v2, p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->h:J

    sub-long/2addr v0, v2

    iget-wide v2, p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->m:J

    add-long/2addr v2, v0

    iput-wide v2, p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->m:J

    return-void
.end method

.method private h(Lcom/tencent/thumbplayer/tcmedia/d/b$a;)V
    .locals 6

    .line 1
    .line 2
    instance-of v0, p1, Lcom/tencent/thumbplayer/tcmedia/d/b$b;

    .line 3
    .line 4
    const-string v1, "TPLiveReporter"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p1, "onBufferingEnd fail:params is not match"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/d/b$b;

    .line 15
    const/4 v0, 0x0

    .line 16
    .line 17
    iput-boolean v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->j:Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/d/b$a;->b()J

    .line 21
    move-result-wide v2

    .line 22
    .line 23
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    .line 24
    .line 25
    iget-wide v4, p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->j:J

    .line 26
    sub-long/2addr v2, v4

    .line 27
    .line 28
    .line 29
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 30
    move-result-wide v4

    .line 31
    .line 32
    iput-wide v4, p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->h:J

    .line 33
    .line 34
    const-string p1, "Live onBufferingEnd bufferingCostTimeMs:"

    .line 35
    .line 36
    .line 37
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    invoke-static {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    const-wide/16 v0, 0x4b0

    .line 48
    .line 49
    cmp-long p1, v2, v0

    .line 50
    .line 51
    if-gtz p1, :cond_1

    .line 52
    return-void

    .line 53
    .line 54
    :cond_1
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    .line 55
    .line 56
    iget v0, p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->l:I

    .line 57
    .line 58
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    iput v0, p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->l:I

    .line 61
    .line 62
    iget-wide v0, p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->k:J

    .line 63
    add-long/2addr v0, v2

    .line 64
    .line 65
    iput-wide v0, p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->k:J

    .line 66
    .line 67
    const-wide/16 v0, 0x0

    .line 68
    .line 69
    iput-wide v0, p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;->j:J

    .line 70
    return-void
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
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
.end method

.method private i(Lcom/tencent/thumbplayer/tcmedia/d/b$a;)V
    .locals 3

    .line 1
    .line 2
    instance-of v0, p1, Lcom/tencent/thumbplayer/tcmedia/d/b$e;

    .line 3
    .line 4
    const-string v1, "TPLiveReporter"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p1, "onDTProcessUpdate fail:params is not match"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/d/b$e;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/d/b$e;->d()I

    .line 18
    move-result p1

    .line 19
    .line 20
    const-string v0, "Vod onDTProcessUpdate speedKbps:"

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v0}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    .line 34
    .line 35
    iput p1, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;->b:I

    .line 36
    return-void
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
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
.end method

.method private j(Lcom/tencent/thumbplayer/tcmedia/d/b$a;)V
    .locals 4

    .line 1
    .line 2
    instance-of v0, p1, Lcom/tencent/thumbplayer/tcmedia/d/b$d;

    .line 3
    .line 4
    const-string v1, "TPLiveReporter"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p1, "onDTCdnUrlUpdate fail:params is not match"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/d/b$d;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/d/b$d;->d()Ljava/lang/String;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/d/b$d;->e()Ljava/lang/String;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    new-instance v2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v3, "Vod onDTCdnUrlUpdate cdnIp:"

    .line 27
    .line 28
    .line 29
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v3, " uIp:"

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    .line 50
    .line 51
    iput-object v0, v1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;->c:Ljava/lang/String;

    .line 52
    .line 53
    iput-object p1, v1, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;->d:Ljava/lang/String;

    .line 54
    return-void
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
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
.end method

.method private k(Lcom/tencent/thumbplayer/tcmedia/d/b$a;)V
    .locals 3

    .line 1
    .line 2
    instance-of v0, p1, Lcom/tencent/thumbplayer/tcmedia/d/b$f;

    .line 3
    .line 4
    const-string v1, "TPLiveReporter"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p1, "onDTProtocolUpdate fail:params is not match"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/d/b$f;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/d/b$f;->d()Ljava/lang/String;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    const-string v2, "Vod onDTProtocolUpdate protocolVer:"

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v0}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    .line 34
    .line 35
    iput-object p1, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;->e:Ljava/lang/String;

    .line 36
    return-void
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
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 2
    invoke-super {p0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->a()V

    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->d()V

    return-void
.end method

.method public a(ILcom/tencent/thumbplayer/tcmedia/d/b$a;)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    if-eq p1, v0, :cond_7

    const/4 v0, 0x3

    if-eq p1, v0, :cond_6

    const/4 v0, 0x5

    if-eq p1, v0, :cond_5

    const/4 v0, 0x6

    if-eq p1, v0, :cond_4

    const/16 v0, 0x9

    if-eq p1, v0, :cond_3

    const/16 v0, 0xa

    if-eq p1, v0, :cond_2

    const/16 v0, 0x3e9

    if-eq p1, v0, :cond_1

    const/16 v0, 0x3ea

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    return-void

    :pswitch_0
    invoke-direct {p0, p2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k(Lcom/tencent/thumbplayer/tcmedia/d/b$a;)V

    return-void

    :pswitch_1
    invoke-direct {p0, p2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->j(Lcom/tencent/thumbplayer/tcmedia/d/b$a;)V

    return-void

    :pswitch_2
    invoke-direct {p0, p2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->i(Lcom/tencent/thumbplayer/tcmedia/d/b$a;)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->f()V

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->e()V

    return-void

    :cond_2
    invoke-direct {p0, p2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->h(Lcom/tencent/thumbplayer/tcmedia/d/b$a;)V

    return-void

    :cond_3
    invoke-direct {p0, p2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->g(Lcom/tencent/thumbplayer/tcmedia/d/b$a;)V

    return-void

    :cond_4
    invoke-direct {p0, p2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->f(Lcom/tencent/thumbplayer/tcmedia/d/b$a;)V

    return-void

    :cond_5
    invoke-direct {p0, p2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->e(Lcom/tencent/thumbplayer/tcmedia/d/b$a;)V

    return-void

    :cond_6
    invoke-direct {p0, p2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->d(Lcom/tencent/thumbplayer/tcmedia/d/b$a;)V

    return-void

    :cond_7
    invoke-direct {p0, p2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->c(Lcom/tencent/thumbplayer/tcmedia/d/b$a;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public a(Landroid/content/Context;Lcom/tencent/thumbplayer/tcmedia/tplayer/a/l;)V
    .locals 0

    .line 6
    invoke-super {p0, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->a(Landroid/content/Context;Lcom/tencent/thumbplayer/tcmedia/tplayer/a/l;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/c;->f:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/j;

    iget-object p2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/e;->k:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/d;

    iget-object p2, p2, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;

    invoke-virtual {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/a/j;->a(Lcom/tencent/thumbplayer/tcmedia/tplayer/a/b/a;)V

    return-void
.end method
