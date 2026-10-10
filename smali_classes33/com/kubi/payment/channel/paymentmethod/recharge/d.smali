.class public final Lcom/kubi/payment/channel/paymentmethod/recharge/d;
.super Ljava/lang/Object;
.source "RechargeHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ\"\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\"\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001a\u0010\u000e\u001a\u00020\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\"\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\t2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/kubi/payment/channel/paymentmethod/recharge/RechargeHelper;",
        "",
        "<init>",
        "()V",
        "recharge",
        "",
        "context",
        "Landroid/content/Context;",
        "fiatCurrency",
        "",
        "paymentMethod",
        "Lcom/kubi/payment/channel/data/entities/PaymentMethod;",
        "launchAdvcashRecharge",
        "launchCapitualRecharge",
        "launchRechargeFlow",
        "launchFlutterRecharge",
        "route",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRechargeHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RechargeHelper.kt\ncom/kubi/payment/channel/paymentmethod/recharge/RechargeHelper\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,151:1\n44#2,2:152\n*S KotlinDebug\n*F\n+ 1 RechargeHelper.kt\ncom/kubi/payment/channel/paymentmethod/recharge/RechargeHelper\n*L\n88#1:152,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/payment/channel/paymentmethod/recharge/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/channel/paymentmethod/recharge/d;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/payment/channel/paymentmethod/recharge/d;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/payment/channel/paymentmethod/recharge/d;->a:Lcom/kubi/payment/channel/paymentmethod/recharge/d;

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
.method public final a(Landroid/content/Context;Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/PaymentMethod;)V
    .locals 13

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->Z:Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment$Companion;

    .line 3
    .line 4
    new-instance v1, Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p3 .. p3}, Lcom/kubi/payment/channel/data/entities/PaymentMethod;->getChannelId()Ljava/lang/String;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    .line 11
    invoke-virtual/range {p3 .. p3}, Lcom/kubi/payment/channel/data/entities/PaymentMethod;->getTitle()Ljava/lang/String;

    .line 12
    move-result-object v4

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {p3 .. p3}, Lcom/kubi/payment/channel/data/entities/PaymentMethod;->getIconUrl()Ljava/lang/String;

    .line 16
    move-result-object v5

    .line 17
    .line 18
    .line 19
    invoke-virtual/range {p3 .. p3}, Lcom/kubi/payment/channel/data/entities/PaymentMethod;->getMinAmount()Ljava/lang/String;

    .line 20
    move-result-object v6

    .line 21
    .line 22
    .line 23
    invoke-virtual/range {p3 .. p3}, Lcom/kubi/payment/channel/data/entities/PaymentMethod;->getMaxAmount()Ljava/lang/String;

    .line 24
    move-result-object v7

    .line 25
    .line 26
    .line 27
    invoke-virtual/range {p3 .. p3}, Lcom/kubi/payment/channel/data/entities/PaymentMethod;->getFeeMessage()Ljava/lang/String;

    .line 28
    move-result-object v8

    .line 29
    .line 30
    const/16 v11, 0x180

    .line 31
    const/4 v12, 0x0

    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

    .line 34
    move-object v3, p2

    .line 35
    .line 36
    .line 37
    invoke-direct/range {v1 .. v12}, Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/otc/entity/FiatFee;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1, v1}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment$Companion;->launch(Landroid/content/Context;Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;)V

    .line 41
    return-void
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
.end method

