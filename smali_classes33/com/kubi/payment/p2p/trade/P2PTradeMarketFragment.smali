.class public final Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;
.super Lcom/kubi/payment/p2p/base/BaseP2PFragment;
.source "P2PTradeMarketFragment.kt"

# interfaces
.implements Lcom/kubi/payment/p2p/trade/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/payment/p2p/base/BaseP2PFragment<",
        "Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;",
        ">;",
        "Lcom/kubi/payment/p2p/trade/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010$\n\u0002\u0008\u0006\u0018\u0000 W2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001WB\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u000200H\u0016J\u0008\u00101\u001a\u000202H\u0014J\u0012\u00103\u001a\u0002042\u0008\u00105\u001a\u0004\u0018\u000106H\u0016J\u001a\u00107\u001a\u0002042\u0006\u00108\u001a\u00020\u00182\u0008\u00105\u001a\u0004\u0018\u000106H\u0016J\u0008\u00109\u001a\u000204H\u0016J\u0008\u0010:\u001a\u000204H\u0002J\u0008\u0010;\u001a\u000204H\u0002J\u0008\u0010<\u001a\u000204H\u0002J\u0008\u0010=\u001a\u000204H\u0016J\u0008\u0010>\u001a\u000204H\u0014J\u0008\u0010?\u001a\u000204H\u0002J\u0018\u0010@\u001a\u0002042\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010BH\u0002J\u0008\u0010D\u001a\u000204H\u0002J\u0008\u0010E\u001a\u000204H\u0002J\u0008\u0010F\u001a\u000204H\u0002J\u0008\u0010G\u001a\u000204H\u0002J\u0008\u0010H\u001a\u000204H\u0002J\u0008\u0010I\u001a\u000204H\u0007J\u0008\u0010J\u001a\u000204H\u0002J\u0008\u0010K\u001a\u00020\tH\u0016J\u0008\u0010L\u001a\u00020\tH\u0016J\u0008\u0010M\u001a\u00020\tH\u0016J\u0008\u0010N\u001a\u00020\tH\u0016J\n\u0010O\u001a\u0004\u0018\u00010\u000cH\u0016J\u0012\u0010P\u001a\u0002042\u0008\u0010O\u001a\u0004\u0018\u00010\u000cH\u0016J\u0014\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0RH\u0016J\u0008\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010S\u001a\u0002042\u0006\u0010T\u001a\u00020\u0007H\u0016J\u0008\u0010U\u001a\u000204H\u0002J\u0008\u0010V\u001a\u000204H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001b\u0010\u001cR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u001e\u001a\u0004\u0008!\u0010\"R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008(\u0010\u001e\u001a\u0004\u0008&\u0010\'R\u001d\u0010)\u001a\u0004\u0018\u00010*8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008-\u0010.\u001a\u0004\u0008+\u0010,\u00a8\u0006X"
    }
    d2 = {
        "Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;",
        "Lcom/kubi/payment/p2p/base/BaseP2PFragment;",
        "Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;",
        "Lcom/kubi/payment/p2p/trade/ITradeData;",
        "<init>",
        "()V",
        "isBuy",
        "",
        "fiatCurrencyAmount",
        "",
        "selectPaymentMethodCodes",
        "p2PFilterData",
        "Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;",
        "marketListFragment",
        "Lcom/kubi/payment/p2p/trade/P2PTradeMarketListFragment;",
        "tvCryptoCurrency",
        "Lcom/kubi/payment/widget/RotateTextView;",
        "tvFilterFiatAmount",
        "tvFilterPayMethod",
        "tvFiatCurrency",
        "Landroid/widget/TextView;",
        "ivFilter",
        "Landroid/widget/ImageView;",
        "viewDepend",
        "Landroid/view/View;",
        "cryptoCurrencySelectPopup",
        "Lcom/kubi/payment/p2p/trade/view/P2PCryptoCurrencySelectPopup;",
        "getCryptoCurrencySelectPopup",
        "()Lcom/kubi/payment/p2p/trade/view/P2PCryptoCurrencySelectPopup;",
        "cryptoCurrencySelectPopup$delegate",
        "Lkotlin/Lazy;",
        "fiatCurrencyAmountFilterPopup",
        "Lcom/kubi/payment/p2p/trade/view/P2PFiatCurrencyAmountFilterPopup;",
        "getFiatCurrencyAmountFilterPopup",
        "()Lcom/kubi/payment/p2p/trade/view/P2PFiatCurrencyAmountFilterPopup;",
        "fiatCurrencyAmountFilterPopup$delegate",
        "paymentMethodPopup",
        "Lcom/kubi/payment/p2p/trade/view/P2PPaymentMethodFilterPopup;",
        "getPaymentMethodPopup",
        "()Lcom/kubi/payment/p2p/trade/view/P2PPaymentMethodFilterPopup;",
        "paymentMethodPopup$delegate",
        "vb",
        "Lcom/kubi/otc/databinding/PaymentFragmentP2pTradeMarketBinding;",
        "getVb",
        "()Lcom/kubi/otc/databinding/PaymentFragmentP2pTradeMarketBinding;",
        "vb$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "viewModelClass",
        "Lkotlin/reflect/KClass;",
        "getLayout",
        "",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onViewCreated",
        "view",
        "initViews",
        "onTabChanged",
        "refreshTab",
        "initFindViews",
        "onResume",
        "observeData",
        "resetFilter",
        "refreshBanner",
        "bannerInfoList",
        "",
        "Lcom/kubi/payment/data/entities/BannerInfo$Banner;",
        "initListener",
        "updateFilterView",
        "showSupportCurrencyFiatView",
        "getUserTradeInfoLooper",
        "refreshTradingPair",
        "refreshData",
        "clearAmountText",
        "getFiatCurrency",
        "getCryptoCurrency",
        "getFiatCurrencyAmount",
        "paymentMethodCodes",
        "p2pFilterData",
        "updateP2PFilterData",
        "getPayMethodIcons",
        "",
        "animRemindView",
        "isAnimIn",
        "showFraudDialogIfNeeded",
        "onDestroyView",
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
        "SMAP\nP2PTradeMarketFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 P2PTradeMarketFragment.kt\ncom/kubi/payment/p2p/trade/P2PTradeMarketFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,515:1\n147#2,16:516\n1563#3:532\n1634#3,3:533\n*S KotlinDebug\n*F\n+ 1 P2PTradeMarketFragment.kt\ncom/kubi/payment/p2p/trade/P2PTradeMarketFragment\n*L\n141#1:516,16\n412#1:532\n412#1:533,3\n*E\n"
    }
.end annotation


