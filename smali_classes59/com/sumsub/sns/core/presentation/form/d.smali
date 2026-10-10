.class public final Lcom/sumsub/sns/core/presentation/form/d;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/core/presentation/form/f;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/presentation/form/f;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/presentation/form/d;->a:Lcom/sumsub/sns/core/presentation/form/f;

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
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/d;->a:Lcom/sumsub/sns/core/presentation/form/f;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/core/presentation/form/f;->j:Lkotlin/Lazy;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/form/l;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->d()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    const-string v2, ""

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    move-object v1, v2

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v2, p1

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-interface {v0, v1, v2}, Lcom/sumsub/sns/internal/core/presentation/form/l;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    move-result-object p1

    .line 34
    return-object p1
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
.end method

.method public final b(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/util/List;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/d;->a:Lcom/sumsub/sns/core/presentation/form/f;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/core/presentation/form/f;->j:Lkotlin/Lazy;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/form/l;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->d()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    const-string v2, ""

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    move-object v1, v2

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v2, p1

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-interface {v0, v1, v2}, Lcom/sumsub/sns/internal/core/presentation/form/l;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 33
    move-result-object p1

    .line 34
    return-object p1
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
.end method
