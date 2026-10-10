.class public final Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;
.super Lcom/kubi/sdk/base/ui/BasePagingFragment;
.source "DelegationDetailFragment.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/sdk/base/ui/BasePagingFragment<",
        "Lcom/kubi/spot/entity/DelegationItemEntity;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0008\u0010\u001c\u001a\u00020\u001dH\u0014J\u0008\u0010\u001e\u001a\u00020\u001fH\u0014J$\u0010 \u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\"0!2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001fH\u0014J\u001c\u0010%\u001a\u00020\u00172\u0008\u0010&\u001a\u0004\u0018\u00010\'2\u0008\u0010(\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010)\u001a\u00020\u001d2\u0008\u0010*\u001a\u0004\u0018\u00010\u0006H\u0002J\u0008\u0010+\u001a\u00020\u0006H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008R#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\u000c0\u000c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\n\u001a\u0004\u0008\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\n\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006,"
    }
    d2 = {
        "Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;",
        "Lcom/kubi/sdk/base/ui/BasePagingFragment;",
        "Lcom/kubi/spot/entity/DelegationItemEntity;",
        "<init>",
        "()V",
        "tradeType",
        "",
        "getTradeType",
        "()Ljava/lang/String;",
        "tradeType$delegate",
        "Lkotlin/Lazy;",
        "mTradeApi",
        "Lcom/kubi/spot/api/MarketApi;",
        "kotlin.jvm.PlatformType",
        "getMTradeApi",
        "()Lcom/kubi/spot/api/MarketApi;",
        "mTradeApi$delegate",
        "delegationData",
        "Lcom/kubi/spot/entity/DelegationEntity;",
        "getDelegationData",
        "()Lcom/kubi/spot/entity/DelegationEntity;",
        "delegationData$delegate",
        "onViewCreated",
        "",
        "view",
        "Landroid/view/View;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "needDefaultBackground",
        "",
        "getItemLayout",
        "",
        "getDataLoader",
        "Lio/reactivex/Observable;",
        "Lcom/kubi/sdk/base/entity/BasePageEntity;",
        "pageIndex",
        "pageSize",
        "bindDataToView",
        "helper",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "item",
        "isTaxVisible",
        "tax",
        "getQuoteCurrency",
        "SpotLib_googleRelease"
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
        "SMAP\nDelegationDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegationDetailFragment.kt\ncom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,147:1\n1#2:148\n17#3,2:149\n*S KotlinDebug\n*F\n+ 1 DelegationDetailFragment.kt\ncom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment\n*L\n139#1:149,2\n*E\n"
    }
.end annotation


