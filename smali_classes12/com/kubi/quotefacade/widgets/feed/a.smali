.class public final Lcom/kubi/quotefacade/widgets/feed/a;
.super Ljava/lang/Object;
.source "HomeFeed.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0008\u0010\u0002\u001a\u00020\u0003H\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "homeFeedWidgetMapping",
        "Lcom/kubi/kucoin/home/v2/cards/ClassMappingV2;",
        "createHomeFeedWidget",
        "Lcom/kubi/kucoin/home/v2/cards/BaseCardV2;",
        "QuoteFacadeLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a()Lcom/kubi/kucoin/home/v2/cards/BaseCardV2;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/quotefacade/widgets/feed/a;->b()Lcom/kubi/kucoin/home/v2/cards/BaseCardV2;

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
.end method

.method public static final b()Lcom/kubi/kucoin/home/v2/cards/BaseCardV2;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lej/i;->a:Lej/i;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lej/i;->r()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Lcom/kubi/quotefacade/widgets/feed/HomeFeedRNWidget;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Lcom/kubi/quotefacade/widgets/feed/HomeFeedRNWidget;-><init>()V

    .line 14
    return-object v0

    .line 15
    .line 16
    :cond_0
    new-instance v0, Lcom/kubi/quotefacade/widgets/feed/HomeFeedWidget;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Lcom/kubi/quotefacade/widgets/feed/HomeFeedWidget;-><init>()V

    .line 20
    return-object v0
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
.end method

.method public static final c()Lcom/kubi/kucoin/home/v2/cards/f;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/kucoin/home/v2/cards/f;

    .line 3
    .line 4
    const-class v1, Lcom/kubi/quotefacade/widgets/feed/HomeFeedWidgetViewHolder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/kubi/kucoin/home/v2/cards/f;-><init>(Ljava/lang/Class;)V

    .line 8
    return-object v0
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
.end method
