.class public Lcom/tencent/bugly/proguard/na;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    api = 0x1a
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/na$b;,
        Lcom/tencent/bugly/proguard/na$c;,
        Lcom/tencent/bugly/proguard/na$a;,
        Lcom/tencent/bugly/proguard/na$d;
    }
.end annotation


# static fields
.field public static final g:Ljava/lang/String; = "KernelCpuThreadReader"

.field public static final h:Z = false

.field public static final i:Ljava/lang/String; = "time_in_state"

.field public static final j:Ljava/lang/String; = "cmdline"

.field public static final k:Ljava/lang/String; = "comm"

.field public static final l:Ljava/lang/String; = "[0-9]*"

.field public static final m:Ljava/lang/String; = "unknown_process"

.field public static final n:Ljava/lang/String; = "unknown_thread"

.field public static final o:Ljava/nio/file/Path;

.field public static final p:Ljava/nio/file/Path;

.field public static final q:I = -0x1


# instance fields
.field public a:Ljava/util/function/Predicate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Predicate<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/nio/file/Path;

.field public c:[I

.field public final d:Lcom/tencent/bugly/proguard/le;

.field public e:Lcom/tencent/bugly/proguard/na$a;

.field public final f:Lcom/tencent/bugly/proguard/na$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    new-array v0, v0, [Ljava/lang/String;

    .line 4
    .line 5
    const-string v1, "/proc"

    .line 6
    .line 7
    .line 8
    invoke-static {v1, v0}, Lcom/datavisorobfus/c1;->a(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    sput-object v0, Lcom/tencent/bugly/proguard/na;->o:Ljava/nio/file/Path;

    .line 12
    .line 13
    .line 14
    const-string/jumbo v1, "self/time_in_state"

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/fj;->a(Ljava/nio/file/Path;Ljava/lang/String;)Ljava/nio/file/Path;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    sput-object v0, Lcom/tencent/bugly/proguard/na;->p:Ljava/nio/file/Path;

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
.end method

.method public constructor <init>(ILjava/util/function/Predicate;Ljava/nio/file/Path;Ljava/nio/file/Path;Lcom/tencent/bugly/proguard/na$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/function/Predicate<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/nio/file/Path;",
            "Ljava/nio/file/Path;",
            "Lcom/tencent/bugly/proguard/na$b;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/tencent/bugly/proguard/na;->a:Ljava/util/function/Predicate;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/tencent/bugly/proguard/na;->b:Ljava/nio/file/Path;

    .line 8
    .line 9
    new-instance p2, Lcom/tencent/bugly/proguard/le;

    .line 10
    .line 11
    .line 12
    invoke-direct {p2, p4}, Lcom/tencent/bugly/proguard/le;-><init>(Ljava/nio/file/Path;)V

    .line 13
    .line 14
    iput-object p2, p0, Lcom/tencent/bugly/proguard/na;->d:Lcom/tencent/bugly/proguard/le;

    .line 15
    .line 16
    iput-object p5, p0, Lcom/tencent/bugly/proguard/na;->f:Lcom/tencent/bugly/proguard/na$b;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/na;->a(I)V

    .line 20
    return-void
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
.end method

.method public static a(ILjava/util/function/Predicate;)Lcom/tencent/bugly/proguard/na;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/function/Predicate<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/tencent/bugly/proguard/na;"
        }
    .end annotation

    .line 1
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/proguard/na;

    sget-object v3, Lcom/tencent/bugly/proguard/na;->o:Ljava/nio/file/Path;

    sget-object v4, Lcom/tencent/bugly/proguard/na;->p:Ljava/nio/file/Path;

    new-instance v5, Lcom/tencent/bugly/proguard/na$b;

    invoke-direct {v5}, Lcom/tencent/bugly/proguard/na$b;-><init>()V

    move v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/tencent/bugly/proguard/na;-><init>(ILjava/util/function/Predicate;Ljava/nio/file/Path;Ljava/nio/file/Path;Lcom/tencent/bugly/proguard/na$b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    move-object p0, v0

    .line 2
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v0, "KernelCpuThreadReader"

    const-string v1, "Failed to initialize KernelCpuThreadReader"

    invoke-virtual {p1, v0, v1, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/nio/file/Path;)I
    .locals 4

    .line 23
    invoke-static {p1}, Lcom/tencent/bugly/proguard/gj;->a(Ljava/nio/file/Path;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p1}, Lcom/datavisorobfus/e1;->a(Ljava/nio/file/Path;)Ljava/lang/String;

    move-result-object p1

    .line 24
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception v0

    .line 25
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 26
    const-string v2, "Failed to parse "

    const-string v3, " as process ID"

    invoke-static {v2, p1, v3}, Lcom/tencent/bugly/proguard/lf;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 27
    const-string v2, "KernelCpuThreadReader"

    invoke-virtual {v1, v2, p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, -0x1

    return p1
.end method

.method public final a(Ljava/nio/file/Path;II)Lcom/tencent/bugly/proguard/na$c;
    .locals 5

    .line 13
    const-string/jumbo v0, "task"

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/fj;->a(Ljava/nio/file/Path;Ljava/lang/String;)Ljava/nio/file/Path;

    move-result-object v0

    .line 14
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    .line 15
    :try_start_0
    invoke-static {v0}, Lcom/tencent/bugly/proguard/hj;->a(Ljava/nio/file/Path;)Ljava/nio/file/DirectoryStream;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/nio/file/DirectoryIteratorException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    :try_start_1
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ij;->a(Ljava/nio/file/DirectoryStream;)Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Ln7/f;->a(Ljava/lang/Object;)Ljava/nio/file/Path;

    move-result-object v4

    .line 17
    invoke-virtual {p0, v4}, Lcom/tencent/bugly/proguard/na;->c(Ljava/nio/file/Path;)Lcom/tencent/bugly/proguard/na$d;

    move-result-object v4

    if-nez v4, :cond_0

    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 19
    :cond_1
    :try_start_2
    invoke-static {v0}, Lcom/tencent/bugly/proguard/jj;->a(Ljava/nio/file/DirectoryStream;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/nio/file/DirectoryIteratorException; {:try_start_2 .. :try_end_2} :catch_0

    .line 20
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    return-object v2

    .line 21
    :cond_2
    new-instance v0, Lcom/tencent/bugly/proguard/na$c;

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/na;->b(Ljava/nio/file/Path;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p2, p1, p3, v1}, Lcom/tencent/bugly/proguard/na$c;-><init>(ILjava/lang/String;ILjava/util/ArrayList;)V

    return-object v0

    :goto_1
    if-eqz v0, :cond_3

    .line 22
    :try_start_3
    invoke-static {v0}, Lcom/tencent/bugly/proguard/jj;->a(Ljava/nio/file/DirectoryStream;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p2

    :try_start_4
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_2
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/nio/file/DirectoryIteratorException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    return-object v2
.end method

.method public a(I)V
    .locals 4

    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/na;->c:[I

    if-eqz v0, :cond_0

    array-length v0, v0

    if-ne v0, p1, :cond_0

    goto :goto_1

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/na;->d:Lcom/tencent/bugly/proguard/le;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/le;->a()[J

    move-result-object v0

    if-eqz p1, :cond_1

    .line 6
    new-instance v1, Lcom/tencent/bugly/proguard/na$a;

    invoke-direct {v1, v0, p1}, Lcom/tencent/bugly/proguard/na$a;-><init>([JI)V

    iput-object v1, p0, Lcom/tencent/bugly/proguard/na;->e:Lcom/tencent/bugly/proguard/na$a;

    .line 7
    invoke-virtual {v1, v0}, Lcom/tencent/bugly/proguard/na$a;->a([J)[I

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/na;->c:[I

    return-void

    :cond_1
    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lcom/tencent/bugly/proguard/na;->e:Lcom/tencent/bugly/proguard/na$a;

    .line 9
    array-length p1, v0

    new-array p1, p1, [I

    iput-object p1, p0, Lcom/tencent/bugly/proguard/na;->c:[I

    const/4 p1, 0x0

    .line 10
    :goto_0
    array-length v1, v0

    if-ge p1, v1, :cond_2

    .line 11
    iget-object v1, p0, Lcom/tencent/bugly/proguard/na;->c:[I

    aget-wide v2, v0, p1

    long-to-int v2, v2

    aput v2, v1, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public a(Ljava/util/function/Predicate;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/function/Predicate<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 12
    iput-object p1, p0, Lcom/tencent/bugly/proguard/na;->a:Ljava/util/function/Predicate;

    return-void
.end method

.method public a()[I
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/na;->c:[I

    return-object v0
.end method

.method public final b(Ljava/nio/file/Path;)Ljava/lang/String;
    .locals 1

    .line 15
    const-string v0, "cmdline"

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/fj;->a(Ljava/nio/file/Path;Ljava/lang/String;)Ljava/nio/file/Path;

    move-result-object p1

    .line 16
    invoke-static {p1}, Lcom/datavisorobfus/e1;->a(Ljava/nio/file/Path;)Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0xa

    .line 17
    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/ke;->a(Ljava/lang/String;B)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    .line 18
    :cond_0
    const-string/jumbo p1, "unknown_process"

    return-object p1
.end method

.method public b()Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/na$c;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "KernelCpuThreadReader"

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    .line 2
    :try_start_0
    iget-object v3, p0, Lcom/tencent/bugly/proguard/na;->b:Ljava/nio/file/Path;

    const-string v4, "[0-9]*"

    .line 3
    invoke-static {v3, v4}, Lcom/tencent/bugly/proguard/kj;->a(Ljava/nio/file/Path;Ljava/lang/String;)Ljava/nio/file/DirectoryStream;

    move-result-object v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    :try_start_1
    invoke-static {v3}, Lcom/tencent/bugly/proguard/ij;->a(Ljava/nio/file/DirectoryStream;)Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Ln7/f;->a(Ljava/lang/Object;)Ljava/nio/file/Path;

    move-result-object v5

    .line 5
    invoke-virtual {p0, v5}, Lcom/tencent/bugly/proguard/na;->a(Ljava/nio/file/Path;)I

    move-result v6

    .line 6
    iget-object v7, p0, Lcom/tencent/bugly/proguard/na;->f:Lcom/tencent/bugly/proguard/na$b;

    invoke-virtual {v7, v6}, Lcom/tencent/bugly/proguard/na$b;->a(I)I

    move-result v7

    const/4 v8, -0x1

    if-eq v7, v8, :cond_0

    if-ne v6, v8, :cond_1

    goto :goto_0

    .line 7
    :cond_1
    iget-object v8, p0, Lcom/tencent/bugly/proguard/na;->a:Ljava/util/function/Predicate;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {p0, v5, v6, v7}, Lcom/tencent/bugly/proguard/na;->a(Ljava/nio/file/Path;II)Lcom/tencent/bugly/proguard/na$c;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 9
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 10
    :cond_3
    :try_start_2
    invoke-static {v3}, Lcom/tencent/bugly/proguard/jj;->a(Ljava/nio/file/DirectoryStream;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 12
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v3, "Didn\'t successfully get any process CPU information for UIDs specified"

    filled-new-array {v0, v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    return-object v2

    :cond_4
    return-object v1

    :catch_0
    move-exception v1

    goto :goto_3

    :goto_1
    if-eqz v3, :cond_5

    .line 13
    :try_start_3
    invoke-static {v3}, Lcom/tencent/bugly/proguard/jj;->a(Ljava/nio/file/DirectoryStream;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v3

    :try_start_4
    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_2
    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 14
    :goto_3
    sget-object v3, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v4, "Failed to iterate over process paths"

    invoke-virtual {v3, v0, v4, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v2
.end method

.method public final c(Ljava/nio/file/Path;)Lcom/tencent/bugly/proguard/na$d;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {p1}, Lcom/tencent/bugly/proguard/gj;->a(Ljava/nio/file/Path;)Ljava/nio/file/Path;

    .line 5
    move-result-object v1

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, Lcom/datavisorobfus/e1;->a(Ljava/nio/file/Path;)Ljava/lang/String;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 13
    move-result v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/na;->d(Ljava/nio/file/Path;)Ljava/lang/String;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    .line 20
    const-string/jumbo v3, "time_in_state"

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v3}, Lcom/tencent/bugly/proguard/fj;->a(Ljava/nio/file/Path;Ljava/lang/String;)Ljava/nio/file/Path;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    iget-object v3, p0, Lcom/tencent/bugly/proguard/na;->d:Lcom/tencent/bugly/proguard/le;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, p1}, Lcom/tencent/bugly/proguard/le;->a(Ljava/nio/file/Path;)[J

    .line 30
    move-result-object p1

    .line 31
    .line 32
    if-nez p1, :cond_0

    .line 33
    return-object v0

    .line 34
    .line 35
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/na;->e:Lcom/tencent/bugly/proguard/na$a;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/na$a;->b([J)[I

    .line 41
    move-result-object p1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    array-length v0, p1

    .line 44
    .line 45
    new-array v0, v0, [I

    .line 46
    const/4 v3, 0x0

    .line 47
    :goto_0
    array-length v4, p1

    .line 48
    .line 49
    if-ge v3, v4, :cond_2

    .line 50
    .line 51
    aget-wide v4, p1, v3

    .line 52
    long-to-int v4, v4

    .line 53
    .line 54
    aput v4, v0, v3

    .line 55
    .line 56
    add-int/lit8 v3, v3, 0x1

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move-object p1, v0

    .line 59
    .line 60
    :goto_1
    new-instance v0, Lcom/tencent/bugly/proguard/na$d;

    .line 61
    .line 62
    .line 63
    invoke-direct {v0, v1, v2, p1}, Lcom/tencent/bugly/proguard/na$d;-><init>(ILjava/lang/String;[I)V

    .line 64
    return-object v0

    .line 65
    :catch_0
    move-exception p1

    .line 66
    .line 67
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 68
    .line 69
    const-string v2, "KernelCpuThreadReader"

    .line 70
    .line 71
    const-string v3, "Failed to parse thread ID when iterating over /proc/*/task"

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v2, v3, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 75
    return-object v0
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public final d(Ljava/nio/file/Path;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "comm"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/fj;->a(Ljava/nio/file/Path;Ljava/lang/String;)Ljava/nio/file/Path;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lcom/datavisorobfus/e1;->a(Ljava/nio/file/Path;)Ljava/lang/String;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lcom/tencent/bugly/proguard/ke;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    .line 19
    const-string/jumbo p1, "unknown_thread"

    .line 20
    :cond_0
    return-object p1
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
