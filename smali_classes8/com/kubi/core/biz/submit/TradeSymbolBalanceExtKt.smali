.class public final Lcom/kubi/core/biz/submit/TradeSymbolBalanceExtKt;
.super Ljava/lang/Object;
.source "TradeSymbolBalanceExt.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u001c\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u0000\u001a&\u0010\u000c\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014H\u0000\u001a\u0014\u0010\u0015\u001a\u00020\n*\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a\u001c\u0010\u0016\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a$\u0010\u0017\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\nH\u0002\u001a\u001a\u0010\u0019\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012\u001a\u000c\u0010\u001a\u001a\u00020\r*\u00020\u000eH\u0000\u001a(\u0010\u001b\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\u000e\u0010 \u001a\u0004\u0018\u00010\u001d*\u00020\u0010H\u0002\u001a\u000e\u0010!\u001a\u00020\"*\u0004\u0018\u00010\u0001H\u0002\"\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"
    }
    d2 = {
        "getTakerFeeWithTax",
        "Ljava/math/BigDecimal;",
        "symbolInfo",
        "Lcom/kubi/data/entity/SymbolInfoEntity;",
        "getAvailableTradeFeeRate",
        "createInvalidAvailableTradeAmount",
        "Lcom/kubi/tradebase/available/AvailableTradeAmountState;",
        "status",
        "Lcom/kubi/tradebase/available/AvailableTradeAmountStatus;",
        "USER_TRIGGER_DEBOUNCE_MS",
        "",
        "PUSH_TRIGGER_THROTTLE_MS",
        "fetchTradeBalanceData",
        "",
        "Lcom/kubi/core/biz/submit/TradeSubmitVM;",
        "state",
        "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;",
        "utaOrderApi1",
        "Lcom/kubi/core/biz/margininfo/IMarginInfoApi;",
        "isUserTriggered",
        "",
        "calculateDelay",
        "executeBalanceFetch",
        "scheduleBalanceFetch",
        "delayMs",
        "fetchTradeBalanceDataInternal",
        "refreshAvailableTradeAmountFromCurrentBalance",
        "updateAvailableTradeAmount",
        "context",
        "Lcom/kubi/core/biz/submit/AvailableTradeAmountRequestContext;",
        "quoteAvailable",
        "baseAvailable",
        "toAvailableTradeAmountRequestContext",
        "normalizedKey",
        "",
        "TradeCoreBizLib_googleRelease"
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
        "SMAP\nTradeSymbolBalanceExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeSymbolBalanceExt.kt\ncom/kubi/core/biz/submit/TradeSymbolBalanceExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,460:1\n1#2:461\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic a(Ljava/math/BigDecimal;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/core/biz/submit/TradeSymbolBalanceExtKt;->k(Ljava/math/BigDecimal;)Ljava/lang/String;

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
.end method

.method public static final b(Lcom/kubi/core/biz/submit/TradeSubmitVM;Z)J
    .locals 5

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const-wide/16 p0, 0x3e8

    .line 5
    return-wide p0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 9
    move-result-wide v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/TradeSubmitVM;->o0()Ljava/util/concurrent/atomic/AtomicLong;

    .line 13
    move-result-object p0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 17
    move-result-wide p0

    .line 18
    sub-long/2addr v0, p0

    .line 19
    .line 20
    const-wide/16 p0, 0x1388

    .line 21
    .line 22
    cmp-long v2, v0, p0

    .line 23
    .line 24
    const-wide/16 v3, 0x0

    .line 25
    .line 26
    if-ltz v2, :cond_1

    .line 27
    return-wide v3

    .line 28
    :cond_1
    sub-long/2addr p0, v0

    .line 29
    .line 30
    .line 31
    invoke-static {p0, p1, v3, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(JJ)J

    .line 32
    move-result-wide p0

    .line 33
    return-wide p0
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
.end method

.method public static final c(Lcom/kubi/data/entity/SymbolInfoEntity;Lcom/kubi/tradebase/available/AvailableTradeAmountStatus;)Lk30/d;
    .locals 11
    .param p0    # Lcom/kubi/data/entity/SymbolInfoEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p1    # Lcom/kubi/tradebase/available/AvailableTradeAmountStatus;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "status"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrencyName()Ljava/lang/String;

    .line 12
    move-result-object v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v1, v0

    .line 15
    .line 16
    :goto_0
    const-string v8, ""

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    move-object v1, v8

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 23
    move-result v2

    .line 24
    .line 25
    if-eqz v2, :cond_3

    .line 26
    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrency()Ljava/lang/String;

    .line 31
    move-result-object v1

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    move-object v1, v0

    .line 34
    .line 35
    :goto_1
    if-nez v1, :cond_3

    .line 36
    move-object v1, v8

    .line 37
    :cond_3
    move-object v3, v1

    .line 38
    const/4 v9, 0x0

    .line 39
    .line 40
    if-eqz p0, :cond_4

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseIncrementPrecision()I

    .line 44
    move-result v1

    .line 45
    move v4, v1

    .line 46
    goto :goto_2

    .line 47
    :cond_4
    move v4, v9

    .line 48
    .line 49
    :goto_2
    new-instance v1, Lk30/f;

    .line 50
    const/4 v2, 0x0

    .line 51
    const/4 v6, 0x1

    .line 52
    const/4 v7, 0x0

    .line 53
    move-object v5, p1

    .line 54
    .line 55
    .line 56
    invoke-direct/range {v1 .. v7}, Lk30/f;-><init>(Ljava/math/BigDecimal;Ljava/lang/String;ILcom/kubi/tradebase/available/AvailableTradeAmountStatus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 57
    move-object v10, v1

    .line 58
    .line 59
    if-eqz p0, :cond_5

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrencyName()Ljava/lang/String;

    .line 63
    move-result-object v1

    .line 64
    goto :goto_3

    .line 65
    :cond_5
    move-object v1, v0

    .line 66
    .line 67
    :goto_3
    if-nez v1, :cond_6

    .line 68
    move-object v1, v8

    .line 69
    .line 70
    .line 71
    :cond_6
    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 72
    move-result v2

    .line 73
    .line 74
    if-eqz v2, :cond_9

    .line 75
    .line 76
    if-eqz p0, :cond_7

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrency()Ljava/lang/String;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    :cond_7
    if-nez v0, :cond_8

    .line 83
    goto :goto_4

    .line 84
    :cond_8
    move-object v8, v0

    .line 85
    :goto_4
    move-object v3, v8

    .line 86
    goto :goto_5

    .line 87
    :cond_9
    move-object v3, v1

    .line 88
    .line 89
    :goto_5
    if-eqz p0, :cond_a

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteIncrementPrecision()I

    .line 93
    move-result v9

    .line 94
    :cond_a
    move v4, v9

    .line 95
    .line 96
    new-instance v1, Lk30/f;

    .line 97
    const/4 v2, 0x0

    .line 98
    const/4 v6, 0x1

    .line 99
    const/4 v7, 0x0

    .line 100
    move-object v5, p1

    .line 101
    .line 102
    .line 103
    invoke-direct/range {v1 .. v7}, Lk30/f;-><init>(Ljava/math/BigDecimal;Ljava/lang/String;ILcom/kubi/tradebase/available/AvailableTradeAmountStatus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 104
    .line 105
    new-instance v0, Lk30/d;

    .line 106
    .line 107
    .line 108
    invoke-direct {v0, v10, v1}, Lk30/d;-><init>(Lk30/f;Lk30/f;)V

    .line 109
    return-object v0
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
.end method

.method public static synthetic d(Lcom/kubi/data/entity/SymbolInfoEntity;Lcom/kubi/tradebase/available/AvailableTradeAmountStatus;ILjava/lang/Object;)Lk30/d;
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p2, p2, 0x2

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    sget-object p1, Lcom/kubi/tradebase/available/AvailableTradeAmountStatus;->INVALID:Lcom/kubi/tradebase/available/AvailableTradeAmountStatus;

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-static {p0, p1}, Lcom/kubi/core/biz/submit/TradeSymbolBalanceExtKt;->c(Lcom/kubi/data/entity/SymbolInfoEntity;Lcom/kubi/tradebase/available/AvailableTradeAmountStatus;)Lk30/d;

    .line 10
    move-result-object p0

    .line 11
    return-object p0
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
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
.end method

.method public static final e(Lcom/kubi/core/biz/submit/TradeSubmitVM;Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;Lcom/kubi/core/biz/margininfo/a;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    new-instance v3, Lcom/kubi/core/biz/submit/TradeSymbolBalanceExtKt$executeBalanceFetch$1;

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct {v3, p0, p1, p2, v2}, Lcom/kubi/core/biz/submit/TradeSymbolBalanceExtKt$executeBalanceFetch$1;-><init>(Lcom/kubi/core/biz/submit/TradeSubmitVM;Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;Lcom/kubi/core/biz/margininfo/a;Lkotlin/coroutines/Continuation;)V

    .line 15
    const/4 v4, 0x2

    .line 16
    const/4 v5, 0x0

    .line 17
    .line 18
    .line 19
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 20
    return-void
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
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
.end method

.method public static final f(Lcom/kubi/core/biz/submit/TradeSubmitVM;Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;Lcom/kubi/core/biz/margininfo/a;Z)V
    .locals 4
    .param p0    # Lcom/kubi/core/biz/submit/TradeSubmitVM;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/core/biz/margininfo/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "state"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "utaOrderApi1"

    .line 13
    .line 14
    .line 15
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getSymbolInfo()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getSymbolInfo()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getCode()Ljava/lang/String;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getSymbol()Ljava/lang/String;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    move-result v0

    .line 38
    .line 39
    if-nez v0, :cond_0

    .line 40
    goto :goto_0

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-static {p0, p3}, Lcom/kubi/core/biz/submit/TradeSymbolBalanceExtKt;->b(Lcom/kubi/core/biz/submit/TradeSubmitVM;Z)J

    .line 44
    move-result-wide v0

    .line 45
    .line 46
    const-wide/16 v2, 0x0

    .line 47
    .line 48
    cmp-long p3, v0, v2

    .line 49
    .line 50
    if-nez p3, :cond_1

    .line 51
    .line 52
    .line 53
    invoke-static {p0, p1, p2}, Lcom/kubi/core/biz/submit/TradeSymbolBalanceExtKt;->e(Lcom/kubi/core/biz/submit/TradeSubmitVM;Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;Lcom/kubi/core/biz/margininfo/a;)V

    .line 54
    return-void

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-static {p0, p1, p2, v0, v1}, Lcom/kubi/core/biz/submit/TradeSymbolBalanceExtKt;->m(Lcom/kubi/core/biz/submit/TradeSubmitVM;Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;Lcom/kubi/core/biz/margininfo/a;J)V

    .line 58
    :cond_2
    :goto_0
    return-void
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
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
.end method

.method public static synthetic g(Lcom/kubi/core/biz/submit/TradeSubmitVM;Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;Lcom/kubi/core/biz/margininfo/a;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p4, p4, 0x4

    .line 3
    .line 4
    if-eqz p4, :cond_0

    .line 5
    const/4 p3, 0x1

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/kubi/core/biz/submit/TradeSymbolBalanceExtKt;->f(Lcom/kubi/core/biz/submit/TradeSubmitVM;Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;Lcom/kubi/core/biz/margininfo/a;Z)V

    .line 9
    return-void
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
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
.end method

.method public static final h(Lcom/kubi/core/biz/submit/TradeSubmitVM;Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;Lcom/kubi/core/biz/margininfo/a;)V
    .locals 20
    .param p0    # Lcom/kubi/core/biz/submit/TradeSubmitVM;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/core/biz/margininfo/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v11, p0

    .line 3
    .line 4
    const-string v0, "<this>"

    .line 5
    .line 6
    .line 7
    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    const-string v0, "state"

    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    const-string v0, "utaOrderApi1"

    .line 17
    .line 18
    move-object/from16 v1, p2

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v11}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 25
    move-result-object v0

    .line 26
    move-object v10, v0

    .line 27
    .line 28
    check-cast v10, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getSymbolInfo()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    if-eqz v0, :cond_1f

    .line 35
    .line 36
    .line 37
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getSymbolInfo()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getCode()Ljava/lang/String;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getSymbol()Ljava/lang/String;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    move-result v0

    .line 51
    .line 52
    if-nez v0, :cond_0

    .line 53
    .line 54
    goto/16 :goto_13

    .line 55
    .line 56
    .line 57
    :cond_0
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getSymbolInfo()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 58
    move-result-object v9

    .line 59
    .line 60
    .line 61
    invoke-virtual {v11}, Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizVM;->o()Lcom/kubi/core/base/TradeAccountType;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    sget-object v2, Lcom/kubi/core/base/TradeAccountType$Margin;->INSTANCE:Lcom/kubi/core/base/TradeAccountType$Margin;

    .line 65
    .line 66
    .line 67
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    move-result v0

    .line 69
    .line 70
    if-eqz v0, :cond_1

    .line 71
    .line 72
    const-string v0, "MARGIN"

    .line 73
    :goto_0
    move-object v2, v0

    .line 74
    goto :goto_1

    .line 75
    .line 76
    :cond_1
    const-string v0, "SPOT"

    .line 77
    goto :goto_0

    .line 78
    .line 79
    .line 80
    :goto_1
    invoke-virtual {v9}, Lcom/kubi/data/entity/SymbolInfoEntity;->getCode()Ljava/lang/String;

    .line 81
    move-result-object v3

    .line 82
    .line 83
    .line 84
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getTradeType()Lcom/kubi/tradebase/tradetype/TradeType;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    if-nez v0, :cond_2

    .line 88
    .line 89
    sget-object v0, Lcom/kubi/tradebase/tradetype/TradeType;->LIMIT:Lcom/kubi/tradebase/tradetype/TradeType;

    .line 90
    .line 91
    :cond_2
    sget-object v4, Lcom/kubi/tradebase/tradetype/TradeType;->MARKET:Lcom/kubi/tradebase/tradetype/TradeType;

    .line 92
    .line 93
    if-eq v0, v4, :cond_5

    .line 94
    .line 95
    .line 96
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getTradeType()Lcom/kubi/tradebase/tradetype/TradeType;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    if-nez v0, :cond_3

    .line 100
    .line 101
    sget-object v0, Lcom/kubi/tradebase/tradetype/TradeType;->LIMIT:Lcom/kubi/tradebase/tradetype/TradeType;

    .line 102
    .line 103
    :cond_3
    sget-object v4, Lcom/kubi/tradebase/tradetype/TradeType;->MARKET_STOP:Lcom/kubi/tradebase/tradetype/TradeType;

    .line 104
    .line 105
    if-ne v0, v4, :cond_4

    .line 106
    goto :goto_3

    .line 107
    .line 108
    :cond_4
    const-string v0, "LIMIT"

    .line 109
    :goto_2
    move-object v4, v0

    .line 110
    goto :goto_4

    .line 111
    .line 112
    :cond_5
    :goto_3
    const-string v0, "MARKET"

    .line 113
    goto :goto_2

    .line 114
    .line 115
    .line 116
    :goto_4
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getTradeType()Lcom/kubi/tradebase/tradetype/TradeType;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    if-nez v0, :cond_6

    .line 120
    .line 121
    sget-object v0, Lcom/kubi/tradebase/tradetype/TradeType;->LIMIT:Lcom/kubi/tradebase/tradetype/TradeType;

    .line 122
    .line 123
    :cond_6
    sget-object v5, Lcom/kubi/tradebase/tradetype/TradeType;->LIMIT:Lcom/kubi/tradebase/tradetype/TradeType;

    .line 124
    const/4 v6, 0x0

    .line 125
    .line 126
    if-eq v0, v5, :cond_8

    .line 127
    .line 128
    .line 129
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getTradeType()Lcom/kubi/tradebase/tradetype/TradeType;

    .line 130
    move-result-object v0

    .line 131
    .line 132
    sget-object v7, Lcom/kubi/tradebase/tradetype/TradeType;->ADVANCED_LIMIT:Lcom/kubi/tradebase/tradetype/TradeType;

    .line 133
    .line 134
    if-eq v0, v7, :cond_8

    .line 135
    .line 136
    .line 137
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getTradeType()Lcom/kubi/tradebase/tradetype/TradeType;

    .line 138
    move-result-object v0

    .line 139
    .line 140
    sget-object v7, Lcom/kubi/tradebase/tradetype/TradeType;->SEGMENT:Lcom/kubi/tradebase/tradetype/TradeType;

    .line 141
    .line 142
    if-ne v0, v7, :cond_7

    .line 143
    goto :goto_6

    .line 144
    :cond_7
    :goto_5
    move-object v0, v6

    .line 145
    goto :goto_8

    .line 146
    .line 147
    .line 148
    :cond_8
    :goto_6
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getPanelModel()Lhd/b;

    .line 149
    move-result-object v0

    .line 150
    .line 151
    sget-object v7, Lhd/b$b;->a:Lhd/b$b;

    .line 152
    .line 153
    .line 154
    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    move-result v0

    .line 156
    .line 157
    if-eqz v0, :cond_9

    .line 158
    .line 159
    .line 160
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getInputBuyPrice()Ljava/math/BigDecimal;

    .line 161
    move-result-object v0

    .line 162
    .line 163
    if-nez v0, :cond_a

    .line 164
    .line 165
    .line 166
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getInputSellPrice()Ljava/math/BigDecimal;

    .line 167
    move-result-object v0

    .line 168
    goto :goto_7

    .line 169
    .line 170
    .line 171
    :cond_9
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getInputBuyPrice()Ljava/math/BigDecimal;

    .line 172
    move-result-object v0

    .line 173
    .line 174
    .line 175
    :cond_a
    :goto_7
    invoke-static {v0}, Lkf/a;->B(Ljava/math/BigDecimal;)Z

    .line 176
    move-result v7

    .line 177
    .line 178
    if-eqz v7, :cond_b

    .line 179
    goto :goto_5

    .line 180
    .line 181
    :cond_b
    if-eqz v0, :cond_7

    .line 182
    .line 183
    .line 184
    invoke-static {v0}, Lcom/fasterxml/jackson/databind/node/a;->a(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 185
    move-result-object v0

    .line 186
    .line 187
    if-eqz v0, :cond_7

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 191
    move-result-object v0

    .line 192
    .line 193
    .line 194
    :goto_8
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getTradeType()Lcom/kubi/tradebase/tradetype/TradeType;

    .line 195
    move-result-object v7

    .line 196
    .line 197
    if-nez v7, :cond_c

    .line 198
    move-object v7, v5

    .line 199
    .line 200
    :cond_c
    if-eq v7, v5, :cond_e

    .line 201
    .line 202
    .line 203
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getTradeType()Lcom/kubi/tradebase/tradetype/TradeType;

    .line 204
    move-result-object v5

    .line 205
    .line 206
    sget-object v7, Lcom/kubi/tradebase/tradetype/TradeType;->ADVANCED_LIMIT:Lcom/kubi/tradebase/tradetype/TradeType;

    .line 207
    .line 208
    if-eq v5, v7, :cond_e

    .line 209
    .line 210
    .line 211
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getTradeType()Lcom/kubi/tradebase/tradetype/TradeType;

    .line 212
    move-result-object v5

    .line 213
    .line 214
    sget-object v7, Lcom/kubi/tradebase/tradetype/TradeType;->SEGMENT:Lcom/kubi/tradebase/tradetype/TradeType;

    .line 215
    .line 216
    if-ne v5, v7, :cond_d

    .line 217
    goto :goto_a

    .line 218
    :cond_d
    :goto_9
    move-object v7, v6

    .line 219
    goto :goto_c

    .line 220
    .line 221
    .line 222
    :cond_e
    :goto_a
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getPanelModel()Lhd/b;

    .line 223
    move-result-object v5

    .line 224
    .line 225
    sget-object v7, Lhd/b$b;->a:Lhd/b$b;

    .line 226
    .line 227
    .line 228
    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 229
    move-result v5

    .line 230
    .line 231
    if-eqz v5, :cond_f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getInputSellPrice()Ljava/math/BigDecimal;

    .line 235
    move-result-object v5

    .line 236
    .line 237
    if-nez v5, :cond_10

    .line 238
    .line 239
    .line 240
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getInputBuyPrice()Ljava/math/BigDecimal;

    .line 241
    move-result-object v5

    .line 242
    goto :goto_b

    .line 243
    .line 244
    .line 245
    :cond_f
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getInputSellPrice()Ljava/math/BigDecimal;

    .line 246
    move-result-object v5

    .line 247
    .line 248
    .line 249
    :cond_10
    :goto_b
    invoke-static {v5}, Lkf/a;->B(Ljava/math/BigDecimal;)Z

    .line 250
    move-result v7

    .line 251
    .line 252
    if-eqz v7, :cond_11

    .line 253
    goto :goto_9

    .line 254
    .line 255
    :cond_11
    if-eqz v5, :cond_d

    .line 256
    .line 257
    .line 258
    invoke-static {v5}, Lcom/fasterxml/jackson/databind/node/a;->a(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 259
    move-result-object v5

    .line 260
    .line 261
    if-eqz v5, :cond_d

    .line 262
    .line 263
    .line 264
    invoke-virtual {v5}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 265
    move-result-object v5

    .line 266
    move-object v7, v5

    .line 267
    .line 268
    .line 269
    :goto_c
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getTradeType()Lcom/kubi/tradebase/tradetype/TradeType;

    .line 270
    move-result-object v5

    .line 271
    .line 272
    sget-object v8, Lcom/kubi/tradebase/tradetype/TradeType;->MARKET_STOP:Lcom/kubi/tradebase/tradetype/TradeType;

    .line 273
    .line 274
    if-ne v5, v8, :cond_14

    .line 275
    .line 276
    .line 277
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getInputBuyTriggerPrice()Ljava/math/BigDecimal;

    .line 278
    move-result-object v5

    .line 279
    .line 280
    .line 281
    invoke-static {v5}, Lkf/a;->B(Ljava/math/BigDecimal;)Z

    .line 282
    move-result v5

    .line 283
    .line 284
    if-eqz v5, :cond_13

    .line 285
    :cond_12
    :goto_d
    move-object v5, v6

    .line 286
    goto :goto_f

    .line 287
    .line 288
    .line 289
    :cond_13
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getInputBuyTriggerPrice()Ljava/math/BigDecimal;

    .line 290
    move-result-object v5

    .line 291
    .line 292
    if-eqz v5, :cond_12

    .line 293
    .line 294
    .line 295
    invoke-static {v5}, Lcom/fasterxml/jackson/databind/node/a;->a(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 296
    move-result-object v5

    .line 297
    .line 298
    if-eqz v5, :cond_12

    .line 299
    .line 300
    .line 301
    invoke-virtual {v5}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 302
    move-result-object v5

    .line 303
    goto :goto_f

    .line 304
    .line 305
    .line 306
    :cond_14
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getTradeType()Lcom/kubi/tradebase/tradetype/TradeType;

    .line 307
    move-result-object v5

    .line 308
    .line 309
    sget-object v12, Lcom/kubi/tradebase/tradetype/TradeType;->LIMIT_STOP:Lcom/kubi/tradebase/tradetype/TradeType;

    .line 310
    .line 311
    if-ne v5, v12, :cond_12

    .line 312
    .line 313
    .line 314
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getPanelModel()Lhd/b;

    .line 315
    move-result-object v5

    .line 316
    .line 317
    sget-object v12, Lhd/b$b;->a:Lhd/b$b;

    .line 318
    .line 319
    .line 320
    invoke-static {v5, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 321
    move-result v5

    .line 322
    .line 323
    if-eqz v5, :cond_15

    .line 324
    .line 325
    .line 326
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getInputBuyPrice()Ljava/math/BigDecimal;

    .line 327
    move-result-object v5

    .line 328
    .line 329
    if-nez v5, :cond_16

    .line 330
    .line 331
    .line 332
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getInputSellPrice()Ljava/math/BigDecimal;

    .line 333
    move-result-object v5

    .line 334
    goto :goto_e

    .line 335
    .line 336
    .line 337
    :cond_15
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getInputBuyPrice()Ljava/math/BigDecimal;

    .line 338
    move-result-object v5

    .line 339
    .line 340
    .line 341
    :cond_16
    :goto_e
    invoke-static {v5}, Lkf/a;->B(Ljava/math/BigDecimal;)Z

    .line 342
    move-result v12

    .line 343
    .line 344
    if-eqz v12, :cond_17

    .line 345
    goto :goto_d

    .line 346
    .line 347
    :cond_17
    if-eqz v5, :cond_12

    .line 348
    .line 349
    .line 350
    invoke-static {v5}, Lcom/fasterxml/jackson/databind/node/a;->a(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 351
    move-result-object v5

    .line 352
    .line 353
    if-eqz v5, :cond_12

    .line 354
    .line 355
    .line 356
    invoke-virtual {v5}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 357
    move-result-object v5

    .line 358
    .line 359
    .line 360
    :goto_f
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getTradeType()Lcom/kubi/tradebase/tradetype/TradeType;

    .line 361
    move-result-object v12

    .line 362
    .line 363
    if-ne v12, v8, :cond_1a

    .line 364
    .line 365
    .line 366
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getInputSellTriggerPrice()Ljava/math/BigDecimal;

    .line 367
    move-result-object v8

    .line 368
    .line 369
    .line 370
    invoke-static {v8}, Lkf/a;->B(Ljava/math/BigDecimal;)Z

    .line 371
    move-result v8

    .line 372
    .line 373
    if-eqz v8, :cond_19

    .line 374
    :cond_18
    :goto_10
    move-object v8, v6

    .line 375
    goto :goto_12

    .line 376
    .line 377
    .line 378
    :cond_19
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getInputSellTriggerPrice()Ljava/math/BigDecimal;

    .line 379
    move-result-object v8

    .line 380
    .line 381
    if-eqz v8, :cond_18

    .line 382
    .line 383
    .line 384
    invoke-static {v8}, Lcom/fasterxml/jackson/databind/node/a;->a(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 385
    move-result-object v8

    .line 386
    .line 387
    if-eqz v8, :cond_18

    .line 388
    .line 389
    .line 390
    invoke-virtual {v8}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 391
    move-result-object v8

    .line 392
    goto :goto_12

    .line 393
    .line 394
    .line 395
    :cond_1a
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getTradeType()Lcom/kubi/tradebase/tradetype/TradeType;

    .line 396
    move-result-object v8

    .line 397
    .line 398
    sget-object v12, Lcom/kubi/tradebase/tradetype/TradeType;->LIMIT_STOP:Lcom/kubi/tradebase/tradetype/TradeType;

    .line 399
    .line 400
    if-ne v8, v12, :cond_18

    .line 401
    .line 402
    .line 403
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getPanelModel()Lhd/b;

    .line 404
    move-result-object v8

    .line 405
    .line 406
    sget-object v12, Lhd/b$b;->a:Lhd/b$b;

    .line 407
    .line 408
    .line 409
    invoke-static {v8, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 410
    move-result v8

    .line 411
    .line 412
    if-eqz v8, :cond_1b

    .line 413
    .line 414
    .line 415
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getInputSellPrice()Ljava/math/BigDecimal;

    .line 416
    move-result-object v8

    .line 417
    .line 418
    if-nez v8, :cond_1c

    .line 419
    .line 420
    .line 421
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getInputBuyPrice()Ljava/math/BigDecimal;

    .line 422
    move-result-object v8

    .line 423
    goto :goto_11

    .line 424
    .line 425
    .line 426
    :cond_1b
    invoke-virtual {v10}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getInputSellPrice()Ljava/math/BigDecimal;

    .line 427
    move-result-object v8

    .line 428
    .line 429
    .line 430
    :cond_1c
    :goto_11
    invoke-static {v8}, Lkf/a;->B(Ljava/math/BigDecimal;)Z

    .line 431
    move-result v12

    .line 432
    .line 433
    if-eqz v12, :cond_1d

    .line 434
    goto :goto_10

    .line 435
    .line 436
    :cond_1d
    if-eqz v8, :cond_18

    .line 437
    .line 438
    .line 439
    invoke-static {v8}, Lcom/fasterxml/jackson/databind/node/a;->a(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 440
    move-result-object v8

    .line 441
    .line 442
    if-eqz v8, :cond_18

    .line 443
    .line 444
    .line 445
    invoke-virtual {v8}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 446
    move-result-object v8

    .line 447
    .line 448
    .line 449
    :goto_12
    invoke-virtual {v11}, Lcom/kubi/core/biz/submit/TradeSubmitVM;->m0()Lkotlinx/coroutines/x1;

    .line 450
    move-result-object v12

    .line 451
    .line 452
    if-eqz v12, :cond_1e

    .line 453
    const/4 v13, 0x1

    .line 454
    .line 455
    .line 456
    invoke-static {v12, v6, v13, v6}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    :cond_1e
    invoke-static {v11}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 460
    move-result-object v14

    .line 461
    .line 462
    .line 463
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 464
    move-result-object v15

    .line 465
    .line 466
    new-instance v17, Lcom/kubi/core/biz/submit/TradeSymbolBalanceExtKt$fetchTradeBalanceDataInternal$1;

    .line 467
    const/4 v12, 0x0

    .line 468
    move-object v6, v5

    .line 469
    move-object v5, v0

    .line 470
    .line 471
    move-object/from16 v0, v17

    .line 472
    .line 473
    .line 474
    invoke-direct/range {v0 .. v12}, Lcom/kubi/core/biz/submit/TradeSymbolBalanceExtKt$fetchTradeBalanceDataInternal$1;-><init>(Lcom/kubi/core/biz/margininfo/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;Lcom/kubi/core/biz/submit/TradeSubmitVM;Lkotlin/coroutines/Continuation;)V

    .line 475
    .line 476
    const/16 v18, 0x2

    .line 477
    .line 478
    const/16 v19, 0x0

    .line 479
    .line 480
    const/16 v16, 0x0

    .line 481
    .line 482
    .line 483
    invoke-static/range {v14 .. v19}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 484
    move-result-object v0

    .line 485
    .line 486
    .line 487
    invoke-virtual {v11, v0}, Lcom/kubi/core/biz/submit/TradeSubmitVM;->L0(Lkotlinx/coroutines/x1;)V

    .line 488
    :cond_1f
    :goto_13
    return-void
.end method

.method public static final i(Lcom/kubi/data/entity/SymbolInfoEntity;)Ljava/math/BigDecimal;
    .locals 1
    .param p0    # Lcom/kubi/data/entity/SymbolInfoEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "symbolInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lcom/kubi/core/biz/submit/TradeSymbolBalanceExtKt;->j(Lcom/kubi/data/entity/SymbolInfoEntity;)Ljava/math/BigDecimal;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    sget-object p0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 14
    .line 15
    const-string v0, "ZERO"

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    :cond_0
    return-object p0
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
.end method

.method public static final j(Lcom/kubi/data/entity/SymbolInfoEntity;)Ljava/math/BigDecimal;
    .locals 4
    .param p0    # Lcom/kubi/data/entity/SymbolInfoEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "symbolInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lee/a;->a:Lee/a;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lee/a;->a()Lcom/kubi/margin/api/IMarginService;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-interface {v1, p0}, Lcom/kubi/margin/api/IMarginService;->r(Lcom/kubi/data/entity/SymbolInfoEntity;)Ljava/math/BigDecimal;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lee/a;->a()Lcom/kubi/margin/api/IMarginService;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-interface {v2, p0}, Lcom/kubi/margin/api/IMarginService;->J(Lcom/kubi/data/entity/SymbolInfoEntity;)Ljava/math/BigDecimal;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lee/a;->a()Lcom/kubi/margin/api/IMarginService;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, p0}, Lcom/kubi/margin/api/IMarginService;->m0(Lcom/kubi/data/entity/SymbolInfoEntity;)Lcom/kubi/margin/api/entity/FeeEntity;

    .line 31
    move-result-object p0

    .line 32
    const/4 v0, 0x0

    .line 33
    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/FeeEntity;->getBuyTaxRate()Ljava/lang/String;

    .line 38
    move-result-object p0

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object p0, v0

    .line 41
    :goto_0
    const/4 v3, 0x1

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v0, v3, v0}, Lcom/kubi/utils/extensions/DowngradeExKt;->e(Ljava/lang/String;Ljava/math/BigDecimal;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 45
    move-result-object p0

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v2}, Lkotlin/comparisons/ComparisonsKt;->maxOf(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    check-cast v0, Ljava/math/BigDecimal;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p0}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 55
    move-result-object p0

    .line 56
    return-object p0
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
.end method

.method public static final k(Ljava/math/BigDecimal;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-static {p0}, Lcom/fasterxml/jackson/databind/node/a;->a(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 12
    move-result-object p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    .line 16
    :goto_0
    if-nez p0, :cond_1

    .line 17
    .line 18
    const-string p0, ""

    .line 19
    :cond_1
    return-object p0
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
.end method

.method public static final l(Lcom/kubi/core/biz/submit/TradeSubmitVM;)V
    .locals 4
    .param p0    # Lcom/kubi/core/biz/submit/TradeSubmitVM;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    check-cast v0, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/kubi/core/biz/submit/TradeSymbolBalanceExtKt;->n(Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;)Lcom/kubi/core/biz/submit/a;

    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getSymbolInfo()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x2

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v2, v1, v2}, Lcom/kubi/core/biz/submit/TradeSymbolBalanceExtKt;->d(Lcom/kubi/data/entity/SymbolInfoEntity;Lcom/kubi/tradebase/available/AvailableTradeAmountStatus;ILjava/lang/Object;)Lk30/d;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lcom/kubi/core/biz/submit/TradeSubmitVM;->R0(Lk30/d;)V

    .line 31
    return-void

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {v0}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getTradeBalance()Lxc/h;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Lxc/h;->d()Lxc/a;

    .line 41
    move-result-object v3

    .line 42
    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Lxc/a;->a()Ljava/math/BigDecimal;

    .line 47
    move-result-object v3

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move-object v3, v2

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-virtual {v0}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getTradeBalance()Lxc/h;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lxc/h;->c()Lxc/a;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lxc/a;->a()Ljava/math/BigDecimal;

    .line 65
    move-result-object v2

    .line 66
    .line 67
    .line 68
    :cond_2
    invoke-static {p0, v1, v3, v2}, Lcom/kubi/core/biz/submit/TradeSymbolBalanceExtKt;->o(Lcom/kubi/core/biz/submit/TradeSubmitVM;Lcom/kubi/core/biz/submit/a;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V

    .line 69
    return-void
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
.end method

.method public static final m(Lcom/kubi/core/biz/submit/TradeSubmitVM;Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;Lcom/kubi/core/biz/margininfo/a;J)V
    .locals 12

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getSymbol()Ljava/lang/String;

    .line 4
    move-result-object v4

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getTradeType()Lcom/kubi/tradebase/tradetype/TradeType;

    .line 8
    move-result-object v5

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 16
    move-result-object v8

    .line 17
    .line 18
    new-instance v0, Lcom/kubi/core/biz/submit/TradeSymbolBalanceExtKt$scheduleBalanceFetch$1;

    .line 19
    const/4 v7, 0x0

    .line 20
    move-object v1, p0

    .line 21
    move-object v6, p2

    .line 22
    move-wide v2, p3

    .line 23
    .line 24
    .line 25
    invoke-direct/range {v0 .. v7}, Lcom/kubi/core/biz/submit/TradeSymbolBalanceExtKt$scheduleBalanceFetch$1;-><init>(Lcom/kubi/core/biz/submit/TradeSubmitVM;JLjava/lang/String;Lcom/kubi/tradebase/tradetype/TradeType;Lcom/kubi/core/biz/margininfo/a;Lkotlin/coroutines/Continuation;)V

    .line 26
    const/4 v10, 0x2

    .line 27
    const/4 v11, 0x0

    .line 28
    move-object v7, v8

    .line 29
    const/4 v8, 0x0

    .line 30
    move-object v6, p1

    .line 31
    move-object v9, v0

    .line 32
    .line 33
    .line 34
    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 35
    return-void
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
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
.end method

.method public static final n(Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;)Lcom/kubi/core/biz/submit/a;
    .locals 12

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getSymbolInfo()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return-object v1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getCode()Ljava/lang/String;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getSymbol()Ljava/lang/String;

    .line 16
    move-result-object v3

    .line 17
    .line 18
    .line 19
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result v2

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    return-object v1

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getTradeType()Lcom/kubi/tradebase/tradetype/TradeType;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    sget-object v2, Lcom/kubi/tradebase/tradetype/TradeType;->LIMIT:Lcom/kubi/tradebase/tradetype/TradeType;

    .line 32
    :cond_2
    move-object v5, v2

    .line 33
    .line 34
    sget-object v2, Lcom/kubi/tradebase/tradetype/TradeType;->MARKET:Lcom/kubi/tradebase/tradetype/TradeType;

    .line 35
    .line 36
    if-eq v5, v2, :cond_7

    .line 37
    .line 38
    sget-object v2, Lcom/kubi/tradebase/tradetype/TradeType;->MARKET_STOP:Lcom/kubi/tradebase/tradetype/TradeType;

    .line 39
    .line 40
    if-ne v5, v2, :cond_3

    .line 41
    goto :goto_1

    .line 42
    .line 43
    .line 44
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getPanelModel()Lhd/b;

    .line 45
    move-result-object v2

    .line 46
    .line 47
    sget-object v3, Lhd/b$b;->a:Lhd/b$b;

    .line 48
    .line 49
    .line 50
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    move-result v2

    .line 52
    .line 53
    if-eqz v2, :cond_6

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getInputBuyPrice()Ljava/math/BigDecimal;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    if-nez v2, :cond_4

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getInputSellPrice()Ljava/math/BigDecimal;

    .line 63
    move-result-object v2

    .line 64
    .line 65
    .line 66
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getInputSellPrice()Ljava/math/BigDecimal;

    .line 67
    move-result-object v3

    .line 68
    .line 69
    if-nez v3, :cond_5

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getInputBuyPrice()Ljava/math/BigDecimal;

    .line 73
    move-result-object v3

    .line 74
    :cond_5
    :goto_0
    move-object v6, v2

    .line 75
    move-object v7, v3

    .line 76
    goto :goto_3

    .line 77
    .line 78
    .line 79
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getInputBuyPrice()Ljava/math/BigDecimal;

    .line 80
    move-result-object v2

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getInputSellPrice()Ljava/math/BigDecimal;

    .line 84
    move-result-object v3

    .line 85
    goto :goto_0

    .line 86
    .line 87
    .line 88
    :cond_7
    :goto_1
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getBbo()Lcom/kubi/core/spot/entity/OrderBookCenterEntity;

    .line 89
    move-result-object v2

    .line 90
    .line 91
    if-eqz v2, :cond_8

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Lcom/kubi/core/spot/entity/OrderBookCenterEntity;->getBestAsk()D

    .line 95
    move-result-wide v2

    .line 96
    .line 97
    .line 98
    invoke-static {v2, v3}, Lcom/kubi/tradebase/marketamount/h;->a(D)Ljava/math/BigDecimal;

    .line 99
    move-result-object v2

    .line 100
    goto :goto_2

    .line 101
    :cond_8
    move-object v2, v1

    .line 102
    .line 103
    .line 104
    :goto_2
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getBbo()Lcom/kubi/core/spot/entity/OrderBookCenterEntity;

    .line 105
    move-result-object p0

    .line 106
    .line 107
    if-eqz p0, :cond_9

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Lcom/kubi/core/spot/entity/OrderBookCenterEntity;->getBestBid()D

    .line 111
    move-result-wide v3

    .line 112
    .line 113
    .line 114
    invoke-static {v3, v4}, Lcom/kubi/tradebase/marketamount/h;->a(D)Ljava/math/BigDecimal;

    .line 115
    move-result-object p0

    .line 116
    move-object v3, p0

    .line 117
    goto :goto_0

    .line 118
    :cond_9
    move-object v3, v1

    .line 119
    goto :goto_0

    .line 120
    .line 121
    :goto_3
    new-instance v3, Lcom/kubi/core/biz/submit/a;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getCode()Ljava/lang/String;

    .line 125
    move-result-object v4

    .line 126
    .line 127
    const-string p0, "getCode(...)"

    .line 128
    .line 129
    .line 130
    invoke-static {v4, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseIncrement()Ljava/lang/String;

    .line 134
    move-result-object p0

    .line 135
    const/4 v2, 0x1

    .line 136
    .line 137
    .line 138
    invoke-static {p0, v1, v2, v1}, Lcom/kubi/utils/extensions/DowngradeExKt;->e(Ljava/lang/String;Ljava/math/BigDecimal;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 139
    move-result-object v8

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteIncrement()Ljava/lang/String;

    .line 143
    move-result-object p0

    .line 144
    .line 145
    .line 146
    invoke-static {p0, v1, v2, v1}, Lcom/kubi/utils/extensions/DowngradeExKt;->e(Ljava/lang/String;Ljava/math/BigDecimal;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 147
    move-result-object v9

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseIncrementPrecision()I

    .line 151
    move-result v10

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteIncrementPrecision()I

    .line 155
    move-result v11

    .line 156
    .line 157
    .line 158
    invoke-direct/range {v3 .. v11}, Lcom/kubi/core/biz/submit/a;-><init>(Ljava/lang/String;Lcom/kubi/tradebase/tradetype/TradeType;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;II)V

    .line 159
    return-object v3
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
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
.end method

.method public static final o(Lcom/kubi/core/biz/submit/TradeSubmitVM;Lcom/kubi/core/biz/submit/a;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V
    .locals 12

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getSymbolInfo()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {v0}, Lcom/kubi/core/biz/submit/TradeSymbolBalanceExtKt;->i(Lcom/kubi/data/entity/SymbolInfoEntity;)Ljava/math/BigDecimal;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/kubi/core/biz/submit/a;->d()Ljava/lang/String;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-static {p2}, Lcom/kubi/core/biz/submit/TradeSymbolBalanceExtKt;->k(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    .line 28
    invoke-static {p3}, Lcom/kubi/core/biz/submit/TradeSymbolBalanceExtKt;->k(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 29
    move-result-object v4

    .line 30
    .line 31
    .line 32
    invoke-static {v1}, Lcom/kubi/core/biz/submit/TradeSymbolBalanceExtKt;->k(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 33
    move-result-object v5

    .line 34
    .line 35
    .line 36
    filled-new-array {v2, v3, v4, v5}, [Ljava/lang/String;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    .line 40
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 41
    move-result-object v3

    .line 42
    .line 43
    const/16 v10, 0x3e

    .line 44
    const/4 v11, 0x0

    .line 45
    .line 46
    const-string v4, "|"

    .line 47
    const/4 v5, 0x0

    .line 48
    const/4 v6, 0x0

    .line 49
    const/4 v7, 0x0

    .line 50
    const/4 v8, 0x0

    .line 51
    const/4 v9, 0x0

    .line 52
    .line 53
    .line 54
    invoke-static/range {v3 .. v11}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 55
    move-result-object v2

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/TradeSubmitVM;->i0()Ljava/lang/String;

    .line 59
    move-result-object v3

    .line 60
    .line 61
    .line 62
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    move-result v3

    .line 64
    .line 65
    if-eqz v3, :cond_1

    .line 66
    :goto_0
    return-void

    .line 67
    .line 68
    :cond_1
    sget-object v3, Lk30/a;->a:Lk30/a;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/kubi/core/biz/submit/a;->c()Ljava/math/BigDecimal;

    .line 72
    move-result-object v4

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Lcom/kubi/core/biz/submit/a;->a()Ljava/math/BigDecimal;

    .line 76
    move-result-object v5

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, p2, v4, v1, v5}, Lk30/a;->b(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 80
    move-result-object p2

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/kubi/core/biz/submit/a;->g()Ljava/math/BigDecimal;

    .line 84
    move-result-object v1

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/kubi/core/biz/submit/a;->e()Ljava/math/BigDecimal;

    .line 88
    move-result-object v4

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3, p3, v1, v4}, Lk30/a;->c(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 92
    move-result-object p3

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v2}, Lcom/kubi/core/biz/submit/TradeSubmitVM;->J0(Ljava/lang/String;)V

    .line 96
    .line 97
    if-nez p2, :cond_2

    .line 98
    .line 99
    sget-object v1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 100
    goto :goto_1

    .line 101
    :cond_2
    move-object v1, p2

    .line 102
    .line 103
    .line 104
    :goto_1
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrencyName()Ljava/lang/String;

    .line 108
    move-result-object v2

    .line 109
    .line 110
    const-string v3, ""

    .line 111
    .line 112
    if-nez v2, :cond_3

    .line 113
    move-object v2, v3

    .line 114
    .line 115
    .line 116
    :cond_3
    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 117
    move-result v4

    .line 118
    .line 119
    if-eqz v4, :cond_4

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrency()Ljava/lang/String;

    .line 123
    move-result-object v2

    .line 124
    .line 125
    if-nez v2, :cond_4

    .line 126
    move-object v2, v3

    .line 127
    .line 128
    .line 129
    :cond_4
    invoke-virtual {p1}, Lcom/kubi/core/biz/submit/a;->b()I

    .line 130
    move-result v4

    .line 131
    .line 132
    if-nez p2, :cond_5

    .line 133
    .line 134
    sget-object p2, Lcom/kubi/tradebase/available/AvailableTradeAmountStatus;->INVALID:Lcom/kubi/tradebase/available/AvailableTradeAmountStatus;

    .line 135
    goto :goto_2

    .line 136
    .line 137
    :cond_5
    sget-object p2, Lcom/kubi/tradebase/available/AvailableTradeAmountStatus;->VALID:Lcom/kubi/tradebase/available/AvailableTradeAmountStatus;

    .line 138
    .line 139
    :goto_2
    new-instance v5, Lk30/f;

    .line 140
    .line 141
    .line 142
    invoke-direct {v5, v1, v2, v4, p2}, Lk30/f;-><init>(Ljava/math/BigDecimal;Ljava/lang/String;ILcom/kubi/tradebase/available/AvailableTradeAmountStatus;)V

    .line 143
    .line 144
    if-nez p3, :cond_6

    .line 145
    .line 146
    sget-object p2, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 147
    goto :goto_3

    .line 148
    :cond_6
    move-object p2, p3

    .line 149
    .line 150
    .line 151
    :goto_3
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrencyName()Ljava/lang/String;

    .line 155
    move-result-object v1

    .line 156
    .line 157
    if-nez v1, :cond_7

    .line 158
    move-object v1, v3

    .line 159
    .line 160
    .line 161
    :cond_7
    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 162
    move-result v2

    .line 163
    .line 164
    if-eqz v2, :cond_9

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrency()Ljava/lang/String;

    .line 168
    move-result-object v0

    .line 169
    .line 170
    if-nez v0, :cond_8

    .line 171
    goto :goto_4

    .line 172
    :cond_8
    move-object v3, v0

    .line 173
    :goto_4
    move-object v1, v3

    .line 174
    .line 175
    .line 176
    :cond_9
    invoke-virtual {p1}, Lcom/kubi/core/biz/submit/a;->f()I

    .line 177
    move-result p1

    .line 178
    .line 179
    if-nez p3, :cond_a

    .line 180
    .line 181
    sget-object p3, Lcom/kubi/tradebase/available/AvailableTradeAmountStatus;->INVALID:Lcom/kubi/tradebase/available/AvailableTradeAmountStatus;

    .line 182
    goto :goto_5

    .line 183
    .line 184
    :cond_a
    sget-object p3, Lcom/kubi/tradebase/available/AvailableTradeAmountStatus;->VALID:Lcom/kubi/tradebase/available/AvailableTradeAmountStatus;

    .line 185
    .line 186
    :goto_5
    new-instance v0, Lk30/f;

    .line 187
    .line 188
    .line 189
    invoke-direct {v0, p2, v1, p1, p3}, Lk30/f;-><init>(Ljava/math/BigDecimal;Ljava/lang/String;ILcom/kubi/tradebase/available/AvailableTradeAmountStatus;)V

    .line 190
    .line 191
    new-instance p1, Lk30/d;

    .line 192
    .line 193
    .line 194
    invoke-direct {p1, v5, v0}, Lk30/d;-><init>(Lk30/f;Lk30/f;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0, p1}, Lcom/kubi/core/biz/submit/TradeSubmitVM;->R0(Lk30/d;)V

    .line 198
    return-void
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
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
.end method
