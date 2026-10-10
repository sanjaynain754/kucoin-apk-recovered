.class public final Lcom/kubi/payment/p2p/order/OrderDetailFragment;
.super Lcom/kubi/payment/p2p/base/BaseP2PFragment;
.source "OrderDetailFragment.kt"

# interfaces
.implements Lcom/kubi/payment/p2p/order/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/payment/p2p/order/OrderDetailFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/payment/p2p/base/BaseP2PFragment<",
        "Lcom/kubi/payment/p2p/order/OrderDetailViewModel;",
        ">;",
        "Lcom/kubi/payment/p2p/order/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008&\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000 i2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001iB\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001cH\u0016J\u0008\u0010\u001d\u001a\u00020\u001eH\u0014J\u0008\u0010\u001f\u001a\u00020 H\u0016J\u0008\u0010!\u001a\u00020 H\u0014J\u0010\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0008H\u0002J\u0008\u0010$\u001a\u00020 H\u0002J\u0012\u0010%\u001a\u00020 2\u0008\u0010&\u001a\u0004\u0018\u00010\'H\u0002J\u0008\u0010(\u001a\u00020 H\u0016J\u0008\u0010)\u001a\u00020 H\u0002J\u0008\u0010*\u001a\u00020 H\u0002J\u0008\u0010+\u001a\u00020 H\u0002J\u0008\u0010,\u001a\u00020 H\u0002J\u0008\u0010-\u001a\u00020 H\u0002J\u0008\u0010.\u001a\u00020 H\u0002J\u0008\u0010/\u001a\u00020 H\u0002J\u000c\u00100\u001a\u00020 *\u00020\u0010H\u0002J\u0012\u00101\u001a\u00020 2\u0008\u00102\u001a\u0004\u0018\u000103H\u0002J\u0008\u00104\u001a\u00020\u000eH\u0002J\u0008\u00105\u001a\u00020 H\u0002J\u0008\u00106\u001a\u00020 H\u0002J\u0008\u00107\u001a\u00020 H\u0002J\u0008\u00108\u001a\u00020 H\u0002J\u0008\u00109\u001a\u00020 H\u0002J\u0008\u0010:\u001a\u00020 H\u0002J\u0008\u0010;\u001a\u00020 H\u0002J\u0008\u0010<\u001a\u00020 H\u0002J\u0008\u0010=\u001a\u00020 H\u0002J\u0008\u0010>\u001a\u00020 H\u0002J\u0008\u0010?\u001a\u00020 H\u0002J\u0008\u0010@\u001a\u00020 H\u0002J\u0008\u0010A\u001a\u00020 H\u0002J\u0008\u0010B\u001a\u00020 H\u0002J\u0008\u0010C\u001a\u00020 H\u0002J\u0008\u0010D\u001a\u00020 H\u0002J\u0008\u0010E\u001a\u00020 H\u0002J\u0008\u0010F\u001a\u00020 H\u0002J\u0008\u0010G\u001a\u00020 H\u0002J\u0008\u0010H\u001a\u00020 H\u0002J\u0008\u0010I\u001a\u00020 H\u0002J\u0008\u0010J\u001a\u00020 H\u0002J\u0008\u0010K\u001a\u00020 H\u0002J\u0008\u0010L\u001a\u00020 H\u0002J\u0008\u0010M\u001a\u00020 H\u0002J\u0008\u0010N\u001a\u00020 H\u0002J\u0008\u0010O\u001a\u00020 H\u0002J\u0008\u0010P\u001a\u00020 H\u0002J\u0008\u0010Q\u001a\u00020 H\u0002J\u0012\u0010R\u001a\u00020 2\u0008\u0008\u0002\u0010S\u001a\u00020\u000eH\u0002J\u0008\u0010T\u001a\u00020 H\u0002J\u0008\u0010U\u001a\u00020 H\u0002J\u0008\u0010V\u001a\u00020 H\u0002J\u0012\u0010W\u001a\u00020 2\u0008\u0008\u0002\u0010X\u001a\u00020\u000eH\u0002J.\u0010Y\u001a\u00020Z2\u0008\u0008\u0001\u0010[\u001a\u00020\u001e2\u0006\u0010\\\u001a\u00020\u000c2\u0008\u0008\u0002\u0010]\u001a\u00020\u000c2\u0008\u0008\u0003\u0010^\u001a\u00020\u001eH\u0002J\u0012\u0010_\u001a\u00020 2\u0008\u0010`\u001a\u0004\u0018\u00010aH\u0002J\u0012\u0010b\u001a\u00020 2\u0008\u0010`\u001a\u0004\u0018\u00010aH\u0002J\u0012\u0010c\u001a\u00020 2\u0008\u0010`\u001a\u0004\u0018\u00010aH\u0002J\u0008\u0010d\u001a\u00020\u000eH\u0002J\u0008\u0010e\u001a\u00020 H\u0002J\u0008\u0010f\u001a\u00020\u000eH\u0002J\u0008\u0010g\u001a\u00020 H\u0002J\u0008\u0010h\u001a\u00020 H\u0002R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0016\u0010\u0017R\u000e\u0010\u001a\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006j"
    }
    d2 = {
        "Lcom/kubi/payment/p2p/order/OrderDetailFragment;",
        "Lcom/kubi/payment/p2p/base/BaseP2PFragment;",
        "Lcom/kubi/payment/p2p/order/OrderDetailViewModel;",
        "Lcom/kubi/payment/p2p/order/OrderCountdownOwner;",
        "<init>",
        "()V",
        "autoCancelOrderTime",
        "Landroidx/lifecycle/LiveData;",
        "",
        "getAutoCancelOrderTime",
        "()Landroidx/lifecycle/LiveData;",
        "viewStatus",
        "",
        "needRefreshInfo",
        "",
        "vb",
        "Lcom/kubi/otc/databinding/PaymentFragmentP2pOrderDetailBinding;",
        "getVb",
        "()Lcom/kubi/otc/databinding/PaymentFragmentP2pOrderDetailBinding;",
        "vb$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "securityWidgetOpen",
        "getSecurityWidgetOpen",
        "()Z",
        "securityWidgetOpen$delegate",
        "Lkotlin/Lazy;",
        "checkedWarnDialog",
        "viewModelClass",
        "Lkotlin/reflect/KClass;",
        "getLayout",
        "",
        "initViews",
        "",
        "observeData",
        "checkAndShowOrderProcessDialog",
        "it",
        "checkAndClearWarnDialogStore",
        "handleOperationalActivity",
        "releaseCrypto",
        "Lcom/kubi/payment/p2p/data/entities/ReleaseCrypto;",
        "onResume",
        "initListener",
        "onGotoTransferClick",
        "goToTransfer",
        "refreshExpressHeaderUI",
        "refreshView",
        "refreshChatCardView",
        "refreshCommonView",
        "refreshStepsLayout",
        "showTaxInfo",
        "info",
        "Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;",
        "isCanSwitchPayType",
        "refreshBuyStatusOrderCreatedView",
        "refreshSellStatusOrderCreatedView",
        "refreshBuyStatusOrderWaitCoinView",
        "refreshSellStatusOrderPayCoinView",
        "refreshStatusOrderAppealingOwnView",
        "initBuyStatusOrderAppealingAndConsultOtherView",
        "refreshStatusOrderAppealingOtherView",
        "refreshStatusOrderAppealingOwnConsult",
        "refreshStatusOrderAppealingOtherConsult",
        "initStatusOrderAppealingService",
        "refreshStatusOrderAppealingOwnService",
        "refreshStatusOrderAppealingOtherService",
        "refreshBuyStatusOrderCharged",
        "refreshSuccessfulUI",
        "refreshSellStatusOrderCharged",
        "refreshStatusOrderCanceled",
        "refreshStatusExpressOrderUnconfirmed",
        "refreshStatusExpressOrderProcessing",
        "refreshStatusExpressOrderSucceeded",
        "refreshStatusExpressOrderFailed",
        "refreshCommonExpressUI",
        "refreshStatusExpressOrderCanceled",
        "showPayTypeSelectView",
        "showPayCoinAlertView",
        "showCancelAppealAlertView",
        "showCancelOrderAlertView",
        "showConsentConfirmView",
        "showConsultSuccessConfirmInfoView",
        "showConsentSuccessConfirmView",
        "showConsentDisagreeConfirmView",
        "isDismiss",
        "refreshPayTypeView",
        "payCoinCheck",
        "payCoinCheckV2",
        "routerAppealHistory",
        "isProcessing",
        "getSpannableString",
        "Landroid/text/SpannableString;",
        "resId",
        "primaryStr",
        "secondStr",
        "color",
        "setTextColorDark",
        "textView",
        "Landroid/widget/TextView;",
        "registerSpanStyle",
        "registerMoreSpanStyle",
        "isDisplayOpTradeInfo",
        "startChatActivity",
        "isFinalStatus",
        "startOrderLooper",
        "stopLoopTaskIfNeed",
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
        "SMAP\nOrderDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderDetailFragment.kt\ncom/kubi/payment/p2p/order/OrderDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 5 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 6 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,1797:1\n147#2,16:1798\n158#3,2:1814\n35#4,4:1816\n39#4:1822\n44#5,2:1820\n44#6,2:1823\n*S KotlinDebug\n*F\n+ 1 OrderDetailFragment.kt\ncom/kubi/payment/p2p/order/OrderDetailFragment\n*L\n112#1:1798,16\n217#1:1814,2\n126#1:1816,4\n126#1:1822\n126#1:1820,2\n1614#1:1823,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a0:Lcom/kubi/payment/p2p/order/OrderDetailFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic b0:[Lkotlin/reflect/KProperty;
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
.field public V:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public W:Z

.field public final X:Lcom/kubi/sdk/viewbindingdelegate/base/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Y:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public Z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lkotlin/jvm/internal/PropertyReference1Impl;

    .line 3
    .line 4
    const-string v1, "getVb()Lcom/kubi/otc/databinding/PaymentFragmentP2pOrderDetailBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/payment/p2p/order/OrderDetailFragment;

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
    sput-object v1, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->b0:[Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/payment/p2p/order/OrderDetailFragment$Companion;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    sput-object v0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->a0:Lcom/kubi/payment/p2p/order/OrderDetailFragment$Companion;

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
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    iput-object v0, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V:Ljava/lang/String;

    .line 8
    .line 9
    sget-object v0, Lcom/kubi/payment/p2p/order/OrderDetailFragment$special$$inlined$viewBindingFragment$1;->INSTANCE:Lcom/kubi/payment/p2p/order/OrderDetailFragment$special$$inlined$viewBindingFragment$1;

    .line 10
    .line 11
    new-instance v1, Lcom/kubi/payment/p2p/order/OrderDetailFragment$special$$inlined$viewBindingFragment$2;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment$special$$inlined$viewBindingFragment$2;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    iput-object v0, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->X:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 21
    .line 22
    const-string v0, "B7P2POrderDetails"

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->setPageId(Ljava/lang/String;)V

    .line 26
    .line 27
    new-instance v0, Lcom/kubi/payment/p2p/order/o;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0}, Lcom/kubi/payment/p2p/order/o;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    iput-object v0, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->Y:Lkotlin/Lazy;

    .line 37
    return-void
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

.method public static synthetic A3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->M4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method private final A4()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->Y:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    move-result v0

    .line 13
    return v0
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

.method public static final A6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Lcom/kubi/otc/entity/AdPayType;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->H0(Lcom/kubi/otc/entity/AdPayType;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->G5()V

    .line 13
    .line 14
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    return-object p0
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

.method public static synthetic B3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->Y4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static synthetic C3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->t6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static synthetic C4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;ILjava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Landroid/text/SpannableString;
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p6, p5, 0x4

    .line 3
    .line 4
    if-eqz p6, :cond_0

    .line 5
    .line 6
    const-string p3, ""

    .line 7
    .line 8
    :cond_0
    and-int/lit8 p5, p5, 0x8

    .line 9
    .line 10
    if-eqz p5, :cond_1

    .line 11
    .line 12
    sget p4, Lcom/kubi/otc/R$color;->primary:I

    .line 13
    .line 14
    .line 15
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->B4(ILjava/lang/String;Ljava/lang/String;I)Landroid/text/SpannableString;

    .line 16
    move-result-object p0

    .line 17
    return-object p0
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
.end method

.method public static synthetic D3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->Q5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final D6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->hideDialogLoading()V

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

.method public static synthetic E3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static/range {p0 .. p7}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->y5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;)Lkotlin/Unit;

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
.end method

.method public static synthetic F3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->a5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final F4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Landroid/content/Intent;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->b0(Lcom/kubi/payment/p2p/order/OrderDetailViewModel;ZILjava/lang/Object;)V

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const-string v0, "data"

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0, v1}, Lcom/kubi/router/utils/RouteExKt;->g(Landroid/content/Intent;Ljava/lang/String;Z)Z

    .line 20
    move-result p1

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    move-result-object p1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object p1, v3

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-static {p1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 30
    move-result p1

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 36
    move-result-object p0

    .line 37
    .line 38
    check-cast p0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 39
    .line 40
    .line 41
    invoke-static {p0, v1, v2, v3}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->y0(Lcom/kubi/payment/p2p/order/OrderDetailViewModel;ZILjava/lang/Object;)V

    .line 42
    :cond_1
    return-void
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

.method public static final F6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    check-cast p0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static {p0, v2, v0, v1}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->b0(Lcom/kubi/payment/p2p/order/OrderDetailViewModel;ZILjava/lang/Object;)V

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

.method public static synthetic G3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->P4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static synthetic H3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->i6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static synthetic I3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->l5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Boolean;)Lkotlin/Unit;

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

.method private final I4()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 5
    move-result-object v1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v2, v1, Lft/r1;->j:Landroidx/appcompat/widget/AppCompatImageView;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    new-instance v5, Lcom/kubi/payment/p2p/order/b;

    .line 14
    .line 15
    .line 16
    invoke-direct {v5, p0}, Lcom/kubi/payment/p2p/order/b;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 17
    const/4 v6, 0x1

    .line 18
    const/4 v7, 0x0

    .line 19
    .line 20
    const-wide/16 v3, 0x0

    .line 21
    .line 22
    .line 23
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object v2, v1, Lft/r1;->n:Landroidx/appcompat/widget/AppCompatImageView;

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    new-instance v5, Lcom/kubi/payment/p2p/order/d;

    .line 36
    .line 37
    .line 38
    invoke-direct {v5, p0}, Lcom/kubi/payment/p2p/order/d;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 39
    const/4 v6, 0x1

    .line 40
    const/4 v7, 0x0

    .line 41
    .line 42
    const-wide/16 v3, 0x0

    .line 43
    .line 44
    .line 45
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 46
    .line 47
    :cond_1
    sget-object v1, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->P2P:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 51
    move-result v1

    .line 52
    .line 53
    if-nez v1, :cond_3

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 57
    move-result-object v1

    .line 58
    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    iget-object v1, v1, Lft/r1;->n:Landroidx/appcompat/widget/AppCompatImageView;

    .line 62
    .line 63
    if-eqz v1, :cond_2

    .line 64
    .line 65
    .line 66
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    iget-object v1, v1, Lft/r1;->F0:Lcom/kubi/payment/p2p/widget/P2PViewChatCardEntrance;

    .line 75
    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    sget v2, Lcom/kubi/otc/R$id;->tvChat:I

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 82
    move-result-object v1

    .line 83
    .line 84
    if-eqz v1, :cond_3

    .line 85
    .line 86
    .line 87
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 91
    move-result-object v1

    .line 92
    .line 93
    const/16 v2, 0x8

    .line 94
    .line 95
    if-eqz v1, :cond_4

    .line 96
    .line 97
    iget-object v1, v1, Lft/r1;->K:Lcom/kubi/resources/widget/BaseTextView;

    .line 98
    .line 99
    if-eqz v1, :cond_4

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 103
    move-result-object v1

    .line 104
    .line 105
    if-eqz v1, :cond_4

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setFlags(I)V

    .line 109
    .line 110
    .line 111
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 112
    move-result-object v1

    .line 113
    .line 114
    if-eqz v1, :cond_5

    .line 115
    .line 116
    iget-object v1, v1, Lft/r1;->K:Lcom/kubi/resources/widget/BaseTextView;

    .line 117
    .line 118
    if-eqz v1, :cond_5

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 122
    move-result-object v1

    .line 123
    .line 124
    if-eqz v1, :cond_5

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 128
    .line 129
    .line 130
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 131
    move-result-object v1

    .line 132
    .line 133
    if-eqz v1, :cond_6

    .line 134
    .line 135
    iget-object v3, v1, Lft/r1;->K:Lcom/kubi/resources/widget/BaseTextView;

    .line 136
    .line 137
    if-eqz v3, :cond_6

    .line 138
    .line 139
    new-instance v6, Lcom/kubi/payment/p2p/order/f;

    .line 140
    .line 141
    .line 142
    invoke-direct {v6}, Lcom/kubi/payment/p2p/order/f;-><init>()V

    .line 143
    const/4 v7, 0x1

    .line 144
    const/4 v8, 0x0

    .line 145
    .line 146
    const-wide/16 v4, 0x0

    .line 147
    .line 148
    .line 149
    invoke-static/range {v3 .. v8}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 153
    move-result-object v1

    .line 154
    .line 155
    if-eqz v1, :cond_7

    .line 156
    .line 157
    iget-object v3, v1, Lft/r1;->G:Lcom/kubi/resources/widget/BaseTextView;

    .line 158
    .line 159
    if-eqz v3, :cond_7

    .line 160
    .line 161
    new-instance v6, Lcom/kubi/payment/p2p/order/g;

    .line 162
    .line 163
    .line 164
    invoke-direct {v6, p0}, Lcom/kubi/payment/p2p/order/g;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 165
    const/4 v7, 0x1

    .line 166
    const/4 v8, 0x0

    .line 167
    .line 168
    const-wide/16 v4, 0x0

    .line 169
    .line 170
    .line 171
    invoke-static/range {v3 .. v8}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 175
    move-result-object v1

    .line 176
    .line 177
    if-eqz v1, :cond_8

    .line 178
    .line 179
    iget-object v1, v1, Lft/r1;->H:Lcom/kubi/resources/widget/BaseTextView;

    .line 180
    .line 181
    if-eqz v1, :cond_8

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 185
    move-result-object v1

    .line 186
    .line 187
    if-eqz v1, :cond_8

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setFlags(I)V

    .line 191
    .line 192
    .line 193
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 194
    move-result-object v1

    .line 195
    .line 196
    if-eqz v1, :cond_9

    .line 197
    .line 198
    iget-object v1, v1, Lft/r1;->H:Lcom/kubi/resources/widget/BaseTextView;

    .line 199
    .line 200
    if-eqz v1, :cond_9

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 204
    move-result-object v1

    .line 205
    .line 206
    if-eqz v1, :cond_9

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 210
    .line 211
    .line 212
    :cond_9
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 213
    move-result-object v1

    .line 214
    .line 215
    if-eqz v1, :cond_a

    .line 216
    .line 217
    iget-object v3, v1, Lft/r1;->H:Lcom/kubi/resources/widget/BaseTextView;

    .line 218
    .line 219
    if-eqz v3, :cond_a

    .line 220
    .line 221
    new-instance v6, Lcom/kubi/payment/p2p/order/h;

    .line 222
    .line 223
    .line 224
    invoke-direct {v6, p0}, Lcom/kubi/payment/p2p/order/h;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 225
    const/4 v7, 0x1

    .line 226
    const/4 v8, 0x0

    .line 227
    .line 228
    const-wide/16 v4, 0x0

    .line 229
    .line 230
    .line 231
    invoke-static/range {v3 .. v8}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    :cond_a
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 235
    move-result-object v1

    .line 236
    .line 237
    if-eqz v1, :cond_d

    .line 238
    .line 239
    iget-object v3, v1, Lft/r1;->P:Lcom/kubi/resources/widget/BaseTextView;

    .line 240
    .line 241
    if-eqz v3, :cond_d

    .line 242
    .line 243
    .line 244
    invoke-virtual {v3}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 245
    move-result-object v1

    .line 246
    .line 247
    if-eqz v1, :cond_b

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setFlags(I)V

    .line 251
    .line 252
    .line 253
    :cond_b
    invoke-virtual {v3}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 254
    move-result-object v1

    .line 255
    .line 256
    if-eqz v1, :cond_c

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 260
    .line 261
    :cond_c
    new-instance v6, Lcom/kubi/payment/p2p/order/i;

    .line 262
    .line 263
    .line 264
    invoke-direct {v6, p0}, Lcom/kubi/payment/p2p/order/i;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 265
    const/4 v7, 0x1

    .line 266
    const/4 v8, 0x0

    .line 267
    .line 268
    const-wide/16 v4, 0x0

    .line 269
    .line 270
    .line 271
    invoke-static/range {v3 .. v8}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    :cond_d
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 275
    move-result-object v1

    .line 276
    .line 277
    if-eqz v1, :cond_e

    .line 278
    .line 279
    iget-object v2, v1, Lft/r1;->m0:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 280
    .line 281
    if-eqz v2, :cond_e

    .line 282
    .line 283
    new-instance v5, Lcom/kubi/payment/p2p/order/j;

    .line 284
    .line 285
    .line 286
    invoke-direct {v5, p0}, Lcom/kubi/payment/p2p/order/j;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 287
    const/4 v6, 0x1

    .line 288
    const/4 v7, 0x0

    .line 289
    .line 290
    const-wide/16 v3, 0x0

    .line 291
    .line 292
    .line 293
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    :cond_e
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 297
    move-result-object v1

    .line 298
    .line 299
    if-eqz v1, :cond_f

    .line 300
    .line 301
    iget-object v2, v1, Lft/r1;->C:Lcom/kubi/resources/widget/button/KcSecondaryButton;

    .line 302
    .line 303
    if-eqz v2, :cond_f

    .line 304
    .line 305
    new-instance v5, Lcom/kubi/payment/p2p/order/k;

    .line 306
    .line 307
    .line 308
    invoke-direct {v5, p0}, Lcom/kubi/payment/p2p/order/k;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 309
    const/4 v6, 0x1

    .line 310
    const/4 v7, 0x0

    .line 311
    .line 312
    const-wide/16 v3, 0x0

    .line 313
    .line 314
    .line 315
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    :cond_f
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 319
    move-result-object v1

    .line 320
    .line 321
    if-eqz v1, :cond_10

    .line 322
    .line 323
    iget-object v2, v1, Lft/r1;->B0:Landroid/view/View;

    .line 324
    .line 325
    if-eqz v2, :cond_10

    .line 326
    .line 327
    new-instance v5, Lcom/kubi/payment/p2p/order/l;

    .line 328
    .line 329
    .line 330
    invoke-direct {v5, p0}, Lcom/kubi/payment/p2p/order/l;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 331
    const/4 v6, 0x1

    .line 332
    const/4 v7, 0x0

    .line 333
    .line 334
    const-wide/16 v3, 0x0

    .line 335
    .line 336
    .line 337
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    :cond_10
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 341
    move-result-object v1

    .line 342
    .line 343
    if-eqz v1, :cond_11

    .line 344
    .line 345
    iget-object v2, v1, Lft/r1;->x0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 346
    .line 347
    if-eqz v2, :cond_11

    .line 348
    .line 349
    new-instance v5, Lcom/kubi/payment/p2p/order/n;

    .line 350
    .line 351
    .line 352
    invoke-direct {v5, p0}, Lcom/kubi/payment/p2p/order/n;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 353
    const/4 v6, 0x1

    .line 354
    const/4 v7, 0x0

    .line 355
    .line 356
    const-wide/16 v3, 0x0

    .line 357
    .line 358
    .line 359
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    :cond_11
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 363
    move-result-object v1

    .line 364
    .line 365
    if-eqz v1, :cond_12

    .line 366
    .line 367
    iget-object v2, v1, Lft/r1;->J0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 368
    .line 369
    if-eqz v2, :cond_12

    .line 370
    .line 371
    new-instance v5, Lcom/kubi/payment/p2p/order/m;

    .line 372
    .line 373
    .line 374
    invoke-direct {v5, p0}, Lcom/kubi/payment/p2p/order/m;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 375
    const/4 v6, 0x1

    .line 376
    const/4 v7, 0x0

    .line 377
    .line 378
    const-wide/16 v3, 0x0

    .line 379
    .line 380
    .line 381
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    :cond_12
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 385
    move-result-object v1

    .line 386
    .line 387
    if-eqz v1, :cond_13

    .line 388
    .line 389
    iget-object v2, v1, Lft/r1;->q0:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 390
    .line 391
    if-eqz v2, :cond_13

    .line 392
    .line 393
    new-instance v5, Lcom/kubi/payment/p2p/order/x;

    .line 394
    .line 395
    .line 396
    invoke-direct {v5, p0}, Lcom/kubi/payment/p2p/order/x;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 397
    const/4 v6, 0x1

    .line 398
    const/4 v7, 0x0

    .line 399
    .line 400
    const-wide/16 v3, 0x0

    .line 401
    .line 402
    .line 403
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    :cond_13
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 407
    move-result-object v1

    .line 408
    .line 409
    if-eqz v1, :cond_14

    .line 410
    .line 411
    iget-object v2, v1, Lft/r1;->r0:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 412
    .line 413
    if-eqz v2, :cond_14

    .line 414
    .line 415
    new-instance v5, Lcom/kubi/payment/p2p/order/i0;

    .line 416
    .line 417
    .line 418
    invoke-direct {v5, p0}, Lcom/kubi/payment/p2p/order/i0;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 419
    const/4 v6, 0x1

    .line 420
    const/4 v7, 0x0

    .line 421
    .line 422
    const-wide/16 v3, 0x0

    .line 423
    .line 424
    .line 425
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    :cond_14
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 429
    move-result-object v1

    .line 430
    .line 431
    if-eqz v1, :cond_15

    .line 432
    .line 433
    iget-object v2, v1, Lft/r1;->Y:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 434
    .line 435
    if-eqz v2, :cond_15

    .line 436
    .line 437
    new-instance v5, Lcom/kubi/payment/p2p/order/t0;

    .line 438
    .line 439
    .line 440
    invoke-direct {v5, p0}, Lcom/kubi/payment/p2p/order/t0;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 441
    const/4 v6, 0x1

    .line 442
    const/4 v7, 0x0

    .line 443
    .line 444
    const-wide/16 v3, 0x0

    .line 445
    .line 446
    .line 447
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    :cond_15
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 451
    move-result-object v1

    .line 452
    .line 453
    if-eqz v1, :cond_16

    .line 454
    .line 455
    iget-object v2, v1, Lft/r1;->E:Lcom/kubi/resources/widget/BaseTextView;

    .line 456
    .line 457
    if-eqz v2, :cond_16

    .line 458
    .line 459
    new-instance v5, Lcom/kubi/payment/p2p/order/w0;

    .line 460
    .line 461
    .line 462
    invoke-direct {v5, p0}, Lcom/kubi/payment/p2p/order/w0;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 463
    const/4 v6, 0x1

    .line 464
    const/4 v7, 0x0

    .line 465
    .line 466
    const-wide/16 v3, 0x0

    .line 467
    .line 468
    .line 469
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    :cond_16
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 473
    move-result-object v1

    .line 474
    .line 475
    if-eqz v1, :cond_17

    .line 476
    .line 477
    iget-object v2, v1, Lft/r1;->J:Lcom/kubi/resources/widget/BaseTextView;

    .line 478
    .line 479
    if-eqz v2, :cond_17

    .line 480
    .line 481
    new-instance v5, Lcom/kubi/payment/p2p/order/x0;

    .line 482
    .line 483
    .line 484
    invoke-direct {v5, p0}, Lcom/kubi/payment/p2p/order/x0;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 485
    const/4 v6, 0x1

    .line 486
    const/4 v7, 0x0

    .line 487
    .line 488
    const-wide/16 v3, 0x0

    .line 489
    .line 490
    .line 491
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 492
    .line 493
    .line 494
    :cond_17
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 495
    move-result-object v1

    .line 496
    .line 497
    if-eqz v1, :cond_18

    .line 498
    .line 499
    iget-object v2, v1, Lft/r1;->V:Lcom/kubi/resources/widget/BaseTextView;

    .line 500
    .line 501
    if-eqz v2, :cond_18

    .line 502
    .line 503
    new-instance v5, Lcom/kubi/payment/p2p/order/y0;

    .line 504
    .line 505
    .line 506
    invoke-direct {v5, p0}, Lcom/kubi/payment/p2p/order/y0;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 507
    const/4 v6, 0x1

    .line 508
    const/4 v7, 0x0

    .line 509
    .line 510
    const-wide/16 v3, 0x0

    .line 511
    .line 512
    .line 513
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 514
    .line 515
    .line 516
    :cond_18
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 517
    move-result-object v1

    .line 518
    .line 519
    if-eqz v1, :cond_19

    .line 520
    .line 521
    iget-object v2, v1, Lft/r1;->F:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 522
    .line 523
    if-eqz v2, :cond_19

    .line 524
    .line 525
    new-instance v5, Lcom/kubi/payment/p2p/order/z0;

    .line 526
    .line 527
    .line 528
    invoke-direct {v5, p0}, Lcom/kubi/payment/p2p/order/z0;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 529
    const/4 v6, 0x1

    .line 530
    const/4 v7, 0x0

    .line 531
    .line 532
    const-wide/16 v3, 0x0

    .line 533
    .line 534
    .line 535
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 536
    .line 537
    .line 538
    :cond_19
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 539
    move-result-object v1

    .line 540
    .line 541
    if-eqz v1, :cond_1a

    .line 542
    .line 543
    iget-object v2, v1, Lft/r1;->v0:Lcom/kubi/resources/widget/BaseTextView;

    .line 544
    .line 545
    if-eqz v2, :cond_1a

    .line 546
    .line 547
    new-instance v5, Lcom/kubi/payment/p2p/order/a1;

    .line 548
    .line 549
    .line 550
    invoke-direct {v5, p0}, Lcom/kubi/payment/p2p/order/a1;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 551
    const/4 v6, 0x1

    .line 552
    const/4 v7, 0x0

    .line 553
    .line 554
    const-wide/16 v3, 0x0

    .line 555
    .line 556
    .line 557
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 558
    .line 559
    .line 560
    :cond_1a
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 561
    move-result-object v1

    .line 562
    .line 563
    if-eqz v1, :cond_1b

    .line 564
    .line 565
    iget-object v2, v1, Lft/r1;->o0:Lcom/kubi/resources/widget/BaseTextView;

    .line 566
    .line 567
    const-string v3, "tvTaxName"

    .line 568
    .line 569
    .line 570
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 571
    .line 572
    iget-object v1, v1, Lft/r1;->s:Landroidx/appcompat/widget/AppCompatImageView;

    .line 573
    .line 574
    const-string v3, "ivTaxQuestion"

    .line 575
    .line 576
    .line 577
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 578
    const/4 v3, 0x2

    .line 579
    .line 580
    new-array v3, v3, [Landroid/view/View;

    .line 581
    const/4 v4, 0x0

    .line 582
    .line 583
    aput-object v2, v3, v4

    .line 584
    .line 585
    aput-object v1, v3, v0

    .line 586
    .line 587
    new-instance v0, Lcom/kubi/payment/p2p/order/c;

    .line 588
    .line 589
    .line 590
    invoke-direct {v0, p0}, Lcom/kubi/payment/p2p/order/c;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 591
    .line 592
    .line 593
    invoke-static {v3, v0}, Lcom/kubi/utils/extensions/k;->D([Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 594
    .line 595
    .line 596
    :cond_1b
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 597
    move-result-object v0

    .line 598
    .line 599
    if-eqz v0, :cond_1c

    .line 600
    .line 601
    iget-object v0, v0, Lft/r1;->F0:Lcom/kubi/payment/p2p/widget/P2PViewChatCardEntrance;

    .line 602
    .line 603
    if-eqz v0, :cond_1c

    .line 604
    .line 605
    new-instance v1, Lcom/kubi/payment/p2p/order/e;

    .line 606
    .line 607
    .line 608
    invoke-direct {v1, p0}, Lcom/kubi/payment/p2p/order/e;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v0, v1}, Lcom/kubi/payment/p2p/widget/P2PViewChatCardEntrance;->setOnChatClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 612
    :cond_1c
    return-void
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

.method public static synthetic J3()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->f6()Z

    .line 4
    move-result v0

    .line 5
    return v0
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

.method public static final J4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->preformBackPressed()V

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

.method public static synthetic K3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->m5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Boolean;)Lkotlin/Unit;

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

.method public static final K4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->P2P:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object p0

    .line 12
    .line 13
    :cond_0
    sget-object v0, Lcom/kubi/otc/service/a;->a:Lcom/kubi/otc/service/a;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 17
    move-result-object p0

    .line 18
    .line 19
    const-string v1, "p2pOrder"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p0, v1}, Lcom/kubi/otc/service/a;->u(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;)V

    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 25
    return-object p0
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

