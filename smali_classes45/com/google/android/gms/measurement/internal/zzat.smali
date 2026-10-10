.class public final Lcom/google/android/gms/measurement/internal/zzat;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-measurement@@22.5.0"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/measurement/internal/zzav;

.field private final zzb:Ljava/lang/String;

.field private zzc:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzav;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzat;->zza:Lcom/google/android/gms/measurement/internal/zzav;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzat;->zzb:Ljava/lang/String;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/zzat;->zzc:J

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzav;Ljava/lang/String;J)V
    .locals 2

    .line 3
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzat;->zza:Lcom/google/android/gms/measurement/internal/zzav;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzat;->zzb:Ljava/lang/String;

    .line 5
    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p3

    filled-new-array {p2, p3}, [Ljava/lang/String;

    move-result-object p2

    const-string/jumbo p3, "select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1"

    const-wide/16 v0, -0x1

    .line 6
    invoke-virtual {p1, p3, p2, v0, v1}, Lcom/google/android/gms/measurement/internal/zzav;->zzaj(Ljava/lang/String;[Ljava/lang/String;J)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/zzat;->zzc:J

    return-void
.end method


# virtual methods
.method public final zza()Ljava/util/List;
    .locals 19

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    new-instance v2, Ljava/util/ArrayList;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzat;->zzb:Ljava/lang/String;

    .line 10
    .line 11
    iget-wide v3, v1, Lcom/google/android/gms/measurement/internal/zzat;->zzc:J

    .line 12
    .line 13
    .line 14
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 15
    move-result-object v3

    .line 16
    .line 17
    .line 18
    filled-new-array {v0, v3}, [Ljava/lang/String;

    .line 19
    move-result-object v8

    .line 20
    .line 21
    const-string v7, "app_id = ? and rowid > ?"

    .line 22
    .line 23
    const-string v12, "1000"

    .line 24
    const/4 v3, 0x0

    .line 25
    .line 26
    :try_start_0
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzat;->zza:Lcom/google/android/gms/measurement/internal/zzav;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzav;->zze()Landroid/database/sqlite/SQLiteDatabase;

    .line 30
    move-result-object v4

    .line 31
    .line 32
    .line 33
    const-string/jumbo v5, "raw_events"

    .line 34
    .line 35
    .line 36
    const-string/jumbo v13, "rowid"

    .line 37
    .line 38
    const-string v14, "name"

    .line 39
    .line 40
    .line 41
    const-string/jumbo v15, "timestamp"

    .line 42
    .line 43
    const-string v16, "metadata_fingerprint"

    .line 44
    .line 45
    const-string v17, "data"

    .line 46
    .line 47
    .line 48
    const-string/jumbo v18, "realtime"

    .line 49
    .line 50
    .line 51
    filled-new-array/range {v13 .. v18}, [Ljava/lang/String;

    .line 52
    move-result-object v6

    .line 53
    .line 54
    .line 55
    const-string/jumbo v11, "rowid"

    .line 56
    const/4 v9, 0x0

    .line 57
    const/4 v10, 0x0

    .line 58
    .line 59
    .line 60
    invoke-virtual/range {v4 .. v12}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 61
    move-result-object v3

    .line 62
    .line 63
    .line 64
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    .line 65
    move-result v0

    .line 66
    .line 67
    if-eqz v0, :cond_4

    .line 68
    :cond_0
    const/4 v0, 0x0

    .line 69
    .line 70
    .line 71
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 72
    move-result-wide v5

    .line 73
    const/4 v4, 0x3

    .line 74
    .line 75
    .line 76
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 77
    move-result-wide v7

    .line 78
    const/4 v4, 0x5

    .line 79
    .line 80
    .line 81
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 82
    move-result-wide v9

    .line 83
    .line 84
    const-wide/16 v11, 0x1

    .line 85
    .line 86
    cmp-long v4, v9, v11

    .line 87
    const/4 v9, 0x1

    .line 88
    .line 89
    if-nez v4, :cond_1

    .line 90
    move v0, v9

    .line 91
    :cond_1
    const/4 v4, 0x4

    .line 92
    .line 93
    .line 94
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getBlob(I)[B

    .line 95
    move-result-object v4

    .line 96
    .line 97
    iget-wide v10, v1, Lcom/google/android/gms/measurement/internal/zzat;->zzc:J

    .line 98
    .line 99
    cmp-long v10, v5, v10

    .line 100
    .line 101
    if-lez v10, :cond_2

    .line 102
    .line 103
    iput-wide v5, v1, Lcom/google/android/gms/measurement/internal/zzat;->zzc:J
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    goto :goto_0

    .line 105
    :catchall_0
    move-exception v0

    .line 106
    .line 107
    goto/16 :goto_4

    .line 108
    :catch_0
    move-exception v0

    .line 109
    goto :goto_2

    .line 110
    .line 111
    .line 112
    :cond_2
    :goto_0
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzhs;->zzk()Lcom/google/android/gms/internal/measurement/zzhr;

    .line 113
    move-result-object v10

    .line 114
    .line 115
    .line 116
    invoke-static {v10, v4}, Lcom/google/android/gms/measurement/internal/zzpj;->zzw(Lcom/google/android/gms/internal/measurement/zznk;[B)Lcom/google/android/gms/internal/measurement/zznk;

    .line 117
    move-result-object v4

    .line 118
    .line 119
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzhr;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 120
    .line 121
    .line 122
    :try_start_2
    invoke-interface {v3, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 123
    move-result-object v9

    .line 124
    .line 125
    if-nez v9, :cond_3

    .line 126
    .line 127
    const-string v9, ""

    .line 128
    .line 129
    .line 130
    :cond_3
    invoke-virtual {v4, v9}, Lcom/google/android/gms/internal/measurement/zzhr;->zzl(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhr;

    .line 131
    const/4 v9, 0x2

    .line 132
    .line 133
    .line 134
    invoke-interface {v3, v9}, Landroid/database/Cursor;->getLong(I)J

    .line 135
    move-result-wide v9

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4, v9, v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zzo(J)Lcom/google/android/gms/internal/measurement/zzhr;

    .line 139
    move-object v9, v4

    .line 140
    .line 141
    new-instance v4, Lcom/google/android/gms/measurement/internal/zzas;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 145
    move-result-object v9

    .line 146
    move-object v10, v9

    .line 147
    .line 148
    check-cast v10, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 149
    move v9, v0

    .line 150
    .line 151
    .line 152
    invoke-direct/range {v4 .. v10}, Lcom/google/android/gms/measurement/internal/zzas;-><init>(JJZLcom/google/android/gms/internal/measurement/zzhs;)V

    .line 153
    .line 154
    .line 155
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 156
    goto :goto_1

    .line 157
    :catch_1
    move-exception v0

    .line 158
    .line 159
    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzat;->zza:Lcom/google/android/gms/measurement/internal/zzav;

    .line 160
    .line 161
    iget-object v4, v4, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 165
    move-result-object v4

    .line 166
    .line 167
    .line 168
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 169
    move-result-object v4

    .line 170
    .line 171
    const-string v5, "Data loss. Failed to merge raw event. appId"

    .line 172
    .line 173
    iget-object v6, v1, Lcom/google/android/gms/measurement/internal/zzat;->zzb:Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/zzgt;->zzl(Ljava/lang/String;)Ljava/lang/Object;

    .line 177
    move-result-object v6

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4, v5, v6, v0}, Lcom/google/android/gms/measurement/internal/zzgr;->zzc(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    :goto_1
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 184
    move-result v0

    .line 185
    .line 186
    if-nez v0, :cond_0

    .line 187
    goto :goto_3

    .line 188
    .line 189
    :cond_4
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 190
    goto :goto_3

    .line 191
    .line 192
    :goto_2
    :try_start_3
    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzat;->zza:Lcom/google/android/gms/measurement/internal/zzav;

    .line 193
    .line 194
    iget-object v4, v4, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 198
    move-result-object v4

    .line 199
    .line 200
    .line 201
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 202
    move-result-object v4

    .line 203
    .line 204
    const-string v5, "Data loss. Error querying raw events batch. appId"

    .line 205
    .line 206
    iget-object v6, v1, Lcom/google/android/gms/measurement/internal/zzat;->zzb:Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/zzgt;->zzl(Ljava/lang/String;)Ljava/lang/Object;

    .line 210
    move-result-object v6

    .line 211
    .line 212
    .line 213
    invoke-virtual {v4, v5, v6, v0}, Lcom/google/android/gms/measurement/internal/zzgr;->zzc(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 214
    .line 215
    :goto_3
    if-eqz v3, :cond_5

    .line 216
    .line 217
    .line 218
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 219
    :cond_5
    return-object v2

    .line 220
    .line 221
    :goto_4
    if-eqz v3, :cond_6

    .line 222
    .line 223
    .line 224
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 225
    :cond_6
    throw v0
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
