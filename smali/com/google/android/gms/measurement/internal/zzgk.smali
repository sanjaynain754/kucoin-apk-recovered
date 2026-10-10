.class public final Lcom/google/android/gms/measurement/internal/zzgk;
.super Lcom/google/android/gms/measurement/internal/zzg;
.source "com.google.android.gms:play-services-measurement-impl@@22.5.0"


# static fields
.field private static final zza:[Ljava/lang/String;


# instance fields
.field private final zzb:Lcom/google/android/gms/measurement/internal/zzgi;

.field private zzc:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    const-string v0, "app_version_int"

    .line 3
    .line 4
    const-string v1, "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"

    .line 5
    .line 6
    const-string v2, "app_version"

    .line 7
    .line 8
    const-string v3, "ALTER TABLE messages ADD COLUMN app_version TEXT;"

    .line 9
    .line 10
    .line 11
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sput-object v0, Lcom/google/android/gms/measurement/internal/zzgk;->zza:[Ljava/lang/String;

    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzib;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/zzg;-><init>(Lcom/google/android/gms/measurement/internal/zzib;)V

    .line 4
    .line 5
    new-instance p1, Lcom/google/android/gms/measurement/internal/zzgi;

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaY()Landroid/content/Context;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzib;->zzc()Lcom/google/android/gms/measurement/internal/zzal;

    .line 17
    .line 18
    const-string v1, "google_app_measurement_local.db"

    .line 19
    .line 20
    .line 21
    invoke-direct {p1, p0, v0, v1}, Lcom/google/android/gms/measurement/internal/zzgi;-><init>(Lcom/google/android/gms/measurement/internal/zzgk;Landroid/content/Context;Ljava/lang/String;)V

    .line 22
    .line 23
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzgk;->zzb:Lcom/google/android/gms/measurement/internal/zzgi;

    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public static synthetic zzr()[Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/google/android/gms/measurement/internal/zzgk;->zza:[Ljava/lang/String;

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

.method private final zzs(I[B)Z
    .locals 18
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
    iget-boolean v0, v1, Lcom/google/android/gms/measurement/internal/zzgk;->zzc:Z

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    goto :goto_2

    .line 12
    .line 13
    :cond_0
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzib;->zzc()Lcom/google/android/gms/measurement/internal/zzal;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    sget-object v4, Lcom/google/android/gms/measurement/internal/zzfx;->zzbc:Lcom/google/android/gms/measurement/internal/zzfw;

    .line 20
    const/4 v5, 0x0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v5, v4}, Lcom/google/android/gms/measurement/internal/zzal;->zzp(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzfw;)Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzv()Lcom/google/android/gms/measurement/internal/zzgh;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v5}, Lcom/google/android/gms/measurement/internal/zzgh;->zzh(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzr;

    .line 36
    move-result-object v0

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v0, v5

    .line 39
    .line 40
    :goto_0
    new-instance v6, Landroid/content/ContentValues;

    .line 41
    .line 42
    .line 43
    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    move-result-object v7

    .line 48
    .line 49
    .line 50
    const-string/jumbo v8, "type"

    .line 51
    .line 52
    .line 53
    invoke-virtual {v6, v8, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 54
    .line 55
    const-string v7, "entry"

    .line 56
    .line 57
    move-object/from16 v8, p2

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzib;->zzc()Lcom/google/android/gms/measurement/internal/zzal;

    .line 64
    move-result-object v7

    .line 65
    .line 66
    .line 67
    invoke-virtual {v7, v5, v4}, Lcom/google/android/gms/measurement/internal/zzal;->zzp(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzfw;)Z

    .line 68
    move-result v4

    .line 69
    .line 70
    if-eqz v4, :cond_2

    .line 71
    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    const-string v4, "app_version"

    .line 75
    .line 76
    iget-object v7, v0, Lcom/google/android/gms/measurement/internal/zzr;->zzc:Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v6, v4, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    iget-wide v7, v0, Lcom/google/android/gms/measurement/internal/zzr;->zzj:J

    .line 82
    .line 83
    .line 84
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    const-string v4, "app_version_int"

    .line 88
    .line 89
    .line 90
    invoke-virtual {v6, v4, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzib;->zzc()Lcom/google/android/gms/measurement/internal/zzal;

    .line 94
    const/4 v4, 0x5

    .line 95
    move v7, v2

    .line 96
    move v8, v4

    .line 97
    .line 98
    :goto_1
    if-ge v7, v4, :cond_e

    .line 99
    const/4 v9, 0x1

    .line 100
    .line 101
    .line 102
    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzgk;->zzp()Landroid/database/sqlite/SQLiteDatabase;

    .line 103
    move-result-object v10
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_0 .. :try_end_0} :catch_d
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_0 .. :try_end_0} :catch_b
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_a
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 104
    .line 105
    if-nez v10, :cond_3

    .line 106
    .line 107
    :try_start_1
    iput-boolean v9, v1, Lcom/google/android/gms/measurement/internal/zzgk;->zzc:Z

    .line 108
    :goto_2
    return v2

    .line 109
    :catchall_0
    move-exception v0

    .line 110
    .line 111
    goto/16 :goto_10

    .line 112
    :catch_0
    move-exception v0

    .line 113
    .line 114
    move/from16 v17, v2

    .line 115
    .line 116
    move/from16 p2, v9

    .line 117
    .line 118
    goto/16 :goto_8

    .line 119
    .line 120
    :catch_1
    move/from16 v17, v2

    .line 121
    .line 122
    goto/16 :goto_9

    .line 123
    :catch_2
    move-exception v0

    .line 124
    .line 125
    move/from16 v17, v2

    .line 126
    .line 127
    move/from16 p2, v9

    .line 128
    .line 129
    goto/16 :goto_a

    .line 130
    .line 131
    .line 132
    :cond_3
    invoke-virtual {v10}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 133
    .line 134
    const-string v0, "select count(1) from messages"

    .line 135
    .line 136
    .line 137
    invoke-virtual {v10, v0, v5}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 138
    move-result-object v11
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 139
    .line 140
    const-wide/16 v12, 0x0

    .line 141
    .line 142
    if-eqz v11, :cond_4

    .line 143
    .line 144
    .line 145
    :try_start_2
    invoke-interface {v11}, Landroid/database/Cursor;->moveToFirst()Z

    .line 146
    move-result v0

    .line 147
    .line 148
    if-eqz v0, :cond_4

    .line 149
    .line 150
    .line 151
    invoke-interface {v11, v2}, Landroid/database/Cursor;->getLong(I)J

    .line 152
    move-result-wide v12
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 153
    goto :goto_5

    .line 154
    :catchall_1
    move-exception v0

    .line 155
    .line 156
    goto/16 :goto_7

    .line 157
    :catch_3
    move-exception v0

    .line 158
    .line 159
    move/from16 v17, v2

    .line 160
    .line 161
    :goto_3
    move/from16 p2, v9

    .line 162
    .line 163
    goto/16 :goto_b

    .line 164
    .line 165
    :catch_4
    move/from16 v17, v2

    .line 166
    .line 167
    goto/16 :goto_c

    .line 168
    :catch_5
    move-exception v0

    .line 169
    .line 170
    move/from16 v17, v2

    .line 171
    .line 172
    :goto_4
    move/from16 p2, v9

    .line 173
    .line 174
    goto/16 :goto_e

    .line 175
    .line 176
    .line 177
    :cond_4
    :goto_5
    const-wide/32 v14, 0x186a0

    .line 178
    .line 179
    cmp-long v0, v12, v14

    .line 180
    .line 181
    const-string v14, "messages"

    .line 182
    .line 183
    if-ltz v0, :cond_5

    .line 184
    .line 185
    .line 186
    :try_start_3
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 187
    move-result-object v0

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 191
    move-result-object v0

    .line 192
    .line 193
    const-string v15, "Data loss, local db full"

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0, v15}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 197
    .line 198
    const-string v0, "rowid in (select rowid from messages order by rowid asc limit ?)"

    .line 199
    .line 200
    .line 201
    const-wide/32 v15, 0x186a1

    .line 202
    sub-long/2addr v15, v12

    .line 203
    .line 204
    .line 205
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 206
    move-result-object v12

    .line 207
    .line 208
    .line 209
    filled-new-array {v12}, [Ljava/lang/String;

    .line 210
    move-result-object v12

    .line 211
    .line 212
    .line 213
    invoke-virtual {v10, v14, v0, v12}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 214
    move-result v0

    .line 215
    int-to-long v12, v0

    .line 216
    .line 217
    cmp-long v0, v12, v15

    .line 218
    .line 219
    if-eqz v0, :cond_5

    .line 220
    .line 221
    .line 222
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 223
    move-result-object v0

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 227
    move-result-object v0
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 228
    .line 229
    move/from16 v17, v2

    .line 230
    .line 231
    :try_start_4
    const-string v2, "Different delete count than expected in local db. expected, received, difference"

    .line 232
    .line 233
    .line 234
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 235
    move-result-object v4
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_4 .. :try_end_4} :catch_9
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_4 .. :try_end_4} :catch_c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_8
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 236
    .line 237
    move/from16 p2, v9

    .line 238
    .line 239
    .line 240
    :try_start_5
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 241
    move-result-object v9

    .line 242
    sub-long/2addr v15, v12

    .line 243
    .line 244
    .line 245
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 246
    move-result-object v12

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, v2, v4, v9, v12}, Lcom/google/android/gms/measurement/internal/zzgr;->zzd(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 250
    goto :goto_6

    .line 251
    :catch_6
    move-exception v0

    .line 252
    goto :goto_b

    .line 253
    :catch_7
    move-exception v0

    .line 254
    .line 255
    goto/16 :goto_e

    .line 256
    :catch_8
    move-exception v0

    .line 257
    goto :goto_3

    .line 258
    :catch_9
    move-exception v0

    .line 259
    goto :goto_4

    .line 260
    .line 261
    :cond_5
    move/from16 v17, v2

    .line 262
    .line 263
    move/from16 p2, v9

    .line 264
    .line 265
    .line 266
    :goto_6
    invoke-virtual {v10, v14, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 267
    .line 268
    .line 269
    invoke-virtual {v10}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v10}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_5 .. :try_end_5} :catch_7
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_5 .. :try_end_5} :catch_c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_6
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 273
    .line 274
    if-eqz v11, :cond_6

    .line 275
    .line 276
    .line 277
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 278
    .line 279
    .line 280
    :cond_6
    invoke-virtual {v10}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 281
    return p2

    .line 282
    :goto_7
    move-object v5, v11

    .line 283
    .line 284
    goto/16 :goto_10

    .line 285
    :goto_8
    move-object v11, v5

    .line 286
    goto :goto_b

    .line 287
    :goto_9
    move-object v11, v5

    .line 288
    goto :goto_c

    .line 289
    :goto_a
    move-object v11, v5

    .line 290
    goto :goto_e

    .line 291
    :catchall_2
    move-exception v0

    .line 292
    move-object v10, v5

    .line 293
    .line 294
    goto/16 :goto_10

    .line 295
    :catch_a
    move-exception v0

    .line 296
    .line 297
    move/from16 v17, v2

    .line 298
    .line 299
    move/from16 p2, v9

    .line 300
    move-object v10, v5

    .line 301
    move-object v11, v10

    .line 302
    .line 303
    :goto_b
    if-eqz v10, :cond_7

    .line 304
    .line 305
    .line 306
    :try_start_6
    invoke-virtual {v10}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    .line 307
    move-result v2

    .line 308
    .line 309
    if-eqz v2, :cond_7

    .line 310
    .line 311
    .line 312
    invoke-virtual {v10}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 313
    .line 314
    :cond_7
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 318
    move-result-object v2

    .line 319
    .line 320
    .line 321
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 322
    move-result-object v2

    .line 323
    .line 324
    const-string v4, "Error writing entry to local database"

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2, v4, v0}, Lcom/google/android/gms/measurement/internal/zzgr;->zzb(Ljava/lang/String;Ljava/lang/Object;)V

    .line 328
    .line 329
    move/from16 v2, p2

    .line 330
    .line 331
    iput-boolean v2, v1, Lcom/google/android/gms/measurement/internal/zzgk;->zzc:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 332
    .line 333
    if-eqz v11, :cond_8

    .line 334
    .line 335
    .line 336
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 337
    .line 338
    :cond_8
    if-eqz v10, :cond_b

    .line 339
    goto :goto_d

    .line 340
    .line 341
    :catch_b
    move/from16 v17, v2

    .line 342
    move-object v10, v5

    .line 343
    move-object v11, v10

    .line 344
    :catch_c
    :goto_c
    int-to-long v12, v8

    .line 345
    .line 346
    .line 347
    :try_start_7
    invoke-static {v12, v13}, Landroid/os/SystemClock;->sleep(J)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 348
    .line 349
    add-int/lit8 v8, v8, 0x14

    .line 350
    .line 351
    if-eqz v11, :cond_9

    .line 352
    .line 353
    .line 354
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 355
    .line 356
    :cond_9
    if-eqz v10, :cond_b

    .line 357
    .line 358
    .line 359
    :goto_d
    invoke-virtual {v10}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 360
    goto :goto_f

    .line 361
    :catch_d
    move-exception v0

    .line 362
    .line 363
    move/from16 v17, v2

    .line 364
    move-object v10, v5

    .line 365
    move-object v11, v10

    .line 366
    .line 367
    :goto_e
    :try_start_8
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 371
    move-result-object v2

    .line 372
    .line 373
    .line 374
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 375
    move-result-object v2

    .line 376
    .line 377
    const-string v4, "Error writing entry; local database full"

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2, v4, v0}, Lcom/google/android/gms/measurement/internal/zzgr;->zzb(Ljava/lang/String;Ljava/lang/Object;)V

    .line 381
    const/4 v2, 0x1

    .line 382
    .line 383
    iput-boolean v2, v1, Lcom/google/android/gms/measurement/internal/zzgk;->zzc:Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 384
    .line 385
    if-eqz v11, :cond_a

    .line 386
    .line 387
    .line 388
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 389
    .line 390
    :cond_a
    if-eqz v10, :cond_b

    .line 391
    goto :goto_d

    .line 392
    .line 393
    :cond_b
    :goto_f
    add-int/lit8 v7, v7, 0x1

    .line 394
    .line 395
    move/from16 v2, v17

    .line 396
    const/4 v4, 0x5

    .line 397
    .line 398
    goto/16 :goto_1

    .line 399
    .line 400
    :goto_10
    if-eqz v5, :cond_c

    .line 401
    .line 402
    .line 403
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 404
    .line 405
    :cond_c
    if-eqz v10, :cond_d

    .line 406
    .line 407
    .line 408
    invoke-virtual {v10}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 409
    :cond_d
    throw v0

    .line 410
    .line 411
    :cond_e
    move/from16 v17, v2

    .line 412
    .line 413
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 417
    move-result-object v0

    .line 418
    .line 419
    .line 420
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgt;->zzk()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 421
    move-result-object v0

    .line 422
    .line 423
    const-string v2, "Failed to write entry to local database"

    .line 424
    .line 425
    .line 426
    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 427
    return v17
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
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
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
.end method


