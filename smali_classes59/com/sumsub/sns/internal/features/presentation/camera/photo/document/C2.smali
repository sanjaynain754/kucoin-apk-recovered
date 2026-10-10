.class public final Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;
.super Lcom/sumsub/sns/internal/features/presentation/camera/W;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic U:[Lkotlin/reflect/KProperty;


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public D:Z

.field public final E:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public F:Z

.field public final G:Lkotlinx/coroutines/flow/n;

.field public H:Z

.field public final I:Z

.field public final J:Ljava/util/List;

.field public final K:Z

.field public L:J

.field public M:Z

.field public N:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;

.field public final O:Lkotlinx/coroutines/channels/d;

.field public final P:Lkotlinx/coroutines/channels/d;

.field public Q:Z

.field public R:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/N;

.field public S:Z

.field public T:Z

.field public final k:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

.field public final l:Lcom/sumsub/sns/internal/ml/badphotos/c;

.field public final m:Lcom/sumsub/sns/internal/ml/docdetector/d;

.field public final n:Lcom/sumsub/sns/internal/ml/badphotos/e;

.field public final o:Lcom/sumsub/sns/internal/ml/autocapture/d;

.field public final p:Lcom/sumsub/sns/internal/ml/autocapture/g;

.field public final q:Landroidx/lifecycle/SavedStateHandle;

.field public r:Z

.field public final s:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public t:Z

.field public final u:Lkotlin/Lazy;

.field public final v:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final w:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final x:Lkotlin/Lazy;

.field public y:Ljava/io/File;

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;

    .line 3
    .line 4
    const-string v1, "collectedResults"

    .line 5
    .line 6
    const-string v2, "getCollectedResults()Ljava/util/List;"

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    const-string v2, "ffAutodocToggle"

    .line 14
    .line 15
    const-string v4, "getFfAutodocToggle()Z"

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    const-string/jumbo v4, "useLegacyCamera"

    .line 23
    .line 24
    const-string v5, "getUseLegacyCamera()Z"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 28
    move-result-object v4

    .line 29
    .line 30
    const-string v5, "autoCaptureRequired"

    .line 31
    .line 32
    const-string v6, "getAutoCaptureRequired()Z"

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v5, v6, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 36
    move-result-object v0

    .line 37
    const/4 v5, 0x4

    .line 38
    .line 39
    new-array v5, v5, [Lkotlin/reflect/KProperty;

    .line 40
    .line 41
    aput-object v1, v5, v3

    .line 42
    const/4 v1, 0x1

    .line 43
    .line 44
    aput-object v2, v5, v1

    .line 45
    const/4 v1, 0x2

    .line 46
    .line 47
    aput-object v4, v5, v1

    .line 48
    const/4 v1, 0x3

    .line 49
    .line 50
    aput-object v0, v5, v1

    .line 51
    .line 52
    sput-object v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->U:[Lkotlin/reflect/KProperty;

    .line 53
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/X;Ljava/lang/String;Ljava/lang/String;ZLcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/ml/badphotos/c;Lcom/sumsub/sns/internal/ml/docdetector/d;Lcom/sumsub/sns/internal/ml/badphotos/e;Lcom/sumsub/sns/internal/ml/autocapture/d;Lcom/sumsub/sns/internal/ml/autocapture/g;Landroidx/lifecycle/SavedStateHandle;)V
    .locals 8

    .line 1
    move-object v0, p0

    .line 2
    move-object v1, p1

    .line 3
    move-object v2, p2

    .line 4
    move-object v3, p3

    .line 5
    move v4, p4

    .line 6
    move-object v5, p5

    .line 7
    move-object v6, p6

    .line 8
    .line 9
    move-object/from16 v7, p12

    .line 10
    .line 11
    .line 12
    invoke-direct/range {v0 .. v7}, Lcom/sumsub/sns/internal/features/presentation/camera/W;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/X;Ljava/lang/String;Ljava/lang/String;ZLcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Landroidx/lifecycle/SavedStateHandle;)V

    .line 13
    .line 14
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->k:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->l:Lcom/sumsub/sns/internal/ml/badphotos/c;

    .line 17
    .line 18
    move-object/from16 p1, p8

    .line 19
    .line 20
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->m:Lcom/sumsub/sns/internal/ml/docdetector/d;

    .line 21
    .line 22
    move-object/from16 p1, p9

    .line 23
    .line 24
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->n:Lcom/sumsub/sns/internal/ml/badphotos/e;

    .line 25
    .line 26
    move-object/from16 p1, p10

    .line 27
    .line 28
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->o:Lcom/sumsub/sns/internal/ml/autocapture/d;

    .line 29
    .line 30
    move-object/from16 p1, p11

    .line 31
    .line 32
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->p:Lcom/sumsub/sns/internal/ml/autocapture/g;

    .line 33
    .line 34
    iput-object v7, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->q:Landroidx/lifecycle/SavedStateHandle;

    .line 35
    .line 36
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 40
    move-result-object p2

    .line 41
    .line 42
    const-string p3, "key_collected_results"

    .line 43
    const/4 p4, 0x0

    .line 44
    .line 45
    .line 46
    invoke-direct {p1, v7, p3, p2, p4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 47
    .line 48
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->s:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 49
    .line 50
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j3;

    .line 51
    .line 52
    .line 53
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j3;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->u:Lkotlin/Lazy;

    .line 60
    .line 61
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 62
    .line 63
    sget-object p2, Lcom/sumsub/sns/internal/ff/a;->t:Lcom/sumsub/sns/internal/ff/core/a;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    .line 67
    move-result p2

    .line 68
    .line 69
    .line 70
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 71
    move-result-object p2

    .line 72
    .line 73
    const-string p3, "ffAutodocToggle"

    .line 74
    const/4 p5, 0x1

    .line 75
    .line 76
    .line 77
    invoke-direct {p1, v7, p3, p2, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 78
    .line 79
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->v:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 80
    .line 81
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 82
    .line 83
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 84
    .line 85
    const-string p3, "key_use_legacy_camera"

    .line 86
    .line 87
    .line 88
    invoke-direct {p1, v7, p3, p2, p4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 89
    .line 90
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->w:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 91
    .line 92
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/k3;

    .line 93
    .line 94
    .line 95
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/k3;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;)V

    .line 96
    .line 97
    .line 98
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 99
    move-result-object p1

    .line 100
    .line 101
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->x:Lkotlin/Lazy;

    .line 102
    .line 103
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 104
    .line 105
    const-string p3, "autoCaptureRequired"

    .line 106
    .line 107
    .line 108
    invoke-direct {p1, v7, p3, p2, p4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 109
    .line 110
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->E:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 111
    .line 112
    new-instance p5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    .line 113
    .line 114
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O;

    .line 115
    const/4 p2, 0x0

    .line 116
    .line 117
    .line 118
    invoke-direct {p1, p2, p2, p2, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O;-><init>(Ljava/lang/Boolean;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Boolean;)V

    .line 119
    const/4 p3, 0x0

    .line 120
    const/4 v1, 0x0

    .line 121
    const/4 v2, 0x0

    .line 122
    const/4 v3, 0x0

    .line 123
    move-object p7, p1

    .line 124
    .line 125
    move-object/from16 p9, p3

    .line 126
    .line 127
    move-object/from16 p10, v1

    .line 128
    move-object p6, v2

    .line 129
    .line 130
    move-object/from16 p8, v3

    .line 131
    .line 132
    .line 133
    invoke-direct/range {p5 .. p10}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q;Lcom/sumsub/sns/core/presentation/base/m;)V

    .line 134
    .line 135
    .line 136
    invoke-static {p5}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 137
    move-result-object p1

    .line 138
    .line 139
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->G:Lkotlinx/coroutines/flow/n;

    .line 140
    .line 141
    const-string p1, "EXTRA_IS_RETAKE"

    .line 142
    .line 143
    .line 144
    invoke-virtual {v7, p1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 145
    move-result-object p1

    .line 146
    .line 147
    check-cast p1, Ljava/lang/Boolean;

    .line 148
    .line 149
    if-eqz p1, :cond_0

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 153
    move-result p1

    .line 154
    goto :goto_0

    .line 155
    :cond_0
    move p1, p4

    .line 156
    .line 157
    :goto_0
    iput-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->I:Z

    .line 158
    .line 159
    const-string p1, "EXTRA_DOCUMENT_SIDES"

    .line 160
    .line 161
    .line 162
    invoke-virtual {v7, p1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 163
    move-result-object p1

    .line 164
    .line 165
    check-cast p1, Ljava/util/List;

    .line 166
    .line 167
    if-eqz p1, :cond_2

    .line 168
    .line 169
    new-instance p3, Ljava/util/ArrayList;

    .line 170
    .line 171
    const/16 p5, 0xa

    .line 172
    .line 173
    .line 174
    invoke-static {p1, p5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 175
    move-result p5

    .line 176
    .line 177
    .line 178
    invoke-direct {p3, p5}, Ljava/util/ArrayList;-><init>(I)V

    .line 179
    .line 180
    .line 181
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 182
    move-result-object p1

    .line 183
    .line 184
    .line 185
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    move-result p5

    .line 187
    .line 188
    if-eqz p5, :cond_3

    .line 189
    .line 190
    .line 191
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    move-result-object p5

    .line 193
    .line 194
    check-cast p5, Ljava/lang/String;

    .line 195
    .line 196
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/f2;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    invoke-static {p5}, Lcom/sumsub/sns/internal/features/data/model/common/f2;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 203
    move-result-object p5

    .line 204
    .line 205
    if-nez p5, :cond_1

    .line 206
    .line 207
    sget-object p5, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 208
    .line 209
    .line 210
    :cond_1
    invoke-virtual {p3, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    goto :goto_1

    .line 212
    .line 213
    .line 214
    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 215
    move-result-object p3

    .line 216
    .line 217
    :cond_3
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->J:Ljava/util/List;

    .line 218
    .line 219
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->q:Landroidx/lifecycle/SavedStateHandle;

    .line 220
    .line 221
    const-string p3, "EXTRA_IS_SEAMLESS"

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1, p3}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 225
    move-result-object p1

    .line 226
    .line 227
    check-cast p1, Ljava/lang/Boolean;

    .line 228
    .line 229
    if-eqz p1, :cond_4

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 233
    move-result p1

    .line 234
    goto :goto_2

    .line 235
    :cond_4
    move p1, p4

    .line 236
    .line 237
    :goto_2
    iput-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->K:Z

    .line 238
    .line 239
    const-wide/high16 v1, -0x8000000000000000L

    .line 240
    .line 241
    iput-wide v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->L:J

    .line 242
    const/4 p1, 0x7

    .line 243
    .line 244
    .line 245
    invoke-static {p4, p2, p2, p1, p2}, Lkotlinx/coroutines/channels/g;->b(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/d;

    .line 246
    move-result-object p3

    .line 247
    .line 248
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->O:Lkotlinx/coroutines/channels/d;

    .line 249
    .line 250
    .line 251
    invoke-static {p4, p2, p2, p1, p2}, Lkotlinx/coroutines/channels/g;->b(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/d;

    .line 252
    move-result-object p1

    .line 253
    .line 254
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->P:Lkotlinx/coroutines/channels/d;

    .line 255
    return-void
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lcom/sumsub/sns/internal/core/presentation/camera/c;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m0;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m0;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m0;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m0;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 35
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m0;->d:I

    const/4 v3, 0x1

    const-string v4, " "

    const/4 v5, 0x3

    const/4 v6, 0x2

    if-eqz v2, :cond_4

    if-eq v2, v3, :cond_3

    if-eq v2, v6, :cond_2

    if-ne v2, v5, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_5

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m0;->a:Lcom/sumsub/sns/internal/core/presentation/camera/c;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 36
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m0;->a:Lcom/sumsub/sns/internal/core/presentation/camera/c;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m0;->d:I

    const-string/jumbo p2, "sns_seamless_error_general"

    invoke-virtual {p0, p2, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_4

    :cond_5
    :goto_1
    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_6

    move-object p2, v4

    .line 37
    :cond_6
    iget p1, p1, Lcom/sumsub/sns/internal/core/presentation/camera/c;->a:I

    const/4 v2, 0x0

    if-ne p1, v5, :cond_8

    .line 38
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m0;->a:Lcom/sumsub/sns/internal/core/presentation/camera/c;

    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m0;->d:I

    const-string/jumbo p1, "sns_seamless_error_notEnoughStorage"

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    goto :goto_4

    :cond_7
    :goto_2
    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_9

    goto :goto_6

    :cond_8
    const/16 v3, 0x9

    if-eq p1, v3, :cond_a

    if-ne p1, v6, :cond_9

    goto :goto_3

    :cond_9
    move-object v4, p2

    goto :goto_6

    .line 39
    :cond_a
    :goto_3
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m0;->a:Lcom/sumsub/sns/internal/core/presentation/camera/c;

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m0;->d:I

    const-string/jumbo p1, "sns_seamless_error_timeExceeded"

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_b

    :goto_4
    return-object v1

    :cond_b
    :goto_5
    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_9

    .line 40
    :goto_6
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/V;

    invoke-direct {p1, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/V;-><init>(Ljava/lang/String;)V

    .line 41
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/V;)V

    .line 42
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Landroid/content/Context;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/N;Landroid/graphics/Rect;Lkotlinx/coroutines/channels/d;)Lkotlin/Unit;
    .locals 12

    .line 57
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 58
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 59
    const-string/jumbo v1, "photo animation finished"

    const/4 v2, 0x0

    const-string v3, "DocCapture"

    invoke-virtual {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 60
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v4

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/W0;

    const/4 v11, 0x0

    move-object v6, p0

    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    move-object/from16 v10, p4

    invoke-direct/range {v5 .. v11}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/W0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Landroid/content/Context;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/N;Landroid/graphics/Rect;Lkotlinx/coroutines/channels/d;Lkotlin/coroutines/Continuation;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    move-object v7, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 61
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static a(Landroid/content/Context;Landroid/graphics/Bitmap;)V
    .locals 6

    const/4 v0, 0x0

    .line 298
    invoke-virtual {p0, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 299
    :cond_0
    new-instance v1, Ljava/io/File;

    .line 300
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "frame"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "_"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ".jpg"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 301
    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 302
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "saving to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 303
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 304
    iget-object v3, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 305
    const-string v4, "DocCapture"

    invoke-virtual {v3, v4, p0, v0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 306
    new-instance p0, Ljava/io/FileOutputStream;

    invoke-direct {p0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 307
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v3, 0x5a

    .line 308
    invoke-virtual {p1, v1, v3, p0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    move-result p1

    .line 309
    invoke-virtual {p0}, Ljava/io/OutputStream;->flush()V

    .line 310
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V

    if-eqz p1, :cond_1

    .line 311
    iget-object p0, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 312
    const-string/jumbo p1, "saved!"

    invoke-virtual {p0, v4, p1, v0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static final synthetic a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Ljava/io/File;)V
    .locals 0

    .line 43
    invoke-super {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/W;->a(Ljava/io/File;)V

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;)Z
    .locals 2

    .line 62
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->K:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 63
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->v:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->U:[Lkotlin/reflect/KProperty;

    aget-object v0, v0, v1

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_1

    .line 64
    :cond_0
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1a

    if-lt p0, v0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;
    .locals 2

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;

    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->o:Lcom/sumsub/sns/internal/ml/autocapture/d;

    const/4 v1, 0x0

    .line 3
    invoke-direct {v0, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;-><init>(Lcom/sumsub/sns/internal/ml/autocapture/d;I)V

    return-object v0
.end method

.method public static final c(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;)Lkotlin/Unit;
    .locals 11

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->C:Z

    .line 2
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 3
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 4
    const-string v2, "DocCapture"

    const-string/jumbo v3, "photo animation finished"

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 5
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/F0;

    invoke-direct {v1, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/F0;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v2, 0x1

    invoke-static {p0, v0, v1, v2, v4}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v5

    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/G0;

    invoke-direct {v8, p0, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/G0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final d(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;)Lkotlin/Unit;
    .locals 9

    .line 14
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->G:Lkotlinx/coroutines/flow/n;

    .line 15
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    const/4 v7, 0x0

    const/16 v8, 0x17

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q;Lcom/sumsub/sns/core/presentation/base/m;I)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 16
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 17
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->J:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/W;->a(Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;)V

    .line 18
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/W;->f:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "current_side"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "requestDocumentNextSide: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 20
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 21
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 22
    const-string v2, "DocCapture"

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K0;

    invoke-direct {v0, p0, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/Continuation;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p0, v1, v0, v2, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 24
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;Lcom/sumsub/sns/internal/ml/docdetector/a;Landroid/graphics/Bitmap;Z)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z;
    .locals 10

    .line 266
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->T:Z

    const-string v1, "DocCapture"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    .line 267
    sget-boolean v0, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    if-eqz v0, :cond_0

    .line 268
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "started tracking document bounds: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 269
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 270
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 271
    invoke-virtual {v3, v1, v0, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    if-eqz p4, :cond_1

    .line 272
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "detected bounds "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 273
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 274
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 275
    invoke-virtual {v3, v1, v0, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    const/4 v0, 0x1

    .line 276
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->T:Z

    .line 277
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->o:Lcom/sumsub/sns/internal/ml/autocapture/d;

    .line 278
    iget-boolean v0, v0, Lcom/sumsub/sns/internal/ml/autocapture/d;->b:Z

    if-eqz v0, :cond_2

    .line 279
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z;

    .line 280
    new-instance v4, Landroid/util/Size;

    .line 281
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 282
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p3

    .line 283
    invoke-direct {v4, v0, p3}, Landroid/util/Size;-><init>(II)V

    .line 284
    new-instance v5, Landroid/util/Size;

    .line 285
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->m:Lcom/sumsub/sns/internal/ml/docdetector/d;

    .line 286
    iget-object p3, p3, Lcom/sumsub/sns/internal/ml/docdetector/d;->h:Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 287
    iget-object p3, p3, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 288
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    move-result p3

    .line 289
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->m:Lcom/sumsub/sns/internal/ml/docdetector/d;

    .line 290
    iget-object v0, v0, Lcom/sumsub/sns/internal/ml/docdetector/d;->h:Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 291
    iget-object v0, v0, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 292
    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    .line 293
    invoke-direct {v5, p3, v0}, Landroid/util/Size;-><init>(II)V

    .line 294
    iget-boolean v7, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;->a:Z

    .line 295
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->o:Lcom/sumsub/sns/internal/ml/autocapture/d;

    .line 296
    iget-boolean v8, p1, Lcom/sumsub/sns/internal/ml/autocapture/d;->b:Z

    move-object v6, p2

    move v9, p4

    .line 297
    invoke-direct/range {v3 .. v9}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z;-><init>(Landroid/util/Size;Landroid/util/Size;Lcom/sumsub/sns/internal/ml/docdetector/a;ZZZ)V

    return-object v3

    :cond_2
    return-object v2
.end method

.method public final a(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    instance-of v6, v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;

    if-eqz v6, :cond_0

    move-object v6, v5

    check-cast v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;

    iget v7, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;->g:I

    const/high16 v8, -0x80000000

    and-int v9, v7, v8

    if-eqz v9, :cond_0

    sub-int/2addr v7, v8

    iput v7, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;->g:I

    goto :goto_0

    :cond_0
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;

    invoke-direct {v6, v0, v5}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v5, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;->e:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v7

    .line 350
    iget v8, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;->g:I

    const-string v9, "current_side"

    const-string v10, "DocCapture"

    const/4 v11, 0x2

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eqz v8, :cond_3

    if-eq v8, v14, :cond_2

    if-ne v8, v11, :cond_1

    iget-object v1, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;->c:Ljava/lang/Object;

    check-cast v1, Ljava/io/File;

    iget-object v1, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;->b:Landroid/graphics/Bitmap;

    iget-object v2, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;->a:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/Bitmap;

    invoke-static {v5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v1, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;->d:I

    iget-object v2, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;->c:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/Bitmap;

    iget-object v3, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;->b:Landroid/graphics/Bitmap;

    iget-object v4, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;->a:Ljava/lang/Object;

    check-cast v4, Landroid/content/Context;

    invoke-static {v5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v16, v3

    move v3, v1

    move-object v1, v4

    move-object v4, v5

    move-object v5, v2

    move-object/from16 v2, v16

    goto/16 :goto_4

    :cond_3
    invoke-static {v5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 351
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->o:Lcom/sumsub/sns/internal/ml/autocapture/d;

    .line 352
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v2, :cond_4

    .line 353
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v5

    .line 354
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v8

    .line 355
    sget-object v15, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 356
    invoke-static {v5, v8, v15}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 357
    new-instance v8, Landroid/graphics/Canvas;

    invoke-direct {v8, v5}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 358
    iget v15, v3, Landroid/graphics/Rect;->left:I

    mul-int/lit8 v15, v15, -0x1

    int-to-float v15, v15

    .line 359
    iget v3, v3, Landroid/graphics/Rect;->top:I

    mul-int/lit8 v3, v3, -0x1

    int-to-float v3, v3

    .line 360
    invoke-virtual {v8, v2, v15, v3, v13}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto :goto_1

    :cond_4
    move-object v5, v2

    :goto_1
    if-eqz v4, :cond_5

    .line 361
    iget-boolean v3, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T;->b:Z

    if-ne v3, v14, :cond_5

    move v3, v14

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    .line 362
    :goto_2
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v15, "taking picture, photo quality result="

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 363
    sget-object v8, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 364
    iget-object v8, v8, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 365
    invoke-virtual {v8, v10, v4, v13}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 366
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/W;->f:Landroidx/lifecycle/SavedStateHandle;

    invoke-virtual {v4, v9}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    if-eqz v4, :cond_6

    .line 367
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->getValue()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "_"

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_7

    :cond_6
    const-string v4, ""

    :cond_7
    if-eqz v3, :cond_8

    .line 368
    const-string v8, "autocapture_"

    goto :goto_3

    :cond_8
    move-object v8, v13

    :goto_3
    if-nez v8, :cond_9

    const-string v8, "manual_"

    :cond_9
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 369
    iput-object v1, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;->a:Ljava/lang/Object;

    iput-object v2, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;->b:Landroid/graphics/Bitmap;

    iput-object v5, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;->c:Ljava/lang/Object;

    iput v3, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;->d:I

    iput v14, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;->g:I

    .line 370
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    move-result-object v8

    new-instance v15, Lcom/sumsub/sns/internal/core/common/A0;

    invoke-direct {v15, v5, v4, v1, v13}, Lcom/sumsub/sns/internal/core/common/A0;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/content/Context;Lkotlin/coroutines/Continuation;)V

    invoke-static {v8, v15, v6}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v7, :cond_a

    goto :goto_7

    .line 371
    :cond_a
    :goto_4
    check-cast v4, Ljava/io/File;

    if-eqz v4, :cond_d

    if-eqz v3, :cond_b

    move v8, v14

    goto :goto_5

    :cond_b
    const/4 v8, 0x0

    .line 372
    :goto_5
    iget-object v15, v0, Lcom/sumsub/sns/internal/features/presentation/camera/W;->f:Landroidx/lifecycle/SavedStateHandle;

    invoke-virtual {v15, v9}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 373
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v12, "picture taken, isAutoCaptured="

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v8, ". Side - "

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 374
    sget-object v9, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 375
    iget-object v9, v9, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 376
    invoke-virtual {v9, v10, v8, v13}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz v3, :cond_c

    move v12, v14

    goto :goto_6

    :cond_c
    const/4 v12, 0x0

    .line 377
    :goto_6
    iput-object v2, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;->a:Ljava/lang/Object;

    iput-object v5, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;->b:Landroid/graphics/Bitmap;

    iput-object v4, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;->c:Ljava/lang/Object;

    iput v11, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;->g:I

    invoke-virtual {v0, v1, v4, v12, v6}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Landroid/content/Context;Ljava/io/File;ZLcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_d

    :goto_7
    return-object v7

    :cond_d
    move-object v1, v5

    .line 378
    :goto_8
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    .line 379
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 380
    :cond_e
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public final a(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    instance-of v4, v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;

    iget v5, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->j:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->j:I

    goto :goto_0

    :cond_0
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;

    invoke-direct {v4, v0, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v3, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->h:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v5

    .line 77
    iget v6, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->j:I

    const-string v7, " ms"

    const/4 v8, 0x5

    const/4 v9, 0x4

    const/4 v10, 0x3

    const/4 v11, 0x2

    const-string v12, "DocCapture"

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    if-eqz v6, :cond_6

    if-eq v6, v13, :cond_5

    if-eq v6, v11, :cond_4

    if-eq v6, v10, :cond_3

    if-eq v6, v9, :cond_2

    if-ne v6, v8, :cond_1

    iget-object v1, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->a:Ljava/lang/Object;

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$FrameHandleResult;

    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->c:Ljava/lang/Object;

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;

    iget-object v2, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->b:Ljava/lang/Object;

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$FrameHandleResult;

    iget-object v6, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->a:Ljava/lang/Object;

    check-cast v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;

    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_10

    :cond_3
    iget v1, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->g:I

    iget v2, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->f:I

    iget-object v6, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->c:Ljava/lang/Object;

    check-cast v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;

    iget-object v10, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->b:Ljava/lang/Object;

    check-cast v10, Landroid/graphics/Rect;

    iget-object v11, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->a:Ljava/lang/Object;

    check-cast v11, Landroid/content/Context;

    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_4
    iget-wide v1, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->e:J

    iget-boolean v6, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->d:Z

    iget-object v11, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->c:Ljava/lang/Object;

    check-cast v11, Landroid/graphics/Rect;

    iget-object v8, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->b:Ljava/lang/Object;

    check-cast v8, Landroid/graphics/Bitmap;

    iget-object v9, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->a:Ljava/lang/Object;

    check-cast v9, Landroid/content/Context;

    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-wide/from16 v22, v1

    move-object v2, v8

    move-object v1, v9

    move-wide/from16 v8, v22

    goto/16 :goto_2

    :cond_5
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_6
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 78
    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->t:Z

    if-eqz v3, :cond_7

    .line 79
    iput-boolean v15, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->t:Z

    .line 80
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v16

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u0;

    invoke-direct {v3, v0, v14}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/Continuation;)V

    const/16 v20, 0x3

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v3

    invoke-static/range {v16 .. v21}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 81
    :cond_7
    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->r:Z

    if-eqz v3, :cond_8

    .line 82
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$FrameHandleResult;->RELEASED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$FrameHandleResult;

    return-object v1

    .line 83
    :cond_8
    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->S:Z

    if-eqz v3, :cond_9

    .line 84
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;->SKIPPED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;)V

    .line 85
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$FrameHandleResult;->RELEASED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$FrameHandleResult;

    return-object v1

    .line 86
    :cond_9
    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->H:Z

    if-eqz v3, :cond_b

    .line 87
    iput v13, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->j:I

    invoke-virtual {v0, v1, v2, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->b(Landroid/content/Context;Landroid/graphics/Bitmap;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_a

    goto/16 :goto_11

    .line 88
    :cond_a
    :goto_1
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;->CAPTURED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;)V

    .line 89
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$FrameHandleResult;->RELEASED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$FrameHandleResult;

    return-object v1

    .line 90
    :cond_b
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->G:Lkotlinx/coroutines/flow/n;

    .line 91
    invoke-interface {v3}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    .line 92
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O;

    .line 93
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O;->a:Ljava/lang/Boolean;

    .line 94
    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    .line 95
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;->SKIPPED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;)V

    .line 96
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$FrameHandleResult;->RELEASED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$FrameHandleResult;

    return-object v1

    .line 97
    :cond_c
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->m:Lcom/sumsub/sns/internal/ml/docdetector/d;

    .line 98
    iget-boolean v3, v3, Lcom/sumsub/sns/internal/ml/core/h;->f:Z

    if-eqz v3, :cond_d

    .line 99
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v16

    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/V0;

    invoke-direct {v1, v0, v15, v14}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/V0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;ZLkotlin/coroutines/Continuation;)V

    const/16 v20, 0x3

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v1

    invoke-static/range {v16 .. v21}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 100
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;->SKIPPED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;)V

    .line 101
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$FrameHandleResult;->RELEASED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$FrameHandleResult;

    return-object v1

    .line 102
    :cond_d
    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->S:Z

    if-nez v3, :cond_24

    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->z:Z

    if-eqz v3, :cond_e

    goto/16 :goto_12

    .line 103
    :cond_e
    iget-boolean v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->Q:Z

    .line 104
    iput-boolean v15, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->Q:Z

    .line 105
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 106
    invoke-static {}, Lkotlinx/coroutines/z0;->a()Lkotlinx/coroutines/j0;

    move-result-object v3

    new-instance v10, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v0;

    invoke-direct {v10, v0, v2, v6, v14}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Landroid/graphics/Bitmap;ZLkotlin/coroutines/Continuation;)V

    iput-object v1, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->a:Ljava/lang/Object;

    iput-object v2, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->b:Ljava/lang/Object;

    move-object/from16 v13, p3

    iput-object v13, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->c:Ljava/lang/Object;

    iput-boolean v6, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->d:Z

    iput-wide v8, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->e:J

    iput v11, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->j:I

    invoke-static {v3, v10, v4}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_f

    goto/16 :goto_11

    :cond_f
    move-object v11, v13

    .line 107
    :goto_2
    check-cast v3, Lcom/sumsub/sns/internal/ml/docdetector/a;

    if-eqz v3, :cond_11

    .line 108
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v10

    int-to-float v10, v10

    iget-object v13, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->m:Lcom/sumsub/sns/internal/ml/docdetector/d;

    .line 109
    iget-object v13, v13, Lcom/sumsub/sns/internal/ml/docdetector/d;->h:Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 110
    iget-object v13, v13, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 111
    invoke-virtual {v13}, Landroid/util/Size;->getWidth()I

    move-result v13

    int-to-float v13, v13

    div-float/2addr v10, v13

    .line 112
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v13

    int-to-float v13, v13

    iget-object v14, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->m:Lcom/sumsub/sns/internal/ml/docdetector/d;

    .line 113
    iget-object v14, v14, Lcom/sumsub/sns/internal/ml/docdetector/d;->h:Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 114
    iget-object v14, v14, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 115
    invoke-virtual {v14}, Landroid/util/Size;->getHeight()I

    move-result v14

    int-to-float v14, v14

    div-float/2addr v13, v14

    .line 116
    iget-object v14, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->x:Lkotlin/Lazy;

    invoke-interface {v14}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;

    .line 117
    invoke-virtual {v14, v10, v13, v11, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;->a(FFLandroid/graphics/Rect;Lcom/sumsub/sns/internal/ml/docdetector/a;)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;

    move-result-object v14

    if-eqz v6, :cond_10

    .line 118
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/ml/docdetector/a;->a()Landroid/graphics/Rect;

    move-result-object v15

    invoke-static {v15, v10, v13}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i;->a(Landroid/graphics/Rect;FF)Landroid/graphics/Rect;

    move-result-object v10

    .line 119
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v13

    .line 120
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v15

    move-wide/from16 p1, v8

    .line 121
    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 122
    invoke-static {v13, v15, v8}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v8

    .line 123
    new-instance v9, Landroid/graphics/Canvas;

    invoke-direct {v9, v8}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    const/4 v13, 0x0

    .line 124
    invoke-virtual {v8, v13}, Landroid/graphics/Bitmap;->eraseColor(I)V

    const/4 v13, 0x0

    const/4 v15, 0x0

    .line 125
    invoke-virtual {v9, v2, v13, v13, v15}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 126
    new-instance v13, Landroid/graphics/Paint;

    invoke-direct {v13}, Landroid/graphics/Paint;-><init>()V

    const v15, -0xff0100

    .line 127
    invoke-virtual {v13, v15}, Landroid/graphics/Paint;->setColor(I)V

    .line 128
    sget-object v15, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v13, v15}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 129
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v15

    move-object/from16 p3, v14

    sget v14, Lcom/sumsub/sns/R$dimen;->sns_frame_stroke_width:I

    invoke-virtual {v15, v14}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v14

    int-to-float v14, v14

    invoke-virtual {v13, v14}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 130
    invoke-virtual {v9, v10, v13}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    const/high16 v10, -0x10000

    .line 131
    invoke-virtual {v13, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 132
    invoke-virtual {v9, v11, v13}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 133
    invoke-static {v1, v8}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Landroid/content/Context;Landroid/graphics/Bitmap;)V

    .line 134
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_3

    :cond_10
    move-wide/from16 p1, v8

    move-object/from16 p3, v14

    :goto_3
    move-object/from16 v8, p3

    goto :goto_4

    :cond_11
    move-wide/from16 p1, v8

    const/4 v8, 0x0

    :goto_4
    if-eqz v8, :cond_12

    if-eqz v3, :cond_12

    .line 135
    invoke-virtual {v0, v8, v3, v2, v6}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;Lcom/sumsub/sns/internal/ml/docdetector/a;Landroid/graphics/Bitmap;Z)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z;

    move-result-object v3

    if-eqz v3, :cond_13

    .line 136
    invoke-virtual {v0, v3}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    goto :goto_5

    .line 137
    :cond_12
    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->T:Z

    if-eqz v3, :cond_13

    .line 138
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 139
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 140
    const-string v6, "lost document bounds"

    const/4 v15, 0x0

    invoke-virtual {v3, v12, v6, v15}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v13, 0x0

    .line 141
    iput-boolean v13, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->T:Z

    .line 142
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->x:Lkotlin/Lazy;

    invoke-interface {v3}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;

    .line 143
    iput-boolean v13, v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;->c:Z

    .line 144
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/S;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/S;

    .line 145
    invoke-virtual {v0, v3}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 146
    :cond_13
    :goto_5
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->R:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/N;

    if-eqz v3, :cond_14

    const/4 v6, 0x1

    goto :goto_6

    :cond_14
    const/4 v6, 0x0

    :goto_6
    if-eqz v8, :cond_15

    .line 147
    iget-boolean v9, v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;->a:Z

    const/4 v10, 0x1

    if-ne v9, v10, :cond_15

    .line 148
    iget-object v9, v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;

    .line 149
    sget-object v10, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;->OK:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;

    if-ne v9, v10, :cond_15

    const/4 v9, 0x1

    goto :goto_7

    :cond_15
    const/4 v9, 0x0

    :goto_7
    if-eqz v9, :cond_17

    .line 150
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    sub-long v13, v13, p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "docDetector took "

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 151
    sget-object v10, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 152
    iget-object v10, v10, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    const/4 v15, 0x0

    .line 153
    invoke-virtual {v10, v12, v3, v15}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 154
    iput-object v1, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->a:Ljava/lang/Object;

    iput-object v11, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->b:Ljava/lang/Object;

    iput-object v8, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->c:Ljava/lang/Object;

    iput v6, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->f:I

    iput v9, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->g:I

    const/4 v3, 0x3

    iput v3, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->j:I

    invoke-virtual {v0, v1, v2, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Landroid/content/Context;Landroid/graphics/Bitmap;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_16

    goto/16 :goto_11

    :cond_16
    move v2, v6

    move-object v6, v8

    move-object v10, v11

    move-object v11, v1

    move v1, v9

    :goto_8
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    move v9, v1

    move v13, v3

    move-object v8, v6

    move-object v1, v11

    move v6, v2

    move-object v11, v10

    goto :goto_9

    :cond_17
    const/4 v13, 0x0

    .line 155
    iput-boolean v13, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->M:Z

    if-eqz v3, :cond_18

    .line 156
    iget-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/N;->a:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_18

    .line 157
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    :cond_18
    const/4 v15, 0x0

    .line 158
    iput-object v15, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->R:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/N;

    const/4 v13, 0x0

    :goto_9
    if-eqz v13, :cond_19

    .line 159
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$FrameHandleResult;->TAKEN:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$FrameHandleResult;

    goto :goto_a

    .line 160
    :cond_19
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$FrameHandleResult;->RELEASED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$FrameHandleResult;

    .line 161
    :goto_a
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;->SKIPPED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;

    if-eqz v9, :cond_22

    if-eqz v13, :cond_1a

    if-nez v6, :cond_1a

    .line 162
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->N:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;

    sget-object v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;->FOCUSING:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;

    if-ne v3, v6, :cond_1a

    const/4 v13, 0x1

    goto :goto_b

    :cond_1a
    const/4 v13, 0x0

    .line 163
    :goto_b
    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->M:Z

    if-eqz v3, :cond_1c

    if-eqz v13, :cond_1b

    goto :goto_c

    :cond_1b
    const/4 v10, 0x1

    goto :goto_d

    .line 164
    :cond_1c
    :goto_c
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 165
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 166
    const-string/jumbo v6, "started waiting for better photo"

    const/4 v15, 0x0

    invoke-virtual {v3, v12, v6, v15}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 167
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    iput-wide v9, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->L:J

    const/4 v10, 0x1

    .line 168
    iput-boolean v10, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->M:Z

    .line 169
    :goto_d
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    move-object v6, v11

    iget-wide v10, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->L:J

    sub-long/2addr v13, v10

    .line 170
    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->M:Z

    if-eqz v3, :cond_1d

    .line 171
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->o:Lcom/sumsub/sns/internal/ml/autocapture/d;

    .line 172
    iget-wide v9, v3, Lcom/sumsub/sns/internal/ml/autocapture/d;->c:J

    cmp-long v3, v13, v9

    if-ltz v3, :cond_1d

    const/16 v17, 0x1

    goto :goto_e

    :cond_1d
    const/16 v17, 0x0

    :goto_e
    if-eqz v17, :cond_20

    .line 173
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->N:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;

    sget-object v9, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;->FOCUSING:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;

    if-eq v3, v9, :cond_20

    const/4 v3, 0x0

    .line 174
    iput-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->M:Z

    .line 175
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v10, "timeout waiting for better photo after: "

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 176
    sget-object v7, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 177
    iget-object v7, v7, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    const/4 v15, 0x0

    .line 178
    invoke-virtual {v7, v12, v3, v15}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 179
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->R:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/N;

    if-eqz v3, :cond_1f

    .line 180
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;->CAPTURED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;

    .line 181
    sget-object v7, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$FrameHandleResult;->RELEASED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$FrameHandleResult;

    .line 182
    iput-object v8, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->a:Ljava/lang/Object;

    iput-object v7, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->b:Ljava/lang/Object;

    iput-object v2, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->c:Ljava/lang/Object;

    const/4 v9, 0x4

    iput v9, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->j:I

    invoke-virtual {v0, v1, v6, v3, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Landroid/content/Context;Landroid/graphics/Rect;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/N;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_1e

    goto :goto_11

    :cond_1e
    move-object v1, v2

    move-object v2, v7

    :goto_f
    move-object v6, v8

    goto :goto_10

    :cond_1f
    move-object v6, v8

    move-object v1, v9

    goto :goto_10

    :cond_20
    if-eqz v17, :cond_21

    .line 183
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;->FOCUSING:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;

    goto :goto_f

    .line 184
    :cond_21
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;->WAITING:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;

    goto :goto_f

    :cond_22
    move-object v1, v3

    goto :goto_f

    .line 185
    :goto_10
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;)V

    .line 186
    iput-object v2, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->a:Ljava/lang/Object;

    const/4 v15, 0x0

    iput-object v15, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->b:Ljava/lang/Object;

    iput-object v15, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->c:Ljava/lang/Object;

    const/4 v3, 0x5

    iput v3, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;->j:I

    invoke-virtual {v0, v6, v1, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_23

    :goto_11
    return-object v5

    :cond_23
    return-object v2

    .line 187
    :cond_24
    :goto_12
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;->SKIPPED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;)V

    .line 188
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$FrameHandleResult;->RELEASED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$FrameHandleResult;

    return-object v1
.end method

.method public final a(Landroid/content/Context;Landroid/graphics/Bitmap;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i0;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i0;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i0;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i0;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 250
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i0;->e:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i0;->b:Landroid/graphics/Bitmap;

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i0;->a:Landroid/content/Context;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 251
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i0;->a:Landroid/content/Context;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i0;->b:Landroid/graphics/Bitmap;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i0;->e:I

    .line 252
    invoke-virtual {p0, p2, v3, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Landroid/graphics/Bitmap;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    .line 253
    :cond_3
    :goto_1
    check-cast p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T;

    if-eqz p3, :cond_4

    .line 254
    iget-object v0, p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T;->a:Ljava/lang/Float;

    if-eqz v0, :cond_4

    .line 255
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_2

    :cond_4
    const/high16 v0, -0x40800000    # -1.0f

    .line 256
    :goto_2
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->n:Lcom/sumsub/sns/internal/ml/badphotos/e;

    .line 257
    iget v1, v1, Lcom/sumsub/sns/internal/ml/badphotos/e;->b:F

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_5

    if-eqz p3, :cond_5

    .line 258
    invoke-virtual {p0, p1, p2, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Landroid/content/Context;Landroid/graphics/Bitmap;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T;)Z

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 259
    :cond_5
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final a(Landroid/content/Context;Landroid/graphics/Rect;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/N;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t0;)Ljava/lang/Object;
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    .line 244
    invoke-static {v2, v0, v0, v1, v0}, Lkotlinx/coroutines/channels/g;->b(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/d;

    move-result-object v8

    .line 245
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a0;

    .line 246
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m3;

    move-object v4, p0

    move-object v5, p1

    move-object v7, p2

    move-object v6, p3

    invoke-direct/range {v3 .. v8}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m3;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Landroid/content/Context;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/N;Landroid/graphics/Rect;Lkotlinx/coroutines/channels/d;)V

    .line 247
    invoke-direct {v0, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 248
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 249
    invoke-interface {v8, p4}, Lkotlinx/coroutines/channels/o;->D(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Landroid/content/Context;Ljava/io/File;ZLcom/sumsub/sns/internal/features/presentation/camera/photo/document/X0;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    .line 1
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/W;->f:Landroidx/lifecycle/SavedStateHandle;

    const-string v4, "current_side"

    invoke-virtual {v3, v4}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 2
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Picture is taken. Side - "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 3
    sget-object v5, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 4
    iget-object v5, v5, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 5
    const-string v6, "DocCapture"

    const/4 v7, 0x0

    invoke-virtual {v5, v6, v3, v7}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    new-instance v8, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 7
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/W;->f:Landroidx/lifecycle/SavedStateHandle;

    invoke-virtual {v3, v4}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 8
    invoke-static/range {p3 .. p3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v14

    const/4 v15, 0x0

    const/16 v16, 0x3ac

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v10, p2

    move-object/from16 v9, p2

    .line 9
    invoke-direct/range {v8 .. v16}, Lcom/sumsub/sns/internal/features/data/model/common/T;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;Ljava/lang/Boolean;Lcom/sumsub/sns/internal/features/data/model/common/S;I)V

    .line 10
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->i()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v3

    .line 11
    invoke-interface {v3, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->s:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->U:[Lkotlin/reflect/KProperty;

    const/4 v6, 0x0

    aget-object v5, v5, v6

    .line 13
    iget-object v5, v4, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 14
    iget-object v4, v4, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v5, v4, v3}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->K:Z

    const/4 v4, 0x1

    if-nez v3, :cond_0

    .line 16
    invoke-virtual {v0, v4}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    .line 17
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z0;

    invoke-direct {v1, v7}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z0;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v6, v1, v4, v7}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    const/16 v5, 0xd

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, v8

    .line 18
    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 19
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 20
    :cond_0
    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->B:Z

    .line 21
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->J:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_4

    .line 22
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->J:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->i()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-gt v5, v6, :cond_1

    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->i()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ne v5, v4, :cond_3

    if-nez v3, :cond_3

    .line 24
    invoke-virtual {v0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Landroid/content/Context;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_2

    return-object v1

    .line 25
    :cond_2
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 26
    :cond_3
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v2

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B0;

    invoke-direct {v5, v0, v7}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 27
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 28
    :cond_4
    :goto_0
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->i()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ne v5, v4, :cond_6

    if-nez v3, :cond_6

    .line 29
    invoke-virtual {v0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->b(Landroid/content/Context;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_5

    return-object v1

    .line 30
    :cond_5
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 31
    :cond_6
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v2

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A0;

    invoke-direct {v5, v0, v7}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 32
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public final a(Landroid/content/Context;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q0;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q0;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q0;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q0;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 381
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q0;->c:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlinx/coroutines/channels/ChannelResult;

    invoke-virtual {p2}, Lkotlinx/coroutines/channels/ChannelResult;->l()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 382
    iput-boolean v4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->S:Z

    .line 383
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/r0;

    invoke-direct {p2, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/r0;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v2, 0x0

    invoke-static {p0, v2, p2, v4, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 384
    iget-boolean p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->K:Z

    if-eqz p2, :cond_3

    .line 385
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->y:Ljava/io/File;

    if-nez p2, :cond_3

    .line 386
    iput-boolean v4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->r:Z

    .line 387
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Landroid/content/Context;)V

    .line 388
    :cond_3
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->O:Lkotlinx/coroutines/channels/d;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q0;->c:I

    invoke-interface {p1, v0}, Lkotlinx/coroutines/channels/o;->p(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    .line 389
    :cond_4
    :goto_1
    invoke-static {p1}, Lkotlinx/coroutines/channels/ChannelResult;->i(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 390
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 391
    :cond_5
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v0

    move-object p1, v3

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/s0;

    invoke-direct {v3, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/s0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 392
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Landroid/graphics/Bitmap;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g0;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g0;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g0;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g0;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 425
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g0;->e:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g0;->b:J

    iget-boolean v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g0;->a:Z

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 426
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 427
    iget-boolean p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->D:Z

    if-eqz p3, :cond_4

    .line 428
    invoke-static {}, Lkotlinx/coroutines/z0;->a()Lkotlinx/coroutines/j0;

    move-result-object p3

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/h0;

    invoke-direct {v2, p0, p1, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/h0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)V

    iput-boolean p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g0;->a:Z

    iput-wide v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g0;->b:J

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g0;->e:I

    invoke-static {p3, v2, v0}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move v0, p2

    move-wide p1, v5

    :goto_1
    check-cast p3, Lcom/sumsub/sns/internal/ml/core/n;

    move-wide v5, p1

    move p2, v0

    goto :goto_2

    .line 429
    :cond_4
    new-instance p3, Lcom/sumsub/sns/internal/ml/core/k;

    invoke-direct {p3}, Lcom/sumsub/sns/internal/ml/core/k;-><init>()V

    .line 430
    :goto_2
    instance-of p1, p3, Lcom/sumsub/sns/internal/ml/core/l;

    if-eqz p1, :cond_5

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/ml/core/l;

    goto :goto_3

    :cond_5
    move-object v0, v4

    .line 431
    :goto_3
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->B:Z

    const-string v2, "DocCapture"

    if-nez v1, :cond_6

    .line 432
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "badPhotos result: "

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 433
    sget-object v7, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 434
    iget-object v7, v7, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 435
    invoke-virtual {v7, v2, v1, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    if-eqz v0, :cond_7

    .line 436
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sub-long/2addr v7, v5

    .line 437
    iget-object v1, v0, Lcom/sumsub/sns/internal/ml/core/l;->a:Ljava/lang/Object;

    .line 438
    check-cast v1, Lcom/sumsub/sns/internal/ml/badphotos/models/a;

    .line 439
    iget v1, v1, Lcom/sumsub/sns/internal/ml/badphotos/models/a;->a:F

    .line 440
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "badPhotoDetector took "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " ms, score="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 441
    sget-object v5, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 442
    iget-object v5, v5, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 443
    invoke-virtual {v5, v2, v1, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 444
    iget-object v1, v0, Lcom/sumsub/sns/internal/ml/core/l;->a:Ljava/lang/Object;

    .line 445
    check-cast v1, Lcom/sumsub/sns/internal/ml/badphotos/models/a;

    .line 446
    iget v1, v1, Lcom/sumsub/sns/internal/ml/badphotos/models/a;->a:F

    goto :goto_4

    :cond_7
    const/high16 v1, -0x40800000    # -1.0f

    .line 447
    :goto_4
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->n:Lcom/sumsub/sns/internal/ml/badphotos/e;

    .line 448
    iget v2, v2, Lcom/sumsub/sns/internal/ml/badphotos/e;->b:F

    cmpl-float v2, v1, v2

    if-ltz v2, :cond_8

    move v2, v3

    goto :goto_5

    :cond_8
    const/4 v2, 0x0

    .line 449
    :goto_5
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/b0;

    if-eqz p1, :cond_9

    .line 450
    check-cast p3, Lcom/sumsub/sns/internal/ml/core/l;

    goto :goto_6

    :cond_9
    move-object p3, v4

    :goto_6
    if-eqz p3, :cond_a

    .line 451
    iget-object p1, p3, Lcom/sumsub/sns/internal/ml/core/l;->a:Ljava/lang/Object;

    .line 452
    check-cast p1, Lcom/sumsub/sns/internal/ml/badphotos/models/a;

    if-eqz p1, :cond_a

    .line 453
    iget-wide v6, p1, Lcom/sumsub/sns/internal/ml/badphotos/models/a;->b:J

    goto :goto_7

    :cond_a
    const-wide/16 v6, -0x1

    .line 454
    :goto_7
    invoke-direct {v5, v2, v1, v6, v7}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/b0;-><init>(ZFJ)V

    .line 455
    invoke-virtual {p0, v5}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 456
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T;

    if-eqz v0, :cond_b

    .line 457
    iget-object p3, v0, Lcom/sumsub/sns/internal/ml/core/l;->a:Ljava/lang/Object;

    .line 458
    check-cast p3, Lcom/sumsub/sns/internal/ml/badphotos/models/a;

    if-eqz p3, :cond_b

    .line 459
    iget p3, p3, Lcom/sumsub/sns/internal/ml/badphotos/models/a;->a:F

    .line 460
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    move-result-object p3

    goto :goto_8

    :cond_b
    move-object p3, v4

    .line 461
    :goto_8
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->n:Lcom/sumsub/sns/internal/ml/badphotos/e;

    .line 462
    iget v2, v0, Lcom/sumsub/sns/internal/ml/badphotos/e;->c:F

    .line 463
    iget v0, v0, Lcom/sumsub/sns/internal/ml/badphotos/e;->b:F

    .line 464
    invoke-direct {p1, p3, v3, v2, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T;-><init>(Ljava/lang/Float;ZFF)V

    const/4 p3, 0x0

    cmpl-float p3, v1, p3

    if-gtz p3, :cond_d

    if-eqz p2, :cond_c

    goto :goto_9

    :cond_c
    return-object v4

    :cond_d
    :goto_9
    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Y0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Y0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Y0;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Y0;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Y0;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Y0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Y0;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 234
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Y0;->c:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_4

    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    const/4 p3, 0x0

    if-nez p1, :cond_7

    .line 235
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;

    .line 236
    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;->SMALL:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;

    .line 237
    invoke-direct {p1, p3, p2, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;-><init>(ZLcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;Z)V

    .line 238
    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Y0;->c:I

    invoke-virtual {p0, p1, p3, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_6

    goto :goto_5

    :cond_6
    :goto_1
    check-cast p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;

    :goto_2
    move-object v3, p3

    goto :goto_7

    .line 239
    :cond_7
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;->SKIPPED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;

    if-ne p2, v2, :cond_9

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Y0;->c:I

    invoke-virtual {p0, p1, p3, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_8

    goto :goto_5

    :cond_8
    :goto_3
    check-cast p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;

    goto :goto_2

    .line 240
    :cond_9
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;->FOCUSING:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;

    if-ne p2, v2, :cond_b

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Y0;->c:I

    invoke-virtual {p0, p1, v6, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_a

    goto :goto_5

    :cond_a
    :goto_4
    check-cast p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;

    goto :goto_2

    .line 241
    :cond_b
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;->WAITING:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;

    if-ne p2, v2, :cond_d

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Y0;->c:I

    invoke-virtual {p0, p1, p3, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_c

    :goto_5
    return-object v1

    :cond_c
    :goto_6
    check-cast p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;

    goto :goto_2

    :cond_d
    const/4 p3, 0x0

    goto :goto_2

    :goto_7
    if-eqz v3, :cond_e

    .line 242
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->G:Lkotlinx/coroutines/flow/n;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    const/4 v5, 0x0

    const/16 v6, 0x1b

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q;Lcom/sumsub/sns/core/presentation/base/m;I)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    move-result-object p2

    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 243
    :cond_e
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 313
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->e:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    const-string v5, " "

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->b:I

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_1
    iget p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->b:I

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_2
    iget p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->b:I

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_3
    iget p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->b:I

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_4
    iget p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->b:I

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_5
    iget p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->b:I

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_6
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 314
    sget-object p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;->INVALID:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;

    .line 315
    iget-boolean v2, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;->a:Z

    const-string/jumbo v6, "sns_autocapture_hint_moveOut"

    if-eqz v2, :cond_a

    .line 316
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;

    .line 317
    sget-object p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d0;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p3, p1

    const/4 p3, 0x2

    if-eq p1, v4, :cond_6

    const/4 p2, 0x3

    if-eq p1, p3, :cond_4

    if-ne p1, p2, :cond_3

    .line 318
    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;->INTERMEDIATE:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;

    .line 319
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->b:I

    const/4 p1, 0x4

    iput p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->e:I

    invoke-virtual {p0, v6, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_1

    goto/16 :goto_6

    :cond_1
    move p1, v3

    :goto_1
    check-cast p3, Ljava/lang/String;

    if-nez p3, :cond_2

    goto/16 :goto_8

    :cond_2
    move-object v5, p3

    goto/16 :goto_8

    .line 320
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 321
    :cond_4
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;->INTERMEDIATE:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;

    .line 322
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->b:I

    iput p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->e:I

    const-string/jumbo p2, "sns_autocapture_hint_moveIn"

    invoke-virtual {p0, p2, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    goto/16 :goto_6

    :cond_5
    move-object p2, p1

    move p1, v3

    :goto_2
    check-cast p3, Ljava/lang/String;

    if-nez p3, :cond_2

    goto/16 :goto_8

    .line 323
    :cond_6
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;->OK:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;

    if-eqz p2, :cond_8

    .line 324
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->b:I

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->e:I

    const-string/jumbo p2, "sns_autocapture_hint_keepFocusing"

    invoke-virtual {p0, p2, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_7

    goto :goto_6

    :cond_7
    move-object p2, p1

    move p1, v3

    :goto_3
    check-cast p3, Ljava/lang/String;

    if-nez p3, :cond_2

    goto :goto_8

    .line 325
    :cond_8
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->b:I

    iput p3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->e:I

    const-string/jumbo p2, "sns_autocapture_hint_holdLikeThis"

    invoke-virtual {p0, p2, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_9

    goto :goto_6

    :cond_9
    move-object p2, p1

    move p1, v4

    :goto_4
    check-cast p3, Ljava/lang/String;

    if-nez p3, :cond_2

    goto :goto_8

    .line 326
    :cond_a
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;

    .line 327
    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;->BIG:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;

    if-ne p1, p2, :cond_c

    .line 328
    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;->INTERMEDIATE:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;

    .line 329
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->b:I

    const/4 p1, 0x5

    iput p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->e:I

    invoke-virtual {p0, v6, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_b

    goto :goto_6

    :cond_b
    move p1, v3

    :goto_5
    check-cast p3, Ljava/lang/String;

    if-nez p3, :cond_2

    goto :goto_8

    .line 330
    :cond_c
    iput-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->b:I

    const/4 p1, 0x6

    iput p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e0;->e:I

    const-string/jumbo p1, "sns_autocapture_hint_targetAt"

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_d

    :goto_6
    return-object v1

    :cond_d
    move-object p2, p3

    move-object p3, p1

    move p1, v3

    :goto_7
    check-cast p3, Ljava/lang/String;

    if-nez p3, :cond_2

    .line 331
    :goto_8
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;

    if-eqz p1, :cond_e

    move v3, v4

    :cond_e
    invoke-direct {p3, v5, v3, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;-><init>(Ljava/lang/String;ZLcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;)V

    return-object p3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;
    .locals 1

    .line 393
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l3;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l3;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;)V

    invoke-virtual {p0, v0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/L0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/L0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/L0;->h:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/L0;->h:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/L0;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/L0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/L0;->f:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 394
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/L0;->h:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/L0;->e:Ljava/lang/String;

    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/L0;->d:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/L0;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/L0;->b:Lkotlinx/coroutines/flow/n;

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/L0;->a:Lkotlin/jvm/functions/Function0;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v8, v1

    :goto_1
    move-object v1, v5

    move-object v5, v2

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 395
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 396
    iget-object p2, p2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 397
    const-string v2, "DocCapture"

    const-string/jumbo v5, "showDocumentFlipHint"

    invoke-virtual {p2, v2, v5, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 398
    iput-boolean v3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->S:Z

    .line 399
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->G:Lkotlinx/coroutines/flow/n;

    invoke-interface {v5}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v2, p2

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    .line 400
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;

    invoke-direct {p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;-><init>()V

    iget-boolean v6, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->B:Z

    if-eqz v6, :cond_3

    goto :goto_2

    :cond_3
    move-object p2, v4

    .line 401
    :goto_2
    sget-object v6, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->FLIP:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    invoke-virtual {v6}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    move-result-object v6

    .line 402
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/L0;->a:Lkotlin/jvm/functions/Function0;

    iput-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/L0;->b:Lkotlinx/coroutines/flow/n;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/L0;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/L0;->d:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;

    iput-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/L0;->e:Ljava/lang/String;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/L0;->h:I

    const-string/jumbo v7, "sns_instructions_hint_turnOver"

    invoke-virtual {p0, v7, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    return-object v1

    :cond_4
    move-object v8, p2

    move-object p2, v0

    move-object v0, p1

    move-object p1, v6

    goto :goto_1

    :goto_3
    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_5

    const-string p2, " "

    .line 403
    :cond_5
    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q;

    const/4 v2, 0x0

    invoke-direct {v9, p1, p2, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    const/4 v10, 0x0

    const/16 v11, 0x13

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 404
    invoke-static/range {v5 .. v11}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q;Lcom/sumsub/sns/core/presentation/base/m;I)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    move-result-object p1

    invoke-interface {v1, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 405
    iget-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->B:Z

    if-nez p1, :cond_6

    .line 406
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M0;

    invoke-direct {p1, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M0;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, v2, p1, v3, v4}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 407
    :cond_6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v5

    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/N0;

    invoke-direct {v8, v0, p0, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/N0;-><init>(Lkotlin/jvm/functions/Function0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 408
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Landroid/content/Context;)V
    .locals 8

    .line 44
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 45
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 46
    const-string v1, "DocCapture"

    const-string v2, "initiateVideoRecord"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    invoke-virtual {p1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v0

    .line 48
    sget-boolean v1, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    if-eqz v1, :cond_0

    move-object v3, v0

    :cond_0
    if-nez v3, :cond_1

    .line 49
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v3

    .line 50
    :cond_1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "docapture_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ".mp4"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 51
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v3, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->y:Ljava/io/File;

    .line 52
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->G:Lkotlinx/coroutines/flow/n;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    .line 53
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c0;

    .line 54
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->y:Ljava/io/File;

    const/4 v3, 0x1

    .line 55
    invoke-direct {v2, v0, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c0;-><init>(Ljava/io/File;Z)V

    const/4 v6, 0x0

    const/16 v7, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 56
    invoke-static/range {v1 .. v7}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q;Lcom/sumsub/sns/core/presentation/base/m;I)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/camera/f;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 189
    iget-object v2, v1, Lcom/sumsub/sns/internal/core/presentation/camera/f;->a:Ljava/io/File;

    .line 190
    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->z:Z

    .line 191
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "video recording stopped. isWaitingForVideo="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 192
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 193
    iget-object v5, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 194
    const-string v6, "DocCapture"

    const/4 v10, 0x0

    invoke-virtual {v5, v6, v3, v10}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v11, 0x0

    .line 195
    iput-boolean v11, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->A:Z

    .line 196
    iput-boolean v11, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->r:Z

    .line 197
    iput-object v10, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->y:Ljava/io/File;

    .line 198
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/camera/f;->b:Lcom/sumsub/sns/internal/core/presentation/camera/e;

    .line 199
    instance-of v3, v1, Lcom/sumsub/sns/internal/core/presentation/camera/c;

    if-eqz v3, :cond_0

    .line 200
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v7, "onVideoRecordingFinalized: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 201
    move-object v7, v1

    check-cast v7, Lcom/sumsub/sns/internal/core/presentation/camera/c;

    .line 202
    iget-object v7, v7, Lcom/sumsub/sns/internal/core/presentation/camera/c;->b:Ljava/lang/Throwable;

    .line 203
    iget-object v8, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 204
    invoke-virtual {v8, v6, v5, v7}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 205
    :cond_0
    iget-boolean v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->z:Z

    if-nez v5, :cond_1

    .line 206
    iget-object v4, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 207
    const-string/jumbo v5, "onVideoRecorded: removing video file"

    invoke-virtual {v4, v6, v5, v10}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 208
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    if-eqz v3, :cond_3

    .line 209
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v11

    new-instance v14, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/H0;

    invoke-direct {v14, v0, v1, v10}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/H0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lcom/sumsub/sns/internal/core/presentation/camera/e;Lkotlin/coroutines/Continuation;)V

    const/4 v15, 0x3

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v11 .. v16}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    .line 210
    :cond_1
    iput-boolean v11, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->z:Z

    .line 211
    instance-of v3, v1, Lcom/sumsub/sns/internal/core/presentation/camera/d;

    if-eqz v3, :cond_2

    check-cast v1, Lcom/sumsub/sns/internal/core/presentation/camera/d;

    goto :goto_0

    :cond_2
    move-object v1, v10

    :goto_0
    if-nez v1, :cond_4

    :cond_3
    return-void

    .line 212
    :cond_4
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->i()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v12

    .line 213
    new-instance v3, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 214
    new-instance v8, Lcom/sumsub/sns/internal/features/data/model/common/S;

    .line 215
    iget v4, v1, Lcom/sumsub/sns/internal/core/presentation/camera/d;->a:I

    .line 216
    iget-wide v5, v1, Lcom/sumsub/sns/internal/core/presentation/camera/d;->b:J

    .line 217
    invoke-direct {v8, v4, v5, v6}, Lcom/sumsub/sns/internal/features/data/model/common/S;-><init>(IJ)V

    const/4 v7, 0x0

    const/16 v9, 0x364

    const/4 v4, 0x0

    .line 218
    const-string v5, "IDENTITY_VIDEO"

    const/4 v6, 0x0

    move-object v1, v3

    move-object v3, v2

    invoke-direct/range {v1 .. v9}, Lcom/sumsub/sns/internal/features/data/model/common/T;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;Ljava/lang/Boolean;Lcom/sumsub/sns/internal/features/data/model/common/S;I)V

    .line 219
    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 220
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->s:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->U:[Lkotlin/reflect/KProperty;

    aget-object v2, v2, v11

    .line 221
    iget-object v2, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 222
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v2, v1, v12}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 223
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v3

    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I0;

    invoke-direct {v6, v0, v10}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/Continuation;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/T;)V
    .locals 3

    .line 224
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->B:Z

    if-nez v0, :cond_1

    .line 225
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->K:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->F:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 226
    :cond_0
    invoke-super {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/W;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;)V

    return-void

    .line 227
    :cond_1
    :goto_0
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 228
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    const/4 v0, 0x0

    .line 229
    const-string v1, "DocCapture"

    const-string v2, "Gallery picking NOT allowed here!!"

    invoke-virtual {p1, v1, v2, v0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 230
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 231
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    invoke-virtual {v0, v1, v2, p1}, Lcom/sumsub/sns/internal/log/logger/k;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 232
    sget-boolean p1, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    if-nez p1, :cond_2

    return-void

    .line 233
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;)V
    .locals 4

    .line 260
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->N:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;

    if-eq p1, v0, :cond_0

    .line 261
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "requestFrameCheckResultUpdate: -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 262
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 263
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 264
    const-string v2, "DocCapture"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 265
    :cond_0
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->N:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/V;)V
    .locals 10

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 409
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "stopVideoRecording with error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 410
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 411
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 412
    const-string v3, "DocCapture"

    invoke-virtual {v2, v3, v1, v0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 413
    :cond_0
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->G:Lkotlinx/coroutines/flow/n;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    .line 414
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c0;

    const/4 v2, 0x0

    invoke-direct {v4, v0, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c0;-><init>(Ljava/io/File;Z)V

    if-eqz p1, :cond_1

    .line 415
    new-instance v2, Lcom/sumsub/sns/core/presentation/base/m;

    .line 416
    new-instance v5, Lcom/sumsub/sns/internal/features/data/model/common/g0;

    .line 417
    new-instance v6, Lcom/sumsub/sns/internal/features/data/model/common/c0;

    .line 418
    iget-object v7, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/V;->a:Ljava/lang/String;

    const/16 v8, 0x1e

    .line 419
    invoke-direct {v6, v8, v7, v0, v0}, Lcom/sumsub/sns/internal/features/data/model/common/c0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v7, 0x1

    .line 420
    invoke-direct {v5, v0, p1, v6, v7}, Lcom/sumsub/sns/internal/features/data/model/common/g0;-><init>(Ljava/lang/Throwable;Landroid/os/Parcelable;Lcom/sumsub/sns/internal/features/data/model/common/c0;I)V

    .line 421
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/W;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 422
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 423
    invoke-direct {v2, v5, p1, v0, v0}, Lcom/sumsub/sns/core/presentation/base/m;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/l0;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;)V

    move-object v8, v2

    goto :goto_0

    :cond_1
    move-object v8, v0

    :goto_0
    const/4 v9, 0x6

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 424
    invoke-static/range {v3 .. v9}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q;Lcom/sumsub/sns/core/presentation/base/m;I)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    move-result-object p1

    invoke-interface {v1, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/W;)V
    .locals 3

    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleVideoRecordError: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 66
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 67
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 68
    const-string v1, "DocCapture"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 69
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Y;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Y;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    return-void
.end method

.method public final a(Ljava/io/File;)V
    .locals 10

    .line 70
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->C:Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "onPictureTaken: waiting="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 71
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 72
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 73
    const-string v2, "DocCapture"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 74
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->C:Z

    if-eqz v0, :cond_0

    .line 75
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v4

    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y0;

    invoke-direct {v7, p0, p1, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Ljava/io/File;Lkotlin/coroutines/Continuation;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    .line 76
    :cond_0
    invoke-super {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/W;->a(Ljava/io/File;)V

    return-void
.end method

.method public final a(Landroid/content/Context;Landroid/graphics/Bitmap;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T;)Z
    .locals 4

    .line 332
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->R:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/N;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 333
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/N;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T;

    .line 334
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T;->a:Ljava/lang/Float;

    if-eqz v0, :cond_0

    .line 335
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    .line 336
    :goto_0
    iget-object v2, p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T;->a:Ljava/lang/Float;

    if-eqz v2, :cond_1

    .line 337
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v1

    :cond_1
    cmpl-float v0, v1, v0

    if-lez v0, :cond_4

    .line 338
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "better frame detected: score -> "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 339
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 340
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 341
    const-string v2, "DocCapture"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 342
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->R:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/N;

    if-eqz v0, :cond_2

    .line 343
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/N;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    .line 344
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 345
    :cond_2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/N;

    invoke-direct {v0, p2, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/N;-><init>(Landroid/graphics/Bitmap;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T;)V

    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->R:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/N;

    .line 346
    iget-boolean p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->K:Z

    const/4 p3, 0x1

    if-eqz p2, :cond_3

    .line 347
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->y:Ljava/io/File;

    if-nez p2, :cond_3

    .line 348
    iput-boolean p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->r:Z

    .line 349
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Landroid/content/Context;)V

    :cond_3
    return p3

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Landroid/content/Context;Landroid/graphics/Bitmap;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E0;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E0;->e:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E0;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    goto :goto_0

    :goto_1
    iget-object p3, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E0;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 40
    iget v1, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E0;->e:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v7, 0x0

    if-eqz v1, :cond_4

    if-eq v1, v4, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E0;->b:Landroid/graphics/Bitmap;

    iget-object p2, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E0;->a:Landroid/content/Context;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object p2, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E0;->b:Landroid/graphics/Bitmap;

    iget-object p1, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E0;->a:Landroid/content/Context;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 41
    iget-boolean p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->C:Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v8, "onRequestedPictureTaken: waiting="

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 42
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 43
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 44
    const-string v8, "DocCapture"

    invoke-virtual {v1, v8, p3, v5}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    iput-boolean v7, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->H:Z

    .line 46
    iget-boolean p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->C:Z

    if-eqz p3, :cond_5

    .line 47
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->P:Lkotlinx/coroutines/channels/d;

    iput-object p1, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E0;->a:Landroid/content/Context;

    iput-object p2, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E0;->b:Landroid/graphics/Bitmap;

    iput v4, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E0;->e:I

    invoke-interface {p3, v6}, Lkotlinx/coroutines/channels/o;->D(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_5

    goto :goto_5

    .line 48
    :cond_5
    :goto_2
    iget-boolean p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->K:Z

    if-nez p3, :cond_6

    iget-boolean p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->F:Z

    if-eqz p3, :cond_9

    .line 49
    :cond_6
    iput-object p1, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E0;->a:Landroid/content/Context;

    iput-object p2, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E0;->b:Landroid/graphics/Bitmap;

    iput v3, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E0;->e:I

    invoke-virtual {p0, p2, v4, v6}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Landroid/graphics/Bitmap;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_7

    goto :goto_5

    :cond_7
    move-object v9, p2

    move-object p2, p1

    move-object p1, v9

    :goto_3
    check-cast p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T;

    if-eqz p3, :cond_8

    .line 50
    iget-object v1, p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T;->a:Ljava/lang/Float;

    iget v3, p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T;->c:F

    iget p3, p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T;->d:F

    .line 51
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T;

    invoke-direct {v4, v1, v7, v3, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T;-><init>(Ljava/lang/Float;ZFF)V

    move-object v3, p1

    goto :goto_4

    :cond_8
    move-object v9, p2

    move-object p2, p1

    move-object p1, v9

    :cond_9
    move-object v3, p2

    move-object v4, v5

    move-object p2, p1

    .line 52
    :goto_4
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1, v7, v7, v7, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 53
    iput-object v5, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E0;->a:Landroid/content/Context;

    iput-object v5, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E0;->b:Landroid/graphics/Bitmap;

    iput v2, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E0;->e:I

    move-object v1, p0

    move-object v2, p2

    move-object v5, v4

    move-object v4, p1

    invoke-virtual/range {v1 .. v6}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    :goto_5
    return-object v0

    .line 54
    :cond_a
    :goto_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final b(Landroid/content/Context;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w0;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w0;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w0;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w0;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 55
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w0;->d:I

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlinx/coroutines/channels/ChannelResult;

    invoke-virtual {p2}, Lkotlinx/coroutines/channels/ChannelResult;->l()Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w0;->a:Landroid/content/Context;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 56
    iput-boolean v6, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->S:Z

    .line 57
    iget-boolean p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->A:Z

    if-nez p2, :cond_9

    .line 58
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w0;->a:Landroid/content/Context;

    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w0;->d:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->f(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_3

    .line 59
    :cond_5
    :goto_1
    iget-boolean p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->K:Z

    if-eqz p2, :cond_6

    .line 60
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->y:Ljava/io/File;

    if-nez p2, :cond_6

    .line 61
    iput-boolean v6, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->r:Z

    .line 62
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Landroid/content/Context;)V

    .line 63
    :cond_6
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->O:Lkotlinx/coroutines/channels/d;

    iput-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w0;->a:Landroid/content/Context;

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w0;->d:I

    invoke-interface {p1, v0}, Lkotlinx/coroutines/channels/o;->p(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_3

    .line 64
    :cond_7
    :goto_2
    invoke-static {p1}, Lkotlinx/coroutines/channels/ChannelResult;->i(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 65
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 66
    :cond_8
    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w0;->d:I

    const-wide/16 p1, 0x7d0

    invoke-static {p1, p2, v0}, Lkotlinx/coroutines/DelayKt;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_3
    return-object v1

    .line 67
    :cond_9
    :goto_4
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v4

    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/x0;

    invoke-direct {v7, p0, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/x0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/Continuation;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 68
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/f0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/f0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/f0;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/f0;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/f0;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/f0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/f0;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 11
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/f0;->c:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 12
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->k:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/f0;->c:I

    .line 13
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {p1, v3, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    .line 14
    :cond_3
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-nez p1, :cond_4

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 15
    :cond_4
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->k()Lcom/sumsub/sns/internal/features/data/model/common/n;

    move-result-object p1

    .line 16
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/n;->a:Ljava/util/List;

    .line 17
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/m;

    .line 18
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/m;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 19
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/camera/W;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 20
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_2

    :cond_6
    move-object v0, v1

    .line 21
    :goto_2
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/m;

    if-eqz v0, :cond_7

    .line 22
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/m;->a()Z

    move-result p1

    if-ne p1, v4, :cond_7

    .line 23
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/model/common/m;->d:Ljava/lang/String;

    .line 24
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->DocCapture:Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    move p1, v4

    goto :goto_3

    :cond_7
    move p1, v3

    .line 25
    :goto_3
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->u:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 26
    iget-boolean v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->K:Z

    .line 27
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->h()Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    move-result-object v5

    sget-object v6, Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;->SEAMLESS_DOC_CAPTURE_LEGACY:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    if-ne v5, v6, :cond_8

    .line 28
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;->MANUAL:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;

    goto :goto_5

    .line 29
    :cond_8
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->q:Landroidx/lifecycle/SavedStateHandle;

    const-string v6, "EXTRA_PREFER_AUTO_CAPTURE"

    invoke-virtual {v5, v6}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_a

    .line 30
    sget-object v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;->Companion:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    invoke-static {}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;->values()[Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;

    move-result-object v6

    array-length v7, v6

    move v8, v3

    :goto_4
    if-ge v8, v7, :cond_a

    aget-object v9, v6, v8

    .line 32
    invoke-virtual {v9}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;->getValue()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    move-object v5, v9

    goto :goto_5

    :cond_9
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_a
    move-object v5, v1

    :goto_5
    if-eqz v5, :cond_b

    .line 33
    invoke-virtual {v5}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;->getValue()Ljava/lang/String;

    move-result-object v5

    goto :goto_6

    :cond_b
    move-object v5, v1

    .line 34
    :goto_6
    iget-boolean v6, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->I:Z

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "checkAutoCaptureAllowedForStep: auto capture ff.enabled="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", level.autoEnabled="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", seamlessDocapture.enabled="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", preferredMode="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isRetake="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 35
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 36
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 37
    const-string v5, "DocCapture"

    invoke-virtual {v2, v5, v0, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->u:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_c

    if-eqz p1, :cond_c

    move v3, v4

    .line 39
    :cond_c
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/io/File;)V
    .locals 9

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "onVideoRecordingStarted: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 5
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 6
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 7
    const-string v1, "DocCapture"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    .line 8
    iput-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->r:Z

    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->A:Z

    .line 10
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v3

    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J0;

    invoke-direct {v6, p0, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/Continuation;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final c(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j0;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j0;

    iget v3, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j0;->f:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j0;->f:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j0;

    invoke-direct {v2, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j0;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 14
    iget v4, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j0;->f:I

    const-string v5, " "

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v9, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v3, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j0;->c:Ljava/lang/Object;

    check-cast v3, Lkotlinx/coroutines/flow/n;

    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j0;->b:Ljava/lang/Object;

    check-cast v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q;

    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j0;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v10, v2

    move-object v14, v4

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j0;->c:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v10, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j0;->b:Ljava/lang/Object;

    check-cast v10, Lkotlinx/coroutines/flow/n;

    iget-object v11, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j0;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v17, v11

    move-object v11, v4

    move-object/from16 v4, v17

    goto :goto_1

    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 15
    iget-boolean v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->A:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "finishWithCurrentResults: isCapturingVideo="

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 16
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 17
    iget-object v4, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 18
    const-string v10, "DocCapture"

    invoke-virtual {v4, v10, v1, v7}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    iget-boolean v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->A:Z

    if-eqz v1, :cond_7

    .line 20
    iput-boolean v9, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->z:Z

    .line 21
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->G:Lkotlinx/coroutines/flow/n;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    .line 22
    sget-object v10, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->SUCCESS_CHECK:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    invoke-virtual {v10}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    move-result-object v10

    .line 23
    iput-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j0;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    iput-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j0;->b:Ljava/lang/Object;

    iput-object v10, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j0;->c:Ljava/lang/Object;

    iput v9, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j0;->f:I

    const-string/jumbo v11, "sns_instructions_hint_allSet"

    invoke-virtual {v0, v11, v2}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v3, :cond_4

    goto :goto_2

    :cond_4
    move-object/from16 v17, v10

    move-object v10, v1

    move-object v1, v11

    move-object/from16 v11, v17

    :goto_1
    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_5

    move-object v1, v5

    .line 24
    :cond_5
    new-instance v12, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q;

    invoke-direct {v12, v11, v1, v8}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 25
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;

    .line 26
    sget-object v11, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;->SMALL:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;

    .line 27
    invoke-direct {v1, v8, v11, v8}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;-><init>(ZLcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;Z)V

    .line 28
    iput-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j0;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    iput-object v12, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j0;->b:Ljava/lang/Object;

    iput-object v10, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j0;->c:Ljava/lang/Object;

    iput v6, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j0;->f:I

    .line 29
    invoke-virtual {v0, v1, v8, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_6

    :goto_2
    return-object v3

    :cond_6
    move-object v3, v10

    move-object v14, v12

    move-object v10, v4

    .line 30
    :goto_3
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;

    .line 31
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;->DEFAULT:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;

    .line 32
    iget-boolean v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;->b:Z

    .line 33
    new-instance v13, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;

    invoke-direct {v13, v5, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;-><init>(Ljava/lang/String;ZLcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;)V

    const/4 v15, 0x0

    const/16 v16, 0x13

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 34
    invoke-static/range {v10 .. v16}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q;Lcom/sumsub/sns/core/presentation/base/m;I)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    move-result-object v1

    invoke-interface {v3, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 35
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/k0;

    invoke-direct {v1, v7}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/k0;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v8, v1, v9, v7}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 36
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v10

    new-instance v13, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l0;

    invoke-direct {v13, v0, v7}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/Continuation;)V

    const/4 v14, 0x3

    invoke-static/range {v10 .. v15}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 37
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 38
    :cond_7
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/J;

    .line 39
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->i()Ljava/util/List;

    move-result-object v1

    .line 40
    invoke-direct {v2, v1, v9}, Lcom/sumsub/sns/internal/features/data/model/common/J;-><init>(Ljava/util/List;Z)V

    const/16 v5, 0xd

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 41
    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 42
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final c(Z)V
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "onAutoEnabled: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 9
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 10
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 11
    const-string v4, "DocCapture"

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v2, v5}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz v1, :cond_0

    .line 12
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v6

    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;

    invoke-direct {v9, v0, v5}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/Continuation;)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    .line 13
    :cond_0
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v12

    new-instance v15, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/V0;

    const/4 v1, 0x1

    invoke-direct {v15, v0, v1, v5}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/V0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;ZLkotlin/coroutines/Continuation;)V

    const/16 v16, 0x3

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v12 .. v17}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final d(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/o0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/o0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/o0;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/o0;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/o0;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/o0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/o0;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/o0;->f:I

    const-string v3, " "

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/o0;->c:Ljava/lang/String;

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/o0;->b:Ljava/lang/Boolean;

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/o0;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c0;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v7, v0

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/o0;->b:Ljava/lang/Boolean;

    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/o0;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c0;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c0;

    .line 3
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->y:Ljava/io/File;

    .line 4
    iget-boolean v6, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->A:Z

    .line 5
    invoke-direct {p1, v2, v6}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c0;-><init>(Ljava/io/File;Z)V

    .line 6
    iget-boolean v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->K:Z

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    :goto_1
    const/4 v2, 0x0

    .line 7
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v2

    .line 8
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/o0;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c0;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/o0;->b:Ljava/lang/Boolean;

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/o0;->f:I

    const-string/jumbo v6, "sns_autocapture_action_auto"

    invoke-virtual {p0, v6, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_5

    goto :goto_3

    :cond_5
    move-object v12, v6

    move-object v6, p1

    move-object p1, v12

    :goto_2
    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_6

    move-object p1, v3

    .line 9
    :cond_6
    iput-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/o0;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c0;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/o0;->b:Ljava/lang/Boolean;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/o0;->c:Ljava/lang/String;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/o0;->f:I

    const-string/jumbo v4, "sns_autocapture_action_manual"

    invoke-virtual {p0, v4, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    move-object v1, p1

    move-object p1, v0

    move-object v7, v6

    :goto_4
    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_8

    goto :goto_5

    :cond_8
    move-object v3, p1

    .line 10
    :goto_5
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 11
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O;

    invoke-direct {v8, v2, v1, v3, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O;-><init>(Ljava/lang/Boolean;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Boolean;)V

    .line 12
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v9, 0x0

    .line 13
    invoke-direct/range {v6 .. v11}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q;Lcom/sumsub/sns/core/presentation/base/m;)V

    return-object v6
.end method

.method public final e()Landroid/util/Size;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->o:Lcom/sumsub/sns/internal/ml/autocapture/d;

    .line 2
    iget-object v0, v0, Lcom/sumsub/sns/internal/ml/autocapture/d;->k:Landroid/util/Size;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 3
    iget-boolean v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->F:Z

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    return-object v1
.end method

.method public final e(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 14

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O0;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O0;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O0;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O0;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 4
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O0;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O0;->a:Lkotlinx/coroutines/flow/n;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 5
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->G:Lkotlinx/coroutines/flow/n;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O0;->a:Lkotlinx/coroutines/flow/n;

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O0;->d:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->d(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto/16 :goto_5

    .line 6
    :cond_4
    :goto_1
    move-object v7, p1

    check-cast v7, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    const/4 v12, 0x0

    const/16 v13, 0x17

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 7
    invoke-static/range {v7 .. v13}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q;Lcom/sumsub/sns/core/presentation/base/m;I)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    move-result-object p1

    invoke-interface {v2, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 8
    iget-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->F:Z

    if-eqz p1, :cond_8

    .line 9
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->h()Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    move-result-object p1

    sget-object v2, Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;->SEAMLESS_DOC_CAPTURE_LEGACY:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    if-ne p1, v2, :cond_5

    .line 10
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;->MANUAL:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;

    goto :goto_3

    .line 11
    :cond_5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->q:Landroidx/lifecycle/SavedStateHandle;

    const-string v2, "EXTRA_PREFER_AUTO_CAPTURE"

    invoke-virtual {p1, v2}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_7

    .line 12
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;->Companion:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    invoke-static {}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;->values()[Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;

    move-result-object v2

    array-length v7, v2

    move v8, v4

    :goto_2
    if-ge v8, v7, :cond_7

    aget-object v9, v2, v8

    .line 14
    invoke-virtual {v9}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;->getValue()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    move-object p1, v9

    goto :goto_3

    :cond_6
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_7
    move-object p1, v6

    .line 15
    :goto_3
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;->MANUAL:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;

    if-eq p1, v2, :cond_8

    .line 16
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v7

    new-instance v10, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;

    invoke-direct {v10, p0, v6}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/Continuation;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    goto :goto_4

    .line 17
    :cond_8
    iget-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->F:Z

    .line 18
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v7

    new-instance v10, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/V0;

    invoke-direct {v10, p0, p1, v6}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/V0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;ZLkotlin/coroutines/Continuation;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 19
    :goto_4
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->k:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O0;->a:Lkotlinx/coroutines/flow/n;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O0;->d:I

    .line 20
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {p1, v4, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_5
    return-object v1

    .line 21
    :cond_9
    :goto_6
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    const-string v0, "DocCapture"

    if-nez p1, :cond_a

    .line 22
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 23
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 24
    const-string/jumbo v1, "showInitialViewState: error. Applicant null"

    invoke-virtual {p1, v0, v1, v6}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    invoke-virtual {p0, v1}, Lcom/sumsub/sns/core/presentation/base/C;->finishAbnormal(Ljava/lang/String;)V

    .line 26
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 27
    :cond_a
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/W;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 28
    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->b(Lcom/sumsub/sns/internal/features/data/model/common/X;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/q2;

    .line 29
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/W;->f:Landroidx/lifecycle/SavedStateHandle;

    const-string v2, "current_side"

    invoke-virtual {v1, v2}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 30
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Back:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    if-ne v1, v2, :cond_c

    .line 31
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->F:Z

    if-eqz v1, :cond_b

    iget-boolean v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->I:Z

    if-nez v2, :cond_b

    move v4, v5

    :cond_b
    iput-boolean v4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->t:Z

    if-nez v1, :cond_c

    .line 32
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->I:Z

    if-nez v1, :cond_c

    .line 33
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v7

    new-instance v10, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P0;

    invoke-direct {v10, p0, v6}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/Continuation;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 34
    :cond_c
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SDK is using - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 35
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 36
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 37
    invoke-virtual {v1, v0, p1, v6}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final f()Lcom/sumsub/sns/internal/core/presentation/camera/b;
    .locals 10

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/camera/b;

    .line 2
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->p:Lcom/sumsub/sns/internal/ml/autocapture/g;

    move-object v2, v1

    .line 3
    iget v1, v2, Lcom/sumsub/sns/internal/ml/autocapture/g;->a:I

    .line 4
    iget-object v2, v2, Lcom/sumsub/sns/internal/ml/autocapture/g;->c:Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;

    .line 5
    invoke-static {v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i;->a(Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;)Landroidx/camera/video/Quality;

    move-result-object v2

    .line 6
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->p:Lcom/sumsub/sns/internal/ml/autocapture/g;

    .line 7
    iget-object v3, v3, Lcom/sumsub/sns/internal/ml/autocapture/g;->d:Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;

    .line 8
    invoke-static {v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i;->a(Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;)Landroidx/camera/video/Quality;

    move-result-object v3

    .line 9
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->p:Lcom/sumsub/sns/internal/ml/autocapture/g;

    .line 10
    iget v5, v5, Lcom/sumsub/sns/internal/ml/autocapture/g;->b:I

    int-to-long v5, v5

    .line 11
    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    .line 12
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->p:Lcom/sumsub/sns/internal/ml/autocapture/g;

    .line 13
    iget v6, v6, Lcom/sumsub/sns/internal/ml/autocapture/g;->e:I

    int-to-long v6, v6

    const-wide/32 v8, 0x100000

    mul-long/2addr v6, v8

    .line 14
    invoke-direct/range {v0 .. v7}, Lcom/sumsub/sns/internal/core/presentation/camera/b;-><init>(ILandroidx/camera/video/Quality;Landroidx/camera/video/Quality;JJ)V

    return-object v0
.end method

.method public final f(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q0;->g:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q0;->g:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q0;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q0;->e:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 15
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q0;->g:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q0;->d:Ljava/lang/String;

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q0;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;

    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q0;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q0;->a:Lkotlinx/coroutines/flow/n;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :goto_1
    move-object v8, v2

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 16
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 17
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 18
    const-string v2, "DocCapture"

    const-string/jumbo v5, "showWaitPopup"

    invoke-virtual {p1, v2, v5, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->G:Lkotlinx/coroutines/flow/n;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    .line 20
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;

    invoke-direct {v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;-><init>()V

    iget-boolean v6, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->B:Z

    if-eqz v6, :cond_3

    goto :goto_2

    :cond_3
    move-object v2, v4

    .line 21
    :goto_2
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q0;->a:Lkotlinx/coroutines/flow/n;

    iput-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q0;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q0;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;

    const-string v6, ""

    iput-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q0;->d:Ljava/lang/String;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q0;->g:I

    const-string/jumbo v7, "sns_general_progress_text"

    invoke-virtual {p0, v7, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    return-object v1

    :cond_4
    move-object v1, v0

    move-object v0, p1

    move-object p1, v1

    move-object v1, v6

    goto :goto_1

    :goto_3
    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_5

    const-string p1, " "

    .line 22
    :cond_5
    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q;

    invoke-direct {v9, v1, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v10, 0x0

    const/16 v11, 0x13

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 23
    invoke-static/range {v5 .. v11}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q;Lcom/sumsub/sns/core/presentation/base/m;I)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 24
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/R0;

    invoke-direct {p1, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/R0;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v0, 0x0

    invoke-static {p0, v0, p1, v3, v4}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 25
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final g()V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 5
    .line 6
    .line 7
    const-string/jumbo v1, "onTakePictureClicked"

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    const-string v3, "DocCapture"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    const/4 v0, 0x1

    .line 15
    .line 16
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->C:Z

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->h()Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d0;->a:[I

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 26
    move-result v1

    .line 27
    .line 28
    aget v1, v2, v1

    .line 29
    .line 30
    if-eq v1, v0, :cond_1

    .line 31
    const/4 v2, 0x2

    .line 32
    .line 33
    if-eq v1, v2, :cond_0

    .line 34
    .line 35
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->H:Z

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :cond_0
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->H:Z

    .line 39
    .line 40
    .line 41
    invoke-super {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/W;->g()V

    .line 42
    goto :goto_0

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-super {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/W;->g()V

    .line 46
    .line 47
    :goto_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a0;

    .line 48
    .line 49
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i3;

    .line 50
    .line 51
    .line 52
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i3;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;)V

    .line 53
    .line 54
    .line 55
    invoke-direct {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 59
    return-void
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
.end method

.method public final h()Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;
    .locals 5

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->K:Z

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->w:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 8
    .line 9
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->U:[Lkotlin/reflect/KProperty;

    .line 10
    const/4 v3, 0x2

    .line 11
    .line 12
    aget-object v2, v2, v3

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Ljava/lang/Boolean;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;->SEAMLESS_DOC_CAPTURE_LEGACY:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 27
    goto :goto_1

    .line 28
    .line 29
    :cond_0
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;->SEAMLESS_DOC_CAPTURE:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 30
    goto :goto_1

    .line 31
    .line 32
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->E:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 33
    .line 34
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->U:[Lkotlin/reflect/KProperty;

    .line 35
    const/4 v3, 0x3

    .line 36
    .line 37
    aget-object v2, v2, v3

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    check-cast v0, Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    move-result v0

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;->PHOTO_AND_ANALYZER:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 52
    .line 53
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->o:Lcom/sumsub/sns/internal/ml/autocapture/d;

    .line 54
    .line 55
    iget-boolean v2, v2, Lcom/sumsub/sns/internal/ml/autocapture/d;->l:Z

    .line 56
    .line 57
    if-eqz v2, :cond_2

    .line 58
    goto :goto_0

    .line 59
    :cond_2
    move-object v0, v1

    .line 60
    .line 61
    :goto_0
    if-nez v0, :cond_4

    .line 62
    .line 63
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;->ANALYZER:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 64
    goto :goto_1

    .line 65
    .line 66
    :cond_3
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;->PHOTO:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 67
    .line 68
    :cond_4
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    const-string v3, "cameraMode: "

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    move-result-object v2

    .line 84
    .line 85
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 86
    .line 87
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 88
    .line 89
    const-string v4, "DocCapture"

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, v4, v2, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    return-object v0
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
.end method

.method public final i()Ljava/util/List;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->s:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->U:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Ljava/util/List;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final onCleared()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->onCleared()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p0;

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    .line 13
    invoke-direct {v3, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/Continuation;)V

    .line 14
    const/4 v4, 0x3

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    .line 19
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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
.end method

.method public final onHandleError(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/l0;->d()Landroid/os/Parcelable;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/W;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/W;

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/W;)V

    .line 18
    return-void

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->onHandleError(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
.end method

.method public final onPrepare(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C0;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C0;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C0;->d:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C0;->d:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C0;

    .line 22
    .line 23
    check-cast p1, Lkotlin/coroutines/jvm/internal/ContinuationImpl;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 27
    .line 28
    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C0;->b:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C0;->d:I

    .line 35
    const/4 v3, 0x2

    .line 36
    const/4 v4, 0x1

    .line 37
    const/4 v5, 0x3

    .line 38
    const/4 v6, 0x0

    .line 39
    .line 40
    if-eqz v2, :cond_4

    .line 41
    .line 42
    if-eq v2, v4, :cond_3

    .line 43
    .line 44
    if-eq v2, v3, :cond_2

    .line 45
    .line 46
    if-ne v2, v5, :cond_1

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 50
    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    .line 58
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    throw p1

    .line 60
    .line 61
    :cond_2
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C0;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;

    .line 62
    .line 63
    .line 64
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 65
    goto :goto_2

    .line 66
    .line 67
    .line 68
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 69
    goto :goto_1

    .line 70
    .line 71
    .line 72
    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 73
    .line 74
    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C0;->d:I

    .line 75
    .line 76
    .line 77
    invoke-static {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/W;->a(Lcom/sumsub/sns/internal/features/presentation/camera/W;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 78
    move-result-object p1

    .line 79
    .line 80
    if-ne p1, v1, :cond_5

    .line 81
    .line 82
    goto/16 :goto_3

    .line 83
    .line 84
    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/W;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 85
    .line 86
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/W;->b:Ljava/lang/String;

    .line 87
    .line 88
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->J:Ljava/util/List;

    .line 89
    .line 90
    new-instance v7, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    const-string/jumbo v8, "onPrepare: docType: "

    .line 97
    .line 98
    .line 99
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string p1, ", idType: "

    .line 105
    .line 106
    .line 107
    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string p1, ", sides: "

    .line 113
    .line 114
    .line 115
    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    move-result-object p1

    .line 123
    .line 124
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 125
    .line 126
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 127
    .line 128
    const-string v4, "DocCapture"

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v4, p1, v6}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 132
    .line 133
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->J:Ljava/util/List;

    .line 134
    .line 135
    .line 136
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 137
    move-result-object p1

    .line 138
    .line 139
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 140
    .line 141
    if-nez p1, :cond_6

    .line 142
    .line 143
    sget-object p1, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 144
    .line 145
    .line 146
    :cond_6
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/W;->a(Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;)V

    .line 147
    .line 148
    .line 149
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 150
    move-result-object p1

    .line 151
    .line 152
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->s:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 153
    .line 154
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->U:[Lkotlin/reflect/KProperty;

    .line 155
    const/4 v7, 0x0

    .line 156
    .line 157
    aget-object v4, v4, v7

    .line 158
    .line 159
    iget-object v4, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 160
    .line 161
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v4, v2, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 165
    .line 166
    iput-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C0;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;

    .line 167
    .line 168
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C0;->d:I

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 172
    move-result-object p1

    .line 173
    .line 174
    if-ne p1, v1, :cond_7

    .line 175
    goto :goto_3

    .line 176
    :cond_7
    move-object v2, p0

    .line 177
    .line 178
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->E:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 184
    .line 185
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->U:[Lkotlin/reflect/KProperty;

    .line 186
    .line 187
    aget-object v3, v3, v5

    .line 188
    .line 189
    iget-object v3, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 190
    .line 191
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3, v2, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 195
    .line 196
    iput-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C0;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;

    .line 197
    .line 198
    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C0;->d:I

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->f(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 202
    move-result-object p1

    .line 203
    .line 204
    if-ne p1, v1, :cond_8

    .line 205
    :goto_3
    return-object v1

    .line 206
    .line 207
    :cond_8
    :goto_4
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D0;

    .line 208
    .line 209
    .line 210
    invoke-direct {p1, p0, v6}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/Continuation;)V

    .line 211
    .line 212
    .line 213
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 214
    move-result-object v0

    .line 215
    .line 216
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/n0;

    .line 217
    .line 218
    .line 219
    invoke-direct {v3, p0, p1, v6}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/n0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D0;Lkotlin/coroutines/Continuation;)V

    .line 220
    const/4 v4, 0x3

    .line 221
    const/4 v5, 0x0

    .line 222
    const/4 v1, 0x0

    .line 223
    const/4 v2, 0x0

    .line 224
    .line 225
    .line 226
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 227
    .line 228
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 229
    return-object p1
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
.end method
