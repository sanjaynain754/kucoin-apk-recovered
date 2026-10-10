.class public final Lcom/hcaptcha/sdk/HCaptcha;
.super Lv8/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv8/f<",
        "Lcom/hcaptcha/sdk/l;",
        ">;"
    }
.end annotation


# instance fields
.field public final i:Landroid/app/Activity;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public j:Lcom/hcaptcha/sdk/o;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public k:Lcom/hcaptcha/sdk/HCaptchaConfig;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public final l:Lcom/hcaptcha/sdk/HCaptchaInternalConfig;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/hcaptcha/sdk/HCaptchaInternalConfig;)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/hcaptcha/sdk/HCaptchaInternalConfig;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lv8/f;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptcha;->i:Landroid/app/Activity;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/hcaptcha/sdk/HCaptcha;->l:Lcom/hcaptcha/sdk/HCaptchaInternalConfig;

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
    .line 46
    .line 47
.end method

.method public static synthetic l(Lcom/hcaptcha/sdk/HCaptcha;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lv8/f;->d()V

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

.method public static synthetic m(Lcom/hcaptcha/sdk/HCaptcha;J)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lv8/f;->h(J)V

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

.method public static synthetic n(Lcom/hcaptcha/sdk/HCaptcha;)Landroid/os/Handler;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lv8/f;->h:Landroid/os/Handler;

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

.method public static synthetic o(Lcom/hcaptcha/sdk/HCaptcha;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lv8/f;->j(Ljava/lang/Object;)V

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

.method public static synthetic p(Lcom/hcaptcha/sdk/HCaptcha;Lcom/hcaptcha/sdk/HCaptchaException;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lv8/f;->i(Lcom/hcaptcha/sdk/HCaptchaException;)V

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

.method public static q(Landroid/app/Activity;)Lcom/hcaptcha/sdk/HCaptcha;
    .locals 2
    .param p0    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    new-instance v0, Lcom/hcaptcha/sdk/HCaptcha;

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lcom/hcaptcha/sdk/HCaptchaInternalConfig;->builder()Lcom/hcaptcha/sdk/HCaptchaInternalConfig$a;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/hcaptcha/sdk/HCaptchaInternalConfig$a;->a()Lcom/hcaptcha/sdk/HCaptchaInternalConfig;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, Lcom/hcaptcha/sdk/HCaptcha;-><init>(Landroid/app/Activity;Lcom/hcaptcha/sdk/HCaptchaInternalConfig;)V

    .line 14
    return-object v0
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
.method public r(Lcom/hcaptcha/sdk/HCaptchaConfig;)Lcom/hcaptcha/sdk/HCaptcha;
    .locals 4
    .param p1    # Lcom/hcaptcha/sdk/HCaptchaConfig;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getDiagnosticLog()Ljava/lang/Boolean;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    sput-boolean v0, Lcom/hcaptcha/sdk/k;->a:Z

    .line 11
    .line 12
    new-instance v0, Lcom/hcaptcha/sdk/HCaptcha$1;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p0, p1}, Lcom/hcaptcha/sdk/HCaptcha$1;-><init>(Lcom/hcaptcha/sdk/HCaptcha;Lcom/hcaptcha/sdk/HCaptchaConfig;)V

    .line 16
    .line 17
    :try_start_0
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getHideDialog()Ljava/lang/Boolean;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 25
    move-result v1

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->toBuilder()Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    sget-object v1, Lcom/hcaptcha/sdk/HCaptchaSize;->INVISIBLE:Lcom/hcaptcha/sdk/HCaptchaSize;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v1}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->u(Lcom/hcaptcha/sdk/HCaptchaSize;)Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v1}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->l(Ljava/lang/Boolean;)Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->c()Lcom/hcaptcha/sdk/HCaptchaConfig;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptcha;->k:Lcom/hcaptcha/sdk/HCaptchaConfig;

    .line 50
    .line 51
    new-instance v1, Lcom/hcaptcha/sdk/f;

    .line 52
    .line 53
    iget-object v2, p0, Lcom/hcaptcha/sdk/HCaptcha;->i:Landroid/app/Activity;

    .line 54
    .line 55
    iget-object v3, p0, Lcom/hcaptcha/sdk/HCaptcha;->l:Lcom/hcaptcha/sdk/HCaptchaInternalConfig;

    .line 56
    .line 57
    .line 58
    invoke-direct {v1, v2, p1, v3, v0}, Lcom/hcaptcha/sdk/f;-><init>(Landroid/app/Activity;Lcom/hcaptcha/sdk/HCaptchaConfig;Lcom/hcaptcha/sdk/HCaptchaInternalConfig;Lcom/hcaptcha/sdk/HCaptchaStateListener;)V

    .line 59
    .line 60
    iput-object v1, p0, Lcom/hcaptcha/sdk/HCaptcha;->j:Lcom/hcaptcha/sdk/o;

    .line 61
    return-object p0

    .line 62
    .line 63
    :cond_0
    iget-object v1, p0, Lcom/hcaptcha/sdk/HCaptcha;->i:Landroid/app/Activity;

    .line 64
    .line 65
    instance-of v2, v1, Landroidx/fragment/app/FragmentActivity;

    .line 66
    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    iget-object v2, p0, Lcom/hcaptcha/sdk/HCaptcha;->l:Lcom/hcaptcha/sdk/HCaptchaInternalConfig;

    .line 70
    .line 71
    .line 72
    invoke-static {v1, p1, v2, v0}, Lcom/hcaptcha/sdk/HCaptchaDialogFragment;->h3(Landroid/content/Context;Lcom/hcaptcha/sdk/HCaptchaConfig;Lcom/hcaptcha/sdk/HCaptchaInternalConfig;Lcom/hcaptcha/sdk/HCaptchaStateListener;)Lcom/hcaptcha/sdk/HCaptchaDialogFragment;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    iput-object v1, p0, Lcom/hcaptcha/sdk/HCaptcha;->j:Lcom/hcaptcha/sdk/o;

    .line 76
    .line 77
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptcha;->k:Lcom/hcaptcha/sdk/HCaptchaConfig;

    .line 78
    return-object p0

    .line 79
    .line 80
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    const-string v1, "Visual hCaptcha challenge verification requires FragmentActivity."

    .line 83
    .line 84
    .line 85
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 86
    throw p1
    :try_end_0
    .catch Landroid/util/AndroidRuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    .line 88
    :catch_0
    new-instance p1, Lcom/hcaptcha/sdk/HCaptchaException;

    .line 89
    .line 90
    sget-object v1, Lcom/hcaptcha/sdk/HCaptchaError;->ERROR:Lcom/hcaptcha/sdk/HCaptchaError;

    .line 91
    .line 92
    .line 93
    invoke-direct {p1, v1}, Lcom/hcaptcha/sdk/HCaptchaException;-><init>(Lcom/hcaptcha/sdk/HCaptchaError;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, p1}, Lcom/hcaptcha/sdk/HCaptcha$1;->onFailure(Lcom/hcaptcha/sdk/HCaptchaException;)V

    .line 97
    return-object p0
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

