.class public final Lcom/kubi/futures/trade/position/AddMarginFragment;
.super Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;
.source "AddMarginFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/futures/trade/position/AddMarginFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0008\u0010\u0018\u001a\u00020\u0010H\u0002J\u001e\u0010\u0019\u001a\u00020\u00102\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001bH\u0002J\u0012\u0010\u001e\u001a\u00020\u00102\u0008\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0008\u0010!\u001a\u00020 H\u0014J\u001e\u0010\"\u001a\u00020\u00102\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001bH\u0002J\u0012\u0010#\u001a\u00020\u00102\u0008\u0010$\u001a\u0004\u0018\u00010%H\u0002J\u0008\u0010&\u001a\u00020\u0010H\u0002J\u0008\u0010\'\u001a\u00020\u0010H\u0002J\u0010\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020*H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\t\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006,"
    }
    d2 = {
        "Lcom/kubi/futures/trade/position/AddMarginFragment;",
        "Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;",
        "<init>",
        "()V",
        "viewModel",
        "Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;",
        "getViewModel",
        "()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;",
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
        "initInputView",
        "inputView",
        "Lcom/kubi/futures/view/ModifyMarginInputView;",
        "initObserver",
        "handleAutoMarginResult",
        "it",
        "Lkotlin/Pair;",
        "",
        "",
        "onBalanceChanged",
        "balance",
        "Ljava/math/BigDecimal;",
        "getAvailableBalance",
        "handleSubmitResult",
        "handleInputBalance",
        "input",
        "",
        "handleTapConfirm",
        "trackConfirm",
        "handleAutoMarginSwitch",
        "switch",
        "Landroidx/appcompat/widget/SwitchCompat;",
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
        "SMAP\nAddMarginFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddMarginFragment.kt\ncom/kubi/futures/trade/position/AddMarginFragment\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,329:1\n220#2,5:330\n*S KotlinDebug\n*F\n+ 1 AddMarginFragment.kt\ncom/kubi/futures/trade/position/AddMarginFragment\n*L\n51#1:330,5\n*E\n"
    }
.end annotation


