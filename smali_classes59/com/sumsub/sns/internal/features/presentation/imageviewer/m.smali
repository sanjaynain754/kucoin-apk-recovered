.class public final Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;
.super Lcom/sumsub/sns/core/presentation/base/p0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Landroid/os/Bundle;

.field public final b:Ljava/io/File;


# direct methods
.method public constructor <init>(Landroid/os/Bundle;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/core/presentation/base/P;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/core/presentation/base/P;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p2, p3, v0}, Lcom/sumsub/sns/core/presentation/base/p0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/core/presentation/base/P;)V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;->a:Landroid/os/Bundle;

    .line 11
    const/4 p2, 0x0

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const-string p3, "file"

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p3}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 19
    move-result-object p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object p1, p2

    .line 22
    .line 23
    :goto_0
    instance-of p3, p1, Ljava/io/File;

    .line 24
    .line 25
    if-eqz p3, :cond_1

    .line 26
    move-object p2, p1

    .line 27
    .line 28
    check-cast p2, Ljava/io/File;

    .line 29
    .line 30
    :cond_1
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;->b:Ljava/io/File;

    .line 31
    return-void
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
.method public final buildViewStateFlow(Lcom/sumsub/sns/core/presentation/base/O;)Lkotlinx/coroutines/flow/e;
    .locals 2

    .line 1
    .line 2
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {p1, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;-><init>(Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;Lkotlin/coroutines/Continuation;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/imageviewer/l;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/imageviewer/l;-><init>(Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;Lkotlin/coroutines/Continuation;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v1}, Lkotlinx/coroutines/flow/g;->h(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 19
    move-result-object p1

    .line 20
    return-object p1
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
