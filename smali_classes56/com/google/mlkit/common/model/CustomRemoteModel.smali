.class public final Lcom/google/mlkit/common/model/CustomRemoteModel;
.super Lcom/google/mlkit/common/model/RemoteModel;
.source "com.google.mlkit:common@@18.11.0"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/mlkit/common/model/CustomRemoteModel$Builder;
    }
.end annotation


# instance fields
.field private final zzb:Lcom/google/mlkit/common/model/RemoteModelSource;


# direct methods
.method public synthetic constructor <init>(Lcom/google/mlkit/common/model/RemoteModelSource;Lcom/google/mlkit/common/model/zza;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/mlkit/common/model/RemoteModelSource;->zza()Ljava/lang/String;

    .line 4
    move-result-object p2

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    move-result p2

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    const-string p2, "no_model_name"

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p1}, Lcom/google/mlkit/common/model/RemoteModelSource;->zza()Ljava/lang/String;

    .line 17
    move-result-object p2

    .line 18
    :goto_0
    const/4 v0, 0x0

    .line 19
    .line 20
    sget-object v1, Lcom/google/mlkit/common/sdkinternal/ModelType;->CUSTOM:Lcom/google/mlkit/common/sdkinternal/ModelType;

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, p2, v0, v1}, Lcom/google/mlkit/common/model/RemoteModel;-><init>(Ljava/lang/String;Lcom/google/mlkit/common/sdkinternal/model/BaseModel;Lcom/google/mlkit/common/sdkinternal/ModelType;)V

    .line 24
    .line 25
    iput-object p1, p0, Lcom/google/mlkit/common/model/CustomRemoteModel;->zzb:Lcom/google/mlkit/common/model/RemoteModelSource;

    .line 26
    return-void
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
.end method


# virtual methods
.method public getRemoteModelSource()Lcom/google/mlkit/common/model/RemoteModelSource;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/mlkit/common/model/CustomRemoteModel;->zzb:Lcom/google/mlkit/common/model/RemoteModelSource;

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
