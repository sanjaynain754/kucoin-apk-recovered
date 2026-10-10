.class public final Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsLayout;
.super Landroidx/appcompat/widget/LinearLayoutCompat;
.source "PaymentMethodsLayout.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0008J\u000e\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\r\u001a\u00020\u000c2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsLayout;",
        "Landroidx/appcompat/widget/LinearLayoutCompat;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "listener",
        "Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodListener;",
        "setPaymentMethodListener",
        "",
        "bindData",
        "paymentMethods",
        "",
        "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;",
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
        "SMAP\nPaymentMethodsLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodsLayout.kt\ncom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1869#2,2:64\n*S KotlinDebug\n*F\n+ 1 PaymentMethodsLayout.kt\ncom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsLayout\n*L\n26#1:64,2\n*E\n"
    }
.end annotation


# instance fields
.field public b:Lut/a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 5
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "paymentMethods"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_8

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    check-cast v0, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;->getPaymentType()Ljava/lang/String;

    .line 28
    move-result-object v1

    .line 29
    const/4 v2, 0x0

    .line 30
    .line 31
    if-eqz v1, :cond_7

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 35
    move-result v3

    .line 36
    .line 37
    const-string v4, "getContext(...)"

    .line 38
    .line 39
    .line 40
    sparse-switch v3, :sswitch_data_0

    .line 41
    .line 42
    goto/16 :goto_1

    .line 43
    .line 44
    :sswitch_0
    const-string v3, "BANK_CARD"

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    move-result v1

    .line 49
    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    goto/16 :goto_1

    .line 53
    .line 54
    :cond_1
    new-instance v2, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsBankCardView;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-direct {v2, v1}, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsBankCardView;-><init>(Landroid/content/Context;)V

    .line 65
    goto :goto_1

    .line 66
    .line 67
    :sswitch_1
    const-string v3, "BALANCE"

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    move-result v1

    .line 72
    .line 73
    if-nez v1, :cond_2

    .line 74
    goto :goto_1

    .line 75
    .line 76
    :cond_2
    new-instance v2, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsBalanceView;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 80
    move-result-object v1

    .line 81
    .line 82
    .line 83
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-direct {v2, v1}, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsBalanceView;-><init>(Landroid/content/Context;)V

    .line 87
    goto :goto_1

    .line 88
    .line 89
    :sswitch_2
    const-string v3, "P2P_EXPRESS"

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    move-result v1

    .line 94
    .line 95
    if-nez v1, :cond_3

    .line 96
    goto :goto_1

    .line 97
    .line 98
    :cond_3
    new-instance v2, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsP2PView;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 102
    move-result-object v1

    .line 103
    .line 104
    .line 105
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-direct {v2, v1}, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsP2PView;-><init>(Landroid/content/Context;)V

    .line 109
    goto :goto_1

    .line 110
    .line 111
    :sswitch_3
    const-string v3, "POPULAR_PAY"

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    move-result v1

    .line 116
    .line 117
    if-nez v1, :cond_4

    .line 118
    goto :goto_1

    .line 119
    .line 120
    .line 121
    :cond_4
    invoke-virtual {v0}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;->isHidden()Ljava/lang/Boolean;

    .line 122
    move-result-object v1

    .line 123
    .line 124
    .line 125
    invoke-static {v1}, Lub/b;->b(Ljava/lang/Boolean;)Z

    .line 126
    move-result v1

    .line 127
    .line 128
    if-eqz v1, :cond_5

    .line 129
    goto :goto_1

    .line 130
    .line 131
    :cond_5
    new-instance v2, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsPopularView;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 135
    move-result-object v1

    .line 136
    .line 137
    .line 138
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-direct {v2, v1}, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsPopularView;-><init>(Landroid/content/Context;)V

    .line 142
    goto :goto_1

    .line 143
    .line 144
    :sswitch_4
    const-string v3, "THIRD_PARTY"

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    move-result v1

    .line 149
    .line 150
    if-nez v1, :cond_6

    .line 151
    goto :goto_1

    .line 152
    .line 153
    :cond_6
    new-instance v2, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsThirdPartyView;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 157
    move-result-object v1

    .line 158
    .line 159
    .line 160
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-direct {v2, v1}, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsThirdPartyView;-><init>(Landroid/content/Context;)V

    .line 164
    .line 165
    :cond_7
    :goto_1
    if-eqz v2, :cond_0

    .line 166
    .line 167
    iget-object v1, p0, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsLayout;->b:Lut/a;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v1}, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsView;->setPaymentMethodListener(Lut/a;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v0}, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsView;->a(Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 177
    .line 178
    goto/16 :goto_0

    .line 179
    :cond_8
    return-void

    .line 180
    nop

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
    :sswitch_data_0
    .sparse-switch
        -0x2edf3e32 -> :sswitch_4
        -0x1ac321fe -> :sswitch_3
        -0x3779941 -> :sswitch_2
        0x1693fabc -> :sswitch_1
        0x3d4cb333 -> :sswitch_0
    .end sparse-switch
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

.method public final setPaymentMethodListener(Lut/a;)V
    .locals 1
    .param p1    # Lut/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "listener"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsLayout;->b:Lut/a;

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
