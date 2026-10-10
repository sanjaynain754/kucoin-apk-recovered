.class public Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/matrix/memguard/MemGuard$Options;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:Z

.field public g:Z

.field public h:Ljava/lang/String;

.field public final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->a:Landroid/content/Context;

    .line 6
    .line 7
    instance-of v0, p1, Landroid/app/Activity;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iput-object v0, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->a:Landroid/content/Context;

    .line 16
    .line 17
    :cond_0
    const/16 v0, 0x2000

    .line 18
    .line 19
    iput v0, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->b:I

    .line 20
    .line 21
    const/16 v0, 0x1000

    .line 22
    .line 23
    iput v0, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->c:I

    .line 24
    const/4 v0, 0x5

    .line 25
    .line 26
    iput v0, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->d:I

    .line 27
    .line 28
    const/16 v0, 0x1e

    .line 29
    .line 30
    iput v0, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->e:I

    .line 31
    const/4 v0, 0x0

    .line 32
    .line 33
    iput-boolean v0, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->f:Z

    .line 34
    .line 35
    iput-boolean v0, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->g:Z

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Lcom/tencent/bugly/matrix/memguard/MemGuard;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    iput-object p1, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->h:Ljava/lang/String;

    .line 42
    .line 43
    new-instance p1, Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    iput-object p1, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->i:Ljava/util/List;

    .line 49
    .line 50
    new-instance p1, Ljava/util/ArrayList;

    .line 51
    .line 52
    .line 53
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    iput-object p1, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->j:Ljava/util/List;

    .line 56
    return-void
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
.end method


# virtual methods
.method public a(I)Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iput p1, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->c:I

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 3
    iput-object p1, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->h:Ljava/lang/String;

    return-object p0
.end method

.method public varargs a(Ljava/lang/String;[Ljava/lang/String;)Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->j:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    iget-object p1, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->j:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public a(Z)Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    iput-boolean p1, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->g:Z

    return-object p0
.end method

.method public a()Lcom/tencent/bugly/matrix/memguard/MemGuard$Options;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 7
    new-instance v0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options;

    .line 8
    invoke-direct {v0}, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options;-><init>()V

    .line 9
    invoke-virtual {p0}, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->h()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 10
    new-array v1, v2, [Ljava/lang/String;

    const-string v3, ".*/lib.*\\.so$"

    invoke-virtual {p0, v3, v1}, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->b(Ljava/lang/String;[Ljava/lang/String;)Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;

    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->d()I

    move-result v1

    iput v1, v0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options;->maxAllocationSize:I

    .line 12
    invoke-virtual {p0}, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->e()I

    move-result v1

    iput v1, v0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options;->maxDetectableAllocationCount:I

    .line 13
    invoke-virtual {p0}, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->f()I

    move-result v1

    iput v1, v0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options;->maxSkippedAllocationCount:I

    .line 14
    invoke-virtual {p0}, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->g()I

    move-result v1

    iput v1, v0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options;->percentageOfLeftSideGuard:I

    .line 15
    invoke-virtual {p0}, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->j()Z

    move-result v1

    iput-boolean v1, v0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options;->perfectRightSideGuard:Z

    .line 16
    invoke-virtual {p0}, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->i()Z

    move-result v1

    iput-boolean v1, v0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options;->ignoreOverlappedReading:Z

    .line 17
    iget-object v1, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->a:Landroid/content/Context;

    invoke-virtual {p0}, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/tencent/bugly/matrix/memguard/MemGuard;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options;->issueDumpFilePath:Ljava/lang/String;

    .line 18
    invoke-virtual {p0}, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->h()Ljava/util/List;

    move-result-object v1

    new-array v3, v2, [Ljava/lang/String;

    invoke-interface {v1, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options;->targetSOPatterns:[Ljava/lang/String;

    .line 19
    invoke-virtual {p0}, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->b()Ljava/util/List;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options;->ignoredSOPatterns:[Ljava/lang/String;

    return-object v0
.end method

.method public b(I)Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iput p1, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->b:I

    return-object p0
.end method

.method public varargs b(Ljava/lang/String;[Ljava/lang/String;)Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object p1, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->i:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public b(Z)Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    iput-boolean p1, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->f:Z

    return-object p0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->j:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c(I)Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iput p1, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->d:I

    return-object p0
.end method

.method public c()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->h:Ljava/lang/String;

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->b:I

    return v0
.end method

.method public d(I)Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    iput p1, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->e:I

    return-object p0
.end method

.method public e()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->c:I

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
    .line 17
.end method

.method public f()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->d:I

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
    .line 17
.end method

.method public g()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->e:I

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
    .line 17
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->i:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

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
.end method

.method public i()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->g:Z

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
    .line 17
.end method

.method public j()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->f:Z

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
    .line 17
.end method
