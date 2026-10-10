.class final Lcom/google/android/play/integrity/internal/ad;
.super Ljava/lang/Object;
.source "com.google.android.play:integrity@@1.3.0"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field final synthetic a:Lcom/google/android/play/integrity/internal/ae;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/play/integrity/internal/ae;Lcom/google/android/play/integrity/internal/ac;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/google/android/play/integrity/internal/ad;->a:Lcom/google/android/play/integrity/internal/ae;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/play/integrity/internal/ad;->a:Lcom/google/android/play/integrity/internal/ae;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/android/play/integrity/internal/ae;->f(Lcom/google/android/play/integrity/internal/ae;)Lcom/google/android/play/integrity/internal/s;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    const-string v1, "ServiceConnectionImpl.onServiceConnected(%s)"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, p1}, Lcom/google/android/play/integrity/internal/s;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 16
    .line 17
    new-instance p1, Lcom/google/android/play/integrity/internal/aa;

    .line 18
    .line 19
    .line 20
    invoke-direct {p1, p0, p2}, Lcom/google/android/play/integrity/internal/aa;-><init>(Lcom/google/android/play/integrity/internal/ad;Landroid/os/IBinder;)V

    .line 21
    .line 22
    iget-object p2, p0, Lcom/google/android/play/integrity/internal/ad;->a:Lcom/google/android/play/integrity/internal/ae;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Lcom/google/android/play/integrity/internal/ae;->c()Landroid/os/Handler;

    .line 26
    move-result-object p2

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 30
    return-void
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

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/play/integrity/internal/ad;->a:Lcom/google/android/play/integrity/internal/ae;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/android/play/integrity/internal/ae;->f(Lcom/google/android/play/integrity/internal/ae;)Lcom/google/android/play/integrity/internal/s;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    const-string v1, "ServiceConnectionImpl.onServiceDisconnected(%s)"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, p1}, Lcom/google/android/play/integrity/internal/s;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 16
    .line 17
    new-instance p1, Lcom/google/android/play/integrity/internal/ab;

    .line 18
    .line 19
    .line 20
    invoke-direct {p1, p0}, Lcom/google/android/play/integrity/internal/ab;-><init>(Lcom/google/android/play/integrity/internal/ad;)V

    .line 21
    .line 22
    iget-object v0, p0, Lcom/google/android/play/integrity/internal/ad;->a:Lcom/google/android/play/integrity/internal/ae;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/google/android/play/integrity/internal/ae;->c()Landroid/os/Handler;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 30
    return-void
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
.end method
