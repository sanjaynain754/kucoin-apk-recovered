.class public final Lcom/kubi/core/spot/business/holder/LimitOrderHolder$c;
.super Lcom/kubi/utils/s0;
.source "LimitOrderHolder.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/core/spot/business/holder/LimitOrderHolder;->s1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/utils/s0<",
        "Ljava/math/BigDecimal;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0017\u00a8\u0006\u0006"
    }
    d2 = {
        "com/kubi/core/spot/business/holder/LimitOrderHolder$initPriceObs$15",
        "Lcom/kubi/utils/SimpleObserver;",
        "Ljava/math/BigDecimal;",
        "onNext",
        "",
        "dealAmount",
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
.field public final synthetic b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;


# direct methods
.method public constructor <init>(Lcom/kubi/core/spot/business/holder/LimitOrderHolder;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$c;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/kubi/utils/s0;-><init>()V

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
.end method


# virtual methods
.method public a(Ljava/math/BigDecimal;)V
    .locals 20
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "dealAmount"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v3, Ljava/math/BigDecimal;

    .line 2
    sget-object v2, Lgf/n;->a:Lgf/n;

    iget-object v4, v0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$c;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    invoke-virtual {v4}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->getParentBehavior()Lcom/kubi/core/spot/business/holder/f0;

    move-result-object v4

    invoke-interface {v4}, Lcom/kubi/core/spot/business/holder/f0;->N()Lcom/kubi/data/entity/SymbolInfoEntity;

    move-result-object v4

    invoke-virtual {v4}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrency()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lgf/n;->z(Ljava/lang/String;)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 3
    iget-object v2, v0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$c;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    invoke-virtual {v2}, Lcom/kubi/core/spot/business/holder/LimitOrderHolder;->getViewBinding()Lv30/q0;

    move-result-object v2

    iget-object v2, v2, Lv30/q0;->b:Lcom/kubi/resources/widget/TradeInputLayoutProxy;

    invoke-virtual {v2}, Lcom/kubi/resources/widget/TradeInputLayoutProxy;->getEditText()Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    iget-object v2, v0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$c;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    invoke-static {v2, v1}, Lcom/kubi/core/spot/business/holder/LimitOrderHolder;->q1(Lcom/kubi/core/spot/business/holder/LimitOrderHolder;Ljava/math/BigDecimal;)V

    goto/16 :goto_0

    .line 5
    :cond_0
    invoke-virtual {v1, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result v2

    if-gez v2, :cond_1

    .line 6
    iget-object v1, v0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$c;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    invoke-virtual {v1}, Lcom/kubi/core/spot/business/holder/LimitOrderHolder;->getViewBinding()Lv30/q0;

    move-result-object v1

    iget-object v4, v1, Lv30/q0;->b:Lcom/kubi/resources/widget/TradeInputLayoutProxy;

    .line 7
    iget-object v1, v0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$c;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    invoke-virtual {v1}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->getParentBehavior()Lcom/kubi/core/spot/business/holder/f0;

    move-result-object v1

    invoke-interface {v1}, Lcom/kubi/core/spot/business/holder/f0;->j0()Landroid/view/View;

    move-result-object v5

    .line 8
    iget-object v1, v0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$c;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    invoke-virtual {v1}, Lcom/kubi/core/spot/business/holder/LimitOrderHolder;->getViewBinding()Lv30/q0;

    move-result-object v1

    iget-object v1, v1, Lv30/q0;->b:Lcom/kubi/resources/widget/TradeInputLayoutProxy;

    invoke-virtual {v1}, Lcom/kubi/resources/widget/TradeInputLayoutProxy;->getValue()Ljava/math/BigDecimal;

    move-result-object v1

    .line 9
    iget-object v2, v0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$c;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    invoke-virtual {v2}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->getParentBehavior()Lcom/kubi/core/spot/business/holder/f0;

    move-result-object v2

    invoke-interface {v2}, Lcom/kubi/core/spot/business/holder/f0;->N()Lcom/kubi/data/entity/SymbolInfoEntity;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrency()Ljava/lang/String;

    move-result-object v2

    const-string v6, "getQuoteCurrency(...)"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 10
    invoke-static {v1, v2, v8, v6, v7}, Lcom/kubi/core/spot/business/holder/c0;->g(Ljava/math/BigDecimal;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const/16 v10, 0x8

    const/4 v11, 0x0

    const-wide/16 v8, 0x0

    .line 11
    invoke-static/range {v4 .. v11}, Lcom/kubi/resources/widget/e0;->e(Lcom/kubi/resources/widget/e0;Landroid/view/View;Ljava/lang/String;Landroid/widget/TextView;JILjava/lang/Object;)V

    .line 12
    iget-object v1, v0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$c;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    invoke-virtual {v1}, Lcom/kubi/core/spot/business/holder/LimitOrderHolder;->getViewBinding()Lv30/q0;

    move-result-object v1

    iget-object v1, v1, Lv30/q0;->j:Lcom/kubi/resources/widget/BaseTextView;

    const-string v2, "tvCurrencyTotal"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 13
    iget-object v1, v0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$c;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    invoke-virtual {v1}, Lcom/kubi/core/spot/business/holder/LimitOrderHolder;->getViewBinding()Lv30/q0;

    move-result-object v1

    iget-object v1, v1, Lv30/q0;->j:Lcom/kubi/resources/widget/BaseTextView;

    .line 14
    iget-object v2, v0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$c;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v4, Lcom/kubi/tradecorebiz/R$color;->brandRed:I

    invoke-static {v2, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    .line 15
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 16
    iget-object v1, v0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$c;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    invoke-virtual {v1}, Lcom/kubi/core/spot/business/holder/LimitOrderHolder;->getViewBinding()Lv30/q0;

    move-result-object v1

    iget-object v1, v1, Lv30/q0;->j:Lcom/kubi/resources/widget/BaseTextView;

    iget-object v2, v0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$c;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 17
    sget v13, Lcom/kubi/tradecorebiz/R$string;->kc_trade_vol_morethan_tip:I

    const/16 v11, 0x7d

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/16 v5, 0x14

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 18
    invoke-static/range {v3 .. v12}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    .line 19
    iget-object v3, v0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$c;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    invoke-virtual {v3}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->getParentBehavior()Lcom/kubi/core/spot/business/holder/f0;

    move-result-object v3

    invoke-interface {v3}, Lcom/kubi/core/spot/business/holder/f0;->N()Lcom/kubi/data/entity/SymbolInfoEntity;

    move-result-object v3

    invoke-virtual {v3}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrencyName()Ljava/lang/String;

    move-result-object v15

    const-string v3, "getQuoteCurrencyName(...)"

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v18, 0x4

    const/16 v19, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x0

    .line 20
    invoke-static/range {v14 .. v19}, Lnf/b;->g(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    .line 21
    invoke-virtual {v2, v13, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 22
    :cond_1
    iget-object v2, v0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$c;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    invoke-static {v2, v1}, Lcom/kubi/core/spot/business/holder/LimitOrderHolder;->q1(Lcom/kubi/core/spot/business/holder/LimitOrderHolder;Ljava/math/BigDecimal;)V

    .line 23
    :goto_0
    iget-object v1, v0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$c;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    invoke-virtual {v1}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->getDiffTradeImp()Lcom/kubi/core/spot/business/holder/e0;

    move-result-object v1

    iget-object v2, v0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$c;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    invoke-interface {v1, v2}, Lcom/kubi/core/spot/business/holder/e0;->q(Lcom/kubi/core/spot/business/holder/BaseOrderHolder;)V

    .line 24
    iget-object v1, v0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$c;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    invoke-virtual {v1}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->getDiffTradeImp()Lcom/kubi/core/spot/business/holder/e0;

    move-result-object v1

    iget-object v2, v0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$c;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    invoke-interface {v1, v2}, Lcom/kubi/core/spot/business/holder/e0;->u(Lcom/kubi/core/spot/business/holder/BaseOrderHolder;)V

    return-void
.end method

.method public bridge synthetic onNext(Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Ljava/math/BigDecimal;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$c;->a(Ljava/math/BigDecimal;)V

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
.end method
