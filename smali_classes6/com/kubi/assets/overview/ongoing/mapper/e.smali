.class public final Lcom/kubi/assets/overview/ongoing/mapper/e;
.super Lgb/a;
.source "IsolatedMapper.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgb/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u0003H\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u0003H\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u0003H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/kubi/assets/overview/ongoing/mapper/IsolatedMapper;",
        "Lcom/kubi/assets/overview/ongoing/mapper/BaseMapper;",
        "Lcom/kubi/assets/overview/ongoing/mapper/IMapper;",
        "Lcom/kubi/margin/api/entity/MarginPosition;",
        "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$IsolatedItem;",
        "title",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "getTitle",
        "()Ljava/lang/String;",
        "map",
        "input",
        "isIntercept",
        "",
        "getProfitText",
        "getProfitRateText",
        "AssetsCenterLib_googleRelease"
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
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "title"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lgb/a;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/kubi/assets/overview/ongoing/mapper/e;->a:Ljava/lang/String;

    .line 11
    return-void
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


# virtual methods
.method public final d(Lcom/kubi/margin/api/entity/MarginPosition;)Ljava/lang/String;
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/assets/overview/ongoing/mapper/e;->f(Lcom/kubi/margin/api/entity/MarginPosition;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    const-string v1, "--"

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    return-object v1

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginPosition;->calculatorProfitPercent()Ljava/math/BigDecimal;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    return-object v1

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-virtual {p1}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 20
    move-result-object v2

    .line 21
    const/4 v6, 0x5

    .line 22
    const/4 v7, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x1

    .line 25
    const/4 v5, 0x0

    .line 26
    .line 27
    .line 28
    invoke-static/range {v2 .. v7}, Lcom/kubi/assets/AssetExKt;->h(Ljava/lang/String;Ljava/math/RoundingMode;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 29
    move-result-object p1

    .line 30
    return-object p1
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

.method public final e(Lcom/kubi/margin/api/entity/MarginPosition;)Ljava/lang/String;
    .locals 14

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/assets/overview/ongoing/mapper/e;->f(Lcom/kubi/margin/api/entity/MarginPosition;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    const-string v1, "--"

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    return-object v1

    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/kubi/margin/api/IMarginService;->a:Lcom/kubi/margin/api/IMarginService$Companion;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/kubi/margin/api/IMarginService$Companion;->get()Lcom/kubi/margin/api/IMarginService;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginPosition;->getTag()Ljava/lang/String;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    const-string v3, ""

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    move-object v2, v3

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-interface {v0, v2}, Lcom/kubi/margin/api/IMarginService;->z(Ljava/lang/String;)Ljava/lang/Integer;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginPosition;->calculatorProfitValue()Ljava/math/BigDecimal;

    .line 32
    move-result-object v4

    .line 33
    .line 34
    if-nez v4, :cond_2

    .line 35
    return-object v1

    .line 36
    .line 37
    .line 38
    :cond_2
    invoke-virtual {v4}, Ljava/math/BigDecimal;->doubleValue()D

    .line 39
    move-result-wide v1

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    .line 46
    invoke-static {v1}, Lcom/kubi/utils/extensions/d;->f(Ljava/lang/Double;)D

    .line 47
    move-result-wide v1

    .line 48
    .line 49
    const-wide/16 v5, 0x0

    .line 50
    .line 51
    cmpl-double v1, v1, v5

    .line 52
    .line 53
    if-lez v1, :cond_3

    .line 54
    .line 55
    const-string v3, "+"

    .line 56
    .line 57
    :cond_3
    if-nez v0, :cond_5

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 61
    move-result-object p1

    .line 62
    const/4 v0, 0x0

    .line 63
    .line 64
    if-eqz p1, :cond_4

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 68
    move-result-object p1

    .line 69
    goto :goto_0

    .line 70
    :cond_4
    move-object p1, v0

    .line 71
    .line 72
    .line 73
    :goto_0
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    move-result-object p1

    .line 75
    const/4 v1, 0x0

    .line 76
    const/4 v2, 0x2

    .line 77
    .line 78
    .line 79
    invoke-static {v4, p1, v1, v2, v0}, Lgf/i;->b(Ljava/math/BigDecimal;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 80
    move-result-object p1

    .line 81
    goto :goto_1

    .line 82
    .line 83
    .line 84
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 85
    move-result v6

    .line 86
    .line 87
    const/16 v12, 0x55

    .line 88
    const/4 v13, 0x0

    .line 89
    const/4 v5, 0x0

    .line 90
    const/4 v7, 0x0

    .line 91
    const/4 v8, 0x1

    .line 92
    const/4 v9, 0x0

    .line 93
    const/4 v10, 0x2

    .line 94
    const/4 v11, 0x0

    .line 95
    .line 96
    .line 97
    invoke-static/range {v4 .. v13}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    move-result-object p1

    .line 114
    return-object p1
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
.end method

.method public final f(Lcom/kubi/margin/api/entity/MarginPosition;)Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginPosition;->getStatus()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "BANKRUPTCY"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginPosition;->getStatus()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    const-string v1, "IN_LIQUIDATION"

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginPosition;->liabilityConversionCompat()Ljava/math/BigDecimal;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 36
    move-result p1

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    move-result-object p1

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 p1, 0x0

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-static {p1}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 46
    move-result p1

    .line 47
    .line 48
    if-nez p1, :cond_1

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const/4 p1, 0x0

    .line 51
    return p1

    .line 52
    :cond_2
    :goto_1
    const/4 p1, 0x1

    .line 53
    return p1
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
.end method

.method public g(Lcom/kubi/margin/api/entity/MarginPosition;)Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$f;
    .locals 24
    .param p1    # Lcom/kubi/margin/api/entity/MarginPosition;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "input"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    sget-object v2, Lgf/n;->a:Lgf/n;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/kubi/margin/api/entity/MarginPosition;->getBaseAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 15
    move-result-object v3

    .line 16
    const/4 v4, 0x0

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 22
    move-result-object v3

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v3, v4

    .line 25
    .line 26
    :goto_0
    const-string v5, ""

    .line 27
    .line 28
    if-nez v3, :cond_1

    .line 29
    move-object v3, v5

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {v2, v3}, Lgf/n;->u(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/kubi/margin/api/entity/MarginPosition;->getTag()Ljava/lang/String;

    .line 37
    move-result-object v6

    .line 38
    .line 39
    if-nez v6, :cond_2

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move-object v5, v6

    .line 42
    .line 43
    .line 44
    :goto_1
    invoke-virtual {v2, v5}, Lgf/n;->B(Ljava/lang/String;)Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 45
    move-result-object v2

    .line 46
    .line 47
    if-eqz v3, :cond_3

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Lcom/kubi/data/entity/CoinInfoEntity;->getIconUrl()Ljava/lang/String;

    .line 51
    move-result-object v3

    .line 52
    move-object v7, v3

    .line 53
    goto :goto_2

    .line 54
    :cond_3
    move-object v7, v4

    .line 55
    .line 56
    :goto_2
    new-instance v3, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    sget-object v5, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 62
    .line 63
    sget v6, Lcom/kubi/assets/R$string;->margin_isolated:I

    .line 64
    const/4 v8, 0x0

    .line 65
    .line 66
    new-array v9, v8, [Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5, v6, v9}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    move-result-object v6

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const/16 v6, 0x20

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    if-eqz v2, :cond_4

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getShowSymbol()Ljava/lang/String;

    .line 84
    move-result-object v2

    .line 85
    goto :goto_3

    .line 86
    :cond_4
    move-object v2, v4

    .line 87
    .line 88
    :goto_3
    const-string v6, "--"

    .line 89
    .line 90
    .line 91
    invoke-static {v2, v6}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    move-result-object v2

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    move-result-object v2

    .line 100
    .line 101
    .line 102
    invoke-virtual/range {p0 .. p1}, Lcom/kubi/assets/overview/ongoing/mapper/e;->e(Lcom/kubi/margin/api/entity/MarginPosition;)Ljava/lang/String;

    .line 103
    move-result-object v9

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {p0 .. p1}, Lcom/kubi/assets/overview/ongoing/mapper/e;->d(Lcom/kubi/margin/api/entity/MarginPosition;)Ljava/lang/String;

    .line 107
    move-result-object v10

    .line 108
    .line 109
    new-instance v3, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    sget v11, Lcom/kubi/assets/R$string;->margin_profit_loss:I

    .line 115
    .line 116
    new-array v8, v8, [Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5, v11, v8}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 120
    move-result-object v5

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    const/16 v5, 0x28

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 132
    move-result-object v5

    .line 133
    .line 134
    if-eqz v5, :cond_5

    .line 135
    .line 136
    .line 137
    invoke-virtual {v5}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 138
    move-result-object v5

    .line 139
    goto :goto_4

    .line 140
    :cond_5
    move-object v5, v4

    .line 141
    .line 142
    .line 143
    :goto_4
    invoke-static {v5, v6}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 144
    move-result-object v5

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    const/16 v5, 0x29

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    move-result-object v11

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1}, Lcom/kubi/margin/api/entity/MarginPosition;->calculatorProfitPercent()Ljava/math/BigDecimal;

    .line 160
    move-result-object v3

    .line 161
    .line 162
    if-eqz v3, :cond_6

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 166
    move-result-object v4

    .line 167
    .line 168
    .line 169
    :cond_6
    invoke-virtual {v0, v4}, Lgb/a;->a(Ljava/lang/String;)I

    .line 170
    move-result v14

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1}, Lcom/kubi/margin/api/entity/MarginPosition;->getMarkPriceString()Ljava/lang/String;

    .line 174
    move-result-object v12

    .line 175
    .line 176
    sget-object v3, Lcom/kubi/assets/service/a;->a:Lcom/kubi/assets/service/a;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3}, Lcom/kubi/assets/service/a;->d()Lcom/kubi/margin/api/IMarginService;

    .line 180
    move-result-object v4

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1}, Lcom/kubi/margin/api/entity/MarginPosition;->getTag()Ljava/lang/String;

    .line 184
    move-result-object v5

    .line 185
    .line 186
    .line 187
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 188
    move-result-object v5

    .line 189
    const/4 v6, 0x1

    .line 190
    .line 191
    .line 192
    invoke-interface {v4, v6, v5}, Lcom/kubi/margin/api/IMarginService;->u(ZLjava/lang/String;)Ljava/math/BigDecimal;

    .line 193
    move-result-object v4

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v4}, Lcom/kubi/margin/api/entity/MarginPosition;->liquidationPriceString(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 197
    move-result-object v13

    .line 198
    .line 199
    new-instance v15, Lcom/kubi/assets/entity/RiskViewEntity;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1}, Lcom/kubi/margin/api/entity/MarginPosition;->getStatus()Ljava/lang/String;

    .line 203
    move-result-object v5

    .line 204
    .line 205
    .line 206
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 207
    move-result-object v16

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1}, Lcom/kubi/margin/api/entity/MarginPosition;->calculatorLiabilityRate()Ljava/math/BigDecimal;

    .line 211
    move-result-object v5

    .line 212
    .line 213
    .line 214
    invoke-static {v5}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 215
    move-result-wide v17

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1}, Lcom/kubi/margin/api/entity/MarginPosition;->getRiskGrade()Ljava/lang/String;

    .line 219
    move-result-object v5

    .line 220
    .line 221
    .line 222
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    move-result-object v19

    .line 224
    .line 225
    .line 226
    invoke-virtual {v3}, Lcom/kubi/assets/service/a;->d()Lcom/kubi/margin/api/IMarginService;

    .line 227
    move-result-object v3

    .line 228
    .line 229
    .line 230
    invoke-virtual {v1}, Lcom/kubi/margin/api/entity/MarginPosition;->getTag()Ljava/lang/String;

    .line 231
    move-result-object v5

    .line 232
    .line 233
    .line 234
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 235
    move-result-object v5

    .line 236
    .line 237
    .line 238
    invoke-interface {v3, v6, v5}, Lcom/kubi/margin/api/IMarginService;->u0(ZLjava/lang/String;)Ljava/math/BigDecimal;

    .line 239
    move-result-object v20

    .line 240
    .line 241
    const/16 v22, 0x0

    .line 242
    .line 243
    const/16 v23, 0x1

    .line 244
    .line 245
    move-object/from16 v21, v4

    .line 246
    .line 247
    .line 248
    invoke-direct/range {v15 .. v23}, Lcom/kubi/assets/entity/RiskViewEntity;-><init>(Ljava/lang/String;DLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Z)V

    .line 249
    .line 250
    new-instance v5, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$f;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1}, Lcom/kubi/margin/api/entity/MarginPosition;->getTag()Ljava/lang/String;

    .line 254
    move-result-object v6

    .line 255
    move-object v8, v2

    .line 256
    .line 257
    .line 258
    invoke-direct/range {v5 .. v15}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/kubi/assets/entity/RiskViewEntity;)V

    .line 259
    .line 260
    iget-object v1, v0, Lcom/kubi/assets/overview/ongoing/mapper/e;->a:Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v5, v1}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;->c(Ljava/lang/String;)V

    .line 264
    return-object v5
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
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
.end method
