.class Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
.super Ljava/lang/Object;
.source "TUIRouter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/qcloud/tuicore/TUIRouter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Navigation"
.end annotation


# instance fields
.field destination:Ljava/lang/String;

.field intent:Landroid/content/Intent;

.field options:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroid/content/Intent;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method private startActivity(Landroid/content/Context;I)V
    .locals 2

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIRouter;->access$000()Ljava/lang/String;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    const-string p2, "StartActivity failed, context is null.Please init"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    :try_start_0
    instance-of v0, p1, Landroid/app/Activity;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    if-ltz p2, :cond_1

    .line 19
    .line 20
    check-cast p1, Landroid/app/Activity;

    .line 21
    .line 22
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->options:Landroid/os/Bundle;

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0, p2, v1}, Landroidx/core/app/ActivityCompat;->startActivityForResult(Landroid/app/Activity;Landroid/content/Intent;ILandroid/os/Bundle;)V

    .line 28
    return-void

    .line 29
    :catch_0
    move-exception p1

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_1
    instance-of p2, p1, Landroid/app/Activity;

    .line 33
    .line 34
    if-nez p2, :cond_2

    .line 35
    .line 36
    iget-object p2, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    .line 37
    .line 38
    const/high16 v0, 0x10000000

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 42
    .line 43
    :cond_2
    iget-object p2, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    .line 44
    .line 45
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->options:Landroid/os/Bundle;

    .line 46
    .line 47
    .line 48
    invoke-static {p1, p2, v0}, Landroidx/core/content/ContextCompat;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    return-void

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 53
    return-void
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
.end method


# virtual methods
.method public getIntent()Landroid/content/Intent;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

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
.end method

.method public navigate()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->navigate(Landroid/content/Context;)V

    return-void
.end method

.method public navigate(Landroid/content/Context;)V
    .locals 1

    const/4 v0, -0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->navigate(Landroid/content/Context;I)V

    return-void
.end method

