.class public Lgf0/i;
.super Lgf0/h;
.source "MarkwonHtmlParserImpl.java"


# static fields
.field public static final g:Ljava/util/Set;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final i:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lgf0/d;

.field public final b:Lgf0/n;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgf0/g$b;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lgf0/g$a;

.field public e:Z

.field public f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 37

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashSet;

    .line 3
    .line 4
    const-string v31, "tt"

    .line 5
    .line 6
    const-string v32, "var"

    .line 7
    .line 8
    const-string v1, "a"

    .line 9
    .line 10
    const-string v2, "abbr"

    .line 11
    .line 12
    const-string v3, "acronym"

    .line 13
    .line 14
    const-string v4, "b"

    .line 15
    .line 16
    const-string v5, "bdo"

    .line 17
    .line 18
    const-string v6, "big"

    .line 19
    .line 20
    const-string v7, "br"

    .line 21
    .line 22
    const-string v8, "button"

    .line 23
    .line 24
    const-string v9, "cite"

    .line 25
    .line 26
    const-string v10, "code"

    .line 27
    .line 28
    const-string v11, "dfn"

    .line 29
    .line 30
    const-string v12, "em"

    .line 31
    .line 32
    const-string v13, "i"

    .line 33
    .line 34
    const-string v14, "img"

    .line 35
    .line 36
    const-string v15, "input"

    .line 37
    .line 38
    const-string v16, "kbd"

    .line 39
    .line 40
    const-string v17, "label"

    .line 41
    .line 42
    const-string v18, "map"

    .line 43
    .line 44
    const-string v19, "object"

    .line 45
    .line 46
    const-string v20, "q"

    .line 47
    .line 48
    const-string v21, "samp"

    .line 49
    .line 50
    const-string v22, "script"

    .line 51
    .line 52
    const-string v23, "select"

    .line 53
    .line 54
    const-string v24, "small"

    .line 55
    .line 56
    const-string v25, "span"

    .line 57
    .line 58
    const-string v26, "strong"

    .line 59
    .line 60
    const-string v27, "sub"

    .line 61
    .line 62
    const-string v28, "sup"

    .line 63
    .line 64
    const-string v29, "textarea"

    .line 65
    .line 66
    const-string v30, "time"

    .line 67
    .line 68
    .line 69
    filled-new-array/range {v1 .. v32}, [Ljava/lang/String;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    .line 73
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 74
    move-result-object v1

    .line 75
    .line 76
    .line 77
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    sput-object v0, Lgf0/i;->g:Ljava/util/Set;

    .line 84
    .line 85
    new-instance v0, Ljava/util/HashSet;

    .line 86
    .line 87
    const-string v14, "track"

    .line 88
    .line 89
    const-string v15, "wbr"

    .line 90
    .line 91
    const-string v1, "area"

    .line 92
    .line 93
    const-string v2, "base"

    .line 94
    .line 95
    const-string v3, "br"

    .line 96
    .line 97
    const-string v4, "col"

    .line 98
    .line 99
    const-string v5, "embed"

    .line 100
    .line 101
    const-string v6, "hr"

    .line 102
    .line 103
    const-string v7, "img"

    .line 104
    .line 105
    const-string v8, "input"

    .line 106
    .line 107
    const-string v9, "keygen"

    .line 108
    .line 109
    const-string v10, "link"

    .line 110
    .line 111
    const-string v11, "meta"

    .line 112
    .line 113
    const-string v12, "param"

    .line 114
    .line 115
    const-string v13, "source"

    .line 116
    .line 117
    .line 118
    filled-new-array/range {v1 .. v15}, [Ljava/lang/String;

    .line 119
    move-result-object v1

    .line 120
    .line 121
    .line 122
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 123
    move-result-object v1

    .line 124
    .line 125
    .line 126
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 130
    move-result-object v0

    .line 131
    .line 132
    sput-object v0, Lgf0/i;->h:Ljava/util/Set;

    .line 133
    .line 134
    new-instance v0, Ljava/util/HashSet;

    .line 135
    .line 136
    const-string v35, "ul"

    .line 137
    .line 138
    const-string v36, "video"

    .line 139
    .line 140
    const-string v1, "address"

    .line 141
    .line 142
    const-string v2, "article"

    .line 143
    .line 144
    const-string v3, "aside"

    .line 145
    .line 146
    const-string v4, "blockquote"

    .line 147
    .line 148
    const-string v5, "canvas"

    .line 149
    .line 150
    const-string v6, "dd"

    .line 151
    .line 152
    const-string v7, "div"

    .line 153
    .line 154
    const-string v8, "dl"

    .line 155
    .line 156
    const-string v9, "dt"

    .line 157
    .line 158
    const-string v10, "fieldset"

    .line 159
    .line 160
    const-string v11, "figcaption"

    .line 161
    .line 162
    const-string v12, "figure"

    .line 163
    .line 164
    const-string v13, "footer"

    .line 165
    .line 166
    const-string v14, "form"

    .line 167
    .line 168
    const-string v15, "h1"

    .line 169
    .line 170
    const-string v16, "h2"

    .line 171
    .line 172
    const-string v17, "h3"

    .line 173
    .line 174
    const-string v18, "h4"

    .line 175
    .line 176
    const-string v19, "h5"

    .line 177
    .line 178
    const-string v20, "h6"

    .line 179
    .line 180
    const-string v21, "header"

    .line 181
    .line 182
    const-string v22, "hgroup"

    .line 183
    .line 184
    const-string v23, "hr"

    .line 185
    .line 186
    const-string v24, "li"

    .line 187
    .line 188
    const-string v25, "main"

    .line 189
    .line 190
    const-string v26, "nav"

    .line 191
    .line 192
    const-string v27, "noscript"

    .line 193
    .line 194
    const-string v28, "ol"

    .line 195
    .line 196
    const-string v29, "output"

    .line 197
    .line 198
    const-string v30, "p"

    .line 199
    .line 200
    const-string v31, "pre"

    .line 201
    .line 202
    const-string v32, "section"

    .line 203
    .line 204
    const-string v33, "table"

    .line 205
    .line 206
    const-string v34, "tfoot"

    .line 207
    .line 208
    .line 209
    filled-new-array/range {v1 .. v36}, [Ljava/lang/String;

    .line 210
    move-result-object v1

    .line 211
    .line 212
    .line 213
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 214
    move-result-object v1

    .line 215
    .line 216
    .line 217
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 218
    .line 219
    .line 220
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 221
    move-result-object v0

    .line 222
    .line 223
    sput-object v0, Lgf0/i;->i:Ljava/util/Set;

    .line 224
    return-void
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

.method public constructor <init>(Lgf0/d;Lgf0/n;)V
    .locals 2
    .param p1    # Lgf0/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lgf0/n;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lgf0/h;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    iput-object v0, p0, Lgf0/i;->c:Ljava/util/List;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lgf0/g$a;->j()Lgf0/g$a;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    iput-object v0, p0, Lgf0/i;->d:Lgf0/g$a;

    .line 18
    .line 19
    iput-object p1, p0, Lgf0/i;->a:Lgf0/d;

    .line 20
    .line 21
    iput-object p2, p0, Lgf0/i;->b:Lgf0/n;

    .line 22
    return-void
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

.method public static g(Lgf0/d;)Lgf0/i;
    .locals 2
    .param p0    # Lgf0/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lgf0/i;

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lgf0/n;->b()Lgf0/n;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Lgf0/i;-><init>(Lgf0/d;Lgf0/n;)V

    .line 10
    return-object v0
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

.method public static h(Ljava/lang/Appendable;)V
    .locals 2
    .param p0    # Ljava/lang/Appendable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Appendable;",
            ":",
            "Ljava/lang/CharSequence;",
            ">(TT;)V"
        }
    .end annotation

    .line 1
    move-object v0, p0

    .line 2
    .line 3
    check-cast v0, Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 7
    move-result v1

    .line 8
    .line 9
    if-lez v1, :cond_0

    .line 10
    .line 11
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 15
    move-result v0

    .line 16
    .line 17
    const/16 v1, 0xa

    .line 18
    .line 19
    if-eq v1, v0, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v1}, Lgf0/a;->a(Ljava/lang/Appendable;C)V

    .line 23
    :cond_0
    return-void
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

.method public static j(Lio/noties/markwon/html/jsoup/parser/Token$g;)Ljava/util/Map;
    .locals 4
    .param p0    # Lio/noties/markwon/html/jsoup/parser/Token$g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/noties/markwon/html/jsoup/parser/Token$g;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object p0, p0, Lio/noties/markwon/html/jsoup/parser/Token$h;->j:Lif0/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lif0/b;->size()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-lez v0, :cond_1

    .line 9
    .line 10
    new-instance v1, Ljava/util/HashMap;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lif0/b;->iterator()Ljava/util/Iterator;

    .line 17
    move-result-object p0

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    check-cast v0, Lif0/a;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lif0/a;->b()Ljava/lang/String;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lif0/a;->c()Ljava/lang/String;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    .line 46
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    goto :goto_0

    .line 48
    .line 49
    .line 50
    :cond_0
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    .line 54
    :cond_1
    sget-object p0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 55
    return-object p0
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

.method public static m(Ljava/lang/String;)Z
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    sget-object v0, Lgf0/i;->i:Ljava/util/Set;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    move-result p0

    .line 7
    return p0
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

.method public static n(Ljava/lang/Appendable;Lgf0/g;)Z
    .locals 0
    .param p0    # Ljava/lang/Appendable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lgf0/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Appendable;",
            ":",
            "Ljava/lang/CharSequence;",
            ">(TT;",
            "Lgf0/g;",
            ")Z"
        }
    .end annotation

    .line 1
    .line 2
    iget p1, p1, Lgf0/g;->b:I

    .line 3
    .line 4
    check-cast p0, Ljava/lang/CharSequence;

    .line 5
    .line 6
    .line 7
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 8
    move-result p0

    .line 9
    .line 10
    if-ne p1, p0, :cond_0

    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
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

