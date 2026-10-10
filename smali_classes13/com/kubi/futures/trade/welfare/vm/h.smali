.class public final Lcom/kubi/futures/trade/welfare/vm/h;
.super Ljava/lang/Object;
.source "SelectFuturesWelfareViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "findSelectFuturesWelfareViewModel",
        "Lcom/kubi/futures/trade/welfare/vm/SelectFuturesWelfareViewModel;",
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
        "SMAP\nSelectFuturesWelfareViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectFuturesWelfareViewModel.kt\ncom/kubi/futures/trade/welfare/vm/SelectFuturesWelfareViewModelKt\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n220#2,5:548\n1869#3:553\n1870#3:555\n1#4:554\n*S KotlinDebug\n*F\n+ 1 SelectFuturesWelfareViewModel.kt\ncom/kubi/futures/trade/welfare/vm/SelectFuturesWelfareViewModelKt\n*L\n533#1:548,5\n535#1:553\n535#1:555\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Landroidx/fragment/app/Fragment;)Lcom/kubi/futures/trade/welfare/vm/SelectFuturesWelfareViewModel;
    .locals 2
    .param p0    # Landroidx/fragment/app/Fragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
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
    instance-of v0, p0, Lcom/kubi/futures/trade/submit/FuturesSubmitFragment;

    .line 8
    .line 9
    if-nez v0, :cond_4

    .line 10
    .line 11
    instance-of v0, p0, Lcom/kubi/kumex/market/v2/KuMexSubmitBottomSheetFragment;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    goto :goto_0

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    const-string v1, "getFragments(...)"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    move-result v1

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 44
    .line 45
    .line 46
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v1}, Lcom/kubi/futures/trade/welfare/vm/h;->a(Landroidx/fragment/app/Fragment;)Lcom/kubi/futures/trade/welfare/vm/SelectFuturesWelfareViewModel;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    if-eqz v1, :cond_1

    .line 53
    return-object v1

    .line 54
    .line 55
    .line 56
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 57
    move-result-object p0

    .line 58
    .line 59
    if-eqz p0, :cond_3

    .line 60
    .line 61
    .line 62
    invoke-static {p0}, Lcom/kubi/futures/trade/welfare/vm/h;->a(Landroidx/fragment/app/Fragment;)Lcom/kubi/futures/trade/welfare/vm/SelectFuturesWelfareViewModel;

    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_3
    const/4 p0, 0x0

    .line 66
    return-object p0

    .line 67
    .line 68
    :cond_4
    :goto_0
    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    .line 69
    .line 70
    .line 71
    invoke-direct {v0, p0}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;)V

    .line 72
    .line 73
    const-class p0, Lcom/kubi/futures/trade/welfare/vm/SelectFuturesWelfareViewModel;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, p0}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    .line 77
    move-result-object p0

    .line 78
    .line 79
    check-cast p0, Lcom/kubi/futures/trade/welfare/vm/SelectFuturesWelfareViewModel;

    .line 80
    return-object p0
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
