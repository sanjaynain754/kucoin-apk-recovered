.class public final Lcom/google/android/gms/internal/fido/zzic;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-fido@@21.0.0"

# interfaces
.implements Lcom/google/android/gms/internal/fido/zzib;


# static fields
.field public static final zza:Lcom/google/android/gms/internal/fido/zzaq;

.field public static final zzb:Lcom/google/android/gms/internal/fido/zzaq;

.field public static final zzc:Lcom/google/android/gms/internal/fido/zzaq;

.field public static final zzd:Lcom/google/android/gms/internal/fido/zzaq;

.field public static final zze:Lcom/google/android/gms/internal/fido/zzaq;

.field public static final zzf:Lcom/google/android/gms/internal/fido/zzaq;

.field public static final zzg:Lcom/google/android/gms/internal/fido/zzaq;

.field public static final zzh:Lcom/google/android/gms/internal/fido/zzaq;

.field public static final zzi:Lcom/google/android/gms/internal/fido/zzaq;

.field public static final zzj:Lcom/google/android/gms/internal/fido/zzaq;

.field public static final zzk:Lcom/google/android/gms/internal/fido/zzaq;

.field public static final zzl:Lcom/google/android/gms/internal/fido/zzaq;

.field public static final zzm:Lcom/google/android/gms/internal/fido/zzaq;

.field public static final zzn:Lcom/google/android/gms/internal/fido/zzaq;

.field public static final zzo:Lcom/google/android/gms/internal/fido/zzaq;

.field public static final zzp:Lcom/google/android/gms/internal/fido/zzaq;

.field public static final zzq:Lcom/google/android/gms/internal/fido/zzaq;

.field public static final zzr:Lcom/google/android/gms/internal/fido/zzaq;

