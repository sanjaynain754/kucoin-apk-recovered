.class public final Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog$Companion;
.super Ljava/lang/Object;
.source "TradeTypeSelectedDialog.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J3\u0010\t\u001a\u00020\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000c2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J8\u0010\t\u001a\u00020\n2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\u0008\u0012\u0004\u0012\u00020\u0013`\u00142\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog$Companion;",
        "",
        "<init>",
        "()V",
        "TRACK_PAGE_ID",
        "",
        "TRADE_TYPE_SELECTED",
        "TRADE_TYPE_LIST",
        "TRADE_TYPE_CONDITIONAL_MARKET",
        "newInstance",
        "Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog;",
        "supportTradeTypeList",
        "",
        "initType",
        "pageId",
        "isConditionalMarket",
        "",
        "([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog;",
        "Ljava/util/ArrayList;",
        "Lcom/kubi/tradebase/tradetype/TradeTypeItem;",
        "Lkotlin/collections/ArrayList;",
        "TradeBaseLib_googleRelease"
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
        "SMAP\nTradeTypeSelectedDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeTypeSelectedDialog.kt\ncom/kubi/tradebase/tradetype/TradeTypeSelectedDialog$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n11228#2:192\n11563#2,3:193\n1#3:196\n*S KotlinDebug\n*F\n+ 1 TradeTypeSelectedDialog.kt\ncom/kubi/tradebase/tradetype/TradeTypeSelectedDialog$Companion\n*L\n154#1:192\n154#1:193,3\n*E\n"
    }
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
    invoke-direct {p0}, Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog$Companion;-><init>()V

    return-void
.end method

.method public static synthetic newInstance$default(Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog$Companion;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog;
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 2
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog$Companion;->newInstance(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Z)Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic newInstance$default(Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog$Companion;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog;
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 1
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog$Companion;->newInstance([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final newInstance(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Z)Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog;
    .locals 2
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/kubi/tradebase/tradetype/TradeTypeItem;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "supportTradeTypeList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pageId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 2
    const-string v1, "tradeTypeList"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 3
    const-string p1, "tradeTypeSelected"

    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    const-string p1, "TrackPageId"

    invoke-virtual {v0, p1, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    const-string p1, "isConditionalMarket"

    invoke-virtual {v0, p1, p4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 6
    new-instance p1, Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog;

    invoke-direct {p1}, Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog;-><init>()V

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    return-object p1
.end method

.method public final newInstance([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog;
    .locals 7
    .param p1    # [Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "supportTradeTypeList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pageId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    .line 9
    new-instance v4, Lcom/kubi/tradebase/tradetype/TradeTypeItem;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-direct {v4, v3, v6, v5, v6}, Lcom/kubi/tradebase/tradetype/TradeTypeItem;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 11
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog$Companion;->newInstance(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Z)Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog;

    move-result-object p1

    return-object p1
.end method
