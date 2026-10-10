.class public final Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;
.super Ljava/lang/Object;
.source "AssetUnifiedContract.kt"

# interfaces
.implements Lcom/kubi/mvi/state/f;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u00b1\u0001\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0008\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008\u0012\u001c\u0008\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000cj\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\r\u0012\u001c\u0008\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000cj\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\r\u0012\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0012\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0008H\u00c6\u0003J\t\u0010/\u001a\u00020\u0008H\u00c6\u0003J\t\u00100\u001a\u00020\u0008H\u00c6\u0003J\u001d\u00101\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000cj\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\rH\u00c6\u0003J\u001d\u00102\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000cj\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\rH\u00c6\u0003J\u000f\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\t\u00105\u001a\u00020\u0012H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u00b3\u0001\u00107\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\u0008\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00082\u001c\u0008\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000cj\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\r2\u001c\u0008\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000cj\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\r2\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00122\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00c6\u0001J\u0013\u00108\u001a\u00020\u00082\u0008\u00109\u001a\u0004\u0018\u00010:H\u00d6\u0003J\t\u0010;\u001a\u00020<H\u00d6\u0001J\t\u0010=\u001a\u00020\u0012H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001fR%\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000cj\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R%\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000cj\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\"R\u0017\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0011\u0010\u0015\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+\u00a8\u0006>"
    }
    d2 = {
        "Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;",
        "Lcom/kubi/mvi/state/IState;",
        "overviewData",
        "Lcom/kubi/assets/entity/UnifiedAccountOverview;",
        "uiAssetsShowList",
        "",
        "Lcom/kubi/assets/entity/UnifiedAssetsEntity;",
        "uiHideNumberFlag",
        "",
        "isShowInDebt",
        "uiHideSmallSwitch",
        "originAssetsSourceList",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "productsSourceList",
        "Lcom/kubi/assets/entity/EarnAccountItem;",
        "marginCurrencySet",
        "",
        "",
        "marginCurrencySetting",
        "Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;",
        "filterKeywords",
        "unifiedPnlOverview",
        "Lcom/kubi/assets/entity/UnifiedOverviewEntity;",
        "<init>",
        "(Lcom/kubi/assets/entity/UnifiedAccountOverview;Ljava/util/List;ZZZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/Set;Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;Ljava/lang/String;Lcom/kubi/assets/entity/UnifiedOverviewEntity;)V",
        "getOverviewData",
        "()Lcom/kubi/assets/entity/UnifiedAccountOverview;",
        "getUiAssetsShowList",
        "()Ljava/util/List;",
        "getUiHideNumberFlag",
        "()Z",
        "getUiHideSmallSwitch",
        "getOriginAssetsSourceList",
        "()Ljava/util/ArrayList;",
        "getProductsSourceList",
        "getMarginCurrencySet",
        "()Ljava/util/Set;",
        "getMarginCurrencySetting",
        "()Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;",
        "getFilterKeywords",
        "()Ljava/lang/String;",
        "getUnifiedPnlOverview",
        "()Lcom/kubi/assets/entity/UnifiedOverviewEntity;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "",
        "toString",
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


# instance fields
.field private final filterKeywords:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final isShowInDebt:Z

.field private final marginCurrencySet:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final marginCurrencySetting:Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final originAssetsSourceList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/kubi/assets/entity/UnifiedAssetsEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final overviewData:Lcom/kubi/assets/entity/UnifiedAccountOverview;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final productsSourceList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/kubi/assets/entity/EarnAccountItem;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final uiAssetsShowList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/assets/entity/UnifiedAssetsEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final uiHideNumberFlag:Z

.field private final uiHideSmallSwitch:Z

.field private final unifiedPnlOverview:Lcom/kubi/assets/entity/UnifiedOverviewEntity;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 14

    .line 1
    const/16 v12, 0x7ff

    const/4 v13, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;-><init>(Lcom/kubi/assets/entity/UnifiedAccountOverview;Ljava/util/List;ZZZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/Set;Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;Ljava/lang/String;Lcom/kubi/assets/entity/UnifiedOverviewEntity;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/kubi/assets/entity/UnifiedAccountOverview;Ljava/util/List;ZZZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/Set;Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;Ljava/lang/String;Lcom/kubi/assets/entity/UnifiedOverviewEntity;)V
    .locals 1
    .param p1    # Lcom/kubi/assets/entity/UnifiedAccountOverview;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Lcom/kubi/assets/entity/UnifiedOverviewEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/assets/entity/UnifiedAccountOverview;",
            "Ljava/util/List<",
            "Lcom/kubi/assets/entity/UnifiedAssetsEntity;",
            ">;ZZZ",
            "Ljava/util/ArrayList<",
            "Lcom/kubi/assets/entity/UnifiedAssetsEntity;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/kubi/assets/entity/EarnAccountItem;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;",
            "Ljava/lang/String;",
            "Lcom/kubi/assets/entity/UnifiedOverviewEntity;",
            ")V"
        }
    .end annotation

    const-string v0, "marginCurrencySet"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filterKeywords"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->overviewData:Lcom/kubi/assets/entity/UnifiedAccountOverview;

    .line 4
    iput-object p2, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->uiAssetsShowList:Ljava/util/List;

    .line 5
    iput-boolean p3, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->uiHideNumberFlag:Z

    .line 6
    iput-boolean p4, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->isShowInDebt:Z

    .line 7
    iput-boolean p5, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->uiHideSmallSwitch:Z

    .line 8
    iput-object p6, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->originAssetsSourceList:Ljava/util/ArrayList;

    .line 9
    iput-object p7, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->productsSourceList:Ljava/util/ArrayList;

    .line 10
    iput-object p8, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->marginCurrencySet:Ljava/util/Set;

    .line 11
    iput-object p9, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->marginCurrencySetting:Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;

    .line 12
    iput-object p10, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->filterKeywords:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->unifiedPnlOverview:Lcom/kubi/assets/entity/UnifiedOverviewEntity;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/kubi/assets/entity/UnifiedAccountOverview;Ljava/util/List;ZZZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/Set;Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;Ljava/lang/String;Lcom/kubi/assets/entity/UnifiedOverviewEntity;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p12, 0x1

    const/4 v0, 0x0

    if-eqz p13, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    .line 14
    sget-object p3, Lcom/kubi/assets/unify/j;->a:Lcom/kubi/assets/unify/j;

    invoke-virtual {p3}, Lcom/kubi/assets/unify/j;->a()Z

    move-result p3

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    .line 15
    sget-object p4, Lcom/kubi/assets/unify/j;->a:Lcom/kubi/assets/unify/j;

    invoke-virtual {p4}, Lcom/kubi/assets/unify/j;->c()Z

    move-result p4

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    .line 16
    sget-object p5, Lcom/kubi/assets/unify/j;->a:Lcom/kubi/assets/unify/j;

    invoke-virtual {p5}, Lcom/kubi/assets/unify/j;->b()Z

    move-result p5

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    move-object p7, v0

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    .line 17
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p8

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    move-object p9, v0

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    .line 18
    const-string p10, ""

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    move-object p12, v0

    :goto_0
    move-object p11, p10

    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_a
    move-object p12, p11

    goto :goto_0

    .line 19
    :goto_1
    invoke-direct/range {p1 .. p12}, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;-><init>(Lcom/kubi/assets/entity/UnifiedAccountOverview;Ljava/util/List;ZZZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/Set;Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;Ljava/lang/String;Lcom/kubi/assets/entity/UnifiedOverviewEntity;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;Lcom/kubi/assets/entity/UnifiedAccountOverview;Ljava/util/List;ZZZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/Set;Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;Ljava/lang/String;Lcom/kubi/assets/entity/UnifiedOverviewEntity;ILjava/lang/Object;)Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p13, p12, 0x1

    .line 3
    .line 4
    if-eqz p13, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->overviewData:Lcom/kubi/assets/entity/UnifiedAccountOverview;

    .line 7
    .line 8
    :cond_0
    and-int/lit8 p13, p12, 0x2

    .line 9
    .line 10
    if-eqz p13, :cond_1

    .line 11
    .line 12
    iget-object p2, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->uiAssetsShowList:Ljava/util/List;

    .line 13
    .line 14
    :cond_1
    and-int/lit8 p13, p12, 0x4

    .line 15
    .line 16
    if-eqz p13, :cond_2

    .line 17
    .line 18
    iget-boolean p3, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->uiHideNumberFlag:Z

    .line 19
    .line 20
    :cond_2
    and-int/lit8 p13, p12, 0x8

    .line 21
    .line 22
    if-eqz p13, :cond_3

    .line 23
    .line 24
    iget-boolean p4, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->isShowInDebt:Z

    .line 25
    .line 26
    :cond_3
    and-int/lit8 p13, p12, 0x10

    .line 27
    .line 28
    if-eqz p13, :cond_4

    .line 29
    .line 30
    iget-boolean p5, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->uiHideSmallSwitch:Z

    .line 31
    .line 32
    :cond_4
    and-int/lit8 p13, p12, 0x20

    .line 33
    .line 34
    if-eqz p13, :cond_5

    .line 35
    .line 36
    iget-object p6, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->originAssetsSourceList:Ljava/util/ArrayList;

    .line 37
    .line 38
    :cond_5
    and-int/lit8 p13, p12, 0x40

    .line 39
    .line 40
    if-eqz p13, :cond_6

    .line 41
    .line 42
    iget-object p7, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->productsSourceList:Ljava/util/ArrayList;

    .line 43
    .line 44
    :cond_6
    and-int/lit16 p13, p12, 0x80

    .line 45
    .line 46
    if-eqz p13, :cond_7

    .line 47
    .line 48
    iget-object p8, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->marginCurrencySet:Ljava/util/Set;

    .line 49
    .line 50
    :cond_7
    and-int/lit16 p13, p12, 0x100

    .line 51
    .line 52
    if-eqz p13, :cond_8

    .line 53
    .line 54
    iget-object p9, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->marginCurrencySetting:Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;

    .line 55
    .line 56
    :cond_8
    and-int/lit16 p13, p12, 0x200

    .line 57
    .line 58
    if-eqz p13, :cond_9

    .line 59
    .line 60
    iget-object p10, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->filterKeywords:Ljava/lang/String;

    .line 61
    .line 62
    :cond_9
    and-int/lit16 p12, p12, 0x400

    .line 63
    .line 64
    if-eqz p12, :cond_a

    .line 65
    .line 66
    iget-object p11, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->unifiedPnlOverview:Lcom/kubi/assets/entity/UnifiedOverviewEntity;

    .line 67
    :cond_a
    move-object p12, p10

    .line 68
    move-object p13, p11

    .line 69
    move-object p10, p8

    .line 70
    move-object p11, p9

    .line 71
    move-object p8, p6

    .line 72
    move-object p9, p7

    .line 73
    move p6, p4

    .line 74
    move p7, p5

    .line 75
    move-object p4, p2

    .line 76
    move p5, p3

    .line 77
    move-object p2, p0

    .line 78
    move-object p3, p1

    .line 79
    .line 80
    .line 81
    invoke-virtual/range {p2 .. p13}, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->copy(Lcom/kubi/assets/entity/UnifiedAccountOverview;Ljava/util/List;ZZZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/Set;Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;Ljava/lang/String;Lcom/kubi/assets/entity/UnifiedOverviewEntity;)Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;

    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method


