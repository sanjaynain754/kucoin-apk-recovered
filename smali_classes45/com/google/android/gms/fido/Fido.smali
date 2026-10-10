.class public Lcom/google/android/gms/fido/Fido;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-fido@@21.0.0"


# static fields
.field public static final FIDO2_KEY_CREDENTIAL_EXTRA:Ljava/lang/String; = "FIDO2_CREDENTIAL_EXTRA"
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final FIDO2_KEY_ERROR_EXTRA:Ljava/lang/String; = "FIDO2_ERROR_EXTRA"
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final FIDO2_KEY_RESPONSE_EXTRA:Ljava/lang/String; = "FIDO2_RESPONSE_EXTRA"
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final FIDO_CREDENTIAL_JSON_EXTRA:Ljava/lang/String; = "FIDO2_CREDENTIAL_JSON_EXTRA"
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final KEY_RESPONSE_EXTRA:Ljava/lang/String; = "RESPONSE_EXTRA"
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final zza:Lcom/google/android/gms/common/api/Api$ClientKey;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final zzb:Lcom/google/android/gms/common/api/Api;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final zzc:Lcom/google/android/gms/internal/fido/zzaa;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/gms/common/api/Api$ClientKey;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/gms/common/api/Api$ClientKey;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/google/android/gms/fido/Fido;->zza:Lcom/google/android/gms/common/api/Api$ClientKey;

    .line 8
    .line 9
    new-instance v1, Lcom/google/android/gms/common/api/Api;

    .line 10
    .line 11
    new-instance v2, Lcom/google/android/gms/internal/fido/zzab;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2}, Lcom/google/android/gms/internal/fido/zzab;-><init>()V

    .line 15
    .line 16
    const-string v3, "Fido.U2F_ZERO_PARTY_API"

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, v3, v2, v0}, Lcom/google/android/gms/common/api/Api;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;Lcom/google/android/gms/common/api/Api$ClientKey;)V

    .line 20
    .line 21
    sput-object v1, Lcom/google/android/gms/fido/Fido;->zzb:Lcom/google/android/gms/common/api/Api;

    .line 22
    .line 23
    new-instance v0, Lcom/google/android/gms/internal/fido/zzaa;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Lcom/google/android/gms/internal/fido/zzaa;-><init>()V

    .line 27
    .line 28
    sput-object v0, Lcom/google/android/gms/fido/Fido;->zzc:Lcom/google/android/gms/internal/fido/zzaa;

    .line 29
    return-void
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
.end method

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
.end method

.method public static getFido2ApiClient(Landroid/app/Activity;)Lcom/google/android/gms/fido/fido2/Fido2ApiClient;
    .locals 1
    .param p0    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/fido/fido2/Fido2ApiClient;

    invoke-direct {v0, p0}, Lcom/google/android/gms/fido/fido2/Fido2ApiClient;-><init>(Landroid/app/Activity;)V

    return-object v0
.end method

.method public static getFido2ApiClient(Landroid/content/Context;)Lcom/google/android/gms/fido/fido2/Fido2ApiClient;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    new-instance v0, Lcom/google/android/gms/fido/fido2/Fido2ApiClient;

    invoke-direct {v0, p0}, Lcom/google/android/gms/fido/fido2/Fido2ApiClient;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static getFido2PrivilegedApiClient(Landroid/app/Activity;)Lcom/google/android/gms/fido/fido2/Fido2PrivilegedApiClient;
    .locals 1
    .param p0    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/fido/fido2/Fido2PrivilegedApiClient;

    invoke-direct {v0, p0}, Lcom/google/android/gms/fido/fido2/Fido2PrivilegedApiClient;-><init>(Landroid/app/Activity;)V

    return-object v0
.end method

.method public static getFido2PrivilegedApiClient(Landroid/content/Context;)Lcom/google/android/gms/fido/fido2/Fido2PrivilegedApiClient;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    new-instance v0, Lcom/google/android/gms/fido/fido2/Fido2PrivilegedApiClient;

    invoke-direct {v0, p0}, Lcom/google/android/gms/fido/fido2/Fido2PrivilegedApiClient;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static getU2fApiClient(Landroid/app/Activity;)Lcom/google/android/gms/fido/u2f/U2fApiClient;
    .locals 1
    .param p0    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/fido/u2f/U2fApiClient;

    invoke-direct {v0, p0}, Lcom/google/android/gms/fido/u2f/U2fApiClient;-><init>(Landroid/app/Activity;)V

    return-object v0
.end method

.method public static getU2fApiClient(Landroid/content/Context;)Lcom/google/android/gms/fido/u2f/U2fApiClient;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    new-instance v0, Lcom/google/android/gms/fido/u2f/U2fApiClient;

    invoke-direct {v0, p0}, Lcom/google/android/gms/fido/u2f/U2fApiClient;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
