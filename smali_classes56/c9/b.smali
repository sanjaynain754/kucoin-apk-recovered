.class public Lc9/b;
.super Ljava/lang/Object;
.source "CameraInstance.java"


# static fields
.field public static final n:Ljava/lang/String; = "b"


# instance fields
.field public a:Lc9/d;

.field public b:Lc9/c;

.field public c:Lcom/journeyapps/barcodescanner/camera/a;

.field public d:Landroid/os/Handler;

.field public e:Lc9/f;

.field public f:Z

.field public g:Z

.field public h:Landroid/os/Handler;

.field public i:Lcom/journeyapps/barcodescanner/camera/CameraSettings;

.field public j:Ljava/lang/Runnable;

.field public k:Ljava/lang/Runnable;

.field public l:Ljava/lang/Runnable;

.field public m:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lc9/b;->f:Z

    .line 7
    const/4 v0, 0x1

    .line 8
    .line 9
    iput-boolean v0, p0, Lc9/b;->g:Z

    .line 10
    .line 11
    new-instance v0, Lcom/journeyapps/barcodescanner/camera/CameraSettings;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0}, Lcom/journeyapps/barcodescanner/camera/CameraSettings;-><init>()V

    .line 15
    .line 16
    iput-object v0, p0, Lc9/b;->i:Lcom/journeyapps/barcodescanner/camera/CameraSettings;

    .line 17
    .line 18
    new-instance v0, Lc9/b$c;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p0}, Lc9/b$c;-><init>(Lc9/b;)V

    .line 22
    .line 23
    iput-object v0, p0, Lc9/b;->j:Ljava/lang/Runnable;

    .line 24
    .line 25
    new-instance v0, Lc9/b$d;

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, p0}, Lc9/b$d;-><init>(Lc9/b;)V

    .line 29
    .line 30
    iput-object v0, p0, Lc9/b;->k:Ljava/lang/Runnable;

    .line 31
    .line 32
    new-instance v0, Lc9/b$e;

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, p0}, Lc9/b$e;-><init>(Lc9/b;)V

    .line 36
    .line 37
    iput-object v0, p0, Lc9/b;->l:Ljava/lang/Runnable;

    .line 38
    .line 39
    new-instance v0, Lc9/b$f;

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, p0}, Lc9/b$f;-><init>(Lc9/b;)V

    .line 43
    .line 44
    iput-object v0, p0, Lc9/b;->m:Ljava/lang/Runnable;

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lb9/o;->a()V

    .line 48
    .line 49
    .line 50
    invoke-static {}, Lc9/d;->d()Lc9/d;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    iput-object v0, p0, Lc9/b;->a:Lc9/d;

    .line 54
    .line 55
    new-instance v0, Lcom/journeyapps/barcodescanner/camera/a;

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, p1}, Lcom/journeyapps/barcodescanner/camera/a;-><init>(Landroid/content/Context;)V

    .line 59
    .line 60
    iput-object v0, p0, Lc9/b;->c:Lcom/journeyapps/barcodescanner/camera/a;

    .line 61
    .line 62
    iget-object p1, p0, Lc9/b;->i:Lcom/journeyapps/barcodescanner/camera/CameraSettings;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p1}, Lcom/journeyapps/barcodescanner/camera/a;->n(Lcom/journeyapps/barcodescanner/camera/CameraSettings;)V

    .line 66
    .line 67
    new-instance p1, Landroid/os/Handler;

    .line 68
    .line 69
    .line 70
    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 71
    .line 72
    iput-object p1, p0, Lc9/b;->h:Landroid/os/Handler;

    .line 73
    return-void
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

.method public static synthetic a(Lc9/b;)Lcom/journeyapps/barcodescanner/camera/a;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lc9/b;->c:Lcom/journeyapps/barcodescanner/camera/a;

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
    .line 24
.end method