.method public final b(Landroid/content/Context;Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/PaymentMethod;)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/payment/util/i;->a:Lcom/kubi/payment/util/i;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/payment/util/i;->b()Ly70/g;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Ly70/a;->d(Ly70/g;Z)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lcom/kubi/otc/fiat/recharge/capitual/FiatRechargeCapitualRemindFragment;->Y:Lcom/kubi/otc/fiat/recharge/capitual/FiatRechargeCapitualRemindFragment$Companion;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, p2, p3}, Lcom/kubi/otc/fiat/recharge/capitual/FiatRechargeCapitualRemindFragment$Companion;->launch(Landroid/content/Context;Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/PaymentMethod;)V

    .line 19
    return-void

    .line 20
    .line 21
    :cond_0
    sget-object v0, Lcom/kubi/otc/fiat/recharge/capitual/FiatRechargeCapitualDetailFragment;->c0:Lcom/kubi/otc/fiat/recharge/capitual/FiatRechargeCapitualDetailFragment$Companion;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1, p2, p3}, Lcom/kubi/otc/fiat/recharge/capitual/FiatRechargeCapitualDetailFragment$Companion;->launch(Landroid/content/Context;Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/PaymentMethod;)V

    .line 25
    return-void
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
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/PaymentMethod;)V
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/payment/flutter/e;->a:Lcom/kubi/payment/flutter/e;

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v1, p1, v2, v3, v4}, Lcom/kubi/payment/flutter/e;->b(Lcom/kubi/payment/flutter/e;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p3}, Lcom/kubi/payment/channel/data/entities/PaymentMethod;->getPaymentMethodCode()Ljava/lang/String;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    const-string v1, "paymentMethodCode"

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v1, v0}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p3}, Lcom/kubi/payment/channel/data/entities/PaymentMethod;->getChannelId()Ljava/lang/String;

    .line 33
    move-result-object p3

    .line 34
    .line 35
    .line 36
    invoke-static {p3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    move-result-object p3

    .line 38
    .line 39
    const-string v0, "channelId"

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0, p3}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    const-string p3, "fiatCurrency"

    .line 46
    .line 47
    .line 48
    invoke-static {p2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    move-result-object p2

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, p3, p2}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    const-string p2, "PaymentMethod"

    .line 56
    const/4 p3, 0x4

    .line 57
    .line 58
    const-string v0, "B7FiatDepositMethod"

    .line 59
    .line 60
    .line 61
    invoke-static {v0, p2, v4, p3, v4}, Lqq/m;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 62
    move-result-object p2

    .line 63
    .line 64
    const-string p3, "spm"

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, p3, p2}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Lay/a;->k()Z

    .line 72
    return-void
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
.end method

.method public final d(Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/PaymentMethod;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "payment/recharge/init"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0, p1, p2}, Lcom/kubi/payment/channel/paymentmethod/recharge/d;->c(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/PaymentMethod;)V

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
.end method

