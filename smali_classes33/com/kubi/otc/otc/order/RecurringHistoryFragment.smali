.class public final Lcom/kubi/otc/otc/order/RecurringHistoryFragment;
.super Lcom/kubi/sdk/base/ui/BasePagingFragment;
.source "RecurringHistoryFragment.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/sdk/base/ui/BasePagingFragment<",
        "Lcom/kubi/payment/fast/data/entities/RecurringPlan;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J$\u0010\u000c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0014J\u001c\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0015J\u0008\u0010\u0017\u001a\u00020\u0013H\u0014J\u0008\u0010\u0018\u001a\u00020\u0010H\u0014R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/kubi/otc/otc/order/RecurringHistoryFragment;",
        "Lcom/kubi/sdk/base/ui/BasePagingFragment;",
        "Lcom/kubi/payment/fast/data/entities/RecurringPlan;",
        "<init>",
        "()V",
        "fastWebService",
        "Lcom/kubi/payment/fast/data/source/remote/FastWebService;",
        "kotlin.jvm.PlatformType",
        "getFastWebService",
        "()Lcom/kubi/payment/fast/data/source/remote/FastWebService;",
        "fastWebService$delegate",
        "Lkotlin/Lazy;",
        "getDataLoader",
        "Lio/reactivex/Observable;",
        "Lcom/kubi/sdk/base/entity/BasePageEntity;",
        "pageIndex",
        "",
        "pageSize",
        "bindDataToView",
        "",
        "helper",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "item",
        "onReBack",
        "getItemLayout",
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


# instance fields
.field public final Z:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/otc/otc/order/n;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/otc/otc/order/n;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/otc/otc/order/RecurringHistoryFragment;->Z:Lkotlin/Lazy;

    .line 15
    return-void
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

