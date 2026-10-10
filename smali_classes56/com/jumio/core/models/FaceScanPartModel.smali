.class public Lcom/jumio/core/models/FaceScanPartModel;
.super Lcom/jumio/core/models/ScanPartModel;
.source "SourceFile"


# annotations
.annotation runtime Lcom/jumio/commons/PersistWith;
    value = "FaceScanPartModel"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0000\u0008\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u001b\u001a\u00020\u001cH\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR\u001c\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0015\"\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0015\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/jumio/core/models/FaceScanPartModel;",
        "Lcom/jumio/core/models/ScanPartModel;",
        "mode",
        "Lcom/jumio/core/data/ScanMode;",
        "<init>",
        "(Lcom/jumio/core/data/ScanMode;)V",
        "livenessData",
        "Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;",
        "getLivenessData",
        "()Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;",
        "setLivenessData",
        "(Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;)V",
        "lookupResult",
        "Lcom/jumio/core/models/ReusableIdLookupResult;",
        "getLookupResult",
        "()Lcom/jumio/core/models/ReusableIdLookupResult;",
        "setLookupResult",
        "(Lcom/jumio/core/models/ReusableIdLookupResult;)V",
        "uploadAndUsabilityComplete",
        "",
        "getUploadAndUsabilityComplete",
        "()Z",
        "shouldUseLookupResult",
        "getShouldUseLookupResult",
        "setShouldUseLookupResult",
        "(Z)V",
        "isComplete",
        "clear",
        "",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public l:Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;

.field public m:Lcom/jumio/core/models/ReusableIdLookupResult;

.field public n:Z


# direct methods
.method public constructor <init>(Lcom/jumio/core/data/ScanMode;)V
    .locals 7
    .param p1    # Lcom/jumio/core/data/ScanMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "mode"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v2, Lcom/jumio/sdk/enums/JumioCredentialPart;->FACE:Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 8
    const/4 v5, 0x4

    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    move-object v1, p0

    .line 12
    move-object v3, p1

    .line 13
    .line 14
    .line 15
    invoke-direct/range {v1 .. v6}, Lcom/jumio/core/models/ScanPartModel;-><init>(Lcom/jumio/sdk/enums/JumioCredentialPart;Lcom/jumio/core/data/ScanMode;Lcom/jumio/core/data/scan/FileDataInterface;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 16
    return-void
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
.method public clear()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/jumio/core/models/ScanPartModel;->clear()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/jumio/core/models/FaceScanPartModel;->l:Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;

    .line 7
    return-void
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

.method public final getLivenessData()Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/FaceScanPartModel;->l:Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;

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

.method public final getLookupResult()Lcom/jumio/core/models/ReusableIdLookupResult;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/FaceScanPartModel;->m:Lcom/jumio/core/models/ReusableIdLookupResult;

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

.method public final getShouldUseLookupResult()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/FaceScanPartModel;->n:Z

    .line 3
    return v0
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

.method public final getUploadAndUsabilityComplete()Z
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/models/ScanPartModel;->getMode()Lcom/jumio/core/data/ScanMode;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-object v1, Ljumio/core/l1;->a:[I

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 10
    move-result v0

    .line 11
    .line 12
    aget v0, v1, v0

    .line 13
    const/4 v1, 0x1

    .line 14
    .line 15
    if-ne v0, v1, :cond_4

    .line 16
    .line 17
    .line 18
    invoke-super {p0}, Lcom/jumio/core/models/ScanPartModel;->isComplete()Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    iget-object v0, p0, Lcom/jumio/core/models/FaceScanPartModel;->l:Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;

    .line 24
    const/4 v2, 0x0

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;->getState()Lcom/jumio/core/data/scan/DataState;

    .line 30
    move-result-object v0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object v0, v2

    .line 33
    .line 34
    :goto_0
    sget-object v3, Lcom/jumio/core/data/scan/DataState;->UPLOADED:Lcom/jumio/core/data/scan/DataState;

    .line 35
    .line 36
    if-eq v0, v3, :cond_2

    .line 37
    .line 38
    iget-object v0, p0, Lcom/jumio/core/models/FaceScanPartModel;->l:Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;->getState()Lcom/jumio/core/data/scan/DataState;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    :cond_1
    sget-object v0, Lcom/jumio/core/data/scan/DataState;->SKIPPED:Lcom/jumio/core/data/scan/DataState;

    .line 47
    .line 48
    if-ne v2, v0, :cond_3

    .line 49
    :cond_2
    return v1

    .line 50
    :cond_3
    const/4 v0, 0x0

    .line 51
    return v0

    .line 52
    .line 53
    .line 54
    :cond_4
    invoke-super {p0}, Lcom/jumio/core/models/ScanPartModel;->isComplete()Z

    .line 55
    move-result v0

    .line 56
    return v0
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
.end method

.method public isComplete()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/models/FaceScanPartModel;->getUploadAndUsabilityComplete()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-boolean v0, p0, Lcom/jumio/core/models/FaceScanPartModel;->n:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/jumio/core/models/FaceScanPartModel;->m:Lcom/jumio/core/models/ReusableIdLookupResult;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    :cond_0
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_1
    const/4 v0, 0x0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
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
.end method

.method public final setLivenessData(Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;)V
    .locals 0
    .param p1    # Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/core/models/FaceScanPartModel;->l:Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;

    .line 3
    return-void
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
    .line 24
.end method

.method public final setLookupResult(Lcom/jumio/core/models/ReusableIdLookupResult;)V
    .locals 0
    .param p1    # Lcom/jumio/core/models/ReusableIdLookupResult;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/core/models/FaceScanPartModel;->m:Lcom/jumio/core/models/ReusableIdLookupResult;

    .line 3
    return-void
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
    .line 24
.end method

.method public final setShouldUseLookupResult(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/jumio/core/models/FaceScanPartModel;->n:Z

    .line 3
    return-void
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
    .line 24
.end method
