.class public Lcom/tencent/thumbplayer/tcmedia/adapter/g;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$a;
.implements Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$b;
.implements Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$c;
.implements Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$d;
.implements Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$e;
.implements Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$f;
.implements Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$g;
.implements Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;
.implements Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$i;
.implements Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$j;
.implements Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$k;
.implements Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$l;
.implements Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$m;
.implements Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$n;
.implements Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$o;
.implements Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;
    }
.end annotation


# instance fields
.field private a:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$i;

.field private b:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$c;

.field private c:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;

.field private d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$f;

.field private e:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$j;

.field private f:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$p;

.field private g:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$l;

.field private h:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$n;

.field private i:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$a;

.field private j:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$m;

.field private k:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$o;

.field private l:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$b;

.field private m:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$k;

.field private n:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$e;

.field private o:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$g;

.field private p:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$d;

.field private q:Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;

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
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->r:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->a(Ljava/lang/String;)V

    .line 11
    .line 12
    new-instance p1, Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;

    .line 13
    .line 14
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->r:Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-direct {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->q:Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;

    .line 20
    .line 21
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->a:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$i;

    .line 22
    .line 23
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->b:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$c;

    .line 24
    .line 25
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->c:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;

    .line 26
    .line 27
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$f;

    .line 28
    .line 29
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->e:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$j;

    .line 30
    .line 31
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$p;

    .line 32
    .line 33
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->g:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$l;

    .line 34
    .line 35
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$n;

    .line 36
    .line 37
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$a;

    .line 38
    .line 39
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->j:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$m;

    .line 40
    .line 41
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->k:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$o;

    .line 42
    .line 43
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->l:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$b;

    .line 44
    .line 45
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->m:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$k;

    .line 46
    .line 47
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->n:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$e;

    .line 48
    .line 49
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->o:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$g;

    .line 50
    .line 51
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->p:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$d;

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
.end method


# virtual methods
.method public a(Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;)Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->k:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$o;

    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$o;->a(Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;)Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/String;I)Lcom/tencent/thumbplayer/tcmedia/api/TPRemoteSdpInfo;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->p:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$d;

    invoke-interface {v0, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$d;->a(Ljava/lang/String;I)Lcom/tencent/thumbplayer/tcmedia/api/TPRemoteSdpInfo;

    move-result-object p1

    return-object p1
.end method

.method public a()V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->a:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$i;

    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$i;->a()V

    return-void
.end method

.method public a(IIJJ)V
    .locals 7
    .param p1    # I
        .annotation runtime Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$TPErrorType;
        .end annotation
    .end param

    .line 4
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$f;

    move v1, p1

    move v2, p2

    move-wide v3, p3

    move-wide v5, p5

    invoke-interface/range {v0 .. v6}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$f;->a(IIJJ)V

    return-void
.end method

.method public a(IJJLjava/lang/Object;)V
    .locals 7

    .line 5
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->c:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;

    move v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;->a(IJJLjava/lang/Object;)V

    return-void
.end method

.method public a(JJ)V
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$p;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$p;->a(JJ)V

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$a;)V
    .locals 0

    .line 7
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->q:Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$a;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$b;)V
    .locals 0

    .line 8
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->q:Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->l:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$b;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$c;)V
    .locals 0

    .line 9
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->q:Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->b:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$c;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$d;)V
    .locals 0

    .line 10
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->q:Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->p:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$d;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$e;)V
    .locals 0

    .line 11
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->q:Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->n:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$e;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$f;)V
    .locals 0

    .line 12
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->q:Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$f;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$g;)V
    .locals 0

    .line 13
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->q:Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->o:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$g;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;)V
    .locals 0

    .line 14
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->q:Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->c:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$i;)V
    .locals 0

    .line 15
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->q:Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->a:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$i;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$j;)V
    .locals 0

    .line 16
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->q:Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->e:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$j;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$k;)V
    .locals 0

    .line 17
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->q:Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->m:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$k;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$l;)V
    .locals 0

    .line 18
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->q:Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->g:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$l;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$m;)V
    .locals 0

    .line 19
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->q:Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->j:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$m;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$n;)V
    .locals 0

    .line 20
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->q:Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$n;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$o;)V
    .locals 0

    .line 21
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->q:Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->k:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$o;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$p;)V
    .locals 0

    .line 22
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->q:Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$p;

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/TPAudioFrameBuffer;)V
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$a;

    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$a;->a(Lcom/tencent/thumbplayer/tcmedia/api/TPAudioFrameBuffer;)V

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;)V
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->o:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$g;

    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$g;->a(Lcom/tencent/thumbplayer/tcmedia/api/TPDrmInfo;)V

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerDetailInfo;)V
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->n:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$e;

    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$e;->a(Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerDetailInfo;)V

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleData;)V
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->g:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$l;

    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$l;->a(Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleData;)V

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;)V
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->j:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$m;

    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$m;->a(Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;)V

    return-void
.end method

.method public a(Lcom/tencent/thumbplayer/tcmedia/api/TPVideoFrameBuffer;)V
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$n;

    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$n;->a(Lcom/tencent/thumbplayer/tcmedia/api/TPVideoFrameBuffer;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 29
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "TPPlayerListenerS"

    :cond_0
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->r:Ljava/lang/String;

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->q:Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->r:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;->a(Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;Ljava/lang/String;)Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public b(Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;)Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->l:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$b;

    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$b;->b(Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;)Lcom/tencent/thumbplayer/tcmedia/api/TPPostProcessFrameBuffer;

    move-result-object p1

    return-object p1
.end method

.method public b()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->b:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$c;

    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$c;->b()V

    return-void
.end method

.method public b(II)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->m:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$k;

    invoke-interface {v0, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$k;->b(II)V

    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->e:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$j;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$j;->c()V

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
.end method

.method public d()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->p:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$d;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$d;->d()V

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
.end method

.method public e()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->q:Lcom/tencent/thumbplayer/tcmedia/adapter/g$a;

    .line 3
    .line 4
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->a:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$i;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->b:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$c;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->c:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$h;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->d:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$f;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->e:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$j;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->f:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$p;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->g:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$l;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->h:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$n;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->i:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$a;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->j:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$m;

    .line 23
    .line 24
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->m:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$k;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->k:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$o;

    .line 27
    .line 28
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->l:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$b;

    .line 29
    .line 30
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->n:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$e;

    .line 31
    .line 32
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->o:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$g;

    .line 33
    .line 34
    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/adapter/g;->p:Lcom/tencent/thumbplayer/tcmedia/adapter/a/c$d;

    .line 35
    return-void
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
