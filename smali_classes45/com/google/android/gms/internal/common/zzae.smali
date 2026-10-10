.class Lcom/google/android/gms/internal/common/zzae;
.super Lcom/google/android/gms/internal/common/zzaf;
.source "com.google.android.gms:play-services-basement@@18.5.0"


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
    invoke-direct {p0}, Lcom/google/android/gms/internal/common/zzaf;-><init>()V

    .line 4
    const/4 p1, 0x4

    .line 5
    .line 6
    new-array p1, p1, [Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p1, p0, Lcom/google/android/gms/internal/common/zzae;->zza:[Ljava/lang/Object;

    .line 9
    const/4 p1, 0x0

    .line 10
    .line 11
    iput p1, p0, Lcom/google/android/gms/internal/common/zzae;->zzb:I

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


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/common/zzae;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/common/zzae;->zza:[Ljava/lang/Object;

    .line 6
    array-length v0, v0

    .line 7
    .line 8
    iget v1, p0, Lcom/google/android/gms/internal/common/zzae;->zzb:I

    .line 9
    .line 10
    add-int/lit8 v2, v1, 0x1

    .line 11
    .line 12
    if-ltz v2, :cond_5

    .line 13
    .line 14
    if-gt v2, v0, :cond_0

    .line 15
    move v3, v0

    .line 16
    goto :goto_0

    .line 17
    .line 18
    :cond_0
    shr-int/lit8 v3, v0, 0x1

    .line 19
    add-int/2addr v3, v0

    .line 20
    .line 21
    add-int/lit8 v3, v3, 0x1

    .line 22
    .line 23
    if-ge v3, v2, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 27
    move-result v1

    .line 28
    .line 29
    add-int v3, v1, v1

    .line 30
    .line 31
    :cond_1
    if-gez v3, :cond_2

    .line 32
    .line 33
    .line 34
    const v3, 0x7fffffff

    .line 35
    .line 36
    :cond_2
    :goto_0
    if-gt v3, v0, :cond_3

    .line 37
    .line 38
    iget-boolean v0, p0, Lcom/google/android/gms/internal/common/zzae;->zzc:Z

    .line 39
    .line 40
    if-eqz v0, :cond_4

    .line 41
    .line 42
    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/common/zzae;->zza:[Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    iput-object v0, p0, Lcom/google/android/gms/internal/common/zzae;->zza:[Ljava/lang/Object;

    .line 49
    const/4 v0, 0x0

    .line 50
    .line 51
    iput-boolean v0, p0, Lcom/google/android/gms/internal/common/zzae;->zzc:Z

    .line 52
    .line 53
    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/common/zzae;->zza:[Ljava/lang/Object;

    .line 54
    .line 55
    iget v1, p0, Lcom/google/android/gms/internal/common/zzae;->zzb:I

    .line 56
    .line 57
    add-int/lit8 v2, v1, 0x1

    .line 58
    .line 59
    iput v2, p0, Lcom/google/android/gms/internal/common/zzae;->zzb:I

    .line 60
    .line 61
    aput-object p1, v0, v1

    .line 62
    return-object p0

    .line 63
    .line 64
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 65
    .line 66
    const-string v0, "cannot store more than MAX_VALUE elements"

    .line 67
    .line 68
    .line 69
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 70
    throw p1
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method
