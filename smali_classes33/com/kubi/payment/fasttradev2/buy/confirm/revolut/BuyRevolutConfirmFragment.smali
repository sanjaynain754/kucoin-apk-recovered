.class public final Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;
.super Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmFragment;
.source "BuyRevolutConfirmFragment.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmFragment<",
        "Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmVM;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0008\u0010\u0013\u001a\u00020\u000eH\u0016J\u0008\u0010\u0014\u001a\u00020\u000eH\u0014J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000cH\u0002J\u0008\u0010\u0017\u001a\u00020\u000eH\u0016J\u0008\u0010\u0018\u001a\u00020\u000eH\u0002J\u0008\u0010\u0019\u001a\u00020\u001aH\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\n\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\n\u0010#\u001a\u0004\u0018\u00010$H\u0016J\n\u0010%\u001a\u0004\u0018\u00010&H\u0016J\n\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u000e\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00020*H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"
    }
    d2 = {
        "Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;",
        "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmFragment;",
        "Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmVM;",
        "<init>",
        "()V",
        "binding",
        "Lcom/kubi/otc/databinding/PaymentFragmentFastBuyConfirmBinding;",
        "getBinding",
        "()Lcom/kubi/otc/databinding/PaymentFragmentFastBuyConfirmBinding;",
        "binding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "orderId",
        "",
        "initViews",
        "",
        "onPreviewOrderResponseReady",
        "previewOrder",
        "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;",
        "initRevolut",
        "placeOrder",
        "observeData",
        "pay",
        "orderToken",
        "onResume",
        "launchResultPage",
        "layout",
        "",
        "headerView",
        "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmHeaderView;",
        "oneTimeInfoView",
        "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmInfoView;",
        "recurringInfoView",
        "Lcom/kubi/payment/fast/buy/widget/PaymentConfirmRecurringLayout;",
        "livePriceView",
        "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmLivePriceExplainView;",
        "fluctuationTermsView",
        "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyFluctuationTermsView;",
        "termsView",
        "Lcom/kubi/payment/widget/PaymentTermView;",
        "confirmView",
        "Lcom/kubi/resources/widget/button/KcPrimaryButton;",
        "viewModelClass",
        "Lkotlin/reflect/KClass;",
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
        "SMAP\nBuyRevolutConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyRevolutConfirmFragment.kt\ncom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,167:1\n147#2,16:168\n48#3,2:184\n48#3,2:186\n*S KotlinDebug\n*F\n+ 1 BuyRevolutConfirmFragment.kt\ncom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment\n*L\n33#1:168,16\n67#1:184,2\n87#1:186,2\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic a0:[Lkotlin/reflect/KProperty;
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
.field public final Y:Lcom/kubi/sdk/viewbindingdelegate/base/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public Z:Ljava/lang/String;
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
    const-string v1, "getBinding()Lcom/kubi/otc/databinding/PaymentFragmentFastBuyConfirmBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;

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
    sput-object v1, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;->a0:[Lkotlin/reflect/KProperty;

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

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmFragment;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment$special$$inlined$viewBindingFragment$1;->INSTANCE:Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment$special$$inlined$viewBindingFragment$1;

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment$special$$inlined$viewBindingFragment$2;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment$special$$inlined$viewBindingFragment$2;-><init>(Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;->Y:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 17
    .line 18
    const-string v0, "B7BuyCryRevolut"

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->setPageId(Ljava/lang/String;)V

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

.method public static synthetic A4(Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderResponse;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;->E4(Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderResponse;)Lkotlin/Unit;

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

.method private final B4()Lft/e1;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;->Y:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;->a0:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Lft/e1;

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

.method public static final E4(Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderResponse;)Lkotlin/Unit;
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderResponse;->getOrderId()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;->Z:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderResponse;->getOrderToken()Ljava/lang/String;

    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x2

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 18
    move-result v2

    .line 19
    .line 20
    if-nez v2, :cond_0

    .line 21
    goto :goto_0

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-direct {p0, p1}, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;->F4(Ljava/lang/String;)V

    .line 25
    goto :goto_1

    .line 26
    .line 27
    :cond_1
    :goto_0
    new-instance v3, Lcom/kubi/otc/exception/OtcMessage;

    .line 28
    const/4 v7, 0x4

    .line 29
    const/4 v8, 0x0

    .line 30
    .line 31
    const-string v4, "orderToken is null or empty"

    .line 32
    .line 33
    const-string v5, "BuyRevolutConfirmFragment"

    .line 34
    const/4 v6, 0x0

    .line 35
    .line 36
    .line 37
    invoke-direct/range {v3 .. v8}, Lcom/kubi/otc/exception/OtcMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v3, v1, v0, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 41
    :goto_1
    const/4 p1, 0x1

    .line 42
    .line 43
    .line 44
    invoke-static {p0, p1, v1, v0, v1}, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmFragment;->z4(Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmFragment;ZLjava/lang/String;ILjava/lang/Object;)V

    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 47
    return-object p0
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

.method private final F4(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/payment/fast/buy/popularpay/revolut/g;->a:Lcom/kubi/payment/fast/buy/popularpay/revolut/g;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->n3()Landroid/content/Context;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    const-string v3, "<get-lifecycle>(...)"

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    new-instance v3, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment$a;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3}, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment$a;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1, p1, v2, v3}, Lcom/kubi/payment/fast/buy/popularpay/revolut/g;->b(Landroid/content/Context;Ljava/lang/String;Landroidx/lifecycle/Lifecycle;Lha0/a;)V

    .line 24
    return-void
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
.method public final C4(Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;->getRevolutInfo()Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyRevolutInfo;

    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyRevolutInfo;->getMerchantPublicKey()Ljava/lang/String;

    .line 11
    move-result-object p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p1, v0

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 21
    move-result v1

    .line 22
    .line 23
    if-lez v1, :cond_1

    .line 24
    .line 25
    sget-object v0, Lcom/kubi/payment/fast/buy/popularpay/revolut/g;->a:Lcom/kubi/payment/fast/buy/popularpay/revolut/g;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lcom/kubi/payment/fast/buy/popularpay/revolut/g;->a(Ljava/lang/String;)V

    .line 29
    return-void

    .line 30
    .line 31
    :cond_1
    new-instance v1, Lcom/kubi/otc/exception/OtcMessage;

    .line 32
    const/4 v5, 0x4

    .line 33
    const/4 v6, 0x0

    .line 34
    .line 35
    const-string v2, "the merchantPublicKey is empty"

    .line 36
    .line 37
    const-string v3, "RevolutConfirmVM"

    .line 38
    const/4 v4, 0x0

    .line 39
    .line 40
    .line 41
    invoke-direct/range {v1 .. v6}, Lcom/kubi/otc/exception/OtcMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 42
    const/4 p1, 0x2

    .line 43
    .line 44
    .line 45
    invoke-static {v1, v0, p1, v0}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 46
    return-void
.end method

.method public final D4()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;->Z:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmFragment;->X3(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    iput-object v0, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;->Z:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->preformBackPressed()V

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
.end method

.method public O3()Lcom/kubi/resources/widget/button/KcPrimaryButton;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;->B4()Lft/e1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lft/e1;->i:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

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

.method public P3()Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyFluctuationTermsView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;->B4()Lft/e1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lft/e1;->c:Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyFluctuationTermsView;

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

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

.method public S3()Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmHeaderView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;->B4()Lft/e1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lft/e1;->d:Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmHeaderView;

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

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

.method public Y3()Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmLivePriceExplainView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;->B4()Lft/e1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lft/e1;->f:Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmLivePriceExplainView;

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

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

.method public h4(Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;)V
    .locals 1
    .param p1    # Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "previewOrder"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmFragment;->h4(Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;->C4(Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;)V

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
.end method

.method public j4()Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmInfoView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;->B4()Lft/e1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lft/e1;->e:Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmInfoView;

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

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

.method public k4()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;->Z:Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    check-cast v0, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmVM;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmVM;->e0()V

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
.end method

.method public m4()Lcom/kubi/payment/fast/buy/widget/PaymentConfirmRecurringLayout;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
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

.method public onResume()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/BaseFragment;->onResume()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;->Z:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    goto :goto_0

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;->D4()V

    .line 18
    :cond_1
    :goto_0
    return-void
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

.method public p3()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmFragment;->p3()V

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

.method public q3()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/otc/R$layout;->payment_fragment_fast_buy_confirm:I

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
    invoke-super {p0}, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmFragment;->r3()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    check-cast v0, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmVM;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmVM;->c0()Landroidx/lifecycle/LiveData;

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
    new-instance v2, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/b;

    .line 20
    .line 21
    .line 22
    invoke-direct {v2, p0}, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/b;-><init>(Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;)V

    .line 23
    .line 24
    new-instance v3, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment$b;

    .line 25
    .line 26
    .line 27
    invoke-direct {v3, v2}, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 31
    return-void
.end method

.method public x4()Lcom/kubi/payment/widget/PaymentTermView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;->B4()Lft/e1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lft/e1;->h:Lcom/kubi/payment/widget/PaymentTermView;

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

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

.method public z3()Lkotlin/reflect/KClass;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/reflect/KClass<",
            "Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmVM;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-class v0, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmVM;

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
