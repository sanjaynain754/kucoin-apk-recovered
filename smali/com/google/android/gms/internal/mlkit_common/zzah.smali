.class public final Lcom/google/android/gms/internal/mlkit_common/zzah;
.super Ljava/lang/Object;
.source "com.google.mlkit:common@@18.11.0"


# instance fields
.field zza:[Ljava/lang/Object;

.field zzb:I

.field zzc:Lcom/google/android/gms/internal/mlkit_common/zzag;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const/16 v0, 0x8

    .line 6
    .line 7
    new-array v0, v0, [Ljava/lang/Object;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzah;->zza:[Ljava/lang/Object;

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    iput v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzah;->zzb:I

    .line 13
    return-void
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
.method public final zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzah;
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzah;->zzb:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzah;->zza:[Ljava/lang/Object;

    .line 7
    array-length v2, v1

    .line 8
    add-int/2addr v0, v0

    .line 9
    .line 10
    if-le v0, v2, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/mlkit_common/zzaa;->zza(II)I

    .line 14
    move-result v0

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzah;->zza:[Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/mlkit_common/zzw;->zza(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzah;->zza:[Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzah;->zzb:I

    .line 28
    .line 29
    add-int v2, v1, v1

    .line 30
    .line 31
    aput-object p1, v0, v2

    .line 32
    .line 33
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    aput-object p2, v0, v2

    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    iput v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzah;->zzb:I

    .line 40
    return-object p0
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
.end method

.method public final zzb()Lcom/google/android/gms/internal/mlkit_common/zzai;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzah;->zzc:Lcom/google/android/gms/internal/mlkit_common/zzag;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzah;->zzb:I

    .line 7
    .line 8
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzah;->zza:[Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p0}, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzg(I[Ljava/lang/Object;Lcom/google/android/gms/internal/mlkit_common/zzah;)Lcom/google/android/gms/internal/mlkit_common/zzaq;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzah;->zzc:Lcom/google/android/gms/internal/mlkit_common/zzag;

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    return-object v0

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_common/zzag;->zza()Ljava/lang/IllegalArgumentException;

    .line 21
    move-result-object v0

    .line 22
    throw v0

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_common/zzag;->zza()Ljava/lang/IllegalArgumentException;

    .line 26
    move-result-object v0

    .line 27
    throw v0
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
.end method
