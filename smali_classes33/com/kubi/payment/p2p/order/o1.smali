.class public final Lcom/kubi/payment/p2p/order/o1;
.super Ljava/lang/Object;
.source "OrderStatus.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u00052\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0012\u0010\u0017\u001a\u00020\u00052\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010$\u001a\u00020\u00052\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"
    }
    d2 = {
        "Lcom/kubi/payment/p2p/order/P2POrderUIStatus;",
        "",
        "<init>",
        "()V",
        "BUY_STATUS_ORDER_CREATED",
        "",
        "BUY_STATUS_ORDER_WAIT_COIN",
        "BUY_STATUS_ORDER_APPEALING_OWN",
        "BUY_STATUS_ORDER_APPEALING_OTHER",
        "BUY_STATUS_ORDER_APPEALING_OWN_CONSULT",
        "BUY_STATUS_ORDER_APPEALING_OTHER_CONSULT",
        "BUY_STATUS_ORDER_APPEALING_OWN_SERVICE",
        "BUY_STATUS_ORDER_APPEALING_OTHER_SERVICE",
        "BUY_STATUS_ORDER_CHARGED",
        "BUY_STATUS_ORDER_CANCELED",
        "BUY_STATUS_EXPRESS_ORDER_UNCONFIRMED",
        "BUY_STATUS_EXPRESS_ORDER_PROCESSING",
        "BUY_STATUS_EXPRESS_ORDER_SUCCEEDED",
        "BUY_STATUS_EXPRESS_ORDER_FAILED",
        "BUY_STATUS_EXPRESS_ORDER_CANCELED",
        "buyerUIStatus",
        "info",
        "Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;",
        "expressUIStatus",
        "expressInfo",
        "Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;",
        "SELL_STATUS_ORDER_CREATED",
        "SELL_STATUS_ORDER_PAY_COIN",
        "SELL_STATUS_ORDER_APPEALING_OWN",
        "SELL_STATUS_ORDER_APPEALING_OTHER",
        "SELL_STATUS_ORDER_APPEALING_OWN_CONSULT",
        "SELL_STATUS_ORDER_APPEALING_OTHER_CONSULT",
        "SELL_STATUS_ORDER_APPEALING_OWN_SERVICE",
        "SELL_STATUS_ORDER_APPEALING_OTHER_SERVICE",
        "SELL_STATUS_ORDER_CHARGED",
        "SELL_STATUS_ORDER_CANCELED",
        "sellerUIStatus",
        "PaymentLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcom/kubi/payment/p2p/order/o1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/p2p/order/o1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/payment/p2p/order/o1;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/payment/p2p/order/o1;->a:Lcom/kubi/payment/p2p/order/o1;

    .line 8
    return-void
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
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method


# virtual methods
.method public final a(Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;)Ljava/lang/String;
    .locals 4
    .param p1    # Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getAppealStatus()Ljava/lang/String;

    .line 7
    move-result-object v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v1, v0

    .line 10
    .line 11
    :goto_0
    if-eqz v1, :cond_7

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 15
    move-result v2

    .line 16
    .line 17
    const-string v3, "BUYER"

    .line 18
    .line 19
    .line 20
    sparse-switch v2, :sswitch_data_0

    .line 21
    goto :goto_1

    .line 22
    .line 23
    :sswitch_0
    const-string v2, "APPEALING_CS_PENDING"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    move-result v1

    .line 28
    .line 29
    if-nez v1, :cond_5

    .line 30
    goto :goto_1

    .line 31
    .line 32
    :sswitch_1
    const-string v2, "APPEALING"

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    move-result v1

    .line 37
    .line 38
    if-nez v1, :cond_1

    .line 39
    goto :goto_1

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getAppealBy()Ljava/lang/String;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    .line 46
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    move-result v1

    .line 48
    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    const-string v1, "BUY_STATUS_ORDER_APPEALING_OWN"

    .line 52
    .line 53
    goto/16 :goto_4

    .line 54
    .line 55
    :cond_2
    const-string v1, "BUY_STATUS_ORDER_APPEALING_OTHER"

    .line 56
    .line 57
    goto/16 :goto_4

    .line 58
    .line 59
    :sswitch_2
    const-string v2, "APPEALING_CONSENT"

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    move-result v1

    .line 64
    .line 65
    if-nez v1, :cond_3

    .line 66
    goto :goto_1

    .line 67
    .line 68
    .line 69
    :cond_3
    invoke-virtual {p1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getAppealBy()Ljava/lang/String;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    .line 73
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    move-result v1

    .line 75
    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    const-string v1, "BUY_STATUS_ORDER_APPEALING_OWN_CONSULT"

    .line 79
    .line 80
    goto/16 :goto_4

    .line 81
    .line 82
    :cond_4
    const-string v1, "BUY_STATUS_ORDER_APPEALING_OTHER_CONSULT"

    .line 83
    .line 84
    goto/16 :goto_4

    .line 85
    .line 86
    :sswitch_3
    const-string v2, "APPEALING_CS_PROCESSING"

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    move-result v1

    .line 91
    .line 92
    if-nez v1, :cond_5

    .line 93
    goto :goto_1

    .line 94
    .line 95
    .line 96
    :cond_5
    invoke-virtual {p1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getAppealBy()Ljava/lang/String;

    .line 97
    move-result-object v1

    .line 98
    .line 99
    .line 100
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    move-result v1

    .line 102
    .line 103
    if-eqz v1, :cond_6

    .line 104
    .line 105
    const-string v1, "BUY_STATUS_ORDER_APPEALING_OWN_SERVICE"

    .line 106
    goto :goto_4

    .line 107
    .line 108
    :cond_6
    const-string v1, "BUY_STATUS_ORDER_APPEALING_OTHER_SERVICE"

    .line 109
    goto :goto_4

    .line 110
    .line 111
    :cond_7
    :goto_1
    if-eqz p1, :cond_8

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getStatus()Ljava/lang/String;

    .line 115
    move-result-object v1

    .line 116
    goto :goto_2

    .line 117
    :cond_8
    move-object v1, v0

    .line 118
    .line 119
    :goto_2
    if-eqz v1, :cond_d

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 123
    move-result v2

    .line 124
    .line 125
    .line 126
    sparse-switch v2, :sswitch_data_1

    .line 127
    goto :goto_3

    .line 128
    .line 129
    :sswitch_4
    const-string v2, "CREATED"

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    move-result v1

    .line 134
    .line 135
    if-nez v1, :cond_9

    .line 136
    goto :goto_3

    .line 137
    .line 138
    :cond_9
    const-string v1, "BUY_STATUS_ORDER_CREATED"

    .line 139
    goto :goto_4

    .line 140
    .line 141
    :sswitch_5
    const-string v2, "CHARGED"

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    move-result v1

    .line 146
    .line 147
    if-nez v1, :cond_b

    .line 148
    goto :goto_3

    .line 149
    .line 150
    :sswitch_6
    const-string v2, "CANCELED"

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    move-result v1

    .line 155
    .line 156
    if-nez v1, :cond_a

    .line 157
    goto :goto_3

    .line 158
    .line 159
    :cond_a
    const-string v1, "BUY_STATUS_ORDER_CANCELED"

    .line 160
    goto :goto_4

    .line 161
    .line 162
    :sswitch_7
    const-string v2, "PAYED_COIN"

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    move-result v1

    .line 167
    .line 168
    if-nez v1, :cond_b

    .line 169
    goto :goto_3

    .line 170
    .line 171
    :cond_b
    const-string v1, "BUY_STATUS_ORDER_CHARGED"

    .line 172
    goto :goto_4

    .line 173
    .line 174
    :sswitch_8
    const-string v2, "PAYED_MONEY"

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    move-result v1

    .line 179
    .line 180
    if-nez v1, :cond_c

    .line 181
    goto :goto_3

    .line 182
    .line 183
    :cond_c
    const-string v1, "BUY_STATUS_ORDER_WAIT_COIN"

    .line 184
    goto :goto_4

    .line 185
    .line 186
    :cond_d
    :goto_3
    const-string v1, ""

    .line 187
    .line 188
    :goto_4
    if-eqz p1, :cond_e

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getExpressInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;

    .line 192
    move-result-object v0

    .line 193
    .line 194
    .line 195
    :cond_e
    invoke-virtual {p0, v0}, Lcom/kubi/payment/p2p/order/o1;->b(Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;)Ljava/lang/String;

    .line 196
    move-result-object p1

    .line 197
    .line 198
    .line 199
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 200
    move-result v0

    .line 201
    .line 202
    if-lez v0, :cond_f

    .line 203
    return-object p1

    .line 204
    :cond_f
    return-object v1

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
    :sswitch_data_0
    .sparse-switch
        -0x53c05d2a -> :sswitch_3
        -0x474ad472 -> :sswitch_2
        0x1d26bbd3 -> :sswitch_1
        0x3b445c94 -> :sswitch_0
    .end sparse-switch

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
    :sswitch_data_1
    .sparse-switch
        -0x32c07278 -> :sswitch_8
        -0x2af1fb57 -> :sswitch_7
        0x274e7499 -> :sswitch_6
        0x56d8c010 -> :sswitch_5
        0x681a0ac8 -> :sswitch_4
    .end sparse-switch
    .line 245
    .line 246
.end method

.method public final b(Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;->getStatus()Ljava/lang/String;

    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    .line 10
    :goto_0
    if-eqz p1, :cond_5

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 14
    move-result v0

    .line 15
    .line 16
    .line 17
    sparse-switch v0, :sswitch_data_0

    .line 18
    goto :goto_1

    .line 19
    .line 20
    :sswitch_0
    const-string v0, "FAILED"

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    move-result p1

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    goto :goto_1

    .line 28
    .line 29
    :cond_1
    const-string p1, "BUY_STATUS_EXPRESS_ORDER_FAILED"

    .line 30
    return-object p1

    .line 31
    .line 32
    :sswitch_1
    const-string v0, "UNCONFIRMED"

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    move-result p1

    .line 37
    .line 38
    if-eqz p1, :cond_5

    .line 39
    .line 40
    const-string p1, "BUY_STATUS_EXPRESS_ORDER_UNCONFIRMED"

    .line 41
    return-object p1

    .line 42
    .line 43
    :sswitch_2
    const-string v0, "PROCESSING"

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    move-result p1

    .line 48
    .line 49
    if-nez p1, :cond_2

    .line 50
    goto :goto_1

    .line 51
    .line 52
    :cond_2
    const-string p1, "BUY_STATUS_EXPRESS_ORDER_PROCESSING"

    .line 53
    return-object p1

    .line 54
    .line 55
    :sswitch_3
    const-string v0, "CANCELED"

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    move-result p1

    .line 60
    .line 61
    if-nez p1, :cond_3

    .line 62
    goto :goto_1

    .line 63
    .line 64
    :cond_3
    const-string p1, "BUY_STATUS_EXPRESS_ORDER_CANCELED"

    .line 65
    return-object p1

    .line 66
    .line 67
    :sswitch_4
    const-string v0, "SUCCEEDED"

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    move-result p1

    .line 72
    .line 73
    if-nez p1, :cond_4

    .line 74
    goto :goto_1

    .line 75
    .line 76
    :cond_4
    const-string p1, "BUY_STATUS_EXPRESS_ORDER_SUCCEEDED"

    .line 77
    return-object p1

    .line 78
    .line 79
    :cond_5
    :goto_1
    const-string p1, ""

    .line 80
    return-object p1

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
    :sswitch_data_0
    .sparse-switch
        -0x21892dbf -> :sswitch_4
        0x274e7499 -> :sswitch_3
        0x36141b13 -> :sswitch_2
        0x547a24c6 -> :sswitch_1
        0x7b29883d -> :sswitch_0
    .end sparse-switch
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
.end method

.method public final c(Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;)Ljava/lang/String;
    .locals 4
    .param p1    # Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getAppealStatus()Ljava/lang/String;

    .line 7
    move-result-object v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v1, v0

    .line 10
    .line 11
    :goto_0
    if-eqz v1, :cond_7

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 15
    move-result v2

    .line 16
    .line 17
    const-string v3, "SELLER"

    .line 18
    .line 19
    .line 20
    sparse-switch v2, :sswitch_data_0

    .line 21
    goto :goto_1

    .line 22
    .line 23
    :sswitch_0
    const-string v2, "APPEALING_CS_PENDING"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    move-result v1

    .line 28
    .line 29
    if-nez v1, :cond_5

    .line 30
    goto :goto_1

    .line 31
    .line 32
    :sswitch_1
    const-string v2, "APPEALING"

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    move-result v1

    .line 37
    .line 38
    if-nez v1, :cond_1

    .line 39
    goto :goto_1

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getAppealBy()Ljava/lang/String;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    .line 46
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    move-result p1

    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    const-string p1, "SELL_STATUS_ORDER_APPEALING_OWN"

    .line 52
    return-object p1

    .line 53
    .line 54
    :cond_2
    const-string p1, "SELL_STATUS_ORDER_APPEALING_OTHER"

    .line 55
    return-object p1

    .line 56
    .line 57
    :sswitch_2
    const-string v2, "APPEALING_CONSENT"

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    move-result v1

    .line 62
    .line 63
    if-nez v1, :cond_3

    .line 64
    goto :goto_1

    .line 65
    .line 66
    .line 67
    :cond_3
    invoke-virtual {p1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getAppealBy()Ljava/lang/String;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    .line 71
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    move-result p1

    .line 73
    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    const-string p1, "SELL_STATUS_ORDER_APPEALING_OWN_CONSULT"

    .line 77
    return-object p1

    .line 78
    .line 79
    :cond_4
    const-string p1, "SELL_STATUS_ORDER_APPEALING_OTHER_CONSULT"

    .line 80
    return-object p1

    .line 81
    .line 82
    :sswitch_3
    const-string v2, "APPEALING_CS_PROCESSING"

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    move-result v1

    .line 87
    .line 88
    if-nez v1, :cond_5

    .line 89
    goto :goto_1

    .line 90
    .line 91
    .line 92
    :cond_5
    invoke-virtual {p1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getAppealBy()Ljava/lang/String;

    .line 93
    move-result-object p1

    .line 94
    .line 95
    .line 96
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    move-result p1

    .line 98
    .line 99
    if-eqz p1, :cond_6

    .line 100
    .line 101
    const-string p1, "SELL_STATUS_ORDER_APPEALING_OWN_SERVICE"

    .line 102
    return-object p1

    .line 103
    .line 104
    :cond_6
    const-string p1, "SELL_STATUS_ORDER_APPEALING_OTHER_SERVICE"

    .line 105
    return-object p1

    .line 106
    .line 107
    :cond_7
    :goto_1
    if-eqz p1, :cond_8

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getStatus()Ljava/lang/String;

    .line 111
    move-result-object v0

    .line 112
    .line 113
    :cond_8
    if-eqz v0, :cond_d

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 117
    move-result p1

    .line 118
    .line 119
    .line 120
    sparse-switch p1, :sswitch_data_1

    .line 121
    goto :goto_2

    .line 122
    .line 123
    :sswitch_4
    const-string p1, "CREATED"

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    move-result p1

    .line 128
    .line 129
    if-nez p1, :cond_9

    .line 130
    goto :goto_2

    .line 131
    .line 132
    :cond_9
    const-string p1, "SELL_STATUS_ORDER_CREATED"

    .line 133
    return-object p1

    .line 134
    .line 135
    :sswitch_5
    const-string p1, "CHARGED"

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    move-result p1

    .line 140
    .line 141
    if-nez p1, :cond_b

    .line 142
    goto :goto_2

    .line 143
    .line 144
    :sswitch_6
    const-string p1, "CANCELED"

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    move-result p1

    .line 149
    .line 150
    if-nez p1, :cond_a

    .line 151
    goto :goto_2

    .line 152
    .line 153
    :cond_a
    const-string p1, "SELL_STATUS_ORDER_CANCELED"

    .line 154
    return-object p1

    .line 155
    .line 156
    :sswitch_7
    const-string p1, "PAYED_COIN"

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    move-result p1

    .line 161
    .line 162
    if-nez p1, :cond_b

    .line 163
    goto :goto_2

    .line 164
    .line 165
    :cond_b
    const-string p1, "SELL_STATUS_ORDER_CHARGED"

    .line 166
    return-object p1

    .line 167
    .line 168
    :sswitch_8
    const-string p1, "PAYED_MONEY"

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 172
    move-result p1

    .line 173
    .line 174
    if-nez p1, :cond_c

    .line 175
    goto :goto_2

    .line 176
    .line 177
    :cond_c
    const-string p1, "SELL_STATUS_ORDER_PAY_COIN"

    .line 178
    return-object p1

    .line 179
    .line 180
    :cond_d
    :goto_2
    const-string p1, ""

    .line 181
    return-object p1

    .line 182
    nop

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
    :sswitch_data_0
    .sparse-switch
        -0x53c05d2a -> :sswitch_3
        -0x474ad472 -> :sswitch_2
        0x1d26bbd3 -> :sswitch_1
        0x3b445c94 -> :sswitch_0
    .end sparse-switch

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
    :sswitch_data_1
    .sparse-switch
        -0x32c07278 -> :sswitch_8
        -0x2af1fb57 -> :sswitch_7
        0x274e7499 -> :sswitch_6
        0x56d8c010 -> :sswitch_5
        0x681a0ac8 -> :sswitch_4
    .end sparse-switch
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
.end method