# virtual methods
.method public final zze()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

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

.method public final zzh()V
    .locals 3
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzjd;->zzg()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgk;->zzp()Landroid/database/sqlite/SQLiteDatabase;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v1, "messages"

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, v2, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 16
    move-result v0

    .line 17
    .line 18
    if-lez v0, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzgt;->zzk()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    const-string v2, "Reset local analytics data. records"

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/zzgr;->zzb(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    return-void

    .line 39
    :catch_0
    move-exception v0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-void

    .line 42
    .line 43
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    const-string v2, "Error resetting local analytics data. error"

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/zzgr;->zzb(Ljava/lang/String;Ljava/lang/Object;)V

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
.end method

.method public final zzi(Lcom/google/android/gms/measurement/internal/zzbg;)Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/measurement/internal/zzbh;->zza(Lcom/google/android/gms/measurement/internal/zzbg;Landroid/os/Parcel;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/os/Parcel;->marshall()[B

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 16
    array-length v0, p1

    .line 17
    .line 18
    const/high16 v2, 0x20000

    .line 19
    .line 20
    if-le v0, v2, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzgt;->zzc()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    const-string v0, "Event is too long for local database. Sending event directly to service"

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 36
    return v1

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-direct {p0, v1, p1}, Lcom/google/android/gms/measurement/internal/zzgk;->zzs(I[B)Z

    .line 40
    move-result p1

    .line 41
    return p1
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
.end method

.method public final zzj(Lcom/google/android/gms/measurement/internal/zzpk;)Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/measurement/internal/zzpl;->zza(Lcom/google/android/gms/measurement/internal/zzpk;Landroid/os/Parcel;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/os/Parcel;->marshall()[B

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 16
    array-length v0, p1

    .line 17
    .line 18
    const/high16 v2, 0x20000

    .line 19
    .line 20
    if-le v0, v2, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzgt;->zzc()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    const-string v0, "User property too long for local database. Sending directly to service"

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 36
    return v1

    .line 37
    :cond_0
    const/4 v0, 0x1

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/measurement/internal/zzgk;->zzs(I[B)Z

    .line 41
    move-result p1

    .line 42
    return p1
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
.end method

.method public final zzk(Lcom/google/android/gms/measurement/internal/zzah;)Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzk()Lcom/google/android/gms/measurement/internal/zzpo;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, p1}, Lcom/google/android/gms/measurement/internal/zzpo;->zzae(Landroid/os/Parcelable;)[B

    .line 10
    move-result-object p1

    .line 11
    array-length v1, p1

    .line 12
    .line 13
    const/high16 v2, 0x20000

    .line 14
    .line 15
    if-le v1, v2, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzgt;->zzc()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    const-string v0, "Conditional user property too long for local database. Sending directly to service"

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 29
    const/4 p1, 0x0

    .line 30
    return p1

    .line 31
    :cond_0
    const/4 v0, 0x2

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/measurement/internal/zzgk;->zzs(I[B)Z

    .line 35
    move-result p1

    .line 36
    return p1
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
.end method

.method public final zzl(Lcom/google/android/gms/measurement/internal/zzbe;)Z
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzk()Lcom/google/android/gms/measurement/internal/zzpo;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, p1}, Lcom/google/android/gms/measurement/internal/zzpo;->zzae(Landroid/os/Parcelable;)[B

    .line 10
    move-result-object p1

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzgt;->zzc()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    const-string v0, "Null default event parameters; not writing to database"

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 27
    return v1

    .line 28
    :cond_0
    array-length v2, p1

    .line 29
    .line 30
    const/high16 v3, 0x20000

    .line 31
    .line 32
    if-le v2, v3, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzgt;->zzc()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    const-string v0, "Default event parameters too long for local database. Sending directly to service"

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 46
    return v1

    .line 47
    :cond_1
    const/4 v0, 0x4

    .line 48
    .line 49
    .line 50
    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/measurement/internal/zzgk;->zzs(I[B)Z

    .line 51
    move-result p1

    .line 52
    return p1
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
.end method

.method public final zzm(I)Ljava/util/List;
    .locals 29

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    const-string v2, "Error reading entries from local database"

    .line 5
    .line 6
    const-string v3, "entry"

    .line 7
    .line 8
    .line 9
    const-string/jumbo v4, "type"

    .line 10
    .line 11
    const-string v5, "rowid"

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzjd;->zzg()V

    .line 15
    .line 16
    iget-boolean v0, v1, Lcom/google/android/gms/measurement/internal/zzgk;->zzc:Z

    .line 17
    const/4 v6, 0x0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    return-object v6

    .line 21
    .line 22
    :cond_0
    new-instance v7, Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzgk;->zzq()Z

    .line 29
    move-result v0

    .line 30
    .line 31
    if-eqz v0, :cond_19

    .line 32
    const/4 v8, 0x5

    .line 33
    const/4 v9, 0x0

    .line 34
    move v11, v8

    .line 35
    move v10, v9

    .line 36
    .line 37
    :goto_0
    if-ge v10, v8, :cond_18

    .line 38
    const/4 v12, 0x1

    .line 39
    .line 40
    .line 41
    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzgk;->zzp()Landroid/database/sqlite/SQLiteDatabase;

    .line 42
    move-result-object v13
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_0 .. :try_end_0} :catch_21
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_0 .. :try_end_0} :catch_1f
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1e
    .catchall {:try_start_0 .. :try_end_0} :catchall_b

    .line 43
    .line 44
    if-nez v13, :cond_1

    .line 45
    .line 46
    :try_start_1
    iput-boolean v12, v1, Lcom/google/android/gms/measurement/internal/zzgk;->zzc:Z

    .line 47
    return-object v6

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    .line 50
    goto/16 :goto_19

    .line 51
    :catch_0
    move-exception v0

    .line 52
    .line 53
    move-object/from16 v17, v3

    .line 54
    .line 55
    move-object/from16 v19, v4

    .line 56
    .line 57
    move-object/from16 v21, v5

    .line 58
    move v6, v9

    .line 59
    .line 60
    goto/16 :goto_1a

    .line 61
    .line 62
    :catch_1
    move-object/from16 v17, v3

    .line 63
    .line 64
    move-object/from16 v19, v4

    .line 65
    .line 66
    move-object/from16 v21, v5

    .line 67
    move v6, v9

    .line 68
    .line 69
    goto/16 :goto_1b

    .line 70
    :catch_2
    move-exception v0

    .line 71
    .line 72
    move-object/from16 v17, v3

    .line 73
    .line 74
    move-object/from16 v19, v4

    .line 75
    .line 76
    move-object/from16 v21, v5

    .line 77
    move v6, v9

    .line 78
    .line 79
    goto/16 :goto_1c

    .line 80
    .line 81
    .line 82
    :cond_1
    invoke-virtual {v13}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 83
    .line 84
    const-string v0, "3"
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    .line 86
    :try_start_2
    const-string v14, "messages"

    .line 87
    .line 88
    .line 89
    filled-new-array {v5}, [Ljava/lang/String;

    .line 90
    move-result-object v15

    .line 91
    .line 92
    .line 93
    const-string/jumbo v16, "type=?"

    .line 94
    .line 95
    .line 96
    filled-new-array {v0}, [Ljava/lang/String;

    .line 97
    move-result-object v17

    .line 98
    .line 99
    const-string v20, "rowid desc"

    .line 100
    .line 101
    const-string v21, "1"

    .line 102
    .line 103
    const/16 v18, 0x0

    .line 104
    .line 105
    const/16 v19, 0x0

    .line 106
    .line 107
    .line 108
    invoke-virtual/range {v13 .. v21}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 109
    move-result-object v14
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_a

    .line 110
    .line 111
    .line 112
    :try_start_3
    invoke-interface {v14}, Landroid/database/Cursor;->moveToFirst()Z

    .line 113
    move-result v0

    .line 114
    .line 115
    const-wide/16 v22, -0x1

    .line 116
    .line 117
    if-eqz v0, :cond_2

    .line 118
    .line 119
    .line 120
    invoke-interface {v14, v9}, Landroid/database/Cursor;->getLong(I)J

    .line 121
    move-result-wide v15
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 122
    .line 123
    .line 124
    :try_start_4
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 125
    goto :goto_1

    .line 126
    :catchall_1
    move-exception v0

    .line 127
    .line 128
    move-object/from16 v17, v3

    .line 129
    .line 130
    move-object/from16 v19, v4

    .line 131
    .line 132
    move-object/from16 v21, v5

    .line 133
    move v6, v9

    .line 134
    .line 135
    goto/16 :goto_17

    .line 136
    .line 137
    .line 138
    :cond_2
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 139
    .line 140
    move-wide/from16 v15, v22

    .line 141
    .line 142
    :goto_1
    cmp-long v0, v15, v22

    .line 143
    .line 144
    if-eqz v0, :cond_3

    .line 145
    .line 146
    const-string v0, "rowid<?"

    .line 147
    .line 148
    new-array v14, v12, [Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    invoke-static/range {v15 .. v16}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 152
    move-result-object v15

    .line 153
    .line 154
    aput-object v15, v14, v9

    .line 155
    .line 156
    move-object/from16 v16, v0

    .line 157
    .line 158
    move-object/from16 v17, v14

    .line 159
    goto :goto_2

    .line 160
    .line 161
    :cond_3
    move-object/from16 v16, v6

    .line 162
    .line 163
    move-object/from16 v17, v16

    .line 164
    .line 165
    .line 166
    :goto_2
    filled-new-array {v5, v4, v3}, [Ljava/lang/String;

    .line 167
    move-result-object v0

    .line 168
    .line 169
    iget-object v14, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v14}, Lcom/google/android/gms/measurement/internal/zzib;->zzc()Lcom/google/android/gms/measurement/internal/zzal;

    .line 173
    move-result-object v15

    .line 174
    .line 175
    move/from16 p1, v12

    .line 176
    .line 177
    sget-object v12, Lcom/google/android/gms/measurement/internal/zzfx;->zzbc:Lcom/google/android/gms/measurement/internal/zzfw;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v15, v6, v12}, Lcom/google/android/gms/measurement/internal/zzal;->zzp(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzfw;)Z

    .line 181
    move-result v15

    .line 182
    .line 183
    const/16 v25, 0x4

    .line 184
    .line 185
    const/16 v26, 0x3

    .line 186
    const/4 v6, 0x2

    .line 187
    .line 188
    if-eqz v15, :cond_4

    .line 189
    .line 190
    new-array v0, v8, [Ljava/lang/String;

    .line 191
    .line 192
    aput-object v5, v0, v9

    .line 193
    .line 194
    aput-object v4, v0, p1

    .line 195
    .line 196
    aput-object v3, v0, v6

    .line 197
    .line 198
    const-string v15, "app_version"

    .line 199
    .line 200
    aput-object v15, v0, v26

    .line 201
    .line 202
    const-string v15, "app_version_int"

    .line 203
    .line 204
    aput-object v15, v0, v25

    .line 205
    :cond_4
    move-object v15, v0

    .line 206
    move-object v0, v14

    .line 207
    .line 208
    const-string v14, "messages"

    .line 209
    .line 210
    const-string v20, "rowid asc"

    .line 211
    .line 212
    const/16 v18, 0x64

    .line 213
    .line 214
    .line 215
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 216
    move-result-object v21

    .line 217
    .line 218
    const/16 v18, 0x0

    .line 219
    .line 220
    const/16 v19, 0x0

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v13 .. v21}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 224
    move-result-object v14
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 225
    .line 226
    .line 227
    :goto_3
    :try_start_5
    invoke-interface {v14}, Landroid/database/Cursor;->moveToNext()Z

    .line 228
    move-result v15

    .line 229
    .line 230
    if-eqz v15, :cond_e

    .line 231
    .line 232
    .line 233
    invoke-interface {v14, v9}, Landroid/database/Cursor;->getLong(I)J

    .line 234
    move-result-wide v22

    .line 235
    .line 236
    move/from16 v15, p1

    .line 237
    .line 238
    .line 239
    invoke-interface {v14, v15}, Landroid/database/Cursor;->getInt(I)I

    .line 240
    move-result v8

    .line 241
    .line 242
    .line 243
    invoke-interface {v14, v6}, Landroid/database/Cursor;->getBlob(I)[B

    .line 244
    move-result-object v15

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzc()Lcom/google/android/gms/measurement/internal/zzal;

    .line 248
    move-result-object v6
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_5 .. :try_end_5} :catch_1a
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_5 .. :try_end_5} :catch_19
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_18
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 249
    const/4 v9, 0x0

    .line 250
    .line 251
    .line 252
    :try_start_6
    invoke-virtual {v6, v9, v12}, Lcom/google/android/gms/measurement/internal/zzal;->zzp(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzfw;)Z

    .line 253
    move-result v6

    .line 254
    .line 255
    if-eqz v6, :cond_5

    .line 256
    .line 257
    move/from16 v6, v26

    .line 258
    .line 259
    .line 260
    invoke-interface {v14, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 261
    move-result-object v9

    .line 262
    .line 263
    move/from16 v6, v25

    .line 264
    .line 265
    .line 266
    invoke-interface {v14, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 267
    move-result-wide v19
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_6 .. :try_end_6} :catch_6
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 268
    :goto_4
    move-object v6, v3

    .line 269
    .line 270
    move-wide/from16 v27, v19

    .line 271
    .line 272
    move-object/from16 v19, v4

    .line 273
    .line 274
    move-wide/from16 v3, v27

    .line 275
    goto :goto_8

    .line 276
    :catchall_2
    move-exception v0

    .line 277
    .line 278
    goto/16 :goto_16

    .line 279
    :catch_3
    move-exception v0

    .line 280
    .line 281
    move-object/from16 v17, v3

    .line 282
    .line 283
    move-object/from16 v19, v4

    .line 284
    .line 285
    move-object/from16 v21, v5

    .line 286
    :goto_5
    const/4 v6, 0x0

    .line 287
    .line 288
    goto/16 :goto_1d

    .line 289
    .line 290
    :catch_4
    move-object/from16 v17, v3

    .line 291
    .line 292
    move-object/from16 v19, v4

    .line 293
    .line 294
    move-object/from16 v21, v5

    .line 295
    :catch_5
    :goto_6
    const/4 v6, 0x0

    .line 296
    .line 297
    goto/16 :goto_1e

    .line 298
    :catch_6
    move-exception v0

    .line 299
    .line 300
    move-object/from16 v17, v3

    .line 301
    .line 302
    move-object/from16 v19, v4

    .line 303
    .line 304
    move-object/from16 v21, v5

    .line 305
    :goto_7
    const/4 v6, 0x0

    .line 306
    .line 307
    goto/16 :goto_20

    .line 308
    .line 309
    :cond_5
    const-wide/16 v19, 0x0

    .line 310
    const/4 v9, 0x0

    .line 311
    goto :goto_4

    .line 312
    .line 313
    :goto_8
    if-nez v8, :cond_8

    .line 314
    .line 315
    .line 316
    :try_start_7
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 317
    move-result-object v8
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_7 .. :try_end_7} :catch_e
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_7 .. :try_end_7} :catch_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_c
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 318
    .line 319
    move-object/from16 v20, v0

    .line 320
    :try_start_8
    array-length v0, v15
    :try_end_8
    .catch Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException; {:try_start_8 .. :try_end_8} :catch_a
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 321
    .line 322
    move-object/from16 v21, v5

    .line 323
    const/4 v5, 0x0

    .line 324
    .line 325
    .line 326
    :try_start_9
    invoke-virtual {v8, v15, v5, v0}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v8, v5}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 330
    .line 331
    sget-object v0, Lcom/google/android/gms/measurement/internal/zzbg;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 332
    .line 333
    .line 334
    invoke-interface {v0, v8}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 335
    move-result-object v0

    .line 336
    .line 337
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzbg;
    :try_end_9
    .catch Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException; {:try_start_9 .. :try_end_9} :catch_b
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 338
    .line 339
    .line 340
    :try_start_a
    invoke-virtual {v8}, Landroid/os/Parcel;->recycle()V

    .line 341
    .line 342
    if-eqz v0, :cond_6

    .line 343
    .line 344
    new-instance v5, Lcom/google/android/gms/measurement/internal/zzgj;

    .line 345
    .line 346
    .line 347
    invoke-direct {v5, v0, v9, v3, v4}, Lcom/google/android/gms/measurement/internal/zzgj;-><init>(Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Ljava/lang/String;J)V

    .line 348
    .line 349
    .line 350
    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_a
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_a .. :try_end_a} :catch_9
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_a .. :try_end_a} :catch_8
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_a .. :try_end_a} :catch_7
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 351
    .line 352
    :cond_6
    :goto_9
    move-object/from16 v17, v6

    .line 353
    const/4 v0, 0x2

    .line 354
    :cond_7
    :goto_a
    const/4 v3, 0x3

    .line 355
    const/4 v6, 0x0

    .line 356
    .line 357
    goto/16 :goto_15

    .line 358
    :catch_7
    move-exception v0

    .line 359
    .line 360
    :goto_b
    move-object/from16 v17, v6

    .line 361
    goto :goto_5

    .line 362
    .line 363
    :catch_8
    :goto_c
    move-object/from16 v17, v6

    .line 364
    goto :goto_6

    .line 365
    :catch_9
    move-exception v0

    .line 366
    .line 367
    :goto_d
    move-object/from16 v17, v6

    .line 368
    goto :goto_7

    .line 369
    :catchall_3
    move-exception v0

    .line 370
    goto :goto_e

    .line 371
    :catchall_4
    move-exception v0

    .line 372
    .line 373
    move-object/from16 v21, v5

    .line 374
    goto :goto_e

    .line 375
    .line 376
    :catch_a
    move-object/from16 v21, v5

    .line 377
    .line 378
    :catch_b
    :try_start_b
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 382
    move-result-object v0

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 386
    move-result-object v0

    .line 387
    .line 388
    const-string v3, "Failed to load event from local database"

    .line 389
    .line 390
    .line 391
    invoke-virtual {v0, v3}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 392
    .line 393
    .line 394
    :try_start_c
    invoke-virtual {v8}, Landroid/os/Parcel;->recycle()V

    .line 395
    goto :goto_9

    .line 396
    .line 397
    .line 398
    :goto_e
    invoke-virtual {v8}, Landroid/os/Parcel;->recycle()V

    .line 399
    throw v0

    .line 400
    :catch_c
    move-exception v0

    .line 401
    .line 402
    move-object/from16 v21, v5

    .line 403
    goto :goto_b

    .line 404
    .line 405
    :catch_d
    move-object/from16 v21, v5

    .line 406
    goto :goto_c

    .line 407
    :catch_e
    move-exception v0

    .line 408
    .line 409
    move-object/from16 v21, v5

    .line 410
    goto :goto_d

    .line 411
    .line 412
    :cond_8
    move-object/from16 v20, v0

    .line 413
    .line 414
    move-object/from16 v21, v5

    .line 415
    const/4 v5, 0x1

    .line 416
    .line 417
    if-ne v8, v5, :cond_9

    .line 418
    .line 419
    .line 420
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 421
    move-result-object v5
    :try_end_c
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_c .. :try_end_c} :catch_9
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_c .. :try_end_c} :catch_8
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_7
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 422
    :try_start_d
    array-length v0, v15

    .line 423
    const/4 v8, 0x0

    .line 424
    .line 425
    .line 426
    invoke-virtual {v5, v15, v8, v0}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v5, v8}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 430
    .line 431
    sget-object v0, Lcom/google/android/gms/measurement/internal/zzpk;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 432
    .line 433
    .line 434
    invoke-interface {v0, v5}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 435
    move-result-object v0

    .line 436
    .line 437
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzpk;
    :try_end_d
    .catch Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException; {:try_start_d .. :try_end_d} :catch_f
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 438
    .line 439
    .line 440
    :try_start_e
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V
    :try_end_e
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_e .. :try_end_e} :catch_9
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_e .. :try_end_e} :catch_8
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_e .. :try_end_e} :catch_7
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 441
    goto :goto_f

    .line 442
    :catchall_5
    move-exception v0

    .line 443
    goto :goto_10

    .line 444
    .line 445
    :catch_f
    :try_start_f
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 449
    move-result-object v0

    .line 450
    .line 451
    .line 452
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 453
    move-result-object v0

    .line 454
    .line 455
    const-string v8, "Failed to load user property from local database"

    .line 456
    .line 457
    .line 458
    invoke-virtual {v0, v8}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 459
    .line 460
    .line 461
    :try_start_10
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 462
    const/4 v0, 0x0

    .line 463
    .line 464
    :goto_f
    if-eqz v0, :cond_6

    .line 465
    .line 466
    new-instance v5, Lcom/google/android/gms/measurement/internal/zzgj;

    .line 467
    .line 468
    .line 469
    invoke-direct {v5, v0, v9, v3, v4}, Lcom/google/android/gms/measurement/internal/zzgj;-><init>(Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Ljava/lang/String;J)V

    .line 470
    .line 471
    .line 472
    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 473
    goto :goto_9

    .line 474
    .line 475
    .line 476
    :goto_10
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 477
    throw v0

    .line 478
    :cond_9
    const/4 v0, 0x2

    .line 479
    .line 480
    if-ne v8, v0, :cond_a

    .line 481
    .line 482
    .line 483
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 484
    move-result-object v5
    :try_end_10
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_10 .. :try_end_10} :catch_9
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_10 .. :try_end_10} :catch_8
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_10 .. :try_end_10} :catch_7
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    .line 485
    :try_start_11
    array-length v8, v15
    :try_end_11
    .catch Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException; {:try_start_11 .. :try_end_11} :catch_12
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 486
    .line 487
    move-object/from16 v17, v6

    .line 488
    const/4 v6, 0x0

    .line 489
    .line 490
    .line 491
    :try_start_12
    invoke-virtual {v5, v15, v6, v8}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v5, v6}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 495
    .line 496
    sget-object v6, Lcom/google/android/gms/measurement/internal/zzah;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 497
    .line 498
    .line 499
    invoke-interface {v6, v5}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 500
    move-result-object v6

    .line 501
    .line 502
    check-cast v6, Lcom/google/android/gms/measurement/internal/zzah;
    :try_end_12
    .catch Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException; {:try_start_12 .. :try_end_12} :catch_13
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    .line 503
    .line 504
    .line 505
    :try_start_13
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V
    :try_end_13
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_13 .. :try_end_13} :catch_11
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_13 .. :try_end_13} :catch_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_13 .. :try_end_13} :catch_10
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    .line 506
    goto :goto_11

    .line 507
    :catch_10
    move-exception v0

    .line 508
    .line 509
    goto/16 :goto_5

    .line 510
    :catch_11
    move-exception v0

    .line 511
    .line 512
    goto/16 :goto_7

    .line 513
    :catchall_6
    move-exception v0

    .line 514
    goto :goto_12

    .line 515
    :catchall_7
    move-exception v0

    .line 516
    .line 517
    move-object/from16 v17, v6

    .line 518
    goto :goto_12

    .line 519
    .line 520
    :catch_12
    move-object/from16 v17, v6

    .line 521
    .line 522
    :catch_13
    :try_start_14
    iget-object v6, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 526
    move-result-object v6

    .line 527
    .line 528
    .line 529
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 530
    move-result-object v6

    .line 531
    .line 532
    const-string v8, "Failed to load conditional user property from local database"

    .line 533
    .line 534
    .line 535
    invoke-virtual {v6, v8}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_6

    .line 536
    .line 537
    .line 538
    :try_start_15
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 539
    const/4 v6, 0x0

    .line 540
    .line 541
    :goto_11
    if-eqz v6, :cond_7

    .line 542
    .line 543
    new-instance v5, Lcom/google/android/gms/measurement/internal/zzgj;

    .line 544
    .line 545
    .line 546
    invoke-direct {v5, v6, v9, v3, v4}, Lcom/google/android/gms/measurement/internal/zzgj;-><init>(Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Ljava/lang/String;J)V

    .line 547
    .line 548
    .line 549
    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 550
    .line 551
    goto/16 :goto_a

    .line 552
    .line 553
    .line 554
    :goto_12
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 555
    throw v0

    .line 556
    .line 557
    :cond_a
    move-object/from16 v17, v6

    .line 558
    const/4 v6, 0x4

    .line 559
    .line 560
    if-ne v8, v6, :cond_c

    .line 561
    .line 562
    .line 563
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 564
    move-result-object v5
    :try_end_15
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_15 .. :try_end_15} :catch_11
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_15 .. :try_end_15} :catch_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_15 .. :try_end_15} :catch_10
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    .line 565
    :try_start_16
    array-length v8, v15
    :try_end_16
    .catch Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException; {:try_start_16 .. :try_end_16} :catch_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_9

    .line 566
    const/4 v6, 0x0

    .line 567
    .line 568
    .line 569
    :try_start_17
    invoke-virtual {v5, v15, v6, v8}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v5, v6}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 573
    .line 574
    sget-object v8, Lcom/google/android/gms/measurement/internal/zzbe;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 575
    .line 576
    .line 577
    invoke-interface {v8, v5}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 578
    move-result-object v8

    .line 579
    .line 580
    check-cast v8, Lcom/google/android/gms/measurement/internal/zzbe;
    :try_end_17
    .catch Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException; {:try_start_17 .. :try_end_17} :catch_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_8

    .line 581
    .line 582
    .line 583
    :try_start_18
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V
    :try_end_18
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_18 .. :try_end_18} :catch_15
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_18 .. :try_end_18} :catch_20
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_18 .. :try_end_18} :catch_14
    .catchall {:try_start_18 .. :try_end_18} :catchall_2

    .line 584
    goto :goto_13

    .line 585
    :catch_14
    move-exception v0

    .line 586
    .line 587
    goto/16 :goto_1d

    .line 588
    :catch_15
    move-exception v0

    .line 589
    .line 590
    goto/16 :goto_20

    .line 591
    :catchall_8
    move-exception v0

    .line 592
    goto :goto_14

    .line 593
    :catchall_9
    move-exception v0

    .line 594
    const/4 v6, 0x0

    .line 595
    goto :goto_14

    .line 596
    :catch_16
    const/4 v6, 0x0

    .line 597
    .line 598
    :catch_17
    :try_start_19
    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 602
    move-result-object v8

    .line 603
    .line 604
    .line 605
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 606
    move-result-object v8

    .line 607
    .line 608
    const-string v15, "Failed to load default event parameters from local database"

    .line 609
    .line 610
    .line 611
    invoke-virtual {v8, v15}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_8

    .line 612
    .line 613
    .line 614
    :try_start_1a
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 615
    const/4 v8, 0x0

    .line 616
    .line 617
    :goto_13
    if-eqz v8, :cond_b

    .line 618
    .line 619
    new-instance v5, Lcom/google/android/gms/measurement/internal/zzgj;

    .line 620
    .line 621
    .line 622
    invoke-direct {v5, v8, v9, v3, v4}, Lcom/google/android/gms/measurement/internal/zzgj;-><init>(Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Ljava/lang/String;J)V

    .line 623
    .line 624
    .line 625
    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 626
    :cond_b
    const/4 v3, 0x3

    .line 627
    goto :goto_15

    .line 628
    .line 629
    .line 630
    :goto_14
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 631
    throw v0

    .line 632
    :cond_c
    const/4 v3, 0x3

    .line 633
    const/4 v6, 0x0

    .line 634
    .line 635
    if-ne v8, v3, :cond_d

    .line 636
    .line 637
    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 641
    move-result-object v4

    .line 642
    .line 643
    .line 644
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzgt;->zzk()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 645
    move-result-object v4

    .line 646
    .line 647
    const-string v5, "Skipping app launch break"

    .line 648
    .line 649
    .line 650
    invoke-virtual {v4, v5}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 651
    goto :goto_15

    .line 652
    .line 653
    :cond_d
    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 657
    move-result-object v4

    .line 658
    .line 659
    .line 660
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 661
    move-result-object v4

    .line 662
    .line 663
    const-string v5, "Unknown record type in local database"

    .line 664
    .line 665
    .line 666
    invoke-virtual {v4, v5}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 667
    .line 668
    :goto_15
    move/from16 v26, v3

    .line 669
    move v9, v6

    .line 670
    .line 671
    move-object/from16 v3, v17

    .line 672
    .line 673
    move-object/from16 v4, v19

    .line 674
    .line 675
    move-object/from16 v5, v21

    .line 676
    .line 677
    const/16 p1, 0x1

    .line 678
    const/4 v8, 0x5

    .line 679
    .line 680
    const/16 v25, 0x4

    .line 681
    move v6, v0

    .line 682
    .line 683
    move-object/from16 v0, v20

    .line 684
    .line 685
    goto/16 :goto_3

    .line 686
    :catch_18
    move-exception v0

    .line 687
    .line 688
    move-object/from16 v17, v3

    .line 689
    .line 690
    move-object/from16 v19, v4

    .line 691
    .line 692
    move-object/from16 v21, v5

    .line 693
    move v6, v9

    .line 694
    .line 695
    goto/16 :goto_1d

    .line 696
    .line 697
    :catch_19
    move-object/from16 v17, v3

    .line 698
    .line 699
    move-object/from16 v19, v4

    .line 700
    .line 701
    move-object/from16 v21, v5

    .line 702
    move v6, v9

    .line 703
    .line 704
    goto/16 :goto_1e

    .line 705
    :catch_1a
    move-exception v0

    .line 706
    .line 707
    move-object/from16 v17, v3

    .line 708
    .line 709
    move-object/from16 v19, v4

    .line 710
    .line 711
    move-object/from16 v21, v5

    .line 712
    move v6, v9

    .line 713
    .line 714
    goto/16 :goto_20

    .line 715
    .line 716
    :cond_e
    move-object/from16 v17, v3

    .line 717
    .line 718
    move-object/from16 v19, v4

    .line 719
    .line 720
    move-object/from16 v21, v5

    .line 721
    move v6, v9

    .line 722
    .line 723
    const-string v0, "messages"

    .line 724
    .line 725
    const-string v3, "rowid <= ?"

    .line 726
    .line 727
    .line 728
    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 729
    move-result-object v4

    .line 730
    .line 731
    .line 732
    filled-new-array {v4}, [Ljava/lang/String;

    .line 733
    move-result-object v4

    .line 734
    .line 735
    .line 736
    invoke-virtual {v13, v0, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 737
    move-result v0

    .line 738
    .line 739
    .line 740
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 741
    move-result v3

    .line 742
    .line 743
    if-ge v0, v3, :cond_f

    .line 744
    .line 745
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 746
    .line 747
    .line 748
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 749
    move-result-object v0

    .line 750
    .line 751
    .line 752
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 753
    move-result-object v0

    .line 754
    .line 755
    const-string v3, "Fewer entries removed from local database than expected"

    .line 756
    .line 757
    .line 758
    invoke-virtual {v0, v3}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 759
    .line 760
    .line 761
    :cond_f
    invoke-virtual {v13}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 762
    .line 763
    .line 764
    invoke-virtual {v13}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_1a
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_1a .. :try_end_1a} :catch_15
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_1a .. :try_end_1a} :catch_20
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1a .. :try_end_1a} :catch_14
    .catchall {:try_start_1a .. :try_end_1a} :catchall_2

    .line 765
    .line 766
    .line 767
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 768
    .line 769
    .line 770
    invoke-virtual {v13}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 771
    return-object v7

    .line 772
    :goto_16
    move-object v6, v14

    .line 773
    .line 774
    goto/16 :goto_22

    .line 775
    :catchall_a
    move-exception v0

    .line 776
    .line 777
    move-object/from16 v17, v3

    .line 778
    .line 779
    move-object/from16 v19, v4

    .line 780
    .line 781
    move-object/from16 v21, v5

    .line 782
    move v6, v9

    .line 783
    const/4 v14, 0x0

    .line 784
    .line 785
    :goto_17
    if-eqz v14, :cond_10

    .line 786
    .line 787
    .line 788
    :try_start_1b
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 789
    goto :goto_18

    .line 790
    :catch_1b
    move-exception v0

    .line 791
    goto :goto_1a

    .line 792
    :catch_1c
    move-exception v0

    .line 793
    goto :goto_1c

    .line 794
    :cond_10
    :goto_18
    throw v0
    :try_end_1b
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_1b .. :try_end_1b} :catch_1c
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_1b .. :try_end_1b} :catch_1d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1b .. :try_end_1b} :catch_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_0

    .line 795
    :goto_19
    const/4 v6, 0x0

    .line 796
    .line 797
    goto/16 :goto_22

    .line 798
    :goto_1a
    const/4 v14, 0x0

    .line 799
    goto :goto_1d

    .line 800
    :catch_1d
    :goto_1b
    const/4 v14, 0x0

    .line 801
    goto :goto_1e

    .line 802
    :goto_1c
    const/4 v14, 0x0

    .line 803
    goto :goto_20

    .line 804
    :catchall_b
    move-exception v0

    .line 805
    const/4 v6, 0x0

    .line 806
    const/4 v13, 0x0

    .line 807
    .line 808
    goto/16 :goto_22

    .line 809
    :catch_1e
    move-exception v0

    .line 810
    .line 811
    move-object/from16 v17, v3

    .line 812
    .line 813
    move-object/from16 v19, v4

    .line 814
    .line 815
    move-object/from16 v21, v5

    .line 816
    move v6, v9

    .line 817
    const/4 v13, 0x0

    .line 818
    goto :goto_1a

    .line 819
    .line 820
    :goto_1d
    if-eqz v13, :cond_11

    .line 821
    .line 822
    .line 823
    :try_start_1c
    invoke-virtual {v13}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    .line 824
    move-result v3

    .line 825
    .line 826
    if-eqz v3, :cond_11

    .line 827
    .line 828
    .line 829
    invoke-virtual {v13}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 830
    .line 831
    :cond_11
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 832
    .line 833
    .line 834
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 835
    move-result-object v3

    .line 836
    .line 837
    .line 838
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 839
    move-result-object v3

    .line 840
    .line 841
    .line 842
    invoke-virtual {v3, v2, v0}, Lcom/google/android/gms/measurement/internal/zzgr;->zzb(Ljava/lang/String;Ljava/lang/Object;)V

    .line 843
    const/4 v15, 0x1

    .line 844
    .line 845
    iput-boolean v15, v1, Lcom/google/android/gms/measurement/internal/zzgk;->zzc:Z
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_2

    .line 846
    .line 847
    if-eqz v14, :cond_12

    .line 848
    .line 849
    .line 850
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 851
    .line 852
    :cond_12
    if-eqz v13, :cond_15

    .line 853
    goto :goto_1f

    .line 854
    .line 855
    :catch_1f
    move-object/from16 v17, v3

    .line 856
    .line 857
    move-object/from16 v19, v4

    .line 858
    .line 859
    move-object/from16 v21, v5

    .line 860
    move v6, v9

    .line 861
    const/4 v13, 0x0

    .line 862
    goto :goto_1b

    .line 863
    :catch_20
    :goto_1e
    int-to-long v3, v11

    .line 864
    .line 865
    .line 866
    :try_start_1d
    invoke-static {v3, v4}, Landroid/os/SystemClock;->sleep(J)V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_2

    .line 867
    .line 868
    add-int/lit8 v11, v11, 0x14

    .line 869
    .line 870
    if-eqz v14, :cond_13

    .line 871
    .line 872
    .line 873
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 874
    .line 875
    :cond_13
    if-eqz v13, :cond_15

    .line 876
    .line 877
    .line 878
    :goto_1f
    invoke-virtual {v13}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 879
    goto :goto_21

    .line 880
    :catch_21
    move-exception v0

    .line 881
    .line 882
    move-object/from16 v17, v3

    .line 883
    .line 884
    move-object/from16 v19, v4

    .line 885
    .line 886
    move-object/from16 v21, v5

    .line 887
    move v6, v9

    .line 888
    const/4 v13, 0x0

    .line 889
    goto :goto_1c

    .line 890
    .line 891
    :goto_20
    :try_start_1e
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 892
    .line 893
    .line 894
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 895
    move-result-object v3

    .line 896
    .line 897
    .line 898
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 899
    move-result-object v3

    .line 900
    .line 901
    .line 902
    invoke-virtual {v3, v2, v0}, Lcom/google/android/gms/measurement/internal/zzgr;->zzb(Ljava/lang/String;Ljava/lang/Object;)V

    .line 903
    const/4 v15, 0x1

    .line 904
    .line 905
    iput-boolean v15, v1, Lcom/google/android/gms/measurement/internal/zzgk;->zzc:Z
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_2

    .line 906
    .line 907
    if-eqz v14, :cond_14

    .line 908
    .line 909
    .line 910
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 911
    .line 912
    :cond_14
    if-eqz v13, :cond_15

    .line 913
    goto :goto_1f

    .line 914
    .line 915
    :cond_15
    :goto_21
    add-int/lit8 v10, v10, 0x1

    .line 916
    move v9, v6

    .line 917
    .line 918
    move-object/from16 v3, v17

    .line 919
    .line 920
    move-object/from16 v4, v19

    .line 921
    .line 922
    move-object/from16 v5, v21

    .line 923
    const/4 v6, 0x0

    .line 924
    const/4 v8, 0x5

    .line 925
    .line 926
    goto/16 :goto_0

    .line 927
    .line 928
    :goto_22
    if-eqz v6, :cond_16

    .line 929
    .line 930
    .line 931
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 932
    .line 933
    :cond_16
    if-eqz v13, :cond_17

    .line 934
    .line 935
    .line 936
    invoke-virtual {v13}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 937
    :cond_17
    throw v0

    .line 938
    .line 939
    :cond_18
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 940
    .line 941
    .line 942
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 943
    move-result-object v0

    .line 944
    .line 945
    .line 946
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgt;->zze()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 947
    move-result-object v0

    .line 948
    .line 949
    const-string v2, "Failed to read events from database in reasonable time"

    .line 950
    .line 951
    .line 952
    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 953
    .line 954
    const/16 v24, 0x0

    .line 955
    return-object v24

    .line 956
    :cond_19
    return-object v7
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

