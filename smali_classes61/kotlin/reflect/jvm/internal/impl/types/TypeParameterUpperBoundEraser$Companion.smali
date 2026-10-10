.class public final Lkotlin/reflect/jvm/internal/impl/types/TypeParameterUpperBoundEraser$Companion;
.super Ljava/lang/Object;
.source "TypeParameterUpperBoundEraser.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/reflect/jvm/internal/impl/types/TypeParameterUpperBoundEraser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTypeParameterUpperBoundEraser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser$Companion\n+ 2 TypeUtils.kt\norg/jetbrains/kotlin/types/typeUtil/TypeUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,158:1\n245#2,14:159\n260#2:177\n1563#3:173\n1634#3,3:174\n*S KotlinDebug\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser$Companion\n*L\n140#1:159,14\n140#1:177\n140#1:173\n140#1:174,3\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/types/TypeParameterUpperBoundEraser$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final replaceArgumentsOfUpperBound(Lkotlin/reflect/jvm/internal/impl/types/KotlinType;Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutor;Ljava/util/Set;Z)Lkotlin/reflect/jvm/internal/impl/types/KotlinType;
    .locals 16
    .param p1    # Lkotlin/reflect/jvm/internal/impl/types/KotlinType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;",
            "Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutor;",
            "Ljava/util/Set<",
            "+",
            "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;",
            ">;Z)",
            "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p2

    .line 3
    .line 4
    move-object/from16 v1, p3

    .line 5
    .line 6
    const-string v2, "<this>"

    .line 7
    .line 8
    move-object/from16 v3, p1

    .line 9
    .line 10
    .line 11
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string/jumbo v2, "substitutor"

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3}, Lkotlin/reflect/jvm/internal/impl/types/KotlinType;->unwrap()Lkotlin/reflect/jvm/internal/impl/types/UnwrappedType;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    instance-of v4, v2, Lkotlin/reflect/jvm/internal/impl/types/FlexibleType;

    .line 24
    const/4 v5, 0x2

    .line 25
    .line 26
    const-string v6, "getType(...)"

    .line 27
    .line 28
    const/16 v9, 0xa

    .line 29
    .line 30
    const-string v10, "getParameters(...)"

    .line 31
    const/4 v11, 0x0

    .line 32
    .line 33
    if-eqz v4, :cond_e

    .line 34
    move-object v4, v2

    .line 35
    .line 36
    check-cast v4, Lkotlin/reflect/jvm/internal/impl/types/FlexibleType;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/impl/types/FlexibleType;->getLowerBound()Lkotlin/reflect/jvm/internal/impl/types/SimpleType;

    .line 40
    move-result-object v12

    .line 41
    .line 42
    .line 43
    invoke-virtual {v12}, Lkotlin/reflect/jvm/internal/impl/types/KotlinType;->getConstructor()Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;

    .line 44
    move-result-object v13

    .line 45
    .line 46
    .line 47
    invoke-interface {v13}, Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;->getParameters()Ljava/util/List;

    .line 48
    move-result-object v13

    .line 49
    .line 50
    .line 51
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 52
    move-result v13

    .line 53
    .line 54
    if-nez v13, :cond_6

    .line 55
    .line 56
    .line 57
    invoke-virtual {v12}, Lkotlin/reflect/jvm/internal/impl/types/KotlinType;->getConstructor()Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;

    .line 58
    move-result-object v13

    .line 59
    .line 60
    .line 61
    invoke-interface {v13}, Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;->getDeclarationDescriptor()Lkotlin/reflect/jvm/internal/impl/descriptors/ClassifierDescriptor;

    .line 62
    move-result-object v13

    .line 63
    .line 64
    if-nez v13, :cond_0

    .line 65
    .line 66
    goto/16 :goto_3

    .line 67
    .line 68
    .line 69
    :cond_0
    invoke-virtual {v12}, Lkotlin/reflect/jvm/internal/impl/types/KotlinType;->getConstructor()Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;

    .line 70
    move-result-object v13

    .line 71
    .line 72
    .line 73
    invoke-interface {v13}, Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;->getParameters()Ljava/util/List;

    .line 74
    move-result-object v13

    .line 75
    .line 76
    .line 77
    invoke-static {v13, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    new-instance v14, Ljava/util/ArrayList;

    .line 80
    .line 81
    .line 82
    invoke-static {v13, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 83
    move-result v15

    .line 84
    .line 85
    .line 86
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 90
    move-result-object v13

    .line 91
    .line 92
    .line 93
    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    move-result v15

    .line 95
    .line 96
    if-eqz v15, :cond_5

    .line 97
    .line 98
    .line 99
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    move-result-object v15

    .line 101
    .line 102
    check-cast v15, Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3}, Lkotlin/reflect/jvm/internal/impl/types/KotlinType;->getArguments()Ljava/util/List;

    .line 106
    move-result-object v7

    .line 107
    .line 108
    .line 109
    invoke-interface {v15}, Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;->getIndex()I

    .line 110
    move-result v8

    .line 111
    .line 112
    .line 113
    invoke-static {v7, v8}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 114
    move-result-object v7

    .line 115
    .line 116
    check-cast v7, Lkotlin/reflect/jvm/internal/impl/types/TypeProjection;

    .line 117
    .line 118
    if-eqz p4, :cond_1

    .line 119
    .line 120
    if-eqz v7, :cond_1

    .line 121
    .line 122
    .line 123
    invoke-interface {v7}, Lkotlin/reflect/jvm/internal/impl/types/TypeProjection;->getType()Lkotlin/reflect/jvm/internal/impl/types/KotlinType;

    .line 124
    move-result-object v8

    .line 125
    .line 126
    if-eqz v8, :cond_1

    .line 127
    .line 128
    .line 129
    invoke-static {v8}, Lkotlin/reflect/jvm/internal/impl/types/typeUtil/TypeUtilsKt;->containsTypeParameter(Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Z

    .line 130
    move-result v8

    .line 131
    .line 132
    if-nez v8, :cond_1

    .line 133
    goto :goto_2

    .line 134
    .line 135
    :cond_1
    if-eqz v1, :cond_2

    .line 136
    .line 137
    .line 138
    invoke-interface {v1, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 139
    move-result v8

    .line 140
    .line 141
    if-eqz v8, :cond_2

    .line 142
    const/4 v8, 0x1

    .line 143
    goto :goto_1

    .line 144
    :cond_2
    const/4 v8, 0x0

    .line 145
    .line 146
    :goto_1
    if-eqz v7, :cond_3

    .line 147
    .line 148
    if-nez v8, :cond_3

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutor;->getSubstitution()Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitution;

    .line 152
    move-result-object v8

    .line 153
    .line 154
    .line 155
    invoke-interface {v7}, Lkotlin/reflect/jvm/internal/impl/types/TypeProjection;->getType()Lkotlin/reflect/jvm/internal/impl/types/KotlinType;

    .line 156
    move-result-object v9

    .line 157
    .line 158
    .line 159
    invoke-static {v9, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v8, v9}, Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitution;->get(Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Lkotlin/reflect/jvm/internal/impl/types/TypeProjection;

    .line 163
    move-result-object v8

    .line 164
    .line 165
    if-nez v8, :cond_4

    .line 166
    .line 167
    :cond_3
    new-instance v7, Lkotlin/reflect/jvm/internal/impl/types/StarProjectionImpl;

    .line 168
    .line 169
    .line 170
    invoke-direct {v7, v15}, Lkotlin/reflect/jvm/internal/impl/types/StarProjectionImpl;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;)V

    .line 171
    .line 172
    .line 173
    :cond_4
    :goto_2
    invoke-interface {v14, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    const/16 v9, 0xa

    .line 176
    goto :goto_0

    .line 177
    .line 178
    .line 179
    :cond_5
    invoke-static {v12, v14, v11, v5, v11}, Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutionKt;->replace$default(Lkotlin/reflect/jvm/internal/impl/types/SimpleType;Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/types/TypeAttributes;ILjava/lang/Object;)Lkotlin/reflect/jvm/internal/impl/types/SimpleType;

    .line 180
    move-result-object v12

    .line 181
    .line 182
    .line 183
    :cond_6
    :goto_3
    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/impl/types/FlexibleType;->getUpperBound()Lkotlin/reflect/jvm/internal/impl/types/SimpleType;

    .line 184
    move-result-object v4

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/impl/types/KotlinType;->getConstructor()Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;

    .line 188
    move-result-object v7

    .line 189
    .line 190
    .line 191
    invoke-interface {v7}, Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;->getParameters()Ljava/util/List;

    .line 192
    move-result-object v7

    .line 193
    .line 194
    .line 195
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 196
    move-result v7

    .line 197
    .line 198
    if-nez v7, :cond_d

    .line 199
    .line 200
    .line 201
    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/impl/types/KotlinType;->getConstructor()Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;

    .line 202
    move-result-object v7

    .line 203
    .line 204
    .line 205
    invoke-interface {v7}, Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;->getDeclarationDescriptor()Lkotlin/reflect/jvm/internal/impl/descriptors/ClassifierDescriptor;

    .line 206
    move-result-object v7

    .line 207
    .line 208
    if-nez v7, :cond_7

    .line 209
    .line 210
    goto/16 :goto_7

    .line 211
    .line 212
    .line 213
    :cond_7
    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/impl/types/KotlinType;->getConstructor()Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;

    .line 214
    move-result-object v7

    .line 215
    .line 216
    .line 217
    invoke-interface {v7}, Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;->getParameters()Ljava/util/List;

    .line 218
    move-result-object v7

    .line 219
    .line 220
    .line 221
    invoke-static {v7, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 222
    .line 223
    new-instance v8, Ljava/util/ArrayList;

    .line 224
    .line 225
    const/16 v9, 0xa

    .line 226
    .line 227
    .line 228
    invoke-static {v7, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 229
    move-result v9

    .line 230
    .line 231
    .line 232
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 233
    .line 234
    .line 235
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 236
    move-result-object v7

    .line 237
    .line 238
    .line 239
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 240
    move-result v9

    .line 241
    .line 242
    if-eqz v9, :cond_c

    .line 243
    .line 244
    .line 245
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 246
    move-result-object v9

    .line 247
    .line 248
    check-cast v9, Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v3}, Lkotlin/reflect/jvm/internal/impl/types/KotlinType;->getArguments()Ljava/util/List;

    .line 252
    move-result-object v10

    .line 253
    .line 254
    .line 255
    invoke-interface {v9}, Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;->getIndex()I

    .line 256
    move-result v13

    .line 257
    .line 258
    .line 259
    invoke-static {v10, v13}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 260
    move-result-object v10

    .line 261
    .line 262
    check-cast v10, Lkotlin/reflect/jvm/internal/impl/types/TypeProjection;

    .line 263
    .line 264
    if-eqz p4, :cond_8

    .line 265
    .line 266
    if-eqz v10, :cond_8

    .line 267
    .line 268
    .line 269
    invoke-interface {v10}, Lkotlin/reflect/jvm/internal/impl/types/TypeProjection;->getType()Lkotlin/reflect/jvm/internal/impl/types/KotlinType;

    .line 270
    move-result-object v13

    .line 271
    .line 272
    if-eqz v13, :cond_8

    .line 273
    .line 274
    .line 275
    invoke-static {v13}, Lkotlin/reflect/jvm/internal/impl/types/typeUtil/TypeUtilsKt;->containsTypeParameter(Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Z

    .line 276
    move-result v13

    .line 277
    .line 278
    if-nez v13, :cond_8

    .line 279
    goto :goto_6

    .line 280
    .line 281
    :cond_8
    if-eqz v1, :cond_9

    .line 282
    .line 283
    .line 284
    invoke-interface {v1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 285
    move-result v13

    .line 286
    .line 287
    if-eqz v13, :cond_9

    .line 288
    const/4 v13, 0x1

    .line 289
    goto :goto_5

    .line 290
    :cond_9
    const/4 v13, 0x0

    .line 291
    .line 292
    :goto_5
    if-eqz v10, :cond_a

    .line 293
    .line 294
    if-nez v13, :cond_a

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutor;->getSubstitution()Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitution;

    .line 298
    move-result-object v13

    .line 299
    .line 300
    .line 301
    invoke-interface {v10}, Lkotlin/reflect/jvm/internal/impl/types/TypeProjection;->getType()Lkotlin/reflect/jvm/internal/impl/types/KotlinType;

    .line 302
    move-result-object v14

    .line 303
    .line 304
    .line 305
    invoke-static {v14, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v13, v14}, Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitution;->get(Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Lkotlin/reflect/jvm/internal/impl/types/TypeProjection;

    .line 309
    move-result-object v13

    .line 310
    .line 311
    if-nez v13, :cond_b

    .line 312
    .line 313
    :cond_a
    new-instance v10, Lkotlin/reflect/jvm/internal/impl/types/StarProjectionImpl;

    .line 314
    .line 315
    .line 316
    invoke-direct {v10, v9}, Lkotlin/reflect/jvm/internal/impl/types/StarProjectionImpl;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;)V

    .line 317
    .line 318
    .line 319
    :cond_b
    :goto_6
    invoke-interface {v8, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 320
    goto :goto_4

    .line 321
    .line 322
    .line 323
    :cond_c
    invoke-static {v4, v8, v11, v5, v11}, Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutionKt;->replace$default(Lkotlin/reflect/jvm/internal/impl/types/SimpleType;Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/types/TypeAttributes;ILjava/lang/Object;)Lkotlin/reflect/jvm/internal/impl/types/SimpleType;

    .line 324
    move-result-object v4

    .line 325
    .line 326
    .line 327
    :cond_d
    :goto_7
    invoke-static {v12, v4}, Lkotlin/reflect/jvm/internal/impl/types/KotlinTypeFactory;->flexibleType(Lkotlin/reflect/jvm/internal/impl/types/SimpleType;Lkotlin/reflect/jvm/internal/impl/types/SimpleType;)Lkotlin/reflect/jvm/internal/impl/types/UnwrappedType;

    .line 328
    move-result-object v1

    .line 329
    .line 330
    goto/16 :goto_c

    .line 331
    .line 332
    :cond_e
    instance-of v4, v2, Lkotlin/reflect/jvm/internal/impl/types/SimpleType;

    .line 333
    .line 334
    if-eqz v4, :cond_16

    .line 335
    move-object v4, v2

    .line 336
    .line 337
    check-cast v4, Lkotlin/reflect/jvm/internal/impl/types/SimpleType;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/impl/types/KotlinType;->getConstructor()Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;

    .line 341
    move-result-object v7

    .line 342
    .line 343
    .line 344
    invoke-interface {v7}, Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;->getParameters()Ljava/util/List;

    .line 345
    move-result-object v7

    .line 346
    .line 347
    .line 348
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 349
    move-result v7

    .line 350
    .line 351
    if-nez v7, :cond_15

    .line 352
    .line 353
    .line 354
    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/impl/types/KotlinType;->getConstructor()Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;

    .line 355
    move-result-object v7

    .line 356
    .line 357
    .line 358
    invoke-interface {v7}, Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;->getDeclarationDescriptor()Lkotlin/reflect/jvm/internal/impl/descriptors/ClassifierDescriptor;

    .line 359
    move-result-object v7

    .line 360
    .line 361
    if-nez v7, :cond_f

    .line 362
    .line 363
    goto/16 :goto_b

    .line 364
    .line 365
    .line 366
    :cond_f
    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/impl/types/KotlinType;->getConstructor()Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;

    .line 367
    move-result-object v7

    .line 368
    .line 369
    .line 370
    invoke-interface {v7}, Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;->getParameters()Ljava/util/List;

    .line 371
    move-result-object v7

    .line 372
    .line 373
    .line 374
    invoke-static {v7, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 375
    .line 376
    new-instance v8, Ljava/util/ArrayList;

    .line 377
    .line 378
    const/16 v9, 0xa

    .line 379
    .line 380
    .line 381
    invoke-static {v7, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 382
    move-result v9

    .line 383
    .line 384
    .line 385
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 386
    .line 387
    .line 388
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 389
    move-result-object v7

    .line 390
    .line 391
    .line 392
    :goto_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 393
    move-result v9

    .line 394
    .line 395
    if-eqz v9, :cond_14

    .line 396
    .line 397
    .line 398
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 399
    move-result-object v9

    .line 400
    .line 401
    check-cast v9, Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v3}, Lkotlin/reflect/jvm/internal/impl/types/KotlinType;->getArguments()Ljava/util/List;

    .line 405
    move-result-object v10

    .line 406
    .line 407
    .line 408
    invoke-interface {v9}, Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;->getIndex()I

    .line 409
    move-result v12

    .line 410
    .line 411
    .line 412
    invoke-static {v10, v12}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 413
    move-result-object v10

    .line 414
    .line 415
    check-cast v10, Lkotlin/reflect/jvm/internal/impl/types/TypeProjection;

    .line 416
    .line 417
    if-eqz p4, :cond_10

    .line 418
    .line 419
    if-eqz v10, :cond_10

    .line 420
    .line 421
    .line 422
    invoke-interface {v10}, Lkotlin/reflect/jvm/internal/impl/types/TypeProjection;->getType()Lkotlin/reflect/jvm/internal/impl/types/KotlinType;

    .line 423
    move-result-object v12

    .line 424
    .line 425
    if-eqz v12, :cond_10

    .line 426
    .line 427
    .line 428
    invoke-static {v12}, Lkotlin/reflect/jvm/internal/impl/types/typeUtil/TypeUtilsKt;->containsTypeParameter(Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Z

    .line 429
    move-result v12

    .line 430
    .line 431
    if-nez v12, :cond_10

    .line 432
    goto :goto_a

    .line 433
    .line 434
    :cond_10
    if-eqz v1, :cond_11

    .line 435
    .line 436
    .line 437
    invoke-interface {v1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 438
    move-result v12

    .line 439
    .line 440
    if-eqz v12, :cond_11

    .line 441
    const/4 v12, 0x1

    .line 442
    goto :goto_9

    .line 443
    :cond_11
    const/4 v12, 0x0

    .line 444
    .line 445
    :goto_9
    if-eqz v10, :cond_12

    .line 446
    .line 447
    if-nez v12, :cond_12

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutor;->getSubstitution()Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitution;

    .line 451
    move-result-object v12

    .line 452
    .line 453
    .line 454
    invoke-interface {v10}, Lkotlin/reflect/jvm/internal/impl/types/TypeProjection;->getType()Lkotlin/reflect/jvm/internal/impl/types/KotlinType;

    .line 455
    move-result-object v13

    .line 456
    .line 457
    .line 458
    invoke-static {v13, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12, v13}, Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitution;->get(Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Lkotlin/reflect/jvm/internal/impl/types/TypeProjection;

    .line 462
    move-result-object v12

    .line 463
    .line 464
    if-nez v12, :cond_13

    .line 465
    .line 466
    :cond_12
    new-instance v10, Lkotlin/reflect/jvm/internal/impl/types/StarProjectionImpl;

    .line 467
    .line 468
    .line 469
    invoke-direct {v10, v9}, Lkotlin/reflect/jvm/internal/impl/types/StarProjectionImpl;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;)V

    .line 470
    .line 471
    .line 472
    :cond_13
    :goto_a
    invoke-interface {v8, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 473
    goto :goto_8

    .line 474
    .line 475
    .line 476
    :cond_14
    invoke-static {v4, v8, v11, v5, v11}, Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutionKt;->replace$default(Lkotlin/reflect/jvm/internal/impl/types/SimpleType;Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/types/TypeAttributes;ILjava/lang/Object;)Lkotlin/reflect/jvm/internal/impl/types/SimpleType;

    .line 477
    move-result-object v1

    .line 478
    goto :goto_c

    .line 479
    :cond_15
    :goto_b
    move-object v1, v4

    .line 480
    .line 481
    .line 482
    :goto_c
    invoke-static {v1, v2}, Lkotlin/reflect/jvm/internal/impl/types/TypeWithEnhancementKt;->inheritEnhancement(Lkotlin/reflect/jvm/internal/impl/types/UnwrappedType;Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Lkotlin/reflect/jvm/internal/impl/types/UnwrappedType;

    .line 483
    move-result-object v1

    .line 484
    .line 485
    sget-object v2, Lkotlin/reflect/jvm/internal/impl/types/Variance;->OUT_VARIANCE:Lkotlin/reflect/jvm/internal/impl/types/Variance;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v0, v1, v2}, Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutor;->safeSubstitute(Lkotlin/reflect/jvm/internal/impl/types/KotlinType;Lkotlin/reflect/jvm/internal/impl/types/Variance;)Lkotlin/reflect/jvm/internal/impl/types/KotlinType;

    .line 489
    move-result-object v0

    .line 490
    .line 491
    const-string v1, "safeSubstitute(...)"

    .line 492
    .line 493
    .line 494
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 495
    return-object v0

    .line 496
    .line 497
    :cond_16
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 498
    .line 499
    .line 500
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 501
    throw v0
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
.end method