.method public static synthetic L3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->W4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final L4()Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/helpcenter/api/local/IHelpCenterService;->a:Lcom/kubi/helpcenter/api/local/IHelpCenterService$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/helpcenter/api/local/IHelpCenterService$Companion;->get()Lcom/kubi/helpcenter/api/local/IHelpCenterService;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "360001278554"

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Lcom/kubi/helpcenter/api/local/IHelpCenterService;->a(Ljava/lang/String;)V

    .line 12
    .line 13
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

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

.method public static synthetic M3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->k5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Boolean;)Lkotlin/Unit;

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

.method public static final M4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->W:Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->j6()V

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
.end method

.method public static synthetic N3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->X4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final N4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->W:Z

    .line 4
    .line 5
    sget-object v1, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 6
    .line 7
    sget-object v2, Lcom/kubi/payment/flutter/e;->a:Lcom/kubi/payment/flutter/e;

    .line 8
    .line 9
    const-string v3, "payment/p2p/help"

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x0

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v3, v4, v5, v6}, Lcom/kubi/payment/flutter/e;->b(Lcom/kubi/payment/flutter/e;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    check-cast v2, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getId()Ljava/lang/String;

    .line 36
    move-result-object v2

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object v2, v6

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    const-string v3, "orderId"

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v3, v2}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 52
    move-result-object p0

    .line 53
    .line 54
    check-cast p0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 58
    move-result-object p0

    .line 59
    .line 60
    if-eqz p0, :cond_1

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getBuyerRole()Ljava/lang/Boolean;

    .line 64
    move-result-object v6

    .line 65
    .line 66
    .line 67
    :cond_1
    invoke-static {v6}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 68
    move-result p0

    .line 69
    xor-int/2addr p0, v0

    .line 70
    .line 71
    .line 72
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 73
    move-result-object p0

    .line 74
    .line 75
    const-string v0, "isSeller"

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v0, p0}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 79
    move-result-object p0

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lay/a;->k()Z

    .line 83
    .line 84
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 85
    return-object p0
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

.method public static final N5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lft/r1;->F:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/resources/widget/button/KcPrimaryButton;->o()V

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

.method public static synthetic O3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->F6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

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

.method public static final O4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/payment/p2p/order/OrderPhoneNumberDialog;->u0:Lcom/kubi/payment/p2p/order/OrderPhoneNumberDialog$Companion;

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
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    check-cast v2, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 21
    move-result-object v2

    .line 22
    const/4 v3, 0x0

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getNickName()Ljava/lang/String;

    .line 28
    move-result-object v2

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v2, v3

    .line 31
    .line 32
    .line 33
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 34
    move-result-object v4

    .line 35
    .line 36
    check-cast v4, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 40
    move-result-object v4

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getAreaCode()Ljava/lang/String;

    .line 46
    move-result-object v4

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move-object v4, v3

    .line 49
    .line 50
    .line 51
    :goto_1
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 52
    move-result-object v5

    .line 53
    .line 54
    check-cast v5, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v5}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 58
    move-result-object v5

    .line 59
    .line 60
    if-eqz v5, :cond_2

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getPhone()Ljava/lang/String;

    .line 64
    move-result-object v5

    .line 65
    goto :goto_2

    .line 66
    :cond_2
    move-object v5, v3

    .line 67
    .line 68
    .line 69
    :goto_2
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 70
    move-result-object p0

    .line 71
    .line 72
    check-cast p0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 76
    move-result-object p0

    .line 77
    .line 78
    if-eqz p0, :cond_3

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getSecretPhone()Ljava/lang/String;

    .line 82
    move-result-object v3

    .line 83
    :cond_3
    move-object v6, v5

    .line 84
    move-object v5, v3

    .line 85
    move-object v3, v4

    .line 86
    move-object v4, v6

    .line 87
    .line 88
    .line 89
    invoke-virtual/range {v0 .. v5}, Lcom/kubi/payment/p2p/order/OrderPhoneNumberDialog$Companion;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 92
    return-object p0
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

.method public static synthetic P3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->r5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)V

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

.method public static final P4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/payment/flutter/e;->a:Lcom/kubi/payment/flutter/e;

    .line 5
    .line 6
    const-string v2, "payment/p2p/appealSupplement"

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static {v1, v2, v3, v4, v5}, Lcom/kubi/payment/flutter/e;->b(Lcom/kubi/payment/flutter/e;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    check-cast v1, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getId()Ljava/lang/String;

    .line 33
    move-result-object v1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v1, v5

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    const-string v2, "orderId"

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2, v1}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 49
    move-result-object p0

    .line 50
    .line 51
    check-cast p0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 55
    move-result-object p0

    .line 56
    .line 57
    if-eqz p0, :cond_1

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getBuyerRole()Ljava/lang/Boolean;

    .line 61
    move-result-object v5

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-static {v5}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 65
    move-result p0

    .line 66
    .line 67
    xor-int/lit8 p0, p0, 0x1

    .line 68
    .line 69
    .line 70
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 71
    move-result-object p0

    .line 72
    .line 73
    const-string v1, "isSeller"

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1, p0}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 77
    move-result-object p0

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lay/a;->k()Z

    .line 81
    .line 82
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 83
    return-object p0
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

.method public static synthetic Q3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->t5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Landroid/content/DialogInterface;I)V

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

.method public static final Q4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->h6()V

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

.method public static final Q5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    check-cast p0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static {p0, v2, v0, v1}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->b0(Lcom/kubi/payment/p2p/order/OrderDetailViewModel;ZILjava/lang/Object;)V

    .line 13
    .line 14
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    return-object p0
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

.method public static synthetic R3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->N5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

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

.method public static final R4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lft/r1;->w0:Landroid/view/View;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->d6(Z)V

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

.method public static synthetic S3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->s6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final S4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lft/r1;->y0:Landroid/view/View;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v2, v0, v1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->e6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;ZILjava/lang/Object;)V

    .line 20
    .line 21
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 22
    return-object p0
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

.method public static synthetic T3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->b5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final T4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->f5()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->z6()V

    .line 10
    .line 11
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    return-object p0
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

.method public static synthetic U3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->v6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final U4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    move-result v1

    .line 7
    .line 8
    .line 9
    sparse-switch v1, :sswitch_data_0

    .line 10
    goto :goto_1

    .line 11
    .line 12
    :sswitch_0
    const-string v1, "SELL_STATUS_ORDER_APPEALING_OTHER_CONSULT"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    goto :goto_1

    .line 20
    .line 21
    :sswitch_1
    const-string v1, "SELL_STATUS_ORDER_APPEALING_OTHER"

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    move-result v0

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :sswitch_2
    const-string v1, "BUY_STATUS_ORDER_APPEALING_OTHER_CONSULT"

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    move-result v0

    .line 35
    .line 36
    if-nez v0, :cond_0

    .line 37
    goto :goto_1

    .line 38
    .line 39
    :sswitch_3
    const-string v1, "BUY_STATUS_ORDER_APPEALING_OTHER"

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    move-result v0

    .line 44
    .line 45
    if-nez v0, :cond_0

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    :goto_0
    const/4 v0, 0x1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->n6(Z)V

    .line 51
    .line 52
    :cond_1
    :goto_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 53
    return-object p0

    .line 54
    nop

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
    :sswitch_data_0
    .sparse-switch
        -0x2d80ece1 -> :sswitch_3
        -0x23e84d54 -> :sswitch_2
        0x730e05b3 -> :sswitch_1
        0x7724d140 -> :sswitch_0
    .end sparse-switch
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

.method public static synthetic V3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Long;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->n5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Long;)Lkotlin/Unit;

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

.method public static final V4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    move-result v1

    .line 7
    .line 8
    .line 9
    sparse-switch v1, :sswitch_data_0

    .line 10
    goto :goto_1

    .line 11
    .line 12
    :sswitch_0
    const-string v1, "SELL_STATUS_ORDER_APPEALING_OTHER_CONSULT"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    goto :goto_1

    .line 20
    .line 21
    :sswitch_1
    const-string v1, "SELL_STATUS_ORDER_APPEALING_OTHER"

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    move-result v0

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :sswitch_2
    const-string v1, "BUY_STATUS_ORDER_APPEALING_OTHER_CONSULT"

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    move-result v0

    .line 35
    .line 36
    if-nez v0, :cond_0

    .line 37
    goto :goto_1

    .line 38
    .line 39
    :sswitch_3
    const-string v1, "BUY_STATUS_ORDER_APPEALING_OTHER"

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    move-result v0

    .line 44
    .line 45
    if-nez v0, :cond_0

    .line 46
    goto :goto_1

    .line 47
    .line 48
    .line 49
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->l6()V

    .line 50
    .line 51
    :cond_1
    :goto_1
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
    :sswitch_data_0
    .sparse-switch
        -0x2d80ece1 -> :sswitch_3
        -0x23e84d54 -> :sswitch_2
        0x730e05b3 -> :sswitch_1
        0x7724d140 -> :sswitch_0
    .end sparse-switch
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