# static fields
.field public static final k0:Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic l0:[Lkotlin/reflect/KProperty;
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
.field public V:Z

.field public W:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public X:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public Y:Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public Z:Lcom/kubi/payment/p2p/trade/P2PTradeMarketListFragment;

.field public a0:Lcom/kubi/payment/widget/RotateTextView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public b0:Lcom/kubi/payment/widget/RotateTextView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public c0:Lcom/kubi/payment/widget/RotateTextView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public d0:Landroid/widget/TextView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public e0:Landroid/widget/ImageView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public f0:Landroid/view/View;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final g0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j0:Lcom/kubi/sdk/viewbindingdelegate/base/a;
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
    const-string v1, "getVb()Lcom/kubi/otc/databinding/PaymentFragmentP2pTradeMarketBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;

    .line 8
    .line 9
    const-string v4, "vb"

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
    sput-object v1, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->l0:[Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$Companion;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    sput-object v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->k0:Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$Companion;

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
    invoke-direct {p0}, Lcom/kubi/payment/p2p/base/BaseP2PFragment;-><init>()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->V:Z

    .line 7
    .line 8
    const-string v0, ""

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->W:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->X:Ljava/lang/String;

    .line 13
    .line 14
    new-instance v0, Lcom/kubi/payment/p2p/trade/m;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p0}, Lcom/kubi/payment/p2p/trade/m;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    iput-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->g0:Lkotlin/Lazy;

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/payment/p2p/trade/n;

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, p0}, Lcom/kubi/payment/p2p/trade/n;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iput-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->h0:Lkotlin/Lazy;

    .line 35
    .line 36
    new-instance v0, Lcom/kubi/payment/p2p/trade/o;

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, p0}, Lcom/kubi/payment/p2p/trade/o;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    iput-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->i0:Lkotlin/Lazy;

    .line 46
    .line 47
    sget-object v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$special$$inlined$viewBindingFragment$1;->INSTANCE:Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$special$$inlined$viewBindingFragment$1;

    .line 48
    .line 49
    new-instance v1, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$special$$inlined$viewBindingFragment$2;

    .line 50
    .line 51
    .line 52
    invoke-direct {v1, p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$special$$inlined$viewBindingFragment$2;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    iput-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->j0:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 59
    .line 60
    const-string v0, "B7P2P"

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->setPageId(Ljava/lang/String;)V

    .line 64
    return-void
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

.method public static synthetic A3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->p4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;

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

.method public static final A4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    move-result p1

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    iget-object p1, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->c0:Lcom/kubi/payment/widget/RotateTextView;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/kubi/payment/widget/RotateTextView;->e()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->i4()Lgu/r;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    iget-object p0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->f0:Landroid/view/View;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0, p0}, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->q(Landroidx/fragment/app/FragmentActivity;Landroid/view/View;)V

    .line 27
    .line 28
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 29
    return-object p0
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

.method public static synthetic B3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->C4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/util/ArrayList;)V

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

.method public static final B4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    check-cast p1, Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    new-instance v0, Lcom/kubi/payment/p2p/trade/a0;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0}, Lcom/kubi/payment/p2p/trade/a0;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, p1, v0}, Lht/y;->y(Lcom/kubi/sdk/base/ui/g;Ljava/lang/String;Lio/reactivex/functions/Consumer;)V

    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 30
    return-object p0

    .line 31
    .line 32
    :cond_1
    :goto_0
    sget p0, Lcom/kubi/otc/R$string;->pay_otc_un_available_market:I

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, Lcom/kubi/utils/ToastCompat;->C(I)V

    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 38
    return-object p0
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

.method public static synthetic C3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->D4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/util/List;)Lkotlin/Unit;

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

.method public static final C4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/util/ArrayList;)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 3
    .line 4
    sget v1, Lcom/kubi/otc/R$string;->publish_ad:I

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    new-array v2, v2, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1, v2}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    const-class v2, Lcom/kubi/otc/otc/merchant/OtcAdPublishFragment;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    new-instance v3, Lcom/kubi/utils/h;

    .line 20
    .line 21
    .line 22
    invoke-direct {v3}, Lcom/kubi/utils/h;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 26
    move-result-object p0

    .line 27
    .line 28
    check-cast p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->N()Landroidx/lifecycle/LiveData;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 36
    move-result-object p0

    .line 37
    .line 38
    check-cast p0, Ljava/util/List;

    .line 39
    .line 40
    const-string v4, "legals"

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v4, p0}, Lcom/kubi/utils/h;->i(Ljava/lang/String;Ljava/util/List;)Lcom/kubi/utils/h;

    .line 44
    move-result-object p0

    .line 45
    .line 46
    const-string v3, "symbols"

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v3, p1}, Lcom/kubi/utils/h;->f(Ljava/lang/String;Ljava/util/ArrayList;)Lcom/kubi/utils/h;

    .line 50
    move-result-object p0

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/kubi/utils/h;->a()Landroid/os/Bundle;

    .line 54
    move-result-object p0

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v1, v2, p0}, Lcom/kubi/sdk/base/ui/BaseFragmentActivity;->n0(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

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
.end method

.method public static synthetic D3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->A4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/lang/Boolean;)Lkotlin/Unit;

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

.method public static final D4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->K4(Ljava/util/List;)V

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

.method public static synthetic E3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->r4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;

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

.method public static final E4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Lcom/kubi/payment/p2p/data/entities/TradeInfo;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->l4()Lft/v1;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lft/v1;->n:Lcom/kubi/otc/view/OrderRemindView;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lcom/kubi/otc/view/OrderRemindView;->s(Lcom/kubi/payment/p2p/data/entities/TradeInfo;)V

    .line 17
    .line 18
    :cond_0
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

.method public static synthetic F3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->c4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;

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

.method public static final F4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->Z:Lcom/kubi/payment/p2p/trade/P2PTradeMarketListFragment;

    .line 3
    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    const-string p0, "marketListFragment"

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 p0, 0x0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketListFragment;->s5()V

    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    return-object p0
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

.method public static synthetic G3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->e4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/lang/String;)Lkotlin/Unit;

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

.method private final G4()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->O4()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->Y:Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-boolean v1, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->V:Z

    .line 10
    .line 11
    xor-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    const/16 v5, 0xe

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static/range {v0 .. v6}, Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;->copy$default(Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;ZZLjava/lang/String;ZILjava/lang/Object;)Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;

    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    .line 25
    :goto_0
    iput-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->Y:Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->N4()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->P4()V

    .line 32
    .line 33
    iget-boolean v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->V:Z

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    const-string v0, "buy"

    .line 38
    :goto_1
    move-object v2, v0

    .line 39
    goto :goto_2

    .line 40
    .line 41
    :cond_1
    const-string v0, "sell"

    .line 42
    goto :goto_1

    .line 43
    .line 44
    :goto_2
    const/16 v5, 0x8

    .line 45
    const/4 v6, 0x0

    .line 46
    .line 47
    const-string v1, "B7P2P"

    .line 48
    .line 49
    const-string v3, "1"

    .line 50
    const/4 v4, 0x0

    .line 51
    .line 52
    .line 53
    invoke-static/range {v1 .. v6}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 54
    return-void
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

.method public static synthetic H3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->u4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;

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

.method public static final H4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lgu/r;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lgu/r;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 5
    .line 6
    const-string v2, "mContext"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    new-instance v2, Lcom/kubi/payment/p2p/trade/b0;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/trade/b0;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Lgu/r;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    .line 18
    .line 19
    new-instance v1, Lcom/kubi/payment/p2p/trade/c0;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, p0}, Lcom/kubi/payment/p2p/trade/c0;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->p(Lkotlin/jvm/functions/Function0;)V

    .line 26
    return-object v0
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

.method public static synthetic I3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->k4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

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

.method public static final I4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->c0:Lcom/kubi/payment/widget/RotateTextView;

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/payment/widget/RotateTextView;->d()V

    .line 8
    .line 9
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    return-object p0
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

.method public static synthetic J3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->s4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;

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

.method public static final J4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/lang/String;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->X:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->c0:Lcom/kubi/payment/widget/RotateTextView;

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 16
    move-result p1

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    sget p1, Lcom/kubi/otc/R$string;->payment_method:I

    .line 22
    const/4 v1, 0x0

    .line 23
    .line 24
    new-array v1, v1, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1, v1}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    goto :goto_1

    .line 30
    .line 31
    :cond_1
    :goto_0
    const-string p1, ""

    .line 32
    .line 33
    .line 34
    :goto_1
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->N4()V

    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 40
    return-object p0
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