.method public static synthetic H3()Lcom/kubi/payment/fast/data/source/remote/a;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/otc/otc/order/RecurringHistoryFragment;->L3()Lcom/kubi/payment/fast/data/source/remote/a;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public static synthetic I3(Lcom/kubi/payment/fast/data/entities/RecurringPlan;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/otc/otc/order/RecurringHistoryFragment;->K3(Lcom/kubi/payment/fast/data/entities/RecurringPlan;)Lkotlin/Unit;

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
.end method

.method public static final K3(Lcom/kubi/payment/fast/data/entities/RecurringPlan;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/payment/fast/data/entities/RecurringPlan;->getRecurringId()Ljava/lang/String;

    .line 6
    move-result-object p0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    sget-object v0, Lcom/kubi/payment/flutter/a;->a:Lcom/kubi/payment/flutter/a;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/kubi/payment/flutter/a;->e(Ljava/lang/String;)V

    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 20
    return-object p0
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
.end method

.method public static final L3()Lcom/kubi/payment/fast/data/source/remote/a;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lmr/a;->b()Lretrofit2/Retrofit;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-class v1, Lcom/kubi/payment/fast/data/source/remote/a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lcom/kubi/payment/fast/data/source/remote/a;

    .line 13
    return-object v0
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
.method public J3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/payment/fast/data/entities/RecurringPlan;)V
    .locals 8
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/payment/fast/data/entities/RecurringPlan;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ResourceType"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_11

    .line 3
    .line 4
    sget v0, Lcom/kubi/otc/R$id;->tv_crypto_currency:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Landroid/widget/TextView;

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Lcom/kubi/payment/fast/data/entities/RecurringPlan;->getCryptoCurrency()Ljava/lang/String;

    .line 17
    move-result-object v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v2, v1

    .line 20
    .line 21
    :goto_0
    const-string v3, "--"

    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    sget v0, Lcom/kubi/otc/R$id;->tv_status:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    check-cast v0, Landroid/widget/TextView;

    .line 37
    .line 38
    if-eqz p2, :cond_1

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2}, Lcom/kubi/payment/fast/data/entities/RecurringPlan;->getStatus()Ljava/lang/String;

    .line 42
    move-result-object v2

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v2, v1

    .line 45
    .line 46
    :goto_1
    const-string v3, "AVAILABLE"

    .line 47
    .line 48
    .line 49
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    move-result v2

    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    sget v2, Lcom/kubi/otc/R$color;->brandGreen:I

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v2}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 58
    move-result v2

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 62
    goto :goto_2

    .line 63
    .line 64
    :cond_2
    sget v2, Lcom/kubi/otc/R$color;->c_text40:I

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v2}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 68
    move-result v2

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 72
    .line 73
    :goto_2
    if-eqz p2, :cond_3

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2}, Lcom/kubi/payment/fast/data/entities/RecurringPlan;->getStatus()Ljava/lang/String;

    .line 77
    move-result-object v2

    .line 78
    goto :goto_3

    .line 79
    :cond_3
    move-object v2, v1

    .line 80
    .line 81
    .line 82
    :goto_3
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    move-result-object v2

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 87
    move-result v4

    .line 88
    const/4 v5, 0x0

    .line 89
    .line 90
    .line 91
    sparse-switch v4, :sswitch_data_0

    .line 92
    .line 93
    goto/16 :goto_4

    .line 94
    .line 95
    :sswitch_0
    const-string v3, "FAILED"

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    move-result v2

    .line 100
    .line 101
    if-nez v2, :cond_4

    .line 102
    goto :goto_4

    .line 103
    .line 104
    :cond_4
    sget v2, Lcom/kubi/otc/R$string;->failed:I

    .line 105
    .line 106
    new-array v3, v5, [Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v2, v3}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 110
    move-result-object v2

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 114
    goto :goto_4

    .line 115
    .line 116
    .line 117
    :sswitch_1
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    move-result v2

    .line 119
    .line 120
    if-nez v2, :cond_5

    .line 121
    goto :goto_4

    .line 122
    .line 123
    :cond_5
    sget v2, Lcom/kubi/otc/R$string;->payment_Investment_status_process:I

    .line 124
    .line 125
    new-array v3, v5, [Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v2, v3}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 129
    move-result-object v2

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 133
    goto :goto_4

    .line 134
    .line 135
    :sswitch_2
    const-string v3, "CREATED"

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    move-result v2

    .line 140
    .line 141
    if-nez v2, :cond_6

    .line 142
    goto :goto_4

    .line 143
    .line 144
    :cond_6
    sget v2, Lcom/kubi/otc/R$string;->fast_result_pending:I

    .line 145
    .line 146
    new-array v3, v5, [Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, v2, v3}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 150
    move-result-object v2

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 154
    goto :goto_4

    .line 155
    .line 156
    :sswitch_3
    const-string v3, "CANCELLED"

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    move-result v2

    .line 161
    .line 162
    if-nez v2, :cond_7

    .line 163
    goto :goto_4

    .line 164
    .line 165
    :cond_7
    sget v2, Lcom/kubi/otc/R$string;->payment_Investment_status_canceled:I

    .line 166
    .line 167
    new-array v3, v5, [Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0, v2, v3}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 171
    move-result-object v2

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 175
    goto :goto_4

    .line 176
    .line 177
    :sswitch_4
    const-string v3, "SUSPEND"

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    move-result v2

    .line 182
    .line 183
    if-nez v2, :cond_8

    .line 184
    goto :goto_4

    .line 185
    .line 186
    :cond_8
    sget v2, Lcom/kubi/otc/R$string;->payment_Investment_status_paused:I

    .line 187
    .line 188
    new-array v3, v5, [Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0, v2, v3}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 192
    move-result-object v2

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 196
    .line 197
    :goto_4
    sget v0, Lcom/kubi/otc/R$id;->tv_create_time:I

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 201
    move-result-object v0

    .line 202
    .line 203
    check-cast v0, Landroid/widget/TextView;

    .line 204
    .line 205
    sget v2, Lcom/kubi/otc/R$string;->payment_Investment_create_time:I

    .line 206
    .line 207
    if-eqz p2, :cond_9

    .line 208
    .line 209
    .line 210
    invoke-virtual {p2}, Lcom/kubi/payment/fast/data/entities/RecurringPlan;->getCreateTime()Ljava/lang/Long;

    .line 211
    move-result-object v3

    .line 212
    goto :goto_5

    .line 213
    :cond_9
    move-object v3, v1

    .line 214
    .line 215
    .line 216
    :goto_5
    invoke-static {v3}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 217
    move-result-wide v3

    .line 218
    .line 219
    .line 220
    invoke-static {v3, v4}, Lcom/kubi/utils/TimeUtils;->k(J)Ljava/lang/String;

    .line 221
    move-result-object v3

    .line 222
    .line 223
    .line 224
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 225
    move-result-object v3

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0, v2, v3}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 229
    move-result-object v2

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 233
    .line 234
    sget v0, Lcom/kubi/otc/R$id;->tv_total_value:I

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 238
    move-result-object v0

    .line 239
    .line 240
    check-cast v0, Landroid/widget/TextView;

    .line 241
    .line 242
    sget v2, Lcom/kubi/otc/R$string;->payment_price:I

    .line 243
    .line 244
    if-eqz p2, :cond_a

    .line 245
    .line 246
    .line 247
    invoke-virtual {p2}, Lcom/kubi/payment/fast/data/entities/RecurringPlan;->getTotalFiatAmount()Ljava/lang/String;

    .line 248
    move-result-object v3

    .line 249
    goto :goto_6

    .line 250
    :cond_a
    move-object v3, v1

    .line 251
    .line 252
    :goto_6
    if-eqz p2, :cond_b

    .line 253
    .line 254
    .line 255
    invoke-virtual {p2}, Lcom/kubi/payment/fast/data/entities/RecurringPlan;->getFiatCurrency()Ljava/lang/String;

    .line 256
    move-result-object v4

    .line 257
    goto :goto_7

    .line 258
    :cond_b
    move-object v4, v1

    .line 259
    .line 260
    .line 261
    :goto_7
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 262
    move-result-object v3

    .line 263
    .line 264
    .line 265
    invoke-virtual {p0, v2, v3}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 266
    move-result-object v2

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 270
    .line 271
    sget v0, Lcom/kubi/otc/R$id;->tv_recurring_times_value:I

    .line 272
    .line 273
    .line 274
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 275
    move-result-object v0

    .line 276
    .line 277
    check-cast v0, Landroid/widget/TextView;

    .line 278
    .line 279
    if-eqz p2, :cond_c

    .line 280
    .line 281
    .line 282
    invoke-virtual {p2}, Lcom/kubi/payment/fast/data/entities/RecurringPlan;->getTotalTimes()Ljava/lang/Integer;

    .line 283
    move-result-object v2

    .line 284
    goto :goto_8

    .line 285
    :cond_c
    move-object v2, v1

    .line 286
    .line 287
    .line 288
    :goto_8
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 289
    move-result-object v2

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 293
    .line 294
    sget v0, Lcom/kubi/otc/R$id;->tv_next_payment_time:I

    .line 295
    .line 296
    .line 297
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 298
    move-result-object v0

    .line 299
    .line 300
    check-cast v0, Landroid/widget/TextView;

    .line 301
    .line 302
    if-eqz p2, :cond_d

    .line 303
    .line 304
    .line 305
    invoke-virtual {p2}, Lcom/kubi/payment/fast/data/entities/RecurringPlan;->getNextPaymentDescription()Ljava/lang/String;

    .line 306
    move-result-object v2

    .line 307
    goto :goto_9

    .line 308
    :cond_d
    move-object v2, v1

    .line 309
    .line 310
    .line 311
    :goto_9
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 312
    .line 313
    if-eqz p2, :cond_e

    .line 314
    .line 315
    .line 316
    invoke-virtual {p2}, Lcom/kubi/payment/fast/data/entities/RecurringPlan;->getNextPaymentDescription()Ljava/lang/String;

    .line 317
    move-result-object v1

    .line 318
    .line 319
    :cond_e
    if-eqz v1, :cond_10

    .line 320
    .line 321
    .line 322
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 323
    move-result v1

    .line 324
    .line 325
    if-nez v1, :cond_f

    .line 326
    goto :goto_a

    .line 327
    .line 328
    .line 329
    :cond_f
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 333
    goto :goto_b

    .line 334
    .line 335
    .line 336
    :cond_10
    :goto_a
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 340
    .line 341
    :goto_b
    iget-object v2, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 342
    .line 343
    const-string p1, "itemView"

    .line 344
    .line 345
    .line 346
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 347
    .line 348
    new-instance v5, Lcom/kubi/otc/otc/order/o;

    .line 349
    .line 350
    .line 351
    invoke-direct {v5, p2}, Lcom/kubi/otc/otc/order/o;-><init>(Lcom/kubi/payment/fast/data/entities/RecurringPlan;)V

    .line 352
    const/4 v6, 0x1

    .line 353
    const/4 v7, 0x0

    .line 354
    .line 355
    const-wide/16 v3, 0x0

    .line 356
    .line 357
    .line 358
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 359
    :cond_11
    return-void

    .line 360
    nop

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
    :sswitch_data_0
    .sparse-switch
        -0x4397d3e4 -> :sswitch_4
        -0x3d7fc6cf -> :sswitch_3
        0x681a0ac8 -> :sswitch_2
        0x7a599aa9 -> :sswitch_1
        0x7b29883d -> :sswitch_0
    .end sparse-switch
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
.end method

