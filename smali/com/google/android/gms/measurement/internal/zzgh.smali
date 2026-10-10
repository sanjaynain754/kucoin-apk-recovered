.class public final Lcom/google/android/gms/measurement/internal/zzgh;
.super Lcom/google/android/gms/measurement/internal/zzg;
.source "com.google.android.gms:play-services-measurement-impl@@22.5.0"


# instance fields
.field private zza:Ljava/lang/String;

.field private zzb:Ljava/lang/String;

.field private zzc:I

.field private zzd:Ljava/lang/String;

.field private zze:Ljava/lang/String;

.field private zzf:J

.field private final zzg:J

.field private final zzh:J

.field private zzi:Ljava/util/List;

.field private zzj:Ljava/lang/String;

.field private zzk:I

.field private zzl:Ljava/lang/String;

.field private zzm:Ljava/lang/String;

.field private zzn:J

.field private zzo:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzib;JJ)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/zzg;-><init>(Lcom/google/android/gms/measurement/internal/zzib;)V

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzn:J

    .line 8
    const/4 p1, 0x0

    .line 9
    .line 10
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzo:Ljava/lang/String;

    .line 11
    .line 12
    iput-wide p2, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzg:J

    .line 13
    .line 14
    iput-wide p4, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzh:J

    .line 15
    return-void
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
.end method


# virtual methods
.method public final zze()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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
.end method

