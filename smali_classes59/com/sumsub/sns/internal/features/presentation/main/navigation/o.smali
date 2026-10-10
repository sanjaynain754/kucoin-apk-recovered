.class public abstract Lcom/sumsub/sns/internal/features/presentation/main/navigation/o;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static a(Lcom/sumsub/sns/internal/features/presentation/main/navigation/r;)Ljava/lang/Exception;
    .locals 3

    .line 1
    .line 2
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/p;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Ljava/lang/Exception;

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/p;

    .line 9
    .line 10
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/p;->a:Lcom/sumsub/sns/internal/features/domain/navigation/model/z;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    const-string v2, "Module "

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string p0, " not available"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 36
    return-object v0

    .line 37
    .line 38
    :cond_0
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/q;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/v;

    .line 43
    .line 44
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/q;

    .line 45
    .line 46
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/q;->a:Lcom/sumsub/sns/internal/features/domain/navigation/model/z;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    move-result-object p0

    .line 51
    .line 52
    .line 53
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/v;-><init>(Ljava/lang/String;)V

    .line 54
    return-object v0

    .line 55
    .line 56
    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 57
    .line 58
    .line 59
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 60
    throw p0
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
