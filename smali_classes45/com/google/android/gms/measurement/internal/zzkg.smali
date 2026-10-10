.class final Lcom/google/android/gms/measurement/internal/zzkg;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-measurement-impl@@22.5.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zza:J

.field final synthetic zzb:Lcom/google/android/gms/measurement/internal/zzli;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzli;J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p2, p0, Lcom/google/android/gms/measurement/internal/zzkg;->zza:J

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzkg;->zzb:Lcom/google/android/gms/measurement/internal/zzli;

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
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzkg;->zzb:Lcom/google/android/gms/measurement/internal/zzli;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzjd;->zzg()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzg;->zzb()V

    .line 9
    .line 10
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzgt;->zzj()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    const-string v3, "Resetting analytics data (FE)"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 24
    .line 25
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzib;->zzh()Lcom/google/android/gms/measurement/internal/zzob;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzjd;->zzg()V

    .line 33
    .line 34
    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzob;->zzb:Lcom/google/android/gms/measurement/internal/zznz;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zznz;->zzc()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzib;->zzv()Lcom/google/android/gms/measurement/internal/zzgh;

    .line 41
    move-result-object v3

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzgh;->zzi()V

    .line 45
    .line 46
    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzib;->zzB()Z

    .line 50
    move-result v3

    .line 51
    .line 52
    xor-int/lit8 v3, v3, 0x1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzib;->zzd()Lcom/google/android/gms/measurement/internal/zzhg;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzhg;->zzc:Lcom/google/android/gms/measurement/internal/zzhd;

    .line 59
    .line 60
    iget-wide v5, p0, Lcom/google/android/gms/measurement/internal/zzkg;->zza:J

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/measurement/internal/zzhd;->zzb(J)V

    .line 64
    .line 65
    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzib;->zzd()Lcom/google/android/gms/measurement/internal/zzhg;

    .line 69
    move-result-object v5

    .line 70
    .line 71
    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/zzhg;->zzq:Lcom/google/android/gms/measurement/internal/zzhf;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/zzhf;->zza()Ljava/lang/String;

    .line 75
    move-result-object v5

    .line 76
    .line 77
    .line 78
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 79
    move-result v5

    .line 80
    const/4 v6, 0x0

    .line 81
    .line 82
    if-nez v5, :cond_0

    .line 83
    .line 84
    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/zzhg;->zzq:Lcom/google/android/gms/measurement/internal/zzhf;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v5, v6}, Lcom/google/android/gms/measurement/internal/zzhf;->zzb(Ljava/lang/String;)V

    .line 88
    .line 89
    :cond_0
    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/zzhg;->zzk:Lcom/google/android/gms/measurement/internal/zzhd;

    .line 90
    .line 91
    const-wide/16 v7, 0x0

    .line 92
    .line 93
    .line 94
    invoke-virtual {v5, v7, v8}, Lcom/google/android/gms/measurement/internal/zzhd;->zzb(J)V

    .line 95
    .line 96
    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/zzhg;->zzl:Lcom/google/android/gms/measurement/internal/zzhd;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5, v7, v8}, Lcom/google/android/gms/measurement/internal/zzhd;->zzb(J)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzib;->zzc()Lcom/google/android/gms/measurement/internal/zzal;

    .line 103
    move-result-object v4

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzal;->zzt()Z

    .line 107
    move-result v4

    .line 108
    .line 109
    if-nez v4, :cond_1

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v3}, Lcom/google/android/gms/measurement/internal/zzhg;->zzn(Z)V

    .line 113
    .line 114
    :cond_1
    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzhg;->zzr:Lcom/google/android/gms/measurement/internal/zzhf;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v4, v6}, Lcom/google/android/gms/measurement/internal/zzhf;->zzb(Ljava/lang/String;)V

    .line 118
    .line 119
    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzhg;->zzs:Lcom/google/android/gms/measurement/internal/zzhd;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4, v7, v8}, Lcom/google/android/gms/measurement/internal/zzhd;->zzb(J)V

    .line 123
    .line 124
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzhg;->zzt:Lcom/google/android/gms/measurement/internal/zzhc;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, v6}, Lcom/google/android/gms/measurement/internal/zzhc;->zzb(Landroid/os/Bundle;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzib;->zzt()Lcom/google/android/gms/measurement/internal/zznk;

    .line 131
    move-result-object v1

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zznk;->zzB()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzib;->zzh()Lcom/google/android/gms/measurement/internal/zzob;

    .line 138
    move-result-object v1

    .line 139
    .line 140
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzob;->zza:Lcom/google/android/gms/measurement/internal/zzoa;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzoa;->zza()V

    .line 144
    .line 145
    iput-boolean v3, v0, Lcom/google/android/gms/measurement/internal/zzli;->zzc:Z

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzib;->zzt()Lcom/google/android/gms/measurement/internal/zznk;

    .line 149
    move-result-object v0

    .line 150
    .line 151
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 152
    .line 153
    .line 154
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zznk;->zzC(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 158
    return-void
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
