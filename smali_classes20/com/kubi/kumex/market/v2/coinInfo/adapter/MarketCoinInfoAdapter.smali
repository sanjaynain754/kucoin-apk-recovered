.class public final Lcom/kubi/kumex/market/v2/coinInfo/adapter/MarketCoinInfoAdapter;
.super Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;
.source "MarketCoinInfoAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter<",
        "Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00032\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0003J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0018\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0002\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/kubi/kumex/market/v2/coinInfo/adapter/MarketCoinInfoAdapter;",
        "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;",
        "Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "<init>",
        "()V",
        "convert",
        "",
        "helper",
        "item",
        "convertIntro",
        "convertFAQ",
        "convertMore",
        "KumexLib_googleRelease"
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
        "SMAP\nMarketCoinInfoAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketCoinInfoAdapter.kt\ncom/kubi/kumex/market/v2/coinInfo/adapter/MarketCoinInfoAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,224:1\n1869#2,2:225\n827#2:232\n855#2,2:233\n827#2:235\n855#2,2:236\n827#2:238\n855#2,2:239\n827#2:241\n855#2,2:242\n774#2:244\n865#2,2:245\n1#3:227\n172#4,2:228\n172#4,2:230\n*S KotlinDebug\n*F\n+ 1 MarketCoinInfoAdapter.kt\ncom/kubi/kumex/market/v2/coinInfo/adapter/MarketCoinInfoAdapter\n*L\n91#1:225,2\n177#1:232\n177#1:233,2\n183#1:235\n183#1:236,2\n189#1:238\n189#1:239,2\n195#1:241\n195#1:242,2\n201#1:244\n201#1:245,2\n151#1:228,2\n156#1:230,2\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;-><init>(Ljava/util/List;)V

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    sget v1, Lcom/kubi/kumex/R$layout;->bkumex_item_coin_info_intro:I

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 11
    const/4 v0, 0x1

    .line 12
    .line 13
    sget v1, Lcom/kubi/kumex/R$layout;->bkumex_item_coin_info_faq:I

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 17
    const/4 v0, 0x3

    .line 18
    .line 19
    sget v1, Lcom/kubi/kumex/R$layout;->bkumex_item_coin_info_more:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0, v1}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 23
    return-void
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

.method public static synthetic g(Ljava/lang/String;I)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/kumex/market/v2/coinInfo/adapter/MarketCoinInfoAdapter;->n(Ljava/lang/String;I)Lkotlin/Unit;

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
.end method