.method public static synthetic K3(Lcom/kubi/payment/data/entities/BannerInfo$Banner;Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->M4(Lcom/kubi/payment/data/entities/BannerInfo$Banner;Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;

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

.method public static synthetic L3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Lio/chad/library/adapter/base/BaseViewHolder;Lmt/u;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->T4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Lio/chad/library/adapter/base/BaseViewHolder;Lmt/u;)V

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

.method public static final L4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/kubi/payment/data/entities/BannerInfo$Banner;I)V
    .locals 7

    .line 1
    .line 2
    const-string p1, "itemView"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget p1, Lcom/kubi/otc/R$id;->tv_title:I

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    check-cast p1, Landroid/widget/TextView;

    .line 14
    .line 15
    sget p4, Lcom/kubi/otc/R$id;->tv_content:I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, p4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    move-result-object p4

    .line 20
    .line 21
    check-cast p4, Landroid/widget/TextView;

    .line 22
    .line 23
    sget v0, Lcom/kubi/otc/R$id;->iv_icon:I

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    check-cast v0, Landroid/widget/ImageView;

    .line 30
    const/4 v1, 0x0

    .line 31
    .line 32
    if-eqz p3, :cond_0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p3}, Lcom/kubi/payment/data/entities/BannerInfo$Banner;->getTitle()Ljava/lang/String;

    .line 36
    move-result-object v2

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object v2, v1

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    .line 47
    if-eqz p3, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p3}, Lcom/kubi/payment/data/entities/BannerInfo$Banner;->getSubtitle()Ljava/lang/String;

    .line 51
    move-result-object p1

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move-object p1, v1

    .line 54
    .line 55
    .line 56
    :goto_1
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    .line 60
    invoke-virtual {p4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 61
    .line 62
    if-eqz p3, :cond_2

    .line 63
    .line 64
    .line 65
    invoke-virtual {p3}, Lcom/kubi/payment/data/entities/BannerInfo$Banner;->getIconUrl()Ljava/lang/String;

    .line 66
    move-result-object p1

    .line 67
    goto :goto_2

    .line 68
    :cond_2
    move-object p1, v1

    .line 69
    .line 70
    .line 71
    :goto_2
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    .line 75
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 76
    move-result p1

    .line 77
    .line 78
    if-nez p1, :cond_3

    .line 79
    .line 80
    .line 81
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 85
    goto :goto_3

    .line 86
    .line 87
    :cond_3
    iget-object p1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    invoke-static {p1}, Lxy/a;->a(Landroid/content/Context;)Lxy/d;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    if-eqz p3, :cond_4

    .line 94
    .line 95
    .line 96
    invoke-virtual {p3}, Lcom/kubi/payment/data/entities/BannerInfo$Banner;->getIconUrl()Ljava/lang/String;

    .line 97
    move-result-object v1

    .line 98
    .line 99
    .line 100
    :cond_4
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    move-result-object p4

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, p4}, Lxy/d;->N(Ljava/lang/String;)Lxy/c;

    .line 105
    move-result-object p1

    .line 106
    .line 107
    new-instance p4, Ll2/f;

    .line 108
    .line 109
    .line 110
    invoke-direct {p4}, Ll2/f;-><init>()V

    .line 111
    .line 112
    sget v1, Lcom/kubi/otc/R$mipmap;->ic_placeholder:I

    .line 113
    .line 114
    .line 115
    invoke-virtual {p4, v1}, Ll2/a;->b0(I)Ll2/a;

    .line 116
    move-result-object p4

    .line 117
    .line 118
    check-cast p4, Ll2/f;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p4, v1}, Ll2/a;->m(I)Ll2/a;

    .line 122
    move-result-object p4

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, p4}, Lxy/c;->R0(Ll2/a;)Lxy/c;

    .line 126
    move-result-object p1

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/g;->E0(Landroid/widget/ImageView;)Lm2/k;

    .line 130
    .line 131
    .line 132
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 136
    .line 137
    :goto_3
    new-instance v4, Lcom/kubi/payment/p2p/trade/g0;

    .line 138
    .line 139
    .line 140
    invoke-direct {v4, p3, p0}, Lcom/kubi/payment/p2p/trade/g0;-><init>(Lcom/kubi/payment/data/entities/BannerInfo$Banner;Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 141
    const/4 v5, 0x1

    .line 142
    const/4 v6, 0x0

    .line 143
    .line 144
    const-wide/16 v2, 0x0

    .line 145
    move-object v1, p2

    .line 146
    .line 147
    .line 148
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 149
    return-void
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
.end method

.method public static synthetic M3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/kubi/payment/data/entities/BannerInfo$Banner;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->L4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/kubi/payment/data/entities/BannerInfo$Banner;I)V

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
.end method

.method public static final M4(Lcom/kubi/payment/data/entities/BannerInfo$Banner;Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/payment/data/entities/BannerInfo$Banner;->getLinkUrl()Ljava/lang/String;

    .line 7
    move-result-object v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v1, v0

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 17
    move-result v2

    .line 18
    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 22
    return-object p0

    .line 23
    .line 24
    :cond_1
    sget-object v2, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v1}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lay/a;->k()Z

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/kubi/sdk/BaseFragment;->getPageId()Ljava/lang/String;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/kubi/payment/data/entities/BannerInfo$Banner;->getId()Ljava/lang/String;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    :cond_2
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    move-result-object p0

    .line 50
    .line 51
    const-string v0, "bannerContent"

    .line 52
    .line 53
    .line 54
    invoke-static {v0, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 55
    move-result-object p0

    .line 56
    .line 57
    const-string v0, "pay_crypto_currency"

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->K2()Ljava/lang/String;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    .line 64
    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    .line 68
    filled-new-array {p0, p1}, [Lkotlin/Pair;

    .line 69
    move-result-object p0

    .line 70
    .line 71
    const-string p1, "p2pBanner"

    .line 72
    .line 73
    const-string v0, "1"

    .line 74
    .line 75
    .line 76
    invoke-static {v1, p1, v0, p0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 79
    return-object p0
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

.method public static synthetic N3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->b4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/lang/String;)Lkotlin/Unit;

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

.method public static synthetic O3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->x4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/lang/String;)Lkotlin/Unit;

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

.method public static synthetic P3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->v4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;

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

.method public static synthetic Q3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->w4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/lang/String;)Lkotlin/Unit;

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

.method public static synthetic R3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->z4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/util/List;)Lkotlin/Unit;

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

.method public static synthetic S3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->F4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/lang/Boolean;)Lkotlin/Unit;

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

.method public static synthetic T3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->o4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;

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

