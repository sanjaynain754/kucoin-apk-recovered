.class final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1"


# static fields
.field static final zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;


# instance fields
.field final zzb:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;

    .line 3
    .line 4
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc$1;

    .line 5
    .line 6
    const-string v2, "Failure occurred while trying to finish a future."

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc$1;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;-><init>(Ljava/lang/Throwable;)V

    .line 13
    .line 14
    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;

    .line 15
    return-void
    .line 16
    .line 17
    .line 18
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;->zzb:Ljava/lang/Throwable;

    .line 9
    return-void
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
