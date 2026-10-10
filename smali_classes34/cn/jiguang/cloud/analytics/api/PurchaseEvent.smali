.class public Lcn/jiguang/cloud/analytics/api/PurchaseEvent;
.super Lcn/jiguang/privates/analysis/api/Event;
.source "PurchaseEvent.java"


# static fields
.field private static final CUSTOM_SIZE:I = 0x7

.field private static final TAG:Ljava/lang/String; = "PurchaseEvent"


# instance fields
.field private purchaseCurrency:Lcn/jiguang/cloud/analytics/api/Currency;

.field private purchaseGoodsId:Ljava/lang/String;

.field private purchaseGoodsName:Ljava/lang/String;

.field private purchaseGoodsQuantity:I

.field private purchaseGoodsType:Ljava/lang/String;

.field private purchasePrice:D

.field private purchaseSuccess:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    const-string v0, "custom_purchase"

    invoke-direct {p0, v0}, Lcn/jiguang/privates/analysis/api/Event;-><init>(Ljava/lang/String;)V

    .line 2
    const-string v0, ""

    iput-object v0, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseGoodsId:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseGoodsName:Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseGoodsType:Ljava/lang/String;

    const/4 v1, 0x0

    .line 5
    iput v1, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseGoodsQuantity:I

    const-wide/16 v2, 0x0

    .line 6
    iput-wide v2, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchasePrice:D

    .line 7
    iput-boolean v1, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseSuccess:Z

    .line 8
    const-string/jumbo v1, "purchase_goods_id"

    invoke-super {p0, v1, v0}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 9
    const-string/jumbo v1, "purchase_goods_name"

    iget-object v2, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseGoodsName:Ljava/lang/String;

    invoke-super {p0, v1, v2}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 10
    const-string/jumbo v1, "purchase_goods_type"

    iget-object v2, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseGoodsType:Ljava/lang/String;

    invoke-super {p0, v1, v2}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 11
    iget-wide v1, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchasePrice:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string/jumbo v2, "purchase_price"

    invoke-super {p0, v2, v1}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 12
    iget v1, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseGoodsQuantity:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string/jumbo v2, "purchase_quantity"

    invoke-super {p0, v2, v1}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 13
    iget-boolean v1, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseSuccess:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string/jumbo v2, "purchase_success"

    invoke-super {p0, v2, v1}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 14
    const-string/jumbo v1, "purchase_currency"

    invoke-super {p0, v1, v0}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;DZLcn/jiguang/cloud/analytics/api/Currency;Ljava/lang/String;I)V
    .locals 1

    .line 15
    const-string v0, "custom_purchase"

    invoke-direct {p0, v0}, Lcn/jiguang/privates/analysis/api/Event;-><init>(Ljava/lang/String;)V

    .line 16
    iput-object p1, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseGoodsId:Ljava/lang/String;

    .line 17
    iput-object p2, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseGoodsName:Ljava/lang/String;

    .line 18
    iput-object p7, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseGoodsType:Ljava/lang/String;

    .line 19
    iput-wide p3, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchasePrice:D

    .line 20
    iput p8, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseGoodsQuantity:I

    .line 21
    iput-boolean p5, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseSuccess:Z

    .line 22
    iput-object p6, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseCurrency:Lcn/jiguang/cloud/analytics/api/Currency;

    .line 23
    const-string/jumbo p2, "purchase_goods_id"

    invoke-super {p0, p2, p1}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 24
    const-string/jumbo p1, "purchase_goods_name"

    iget-object p2, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseGoodsName:Ljava/lang/String;

    invoke-super {p0, p1, p2}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 25
    const-string/jumbo p1, "purchase_goods_type"

    iget-object p2, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseGoodsType:Ljava/lang/String;

    invoke-super {p0, p1, p2}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 26
    iget-wide p1, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchasePrice:D

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const-string/jumbo p2, "purchase_price"

    invoke-super {p0, p2, p1}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 27
    iget p1, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseGoodsQuantity:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string/jumbo p2, "purchase_quantity"

    invoke-super {p0, p2, p1}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 28
    iget-boolean p1, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseSuccess:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string/jumbo p2, "purchase_success"

    invoke-super {p0, p2, p1}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 29
    const-string/jumbo p1, "purchase_currency"

    if-eqz p6, :cond_0

    .line 30
    iget-object p2, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseCurrency:Lcn/jiguang/cloud/analytics/api/Currency;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-super {p0, p1, p2}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    return-void

    .line 31
    :cond_0
    const-string p2, ""

    invoke-super {p0, p1, p2}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    return-void