.method public final zzf()V
    .locals 11
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzgt;->zzk()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    iget-wide v2, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzh:J

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    iget-wide v3, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzg:J

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    move-result-object v3

    .line 23
    .line 24
    const-string v4, "sdkVersion bundled with app, dynamiteVersion"

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v4, v2, v3}, Lcom/google/android/gms/measurement/internal/zzgr;->zzc(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaY()Landroid/content/Context;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaY()Landroid/content/Context;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 43
    move-result-object v2

    .line 44
    const/4 v3, 0x0

    .line 45
    .line 46
    const-string v4, ""

    .line 47
    .line 48
    const/high16 v5, -0x80000000

    .line 49
    .line 50
    const-string v6, "Unknown"

    .line 51
    .line 52
    .line 53
    const-string/jumbo v7, "unknown"

    .line 54
    .line 55
    if-nez v2, :cond_1

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    .line 66
    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/zzgt;->zzl(Ljava/lang/String;)Ljava/lang/Object;

    .line 67
    move-result-object v8

    .line 68
    .line 69
    const-string v9, "PackageManager is null, app identity information might be inaccurate. appId"

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v9, v8}, Lcom/google/android/gms/measurement/internal/zzgr;->zzb(Ljava/lang/String;Ljava/lang/Object;)V

    .line 73
    :cond_0
    move-object v8, v6

    .line 74
    .line 75
    goto/16 :goto_4

    .line 76
    .line 77
    .line 78
    :cond_1
    :try_start_0
    invoke-virtual {v2, v1}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    move-result-object v7
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    goto :goto_0

    .line 81
    .line 82
    :catch_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 86
    move-result-object v0

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 90
    move-result-object v0

    .line 91
    .line 92
    .line 93
    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/zzgt;->zzl(Ljava/lang/String;)Ljava/lang/Object;

    .line 94
    move-result-object v8

    .line 95
    .line 96
    const-string v9, "Error retrieving app installer package name. appId"

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v9, v8}, Lcom/google/android/gms/measurement/internal/zzgr;->zzb(Ljava/lang/String;Ljava/lang/Object;)V

    .line 100
    .line 101
    :goto_0
    if-nez v7, :cond_2

    .line 102
    .line 103
    const-string v0, "manual_install"

    .line 104
    move-object v7, v0

    .line 105
    goto :goto_1

    .line 106
    .line 107
    :cond_2
    const-string v0, "com.android.vending"

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    move-result v0

    .line 112
    .line 113
    if-eqz v0, :cond_3

    .line 114
    move-object v7, v4

    .line 115
    .line 116
    :cond_3
    :goto_1
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaY()Landroid/content/Context;

    .line 120
    move-result-object v0

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 124
    move-result-object v0

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, v0, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 128
    move-result-object v0

    .line 129
    .line 130
    if-eqz v0, :cond_0

    .line 131
    .line 132
    iget-object v8, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v8}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    .line 136
    move-result-object v8

    .line 137
    .line 138
    .line 139
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 140
    move-result v9

    .line 141
    .line 142
    if-nez v9, :cond_4

    .line 143
    .line 144
    .line 145
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 146
    move-result-object v8
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_2

    .line 147
    goto :goto_2

    .line 148
    :cond_4
    move-object v8, v6

    .line 149
    .line 150
    :goto_2
    :try_start_2
    iget-object v6, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 151
    .line 152
    iget v5, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    .line 153
    goto :goto_4

    .line 154
    :catch_1
    move-object v0, v6

    .line 155
    move-object v6, v8

    .line 156
    goto :goto_3

    .line 157
    :catch_2
    move-object v0, v6

    .line 158
    .line 159
    :goto_3
    iget-object v8, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 163
    move-result-object v8

    .line 164
    .line 165
    .line 166
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 167
    move-result-object v8

    .line 168
    .line 169
    .line 170
    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/zzgt;->zzl(Ljava/lang/String;)Ljava/lang/Object;

    .line 171
    move-result-object v9

    .line 172
    .line 173
    const-string v10, "Error retrieving package info. appId, appName"

    .line 174
    .line 175
    .line 176
    invoke-virtual {v8, v10, v9, v6}, Lcom/google/android/gms/measurement/internal/zzgr;->zzc(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 177
    move-object v8, v6

    .line 178
    move-object v6, v0

    .line 179
    .line 180
    :goto_4
    iput-object v1, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zza:Ljava/lang/String;

    .line 181
    .line 182
    iput-object v7, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzd:Ljava/lang/String;

    .line 183
    .line 184
    iput-object v6, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzb:Ljava/lang/String;

    .line 185
    .line 186
    iput v5, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzc:I

    .line 187
    .line 188
    iput-object v8, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zze:Ljava/lang/String;

    .line 189
    .line 190
    const-wide/16 v5, 0x0

    .line 191
    .line 192
    iput-wide v5, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzf:J

    .line 193
    .line 194
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzC()I

    .line 198
    move-result v5

    .line 199
    .line 200
    if-eqz v5, :cond_b

    .line 201
    const/4 v6, 0x1

    .line 202
    .line 203
    if-eq v5, v6, :cond_a

    .line 204
    const/4 v6, 0x3

    .line 205
    .line 206
    if-eq v5, v6, :cond_9

    .line 207
    const/4 v6, 0x4

    .line 208
    .line 209
    if-eq v5, v6, :cond_8

    .line 210
    const/4 v6, 0x6

    .line 211
    .line 212
    if-eq v5, v6, :cond_7

    .line 213
    const/4 v6, 0x7

    .line 214
    .line 215
    if-eq v5, v6, :cond_6

    .line 216
    .line 217
    const/16 v6, 0x8

    .line 218
    .line 219
    if-eq v5, v6, :cond_5

    .line 220
    .line 221
    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 225
    move-result-object v7

    .line 226
    .line 227
    .line 228
    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/zzgt;->zzi()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 229
    move-result-object v7

    .line 230
    .line 231
    const-string v8, "App measurement disabled"

    .line 232
    .line 233
    .line 234
    invoke-virtual {v7, v8}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 238
    move-result-object v6

    .line 239
    .line 240
    .line 241
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzgt;->zzc()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 242
    move-result-object v6

    .line 243
    .line 244
    const-string v7, "Invalid scion state in identity"

    .line 245
    .line 246
    .line 247
    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 248
    goto :goto_5

    .line 249
    .line 250
    :cond_5
    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 254
    move-result-object v6

    .line 255
    .line 256
    .line 257
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzgt;->zzi()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 258
    move-result-object v6

    .line 259
    .line 260
    const-string v7, "App measurement disabled due to denied storage consent"

    .line 261
    .line 262
    .line 263
    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 264
    goto :goto_5

    .line 265
    .line 266
    :cond_6
    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 270
    move-result-object v6

    .line 271
    .line 272
    .line 273
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzgt;->zzi()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 274
    move-result-object v6

    .line 275
    .line 276
    const-string v7, "App measurement disabled via the global data collection setting"

    .line 277
    .line 278
    .line 279
    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 280
    goto :goto_5

    .line 281
    .line 282
    :cond_7
    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 286
    move-result-object v6

    .line 287
    .line 288
    .line 289
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzgt;->zzh()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 290
    move-result-object v6

    .line 291
    .line 292
    const-string v7, "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"

    .line 293
    .line 294
    .line 295
    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 296
    goto :goto_5

    .line 297
    .line 298
    :cond_8
    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 302
    move-result-object v6

    .line 303
    .line 304
    .line 305
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzgt;->zzi()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 306
    move-result-object v6

    .line 307
    .line 308
    const-string v7, "App measurement disabled via the manifest"

    .line 309
    .line 310
    .line 311
    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 312
    goto :goto_5

    .line 313
    .line 314
    :cond_9
    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 318
    move-result-object v6

    .line 319
    .line 320
    .line 321
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzgt;->zzi()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 322
    move-result-object v6

    .line 323
    .line 324
    const-string v7, "App measurement disabled by setAnalyticsCollectionEnabled(false)"

    .line 325
    .line 326
    .line 327
    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 328
    goto :goto_5

    .line 329
    .line 330
    :cond_a
    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 334
    move-result-object v6

    .line 335
    .line 336
    .line 337
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzgt;->zzi()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 338
    move-result-object v6

    .line 339
    .line 340
    const-string v7, "App measurement deactivated via the manifest"

    .line 341
    .line 342
    .line 343
    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 344
    goto :goto_5

    .line 345
    .line 346
    :cond_b
    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 350
    move-result-object v6

    .line 351
    .line 352
    .line 353
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzgt;->zzk()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 354
    move-result-object v6

    .line 355
    .line 356
    const-string v7, "App measurement collection enabled"

    .line 357
    .line 358
    .line 359
    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 360
    .line 361
    :goto_5
    iput-object v4, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzl:Ljava/lang/String;

    .line 362
    .line 363
    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzib;->zzaU()Lcom/google/android/gms/measurement/internal/zzae;

    .line 367
    .line 368
    .line 369
    :try_start_3
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzib;->zzaY()Landroid/content/Context;

    .line 370
    move-result-object v7

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzq()Ljava/lang/String;

    .line 374
    move-result-object v0

    .line 375
    .line 376
    const-string v8, "google_app_id"

    .line 377
    .line 378
    .line 379
    invoke-static {v7, v8, v0}, Lcom/google/android/gms/measurement/internal/zzls;->zza(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 380
    move-result-object v0

    .line 381
    .line 382
    .line 383
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 384
    move-result v7

    .line 385
    .line 386
    if-eqz v7, :cond_c

    .line 387
    goto :goto_6

    .line 388
    :cond_c
    move-object v4, v0

    .line 389
    .line 390
    :goto_6
    iput-object v4, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzl:Ljava/lang/String;

    .line 391
    .line 392
    if-nez v5, :cond_d

    .line 393
    .line 394
    .line 395
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 396
    move-result-object v0

    .line 397
    .line 398
    .line 399
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgt;->zzk()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 400
    move-result-object v0

    .line 401
    .line 402
    const-string v4, "App measurement enabled for app package, google app id"

    .line 403
    .line 404
    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zza:Ljava/lang/String;

    .line 405
    .line 406
    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzl:Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v0, v4, v5, v6}, Lcom/google/android/gms/measurement/internal/zzgr;->zzc(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_3

    .line 410
    goto :goto_7

    .line 411
    :catch_3
    move-exception v0

    .line 412
    .line 413
    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 417
    move-result-object v4

    .line 418
    .line 419
    .line 420
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 421
    move-result-object v4

    .line 422
    .line 423
    .line 424
    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/zzgt;->zzl(Ljava/lang/String;)Ljava/lang/Object;

    .line 425
    move-result-object v1

    .line 426
    .line 427
    const-string v5, "Fetching Google App Id failed with exception. appId"

    .line 428
    .line 429
    .line 430
    invoke-virtual {v4, v5, v1, v0}, Lcom/google/android/gms/measurement/internal/zzgr;->zzc(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 431
    :cond_d
    :goto_7
    const/4 v0, 0x0

    .line 432
    .line 433
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzi:Ljava/util/List;

    .line 434
    .line 435
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaU()Lcom/google/android/gms/measurement/internal/zzae;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzc()Lcom/google/android/gms/measurement/internal/zzal;

    .line 442
    move-result-object v1

    .line 443
    .line 444
    const-string v4, "analytics.safelisted_events"

    .line 445
    .line 446
    .line 447
    invoke-virtual {v1, v4}, Lcom/google/android/gms/measurement/internal/zzal;->zzs(Ljava/lang/String;)Ljava/util/List;

    .line 448
    move-result-object v1

    .line 449
    .line 450
    if-nez v1, :cond_e

    .line 451
    goto :goto_8

    .line 452
    .line 453
    .line 454
    :cond_e
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 455
    move-result v4

    .line 456
    .line 457
    if-eqz v4, :cond_f

    .line 458
    .line 459
    .line 460
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 461
    move-result-object v1

    .line 462
    .line 463
    .line 464
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzgt;->zzh()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 465
    move-result-object v1

    .line 466
    .line 467
    const-string v4, "Safelisted event list is empty. Ignoring"

    .line 468
    .line 469
    .line 470
    invoke-virtual {v1, v4}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 471
    goto :goto_9

    .line 472
    .line 473
    .line 474
    :cond_f
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 475
    move-result-object v4

    .line 476
    .line 477
    .line 478
    :cond_10
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 479
    move-result v5

    .line 480
    .line 481
    if-eqz v5, :cond_11

    .line 482
    .line 483
    .line 484
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 485
    move-result-object v5

    .line 486
    .line 487
    check-cast v5, Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzk()Lcom/google/android/gms/measurement/internal/zzpo;

    .line 491
    move-result-object v6

    .line 492
    .line 493
    const-string v7, "safelisted event"

    .line 494
    .line 495
    .line 496
    invoke-virtual {v6, v7, v5}, Lcom/google/android/gms/measurement/internal/zzpo;->zzk(Ljava/lang/String;Ljava/lang/String;)Z

    .line 497
    move-result v5

    .line 498
    .line 499
    if-nez v5, :cond_10

    .line 500
    goto :goto_9

    .line 501
    .line 502
    :cond_11
    :goto_8
    iput-object v1, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzi:Ljava/util/List;

    .line 503
    .line 504
    :goto_9
    if-eqz v2, :cond_12

    .line 505
    .line 506
    .line 507
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaY()Landroid/content/Context;

    .line 508
    move-result-object v0

    .line 509
    .line 510
    .line 511
    invoke-static {v0}, Lcom/google/android/gms/common/wrappers/InstantApps;->isInstantApp(Landroid/content/Context;)Z

    .line 512
    move-result v0

    .line 513
    .line 514
    iput v0, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzk:I

    .line 515
    return-void

    .line 516
    .line 517
    :cond_12
    iput v3, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzk:I

    .line 518
    return-void
    .line 519
    .line 520
.end method

.method public final zzh(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzr;
    .locals 44
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzjd;->zzg()V

    .line 6
    .line 7
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzr;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzgh;->zzj()Ljava/lang/String;

    .line 11
    move-result-object v3

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzgh;->zzk()Ljava/lang/String;

    .line 15
    move-result-object v4

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzg;->zzb()V

    .line 19
    .line 20
    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/zzgh;->zzb:Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzg;->zzb()V

    .line 24
    .line 25
    iget v0, v1, Lcom/google/android/gms/measurement/internal/zzgh;->zzc:I

    .line 26
    int-to-long v6, v0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzg;->zzb()V

    .line 30
    .line 31
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzgh;->zzd:Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzgh;->zzd:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzc()Lcom/google/android/gms/measurement/internal/zzal;

    .line 42
    move-result-object v9

    .line 43
    .line 44
    .line 45
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/zzal;->zzi()J

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzg;->zzb()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzjd;->zzg()V

    .line 52
    .line 53
    iget-wide v9, v1, Lcom/google/android/gms/measurement/internal/zzgh;->zzf:J

    .line 54
    .line 55
    const-wide/16 v11, 0x0

    .line 56
    .line 57
    cmp-long v13, v9, v11

    .line 58
    const/4 v14, 0x0

    .line 59
    .line 60
    if-nez v13, :cond_4

    .line 61
    .line 62
    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/zzib;->zzk()Lcom/google/android/gms/measurement/internal/zzpo;

    .line 66
    move-result-object v9

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaY()Landroid/content/Context;

    .line 70
    move-result-object v10

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaY()Landroid/content/Context;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    .line 81
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/zzjd;->zzg()V

    .line 82
    .line 83
    .line 84
    invoke-static {v10}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v10}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 91
    move-result-object v13

    .line 92
    .line 93
    .line 94
    invoke-static {}, Lcom/google/android/gms/measurement/internal/zzpo;->zzO()Ljava/security/MessageDigest;

    .line 95
    move-result-object v15

    .line 96
    .line 97
    const-wide/16 v16, -0x1

    .line 98
    .line 99
    if-nez v15, :cond_0

    .line 100
    .line 101
    iget-object v0, v9, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 105
    move-result-object v0

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 109
    move-result-object v0

    .line 110
    .line 111
    const-string v9, "Could not get MD5 instance"

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v9}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 115
    .line 116
    move-wide/from16 v18, v11

    .line 117
    .line 118
    :goto_0
    move-wide/from16 v9, v16

    .line 119
    goto :goto_3

    .line 120
    .line 121
    :cond_0
    if-eqz v13, :cond_3

    .line 122
    .line 123
    .line 124
    :try_start_0
    invoke-virtual {v9, v10, v0}, Lcom/google/android/gms/measurement/internal/zzpo;->zzad(Landroid/content/Context;Ljava/lang/String;)Z

    .line 125
    move-result v0

    .line 126
    .line 127
    if-nez v0, :cond_2

    .line 128
    .line 129
    .line 130
    invoke-static {v10}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    .line 131
    move-result-object v0

    .line 132
    .line 133
    iget-object v10, v9, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/zzib;->zzaY()Landroid/content/Context;

    .line 137
    move-result-object v13

    .line 138
    .line 139
    .line 140
    invoke-virtual {v13}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 141
    move-result-object v13
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 142
    .line 143
    move-wide/from16 v18, v11

    .line 144
    .line 145
    const/16 v11, 0x40

    .line 146
    .line 147
    .line 148
    :try_start_1
    invoke-virtual {v0, v13, v11}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 149
    move-result-object v0

    .line 150
    .line 151
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 152
    .line 153
    if-eqz v0, :cond_1

    .line 154
    array-length v11, v0

    .line 155
    .line 156
    if-lez v11, :cond_1

    .line 157
    .line 158
    aget-object v0, v0, v14

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 162
    move-result-object v0

    .line 163
    .line 164
    .line 165
    invoke-virtual {v15, v0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 166
    move-result-object v0

    .line 167
    .line 168
    .line 169
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzpo;->zzP([B)J

    .line 170
    move-result-wide v16

    .line 171
    goto :goto_0

    .line 172
    :catch_0
    move-exception v0

    .line 173
    goto :goto_1

    .line 174
    .line 175
    .line 176
    :cond_1
    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 177
    move-result-object v0

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgt;->zze()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 181
    move-result-object v0

    .line 182
    .line 183
    const-string v10, "Could not get signatures"

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v10}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 187
    goto :goto_0

    .line 188
    :catch_1
    move-exception v0

    .line 189
    .line 190
    move-wide/from16 v18, v11

    .line 191
    goto :goto_1

    .line 192
    .line 193
    :cond_2
    move-wide/from16 v18, v11

    .line 194
    .line 195
    move-wide/from16 v16, v18

    .line 196
    goto :goto_0

    .line 197
    .line 198
    :goto_1
    iget-object v9, v9, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 202
    move-result-object v9

    .line 203
    .line 204
    .line 205
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 206
    move-result-object v9

    .line 207
    .line 208
    const-string v10, "Package name not found"

    .line 209
    .line 210
    .line 211
    invoke-virtual {v9, v10, v0}, Lcom/google/android/gms/measurement/internal/zzgr;->zzb(Ljava/lang/String;Ljava/lang/Object;)V

    .line 212
    .line 213
    :goto_2
    move-wide/from16 v9, v18

    .line 214
    goto :goto_3

    .line 215
    .line 216
    :cond_3
    move-wide/from16 v18, v11

    .line 217
    goto :goto_2

    .line 218
    .line 219
    :goto_3
    iput-wide v9, v1, Lcom/google/android/gms/measurement/internal/zzgh;->zzf:J

    .line 220
    :goto_4
    move-wide v11, v9

    .line 221
    goto :goto_5

    .line 222
    .line 223
    :cond_4
    move-wide/from16 v18, v11

    .line 224
    goto :goto_4

    .line 225
    .line 226
    :goto_5
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzB()Z

    .line 230
    move-result v9

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzd()Lcom/google/android/gms/measurement/internal/zzhg;

    .line 234
    move-result-object v10

    .line 235
    .line 236
    iget-boolean v10, v10, Lcom/google/android/gms/measurement/internal/zzhg;->zzm:Z

    .line 237
    const/4 v13, 0x1

    .line 238
    .line 239
    xor-int/lit8 v15, v10, 0x1

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzjd;->zzg()V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzB()Z

    .line 246
    move-result v10

    .line 247
    const/4 v13, 0x0

    .line 248
    .line 249
    if-nez v10, :cond_5

    .line 250
    .line 251
    :goto_6
    move-object/from16 v21, v2

    .line 252
    move-object v0, v13

    .line 253
    .line 254
    goto/16 :goto_8

    .line 255
    .line 256
    .line 257
    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzrg;->zza()Z

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzc()Lcom/google/android/gms/measurement/internal/zzal;

    .line 261
    move-result-object v10

    .line 262
    .line 263
    sget-object v14, Lcom/google/android/gms/measurement/internal/zzfx;->zzaH:Lcom/google/android/gms/measurement/internal/zzfw;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v10, v13, v14}, Lcom/google/android/gms/measurement/internal/zzal;->zzp(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzfw;)Z

    .line 267
    move-result v10

    .line 268
    .line 269
    if-eqz v10, :cond_6

    .line 270
    .line 271
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 275
    move-result-object v0

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgt;->zzk()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 279
    move-result-object v0

    .line 280
    .line 281
    const-string v10, "Disabled IID for tests."

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0, v10}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 285
    goto :goto_6

    .line 286
    .line 287
    .line 288
    :cond_6
    :try_start_2
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaY()Landroid/content/Context;

    .line 289
    move-result-object v0

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 293
    move-result-object v0

    .line 294
    .line 295
    const-string v10, "com.google.firebase.analytics.FirebaseAnalytics"

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0, v10}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 299
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_5

    .line 300
    .line 301
    if-nez v0, :cond_7

    .line 302
    goto :goto_6

    .line 303
    .line 304
    :cond_7
    :try_start_3
    const-string v10, "getInstance"

    .line 305
    .line 306
    const-class v14, Landroid/content/Context;

    .line 307
    .line 308
    .line 309
    filled-new-array {v14}, [Ljava/lang/Class;

    .line 310
    move-result-object v14

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0, v10, v14}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 314
    move-result-object v10

    .line 315
    .line 316
    iget-object v14, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v14}, Lcom/google/android/gms/measurement/internal/zzib;->zzaY()Landroid/content/Context;

    .line 320
    move-result-object v14

    .line 321
    .line 322
    .line 323
    filled-new-array {v14}, [Ljava/lang/Object;

    .line 324
    move-result-object v14

    .line 325
    .line 326
    .line 327
    invoke-virtual {v10, v13, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    move-result-object v10
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    .line 329
    .line 330
    if-nez v10, :cond_8

    .line 331
    goto :goto_6

    .line 332
    .line 333
    :cond_8
    :try_start_4
    const-string v14, "getFirebaseInstanceId"
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 334
    .line 335
    move-object/from16 v21, v2

    .line 336
    const/4 v13, 0x0

    .line 337
    .line 338
    :try_start_5
    new-array v2, v13, [Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0, v14, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 342
    move-result-object v0

    .line 343
    .line 344
    new-array v2, v13, [Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v0, v10, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    move-result-object v0

    .line 349
    .line 350
    check-cast v0, Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 351
    goto :goto_8

    .line 352
    .line 353
    :catch_2
    move-object/from16 v21, v2

    .line 354
    .line 355
    :catch_3
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 359
    move-result-object v0

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgt;->zzh()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 363
    move-result-object v0

    .line 364
    .line 365
    const-string v2, "Failed to retrieve Firebase Instance Id"

    .line 366
    .line 367
    .line 368
    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 369
    :goto_7
    const/4 v0, 0x0

    .line 370
    goto :goto_8

    .line 371
    .line 372
    :catch_4
    move-object/from16 v21, v2

    .line 373
    .line 374
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 378
    move-result-object v0

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgt;->zzf()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 382
    move-result-object v0

    .line 383
    .line 384
    const-string v2, "Failed to obtain Firebase Analytics instance"

    .line 385
    .line 386
    .line 387
    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 388
    goto :goto_7

    .line 389
    .line 390
    :catch_5
    move-object/from16 v21, v2

    .line 391
    goto :goto_7

    .line 392
    .line 393
    :goto_8
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzib;->zzd()Lcom/google/android/gms/measurement/internal/zzhg;

    .line 397
    move-result-object v10

    .line 398
    .line 399
    iget-object v10, v10, Lcom/google/android/gms/measurement/internal/zzhg;->zzc:Lcom/google/android/gms/measurement/internal/zzhd;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/zzhd;->zza()J

    .line 403
    move-result-wide v13

    .line 404
    .line 405
    cmp-long v10, v13, v18

    .line 406
    .line 407
    if-nez v10, :cond_9

    .line 408
    .line 409
    iget-wide v13, v2, Lcom/google/android/gms/measurement/internal/zzib;->zza:J

    .line 410
    move-object v10, v3

    .line 411
    goto :goto_9

    .line 412
    :cond_9
    move-object v10, v3

    .line 413
    .line 414
    iget-wide v2, v2, Lcom/google/android/gms/measurement/internal/zzib;->zza:J

    .line 415
    .line 416
    .line 417
    invoke-static {v2, v3, v13, v14}, Ljava/lang/Math;->min(JJ)J

    .line 418
    move-result-wide v13

    .line 419
    .line 420
    .line 421
    :goto_9
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzg;->zzb()V

    .line 422
    .line 423
    iget v2, v1, Lcom/google/android/gms/measurement/internal/zzgh;->zzk:I

    .line 424
    .line 425
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzib;->zzc()Lcom/google/android/gms/measurement/internal/zzal;

    .line 429
    move-result-object v22

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/measurement/internal/zzal;->zzu()Z

    .line 433
    move-result v22

    .line 434
    .line 435
    .line 436
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzib;->zzd()Lcom/google/android/gms/measurement/internal/zzhg;

    .line 437
    move-result-object v23

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v23 .. v23}, Lcom/google/android/gms/measurement/internal/zzjd;->zzg()V

    .line 441
    .line 442
    move-object/from16 v24, v0

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v23 .. v23}, Lcom/google/android/gms/measurement/internal/zzhg;->zzd()Landroid/content/SharedPreferences;

    .line 446
    move-result-object v0

    .line 447
    .line 448
    move/from16 v23, v2

    .line 449
    .line 450
    const-string v2, "deferred_analytics_collection"

    .line 451
    .line 452
    move-object/from16 v25, v3

    .line 453
    const/4 v3, 0x0

    .line 454
    .line 455
    .line 456
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 457
    move-result v0

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v25 .. v25}, Lcom/google/android/gms/measurement/internal/zzib;->zzc()Lcom/google/android/gms/measurement/internal/zzal;

    .line 461
    move-result-object v2

    .line 462
    .line 463
    const-string v3, "google_analytics_default_allow_ad_personalization_signals"

    .line 464
    .line 465
    move/from16 v26, v0

    .line 466
    const/4 v0, 0x1

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/measurement/internal/zzal;->zzw(Ljava/lang/String;Z)Lcom/google/android/gms/measurement/internal/zzjh;

    .line 470
    move-result-object v2

    .line 471
    .line 472
    sget-object v0, Lcom/google/android/gms/measurement/internal/zzjh;->zzd:Lcom/google/android/gms/measurement/internal/zzjh;

    .line 473
    .line 474
    if-eq v2, v0, :cond_a

    .line 475
    const/4 v0, 0x1

    .line 476
    :goto_a
    move-object v2, v4

    .line 477
    .line 478
    move-object/from16 v27, v5

    .line 479
    goto :goto_b

    .line 480
    :cond_a
    const/4 v0, 0x0

    .line 481
    goto :goto_a

    .line 482
    .line 483
    :goto_b
    iget-wide v4, v1, Lcom/google/android/gms/measurement/internal/zzgh;->zzg:J

    .line 484
    .line 485
    .line 486
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 487
    move-result-object v0

    .line 488
    .line 489
    move-object/from16 v28, v0

    .line 490
    .line 491
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzgh;->zzi:Ljava/util/List;

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v25 .. v25}, Lcom/google/android/gms/measurement/internal/zzib;->zzd()Lcom/google/android/gms/measurement/internal/zzhg;

    .line 495
    move-result-object v29

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v29 .. v29}, Lcom/google/android/gms/measurement/internal/zzhg;->zzl()Lcom/google/android/gms/measurement/internal/zzjk;

    .line 499
    move-result-object v29

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v29 .. v29}, Lcom/google/android/gms/measurement/internal/zzjk;->zzl()Ljava/lang/String;

    .line 503
    move-result-object v29

    .line 504
    .line 505
    move-object/from16 v30, v0

    .line 506
    .line 507
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzgh;->zzj:Ljava/lang/String;

    .line 508
    .line 509
    if-nez v0, :cond_b

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v25 .. v25}, Lcom/google/android/gms/measurement/internal/zzib;->zzk()Lcom/google/android/gms/measurement/internal/zzpo;

    .line 513
    move-result-object v0

    .line 514
    .line 515
    .line 516
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzpo;->zzaw()Ljava/lang/String;

    .line 517
    move-result-object v0

    .line 518
    .line 519
    iput-object v0, v1, Lcom/google/android/gms/measurement/internal/zzgh;->zzj:Ljava/lang/String;

    .line 520
    .line 521
    :cond_b
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzgh;->zzj:Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    invoke-virtual/range {v25 .. v25}, Lcom/google/android/gms/measurement/internal/zzib;->zzd()Lcom/google/android/gms/measurement/internal/zzhg;

    .line 525
    move-result-object v31

    .line 526
    .line 527
    move-object/from16 v32, v0

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v31 .. v31}, Lcom/google/android/gms/measurement/internal/zzhg;->zzl()Lcom/google/android/gms/measurement/internal/zzjk;

    .line 531
    move-result-object v0

    .line 532
    .line 533
    move-object/from16 v31, v2

    .line 534
    .line 535
    sget-object v2, Lcom/google/android/gms/measurement/internal/zzjj;->zzb:Lcom/google/android/gms/measurement/internal/zzjj;

    .line 536
    .line 537
    .line 538
    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/zzjk;->zzo(Lcom/google/android/gms/measurement/internal/zzjj;)Z

    .line 539
    move-result v0

    .line 540
    .line 541
    if-nez v0, :cond_c

    .line 542
    .line 543
    move-wide/from16 v33, v4

    .line 544
    const/4 v0, 0x0

    .line 545
    goto :goto_d

    .line 546
    .line 547
    .line 548
    :cond_c
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzjd;->zzg()V

    .line 549
    .line 550
    move-wide/from16 v33, v4

    .line 551
    .line 552
    iget-wide v4, v1, Lcom/google/android/gms/measurement/internal/zzgh;->zzn:J

    .line 553
    .line 554
    cmp-long v0, v4, v18

    .line 555
    .line 556
    if-nez v0, :cond_d

    .line 557
    goto :goto_c

    .line 558
    .line 559
    .line 560
    :cond_d
    invoke-virtual/range {v25 .. v25}, Lcom/google/android/gms/measurement/internal/zzib;->zzaZ()Lcom/google/android/gms/common/util/Clock;

    .line 561
    move-result-object v0

    .line 562
    .line 563
    .line 564
    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    .line 565
    move-result-wide v4

    .line 566
    .line 567
    move-wide/from16 v35, v4

    .line 568
    .line 569
    iget-wide v4, v1, Lcom/google/android/gms/measurement/internal/zzgh;->zzn:J

    .line 570
    .line 571
    sub-long v4, v35, v4

    .line 572
    .line 573
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzgh;->zzm:Ljava/lang/String;

    .line 574
    .line 575
    if-eqz v0, :cond_e

    .line 576
    .line 577
    .line 578
    const-wide/32 v35, 0x5265c00

    .line 579
    .line 580
    cmp-long v0, v4, v35

    .line 581
    .line 582
    if-lez v0, :cond_e

    .line 583
    .line 584
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzgh;->zzo:Ljava/lang/String;

    .line 585
    .line 586
    if-nez v0, :cond_e

    .line 587
    .line 588
    .line 589
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzgh;->zzi()V

    .line 590
    .line 591
    :cond_e
    :goto_c
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzgh;->zzm:Ljava/lang/String;

    .line 592
    .line 593
    if-nez v0, :cond_f

    .line 594
    .line 595
    .line 596
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzgh;->zzi()V

    .line 597
    .line 598
    :cond_f
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzgh;->zzm:Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    :goto_d
    invoke-virtual/range {v25 .. v25}, Lcom/google/android/gms/measurement/internal/zzib;->zzc()Lcom/google/android/gms/measurement/internal/zzal;

    .line 602
    move-result-object v2

    .line 603
    .line 604
    .line 605
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzal;->zzx()Z

    .line 606
    move-result v2

    .line 607
    .line 608
    .line 609
    invoke-virtual/range {v25 .. v25}, Lcom/google/android/gms/measurement/internal/zzib;->zzk()Lcom/google/android/gms/measurement/internal/zzpo;

    .line 610
    move-result-object v4

    .line 611
    .line 612
    .line 613
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzgh;->zzj()Ljava/lang/String;

    .line 614
    move-result-object v5

    .line 615
    .line 616
    move-object/from16 v25, v0

    .line 617
    .line 618
    iget-object v0, v4, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaY()Landroid/content/Context;

    .line 622
    move-result-object v35

    .line 623
    .line 624
    .line 625
    invoke-virtual/range {v35 .. v35}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 626
    move-result-object v35

    .line 627
    .line 628
    if-nez v35, :cond_10

    .line 629
    .line 630
    move/from16 v35, v2

    .line 631
    .line 632
    move-wide/from16 v4, v18

    .line 633
    const/4 v2, 0x0

    .line 634
    goto :goto_10

    .line 635
    .line 636
    .line 637
    :cond_10
    :try_start_6
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaY()Landroid/content/Context;

    .line 638
    move-result-object v0

    .line 639
    .line 640
    .line 641
    invoke-static {v0}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    .line 642
    move-result-object v0
    :try_end_6
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_6 .. :try_end_6} :catch_6

    .line 643
    .line 644
    move/from16 v35, v2

    .line 645
    const/4 v2, 0x0

    .line 646
    .line 647
    .line 648
    :try_start_7
    invoke-virtual {v0, v5, v2}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 649
    move-result-object v0

    .line 650
    .line 651
    if-eqz v0, :cond_11

    .line 652
    .line 653
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I
    :try_end_7
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_7 .. :try_end_7} :catch_7

    .line 654
    goto :goto_f

    .line 655
    :cond_11
    :goto_e
    move v0, v2

    .line 656
    goto :goto_f

    .line 657
    .line 658
    :catch_6
    move/from16 v35, v2

    .line 659
    const/4 v2, 0x0

    .line 660
    .line 661
    :catch_7
    iget-object v0, v4, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaU()Lcom/google/android/gms/measurement/internal/zzae;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 668
    move-result-object v0

    .line 669
    .line 670
    .line 671
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgt;->zzi()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 672
    move-result-object v0

    .line 673
    .line 674
    const-string v4, "PackageManager failed to find running app: app_id"

    .line 675
    .line 676
    .line 677
    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/measurement/internal/zzgr;->zzb(Ljava/lang/String;Ljava/lang/Object;)V

    .line 678
    goto :goto_e

    .line 679
    :goto_f
    int-to-long v4, v0

    .line 680
    .line 681
    :goto_10
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 682
    .line 683
    .line 684
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzd()Lcom/google/android/gms/measurement/internal/zzhg;

    .line 685
    move-result-object v17

    .line 686
    .line 687
    .line 688
    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/measurement/internal/zzhg;->zzl()Lcom/google/android/gms/measurement/internal/zzjk;

    .line 689
    move-result-object v17

    .line 690
    .line 691
    .line 692
    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/measurement/internal/zzjk;->zzb()I

    .line 693
    move-result v17

    .line 694
    .line 695
    .line 696
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzd()Lcom/google/android/gms/measurement/internal/zzhg;

    .line 697
    move-result-object v36

    .line 698
    .line 699
    .line 700
    invoke-virtual/range {v36 .. v36}, Lcom/google/android/gms/measurement/internal/zzhg;->zzj()Lcom/google/android/gms/measurement/internal/zzaz;

    .line 701
    move-result-object v36

    .line 702
    .line 703
    .line 704
    invoke-virtual/range {v36 .. v36}, Lcom/google/android/gms/measurement/internal/zzaz;->zze()Ljava/lang/String;

    .line 705
    move-result-object v36

    .line 706
    .line 707
    .line 708
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzql;->zza()Z

    .line 709
    .line 710
    .line 711
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzc()Lcom/google/android/gms/measurement/internal/zzal;

    .line 712
    move-result-object v2

    .line 713
    .line 714
    move-object/from16 v38, v0

    .line 715
    .line 716
    sget-object v0, Lcom/google/android/gms/measurement/internal/zzfx;->zzaQ:Lcom/google/android/gms/measurement/internal/zzfw;

    .line 717
    .line 718
    move-wide/from16 v39, v4

    .line 719
    const/4 v4, 0x0

    .line 720
    .line 721
    .line 722
    invoke-virtual {v2, v4, v0}, Lcom/google/android/gms/measurement/internal/zzal;->zzp(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzfw;)Z

    .line 723
    move-result v2

    .line 724
    .line 725
    if-eqz v2, :cond_12

    .line 726
    .line 727
    .line 728
    invoke-virtual/range {v38 .. v38}, Lcom/google/android/gms/measurement/internal/zzib;->zzk()Lcom/google/android/gms/measurement/internal/zzpo;

    .line 729
    move-result-object v2

    .line 730
    .line 731
    .line 732
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzpo;->zzU()I

    .line 733
    move-result v2

    .line 734
    goto :goto_11

    .line 735
    :cond_12
    const/4 v2, 0x0

    .line 736
    .line 737
    .line 738
    :goto_11
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzql;->zza()Z

    .line 739
    .line 740
    .line 741
    invoke-virtual/range {v38 .. v38}, Lcom/google/android/gms/measurement/internal/zzib;->zzc()Lcom/google/android/gms/measurement/internal/zzal;

    .line 742
    move-result-object v5

    .line 743
    .line 744
    .line 745
    invoke-virtual {v5, v4, v0}, Lcom/google/android/gms/measurement/internal/zzal;->zzp(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzfw;)Z

    .line 746
    move-result v0

    .line 747
    .line 748
    if-eqz v0, :cond_13

    .line 749
    .line 750
    .line 751
    invoke-virtual/range {v38 .. v38}, Lcom/google/android/gms/measurement/internal/zzib;->zzk()Lcom/google/android/gms/measurement/internal/zzpo;

    .line 752
    move-result-object v0

    .line 753
    .line 754
    .line 755
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzpo;->zzV()J

    .line 756
    move-result-wide v4

    .line 757
    .line 758
    move-wide/from16 v18, v4

    .line 759
    .line 760
    .line 761
    :cond_13
    invoke-virtual/range {v38 .. v38}, Lcom/google/android/gms/measurement/internal/zzib;->zzc()Lcom/google/android/gms/measurement/internal/zzal;

    .line 762
    move-result-object v0

    .line 763
    .line 764
    .line 765
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzal;->zzz()Ljava/lang/String;

    .line 766
    move-result-object v37

    .line 767
    .line 768
    .line 769
    invoke-virtual/range {v38 .. v38}, Lcom/google/android/gms/measurement/internal/zzib;->zzc()Lcom/google/android/gms/measurement/internal/zzal;

    .line 770
    move-result-object v0

    .line 771
    const/4 v4, 0x1

    .line 772
    .line 773
    .line 774
    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/measurement/internal/zzal;->zzw(Ljava/lang/String;Z)Lcom/google/android/gms/measurement/internal/zzjh;

    .line 775
    move-result-object v0

    .line 776
    .line 777
    new-instance v3, Lcom/google/android/gms/measurement/internal/zze;

    .line 778
    .line 779
    .line 780
    invoke-direct {v3, v0}, Lcom/google/android/gms/measurement/internal/zze;-><init>(Lcom/google/android/gms/measurement/internal/zzjh;)V

    .line 781
    .line 782
    .line 783
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zze;->zzb()Ljava/lang/String;

    .line 784
    move-result-object v38

    .line 785
    .line 786
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 787
    .line 788
    iget-wide v3, v0, Lcom/google/android/gms/measurement/internal/zzib;->zza:J

    .line 789
    .line 790
    .line 791
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzx()Lcom/google/android/gms/measurement/internal/zzlp;

    .line 792
    move-result-object v0

    .line 793
    .line 794
    .line 795
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzlp;->zzj()Lcom/google/android/gms/internal/measurement/zzin;

    .line 796
    move-result-object v0

    .line 797
    .line 798
    .line 799
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzin;->zza()I

    .line 800
    move-result v41

    .line 801
    .line 802
    move/from16 v20, v22

    .line 803
    .line 804
    move-object/from16 v16, v24

    .line 805
    .line 806
    move-object/from16 v5, v27

    .line 807
    .line 808
    move-object/from16 v22, v28

    .line 809
    .line 810
    move-object/from16 v27, v32

    .line 811
    .line 812
    move/from16 v32, v17

    .line 813
    .line 814
    move-object/from16 v28, v25

    .line 815
    .line 816
    move-object/from16 v25, v30

    .line 817
    .line 818
    move-wide/from16 v42, v33

    .line 819
    .line 820
    move/from16 v34, v2

    .line 821
    .line 822
    move-object/from16 v2, v21

    .line 823
    .line 824
    move/from16 v21, v26

    .line 825
    .line 826
    move-object/from16 v26, v29

    .line 827
    .line 828
    move/from16 v29, v35

    .line 829
    .line 830
    move-object/from16 v33, v36

    .line 831
    .line 832
    move-wide/from16 v35, v18

    .line 833
    .line 834
    move/from16 v19, v23

    .line 835
    .line 836
    move-wide/from16 v23, v42

    .line 837
    .line 838
    move-wide/from16 v17, v13

    .line 839
    move v14, v9

    .line 840
    .line 841
    move-wide/from16 v42, v3

    .line 842
    move-object v3, v10

    .line 843
    .line 844
    move-object/from16 v4, v31

    .line 845
    .line 846
    move-wide/from16 v30, v39

    .line 847
    .line 848
    move-wide/from16 v39, v42

    .line 849
    .line 850
    .line 851
    const-wide/32 v9, 0x1fbd0

    .line 852
    .line 853
    move-object/from16 v13, p1

    .line 854
    .line 855
    .line 856
    invoke-direct/range {v2 .. v41}, Lcom/google/android/gms/measurement/internal/zzr;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JIZZLjava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;Ljava/lang/String;JI)V

    .line 857
    return-object v2
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
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
.end method

