.class public interface abstract Lcom/kubi/core/spot/business/holder/e0;
.super Ljava/lang/Object;
.source "ITradeDiffBizDefine.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0008\u0010\u0006\u001a\u00020\u0007H&J\u0008\u0010\u0008\u001a\u00020\tH&J\u0008\u0010\n\u001a\u00020\tH&J\u0008\u0010\u000b\u001a\u00020\tH&J\u0008\u0010\u000c\u001a\u00020\tH&J\u000e\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH&J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&J\u001a\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0013H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0008\u0010\u001c\u001a\u00020\u0018H&J \u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H&J\u0012\u0010!\u001a\u00020\u00032\u0008\u0010\"\u001a\u0004\u0018\u00010#H&J \u0010$\u001a\u00020%2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0018H&J\u0010\u0010\'\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010(\u001a\u0004\u0018\u00010%2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010)\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H&J\u0008\u0010.\u001a\u00020\u0018H\u0016J\u0008\u0010/\u001a\u00020\u0018H\u0016J\u0008\u00100\u001a\u00020#H&J\"\u00101\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00182\u0008\u00103\u001a\u0004\u0018\u00010#H&J\u0010\u00104\u001a\u0002052\u0006\u0010,\u001a\u00020-H&J\u0010\u00106\u001a\u0002072\u0006\u0010,\u001a\u00020-H\u0016J\u0018\u00108\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00109\u001a\u00020 H&J\u0018\u0010:\u001a\u00020\u00032\u0006\u0010;\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010<\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0005H&J4\u0010=\u001a\u0008\u0012\u0004\u0012\u00020?0>2\u0006\u0010@\u001a\u00020A2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0C2\u0008\u0010D\u001a\u0004\u0018\u00010#H&J4\u0010E\u001a\u0008\u0012\u0004\u0012\u00020?0>2\u0006\u0010@\u001a\u00020A2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0C2\u0008\u0010D\u001a\u0004\u0018\u00010#H&J\u0010\u0010F\u001a\u00020\u00032\u0006\u0010G\u001a\u00020HH&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006I\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/core/spot/business/holder/ITradeDiffBizDefine;",
        "",
        "initBottomBizView",
        "",
        "baseOrderHolder",
        "Lcom/kubi/core/spot/business/holder/BaseOrderHolder;",
        "trackImp",
        "Lcom/kubi/core/spot/business/holder/IHolderTrackDefine;",
        "limitLayoutRes",
        "",
        "marketLayoutRes",
        "ocoLayoutRes",
        "trailingLayoutRes",
        "preIntercepts",
        "",
        "Lcom/kubi/core/spot/business/holder/intercept/IOrderIntercept;",
        "formatterBaseBalanceDisplay",
        "",
        "tvBaseUnit",
        "Lcom/kubi/resources/widget/DashTextView;",
        "formatterQuoteBalanceDisplay",
        "tvQuoteUnit",
        "onCouponsDataGet",
        "isBuyHolder",
        "",
        "trackPercentClick",
        "radioGroup",
        "Landroid/widget/RadioGroup;",
        "isMarginTrade",
        "checkAvailableSizeOk",
        "needHint",
        "insufficientCallBack",
        "Lio/reactivex/functions/Action;",
        "toTransfer",
        "targetCurrency",
        "",
        "getHolderDiffAvailableBalance",
        "Ljava/math/BigDecimal;",
        "isReal",
        "calculateBorrowAmount",
        "getBorrowAmount",
        "calculateRepayDebtAmount",
        "checkSpotSubmitClickIntercept",
        "Lcom/kubi/core/spot/business/holder/intercept/input/ILimitTradeInputIntercept;",
        "context",
        "Landroid/content/Context;",
        "isAutoBorrow",
        "isAutoRepay",
        "requestTradeType",
        "trackOrderSuccessOrFail",
        "success",
        "errorMsg",
        "checkMarketSubmitClickIntercept",
        "Lcom/kubi/core/spot/business/holder/intercept/input/IMarketTradeInputIntercept;",
        "checkSegmentSubmitClickIntercept",
        "Lcom/kubi/core/spot/business/holder/intercept/input/ISegmentTradeInputIntercept;",
        "needTipsMarginPriceOffset",
        "action",
        "showTransferDialog",
        "currency",
        "needCheckAvailable",
        "requestOcoOrderApi",
        "Lio/reactivex/Observable;",
        "Lcom/kubi/core/spot/entity/OrderResultEntity;",
        "marketApi",
        "Lcom/kubi/core/spot/api/MarketApi;",
        "requestEntity",
        "",
        "fingerEvent",
        "requestTsoOderApi",
        "initMarginViewBind",
        "viewBinding",
        "Landroidx/viewbinding/ViewBinding;",
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


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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
.end method