.method public static o(Ljava/lang/String;)Z
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    sget-object v0, Lgf0/i;->g:Ljava/util/Set;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    move-result p0

    .line 7
    return p0
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

.method public static p(Ljava/lang/String;)Z
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    sget-object v0, Lgf0/i;->h:Ljava/util/Set;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    move-result p0

    .line 7
    return p0
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


# virtual methods
.method public a(ILgf0/h$a;)V
    .locals 2
    .param p2    # Lgf0/h$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lgf0/h$a<",
            "Lgf0/f$a;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lgf0/i;->d:Lgf0/g$a;

    .line 3
    .line 4
    :goto_0
    iget-object v1, v0, Lgf0/g$a;->e:Lgf0/g$a;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    move-object v0, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, -0x1

    .line 10
    .line 11
    if-le p1, v1, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lgf0/g$a;->h(I)V

    .line 15
    .line 16
    .line 17
    :cond_1
    invoke-virtual {v0}, Lgf0/g$a;->f()Ljava/util/List;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 22
    move-result v0

    .line 23
    .line 24
    if-lez v0, :cond_2

    .line 25
    .line 26
    .line 27
    invoke-interface {p2, p1}, Lgf0/h$a;->apply(Ljava/util/List;)V

    .line 28
    goto :goto_1

    .line 29
    .line 30
    :cond_2
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 31
    .line 32
    .line 33
    invoke-interface {p2, p1}, Lgf0/h$a;->apply(Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    :goto_1
    invoke-static {}, Lgf0/g$a;->j()Lgf0/g$a;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    iput-object p1, p0, Lgf0/i;->d:Lgf0/g$a;

    .line 40
    return-void
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

.method public b(ILgf0/h$a;)V
    .locals 2
    .param p2    # Lgf0/h$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lgf0/h$a<",
            "Lgf0/f$b;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lgf0/i;->c:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-lez v0, :cond_1

    .line 9
    const/4 v0, -0x1

    .line 10
    .line 11
    if-le p1, v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lgf0/i;->c:Ljava/util/List;

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    move-result v1

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    check-cast v1, Lgf0/g$b;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p1}, Lgf0/g$b;->h(I)V

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_0
    iget-object p1, p0, Lgf0/i;->c:Ljava/util/List;

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    .line 42
    invoke-interface {p2, p1}, Lgf0/h$a;->apply(Ljava/util/List;)V

    .line 43
    .line 44
    iget-object p1, p0, Lgf0/i;->c:Ljava/util/List;

    .line 45
    .line 46
    .line 47
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 48
    return-void

    .line 49
    .line 50
    :cond_1
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 51
    .line 52
    .line 53
    invoke-interface {p2, p1}, Lgf0/h$a;->apply(Ljava/util/List;)V

    .line 54
    return-void
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

