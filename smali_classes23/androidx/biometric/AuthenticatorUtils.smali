.class Landroidx/biometric/AuthenticatorUtils;
.super Ljava/lang/Object;
.source "AuthenticatorUtils.java"


# static fields
.field private static final BIOMETRIC_CLASS_MASK:I = 0x7fff


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method

.method public static convertToString(I)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0xf

    .line 3
    .line 4
    if-eq p0, v0, :cond_4

    .line 5
    .line 6
    const/16 v0, 0xff

    .line 7
    .line 8
    if-eq p0, v0, :cond_3

    .line 9
    .line 10
    .line 11
    const v0, 0x8000

    .line 12
    .line 13
    if-eq p0, v0, :cond_2

    .line 14
    .line 15
    .line 16
    const v0, 0x800f

    .line 17
    .line 18
    if-eq p0, v0, :cond_1

    .line 19
    .line 20
    .line 21
    const v0, 0x80ff

    .line 22
    .line 23
    if-eq p0, v0, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    .line 30
    :cond_0
    const-string p0, "BIOMETRIC_WEAK | DEVICE_CREDENTIAL"

    .line 31
    return-object p0

    .line 32
    .line 33
    :cond_1
    const-string p0, "BIOMETRIC_STRONG | DEVICE_CREDENTIAL"

    .line 34
    return-object p0

    .line 35
    .line 36
    :cond_2
    const-string p0, "DEVICE_CREDENTIAL"

    .line 37
    return-object p0

    .line 38
    .line 39
    :cond_3
    const-string p0, "BIOMETRIC_WEAK"

    .line 40
    return-object p0

    .line 41
    .line 42
    :cond_4
    const-string p0, "BIOMETRIC_STRONG"

    .line 43
    return-object p0
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
.end method

.method public static getConsolidatedAuthenticators(Landroidx/biometric/BiometricPrompt$PromptInfo;Landroidx/biometric/BiometricPrompt$CryptoObject;)I
    .locals 1
    .param p0    # Landroidx/biometric/BiometricPrompt$PromptInfo;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroidx/biometric/BiometricPrompt$CryptoObject;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/biometric/BiometricPrompt$PromptInfo;->getAllowedAuthenticators()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/biometric/BiometricPrompt$PromptInfo;->getAllowedAuthenticators()I

    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    .line 13
    :cond_0
    if-eqz p1, :cond_1

    .line 14
    .line 15
    const/16 p1, 0xf

    .line 16
    goto :goto_0

    .line 17
    .line 18
    :cond_1
    const/16 p1, 0xff

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-virtual {p0}, Landroidx/biometric/BiometricPrompt$PromptInfo;->isDeviceCredentialAllowed()Z

    .line 22
    move-result p0

    .line 23
    .line 24
    if-eqz p0, :cond_2

    .line 25
    .line 26
    .line 27
    const p0, 0x8000

    .line 28
    or-int/2addr p0, p1

    .line 29
    return p0

    .line 30
    :cond_2
    return p1
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
.end method

.method public static isDeviceCredentialAllowed(I)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    const v0, 0x8000

    .line 4
    and-int/2addr p0, v0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
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

.method public static isSomeBiometricAllowed(I)Z
    .locals 0

    .line 1
    .line 2
    and-int/lit16 p0, p0, 0x7fff

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
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

.method public static isSupportedCombination(I)Z
    .locals 3

    .line 1
    .line 2
    const/16 v0, 0xf

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eq p0, v0, :cond_6

    .line 6
    .line 7
    const/16 v0, 0xff

    .line 8
    .line 9
    if-eq p0, v0, :cond_6

    .line 10
    .line 11
    .line 12
    const v0, 0x8000

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    if-eq p0, v0, :cond_4

    .line 16
    .line 17
    .line 18
    const v0, 0x800f

    .line 19
    .line 20
    if-eq p0, v0, :cond_1

    .line 21
    .line 22
    .line 23
    const v0, 0x80ff

    .line 24
    .line 25
    if-eq p0, v0, :cond_6

    .line 26
    .line 27
    if-nez p0, :cond_0

    .line 28
    return v1

    .line 29
    :cond_0
    return v2

    .line 30
    .line 31
    :cond_1
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 32
    .line 33
    const/16 v0, 0x1c

    .line 34
    .line 35
    if-lt p0, v0, :cond_3

    .line 36
    .line 37
    const/16 v0, 0x1d

    .line 38
    .line 39
    if-le p0, v0, :cond_2

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return v2

    .line 42
    :cond_3
    :goto_0
    return v1

    .line 43
    .line 44
    :cond_4
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 45
    .line 46
    const/16 v0, 0x1e

    .line 47
    .line 48
    if-lt p0, v0, :cond_5

    .line 49
    return v1

    .line 50
    :cond_5
    return v2

    .line 51
    :cond_6
    return v1
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
.end method

.method public static isWeakBiometricAllowed(I)Z
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0xff

    .line 3
    and-int/2addr p0, v0

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
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