.method public navigate(Landroid/content/Context;I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 34
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIRouter;->access$400()Z

    move-result v0

    if-nez v0, :cond_0

    .line 35
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIRouter;->access$000()Ljava/lang/String;

    move-result-object p1

    const-string p2, "have not initialized."

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 36
    :cond_0
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    if-nez v0, :cond_1

    .line 37
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIRouter;->access$000()Ljava/lang/String;

    move-result-object p1

    const-string p2, "intent is null."

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    if-nez p1, :cond_2

    .line 38
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIRouter;->access$300()Landroid/content/Context;

    move-result-object p1

    .line 39
    :cond_2
    invoke-direct {p0, p1, p2}, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->startActivity(Landroid/content/Context;I)V

    return-void
.end method

.method public navigate(Landroidx/activity/result/ActivityResultCaller;Landroidx/activity/result/ActivityResultCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/activity/result/ActivityResultCaller;",
            "Landroidx/activity/result/ActivityResultCallback<",
            "Landroidx/activity/result/ActivityResult;",
            ">;)V"
        }
    .end annotation

    .line 12
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIRouter;->access$400()Z

    move-result v0

    if-nez v0, :cond_0

    .line 13
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIRouter;->access$000()Ljava/lang/String;

    move-result-object p1

    const-string p2, "have not initialized."

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    if-nez v0, :cond_1

    .line 15
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIRouter;->access$000()Ljava/lang/String;

    move-result-object p1

    const-string p2, "intent is null."

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 16
    :try_start_0
    instance-of v2, p1, Landroidx/activity/ComponentActivity;

    if-eqz v2, :cond_3

    .line 17
    move-object v2, p1

    check-cast v2, Landroidx/activity/ComponentActivity;

    .line 18
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v2}, Landroid/app/Activity;->isDestroyed()Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_3

    .line 19
    :cond_2
    :goto_0
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIRouter;->access$000()Ljava/lang/String;

    move-result-object p1

    const-string v2, "Activity is finishing or destroyed"

    invoke-static {p1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p2, :cond_9

    .line 20
    new-instance p1, Landroidx/activity/result/ActivityResult;

    invoke-direct {p1, v0, v1}, Landroidx/activity/result/ActivityResult;-><init>(ILandroid/content/Intent;)V

    invoke-interface {p2, p1}, Landroidx/activity/result/ActivityResultCallback;->onActivityResult(Ljava/lang/Object;)V

    return-void

    .line 21
    :cond_3
    instance-of v2, p1, Landroidx/fragment/app/Fragment;

    if-eqz v2, :cond_5

    .line 22
    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 23
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->isDetached()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 24
    :cond_4
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIRouter;->access$000()Ljava/lang/String;

    move-result-object p1

    const-string v2, "Fragment is not added or detached"

    invoke-static {p1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p2, :cond_9

    .line 25
    new-instance p1, Landroidx/activity/result/ActivityResult;

    invoke-direct {p1, v0, v1}, Landroidx/activity/result/ActivityResult;-><init>(ILandroid/content/Intent;)V

    invoke-interface {p2, p1}, Landroidx/activity/result/ActivityResultCallback;->onActivityResult(Ljava/lang/Object;)V

    return-void

    .line 26
    :cond_5
    instance-of v2, p1, Landroidx/lifecycle/ViewModelStoreOwner;

    if-eqz v2, :cond_6

    .line 27
    new-instance v2, Landroidx/lifecycle/ViewModelProvider;

    check-cast p1, Landroidx/lifecycle/ViewModelStoreOwner;

    invoke-direct {v2, p1}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;)V

    const-class p1, Lcom/tencent/qcloud/tuicore/TUIRouter$LauncherViewModel;

    invoke-virtual {v2, p1}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object p1

    check-cast p1, Lcom/tencent/qcloud/tuicore/TUIRouter$LauncherViewModel;

    goto :goto_1

    :cond_6
    move-object p1, v1

    :goto_1
    if-eqz p1, :cond_7

    .line 28
    invoke-static {p1}, Lcom/tencent/qcloud/tuicore/TUIRouter$LauncherViewModel;->access$500(Lcom/tencent/qcloud/tuicore/TUIRouter$LauncherViewModel;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object p1

    goto :goto_2

    :cond_7
    move-object p1, v1

    :goto_2
    if-eqz p1, :cond_8

    .line 29
    iget-object v2, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-static {v2, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    return-void

    .line 30
    :cond_8
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIRouter;->access$000()Ljava/lang/String;

    move-result-object p1

    const-string v2, "launcher is null, ActivityResultLauncher not registered"

    invoke-static {p1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p2, :cond_9

    .line 31
    new-instance p1, Landroidx/activity/result/ActivityResult;

    invoke-direct {p1, v0, v1}, Landroidx/activity/result/ActivityResult;-><init>(ILandroid/content/Intent;)V

    invoke-interface {p2, p1}, Landroidx/activity/result/ActivityResultCallback;->onActivityResult(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 32
    :goto_3
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIRouter;->access$000()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "start activity failed, "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p2, :cond_9

    .line 33
    new-instance p1, Landroidx/activity/result/ActivityResult;

    invoke-direct {p1, v0, v1}, Landroidx/activity/result/ActivityResult;-><init>(ILandroid/content/Intent;)V

    invoke-interface {p2, p1}, Landroidx/activity/result/ActivityResultCallback;->onActivityResult(Ljava/lang/Object;)V

    :cond_9
    return-void
.end method

.method public navigate(Landroidx/fragment/app/Fragment;)V
    .locals 1

    const/4 v0, -0x1

    .line 3
    invoke-virtual {p0, p1, v0}, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->navigate(Landroidx/fragment/app/Fragment;I)V

    return-void
.end method

.method public navigate(Landroidx/fragment/app/Fragment;I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 4
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIRouter;->access$400()Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIRouter;->access$000()Ljava/lang/String;

    move-result-object p1

    const-string p2, "have not initialized."

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    if-nez v0, :cond_1

    .line 7
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIRouter;->access$000()Ljava/lang/String;

    move-result-object p1

    const-string p2, "intent is null."

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    if-eqz p1, :cond_3

    if-ltz p2, :cond_2

    .line 8
    :try_start_0
    invoke-virtual {p1, v0, p2}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    .line 9
    :cond_2
    iget-object p2, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->options:Landroid/os/Bundle;

    invoke-virtual {p1, v0, p2}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void

    :cond_3
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1, p2}, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->startActivity(Landroid/content/Context;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 11
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public putExtra(Ljava/lang/String;B)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;B)Landroid/content/Intent;

    return-object p0
.end method

.method public putExtra(Ljava/lang/String;C)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;C)Landroid/content/Intent;

    return-object p0
.end method

.method public putExtra(Ljava/lang/String;D)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;D)Landroid/content/Intent;

    return-object p0
.end method

.method public putExtra(Ljava/lang/String;F)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;F)Landroid/content/Intent;

    return-object p0
.end method

.method public putExtra(Ljava/lang/String;I)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    return-object p0
.end method

.method public putExtra(Ljava/lang/String;J)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    return-object p0
.end method

.method public putExtra(Ljava/lang/String;Landroid/os/Bundle;)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    if-eqz p2, :cond_0

    .line 24
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_0
    return-object p0
.end method

.method public putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    if-eqz p2, :cond_0

    .line 11
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    :cond_0
    return-object p0
.end method

.method public putExtra(Ljava/lang/String;Ljava/io/Serializable;)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    if-eqz p2, :cond_0

    .line 13
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    :cond_0
    return-object p0
.end method

.method public putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    if-eqz p2, :cond_0

    .line 10
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;

    :cond_0
    return-object p0
.end method

.method public putExtra(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    if-eqz p2, :cond_0

    .line 9
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    return-object p0
.end method

.method public putExtra(Ljava/lang/String;S)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;S)Landroid/content/Intent;

    return-object p0
.end method

.method public putExtra(Ljava/lang/String;Z)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object p0
.end method

.method public putExtra(Ljava/lang/String;[B)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    if-eqz p2, :cond_0

    .line 15
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    :cond_0
    return-object p0
.end method

.method public putExtra(Ljava/lang/String;[C)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    if-eqz p2, :cond_0

    .line 17
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[C)Landroid/content/Intent;

    :cond_0
    return-object p0
.end method

.method public putExtra(Ljava/lang/String;[D)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    if-eqz p2, :cond_0

    .line 21
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[D)Landroid/content/Intent;

    :cond_0
    return-object p0
.end method

.method public putExtra(Ljava/lang/String;[F)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    if-eqz p2, :cond_0

    .line 20
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[F)Landroid/content/Intent;

    :cond_0
    return-object p0
.end method

.method public putExtra(Ljava/lang/String;[I)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    if-eqz p2, :cond_0

    .line 18
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;

    :cond_0
    return-object p0
.end method

.method public putExtra(Ljava/lang/String;[J)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    if-eqz p2, :cond_0

    .line 19
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[J)Landroid/content/Intent;

    :cond_0
    return-object p0
.end method

.method public putExtra(Ljava/lang/String;[Landroid/os/Parcelable;)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    if-eqz p2, :cond_0

    .line 12
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Landroid/os/Parcelable;)Landroid/content/Intent;

    :cond_0
    return-object p0
.end method

.method public putExtra(Ljava/lang/String;[Ljava/lang/CharSequence;)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    if-eqz p2, :cond_0

    .line 23
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/CharSequence;)Landroid/content/Intent;

    :cond_0
    return-object p0
.end method

.method public putExtra(Ljava/lang/String;[Ljava/lang/String;)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    if-eqz p2, :cond_0

    .line 22
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    return-object p0
.end method

.method public putExtra(Ljava/lang/String;[S)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    if-eqz p2, :cond_0

    .line 16
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[S)Landroid/content/Intent;

    :cond_0
    return-object p0
.end method

.method public putExtra(Ljava/lang/String;[Z)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    if-eqz p2, :cond_0

    .line 14
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Z)Landroid/content/Intent;

    :cond_0
    return-object p0
.end method

.method public putExtras(Landroid/content/Intent;)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/content/Intent;)Landroid/content/Intent;

    :cond_0
    return-object p0
.end method

.method public putExtras(Landroid/os/Bundle;)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_0
    return-object p0
.end method

.method public setDestination(Ljava/lang/Class;)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;)",
            "Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    new-instance v1, Landroid/content/ComponentName;

    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIRouter;->access$300()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    return-object p0
.end method

.method public setDestination(Ljava/lang/String;)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 3

    .line 1
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIRouter;->access$200()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->destination:Ljava/lang/String;

    if-nez p1, :cond_0

    .line 2
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIRouter;->access$000()Ljava/lang/String;

    move-result-object p1

    const-string v0, "destination is null."

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object p0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

    new-instance v0, Landroid/content/ComponentName;

    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIRouter;->access$300()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->destination:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    return-object p0
.end method

.method public setIntent(Landroid/content/Intent;)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->intent:Landroid/content/Intent;

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
.end method

.method public setOptions(Landroid/os/Bundle;)Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/TUIRouter$Navigation;->options:Landroid/os/Bundle;

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
.end method
