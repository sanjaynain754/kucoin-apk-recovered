.class public final Lcom/google/android/gms/common/api/ComplianceOptions$Builder;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-basement@@18.5.0"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/common/api/ComplianceOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private zza:I

.field private zzb:I

.field private zzc:I

.field private zzd:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, -0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/google/android/gms/common/api/ComplianceOptions$Builder;->zza:I

    .line 7
    .line 8
    iput v0, p0, Lcom/google/android/gms/common/api/ComplianceOptions$Builder;->zzb:I

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    iput v0, p0, Lcom/google/android/gms/common/api/ComplianceOptions$Builder;->zzc:I

    .line 12
    const/4 v0, 0x1

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/google/android/gms/common/api/ComplianceOptions$Builder;->zzd:Z

    .line 15
    return-void
    .line 16
    .line 17
    .line 18
.end method


# virtual methods
.method public build()Lcom/google/android/gms/common/api/ComplianceOptions;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/gms/common/api/ComplianceOptions;

    .line 3
    .line 4
    iget v1, p0, Lcom/google/android/gms/common/api/ComplianceOptions$Builder;->zza:I

    .line 5
    .line 6
    iget v2, p0, Lcom/google/android/gms/common/api/ComplianceOptions$Builder;->zzb:I

    .line 7
    .line 8
    iget v3, p0, Lcom/google/android/gms/common/api/ComplianceOptions$Builder;->zzc:I

    .line 9
    .line 10
    iget-boolean v4, p0, Lcom/google/android/gms/common/api/ComplianceOptions$Builder;->zzd:Z

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/common/api/ComplianceOptions;-><init>(IIIZ)V

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public setCallerProductId(I)Lcom/google/android/gms/common/api/ComplianceOptions$Builder;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .line 1
    .line 2
    iput p1, p0, Lcom/google/android/gms/common/api/ComplianceOptions$Builder;->zza:I

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

.method public setDataOwnerProductId(I)Lcom/google/android/gms/common/api/ComplianceOptions$Builder;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .line 1
    .line 2
    iput p1, p0, Lcom/google/android/gms/common/api/ComplianceOptions$Builder;->zzb:I

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

.method public setIsUserData(Z)Lcom/google/android/gms/common/api/ComplianceOptions$Builder;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/google/android/gms/common/api/ComplianceOptions$Builder;->zzd:Z

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

.method public setProcessingReason(I)Lcom/google/android/gms/common/api/ComplianceOptions$Builder;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .line 1
    .line 2
    iput p1, p0, Lcom/google/android/gms/common/api/ComplianceOptions$Builder;->zzc:I

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