.method public c(Ljava/lang/Appendable;Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/Appendable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Appendable;",
            ":",
            "Ljava/lang/CharSequence;",
            ">(TT;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lio/noties/markwon/html/jsoup/parser/c;

    .line 3
    .line 4
    new-instance v1, Lio/noties/markwon/html/jsoup/parser/a;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p2}, Lio/noties/markwon/html/jsoup/parser/a;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lio/noties/markwon/html/jsoup/parser/ParseErrorList;->noTracking()Lio/noties/markwon/html/jsoup/parser/ParseErrorList;

    .line 11
    move-result-object p2

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1, p2}, Lio/noties/markwon/html/jsoup/parser/c;-><init>(Lio/noties/markwon/html/jsoup/parser/a;Lio/noties/markwon/html/jsoup/parser/ParseErrorList;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-virtual {v0}, Lio/noties/markwon/html/jsoup/parser/c;->t()Lio/noties/markwon/html/jsoup/parser/Token;

    .line 18
    move-result-object p2

    .line 19
    .line 20
    iget-object v1, p2, Lio/noties/markwon/html/jsoup/parser/Token;->a:Lio/noties/markwon/html/jsoup/parser/Token$TokenType;

    .line 21
    .line 22
    sget-object v2, Lio/noties/markwon/html/jsoup/parser/Token$TokenType;->EOF:Lio/noties/markwon/html/jsoup/parser/Token$TokenType;

    .line 23
    .line 24
    if-ne v2, v1, :cond_0

    .line 25
    return-void

    .line 26
    .line 27
    :cond_0
    sget-object v2, Lgf0/i$a;->a:[I

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 31
    move-result v1

    .line 32
    .line 33
    aget v1, v2, v1

    .line 34
    const/4 v2, 0x1

    .line 35
    .line 36
    if-eq v1, v2, :cond_4

    .line 37
    const/4 v2, 0x2

    .line 38
    .line 39
    if-eq v1, v2, :cond_2

    .line 40
    const/4 v2, 0x3

    .line 41
    .line 42
    if-eq v1, v2, :cond_1

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v1, p2

    .line 45
    .line 46
    check-cast v1, Lio/noties/markwon/html/jsoup/parser/Token$b;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, p1, v1}, Lgf0/i;->s(Ljava/lang/Appendable;Lio/noties/markwon/html/jsoup/parser/Token$b;)V

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move-object v1, p2

    .line 52
    .line 53
    check-cast v1, Lio/noties/markwon/html/jsoup/parser/Token$f;

    .line 54
    .line 55
    iget-object v2, v1, Lio/noties/markwon/html/jsoup/parser/Token$h;->c:Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    invoke-static {v2}, Lgf0/i;->o(Ljava/lang/String;)Z

    .line 59
    move-result v2

    .line 60
    .line 61
    if-eqz v2, :cond_3

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p1, v1}, Lgf0/i;->t(Ljava/lang/Appendable;Lio/noties/markwon/html/jsoup/parser/Token$f;)V

    .line 65
    goto :goto_1

    .line 66
    .line 67
    .line 68
    :cond_3
    invoke-virtual {p0, p1, v1}, Lgf0/i;->q(Ljava/lang/Appendable;Lio/noties/markwon/html/jsoup/parser/Token$f;)V

    .line 69
    goto :goto_1

    .line 70
    :cond_4
    move-object v1, p2

    .line 71
    .line 72
    check-cast v1, Lio/noties/markwon/html/jsoup/parser/Token$g;

    .line 73
    .line 74
    iget-object v2, v1, Lio/noties/markwon/html/jsoup/parser/Token$h;->c:Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    invoke-static {v2}, Lgf0/i;->o(Ljava/lang/String;)Z

    .line 78
    move-result v2

    .line 79
    .line 80
    if-eqz v2, :cond_5

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1, v1}, Lgf0/i;->u(Ljava/lang/Appendable;Lio/noties/markwon/html/jsoup/parser/Token$g;)V

    .line 84
    goto :goto_1

    .line 85
    .line 86
    .line 87
    :cond_5
    invoke-virtual {p0, p1, v1}, Lgf0/i;->r(Ljava/lang/Appendable;Lio/noties/markwon/html/jsoup/parser/Token$g;)V

    .line 88
    .line 89
    .line 90
    :goto_1
    invoke-virtual {p2}, Lio/noties/markwon/html/jsoup/parser/Token;->a()Lio/noties/markwon/html/jsoup/parser/Token;

    .line 91
    goto :goto_0
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

