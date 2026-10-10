.class public final synthetic Lcom/google/android/gms/internal/auth-api/zbx;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-auth@@21.1.1"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/RemoteCall;


# instance fields
.field public final synthetic zba:Lcom/google/android/gms/internal/auth-api/zbaa;

.field public final synthetic zbb:Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/auth-api/zbaa;Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/gms/internal/auth-api/zbx;->zba:Lcom/google/android/gms/internal/auth-api/zbaa;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/google/android/gms/internal/auth-api/zbx;->zbb:Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;

    .line 8
    return-void
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
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    .line 2
    check-cast p1, Lcom/google/android/gms/internal/auth-api/zbg;

    .line 3
    .line 4
    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 5
    .line 6
    new-instance v0, Lcom/google/android/gms/internal/auth-api/zbz;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/google/android/gms/internal/auth-api/zbx;->zba:Lcom/google/android/gms/internal/auth-api/zbaa;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lcom/google/android/gms/internal/auth-api/zbz;-><init>(Lcom/google/android/gms/internal/auth-api/zbaa;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/BaseGmsClient;->getService()Landroid/os/IInterface;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    check-cast p1, Lcom/google/android/gms/internal/auth-api/zbk;

    .line 18
    .line 19
    iget-object p2, p0, Lcom/google/android/gms/internal/auth-api/zbx;->zbb:Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;

    .line 20
    .line 21
    .line 22
    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    move-result-object p2

    .line 24
    .line 25
    check-cast p2, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/internal/auth-api/zbk;->zbc(Lcom/google/android/gms/internal/auth-api/zbj;Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;)V

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
.end method