# virtual methods
.method public final copy(Lcom/kubi/assets/entity/UnifiedAccountOverview;Ljava/util/List;ZZZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/Set;Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;Ljava/lang/String;Lcom/kubi/assets/entity/UnifiedOverviewEntity;)Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;
    .locals 13
    .param p1    # Lcom/kubi/assets/entity/UnifiedAccountOverview;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Lcom/kubi/assets/entity/UnifiedOverviewEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/assets/entity/UnifiedAccountOverview;",
            "Ljava/util/List<",
            "Lcom/kubi/assets/entity/UnifiedAssetsEntity;",
            ">;ZZZ",
            "Ljava/util/ArrayList<",
            "Lcom/kubi/assets/entity/UnifiedAssetsEntity;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/kubi/assets/entity/EarnAccountItem;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;",
            "Ljava/lang/String;",
            "Lcom/kubi/assets/entity/UnifiedOverviewEntity;",
            ")",
            "Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "marginCurrencySet"

    .line 3
    .line 4
    move-object/from16 v9, p8

    .line 5
    .line 6
    .line 7
    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    const-string v0, "filterKeywords"

    .line 10
    .line 11
    move-object/from16 v11, p10

    .line 12
    .line 13
    .line 14
    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    new-instance v1, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;

    .line 17
    move-object v2, p1

    .line 18
    move-object v3, p2

    .line 19
    .line 20
    move/from16 v4, p3

    .line 21
    .line 22
    move/from16 v5, p4

    .line 23
    .line 24
    move/from16 v6, p5

    .line 25
    .line 26
    move-object/from16 v7, p6

    .line 27
    .line 28
    move-object/from16 v8, p7

    .line 29
    .line 30
    move-object/from16 v10, p9

    .line 31
    .line 32
    move-object/from16 v12, p11

    .line 33
    .line 34
    .line 35
    invoke-direct/range {v1 .. v12}, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;-><init>(Lcom/kubi/assets/entity/UnifiedAccountOverview;Ljava/util/List;ZZZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/Set;Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;Ljava/lang/String;Lcom/kubi/assets/entity/UnifiedOverviewEntity;)V

    .line 36
    return-object v1
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

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    return v2

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->overviewData:Lcom/kubi/assets/entity/UnifiedAccountOverview;

    .line 15
    .line 16
    iget-object v3, p1, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->overviewData:Lcom/kubi/assets/entity/UnifiedAccountOverview;

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    return v2

    .line 24
    .line 25
    :cond_2
    iget-object v1, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->uiAssetsShowList:Ljava/util/List;

    .line 26
    .line 27
    iget-object v3, p1, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->uiAssetsShowList:Ljava/util/List;

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    move-result v1

    .line 32
    .line 33
    if-nez v1, :cond_3

    .line 34
    return v2

    .line 35
    .line 36
    :cond_3
    iget-boolean v1, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->uiHideNumberFlag:Z

    .line 37
    .line 38
    iget-boolean v3, p1, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->uiHideNumberFlag:Z

    .line 39
    .line 40
    if-eq v1, v3, :cond_4

    .line 41
    return v2

    .line 42
    .line 43
    :cond_4
    iget-boolean v1, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->isShowInDebt:Z

    .line 44
    .line 45
    iget-boolean v3, p1, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->isShowInDebt:Z

    .line 46
    .line 47
    if-eq v1, v3, :cond_5

    .line 48
    return v2

    .line 49
    .line 50
    :cond_5
    iget-boolean v1, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->uiHideSmallSwitch:Z

    .line 51
    .line 52
    iget-boolean v3, p1, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->uiHideSmallSwitch:Z

    .line 53
    .line 54
    if-eq v1, v3, :cond_6

    .line 55
    return v2

    .line 56
    .line 57
    :cond_6
    iget-object v1, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->originAssetsSourceList:Ljava/util/ArrayList;

    .line 58
    .line 59
    iget-object v3, p1, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->originAssetsSourceList:Ljava/util/ArrayList;

    .line 60
    .line 61
    .line 62
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    move-result v1

    .line 64
    .line 65
    if-nez v1, :cond_7

    .line 66
    return v2

    .line 67
    .line 68
    :cond_7
    iget-object v1, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->productsSourceList:Ljava/util/ArrayList;

    .line 69
    .line 70
    iget-object v3, p1, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->productsSourceList:Ljava/util/ArrayList;

    .line 71
    .line 72
    .line 73
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    move-result v1

    .line 75
    .line 76
    if-nez v1, :cond_8

    .line 77
    return v2

    .line 78
    .line 79
    :cond_8
    iget-object v1, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->marginCurrencySet:Ljava/util/Set;

    .line 80
    .line 81
    iget-object v3, p1, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->marginCurrencySet:Ljava/util/Set;

    .line 82
    .line 83
    .line 84
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    move-result v1

    .line 86
    .line 87
    if-nez v1, :cond_9

    .line 88
    return v2

    .line 89
    .line 90
    :cond_9
    iget-object v1, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->marginCurrencySetting:Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;

    .line 91
    .line 92
    iget-object v3, p1, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->marginCurrencySetting:Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;

    .line 93
    .line 94
    .line 95
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    move-result v1

    .line 97
    .line 98
    if-nez v1, :cond_a

    .line 99
    return v2

    .line 100
    .line 101
    :cond_a
    iget-object v1, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->filterKeywords:Ljava/lang/String;

    .line 102
    .line 103
    iget-object v3, p1, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->filterKeywords:Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    move-result v1

    .line 108
    .line 109
    if-nez v1, :cond_b

    .line 110
    return v2

    .line 111
    .line 112
    :cond_b
    iget-object v1, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->unifiedPnlOverview:Lcom/kubi/assets/entity/UnifiedOverviewEntity;

    .line 113
    .line 114
    iget-object p1, p1, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->unifiedPnlOverview:Lcom/kubi/assets/entity/UnifiedOverviewEntity;

    .line 115
    .line 116
    .line 117
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    move-result p1

    .line 119
    .line 120
    if-nez p1, :cond_c

    .line 121
    return v2

    .line 122
    :cond_c
    return v0
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
.end method

