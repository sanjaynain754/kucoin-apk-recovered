.class final Lcom/google/android/gms/internal/fido/zzeo;
.super Lcom/google/android/gms/internal/fido/zzei;
.source "com.google.android.gms:play-services-fido@@21.0.0"


# static fields
.field static final zza:Z

.field static final zzb:Z

.field static final zzc:Z

.field private static final zzd:Ljava/util/concurrent/atomic/AtomicReference;

.field private static final zze:Ljava/util/concurrent/atomic/AtomicLong;

.field private static final zzf:Ljava/util/concurrent/ConcurrentLinkedQueue;


# instance fields
.field private volatile zzg:Lcom/google/android/gms/internal/fido/zzdp;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    const-string/jumbo v3, "robolectric"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    move-result v0

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    :cond_0
    move v0, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    move v0, v1

    .line 19
    .line 20
    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/fido/zzeo;->zza:Z

    .line 21
    .line 22
    sget-object v0, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    .line 23
    .line 24
    const-string v3, "goldfish"

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    move-result v3

    .line 29
    .line 30
    if-nez v3, :cond_2

    .line 31
    .line 32
    .line 33
    const-string/jumbo v3, "ranchu"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    move-result v0

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    :cond_2
    move v0, v2

    .line 41
    goto :goto_1

    .line 42
    :cond_3
    move v0, v1

    .line 43
    .line 44
    :goto_1
    sput-boolean v0, Lcom/google/android/gms/internal/fido/zzeo;->zzb:Z

    .line 45
    .line 46
    sget-object v0, Landroid/os/Build;->TYPE:Ljava/lang/String;

    .line 47
    .line 48
    const-string v3, "eng"

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    move-result v3

    .line 53
    .line 54
    if-nez v3, :cond_4

    .line 55
    .line 56
    .line 57
    const-string/jumbo v3, "userdebug"

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    move-result v0

    .line 62
    .line 63
    if-eqz v0, :cond_5

    .line 64
    :cond_4
    move v1, v2

    .line 65
    .line 66
    :cond_5
    sput-boolean v1, Lcom/google/android/gms/internal/fido/zzeo;->zzc:Z

    .line 67
    .line 68
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 69
    .line 70
    .line 71
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 72
    .line 73
    sput-object v0, Lcom/google/android/gms/internal/fido/zzeo;->zzd:Ljava/util/concurrent/atomic/AtomicReference;

    .line 74
    .line 75
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 76
    .line 77
    .line 78
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 79
    .line 80
    sput-object v0, Lcom/google/android/gms/internal/fido/zzeo;->zze:Ljava/util/concurrent/atomic/AtomicLong;

    .line 81
    .line 82
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 83
    .line 84
    .line 85
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 86
    .line 87
    sput-object v0, Lcom/google/android/gms/internal/fido/zzeo;->zzf:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 88
    return-void
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
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/fido/zzei;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    sget-boolean p1, Lcom/google/android/gms/internal/fido/zzeo;->zza:Z

    .line 6
    .line 7
    if-nez p1, :cond_2

    .line 8
    .line 9
    sget-boolean p1, Lcom/google/android/gms/internal/fido/zzeo;->zzb:Z

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_0
    sget-boolean p1, Lcom/google/android/gms/internal/fido/zzeo;->zzc:Z

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/google/android/gms/internal/fido/zzeu;->zzc()Lcom/google/android/gms/internal/fido/zzer;

    .line 20
    move-result-object p1

    .line 21
    const/4 v0, 0x0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/fido/zzer;->zzb(Z)Lcom/google/android/gms/internal/fido/zzer;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/google/android/gms/internal/fido/zzei;->zza()Ljava/lang/String;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/fido/zzer;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/fido/zzdp;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    iput-object p1, p0, Lcom/google/android/gms/internal/fido/zzeo;->zzg:Lcom/google/android/gms/internal/fido/zzdp;

    .line 36
    return-void

    .line 37
    :cond_1
    const/4 p1, 0x0

    .line 38
    .line 39
    iput-object p1, p0, Lcom/google/android/gms/internal/fido/zzeo;->zzg:Lcom/google/android/gms/internal/fido/zzdp;

    .line 40
    return-void

    .line 41
    .line 42
    :cond_2
    :goto_0
    new-instance p1, Lcom/google/android/gms/internal/fido/zzej;

    .line 43
    .line 44
    .line 45
    invoke-direct {p1}, Lcom/google/android/gms/internal/fido/zzej;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/google/android/gms/internal/fido/zzei;->zza()Ljava/lang/String;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/fido/zzej;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/fido/zzdp;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    iput-object p1, p0, Lcom/google/android/gms/internal/fido/zzeo;->zzg:Lcom/google/android/gms/internal/fido/zzdp;

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
.end method

