.class public final Lcom/google/android/gms/auth/zze;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-auth-base@@18.0.10"


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

.field public static final zzo:Lcom/google/android/gms/common/Feature;

.field public static final zzp:Lcom/google/android/gms/common/Feature;

.field public static final zzq:[Lcom/google/android/gms/common/Feature;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    .line 2
    new-instance v1, Lcom/google/android/gms/common/Feature;

    .line 3
    .line 4
    const-string v0, "account_capability_api"

    .line 5
    .line 6
    const-wide/16 v2, 0x1

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v0, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 10
    .line 11
    sput-object v1, Lcom/google/android/gms/auth/zze;->zza:Lcom/google/android/gms/common/Feature;

    .line 12
    .line 13
    new-instance v0, Lcom/google/android/gms/common/Feature;

    .line 14
    .line 15
    const-string v4, "account_data_service"

    .line 16
    .line 17
    const-wide/16 v5, 0x6

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v4, v5, v6}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 21
    .line 22
    sput-object v0, Lcom/google/android/gms/auth/zze;->zzb:Lcom/google/android/gms/common/Feature;

    .line 23
    .line 24
    new-instance v4, Lcom/google/android/gms/common/Feature;

    .line 25
    .line 26
    const-string v5, "account_data_service_legacy"

    .line 27
    .line 28
    .line 29
    invoke-direct {v4, v5, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 30
    .line 31
    sput-object v4, Lcom/google/android/gms/auth/zze;->zzc:Lcom/google/android/gms/common/Feature;

    .line 32
    move-object v5, v4

    .line 33
    .line 34
    new-instance v4, Lcom/google/android/gms/common/Feature;

    .line 35
    .line 36
    const-string v6, "account_data_service_token"

    .line 37
    .line 38
    const-wide/16 v7, 0x8

    .line 39
    .line 40
    .line 41
    invoke-direct {v4, v6, v7, v8}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 42
    .line 43
    sput-object v4, Lcom/google/android/gms/auth/zze;->zzd:Lcom/google/android/gms/common/Feature;

    .line 44
    move-object v6, v5

    .line 45
    .line 46
    new-instance v5, Lcom/google/android/gms/common/Feature;

    .line 47
    .line 48
    const-string v7, "account_data_service_visibility"

    .line 49
    .line 50
    .line 51
    invoke-direct {v5, v7, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 52
    .line 53
    sput-object v5, Lcom/google/android/gms/auth/zze;->zze:Lcom/google/android/gms/common/Feature;

    .line 54
    move-object v7, v6

    .line 55
    .line 56
    new-instance v6, Lcom/google/android/gms/common/Feature;

    .line 57
    .line 58
    const-string v8, "config_sync"

    .line 59
    .line 60
    .line 61
    invoke-direct {v6, v8, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 62
    .line 63
    sput-object v6, Lcom/google/android/gms/auth/zze;->zzf:Lcom/google/android/gms/common/Feature;

    .line 64
    move-object v8, v7

    .line 65
    .line 66
    new-instance v7, Lcom/google/android/gms/common/Feature;

    .line 67
    .line 68
    const-string v9, "device_account_api"

    .line 69
    .line 70
    .line 71
    invoke-direct {v7, v9, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 72
    .line 73
    sput-object v7, Lcom/google/android/gms/auth/zze;->zzg:Lcom/google/android/gms/common/Feature;

    .line 74
    move-object v9, v8

    .line 75
    .line 76
    new-instance v8, Lcom/google/android/gms/common/Feature;

    .line 77
    .line 78
    const-string v10, "device_account_jwt_creation"

    .line 79
    .line 80
    .line 81
    invoke-direct {v8, v10, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 82
    .line 83
    sput-object v8, Lcom/google/android/gms/auth/zze;->zzh:Lcom/google/android/gms/common/Feature;

    .line 84
    move-object v10, v9

    .line 85
    .line 86
    new-instance v9, Lcom/google/android/gms/common/Feature;

    .line 87
    .line 88
    const-string v11, "gaiaid_primary_email_api"

    .line 89
    .line 90
    .line 91
    invoke-direct {v9, v11, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 92
    .line 93
    sput-object v9, Lcom/google/android/gms/auth/zze;->zzi:Lcom/google/android/gms/common/Feature;

    .line 94
    move-object v11, v10

    .line 95
    .line 96
    new-instance v10, Lcom/google/android/gms/common/Feature;

    .line 97
    .line 98
    const-string v12, "get_restricted_accounts_api"

    .line 99
    .line 100
    .line 101
    invoke-direct {v10, v12, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 102
    .line 103
    sput-object v10, Lcom/google/android/gms/auth/zze;->zzj:Lcom/google/android/gms/common/Feature;

    .line 104
    move-object v12, v11

    .line 105
    .line 106
    new-instance v11, Lcom/google/android/gms/common/Feature;

    .line 107
    .line 108
    const-string v13, "google_auth_service_accounts"

    .line 109
    .line 110
    const-wide/16 v14, 0x2

    .line 111
    .line 112
    .line 113
    invoke-direct {v11, v13, v14, v15}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 114
    .line 115
    sput-object v11, Lcom/google/android/gms/auth/zze;->zzk:Lcom/google/android/gms/common/Feature;

    .line 116
    move-object v13, v12

    .line 117
    .line 118
    new-instance v12, Lcom/google/android/gms/common/Feature;

    .line 119
    .line 120
    const-string v14, "google_auth_service_token"

    .line 121
    .line 122
    const-wide/16 v2, 0x3

    .line 123
    .line 124
    .line 125
    invoke-direct {v12, v14, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 126
    .line 127
    sput-object v12, Lcom/google/android/gms/auth/zze;->zzl:Lcom/google/android/gms/common/Feature;

    .line 128
    move-object v3, v13

    .line 129
    .line 130
    new-instance v13, Lcom/google/android/gms/common/Feature;

    .line 131
    .line 132
    const-string v2, "hub_mode_api"

    .line 133
    .line 134
    const-wide/16 v14, 0x1

    .line 135
    .line 136
    .line 137
    invoke-direct {v13, v2, v14, v15}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 138
    .line 139
    sput-object v13, Lcom/google/android/gms/auth/zze;->zzm:Lcom/google/android/gms/common/Feature;

    .line 140
    .line 141
    new-instance v2, Lcom/google/android/gms/common/Feature;

    .line 142
    .line 143
    move-object/from16 v16, v0

    .line 144
    .line 145
    .line 146
    const-string/jumbo v0, "work_account_client_is_whitelisted"

    .line 147
    .line 148
    .line 149
    invoke-direct {v2, v0, v14, v15}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 150
    .line 151
    sput-object v2, Lcom/google/android/gms/auth/zze;->zzn:Lcom/google/android/gms/common/Feature;

    .line 152
    .line 153
    new-instance v0, Lcom/google/android/gms/common/Feature;

    .line 154
    .line 155
    move-object/from16 v17, v1

    .line 156
    .line 157
    const-string v1, "factory_reset_protection_api"

    .line 158
    .line 159
    .line 160
    invoke-direct {v0, v1, v14, v15}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 161
    .line 162
    sput-object v0, Lcom/google/android/gms/auth/zze;->zzo:Lcom/google/android/gms/common/Feature;

    .line 163
    .line 164
    new-instance v1, Lcom/google/android/gms/common/Feature;

    .line 165
    .line 166
    move-object/from16 v18, v0

    .line 167
    .line 168
    const-string v0, "google_auth_api"

    .line 169
    .line 170
    .line 171
    invoke-direct {v1, v0, v14, v15}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 172
    .line 173
    sput-object v1, Lcom/google/android/gms/auth/zze;->zzp:Lcom/google/android/gms/common/Feature;

    .line 174
    move-object v14, v2

    .line 175
    .line 176
    move-object/from16 v2, v16

    .line 177
    .line 178
    move-object/from16 v15, v18

    .line 179
    .line 180
    move-object/from16 v16, v1

    .line 181
    .line 182
    move-object/from16 v1, v17

    .line 183
    .line 184
    .line 185
    filled-new-array/range {v1 .. v16}, [Lcom/google/android/gms/common/Feature;

    .line 186
    move-result-object v0

    .line 187
    .line 188
    sput-object v0, Lcom/google/android/gms/auth/zze;->zzq:[Lcom/google/android/gms/common/Feature;

    .line 189
    return-void
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
