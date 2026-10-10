.class public final Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment$Companion;
.super Ljava/lang/Object;
.source "MarginMarketRecommendFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment$Companion;",
        "",
        "<init>",
        "()V",
        "newInstance",
        "Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment;",
        "tradeItemBean",
        "Lcom/kubi/data/entity/TradeItemBean;",
        "MarginLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final newInstance(Lcom/kubi/data/entity/TradeItemBean;)Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment;
    .locals 3
    .param p1    # Lcom/kubi/data/entity/TradeItemBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "tradeItemBean"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment;-><init>()V

    .line 11
    .line 12
    new-instance v1, Lcom/kubi/utils/h;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1}, Lcom/kubi/utils/h;-><init>()V

    .line 16
    .line 17
    const-string v2, "data"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2, p1}, Lcom/kubi/utils/h;->e(Ljava/lang/String;Landroid/os/Parcelable;)Lcom/kubi/utils/h;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/kubi/utils/h;->a()Landroid/os/Bundle;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 29
    return-object v0
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
.end method
