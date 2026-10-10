.class final enum Lio/noties/markwon/html/jsoup/parser/TokeniserState$40;
.super Lio/noties/markwon/html/jsoup/parser/TokeniserState;
.source "TokeniserState.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/noties/markwon/html/jsoup/parser/TokeniserState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, v0}, Lio/noties/markwon/html/jsoup/parser/TokeniserState;-><init>(Ljava/lang/String;ILio/noties/markwon/html/jsoup/parser/TokeniserState$1;)V

    .line 5
    return-void
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
.end method


# virtual methods
.method public read(Lio/noties/markwon/html/jsoup/parser/c;Lio/noties/markwon/html/jsoup/parser/a;)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lio/noties/markwon/html/jsoup/parser/TokeniserState;->attributeValueUnquoted:[C

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2, v0}, Lio/noties/markwon/html/jsoup/parser/a;->n([C)Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 10
    move-result v1

    .line 11
    .line 12
    if-lez v1, :cond_0

    .line 13
    .line 14
    iget-object v1, p1, Lio/noties/markwon/html/jsoup/parser/c;->i:Lio/noties/markwon/html/jsoup/parser/Token$h;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Lio/noties/markwon/html/jsoup/parser/Token$h;->f(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p2}, Lio/noties/markwon/html/jsoup/parser/a;->d()C

    .line 21
    move-result p2

    .line 22
    .line 23
    if-eqz p2, :cond_6

    .line 24
    .line 25
    const/16 v0, 0x20

    .line 26
    .line 27
    if-eq p2, v0, :cond_5

    .line 28
    .line 29
    const/16 v0, 0x22

    .line 30
    .line 31
    if-eq p2, v0, :cond_4

    .line 32
    .line 33
    const/16 v0, 0x60

    .line 34
    .line 35
    if-eq p2, v0, :cond_4

    .line 36
    .line 37
    .line 38
    const v0, 0xffff

    .line 39
    .line 40
    if-eq p2, v0, :cond_3

    .line 41
    .line 42
    const/16 v0, 0x9

    .line 43
    .line 44
    if-eq p2, v0, :cond_5

    .line 45
    .line 46
    const/16 v0, 0xa

    .line 47
    .line 48
    if-eq p2, v0, :cond_5

    .line 49
    .line 50
    const/16 v0, 0xc

    .line 51
    .line 52
    if-eq p2, v0, :cond_5

    .line 53
    .line 54
    const/16 v0, 0xd

    .line 55
    .line 56
    if-eq p2, v0, :cond_5

    .line 57
    .line 58
    const/16 v0, 0x26

    .line 59
    .line 60
    if-eq p2, v0, :cond_1

    .line 61
    .line 62
    const/16 v0, 0x27

    .line 63
    .line 64
    if-eq p2, v0, :cond_4

    .line 65
    .line 66
    .line 67
    packed-switch p2, :pswitch_data_0

    .line 68
    .line 69
    iget-object p1, p1, Lio/noties/markwon/html/jsoup/parser/c;->i:Lio/noties/markwon/html/jsoup/parser/Token$h;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, p2}, Lio/noties/markwon/html/jsoup/parser/Token$h;->e(C)V

    .line 73
    return-void

    .line 74
    .line 75
    .line 76
    :pswitch_0
    invoke-virtual {p1}, Lio/noties/markwon/html/jsoup/parser/c;->o()V

    .line 77
    .line 78
    sget-object p2, Lio/noties/markwon/html/jsoup/parser/TokeniserState;->Data:Lio/noties/markwon/html/jsoup/parser/TokeniserState;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p2}, Lio/noties/markwon/html/jsoup/parser/c;->u(Lio/noties/markwon/html/jsoup/parser/TokeniserState;)V

    .line 82
    return-void

    .line 83
    .line 84
    :cond_1
    const/16 p2, 0x3e

    .line 85
    .line 86
    .line 87
    invoke-static {p2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 88
    move-result-object p2

    .line 89
    const/4 v1, 0x1

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, p2, v1}, Lio/noties/markwon/html/jsoup/parser/c;->d(Ljava/lang/Character;Z)[I

    .line 93
    move-result-object p2

    .line 94
    .line 95
    if-eqz p2, :cond_2

    .line 96
    .line 97
    iget-object p1, p1, Lio/noties/markwon/html/jsoup/parser/c;->i:Lio/noties/markwon/html/jsoup/parser/Token$h;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, p2}, Lio/noties/markwon/html/jsoup/parser/Token$h;->g([I)V

    .line 101
    return-void

    .line 102
    .line 103
    :cond_2
    iget-object p1, p1, Lio/noties/markwon/html/jsoup/parser/c;->i:Lio/noties/markwon/html/jsoup/parser/Token$h;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v0}, Lio/noties/markwon/html/jsoup/parser/Token$h;->e(C)V

    .line 107
    return-void

    .line 108
    .line 109
    .line 110
    :cond_3
    invoke-virtual {p1, p0}, Lio/noties/markwon/html/jsoup/parser/c;->p(Lio/noties/markwon/html/jsoup/parser/TokeniserState;)V

    .line 111
    .line 112
    sget-object p2, Lio/noties/markwon/html/jsoup/parser/TokeniserState;->Data:Lio/noties/markwon/html/jsoup/parser/TokeniserState;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, p2}, Lio/noties/markwon/html/jsoup/parser/c;->u(Lio/noties/markwon/html/jsoup/parser/TokeniserState;)V

    .line 116
    return-void

    .line 117
    .line 118
    .line 119
    :cond_4
    :pswitch_1
    invoke-virtual {p1, p0}, Lio/noties/markwon/html/jsoup/parser/c;->q(Lio/noties/markwon/html/jsoup/parser/TokeniserState;)V

    .line 120
    .line 121
    iget-object p1, p1, Lio/noties/markwon/html/jsoup/parser/c;->i:Lio/noties/markwon/html/jsoup/parser/Token$h;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, p2}, Lio/noties/markwon/html/jsoup/parser/Token$h;->e(C)V

    .line 125
    return-void

    .line 126
    .line 127
    :cond_5
    sget-object p2, Lio/noties/markwon/html/jsoup/parser/TokeniserState;->BeforeAttributeName:Lio/noties/markwon/html/jsoup/parser/TokeniserState;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, p2}, Lio/noties/markwon/html/jsoup/parser/c;->u(Lio/noties/markwon/html/jsoup/parser/TokeniserState;)V

    .line 131
    return-void

    .line 132
    .line 133
    .line 134
    :cond_6
    invoke-virtual {p1, p0}, Lio/noties/markwon/html/jsoup/parser/c;->q(Lio/noties/markwon/html/jsoup/parser/TokeniserState;)V

    .line 135
    .line 136
    iget-object p1, p1, Lio/noties/markwon/html/jsoup/parser/c;->i:Lio/noties/markwon/html/jsoup/parser/Token$h;

    .line 137
    .line 138
    .line 139
    const p2, 0xfffd

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, p2}, Lio/noties/markwon/html/jsoup/parser/Token$h;->e(C)V

    .line 143
    return-void

    .line 144
    nop

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
    :pswitch_data_0
    .packed-switch 0x3c
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
