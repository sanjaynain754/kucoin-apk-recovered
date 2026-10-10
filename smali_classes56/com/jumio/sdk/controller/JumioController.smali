.class public final Lcom/jumio/sdk/controller/JumioController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jumio/sdk/controller/JumioController$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\u0018\u0000 +2\u00020\u0001:\u0001+B+\u0008\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bB-\u0008\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\n\u0010\u0010J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000c\u001a\u00020\rJ\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\u0016J\u0006\u0010$\u001a\u00020\u0016J\u0016\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u0019J\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\'0*R\u0014\u0010\u0011\u001a\u00020\u0012X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001a\u00a8\u0006,"
    }
    d2 = {
        "Lcom/jumio/sdk/controller/JumioController;",
        "",
        "context",
        "Landroid/content/Context;",
        "authorizationModel",
        "Lcom/jumio/core/models/AuthorizationModel;",
        "controllerInterface",
        "Lcom/jumio/sdk/interfaces/JumioControllerInterface;",
        "customThemeId",
        "",
        "<init>",
        "(Landroid/content/Context;Lcom/jumio/core/models/AuthorizationModel;Lcom/jumio/sdk/interfaces/JumioControllerInterface;I)V",
        "data",
        "Landroid/os/Bundle;",
        "scanPartInterface",
        "Lcom/jumio/sdk/interfaces/JumioScanPartInterface;",
        "(Landroid/content/Context;Landroid/os/Bundle;Lcom/jumio/sdk/interfaces/JumioControllerInterface;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)V",
        "controller",
        "Lcom/jumio/core/Controller;",
        "getController$jumio_core_release",
        "()Lcom/jumio/core/Controller;",
        "persist",
        "",
        "stop",
        "isComplete",
        "",
        "()Z",
        "isConsentPreApproved",
        "start",
        "Lcom/jumio/sdk/credentials/JumioCredential;",
        "credentialInfo",
        "Lcom/jumio/sdk/credentials/JumioCredentialInfo;",
        "retry",
        "error",
        "Lcom/jumio/sdk/error/JumioError;",
        "cancel",
        "finish",
        "userConsented",
        "consentItem",
        "Lcom/jumio/sdk/consent/JumioConsentItem;",
        "userConsent",
        "getUnconsentedItems",
        "",
        "Companion",
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
        "SMAP\nJumioController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioController.kt\ncom/jumio/sdk/controller/JumioController\n+ 2 Precondition.kt\ncom/jumio/core/util/PreconditionKt\n*L\n1#1,160:1\n15#2,5:161\n15#2,5:166\n15#2,5:171\n15#2,5:176\n15#2,5:181\n15#2,5:186\n*S KotlinDebug\n*F\n+ 1 JumioController.kt\ncom/jumio/sdk/controller/JumioController\n*L\n89#1:161,5\n103#1:166,5\n117#1:171,5\n132#1:176,5\n148#1:181,5\n155#1:186,5\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/jumio/sdk/controller/JumioController$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/jumio/core/Controller;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/sdk/controller/JumioController$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/jumio/sdk/controller/JumioController$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/jumio/sdk/controller/JumioController;->Companion:Lcom/jumio/sdk/controller/JumioController$Companion;

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

.method public constructor <init>(Landroid/content/Context;Landroid/os/Bundle;Lcom/jumio/sdk/interfaces/JumioControllerInterface;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/jumio/sdk/interfaces/JumioControllerInterface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/jumio/sdk/interfaces/JumioScanPartInterface;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "controllerInterface"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Lcom/jumio/core/Controller;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/jumio/core/Controller;-><init>(Landroid/content/Context;Landroid/os/Bundle;Lcom/jumio/sdk/interfaces/JumioControllerInterface;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)V

    iput-object v0, p0, Lcom/jumio/sdk/controller/JumioController;->a:Lcom/jumio/core/Controller;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/os/Bundle;Lcom/jumio/sdk/interfaces/JumioControllerInterface;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/jumio/sdk/controller/JumioController;-><init>(Landroid/content/Context;Landroid/os/Bundle;Lcom/jumio/sdk/interfaces/JumioControllerInterface;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/jumio/core/models/AuthorizationModel;Lcom/jumio/sdk/interfaces/JumioControllerInterface;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/core/models/AuthorizationModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/jumio/sdk/interfaces/JumioControllerInterface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authorizationModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "controllerInterface"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lcom/jumio/core/Controller;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/jumio/core/Controller;-><init>(Landroid/content/Context;Lcom/jumio/core/models/AuthorizationModel;Lcom/jumio/sdk/interfaces/JumioControllerInterface;I)V

    iput-object v0, p0, Lcom/jumio/sdk/controller/JumioController;->a:Lcom/jumio/core/Controller;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lcom/jumio/core/models/AuthorizationModel;Lcom/jumio/sdk/interfaces/JumioControllerInterface;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/jumio/sdk/controller/JumioController;-><init>(Landroid/content/Context;Lcom/jumio/core/models/AuthorizationModel;Lcom/jumio/sdk/interfaces/JumioControllerInterface;I)V

    return-void
.end method


# virtual methods
.method public final declared-synchronized cancel()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/jumio/sdk/controller/JumioController;->a:Lcom/jumio/core/Controller;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->isActive$jumio_core_release()Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/jumio/sdk/controller/JumioController;->a:Lcom/jumio/core/Controller;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->cancel()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_0
    :try_start_1
    new-instance v0, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;

    .line 21
    .line 22
    const-string v1, "This controller can not be used anymore"

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1}, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;-><init>(Ljava/lang/String;)V

    .line 26
    throw v0

    .line 27
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw v0
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

.method public final declared-synchronized finish()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/jumio/sdk/controller/JumioController;->a:Lcom/jumio/core/Controller;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->isActive$jumio_core_release()Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/jumio/sdk/controller/JumioController;->a:Lcom/jumio/core/Controller;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->finish()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_0
    :try_start_1
    new-instance v0, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;

    .line 21
    .line 22
    const-string v1, "This controller can not be used anymore"

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1}, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;-><init>(Ljava/lang/String;)V

    .line 26
    throw v0

    .line 27
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw v0
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

.method public final getController$jumio_core_release()Lcom/jumio/core/Controller;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/controller/JumioController;->a:Lcom/jumio/core/Controller;

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

.method public final getUnconsentedItems()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jumio/sdk/consent/JumioConsentItem;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/controller/JumioController;->a:Lcom/jumio/core/Controller;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->isActive$jumio_core_release()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/jumio/sdk/controller/JumioController;->a:Lcom/jumio/core/Controller;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getUnconsentedItems()Ljava/util/List;

    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    .line 17
    :cond_0
    new-instance v0, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;

    .line 18
    .line 19
    const-string v1, "This controller can not be used anymore"

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1}, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;-><init>(Ljava/lang/String;)V

    .line 23
    throw v0
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

