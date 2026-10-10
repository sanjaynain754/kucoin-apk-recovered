.class final Lcom/google/android/gms/measurement/internal/zzpb;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-measurement@@22.5.0"


# instance fields
.field zza:Lcom/google/android/gms/internal/measurement/zzid;

.field zzb:Ljava/util/List;

.field zzc:Ljava/util/List;

.field zzd:J

.field final synthetic zze:Lcom/google/android/gms/measurement/internal/zzpf;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/zzpf;[B)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzpb;->zze:Lcom/google/android/gms/measurement/internal/zzpf;

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    return-void
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

.method private static final zzb(Lcom/google/android/gms/internal/measurement/zzhs;)J
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhs;->zzf()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    const-wide/16 v2, 0x3e8

    .line 7
    div-long/2addr v0, v2

    .line 8
    .line 9
    const-wide/16 v2, 0x3c

    .line 10
    div-long/2addr v0, v2

    .line 11
    div-long/2addr v0, v2

    .line 12
    return-wide v0
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
.end method


# virtual methods
.method public final zza(JLcom/google/android/gms/internal/measurement/zzhs;)Z
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-static {p3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzpb;->zzc:Ljava/util/List;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzpb;->zzc:Ljava/util/List;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzpb;->zzb:Ljava/util/List;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzpb;->zzb:Ljava/util/List;

    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzpb;->zzc:Ljava/util/List;

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x0

    .line 33
    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzpb;->zzc:Ljava/util/List;

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzpb;->zzb(Lcom/google/android/gms/internal/measurement/zzhs;)J

    .line 46
    move-result-wide v2

    .line 47
    .line 48
    .line 49
    invoke-static {p3}, Lcom/google/android/gms/measurement/internal/zzpb;->zzb(Lcom/google/android/gms/internal/measurement/zzhs;)J

    .line 50
    move-result-wide v4

    .line 51
    .line 52
    cmp-long v0, v2, v4

    .line 53
    .line 54
    if-nez v0, :cond_2

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    return v1

    .line 57
    .line 58
    :cond_3
    :goto_0
    iget-wide v2, p0, Lcom/google/android/gms/measurement/internal/zzpb;->zzd:J

    .line 59
    .line 60
    .line 61
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzme;->zzcn()I

    .line 62
    move-result v0

    .line 63
    int-to-long v4, v0

    .line 64
    add-long/2addr v2, v4

    .line 65
    .line 66
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzpb;->zze:Lcom/google/android/gms/measurement/internal/zzpf;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzpf;->zzd()Lcom/google/android/gms/measurement/internal/zzal;

    .line 70
    move-result-object v4

    .line 71
    .line 72
    sget-object v5, Lcom/google/android/gms/measurement/internal/zzfx;->zzbe:Lcom/google/android/gms/measurement/internal/zzfw;

    .line 73
    const/4 v6, 0x0

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v6, v5}, Lcom/google/android/gms/measurement/internal/zzal;->zzp(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzfw;)Z

    .line 77
    move-result v4

    .line 78
    .line 79
    if-eqz v4, :cond_5

    .line 80
    .line 81
    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzpb;->zzc:Ljava/util/List;

    .line 82
    .line 83
    .line 84
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 85
    move-result v4

    .line 86
    .line 87
    if-nez v4, :cond_6

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzpf;->zzd()Lcom/google/android/gms/measurement/internal/zzal;

    .line 91
    .line 92
    .line 93
    invoke-static {}, Lcom/google/android/gms/measurement/internal/zzal;->zzG()I

    .line 94
    move-result v4

    .line 95
    int-to-long v4, v4

    .line 96
    .line 97
    cmp-long v4, v2, v4

    .line 98
    .line 99
    if-gez v4, :cond_4

    .line 100
    goto :goto_1

    .line 101
    :cond_4
    return v1

    .line 102
    .line 103
    .line 104
    :cond_5
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzpf;->zzd()Lcom/google/android/gms/measurement/internal/zzal;

    .line 105
    .line 106
    .line 107
    invoke-static {}, Lcom/google/android/gms/measurement/internal/zzal;->zzG()I

    .line 108
    move-result v4

    .line 109
    int-to-long v4, v4

    .line 110
    .line 111
    cmp-long v4, v2, v4

    .line 112
    .line 113
    if-ltz v4, :cond_6

    .line 114
    return v1

    .line 115
    .line 116
    :cond_6
    :goto_1
    iput-wide v2, p0, Lcom/google/android/gms/measurement/internal/zzpb;->zzd:J

    .line 117
    .line 118
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzpb;->zzc:Ljava/util/List;

    .line 119
    .line 120
    .line 121
    invoke-interface {v2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/zzpb;->zzb:Ljava/util/List;

    .line 124
    .line 125
    .line 126
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 127
    move-result-object p1

    .line 128
    .line 129
    .line 130
    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/zzpb;->zzc:Ljava/util/List;

    .line 133
    .line 134
    .line 135
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 136
    move-result p1

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzpf;->zzd()Lcom/google/android/gms/measurement/internal/zzal;

    .line 140
    .line 141
    sget-object p2, Lcom/google/android/gms/measurement/internal/zzfx;->zzj:Lcom/google/android/gms/measurement/internal/zzfw;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p2, v6}, Lcom/google/android/gms/measurement/internal/zzfw;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    move-result-object p2

    .line 146
    .line 147
    check-cast p2, Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 151
    move-result p2

    .line 152
    const/4 p3, 0x1

    .line 153
    .line 154
    .line 155
    invoke-static {p3, p2}, Ljava/lang/Math;->max(II)I

    .line 156
    move-result p2

    .line 157
    .line 158
    if-lt p1, p2, :cond_7

    .line 159
    return v1

    .line 160
    :cond_7
    return p3
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
.end method
