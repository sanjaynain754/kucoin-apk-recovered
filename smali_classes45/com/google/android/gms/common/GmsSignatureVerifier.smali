.class public Lcom/google/android/gms/common/GmsSignatureVerifier;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-basement@@18.5.0"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation build Lcom/google/android/gms/common/internal/ShowFirstParty;
.end annotation


# static fields
.field private static final zza:Lcom/google/android/gms/common/zzaa;

.field private static final zzb:Lcom/google/android/gms/common/zzaa;

.field private static final zzc:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/gms/common/zzy;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/gms/common/zzy;-><init>()V

    .line 6
    .line 7
    const-string v1, "com.google.android.gms"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/zzy;->zzd(Ljava/lang/String;)Lcom/google/android/gms/common/zzy;

    .line 11
    .line 12
    .line 13
    const-wide/32 v1, 0xc2bd840

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/zzy;->zza(J)Lcom/google/android/gms/common/zzy;

    .line 17
    .line 18
    sget-object v1, Lcom/google/android/gms/common/zzn;->zzd:Lcom/google/android/gms/common/zzl;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/google/android/gms/common/zzl;->zzf()[B

    .line 22
    move-result-object v2

    .line 23
    .line 24
    sget-object v3, Lcom/google/android/gms/common/zzn;->zzb:Lcom/google/android/gms/common/zzl;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, Lcom/google/android/gms/common/zzl;->zzf()[B

    .line 28
    move-result-object v3

    .line 29
    .line 30
    .line 31
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/common/zzak;->zzn(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/common/zzak;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v2}, Lcom/google/android/gms/common/zzy;->zzc(Ljava/util/List;)Lcom/google/android/gms/common/zzy;

    .line 36
    .line 37
    sget-object v2, Lcom/google/android/gms/common/zzn;->zzc:Lcom/google/android/gms/common/zzl;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Lcom/google/android/gms/common/zzl;->zzf()[B

    .line 41
    move-result-object v3

    .line 42
    .line 43
    sget-object v4, Lcom/google/android/gms/common/zzn;->zza:Lcom/google/android/gms/common/zzl;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4}, Lcom/google/android/gms/common/zzl;->zzf()[B

    .line 47
    move-result-object v4

    .line 48
    .line 49
    .line 50
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/common/zzak;->zzn(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/common/zzak;

    .line 51
    move-result-object v3

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v3}, Lcom/google/android/gms/common/zzy;->zzb(Ljava/util/List;)Lcom/google/android/gms/common/zzy;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/google/android/gms/common/zzy;->zze()Lcom/google/android/gms/common/zzaa;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    sput-object v0, Lcom/google/android/gms/common/GmsSignatureVerifier;->zza:Lcom/google/android/gms/common/zzaa;

    .line 61
    .line 62
    new-instance v0, Lcom/google/android/gms/common/zzy;

    .line 63
    .line 64
    .line 65
    invoke-direct {v0}, Lcom/google/android/gms/common/zzy;-><init>()V

    .line 66
    .line 67
    const-string v3, "com.android.vending"

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v3}, Lcom/google/android/gms/common/zzy;->zzd(Ljava/lang/String;)Lcom/google/android/gms/common/zzy;

    .line 71
    .line 72
    .line 73
    const-wide/32 v3, 0x4e6e200

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/common/zzy;->zza(J)Lcom/google/android/gms/common/zzy;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Lcom/google/android/gms/common/zzl;->zzf()[B

    .line 80
    move-result-object v1

    .line 81
    .line 82
    .line 83
    invoke-static {v1}, Lcom/google/android/gms/internal/common/zzak;->zzm(Ljava/lang/Object;)Lcom/google/android/gms/internal/common/zzak;

    .line 84
    move-result-object v1

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/zzy;->zzc(Ljava/util/List;)Lcom/google/android/gms/common/zzy;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Lcom/google/android/gms/common/zzl;->zzf()[B

    .line 91
    move-result-object v1

    .line 92
    .line 93
    .line 94
    invoke-static {v1}, Lcom/google/android/gms/internal/common/zzak;->zzm(Ljava/lang/Object;)Lcom/google/android/gms/internal/common/zzak;

    .line 95
    move-result-object v1

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/zzy;->zzb(Ljava/util/List;)Lcom/google/android/gms/common/zzy;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Lcom/google/android/gms/common/zzy;->zze()Lcom/google/android/gms/common/zzaa;

    .line 102
    move-result-object v0

    .line 103
    .line 104
    sput-object v0, Lcom/google/android/gms/common/GmsSignatureVerifier;->zzb:Lcom/google/android/gms/common/zzaa;

    .line 105
    .line 106
    new-instance v0, Ljava/util/HashMap;

    .line 107
    .line 108
    .line 109
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 110
    .line 111
    sput-object v0, Lcom/google/android/gms/common/GmsSignatureVerifier;->zzc:Ljava/util/HashMap;

    .line 112
    return-void
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