# instance fields
.field public final Z:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final a0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b0:Lkotlin/Lazy;
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
    const-string v0, "B5singleOrder"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->setPageId(Ljava/lang/String;)V

    .line 9
    .line 10
    new-instance v0, Ll20/a;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p0}, Ll20/a;-><init>(Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    iput-object v0, p0, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->Z:Lkotlin/Lazy;

    .line 20
    .line 21
    new-instance v0, Ll20/b;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0}, Ll20/b;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    iput-object v0, p0, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->a0:Lkotlin/Lazy;

    .line 31
    .line 32
    new-instance v0, Ll20/c;

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, p0}, Ll20/c;-><init>(Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    iput-object v0, p0, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->b0:Lkotlin/Lazy;

    .line 42
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
.end method

.method public static synthetic H3(Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->N3(Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;)Lkotlin/Unit;

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
.end method

.method public static synthetic I3(Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->O3(Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;Ljava/lang/String;)V

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
.end method

.method public static synthetic J3(Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->W3(Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;)Ljava/lang/String;

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
.end method

.method public static synthetic K3()Le20/d;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->V3()Le20/d;

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
.end method

.method public static synthetic L3(Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;)Lcom/kubi/spot/entity/DelegationEntity;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->P3(Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;)Lcom/kubi/spot/entity/DelegationEntity;

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
.end method

.method public static final N3(Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/margin/api/IMarginService;->a:Lcom/kubi/margin/api/IMarginService$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/margin/api/IMarginService$Companion;->get()Lcom/kubi/margin/api/IMarginService;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Ll20/e;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, p0}, Ll20/e;-><init>(Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;)V

    .line 12
    .line 13
    const-string p0, "SPOT_TAX_TIPS"

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p0, v1}, Lcom/kubi/margin/api/IMarginService;->K(Ljava/lang/String;Lio/reactivex/functions/Consumer;)V

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
.end method

.method public static final O3(Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sget v1, Lcom/kubi/spot/R$string;->kc_trade_india_tax_title:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sget v1, Lcom/kubi/spot/R$string;->common_tax_tips:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    const-string v2, "getString(...)"

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v1}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->M4(Ljava/lang/CharSequence;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    sget v0, Lcom/kubi/spot/R$string;->i_already_know:I

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 37
    move-result-object v0

    .line 38
    const/4 v1, 0x0

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->T4(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 46
    move-result-object p0

    .line 47
    .line 48
    const-string v0, "getChildFragmentManager(...)"

    .line 49
    .line 50
    .line 51
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    const-string v0, "tax_tip"

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, p0, v0}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

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
.end method

.method public static final P3(Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;)Lcom/kubi/spot/entity/DelegationEntity;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-string v0, "data"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    check-cast p0, Lcom/kubi/spot/entity/DelegationEntity;

    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

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
.end method

.method private final R3()Le20/d;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->a0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Le20/d;

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
.end method

.method private final S3()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->Q3()Lcom/kubi/spot/entity/DelegationEntity;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/spot/entity/DelegationEntity;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrencyName()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    .line 20
    :goto_0
    sget v1, Lcom/kubi/spot/R$string;->stub:I

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-string v2, "getString(...)"

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    move-result-object v0

    .line 34
    return-object v0
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
.end method

.method private final U3(Ljava/lang/String;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    const/4 v3, 0x1

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v1, v2, v3, v0}, Lcom/kubi/utils/extensions/DowngradeExKt;->h(Ljava/lang/String;DILjava/lang/Object;)D

    .line 8
    move-result-wide v4

    .line 9
    .line 10
    cmpg-double p1, v4, v1

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    move p1, v3

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    xor-int/2addr p1, v3

    .line 17
    return p1
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
.end method

.method public static final V3()Le20/d;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lmr/a;->b()Lretrofit2/Retrofit;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-class v1, Le20/d;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Le20/d;

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
.end method

.method public static final W3(Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-string v0, "tradeType"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    .line 16
    :goto_0
    const-string v0, "TRADE"

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v0}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    move-result-object p0

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
.end method


# virtual methods
.method public C3()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

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
.end method

.method public M3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/spot/entity/DelegationItemEntity;)V
    .locals 20
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/spot/entity/DelegationItemEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    if-eqz v1, :cond_e

    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    goto/16 :goto_b

    .line 11
    .line 12
    :cond_0
    sget v2, Lcom/kubi/spot/R$string;->stub:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    const-string v3, "getString(...)"

    .line 19
    .line 20
    .line 21
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Lv30/n;->a(Landroid/view/View;)Lv30/n;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    const-string v3, "bind(...)"

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    iget-object v3, v1, Lv30/n;->v:Lcom/kubi/resources/widget/BaseTextView;

    .line 35
    .line 36
    .line 37
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/spot/entity/DelegationItemEntity;->getTime()Ljava/lang/Long;

    .line 38
    move-result-object v4

    .line 39
    .line 40
    .line 41
    invoke-static {v4}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 42
    move-result-wide v4

    .line 43
    .line 44
    .line 45
    invoke-static {v4, v5}, Lf30/r;->e(J)Ljava/lang/String;

    .line 46
    move-result-object v4

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    iget-object v3, v1, Lv30/n;->m:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->Q3()Lcom/kubi/spot/entity/DelegationEntity;

    .line 55
    move-result-object v4

    .line 56
    const/4 v5, 0x1

    .line 57
    const/4 v6, 0x0

    .line 58
    .line 59
    if-eqz v4, :cond_2

    .line 60
    .line 61
    .line 62
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/spot/entity/DelegationItemEntity;->getFee()Ljava/math/BigDecimal;

    .line 63
    move-result-object v7

    .line 64
    .line 65
    if-eqz v7, :cond_1

    .line 66
    .line 67
    .line 68
    invoke-virtual {v7}, Ljava/math/BigDecimal;->negate()Ljava/math/BigDecimal;

    .line 69
    move-result-object v7

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move-object v7, v6

    .line 72
    .line 73
    .line 74
    :goto_0
    invoke-virtual {v4, v7, v5}, Lcom/kubi/spot/entity/DelegationEntity;->getAmountFormatterStr(Ljava/math/BigDecimal;Z)Ljava/lang/String;

    .line 75
    move-result-object v4

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    move-object v4, v6

    .line 78
    .line 79
    .line 80
    :goto_1
    invoke-static {v4, v2}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    move-result-object v4

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    .line 86
    iget-object v3, v1, Lv30/n;->j:Lcom/kubi/resources/widget/BaseTextView;

    .line 87
    .line 88
    .line 89
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/spot/entity/DelegationItemEntity;->getFeeCurrency()Ljava/lang/String;

    .line 90
    move-result-object v4

    .line 91
    .line 92
    if-eqz v4, :cond_3

    .line 93
    goto :goto_2

    .line 94
    .line 95
    .line 96
    :cond_3
    invoke-direct {v0}, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->S3()Ljava/lang/String;

    .line 97
    move-result-object v4

    .line 98
    .line 99
    .line 100
    :goto_2
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 101
    .line 102
    iget-object v3, v1, Lv30/n;->s:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->Q3()Lcom/kubi/spot/entity/DelegationEntity;

    .line 106
    move-result-object v4

    .line 107
    .line 108
    if-eqz v4, :cond_5

    .line 109
    .line 110
    .line 111
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/spot/entity/DelegationItemEntity;->getTax()Ljava/lang/String;

    .line 112
    move-result-object v7

    .line 113
    .line 114
    .line 115
    invoke-static {v7}, Lcom/kubi/utils/extensions/DowngradeExKt;->f(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 116
    move-result-object v7

    .line 117
    .line 118
    if-eqz v7, :cond_4

    .line 119
    .line 120
    .line 121
    invoke-virtual {v7}, Ljava/math/BigDecimal;->negate()Ljava/math/BigDecimal;

    .line 122
    move-result-object v7

    .line 123
    goto :goto_3

    .line 124
    :cond_4
    move-object v7, v6

    .line 125
    .line 126
    .line 127
    :goto_3
    invoke-virtual {v4, v7, v5}, Lcom/kubi/spot/entity/DelegationEntity;->getAmountFormatterStr(Ljava/math/BigDecimal;Z)Ljava/lang/String;

    .line 128
    move-result-object v4

    .line 129
    goto :goto_4

    .line 130
    :cond_5
    move-object v4, v6

    .line 131
    .line 132
    .line 133
    :goto_4
    invoke-static {v4, v2}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 134
    move-result-object v4

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 138
    .line 139
    iget-object v3, v1, Lv30/n;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/spot/entity/DelegationItemEntity;->getTaxCurrency()Ljava/lang/String;

    .line 143
    move-result-object v4

    .line 144
    .line 145
    if-eqz v4, :cond_6

    .line 146
    goto :goto_5

    .line 147
    .line 148
    .line 149
    :cond_6
    invoke-direct {v0}, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->S3()Ljava/lang/String;

    .line 150
    move-result-object v4

    .line 151
    .line 152
    .line 153
    :goto_5
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 154
    .line 155
    iget-object v3, v1, Lv30/n;->f:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->Q3()Lcom/kubi/spot/entity/DelegationEntity;

    .line 159
    move-result-object v4

    .line 160
    const/4 v7, 0x0

    .line 161
    .line 162
    if-eqz v4, :cond_7

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/spot/entity/DelegationItemEntity;->getSize()Ljava/math/BigDecimal;

    .line 166
    move-result-object v8

    .line 167
    .line 168
    .line 169
    invoke-virtual {v4, v8, v7}, Lcom/kubi/spot/entity/DelegationEntity;->getAmountFormatterStr(Ljava/math/BigDecimal;Z)Ljava/lang/String;

    .line 170
    move-result-object v4

    .line 171
    goto :goto_6

    .line 172
    :cond_7
    move-object v4, v6

    .line 173
    .line 174
    .line 175
    :goto_6
    invoke-static {v4, v2}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 176
    move-result-object v4

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 180
    .line 181
    iget-object v3, v1, Lv30/n;->o:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/spot/entity/DelegationItemEntity;->getPrice()Ljava/math/BigDecimal;

    .line 185
    move-result-object v8

    .line 186
    .line 187
    if-eqz v8, :cond_9

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->Q3()Lcom/kubi/spot/entity/DelegationEntity;

    .line 191
    move-result-object v4

    .line 192
    .line 193
    if-eqz v4, :cond_8

    .line 194
    .line 195
    .line 196
    invoke-virtual {v4}, Lcom/kubi/spot/entity/DelegationEntity;->getSymbol()Ljava/lang/String;

    .line 197
    move-result-object v4

    .line 198
    move-object v9, v4

    .line 199
    goto :goto_7

    .line 200
    :cond_8
    move-object v9, v6

    .line 201
    .line 202
    :goto_7
    const/16 v16, 0x7e

    .line 203
    .line 204
    const/16 v17, 0x0

    .line 205
    const/4 v10, 0x0

    .line 206
    const/4 v11, 0x0

    .line 207
    const/4 v12, 0x0

    .line 208
    const/4 v13, 0x0

    .line 209
    const/4 v14, 0x0

    .line 210
    const/4 v15, 0x0

    .line 211
    .line 212
    .line 213
    invoke-static/range {v8 .. v17}, Lgf/j;->d(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 214
    move-result-object v4

    .line 215
    goto :goto_8

    .line 216
    :cond_9
    move-object v4, v6

    .line 217
    .line 218
    .line 219
    :goto_8
    invoke-static {v4, v2}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 220
    move-result-object v4

    .line 221
    .line 222
    .line 223
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 224
    .line 225
    iget-object v3, v1, Lv30/n;->k:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0}, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->Q3()Lcom/kubi/spot/entity/DelegationEntity;

    .line 229
    move-result-object v4

    .line 230
    .line 231
    if-eqz v4, :cond_b

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/spot/entity/DelegationItemEntity;->getSize()Ljava/math/BigDecimal;

    .line 235
    move-result-object v8

    .line 236
    .line 237
    if-eqz v8, :cond_a

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/spot/entity/DelegationItemEntity;->getPrice()Ljava/math/BigDecimal;

    .line 241
    move-result-object v9

    .line 242
    .line 243
    .line 244
    invoke-static {v9, v6, v5, v6}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 245
    move-result-object v6

    .line 246
    .line 247
    .line 248
    invoke-virtual {v8, v6}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 249
    move-result-object v6

    .line 250
    .line 251
    .line 252
    :cond_a
    invoke-virtual {v4, v6, v5}, Lcom/kubi/spot/entity/DelegationEntity;->getAmountFormatterStr(Ljava/math/BigDecimal;Z)Ljava/lang/String;

    .line 253
    move-result-object v6

    .line 254
    .line 255
    .line 256
    :cond_b
    invoke-static {v6, v2}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 257
    move-result-object v2

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 261
    .line 262
    iget-object v2, v1, Lv30/n;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 263
    .line 264
    const-string v3, "tvTaxName"

    .line 265
    .line 266
    .line 267
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/spot/entity/DelegationItemEntity;->getTax()Ljava/lang/String;

    .line 271
    move-result-object v4

    .line 272
    .line 273
    .line 274
    invoke-direct {v0, v4}, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->U3(Ljava/lang/String;)Z

    .line 275
    move-result v4

    .line 276
    .line 277
    .line 278
    invoke-static {v2, v4}, Lf30/a;->d(Landroid/view/View;Z)V

    .line 279
    .line 280
    iget-object v2, v1, Lv30/n;->s:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 281
    .line 282
    const-string v4, "tvTax"

    .line 283
    .line 284
    .line 285
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/spot/entity/DelegationItemEntity;->getTax()Ljava/lang/String;

    .line 289
    move-result-object v4

    .line 290
    .line 291
    .line 292
    invoke-direct {v0, v4}, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->U3(Ljava/lang/String;)Z

    .line 293
    move-result v4

    .line 294
    .line 295
    .line 296
    invoke-static {v2, v4}, Lf30/a;->d(Landroid/view/View;Z)V

    .line 297
    .line 298
    iget-object v2, v1, Lv30/n;->e:Landroid/widget/LinearLayout;

    .line 299
    .line 300
    const-string v4, "llTax"

    .line 301
    .line 302
    .line 303
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/spot/entity/DelegationItemEntity;->getTax()Ljava/lang/String;

    .line 307
    move-result-object v4

    .line 308
    .line 309
    .line 310
    invoke-direct {v0, v4}, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->U3(Ljava/lang/String;)Z

    .line 311
    move-result v4

    .line 312
    .line 313
    .line 314
    invoke-static {v2, v4}, Lf30/a;->d(Landroid/view/View;Z)V

    .line 315
    .line 316
    iget-object v2, v1, Lv30/n;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 317
    .line 318
    const-string v4, "tvTaxCurrency"

    .line 319
    .line 320
    .line 321
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/spot/entity/DelegationItemEntity;->getTax()Ljava/lang/String;

    .line 325
    move-result-object v4

    .line 326
    .line 327
    .line 328
    invoke-direct {v0, v4}, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->U3(Ljava/lang/String;)Z

    .line 329
    move-result v4

    .line 330
    .line 331
    .line 332
    invoke-static {v2, v4}, Lf30/a;->d(Landroid/view/View;Z)V

    .line 333
    .line 334
    iget-object v8, v1, Lv30/n;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 335
    .line 336
    .line 337
    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 338
    .line 339
    new-instance v11, Ll20/d;

    .line 340
    .line 341
    .line 342
    invoke-direct {v11, v0}, Ll20/d;-><init>(Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;)V

    .line 343
    const/4 v12, 0x1

    .line 344
    const/4 v13, 0x0

    .line 345
    .line 346
    const-wide/16 v9, 0x0

    .line 347
    .line 348
    .line 349
    invoke-static/range {v8 .. v13}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 350
    .line 351
    iget-object v14, v1, Lv30/n;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 352
    .line 353
    .line 354
    invoke-static {v14, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 355
    .line 356
    sget v15, Lcom/kubi/spot/R$drawable;->ic2_question_16:I

    .line 357
    .line 358
    .line 359
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    .line 360
    move-result v2

    .line 361
    .line 362
    if-eqz v2, :cond_c

    .line 363
    .line 364
    .line 365
    const v2, 0x800003

    .line 366
    .line 367
    :goto_9
    move/from16 v17, v2

    .line 368
    goto :goto_a

    .line 369
    .line 370
    .line 371
    :cond_c
    const v2, 0x800005

    .line 372
    goto :goto_9

    .line 373
    .line 374
    :goto_a
    const/16 v18, 0x2

    .line 375
    .line 376
    const/16 v19, 0x0

    .line 377
    .line 378
    const/16 v16, 0x0

    .line 379
    .line 380
    .line 381
    invoke-static/range {v14 .. v19}, Lcom/kubi/utils/extensions/k;->i(Landroid/widget/TextView;IIIILjava/lang/Object;)V

    .line 382
    .line 383
    iget-object v1, v1, Lv30/n;->c:Landroid/widget/LinearLayout;

    .line 384
    .line 385
    const-string v2, "llCounterparty"

    .line 386
    .line 387
    .line 388
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 389
    .line 390
    sget-object v2, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 391
    .line 392
    sget-object v3, Lcom/kubi/sdk/site/info/SiteInfoManager;->a:Lcom/kubi/sdk/site/info/SiteInfoManager;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v3}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 396
    move-result-object v3

    .line 397
    .line 398
    const-class v4, Lzf/o0;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v2, v4, v3}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 402
    move-result-object v2

    .line 403
    .line 404
    if-eqz v2, :cond_d

    .line 405
    .line 406
    check-cast v2, Lzf/o0;

    .line 407
    .line 408
    .line 409
    invoke-interface {v2}, Lzf/o0;->a()Z

    .line 410
    move-result v7

    .line 411
    .line 412
    .line 413
    :cond_d
    invoke-static {v1, v7}, Lf30/a;->d(Landroid/view/View;Z)V

    .line 414
    :cond_e
    :goto_b
    return-void
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
.end method

.method public final Q3()Lcom/kubi/spot/entity/DelegationEntity;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->b0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/spot/entity/DelegationEntity;

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
.end method

.method public final T3()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->Z:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

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
.end method

.method public bridge synthetic o3(Lio/chad/library/adapter/base/BaseViewHolder;Landroid/os/Parcelable;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/spot/entity/DelegationItemEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->M3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/spot/entity/DelegationItemEntity;)V

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
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3
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
    invoke-super {p0, p1, p2}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 9
    .line 10
    iget-object p1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 11
    .line 12
    sget p2, Lcom/kubi/spot/R$color;->c_overlay:I

    .line 13
    .line 14
    .line 15
    invoke-static {p1, p2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 16
    move-result p1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 20
    move-result-object p2

    .line 21
    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    sget-object v0, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->a:Lcom/kubi/sdk/util/EdgeToEdgeCompat;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p2, p1}, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->e(Landroid/app/Activity;I)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->getNavigationBar()Lcom/kubi/resources/widget/NavigationBar;

    .line 31
    move-result-object p2

    .line 32
    .line 33
    if-eqz p2, :cond_1

    .line 34
    .line 35
    sget-object v0, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->a:Lcom/kubi/sdk/util/EdgeToEdgeCompat;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->j()I

    .line 39
    move-result v0

    .line 40
    const/4 v1, 0x0

    .line 41
    .line 42
    .line 43
    invoke-static {p2, v1, v0, v1, v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->o(Landroid/view/View;IIII)Landroid/view/View;

    .line 44
    .line 45
    :cond_1
    iget-object p2, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->X:Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2}, Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    .line 49
    move-result-object p2

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 53
    .line 54
    iget-object p1, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->X:Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    new-instance p2, Ljd/e;

    .line 61
    .line 62
    .line 63
    invoke-direct {p2}, Ljd/e;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->Q3()Lcom/kubi/spot/entity/DelegationEntity;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    .line 75
    invoke-static {p1}, Ll20/f;->a(Lcom/kubi/spot/entity/DelegationEntity;)Ll20/l;

    .line 76
    move-result-object p2

    .line 77
    .line 78
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 79
    .line 80
    .line 81
    invoke-interface {p2, p1}, Ll20/l;->b(Lcom/kubi/spot/entity/DelegationEntity;)I

    .line 82
    move-result v1

    .line 83
    const/4 v2, 0x0

    .line 84
    .line 85
    .line 86
    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 87
    move-result-object v0

    .line 88
    .line 89
    .line 90
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {p2, v0, p1, p0}, Ll20/l;->a(Landroid/view/View;Lcom/kubi/spot/entity/DelegationEntity;Lcom/kubi/sdk/BaseFragment;)V

    .line 94
    .line 95
    iget-object p1, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->W:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->addHeaderView(Landroid/view/View;)I

    .line 99
    :cond_2
    return-void
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
.end method

.method public r3(II)Lio/reactivex/Observable;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/sdk/base/entity/BasePageEntity<",
            "Lcom/kubi/spot/entity/DelegationItemEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->R3()Le20/d;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->T3()Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->Q3()Lcom/kubi/spot/entity/DelegationEntity;

    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x0

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/kubi/spot/entity/DelegationEntity;->getSymbol()Ljava/lang/String;

    .line 19
    move-result-object v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v2, v3

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;->Q3()Lcom/kubi/spot/entity/DelegationEntity;

    .line 25
    move-result-object v4

    .line 26
    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4}, Lcom/kubi/spot/entity/DelegationEntity;->getOrderId()Ljava/lang/String;

    .line 31
    move-result-object v3

    .line 32
    :cond_1
    move v4, p1

    .line 33
    move v5, p2

    .line 34
    .line 35
    .line 36
    invoke-interface/range {v0 .. v5}, Le20/d;->S(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lio/reactivex/Observable;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lcom/kubi/sdk/util/a1;->m()Lio/reactivex/ObservableTransformer;

    .line 41
    move-result-object p2

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->compose(Lio/reactivex/ObservableTransformer;)Lio/reactivex/Observable;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    const-string p2, "compose(...)"

    .line 48
    .line 49
    .line 50
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    return-object p1
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
.end method

.method public x3()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/spot/R$layout;->core_item_delegation_detail:I

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
.end method
