.class public Lcf0/f;
.super Ljava/lang/Object;
.source "MarkwonBuilderImpl.java"

# interfaces
.implements Lcf0/e$a;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcf0/i;",
            ">;"
        }
    .end annotation
.end field

.field public c:Landroid/widget/TextView$BufferType;

.field public d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    const/4 v1, 0x3

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    iput-object v0, p0, Lcf0/f;->b:Ljava/util/List;

    .line 12
    .line 13
    sget-object v0, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    .line 14
    .line 15
    iput-object v0, p0, Lcf0/f;->c:Landroid/widget/TextView$BufferType;

    .line 16
    const/4 v0, 0x1

    .line 17
    .line 18
    iput-boolean v0, p0, Lcf0/f;->d:Z

    .line 19
    .line 20
    iput-object p1, p0, Lcf0/f;->a:Landroid/content/Context;

    .line 21
    return-void
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

.method public static b(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .param p0    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcf0/i;",
            ">;)",
            "Ljava/util/List<",
            "Lcf0/i;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcf0/p;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcf0/p;-><init>(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcf0/p;->e()Ljava/util/List;

    .line 9
    move-result-object p0

    .line 10
    return-object p0
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


# virtual methods
.method public a(Lcf0/i;)Lcf0/e$a;
    .locals 1
    .param p1    # Lcf0/i;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcf0/f;->b:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    return-object p0
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

.method public build()Lcf0/e;
    .locals 14
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcf0/f;->b:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lcf0/f;->b:Ljava/util/List;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcf0/f;->b(Ljava/util/List;)Ljava/util/List;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    new-instance v1, Ljh0/d$b;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1}, Ljh0/d$b;-><init>()V

    .line 20
    .line 21
    iget-object v2, p0, Lcf0/f;->a:Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    invoke-static {v2}, Ldf0/a;->i(Landroid/content/Context;)Ldf0/a$a;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    new-instance v3, Lcf0/g$b;

    .line 28
    .line 29
    .line 30
    invoke-direct {v3}, Lcf0/g$b;-><init>()V

    .line 31
    .line 32
    new-instance v4, Lcf0/n$a;

    .line 33
    .line 34
    .line 35
    invoke-direct {v4}, Lcf0/n$a;-><init>()V

    .line 36
    .line 37
    new-instance v5, Lcf0/k$a;

    .line 38
    .line 39
    .line 40
    invoke-direct {v5}, Lcf0/k$a;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 44
    move-result-object v6

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    move-result v7

    .line 49
    .line 50
    if-eqz v7, :cond_0

    .line 51
    .line 52
    .line 53
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    move-result-object v7

    .line 55
    .line 56
    check-cast v7, Lcf0/i;

    .line 57
    .line 58
    .line 59
    invoke-interface {v7, v1}, Lcf0/i;->configureParser(Ljh0/d$b;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v7, v2}, Lcf0/i;->configureTheme(Ldf0/a$a;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v7, v3}, Lcf0/i;->configureConfiguration(Lcf0/g$b;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v7, v4}, Lcf0/i;->configureVisitor(Lcf0/l$b;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v7, v5}, Lcf0/i;->configureSpansFactory(Lcf0/j$a;)V

    .line 72
    goto :goto_0

    .line 73
    .line 74
    .line 75
    :cond_0
    invoke-virtual {v2}, Ldf0/a$a;->z()Ldf0/a;

    .line 76
    move-result-object v2

    .line 77
    .line 78
    .line 79
    invoke-interface {v5}, Lcf0/j$a;->build()Lcf0/j;

    .line 80
    move-result-object v5

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3, v2, v5}, Lcf0/g$b;->h(Ldf0/a;Lcf0/j;)Lcf0/g;

    .line 84
    move-result-object v11

    .line 85
    .line 86
    .line 87
    invoke-static {v4, v11}, Lcf0/m;->b(Lcf0/l$b;Lcf0/g;)Lcf0/m;

    .line 88
    move-result-object v10

    .line 89
    .line 90
    new-instance v6, Lcf0/h;

    .line 91
    .line 92
    iget-object v7, p0, Lcf0/f;->c:Landroid/widget/TextView$BufferType;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljh0/d$b;->f()Ljh0/d;

    .line 96
    move-result-object v9

    .line 97
    .line 98
    .line 99
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 100
    move-result-object v12

    .line 101
    .line 102
    iget-boolean v13, p0, Lcf0/f;->d:Z

    .line 103
    const/4 v8, 0x0

    .line 104
    .line 105
    .line 106
    invoke-direct/range {v6 .. v13}, Lcf0/h;-><init>(Landroid/widget/TextView$BufferType;Lcf0/e$b;Ljh0/d;Lcf0/m;Lcf0/g;Ljava/util/List;Z)V

    .line 107
    return-object v6

    .line 108
    .line 109
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 110
    .line 111
    const-string v1, "No plugins were added to this builder. Use #usePlugin method to add them"

    .line 112
    .line 113
    .line 114
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 115
    throw v0
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
