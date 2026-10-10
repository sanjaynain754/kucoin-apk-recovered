.class public abstract Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public a()Ljava/lang/Throwable;
    .locals 2

    .line 1
    .line 2
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/L;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    move-object v0, p0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/L;

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v0, v1

    .line 11
    .line 12
    :goto_0
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/L;->a:Ljava/lang/Throwable;

    .line 15
    return-object v0

    .line 16
    :cond_1
    return-object v1
    .line 17
.end method

.method public final b()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/M;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p0

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/M;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/M;->a:Ljava/lang/Object;

    .line 10
    return-object v0

    .line 11
    .line 12
    :cond_0
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/L;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    move-object v0, p0

    .line 16
    .line 17
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/L;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/L;->b:Ljava/lang/Object;

    .line 20
    return-object v0

    .line 21
    .line 22
    :cond_1
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/K;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    const/4 v0, 0x0

    .line 26
    return-object v0

    .line 27
    .line 28
    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 29
    .line 30
    .line 31
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 32
    throw v0
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
.end method

.method public final c()Ljava/lang/Object;
    .locals 2

    .line 1
    .line 2
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/M;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    move-object v0, p0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/M;

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v0, v1

    .line 11
    .line 12
    :goto_0
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/M;->a:Ljava/lang/Object;

    .line 15
    return-object v0

    .line 16
    :cond_1
    return-object v1
    .line 17
.end method

.method public final d()Ljava/lang/Object;
    .locals 2

    .line 1
    .line 2
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/L;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->b()Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    return-object v0

    .line 12
    .line 13
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v1, "Required value was null."

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    throw v0

    .line 20
    :cond_1
    move-object v0, p0

    .line 21
    .line 22
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/L;

    .line 23
    .line 24
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/L;->a:Ljava/lang/Throwable;

    .line 25
    throw v0
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
.end method