.method public final getFilterKeywords()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->filterKeywords:Ljava/lang/String;

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
.end method

.method public final getMarginCurrencySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->marginCurrencySet:Ljava/util/Set;

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
.end method

.method public final getOriginAssetsSourceList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/kubi/assets/entity/UnifiedAssetsEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->originAssetsSourceList:Ljava/util/ArrayList;

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
.end method

.method public final getOverviewData()Lcom/kubi/assets/entity/UnifiedAccountOverview;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->overviewData:Lcom/kubi/assets/entity/UnifiedAccountOverview;

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
.end method

.method public final getProductsSourceList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/kubi/assets/entity/EarnAccountItem;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->productsSourceList:Ljava/util/ArrayList;

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
.end method

.method public final getUiAssetsShowList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/assets/entity/UnifiedAssetsEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->uiAssetsShowList:Ljava/util/List;

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
.end method

.method public final getUiHideNumberFlag()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->uiHideNumberFlag:Z

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
.end method

.method public final getUiHideSmallSwitch()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->uiHideSmallSwitch:Z

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
.end method

.method public final getUnifiedPnlOverview()Lcom/kubi/assets/entity/UnifiedOverviewEntity;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->unifiedPnlOverview:Lcom/kubi/assets/entity/UnifiedOverviewEntity;

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
.end method

