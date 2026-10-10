.class public final Lcom/kubi/payment/fasttrade/sell/FastSellFragment;
.super Lcom/kubi/payment/fast/common/BaseFastFragment;
.source "FastSellFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/payment/fasttrade/sell/FastSellFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/payment/fast/common/BaseFastFragment<",
        "Lcom/kubi/payment/fasttrade/sell/FastSellVM;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Deprecated;
    message = "\u5e9f\u5f03"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 B2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001BB\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0012\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0008\u0010\u001b\u001a\u00020\u0018H\u0002J\u0008\u0010\u001c\u001a\u00020\u0018H\u0002J\u001a\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0008\u0010 \u001a\u00020\u0018H\u0002J\u0008\u0010!\u001a\u00020\u0018H\u0016J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\u0012\u0010$\u001a\u00020\u00182\u0008\u0008\u0002\u0010%\u001a\u00020\u0010H\u0002J\u0008\u0010&\u001a\u00020\u0018H\u0002J\u0008\u0010\'\u001a\u00020\u0018H\u0002J\u0008\u0010(\u001a\u00020\u0018H\u0002J\u0008\u0010)\u001a\u00020\u0010H\u0002J\u0008\u0010*\u001a\u00020\u0018H\u0002J\u0008\u0010+\u001a\u00020\u0018H\u0002J\u0008\u0010,\u001a\u00020\u0018H\u0002J\u0008\u0010-\u001a\u00020\u0018H\u0002J\u0008\u0010.\u001a\u00020\u0018H\u0002J\u0010\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u000cH\u0002J\u0010\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u000cH\u0002J\u0008\u00103\u001a\u00020\u0018H\u0002J\u0008\u00104\u001a\u00020\u0018H\u0002J\u0008\u00105\u001a\u00020\u000cH\u0002J\u0008\u00106\u001a\u00020\u0018H\u0002J\u0008\u00107\u001a\u00020\u0018H\u0014J\u0008\u00108\u001a\u00020\u0018H\u0002J\u0012\u00109\u001a\u00020\u00182\u0008\u0010:\u001a\u0004\u0018\u00010\u0014H\u0002J\u0008\u0010;\u001a\u00020\u0018H\u0002J\u0008\u0010<\u001a\u00020\u0018H\u0016J\u0008\u0010=\u001a\u00020\u0018H\u0016J\u000e\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\u00020?H\u0016J\u0008\u0010@\u001a\u00020AH\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"
    }
    d2 = {
        "Lcom/kubi/payment/fasttrade/sell/FastSellFragment;",
        "Lcom/kubi/payment/fast/common/BaseFastFragment;",
        "Lcom/kubi/payment/fasttrade/sell/FastSellVM;",
        "<init>",
        "()V",
        "viewBinding",
        "Lcom/kubi/otc/databinding/PaymentFragmentFastSellBinding;",
        "getViewBinding",
        "()Lcom/kubi/otc/databinding/PaymentFragmentFastSellBinding;",
        "viewBinding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "fiatCurrency",
        "",
        "cryptoCurrency",
        "quoteType",
        "isAddNewCard",
        "",
        "showBalanceError",
        "showLimit",
        "selectedPaymentMethod",
        "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;",
        "fastTradeViewModel",
        "Lcom/kubi/payment/fasttrade/FastTradeVM;",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "initParentVM",
        "initTradingPair",
        "onViewCreated",
        "view",
        "Landroid/view/View;",
        "bindEvent",
        "initViews",
        "paymentMethodJsonObject",
        "Lorg/json/JSONObject;",
        "loadPaymentMethodList",
        "isSelectedPaymentMethod",
        "preCheck",
        "showAvailableBalanceExplainDialog",
        "refreshConfirm",
        "canPreviewOrder",
        "checkAmount",
        "refreshEstimated",
        "refreshBalance",
        "refreshLimit",
        "refreshLimitContent",
        "onFiatCurrencyChanged",
        "newFiatCurrency",
        "onCryptoCurrencyChanged",
        "newCryptoCurrency",
        "onTradingPairChanged",
        "refreshPrecision",
        "amount",
        "updateCryptoCurrencyUI",
        "observeData",
        "refreshAvailableBalance",
        "onSelectedPaymentMethodChanged",
        "newPaymentMethod",
        "showFiatCurrencySelectedDialog",
        "onResume",
        "onDestroyView",
        "viewModelClass",
        "Lkotlin/reflect/KClass;",
        "layout",
        "",
        "Companion",
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
        "SMAP\nFastSellFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastSellFragment.kt\ncom/kubi/payment/fasttrade/sell/FastSellFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,702:1\n147#2,16:703\n44#3,2:719\n76#4,7:721\n*S KotlinDebug\n*F\n+ 1 FastSellFragment.kt\ncom/kubi/payment/fasttrade/sell/FastSellFragment\n*L\n55#1:703,16\n114#1:719,2\n143#1:721,7\n*E\n"
    }
.end annotation


