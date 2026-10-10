.class Landroidx/biometric/CancellationSignalProvider;
.super Ljava/lang/Object;
.source "CancellationSignalProvider.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/biometric/CancellationSignalProvider$Api16Impl;,
        Landroidx/biometric/CancellationSignalProvider$Injector;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "CancelSignalProvider"


# instance fields
.field private mBiometricCancellationSignal:Landroid/os/CancellationSignal;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mFingerprintCancellationSignal:Landroidx/core/os/CancellationSignal;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final mInjector:Landroidx/biometric/CancellationSignalProvider$Injector;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroidx/biometric/CancellationSignalProvider$1;

    invoke-direct {v0, p0}, Landroidx/biometric/CancellationSignalProvider$1;-><init>(Landroidx/biometric/CancellationSignalProvider;)V

    iput-object v0, p0, Landroidx/biometric/CancellationSignalProvider;->mInjector:Landroidx/biometric/CancellationSignalProvider$Injector;

    return-void
.end method

.method public constructor <init>(Landroidx/biometric/CancellationSignalProvider$Injector;)V
    .locals 0
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Landroidx/biometric/CancellationSignalProvider;->mInjector:Landroidx/biometric/CancellationSignalProvider$Injector;

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/biometric/CancellationSignalProvider;->mBiometricCancellationSignal:Landroid/os/CancellationSignal;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-string v2, "CancelSignalProvider"

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-static {v0}, Landroidx/biometric/CancellationSignalProvider$Api16Impl;->cancel(Landroid/os/CancellationSignal;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    goto :goto_0

    .line 12
    :catch_0
    move-exception v0

    .line 13
    .line 14
    const-string v3, "Got NPE while canceling biometric authentication."

    .line 15
    .line 16
    .line 17
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 18
    .line 19
    :goto_0
    iput-object v1, p0, Landroidx/biometric/CancellationSignalProvider;->mBiometricCancellationSignal:Landroid/os/CancellationSignal;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Landroidx/biometric/CancellationSignalProvider;->mFingerprintCancellationSignal:Landroidx/core/os/CancellationSignal;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    .line 26
    :try_start_1
    invoke-virtual {v0}, Landroidx/core/os/CancellationSignal;->cancel()V
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_1

    .line 27
    goto :goto_1

    .line 28
    :catch_1
    move-exception v0

    .line 29
    .line 30
    const-string v3, "Got NPE while canceling fingerprint authentication."

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 34
    .line 35
    :goto_1
    iput-object v1, p0, Landroidx/biometric/CancellationSignalProvider;->mFingerprintCancellationSignal:Landroidx/core/os/CancellationSignal;

    .line 36
    :cond_1
    return-void
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
.end method

.method public getBiometricCancellationSignal()Landroid/os/CancellationSignal;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x10
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/biometric/CancellationSignalProvider;->mBiometricCancellationSignal:Landroid/os/CancellationSignal;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/biometric/CancellationSignalProvider;->mInjector:Landroidx/biometric/CancellationSignalProvider$Injector;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Landroidx/biometric/CancellationSignalProvider$Injector;->getBiometricCancellationSignal()Landroid/os/CancellationSignal;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iput-object v0, p0, Landroidx/biometric/CancellationSignalProvider;->mBiometricCancellationSignal:Landroid/os/CancellationSignal;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Landroidx/biometric/CancellationSignalProvider;->mBiometricCancellationSignal:Landroid/os/CancellationSignal;

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public getFingerprintCancellationSignal()Landroidx/core/os/CancellationSignal;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/biometric/CancellationSignalProvider;->mFingerprintCancellationSignal:Landroidx/core/os/CancellationSignal;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/biometric/CancellationSignalProvider;->mInjector:Landroidx/biometric/CancellationSignalProvider$Injector;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Landroidx/biometric/CancellationSignalProvider$Injector;->getFingerprintCancellationSignal()Landroidx/core/os/CancellationSignal;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iput-object v0, p0, Landroidx/biometric/CancellationSignalProvider;->mFingerprintCancellationSignal:Landroidx/core/os/CancellationSignal;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Landroidx/biometric/CancellationSignalProvider;->mFingerprintCancellationSignal:Landroidx/core/os/CancellationSignal;

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method
