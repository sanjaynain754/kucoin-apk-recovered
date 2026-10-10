.class final Lcom/google/android/play/core/integrity/bk;
.super Lcom/google/android/play/core/integrity/bi;
.source "com.google.android.play:integrity@@1.3.0"


# instance fields
.field final synthetic c:Lcom/google/android/play/core/integrity/bn;

.field private final d:Lcom/google/android/play/integrity/internal/s;

.field private final e:J


# direct methods
.method public constructor <init>(Lcom/google/android/play/core/integrity/bn;Lcom/google/android/gms/tasks/TaskCompletionSource;J)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/google/android/play/core/integrity/bk;->c:Lcom/google/android/play/core/integrity/bn;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1, p2}, Lcom/google/android/play/core/integrity/bi;-><init>(Lcom/google/android/play/core/integrity/bn;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 6
    .line 7
    new-instance p1, Lcom/google/android/play/integrity/internal/s;

    .line 8
    .line 9
    const-string p2, "OnRequestIntegrityTokenCallback"

    .line 10
    .line 11
    .line 12
    invoke-direct {p1, p2}, Lcom/google/android/play/integrity/internal/s;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    iput-object p1, p0, Lcom/google/android/play/core/integrity/bk;->d:Lcom/google/android/play/integrity/internal/s;

    .line 15
    .line 16
    iput-wide p3, p0, Lcom/google/android/play/core/integrity/bk;->e:J

    .line 17
    return-void
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
.end method

.method public static bridge synthetic f(Lcom/google/android/play/core/integrity/bk;)J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/google/android/play/core/integrity/bk;->e:J

    .line 3
    return-wide v0
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


# virtual methods
.method public final c(Landroid/os/Bundle;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/google/android/play/core/integrity/bi;->c(Landroid/os/Bundle;)V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/play/core/integrity/bk;->d:Lcom/google/android/play/integrity/internal/s;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    new-array v1, v1, [Ljava/lang/Object;

    .line 9
    .line 10
    const-string v2, "onRequestExpressIntegrityToken"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v2, v1}, Lcom/google/android/play/integrity/internal/s;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/play/core/integrity/bk;->c:Lcom/google/android/play/core/integrity/bn;

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lcom/google/android/play/core/integrity/bn;->g(Lcom/google/android/play/core/integrity/bn;)Lcom/google/android/play/core/integrity/k;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, p1}, Lcom/google/android/play/core/integrity/k;->a(Landroid/os/Bundle;)Lcom/google/android/gms/common/api/ApiException;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object p1, p0, Lcom/google/android/play/core/integrity/bi;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    .line 31
    return-void

    .line 32
    .line 33
    .line 34
    :cond_0
    const-string/jumbo v0, "request.token.sid"

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 38
    move-result-wide v0

    .line 39
    .line 40
    iget-object v2, p0, Lcom/google/android/play/core/integrity/bk;->c:Lcom/google/android/play/core/integrity/bn;

    .line 41
    .line 42
    new-instance v3, Lcom/google/android/play/core/integrity/bj;

    .line 43
    .line 44
    .line 45
    invoke-static {v2}, Lcom/google/android/play/core/integrity/bn;->j(Lcom/google/android/play/core/integrity/bn;)Ljava/lang/String;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    .line 49
    invoke-direct {v3, p0, v2, v0, v1}, Lcom/google/android/play/core/integrity/bj;-><init>(Lcom/google/android/play/core/integrity/bk;Ljava/lang/String;J)V

    .line 50
    .line 51
    iget-object v0, p0, Lcom/google/android/play/core/integrity/bi;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 52
    .line 53
    new-instance v1, Lcom/google/android/play/core/integrity/b;

    .line 54
    .line 55
    .line 56
    invoke-direct {v1}, Lcom/google/android/play/core/integrity/b;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string/jumbo v2, "token"

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, p1}, Lcom/google/android/play/core/integrity/bq;->b(Ljava/lang/String;)Lcom/google/android/play/core/integrity/bq;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v3}, Lcom/google/android/play/core/integrity/bq;->a(Lcom/google/android/play/core/integrity/y;)Lcom/google/android/play/core/integrity/bq;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Lcom/google/android/play/core/integrity/bq;->c()Lcom/google/android/play/core/integrity/br;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 77
    return-void
    .line 78
.end method