# static fields
.field public static final f0:Lcom/kubi/payment/fasttrade/sell/FastSellFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic g0:[Lkotlin/reflect/KProperty;
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
.field public final W:Lcom/kubi/sdk/viewbindingdelegate/base/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public X:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public Y:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public Z:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public a0:Z

.field public b0:Z

.field public c0:Z

.field public d0:Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public e0:Lcom/kubi/payment/fasttrade/FastTradeVM;
    .annotation build Lorg/jetbrains/annotations/Nullable;
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
    const-string v1, "getViewBinding()Lcom/kubi/otc/databinding/PaymentFragmentFastSellBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;

    .line 8
    .line 9
    const-string v4, "viewBinding"

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
    sput-object v1, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->g0:[Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment$Companion;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    sput-object v0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->f0:Lcom/kubi/payment/fasttrade/sell/FastSellFragment$Companion;

    .line 32
    return-void
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
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/payment/fast/common/BaseFastFragment;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment$special$$inlined$viewBindingFragment$1;->INSTANCE:Lcom/kubi/payment/fasttrade/sell/FastSellFragment$special$$inlined$viewBindingFragment$1;

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/payment/fasttrade/sell/FastSellFragment$special$$inlined$viewBindingFragment$2;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment$special$$inlined$viewBindingFragment$2;-><init>(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->W:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 17
    .line 18
    const-string v0, ""

    .line 19
    .line 20
    iput-object v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->X:Ljava/lang/String;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y:Ljava/lang/String;

    .line 23
    .line 24
    const-string v0, "CRYPTO"

    .line 25
    .line 26
    iput-object v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Z:Ljava/lang/String;

    .line 27
    .line 28
    const-string v0, "B7FastSell"

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->setPageId(Ljava/lang/String;)V

    .line 32
    return-void
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
.end method

.method public static synthetic B3()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->b4()Lkotlin/Unit;

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

.method private final B4()V
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/otc/view/SelectLabelDialogView;->v0:Lcom/kubi/otc/view/SelectLabelDialogView$Companion;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->e0:Lcom/kubi/payment/fasttrade/FastTradeVM;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/kubi/payment/fasttrade/FastTradeVM;->B()Lcom/kubi/otc/entity/FastSymbol;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v2, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->X:Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Lcom/kubi/otc/entity/FastSymbol;->selectLegals(Ljava/lang/String;)Ljava/util/List;

    .line 18
    move-result-object v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x0

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-static {v1}, Lcom/kubi/utils/extensions/b;->c(Ljava/util/List;)Ljava/util/List;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    new-instance v2, Lcom/kubi/payment/fasttrade/sell/h;

    .line 27
    .line 28
    .line 29
    invoke-direct {v2, p0}, Lcom/kubi/payment/fasttrade/sell/h;-><init>(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)V

    .line 30
    const/4 v4, 0x4

    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v3, 0x0

    .line 33
    .line 34
    .line 35
    invoke-static/range {v0 .. v5}, Lcom/kubi/otc/view/SelectLabelDialogView$Companion;->newInstance$default(Lcom/kubi/otc/view/SelectLabelDialogView$Companion;Ljava/util/List;Lio/reactivex/functions/BiConsumer;Ljava/lang/String;ILjava/lang/Object;)Lcom/kubi/resources/dialog/DialogFragmentHelper;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    const-string v2, "getChildFragmentManager(...)"

    .line 43
    .line 44
    .line 45
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    const-string v2, "payment_fast_sell_select_fiat_currency"

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 51
    return-void
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
.end method

.method public static synthetic C3(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->h4(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Ljava/lang/String;)Lkotlin/Unit;

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
.end method

.method public static final C4(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Lio/chad/library/adapter/base/BaseViewHolder;Lmt/u;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lmt/u;->b()Ljava/lang/String;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 12
    move-result p2

    .line 13
    .line 14
    if-nez p2, :cond_0

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    iget-object p0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->e0:Lcom/kubi/payment/fasttrade/FastTradeVM;

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    const/4 p2, 0x1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Lcom/kubi/payment/fasttrade/FastTradeVM;->D(Ljava/lang/String;Z)V

    .line 24
    .line 25
    :cond_1
    new-instance p0, Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 29
    .line 30
    const-string p2, "fiat"

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    .line 35
    const-string p1, "type"

    .line 36
    .line 37
    const-string p2, "sell"

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 43
    .line 44
    const-string p1, "B7FastTrade"

    .line 45
    .line 46
    const-string p2, "fiatSelector"

    .line 47
    .line 48
    const-string v0, "1"

    .line 49
    .line 50
    .line 51
    invoke-static {p1, p2, v0, p0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 52
    return-void
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

.method public static synthetic D3(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->c4(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)Lkotlin/Unit;

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

.method private final D4()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lft/n1;->q:Lcom/kubi/resources/widget/BaseTextView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget-object v0, v0, Lft/n1;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->n3()Landroid/content/Context;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    iget-object v2, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->e0:Lcom/kubi/payment/fasttrade/FastTradeVM;

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Lcom/kubi/payment/fasttrade/FastTradeVM;->B()Lcom/kubi/otc/entity/FastSymbol;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    iget-object v3, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y:Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v3}, Lcom/kubi/otc/entity/FastSymbol;->coinIcon(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    move-result-object v2

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 v2, 0x0

    .line 48
    .line 49
    .line 50
    :goto_0
    invoke-static {v1, v2, v0}, Lcom/kubi/sdk/util/v;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 51
    :cond_2
    return-void
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
.end method

.method public static synthetic E3(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->d4(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)Lkotlin/Unit;

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

.method public static synthetic F3(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->e4(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)Lkotlin/Unit;

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

.method public static synthetic G3(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Lio/chad/library/adapter/base/BaseViewHolder;Lmt/u;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->C4(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Lio/chad/library/adapter/base/BaseViewHolder;Lmt/u;)V

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

.method public static synthetic H3(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Lcom/kubi/payment/fast/data/entities/Balance$Response;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->j4(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Lcom/kubi/payment/fast/data/entities/Balance$Response;)Lkotlin/Unit;

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
.end method

.method public static synthetic I3(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->k4(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;)Lkotlin/Unit;

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
.end method

.method public static synthetic J3(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->i4(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Ljava/lang/String;)Lkotlin/Unit;

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
.end method

.method public static synthetic K3(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Lft/n1;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->f4(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Lft/n1;)Lkotlin/Unit;

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
.end method

.method public static synthetic L3(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->l4(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Ljava/lang/Boolean;)Lkotlin/Unit;

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
.end method

.method public static synthetic M3(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->m4(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Ljava/lang/Boolean;)Lkotlin/Unit;

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
.end method

.method public static final synthetic N3(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->X3()V

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

.method public static final synthetic O3(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y:Ljava/lang/String;

    .line 3
    return-object p0
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

.method public static final synthetic P3(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->X:Ljava/lang/String;

    .line 3
    return-object p0
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

.method public static final synthetic Q3(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->g4(Z)V

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

.method public static final synthetic R3(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->z4()V

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

.method public static final synthetic S3(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Z:Ljava/lang/String;

    .line 3
    return-void
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

.method public static final synthetic T3(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->B4()V

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

.method private final U3()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lft/n1;->j:Lcom/kubi/payment/fasttrade/widget/FastTradeInputView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/kubi/payment/fasttrade/widget/FastTradeInputView;->f()Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    .line 18
    :goto_0
    const-string v1, "0"

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    return-object v0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method private final V3()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/event/api/b;->a:Lcom/kubi/event/api/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/event/api/b;->a()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    const-string v1, "com.kubi.payment.event.PaymentEvent:fastSellRefreshPaymentMethod"

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 14
    move-result v0

    .line 15
    .line 16
    :cond_0
    new-instance v0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment$bindEvent$$inlined$bindFlowEvent$default$1;

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1, v2, p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment$bindEvent$$inlined$bindFlowEvent$default$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)V

    .line 21
    const/4 v1, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static {p0, v1, v0}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method private final X3()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->U3()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    const-string v2, "SellFragment onAmountChanged amount:"

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    const-string v1, "payment"

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v0}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->u4()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->x4()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->w4()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->v4()V

    .line 39
    return-void
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
.end method

.method private final Z3()V
    .locals 8

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/BaseApplication;->Companion:Lcom/kubi/sdk/BaseApplication$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/sdk/BaseApplication$Companion;->get()Landroid/app/Application;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ltt/a;->d()Lcom/kubi/payment/fast/data/source/a;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    new-instance v2, Ltt/b;

    .line 13
    .line 14
    .line 15
    invoke-direct {v2, v1, v0}, Ltt/b;-><init>(Lcom/kubi/payment/fast/data/source/a;Landroid/app/Application;)V

    .line 16
    .line 17
    :try_start_0
    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireParentFragment()Landroidx/fragment/app/Fragment;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    const-string v3, "requireParentFragment(...)"

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V

    .line 30
    .line 31
    const-class v1, Lcom/kubi/payment/fasttrade/FastTradeVM;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    check-cast v0, Lcom/kubi/payment/fasttrade/FastTradeVM;

    .line 38
    .line 39
    iput-object v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->e0:Lcom/kubi/payment/fasttrade/FastTradeVM;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    return-void

    .line 41
    :catch_0
    move-exception v0

    .line 42
    move-object v2, v0

    .line 43
    .line 44
    new-instance v1, Lcom/kubi/otc/exception/OtcException;

    .line 45
    .line 46
    const/16 v6, 0x8

    .line 47
    const/4 v7, 0x0

    .line 48
    .line 49
    const-string v3, "FastSellFragment init FastTradeViewModel"

    .line 50
    const/4 v4, 0x0

    .line 51
    const/4 v5, 0x0

    .line 52
    .line 53
    .line 54
    invoke-direct/range {v1 .. v7}, Lcom/kubi/otc/exception/OtcException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 55
    const/4 v0, 0x2

    .line 56
    const/4 v2, 0x0

    .line 57
    .line 58
    .line 59
    invoke-static {v1, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 60
    return-void
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
.end method

.method private final a4()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, ""

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v3, "key_crypto_currency"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v3, v1}, Lcom/kubi/router/utils/RouteExKt;->z(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v0, v2

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 25
    move-result v3

    .line 26
    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    sget-object v0, Lcom/kubi/payment/util/i;->a:Lcom/kubi/payment/util/i;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/kubi/payment/util/i;->k()Ly70/g;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v1}, Ly70/a;->h(Ly70/g;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 41
    move-result v1

    .line 42
    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    iget-object v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->e0:Lcom/kubi/payment/fasttrade/FastTradeVM;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/kubi/payment/fasttrade/FastTradeVM;->z()Landroidx/lifecycle/LiveData;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    check-cast v0, Ljava/lang/String;

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    move-object v0, v2

    .line 62
    .line 63
    .line 64
    :goto_1
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    iget-object v1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->e0:Lcom/kubi/payment/fasttrade/FastTradeVM;

    .line 68
    .line 69
    if-eqz v1, :cond_3

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Lcom/kubi/payment/fasttrade/FastTradeVM;->B()Lcom/kubi/otc/entity/FastSymbol;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v0}, Lcom/kubi/otc/entity/FastSymbol;->firstCoin(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    move-result-object v2

    .line 80
    .line 81
    .line 82
    :cond_3
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    .line 86
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 87
    move-result-object v1

    .line 88
    .line 89
    check-cast v1, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v0}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->i0(Ljava/lang/String;)V

    .line 93
    .line 94
    new-instance v1, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    const-string v2, "FastSellFragment initViews tempCryptoCurrency "

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    move-result-object v0

    .line 110
    .line 111
    const-string v1, "payment"

    .line 112
    .line 113
    .line 114
    invoke-static {v1, v0}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    return-void
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
.end method

.method private static final b4()Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/payment/helper/a;->a:Lcom/kubi/payment/helper/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/payment/helper/a;->a()V

    .line 6
    .line 7
    const-string v0, "type"

    .line 8
    .line 9
    const-string v1, "sell"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    const-string v1, "B7FastTrade"

    .line 20
    .line 21
    const-string v2, "otcLarge"

    .line 22
    .line 23
    const-string v3, "1"

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2, v3, v0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 27
    .line 28
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 29
    return-object v0
    .line 30
    .line 31
.end method

.method public static final c4(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)Lkotlin/Unit;
    .locals 8

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/payment/fasttrade/sell/FastSellCryptoCurrencyDialog;->v0:Lcom/kubi/payment/fasttrade/sell/FastSellCryptoCurrencyDialog$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    const-string v2, "getChildFragmentManager(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    iget-object p0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y:Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, p0}, Lcom/kubi/payment/fasttrade/sell/FastSellCryptoCurrencyDialog$Companion;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 17
    .line 18
    const/16 v6, 0xc

    .line 19
    const/4 v7, 0x0

    .line 20
    .line 21
    const-string v2, "B7FastSell"

    .line 22
    .line 23
    const-string v3, "cryptoCurrency"

    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    .line 27
    .line 28
    invoke-static/range {v2 .. v7}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 31
    return-object p0
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

.method public static final d4(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->A4()V

    .line 4
    .line 5
    const/16 v4, 0xc

    .line 6
    const/4 v5, 0x0

    .line 7
    .line 8
    const-string v0, "B7FastSell"

    .line 9
    .line 10
    const-string v1, "balanceDescription"

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    .line 15
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 16
    .line 17
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 18
    return-object p0
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

.method public static final e4(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)Lkotlin/Unit;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->g4(Z)V

    .line 5
    .line 6
    const/16 v5, 0xc

    .line 7
    const/4 v6, 0x0

    .line 8
    .line 9
    const-string v1, "B7FastSell"

    .line 10
    .line 11
    const-string v2, "paymentMethod"

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static/range {v1 .. v6}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 19
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
.end method

.method public static final f4(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Lft/n1;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->U3()Ljava/lang/String;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->Z(Ljava/lang/String;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const-string v0, "CRYPTO"

    .line 19
    .line 20
    iput-object v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Z:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v1, p1, Lft/n1;->j:Lcom/kubi/payment/fasttrade/widget/FastTradeInputView;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Lcom/kubi/payment/fasttrade/widget/FastTradeInputView;->setQuoteType(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->z4()V

    .line 29
    .line 30
    iget-object v0, p1, Lft/n1;->j:Lcom/kubi/payment/fasttrade/widget/FastTradeInputView;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->X:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v2, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y:Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1, v2}, Lcom/kubi/payment/fasttrade/widget/FastTradeInputView;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    iget-object p1, p1, Lft/n1;->j:Lcom/kubi/payment/fasttrade/widget/FastTradeInputView;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/kubi/payment/fasttrade/widget/FastTradeInputView;->j()Lcom/kubi/payment/fasttrade/widget/FastTradeTextView;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    if-eqz p1, :cond_0

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    check-cast v0, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->J()Ljava/lang/String;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v0}, Lcom/kubi/payment/fasttrade/widget/FastTradeTextView;->setAmount(Ljava/lang/String;)V

    .line 59
    .line 60
    :cond_0
    const-string p1, "sellAll"

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->r4()Lorg/json/JSONObject;

    .line 64
    move-result-object p0

    .line 65
    .line 66
    const-string v0, "B7FastSell"

    .line 67
    .line 68
    const-string v1, "button"

    .line 69
    .line 70
    .line 71
    invoke-static {v0, v1, p1, p0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 72
    goto :goto_0

    .line 73
    .line 74
    .line 75
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->s4()V

    .line 76
    .line 77
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 78
    return-object p0
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

.method public static final h4(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->o4(Ljava/lang/String;)V

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0
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

.method public static final i4(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->n4(Ljava/lang/String;)V

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0
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

.method public static final j4(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Lcom/kubi/payment/fast/data/entities/Balance$Response;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->t4()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->X3()V

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0
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

.method public static final k4(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->p4(Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;)V

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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

.method public static final l4(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    move-result p1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    sget-object p1, Lcom/kubi/payment/fasttrade/sell/paymentmethod/SellPaymentMethodDialog;->u0:Lcom/kubi/payment/fasttrade/sell/paymentmethod/SellPaymentMethodDialog$Companion;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    const-string v0, "getChildFragmentManager(...)"

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p0}, Lcom/kubi/payment/fasttrade/sell/paymentmethod/SellPaymentMethodDialog$Companion;->show(Landroidx/fragment/app/FragmentManager;)V

    .line 21
    .line 22
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 23
    return-object p0
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

.method public static final m4(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    move-result p1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    check-cast p1, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->U3()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iget-object v1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Z:Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0, v1}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->I(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    const-string v1, "preCheckPassed cryptoAmount:"

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    const-string v1, "payment"

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v0}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    sget-object v0, Lcom/kubi/payment/fasttrade/sell/s;->a:Lcom/kubi/payment/fasttrade/sell/s;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->n3()Landroid/content/Context;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 54
    move-result-object v2

    .line 55
    .line 56
    const-string v3, "getChildFragmentManager(...)"

    .line 57
    .line 58
    .line 59
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    iget-object p0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->d0:Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1, v2, p0, p1}, Lcom/kubi/payment/fasttrade/sell/s;->c(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;Ljava/lang/String;)V

    .line 65
    .line 66
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 67
    return-object p0
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
.end method

.method private final n4(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    iput-object p1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y:Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->D4()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    check-cast p1, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 21
    .line 22
    iget-object v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y:Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->d0(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->q4()V

    .line 29
    return-void
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

.method private final o4(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "FastSellFragment onFiatCurrencyChanged newFiatCurrency:"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v1, ",fiatCurrency:"

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->X:Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    const-string v1, "payment"

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v0}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    iget-object v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->X:Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    move-result v0

    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    return-void

    .line 42
    .line 43
    :cond_0
    iput-object p1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->X:Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    check-cast p1, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 50
    .line 51
    iget-object v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->e0:Lcom/kubi/payment/fasttrade/FastTradeVM;

    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/kubi/payment/fasttrade/FastTradeVM;->B()Lcom/kubi/otc/entity/FastSymbol;

    .line 57
    move-result-object v0

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    const/4 v0, 0x0

    .line 60
    .line 61
    :goto_0
    iget-object v1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->X:Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0, v1}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->l0(Lcom/kubi/otc/entity/FastSymbol;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->q4()V

    .line 68
    return-void
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
.end method

.method private final q4()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lft/n1;->j:Lcom/kubi/payment/fasttrade/widget/FastTradeInputView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Z:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/kubi/payment/fasttrade/widget/FastTradeInputView;->setQuoteType(Ljava/lang/String;)V

    .line 16
    .line 17
    iget-object v1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->X:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y:Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, Lcom/kubi/payment/fasttrade/widget/FastTradeInputView;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->z4()V

    .line 26
    const/4 v0, 0x0

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->g4(Z)V

    .line 30
    return-void
    .line 31
.end method

.method private final z4()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Z:Ljava/lang/String;

    .line 3
    .line 4
    const-string v1, "FIAT"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->X:Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->P(Ljava/lang/String;)I

    .line 22
    move-result v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    iget-object v1, v1, Lft/n1;->j:Lcom/kubi/payment/fasttrade/widget/FastTradeInputView;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lcom/kubi/payment/fasttrade/widget/FastTradeInputView;->j()Lcom/kubi/payment/fasttrade/widget/FastTradeTextView;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v0}, Lcom/kubi/payment/fasttrade/widget/FastTradeTextView;->setPrecision(I)V

    .line 42
    return-void

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    check-cast v0, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 49
    .line 50
    iget-object v1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y:Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->L(Ljava/lang/String;)I

    .line 54
    move-result v0

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    iget-object v1, v1, Lft/n1;->j:Lcom/kubi/payment/fasttrade/widget/FastTradeInputView;

    .line 63
    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Lcom/kubi/payment/fasttrade/widget/FastTradeInputView;->j()Lcom/kubi/payment/fasttrade/widget/FastTradeTextView;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v0}, Lcom/kubi/payment/fasttrade/widget/FastTradeTextView;->setPrecision(I)V

    .line 74
    :cond_1
    return-void
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
.end method


# virtual methods
.method public final A4()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->R()Landroidx/lifecycle/LiveData;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Lcom/kubi/payment/fast/data/entities/Balance$Response;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    return-void

    .line 20
    .line 21
    :cond_0
    sget-object v1, Lcom/kubi/payment/fasttrade/sell/FastSellBalanceExplainDialog;->t0:Lcom/kubi/payment/fasttrade/sell/FastSellBalanceExplainDialog$Companion;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    const-string v3, "getChildFragmentManager(...)"

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0, v2}, Lcom/kubi/payment/fasttrade/sell/FastSellBalanceExplainDialog$Companion;->show(Lcom/kubi/payment/fast/data/entities/Balance$Response;Landroidx/fragment/app/FragmentManager;)V

    .line 34
    return-void
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
.end method

.method public final W3()Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->d0:Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->U3()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    iget-object v2, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Z:Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->c0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    check-cast v0, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->U3()Ljava/lang/String;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    iget-object v2, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Z:Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1, v2}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->b0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 38
    move-result v0

    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    const/4 v0, 0x1

    .line 42
    return v0

    .line 43
    :cond_0
    const/4 v0, 0x0

    .line 44
    return v0
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
.end method

.method public final Y3()Lft/n1;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->W:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->g0:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Lft/n1;

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

.method public final g4(Z)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 4
    move-result-object v0

    .line 5
    move-object v1, v0

    .line 6
    .line 7
    check-cast v1, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->X:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v3, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y:Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->U3()Ljava/lang/String;

    .line 15
    move-result-object v4

    .line 16
    .line 17
    iget-object v5, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Z:Ljava/lang/String;

    .line 18
    move v6, p1

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {v1 .. v6}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->e0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 22
    return-void
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

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Z3()V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->a4()V

    .line 10
    return-void
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

.method public onDestroyView()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/BaseFragment;->onDestroyView()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/payment/util/i;->a:Lcom/kubi/payment/util/i;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/kubi/payment/util/i;->k()Ly70/g;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y:Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Ly70/a;->p(Ly70/g;Ljava/lang/String;)Ly70/a;

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

.method public onResume()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/BaseFragment;->onResume()V

    .line 4
    .line 5
    const-string v0, "payment"

    .line 6
    .line 7
    const-string v1, "FastSellFragment onResume"

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y:Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->d0(Ljava/lang/String;)V

    .line 22
    return-void
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

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "view"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1, p2}, Lcom/kubi/payment/base/BasePaymentFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->V3()V

    .line 12
    const/4 p1, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->g4(Z)V

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
.end method

.method public p3()V
    .locals 15

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-object v1, v0, Lft/n1;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    const/16 v2, 0x8

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setFlags(I)V

    .line 19
    .line 20
    iget-object v1, v0, Lft/n1;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 24
    move-result-object v1

    .line 25
    const/4 v2, 0x1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 29
    .line 30
    iget-object v3, v0, Lft/n1;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 31
    .line 32
    const-string v1, "tvNeedHigherLimits"

    .line 33
    .line 34
    .line 35
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    new-instance v6, Lcom/kubi/payment/fasttrade/sell/n;

    .line 38
    .line 39
    .line 40
    invoke-direct {v6}, Lcom/kubi/payment/fasttrade/sell/n;-><init>()V

    .line 41
    const/4 v7, 0x1

    .line 42
    const/4 v8, 0x0

    .line 43
    .line 44
    const-wide/16 v4, 0x0

    .line 45
    .line 46
    .line 47
    invoke-static/range {v3 .. v8}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 48
    .line 49
    iget-object v1, v0, Lft/n1;->j:Lcom/kubi/payment/fasttrade/widget/FastTradeInputView;

    .line 50
    .line 51
    const-string v2, "SELL"

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Lcom/kubi/payment/fasttrade/widget/FastTradeInputView;->setTradeType(Ljava/lang/String;)V

    .line 55
    .line 56
    iget-object v2, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Z:Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v2}, Lcom/kubi/payment/fasttrade/widget/FastTradeInputView;->setQuoteType(Ljava/lang/String;)V

    .line 60
    .line 61
    new-instance v2, Lcom/kubi/payment/fasttrade/sell/FastSellFragment$a;

    .line 62
    .line 63
    .line 64
    invoke-direct {v2, p0, v1}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment$a;-><init>(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Lcom/kubi/payment/fasttrade/widget/FastTradeInputView;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v2}, Lcom/kubi/payment/fasttrade/widget/FastTradeInputView;->setFastInputListener(Lcom/kubi/payment/fasttrade/widget/FastTradeInputView$a;)V

    .line 68
    .line 69
    iget-object v1, v0, Lft/n1;->j:Lcom/kubi/payment/fasttrade/widget/FastTradeInputView;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Lcom/kubi/payment/fasttrade/widget/FastTradeInputView;->j()Lcom/kubi/payment/fasttrade/widget/FastTradeTextView;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    if-eqz v1, :cond_1

    .line 76
    .line 77
    iget-object v2, v0, Lft/n1;->h:Lcom/kubi/payment/widget/NumberKeyboardView;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v1}, Lcom/kubi/payment/widget/NumberKeyboardView;->addListener(Lcom/kubi/payment/widget/NumberKeyboardView$a;)V

    .line 81
    .line 82
    new-instance v2, Lcom/kubi/payment/fasttrade/sell/FastSellFragment$b;

    .line 83
    .line 84
    .line 85
    invoke-direct {v2, p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment$b;-><init>(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v2}, Lcom/kubi/payment/fasttrade/widget/FastTradeTextView;->registerListener(Lcom/kubi/payment/fasttrade/widget/FastTradeTextView$a;)V

    .line 89
    .line 90
    :cond_1
    iget-object v3, v0, Lft/n1;->i:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 91
    .line 92
    const-string v1, "layoutCryptoCurrency"

    .line 93
    .line 94
    .line 95
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    new-instance v6, Lcom/kubi/payment/fasttrade/sell/o;

    .line 98
    .line 99
    .line 100
    invoke-direct {v6, p0}, Lcom/kubi/payment/fasttrade/sell/o;-><init>(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)V

    .line 101
    const/4 v7, 0x1

    .line 102
    const/4 v8, 0x0

    .line 103
    .line 104
    const-wide/16 v4, 0x0

    .line 105
    .line 106
    .line 107
    invoke-static/range {v3 .. v8}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 108
    .line 109
    iget-object v9, v0, Lft/n1;->l:Lcom/kubi/resources/widget/DashTextView;

    .line 110
    .line 111
    const-string v1, "tvAvailable"

    .line 112
    .line 113
    .line 114
    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    new-instance v12, Lcom/kubi/payment/fasttrade/sell/p;

    .line 117
    .line 118
    .line 119
    invoke-direct {v12, p0}, Lcom/kubi/payment/fasttrade/sell/p;-><init>(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)V

    .line 120
    const/4 v13, 0x1

    .line 121
    const/4 v14, 0x0

    .line 122
    .line 123
    const-wide/16 v10, 0x0

    .line 124
    .line 125
    .line 126
    invoke-static/range {v9 .. v14}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 127
    .line 128
    iget-object v1, v0, Lft/n1;->k:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 129
    .line 130
    const-string v2, "layoutPaymentMethod"

    .line 131
    .line 132
    .line 133
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    new-instance v4, Lcom/kubi/payment/fasttrade/sell/q;

    .line 136
    .line 137
    .line 138
    invoke-direct {v4, p0}, Lcom/kubi/payment/fasttrade/sell/q;-><init>(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)V

    .line 139
    const/4 v5, 0x1

    .line 140
    const/4 v6, 0x0

    .line 141
    .line 142
    const-wide/16 v2, 0x0

    .line 143
    .line 144
    .line 145
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 146
    .line 147
    iget-object v7, v0, Lft/n1;->p:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 148
    .line 149
    const-string v1, "tvConfirm"

    .line 150
    .line 151
    .line 152
    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    .line 154
    new-instance v10, Lcom/kubi/payment/fasttrade/sell/g;

    .line 155
    .line 156
    .line 157
    invoke-direct {v10, p0, v0}, Lcom/kubi/payment/fasttrade/sell/g;-><init>(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;Lft/n1;)V

    .line 158
    const/4 v11, 0x1

    .line 159
    const/4 v12, 0x0

    .line 160
    .line 161
    const-wide/16 v8, 0x0

    .line 162
    .line 163
    .line 164
    invoke-static/range {v7 .. v12}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 165
    return-void
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
.end method

.method public final p4(Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;)V
    .locals 3

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->d0:Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;

    .line 3
    .line 4
    if-nez p1, :cond_2

    .line 5
    const/4 p1, 0x0

    .line 6
    .line 7
    iput-boolean p1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->a0:Z

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, Lft/n1;->f:Landroidx/appcompat/widget/AppCompatImageView;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget v1, Lcom/kubi/otc/R$drawable;->ic2_fund_account_24:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->n3()Landroid/content/Context;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    sget v2, Lcom/kubi/otc/R$color;->c_text40:I

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    iget-object v0, v0, Lft/n1;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    sget v1, Lcom/kubi/otc/R$string;->payment_fast_sell_seect_method:I

    .line 48
    .line 49
    new-array p1, p1, [Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v1, p1}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    if-eqz p1, :cond_b

    .line 63
    .line 64
    iget-object p1, p1, Lft/n1;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 65
    .line 66
    if-eqz p1, :cond_b

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->n3()Landroid/content/Context;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    sget v1, Lcom/kubi/otc/R$color;->c_text40:I

    .line 73
    .line 74
    .line 75
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 76
    move-result v0

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 80
    .line 81
    goto/16 :goto_2

    .line 82
    .line 83
    .line 84
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    check-cast p1, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 88
    .line 89
    iget-object v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->d0:Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v0}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->Y(Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;)Z

    .line 93
    move-result p1

    .line 94
    .line 95
    iput-boolean p1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->a0:Z

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 99
    move-result-object p1

    .line 100
    const/4 v0, 0x0

    .line 101
    .line 102
    if-eqz p1, :cond_4

    .line 103
    .line 104
    iget-object p1, p1, Lft/n1;->f:Landroidx/appcompat/widget/AppCompatImageView;

    .line 105
    .line 106
    if-eqz p1, :cond_4

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->n3()Landroid/content/Context;

    .line 110
    move-result-object v1

    .line 111
    .line 112
    iget-object v2, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->d0:Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;

    .line 113
    .line 114
    if-eqz v2, :cond_3

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getIconUrl()Ljava/lang/String;

    .line 118
    move-result-object v2

    .line 119
    goto :goto_0

    .line 120
    :cond_3
    move-object v2, v0

    .line 121
    .line 122
    .line 123
    :goto_0
    invoke-static {v1, v2, p1}, Lcom/kubi/sdk/util/v;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 127
    .line 128
    .line 129
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 130
    move-result-object p1

    .line 131
    .line 132
    if-eqz p1, :cond_6

    .line 133
    .line 134
    iget-object p1, p1, Lft/n1;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 135
    .line 136
    if-eqz p1, :cond_6

    .line 137
    .line 138
    iget-object v1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->d0:Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;

    .line 139
    .line 140
    if-eqz v1, :cond_5

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getPaymentMethodName()Ljava/lang/String;

    .line 144
    move-result-object v1

    .line 145
    goto :goto_1

    .line 146
    :cond_5
    move-object v1, v0

    .line 147
    .line 148
    .line 149
    :goto_1
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 150
    .line 151
    .line 152
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 153
    move-result-object p1

    .line 154
    .line 155
    if-eqz p1, :cond_7

    .line 156
    .line 157
    iget-object p1, p1, Lft/n1;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 158
    .line 159
    if-eqz p1, :cond_7

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->n3()Landroid/content/Context;

    .line 163
    move-result-object v1

    .line 164
    .line 165
    sget v2, Lcom/kubi/otc/R$color;->c_text:I

    .line 166
    .line 167
    .line 168
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 169
    move-result v1

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 173
    .line 174
    :cond_7
    iget-object p1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->d0:Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;

    .line 175
    .line 176
    if-eqz p1, :cond_8

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getTag()Ljava/lang/String;

    .line 180
    move-result-object v0

    .line 181
    .line 182
    .line 183
    :cond_8
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 184
    move-result-object p1

    .line 185
    .line 186
    .line 187
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 188
    move-result v0

    .line 189
    .line 190
    if-nez v0, :cond_9

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 194
    move-result-object p1

    .line 195
    .line 196
    if-eqz p1, :cond_b

    .line 197
    .line 198
    iget-object p1, p1, Lft/n1;->v:Lcom/kubi/resources/widget/BaseTextView;

    .line 199
    .line 200
    if-eqz p1, :cond_b

    .line 201
    .line 202
    .line 203
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 204
    goto :goto_2

    .line 205
    .line 206
    .line 207
    :cond_9
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 208
    move-result-object v0

    .line 209
    .line 210
    if-eqz v0, :cond_a

    .line 211
    .line 212
    iget-object v0, v0, Lft/n1;->v:Lcom/kubi/resources/widget/BaseTextView;

    .line 213
    .line 214
    if-eqz v0, :cond_a

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 218
    .line 219
    .line 220
    :cond_a
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 221
    move-result-object p1

    .line 222
    .line 223
    if-eqz p1, :cond_b

    .line 224
    .line 225
    iget-object p1, p1, Lft/n1;->v:Lcom/kubi/resources/widget/BaseTextView;

    .line 226
    .line 227
    if-eqz p1, :cond_b

    .line 228
    .line 229
    .line 230
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 231
    .line 232
    .line 233
    :cond_b
    :goto_2
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->t4()V

    .line 234
    .line 235
    .line 236
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->X3()V

    .line 237
    return-void
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

.method public q3()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/otc/R$layout;->payment_fragment_fast_sell:I

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

.method public r3()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->r3()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->e0:Lcom/kubi/payment/fasttrade/FastTradeVM;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/payment/fasttrade/FastTradeVM;->z()Landroidx/lifecycle/LiveData;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    new-instance v2, Lcom/kubi/payment/fasttrade/sell/f;

    .line 20
    .line 21
    .line 22
    invoke-direct {v2, p0}, Lcom/kubi/payment/fasttrade/sell/f;-><init>(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)V

    .line 23
    .line 24
    new-instance v3, Lcom/kubi/payment/fasttrade/sell/FastSellFragment$c;

    .line 25
    .line 26
    .line 27
    invoke-direct {v3, v2}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    check-cast v0, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->V()Landroidx/lifecycle/LiveData;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    new-instance v2, Lcom/kubi/payment/fasttrade/sell/i;

    .line 47
    .line 48
    .line 49
    invoke-direct {v2, p0}, Lcom/kubi/payment/fasttrade/sell/i;-><init>(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)V

    .line 50
    .line 51
    new-instance v3, Lcom/kubi/payment/fasttrade/sell/FastSellFragment$c;

    .line 52
    .line 53
    .line 54
    invoke-direct {v3, v2}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    check-cast v0, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->R()Landroidx/lifecycle/LiveData;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    new-instance v2, Lcom/kubi/payment/fasttrade/sell/j;

    .line 74
    .line 75
    .line 76
    invoke-direct {v2, p0}, Lcom/kubi/payment/fasttrade/sell/j;-><init>(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)V

    .line 77
    .line 78
    new-instance v3, Lcom/kubi/payment/fasttrade/sell/FastSellFragment$c;

    .line 79
    .line 80
    .line 81
    invoke-direct {v3, v2}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    check-cast v0, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->W()Landroidx/lifecycle/LiveData;

    .line 94
    move-result-object v0

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 98
    move-result-object v1

    .line 99
    .line 100
    new-instance v2, Lcom/kubi/payment/fasttrade/sell/k;

    .line 101
    .line 102
    .line 103
    invoke-direct {v2, p0}, Lcom/kubi/payment/fasttrade/sell/k;-><init>(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)V

    .line 104
    .line 105
    new-instance v3, Lcom/kubi/payment/fasttrade/sell/FastSellFragment$c;

    .line 106
    .line 107
    .line 108
    invoke-direct {v3, v2}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 115
    move-result-object v0

    .line 116
    .line 117
    check-cast v0, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->X()Landroidx/lifecycle/LiveData;

    .line 121
    move-result-object v0

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 125
    move-result-object v1

    .line 126
    .line 127
    new-instance v2, Lcom/kubi/payment/fasttrade/sell/l;

    .line 128
    .line 129
    .line 130
    invoke-direct {v2, p0}, Lcom/kubi/payment/fasttrade/sell/l;-><init>(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)V

    .line 131
    .line 132
    new-instance v3, Lcom/kubi/payment/fasttrade/sell/FastSellFragment$c;

    .line 133
    .line 134
    .line 135
    invoke-direct {v3, v2}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 142
    move-result-object v0

    .line 143
    .line 144
    check-cast v0, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->U()Landroidx/lifecycle/LiveData;

    .line 148
    move-result-object v0

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 152
    move-result-object v1

    .line 153
    .line 154
    new-instance v2, Lcom/kubi/payment/fasttrade/sell/m;

    .line 155
    .line 156
    .line 157
    invoke-direct {v2, p0}, Lcom/kubi/payment/fasttrade/sell/m;-><init>(Lcom/kubi/payment/fasttrade/sell/FastSellFragment;)V

    .line 158
    .line 159
    new-instance v3, Lcom/kubi/payment/fasttrade/sell/FastSellFragment$c;

    .line 160
    .line 161
    .line 162
    invoke-direct {v3, v2}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 166
    return-void
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
.end method

.method public final r4()Lorg/json/JSONObject;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->d0:Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    .line 8
    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 12
    .line 13
    const-string v2, "paymentMethodCode"

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getPaymentMethodCode()Ljava/lang/String;

    .line 17
    move-result-object v3

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 21
    .line 22
    const-string v2, "channelId"

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getChannelId()Ljava/lang/String;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 30
    .line 31
    const-string v2, "pay_fiat_currency"

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getFiatCurrency()Ljava/lang/String;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    .line 40
    const-string v2, "pay_crypto_currency"

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getCryptoCurrency()Ljava/lang/String;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 48
    return-object v1
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
.end method

.method public final s4()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->d0:Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->g4(Z)V

    .line 9
    return-void

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    check-cast v0, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    const-string v2, "getChildFragmentManager(...)"

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->g0(Landroidx/fragment/app/FragmentManager;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    check-cast v0, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 34
    .line 35
    iget-object v1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->d0:Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->Y(Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;)Z

    .line 39
    move-result v0

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    const-string v0, "newCard"

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :cond_1
    const-string v0, "preview"

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->r4()Lorg/json/JSONObject;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    const-string v2, "B7FastSell"

    .line 53
    .line 54
    const-string v3, "button"

    .line 55
    .line 56
    .line 57
    invoke-static {v2, v3, v0, v1}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 58
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
.end method

.method public final t4()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, v0, Lft/n1;->m:Lcom/kubi/resources/widget/BaseTextView;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    sget v1, Lcom/kubi/otc/R$string;->payment_price:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    check-cast v2, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->N()Ljava/lang/String;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    check-cast v3, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->R()Landroidx/lifecycle/LiveData;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    check-cast v3, Lcom/kubi/payment/fast/data/entities/Balance$Response;

    .line 39
    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Lcom/kubi/payment/fast/data/entities/Balance$Response;->getCurrency()Ljava/lang/String;

    .line 44
    move-result-object v3

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 v3, 0x0

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    move-result-object v3

    .line 51
    .line 52
    .line 53
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 54
    move-result-object v2

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v1, v2}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    :cond_1
    return-void
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
.end method

.method public final u4()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->U3()Ljava/lang/String;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->Z(Ljava/lang/String;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    if-eqz v0, :cond_8

    .line 23
    .line 24
    iget-object v0, v0, Lft/n1;->n:Lcom/kubi/resources/widget/BaseTextView;

    .line 25
    .line 26
    if-eqz v0, :cond_8

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 30
    return-void

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    check-cast v0, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 37
    .line 38
    .line 39
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->U3()Ljava/lang/String;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    iget-object v2, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Z:Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->c0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 46
    move-result v0

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    const/4 v0, 0x0

    .line 50
    .line 51
    iput-boolean v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->b0:Z

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    if-eqz v0, :cond_8

    .line 58
    .line 59
    iget-object v0, v0, Lft/n1;->n:Lcom/kubi/resources/widget/BaseTextView;

    .line 60
    .line 61
    if-eqz v0, :cond_8

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 65
    return-void

    .line 66
    :cond_1
    const/4 v0, 0x1

    .line 67
    .line 68
    iput-boolean v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->b0:Z

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 72
    move-result-object v0

    .line 73
    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    iget-object v0, v0, Lft/n1;->n:Lcom/kubi/resources/widget/BaseTextView;

    .line 77
    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    sget v1, Lcom/kubi/otc/R$string;->payment_available_balance_tip:I

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 84
    move-result-object v2

    .line 85
    .line 86
    check-cast v2, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->N()Ljava/lang/String;

    .line 90
    move-result-object v2

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 94
    move-result-object v3

    .line 95
    .line 96
    check-cast v3, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->R()Landroidx/lifecycle/LiveData;

    .line 100
    move-result-object v3

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 104
    move-result-object v3

    .line 105
    .line 106
    check-cast v3, Lcom/kubi/payment/fast/data/entities/Balance$Response;

    .line 107
    .line 108
    if-eqz v3, :cond_2

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3}, Lcom/kubi/payment/fast/data/entities/Balance$Response;->getCurrency()Ljava/lang/String;

    .line 112
    move-result-object v3

    .line 113
    goto :goto_0

    .line 114
    :cond_2
    const/4 v3, 0x0

    .line 115
    .line 116
    .line 117
    :goto_0
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    move-result-object v3

    .line 119
    .line 120
    .line 121
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 122
    move-result-object v2

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, v1, v2}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 126
    move-result-object v1

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 130
    .line 131
    .line 132
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 133
    move-result-object v0

    .line 134
    .line 135
    if-eqz v0, :cond_4

    .line 136
    .line 137
    iget-object v0, v0, Lft/n1;->n:Lcom/kubi/resources/widget/BaseTextView;

    .line 138
    .line 139
    if-eqz v0, :cond_4

    .line 140
    .line 141
    sget v1, Lcom/kubi/otc/R$color;->brandRed:I

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, v1}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 145
    move-result v1

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 149
    .line 150
    .line 151
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 152
    move-result-object v0

    .line 153
    .line 154
    if-eqz v0, :cond_5

    .line 155
    .line 156
    iget-object v0, v0, Lft/n1;->n:Lcom/kubi/resources/widget/BaseTextView;

    .line 157
    .line 158
    if-eqz v0, :cond_5

    .line 159
    .line 160
    .line 161
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 162
    .line 163
    .line 164
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 165
    move-result-object v0

    .line 166
    .line 167
    if-eqz v0, :cond_6

    .line 168
    .line 169
    iget-object v0, v0, Lft/n1;->r:Lcom/kubi/resources/widget/BaseTextView;

    .line 170
    .line 171
    if-eqz v0, :cond_6

    .line 172
    .line 173
    .line 174
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 175
    .line 176
    .line 177
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 178
    move-result-object v0

    .line 179
    .line 180
    if-eqz v0, :cond_7

    .line 181
    .line 182
    iget-object v0, v0, Lft/n1;->s:Lcom/kubi/resources/widget/BaseTextView;

    .line 183
    .line 184
    if-eqz v0, :cond_7

    .line 185
    .line 186
    .line 187
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 188
    .line 189
    .line 190
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 191
    move-result-object v0

    .line 192
    .line 193
    if-eqz v0, :cond_8

    .line 194
    .line 195
    iget-object v0, v0, Lft/n1;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 196
    .line 197
    if-eqz v0, :cond_8

    .line 198
    .line 199
    .line 200
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 201
    :cond_8
    return-void
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
.end method

.method public final v4()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-object v0, v0, Lft/n1;->p:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    check-cast v1, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->U3()Ljava/lang/String;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->Z(Ljava/lang/String;)Z

    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x0

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    sget v1, Lcom/kubi/otc/R$string;->payment_fast_sell_max_amount:I

    .line 31
    .line 32
    new-array v2, v2, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v1, v2}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    const/4 v1, 0x1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 44
    return-void

    .line 45
    .line 46
    :cond_1
    iget-boolean v1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->a0:Z

    .line 47
    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    sget v1, Lcom/kubi/otc/R$string;->payment_fast_sell_add_new_card:I

    .line 51
    .line 52
    new-array v2, v2, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v1, v2}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->W3()Z

    .line 63
    move-result v1

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 67
    return-void

    .line 68
    .line 69
    :cond_2
    sget v1, Lcom/kubi/otc/R$string;->payment_fast_sell_preview_order:I

    .line 70
    .line 71
    new-array v2, v2, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v1, v2}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 75
    move-result-object v1

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->W3()Z

    .line 82
    move-result v1

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 86
    :cond_3
    :goto_0
    return-void
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
.end method

.method public final w4()V
    .locals 13

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->d0:Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_8

    .line 11
    .line 12
    iget-object v0, v0, Lft/n1;->r:Lcom/kubi/resources/widget/BaseTextView;

    .line 13
    .line 14
    if-eqz v0, :cond_8

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 18
    return-void

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->U3()Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    check-cast v1, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->Z(Ljava/lang/String;)Z

    .line 32
    move-result v1

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    if-eqz v0, :cond_8

    .line 41
    .line 42
    iget-object v0, v0, Lft/n1;->r:Lcom/kubi/resources/widget/BaseTextView;

    .line 43
    .line 44
    if-eqz v0, :cond_8

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 48
    return-void

    .line 49
    .line 50
    :cond_1
    iget-boolean v1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->c0:Z

    .line 51
    .line 52
    if-nez v1, :cond_7

    .line 53
    .line 54
    iget-boolean v1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->b0:Z

    .line 55
    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    goto/16 :goto_1

    .line 59
    .line 60
    .line 61
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    check-cast v1, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 65
    .line 66
    iget-object v2, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Z:Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v0, v2}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->O(Ljava/lang/String;Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 70
    move-result-object v3

    .line 71
    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    const-string v1, "refreshEstimated estimatedAmount:"

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    move-result-object v0

    .line 88
    .line 89
    const-string v1, "payment"

    .line 90
    .line 91
    .line 92
    invoke-static {v1, v0}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    iget-object v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Z:Ljava/lang/String;

    .line 95
    .line 96
    const-string v1, "FIAT"

    .line 97
    .line 98
    .line 99
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    move-result v0

    .line 101
    const/4 v1, 0x0

    .line 102
    .line 103
    if-eqz v0, :cond_4

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 107
    move-result-object v0

    .line 108
    .line 109
    if-eqz v0, :cond_6

    .line 110
    .line 111
    iget-object v0, v0, Lft/n1;->r:Lcom/kubi/resources/widget/BaseTextView;

    .line 112
    .line 113
    if-eqz v0, :cond_6

    .line 114
    .line 115
    sget v2, Lcom/kubi/otc/R$string;->payment_fast_sell_about:I

    .line 116
    .line 117
    if-eqz v3, :cond_3

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 121
    move-result-object v1

    .line 122
    .line 123
    check-cast v1, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 124
    .line 125
    iget-object v4, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y:Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v4}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->L(Ljava/lang/String;)I

    .line 129
    move-result v5

    .line 130
    .line 131
    const/16 v11, 0x7d

    .line 132
    const/4 v12, 0x0

    .line 133
    const/4 v4, 0x0

    .line 134
    const/4 v6, 0x0

    .line 135
    const/4 v7, 0x0

    .line 136
    const/4 v8, 0x0

    .line 137
    const/4 v9, 0x0

    .line 138
    const/4 v10, 0x0

    .line 139
    .line 140
    .line 141
    invoke-static/range {v3 .. v12}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 142
    move-result-object v1

    .line 143
    .line 144
    .line 145
    :cond_3
    invoke-static {v1}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 146
    move-result-object v1

    .line 147
    .line 148
    iget-object v3, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y:Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    filled-new-array {v1, v3}, [Ljava/lang/Object;

    .line 152
    move-result-object v1

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, v2, v1}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    move-result-object v1

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 160
    goto :goto_0

    .line 161
    .line 162
    .line 163
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 164
    move-result-object v0

    .line 165
    .line 166
    if-eqz v0, :cond_6

    .line 167
    .line 168
    iget-object v0, v0, Lft/n1;->r:Lcom/kubi/resources/widget/BaseTextView;

    .line 169
    .line 170
    if-eqz v0, :cond_6

    .line 171
    .line 172
    sget v2, Lcom/kubi/otc/R$string;->payment_fast_sell_about:I

    .line 173
    .line 174
    if-eqz v3, :cond_5

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 178
    move-result-object v1

    .line 179
    .line 180
    check-cast v1, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 181
    .line 182
    iget-object v4, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->X:Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1, v4}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->P(Ljava/lang/String;)I

    .line 186
    move-result v5

    .line 187
    .line 188
    const/16 v11, 0x7d

    .line 189
    const/4 v12, 0x0

    .line 190
    const/4 v4, 0x0

    .line 191
    const/4 v6, 0x0

    .line 192
    const/4 v7, 0x0

    .line 193
    const/4 v8, 0x0

    .line 194
    const/4 v9, 0x0

    .line 195
    const/4 v10, 0x0

    .line 196
    .line 197
    .line 198
    invoke-static/range {v3 .. v12}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 199
    move-result-object v1

    .line 200
    .line 201
    .line 202
    :cond_5
    invoke-static {v1}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 203
    move-result-object v1

    .line 204
    .line 205
    iget-object v3, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->X:Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    filled-new-array {v1, v3}, [Ljava/lang/Object;

    .line 209
    move-result-object v1

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0, v2, v1}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 213
    move-result-object v1

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 217
    .line 218
    .line 219
    :cond_6
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 220
    move-result-object v0

    .line 221
    .line 222
    if-eqz v0, :cond_8

    .line 223
    .line 224
    iget-object v0, v0, Lft/n1;->r:Lcom/kubi/resources/widget/BaseTextView;

    .line 225
    .line 226
    if-eqz v0, :cond_8

    .line 227
    .line 228
    .line 229
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 230
    return-void

    .line 231
    .line 232
    .line 233
    :cond_7
    :goto_1
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 234
    move-result-object v0

    .line 235
    .line 236
    if-eqz v0, :cond_8

    .line 237
    .line 238
    iget-object v0, v0, Lft/n1;->r:Lcom/kubi/resources/widget/BaseTextView;

    .line 239
    .line 240
    if-eqz v0, :cond_8

    .line 241
    .line 242
    .line 243
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 244
    :cond_8
    return-void
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
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
.end method

.method public final x4()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->d0:Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, Lft/n1;->s:Lcom/kubi/resources/widget/BaseTextView;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    if-eqz v0, :cond_a

    .line 24
    .line 25
    iget-object v0, v0, Lft/n1;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 26
    .line 27
    if-eqz v0, :cond_a

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 31
    return-void

    .line 32
    .line 33
    :cond_1
    iget-boolean v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->b0:Z

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-object v0, v0, Lft/n1;->s:Lcom/kubi/resources/widget/BaseTextView;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    if-eqz v0, :cond_a

    .line 55
    .line 56
    iget-object v0, v0, Lft/n1;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 57
    .line 58
    if-eqz v0, :cond_a

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 62
    return-void

    .line 63
    .line 64
    .line 65
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    check-cast v0, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 69
    .line 70
    .line 71
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->U3()Ljava/lang/String;

    .line 72
    move-result-object v1

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->Z(Ljava/lang/String;)Z

    .line 76
    move-result v0

    .line 77
    const/4 v1, 0x1

    .line 78
    .line 79
    if-eqz v0, :cond_8

    .line 80
    .line 81
    iput-boolean v1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->c0:Z

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    iget-object v0, v0, Lft/n1;->s:Lcom/kubi/resources/widget/BaseTextView;

    .line 90
    .line 91
    if-eqz v0, :cond_4

    .line 92
    .line 93
    sget v1, Lcom/kubi/otc/R$color;->c_text40:I

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v1}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 97
    move-result v1

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 101
    .line 102
    .line 103
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 104
    move-result-object v0

    .line 105
    .line 106
    if-eqz v0, :cond_5

    .line 107
    .line 108
    iget-object v0, v0, Lft/n1;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 109
    .line 110
    if-eqz v0, :cond_5

    .line 111
    .line 112
    sget v1, Lcom/kubi/otc/R$color;->c_text40:I

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v1}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 116
    move-result v1

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 120
    .line 121
    .line 122
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 123
    move-result-object v0

    .line 124
    .line 125
    if-eqz v0, :cond_6

    .line 126
    .line 127
    iget-object v0, v0, Lft/n1;->s:Lcom/kubi/resources/widget/BaseTextView;

    .line 128
    .line 129
    if-eqz v0, :cond_6

    .line 130
    .line 131
    .line 132
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 133
    .line 134
    .line 135
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 136
    move-result-object v0

    .line 137
    .line 138
    if-eqz v0, :cond_7

    .line 139
    .line 140
    iget-object v0, v0, Lft/n1;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 141
    .line 142
    if-eqz v0, :cond_7

    .line 143
    .line 144
    .line 145
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 146
    .line 147
    .line 148
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->y4()V

    .line 149
    return-void

    .line 150
    .line 151
    .line 152
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 153
    move-result-object v0

    .line 154
    .line 155
    check-cast v0, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 156
    .line 157
    .line 158
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->U3()Ljava/lang/String;

    .line 159
    move-result-object v2

    .line 160
    .line 161
    iget-object v3, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Z:Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v2, v3}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->b0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 165
    move-result v0

    .line 166
    .line 167
    if-eqz v0, :cond_b

    .line 168
    const/4 v0, 0x0

    .line 169
    .line 170
    iput-boolean v0, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->c0:Z

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 174
    move-result-object v0

    .line 175
    .line 176
    if-eqz v0, :cond_9

    .line 177
    .line 178
    iget-object v0, v0, Lft/n1;->s:Lcom/kubi/resources/widget/BaseTextView;

    .line 179
    .line 180
    if-eqz v0, :cond_9

    .line 181
    .line 182
    .line 183
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 184
    .line 185
    .line 186
    :cond_9
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 187
    move-result-object v0

    .line 188
    .line 189
    if-eqz v0, :cond_a

    .line 190
    .line 191
    iget-object v0, v0, Lft/n1;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 192
    .line 193
    if-eqz v0, :cond_a

    .line 194
    .line 195
    .line 196
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 197
    :cond_a
    return-void

    .line 198
    .line 199
    :cond_b
    iput-boolean v1, p0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->c0:Z

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 203
    move-result-object v0

    .line 204
    .line 205
    if-eqz v0, :cond_c

    .line 206
    .line 207
    iget-object v0, v0, Lft/n1;->s:Lcom/kubi/resources/widget/BaseTextView;

    .line 208
    .line 209
    if-eqz v0, :cond_c

    .line 210
    .line 211
    sget v1, Lcom/kubi/otc/R$color;->brandRed:I

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0, v1}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 215
    move-result v1

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 219
    .line 220
    .line 221
    :cond_c
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 222
    move-result-object v0

    .line 223
    .line 224
    if-eqz v0, :cond_d

    .line 225
    .line 226
    iget-object v0, v0, Lft/n1;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 227
    .line 228
    if-eqz v0, :cond_d

    .line 229
    .line 230
    sget v1, Lcom/kubi/otc/R$color;->brandRed:I

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0, v1}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 234
    move-result v1

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 238
    .line 239
    .line 240
    :cond_d
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 241
    move-result-object v0

    .line 242
    .line 243
    if-eqz v0, :cond_e

    .line 244
    .line 245
    iget-object v0, v0, Lft/n1;->s:Lcom/kubi/resources/widget/BaseTextView;

    .line 246
    .line 247
    if-eqz v0, :cond_e

    .line 248
    .line 249
    .line 250
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 251
    .line 252
    .line 253
    :cond_e
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 254
    move-result-object v0

    .line 255
    .line 256
    if-eqz v0, :cond_f

    .line 257
    .line 258
    iget-object v0, v0, Lft/n1;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 259
    .line 260
    if-eqz v0, :cond_f

    .line 261
    .line 262
    .line 263
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 264
    .line 265
    .line 266
    :cond_f
    invoke-virtual {p0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->y4()V

    .line 267
    return-void
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
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
.end method

.method public final y4()V
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Z:Ljava/lang/String;

    .line 5
    .line 6
    const-string v2, "FIAT"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    if-eqz v1, :cond_6

    .line 15
    .line 16
    iget-object v1, v0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->d0:Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getFiatMinAmount()Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v1, v3

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    iget-object v4, v0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->d0:Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;

    .line 31
    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getFiatMaxAmount()Ljava/lang/String;

    .line 36
    move-result-object v4

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move-object v4, v3

    .line 39
    .line 40
    .line 41
    :goto_1
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    move-result-object v4

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 46
    move-result-object v5

    .line 47
    .line 48
    if-eqz v5, :cond_2

    .line 49
    .line 50
    iget-object v5, v5, Lft/n1;->s:Lcom/kubi/resources/widget/BaseTextView;

    .line 51
    .line 52
    if-eqz v5, :cond_2

    .line 53
    .line 54
    sget v6, Lcom/kubi/otc/R$string;->payment_limit_tip:I

    .line 55
    .line 56
    .line 57
    invoke-static {v1, v3, v2, v3}, Lcom/kubi/utils/extensions/DowngradeExKt;->e(Ljava/lang/String;Ljava/math/BigDecimal;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 58
    move-result-object v7

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 62
    move-result-object v8

    .line 63
    .line 64
    check-cast v8, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 65
    .line 66
    iget-object v9, v0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->X:Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v8, v9}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->P(Ljava/lang/String;)I

    .line 70
    move-result v9

    .line 71
    .line 72
    const/16 v15, 0x7d

    .line 73
    .line 74
    const/16 v16, 0x0

    .line 75
    const/4 v8, 0x0

    .line 76
    const/4 v10, 0x0

    .line 77
    const/4 v11, 0x0

    .line 78
    const/4 v12, 0x0

    .line 79
    const/4 v13, 0x0

    .line 80
    const/4 v14, 0x0

    .line 81
    .line 82
    .line 83
    invoke-static/range {v7 .. v16}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 84
    move-result-object v7

    .line 85
    .line 86
    .line 87
    invoke-static {v7}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    move-result-object v7

    .line 89
    .line 90
    .line 91
    invoke-static {v4, v3, v2, v3}, Lcom/kubi/utils/extensions/DowngradeExKt;->e(Ljava/lang/String;Ljava/math/BigDecimal;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 92
    move-result-object v8

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 96
    move-result-object v2

    .line 97
    .line 98
    check-cast v2, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 99
    .line 100
    iget-object v3, v0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->X:Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v3}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->P(Ljava/lang/String;)I

    .line 104
    move-result v10

    .line 105
    .line 106
    const/16 v16, 0x7d

    .line 107
    .line 108
    const/16 v17, 0x0

    .line 109
    const/4 v9, 0x0

    .line 110
    const/4 v14, 0x0

    .line 111
    const/4 v15, 0x0

    .line 112
    .line 113
    .line 114
    invoke-static/range {v8 .. v17}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 115
    move-result-object v2

    .line 116
    .line 117
    .line 118
    invoke-static {v2}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    move-result-object v2

    .line 120
    .line 121
    iget-object v3, v0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->X:Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    filled-new-array {v7, v2, v3}, [Ljava/lang/Object;

    .line 125
    move-result-object v2

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v6, v2}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 129
    move-result-object v2

    .line 130
    .line 131
    .line 132
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 133
    .line 134
    .line 135
    :cond_2
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 136
    move-result v1

    .line 137
    .line 138
    if-nez v1, :cond_3

    .line 139
    goto :goto_2

    .line 140
    .line 141
    .line 142
    :cond_3
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 143
    move-result v1

    .line 144
    .line 145
    if-nez v1, :cond_5

    .line 146
    .line 147
    .line 148
    :goto_2
    invoke-virtual {v0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 149
    move-result-object v1

    .line 150
    .line 151
    if-eqz v1, :cond_4

    .line 152
    .line 153
    iget-object v1, v1, Lft/n1;->s:Lcom/kubi/resources/widget/BaseTextView;

    .line 154
    .line 155
    if-eqz v1, :cond_4

    .line 156
    .line 157
    .line 158
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 159
    .line 160
    .line 161
    :cond_4
    invoke-virtual {v0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 162
    move-result-object v1

    .line 163
    .line 164
    if-eqz v1, :cond_c

    .line 165
    .line 166
    iget-object v1, v1, Lft/n1;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 167
    .line 168
    if-eqz v1, :cond_c

    .line 169
    .line 170
    .line 171
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 172
    :cond_5
    return-void

    .line 173
    .line 174
    :cond_6
    iget-object v1, v0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->d0:Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;

    .line 175
    .line 176
    if-eqz v1, :cond_7

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getCryptoMinAmount()Ljava/lang/String;

    .line 180
    move-result-object v1

    .line 181
    goto :goto_3

    .line 182
    :cond_7
    move-object v1, v3

    .line 183
    .line 184
    .line 185
    :goto_3
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    move-result-object v1

    .line 187
    .line 188
    iget-object v4, v0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->d0:Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;

    .line 189
    .line 190
    if-eqz v4, :cond_8

    .line 191
    .line 192
    .line 193
    invoke-virtual {v4}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getCryptoMaxAmount()Ljava/lang/String;

    .line 194
    move-result-object v4

    .line 195
    goto :goto_4

    .line 196
    :cond_8
    move-object v4, v3

    .line 197
    .line 198
    .line 199
    :goto_4
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 200
    move-result-object v4

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 204
    move-result-object v5

    .line 205
    .line 206
    if-eqz v5, :cond_9

    .line 207
    .line 208
    iget-object v5, v5, Lft/n1;->s:Lcom/kubi/resources/widget/BaseTextView;

    .line 209
    .line 210
    if-eqz v5, :cond_9

    .line 211
    .line 212
    sget v6, Lcom/kubi/otc/R$string;->payment_limit_tip:I

    .line 213
    .line 214
    .line 215
    invoke-static {v1, v3, v2, v3}, Lcom/kubi/utils/extensions/DowngradeExKt;->e(Ljava/lang/String;Ljava/math/BigDecimal;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 216
    move-result-object v7

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 220
    move-result-object v8

    .line 221
    .line 222
    check-cast v8, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 223
    .line 224
    iget-object v9, v0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y:Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v8, v9}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->L(Ljava/lang/String;)I

    .line 228
    move-result v9

    .line 229
    .line 230
    const/16 v15, 0x7d

    .line 231
    .line 232
    const/16 v16, 0x0

    .line 233
    const/4 v8, 0x0

    .line 234
    const/4 v10, 0x0

    .line 235
    const/4 v11, 0x0

    .line 236
    const/4 v12, 0x0

    .line 237
    const/4 v13, 0x0

    .line 238
    const/4 v14, 0x0

    .line 239
    .line 240
    .line 241
    invoke-static/range {v7 .. v16}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 242
    move-result-object v7

    .line 243
    .line 244
    .line 245
    invoke-static {v7}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 246
    move-result-object v7

    .line 247
    .line 248
    .line 249
    invoke-static {v4, v3, v2, v3}, Lcom/kubi/utils/extensions/DowngradeExKt;->e(Ljava/lang/String;Ljava/math/BigDecimal;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 250
    move-result-object v8

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 254
    move-result-object v2

    .line 255
    .line 256
    check-cast v2, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 257
    .line 258
    iget-object v3, v0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y:Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2, v3}, Lcom/kubi/payment/fasttrade/sell/FastSellVM;->L(Ljava/lang/String;)I

    .line 262
    move-result v10

    .line 263
    .line 264
    const/16 v16, 0x7d

    .line 265
    .line 266
    const/16 v17, 0x0

    .line 267
    const/4 v9, 0x0

    .line 268
    const/4 v14, 0x0

    .line 269
    const/4 v15, 0x0

    .line 270
    .line 271
    .line 272
    invoke-static/range {v8 .. v17}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 273
    move-result-object v2

    .line 274
    .line 275
    .line 276
    invoke-static {v2}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 277
    move-result-object v2

    .line 278
    .line 279
    iget-object v3, v0, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y:Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    filled-new-array {v7, v2, v3}, [Ljava/lang/Object;

    .line 283
    move-result-object v2

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0, v6, v2}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 287
    move-result-object v2

    .line 288
    .line 289
    .line 290
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 291
    .line 292
    .line 293
    :cond_9
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 294
    move-result v1

    .line 295
    .line 296
    if-nez v1, :cond_a

    .line 297
    goto :goto_5

    .line 298
    .line 299
    .line 300
    :cond_a
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 301
    move-result v1

    .line 302
    .line 303
    if-nez v1, :cond_c

    .line 304
    .line 305
    .line 306
    :goto_5
    invoke-virtual {v0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 307
    move-result-object v1

    .line 308
    .line 309
    if-eqz v1, :cond_b

    .line 310
    .line 311
    iget-object v1, v1, Lft/n1;->s:Lcom/kubi/resources/widget/BaseTextView;

    .line 312
    .line 313
    if-eqz v1, :cond_b

    .line 314
    .line 315
    .line 316
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 317
    .line 318
    .line 319
    :cond_b
    invoke-virtual {v0}, Lcom/kubi/payment/fasttrade/sell/FastSellFragment;->Y3()Lft/n1;

    .line 320
    move-result-object v1

    .line 321
    .line 322
    if-eqz v1, :cond_c

    .line 323
    .line 324
    iget-object v1, v1, Lft/n1;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 325
    .line 326
    if-eqz v1, :cond_c

    .line 327
    .line 328
    .line 329
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 330
    :cond_c
    return-void
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
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
.end method

.method public z3()Lkotlin/reflect/KClass;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/reflect/KClass<",
            "Lcom/kubi/payment/fasttrade/sell/FastSellVM;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-class v0, Lcom/kubi/payment/fasttrade/sell/FastSellVM;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
