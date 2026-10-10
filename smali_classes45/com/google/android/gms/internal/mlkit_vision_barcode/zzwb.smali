.class final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwb;
.super Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwg;
.source "com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1"


# instance fields
.field private zza:Ljava/lang/String;

.field private zzb:Z

.field private zzc:I

.field private zzd:B


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwg;-><init>()V

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
.method public final zza(Z)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwg;
    .locals 1

    .line 1
    const/4 p1, 0x1

    .line 2
    .line 3
    iput-boolean p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwb;->zzb:Z

    .line 4
    .line 5
    iget-byte v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwb;->zzd:B

    .line 6
    or-int/2addr p1, v0

    .line 7
    int-to-byte p1, p1

    .line 8
    .line 9
    iput-byte p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwb;->zzd:B

    .line 10
    return-object p0
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

.method public final zzb(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwg;
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    .line 3
    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwb;->zzc:I

    .line 4
    .line 5
    iget-byte p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwb;->zzd:B

    .line 6
    .line 7
    or-int/lit8 p1, p1, 0x2

    .line 8
    int-to-byte p1, p1

    .line 9
    .line 10
    iput-byte p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwb;->zzd:B

    .line 11
    return-object p0
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

.method public final zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwg;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwb;->zza:Ljava/lang/String;

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

.method public final zzd()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwh;
    .locals 5

    .line 1
    .line 2
    iget-byte v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwb;->zzd:B

    .line 3
    const/4 v1, 0x3

    .line 4
    .line 5
    if-ne v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwb;->zza:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    goto :goto_0

    .line 11
    .line 12
    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwd;

    .line 13
    .line 14
    iget-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwb;->zzb:Z

    .line 15
    .line 16
    iget v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwb;->zzc:I

    .line 17
    const/4 v4, 0x0

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v0, v2, v3, v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwd;-><init>(Ljava/lang/String;ZILcom/google/android/gms/internal/mlkit_vision_barcode/zzwc;)V

    .line 21
    return-object v1

    .line 22
    .line 23
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwb;->zza:Ljava/lang/String;

    .line 29
    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    const-string v1, " libraryName"

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    :cond_2
    iget-byte v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwb;->zzd:B

    .line 38
    .line 39
    and-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    if-nez v1, :cond_3

    .line 42
    .line 43
    const-string v1, " enableFirelog"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    :cond_3
    iget-byte v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwb;->zzd:B

    .line 49
    .line 50
    and-int/lit8 v1, v1, 0x2

    .line 51
    .line 52
    if-nez v1, :cond_4

    .line 53
    .line 54
    const-string v1, " firelogEventType"

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    const-string v2, "Missing required properties:"

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    .line 72
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 73
    throw v1
    .line 74
    .line 75
.end method