.method public final s()Lcom/hcaptcha/sdk/HCaptcha;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lcom/hcaptcha/sdk/HCaptcha;->t(Lcom/hcaptcha/sdk/HCaptchaVerifyParams;)Lcom/hcaptcha/sdk/HCaptcha;

    .line 5
    move-result-object v0

    .line 6
    return-object v0
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

.method public final t(Lcom/hcaptcha/sdk/HCaptchaVerifyParams;)Lcom/hcaptcha/sdk/HCaptcha;
    .locals 2
    .param p1    # Lcom/hcaptcha/sdk/HCaptchaVerifyParams;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const-string v0, " with params"

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    const-string v0, ""

    .line 8
    .line 9
    :goto_0
    const-string v1, "HCaptcha.startVerification"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    iget-object v0, p0, Lv8/f;->h:Landroid/os/Handler;

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 19
    .line 20
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptcha;->j:Lcom/hcaptcha/sdk/o;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    new-instance p1, Lcom/hcaptcha/sdk/HCaptchaException;

    .line 25
    .line 26
    sget-object v0, Lcom/hcaptcha/sdk/HCaptchaError;->ERROR:Lcom/hcaptcha/sdk/HCaptchaError;

    .line 27
    .line 28
    .line 29
    invoke-direct {p1, v0}, Lcom/hcaptcha/sdk/HCaptchaException;-><init>(Lcom/hcaptcha/sdk/HCaptchaError;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lv8/f;->i(Lcom/hcaptcha/sdk/HCaptchaException;)V

    .line 33
    return-object p0

    .line 34
    .line 35
    :cond_1
    iget-object v1, p0, Lcom/hcaptcha/sdk/HCaptcha;->i:Landroid/app/Activity;

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v1, p1}, Lcom/hcaptcha/sdk/o;->h(Landroid/app/Activity;Lcom/hcaptcha/sdk/HCaptchaVerifyParams;)V

    .line 39
    return-object p0
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public u(Lcom/hcaptcha/sdk/HCaptchaConfig;)Lcom/hcaptcha/sdk/HCaptcha;
    .locals 1
    .param p1    # Lcom/hcaptcha/sdk/HCaptchaConfig;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptcha;->j:Lcom/hcaptcha/sdk/o;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptcha;->k:Lcom/hcaptcha/sdk/HCaptchaConfig;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->equals(Ljava/lang/Object;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0, p1}, Lcom/hcaptcha/sdk/HCaptcha;->r(Lcom/hcaptcha/sdk/HCaptchaConfig;)Lcom/hcaptcha/sdk/HCaptcha;

    .line 16
    .line 17
    .line 18
    :cond_1
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptcha;->s()Lcom/hcaptcha/sdk/HCaptcha;

    .line 19
    move-result-object p1

    .line 20
    return-object p1
    .line 21
    .line 22
    .line 23
    .line 24
.end method
