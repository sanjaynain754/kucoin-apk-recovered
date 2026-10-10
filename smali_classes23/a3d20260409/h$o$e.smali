.class public La3d20260409/h$o$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La3d20260409/h$o;->H()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg/a<",
        "Lg/c;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:La3d20260409/h$o;


# direct methods
.method public constructor <init>(La3d20260409/h$o;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, La3d20260409/h$o$e;->a:La3d20260409/h$o;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, La3d20260409/h$o$e;->b()Lg/c;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public b()Lg/c;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lg/c$b;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "performance_details"

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lg/c$b;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    iget-object v1, p0, La3d20260409/h$o$e;->a:La3d20260409/h$o;

    .line 11
    .line 12
    .line 13
    invoke-static {v1}, La3d20260409/h$o;->l(La3d20260409/h$o;)Lorg/json/JSONArray;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    const-string v2, "cost"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2, v1}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    iget-object v1, p0, La3d20260409/h$o$e;->a:La3d20260409/h$o;

    .line 23
    .line 24
    iget-object v1, v1, La3d20260409/h$o;->w:La3d20260409/h;

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, La3d20260409/h;->P(La3d20260409/h;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 32
    move-result v1

    .line 33
    .line 34
    .line 35
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    const-string/jumbo v2, "model_thread_wait_times"

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2, v1}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    iget-object v1, p0, La3d20260409/h$o$e;->a:La3d20260409/h$o;

    .line 46
    .line 47
    iget-object v1, v1, La3d20260409/h$o;->w:La3d20260409/h;

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, La3d20260409/h;->n0(La3d20260409/h;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 55
    move-result v1

    .line 56
    .line 57
    .line 58
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    move-result-object v1

    .line 60
    .line 61
    .line 62
    const-string/jumbo v2, "preprocess_thread_wait_times"

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v2, v1}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    iget-object v1, p0, La3d20260409/h$o$e;->a:La3d20260409/h$o;

    .line 69
    .line 70
    iget-object v1, v1, La3d20260409/h$o;->w:La3d20260409/h;

    .line 71
    .line 72
    .line 73
    invoke-static {v1}, La3d20260409/h;->o0(La3d20260409/h;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 74
    move-result-object v1

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 78
    move-result v1

    .line 79
    .line 80
    .line 81
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    move-result-object v1

    .line 83
    .line 84
    const-string v2, "detected_frame_count"

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v2, v1}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    iget-object v1, p0, La3d20260409/h$o$e;->a:La3d20260409/h$o;

    .line 91
    .line 92
    iget-object v1, v1, La3d20260409/h$o;->w:La3d20260409/h;

    .line 93
    .line 94
    .line 95
    invoke-static {v1}, La3d20260409/h;->u0(La3d20260409/h;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 96
    move-result-object v1

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 100
    move-result v1

    .line 101
    .line 102
    .line 103
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    move-result-object v1

    .line 105
    .line 106
    .line 107
    const-string/jumbo v2, "preprocess_frame_count"

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v2, v1}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 111
    move-result-object v0

    .line 112
    .line 113
    iget-object v1, p0, La3d20260409/h$o$e;->a:La3d20260409/h$o;

    .line 114
    .line 115
    iget-object v1, v1, La3d20260409/h$o;->w:La3d20260409/h;

    .line 116
    .line 117
    iget-object v1, v1, La3d20260409/h;->j:La3d20260409/f;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, La3d20260409/f;->b0()I

    .line 121
    move-result v1

    .line 122
    .line 123
    .line 124
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    move-result-object v1

    .line 126
    .line 127
    const-string v2, "camera_callback_frame_count"

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v2, v1}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 131
    move-result-object v0

    .line 132
    .line 133
    iget-object v1, p0, La3d20260409/h$o$e;->a:La3d20260409/h$o;

    .line 134
    .line 135
    iget-object v1, v1, La3d20260409/h$o;->w:La3d20260409/h;

    .line 136
    .line 137
    iget-object v1, v1, La3d20260409/h;->j:La3d20260409/f;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1}, La3d20260409/f;->E()I

    .line 141
    move-result v1

    .line 142
    .line 143
    .line 144
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    move-result-object v1

    .line 146
    .line 147
    const-string v2, "discard_camera_frame_count"

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v2, v1}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 151
    move-result-object v0

    .line 152
    .line 153
    iget-object v1, p0, La3d20260409/h$o$e;->a:La3d20260409/h$o;

    .line 154
    .line 155
    iget-object v1, v1, La3d20260409/h$o;->w:La3d20260409/h;

    .line 156
    .line 157
    .line 158
    invoke-static {v1}, La3d20260409/h;->d0(La3d20260409/h;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 159
    move-result-object v1

    .line 160
    .line 161
    const-string v2, "discard_preprocess_frame_count"

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v2, v1}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 165
    move-result-object v0

    .line 166
    const/4 v1, 0x1

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v1}, Lg/c$b;->e(Z)Lg/c$b;

    .line 170
    move-result-object v0

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Lg/c$b;->d()Lg/c;

    .line 174
    move-result-object v0

    .line 175
    return-object v0
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
.end method
