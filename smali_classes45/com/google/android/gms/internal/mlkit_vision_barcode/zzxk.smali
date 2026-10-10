.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1"


# static fields
.field private static final zzf:Lcom/google/android/gms/common/internal/GmsLogger;


# instance fields
.field final zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field final zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbw;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field zzc:Ljava/util/concurrent/ScheduledFuture;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field zzd:Ljava/lang/String;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field zze:I
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field private final zzg:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final zzh:Ljava/lang/Object;

.field private final zzi:Ljava/util/concurrent/ScheduledExecutorService;

.field private final zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;

.field private final zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;

.field private final zzl:Ljava/lang/String;

.field private zzm:Ljava/util/concurrent/Executor;

.field private zzn:F

.field private zzo:F

.field private zzp:J

.field private zzq:J

.field private zzr:Z

.field private zzs:Lcom/google/mlkit/vision/barcode/internal/zze;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/gms/common/internal/GmsLogger;

    .line 3
    .line 4
    const-string v1, "AutoZoom"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/google/android/gms/common/internal/GmsLogger;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzf:Lcom/google/android/gms/common/internal/GmsLogger;

    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;Ljava/lang/String;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzg;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzd;

    .line 4
    const/4 v0, 0x2

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/concurrent/Executors;->unconfigurableScheduledExecutorService(Ljava/util/concurrent/ScheduledExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzar;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;

    .line 19
    .line 20
    new-instance v3, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

    .line 21
    .line 22
    .line 23
    invoke-direct {v3, p1}, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;-><init>(Landroid/content/Context;)V

    .line 24
    .line 25
    new-instance v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwi;

    .line 26
    .line 27
    .line 28
    const-string/jumbo v5, "scanner-auto-zoom"

    .line 29
    .line 30
    .line 31
    invoke-static {v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwh;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwg;

    .line 32
    move-result-object v6

    .line 33
    .line 34
    .line 35
    invoke-virtual {v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwg;->zzd()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwh;

    .line 36
    move-result-object v6

    .line 37
    .line 38
    .line 39
    invoke-direct {v4, p1, v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwi;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwh;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v2, p1, v3, v4, v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;-><init>(Landroid/content/Context;Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwf;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    new-instance p1, Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    .line 53
    .line 54
    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    .line 55
    .line 56
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 57
    const/4 p2, 0x0

    .line 58
    .line 59
    .line 60
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 61
    .line 62
    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzg:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbw;->zzz()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbw;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbw;

    .line 69
    .line 70
    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzi:Ljava/util/concurrent/ScheduledExecutorService;

    .line 71
    .line 72
    iput-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;

    .line 73
    .line 74
    iput-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;

    .line 75
    .line 76
    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzl:Ljava/lang/String;

    .line 77
    const/4 p1, 0x1

    .line 78
    .line 79
    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zze:I

    .line 80
    .line 81
    const/high16 p1, 0x3f800000    # 1.0f

    .line 82
    .line 83
    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn:F

    .line 84
    .line 85
    const/high16 p1, -0x40800000    # -1.0f

    .line 86
    .line 87
    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzo:F

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;->zza()J

    .line 91
    move-result-wide p1

    .line 92
    .line 93
    iput-wide p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzp:J

    .line 94
    return-void
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
.end method

.method public static bridge synthetic zzb()Lcom/google/android/gms/common/internal/GmsLogger;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzf:Lcom/google/android/gms/common/internal/GmsLogger;

    .line 3
    return-object v0
    .line 4
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

.method public static zzd(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;

    .line 3
    .line 4
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, p0, v1, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;Ljava/lang/String;)V

    .line 8
    return-object v0
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

.method public static bridge synthetic zze(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzg:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    return-object p0
    .line 4
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
.end method

.method public static synthetic zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;)V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zze:I

    .line 6
    const/4 v2, 0x2

    .line 7
    .line 8
    if-ne v1, v2, :cond_2

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzg:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-nez v1, :cond_2

    .line 17
    .line 18
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzc:Ljava/util/concurrent/ScheduledFuture;

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 24
    move-result v1

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    goto :goto_1

    .line 28
    .line 29
    :cond_0
    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn:F

    .line 30
    .line 31
    const/high16 v2, 0x3f800000    # 1.0f

    .line 32
    .line 33
    cmpl-float v1, v1, v2

    .line 34
    .line 35
    if-lez v1, :cond_1

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza()J

    .line 39
    move-result-wide v3

    .line 40
    .line 41
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zzi()J

    .line 45
    move-result-wide v5

    .line 46
    .line 47
    cmp-long v1, v3, v5

    .line 48
    .line 49
    if-ltz v1, :cond_1

    .line 50
    .line 51
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzf:Lcom/google/android/gms/common/internal/GmsLogger;

    .line 52
    .line 53
    const-string v3, "AutoZoom"

    .line 54
    .line 55
    const-string v4, "Reset zoom = 1"

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v3, v4}, Lcom/google/android/gms/common/internal/GmsLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;->zzdM:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

    .line 61
    const/4 v3, 0x0

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v2, v1, v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzl(FLcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V

    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    goto :goto_2

    .line 68
    :cond_1
    :goto_0
    monitor-exit v0

    .line 69
    return-void

    .line 70
    :cond_2
    :goto_1
    monitor-exit v0

    .line 71
    return-void

    .line 72
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    throw p0
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static bridge synthetic zzg(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;F)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn:F

    .line 6
    const/4 p1, 0x0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzr(Z)V

    .line 10
    monitor-exit v0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw p0
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

.method public static bridge synthetic zzh(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V

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
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
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
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
.end method

.method private final zzp(F)F
    .locals 3

    .line 1
    .line 2
    const/high16 v0, 0x3f800000    # 1.0f

    .line 3
    .line 4
    cmpg-float v1, p1, v0

    .line 5
    .line 6
    iget v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzo:F

    .line 7
    .line 8
    if-gez v1, :cond_0

    .line 9
    move p1, v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    .line 12
    cmpl-float v0, v2, v0

    .line 13
    .line 14
    if-lez v0, :cond_1

    .line 15
    .line 16
    cmpl-float v0, p1, v2

    .line 17
    .line 18
    if-lez v0, :cond_1

    .line 19
    return v2

    .line 20
    :cond_1
    return p1
    .line 21
    .line 22
    .line 23
.end method

.method private final zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzd:Ljava/lang/String;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;-><init>()V

    .line 10
    .line 11
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzl:Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzd:Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;->zze(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;

    .line 23
    .line 24
    .line 25
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 26
    move-result-object p2

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;->zzf(Ljava/lang/Float;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;

    .line 30
    .line 31
    .line 32
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 33
    move-result-object p2

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;->zzc(Ljava/lang/Float;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;

    .line 37
    .line 38
    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    .line 39
    monitor-enter p2

    .line 40
    .line 41
    :try_start_0
    sget-object p3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 42
    .line 43
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;->zza()J

    .line 47
    move-result-wide v1

    .line 48
    .line 49
    iget-wide v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzq:J

    .line 50
    sub-long/2addr v1, v3

    .line 51
    .line 52
    sget-object v3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p3, v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 56
    move-result-wide v1

    .line 57
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 61
    move-result-object p2

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;->zzb(Ljava/lang/Long;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;

    .line 65
    .line 66
    if-eqz p4, :cond_0

    .line 67
    .line 68
    new-instance p2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;

    .line 69
    .line 70
    .line 71
    invoke-direct {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzc()F

    .line 75
    move-result p3

    .line 76
    .line 77
    .line 78
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 79
    move-result-object p3

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;->zzc(Ljava/lang/Float;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zze()F

    .line 86
    move-result p3

    .line 87
    .line 88
    .line 89
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 90
    move-result-object p3

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;->zze(Ljava/lang/Float;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzb()F

    .line 97
    move-result p3

    .line 98
    .line 99
    .line 100
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 101
    move-result-object p3

    .line 102
    .line 103
    .line 104
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;->zzb(Ljava/lang/Float;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzd()F

    .line 108
    move-result p3

    .line 109
    .line 110
    .line 111
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 112
    move-result-object p3

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;->zzd(Ljava/lang/Float;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;

    .line 116
    const/4 p3, 0x0

    .line 117
    .line 118
    .line 119
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 120
    move-result-object p3

    .line 121
    .line 122
    .line 123
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;->zza(Ljava/lang/Float;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;->zzf()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzur;

    .line 127
    move-result-object p2

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;->zzd(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzur;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;

    .line 131
    .line 132
    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;

    .line 133
    .line 134
    new-instance p3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;

    .line 135
    .line 136
    .line 137
    invoke-direct {p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;->zzh()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzut;

    .line 141
    move-result-object p4

    .line 142
    .line 143
    .line 144
    invoke-virtual {p3, p4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;->zzi(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzut;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;

    .line 145
    .line 146
    .line 147
    invoke-static {p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzws;->zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwe;

    .line 148
    move-result-object p3

    .line 149
    .line 150
    .line 151
    invoke-virtual {p2, p3, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;->zzd(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwe;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;)V

    .line 152
    return-void

    .line 153
    :catchall_0
    move-exception p1

    .line 154
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 155
    throw p1

    .line 156
    :cond_1
    return-void
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
.end method

.method private final zzr(Z)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbw;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbr;->zzs()V

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;->zza()J

    .line 14
    move-result-wide v1

    .line 15
    .line 16
    iput-wide v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzp:J

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzc:Ljava/util/concurrent/ScheduledFuture;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    const/4 v1, 0x0

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 27
    const/4 p1, 0x0

    .line 28
    .line 29
    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzc:Ljava/util/concurrent/ScheduledFuture;

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    :goto_0
    monitor-exit v0

    .line 34
    return-void

    .line 35
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    throw p1
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method


# virtual methods
.method public final zza()J
    .locals 6
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;->zza()J

    .line 11
    move-result-wide v2

    .line 12
    .line 13
    iget-wide v4, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzp:J

    .line 14
    sub-long/2addr v2, v4

    .line 15
    .line 16
    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 20
    move-result-wide v1

    .line 21
    monitor-exit v0

    .line 22
    return-wide v1

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1
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
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method public final synthetic zzc(F)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzs:Lcom/google/mlkit/vision/barcode/internal/zze;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzp(F)F

    .line 6
    move-result p1

    .line 7
    .line 8
    iget-object v0, v0, Lcom/google/mlkit/vision/barcode/internal/zze;->zza:Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;

    .line 9
    .line 10
    sget v1, Lcom/google/mlkit/vision/barcode/internal/zzh;->zzc:I

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;->zzb()Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions$ZoomCallback;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, p1}, Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions$ZoomCallback;->setZoom(F)Z

    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x1

    .line 20
    .line 21
    if-eq v1, v0, :cond_0

    .line 22
    const/4 p1, 0x0

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzej;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;

    .line 30
    move-result-object p1

    .line 31
    return-object p1
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
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public final zzi(ILcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V
    .locals 17

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v0, p2

    .line 5
    .line 6
    iget-object v2, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    .line 7
    monitor-enter v2

    .line 8
    .line 9
    :try_start_0
    iget v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zze:I

    .line 10
    const/4 v4, 0x2

    .line 11
    .line 12
    if-eq v3, v4, :cond_0

    .line 13
    monitor-exit v2

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    .line 17
    goto/16 :goto_7

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzh()Z

    .line 21
    move-result v3

    .line 22
    .line 23
    if-eqz v3, :cond_10

    .line 24
    .line 25
    iget-object v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zzl()Z

    .line 29
    move-result v3

    .line 30
    const/4 v4, 0x0

    .line 31
    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    iget-object v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zzb()F

    .line 38
    move-result v3

    .line 39
    .line 40
    cmpg-float v3, v3, v4

    .line 41
    .line 42
    if-lez v3, :cond_1

    .line 43
    .line 44
    goto/16 :goto_6

    .line 45
    .line 46
    :cond_1
    iget-boolean v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzr:Z

    .line 47
    .line 48
    if-nez v3, :cond_2

    .line 49
    .line 50
    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;->zzdK:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

    .line 51
    .line 52
    iget v5, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn:F

    .line 53
    .line 54
    .line 55
    invoke-direct {v1, v3, v5, v5, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V

    .line 56
    const/4 v3, 0x1

    .line 57
    .line 58
    iput-boolean v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzr:Z

    .line 59
    .line 60
    :cond_2
    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzf:Lcom/google/android/gms/common/internal/GmsLogger;

    .line 61
    .line 62
    const-string v5, "AutoZoom"

    .line 63
    .line 64
    .line 65
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 66
    move-result-object v6

    .line 67
    .line 68
    const-string v7, "Process PredictedArea: [%.2f, %.2f, %.2f, %.2f, %.2f], frameIndex = %d"

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzc()F

    .line 72
    move-result v8

    .line 73
    .line 74
    .line 75
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 76
    move-result-object v9

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zze()F

    .line 80
    move-result v8

    .line 81
    .line 82
    .line 83
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 84
    move-result-object v10

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzb()F

    .line 88
    move-result v8

    .line 89
    .line 90
    .line 91
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 92
    move-result-object v11

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzd()F

    .line 96
    move-result v8

    .line 97
    .line 98
    .line 99
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 100
    move-result-object v12

    .line 101
    .line 102
    .line 103
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 104
    move-result-object v13

    .line 105
    .line 106
    .line 107
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    move-result-object v14

    .line 109
    .line 110
    .line 111
    filled-new-array/range {v9 .. v14}, [Ljava/lang/Object;

    .line 112
    move-result-object v8

    .line 113
    .line 114
    .line 115
    invoke-static {v6, v7, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 116
    move-result-object v6

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3, v5, v6}, Lcom/google/android/gms/common/internal/GmsLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    iget-object v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbw;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3, v14, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbr;->zzt(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    iget-object v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbw;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbv;->zzw()Ljava/util/Set;

    .line 130
    move-result-object v3

    .line 131
    .line 132
    .line 133
    invoke-interface {v3}, Ljava/util/Set;->size()I

    .line 134
    move-result v5

    .line 135
    .line 136
    add-int/lit8 v5, v5, -0x1

    .line 137
    .line 138
    iget-object v6, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zzh()I

    .line 142
    move-result v6

    .line 143
    .line 144
    if-le v5, v6, :cond_5

    .line 145
    .line 146
    .line 147
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 148
    move-result-object v3

    .line 149
    .line 150
    move/from16 v5, p1

    .line 151
    .line 152
    .line 153
    :cond_3
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    move-result v6

    .line 155
    .line 156
    if-eqz v6, :cond_4

    .line 157
    .line 158
    .line 159
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    move-result-object v6

    .line 161
    .line 162
    check-cast v6, Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 166
    move-result v6

    .line 167
    .line 168
    if-le v5, v6, :cond_3

    .line 169
    move v5, v6

    .line 170
    goto :goto_0

    .line 171
    .line 172
    :cond_4
    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzf:Lcom/google/android/gms/common/internal/GmsLogger;

    .line 173
    .line 174
    const-string v6, "AutoZoom"

    .line 175
    .line 176
    new-instance v7, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 180
    .line 181
    const-string v8, "Removing recent frameIndex = "

    .line 182
    .line 183
    .line 184
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    move-result-object v7

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3, v6, v7}, Lcom/google/android/gms/common/internal/GmsLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    .line 196
    iget-object v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbw;

    .line 197
    .line 198
    .line 199
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 200
    move-result-object v5

    .line 201
    .line 202
    .line 203
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbe;->zzf(Ljava/lang/Object;)Ljava/util/List;

    .line 204
    .line 205
    :cond_5
    new-instance v3, Ljava/util/HashSet;

    .line 206
    .line 207
    .line 208
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 209
    .line 210
    iget-object v5, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbw;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbv;->zzu()Ljava/util/Collection;

    .line 214
    move-result-object v5

    .line 215
    .line 216
    .line 217
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 218
    move-result-object v5

    .line 219
    .line 220
    .line 221
    :cond_6
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    move-result v6

    .line 223
    .line 224
    if-eqz v6, :cond_9

    .line 225
    .line 226
    .line 227
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    move-result-object v6

    .line 229
    .line 230
    check-cast v6, Ljava/util/Map$Entry;

    .line 231
    .line 232
    .line 233
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 234
    move-result-object v7

    .line 235
    .line 236
    check-cast v7, Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 240
    move-result v7

    .line 241
    .line 242
    move/from16 v8, p1

    .line 243
    .line 244
    if-eq v7, v8, :cond_6

    .line 245
    .line 246
    .line 247
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 248
    move-result-object v7

    .line 249
    .line 250
    check-cast v7, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzh()Z

    .line 254
    move-result v9

    .line 255
    .line 256
    if-eqz v9, :cond_7

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzh()Z

    .line 260
    move-result v9

    .line 261
    .line 262
    if-nez v9, :cond_8

    .line 263
    :cond_7
    move v9, v4

    .line 264
    goto :goto_2

    .line 265
    .line 266
    .line 267
    :cond_8
    invoke-virtual {v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzc()F

    .line 268
    move-result v9

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzc()F

    .line 272
    move-result v10

    .line 273
    .line 274
    .line 275
    invoke-static {v9, v10}, Ljava/lang/Math;->max(FF)F

    .line 276
    move-result v12

    .line 277
    .line 278
    .line 279
    invoke-virtual {v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zze()F

    .line 280
    move-result v9

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zze()F

    .line 284
    move-result v10

    .line 285
    .line 286
    .line 287
    invoke-static {v9, v10}, Ljava/lang/Math;->max(FF)F

    .line 288
    move-result v13

    .line 289
    .line 290
    .line 291
    invoke-virtual {v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzb()F

    .line 292
    move-result v9

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzb()F

    .line 296
    move-result v10

    .line 297
    .line 298
    .line 299
    invoke-static {v9, v10}, Ljava/lang/Math;->min(FF)F

    .line 300
    move-result v14

    .line 301
    .line 302
    .line 303
    invoke-virtual {v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzd()F

    .line 304
    move-result v9

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzd()F

    .line 308
    move-result v10

    .line 309
    .line 310
    .line 311
    invoke-static {v9, v10}, Ljava/lang/Math;->min(FF)F

    .line 312
    move-result v15

    .line 313
    .line 314
    new-instance v11, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxg;

    .line 315
    .line 316
    const/16 v16, 0x0

    .line 317
    .line 318
    .line 319
    invoke-direct/range {v11 .. v16}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxg;-><init>(FFFFF)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v11}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzf()F

    .line 323
    move-result v9

    .line 324
    .line 325
    .line 326
    invoke-virtual {v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzf()F

    .line 327
    move-result v7

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzf()F

    .line 331
    move-result v10

    .line 332
    add-float/2addr v7, v10

    .line 333
    .line 334
    .line 335
    invoke-virtual {v11}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzf()F

    .line 336
    move-result v10

    .line 337
    sub-float/2addr v7, v10

    .line 338
    div-float/2addr v9, v7

    .line 339
    .line 340
    :goto_2
    iget-object v7, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zzd()F

    .line 344
    move-result v7

    .line 345
    .line 346
    cmpl-float v7, v9, v7

    .line 347
    .line 348
    if-ltz v7, :cond_6

    .line 349
    .line 350
    .line 351
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 352
    move-result-object v6

    .line 353
    .line 354
    check-cast v6, Ljava/lang/Integer;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 358
    .line 359
    goto/16 :goto_1

    .line 360
    .line 361
    .line 362
    :cond_9
    invoke-virtual {v3}, Ljava/util/HashSet;->size()I

    .line 363
    move-result v3

    .line 364
    .line 365
    iget-object v5, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zzg()I

    .line 369
    move-result v5

    .line 370
    .line 371
    if-ge v3, v5, :cond_a

    .line 372
    .line 373
    iget-object v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zzl()Z

    .line 377
    move-result v3

    .line 378
    .line 379
    if-eqz v3, :cond_f

    .line 380
    .line 381
    iget-object v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zza()F

    .line 385
    move-result v3

    .line 386
    .line 387
    cmpl-float v3, v3, v4

    .line 388
    .line 389
    if-gtz v3, :cond_f

    .line 390
    .line 391
    :cond_a
    iget-object v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    .line 392
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 393
    .line 394
    .line 395
    :try_start_1
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza()J

    .line 396
    move-result-wide v4

    .line 397
    .line 398
    iget-object v6, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zzj()J

    .line 402
    move-result-wide v6

    .line 403
    .line 404
    cmp-long v4, v4, v6

    .line 405
    .line 406
    if-gez v4, :cond_b

    .line 407
    monitor-exit v3

    .line 408
    .line 409
    goto/16 :goto_4

    .line 410
    :catchall_1
    move-exception v0

    .line 411
    .line 412
    goto/16 :goto_5

    .line 413
    .line 414
    .line 415
    :cond_b
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzc()F

    .line 416
    move-result v4

    .line 417
    .line 418
    .line 419
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 420
    move-result-object v4

    .line 421
    .line 422
    .line 423
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zze()F

    .line 424
    move-result v5

    .line 425
    .line 426
    .line 427
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 428
    move-result-object v5

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzb()F

    .line 432
    move-result v6

    .line 433
    .line 434
    .line 435
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 436
    move-result-object v6

    .line 437
    .line 438
    .line 439
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzd()F

    .line 440
    move-result v7

    .line 441
    .line 442
    .line 443
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 444
    move-result-object v7

    .line 445
    .line 446
    .line 447
    invoke-static {v4, v5, v6, v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;->zzi(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;

    .line 448
    move-result-object v4

    .line 449
    const/4 v5, 0x0

    .line 450
    .line 451
    .line 452
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;->zzj(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdv;

    .line 453
    move-result-object v4

    .line 454
    .line 455
    .line 456
    const v5, 0x4e6e6b28    # 1.0E9f

    .line 457
    .line 458
    .line 459
    :cond_c
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 460
    move-result v6

    .line 461
    .line 462
    if-eqz v6, :cond_d

    .line 463
    .line 464
    .line 465
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 466
    move-result-object v6

    .line 467
    .line 468
    check-cast v6, Ljava/lang/Float;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    .line 472
    move-result v6

    .line 473
    .line 474
    iget-object v7, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zzc()F

    .line 478
    move-result v7

    .line 479
    .line 480
    const/high16 v8, 0x40000000    # 2.0f

    .line 481
    div-float/2addr v7, v8

    .line 482
    .line 483
    const/high16 v8, -0x41000000    # -0.5f

    .line 484
    add-float/2addr v6, v8

    .line 485
    .line 486
    .line 487
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 488
    move-result v6

    .line 489
    .line 490
    .line 491
    const v8, 0x3a83126f    # 0.001f

    .line 492
    .line 493
    .line 494
    invoke-static {v6, v8}, Ljava/lang/Math;->max(FF)F

    .line 495
    move-result v6

    .line 496
    .line 497
    div-float v6, v7, v6

    .line 498
    .line 499
    cmpl-float v7, v5, v6

    .line 500
    .line 501
    if-lez v7, :cond_c

    .line 502
    move v5, v6

    .line 503
    goto :goto_3

    .line 504
    .line 505
    :cond_d
    iget v4, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn:F

    .line 506
    mul-float/2addr v4, v5

    .line 507
    .line 508
    .line 509
    invoke-direct {v1, v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzp(F)F

    .line 510
    move-result v4

    .line 511
    .line 512
    iget-object v5, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zzk()Z

    .line 516
    move-result v5

    .line 517
    .line 518
    if-eqz v5, :cond_e

    .line 519
    .line 520
    iget v5, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn:F

    .line 521
    .line 522
    sub-float v6, v4, v5

    .line 523
    div-float/2addr v6, v5

    .line 524
    .line 525
    iget-object v5, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zze()F

    .line 529
    move-result v5

    .line 530
    .line 531
    cmpg-float v5, v6, v5

    .line 532
    .line 533
    if-gtz v5, :cond_e

    .line 534
    .line 535
    iget-object v5, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    .line 536
    .line 537
    .line 538
    invoke-virtual {v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zzf()F

    .line 539
    move-result v5

    .line 540
    neg-float v5, v5

    .line 541
    .line 542
    cmpl-float v5, v6, v5

    .line 543
    .line 544
    if-ltz v5, :cond_e

    .line 545
    .line 546
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzf:Lcom/google/android/gms/common/internal/GmsLogger;

    .line 547
    .line 548
    const-string v5, "AutoZoom"

    .line 549
    .line 550
    new-instance v6, Ljava/lang/StringBuilder;

    .line 551
    .line 552
    .line 553
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 554
    .line 555
    const-string v7, "Auto zoom to "

    .line 556
    .line 557
    .line 558
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 562
    .line 563
    const-string v4, " is filtered by threshold"

    .line 564
    .line 565
    .line 566
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 570
    move-result-object v4

    .line 571
    .line 572
    .line 573
    invoke-virtual {v0, v5, v4}, Lcom/google/android/gms/common/internal/GmsLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 574
    .line 575
    iget-object v0, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;->zza()J

    .line 579
    move-result-wide v4

    .line 580
    .line 581
    iput-wide v4, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzp:J

    .line 582
    monitor-exit v3

    .line 583
    goto :goto_4

    .line 584
    .line 585
    :cond_e
    sget-object v5, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzf:Lcom/google/android/gms/common/internal/GmsLogger;

    .line 586
    .line 587
    const-string v6, "AutoZoom"

    .line 588
    .line 589
    new-instance v7, Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 593
    .line 594
    const-string v8, "Going to set zoom = "

    .line 595
    .line 596
    .line 597
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 601
    .line 602
    .line 603
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 604
    move-result-object v7

    .line 605
    .line 606
    .line 607
    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/common/internal/GmsLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 608
    .line 609
    sget-object v5, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;->zzdL:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v1, v4, v5, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzl(FLcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V

    .line 613
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 614
    :cond_f
    :goto_4
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 615
    return-void

    .line 616
    :goto_5
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 617
    :try_start_4
    throw v0

    .line 618
    :cond_10
    :goto_6
    monitor-exit v2

    .line 619
    return-void

    .line 620
    :goto_7
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 621
    throw v0
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
.end method

.method public final zzj()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zze:I

    .line 6
    const/4 v2, 0x4

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn(Z)V

    .line 17
    .line 18
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzi:Ljava/util/concurrent/ScheduledExecutorService;

    .line 19
    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 22
    .line 23
    iput v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zze:I

    .line 24
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw v1
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
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method public final zzk(F)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    cmpl-float v1, p1, v1

    .line 8
    .line 9
    if-ltz v1, :cond_0

    .line 10
    const/4 v1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    .line 14
    .line 15
    :goto_0
    :try_start_0
    invoke-static {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzaz;->zzd(Z)V

    .line 16
    .line 17
    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzo:F

    .line 18
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw p1
    .line 23
.end method

.method public final zzl(FLcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V
    .locals 8
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    .line 2
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    .line 3
    monitor-enter v1

    .line 4
    .line 5
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzm:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzs:Lcom/google/mlkit/vision/barcode/internal/zze;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zze:I

    .line 14
    const/4 v2, 0x2

    .line 15
    .line 16
    if-eq v0, v2, :cond_0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzg:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 25
    move-result v0

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    monitor-exit v1

    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    move-object p1, v0

    .line 32
    goto :goto_1

    .line 33
    .line 34
    :cond_1
    iget v5, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn:F

    .line 35
    .line 36
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxh;

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxh;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;F)V

    .line 40
    .line 41
    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzm:Ljava/util/concurrent/Executor;

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzej;->zzc(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxh;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxj;

    .line 48
    move-object v3, p0

    .line 49
    move v7, p1

    .line 50
    move-object v4, p2

    .line 51
    move-object v6, p3

    .line 52
    .line 53
    .line 54
    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxj;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;FLcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;F)V

    .line 55
    .line 56
    .line 57
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzeu;->zza()Ljava/util/concurrent/Executor;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v2, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzej;->zzb(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzeh;Ljava/util/concurrent/Executor;)V

    .line 62
    monitor-exit v1

    .line 63
    return-void

    .line 64
    :cond_2
    :goto_0
    monitor-exit v1

    .line 65
    return-void

    .line 66
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    throw p1
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
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
.end method

.method public final zzm()V
    .locals 10

    .line 1
    .line 2
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    .line 3
    monitor-enter v1

    .line 4
    .line 5
    :try_start_0
    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zze:I

    .line 6
    const/4 v2, 0x2

    .line 7
    .line 8
    if-eq v0, v2, :cond_2

    .line 9
    const/4 v3, 0x4

    .line 10
    .line 11
    if-ne v0, v3, :cond_0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    const/4 v0, 0x1

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzr(Z)V

    .line 17
    .line 18
    iget-object v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzi:Ljava/util/concurrent/ScheduledExecutorService;

    .line 19
    .line 20
    new-instance v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxi;

    .line 21
    .line 22
    .line 23
    invoke-direct {v4, p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxi;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;)V

    .line 24
    .line 25
    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 26
    .line 27
    const-wide/16 v5, 0x1f4

    .line 28
    move-wide v7, v5

    .line 29
    .line 30
    .line 31
    invoke-interface/range {v3 .. v9}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    iput-object v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzc:Ljava/util/concurrent/ScheduledFuture;

    .line 35
    .line 36
    iget v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zze:I

    .line 37
    const/4 v4, 0x0

    .line 38
    .line 39
    if-ne v3, v0, :cond_1

    .line 40
    .line 41
    .line 42
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzd:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;->zza()J

    .line 55
    move-result-wide v5

    .line 56
    .line 57
    iput-wide v5, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzq:J

    .line 58
    const/4 v0, 0x0

    .line 59
    .line 60
    iput-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzr:Z

    .line 61
    .line 62
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;->zzdF:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

    .line 63
    .line 64
    iget v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn:F

    .line 65
    .line 66
    .line 67
    invoke-direct {p0, v0, v3, v3, v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V

    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception v0

    .line 70
    goto :goto_2

    .line 71
    .line 72
    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;->zzdH:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

    .line 73
    .line 74
    iget v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn:F

    .line 75
    .line 76
    .line 77
    invoke-direct {p0, v0, v3, v3, v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V

    .line 78
    .line 79
    :goto_0
    iput v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zze:I

    .line 80
    monitor-exit v1

    .line 81
    return-void

    .line 82
    :cond_2
    :goto_1
    monitor-exit v1

    .line 83
    return-void

    .line 84
    :goto_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    throw v0
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

.method public final zzn(Z)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zze:I

    .line 6
    const/4 v2, 0x1

    .line 7
    .line 8
    if-eq v1, v2, :cond_3

    .line 9
    const/4 v3, 0x4

    .line 10
    .line 11
    if-ne v1, v3, :cond_0

    .line 12
    goto :goto_2

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzr(Z)V

    .line 16
    const/4 v1, 0x0

    .line 17
    .line 18
    if-eqz p1, :cond_2

    .line 19
    .line 20
    iget-boolean p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzr:Z

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;->zzdK:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

    .line 25
    .line 26
    iget v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn:F

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, p1, v3, v3, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_3

    .line 33
    .line 34
    :cond_1
    :goto_0
    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;->zzdI:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

    .line 35
    .line 36
    iget v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn:F

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, p1, v3, v3, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V

    .line 40
    goto :goto_1

    .line 41
    .line 42
    :cond_2
    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;->zzdJ:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

    .line 43
    .line 44
    iget v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn:F

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, p1, v3, v3, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V

    .line 48
    :goto_1
    const/4 p1, 0x0

    .line 49
    .line 50
    iput-boolean p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzr:Z

    .line 51
    .line 52
    iput v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zze:I

    .line 53
    .line 54
    iput-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzd:Ljava/lang/String;

    .line 55
    monitor-exit v0

    .line 56
    return-void

    .line 57
    :cond_3
    :goto_2
    monitor-exit v0

    .line 58
    return-void

    .line 59
    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    throw p1
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public final zzo(Lcom/google/mlkit/vision/barcode/internal/zze;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzs:Lcom/google/mlkit/vision/barcode/internal/zze;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzm:Ljava/util/concurrent/Executor;

    .line 5
    return-void
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