.method public static zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/fido/zzdp;
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lcom/google/android/gms/internal/fido/zzeo;->zzd:Ljava/util/concurrent/atomic/AtomicReference;

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
    check-cast v0, Lcom/google/android/gms/internal/fido/zzek;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/fido/zzek;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/fido/zzdp;

    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/fido/zzeo;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 25
    move-result v1

    .line 26
    .line 27
    :goto_0
    add-int/lit8 v1, v1, -0x1

    .line 28
    .line 29
    if-ltz v1, :cond_2

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 33
    move-result v2

    .line 34
    .line 35
    const/16 v3, 0x2e

    .line 36
    .line 37
    const/16 v4, 0x24

    .line 38
    .line 39
    if-ne v2, v4, :cond_1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v4, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 43
    move-result-object p0

    .line 44
    goto :goto_1

    .line 45
    .line 46
    :cond_1
    if-eq v2, v3, :cond_2

    .line 47
    goto :goto_0

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_1
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/fido/zzeo;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    sget-object p0, Lcom/google/android/gms/internal/fido/zzem;->zza:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->offer(Ljava/lang/Object;)Z

    .line 56
    .line 57
    sget-object p0, Lcom/google/android/gms/internal/fido/zzeo;->zzd:Ljava/util/concurrent/atomic/AtomicReference;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 61
    move-result-object p0

    .line 62
    .line 63
    if-eqz p0, :cond_5

    .line 64
    .line 65
    :goto_2
    sget-object p0, Lcom/google/android/gms/internal/fido/zzem;->zza:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    .line 69
    move-result-object p0

    .line 70
    .line 71
    check-cast p0, Lcom/google/android/gms/internal/fido/zzeo;

    .line 72
    .line 73
    if-eqz p0, :cond_3

    .line 74
    .line 75
    sget-object v1, Lcom/google/android/gms/internal/fido/zzeo;->zzd:Ljava/util/concurrent/atomic/AtomicReference;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 79
    move-result-object v1

    .line 80
    .line 81
    check-cast v1, Lcom/google/android/gms/internal/fido/zzek;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/google/android/gms/internal/fido/zzei;->zza()Ljava/lang/String;

    .line 85
    move-result-object v2

    .line 86
    .line 87
    .line 88
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/fido/zzek;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/fido/zzdp;

    .line 89
    move-result-object v1

    .line 90
    .line 91
    iput-object v1, p0, Lcom/google/android/gms/internal/fido/zzeo;->zzg:Lcom/google/android/gms/internal/fido/zzdp;

    .line 92
    goto :goto_2

    .line 93
    .line 94
    :cond_3
    sget-object p0, Lcom/google/android/gms/internal/fido/zzeo;->zzf:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    .line 98
    move-result-object p0

    .line 99
    .line 100
    check-cast p0, Lcom/google/android/gms/internal/fido/zzen;

    .line 101
    .line 102
    if-nez p0, :cond_4

    .line 103
    goto :goto_3

    .line 104
    .line 105
    :cond_4
    sget-object p0, Lcom/google/android/gms/internal/fido/zzeo;->zze:Ljava/util/concurrent/atomic/AtomicLong;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndDecrement()J

    .line 109
    const/4 p0, 0x0

    .line 110
    throw p0

    .line 111
    :cond_5
    :goto_3
    return-object v0
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
.end method
