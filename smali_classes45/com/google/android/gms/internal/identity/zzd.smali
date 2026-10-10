.class public final Lcom/google/android/gms/internal/identity/zzd;
.super Lcom/google/android/gms/internal/identity/zzf;
.source "com.google.android.gms:play-services-identity@@17.0.1"


# instance fields
.field private final zza:I

.field private zzb:Landroid/app/Activity;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILandroid/app/Activity;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/identity/zzf;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Lcom/google/android/gms/internal/identity/zzd;->zza:I

    .line 6
    .line 7
    iput-object p2, p0, Lcom/google/android/gms/internal/identity/zzd;->zzb:Landroid/app/Activity;

    .line 8
    return-void
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

.method public static synthetic zzb(Lcom/google/android/gms/internal/identity/zzd;Landroid/app/Activity;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/google/android/gms/internal/identity/zzd;->zzb:Landroid/app/Activity;

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
.method public final zzc(ILandroid/os/Bundle;)V
    .locals 4

    .line 1
    .line 2
    const/high16 v0, 0x40000000    # 2.0f

    .line 3
    .line 4
    const-string v1, "AddressClientImpl"

    .line 5
    const/4 v2, 0x1

    .line 6
    .line 7
    if-ne p1, v2, :cond_2

    .line 8
    .line 9
    new-instance p1, Landroid/content/Intent;

    .line 10
    .line 11
    .line 12
    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 16
    .line 17
    iget-object p2, p0, Lcom/google/android/gms/internal/identity/zzd;->zzb:Landroid/app/Activity;

    .line 18
    .line 19
    if-nez p2, :cond_0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    iget v3, p0, Lcom/google/android/gms/internal/identity/zzd;->zza:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2, v3, p1, v0}, Landroid/app/Activity;->createPendingResult(ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    goto :goto_1

    .line 30
    .line 31
    .line 32
    :cond_1
    :try_start_0
    invoke-virtual {p1, v2}, Landroid/app/PendingIntent;->send(I)V
    :try_end_0
    .catch Landroid/app/PendingIntent$CanceledException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    return-void

    .line 34
    :catch_0
    move-exception p1

    .line 35
    .line 36
    const-string p2, "Exception settng pending result"

    .line 37
    .line 38
    .line 39
    invoke-static {v1, p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 40
    return-void

    .line 41
    .line 42
    :cond_2
    if-eqz p2, :cond_3

    .line 43
    .line 44
    const-string v3, "com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT"

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 48
    move-result-object p2

    .line 49
    .line 50
    check-cast p2, Landroid/app/PendingIntent;

    .line 51
    goto :goto_0

    .line 52
    :cond_3
    const/4 p2, 0x0

    .line 53
    .line 54
    :goto_0
    new-instance v3, Lcom/google/android/gms/common/ConnectionResult;

    .line 55
    .line 56
    .line 57
    invoke-direct {v3, p1, p2}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, Lcom/google/android/gms/common/ConnectionResult;->hasResolution()Z

    .line 61
    move-result p1

    .line 62
    .line 63
    if-eqz p1, :cond_4

    .line 64
    .line 65
    :try_start_1
    iget-object p1, p0, Lcom/google/android/gms/internal/identity/zzd;->zzb:Landroid/app/Activity;

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    check-cast p1, Landroid/app/Activity;

    .line 72
    .line 73
    iget p2, p0, Lcom/google/android/gms/internal/identity/zzd;->zza:I

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3, p1, p2}, Lcom/google/android/gms/common/ConnectionResult;->startResolutionForResult(Landroid/app/Activity;I)V
    :try_end_1
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 77
    return-void

    .line 78
    :catch_1
    move-exception p1

    .line 79
    .line 80
    const-string p2, "Exception starting pending intent"

    .line 81
    .line 82
    .line 83
    invoke-static {v1, p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 84
    return-void

    .line 85
    .line 86
    :cond_4
    :try_start_2
    iget-object p1, p0, Lcom/google/android/gms/internal/identity/zzd;->zzb:Landroid/app/Activity;

    .line 87
    .line 88
    .line 89
    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    move-result-object p1

    .line 91
    .line 92
    check-cast p1, Landroid/app/Activity;

    .line 93
    .line 94
    iget p2, p0, Lcom/google/android/gms/internal/identity/zzd;->zza:I

    .line 95
    .line 96
    new-instance v3, Landroid/content/Intent;

    .line 97
    .line 98
    .line 99
    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, p2, v3, v0}, Landroid/app/Activity;->createPendingResult(ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 103
    move-result-object p1

    .line 104
    .line 105
    if-eqz p1, :cond_5

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v2}, Landroid/app/PendingIntent;->send(I)V
    :try_end_2
    .catch Landroid/app/PendingIntent$CanceledException; {:try_start_2 .. :try_end_2} :catch_2

    .line 109
    return-void

    .line 110
    :catch_2
    move-exception p1

    .line 111
    goto :goto_2

    .line 112
    :cond_5
    :goto_1
    return-void

    .line 113
    .line 114
    :goto_2
    const-string p2, "Exception setting pending result"

    .line 115
    .line 116
    .line 117
    invoke-static {v1, p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 118
    return-void
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
.end method
