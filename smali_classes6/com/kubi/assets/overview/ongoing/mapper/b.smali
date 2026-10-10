.class public final Lcom/kubi/assets/overview/ongoing/mapper/b;
.super Lgb/a;
.source "CopyTradingMapper.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgb/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/kubi/assets/overview/ongoing/mapper/CopyTradingMapper;",
        "Lcom/kubi/assets/overview/ongoing/mapper/BaseMapper;",
        "Lcom/kubi/assets/overview/ongoing/mapper/IMapper;",
        "Lcom/kubi/assets/entity/CopyTradingItem;",
        "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$CopyTradingItem;",
        "title",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "map",
        "input",
        "getProfit",
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
    iput-object p1, p0, Lcom/kubi/assets/overview/ongoing/mapper/b;->a:Ljava/lang/String;

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
.method public final d(Lcom/kubi/assets/entity/CopyTradingItem;)Ljava/lang/String;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/assets/entity/CopyTradingItem;->getTotalPnl()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v3, v4, v1, v2}, Lcom/kubi/utils/extensions/DowngradeExKt;->h(Ljava/lang/String;DILjava/lang/Object;)D

    .line 12
    move-result-wide v0

    .line 13
    .line 14
    cmpl-double v0, v0, v3

    .line 15
    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    const-string v0, "+"

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    const-string v0, ""

    .line 22
    .line 23
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/kubi/assets/entity/CopyTradingItem;->getTotalPnl()Ljava/lang/String;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/kubi/assets/entity/CopyTradingItem;->getPnlCurrency()Ljava/lang/String;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    .line 40
    invoke-static {v0, p1}, Lcom/kubi/assets/AssetExKt;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    move-result-object p1

    .line 49
    return-object p1
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
.end method

.method public e(Lcom/kubi/assets/entity/CopyTradingItem;)Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$b;
    .locals 12
    .param p1    # Lcom/kubi/assets/entity/CopyTradingItem;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "input"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/kubi/assets/overview/ongoing/mapper/b;->d(Lcom/kubi/assets/entity/CopyTradingItem;)Ljava/lang/String;

    .line 9
    move-result-object v6

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/kubi/assets/entity/CopyTradingItem;->getTotalPnlRatio()Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    const/4 v4, 0x5

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    const/4 v3, 0x0

    .line 19
    .line 20
    .line 21
    invoke-static/range {v0 .. v5}, Lcom/kubi/assets/AssetExKt;->h(Ljava/lang/String;Ljava/math/RoundingMode;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 22
    move-result-object v7

    .line 23
    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    sget-object v1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 30
    .line 31
    sget v2, Lcom/kubi/assets/R$string;->position_profit:I

    .line 32
    .line 33
    new-array v4, v3, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2, v4}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const/16 v2, 0x28

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/kubi/assets/entity/CopyTradingItem;->getPnlCurrency()Ljava/lang/String;

    .line 49
    move-result-object v4

    .line 50
    .line 51
    const-string v5, ""

    .line 52
    .line 53
    if-nez v4, :cond_0

    .line 54
    move-object v4, v5

    .line 55
    .line 56
    .line 57
    :cond_0
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const/16 v4, 0x29

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    move-result-object v8

    .line 67
    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    sget v9, Lcom/kubi/assets/R$string;->kc_tb_grid_invest_title:I

    .line 74
    .line 75
    new-array v3, v3, [Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v9, v3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 79
    move-result-object v1

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Lcom/kubi/assets/entity/CopyTradingItem;->getInvestmentCurrency()Ljava/lang/String;

    .line 89
    move-result-object v1

    .line 90
    .line 91
    if-nez v1, :cond_1

    .line 92
    move-object v1, v5

    .line 93
    .line 94
    .line 95
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    move-result-object v9

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/kubi/assets/entity/CopyTradingItem;->getCopyAmount()Ljava/lang/String;

    .line 106
    move-result-object v0

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Lcom/kubi/assets/entity/CopyTradingItem;->getInvestmentCurrency()Ljava/lang/String;

    .line 110
    move-result-object v1

    .line 111
    .line 112
    .line 113
    invoke-static {v0, v1}, Lcom/kubi/assets/AssetExKt;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 114
    move-result-object v10

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Lcom/kubi/assets/entity/CopyTradingItem;->getTotalPnlRatio()Ljava/lang/String;

    .line 118
    move-result-object v0

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v0}, Lgb/a;->a(Ljava/lang/String;)I

    .line 122
    move-result v11

    .line 123
    .line 124
    new-instance v1, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$b;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Lcom/kubi/assets/entity/CopyTradingItem;->getTraderInfoResponse()Lcom/kubi/assets/entity/TraderInfoResponse;

    .line 128
    move-result-object v0

    .line 129
    const/4 v2, 0x0

    .line 130
    .line 131
    if-eqz v0, :cond_2

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Lcom/kubi/assets/entity/TraderInfoResponse;->getLeadConfigId()Ljava/lang/Long;

    .line 135
    move-result-object v0

    .line 136
    goto :goto_0

    .line 137
    :cond_2
    move-object v0, v2

    .line 138
    .line 139
    .line 140
    :goto_0
    invoke-virtual {p1}, Lcom/kubi/assets/entity/CopyTradingItem;->getTraderInfoResponse()Lcom/kubi/assets/entity/TraderInfoResponse;

    .line 141
    move-result-object v3

    .line 142
    .line 143
    if-eqz v3, :cond_3

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3}, Lcom/kubi/assets/entity/TraderInfoResponse;->getAvatarUrl()Ljava/lang/String;

    .line 147
    move-result-object v3

    .line 148
    goto :goto_1

    .line 149
    :cond_3
    move-object v3, v2

    .line 150
    .line 151
    .line 152
    :goto_1
    invoke-virtual {p1}, Lcom/kubi/assets/entity/CopyTradingItem;->getTraderInfoResponse()Lcom/kubi/assets/entity/TraderInfoResponse;

    .line 153
    move-result-object v4

    .line 154
    .line 155
    if-eqz v4, :cond_4

    .line 156
    .line 157
    .line 158
    invoke-virtual {v4}, Lcom/kubi/assets/entity/TraderInfoResponse;->getNickName()Ljava/lang/String;

    .line 159
    move-result-object v2

    .line 160
    .line 161
    :cond_4
    if-nez v2, :cond_5

    .line 162
    move-object v4, v5

    .line 163
    goto :goto_2

    .line 164
    :cond_5
    move-object v4, v2

    .line 165
    .line 166
    .line 167
    :goto_2
    invoke-virtual {p1}, Lcom/kubi/assets/entity/CopyTradingItem;->getDuration()Ljava/lang/String;

    .line 168
    move-result-object p1

    .line 169
    .line 170
    if-nez p1, :cond_6

    .line 171
    :goto_3
    move-object v2, v0

    .line 172
    goto :goto_4

    .line 173
    :cond_6
    move-object v5, p1

    .line 174
    goto :goto_3

    .line 175
    .line 176
    .line 177
    :goto_4
    invoke-direct/range {v1 .. v11}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$b;-><init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 178
    .line 179
    iget-object p1, p0, Lcom/kubi/assets/overview/ongoing/mapper/b;->a:Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, p1}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;->c(Ljava/lang/String;)V

    .line 183
    return-object v1
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
.end method
