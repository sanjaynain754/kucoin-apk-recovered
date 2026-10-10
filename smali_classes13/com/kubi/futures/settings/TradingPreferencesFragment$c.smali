.class public final Lcom/kubi/futures/settings/TradingPreferencesFragment$c;
.super Ljava/lang/Object;
.source "TradingPreferencesFragment.kt"

# interfaces
.implements Lcom/kubi/sdk/j2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/futures/settings/TradingPreferencesFragment;->X3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/kubi/futures/settings/TradingPreferencesFragment$initObserver$7",
        "Lcom/kubi/sdk/FragmentResultListener;",
        "onFragmentResult",
        "",
        "result",
        "Landroid/os/Bundle;",
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
.field public final synthetic a:Lcom/kubi/futures/settings/TradingPreferencesFragment;


# direct methods
.method public constructor <init>(Lcom/kubi/futures/settings/TradingPreferencesFragment;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/futures/settings/TradingPreferencesFragment$c;->a:Lcom/kubi/futures/settings/TradingPreferencesFragment;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 9

    .line 1
    .line 2
    const-string v0, "result"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "symbol"

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    iget-object v1, p0, Lcom/kubi/futures/settings/TradingPreferencesFragment$c;->a:Lcom/kubi/futures/settings/TradingPreferencesFragment;

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lcom/kubi/futures/settings/TradingPreferencesFragment;->I3(Lcom/kubi/futures/settings/TradingPreferencesFragment;)Ljava/lang/String;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    return-void

    .line 25
    .line 26
    :cond_0
    const-string v0, "data_1"

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 30
    move-result v0

    .line 31
    .line 32
    const-string v1, "data_2"

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 36
    move-result p1

    .line 37
    .line 38
    iget-object v1, p0, Lcom/kubi/futures/settings/TradingPreferencesFragment$c;->a:Lcom/kubi/futures/settings/TradingPreferencesFragment;

    .line 39
    .line 40
    .line 41
    invoke-static {v1}, Lcom/kubi/futures/settings/TradingPreferencesFragment;->J3(Lcom/kubi/futures/settings/TradingPreferencesFragment;)Lcom/kubi/futures/settings/vm/TradingPreferenceViewModel;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/kubi/futures/settings/vm/TradingPreferenceViewModel;->n()Landroidx/lifecycle/MutableLiveData;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    check-cast v1, Lcom/kubi/kumex/data/trade/model/AutoDepositStatus;

    .line 53
    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    new-instance v2, Lcom/kubi/kumex/data/trade/model/AutoDepositStatus;

    .line 57
    const/4 v6, 0x7

    .line 58
    const/4 v7, 0x0

    .line 59
    const/4 v3, 0x0

    .line 60
    const/4 v4, 0x0

    .line 61
    const/4 v5, 0x0

    .line 62
    .line 63
    .line 64
    invoke-direct/range {v2 .. v7}, Lcom/kubi/kumex/data/trade/model/AutoDepositStatus;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 65
    move-object v3, v2

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    move-object v3, v1

    .line 68
    .line 69
    :goto_0
    iget-object v1, p0, Lcom/kubi/futures/settings/TradingPreferencesFragment$c;->a:Lcom/kubi/futures/settings/TradingPreferencesFragment;

    .line 70
    .line 71
    .line 72
    invoke-static {v1}, Lcom/kubi/futures/settings/TradingPreferencesFragment;->J3(Lcom/kubi/futures/settings/TradingPreferencesFragment;)Lcom/kubi/futures/settings/vm/TradingPreferenceViewModel;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Lcom/kubi/futures/settings/vm/TradingPreferenceViewModel;->n()Landroidx/lifecycle/MutableLiveData;

    .line 77
    move-result-object v1

    .line 78
    .line 79
    .line 80
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 81
    move-result-object v4

    .line 82
    .line 83
    .line 84
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 85
    move-result-object v5

    .line 86
    const/4 v7, 0x4

    .line 87
    const/4 v8, 0x0

    .line 88
    const/4 v6, 0x0

    .line 89
    .line 90
    .line 91
    invoke-static/range {v3 .. v8}, Lcom/kubi/kumex/data/trade/model/AutoDepositStatus;->copy$default(Lcom/kubi/kumex/data/trade/model/AutoDepositStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/kubi/kumex/data/trade/model/AutoDepositStatus;

    .line 92
    move-result-object p1

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 96
    return-void
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
