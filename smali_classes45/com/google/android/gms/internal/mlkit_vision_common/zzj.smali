.class Lcom/google/android/gms/internal/mlkit_vision_common/zzj;
.super Lcom/google/android/gms/internal/mlkit_vision_common/zzk;
.source "com.google.mlkit:vision-common@@17.3.0"


# instance fields
.field zza:[Ljava/lang/Object;

.field zzb:I

.field zzc:Z


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzk;-><init>()V

    .line 4
    const/4 p1, 0x4

    .line 5
    .line 6
    new-array p1, p1, [Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzj;->zza:[Ljava/lang/Object;

    .line 9
    const/4 p1, 0x0

    .line 10
    .line 11
    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzj;->zzb:I

    .line 12
    return-void
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

.method private final zzb(I)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzj;->zza:[Ljava/lang/Object;

    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    if-ge v1, p1, :cond_2

    .line 7
    .line 8
    shr-int/lit8 v3, v1, 0x1

    .line 9
    add-int/2addr v1, v3

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    if-ge v1, p1, :cond_0

    .line 14
    .line 15
    add-int/lit8 p1, p1, -0x1

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 19
    move-result p1

    .line 20
    .line 21
    add-int v1, p1, p1

    .line 22
    .line 23
    :cond_0
    if-gez v1, :cond_1

    .line 24
    .line 25
    .line 26
    const v1, 0x7fffffff

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzj;->zza:[Ljava/lang/Object;

    .line 33
    .line 34
    iput-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzj;->zzc:Z

    .line 35
    return-void

    .line 36
    .line 37
    :cond_2
    iget-boolean p1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzj;->zzc:Z

    .line 38
    .line 39
    if-eqz p1, :cond_3

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    check-cast p1, [Ljava/lang/Object;

    .line 46
    .line 47
    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzj;->zza:[Ljava/lang/Object;

    .line 48
    .line 49
    iput-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzj;->zzc:Z

    .line 50
    :cond_3
    return-void
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
.method public final zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_common/zzj;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzj;->zzb:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzj;->zzb(I)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzj;->zza:[Ljava/lang/Object;

    .line 13
    .line 14
    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzj;->zzb:I

    .line 15
    .line 16
    add-int/lit8 v2, v1, 0x1

    .line 17
    .line 18
    iput v2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzj;->zzb:I

    .line 19
    .line 20
    aput-object p1, v0, v1

    .line 21
    return-object p0
    .line 22
    .line 23
.end method