.method public d()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lgf0/i;->c:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lgf0/g$a;->j()Lgf0/g$a;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iput-object v0, p0, Lgf0/i;->d:Lgf0/g$a;

    .line 12
    return-void
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

.method public e(Lgf0/g$a;Lgf0/g$a;)V
    .locals 2
    .param p1    # Lgf0/g$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lgf0/g$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p1, Lgf0/g$a;->f:Ljava/util/List;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    const/4 v1, 0x2

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    .line 12
    iput-object v0, p1, Lgf0/g$a;->f:Ljava/util/List;

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    return-void
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

.method public f(Ljava/lang/Appendable;Lgf0/g;)V
    .locals 1
    .param p1    # Ljava/lang/Appendable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lgf0/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Appendable;",
            ":",
            "Ljava/lang/CharSequence;",
            ">(TT;",
            "Lgf0/g;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lgf0/i;->a:Lgf0/d;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p2}, Lgf0/d;->a(Lgf0/f;)Ljava/lang/String;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p2}, Lgf0/a;->b(Ljava/lang/Appendable;Ljava/lang/CharSequence;)V

    .line 12
    :cond_0
    return-void
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

.method public i(Ljava/lang/Appendable;)V
    .locals 1
    .param p1    # Ljava/lang/Appendable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Appendable;",
            ":",
            "Ljava/lang/CharSequence;",
            ">(TT;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lgf0/i;->f:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lgf0/i;->h(Ljava/lang/Appendable;)V

    .line 8
    const/4 p1, 0x0

    .line 9
    .line 10
    iput-boolean p1, p0, Lgf0/i;->f:Z

    .line 11
    :cond_0
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

