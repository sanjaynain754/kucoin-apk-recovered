.class public Lai/advance/sdk/global/iqa/GlobalIQAActivity;
.super Lai/advance/sdk/global/iqa/d;
.source "SourceFile"

# interfaces
.implements Lai/advance/sdk/global/iqa/e;


# instance fields
.field public l:Lai/advance/sdk/global/iqa/c;

.field public m:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

.field public final n:Landroid/os/Handler;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HandlerLeak"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Landroidx/appcompat/app/AppCompatDelegate;->setCompatVectorFromResourcesEnabled(Z)V

    .line 5
    return-void
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

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lai/advance/sdk/global/iqa/d;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lai/advance/sdk/global/iqa/GlobalIQAActivity$a;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lai/advance/sdk/global/iqa/GlobalIQAActivity$a;-><init>(Lai/advance/sdk/global/iqa/GlobalIQAActivity;)V

    .line 9
    .line 10
    iput-object v0, p0, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->n:Landroid/os/Handler;

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

.method public static synthetic Q(Lai/advance/sdk/global/iqa/GlobalIQAActivity;)Lai/advance/sdk/global/iqa/c;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->l:Lai/advance/sdk/global/iqa/c;

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

.method public static synthetic R(Lai/advance/sdk/global/iqa/GlobalIQAActivity;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->U()V

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

.method public static synthetic S(Lai/advance/sdk/global/iqa/GlobalIQAActivity;)Landroid/os/Handler;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->n:Landroid/os/Handler;

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

.method public static synthetic T(Lai/advance/sdk/global/iqa/GlobalIQAActivity;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->V()V

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

.method private U()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/d;->P()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->X()V

    .line 7
    return-void
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

.method private V()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->l:Lai/advance/sdk/global/iqa/c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/c;->E()V

    .line 6
    .line 7
    new-instance v0, Ls/d$a;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ls/d$a;-><init>()V

    .line 11
    .line 12
    iget-object v1, p0, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->getInputCardSide()Lai/advance/sdk/global/iqa/lib/enums/CardSide;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ls/d$a;->b(Lai/advance/sdk/global/iqa/lib/enums/CardSide;)Ls/d$a;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    iget-object v1, p0, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->getInputCardType()Lai/advance/sdk/global/iqa/lib/enums/CardType;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ls/d$a;->c(Lai/advance/sdk/global/iqa/lib/enums/CardType;)Ls/d$a;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    iget-object v1, p0, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->getRegion()Ljava/lang/String;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ls/d$a;->d(Ljava/lang/String;)Ls/d$a;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    iget-object v1, p0, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 43
    .line 44
    iget-boolean v1, v1, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mSoundPlayEnable:Z

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ls/d$a;->f(Z)Ls/d$a;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    iget-object v1, p0, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->getTimeoutSeconds()I

    .line 54
    move-result v1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ls/d$a;->e(I)Ls/d$a;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ls/d$a;->a()Ls/d;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    iget-object v1, p0, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->m:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 65
    .line 66
    new-instance v2, Lai/advance/sdk/global/iqa/GlobalIQAActivity$d;

    .line 67
    .line 68
    .line 69
    invoke-direct {v2, p0}, Lai/advance/sdk/global/iqa/GlobalIQAActivity$d;-><init>(Lai/advance/sdk/global/iqa/GlobalIQAActivity;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v0, v2}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->q(Ls/d;Lu/e;)Ljava/lang/String;

    .line 73
    return-void
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
.end method

.method private W()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 3
    .line 4
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mIqaExtras:Lai/advance/sdk/global/iqa/lib/IQAExtras;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/IQAExtras;->getMode()Lai/advance/sdk/global/iqa/lib/enums/Mode;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    sget-object v1, Lai/advance/sdk/global/iqa/lib/enums/Mode;->TAKE_PHOTO:Lai/advance/sdk/global/iqa/lib/enums/Mode;

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->X()V

    .line 16
    return-void

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-direct {p0}, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->V()V

    .line 20
    return-void
.end method


# virtual methods
.method public bridge synthetic K()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lai/advance/sdk/global/iqa/d;->K()V

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

.method public bridge synthetic M()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lai/advance/sdk/global/iqa/d;->M()I

    .line 4
    move-result v0

    .line 5
    return v0
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

.method public O()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->W()V

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

.method public X()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ls/e$b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ls/e$b;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->getInputCardSide()Lai/advance/sdk/global/iqa/lib/enums/CardSide;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ls/e$b;->b(Lai/advance/sdk/global/iqa/lib/enums/CardSide;)Ls/e$b;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    iget-object v1, p0, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->getInputCardType()Lai/advance/sdk/global/iqa/lib/enums/CardType;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ls/e$b;->c(Lai/advance/sdk/global/iqa/lib/enums/CardType;)Ls/e$b;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    iget-object v1, p0, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->getRegion()Ljava/lang/String;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ls/e$b;->d(Ljava/lang/String;)Ls/e$b;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ls/e$b;->a()Ls/e;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    iget-object v1, p0, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->l:Lai/advance/sdk/global/iqa/c;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Lai/advance/sdk/global/iqa/c;->F()V

    .line 45
    .line 46
    iget-object v1, p0, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->m:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 47
    .line 48
    new-instance v2, Lai/advance/sdk/global/iqa/GlobalIQAActivity$e;

    .line 49
    .line 50
    .line 51
    invoke-direct {v2, p0}, Lai/advance/sdk/global/iqa/GlobalIQAActivity$e;-><init>(Lai/advance/sdk/global/iqa/GlobalIQAActivity;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v0, v2}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->p(Ls/e;Lu/d;)Ljava/lang/String;

    .line 55
    return-void
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
.end method

.method public a()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->onBackPressed()V

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

.method public b()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->m:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->i()V

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
.end method

.method public c()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->m:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 3
    .line 4
    new-instance v1, Lai/advance/sdk/global/iqa/GlobalIQAActivity$c;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Lai/advance/sdk/global/iqa/GlobalIQAActivity$c;-><init>(Lai/advance/sdk/global/iqa/GlobalIQAActivity;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->u(Lu/g;)V

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

.method public d()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->m:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 3
    .line 4
    new-instance v1, Lai/advance/sdk/global/iqa/GlobalIQAActivity$b;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Lai/advance/sdk/global/iqa/GlobalIQAActivity$b;-><init>(Lai/advance/sdk/global/iqa/GlobalIQAActivity;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->r(Lu/f;)V

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

.method public finish()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lai/advance/sdk/global/iqa/d;->finish()V

    .line 4
    .line 5
    iget-object v0, p0, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->m:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->k()V

    .line 9
    return-void
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

.method public onBackPressed()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->m:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->j(Z)V

    .line 7
    .line 8
    .line 9
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    .line 10
    return-void
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

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lai/advance/sdk/global/iqa/d;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    sget p1, Lai/advance/sdk/global/iqa/R$layout;->activity_global_iqa:I

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setContentView(I)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Ls/a;->c()V

    .line 12
    .line 13
    new-instance p1, Lai/advance/sdk/global/iqa/c;

    .line 14
    .line 15
    .line 16
    invoke-direct {p1, p0}, Lai/advance/sdk/global/iqa/c;-><init>(Lai/advance/sdk/global/iqa/GlobalIQAActivity;)V

    .line 17
    .line 18
    iput-object p1, p0, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->l:Lai/advance/sdk/global/iqa/c;

    .line 19
    .line 20
    iget-object p1, p1, Lai/advance/sdk/global/iqa/c;->c:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 21
    .line 22
    iput-object p1, p0, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->m:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->K()V

    .line 26
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

.method public onDestroy()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->n:Landroid/os/Handler;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 7
    .line 8
    iget-object v0, p0, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->l:Lai/advance/sdk/global/iqa/c;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/c;->z()V

    .line 12
    .line 13
    .line 14
    invoke-super {p0}, Lai/advance/sdk/global/iqa/d;->onDestroy()V

    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public onPause()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    .line 4
    .line 5
    iget-object v0, p0, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->m:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->l()V

    .line 9
    return-void
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

.method public bridge synthetic onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 0
    .param p2    # [Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3}, Lai/advance/sdk/global/iqa/d;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

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

.method public onRestart()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/app/Activity;->onRestart()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lai/advance/core/PermissionActivity;->G()Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->m:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->m()V

    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public onResume()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    .line 4
    .line 5
    iget-object v0, p0, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->m:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->n()V

    .line 9
    return-void
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

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lai/advance/sdk/global/iqa/d;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 4
    .line 5
    iget-object p1, p0, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->m:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->o()V

    .line 9
    return-void
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

.method public onStop()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStop()V

    .line 4
    .line 5
    iget-object v0, p0, Lai/advance/sdk/global/iqa/GlobalIQAActivity;->l:Lai/advance/sdk/global/iqa/c;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/c;->L()V

    .line 9
    return-void
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