.field public static final zzs:Lcom/google/android/gms/internal/fido/zzaq;


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
    const-string v1, "Passkeys__check_all_keys"

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
    sput-object v1, Lcom/google/android/gms/internal/fido/zzic;->zza:Lcom/google/android/gms/internal/fido/zzaq;

    .line 31
    .line 32
    const-string v1, "Passkeys__check_sync_status"

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
    sput-object v1, Lcom/google/android/gms/internal/fido/zzic;->zzb:Lcom/google/android/gms/internal/fido/zzaq;

    .line 40
    .line 41
    const-string v1, "Passkeys__client_data_hash_override_for_security_keys"

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/fido/zzay;->zzc(Ljava/lang/String;Z)Lcom/google/android/gms/internal/fido/zzaq;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    sput-object v1, Lcom/google/android/gms/internal/fido/zzic;->zzc:Lcom/google/android/gms/internal/fido/zzaq;

    .line 48
    .line 49
    const-string v1, "Passkeys__direct_assetlinks"

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/fido/zzay;->zzc(Ljava/lang/String;Z)Lcom/google/android/gms/internal/fido/zzaq;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    sput-object v1, Lcom/google/android/gms/internal/fido/zzic;->zzd:Lcom/google/android/gms/internal/fido/zzaq;

    .line 56
    .line 57
    const-string v1, "Passkeys__direct_assetlinks_cache_seconds"

    .line 58
    .line 59
    .line 60
    const-wide/32 v4, 0x93a80

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1, v4, v5}, Lcom/google/android/gms/internal/fido/zzay;->zza(Ljava/lang/String;J)Lcom/google/android/gms/internal/fido/zzaq;

    .line 64
    move-result-object v1

    .line 65
    .line 66
    sput-object v1, Lcom/google/android/gms/internal/fido/zzic;->zze:Lcom/google/android/gms/internal/fido/zzaq;

    .line 67
    .line 68
    const-string v1, "Passkeys__direct_assetlinks_rpids"

    .line 69
    .line 70
    const-string v4, "*"

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1, v4}, Lcom/google/android/gms/internal/fido/zzay;->zzb(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/fido/zzaq;

    .line 74
    move-result-object v1

    .line 75
    .line 76
    sput-object v1, Lcom/google/android/gms/internal/fido/zzic;->zzf:Lcom/google/android/gms/internal/fido/zzaq;

    .line 77
    .line 78
    const-string v1, "Passkeys__dispatch_prf_via_credman"

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/fido/zzay;->zzc(Ljava/lang/String;Z)Lcom/google/android/gms/internal/fido/zzaq;

    .line 82
    move-result-object v1

    .line 83
    .line 84
    sput-object v1, Lcom/google/android/gms/internal/fido/zzic;->zzg:Lcom/google/android/gms/internal/fido/zzaq;

    .line 85
    .line 86
    const-string v1, "Passkeys__help_center_url"

    .line 87
    .line 88
    const-string v4, "https://support.google.com/accounts/answer/6208650"

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1, v4}, Lcom/google/android/gms/internal/fido/zzay;->zzb(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/fido/zzaq;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    sput-object v1, Lcom/google/android/gms/internal/fido/zzic;->zzh:Lcom/google/android/gms/internal/fido/zzaq;

    .line 95
    .line 96
    const-string v1, "Passkeys__hide_consent_page_in_registration_enabled"

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/fido/zzay;->zzc(Ljava/lang/String;Z)Lcom/google/android/gms/internal/fido/zzaq;

    .line 100
    move-result-object v1

    .line 101
    .line 102
    sput-object v1, Lcom/google/android/gms/internal/fido/zzic;->zzi:Lcom/google/android/gms/internal/fido/zzaq;

    .line 103
    .line 104
    const-string v1, "Passkeys__ignore_stop_during_hybrid_request"

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/fido/zzay;->zzc(Ljava/lang/String;Z)Lcom/google/android/gms/internal/fido/zzaq;

    .line 108
    move-result-object v1

    .line 109
    .line 110
    sput-object v1, Lcom/google/android/gms/internal/fido/zzic;->zzj:Lcom/google/android/gms/internal/fido/zzaq;

    .line 111
    .line 112
    const-string v1, "Passkeys__json_for_parcelables"

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/fido/zzay;->zzc(Ljava/lang/String;Z)Lcom/google/android/gms/internal/fido/zzaq;

    .line 116
    move-result-object v1

    .line 117
    .line 118
    sput-object v1, Lcom/google/android/gms/internal/fido/zzic;->zzk:Lcom/google/android/gms/internal/fido/zzaq;

    .line 119
    .line 120
    const-string v1, "Passkeys__passkey_entries_use_gpm_icon"

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/fido/zzay;->zzc(Ljava/lang/String;Z)Lcom/google/android/gms/internal/fido/zzaq;

    .line 124
    move-result-object v1

    .line 125
    .line 126
    sput-object v1, Lcom/google/android/gms/internal/fido/zzic;->zzl:Lcom/google/android/gms/internal/fido/zzaq;

    .line 127
    .line 128
    const-string v1, "Passkeys__reencrypt_passkey"

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/fido/zzay;->zzc(Ljava/lang/String;Z)Lcom/google/android/gms/internal/fido/zzaq;

    .line 132
    move-result-object v1

    .line 133
    .line 134
    sput-object v1, Lcom/google/android/gms/internal/fido/zzic;->zzm:Lcom/google/android/gms/internal/fido/zzaq;

    .line 135
    .line 136
    const-string v1, "Passkeys__return_cryptauth_status"

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/fido/zzay;->zzc(Ljava/lang/String;Z)Lcom/google/android/gms/internal/fido/zzaq;

    .line 140
    move-result-object v1

    .line 141
    .line 142
    sput-object v1, Lcom/google/android/gms/internal/fido/zzic;->zzn:Lcom/google/android/gms/internal/fido/zzaq;

    .line 143
    .line 144
    const-string v1, "Passkeys__set_key_version"

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/fido/zzay;->zzc(Ljava/lang/String;Z)Lcom/google/android/gms/internal/fido/zzaq;

    .line 148
    move-result-object v1

    .line 149
    .line 150
    sput-object v1, Lcom/google/android/gms/internal/fido/zzic;->zzo:Lcom/google/android/gms/internal/fido/zzaq;

    .line 151
    .line 152
    const-string v1, "Passkeys__should_show_welcome_fragment"

    .line 153
    .line 154
    const-wide/16 v3, -0x1

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v1, v3, v4}, Lcom/google/android/gms/internal/fido/zzay;->zza(Ljava/lang/String;J)Lcom/google/android/gms/internal/fido/zzaq;

    .line 158
    move-result-object v1

    .line 159
    .line 160
    sput-object v1, Lcom/google/android/gms/internal/fido/zzic;->zzp:Lcom/google/android/gms/internal/fido/zzaq;

    .line 161
    .line 162
    const-string v1, "Passkeys__skip_consent_after_retrieval"

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/fido/zzay;->zzc(Ljava/lang/String;Z)Lcom/google/android/gms/internal/fido/zzaq;

    .line 166
    move-result-object v1

    .line 167
    .line 168
    sput-object v1, Lcom/google/android/gms/internal/fido/zzic;->zzq:Lcom/google/android/gms/internal/fido/zzaq;

    .line 169
    .line 170
    const-string v1, "Passkeys__skip_consent_screen"

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/fido/zzay;->zzc(Ljava/lang/String;Z)Lcom/google/android/gms/internal/fido/zzaq;

    .line 174
    move-result-object v1

    .line 175
    .line 176
    sput-object v1, Lcom/google/android/gms/internal/fido/zzic;->zzr:Lcom/google/android/gms/internal/fido/zzaq;

    .line 177
    .line 178
    const-string v1, "Passkeys__use_result_receiver"

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/fido/zzay;->zzc(Ljava/lang/String;Z)Lcom/google/android/gms/internal/fido/zzaq;

    .line 182
    move-result-object v0

    .line 183
    .line 184
    sput-object v0, Lcom/google/android/gms/internal/fido/zzic;->zzs:Lcom/google/android/gms/internal/fido/zzaq;

    .line 185
    return-void
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
    sget-object v0, Lcom/google/android/gms/internal/fido/zzic;->zzk:Lcom/google/android/gms/internal/fido/zzaq;

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

.method public final zzb()Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/google/android/gms/internal/fido/zzic;->zzs:Lcom/google/android/gms/internal/fido/zzaq;

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
