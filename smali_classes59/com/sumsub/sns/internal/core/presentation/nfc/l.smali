.class public final Lcom/sumsub/sns/internal/core/presentation/nfc/l;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/presentation/common/g;


# static fields
.field public static final synthetic m:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Lkotlinx/coroutines/m0;

.field public final b:Lcom/sumsub/sns/internal/features/domain/mrtd/y;

.field public final c:Lkotlin/jvm/functions/Function1;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final g:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final h:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final i:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final j:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final k:Lkotlinx/coroutines/flow/w;

.field public l:Lkotlinx/coroutines/x1;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;

    .line 3
    .line 4
    const-string v1, "attempt"

    .line 5
    .line 6
    const-string v2, "getAttempt()I"

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
    const-string v2, "hasFailedAttempts"

    .line 14
    .line 15
    const-string v4, "getHasFailedAttempts()Z"

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    const-string v4, "isLastErrorAccessRejected"

    .line 22
    .line 23
    const-string v5, "isLastErrorAccessRejected()Z"

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 27
    move-result-object v4

    .line 28
    .line 29
    .line 30
    const-string/jumbo v5, "progress"

    .line 31
    .line 32
    const-string v6, "getProgress()I"

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v5, v6, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 36
    move-result-object v5

    .line 37
    .line 38
    .line 39
    const-string/jumbo v6, "readingStep"

    .line 40
    .line 41
    const-string v7, "getReadingStep()Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;"

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v6, v7, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 45
    move-result-object v0

    .line 46
    const/4 v6, 0x5

    .line 47
    .line 48
    new-array v6, v6, [Lkotlin/reflect/KProperty;

    .line 49
    .line 50
    aput-object v1, v6, v3

    .line 51
    const/4 v1, 0x1

    .line 52
    .line 53
    aput-object v2, v6, v1

    .line 54
    const/4 v1, 0x2

    .line 55
    .line 56
    aput-object v4, v6, v1

    .line 57
    const/4 v1, 0x3

    .line 58
    .line 59
    aput-object v5, v6, v1

    .line 60
    const/4 v1, 0x4

    .line 61
    .line 62
    aput-object v0, v6, v1

    .line 63
    .line 64
    sput-object v6, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->m:[Lkotlin/reflect/KProperty;

    .line 65
    return-void
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

.method public constructor <init>(Lkotlinx/coroutines/m0;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/model/common/A2;Lcom/sumsub/sns/internal/features/domain/mrtd/y;Lkotlin/jvm/functions/Function1;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->a:Lkotlinx/coroutines/m0;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->b:Lcom/sumsub/sns/internal/features/domain/mrtd/y;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->c:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    instance-of p4, p3, Lcom/sumsub/sns/internal/features/data/model/common/C2;

    .line 12
    .line 13
    if-eqz p4, :cond_0

    .line 14
    .line 15
    const-string p4, "basic"

    .line 16
    goto :goto_0

    .line 17
    .line 18
    :cond_0
    instance-of p4, p3, Lcom/sumsub/sns/internal/features/data/model/common/E2;

    .line 19
    .line 20
    if-eqz p4, :cond_4

    .line 21
    .line 22
    const-string p4, "kinegram"

    .line 23
    .line 24
    :goto_0
    iput-object p4, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->d:Ljava/lang/String;

    .line 25
    .line 26
    instance-of p4, p3, Lcom/sumsub/sns/internal/features/data/model/common/E2;

    .line 27
    const/4 p5, 0x0

    .line 28
    .line 29
    if-eqz p4, :cond_1

    .line 30
    move-object p4, p3

    .line 31
    .line 32
    check-cast p4, Lcom/sumsub/sns/internal/features/data/model/common/E2;

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move-object p4, p5

    .line 35
    .line 36
    :goto_1
    if-eqz p4, :cond_2

    .line 37
    .line 38
    iget-object p4, p4, Lcom/sumsub/sns/internal/features/data/model/common/E2;->n:Ljava/lang/String;

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move-object p4, p5

    .line 41
    .line 42
    :goto_2
    iput-object p4, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->e:Ljava/lang/String;

    .line 43
    .line 44
    new-instance p4, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3}, Lcom/sumsub/sns/internal/features/data/model/common/A2;->b()I

    .line 48
    move-result v0

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    const-string v1, "STATE_ATTEMPT"

    .line 55
    const/4 v2, 0x0

    .line 56
    .line 57
    .line 58
    invoke-direct {p4, p2, v1, v0, v2}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 59
    .line 60
    iput-object p4, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->f:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 61
    .line 62
    new-instance p4, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 63
    .line 64
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 65
    .line 66
    const-string v1, "STATE_HAS_FAILED_ATTEMPTS"

    .line 67
    .line 68
    .line 69
    invoke-direct {p4, p2, v1, v0, v2}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 70
    .line 71
    iput-object p4, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->g:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 72
    .line 73
    new-instance p4, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 74
    .line 75
    const-string v1, "STATE_IS_LAST_ERROR_ACCESS_REJECTED"

    .line 76
    .line 77
    .line 78
    invoke-direct {p4, p2, v1, v0, v2}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 79
    .line 80
    iput-object p4, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->h:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 81
    .line 82
    new-instance p4, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 83
    .line 84
    .line 85
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    move-result-object v0

    .line 87
    .line 88
    const-string v1, "STATE_PROGRESS"

    .line 89
    .line 90
    .line 91
    invoke-direct {p4, p2, v1, v0, v2}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 92
    .line 93
    iput-object p4, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->i:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 94
    .line 95
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p3}, Lcom/sumsub/sns/internal/features/data/model/common/A2;->b()I

    .line 99
    move-result p3

    .line 100
    .line 101
    if-lez p3, :cond_3

    .line 102
    .line 103
    sget-object p3, Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;->LISTENING:Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;

    .line 104
    goto :goto_3

    .line 105
    .line 106
    :cond_3
    sget-object p3, Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;->IDLE:Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;

    .line 107
    .line 108
    :goto_3
    const-string v3, "STATE_NFC_READING_STEP"

    .line 109
    .line 110
    .line 111
    invoke-direct {v0, p2, v3, p3, v2}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 112
    .line 113
    iput-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->j:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 114
    .line 115
    sget-object p3, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->m:[Lkotlin/reflect/KProperty;

    .line 116
    const/4 v2, 0x4

    .line 117
    .line 118
    aget-object v2, p3, v2

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 122
    move-result-object v0

    .line 123
    .line 124
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2, v3, v0}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 128
    move-result-object v0

    .line 129
    const/4 v2, 0x3

    .line 130
    .line 131
    aget-object p3, p3, v2

    .line 132
    .line 133
    .line 134
    invoke-virtual {p4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 135
    move-result-object p3

    .line 136
    .line 137
    check-cast p3, Ljava/lang/Number;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 141
    move-result p3

    .line 142
    .line 143
    .line 144
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    move-result-object p3

    .line 146
    .line 147
    .line 148
    invoke-virtual {p2, v1, p3}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 149
    move-result-object p2

    .line 150
    .line 151
    new-instance p3, Lcom/sumsub/sns/internal/core/presentation/nfc/k;

    .line 152
    .line 153
    .line 154
    invoke-direct {p3, p5}, Lcom/sumsub/sns/internal/core/presentation/nfc/k;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v0, p2, p3}, Lkotlinx/coroutines/flow/g;->m(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 158
    move-result-object p2

    .line 159
    .line 160
    sget-object p3, Lkotlinx/coroutines/flow/SharingStarted;->a:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p3}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->getLazily()Lkotlinx/coroutines/flow/SharingStarted;

    .line 164
    move-result-object p3

    .line 165
    .line 166
    .line 167
    invoke-static {p2, p1, p3, p5}, Lkotlinx/coroutines/flow/g;->g0(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 168
    move-result-object p1

    .line 169
    .line 170
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->k:Lkotlinx/coroutines/flow/w;

    .line 171
    return-void

    .line 172
    .line 173
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 174
    .line 175
    .line 176
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 177
    throw p1
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


# virtual methods
.method public final a()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->f:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->m:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Ljava/lang/Number;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 17
    move-result v0

    .line 18
    return v0
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
.end method

.method public final b()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->l:Lkotlinx/coroutines/x1;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    const/4 v2, 0x1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 10
    .line 11
    :cond_0
    iput-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->l:Lkotlinx/coroutines/x1;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->i:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 14
    .line 15
    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->m:[Lkotlin/reflect/KProperty;

    .line 16
    const/4 v2, 0x3

    .line 17
    .line 18
    aget-object v2, v1, v2

    .line 19
    const/4 v2, 0x0

    .line 20
    .line 21
    .line 22
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    iget-object v3, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v0, v2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 31
    .line 32
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;->IDLE:Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;

    .line 33
    .line 34
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->j:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 35
    const/4 v3, 0x4

    .line 36
    .line 37
    aget-object v1, v1, v3

    .line 38
    .line 39
    iget-object v1, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 40
    .line 41
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 45
    return-void
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

.method public final c()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->l:Lkotlinx/coroutines/x1;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    const/4 v2, 0x1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 10
    .line 11
    :cond_0
    iput-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->l:Lkotlinx/coroutines/x1;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->i:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 14
    .line 15
    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->m:[Lkotlin/reflect/KProperty;

    .line 16
    const/4 v2, 0x3

    .line 17
    .line 18
    aget-object v2, v1, v2

    .line 19
    const/4 v2, 0x0

    .line 20
    .line 21
    .line 22
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    iget-object v3, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v0, v2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 31
    .line 32
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;->LISTENING:Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;

    .line 33
    .line 34
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->j:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 35
    const/4 v3, 0x4

    .line 36
    .line 37
    aget-object v1, v1, v3

    .line 38
    .line 39
    iget-object v1, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 40
    .line 41
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 45
    return-void
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

.method public final getState()Lkotlinx/coroutines/flow/w;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->k:Lkotlinx/coroutines/flow/w;

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
