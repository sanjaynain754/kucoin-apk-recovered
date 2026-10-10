.class public Ls/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Lai/advance/sdk/global/iqa/lib/g;

.field public final d:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

.field public final e:Landroid/content/Context;

.field public final f:Landroid/os/Handler;

.field public final g:Ljava/util/concurrent/ExecutorService;

.field public h:I

.field public i:J

.field public j:Z

.field public k:I

.field public l:Lh/b;

.field public m:I

.field public n:Lu/f;

.field public o:[B

.field public volatile p:Z

.field public q:Landroid/graphics/Bitmap;

.field public r:Ls/o0;


# direct methods
.method public constructor <init>(Lai/advance/sdk/global/iqa/lib/GlobalIQAView;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-string v0, "SUCCESS"

    .line 6
    .line 7
    iput-object v0, p0, Ls/x;->a:Ljava/lang/String;

    .line 8
    .line 9
    const-string v0, "NO_IMAGE_CAPTURED"

    .line 10
    .line 11
    iput-object v0, p0, Ls/x;->b:Ljava/lang/String;

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    iput v0, p0, Ls/x;->k:I

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    iput-object v1, p0, Ls/x;->l:Lh/b;

    .line 18
    .line 19
    iput v0, p0, Ls/x;->m:I

    .line 20
    .line 21
    iput-object v1, p0, Ls/x;->o:[B

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    iput-object v0, p0, Ls/x;->e:Landroid/content/Context;

    .line 28
    .line 29
    iput-object p1, p0, Ls/x;->d:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 30
    .line 31
    iget-object p1, p1, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->b:Lai/advance/sdk/global/iqa/lib/g;

    .line 32
    .line 33
    iput-object p1, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 34
    .line 35
    new-instance p1, Landroid/os/Handler;

    .line 36
    .line 37
    .line 38
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    .line 42
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 43
    .line 44
    iput-object p1, p0, Ls/x;->f:Landroid/os/Handler;

    .line 45
    const/4 p1, 0x3

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    iput-object p1, p0, Ls/x;->g:Ljava/util/concurrent/ExecutorService;

    .line 52
    return-void
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

.method public static synthetic B(Ls/x;[B)[B
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Ls/x;->o:[B

    .line 3
    return-object p1
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
.end method

.method public static synthetic C(Ls/x;)Lai/advance/sdk/global/iqa/lib/g;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

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

.method public static synthetic D(Ljava/lang/String;)Lg/d;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lg/d$b;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "upload_image_data_prepare_finished"

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lg/d$b;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    const-string v1, "BITMAP_IS_NULL"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lg/d$b;->b(Ljava/lang/Object;)Lg/d$b;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lg/d$b;->e(Ljava/lang/Object;)Lg/d$b;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lg/d$b;->m()Lg/d;

    .line 22
    move-result-object p0

    .line 23
    return-object p0
    .line 24
.end method

.method public static synthetic G(Ls/x;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ls/x;->t(Landroid/graphics/Bitmap;)V

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

.method public static synthetic H(Ls/x;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Ls/x;->q:Landroid/graphics/Bitmap;

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

.method public static synthetic I(Ljava/lang/String;)Lg/d;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lg/d$b;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "upload_image_data_prepare_finished"

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lg/d$b;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    const-string v1, "BITMAP_IS_RECYCLED"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lg/d$b;->b(Ljava/lang/Object;)Lg/d$b;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lg/d$b;->e(Ljava/lang/Object;)Lg/d$b;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lg/d$b;->m()Lg/d;

    .line 22
    move-result-object p0

    .line 23
    return-object p0
    .line 24
.end method

.method public static synthetic K(Ljava/lang/String;)Lg/d;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lg/d$b;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "upload_image_data_prepare_finished"

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lg/d$b;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    const-string v1, "DETECTOR_IS_NULL"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lg/d$b;->b(Ljava/lang/Object;)Lg/d$b;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lg/d$b;->e(Ljava/lang/Object;)Lg/d$b;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lg/d$b;->m()Lg/d;

    .line 22
    move-result-object p0

    .line 23
    return-object p0
    .line 24
.end method

.method public static synthetic L(Ls/x;)Lu/f;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Ls/x;->n:Lu/f;

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

.method public static synthetic O(Ls/x;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ls/x;->a0()V

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

.method public static synthetic P(Ls/x;)Ls/o0;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Ls/x;->r:Ls/o0;

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

.method public static synthetic R(Ls/x;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Ls/x;->h:I

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

.method public static synthetic T(Ls/x;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ls/x;->N()I

    .line 4
    move-result p0

    .line 5
    return p0
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

.method public static synthetic W(Ls/x;)[B
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Ls/x;->o:[B

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

.method public static synthetic X()Lg/d;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lg/d$b;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "upload_image_data_prepare_finished"

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lg/d$b;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    const-string v1, "SUCCESS"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lg/d$b;->b(Ljava/lang/Object;)Lg/d$b;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lg/d$b;->m()Lg/d;

    .line 18
    move-result-object v0

    .line 19
    return-object v0
    .line 20
.end method

.method public static synthetic Y(Ls/x;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Ls/x;->p:Z

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

.method public static synthetic a(Lorg/json/JSONObject;Ljava/lang/String;)Lg/d;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Ls/x;->l(Lorg/json/JSONObject;Ljava/lang/String;)Lg/d;

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

.method public static synthetic b(Lai/advance/common/entity/BaseResultEntity;Lu/g;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Ls/x;->s(Lai/advance/common/entity/BaseResultEntity;Lu/g;Ljava/lang/String;)V

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

.method public static synthetic c(Z)Lg/d;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Ls/x;->m(Z)Lg/d;

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

.method public static synthetic d(Ljava/lang/String;)Lg/d;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Ls/x;->K(Ljava/lang/String;)Lg/d;

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

.method public static synthetic e()Lg/d;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ls/x;->X()Lg/d;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public static synthetic f(Ljava/lang/String;)Lg/d;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Ls/x;->I(Ljava/lang/String;)Lg/d;

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

.method public static synthetic g(Ljava/lang/String;)Lg/d;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Ls/x;->D(Ljava/lang/String;)Lg/d;

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

.method public static synthetic h(Ls/x;Landroid/graphics/Bitmap;Lu/g;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ls/x;->u(Landroid/graphics/Bitmap;Lu/g;)V

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

.method public static synthetic i(Ls/x;)Landroid/content/Context;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Ls/x;->e:Landroid/content/Context;

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

.method public static synthetic j(Ls/x;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Ls/x;->q:Landroid/graphics/Bitmap;

    .line 3
    return-object p1
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
.end method

.method public static k([BILai/advance/sdk/global/iqa/lib/data/CropParams;ZZI)Landroid/graphics/Bitmap;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    return-object v0

    .line 5
    .line 6
    :cond_0
    if-eqz p2, :cond_3

    .line 7
    .line 8
    new-instance v1, Landroid/graphics/YuvImage;

    .line 9
    .line 10
    iget v4, p2, Lai/advance/sdk/global/iqa/lib/data/CropParams;->previewWidth:I

    .line 11
    .line 12
    iget v5, p2, Lai/advance/sdk/global/iqa/lib/data/CropParams;->previewHeight:I

    .line 13
    .line 14
    const/16 v3, 0x11

    .line 15
    const/4 v6, 0x0

    .line 16
    move-object v2, p0

    .line 17
    .line 18
    .line 19
    invoke-direct/range {v1 .. v6}, Landroid/graphics/YuvImage;-><init>([BIII[I)V

    .line 20
    .line 21
    new-instance p0, Ljava/io/ByteArrayOutputStream;

    .line 22
    .line 23
    .line 24
    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 25
    .line 26
    iget-object p2, p2, Lai/advance/sdk/global/iqa/lib/data/CropParams;->cropRect:Landroid/graphics/Rect;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->getCompressQuality()I

    .line 30
    move-result v0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p2, v0, p0}, Landroid/graphics/YuvImage;->compressToJpeg(Landroid/graphics/Rect;ILjava/io/OutputStream;)Z

    .line 34
    .line 35
    new-instance p2, Landroid/graphics/BitmapFactory$Options;

    .line 36
    .line 37
    .line 38
    invoke-direct {p2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 39
    .line 40
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 41
    .line 42
    iput-object v0, p2, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 43
    .line 44
    .line 45
    invoke-static {p0, p2}, Lk/a;->d(Ljava/io/ByteArrayOutputStream;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 50
    move-result p0

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 54
    move-result p2

    .line 55
    .line 56
    .line 57
    invoke-static {p0, p2}, Ljava/lang/Math;->min(II)I

    .line 58
    move-result p0

    .line 59
    .line 60
    if-gt p0, p1, :cond_1

    .line 61
    .line 62
    .line 63
    invoke-static {v1, p3, p4, p5}, Ls/n;->a(Landroid/graphics/Bitmap;ZZI)Landroid/graphics/Bitmap;

    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    .line 67
    :cond_1
    new-instance v6, Landroid/graphics/Matrix;

    .line 68
    .line 69
    .line 70
    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    .line 71
    int-to-float p0, p1

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 75
    move-result p1

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 79
    move-result p2

    .line 80
    .line 81
    .line 82
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 83
    move-result p1

    .line 84
    int-to-float p1, p1

    .line 85
    div-float/2addr p0, p1

    .line 86
    .line 87
    .line 88
    invoke-virtual {v6, p0, p0}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 92
    move-result v4

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 96
    move-result v5

    .line 97
    const/4 v3, 0x0

    .line 98
    const/4 v7, 0x1

    .line 99
    const/4 v2, 0x0

    .line 100
    .line 101
    .line 102
    invoke-static/range {v1 .. v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 103
    move-result-object p0

    .line 104
    .line 105
    if-eq p0, v1, :cond_2

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 109
    .line 110
    .line 111
    :cond_2
    invoke-static {p0, p3, p4, p5}, Ls/n;->a(Landroid/graphics/Bitmap;ZZI)Landroid/graphics/Bitmap;

    .line 112
    move-result-object p0

    .line 113
    return-object p0

    .line 114
    :cond_3
    return-object v0
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
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
.end method

.method public static synthetic l(Lorg/json/JSONObject;Ljava/lang/String;)Lg/d;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lg/d$b;

    .line 3
    .line 4
    const-string v1, "auto_focus_called"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lg/d$b;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Lg/d$b;->j(Lorg/json/JSONObject;)Lg/d$b;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lg/d$b;->e(Ljava/lang/Object;)Lg/d$b;

    .line 15
    move-result-object p0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lg/d$b;->m()Lg/d;

    .line 19
    move-result-object p0

    .line 20
    return-object p0
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

.method public static synthetic m(Z)Lg/d;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lg/d$b;

    .line 3
    .line 4
    const-string v1, "back_pressed"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lg/d$b;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Lg/d$b;->e(Ljava/lang/Object;)Lg/d$b;

    .line 15
    move-result-object p0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lg/d$b;->m()Lg/d;

    .line 19
    move-result-object p0

    .line 20
    return-object p0
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static synthetic s(Lai/advance/common/entity/BaseResultEntity;Lu/g;Ljava/lang/String;)V
    .locals 9

    .line 1
    .line 2
    iget-boolean v0, p0, Lai/advance/common/entity/BaseResultEntity;->success:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 7
    .line 8
    iget-object v1, p0, Lai/advance/common/entity/BaseResultEntity;->data:Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    const-string v1, "IDVID"

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    :goto_0
    move-object v7, v0

    .line 19
    goto :goto_1

    .line 20
    :catch_0
    :cond_0
    const/4 v0, 0x0

    .line 21
    goto :goto_0

    .line 22
    .line 23
    :goto_1
    new-instance v1, Lt/c;

    .line 24
    .line 25
    iget-boolean v2, p0, Lai/advance/common/entity/BaseResultEntity;->success:Z

    .line 26
    .line 27
    iget-object v3, p0, Lai/advance/common/entity/BaseResultEntity;->code:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v4, p0, Lai/advance/common/entity/BaseResultEntity;->message:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v6, p0, Lai/advance/common/entity/BaseResultEntity;->transactionId:Ljava/lang/String;

    .line 32
    .line 33
    iget-object p0, p0, Lai/advance/common/entity/BaseResultEntity;->pricingStrategy:Ljava/lang/String;

    .line 34
    .line 35
    const-string v0, "PAY"

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    move-result v8

    .line 40
    move-object v5, p2

    .line 41
    .line 42
    .line 43
    invoke-direct/range {v1 .. v8}, Lt/c;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p1, v1}, Lu/g;->b(Lt/c;)V

    .line 47
    return-void
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

.method public static synthetic y(Ls/x;Landroid/graphics/Bitmap;Lu/g;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ls/x;->F(Landroid/graphics/Bitmap;Lu/g;)V

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


# virtual methods
.method public A(Lu/g;)V
    .locals 1
    .param p1    # Lu/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Ls/x;->r:Ls/o0;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ls/o0;->u()Ls/g;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iget-boolean v0, v0, Ls/g;->d:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Ls/x;->q:Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0, p1}, Ls/x;->F(Landroid/graphics/Bitmap;Lu/g;)V

    .line 19
    return-void

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_0
    const-string/jumbo p1, "usePhoto"

    .line 23
    .line 24
    const-string v0, "Use photo failed,scan mode"

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1, v0}, Ls/x;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    return-void
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

.method public E()V
    .locals 1

    .line 1
    .line 2
    const-string v0, "clearQueue"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ls/x;->v(Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Ls/x;->r:Ls/o0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ls/o0;->j()V

    .line 13
    :cond_0
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public final F(Landroid/graphics/Bitmap;Lu/g;)V
    .locals 10
    .param p2    # Lu/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ls/c1;->R()Ls/c1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    const-string/jumbo v1, "upload_image_data_prepare_started"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lf/f;->M(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p2}, Lu/g;->d()V

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-static {}, Ls/c1;->R()Ls/c1;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    new-instance v0, Ls/p;

    .line 22
    .line 23
    const-string v1, "Bitmap is null"

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1}, Ls/p;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lf/f;->L(Lg/a;)V

    .line 30
    .line 31
    new-instance v2, Lt/c;

    .line 32
    .line 33
    sget-object p1, Lai/advance/sdk/global/iqa/lib/code/ErrorCode;->NO_BEST_IMAGE:Lai/advance/sdk/global/iqa/lib/code/ErrorCode;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 37
    move-result-object v4

    .line 38
    const/4 v8, 0x0

    .line 39
    const/4 v9, 0x0

    .line 40
    const/4 v3, 0x0

    .line 41
    .line 42
    const-string v5, "Bitmap is null"

    .line 43
    const/4 v6, 0x0

    .line 44
    const/4 v7, 0x0

    .line 45
    .line 46
    .line 47
    invoke-direct/range {v2 .. v9}, Lt/c;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p2, v2}, Lu/g;->b(Lt/c;)V

    .line 51
    return-void

    .line 52
    .line 53
    .line 54
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 55
    move-result v0

    .line 56
    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    .line 60
    invoke-static {}, Ls/c1;->R()Ls/c1;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    new-instance v0, Ls/q;

    .line 64
    .line 65
    const-string v1, "Bitmap is recycled"

    .line 66
    .line 67
    .line 68
    invoke-direct {v0, v1}, Ls/q;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0}, Lf/f;->L(Lg/a;)V

    .line 72
    .line 73
    new-instance v2, Lt/c;

    .line 74
    .line 75
    sget-object p1, Lai/advance/sdk/global/iqa/lib/code/ErrorCode;->NO_BEST_IMAGE:Lai/advance/sdk/global/iqa/lib/code/ErrorCode;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 79
    move-result-object v4

    .line 80
    const/4 v8, 0x0

    .line 81
    const/4 v9, 0x0

    .line 82
    const/4 v3, 0x0

    .line 83
    .line 84
    const-string v5, "Bitmap is recycled"

    .line 85
    const/4 v6, 0x0

    .line 86
    const/4 v7, 0x0

    .line 87
    .line 88
    .line 89
    invoke-direct/range {v2 .. v9}, Lt/c;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 90
    .line 91
    .line 92
    invoke-interface {p2, v2}, Lu/g;->b(Lt/c;)V

    .line 93
    return-void

    .line 94
    .line 95
    :cond_1
    iget-object v0, p0, Ls/x;->r:Ls/o0;

    .line 96
    .line 97
    if-nez v0, :cond_2

    .line 98
    .line 99
    .line 100
    invoke-static {}, Ls/c1;->R()Ls/c1;

    .line 101
    move-result-object p1

    .line 102
    .line 103
    new-instance v0, Ls/r;

    .line 104
    .line 105
    const-string v1, "Detector is not initialized"

    .line 106
    .line 107
    .line 108
    invoke-direct {v0, v1}, Ls/r;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v0}, Lf/f;->L(Lg/a;)V

    .line 112
    .line 113
    .line 114
    const-string/jumbo p1, "requestUploadImageApi"

    .line 115
    .line 116
    const-string v0, "Detector is null"

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, p1, v0}, Ls/x;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    new-instance v1, Lt/c;

    .line 122
    const/4 v7, 0x0

    .line 123
    const/4 v8, 0x0

    .line 124
    const/4 v2, 0x0

    .line 125
    .line 126
    const-string v3, "NOT_INIT_DETECTOR"

    .line 127
    .line 128
    const-string v4, "Detector is not initialized"

    .line 129
    const/4 v5, 0x0

    .line 130
    const/4 v6, 0x0

    .line 131
    .line 132
    .line 133
    invoke-direct/range {v1 .. v8}, Lt/c;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 134
    .line 135
    .line 136
    invoke-interface {p2, v1}, Lu/g;->b(Lt/c;)V

    .line 137
    return-void

    .line 138
    .line 139
    .line 140
    :cond_2
    invoke-static {}, Ls/c1;->R()Ls/c1;

    .line 141
    move-result-object v0

    .line 142
    .line 143
    new-instance v1, Ls/s;

    .line 144
    .line 145
    .line 146
    invoke-direct {v1}, Ls/s;-><init>()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v1}, Lf/f;->L(Lg/a;)V

    .line 150
    .line 151
    iget-object v0, p0, Ls/x;->g:Ljava/util/concurrent/ExecutorService;

    .line 152
    .line 153
    new-instance v1, Ls/t;

    .line 154
    .line 155
    .line 156
    invoke-direct {v1, p0, p1, p2}, Ls/t;-><init>(Ls/x;Landroid/graphics/Bitmap;Lu/g;)V

    .line 157
    .line 158
    .line 159
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 160
    return-void
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
.end method

.method public final J()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v1, "mCameraView is "

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    iget-object v1, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    .line 18
    const-string/jumbo v1, "null"

    .line 19
    goto :goto_0

    .line 20
    .line 21
    .line 22
    :cond_0
    const-string/jumbo v1, "not null"

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    const-string v1, "closeCamera"

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v1, v0}, Ls/x;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    iget-object v0, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/g;->O()V

    .line 42
    :cond_1
    return-void
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

.method public M()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "destroy"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ls/x;->v(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ls/x;->b0()V

    .line 9
    .line 10
    iget-object v0, p0, Ls/x;->f:Landroid/os/Handler;

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 15
    .line 16
    iget-object v0, p0, Ls/x;->l:Lh/b;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lh/b;->e()V

    .line 22
    :cond_0
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
.end method

.method public final N()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ls/x;->r:Ls/o0;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {v0}, Ls/o0;->u()Ls/g;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_1
    iget v0, v0, Ls/g;->k:I

    .line 15
    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->getOutputPictureMinSize()I

    .line 20
    move-result v0

    .line 21
    :cond_2
    return v0
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
.end method

.method public final Q()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ls/x;->r:Ls/o0;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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

.method public S()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lai/advance/common/camera/GuardianCameraViewV2;->X()Z

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
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

.method public U()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/g;->J0()Z

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
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

.method public V()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/g;->K0()Z

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
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

.method public Z()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Ls/x;->r:Ls/o0;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "notUsePhoto"

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ls/o0;->u()Ls/g;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    iget-boolean v0, v0, Ls/g;->d:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    goto :goto_0

    .line 17
    .line 18
    :cond_0
    const-string v0, "Not use photo"

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1, v0}, Ls/x;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    const/4 v0, 0x0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ls/x;->t(Landroid/graphics/Bitmap;)V

    .line 26
    .line 27
    iget-object v0, p0, Ls/x;->r:Ls/o0;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ls/o0;->M()V

    .line 33
    :cond_1
    return-void

    .line 34
    .line 35
    :cond_2
    :goto_0
    const-string v0, "Use photo failed,scan mode"

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v1, v0}, Ls/x;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    return-void
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

.method public final a0()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v1, "mCameraView is "

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    iget-object v1, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    .line 18
    const-string/jumbo v1, "null"

    .line 19
    goto :goto_0

    .line 20
    .line 21
    .line 22
    :cond_0
    const-string/jumbo v1, "not null"

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    const-string/jumbo v1, "restartCamera"

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v1, v0}, Ls/x;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    iget-object v0, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/g;->e0()V

    .line 43
    :cond_1
    return-void
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

.method public b0()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v1, "mDetector is "

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    iget-object v1, p0, Ls/x;->r:Ls/o0;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    .line 18
    const-string/jumbo v1, "null"

    .line 19
    goto :goto_0

    .line 20
    .line 21
    .line 22
    :cond_0
    const-string/jumbo v1, "not null"

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    const-string/jumbo v1, "stopDetection"

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v1, v0}, Ls/x;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Ls/x;->J()V

    .line 39
    .line 40
    iget-object v0, p0, Ls/x;->r:Ls/o0;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ls/o0;->N()V

    .line 46
    .line 47
    iget-object v0, p0, Ls/x;->r:Ls/o0;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ls/o0;->J()V

    .line 51
    :cond_1
    return-void
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

.method public c0()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v1, "mCameraView is "

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    iget-object v1, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    .line 18
    const-string/jumbo v1, "null"

    .line 19
    goto :goto_0

    .line 20
    .line 21
    .line 22
    :cond_0
    const-string/jumbo v1, "not null"

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    const-string/jumbo v1, "toggleLight"

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v1, v0}, Ls/x;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    iget-object v0, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/g;->N0()V

    .line 43
    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    const-string v2, "Toggle light "

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Ls/x;->U()Z

    .line 56
    move-result v2

    .line 57
    .line 58
    if-eqz v2, :cond_1

    .line 59
    .line 60
    .line 61
    const-string/jumbo v2, "on"

    .line 62
    goto :goto_1

    .line 63
    .line 64
    .line 65
    :cond_1
    const-string/jumbo v2, "off"

    .line 66
    .line 67
    .line 68
    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    move-result-object v0

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v1, v0}, Ls/x;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    :cond_2
    return-void
    .line 77
    .line 78
    .line 79
    .line 80
.end method

.method public d0(Z)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ls/c1;->R()Ls/c1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Ls/u;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p1}, Ls/u;-><init>(Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lf/f;->L(Lg/a;)V

    .line 13
    .line 14
    sget-object p1, Lai/advance/sdk/global/iqa/lib/code/ErrorCode;->USER_GIVE_UP:Lai/advance/sdk/global/iqa/lib/code/ErrorCode;

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Ls/a;->o(Lai/advance/sdk/global/iqa/lib/code/ErrorCode;)V

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public e0()V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "onRestart"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ls/x;->v(Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lai/advance/common/camera/GuardianCameraViewV3;->M()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ls/x;->f0()V

    .line 20
    :cond_0
    return-void
.end method

.method public f0()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/g;->e0()V

    .line 8
    :cond_0
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
.end method

.method public g0(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Ls/x;->h:I

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

.method public h0()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-wide v2, p0, Ls/x;->i:J

    .line 7
    sub-long/2addr v0, v2

    .line 8
    .line 9
    const-wide/16 v2, 0x1f4

    .line 10
    .line 11
    cmp-long v0, v0, v2

    .line 12
    .line 13
    if-gez v0, :cond_0

    .line 14
    goto :goto_0

    .line 15
    .line 16
    .line 17
    :cond_0
    const-string/jumbo v0, "transformCamera"

    .line 18
    .line 19
    const-string v1, "Transform camera"

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0, v1}, Ls/x;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    iget-object v0, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    :goto_0
    return-void

    .line 28
    :cond_1
    const/4 v1, 0x1

    .line 29
    .line 30
    iput-boolean v1, p0, Ls/x;->j:Z

    .line 31
    const/4 v1, 0x0

    .line 32
    .line 33
    iput-boolean v1, v0, Lai/advance/sdk/global/iqa/lib/g;->F:Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Ls/x;->E()V

    .line 37
    .line 38
    iget-object v0, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lai/advance/common/camera/GuardianCameraViewV2;->k0()V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 45
    move-result-wide v2

    .line 46
    .line 47
    iput-wide v2, p0, Ls/x;->i:J

    .line 48
    .line 49
    iput-boolean v1, p0, Ls/x;->j:Z

    .line 50
    return-void
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

.method public n(Ls/d;Lu/c;)Ljava/lang/String;
    .locals 8
    .param p1    # Ls/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lu/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    new-instance v0, Ls/g$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ls/g$a;-><init>()V

    .line 6
    .line 7
    iget-object v1, p1, Ls/d;->b:Lai/advance/sdk/global/iqa/lib/enums/CardSide;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ls/g$a;->c(Lai/advance/sdk/global/iqa/lib/enums/CardSide;)Ls/g$a;

    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ls/g$a;->g(Z)Ls/g$a;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iget-object v2, p1, Ls/d;->a:Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ls/g$a;->i(Ljava/lang/String;)Ls/g$a;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    iget-object v2, p1, Ls/d;->c:Lai/advance/sdk/global/iqa/lib/enums/CardType;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ls/g$a;->d(Lai/advance/sdk/global/iqa/lib/enums/CardType;)Ls/g$a;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    iget v2, p1, Ls/d;->e:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ls/g$a;->h(I)Ls/g$a;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    iget-object v2, p1, Ls/d;->d:Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ls/g$a;->a(Ljava/lang/String;)Ls/g$a;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    iget v2, p1, Ls/d;->g:I

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ls/g$a;->j(I)Ls/g$a;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    iget-object v2, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Lai/advance/sdk/global/iqa/lib/g;->getCameraId()I

    .line 52
    move-result v2

    .line 53
    const/4 v3, 0x0

    .line 54
    .line 55
    if-ne v2, v1, :cond_0

    .line 56
    move v2, v1

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    move v2, v3

    .line 59
    .line 60
    .line 61
    :goto_0
    invoke-virtual {v0, v2}, Ls/g$a;->f(Z)Ls/g$a;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    iget-object v2, p0, Ls/x;->e:Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    invoke-static {v2}, Ls/n;->e(Landroid/content/Context;)I

    .line 68
    move-result v2

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v2}, Ls/g$a;->k(I)Ls/g$a;

    .line 72
    move-result-object v0

    .line 73
    .line 74
    .line 75
    invoke-static {}, Lk/j;->c()Ljava/lang/String;

    .line 76
    move-result-object v2

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v2}, Ls/g$a;->e(Ljava/lang/String;)Ls/g$a;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ls/g$a;->b()Ls/g;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    iget v2, p0, Ls/x;->k:I

    .line 87
    add-int/2addr v2, v1

    .line 88
    .line 89
    iput v2, p0, Ls/x;->k:I

    .line 90
    .line 91
    iget-object v1, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 95
    const/4 v1, 0x0

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, v1}, Ls/x;->t(Landroid/graphics/Bitmap;)V

    .line 99
    .line 100
    iget-boolean p1, p1, Ls/d;->f:Z

    .line 101
    .line 102
    if-eqz p1, :cond_1

    .line 103
    .line 104
    new-instance p1, Lh/b;

    .line 105
    .line 106
    iget-object v1, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 110
    move-result-object v1

    .line 111
    .line 112
    .line 113
    invoke-direct {p1, v1}, Lh/b;-><init>(Landroid/content/Context;)V

    .line 114
    .line 115
    iput-object p1, p0, Ls/x;->l:Lh/b;

    .line 116
    .line 117
    :cond_1
    new-instance v7, Ls/i;

    .line 118
    .line 119
    const-string p1, "camera"

    .line 120
    .line 121
    .line 122
    invoke-direct {v7, p1}, Ls/i;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 126
    move-result-wide v4

    .line 127
    .line 128
    new-instance v2, Ls/x$a;

    .line 129
    move-object v3, p0

    .line 130
    move-object v6, p2

    .line 131
    .line 132
    .line 133
    invoke-direct/range {v2 .. v7}, Ls/x$a;-><init>(Ls/x;JLu/c;Ls/i;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Ls/x;->Q()Z

    .line 137
    move-result p1

    .line 138
    .line 139
    .line 140
    const-string/jumbo p2, "startDetectionWithScan"

    .line 141
    .line 142
    if-eqz p1, :cond_2

    .line 143
    .line 144
    new-instance p1, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    const-string v1, "ScanCalledTimes: "

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    iget v1, v3, Ls/x;->k:I

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    move-result-object p1

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0, p2, p1}, Ls/x;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    .line 166
    iget-object p1, v3, Ls/x;->r:Ls/o0;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1}, Ls/o0;->J()V

    .line 170
    .line 171
    iget-object p1, v3, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1, v2}, Lai/advance/sdk/global/iqa/lib/g;->setCameraCallback(Lai/advance/common/camera/GuardianCameraViewV2$g;)V

    .line 175
    .line 176
    iget-object p1, v3, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1}, Lai/advance/sdk/global/iqa/lib/g;->e0()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0, v6, v0}, Ls/x;->q(Lu/e;Ls/g;)Ls/o0;

    .line 183
    move-result-object p1

    .line 184
    .line 185
    iput-object p1, v3, Ls/x;->r:Ls/o0;

    .line 186
    .line 187
    :goto_1
    iput-object v7, p1, Ls/o0;->l:Ls/i;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1}, Ls/o0;->L()V

    .line 191
    .line 192
    iget-object p1, v3, Ls/x;->r:Ls/o0;

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1}, Ls/o0;->u()Ls/g;

    .line 196
    move-result-object p1

    .line 197
    .line 198
    iget-object p1, p1, Ls/g;->e:Ljava/lang/String;

    .line 199
    return-object p1

    .line 200
    .line 201
    .line 202
    :cond_2
    invoke-virtual {p0, v6, v0}, Ls/x;->q(Lu/e;Ls/g;)Ls/o0;

    .line 203
    move-result-object p1

    .line 204
    .line 205
    iput-object p1, v3, Ls/x;->r:Ls/o0;

    .line 206
    .line 207
    const-string p1, "First time Scan call"

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0, p2, p1}, Ls/x;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-static {}, Ls/c1;->R()Ls/c1;

    .line 214
    move-result-object p1

    .line 215
    .line 216
    const-string p2, "camera_open_started"

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1, p2}, Lf/f;->M(Ljava/lang/String;)V

    .line 220
    .line 221
    iget-object p1, v3, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1}, Lai/advance/sdk/global/iqa/lib/g;->getCameraId()I

    .line 225
    move-result p2

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1, p2, v2}, Lai/advance/common/camera/GuardianCameraViewV3;->b0(ILai/advance/common/camera/GuardianCameraViewV2$g;)V

    .line 229
    .line 230
    iget-object p1, v3, Ls/x;->r:Ls/o0;

    .line 231
    goto :goto_1
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
.end method