.method public k(Ljava/lang/String;)Lgf0/g$a;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lgf0/i;->d:Lgf0/g$a;

    .line 3
    .line 4
    :goto_0
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, v0, Lgf0/g;->a:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lgf0/g;->isClosed()Z

    .line 16
    move-result v1

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    iget-object v0, v0, Lgf0/g$a;->e:Lgf0/g$a;

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-object v0
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

.method public l(Ljava/lang/String;)Lgf0/g$b;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lgf0/i;->c:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    move-result v0

    .line 7
    .line 8
    add-int/lit8 v0, v0, -0x1

    .line 9
    :goto_0
    const/4 v1, -0x1

    .line 10
    .line 11
    if-le v0, v1, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Lgf0/i;->c:Ljava/util/List;

    .line 14
    .line 15
    .line 16
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    check-cast v1, Lgf0/g$b;

    .line 20
    .line 21
    iget-object v2, v1, Lgf0/g;->a:Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    move-result v2

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    iget v2, v1, Lgf0/g;->d:I

    .line 30
    .line 31
    if-gez v2, :cond_0

    .line 32
    return-object v1

    .line 33
    .line 34
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 p1, 0x0

    .line 37
    return-object p1
    .line 38
    .line 39
.end method

.method public q(Ljava/lang/Appendable;Lio/noties/markwon/html/jsoup/parser/Token$f;)V
    .locals 2
    .param p1    # Ljava/lang/Appendable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lio/noties/markwon/html/jsoup/parser/Token$f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Appendable;",
            ":",
            "Ljava/lang/CharSequence;",
            ">(TT;",
            "Lio/noties/markwon/html/jsoup/parser/Token$f;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object p2, p2, Lio/noties/markwon/html/jsoup/parser/Token$h;->c:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lgf0/i;->k(Ljava/lang/String;)Lgf0/g$a;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_4

    .line 9
    .line 10
    const-string v1, "pre"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    const/4 v1, 0x0

    .line 18
    .line 19
    iput-boolean v1, p0, Lgf0/i;->e:Z

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-static {p1, v0}, Lgf0/i;->n(Ljava/lang/Appendable;Lgf0/g;)Z

    .line 23
    move-result v1

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1, v0}, Lgf0/i;->f(Ljava/lang/Appendable;Lgf0/g;)V

    .line 29
    :cond_1
    move-object v1, p1

    .line 30
    .line 31
    check-cast v1, Ljava/lang/CharSequence;

    .line 32
    .line 33
    .line 34
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 35
    move-result v1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lgf0/g$a;->h(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lgf0/g;->g()Z

    .line 42
    move-result v1

    .line 43
    .line 44
    if-nez v1, :cond_2

    .line 45
    .line 46
    iget-object v1, v0, Lgf0/g;->a:Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    invoke-static {v1}, Lgf0/i;->m(Ljava/lang/String;)Z

    .line 50
    move-result v1

    .line 51
    .line 52
    iput-boolean v1, p0, Lgf0/i;->f:Z

    .line 53
    .line 54
    :cond_2
    const-string v1, "p"

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    move-result p2

    .line 59
    .line 60
    if-eqz p2, :cond_3

    .line 61
    .line 62
    const/16 p2, 0xa

    .line 63
    .line 64
    .line 65
    invoke-static {p1, p2}, Lgf0/a;->a(Ljava/lang/Appendable;C)V

    .line 66
    .line 67
    :cond_3
    iget-object p1, v0, Lgf0/g$a;->e:Lgf0/g$a;

    .line 68
    .line 69
    iput-object p1, p0, Lgf0/i;->d:Lgf0/g$a;

    .line 70
    :cond_4
    return-void
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public r(Ljava/lang/Appendable;Lio/noties/markwon/html/jsoup/parser/Token$g;)V
    .locals 5
    .param p1    # Ljava/lang/Appendable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lio/noties/markwon/html/jsoup/parser/Token$g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Appendable;",
            ":",
            "Ljava/lang/CharSequence;",
            ">(TT;",
            "Lio/noties/markwon/html/jsoup/parser/Token$g;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p2, Lio/noties/markwon/html/jsoup/parser/Token$h;->c:Ljava/lang/String;

    .line 3
    .line 4
    iget-object v1, p0, Lgf0/i;->d:Lgf0/g$a;

    .line 5
    .line 6
    iget-object v1, v1, Lgf0/g;->a:Ljava/lang/String;

    .line 7
    .line 8
    const-string v2, "p"

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lgf0/i;->d:Lgf0/g$a;

    .line 17
    move-object v2, p1

    .line 18
    .line 19
    check-cast v2, Ljava/lang/CharSequence;

    .line 20
    .line 21
    .line 22
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 23
    move-result v2

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, Lgf0/g$a;->h(I)V

    .line 27
    .line 28
    const/16 v1, 0xa

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v1}, Lgf0/a;->a(Ljava/lang/Appendable;C)V

    .line 32
    .line 33
    iget-object v1, p0, Lgf0/i;->d:Lgf0/g$a;

    .line 34
    .line 35
    iget-object v1, v1, Lgf0/g$a;->e:Lgf0/g$a;

    .line 36
    .line 37
    iput-object v1, p0, Lgf0/i;->d:Lgf0/g$a;

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_0
    const-string v1, "li"

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    move-result v2

    .line 45
    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    iget-object v2, p0, Lgf0/i;->d:Lgf0/g$a;

    .line 49
    .line 50
    iget-object v2, v2, Lgf0/g;->a:Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    move-result v1

    .line 55
    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    iget-object v1, p0, Lgf0/i;->d:Lgf0/g$a;

    .line 59
    move-object v2, p1

    .line 60
    .line 61
    check-cast v2, Ljava/lang/CharSequence;

    .line 62
    .line 63
    .line 64
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 65
    move-result v2

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v2}, Lgf0/g$a;->h(I)V

    .line 69
    .line 70
    iget-object v1, p0, Lgf0/i;->d:Lgf0/g$a;

    .line 71
    .line 72
    iget-object v1, v1, Lgf0/g$a;->e:Lgf0/g$a;

    .line 73
    .line 74
    iput-object v1, p0, Lgf0/i;->d:Lgf0/g$a;

    .line 75
    .line 76
    .line 77
    :cond_1
    :goto_0
    invoke-static {v0}, Lgf0/i;->m(Ljava/lang/String;)Z

    .line 78
    move-result v1

    .line 79
    .line 80
    if-eqz v1, :cond_2

    .line 81
    .line 82
    const-string v1, "pre"

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    move-result v1

    .line 87
    .line 88
    iput-boolean v1, p0, Lgf0/i;->e:Z

    .line 89
    .line 90
    .line 91
    invoke-static {p1}, Lgf0/i;->h(Ljava/lang/Appendable;)V

    .line 92
    goto :goto_1

    .line 93
    .line 94
    .line 95
    :cond_2
    invoke-virtual {p0, p1}, Lgf0/i;->i(Ljava/lang/Appendable;)V

    .line 96
    :goto_1
    move-object v1, p1

    .line 97
    .line 98
    check-cast v1, Ljava/lang/CharSequence;

    .line 99
    .line 100
    .line 101
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 102
    move-result v2

    .line 103
    .line 104
    .line 105
    invoke-static {p2}, Lgf0/i;->j(Lio/noties/markwon/html/jsoup/parser/Token$g;)Ljava/util/Map;

    .line 106
    move-result-object v3

    .line 107
    .line 108
    iget-object v4, p0, Lgf0/i;->d:Lgf0/g$a;

    .line 109
    .line 110
    .line 111
    invoke-static {v0, v2, v3, v4}, Lgf0/g$a;->i(Ljava/lang/String;ILjava/util/Map;Lgf0/g$a;)Lgf0/g$a;

    .line 112
    move-result-object v2

    .line 113
    .line 114
    .line 115
    invoke-static {v0}, Lgf0/i;->p(Ljava/lang/String;)Z

    .line 116
    move-result v0

    .line 117
    .line 118
    if-nez v0, :cond_4

    .line 119
    .line 120
    iget-boolean p2, p2, Lio/noties/markwon/html/jsoup/parser/Token$h;->i:Z

    .line 121
    .line 122
    if-eqz p2, :cond_3

    .line 123
    goto :goto_2

    .line 124
    :cond_3
    const/4 p2, 0x0

    .line 125
    goto :goto_3

    .line 126
    :cond_4
    :goto_2
    const/4 p2, 0x1

    .line 127
    .line 128
    :goto_3
    if-eqz p2, :cond_6

    .line 129
    .line 130
    iget-object v0, p0, Lgf0/i;->a:Lgf0/d;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v2}, Lgf0/d;->a(Lgf0/f;)Ljava/lang/String;

    .line 134
    move-result-object v0

    .line 135
    .line 136
    if-eqz v0, :cond_5

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 140
    move-result v3

    .line 141
    .line 142
    if-lez v3, :cond_5

    .line 143
    .line 144
    .line 145
    invoke-static {p1, v0}, Lgf0/a;->b(Ljava/lang/Appendable;Ljava/lang/CharSequence;)V

    .line 146
    .line 147
    .line 148
    :cond_5
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 149
    move-result p1

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, p1}, Lgf0/g$a;->h(I)V

    .line 153
    .line 154
    :cond_6
    iget-object p1, v2, Lgf0/g$a;->e:Lgf0/g$a;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, p1, v2}, Lgf0/i;->e(Lgf0/g$a;Lgf0/g$a;)V

    .line 158
    .line 159
    if-nez p2, :cond_7

    .line 160
    .line 161
    iput-object v2, p0, Lgf0/i;->d:Lgf0/g$a;

    .line 162
    :cond_7
    return-void
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

