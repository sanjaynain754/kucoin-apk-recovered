.class public final Lcom/google/android/gms/internal/mlkit_common/zzac;
.super Lcom/google/android/gms/internal/mlkit_common/zzz;
.source "com.google.mlkit:common@@18.11.0"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/mlkit_common/zzz;-><init>(I)V

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
.end method


# virtual methods
.method public final zzb(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzac;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    iget v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzz;->zzb:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzz;->zza:[Ljava/lang/Object;

    .line 10
    array-length v2, v1

    .line 11
    const/4 v3, 0x0

    .line 12
    .line 13
    if-ge v2, v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/mlkit_common/zzaa;->zza(II)I

    .line 17
    move-result v0

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzz;->zza:[Ljava/lang/Object;

    .line 24
    .line 25
    iput-boolean v3, p0, Lcom/google/android/gms/internal/mlkit_common/zzz;->zzc:Z

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzz;->zzc:Z

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    check-cast v0, [Ljava/lang/Object;

    .line 37
    .line 38
    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzz;->zza:[Ljava/lang/Object;

    .line 39
    .line 40
    iput-boolean v3, p0, Lcom/google/android/gms/internal/mlkit_common/zzz;->zzc:Z

    .line 41
    .line 42
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzz;->zza:[Ljava/lang/Object;

    .line 43
    .line 44
    iget v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzz;->zzb:I

    .line 45
    .line 46
    add-int/lit8 v2, v1, 0x1

    .line 47
    .line 48
    iput v2, p0, Lcom/google/android/gms/internal/mlkit_common/zzz;->zzb:I

    .line 49
    .line 50
    aput-object p1, v0, v1

    .line 51
    return-object p0
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

.method public final zzc()Lcom/google/android/gms/internal/mlkit_common/zzaf;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzz;->zzc:Z

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzz;->zza:[Ljava/lang/Object;

    .line 6
    .line 7
    iget v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzz;->zzb:I

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/mlkit_common/zzaf;->zzg([Ljava/lang/Object;I)Lcom/google/android/gms/internal/mlkit_common/zzaf;

    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method
