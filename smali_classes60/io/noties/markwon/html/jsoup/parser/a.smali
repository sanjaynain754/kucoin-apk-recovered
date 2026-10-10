.class public final Lio/noties/markwon/html/jsoup/parser/a;
.super Ljava/lang/Object;
.source "CharacterReader.java"


# instance fields
.field public final a:[C

.field public final b:Ljava/io/Reader;

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public final h:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/io/Reader;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p2, 0x80

    .line 2
    new-array p2, p2, [Ljava/lang/String;

    iput-object p2, p0, Lio/noties/markwon/html/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 3
    invoke-static {p1}, Lhf0/b;->f(Ljava/lang/Object;)V

    .line 4
    invoke-virtual {p1}, Ljava/io/Reader;->markSupported()Z

    move-result p2

    invoke-static {p2}, Lhf0/b;->d(Z)V

    .line 5
    iput-object p1, p0, Lio/noties/markwon/html/jsoup/parser/a;->b:Ljava/io/Reader;

    const/16 p1, 0x1000

    .line 6
    new-array p1, p1, [C

    iput-object p1, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 7
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->b()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 8
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-direct {p0, v0, p1}, Lio/noties/markwon/html/jsoup/parser/a;-><init>(Ljava/io/Reader;I)V

    return-void
.end method

.method public static G([CIILjava/lang/String;)Z
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
.end method

.method public static c([C[Ljava/lang/String;II)Ljava/lang/String;
    .locals 5

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
    :cond_1
    const/4 v1, 0x0

    .line 18
    move v3, p2

    .line 19
    move v2, v1

    .line 20
    .line 21
    :goto_0
    if-ge v1, p3, :cond_2

    .line 22
    .line 23
    mul-int/lit8 v2, v2, 0x1f

    .line 24
    .line 25
    add-int/lit8 v4, v3, 0x1

    .line 26
    .line 27
    aget-char v3, p0, v3

    .line 28
    add-int/2addr v2, v3

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    move v3, v4

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    array-length v1, p1

    .line 34
    sub-int/2addr v1, v0

    .line 35
    .line 36
    and-int v0, v2, v1

    .line 37
    .line 38
    aget-object v1, p1, v0

    .line 39
    .line 40
    if-nez v1, :cond_3

    .line 41
    .line 42
    new-instance v1, Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    invoke-direct {v1, p0, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 46
    .line 47
    aput-object v1, p1, v0

    .line 48
    return-object v1

    .line 49
    .line 50
    .line 51
    :cond_3
    invoke-static {p0, p2, p3, v1}, Lio/noties/markwon/html/jsoup/parser/a;->G([CIILjava/lang/String;)Z

    .line 52
    move-result v2

    .line 53
    .line 54
    if-eqz v2, :cond_4

    .line 55
    return-object v1

    .line 56
    .line 57
    :cond_4
    new-instance v1, Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    invoke-direct {v1, p0, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 61
    .line 62
    aput-object v1, p1, v0

    .line 63
    return-object v1
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
.method public A()Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->r()Z

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
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 11
    .line 12
    iget v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

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
.end method

.method public B(Ljava/lang/String;)Z
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 7
    move-result v0

    .line 8
    .line 9
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->c:I

    .line 10
    .line 11
    iget v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

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
    iget-object v4, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 30
    .line 31
    iget v5, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

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

.method public C()Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->r()Z

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
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 11
    .line 12
    iget v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

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
.end method

.method public D(C)I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->b()V

    .line 4
    .line 5
    iget v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 6
    .line 7
    :goto_0
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->c:I

    .line 8
    .line 9
    if-ge v0, v1, :cond_1

    .line 10
    .line 11
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 12
    .line 13
    aget-char v1, v1, v0

    .line 14
    .line 15
    if-ne p1, v1, :cond_0

    .line 16
    .line 17
    iget p1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

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

.method public E(Ljava/lang/CharSequence;)I
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->b()V

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
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 11
    .line 12
    :goto_0
    iget v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->c:I

    .line 13
    .line 14
    if-ge v1, v2, :cond_3

    .line 15
    .line 16
    iget-object v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

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
    iget v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->c:I

    .line 25
    .line 26
    if-ge v1, v2, :cond_0

    .line 27
    .line 28
    iget-object v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

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
    iget v5, p0, Lio/noties/markwon/html/jsoup/parser/a;->c:I

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
    iget-object v7, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

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
    iget p1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

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

.method public F()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->f:I

    .line 3
    .line 4
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

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

.method public H()V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->g:I

    .line 3
    .line 4
    iput v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

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
.end method

.method public I()V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    .line 6
    iput v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

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

.method public a()V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    iput v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

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

.method public final b()V
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 3
    .line 4
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->d:I

    .line 5
    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    :try_start_0
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->b:Ljava/io/Reader;

    .line 10
    int-to-long v2, v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v2, v3}, Ljava/io/Reader;->skip(J)J

    .line 14
    .line 15
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->b:Ljava/io/Reader;

    .line 16
    .line 17
    const/16 v1, 0x1000

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/io/Reader;->mark(I)V

    .line 21
    .line 22
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->b:Ljava/io/Reader;

    .line 23
    .line 24
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/io/Reader;->read([C)I

    .line 28
    move-result v0

    .line 29
    .line 30
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->b:Ljava/io/Reader;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/io/Reader;->reset()V

    .line 34
    const/4 v1, -0x1

    .line 35
    .line 36
    if-eq v0, v1, :cond_2

    .line 37
    .line 38
    iput v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->c:I

    .line 39
    .line 40
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->f:I

    .line 41
    .line 42
    iget v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 43
    add-int/2addr v1, v2

    .line 44
    .line 45
    iput v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->f:I

    .line 46
    const/4 v1, 0x0

    .line 47
    .line 48
    iput v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 49
    .line 50
    iput v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->g:I

    .line 51
    .line 52
    const/16 v1, 0xc00

    .line 53
    .line 54
    if-le v0, v1, :cond_1

    .line 55
    move v0, v1

    .line 56
    .line 57
    :cond_1
    iput v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->d:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    return-void

    .line 59
    :catch_0
    move-exception v0

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    :goto_0
    return-void

    .line 62
    .line 63
    :goto_1
    new-instance v1, Lio/noties/markwon/html/jsoup/UncheckedIOException;

    .line 64
    .line 65
    .line 66
    invoke-direct {v1, v0}, Lio/noties/markwon/html/jsoup/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    .line 67
    throw v1
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

.method public d()C
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->s()Z

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
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 16
    .line 17
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 18
    .line 19
    aget-char v0, v0, v1

    .line 20
    .line 21
    :goto_0
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    iput v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

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
.end method

.method public e()Ljava/lang/String;
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->b()V

    .line 4
    .line 5
    iget v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 6
    .line 7
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->c:I

    .line 8
    .line 9
    iget-object v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 10
    .line 11
    :goto_0
    iget v3, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 12
    .line 13
    if-ge v3, v1, :cond_1

    .line 14
    .line 15
    aget-char v4, v2, v3

    .line 16
    .line 17
    const/16 v5, 0x26

    .line 18
    .line 19
    if-eq v4, v5, :cond_1

    .line 20
    .line 21
    const/16 v5, 0x3c

    .line 22
    .line 23
    if-eq v4, v5, :cond_1

    .line 24
    .line 25
    if-nez v4, :cond_0

    .line 26
    goto :goto_1

    .line 27
    .line 28
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    iput v3, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_1
    :goto_1
    if-le v3, v0, :cond_2

    .line 34
    .line 35
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 36
    .line 37
    iget-object v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 38
    sub-int/2addr v3, v0

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v2, v0, v3}, Lio/noties/markwon/html/jsoup/parser/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

    .line 42
    move-result-object v0

    .line 43
    return-object v0

    .line 44
    .line 45
    :cond_2
    const-string v0, ""

    .line 46
    return-object v0
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
.end method

.method public f()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->b()V

    .line 4
    .line 5
    iget v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 6
    .line 7
    :goto_0
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 8
    .line 9
    iget v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->c:I

    .line 10
    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

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
    iput v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_0
    iget-object v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 31
    .line 32
    iget-object v3, p0, Lio/noties/markwon/html/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 33
    sub-int/2addr v1, v0

    .line 34
    .line 35
    .line 36
    invoke-static {v2, v3, v0, v1}, Lio/noties/markwon/html/jsoup/parser/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

    .line 37
    move-result-object v0

    .line 38
    return-object v0
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public g()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->b()V

    .line 4
    .line 5
    iget v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 6
    .line 7
    :goto_0
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 8
    .line 9
    iget v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->c:I

    .line 10
    .line 11
    if-ge v1, v2, :cond_3

    .line 12
    .line 13
    iget-object v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

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
    iput v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :cond_3
    iget-object v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 47
    .line 48
    iget-object v3, p0, Lio/noties/markwon/html/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 49
    sub-int/2addr v1, v0

    .line 50
    .line 51
    .line 52
    invoke-static {v2, v3, v0, v1}, Lio/noties/markwon/html/jsoup/parser/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

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

.method public h()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->b()V

    .line 4
    .line 5
    iget v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 6
    .line 7
    :goto_0
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 8
    .line 9
    iget v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->c:I

    .line 10
    .line 11
    if-ge v1, v2, :cond_3

    .line 12
    .line 13
    iget-object v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

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
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    iput v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :cond_3
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 47
    .line 48
    iget-object v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 49
    .line 50
    iget v3, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 51
    sub-int/2addr v3, v0

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v2, v0, v3}, Lio/noties/markwon/html/jsoup/parser/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

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

.method public i()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->b()V

    .line 4
    .line 5
    iget v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 6
    .line 7
    :goto_0
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 8
    .line 9
    iget v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->c:I

    .line 10
    .line 11
    if-ge v1, v2, :cond_3

    .line 12
    .line 13
    iget-object v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

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
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    iput v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 44
    goto :goto_0

    .line 45
    .line 46
    .line 47
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->s()Z

    .line 48
    move-result v1

    .line 49
    .line 50
    if-nez v1, :cond_4

    .line 51
    .line 52
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 53
    .line 54
    iget v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

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
    iput v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 69
    goto :goto_1

    .line 70
    .line 71
    :cond_4
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 72
    .line 73
    iget-object v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 74
    .line 75
    iget v3, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 76
    sub-int/2addr v3, v0

    .line 77
    .line 78
    .line 79
    invoke-static {v1, v2, v0, v3}, Lio/noties/markwon/html/jsoup/parser/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

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

.method public j()Ljava/lang/String;
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->b()V

    .line 4
    .line 5
    iget v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 6
    .line 7
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->c:I

    .line 8
    .line 9
    iget-object v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 10
    .line 11
    :goto_0
    iget v3, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 12
    .line 13
    if-ge v3, v1, :cond_1

    .line 14
    .line 15
    aget-char v4, v2, v3

    .line 16
    .line 17
    const/16 v5, 0x9

    .line 18
    .line 19
    if-eq v4, v5, :cond_1

    .line 20
    .line 21
    const/16 v5, 0xa

    .line 22
    .line 23
    if-eq v4, v5, :cond_1

    .line 24
    .line 25
    const/16 v5, 0xd

    .line 26
    .line 27
    if-eq v4, v5, :cond_1

    .line 28
    .line 29
    const/16 v5, 0xc

    .line 30
    .line 31
    if-eq v4, v5, :cond_1

    .line 32
    .line 33
    const/16 v5, 0x20

    .line 34
    .line 35
    if-eq v4, v5, :cond_1

    .line 36
    .line 37
    const/16 v5, 0x2f

    .line 38
    .line 39
    if-eq v4, v5, :cond_1

    .line 40
    .line 41
    const/16 v5, 0x3e

    .line 42
    .line 43
    if-eq v4, v5, :cond_1

    .line 44
    .line 45
    if-nez v4, :cond_0

    .line 46
    goto :goto_1

    .line 47
    .line 48
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    iput v3, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 51
    goto :goto_0

    .line 52
    .line 53
    :cond_1
    :goto_1
    if-le v3, v0, :cond_2

    .line 54
    .line 55
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 56
    .line 57
    iget-object v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 58
    sub-int/2addr v3, v0

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v2, v0, v3}, Lio/noties/markwon/html/jsoup/parser/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

    .line 62
    move-result-object v0

    .line 63
    return-object v0

    .line 64
    .line 65
    :cond_2
    const-string v0, ""

    .line 66
    return-object v0
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

.method public k(C)Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lio/noties/markwon/html/jsoup/parser/a;->D(C)I

    .line 4
    move-result p1

    .line 5
    const/4 v0, -0x1

    .line 6
    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 10
    .line 11
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 12
    .line 13
    iget v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1, v2, p1}, Lio/noties/markwon/html/jsoup/parser/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 20
    add-int/2addr v1, p1

    .line 21
    .line 22
    iput v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 23
    return-object v0

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->o()Ljava/lang/String;

    .line 27
    move-result-object p1

    .line 28
    return-object p1
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

.method public l(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lio/noties/markwon/html/jsoup/parser/a;->E(Ljava/lang/CharSequence;)I

    .line 4
    move-result p1

    .line 5
    const/4 v0, -0x1

    .line 6
    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 10
    .line 11
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 12
    .line 13
    iget v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1, v2, p1}, Lio/noties/markwon/html/jsoup/parser/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 20
    add-int/2addr v1, p1

    .line 21
    .line 22
    iput v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 23
    return-object v0

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->o()Ljava/lang/String;

    .line 27
    move-result-object p1

    .line 28
    return-object p1
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

.method public varargs m([C)Ljava/lang/String;
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->b()V

    .line 4
    .line 5
    iget v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 6
    .line 7
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->c:I

    .line 8
    .line 9
    iget-object v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 10
    .line 11
    :goto_0
    iget v3, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 12
    .line 13
    if-ge v3, v1, :cond_2

    .line 14
    array-length v3, p1

    .line 15
    const/4 v4, 0x0

    .line 16
    .line 17
    :goto_1
    if-ge v4, v3, :cond_1

    .line 18
    .line 19
    aget-char v5, p1, v4

    .line 20
    .line 21
    iget v6, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 22
    .line 23
    aget-char v6, v2, v6

    .line 24
    .line 25
    if-ne v6, v5, :cond_0

    .line 26
    goto :goto_2

    .line 27
    .line 28
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 29
    goto :goto_1

    .line 30
    .line 31
    :cond_1
    iget v3, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 32
    .line 33
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    iput v3, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :cond_2
    :goto_2
    iget p1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 39
    .line 40
    if-le p1, v0, :cond_3

    .line 41
    .line 42
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 43
    .line 44
    iget-object v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 45
    sub-int/2addr p1, v0

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v2, v0, p1}, Lio/noties/markwon/html/jsoup/parser/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    .line 52
    :cond_3
    const-string p1, ""

    .line 53
    return-object p1
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

.method public varargs n([C)Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->b()V

    .line 4
    .line 5
    iget v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 6
    .line 7
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->c:I

    .line 8
    .line 9
    iget-object v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 10
    .line 11
    :goto_0
    iget v3, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 12
    .line 13
    if-ge v3, v1, :cond_1

    .line 14
    .line 15
    aget-char v3, v2, v3

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v3}, Ljava/util/Arrays;->binarySearch([CC)I

    .line 19
    move-result v3

    .line 20
    .line 21
    if-ltz v3, :cond_0

    .line 22
    goto :goto_1

    .line 23
    .line 24
    :cond_0
    iget v3, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 25
    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    iput v3, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 29
    goto :goto_0

    .line 30
    .line 31
    :cond_1
    :goto_1
    iget p1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 32
    .line 33
    if-le p1, v0, :cond_2

    .line 34
    .line 35
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 36
    .line 37
    iget-object v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 38
    sub-int/2addr p1, v0

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v2, v0, p1}, Lio/noties/markwon/html/jsoup/parser/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

    .line 42
    move-result-object p1

    .line 43
    return-object p1

    .line 44
    .line 45
    :cond_2
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

.method public o()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->b()V

    .line 4
    .line 5
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 6
    .line 7
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->h:[Ljava/lang/String;

    .line 8
    .line 9
    iget v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 10
    .line 11
    iget v3, p0, Lio/noties/markwon/html/jsoup/parser/a;->c:I

    .line 12
    sub-int/2addr v3, v2

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, v2, v3}, Lio/noties/markwon/html/jsoup/parser/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->c:I

    .line 19
    .line 20
    iput v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 21
    return-object v0
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

.method public p(Ljava/lang/String;)Z
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
    invoke-virtual {p0, v1}, Lio/noties/markwon/html/jsoup/parser/a;->E(Ljava/lang/CharSequence;)I

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
    invoke-virtual {p0, p1}, Lio/noties/markwon/html/jsoup/parser/a;->E(Ljava/lang/CharSequence;)I

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

.method public q()C
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->s()Z

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
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 16
    .line 17
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 18
    .line 19
    aget-char v0, v0, v1

    .line 20
    return v0
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

.method public r()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->b()V

    .line 4
    .line 5
    iget v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 6
    .line 7
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->c:I

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

.method public final s()Z
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 3
    .line 4
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->c:I

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

.method public t()V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 3
    .line 4
    iput v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->g:I

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
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Ljava/lang/String;

    .line 3
    .line 4
    iget-object v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 5
    .line 6
    iget v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

    .line 7
    .line 8
    iget v3, p0, Lio/noties/markwon/html/jsoup/parser/a;->c:I

    .line 9
    sub-int/2addr v3, v2

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    .line 13
    return-object v0
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

.method public u(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lio/noties/markwon/html/jsoup/parser/a;->x(Ljava/lang/String;)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

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
    iput v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

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

.method public v(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lio/noties/markwon/html/jsoup/parser/a;->B(Ljava/lang/String;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

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
    iput v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

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

.method public w(C)Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->r()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 9
    .line 10
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

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

.method public x(Ljava/lang/String;)Z
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 7
    move-result v0

    .line 8
    .line 9
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->c:I

    .line 10
    .line 11
    iget v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

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
    iget-object v4, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 26
    .line 27
    iget v5, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

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
.end method

.method public varargs y([C)Z
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->r()Z

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
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->b()V

    .line 12
    .line 13
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 14
    .line 15
    iget v2, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

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
.end method

.method public z([C)Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lio/noties/markwon/html/jsoup/parser/a;->r()Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/a;->a:[C

    .line 12
    .line 13
    iget v1, p0, Lio/noties/markwon/html/jsoup/parser/a;->e:I

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
