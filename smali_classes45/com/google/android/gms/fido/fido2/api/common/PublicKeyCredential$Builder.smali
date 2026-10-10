.class public Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential$Builder;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-fido@@21.0.0"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private zza:Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private zzb:Lcom/google/android/gms/internal/fido/zzgx;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private zzc:Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorResponse;

.field private zzd:Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsClientOutputs;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private zze:Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
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
.end method


# virtual methods
.method public build()Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;
    .locals 14
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential$Builder;->zzc:Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorResponse;

    .line 3
    .line 4
    instance-of v1, v0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    move-object v1, v0

    .line 9
    .line 10
    check-cast v1, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;

    .line 11
    move-object v7, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v7, v2

    .line 14
    .line 15
    :goto_0
    instance-of v1, v0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAssertionResponse;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    move-object v1, v0

    .line 19
    .line 20
    check-cast v1, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAssertionResponse;

    .line 21
    move-object v8, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-object v8, v2

    .line 24
    .line 25
    :goto_1
    instance-of v1, v0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorErrorResponse;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    move-object v2, v0

    .line 29
    .line 30
    check-cast v2, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorErrorResponse;

    .line 31
    :cond_2
    move-object v9, v2

    .line 32
    .line 33
    new-instance v3, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;

    .line 34
    .line 35
    iget-object v4, p0, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential$Builder;->zza:Ljava/lang/String;

    .line 36
    .line 37
    sget-object v0, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialType;->PUBLIC_KEY:Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialType;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialType;->toString()Ljava/lang/String;

    .line 41
    move-result-object v5

    .line 42
    .line 43
    iget-object v6, p0, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential$Builder;->zzb:Lcom/google/android/gms/internal/fido/zzgx;

    .line 44
    .line 45
    iget-object v10, p0, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential$Builder;->zzd:Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsClientOutputs;

    .line 46
    .line 47
    iget-object v11, p0, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential$Builder;->zze:Ljava/lang/String;

    .line 48
    const/4 v12, 0x0

    .line 49
    const/4 v13, 0x0

    .line 50
    .line 51
    .line 52
    invoke-direct/range {v3 .. v13}, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/fido/zzgx;Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAssertionResponse;Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorErrorResponse;Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsClientOutputs;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/fido/fido2/api/common/zzam;)V

    .line 53
    return-object v3
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
.end method

.method public setAuthenticationExtensionsClientOutputs(Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsClientOutputs;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential$Builder;
    .locals 0
    .param p1    # Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsClientOutputs;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential$Builder;->zzd:Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsClientOutputs;

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

.method public setAuthenticatorAttachment(Ljava/lang/String;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential$Builder;->zze:Ljava/lang/String;

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

.method public setId(Ljava/lang/String;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential$Builder;->zza:Ljava/lang/String;

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

.method public setRawId(Lcom/google/android/gms/internal/fido/zzgx;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential$Builder;
    .locals 0
    .param p1    # Lcom/google/android/gms/internal/fido/zzgx;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential$Builder;->zzb:Lcom/google/android/gms/internal/fido/zzgx;

    return-object p0
.end method

.method public setRawId([B)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential$Builder;
    .locals 2
    .param p1    # [B
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    array-length v1, p1

    .line 2
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/fido/zzgx;->zzl([BII)Lcom/google/android/gms/internal/fido/zzgx;

    move-result-object p1

    .line 3
    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential$Builder;->zzb:Lcom/google/android/gms/internal/fido/zzgx;

    return-object p0
.end method

.method public setResponse(Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorResponse;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential$Builder;
    .locals 0
    .param p1    # Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorResponse;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential$Builder;->zzc:Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorResponse;

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
