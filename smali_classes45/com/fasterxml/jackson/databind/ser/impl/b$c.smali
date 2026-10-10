.class public final Lcom/fasterxml/jackson/databind/ser/impl/b$c;
.super Lcom/fasterxml/jackson/databind/ser/impl/b;
.source "PropertySerializerMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/ser/impl/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final b:[Lcom/fasterxml/jackson/databind/ser/impl/b$f;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/ser/impl/b;[Lcom/fasterxml/jackson/databind/ser/impl/b$f;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/ser/impl/b;-><init>(Lcom/fasterxml/jackson/databind/ser/impl/b;)V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/ser/impl/b$c;->b:[Lcom/fasterxml/jackson/databind/ser/impl/b$f;

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
.end method


# virtual methods
.method public j(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/h;)Lcom/fasterxml/jackson/databind/ser/impl/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/h<",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/fasterxml/jackson/databind/ser/impl/b;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/impl/b$c;->b:[Lcom/fasterxml/jackson/databind/ser/impl/b$f;

    .line 3
    array-length v1, v0

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    if-ne v1, v2, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, Lcom/fasterxml/jackson/databind/ser/impl/b;->a:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lcom/fasterxml/jackson/databind/ser/impl/b$e;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p0, p1, p2}, Lcom/fasterxml/jackson/databind/ser/impl/b$e;-><init>(Lcom/fasterxml/jackson/databind/ser/impl/b;Ljava/lang/Class;Lcom/fasterxml/jackson/databind/h;)V

    .line 17
    return-object v0

    .line 18
    :cond_0
    return-object p0

    .line 19
    .line 20
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    check-cast v0, [Lcom/fasterxml/jackson/databind/ser/impl/b$f;

    .line 27
    .line 28
    new-instance v2, Lcom/fasterxml/jackson/databind/ser/impl/b$f;

    .line 29
    .line 30
    .line 31
    invoke-direct {v2, p1, p2}, Lcom/fasterxml/jackson/databind/ser/impl/b$f;-><init>(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/h;)V

    .line 32
    .line 33
    aput-object v2, v0, v1

    .line 34
    .line 35
    new-instance p1, Lcom/fasterxml/jackson/databind/ser/impl/b$c;

    .line 36
    .line 37
    .line 38
    invoke-direct {p1, p0, v0}, Lcom/fasterxml/jackson/databind/ser/impl/b$c;-><init>(Lcom/fasterxml/jackson/databind/ser/impl/b;[Lcom/fasterxml/jackson/databind/ser/impl/b$f;)V

    .line 39
    return-object p1
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public k(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/h<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/impl/b$c;->b:[Lcom/fasterxml/jackson/databind/ser/impl/b$f;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    aget-object v1, v0, v1

    .line 6
    .line 7
    iget-object v2, v1, Lcom/fasterxml/jackson/databind/ser/impl/b$f;->a:Ljava/lang/Class;

    .line 8
    .line 9
    if-ne v2, p1, :cond_0

    .line 10
    .line 11
    iget-object p1, v1, Lcom/fasterxml/jackson/databind/ser/impl/b$f;->b:Lcom/fasterxml/jackson/databind/h;

    .line 12
    return-object p1

    .line 13
    :cond_0
    const/4 v1, 0x1

    .line 14
    .line 15
    aget-object v1, v0, v1

    .line 16
    .line 17
    iget-object v2, v1, Lcom/fasterxml/jackson/databind/ser/impl/b$f;->a:Ljava/lang/Class;

    .line 18
    .line 19
    if-ne v2, p1, :cond_1

    .line 20
    .line 21
    iget-object p1, v1, Lcom/fasterxml/jackson/databind/ser/impl/b$f;->b:Lcom/fasterxml/jackson/databind/h;

    .line 22
    return-object p1

    .line 23
    :cond_1
    const/4 v1, 0x2

    .line 24
    .line 25
    aget-object v1, v0, v1

    .line 26
    .line 27
    iget-object v2, v1, Lcom/fasterxml/jackson/databind/ser/impl/b$f;->a:Ljava/lang/Class;

    .line 28
    .line 29
    if-ne v2, p1, :cond_2

    .line 30
    .line 31
    iget-object p1, v1, Lcom/fasterxml/jackson/databind/ser/impl/b$f;->b:Lcom/fasterxml/jackson/databind/h;

    .line 32
    return-object p1

    .line 33
    :cond_2
    array-length v1, v0

    .line 34
    .line 35
    .line 36
    packed-switch v1, :pswitch_data_0

    .line 37
    goto :goto_0

    .line 38
    :pswitch_0
    const/4 v1, 0x7

    .line 39
    .line 40
    aget-object v1, v0, v1

    .line 41
    .line 42
    iget-object v2, v1, Lcom/fasterxml/jackson/databind/ser/impl/b$f;->a:Ljava/lang/Class;

    .line 43
    .line 44
    if-ne v2, p1, :cond_3

    .line 45
    .line 46
    iget-object p1, v1, Lcom/fasterxml/jackson/databind/ser/impl/b$f;->b:Lcom/fasterxml/jackson/databind/h;

    .line 47
    return-object p1

    .line 48
    :cond_3
    :pswitch_1
    const/4 v1, 0x6

    .line 49
    .line 50
    aget-object v1, v0, v1

    .line 51
    .line 52
    iget-object v2, v1, Lcom/fasterxml/jackson/databind/ser/impl/b$f;->a:Ljava/lang/Class;

    .line 53
    .line 54
    if-ne v2, p1, :cond_4

    .line 55
    .line 56
    iget-object p1, v1, Lcom/fasterxml/jackson/databind/ser/impl/b$f;->b:Lcom/fasterxml/jackson/databind/h;

    .line 57
    return-object p1

    .line 58
    :cond_4
    :pswitch_2
    const/4 v1, 0x5

    .line 59
    .line 60
    aget-object v1, v0, v1

    .line 61
    .line 62
    iget-object v2, v1, Lcom/fasterxml/jackson/databind/ser/impl/b$f;->a:Ljava/lang/Class;

    .line 63
    .line 64
    if-ne v2, p1, :cond_5

    .line 65
    .line 66
    iget-object p1, v1, Lcom/fasterxml/jackson/databind/ser/impl/b$f;->b:Lcom/fasterxml/jackson/databind/h;

    .line 67
    return-object p1

    .line 68
    :cond_5
    :pswitch_3
    const/4 v1, 0x4

    .line 69
    .line 70
    aget-object v1, v0, v1

    .line 71
    .line 72
    iget-object v2, v1, Lcom/fasterxml/jackson/databind/ser/impl/b$f;->a:Ljava/lang/Class;

    .line 73
    .line 74
    if-ne v2, p1, :cond_6

    .line 75
    .line 76
    iget-object p1, v1, Lcom/fasterxml/jackson/databind/ser/impl/b$f;->b:Lcom/fasterxml/jackson/databind/h;

    .line 77
    return-object p1

    .line 78
    :cond_6
    :pswitch_4
    const/4 v1, 0x3

    .line 79
    .line 80
    aget-object v0, v0, v1

    .line 81
    .line 82
    iget-object v1, v0, Lcom/fasterxml/jackson/databind/ser/impl/b$f;->a:Ljava/lang/Class;

    .line 83
    .line 84
    if-ne v1, p1, :cond_7

    .line 85
    .line 86
    iget-object p1, v0, Lcom/fasterxml/jackson/databind/ser/impl/b$f;->b:Lcom/fasterxml/jackson/databind/h;

    .line 87
    return-object p1

    .line 88
    :cond_7
    :goto_0
    const/4 p1, 0x0

    .line 89
    return-object p1

    .line 90
    nop

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
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