.method public o(Ls/e;Lu/d;)Ljava/lang/String;
    .locals 5
    .param p1    # Ls/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lu/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    new-instance v0, Ls/g$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ls/g$a;-><init>()V

    .line 6
    .line 7
    iget-object v1, p1, Ls/e;->b:Lai/advance/sdk/global/iqa/lib/enums/CardSide;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ls/g$a;->c(Lai/advance/sdk/global/iqa/lib/enums/CardSide;)Ls/g$a;

    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ls/g$a;->g(Z)Ls/g$a;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iget-object v2, p1, Ls/e;->a:Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ls/g$a;->i(Ljava/lang/String;)Ls/g$a;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    iget-object v2, p1, Ls/e;->c:Lai/advance/sdk/global/iqa/lib/enums/CardType;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ls/g$a;->d(Lai/advance/sdk/global/iqa/lib/enums/CardType;)Ls/g$a;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    iget-object v2, p1, Ls/e;->d:Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ls/g$a;->a(Ljava/lang/String;)Ls/g$a;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    iget p1, p1, Ls/e;->e:I

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ls/g$a;->h(I)Ls/g$a;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    iget-object v0, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/g;->getCameraId()I

    .line 46
    move-result v0

    .line 47
    const/4 v2, 0x1

    .line 48
    .line 49
    if-ne v0, v2, :cond_0

    .line 50
    move v1, v2

    .line 51
    .line 52
    .line 53
    :cond_0
    invoke-virtual {p1, v1}, Ls/g$a;->f(Z)Ls/g$a;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    iget-object v0, p0, Ls/x;->e:Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Ls/n;->e(Landroid/content/Context;)I

    .line 60
    move-result v0

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v0}, Ls/g$a;->k(I)Ls/g$a;

    .line 64
    move-result-object p1

    .line 65
    .line 66
    .line 67
    invoke-static {}, Lk/j;->c()Ljava/lang/String;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0}, Ls/g$a;->e(Ljava/lang/String;)Ls/g$a;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Ls/g$a;->b()Ls/g;

    .line 76
    move-result-object p1

    .line 77
    .line 78
    iget v0, p0, Ls/x;->m:I

    .line 79
    add-int/2addr v0, v2

    .line 80
    .line 81
    iput v0, p0, Ls/x;->m:I

    .line 82
    const/4 v0, 0x0

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v0}, Ls/x;->t(Landroid/graphics/Bitmap;)V

    .line 86
    .line 87
    new-instance v0, Ls/i;

    .line 88
    .line 89
    const-string v1, "camera"

    .line 90
    .line 91
    .line 92
    invoke-direct {v0, v1}, Ls/i;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 96
    move-result-wide v1

    .line 97
    .line 98
    new-instance v3, Ls/x$c;

    .line 99
    .line 100
    .line 101
    invoke-direct {v3, p0, v1, v2, v0}, Ls/x$c;-><init>(Ls/x;JLs/i;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Ls/x;->Q()Z

    .line 105
    move-result v1

    .line 106
    .line 107
    .line 108
    const-string/jumbo v2, "startDetectionWithPhotoCapture"

    .line 109
    .line 110
    if-eqz v1, :cond_1

    .line 111
    .line 112
    new-instance v1, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    .line 117
    const-string v4, "PhotoCaptureTimes: "

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    iget v4, p0, Ls/x;->m:I

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    move-result-object v1

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, v2, v1}, Ls/x;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    iget-object v1, p0, Ls/x;->r:Ls/o0;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1}, Ls/o0;->J()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0}, Ls/x;->a0()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0, p2, p1}, Ls/x;->p(Lu/d;Ls/g;)Ls/o0;

    .line 144
    move-result-object p1

    .line 145
    .line 146
    iput-object p1, p0, Ls/x;->r:Ls/o0;

    .line 147
    .line 148
    iget-object p1, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, v3}, Lai/advance/sdk/global/iqa/lib/g;->setCameraCallback(Lai/advance/common/camera/GuardianCameraViewV2$g;)V

    .line 152
    .line 153
    iget-object p1, p0, Ls/x;->r:Ls/o0;

    .line 154
    .line 155
    iput-object v0, p1, Ls/o0;->l:Ls/i;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1}, Ls/o0;->L()V

    .line 159
    .line 160
    iget-object p1, p0, Ls/x;->r:Ls/o0;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1}, Ls/o0;->u()Ls/g;

    .line 164
    move-result-object p1

    .line 165
    .line 166
    :goto_0
    iget-object p1, p1, Ls/g;->e:Ljava/lang/String;

    .line 167
    return-object p1

    .line 168
    .line 169
    .line 170
    :cond_1
    invoke-virtual {p0, p2, p1}, Ls/x;->p(Lu/d;Ls/g;)Ls/o0;

    .line 171
    move-result-object p2

    .line 172
    .line 173
    iput-object p2, p0, Ls/x;->r:Ls/o0;

    .line 174
    .line 175
    const-string p2, "First PhotoCapture call"

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0, v2, p2}, Ls/x;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    .line 180
    iget-object p2, p0, Ls/x;->r:Ls/o0;

    .line 181
    .line 182
    iput-object v0, p2, Ls/o0;->l:Ls/i;

    .line 183
    .line 184
    .line 185
    invoke-static {}, Ls/c1;->R()Ls/c1;

    .line 186
    move-result-object p2

    .line 187
    .line 188
    const-string v0, "camera_open_started"

    .line 189
    .line 190
    .line 191
    invoke-virtual {p2, v0}, Lf/f;->M(Ljava/lang/String;)V

    .line 192
    .line 193
    iget-object p2, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p2}, Lai/advance/sdk/global/iqa/lib/g;->getCameraId()I

    .line 197
    move-result v0

    .line 198
    .line 199
    .line 200
    invoke-virtual {p2, v0, v3}, Lai/advance/common/camera/GuardianCameraViewV3;->b0(ILai/advance/common/camera/GuardianCameraViewV2$g;)V

    .line 201
    .line 202
    iget-object p2, p0, Ls/x;->r:Ls/o0;

    .line 203
    .line 204
    .line 205
    invoke-virtual {p2}, Ls/o0;->L()V

    .line 206
    goto :goto_0
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
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
.end method

