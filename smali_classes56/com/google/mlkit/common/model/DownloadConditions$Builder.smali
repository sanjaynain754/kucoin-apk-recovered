.class public Lcom/google/mlkit/common/model/DownloadConditions$Builder;
.super Ljava/lang/Object;
.source "com.google.mlkit:common@@18.11.0"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/mlkit/common/model/DownloadConditions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private zza:Z

.field private zzb:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/google/mlkit/common/model/DownloadConditions$Builder;->zza:Z

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/google/mlkit/common/model/DownloadConditions$Builder;->zzb:Z

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method


# virtual methods
.method public build()Lcom/google/mlkit/common/model/DownloadConditions;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/mlkit/common/model/DownloadConditions;

    .line 3
    .line 4
    iget-boolean v1, p0, Lcom/google/mlkit/common/model/DownloadConditions$Builder;->zza:Z

    .line 5
    .line 6
    iget-boolean v2, p0, Lcom/google/mlkit/common/model/DownloadConditions$Builder;->zzb:Z

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, v2, v3}, Lcom/google/mlkit/common/model/DownloadConditions;-><init>(ZZLcom/google/mlkit/common/model/zzb;)V

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public requireCharging()Lcom/google/mlkit/common/model/DownloadConditions$Builder;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x18
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/google/mlkit/common/model/DownloadConditions$Builder;->zza:Z

    .line 4
    return-object p0
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

.method public requireWifi()Lcom/google/mlkit/common/model/DownloadConditions$Builder;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/google/mlkit/common/model/DownloadConditions$Builder;->zzb:Z

    .line 4
    return-object p0
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
