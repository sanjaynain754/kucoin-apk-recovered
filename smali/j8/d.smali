.class public Lj8/d;
.super Ljava/lang/Object;
.source "FrameDrawableTranscoder.java"

# interfaces
.implements Lh2/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lh2/e<",
        "Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;",
        "Landroid/graphics/drawable/Drawable;",
        ">;"
    }
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public a(Lv1/j;Lt1/e;)Lv1/j;
    .locals 2
    .param p1    # Lv1/j;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lt1/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv1/j<",
            "Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;",
            ">;",
            "Lt1/e;",
            ")",
            "Lv1/j<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Lv1/j;->get()Ljava/lang/Object;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    check-cast p1, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 7
    .line 8
    sget-object v0, Lj8/a;->d:Lt1/d;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2, v0}, Lt1/e;->c(Lt1/d;)Ljava/lang/Object;

    .line 12
    move-result-object p2

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    move-result p2

    .line 19
    .line 20
    instance-of v0, p1, La8/b;

    .line 21
    const/4 v1, 0x0

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    new-instance v0, Lz7/a;

    .line 26
    .line 27
    check-cast p1, La8/b;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, p1}, Lz7/a;-><init>(La8/b;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ly7/a;->h(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p2}, Ly7/a;->i(Z)V

    .line 37
    .line 38
    new-instance p1, Lj8/d$a;

    .line 39
    .line 40
    .line 41
    invoke-direct {p1, p0, v0, v0}, Lj8/d$a;-><init>(Lj8/d;Landroid/graphics/drawable/Drawable;Lz7/a;)V

    .line 42
    return-object p1

    .line 43
    .line 44
    :cond_0
    instance-of v0, p1, Lm8/l;

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    new-instance v0, Ll8/a;

    .line 49
    .line 50
    check-cast p1, Lm8/l;

    .line 51
    .line 52
    .line 53
    invoke-direct {v0, p1}, Ll8/a;-><init>(Lm8/l;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ly7/a;->h(Z)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p2}, Ly7/a;->i(Z)V

    .line 60
    .line 61
    new-instance p1, Lj8/d$b;

    .line 62
    .line 63
    .line 64
    invoke-direct {p1, p0, v0, v0}, Lj8/d$b;-><init>(Lj8/d;Landroid/graphics/drawable/Drawable;Ll8/a;)V

    .line 65
    return-object p1

    .line 66
    .line 67
    :cond_1
    instance-of v0, p1, Lh8/f;

    .line 68
    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    new-instance v0, Lg8/a;

    .line 72
    .line 73
    check-cast p1, Lh8/f;

    .line 74
    .line 75
    .line 76
    invoke-direct {v0, p1}, Lg8/a;-><init>(Lh8/f;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ly7/a;->h(Z)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, p2}, Ly7/a;->i(Z)V

    .line 83
    .line 84
    new-instance p1, Lj8/d$c;

    .line 85
    .line 86
    .line 87
    invoke-direct {p1, p0, v0, v0}, Lj8/d$c;-><init>(Lj8/d;Landroid/graphics/drawable/Drawable;Lg8/a;)V

    .line 88
    return-object p1

    .line 89
    .line 90
    :cond_2
    instance-of v0, p1, Ld8/a;

    .line 91
    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    new-instance v0, Lc8/a;

    .line 95
    .line 96
    check-cast p1, Ld8/a;

    .line 97
    .line 98
    .line 99
    invoke-direct {v0, p1}, Lc8/a;-><init>(Ld8/a;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ly7/a;->h(Z)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p2}, Ly7/a;->i(Z)V

    .line 106
    .line 107
    new-instance p1, Lj8/d$d;

    .line 108
    .line 109
    .line 110
    invoke-direct {p1, p0, v0, v0}, Lj8/d$d;-><init>(Lj8/d;Landroid/graphics/drawable/Drawable;Lc8/a;)V

    .line 111
    return-object p1

    .line 112
    :cond_3
    const/4 p1, 0x0

    .line 113
    return-object p1
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