.method public final p(Lu/d;Ls/g;)Ls/o0;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ls/o0;

    .line 3
    .line 4
    iget-object v1, p0, Ls/x;->e:Landroid/content/Context;

    .line 5
    .line 6
    iget-object v2, p2, Ls/g;->a:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p2}, Ls/o0;-><init>(Landroid/content/Context;Ljava/lang/String;Ls/g;)V

    .line 10
    .line 11
    new-instance p2, Ls/x$d;

    .line 12
    .line 13
    .line 14
    invoke-direct {p2, p0, p1}, Ls/x$d;-><init>(Ls/x;Lu/d;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p2}, Ls/o0;->q(Lu/b;)V

    .line 18
    return-object v0
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

.method public final q(Lu/e;Ls/g;)Ls/o0;
    .locals 3
    .param p1    # Lu/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    new-instance v0, Ls/o0;

    .line 3
    .line 4
    iget-object v1, p0, Ls/x;->e:Landroid/content/Context;

    .line 5
    .line 6
    iget-object v2, p2, Ls/g;->a:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p2}, Ls/o0;-><init>(Landroid/content/Context;Ljava/lang/String;Ls/g;)V

    .line 10
    .line 11
    new-instance p2, Ls/x$b;

    .line 12
    .line 13
    .line 14
    invoke-direct {p2, p0, p1}, Ls/x$b;-><init>(Ls/x;Lu/e;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p2}, Ls/o0;->q(Lu/b;)V

    .line 18
    return-object v0
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