# static fields
.field public static final b0:Lcom/kubi/futures/trade/position/AddMarginFragment$Companion;
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
    new-instance v0, Lcom/kubi/futures/trade/position/AddMarginFragment$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/futures/trade/position/AddMarginFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/futures/trade/position/AddMarginFragment;->b0:Lcom/kubi/futures/trade/position/AddMarginFragment$Companion;

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
    new-instance v0, Lcom/kubi/futures/trade/position/i;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/kubi/futures/trade/position/i;-><init>(Lcom/kubi/futures/trade/position/AddMarginFragment;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/futures/trade/position/AddMarginFragment;->Z:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance v0, Lcom/kubi/futures/trade/position/j;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p0}, Lcom/kubi/futures/trade/position/j;-><init>(Lcom/kubi/futures/trade/position/AddMarginFragment;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/kubi/futures/trade/position/AddMarginFragment;->a0:Lkotlin/Lazy;

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

.method public static synthetic I3(Lcom/kubi/futures/trade/position/AddMarginFragment;Lcom/kubi/kumex/data/trade/model/PositionEntity;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/AddMarginFragment;->p4(Lcom/kubi/futures/trade/position/AddMarginFragment;Lcom/kubi/kumex/data/trade/model/PositionEntity;)V

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

.method public static synthetic J3(Lcom/kubi/futures/trade/position/AddMarginFragment;Landroidx/appcompat/widget/SwitchCompat;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/AddMarginFragment;->u4(Lcom/kubi/futures/trade/position/AddMarginFragment;Landroidx/appcompat/widget/SwitchCompat;)Lkotlin/Unit;

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

.method public static synthetic K3(Lcom/kubi/futures/trade/position/AddMarginFragment;)Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->w4(Lcom/kubi/futures/trade/position/AddMarginFragment;)Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

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

.method public static synthetic L3(Lcom/kubi/futures/trade/position/AddMarginFragment;Lcom/kubi/futures/trade/position/f3;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/AddMarginFragment;->k4(Lcom/kubi/futures/trade/position/AddMarginFragment;Lcom/kubi/futures/trade/position/f3;)Lkotlin/Unit;

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

.method public static synthetic M3(Lcom/kubi/futures/trade/position/AddMarginFragment;Landroidx/appcompat/widget/SwitchCompat;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/AddMarginFragment;->c4(Lcom/kubi/futures/trade/position/AddMarginFragment;Landroidx/appcompat/widget/SwitchCompat;)Lkotlin/Unit;

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

.method public static synthetic N3(Lcom/kubi/futures/trade/position/AddMarginFragment;Ljava/lang/CharSequence;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/AddMarginFragment;->i4(Lcom/kubi/futures/trade/position/AddMarginFragment;Ljava/lang/CharSequence;)Lkotlin/Unit;

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

.method public static synthetic O3(Lcom/kubi/futures/view/ModifyMarginInputView;Lcom/kubi/futures/trade/position/AddMarginFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/AddMarginFragment;->h4(Lcom/kubi/futures/view/ModifyMarginInputView;Lcom/kubi/futures/trade/position/AddMarginFragment;)Lkotlin/Unit;

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

.method public static synthetic P3(Lcom/kubi/futures/trade/position/AddMarginFragment;Lkotlin/Pair;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/AddMarginFragment;->l4(Lcom/kubi/futures/trade/position/AddMarginFragment;Lkotlin/Pair;)Lkotlin/Unit;

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

.method public static synthetic Q3(Lcom/kubi/futures/trade/position/AddMarginFragment;Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/AddMarginFragment;->o4(Lcom/kubi/futures/trade/position/AddMarginFragment;Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;)V

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

.method public static synthetic R3(Lcom/kubi/futures/trade/position/AddMarginFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->s4(Lcom/kubi/futures/trade/position/AddMarginFragment;)Lkotlin/Unit;

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

.method public static synthetic S3(Lcom/kubi/futures/trade/position/AddMarginFragment;)Lcom/kubi/futures/trade/vm/u;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->X3(Lcom/kubi/futures/trade/position/AddMarginFragment;)Lcom/kubi/futures/trade/vm/u;

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

.method public static synthetic T3(Lcom/kubi/futures/trade/position/AddMarginFragment;Lcom/kubi/futures/trade/position/f3;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/AddMarginFragment;->q4(Lcom/kubi/futures/trade/position/AddMarginFragment;Lcom/kubi/futures/trade/position/f3;)Lkotlin/Unit;

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

.method public static synthetic U3(Lcom/kubi/futures/trade/position/AddMarginFragment;Lkotlin/Pair;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/AddMarginFragment;->m4(Lcom/kubi/futures/trade/position/AddMarginFragment;Lkotlin/Pair;)Lkotlin/Unit;

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

.method public static synthetic V3(Lcom/kubi/futures/trade/position/AddMarginFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->t4(Lcom/kubi/futures/trade/position/AddMarginFragment;)Lkotlin/Unit;

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

.method public static synthetic W3(Lcom/kubi/futures/trade/position/AddMarginFragment;Ljava/math/BigDecimal;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/AddMarginFragment;->n4(Lcom/kubi/futures/trade/position/AddMarginFragment;Ljava/math/BigDecimal;)Lkotlin/Unit;

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

.method public static final X3(Lcom/kubi/futures/trade/position/AddMarginFragment;)Lcom/kubi/futures/trade/vm/u;
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

.method public static final c4(Lcom/kubi/futures/trade/position/AddMarginFragment;Landroidx/appcompat/widget/SwitchCompat;)Lkotlin/Unit;
    .locals 1

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
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->showLoadingDialog()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->Z3()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

    .line 16
    move-result-object p0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 20
    move-result p1

    .line 21
    .line 22
    xor-int/lit8 p1, p1, 0x1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1, v0}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->j0(ZLcom/kubi/kumex/data/trade/model/PositionEntity;)V

    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 28
    return-object p0
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

.method public static final h4(Lcom/kubi/futures/view/ModifyMarginInputView;Lcom/kubi/futures/trade/position/AddMarginFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/futures/trade/position/AddMarginFragment;->r3()Ljava/math/BigDecimal;

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

.method public static final i4(Lcom/kubi/futures/trade/position/AddMarginFragment;Ljava/lang/CharSequence;)Lkotlin/Unit;
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
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/position/AddMarginFragment;->d4(Ljava/lang/String;)V

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

.method private final j4()V
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
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->Y3()Lcom/kubi/futures/trade/vm/u;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    new-instance v2, Lcom/kubi/futures/trade/position/k;

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, p0}, Lcom/kubi/futures/trade/position/k;-><init>(Lcom/kubi/futures/trade/position/AddMarginFragment;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lcom/kubi/futures/trade/vm/u;->a(Landroidx/lifecycle/Observer;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->Z3()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/kubi/futures/trade/position/vm/e2;->F()Landroidx/lifecycle/MutableLiveData;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    new-instance v2, Lcom/kubi/futures/trade/position/l;

    .line 32
    .line 33
    .line 34
    invoke-direct {v2, p0}, Lcom/kubi/futures/trade/position/l;-><init>(Lcom/kubi/futures/trade/position/AddMarginFragment;)V

    .line 35
    .line 36
    new-instance v3, Lcom/kubi/futures/trade/position/AddMarginFragment$a;

    .line 37
    .line 38
    .line 39
    invoke-direct {v3, v2}, Lcom/kubi/futures/trade/position/AddMarginFragment$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v0, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->Z3()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->Z()Landroidx/lifecycle/MutableLiveData;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    new-instance v2, Lcom/kubi/futures/trade/position/m;

    .line 53
    .line 54
    .line 55
    invoke-direct {v2, p0}, Lcom/kubi/futures/trade/position/m;-><init>(Lcom/kubi/futures/trade/position/AddMarginFragment;)V

    .line 56
    .line 57
    new-instance v3, Lcom/kubi/futures/trade/position/AddMarginFragment$a;

    .line 58
    .line 59
    .line 60
    invoke-direct {v3, v2}, Lcom/kubi/futures/trade/position/AddMarginFragment$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v0, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->Z3()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

    .line 67
    move-result-object v1

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->c0()Landroidx/lifecycle/MutableLiveData;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    new-instance v2, Lcom/kubi/futures/trade/position/n;

    .line 74
    .line 75
    .line 76
    invoke-direct {v2, p0}, Lcom/kubi/futures/trade/position/n;-><init>(Lcom/kubi/futures/trade/position/AddMarginFragment;)V

    .line 77
    .line 78
    new-instance v3, Lcom/kubi/futures/trade/position/AddMarginFragment$a;

    .line 79
    .line 80
    .line 81
    invoke-direct {v3, v2}, Lcom/kubi/futures/trade/position/AddMarginFragment$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v0, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->Z3()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->b0()Landroidx/lifecycle/MutableLiveData;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    new-instance v2, Lcom/kubi/futures/trade/position/o;

    .line 95
    .line 96
    .line 97
    invoke-direct {v2, p0}, Lcom/kubi/futures/trade/position/o;-><init>(Lcom/kubi/futures/trade/position/AddMarginFragment;)V

    .line 98
    .line 99
    new-instance v3, Lcom/kubi/futures/trade/position/AddMarginFragment$a;

    .line 100
    .line 101
    .line 102
    invoke-direct {v3, v2}, Lcom/kubi/futures/trade/position/AddMarginFragment$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v0, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->v3()Z

    .line 109
    move-result v1

    .line 110
    .line 111
    if-eqz v1, :cond_1

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->Z3()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

    .line 115
    move-result-object v1

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->a0()Landroidx/lifecycle/MutableLiveData;

    .line 119
    move-result-object v1

    .line 120
    .line 121
    new-instance v2, Lcom/kubi/futures/trade/position/b;

    .line 122
    .line 123
    .line 124
    invoke-direct {v2, p0}, Lcom/kubi/futures/trade/position/b;-><init>(Lcom/kubi/futures/trade/position/AddMarginFragment;)V

    .line 125
    .line 126
    new-instance v3, Lcom/kubi/futures/trade/position/AddMarginFragment$a;

    .line 127
    .line 128
    .line 129
    invoke-direct {v3, v2}, Lcom/kubi/futures/trade/position/AddMarginFragment$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, v0, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->Z3()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

    .line 136
    move-result-object v0

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->u3()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 140
    move-result-object v1

    .line 141
    .line 142
    if-eqz v1, :cond_0

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSettleCurrency()Ljava/lang/String;

    .line 146
    move-result-object v1

    .line 147
    goto :goto_0

    .line 148
    :cond_0
    const/4 v1, 0x0

    .line 149
    .line 150
    .line 151
    :goto_0
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    move-result-object v1

    .line 153
    .line 154
    .line 155
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    move-result-object v1

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v1}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->e0(Ljava/lang/String;)V

    .line 160
    return-void

    .line 161
    .line 162
    .line 163
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->Y3()Lcom/kubi/futures/trade/vm/u;

    .line 164
    move-result-object v0

    .line 165
    .line 166
    new-instance v1, Lcom/kubi/futures/trade/position/c;

    .line 167
    .line 168
    .line 169
    invoke-direct {v1, p0}, Lcom/kubi/futures/trade/position/c;-><init>(Lcom/kubi/futures/trade/position/AddMarginFragment;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v1}, Lcom/kubi/futures/trade/vm/u;->E(Landroidx/lifecycle/Observer;)V

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
    .line 235
.end method

.method public static final k4(Lcom/kubi/futures/trade/position/AddMarginFragment;Lcom/kubi/futures/trade/position/f3;)Lkotlin/Unit;
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

.method public static final l4(Lcom/kubi/futures/trade/position/AddMarginFragment;Lkotlin/Pair;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/position/AddMarginFragment;->e4(Lkotlin/Pair;)V

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

.method public static final m4(Lcom/kubi/futures/trade/position/AddMarginFragment;Lkotlin/Pair;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/position/AddMarginFragment;->a4(Lkotlin/Pair;)V

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

.method public static final n4(Lcom/kubi/futures/trade/position/AddMarginFragment;Ljava/math/BigDecimal;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/position/AddMarginFragment;->r4(Ljava/math/BigDecimal;)V

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

.method public static final o4(Lcom/kubi/futures/trade/position/AddMarginFragment;Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;)V
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
    invoke-virtual {p1}, Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;->getAvailableBalance()Ljava/math/BigDecimal;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/position/AddMarginFragment;->r4(Ljava/math/BigDecimal;)V

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

.method public static final p4(Lcom/kubi/futures/trade/position/AddMarginFragment;Lcom/kubi/kumex/data/trade/model/PositionEntity;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "position"

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
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->s3()Ldm/v1;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getAutoDeposit()Ljava/lang/Boolean;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 22
    move-result v1

    .line 23
    .line 24
    iget-object v2, v0, Ldm/v1;->e:Lcom/kubi/resources/widget/KcSmallSwitchButton;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 28
    move-result v2

    .line 29
    .line 30
    if-eq v1, v2, :cond_0

    .line 31
    .line 32
    iget-object v1, v0, Ldm/v1;->e:Lcom/kubi/resources/widget/KcSmallSwitchButton;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getAutoDeposit()Ljava/lang/Boolean;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    .line 39
    invoke-static {v2}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 40
    move-result v2

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Lcom/kubi/resources/widget/BaseSwitchButton;->setChecked(Z)V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->Z3()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p1}, Lcom/kubi/futures/trade/position/vm/e2;->O(Lcom/kubi/kumex/data/trade/model/PositionEntity;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->Z3()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

    .line 54
    move-result-object p0

    .line 55
    .line 56
    iget-object v0, v0, Ldm/v1;->n:Lcom/kubi/futures/view/ModifyMarginInputView;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/kubi/futures/view/ModifyMarginInputView;->getInputValue()Ljava/math/BigDecimal;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v0, p1}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->d0(Ljava/math/BigDecimal;Lcom/kubi/kumex/data/trade/model/PositionEntity;)V

    .line 64
    :cond_1
    return-void
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

.method public static final q4(Lcom/kubi/futures/trade/position/AddMarginFragment;Lcom/kubi/futures/trade/position/f3;)Lkotlin/Unit;
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

.method public static final s4(Lcom/kubi/futures/trade/position/AddMarginFragment;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->v3()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0

    .line 10
    .line 11
    :cond_0
    sget v0, Lcom/kubi/kumex/R$string;->uta_isolate_margin_max_add_title:I

    .line 12
    .line 13
    sget v1, Lcom/kubi/kumex/R$string;->uta_isolate_margin_max_add_desc:I

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->G3(II)V

    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 19
    return-object p0
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

.method public static final t4(Lcom/kubi/futures/trade/position/AddMarginFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->f4()V

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

.method public static final u4(Lcom/kubi/futures/trade/position/AddMarginFragment;Landroidx/appcompat/widget/SwitchCompat;)Lkotlin/Unit;
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
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/position/AddMarginFragment;->b4(Landroidx/appcompat/widget/SwitchCompat;)V

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object p0
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

.method public static final w4(Lcom/kubi/futures/trade/position/AddMarginFragment;)Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;
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
    const-class p0, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    check-cast p0, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

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
.method public final Y3()Lcom/kubi/futures/trade/vm/u;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/position/AddMarginFragment;->a0:Lkotlin/Lazy;

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

.method public final Z3()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/position/AddMarginFragment;->Z:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

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

.method public final a4(Lkotlin/Pair;)V
    .locals 4
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
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    check-cast p1, Ljava/lang/Throwable;

    .line 14
    const/4 v1, 0x1

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v3, v1, v2}, Lcom/kubi/sdk/BaseFragment;->hideLoadingDialog$default(Lcom/kubi/sdk/BaseFragment;ZILjava/lang/Object;)V

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    sget-object v1, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSymbol()Ljava/lang/String;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-interface {v1, v0}, Lth/d;->Y(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    const-string v1, "Paused"

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    move-result v0

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    sget p1, Lcom/kubi/kumex/R$string;->can_not_operate_margin:I

    .line 50
    .line 51
    .line 52
    invoke-static {p0, p1}, Lcom/kubi/kumex/utils/m0;->c(Landroidx/lifecycle/LifecycleOwner;I)V

    .line 53
    return-void

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-static {p0, p1}, Lcom/kubi/kumex/utils/m0;->e(Landroidx/lifecycle/LifecycleOwner;Ljava/lang/Throwable;)V

    .line 57
    :cond_2
    :goto_0
    return-void
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
.end method

.method public final b4(Landroidx/appcompat/widget/SwitchCompat;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/futures/settings/j;->m()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    xor-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    new-instance v1, Lcom/kubi/futures/trade/position/f;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, p0, p1}, Lcom/kubi/futures/trade/position/f;-><init>(Lcom/kubi/futures/trade/position/AddMarginFragment;Landroidx/appcompat/widget/SwitchCompat;)V

    .line 18
    const/4 p1, 0x2

    .line 19
    const/4 v2, 0x0

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v2, v1, p1, v2}, Lcom/kubi/kumex/dialog/u;->t(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lcom/kubi/resources/dialog/BaseDialogFragment;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    const-string v1, "getChildFragmentManager(...)"

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    const-string v1, "auto_ensure_dialog"

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0, v1}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 38
    return-void

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->u3()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    if-nez v0, :cond_1

    .line 45
    return-void

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->showLoadingDialog()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->Z3()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 56
    move-result p1

    .line 57
    .line 58
    xor-int/lit8 p1, p1, 0x1

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, p1, v0}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->j0(ZLcom/kubi/kumex/data/trade/model/PositionEntity;)V

    .line 62
    return-void
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

.method public final d4(Ljava/lang/String;)V
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
    return-void

    .line 8
    .line 9
    :cond_0
    iget-object v1, v0, Ldm/v1;->y:Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    move-result v1

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    iget-object v1, v0, Ldm/v1;->y:Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;

    .line 24
    const/4 v2, 0x0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;->setProgress(F)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-static {p1}, Lcom/kubi/kumex/utils/w;->d(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->r3()Ljava/math/BigDecimal;

    .line 35
    move-result-object v2

    .line 36
    const/4 v3, 0x0

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    sget-object v4, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 44
    move-result v4

    .line 45
    .line 46
    if-nez v4, :cond_2

    .line 47
    .line 48
    iget-object p1, v0, Ldm/v1;->D:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v3}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 52
    return-void

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-static {v1}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 56
    move-result-object v4

    .line 57
    .line 58
    .line 59
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 60
    move-result-object v2

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 64
    move-result v2

    .line 65
    .line 66
    if-lez v2, :cond_3

    .line 67
    .line 68
    iget-object p1, v0, Ldm/v1;->n:Lcom/kubi/futures/view/ModifyMarginInputView;

    .line 69
    .line 70
    sget v1, Lcom/kubi/kumex/R$string;->kumex_modify_margin_add_error_tips:I

    .line 71
    .line 72
    new-array v2, v3, [Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v1, v2}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 76
    move-result-object v1

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v1}, Lcom/kubi/futures/view/ModifyMarginInputView;->m(Ljava/lang/String;)V

    .line 80
    .line 81
    iget-object p1, v0, Ldm/v1;->D:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v3}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 85
    return-void

    .line 86
    .line 87
    :cond_3
    iget-object v2, v0, Ldm/v1;->n:Lcom/kubi/futures/view/ModifyMarginInputView;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Lcom/kubi/futures/view/ModifyMarginInputView;->l()V

    .line 91
    .line 92
    iget-object v0, v0, Ldm/v1;->D:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 93
    const/4 v2, 0x1

    .line 94
    .line 95
    if-eqz p1, :cond_4

    .line 96
    .line 97
    .line 98
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 99
    move-result p1

    .line 100
    .line 101
    if-nez p1, :cond_5

    .line 102
    :cond_4
    move v3, v2

    .line 103
    .line 104
    :cond_5
    xor-int/lit8 p1, v3, 0x1

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, p1}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->Z3()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

    .line 111
    move-result-object p1

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->u3()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 115
    move-result-object v0

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, v1, v0}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->d0(Ljava/math/BigDecimal;Lcom/kubi/kumex/data/trade/model/PositionEntity;)V

    .line 119
    return-void
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

.method public final e4(Lkotlin/Pair;)V
    .locals 4
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
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    check-cast v0, Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    move-result v0

    .line 24
    const/4 v1, 0x0

    .line 25
    .line 26
    if-eqz v0, :cond_4

    .line 27
    .line 28
    sget p1, Lcom/kubi/kumex/R$string;->kumex_modify_margin_reduce_submit_success:I

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lcom/kubi/utils/ToastCompat;->C(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->v3()Z

    .line 35
    move-result p1

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->Z3()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/kubi/futures/trade/position/vm/e2;->I()V

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    instance-of v0, p1, Lcom/kubi/futures/trade/position/ModifyMarginDialog;

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    check-cast p1, Lcom/kubi/futures/trade/position/ModifyMarginDialog;

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move-object p1, v1

    .line 57
    .line 58
    :goto_0
    if-eqz p1, :cond_3

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismissAllowingStateLoss()V

    .line 62
    .line 63
    :cond_3
    const-string p1, "success"

    .line 64
    goto :goto_1

    .line 65
    .line 66
    .line 67
    :cond_4
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    check-cast p1, Ljava/lang/Throwable;

    .line 71
    .line 72
    .line 73
    invoke-static {p0, p1}, Lcom/kubi/kumex/utils/m0;->e(Landroidx/lifecycle/LifecycleOwner;Ljava/lang/Throwable;)V

    .line 74
    .line 75
    const-string p1, "failure"

    .line 76
    .line 77
    .line 78
    :goto_1
    invoke-static {}, Lcom/kubi/kumex/utils/n0;->b()Ljava/lang/String;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    new-instance v2, Lorg/json/JSONObject;

    .line 82
    .line 83
    .line 84
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 85
    .line 86
    const-string v3, "AdjResult"

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 90
    .line 91
    const-string p1, "MarginDirection"

    .line 92
    .line 93
    const-string v3, "AddMargin"

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, p1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->u3()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 100
    move-result-object p1

    .line 101
    .line 102
    if-eqz p1, :cond_5

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 106
    move-result p1

    .line 107
    .line 108
    .line 109
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 110
    move-result-object v1

    .line 111
    .line 112
    .line 113
    :cond_5
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 114
    move-result p1

    .line 115
    .line 116
    .line 117
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 118
    move-result-object p1

    .line 119
    .line 120
    const-string v1, "isTrialFunds"

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 124
    .line 125
    const-string p1, "positionMode"

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->H3()Ljava/lang/String;

    .line 129
    move-result-object v1

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 133
    .line 134
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 135
    .line 136
    const-string p1, "AdjustMargin"

    .line 137
    .line 138
    const-string v1, "6"

    .line 139
    .line 140
    .line 141
    invoke-static {v0, p1, v1, v2}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 142
    return-void
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

.method public final f4()V
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
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->r3()Ljava/math/BigDecimal;

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
    sget v2, Lcom/kubi/kumex/R$string;->kumex_modify_margin_add_error_tips:I

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
    :cond_4
    iget-object v0, v0, Ldm/v1;->D:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/kubi/resources/widget/button/KcPrimaryButton;->o()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->v4()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->Z3()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

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
    invoke-virtual {v0, v3, v4, v2, v1}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->l0(Ljava/lang/String;ZLjava/math/BigDecimal;Ljava/lang/String;)V

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

.method public final g4(Lcom/kubi/futures/view/ModifyMarginInputView;)V
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
    sget v0, Lcom/kubi/kumex/R$string;->kumex_modify_margin_add_margin:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lcom/kubi/futures/view/ModifyMarginInputView;->setSubTitleRes(I)V

    .line 28
    .line 29
    new-instance v0, Lcom/kubi/futures/trade/position/d;

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, p1, p0}, Lcom/kubi/futures/trade/position/d;-><init>(Lcom/kubi/futures/view/ModifyMarginInputView;Lcom/kubi/futures/trade/position/AddMarginFragment;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Lcom/kubi/futures/view/ModifyMarginInputView;->setActionListener(Lkotlin/jvm/functions/Function0;)V

    .line 36
    .line 37
    new-instance v0, Lcom/kubi/futures/trade/position/e;

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, p0}, Lcom/kubi/futures/trade/position/e;-><init>(Lcom/kubi/futures/trade/position/AddMarginFragment;)V

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

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 7
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
    :cond_0
    iget-object p2, p1, Ldm/v1;->z:Lcom/kubi/resources/widget/DashTextView;

    .line 18
    const/4 v0, 0x0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, v0, v0, v0, v0}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 22
    .line 23
    iget-object p2, p1, Ldm/v1;->z:Lcom/kubi/resources/widget/DashTextView;

    .line 24
    .line 25
    sget v0, Lcom/kubi/kumex/R$string;->uta_isolate_margin_max_add_title:I

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(I)V

    .line 29
    .line 30
    iget-object p2, p1, Ldm/v1;->z:Lcom/kubi/resources/widget/DashTextView;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->v3()Z

    .line 34
    move-result v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, v0}, Lcom/kubi/resources/widget/DashTextView;->setNeedDash(Z)V

    .line 38
    .line 39
    iget-object v1, p1, Ldm/v1;->z:Lcom/kubi/resources/widget/DashTextView;

    .line 40
    .line 41
    const-string p2, "questionLabel"

    .line 42
    .line 43
    .line 44
    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    new-instance v4, Lcom/kubi/futures/trade/position/a;

    .line 47
    .line 48
    .line 49
    invoke-direct {v4, p0}, Lcom/kubi/futures/trade/position/a;-><init>(Lcom/kubi/futures/trade/position/AddMarginFragment;)V

    .line 50
    const/4 v5, 0x1

    .line 51
    const/4 v6, 0x0

    .line 52
    .line 53
    const-wide/16 v2, 0x0

    .line 54
    .line 55
    .line 56
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 57
    .line 58
    iget-object p2, p1, Ldm/v1;->b:Lcom/kubi/resources/widget/BaseTextView;

    .line 59
    .line 60
    sget v0, Lcom/kubi/kumex/R$string;->kumex_modify_margin_add_after:I

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(I)V

    .line 64
    .line 65
    iget-object v1, p1, Ldm/v1;->D:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 66
    .line 67
    const-string p2, "tvConfirm"

    .line 68
    .line 69
    .line 70
    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    new-instance v4, Lcom/kubi/futures/trade/position/g;

    .line 73
    .line 74
    .line 75
    invoke-direct {v4, p0}, Lcom/kubi/futures/trade/position/g;-><init>(Lcom/kubi/futures/trade/position/AddMarginFragment;)V

    .line 76
    .line 77
    .line 78
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 79
    .line 80
    iget-object p2, p1, Ldm/v1;->e:Lcom/kubi/resources/widget/KcSmallSwitchButton;

    .line 81
    .line 82
    const-string v0, "autoSwitch"

    .line 83
    .line 84
    .line 85
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    new-instance v0, Lcom/kubi/futures/trade/position/h;

    .line 88
    .line 89
    .line 90
    invoke-direct {v0, p0}, Lcom/kubi/futures/trade/position/h;-><init>(Lcom/kubi/futures/trade/position/AddMarginFragment;)V

    .line 91
    .line 92
    .line 93
    invoke-static {p2, v0}, Lcom/kubi/kumex/utils/ViewExKt;->m(Landroidx/appcompat/widget/SwitchCompat;Lkotlin/jvm/functions/Function1;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->Y3()Lcom/kubi/futures/trade/vm/u;

    .line 97
    move-result-object p2

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2}, Lcom/kubi/futures/trade/vm/u;->b()V

    .line 101
    .line 102
    iget-object p2, p1, Ldm/v1;->n:Lcom/kubi/futures/view/ModifyMarginInputView;

    .line 103
    .line 104
    const-string v0, "inputView"

    .line 105
    .line 106
    .line 107
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, p2}, Lcom/kubi/futures/trade/position/AddMarginFragment;->g4(Lcom/kubi/futures/view/ModifyMarginInputView;)V

    .line 111
    .line 112
    .line 113
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->j4()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->Z3()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

    .line 117
    move-result-object p2

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->u3()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 121
    move-result-object v0

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2, v0}, Lcom/kubi/futures/trade/position/vm/e2;->z(Lcom/kubi/kumex/data/trade/model/PositionEntity;)V

    .line 125
    .line 126
    iget-object p1, p1, Ldm/v1;->c:Landroidx/constraintlayout/widget/Group;

    .line 127
    .line 128
    const-string p2, "autoGroup"

    .line 129
    .line 130
    .line 131
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    sget-object p2, Lcom/kubi/broker/BrokerConfig;->a:Lcom/kubi/broker/BrokerConfig;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2}, Lcom/kubi/broker/BrokerConfig;->d()Lcom/kubi/broker/f;

    .line 137
    move-result-object p2

    .line 138
    .line 139
    .line 140
    invoke-interface {p2}, Lcom/kubi/broker/f;->C0()Z

    .line 141
    move-result p2

    .line 142
    .line 143
    .line 144
    invoke-static {p1, p2}, Lcom/kubi/utils/extensions/k;->G(Landroid/view/View;Z)V

    .line 145
    return-void
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
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->v3()Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->Z3()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->a0()Landroidx/lifecycle/MutableLiveData;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    check-cast v0, Ljava/math/BigDecimal;

    .line 22
    goto :goto_0

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->Y3()Lcom/kubi/futures/trade/vm/u;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/kubi/futures/trade/vm/u;->z()Landroidx/lifecycle/MutableLiveData;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    check-cast v0, Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;->getAvailableBalance()Ljava/math/BigDecimal;

    .line 42
    move-result-object v0

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move-object v0, v1

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->t3()Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    .line 57
    invoke-static {v2}, Lfm/b;->c(Lcom/kubi/kumex/data/platform/model/ContractEntity;)I

    .line 58
    move-result v1

    .line 59
    .line 60
    .line 61
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    move-result-object v1

    .line 63
    :cond_2
    const/4 v2, 0x2

    .line 64
    .line 65
    .line 66
    invoke-static {v1, v2}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 67
    move-result v1

    .line 68
    .line 69
    sget-object v2, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1, v2}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    const-string v1, "setScale(...)"

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    return-object v0
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

.method public final r4(Ljava/math/BigDecimal;)V
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
    iget-object v1, v1, Ldm/v1;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    if-eqz p1, :cond_3

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->t3()Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 23
    move-result-object v3

    .line 24
    .line 25
    if-eqz v3, :cond_2

    .line 26
    .line 27
    .line 28
    invoke-static {v3}, Lfm/b;->c(Lcom/kubi/kumex/data/platform/model/ContractEntity;)I

    .line 29
    move-result v2

    .line 30
    .line 31
    .line 32
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    move-result-object v2

    .line 34
    :cond_2
    const/4 v3, 0x2

    .line 35
    .line 36
    .line 37
    invoke-static {v2, v3}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 38
    move-result v6

    .line 39
    .line 40
    const/16 v12, 0x69

    .line 41
    const/4 v13, 0x0

    .line 42
    const/4 v5, 0x0

    .line 43
    const/4 v7, 0x1

    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v9, 0x1

    .line 46
    const/4 v10, 0x0

    .line 47
    const/4 v11, 0x0

    .line 48
    move-object v4, p1

    .line 49
    .line 50
    .line 51
    invoke-static/range {v4 .. v13}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    .line 55
    :cond_3
    invoke-static {}, Lfm/d;->y()Ljava/lang/String;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    .line 59
    invoke-static {v2, p1}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    move-result-object v3

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSettleCurrency()Ljava/lang/String;

    .line 64
    move-result-object p1

    .line 65
    .line 66
    .line 67
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    .line 71
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    move-result-object v4

    .line 73
    const/4 v7, 0x4

    .line 74
    const/4 v8, 0x0

    .line 75
    const/4 v5, 0x1

    .line 76
    const/4 v6, 0x0

    .line 77
    .line 78
    .line 79
    invoke-static/range {v3 .. v8}, Lnf/b;->g(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 80
    move-result-object p1

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    return-void
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

.method public final v4()V
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
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->Z3()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

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
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/AddMarginFragment;->Z3()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

    .line 34
    move-result-object v4

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->Z()Landroidx/lifecycle/MutableLiveData;

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
    const-string v6, "AddMargin"

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
