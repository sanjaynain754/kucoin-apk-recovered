.class public final Ldi/t;
.super Ldi/s;
.source "TradeTypeClickFilterOfDelegation.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/kubi/futures/history/filter/TradeTypeClickFilterOfDelegation;",
        "Lcom/kubi/futures/history/filter/TradeTypeClickFilter;",
        "clickView",
        "Landroidx/appcompat/widget/AppCompatTextView;",
        "anchorView",
        "Landroid/view/View;",
        "accountFilter",
        "Lcom/kubi/futures/history/filter/AccountTypeClickFilterOfDelegation;",
        "<init>",
        "(Landroidx/appcompat/widget/AppCompatTextView;Landroid/view/View;Lcom/kubi/futures/history/filter/AccountTypeClickFilterOfDelegation;)V",
        "buildTradeTypeList",
        "",
        "Lcom/kubi/futures/dialog/pop/SelectTradeTypeOfHistoryPopup$TradeTypeAdapter$TradeTypeIndex;",
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
.field public final e:Ldi/a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/AppCompatTextView;Landroid/view/View;Ldi/a;)V
    .locals 1
    .param p1    # Landroidx/appcompat/widget/AppCompatTextView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ldi/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "clickView"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "anchorView"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Ldi/s;-><init>(Landroidx/appcompat/widget/AppCompatTextView;Landroid/view/View;)V

    .line 14
    .line 15
    iput-object p3, p0, Ldi/t;->e:Ldi/a;

    .line 16
    return-void
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
.end method


# virtual methods
.method public d()Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lxh/d1$a$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lxh/d1$a$a;

    .line 3
    .line 4
    sget-object v6, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 5
    .line 6
    sget v1, Lcom/kubi/kumex/R$string;->all:I

    .line 7
    const/4 v7, 0x0

    .line 8
    .line 9
    new-array v2, v7, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v6, v1, v2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x0

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2, v7}, Lxh/d1$a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 18
    .line 19
    new-instance v1, Lxh/d1$a$a;

    .line 20
    .line 21
    sget v2, Lcom/kubi/kumex/R$string;->limit_price:I

    .line 22
    .line 23
    new-array v3, v7, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v6, v2, v3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    const-string v3, "limit"

    .line 30
    .line 31
    .line 32
    invoke-direct {v1, v2, v3, v7}, Lxh/d1$a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 33
    .line 34
    new-instance v2, Lxh/d1$a$a;

    .line 35
    .line 36
    sget v3, Lcom/kubi/kumex/R$string;->market_price:I

    .line 37
    .line 38
    new-array v4, v7, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v6, v3, v4}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    move-result-object v3

    .line 43
    .line 44
    const-string v4, "market"

    .line 45
    .line 46
    .line 47
    invoke-direct {v2, v3, v4, v7}, Lxh/d1$a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 48
    .line 49
    new-instance v3, Lxh/d1$a$a;

    .line 50
    .line 51
    sget v4, Lcom/kubi/kumex/R$string;->condition_price:I

    .line 52
    .line 53
    new-array v5, v7, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v6, v4, v5}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    move-result-object v4

    .line 58
    .line 59
    const-string v5, "limit_stop"

    .line 60
    .line 61
    .line 62
    invoke-direct {v3, v4, v5, v7}, Lxh/d1$a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 63
    .line 64
    new-instance v4, Lxh/d1$a$a;

    .line 65
    .line 66
    sget v5, Lcom/kubi/kumex/R$string;->market_stop:I

    .line 67
    .line 68
    new-array v8, v7, [Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v6, v5, v8}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    move-result-object v5

    .line 73
    .line 74
    const-string v8, "market_stop"

    .line 75
    .line 76
    .line 77
    invoke-direct {v4, v5, v8, v7}, Lxh/d1$a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 78
    .line 79
    new-instance v5, Lxh/d1$a$a;

    .line 80
    .line 81
    sget v8, Lcom/kubi/kumex/R$string;->kc_advanced_limit_order:I

    .line 82
    .line 83
    new-array v9, v7, [Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v6, v8, v9}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 87
    move-result-object v8

    .line 88
    .line 89
    const-string v9, "advanced_limit"

    .line 90
    .line 91
    .line 92
    invoke-direct {v5, v8, v9, v7}, Lxh/d1$a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 93
    .line 94
    .line 95
    filled-new-array/range {v0 .. v5}, [Lxh/d1$a$a;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    .line 99
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    .line 100
    move-result-object v0

    .line 101
    .line 102
    sget-object v1, Lm30/c;->a:Lm30/c;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Lm30/c;->c()Z

    .line 106
    move-result v1

    .line 107
    .line 108
    if-eqz v1, :cond_0

    .line 109
    .line 110
    new-instance v1, Lxh/d1$a$a;

    .line 111
    .line 112
    sget v2, Lcom/kubi/kumex/R$string;->hide_order:I

    .line 113
    .line 114
    new-array v3, v7, [Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6, v2, v3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 118
    move-result-object v2

    .line 119
    .line 120
    const-string v3, "hidden"

    .line 121
    .line 122
    .line 123
    invoke-direct {v1, v2, v3, v7}, Lxh/d1$a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 124
    .line 125
    .line 126
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    :cond_0
    iget-object v1, p0, Ldi/t;->e:Ldi/a;

    .line 129
    .line 130
    if-eqz v1, :cond_1

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1}, Ldi/a;->r()Lcom/kubi/broker/f;

    .line 134
    move-result-object v1

    .line 135
    .line 136
    if-nez v1, :cond_2

    .line 137
    .line 138
    :cond_1
    sget-object v1, Lcom/kubi/broker/BrokerConfig;->a:Lcom/kubi/broker/BrokerConfig;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1}, Lcom/kubi/broker/BrokerConfig;->d()Lcom/kubi/broker/f;

    .line 142
    move-result-object v1

    .line 143
    .line 144
    .line 145
    :cond_2
    invoke-interface {v1}, Lcom/kubi/broker/f;->X0()Ljava/util/List;

    .line 146
    move-result-object v1

    .line 147
    .line 148
    sget-object v2, Lcom/kubi/kumex/logic/constant/OrderTradeType;->Tso:Lcom/kubi/kumex/logic/constant/OrderTradeType;

    .line 149
    .line 150
    .line 151
    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 152
    move-result v1

    .line 153
    .line 154
    if-eqz v1, :cond_3

    .line 155
    .line 156
    new-instance v1, Lxh/d1$a$a;

    .line 157
    .line 158
    sget v2, Lcom/kubi/kumex/R$string;->kumex_tso_order:I

    .line 159
    .line 160
    new-array v3, v7, [Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v6, v2, v3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 164
    move-result-object v2

    .line 165
    .line 166
    const-string v3, "trailing_stop"

    .line 167
    .line 168
    .line 169
    invoke-direct {v1, v2, v3, v7}, Lxh/d1$a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 170
    .line 171
    .line 172
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 173
    :cond_3
    return-object v0
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