.method public final zzi()V
    .locals 5
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzjd;->zzg()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzd()Lcom/google/android/gms/measurement/internal/zzhg;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzhg;->zzl()Lcom/google/android/gms/measurement/internal/zzjk;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    sget-object v2, Lcom/google/android/gms/measurement/internal/zzjj;->zzb:Lcom/google/android/gms/measurement/internal/zzjj;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/zzjk;->zzo(Lcom/google/android/gms/measurement/internal/zzjj;)Z

    .line 19
    move-result v1

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzgt;->zzj()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    const-string v2, "Analytics Storage consent is not granted"

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 35
    const/4 v1, 0x0

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :cond_0
    const/16 v1, 0x10

    .line 39
    .line 40
    new-array v1, v1, [B

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzk()Lcom/google/android/gms/measurement/internal/zzpo;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzpo;->zzf()Ljava/security/SecureRandom;

    .line 48
    move-result-object v2

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 52
    .line 53
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 54
    .line 55
    new-instance v3, Ljava/math/BigInteger;

    .line 56
    const/4 v4, 0x1

    .line 57
    .line 58
    .line 59
    invoke-direct {v3, v4, v1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 60
    .line 61
    .line 62
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    const-string v3, "%032x"

    .line 66
    .line 67
    .line 68
    invoke-static {v2, v3, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    move-result-object v1

    .line 70
    .line 71
    .line 72
    :goto_0
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 73
    move-result-object v2

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzgt;->zzj()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 77
    move-result-object v2

    .line 78
    .line 79
    if-nez v1, :cond_1

    .line 80
    .line 81
    const-string v3, "null"

    .line 82
    goto :goto_1

    .line 83
    .line 84
    :cond_1
    const-string v3, "not null"

    .line 85
    .line 86
    .line 87
    :goto_1
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 88
    move-result-object v3

    .line 89
    .line 90
    const-string v4, "Resetting session stitching token to %s"

    .line 91
    .line 92
    .line 93
    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 94
    move-result-object v3

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 98
    .line 99
    iput-object v1, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzm:Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaZ()Lcom/google/android/gms/common/util/Clock;

    .line 103
    move-result-object v0

    .line 104
    .line 105
    .line 106
    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    .line 107
    move-result-wide v0

    .line 108
    .line 109
    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzn:J

    .line 110
    return-void
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
.end method

.method public final zzj()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzg;->zzb()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zza:Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zza:Ljava/lang/String;

    .line 11
    return-object v0
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
.end method

.method public final zzk()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzjd;->zzg()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzg;->zzb()V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzl:Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzl:Ljava/lang/String;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final zzl()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzg;->zzb()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zze:Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zze:Ljava/lang/String;

    .line 11
    return-object v0
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
.end method

.method public final zzm()I
    .locals 1
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzg;->zzb()V

    .line 4
    .line 5
    iget v0, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzc:I

    .line 6
    return v0
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
.end method

.method public final zzn()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzh:J

    .line 3
    return-wide v0
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
.end method

.method public final zzo()I
    .locals 1
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzg;->zzb()V

    .line 4
    .line 5
    iget v0, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzk:I

    .line 6
    return v0
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
.end method

.method public final zzp()Ljava/util/List;
    .locals 1
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzi:Ljava/util/List;

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
.end method

.method public final zzq(Ljava/lang/String;)Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzo:Ljava/lang/String;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    const/4 v1, 0x1

    .line 13
    .line 14
    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzgh;->zzo:Ljava/lang/String;

    .line 15
    return v1
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
.end method
