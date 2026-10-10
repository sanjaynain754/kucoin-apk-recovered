.class final Lcom/google/mlkit/vision/common/zzb;
.super Ljava/lang/Object;
.source "com.google.mlkit:vision-common@@17.3.0"


# instance fields
.field private final zza:Landroid/media/Image;


# direct methods
.method public constructor <init>(Landroid/media/Image;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/mlkit/vision/common/zzb;->zza:Landroid/media/Image;

    .line 6
    return-void
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
.end method


# virtual methods
.method public final zza()Landroid/media/Image;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/mlkit/vision/common/zzb;->zza:Landroid/media/Image;

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
.end method

.method public final zzb()[Landroid/media/Image$Plane;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/mlkit/vision/common/zzb;->zza:Landroid/media/Image;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method
