.class public final Lcom/kubi/core/spot/business/holder/LimitOrderHolder$a;
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
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/kubi/core/spot/business/holder/LimitOrderHolder$initPriceObs$11",
        "Lcom/kubi/utils/SimpleObserver;",
        "Ljava/math/BigDecimal;",
        "onNext",
        "",
        "price",
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
    iput-object p1, p0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$a;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

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
    .locals 9

    .line 1
    .line 2
    const-string v0, "price"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$a;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->getProgressPercent()Lcom/kubi/core/view/SpotInputProgressView;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/kubi/core/view/SpotInputProgressView;->J()V

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$a;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/kubi/core/spot/business/holder/LimitOrderHolder;->p1(Lcom/kubi/core/spot/business/holder/LimitOrderHolder;)Lcom/kubi/core/biz/submit/TradeSubmitVM;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    check-cast v0, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getPanelModel()Lhd/b;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    sget-object v1, Lhd/b$b;->a:Lhd/b$b;

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    move-result v0

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    move-object v0, p1

    .line 42
    move-object v1, v0

    .line 43
    goto :goto_1

    .line 44
    .line 45
    :cond_1
    iget-object v0, p0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$a;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->p0()Z

    .line 49
    move-result v0

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    move-object v0, p1

    .line 53
    goto :goto_0

    .line 54
    .line 55
    :cond_2
    iget-object v0, p0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$a;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lcom/kubi/core/spot/business/holder/LimitOrderHolder;->p1(Lcom/kubi/core/spot/business/holder/LimitOrderHolder;)Lcom/kubi/core/biz/submit/TradeSubmitVM;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    check-cast v0, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getInputBuyPrice()Ljava/math/BigDecimal;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    :goto_0
    iget-object v1, p0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$a;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->p0()Z

    .line 75
    move-result v1

    .line 76
    .line 77
    if-eqz v1, :cond_3

    .line 78
    .line 79
    iget-object v1, p0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$a;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    .line 80
    .line 81
    .line 82
    invoke-static {v1}, Lcom/kubi/core/spot/business/holder/LimitOrderHolder;->p1(Lcom/kubi/core/spot/business/holder/LimitOrderHolder;)Lcom/kubi/core/biz/submit/TradeSubmitVM;

    .line 83
    move-result-object v1

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 87
    move-result-object v1

    .line 88
    .line 89
    check-cast v1, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getInputSellPrice()Ljava/math/BigDecimal;

    .line 93
    move-result-object v1

    .line 94
    goto :goto_1

    .line 95
    :cond_3
    move-object v1, p1

    .line 96
    .line 97
    :goto_1
    iget-object v2, p0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$a;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    .line 98
    .line 99
    .line 100
    invoke-static {v2}, Lcom/kubi/core/spot/business/holder/LimitOrderHolder;->p1(Lcom/kubi/core/spot/business/holder/LimitOrderHolder;)Lcom/kubi/core/biz/submit/TradeSubmitVM;

    .line 101
    move-result-object v2

    .line 102
    .line 103
    new-instance v3, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$UpdateInputPrice;

    .line 104
    .line 105
    .line 106
    invoke-direct {v3, v0, v1}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$UpdateInputPrice;-><init>(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v3}, Lcom/kubi/core/biz/submit/TradeSubmitVM;->B0(Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent;)V

    .line 110
    .line 111
    iget-object v0, p0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$a;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Lcom/kubi/core/spot/business/holder/LimitOrderHolder;->getViewBinding()Lv30/q0;

    .line 115
    move-result-object v0

    .line 116
    .line 117
    iget-object v1, v0, Lv30/q0;->c:Lcom/kubi/resources/widget/TradeInputLayoutProxy;

    .line 118
    .line 119
    iget-object v0, p0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$a;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->getParentBehavior()Lcom/kubi/core/spot/business/holder/f0;

    .line 123
    move-result-object v0

    .line 124
    .line 125
    .line 126
    invoke-interface {v0}, Lcom/kubi/core/spot/business/holder/f0;->j0()Landroid/view/View;

    .line 127
    move-result-object v2

    .line 128
    .line 129
    iget-object v0, p0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$a;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->getParentBehavior()Lcom/kubi/core/spot/business/holder/f0;

    .line 133
    move-result-object v0

    .line 134
    .line 135
    .line 136
    invoke-interface {v0}, Lcom/kubi/core/spot/business/holder/f0;->N()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 137
    move-result-object v0

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrency()Ljava/lang/String;

    .line 141
    move-result-object v0

    .line 142
    .line 143
    const-string v3, "getQuoteCurrency(...)"

    .line 144
    .line 145
    .line 146
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    const/4 v3, 0x4

    .line 148
    const/4 v4, 0x0

    .line 149
    const/4 v5, 0x0

    .line 150
    .line 151
    .line 152
    invoke-static {p1, v0, v5, v3, v4}, Lcom/kubi/core/spot/business/holder/c0;->g(Ljava/math/BigDecimal;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 153
    move-result-object v3

    .line 154
    .line 155
    iget-object p1, p0, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$a;->b:Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1}, Lcom/kubi/core/spot/business/holder/LimitOrderHolder;->getViewBinding()Lv30/q0;

    .line 159
    move-result-object p1

    .line 160
    .line 161
    iget-object v4, p1, Lv30/q0;->l:Lcom/kubi/resources/widget/BaseTextView;

    .line 162
    .line 163
    const/16 v7, 0x8

    .line 164
    const/4 v8, 0x0

    .line 165
    .line 166
    const-wide/16 v5, 0x0

    .line 167
    .line 168
    .line 169
    invoke-static/range {v1 .. v8}, Lcom/kubi/resources/widget/e0;->e(Lcom/kubi/resources/widget/e0;Landroid/view/View;Ljava/lang/String;Landroid/widget/TextView;JILjava/lang/Object;)V

    .line 170
    return-void
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

.method public bridge synthetic onNext(Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Ljava/math/BigDecimal;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/kubi/core/spot/business/holder/LimitOrderHolder$a;->a(Ljava/math/BigDecimal;)V

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
