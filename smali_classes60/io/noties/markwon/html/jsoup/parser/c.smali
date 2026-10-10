.class public final Lio/noties/markwon/html/jsoup/parser/c;
.super Ljava/lang/Object;
.source "Tokeniser.java"


# static fields
.field public static final r:[C

.field public static final s:[I


# instance fields
.field public final a:Lio/noties/markwon/html/jsoup/parser/a;

.field public final b:Lio/noties/markwon/html/jsoup/parser/ParseErrorList;

.field public c:Lio/noties/markwon/html/jsoup/parser/TokeniserState;

.field public d:Lio/noties/markwon/html/jsoup/parser/Token;

.field public e:Z

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/StringBuilder;

.field public h:Ljava/lang/StringBuilder;

.field public i:Lio/noties/markwon/html/jsoup/parser/Token$h;

.field public j:Lio/noties/markwon/html/jsoup/parser/Token$g;

.field public k:Lio/noties/markwon/html/jsoup/parser/Token$f;

.field public l:Lio/noties/markwon/html/jsoup/parser/Token$b;

.field public m:Lio/noties/markwon/html/jsoup/parser/Token$d;

.field public n:Lio/noties/markwon/html/jsoup/parser/Token$c;

.field public o:Ljava/lang/String;

.field public final p:[I

.field public final q:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    const/16 v0, 0x20

    .line 3
    const/4 v1, 0x7

    .line 4
    .line 5
    new-array v1, v1, [C

    .line 6
    .line 7
    .line 8
    fill-array-data v1, :array_0

    .line 9
    .line 10
    sput-object v1, Lio/noties/markwon/html/jsoup/parser/c;->r:[C

    .line 11
    .line 12
    new-array v0, v0, [I

    .line 13
    .line 14
    .line 15
    fill-array-data v0, :array_1

    .line 16
    .line 17
    sput-object v0, Lio/noties/markwon/html/jsoup/parser/c;->s:[I

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Ljava/util/Arrays;->sort([C)V

    .line 21
    return-void

    .line 22
    nop

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
    :array_0
    .array-data 2
        0x9s
        0xas
        0xds
        0xcs
        0x20s
        0x3cs
        0x26s
    .end array-data

    .line 34
    nop

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    :array_1
    .array-data 4
        0x20ac
        0x81
        0x201a
        0x192
        0x201e
        0x2026
        0x2020
        0x2021
        0x2c6
        0x2030
        0x160
        0x2039
        0x152
        0x8d
        0x17d
        0x8f
        0x90
        0x2018
        0x2019
        0x201c
        0x201d
        0x2022
        0x2013
        0x2014
        0x2dc
        0x2122
        0x161
        0x203a
        0x153
        0x9d
        0x17e
        0x178
    .end array-data
.end method

.method public constructor <init>(Lio/noties/markwon/html/jsoup/parser/a;Lio/noties/markwon/html/jsoup/parser/ParseErrorList;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lio/noties/markwon/html/jsoup/parser/TokeniserState;->Data:Lio/noties/markwon/html/jsoup/parser/TokeniserState;

    .line 6
    .line 7
    iput-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->c:Lio/noties/markwon/html/jsoup/parser/TokeniserState;

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-boolean v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->e:Z

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    iput-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->f:Ljava/lang/String;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const/16 v1, 0x400

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 21
    .line 22
    iput-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->g:Ljava/lang/StringBuilder;

    .line 23
    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 28
    .line 29
    iput-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->h:Ljava/lang/StringBuilder;

    .line 30
    .line 31
    new-instance v0, Lio/noties/markwon/html/jsoup/parser/Token$g;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0}, Lio/noties/markwon/html/jsoup/parser/Token$g;-><init>()V

    .line 35
    .line 36
    iput-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->j:Lio/noties/markwon/html/jsoup/parser/Token$g;

    .line 37
    .line 38
    new-instance v0, Lio/noties/markwon/html/jsoup/parser/Token$f;

    .line 39
    .line 40
    .line 41
    invoke-direct {v0}, Lio/noties/markwon/html/jsoup/parser/Token$f;-><init>()V

    .line 42
    .line 43
    iput-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->k:Lio/noties/markwon/html/jsoup/parser/Token$f;

    .line 44
    .line 45
    new-instance v0, Lio/noties/markwon/html/jsoup/parser/Token$b;

    .line 46
    .line 47
    .line 48
    invoke-direct {v0}, Lio/noties/markwon/html/jsoup/parser/Token$b;-><init>()V

    .line 49
    .line 50
    iput-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->l:Lio/noties/markwon/html/jsoup/parser/Token$b;

    .line 51
    .line 52
    new-instance v0, Lio/noties/markwon/html/jsoup/parser/Token$d;

    .line 53
    .line 54
    .line 55
    invoke-direct {v0}, Lio/noties/markwon/html/jsoup/parser/Token$d;-><init>()V

    .line 56
    .line 57
    iput-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->m:Lio/noties/markwon/html/jsoup/parser/Token$d;

    .line 58
    .line 59
    new-instance v0, Lio/noties/markwon/html/jsoup/parser/Token$c;

    .line 60
    .line 61
    .line 62
    invoke-direct {v0}, Lio/noties/markwon/html/jsoup/parser/Token$c;-><init>()V

    .line 63
    .line 64
    iput-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->n:Lio/noties/markwon/html/jsoup/parser/Token$c;

    .line 65
    const/4 v0, 0x1

    .line 66
    .line 67
    new-array v0, v0, [I

    .line 68
    .line 69
    iput-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->p:[I

    .line 70
    const/4 v0, 0x2

    .line 71
    .line 72
    new-array v0, v0, [I

    .line 73
    .line 74
    iput-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->q:[I

    .line 75
    .line 76
    iput-object p1, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 77
    .line 78
    iput-object p2, p0, Lio/noties/markwon/html/jsoup/parser/c;->b:Lio/noties/markwon/html/jsoup/parser/ParseErrorList;

    .line 79
    return-void
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
.end method


# virtual methods
.method public a(Lio/noties/markwon/html/jsoup/parser/TokeniserState;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/noties/markwon/html/jsoup/parser/a;->a()V

    .line 6
    .line 7
    iput-object p1, p0, Lio/noties/markwon/html/jsoup/parser/c;->c:Lio/noties/markwon/html/jsoup/parser/TokeniserState;

    .line 8
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
    .line 38
    .line 39
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->o:Ljava/lang/String;

    .line 3
    return-object v0
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public final c(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->b:Lio/noties/markwon/html/jsoup/parser/ParseErrorList;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/noties/markwon/html/jsoup/parser/ParseErrorList;->canAddError()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->b:Lio/noties/markwon/html/jsoup/parser/ParseErrorList;

    .line 11
    .line 12
    new-instance v1, Lio/noties/markwon/html/jsoup/parser/b;

    .line 13
    .line 14
    iget-object v2, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Lio/noties/markwon/html/jsoup/parser/a;->F()I

    .line 18
    move-result v2

    .line 19
    .line 20
    const-string v3, "Invalid character reference: %s"

    .line 21
    .line 22
    .line 23
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    invoke-direct {v1, v2, v3, p1}, Lio/noties/markwon/html/jsoup/parser/b;-><init>(ILjava/lang/String;[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 31
    :cond_0
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public d(Ljava/lang/Character;Z)[I
    .locals 7

    .line 1
    .line 2
    const/16 v0, 0x80

    .line 3
    .line 4
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lio/noties/markwon/html/jsoup/parser/a;->r()Z

    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    return-object v2

    .line 13
    .line 14
    :cond_0
    if-eqz p1, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 18
    move-result p1

    .line 19
    .line 20
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Lio/noties/markwon/html/jsoup/parser/a;->q()C

    .line 24
    move-result v1

    .line 25
    .line 26
    if-ne p1, v1, :cond_1

    .line 27
    return-object v2

    .line 28
    .line 29
    :cond_1
    iget-object p1, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 30
    .line 31
    sget-object v1, Lio/noties/markwon/html/jsoup/parser/c;->r:[C

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v1}, Lio/noties/markwon/html/jsoup/parser/a;->z([C)Z

    .line 35
    move-result p1

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    return-object v2

    .line 39
    .line 40
    :cond_2
    iget-object p1, p0, Lio/noties/markwon/html/jsoup/parser/c;->p:[I

    .line 41
    .line 42
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Lio/noties/markwon/html/jsoup/parser/a;->t()V

    .line 46
    .line 47
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 48
    .line 49
    const-string v3, "#"

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v3}, Lio/noties/markwon/html/jsoup/parser/a;->u(Ljava/lang/String;)Z

    .line 53
    move-result v1

    .line 54
    .line 55
    const-string v3, "missing semicolon"

    .line 56
    .line 57
    const-string v4, ";"

    .line 58
    const/4 v5, 0x0

    .line 59
    .line 60
    if-eqz v1, :cond_b

    .line 61
    .line 62
    iget-object p2, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 63
    .line 64
    const-string v1, "X"

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2, v1}, Lio/noties/markwon/html/jsoup/parser/a;->v(Ljava/lang/String;)Z

    .line 68
    move-result p2

    .line 69
    .line 70
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 71
    .line 72
    if-eqz p2, :cond_3

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Lio/noties/markwon/html/jsoup/parser/a;->g()Ljava/lang/String;

    .line 76
    move-result-object v1

    .line 77
    goto :goto_0

    .line 78
    .line 79
    .line 80
    :cond_3
    invoke-virtual {v1}, Lio/noties/markwon/html/jsoup/parser/a;->f()Ljava/lang/String;

    .line 81
    move-result-object v1

    .line 82
    .line 83
    .line 84
    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 85
    move-result v6

    .line 86
    .line 87
    if-nez v6, :cond_4

    .line 88
    .line 89
    const-string p1, "numeric reference with no numerals"

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, p1}, Lio/noties/markwon/html/jsoup/parser/c;->c(Ljava/lang/String;)V

    .line 93
    .line 94
    iget-object p1, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Lio/noties/markwon/html/jsoup/parser/a;->H()V

    .line 98
    return-object v2

    .line 99
    .line 100
    :cond_4
    iget-object v2, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v4}, Lio/noties/markwon/html/jsoup/parser/a;->u(Ljava/lang/String;)Z

    .line 104
    move-result v2

    .line 105
    .line 106
    if-nez v2, :cond_5

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v3}, Lio/noties/markwon/html/jsoup/parser/c;->c(Ljava/lang/String;)V

    .line 110
    .line 111
    :cond_5
    if-eqz p2, :cond_6

    .line 112
    .line 113
    const/16 p2, 0x10

    .line 114
    goto :goto_1

    .line 115
    .line 116
    :cond_6
    const/16 p2, 0xa

    .line 117
    :goto_1
    const/4 v2, -0x1

    .line 118
    .line 119
    .line 120
    :try_start_0
    invoke-static {v1, p2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 121
    move-result-object p2

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 125
    move-result p2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 126
    goto :goto_2

    .line 127
    :catch_0
    move p2, v2

    .line 128
    .line 129
    :goto_2
    if-eq p2, v2, :cond_a

    .line 130
    .line 131
    .line 132
    const v1, 0xd800

    .line 133
    .line 134
    if-lt p2, v1, :cond_7

    .line 135
    .line 136
    .line 137
    const v1, 0xdfff

    .line 138
    .line 139
    if-le p2, v1, :cond_a

    .line 140
    .line 141
    .line 142
    :cond_7
    const v1, 0x10ffff

    .line 143
    .line 144
    if-le p2, v1, :cond_8

    .line 145
    goto :goto_3

    .line 146
    .line 147
    :cond_8
    if-lt p2, v0, :cond_9

    .line 148
    .line 149
    sget-object v1, Lio/noties/markwon/html/jsoup/parser/c;->s:[I

    .line 150
    array-length v2, v1

    .line 151
    add-int/2addr v2, v0

    .line 152
    .line 153
    if-ge p2, v2, :cond_9

    .line 154
    .line 155
    const-string v2, "character is not a valid unicode code point"

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, v2}, Lio/noties/markwon/html/jsoup/parser/c;->c(Ljava/lang/String;)V

    .line 159
    sub-int/2addr p2, v0

    .line 160
    .line 161
    aget p2, v1, p2

    .line 162
    .line 163
    :cond_9
    aput p2, p1, v5

    .line 164
    return-object p1

    .line 165
    .line 166
    :cond_a
    :goto_3
    const-string p2, "character outside of valid range"

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, p2}, Lio/noties/markwon/html/jsoup/parser/c;->c(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    const p2, 0xfffd

    .line 173
    .line 174
    aput p2, p1, v5

    .line 175
    return-object p1

    .line 176
    .line 177
    :cond_b
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0}, Lio/noties/markwon/html/jsoup/parser/a;->i()Ljava/lang/String;

    .line 181
    move-result-object v0

    .line 182
    .line 183
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 184
    .line 185
    const/16 v6, 0x3b

    .line 186
    .line 187
    .line 188
    invoke-virtual {v1, v6}, Lio/noties/markwon/html/jsoup/parser/a;->w(C)Z

    .line 189
    move-result v1

    .line 190
    .line 191
    .line 192
    invoke-static {v0}, Lif0/c;->b(Ljava/lang/String;)Z

    .line 193
    move-result v6

    .line 194
    .line 195
    if-eqz v6, :cond_11

    .line 196
    .line 197
    if-eqz v1, :cond_11

    .line 198
    .line 199
    if-eqz p2, :cond_d

    .line 200
    .line 201
    iget-object p2, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p2}, Lio/noties/markwon/html/jsoup/parser/a;->C()Z

    .line 205
    move-result p2

    .line 206
    .line 207
    if-nez p2, :cond_c

    .line 208
    .line 209
    iget-object p2, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 210
    .line 211
    .line 212
    invoke-virtual {p2}, Lio/noties/markwon/html/jsoup/parser/a;->A()Z

    .line 213
    move-result p2

    .line 214
    .line 215
    if-nez p2, :cond_c

    .line 216
    .line 217
    iget-object p2, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 218
    const/4 v1, 0x3

    .line 219
    .line 220
    new-array v1, v1, [C

    .line 221
    .line 222
    .line 223
    fill-array-data v1, :array_0

    .line 224
    .line 225
    .line 226
    invoke-virtual {p2, v1}, Lio/noties/markwon/html/jsoup/parser/a;->y([C)Z

    .line 227
    move-result p2

    .line 228
    .line 229
    if-eqz p2, :cond_d

    .line 230
    .line 231
    :cond_c
    iget-object p1, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 232
    .line 233
    .line 234
    invoke-virtual {p1}, Lio/noties/markwon/html/jsoup/parser/a;->H()V

    .line 235
    return-object v2

    .line 236
    .line 237
    :cond_d
    iget-object p2, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 238
    .line 239
    .line 240
    invoke-virtual {p2, v4}, Lio/noties/markwon/html/jsoup/parser/a;->u(Ljava/lang/String;)Z

    .line 241
    move-result p2

    .line 242
    .line 243
    if-nez p2, :cond_e

    .line 244
    .line 245
    .line 246
    invoke-virtual {p0, v3}, Lio/noties/markwon/html/jsoup/parser/c;->c(Ljava/lang/String;)V

    .line 247
    .line 248
    :cond_e
    iget-object p2, p0, Lio/noties/markwon/html/jsoup/parser/c;->q:[I

    .line 249
    .line 250
    .line 251
    invoke-static {v0, p2}, Lif0/c;->a(Ljava/lang/String;[I)I

    .line 252
    move-result p2

    .line 253
    const/4 v1, 0x1

    .line 254
    .line 255
    if-ne p2, v1, :cond_f

    .line 256
    .line 257
    iget-object p2, p0, Lio/noties/markwon/html/jsoup/parser/c;->q:[I

    .line 258
    .line 259
    aget p2, p2, v5

    .line 260
    .line 261
    aput p2, p1, v5

    .line 262
    return-object p1

    .line 263
    :cond_f
    const/4 p1, 0x2

    .line 264
    .line 265
    if-ne p2, p1, :cond_10

    .line 266
    .line 267
    iget-object p1, p0, Lio/noties/markwon/html/jsoup/parser/c;->q:[I

    .line 268
    return-object p1

    .line 269
    .line 270
    :cond_10
    new-instance p1, Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 274
    .line 275
    const-string p2, "Unexpected characters returned for "

    .line 276
    .line 277
    .line 278
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 285
    move-result-object p1

    .line 286
    .line 287
    .line 288
    invoke-static {p1}, Lhf0/b;->a(Ljava/lang/String;)V

    .line 289
    .line 290
    iget-object p1, p0, Lio/noties/markwon/html/jsoup/parser/c;->q:[I

    .line 291
    return-object p1

    .line 292
    .line 293
    :cond_11
    iget-object p1, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 294
    .line 295
    .line 296
    invoke-virtual {p1}, Lio/noties/markwon/html/jsoup/parser/a;->H()V

    .line 297
    .line 298
    if-eqz v1, :cond_12

    .line 299
    .line 300
    const-string p1, "invalid named referenece \'%s\'"

    .line 301
    .line 302
    .line 303
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 304
    move-result-object p2

    .line 305
    .line 306
    .line 307
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 308
    move-result-object p1

    .line 309
    .line 310
    .line 311
    invoke-virtual {p0, p1}, Lio/noties/markwon/html/jsoup/parser/c;->c(Ljava/lang/String;)V

    .line 312
    :cond_12
    return-object v2

    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    :array_0
    .array-data 2
        0x3ds
        0x2ds
        0x5fs
    .end array-data
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
.end method

.method public e()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->n:Lio/noties/markwon/html/jsoup/parser/Token$c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/noties/markwon/html/jsoup/parser/Token$c;->a()Lio/noties/markwon/html/jsoup/parser/Token;

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
.end method

.method public f()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->m:Lio/noties/markwon/html/jsoup/parser/Token$d;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/noties/markwon/html/jsoup/parser/Token$d;->a()Lio/noties/markwon/html/jsoup/parser/Token;

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
.end method

.method public g(Z)Lio/noties/markwon/html/jsoup/parser/Token$h;
    .locals 0

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Lio/noties/markwon/html/jsoup/parser/c;->j:Lio/noties/markwon/html/jsoup/parser/Token$g;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lio/noties/markwon/html/jsoup/parser/Token$g;->o()Lio/noties/markwon/html/jsoup/parser/Token$h;

    .line 8
    move-result-object p1

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lio/noties/markwon/html/jsoup/parser/c;->k:Lio/noties/markwon/html/jsoup/parser/Token$f;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lio/noties/markwon/html/jsoup/parser/Token$h;->o()Lio/noties/markwon/html/jsoup/parser/Token$h;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    :goto_0
    iput-object p1, p0, Lio/noties/markwon/html/jsoup/parser/c;->i:Lio/noties/markwon/html/jsoup/parser/Token$h;

    .line 18
    return-object p1
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
.end method

.method public h()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->h:Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lio/noties/markwon/html/jsoup/parser/Token;->b(Ljava/lang/StringBuilder;)V

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
.end method

.method public i(C)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lio/noties/markwon/html/jsoup/parser/c;->k(Ljava/lang/String;)V

    .line 8
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
    .line 38
    .line 39
.end method

.method public j(Lio/noties/markwon/html/jsoup/parser/Token;)V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->e:Z

    .line 3
    .line 4
    const-string v1, "There is an unread token pending!"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lhf0/b;->c(ZLjava/lang/String;)V

    .line 8
    .line 9
    iput-object p1, p0, Lio/noties/markwon/html/jsoup/parser/c;->d:Lio/noties/markwon/html/jsoup/parser/Token;

    .line 10
    const/4 v0, 0x1

    .line 11
    .line 12
    iput-boolean v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->e:Z

    .line 13
    .line 14
    iget-object v0, p1, Lio/noties/markwon/html/jsoup/parser/Token;->a:Lio/noties/markwon/html/jsoup/parser/Token$TokenType;

    .line 15
    .line 16
    sget-object v1, Lio/noties/markwon/html/jsoup/parser/Token$TokenType;->StartTag:Lio/noties/markwon/html/jsoup/parser/Token$TokenType;

    .line 17
    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    check-cast p1, Lio/noties/markwon/html/jsoup/parser/Token$g;

    .line 21
    .line 22
    iget-object p1, p1, Lio/noties/markwon/html/jsoup/parser/Token$h;->b:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p1, p0, Lio/noties/markwon/html/jsoup/parser/c;->o:Ljava/lang/String;

    .line 25
    return-void

    .line 26
    .line 27
    :cond_0
    sget-object v1, Lio/noties/markwon/html/jsoup/parser/Token$TokenType;->EndTag:Lio/noties/markwon/html/jsoup/parser/Token$TokenType;

    .line 28
    .line 29
    if-ne v0, v1, :cond_1

    .line 30
    .line 31
    check-cast p1, Lio/noties/markwon/html/jsoup/parser/Token$f;

    .line 32
    .line 33
    iget-object p1, p1, Lio/noties/markwon/html/jsoup/parser/Token$h;->j:Lif0/b;

    .line 34
    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    const-string p1, "Attributes incorrectly present on end tag"

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lio/noties/markwon/html/jsoup/parser/c;->r(Ljava/lang/String;)V

    .line 41
    :cond_1
    return-void
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
.end method

.method public k(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->f:Ljava/lang/String;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lio/noties/markwon/html/jsoup/parser/c;->f:Ljava/lang/String;

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->g:Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 13
    move-result v0

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->g:Ljava/lang/StringBuilder;

    .line 18
    .line 19
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/c;->f:Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    :cond_1
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->g:Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    return-void
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
.end method

.method public l([I)V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/lang/String;

    .line 3
    array-length v1, p1

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, p1, v2, v1}, Ljava/lang/String;-><init>([III)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lio/noties/markwon/html/jsoup/parser/c;->k(Ljava/lang/String;)V

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
.end method

.method public m()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->n:Lio/noties/markwon/html/jsoup/parser/Token$c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lio/noties/markwon/html/jsoup/parser/c;->j(Lio/noties/markwon/html/jsoup/parser/Token;)V

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
.end method

.method public n()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->m:Lio/noties/markwon/html/jsoup/parser/Token$d;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lio/noties/markwon/html/jsoup/parser/c;->j(Lio/noties/markwon/html/jsoup/parser/Token;)V

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
.end method

.method public o()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->i:Lio/noties/markwon/html/jsoup/parser/Token$h;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/noties/markwon/html/jsoup/parser/Token$h;->k()V

    .line 6
    .line 7
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->i:Lio/noties/markwon/html/jsoup/parser/Token$h;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lio/noties/markwon/html/jsoup/parser/c;->j(Lio/noties/markwon/html/jsoup/parser/Token;)V

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
.end method

.method public p(Lio/noties/markwon/html/jsoup/parser/TokeniserState;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->b:Lio/noties/markwon/html/jsoup/parser/ParseErrorList;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/noties/markwon/html/jsoup/parser/ParseErrorList;->canAddError()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->b:Lio/noties/markwon/html/jsoup/parser/ParseErrorList;

    .line 11
    .line 12
    new-instance v1, Lio/noties/markwon/html/jsoup/parser/b;

    .line 13
    .line 14
    iget-object v2, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Lio/noties/markwon/html/jsoup/parser/a;->F()I

    .line 18
    move-result v2

    .line 19
    .line 20
    const-string v3, "Unexpectedly reached end of file (EOF) in input state [%s]"

    .line 21
    .line 22
    .line 23
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    invoke-direct {v1, v2, v3, p1}, Lio/noties/markwon/html/jsoup/parser/b;-><init>(ILjava/lang/String;[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 31
    :cond_0
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public q(Lio/noties/markwon/html/jsoup/parser/TokeniserState;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->b:Lio/noties/markwon/html/jsoup/parser/ParseErrorList;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/noties/markwon/html/jsoup/parser/ParseErrorList;->canAddError()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->b:Lio/noties/markwon/html/jsoup/parser/ParseErrorList;

    .line 11
    .line 12
    new-instance v1, Lio/noties/markwon/html/jsoup/parser/b;

    .line 13
    .line 14
    iget-object v2, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Lio/noties/markwon/html/jsoup/parser/a;->F()I

    .line 18
    move-result v2

    .line 19
    .line 20
    iget-object v3, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Lio/noties/markwon/html/jsoup/parser/a;->q()C

    .line 24
    move-result v3

    .line 25
    .line 26
    .line 27
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 28
    move-result-object v3

    .line 29
    .line 30
    .line 31
    filled-new-array {v3, p1}, [Ljava/lang/Object;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    const-string v3, "Unexpected character \'%s\' in input state [%s]"

    .line 35
    .line 36
    .line 37
    invoke-direct {v1, v2, v3, p1}, Lio/noties/markwon/html/jsoup/parser/b;-><init>(ILjava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 41
    :cond_0
    return-void
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
.end method

.method public r(Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->b:Lio/noties/markwon/html/jsoup/parser/ParseErrorList;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/noties/markwon/html/jsoup/parser/ParseErrorList;->canAddError()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->b:Lio/noties/markwon/html/jsoup/parser/ParseErrorList;

    .line 11
    .line 12
    new-instance v1, Lio/noties/markwon/html/jsoup/parser/b;

    .line 13
    .line 14
    iget-object v2, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Lio/noties/markwon/html/jsoup/parser/a;->F()I

    .line 18
    move-result v2

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v2, p1}, Lio/noties/markwon/html/jsoup/parser/b;-><init>(ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 25
    :cond_0
    return-void
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
.end method

.method public s()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->o:Ljava/lang/String;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->i:Lio/noties/markwon/html/jsoup/parser/Token$h;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lio/noties/markwon/html/jsoup/parser/Token$h;->m()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/c;->o:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0
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

.method public t()Lio/noties/markwon/html/jsoup/parser/Token;
    .locals 5

    .line 1
    .line 2
    :goto_0
    iget-boolean v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->e:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->c:Lio/noties/markwon/html/jsoup/parser/TokeniserState;

    .line 7
    .line 8
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/c;->a:Lio/noties/markwon/html/jsoup/parser/a;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0, v1}, Lio/noties/markwon/html/jsoup/parser/TokeniserState;->read(Lio/noties/markwon/html/jsoup/parser/c;Lio/noties/markwon/html/jsoup/parser/a;)V

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->g:Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x0

    .line 21
    .line 22
    if-lez v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->g:Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    iget-object v3, p0, Lio/noties/markwon/html/jsoup/parser/c;->g:Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 34
    move-result v4

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3, v2, v4}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    iput-object v1, p0, Lio/noties/markwon/html/jsoup/parser/c;->f:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/c;->l:Lio/noties/markwon/html/jsoup/parser/Token$b;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v0}, Lio/noties/markwon/html/jsoup/parser/Token$b;->c(Ljava/lang/String;)Lio/noties/markwon/html/jsoup/parser/Token$b;

    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    .line 48
    :cond_1
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->f:Ljava/lang/String;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    iget-object v2, p0, Lio/noties/markwon/html/jsoup/parser/c;->l:Lio/noties/markwon/html/jsoup/parser/Token$b;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v0}, Lio/noties/markwon/html/jsoup/parser/Token$b;->c(Ljava/lang/String;)Lio/noties/markwon/html/jsoup/parser/Token$b;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    iput-object v1, p0, Lio/noties/markwon/html/jsoup/parser/c;->f:Ljava/lang/String;

    .line 59
    return-object v0

    .line 60
    .line 61
    :cond_2
    iput-boolean v2, p0, Lio/noties/markwon/html/jsoup/parser/c;->e:Z

    .line 62
    .line 63
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/c;->d:Lio/noties/markwon/html/jsoup/parser/Token;

    .line 64
    return-object v0
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
.end method

.method public u(Lio/noties/markwon/html/jsoup/parser/TokeniserState;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/noties/markwon/html/jsoup/parser/c;->c:Lio/noties/markwon/html/jsoup/parser/TokeniserState;

    .line 3
    return-void
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
    .line 38
    .line 39
.end method
