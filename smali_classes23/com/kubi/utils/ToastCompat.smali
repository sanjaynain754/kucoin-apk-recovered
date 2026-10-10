.class public final Lcom/kubi/utils/ToastCompat;
.super Ljava/lang/Object;
.source "ToastCompat.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/utils/ToastCompat$e;,
        Lcom/kubi/utils/ToastCompat$f;,
        Lcom/kubi/utils/ToastCompat$g;,
        Lcom/kubi/utils/ToastCompat$d;,
        Lcom/kubi/utils/ToastCompat$UtilsMaxWidthConstraintLayout;,
        Lcom/kubi/utils/ToastCompat$c;
    }
.end annotation


# static fields
.field public static final l:Lcom/kubi/utils/ToastCompat;

.field public static m:Lcom/kubi/utils/ToastCompat$e;


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:Z

.field public j:[Landroid/graphics/drawable/Drawable;

.field public k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/utils/ToastCompat;->q()Lcom/kubi/utils/ToastCompat;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sput-object v0, Lcom/kubi/utils/ToastCompat;->l:Lcom/kubi/utils/ToastCompat;

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

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, -0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/kubi/utils/ToastCompat;->b:I

    .line 7
    .line 8
    iput v0, p0, Lcom/kubi/utils/ToastCompat;->c:I

    .line 9
    .line 10
    iput v0, p0, Lcom/kubi/utils/ToastCompat;->d:I

    .line 11
    .line 12
    .line 13
    const v1, -0x1000001

    .line 14
    .line 15
    iput v1, p0, Lcom/kubi/utils/ToastCompat;->e:I

    .line 16
    .line 17
    iput v0, p0, Lcom/kubi/utils/ToastCompat;->f:I

    .line 18
    .line 19
    iput v1, p0, Lcom/kubi/utils/ToastCompat;->g:I

    .line 20
    .line 21
    iput v0, p0, Lcom/kubi/utils/ToastCompat;->h:I

    .line 22
    const/4 v0, 0x0

    .line 23
    .line 24
    iput-boolean v0, p0, Lcom/kubi/utils/ToastCompat;->i:Z

    .line 25
    const/4 v1, 0x4

    .line 26
    .line 27
    new-array v1, v1, [Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    iput-object v1, p0, Lcom/kubi/utils/ToastCompat;->j:[Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    iput-boolean v0, p0, Lcom/kubi/utils/ToastCompat;->k:Z

    .line 32
    return-void
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
.end method

.method public static varargs A(Landroid/view/Window;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1
    .param p0    # Landroid/view/Window;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-static {p1, p2}, Lcom/kubi/utils/ToastCompat;->I(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 4
    move-result-object p1

    .line 5
    const/4 p2, 0x1

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/utils/ToastCompat;->l:Lcom/kubi/utils/ToastCompat;

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1, p2, v0}, Lcom/kubi/utils/ToastCompat;->y(Landroid/view/Window;Ljava/lang/CharSequence;ILcom/kubi/utils/ToastCompat;)V

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

.method public static varargs B(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/utils/ToastCompat;->I(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x1

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/utils/ToastCompat;->l:Lcom/kubi/utils/ToastCompat;

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1, v0}, Lcom/kubi/utils/ToastCompat;->x(Ljava/lang/CharSequence;ILcom/kubi/utils/ToastCompat;)V

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

.method public static C(I)V
    .locals 2
    .param p0    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    new-array v1, v0, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v1}, Lcom/kubi/utils/ToastCompat;->H(I[Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 7
    move-result-object p0

    .line 8
    .line 9
    sget-object v1, Lcom/kubi/utils/ToastCompat;->l:Lcom/kubi/utils/ToastCompat;

    .line 10
    .line 11
    .line 12
    invoke-static {p0, v0, v1}, Lcom/kubi/utils/ToastCompat;->x(Ljava/lang/CharSequence;ILcom/kubi/utils/ToastCompat;)V

    .line 13
    return-void
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

.method public static varargs D(I[Ljava/lang/Object;)V
    .locals 1
    .param p0    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/utils/ToastCompat;->H(I[Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/utils/ToastCompat;->l:Lcom/kubi/utils/ToastCompat;

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1, v0}, Lcom/kubi/utils/ToastCompat;->x(Ljava/lang/CharSequence;ILcom/kubi/utils/ToastCompat;)V

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

.method public static varargs E(Landroid/view/Window;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1
    .param p0    # Landroid/view/Window;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-static {p1, p2}, Lcom/kubi/utils/ToastCompat;->I(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 4
    move-result-object p1

    .line 5
    const/4 p2, 0x0

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/utils/ToastCompat;->l:Lcom/kubi/utils/ToastCompat;

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1, p2, v0}, Lcom/kubi/utils/ToastCompat;->y(Landroid/view/Window;Ljava/lang/CharSequence;ILcom/kubi/utils/ToastCompat;)V

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

.method public static F(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    sget-object v1, Lcom/kubi/utils/ToastCompat;->l:Lcom/kubi/utils/ToastCompat;

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0, v1}, Lcom/kubi/utils/ToastCompat;->x(Ljava/lang/CharSequence;ILcom/kubi/utils/ToastCompat;)V

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
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static varargs G(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/utils/ToastCompat;->I(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/utils/ToastCompat;->l:Lcom/kubi/utils/ToastCompat;

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1, v0}, Lcom/kubi/utils/ToastCompat;->x(Ljava/lang/CharSequence;ILcom/kubi/utils/ToastCompat;)V

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

.method public static varargs H(I[Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 2

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lcom/blankj/utilcode/util/o0;->a()Landroid/app/Application;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    array-length v1, p1

    .line 16
    .line 17
    if-lez v1, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    return-object p0

    .line 27
    :cond_0
    return-object v0

    .line 28
    .line 29
    .line 30
    :catch_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 31
    move-result-object p0

    .line 32
    return-object p0
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

.method public static varargs I(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    .line 5
    const-string/jumbo p0, "toast null"

    .line 6
    return-object p0

    .line 7
    .line 8
    :cond_0
    if-eqz p1, :cond_1

    .line 9
    array-length v0, p1

    .line 10
    .line 11
    if-lez v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    move-result-object p0

    .line 16
    :cond_1
    return-object p0
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

.method public static synthetic a()Lcom/kubi/utils/ToastCompat$e;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/utils/ToastCompat;->m:Lcom/kubi/utils/ToastCompat$e;

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
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public static synthetic b(Lcom/kubi/utils/ToastCompat$e;)Lcom/kubi/utils/ToastCompat$e;
    .locals 0

    .line 1
    .line 2
    sput-object p0, Lcom/kubi/utils/ToastCompat;->m:Lcom/kubi/utils/ToastCompat$e;

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

.method public static synthetic c(Lcom/kubi/utils/ToastCompat;)Lcom/kubi/utils/ToastCompat$e;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/utils/ToastCompat;->r(Lcom/kubi/utils/ToastCompat;)Lcom/kubi/utils/ToastCompat$e;

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

.method public static synthetic d(Lcom/kubi/utils/ToastCompat;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/kubi/utils/ToastCompat;->h:I

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

.method public static synthetic e(Lcom/kubi/utils/ToastCompat;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/kubi/utils/ToastCompat;->f:I

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

.method public static synthetic f(Lcom/kubi/utils/ToastCompat;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/kubi/utils/ToastCompat;->e:I

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

.method public static synthetic g(Lcom/kubi/utils/ToastCompat;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/kubi/utils/ToastCompat;->b:I

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

.method public static synthetic h(Lcom/kubi/utils/ToastCompat;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/kubi/utils/ToastCompat;->c:I

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

.method public static synthetic i(Lcom/kubi/utils/ToastCompat;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/kubi/utils/ToastCompat;->d:I

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

.method public static synthetic j(Lcom/kubi/utils/ToastCompat;Ljava/lang/CharSequence;)Landroid/view/View;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/utils/ToastCompat;->J(Ljava/lang/CharSequence;)Landroid/view/View;

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

.method public static synthetic k(I)Landroid/view/View;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/utils/ToastCompat;->p(I)Landroid/view/View;

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

.method public static synthetic l(Lcom/kubi/utils/ToastCompat;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/kubi/utils/ToastCompat;->g:I

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

.method public static m()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/utils/ToastCompat;->m:Lcom/kubi/utils/ToastCompat$e;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lcom/kubi/utils/ToastCompat$e;->cancel()V

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    sput-object v0, Lcom/kubi/utils/ToastCompat;->m:Lcom/kubi/utils/ToastCompat$e;

    .line 11
    :cond_0
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

.method public static n()Lcom/kubi/utils/ToastCompat;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/utils/ToastCompat;->l:Lcom/kubi/utils/ToastCompat;

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
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public static o(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    .line 5
    const-string/jumbo p0, "toast null"

    .line 6
    return-object p0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    .line 15
    const-string/jumbo p0, "toast nothing"

    .line 16
    :cond_1
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static p(I)Landroid/view/View;
    .locals 2
    .param p0    # I
        .annotation build Landroidx/annotation/LayoutRes;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/blankj/utilcode/util/o0;->a()Landroid/app/Application;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    const-string/jumbo v1, "layout_inflater"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Landroid/view/LayoutInflater;

    .line 14
    const/4 v1, 0x0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

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

.method public static q()Lcom/kubi/utils/ToastCompat;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/utils/ToastCompat;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/utils/ToastCompat;-><init>()V

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
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public static r(Lcom/kubi/utils/ToastCompat;)Lcom/kubi/utils/ToastCompat$e;
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/utils/ToastCompat;->k:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/blankj/utilcode/util/o0;->a()Landroid/app/Application;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/core/app/NotificationManagerCompat;->areNotificationsEnabled()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lcom/blankj/utilcode/util/x;->a()Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    new-instance v0, Lcom/kubi/utils/ToastCompat$f;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, p0}, Lcom/kubi/utils/ToastCompat$f;-><init>(Lcom/kubi/utils/ToastCompat;)V

    .line 30
    return-object v0

    .line 31
    .line 32
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 33
    .line 34
    const/16 v1, 0x19

    .line 35
    .line 36
    if-ge v0, v1, :cond_1

    .line 37
    .line 38
    new-instance v0, Lcom/kubi/utils/ToastCompat$g;

    .line 39
    .line 40
    const/16 v1, 0x7d5

    .line 41
    .line 42
    .line 43
    invoke-direct {v0, p0, v1}, Lcom/kubi/utils/ToastCompat$g;-><init>(Lcom/kubi/utils/ToastCompat;I)V

    .line 44
    return-object v0

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-static {}, Lcom/blankj/utilcode/util/x;->a()Z

    .line 48
    move-result v1

    .line 49
    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    const/16 v1, 0x1a

    .line 53
    .line 54
    if-lt v0, v1, :cond_2

    .line 55
    .line 56
    new-instance v0, Lcom/kubi/utils/ToastCompat$g;

    .line 57
    .line 58
    const/16 v1, 0x7f6

    .line 59
    .line 60
    .line 61
    invoke-direct {v0, p0, v1}, Lcom/kubi/utils/ToastCompat$g;-><init>(Lcom/kubi/utils/ToastCompat;I)V

    .line 62
    goto :goto_0

    .line 63
    .line 64
    :cond_2
    new-instance v0, Lcom/kubi/utils/ToastCompat$g;

    .line 65
    .line 66
    const/16 v1, 0x7d2

    .line 67
    .line 68
    .line 69
    invoke-direct {v0, p0, v1}, Lcom/kubi/utils/ToastCompat$g;-><init>(Lcom/kubi/utils/ToastCompat;I)V

    .line 70
    .line 71
    :cond_3
    :goto_0
    new-instance v0, Lcom/kubi/utils/ToastCompat$d;

    .line 72
    .line 73
    .line 74
    invoke-direct {v0, p0}, Lcom/kubi/utils/ToastCompat$d;-><init>(Lcom/kubi/utils/ToastCompat;)V

    .line 75
    return-object v0
    .line 76
    .line 77
    .line 78
.end method

.method public static w(Landroid/view/View;Ljava/lang/CharSequence;ILcom/kubi/utils/ToastCompat;)V
    .locals 2
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "toast null"

    .line 4
    .line 5
    if-eq p1, v0, :cond_1

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "toast nothing"

    .line 9
    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {}, Lo00/g;->e()Ljava/util/concurrent/Executor;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    new-instance v1, Lcom/kubi/utils/ToastCompat$a;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, p3, p0, p1, p2}, Lcom/kubi/utils/ToastCompat$a;-><init>(Lcom/kubi/utils/ToastCompat;Landroid/view/View;Ljava/lang/CharSequence;I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 24
    return-void

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    const-string/jumbo p0, "text is null or empty"

    .line 28
    .line 29
    const-string p1, "ToastCompat"

    .line 30
    .line 31
    .line 32
    invoke-static {p0, p1}, Lv70/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    return-void
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
.end method

.method public static x(Ljava/lang/CharSequence;ILcom/kubi/utils/ToastCompat;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lcom/kubi/utils/ToastCompat;->o(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 5
    move-result-object p0

    .line 6
    .line 7
    .line 8
    invoke-static {v0, p0, p1, p2}, Lcom/kubi/utils/ToastCompat;->w(Landroid/view/View;Ljava/lang/CharSequence;ILcom/kubi/utils/ToastCompat;)V

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

.method public static y(Landroid/view/Window;Ljava/lang/CharSequence;ILcom/kubi/utils/ToastCompat;)V
    .locals 2
    .param p0    # Landroid/view/Window;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/kubi/utils/ToastCompat;->o(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    const-string/jumbo v0, "toast null"

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    .line 16
    const-string/jumbo v0, "toast nothing"

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    goto :goto_0

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-static {}, Lo00/g;->e()Ljava/util/concurrent/Executor;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    new-instance v1, Lcom/kubi/utils/ToastCompat$b;

    .line 30
    .line 31
    .line 32
    invoke-direct {v1, p3, p0, p1, p2}, Lcom/kubi/utils/ToastCompat$b;-><init>(Lcom/kubi/utils/ToastCompat;Landroid/view/Window;Ljava/lang/CharSequence;I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 36
    return-void

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    const-string/jumbo p0, "text is null or empty"

    .line 40
    .line 41
    const-string p1, "ToastCompat"

    .line 42
    .line 43
    .line 44
    invoke-static {p0, p1}, Lv70/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    return-void
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
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
.end method

.method public static z(I)V
    .locals 2
    .param p0    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    new-array v0, v0, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lcom/kubi/utils/ToastCompat;->H(I[Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 7
    move-result-object p0

    .line 8
    const/4 v0, 0x1

    .line 9
    .line 10
    sget-object v1, Lcom/kubi/utils/ToastCompat;->l:Lcom/kubi/utils/ToastCompat;

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v0, v1}, Lcom/kubi/utils/ToastCompat;->x(Ljava/lang/CharSequence;ILcom/kubi/utils/ToastCompat;)V

    .line 14
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


# virtual methods
.method public final J(Ljava/lang/CharSequence;)Landroid/view/View;
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/utils/ToastCompat;->a:Ljava/lang/String;

    .line 3
    .line 4
    const-string v1, "dark"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    const/4 v2, 0x3

    .line 10
    const/4 v3, 0x2

    .line 11
    const/4 v4, 0x1

    .line 12
    const/4 v5, 0x0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    .line 17
    const-string/jumbo v0, "light"

    .line 18
    .line 19
    iget-object v6, p0, Lcom/kubi/utils/ToastCompat;->a:Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Lcom/kubi/utils/ToastCompat;->j:[Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    aget-object v6, v0, v5

    .line 30
    .line 31
    if-nez v6, :cond_0

    .line 32
    .line 33
    aget-object v6, v0, v4

    .line 34
    .line 35
    if-nez v6, :cond_0

    .line 36
    .line 37
    aget-object v6, v0, v3

    .line 38
    .line 39
    if-nez v6, :cond_0

    .line 40
    .line 41
    aget-object v0, v0, v2

    .line 42
    .line 43
    if-nez v0, :cond_0

    .line 44
    const/4 p1, 0x0

    .line 45
    return-object p1

    .line 46
    .line 47
    :cond_0
    sget v0, Lcom/kubi/sdk/utils/R$layout;->toast_view:I

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Lcom/kubi/utils/ToastCompat;->p(I)Landroid/view/View;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    .line 54
    const v6, 0x102000b

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 58
    move-result-object v6

    .line 59
    .line 60
    check-cast v6, Landroid/widget/TextView;

    .line 61
    .line 62
    iget-object v7, p0, Lcom/kubi/utils/ToastCompat;->a:Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    move-result v1

    .line 67
    .line 68
    if-eqz v1, :cond_1

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 72
    move-result-object v1

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 76
    move-result-object v1

    .line 77
    .line 78
    check-cast v1, Landroid/graphics/drawable/GradientDrawable;

    .line 79
    .line 80
    const-string v7, "#BB000000"

    .line 81
    .line 82
    .line 83
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 84
    move-result v7

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 88
    const/4 v1, -0x1

    .line 89
    .line 90
    .line 91
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 92
    .line 93
    .line 94
    :cond_1
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    .line 96
    iget-object p1, p0, Lcom/kubi/utils/ToastCompat;->j:[Landroid/graphics/drawable/Drawable;

    .line 97
    .line 98
    aget-object p1, p1, v5

    .line 99
    .line 100
    if-eqz p1, :cond_2

    .line 101
    .line 102
    sget p1, Lcom/kubi/sdk/utils/R$id;->utvLeftIconView:I

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 106
    move-result-object p1

    .line 107
    .line 108
    iget-object v1, p0, Lcom/kubi/utils/ToastCompat;->j:[Landroid/graphics/drawable/Drawable;

    .line 109
    .line 110
    aget-object v1, v1, v5

    .line 111
    .line 112
    .line 113
    invoke-static {p1, v1}, Landroidx/core/view/ViewCompat;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 117
    .line 118
    :cond_2
    iget-object p1, p0, Lcom/kubi/utils/ToastCompat;->j:[Landroid/graphics/drawable/Drawable;

    .line 119
    .line 120
    aget-object p1, p1, v4

    .line 121
    .line 122
    if-eqz p1, :cond_3

    .line 123
    .line 124
    sget p1, Lcom/kubi/sdk/utils/R$id;->utvTopIconView:I

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 128
    move-result-object p1

    .line 129
    .line 130
    iget-object v1, p0, Lcom/kubi/utils/ToastCompat;->j:[Landroid/graphics/drawable/Drawable;

    .line 131
    .line 132
    aget-object v1, v1, v4

    .line 133
    .line 134
    .line 135
    invoke-static {p1, v1}, Landroidx/core/view/ViewCompat;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 139
    .line 140
    :cond_3
    iget-object p1, p0, Lcom/kubi/utils/ToastCompat;->j:[Landroid/graphics/drawable/Drawable;

    .line 141
    .line 142
    aget-object p1, p1, v3

    .line 143
    .line 144
    if-eqz p1, :cond_4

    .line 145
    .line 146
    sget p1, Lcom/kubi/sdk/utils/R$id;->utvRightIconView:I

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 150
    move-result-object p1

    .line 151
    .line 152
    iget-object v1, p0, Lcom/kubi/utils/ToastCompat;->j:[Landroid/graphics/drawable/Drawable;

    .line 153
    .line 154
    aget-object v1, v1, v3

    .line 155
    .line 156
    .line 157
    invoke-static {p1, v1}, Landroidx/core/view/ViewCompat;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 161
    .line 162
    :cond_4
    iget-object p1, p0, Lcom/kubi/utils/ToastCompat;->j:[Landroid/graphics/drawable/Drawable;

    .line 163
    .line 164
    aget-object p1, p1, v2

    .line 165
    .line 166
    if-eqz p1, :cond_5

    .line 167
    .line 168
    sget p1, Lcom/kubi/sdk/utils/R$id;->utvBottomIconView:I

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 172
    move-result-object p1

    .line 173
    .line 174
    iget-object v1, p0, Lcom/kubi/utils/ToastCompat;->j:[Landroid/graphics/drawable/Drawable;

    .line 175
    .line 176
    aget-object v1, v1, v2

    .line 177
    .line 178
    .line 179
    invoke-static {p1, v1}, Landroidx/core/view/ViewCompat;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 183
    :cond_5
    return-object v0
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public final s(I)Lcom/kubi/utils/ToastCompat;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/DrawableRes;
        .end annotation
    .end param

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/utils/ToastCompat;->f:I

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

.method public final t(III)Lcom/kubi/utils/ToastCompat;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/utils/ToastCompat;->b:I

    .line 3
    .line 4
    iput p2, p0, Lcom/kubi/utils/ToastCompat;->c:I

    .line 5
    .line 6
    iput p3, p0, Lcom/kubi/utils/ToastCompat;->d:I

    .line 7
    return-object p0
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

.method public final u(I)Lcom/kubi/utils/ToastCompat;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/utils/ToastCompat;->g:I

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

.method public final v(I)Lcom/kubi/utils/ToastCompat;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/utils/ToastCompat;->h:I

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
