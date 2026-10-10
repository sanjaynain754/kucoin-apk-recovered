.class public final Lcom/kubi/futures/trade/position/ReduceMarginFragment;
.super Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;
.source "ReduceMarginFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/futures/trade/position/ReduceMarginFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0008\u0010\u0015\u001a\u00020\u0010H\u0002J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001e\u0010\u0019\u001a\u00020\u00102\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001bH\u0002J\u0012\u0010\u001e\u001a\u00020\u00102\u0008\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0008\u0010!\u001a\u00020\u0010H\u0002J\u0008\u0010\"\u001a\u00020\u0010H\u0002J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%H\u0002J\u0012\u0010&\u001a\u00020\u00102\u0008\u0010\'\u001a\u0004\u0018\u00010(H\u0002J\u0008\u0010)\u001a\u00020(H\u0014J\u0008\u0010*\u001a\u00020\u0010H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\t\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006,"
    }
    d2 = {
        "Lcom/kubi/futures/trade/position/ReduceMarginFragment;",
        "Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;",
        "<init>",
        "()V",
        "viewModel",
        "Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;",
        "getViewModel",
        "()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;",
        "viewModel$delegate",
        "Lkotlin/Lazy;",
        "futuresViewModel",
        "Lcom/kubi/futures/trade/vm/ExclusionDialogFuturesViewModel;",
        "getFuturesViewModel",
        "()Lcom/kubi/futures/trade/vm/ExclusionDialogFuturesViewModel;",
        "futuresViewModel$delegate",
        "onViewCreated",
        "",
        "view",
        "Landroid/view/View;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "initObserver",
        "handlePositionChanged",
        "position",
        "Lcom/kubi/kumex/data/trade/model/PositionEntity;",
        "handleSubmitResult",
        "it",
        "Lkotlin/Pair;",
        "",
        "",
        "handleInputBalance",
        "input",
        "",
        "handleTapConfirm",
        "trackConfirm",
        "initInputView",
        "inputView",
        "Lcom/kubi/futures/view/ModifyMarginInputView;",
        "onReduceBalanceChanged",
        "balance",
        "Ljava/math/BigDecimal;",
        "getAvailableBalance",
        "onShow",
        "Companion",
        "KumexLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nReduceMarginFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReduceMarginFragment.kt\ncom/kubi/futures/trade/position/ReduceMarginFragment\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,309:1\n220#2,5:310\n*S KotlinDebug\n*F\n+ 1 ReduceMarginFragment.kt\ncom/kubi/futures/trade/position/ReduceMarginFragment\n*L\n43#1:310,5\n*E\n"
    }
.end annotation


