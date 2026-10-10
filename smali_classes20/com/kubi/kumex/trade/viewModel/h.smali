.class public final Lcom/kubi/kumex/trade/viewModel/h;
.super Ljava/lang/Object;
.source "OrdersNumViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "findFuturesOrdersNumViewModel",
        "Lcom/kubi/kumex/trade/viewModel/OrdersNumViewModel;",
        "Landroidx/fragment/app/Fragment;",
        "KumexLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOrdersNumViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersNumViewModel.kt\ncom/kubi/kumex/trade/viewModel/OrdersNumViewModelKt\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,156:1\n220#2,5:157\n220#2,5:162\n*S KotlinDebug\n*F\n+ 1 OrdersNumViewModel.kt\ncom/kubi/kumex/trade/viewModel/OrdersNumViewModelKt\n*L\n152#1:157,5\n154#1:162,5\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Landroidx/fragment/app/Fragment;)Lcom/kubi/kumex/trade/viewModel/OrdersNumViewModel;
    .locals 2
    .param p0    # Landroidx/fragment/app/Fragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    instance-of v0, p0, Lcom/kubi/kumex/trade/FuturesFragment;

    .line 8
    .line 9
    const-class v1, Lcom/kubi/kumex/trade/viewModel/OrdersNumViewModel;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p0}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    .line 20
    move-result-object p0

    .line 21
    .line 22
    check-cast p0, Lcom/kubi/kumex/trade/viewModel/OrdersNumViewModel;

    .line 23
    return-object p0

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lcom/kubi/kumex/trade/viewModel/h;->a(Landroidx/fragment/app/Fragment;)Lcom/kubi/kumex/trade/viewModel/OrdersNumViewModel;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    if-nez v0, :cond_1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return-object v0

    .line 38
    .line 39
    :cond_2
    :goto_0
    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, p0}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    .line 46
    move-result-object p0

    .line 47
    .line 48
    check-cast p0, Lcom/kubi/kumex/trade/viewModel/OrdersNumViewModel;

    .line 49
    return-object p0
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
.end method
