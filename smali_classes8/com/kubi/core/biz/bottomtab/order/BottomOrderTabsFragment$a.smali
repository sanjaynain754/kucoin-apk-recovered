.class public final Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment$a;
.super Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;
.source "BottomOrderTabsFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment$onViewCreated$1",
        "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;",
        "onPageSelected",
        "",
        "position",
        "",
        "TradeCoreBizLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic b:Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;


# direct methods
.method public constructor <init>(Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment$a;->b:Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;-><init>()V

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
.end method


# virtual methods
.method public onPageSelected(I)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;->onPageSelected(I)V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment$a;->b:Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;->T3(Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;)V

    .line 9
    .line 10
    iget-object v0, p0, Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment$a;->b:Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;->R3(Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;)Ljava/util/List;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    check-cast p1, Lcom/kubi/core/biz/bottomtab/order/child/a;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/kubi/core/biz/bottomtab/order/child/a;->c()Lcom/kubi/core/base/order/data/OrderLevelType;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    new-instance v0, Lcom/kubi/core/biz/bottomtab/BottomBizGroupContract$UiIntent$SelectedTabBiz;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, p1}, Lcom/kubi/core/biz/bottomtab/BottomBizGroupContract$UiIntent$SelectedTabBiz;-><init>(Lcom/kubi/core/base/order/data/OrderLevelType;)V

    .line 30
    .line 31
    iget-object v1, p0, Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment$a;->b:Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;->P3(Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;)Lcom/kubi/core/biz/bottomtab/TradeBottomVM;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v0}, Lcom/kubi/core/biz/bottomtab/TradeBottomVM;->D(Lcom/kubi/core/biz/bottomtab/BottomBizGroupContract$UiIntent;)V

    .line 39
    .line 40
    sget-object v0, Lcom/kubi/core/base/order/data/OrderLevelType$Normal;->INSTANCE:Lcom/kubi/core/base/order/data/OrderLevelType$Normal;

    .line 41
    .line 42
    .line 43
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    move-result p1

    .line 45
    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    iget-object p1, p0, Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment$a;->b:Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;->S3(Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;)Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiState;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiState;->getCancelAllActiveEnable()Z

    .line 56
    move-result v0

    .line 57
    .line 58
    .line 59
    invoke-static {p1, v0}, Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;->V3(Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;Z)V

    .line 60
    return-void

    .line 61
    .line 62
    :cond_0
    iget-object p1, p0, Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment$a;->b:Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;->S3(Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;)Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiState;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiState;->getCancelAllAdvancedEnable()Z

    .line 70
    move-result v0

    .line 71
    .line 72
    .line 73
    invoke-static {p1, v0}, Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;->V3(Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;Z)V

    .line 74
    return-void
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
.end method