.method public final zzn()Z
    .locals 2
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    const/4 v1, 0x3

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/measurement/internal/zzgk;->zzs(I[B)Z

    .line 8
    move-result v0

    .line 9
    return v0
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

.method public final zzo()Z
    .locals 10
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    .line 2
    const-string v0, "Error deleting app launch break from local database"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzjd;->zzg()V

    .line 6
    .line 7
    iget-boolean v1, p0, Lcom/google/android/gms/measurement/internal/zzgk;->zzc:Z

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_6

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgk;->zzq()Z

    .line 16
    move-result v1

    .line 17
    .line 18
    if-eqz v1, :cond_6

    .line 19
    const/4 v1, 0x5

    .line 20
    move v4, v1

    .line 21
    move v3, v2

    .line 22
    .line 23
    :goto_0
    if-ge v3, v1, :cond_5

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x1

    .line 26
    .line 27
    .line 28
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgk;->zzp()Landroid/database/sqlite/SQLiteDatabase;

    .line 29
    move-result-object v5

    .line 30
    .line 31
    if-nez v5, :cond_1

    .line 32
    .line 33
    iput-boolean v6, p0, Lcom/google/android/gms/measurement/internal/zzgk;->zzc:Z

    .line 34
    .line 35
    goto/16 :goto_6

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    goto :goto_5

    .line 38
    :catch_0
    move-exception v7

    .line 39
    goto :goto_1

    .line 40
    :catch_1
    move-exception v7

    .line 41
    goto :goto_3

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 45
    .line 46
    const-string v7, "messages"

    .line 47
    .line 48
    .line 49
    const-string/jumbo v8, "type == ?"

    .line 50
    const/4 v9, 0x3

    .line 51
    .line 52
    .line 53
    invoke-static {v9}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 54
    move-result-object v9

    .line 55
    .line 56
    .line 57
    filled-new-array {v9}, [Ljava/lang/String;

    .line 58
    move-result-object v9

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5, v7, v8, v9}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 71
    return v6

    .line 72
    .line 73
    :goto_1
    if-eqz v5, :cond_2

    .line 74
    .line 75
    .line 76
    :try_start_1
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    .line 77
    move-result v8

    .line 78
    .line 79
    if-eqz v8, :cond_2

    .line 80
    .line 81
    .line 82
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 83
    .line 84
    :cond_2
    iget-object v8, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 88
    move-result-object v8

    .line 89
    .line 90
    .line 91
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 92
    move-result-object v8

    .line 93
    .line 94
    .line 95
    invoke-virtual {v8, v0, v7}, Lcom/google/android/gms/measurement/internal/zzgr;->zzb(Ljava/lang/String;Ljava/lang/Object;)V

    .line 96
    .line 97
    iput-boolean v6, p0, Lcom/google/android/gms/measurement/internal/zzgk;->zzc:Z

    .line 98
    .line 99
    if-eqz v5, :cond_3

    .line 100
    goto :goto_2

    .line 101
    :catch_2
    int-to-long v6, v4

    .line 102
    .line 103
    .line 104
    invoke-static {v6, v7}, Landroid/os/SystemClock;->sleep(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    .line 106
    add-int/lit8 v4, v4, 0x14

    .line 107
    .line 108
    if-eqz v5, :cond_3

    .line 109
    .line 110
    .line 111
    :goto_2
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 112
    goto :goto_4

    .line 113
    .line 114
    :goto_3
    :try_start_2
    iget-object v8, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 118
    move-result-object v8

    .line 119
    .line 120
    .line 121
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 122
    move-result-object v8

    .line 123
    .line 124
    .line 125
    invoke-virtual {v8, v0, v7}, Lcom/google/android/gms/measurement/internal/zzgr;->zzb(Ljava/lang/String;Ljava/lang/Object;)V

    .line 126
    .line 127
    iput-boolean v6, p0, Lcom/google/android/gms/measurement/internal/zzgk;->zzc:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 128
    .line 129
    if-eqz v5, :cond_3

    .line 130
    goto :goto_2

    .line 131
    .line 132
    :cond_3
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 133
    goto :goto_0

    .line 134
    .line 135
    :goto_5
    if-eqz v5, :cond_4

    .line 136
    .line 137
    .line 138
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 139
    :cond_4
    throw v0

    .line 140
    .line 141
    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 145
    move-result-object v0

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgt;->zze()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 149
    move-result-object v0

    .line 150
    .line 151
    const-string v1, "Error deleting app launch break from local database in reasonable time"

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 155
    :cond_6
    :goto_6
    return v2
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

.method public final zzp()Landroid/database/sqlite/SQLiteDatabase;
    .locals 2
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/sqlite/SQLiteException;
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzgk;->zzc:Z

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    return-object v1

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgk;->zzb:Lcom/google/android/gms/measurement/internal/zzgi;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgi;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    const/4 v0, 0x1

    .line 16
    .line 17
    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzgk;->zzc:Z

    .line 18
    return-object v1

    .line 19
    :cond_1
    return-object v0
    .line 20
    .line 21
    .line 22
.end method

.method public final zzq()Z
    .locals 2
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaY()Landroid/content/Context;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzc()Lcom/google/android/gms/measurement/internal/zzal;

    .line 10
    .line 11
    const-string v0, "google_app_measurement_local.db"

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v0}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 19
    move-result v0

    .line 20
    return v0
    .line 21
    .line 22
.end method
