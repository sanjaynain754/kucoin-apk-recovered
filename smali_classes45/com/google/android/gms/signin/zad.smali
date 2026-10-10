.class public final Lcom/google/android/gms/signin/zad;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-base@@18.4.0"


# static fields
.field public static final zaa:Lcom/google/android/gms/common/api/Api$ClientKey;

.field public static final zab:Lcom/google/android/gms/common/api/Api$ClientKey;
    .annotation build Lcom/google/android/gms/common/internal/ShowFirstParty;
    .end annotation
.end field

.field public static final zac:Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;

.field static final zad:Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;

.field public static final zae:Lcom/google/android/gms/common/api/Scope;

.field public static final zaf:Lcom/google/android/gms/common/api/Scope;

.field public static final zag:Lcom/google/android/gms/common/api/Api;

.field public static final zah:Lcom/google/android/gms/common/api/Api;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/gms/common/api/Api$ClientKey;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/gms/common/api/Api$ClientKey;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/google/android/gms/signin/zad;->zaa:Lcom/google/android/gms/common/api/Api$ClientKey;

    .line 8
    .line 9
    new-instance v1, Lcom/google/android/gms/common/api/Api$ClientKey;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1}, Lcom/google/android/gms/common/api/Api$ClientKey;-><init>()V

    .line 13
    .line 14
    sput-object v1, Lcom/google/android/gms/signin/zad;->zab:Lcom/google/android/gms/common/api/Api$ClientKey;

    .line 15
    .line 16
    new-instance v2, Lcom/google/android/gms/signin/zaa;

    .line 17
    .line 18
    .line 19
    invoke-direct {v2}, Lcom/google/android/gms/signin/zaa;-><init>()V

    .line 20
    .line 21
    sput-object v2, Lcom/google/android/gms/signin/zad;->zac:Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;

    .line 22
    .line 23
    new-instance v3, Lcom/google/android/gms/signin/zab;

    .line 24
    .line 25
    .line 26
    invoke-direct {v3}, Lcom/google/android/gms/signin/zab;-><init>()V

    .line 27
    .line 28
    sput-object v3, Lcom/google/android/gms/signin/zad;->zad:Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;

    .line 29
    .line 30
    new-instance v4, Lcom/google/android/gms/common/api/Scope;

    .line 31
    .line 32
    .line 33
    const-string/jumbo v5, "profile"

    .line 34
    .line 35
    .line 36
    invoke-direct {v4, v5}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    sput-object v4, Lcom/google/android/gms/signin/zad;->zae:Lcom/google/android/gms/common/api/Scope;

    .line 39
    .line 40
    new-instance v4, Lcom/google/android/gms/common/api/Scope;

    .line 41
    .line 42
    const-string v5, "email"

    .line 43
    .line 44
    .line 45
    invoke-direct {v4, v5}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    sput-object v4, Lcom/google/android/gms/signin/zad;->zaf:Lcom/google/android/gms/common/api/Scope;

    .line 48
    .line 49
    new-instance v4, Lcom/google/android/gms/common/api/Api;

    .line 50
    .line 51
    const-string v5, "SignIn.API"

    .line 52
    .line 53
    .line 54
    invoke-direct {v4, v5, v2, v0}, Lcom/google/android/gms/common/api/Api;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;Lcom/google/android/gms/common/api/Api$ClientKey;)V

    .line 55
    .line 56
    sput-object v4, Lcom/google/android/gms/signin/zad;->zag:Lcom/google/android/gms/common/api/Api;

    .line 57
    .line 58
    new-instance v0, Lcom/google/android/gms/common/api/Api;

    .line 59
    .line 60
    const-string v2, "SignIn.INTERNAL_API"

    .line 61
    .line 62
    .line 63
    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/gms/common/api/Api;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;Lcom/google/android/gms/common/api/Api$ClientKey;)V

    .line 64
    .line 65
    sput-object v0, Lcom/google/android/gms/signin/zad;->zah:Lcom/google/android/gms/common/api/Api;

    .line 66
    return-void
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
