.class public interface abstract Lcom/kubi/core/biz/bottomtab/order/child/p;
.super Ljava/lang/Object;
.source "AbsBottomOrderListFragmentFactory.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001JV\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0012\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/core/biz/bottomtab/order/child/DelegationCustomItemBind;",
        "",
        "bindDataToItemView",
        "",
        "context",
        "Landroid/content/Context;",
        "viewHolder",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "item",
        "Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;",
        "curSymbol",
        "",
        "needJumpGuideIcon",
        "",
        "isMargin",
        "cancelOrder",
        "Lkotlin/Function1;",
        "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData;",
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


# direct methods
.method public static synthetic a(Lcom/kubi/core/biz/bottomtab/order/child/p;Landroid/content/Context;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 1

    .line 1
    .line 2
    if-nez p9, :cond_2

    .line 3
    .line 4
    and-int/lit8 p9, p8, 0x10

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    if-eqz p9, :cond_0

    .line 8
    move p5, v0

    .line 9
    .line 10
    :cond_0
    and-int/lit8 p8, p8, 0x20

    .line 11
    .line 12
    if-eqz p8, :cond_1

    .line 13
    move p6, v0

    .line 14
    .line 15
    .line 16
    :cond_1
    invoke-interface/range {p0 .. p7}, Lcom/kubi/core/biz/bottomtab/order/child/p;->b(Landroid/content/Context;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;)V

    .line 17
    return-void

    .line 18
    .line 19
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 20
    .line 21
    const-string p1, "Super calls with default arguments not supported in this target, function: bindDataToItemView"

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 25
    throw p0
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
.end method


# virtual methods
.method public abstract b(Landroid/content/Context;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;)V
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/chad/library/adapter/base/BaseViewHolder;",
            "Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;",
            "Ljava/lang/String;",
            "ZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkd/k;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method
