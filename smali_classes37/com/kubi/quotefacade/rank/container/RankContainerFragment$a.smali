.class public final Lcom/kubi/quotefacade/rank/container/RankContainerFragment$a;
.super Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;
.source "RankContainerFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/quotefacade/rank/container/RankContainerFragment;-><init>()V
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
        "com/kubi/quotefacade/rank/container/RankContainerFragment$onPageChangeListener$1",
        "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;",
        "onPageSelected",
        "",
        "position",
        "",
        "QuoteFacadeLib_googleRelease"
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
.field public final synthetic b:Lcom/kubi/quotefacade/rank/container/RankContainerFragment;


# direct methods
.method public constructor <init>(Lcom/kubi/quotefacade/rank/container/RankContainerFragment;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/quotefacade/rank/container/RankContainerFragment$a;->b:Lcom/kubi/quotefacade/rank/container/RankContainerFragment;

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
.end method


# virtual methods
.method public onPageSelected(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/rank/container/RankContainerFragment$a;->b:Lcom/kubi/quotefacade/rank/container/RankContainerFragment;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/kubi/quotefacade/rank/container/RankContainerFragment;->C3(Lcom/kubi/quotefacade/rank/container/RankContainerFragment;)Lcom/kubi/quotefacade/rank/config/RankTabConfig;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/quotefacade/rank/config/RankTabConfig;->isNewRankTab()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/kubi/quotefacade/rank/container/RankContainerFragment$a;->b:Lcom/kubi/quotefacade/rank/container/RankContainerFragment;

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/kubi/quotefacade/rank/container/RankContainerFragment;->A3(Lcom/kubi/quotefacade/rank/container/RankContainerFragment;)Lbv/y;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, v0, Lbv/y;->b:Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->r(I)V

    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, Lcom/kubi/quotefacade/rank/container/RankContainerFragment$a;->b:Lcom/kubi/quotefacade/rank/container/RankContainerFragment;

    .line 30
    .line 31
    .line 32
    invoke-static {v0, p1}, Lcom/kubi/quotefacade/rank/container/RankContainerFragment;->z3(Lcom/kubi/quotefacade/rank/container/RankContainerFragment;I)V

    .line 33
    .line 34
    iget-object v0, p0, Lcom/kubi/quotefacade/rank/container/RankContainerFragment$a;->b:Lcom/kubi/quotefacade/rank/container/RankContainerFragment;

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lcom/kubi/quotefacade/rank/container/RankContainerFragment;->C3(Lcom/kubi/quotefacade/rank/container/RankContainerFragment;)Lcom/kubi/quotefacade/rank/config/RankTabConfig;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/kubi/quotefacade/rank/config/RankTabConfig;->getSubTabs()Ljava/util/List;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    check-cast p1, Lcom/kubi/quotefacade/rank/config/RankSubTabItemConfig;

    .line 49
    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/kubi/quotefacade/rank/config/RankSubTabItemConfig;->getType()Ljava/lang/String;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    iget-object v0, p0, Lcom/kubi/quotefacade/rank/container/RankContainerFragment$a;->b:Lcom/kubi/quotefacade/rank/container/RankContainerFragment;

    .line 59
    .line 60
    .line 61
    invoke-static {v0, p1}, Lcom/kubi/quotefacade/rank/container/RankContainerFragment;->E3(Lcom/kubi/quotefacade/rank/container/RankContainerFragment;Ljava/lang/String;)V

    .line 62
    :cond_1
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
.end method
