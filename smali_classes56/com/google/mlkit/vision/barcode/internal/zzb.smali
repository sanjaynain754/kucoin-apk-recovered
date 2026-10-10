.class public final Lcom/google/mlkit/vision/barcode/internal/zzb;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1"


# static fields
.field static final zza:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field private static final zzb:Landroid/util/SparseArray;

.field private static final zzc:Landroid/util/SparseArray;

.field private static final zzd:Ljava/util/Map;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UseSparseArrays"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    .line 2
    new-instance v0, Landroid/util/SparseArray;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/google/mlkit/vision/barcode/internal/zzb;->zzb:Landroid/util/SparseArray;

    .line 8
    .line 9
    new-instance v1, Landroid/util/SparseArray;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 13
    .line 14
    sput-object v1, Lcom/google/mlkit/vision/barcode/internal/zzb;->zzc:Landroid/util/SparseArray;

    .line 15
    .line 16
    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    .line 19
    invoke-direct {v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 20
    .line 21
    sput-object v2, Lcom/google/mlkit/vision/barcode/internal/zzb;->zza:Ljava/util/concurrent/atomic/AtomicReference;

    .line 22
    .line 23
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    .line 24
    const/4 v3, -0x1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v3, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 28
    .line 29
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    .line 30
    const/4 v3, 0x1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v3, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 34
    .line 35
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    .line 36
    const/4 v4, 0x2

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v4, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 40
    .line 41
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    .line 42
    const/4 v5, 0x4

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v5, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 46
    .line 47
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    .line 48
    .line 49
    const/16 v6, 0x8

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v6, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 53
    .line 54
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    .line 55
    .line 56
    const/16 v7, 0x10

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v7, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 60
    .line 61
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    .line 62
    .line 63
    const/16 v8, 0x20

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v8, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 67
    .line 68
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzh:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    .line 69
    .line 70
    const/16 v9, 0x40

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v9, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 74
    .line 75
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzi:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    .line 76
    .line 77
    const/16 v10, 0x80

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v10, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 81
    .line 82
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    .line 83
    .line 84
    const/16 v11, 0x100

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v11, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 88
    .line 89
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    .line 90
    .line 91
    const/16 v12, 0x200

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v12, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 95
    .line 96
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzl:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    .line 97
    .line 98
    const/16 v13, 0x400

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v13, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 102
    .line 103
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzm:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    .line 104
    .line 105
    const/16 v14, 0x800

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v14, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 109
    .line 110
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzn:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    .line 111
    .line 112
    const/16 v15, 0x1000

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v15, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 116
    .line 117
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;

    .line 118
    const/4 v2, 0x0

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 122
    .line 123
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v3, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 127
    .line 128
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v4, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 132
    .line 133
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;->zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;

    .line 134
    const/4 v2, 0x3

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 138
    .line 139
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v5, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 143
    .line 144
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;

    .line 145
    const/4 v2, 0x5

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 149
    .line 150
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;

    .line 151
    const/4 v2, 0x6

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 155
    .line 156
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;->zzh:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;

    .line 157
    const/4 v2, 0x7

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 161
    .line 162
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;->zzi:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, v6, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 166
    .line 167
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;

    .line 168
    .line 169
    const/16 v2, 0x9

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 173
    .line 174
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;->zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;

    .line 175
    .line 176
    const/16 v2, 0xa

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 180
    .line 181
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;->zzl:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;

    .line 182
    .line 183
    const/16 v2, 0xb

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 187
    .line 188
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;->zzm:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;

    .line 189
    .line 190
    const/16 v2, 0xc

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 194
    .line 195
    new-instance v0, Ljava/util/HashMap;

    .line 196
    .line 197
    .line 198
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 199
    .line 200
    sput-object v0, Lcom/google/mlkit/vision/barcode/internal/zzb;->zzd:Ljava/util/Map;

    .line 201
    .line 202
    .line 203
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 204
    move-result-object v1

    .line 205
    .line 206
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 207
    .line 208
    .line 209
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 213
    move-result-object v1

    .line 214
    .line 215
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 216
    .line 217
    .line 218
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 222
    move-result-object v1

    .line 223
    .line 224
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 225
    .line 226
    .line 227
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 231
    move-result-object v1

    .line 232
    .line 233
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 234
    .line 235
    .line 236
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    move-result-object v1

    .line 241
    .line 242
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 243
    .line 244
    .line 245
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 249
    move-result-object v1

    .line 250
    .line 251
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 252
    .line 253
    .line 254
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 258
    move-result-object v1

    .line 259
    .line 260
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzh:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 261
    .line 262
    .line 263
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 267
    move-result-object v1

    .line 268
    .line 269
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzi:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 270
    .line 271
    .line 272
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 276
    move-result-object v1

    .line 277
    .line 278
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 279
    .line 280
    .line 281
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 285
    move-result-object v1

    .line 286
    .line 287
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 288
    .line 289
    .line 290
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 294
    move-result-object v1

    .line 295
    .line 296
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzl:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 297
    .line 298
    .line 299
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 303
    move-result-object v1

    .line 304
    .line 305
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzm:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 306
    .line 307
    .line 308
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 312
    move-result-object v1

    .line 313
    .line 314
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzn:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 315
    .line 316
    .line 317
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    return-void
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
.end method

.method public static zza(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;
    .locals 1
    .param p0    # I
        .annotation build Lcom/google/mlkit/vision/barcode/common/Barcode$BarcodeFormat;
        .end annotation
    .end param

    .line 1
    .line 2
    sget-object v0, Lcom/google/mlkit/vision/barcode/internal/zzb;->zzb:Landroid/util/SparseArray;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    .line 9
    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    .line 13
    :cond_0
    return-object p0
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

.method public static zzb(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;
    .locals 1
    .param p0    # I
        .annotation build Lcom/google/mlkit/vision/barcode/common/Barcode$BarcodeValueType;
        .end annotation
    .end param

    .line 1
    .line 2
    sget-object v0, Lcom/google/mlkit/vision/barcode/internal/zzb;->zzc:Landroid/util/SparseArray;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;

    .line 9
    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzro;

    .line 13
    :cond_0
    return-object p0
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

.method public static zzc(Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvz;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;->zza()I

    .line 4
    move-result p0

    .line 5
    .line 6
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcp;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcp;-><init>()V

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    sget-object p0, Lcom/google/mlkit/vision/barcode/internal/zzb;->zzd:Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 17
    move-result-object p0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcp;->zze(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcp;

    .line 21
    goto :goto_1

    .line 22
    .line 23
    :cond_0
    sget-object v1, Lcom/google/mlkit/vision/barcode/internal/zzb;->zzd:Ljava/util/Map;

    .line 24
    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    move-result v2

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    check-cast v2, Ljava/util/Map$Entry;

    .line 44
    .line 45
    .line 46
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 47
    move-result-object v3

    .line 48
    .line 49
    check-cast v3, Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 53
    move-result v3

    .line 54
    and-int/2addr v3, p0

    .line 55
    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 60
    move-result-object v2

    .line 61
    .line 62
    check-cast v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcp;->zzd(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcp;

    .line 66
    goto :goto_0

    .line 67
    .line 68
    :cond_2
    :goto_1
    new-instance p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvx;

    .line 69
    .line 70
    .line 71
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvx;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcp;->zzf()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvx;->zzb(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvx;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvx;->zzc()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvz;

    .line 82
    move-result-object p0

    .line 83
    return-object p0
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
.end method

.method public static zzd()Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/google/mlkit/vision/barcode/internal/zzb;->zzf()Z

    .line 5
    move-result v1

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    const-string v0, "play-services-mlkit-barcode-scanning"

    .line 10
    return-object v0

    .line 11
    .line 12
    :cond_0
    const-string v0, "barcode-scanning"

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
.end method

.method public static zze(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrb;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/mlkit/vision/barcode/internal/zza;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Lcom/google/mlkit/vision/barcode/internal/zza;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrb;)V

    .line 6
    .line 7
    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;->zzm:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;->zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwo;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;)V

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
.end method

.method public static zzf()Z
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/google/mlkit/vision/barcode/internal/zzb;->zza:Ljava/util/concurrent/atomic/AtomicReference;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-static {}, Lcom/google/mlkit/common/sdkinternal/MlKitContext;->getInstance()Lcom/google/mlkit/common/sdkinternal/MlKitContext;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/google/mlkit/common/sdkinternal/MlKitContext;->getApplicationContext()Landroid/content/Context;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Lcom/google/mlkit/vision/barcode/internal/zzo;->zzd(Landroid/content/Context;)Z

    .line 31
    move-result v1

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 39
    return v1
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
.end method
