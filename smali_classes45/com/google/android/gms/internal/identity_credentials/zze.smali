.class public final Lcom/google/android/gms/internal/identity_credentials/zze;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08"


# static fields
.field public static final zza:Lcom/google/android/gms/common/Feature;

.field public static final zzb:Lcom/google/android/gms/common/Feature;

.field public static final zzc:Lcom/google/android/gms/common/Feature;

.field public static final zzd:Lcom/google/android/gms/common/Feature;

.field public static final zze:Lcom/google/android/gms/common/Feature;

.field public static final zzf:Lcom/google/android/gms/common/Feature;

.field public static final zzg:Lcom/google/android/gms/common/Feature;

.field public static final zzh:Lcom/google/android/gms/common/Feature;

.field public static final zzi:Lcom/google/android/gms/common/Feature;

.field public static final zzj:Lcom/google/android/gms/common/Feature;

.field public static final zzk:Lcom/google/android/gms/common/Feature;

.field public static final zzl:Lcom/google/android/gms/common/Feature;

.field public static final zzm:Lcom/google/android/gms/common/Feature;

.field public static final zzn:Lcom/google/android/gms/common/Feature;

.field public static final zzo:[Lcom/google/android/gms/common/Feature;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/gms/common/Feature;

    .line 3
    .line 4
    const-string v1, "GET_CREDENTIAL"

    .line 5
    .line 6
    const-wide/16 v2, 0x1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 10
    .line 11
    sput-object v0, Lcom/google/android/gms/internal/identity_credentials/zze;->zza:Lcom/google/android/gms/common/Feature;

    .line 12
    .line 13
    new-instance v1, Lcom/google/android/gms/common/Feature;

    .line 14
    .line 15
    const-string v4, "CREDENTIAL_REGISTRY"

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v4, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 19
    .line 20
    sput-object v1, Lcom/google/android/gms/internal/identity_credentials/zze;->zzb:Lcom/google/android/gms/common/Feature;

    .line 21
    .line 22
    new-instance v4, Lcom/google/android/gms/common/Feature;

    .line 23
    .line 24
    const-string v5, "CLEAR_REGISTRY"

    .line 25
    .line 26
    const-wide/16 v6, 0x2

    .line 27
    .line 28
    .line 29
    invoke-direct {v4, v5, v6, v7}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 30
    .line 31
    sput-object v4, Lcom/google/android/gms/internal/identity_credentials/zze;->zzc:Lcom/google/android/gms/common/Feature;

    .line 32
    .line 33
    new-instance v5, Lcom/google/android/gms/common/Feature;

    .line 34
    .line 35
    const-string v6, "CLEAR_CREATION_OPTIONS"

    .line 36
    .line 37
    .line 38
    invoke-direct {v5, v6, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 39
    .line 40
    sput-object v5, Lcom/google/android/gms/internal/identity_credentials/zze;->zzd:Lcom/google/android/gms/common/Feature;

    .line 41
    move-object v6, v4

    .line 42
    .line 43
    new-instance v4, Lcom/google/android/gms/common/Feature;

    .line 44
    .line 45
    const-string v7, "CLEAR_CREDENTIAL_STATE"

    .line 46
    .line 47
    .line 48
    invoke-direct {v4, v7, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 49
    .line 50
    sput-object v4, Lcom/google/android/gms/internal/identity_credentials/zze;->zze:Lcom/google/android/gms/common/Feature;

    .line 51
    move-object v7, v5

    .line 52
    .line 53
    new-instance v5, Lcom/google/android/gms/common/Feature;

    .line 54
    .line 55
    const-string v8, "CREATE_CREDENTIAL"

    .line 56
    .line 57
    const-wide/16 v9, 0x3

    .line 58
    .line 59
    .line 60
    invoke-direct {v5, v8, v9, v10}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 61
    .line 62
    sput-object v5, Lcom/google/android/gms/internal/identity_credentials/zze;->zzf:Lcom/google/android/gms/common/Feature;

    .line 63
    move-object v8, v6

    .line 64
    .line 65
    new-instance v6, Lcom/google/android/gms/common/Feature;

    .line 66
    .line 67
    const-string v11, "REGISTER_CREATION_OPTIONS"

    .line 68
    .line 69
    .line 70
    invoke-direct {v6, v11, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 71
    .line 72
    sput-object v6, Lcom/google/android/gms/internal/identity_credentials/zze;->zzg:Lcom/google/android/gms/common/Feature;

    .line 73
    move-object v11, v7

    .line 74
    .line 75
    new-instance v7, Lcom/google/android/gms/common/Feature;

    .line 76
    .line 77
    const-string v12, "REGISTER_EXPORT"

    .line 78
    .line 79
    .line 80
    invoke-direct {v7, v12, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 81
    .line 82
    sput-object v7, Lcom/google/android/gms/internal/identity_credentials/zze;->zzh:Lcom/google/android/gms/common/Feature;

    .line 83
    move-object v12, v8

    .line 84
    .line 85
    new-instance v8, Lcom/google/android/gms/common/Feature;

    .line 86
    .line 87
    const-string v13, "IMPORT_CREDENTIALS"

    .line 88
    .line 89
    .line 90
    invoke-direct {v8, v13, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 91
    .line 92
    sput-object v8, Lcom/google/android/gms/internal/identity_credentials/zze;->zzi:Lcom/google/android/gms/common/Feature;

    .line 93
    .line 94
    new-instance v13, Lcom/google/android/gms/common/Feature;

    .line 95
    .line 96
    const-string v14, "SIGNAL_CREDENTIAL_STATE"

    .line 97
    .line 98
    .line 99
    invoke-direct {v13, v14, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 100
    .line 101
    sput-object v13, Lcom/google/android/gms/internal/identity_credentials/zze;->zzj:Lcom/google/android/gms/common/Feature;

    .line 102
    .line 103
    new-instance v14, Lcom/google/android/gms/common/Feature;

    .line 104
    .line 105
    const-string v15, "CLEAR_EXPORT"

    .line 106
    .line 107
    .line 108
    invoke-direct {v14, v15, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 109
    .line 110
    sput-object v14, Lcom/google/android/gms/internal/identity_credentials/zze;->zzk:Lcom/google/android/gms/common/Feature;

    .line 111
    move-object v3, v11

    .line 112
    .line 113
    new-instance v11, Lcom/google/android/gms/common/Feature;

    .line 114
    .line 115
    const-string v2, "IMPORT_CREDENTIALS_FOR_DEVICE_SETUP"

    .line 116
    .line 117
    .line 118
    invoke-direct {v11, v2, v9, v10}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 119
    .line 120
    sput-object v11, Lcom/google/android/gms/internal/identity_credentials/zze;->zzl:Lcom/google/android/gms/common/Feature;

    .line 121
    move-object v2, v12

    .line 122
    .line 123
    new-instance v12, Lcom/google/android/gms/common/Feature;

    .line 124
    .line 125
    const-string v15, "EXPORT_CREDENTIALS_TO_DEVICE_SETUP"

    .line 126
    .line 127
    .line 128
    invoke-direct {v12, v15, v9, v10}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 129
    .line 130
    sput-object v12, Lcom/google/android/gms/internal/identity_credentials/zze;->zzm:Lcom/google/android/gms/common/Feature;

    .line 131
    move-object v15, v13

    .line 132
    .line 133
    new-instance v13, Lcom/google/android/gms/common/Feature;

    .line 134
    .line 135
    move-object/from16 v16, v0

    .line 136
    .line 137
    const-string v0, "GET_CREDENTIAL_TRANSFER_CAPABILITIES"

    .line 138
    .line 139
    .line 140
    invoke-direct {v13, v0, v9, v10}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 141
    .line 142
    sput-object v13, Lcom/google/android/gms/internal/identity_credentials/zze;->zzn:Lcom/google/android/gms/common/Feature;

    .line 143
    move-object v10, v14

    .line 144
    move-object v9, v15

    .line 145
    .line 146
    move-object/from16 v0, v16

    .line 147
    .line 148
    .line 149
    filled-new-array/range {v0 .. v13}, [Lcom/google/android/gms/common/Feature;

    .line 150
    move-result-object v0

    .line 151
    .line 152
    sput-object v0, Lcom/google/android/gms/internal/identity_credentials/zze;->zzo:[Lcom/google/android/gms/common/Feature;

    .line 153
    return-void
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