.end method


# virtual methods
.method public addExtMap(Ljava/util/Map;)Lcn/jiguang/privates/analysis/api/Event;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcn/jiguang/privates/analysis/api/Event;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_8

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Ljava/util/Map$Entry;

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    check-cast v1, Ljava/lang/CharSequence;

    .line 27
    .line 28
    .line 29
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 30
    move-result v1

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    goto :goto_0

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    check-cast v1, Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    const/4 v2, -0x1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 47
    move-result v3

    .line 48
    .line 49
    .line 50
    sparse-switch v3, :sswitch_data_0

    .line 51
    goto :goto_1

    .line 52
    .line 53
    .line 54
    :sswitch_0
    const-string/jumbo v3, "purchase_success"

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    move-result v1

    .line 59
    .line 60
    if-nez v1, :cond_1

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    const/4 v2, 0x6

    .line 63
    goto :goto_1

    .line 64
    .line 65
    .line 66
    :sswitch_1
    const-string/jumbo v3, "purchase_price"

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    move-result v1

    .line 71
    .line 72
    if-nez v1, :cond_2

    .line 73
    goto :goto_1

    .line 74
    :cond_2
    const/4 v2, 0x5

    .line 75
    goto :goto_1

    .line 76
    .line 77
    .line 78
    :sswitch_2
    const-string/jumbo v3, "purchase_goods_id"

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    move-result v1

    .line 83
    .line 84
    if-nez v1, :cond_3

    .line 85
    goto :goto_1

    .line 86
    :cond_3
    const/4 v2, 0x4

    .line 87
    goto :goto_1

    .line 88
    .line 89
    .line 90
    :sswitch_3
    const-string/jumbo v3, "purchase_currency"

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    move-result v1

    .line 95
    .line 96
    if-nez v1, :cond_4

    .line 97
    goto :goto_1

    .line 98
    :cond_4
    const/4 v2, 0x3

    .line 99
    goto :goto_1

    .line 100
    .line 101
    .line 102
    :sswitch_4
    const-string/jumbo v3, "purchase_goods_type"

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    move-result v1

    .line 107
    .line 108
    if-nez v1, :cond_5

    .line 109
    goto :goto_1

    .line 110
    :cond_5
    const/4 v2, 0x2

    .line 111
    goto :goto_1

    .line 112
    .line 113
    .line 114
    :sswitch_5
    const-string/jumbo v3, "purchase_goods_name"

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    move-result v1

    .line 119
    .line 120
    if-nez v1, :cond_6

    .line 121
    goto :goto_1

    .line 122
    :cond_6
    const/4 v2, 0x1

    .line 123
    goto :goto_1

    .line 124
    .line 125
    .line 126
    :sswitch_6
    const-string/jumbo v3, "purchase_quantity"

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    move-result v1

    .line 131
    .line 132
    if-nez v1, :cond_7

    .line 133
    goto :goto_1

    .line 134
    :cond_7
    const/4 v2, 0x0

    .line 135
    .line 136
    .line 137
    :goto_1
    packed-switch v2, :pswitch_data_0

    .line 138
    .line 139
    .line 140
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 141
    move-result-object v1

    .line 142
    .line 143
    check-cast v1, Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 147
    move-result-object v0

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, v1, v0}, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/cloud/analytics/api/PurchaseEvent;

    .line 151
    .line 152
    goto/16 :goto_0

    .line 153
    .line 154
    :pswitch_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 158
    .line 159
    const-string v2, "key ["

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 166
    move-result-object v0

    .line 167
    .line 168
    check-cast v0, Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    const-string v0, "] is invalid"

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    move-result-object v0

    .line 181
    .line 182
    const-string v1, "PurchaseEvent"

    .line 183
    .line 184
    .line 185
    invoke-static {v1, v0}, Lcn/jiguang/privates/common/log/JCommonLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    .line 187
    goto/16 :goto_0

    .line 188
    :cond_8
    return-object p0

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
    :sswitch_data_0
    .sparse-switch
        -0x757c5df7 -> :sswitch_6
        -0x7148682e -> :sswitch_5
        -0x7145537f -> :sswitch_4
        -0x698d271 -> :sswitch_3
        0x55a8d022 -> :sswitch_2
        0x71b3948b -> :sswitch_1
        0x769d5ac5 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public addKeyValue(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/cloud/analytics/api/PurchaseEvent;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/cloud/analytics/api/PurchaseEvent;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public getPurchaseCurrency()Lcn/jiguang/cloud/analytics/api/Currency;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseCurrency:Lcn/jiguang/cloud/analytics/api/Currency;

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
.end method

.method public getPurchaseGoodsCount()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseGoodsQuantity:I

    .line 3
    return v0
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
.end method

.method public getPurchaseGoodsid()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseGoodsId:Ljava/lang/String;

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
.end method

.method public getPurchaseGoodsname()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseGoodsName:Ljava/lang/String;

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
.end method

.method public getPurchaseGoodstype()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseGoodsType:Ljava/lang/String;

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
.end method

.method public getPurchasePrice()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchasePrice:D

    .line 3
    return-wide v0
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
.end method

.method public getPurchaseSuccess()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseSuccess:Z

    .line 3
    return v0
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
.end method

.method public putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/cloud/analytics/api/PurchaseEvent;
    .locals 3

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 3
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "PurchaseEvent"

    const/4 v1, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string/jumbo v2, "purchase_success"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x6

    goto :goto_0

    :sswitch_1
    const-string/jumbo v2, "purchase_price"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x5

    goto :goto_0

    :sswitch_2
    const-string/jumbo v2, "purchase_goods_id"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x4

    goto :goto_0

    :sswitch_3
    const-string/jumbo v2, "purchase_currency"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_4
    const-string/jumbo v2, "purchase_goods_type"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_0

    :cond_5
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_5
    const-string/jumbo v2, "purchase_goods_name"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_0

    :cond_6
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_6
    const-string/jumbo v2, "purchase_quantity"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_0

    :cond_7
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 4
    iget-object v1, p0, Lcn/jiguang/privates/analysis/api/Event;->extraAttrMap:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    const/16 v2, 0x32

    if-lt v1, v2, :cond_8

    .line 5
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "can\'t put ["

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "], purchase event extraAttrMap size can\'t be no more than "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2b

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcn/jiguang/privates/common/log/JCommonLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0

    .line 6
    :cond_8
    invoke-super {p0, p1, p2}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    move-result-object p1

    check-cast p1, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;

    return-object p1

    .line 7
    :pswitch_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "key ["

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "] is invalid"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcn/jiguang/privates/common/log/JCommonLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x757c5df7 -> :sswitch_6
        -0x7148682e -> :sswitch_5
        -0x7145537f -> :sswitch_4
        -0x698d271 -> :sswitch_3
        0x55a8d022 -> :sswitch_2
        0x71b3948b -> :sswitch_1
        0x769d5ac5 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/cloud/analytics/api/PurchaseEvent;

    move-result-object p1

    return-object p1
.end method

.method public setExtMap(Ljava/util/Map;)Lcn/jiguang/privates/analysis/api/Event;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcn/jiguang/privates/analysis/api/Event;"
        }
    .end annotation

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    goto :goto_0

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    :goto_0
    return-object p0

    .line 11
    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0}, Lcn/jiguang/privates/analysis/api/Event;->getExtraAttrMap()Ljava/util/Map;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-eqz v0, :cond_9

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-nez v1, :cond_9

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    move-result v1

    .line 35
    .line 36
    if-eqz v1, :cond_9

    .line 37
    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    check-cast v1, Ljava/util/Map$Entry;

    .line 43
    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    check-cast v2, Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    const/4 v3, -0x1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 56
    move-result v4

    .line 57
    .line 58
    .line 59
    sparse-switch v4, :sswitch_data_0

    .line 60
    goto :goto_2

    .line 61
    .line 62
    .line 63
    :sswitch_0
    const-string/jumbo v4, "purchase_success"

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    move-result v2

    .line 68
    .line 69
    if-nez v2, :cond_2

    .line 70
    goto :goto_2

    .line 71
    :cond_2
    const/4 v3, 0x6

    .line 72
    goto :goto_2

    .line 73
    .line 74
    .line 75
    :sswitch_1
    const-string/jumbo v4, "purchase_price"

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    move-result v2

    .line 80
    .line 81
    if-nez v2, :cond_3

    .line 82
    goto :goto_2

    .line 83
    :cond_3
    const/4 v3, 0x5

    .line 84
    goto :goto_2

    .line 85
    .line 86
    .line 87
    :sswitch_2
    const-string/jumbo v4, "purchase_goods_id"

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    move-result v2

    .line 92
    .line 93
    if-nez v2, :cond_4

    .line 94
    goto :goto_2

    .line 95
    :cond_4
    const/4 v3, 0x4

    .line 96
    goto :goto_2

    .line 97
    .line 98
    .line 99
    :sswitch_3
    const-string/jumbo v4, "purchase_currency"

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    move-result v2

    .line 104
    .line 105
    if-nez v2, :cond_5

    .line 106
    goto :goto_2

    .line 107
    :cond_5
    const/4 v3, 0x3

    .line 108
    goto :goto_2

    .line 109
    .line 110
    .line 111
    :sswitch_4
    const-string/jumbo v4, "purchase_goods_type"

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    move-result v2

    .line 116
    .line 117
    if-nez v2, :cond_6

    .line 118
    goto :goto_2

    .line 119
    :cond_6
    const/4 v3, 0x2

    .line 120
    goto :goto_2

    .line 121
    .line 122
    .line 123
    :sswitch_5
    const-string/jumbo v4, "purchase_goods_name"

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    move-result v2

    .line 128
    .line 129
    if-nez v2, :cond_7

    .line 130
    goto :goto_2

    .line 131
    :cond_7
    const/4 v3, 0x1

    .line 132
    goto :goto_2

    .line 133
    .line 134
    .line 135
    :sswitch_6
    const-string/jumbo v4, "purchase_quantity"

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    move-result v2

    .line 140
    .line 141
    if-nez v2, :cond_8

    .line 142
    goto :goto_2

    .line 143
    :cond_8
    const/4 v3, 0x0

    .line 144
    .line 145
    .line 146
    :goto_2
    packed-switch v3, :pswitch_data_0

    .line 147
    .line 148
    .line 149
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 150
    goto :goto_1

    .line 151
    .line 152
    :pswitch_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 156
    .line 157
    const-string v3, "key ["

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 164
    move-result-object v1

    .line 165
    .line 166
    check-cast v1, Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    const-string v1, "] is invalid"

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    move-result-object v1

    .line 179
    .line 180
    const-string v2, "PurchaseEvent"

    .line 181
    .line 182
    .line 183
    invoke-static {v2, v1}, Lcn/jiguang/privates/common/log/JCommonLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    .line 185
    goto/16 :goto_1

    .line 186
    .line 187
    .line 188
    :cond_9
    invoke-virtual {p0, p1}, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->addExtMap(Ljava/util/Map;)Lcn/jiguang/privates/analysis/api/Event;

    .line 189
    return-object p0

    .line 190
    nop

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
    :sswitch_data_0
    .sparse-switch
        -0x757c5df7 -> :sswitch_6
        -0x7148682e -> :sswitch_5
        -0x7145537f -> :sswitch_4
        -0x698d271 -> :sswitch_3
        0x55a8d022 -> :sswitch_2
        0x71b3948b -> :sswitch_1
        0x769d5ac5 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public setPurchaseCurrency(Lcn/jiguang/cloud/analytics/api/Currency;)Lcn/jiguang/cloud/analytics/api/PurchaseEvent;
    .locals 1

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    goto :goto_0

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lcn/jiguang/privates/analysis/utils/JAnalyticsHelper;->isValidValue(Ljava/lang/Object;)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iput-object p1, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseCurrency:Lcn/jiguang/cloud/analytics/api/Currency;

    .line 16
    .line 17
    .line 18
    const-string/jumbo v0, "purchase_currency"

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    invoke-super {p0, v0, p1}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 26
    :cond_1
    :goto_0
    return-object p0
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
.end method