.method public final e(Landroid/content/Context;Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/PaymentMethod;)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/kubi/payment/channel/data/entities/PaymentMethod;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "paymentMethod"

    .line 8
    .line 9
    .line 10
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget-object v0, Lcom/kubi/payment/channel/a;->a:Lcom/kubi/payment/channel/a;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p3}, Lcom/kubi/payment/channel/data/entities/PaymentMethod;->getPaymentMethodCode()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p3}, Lcom/kubi/payment/channel/data/entities/PaymentMethod;->getChannelId()Ljava/lang/String;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Lcom/kubi/payment/channel/a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/payment/channel/Channel;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    instance-of v1, v0, Lcom/kubi/payment/channel/Channel$Advcash;

    .line 35
    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/payment/channel/paymentmethod/recharge/d;->a(Landroid/content/Context;Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/PaymentMethod;)V

    .line 40
    return-void

    .line 41
    .line 42
    :cond_0
    instance-of v1, v0, Lcom/kubi/payment/channel/Channel$Capitual;

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/payment/channel/paymentmethod/recharge/d;->b(Landroid/content/Context;Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/PaymentMethod;)V

    .line 48
    return-void

    .line 49
    .line 50
    :cond_1
    instance-of p1, v0, Lcom/kubi/payment/channel/Channel$EasyEuro;

    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p2, p3}, Lcom/kubi/payment/channel/paymentmethod/recharge/d;->d(Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/PaymentMethod;)V

    .line 56
    return-void

    .line 57
    .line 58
    :cond_2
    instance-of p1, v0, Lcom/kubi/payment/channel/Channel$Nuvei;

    .line 59
    .line 60
    if-eqz p1, :cond_3

    .line 61
    .line 62
    const-string p1, "payment/channel/recharge/nuvei/input"

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/payment/channel/paymentmethod/recharge/d;->c(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/PaymentMethod;)V

    .line 66
    return-void

    .line 67
    .line 68
    :cond_3
    instance-of p1, v0, Lcom/kubi/payment/channel/Channel$Bcb;

    .line 69
    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p2, p3}, Lcom/kubi/payment/channel/paymentmethod/recharge/d;->d(Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/PaymentMethod;)V

    .line 74
    return-void

    .line 75
    .line 76
    :cond_4
    instance-of p1, v0, Lcom/kubi/payment/channel/Channel$Transfero;

    .line 77
    .line 78
    if-eqz p1, :cond_5

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, p2, p3}, Lcom/kubi/payment/channel/paymentmethod/recharge/d;->d(Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/PaymentMethod;)V

    .line 82
    return-void

    .line 83
    .line 84
    :cond_5
    instance-of p1, v0, Lcom/kubi/payment/channel/Channel$BirApi;

    .line 85
    .line 86
    if-eqz p1, :cond_6

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, p2, p3}, Lcom/kubi/payment/channel/paymentmethod/recharge/d;->d(Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/PaymentMethod;)V

    .line 90
    return-void

    .line 91
    .line 92
    :cond_6
    instance-of p1, v0, Lcom/kubi/payment/channel/Channel$Scb;

    .line 93
    .line 94
    if-eqz p1, :cond_7

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, p2, p3}, Lcom/kubi/payment/channel/paymentmethod/recharge/d;->d(Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/PaymentMethod;)V

    .line 98
    return-void

    .line 99
    .line 100
    :cond_7
    instance-of p1, v0, Lcom/kubi/payment/channel/Channel$Build;

    .line 101
    .line 102
    if-eqz p1, :cond_8

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, p2, p3}, Lcom/kubi/payment/channel/paymentmethod/recharge/d;->d(Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/PaymentMethod;)V

    .line 106
    return-void

    .line 107
    .line 108
    :cond_8
    instance-of p1, v0, Lcom/kubi/payment/channel/Channel$Ivy;

    .line 109
    .line 110
    if-eqz p1, :cond_9

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, p2, p3}, Lcom/kubi/payment/channel/paymentmethod/recharge/d;->d(Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/PaymentMethod;)V

    .line 114
    return-void

    .line 115
    .line 116
    :cond_9
    instance-of p1, v0, Lcom/kubi/payment/channel/Channel$UnSupportedChannel;

    .line 117
    .line 118
    if-eqz p1, :cond_a

    .line 119
    .line 120
    new-instance v2, Ljava/lang/Exception;

    .line 121
    .line 122
    new-instance p1, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    const-string p2, "payment recharge unsupported channel:"

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    move-result-object p1

    .line 138
    .line 139
    .line 140
    invoke-direct {v2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    new-instance v1, Lcom/kubi/otc/exception/OtcException;

    .line 143
    .line 144
    const/16 v6, 0x8

    .line 145
    const/4 v7, 0x0

    .line 146
    .line 147
    const-string v3, "RechargeHelper"

    .line 148
    const/4 v4, 0x0

    .line 149
    const/4 v5, 0x0

    .line 150
    .line 151
    .line 152
    invoke-direct/range {v1 .. v7}, Lcom/kubi/otc/exception/OtcException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 153
    const/4 p1, 0x2

    .line 154
    const/4 p2, 0x0

    .line 155
    .line 156
    .line 157
    invoke-static {v1, p2, p1, p2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 158
    return-void

    .line 159
    .line 160
    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 161
    .line 162
    .line 163
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 164
    throw p1
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
.end method
