.class Landroidx/biometric/AuthenticationCallbackProvider;
.super Ljava/lang/Object;
.source "AuthenticationCallbackProvider.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/biometric/AuthenticationCallbackProvider$Api28Impl;,
        Landroidx/biometric/AuthenticationCallbackProvider$Api30Impl;,
        Landroidx/biometric/AuthenticationCallbackProvider$Listener;
    }
.end annotation


# instance fields
.field private mBiometricCallback:Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mFingerprintCallback:Landroidx/core/hardware/fingerprint/FingerprintManagerCompat$AuthenticationCallback;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field final mListener:Landroidx/biometric/AuthenticationCallbackProvider$Listener;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/biometric/AuthenticationCallbackProvider$Listener;)V
    .locals 0
    .param p1    # Landroidx/biometric/AuthenticationCallbackProvider$Listener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/biometric/AuthenticationCallbackProvider;->mListener:Landroidx/biometric/AuthenticationCallbackProvider$Listener;

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
.method public getBiometricCallback()Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1c
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/biometric/AuthenticationCallbackProvider;->mBiometricCallback:Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/biometric/AuthenticationCallbackProvider;->mListener:Landroidx/biometric/AuthenticationCallbackProvider$Listener;

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Landroidx/biometric/AuthenticationCallbackProvider$Api28Impl;->createCallback(Landroidx/biometric/AuthenticationCallbackProvider$Listener;)Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iput-object v0, p0, Landroidx/biometric/AuthenticationCallbackProvider;->mBiometricCallback:Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Landroidx/biometric/AuthenticationCallbackProvider;->mBiometricCallback:Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public getFingerprintCallback()Landroidx/core/hardware/fingerprint/FingerprintManagerCompat$AuthenticationCallback;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/biometric/AuthenticationCallbackProvider;->mFingerprintCallback:Landroidx/core/hardware/fingerprint/FingerprintManagerCompat$AuthenticationCallback;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Landroidx/biometric/AuthenticationCallbackProvider$1;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0}, Landroidx/biometric/AuthenticationCallbackProvider$1;-><init>(Landroidx/biometric/AuthenticationCallbackProvider;)V

    .line 10
    .line 11
    iput-object v0, p0, Landroidx/biometric/AuthenticationCallbackProvider;->mFingerprintCallback:Landroidx/core/hardware/fingerprint/FingerprintManagerCompat$AuthenticationCallback;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/biometric/AuthenticationCallbackProvider;->mFingerprintCallback:Landroidx/core/hardware/fingerprint/FingerprintManagerCompat$AuthenticationCallback;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method
