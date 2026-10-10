.class public final Lcom/kubi/futures/trade/order/modify/u0;
.super Lcom/kubi/sdk/h2;
.source "TakerStopViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J>\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0008\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u00122\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001bJF\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u00122\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020\u0006J>\u0010 \u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0008\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u00122\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001bJF\u0010!\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u00122\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020\u0006R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0008R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u0008R\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u0008R#\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0008\u00a8\u0006\""
    }
    d2 = {
        "Lcom/kubi/futures/trade/order/modify/TakerStopViewModel;",
        "Lcom/kubi/sdk/BaseViewModel;",
        "<init>",
        "()V",
        "takerRate",
        "Landroidx/lifecycle/MutableLiveData;",
        "",
        "getTakerRate",
        "()Landroidx/lifecycle/MutableLiveData;",
        "takerPrice",
        "getTakerPrice",
        "stopRate",
        "getStopRate",
        "stopPrice",
        "getStopPrice",
        "triggerTypeIndex",
        "Lkotlin/Pair;",
        "",
        "",
        "getTriggerTypeIndex",
        "calculateTakerRateByTakerPrice",
        "",
        "owner",
        "Landroidx/lifecycle/LifecycleOwner;",
        "contract",
        "Lcom/kubi/kumex/data/platform/model/ContractEntity;",
        "delegationPrice",
        "Ljava/math/BigDecimal;",
        "isBuy",
        "leverage",
        "calculateTakerPriceByTakerRate",
        "takerType",
        "calculateStopRateByStopPrice",
        "calculateStopPriceByStopRate",
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
.field public final X:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Y:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Z:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final a0:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b0:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/sdk/h2;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kubi/futures/trade/order/modify/u0;->X:Landroidx/lifecycle/MutableLiveData;

    .line 11
    .line 12
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/kubi/futures/trade/order/modify/u0;->Y:Landroidx/lifecycle/MutableLiveData;

    .line 18
    .line 19
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 23
    .line 24
    iput-object v0, p0, Lcom/kubi/futures/trade/order/modify/u0;->Z:Landroidx/lifecycle/MutableLiveData;

    .line 25
    .line 26
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 30
    .line 31
    iput-object v0, p0, Lcom/kubi/futures/trade/order/modify/u0;->a0:Landroidx/lifecycle/MutableLiveData;

    .line 32
    .line 33
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 34
    .line 35
    .line 36
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 37
    .line 38
    iput-object v0, p0, Lcom/kubi/futures/trade/order/modify/u0;->b0:Landroidx/lifecycle/MutableLiveData;

    .line 39
    return-void
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


# virtual methods
.method public final p(Landroidx/lifecycle/LifecycleOwner;Lcom/kubi/kumex/data/platform/model/ContractEntity;Ljava/math/BigDecimal;Ljava/lang/String;ZLjava/math/BigDecimal;Ljava/lang/String;)V
    .locals 10
    .param p1    # Landroidx/lifecycle/LifecycleOwner;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/kumex/data/platform/model/ContractEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v0, p7

    .line 3
    .line 4
    const-string v1, "owner"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    const-string v1, "takerType"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    if-eqz p2, :cond_6

    .line 15
    .line 16
    if-eqz p4, :cond_6

    .line 17
    .line 18
    .line 19
    invoke-static {p4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    goto/16 :goto_5

    .line 25
    .line 26
    :cond_0
    if-nez p6, :cond_1

    .line 27
    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-static {p3}, Lkf/a;->B(Ljava/math/BigDecimal;)Z

    .line 32
    move-result v1

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    sget p2, Lcom/kubi/kumex/R$string;->bkumex_stop_profit_loss_hint:I

    .line 37
    .line 38
    .line 39
    invoke-static {p1, p2}, Lcom/kubi/kumex/utils/m0;->c(Landroidx/lifecycle/LifecycleOwner;I)V

    .line 40
    return-void

    .line 41
    .line 42
    :cond_2
    sget-object p1, Lcom/kubi/kumex/logic/calculator/Calculator;->a:Lcom/kubi/kumex/logic/calculator/Calculator$Companion;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/kubi/kumex/logic/calculator/Calculator$Companion;->isolated()Lcom/kubi/kumex/logic/calculator/isolated/b;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isInverse()Z

    .line 50
    move-result v1

    .line 51
    .line 52
    .line 53
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    .line 57
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 58
    move-result v1

    .line 59
    .line 60
    .line 61
    invoke-static {p4}, Lcom/kubi/kumex/utils/w;->d(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 62
    move-result-object p4

    .line 63
    .line 64
    .line 65
    invoke-static {p4}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 66
    move-result-object v2

    .line 67
    .line 68
    new-instance v3, Ljava/math/BigDecimal;

    .line 69
    .line 70
    const/16 p4, -0x64

    .line 71
    .line 72
    .line 73
    invoke-direct {v3, p4}, Ljava/math/BigDecimal;-><init>(I)V

    .line 74
    const/4 v6, 0x6

    .line 75
    const/4 v7, 0x0

    .line 76
    const/4 v4, 0x0

    .line 77
    const/4 v5, 0x0

    .line 78
    .line 79
    .line 80
    invoke-static/range {v2 .. v7}, Lcom/kubi/kumex/logic/calculator/a;->b(Ljava/math/BigDecimal;Ljava/math/BigDecimal;ILjava/math/RoundingMode;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 81
    move-result-object v2

    .line 82
    .line 83
    const-string p4, "TP"

    .line 84
    .line 85
    .line 86
    invoke-static {v0, p4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    move-result v3

    .line 88
    .line 89
    if-eqz v3, :cond_3

    .line 90
    .line 91
    .line 92
    invoke-static {p2}, Lfm/b;->h(Lcom/kubi/kumex/data/platform/model/ContractEntity;)I

    .line 93
    move-result v3

    .line 94
    goto :goto_0

    .line 95
    .line 96
    .line 97
    :cond_3
    invoke-static {p2}, Lfm/b;->b(Lcom/kubi/kumex/data/platform/model/ContractEntity;)I

    .line 98
    move-result v3

    .line 99
    .line 100
    .line 101
    :goto_0
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getMaintainMargin()Ljava/math/BigDecimal;

    .line 102
    move-result-object v4

    .line 103
    .line 104
    const-string v5, "-1"

    .line 105
    .line 106
    .line 107
    invoke-static {v4, v5}, Lkf/a;->F(Ljava/math/BigDecimal;Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 108
    move-result-object v4

    .line 109
    .line 110
    .line 111
    invoke-static {p3}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 112
    move-result-object v5

    .line 113
    .line 114
    if-eqz p5, :cond_4

    .line 115
    .line 116
    const-string p3, "buy"

    .line 117
    :goto_1
    move-object v7, p3

    .line 118
    goto :goto_2

    .line 119
    .line 120
    :cond_4
    const-string p3, "sell"

    .line 121
    goto :goto_1

    .line 122
    .line 123
    .line 124
    :goto_2
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getMaxPrice()Ljava/math/BigDecimal;

    .line 125
    move-result-object p3

    .line 126
    .line 127
    const-string v6, "1000000"

    .line 128
    .line 129
    .line 130
    invoke-static {p3, v6}, Lkf/a;->F(Ljava/math/BigDecimal;Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 131
    move-result-object v8

    .line 132
    .line 133
    .line 134
    invoke-static {v0, p4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    move-result p3

    .line 136
    .line 137
    const-string p4, "0.01"

    .line 138
    .line 139
    if-eqz p3, :cond_5

    .line 140
    .line 141
    .line 142
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getTickSize()Ljava/math/BigDecimal;

    .line 143
    move-result-object p2

    .line 144
    .line 145
    .line 146
    :goto_3
    invoke-static {p2, p4}, Lkf/a;->F(Ljava/math/BigDecimal;Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 147
    move-result-object p2

    .line 148
    move-object v0, p1

    .line 149
    move-object v9, p2

    .line 150
    .line 151
    move-object/from16 v6, p6

    .line 152
    goto :goto_4

    .line 153
    .line 154
    .line 155
    :cond_5
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getIndexPriceTickSize()Ljava/math/BigDecimal;

    .line 156
    move-result-object p2

    .line 157
    goto :goto_3

    .line 158
    .line 159
    .line 160
    :goto_4
    invoke-virtual/range {v0 .. v9}, Lcom/kubi/kumex/logic/calculator/isolated/b;->k(ZLjava/math/BigDecimal;ILjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 161
    move-result-object p1

    .line 162
    .line 163
    iget-object p2, p0, Lcom/kubi/futures/trade/order/modify/u0;->a0:Landroidx/lifecycle/MutableLiveData;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p2, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 167
    return-void

    .line 168
    .line 169
    :cond_6
    :goto_5
    iget-object p1, p0, Lcom/kubi/futures/trade/order/modify/u0;->a0:Landroidx/lifecycle/MutableLiveData;

    .line 170
    const/4 p2, 0x0

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1, p2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 174
    return-void
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
.end method

.method public final q(Landroidx/lifecycle/LifecycleOwner;Lcom/kubi/kumex/data/platform/model/ContractEntity;Ljava/math/BigDecimal;Ljava/lang/String;ZLjava/math/BigDecimal;)V
    .locals 7
    .param p1    # Landroidx/lifecycle/LifecycleOwner;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/kumex/data/platform/model/ContractEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "owner"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    if-eqz p4, :cond_4

    .line 8
    .line 9
    .line 10
    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    goto :goto_2

    .line 15
    .line 16
    :cond_0
    if-eqz p2, :cond_4

    .line 17
    .line 18
    if-nez p6, :cond_1

    .line 19
    goto :goto_2

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-static {p3}, Lkf/a;->B(Ljava/math/BigDecimal;)Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    sget p2, Lcom/kubi/kumex/R$string;->bkumex_stop_profit_loss_hint:I

    .line 28
    .line 29
    .line 30
    invoke-static {p1, p2}, Lcom/kubi/kumex/utils/m0;->c(Landroidx/lifecycle/LifecycleOwner;I)V

    .line 31
    return-void

    .line 32
    .line 33
    :cond_2
    sget-object p1, Lcom/kubi/kumex/logic/calculator/Calculator;->a:Lcom/kubi/kumex/logic/calculator/Calculator$Companion;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/kubi/kumex/logic/calculator/Calculator$Companion;->isolated()Lcom/kubi/kumex/logic/calculator/isolated/b;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isInverse()Z

    .line 41
    move-result v1

    .line 42
    .line 43
    .line 44
    invoke-static {p3}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 45
    move-result-object v2

    .line 46
    .line 47
    if-eqz p5, :cond_3

    .line 48
    .line 49
    const-string p1, "buy"

    .line 50
    :goto_0
    move-object v5, p1

    .line 51
    goto :goto_1

    .line 52
    .line 53
    :cond_3
    const-string p1, "sell"

    .line 54
    goto :goto_0

    .line 55
    .line 56
    .line 57
    :goto_1
    invoke-static {p4}, Lcom/kubi/kumex/utils/w;->d(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    .line 61
    invoke-static {p1}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 62
    move-result-object v3

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getMaintainMargin()Ljava/math/BigDecimal;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    const-string p2, "-1"

    .line 69
    .line 70
    .line 71
    invoke-static {p1, p2}, Lkf/a;->F(Ljava/math/BigDecimal;Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 72
    move-result-object v6

    .line 73
    move-object v4, p6

    .line 74
    .line 75
    .line 76
    invoke-virtual/range {v0 .. v6}, Lcom/kubi/kumex/logic/calculator/isolated/b;->j(ZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 77
    move-result-object p1

    .line 78
    .line 79
    iget-object p2, p0, Lcom/kubi/futures/trade/order/modify/u0;->Z:Landroidx/lifecycle/MutableLiveData;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 83
    return-void

    .line 84
    .line 85
    :cond_4
    :goto_2
    iget-object p1, p0, Lcom/kubi/futures/trade/order/modify/u0;->Z:Landroidx/lifecycle/MutableLiveData;

    .line 86
    const/4 p2, 0x0

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, p2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 90
    return-void
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
.end method

.method public final r(Landroidx/lifecycle/LifecycleOwner;Lcom/kubi/kumex/data/platform/model/ContractEntity;Ljava/math/BigDecimal;Ljava/lang/String;ZLjava/math/BigDecimal;Ljava/lang/String;)V
    .locals 11
    .param p1    # Landroidx/lifecycle/LifecycleOwner;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/kumex/data/platform/model/ContractEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v0, p7

    .line 3
    .line 4
    const-string v1, "owner"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    const-string v1, "takerType"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    if-eqz p2, :cond_6

    .line 15
    .line 16
    if-eqz p4, :cond_6

    .line 17
    .line 18
    .line 19
    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    .line 20
    move-result v1

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    goto/16 :goto_5

    .line 25
    .line 26
    :cond_0
    if-nez p6, :cond_1

    .line 27
    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-static {p3}, Lkf/a;->B(Ljava/math/BigDecimal;)Z

    .line 32
    move-result v1

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    sget p2, Lcom/kubi/kumex/R$string;->bkumex_stop_profit_loss_hint:I

    .line 37
    .line 38
    .line 39
    invoke-static {p1, p2}, Lcom/kubi/kumex/utils/m0;->c(Landroidx/lifecycle/LifecycleOwner;I)V

    .line 40
    return-void

    .line 41
    .line 42
    :cond_2
    sget-object p1, Lcom/kubi/kumex/logic/calculator/Calculator;->a:Lcom/kubi/kumex/logic/calculator/Calculator$Companion;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/kubi/kumex/logic/calculator/Calculator$Companion;->isolated()Lcom/kubi/kumex/logic/calculator/isolated/b;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isInverse()Z

    .line 50
    move-result v1

    .line 51
    .line 52
    .line 53
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    .line 57
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 58
    move-result v1

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getMultiplier()Ljava/math/BigDecimal;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    .line 65
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 66
    move-result-object v2

    .line 67
    .line 68
    .line 69
    invoke-static {p4}, Lcom/kubi/kumex/utils/w;->d(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 70
    move-result-object v3

    .line 71
    .line 72
    .line 73
    invoke-static {v3}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 74
    move-result-object v4

    .line 75
    .line 76
    new-instance v5, Ljava/math/BigDecimal;

    .line 77
    .line 78
    const/16 v3, 0x64

    .line 79
    .line 80
    .line 81
    invoke-direct {v5, v3}, Ljava/math/BigDecimal;-><init>(I)V

    .line 82
    const/4 v8, 0x6

    .line 83
    const/4 v9, 0x0

    .line 84
    const/4 v6, 0x0

    .line 85
    const/4 v7, 0x0

    .line 86
    .line 87
    .line 88
    invoke-static/range {v4 .. v9}, Lcom/kubi/kumex/logic/calculator/a;->b(Ljava/math/BigDecimal;Ljava/math/BigDecimal;ILjava/math/RoundingMode;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 89
    move-result-object v3

    .line 90
    .line 91
    const-string v4, "TP"

    .line 92
    .line 93
    .line 94
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    move-result v5

    .line 96
    .line 97
    if-eqz v5, :cond_3

    .line 98
    .line 99
    .line 100
    invoke-static {p2}, Lfm/b;->h(Lcom/kubi/kumex/data/platform/model/ContractEntity;)I

    .line 101
    move-result v5

    .line 102
    goto :goto_0

    .line 103
    .line 104
    .line 105
    :cond_3
    invoke-static {p2}, Lfm/b;->b(Lcom/kubi/kumex/data/platform/model/ContractEntity;)I

    .line 106
    move-result v5

    .line 107
    .line 108
    .line 109
    :goto_0
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getMaintainMargin()Ljava/math/BigDecimal;

    .line 110
    move-result-object v6

    .line 111
    .line 112
    const-string v7, "-1"

    .line 113
    .line 114
    .line 115
    invoke-static {v6, v7}, Lkf/a;->F(Ljava/math/BigDecimal;Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 116
    move-result-object v6

    .line 117
    .line 118
    .line 119
    invoke-static {p3}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 120
    move-result-object p3

    .line 121
    .line 122
    if-eqz p5, :cond_4

    .line 123
    .line 124
    const-string v7, "buy"

    .line 125
    :goto_1
    move-object v8, v7

    .line 126
    goto :goto_2

    .line 127
    .line 128
    :cond_4
    const-string v7, "sell"

    .line 129
    goto :goto_1

    .line 130
    .line 131
    .line 132
    :goto_2
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getMaxPrice()Ljava/math/BigDecimal;

    .line 133
    move-result-object v7

    .line 134
    .line 135
    const-string v9, "1000000"

    .line 136
    .line 137
    .line 138
    invoke-static {v7, v9}, Lkf/a;->F(Ljava/math/BigDecimal;Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 139
    move-result-object v9

    .line 140
    .line 141
    .line 142
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    move-result v0

    .line 144
    .line 145
    const-string v4, "0.01"

    .line 146
    .line 147
    if-eqz v0, :cond_5

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getTickSize()Ljava/math/BigDecimal;

    .line 151
    move-result-object p2

    .line 152
    .line 153
    .line 154
    :goto_3
    invoke-static {p2, v4}, Lkf/a;->F(Ljava/math/BigDecimal;Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 155
    move-result-object p2

    .line 156
    move-object v0, p1

    .line 157
    move-object v10, p2

    .line 158
    .line 159
    move-object/from16 v7, p6

    .line 160
    move v4, v5

    .line 161
    move-object v5, v6

    .line 162
    move-object v6, p3

    .line 163
    goto :goto_4

    .line 164
    .line 165
    .line 166
    :cond_5
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getIndexPriceTickSize()Ljava/math/BigDecimal;

    .line 167
    move-result-object p2

    .line 168
    goto :goto_3

    .line 169
    .line 170
    .line 171
    :goto_4
    invoke-virtual/range {v0 .. v10}, Lcom/kubi/kumex/logic/calculator/isolated/b;->m(ZLjava/math/BigDecimal;Ljava/math/BigDecimal;ILjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 172
    move-result-object p1

    .line 173
    .line 174
    iget-object p2, p0, Lcom/kubi/futures/trade/order/modify/u0;->Y:Landroidx/lifecycle/MutableLiveData;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p2, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 178
    return-void

    .line 179
    .line 180
    :cond_6
    :goto_5
    iget-object p1, p0, Lcom/kubi/futures/trade/order/modify/u0;->Y:Landroidx/lifecycle/MutableLiveData;

    .line 181
    const/4 p2, 0x0

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1, p2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 185
    return-void
.end method

.method public final s(Landroidx/lifecycle/LifecycleOwner;Lcom/kubi/kumex/data/platform/model/ContractEntity;Ljava/math/BigDecimal;Ljava/lang/String;ZLjava/math/BigDecimal;)V
    .locals 7
    .param p1    # Landroidx/lifecycle/LifecycleOwner;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/kumex/data/platform/model/ContractEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "owner"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    if-eqz p4, :cond_4

    .line 8
    .line 9
    .line 10
    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    goto :goto_2

    .line 15
    .line 16
    :cond_0
    if-eqz p2, :cond_4

    .line 17
    .line 18
    if-nez p6, :cond_1

    .line 19
    goto :goto_2

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-static {p3}, Lkf/a;->B(Ljava/math/BigDecimal;)Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    sget p2, Lcom/kubi/kumex/R$string;->bkumex_stop_profit_loss_hint:I

    .line 28
    .line 29
    .line 30
    invoke-static {p1, p2}, Lcom/kubi/kumex/utils/m0;->c(Landroidx/lifecycle/LifecycleOwner;I)V

    .line 31
    return-void

    .line 32
    .line 33
    :cond_2
    sget-object p1, Lcom/kubi/kumex/logic/calculator/Calculator;->a:Lcom/kubi/kumex/logic/calculator/Calculator$Companion;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/kubi/kumex/logic/calculator/Calculator$Companion;->isolated()Lcom/kubi/kumex/logic/calculator/isolated/b;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isInverse()Z

    .line 41
    move-result v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getMultiplier()Ljava/math/BigDecimal;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 49
    move-result-object v2

    .line 50
    .line 51
    .line 52
    invoke-static {p3}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 53
    move-result-object v3

    .line 54
    .line 55
    if-eqz p5, :cond_3

    .line 56
    .line 57
    const-string p1, "buy"

    .line 58
    :goto_0
    move-object v6, p1

    .line 59
    goto :goto_1

    .line 60
    .line 61
    :cond_3
    const-string p1, "sell"

    .line 62
    goto :goto_0

    .line 63
    .line 64
    .line 65
    :goto_1
    invoke-static {p4}, Lkotlin/text/StringsKt;->toBigDecimalOrNull(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 70
    move-result-object v4

    .line 71
    move-object v5, p6

    .line 72
    .line 73
    .line 74
    invoke-virtual/range {v0 .. v6}, Lcom/kubi/kumex/logic/calculator/isolated/b;->l(ZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    move-result-object p1

    .line 76
    .line 77
    iget-object p2, p0, Lcom/kubi/futures/trade/order/modify/u0;->X:Landroidx/lifecycle/MutableLiveData;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 81
    return-void

    .line 82
    .line 83
    :cond_4
    :goto_2
    iget-object p1, p0, Lcom/kubi/futures/trade/order/modify/u0;->X:Landroidx/lifecycle/MutableLiveData;

    .line 84
    const/4 p2, 0x0

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, p2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 88
    return-void
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
.end method

.method public final t()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/order/modify/u0;->a0:Landroidx/lifecycle/MutableLiveData;

    .line 3
    return-object v0
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final u()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/order/modify/u0;->Z:Landroidx/lifecycle/MutableLiveData;

    .line 3
    return-object v0
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final v()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/order/modify/u0;->Y:Landroidx/lifecycle/MutableLiveData;

    .line 3
    return-object v0
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final w()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/order/modify/u0;->X:Landroidx/lifecycle/MutableLiveData;

    .line 3
    return-object v0
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final x()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/order/modify/u0;->b0:Landroidx/lifecycle/MutableLiveData;

    .line 3
    return-object v0
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method
