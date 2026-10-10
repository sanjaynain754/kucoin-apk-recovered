.class public Lcom/tencent/thumbplayer/tcmedia/tplayer/c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnAudioFrameOutputListener;
.implements Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnAudioProcessFrameOutputListener;
.implements Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnCompletionListener;
.implements Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnDemuxerListener;
.implements Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnDetailInfoListener;
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


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;
    }
.end annotation


# instance fields
.field private a:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnPreparedListener;

.field private b:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnCompletionListener;

.field private c:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnInfoListener;

.field private d:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnErrorListener;

.field private e:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSeekCompleteListener;

.field private f:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoSizeChangedListener;

.field private g:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSubtitleDataListener;

.field private h:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSubtitleFrameOutListener;

.field private i:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoFrameOutListener;

.field private j:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnAudioFrameOutputListener;

.field private k:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoProcessFrameOutputListener;

.field private l:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnAudioProcessFrameOutputListener;

.field private m:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnStateChangeListener;

.field private n:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnStopAsyncCompleteListener;

.field private o:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnDetailInfoListener;

.field private p:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnDemuxerListener;

.field private q:Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;

.field private r:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-string v0, "TPPlayerListenerS"

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->r:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->a(Ljava/lang/String;)V

    .line 11
    .line 12
    new-instance p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;

    .line 13
    .line 14
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->r:Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-direct {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->q:Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;

    .line 20
    .line 21
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->a:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnPreparedListener;

    .line 22
    .line 23
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->b:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnCompletionListener;

    .line 24
    .line 25
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->c:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnInfoListener;

    .line 26
    .line 27
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->d:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnErrorListener;

    .line 28
    .line 29
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->e:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSeekCompleteListener;

    .line 30
    .line 31
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->f:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoSizeChangedListener;

    .line 32
    .line 33
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->g:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSubtitleDataListener;

    .line 34
    .line 35
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->h:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSubtitleFrameOutListener;

    .line 36
    .line 37
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->i:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoFrameOutListener;

    .line 38
    .line 39
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->j:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnAudioFrameOutputListener;

    .line 40
    .line 41
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->k:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoProcessFrameOutputListener;

    .line 42
    .line 43
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->l:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnAudioProcessFrameOutputListener;

    .line 44
    .line 45
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->m:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnStateChangeListener;

    .line 46
    .line 47
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->n:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnStopAsyncCompleteListener;

    .line 48
    .line 49
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->o:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnDetailInfoListener;

    .line 50
    .line 51
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->p:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnDemuxerListener;

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
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->q:Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->a:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnPreparedListener;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->b:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnCompletionListener;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->c:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnInfoListener;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->d:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnErrorListener;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->e:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSeekCompleteListener;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->f:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoSizeChangedListener;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->g:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSubtitleDataListener;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->i:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoFrameOutListener;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->j:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnAudioFrameOutputListener;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->m:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnStateChangeListener;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->n:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnStopAsyncCompleteListener;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->o:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnDetailInfoListener;

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->p:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnDemuxerListener;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnAudioFrameOutputListener;)V
    .locals 0

    .line 2
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->q:Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->j:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnAudioFrameOutputListener;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnAudioProcessFrameOutputListener;)V
    .locals 0

    .line 3
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->q:Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->l:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnAudioProcessFrameOutputListener;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnCompletionListener;)V
    .locals 0

    .line 4
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->q:Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->b:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnCompletionListener;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnDemuxerListener;)V
    .locals 0

    .line 5
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->q:Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->p:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnDemuxerListener;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnDetailInfoListener;)V
    .locals 0

    .line 6
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->q:Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->o:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnDetailInfoListener;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnErrorListener;)V
    .locals 0

    .line 7
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->q:Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->d:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnErrorListener;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnInfoListener;)V
    .locals 0

    .line 8
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->q:Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->c:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnInfoListener;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnPreparedListener;)V
    .locals 0

    .line 9
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->q:Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->a:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnPreparedListener;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSeekCompleteListener;)V
    .locals 0

    .line 10
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->q:Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->e:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSeekCompleteListener;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnStateChangeListener;)V
    .locals 0

    .line 11
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->q:Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->m:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnStateChangeListener;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnStopAsyncCompleteListener;)V
    .locals 0

    .line 12
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->q:Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->n:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnStopAsyncCompleteListener;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSubtitleDataListener;)V
    .locals 0

    .line 13
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->q:Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->g:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSubtitleDataListener;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSubtitleFrameOutListener;)V
    .locals 0

    .line 14
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->q:Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->h:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSubtitleFrameOutListener;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoFrameOutListener;)V
    .locals 0

    .line 15
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->q:Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->i:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoFrameOutListener;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoProcessFrameOutputListener;)V
    .locals 0

    .line 16
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->q:Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->k:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoProcessFrameOutputListener;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoSizeChangedListener;)V
    .locals 0

    .line 17
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->q:Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->f:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoSizeChangedListener;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 18
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "TPPlayerListenerS"

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->r:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->r:Ljava/lang/String;

    :goto_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->q:Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;

    if-eqz v0, :cond_1

    invoke-static {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;->a(Lcom/tencent/thumbplayer/tcmedia/tplayer/c$a;Ljava/lang/String;)Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public onAudioFrameOut(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPAudioFrameBuffer;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->j:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnAudioFrameOutputListener;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnAudioFrameOutputListener;->onAudioFrameOut(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPAudioFrameBuffer;)V

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
.end method

.method public onAudioProcessFrameOut(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;)Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->l:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnAudioProcessFrameOutputListener;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnAudioProcessFrameOutputListener;->onAudioProcessFrameOut(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;)Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
.end method

.method public onCompletion(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->b:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnCompletionListener;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnCompletionListener;->onCompletion(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;)V

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

.method public onDetailInfo(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerDetailInfo;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->o:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnDetailInfoListener;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnDetailInfoListener;->onDetailInfo(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerDetailInfo;)V

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
.end method

.method public onError(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;IIJJ)V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->d:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnErrorListener;

    .line 3
    move-object v1, p1

    .line 4
    move v2, p2

    .line 5
    move v3, p3

    .line 6
    move-wide v4, p4

    .line 7
    move-wide v6, p6

    .line 8
    .line 9
    .line 10
    invoke-interface/range {v0 .. v7}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnErrorListener;->onError(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;IIJJ)V

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
.end method

.method public onInfo(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;IJJLjava/lang/Object;)V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->c:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnInfoListener;

    .line 3
    move-object v1, p1

    .line 4
    move v2, p2

    .line 5
    move-wide v3, p3

    .line 6
    move-wide v5, p5

    .line 7
    move-object v7, p7

    .line 8
    .line 9
    .line 10
    invoke-interface/range {v0 .. v7}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnInfoListener;->onInfo(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;IJJLjava/lang/Object;)V

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
.end method

.method public onPrepared(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->a:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnPreparedListener;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnPreparedListener;->onPrepared(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;)V

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

.method public onSdpExchange(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Ljava/lang/String;I)Lcom/tencent/thumbplayer/tcmedia/api/TPRemoteSdpInfo;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->p:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnDemuxerListener;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1, p2, p3}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnDemuxerListener;->onSdpExchange(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Ljava/lang/String;I)Lcom/tencent/thumbplayer/tcmedia/api/TPRemoteSdpInfo;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
.end method

.method public onSeekComplete(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->e:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSeekCompleteListener;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSeekCompleteListener;->onSeekComplete(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;)V

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

.method public onStateChange(II)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->m:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnStateChangeListener;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnStateChangeListener;->onStateChange(II)V

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
.end method

.method public onStopAsyncComplete(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->n:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnStopAsyncCompleteListener;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnStopAsyncCompleteListener;->onStopAsyncComplete(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;)V

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

.method public onSubtitleData(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleData;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->g:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSubtitleDataListener;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSubtitleDataListener;->onSubtitleData(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleData;)V

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
.end method

.method public onSubtitleFrameOut(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->h:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSubtitleFrameOutListener;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnSubtitleFrameOutListener;->onSubtitleFrameOut(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;)V

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
.end method

.method public onVideoFrameOut(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPVideoFrameBuffer;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->i:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoFrameOutListener;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoFrameOutListener;->onVideoFrameOut(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPVideoFrameBuffer;)V

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
.end method

.method public onVideoProcessFrameOut(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;)Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->k:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoProcessFrameOutputListener;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoProcessFrameOutputListener;->onVideoProcessFrameOut(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;)Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
.end method

.method public onVideoSizeChanged(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;JJ)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->f:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoSizeChangedListener;

    .line 3
    move-object v1, p1

    .line 4
    move-wide v2, p2

    .line 5
    move-wide v4, p4

    .line 6
    .line 7
    .line 8
    invoke-interface/range {v0 .. v5}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnVideoSizeChangedListener;->onVideoSizeChanged(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;JJ)V

    .line 9
    return-void
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
.end method