# static fields
.field public static final b0:Lcom/kubi/futures/trade/position/ReduceMarginFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final Z:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final a0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/futures/trade/position/ReduceMarginFragment$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/futures/trade/position/ReduceMarginFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->b0:Lcom/kubi/futures/trade/position/ReduceMarginFragment$Companion;

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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/futures/trade/position/x3;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/kubi/futures/trade/position/x3;-><init>(Lcom/kubi/futures/trade/position/ReduceMarginFragment;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->Z:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance v0, Lcom/kubi/futures/trade/position/z3;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p0}, Lcom/kubi/futures/trade/position/z3;-><init>(Lcom/kubi/futures/trade/position/ReduceMarginFragment;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->a0:Lkotlin/Lazy;

    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static synthetic I3(Lcom/kubi/futures/trade/position/ReduceMarginFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->k4(Lcom/kubi/futures/trade/position/ReduceMarginFragment;)Lkotlin/Unit;

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
.end method

.method public static synthetic J3(Lcom/kubi/futures/trade/position/ReduceMarginFragment;Lcom/kubi/kumex/data/trade/model/PositionEntity;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->f4(Lcom/kubi/futures/trade/position/ReduceMarginFragment;Lcom/kubi/kumex/data/trade/model/PositionEntity;)V

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
.end method

.method public static synthetic K3(Lcom/kubi/futures/view/ModifyMarginInputView;Lcom/kubi/futures/trade/position/ReduceMarginFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->b4(Lcom/kubi/futures/view/ModifyMarginInputView;Lcom/kubi/futures/trade/position/ReduceMarginFragment;)Lkotlin/Unit;

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

.method public static synthetic L3(Lcom/kubi/futures/trade/position/ReduceMarginFragment;Lcom/kubi/futures/trade/position/f3;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->g4(Lcom/kubi/futures/trade/position/ReduceMarginFragment;Lcom/kubi/futures/trade/position/f3;)Lkotlin/Unit;

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

.method public static synthetic M3(Lcom/kubi/futures/trade/position/ReduceMarginFragment;)Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->n4(Lcom/kubi/futures/trade/position/ReduceMarginFragment;)Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

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
.end method

.method public static synthetic N3(Lcom/kubi/futures/trade/position/ReduceMarginFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->l4(Lcom/kubi/futures/trade/position/ReduceMarginFragment;)Lkotlin/Unit;

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
.end method

.method public static synthetic O3(Lcom/kubi/futures/trade/position/ReduceMarginFragment;Lcom/kubi/futures/trade/position/f3;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->e4(Lcom/kubi/futures/trade/position/ReduceMarginFragment;Lcom/kubi/futures/trade/position/f3;)Lkotlin/Unit;

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

.method public static synthetic P3(Lcom/kubi/futures/trade/position/ReduceMarginFragment;Ljava/math/BigDecimal;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->h4(Lcom/kubi/futures/trade/position/ReduceMarginFragment;Ljava/math/BigDecimal;)Lkotlin/Unit;

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

.method public static synthetic Q3(Lcom/kubi/futures/trade/position/ReduceMarginFragment;Ljava/lang/CharSequence;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->c4(Lcom/kubi/futures/trade/position/ReduceMarginFragment;Ljava/lang/CharSequence;)Lkotlin/Unit;

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

.method public static synthetic R3(Lcom/kubi/futures/trade/position/ReduceMarginFragment;Lkotlin/Pair;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->i4(Lcom/kubi/futures/trade/position/ReduceMarginFragment;Lkotlin/Pair;)Lkotlin/Unit;

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

.method public static synthetic S3(Lcom/kubi/futures/trade/position/ReduceMarginFragment;)Lcom/kubi/futures/trade/vm/u;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->T3(Lcom/kubi/futures/trade/position/ReduceMarginFragment;)Lcom/kubi/futures/trade/vm/u;

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
.end method

.method public static final T3(Lcom/kubi/futures/trade/position/ReduceMarginFragment;)Lcom/kubi/futures/trade/vm/u;
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->u3()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSymbol()Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    move-result-object v3

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->u3()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 27
    move-result v0

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 31
    move-result-object v0

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move-object v0, v1

    .line 34
    .line 35
    .line 36
    :goto_1
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 37
    move-result v4

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->u3()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPositionSide()Ljava/lang/String;

    .line 47
    move-result-object v1

    .line 48
    :cond_2
    move-object v5, v1

    .line 49
    .line 50
    const/16 v7, 0x8

    .line 51
    const/4 v8, 0x0

    .line 52
    const/4 v6, 0x0

    .line 53
    move-object v2, p0

    .line 54
    .line 55
    .line 56
    invoke-static/range {v2 .. v8}, Lcom/kubi/futures/trade/vm/v;->b(Landroidx/fragment/app/Fragment;Ljava/lang/String;ZLjava/lang/String;Lcom/kubi/broker/MultiBizType;ILjava/lang/Object;)Lcom/kubi/futures/trade/vm/u;

    .line 57
    move-result-object p0

    .line 58
    return-object p0
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
.end method

.method private final U3()Lcom/kubi/futures/trade/vm/u;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->a0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/futures/trade/vm/u;

    .line 9
    return-object v0
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
.end method

.method private final W3(Ljava/lang/String;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->s3()Ldm/v1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->u3()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    :goto_0
    return-void

    .line 15
    .line 16
    :cond_1
    iget-object v2, v0, Ldm/v1;->y:Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    move-result v2

    .line 27
    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    iget-object v2, v0, Ldm/v1;->y:Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;

    .line 31
    const/4 v3, 0x0

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v3}, Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;->setProgress(F)V

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-static {p1}, Lcom/kubi/kumex/utils/w;->d(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->r3()Ljava/math/BigDecimal;

    .line 42
    move-result-object v3

    .line 43
    const/4 v4, 0x0

    .line 44
    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    sget-object v5, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v5}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 51
    move-result v5

    .line 52
    .line 53
    if-nez v5, :cond_3

    .line 54
    .line 55
    iget-object p1, v0, Ldm/v1;->D:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v4}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->V3()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 62
    move-result-object p1

    .line 63
    const/4 v0, 0x0

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0, v1}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->e0(Ljava/math/BigDecimal;Lcom/kubi/kumex/data/trade/model/PositionEntity;)V

    .line 67
    return-void

    .line 68
    .line 69
    .line 70
    :cond_3
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 71
    move-result-object v5

    .line 72
    .line 73
    .line 74
    invoke-static {v3}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 75
    move-result-object v3

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 79
    move-result v3

    .line 80
    .line 81
    if-lez v3, :cond_4

    .line 82
    .line 83
    iget-object p1, v0, Ldm/v1;->n:Lcom/kubi/futures/view/ModifyMarginInputView;

    .line 84
    .line 85
    sget v1, Lcom/kubi/kumex/R$string;->kumex_modify_margin_reduce_error_tips:I

    .line 86
    .line 87
    new-array v2, v4, [Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v1, v2}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 91
    move-result-object v1

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v1}, Lcom/kubi/futures/view/ModifyMarginInputView;->m(Ljava/lang/String;)V

    .line 95
    .line 96
    iget-object p1, v0, Ldm/v1;->D:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v4}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 100
    return-void

    .line 101
    .line 102
    :cond_4
    iget-object v3, v0, Ldm/v1;->n:Lcom/kubi/futures/view/ModifyMarginInputView;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3}, Lcom/kubi/futures/view/ModifyMarginInputView;->l()V

    .line 106
    .line 107
    iget-object v0, v0, Ldm/v1;->D:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 108
    const/4 v3, 0x1

    .line 109
    .line 110
    if-eqz p1, :cond_5

    .line 111
    .line 112
    .line 113
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 114
    move-result p1

    .line 115
    .line 116
    if-nez p1, :cond_6

    .line 117
    :cond_5
    move v4, v3

    .line 118
    .line 119
    :cond_6
    xor-int/lit8 p1, v4, 0x1

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, p1}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->V3()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 126
    move-result-object p1

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v2, v1}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->e0(Ljava/math/BigDecimal;Lcom/kubi/kumex/data/trade/model/PositionEntity;)V

    .line 130
    return-void
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
.end method

.method private final Y3(Lkotlin/Pair;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "+",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->s3()Ldm/v1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Ldm/v1;->D:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/kubi/resources/widget/button/KcPrimaryButton;->l()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->u3()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    return-void

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    check-cast v1, Ljava/lang/Boolean;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    move-result v1

    .line 31
    .line 32
    if-eqz v1, :cond_5

    .line 33
    .line 34
    sget p1, Lcom/kubi/kumex/R$string;->kumex_modify_margin_add_submit_success:I

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Lcom/kubi/utils/ToastCompat;->C(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->v3()Z

    .line 41
    move-result p1

    .line 42
    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->V3()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/kubi/futures/trade/position/vm/e2;->I()V

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    instance-of v1, p1, Lcom/kubi/futures/trade/position/ModifyMarginDialog;

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    check-cast p1, Lcom/kubi/futures/trade/position/ModifyMarginDialog;

    .line 61
    goto :goto_0

    .line 62
    :cond_3
    const/4 p1, 0x0

    .line 63
    .line 64
    :goto_0
    if-eqz p1, :cond_4

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismissAllowingStateLoss()V

    .line 68
    .line 69
    :cond_4
    const-string p1, "success"

    .line 70
    goto :goto_2

    .line 71
    .line 72
    .line 73
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->V3()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 74
    move-result-object v1

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSymbol()Ljava/lang/String;

    .line 78
    move-result-object v2

    .line 79
    .line 80
    .line 81
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    move-result-object v2

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 86
    move-result v3

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPositionSide()Ljava/lang/String;

    .line 90
    move-result-object v4

    .line 91
    .line 92
    .line 93
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    move-result-object v4

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v2, v3, v4}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->U(Ljava/lang/String;ZLjava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 101
    move-result-object p1

    .line 102
    .line 103
    check-cast p1, Ljava/lang/Throwable;

    .line 104
    .line 105
    if-eqz p1, :cond_9

    .line 106
    .line 107
    instance-of v1, p1, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 108
    .line 109
    if-eqz v1, :cond_8

    .line 110
    move-object v1, p1

    .line 111
    .line 112
    check-cast v1, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 113
    .line 114
    iget-object v2, v1, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 115
    .line 116
    const-string v3, "200013"

    .line 117
    .line 118
    .line 119
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    move-result v2

    .line 121
    .line 122
    if-nez v2, :cond_6

    .line 123
    .line 124
    iget-object v2, v1, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 125
    .line 126
    const-string v4, "200012"

    .line 127
    .line 128
    .line 129
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    move-result v2

    .line 131
    .line 132
    if-eqz v2, :cond_8

    .line 133
    .line 134
    :cond_6
    iget-object p1, v1, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    move-result p1

    .line 139
    .line 140
    if-eqz p1, :cond_7

    .line 141
    .line 142
    sget p1, Lcom/kubi/kumex/R$string;->kumex_modify_margin_reduce_fail_risk_change:I

    .line 143
    .line 144
    .line 145
    invoke-static {p0, p1}, Lcom/kubi/kumex/utils/m0;->c(Landroidx/lifecycle/LifecycleOwner;I)V

    .line 146
    goto :goto_1

    .line 147
    .line 148
    :cond_7
    sget p1, Lcom/kubi/kumex/R$string;->kumex_modify_margin_reduce_fail_max_amount:I

    .line 149
    .line 150
    .line 151
    invoke-static {p0, p1}, Lcom/kubi/kumex/utils/m0;->c(Landroidx/lifecycle/LifecycleOwner;I)V

    .line 152
    goto :goto_1

    .line 153
    .line 154
    .line 155
    :cond_8
    invoke-static {p0, p1}, Lcom/kubi/kumex/utils/m0;->e(Landroidx/lifecycle/LifecycleOwner;Ljava/lang/Throwable;)V

    .line 156
    .line 157
    :cond_9
    :goto_1
    const-string p1, "failure"

    .line 158
    .line 159
    .line 160
    :goto_2
    invoke-static {}, Lcom/kubi/kumex/utils/n0;->b()Ljava/lang/String;

    .line 161
    move-result-object v1

    .line 162
    .line 163
    new-instance v2, Lorg/json/JSONObject;

    .line 164
    .line 165
    .line 166
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 167
    .line 168
    const-string v3, "AdjResult"

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 172
    .line 173
    const-string p1, "MarginDirection"

    .line 174
    .line 175
    const-string v3, "ReduceMargin"

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2, p1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 182
    move-result p1

    .line 183
    .line 184
    .line 185
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 186
    move-result-object p1

    .line 187
    .line 188
    .line 189
    invoke-static {p1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 190
    move-result p1

    .line 191
    .line 192
    .line 193
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 194
    move-result-object p1

    .line 195
    .line 196
    const-string v0, "isTrialFunds"

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 200
    .line 201
    const-string p1, "positionMode"

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->H3()Ljava/lang/String;

    .line 205
    move-result-object v0

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 209
    .line 210
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 211
    .line 212
    const-string p1, "AdjustMargin"

    .line 213
    .line 214
    const-string v0, "6"

    .line 215
    .line 216
    .line 217
    invoke-static {v1, p1, v0, v2}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 218
    return-void
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
.end method

.method private final Z3()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->s3()Ldm/v1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->u3()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    goto :goto_0

    .line 15
    .line 16
    :cond_1
    iget-object v2, v0, Ldm/v1;->D:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/kubi/resources/widget/button/KcPrimaryButton;->m()Z

    .line 20
    move-result v2

    .line 21
    .line 22
    if-eqz v2, :cond_2

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_2
    iget-object v2, v0, Ldm/v1;->n:Lcom/kubi/futures/view/ModifyMarginInputView;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/kubi/futures/view/ModifyMarginInputView;->getInputValue()Ljava/math/BigDecimal;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    if-eqz v2, :cond_5

    .line 32
    .line 33
    sget-object v3, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 37
    move-result v3

    .line 38
    .line 39
    if-gtz v3, :cond_3

    .line 40
    goto :goto_0

    .line 41
    .line 42
    .line 43
    :cond_3
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 44
    move-result-object v3

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->r3()Ljava/math/BigDecimal;

    .line 48
    move-result-object v4

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 52
    move-result v3

    .line 53
    .line 54
    if-lez v3, :cond_4

    .line 55
    .line 56
    iget-object v1, v0, Ldm/v1;->n:Lcom/kubi/futures/view/ModifyMarginInputView;

    .line 57
    .line 58
    sget v2, Lcom/kubi/kumex/R$string;->kumex_modify_margin_reduce_error_tips:I

    .line 59
    const/4 v3, 0x0

    .line 60
    .line 61
    new-array v4, v3, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v2, v4}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 65
    move-result-object v2

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v2}, Lcom/kubi/futures/view/ModifyMarginInputView;->m(Ljava/lang/String;)V

    .line 69
    .line 70
    iget-object v0, v0, Ldm/v1;->D:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v3}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 74
    return-void

    .line 75
    .line 76
    .line 77
    :cond_4
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->m4()V

    .line 78
    .line 79
    iget-object v0, v0, Ldm/v1;->D:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/kubi/resources/widget/button/KcPrimaryButton;->o()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->V3()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 86
    move-result-object v0

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSymbol()Ljava/lang/String;

    .line 90
    move-result-object v3

    .line 91
    .line 92
    .line 93
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    move-result-object v3

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 98
    move-result v4

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPositionSide()Ljava/lang/String;

    .line 102
    move-result-object v1

    .line 103
    .line 104
    .line 105
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    move-result-object v1

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v3, v4, v2, v1}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->f0(Ljava/lang/String;ZLjava/math/BigDecimal;Ljava/lang/String;)V

    .line 110
    :cond_5
    :goto_0
    return-void
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
.end method

.method private final a4(Lcom/kubi/futures/view/ModifyMarginInputView;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->u3()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSettleCurrency()Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lcom/kubi/futures/view/ModifyMarginInputView;->setSuffixText(Ljava/lang/String;)V

    .line 23
    .line 24
    sget v0, Lcom/kubi/kumex/R$string;->kumex_modify_margin_reduce_margin:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lcom/kubi/futures/view/ModifyMarginInputView;->setSubTitleRes(I)V

    .line 28
    .line 29
    new-instance v0, Lcom/kubi/futures/trade/position/c4;

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, p1, p0}, Lcom/kubi/futures/trade/position/c4;-><init>(Lcom/kubi/futures/view/ModifyMarginInputView;Lcom/kubi/futures/trade/position/ReduceMarginFragment;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Lcom/kubi/futures/view/ModifyMarginInputView;->setActionListener(Lkotlin/jvm/functions/Function0;)V

    .line 36
    .line 37
    new-instance v0, Lcom/kubi/futures/trade/position/d4;

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, p0}, Lcom/kubi/futures/trade/position/d4;-><init>(Lcom/kubi/futures/trade/position/ReduceMarginFragment;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v0}, Lcom/kubi/futures/view/ModifyMarginInputView;->setTextWatcher(Lkotlin/jvm/functions/Function1;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->t3()Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Lfm/b;->c(Lcom/kubi/kumex/data/platform/model/ContractEntity;)I

    .line 51
    move-result v0

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 59
    move-result v0

    .line 60
    int-to-double v1, v0

    .line 61
    .line 62
    const-wide/high16 v3, -0x4010000000000000L    # -1.0

    .line 63
    mul-double/2addr v1, v3

    .line 64
    .line 65
    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    .line 66
    .line 67
    .line 68
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->pow(DD)D

    .line 69
    move-result-wide v1

    .line 70
    .line 71
    .line 72
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    new-instance v2, Ljava/math/BigDecimal;

    .line 76
    .line 77
    const-string v3, "0.01"

    .line 78
    .line 79
    .line 80
    invoke-direct {v2, v3}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v1, v2}, Lcom/kubi/kumex/utils/w;->a(Ljava/lang/String;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 84
    move-result-object v1

    .line 85
    .line 86
    .line 87
    invoke-static {v1}, Lcom/fasterxml/jackson/databind/node/a;->a(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    const-string v2, "toPlainString(...)"

    .line 95
    .line 96
    .line 97
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v1}, Lcom/kubi/futures/view/ModifyMarginInputView;->setInputHint(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v0}, Lcom/kubi/futures/view/ModifyMarginInputView;->setPrecision(I)V

    .line 104
    return-void
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
.end method

.method public static final b4(Lcom/kubi/futures/view/ModifyMarginInputView;Lcom/kubi/futures/trade/position/ReduceMarginFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->r3()Ljava/math/BigDecimal;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/kubi/futures/view/ModifyMarginInputView;->setInputValue(Ljava/math/BigDecimal;)V

    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    return-object p0
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
.end method

.method public static final c4(Lcom/kubi/futures/trade/position/ReduceMarginFragment;Ljava/lang/CharSequence;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-direct {p0, p1}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->W3(Ljava/lang/String;)V

    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    return-object p0
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
.end method

.method private final d4()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "getViewLifecycleOwner(...)"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->V3()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/kubi/futures/trade/position/vm/e2;->F()Landroidx/lifecycle/MutableLiveData;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    new-instance v2, Lcom/kubi/futures/trade/position/e4;

    .line 20
    .line 21
    .line 22
    invoke-direct {v2, p0}, Lcom/kubi/futures/trade/position/e4;-><init>(Lcom/kubi/futures/trade/position/ReduceMarginFragment;)V

    .line 23
    .line 24
    new-instance v3, Lcom/kubi/futures/trade/position/ReduceMarginFragment$a;

    .line 25
    .line 26
    .line 27
    invoke-direct {v3, v2}, Lcom/kubi/futures/trade/position/ReduceMarginFragment$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v0, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->U3()Lcom/kubi/futures/trade/vm/u;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    new-instance v2, Lcom/kubi/futures/trade/position/f4;

    .line 37
    .line 38
    .line 39
    invoke-direct {v2, p0}, Lcom/kubi/futures/trade/position/f4;-><init>(Lcom/kubi/futures/trade/position/ReduceMarginFragment;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2}, Lcom/kubi/futures/trade/vm/u;->a(Landroidx/lifecycle/Observer;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->V3()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->a0()Landroidx/lifecycle/MutableLiveData;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    new-instance v2, Lcom/kubi/futures/trade/position/g4;

    .line 53
    .line 54
    .line 55
    invoke-direct {v2, p0}, Lcom/kubi/futures/trade/position/g4;-><init>(Lcom/kubi/futures/trade/position/ReduceMarginFragment;)V

    .line 56
    .line 57
    new-instance v3, Lcom/kubi/futures/trade/position/ReduceMarginFragment$a;

    .line 58
    .line 59
    .line 60
    invoke-direct {v3, v2}, Lcom/kubi/futures/trade/position/ReduceMarginFragment$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v0, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->V3()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 67
    move-result-object v1

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->c0()Landroidx/lifecycle/MutableLiveData;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    new-instance v2, Lcom/kubi/futures/trade/position/h4;

    .line 74
    .line 75
    .line 76
    invoke-direct {v2, p0}, Lcom/kubi/futures/trade/position/h4;-><init>(Lcom/kubi/futures/trade/position/ReduceMarginFragment;)V

    .line 77
    .line 78
    new-instance v3, Lcom/kubi/futures/trade/position/ReduceMarginFragment$a;

    .line 79
    .line 80
    .line 81
    invoke-direct {v3, v2}, Lcom/kubi/futures/trade/position/ReduceMarginFragment$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v0, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->V3()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->d0()Landroidx/lifecycle/MutableLiveData;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    new-instance v2, Lcom/kubi/futures/trade/position/y3;

    .line 95
    .line 96
    .line 97
    invoke-direct {v2, p0}, Lcom/kubi/futures/trade/position/y3;-><init>(Lcom/kubi/futures/trade/position/ReduceMarginFragment;)V

    .line 98
    .line 99
    new-instance v3, Lcom/kubi/futures/trade/position/ReduceMarginFragment$a;

    .line 100
    .line 101
    .line 102
    invoke-direct {v3, v2}, Lcom/kubi/futures/trade/position/ReduceMarginFragment$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v0, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 106
    return-void
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
.end method

.method public static final e4(Lcom/kubi/futures/trade/position/ReduceMarginFragment;Lcom/kubi/futures/trade/position/f3;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->y3(Lcom/kubi/futures/trade/position/f3;)V

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0
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
.end method

.method public static final f4(Lcom/kubi/futures/trade/position/ReduceMarginFragment;Lcom/kubi/kumex/data/trade/model/PositionEntity;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->E3(Lcom/kubi/kumex/data/trade/model/PositionEntity;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->V3()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/kubi/futures/trade/position/vm/e2;->O(Lcom/kubi/kumex/data/trade/model/PositionEntity;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->X3(Lcom/kubi/kumex/data/trade/model/PositionEntity;)V

    .line 19
    return-void
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
.end method

.method public static final g4(Lcom/kubi/futures/trade/position/ReduceMarginFragment;Lcom/kubi/futures/trade/position/f3;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->x3(Lcom/kubi/futures/trade/position/f3;)V

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0
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
.end method

.method public static final h4(Lcom/kubi/futures/trade/position/ReduceMarginFragment;Ljava/math/BigDecimal;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->j4(Ljava/math/BigDecimal;)V

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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
.end method

.method public static final i4(Lcom/kubi/futures/trade/position/ReduceMarginFragment;Lkotlin/Pair;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->Y3(Lkotlin/Pair;)V

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0
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
.end method

.method public static final k4(Lcom/kubi/futures/trade/position/ReduceMarginFragment;)Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kumex/utils/n0;->b()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lorg/json/JSONObject;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->u3()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 19
    move-result v2

    .line 20
    .line 21
    .line 22
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    move-result-object v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v2, 0x0

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-static {v2}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 29
    move-result v2

    .line 30
    .line 31
    .line 32
    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    const-string v3, "isTrialFunds"

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    const-string v2, "AdjustMargin"

    .line 42
    .line 43
    const-string v3, "4"

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v2, v3, v1}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 47
    .line 48
    sget v0, Lcom/kubi/kumex/R$string;->uta_isolate_margin_max_reduce_title:I

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->v3()Z

    .line 52
    move-result v1

    .line 53
    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    sget v1, Lcom/kubi/kumex/R$string;->uta_isolate_margin_max_reduce_desc:I

    .line 57
    goto :goto_1

    .line 58
    .line 59
    :cond_1
    sget v1, Lcom/kubi/kumex/R$string;->kumex_modify_margin_max_reduce_tips:I

    .line 60
    .line 61
    .line 62
    :goto_1
    invoke-virtual {p0, v0, v1}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->G3(II)V

    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 65
    return-object p0
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
.end method

.method public static final l4(Lcom/kubi/futures/trade/position/ReduceMarginFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->Z3()V

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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
.end method

.method private final m4()V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->u3()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-static {}, Lcom/kubi/kumex/utils/n0;->b()Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    new-instance v2, Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->V3()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 20
    move-result-object v3

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Lcom/kubi/futures/trade/position/vm/e2;->F()Landroidx/lifecycle/MutableLiveData;

    .line 24
    move-result-object v3

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 28
    move-result-object v3

    .line 29
    .line 30
    check-cast v3, Lcom/kubi/futures/trade/position/f3;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->V3()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 34
    move-result-object v4

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->a0()Landroidx/lifecycle/MutableLiveData;

    .line 38
    move-result-object v4

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 42
    move-result-object v4

    .line 43
    .line 44
    check-cast v4, Lcom/kubi/futures/trade/position/f3;

    .line 45
    .line 46
    const-string v5, "MarginDirection"

    .line 47
    .line 48
    const-string v6, "ReduceMargin"

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 52
    const/4 v5, 0x0

    .line 53
    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3}, Lcom/kubi/futures/trade/position/f3;->b()Ljava/lang/String;

    .line 58
    move-result-object v6

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move-object v6, v5

    .line 61
    .line 62
    .line 63
    :goto_0
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    move-result-object v6

    .line 65
    .line 66
    const-string v7, "lev1"

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 70
    .line 71
    if-eqz v4, :cond_2

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4}, Lcom/kubi/futures/trade/position/f3;->b()Ljava/lang/String;

    .line 75
    move-result-object v6

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    move-object v6, v5

    .line 78
    .line 79
    .line 80
    :goto_1
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    move-result-object v6

    .line 82
    .line 83
    const-string v7, "lev2"

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 87
    .line 88
    if-eqz v3, :cond_3

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3}, Lcom/kubi/futures/trade/position/f3;->a()Ljava/lang/String;

    .line 92
    move-result-object v6

    .line 93
    goto :goto_2

    .line 94
    :cond_3
    move-object v6, v5

    .line 95
    .line 96
    .line 97
    :goto_2
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    move-result-object v6

    .line 99
    .line 100
    const-string v7, "openPrice1"

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 104
    .line 105
    if-eqz v4, :cond_4

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4}, Lcom/kubi/futures/trade/position/f3;->a()Ljava/lang/String;

    .line 109
    move-result-object v6

    .line 110
    goto :goto_3

    .line 111
    :cond_4
    move-object v6, v5

    .line 112
    .line 113
    .line 114
    :goto_3
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    move-result-object v6

    .line 116
    .line 117
    const-string v7, "openPrice2"

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 121
    .line 122
    if-eqz v3, :cond_5

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3}, Lcom/kubi/futures/trade/position/f3;->c()Ljava/lang/String;

    .line 126
    move-result-object v3

    .line 127
    goto :goto_4

    .line 128
    :cond_5
    move-object v3, v5

    .line 129
    .line 130
    .line 131
    :goto_4
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    move-result-object v3

    .line 133
    .line 134
    const-string v6, "liqPrice1"

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, v6, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 138
    .line 139
    if-eqz v4, :cond_6

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4}, Lcom/kubi/futures/trade/position/f3;->c()Ljava/lang/String;

    .line 143
    move-result-object v3

    .line 144
    goto :goto_5

    .line 145
    :cond_6
    move-object v3, v5

    .line 146
    .line 147
    .line 148
    :goto_5
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    move-result-object v3

    .line 150
    .line 151
    const-string v4, "liqPrice2"

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->s3()Ldm/v1;

    .line 158
    move-result-object v3

    .line 159
    .line 160
    if-eqz v3, :cond_7

    .line 161
    .line 162
    iget-object v3, v3, Ldm/v1;->n:Lcom/kubi/futures/view/ModifyMarginInputView;

    .line 163
    .line 164
    if-eqz v3, :cond_7

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3}, Lcom/kubi/futures/view/ModifyMarginInputView;->getInputValue()Ljava/math/BigDecimal;

    .line 168
    move-result-object v3

    .line 169
    .line 170
    if-eqz v3, :cond_7

    .line 171
    .line 172
    .line 173
    invoke-static {v3}, Lcom/fasterxml/jackson/databind/node/a;->a(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 174
    move-result-object v3

    .line 175
    .line 176
    if-eqz v3, :cond_7

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 180
    move-result-object v5

    .line 181
    .line 182
    .line 183
    :cond_7
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 184
    move-result-object v3

    .line 185
    .line 186
    const-string v4, "ChooseMargin"

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSymbol()Ljava/lang/String;

    .line 193
    move-result-object v3

    .line 194
    .line 195
    .line 196
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 197
    move-result-object v3

    .line 198
    .line 199
    const-string v4, "symbol"

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 206
    move-result v0

    .line 207
    .line 208
    .line 209
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 210
    move-result-object v0

    .line 211
    .line 212
    const-string v3, "isTrialFunds"

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 216
    .line 217
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 218
    .line 219
    const-string v0, "AdjustLeverage"

    .line 220
    .line 221
    const-string v3, "6"

    .line 222
    .line 223
    .line 224
    invoke-static {v1, v0, v3, v2}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 225
    return-void
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
.end method

.method public static final n4(Lcom/kubi/futures/trade/position/ReduceMarginFragment;)Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;)V

    .line 6
    .line 7
    const-class p0, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    check-cast p0, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 14
    return-object p0
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
.end method


# virtual methods
.method public final V3()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->Z:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 9
    return-object v0
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
.end method

.method public final X3(Lcom/kubi/kumex/data/trade/model/PositionEntity;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->s3()Ldm/v1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Ldm/v1;->n:Lcom/kubi/futures/view/ModifyMarginInputView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/kubi/futures/view/ModifyMarginInputView;->getInputValue()Ljava/math/BigDecimal;

    .line 14
    move-result-object v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    .line 18
    :goto_0
    if-eqz v0, :cond_2

    .line 19
    .line 20
    sget-object v1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 24
    move-result v1

    .line 25
    .line 26
    if-lez v1, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->r3()Ljava/math/BigDecimal;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 34
    move-result v1

    .line 35
    .line 36
    if-lez v1, :cond_2

    .line 37
    .line 38
    :cond_1
    sget-object p1, Lcom/kubi/kumex/utils/v;->a:Lcom/kubi/kumex/utils/v;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->getTAG()Ljava/lang/String;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    const-string v1, "<get-TAG>(...)"

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    const-string v1, "handlePositionChanged-\u4e0d\u6ee1\u8db3\u8ba1\u7b97\u6761\u4ef6"

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0, v1}, Lcom/kubi/kumex/utils/v;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    return-void

    .line 54
    .line 55
    .line 56
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->V3()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 57
    move-result-object v1

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v0, p1}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->e0(Ljava/math/BigDecimal;Lcom/kubi/kumex/data/trade/model/PositionEntity;)V

    .line 61
    return-void
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
.end method

.method public final j4(Ljava/math/BigDecimal;)V
    .locals 14

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->u3()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->s3()Ldm/v1;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    :goto_0
    return-void

    .line 15
    .line 16
    :cond_1
    if-eqz p1, :cond_4

    .line 17
    .line 18
    sget-object v2, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 22
    move-result v2

    .line 23
    .line 24
    if-gez v2, :cond_2

    .line 25
    goto :goto_2

    .line 26
    .line 27
    :cond_2
    iget-object v1, v1, Ldm/v1;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->t3()Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    .line 36
    invoke-static {v2}, Lfm/b;->c(Lcom/kubi/kumex/data/platform/model/ContractEntity;)I

    .line 37
    move-result v2

    .line 38
    .line 39
    .line 40
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    move-result-object v2

    .line 42
    goto :goto_1

    .line 43
    :cond_3
    const/4 v2, 0x0

    .line 44
    :goto_1
    const/4 v3, 0x2

    .line 45
    .line 46
    .line 47
    invoke-static {v2, v3}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 48
    move-result v6

    .line 49
    .line 50
    const/16 v12, 0x69

    .line 51
    const/4 v13, 0x0

    .line 52
    const/4 v5, 0x0

    .line 53
    const/4 v7, 0x1

    .line 54
    const/4 v8, 0x0

    .line 55
    const/4 v9, 0x1

    .line 56
    const/4 v10, 0x0

    .line 57
    const/4 v11, 0x0

    .line 58
    move-object v4, p1

    .line 59
    .line 60
    .line 61
    invoke-static/range {v4 .. v13}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lfm/d;->y()Ljava/lang/String;

    .line 66
    move-result-object v2

    .line 67
    .line 68
    .line 69
    invoke-static {p1, v2}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    move-result-object v3

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSettleCurrency()Ljava/lang/String;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    .line 77
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    move-result-object p1

    .line 79
    .line 80
    .line 81
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    move-result-object v4

    .line 83
    const/4 v7, 0x4

    .line 84
    const/4 v8, 0x0

    .line 85
    const/4 v5, 0x1

    .line 86
    const/4 v6, 0x0

    .line 87
    .line 88
    .line 89
    invoke-static/range {v3 .. v8}, Lnf/b;->g(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 90
    move-result-object p1

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    return-void

    .line 95
    .line 96
    :cond_4
    :goto_2
    iget-object p1, v1, Ldm/v1;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 97
    .line 98
    .line 99
    invoke-static {}, Lfm/d;->y()Ljava/lang/String;

    .line 100
    move-result-object v0

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    return-void
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
.end method

.method public onShow()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/BaseFragment;->onShow()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->u3()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    return-void

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->V3()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSymbol()Ljava/lang/String;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    .line 21
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 26
    move-result v3

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPositionSide()Ljava/lang/String;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2, v3, v0}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->U(Ljava/lang/String;ZLjava/lang/String;)V

    .line 38
    return-void
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
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 13
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "view"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1, p2}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->s3()Ldm/v1;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    return-void

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->U3()Lcom/kubi/futures/trade/vm/u;

    .line 19
    move-result-object p2

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Lcom/kubi/futures/trade/vm/u;->b()V

    .line 23
    .line 24
    iget-object p2, p1, Ldm/v1;->n:Lcom/kubi/futures/view/ModifyMarginInputView;

    .line 25
    .line 26
    const-string v0, "inputView"

    .line 27
    .line 28
    .line 29
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, p2}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->a4(Lcom/kubi/futures/view/ModifyMarginInputView;)V

    .line 33
    .line 34
    iget-object p2, p1, Ldm/v1;->z:Lcom/kubi/resources/widget/DashTextView;

    .line 35
    .line 36
    sget v0, Lcom/kubi/kumex/R$string;->uta_isolate_margin_max_reduce_title:I

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(I)V

    .line 40
    .line 41
    iget-object p2, p1, Ldm/v1;->b:Lcom/kubi/resources/widget/BaseTextView;

    .line 42
    .line 43
    sget v0, Lcom/kubi/kumex/R$string;->kumex_modify_margin_reduce_after:I

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(I)V

    .line 47
    .line 48
    iget-object v1, p1, Ldm/v1;->z:Lcom/kubi/resources/widget/DashTextView;

    .line 49
    .line 50
    const-string p2, "questionLabel"

    .line 51
    .line 52
    .line 53
    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    new-instance v4, Lcom/kubi/futures/trade/position/a4;

    .line 56
    .line 57
    .line 58
    invoke-direct {v4, p0}, Lcom/kubi/futures/trade/position/a4;-><init>(Lcom/kubi/futures/trade/position/ReduceMarginFragment;)V

    .line 59
    const/4 v5, 0x1

    .line 60
    const/4 v6, 0x0

    .line 61
    .line 62
    const-wide/16 v2, 0x0

    .line 63
    .line 64
    .line 65
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 66
    .line 67
    iget-object v7, p1, Ldm/v1;->D:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 68
    .line 69
    const-string p2, "tvConfirm"

    .line 70
    .line 71
    .line 72
    invoke-static {v7, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    new-instance v10, Lcom/kubi/futures/trade/position/b4;

    .line 75
    .line 76
    .line 77
    invoke-direct {v10, p0}, Lcom/kubi/futures/trade/position/b4;-><init>(Lcom/kubi/futures/trade/position/ReduceMarginFragment;)V

    .line 78
    const/4 v11, 0x1

    .line 79
    const/4 v12, 0x0

    .line 80
    .line 81
    const-wide/16 v8, 0x0

    .line 82
    .line 83
    .line 84
    invoke-static/range {v7 .. v12}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 85
    .line 86
    iget-object p1, p1, Ldm/v1;->c:Landroidx/constraintlayout/widget/Group;

    .line 87
    .line 88
    const-string p2, "autoGroup"

    .line 89
    .line 90
    .line 91
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 95
    .line 96
    .line 97
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->d4()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->V3()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 101
    move-result-object p1

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->V()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->V3()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 108
    move-result-object p1

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->u3()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 112
    move-result-object p2

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, p2}, Lcom/kubi/futures/trade/position/vm/e2;->z(Lcom/kubi/kumex/data/trade/model/PositionEntity;)V

    .line 116
    return-void
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
.end method

.method public r3()Ljava/math/BigDecimal;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ReduceMarginFragment;->V3()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->c0()Landroidx/lifecycle/MutableLiveData;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Ljava/math/BigDecimal;

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->t3()Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Lfm/b;->c(Lcom/kubi/kumex/data/platform/model/ContractEntity;)I

    .line 28
    move-result v1

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    move-result-object v1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v1, 0x0

    .line 35
    :goto_0
    const/4 v2, 0x2

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v2}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 39
    move-result v1

    .line 40
    .line 41
    sget-object v2, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1, v2}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    const-string v1, "setScale(...)"

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    return-object v0
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
.end method