.method public final isComplete()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/controller/JumioController;->a:Lcom/jumio/core/Controller;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->isComplete()Z

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

.method public final isConsentPreApproved()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/controller/JumioController;->a:Lcom/jumio/core/Controller;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->isConsentPreApproved()Z

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

.method public final persist(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "data"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/sdk/controller/JumioController;->a:Lcom/jumio/core/Controller;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->isActive$jumio_core_release()Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/jumio/sdk/controller/JumioController;->a:Lcom/jumio/core/Controller;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/jumio/core/Controller;->saveState(Landroid/os/Bundle;)V

    .line 19
    :cond_0
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final retry(Lcom/jumio/sdk/error/JumioError;)V
    .locals 1
    .param p1    # Lcom/jumio/sdk/error/JumioError;
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
    const-string v0, "error"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/sdk/controller/JumioController;->a:Lcom/jumio/core/Controller;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->isActive$jumio_core_release()Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/jumio/sdk/controller/JumioController;->a:Lcom/jumio/core/Controller;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/jumio/core/Controller;->retry(Lcom/jumio/sdk/error/JumioError;)V

    .line 19
    return-void

    .line 20
    .line 21
    :cond_0
    new-instance p1, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;

    .line 22
    .line 23
    const-string v0, "This controller can not be used anymore"

    .line 24
    .line 25
    .line 26
    invoke-direct {p1, v0}, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;-><init>(Ljava/lang/String;)V

    .line 27
    throw p1
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
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public final start(Lcom/jumio/sdk/credentials/JumioCredentialInfo;)Lcom/jumio/sdk/credentials/JumioCredential;
    .locals 1
    .param p1    # Lcom/jumio/sdk/credentials/JumioCredentialInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "credentialInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/sdk/controller/JumioController;->a:Lcom/jumio/core/Controller;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->isActive$jumio_core_release()Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/jumio/sdk/controller/JumioController;->a:Lcom/jumio/core/Controller;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/jumio/core/Controller;->startCredential(Lcom/jumio/sdk/credentials/JumioCredentialInfo;)Lcom/jumio/sdk/credentials/JumioCredential;

    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    .line 22
    :cond_0
    new-instance p1, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;

    .line 23
    .line 24
    const-string v0, "This controller can not be used anymore"

    .line 25
    .line 26
    .line 27
    invoke-direct {p1, v0}, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;-><init>(Ljava/lang/String;)V

    .line 28
    throw p1
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
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public final stop()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/controller/JumioController;->a:Lcom/jumio/core/Controller;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->isActive$jumio_core_release()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/jumio/sdk/controller/JumioController;->a:Lcom/jumio/core/Controller;

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/jumio/core/Controller;->persistAllData(Z)V

    .line 15
    :cond_0
    return-void
    .line 16
.end method

.method public final userConsented(Lcom/jumio/sdk/consent/JumioConsentItem;Z)V
    .locals 1
    .param p1    # Lcom/jumio/sdk/consent/JumioConsentItem;
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
    const-string v0, "consentItem"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/sdk/controller/JumioController;->a:Lcom/jumio/core/Controller;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->isActive$jumio_core_release()Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/jumio/sdk/controller/JumioController;->a:Lcom/jumio/core/Controller;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, Lcom/jumio/core/Controller;->userConsented(Lcom/jumio/sdk/consent/JumioConsentItem;Z)V

    .line 19
    return-void

    .line 20
    .line 21
    :cond_0
    new-instance p1, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;

    .line 22
    .line 23
    const-string p2, "This controller can not be used anymore"

    .line 24
    .line 25
    .line 26
    invoke-direct {p1, p2}, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;-><init>(Ljava/lang/String;)V

    .line 27
    throw p1
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