.method public static final T4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Lio/chad/library/adapter/base/BaseViewHolder;Lmt/u;)V
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
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 12
    move-result-object p2

    .line 13
    .line 14
    check-cast p2, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->L()Landroidx/lifecycle/LiveData;

    .line 18
    move-result-object p2

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 22
    move-result-object p2

    .line 23
    .line 24
    .line 25
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    move-result p2

    .line 27
    .line 28
    if-nez p2, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    check-cast p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->d0(Ljava/lang/String;)V

    .line 38
    .line 39
    :cond_0
    const-string p0, "fiat"

    .line 40
    .line 41
    .line 42
    invoke-static {p0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 43
    move-result-object p0

    .line 44
    .line 45
    .line 46
    filled-new-array {p0}, [Lkotlin/Pair;

    .line 47
    move-result-object p0

    .line 48
    .line 49
    const-string p1, "B7P2P"

    .line 50
    .line 51
    const-string p2, "fiatSelector"

    .line 52
    .line 53
    const-string v0, "1"

    .line 54
    .line 55
    .line 56
    invoke-static {p1, p2, v0, p0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 57
    return-void
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

.method public static synthetic U3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->q4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;

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

.method public static synthetic V3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lgu/n;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->d4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lgu/n;

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

.method public static synthetic W3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->B4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/util/List;)Lkotlin/Unit;

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

.method public static synthetic X3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lcom/kubi/payment/p2p/trade/view/P2PCryptoCurrencySelectPopup;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->a4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lcom/kubi/payment/p2p/trade/view/P2PCryptoCurrencySelectPopup;

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

.method public static synthetic Y3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Lcom/kubi/payment/p2p/data/entities/TradeInfo;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->E4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Lcom/kubi/payment/p2p/data/entities/TradeInfo;)Lkotlin/Unit;

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

.method public static final a4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lcom/kubi/payment/p2p/trade/view/P2PCryptoCurrencySelectPopup;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/p2p/trade/view/P2PCryptoCurrencySelectPopup;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 5
    .line 6
    const-string v2, "mContext"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    new-instance v2, Lcom/kubi/payment/p2p/trade/y;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/trade/y;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Lcom/kubi/payment/p2p/trade/view/P2PCryptoCurrencySelectPopup;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    .line 18
    .line 19
    new-instance v1, Lcom/kubi/payment/p2p/trade/z;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, p0}, Lcom/kubi/payment/p2p/trade/z;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->p(Lkotlin/jvm/functions/Function0;)V

    .line 26
    return-object v0
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

.method public static final b4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    check-cast v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->J()Landroidx/lifecycle/LiveData;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 29
    move-result-object p0

    .line 30
    .line 31
    check-cast p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->c0(Ljava/lang/String;)V

    .line 35
    .line 36
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 37
    return-object p0
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

.method public static final c4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->a0:Lcom/kubi/payment/widget/RotateTextView;

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/payment/widget/RotateTextView;->d()V

    .line 8
    .line 9
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    return-object p0
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

.method public static final d4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lgu/n;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lgu/n;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 5
    .line 6
    const-string v2, "mContext"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    new-instance v2, Lcom/kubi/payment/p2p/trade/q;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/trade/q;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Lgu/n;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    .line 18
    .line 19
    new-instance v1, Lcom/kubi/payment/p2p/trade/r;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, p0}, Lcom/kubi/payment/p2p/trade/r;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->p(Lkotlin/jvm/functions/Function0;)V

    .line 26
    return-object v0
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

.method public static final e4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->W:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_3

    .line 14
    .line 15
    iput-object p1, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->W:Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 19
    move-result v0

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->Z3()V

    .line 25
    goto :goto_0

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->b0:Lcom/kubi/payment/widget/RotateTextView;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    :cond_1
    iget-object p1, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->b0:Lcom/kubi/payment/widget/RotateTextView;

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    sget v0, Lcom/kubi/otc/R$color;->c_text:I

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 42
    move-result v0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 46
    .line 47
    .line 48
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->N4()V

    .line 49
    .line 50
    :cond_3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 51
    return-object p0
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

.method public static final f4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->b0:Lcom/kubi/payment/widget/RotateTextView;

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/payment/widget/RotateTextView;->d()V

    .line 8
    .line 9
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    return-object p0
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

.method public static final k4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    check-cast p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->a0()V

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

.method private final n4()V
    .locals 17

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->d0:Landroid/widget/TextView;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    new-instance v2, Lcom/kubi/payment/p2p/trade/s;

    .line 9
    .line 10
    .line 11
    invoke-direct {v2, v0}, Lcom/kubi/payment/p2p/trade/s;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 12
    .line 13
    const-wide/16 v3, 0x1f4

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v3, v4, v2}, Lcom/kubi/utils/extensions/k;->y(Landroid/view/View;JLkotlin/jvm/functions/Function0;)V

    .line 17
    .line 18
    :cond_0
    iget-object v5, v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->a0:Lcom/kubi/payment/widget/RotateTextView;

    .line 19
    .line 20
    if-eqz v5, :cond_1

    .line 21
    .line 22
    new-instance v8, Lcom/kubi/payment/p2p/trade/t;

    .line 23
    .line 24
    .line 25
    invoke-direct {v8, v0}, Lcom/kubi/payment/p2p/trade/t;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 26
    const/4 v9, 0x1

    .line 27
    const/4 v10, 0x0

    .line 28
    .line 29
    const-wide/16 v6, 0x0

    .line 30
    .line 31
    .line 32
    invoke-static/range {v5 .. v10}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 33
    .line 34
    :cond_1
    iget-object v11, v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->b0:Lcom/kubi/payment/widget/RotateTextView;

    .line 35
    .line 36
    if-eqz v11, :cond_2

    .line 37
    .line 38
    new-instance v14, Lcom/kubi/payment/p2p/trade/v;

    .line 39
    .line 40
    .line 41
    invoke-direct {v14, v0}, Lcom/kubi/payment/p2p/trade/v;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 42
    const/4 v15, 0x1

    .line 43
    .line 44
    const/16 v16, 0x0

    .line 45
    .line 46
    const-wide/16 v12, 0x0

    .line 47
    .line 48
    .line 49
    invoke-static/range {v11 .. v16}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 50
    .line 51
    :cond_2
    iget-object v1, v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->c0:Lcom/kubi/payment/widget/RotateTextView;

    .line 52
    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    new-instance v4, Lcom/kubi/payment/p2p/trade/w;

    .line 56
    .line 57
    .line 58
    invoke-direct {v4, v0}, Lcom/kubi/payment/p2p/trade/w;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 59
    const/4 v5, 0x1

    .line 60
    const/4 v6, 0x0

    .line 61
    .line 62
    const-wide/16 v2, 0x0

    .line 63
    .line 64
    .line 65
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 66
    .line 67
    :cond_3
    iget-object v7, v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->e0:Landroid/widget/ImageView;

    .line 68
    .line 69
    if-eqz v7, :cond_4

    .line 70
    .line 71
    new-instance v10, Lcom/kubi/payment/p2p/trade/x;

    .line 72
    .line 73
    .line 74
    invoke-direct {v10, v0}, Lcom/kubi/payment/p2p/trade/x;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 75
    const/4 v11, 0x1

    .line 76
    const/4 v12, 0x0

    .line 77
    .line 78
    const-wide/16 v8, 0x0

    .line 79
    .line 80
    .line 81
    invoke-static/range {v7 .. v12}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 82
    :cond_4
    return-void
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

.method public static final o4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->S4()V

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
.end method

.method public static final p4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->a0:Lcom/kubi/payment/widget/RotateTextView;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/payment/widget/RotateTextView;->e()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->g4()Lcom/kubi/payment/p2p/trade/view/P2PCryptoCurrencySelectPopup;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    iget-object p0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->f0:Landroid/view/View;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1, p0}, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->q(Landroidx/fragment/app/FragmentActivity;Landroid/view/View;)V

    .line 21
    .line 22
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
.end method

.method public static final q4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->b0:Lcom/kubi/payment/widget/RotateTextView;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/payment/widget/RotateTextView;->e()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->h4()Lgu/n;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    iget-object v1, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->W:Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    check-cast v2, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->L()Landroidx/lifecycle/LiveData;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    check-cast v2, Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Lgu/n;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    iget-object p0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->f0:Landroid/view/View;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1, p0}, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->q(Landroidx/fragment/app/FragmentActivity;Landroid/view/View;)V

    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 48
    return-object p0
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

