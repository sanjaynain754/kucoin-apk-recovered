.class public final Lcom/kubi/kumex/trade/menu/announcement/NewPairAnnouncementFragment;
.super Lcom/kubi/kumex/trade/menu/announcement/BaseAnnouncementTypeFragment;
.source "NewPairAnnouncementFragment.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0014J\u0008\u0010\u000e\u001a\u00020\u000bH\u0014J\u0016\u0010\u000f\u001a\u00020\u000b2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/kubi/kumex/trade/menu/announcement/NewPairAnnouncementFragment;",
        "Lcom/kubi/kumex/trade/menu/announcement/BaseAnnouncementTypeFragment;",
        "<init>",
        "()V",
        "viewModel",
        "Lcom/kubi/kumex/trade/menu/vm/AnnouncementViewModel;",
        "getViewModel",
        "()Lcom/kubi/kumex/trade/menu/vm/AnnouncementViewModel;",
        "viewModel$delegate",
        "Lkotlin/Lazy;",
        "initView",
        "",
        "view",
        "Landroid/view/View;",
        "refresh",
        "bindData",
        "data",
        "",
        "Lcom/kubi/kumex/data/platform/model/Article;",
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


# instance fields
.field public final Y:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/kumex/trade/menu/vm/AnnouncementType;->NEW_TRADING_PAIR:Lcom/kubi/kumex/trade/menu/vm/AnnouncementType;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/kubi/kumex/trade/menu/announcement/BaseAnnouncementTypeFragment;-><init>(Lcom/kubi/kumex/trade/menu/vm/AnnouncementType;)V

    .line 6
    .line 7
    new-instance v0, Lcom/kubi/kumex/trade/menu/announcement/j;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, p0}, Lcom/kubi/kumex/trade/menu/announcement/j;-><init>(Lcom/kubi/kumex/trade/menu/announcement/NewPairAnnouncementFragment;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/kubi/kumex/trade/menu/announcement/NewPairAnnouncementFragment;->Y:Lkotlin/Lazy;

    .line 17
    return-void
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
.end method

.method private final A3()Lcom/kubi/kumex/trade/menu/vm/AnnouncementViewModel;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/trade/menu/announcement/NewPairAnnouncementFragment;->Y:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/kumex/trade/menu/vm/AnnouncementViewModel;

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
.end method

.method public static final B3(Lcom/kubi/kumex/trade/menu/announcement/NewPairAnnouncementFragment;Lkotlin/Pair;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Ljava/lang/Boolean;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/kumex/trade/menu/announcement/BaseAnnouncementTypeFragment;->w3()V

    .line 16
    goto :goto_0

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    check-cast p1, Ljava/util/List;

    .line 23
    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/kubi/kumex/trade/menu/announcement/BaseAnnouncementTypeFragment;->u3()V

    .line 28
    goto :goto_0

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/kumex/trade/menu/announcement/BaseAnnouncementTypeFragment;->showContent()V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, p1}, Lcom/kubi/kumex/trade/menu/announcement/NewPairAnnouncementFragment;->z3(Ljava/util/List;)V

    .line 35
    .line 36
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 37
    return-object p0
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
.end method

.method public static final C3(Lcom/kubi/kumex/trade/menu/announcement/NewPairAnnouncementFragment;)Lcom/kubi/kumex/trade/menu/vm/AnnouncementViewModel;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/kumex/trade/menu/vm/a;->a(Landroidx/fragment/app/Fragment;)Lcom/kubi/kumex/trade/menu/vm/AnnouncementViewModel;

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
.end method

.method public static synthetic x3(Lcom/kubi/kumex/trade/menu/announcement/NewPairAnnouncementFragment;Lkotlin/Pair;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/kumex/trade/menu/announcement/NewPairAnnouncementFragment;->B3(Lcom/kubi/kumex/trade/menu/announcement/NewPairAnnouncementFragment;Lkotlin/Pair;)Lkotlin/Unit;

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
.end method

.method public static synthetic y3(Lcom/kubi/kumex/trade/menu/announcement/NewPairAnnouncementFragment;)Lcom/kubi/kumex/trade/menu/vm/AnnouncementViewModel;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/kumex/trade/menu/announcement/NewPairAnnouncementFragment;->C3(Lcom/kubi/kumex/trade/menu/announcement/NewPairAnnouncementFragment;)Lcom/kubi/kumex/trade/menu/vm/AnnouncementViewModel;

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
.end method

.method private final z3(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/kumex/data/platform/model/Article;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/kumex/trade/menu/announcement/BaseAnnouncementTypeFragment;->t3()V

    .line 10
    return-void

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/kumex/trade/menu/announcement/BaseAnnouncementTypeFragment;->s3()Landroidx/recyclerview/widget/RecyclerView;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    .line 24
    :goto_0
    const-string v1, "null cannot be cast to non-null type com.kubi.kumex.trade.menu.announcement.AnnouncementTypeAdapter"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    check-cast v0, Lcom/kubi/kumex/trade/menu/announcement/AnnouncementTypeAdapter;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lcom/kubi/kumex/trade/menu/announcement/AnnouncementTypeAdapter;->i(Ljava/util/List;)V

    .line 33
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
.end method


# virtual methods
.method public B0()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/kumex/trade/menu/announcement/NewPairAnnouncementFragment;->A3()Lcom/kubi/kumex/trade/menu/vm/AnnouncementViewModel;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-object v1, Lcom/kubi/sdk/function/language/a;->g:Lcom/kubi/sdk/function/language/LanguageType;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/kubi/sdk/function/language/LanguageType;->getLocalString()Ljava/lang/String;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    sget-object v2, Lcom/kubi/kumex/trade/menu/vm/AnnouncementType;->NEW_TRADING_PAIR:Lcom/kubi/kumex/trade/menu/vm/AnnouncementType;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Lcom/kubi/kumex/trade/menu/vm/AnnouncementViewModel;->d(Ljava/lang/String;Lcom/kubi/kumex/trade/menu/vm/AnnouncementType;)V

    .line 16
    return-void
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
.end method

.method public o3(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
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
    invoke-direct {p0}, Lcom/kubi/kumex/trade/menu/announcement/NewPairAnnouncementFragment;->A3()Lcom/kubi/kumex/trade/menu/vm/AnnouncementViewModel;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/kubi/kumex/trade/menu/vm/AnnouncementViewModel;->q()Landroidx/lifecycle/MutableLiveData;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    new-instance v1, Lcom/kubi/kumex/trade/menu/announcement/k;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, p0}, Lcom/kubi/kumex/trade/menu/announcement/k;-><init>(Lcom/kubi/kumex/trade/menu/announcement/NewPairAnnouncementFragment;)V

    .line 23
    .line 24
    new-instance v2, Lcom/kubi/kumex/trade/menu/announcement/NewPairAnnouncementFragment$a;

    .line 25
    .line 26
    .line 27
    invoke-direct {v2, v1}, Lcom/kubi/kumex/trade/menu/announcement/NewPairAnnouncementFragment$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/kubi/kumex/trade/menu/announcement/NewPairAnnouncementFragment;->B0()V

    .line 34
    return-void
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
.end method
