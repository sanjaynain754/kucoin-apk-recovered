.class public La3d20260409/oOOOOOooooOo;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lwe0/h;


# instance fields
.field public b:La3d20260409/o0o00;

.field public c:La3d20260409/a20260409View;

.field public d:La3d20260409/OOOoooooo;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, La3d20260409/oOOOOOooooOo;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La3d20260409/oOOOOOooooOo;->e:Ljava/lang/Object;

    const/4 p2, -0x1

    invoke-virtual {p0, p2}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance p2, La3d20260409/o0o00;

    invoke-direct {p2, p1}, La3d20260409/o0o00;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, La3d20260409/oOOOOOooooOo;->b:La3d20260409/o0o00;

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance p2, La3d20260409/a20260409View;

    invoke-direct {p2, p1}, La3d20260409/a20260409View;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, La3d20260409/oOOOOOooooOo;->c:La3d20260409/a20260409View;

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p1, p0, La3d20260409/oOOOOOooooOo;->b:La3d20260409/o0o00;

    invoke-virtual {p1, p0}, La3d20260409/o0o00;->setFaceCaptureCallback(Lwe0/h;)V

    return-void
.end method

.method public static synthetic b(La3d20260409/oOOOOOooooOo;La3d20260409/OOOoooooo;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La3d20260409/oOOOOOooooOo;->f(La3d20260409/OOOoooooo;Ljava/lang/String;)V

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
    .line 105
.end method

.method public static synthetic c(Ljava/lang/String;)Lg/c;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, La3d20260409/oOOOOOooooOo;->d(Ljava/lang/String;)Lg/c;

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

.method public static synthetic d(Ljava/lang/String;)Lg/c;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lg/c$b;

    .line 3
    .line 4
    const-string v1, "close_bk_cam"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lg/c$b;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string/jumbo v1, "source"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, p0}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 14
    move-result-object p0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lg/c$b;->d()Lg/c;

    .line 18
    move-result-object p0

    .line 19
    return-object p0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private e()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lintl/oOooooooo0000000000;->oOoOOOOOooooo:Lintl/oOooooooo0000000000;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, La3d20260409/v;->r(Lintl/oOooooooo0000000000;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    :try_start_0
    new-instance v0, La3d20260409/OOOoooooo;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, La3d20260409/OOOoooooo;-><init>(Landroid/content/Context;)V

    .line 19
    .line 20
    iput-object v0, p0, La3d20260409/oOOOOOooooOo;->d:La3d20260409/OOOoooooo;

    .line 21
    .line 22
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 23
    const/4 v1, 0x1

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 27
    .line 28
    iget-object v1, p0, La3d20260409/oOOOOOooooOo;->d:La3d20260409/OOOoooooo;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 32
    .line 33
    iget-object v0, p0, La3d20260409/oOOOOOooooOo;->d:La3d20260409/OOOoooooo;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 37
    .line 38
    iget-object v0, p0, La3d20260409/oOOOOOooooOo;->b:La3d20260409/o0o00;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, La3d20260409/o0o00;->getSessionData()Lg/e;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    iget-object v1, p0, La3d20260409/oOOOOOooooOo;->d:La3d20260409/OOOoooooo;

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Lg/e;->b(Lg/e;)Lg/e;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    new-instance v2, La3d20260409/oOOOOOooooOo$b;

    .line 51
    .line 52
    .line 53
    invoke-direct {v2, p0}, La3d20260409/oOOOOOooooOo$b;-><init>(La3d20260409/oOOOOOooooOo;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v0, v2}, La3d20260409/OOOoooooo;->H0(Lg/e;La3d20260409/OOOoooooo$a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    return-void

    .line 58
    :catch_0
    move-exception v0

    .line 59
    .line 60
    .line 61
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v0}, Lf/h;->H(Ljava/lang/Throwable;)V

    .line 66
    :goto_0
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
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
.end method

.method public static synthetic g(La3d20260409/oOOOOOooooOo;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, La3d20260409/oOOOOOooooOo;->e()V

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
.end method

.method public static synthetic h(La3d20260409/oOOOOOooooOo;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, La3d20260409/oOOOOOooooOo;->i(Ljava/lang/String;)V

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
.end method


# virtual methods
.method public a(Lintl/o0oOOOOOooooo;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/oOOOOOooooOo;->c:La3d20260409/a20260409View;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, La3d20260409/a20260409View;->e(Lintl/o0oOOOOOooooo;)V

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

.method public final synthetic f(La3d20260409/OOOoooooo;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 4
    .line 5
    iget-object p1, p0, La3d20260409/oOOOOOooooOo;->b:La3d20260409/o0o00;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    new-instance v0, La3d20260409/r;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p2}, La3d20260409/r;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    iget-object p2, p0, La3d20260409/oOOOOOooooOo;->b:La3d20260409/o0o00;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, La3d20260409/o0o00;->getSessionData()Lg/e;

    .line 22
    move-result-object p2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0, p2}, Lf/h;->F(Lg/a;Lg/e;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    :catch_0
    :cond_0
    return-void
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

.method public getCurrentDetectionType()Laai/liveness/Detector$DetectionType;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/oOOOOOooooOo;->b:La3d20260409/o0o00;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, La3d20260409/o0o00;->getCurrentDetectionType()Laai/liveness/Detector$DetectionType;

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
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public final i(Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, La3d20260409/oOOOOOooooOo;->e:Ljava/lang/Object;

    .line 3
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    :try_start_1
    iget-object v1, p0, La3d20260409/oOOOOOooooOo;->d:La3d20260409/OOOoooooo;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    iput-object v2, p0, La3d20260409/oOOOOOooooOo;->d:La3d20260409/OOOoooooo;

    .line 11
    .line 12
    new-instance v2, La3d20260409/q;

    .line 13
    .line 14
    .line 15
    invoke-direct {v2, p0, v1, p1}, La3d20260409/q;-><init>(La3d20260409/oOOOOOooooOo;La3d20260409/OOOoooooo;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Lai/advance/common/camera/GuardianCameraViewV3;->P(Lai/advance/common/camera/GuardianCameraViewV2$h;)V

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    :try_start_2
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 26
    :catch_0
    return-void
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
.end method

.method public j(Le/b;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/oOOOOOooooOo;->b:La3d20260409/o0o00;

    .line 3
    .line 4
    new-instance v1, La3d20260409/oOOOOOooooOo$c;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, La3d20260409/oOOOOOooooOo$c;-><init>(La3d20260409/oOOOOOooooOo;Le/b;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, La3d20260409/o0o00;->f1(Le/b;)V

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

.method public k()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/oOOOOOooooOo;->b:La3d20260409/o0o00;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, La3d20260409/o0o00;->T0()Z

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public l()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/oOOOOOooooOo;->b:La3d20260409/o0o00;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lai/advance/common/camera/GuardianCameraViewV2;->Z()Z

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public m()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/oOOOOOooooOo;->b:La3d20260409/o0o00;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, La3d20260409/o0o00;->l1()Z

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public n()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/oOOOOOooooOo;->b:La3d20260409/o0o00;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, La3d20260409/o0o00;->a0()V

    .line 6
    .line 7
    const-string v0, "destroy"

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, La3d20260409/oOOOOOooooOo;->i(Ljava/lang/String;)V

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
.end method

.method public o(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/oOOOOOooooOo;->c:La3d20260409/a20260409View;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, La3d20260409/a20260409View;->f(Ljava/lang/String;)V

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

.method public p()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/oOOOOOooooOo;->b:La3d20260409/o0o00;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, La3d20260409/o0o00;->D1()V

    .line 6
    .line 7
    iget-object v0, p0, La3d20260409/oOOOOOooooOo;->c:La3d20260409/a20260409View;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, La3d20260409/a20260409View;->h()V

    .line 11
    .line 12
    .line 13
    const-string/jumbo v0, "pause"

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, La3d20260409/oOOOOOooooOo;->i(Ljava/lang/String;)V

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
.end method

.method public q()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, La3d20260409/oOOOOOooooOo;->k()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, La3d20260409/oOOOOOooooOo;->b:La3d20260409/o0o00;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, La3d20260409/o0o00;->E1()V

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
.end method

.method public r(IZJ)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/oOOOOOooooOo;->b:La3d20260409/o0o00;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3, p4}, Lai/advance/common/camera/GuardianCameraViewV2;->c0(IZJ)V

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
    .line 105
.end method

.method public setFrameCallback(Lwe0/a;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/oOOOOOooooOo;->b:La3d20260409/o0o00;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, La3d20260409/o0o00;->setFrameCallback(Lwe0/a;)V

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

.method public setLivenssCallback(Le/a;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/oOOOOOooooOo;->b:La3d20260409/o0o00;

    .line 3
    .line 4
    new-instance v1, La3d20260409/oOOOOOooooOo$a;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, La3d20260409/oOOOOOooooOo$a;-><init>(La3d20260409/oOOOOOooooOo;Le/a;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, La3d20260409/o0o00;->setLivenssCallback(Le/a;)V

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

.method public setMaskColor(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/oOOOOOooooOo;->c:La3d20260409/a20260409View;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, La3d20260409/a20260409View;->c(I)V

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

.method public setModelResultCallback(Lwe0/j;)V
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setOvalColor(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/oOOOOOooooOo;->c:La3d20260409/a20260409View;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, La3d20260409/a20260409View;->O0OOOoOooo(I)V

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

.method public setOvalNormalColor(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/oOOOOOooooOo;->c:La3d20260409/a20260409View;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, La3d20260409/a20260409View;->OOOoooooo(I)V

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

.method public setPrepareMillSeconds(J)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/oOOOOOooooOo;->b:La3d20260409/o0o00;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, La3d20260409/o0o00;->setPrepareMillSeconds(J)V

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

.method public setSoundPlayEnable(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/oOOOOOooooOo;->b:La3d20260409/o0o00;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lai/advance/common/camera/GuardianCameraViewV2;->setSoundPlayEnable(Z)V

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

.method public setVisibility(I)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, La3d20260409/oOOOOOooooOo;->b:La3d20260409/o0o00;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 8
    .line 9
    iget-object v0, p0, La3d20260409/oOOOOOooooOo;->c:La3d20260409/a20260409View;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    .line 15
    .line 16
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
