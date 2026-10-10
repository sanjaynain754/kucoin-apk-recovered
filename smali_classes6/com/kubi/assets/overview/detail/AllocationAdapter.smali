.class public final Lcom/kubi/assets/overview/detail/AllocationAdapter;
.super Lio/chad/library/adapter/base/BaseQuickAdapter;
.source "AllocationAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001c\u0010\u0014\u001a\u00020\u00122\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00120\u0011J\u001c\u0010\u0016\u001a\u00020\u00122\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00120\u0011J\u0014\u0010\u0017\u001a\u00020\u00122\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000fJ\u0006\u0010\u0019\u001a\u00020\u0012J\u001c\u0010\u001a\u001a\u00020\u00122\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/kubi/assets/overview/detail/AllocationAdapter;",
        "Lio/chad/library/adapter/base/BaseQuickAdapter;",
        "Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "<init>",
        "()V",
        "currency",
        "",
        "getCurrency",
        "()Ljava/lang/String;",
        "setCurrency",
        "(Ljava/lang/String;)V",
        "isExpanded",
        "",
        "fullData",
        "",
        "onGoingClickListener",
        "Lkotlin/Function1;",
        "",
        "onItemClickListener",
        "setOnItemClickListener",
        "callback",
        "setOnGoingItemClickListener",
        "setDataWithLimit",
        "data",
        "toggleExpand",
        "convert",
        "helper",
        "entity",
        "AssetsCenterLib_googleRelease"
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
        "SMAP\nAllocationAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllocationAdapter.kt\ncom/kubi/assets/overview/detail/AllocationAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"
    }
.end annotation


# instance fields
.field public i:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public j:Z

.field public k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public l:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public m:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/assets/R$layout;->asset_coin_detail_allocation_item:I

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iput-object v0, p0, Lcom/kubi/assets/overview/detail/AllocationAdapter;->k:Ljava/util/List;

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
.end method

