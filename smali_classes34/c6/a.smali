.class public Lc6/a;
.super Lcom/facebook/imagepipeline/request/a;
.source "IterativeBoxBlurPostProcessor.java"


# instance fields
.field public final a:I

.field public final b:I

.field public c:Lq3/a;


# direct methods
.method public constructor <init>(II)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/imagepipeline/request/a;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    if-lez p1, :cond_0

    .line 8
    move v2, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v2, v0

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    .line 17
    invoke-static {v2}, Lw3/h;->b(Ljava/lang/Boolean;)V

    .line 18
    .line 19
    if-lez p2, :cond_1

    .line 20
    move v0, v1

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lw3/h;->b(Ljava/lang/Boolean;)V

    .line 28
    .line 29
    iput p1, p0, Lc6/a;->a:I

    .line 30
    .line 31
    iput p2, p0, Lc6/a;->b:I

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
.end method


# virtual methods
.method public getPostprocessorCacheKey()Lq3/a;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lc6/a;->c:Lq3/a;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lc6/a;->a:I

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iget v1, p0, Lc6/a;->b:I

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x0

    .line 22
    .line 23
    const-string v2, "i%dr%d"

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    new-instance v1, Lq3/e;

    .line 30
    .line 31
    .line 32
    invoke-direct {v1, v0}, Lq3/e;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    iput-object v1, p0, Lc6/a;->c:Lq3/a;

    .line 35
    .line 36
    :cond_0
    iget-object v0, p0, Lc6/a;->c:Lq3/a;

    .line 37
    return-object v0
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
.end method

.method public process(Landroid/graphics/Bitmap;)V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lc6/a;->a:I

    .line 3
    .line 4
    iget v1, p0, Lc6/a;->b:I

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0, v1}, Lcom/facebook/imagepipeline/nativecode/NativeBlurFilter;->a(Landroid/graphics/Bitmap;II)V

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
.end method