.method public s(Ljava/lang/Appendable;Lio/noties/markwon/html/jsoup/parser/Token$b;)V
    .locals 1
    .param p1    # Ljava/lang/Appendable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lio/noties/markwon/html/jsoup/parser/Token$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Appendable;",
            ":",
            "Ljava/lang/CharSequence;",
            ">(TT;",
            "Lio/noties/markwon/html/jsoup/parser/Token$b;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lgf0/i;->e:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Lio/noties/markwon/html/jsoup/parser/Token$b;->d()Ljava/lang/String;

    .line 8
    move-result-object p2

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p2}, Lgf0/a;->b(Ljava/lang/Appendable;Ljava/lang/CharSequence;)V

    .line 12
    return-void

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0, p1}, Lgf0/i;->i(Ljava/lang/Appendable;)V

    .line 16
    .line 17
    iget-object v0, p0, Lgf0/i;->b:Lgf0/n;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Lio/noties/markwon/html/jsoup/parser/Token$b;->d()Ljava/lang/String;

    .line 21
    move-result-object p2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, Lgf0/n;->a(Ljava/lang/Appendable;Ljava/lang/String;)V

    .line 25
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

.method public t(Ljava/lang/Appendable;Lio/noties/markwon/html/jsoup/parser/Token$f;)V
    .locals 1
    .param p1    # Ljava/lang/Appendable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lio/noties/markwon/html/jsoup/parser/Token$f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Appendable;",
            ":",
            "Ljava/lang/CharSequence;",
            ">(TT;",
            "Lio/noties/markwon/html/jsoup/parser/Token$f;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object p2, p2, Lio/noties/markwon/html/jsoup/parser/Token$h;->c:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lgf0/i;->l(Ljava/lang/String;)Lgf0/g$b;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p2}, Lgf0/i;->n(Ljava/lang/Appendable;Lgf0/g;)Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1, p2}, Lgf0/i;->f(Ljava/lang/Appendable;Lgf0/g;)V

    .line 18
    .line 19
    :cond_0
    check-cast p1, Ljava/lang/CharSequence;

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 23
    move-result p1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, p1}, Lgf0/g$b;->h(I)V

    .line 27
    :cond_1
    return-void
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

