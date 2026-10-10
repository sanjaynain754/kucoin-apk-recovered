.class public abstract Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;
.super Lcom/kubi/sdk/base/ui/BasePagingFragment;
.source "AbsOrderDetailFragment.kt"

# interfaces
.implements Lzc/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/sdk/base/ui/BasePagingFragment<",
        "Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;",
        ">;",
        "Lzc/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008&\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u0002B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001a\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J$\u0010\u0012\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0014J\u0008\u0010\u0018\u001a\u00020\u0019H\u0014J\u0008\u0010\u001a\u001a\u00020\u0016H\u0014J\u001c\u0010\u001b\u001a\u00020\r2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u0014J\u0012\u0010\u001f\u001a\u00020\u00192\u0008\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u0010\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006$"
    }
    d2 = {
        "Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;",
        "Lcom/kubi/core/base/arch/repo/IRepoProvider;",
        "Lcom/kubi/sdk/base/ui/BasePagingFragment;",
        "Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;",
        "<init>",
        "()V",
        "delegationData",
        "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;",
        "getDelegationData",
        "()Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;",
        "delegationData$delegate",
        "Lkotlin/Lazy;",
        "onViewCreated",
        "",
        "view",
        "Landroid/view/View;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "getDataLoader",
        "Lio/reactivex/Observable;",
        "Lcom/kubi/sdk/base/entity/BasePageEntity;",
        "pageIndex",
        "",
        "pageSize",
        "needDefaultBackground",
        "",
        "getItemLayout",
        "bindDataToView",
        "helper",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "item",
        "isTaxVisible",
        "tax",
        "",
        "getQuoteCurrency",
        "textStub",
        "TradeCoreBizLib_googleRelease"
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
        "SMAP\nAbsOrderDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsOrderDetailFragment.kt\ncom/kubi/core/biz/order/detail/AbsOrderDetailFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"
    }
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
    const-string v0, "B5singleOrder"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->setPageId(Ljava/lang/String;)V

    .line 9
    .line 10
    new-instance v0, Lsd/b;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p0}, Lsd/b;-><init>(Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    iput-object v0, p0, Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;->Z:Lkotlin/Lazy;

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

.method public static synthetic H3(Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;->L3(Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;)Lkotlin/Unit;

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
.end method

.method public static synthetic I3(Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;)Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;->N3(Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;)Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;

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
.end method

.method public static synthetic J3(Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;->M3(Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;Ljava/lang/String;)V

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
.end method

.method public static final L3(Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;)Lkotlin/Unit;
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
    new-instance v1, Lsd/c;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, p0}, Lsd/c;-><init>(Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;)V

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
.end method

.method public static final M3(Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;Ljava/lang/String;)V
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
    sget v1, Lcom/kubi/tradecorebiz/R$string;->kc_trade_india_tax_title:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sget v1, Lcom/kubi/tradecorebiz/R$string;->common_tax_tips:I

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
    sget v0, Lcom/kubi/tradecorebiz/R$string;->i_already_know:I

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
.end method

.method public static final N3(Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;)Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;
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
    check-cast p0, Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;

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

.method public K3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;)V
    .locals 18
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;
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
    if-eqz v1, :cond_10

    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    goto/16 :goto_d

    .line 11
    .line 12
    :cond_0
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Lv30/n;->a(Landroid/view/View;)Lv30/n;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    const-string v2, "bind(...)"

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    sget-object v2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 24
    .line 25
    sget v3, Lcom/kubi/tradecorebiz/R$string;->stub:I

    .line 26
    const/4 v4, 0x0

    .line 27
    .line 28
    new-array v5, v4, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v3, v5}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    iget-object v3, v1, Lv30/n;->v:Lcom/kubi/resources/widget/BaseTextView;

    .line 35
    .line 36
    .line 37
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;->getTime()Ljava/lang/Long;

    .line 38
    move-result-object v5

    .line 39
    .line 40
    .line 41
    invoke-static {v5}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 42
    move-result-wide v5

    .line 43
    .line 44
    .line 45
    invoke-static {v5, v6}, Lcom/kubi/core/utils/d;->e(J)Ljava/lang/String;

    .line 46
    move-result-object v5

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    iget-object v3, v1, Lv30/n;->m:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;->O3()Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;

    .line 55
    move-result-object v5

    .line 56
    const/4 v6, 0x1

    .line 57
    const/4 v7, 0x0

    .line 58
    .line 59
    if-eqz v5, :cond_2

    .line 60
    .line 61
    .line 62
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;->getFee()Ljava/math/BigDecimal;

    .line 63
    move-result-object v8

    .line 64
    .line 65
    if-eqz v8, :cond_1

    .line 66
    .line 67
    .line 68
    invoke-virtual {v8}, Ljava/math/BigDecimal;->negate()Ljava/math/BigDecimal;

    .line 69
    move-result-object v8

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move-object v8, v7

    .line 72
    .line 73
    .line 74
    :goto_0
    invoke-static {v5, v8, v6}, Lcom/kubi/core/base/order/uidata/a;->b(Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;Ljava/math/BigDecimal;Z)Ljava/lang/String;

    .line 75
    move-result-object v5

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    move-object v5, v7

    .line 78
    .line 79
    .line 80
    :goto_1
    invoke-static {v5, v2}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    move-result-object v5

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    .line 86
    iget-object v3, v1, Lv30/n;->j:Lcom/kubi/resources/widget/BaseTextView;

    .line 87
    .line 88
    .line 89
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;->getFeeCurrency()Ljava/lang/String;

    .line 90
    move-result-object v5

    .line 91
    .line 92
    if-eqz v5, :cond_3

    .line 93
    goto :goto_2

    .line 94
    .line 95
    .line 96
    :cond_3
    invoke-virtual {v0, v2}, Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;->P3(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    move-result-object v5

    .line 98
    .line 99
    .line 100
    :goto_2
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;->O3()Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;

    .line 104
    move-result-object v3

    .line 105
    .line 106
    if-eqz v3, :cond_5

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;->getTax()Ljava/lang/String;

    .line 110
    move-result-object v5

    .line 111
    .line 112
    .line 113
    invoke-static {v5}, Lcom/kubi/utils/extensions/DowngradeExKt;->f(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 114
    move-result-object v5

    .line 115
    .line 116
    if-eqz v5, :cond_4

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5}, Ljava/math/BigDecimal;->negate()Ljava/math/BigDecimal;

    .line 120
    move-result-object v5

    .line 121
    goto :goto_3

    .line 122
    :cond_4
    move-object v5, v7

    .line 123
    .line 124
    .line 125
    :goto_3
    invoke-static {v3, v5, v6}, Lcom/kubi/core/base/order/uidata/a;->b(Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;Ljava/math/BigDecimal;Z)Ljava/lang/String;

    .line 126
    move-result-object v3

    .line 127
    goto :goto_4

    .line 128
    :cond_5
    move-object v3, v7

    .line 129
    .line 130
    :goto_4
    iget-object v5, v1, Lv30/n;->s:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    .line 135
    iget-object v5, v1, Lv30/n;->e:Landroid/widget/LinearLayout;

    .line 136
    .line 137
    const-string v8, "llTax"

    .line 138
    .line 139
    .line 140
    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;->getTax()Ljava/lang/String;

    .line 144
    move-result-object v8

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v8}, Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;->Q3(Ljava/lang/String;)Z

    .line 148
    move-result v8

    .line 149
    .line 150
    if-eqz v8, :cond_7

    .line 151
    .line 152
    if-eqz v3, :cond_7

    .line 153
    .line 154
    .line 155
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 156
    move-result v3

    .line 157
    .line 158
    if-nez v3, :cond_6

    .line 159
    goto :goto_5

    .line 160
    :cond_6
    move v3, v6

    .line 161
    goto :goto_6

    .line 162
    :cond_7
    :goto_5
    move v3, v4

    .line 163
    .line 164
    .line 165
    :goto_6
    invoke-static {v5, v3}, Laf/a;->d(Landroid/view/View;Z)V

    .line 166
    .line 167
    iget-object v3, v1, Lv30/n;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;->getTaxCurrency()Ljava/lang/String;

    .line 171
    move-result-object v5

    .line 172
    .line 173
    if-eqz v5, :cond_8

    .line 174
    goto :goto_7

    .line 175
    .line 176
    .line 177
    :cond_8
    invoke-virtual {v0, v2}, Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;->P3(Ljava/lang/String;)Ljava/lang/String;

    .line 178
    move-result-object v5

    .line 179
    .line 180
    .line 181
    :goto_7
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 182
    .line 183
    iget-object v8, v1, Lv30/n;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 184
    .line 185
    .line 186
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 187
    .line 188
    new-instance v11, Lsd/a;

    .line 189
    .line 190
    .line 191
    invoke-direct {v11, v0}, Lsd/a;-><init>(Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;)V

    .line 192
    const/4 v12, 0x1

    .line 193
    const/4 v13, 0x0

    .line 194
    .line 195
    const-wide/16 v9, 0x0

    .line 196
    .line 197
    .line 198
    invoke-static/range {v8 .. v13}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 199
    .line 200
    sget v9, Lcom/kubi/tradecorebiz/R$drawable;->ic2_question_16:I

    .line 201
    .line 202
    .line 203
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    .line 204
    move-result v3

    .line 205
    .line 206
    if-eqz v3, :cond_9

    .line 207
    .line 208
    .line 209
    const v3, 0x800003

    .line 210
    :goto_8
    move v11, v3

    .line 211
    goto :goto_9

    .line 212
    .line 213
    .line 214
    :cond_9
    const v3, 0x800005

    .line 215
    goto :goto_8

    .line 216
    :goto_9
    const/4 v12, 0x2

    .line 217
    const/4 v13, 0x0

    .line 218
    const/4 v10, 0x0

    .line 219
    .line 220
    .line 221
    invoke-static/range {v8 .. v13}, Lcom/kubi/utils/extensions/k;->i(Landroid/widget/TextView;IIIILjava/lang/Object;)V

    .line 222
    .line 223
    iget-object v3, v1, Lv30/n;->f:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0}, Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;->O3()Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;

    .line 227
    move-result-object v5

    .line 228
    .line 229
    if-eqz v5, :cond_a

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;->getSize()Ljava/math/BigDecimal;

    .line 233
    move-result-object v8

    .line 234
    .line 235
    .line 236
    invoke-static {v5, v8, v4}, Lcom/kubi/core/base/order/uidata/a;->b(Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;Ljava/math/BigDecimal;Z)Ljava/lang/String;

    .line 237
    move-result-object v5

    .line 238
    goto :goto_a

    .line 239
    :cond_a
    move-object v5, v7

    .line 240
    .line 241
    .line 242
    :goto_a
    invoke-static {v5, v2}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 243
    move-result-object v5

    .line 244
    .line 245
    .line 246
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 247
    .line 248
    iget-object v3, v1, Lv30/n;->o:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;->getPrice()Ljava/math/BigDecimal;

    .line 252
    move-result-object v8

    .line 253
    .line 254
    if-eqz v8, :cond_c

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0}, Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;->O3()Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;

    .line 258
    move-result-object v5

    .line 259
    .line 260
    if-eqz v5, :cond_b

    .line 261
    .line 262
    .line 263
    invoke-interface {v5}, Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;->getSymbol()Ljava/lang/String;

    .line 264
    move-result-object v5

    .line 265
    move-object v9, v5

    .line 266
    goto :goto_b

    .line 267
    :cond_b
    move-object v9, v7

    .line 268
    .line 269
    :goto_b
    const/16 v16, 0x7e

    .line 270
    .line 271
    const/16 v17, 0x0

    .line 272
    const/4 v10, 0x0

    .line 273
    const/4 v11, 0x0

    .line 274
    const/4 v12, 0x0

    .line 275
    const/4 v13, 0x0

    .line 276
    const/4 v14, 0x0

    .line 277
    const/4 v15, 0x0

    .line 278
    .line 279
    .line 280
    invoke-static/range {v8 .. v17}, Lgf/j;->d(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 281
    move-result-object v5

    .line 282
    goto :goto_c

    .line 283
    :cond_c
    move-object v5, v7

    .line 284
    .line 285
    .line 286
    :goto_c
    invoke-static {v5, v2}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 287
    move-result-object v5

    .line 288
    .line 289
    .line 290
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 291
    .line 292
    iget-object v3, v1, Lv30/n;->k:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0}, Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;->O3()Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;

    .line 296
    move-result-object v5

    .line 297
    .line 298
    if-eqz v5, :cond_e

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;->getSize()Ljava/math/BigDecimal;

    .line 302
    move-result-object v8

    .line 303
    .line 304
    if-eqz v8, :cond_d

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;->getPrice()Ljava/math/BigDecimal;

    .line 308
    move-result-object v9

    .line 309
    .line 310
    .line 311
    invoke-static {v9, v7, v6, v7}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 312
    move-result-object v7

    .line 313
    .line 314
    .line 315
    invoke-virtual {v8, v7}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 316
    move-result-object v7

    .line 317
    .line 318
    .line 319
    :cond_d
    invoke-static {v5, v7, v6}, Lcom/kubi/core/base/order/uidata/a;->b(Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;Ljava/math/BigDecimal;Z)Ljava/lang/String;

    .line 320
    move-result-object v7

    .line 321
    .line 322
    .line 323
    :cond_e
    invoke-static {v7, v2}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 324
    move-result-object v2

    .line 325
    .line 326
    .line 327
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 328
    .line 329
    sget-object v2, Lce/a;->a:Lce/a;

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;->getLiquidityRole()Ljava/lang/String;

    .line 333
    move-result-object v3

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2, v3}, Lce/a;->a(Ljava/lang/String;)Ljava/lang/Integer;

    .line 337
    move-result-object v2

    .line 338
    .line 339
    const-string v3, "tvRoleName"

    .line 340
    .line 341
    const-string v5, "tvRole"

    .line 342
    .line 343
    const-string v7, "llRole"

    .line 344
    .line 345
    if-eqz v2, :cond_f

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 349
    move-result v2

    .line 350
    .line 351
    iget-object v4, v1, Lv30/n;->q:Lcom/kubi/resources/widget/BaseTextView;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(I)V

    .line 355
    .line 356
    iget-object v2, v1, Lv30/n;->d:Landroid/widget/LinearLayout;

    .line 357
    .line 358
    .line 359
    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    invoke-static {v2, v6}, Laf/a;->d(Landroid/view/View;Z)V

    .line 363
    .line 364
    iget-object v2, v1, Lv30/n;->q:Lcom/kubi/resources/widget/BaseTextView;

    .line 365
    .line 366
    .line 367
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    invoke-static {v2, v6}, Laf/a;->d(Landroid/view/View;Z)V

    .line 371
    .line 372
    iget-object v1, v1, Lv30/n;->r:Lcom/kubi/resources/widget/BaseTextView;

    .line 373
    .line 374
    .line 375
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    invoke-static {v1, v6}, Laf/a;->d(Landroid/view/View;Z)V

    .line 379
    return-void

    .line 380
    .line 381
    :cond_f
    iget-object v2, v1, Lv30/n;->d:Landroid/widget/LinearLayout;

    .line 382
    .line 383
    .line 384
    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    invoke-static {v2, v4}, Laf/a;->d(Landroid/view/View;Z)V

    .line 388
    .line 389
    iget-object v2, v1, Lv30/n;->q:Lcom/kubi/resources/widget/BaseTextView;

    .line 390
    .line 391
    .line 392
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    invoke-static {v2, v4}, Laf/a;->d(Landroid/view/View;Z)V

    .line 396
    .line 397
    iget-object v1, v1, Lv30/n;->r:Lcom/kubi/resources/widget/BaseTextView;

    .line 398
    .line 399
    .line 400
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    invoke-static {v1, v4}, Laf/a;->d(Landroid/view/View;Z)V

    .line 404
    :cond_10
    :goto_d
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
.end method

