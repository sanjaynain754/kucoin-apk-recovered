.class public final Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsPopularView;
.super Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsView;
.source "PaymentMethodsPopularView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0008J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsPopularView;",
        "Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsView;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "binding",
        "Lcom/kubi/otc/databinding/PaymentViewPaymentMethodsPopularPayBinding;",
        "getBinding",
        "()Lcom/kubi/otc/databinding/PaymentViewPaymentMethodsPopularPayBinding;",
        "binding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "bindData",
        "",
        "paymentMethodList",
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
        "SMAP\nPaymentMethodsPopularView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodsPopularView.kt\ncom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsPopularView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n41#2:54\n65#2:55\n80#2,7:56\n65#2:63\n80#2,7:64\n1869#3,2:71\n*S KotlinDebug\n*F\n+ 1 PaymentMethodsPopularView.kt\ncom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsPopularView\n*L\n23#1:54\n23#1:55\n23#1:56,7\n23#1:63\n23#1:64,7\n45#1:71,2\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic p:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final o:Lcom/kubi/sdk/viewbindingdelegate/base/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lkotlin/jvm/internal/PropertyReference1Impl;

    .line 3
    .line 4
    const-string v1, "getBinding()Lcom/kubi/otc/databinding/PaymentViewPaymentMethodsPopularPayBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsPopularView;

    .line 8
    .line 9
    const-string v4, "binding"

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->property1(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;

    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    .line 19
    new-array v1, v1, [Lkotlin/reflect/KProperty;

    .line 20
    .line 21
    aput-object v0, v1, v2

    .line 22
    .line 23
    sput-object v1, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsPopularView;->p:[Lkotlin/reflect/KProperty;

    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsView;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-static {}, Lcom/kubi/sdk/viewbindingdelegate/internal/UtilsKt;->b()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    .line 3
    new-instance v0, Lcom/kubi/sdk/viewbindingdelegate/base/LazyViewBindingProperty;

    new-instance v1, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsPopularView$special$$inlined$viewBinding$1;

    invoke-direct {v1}, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsPopularView$special$$inlined$viewBinding$1;-><init>()V

    invoke-direct {v0, p1, v1}, Lcom/kubi/sdk/viewbindingdelegate/base/LazyViewBindingProperty;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 4
    iput-object v0, p0, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsPopularView;->o:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    .line 6
    sget v0, Lcom/kubi/otc/R$layout;->payment_view_payment_methods_popular_pay:I

    invoke-virtual {p1, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

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

    .line 7
    invoke-direct {p0, p1, p2}, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 8
    invoke-static {}, Lcom/kubi/sdk/viewbindingdelegate/internal/UtilsKt;->b()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    .line 9
    new-instance p2, Lcom/kubi/sdk/viewbindingdelegate/base/LazyViewBindingProperty;

    new-instance v0, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsPopularView$special$$inlined$viewBinding$2;

    invoke-direct {v0}, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsPopularView$special$$inlined$viewBinding$2;-><init>()V

    invoke-direct {p2, p1, v0}, Lcom/kubi/sdk/viewbindingdelegate/base/LazyViewBindingProperty;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 10
    iput-object p2, p0, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsPopularView;->o:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    .line 12
    sget p2, Lcom/kubi/otc/R$layout;->payment_view_payment_methods_popular_pay:I

    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    return-void
.end method

.method private final getBinding()Lft/s3;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsPopularView;->o:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsPopularView;->p:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p0, v1}, Lcom/kubi/sdk/viewbindingdelegate/base/a;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Landroidx/viewbinding/ViewBinding;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Lft/s3;

    .line 14
    return-object v0
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
.method public a(Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;)V
    .locals 4
    .param p1    # Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "paymentMethodList"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;->getTips()Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsPopularView;->getBinding()Lft/s3;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iget-object v1, v1, Lft/s3;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 30
    move-result v0

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-direct {p0}, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsPopularView;->getBinding()Lft/s3;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    iget-object v0, v0, Lft/s3;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 46
    goto :goto_0

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-direct {p0}, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsPopularView;->getBinding()Lft/s3;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    iget-object v0, v0, Lft/s3;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    :goto_0
    invoke-direct {p0}, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsPopularView;->getBinding()Lft/s3;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    iget-object v0, v0, Lft/s3;->c:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 68
    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 73
    .line 74
    .line 75
    :cond_3
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;->getPaymentMethods()Ljava/util/List;

    .line 76
    move-result-object p1

    .line 77
    .line 78
    if-eqz p1, :cond_5

    .line 79
    .line 80
    .line 81
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    .line 85
    :cond_4
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    move-result v0

    .line 87
    .line 88
    if-eqz v0, :cond_5

    .line 89
    .line 90
    .line 91
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    move-result-object v0

    .line 93
    .line 94
    check-cast v0, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->isHidden()Ljava/lang/Boolean;

    .line 98
    move-result-object v1

    .line 99
    .line 100
    .line 101
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 102
    move-result v1

    .line 103
    .line 104
    if-nez v1, :cond_4

    .line 105
    .line 106
    sget-object v1, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodView;->p:Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodView$Companion;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 110
    move-result-object v2

    .line 111
    .line 112
    const-string v3, "getContext(...)"

    .line 113
    .line 114
    .line 115
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsView;->getListener()Lut/a;

    .line 119
    move-result-object v3

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v2, v0, v3}, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodView$Companion;->buildPaymentMethodView(Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lut/a;)Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodView;

    .line 123
    move-result-object v0

    .line 124
    .line 125
    .line 126
    invoke-direct {p0}, Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsPopularView;->getBinding()Lft/s3;

    .line 127
    move-result-object v1

    .line 128
    .line 129
    if-eqz v1, :cond_4

    .line 130
    .line 131
    iget-object v1, v1, Lft/s3;->c:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 132
    .line 133
    if-eqz v1, :cond_4

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 137
    goto :goto_1

    .line 138
    :cond_5
    return-void
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
