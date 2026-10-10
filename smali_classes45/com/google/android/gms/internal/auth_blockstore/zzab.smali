.class public final Lcom/google/android/gms/internal/auth_blockstore/zzab;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-auth-blockstore@@16.4.0"


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

.field public static final zzl:[Lcom/google/android/gms/common/Feature;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/gms/common/Feature;

    .line 3
    .line 4
    const-string v1, "auth_blockstore"

    .line 5
    .line 6
    const-wide/16 v2, 0x3

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 10
    .line 11
    sput-object v0, Lcom/google/android/gms/internal/auth_blockstore/zzab;->zza:Lcom/google/android/gms/common/Feature;

    .line 12
    .line 13
    new-instance v1, Lcom/google/android/gms/common/Feature;

    .line 14
    .line 15
    const-string v4, "blockstore_data_transfer"

    .line 16
    .line 17
    const-wide/16 v5, 0x1

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v4, v5, v6}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 21
    .line 22
    sput-object v1, Lcom/google/android/gms/internal/auth_blockstore/zzab;->zzb:Lcom/google/android/gms/common/Feature;

    .line 23
    move-wide v3, v2

    .line 24
    .line 25
    new-instance v2, Lcom/google/android/gms/common/Feature;

    .line 26
    .line 27
    const-string v7, "blockstore_notify_app_restore"

    .line 28
    .line 29
    .line 30
    invoke-direct {v2, v7, v5, v6}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 31
    .line 32
    sput-object v2, Lcom/google/android/gms/internal/auth_blockstore/zzab;->zzc:Lcom/google/android/gms/common/Feature;

    .line 33
    move-wide v7, v3

    .line 34
    .line 35
    new-instance v3, Lcom/google/android/gms/common/Feature;

    .line 36
    .line 37
    const-string v4, "blockstore_store_bytes_with_options"

    .line 38
    .line 39
    const-wide/16 v9, 0x2

    .line 40
    .line 41
    .line 42
    invoke-direct {v3, v4, v9, v10}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 43
    .line 44
    sput-object v3, Lcom/google/android/gms/internal/auth_blockstore/zzab;->zzd:Lcom/google/android/gms/common/Feature;

    .line 45
    .line 46
    new-instance v4, Lcom/google/android/gms/common/Feature;

    .line 47
    .line 48
    const-string v11, "blockstore_is_end_to_end_encryption_available"

    .line 49
    .line 50
    .line 51
    invoke-direct {v4, v11, v5, v6}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 52
    .line 53
    sput-object v4, Lcom/google/android/gms/internal/auth_blockstore/zzab;->zze:Lcom/google/android/gms/common/Feature;

    .line 54
    move-wide v11, v5

    .line 55
    .line 56
    new-instance v5, Lcom/google/android/gms/common/Feature;

    .line 57
    .line 58
    const-string v6, "blockstore_enable_cloud_backup"

    .line 59
    .line 60
    .line 61
    invoke-direct {v5, v6, v11, v12}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 62
    .line 63
    sput-object v5, Lcom/google/android/gms/internal/auth_blockstore/zzab;->zzf:Lcom/google/android/gms/common/Feature;

    .line 64
    .line 65
    new-instance v6, Lcom/google/android/gms/common/Feature;

    .line 66
    .line 67
    const-string v13, "blockstore_delete_bytes"

    .line 68
    .line 69
    .line 70
    invoke-direct {v6, v13, v9, v10}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 71
    .line 72
    sput-object v6, Lcom/google/android/gms/internal/auth_blockstore/zzab;->zzg:Lcom/google/android/gms/common/Feature;

    .line 73
    move-wide v8, v7

    .line 74
    .line 75
    new-instance v7, Lcom/google/android/gms/common/Feature;

    .line 76
    .line 77
    const-string v10, "blockstore_retrieve_bytes_with_options"

    .line 78
    .line 79
    .line 80
    invoke-direct {v7, v10, v8, v9}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 81
    .line 82
    sput-object v7, Lcom/google/android/gms/internal/auth_blockstore/zzab;->zzh:Lcom/google/android/gms/common/Feature;

    .line 83
    .line 84
    new-instance v8, Lcom/google/android/gms/common/Feature;

    .line 85
    .line 86
    const-string v9, "auth_clear_restore_credential"

    .line 87
    .line 88
    .line 89
    invoke-direct {v8, v9, v11, v12}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 90
    .line 91
    sput-object v8, Lcom/google/android/gms/internal/auth_blockstore/zzab;->zzi:Lcom/google/android/gms/common/Feature;

    .line 92
    .line 93
    new-instance v9, Lcom/google/android/gms/common/Feature;

    .line 94
    .line 95
    const-string v10, "auth_create_restore_credential"

    .line 96
    .line 97
    .line 98
    invoke-direct {v9, v10, v11, v12}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 99
    .line 100
    sput-object v9, Lcom/google/android/gms/internal/auth_blockstore/zzab;->zzj:Lcom/google/android/gms/common/Feature;

    .line 101
    .line 102
    new-instance v10, Lcom/google/android/gms/common/Feature;

    .line 103
    .line 104
    const-string v13, "auth_get_restore_credential"

    .line 105
    .line 106
    .line 107
    invoke-direct {v10, v13, v11, v12}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 108
    .line 109
    sput-object v10, Lcom/google/android/gms/internal/auth_blockstore/zzab;->zzk:Lcom/google/android/gms/common/Feature;

    .line 110
    .line 111
    .line 112
    filled-new-array/range {v0 .. v10}, [Lcom/google/android/gms/common/Feature;

    .line 113
    move-result-object v0

    .line 114
    .line 115
    sput-object v0, Lcom/google/android/gms/internal/auth_blockstore/zzab;->zzl:[Lcom/google/android/gms/common/Feature;

    .line 116
    return-void
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
