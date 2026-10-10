.class public Lfr/greweb/reactnativeviewshot/a;
.super Ljava/lang/Object;
.source "ViewShot.java"

# interfaces
.implements Lcom/facebook/react/uimanager/UIBlock;
.implements Lcom/facebook/react/fabric/interop/UIBlock;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfr/greweb/reactnativeviewshot/a$d;,
        Lfr/greweb/reactnativeviewshot/a$c;
    }
.end annotation


# static fields
.field public static final o:Ljava/lang/String; = "a"

.field public static p:[B

.field public static final q:Ljava/lang/Object;

.field public static final r:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:I
    .annotation build Lfr/greweb/reactnativeviewshot/a$c;
    .end annotation
.end field

.field public final d:D

.field public final e:Ljava/lang/Integer;

.field public final f:Ljava/lang/Integer;

.field public final g:Ljava/io/File;

.field public final h:Ljava/lang/String;

.field public final i:Lcom/facebook/react/bridge/Promise;

.field public final j:Ljava/lang/Boolean;

.field public final k:Lcom/facebook/react/bridge/ReactApplicationContext;

.field public final l:Z

.field public final m:Landroid/app/Activity;

.field public final n:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const/high16 v0, 0x10000

    .line 3
    .line 4
    new-array v0, v0, [B

    .line 5
    .line 6
    sput-object v0, Lfr/greweb/reactnativeviewshot/a;->p:[B

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    sput-object v0, Lfr/greweb/reactnativeviewshot/a;->q:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance v0, Ljava/util/WeakHashMap;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    sput-object v0, Lfr/greweb/reactnativeviewshot/a;->r:Ljava/util/Set;

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
.end method

.method public constructor <init>(ILjava/lang/String;IDLjava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Ljava/lang/String;Ljava/lang/Boolean;Lcom/facebook/react/bridge/ReactApplicationContext;Landroid/app/Activity;ZLcom/facebook/react/bridge/Promise;Ljava/util/concurrent/Executor;)V
    .locals 0
    .param p3    # I
        .annotation build Lfr/greweb/reactnativeviewshot/a$c;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lfr/greweb/reactnativeviewshot/a;->a:I

    .line 3
    iput-object p2, p0, Lfr/greweb/reactnativeviewshot/a;->b:Ljava/lang/String;

    .line 4
    iput p3, p0, Lfr/greweb/reactnativeviewshot/a;->c:I

    .line 5
    iput-wide p4, p0, Lfr/greweb/reactnativeviewshot/a;->d:D

    .line 6
    iput-object p6, p0, Lfr/greweb/reactnativeviewshot/a;->e:Ljava/lang/Integer;

    .line 7
    iput-object p7, p0, Lfr/greweb/reactnativeviewshot/a;->f:Ljava/lang/Integer;

    .line 8
    iput-object p8, p0, Lfr/greweb/reactnativeviewshot/a;->g:Ljava/io/File;

    .line 9
    iput-object p9, p0, Lfr/greweb/reactnativeviewshot/a;->h:Ljava/lang/String;

    .line 10
    iput-object p10, p0, Lfr/greweb/reactnativeviewshot/a;->j:Ljava/lang/Boolean;

    .line 11
    iput-object p11, p0, Lfr/greweb/reactnativeviewshot/a;->k:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 12
    iput-object p12, p0, Lfr/greweb/reactnativeviewshot/a;->m:Landroid/app/Activity;

    .line 13
    iput-boolean p13, p0, Lfr/greweb/reactnativeviewshot/a;->l:Z

    .line 14
    iput-object p14, p0, Lfr/greweb/reactnativeviewshot/a;->i:Lcom/facebook/react/bridge/Promise;

    .line 15
    iput-object p15, p0, Lfr/greweb/reactnativeviewshot/a;->n:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static bridge synthetic a(Lfr/greweb/reactnativeviewshot/a;)Landroid/app/Activity;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lfr/greweb/reactnativeviewshot/a;->m:Landroid/app/Activity;

    .line 3
    return-object p0
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

.method public static bridge synthetic b(Lfr/greweb/reactnativeviewshot/a;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lfr/greweb/reactnativeviewshot/a;->c:I

    .line 3
    return p0
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

.method public static bridge synthetic c(Lfr/greweb/reactnativeviewshot/a;)Lcom/facebook/react/bridge/Promise;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lfr/greweb/reactnativeviewshot/a;->i:Lcom/facebook/react/bridge/Promise;

    .line 3
    return-object p0
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

.method public static bridge synthetic d(Lfr/greweb/reactnativeviewshot/a;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lfr/greweb/reactnativeviewshot/a;->h:Ljava/lang/String;

    .line 3
    return-object p0
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

.method public static bridge synthetic e(Lfr/greweb/reactnativeviewshot/a;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lfr/greweb/reactnativeviewshot/a;->a:I

    .line 3
    return p0
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

.method public static bridge synthetic f(Lfr/greweb/reactnativeviewshot/a;Landroid/graphics/Canvas;Landroid/view/View;Landroid/view/View;)Landroid/graphics/Matrix;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lfr/greweb/reactnativeviewshot/a;->p(Landroid/graphics/Canvas;Landroid/view/View;Landroid/view/View;)Landroid/graphics/Matrix;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static bridge synthetic g(Lfr/greweb/reactnativeviewshot/a;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lfr/greweb/reactnativeviewshot/a;->z(Landroid/view/View;)V

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

.method public static bridge synthetic h(Lfr/greweb/reactnativeviewshot/a;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lfr/greweb/reactnativeviewshot/a;->A(Landroid/view/View;)V

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

.method public static bridge synthetic i(Lfr/greweb/reactnativeviewshot/a;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lfr/greweb/reactnativeviewshot/a;->B(Landroid/view/View;)V

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

.method public static bridge synthetic j(Lfr/greweb/reactnativeviewshot/a;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lfr/greweb/reactnativeviewshot/a;->C(Landroid/view/View;)V

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

.method public static bridge synthetic k()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lfr/greweb/reactnativeviewshot/a;->o:Ljava/lang/String;

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

.method public static bridge synthetic l()[B
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lfr/greweb/reactnativeviewshot/a;->p:[B

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

.method public static bridge synthetic m([B)V
    .locals 0

    .line 1
    .line 2
    sput-object p0, Lfr/greweb/reactnativeviewshot/a;->p:[B

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

.method public static bridge synthetic n(Landroid/view/View;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lfr/greweb/reactnativeviewshot/a;->x(Landroid/view/View;)I

    .line 4
    move-result p0

    .line 5
    return p0
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

.method public static bridge synthetic o(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lfr/greweb/reactnativeviewshot/a;->y(Landroid/graphics/Bitmap;)V

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
.end method

.method public static s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:TA;A:",
            "Ljava/lang/Object;",
            ">(TA;)TT;"
        }
    .end annotation

    .line 1
    return-object p0
    .line 2
    .line 3
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

.method public static v(II)Landroid/graphics/Bitmap;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lfr/greweb/reactnativeviewshot/a;->q:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Lfr/greweb/reactnativeviewshot/a;->r:Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    move-result v2

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    check-cast v2, Landroid/graphics/Bitmap;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 25
    move-result v3

    .line 26
    .line 27
    if-ne v3, p0, :cond_0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 31
    move-result v3

    .line 32
    .line 33
    if-ne v3, p1, :cond_0

    .line 34
    .line 35
    sget-object p0, Lfr/greweb/reactnativeviewshot/a;->r:Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    invoke-interface {p0, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 39
    const/4 p0, 0x0

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, p0}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 43
    monitor-exit v0

    .line 44
    return-object v2

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 50
    .line 51
    .line 52
    invoke-static {p0, p1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    throw p0
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

.method public static w(II)Landroid/graphics/Bitmap;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lfr/greweb/reactnativeviewshot/a;->q:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Lfr/greweb/reactnativeviewshot/a;->r:Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    move-result v2

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    check-cast v2, Landroid/graphics/Bitmap;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 25
    move-result v3

    .line 26
    .line 27
    if-ne v3, p0, :cond_0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 31
    move-result v3

    .line 32
    .line 33
    if-ne v3, p1, :cond_0

    .line 34
    .line 35
    sget-object p0, Lfr/greweb/reactnativeviewshot/a;->r:Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    invoke-interface {p0, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 39
    const/4 p0, 0x0

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, p0}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 43
    monitor-exit v0

    .line 44
    return-object v2

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 50
    .line 51
    .line 52
    invoke-static {p0, p1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    throw p0
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

.method public static x(Landroid/view/View;)I
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 8
    move-result p0

    .line 9
    mul-int/2addr v0, p0

    .line 10
    .line 11
    mul-int/lit8 v0, v0, 0x4

    .line 12
    .line 13
    const/16 p0, 0x20

    .line 14
    .line 15
    .line 16
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    .line 17
    move-result p0

    .line 18
    return p0
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

.method public static y(Landroid/graphics/Bitmap;)V
    .locals 2
    .param p0    # Landroid/graphics/Bitmap;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    sget-object v0, Lfr/greweb/reactnativeviewshot/a;->q:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Lfr/greweb/reactnativeviewshot/a;->r:Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    invoke-interface {v1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p0
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
.method public final A(Landroid/view/View;)V
    .locals 4
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lfr/greweb/reactnativeviewshot/a$d;

    .line 3
    .line 4
    sget-object v1, Lfr/greweb/reactnativeviewshot/a;->p:[B

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lfr/greweb/reactnativeviewshot/a$d;-><init>([B)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, v0}, Lfr/greweb/reactnativeviewshot/a;->q(Landroid/view/View;Ljava/io/OutputStream;)Landroid/graphics/Point;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lfr/greweb/reactnativeviewshot/a$d;->h()[B

    .line 14
    move-result-object p1

    .line 15
    .line 16
    sput-object p1, Lfr/greweb/reactnativeviewshot/a;->p:[B

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 20
    move-result p1

    .line 21
    .line 22
    sget-object v0, Lfr/greweb/reactnativeviewshot/a;->p:[B

    .line 23
    const/4 v1, 0x0

    .line 24
    const/4 v2, 0x2

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1, p1, v2}, Landroid/util/Base64;->encodeToString([BIII)Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    const-string v0, "jpg"

    .line 31
    .line 32
    iget-object v1, p0, Lfr/greweb/reactnativeviewshot/a;->b:Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    move-result v0

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    const-string v0, "jpeg"

    .line 41
    goto :goto_0

    .line 42
    .line 43
    :cond_0
    iget-object v0, p0, Lfr/greweb/reactnativeviewshot/a;->b:Ljava/lang/String;

    .line 44
    .line 45
    :goto_0
    iget-object v1, p0, Lfr/greweb/reactnativeviewshot/a;->i:Lcom/facebook/react/bridge/Promise;

    .line 46
    .line 47
    new-instance v2, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    const-string v3, "data:image/"

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v0, ";base64,"

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    .line 73
    invoke-interface {v1, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 74
    return-void
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

.method public final B(Landroid/view/View;)V
    .locals 5
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lfr/greweb/reactnativeviewshot/a;->g:Ljava/io/File;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    new-instance v1, Ljava/io/FileOutputStream;

    .line 13
    .line 14
    iget-object v2, p0, Lfr/greweb/reactnativeviewshot/a;->g:Ljava/io/File;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 18
    .line 19
    new-instance v2, Lfr/greweb/reactnativeviewshot/a$d;

    .line 20
    .line 21
    sget-object v3, Lfr/greweb/reactnativeviewshot/a;->p:[B

    .line 22
    .line 23
    .line 24
    invoke-direct {v2, v3}, Lfr/greweb/reactnativeviewshot/a$d;-><init>([B)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1, v2}, Lfr/greweb/reactnativeviewshot/a;->q(Landroid/view/View;Ljava/io/OutputStream;)Landroid/graphics/Point;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Lfr/greweb/reactnativeviewshot/a$d;->h()[B

    .line 32
    move-result-object v3

    .line 33
    .line 34
    sput-object v3, Lfr/greweb/reactnativeviewshot/a;->p:[B

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 38
    move-result v2

    .line 39
    .line 40
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 41
    .line 42
    iget v4, p1, Landroid/graphics/Point;->x:I

    .line 43
    .line 44
    .line 45
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    move-result-object v4

    .line 47
    .line 48
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    .line 55
    filled-new-array {v4, p1}, [Ljava/lang/Object;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    const-string v4, "%d:%d|"

    .line 59
    .line 60
    .line 61
    invoke-static {v3, v4, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    const-string v3, "US-ASCII"

    .line 65
    .line 66
    .line 67
    invoke-static {v3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 68
    move-result-object v3

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 72
    move-result-object p1

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, p1}, Ljava/io/FileOutputStream;->write([B)V

    .line 76
    .line 77
    sget-object p1, Lfr/greweb/reactnativeviewshot/a;->p:[B

    .line 78
    const/4 v3, 0x0

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, p1, v3, v2}, Ljava/io/FileOutputStream;->write([BII)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    .line 85
    .line 86
    iget-object p1, p0, Lfr/greweb/reactnativeviewshot/a;->i:Lcom/facebook/react/bridge/Promise;

    .line 87
    .line 88
    .line 89
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 90
    return-void
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

.method public final C(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/io/FileOutputStream;

    .line 3
    .line 4
    iget-object v1, p0, Lfr/greweb/reactnativeviewshot/a;->g:Ljava/io/File;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, v0}, Lfr/greweb/reactnativeviewshot/a;->q(Landroid/view/View;Ljava/io/OutputStream;)Landroid/graphics/Point;

    .line 11
    .line 12
    iget-object p1, p0, Lfr/greweb/reactnativeviewshot/a;->i:Lcom/facebook/react/bridge/Promise;

    .line 13
    .line 14
    iget-object v0, p0, Lfr/greweb/reactnativeviewshot/a;->g:Ljava/io/File;

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 26
    return-void
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

.method public execute(Lcom/facebook/react/fabric/interop/UIBlockViewResolver;)V
    .locals 1
    .param p1    # Lcom/facebook/react/fabric/interop/UIBlockViewResolver;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, p1}, Lfr/greweb/reactnativeviewshot/a;->t(Lcom/facebook/react/uimanager/NativeViewHierarchyManager;Lcom/facebook/react/fabric/interop/UIBlockViewResolver;)V

    return-void
.end method

.method public execute(Lcom/facebook/react/uimanager/NativeViewHierarchyManager;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lfr/greweb/reactnativeviewshot/a;->t(Lcom/facebook/react/uimanager/NativeViewHierarchyManager;Lcom/facebook/react/fabric/interop/UIBlockViewResolver;)V

    return-void
.end method

.method public final p(Landroid/graphics/Canvas;Landroid/view/View;Landroid/view/View;)Landroid/graphics/Matrix;
    .locals 7
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/Matrix;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 6
    .line 7
    new-instance v1, Ljava/util/LinkedList;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 11
    move-object v2, p3

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {v1, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    check-cast v2, Landroid/view/View;

    .line 21
    .line 22
    if-ne v2, p2, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 29
    move-result-object p2

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    move-result v1

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    .line 38
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    check-cast v1, Landroid/view/View;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 48
    move-result v2

    .line 49
    const/4 v3, 0x0

    .line 50
    .line 51
    if-eq v1, p3, :cond_1

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 55
    move-result v4

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    move v4, v3

    .line 58
    :goto_1
    add-int/2addr v2, v4

    .line 59
    int-to-float v2, v2

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Landroid/view/View;->getTranslationX()F

    .line 63
    move-result v4

    .line 64
    add-float/2addr v2, v4

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 68
    move-result v4

    .line 69
    .line 70
    if-eq v1, p3, :cond_2

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 74
    move-result v3

    .line 75
    :cond_2
    add-int/2addr v4, v3

    .line 76
    int-to-float v3, v4

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Landroid/view/View;->getTranslationY()F

    .line 80
    move-result v4

    .line 81
    add-float/2addr v3, v4

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Landroid/view/View;->getRotation()F

    .line 88
    move-result v4

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Landroid/view/View;->getPivotX()F

    .line 92
    move-result v5

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Landroid/view/View;->getPivotY()F

    .line 96
    move-result v6

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v4, v5, v6}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Landroid/view/View;->getScaleX()F

    .line 103
    move-result v4

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Landroid/view/View;->getScaleY()F

    .line 107
    move-result v5

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->scale(FF)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Landroid/view/View;->getRotation()F

    .line 117
    move-result v2

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Landroid/view/View;->getPivotX()F

    .line 121
    move-result v3

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Landroid/view/View;->getPivotY()F

    .line 125
    move-result v4

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v2, v3, v4}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, Landroid/view/View;->getScaleX()F

    .line 132
    move-result v2

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, Landroid/view/View;->getScaleY()F

    .line 136
    move-result v1

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 140
    goto :goto_0

    .line 141
    :cond_3
    return-object v0
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
.end method

.method public final q(Landroid/view/View;Ljava/io/OutputStream;)Landroid/graphics/Point;
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/io/OutputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lfr/greweb/reactnativeviewshot/a;->r(Landroid/view/View;Ljava/io/OutputStream;)Landroid/graphics/Point;

    .line 4
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V

    .line 8
    return-object p1

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V

    .line 13
    throw p1
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

.method public final r(Landroid/view/View;Ljava/io/OutputStream;)Landroid/graphics/Point;
    .locals 16
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/io/OutputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v3, p1

    .line 5
    .line 6
    move-object/from16 v8, p2

    .line 7
    .line 8
    .line 9
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 10
    move-result v9

    .line 11
    .line 12
    .line 13
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 14
    move-result v0

    .line 15
    .line 16
    if-lez v9, :cond_9

    .line 17
    .line 18
    if-lez v0, :cond_9

    .line 19
    .line 20
    iget-object v2, v1, Lfr/greweb/reactnativeviewshot/a;->j:Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    move-result v2

    .line 25
    const/4 v10, 0x0

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    move-object v0, v3

    .line 29
    .line 30
    check-cast v0, Landroid/widget/ScrollView;

    .line 31
    move v2, v10

    .line 32
    move v4, v2

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 36
    move-result v5

    .line 37
    .line 38
    if-ge v4, v5, :cond_0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 42
    move-result-object v5

    .line 43
    .line 44
    .line 45
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 46
    move-result v5

    .line 47
    add-int/2addr v2, v5

    .line 48
    .line 49
    add-int/lit8 v4, v4, 0x1

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move v11, v2

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move v11, v0

    .line 54
    .line 55
    :goto_1
    new-instance v12, Landroid/graphics/Point;

    .line 56
    .line 57
    .line 58
    invoke-direct {v12, v9, v11}, Landroid/graphics/Point;-><init>(II)V

    .line 59
    .line 60
    .line 61
    invoke-static {v9, v11}, Lfr/greweb/reactnativeviewshot/a;->v(II)Landroid/graphics/Bitmap;

    .line 62
    move-result-object v13

    .line 63
    .line 64
    new-instance v6, Landroid/graphics/Paint;

    .line 65
    .line 66
    .line 67
    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 68
    const/4 v14, 0x1

    .line 69
    .line 70
    .line 71
    invoke-virtual {v6, v14}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v6, v14}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6, v14}, Landroid/graphics/Paint;->setDither(Z)V

    .line 78
    .line 79
    new-instance v2, Landroid/graphics/Canvas;

    .line 80
    .line 81
    .line 82
    invoke-direct {v2, v13}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3, v2}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual/range {p0 .. p1}, Lfr/greweb/reactnativeviewshot/a;->u(Landroid/view/View;)Ljava/util/List;

    .line 89
    move-result-object v0

    .line 90
    .line 91
    .line 92
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 93
    move-result-object v15

    .line 94
    .line 95
    .line 96
    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    move-result v0

    .line 98
    .line 99
    if-eqz v0, :cond_5

    .line 100
    .line 101
    .line 102
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    move-result-object v0

    .line 104
    move-object v4, v0

    .line 105
    .line 106
    check-cast v4, Landroid/view/View;

    .line 107
    .line 108
    instance-of v0, v4, Landroid/view/TextureView;

    .line 109
    .line 110
    if-eqz v0, :cond_3

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 114
    move-result v0

    .line 115
    .line 116
    if-eqz v0, :cond_2

    .line 117
    goto :goto_2

    .line 118
    :cond_2
    move-object v0, v4

    .line 119
    .line 120
    check-cast v0, Landroid/view/TextureView;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v10}, Landroid/view/TextureView;->setOpaque(Z)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 127
    move-result v5

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 131
    move-result v7

    .line 132
    .line 133
    .line 134
    invoke-static {v5, v7}, Lfr/greweb/reactnativeviewshot/a;->w(II)Landroid/graphics/Bitmap;

    .line 135
    move-result-object v5

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v5}, Landroid/view/TextureView;->getBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 139
    move-result-object v0

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 143
    move-result v5

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, v2, v3, v4}, Lfr/greweb/reactnativeviewshot/a;->p(Landroid/graphics/Canvas;Landroid/view/View;Landroid/view/View;)Landroid/graphics/Matrix;

    .line 147
    const/4 v4, 0x0

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v0, v4, v4, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v5}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 154
    .line 155
    .line 156
    invoke-static {v0}, Lfr/greweb/reactnativeviewshot/a;->y(Landroid/graphics/Bitmap;)V

    .line 157
    goto :goto_3

    .line 158
    .line 159
    :cond_3
    instance-of v0, v4, Landroid/view/SurfaceView;

    .line 160
    .line 161
    if-eqz v0, :cond_4

    .line 162
    .line 163
    iget-boolean v0, v1, Lfr/greweb/reactnativeviewshot/a;->l:Z

    .line 164
    .line 165
    if-eqz v0, :cond_4

    .line 166
    move-object v5, v4

    .line 167
    .line 168
    check-cast v5, Landroid/view/SurfaceView;

    .line 169
    .line 170
    new-instance v7, Ljava/util/concurrent/CountDownLatch;

    .line 171
    .line 172
    .line 173
    invoke-direct {v7, v14}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 177
    move-result v0

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 181
    move-result v10

    .line 182
    .line 183
    .line 184
    invoke-static {v0, v10}, Lfr/greweb/reactnativeviewshot/a;->w(II)Landroid/graphics/Bitmap;

    .line 185
    move-result-object v0

    .line 186
    move-object v10, v5

    .line 187
    move-object v5, v0

    .line 188
    .line 189
    :try_start_0
    new-instance v0, Lfr/greweb/reactnativeviewshot/a$b;

    .line 190
    .line 191
    .line 192
    invoke-direct/range {v0 .. v7}, Lfr/greweb/reactnativeviewshot/a$b;-><init>(Lfr/greweb/reactnativeviewshot/a;Landroid/graphics/Canvas;Landroid/view/View;Landroid/view/View;Landroid/graphics/Bitmap;Landroid/graphics/Paint;Ljava/util/concurrent/CountDownLatch;)V

    .line 193
    .line 194
    new-instance v3, Landroid/os/Handler;

    .line 195
    .line 196
    .line 197
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 198
    move-result-object v4

    .line 199
    .line 200
    .line 201
    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 202
    .line 203
    .line 204
    invoke-static {v10, v5, v0, v3}, Landroid/view/PixelCopy;->request(Landroid/view/SurfaceView;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V

    .line 205
    .line 206
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 207
    .line 208
    const-wide/16 v3, 0x5

    .line 209
    .line 210
    .line 211
    invoke-virtual {v7, v3, v4, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 212
    goto :goto_3

    .line 213
    :catch_0
    move-exception v0

    .line 214
    .line 215
    sget-object v3, Lfr/greweb/reactnativeviewshot/a;->o:Ljava/lang/String;

    .line 216
    .line 217
    new-instance v4, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 221
    .line 222
    const-string v5, "Cannot PixelCopy for "

    .line 223
    .line 224
    .line 225
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    move-result-object v4

    .line 233
    .line 234
    .line 235
    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 236
    .line 237
    :cond_4
    :goto_3
    move-object/from16 v3, p1

    .line 238
    const/4 v10, 0x0

    .line 239
    .line 240
    goto/16 :goto_2

    .line 241
    .line 242
    :cond_5
    iget-object v0, v1, Lfr/greweb/reactnativeviewshot/a;->e:Ljava/lang/Integer;

    .line 243
    .line 244
    if-eqz v0, :cond_7

    .line 245
    .line 246
    iget-object v2, v1, Lfr/greweb/reactnativeviewshot/a;->f:Ljava/lang/Integer;

    .line 247
    .line 248
    if-eqz v2, :cond_7

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 252
    move-result v0

    .line 253
    .line 254
    if-ne v0, v9, :cond_6

    .line 255
    .line 256
    iget-object v0, v1, Lfr/greweb/reactnativeviewshot/a;->f:Ljava/lang/Integer;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 260
    move-result v0

    .line 261
    .line 262
    if-eq v0, v11, :cond_7

    .line 263
    .line 264
    :cond_6
    iget-object v0, v1, Lfr/greweb/reactnativeviewshot/a;->e:Ljava/lang/Integer;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 268
    move-result v0

    .line 269
    .line 270
    iget-object v2, v1, Lfr/greweb/reactnativeviewshot/a;->f:Ljava/lang/Integer;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 274
    move-result v2

    .line 275
    .line 276
    .line 277
    invoke-static {v13, v0, v2, v14}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 278
    move-result-object v0

    .line 279
    .line 280
    .line 281
    invoke-static {v13}, Lfr/greweb/reactnativeviewshot/a;->y(Landroid/graphics/Bitmap;)V

    .line 282
    move-object v13, v0

    .line 283
    .line 284
    :cond_7
    iget v0, v1, Lfr/greweb/reactnativeviewshot/a;->c:I

    .line 285
    const/4 v2, -0x1

    .line 286
    .line 287
    if-ne v2, v0, :cond_8

    .line 288
    .line 289
    instance-of v2, v8, Lfr/greweb/reactnativeviewshot/a$d;

    .line 290
    .line 291
    if-eqz v2, :cond_8

    .line 292
    mul-int/2addr v9, v11

    .line 293
    .line 294
    mul-int/lit8 v9, v9, 0x4

    .line 295
    .line 296
    .line 297
    invoke-static {v8}, Lfr/greweb/reactnativeviewshot/a;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    move-result-object v0

    .line 299
    .line 300
    check-cast v0, Lfr/greweb/reactnativeviewshot/a$d;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0, v9}, Lfr/greweb/reactnativeviewshot/a$d;->a(I)Ljava/nio/ByteBuffer;

    .line 304
    move-result-object v2

    .line 305
    .line 306
    .line 307
    invoke-virtual {v13, v2}, Landroid/graphics/Bitmap;->copyPixelsToBuffer(Ljava/nio/Buffer;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0, v9}, Lfr/greweb/reactnativeviewshot/a$d;->i(I)V

    .line 311
    goto :goto_4

    .line 312
    .line 313
    :cond_8
    sget-object v2, Lfr/greweb/reactnativeviewshot/a$c;->a:[Landroid/graphics/Bitmap$CompressFormat;

    .line 314
    .line 315
    aget-object v0, v2, v0

    .line 316
    .line 317
    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    .line 318
    .line 319
    iget-wide v4, v1, Lfr/greweb/reactnativeviewshot/a;->d:D

    .line 320
    mul-double/2addr v4, v2

    .line 321
    double-to-int v2, v4

    .line 322
    .line 323
    .line 324
    invoke-virtual {v13, v0, v2, v8}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 325
    .line 326
    .line 327
    :goto_4
    invoke-static {v13}, Lfr/greweb/reactnativeviewshot/a;->y(Landroid/graphics/Bitmap;)V

    .line 328
    return-object v12

    .line 329
    .line 330
    :cond_9
    new-instance v0, Ljava/lang/RuntimeException;

    .line 331
    .line 332
    const-string v2, "Impossible to snapshot the view: view is invalid"

    .line 333
    .line 334
    .line 335
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 336
    throw v0
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
.end method

.method public final t(Lcom/facebook/react/uimanager/NativeViewHierarchyManager;Lcom/facebook/react/fabric/interop/UIBlockViewResolver;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lfr/greweb/reactnativeviewshot/a;->n:Ljava/util/concurrent/Executor;

    .line 3
    .line 4
    new-instance v1, Lfr/greweb/reactnativeviewshot/a$a;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0, p2, p1}, Lfr/greweb/reactnativeviewshot/a$a;-><init>(Lfr/greweb/reactnativeviewshot/a;Lcom/facebook/react/fabric/interop/UIBlockViewResolver;Lcom/facebook/react/uimanager/NativeViewHierarchyManager;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

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

.method public final u(Landroid/view/View;)Ljava/util/List;
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    return-object v0

    .line 14
    .line 15
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    check-cast p1, Landroid/view/ViewGroup;

    .line 21
    const/4 v1, 0x0

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 25
    move-result v2

    .line 26
    .line 27
    if-ge v1, v2, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v2}, Lfr/greweb/reactnativeviewshot/a;->u(Landroid/view/View;)Ljava/util/List;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return-object v0
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

.method public final z(Landroid/view/View;)V
    .locals 6
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, -0x1

    .line 2
    .line 3
    iget v1, p0, Lfr/greweb/reactnativeviewshot/a;->c:I

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v2

    .line 10
    .line 11
    :goto_0
    const-string v1, "zip-base64"

    .line 12
    .line 13
    iget-object v3, p0, Lfr/greweb/reactnativeviewshot/a;->h:Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    move-result v1

    .line 18
    .line 19
    new-instance v3, Lfr/greweb/reactnativeviewshot/a$d;

    .line 20
    .line 21
    sget-object v4, Lfr/greweb/reactnativeviewshot/a;->p:[B

    .line 22
    .line 23
    .line 24
    invoke-direct {v3, v4}, Lfr/greweb/reactnativeviewshot/a$d;-><init>([B)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1, v3}, Lfr/greweb/reactnativeviewshot/a;->q(Landroid/view/View;Ljava/io/OutputStream;)Landroid/graphics/Point;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Lfr/greweb/reactnativeviewshot/a$d;->h()[B

    .line 32
    move-result-object v4

    .line 33
    .line 34
    sput-object v4, Lfr/greweb/reactnativeviewshot/a;->p:[B

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 38
    move-result v3

    .line 39
    .line 40
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 41
    .line 42
    iget v5, p1, Landroid/graphics/Point;->x:I

    .line 43
    .line 44
    .line 45
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    move-result-object v5

    .line 47
    .line 48
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    .line 55
    filled-new-array {v5, p1}, [Ljava/lang/Object;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    const-string v5, "%d:%d|"

    .line 59
    .line 60
    .line 61
    invoke-static {v4, v5, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    if-eqz v0, :cond_1

    .line 65
    goto :goto_1

    .line 66
    .line 67
    :cond_1
    const-string p1, ""

    .line 68
    :goto_1
    const/4 v0, 0x2

    .line 69
    .line 70
    if-eqz v1, :cond_3

    .line 71
    .line 72
    new-instance v1, Ljava/util/zip/Deflater;

    .line 73
    .line 74
    .line 75
    invoke-direct {v1}, Ljava/util/zip/Deflater;-><init>()V

    .line 76
    .line 77
    sget-object v4, Lfr/greweb/reactnativeviewshot/a;->p:[B

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v4, v2, v3}, Ljava/util/zip/Deflater;->setInput([BII)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/util/zip/Deflater;->finish()V

    .line 84
    .line 85
    new-instance v3, Lfr/greweb/reactnativeviewshot/a$d;

    .line 86
    .line 87
    const/16 v4, 0x20

    .line 88
    .line 89
    new-array v4, v4, [B

    .line 90
    .line 91
    .line 92
    invoke-direct {v3, v4}, Lfr/greweb/reactnativeviewshot/a$d;-><init>([B)V

    .line 93
    .line 94
    const/16 v4, 0x400

    .line 95
    .line 96
    new-array v4, v4, [B

    .line 97
    .line 98
    .line 99
    :goto_2
    invoke-virtual {v1}, Ljava/util/zip/Deflater;->finished()Z

    .line 100
    move-result v5

    .line 101
    .line 102
    if-nez v5, :cond_2

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v4}, Ljava/util/zip/Deflater;->deflate([B)I

    .line 106
    move-result v5

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3, v4, v2, v5}, Ljava/io/OutputStream;->write([BII)V

    .line 110
    goto :goto_2

    .line 111
    .line 112
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3}, Lfr/greweb/reactnativeviewshot/a$d;->h()[B

    .line 122
    move-result-object p1

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 126
    move-result v3

    .line 127
    .line 128
    .line 129
    invoke-static {p1, v2, v3, v0}, Landroid/util/Base64;->encodeToString([BIII)Ljava/lang/String;

    .line 130
    move-result-object p1

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    move-result-object p1

    .line 138
    goto :goto_3

    .line 139
    .line 140
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    sget-object p1, Lfr/greweb/reactnativeviewshot/a;->p:[B

    .line 149
    .line 150
    .line 151
    invoke-static {p1, v2, v3, v0}, Landroid/util/Base64;->encodeToString([BIII)Ljava/lang/String;

    .line 152
    move-result-object p1

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    move-result-object p1

    .line 160
    .line 161
    :goto_3
    iget-object v0, p0, Lfr/greweb/reactnativeviewshot/a;->i:Lcom/facebook/react/bridge/Promise;

    .line 162
    .line 163
    .line 164
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 165
    return-void
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