.method public abstract b()Lcom/kubi/core/spot/business/holder/d0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract c(Landroid/content/Context;)Lpe/a;
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract d()I
.end method

.method public e()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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
.end method

.method public abstract f()Z
.end method

.method public abstract g()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract h(Z)V
.end method

.method public abstract i(Landroid/content/Context;)Lpe/b;
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract j()I
.end method

.method public abstract k()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lme/c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract l(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract m(Landroidx/viewbinding/ViewBinding;)V
    .param p1    # Landroidx/viewbinding/ViewBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract n(Lcom/kubi/core/spot/business/holder/BaseOrderHolder;)V
    .param p1    # Lcom/kubi/core/spot/business/holder/BaseOrderHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract o(Lcom/kubi/core/spot/business/holder/BaseOrderHolder;Lcom/kubi/resources/widget/DashTextView;)Ljava/lang/CharSequence;
    .param p1    # Lcom/kubi/core/spot/business/holder/BaseOrderHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/resources/widget/DashTextView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract p(Lcom/kubi/core/spot/business/holder/BaseOrderHolder;ZLjava/lang/String;)V
    .param p1    # Lcom/kubi/core/spot/business/holder/BaseOrderHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract q(Lcom/kubi/core/spot/business/holder/BaseOrderHolder;)V
    .param p1    # Lcom/kubi/core/spot/business/holder/BaseOrderHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract r(Lcom/kubi/core/spot/business/holder/BaseOrderHolder;Lcom/kubi/resources/widget/DashTextView;)Ljava/lang/CharSequence;
    .param p1    # Lcom/kubi/core/spot/business/holder/BaseOrderHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/resources/widget/DashTextView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract s(Lcom/kubi/core/spot/business/holder/BaseOrderHolder;)Ljava/math/BigDecimal;
    .param p1    # Lcom/kubi/core/spot/business/holder/BaseOrderHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract t(Lcom/kubi/core/spot/business/holder/BaseOrderHolder;Lio/reactivex/functions/Action;)V
    .param p1    # Lcom/kubi/core/spot/business/holder/BaseOrderHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/reactivex/functions/Action;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract u(Lcom/kubi/core/spot/business/holder/BaseOrderHolder;)V
    .param p1    # Lcom/kubi/core/spot/business/holder/BaseOrderHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract v(Ljava/lang/String;Lcom/kubi/core/spot/business/holder/BaseOrderHolder;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/core/spot/business/holder/BaseOrderHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract w(Lcom/kubi/core/spot/business/holder/BaseOrderHolder;)Z
    .param p1    # Lcom/kubi/core/spot/business/holder/BaseOrderHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public x(Landroid/content/Context;)Lpe/c;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lpe/h;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, p1}, Lpe/h;-><init>(Landroid/content/Context;)V

    .line 11
    return-object v0
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

.method public abstract y(Lcom/kubi/core/spot/business/holder/BaseOrderHolder;ZLio/reactivex/functions/Action;)Z
    .param p1    # Lcom/kubi/core/spot/business/holder/BaseOrderHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/reactivex/functions/Action;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract z(Lcom/kubi/core/spot/business/holder/BaseOrderHolder;ZZ)Ljava/math/BigDecimal;
    .param p1    # Lcom/kubi/core/spot/business/holder/BaseOrderHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
