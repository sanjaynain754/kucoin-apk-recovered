.class public final Lcom/google/android/gms/internal/measurement/zzqk;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-measurement-impl@@22.5.0"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzqj;


# static fields
.field public static final zza:Lcom/google/android/gms/internal/measurement/zzkl;

.field public static final zzb:Lcom/google/android/gms/internal/measurement/zzkl;

.field public static final zzc:Lcom/google/android/gms/internal/measurement/zzkl;

.field public static final zzd:Lcom/google/android/gms/internal/measurement/zzkl;

.field public static final zze:Lcom/google/android/gms/internal/measurement/zzkl;

.field public static final zzf:Lcom/google/android/gms/internal/measurement/zzkl;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzkf;

    .line 3
    .line 4
    const-string v1, "com.google.android.gms.measurement"

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzka;->zza(Ljava/lang/String;)Landroid/net/Uri;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzkf;-><init>(Landroid/net/Uri;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzkf;->zza()Lcom/google/android/gms/internal/measurement/zzkf;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzkf;->zzb()Lcom/google/android/gms/internal/measurement/zzkf;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    const-string v1, "measurement.test.boolean_flag"

    .line 22
    const/4 v2, 0x0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzkf;->zzd(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/zzkl;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    sput-object v1, Lcom/google/android/gms/internal/measurement/zzqk;->zza:Lcom/google/android/gms/internal/measurement/zzkl;

    .line 29
    .line 30
    const-string v1, "measurement.test.cached_long_flag"

    .line 31
    .line 32
    const-wide/16 v2, -0x1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzkf;->zzc(Ljava/lang/String;J)Lcom/google/android/gms/internal/measurement/zzkl;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    sput-object v1, Lcom/google/android/gms/internal/measurement/zzqk;->zzb:Lcom/google/android/gms/internal/measurement/zzkl;

    .line 39
    .line 40
    const-string v1, "measurement.test.double_flag"

    .line 41
    .line 42
    const-wide/high16 v4, -0x3ff8000000000000L    # -3.0

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1, v4, v5}, Lcom/google/android/gms/internal/measurement/zzkf;->zze(Ljava/lang/String;D)Lcom/google/android/gms/internal/measurement/zzkl;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    sput-object v1, Lcom/google/android/gms/internal/measurement/zzqk;->zzc:Lcom/google/android/gms/internal/measurement/zzkl;

    .line 49
    .line 50
    const-string v1, "measurement.test.int_flag"

    .line 51
    .line 52
    const-wide/16 v4, -0x2

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1, v4, v5}, Lcom/google/android/gms/internal/measurement/zzkf;->zzc(Ljava/lang/String;J)Lcom/google/android/gms/internal/measurement/zzkl;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    sput-object v1, Lcom/google/android/gms/internal/measurement/zzqk;->zzd:Lcom/google/android/gms/internal/measurement/zzkl;

    .line 59
    .line 60
    const-string v1, "measurement.test.long_flag"

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzkf;->zzc(Ljava/lang/String;J)Lcom/google/android/gms/internal/measurement/zzkl;

    .line 64
    move-result-object v1

    .line 65
    .line 66
    sput-object v1, Lcom/google/android/gms/internal/measurement/zzqk;->zze:Lcom/google/android/gms/internal/measurement/zzkl;

    .line 67
    .line 68
    const-string v1, "measurement.test.string_flag"

    .line 69
    .line 70
    const-string v2, "---"

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzkf;->zzf(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzkl;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    sput-object v0, Lcom/google/android/gms/internal/measurement/zzqk;->zzf:Lcom/google/android/gms/internal/measurement/zzkl;

    .line 77
    return-void
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
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public final zza()Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzqk;->zza:Lcom/google/android/gms/internal/measurement/zzkl;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzkl;->zzd()Ljava/lang/Object;

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final zzb()J
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzqk;->zzb:Lcom/google/android/gms/internal/measurement/zzkl;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzkl;->zzd()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final zzc()D
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzqk;->zzc:Lcom/google/android/gms/internal/measurement/zzkl;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzkl;->zzd()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Double;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final zzd()J
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzqk;->zzd:Lcom/google/android/gms/internal/measurement/zzkl;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzkl;->zzd()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final zze()J
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzqk;->zze:Lcom/google/android/gms/internal/measurement/zzkl;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzkl;->zzd()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final zzf()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzqk;->zzf:Lcom/google/android/gms/internal/measurement/zzkl;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzkl;->zzd()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

    .line 9
    return-object v0
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
.end method