.method public u(Ljava/lang/Appendable;Lio/noties/markwon/html/jsoup/parser/Token$g;)V
    .locals 5
    .param p1    # Ljava/lang/Appendable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lio/noties/markwon/html/jsoup/parser/Token$g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Appendable;",
            ":",
            "Ljava/lang/CharSequence;",
            ">(TT;",
            "Lio/noties/markwon/html/jsoup/parser/Token$g;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p2, Lio/noties/markwon/html/jsoup/parser/Token$h;->c:Ljava/lang/String;

    .line 3
    .line 4
    new-instance v1, Lgf0/g$b;

    .line 5
    move-object v2, p1

    .line 6
    .line 7
    check-cast v2, Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 11
    move-result v3

    .line 12
    .line 13
    .line 14
    invoke-static {p2}, Lgf0/i;->j(Lio/noties/markwon/html/jsoup/parser/Token$g;)Ljava/util/Map;

    .line 15
    move-result-object v4

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v0, v3, v4}, Lgf0/g$b;-><init>(Ljava/lang/String;ILjava/util/Map;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lgf0/i;->i(Ljava/lang/Appendable;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lgf0/i;->p(Ljava/lang/String;)Z

    .line 25
    move-result v0

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    iget-boolean p2, p2, Lio/noties/markwon/html/jsoup/parser/Token$h;->i:Z

    .line 30
    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    :cond_0
    iget-object p2, p0, Lgf0/i;->a:Lgf0/d;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, v1}, Lgf0/d;->a(Lgf0/f;)Ljava/lang/String;

    .line 37
    move-result-object p2

    .line 38
    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 43
    move-result v0

    .line 44
    .line 45
    if-lez v0, :cond_1

    .line 46
    .line 47
    .line 48
    invoke-static {p1, p2}, Lgf0/a;->b(Ljava/lang/Appendable;Ljava/lang/CharSequence;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 52
    move-result p1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, p1}, Lgf0/g$b;->h(I)V

    .line 56
    .line 57
    :cond_2
    iget-object p1, p0, Lgf0/i;->c:Ljava/util/List;

    .line 58
    .line 59
    .line 60
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    return-void
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
