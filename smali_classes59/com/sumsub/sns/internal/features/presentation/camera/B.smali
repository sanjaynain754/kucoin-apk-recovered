.class public final Lcom/sumsub/sns/internal/features/presentation/camera/B;
.super Lcom/sumsub/sns/internal/core/presentation/common/t;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic n:[Lkotlin/reflect/KProperty;


# instance fields
.field public final e:Lkotlin/jvm/functions/Function0;

.field public final f:Lkotlin/jvm/functions/Function1;

.field public final g:Lcom/sumsub/sns/internal/features/presentation/camera/A;

.field public final h:Ljava/lang/String;

.field public final i:Lkotlin/Lazy;

.field public final j:Lcom/sumsub/sns/internal/core/presentation/common/k;

.field public final k:Lkotlin/Lazy;

.field public l:Z

.field public final m:Lcom/sumsub/sns/internal/core/presentation/common/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/camera/B;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "toolbar"

    .line 6
    .line 7
    const-string v2, "getToolbar()Lcom/sumsub/sns/core/widget/SNSToolbarView;"

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    const-string v2, "_isFlashOn"

    .line 15
    .line 16
    const-string v4, "get_isFlashOn()Z"

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 20
    move-result-object v0

    .line 21
    const/4 v2, 0x2

    .line 22
    .line 23
    new-array v2, v2, [Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    aput-object v1, v2, v3

    .line 26
    const/4 v1, 0x1

    .line 27
    .line 28
    aput-object v0, v2, v1

    .line 29
    .line 30
    sput-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/B;->n:[Lkotlin/reflect/KProperty;

    .line 31
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
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/t;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/sumsub/sns/internal/features/presentation/camera/A;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/presentation/common/t;)V

    .line 6
    .line 7
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->e:Lkotlin/jvm/functions/Function0;

    .line 8
    .line 9
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->f:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->g:Lcom/sumsub/sns/internal/features/presentation/camera/A;

    .line 12
    .line 13
    const-string p1, "CameraToolbar"

    .line 14
    .line 15
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->h:Ljava/lang/String;

    .line 16
    .line 17
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/b0;

    .line 18
    .line 19
    .line 20
    invoke-direct {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/b0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->i:Lkotlin/Lazy;

    .line 27
    .line 28
    iget p1, p5, Lcom/sumsub/sns/internal/features/presentation/camera/A;->a:I

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->j:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 35
    .line 36
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/c0;

    .line 37
    .line 38
    .line 39
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/c0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/B;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->k:Lkotlin/Lazy;

    .line 46
    .line 47
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/common/i;

    .line 48
    .line 49
    const-string p2, "FLASH_IS_ON"

    .line 50
    const/4 p3, 0x0

    .line 51
    .line 52
    .line 53
    invoke-direct {p1, p2, p3}, Lcom/sumsub/sns/internal/core/presentation/common/i;-><init>(Ljava/lang/String;Z)V

    .line 54
    .line 55
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->m:Lcom/sumsub/sns/internal/core/presentation/common/i;

    .line 56
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/B;)I
    .locals 4

    .line 1
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    instance-of v2, v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    if-eqz v2, :cond_1

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_4

    .line 2
    sget-object v2, Lcom/sumsub/sns/core/theme/SNSColorElement;->CAMERA_CONTENT:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 3
    iget-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 4
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v3

    .line 5
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    invoke-static {v3}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/content/res/Configuration;)Z

    move-result v3

    .line 6
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;->c:Ljava/util/Map;

    if-eqz v0, :cond_3

    .line 7
    invoke-virtual {v2}, Lcom/sumsub/sns/core/theme/SNSColorElement;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/theme/c;

    if-eqz v0, :cond_3

    if-eqz v3, :cond_2

    .line 8
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/theme/c;->a:Ljava/lang/Integer;

    goto :goto_2

    .line 9
    :cond_2
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/theme/c;->b:Ljava/lang/Integer;

    :cond_3
    :goto_2
    if-eqz v1, :cond_4

    .line 10
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    .line 11
    :cond_4
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p0

    .line 13
    sget v0, Lcom/sumsub/sns/R$color;->sns_cameraContent:I

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p0

    return p0
.end method

.method public static final a(Lkotlin/jvm/functions/Function0;)Lcom/sumsub/sns/internal/features/presentation/camera/y;
    .locals 0

    .line 14
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/y;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/B;Lcom/sumsub/sns/internal/features/presentation/camera/x;)Lkotlin/Unit;
    .locals 3

    .line 15
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->j:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 16
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/B;->n:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/core/widget/SNSToolbarView;

    if-eqz p0, :cond_0

    .line 17
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->getTitleView()Landroid/widget/TextView;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 18
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/x;->a:Ljava/lang/CharSequence;

    .line 19
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/B;Landroid/view/View;)V
    .locals 7

    .line 21
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 22
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    move-result-object v0

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 23
    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/camera/B;Landroid/view/View;)V
    .locals 4

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->m:Lcom/sumsub/sns/internal/core/presentation/common/i;

    .line 3
    .line 4
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->n:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    aget-object v2, v0, v1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p0}, Lcom/sumsub/sns/internal/core/presentation/common/i;->a(Lcom/sumsub/sns/internal/core/presentation/common/t;)Z

    .line 11
    move-result p1

    .line 12
    xor-int/2addr p1, v1

    .line 13
    .line 14
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->m:Lcom/sumsub/sns/internal/core/presentation/common/i;

    .line 15
    .line 16
    aget-object v3, v0, v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    iget-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/common/i;->a:Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v2}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v2, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/B;->o()V

    .line 40
    .line 41
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->f:Lkotlin/jvm/functions/Function1;

    .line 42
    .line 43
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->m:Lcom/sumsub/sns/internal/core/presentation/common/i;

    .line 44
    .line 45
    aget-object v0, v0, v1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, p0}, Lcom/sumsub/sns/internal/core/presentation/common/i;->a(Lcom/sumsub/sns/internal/core/presentation/common/t;)Z

    .line 49
    move-result p0

    .line 50
    .line 51
    .line 52
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    move-result-object p0

    .line 54
    .line 55
    .line 56
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    return-void
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
.end method


