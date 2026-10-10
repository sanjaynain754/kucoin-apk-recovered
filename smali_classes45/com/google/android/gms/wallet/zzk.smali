.class public final Lcom/google/android/gms/wallet/zzk;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-wallet@@19.3.0"


# static fields
.field public static final zza:Lcom/google/android/gms/common/Feature;

.field public static final zzb:Lcom/google/android/gms/common/Feature;

.field public static final zzc:Lcom/google/android/gms/common/Feature;

.field public static final zzd:Lcom/google/android/gms/common/Feature;

.field public static final zze:Lcom/google/android/gms/common/Feature;

.field public static final zzf:Lcom/google/android/gms/common/Feature;

.field public static final zzg:Lcom/google/android/gms/common/Feature;

.field public static final zzh:Lcom/google/android/gms/common/Feature;

.field public static final zzi:[Lcom/google/android/gms/common/Feature;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/gms/common/Feature;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "wallet"

    .line 6
    .line 7
    const-wide/16 v2, 0x1

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 11
    .line 12
    sput-object v0, Lcom/google/android/gms/wallet/zzk;->zza:Lcom/google/android/gms/common/Feature;

    .line 13
    .line 14
    new-instance v1, Lcom/google/android/gms/common/Feature;

    .line 15
    .line 16
    .line 17
    const-string/jumbo v4, "wallet_biometric_auth_keys"

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 21
    .line 22
    sput-object v1, Lcom/google/android/gms/wallet/zzk;->zzb:Lcom/google/android/gms/common/Feature;

    .line 23
    move-wide v3, v2

    .line 24
    .line 25
    new-instance v2, Lcom/google/android/gms/common/Feature;

    .line 26
    .line 27
    .line 28
    const-string/jumbo v5, "wallet_payment_dynamic_update"

    .line 29
    .line 30
    const-wide/16 v6, 0x2

    .line 31
    .line 32
    .line 33
    invoke-direct {v2, v5, v6, v7}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 34
    .line 35
    sput-object v2, Lcom/google/android/gms/wallet/zzk;->zzc:Lcom/google/android/gms/common/Feature;

    .line 36
    move-wide v4, v3

    .line 37
    .line 38
    new-instance v3, Lcom/google/android/gms/common/Feature;

    .line 39
    .line 40
    .line 41
    const-string/jumbo v6, "wallet_1p_initialize_buyflow"

    .line 42
    .line 43
    .line 44
    invoke-direct {v3, v6, v4, v5}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 45
    .line 46
    sput-object v3, Lcom/google/android/gms/wallet/zzk;->zzd:Lcom/google/android/gms/common/Feature;

    .line 47
    move-wide v5, v4

    .line 48
    .line 49
    new-instance v4, Lcom/google/android/gms/common/Feature;

    .line 50
    .line 51
    .line 52
    const-string/jumbo v7, "wallet_warm_up_ui_process"

    .line 53
    .line 54
    .line 55
    invoke-direct {v4, v7, v5, v6}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 56
    .line 57
    sput-object v4, Lcom/google/android/gms/wallet/zzk;->zze:Lcom/google/android/gms/common/Feature;

    .line 58
    move-wide v6, v5

    .line 59
    .line 60
    new-instance v5, Lcom/google/android/gms/common/Feature;

    .line 61
    .line 62
    .line 63
    const-string/jumbo v8, "wallet_get_setup_wizard_intent"

    .line 64
    .line 65
    const-wide/16 v9, 0x4

    .line 66
    .line 67
    .line 68
    invoke-direct {v5, v8, v9, v10}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 69
    .line 70
    sput-object v5, Lcom/google/android/gms/wallet/zzk;->zzf:Lcom/google/android/gms/common/Feature;

    .line 71
    move-wide v7, v6

    .line 72
    .line 73
    new-instance v6, Lcom/google/android/gms/common/Feature;

    .line 74
    .line 75
    .line 76
    const-string/jumbo v9, "wallet_get_payment_card_recognition_intent"

    .line 77
    .line 78
    .line 79
    invoke-direct {v6, v9, v7, v8}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 80
    .line 81
    sput-object v6, Lcom/google/android/gms/wallet/zzk;->zzg:Lcom/google/android/gms/common/Feature;

    .line 82
    move-wide v8, v7

    .line 83
    .line 84
    new-instance v7, Lcom/google/android/gms/common/Feature;

    .line 85
    .line 86
    .line 87
    const-string/jumbo v10, "wallet_save_instrument"

    .line 88
    .line 89
    .line 90
    invoke-direct {v7, v10, v8, v9}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    .line 91
    .line 92
    sput-object v7, Lcom/google/android/gms/wallet/zzk;->zzh:Lcom/google/android/gms/common/Feature;

    .line 93
    .line 94
    .line 95
    filled-new-array/range {v0 .. v7}, [Lcom/google/android/gms/common/Feature;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    sput-object v0, Lcom/google/android/gms/wallet/zzk;->zzi:[Lcom/google/android/gms/common/Feature;

    .line 99
    return-void
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
