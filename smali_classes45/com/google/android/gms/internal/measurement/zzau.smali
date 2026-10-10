.class public final Lcom/google/android/gms/internal/measurement/zzau;
.super Lcom/google/android/gms/internal/measurement/zzav;
.source "com.google.android.gms:play-services-measurement@@22.5.0"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzav;-><init>()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzav;->zza:Ljava/util/List;

    .line 6
    .line 7
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzbk;->zze:Lcom/google/android/gms/internal/measurement/zzbk;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzav;->zza:Ljava/util/List;

    .line 13
    .line 14
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzbk;->zzf:Lcom/google/android/gms/internal/measurement/zzbk;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzav;->zza:Ljava/util/List;

    .line 20
    .line 21
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzbk;->zzg:Lcom/google/android/gms/internal/measurement/zzbk;

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzav;->zza:Ljava/util/List;

    .line 27
    .line 28
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzbk;->zzh:Lcom/google/android/gms/internal/measurement/zzbk;

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzav;->zza:Ljava/util/List;

    .line 34
    .line 35
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzbk;->zzi:Lcom/google/android/gms/internal/measurement/zzbk;

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzav;->zza:Ljava/util/List;

    .line 41
    .line 42
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzbk;->zzj:Lcom/google/android/gms/internal/measurement/zzbk;

    .line 43
    .line 44
    .line 45
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzav;->zza:Ljava/util/List;

    .line 48
    .line 49
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzbk;->zzk:Lcom/google/android/gms/internal/measurement/zzbk;

    .line 50
    .line 51
    .line 52
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

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
.end method


