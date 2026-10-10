.class public final Lcom/jumio/sdk/scanpart/JumioScanPart;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0008\u0000\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\u0008\u00030\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0012J\u0006\u0010\u0017\u001a\u00020\u0012J\u0006\u0010\u0018\u001a\u00020\u0012J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0007R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\u0008\u00030\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/jumio/sdk/scanpart/JumioScanPart;",
        "Ljava/io/Serializable;",
        "scanPart",
        "Lcom/jumio/core/scanpart/ScanPart;",
        "<init>",
        "(Lcom/jumio/core/scanpart/ScanPart;)V",
        "getScanPart$jumio_core_release",
        "()Lcom/jumio/core/scanpart/ScanPart;",
        "isValid",
        "",
        "hasFallback",
        "getHasFallback",
        "()Z",
        "scanMode",
        "Lcom/jumio/sdk/enums/JumioScanMode;",
        "getScanMode",
        "()Lcom/jumio/sdk/enums/JumioScanMode;",
        "start",
        "",
        "retry",
        "reason",
        "Lcom/jumio/sdk/retry/JumioRetryReason;",
        "fallback",
        "cancel",
        "finish",
        "getHelpAnimation",
        "animationView",
        "Lcom/jumio/sdk/views/JumioAnimationView;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nJumioScanPart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioScanPart.kt\ncom/jumio/sdk/scanpart/JumioScanPart\n+ 2 Precondition.kt\ncom/jumio/core/util/PreconditionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n15#2,5:117\n15#2,5:122\n15#2,5:127\n15#2,5:132\n15#2,5:137\n15#2,5:142\n15#2,5:148\n1#3:147\n*S KotlinDebug\n*F\n+ 1 JumioScanPart.kt\ncom/jumio/sdk/scanpart/JumioScanPart\n*L\n48#1:117,5\n60#1:122,5\n71#1:127,5\n82#1:132,5\n83#1:137,5\n96#1:142,5\n112#1:148,5\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lcom/jumio/core/scanpart/ScanPart;

.field public b:Z


# direct methods
.method public constructor <init>(Lcom/jumio/core/scanpart/ScanPart;)V
    .locals 1
    .param p1    # Lcom/jumio/core/scanpart/ScanPart;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/core/scanpart/ScanPart<",
            "*>;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "scanPart"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/jumio/sdk/scanpart/JumioScanPart;->a:Lcom/jumio/core/scanpart/ScanPart;

    .line 11
    const/4 p1, 0x1

    .line 12
    .line 13
    iput-boolean p1, p0, Lcom/jumio/sdk/scanpart/JumioScanPart;->b:Z

    .line 14
    return-void
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
.method public final cancel()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/sdk/scanpart/JumioScanPart;->b:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/jumio/sdk/scanpart/JumioScanPart;->a:Lcom/jumio/core/scanpart/ScanPart;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/jumio/core/scanpart/ScanPart;->isCancelable()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/jumio/sdk/scanpart/JumioScanPart;->a:Lcom/jumio/core/scanpart/ScanPart;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/jumio/core/scanpart/ScanPart;->cancel()V

    .line 18
    .line 19
    iget-object v0, p0, Lcom/jumio/sdk/scanpart/JumioScanPart;->a:Lcom/jumio/core/scanpart/ScanPart;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/jumio/core/scanpart/ScanPart;->getCredential()Lcom/jumio/sdk/credentials/JumioCredential;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p0}, Lcom/jumio/sdk/credentials/JumioCredential;->cancelScanPart$jumio_core_release(Lcom/jumio/sdk/scanpart/JumioScanPart;)V

    .line 27
    const/4 v0, 0x0

    .line 28
    .line 29
    iput-boolean v0, p0, Lcom/jumio/sdk/scanpart/JumioScanPart;->b:Z

    .line 30
    return-void

    .line 31
    .line 32
    :cond_0
    new-instance v0, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;

    .line 33
    .line 34
    const-string v1, "This part is not cancelable at the moment"

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, v1}, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;-><init>(Ljava/lang/String;)V

    .line 38
    throw v0

    .line 39
    .line 40
    :cond_1
    new-instance v0, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;

    .line 41
    .line 42
    const-string v1, "This part can not be used anymore"

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, v1}, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;-><init>(Ljava/lang/String;)V

    .line 46
    throw v0
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

.method public final fallback()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/sdk/scanpart/JumioScanPart;->b:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/jumio/sdk/scanpart/JumioScanPart;->a:Lcom/jumio/core/scanpart/ScanPart;

    .line 7
    .line 8
    sget-object v1, Lcom/jumio/sdk/enums/JumioFallbackReason;->USER_ACTION:Lcom/jumio/sdk/enums/JumioFallbackReason;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/jumio/core/scanpart/ScanPart;->fallback(Lcom/jumio/sdk/enums/JumioFallbackReason;)V

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    new-instance v0, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;

    .line 15
    .line 16
    const-string v1, "This part can not be used anymore"

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1}, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;-><init>(Ljava/lang/String;)V

    .line 20
    throw v0
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

