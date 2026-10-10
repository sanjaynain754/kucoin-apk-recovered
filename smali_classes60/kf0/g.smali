.class public Lkf0/g;
.super Lgf0/m;
.source "ListHandler.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lgf0/m;-><init>()V

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

.method public static d(Lgf0/f$a;)I
    .locals 3
    .param p0    # Lgf0/f$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    :cond_0
    :goto_0
    invoke-interface {p0}, Lgf0/f$a;->d()Lgf0/f$a;

    .line 5
    move-result-object p0

    .line 6
    .line 7
    if-eqz p0, :cond_2

    .line 8
    .line 9
    const-string v1, "ul"

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, Lgf0/f;->name()Ljava/lang/String;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    const-string v1, "ol"

    .line 22
    .line 23
    .line 24
    invoke-interface {p0}, Lgf0/f;->name()Ljava/lang/String;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    move-result v1

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    return v0
    .line 36
    .line 37
    .line 38
    .line 39
.end method


# virtual methods
.method public a(Lcf0/l;Lgf0/j;Lgf0/f;)V
    .locals 10
    .param p1    # Lcf0/l;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lgf0/j;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lgf0/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-interface {p3}, Lgf0/f;->e()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_2

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-interface {p3}, Lgf0/f;->a()Lgf0/f$a;

    .line 12
    move-result-object p3

    .line 13
    .line 14
    .line 15
    invoke-interface {p3}, Lgf0/f;->name()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    const-string v1, "ol"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    move-result v0

    .line 23
    .line 24
    const-string v1, "ul"

    .line 25
    .line 26
    .line 27
    invoke-interface {p3}, Lgf0/f;->name()Ljava/lang/String;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    move-result v1

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    goto/16 :goto_2

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-interface {p1}, Lcf0/l;->o()Lcf0/g;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Lcf0/l;->h()Lcf0/q;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Lcf0/g;->c()Lcf0/j;

    .line 50
    move-result-object v3

    .line 51
    .line 52
    const-class v4, Lih0/r;

    .line 53
    .line 54
    .line 55
    invoke-interface {v3, v4}, Lcf0/j;->get(Ljava/lang/Class;)Lcf0/s;

    .line 56
    move-result-object v3

    .line 57
    .line 58
    .line 59
    invoke-static {p3}, Lkf0/g;->d(Lgf0/f$a;)I

    .line 60
    move-result v4

    .line 61
    .line 62
    .line 63
    invoke-interface {p3}, Lgf0/f$a;->f()Ljava/util/List;

    .line 64
    move-result-object p3

    .line 65
    .line 66
    .line 67
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 68
    move-result-object p3

    .line 69
    const/4 v5, 0x1

    .line 70
    .line 71
    .line 72
    :cond_2
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    move-result v6

    .line 74
    .line 75
    if-eqz v6, :cond_4

    .line 76
    .line 77
    .line 78
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    move-result-object v6

    .line 80
    .line 81
    check-cast v6, Lgf0/f$a;

    .line 82
    .line 83
    .line 84
    invoke-static {p1, p2, v6}, Lgf0/m;->c(Lcf0/l;Lgf0/j;Lgf0/f$a;)V

    .line 85
    .line 86
    if-eqz v3, :cond_2

    .line 87
    .line 88
    .line 89
    invoke-interface {v6}, Lgf0/f;->name()Ljava/lang/String;

    .line 90
    move-result-object v7

    .line 91
    .line 92
    const-string v8, "li"

    .line 93
    .line 94
    .line 95
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    move-result v7

    .line 97
    .line 98
    if-eqz v7, :cond_2

    .line 99
    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    sget-object v7, Lio/noties/markwon/core/CoreProps;->a:Lcf0/o;

    .line 103
    .line 104
    sget-object v8, Lio/noties/markwon/core/CoreProps$ListItemType;->ORDERED:Lio/noties/markwon/core/CoreProps$ListItemType;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v7, v2, v8}, Lcf0/o;->d(Lcf0/q;Ljava/lang/Object;)V

    .line 108
    .line 109
    sget-object v7, Lio/noties/markwon/core/CoreProps;->c:Lcf0/o;

    .line 110
    .line 111
    add-int/lit8 v8, v5, 0x1

    .line 112
    .line 113
    .line 114
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    move-result-object v5

    .line 116
    .line 117
    .line 118
    invoke-virtual {v7, v2, v5}, Lcf0/o;->d(Lcf0/q;Ljava/lang/Object;)V

    .line 119
    move v5, v8

    .line 120
    goto :goto_1

    .line 121
    .line 122
    :cond_3
    sget-object v7, Lio/noties/markwon/core/CoreProps;->a:Lcf0/o;

    .line 123
    .line 124
    sget-object v8, Lio/noties/markwon/core/CoreProps$ListItemType;->BULLET:Lio/noties/markwon/core/CoreProps$ListItemType;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v7, v2, v8}, Lcf0/o;->d(Lcf0/q;Ljava/lang/Object;)V

    .line 128
    .line 129
    sget-object v7, Lio/noties/markwon/core/CoreProps;->b:Lcf0/o;

    .line 130
    .line 131
    .line 132
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    move-result-object v8

    .line 134
    .line 135
    .line 136
    invoke-virtual {v7, v2, v8}, Lcf0/o;->d(Lcf0/q;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :goto_1
    invoke-interface {p1}, Lcf0/l;->builder()Lcf0/t;

    .line 140
    move-result-object v7

    .line 141
    .line 142
    .line 143
    invoke-interface {v3, v1, v2}, Lcf0/s;->a(Lcf0/g;Lcf0/q;)Ljava/lang/Object;

    .line 144
    move-result-object v8

    .line 145
    .line 146
    .line 147
    invoke-interface {v6}, Lgf0/f;->start()I

    .line 148
    move-result v9

    .line 149
    .line 150
    .line 151
    invoke-interface {v6}, Lgf0/f;->c()I

    .line 152
    move-result v6

    .line 153
    .line 154
    .line 155
    invoke-static {v7, v8, v9, v6}, Lcf0/t;->j(Lcf0/t;Ljava/lang/Object;II)V

    .line 156
    goto :goto_0

    .line 157
    :cond_4
    :goto_2
    return-void
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
.end method

.method public b()Ljava/util/Collection;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "ol"

    .line 3
    .line 4
    const-string v1, "ul"

    .line 5
    .line 6
    .line 7
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    move-result-object v0

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