.method public final O3()Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;->Z:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;

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

.method public final P3(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;->O3()Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;->getSymbolInfo()Lcom/kubi/data/entity/SymbolInfoEntity;

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
    .line 21
    :goto_0
    invoke-static {v0, p1}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    move-result-object p1

    .line 23
    return-object p1
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
.end method

.method public final Q3(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lcom/kubi/utils/extensions/DowngradeExKt;->f(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lkf/a;->D(Ljava/math/BigDecimal;)Z

    .line 14
    move-result p1

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
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
.end method

.method public bridge synthetic o3(Lio/chad/library/adapter/base/BaseViewHolder;Landroid/os/Parcelable;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;->K3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;)V

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
    sget p2, Lcom/kubi/tradecorebiz/R$color;->c_overlay:I

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
    iget-object p2, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->X:Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    .line 58
    move-result-object p2

    .line 59
    .line 60
    new-instance v0, Ljd/e;

    .line 61
    .line 62
    .line 63
    invoke-direct {v0}, Ljd/e;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;->O3()Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;

    .line 70
    move-result-object p2

    .line 71
    .line 72
    if-eqz p2, :cond_2

    .line 73
    .line 74
    new-instance v0, Lsd/g;

    .line 75
    .line 76
    .line 77
    invoke-direct {v0}, Lsd/g;-><init>()V

    .line 78
    .line 79
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 83
    move-result-object v1

    .line 84
    .line 85
    .line 86
    invoke-static {v1}, Lv30/o;->c(Landroid/view/LayoutInflater;)Lv30/o;

    .line 87
    move-result-object v1

    .line 88
    .line 89
    const-string v2, "inflate(...)"

    .line 90
    .line 91
    .line 92
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Lv30/o;->b()Landroid/widget/LinearLayout;

    .line 96
    move-result-object v2

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1, p2, p0}, Lsd/g;->c(Lv30/o;Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;Lcom/kubi/sdk/BaseFragment;)V

    .line 103
    .line 104
    iget-object p2, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->W:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Lv30/o;->b()Landroid/widget/LinearLayout;

    .line 108
    move-result-object v0

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2, v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->addHeaderView(Landroid/view/View;)I

    .line 112
    .line 113
    .line 114
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->getNavigationBar()Lcom/kubi/resources/widget/NavigationBar;

    .line 115
    move-result-object p2

    .line 116
    .line 117
    if-eqz p2, :cond_3

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 121
    :cond_3
    return-void
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
.end method

.method public r3(II)Lio/reactivex/Observable;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/sdk/base/entity/BasePageEntity<",
            "Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Lzc/b;->p1()Lzc/c;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lzc/c;->b()Lcd/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Lcd/a;->i()Lyc/e;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    new-instance v1, Lcom/kubi/core/base/order/data/HistoryOrderDetailFills$Request;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;->O3()Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;

    .line 22
    move-result-object v2

    .line 23
    const/4 v3, 0x0

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-interface {v2}, Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;->getSymbol()Ljava/lang/String;

    .line 29
    move-result-object v2

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v2, v3

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;->O3()Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;

    .line 35
    move-result-object v4

    .line 36
    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-interface {v4}, Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;->getOrderId()Ljava/lang/String;

    .line 41
    move-result-object v3

    .line 42
    :cond_1
    move-object v4, v3

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 46
    move-result-object v5

    .line 47
    .line 48
    .line 49
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 50
    move-result-object v6

    .line 51
    move-object v3, v2

    .line 52
    .line 53
    const-string v2, "SPOT"

    .line 54
    .line 55
    .line 56
    invoke-direct/range {v1 .. v6}, Lcom/kubi/core/base/order/data/HistoryOrderDetailFills$Request;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-interface {v0, v1}, Lyc/e;->a(Lwc/a;)Lio/reactivex/Observable;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    if-eqz p1, :cond_2

    .line 63
    return-object p1

    .line 64
    .line 65
    .line 66
    :cond_2
    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    const-string p2, "empty(...)"

    .line 70
    .line 71
    .line 72
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    return-object p1
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
.end method

.method public x3()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/tradecorebiz/R$layout;->core_item_delegation_detail:I

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