.method public final finish()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/sdk/scanpart/JumioScanPart;->b:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/jumio/sdk/scanpart/JumioScanPart;->a:Lcom/jumio/core/scanpart/ScanPart;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/jumio/core/scanpart/ScanPart;->isComplete()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/jumio/sdk/scanpart/JumioScanPart;->a:Lcom/jumio/core/scanpart/ScanPart;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/jumio/core/scanpart/ScanPart;->finish()V

    .line 18
    .line 19
    iget-object v0, p0, Lcom/jumio/sdk/scanpart/JumioScanPart;->a:Lcom/jumio/core/scanpart/ScanPart;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/jumio/core/scanpart/ScanPart;->getCredential()Lcom/jumio/sdk/credentials/JumioCredential;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p0}, Lcom/jumio/sdk/credentials/JumioCredential;->finishScanPart$jumio_core_release(Lcom/jumio/sdk/scanpart/JumioScanPart;)V

    .line 27
    const/4 v0, 0x0

    .line 28
    .line 29
    iput-boolean v0, p0, Lcom/jumio/sdk/scanpart/JumioScanPart;->b:Z

    .line 30
    return-void

    .line 31
    .line 32
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    const-string v1, "This part is not yet finished"

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    throw v0

    .line 39
    .line 40
    :cond_1
    new-instance v0, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;

    .line 41
    .line 42
    const-string v1, "This part can not be used anymore"

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, v1}, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;-><init>(Ljava/lang/String;)V

    .line 46
    throw v0
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

.method public final getHasFallback()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/scanpart/JumioScanPart;->a:Lcom/jumio/core/scanpart/ScanPart;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/jumio/core/scanpart/ScanPart;->getHasFallback()Z

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public final getHelpAnimation(Lcom/jumio/sdk/views/JumioAnimationView;)V
    .locals 1
    .param p1    # Lcom/jumio/sdk/views/JumioAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "Deprecated as of Jumio SDK 4.13.0"
    .end annotation

    .line 1
    .line 2
    const-string v0, "animationView"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/jumio/sdk/scanpart/JumioScanPart;->b:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/jumio/sdk/scanpart/JumioScanPart;->a:Lcom/jumio/core/scanpart/ScanPart;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/jumio/core/scanpart/ScanPart;->getHelpAnimation(Lcom/jumio/sdk/views/JumioAnimationView;)V

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    new-instance p1, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;

    .line 18
    .line 19
    const-string v0, "This part can not be used anymore"

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, v0}, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;-><init>(Ljava/lang/String;)V

    .line 23
    throw p1
    .line 24
.end method

.method public final getScanMode()Lcom/jumio/sdk/enums/JumioScanMode;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/scanpart/JumioScanPart;->a:Lcom/jumio/core/scanpart/ScanPart;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/jumio/core/scanpart/ScanPart;->getScanMode()Lcom/jumio/sdk/enums/JumioScanMode;

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

.method public final getScanPart$jumio_core_release()Lcom/jumio/core/scanpart/ScanPart;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/jumio/core/scanpart/ScanPart<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/scanpart/JumioScanPart;->a:Lcom/jumio/core/scanpart/ScanPart;

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

.method public final retry(Lcom/jumio/sdk/retry/JumioRetryReason;)V
    .locals 1
    .param p1    # Lcom/jumio/sdk/retry/JumioRetryReason;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "reason"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/jumio/sdk/scanpart/JumioScanPart;->b:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/jumio/sdk/scanpart/JumioScanPart;->a:Lcom/jumio/core/scanpart/ScanPart;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/jumio/core/scanpart/ScanPart;->retry(Lcom/jumio/sdk/retry/JumioRetryReason;)V

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    new-instance p1, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;

    .line 18
    .line 19
    const-string v0, "This part can not be used anymore"

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, v0}, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;-><init>(Ljava/lang/String;)V

    .line 23
    throw p1
    .line 24
.end method

.method public final start()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/sdk/scanpart/JumioScanPart;->b:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/jumio/sdk/scanpart/JumioScanPart;->a:Lcom/jumio/core/scanpart/ScanPart;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/jumio/core/scanpart/ScanPart;->start()V

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    new-instance v0, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;

    .line 13
    .line 14
    const-string v1, "This part can not be used anymore"

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;-><init>(Ljava/lang/String;)V

    .line 18
    throw v0
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