.method public r()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "by_user"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, v1}, Ls/x;->x(Ljava/lang/String;Lorg/json/JSONObject;)V

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

.method public final t(Landroid/graphics/Bitmap;)V
    .locals 2

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    const-string v0, "clear preview"

    .line 5
    goto :goto_0

    .line 6
    .line 7
    .line 8
    :cond_0
    const-string/jumbo v0, "preview bitmap"

    .line 9
    .line 10
    .line 11
    :goto_0
    const-string/jumbo v1, "preview"

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1, v0}, Ls/x;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    iget-object v0, p0, Ls/x;->d:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 17
    .line 18
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->c:Landroid/widget/ImageView;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 22
    return-void
    .line 23
    .line 24
.end method

.method public final synthetic u(Landroid/graphics/Bitmap;Lu/g;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Ls/n;->b(Landroid/graphics/Bitmap;)Ljava/lang/String;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iget-object v0, p0, Ls/x;->r:Ls/o0;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ls/o0;->s(Ljava/lang/String;)Lai/advance/common/entity/BaseResultEntity;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iget-object v1, p0, Ls/x;->r:Ls/o0;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ls/o0;->J()V

    .line 16
    .line 17
    iget-object v1, p0, Ls/x;->f:Landroid/os/Handler;

    .line 18
    .line 19
    new-instance v2, Ls/v;

    .line 20
    .line 21
    .line 22
    invoke-direct {v2, v0, p2, p1}, Ls/v;-><init>(Lai/advance/common/entity/BaseResultEntity;Lu/g;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

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
.end method

.method public v(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, v0}, Ls/x;->w(Ljava/lang/String;Ljava/lang/String;)V

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
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "IQAViewController"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0, p2}, Ls/v0;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

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

.method public x(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    .line 8
    :cond_0
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    move-result-wide v0

    .line 10
    .line 11
    iget-object v2, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 12
    .line 13
    iget-wide v3, v2, Lai/advance/sdk/global/iqa/lib/g;->J:J

    .line 14
    sub-long/2addr v0, v3

    .line 15
    .line 16
    iget-boolean v2, v2, Lai/advance/sdk/global/iqa/lib/g;->I:Z

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->getAutoFocusInterval()I

    .line 22
    move-result v2

    .line 23
    int-to-long v2, v2

    .line 24
    .line 25
    cmp-long v0, v0, v2

    .line 26
    .line 27
    if-lez v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 30
    const/4 v1, 0x1

    .line 31
    .line 32
    iput-boolean v1, v0, Lai/advance/sdk/global/iqa/lib/g;->I:Z

    .line 33
    .line 34
    .line 35
    invoke-static {}, Ls/c1;->R()Ls/c1;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    new-instance v1, Ls/o;

    .line 39
    .line 40
    .line 41
    invoke-direct {v1, p2, p1}, Ls/o;-><init>(Lorg/json/JSONObject;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lf/f;->L(Lg/a;)V

    .line 45
    .line 46
    iget-object p1, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lai/advance/common/camera/GuardianCameraViewV3;->I()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    :catch_0
    :cond_1
    :goto_0
    return-void
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
.end method

.method public z(Lu/f;)V
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Ls/x;->r:Ls/o0;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    const-string/jumbo v2, "takePhoto"

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "Detector is null"

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v2, v0}, Ls/x;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    new-instance v0, Lt/b;

    .line 16
    .line 17
    const-string v2, "NOT_INIT_DETECTOR"

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1, v2}, Lt/b;-><init>(ZLjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1, v0}, Lu/f;->a(Lt/b;)V

    .line 24
    return-void

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {v0}, Ls/o0;->u()Ls/g;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    iget-boolean v0, v0, Ls/g;->d:Z

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    const-string p1, "Take photo failed,current is scan mode"

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v2, p1}, Ls/x;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    return-void

    .line 39
    .line 40
    :cond_1
    const-string v0, "Start take photo"

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v2, v0}, Ls/x;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    iput-object p1, p0, Ls/x;->n:Lu/f;

    .line 46
    .line 47
    iget-object p1, p0, Ls/x;->r:Ls/o0;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Ls/o0;->N()V

    .line 51
    .line 52
    iget-object p1, p0, Ls/x;->f:Landroid/os/Handler;

    .line 53
    .line 54
    if-eqz p1, :cond_7

    .line 55
    .line 56
    iget-object p1, p0, Ls/x;->o:[B

    .line 57
    const/4 v0, 0x1

    .line 58
    .line 59
    if-nez p1, :cond_2

    .line 60
    .line 61
    const-string p1, "Last camera data is null,capture next yuv frame"

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v2, p1}, Ls/x;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    iput-boolean v0, p0, Ls/x;->p:Z

    .line 67
    return-void

    .line 68
    .line 69
    :cond_2
    const-string p1, "Use last camera data to take photo"

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v2, p1}, Ls/x;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    iget-object v3, p0, Ls/x;->o:[B

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Ls/x;->N()I

    .line 78
    move-result v4

    .line 79
    .line 80
    iget-object p1, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Lai/advance/sdk/global/iqa/lib/g;->getCropParams()Lai/advance/sdk/global/iqa/lib/data/CropParams;

    .line 84
    move-result-object v5

    .line 85
    .line 86
    iget-object p1, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Lai/advance/sdk/global/iqa/lib/g;->Y()Z

    .line 90
    move-result v6

    .line 91
    .line 92
    iget-object p1, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Lai/advance/common/camera/GuardianCameraViewV2;->X()Z

    .line 96
    move-result v7

    .line 97
    .line 98
    iget-object p1, p0, Ls/x;->c:Lai/advance/sdk/global/iqa/lib/g;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Lai/advance/sdk/global/iqa/lib/g;->getCameraAngle()I

    .line 102
    move-result v8

    .line 103
    .line 104
    .line 105
    invoke-static/range {v3 .. v8}, Ls/x;->k([BILai/advance/sdk/global/iqa/lib/data/CropParams;ZZI)Landroid/graphics/Bitmap;

    .line 106
    move-result-object p1

    .line 107
    .line 108
    iput-object p1, p0, Ls/x;->q:Landroid/graphics/Bitmap;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, p1}, Ls/x;->t(Landroid/graphics/Bitmap;)V

    .line 112
    .line 113
    iget-object p1, p0, Ls/x;->n:Lu/f;

    .line 114
    .line 115
    if-eqz p1, :cond_6

    .line 116
    .line 117
    new-instance p1, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    .line 122
    const-string v3, "Take photo finish,bitmap "

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    iget-object v3, p0, Ls/x;->q:Landroid/graphics/Bitmap;

    .line 128
    .line 129
    if-nez v3, :cond_3

    .line 130
    .line 131
    const-string v3, "is null"

    .line 132
    goto :goto_0

    .line 133
    .line 134
    :cond_3
    const-string v3, "exists"

    .line 135
    .line 136
    .line 137
    :goto_0
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    move-result-object p1

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, v2, p1}, Ls/x;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    iget-object p1, p0, Ls/x;->n:Lu/f;

    .line 147
    .line 148
    new-instance v2, Lt/b;

    .line 149
    .line 150
    iget-object v3, p0, Ls/x;->q:Landroid/graphics/Bitmap;

    .line 151
    .line 152
    if-eqz v3, :cond_4

    .line 153
    move v1, v0

    .line 154
    .line 155
    :cond_4
    if-nez v3, :cond_5

    .line 156
    .line 157
    const-string v0, "NO_IMAGE_CAPTURED"

    .line 158
    goto :goto_1

    .line 159
    .line 160
    :cond_5
    const-string v0, "SUCCESS"

    .line 161
    .line 162
    .line 163
    :goto_1
    invoke-direct {v2, v1, v0}, Lt/b;-><init>(ZLjava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-interface {p1, v2}, Lu/f;->a(Lt/b;)V

    .line 167
    :cond_6
    return-void

    .line 168
    .line 169
    :cond_7
    const-string p1, "Take photo MainHandler is null"

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, v2, p1}, Ls/x;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    return-void
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