# virtual methods
.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->h:Ljava/lang/String;

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
.end method

.method public final i()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->e:Lkotlin/jvm/functions/Function0;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/z;

    .line 9
    .line 10
    iget-boolean v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/z;->a:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->l:Z

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final l()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->i:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/y;

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/a0;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/a0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/B;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Lcom/sumsub/sns/internal/core/presentation/common/g;Lkotlin/jvm/functions/Function1;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/B;->n()V

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

.method public final n()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->j:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/B;->n:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->g:Lcom/sumsub/sns/internal/features/presentation/camera/A;

    .line 18
    .line 19
    iget v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/A;->b:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->initTitle(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->getTitleView()Landroid/widget/TextView;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->k:Lkotlin/Lazy;

    .line 31
    .line 32
    .line 33
    invoke-interface {v2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    check-cast v2, Ljava/lang/Number;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 40
    move-result v2

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 44
    .line 45
    :cond_0
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/d0;

    .line 46
    .line 47
    .line 48
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/d0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/B;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setOnCloseButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 52
    .line 53
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/e0;

    .line 54
    .line 55
    .line 56
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/e0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/B;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setOnOptionButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 60
    .line 61
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->k:Lkotlin/Lazy;

    .line 62
    .line 63
    .line 64
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 65
    move-result-object v1

    .line 66
    .line 67
    check-cast v1, Ljava/lang/Number;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 71
    move-result v1

    .line 72
    .line 73
    .line 74
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 75
    move-result-object v1

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 79
    .line 80
    .line 81
    :cond_1
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/B;->o()V

    .line 82
    return-void
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

.method public final o()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->j:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/B;->n:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    aget-object v3, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0, v3}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-boolean v3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->l:Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v3}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setOptionButtonVisible(Z)V

    .line 21
    .line 22
    :cond_0
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->l:Z

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    iget-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->m:Lcom/sumsub/sns/internal/core/presentation/common/i;

    .line 39
    const/4 v5, 0x1

    .line 40
    .line 41
    aget-object v5, v1, v5

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, p0}, Lcom/sumsub/sns/internal/core/presentation/common/i;->a(Lcom/sumsub/sns/internal/core/presentation/common/t;)Z

    .line 45
    move-result v4

    .line 46
    .line 47
    if-eqz v4, :cond_1

    .line 48
    .line 49
    sget-object v4, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->TORCH_ON:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-virtual {v4}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 53
    move-result-object v4

    .line 54
    goto :goto_1

    .line 55
    .line 56
    :cond_1
    sget-object v4, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->TORCH_OFF:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 57
    goto :goto_0

    .line 58
    .line 59
    .line 60
    :goto_1
    invoke-interface {v0, v3, v4}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/B;->j:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 64
    .line 65
    aget-object v1, v1, v2

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, p0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 69
    move-result-object v1

    .line 70
    .line 71
    check-cast v1, Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 72
    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v0}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setOptionButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 77
    :cond_2
    return-void
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
