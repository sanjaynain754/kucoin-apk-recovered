.class public final Lorg/jsoup/parser/a;
.super Ljava/lang/Object;
.source "CharacterReader.java"


# instance fields
.field public a:[C

.field public b:Ljava/io/Reader;

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:[Ljava/lang/String;

.field public i:Z


# direct methods
.method public constructor <init>(Ljava/io/Reader;)V
    .locals 1

    const v0, 0x8000

    .line 9
    invoke-direct {p0, p1, v0}, Lorg/jsoup/parser/a;-><init>(Ljava/io/Reader;I)V

    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lorg/jsoup/parser/a;->g:I

    const/16 v0, 0x200

    .line 3
    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lorg/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lnh0/b;->i(Ljava/lang/Object;)V

    .line 5
    invoke-virtual {p1}, Ljava/io/Reader;->markSupported()Z

    move-result v0

    invoke-static {v0}, Lnh0/b;->c(Z)V

    .line 6
    iput-object p1, p0, Lorg/jsoup/parser/a;->b:Ljava/io/Reader;

    const p1, 0x8000

    if-le p2, p1, :cond_0

    move p2, p1

    .line 7
    :cond_0
    new-array p1, p2, [C

    iput-object p1, p0, Lorg/jsoup/parser/a;->a:[C

    .line 8
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->b()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 10
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-direct {p0, v0, p1}, Lorg/jsoup/parser/a;-><init>(Ljava/io/Reader;I)V

    return-void
.end method

.method public static I([CIILjava/lang/String;)Z
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-ne p2, v0, :cond_2

    .line 8
    move v0, v1

    .line 9
    .line 10
    :goto_0
    add-int/lit8 v2, p2, -0x1

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    add-int/lit8 p2, p1, 0x1

    .line 15
    .line 16
    aget-char p1, p0, p1

    .line 17
    .line 18
    add-int/lit8 v3, v0, 0x1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p3, v0}, Ljava/lang/String;->charAt(I)C

    .line 22
    move-result v0

    .line 23
    .line 24
    if-eq p1, v0, :cond_0

    .line 25
    return v1

    .line 26
    :cond_0
    move p1, p2

    .line 27
    move p2, v2

    .line 28
    move v0, v3

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :cond_2
    return v1
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
.end method

.method public static c([C[Ljava/lang/String;II)Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    const/16 v0, 0xc

    .line 3
    .line 4
    if-le p3, v0, :cond_0

    .line 5
    .line 6
    new-instance p1, Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p1, p0, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 10
    return-object p1

    .line 11
    :cond_0
    const/4 v0, 0x1

    .line 12
    .line 13
    if-ge p3, v0, :cond_1

    .line 14
    .line 15
    const-string p0, ""

    .line 16
    return-object p0

    .line 17
    .line 18
    :cond_1
    mul-int/lit8 v0, p3, 0x1f

    .line 19
    const/4 v1, 0x0

    .line 20
    move v2, p2

    .line 21
    .line 22
    :goto_0
    if-ge v1, p3, :cond_2

    .line 23
    .line 24
    mul-int/lit8 v0, v0, 0x1f

    .line 25
    .line 26
    add-int/lit8 v3, v2, 0x1

    .line 27
    .line 28
    aget-char v2, p0, v2

    .line 29
    add-int/2addr v0, v2

    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    move v2, v3

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_2
    and-int/lit16 v0, v0, 0x1ff

    .line 36
    .line 37
    aget-object v1, p1, v0

    .line 38
    .line 39
    if-nez v1, :cond_3

    .line 40
    .line 41
    new-instance v1, Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    invoke-direct {v1, p0, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 45
    .line 46
    aput-object v1, p1, v0

    .line 47
    return-object v1

    .line 48
    .line 49
    .line 50
    :cond_3
    invoke-static {p0, p2, p3, v1}, Lorg/jsoup/parser/a;->I([CIILjava/lang/String;)Z

    .line 51
    move-result v2

    .line 52
    .line 53
    if-eqz v2, :cond_4

    .line 54
    return-object v1

    .line 55
    .line 56
    :cond_4
    new-instance v1, Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    invoke-direct {v1, p0, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 60
    .line 61
    aput-object v1, p1, v0

    .line 62
    return-object v1
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
.end method


# virtual methods
.method public varargs A([C)Z
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->t()Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    return v1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->b()V

    .line 12
    .line 13
    iget-object v0, p0, Lorg/jsoup/parser/a;->a:[C

    .line 14
    .line 15
    iget v2, p0, Lorg/jsoup/parser/a;->e:I

    .line 16
    .line 17
    aget-char v0, v0, v2

    .line 18
    array-length v2, p1

    .line 19
    move v3, v1

    .line 20
    .line 21
    :goto_0
    if-ge v3, v2, :cond_2

    .line 22
    .line 23
    aget-char v4, p1, v3

    .line 24
    .line 25
    if-ne v4, v0, :cond_1

    .line 26
    const/4 p1, 0x1

    .line 27
    return p1

    .line 28
    .line 29
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    return v1
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
.end method

.method public B([C)Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->t()Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lorg/jsoup/parser/a;->a:[C

    .line 12
    .line 13
    iget v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 14
    .line 15
    aget-char v0, v0, v1

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0}, Ljava/util/Arrays;->binarySearch([CC)I

    .line 19
    move-result p1

    .line 20
    .line 21
    if-ltz p1, :cond_0

    .line 22
    const/4 p1, 0x1

    .line 23
    return p1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return p1
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public C()Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->t()Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    return v1

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lorg/jsoup/parser/a;->a:[C

    .line 11
    .line 12
    iget v2, p0, Lorg/jsoup/parser/a;->e:I

    .line 13
    .line 14
    aget-char v0, v0, v2

    .line 15
    .line 16
    const/16 v2, 0x30

    .line 17
    .line 18
    if-lt v0, v2, :cond_1

    .line 19
    .line 20
    const/16 v2, 0x39

    .line 21
    .line 22
    if-gt v0, v2, :cond_1

    .line 23
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :cond_1
    return v1
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
.end method

.method public D(Ljava/lang/String;)Z
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 7
    move-result v0

    .line 8
    .line 9
    iget v1, p0, Lorg/jsoup/parser/a;->c:I

    .line 10
    .line 11
    iget v2, p0, Lorg/jsoup/parser/a;->e:I

    .line 12
    sub-int/2addr v1, v2

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    if-le v0, v1, :cond_0

    .line 16
    return v2

    .line 17
    :cond_0
    move v1, v2

    .line 18
    .line 19
    :goto_0
    if-ge v1, v0, :cond_2

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 23
    move-result v3

    .line 24
    .line 25
    .line 26
    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    .line 27
    move-result v3

    .line 28
    .line 29
    iget-object v4, p0, Lorg/jsoup/parser/a;->a:[C

    .line 30
    .line 31
    iget v5, p0, Lorg/jsoup/parser/a;->e:I

    .line 32
    add-int/2addr v5, v1

    .line 33
    .line 34
    aget-char v4, v4, v5

    .line 35
    .line 36
    .line 37
    invoke-static {v4}, Ljava/lang/Character;->toUpperCase(C)C

    .line 38
    move-result v4

    .line 39
    .line 40
    if-eq v3, v4, :cond_1

    .line 41
    return v2

    .line 42
    .line 43
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const/4 p1, 0x1

    .line 46
    return p1
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
.end method

.method public E()Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->t()Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    return v1

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lorg/jsoup/parser/a;->a:[C

    .line 11
    .line 12
    iget v2, p0, Lorg/jsoup/parser/a;->e:I

    .line 13
    .line 14
    aget-char v0, v0, v2

    .line 15
    .line 16
    const/16 v2, 0x41

    .line 17
    .line 18
    if-lt v0, v2, :cond_1

    .line 19
    .line 20
    const/16 v2, 0x5a

    .line 21
    .line 22
    if-le v0, v2, :cond_3

    .line 23
    .line 24
    :cond_1
    const/16 v2, 0x61

    .line 25
    .line 26
    if-lt v0, v2, :cond_2

    .line 27
    .line 28
    const/16 v2, 0x7a

    .line 29
    .line 30
    if-le v0, v2, :cond_3

    .line 31
    .line 32
    .line 33
    :cond_2
    invoke-static {v0}, Ljava/lang/Character;->isLetter(C)Z

    .line 34
    move-result v0

    .line 35
    .line 36
    if-eqz v0, :cond_4

    .line 37
    :cond_3
    const/4 v0, 0x1

    .line 38
    return v0

    .line 39
    :cond_4
    return v1
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
.end method

.method public F(C)I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->b()V

    .line 4
    .line 5
    iget v0, p0, Lorg/jsoup/parser/a;->e:I

    .line 6
    .line 7
    :goto_0
    iget v1, p0, Lorg/jsoup/parser/a;->c:I

    .line 8
    .line 9
    if-ge v0, v1, :cond_1

    .line 10
    .line 11
    iget-object v1, p0, Lorg/jsoup/parser/a;->a:[C

    .line 12
    .line 13
    aget-char v1, v1, v0

    .line 14
    .line 15
    if-ne p1, v1, :cond_0

    .line 16
    .line 17
    iget p1, p0, Lorg/jsoup/parser/a;->e:I

    .line 18
    sub-int/2addr v0, p1

    .line 19
    return v0

    .line 20
    .line 21
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 p1, -0x1

    .line 24
    return p1
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public G(Ljava/lang/CharSequence;)I
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->b()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    .line 7
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 8
    move-result v0

    .line 9
    .line 10
    iget v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 11
    .line 12
    :goto_0
    iget v2, p0, Lorg/jsoup/parser/a;->c:I

    .line 13
    .line 14
    if-ge v1, v2, :cond_3

    .line 15
    .line 16
    iget-object v2, p0, Lorg/jsoup/parser/a;->a:[C

    .line 17
    .line 18
    aget-char v2, v2, v1

    .line 19
    const/4 v3, 0x1

    .line 20
    .line 21
    if-eq v0, v2, :cond_0

    .line 22
    :goto_1
    add-int/2addr v1, v3

    .line 23
    .line 24
    iget v2, p0, Lorg/jsoup/parser/a;->c:I

    .line 25
    .line 26
    if-ge v1, v2, :cond_0

    .line 27
    .line 28
    iget-object v2, p0, Lorg/jsoup/parser/a;->a:[C

    .line 29
    .line 30
    aget-char v2, v2, v1

    .line 31
    .line 32
    if-eq v0, v2, :cond_0

    .line 33
    goto :goto_1

    .line 34
    .line 35
    :cond_0
    add-int/lit8 v2, v1, 0x1

    .line 36
    .line 37
    .line 38
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 39
    move-result v4

    .line 40
    add-int/2addr v4, v2

    .line 41
    sub-int/2addr v4, v3

    .line 42
    .line 43
    iget v5, p0, Lorg/jsoup/parser/a;->c:I

    .line 44
    .line 45
    if-ge v1, v5, :cond_2

    .line 46
    .line 47
    if-gt v4, v5, :cond_2

    .line 48
    move v5, v2

    .line 49
    .line 50
    :goto_2
    if-ge v5, v4, :cond_1

    .line 51
    .line 52
    .line 53
    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 54
    move-result v6

    .line 55
    .line 56
    iget-object v7, p0, Lorg/jsoup/parser/a;->a:[C

    .line 57
    .line 58
    aget-char v7, v7, v5

    .line 59
    .line 60
    if-ne v6, v7, :cond_1

    .line 61
    .line 62
    add-int/lit8 v5, v5, 0x1

    .line 63
    .line 64
    add-int/lit8 v3, v3, 0x1

    .line 65
    goto :goto_2

    .line 66
    .line 67
    :cond_1
    if-ne v5, v4, :cond_2

    .line 68
    .line 69
    iget p1, p0, Lorg/jsoup/parser/a;->e:I

    .line 70
    sub-int/2addr v1, p1

    .line 71
    return v1

    .line 72
    :cond_2
    move v1, v2

    .line 73
    goto :goto_0

    .line 74
    :cond_3
    const/4 p1, -0x1

    .line 75
    return p1
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
.end method

.method public H()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lorg/jsoup/parser/a;->f:I

    .line 3
    .line 4
    iget v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 5
    add-int/2addr v0, v1

    .line 6
    return v0
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
.end method

.method public J()V
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lorg/jsoup/parser/a;->g:I

    .line 3
    const/4 v1, -0x1

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    iput v0, p0, Lorg/jsoup/parser/a;->e:I

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->L()V

    .line 11
    return-void

    .line 12
    .line 13
    :cond_0
    new-instance v0, Lorg/jsoup/UncheckedIOException;

    .line 14
    .line 15
    new-instance v1, Ljava/io/IOException;

    .line 16
    .line 17
    const-string v2, "Mark invalid"

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1}, Lorg/jsoup/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    .line 24
    throw v0
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
.end method

.method public K()V
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lorg/jsoup/parser/a;->e:I

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    sub-int/2addr v0, v1

    .line 7
    .line 8
    iput v0, p0, Lorg/jsoup/parser/a;->e:I

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    new-instance v0, Lorg/jsoup/UncheckedIOException;

    .line 12
    .line 13
    new-instance v1, Ljava/io/IOException;

    .line 14
    .line 15
    const-string v2, "No buffer left to unconsume"

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1}, Lorg/jsoup/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    .line 22
    throw v0
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
.end method

.method public L()V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    .line 3
    iput v0, p0, Lorg/jsoup/parser/a;->g:I

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
.end method

.method public a()V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lorg/jsoup/parser/a;->e:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    iput v0, p0, Lorg/jsoup/parser/a;->e:I

    .line 7
    return-void
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
.end method

.method public final b()V
    .locals 14

    .line 1
    .line 2
    iget-boolean v0, p0, Lorg/jsoup/parser/a;->i:Z

    .line 3
    .line 4
    if-nez v0, :cond_8

    .line 5
    .line 6
    iget v0, p0, Lorg/jsoup/parser/a;->e:I

    .line 7
    .line 8
    iget v1, p0, Lorg/jsoup/parser/a;->d:I

    .line 9
    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_6

    .line 13
    .line 14
    :cond_0
    iget v1, p0, Lorg/jsoup/parser/a;->g:I

    .line 15
    const/4 v2, -0x1

    .line 16
    const/4 v3, 0x0

    .line 17
    .line 18
    if-eq v1, v2, :cond_1

    .line 19
    sub-int/2addr v0, v1

    .line 20
    move v13, v1

    .line 21
    move v1, v0

    .line 22
    move v0, v13

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move v1, v3

    .line 25
    .line 26
    :goto_0
    :try_start_0
    iget-object v4, p0, Lorg/jsoup/parser/a;->b:Ljava/io/Reader;

    .line 27
    int-to-long v5, v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4, v5, v6}, Ljava/io/Reader;->skip(J)J

    .line 31
    move-result-wide v7

    .line 32
    .line 33
    iget-object v4, p0, Lorg/jsoup/parser/a;->b:Ljava/io/Reader;

    .line 34
    .line 35
    .line 36
    const v9, 0x8000

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4, v9}, Ljava/io/Reader;->mark(I)V

    .line 40
    move v4, v3

    .line 41
    .line 42
    :goto_1
    const/16 v9, 0x400

    .line 43
    const/4 v10, 0x1

    .line 44
    .line 45
    if-gt v4, v9, :cond_4

    .line 46
    .line 47
    iget-object v9, p0, Lorg/jsoup/parser/a;->b:Ljava/io/Reader;

    .line 48
    .line 49
    iget-object v11, p0, Lorg/jsoup/parser/a;->a:[C

    .line 50
    array-length v12, v11

    .line 51
    sub-int/2addr v12, v4

    .line 52
    .line 53
    .line 54
    invoke-virtual {v9, v11, v4, v12}, Ljava/io/Reader;->read([CII)I

    .line 55
    move-result v9

    .line 56
    .line 57
    if-ne v9, v2, :cond_2

    .line 58
    .line 59
    iput-boolean v10, p0, Lorg/jsoup/parser/a;->i:Z

    .line 60
    goto :goto_2

    .line 61
    :catch_0
    move-exception v0

    .line 62
    goto :goto_5

    .line 63
    .line 64
    :cond_2
    :goto_2
    if-gtz v9, :cond_3

    .line 65
    goto :goto_3

    .line 66
    :cond_3
    add-int/2addr v4, v9

    .line 67
    goto :goto_1

    .line 68
    .line 69
    :cond_4
    :goto_3
    iget-object v9, p0, Lorg/jsoup/parser/a;->b:Ljava/io/Reader;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v9}, Ljava/io/Reader;->reset()V

    .line 73
    .line 74
    if-lez v4, :cond_8

    .line 75
    .line 76
    cmp-long v5, v7, v5

    .line 77
    .line 78
    if-nez v5, :cond_5

    .line 79
    goto :goto_4

    .line 80
    :cond_5
    move v10, v3

    .line 81
    .line 82
    .line 83
    :goto_4
    invoke-static {v10}, Lnh0/b;->c(Z)V

    .line 84
    .line 85
    iput v4, p0, Lorg/jsoup/parser/a;->c:I

    .line 86
    .line 87
    iget v5, p0, Lorg/jsoup/parser/a;->f:I

    .line 88
    add-int/2addr v5, v0

    .line 89
    .line 90
    iput v5, p0, Lorg/jsoup/parser/a;->f:I

    .line 91
    .line 92
    iput v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 93
    .line 94
    iget v0, p0, Lorg/jsoup/parser/a;->g:I

    .line 95
    .line 96
    if-eq v0, v2, :cond_6

    .line 97
    .line 98
    iput v3, p0, Lorg/jsoup/parser/a;->g:I

    .line 99
    .line 100
    :cond_6
    const/16 v0, 0x6000

    .line 101
    .line 102
    if-le v4, v0, :cond_7

    .line 103
    move v4, v0

    .line 104
    .line 105
    :cond_7
    iput v4, p0, Lorg/jsoup/parser/a;->d:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    return-void

    .line 107
    .line 108
    :goto_5
    new-instance v1, Lorg/jsoup/UncheckedIOException;

    .line 109
    .line 110
    .line 111
    invoke-direct {v1, v0}, Lorg/jsoup/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    .line 112
    throw v1

    .line 113
    :cond_8
    :goto_6
    return-void
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
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
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
.end method

.method public d()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lorg/jsoup/parser/a;->b:Ljava/io/Reader;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    .line 8
    .line 9
    :try_start_0
    invoke-virtual {v0}, Ljava/io/Reader;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    iput-object v1, p0, Lorg/jsoup/parser/a;->b:Ljava/io/Reader;

    .line 12
    .line 13
    iput-object v1, p0, Lorg/jsoup/parser/a;->a:[C

    .line 14
    .line 15
    iput-object v1, p0, Lorg/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    .line 19
    iput-object v1, p0, Lorg/jsoup/parser/a;->b:Ljava/io/Reader;

    .line 20
    .line 21
    iput-object v1, p0, Lorg/jsoup/parser/a;->a:[C

    .line 22
    .line 23
    iput-object v1, p0, Lorg/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 24
    throw v0

    .line 25
    .line 26
    :catch_0
    iput-object v1, p0, Lorg/jsoup/parser/a;->b:Ljava/io/Reader;

    .line 27
    .line 28
    iput-object v1, p0, Lorg/jsoup/parser/a;->a:[C

    .line 29
    .line 30
    iput-object v1, p0, Lorg/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 31
    :goto_0
    return-void
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
.end method

.method public e()C
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->u()Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    const v0, 0xffff

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lorg/jsoup/parser/a;->a:[C

    .line 16
    .line 17
    iget v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 18
    .line 19
    aget-char v0, v0, v1

    .line 20
    .line 21
    :goto_0
    iget v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    iput v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 26
    return v0
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
.end method

.method public f()Ljava/lang/String;
    .locals 6

    .line 1
    .line 2
    iget v0, p0, Lorg/jsoup/parser/a;->e:I

    .line 3
    .line 4
    iget v1, p0, Lorg/jsoup/parser/a;->c:I

    .line 5
    .line 6
    iget-object v2, p0, Lorg/jsoup/parser/a;->a:[C

    .line 7
    move v3, v0

    .line 8
    .line 9
    :goto_0
    if-ge v3, v1, :cond_0

    .line 10
    .line 11
    aget-char v4, v2, v3

    .line 12
    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    const/16 v5, 0x26

    .line 16
    .line 17
    if-eq v4, v5, :cond_0

    .line 18
    .line 19
    const/16 v5, 0x3c

    .line 20
    .line 21
    if-eq v4, v5, :cond_0

    .line 22
    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    goto :goto_0

    .line 25
    .line 26
    :cond_0
    iput v3, p0, Lorg/jsoup/parser/a;->e:I

    .line 27
    .line 28
    if-le v3, v0, :cond_1

    .line 29
    .line 30
    iget-object v1, p0, Lorg/jsoup/parser/a;->a:[C

    .line 31
    .line 32
    iget-object v2, p0, Lorg/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 33
    sub-int/2addr v3, v0

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v2, v0, v3}, Lorg/jsoup/parser/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

    .line 37
    move-result-object v0

    .line 38
    return-object v0

    .line 39
    .line 40
    :cond_1
    const-string v0, ""

    .line 41
    return-object v0
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
.end method

.method public g()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->b()V

    .line 4
    .line 5
    iget v0, p0, Lorg/jsoup/parser/a;->e:I

    .line 6
    .line 7
    :goto_0
    iget v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 8
    .line 9
    iget v2, p0, Lorg/jsoup/parser/a;->c:I

    .line 10
    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Lorg/jsoup/parser/a;->a:[C

    .line 14
    .line 15
    aget-char v2, v2, v1

    .line 16
    .line 17
    const/16 v3, 0x30

    .line 18
    .line 19
    if-lt v2, v3, :cond_0

    .line 20
    .line 21
    const/16 v3, 0x39

    .line 22
    .line 23
    if-gt v2, v3, :cond_0

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    iput v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_0
    iget-object v2, p0, Lorg/jsoup/parser/a;->a:[C

    .line 31
    .line 32
    iget-object v3, p0, Lorg/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 33
    sub-int/2addr v1, v0

    .line 34
    .line 35
    .line 36
    invoke-static {v2, v3, v0, v1}, Lorg/jsoup/parser/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

    .line 37
    move-result-object v0

    .line 38
    return-object v0
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
.end method

.method public h()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->b()V

    .line 4
    .line 5
    iget v0, p0, Lorg/jsoup/parser/a;->e:I

    .line 6
    .line 7
    :goto_0
    iget v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 8
    .line 9
    iget v2, p0, Lorg/jsoup/parser/a;->c:I

    .line 10
    .line 11
    if-ge v1, v2, :cond_3

    .line 12
    .line 13
    iget-object v2, p0, Lorg/jsoup/parser/a;->a:[C

    .line 14
    .line 15
    aget-char v2, v2, v1

    .line 16
    .line 17
    const/16 v3, 0x30

    .line 18
    .line 19
    if-lt v2, v3, :cond_0

    .line 20
    .line 21
    const/16 v3, 0x39

    .line 22
    .line 23
    if-le v2, v3, :cond_2

    .line 24
    .line 25
    :cond_0
    const/16 v3, 0x41

    .line 26
    .line 27
    if-lt v2, v3, :cond_1

    .line 28
    .line 29
    const/16 v3, 0x46

    .line 30
    .line 31
    if-le v2, v3, :cond_2

    .line 32
    .line 33
    :cond_1
    const/16 v3, 0x61

    .line 34
    .line 35
    if-lt v2, v3, :cond_3

    .line 36
    .line 37
    const/16 v3, 0x66

    .line 38
    .line 39
    if-gt v2, v3, :cond_3

    .line 40
    .line 41
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    iput v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :cond_3
    iget-object v2, p0, Lorg/jsoup/parser/a;->a:[C

    .line 47
    .line 48
    iget-object v3, p0, Lorg/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 49
    sub-int/2addr v1, v0

    .line 50
    .line 51
    .line 52
    invoke-static {v2, v3, v0, v1}, Lorg/jsoup/parser/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

    .line 53
    move-result-object v0

    .line 54
    return-object v0
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
.end method

.method public i()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->b()V

    .line 4
    .line 5
    iget v0, p0, Lorg/jsoup/parser/a;->e:I

    .line 6
    .line 7
    :goto_0
    iget v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 8
    .line 9
    iget v2, p0, Lorg/jsoup/parser/a;->c:I

    .line 10
    .line 11
    if-ge v1, v2, :cond_3

    .line 12
    .line 13
    iget-object v2, p0, Lorg/jsoup/parser/a;->a:[C

    .line 14
    .line 15
    aget-char v1, v2, v1

    .line 16
    .line 17
    const/16 v2, 0x41

    .line 18
    .line 19
    if-lt v1, v2, :cond_0

    .line 20
    .line 21
    const/16 v2, 0x5a

    .line 22
    .line 23
    if-le v1, v2, :cond_2

    .line 24
    .line 25
    :cond_0
    const/16 v2, 0x61

    .line 26
    .line 27
    if-lt v1, v2, :cond_1

    .line 28
    .line 29
    const/16 v2, 0x7a

    .line 30
    .line 31
    if-le v1, v2, :cond_2

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-static {v1}, Ljava/lang/Character;->isLetter(C)Z

    .line 35
    move-result v1

    .line 36
    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    :cond_2
    iget v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    iput v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :cond_3
    iget-object v1, p0, Lorg/jsoup/parser/a;->a:[C

    .line 47
    .line 48
    iget-object v2, p0, Lorg/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 49
    .line 50
    iget v3, p0, Lorg/jsoup/parser/a;->e:I

    .line 51
    sub-int/2addr v3, v0

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v2, v0, v3}, Lorg/jsoup/parser/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

    .line 55
    move-result-object v0

    .line 56
    return-object v0
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
.end method

.method public j()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->b()V

    .line 4
    .line 5
    iget v0, p0, Lorg/jsoup/parser/a;->e:I

    .line 6
    .line 7
    :goto_0
    iget v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 8
    .line 9
    iget v2, p0, Lorg/jsoup/parser/a;->c:I

    .line 10
    .line 11
    if-ge v1, v2, :cond_3

    .line 12
    .line 13
    iget-object v2, p0, Lorg/jsoup/parser/a;->a:[C

    .line 14
    .line 15
    aget-char v1, v2, v1

    .line 16
    .line 17
    const/16 v2, 0x41

    .line 18
    .line 19
    if-lt v1, v2, :cond_0

    .line 20
    .line 21
    const/16 v2, 0x5a

    .line 22
    .line 23
    if-le v1, v2, :cond_2

    .line 24
    .line 25
    :cond_0
    const/16 v2, 0x61

    .line 26
    .line 27
    if-lt v1, v2, :cond_1

    .line 28
    .line 29
    const/16 v2, 0x7a

    .line 30
    .line 31
    if-le v1, v2, :cond_2

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-static {v1}, Ljava/lang/Character;->isLetter(C)Z

    .line 35
    move-result v1

    .line 36
    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    :cond_2
    iget v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    iput v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 44
    goto :goto_0

    .line 45
    .line 46
    .line 47
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->u()Z

    .line 48
    move-result v1

    .line 49
    .line 50
    if-nez v1, :cond_4

    .line 51
    .line 52
    iget-object v1, p0, Lorg/jsoup/parser/a;->a:[C

    .line 53
    .line 54
    iget v2, p0, Lorg/jsoup/parser/a;->e:I

    .line 55
    .line 56
    aget-char v1, v1, v2

    .line 57
    .line 58
    const/16 v3, 0x30

    .line 59
    .line 60
    if-lt v1, v3, :cond_4

    .line 61
    .line 62
    const/16 v3, 0x39

    .line 63
    .line 64
    if-gt v1, v3, :cond_4

    .line 65
    .line 66
    add-int/lit8 v2, v2, 0x1

    .line 67
    .line 68
    iput v2, p0, Lorg/jsoup/parser/a;->e:I

    .line 69
    goto :goto_1

    .line 70
    .line 71
    :cond_4
    iget-object v1, p0, Lorg/jsoup/parser/a;->a:[C

    .line 72
    .line 73
    iget-object v2, p0, Lorg/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 74
    .line 75
    iget v3, p0, Lorg/jsoup/parser/a;->e:I

    .line 76
    sub-int/2addr v3, v0

    .line 77
    .line 78
    .line 79
    invoke-static {v1, v2, v0, v3}, Lorg/jsoup/parser/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

    .line 80
    move-result-object v0

    .line 81
    return-object v0
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
.end method

.method public k()Ljava/lang/String;
    .locals 6

    .line 1
    .line 2
    iget v0, p0, Lorg/jsoup/parser/a;->e:I

    .line 3
    .line 4
    iget v1, p0, Lorg/jsoup/parser/a;->c:I

    .line 5
    .line 6
    iget-object v2, p0, Lorg/jsoup/parser/a;->a:[C

    .line 7
    move v3, v0

    .line 8
    .line 9
    :goto_0
    if-ge v3, v1, :cond_0

    .line 10
    .line 11
    aget-char v4, v2, v3

    .line 12
    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    const/16 v5, 0x3c

    .line 16
    .line 17
    if-eq v4, v5, :cond_0

    .line 18
    .line 19
    add-int/lit8 v3, v3, 0x1

    .line 20
    goto :goto_0

    .line 21
    .line 22
    :cond_0
    iput v3, p0, Lorg/jsoup/parser/a;->e:I

    .line 23
    .line 24
    if-le v3, v0, :cond_1

    .line 25
    .line 26
    iget-object v1, p0, Lorg/jsoup/parser/a;->a:[C

    .line 27
    .line 28
    iget-object v2, p0, Lorg/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 29
    sub-int/2addr v3, v0

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v2, v0, v3}, Lorg/jsoup/parser/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    .line 36
    :cond_1
    const-string v0, ""

    .line 37
    return-object v0
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
.end method

.method public l()Ljava/lang/String;
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->b()V

    .line 4
    .line 5
    iget v0, p0, Lorg/jsoup/parser/a;->e:I

    .line 6
    .line 7
    iget v1, p0, Lorg/jsoup/parser/a;->c:I

    .line 8
    .line 9
    iget-object v2, p0, Lorg/jsoup/parser/a;->a:[C

    .line 10
    move v3, v0

    .line 11
    .line 12
    :goto_0
    if-ge v3, v1, :cond_0

    .line 13
    .line 14
    aget-char v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    const/16 v5, 0x20

    .line 19
    .line 20
    if-eq v4, v5, :cond_0

    .line 21
    .line 22
    const/16 v5, 0x2f

    .line 23
    .line 24
    if-eq v4, v5, :cond_0

    .line 25
    .line 26
    const/16 v5, 0x3c

    .line 27
    .line 28
    if-eq v4, v5, :cond_0

    .line 29
    .line 30
    const/16 v5, 0x3e

    .line 31
    .line 32
    if-eq v4, v5, :cond_0

    .line 33
    .line 34
    const/16 v5, 0x9

    .line 35
    .line 36
    if-eq v4, v5, :cond_0

    .line 37
    .line 38
    const/16 v5, 0xa

    .line 39
    .line 40
    if-eq v4, v5, :cond_0

    .line 41
    .line 42
    const/16 v5, 0xc

    .line 43
    .line 44
    if-eq v4, v5, :cond_0

    .line 45
    .line 46
    const/16 v5, 0xd

    .line 47
    .line 48
    if-eq v4, v5, :cond_0

    .line 49
    .line 50
    add-int/lit8 v3, v3, 0x1

    .line 51
    goto :goto_0

    .line 52
    .line 53
    :cond_0
    iput v3, p0, Lorg/jsoup/parser/a;->e:I

    .line 54
    .line 55
    if-le v3, v0, :cond_1

    .line 56
    .line 57
    iget-object v1, p0, Lorg/jsoup/parser/a;->a:[C

    .line 58
    .line 59
    iget-object v2, p0, Lorg/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 60
    sub-int/2addr v3, v0

    .line 61
    .line 62
    .line 63
    invoke-static {v1, v2, v0, v3}, Lorg/jsoup/parser/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

    .line 64
    move-result-object v0

    .line 65
    return-object v0

    .line 66
    .line 67
    :cond_1
    const-string v0, ""

    .line 68
    return-object v0
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
.end method

.method public m(C)Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/jsoup/parser/a;->F(C)I

    .line 4
    move-result p1

    .line 5
    const/4 v0, -0x1

    .line 6
    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lorg/jsoup/parser/a;->a:[C

    .line 10
    .line 11
    iget-object v1, p0, Lorg/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 12
    .line 13
    iget v2, p0, Lorg/jsoup/parser/a;->e:I

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1, v2, p1}, Lorg/jsoup/parser/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    iget v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 20
    add-int/2addr v1, p1

    .line 21
    .line 22
    iput v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 23
    return-object v0

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->q()Ljava/lang/String;

    .line 27
    move-result-object p1

    .line 28
    return-object p1
    .line 29
    .line 30
.end method

.method public n(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/jsoup/parser/a;->G(Ljava/lang/CharSequence;)I

    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lorg/jsoup/parser/a;->a:[C

    .line 10
    .line 11
    iget-object v1, p0, Lorg/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 12
    .line 13
    iget v2, p0, Lorg/jsoup/parser/a;->e:I

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v1, v2, v0}, Lorg/jsoup/parser/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    iget v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 20
    add-int/2addr v1, v0

    .line 21
    .line 22
    iput v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 23
    return-object p1

    .line 24
    .line 25
    :cond_0
    iget v0, p0, Lorg/jsoup/parser/a;->c:I

    .line 26
    .line 27
    iget v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 28
    sub-int/2addr v0, v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 32
    move-result v1

    .line 33
    .line 34
    if-ge v0, v1, :cond_1

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->q()Ljava/lang/String;

    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    .line 41
    :cond_1
    iget v0, p0, Lorg/jsoup/parser/a;->c:I

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 45
    move-result p1

    .line 46
    sub-int/2addr v0, p1

    .line 47
    .line 48
    add-int/lit8 v0, v0, 0x1

    .line 49
    .line 50
    iget-object p1, p0, Lorg/jsoup/parser/a;->a:[C

    .line 51
    .line 52
    iget-object v1, p0, Lorg/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 53
    .line 54
    iget v2, p0, Lorg/jsoup/parser/a;->e:I

    .line 55
    .line 56
    sub-int v3, v0, v2

    .line 57
    .line 58
    .line 59
    invoke-static {p1, v1, v2, v3}, Lorg/jsoup/parser/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    iput v0, p0, Lorg/jsoup/parser/a;->e:I

    .line 63
    return-object p1
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
.end method

.method public varargs o([C)Ljava/lang/String;
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->b()V

    .line 4
    .line 5
    iget v0, p0, Lorg/jsoup/parser/a;->e:I

    .line 6
    .line 7
    iget v1, p0, Lorg/jsoup/parser/a;->c:I

    .line 8
    .line 9
    iget-object v2, p0, Lorg/jsoup/parser/a;->a:[C

    .line 10
    array-length v3, p1

    .line 11
    move v4, v0

    .line 12
    .line 13
    :goto_0
    if-ge v4, v1, :cond_2

    .line 14
    const/4 v5, 0x0

    .line 15
    .line 16
    :goto_1
    if-ge v5, v3, :cond_1

    .line 17
    .line 18
    aget-char v6, v2, v4

    .line 19
    .line 20
    aget-char v7, p1, v5

    .line 21
    .line 22
    if-ne v6, v7, :cond_0

    .line 23
    goto :goto_2

    .line 24
    .line 25
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 26
    goto :goto_1

    .line 27
    .line 28
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 29
    goto :goto_0

    .line 30
    .line 31
    :cond_2
    :goto_2
    iput v4, p0, Lorg/jsoup/parser/a;->e:I

    .line 32
    .line 33
    if-le v4, v0, :cond_3

    .line 34
    .line 35
    iget-object p1, p0, Lorg/jsoup/parser/a;->a:[C

    .line 36
    .line 37
    iget-object v1, p0, Lorg/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 38
    sub-int/2addr v4, v0

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v1, v0, v4}, Lorg/jsoup/parser/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

    .line 42
    move-result-object p1

    .line 43
    return-object p1

    .line 44
    .line 45
    :cond_3
    const-string p1, ""

    .line 46
    return-object p1
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
.end method

.method public varargs p([C)Ljava/lang/String;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->b()V

    .line 4
    .line 5
    iget v0, p0, Lorg/jsoup/parser/a;->e:I

    .line 6
    .line 7
    iget v1, p0, Lorg/jsoup/parser/a;->c:I

    .line 8
    .line 9
    iget-object v2, p0, Lorg/jsoup/parser/a;->a:[C

    .line 10
    move v3, v0

    .line 11
    .line 12
    :goto_0
    if-ge v3, v1, :cond_1

    .line 13
    .line 14
    aget-char v4, v2, v3

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v4}, Ljava/util/Arrays;->binarySearch([CC)I

    .line 18
    move-result v4

    .line 19
    .line 20
    if-ltz v4, :cond_0

    .line 21
    goto :goto_1

    .line 22
    .line 23
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 24
    goto :goto_0

    .line 25
    .line 26
    :cond_1
    :goto_1
    iput v3, p0, Lorg/jsoup/parser/a;->e:I

    .line 27
    .line 28
    if-le v3, v0, :cond_2

    .line 29
    .line 30
    iget-object p1, p0, Lorg/jsoup/parser/a;->a:[C

    .line 31
    .line 32
    iget-object v1, p0, Lorg/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 33
    sub-int/2addr v3, v0

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v1, v0, v3}, Lorg/jsoup/parser/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    .line 40
    :cond_2
    const-string p1, ""

    .line 41
    return-object p1
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
.end method

.method public q()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->b()V

    .line 4
    .line 5
    iget-object v0, p0, Lorg/jsoup/parser/a;->a:[C

    .line 6
    .line 7
    iget-object v1, p0, Lorg/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 8
    .line 9
    iget v2, p0, Lorg/jsoup/parser/a;->e:I

    .line 10
    .line 11
    iget v3, p0, Lorg/jsoup/parser/a;->c:I

    .line 12
    sub-int/2addr v3, v2

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, v2, v3}, Lorg/jsoup/parser/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iget v1, p0, Lorg/jsoup/parser/a;->c:I

    .line 19
    .line 20
    iput v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 21
    return-object v0
.end method

.method public r(Ljava/lang/String;)Z
    .locals 2

    .line 1
    .line 2
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v1}, Lorg/jsoup/parser/a;->G(Ljava/lang/CharSequence;)I

    .line 14
    move-result v0

    .line 15
    const/4 v1, -0x1

    .line 16
    .line 17
    if-gt v0, v1, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lorg/jsoup/parser/a;->G(Ljava/lang/CharSequence;)I

    .line 21
    move-result p1

    .line 22
    .line 23
    if-le p1, v1, :cond_0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    return p1

    .line 27
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 28
    return p1
    .line 29
    .line 30
.end method

.method public s()C
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->u()Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    const v0, 0xffff

    .line 13
    return v0

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lorg/jsoup/parser/a;->a:[C

    .line 16
    .line 17
    iget v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 18
    .line 19
    aget-char v0, v0, v1

    .line 20
    return v0
    .line 21
.end method

.method public t()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->b()V

    .line 4
    .line 5
    iget v0, p0, Lorg/jsoup/parser/a;->e:I

    .line 6
    .line 7
    iget v1, p0, Lorg/jsoup/parser/a;->c:I

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    const/4 v0, 0x1

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lorg/jsoup/parser/a;->c:I

    .line 3
    .line 4
    iget v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 5
    .line 6
    sub-int v2, v0, v1

    .line 7
    .line 8
    if-gez v2, :cond_0

    .line 9
    .line 10
    const-string v0, ""

    .line 11
    return-object v0

    .line 12
    .line 13
    :cond_0
    new-instance v2, Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p0, Lorg/jsoup/parser/a;->a:[C

    .line 16
    sub-int/2addr v0, v1

    .line 17
    .line 18
    .line 19
    invoke-direct {v2, v3, v1, v0}, Ljava/lang/String;-><init>([CII)V

    .line 20
    return-object v2
    .line 21
.end method

.method public final u()Z
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lorg/jsoup/parser/a;->e:I

    .line 3
    .line 4
    iget v1, p0, Lorg/jsoup/parser/a;->c:I

    .line 5
    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
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
.end method

.method public v()V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lorg/jsoup/parser/a;->c:I

    .line 3
    .line 4
    iget v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 5
    sub-int/2addr v0, v1

    .line 6
    .line 7
    const/16 v1, 0x400

    .line 8
    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    iput v0, p0, Lorg/jsoup/parser/a;->d:I

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->b()V

    .line 16
    .line 17
    iget v0, p0, Lorg/jsoup/parser/a;->e:I

    .line 18
    .line 19
    iput v0, p0, Lorg/jsoup/parser/a;->g:I

    .line 20
    return-void
    .line 21
.end method

.method public w(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lorg/jsoup/parser/a;->z(Ljava/lang/String;)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget v0, p0, Lorg/jsoup/parser/a;->e:I

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 15
    move-result p1

    .line 16
    add-int/2addr v0, p1

    .line 17
    .line 18
    iput v0, p0, Lorg/jsoup/parser/a;->e:I

    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    return p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public x(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/jsoup/parser/a;->D(Ljava/lang/String;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget v0, p0, Lorg/jsoup/parser/a;->e:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 12
    move-result p1

    .line 13
    add-int/2addr v0, p1

    .line 14
    .line 15
    iput v0, p0, Lorg/jsoup/parser/a;->e:I

    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1
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
.end method

.method public y(C)Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->t()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lorg/jsoup/parser/a;->a:[C

    .line 9
    .line 10
    iget v1, p0, Lorg/jsoup/parser/a;->e:I

    .line 11
    .line 12
    aget-char v0, v0, v1

    .line 13
    .line 14
    if-ne v0, p1, :cond_0

    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
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
.end method

.method public z(Ljava/lang/String;)Z
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/parser/a;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 7
    move-result v0

    .line 8
    .line 9
    iget v1, p0, Lorg/jsoup/parser/a;->c:I

    .line 10
    .line 11
    iget v2, p0, Lorg/jsoup/parser/a;->e:I

    .line 12
    sub-int/2addr v1, v2

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    if-le v0, v1, :cond_0

    .line 16
    return v2

    .line 17
    :cond_0
    move v1, v2

    .line 18
    .line 19
    :goto_0
    if-ge v1, v0, :cond_2

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 23
    move-result v3

    .line 24
    .line 25
    iget-object v4, p0, Lorg/jsoup/parser/a;->a:[C

    .line 26
    .line 27
    iget v5, p0, Lorg/jsoup/parser/a;->e:I

    .line 28
    add-int/2addr v5, v1

    .line 29
    .line 30
    aget-char v4, v4, v5

    .line 31
    .line 32
    if-eq v3, v4, :cond_1

    .line 33
    return v2

    .line 34
    .line 35
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    const/4 p1, 0x1

    .line 38
    return p1
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
.end method