.method public static synthetic h(Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/kumex/market/v2/coinInfo/adapter/MarketCoinInfoAdapter;->l(Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;Landroid/view/View;)V

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
.end method

.method public static final l(Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;Landroid/view/View;)V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/BaseActivity;->Companion:Lcom/kubi/sdk/BaseActivity$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    const-string v1, "getContext(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;->getBaseCurrency()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    const-string v2, "coin"

    .line 18
    .line 19
    .line 20
    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    const-string v2, "data"

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;->getInfo()Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;

    .line 27
    move-result-object p0

    .line 28
    .line 29
    .line 30
    invoke-static {v2, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 31
    move-result-object p0

    .line 32
    .line 33
    .line 34
    filled-new-array {v1, p0}, [Lkotlin/Pair;

    .line 35
    move-result-object p0

    .line 36
    .line 37
    .line 38
    invoke-static {p0}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 39
    move-result-object p0

    .line 40
    .line 41
    const-class v1, Lcom/kubi/kumex/market/v2/coinInfo/KuMexMarketCoinInfoDetailFragment;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p1, v1, p0}, Lcom/kubi/sdk/BaseActivity$Companion;->launch(Landroid/content/Context;Ljava/lang/Class;Landroid/os/Bundle;)V

    .line 45
    return-void
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
.end method

.method public static final n(Ljava/lang/String;I)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    const-string p1, "url"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    move-result p1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    return-object p0

    .line 15
    :cond_0
    const/4 p1, 0x2

    .line 16
    const/4 v0, 0x0

    .line 17
    .line 18
    const-string v1, "http"

    .line 19
    const/4 v2, 0x0

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v1, v2, p1, v0}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 23
    move-result p1

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    new-instance p1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    const-string v0, "https://"

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    move-result-object p0

    .line 43
    .line 44
    :cond_1
    sget-object p1, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 45
    .line 46
    .line 47
    invoke-static {p0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 48
    move-result-object p0

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    move-result-object p0

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p0}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 56
    move-result-object p0

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lay/a;->k()Z

    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 62
    return-object p0
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
.end method


# virtual methods
.method public bridge synthetic convert(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/kumex/market/v2/coinInfo/adapter/MarketCoinInfoAdapter;->i(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;)V

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
.end method

.method public i(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;)V
    .locals 2
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-eqz p1, :cond_4

    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p2}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;->getItemType()I

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    const/4 v1, 0x1

    .line 13
    .line 14
    if-eq v0, v1, :cond_2

    .line 15
    const/4 v1, 0x3

    .line 16
    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    goto :goto_0

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/kubi/kumex/market/v2/coinInfo/adapter/MarketCoinInfoAdapter;->m(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;)V

    .line 22
    return-void

    .line 23
    .line 24
    .line 25
    :cond_2
    invoke-virtual {p0, p1, p2}, Lcom/kubi/kumex/market/v2/coinInfo/adapter/MarketCoinInfoAdapter;->j(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;)V

    .line 26
    return-void

    .line 27
    .line 28
    .line 29
    :cond_3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/kumex/market/v2/coinInfo/adapter/MarketCoinInfoAdapter;->k(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;)V

    .line 30
    :cond_4
    :goto_0
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
.end method

.method public final j(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;)V
    .locals 4

    .line 1
    .line 2
    sget v0, Lcom/kubi/kumex/R$id;->cl_root:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 9
    .line 10
    sget v1, Lcom/kubi/kumex/R$id;->tv_title:I

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    check-cast v1, Landroid/widget/TextView;

    .line 17
    .line 18
    sget v2, Lcom/kubi/kumex/R$id;->rv:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;->getInfo()Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;

    .line 28
    move-result-object p2

    .line 29
    const/4 v2, 0x0

    .line 30
    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;->getFaqs()Ljava/util/List;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 41
    move-result v3

    .line 42
    .line 43
    if-eqz v3, :cond_0

    .line 44
    goto :goto_0

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 63
    .line 64
    const/high16 v1, 0x41800000    # 16.0f

    .line 65
    .line 66
    .line 67
    invoke-static {v1}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 68
    move-result v1

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    if-nez v0, :cond_1

    .line 78
    const/4 v0, 0x1

    .line 79
    const/4 v1, 0x0

    .line 80
    .line 81
    .line 82
    invoke-static {p1, v2, v0, v1}, Lcom/kubi/resources/t;->h(Landroidx/recyclerview/widget/RecyclerView;ZILjava/lang/Object;)V

    .line 83
    .line 84
    new-instance v0, Lcom/kubi/kumex/market/v2/coinInfo/adapter/MarketCoinInfoFAQAdapter;

    .line 85
    .line 86
    .line 87
    invoke-direct {v0}, Lcom/kubi/kumex/market/v2/coinInfo/adapter/MarketCoinInfoFAQAdapter;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;->getFaqs()Ljava/util/List;

    .line 94
    move-result-object p1

    .line 95
    .line 96
    .line 97
    invoke-static {p1}, Lcom/kubi/utils/extensions/b;->c(Ljava/util/List;)Ljava/util/List;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, p1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 102
    :cond_1
    return-void

    .line 103
    .line 104
    .line 105
    :cond_2
    :goto_0
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-static {v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 109
    .line 110
    .line 111
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v2, v2, v2, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 124
    return-void
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
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
.end method

.method public final k(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;)V
    .locals 24
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    .line 5
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;->getInfo()Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    sget v2, Lcom/kubi/kumex/R$id;->iv_icon:I

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    check-cast v2, Landroid/widget/ImageView;

    .line 18
    .line 19
    sget v3, Lcom/kubi/kumex/R$id;->tv_name:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 23
    move-result-object v3

    .line 24
    .line 25
    check-cast v3, Landroid/widget/TextView;

    .line 26
    .line 27
    sget v4, Lcom/kubi/kumex/R$id;->tv_rank:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 31
    move-result-object v4

    .line 32
    .line 33
    check-cast v4, Landroid/widget/TextView;

    .line 34
    .line 35
    sget v5, Lcom/kubi/kumex/R$id;->tv_market_value:I

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 39
    move-result-object v5

    .line 40
    .line 41
    check-cast v5, Landroid/widget/TextView;

    .line 42
    .line 43
    sget v6, Lcom/kubi/kumex/R$id;->tv_max_supply:I

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 47
    move-result-object v6

    .line 48
    .line 49
    check-cast v6, Landroid/widget/TextView;

    .line 50
    .line 51
    sget v7, Lcom/kubi/kumex/R$id;->tv_circulating:I

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 55
    move-result-object v7

    .line 56
    .line 57
    check-cast v7, Landroid/widget/TextView;

    .line 58
    .line 59
    sget v8, Lcom/kubi/kumex/R$id;->tv_ath:I

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 63
    move-result-object v8

    .line 64
    .line 65
    check-cast v8, Landroid/widget/TextView;

    .line 66
    .line 67
    sget v9, Lcom/kubi/kumex/R$id;->ll_expand:I

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v9}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 71
    move-result-object v9

    .line 72
    .line 73
    check-cast v9, Landroid/widget/HorizontalScrollView;

    .line 74
    .line 75
    sget v10, Lcom/kubi/kumex/R$id;->ll_tag:I

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v10}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 79
    move-result-object v10

    .line 80
    move-object v11, v10

    .line 81
    .line 82
    check-cast v11, Landroid/widget/LinearLayout;

    .line 83
    .line 84
    sget v10, Lcom/kubi/kumex/R$id;->tv_title:I

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v10}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 88
    move-result-object v10

    .line 89
    .line 90
    check-cast v10, Landroid/widget/TextView;

    .line 91
    .line 92
    sget v12, Lcom/kubi/kumex/R$id;->tv_content:I

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v12}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    check-cast v0, Lcom/kubi/resources/widget/SuffixTextView;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;->getLogo()Ljava/lang/String;

    .line 102
    move-result-object v12

    .line 103
    .line 104
    if-eqz v12, :cond_2

    .line 105
    .line 106
    .line 107
    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    .line 108
    move-result v12

    .line 109
    .line 110
    if-nez v12, :cond_1

    .line 111
    goto :goto_0

    .line 112
    .line 113
    .line 114
    :cond_1
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 115
    move-result-object v12

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;->getLogo()Ljava/lang/String;

    .line 119
    move-result-object v13

    .line 120
    .line 121
    .line 122
    invoke-static {v12, v13, v2}, Lcom/kubi/sdk/util/v;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 123
    .line 124
    :cond_2
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;->getCoinName()Ljava/lang/String;

    .line 131
    move-result-object v12

    .line 132
    .line 133
    .line 134
    invoke-static {v12}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    move-result-object v12

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    const/16 v12, 0x28

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;->getBaseCurrency()Ljava/lang/String;

    .line 147
    move-result-object v12

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    const/16 v12, 0x29

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    move-result-object v2

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;->getTags()Lcom/kubi/kumex/market/v2/coinInfo/entity/TagEntity;

    .line 166
    move-result-object v2

    .line 167
    const/4 v3, 0x1

    .line 168
    .line 169
    if-eqz v2, :cond_4

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2}, Lcom/kubi/kumex/market/v2/coinInfo/entity/TagEntity;->getPlates()Ljava/util/List;

    .line 173
    move-result-object v13

    .line 174
    .line 175
    if-eqz v13, :cond_4

    .line 176
    .line 177
    .line 178
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 179
    move-result-object v2

    .line 180
    .line 181
    .line 182
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    move-result v12

    .line 184
    .line 185
    if-eqz v12, :cond_3

    .line 186
    .line 187
    .line 188
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    move-result-object v12

    .line 190
    .line 191
    check-cast v12, Lcom/kubi/kumex/market/v2/coinInfo/entity/Tag;

    .line 192
    .line 193
    .line 194
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    move-result-object v14

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12, v14}, Lcom/kubi/kumex/market/v2/coinInfo/entity/Tag;->setDisplayType(Ljava/lang/Integer;)V

    .line 199
    goto :goto_1

    .line 200
    .line 201
    .line 202
    :cond_3
    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 203
    .line 204
    move-object/from16 v2, p0

    .line 205
    .line 206
    iget-object v12, v2, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 207
    .line 208
    const-string v14, "mContext"

    .line 209
    .line 210
    .line 211
    invoke-static {v12, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    const/4 v15, 0x4

    .line 213
    .line 214
    const/16 v16, 0x0

    .line 215
    const/4 v14, 0x0

    .line 216
    .line 217
    .line 218
    invoke-static/range {v11 .. v16}, Lcom/kubi/kumex/market/v2/coinInfo/x;->f(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    invoke-static {v9}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 225
    goto :goto_2

    .line 226
    .line 227
    :cond_4
    move-object/from16 v2, p0

    .line 228
    .line 229
    .line 230
    :goto_2
    invoke-virtual {v1}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;->getRank()Ljava/lang/String;

    .line 231
    move-result-object v9

    .line 232
    .line 233
    const-string v11, "--"

    .line 234
    .line 235
    if-eqz v9, :cond_5

    .line 236
    .line 237
    new-instance v12, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 241
    .line 242
    const/16 v13, 0x23

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    move-result-object v9

    .line 253
    .line 254
    if-eqz v9, :cond_5

    .line 255
    goto :goto_3

    .line 256
    :cond_5
    move-object v9, v11

    .line 257
    .line 258
    .line 259
    :goto_3
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v1}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;->getMarketCap()Ljava/lang/String;

    .line 263
    move-result-object v4

    .line 264
    .line 265
    .line 266
    invoke-static {v4}, Lcom/kubi/utils/extensions/DowngradeExKt;->f(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 267
    move-result-object v4

    .line 268
    .line 269
    const-string v9, "USD"

    .line 270
    const/4 v12, 0x0

    .line 271
    .line 272
    if-eqz v4, :cond_6

    .line 273
    .line 274
    .line 275
    invoke-static {v4, v9}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 276
    move-result-wide v13

    .line 277
    .line 278
    new-instance v4, Ljava/math/BigDecimal;

    .line 279
    .line 280
    .line 281
    invoke-static {v13, v14}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 282
    move-result-object v13

    .line 283
    .line 284
    .line 285
    invoke-direct {v4, v13}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 286
    goto :goto_4

    .line 287
    :cond_6
    move-object v4, v12

    .line 288
    .line 289
    .line 290
    :goto_4
    invoke-static {v4, v3}, Lkf/a;->d(Ljava/math/BigDecimal;Z)Ljava/lang/String;

    .line 291
    move-result-object v4

    .line 292
    .line 293
    .line 294
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v1}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;->getMaxSupply()Ljava/lang/String;

    .line 298
    move-result-object v4

    .line 299
    .line 300
    .line 301
    invoke-static {v4}, Lcom/kubi/utils/extensions/DowngradeExKt;->f(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 302
    move-result-object v4

    .line 303
    const/4 v5, 0x0

    .line 304
    .line 305
    .line 306
    invoke-static {v4, v5, v3, v12}, Lkf/a;->e(Ljava/math/BigDecimal;ZILjava/lang/Object;)Ljava/lang/String;

    .line 307
    move-result-object v4

    .line 308
    .line 309
    .line 310
    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v1}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;->getCirculatingSupply()Ljava/lang/String;

    .line 314
    move-result-object v4

    .line 315
    .line 316
    .line 317
    invoke-static {v4}, Lcom/kubi/utils/extensions/DowngradeExKt;->f(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 318
    move-result-object v4

    .line 319
    .line 320
    .line 321
    invoke-static {v4, v5, v3, v12}, Lkf/a;->e(Ljava/math/BigDecimal;ZILjava/lang/Object;)Ljava/lang/String;

    .line 322
    move-result-object v4

    .line 323
    .line 324
    .line 325
    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v1}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;->getAth()Ljava/lang/String;

    .line 329
    move-result-object v4

    .line 330
    .line 331
    .line 332
    invoke-static {v4}, Lcom/kubi/utils/extensions/DowngradeExKt;->f(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 333
    move-result-object v4

    .line 334
    .line 335
    if-eqz v4, :cond_7

    .line 336
    .line 337
    .line 338
    invoke-static {v4, v9}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 339
    move-result-wide v13

    .line 340
    .line 341
    const/16 v22, 0x5f

    .line 342
    .line 343
    const/16 v23, 0x0

    .line 344
    const/4 v15, 0x0

    .line 345
    .line 346
    const/16 v16, 0x0

    .line 347
    .line 348
    const/16 v17, 0x0

    .line 349
    .line 350
    const/16 v18, 0x0

    .line 351
    .line 352
    const/16 v19, 0x0

    .line 353
    .line 354
    const/16 v20, 0x1

    .line 355
    .line 356
    const/16 v21, 0x0

    .line 357
    .line 358
    .line 359
    invoke-static/range {v13 .. v23}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 360
    move-result-object v4

    .line 361
    goto :goto_5

    .line 362
    :cond_7
    move-object v4, v12

    .line 363
    .line 364
    .line 365
    :goto_5
    invoke-static {v4, v11}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 366
    move-result-object v4

    .line 367
    .line 368
    .line 369
    invoke-virtual {v8, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v1}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;->getCurrencyIntroduction()Ljava/util/List;

    .line 373
    move-result-object v4

    .line 374
    .line 375
    if-eqz v4, :cond_d

    .line 376
    .line 377
    .line 378
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 379
    move-result v4

    .line 380
    .line 381
    if-eqz v4, :cond_8

    .line 382
    goto :goto_8

    .line 383
    .line 384
    .line 385
    :cond_8
    invoke-virtual {v1}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;->getIntroFirstTitleIndex()I

    .line 386
    move-result v4

    .line 387
    const/4 v6, -0x1

    .line 388
    .line 389
    if-ne v4, v6, :cond_9

    .line 390
    .line 391
    .line 392
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    invoke-static {v10}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 396
    goto :goto_6

    .line 397
    .line 398
    .line 399
    :cond_9
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    invoke-static {v10}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v1}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;->getCurrencyIntroduction()Ljava/util/List;

    .line 406
    move-result-object v6

    .line 407
    .line 408
    .line 409
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 410
    move-result-object v6

    .line 411
    .line 412
    check-cast v6, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfoParagraph;

    .line 413
    .line 414
    if-eqz v6, :cond_a

    .line 415
    .line 416
    .line 417
    invoke-virtual {v6}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfoParagraph;->getText()Ljava/lang/String;

    .line 418
    move-result-object v12

    .line 419
    .line 420
    .line 421
    :cond_a
    invoke-virtual {v10, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 422
    .line 423
    :goto_6
    sget-object v6, Lcom/kubi/kumex/market/v2/coinInfo/c;->a:Lcom/kubi/kumex/market/v2/coinInfo/c;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v1}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;->getCurrencyIntroduction()Ljava/util/List;

    .line 427
    move-result-object v7

    .line 428
    .line 429
    .line 430
    invoke-virtual {v6, v7, v4}, Lcom/kubi/kumex/market/v2/coinInfo/c;->i(Ljava/util/List;I)Landroid/text/SpannableStringBuilder;

    .line 431
    move-result-object v4

    .line 432
    .line 433
    .line 434
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 435
    move-result v6

    .line 436
    .line 437
    if-nez v6, :cond_b

    .line 438
    .line 439
    .line 440
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 444
    return-void

    .line 445
    .line 446
    .line 447
    :cond_b
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 451
    .line 452
    .line 453
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 454
    move-result-object v6

    .line 455
    .line 456
    .line 457
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v1}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;->getIntroTitleNum()I

    .line 464
    move-result v1

    .line 465
    .line 466
    if-le v1, v3, :cond_c

    .line 467
    goto :goto_7

    .line 468
    :cond_c
    move v3, v5

    .line 469
    .line 470
    .line 471
    :goto_7
    invoke-virtual {v0, v3}, Lcom/kubi/resources/widget/SuffixTextView;->k(Z)V

    .line 472
    .line 473
    new-instance v1, Llm/b;

    .line 474
    .line 475
    move-object/from16 v3, p2

    .line 476
    .line 477
    .line 478
    invoke-direct {v1, v3}, Llm/b;-><init>(Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/SuffixTextView;->onMoreClick(Landroid/view/View$OnClickListener;)V

    .line 482
    return-void

    .line 483
    .line 484
    .line 485
    :cond_d
    :goto_8
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    invoke-static {v10}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 489
    .line 490
    .line 491
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 492
    .line 493
    .line 494
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 495
    return-void
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
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
.end method

.method public final m(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;)V
    .locals 17

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;->getInfo()Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    sget v3, Lcom/kubi/kumex/R$id;->layout_website:I

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 14
    move-result-object v3

    .line 15
    move-object v6, v3

    .line 16
    .line 17
    check-cast v6, Landroid/widget/LinearLayout;

    .line 18
    .line 19
    sget v3, Lcom/kubi/kumex/R$id;->layout_doc:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 23
    move-result-object v3

    .line 24
    .line 25
    check-cast v3, Landroid/widget/LinearLayout;

    .line 26
    .line 27
    sget v4, Lcom/kubi/kumex/R$id;->layout_explorer:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 31
    move-result-object v4

    .line 32
    move-object v14, v4

    .line 33
    .line 34
    check-cast v14, Landroid/widget/LinearLayout;

    .line 35
    .line 36
    sget v4, Lcom/kubi/kumex/R$id;->layout_contract:I

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 40
    move-result-object v4

    .line 41
    move-object v15, v4

    .line 42
    .line 43
    check-cast v15, Landroid/widget/LinearLayout;

    .line 44
    .line 45
    sget v4, Lcom/kubi/kumex/R$id;->layout_community:I

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    check-cast v1, Lcom/google/android/flexbox/FlexboxLayout;

    .line 52
    .line 53
    const/16 v16, 0x0

    .line 54
    .line 55
    if-eqz v2, :cond_3

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;->getWebsite()Ljava/util/List;

    .line 59
    move-result-object v4

    .line 60
    .line 61
    if-eqz v4, :cond_3

    .line 62
    .line 63
    new-instance v5, Ljava/util/ArrayList;

    .line 64
    .line 65
    .line 66
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    move-result-object v4

    .line 71
    .line 72
    .line 73
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    move-result v7

    .line 75
    .line 76
    if-eqz v7, :cond_2

    .line 77
    .line 78
    .line 79
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    move-result-object v7

    .line 81
    move-object v8, v7

    .line 82
    .line 83
    check-cast v8, Ljava/lang/String;

    .line 84
    .line 85
    if-eqz v8, :cond_0

    .line 86
    .line 87
    .line 88
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 89
    move-result v8

    .line 90
    .line 91
    if-nez v8, :cond_1

    .line 92
    goto :goto_0

    .line 93
    .line 94
    .line 95
    :cond_1
    invoke-interface {v5, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 96
    goto :goto_0

    .line 97
    :cond_2
    move-object v7, v5

    .line 98
    goto :goto_1

    .line 99
    .line 100
    :cond_3
    move-object/from16 v7, v16

    .line 101
    .line 102
    :goto_1
    const-string v11, "mContext"

    .line 103
    .line 104
    if-eqz v7, :cond_5

    .line 105
    .line 106
    .line 107
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 108
    move-result v4

    .line 109
    .line 110
    if-eqz v4, :cond_4

    .line 111
    goto :goto_2

    .line 112
    .line 113
    :cond_4
    sget-object v4, Lcom/kubi/kumex/market/v2/coinInfo/c;->a:Lcom/kubi/kumex/market/v2/coinInfo/c;

    .line 114
    .line 115
    iget-object v5, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 116
    .line 117
    .line 118
    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 122
    .line 123
    const/16 v9, 0x8

    .line 124
    const/4 v10, 0x0

    .line 125
    const/4 v8, 0x0

    .line 126
    .line 127
    .line 128
    invoke-static/range {v4 .. v10}, Lcom/kubi/kumex/market/v2/coinInfo/c;->g(Lcom/kubi/kumex/market/v2/coinInfo/c;Landroid/content/Context;Landroid/widget/LinearLayout;Ljava/util/List;ZILjava/lang/Object;)V

    .line 129
    goto :goto_3

    .line 130
    .line 131
    :cond_5
    :goto_2
    sget-object v4, Lcom/kubi/kumex/market/v2/coinInfo/c;->a:Lcom/kubi/kumex/market/v2/coinInfo/c;

    .line 132
    .line 133
    iget-object v5, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 134
    .line 135
    .line 136
    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4, v5, v6}, Lcom/kubi/kumex/market/v2/coinInfo/c;->e(Landroid/content/Context;Landroid/view/ViewGroup;)V

    .line 143
    .line 144
    :goto_3
    if-eqz v2, :cond_9

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;->getDoc()Ljava/util/List;

    .line 148
    move-result-object v4

    .line 149
    .line 150
    if-eqz v4, :cond_9

    .line 151
    .line 152
    new-instance v5, Ljava/util/ArrayList;

    .line 153
    .line 154
    .line 155
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 159
    move-result-object v4

    .line 160
    .line 161
    .line 162
    :cond_6
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    move-result v6

    .line 164
    .line 165
    if-eqz v6, :cond_8

    .line 166
    .line 167
    .line 168
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    move-result-object v6

    .line 170
    move-object v7, v6

    .line 171
    .line 172
    check-cast v7, Ljava/lang/String;

    .line 173
    .line 174
    if-eqz v7, :cond_6

    .line 175
    .line 176
    .line 177
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 178
    move-result v7

    .line 179
    .line 180
    if-nez v7, :cond_7

    .line 181
    goto :goto_4

    .line 182
    .line 183
    .line 184
    :cond_7
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 185
    goto :goto_4

    .line 186
    :cond_8
    move-object v10, v5

    .line 187
    goto :goto_5

    .line 188
    .line 189
    :cond_9
    move-object/from16 v10, v16

    .line 190
    .line 191
    :goto_5
    if-eqz v10, :cond_a

    .line 192
    .line 193
    .line 194
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 195
    move-result v4

    .line 196
    .line 197
    if-eqz v4, :cond_b

    .line 198
    :cond_a
    move-object v9, v3

    .line 199
    move-object v4, v11

    .line 200
    goto :goto_6

    .line 201
    .line 202
    :cond_b
    sget-object v7, Lcom/kubi/kumex/market/v2/coinInfo/c;->a:Lcom/kubi/kumex/market/v2/coinInfo/c;

    .line 203
    .line 204
    iget-object v8, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 205
    .line 206
    .line 207
    invoke-static {v8, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 211
    .line 212
    const/16 v12, 0x8

    .line 213
    const/4 v13, 0x0

    .line 214
    move-object v4, v11

    .line 215
    const/4 v11, 0x0

    .line 216
    move-object v9, v3

    .line 217
    .line 218
    .line 219
    invoke-static/range {v7 .. v13}, Lcom/kubi/kumex/market/v2/coinInfo/c;->g(Lcom/kubi/kumex/market/v2/coinInfo/c;Landroid/content/Context;Landroid/widget/LinearLayout;Ljava/util/List;ZILjava/lang/Object;)V

    .line 220
    goto :goto_7

    .line 221
    .line 222
    :goto_6
    sget-object v3, Lcom/kubi/kumex/market/v2/coinInfo/c;->a:Lcom/kubi/kumex/market/v2/coinInfo/c;

    .line 223
    .line 224
    iget-object v5, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 225
    .line 226
    .line 227
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v3, v5, v9}, Lcom/kubi/kumex/market/v2/coinInfo/c;->e(Landroid/content/Context;Landroid/view/ViewGroup;)V

    .line 234
    .line 235
    :goto_7
    if-eqz v2, :cond_f

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;->getExplorer()Ljava/util/List;

    .line 239
    move-result-object v3

    .line 240
    .line 241
    if-eqz v3, :cond_f

    .line 242
    .line 243
    new-instance v5, Ljava/util/ArrayList;

    .line 244
    .line 245
    .line 246
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 247
    .line 248
    .line 249
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 250
    move-result-object v3

    .line 251
    .line 252
    .line 253
    :cond_c
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 254
    move-result v6

    .line 255
    .line 256
    if-eqz v6, :cond_e

    .line 257
    .line 258
    .line 259
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 260
    move-result-object v6

    .line 261
    move-object v7, v6

    .line 262
    .line 263
    check-cast v7, Ljava/lang/String;

    .line 264
    .line 265
    if-eqz v7, :cond_c

    .line 266
    .line 267
    .line 268
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 269
    move-result v7

    .line 270
    .line 271
    if-nez v7, :cond_d

    .line 272
    goto :goto_8

    .line 273
    .line 274
    .line 275
    :cond_d
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 276
    goto :goto_8

    .line 277
    :cond_e
    move-object v10, v5

    .line 278
    goto :goto_9

    .line 279
    .line 280
    :cond_f
    move-object/from16 v10, v16

    .line 281
    .line 282
    :goto_9
    if-eqz v10, :cond_10

    .line 283
    .line 284
    .line 285
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 286
    move-result v3

    .line 287
    .line 288
    if-eqz v3, :cond_11

    .line 289
    :cond_10
    move-object v9, v14

    .line 290
    goto :goto_a

    .line 291
    .line 292
    :cond_11
    sget-object v7, Lcom/kubi/kumex/market/v2/coinInfo/c;->a:Lcom/kubi/kumex/market/v2/coinInfo/c;

    .line 293
    .line 294
    iget-object v8, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 295
    .line 296
    .line 297
    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 301
    .line 302
    const/16 v12, 0x8

    .line 303
    const/4 v13, 0x0

    .line 304
    const/4 v11, 0x0

    .line 305
    move-object v9, v14

    .line 306
    .line 307
    .line 308
    invoke-static/range {v7 .. v13}, Lcom/kubi/kumex/market/v2/coinInfo/c;->g(Lcom/kubi/kumex/market/v2/coinInfo/c;Landroid/content/Context;Landroid/widget/LinearLayout;Ljava/util/List;ZILjava/lang/Object;)V

    .line 309
    goto :goto_b

    .line 310
    .line 311
    :goto_a
    sget-object v3, Lcom/kubi/kumex/market/v2/coinInfo/c;->a:Lcom/kubi/kumex/market/v2/coinInfo/c;

    .line 312
    .line 313
    iget-object v5, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 314
    .line 315
    .line 316
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v3, v5, v9}, Lcom/kubi/kumex/market/v2/coinInfo/c;->e(Landroid/content/Context;Landroid/view/ViewGroup;)V

    .line 323
    .line 324
    :goto_b
    if-eqz v2, :cond_14

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;->getContract()Ljava/util/List;

    .line 328
    move-result-object v3

    .line 329
    .line 330
    if-eqz v3, :cond_14

    .line 331
    .line 332
    new-instance v5, Ljava/util/ArrayList;

    .line 333
    .line 334
    .line 335
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 336
    .line 337
    .line 338
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 339
    move-result-object v3

    .line 340
    .line 341
    .line 342
    :cond_12
    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 343
    move-result v6

    .line 344
    .line 345
    if-eqz v6, :cond_15

    .line 346
    .line 347
    .line 348
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 349
    move-result-object v6

    .line 350
    move-object v7, v6

    .line 351
    .line 352
    check-cast v7, Ljava/lang/String;

    .line 353
    .line 354
    if-eqz v7, :cond_12

    .line 355
    .line 356
    .line 357
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 358
    move-result v7

    .line 359
    .line 360
    if-nez v7, :cond_13

    .line 361
    goto :goto_c

    .line 362
    .line 363
    .line 364
    :cond_13
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 365
    goto :goto_c

    .line 366
    .line 367
    :cond_14
    move-object/from16 v5, v16

    .line 368
    .line 369
    :cond_15
    if-eqz v5, :cond_17

    .line 370
    .line 371
    .line 372
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 373
    move-result v3

    .line 374
    .line 375
    if-eqz v3, :cond_16

    .line 376
    goto :goto_d

    .line 377
    .line 378
    :cond_16
    sget-object v3, Lcom/kubi/kumex/market/v2/coinInfo/c;->a:Lcom/kubi/kumex/market/v2/coinInfo/c;

    .line 379
    .line 380
    iget-object v6, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 381
    .line 382
    .line 383
    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v3, v6, v15, v5}, Lcom/kubi/kumex/market/v2/coinInfo/c;->c(Landroid/content/Context;Landroid/widget/LinearLayout;Ljava/util/List;)V

    .line 390
    goto :goto_e

    .line 391
    .line 392
    :cond_17
    :goto_d
    sget-object v3, Lcom/kubi/kumex/market/v2/coinInfo/c;->a:Lcom/kubi/kumex/market/v2/coinInfo/c;

    .line 393
    .line 394
    iget-object v5, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 395
    .line 396
    .line 397
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v3, v5, v15}, Lcom/kubi/kumex/market/v2/coinInfo/c;->e(Landroid/content/Context;Landroid/view/ViewGroup;)V

    .line 404
    .line 405
    :goto_e
    if-eqz v2, :cond_21

    .line 406
    .line 407
    .line 408
    invoke-virtual {v2}, Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;->getCodeAndCommunity()Ljava/util/List;

    .line 409
    move-result-object v2

    .line 410
    .line 411
    if-eqz v2, :cond_21

    .line 412
    .line 413
    new-instance v3, Ljava/util/ArrayList;

    .line 414
    .line 415
    .line 416
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 417
    .line 418
    .line 419
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 420
    move-result-object v2

    .line 421
    .line 422
    .line 423
    :cond_18
    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 424
    move-result v5

    .line 425
    .line 426
    if-eqz v5, :cond_22

    .line 427
    .line 428
    .line 429
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 430
    move-result-object v5

    .line 431
    move-object v6, v5

    .line 432
    .line 433
    check-cast v6, Ljava/lang/String;

    .line 434
    const/4 v7, 0x1

    .line 435
    .line 436
    if-eqz v6, :cond_19

    .line 437
    .line 438
    const-string v8, "facebook"

    .line 439
    .line 440
    .line 441
    invoke-static {v6, v8, v7}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 442
    move-result v8

    .line 443
    .line 444
    .line 445
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 446
    move-result-object v8

    .line 447
    goto :goto_10

    .line 448
    .line 449
    :cond_19
    move-object/from16 v8, v16

    .line 450
    .line 451
    .line 452
    :goto_10
    invoke-static {v8}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 453
    move-result v8

    .line 454
    .line 455
    if-nez v8, :cond_20

    .line 456
    .line 457
    if-eqz v6, :cond_1a

    .line 458
    .line 459
    const-string v8, "twitter"

    .line 460
    .line 461
    .line 462
    invoke-static {v6, v8, v7}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 463
    move-result v8

    .line 464
    .line 465
    .line 466
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 467
    move-result-object v8

    .line 468
    goto :goto_11

    .line 469
    .line 470
    :cond_1a
    move-object/from16 v8, v16

    .line 471
    .line 472
    .line 473
    :goto_11
    invoke-static {v8}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 474
    move-result v8

    .line 475
    .line 476
    if-nez v8, :cond_20

    .line 477
    .line 478
    if-eqz v6, :cond_1b

    .line 479
    .line 480
    const-string v8, "t.me"

    .line 481
    .line 482
    .line 483
    invoke-static {v6, v8, v7}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 484
    move-result v8

    .line 485
    .line 486
    .line 487
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 488
    move-result-object v8

    .line 489
    goto :goto_12

    .line 490
    .line 491
    :cond_1b
    move-object/from16 v8, v16

    .line 492
    .line 493
    .line 494
    :goto_12
    invoke-static {v8}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 495
    move-result v8

    .line 496
    .line 497
    if-nez v8, :cond_20

    .line 498
    .line 499
    if-eqz v6, :cond_1c

    .line 500
    .line 501
    const-string v8, "telegram.me"

    .line 502
    .line 503
    .line 504
    invoke-static {v6, v8, v7}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 505
    move-result v8

    .line 506
    .line 507
    .line 508
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 509
    move-result-object v8

    .line 510
    goto :goto_13

    .line 511
    .line 512
    :cond_1c
    move-object/from16 v8, v16

    .line 513
    .line 514
    .line 515
    :goto_13
    invoke-static {v8}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 516
    move-result v8

    .line 517
    .line 518
    if-nez v8, :cond_20

    .line 519
    .line 520
    if-eqz v6, :cond_1d

    .line 521
    .line 522
    const-string v8, "medium"

    .line 523
    .line 524
    .line 525
    invoke-static {v6, v8, v7}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 526
    move-result v8

    .line 527
    .line 528
    .line 529
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 530
    move-result-object v8

    .line 531
    goto :goto_14

    .line 532
    .line 533
    :cond_1d
    move-object/from16 v8, v16

    .line 534
    .line 535
    .line 536
    :goto_14
    invoke-static {v8}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 537
    move-result v8

    .line 538
    .line 539
    if-nez v8, :cond_20

    .line 540
    .line 541
    if-eqz v6, :cond_1e

    .line 542
    .line 543
    const-string v8, "reddit"

    .line 544
    .line 545
    .line 546
    invoke-static {v6, v8, v7}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 547
    move-result v8

    .line 548
    .line 549
    .line 550
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 551
    move-result-object v8

    .line 552
    goto :goto_15

    .line 553
    .line 554
    :cond_1e
    move-object/from16 v8, v16

    .line 555
    .line 556
    .line 557
    :goto_15
    invoke-static {v8}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 558
    move-result v8

    .line 559
    .line 560
    if-nez v8, :cond_20

    .line 561
    .line 562
    if-eqz v6, :cond_1f

    .line 563
    .line 564
    const-string v8, "github"

    .line 565
    .line 566
    .line 567
    invoke-static {v6, v8, v7}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 568
    move-result v6

    .line 569
    .line 570
    .line 571
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 572
    move-result-object v6

    .line 573
    goto :goto_16

    .line 574
    .line 575
    :cond_1f
    move-object/from16 v6, v16

    .line 576
    .line 577
    .line 578
    :goto_16
    invoke-static {v6}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 579
    move-result v6

    .line 580
    .line 581
    if-eqz v6, :cond_18

    .line 582
    .line 583
    .line 584
    :cond_20
    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 585
    .line 586
    goto/16 :goto_f

    .line 587
    .line 588
    :cond_21
    move-object/from16 v3, v16

    .line 589
    .line 590
    :cond_22
    if-eqz v3, :cond_24

    .line 591
    .line 592
    .line 593
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 594
    move-result v2

    .line 595
    .line 596
    if-eqz v2, :cond_23

    .line 597
    goto :goto_17

    .line 598
    .line 599
    .line 600
    :cond_23
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 601
    .line 602
    iget-object v2, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 603
    .line 604
    .line 605
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 606
    .line 607
    new-instance v4, Llm/a;

    .line 608
    .line 609
    .line 610
    invoke-direct {v4}, Llm/a;-><init>()V

    .line 611
    .line 612
    .line 613
    invoke-static {v1, v2, v3, v4}, Lcom/kubi/kumex/market/v2/coinInfo/x;->c(Lcom/google/android/flexbox/FlexboxLayout;Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V

    .line 614
    return-void

    .line 615
    .line 616
    :cond_24
    :goto_17
    sget-object v2, Lcom/kubi/kumex/market/v2/coinInfo/c;->a:Lcom/kubi/kumex/market/v2/coinInfo/c;

    .line 617
    .line 618
    iget-object v3, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 619
    .line 620
    .line 621
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 622
    .line 623
    .line 624
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v2, v3, v1}, Lcom/kubi/kumex/market/v2/coinInfo/c;->e(Landroid/content/Context;Landroid/view/ViewGroup;)V

    .line 628
    return-void
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
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
.end method