.method public static synthetic W3(ZLcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->q6(ZLcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final W4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    move-result v1

    .line 7
    .line 8
    .line 9
    const v2, -0x3c62529d

    .line 10
    .line 11
    if-eq v1, v2, :cond_a

    .line 12
    .line 13
    .line 14
    const v2, -0x914210a

    .line 15
    .line 16
    const-string v3, "pay_crypto_currency"

    .line 17
    .line 18
    const-string v4, "pay_fiat_currency"

    .line 19
    .line 20
    const-string v5, "B7P2POrderDetails"

    .line 21
    .line 22
    const-string v6, "1"

    .line 23
    const/4 v7, 0x0

    .line 24
    .line 25
    if-eq v1, v2, :cond_4

    .line 26
    .line 27
    .line 28
    const v2, 0x1c717c99

    .line 29
    .line 30
    if-eq v1, v2, :cond_0

    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :cond_0
    const-string v1, "SELL_STATUS_ORDER_PAY_COIN"

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    move-result v0

    .line 39
    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    goto/16 :goto_4

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getLegalCurrency()Ljava/lang/String;

    .line 58
    move-result-object v0

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    move-object v0, v7

    .line 61
    .line 62
    .line 63
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    .line 67
    invoke-static {v4, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 72
    move-result-object v1

    .line 73
    .line 74
    check-cast v1, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 78
    move-result-object v1

    .line 79
    .line 80
    if-eqz v1, :cond_3

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getCurrency()Ljava/lang/String;

    .line 84
    move-result-object v7

    .line 85
    .line 86
    .line 87
    :cond_3
    invoke-static {v7}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    .line 91
    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    .line 95
    filled-new-array {v0, v1}, [Lkotlin/Pair;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    const-string v1, "button"

    .line 99
    .line 100
    .line 101
    invoke-static {v5, v1, v6, v0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->x6()V

    .line 105
    .line 106
    goto/16 :goto_4

    .line 107
    .line 108
    :cond_4
    const-string v1, "BUY_STATUS_ORDER_WAIT_COIN"

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    move-result v0

    .line 113
    .line 114
    if-nez v0, :cond_5

    .line 115
    .line 116
    goto/16 :goto_4

    .line 117
    .line 118
    .line 119
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 120
    move-result-object v0

    .line 121
    .line 122
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 126
    move-result-object v0

    .line 127
    .line 128
    if-eqz v0, :cond_6

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getStatus()Ljava/lang/String;

    .line 132
    move-result-object v0

    .line 133
    goto :goto_1

    .line 134
    :cond_6
    move-object v0, v7

    .line 135
    .line 136
    .line 137
    :goto_1
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 138
    move-result-object v0

    .line 139
    .line 140
    const-string v1, "status"

    .line 141
    .line 142
    .line 143
    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 144
    move-result-object v0

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 148
    move-result-object v1

    .line 149
    .line 150
    check-cast v1, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 154
    move-result-object v1

    .line 155
    .line 156
    if-eqz v1, :cond_7

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getLegalCurrency()Ljava/lang/String;

    .line 160
    move-result-object v1

    .line 161
    goto :goto_2

    .line 162
    :cond_7
    move-object v1, v7

    .line 163
    .line 164
    .line 165
    :goto_2
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 166
    move-result-object v1

    .line 167
    .line 168
    .line 169
    invoke-static {v4, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 170
    move-result-object v1

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 174
    move-result-object v2

    .line 175
    .line 176
    check-cast v2, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 180
    move-result-object v2

    .line 181
    .line 182
    if-eqz v2, :cond_8

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getCurrency()Ljava/lang/String;

    .line 186
    move-result-object v2

    .line 187
    goto :goto_3

    .line 188
    :cond_8
    move-object v2, v7

    .line 189
    .line 190
    .line 191
    :goto_3
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 192
    move-result-object v2

    .line 193
    .line 194
    .line 195
    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 196
    move-result-object v2

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 200
    move-result-object v3

    .line 201
    .line 202
    check-cast v3, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v3}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 206
    move-result-object v3

    .line 207
    .line 208
    if-eqz v3, :cond_9

    .line 209
    .line 210
    .line 211
    invoke-virtual {v3}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->isP2PExpress()Z

    .line 212
    move-result v3

    .line 213
    .line 214
    .line 215
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 216
    move-result-object v7

    .line 217
    .line 218
    .line 219
    :cond_9
    invoke-static {v7}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 220
    move-result v3

    .line 221
    .line 222
    .line 223
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 224
    move-result-object v3

    .line 225
    .line 226
    const-string v4, "isP2PExpress"

    .line 227
    .line 228
    .line 229
    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 230
    move-result-object v3

    .line 231
    .line 232
    const-string v4, "norm_version"

    .line 233
    .line 234
    .line 235
    invoke-static {v4, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 236
    move-result-object v4

    .line 237
    .line 238
    .line 239
    filled-new-array {v0, v1, v2, v3, v4}, [Lkotlin/Pair;

    .line 240
    move-result-object v0

    .line 241
    .line 242
    const-string v1, "reminderSeller"

    .line 243
    .line 244
    .line 245
    invoke-static {v5, v1, v6, v0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 249
    move-result-object p0

    .line 250
    .line 251
    check-cast p0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 252
    .line 253
    .line 254
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->q0()V

    .line 255
    goto :goto_4

    .line 256
    .line 257
    :cond_a
    const-string v1, "BUY_STATUS_ORDER_CREATED"

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 261
    move-result v0

    .line 262
    .line 263
    if-eqz v0, :cond_b

    .line 264
    .line 265
    .line 266
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->q5()V

    .line 267
    .line 268
    :cond_b
    :goto_4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 269
    return-object p0
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
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
.end method

.method public static synthetic X3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->m6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/String;)Lkotlin/Unit;

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

.method public static final X4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getLegalCurrencyAmount()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/k;->b(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    sget v0, Lcom/kubi/otc/R$string;->copy_success:I

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 33
    move-result-object p0

    .line 34
    const/4 v0, 0x0

    .line 35
    .line 36
    new-array v0, v0, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    invoke-static {p0, v0}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 42
    return-object p0
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method public static synthetic Y3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->R4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final Y4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getId()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lcom/kubi/utils/k;->b(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    sget v0, Lcom/kubi/otc/R$string;->copy_success:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 31
    move-result-object p0

    .line 32
    const/4 v0, 0x0

    .line 33
    .line 34
    new-array v0, v0, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    invoke-static {p0, v0}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

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
.end method

.method public static synthetic Z3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->j5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Boolean;)Lkotlin/Unit;

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

.method public static final Z4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->g5()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x0

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getDisplayOpTradeInfo()Ljava/lang/Boolean;

    .line 26
    move-result-object v0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v0, v1

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 32
    move-result v0

    .line 33
    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 37
    .line 38
    sget-object v2, Lcom/kubi/payment/flutter/e;->a:Lcom/kubi/payment/flutter/e;

    .line 39
    .line 40
    const-string v3, "/payment/p2p/op/user/info"

    .line 41
    const/4 v4, 0x0

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v3, v4}, Lcom/kubi/payment/flutter/e;->a(Ljava/lang/String;Z)Ljava/lang/String;

    .line 45
    move-result-object v2

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 53
    move-result-object p0

    .line 54
    .line 55
    check-cast p0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 59
    move-result-object p0

    .line 60
    .line 61
    if-eqz p0, :cond_2

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getId()Ljava/lang/String;

    .line 65
    move-result-object v1

    .line 66
    .line 67
    :cond_2
    const-string p0, "orderId"

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p0, v1}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 71
    move-result-object p0

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lay/a;->k()Z

    .line 75
    goto :goto_1

    .line 76
    .line 77
    :cond_3
    sget-object v0, Lcom/kubi/payment/flutter/a;->a:Lcom/kubi/payment/flutter/a;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 81
    move-result-object p0

    .line 82
    .line 83
    check-cast p0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 87
    move-result-object p0

    .line 88
    .line 89
    if-eqz p0, :cond_4

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getAdId()Ljava/lang/String;

    .line 93
    move-result-object v1

    .line 94
    .line 95
    .line 96
    :cond_4
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    move-result-object p0

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, p0}, Lcom/kubi/payment/flutter/a;->d(Ljava/lang/String;)V

    .line 101
    .line 102
    :goto_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 103
    return-object p0
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

.method public static synthetic a4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Lcom/kubi/payment/p2p/data/entities/ReleaseCrypto;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->p5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Lcom/kubi/payment/p2p/data/entities/ReleaseCrypto;)Lkotlin/Unit;

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

.method public static final a5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V:Ljava/lang/String;

    .line 3
    .line 4
    const-string v1, "BUY_STATUS_ORDER_CHARGED"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V:Ljava/lang/String;

    .line 13
    .line 14
    const-string v1, "BUY_STATUS_EXPRESS_ORDER_FAILED"

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V:Ljava/lang/String;

    .line 23
    .line 24
    const-string v1, "BUY_STATUS_EXPRESS_ORDER_SUCCEEDED"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    move-result v0

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 34
    move-result-object p0

    .line 35
    .line 36
    check-cast p0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 40
    move-result-object p0

    .line 41
    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->isP2PExpress()Z

    .line 46
    move-result p0

    .line 47
    .line 48
    .line 49
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 50
    move-result-object p0

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/4 p0, 0x0

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-static {p0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 56
    move-result p0

    .line 57
    .line 58
    .line 59
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 60
    move-result-object p0

    .line 61
    .line 62
    const-string v0, "isP2PExpress"

    .line 63
    .line 64
    .line 65
    invoke-static {v0, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 66
    move-result-object p0

    .line 67
    .line 68
    .line 69
    filled-new-array {p0}, [Lkotlin/Pair;

    .line 70
    move-result-object p0

    .line 71
    .line 72
    const-string v0, "B7P2POrderDetails"

    .line 73
    .line 74
    const-string v1, "confirmDone"

    .line 75
    .line 76
    const-string v2, "1"

    .line 77
    .line 78
    .line 79
    invoke-static {v0, v1, v2, p0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 80
    .line 81
    sget-object p0, Lcom/kubi/sdk/mode/AppMode;->Companion:Lcom/kubi/sdk/mode/AppMode$Companion;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/kubi/sdk/mode/AppMode$Companion;->isLiteMode()Z

    .line 85
    move-result p0

    .line 86
    .line 87
    if-eqz p0, :cond_2

    .line 88
    .line 89
    const-string p0, "ConvertPage"

    .line 90
    .line 91
    .line 92
    invoke-static {p0}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    move-result-object p0

    .line 94
    .line 95
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 96
    .line 97
    const-string v1, "krn/router"

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 101
    move-result-object v0

    .line 102
    .line 103
    const-string v1, "biz"

    .line 104
    .line 105
    const-string v2, "convert"

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v1, v2}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 109
    move-result-object v0

    .line 110
    .line 111
    const-string v1, "entry"

    .line 112
    .line 113
    const-string v2, "main"

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v1, v2}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    const-string v1, "component"

    .line 120
    .line 121
    const-string v2, "kucoin_convert_rn"

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v1, v2}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 125
    move-result-object v0

    .line 126
    .line 127
    const-string v1, "route"

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v1, p0}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 131
    move-result-object p0

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Lay/a;->k()Z

    .line 135
    goto :goto_1

    .line 136
    .line 137
    :cond_2
    sget-object v0, Lf00/a;->a:Lf00/a;

    .line 138
    .line 139
    const/16 v7, 0x3f

    .line 140
    const/4 v8, 0x0

    .line 141
    const/4 v1, 0x0

    .line 142
    const/4 v2, 0x0

    .line 143
    const/4 v3, 0x0

    .line 144
    const/4 v4, 0x0

    .line 145
    const/4 v5, 0x0

    .line 146
    const/4 v6, 0x0

    .line 147
    .line 148
    .line 149
    invoke-static/range {v0 .. v8}, Lg00/f$a;->l(Lg00/f;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 150
    .line 151
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 152
    return-object p0
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

.method private final a6()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->F5()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getBuyerRole()Ljava/lang/Boolean;

    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 25
    move-result v0

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    sget-object v0, Lcom/kubi/payment/p2p/order/o1;->a:Lcom/kubi/payment/p2p/order/o1;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    check-cast v1, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lcom/kubi/payment/p2p/order/o1;->a(Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;)Ljava/lang/String;

    .line 43
    move-result-object v0

    .line 44
    goto :goto_1

    .line 45
    .line 46
    :cond_1
    sget-object v0, Lcom/kubi/payment/p2p/order/o1;->a:Lcom/kubi/payment/p2p/order/o1;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    check-cast v1, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lcom/kubi/payment/p2p/order/o1;->c(Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;)Ljava/lang/String;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    :goto_1
    iput-object v0, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V:Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->y4()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->E5()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->C5()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->Y5(Lft/r1;)V

    .line 81
    .line 82
    :cond_2
    iget-object v0, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V:Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 86
    move-result v1

    .line 87
    .line 88
    .line 89
    sparse-switch v1, :sswitch_data_0

    .line 90
    .line 91
    goto/16 :goto_2

    .line 92
    .line 93
    :sswitch_0
    const-string v1, "SELL_STATUS_ORDER_APPEALING_OWN_SERVICE"

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    move-result v0

    .line 98
    .line 99
    if-nez v0, :cond_e

    .line 100
    .line 101
    goto/16 :goto_2

    .line 102
    .line 103
    :sswitch_1
    const-string v1, "BUY_STATUS_EXPRESS_ORDER_SUCCEEDED"

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    move-result v0

    .line 108
    .line 109
    if-nez v0, :cond_3

    .line 110
    .line 111
    goto/16 :goto_2

    .line 112
    .line 113
    .line 114
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->O5()V

    .line 115
    return-void

    .line 116
    .line 117
    :sswitch_2
    const-string v1, "SELL_STATUS_ORDER_APPEALING_OTHER_CONSULT"

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    move-result v0

    .line 122
    .line 123
    if-nez v0, :cond_c

    .line 124
    .line 125
    goto/16 :goto_2

    .line 126
    .line 127
    :sswitch_3
    const-string v1, "SELL_STATUS_ORDER_APPEALING_OTHER"

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    move-result v0

    .line 132
    .line 133
    if-nez v0, :cond_d

    .line 134
    .line 135
    goto/16 :goto_2

    .line 136
    .line 137
    :sswitch_4
    const-string v1, "SELL_STATUS_ORDER_APPEALING_OWN_CONSULT"

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    move-result v0

    .line 142
    .line 143
    if-nez v0, :cond_14

    .line 144
    .line 145
    goto/16 :goto_2

    .line 146
    .line 147
    :sswitch_5
    const-string v1, "BUY_STATUS_ORDER_CANCELED"

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 151
    move-result v0

    .line 152
    .line 153
    if-nez v0, :cond_10

    .line 154
    .line 155
    goto/16 :goto_2

    .line 156
    .line 157
    :sswitch_6
    const-string v1, "BUY_STATUS_EXPRESS_ORDER_PROCESSING"

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    move-result v0

    .line 162
    .line 163
    if-nez v0, :cond_4

    .line 164
    .line 165
    goto/16 :goto_2

    .line 166
    .line 167
    .line 168
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->M5()V

    .line 169
    return-void

    .line 170
    .line 171
    :sswitch_7
    const-string v1, "BUY_STATUS_EXPRESS_ORDER_UNCONFIRMED"

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 175
    move-result v0

    .line 176
    .line 177
    if-nez v0, :cond_5

    .line 178
    .line 179
    goto/16 :goto_2

    .line 180
    .line 181
    .line 182
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->P5()V

    .line 183
    return-void

    .line 184
    .line 185
    :sswitch_8
    const-string v1, "SELL_STATUS_ORDER_CREATED"

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 189
    move-result v0

    .line 190
    .line 191
    if-nez v0, :cond_6

    .line 192
    .line 193
    goto/16 :goto_2

    .line 194
    .line 195
    .line 196
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->I5()V

    .line 197
    return-void

    .line 198
    .line 199
    :sswitch_9
    const-string v1, "SELL_STATUS_ORDER_PAY_COIN"

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    move-result v0

    .line 204
    .line 205
    if-nez v0, :cond_7

    .line 206
    .line 207
    goto/16 :goto_2

    .line 208
    .line 209
    .line 210
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->J5()V

    .line 211
    return-void

    .line 212
    .line 213
    :sswitch_a
    const-string v1, "BUY_STATUS_ORDER_APPEALING_OTHER_SERVICE"

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 217
    move-result v0

    .line 218
    .line 219
    if-nez v0, :cond_11

    .line 220
    .line 221
    goto/16 :goto_2

    .line 222
    .line 223
    :sswitch_b
    const-string v1, "BUY_STATUS_EXPRESS_ORDER_FAILED"

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 227
    move-result v0

    .line 228
    .line 229
    if-nez v0, :cond_8

    .line 230
    .line 231
    goto/16 :goto_2

    .line 232
    .line 233
    .line 234
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->L5()V

    .line 235
    return-void

    .line 236
    .line 237
    :sswitch_c
    const-string v1, "SELL_STATUS_ORDER_CHARGED"

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 241
    move-result v0

    .line 242
    .line 243
    if-nez v0, :cond_9

    .line 244
    .line 245
    goto/16 :goto_2

    .line 246
    .line 247
    .line 248
    :cond_9
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->H5()V

    .line 249
    return-void

    .line 250
    .line 251
    :sswitch_d
    const-string v1, "BUY_STATUS_EXPRESS_ORDER_CANCELED"

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 255
    move-result v0

    .line 256
    .line 257
    if-nez v0, :cond_a

    .line 258
    .line 259
    goto/16 :goto_2

    .line 260
    .line 261
    .line 262
    :cond_a
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->K5()V

    .line 263
    return-void

    .line 264
    .line 265
    :sswitch_e
    const-string v1, "BUY_STATUS_ORDER_WAIT_COIN"

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 269
    move-result v0

    .line 270
    .line 271
    if-nez v0, :cond_b

    .line 272
    .line 273
    goto/16 :goto_2

    .line 274
    .line 275
    .line 276
    :cond_b
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->B5()V

    .line 277
    return-void

    .line 278
    .line 279
    :sswitch_f
    const-string v1, "BUY_STATUS_ORDER_APPEALING_OTHER_CONSULT"

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 283
    move-result v0

    .line 284
    .line 285
    if-nez v0, :cond_c

    .line 286
    .line 287
    goto/16 :goto_2

    .line 288
    .line 289
    .line 290
    :cond_c
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->R5()V

    .line 291
    return-void

    .line 292
    .line 293
    :sswitch_10
    const-string v1, "BUY_STATUS_ORDER_APPEALING_OTHER"

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 297
    move-result v0

    .line 298
    .line 299
    if-nez v0, :cond_d

    .line 300
    goto :goto_2

    .line 301
    .line 302
    .line 303
    :cond_d
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->T5()V

    .line 304
    return-void

    .line 305
    .line 306
    :sswitch_11
    const-string v1, "BUY_STATUS_ORDER_APPEALING_OWN_SERVICE"

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 310
    move-result v0

    .line 311
    .line 312
    if-nez v0, :cond_e

    .line 313
    goto :goto_2

    .line 314
    .line 315
    .line 316
    :cond_e
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V5()V

    .line 317
    return-void

    .line 318
    .line 319
    :sswitch_12
    const-string v1, "BUY_STATUS_ORDER_CREATED"

    .line 320
    .line 321
    .line 322
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 323
    move-result v0

    .line 324
    .line 325
    if-nez v0, :cond_f

    .line 326
    goto :goto_2

    .line 327
    .line 328
    .line 329
    :cond_f
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->A5()V

    .line 330
    return-void

    .line 331
    .line 332
    :sswitch_13
    const-string v1, "SELL_STATUS_ORDER_CANCELED"

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 336
    move-result v0

    .line 337
    .line 338
    if-nez v0, :cond_10

    .line 339
    goto :goto_2

    .line 340
    .line 341
    .line 342
    :cond_10
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->X5()V

    .line 343
    return-void

    .line 344
    .line 345
    :sswitch_14
    const-string v1, "SELL_STATUS_ORDER_APPEALING_OTHER_SERVICE"

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 349
    move-result v0

    .line 350
    .line 351
    if-nez v0, :cond_11

    .line 352
    goto :goto_2

    .line 353
    .line 354
    .line 355
    :cond_11
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->S5()V

    .line 356
    return-void

    .line 357
    .line 358
    :sswitch_15
    const-string v1, "BUY_STATUS_ORDER_CHARGED"

    .line 359
    .line 360
    .line 361
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 362
    move-result v0

    .line 363
    .line 364
    if-nez v0, :cond_12

    .line 365
    goto :goto_2

    .line 366
    .line 367
    .line 368
    :cond_12
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->z5()V

    .line 369
    return-void

    .line 370
    .line 371
    :sswitch_16
    const-string v1, "SELL_STATUS_ORDER_APPEALING_OWN"

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 375
    move-result v0

    .line 376
    .line 377
    if-nez v0, :cond_13

    .line 378
    goto :goto_2

    .line 379
    .line 380
    :sswitch_17
    const-string v1, "BUY_STATUS_ORDER_APPEALING_OWN"

    .line 381
    .line 382
    .line 383
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 384
    move-result v0

    .line 385
    .line 386
    if-nez v0, :cond_13

    .line 387
    goto :goto_2

    .line 388
    .line 389
    .line 390
    :cond_13
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->W5()V

    .line 391
    return-void

    .line 392
    .line 393
    :sswitch_18
    const-string v1, "BUY_STATUS_ORDER_APPEALING_OWN_CONSULT"

    .line 394
    .line 395
    .line 396
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 397
    move-result v0

    .line 398
    .line 399
    if-nez v0, :cond_14

    .line 400
    :goto_2
    return-void

    .line 401
    .line 402
    .line 403
    :cond_14
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->U5()V

    .line 404
    return-void

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
    :sswitch_data_0
    .sparse-switch
        -0x7560f71e -> :sswitch_18
        -0x68bd00ab -> :sswitch_17
        -0x4daa7917 -> :sswitch_16
        -0x4da39d55 -> :sswitch_15
        -0x4b4e63f7 -> :sswitch_14
        -0x3e4cceb6 -> :sswitch_13
        -0x3c62529d -> :sswitch_12
        -0x37d42c55 -> :sswitch_11
        -0x2d80ece1 -> :sswitch_10
        -0x23e84d54 -> :sswitch_f
        -0x914210a -> :sswitch_e
        0xb535a2d -> :sswitch_d
        0x1181293f -> :sswitch_c
        0x1492c2d1 -> :sswitch_b
        0x19a47d75 -> :sswitch_a
        0x1c717c99 -> :sswitch_9
        0x22c273f7 -> :sswitch_8
        0x2a5266b2 -> :sswitch_7
        0x2c75eba7 -> :sswitch_6
        0x3c3f255e -> :sswitch_5
        0x41cabc76 -> :sswitch_4
        0x730e05b3 -> :sswitch_3
        0x7724d140 -> :sswitch_2
        0x7b0e9f2d -> :sswitch_1
        0x7f57873f -> :sswitch_0
    .end sparse-switch
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

.method public static synthetic b4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->c5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final b5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    check-cast p0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 10
    move-result-object p0

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->isP2PExpress()Z

    .line 16
    move-result p0

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    move-result-object p0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-static {p0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 26
    move-result p0

    .line 27
    .line 28
    .line 29
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 30
    move-result-object p0

    .line 31
    .line 32
    const-string v0, "isP2PExpress"

    .line 33
    .line 34
    .line 35
    invoke-static {v0, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 36
    move-result-object p0

    .line 37
    .line 38
    .line 39
    filled-new-array {p0}, [Lkotlin/Pair;

    .line 40
    move-result-object p0

    .line 41
    .line 42
    const-string v0, "B7P2POrderDetails"

    .line 43
    .line 44
    const-string v1, "viewAssets"

    .line 45
    .line 46
    const-string v2, "1"

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v1, v2, p0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 50
    .line 51
    sget-object v3, Lf00/a;->a:Lf00/a;

    .line 52
    .line 53
    const/16 v8, 0xf

    .line 54
    const/4 v9, 0x0

    .line 55
    const/4 v4, 0x0

    .line 56
    const/4 v5, 0x0

    .line 57
    const/4 v6, 0x0

    .line 58
    const/4 v7, 0x0

    .line 59
    .line 60
    .line 61
    invoke-static/range {v3 .. v9}, Lg00/f$a;->b(Lg00/f;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 64
    return-object p0
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

.method public static synthetic c4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->T4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final c5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
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
    move-result-object p0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1, p0}, Lcom/kubi/payment/p2p/P2PHelper;->d(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/LifecycleCoroutineScope;)V

    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 21
    return-object p0
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

.method public static synthetic d4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->Z4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final d5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->P2P:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object p0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->C6()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    check-cast p0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 24
    move-result-object p0

    .line 25
    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->isP2PExpress()Z

    .line 30
    move-result p0

    .line 31
    .line 32
    .line 33
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    move-result-object p0

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 p0, 0x0

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-static {p0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 40
    move-result p0

    .line 41
    .line 42
    .line 43
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 44
    move-result-object p0

    .line 45
    .line 46
    const-string v0, "isP2PExpress"

    .line 47
    .line 48
    .line 49
    invoke-static {v0, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 50
    move-result-object p0

    .line 51
    .line 52
    .line 53
    filled-new-array {p0}, [Lkotlin/Pair;

    .line 54
    move-result-object p0

    .line 55
    .line 56
    const-string v0, "B7P2POrderDetails"

    .line 57
    .line 58
    const-string v1, "contactUser"

    .line 59
    .line 60
    const-string v2, "1"

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v1, v2, p0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 64
    .line 65
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 66
    return-object p0
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

.method public static synthetic e4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->w5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Throwable;)V

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

.method public static synthetic e6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p2, p2, 0x1

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    const/4 p1, 0x0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->d6(Z)V

    .line 9
    return-void
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
.end method

.method public static synthetic f4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Long;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->o5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Long;)Lkotlin/Unit;

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

.method private static final f6()Z
    .locals 8

    .line 1
    .line 2
    const-string v0, "payment_android_p2p_release"

    .line 3
    .line 4
    :try_start_0
    sget-object v1, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/payment/p2p/order/OrderDetailFragment$c;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment$c;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    const-string v2, "object : TypeToken<T>() {}.type"

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 22
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    move-object v2, v0

    .line 26
    .line 27
    new-instance v1, Lcom/kubi/config/exception/KCConfigException;

    .line 28
    .line 29
    const/16 v6, 0x8

    .line 30
    const/4 v7, 0x0

    .line 31
    .line 32
    const-string v3, "RemoteConfig"

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    .line 36
    .line 37
    invoke-direct/range {v1 .. v7}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    const/4 v0, 0x2

    .line 39
    const/4 v2, 0x0

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 43
    move-object v0, v2

    .line 44
    .line 45
    :goto_0
    check-cast v0, Ljava/lang/Boolean;

    .line 46
    const/4 v1, 0x1

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 50
    move-result v0

    .line 51
    return v0
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

.method public static synthetic g4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Lcom/kubi/otc/entity/AdPayType;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->A6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Lcom/kubi/otc/entity/AdPayType;)Lkotlin/Unit;

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

.method public static synthetic h4()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->L4()Lkotlin/Unit;

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

.method public static synthetic i4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Landroid/content/Intent;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->F4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Landroid/content/Intent;)V

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

.method public static final i5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

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
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 10
    move-result-object p0

    .line 11
    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    iget-object p0, p0, Lft/r1;->P:Lcom/kubi/resources/widget/BaseTextView;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 20
    goto :goto_0

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 24
    move-result-object p0

    .line 25
    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    iget-object p0, p0, Lft/r1;->P:Lcom/kubi/resources/widget/BaseTextView;

    .line 29
    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-static {p0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 34
    .line 35
    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 36
    return-object p0
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

.method public static final i6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    check-cast p0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->M()V

    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    return-object p0
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

.method public static synthetic j4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->k6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final j5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

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
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->showContentView()V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->a6()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->G6()V

    .line 16
    .line 17
    :cond_0
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

.method public static synthetic k4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->y6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final k5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    move-result p1

    .line 5
    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->E6()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 13
    move-result-object p0

    .line 14
    .line 15
    check-cast p0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 19
    move-result-object p0

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getBuyerRole()Ljava/lang/Boolean;

    .line 25
    move-result-object p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-static {p0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 31
    move-result p0

    .line 32
    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    const-string p0, "Buy"

    .line 36
    goto :goto_1

    .line 37
    .line 38
    :cond_1
    const-string p0, "Sell"

    .line 39
    .line 40
    :goto_1
    const-string p1, "type"

    .line 41
    .line 42
    .line 43
    invoke-static {p1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 44
    move-result-object p0

    .line 45
    .line 46
    .line 47
    filled-new-array {p0}, [Lkotlin/Pair;

    .line 48
    move-result-object p0

    .line 49
    .line 50
    const-string p1, "B7P2POrderDetails"

    .line 51
    .line 52
    const-string v0, "orderPage"

    .line 53
    .line 54
    const-string v1, "1"

    .line 55
    .line 56
    .line 57
    invoke-static {p1, v0, v1, p0}, Lqq/m;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 58
    .line 59
    :cond_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 60
    return-object p0
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

.method public static final k6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/payment/flutter/e;->a:Lcom/kubi/payment/flutter/e;

    .line 5
    .line 6
    const-string v2, "payment/p2p/cancelOrder"

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static {v1, v2, v3, v4, v5}, Lcom/kubi/payment/flutter/e;->b(Lcom/kubi/payment/flutter/e;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    check-cast v1, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getId()Ljava/lang/String;

    .line 33
    move-result-object v1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v1, v5

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    const-string v2, "orderId"

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2, v1}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    check-cast v1, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getStatus()Ljava/lang/String;

    .line 61
    move-result-object v1

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move-object v1, v5

    .line 64
    .line 65
    :goto_1
    const-string v2, "orderStatus"

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v2, v1}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    check-cast v1, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 79
    move-result-object v1

    .line 80
    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getLegalCurrency()Ljava/lang/String;

    .line 85
    move-result-object v1

    .line 86
    goto :goto_2

    .line 87
    :cond_2
    move-object v1, v5

    .line 88
    .line 89
    .line 90
    :goto_2
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    move-result-object v1

    .line 92
    .line 93
    const-string v2, "fiatCurrency"

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v2, v1}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 101
    move-result-object p0

    .line 102
    .line 103
    check-cast p0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 107
    move-result-object p0

    .line 108
    .line 109
    if-eqz p0, :cond_3

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getCurrency()Ljava/lang/String;

    .line 113
    move-result-object v5

    .line 114
    .line 115
    .line 116
    :cond_3
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    move-result-object p0

    .line 118
    .line 119
    const-string v1, "cryptoCurrency"

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v1, p0}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 123
    move-result-object p0

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Lay/a;->k()Z

    .line 127
    .line 128
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 129
    return-object p0
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

.method public static synthetic l4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->K4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final l5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

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
    .line 9
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->G5()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->f5()Z

    .line 13
    move-result p1

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 19
    move-result-object p0

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    iget-object p0, p0, Lft/r1;->l:Landroidx/appcompat/widget/AppCompatImageView;

    .line 24
    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-static {p0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 29
    goto :goto_0

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 33
    move-result-object p0

    .line 34
    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    iget-object p0, p0, Lft/r1;->l:Landroidx/appcompat/widget/AppCompatImageView;

    .line 38
    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    .line 42
    invoke-static {p0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 43
    .line 44
    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 45
    return-object p0
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

.method public static synthetic m4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->U4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final m5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

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
    .line 9
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 10
    move-result-object p0

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, Lft/r1;->Y:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    const/4 p1, 0x0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 21
    .line 22
    :cond_0
    sget p0, Lcom/kubi/otc/R$string;->payment_p2p_order_call_coin_toast_new:I

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, Lcom/kubi/utils/ToastCompat;->C(I)V

    .line 26
    .line 27
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 28
    return-object p0
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

.method public static final m6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/String;)Lkotlin/Unit;
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
    move-result-object p0

    .line 10
    .line 11
    check-cast p0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->N(Ljava/lang/String;)V

    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 17
    return-object p0
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

.method public static synthetic n4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->S4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final n5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Long;)Lkotlin/Unit;
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V:Ljava/lang/String;

    .line 3
    .line 4
    const-string v1, "BUY_STATUS_ORDER_CREATED"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    move-result v1

    .line 9
    .line 10
    const-string v2, "getCountdownMinSec(...)"

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, v0, Lft/r1;->l0:Lcom/kubi/resources/widget/BaseTextView;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    sget v4, Lcom/kubi/otc/R$string;->payment_p2p_order_created_subtitle_buyer:I

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 31
    move-result-wide v5

    .line 32
    .line 33
    .line 34
    invoke-static {v5, v6}, Lcom/kubi/utils/TimeUtils;->d(J)Ljava/lang/String;

    .line 35
    move-result-object v5

    .line 36
    .line 37
    .line 38
    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    const/16 v8, 0xc

    .line 41
    const/4 v9, 0x0

    .line 42
    const/4 v6, 0x0

    .line 43
    const/4 v7, 0x0

    .line 44
    move-object v3, p0

    .line 45
    .line 46
    .line 47
    invoke-static/range {v3 .. v9}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->C4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;ILjava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Landroid/text/SpannableString;

    .line 48
    move-result-object p0

    .line 49
    move-object v1, v3

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move-object v1, p0

    .line 55
    .line 56
    .line 57
    :goto_0
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 61
    move-result-wide p0

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, p0, p1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->z4(J)V

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    move-object v1, p0

    .line 67
    .line 68
    const-string p0, "SELL_STATUS_ORDER_CREATED"

    .line 69
    .line 70
    .line 71
    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    move-result p0

    .line 73
    .line 74
    if-eqz p0, :cond_2

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 78
    move-result-object p0

    .line 79
    .line 80
    if-eqz p0, :cond_2

    .line 81
    .line 82
    iget-object p0, p0, Lft/r1;->l0:Lcom/kubi/resources/widget/BaseTextView;

    .line 83
    .line 84
    if-eqz p0, :cond_2

    .line 85
    move-object v0, v2

    .line 86
    .line 87
    sget v2, Lcom/kubi/otc/R$string;->payment_detail_sell_create_sub_title:I

    .line 88
    .line 89
    .line 90
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 94
    move-result-wide v3

    .line 95
    .line 96
    .line 97
    invoke-static {v3, v4}, Lcom/kubi/utils/TimeUtils;->d(J)Ljava/lang/String;

    .line 98
    move-result-object v3

    .line 99
    .line 100
    .line 101
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    const/16 v6, 0xc

    .line 104
    const/4 v7, 0x0

    .line 105
    const/4 v4, 0x0

    .line 106
    const/4 v5, 0x0

    .line 107
    .line 108
    .line 109
    invoke-static/range {v1 .. v7}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->C4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;ILjava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Landroid/text/SpannableString;

    .line 110
    move-result-object p1

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 114
    .line 115
    :cond_2
    :goto_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 116
    return-object p0
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

.method public static synthetic o4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->i5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Boolean;)Lkotlin/Unit;

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

.method public static final o5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Long;)Lkotlin/Unit;
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, v0, Lft/r1;->l0:Lcom/kubi/resources/widget/BaseTextView;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    sget v2, Lcom/kubi/otc/R$string;->payment_p2p_order_payedMoney_subtitle_buyer:I

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 19
    move-result-wide v3

    .line 20
    .line 21
    .line 22
    invoke-static {v3, v4}, Lcom/kubi/utils/TimeUtils;->d(J)Ljava/lang/String;

    .line 23
    move-result-object v3

    .line 24
    .line 25
    const-string p1, "getCountdownMinSec(...)"

    .line 26
    .line 27
    .line 28
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    check-cast p1, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getCurrency()Ljava/lang/String;

    .line 44
    move-result-object p1

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 p1, 0x0

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    move-result-object v4

    .line 51
    .line 52
    const/16 v6, 0x8

    .line 53
    const/4 v7, 0x0

    .line 54
    const/4 v5, 0x0

    .line 55
    move-object v1, p0

    .line 56
    .line 57
    .line 58
    invoke-static/range {v1 .. v7}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->C4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;ILjava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Landroid/text/SpannableString;

    .line 59
    move-result-object p0

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 63
    .line 64
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 65
    return-object p0
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
.end method

.method public static synthetic o6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p2, p2, 0x1

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    const/4 p1, 0x0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->n6(Z)V

    .line 9
    return-void
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
.end method

.method public static synthetic p4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->w6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final p5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Lcom/kubi/payment/p2p/data/entities/ReleaseCrypto;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->G4(Lcom/kubi/payment/p2p/data/entities/ReleaseCrypto;)V

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

.method public static final p6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    check-cast p0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->A0()V

    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    return-object p0
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

.method public static synthetic q4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->v5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Object;)V

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

.method public static final q6(ZLcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    return-object p0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    check-cast p0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->I0(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->u6()V

    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 21
    return-object p0
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

.method public static synthetic r4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final r5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)V
    .locals 5

    .line 1
    .line 2
    const-string v0, "viewHolder"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "<unused var>"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget p2, Lcom/kubi/otc/R$id;->text_view:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    check-cast p1, Landroid/widget/TextView;

    .line 19
    .line 20
    sget p2, Lcom/kubi/otc/R$string;->payment_p2p_price_alert:I

    .line 21
    const/4 v0, 0x0

    .line 22
    .line 23
    new-array v0, v0, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p2, v0}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    move-result-object p0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    sget-object p0, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 36
    .line 37
    new-instance p2, Lkotlin/Pair;

    .line 38
    .line 39
    sget-object v0, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 40
    .line 41
    new-instance v1, Landroid/text/style/UnderlineSpan;

    .line 42
    .line 43
    .line 44
    invoke-direct {v1}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-direct {p2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    new-instance v1, Lkotlin/Pair;

    .line 50
    .line 51
    new-instance v2, Lcom/kubi/utils/c0;

    .line 52
    .line 53
    sget v3, Lcom/kubi/otc/R$color;->primary:I

    .line 54
    .line 55
    new-instance v4, Lcom/kubi/payment/p2p/order/r0;

    .line 56
    .line 57
    .line 58
    invoke-direct {v4}, Lcom/kubi/payment/p2p/order/r0;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-direct {v2, v3, v4}, Lcom/kubi/utils/c0;-><init>(ILandroid/view/View$OnClickListener;)V

    .line 62
    .line 63
    .line 64
    invoke-direct {v1, v0, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    filled-new-array {p2, v1}, [Lkotlin/Pair;

    .line 68
    move-result-object p2

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, p1, p2}, Lcom/kubi/resources/HighlightTextHelper;->f(Landroid/widget/TextView;[Lkotlin/Pair;)V

    .line 72
    .line 73
    .line 74
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 75
    move-result-object p0

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 79
    return-void
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

.method public static synthetic s4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->Q4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final s5(Landroid/view/View;)V
    .locals 10

    .line 1
    .line 2
    sget-object v0, Lf00/a;->a:Lf00/a;

    .line 3
    .line 4
    sget-object p0, Let/d;->a:Let/d;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Let/d;->a()Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    const/16 v8, 0x7e

    .line 11
    const/4 v9, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static/range {v0 .. v9}, Lg00/r$a;->a(Lg00/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 21
    return-void
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

.method public static final s6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    check-cast p0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v0, v1, v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->O(Lcom/kubi/payment/p2p/order/OrderDetailViewModel;Ljava/lang/String;ILjava/lang/Object;)V

    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    return-object p0
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

.method public static synthetic t4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->d5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final t5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->E4()V

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

.method public static final t6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->I0(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->u6()V

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

.method public static synthetic u3(Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->s5(Landroid/view/View;)V

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

.method public static final synthetic u4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Landroid/content/Context;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

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

.method public static synthetic v3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->O4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final synthetic v4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lft/r1;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

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

.method public static final v5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Object;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->hideDialogLoading()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 7
    move-result-object p0

    .line 8
    .line 9
    check-cast p0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x2

    .line 12
    .line 13
    const-string v1, "v2/otc/order/pay-coin"

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v1, p1, v0, p1}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->C0(Lcom/kubi/payment/p2p/order/OrderDetailViewModel;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 17
    return-void
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

.method public static final v6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->r6()V

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

.method public static synthetic w3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->p6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final synthetic w4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lcom/kubi/payment/p2p/order/OrderDetailViewModel;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    check-cast p0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    return-object p0
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

.method public static final w5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->hideDialogLoading()V

    .line 4
    .line 5
    instance-of v0, p1, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p1, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->showToast(Ljava/lang/String;)V

    .line 17
    :cond_0
    return-void
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

.method public static final w6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v2, v0, v1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->o6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;ZILjava/lang/Object;)V

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
.end method

.method public static synthetic x3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->N4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final synthetic x4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->C6()V

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

.method public static synthetic y3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->J4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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

.method public static final y5(Lcom/kubi/payment/p2p/order/OrderDetailFragment;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;)Lkotlin/Unit;
    .locals 7

    .line 1
    .line 2
    const-string p4, "<unused var>"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    .line 12
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    .line 13
    move-result p2

    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    goto :goto_0

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 20
    move-result-object p0

    .line 21
    .line 22
    check-cast p0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 23
    .line 24
    const-string p1, "v3/otc/order/pay-coin"

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1, p3}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->B0(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    goto :goto_1

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    const p2, 0x1340a

    .line 32
    .line 33
    if-ne p1, p2, :cond_2

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->u5()V

    .line 37
    goto :goto_1

    .line 38
    .line 39
    :cond_2
    new-instance v1, Ljava/lang/Exception;

    .line 40
    .line 41
    new-instance p0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    const-string p1, "safe validation fallback: "

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string p1, ", serverErrorCode"

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    move-result-object p0

    .line 65
    .line 66
    .line 67
    invoke-direct {v1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    new-instance v0, Lcom/kubi/otc/exception/OtcException;

    .line 70
    .line 71
    const/16 v5, 0x8

    .line 72
    const/4 v6, 0x0

    .line 73
    .line 74
    const-string v2, "payment_p2p_release"

    .line 75
    const/4 v3, 0x0

    .line 76
    const/4 v4, 0x0

    .line 77
    .line 78
    .line 79
    invoke-direct/range {v0 .. v6}, Lcom/kubi/otc/exception/OtcException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 80
    const/4 p0, 0x2

    .line 81
    const/4 p1, 0x0

    .line 82
    .line 83
    .line 84
    invoke-static {v0, p1, p0, p1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 85
    .line 86
    :goto_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 87
    return-object p0
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
.end method

.method public static final y6(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->A4()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->x5()V

    .line 10
    goto :goto_0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->u5()V

    .line 14
    .line 15
    :goto_0
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

.method public static synthetic z3(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)Lkotlin/Unit;

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


# virtual methods
.method public final A5()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lft/r1;->s0:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, v0, Lft/r1;->Z0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v0, v0, Lft/r1;->E0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    iget-object v0, v0, Lft/r1;->L0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    iget-object v0, v0, Lft/r1;->t0:Lcom/kubi/resources/widget/BaseTextView;

    .line 61
    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    sget v1, Lcom/kubi/otc/R$string;->payment_p2p_order_created_title:I

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    .line 73
    .line 74
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    if-eqz v0, :cond_5

    .line 78
    .line 79
    iget-object v0, v0, Lft/r1;->s0:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 80
    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    sget v1, Lcom/kubi/otc/R$string;->payment_p2p_order_created_desc_buyer:I

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 87
    move-result-object v1

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    .line 92
    .line 93
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 94
    move-result-object v0

    .line 95
    .line 96
    if-eqz v0, :cond_6

    .line 97
    .line 98
    iget-object v0, v0, Lft/r1;->Y:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 99
    .line 100
    if-eqz v0, :cond_6

    .line 101
    .line 102
    sget v1, Lcom/kubi/otc/R$string;->payment_p2p_order_go_transfer:I

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 106
    move-result-object v1

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 110
    .line 111
    .line 112
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 113
    move-result-object v0

    .line 114
    .line 115
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->L0()V

    .line 119
    return-void
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

.method public final B4(ILjava/lang/String;Ljava/lang/String;I)Landroid/text/SpannableString;
    .locals 6
    .param p1    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param
    .param p4    # I
        .annotation build Landroidx/annotation/ColorRes;
        .end annotation
    .end param

    .line 1
    .line 2
    new-instance v0, Landroid/text/SpannableString;

    .line 3
    .line 4
    .line 5
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    .line 6
    move-result v1

    .line 7
    .line 8
    if-lez v1, :cond_0

    .line 9
    .line 10
    .line 11
    filled-new-array {p2, p3}, [Ljava/lang/Object;

    .line 12
    move-result-object p3

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p3}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    move-result-object p1

    .line 17
    goto :goto_0

    .line 18
    .line 19
    .line 20
    :cond_0
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 21
    move-result-object p3

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1, p3}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-direct {v0, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    new-instance p1, Landroid/text/style/ForegroundColorSpan;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p4}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 34
    move-result p3

    .line 35
    .line 36
    .line 37
    invoke-direct {p1, p3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 38
    const/4 v4, 0x6

    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v2, 0x0

    .line 41
    const/4 v3, 0x0

    .line 42
    move-object v1, p2

    .line 43
    .line 44
    .line 45
    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 46
    move-result p2

    .line 47
    .line 48
    .line 49
    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 50
    move-result p3

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 54
    move-result p4

    .line 55
    add-int/2addr p3, p4

    .line 56
    .line 57
    const/16 p4, 0x12

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 61
    return-object v0
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
.end method

.method public final B5()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lft/r1;->s0:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, v0, Lft/r1;->A0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v0, v0, Lft/r1;->H:Lcom/kubi/resources/widget/BaseTextView;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    iget-object v0, v0, Lft/r1;->Z0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    iget-object v0, v0, Lft/r1;->H:Lcom/kubi/resources/widget/BaseTextView;

    .line 61
    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 66
    .line 67
    .line 68
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    iget-object v0, v0, Lft/r1;->E0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 74
    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 82
    move-result-object v0

    .line 83
    .line 84
    if-eqz v0, :cond_6

    .line 85
    .line 86
    iget-object v0, v0, Lft/r1;->F:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 87
    .line 88
    if-eqz v0, :cond_6

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 92
    .line 93
    .line 94
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 95
    move-result-object v0

    .line 96
    .line 97
    if-eqz v0, :cond_7

    .line 98
    .line 99
    iget-object v0, v0, Lft/r1;->L0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 100
    .line 101
    if-eqz v0, :cond_7

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 105
    .line 106
    .line 107
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 108
    move-result-object v0

    .line 109
    .line 110
    if-eqz v0, :cond_8

    .line 111
    .line 112
    iget-object v0, v0, Lft/r1;->W0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 113
    .line 114
    if-eqz v0, :cond_8

    .line 115
    .line 116
    .line 117
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 118
    .line 119
    .line 120
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 121
    move-result-object v0

    .line 122
    .line 123
    if-eqz v0, :cond_9

    .line 124
    .line 125
    iget-object v0, v0, Lft/r1;->t0:Lcom/kubi/resources/widget/BaseTextView;

    .line 126
    .line 127
    if-eqz v0, :cond_9

    .line 128
    .line 129
    sget v1, Lcom/kubi/otc/R$string;->payment_p2p_order_wait_seller_confirm:I

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 133
    move-result-object v1

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    .line 138
    .line 139
    :cond_9
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 140
    move-result-object v0

    .line 141
    .line 142
    if-eqz v0, :cond_a

    .line 143
    .line 144
    iget-object v0, v0, Lft/r1;->s0:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 145
    .line 146
    if-eqz v0, :cond_a

    .line 147
    .line 148
    sget v1, Lcom/kubi/otc/R$string;->payment_p2p_order_payedMoney_desc_buyer:I

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 152
    move-result-object v1

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 156
    .line 157
    .line 158
    :cond_a
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 159
    move-result-object v0

    .line 160
    .line 161
    if-eqz v0, :cond_b

    .line 162
    .line 163
    iget-object v0, v0, Lft/r1;->Y:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 164
    .line 165
    if-eqz v0, :cond_b

    .line 166
    .line 167
    sget v1, Lcom/kubi/otc/R$string;->payment_p2p_order_call_coin:I

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 171
    move-result-object v1

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 175
    .line 176
    .line 177
    :cond_b
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 178
    move-result-object v0

    .line 179
    .line 180
    if-eqz v0, :cond_d

    .line 181
    .line 182
    iget-object v0, v0, Lft/r1;->Y:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 183
    .line 184
    if-eqz v0, :cond_d

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 188
    move-result-object v1

    .line 189
    .line 190
    check-cast v1, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 194
    move-result-object v1

    .line 195
    .line 196
    if-eqz v1, :cond_c

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getEnableNotifyPayCoin()Ljava/lang/Boolean;

    .line 200
    move-result-object v1

    .line 201
    goto :goto_0

    .line 202
    :cond_c
    const/4 v1, 0x0

    .line 203
    .line 204
    .line 205
    :goto_0
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 206
    move-result v1

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 210
    .line 211
    .line 212
    :cond_d
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 213
    move-result-object v0

    .line 214
    .line 215
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->D0()V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 222
    move-result-object v0

    .line 223
    .line 224
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->M0()V

    .line 228
    return-void
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

.method public final B6(Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getFeeMessage()Ljava/lang/String;

    .line 7
    move-result-object p1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p1, v0

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 17
    move-result v1

    .line 18
    .line 19
    if-lez v1, :cond_3

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iget-object v1, v1, Lft/r1;->p0:Lcom/kubi/resources/widget/BaseTextView;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    iget-object p1, p1, Lft/r1;->i:Landroidx/constraintlayout/widget/Group;

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    new-instance v1, Lcom/kubi/payment/p2p/order/OrderDetailFragment$showTaxInfo$1;

    .line 52
    .line 53
    .line 54
    invoke-direct {v1, p0, v0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment$showTaxInfo$1;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;Lkotlin/coroutines/Continuation;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 58
    return-void

    .line 59
    .line 60
    .line 61
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    if-eqz p1, :cond_4

    .line 65
    .line 66
    iget-object p1, p1, Lft/r1;->i:Landroidx/constraintlayout/widget/Group;

    .line 67
    .line 68
    if-eqz p1, :cond_4

    .line 69
    .line 70
    .line 71
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 72
    .line 73
    .line 74
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 75
    move-result-object p1

    .line 76
    .line 77
    if-eqz p1, :cond_5

    .line 78
    .line 79
    iget-object p1, p1, Lft/r1;->s:Landroidx/appcompat/widget/AppCompatImageView;

    .line 80
    .line 81
    if-eqz p1, :cond_5

    .line 82
    .line 83
    .line 84
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 85
    :cond_5
    return-void
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

.method public final C5()V
    .locals 14

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    new-instance v1, Lcom/kubi/payment/p2p/widget/P2PViewChatCardEntrance$P2PChatCardEntranceInfo;

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getOpUserInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$OpUserInfo;

    .line 19
    move-result-object v3

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$OpUserInfo;->getLetter()Ljava/lang/String;

    .line 25
    move-result-object v3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v3, v2

    .line 28
    .line 29
    :goto_0
    if-eqz v0, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getOpUserInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$OpUserInfo;

    .line 33
    move-result-object v4

    .line 34
    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$OpUserInfo;->getNickName()Ljava/lang/String;

    .line 39
    move-result-object v4

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move-object v4, v2

    .line 42
    .line 43
    :goto_1
    if-eqz v0, :cond_2

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getOpUserInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$OpUserInfo;

    .line 47
    move-result-object v5

    .line 48
    .line 49
    if-eqz v5, :cond_2

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$OpUserInfo;->isMerchant()Ljava/lang/Boolean;

    .line 53
    move-result-object v5

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    move-object v5, v2

    .line 56
    .line 57
    .line 58
    :goto_2
    invoke-static {v5}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 59
    move-result v5

    .line 60
    .line 61
    if-eqz v5, :cond_7

    .line 62
    .line 63
    new-instance v6, Lcom/kubi/payment/p2p/trade/MerchantQualificationDialog$MerchantQualification;

    .line 64
    const/4 v5, 0x0

    .line 65
    const/4 v7, 0x1

    .line 66
    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getOpUserInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$OpUserInfo;

    .line 71
    move-result-object v8

    .line 72
    .line 73
    if-eqz v8, :cond_4

    .line 74
    .line 75
    .line 76
    invoke-virtual {v8}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$OpUserInfo;->getFoxKingMerchant()Ljava/lang/Integer;

    .line 77
    move-result-object v8

    .line 78
    .line 79
    if-nez v8, :cond_3

    .line 80
    goto :goto_3

    .line 81
    .line 82
    .line 83
    :cond_3
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 84
    move-result v8

    .line 85
    .line 86
    if-ne v8, v7, :cond_4

    .line 87
    move v8, v7

    .line 88
    goto :goto_4

    .line 89
    :cond_4
    :goto_3
    move v8, v5

    .line 90
    .line 91
    .line 92
    :goto_4
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 93
    move-result-object v9

    .line 94
    .line 95
    if-eqz v0, :cond_6

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getOpUserInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$OpUserInfo;

    .line 99
    move-result-object v8

    .line 100
    .line 101
    if-eqz v8, :cond_6

    .line 102
    .line 103
    .line 104
    invoke-virtual {v8}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$OpUserInfo;->getGoldMerchant()Ljava/lang/Integer;

    .line 105
    move-result-object v8

    .line 106
    .line 107
    if-nez v8, :cond_5

    .line 108
    goto :goto_5

    .line 109
    .line 110
    .line 111
    :cond_5
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 112
    move-result v8

    .line 113
    .line 114
    if-ne v8, v7, :cond_6

    .line 115
    move v5, v7

    .line 116
    .line 117
    .line 118
    :cond_6
    :goto_5
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 119
    move-result-object v10

    .line 120
    const/4 v11, 0x3

    .line 121
    const/4 v12, 0x0

    .line 122
    const/4 v7, 0x0

    .line 123
    const/4 v8, 0x0

    .line 124
    .line 125
    .line 126
    invoke-direct/range {v6 .. v12}, Lcom/kubi/payment/p2p/trade/MerchantQualificationDialog$MerchantQualification;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 127
    goto :goto_6

    .line 128
    :cond_7
    move-object v6, v2

    .line 129
    .line 130
    :goto_6
    if-eqz v0, :cond_8

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getUnreadMsgCount()I

    .line 134
    move-result v5

    .line 135
    .line 136
    .line 137
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    move-result-object v5

    .line 139
    goto :goto_7

    .line 140
    :cond_8
    move-object v5, v2

    .line 141
    .line 142
    :goto_7
    if-eqz v0, :cond_9

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getOpUserInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$OpUserInfo;

    .line 146
    move-result-object v0

    .line 147
    .line 148
    if-eqz v0, :cond_9

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$OpUserInfo;->getOnline()Ljava/lang/Boolean;

    .line 152
    move-result-object v2

    .line 153
    :cond_9
    move-object v13, v6

    .line 154
    move-object v6, v2

    .line 155
    move-object v2, v3

    .line 156
    move-object v3, v4

    .line 157
    move-object v4, v13

    .line 158
    .line 159
    .line 160
    invoke-direct/range {v1 .. v6}, Lcom/kubi/payment/p2p/widget/P2PViewChatCardEntrance$P2PChatCardEntranceInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/payment/p2p/trade/MerchantQualificationDialog$MerchantQualification;Ljava/lang/Integer;Ljava/lang/Boolean;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 164
    move-result-object v0

    .line 165
    .line 166
    if-eqz v0, :cond_a

    .line 167
    .line 168
    iget-object v0, v0, Lft/r1;->F0:Lcom/kubi/payment/p2p/widget/P2PViewChatCardEntrance;

    .line 169
    .line 170
    if-eqz v0, :cond_a

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v1}, Lcom/kubi/payment/p2p/widget/P2PViewChatCardEntrance;->h(Lcom/kubi/payment/p2p/widget/P2PViewChatCardEntrance$P2PChatCardEntranceInfo;)V

    .line 174
    :cond_a
    return-void
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

.method public final C6()V
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->y0(Lcom/kubi/payment/p2p/order/OrderDetailViewModel;ZILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getCanChat()Ljava/lang/Boolean;

    .line 28
    move-result-object v0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v0, v3

    .line 31
    .line 32
    .line 33
    :goto_0
    invoke-static {v0, v2}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 34
    move-result v0

    .line 35
    .line 36
    xor-int/lit8 v7, v0, 0x1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Q()Lcom/kubi/payment/chat/OrderChatHelper;

    .line 46
    move-result-object v4

    .line 47
    .line 48
    if-eqz v4, :cond_3

    .line 49
    .line 50
    iget-object v5, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 51
    .line 52
    const-string v0, "mContext"

    .line 53
    .line 54
    .line 55
    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getDisplayOpTradeInfo()Ljava/lang/Boolean;

    .line 71
    move-result-object v0

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    move-object v0, v3

    .line 74
    .line 75
    .line 76
    :goto_1
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 77
    move-result v6

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 87
    move-result-object v0

    .line 88
    .line 89
    if-eqz v0, :cond_2

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getAdRemarks()Ljava/lang/String;

    .line 93
    move-result-object v3

    .line 94
    .line 95
    .line 96
    :cond_2
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    move-result-object v8

    .line 98
    .line 99
    new-instance v9, Lcom/kubi/payment/p2p/order/n0;

    .line 100
    .line 101
    .line 102
    invoke-direct {v9, p0}, Lcom/kubi/payment/p2p/order/n0;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v4 .. v9}, Lcom/kubi/payment/chat/OrderChatHelper;->v(Landroid/content/Context;ZZLjava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 106
    .line 107
    :cond_3
    iput-boolean v2, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->W:Z

    .line 108
    return-void
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

.method public final D4()Lft/r1;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->X:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->b0:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Lft/r1;

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

.method public final D5()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lft/r1;->h:Landroidx/constraintlayout/widget/Group;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, v0, Lft/r1;->t:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 30
    move-result-object v0

    .line 31
    const/4 v1, 0x0

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    iget-object v0, v0, Lft/r1;->j0:Lcom/kubi/resources/widget/BaseTextView;

    .line 36
    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    sget v2, Lcom/kubi/otc/R$string;->p2pexpress_covert_title:I

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 43
    move-result-object v3

    .line 44
    .line 45
    check-cast v3, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 49
    move-result-object v3

    .line 50
    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getExpressInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;

    .line 55
    move-result-object v3

    .line 56
    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;->getDepositCurrency()Ljava/lang/String;

    .line 61
    move-result-object v3

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    move-object v3, v1

    .line 64
    .line 65
    .line 66
    :goto_0
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 67
    move-result-object v3

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v2, v3}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 71
    move-result-object v2

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    iget-object v0, v0, Lft/r1;->d0:Lcom/kubi/resources/widget/BaseTextView;

    .line 83
    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    sget v2, Lcom/kubi/otc/R$string;->payment_crypto_price:I

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 90
    move-result-object v3

    .line 91
    .line 92
    check-cast v3, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 96
    move-result-object v3

    .line 97
    .line 98
    if-eqz v3, :cond_4

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getExpressInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;

    .line 102
    move-result-object v3

    .line 103
    .line 104
    if-eqz v3, :cond_4

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;->getDepositCurrency()Ljava/lang/String;

    .line 108
    move-result-object v3

    .line 109
    goto :goto_1

    .line 110
    :cond_4
    move-object v3, v1

    .line 111
    .line 112
    .line 113
    :goto_1
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 114
    move-result-object v3

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, v2, v3}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 118
    move-result-object v2

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 122
    .line 123
    .line 124
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 125
    move-result-object v0

    .line 126
    .line 127
    const-string v2, "-"

    .line 128
    .line 129
    const-string v3, "BUY_STATUS_EXPRESS_ORDER_CANCELED"

    .line 130
    .line 131
    if-eqz v0, :cond_9

    .line 132
    .line 133
    iget-object v0, v0, Lft/r1;->e0:Lcom/kubi/resources/widget/BaseTextView;

    .line 134
    .line 135
    if-eqz v0, :cond_9

    .line 136
    .line 137
    sget v4, Lcom/kubi/otc/R$string;->payment_price:I

    .line 138
    .line 139
    iget-object v5, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V:Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    move-result v5

    .line 144
    .line 145
    if-eqz v5, :cond_6

    .line 146
    move-object v5, v2

    .line 147
    goto :goto_2

    .line 148
    .line 149
    .line 150
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 151
    move-result-object v5

    .line 152
    .line 153
    check-cast v5, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v5}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 157
    move-result-object v5

    .line 158
    .line 159
    if-eqz v5, :cond_7

    .line 160
    .line 161
    .line 162
    invoke-virtual {v5}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getExpressInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;

    .line 163
    move-result-object v5

    .line 164
    .line 165
    if-eqz v5, :cond_7

    .line 166
    .line 167
    .line 168
    invoke-virtual {v5}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;->getReferencePrice()Ljava/lang/String;

    .line 169
    move-result-object v5

    .line 170
    goto :goto_2

    .line 171
    :cond_7
    move-object v5, v1

    .line 172
    .line 173
    .line 174
    :goto_2
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 175
    move-result-object v6

    .line 176
    .line 177
    check-cast v6, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v6}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 181
    move-result-object v6

    .line 182
    .line 183
    if-eqz v6, :cond_8

    .line 184
    .line 185
    .line 186
    invoke-virtual {v6}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getExpressInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;

    .line 187
    move-result-object v6

    .line 188
    .line 189
    if-eqz v6, :cond_8

    .line 190
    .line 191
    .line 192
    invoke-virtual {v6}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;->getFromCurrency()Ljava/lang/String;

    .line 193
    move-result-object v6

    .line 194
    goto :goto_3

    .line 195
    :cond_8
    move-object v6, v1

    .line 196
    .line 197
    .line 198
    :goto_3
    filled-new-array {v5, v6}, [Ljava/lang/Object;

    .line 199
    move-result-object v5

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0, v4, v5}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 203
    move-result-object v4

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 207
    .line 208
    .line 209
    :cond_9
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 210
    move-result-object v0

    .line 211
    .line 212
    if-eqz v0, :cond_d

    .line 213
    .line 214
    iget-object v0, v0, Lft/r1;->g0:Lcom/kubi/resources/widget/BaseTextView;

    .line 215
    .line 216
    if-eqz v0, :cond_d

    .line 217
    .line 218
    sget v4, Lcom/kubi/otc/R$string;->payment_price:I

    .line 219
    .line 220
    iget-object v5, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V:Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 224
    move-result v3

    .line 225
    .line 226
    if-eqz v3, :cond_a

    .line 227
    goto :goto_4

    .line 228
    .line 229
    .line 230
    :cond_a
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 231
    move-result-object v2

    .line 232
    .line 233
    check-cast v2, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 237
    move-result-object v2

    .line 238
    .line 239
    if-eqz v2, :cond_b

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getExpressInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;

    .line 243
    move-result-object v2

    .line 244
    .line 245
    if-eqz v2, :cond_b

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;->getDepositAmount()Ljava/lang/String;

    .line 249
    move-result-object v2

    .line 250
    goto :goto_4

    .line 251
    :cond_b
    move-object v2, v1

    .line 252
    .line 253
    .line 254
    :goto_4
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 255
    move-result-object v3

    .line 256
    .line 257
    check-cast v3, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 261
    move-result-object v3

    .line 262
    .line 263
    if-eqz v3, :cond_c

    .line 264
    .line 265
    .line 266
    invoke-virtual {v3}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getExpressInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;

    .line 267
    move-result-object v3

    .line 268
    .line 269
    if-eqz v3, :cond_c

    .line 270
    .line 271
    .line 272
    invoke-virtual {v3}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;->getDepositCurrency()Ljava/lang/String;

    .line 273
    move-result-object v1

    .line 274
    .line 275
    .line 276
    :cond_c
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 277
    move-result-object v1

    .line 278
    .line 279
    .line 280
    invoke-virtual {p0, v4, v1}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 281
    move-result-object v1

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 285
    :cond_d
    return-void
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

.method public final E4()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Landroid/content/Intent;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 5
    .line 6
    const-class v2, Lcom/kubi/sdk/BaseActivity;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 10
    .line 11
    const-string v1, "title_bar"

    .line 12
    .line 13
    const-string v2, "false"

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 17
    .line 18
    const-class v1, Lcom/kubi/payment/p2p/order/transfer/OrderTransferFragment;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    const-string v2, "fragment"

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    check-cast v2, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->h0()Lcom/kubi/payment/p2p/data/entities/TransferOrderInfo;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    const-string v3, "data"

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 44
    const/4 v1, 0x0

    .line 45
    const/4 v2, 0x4

    .line 46
    .line 47
    const-string v3, "B7P2POrderDetails"

    .line 48
    .line 49
    const-string v4, "transferButton"

    .line 50
    .line 51
    .line 52
    invoke-static {v3, v4, v1, v2, v1}, Lqq/m;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    const-string v2, "spm"

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 59
    .line 60
    new-instance v1, Lcom/kubi/payment/p2p/order/q0;

    .line 61
    .line 62
    .line 63
    invoke-direct {v1, p0}, Lcom/kubi/payment/p2p/order/q0;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v0, v1}, Lcom/kubi/sdk/BaseFragment;->startActivityWithResult(Landroid/content/Intent;Lio/reactivex/functions/Consumer;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->p0()V

    .line 76
    return-void
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

.method public final E5()V
    .locals 14

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-object v1, v1, Lft/r1;->D:Lcom/kubi/resources/widget/BaseTextView;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    sget v3, Lcom/kubi/otc/R$string;->p2pexpress_buycropty_title:I

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 27
    move-result-object v4

    .line 28
    .line 29
    check-cast v4, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 33
    move-result-object v4

    .line 34
    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getCurrency()Ljava/lang/String;

    .line 39
    move-result-object v4

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move-object v4, v2

    .line 42
    .line 43
    .line 44
    :goto_0
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 45
    move-result-object v4

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v3, v4}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    move-result-object v3

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    check-cast v1, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getStatus()Ljava/lang/String;

    .line 68
    move-result-object v1

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    move-object v1, v2

    .line 71
    .line 72
    :goto_1
    const-string v3, "CHARGED"

    .line 73
    .line 74
    .line 75
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    move-result v1

    .line 77
    const/4 v3, 0x0

    .line 78
    .line 79
    if-eqz v1, :cond_6

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 83
    move-result-object v1

    .line 84
    .line 85
    if-eqz v1, :cond_3

    .line 86
    .line 87
    iget-object v1, v1, Lft/r1;->k:Landroidx/appcompat/widget/AppCompatImageView;

    .line 88
    .line 89
    if-eqz v1, :cond_3

    .line 90
    .line 91
    sget v4, Lcom/kubi/otc/R$drawable;->ic2_success_16:I

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v4}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 95
    .line 96
    .line 97
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 98
    move-result-object v1

    .line 99
    .line 100
    if-eqz v1, :cond_4

    .line 101
    .line 102
    iget-object v1, v1, Lft/r1;->k:Landroidx/appcompat/widget/AppCompatImageView;

    .line 103
    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    iget-object v4, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 107
    .line 108
    sget v5, Lcom/kubi/otc/R$color;->brandGreen:I

    .line 109
    .line 110
    .line 111
    invoke-static {v4, v5}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 112
    move-result v4

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 116
    .line 117
    .line 118
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 119
    move-result-object v1

    .line 120
    .line 121
    if-eqz v1, :cond_5

    .line 122
    .line 123
    iget-object v1, v1, Lft/r1;->a0:Lcom/kubi/resources/widget/BaseTextView;

    .line 124
    .line 125
    if-eqz v1, :cond_5

    .line 126
    .line 127
    sget v4, Lcom/kubi/otc/R$string;->completed:I

    .line 128
    .line 129
    new-array v5, v3, [Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, v4, v5}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 133
    move-result-object v4

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    .line 138
    .line 139
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 140
    move-result-object v1

    .line 141
    .line 142
    if-eqz v1, :cond_a

    .line 143
    .line 144
    iget-object v1, v1, Lft/r1;->a0:Lcom/kubi/resources/widget/BaseTextView;

    .line 145
    .line 146
    if-eqz v1, :cond_a

    .line 147
    .line 148
    iget-object v4, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 149
    .line 150
    sget v5, Lcom/kubi/otc/R$color;->brandGreen:I

    .line 151
    .line 152
    .line 153
    invoke-static {v4, v5}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 154
    move-result v4

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 158
    goto :goto_2

    .line 159
    .line 160
    .line 161
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 162
    move-result-object v1

    .line 163
    .line 164
    if-eqz v1, :cond_7

    .line 165
    .line 166
    iget-object v1, v1, Lft/r1;->k:Landroidx/appcompat/widget/AppCompatImageView;

    .line 167
    .line 168
    if-eqz v1, :cond_7

    .line 169
    .line 170
    sget v4, Lcom/kubi/otc/R$drawable;->ic2_fail_16:I

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, v4}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 174
    .line 175
    .line 176
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 177
    move-result-object v1

    .line 178
    .line 179
    if-eqz v1, :cond_8

    .line 180
    .line 181
    iget-object v1, v1, Lft/r1;->k:Landroidx/appcompat/widget/AppCompatImageView;

    .line 182
    .line 183
    if-eqz v1, :cond_8

    .line 184
    .line 185
    iget-object v4, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 186
    .line 187
    sget v5, Lcom/kubi/otc/R$color;->c_icon60:I

    .line 188
    .line 189
    .line 190
    invoke-static {v4, v5}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 191
    move-result v4

    .line 192
    .line 193
    sget-object v5, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v4, v5}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 197
    .line 198
    .line 199
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 200
    move-result-object v1

    .line 201
    .line 202
    if-eqz v1, :cond_9

    .line 203
    .line 204
    iget-object v1, v1, Lft/r1;->a0:Lcom/kubi/resources/widget/BaseTextView;

    .line 205
    .line 206
    if-eqz v1, :cond_9

    .line 207
    .line 208
    sget v4, Lcom/kubi/otc/R$string;->order_cancelled:I

    .line 209
    .line 210
    new-array v5, v3, [Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0, v4, v5}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 214
    move-result-object v4

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 218
    .line 219
    .line 220
    :cond_9
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 221
    move-result-object v1

    .line 222
    .line 223
    if-eqz v1, :cond_a

    .line 224
    .line 225
    iget-object v1, v1, Lft/r1;->a0:Lcom/kubi/resources/widget/BaseTextView;

    .line 226
    .line 227
    if-eqz v1, :cond_a

    .line 228
    .line 229
    iget-object v4, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 230
    .line 231
    sget v5, Lcom/kubi/otc/R$color;->c_text40:I

    .line 232
    .line 233
    .line 234
    invoke-static {v4, v5}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 235
    move-result v4

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 239
    .line 240
    .line 241
    :cond_a
    :goto_2
    invoke-virtual {p0, v0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->B6(Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 245
    move-result-object v1

    .line 246
    .line 247
    const/16 v4, 0x20

    .line 248
    .line 249
    if-eqz v1, :cond_d

    .line 250
    .line 251
    iget-object v1, v1, Lft/r1;->R:Lcom/kubi/resources/widget/BaseTextView;

    .line 252
    .line 253
    if-eqz v1, :cond_d

    .line 254
    .line 255
    new-instance v5, Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 259
    .line 260
    if-eqz v0, :cond_b

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getPrice()Ljava/math/BigDecimal;

    .line 264
    move-result-object v6

    .line 265
    .line 266
    if-eqz v6, :cond_b

    .line 267
    .line 268
    .line 269
    invoke-virtual {v6}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 270
    move-result-object v6

    .line 271
    goto :goto_3

    .line 272
    :cond_b
    move-object v6, v2

    .line 273
    .line 274
    .line 275
    :goto_3
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 276
    move-result-object v6

    .line 277
    .line 278
    .line 279
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    if-eqz v0, :cond_c

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getLegalCurrency()Ljava/lang/String;

    .line 288
    move-result-object v6

    .line 289
    goto :goto_4

    .line 290
    :cond_c
    move-object v6, v2

    .line 291
    .line 292
    .line 293
    :goto_4
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    move-result-object v5

    .line 298
    .line 299
    .line 300
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 301
    .line 302
    .line 303
    :cond_d
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 304
    move-result-object v1

    .line 305
    .line 306
    if-eqz v1, :cond_10

    .line 307
    .line 308
    iget-object v1, v1, Lft/r1;->T:Lcom/kubi/resources/widget/BaseTextView;

    .line 309
    .line 310
    if-eqz v1, :cond_10

    .line 311
    .line 312
    new-instance v5, Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 316
    .line 317
    if-eqz v0, :cond_e

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getCurrencyAmount()Ljava/lang/String;

    .line 321
    move-result-object v6

    .line 322
    goto :goto_5

    .line 323
    :cond_e
    move-object v6, v2

    .line 324
    .line 325
    .line 326
    :goto_5
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 327
    move-result-object v6

    .line 328
    .line 329
    .line 330
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    if-eqz v0, :cond_f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getCurrency()Ljava/lang/String;

    .line 339
    move-result-object v4

    .line 340
    goto :goto_6

    .line 341
    :cond_f
    move-object v4, v2

    .line 342
    .line 343
    .line 344
    :goto_6
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 348
    move-result-object v4

    .line 349
    .line 350
    .line 351
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 352
    .line 353
    :cond_10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 357
    .line 358
    if-eqz v0, :cond_11

    .line 359
    .line 360
    .line 361
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getOpTraderNickName()Ljava/lang/String;

    .line 362
    move-result-object v4

    .line 363
    goto :goto_7

    .line 364
    :cond_11
    move-object v4, v2

    .line 365
    .line 366
    .line 367
    :goto_7
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 368
    move-result-object v4

    .line 369
    .line 370
    .line 371
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    const/16 v4, 0x28

    .line 374
    .line 375
    .line 376
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    if-eqz v0, :cond_12

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getOpTraderName()Ljava/lang/String;

    .line 382
    move-result-object v4

    .line 383
    goto :goto_8

    .line 384
    :cond_12
    move-object v4, v2

    .line 385
    .line 386
    .line 387
    :goto_8
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    const/16 v4, 0x29

    .line 390
    .line 391
    .line 392
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 396
    move-result-object v1

    .line 397
    .line 398
    .line 399
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 400
    move-result-object v4

    .line 401
    .line 402
    if-eqz v4, :cond_14

    .line 403
    .line 404
    iget-object v4, v4, Lft/r1;->V:Lcom/kubi/resources/widget/BaseTextView;

    .line 405
    .line 406
    if-eqz v4, :cond_14

    .line 407
    .line 408
    .line 409
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->g5()Z

    .line 410
    move-result v5

    .line 411
    .line 412
    if-eqz v5, :cond_13

    .line 413
    .line 414
    new-instance v5, Lcom/kubi/utils/v0;

    .line 415
    .line 416
    .line 417
    invoke-direct {v5}, Lcom/kubi/utils/v0;-><init>()V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v5, v1}, Lcom/kubi/utils/v0;->h(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 421
    move-result-object v1

    .line 422
    .line 423
    .line 424
    :cond_13
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 425
    .line 426
    .line 427
    :cond_14
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 428
    move-result-object v1

    .line 429
    .line 430
    if-eqz v1, :cond_16

    .line 431
    .line 432
    iget-object v1, v1, Lft/r1;->J:Lcom/kubi/resources/widget/BaseTextView;

    .line 433
    .line 434
    if-eqz v1, :cond_16

    .line 435
    .line 436
    .line 437
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 438
    move-result-object v4

    .line 439
    .line 440
    check-cast v4, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 444
    move-result-object v4

    .line 445
    .line 446
    if-eqz v4, :cond_15

    .line 447
    .line 448
    .line 449
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getId()Ljava/lang/String;

    .line 450
    move-result-object v4

    .line 451
    goto :goto_9

    .line 452
    :cond_15
    move-object v4, v2

    .line 453
    .line 454
    .line 455
    :goto_9
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 456
    move-result-object v4

    .line 457
    .line 458
    .line 459
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 460
    .line 461
    .line 462
    :cond_16
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 463
    move-result-object v1

    .line 464
    .line 465
    if-eqz v1, :cond_18

    .line 466
    .line 467
    iget-object v1, v1, Lft/r1;->M:Lcom/kubi/resources/widget/BaseTextView;

    .line 468
    .line 469
    if-eqz v1, :cond_18

    .line 470
    .line 471
    if-eqz v0, :cond_17

    .line 472
    .line 473
    .line 474
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getCreatedAt()Ljava/lang/Long;

    .line 475
    move-result-object v4

    .line 476
    goto :goto_a

    .line 477
    :cond_17
    move-object v4, v2

    .line 478
    .line 479
    .line 480
    :goto_a
    invoke-static {v4}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 481
    move-result-wide v4

    .line 482
    .line 483
    .line 484
    invoke-static {v4, v5}, Lcom/kubi/utils/TimeUtils;->k(J)Ljava/lang/String;

    .line 485
    move-result-object v4

    .line 486
    .line 487
    .line 488
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 489
    .line 490
    :cond_18
    const-string v12, "SELL_STATUS_ORDER_CANCELED"

    .line 491
    .line 492
    const-string v13, "SELL_STATUS_ORDER_CHARGED"

    .line 493
    .line 494
    const-string v5, "BUY_STATUS_ORDER_CANCELED"

    .line 495
    .line 496
    const-string v6, "BUY_STATUS_ORDER_CHARGED"

    .line 497
    .line 498
    const-string v7, "BUY_STATUS_EXPRESS_ORDER_UNCONFIRMED"

    .line 499
    .line 500
    const-string v8, "BUY_STATUS_EXPRESS_ORDER_PROCESSING"

    .line 501
    .line 502
    const-string v9, "BUY_STATUS_EXPRESS_ORDER_SUCCEEDED"

    .line 503
    .line 504
    const-string v10, "BUY_STATUS_EXPRESS_ORDER_FAILED"

    .line 505
    .line 506
    const-string v11, "BUY_STATUS_EXPRESS_ORDER_CANCELED"

    .line 507
    .line 508
    .line 509
    filled-new-array/range {v5 .. v13}, [Ljava/lang/String;

    .line 510
    move-result-object v1

    .line 511
    .line 512
    .line 513
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 514
    move-result-object v1

    .line 515
    .line 516
    iget-object v4, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V:Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    invoke-interface {v1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 520
    move-result v1

    .line 521
    .line 522
    if-nez v1, :cond_1e

    .line 523
    .line 524
    if-eqz v0, :cond_19

    .line 525
    .line 526
    .line 527
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getAdRemarks()Ljava/lang/String;

    .line 528
    move-result-object v4

    .line 529
    goto :goto_b

    .line 530
    :cond_19
    move-object v4, v2

    .line 531
    .line 532
    :goto_b
    if-eqz v4, :cond_1e

    .line 533
    .line 534
    .line 535
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 536
    move-result v4

    .line 537
    .line 538
    if-nez v4, :cond_1a

    .line 539
    goto :goto_d

    .line 540
    .line 541
    .line 542
    :cond_1a
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 543
    move-result-object v4

    .line 544
    .line 545
    if-eqz v4, :cond_1b

    .line 546
    .line 547
    iget-object v4, v4, Lft/r1;->K0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 548
    .line 549
    if-eqz v4, :cond_1b

    .line 550
    .line 551
    .line 552
    invoke-static {v4}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 553
    .line 554
    .line 555
    :cond_1b
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 556
    move-result-object v4

    .line 557
    .line 558
    if-eqz v4, :cond_1d

    .line 559
    .line 560
    iget-object v4, v4, Lft/r1;->W:Lcom/kubi/resources/widget/BaseTextView;

    .line 561
    .line 562
    if-eqz v4, :cond_1d

    .line 563
    .line 564
    if-eqz v0, :cond_1c

    .line 565
    .line 566
    .line 567
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getAdRemarks()Ljava/lang/String;

    .line 568
    move-result-object v5

    .line 569
    goto :goto_c

    .line 570
    :cond_1c
    move-object v5, v2

    .line 571
    .line 572
    .line 573
    :goto_c
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 574
    move-result-object v5

    .line 575
    .line 576
    .line 577
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 578
    .line 579
    .line 580
    :cond_1d
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 581
    move-result-object v4

    .line 582
    .line 583
    if-eqz v4, :cond_1f

    .line 584
    .line 585
    iget-object v4, v4, Lft/r1;->W:Lcom/kubi/resources/widget/BaseTextView;

    .line 586
    .line 587
    if-eqz v4, :cond_1f

    .line 588
    .line 589
    .line 590
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 591
    move-result-object v5

    .line 592
    .line 593
    .line 594
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 595
    goto :goto_e

    .line 596
    .line 597
    .line 598
    :cond_1e
    :goto_d
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 599
    move-result-object v4

    .line 600
    .line 601
    if-eqz v4, :cond_1f

    .line 602
    .line 603
    iget-object v4, v4, Lft/r1;->K0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 604
    .line 605
    if-eqz v4, :cond_1f

    .line 606
    .line 607
    .line 608
    invoke-static {v4}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 609
    .line 610
    :cond_1f
    :goto_e
    const-string v4, " "

    .line 611
    .line 612
    if-eqz v1, :cond_2a

    .line 613
    .line 614
    .line 615
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 616
    move-result-object v1

    .line 617
    .line 618
    if-eqz v1, :cond_20

    .line 619
    .line 620
    iget-object v1, v1, Lft/r1;->J0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 621
    .line 622
    if-eqz v1, :cond_20

    .line 623
    .line 624
    .line 625
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 626
    .line 627
    .line 628
    :cond_20
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 629
    move-result-object v1

    .line 630
    .line 631
    if-eqz v1, :cond_21

    .line 632
    .line 633
    iget-object v1, v1, Lft/r1;->R:Lcom/kubi/resources/widget/BaseTextView;

    .line 634
    goto :goto_f

    .line 635
    :cond_21
    move-object v1, v2

    .line 636
    .line 637
    .line 638
    :goto_f
    invoke-virtual {p0, v1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->g6(Landroid/widget/TextView;)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 642
    move-result-object v1

    .line 643
    .line 644
    if-eqz v1, :cond_22

    .line 645
    .line 646
    iget-object v1, v1, Lft/r1;->T:Lcom/kubi/resources/widget/BaseTextView;

    .line 647
    goto :goto_10

    .line 648
    :cond_22
    move-object v1, v2

    .line 649
    .line 650
    .line 651
    :goto_10
    invoke-virtual {p0, v1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->g6(Landroid/widget/TextView;)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 655
    move-result-object v1

    .line 656
    .line 657
    if-eqz v1, :cond_23

    .line 658
    .line 659
    iget-object v1, v1, Lft/r1;->V:Lcom/kubi/resources/widget/BaseTextView;

    .line 660
    goto :goto_11

    .line 661
    :cond_23
    move-object v1, v2

    .line 662
    .line 663
    .line 664
    :goto_11
    invoke-virtual {p0, v1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->g6(Landroid/widget/TextView;)V

    .line 665
    .line 666
    .line 667
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 668
    move-result-object v1

    .line 669
    .line 670
    if-eqz v1, :cond_24

    .line 671
    .line 672
    iget-object v1, v1, Lft/r1;->J:Lcom/kubi/resources/widget/BaseTextView;

    .line 673
    goto :goto_12

    .line 674
    :cond_24
    move-object v1, v2

    .line 675
    .line 676
    .line 677
    :goto_12
    invoke-virtual {p0, v1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->g6(Landroid/widget/TextView;)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 681
    move-result-object v1

    .line 682
    .line 683
    if-eqz v1, :cond_25

    .line 684
    .line 685
    iget-object v1, v1, Lft/r1;->M:Lcom/kubi/resources/widget/BaseTextView;

    .line 686
    goto :goto_13

    .line 687
    :cond_25
    move-object v1, v2

    .line 688
    .line 689
    .line 690
    :goto_13
    invoke-virtual {p0, v1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->g6(Landroid/widget/TextView;)V

    .line 691
    .line 692
    .line 693
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 694
    move-result-object v1

    .line 695
    .line 696
    if-eqz v1, :cond_26

    .line 697
    .line 698
    iget-object v1, v1, Lft/r1;->E:Lcom/kubi/resources/widget/BaseTextView;

    .line 699
    goto :goto_14

    .line 700
    :cond_26
    move-object v1, v2

    .line 701
    .line 702
    .line 703
    :goto_14
    invoke-virtual {p0, v1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->g6(Landroid/widget/TextView;)V

    .line 704
    .line 705
    .line 706
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 707
    move-result-object v1

    .line 708
    .line 709
    if-eqz v1, :cond_27

    .line 710
    .line 711
    iget-object v1, v1, Lft/r1;->E:Lcom/kubi/resources/widget/BaseTextView;

    .line 712
    .line 713
    if-eqz v1, :cond_27

    .line 714
    .line 715
    iget-object v5, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 716
    .line 717
    sget v6, Lcom/kubi/otc/R$font;->medium:I

    .line 718
    .line 719
    .line 720
    invoke-static {v5, v6}, Landroidx/core/content/res/ResourcesCompat;->getFont(Landroid/content/Context;I)Landroid/graphics/Typeface;

    .line 721
    move-result-object v5

    .line 722
    .line 723
    .line 724
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 725
    .line 726
    .line 727
    :cond_27
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 728
    move-result-object v1

    .line 729
    .line 730
    if-eqz v1, :cond_2e

    .line 731
    .line 732
    iget-object v1, v1, Lft/r1;->E:Lcom/kubi/resources/widget/BaseTextView;

    .line 733
    .line 734
    if-eqz v1, :cond_2e

    .line 735
    .line 736
    new-instance v5, Lcom/kubi/utils/v0;

    .line 737
    .line 738
    .line 739
    invoke-direct {v5}, Lcom/kubi/utils/v0;-><init>()V

    .line 740
    .line 741
    if-eqz v0, :cond_28

    .line 742
    .line 743
    .line 744
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getLegalCurrencyAmount()Ljava/lang/String;

    .line 745
    move-result-object v6

    .line 746
    .line 747
    if-eqz v6, :cond_28

    .line 748
    .line 749
    .line 750
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 751
    move-result-object v6

    .line 752
    goto :goto_15

    .line 753
    :cond_28
    move-object v6, v2

    .line 754
    .line 755
    .line 756
    :goto_15
    invoke-virtual {v5, v6}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 757
    move-result-object v5

    .line 758
    .line 759
    .line 760
    invoke-virtual {v5, v4}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 761
    move-result-object v4

    .line 762
    .line 763
    if-eqz v0, :cond_29

    .line 764
    .line 765
    .line 766
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getLegalCurrency()Ljava/lang/String;

    .line 767
    move-result-object v5

    .line 768
    goto :goto_16

    .line 769
    :cond_29
    move-object v5, v2

    .line 770
    .line 771
    .line 772
    :goto_16
    invoke-virtual {v4, v5}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 773
    move-result-object v4

    .line 774
    .line 775
    .line 776
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 777
    goto :goto_19

    .line 778
    .line 779
    .line 780
    :cond_2a
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 781
    move-result-object v1

    .line 782
    .line 783
    if-eqz v1, :cond_2b

    .line 784
    .line 785
    iget-object v1, v1, Lft/r1;->J0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 786
    .line 787
    if-eqz v1, :cond_2b

    .line 788
    .line 789
    .line 790
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 791
    .line 792
    .line 793
    :cond_2b
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 794
    move-result-object v1

    .line 795
    .line 796
    if-eqz v1, :cond_2e

    .line 797
    .line 798
    iget-object v1, v1, Lft/r1;->E:Lcom/kubi/resources/widget/BaseTextView;

    .line 799
    .line 800
    if-eqz v1, :cond_2e

    .line 801
    .line 802
    new-instance v5, Lcom/kubi/utils/v0;

    .line 803
    .line 804
    .line 805
    invoke-direct {v5}, Lcom/kubi/utils/v0;-><init>()V

    .line 806
    .line 807
    if-eqz v0, :cond_2c

    .line 808
    .line 809
    .line 810
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getLegalCurrencyAmount()Ljava/lang/String;

    .line 811
    move-result-object v6

    .line 812
    .line 813
    if-eqz v6, :cond_2c

    .line 814
    .line 815
    .line 816
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 817
    move-result-object v6

    .line 818
    goto :goto_17

    .line 819
    :cond_2c
    move-object v6, v2

    .line 820
    .line 821
    :goto_17
    const/16 v7, 0x14

    .line 822
    .line 823
    .line 824
    invoke-virtual {v5, v6, v7}, Lcom/kubi/utils/v0;->d(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 825
    move-result-object v5

    .line 826
    .line 827
    .line 828
    invoke-virtual {v5, v4}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 829
    move-result-object v4

    .line 830
    .line 831
    if-eqz v0, :cond_2d

    .line 832
    .line 833
    .line 834
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getLegalCurrency()Ljava/lang/String;

    .line 835
    move-result-object v5

    .line 836
    goto :goto_18

    .line 837
    :cond_2d
    move-object v5, v2

    .line 838
    .line 839
    .line 840
    :goto_18
    invoke-virtual {v4, v5}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 841
    move-result-object v4

    .line 842
    .line 843
    .line 844
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 845
    .line 846
    :cond_2e
    :goto_19
    const-string v1, "APPEALING_CS_PENDING"

    .line 847
    .line 848
    const-string v4, "APPEALING_CS_PROCESSING"

    .line 849
    .line 850
    const-string v5, "APPEALING"

    .line 851
    .line 852
    const-string v6, "APPEALING_CONSENT"

    .line 853
    .line 854
    .line 855
    filled-new-array {v5, v6, v1, v4}, [Ljava/lang/String;

    .line 856
    move-result-object v1

    .line 857
    .line 858
    .line 859
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 860
    move-result-object v1

    .line 861
    .line 862
    if-eqz v0, :cond_2f

    .line 863
    .line 864
    .line 865
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getAppealStatus()Ljava/lang/String;

    .line 866
    move-result-object v4

    .line 867
    goto :goto_1a

    .line 868
    :cond_2f
    move-object v4, v2

    .line 869
    .line 870
    .line 871
    :goto_1a
    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 872
    move-result v1

    .line 873
    .line 874
    if-nez v1, :cond_32

    .line 875
    .line 876
    if-eqz v0, :cond_30

    .line 877
    .line 878
    .line 879
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getAppealBy()Ljava/lang/String;

    .line 880
    move-result-object v1

    .line 881
    goto :goto_1b

    .line 882
    :cond_30
    move-object v1, v2

    .line 883
    .line 884
    :goto_1b
    if-eqz v1, :cond_32

    .line 885
    .line 886
    .line 887
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 888
    move-result v1

    .line 889
    .line 890
    if-nez v1, :cond_31

    .line 891
    goto :goto_1c

    .line 892
    .line 893
    .line 894
    :cond_31
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 895
    move-result-object v1

    .line 896
    .line 897
    if-eqz v1, :cond_33

    .line 898
    .line 899
    iget-object v1, v1, Lft/r1;->x0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 900
    .line 901
    if-eqz v1, :cond_33

    .line 902
    .line 903
    .line 904
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 905
    goto :goto_1d

    .line 906
    .line 907
    .line 908
    :cond_32
    :goto_1c
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 909
    move-result-object v1

    .line 910
    .line 911
    if-eqz v1, :cond_33

    .line 912
    .line 913
    iget-object v1, v1, Lft/r1;->x0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 914
    .line 915
    if-eqz v1, :cond_33

    .line 916
    .line 917
    .line 918
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 919
    .line 920
    .line 921
    :cond_33
    :goto_1d
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->f5()Z

    .line 922
    move-result v1

    .line 923
    .line 924
    if-eqz v1, :cond_34

    .line 925
    .line 926
    .line 927
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 928
    move-result-object v1

    .line 929
    .line 930
    if-eqz v1, :cond_35

    .line 931
    .line 932
    iget-object v1, v1, Lft/r1;->l:Landroidx/appcompat/widget/AppCompatImageView;

    .line 933
    .line 934
    if-eqz v1, :cond_35

    .line 935
    .line 936
    .line 937
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 938
    goto :goto_1e

    .line 939
    .line 940
    .line 941
    :cond_34
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 942
    move-result-object v1

    .line 943
    .line 944
    if-eqz v1, :cond_35

    .line 945
    .line 946
    iget-object v1, v1, Lft/r1;->l:Landroidx/appcompat/widget/AppCompatImageView;

    .line 947
    .line 948
    if-eqz v1, :cond_35

    .line 949
    .line 950
    .line 951
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 952
    .line 953
    :cond_35
    :goto_1e
    if-eqz v0, :cond_36

    .line 954
    .line 955
    .line 956
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getUnread()Ljava/lang/Boolean;

    .line 957
    move-result-object v2

    .line 958
    .line 959
    .line 960
    :cond_36
    invoke-static {v2}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 961
    move-result v0

    .line 962
    .line 963
    if-eqz v0, :cond_38

    .line 964
    .line 965
    .line 966
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 967
    move-result-object v0

    .line 968
    .line 969
    if-eqz v0, :cond_37

    .line 970
    .line 971
    iget-object v0, v0, Lft/r1;->w0:Landroid/view/View;

    .line 972
    .line 973
    if-eqz v0, :cond_37

    .line 974
    .line 975
    .line 976
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 977
    .line 978
    .line 979
    :cond_37
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 980
    move-result-object v0

    .line 981
    .line 982
    if-eqz v0, :cond_3a

    .line 983
    .line 984
    iget-object v0, v0, Lft/r1;->y0:Landroid/view/View;

    .line 985
    .line 986
    if-eqz v0, :cond_3a

    .line 987
    .line 988
    .line 989
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 990
    goto :goto_1f

    .line 991
    .line 992
    .line 993
    :cond_38
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 994
    move-result-object v0

    .line 995
    .line 996
    if-eqz v0, :cond_39

    .line 997
    .line 998
    iget-object v0, v0, Lft/r1;->w0:Landroid/view/View;

    .line 999
    .line 1000
    if-eqz v0, :cond_39

    .line 1001
    .line 1002
    .line 1003
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 1004
    .line 1005
    .line 1006
    :cond_39
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 1007
    move-result-object v0

    .line 1008
    .line 1009
    if-eqz v0, :cond_3a

    .line 1010
    .line 1011
    iget-object v0, v0, Lft/r1;->y0:Landroid/view/View;

    .line 1012
    .line 1013
    if-eqz v0, :cond_3a

    .line 1014
    .line 1015
    .line 1016
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 1017
    .line 1018
    :cond_3a
    :goto_1f
    const-string v0, "BUY_STATUS_ORDER_CREATED"

    .line 1019
    .line 1020
    const-string v1, "SELL_STATUS_ORDER_CREATED"

    .line 1021
    .line 1022
    .line 1023
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 1024
    move-result-object v0

    .line 1025
    .line 1026
    .line 1027
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 1028
    move-result-object v0

    .line 1029
    .line 1030
    iget-object v1, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V:Ljava/lang/String;

    .line 1031
    .line 1032
    .line 1033
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1034
    move-result v0

    .line 1035
    const/4 v1, 0x1

    .line 1036
    .line 1037
    if-nez v0, :cond_3b

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 1041
    move-result-object v0

    .line 1042
    .line 1043
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 1044
    .line 1045
    .line 1046
    invoke-virtual {v0, v3}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->E0(Z)V

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 1050
    move-result-object v0

    .line 1051
    .line 1052
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 1053
    .line 1054
    .line 1055
    invoke-virtual {v0, v1}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->F0(Z)V

    .line 1056
    .line 1057
    :cond_3b
    const-string v0, "BUY_STATUS_ORDER_WAIT_COIN"

    .line 1058
    .line 1059
    const-string v2, "SELL_STATUS_ORDER_PAY_COIN"

    .line 1060
    .line 1061
    .line 1062
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 1063
    move-result-object v0

    .line 1064
    .line 1065
    .line 1066
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 1067
    move-result-object v0

    .line 1068
    .line 1069
    iget-object v2, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V:Ljava/lang/String;

    .line 1070
    .line 1071
    .line 1072
    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1073
    move-result v0

    .line 1074
    .line 1075
    if-nez v0, :cond_3c

    .line 1076
    .line 1077
    .line 1078
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 1079
    move-result-object v0

    .line 1080
    .line 1081
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {v0, v3}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->K0(Z)V

    .line 1085
    .line 1086
    .line 1087
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 1088
    move-result-object v0

    .line 1089
    .line 1090
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v0, v1}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->G0(Z)V

    .line 1094
    :cond_3c
    return-void
.end method

.method public final E6()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->h5()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    sget-object v0, Lcom/kubi/sdk/function/looper/KuCoinLooper;->INSTANCE:Lcom/kubi/sdk/function/looper/KuCoinLooper;

    .line 10
    .line 11
    new-instance v1, Ldz/c$b;

    .line 12
    .line 13
    const-string v2, "orderLooper"

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v2}, Ldz/c$b;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    const-wide/16 v2, 0x4

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2, v3}, Ldz/c$b;->i(J)Ldz/c$b;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p0}, Ldz/c$b;->g(Landroidx/lifecycle/LifecycleOwner;)Ldz/c$b;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    new-instance v2, Lcom/kubi/payment/p2p/order/h0;

    .line 29
    .line 30
    .line 31
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/order/h0;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ldz/c$b;->f(Ljava/lang/Runnable;)Ldz/c$b;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ldz/c$b;->h()Ldz/c;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    filled-new-array {v1}, [Ldz/c;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lcom/kubi/sdk/function/looper/KuCoinLooper;->addTask([Ldz/c;)V

    .line 47
    return-void
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

.method public final F5()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getExpressInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;

    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v0, v1

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    check-cast v2, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->isP2PExpress()Z

    .line 35
    move-result v2

    .line 36
    .line 37
    .line 38
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    move-result-object v2

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move-object v2, v1

    .line 42
    .line 43
    .line 44
    :goto_1
    invoke-static {v2}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 45
    move-result v2

    .line 46
    .line 47
    if-eqz v2, :cond_10

    .line 48
    .line 49
    sget-object v2, Lcom/kubi/payment/p2p/order/n1;->a:Lcom/kubi/payment/p2p/order/n1;

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;->getStatus()Ljava/lang/String;

    .line 55
    move-result-object v3

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    move-object v3, v1

    .line 58
    .line 59
    .line 60
    :goto_2
    invoke-virtual {v2, v3}, Lcom/kubi/payment/p2p/order/n1;->a(Ljava/lang/String;)Z

    .line 61
    move-result v2

    .line 62
    .line 63
    if-nez v2, :cond_10

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 67
    move-result-object v2

    .line 68
    .line 69
    check-cast v2, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 73
    move-result-object v2

    .line 74
    .line 75
    if-eqz v2, :cond_3

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getBuyerRole()Ljava/lang/Boolean;

    .line 79
    move-result-object v2

    .line 80
    goto :goto_3

    .line 81
    :cond_3
    move-object v2, v1

    .line 82
    .line 83
    .line 84
    :goto_3
    invoke-static {v2}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 85
    move-result v2

    .line 86
    .line 87
    if-eqz v2, :cond_10

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 91
    move-result-object v2

    .line 92
    .line 93
    if-eqz v2, :cond_4

    .line 94
    .line 95
    iget-object v2, v2, Lft/r1;->g:Landroidx/constraintlayout/widget/Group;

    .line 96
    .line 97
    if-eqz v2, :cond_4

    .line 98
    .line 99
    .line 100
    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 101
    .line 102
    .line 103
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 104
    move-result-object v2

    .line 105
    .line 106
    if-eqz v2, :cond_6

    .line 107
    .line 108
    iget-object v2, v2, Lft/r1;->b0:Lcom/kubi/resources/widget/BaseTextView;

    .line 109
    .line 110
    if-eqz v2, :cond_6

    .line 111
    .line 112
    sget v3, Lcom/kubi/otc/R$string;->p2pexpress_buycropty_title:I

    .line 113
    .line 114
    if-eqz v0, :cond_5

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;->getFromCurrency()Ljava/lang/String;

    .line 118
    move-result-object v4

    .line 119
    goto :goto_4

    .line 120
    :cond_5
    move-object v4, v1

    .line 121
    .line 122
    .line 123
    :goto_4
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 124
    move-result-object v4

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, v3, v4}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 128
    move-result-object v3

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 132
    .line 133
    .line 134
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 135
    move-result-object v2

    .line 136
    .line 137
    if-eqz v2, :cond_9

    .line 138
    .line 139
    iget-object v2, v2, Lft/r1;->k0:Lcom/kubi/resources/widget/BaseTextView;

    .line 140
    .line 141
    if-eqz v2, :cond_9

    .line 142
    .line 143
    sget v3, Lcom/kubi/otc/R$string;->p2pexpress_confirm_covert:I

    .line 144
    .line 145
    if-eqz v0, :cond_7

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;->getFromCurrency()Ljava/lang/String;

    .line 149
    move-result-object v4

    .line 150
    goto :goto_5

    .line 151
    :cond_7
    move-object v4, v1

    .line 152
    .line 153
    :goto_5
    if-eqz v0, :cond_8

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;->getDepositCurrency()Ljava/lang/String;

    .line 157
    move-result-object v5

    .line 158
    goto :goto_6

    .line 159
    :cond_8
    move-object v5, v1

    .line 160
    .line 161
    .line 162
    :goto_6
    filled-new-array {v4, v5}, [Ljava/lang/Object;

    .line 163
    move-result-object v4

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0, v3, v4}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 167
    move-result-object v3

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    .line 172
    :cond_9
    if-eqz v0, :cond_a

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;->getStatus()Ljava/lang/String;

    .line 176
    move-result-object v1

    .line 177
    .line 178
    .line 179
    :cond_a
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 180
    move-result-object v0

    .line 181
    .line 182
    .line 183
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 184
    move-result v0

    .line 185
    .line 186
    if-nez v0, :cond_c

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 190
    move-result-object v0

    .line 191
    .line 192
    if-eqz v0, :cond_b

    .line 193
    .line 194
    iget-object v0, v0, Lft/r1;->Z:Lcom/kubi/resources/widget/BaseTextView;

    .line 195
    .line 196
    if-eqz v0, :cond_b

    .line 197
    .line 198
    .line 199
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 200
    .line 201
    .line 202
    :cond_b
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 203
    move-result-object v0

    .line 204
    .line 205
    if-eqz v0, :cond_11

    .line 206
    .line 207
    iget-object v0, v0, Lft/r1;->p:Landroidx/appcompat/widget/AppCompatImageView;

    .line 208
    .line 209
    if-eqz v0, :cond_11

    .line 210
    .line 211
    .line 212
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 213
    return-void

    .line 214
    .line 215
    .line 216
    :cond_c
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 217
    move-result-object v0

    .line 218
    .line 219
    if-eqz v0, :cond_d

    .line 220
    .line 221
    iget-object v0, v0, Lft/r1;->Z:Lcom/kubi/resources/widget/BaseTextView;

    .line 222
    .line 223
    if-eqz v0, :cond_d

    .line 224
    .line 225
    .line 226
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 227
    .line 228
    .line 229
    :cond_d
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 230
    move-result-object v0

    .line 231
    .line 232
    if-eqz v0, :cond_e

    .line 233
    .line 234
    iget-object v0, v0, Lft/r1;->p:Landroidx/appcompat/widget/AppCompatImageView;

    .line 235
    .line 236
    if-eqz v0, :cond_e

    .line 237
    .line 238
    .line 239
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 240
    .line 241
    .line 242
    :cond_e
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 243
    move-result-object v0

    .line 244
    .line 245
    if-eqz v0, :cond_f

    .line 246
    .line 247
    iget-object v0, v0, Lft/r1;->c0:Lcom/kubi/resources/widget/BaseTextView;

    .line 248
    .line 249
    if-eqz v0, :cond_f

    .line 250
    .line 251
    sget v1, Lcom/kubi/otc/R$drawable;->shape_oval_emphasis:I

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundResource(I)V

    .line 255
    .line 256
    .line 257
    :cond_f
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 258
    move-result-object v0

    .line 259
    .line 260
    if-eqz v0, :cond_11

    .line 261
    .line 262
    iget-object v0, v0, Lft/r1;->k0:Lcom/kubi/resources/widget/BaseTextView;

    .line 263
    .line 264
    if-eqz v0, :cond_11

    .line 265
    .line 266
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 267
    .line 268
    sget v2, Lcom/kubi/otc/R$color;->c_text:I

    .line 269
    .line 270
    .line 271
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 272
    move-result v1

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 276
    return-void

    .line 277
    .line 278
    .line 279
    :cond_10
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 280
    move-result-object v0

    .line 281
    .line 282
    if-eqz v0, :cond_11

    .line 283
    .line 284
    iget-object v0, v0, Lft/r1;->g:Landroidx/constraintlayout/widget/Group;

    .line 285
    .line 286
    if-eqz v0, :cond_11

    .line 287
    .line 288
    .line 289
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 290
    :cond_11
    return-void
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

.method public final G4(Lcom/kubi/payment/p2p/data/entities/ReleaseCrypto;)V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/payment/kucard/helper/KuCardHelper;->a:Lcom/kubi/payment/kucard/helper/KuCardHelper;

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
    if-eqz p1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/kubi/payment/p2p/data/entities/ReleaseCrypto;->getBanner()Lcom/kubi/payment/data/entities/BannerInfo$Banner;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/kubi/payment/data/entities/BannerInfo$Banner;->getLinkUrl()Ljava/lang/String;

    .line 23
    move-result-object p1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    .line 27
    :goto_0
    const-string v2, "P2P"

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1, p1, v2}, Lcom/kubi/payment/kucard/helper/KuCardHelper;->f(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    return-void
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

.method public final G5()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->R()Lcom/kubi/otc/entity/AdPayType;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    iget-object v1, v1, Lft/r1;->O:Lcom/kubi/resources/widget/BaseTextView;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/kubi/otc/entity/AdPayType;->getPayTypeName()Ljava/lang/String;

    .line 26
    move-result-object v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    :cond_1
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

.method public final G6()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->h5()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    sget-object v0, Lcom/kubi/sdk/function/looper/KuCoinLooper;->INSTANCE:Lcom/kubi/sdk/function/looper/KuCoinLooper;

    .line 10
    .line 11
    const-string v1, "orderLooper"

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/kubi/sdk/function/looper/KuCoinLooper;->removeTask(Ljava/lang/String;)V

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

.method public final H4()V
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v1, v1, Lft/r1;->s0:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object v1, v1, Lft/r1;->A0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    iget-object v1, v1, Lft/r1;->H:Lcom/kubi/resources/widget/BaseTextView;

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    .line 49
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    iget-object v1, v1, Lft/r1;->Z0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 58
    .line 59
    if-eqz v1, :cond_3

    .line 60
    .line 61
    .line 62
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    if-eqz v1, :cond_4

    .line 69
    .line 70
    iget-object v1, v1, Lft/r1;->y:Lcom/kubi/resources/widget/BaseTextView;

    .line 71
    .line 72
    if-eqz v1, :cond_4

    .line 73
    .line 74
    .line 75
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 79
    move-result-object v1

    .line 80
    .line 81
    if-eqz v1, :cond_5

    .line 82
    .line 83
    iget-object v1, v1, Lft/r1;->z:Lcom/kubi/resources/widget/BaseTextView;

    .line 84
    .line 85
    if-eqz v1, :cond_5

    .line 86
    .line 87
    .line 88
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 89
    .line 90
    .line 91
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    if-eqz v1, :cond_6

    .line 95
    .line 96
    iget-object v1, v1, Lft/r1;->A:Lcom/kubi/resources/widget/BaseTextView;

    .line 97
    .line 98
    if-eqz v1, :cond_6

    .line 99
    .line 100
    .line 101
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 102
    .line 103
    .line 104
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 105
    move-result-object v1

    .line 106
    .line 107
    if-eqz v1, :cond_7

    .line 108
    .line 109
    iget-object v1, v1, Lft/r1;->B:Lcom/kubi/resources/widget/BaseTextView;

    .line 110
    .line 111
    if-eqz v1, :cond_7

    .line 112
    .line 113
    .line 114
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 115
    .line 116
    .line 117
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 118
    move-result-object v1

    .line 119
    .line 120
    if-eqz v1, :cond_8

    .line 121
    .line 122
    iget-object v1, v1, Lft/r1;->t0:Lcom/kubi/resources/widget/BaseTextView;

    .line 123
    .line 124
    if-eqz v1, :cond_8

    .line 125
    .line 126
    sget v2, Lcom/kubi/otc/R$string;->payment_p2p_order_appeal_pending:I

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 130
    move-result-object v2

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    .line 135
    .line 136
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 137
    move-result-object v1

    .line 138
    const/4 v2, 0x0

    .line 139
    .line 140
    if-eqz v1, :cond_a

    .line 141
    .line 142
    iget-object v1, v1, Lft/r1;->l0:Lcom/kubi/resources/widget/BaseTextView;

    .line 143
    .line 144
    if-eqz v1, :cond_a

    .line 145
    .line 146
    sget v4, Lcom/kubi/otc/R$string;->payment_p2p_order_appealing_subtitle_appellee:I

    .line 147
    .line 148
    sget v3, Lcom/kubi/otc/R$string;->payment_detail_minutes:I

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 152
    move-result-object v5

    .line 153
    .line 154
    check-cast v5, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 158
    move-result-object v5

    .line 159
    .line 160
    if-eqz v5, :cond_9

    .line 161
    .line 162
    .line 163
    invoke-virtual {v5}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getCsTimeLimit()Ljava/lang/String;

    .line 164
    move-result-object v5

    .line 165
    goto :goto_0

    .line 166
    :cond_9
    move-object v5, v2

    .line 167
    .line 168
    .line 169
    :goto_0
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 170
    move-result-object v5

    .line 171
    .line 172
    .line 173
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 174
    move-result-object v5

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0, v3, v5}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 178
    move-result-object v5

    .line 179
    .line 180
    const-string v3, "getString(...)"

    .line 181
    .line 182
    .line 183
    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    .line 185
    const/16 v8, 0xc

    .line 186
    const/4 v9, 0x0

    .line 187
    const/4 v6, 0x0

    .line 188
    const/4 v7, 0x0

    .line 189
    move-object v3, p0

    .line 190
    .line 191
    .line 192
    invoke-static/range {v3 .. v9}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->C4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;ILjava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Landroid/text/SpannableString;

    .line 193
    move-result-object v4

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 197
    goto :goto_1

    .line 198
    :cond_a
    move-object v3, p0

    .line 199
    .line 200
    .line 201
    :goto_1
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 202
    move-result-object v1

    .line 203
    .line 204
    if-eqz v1, :cond_b

    .line 205
    .line 206
    iget-object v1, v1, Lft/r1;->y:Lcom/kubi/resources/widget/BaseTextView;

    .line 207
    .line 208
    if-eqz v1, :cond_b

    .line 209
    .line 210
    sget v4, Lcom/kubi/otc/R$string;->payment_p2p_order_appealing_appellee_desc1:I

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 214
    move-result-object v4

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 218
    .line 219
    .line 220
    :cond_b
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 221
    move-result-object v1

    .line 222
    .line 223
    if-eqz v1, :cond_c

    .line 224
    .line 225
    iget-object v1, v1, Lft/r1;->z:Lcom/kubi/resources/widget/BaseTextView;

    .line 226
    .line 227
    if-eqz v1, :cond_c

    .line 228
    .line 229
    sget v4, Lcom/kubi/otc/R$string;->payment_p2p_order_appealing_appellee_desc2:I

    .line 230
    .line 231
    .line 232
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 233
    move-result-object v4

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 237
    .line 238
    .line 239
    :cond_c
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 240
    move-result-object v1

    .line 241
    .line 242
    if-eqz v1, :cond_d

    .line 243
    .line 244
    iget-object v1, v1, Lft/r1;->A:Lcom/kubi/resources/widget/BaseTextView;

    .line 245
    .line 246
    if-eqz v1, :cond_d

    .line 247
    .line 248
    sget v4, Lcom/kubi/otc/R$string;->payment_p2p_order_appealing_appellee_desc3:I

    .line 249
    .line 250
    .line 251
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 252
    move-result-object v4

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 256
    .line 257
    .line 258
    :cond_d
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 259
    move-result-object v1

    .line 260
    .line 261
    if-eqz v1, :cond_e

    .line 262
    .line 263
    iget-object v1, v1, Lft/r1;->B:Lcom/kubi/resources/widget/BaseTextView;

    .line 264
    .line 265
    if-eqz v1, :cond_e

    .line 266
    .line 267
    sget v4, Lcom/kubi/otc/R$string;->payment_p2p_order_appealing_appellee_desc4:I

    .line 268
    .line 269
    .line 270
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 271
    move-result-object v4

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 275
    .line 276
    .line 277
    :cond_e
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 278
    move-result-object v1

    .line 279
    .line 280
    if-eqz v1, :cond_f

    .line 281
    .line 282
    iget-object v1, v1, Lft/r1;->y:Lcom/kubi/resources/widget/BaseTextView;

    .line 283
    goto :goto_2

    .line 284
    :cond_f
    move-object v1, v2

    .line 285
    .line 286
    .line 287
    :goto_2
    invoke-virtual {p0, v1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->c6(Landroid/widget/TextView;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 291
    move-result-object v1

    .line 292
    .line 293
    if-eqz v1, :cond_10

    .line 294
    .line 295
    iget-object v1, v1, Lft/r1;->z:Lcom/kubi/resources/widget/BaseTextView;

    .line 296
    goto :goto_3

    .line 297
    :cond_10
    move-object v1, v2

    .line 298
    .line 299
    .line 300
    :goto_3
    invoke-virtual {p0, v1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->c6(Landroid/widget/TextView;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 304
    move-result-object v1

    .line 305
    .line 306
    if-eqz v1, :cond_11

    .line 307
    .line 308
    iget-object v1, v1, Lft/r1;->B:Lcom/kubi/resources/widget/BaseTextView;

    .line 309
    goto :goto_4

    .line 310
    :cond_11
    move-object v1, v2

    .line 311
    .line 312
    .line 313
    :goto_4
    invoke-virtual {p0, v1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->b6(Landroid/widget/TextView;)V

    .line 314
    .line 315
    if-eqz v0, :cond_12

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getHasRecord()Ljava/lang/Boolean;

    .line 319
    move-result-object v2

    .line 320
    .line 321
    .line 322
    :cond_12
    invoke-static {v2}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 323
    move-result v0

    .line 324
    .line 325
    if-eqz v0, :cond_13

    .line 326
    .line 327
    .line 328
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 329
    move-result-object v0

    .line 330
    .line 331
    if-eqz v0, :cond_14

    .line 332
    .line 333
    iget-object v0, v0, Lft/r1;->m0:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 334
    .line 335
    if-eqz v0, :cond_14

    .line 336
    .line 337
    sget v1, Lcom/kubi/otc/R$string;->payment_detail_additional_remarks:I

    .line 338
    .line 339
    .line 340
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 341
    move-result-object v1

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 345
    return-void

    .line 346
    .line 347
    .line 348
    :cond_13
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 349
    move-result-object v0

    .line 350
    .line 351
    if-eqz v0, :cond_14

    .line 352
    .line 353
    iget-object v0, v0, Lft/r1;->m0:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 354
    .line 355
    if-eqz v0, :cond_14

    .line 356
    .line 357
    sget v1, Lcom/kubi/otc/R$string;->payment_detail_submission_remarks:I

    .line 358
    .line 359
    .line 360
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 361
    move-result-object v1

    .line 362
    .line 363
    .line 364
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 365
    :cond_14
    return-void
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

.method public final H5()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->P2P:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, v0, Lft/r1;->F0:Lcom/kubi/payment/p2p/widget/P2PViewChatCardEntrance;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    sget v1, Lcom/kubi/otc/R$id;->tvChat:I

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 30
    goto :goto_0

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget-object v0, v0, Lft/r1;->F0:Lcom/kubi/payment/p2p/widget/P2PViewChatCardEntrance;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    sget v1, Lcom/kubi/otc/R$id;->tvChat:I

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    iget-object v0, v0, Lft/r1;->s0:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    iget-object v0, v0, Lft/r1;->A0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 73
    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 78
    .line 79
    .line 80
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    iget-object v0, v0, Lft/r1;->H:Lcom/kubi/resources/widget/BaseTextView;

    .line 86
    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    .line 90
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 94
    move-result-object v0

    .line 95
    .line 96
    if-eqz v0, :cond_5

    .line 97
    .line 98
    iget-object v0, v0, Lft/r1;->Z0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 99
    .line 100
    if-eqz v0, :cond_5

    .line 101
    .line 102
    .line 103
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 104
    .line 105
    .line 106
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 107
    move-result-object v0

    .line 108
    .line 109
    if-eqz v0, :cond_6

    .line 110
    .line 111
    iget-object v0, v0, Lft/r1;->H:Lcom/kubi/resources/widget/BaseTextView;

    .line 112
    .line 113
    if-eqz v0, :cond_6

    .line 114
    .line 115
    .line 116
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 117
    .line 118
    .line 119
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 120
    move-result-object v0

    .line 121
    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    iget-object v0, v0, Lft/r1;->K:Lcom/kubi/resources/widget/BaseTextView;

    .line 125
    .line 126
    if-eqz v0, :cond_7

    .line 127
    .line 128
    .line 129
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 130
    .line 131
    .line 132
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 133
    move-result-object v0

    .line 134
    .line 135
    if-eqz v0, :cond_8

    .line 136
    .line 137
    iget-object v0, v0, Lft/r1;->E0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 138
    .line 139
    if-eqz v0, :cond_8

    .line 140
    .line 141
    .line 142
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 143
    .line 144
    .line 145
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 146
    move-result-object v0

    .line 147
    .line 148
    if-eqz v0, :cond_9

    .line 149
    .line 150
    iget-object v0, v0, Lft/r1;->t0:Lcom/kubi/resources/widget/BaseTextView;

    .line 151
    .line 152
    if-eqz v0, :cond_9

    .line 153
    .line 154
    sget v1, Lcom/kubi/otc/R$string;->payment_detail_deal_complete:I

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 158
    move-result-object v1

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 162
    .line 163
    .line 164
    :cond_9
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 165
    move-result-object v0

    .line 166
    .line 167
    if-eqz v0, :cond_a

    .line 168
    .line 169
    iget-object v0, v0, Lft/r1;->l0:Lcom/kubi/resources/widget/BaseTextView;

    .line 170
    .line 171
    if-eqz v0, :cond_a

    .line 172
    .line 173
    sget v1, Lcom/kubi/otc/R$string;->payment_detail_sell_payed_coin_sub_title:I

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 177
    move-result-object v1

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 181
    :cond_a
    return-void
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

.method public final I5()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lft/r1;->s0:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, v0, Lft/r1;->H:Lcom/kubi/resources/widget/BaseTextView;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v0, v0, Lft/r1;->Z0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    iget-object v0, v0, Lft/r1;->E0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    iget-object v0, v0, Lft/r1;->L0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 61
    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 66
    .line 67
    .line 68
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    iget-object v0, v0, Lft/r1;->t0:Lcom/kubi/resources/widget/BaseTextView;

    .line 74
    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    sget v1, Lcom/kubi/otc/R$string;->payment_detail_wait_opposite_pay:I

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 81
    move-result-object v1

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    .line 86
    .line 87
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    if-eqz v0, :cond_6

    .line 91
    .line 92
    iget-object v0, v0, Lft/r1;->s0:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 93
    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    sget v1, Lcom/kubi/otc/R$string;->payment_p2p_order_created_desc_seller:I

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 100
    move-result-object v1

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    .line 105
    .line 106
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 107
    move-result-object v0

    .line 108
    .line 109
    if-eqz v0, :cond_7

    .line 110
    .line 111
    iget-object v0, v0, Lft/r1;->Y:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 112
    .line 113
    if-eqz v0, :cond_7

    .line 114
    .line 115
    sget v1, Lcom/kubi/otc/R$string;->payment_detail_confirm_pay_coin:I

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 119
    move-result-object v1

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 123
    .line 124
    .line 125
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 126
    move-result-object v0

    .line 127
    .line 128
    if-eqz v0, :cond_8

    .line 129
    .line 130
    iget-object v0, v0, Lft/r1;->Y:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 131
    .line 132
    if-eqz v0, :cond_8

    .line 133
    const/4 v1, 0x0

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 137
    .line 138
    .line 139
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 140
    move-result-object v0

    .line 141
    .line 142
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->L0()V

    .line 146
    return-void
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

.method public final J5()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lft/r1;->s0:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, v0, Lft/r1;->A0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v0, v0, Lft/r1;->H:Lcom/kubi/resources/widget/BaseTextView;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    iget-object v0, v0, Lft/r1;->Z0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    iget-object v0, v0, Lft/r1;->H:Lcom/kubi/resources/widget/BaseTextView;

    .line 61
    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 66
    .line 67
    .line 68
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    iget-object v0, v0, Lft/r1;->E0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 74
    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 82
    move-result-object v0

    .line 83
    .line 84
    if-eqz v0, :cond_6

    .line 85
    .line 86
    iget-object v0, v0, Lft/r1;->F:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 87
    .line 88
    if-eqz v0, :cond_6

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 92
    .line 93
    .line 94
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 95
    move-result-object v0

    .line 96
    .line 97
    if-eqz v0, :cond_7

    .line 98
    .line 99
    iget-object v0, v0, Lft/r1;->L0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 100
    .line 101
    if-eqz v0, :cond_7

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 105
    .line 106
    .line 107
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 108
    move-result-object v0

    .line 109
    .line 110
    if-eqz v0, :cond_8

    .line 111
    .line 112
    iget-object v0, v0, Lft/r1;->W0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 113
    .line 114
    if-eqz v0, :cond_8

    .line 115
    .line 116
    .line 117
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 118
    .line 119
    .line 120
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 121
    move-result-object v0

    .line 122
    .line 123
    if-eqz v0, :cond_9

    .line 124
    .line 125
    iget-object v0, v0, Lft/r1;->t0:Lcom/kubi/resources/widget/BaseTextView;

    .line 126
    .line 127
    if-eqz v0, :cond_9

    .line 128
    .line 129
    sget v1, Lcom/kubi/otc/R$string;->payment_p2p_order_wait_you_release:I

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 133
    move-result-object v1

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    .line 138
    .line 139
    :cond_9
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 140
    move-result-object v0

    .line 141
    .line 142
    if-eqz v0, :cond_a

    .line 143
    .line 144
    iget-object v0, v0, Lft/r1;->l0:Lcom/kubi/resources/widget/BaseTextView;

    .line 145
    .line 146
    if-eqz v0, :cond_a

    .line 147
    .line 148
    sget v1, Lcom/kubi/otc/R$string;->payment_p2p_order_payedMoney_subtitle_seller:I

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 152
    move-result-object v1

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 156
    .line 157
    .line 158
    :cond_a
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 159
    move-result-object v0

    .line 160
    .line 161
    if-eqz v0, :cond_b

    .line 162
    .line 163
    iget-object v0, v0, Lft/r1;->Y:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 164
    .line 165
    if-eqz v0, :cond_b

    .line 166
    .line 167
    sget v1, Lcom/kubi/otc/R$string;->payment_detail_confirm_pay_coin:I

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 171
    move-result-object v1

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 175
    .line 176
    .line 177
    :cond_b
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 178
    move-result-object v0

    .line 179
    .line 180
    if-eqz v0, :cond_c

    .line 181
    .line 182
    iget-object v0, v0, Lft/r1;->Y:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 183
    .line 184
    if-eqz v0, :cond_c

    .line 185
    const/4 v1, 0x1

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 189
    .line 190
    .line 191
    :cond_c
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 192
    move-result-object v0

    .line 193
    .line 194
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->D0()V

    .line 198
    return-void
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

.method public final K5()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->X5()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D5()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, v0, Lft/r1;->q:Landroidx/appcompat/widget/AppCompatImageView;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    sget v1, Lcom/kubi/otc/R$drawable;->ic2_fail_16:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, v0, Lft/r1;->q:Landroidx/appcompat/widget/AppCompatImageView;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 34
    .line 35
    sget v2, Lcom/kubi/otc/R$color;->c_icon60:I

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 39
    move-result v1

    .line 40
    .line 41
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1, v2}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    iget-object v0, v0, Lft/r1;->h0:Lcom/kubi/resources/widget/BaseTextView;

    .line 53
    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    sget v1, Lcom/kubi/otc/R$string;->order_cancelled:I

    .line 57
    const/4 v2, 0x0

    .line 58
    .line 59
    new-array v2, v2, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v1, v2}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    iget-object v0, v0, Lft/r1;->h0:Lcom/kubi/resources/widget/BaseTextView;

    .line 75
    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 79
    .line 80
    sget v2, Lcom/kubi/otc/R$color;->c_text40:I

    .line 81
    .line 82
    .line 83
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 84
    move-result v1

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 88
    :cond_3
    return-void
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

.method public final L5()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->z5()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D5()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, v0, Lft/r1;->q:Landroidx/appcompat/widget/AppCompatImageView;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    sget v1, Lcom/kubi/otc/R$drawable;->ic2_fail_16:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, v0, Lft/r1;->q:Landroidx/appcompat/widget/AppCompatImageView;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 34
    .line 35
    sget v2, Lcom/kubi/otc/R$color;->brandRed:I

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 39
    move-result v1

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    iget-object v0, v0, Lft/r1;->h0:Lcom/kubi/resources/widget/BaseTextView;

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    sget v1, Lcom/kubi/otc/R$string;->failed:I

    .line 55
    const/4 v2, 0x0

    .line 56
    .line 57
    new-array v2, v2, [Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v1, v2}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    move-result-object v1

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    iget-object v0, v0, Lft/r1;->h0:Lcom/kubi/resources/widget/BaseTextView;

    .line 73
    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 77
    .line 78
    sget v2, Lcom/kubi/otc/R$color;->brandRed:I

    .line 79
    .line 80
    .line 81
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 82
    move-result v1

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 86
    .line 87
    .line 88
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->Z5()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 92
    move-result-object v0

    .line 93
    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    iget-object v0, v0, Lft/r1;->i0:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 97
    .line 98
    if-eqz v0, :cond_6

    .line 99
    .line 100
    sget v1, Lcom/kubi/otc/R$string;->p2pexpress_covertfaild_detail:I

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 104
    move-result-object v2

    .line 105
    .line 106
    check-cast v2, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 110
    move-result-object v2

    .line 111
    const/4 v3, 0x0

    .line 112
    .line 113
    if-eqz v2, :cond_4

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getExpressInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;

    .line 117
    move-result-object v2

    .line 118
    .line 119
    if-eqz v2, :cond_4

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;->getFromCurrency()Ljava/lang/String;

    .line 123
    move-result-object v2

    .line 124
    goto :goto_0

    .line 125
    :cond_4
    move-object v2, v3

    .line 126
    .line 127
    .line 128
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 129
    move-result-object v4

    .line 130
    .line 131
    check-cast v4, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 135
    move-result-object v4

    .line 136
    .line 137
    if-eqz v4, :cond_5

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getExpressInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;

    .line 141
    move-result-object v4

    .line 142
    .line 143
    if-eqz v4, :cond_5

    .line 144
    .line 145
    .line 146
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;->getDepositCurrency()Ljava/lang/String;

    .line 147
    move-result-object v3

    .line 148
    .line 149
    .line 150
    :cond_5
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 151
    move-result-object v2

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0, v1, v2}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 155
    move-result-object v1

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 159
    .line 160
    .line 161
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 162
    move-result-object v0

    .line 163
    .line 164
    if-eqz v0, :cond_7

    .line 165
    .line 166
    iget-object v0, v0, Lft/r1;->i0:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 167
    .line 168
    if-eqz v0, :cond_7

    .line 169
    .line 170
    .line 171
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 172
    move-result-object v1

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 176
    .line 177
    .line 178
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 179
    move-result-object v0

    .line 180
    .line 181
    if-eqz v0, :cond_8

    .line 182
    .line 183
    iget-object v0, v0, Lft/r1;->i0:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 184
    .line 185
    if-eqz v0, :cond_8

    .line 186
    .line 187
    sget-object v1, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    .line 188
    .line 189
    new-instance v2, Lkotlin/Pair;

    .line 190
    .line 191
    sget-object v3, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 192
    .line 193
    new-instance v4, Lcom/kubi/payment/p2p/order/OrderDetailFragment$a;

    .line 194
    .line 195
    .line 196
    invoke-direct {v4, p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment$a;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 197
    .line 198
    .line 199
    invoke-direct {v2, v3, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 203
    move-result-object v2

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1, v0, v2}, Lcom/kubi/resources/HighlightTextHelper;->f(Landroid/widget/TextView;[Lkotlin/Pair;)V

    .line 207
    .line 208
    .line 209
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 210
    move-result-object v0

    .line 211
    .line 212
    if-eqz v0, :cond_9

    .line 213
    .line 214
    iget-object v0, v0, Lft/r1;->i0:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 215
    .line 216
    if-eqz v0, :cond_9

    .line 217
    .line 218
    .line 219
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 220
    :cond_9
    return-void
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

.method public final M5()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->z5()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    iget-object v0, v0, Lft/r1;->t0:Lcom/kubi/resources/widget/BaseTextView;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    sget v1, Lcom/kubi/otc/R$string;->p2pexpress_confirm_covert:I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    check-cast v2, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 25
    move-result-object v2

    .line 26
    const/4 v3, 0x0

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getExpressInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;->getFromCurrency()Ljava/lang/String;

    .line 38
    move-result-object v2

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object v2, v3

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 44
    move-result-object v4

    .line 45
    .line 46
    check-cast v4, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 50
    move-result-object v4

    .line 51
    .line 52
    if-eqz v4, :cond_1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getExpressInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;

    .line 56
    move-result-object v4

    .line 57
    .line 58
    if-eqz v4, :cond_1

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;->getDepositCurrency()Ljava/lang/String;

    .line 62
    move-result-object v3

    .line 63
    .line 64
    .line 65
    :cond_1
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 66
    move-result-object v2

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v1, v2}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D5()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    iget-object v0, v0, Lft/r1;->q:Landroidx/appcompat/widget/AppCompatImageView;

    .line 85
    .line 86
    if-eqz v0, :cond_3

    .line 87
    .line 88
    sget v1, Lcom/kubi/otc/R$drawable;->ic2_loading_16:I

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 92
    .line 93
    .line 94
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 95
    move-result-object v0

    .line 96
    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    iget-object v0, v0, Lft/r1;->q:Landroidx/appcompat/widget/AppCompatImageView;

    .line 100
    .line 101
    if-eqz v0, :cond_4

    .line 102
    .line 103
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 104
    .line 105
    sget v2, Lcom/kubi/otc/R$color;->complementary:I

    .line 106
    .line 107
    .line 108
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 109
    move-result v1

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 113
    .line 114
    .line 115
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 116
    move-result-object v0

    .line 117
    .line 118
    if-eqz v0, :cond_5

    .line 119
    .line 120
    iget-object v0, v0, Lft/r1;->h0:Lcom/kubi/resources/widget/BaseTextView;

    .line 121
    .line 122
    if-eqz v0, :cond_5

    .line 123
    .line 124
    sget v1, Lcom/kubi/otc/R$string;->in_progress:I

    .line 125
    const/4 v2, 0x0

    .line 126
    .line 127
    new-array v2, v2, [Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v1, v2}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 131
    move-result-object v1

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    .line 136
    .line 137
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 138
    move-result-object v0

    .line 139
    .line 140
    if-eqz v0, :cond_6

    .line 141
    .line 142
    iget-object v0, v0, Lft/r1;->h0:Lcom/kubi/resources/widget/BaseTextView;

    .line 143
    .line 144
    if-eqz v0, :cond_6

    .line 145
    .line 146
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 147
    .line 148
    sget v2, Lcom/kubi/otc/R$color;->complementary:I

    .line 149
    .line 150
    .line 151
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 152
    move-result v1

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 156
    .line 157
    .line 158
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 159
    move-result-object v0

    .line 160
    .line 161
    if-eqz v0, :cond_7

    .line 162
    .line 163
    iget-object v0, v0, Lft/r1;->F:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 164
    .line 165
    if-eqz v0, :cond_7

    .line 166
    .line 167
    .line 168
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 169
    .line 170
    .line 171
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 172
    move-result-object v0

    .line 173
    .line 174
    if-eqz v0, :cond_8

    .line 175
    .line 176
    iget-object v0, v0, Lft/r1;->E0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 177
    .line 178
    if-eqz v0, :cond_8

    .line 179
    .line 180
    .line 181
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 182
    .line 183
    .line 184
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 185
    move-result-object v0

    .line 186
    .line 187
    if-eqz v0, :cond_9

    .line 188
    .line 189
    iget-object v0, v0, Lft/r1;->F:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 190
    .line 191
    if-eqz v0, :cond_9

    .line 192
    .line 193
    new-instance v1, Lcom/kubi/payment/p2p/order/g0;

    .line 194
    .line 195
    .line 196
    invoke-direct {v1, p0}, Lcom/kubi/payment/p2p/order/g0;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 200
    :cond_9
    return-void
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

.method public final O5()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->z5()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D5()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, v0, Lft/r1;->q:Landroidx/appcompat/widget/AppCompatImageView;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    sget v1, Lcom/kubi/otc/R$drawable;->ic2_success_16:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, v0, Lft/r1;->q:Landroidx/appcompat/widget/AppCompatImageView;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 34
    .line 35
    sget v2, Lcom/kubi/otc/R$color;->brandGreen:I

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 39
    move-result v1

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    iget-object v0, v0, Lft/r1;->h0:Lcom/kubi/resources/widget/BaseTextView;

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    sget v1, Lcom/kubi/otc/R$string;->completed:I

    .line 55
    const/4 v2, 0x0

    .line 56
    .line 57
    new-array v2, v2, [Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v1, v2}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    move-result-object v1

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    iget-object v0, v0, Lft/r1;->h0:Lcom/kubi/resources/widget/BaseTextView;

    .line 73
    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 77
    .line 78
    sget v2, Lcom/kubi/otc/R$color;->brandGreen:I

    .line 79
    .line 80
    .line 81
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 82
    move-result v1

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 86
    .line 87
    .line 88
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->Z5()V

    .line 89
    return-void
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

.method public final P5()V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->M5()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/payment/p2p/order/express/P2PExpressDialog;->z0:Lcom/kubi/payment/p2p/order/express/P2PExpressDialog$Companion;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    const-string v2, "getChildFragmentManager(...)"

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    check-cast v2, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 24
    move-result-object v2

    .line 25
    const/4 v3, 0x0

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getId()Ljava/lang/String;

    .line 31
    move-result-object v2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v2, v3

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    sget v4, Lcom/kubi/otc/R$string;->payment_price:I

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 43
    move-result-object v5

    .line 44
    .line 45
    check-cast v5, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 49
    move-result-object v5

    .line 50
    .line 51
    if-eqz v5, :cond_1

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getExpressInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;

    .line 55
    move-result-object v5

    .line 56
    .line 57
    if-eqz v5, :cond_1

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;->getReferencePrice()Ljava/lang/String;

    .line 61
    move-result-object v5

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move-object v5, v3

    .line 64
    .line 65
    .line 66
    :goto_1
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    move-result-object v5

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 71
    move-result-object v6

    .line 72
    .line 73
    check-cast v6, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v6}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 77
    move-result-object v6

    .line 78
    .line 79
    if-eqz v6, :cond_2

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getExpressInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;

    .line 83
    move-result-object v6

    .line 84
    .line 85
    if-eqz v6, :cond_2

    .line 86
    .line 87
    .line 88
    invoke-virtual {v6}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;->getFromCurrency()Ljava/lang/String;

    .line 89
    move-result-object v6

    .line 90
    goto :goto_2

    .line 91
    :cond_2
    move-object v6, v3

    .line 92
    .line 93
    .line 94
    :goto_2
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    move-result-object v6

    .line 96
    .line 97
    .line 98
    filled-new-array {v5, v6}, [Ljava/lang/Object;

    .line 99
    move-result-object v5

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v4, v5}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 103
    move-result-object v5

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 107
    move-result-object v6

    .line 108
    .line 109
    check-cast v6, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v6}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 113
    move-result-object v6

    .line 114
    .line 115
    if-eqz v6, :cond_3

    .line 116
    .line 117
    .line 118
    invoke-virtual {v6}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getExpressInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;

    .line 119
    move-result-object v6

    .line 120
    .line 121
    if-eqz v6, :cond_3

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;->getDepositAmount()Ljava/lang/String;

    .line 125
    move-result-object v6

    .line 126
    goto :goto_3

    .line 127
    :cond_3
    move-object v6, v3

    .line 128
    .line 129
    .line 130
    :goto_3
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    move-result-object v6

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 135
    move-result-object v7

    .line 136
    .line 137
    check-cast v7, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v7}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 141
    move-result-object v7

    .line 142
    .line 143
    if-eqz v7, :cond_4

    .line 144
    .line 145
    .line 146
    invoke-virtual {v7}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getExpressInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;

    .line 147
    move-result-object v7

    .line 148
    .line 149
    if-eqz v7, :cond_4

    .line 150
    .line 151
    .line 152
    invoke-virtual {v7}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;->getDepositCurrency()Ljava/lang/String;

    .line 153
    move-result-object v7

    .line 154
    goto :goto_4

    .line 155
    :cond_4
    move-object v7, v3

    .line 156
    .line 157
    .line 158
    :goto_4
    invoke-static {v7}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    move-result-object v7

    .line 160
    .line 161
    .line 162
    filled-new-array {v6, v7}, [Ljava/lang/Object;

    .line 163
    move-result-object v6

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0, v4, v6}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 167
    move-result-object v4

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 171
    move-result-object v6

    .line 172
    .line 173
    check-cast v6, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v6}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 177
    move-result-object v6

    .line 178
    .line 179
    if-eqz v6, :cond_5

    .line 180
    .line 181
    .line 182
    invoke-virtual {v6}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getExpressInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;

    .line 183
    move-result-object v6

    .line 184
    .line 185
    if-eqz v6, :cond_5

    .line 186
    .line 187
    .line 188
    invoke-virtual {v6}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;->getFromCurrency()Ljava/lang/String;

    .line 189
    move-result-object v3

    .line 190
    .line 191
    .line 192
    :cond_5
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 193
    move-result-object v3

    .line 194
    .line 195
    new-instance v6, Lcom/kubi/payment/p2p/order/k0;

    .line 196
    .line 197
    .line 198
    invoke-direct {v6, p0}, Lcom/kubi/payment/p2p/order/k0;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 199
    move-object v8, v5

    .line 200
    move-object v5, v3

    .line 201
    move-object v3, v8

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v0 .. v6}, Lcom/kubi/payment/p2p/order/express/P2PExpressDialog$Companion;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 205
    return-void
    .line 206
    .line 207
    .line 208
    .line 209
.end method

.method public final R5()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->isAppealAndConsultSame()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 26
    move-result v0

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->T5()V

    .line 32
    return-void

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->H4()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-object v0, v0, Lft/r1;->E0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    iget-object v0, v0, Lft/r1;->F:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/kubi/resources/widget/button/KcPrimaryButton;->l()V

    .line 62
    .line 63
    .line 64
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    iget-object v0, v0, Lft/r1;->F:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 70
    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    .line 74
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 75
    .line 76
    .line 77
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    iget-object v0, v0, Lft/r1;->L0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 83
    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    .line 87
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 88
    .line 89
    .line 90
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 91
    move-result-object v0

    .line 92
    .line 93
    if-eqz v0, :cond_6

    .line 94
    .line 95
    iget-object v0, v0, Lft/r1;->W0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 96
    .line 97
    if-eqz v0, :cond_6

    .line 98
    .line 99
    .line 100
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 101
    .line 102
    .line 103
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 104
    move-result-object v0

    .line 105
    .line 106
    if-eqz v0, :cond_7

    .line 107
    .line 108
    iget-object v0, v0, Lft/r1;->F:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 109
    .line 110
    if-eqz v0, :cond_7

    .line 111
    const/4 v1, 0x0

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 115
    .line 116
    .line 117
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 118
    move-result-object v0

    .line 119
    .line 120
    if-eqz v0, :cond_8

    .line 121
    .line 122
    iget-object v0, v0, Lft/r1;->F:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 123
    .line 124
    if-eqz v0, :cond_8

    .line 125
    .line 126
    sget v1, Lcom/kubi/otc/R$string;->payment_p2p_order_confirmed_consensus:I

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 130
    move-result-object v1

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    :cond_8
    return-void
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

.method public final S5()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->e5()V

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getHasRecord()Ljava/lang/Boolean;

    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 25
    move-result v0

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object v0, v0, Lft/r1;->m0:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    sget v1, Lcom/kubi/otc/R$string;->payment_detail_additional_remarks:I

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    return-void

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    iget-object v0, v0, Lft/r1;->m0:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    sget v1, Lcom/kubi/otc/R$string;->payment_detail_submission_remarks:I

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    :cond_2
    return-void
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

.method public final T5()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->H4()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lft/r1;->E0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, v0, Lft/r1;->F:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-object v0, v0, Lft/r1;->L0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    iget-object v0, v0, Lft/r1;->W0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    iget-object v0, v0, Lft/r1;->q0:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 64
    .line 65
    if-eqz v0, :cond_4

    .line 66
    .line 67
    sget v1, Lcom/kubi/otc/R$string;->payment_p2p_order_consensus_failed:I

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    iget-object v0, v0, Lft/r1;->r0:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 83
    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    sget v1, Lcom/kubi/otc/R$string;->payment_p2p_order_consensus_reached:I

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 90
    move-result-object v1

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    :cond_5
    return-void
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

.method public final U5()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->W5()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->isAppealAndConsultSame()Z

    .line 19
    move-result v0

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    move-result-object v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 29
    move-result v0

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->u6()V

    .line 35
    :cond_1
    return-void
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

.method public final V5()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->e5()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lft/r1;->C:Lcom/kubi/resources/widget/button/KcSecondaryButton;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, v0, Lft/r1;->m0:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    sget v1, Lcom/kubi/otc/R$string;->payment_detail_additional_remarks:I

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    :cond_1
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

.method public final W5()V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lft/r1;->s0:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, v0, Lft/r1;->A0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v0, v0, Lft/r1;->C:Lcom/kubi/resources/widget/button/KcSecondaryButton;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    iget-object v0, v0, Lft/r1;->H:Lcom/kubi/resources/widget/BaseTextView;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    iget-object v0, v0, Lft/r1;->Z0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 61
    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 66
    .line 67
    .line 68
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    iget-object v0, v0, Lft/r1;->E0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 74
    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 82
    move-result-object v0

    .line 83
    .line 84
    if-eqz v0, :cond_6

    .line 85
    .line 86
    iget-object v0, v0, Lft/r1;->y:Lcom/kubi/resources/widget/BaseTextView;

    .line 87
    .line 88
    if-eqz v0, :cond_6

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 92
    .line 93
    .line 94
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 95
    move-result-object v0

    .line 96
    .line 97
    if-eqz v0, :cond_7

    .line 98
    .line 99
    iget-object v0, v0, Lft/r1;->z:Lcom/kubi/resources/widget/BaseTextView;

    .line 100
    .line 101
    if-eqz v0, :cond_7

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 105
    .line 106
    .line 107
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 108
    move-result-object v0

    .line 109
    .line 110
    if-eqz v0, :cond_8

    .line 111
    .line 112
    iget-object v0, v0, Lft/r1;->A:Lcom/kubi/resources/widget/BaseTextView;

    .line 113
    .line 114
    if-eqz v0, :cond_8

    .line 115
    .line 116
    .line 117
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 118
    .line 119
    .line 120
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 121
    move-result-object v0

    .line 122
    .line 123
    if-eqz v0, :cond_9

    .line 124
    .line 125
    iget-object v0, v0, Lft/r1;->B:Lcom/kubi/resources/widget/BaseTextView;

    .line 126
    .line 127
    if-eqz v0, :cond_9

    .line 128
    .line 129
    .line 130
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 131
    .line 132
    .line 133
    :cond_9
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 134
    move-result-object v0

    .line 135
    .line 136
    if-eqz v0, :cond_a

    .line 137
    .line 138
    iget-object v0, v0, Lft/r1;->t0:Lcom/kubi/resources/widget/BaseTextView;

    .line 139
    .line 140
    if-eqz v0, :cond_a

    .line 141
    .line 142
    sget v1, Lcom/kubi/otc/R$string;->payment_detail_deal_appeal:I

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 146
    move-result-object v1

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 150
    .line 151
    .line 152
    :cond_a
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 153
    move-result-object v0

    .line 154
    const/4 v1, 0x0

    .line 155
    .line 156
    if-eqz v0, :cond_c

    .line 157
    .line 158
    iget-object v0, v0, Lft/r1;->l0:Lcom/kubi/resources/widget/BaseTextView;

    .line 159
    .line 160
    if-eqz v0, :cond_c

    .line 161
    .line 162
    sget v3, Lcom/kubi/otc/R$string;->payment_p2p_order_appealing_subtitle:I

    .line 163
    .line 164
    sget v2, Lcom/kubi/otc/R$string;->payment_detail_minutes:I

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 168
    move-result-object v4

    .line 169
    .line 170
    check-cast v4, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 174
    move-result-object v4

    .line 175
    .line 176
    if-eqz v4, :cond_b

    .line 177
    .line 178
    .line 179
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getCsTimeLimit()Ljava/lang/String;

    .line 180
    move-result-object v4

    .line 181
    goto :goto_0

    .line 182
    :cond_b
    move-object v4, v1

    .line 183
    .line 184
    .line 185
    :goto_0
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    move-result-object v4

    .line 187
    .line 188
    .line 189
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 190
    move-result-object v4

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0, v2, v4}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 194
    move-result-object v4

    .line 195
    .line 196
    const-string v2, "getString(...)"

    .line 197
    .line 198
    .line 199
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    .line 201
    const/16 v7, 0xc

    .line 202
    const/4 v8, 0x0

    .line 203
    const/4 v5, 0x0

    .line 204
    const/4 v6, 0x0

    .line 205
    move-object v2, p0

    .line 206
    .line 207
    .line 208
    invoke-static/range {v2 .. v8}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->C4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;ILjava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Landroid/text/SpannableString;

    .line 209
    move-result-object v3

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 213
    goto :goto_1

    .line 214
    :cond_c
    move-object v2, p0

    .line 215
    .line 216
    .line 217
    :goto_1
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 218
    move-result-object v0

    .line 219
    .line 220
    if-eqz v0, :cond_d

    .line 221
    .line 222
    iget-object v0, v0, Lft/r1;->y:Lcom/kubi/resources/widget/BaseTextView;

    .line 223
    .line 224
    if-eqz v0, :cond_d

    .line 225
    .line 226
    sget v3, Lcom/kubi/otc/R$string;->payment_p2p_order_appealing_desc1:I

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 230
    move-result-object v3

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 234
    .line 235
    .line 236
    :cond_d
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 237
    move-result-object v0

    .line 238
    .line 239
    if-eqz v0, :cond_e

    .line 240
    .line 241
    iget-object v0, v0, Lft/r1;->z:Lcom/kubi/resources/widget/BaseTextView;

    .line 242
    .line 243
    if-eqz v0, :cond_e

    .line 244
    .line 245
    sget v3, Lcom/kubi/otc/R$string;->payment_p2p_order_appealing_desc2:I

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 249
    move-result-object v3

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 253
    .line 254
    .line 255
    :cond_e
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 256
    move-result-object v0

    .line 257
    .line 258
    if-eqz v0, :cond_f

    .line 259
    .line 260
    iget-object v0, v0, Lft/r1;->A:Lcom/kubi/resources/widget/BaseTextView;

    .line 261
    .line 262
    if-eqz v0, :cond_f

    .line 263
    .line 264
    sget v3, Lcom/kubi/otc/R$string;->payment_p2p_order_appealing_desc4:I

    .line 265
    .line 266
    .line 267
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 268
    move-result-object v3

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 272
    .line 273
    .line 274
    :cond_f
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 275
    move-result-object v0

    .line 276
    .line 277
    if-eqz v0, :cond_10

    .line 278
    .line 279
    iget-object v0, v0, Lft/r1;->y:Lcom/kubi/resources/widget/BaseTextView;

    .line 280
    goto :goto_2

    .line 281
    :cond_10
    move-object v0, v1

    .line 282
    .line 283
    .line 284
    :goto_2
    invoke-virtual {p0, v0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->c6(Landroid/widget/TextView;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 288
    move-result-object v0

    .line 289
    .line 290
    if-eqz v0, :cond_11

    .line 291
    .line 292
    iget-object v1, v0, Lft/r1;->A:Lcom/kubi/resources/widget/BaseTextView;

    .line 293
    .line 294
    .line 295
    :cond_11
    invoke-virtual {p0, v1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->b6(Landroid/widget/TextView;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 299
    move-result-object v0

    .line 300
    .line 301
    if-eqz v0, :cond_12

    .line 302
    .line 303
    iget-object v0, v0, Lft/r1;->m0:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 304
    .line 305
    if-eqz v0, :cond_12

    .line 306
    .line 307
    sget v1, Lcom/kubi/otc/R$string;->payment_detail_additional_remarks:I

    .line 308
    .line 309
    .line 310
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 311
    move-result-object v1

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 315
    :cond_12
    return-void
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

.method public final X5()V
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    sget-object v1, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->P2P:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 16
    move-result v1

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v1, v1, Lft/r1;->F0:Lcom/kubi/payment/p2p/widget/P2PViewChatCardEntrance;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    sget v2, Lcom/kubi/otc/R$id;->tvChat:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 40
    goto :goto_0

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    iget-object v1, v1, Lft/r1;->F0:Lcom/kubi/payment/p2p/widget/P2PViewChatCardEntrance;

    .line 49
    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    sget v2, Lcom/kubi/otc/R$id;->tvChat:I

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    .line 61
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 65
    move-result-object v1

    .line 66
    .line 67
    if-eqz v1, :cond_2

    .line 68
    .line 69
    iget-object v1, v1, Lft/r1;->s0:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 70
    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    .line 74
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 78
    move-result-object v1

    .line 79
    .line 80
    if-eqz v1, :cond_3

    .line 81
    .line 82
    iget-object v1, v1, Lft/r1;->A0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 83
    .line 84
    if-eqz v1, :cond_3

    .line 85
    .line 86
    .line 87
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 91
    move-result-object v1

    .line 92
    .line 93
    if-eqz v1, :cond_4

    .line 94
    .line 95
    iget-object v1, v1, Lft/r1;->Z0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 96
    .line 97
    if-eqz v1, :cond_4

    .line 98
    .line 99
    .line 100
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 101
    .line 102
    .line 103
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 104
    move-result-object v1

    .line 105
    .line 106
    if-eqz v1, :cond_5

    .line 107
    .line 108
    iget-object v1, v1, Lft/r1;->H:Lcom/kubi/resources/widget/BaseTextView;

    .line 109
    .line 110
    if-eqz v1, :cond_5

    .line 111
    .line 112
    .line 113
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 114
    .line 115
    .line 116
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 117
    move-result-object v1

    .line 118
    .line 119
    if-eqz v1, :cond_6

    .line 120
    .line 121
    iget-object v1, v1, Lft/r1;->K:Lcom/kubi/resources/widget/BaseTextView;

    .line 122
    .line 123
    if-eqz v1, :cond_6

    .line 124
    .line 125
    .line 126
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 127
    .line 128
    .line 129
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 130
    move-result-object v1

    .line 131
    .line 132
    if-eqz v1, :cond_7

    .line 133
    .line 134
    iget-object v1, v1, Lft/r1;->E0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 135
    .line 136
    if-eqz v1, :cond_7

    .line 137
    .line 138
    .line 139
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 140
    .line 141
    .line 142
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 143
    move-result-object v1

    .line 144
    .line 145
    if-eqz v1, :cond_8

    .line 146
    .line 147
    iget-object v1, v1, Lft/r1;->t0:Lcom/kubi/resources/widget/BaseTextView;

    .line 148
    .line 149
    if-eqz v1, :cond_8

    .line 150
    .line 151
    sget v2, Lcom/kubi/otc/R$string;->payment_detail_deal_cancel:I

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 155
    move-result-object v2

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 159
    .line 160
    .line 161
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 162
    move-result-object v1

    .line 163
    const/4 v2, 0x0

    .line 164
    .line 165
    if-eqz v1, :cond_b

    .line 166
    .line 167
    iget-object v1, v1, Lft/r1;->l0:Lcom/kubi/resources/widget/BaseTextView;

    .line 168
    .line 169
    if-eqz v1, :cond_b

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 173
    move-result-object v3

    .line 174
    .line 175
    check-cast v3, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v3}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 179
    move-result-object v3

    .line 180
    .line 181
    if-eqz v3, :cond_9

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getBuyerRole()Ljava/lang/Boolean;

    .line 185
    move-result-object v3

    .line 186
    goto :goto_1

    .line 187
    :cond_9
    move-object v3, v2

    .line 188
    .line 189
    .line 190
    :goto_1
    invoke-static {v3}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 191
    move-result v3

    .line 192
    .line 193
    if-eqz v3, :cond_a

    .line 194
    .line 195
    sget v3, Lcom/kubi/otc/R$string;->payment_detail_buy_canceled_sub_title:I

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 199
    move-result-object v3

    .line 200
    goto :goto_2

    .line 201
    .line 202
    :cond_a
    sget v3, Lcom/kubi/otc/R$string;->payment_detail_sell_canceled_sub_title:I

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 206
    move-result-object v3

    .line 207
    .line 208
    .line 209
    :goto_2
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 210
    .line 211
    :cond_b
    if-eqz v0, :cond_c

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getCancelRemark()Ljava/lang/String;

    .line 215
    move-result-object v1

    .line 216
    goto :goto_3

    .line 217
    :cond_c
    move-object v1, v2

    .line 218
    .line 219
    :goto_3
    if-eqz v1, :cond_10

    .line 220
    .line 221
    .line 222
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 223
    move-result v1

    .line 224
    .line 225
    if-nez v1, :cond_d

    .line 226
    goto :goto_4

    .line 227
    .line 228
    .line 229
    :cond_d
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 230
    move-result-object v1

    .line 231
    .line 232
    if-eqz v1, :cond_e

    .line 233
    .line 234
    iget-object v1, v1, Lft/r1;->s0:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 235
    .line 236
    if-eqz v1, :cond_e

    .line 237
    .line 238
    .line 239
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 240
    .line 241
    .line 242
    :cond_e
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 243
    move-result-object v1

    .line 244
    .line 245
    if-eqz v1, :cond_11

    .line 246
    .line 247
    iget-object v1, v1, Lft/r1;->s0:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 248
    .line 249
    if-eqz v1, :cond_11

    .line 250
    .line 251
    sget v4, Lcom/kubi/otc/R$string;->payment_detail_cancel_reason:I

    .line 252
    .line 253
    if-eqz v0, :cond_f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getCancelRemark()Ljava/lang/String;

    .line 257
    move-result-object v2

    .line 258
    .line 259
    .line 260
    :cond_f
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 261
    move-result-object v5

    .line 262
    .line 263
    sget v7, Lcom/kubi/otc/R$color;->c_text:I

    .line 264
    const/4 v8, 0x4

    .line 265
    const/4 v9, 0x0

    .line 266
    const/4 v6, 0x0

    .line 267
    move-object v3, p0

    .line 268
    .line 269
    .line 270
    invoke-static/range {v3 .. v9}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->C4(Lcom/kubi/payment/p2p/order/OrderDetailFragment;ILjava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Landroid/text/SpannableString;

    .line 271
    move-result-object v0

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 275
    return-void

    .line 276
    .line 277
    .line 278
    :cond_10
    :goto_4
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 279
    move-result-object v0

    .line 280
    .line 281
    if-eqz v0, :cond_11

    .line 282
    .line 283
    iget-object v0, v0, Lft/r1;->s0:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 284
    .line 285
    if-eqz v0, :cond_11

    .line 286
    .line 287
    .line 288
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 289
    :cond_11
    return-void
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

.method public final Y5(Lft/r1;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getExpressInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;

    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v0, v1

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    check-cast v2, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->isP2PExpress()Z

    .line 35
    move-result v2

    .line 36
    .line 37
    .line 38
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    move-result-object v2

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move-object v2, v1

    .line 42
    .line 43
    .line 44
    :goto_1
    invoke-static {v2}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 45
    move-result v2

    .line 46
    .line 47
    const-string v3, "stepsLayout"

    .line 48
    .line 49
    if-eqz v2, :cond_4

    .line 50
    .line 51
    sget-object v2, Lcom/kubi/payment/p2p/order/n1;->a:Lcom/kubi/payment/p2p/order/n1;

    .line 52
    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;->getStatus()Ljava/lang/String;

    .line 57
    move-result-object v0

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    move-object v0, v1

    .line 60
    .line 61
    .line 62
    :goto_2
    invoke-virtual {v2, v0}, Lcom/kubi/payment/p2p/order/n1;->a(Ljava/lang/String;)Z

    .line 63
    move-result v0

    .line 64
    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getBuyerRole()Ljava/lang/Boolean;

    .line 81
    move-result-object v0

    .line 82
    goto :goto_3

    .line 83
    :cond_3
    move-object v0, v1

    .line 84
    .line 85
    .line 86
    :goto_3
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 87
    move-result v0

    .line 88
    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    iget-object p1, p1, Lft/r1;->v:Lcom/kubi/payment/widget/StepsLayout;

    .line 92
    .line 93
    .line 94
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 98
    return-void

    .line 99
    .line 100
    :cond_4
    iget-object v0, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V:Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 104
    move-result v2

    .line 105
    const/4 v4, 0x2

    .line 106
    const/4 v5, 0x0

    .line 107
    .line 108
    .line 109
    sparse-switch v2, :sswitch_data_0

    .line 110
    goto :goto_4

    .line 111
    .line 112
    :sswitch_0
    const-string v2, "SELL_STATUS_ORDER_CREATED"

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    move-result v0

    .line 117
    .line 118
    if-nez v0, :cond_5

    .line 119
    goto :goto_4

    .line 120
    .line 121
    :cond_5
    iget-object v0, p1, Lft/r1;->v:Lcom/kubi/payment/widget/StepsLayout;

    .line 122
    .line 123
    .line 124
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 128
    .line 129
    iget-object p1, p1, Lft/r1;->v:Lcom/kubi/payment/widget/StepsLayout;

    .line 130
    .line 131
    .line 132
    invoke-static {p1, v5, v5, v4, v1}, Lcom/kubi/payment/widget/StepsLayout;->b(Lcom/kubi/payment/widget/StepsLayout;IIILjava/lang/Object;)V

    .line 133
    return-void

    .line 134
    .line 135
    :sswitch_1
    const-string v2, "SELL_STATUS_ORDER_PAY_COIN"

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    move-result v0

    .line 140
    .line 141
    if-nez v0, :cond_6

    .line 142
    goto :goto_4

    .line 143
    .line 144
    :sswitch_2
    const-string v2, "SELL_STATUS_ORDER_CHARGED"

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    move-result v0

    .line 149
    .line 150
    if-eqz v0, :cond_7

    .line 151
    goto :goto_5

    .line 152
    .line 153
    :sswitch_3
    const-string v2, "BUY_STATUS_ORDER_WAIT_COIN"

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    move-result v0

    .line 158
    .line 159
    if-nez v0, :cond_6

    .line 160
    goto :goto_4

    .line 161
    .line 162
    :cond_6
    iget-object v0, p1, Lft/r1;->v:Lcom/kubi/payment/widget/StepsLayout;

    .line 163
    .line 164
    .line 165
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 169
    .line 170
    iget-object p1, p1, Lft/r1;->v:Lcom/kubi/payment/widget/StepsLayout;

    .line 171
    const/4 v0, 0x1

    .line 172
    .line 173
    .line 174
    invoke-static {p1, v0, v5, v4, v1}, Lcom/kubi/payment/widget/StepsLayout;->b(Lcom/kubi/payment/widget/StepsLayout;IIILjava/lang/Object;)V

    .line 175
    return-void

    .line 176
    .line 177
    :sswitch_4
    const-string v2, "BUY_STATUS_ORDER_CHARGED"

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    move-result v0

    .line 182
    .line 183
    if-nez v0, :cond_8

    .line 184
    .line 185
    :cond_7
    :goto_4
    iget-object p1, p1, Lft/r1;->v:Lcom/kubi/payment/widget/StepsLayout;

    .line 186
    .line 187
    .line 188
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 192
    return-void

    .line 193
    .line 194
    :cond_8
    :goto_5
    iget-object v0, p1, Lft/r1;->v:Lcom/kubi/payment/widget/StepsLayout;

    .line 195
    .line 196
    .line 197
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 201
    .line 202
    iget-object p1, p1, Lft/r1;->v:Lcom/kubi/payment/widget/StepsLayout;

    .line 203
    .line 204
    .line 205
    invoke-static {p1, v4, v5, v4, v1}, Lcom/kubi/payment/widget/StepsLayout;->b(Lcom/kubi/payment/widget/StepsLayout;IIILjava/lang/Object;)V

    .line 206
    return-void

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
    :sswitch_data_0
    .sparse-switch
        -0x4da39d55 -> :sswitch_4
        -0x914210a -> :sswitch_3
        0x1181293f -> :sswitch_2
        0x1c717c99 -> :sswitch_1
        0x22c273f7 -> :sswitch_0
    .end sparse-switch
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

.method public final Z5()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lft/r1;->E0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, v0, Lft/r1;->F:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    const/4 v1, 0x1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object v0, v0, Lft/r1;->F:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/kubi/resources/widget/button/KcPrimaryButton;->l()V

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    iget-object v0, v0, Lft/r1;->F:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    iget-object v0, v0, Lft/r1;->v0:Lcom/kubi/resources/widget/BaseTextView;

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    .line 66
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 67
    .line 68
    .line 69
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    iget-object v0, v0, Lft/r1;->r:Landroidx/appcompat/widget/AppCompatImageView;

    .line 75
    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    .line 79
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 80
    .line 81
    :cond_5
    iget-object v0, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V:Ljava/lang/String;

    .line 82
    .line 83
    const-string v1, "BUY_STATUS_EXPRESS_ORDER_SUCCEEDED"

    .line 84
    .line 85
    .line 86
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    move-result v0

    .line 88
    const/4 v1, 0x0

    .line 89
    .line 90
    if-eqz v0, :cond_8

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 94
    move-result-object v0

    .line 95
    .line 96
    if-eqz v0, :cond_b

    .line 97
    .line 98
    iget-object v0, v0, Lft/r1;->n0:Lcom/kubi/resources/widget/BaseTextView;

    .line 99
    .line 100
    if-eqz v0, :cond_b

    .line 101
    .line 102
    sget v2, Lcom/kubi/otc/R$string;->p2pexpress_ordersuccess_detail:I

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 106
    move-result-object v3

    .line 107
    .line 108
    check-cast v3, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 112
    move-result-object v3

    .line 113
    .line 114
    if-eqz v3, :cond_6

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getExpressInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;

    .line 118
    move-result-object v3

    .line 119
    .line 120
    if-eqz v3, :cond_6

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;->getDepositAmount()Ljava/lang/String;

    .line 124
    move-result-object v3

    .line 125
    goto :goto_0

    .line 126
    :cond_6
    move-object v3, v1

    .line 127
    .line 128
    .line 129
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 130
    move-result-object v4

    .line 131
    .line 132
    check-cast v4, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 136
    move-result-object v4

    .line 137
    .line 138
    if-eqz v4, :cond_7

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getExpressInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;

    .line 142
    move-result-object v4

    .line 143
    .line 144
    if-eqz v4, :cond_7

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;->getDepositCurrency()Ljava/lang/String;

    .line 148
    move-result-object v1

    .line 149
    .line 150
    .line 151
    :cond_7
    filled-new-array {v3, v1}, [Ljava/lang/Object;

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
    goto :goto_2

    .line 161
    .line 162
    .line 163
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 164
    move-result-object v0

    .line 165
    .line 166
    if-eqz v0, :cond_b

    .line 167
    .line 168
    iget-object v0, v0, Lft/r1;->n0:Lcom/kubi/resources/widget/BaseTextView;

    .line 169
    .line 170
    if-eqz v0, :cond_b

    .line 171
    .line 172
    sget v2, Lcom/kubi/otc/R$string;->p2pexpress_ordersuccess_detail:I

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 176
    move-result-object v3

    .line 177
    .line 178
    check-cast v3, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v3}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 182
    move-result-object v3

    .line 183
    .line 184
    if-eqz v3, :cond_9

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getCurrencyAmount()Ljava/lang/String;

    .line 188
    move-result-object v3

    .line 189
    goto :goto_1

    .line 190
    :cond_9
    move-object v3, v1

    .line 191
    .line 192
    .line 193
    :goto_1
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 194
    move-result-object v4

    .line 195
    .line 196
    check-cast v4, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 200
    move-result-object v4

    .line 201
    .line 202
    if-eqz v4, :cond_a

    .line 203
    .line 204
    .line 205
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getCurrency()Ljava/lang/String;

    .line 206
    move-result-object v1

    .line 207
    .line 208
    .line 209
    :cond_a
    filled-new-array {v3, v1}, [Ljava/lang/Object;

    .line 210
    move-result-object v1

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0, v2, v1}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 214
    move-result-object v1

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 218
    .line 219
    .line 220
    :cond_b
    :goto_2
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 221
    move-result-object v0

    .line 222
    .line 223
    if-eqz v0, :cond_c

    .line 224
    .line 225
    iget-object v0, v0, Lft/r1;->n0:Lcom/kubi/resources/widget/BaseTextView;

    .line 226
    .line 227
    if-eqz v0, :cond_c

    .line 228
    .line 229
    sget-object v1, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    .line 230
    .line 231
    new-instance v2, Lkotlin/Pair;

    .line 232
    .line 233
    sget-object v3, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 234
    .line 235
    new-instance v4, Landroid/text/style/ForegroundColorSpan;

    .line 236
    .line 237
    sget v5, Lcom/kubi/otc/R$color;->brandGreen:I

    .line 238
    .line 239
    .line 240
    invoke-virtual {p0, v5}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 241
    move-result v5

    .line 242
    .line 243
    .line 244
    invoke-direct {v4, v5}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 245
    .line 246
    .line 247
    invoke-direct {v2, v3, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 251
    move-result-object v2

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1, v0, v2}, Lcom/kubi/resources/HighlightTextHelper;->f(Landroid/widget/TextView;[Lkotlin/Pair;)V

    .line 255
    .line 256
    .line 257
    :cond_c
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 258
    move-result-object v0

    .line 259
    .line 260
    if-eqz v0, :cond_d

    .line 261
    .line 262
    iget-object v0, v0, Lft/r1;->n0:Lcom/kubi/resources/widget/BaseTextView;

    .line 263
    .line 264
    if-eqz v0, :cond_d

    .line 265
    .line 266
    .line 267
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 268
    .line 269
    .line 270
    :cond_d
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 271
    move-result-object v0

    .line 272
    .line 273
    if-eqz v0, :cond_e

    .line 274
    .line 275
    iget-object v0, v0, Lft/r1;->F:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 276
    .line 277
    if-eqz v0, :cond_e

    .line 278
    .line 279
    sget v1, Lcom/kubi/otc/R$string;->otc_trade_directly:I

    .line 280
    const/4 v2, 0x0

    .line 281
    .line 282
    new-array v2, v2, [Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    invoke-virtual {p0, v1, v2}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 286
    move-result-object v1

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 290
    :cond_e
    return-void
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

.method public final b6(Landroid/widget/TextView;)V
    .locals 6

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    sget-object v0, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    .line 5
    .line 6
    new-instance v1, Lkotlin/Pair;

    .line 7
    .line 8
    sget-object v2, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 9
    .line 10
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    .line 11
    .line 12
    sget v4, Lcom/kubi/otc/R$color;->c_text:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v4}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 16
    move-result v5

    .line 17
    .line 18
    .line 19
    invoke-direct {v3, v5}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    new-instance v2, Lkotlin/Pair;

    .line 25
    .line 26
    sget-object v3, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN1:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 27
    .line 28
    new-instance v5, Landroid/text/style/ForegroundColorSpan;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v4}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 32
    move-result v4

    .line 33
    .line 34
    .line 35
    invoke-direct {v5, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v2, v3, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    filled-new-array {v1, v2}, [Lkotlin/Pair;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p1, v1}, Lcom/kubi/resources/HighlightTextHelper;->f(Landroid/widget/TextView;[Lkotlin/Pair;)V

    .line 46
    :cond_0
    return-void
.end method

.method public final c6(Landroid/widget/TextView;)V
    .locals 5

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    sget-object v0, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    .line 5
    .line 6
    new-instance v1, Lkotlin/Pair;

    .line 7
    .line 8
    sget-object v2, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 9
    .line 10
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    .line 11
    .line 12
    sget v4, Lcom/kubi/otc/R$color;->c_text:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v4}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 16
    move-result v4

    .line 17
    .line 18
    .line 19
    invoke-direct {v3, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1, v1}, Lcom/kubi/resources/HighlightTextHelper;->f(Landroid/widget/TextView;[Lkotlin/Pair;)V

    .line 30
    :cond_0
    return-void
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

.method public final d6(Z)V
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/payment/flutter/e;->a:Lcom/kubi/payment/flutter/e;

    .line 5
    .line 6
    const-string v2, "payment/p2p/appealHistory"

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static {v1, v2, v3, v4, v5}, Lcom/kubi/payment/flutter/e;->b(Lcom/kubi/payment/flutter/e;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    check-cast v1, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getId()Ljava/lang/String;

    .line 33
    move-result-object v1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v1, v5

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    const-string v2, "orderId"

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2, v1}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    const-string v1, "isProcessing"

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1, p1}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getHasRecord()Ljava/lang/Boolean;

    .line 71
    move-result-object v5

    .line 72
    .line 73
    .line 74
    :cond_1
    invoke-static {v5}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 75
    move-result v0

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    const-string v1, "hasAppealRecord"

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v1, v0}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Lay/a;->k()Z

    .line 89
    return-void
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

.method public final e5()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lft/r1;->s0:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, v0, Lft/r1;->A0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v0, v0, Lft/r1;->V0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    iget-object v0, v0, Lft/r1;->S0:Lcom/kubi/resources/widget/BaseTextView;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    iget-object v0, v0, Lft/r1;->C:Lcom/kubi/resources/widget/button/KcSecondaryButton;

    .line 61
    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 66
    .line 67
    .line 68
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    iget-object v0, v0, Lft/r1;->H:Lcom/kubi/resources/widget/BaseTextView;

    .line 74
    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 82
    move-result-object v0

    .line 83
    .line 84
    if-eqz v0, :cond_6

    .line 85
    .line 86
    iget-object v0, v0, Lft/r1;->Z0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 87
    .line 88
    if-eqz v0, :cond_6

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 92
    .line 93
    .line 94
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 95
    move-result-object v0

    .line 96
    .line 97
    if-eqz v0, :cond_7

    .line 98
    .line 99
    iget-object v0, v0, Lft/r1;->E0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 100
    .line 101
    if-eqz v0, :cond_7

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 105
    .line 106
    .line 107
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 108
    move-result-object v0

    .line 109
    .line 110
    if-eqz v0, :cond_8

    .line 111
    .line 112
    iget-object v0, v0, Lft/r1;->y:Lcom/kubi/resources/widget/BaseTextView;

    .line 113
    .line 114
    if-eqz v0, :cond_8

    .line 115
    .line 116
    .line 117
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 118
    .line 119
    .line 120
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 121
    move-result-object v0

    .line 122
    .line 123
    if-eqz v0, :cond_9

    .line 124
    .line 125
    iget-object v0, v0, Lft/r1;->z:Lcom/kubi/resources/widget/BaseTextView;

    .line 126
    .line 127
    if-eqz v0, :cond_9

    .line 128
    .line 129
    .line 130
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 131
    .line 132
    .line 133
    :cond_9
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 134
    move-result-object v0

    .line 135
    .line 136
    if-eqz v0, :cond_a

    .line 137
    .line 138
    iget-object v0, v0, Lft/r1;->A:Lcom/kubi/resources/widget/BaseTextView;

    .line 139
    .line 140
    if-eqz v0, :cond_a

    .line 141
    .line 142
    .line 143
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 144
    .line 145
    .line 146
    :cond_a
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 147
    move-result-object v0

    .line 148
    .line 149
    if-eqz v0, :cond_b

    .line 150
    .line 151
    iget-object v0, v0, Lft/r1;->B:Lcom/kubi/resources/widget/BaseTextView;

    .line 152
    .line 153
    if-eqz v0, :cond_b

    .line 154
    .line 155
    .line 156
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 157
    .line 158
    .line 159
    :cond_b
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 160
    move-result-object v0

    .line 161
    .line 162
    if-eqz v0, :cond_c

    .line 163
    .line 164
    iget-object v0, v0, Lft/r1;->t0:Lcom/kubi/resources/widget/BaseTextView;

    .line 165
    .line 166
    if-eqz v0, :cond_c

    .line 167
    .line 168
    sget v1, Lcom/kubi/otc/R$string;->payment_p2p_order_appeal_waiting_cs:I

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 172
    move-result-object v1

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 176
    .line 177
    .line 178
    :cond_c
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 179
    move-result-object v0

    .line 180
    .line 181
    if-eqz v0, :cond_d

    .line 182
    .line 183
    iget-object v0, v0, Lft/r1;->l0:Lcom/kubi/resources/widget/BaseTextView;

    .line 184
    .line 185
    if-eqz v0, :cond_d

    .line 186
    .line 187
    sget v1, Lcom/kubi/otc/R$string;->payment_p2p_order_appealing_cs_subtitle:I

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 191
    move-result-object v1

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 195
    .line 196
    .line 197
    :cond_d
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 198
    move-result-object v0

    .line 199
    .line 200
    if-eqz v0, :cond_e

    .line 201
    .line 202
    iget-object v0, v0, Lft/r1;->y:Lcom/kubi/resources/widget/BaseTextView;

    .line 203
    .line 204
    if-eqz v0, :cond_e

    .line 205
    .line 206
    sget v1, Lcom/kubi/otc/R$string;->payment_p2p_order_appealing_cs_desc1:I

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 210
    move-result-object v1

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 214
    .line 215
    .line 216
    :cond_e
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 217
    move-result-object v0

    .line 218
    .line 219
    if-eqz v0, :cond_f

    .line 220
    .line 221
    iget-object v0, v0, Lft/r1;->z:Lcom/kubi/resources/widget/BaseTextView;

    .line 222
    .line 223
    if-eqz v0, :cond_f

    .line 224
    .line 225
    sget v1, Lcom/kubi/otc/R$string;->payment_p2p_order_appealing_cs_desc2:I

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 229
    move-result-object v1

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 233
    .line 234
    .line 235
    :cond_f
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 236
    move-result-object v0

    .line 237
    const/4 v1, 0x0

    .line 238
    .line 239
    if-eqz v0, :cond_10

    .line 240
    .line 241
    iget-object v0, v0, Lft/r1;->y:Lcom/kubi/resources/widget/BaseTextView;

    .line 242
    goto :goto_0

    .line 243
    :cond_10
    move-object v0, v1

    .line 244
    .line 245
    .line 246
    :goto_0
    invoke-virtual {p0, v0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->c6(Landroid/widget/TextView;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 250
    move-result-object v0

    .line 251
    .line 252
    if-eqz v0, :cond_11

    .line 253
    .line 254
    iget-object v1, v0, Lft/r1;->z:Lcom/kubi/resources/widget/BaseTextView;

    .line 255
    .line 256
    .line 257
    :cond_11
    invoke-virtual {p0, v1}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->b6(Landroid/widget/TextView;)V

    .line 258
    return-void
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

.method public f1()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

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
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->P()Landroidx/lifecycle/LiveData;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
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

.method public final f5()Z
    .locals 2

    .line 1
    .line 2
    const-string v0, "BUY_STATUS_ORDER_CREATED"

    .line 3
    .line 4
    const-string v1, "SELL_STATUS_ORDER_CREATED"

    .line 5
    .line 6
    .line 7
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iget-object v1, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V:Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->e0()Ljava/util/List;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 36
    move-result v0

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    move-result-object v0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v0, 0x0

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 46
    move-result v0

    .line 47
    const/4 v1, 0x1

    .line 48
    .line 49
    if-le v0, v1, :cond_1

    .line 50
    return v1

    .line 51
    :cond_1
    const/4 v0, 0x0

    .line 52
    return v0
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

.method public final g5()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
    .line 3
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

.method public final g6(Landroid/widget/TextView;)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    sget v0, Lcom/kubi/otc/R$color;->c_text40:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 8
    move-result v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 12
    :cond_0
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
.end method

.method public getLayout()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/otc/R$layout;->payment_fragment_p2p_order_detail:I

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

.method public final h5()Z
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->isP2PExpress()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 26
    move-result v0

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    const-string v5, "SELL_STATUS_ORDER_CANCELED"

    .line 31
    .line 32
    const-string v6, "SELL_STATUS_ORDER_CHARGED"

    .line 33
    .line 34
    const-string v1, "BUY_STATUS_ORDER_CANCELED"

    .line 35
    .line 36
    const-string v2, "BUY_STATUS_EXPRESS_ORDER_SUCCEEDED"

    .line 37
    .line 38
    const-string v3, "BUY_STATUS_EXPRESS_ORDER_FAILED"

    .line 39
    .line 40
    const-string v4, "BUY_STATUS_EXPRESS_ORDER_CANCELED"

    .line 41
    .line 42
    .line 43
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    iget-object v1, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V:Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 54
    move-result v0

    .line 55
    return v0

    .line 56
    .line 57
    :cond_1
    const-string v0, "SELL_STATUS_ORDER_CANCELED"

    .line 58
    .line 59
    const-string v1, "SELL_STATUS_ORDER_CHARGED"

    .line 60
    .line 61
    const-string v2, "BUY_STATUS_ORDER_CANCELED"

    .line 62
    .line 63
    const-string v3, "BUY_STATUS_ORDER_CHARGED"

    .line 64
    .line 65
    .line 66
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    iget-object v1, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V:Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 77
    move-result v0

    .line 78
    return v0
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

.method public final h6()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Leu/w;->a:Leu/w;

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
    new-instance v2, Lcom/kubi/payment/p2p/order/j0;

    .line 14
    .line 15
    .line 16
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/order/j0;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Leu/w;->w(Landroidx/fragment/app/FragmentManager;Lkotlin/jvm/functions/Function0;)V

    .line 20
    return-void
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

.method public final j6()V
    .locals 12

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getLegalCurrency()Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v0, v1

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    const-string v2, "pay_fiat_currency"

    .line 26
    .line 27
    .line 28
    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getCurrency()Ljava/lang/String;

    .line 45
    move-result-object v0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object v0, v1

    .line 48
    .line 49
    .line 50
    :goto_1
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    const-string v2, "pay_crypto_currency"

    .line 54
    .line 55
    .line 56
    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 57
    move-result-object v4

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getStatus()Ljava/lang/String;

    .line 73
    move-result-object v0

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    move-object v0, v1

    .line 76
    .line 77
    .line 78
    :goto_2
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    const-string v2, "status"

    .line 82
    .line 83
    .line 84
    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 85
    move-result-object v5

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 89
    move-result-object v0

    .line 90
    .line 91
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 95
    move-result-object v0

    .line 96
    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->isP2PExpress()Z

    .line 101
    move-result v0

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 105
    move-result-object v0

    .line 106
    goto :goto_3

    .line 107
    :cond_3
    move-object v0, v1

    .line 108
    .line 109
    .line 110
    :goto_3
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 111
    move-result v0

    .line 112
    .line 113
    .line 114
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 115
    move-result-object v0

    .line 116
    .line 117
    const-string v2, "isP2PExpress"

    .line 118
    .line 119
    .line 120
    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 121
    move-result-object v6

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 125
    move-result-object v0

    .line 126
    .line 127
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 131
    move-result-object v0

    .line 132
    .line 133
    if-eqz v0, :cond_4

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getBuyerRole()Ljava/lang/Boolean;

    .line 137
    move-result-object v0

    .line 138
    goto :goto_4

    .line 139
    :cond_4
    move-object v0, v1

    .line 140
    .line 141
    .line 142
    :goto_4
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 143
    move-result v0

    .line 144
    .line 145
    .line 146
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 147
    move-result-object v0

    .line 148
    .line 149
    const-string v2, "pay_side"

    .line 150
    .line 151
    .line 152
    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 153
    move-result-object v7

    .line 154
    .line 155
    const-string v0, "norm_version"

    .line 156
    .line 157
    const-string v2, "1"

    .line 158
    .line 159
    .line 160
    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 161
    move-result-object v8

    .line 162
    .line 163
    .line 164
    filled-new-array/range {v3 .. v8}, [Lkotlin/Pair;

    .line 165
    move-result-object v0

    .line 166
    .line 167
    const-string v3, "B7P2POrderDetails"

    .line 168
    .line 169
    const-string v4, "upCancelButton"

    .line 170
    .line 171
    .line 172
    invoke-static {v3, v4, v2, v0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 173
    .line 174
    sget-object v5, Leu/w;->a:Leu/w;

    .line 175
    .line 176
    iget-object v6, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 177
    .line 178
    const-string v0, "mContext"

    .line 179
    .line 180
    .line 181
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 185
    move-result-object v7

    .line 186
    .line 187
    const-string v0, "getChildFragmentManager(...)"

    .line 188
    .line 189
    .line 190
    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 194
    move-result-object v0

    .line 195
    .line 196
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 200
    move-result-object v0

    .line 201
    .line 202
    if-eqz v0, :cond_5

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getLegalCurrency()Ljava/lang/String;

    .line 206
    move-result-object v0

    .line 207
    move-object v8, v0

    .line 208
    goto :goto_5

    .line 209
    :cond_5
    move-object v8, v1

    .line 210
    .line 211
    .line 212
    :goto_5
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 213
    move-result-object v0

    .line 214
    .line 215
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 219
    move-result-object v0

    .line 220
    .line 221
    if-eqz v0, :cond_6

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getCurrency()Ljava/lang/String;

    .line 225
    move-result-object v0

    .line 226
    move-object v9, v0

    .line 227
    goto :goto_6

    .line 228
    :cond_6
    move-object v9, v1

    .line 229
    .line 230
    .line 231
    :goto_6
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 232
    move-result-object v0

    .line 233
    .line 234
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 238
    move-result-object v0

    .line 239
    .line 240
    if-eqz v0, :cond_7

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getStatus()Ljava/lang/String;

    .line 244
    move-result-object v1

    .line 245
    :cond_7
    move-object v10, v1

    .line 246
    .line 247
    new-instance v11, Lcom/kubi/payment/p2p/order/f0;

    .line 248
    .line 249
    .line 250
    invoke-direct {v11, p0}, Lcom/kubi/payment/p2p/order/f0;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v5 .. v11}, Leu/w;->y(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 254
    return-void
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

.method public final l6()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Leu/w;->a:Leu/w;

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
    new-instance v2, Lcom/kubi/payment/p2p/order/e0;

    .line 14
    .line 15
    .line 16
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/order/e0;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Leu/w;->D(Landroidx/fragment/app/FragmentManager;Lkotlin/jvm/functions/Function1;)V

    .line 20
    return-void
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

.method public n3()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->getNavigationBar()Lcom/kubi/resources/widget/NavigationBar;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/resources/widget/NavigationBar;->c()V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->getTitleBar()Lcom/kubi/sdk/widget/TitleBar;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/kubi/sdk/widget/TitleBar;->f()V

    .line 19
    :cond_1
    const/4 v0, 0x3

    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static {p0, v1, v1, v0, v2}, Lcom/kubi/sdk/BaseFragment;->showLoadingView$default(Lcom/kubi/sdk/BaseFragment;IIILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    const-string v3, "id"

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v3}, Lcom/kubi/router/utils/RouteExKt;->y(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    move-result-object v1

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    move-object v1, v2

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 52
    move-result-object v3

    .line 53
    .line 54
    if-eqz v3, :cond_3

    .line 55
    .line 56
    const-string v4, "isCreateOrder"

    .line 57
    .line 58
    .line 59
    invoke-static {v3, v4}, Lcom/kubi/router/utils/RouteExKt;->h(Landroid/os/Bundle;Ljava/lang/String;)Z

    .line 60
    move-result v3

    .line 61
    .line 62
    .line 63
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 64
    move-result-object v3

    .line 65
    goto :goto_1

    .line 66
    :cond_3
    move-object v3, v2

    .line 67
    .line 68
    .line 69
    :goto_1
    invoke-static {v3}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 70
    move-result v3

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 74
    move-result-object v4

    .line 75
    .line 76
    if-eqz v4, :cond_4

    .line 77
    .line 78
    const-string v2, "spm"

    .line 79
    .line 80
    .line 81
    invoke-static {v4, v2}, Lcom/kubi/router/utils/RouteExKt;->y(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    move-result-object v2

    .line 83
    .line 84
    .line 85
    :cond_4
    invoke-virtual {v0, p0, v1, v3, v2}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->l0(Lcom/kubi/sdk/base/ui/g;Ljava/lang/String;ZLjava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-direct {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->I4()V

    .line 89
    return-void
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

.method public final n6(Z)V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Leu/w;->a:Leu/w;

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
    new-instance v2, Lcom/kubi/payment/p2p/order/b0;

    .line 14
    .line 15
    .line 16
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/order/b0;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 17
    .line 18
    new-instance v3, Lcom/kubi/payment/p2p/order/c0;

    .line 19
    .line 20
    .line 21
    invoke-direct {v3, p1, p0}, Lcom/kubi/payment/p2p/order/c0;-><init>(ZLcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1, v2, v3}, Leu/w;->I(Landroidx/fragment/app/FragmentManager;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

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
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->V()Landroidx/lifecycle/LiveData;

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
    new-instance v2, Lcom/kubi/payment/p2p/order/p;

    .line 20
    .line 21
    .line 22
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/order/p;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 23
    .line 24
    new-instance v3, Lcom/kubi/payment/p2p/order/OrderDetailFragment$b;

    .line 25
    .line 26
    .line 27
    invoke-direct {v3, v2}, Lcom/kubi/payment/p2p/order/OrderDetailFragment$b;-><init>(Lkotlin/jvm/functions/Function1;)V

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
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->W()Landroidx/lifecycle/LiveData;

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
    new-instance v2, Lcom/kubi/payment/p2p/order/q;

    .line 47
    .line 48
    .line 49
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/order/q;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 50
    .line 51
    new-instance v3, Lcom/kubi/payment/p2p/order/OrderDetailFragment$b;

    .line 52
    .line 53
    .line 54
    invoke-direct {v3, v2}, Lcom/kubi/payment/p2p/order/OrderDetailFragment$b;-><init>(Lkotlin/jvm/functions/Function1;)V

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
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Y()Landroidx/lifecycle/LiveData;

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
    new-instance v2, Lcom/kubi/payment/p2p/order/r;

    .line 74
    .line 75
    .line 76
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/order/r;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 77
    .line 78
    new-instance v3, Lcom/kubi/payment/p2p/order/OrderDetailFragment$b;

    .line 79
    .line 80
    .line 81
    invoke-direct {v3, v2}, Lcom/kubi/payment/p2p/order/OrderDetailFragment$b;-><init>(Lkotlin/jvm/functions/Function1;)V

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
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->X()Landroidx/lifecycle/LiveData;

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
    new-instance v2, Lcom/kubi/payment/p2p/order/s;

    .line 101
    .line 102
    .line 103
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/order/s;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 104
    .line 105
    new-instance v3, Lcom/kubi/payment/p2p/order/OrderDetailFragment$b;

    .line 106
    .line 107
    .line 108
    invoke-direct {v3, v2}, Lcom/kubi/payment/p2p/order/OrderDetailFragment$b;-><init>(Lkotlin/jvm/functions/Function1;)V

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
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->P()Landroidx/lifecycle/LiveData;

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
    new-instance v2, Lcom/kubi/payment/p2p/order/t;

    .line 128
    .line 129
    .line 130
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/order/t;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 131
    .line 132
    new-instance v3, Lcom/kubi/payment/p2p/order/OrderDetailFragment$b;

    .line 133
    .line 134
    .line 135
    invoke-direct {v3, v2}, Lcom/kubi/payment/p2p/order/OrderDetailFragment$b;-><init>(Lkotlin/jvm/functions/Function1;)V

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
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->g0()Landroidx/lifecycle/LiveData;

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
    new-instance v2, Lcom/kubi/payment/p2p/order/u;

    .line 155
    .line 156
    .line 157
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/order/u;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 158
    .line 159
    new-instance v3, Lcom/kubi/payment/p2p/order/OrderDetailFragment$b;

    .line 160
    .line 161
    .line 162
    invoke-direct {v3, v2}, Lcom/kubi/payment/p2p/order/OrderDetailFragment$b;-><init>(Lkotlin/jvm/functions/Function1;)V

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
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->f0()Landroidx/lifecycle/LiveData;

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
    new-instance v2, Lcom/kubi/payment/p2p/order/v;

    .line 182
    .line 183
    .line 184
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/order/v;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 185
    .line 186
    new-instance v3, Lcom/kubi/payment/p2p/order/OrderDetailFragment$b;

    .line 187
    .line 188
    .line 189
    invoke-direct {v3, v2}, Lcom/kubi/payment/p2p/order/OrderDetailFragment$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 193
    .line 194
    sget-object v0, Lcom/kubi/event/api/b;->a:Lcom/kubi/event/api/b;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0}, Lcom/kubi/event/api/b;->a()Z

    .line 198
    move-result v0

    .line 199
    .line 200
    const-string v1, "START_CHAT_VIEW_EVENT"

    .line 201
    .line 202
    if-eqz v0, :cond_0

    .line 203
    .line 204
    .line 205
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 206
    move-result v0

    .line 207
    .line 208
    :cond_0
    new-instance v0, Lcom/kubi/payment/p2p/order/OrderDetailFragment$observeData$$inlined$bindFlowEvent$1;

    .line 209
    const/4 v2, 0x0

    .line 210
    .line 211
    .line 212
    invoke-direct {v0, v1, v2, p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment$observeData$$inlined$bindFlowEvent$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 213
    const/4 v1, 0x0

    .line 214
    .line 215
    .line 216
    invoke-static {p0, v1, v0}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 220
    move-result-object v0

    .line 221
    .line 222
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->T()Landroidx/lifecycle/LiveData;

    .line 226
    move-result-object v0

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 230
    move-result-object v1

    .line 231
    .line 232
    new-instance v2, Lcom/kubi/payment/p2p/order/w;

    .line 233
    .line 234
    .line 235
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/order/w;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 236
    .line 237
    new-instance v3, Lcom/kubi/payment/p2p/order/OrderDetailFragment$b;

    .line 238
    .line 239
    .line 240
    invoke-direct {v3, v2}, Lcom/kubi/payment/p2p/order/OrderDetailFragment$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 244
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

.method public onResume()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->onResume()V

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->W:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->W:Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    check-cast v1, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 17
    const/4 v2, 0x1

    .line 18
    const/4 v3, 0x0

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v0, v2, v3}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->b0(Lcom/kubi/payment/p2p/order/OrderDetailViewModel;ZILjava/lang/Object;)V

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

.method public final q5()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getLegalCurrency()Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v0, v1

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    const-string v2, "pay_fiat_currency"

    .line 26
    .line 27
    .line 28
    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    check-cast v2, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getCurrency()Ljava/lang/String;

    .line 45
    move-result-object v2

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object v2, v1

    .line 48
    .line 49
    .line 50
    :goto_1
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    move-result-object v2

    .line 52
    .line 53
    const-string v3, "pay_crypto_currency"

    .line 54
    .line 55
    .line 56
    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 61
    move-result-object v3

    .line 62
    .line 63
    check-cast v3, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 67
    move-result-object v3

    .line 68
    .line 69
    if-eqz v3, :cond_2

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->isP2PExpress()Z

    .line 73
    move-result v3

    .line 74
    .line 75
    .line 76
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 77
    move-result-object v3

    .line 78
    goto :goto_2

    .line 79
    :cond_2
    move-object v3, v1

    .line 80
    .line 81
    .line 82
    :goto_2
    invoke-static {v3}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 83
    move-result v3

    .line 84
    .line 85
    .line 86
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    move-result-object v3

    .line 88
    .line 89
    const-string v4, "isP2PExpress"

    .line 90
    .line 91
    .line 92
    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 93
    move-result-object v3

    .line 94
    .line 95
    .line 96
    filled-new-array {v0, v2, v3}, [Lkotlin/Pair;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    const-string v2, "B7P2POrderDetails"

    .line 100
    .line 101
    const-string v3, "transferButton"

    .line 102
    .line 103
    const-string v4, "1"

    .line 104
    .line 105
    .line 106
    invoke-static {v2, v3, v4, v0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 110
    move-result-object v0

    .line 111
    .line 112
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 116
    move-result-object v0

    .line 117
    .line 118
    if-eqz v0, :cond_3

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getNeedPriceReminder()Ljava/lang/Boolean;

    .line 122
    move-result-object v1

    .line 123
    .line 124
    .line 125
    :cond_3
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 126
    move-result v0

    .line 127
    .line 128
    if-eqz v0, :cond_4

    .line 129
    .line 130
    sget-object v0, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 134
    move-result-object v0

    .line 135
    .line 136
    sget v1, Lcom/kubi/otc/R$drawable;->ic2_common_warning:I

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->V4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 140
    move-result-object v0

    .line 141
    const/4 v1, 0x1

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->Z4(Z)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 145
    move-result-object v0

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->N4(Z)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 149
    move-result-object v0

    .line 150
    .line 151
    sget v1, Lcom/kubi/otc/R$string;->payment_please_be_alert:I

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 155
    move-result-object v0

    .line 156
    .line 157
    sget v1, Lcom/kubi/otc/R$layout;->payment_text_view:I

    .line 158
    .line 159
    new-instance v2, Lcom/kubi/payment/p2p/order/l0;

    .line 160
    .line 161
    .line 162
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/order/l0;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->E4(ILcom/kubi/resources/dialog/DialogFragmentHelper$b;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 166
    move-result-object v0

    .line 167
    .line 168
    sget v1, Lcom/kubi/otc/R$string;->payment_i_know:I

    .line 169
    .line 170
    new-instance v2, Lcom/kubi/payment/p2p/order/m0;

    .line 171
    .line 172
    .line 173
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/order/m0;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->S4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 177
    move-result-object v0

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 181
    move-result-object v1

    .line 182
    .line 183
    const-string v2, "getChildFragmentManager(...)"

    .line 184
    .line 185
    .line 186
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    .line 188
    const-string v2, "payment_p2p_price_alert"

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 192
    return-void

    .line 193
    .line 194
    .line 195
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->E4()V

    .line 196
    return-void
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

.method public final r6()V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Leu/w;->a:Leu/w;

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
    new-instance v2, Lcom/kubi/payment/p2p/order/s0;

    .line 14
    .line 15
    .line 16
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/order/s0;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 17
    .line 18
    new-instance v3, Lcom/kubi/payment/p2p/order/u0;

    .line 19
    .line 20
    .line 21
    invoke-direct {v3, p0}, Lcom/kubi/payment/p2p/order/u0;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1, v2, v3}, Leu/w;->S(Landroidx/fragment/app/FragmentManager;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public s3()Lkotlin/reflect/KClass;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/reflect/KClass<",
            "Lcom/kubi/payment/p2p/order/OrderDetailViewModel;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-class v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

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

.method public final u5()V
    .locals 8

    .line 1
    .line 2
    sget-object v1, Lcom/kubi/data/constance/ValidationBizEnum;->OTC_SETTLE:Lcom/kubi/data/constance/ValidationBizEnum;

    .line 3
    .line 4
    new-instance v3, Lcom/kubi/payment/p2p/order/o0;

    .line 5
    .line 6
    .line 7
    invoke-direct {v3, p0}, Lcom/kubi/payment/p2p/order/o0;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 8
    .line 9
    new-instance v4, Lcom/kubi/payment/p2p/order/p0;

    .line 10
    .line 11
    .line 12
    invoke-direct {v4, p0}, Lcom/kubi/payment/p2p/order/p0;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 13
    .line 14
    const/16 v6, 0x24

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    move-object v0, p0

    .line 19
    .line 20
    .line 21
    invoke-static/range {v0 .. v7}, Lht/b1;->H(Lcom/kubi/sdk/BaseFragment;Lcom/kubi/data/constance/ValidationBizEnum;Lio/reactivex/Observable;Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;Landroid/content/DialogInterface$OnDismissListener;ILjava/lang/Object;)V

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

.method public final u6()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->S()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    return-void

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 20
    const/4 v1, 0x1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->I0(Z)V

    .line 24
    .line 25
    sget-object v0, Leu/w;->a:Leu/w;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    const-string v2, "getChildFragmentManager(...)"

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    check-cast v2, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getUserAppealConsentResult()Ljava/lang/String;

    .line 50
    move-result-object v2

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/4 v2, 0x0

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    new-instance v3, Lcom/kubi/payment/p2p/order/y;

    .line 59
    .line 60
    .line 61
    invoke-direct {v3, p0}, Lcom/kubi/payment/p2p/order/y;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 62
    .line 63
    new-instance v4, Lcom/kubi/payment/p2p/order/z;

    .line 64
    .line 65
    .line 66
    invoke-direct {v4, p0}, Lcom/kubi/payment/p2p/order/z;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1, v2, v3, v4}, Leu/w;->N(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 70
    return-void
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

.method public final x5()V
    .locals 11

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/safe/api/service/ISafeService;->a:Lcom/kubi/safe/api/service/ISafeService$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/safe/api/service/ISafeService$Companion;->get()Lcom/kubi/safe/api/service/ISafeService;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    iget-object v2, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 9
    .line 10
    const-string v0, "mContext"

    .line 11
    .line 12
    .line 13
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 17
    move-result-object v3

    .line 18
    .line 19
    const-string v0, "getViewLifecycleOwner(...)"

    .line 20
    .line 21
    .line 22
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    new-instance v0, Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 31
    move-result-object v4

    .line 32
    .line 33
    check-cast v4, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 37
    move-result-object v4

    .line 38
    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    const-string v5, "adId"

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getAdId()Ljava/lang/String;

    .line 45
    move-result-object v6

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 49
    .line 50
    const-string v5, "legalCurrencyAmount"

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getLegalCurrencyAmount()Ljava/lang/String;

    .line 54
    move-result-object v6

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 58
    .line 59
    const-string v5, "currencyAmount"

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getCurrencyAmount()Ljava/lang/String;

    .line 63
    move-result-object v6

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 67
    .line 68
    const-string v5, "orderPrice"

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getPrice()Ljava/math/BigDecimal;

    .line 72
    move-result-object v6

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 76
    .line 77
    const-string v5, "legalCurrency"

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getLegalCurrency()Ljava/lang/String;

    .line 81
    move-result-object v6

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 85
    .line 86
    const-string v5, "cryptoCurrency"

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getCurrency()Ljava/lang/String;

    .line 90
    move-result-object v6

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 94
    .line 95
    const-string v5, "payTypeCode"

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getPayTypeCode()Ljava/lang/String;

    .line 99
    move-result-object v6

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 103
    .line 104
    const-string v5, "orderId"

    .line 105
    .line 106
    .line 107
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getId()Ljava/lang/String;

    .line 108
    move-result-object v6

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getAdInfo()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$AdInfo;

    .line 115
    move-result-object v4

    .line 116
    .line 117
    if-eqz v4, :cond_0

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$AdInfo;->getSide()Ljava/lang/String;

    .line 121
    move-result-object v4

    .line 122
    goto :goto_0

    .line 123
    :cond_0
    const/4 v4, 0x0

    .line 124
    .line 125
    :goto_0
    const-string v5, "adSide"

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 129
    .line 130
    :cond_1
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 134
    move-result-object v5

    .line 135
    .line 136
    const-string v0, "toString(...)"

    .line 137
    .line 138
    .line 139
    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    new-instance v8, Lcom/kubi/payment/p2p/order/v0;

    .line 142
    .line 143
    .line 144
    invoke-direct {v8, p0}, Lcom/kubi/payment/p2p/order/v0;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 145
    .line 146
    const/16 v9, 0x10

    .line 147
    const/4 v10, 0x0

    .line 148
    .line 149
    const-string v4, "RV_P2P_TRADE_RELEASE"

    .line 150
    const/4 v6, 0x0

    .line 151
    const/4 v7, 0x1

    .line 152
    .line 153
    .line 154
    invoke-static/range {v1 .. v10}, Lcom/kubi/safe/api/service/ISafeService;->a(Lcom/kubi/safe/api/service/ISafeService;Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Ljava/lang/String;Ljava/lang/String;IZLkotlin/jvm/functions/Function7;ILjava/lang/Object;)V

    .line 155
    return-void
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

.method public final x6()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Leu/w;->a:Leu/w;

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
    new-instance v2, Lcom/kubi/payment/p2p/order/d0;

    .line 14
    .line 15
    .line 16
    invoke-direct {v2, p0}, Lcom/kubi/payment/p2p/order/d0;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Leu/w;->X(Landroidx/fragment/app/FragmentManager;Lkotlin/jvm/functions/Function0;)V

    .line 20
    return-void
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

.method public final y4()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/kubi/payment/p2p/order/OrderProcessDialog;->s0:Lcom/kubi/payment/p2p/order/OrderProcessDialog$Companion;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    check-cast v1, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x0

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getBuyerRole()Ljava/lang/Boolean;

    .line 28
    move-result-object v1

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object v1, v2

    .line 31
    .line 32
    .line 33
    :goto_0
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 34
    move-result v1

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 38
    move-result-object v3

    .line 39
    .line 40
    check-cast v3, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 44
    move-result-object v3

    .line 45
    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getId()Ljava/lang/String;

    .line 50
    move-result-object v2

    .line 51
    .line 52
    :cond_2
    iget-object v3, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V:Ljava/lang/String;

    .line 53
    .line 54
    const-string v4, "BUY_STATUS_ORDER_CREATED"

    .line 55
    .line 56
    .line 57
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    move-result v3

    .line 59
    const/4 v4, 0x2

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/kubi/payment/p2p/order/OrderProcessDialog$Companion;->clearDialogStore(ZLjava/lang/String;ZI)V

    .line 63
    return-void
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

.method public final z4(J)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->V:Ljava/lang/String;

    .line 3
    .line 4
    const-string v1, "BUY_STATUS_ORDER_CREATED"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    goto :goto_1

    .line 12
    .line 13
    .line 14
    :cond_0
    const-wide/32 v0, 0x927c0

    .line 15
    .line 16
    cmp-long p1, p1, v0

    .line 17
    .line 18
    if-gtz p1, :cond_5

    .line 19
    .line 20
    iget-boolean p1, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->Z:Z

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    goto :goto_1

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    check-cast p1, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->getId()Ljava/lang/String;

    .line 39
    move-result-object p1

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const/4 p1, 0x0

    .line 42
    .line 43
    :goto_0
    if-eqz p1, :cond_5

    .line 44
    .line 45
    .line 46
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 47
    move-result p2

    .line 48
    .line 49
    if-nez p2, :cond_3

    .line 50
    goto :goto_1

    .line 51
    .line 52
    :cond_3
    sget-object p2, Lcom/kubi/payment/util/i;->a:Lcom/kubi/payment/util/i;

    .line 53
    const/4 v0, 0x2

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, p1, v0}, Lcom/kubi/payment/util/i;->y(Ljava/lang/String;I)Ly70/g;

    .line 57
    move-result-object p2

    .line 58
    const/4 v1, 0x0

    .line 59
    .line 60
    .line 61
    invoke-static {p2, v1}, Ly70/a;->d(Ly70/g;Z)Z

    .line 62
    move-result p2

    .line 63
    .line 64
    if-nez p2, :cond_4

    .line 65
    .line 66
    sget-object p2, Lcom/kubi/payment/p2p/order/OrderProcessDialog;->s0:Lcom/kubi/payment/p2p/order/OrderProcessDialog$Companion;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, p0, p1, v0}, Lcom/kubi/payment/p2p/order/OrderProcessDialog$Companion;->show(Landroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 70
    :cond_4
    const/4 p1, 0x1

    .line 71
    .line 72
    iput-boolean p1, p0, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->Z:Z

    .line 73
    :cond_5
    :goto_1
    return-void
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

.method public final z5()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->P2P:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, v0, Lft/r1;->F0:Lcom/kubi/payment/p2p/widget/P2PViewChatCardEntrance;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    sget v1, Lcom/kubi/otc/R$id;->tvChat:I

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 30
    goto :goto_0

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget-object v0, v0, Lft/r1;->F0:Lcom/kubi/payment/p2p/widget/P2PViewChatCardEntrance;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    sget v1, Lcom/kubi/otc/R$id;->tvChat:I

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    iget-object v0, v0, Lft/r1;->s0:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    iget-object v0, v0, Lft/r1;->A0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 73
    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 78
    .line 79
    .line 80
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    iget-object v0, v0, Lft/r1;->H:Lcom/kubi/resources/widget/BaseTextView;

    .line 86
    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    .line 90
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 94
    move-result-object v0

    .line 95
    .line 96
    if-eqz v0, :cond_5

    .line 97
    .line 98
    iget-object v0, v0, Lft/r1;->Z0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 99
    .line 100
    if-eqz v0, :cond_5

    .line 101
    .line 102
    .line 103
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 104
    .line 105
    .line 106
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 107
    move-result-object v0

    .line 108
    .line 109
    if-eqz v0, :cond_6

    .line 110
    .line 111
    iget-object v0, v0, Lft/r1;->H:Lcom/kubi/resources/widget/BaseTextView;

    .line 112
    .line 113
    if-eqz v0, :cond_6

    .line 114
    .line 115
    .line 116
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 117
    .line 118
    .line 119
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 120
    move-result-object v0

    .line 121
    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    iget-object v0, v0, Lft/r1;->K:Lcom/kubi/resources/widget/BaseTextView;

    .line 125
    .line 126
    if-eqz v0, :cond_7

    .line 127
    .line 128
    .line 129
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 130
    .line 131
    .line 132
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 133
    move-result-object v0

    .line 134
    .line 135
    if-eqz v0, :cond_8

    .line 136
    .line 137
    iget-object v0, v0, Lft/r1;->l0:Lcom/kubi/resources/widget/BaseTextView;

    .line 138
    .line 139
    if-eqz v0, :cond_8

    .line 140
    .line 141
    .line 142
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 143
    .line 144
    .line 145
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 146
    move-result-object v0

    .line 147
    .line 148
    if-eqz v0, :cond_9

    .line 149
    .line 150
    iget-object v0, v0, Lft/r1;->l0:Lcom/kubi/resources/widget/BaseTextView;

    .line 151
    .line 152
    if-eqz v0, :cond_9

    .line 153
    .line 154
    sget v1, Lcom/kubi/otc/R$string;->payment_detail_buy_payed_coin_sub_title:I

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 158
    move-result-object v1

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 162
    .line 163
    .line 164
    :cond_9
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 165
    move-result-object v0

    .line 166
    .line 167
    if-eqz v0, :cond_a

    .line 168
    .line 169
    iget-object v0, v0, Lft/r1;->L0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 170
    .line 171
    if-eqz v0, :cond_a

    .line 172
    .line 173
    .line 174
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 175
    .line 176
    .line 177
    :cond_a
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 178
    move-result-object v0

    .line 179
    .line 180
    if-eqz v0, :cond_b

    .line 181
    .line 182
    iget-object v0, v0, Lft/r1;->W0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 183
    .line 184
    if-eqz v0, :cond_b

    .line 185
    .line 186
    .line 187
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 188
    .line 189
    .line 190
    :cond_b
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->D4()Lft/r1;

    .line 191
    move-result-object v0

    .line 192
    .line 193
    if-eqz v0, :cond_c

    .line 194
    .line 195
    iget-object v0, v0, Lft/r1;->t0:Lcom/kubi/resources/widget/BaseTextView;

    .line 196
    .line 197
    if-eqz v0, :cond_c

    .line 198
    .line 199
    sget v1, Lcom/kubi/otc/R$string;->payment_detail_deal_complete:I

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 203
    move-result-object v1

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 207
    .line 208
    .line 209
    :cond_c
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 210
    move-result-object v0

    .line 211
    .line 212
    check-cast v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->Z()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;

    .line 216
    move-result-object v0

    .line 217
    .line 218
    if-eqz v0, :cond_d

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0}, Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;->isP2PExpress()Z

    .line 222
    move-result v0

    .line 223
    .line 224
    .line 225
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 226
    move-result-object v0

    .line 227
    goto :goto_1

    .line 228
    :cond_d
    const/4 v0, 0x0

    .line 229
    .line 230
    .line 231
    :goto_1
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 232
    move-result v0

    .line 233
    .line 234
    if-nez v0, :cond_e

    .line 235
    .line 236
    .line 237
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/order/OrderDetailFragment;->Z5()V

    .line 238
    :cond_e
    return-void
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

.method public final z6()V
    .locals 5

    .line 1
    .line 2
    sget-object v0, Leu/w;->a:Leu/w;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    check-cast v1, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->R()Lcom/kubi/otc/entity/AdPayType;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/kubi/otc/entity/AdPayType;->getId()Ljava/lang/String;

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
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    check-cast v2, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;->e0()Ljava/util/List;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    const-string v4, "getChildFragmentManager(...)"

    .line 37
    .line 38
    .line 39
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    new-instance v4, Lcom/kubi/payment/p2p/order/a0;

    .line 42
    .line 43
    .line 44
    invoke-direct {v4, p0}, Lcom/kubi/payment/p2p/order/a0;-><init>(Lcom/kubi/payment/p2p/order/OrderDetailFragment;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1, v2, v3, v4}, Leu/w;->Y(Ljava/lang/String;Ljava/util/List;Landroidx/fragment/app/FragmentManager;Lkotlin/jvm/functions/Function1;)V

    .line 48
    return-void
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