.method public static synthetic b(Lc9/b;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lc9/b;->f:Z

    .line 3
    return p0
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
    .line 24
.end method

.method public static synthetic c()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lc9/b;->n:Ljava/lang/String;

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

.method public static synthetic d(Lc9/b;)Lc9/d;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lc9/b;->a:Lc9/d;

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
    .line 24
.end method

.method public static synthetic e(Lc9/b;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lc9/b;->o(Ljava/lang/Exception;)V

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
.end method

.method public static synthetic f(Lc9/b;)Landroid/os/Handler;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lc9/b;->d:Landroid/os/Handler;

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
    .line 24
.end method

.method public static synthetic g(Lc9/b;)Lb9/m;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lc9/b;->m()Lb9/m;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 24
.end method

.method public static synthetic h(Lc9/b;)Lc9/c;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lc9/b;->b:Lc9/c;

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
    .line 24
.end method

.method public static synthetic i(Lc9/b;Z)Z
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lc9/b;->g:Z

    .line 3
    return p1
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
.end method


# virtual methods
.method public j()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lb9/o;->a()V

    .line 4
    .line 5
    iget-boolean v0, p0, Lc9/b;->f:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lc9/b;->a:Lc9/d;

    .line 10
    .line 11
    iget-object v1, p0, Lc9/b;->m:Ljava/lang/Runnable;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lc9/d;->c(Ljava/lang/Runnable;)V

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x1

    .line 17
    .line 18
    iput-boolean v0, p0, Lc9/b;->g:Z

    .line 19
    :goto_0
    const/4 v0, 0x0

    .line 20
    .line 21
    iput-boolean v0, p0, Lc9/b;->f:Z

    .line 22
    return-void
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
.end method

.method public k()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lb9/o;->a()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lc9/b;->x()V

    .line 7
    .line 8
    iget-object v0, p0, Lc9/b;->a:Lc9/d;

    .line 9
    .line 10
    iget-object v1, p0, Lc9/b;->k:Ljava/lang/Runnable;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lc9/d;->c(Ljava/lang/Runnable;)V

    .line 14
    return-void
    .line 15
    .line 16
.end method

.method public l()Lc9/f;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lc9/b;->e:Lc9/f;

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

.method public final m()Lb9/m;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lc9/b;->c:Lcom/journeyapps/barcodescanner/camera/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/camera/a;->g()Lb9/m;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public n()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lc9/b;->g:Z

    .line 3
    return v0
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

.method public final o(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lc9/b;->d:Landroid/os/Handler;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget v1, Lcom/google/zxing/client/android/R$id;->zxing_camera_error:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 14
    :cond_0
    return-void
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

.method public p()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lb9/o;->a()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput-boolean v0, p0, Lc9/b;->f:Z

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    iput-boolean v0, p0, Lc9/b;->g:Z

    .line 10
    .line 11
    iget-object v0, p0, Lc9/b;->a:Lc9/d;

    .line 12
    .line 13
    iget-object v1, p0, Lc9/b;->j:Ljava/lang/Runnable;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lc9/d;->e(Ljava/lang/Runnable;)V

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
.end method

.method public q(Lc9/i;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lc9/b;->h:Landroid/os/Handler;

    .line 3
    .line 4
    new-instance v1, Lc9/b$b;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lc9/b$b;-><init>(Lc9/b;Lc9/i;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    return-void
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

.method public r(Lcom/journeyapps/barcodescanner/camera/CameraSettings;)V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lc9/b;->f:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lc9/b;->i:Lcom/journeyapps/barcodescanner/camera/CameraSettings;

    .line 7
    .line 8
    iget-object v0, p0, Lc9/b;->c:Lcom/journeyapps/barcodescanner/camera/a;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/journeyapps/barcodescanner/camera/a;->n(Lcom/journeyapps/barcodescanner/camera/CameraSettings;)V

    .line 12
    :cond_0
    return-void
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

.method public s(Lc9/f;)V
    .locals 1

    .line 1
    .line 2
    iput-object p1, p0, Lc9/b;->e:Lc9/f;

    .line 3
    .line 4
    iget-object v0, p0, Lc9/b;->c:Lcom/journeyapps/barcodescanner/camera/a;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/journeyapps/barcodescanner/camera/a;->p(Lc9/f;)V

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
.end method

.method public t(Landroid/os/Handler;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lc9/b;->d:Landroid/os/Handler;

    .line 3
    return-void
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
    .line 24
.end method

.method public u(Lc9/c;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lc9/b;->b:Lc9/c;

    .line 3
    return-void
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
    .line 24
.end method

.method public v(Z)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lb9/o;->a()V

    .line 4
    .line 5
    iget-boolean v0, p0, Lc9/b;->f:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lc9/b;->a:Lc9/d;

    .line 10
    .line 11
    new-instance v1, Lc9/b$a;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, p0, p1}, Lc9/b$a;-><init>(Lc9/b;Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lc9/d;->c(Ljava/lang/Runnable;)V

    .line 18
    :cond_0
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public w()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lb9/o;->a()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lc9/b;->x()V

    .line 7
    .line 8
    iget-object v0, p0, Lc9/b;->a:Lc9/d;

    .line 9
    .line 10
    iget-object v1, p0, Lc9/b;->l:Ljava/lang/Runnable;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lc9/d;->c(Ljava/lang/Runnable;)V

    .line 14
    return-void
    .line 15
    .line 16
.end method

.method public final x()V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lc9/b;->f:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 8
    .line 9
    const-string v1, "CameraInstance is not open"

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    throw v0
    .line 14
    .line 15
    .line 16
.end method