.method public static synthetic g(Lcom/kubi/assets/overview/detail/AllocationAdapter;Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/overview/detail/AllocationAdapter;->k(Lcom/kubi/assets/overview/detail/AllocationAdapter;Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;)Lkotlin/Unit;

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
.end method

.method public static synthetic h(Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;Lcom/kubi/assets/overview/detail/AllocationAdapter;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/overview/detail/AllocationAdapter;->j(Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;Lcom/kubi/assets/overview/detail/AllocationAdapter;)Lkotlin/Unit;

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
.end method

.method public static final j(Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;Lcom/kubi/assets/overview/detail/AllocationAdapter;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/assets/overview/detail/n0;->a:Lcom/kubi/assets/overview/detail/n0;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;->getBusinessType()Lcom/kubi/assets/entity/CurrencyBusinessDistributionTypeEnum;

    .line 9
    move-result-object v2

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/kubi/assets/entity/CurrencyBusinessDistributionTypeEnum;->getTrackerName()Ljava/lang/String;

    .line 15
    move-result-object v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v2, v1

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v2}, Lcom/kubi/assets/overview/detail/n0;->e(Ljava/lang/String;)V

    .line 25
    .line 26
    iget-object p1, p1, Lcom/kubi/assets/overview/detail/AllocationAdapter;->l:Lkotlin/jvm/functions/Function1;

    .line 27
    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;->getBusinessType()Lcom/kubi/assets/entity/CurrencyBusinessDistributionTypeEnum;

    .line 34
    move-result-object p0

    .line 35
    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/kubi/assets/entity/CurrencyBusinessDistributionTypeEnum;->getTrackerName()Ljava/lang/String;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    :cond_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 46
    return-object p0
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
.end method

.method public static final k(Lcom/kubi/assets/overview/detail/AllocationAdapter;Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/assets/overview/detail/AllocationAdapter;->m:Lkotlin/jvm/functions/Function1;

    .line 3
    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;->getBusinessType()Lcom/kubi/assets/entity/CurrencyBusinessDistributionTypeEnum;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/kubi/assets/entity/CurrencyBusinessDistributionTypeEnum;->getRouteName()Ljava/lang/String;

    .line 16
    move-result-object p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    :cond_1
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
.end method


# virtual methods
.method public bridge synthetic convert(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/overview/detail/AllocationAdapter;->i(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;)V

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
.end method

.method public i(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;)V
    .locals 18
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    sget v5, Lcom/kubi/assets/R$id;->account_name:I

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;->getBusinessType()Lcom/kubi/assets/entity/CurrencyBusinessDistributionTypeEnum;

    .line 18
    move-result-object v6

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v6}, Lcom/kubi/assets/entity/CurrencyBusinessDistributionTypeEnum;->getNickNameRes()I

    .line 24
    move-result v6

    .line 25
    .line 26
    sget-object v7, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 27
    .line 28
    new-array v8, v3, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v7, v6, v8}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    move-result-object v6

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v6, v4

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-virtual {v1, v5, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 38
    .line 39
    :cond_1
    if-eqz v1, :cond_4

    .line 40
    .line 41
    sget v5, Lcom/kubi/assets/R$id;->circular_view:I

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 45
    move-result-object v5

    .line 46
    .line 47
    check-cast v5, Lcom/kubi/assets/overview/detail/CircularProgressView;

    .line 48
    .line 49
    if-eqz v5, :cond_4

    .line 50
    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;->getProportion()Ljava/math/BigDecimal;

    .line 55
    move-result-object v6

    .line 56
    .line 57
    if-eqz v6, :cond_2

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6}, Ljava/math/BigDecimal;->floatValue()F

    .line 61
    move-result v6

    .line 62
    .line 63
    .line 64
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 65
    move-result-object v6

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    move-object v6, v4

    .line 68
    :goto_1
    const/4 v7, 0x0

    .line 69
    const/4 v8, 0x1

    .line 70
    .line 71
    .line 72
    invoke-static {v6, v7, v8, v4}, Lcom/kubi/utils/extensions/d;->i(Ljava/lang/Float;FILjava/lang/Object;)F

    .line 73
    move-result v6

    .line 74
    .line 75
    if-eqz v2, :cond_3

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;->getTotalAmount()Ljava/math/BigDecimal;

    .line 79
    move-result-object v7

    .line 80
    goto :goto_2

    .line 81
    :cond_3
    move-object v7, v4

    .line 82
    .line 83
    .line 84
    :goto_2
    invoke-virtual {v5, v6, v7}, Lcom/kubi/assets/overview/detail/CircularProgressView;->a(FLjava/math/BigDecimal;)V

    .line 85
    .line 86
    :cond_4
    if-eqz v2, :cond_5

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;->getBusinessType()Lcom/kubi/assets/entity/CurrencyBusinessDistributionTypeEnum;

    .line 90
    move-result-object v5

    .line 91
    .line 92
    if-eqz v5, :cond_5

    .line 93
    .line 94
    .line 95
    invoke-virtual {v5}, Lcom/kubi/assets/entity/CurrencyBusinessDistributionTypeEnum;->getColorString()Ljava/lang/String;

    .line 96
    move-result-object v5

    .line 97
    .line 98
    if-eqz v5, :cond_5

    .line 99
    .line 100
    if-eqz v1, :cond_5

    .line 101
    .line 102
    sget v6, Lcom/kubi/assets/R$id;->circular_view:I

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 106
    move-result-object v6

    .line 107
    .line 108
    check-cast v6, Lcom/kubi/assets/overview/detail/CircularProgressView;

    .line 109
    .line 110
    if-eqz v6, :cond_5

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6, v5}, Lcom/kubi/assets/overview/detail/CircularProgressView;->setProgressColor(Ljava/lang/String;)V

    .line 114
    .line 115
    :cond_5
    const-string v5, "--"

    .line 116
    .line 117
    if-eqz v1, :cond_7

    .line 118
    .line 119
    sget v6, Lcom/kubi/assets/R$id;->coin_amount:I

    .line 120
    .line 121
    if-eqz v2, :cond_6

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;->getTotalAmount()Ljava/math/BigDecimal;

    .line 125
    move-result-object v7

    .line 126
    .line 127
    if-eqz v7, :cond_6

    .line 128
    .line 129
    iget-object v8, v0, Lcom/kubi/assets/overview/detail/AllocationAdapter;->i:Ljava/lang/String;

    .line 130
    const/4 v9, 0x2

    .line 131
    .line 132
    .line 133
    invoke-static {v7, v8, v3, v9, v4}, Lgf/i;->b(Ljava/math/BigDecimal;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 134
    move-result-object v7

    .line 135
    goto :goto_3

    .line 136
    :cond_6
    move-object v7, v4

    .line 137
    .line 138
    .line 139
    :goto_3
    invoke-static {v7, v5}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 140
    move-result-object v7

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, v6, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 144
    .line 145
    :cond_7
    if-eqz v1, :cond_a

    .line 146
    .line 147
    sget v6, Lcom/kubi/assets/R$id;->coin_value:I

    .line 148
    .line 149
    if-eqz v2, :cond_9

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2}, Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;->getTotalAmount()Ljava/math/BigDecimal;

    .line 153
    move-result-object v7

    .line 154
    .line 155
    if-eqz v7, :cond_9

    .line 156
    .line 157
    iget-object v8, v0, Lcom/kubi/assets/overview/detail/AllocationAdapter;->i:Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    invoke-static {v7, v8}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 161
    move-result-wide v7

    .line 162
    .line 163
    new-instance v9, Ljava/math/BigDecimal;

    .line 164
    .line 165
    .line 166
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 167
    move-result-object v7

    .line 168
    .line 169
    .line 170
    invoke-direct {v9, v7}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    const/16 v16, 0xf

    .line 173
    .line 174
    const/16 v17, 0x0

    .line 175
    const/4 v10, 0x0

    .line 176
    const/4 v11, 0x0

    .line 177
    const/4 v12, 0x0

    .line 178
    const/4 v13, 0x0

    .line 179
    const/4 v14, 0x1

    .line 180
    const/4 v15, 0x1

    .line 181
    .line 182
    .line 183
    invoke-static/range {v9 .. v17}, Lkf/a;->g(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 184
    move-result-object v7

    .line 185
    .line 186
    if-nez v7, :cond_8

    .line 187
    goto :goto_4

    .line 188
    :cond_8
    move-object v5, v7

    .line 189
    .line 190
    .line 191
    :cond_9
    :goto_4
    invoke-virtual {v1, v6, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 192
    .line 193
    :cond_a
    if-eqz v1, :cond_b

    .line 194
    .line 195
    sget v5, Lcom/kubi/assets/R$id;->ongoing_label:I

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 199
    move-result-object v5

    .line 200
    .line 201
    check-cast v5, Lcom/kubi/sdk/widget/shape/view/ShapeTextView;

    .line 202
    move-object v6, v5

    .line 203
    goto :goto_5

    .line 204
    :cond_b
    move-object v6, v4

    .line 205
    .line 206
    :goto_5
    if-eqz v6, :cond_d

    .line 207
    .line 208
    if-eqz v2, :cond_c

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2}, Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;->isShowOnGoing()Ljava/lang/Boolean;

    .line 212
    move-result-object v5

    .line 213
    goto :goto_6

    .line 214
    :cond_c
    move-object v5, v4

    .line 215
    .line 216
    .line 217
    :goto_6
    invoke-static {v5}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 218
    move-result v5

    .line 219
    .line 220
    .line 221
    invoke-static {v6, v5}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 222
    .line 223
    :cond_d
    if-eqz v2, :cond_e

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2}, Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;->getOnGoingCount()Ljava/lang/Integer;

    .line 227
    move-result-object v4

    .line 228
    .line 229
    :cond_e
    if-eqz v4, :cond_f

    .line 230
    .line 231
    if-eqz v6, :cond_f

    .line 232
    .line 233
    new-instance v4, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 237
    .line 238
    sget-object v5, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 239
    .line 240
    sget v7, Lcom/kubi/assets/R$string;->kc_assets_ongoing:I

    .line 241
    .line 242
    new-array v3, v3, [Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v5, v7, v3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 246
    move-result-object v3

    .line 247
    .line 248
    .line 249
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    const-string v3, ": "

    .line 252
    .line 253
    .line 254
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2}, Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;->getOnGoingCount()Ljava/lang/Integer;

    .line 258
    move-result-object v3

    .line 259
    .line 260
    .line 261
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 265
    move-result-object v3

    .line 266
    .line 267
    .line 268
    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 269
    .line 270
    :cond_f
    if-eqz v6, :cond_10

    .line 271
    .line 272
    new-instance v9, Lcom/kubi/assets/overview/detail/a;

    .line 273
    .line 274
    .line 275
    invoke-direct {v9, v2, v0}, Lcom/kubi/assets/overview/detail/a;-><init>(Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;Lcom/kubi/assets/overview/detail/AllocationAdapter;)V

    .line 276
    const/4 v10, 0x1

    .line 277
    const/4 v11, 0x0

    .line 278
    .line 279
    const-wide/16 v7, 0x0

    .line 280
    .line 281
    .line 282
    invoke-static/range {v6 .. v11}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 283
    .line 284
    :cond_10
    if-eqz v1, :cond_11

    .line 285
    .line 286
    sget v3, Lcom/kubi/assets/R$id;->root_layout:I

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 290
    move-result-object v4

    .line 291
    .line 292
    if-eqz v4, :cond_11

    .line 293
    .line 294
    new-instance v7, Lcom/kubi/assets/overview/detail/b;

    .line 295
    .line 296
    .line 297
    invoke-direct {v7, v0, v2}, Lcom/kubi/assets/overview/detail/b;-><init>(Lcom/kubi/assets/overview/detail/AllocationAdapter;Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;)V

    .line 298
    const/4 v8, 0x1

    .line 299
    const/4 v9, 0x0

    .line 300
    .line 301
    const-wide/16 v5, 0x0

    .line 302
    .line 303
    .line 304
    invoke-static/range {v4 .. v9}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 305
    :cond_11
    return-void
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
.end method

.method public final l(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/overview/detail/AllocationAdapter;->i:Ljava/lang/String;

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
.end method

.method public final m(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "data"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/assets/overview/detail/AllocationAdapter;->k:Ljava/util/List;

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x3

    .line 13
    .line 14
    if-le v0, v1, :cond_0

    .line 15
    .line 16
    iget-boolean v0, p0, Lcom/kubi/assets/overview/detail/AllocationAdapter;->j:Z

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    .line 30
    .line 31
    sget-object v0, Lcom/kubi/assets/overview/detail/n0;->a:Lcom/kubi/assets/overview/detail/n0;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lcom/kubi/assets/overview/detail/n0;->f(Ljava/util/List;)V

    .line 35
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public final n(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "callback"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/assets/overview/detail/AllocationAdapter;->l:Lkotlin/jvm/functions/Function1;

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
.end method

.method public final o(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "callback"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/assets/overview/detail/AllocationAdapter;->m:Lkotlin/jvm/functions/Function1;

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
.end method

.method public final p()V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/assets/overview/detail/AllocationAdapter;->j:Z

    .line 3
    .line 4
    xor-int/lit8 v1, v0, 0x1

    .line 5
    .line 6
    iput-boolean v1, p0, Lcom/kubi/assets/overview/detail/AllocationAdapter;->j:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/kubi/assets/overview/detail/AllocationAdapter;->k:Ljava/util/List;

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/kubi/assets/overview/detail/AllocationAdapter;->k:Ljava/util/List;

    .line 14
    const/4 v1, 0x3

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    .line 26
    return-void
    .line 27
.end method