.method public setPurchaseGoodsCount(I)Lcn/jiguang/cloud/analytics/api/PurchaseEvent;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcn/jiguang/privates/analysis/utils/JAnalyticsHelper;->isValidValue(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iput p1, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseGoodsQuantity:I

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    const-string/jumbo v0, "purchase_quantity"

    .line 20
    .line 21
    .line 22
    invoke-super {p0, v0, p1}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 23
    :cond_0
    return-object p0
.end method

.method public setPurchaseGoodsid(Ljava/lang/String;)Lcn/jiguang/cloud/analytics/api/PurchaseEvent;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcn/jiguang/privates/analysis/utils/JAnalyticsHelper;->isValidValue(Ljava/lang/Object;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseGoodsId:Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    const-string/jumbo v0, "purchase_goods_id"

    .line 12
    .line 13
    .line 14
    invoke-super {p0, v0, p1}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 15
    :cond_0
    return-object p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setPurchaseGoodsname(Ljava/lang/String;)Lcn/jiguang/cloud/analytics/api/PurchaseEvent;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcn/jiguang/privates/analysis/utils/JAnalyticsHelper;->isValidValue(Ljava/lang/Object;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseGoodsName:Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    const-string/jumbo v0, "purchase_goods_name"

    .line 12
    .line 13
    .line 14
    invoke-super {p0, v0, p1}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 15
    :cond_0
    return-object p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setPurchaseGoodstype(Ljava/lang/String;)Lcn/jiguang/cloud/analytics/api/PurchaseEvent;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcn/jiguang/privates/analysis/utils/JAnalyticsHelper;->isValidValue(Ljava/lang/Object;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseGoodsType:Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    const-string/jumbo v0, "purchase_goods_type"

    .line 12
    .line 13
    .line 14
    invoke-super {p0, v0, p1}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 15
    :cond_0
    return-object p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setPurchasePrice(D)Lcn/jiguang/cloud/analytics/api/PurchaseEvent;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcn/jiguang/privates/analysis/utils/JAnalyticsHelper;->isValidValue(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iput-wide p1, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchasePrice:D

    .line 13
    .line 14
    .line 15
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    const-string/jumbo p2, "purchase_price"

    .line 20
    .line 21
    .line 22
    invoke-super {p0, p2, p1}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 23
    :cond_0
    return-object p0
.end method

.method public setPurchaseSuccess(Z)Lcn/jiguang/cloud/analytics/api/PurchaseEvent;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcn/jiguang/privates/analysis/utils/JAnalyticsHelper;->isValidValue(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iput-boolean p1, p0, Lcn/jiguang/cloud/analytics/api/PurchaseEvent;->purchaseSuccess:Z

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    const-string/jumbo v0, "purchase_success"

    .line 20
    .line 21
    .line 22
    invoke-super {p0, v0, p1}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 23
    :cond_0
    return-object p0
.end method
