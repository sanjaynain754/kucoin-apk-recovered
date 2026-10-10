.class public final Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/s;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K;

.field public final synthetic b:Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/s;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/s;->b:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/s;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K;

    .line 3
    .line 4
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K;->R:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m;

    .line 5
    .line 6
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K;->F:Lcom/sumsub/sns/internal/core/common/L;

    .line 7
    .line 8
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K;->S:[Lkotlin/reflect/KProperty;

    .line 9
    .line 10
    const/16 v2, 0x16

    .line 11
    .line 12
    aget-object v1, v1, v2

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    check-cast p1, Landroid/view/View;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const/16 v0, 0x8

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    :cond_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/s;->b:Lkotlin/jvm/functions/Function0;

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 33
    :cond_1
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
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 3

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/s;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K;

    .line 3
    .line 4
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K;->R:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m;

    .line 5
    .line 6
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K;->F:Lcom/sumsub/sns/internal/core/common/L;

    .line 7
    .line 8
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K;->S:[Lkotlin/reflect/KProperty;

    .line 9
    .line 10
    const/16 v2, 0x16

    .line 11
    .line 12
    aget-object v1, v1, v2

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    check-cast p1, Landroid/view/View;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    const/4 v0, 0x0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 25
    :cond_0
    return-void
.end method
