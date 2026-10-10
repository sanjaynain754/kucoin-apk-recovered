.class public final Lcom/kubi/futures/trade/y0;
.super Ljava/lang/Object;
.source "FuturesTradeViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "findFuturesTradeViewModel",
        "Lcom/kubi/futures/trade/FuturesTradeViewModel;",
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
        "SMAP\nFuturesTradeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesTradeViewModel.kt\ncom/kubi/futures/trade/FuturesTradeViewModelKt\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,596:1\n220#2,5:597\n220#2,5:602\n*S KotlinDebug\n*F\n+ 1 FuturesTradeViewModel.kt\ncom/kubi/futures/trade/FuturesTradeViewModelKt\n*L\n591#1:597,5\n593#1:602,5\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Landroidx/fragment/app/Fragment;)Lcom/kubi/futures/trade/FuturesTradeViewModel;
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
    instance-of v0, p0, Lcom/kubi/futures/trade/FuturesTradeFragment;

    .line 8
    .line 9
    const-class v1, Lcom/kubi/futures/trade/FuturesTradeViewModel;

    .line 10
    .line 11
    if-nez v0, :cond_3

    .line 12
    .line 13
    instance-of v0, p0, Lcom/kubi/kumex/market/v2/KuMexSubmitBottomSheetFragment;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    goto :goto_1

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lcom/kubi/futures/trade/y0;->a(Landroidx/fragment/app/Fragment;)Lcom/kubi/futures/trade/FuturesTradeViewModel;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-object v0

    .line 31
    .line 32
    :cond_2
    :goto_0
    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, p0}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    .line 39
    move-result-object p0

    .line 40
    .line 41
    check-cast p0, Lcom/kubi/futures/trade/FuturesTradeViewModel;

    .line 42
    return-object p0

    .line 43
    .line 44
    :cond_3
    :goto_1
    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    .line 45
    .line 46
    .line 47
    invoke-direct {v0, p0}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    .line 51
    move-result-object p0

    .line 52
    .line 53
    check-cast p0, Lcom/kubi/futures/trade/FuturesTradeViewModel;

    .line 54
    return-object p0
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
.end method