.method public hashCode()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->overviewData:Lcom/kubi/assets/entity/UnifiedAccountOverview;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Lcom/kubi/assets/entity/UnifiedAccountOverview;->hashCode()I

    .line 11
    move-result v0

    .line 12
    .line 13
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 14
    .line 15
    iget-object v2, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->uiAssetsShowList:Ljava/util/List;

    .line 16
    .line 17
    if-nez v2, :cond_1

    .line 18
    move v2, v1

    .line 19
    goto :goto_1

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 23
    move-result v2

    .line 24
    :goto_1
    add-int/2addr v0, v2

    .line 25
    .line 26
    mul-int/lit8 v0, v0, 0x1f

    .line 27
    .line 28
    iget-boolean v2, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->uiHideNumberFlag:Z

    .line 29
    .line 30
    .line 31
    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 32
    move-result v2

    .line 33
    add-int/2addr v0, v2

    .line 34
    .line 35
    mul-int/lit8 v0, v0, 0x1f

    .line 36
    .line 37
    iget-boolean v2, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->isShowInDebt:Z

    .line 38
    .line 39
    .line 40
    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 41
    move-result v2

    .line 42
    add-int/2addr v0, v2

    .line 43
    .line 44
    mul-int/lit8 v0, v0, 0x1f

    .line 45
    .line 46
    iget-boolean v2, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->uiHideSmallSwitch:Z

    .line 47
    .line 48
    .line 49
    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 50
    move-result v2

    .line 51
    add-int/2addr v0, v2

    .line 52
    .line 53
    mul-int/lit8 v0, v0, 0x1f

    .line 54
    .line 55
    iget-object v2, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->originAssetsSourceList:Ljava/util/ArrayList;

    .line 56
    .line 57
    if-nez v2, :cond_2

    .line 58
    move v2, v1

    .line 59
    goto :goto_2

    .line 60
    .line 61
    .line 62
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->hashCode()I

    .line 63
    move-result v2

    .line 64
    :goto_2
    add-int/2addr v0, v2

    .line 65
    .line 66
    mul-int/lit8 v0, v0, 0x1f

    .line 67
    .line 68
    iget-object v2, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->productsSourceList:Ljava/util/ArrayList;

    .line 69
    .line 70
    if-nez v2, :cond_3

    .line 71
    move v2, v1

    .line 72
    goto :goto_3

    .line 73
    .line 74
    .line 75
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->hashCode()I

    .line 76
    move-result v2

    .line 77
    :goto_3
    add-int/2addr v0, v2

    .line 78
    .line 79
    mul-int/lit8 v0, v0, 0x1f

    .line 80
    .line 81
    iget-object v2, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->marginCurrencySet:Ljava/util/Set;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 85
    move-result v2

    .line 86
    add-int/2addr v0, v2

    .line 87
    .line 88
    mul-int/lit8 v0, v0, 0x1f

    .line 89
    .line 90
    iget-object v2, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->marginCurrencySetting:Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;

    .line 91
    .line 92
    if-nez v2, :cond_4

    .line 93
    move v2, v1

    .line 94
    goto :goto_4

    .line 95
    .line 96
    .line 97
    :cond_4
    invoke-virtual {v2}, Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;->hashCode()I

    .line 98
    move-result v2

    .line 99
    :goto_4
    add-int/2addr v0, v2

    .line 100
    .line 101
    mul-int/lit8 v0, v0, 0x1f

    .line 102
    .line 103
    iget-object v2, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->filterKeywords:Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 107
    move-result v2

    .line 108
    add-int/2addr v0, v2

    .line 109
    .line 110
    mul-int/lit8 v0, v0, 0x1f

    .line 111
    .line 112
    iget-object v2, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->unifiedPnlOverview:Lcom/kubi/assets/entity/UnifiedOverviewEntity;

    .line 113
    .line 114
    if-nez v2, :cond_5

    .line 115
    goto :goto_5

    .line 116
    .line 117
    .line 118
    :cond_5
    invoke-virtual {v2}, Lcom/kubi/assets/entity/UnifiedOverviewEntity;->hashCode()I

    .line 119
    move-result v1

    .line 120
    :goto_5
    add-int/2addr v0, v1

    .line 121
    return v0
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
.end method

