.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrb;

.field private final zzb:Ljava/lang/Boolean;

.field private final zzc:Ljava/lang/Boolean;

.field private final zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzqk;

.field private final zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvz;

.field private final zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;

.field private final zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfr;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfs;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfr;->zzi(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfr;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrb;

    .line 7
    move-result-object p2

    .line 8
    .line 9
    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrb;

    .line 10
    const/4 p2, 0x0

    .line 11
    .line 12
    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zzb:Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfr;->zzk(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfr;)Ljava/lang/Boolean;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zzc:Ljava/lang/Boolean;

    .line 19
    .line 20
    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzqk;

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfr;->zzj(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfr;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvz;

    .line 24
    move-result-object p2

    .line 25
    .line 26
    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvz;

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfr;->zza(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfr;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;

    .line 30
    move-result-object p2

    .line 31
    .line 32
    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfr;->zzb(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfr;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;

    .line 39
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p1, p0, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    return v2

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrb;

    .line 15
    .line 16
    iget-object v3, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrb;

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    const/4 v1, 0x0

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v1}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    move-result v3

    .line 28
    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    iget-object v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zzc:Ljava/lang/Boolean;

    .line 32
    .line 33
    iget-object v4, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zzc:Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    invoke-static {v3, v4}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    move-result v3

    .line 38
    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v1}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    move-result v1

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvz;

    .line 48
    .line 49
    iget-object v3, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvz;

    .line 50
    .line 51
    .line 52
    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    move-result v1

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;

    .line 58
    .line 59
    iget-object v3, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;

    .line 60
    .line 61
    .line 62
    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    move-result v1

    .line 64
    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;

    .line 68
    .line 69
    iget-object p1, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;

    .line 70
    .line 71
    .line 72
    invoke-static {v1, p1}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    move-result p1

    .line 74
    .line 75
    if-eqz p1, :cond_2

    .line 76
    return v0

    .line 77
    :cond_2
    return v2
    .line 78
.end method

.method public final hashCode()I
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrb;

    .line 3
    .line 4
    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zzc:Ljava/lang/Boolean;

    .line 5
    .line 6
    iget-object v4, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvz;

    .line 7
    .line 8
    iget-object v5, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;

    .line 9
    .line 10
    iget-object v6, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Objects;->hashCode([Ljava/lang/Object;)I

    .line 20
    move-result v0

    .line 21
    return v0
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
.end method

.method public final zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation build Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;
        zza = 0x6
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;

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

.method public final zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation build Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;
        zza = 0x7
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;

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

.method public final zzc()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrb;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation build Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;
        zza = 0x1
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrb;

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

.method public final zzd()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvz;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation build Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;
        zza = 0x5
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvz;

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

.method public final zze()Ljava/lang/Boolean;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation build Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;
        zza = 0x3
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zzc:Ljava/lang/Boolean;

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