.method public final M3()Lcom/kubi/payment/fast/data/source/remote/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/otc/otc/order/RecurringHistoryFragment;->Z:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/payment/fast/data/source/remote/a;

    .line 9
    return-object v0
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

.method public bridge synthetic o3(Lio/chad/library/adapter/base/BaseViewHolder;Landroid/os/Parcelable;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/payment/fast/data/entities/RecurringPlan;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/otc/otc/order/RecurringHistoryFragment;->J3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/payment/fast/data/entities/RecurringPlan;)V

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

.method public onReBack()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->onReBack()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->F3()V

    .line 7
    return-void
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

.method public r3(II)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/sdk/base/entity/BasePageEntity<",
            "Lcom/kubi/payment/fast/data/entities/RecurringPlan;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/otc/otc/order/RecurringHistoryFragment;->M3()Lcom/kubi/payment/fast/data/source/remote/a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Lcom/kubi/payment/fast/data/source/remote/a;->h(II)Lio/reactivex/Observable;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/kubi/sdk/util/a1;->m()Lio/reactivex/ObservableTransformer;

    .line 12
    move-result-object p2

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->compose(Lio/reactivex/ObservableTransformer;)Lio/reactivex/Observable;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    const-string p2, "compose(...)"

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    return-object p1
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

.method public x3()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/otc/R$layout;->payment_item_recurring_plan:I

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