.method public static final r4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    check-cast p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 7
    const/4 v0, 0x1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->X(Z)V

    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    return-object p0
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

.method public static final s4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog;->v0:Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$Companion;

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
    iget-object v2, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->Y:Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;

    .line 14
    .line 15
    new-instance v3, Lcom/kubi/payment/p2p/trade/d0;

    .line 16
    .line 17
    .line 18
    invoke-direct {v3, p0}, Lcom/kubi/payment/p2p/trade/d0;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1, v2, v3}, Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$Companion;->show(Landroidx/fragment/app/FragmentManager;Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;Lkotlin/jvm/functions/Function1;)V

    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 24
    return-object p0
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

.method public static final t4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->Y:Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->U4()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->N4()V

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object p0
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

.method public static synthetic u3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lgu/r;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->H4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lgu/r;

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

.method public static final u4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->V:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->V:Z

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->G4()V

    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    return-object p0
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

.method public static synthetic v3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->t4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;)Lkotlin/Unit;

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

.method public static final v4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->V:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->V:Z

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->G4()V

    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    return-object p0
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

.method public static synthetic w3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->f4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;

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

.method public static final w4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/lang/String;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->d0:Landroid/widget/TextView;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    check-cast p1, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->V()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    check-cast p1, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 23
    const/4 v0, 0x1

    .line 24
    const/4 v1, 0x0

    .line 25
    const/4 v2, 0x0

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v2, v0, v1}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->Y(Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;ZILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    check-cast p1, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->U()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->Q4()V

    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 43
    return-object p0
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

.method public static synthetic x3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->J4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/lang/String;)Lkotlin/Unit;

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

.method public static final x4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/lang/String;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->a0:Lcom/kubi/payment/widget/RotateTextView;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    :cond_0
    sget-object v0, Lgf/n;->a:Lgf/n;

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lgf/n;->u(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->l4()Lft/v1;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget-object v0, v0, Lft/v1;->e:Landroid/widget/ImageView;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/kubi/data/entity/CoinInfoEntity;->getIconUrl()Ljava/lang/String;

    .line 34
    move-result-object p1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 p1, 0x0

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    .line 43
    invoke-static {v1, p1, v0}, Lcom/kubi/sdk/util/v;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->N4()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->P4()V

    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 52
    return-object p0
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

.method public static synthetic y3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->I4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)Lkotlin/Unit;

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

.method public static final y4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->g4()Lcom/kubi/payment/p2p/trade/view/P2PCryptoCurrencySelectPopup;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 8
    move-result-object p0

    .line 9
    .line 10
    check-cast p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->J()Landroidx/lifecycle/LiveData;

    .line 14
    move-result-object p0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    move-result-object p0

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p0, p1}, Lcom/kubi/payment/p2p/trade/view/P2PCryptoCurrencySelectPopup;->w(Ljava/lang/String;Ljava/util/List;)V

    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 33
    return-object p0
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

.method public static synthetic z3(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->y4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/util/List;)Lkotlin/Unit;

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

