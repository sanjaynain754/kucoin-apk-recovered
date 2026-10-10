.class public final Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity;
.super Ljava/lang/Object;
.source "MarginMarketRecommendEntity.kt"

# interfaces
.implements Lio/chad/library/adapter/base/entity/MultiItemEntity;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0010\u0008\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0008\u0010\u0018\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity;",
        "Lio/chad/library/adapter/base/entity/MultiItemEntity;",
        "type",
        "",
        "activity",
        "Lcom/kubi/margin/market/info/MarketCoinInfoQuest;",
        "grid",
        "Lcom/kubi/margin/market/info/MarketCoinInfoGrid;",
        "earn",
        "Lcom/kubi/margin/market/info/MarketCoinInfoEarn;",
        "coinName",
        "",
        "<init>",
        "(ILcom/kubi/margin/market/info/MarketCoinInfoQuest;Lcom/kubi/margin/market/info/MarketCoinInfoGrid;Lcom/kubi/margin/market/info/MarketCoinInfoEarn;Ljava/lang/String;)V",
        "getType",
        "()I",
        "getActivity",
        "()Lcom/kubi/margin/market/info/MarketCoinInfoQuest;",
        "getGrid",
        "()Lcom/kubi/margin/market/info/MarketCoinInfoGrid;",
        "getEarn",
        "()Lcom/kubi/margin/market/info/MarketCoinInfoEarn;",
        "getCoinName",
        "()Ljava/lang/String;",
        "getItemType",
        "Companion",
        "RecommendType",
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


# static fields
.field public static final Companion:Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final TYPE_ACTIVITY:I = 0x0

.field public static final TYPE_EARN:I = 0x3

.field public static final TYPE_OTC:I = 0x4

.field public static final TYPE_ROBOT_FUTURE:I = 0x2

.field public static final TYPE_ROBOT_SPOT:I = 0x1


# instance fields
.field private final activity:Lcom/kubi/margin/market/info/MarketCoinInfoQuest;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final coinName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final earn:Lcom/kubi/margin/market/info/MarketCoinInfoEarn;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final grid:Lcom/kubi/margin/market/info/MarketCoinInfoGrid;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final type:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity;->Companion:Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity$Companion;

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
.end method

.method public constructor <init>(ILcom/kubi/margin/market/info/MarketCoinInfoQuest;Lcom/kubi/margin/market/info/MarketCoinInfoGrid;Lcom/kubi/margin/market/info/MarketCoinInfoEarn;Ljava/lang/String;)V
    .locals 0
    .param p2    # Lcom/kubi/margin/market/info/MarketCoinInfoQuest;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/kubi/margin/market/info/MarketCoinInfoGrid;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/kubi/margin/market/info/MarketCoinInfoEarn;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity;->type:I

    .line 3
    iput-object p2, p0, Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity;->activity:Lcom/kubi/margin/market/info/MarketCoinInfoQuest;

    .line 4
    iput-object p3, p0, Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity;->grid:Lcom/kubi/margin/market/info/MarketCoinInfoGrid;

    .line 5
    iput-object p4, p0, Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity;->earn:Lcom/kubi/margin/market/info/MarketCoinInfoEarn;

    .line 6
    iput-object p5, p0, Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity;->coinName:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/kubi/margin/market/info/MarketCoinInfoQuest;Lcom/kubi/margin/market/info/MarketCoinInfoGrid;Lcom/kubi/margin/market/info/MarketCoinInfoEarn;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_3

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_3
    move-object p6, p5

    goto :goto_0

    .line 7
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity;-><init>(ILcom/kubi/margin/market/info/MarketCoinInfoQuest;Lcom/kubi/margin/market/info/MarketCoinInfoGrid;Lcom/kubi/margin/market/info/MarketCoinInfoEarn;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getActivity()Lcom/kubi/margin/market/info/MarketCoinInfoQuest;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity;->activity:Lcom/kubi/margin/market/info/MarketCoinInfoQuest;

    .line 3
    return-object v0
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
.end method

.method public final getCoinName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity;->coinName:Ljava/lang/String;

    .line 3
    return-object v0
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
.end method

.method public final getEarn()Lcom/kubi/margin/market/info/MarketCoinInfoEarn;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity;->earn:Lcom/kubi/margin/market/info/MarketCoinInfoEarn;

    .line 3
    return-object v0
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
.end method

.method public final getGrid()Lcom/kubi/margin/market/info/MarketCoinInfoGrid;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity;->grid:Lcom/kubi/margin/market/info/MarketCoinInfoGrid;

    .line 3
    return-object v0
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
.end method

.method public getItemType()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity;->type:I

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 10
    move-result v0

    .line 11
    return v0
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
.end method

.method public final getType()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity;->type:I

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
.end method
