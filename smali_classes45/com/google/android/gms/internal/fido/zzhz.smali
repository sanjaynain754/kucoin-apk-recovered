.class public final Lcom/google/android/gms/internal/fido/zzhz;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-fido@@21.0.0"

# interfaces
.implements Lcom/google/android/gms/internal/fido/zzhy;


# static fields
.field public static final zza:Lcom/google/android/gms/internal/fido/zzaq;

.field public static final zzb:Lcom/google/android/gms/internal/fido/zzaq;

.field public static final zzc:Lcom/google/android/gms/internal/fido/zzaq;

.field public static final zzd:Lcom/google/android/gms/internal/fido/zzaq;

.field public static final zze:Lcom/google/android/gms/internal/fido/zzaq;

.field public static final zzf:Lcom/google/android/gms/internal/fido/zzaq;

.field public static final zzg:Lcom/google/android/gms/internal/fido/zzaq;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/gms/internal/fido/zzay;

    .line 3
    .line 4
    const-string v1, "com.google.android.gms.fido"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/fido/zzay;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    const-string v1, "FIDO"

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, Lcom/google/android/gms/internal/fido/zzcf;->zzl(Ljava/lang/Object;)Lcom/google/android/gms/internal/fido/zzcf;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/fido/zzay;->zze(Ljava/util/Set;)Lcom/google/android/gms/internal/fido/zzay;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/google/android/gms/internal/fido/zzay;->zzd()Lcom/google/android/gms/internal/fido/zzay;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    const-string v1, "Hybrid__client_enabled"

    .line 24
    const/4 v2, 0x0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/fido/zzay;->zzc(Ljava/lang/String;Z)Lcom/google/android/gms/internal/fido/zzaq;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    sput-object v1, Lcom/google/android/gms/internal/fido/zzhz;->zza:Lcom/google/android/gms/internal/fido/zzaq;

    .line 31
    .line 32
    const-string v1, "Hybrid__disavow_location_permissions"

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/fido/zzay;->zzc(Ljava/lang/String;Z)Lcom/google/android/gms/internal/fido/zzaq;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    sput-object v1, Lcom/google/android/gms/internal/fido/zzhz;->zzb:Lcom/google/android/gms/internal/fido/zzaq;

    .line 40
    .line 41
    const-string v1, "Hybrid__number_of_seconds_to_wait_for_bt_scanning_radio_to_be_ready"

    .line 42
    .line 43
    const-wide/16 v4, 0x3

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1, v4, v5}, Lcom/google/android/gms/internal/fido/zzay;->zza(Ljava/lang/String;J)Lcom/google/android/gms/internal/fido/zzaq;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    sput-object v1, Lcom/google/android/gms/internal/fido/zzhz;->zzc:Lcom/google/android/gms/internal/fido/zzaq;

    .line 50
    .line 51
    const-string v1, "Hybrid__number_of_seconds_to_wait_for_bt_scanning_turning_on"

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1, v4, v5}, Lcom/google/android/gms/internal/fido/zzay;->zza(Ljava/lang/String;J)Lcom/google/android/gms/internal/fido/zzaq;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    sput-object v1, Lcom/google/android/gms/internal/fido/zzhz;->zzd:Lcom/google/android/gms/internal/fido/zzaq;

    .line 58
    .line 59
    const-string v1, "Hybrid__prf_eval_during_create"

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/fido/zzay;->zzc(Ljava/lang/String;Z)Lcom/google/android/gms/internal/fido/zzaq;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    sput-object v1, Lcom/google/android/gms/internal/fido/zzhz;->zze:Lcom/google/android/gms/internal/fido/zzaq;

    .line 66
    .line 67
    const-string v1, "Hybrid__use_hybrid_for_server_link"

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/fido/zzay;->zzc(Ljava/lang/String;Z)Lcom/google/android/gms/internal/fido/zzaq;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    sput-object v1, Lcom/google/android/gms/internal/fido/zzhz;->zzf:Lcom/google/android/gms/internal/fido/zzaq;

    .line 74
    .line 75
    const-string v1, "Hybrid__websocket_close_socket"

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/fido/zzay;->zzc(Ljava/lang/String;Z)Lcom/google/android/gms/internal/fido/zzaq;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    sput-object v0, Lcom/google/android/gms/internal/fido/zzhz;->zzg:Lcom/google/android/gms/internal/fido/zzaq;

    .line 82
    return-void
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

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method


# virtual methods
.method public final zza()Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/google/android/gms/internal/fido/zzhz;->zza:Lcom/google/android/gms/internal/fido/zzaq;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/fido/zzaq;->zza()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    move-result v0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method