.method public static final z4(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->i4()Lgu/r;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lgu/r;->z(Ljava/util/List;)V

    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    return-object p0
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


# virtual methods
.method public K2()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->L()Landroidx/lifecycle/LiveData;

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
    check-cast v0, Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    move-result-object v0

    .line 21
    return-object v0
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

.method public final K4(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/payment/data/entities/BannerInfo$Banner;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->l4()Lft/v1;

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
    const-string v1, "cardView"

    .line 10
    .line 11
    if-eqz p1, :cond_2

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 15
    move-result v2

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_1
    iget-object v2, v0, Lft/v1;->c:Landroidx/cardview/widget/CardView;

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 27
    goto :goto_1

    .line 28
    .line 29
    :cond_2
    :goto_0
    iget-object v2, v0, Lft/v1;->c:Landroidx/cardview/widget/CardView;

    .line 30
    .line 31
    .line 32
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 36
    .line 37
    :goto_1
    iget-object v0, v0, Lft/v1;->b:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;

    .line 38
    .line 39
    new-instance v1, Lcom/kubi/payment/p2p/trade/p;

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, p0}, Lcom/kubi/payment/p2p/trade/p;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->setAdapter(Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$b;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Lcom/kubi/utils/extensions/b;->c(Ljava/util/List;)Ljava/util/List;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 53
    move-result v1

    .line 54
    const/4 v2, 0x1

    .line 55
    .line 56
    if-le v1, v2, :cond_3

    .line 57
    goto :goto_2

    .line 58
    :cond_3
    const/4 v2, 0x0

    .line 59
    .line 60
    .line 61
    :goto_2
    invoke-virtual {v0, v2}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->setAutoPlayAble(Z)V

    .line 62
    .line 63
    sget v1, Lcom/kubi/otc/R$layout;->payment_item_banner:I

    .line 64
    const/4 v2, 0x0

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1, p1, v2}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->setData(ILjava/util/List;Ljava/util/List;)V

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

.method public L()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->V:Z

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

.method public N1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->W:Ljava/lang/String;

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

.method public final N4()V
    .locals 1
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->K2()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 8
    move-result v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    return-void

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->e1()Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 19
    move-result v0

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    return-void

    .line 23
    .line 24
    :cond_1
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->Z:Lcom/kubi/payment/p2p/trade/P2PTradeMarketListFragment;

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    const-string v0, "marketListFragment"

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 32
    const/4 v0, 0x0

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketListFragment;->F3()V

    .line 36
    return-void
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

.method public final O4()V
    .locals 4

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->V:Z

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->l4()Lft/v1;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, v0, Lft/v1;->g:Landroidx/appcompat/widget/AppCompatTextView;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    sget v2, Lcom/kubi/otc/R$drawable;->payment_shape_c_button_normal_99r:I

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundResource(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->l4()Lft/v1;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, v0, Lft/v1;->g:Landroidx/appcompat/widget/AppCompatTextView;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-object v2, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 33
    .line 34
    sget v3, Lcom/kubi/otc/R$color;->c_textEmphasis:I

    .line 35
    .line 36
    .line 37
    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 38
    move-result v2

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->l4()Lft/v1;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget-object v0, v0, Lft/v1;->l:Landroidx/appcompat/widget/AppCompatTextView;

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->l4()Lft/v1;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    if-eqz v0, :cond_7

    .line 61
    .line 62
    iget-object v0, v0, Lft/v1;->l:Landroidx/appcompat/widget/AppCompatTextView;

    .line 63
    .line 64
    if-eqz v0, :cond_7

    .line 65
    .line 66
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 67
    .line 68
    sget v2, Lcom/kubi/otc/R$color;->c_text:I

    .line 69
    .line 70
    .line 71
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 72
    move-result v1

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 76
    return-void

    .line 77
    .line 78
    .line 79
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->l4()Lft/v1;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    iget-object v0, v0, Lft/v1;->g:Landroidx/appcompat/widget/AppCompatTextView;

    .line 85
    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 90
    .line 91
    .line 92
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->l4()Lft/v1;

    .line 93
    move-result-object v0

    .line 94
    .line 95
    if-eqz v0, :cond_5

    .line 96
    .line 97
    iget-object v0, v0, Lft/v1;->g:Landroidx/appcompat/widget/AppCompatTextView;

    .line 98
    .line 99
    if-eqz v0, :cond_5

    .line 100
    .line 101
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 102
    .line 103
    sget v2, Lcom/kubi/otc/R$color;->c_text:I

    .line 104
    .line 105
    .line 106
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 107
    move-result v1

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 111
    .line 112
    .line 113
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->l4()Lft/v1;

    .line 114
    move-result-object v0

    .line 115
    .line 116
    if-eqz v0, :cond_6

    .line 117
    .line 118
    iget-object v0, v0, Lft/v1;->l:Landroidx/appcompat/widget/AppCompatTextView;

    .line 119
    .line 120
    if-eqz v0, :cond_6

    .line 121
    .line 122
    sget v1, Lcom/kubi/otc/R$drawable;->payment_shape_c_button_normal_99r:I

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundResource(I)V

    .line 126
    .line 127
    .line 128
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->l4()Lft/v1;

    .line 129
    move-result-object v0

    .line 130
    .line 131
    if-eqz v0, :cond_7

    .line 132
    .line 133
    iget-object v0, v0, Lft/v1;->l:Landroidx/appcompat/widget/AppCompatTextView;

    .line 134
    .line 135
    if-eqz v0, :cond_7

    .line 136
    .line 137
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 138
    .line 139
    sget v2, Lcom/kubi/otc/R$color;->c_textEmphasis:I

    .line 140
    .line 141
    .line 142
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 143
    move-result v1

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 147
    :cond_7
    return-void
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

.method public final P4()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->Z:Lcom/kubi/payment/p2p/trade/P2PTradeMarketListFragment;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "marketListFragment"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->K2()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->e1()Ljava/lang/String;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    sget-object v3, Lcom/kubi/payment/p2p/data/entities/P2PTradingPairInfo$TradeTypeEnum;->BUY:Lcom/kubi/payment/p2p/data/entities/P2PTradingPairInfo$TradeTypeEnum;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Lcom/kubi/payment/p2p/data/entities/P2PTradingPairInfo$TradeTypeEnum;->getType()Ljava/lang/String;

    .line 24
    move-result-object v3

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1, v2, v3}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketListFragment;->C5(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    return-void
    .line 29
    .line 30
    .line 31
.end method

.method public final Q4()V
    .locals 9

    .line 1
    .line 2
    const-string v0, ""

    .line 3
    .line 4
    iput-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->W:Ljava/lang/String;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->X:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->Z3()V

    .line 10
    .line 11
    iget-object v1, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->c0:Lcom/kubi/payment/widget/RotateTextView;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    :cond_0
    new-instance v2, Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;

    .line 19
    .line 20
    iget-boolean v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->V:Z

    .line 21
    .line 22
    xor-int/lit8 v3, v0, 0x1

    .line 23
    .line 24
    const/16 v7, 0xe

    .line 25
    const/4 v8, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    .line 30
    .line 31
    invoke-direct/range {v2 .. v8}, Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;-><init>(ZZLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 32
    .line 33
    iput-object v2, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->Y:Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;

    .line 34
    .line 35
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->e0:Landroid/widget/ImageView;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 40
    .line 41
    sget v2, Lcom/kubi/otc/R$color;->c_text:I

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 45
    move-result v1

    .line 46
    .line 47
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 51
    :cond_1
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

.method public final R4()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/payment/p2p/P2PHelper;->a:Lcom/kubi/payment/p2p/P2PHelper;

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
    .line 14
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Lcom/kubi/payment/p2p/P2PHelper;->c(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/LifecycleCoroutineScope;)V

    .line 19
    return-void
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

.method public final S4()V
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->M()Ljava/util/List;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    new-instance v2, Ljava/util/ArrayList;

    .line 13
    .line 14
    const/16 v1, 0xa

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 18
    move-result v1

    .line 19
    .line 20
    .line 21
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    move-result v1

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    check-cast v1, Lcom/kubi/payment/p2p/data/entities/TradeCurrencyFiat;

    .line 38
    .line 39
    new-instance v3, Lmt/u;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/data/entities/TradeCurrencyFiat;->getTypeCode()Ljava/lang/String;

    .line 43
    move-result-object v4

    .line 44
    .line 45
    .line 46
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    move-result-object v4

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/data/entities/TradeCurrencyFiat;->getIcon()Ljava/lang/String;

    .line 51
    move-result-object v5

    .line 52
    .line 53
    .line 54
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    move-result-object v5

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/data/entities/TradeCurrencyFiat;->getTypeCode()Ljava/lang/String;

    .line 59
    move-result-object v1

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 63
    move-result-object v6

    .line 64
    .line 65
    check-cast v6, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v6}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->L()Landroidx/lifecycle/LiveData;

    .line 69
    move-result-object v6

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 73
    move-result-object v6

    .line 74
    .line 75
    .line 76
    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    move-result v1

    .line 78
    .line 79
    .line 80
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 81
    move-result-object v6

    .line 82
    .line 83
    const/16 v8, 0x8

    .line 84
    const/4 v9, 0x0

    .line 85
    const/4 v7, 0x0

    .line 86
    .line 87
    .line 88
    invoke-direct/range {v3 .. v9}, Lmt/u;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 92
    goto :goto_0

    .line 93
    .line 94
    .line 95
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    if-eqz v0, :cond_4

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 102
    move-result-object v0

    .line 103
    const/4 v1, 0x1

    .line 104
    .line 105
    if-eqz v0, :cond_1

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 109
    move-result v0

    .line 110
    .line 111
    if-ne v0, v1, :cond_1

    .line 112
    return-void

    .line 113
    .line 114
    .line 115
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 116
    move-result-object v0

    .line 117
    .line 118
    if-eqz v0, :cond_2

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 122
    move-result v0

    .line 123
    .line 124
    if-ne v0, v1, :cond_2

    .line 125
    return-void

    .line 126
    .line 127
    .line 128
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isRemoving()Z

    .line 129
    move-result v0

    .line 130
    .line 131
    if-eqz v0, :cond_3

    .line 132
    goto :goto_1

    .line 133
    .line 134
    :cond_3
    sget-object v1, Lcom/kubi/otc/view/SelectLabelDialogView;->v0:Lcom/kubi/otc/view/SelectLabelDialogView$Companion;

    .line 135
    .line 136
    new-instance v3, Lcom/kubi/payment/p2p/trade/e0;

    .line 137
    .line 138
    .line 139
    invoke-direct {v3, p0}, Lcom/kubi/payment/p2p/trade/e0;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 140
    const/4 v5, 0x4

    .line 141
    const/4 v6, 0x0

    .line 142
    const/4 v4, 0x0

    .line 143
    .line 144
    .line 145
    invoke-static/range {v1 .. v6}, Lcom/kubi/otc/view/SelectLabelDialogView$Companion;->newInstance$default(Lcom/kubi/otc/view/SelectLabelDialogView$Companion;Ljava/util/List;Lio/reactivex/functions/BiConsumer;Ljava/lang/String;ILjava/lang/Object;)Lcom/kubi/resources/dialog/DialogFragmentHelper;

    .line 146
    move-result-object v0

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 150
    move-result-object v1

    .line 151
    .line 152
    const-string v2, "getChildFragmentManager(...)"

    .line 153
    .line 154
    .line 155
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    .line 157
    const-string v2, "currencyFiatDialog"

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 161
    :cond_4
    :goto_1
    return-void
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

.method public final U4()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->Y:Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;->getSwitchMerchantEnabled()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-nez v0, :cond_5

    .line 22
    .line 23
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->Y:Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;->getSwitchTradableEnabled()Z

    .line 29
    move-result v0

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 33
    move-result-object v0

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move-object v0, v1

    .line 36
    .line 37
    .line 38
    :goto_1
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 39
    move-result v0

    .line 40
    .line 41
    if-nez v0, :cond_5

    .line 42
    .line 43
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->Y:Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;->getSortCode()Ljava/lang/String;

    .line 49
    move-result-object v0

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    move-object v0, v1

    .line 52
    .line 53
    :goto_2
    const-string v2, "DEAL_ORDER"

    .line 54
    .line 55
    .line 56
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    move-result v0

    .line 58
    .line 59
    if-nez v0, :cond_5

    .line 60
    .line 61
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->Y:Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;->getSortCode()Ljava/lang/String;

    .line 67
    move-result-object v1

    .line 68
    .line 69
    :cond_3
    const-string v0, "SUCC_RATE"

    .line 70
    .line 71
    .line 72
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    move-result v0

    .line 74
    .line 75
    if-eqz v0, :cond_4

    .line 76
    goto :goto_3

    .line 77
    .line 78
    :cond_4
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->e0:Landroid/widget/ImageView;

    .line 79
    .line 80
    if-eqz v0, :cond_6

    .line 81
    .line 82
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 83
    .line 84
    sget v2, Lcom/kubi/otc/R$color;->c_text:I

    .line 85
    .line 86
    .line 87
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 88
    move-result v1

    .line 89
    .line 90
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1, v2}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 94
    return-void

    .line 95
    .line 96
    :cond_5
    :goto_3
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->e0:Landroid/widget/ImageView;

    .line 97
    .line 98
    if-eqz v0, :cond_6

    .line 99
    .line 100
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 101
    .line 102
    sget v2, Lcom/kubi/otc/R$color;->brandGreen:I

    .line 103
    .line 104
    .line 105
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 106
    move-result v1

    .line 107
    .line 108
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v1, v2}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 112
    :cond_6
    return-void
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