.method public final isShowInDebt()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->isShowInDebt:Z

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
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "UIState(overviewData="

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->overviewData:Lcom/kubi/assets/entity/UnifiedAccountOverview;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, ", uiAssetsShowList="

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->uiAssetsShowList:Ljava/util/List;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v1, ", uiHideNumberFlag="

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    iget-boolean v1, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->uiHideNumberFlag:Z

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, ", isShowInDebt="

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    iget-boolean v1, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->isShowInDebt:Z

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v1, ", uiHideSmallSwitch="

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    iget-boolean v1, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->uiHideSmallSwitch:Z

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v1, ", originAssetsSourceList="

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    iget-object v1, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->originAssetsSourceList:Ljava/util/ArrayList;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v1, ", productsSourceList="

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    iget-object v1, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->productsSourceList:Ljava/util/ArrayList;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v1, ", marginCurrencySet="

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    iget-object v1, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->marginCurrencySet:Ljava/util/Set;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    const-string v1, ", marginCurrencySetting="

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    iget-object v1, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->marginCurrencySetting:Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v1, ", filterKeywords="

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    iget-object v1, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->filterKeywords:Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v1, ", unifiedPnlOverview="

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    iget-object v1, p0, Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;->unifiedPnlOverview:Lcom/kubi/assets/entity/UnifiedOverviewEntity;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const/16 v1, 0x29

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    move-result-object v0

    .line 125
    return-object v0
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
.end method
