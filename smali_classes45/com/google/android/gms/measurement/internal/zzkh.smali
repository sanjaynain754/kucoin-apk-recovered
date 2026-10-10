.class final Lcom/google/android/gms/measurement/internal/zzkh;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-measurement-impl@@22.5.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zza:Landroid/os/Bundle;

.field final synthetic zzb:Lcom/google/android/gms/measurement/internal/zzli;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzli;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzkh;->zza:Landroid/os/Bundle;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzkh;->zzb:Lcom/google/android/gms/measurement/internal/zzli;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final run()V
    .locals 24

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    const-string v1, "app_id"

    .line 5
    .line 6
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzkh;->zzb:Lcom/google/android/gms/measurement/internal/zzli;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzjd;->zzg()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzg;->zzb()V

    .line 13
    .line 14
    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzkh;->zza:Landroid/os/Bundle;

    .line 15
    .line 16
    .line 17
    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    const-string v4, "name"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    move-result-object v6

    .line 24
    .line 25
    const-string v4, "origin"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    move-result-object v11

    .line 30
    .line 31
    .line 32
    invoke-static {v6}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    invoke-static {v11}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    const-string/jumbo v4, "value"

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    move-result-object v5

    .line 43
    .line 44
    .line 45
    invoke-static {v5}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    iget-object v5, v2, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/zzib;->zzB()Z

    .line 51
    move-result v5

    .line 52
    .line 53
    if-nez v5, :cond_0

    .line 54
    .line 55
    iget-object v1, v2, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 59
    move-result-object v1

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzgt;->zzk()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    const-string v2, "Conditional property not set since app measurement is disabled"

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 69
    return-void

    .line 70
    .line 71
    :cond_0
    new-instance v5, Lcom/google/android/gms/measurement/internal/zzpk;

    .line 72
    .line 73
    .line 74
    const-string/jumbo v7, "triggered_timestamp"

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, v7}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 78
    move-result-wide v7

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 82
    move-result-object v9

    .line 83
    move-object v10, v11

    .line 84
    .line 85
    .line 86
    invoke-direct/range {v5 .. v10}, Lcom/google/android/gms/measurement/internal/zzpk;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    :try_start_0
    iget-object v4, v2, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzib;->zzk()Lcom/google/android/gms/measurement/internal/zzpo;

    .line 92
    move-result-object v7

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    move-result-object v8

    .line 97
    .line 98
    .line 99
    const-string/jumbo v6, "triggered_event_name"

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    move-result-object v9

    .line 104
    .line 105
    .line 106
    const-string/jumbo v6, "triggered_event_params"

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3, v6}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 110
    move-result-object v10

    .line 111
    const/4 v14, 0x1

    .line 112
    const/4 v15, 0x1

    .line 113
    .line 114
    const-wide/16 v12, 0x0

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v7 .. v15}, Lcom/google/android/gms/measurement/internal/zzpo;->zzac(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZZ)Lcom/google/android/gms/measurement/internal/zzbg;

    .line 118
    move-result-object v18

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzib;->zzk()Lcom/google/android/gms/measurement/internal/zzpo;

    .line 122
    move-result-object v7

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    move-result-object v8

    .line 127
    .line 128
    .line 129
    const-string/jumbo v6, "timed_out_event_name"

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    move-result-object v9

    .line 134
    .line 135
    .line 136
    const-string/jumbo v6, "timed_out_event_params"

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3, v6}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 140
    move-result-object v10

    .line 141
    const/4 v14, 0x1

    .line 142
    const/4 v15, 0x1

    .line 143
    .line 144
    const-wide/16 v12, 0x0

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v7 .. v15}, Lcom/google/android/gms/measurement/internal/zzpo;->zzac(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZZ)Lcom/google/android/gms/measurement/internal/zzbg;

    .line 148
    move-result-object v6

    .line 149
    .line 150
    .line 151
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzib;->zzk()Lcom/google/android/gms/measurement/internal/zzpo;

    .line 152
    move-result-object v7

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    move-result-object v8

    .line 157
    .line 158
    const-string v4, "expired_event_name"

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 162
    move-result-object v9

    .line 163
    .line 164
    const-string v4, "expired_event_params"

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 168
    move-result-object v10

    .line 169
    const/4 v14, 0x1

    .line 170
    const/4 v15, 0x1

    .line 171
    .line 172
    const-wide/16 v12, 0x0

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v7 .. v15}, Lcom/google/android/gms/measurement/internal/zzpo;->zzac(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZZ)Lcom/google/android/gms/measurement/internal/zzbg;

    .line 176
    move-result-object v21
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    .line 178
    new-instance v7, Lcom/google/android/gms/measurement/internal/zzah;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    move-result-object v8

    .line 183
    .line 184
    const-string v1, "creation_timestamp"

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 188
    move-result-wide v9

    .line 189
    .line 190
    .line 191
    const-string/jumbo v1, "trigger_event_name"

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 195
    move-result-object v14

    .line 196
    .line 197
    .line 198
    const-string/jumbo v1, "trigger_timeout"

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 202
    move-result-wide v16

    .line 203
    .line 204
    .line 205
    const-string/jumbo v1, "time_to_live"

    .line 206
    .line 207
    .line 208
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 209
    move-result-wide v19

    .line 210
    const/4 v13, 0x0

    .line 211
    .line 212
    move-wide/from16 v22, v9

    .line 213
    move-object v9, v11

    .line 214
    .line 215
    move-wide/from16 v11, v22

    .line 216
    move-object v10, v5

    .line 217
    move-object v15, v6

    .line 218
    .line 219
    .line 220
    invoke-direct/range {v7 .. v21}, Lcom/google/android/gms/measurement/internal/zzah;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzpk;JZLjava/lang/String;Lcom/google/android/gms/measurement/internal/zzbg;JLcom/google/android/gms/measurement/internal/zzbg;JLcom/google/android/gms/measurement/internal/zzbg;)V

    .line 221
    .line 222
    iget-object v1, v2, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzib;->zzt()Lcom/google/android/gms/measurement/internal/zznk;

    .line 226
    move-result-object v1

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1, v7}, Lcom/google/android/gms/measurement/internal/zznk;->zzp(Lcom/google/android/gms/measurement/internal/zzah;)V

    .line 230
    :catch_0
    return-void
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
.end method