.method public Y1()Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->Y:Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;

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

.method public final Z3()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->b0:Lcom/kubi/payment/widget/RotateTextView;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget v1, Lcom/kubi/otc/R$string;->amount:I

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    new-array v2, v2, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v1, v2}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->b0:Lcom/kubi/payment/widget/RotateTextView;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    sget v1, Lcom/kubi/otc/R$color;->c_text40:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v1}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 26
    move-result v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 30
    :cond_1
    return-void
    .line 31
.end method

.method public e1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->J()Landroidx/lifecycle/LiveData;

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
    check-cast v0, Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    move-result-object v0

    .line 21
    return-object v0
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

.method public g2(Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;)V
    .locals 7
    .param p1    # Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const/16 v5, 0xf

    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    move-object v0, p1

    .line 11
    .line 12
    .line 13
    invoke-static/range {v0 .. v6}, Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;->copy$default(Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;ZZLjava/lang/String;ZILjava/lang/Object;)Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;

    .line 14
    move-result-object p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    .line 18
    :goto_0
    iput-object p1, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->Y:Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->U4()V

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

.method public final g4()Lcom/kubi/payment/p2p/trade/view/P2PCryptoCurrencySelectPopup;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->g0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/payment/p2p/trade/view/P2PCryptoCurrencySelectPopup;

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

.method public getLayout()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/otc/R$layout;->payment_fragment_p2p_trade_market:I

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

.method public final h4()Lgu/n;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->h0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lgu/n;

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

.method public final i4()Lgu/r;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->i0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lgu/r;

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