# virtual methods
.method public final zza(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzg;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/zzao;
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzbk;->zza:Lcom/google/android/gms/internal/measurement/zzbk;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzh;->zze(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzbk;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 10
    move-result v0

    .line 11
    .line 12
    const-wide/16 v1, 0x1f

    .line 13
    const/4 v3, 0x2

    .line 14
    const/4 v4, 0x1

    .line 15
    const/4 v5, 0x0

    .line 16
    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/measurement/zzav;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzao;

    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    .line 25
    :pswitch_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzbk;->zzk:Lcom/google/android/gms/internal/measurement/zzbk;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v3, p3}, Lcom/google/android/gms/internal/measurement/zzh;->zza(Ljava/lang/String;ILjava/util/List;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzao;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/zzg;->zza(Lcom/google/android/gms/internal/measurement/zzao;)Lcom/google/android/gms/internal/measurement/zzao;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzao;->zzd()Ljava/lang/Double;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 50
    move-result-wide v0

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzh;->zzg(D)I

    .line 54
    move-result p1

    .line 55
    .line 56
    .line 57
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    move-result-object p3

    .line 59
    .line 60
    check-cast p3, Lcom/google/android/gms/internal/measurement/zzao;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/measurement/zzg;->zza(Lcom/google/android/gms/internal/measurement/zzao;)Lcom/google/android/gms/internal/measurement/zzao;

    .line 64
    move-result-object p2

    .line 65
    .line 66
    .line 67
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/zzao;->zzd()Ljava/lang/Double;

    .line 68
    move-result-object p2

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 72
    move-result-wide p2

    .line 73
    .line 74
    .line 75
    invoke-static {p2, p3}, Lcom/google/android/gms/internal/measurement/zzh;->zzg(D)I

    .line 76
    move-result p2

    .line 77
    xor-int/2addr p1, p2

    .line 78
    int-to-double p1, p1

    .line 79
    .line 80
    new-instance p3, Lcom/google/android/gms/internal/measurement/zzah;

    .line 81
    .line 82
    .line 83
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 84
    move-result-object p1

    .line 85
    .line 86
    .line 87
    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/measurement/zzah;-><init>(Ljava/lang/Double;)V

    .line 88
    return-object p3

    .line 89
    .line 90
    :pswitch_1
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzbk;->zzj:Lcom/google/android/gms/internal/measurement/zzbk;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 94
    move-result-object p1

    .line 95
    .line 96
    .line 97
    invoke-static {p1, v3, p3}, Lcom/google/android/gms/internal/measurement/zzh;->zza(Ljava/lang/String;ILjava/util/List;)V

    .line 98
    .line 99
    .line 100
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 101
    move-result-object p1

    .line 102
    .line 103
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzao;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/zzg;->zza(Lcom/google/android/gms/internal/measurement/zzao;)Lcom/google/android/gms/internal/measurement/zzao;

    .line 107
    move-result-object p1

    .line 108
    .line 109
    .line 110
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzao;->zzd()Ljava/lang/Double;

    .line 111
    move-result-object p1

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 115
    move-result-wide v5

    .line 116
    .line 117
    .line 118
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/measurement/zzh;->zzh(D)J

    .line 119
    move-result-wide v5

    .line 120
    .line 121
    .line 122
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 123
    move-result-object p1

    .line 124
    .line 125
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzao;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/zzg;->zza(Lcom/google/android/gms/internal/measurement/zzao;)Lcom/google/android/gms/internal/measurement/zzao;

    .line 129
    move-result-object p1

    .line 130
    .line 131
    .line 132
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzao;->zzd()Ljava/lang/Double;

    .line 133
    move-result-object p1

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 137
    move-result-wide p1

    .line 138
    .line 139
    .line 140
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/measurement/zzh;->zzh(D)J

    .line 141
    move-result-wide p1

    .line 142
    and-long/2addr p1, v1

    .line 143
    long-to-int p1, p1

    .line 144
    .line 145
    ushr-long p1, v5, p1

    .line 146
    long-to-double p1, p1

    .line 147
    .line 148
    new-instance p3, Lcom/google/android/gms/internal/measurement/zzah;

    .line 149
    .line 150
    .line 151
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 152
    move-result-object p1

    .line 153
    .line 154
    .line 155
    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/measurement/zzah;-><init>(Ljava/lang/Double;)V

    .line 156
    return-object p3

    .line 157
    .line 158
    :pswitch_2
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzbk;->zzi:Lcom/google/android/gms/internal/measurement/zzbk;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 162
    move-result-object p1

    .line 163
    .line 164
    .line 165
    invoke-static {p1, v3, p3}, Lcom/google/android/gms/internal/measurement/zzh;->zza(Ljava/lang/String;ILjava/util/List;)V

    .line 166
    .line 167
    .line 168
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 169
    move-result-object p1

    .line 170
    .line 171
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzao;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/zzg;->zza(Lcom/google/android/gms/internal/measurement/zzao;)Lcom/google/android/gms/internal/measurement/zzao;

    .line 175
    move-result-object p1

    .line 176
    .line 177
    .line 178
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzao;->zzd()Ljava/lang/Double;

    .line 179
    move-result-object p1

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 183
    move-result-wide v5

    .line 184
    .line 185
    .line 186
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/measurement/zzh;->zzg(D)I

    .line 187
    move-result p1

    .line 188
    .line 189
    .line 190
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 191
    move-result-object p3

    .line 192
    .line 193
    check-cast p3, Lcom/google/android/gms/internal/measurement/zzao;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/measurement/zzg;->zza(Lcom/google/android/gms/internal/measurement/zzao;)Lcom/google/android/gms/internal/measurement/zzao;

    .line 197
    move-result-object p2

    .line 198
    .line 199
    .line 200
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/zzao;->zzd()Ljava/lang/Double;

    .line 201
    move-result-object p2

    .line 202
    .line 203
    .line 204
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 205
    move-result-wide p2

    .line 206
    .line 207
    .line 208
    invoke-static {p2, p3}, Lcom/google/android/gms/internal/measurement/zzh;->zzh(D)J

    .line 209
    move-result-wide p2

    .line 210
    and-long/2addr p2, v1

    .line 211
    long-to-int p2, p2

    .line 212
    shr-int/2addr p1, p2

    .line 213
    int-to-double p1, p1

    .line 214
    .line 215
    new-instance p3, Lcom/google/android/gms/internal/measurement/zzah;

    .line 216
    .line 217
    .line 218
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 219
    move-result-object p1

    .line 220
    .line 221
    .line 222
    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/measurement/zzah;-><init>(Ljava/lang/Double;)V

    .line 223
    return-object p3

    .line 224
    .line 225
    :pswitch_3
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzbk;->zzh:Lcom/google/android/gms/internal/measurement/zzbk;

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 229
    move-result-object p1

    .line 230
    .line 231
    .line 232
    invoke-static {p1, v3, p3}, Lcom/google/android/gms/internal/measurement/zzh;->zza(Ljava/lang/String;ILjava/util/List;)V

    .line 233
    .line 234
    .line 235
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 236
    move-result-object p1

    .line 237
    .line 238
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzao;

    .line 239
    .line 240
    .line 241
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/zzg;->zza(Lcom/google/android/gms/internal/measurement/zzao;)Lcom/google/android/gms/internal/measurement/zzao;

    .line 242
    move-result-object p1

    .line 243
    .line 244
    .line 245
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzao;->zzd()Ljava/lang/Double;

    .line 246
    move-result-object p1

    .line 247
    .line 248
    .line 249
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 250
    move-result-wide v0

    .line 251
    .line 252
    .line 253
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzh;->zzg(D)I

    .line 254
    move-result p1

    .line 255
    .line 256
    .line 257
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 258
    move-result-object p3

    .line 259
    .line 260
    check-cast p3, Lcom/google/android/gms/internal/measurement/zzao;

    .line 261
    .line 262
    .line 263
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/measurement/zzg;->zza(Lcom/google/android/gms/internal/measurement/zzao;)Lcom/google/android/gms/internal/measurement/zzao;

    .line 264
    move-result-object p2

    .line 265
    .line 266
    .line 267
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/zzao;->zzd()Ljava/lang/Double;

    .line 268
    move-result-object p2

    .line 269
    .line 270
    .line 271
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 272
    move-result-wide p2

    .line 273
    .line 274
    .line 275
    invoke-static {p2, p3}, Lcom/google/android/gms/internal/measurement/zzh;->zzg(D)I

    .line 276
    move-result p2

    .line 277
    or-int/2addr p1, p2

    .line 278
    int-to-double p1, p1

    .line 279
    .line 280
    new-instance p3, Lcom/google/android/gms/internal/measurement/zzah;

    .line 281
    .line 282
    .line 283
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 284
    move-result-object p1

    .line 285
    .line 286
    .line 287
    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/measurement/zzah;-><init>(Ljava/lang/Double;)V

    .line 288
    return-object p3

    .line 289
    .line 290
    :pswitch_4
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzbk;->zzg:Lcom/google/android/gms/internal/measurement/zzbk;

    .line 291
    .line 292
    .line 293
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 294
    move-result-object p1

    .line 295
    .line 296
    .line 297
    invoke-static {p1, v4, p3}, Lcom/google/android/gms/internal/measurement/zzh;->zza(Ljava/lang/String;ILjava/util/List;)V

    .line 298
    .line 299
    .line 300
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 301
    move-result-object p1

    .line 302
    .line 303
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzao;

    .line 304
    .line 305
    .line 306
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/zzg;->zza(Lcom/google/android/gms/internal/measurement/zzao;)Lcom/google/android/gms/internal/measurement/zzao;

    .line 307
    move-result-object p1

    .line 308
    .line 309
    .line 310
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzao;->zzd()Ljava/lang/Double;

    .line 311
    move-result-object p1

    .line 312
    .line 313
    .line 314
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 315
    move-result-wide p1

    .line 316
    .line 317
    .line 318
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/measurement/zzh;->zzg(D)I

    .line 319
    move-result p1

    .line 320
    not-int p1, p1

    .line 321
    int-to-double p1, p1

    .line 322
    .line 323
    new-instance p3, Lcom/google/android/gms/internal/measurement/zzah;

    .line 324
    .line 325
    .line 326
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 327
    move-result-object p1

    .line 328
    .line 329
    .line 330
    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/measurement/zzah;-><init>(Ljava/lang/Double;)V

    .line 331
    return-object p3

    .line 332
    .line 333
    :pswitch_5
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzbk;->zzf:Lcom/google/android/gms/internal/measurement/zzbk;

    .line 334
    .line 335
    .line 336
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 337
    move-result-object p1

    .line 338
    .line 339
    .line 340
    invoke-static {p1, v3, p3}, Lcom/google/android/gms/internal/measurement/zzh;->zza(Ljava/lang/String;ILjava/util/List;)V

    .line 341
    .line 342
    .line 343
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 344
    move-result-object p1

    .line 345
    .line 346
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzao;

    .line 347
    .line 348
    .line 349
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/zzg;->zza(Lcom/google/android/gms/internal/measurement/zzao;)Lcom/google/android/gms/internal/measurement/zzao;

    .line 350
    move-result-object p1

    .line 351
    .line 352
    .line 353
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzao;->zzd()Ljava/lang/Double;

    .line 354
    move-result-object p1

    .line 355
    .line 356
    .line 357
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 358
    move-result-wide v5

    .line 359
    .line 360
    .line 361
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/measurement/zzh;->zzg(D)I

    .line 362
    move-result p1

    .line 363
    .line 364
    .line 365
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 366
    move-result-object p3

    .line 367
    .line 368
    check-cast p3, Lcom/google/android/gms/internal/measurement/zzao;

    .line 369
    .line 370
    .line 371
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/measurement/zzg;->zza(Lcom/google/android/gms/internal/measurement/zzao;)Lcom/google/android/gms/internal/measurement/zzao;

    .line 372
    move-result-object p2

    .line 373
    .line 374
    .line 375
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/zzao;->zzd()Ljava/lang/Double;

    .line 376
    move-result-object p2

    .line 377
    .line 378
    .line 379
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 380
    move-result-wide p2

    .line 381
    .line 382
    .line 383
    invoke-static {p2, p3}, Lcom/google/android/gms/internal/measurement/zzh;->zzh(D)J

    .line 384
    move-result-wide p2

    .line 385
    and-long/2addr p2, v1

    .line 386
    long-to-int p2, p2

    .line 387
    shl-int/2addr p1, p2

    .line 388
    int-to-double p1, p1

    .line 389
    .line 390
    new-instance p3, Lcom/google/android/gms/internal/measurement/zzah;

    .line 391
    .line 392
    .line 393
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 394
    move-result-object p1

    .line 395
    .line 396
    .line 397
    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/measurement/zzah;-><init>(Ljava/lang/Double;)V

    .line 398
    return-object p3

    .line 399
    .line 400
    :pswitch_6
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzbk;->zze:Lcom/google/android/gms/internal/measurement/zzbk;

    .line 401
    .line 402
    .line 403
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 404
    move-result-object p1

    .line 405
    .line 406
    .line 407
    invoke-static {p1, v3, p3}, Lcom/google/android/gms/internal/measurement/zzh;->zza(Ljava/lang/String;ILjava/util/List;)V

    .line 408
    .line 409
    .line 410
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 411
    move-result-object p1

    .line 412
    .line 413
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzao;

    .line 414
    .line 415
    .line 416
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/zzg;->zza(Lcom/google/android/gms/internal/measurement/zzao;)Lcom/google/android/gms/internal/measurement/zzao;

    .line 417
    move-result-object p1

    .line 418
    .line 419
    .line 420
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzao;->zzd()Ljava/lang/Double;

    .line 421
    move-result-object p1

    .line 422
    .line 423
    .line 424
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 425
    move-result-wide v0

    .line 426
    .line 427
    .line 428
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzh;->zzg(D)I

    .line 429
    move-result p1

    .line 430
    .line 431
    .line 432
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 433
    move-result-object p3

    .line 434
    .line 435
    check-cast p3, Lcom/google/android/gms/internal/measurement/zzao;

    .line 436
    .line 437
    .line 438
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/measurement/zzg;->zza(Lcom/google/android/gms/internal/measurement/zzao;)Lcom/google/android/gms/internal/measurement/zzao;

    .line 439
    move-result-object p2

    .line 440
    .line 441
    .line 442
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/zzao;->zzd()Ljava/lang/Double;

    .line 443
    move-result-object p2

    .line 444
    .line 445
    .line 446
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 447
    move-result-wide p2

    .line 448
    .line 449
    .line 450
    invoke-static {p2, p3}, Lcom/google/android/gms/internal/measurement/zzh;->zzg(D)I

    .line 451
    move-result p2

    .line 452
    and-int/2addr p1, p2

    .line 453
    int-to-double p1, p1

    .line 454
    .line 455
    new-instance p3, Lcom/google/android/gms/internal/measurement/zzah;

    .line 456
    .line 457
    .line 458
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 459
    move-result-object p1

    .line 460
    .line 461
    .line 462
    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/measurement/zzah;-><init>(Ljava/lang/Double;)V

    .line 463
    return-object p3

    .line 464
    nop

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
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
.end method
