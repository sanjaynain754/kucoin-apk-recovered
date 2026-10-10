.class public final synthetic Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/v;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/w;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    const-string/jumbo v5, "onState(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/MrtdLayoutController$State;)V"

    .line 4
    const/4 v6, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    const-class v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/w;

    .line 8
    .line 9
    .line 10
    const-string/jumbo v4, "onState"

    .line 11
    move-object v0, p0

    .line 12
    move-object v2, p1

    .line 13
    .line 14
    .line 15
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/s;)V
    .locals 25

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    iget-object v2, v0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/w;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    instance-of v3, v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/p;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/MrtdLayoutHandler$LayoutState;->INTRO:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/MrtdLayoutHandler$LayoutState;

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_0
    instance-of v4, v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/q;

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/MrtdLayoutHandler$LayoutState;->READING:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/MrtdLayoutHandler$LayoutState;

    .line 25
    goto :goto_0

    .line 26
    .line 27
    :cond_1
    instance-of v4, v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/r;

    .line 28
    .line 29
    if-eqz v4, :cond_2

    .line 30
    .line 31
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/MrtdLayoutHandler$LayoutState;->READING:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/MrtdLayoutHandler$LayoutState;

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :cond_2
    instance-of v4, v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/n;

    .line 35
    .line 36
    if-eqz v4, :cond_3

    .line 37
    .line 38
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/MrtdLayoutHandler$LayoutState;->RESULT_SUCCESS:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/MrtdLayoutHandler$LayoutState;

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :cond_3
    instance-of v4, v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/o;

    .line 42
    .line 43
    if-eqz v4, :cond_2f

    .line 44
    .line 45
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/MrtdLayoutHandler$LayoutState;->RESULT_ERROR:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/MrtdLayoutHandler$LayoutState;

    .line 46
    .line 47
    :goto_0
    iget-object v5, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/w;->p:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/MrtdLayoutHandler$LayoutState;

    .line 48
    const/4 v6, 0x1

    .line 49
    .line 50
    if-eq v4, v5, :cond_4

    .line 51
    move v5, v6

    .line 52
    goto :goto_1

    .line 53
    :cond_4
    const/4 v5, 0x0

    .line 54
    :goto_1
    const/4 v9, 0x4

    .line 55
    .line 56
    const/16 v10, 0x8

    .line 57
    .line 58
    if-eqz v5, :cond_17

    .line 59
    .line 60
    iput-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/w;->p:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/MrtdLayoutHandler$LayoutState;

    .line 61
    .line 62
    iget-object v11, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/w;->o:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/c;

    .line 63
    .line 64
    sget-object v12, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/u;->a:[I

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 68
    move-result v13

    .line 69
    .line 70
    aget v13, v12, v13

    .line 71
    const/4 v14, 0x3

    .line 72
    const/4 v15, 0x2

    .line 73
    .line 74
    if-eq v13, v6, :cond_8

    .line 75
    .line 76
    if-eq v13, v15, :cond_7

    .line 77
    .line 78
    if-eq v13, v14, :cond_6

    .line 79
    .line 80
    if-ne v13, v9, :cond_5

    .line 81
    .line 82
    sget-object v13, Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;->MRTD_FAILED:Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;

    .line 83
    goto :goto_2

    .line 84
    .line 85
    :cond_5
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 86
    .line 87
    .line 88
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 89
    throw v1

    .line 90
    .line 91
    :cond_6
    sget-object v13, Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;->MRTD_SCANNED:Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;

    .line 92
    goto :goto_2

    .line 93
    .line 94
    :cond_7
    sget-object v13, Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;->MRTD_SCANNING:Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;

    .line 95
    goto :goto_2

    .line 96
    .line 97
    :cond_8
    sget-object v13, Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;->MRTD_PREPARING:Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;

    .line 98
    .line 99
    :goto_2
    iget-object v8, v11, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/c;->g:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 100
    .line 101
    sget-object v16, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/c;->i:[Lkotlin/reflect/KProperty;

    .line 102
    .line 103
    const/16 v17, 0x0

    .line 104
    .line 105
    aget-object v7, v16, v17

    .line 106
    .line 107
    .line 108
    invoke-virtual {v8, v11, v7}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 109
    move-result-object v7

    .line 110
    .line 111
    check-cast v7, Landroid/widget/FrameLayout;

    .line 112
    .line 113
    if-eqz v7, :cond_9

    .line 114
    .line 115
    .line 116
    invoke-virtual {v7}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 117
    .line 118
    :cond_9
    sget-object v7, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v7}, Lcom/sumsub/sns/internal/core/common/k0;->getInstructionsViewHandler()Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;

    .line 122
    move-result-object v18

    .line 123
    .line 124
    if-eqz v18, :cond_a

    .line 125
    .line 126
    iget-object v7, v11, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 130
    move-result-object v19

    .line 131
    .line 132
    iget-object v7, v11, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/c;->e:Lkotlin/jvm/functions/Function0;

    .line 133
    .line 134
    .line 135
    invoke-interface {v7}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 136
    move-result-object v7

    .line 137
    .line 138
    check-cast v7, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/b;

    .line 139
    .line 140
    iget-object v7, v7, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/b;->a:Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v13}, Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;->getSceneName()Ljava/lang/String;

    .line 144
    move-result-object v22

    .line 145
    .line 146
    sget-object v8, Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler$Position;->FULLSCREEN:Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler$Position;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v8}, Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler$Position;->getValue()Ljava/lang/String;

    .line 150
    move-result-object v23

    .line 151
    .line 152
    iget-object v8, v11, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/c;->e:Lkotlin/jvm/functions/Function0;

    .line 153
    .line 154
    .line 155
    invoke-interface {v8}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 156
    move-result-object v8

    .line 157
    .line 158
    check-cast v8, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/b;

    .line 159
    .line 160
    iget-object v8, v8, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/b;->b:Ljava/lang/String;

    .line 161
    .line 162
    const-string v20, "IDENTITY"

    .line 163
    .line 164
    move-object/from16 v21, v7

    .line 165
    .line 166
    move-object/from16 v24, v8

    .line 167
    .line 168
    .line 169
    invoke-interface/range {v18 .. v24}, Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;->onVerificationStep(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 170
    move-result-object v7

    .line 171
    goto :goto_3

    .line 172
    :cond_a
    const/4 v7, 0x0

    .line 173
    .line 174
    :goto_3
    if-eqz v7, :cond_c

    .line 175
    .line 176
    iget-object v8, v11, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/c;->g:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 177
    .line 178
    aget-object v13, v16, v17

    .line 179
    .line 180
    .line 181
    invoke-virtual {v8, v11, v13}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 182
    move-result-object v8

    .line 183
    .line 184
    check-cast v8, Landroid/widget/FrameLayout;

    .line 185
    .line 186
    if-eqz v8, :cond_b

    .line 187
    .line 188
    new-instance v13, Landroid/widget/FrameLayout$LayoutParams;

    .line 189
    const/4 v9, -0x1

    .line 190
    .line 191
    .line 192
    invoke-direct {v13, v9, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v8, v7, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 196
    :cond_b
    move v7, v6

    .line 197
    goto :goto_4

    .line 198
    .line 199
    :cond_c
    move/from16 v7, v17

    .line 200
    .line 201
    :goto_4
    iput-boolean v7, v11, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/c;->h:Z

    .line 202
    .line 203
    iget-object v7, v11, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/c;->g:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 204
    .line 205
    aget-object v8, v16, v17

    .line 206
    .line 207
    .line 208
    invoke-virtual {v7, v11, v8}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 209
    move-result-object v7

    .line 210
    .line 211
    check-cast v7, Landroid/widget/FrameLayout;

    .line 212
    .line 213
    if-eqz v7, :cond_e

    .line 214
    .line 215
    iget-boolean v8, v11, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/c;->h:Z

    .line 216
    .line 217
    if-eqz v8, :cond_d

    .line 218
    .line 219
    move/from16 v8, v17

    .line 220
    goto :goto_5

    .line 221
    :cond_d
    move v8, v10

    .line 222
    .line 223
    .line 224
    :goto_5
    invoke-virtual {v7, v8}, Landroid/view/View;->setVisibility(I)V

    .line 225
    .line 226
    :cond_e
    iget-object v7, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/w;->h:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 227
    .line 228
    sget-object v8, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/w;->q:[Lkotlin/reflect/KProperty;

    .line 229
    .line 230
    aget-object v9, v8, v17

    .line 231
    .line 232
    .line 233
    invoke-virtual {v7, v2, v9}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 234
    move-result-object v7

    .line 235
    .line 236
    check-cast v7, Landroid/view/View;

    .line 237
    .line 238
    if-eqz v7, :cond_f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v7, v10}, Landroid/view/View;->setVisibility(I)V

    .line 242
    .line 243
    :cond_f
    iget-object v7, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/w;->i:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 244
    .line 245
    aget-object v9, v8, v6

    .line 246
    .line 247
    .line 248
    invoke-virtual {v7, v2, v9}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 249
    move-result-object v7

    .line 250
    .line 251
    check-cast v7, Landroidx/constraintlayout/widget/Group;

    .line 252
    .line 253
    if-eqz v7, :cond_10

    .line 254
    .line 255
    .line 256
    invoke-virtual {v7, v10}, Landroid/view/View;->setVisibility(I)V

    .line 257
    .line 258
    :cond_10
    iget-object v7, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/w;->j:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 259
    .line 260
    aget-object v9, v8, v15

    .line 261
    .line 262
    .line 263
    invoke-virtual {v7, v2, v9}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 264
    move-result-object v7

    .line 265
    .line 266
    check-cast v7, Landroidx/constraintlayout/widget/Group;

    .line 267
    .line 268
    if-eqz v7, :cond_11

    .line 269
    .line 270
    .line 271
    invoke-virtual {v7, v10}, Landroid/view/View;->setVisibility(I)V

    .line 272
    .line 273
    :cond_11
    iget-object v7, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/w;->o:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/c;

    .line 274
    .line 275
    iget-boolean v7, v7, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/c;->h:Z

    .line 276
    .line 277
    if-nez v7, :cond_16

    .line 278
    .line 279
    .line 280
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 281
    move-result v4

    .line 282
    .line 283
    aget v4, v12, v4

    .line 284
    .line 285
    if-eq v4, v6, :cond_15

    .line 286
    .line 287
    if-eq v4, v15, :cond_14

    .line 288
    .line 289
    if-eq v4, v14, :cond_13

    .line 290
    const/4 v7, 0x4

    .line 291
    .line 292
    if-ne v4, v7, :cond_12

    .line 293
    goto :goto_6

    .line 294
    .line 295
    :cond_12
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 296
    .line 297
    .line 298
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 299
    throw v1

    .line 300
    .line 301
    :cond_13
    :goto_6
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/w;->j:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 302
    .line 303
    aget-object v7, v8, v15

    .line 304
    .line 305
    .line 306
    invoke-virtual {v4, v2, v7}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 307
    move-result-object v4

    .line 308
    .line 309
    check-cast v4, Landroidx/constraintlayout/widget/Group;

    .line 310
    .line 311
    if-eqz v4, :cond_16

    .line 312
    .line 313
    move/from16 v7, v17

    .line 314
    .line 315
    .line 316
    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    .line 317
    goto :goto_7

    .line 318
    .line 319
    :cond_14
    move/from16 v7, v17

    .line 320
    .line 321
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/w;->i:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 322
    .line 323
    aget-object v8, v8, v6

    .line 324
    .line 325
    .line 326
    invoke-virtual {v4, v2, v8}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 327
    move-result-object v4

    .line 328
    .line 329
    check-cast v4, Landroidx/constraintlayout/widget/Group;

    .line 330
    .line 331
    if-eqz v4, :cond_16

    .line 332
    .line 333
    .line 334
    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    .line 335
    goto :goto_7

    .line 336
    .line 337
    :cond_15
    move/from16 v7, v17

    .line 338
    .line 339
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/w;->h:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 340
    .line 341
    aget-object v8, v8, v7

    .line 342
    .line 343
    .line 344
    invoke-virtual {v4, v2, v8}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 345
    move-result-object v4

    .line 346
    .line 347
    check-cast v4, Landroid/view/View;

    .line 348
    .line 349
    if-eqz v4, :cond_16

    .line 350
    .line 351
    .line 352
    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    .line 353
    .line 354
    .line 355
    :cond_16
    :goto_7
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/w;->n()V

    .line 356
    .line 357
    .line 358
    :cond_17
    invoke-virtual {v2, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/w;->a(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/s;)V

    .line 359
    .line 360
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/w;->o:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/c;

    .line 361
    .line 362
    iget-boolean v4, v4, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/c;->h:Z

    .line 363
    .line 364
    if-nez v4, :cond_2e

    .line 365
    .line 366
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/w;->n:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;

    .line 367
    .line 368
    if-eqz v5, :cond_1a

    .line 369
    .line 370
    if-eqz v3, :cond_19

    .line 371
    .line 372
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->h:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 373
    .line 374
    sget-object v7, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->r:[Lkotlin/reflect/KProperty;

    .line 375
    .line 376
    const/16 v17, 0x0

    .line 377
    .line 378
    aget-object v8, v7, v17

    .line 379
    .line 380
    .line 381
    invoke-virtual {v4, v2, v8}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 382
    move-result-object v4

    .line 383
    .line 384
    check-cast v4, Lcom/airbnb/lottie/LottieAnimationView;

    .line 385
    .line 386
    if-eqz v4, :cond_18

    .line 387
    .line 388
    iget-object v8, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->f:Lkotlin/jvm/functions/Function0;

    .line 389
    .line 390
    .line 391
    invoke-interface {v8}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 392
    move-result-object v8

    .line 393
    .line 394
    check-cast v8, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/x;

    .line 395
    .line 396
    iget v8, v8, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/x;->a:I

    .line 397
    .line 398
    .line 399
    invoke-virtual {v4, v8}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimation(I)V

    .line 400
    .line 401
    :cond_18
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->h:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 402
    .line 403
    const/16 v17, 0x0

    .line 404
    .line 405
    aget-object v7, v7, v17

    .line 406
    .line 407
    .line 408
    invoke-virtual {v4, v2, v7}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 409
    move-result-object v4

    .line 410
    .line 411
    check-cast v4, Lcom/airbnb/lottie/LottieAnimationView;

    .line 412
    .line 413
    if-eqz v4, :cond_1a

    .line 414
    .line 415
    .line 416
    invoke-virtual {v4}, Lcom/airbnb/lottie/LottieAnimationView;->playAnimation()V

    .line 417
    goto :goto_8

    .line 418
    .line 419
    :cond_19
    const/16 v17, 0x0

    .line 420
    .line 421
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->h:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 422
    .line 423
    sget-object v7, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->r:[Lkotlin/reflect/KProperty;

    .line 424
    .line 425
    aget-object v7, v7, v17

    .line 426
    .line 427
    .line 428
    invoke-virtual {v4, v2, v7}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 429
    move-result-object v4

    .line 430
    .line 431
    check-cast v4, Lcom/airbnb/lottie/LottieAnimationView;

    .line 432
    .line 433
    if-eqz v4, :cond_1a

    .line 434
    .line 435
    .line 436
    invoke-virtual {v4}, Lcom/airbnb/lottie/LottieAnimationView;->cancelAnimation()V

    .line 437
    .line 438
    :cond_1a
    :goto_8
    if-eqz v3, :cond_1b

    .line 439
    .line 440
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/p;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->a(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/p;)V

    .line 444
    return-void

    .line 445
    .line 446
    :cond_1b
    instance-of v3, v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/q;

    .line 447
    const/4 v4, 0x5

    .line 448
    const/4 v7, 0x6

    .line 449
    .line 450
    if-eqz v3, :cond_1e

    .line 451
    .line 452
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/q;

    .line 453
    .line 454
    iget-object v3, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->l:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 455
    .line 456
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->r:[Lkotlin/reflect/KProperty;

    .line 457
    .line 458
    const/16 v18, 0x4

    .line 459
    .line 460
    aget-object v8, v5, v18

    .line 461
    .line 462
    .line 463
    invoke-virtual {v3, v2, v8}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 464
    move-result-object v3

    .line 465
    .line 466
    check-cast v3, Landroid/widget/TextView;

    .line 467
    .line 468
    if-eqz v3, :cond_1c

    .line 469
    .line 470
    iget-object v8, v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/q;->a:Ljava/lang/CharSequence;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 474
    .line 475
    :cond_1c
    iget-object v3, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->m:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 476
    .line 477
    aget-object v4, v5, v4

    .line 478
    .line 479
    .line 480
    invoke-virtual {v3, v2, v4}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 481
    move-result-object v3

    .line 482
    .line 483
    check-cast v3, Landroid/widget/TextView;

    .line 484
    .line 485
    if-eqz v3, :cond_1d

    .line 486
    .line 487
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/q;->b:Ljava/lang/CharSequence;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 491
    .line 492
    :cond_1d
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->n:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 493
    .line 494
    aget-object v3, v5, v7

    .line 495
    .line 496
    .line 497
    invoke-virtual {v1, v2, v3}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 498
    move-result-object v1

    .line 499
    .line 500
    check-cast v1, Lcom/sumsub/sns/core/widget/SNSHorizontalProgressBarView;

    .line 501
    .line 502
    if-eqz v1, :cond_2e

    .line 503
    .line 504
    .line 505
    invoke-virtual {v1, v6}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 506
    return-void

    .line 507
    .line 508
    :cond_1e
    instance-of v3, v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/r;

    .line 509
    .line 510
    if-eqz v3, :cond_23

    .line 511
    .line 512
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/r;

    .line 513
    .line 514
    if-eqz v5, :cond_20

    .line 515
    .line 516
    iget-object v3, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->n:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 517
    .line 518
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->r:[Lkotlin/reflect/KProperty;

    .line 519
    .line 520
    aget-object v8, v5, v7

    .line 521
    .line 522
    .line 523
    invoke-virtual {v3, v2, v8}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 524
    move-result-object v3

    .line 525
    .line 526
    check-cast v3, Lcom/sumsub/sns/core/widget/SNSHorizontalProgressBarView;

    .line 527
    const/4 v8, 0x0

    .line 528
    .line 529
    if-eqz v3, :cond_1f

    .line 530
    .line 531
    .line 532
    invoke-virtual {v3, v8}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 533
    .line 534
    :cond_1f
    iget-object v3, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->n:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 535
    .line 536
    aget-object v5, v5, v7

    .line 537
    .line 538
    .line 539
    invoke-virtual {v3, v2, v5}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 540
    move-result-object v3

    .line 541
    .line 542
    check-cast v3, Lcom/sumsub/sns/core/widget/SNSHorizontalProgressBarView;

    .line 543
    .line 544
    if-eqz v3, :cond_20

    .line 545
    .line 546
    .line 547
    invoke-virtual {v3, v8}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 548
    .line 549
    :cond_20
    iget-object v3, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->l:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 550
    .line 551
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->r:[Lkotlin/reflect/KProperty;

    .line 552
    .line 553
    const/16 v18, 0x4

    .line 554
    .line 555
    aget-object v8, v5, v18

    .line 556
    .line 557
    .line 558
    invoke-virtual {v3, v2, v8}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 559
    move-result-object v3

    .line 560
    .line 561
    check-cast v3, Landroid/widget/TextView;

    .line 562
    .line 563
    if-eqz v3, :cond_21

    .line 564
    .line 565
    iget-object v8, v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/r;->a:Ljava/lang/CharSequence;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 569
    .line 570
    :cond_21
    iget-object v3, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->m:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 571
    .line 572
    aget-object v4, v5, v4

    .line 573
    .line 574
    .line 575
    invoke-virtual {v3, v2, v4}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 576
    move-result-object v3

    .line 577
    .line 578
    check-cast v3, Landroid/widget/TextView;

    .line 579
    .line 580
    if-eqz v3, :cond_22

    .line 581
    .line 582
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/r;->b:Ljava/lang/CharSequence;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 586
    .line 587
    :cond_22
    iget-object v3, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->n:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 588
    .line 589
    aget-object v4, v5, v7

    .line 590
    .line 591
    .line 592
    invoke-virtual {v3, v2, v4}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 593
    move-result-object v2

    .line 594
    .line 595
    check-cast v2, Lcom/sumsub/sns/core/widget/SNSHorizontalProgressBarView;

    .line 596
    .line 597
    if-eqz v2, :cond_2e

    .line 598
    .line 599
    iget v1, v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/r;->d:I

    .line 600
    .line 601
    .line 602
    invoke-virtual {v2, v1, v6}, Lcom/google/android/material/progressindicator/LinearProgressIndicator;->setProgressCompat(IZ)V

    .line 603
    return-void

    .line 604
    .line 605
    :cond_23
    instance-of v3, v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/n;

    .line 606
    .line 607
    const/16 v4, 0x9

    .line 608
    .line 609
    if-eqz v3, :cond_29

    .line 610
    .line 611
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/n;

    .line 612
    .line 613
    if-eqz v5, :cond_27

    .line 614
    .line 615
    .line 616
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->n()Landroid/widget/ImageView;

    .line 617
    move-result-object v3

    .line 618
    .line 619
    if-eqz v3, :cond_24

    .line 620
    .line 621
    sget-object v5, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->APPROVED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 622
    .line 623
    .line 624
    invoke-static {v3, v5}, Lcom/sumsub/sns/core/widget/SNSStepViewExtensionsKt;->setSnsStepState(Landroid/view/View;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)V

    .line 625
    .line 626
    .line 627
    :cond_24
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->n()Landroid/widget/ImageView;

    .line 628
    move-result-object v3

    .line 629
    .line 630
    if-eqz v3, :cond_25

    .line 631
    .line 632
    sget-object v5, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 633
    .line 634
    .line 635
    invoke-virtual {v5}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    .line 636
    move-result-object v5

    .line 637
    .line 638
    iget-object v6, v2, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 642
    move-result-object v6

    .line 643
    .line 644
    sget-object v7, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->SUCCESS:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v7}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->getImageName()Ljava/lang/String;

    .line 648
    move-result-object v7

    .line 649
    .line 650
    .line 651
    invoke-interface {v5, v6, v7}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 652
    move-result-object v5

    .line 653
    .line 654
    .line 655
    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 656
    .line 657
    .line 658
    :cond_25
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->n()Landroid/widget/ImageView;

    .line 659
    move-result-object v3

    .line 660
    .line 661
    if-eqz v3, :cond_26

    .line 662
    const/4 v7, 0x4

    .line 663
    .line 664
    .line 665
    invoke-virtual {v3, v7}, Landroid/view/View;->setVisibility(I)V

    .line 666
    .line 667
    .line 668
    :cond_26
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->n()Landroid/widget/ImageView;

    .line 669
    move-result-object v3

    .line 670
    .line 671
    if-eqz v3, :cond_27

    .line 672
    .line 673
    .line 674
    invoke-static {v3}, Lcom/sumsub/sns/internal/core/common/h;->d(Landroid/view/View;)V

    .line 675
    .line 676
    :cond_27
    iget-object v3, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->p:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 677
    .line 678
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->r:[Lkotlin/reflect/KProperty;

    .line 679
    .line 680
    aget-object v6, v5, v10

    .line 681
    .line 682
    .line 683
    invoke-virtual {v3, v2, v6}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 684
    move-result-object v3

    .line 685
    .line 686
    check-cast v3, Landroid/widget/TextView;

    .line 687
    .line 688
    if-eqz v3, :cond_28

    .line 689
    .line 690
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/n;->a:Ljava/lang/CharSequence;

    .line 691
    .line 692
    .line 693
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 694
    .line 695
    :cond_28
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->q:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 696
    .line 697
    aget-object v3, v5, v4

    .line 698
    .line 699
    .line 700
    invoke-virtual {v1, v2, v3}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 701
    move-result-object v1

    .line 702
    .line 703
    check-cast v1, Landroid/widget/TextView;

    .line 704
    .line 705
    if-eqz v1, :cond_2e

    .line 706
    const/4 v2, 0x0

    .line 707
    .line 708
    .line 709
    invoke-static {v1, v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 710
    return-void

    .line 711
    .line 712
    :cond_29
    instance-of v3, v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/o;

    .line 713
    .line 714
    if-eqz v3, :cond_2d

    .line 715
    .line 716
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/o;

    .line 717
    .line 718
    if-eqz v5, :cond_2b

    .line 719
    .line 720
    .line 721
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->n()Landroid/widget/ImageView;

    .line 722
    move-result-object v3

    .line 723
    .line 724
    if-eqz v3, :cond_2a

    .line 725
    .line 726
    sget-object v5, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->REJECTED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 727
    .line 728
    .line 729
    invoke-static {v3, v5}, Lcom/sumsub/sns/core/widget/SNSStepViewExtensionsKt;->setSnsStepState(Landroid/view/View;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)V

    .line 730
    .line 731
    .line 732
    :cond_2a
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->n()Landroid/widget/ImageView;

    .line 733
    move-result-object v3

    .line 734
    .line 735
    if-eqz v3, :cond_2b

    .line 736
    .line 737
    sget-object v5, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 738
    .line 739
    .line 740
    invoke-virtual {v5}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    .line 741
    move-result-object v5

    .line 742
    .line 743
    iget-object v6, v2, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 744
    .line 745
    .line 746
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 747
    move-result-object v6

    .line 748
    .line 749
    sget-object v7, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->FAILURE:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;

    .line 750
    .line 751
    .line 752
    invoke-virtual {v7}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->getImageName()Ljava/lang/String;

    .line 753
    move-result-object v7

    .line 754
    .line 755
    .line 756
    invoke-interface {v5, v6, v7}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 757
    move-result-object v5

    .line 758
    .line 759
    .line 760
    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 761
    .line 762
    :cond_2b
    iget-object v3, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->p:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 763
    .line 764
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->r:[Lkotlin/reflect/KProperty;

    .line 765
    .line 766
    aget-object v6, v5, v10

    .line 767
    .line 768
    .line 769
    invoke-virtual {v3, v2, v6}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 770
    move-result-object v3

    .line 771
    .line 772
    check-cast v3, Landroid/widget/TextView;

    .line 773
    .line 774
    if-eqz v3, :cond_2c

    .line 775
    .line 776
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/o;->a:Ljava/lang/CharSequence;

    .line 777
    .line 778
    .line 779
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 780
    .line 781
    :cond_2c
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->q:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 782
    .line 783
    aget-object v3, v5, v4

    .line 784
    .line 785
    .line 786
    invoke-virtual {v1, v2, v3}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 787
    move-result-object v1

    .line 788
    .line 789
    check-cast v1, Landroid/widget/TextView;

    .line 790
    .line 791
    if-eqz v1, :cond_2e

    .line 792
    const/4 v2, 0x0

    .line 793
    .line 794
    .line 795
    invoke-static {v1, v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 796
    return-void

    .line 797
    .line 798
    .line 799
    :cond_2d
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 800
    .line 801
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 802
    .line 803
    .line 804
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 805
    throw v1

    .line 806
    :cond_2e
    return-void

    .line 807
    .line 808
    :cond_2f
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 809
    .line 810
    .line 811
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 812
    throw v1
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/s;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/v;->a(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/s;)V

    .line 6
    .line 7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p1
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
.end method