.method public final j4()V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/function/looper/KuCoinLooper;->INSTANCE:Lcom/kubi/sdk/function/looper/KuCoinLooper;

    .line 3
    .line 4
    new-instance v1, Ldz/c$b;

    .line 5
    .line 6
    const-string v2, "getUserTradeInfo"

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ldz/c$b;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    const-wide/16 v2, 0x1e

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2, v3}, Ldz/c$b;->i(J)Ldz/c$b;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p0}, Ldz/c$b;->g(Landroidx/lifecycle/LifecycleOwner;)Ldz/c$b;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    new-instance v2, Lcom/kubi/payment/p2p/trade/j;

    .line 22
    .line 23
    .line 24
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/trade/j;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ldz/c$b;->f(Ljava/lang/Runnable;)Ldz/c$b;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ldz/c$b;->h()Ldz/c;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    filled-new-array {v1}, [Ldz/c;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lcom/kubi/sdk/function/looper/KuCoinLooper;->addTask([Ldz/c;)V

    .line 40
    return-void
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

.method public k1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->X:Ljava/lang/String;

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

.method public final l4()Lft/v1;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->j0:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->l0:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Lft/v1;

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

.method public final m4()V
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/otc/R$id;->tv_currency_crypto:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->findViewById(I)Landroid/view/View;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/payment/widget/RotateTextView;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->a0:Lcom/kubi/payment/widget/RotateTextView;

    .line 11
    .line 12
    sget v0, Lcom/kubi/otc/R$id;->tv_filter_amount:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->findViewById(I)Landroid/view/View;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Lcom/kubi/payment/widget/RotateTextView;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->b0:Lcom/kubi/payment/widget/RotateTextView;

    .line 21
    .line 22
    sget v0, Lcom/kubi/otc/R$id;->tv_filter_pay_type:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->findViewById(I)Landroid/view/View;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    check-cast v0, Lcom/kubi/payment/widget/RotateTextView;

    .line 29
    .line 30
    iput-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->c0:Lcom/kubi/payment/widget/RotateTextView;

    .line 31
    .line 32
    sget v0, Lcom/kubi/otc/R$id;->tv_currency_fiat:I

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->findViewById(I)Landroid/view/View;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    check-cast v0, Landroid/widget/TextView;

    .line 39
    .line 40
    iput-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->d0:Landroid/widget/TextView;

    .line 41
    .line 42
    sget v0, Lcom/kubi/otc/R$id;->iv_filter:I

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->findViewById(I)Landroid/view/View;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    check-cast v0, Landroid/widget/ImageView;

    .line 49
    .line 50
    iput-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->e0:Landroid/widget/ImageView;

    .line 51
    .line 52
    sget v0, Lcom/kubi/otc/R$id;->view_line:I

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->findViewById(I)Landroid/view/View;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    iput-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->f0:Landroid/view/View;

    .line 59
    return-void
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

.method public n3()V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->m4()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketListFragment;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketListFragment;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->Z:Lcom/kubi/payment/p2p/trade/P2PTradeMarketListFragment;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketListFragment;->J5(Lcom/kubi/payment/p2p/trade/e;)V

    .line 14
    .line 15
    sget v2, Lcom/kubi/otc/R$id;->fragment_trade_list:I

    .line 16
    .line 17
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->Z:Lcom/kubi/payment/p2p/trade/P2PTradeMarketListFragment;

    .line 18
    const/4 v7, 0x0

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    const-string v0, "marketListFragment"

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 26
    move-object v3, v7

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v3, v0

    .line 29
    :goto_0
    const/4 v5, 0x4

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v4, 0x0

    .line 32
    move-object v1, p0

    .line 33
    .line 34
    .line 35
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/core/f;->p(Landroidx/fragment/app/Fragment;ILandroidx/fragment/app/Fragment;[Lkotlin/Pair;ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    const-string v2, "BUY"

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    const-string v3, "key_side"

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v3, v2}, Lcom/kubi/router/utils/RouteExKt;->z(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    move-result-object v7

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    move-result v0

    .line 54
    .line 55
    iput-boolean v0, v1, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->V:Z

    .line 56
    .line 57
    new-instance v2, Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;

    .line 58
    .line 59
    iget-boolean v0, v1, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->V:Z

    .line 60
    .line 61
    xor-int/lit8 v3, v0, 0x1

    .line 62
    .line 63
    const/16 v7, 0xe

    .line 64
    const/4 v8, 0x0

    .line 65
    const/4 v4, 0x0

    .line 66
    const/4 v5, 0x0

    .line 67
    const/4 v6, 0x0

    .line 68
    .line 69
    .line 70
    invoke-direct/range {v2 .. v8}, Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;-><init>(ZZLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 71
    .line 72
    iput-object v2, v1, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->Y:Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->l4()Lft/v1;

    .line 76
    move-result-object v0

    .line 77
    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    iget-object v2, v0, Lft/v1;->g:Landroidx/appcompat/widget/AppCompatTextView;

    .line 81
    .line 82
    if-eqz v2, :cond_2

    .line 83
    .line 84
    new-instance v5, Lcom/kubi/payment/p2p/trade/k;

    .line 85
    .line 86
    .line 87
    invoke-direct {v5, p0}, Lcom/kubi/payment/p2p/trade/k;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 88
    const/4 v6, 0x1

    .line 89
    const/4 v7, 0x0

    .line 90
    .line 91
    const-wide/16 v3, 0x0

    .line 92
    .line 93
    .line 94
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->l4()Lft/v1;

    .line 98
    move-result-object v0

    .line 99
    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    iget-object v2, v0, Lft/v1;->l:Landroidx/appcompat/widget/AppCompatTextView;

    .line 103
    .line 104
    if-eqz v2, :cond_3

    .line 105
    .line 106
    new-instance v5, Lcom/kubi/payment/p2p/trade/l;

    .line 107
    .line 108
    .line 109
    invoke-direct {v5, p0}, Lcom/kubi/payment/p2p/trade/l;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 110
    const/4 v6, 0x1

    .line 111
    const/4 v7, 0x0

    .line 112
    .line 113
    const-wide/16 v3, 0x0

    .line 114
    .line 115
    .line 116
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :cond_3
    invoke-direct {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->G4()V

    .line 120
    .line 121
    .line 122
    invoke-direct {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->n4()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 126
    move-result-object v0

    .line 127
    .line 128
    check-cast v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->T()V

    .line 132
    return-void
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

.method public o3()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/payment/base/BaseFragment;->o3()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    check-cast v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->L()Landroidx/lifecycle/LiveData;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    new-instance v2, Lcom/kubi/payment/p2p/trade/u;

    .line 20
    .line 21
    .line 22
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/trade/u;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 23
    .line 24
    new-instance v3, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$a;

    .line 25
    .line 26
    .line 27
    invoke-direct {v3, v2}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    check-cast v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->J()Landroidx/lifecycle/LiveData;

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
    new-instance v2, Lcom/kubi/payment/p2p/trade/f0;

    .line 47
    .line 48
    .line 49
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/trade/f0;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 50
    .line 51
    new-instance v3, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$a;

    .line 52
    .line 53
    .line 54
    invoke-direct {v3, v2}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    check-cast v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->K()Landroidx/lifecycle/LiveData;

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
    new-instance v2, Lcom/kubi/payment/p2p/trade/h0;

    .line 74
    .line 75
    .line 76
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/trade/h0;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 77
    .line 78
    new-instance v3, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$a;

    .line 79
    .line 80
    .line 81
    invoke-direct {v3, v2}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    check-cast v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->P()Landroidx/lifecycle/LiveData;

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
    new-instance v2, Lcom/kubi/payment/p2p/trade/i0;

    .line 101
    .line 102
    .line 103
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/trade/i0;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 104
    .line 105
    new-instance v3, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$a;

    .line 106
    .line 107
    .line 108
    invoke-direct {v3, v2}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 115
    move-result-object v0

    .line 116
    .line 117
    check-cast v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->Q()Landroidx/lifecycle/LiveData;

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
    new-instance v2, Lcom/kubi/payment/p2p/trade/j0;

    .line 128
    .line 129
    .line 130
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/trade/j0;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 131
    .line 132
    new-instance v3, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$a;

    .line 133
    .line 134
    .line 135
    invoke-direct {v3, v2}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 142
    move-result-object v0

    .line 143
    .line 144
    check-cast v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->N()Landroidx/lifecycle/LiveData;

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
    new-instance v2, Lcom/kubi/payment/p2p/trade/k0;

    .line 155
    .line 156
    .line 157
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/trade/k0;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 158
    .line 159
    new-instance v3, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$a;

    .line 160
    .line 161
    .line 162
    invoke-direct {v3, v2}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 169
    move-result-object v0

    .line 170
    .line 171
    check-cast v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->H()Landroidx/lifecycle/LiveData;

    .line 175
    move-result-object v0

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 179
    move-result-object v1

    .line 180
    .line 181
    new-instance v2, Lcom/kubi/payment/p2p/trade/l0;

    .line 182
    .line 183
    .line 184
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/trade/l0;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 185
    .line 186
    new-instance v3, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$a;

    .line 187
    .line 188
    .line 189
    invoke-direct {v3, v2}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 196
    move-result-object v0

    .line 197
    .line 198
    check-cast v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->R()Landroidx/lifecycle/LiveData;

    .line 202
    move-result-object v0

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 206
    move-result-object v1

    .line 207
    .line 208
    new-instance v2, Lcom/kubi/payment/p2p/trade/m0;

    .line 209
    .line 210
    .line 211
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/trade/m0;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 212
    .line 213
    new-instance v3, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$a;

    .line 214
    .line 215
    .line 216
    invoke-direct {v3, v2}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 223
    move-result-object v0

    .line 224
    .line 225
    check-cast v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;->O()Landroidx/lifecycle/LiveData;

    .line 229
    move-result-object v0

    .line 230
    .line 231
    .line 232
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 233
    move-result-object v1

    .line 234
    .line 235
    new-instance v2, Lcom/kubi/payment/p2p/trade/n0;

    .line 236
    .line 237
    .line 238
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/trade/n0;-><init>(Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;)V

    .line 239
    .line 240
    new-instance v3, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$a;

    .line 241
    .line 242
    .line 243
    invoke-direct {v3, v2}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 247
    return-void
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

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    const/4 p1, 0x0

    .line 5
    const/4 v0, 0x4

    .line 6
    .line 7
    const-string v1, "B7p2p_load"

    .line 8
    .line 9
    const-string v2, "page_load_start"

    .line 10
    .line 11
    .line 12
    invoke-static {v1, v2, p1, v0, p1}, Lqq/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 13
    return-void
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
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->onDestroyView()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->i4()Lgu/r;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->i()V

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
.end method

.method public onResume()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->onResume()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/otc/service/a;->a:Lcom/kubi/otc/service/a;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/kubi/otc/service/a;->o()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lcom/kubi/otc/v;->a:Lcom/kubi/otc/v;

    .line 14
    const/4 v1, 0x1

    .line 15
    const/4 v2, 0x0

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v2, v1, v2}, Lcom/kubi/otc/v;->l(Lcom/kubi/otc/v;Lio/reactivex/functions/Action;ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->j4()V

    .line 22
    :cond_0
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
    invoke-super {p0, p1, p2}, Lcom/kubi/payment/base/BaseFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->R4()V

    .line 12
    return-void
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

.method public s2(Z)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;->l4()Lft/v1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lft/v1;->n:Lcom/kubi/otc/view/OrderRemindView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/kubi/otc/view/OrderRemindView;->E(Z)V

    .line 14
    :cond_0
    return-void
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

.method public s3()Lkotlin/reflect/KClass;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/reflect/KClass<",
            "Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-class v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

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
