.class public final Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;
.super Ljava/lang/Object;
.source "UnifyNetworkDataSourceImpl.kt"

# interfaces
.implements Lcom/kubi/unify/stream/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001:\u00012B;\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0\t\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000e\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u001a\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00100\u0013H\u0016J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0\u0013H\u0016J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0\u0013H\u0002J\u0014\u0010\u0018\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00190\n0\u0013H\u0016J\u0014\u0010\u001a\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00190\n0\u0013H\u0016J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00190\n0\u0013H\u0002J\u001a\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00100\u0013H\u0016J\u0010\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0013H\u0016J\u0016\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u00132\u0006\u0010 \u001a\u00020\u0011H\u0016J\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u00132\u0006\u0010 \u001a\u00020\u0011H\u0002J$\u0010\"\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00112\u0008\u0010#\u001a\u0004\u0018\u00010$2\u0008\u0010%\u001a\u0004\u0018\u00010$H\u0002J\u001c\u0010&\u001a\u0004\u0018\u00010$2\u0006\u0010 \u001a\u00020\u00112\u0008\u0010\'\u001a\u0004\u0018\u00010$H\u0002J\u000e\u0010(\u001a\u0008\u0012\u0004\u0012\u00020)0\u0013H\u0016J\u000e\u0010*\u001a\u0008\u0012\u0004\u0012\u00020)0\u0013H\u0002J\u000e\u0010+\u001a\u0008\u0012\u0004\u0012\u00020,0\u0013H\u0016J\u001c\u0010-\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010.0\u00100\u0013H\u0016J\"\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00102\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u0002010\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0008\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"
    }
    d2 = {
        "Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;",
        "Lcom/kubi/unify/stream/IUnifyNetworkDataSource;",
        "unifyApi",
        "Lcom/kubi/unify/api/UnifyApi;",
        "unifyPeriodApi",
        "Lcom/kubi/unify/api/UnifyPeriodApi;",
        "unifyWsApi",
        "Lcom/kubi/unify/api/UnifyWsApi;",
        "manualPositionRefreshFlow",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "",
        "Lcom/kubi/unify/entity/UnifyPositionEntity;",
        "<init>",
        "(Lcom/kubi/unify/api/UnifyApi;Lcom/kubi/unify/api/UnifyPeriodApi;Lcom/kubi/unify/api/UnifyWsApi;Lkotlinx/coroutines/flow/MutableSharedFlow;)V",
        "indexPriceFlow",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "",
        "",
        "composeFlow",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/kubi/unify/entity/UnifyComposeEntity;",
        "observeIndexPrices",
        "observePositions",
        "observePositionsInterval",
        "observeFundsInfo",
        "Lcom/kubi/unify/entity/UnifyFundsInfoEntity;",
        "observeEquity",
        "observeFundsInfoInterval",
        "observeFuturesLeverageData",
        "observerAccountChanged",
        "observeAvailableBalance",
        "Lcom/kubi/unify/entity/UnifyBalanceEntity;",
        "currency",
        "observeOverViewAvailableBalance",
        "balanceEntityFromOverviewMargins",
        "availableMargin",
        "Ljava/math/BigDecimal;",
        "availableIsolatedMargin",
        "convertUsdNotionalToSettleCurrency",
        "marginUsdNotional",
        "observeOverViewData",
        "Lcom/kubi/unify/entity/UnifyAccountOverviewEntity;",
        "observeOverViewDataInterval",
        "observeMarginCurrencyLeverage",
        "Lcom/kubi/unify/entity/UnifyCurrencyLeverageWsEntity;",
        "observeMarginMode",
        "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;",
        "transformToPriceMap",
        "dataList",
        "Lcom/kubi/unify/entity/UnifyPriceEntity;",
        "OverviewSnapshot",
        "BUnifyAccountLib_googleRelease"
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
        "SMAP\nUnifyNetworkDataSourceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,520:1\n56#2:521\n59#2:525\n17#2:526\n19#2:530\n56#2:531\n59#2:535\n17#2:536\n19#2:540\n17#2:541\n19#2:545\n56#2:546\n59#2:550\n56#2:551\n59#2:555\n17#2:556\n19#2:560\n56#2:561\n59#2:565\n56#2:566\n59#2:570\n17#2:571\n19#2:575\n56#2:576\n59#2:580\n17#2:581\n19#2:585\n17#2:586\n19#2:590\n17#2:591\n19#2:595\n49#2:596\n51#2:600\n17#2:601\n19#2:605\n49#2:606\n51#2:610\n17#2:611\n19#2:615\n17#2:616\n19#2:620\n49#2:621\n51#2:625\n49#2:626\n51#2:630\n17#2:632\n19#2:636\n49#2:637\n51#2:641\n17#2:642\n19#2:646\n46#3:522\n51#3:524\n46#3:527\n51#3:529\n46#3:532\n51#3:534\n46#3:537\n51#3:539\n46#3:542\n51#3:544\n46#3:547\n51#3:549\n46#3:552\n51#3:554\n46#3:557\n51#3:559\n46#3:562\n51#3:564\n46#3:567\n51#3:569\n46#3:572\n51#3:574\n46#3:577\n51#3:579\n46#3:582\n51#3:584\n46#3:587\n51#3:589\n46#3:592\n51#3:594\n46#3:597\n51#3:599\n46#3:602\n51#3:604\n46#3:607\n51#3:609\n46#3:612\n51#3:614\n46#3:617\n51#3:619\n46#3:622\n51#3:624\n46#3:627\n51#3:629\n46#3:633\n51#3:635\n46#3:638\n51#3:640\n46#3:643\n51#3:645\n105#4:523\n105#4:528\n105#4:533\n105#4:538\n105#4:543\n105#4:548\n105#4:553\n105#4:558\n105#4:563\n105#4:568\n105#4:573\n105#4:578\n105#4:583\n105#4:588\n105#4:593\n105#4:598\n105#4:603\n105#4:608\n105#4:613\n105#4:618\n105#4:623\n105#4:628\n105#4:634\n105#4:639\n105#4:644\n189#5:631\n774#6:647\n865#6,2:648\n1193#6,2:650\n1267#6,4:652\n*S KotlinDebug\n*F\n+ 1 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n97#1:521\n97#1:525\n98#1:526\n98#1:530\n100#1:531\n100#1:535\n105#1:536\n105#1:540\n149#1:541\n149#1:545\n151#1:546\n151#1:550\n202#1:551\n202#1:555\n242#1:556\n242#1:560\n245#1:561\n245#1:565\n272#1:566\n272#1:570\n283#1:571\n283#1:575\n285#1:576\n285#1:580\n292#1:581\n292#1:585\n299#1:586\n299#1:590\n333#1:591\n333#1:595\n343#1:596\n343#1:600\n356#1:601\n356#1:605\n361#1:606\n361#1:610\n368#1:611\n368#1:615\n396#1:616\n396#1:620\n444#1:621\n444#1:625\n445#1:626\n445#1:630\n481#1:632\n481#1:636\n492#1:637\n492#1:641\n510#1:642\n510#1:646\n97#1:522\n97#1:524\n98#1:527\n98#1:529\n100#1:532\n100#1:534\n105#1:537\n105#1:539\n149#1:542\n149#1:544\n151#1:547\n151#1:549\n202#1:552\n202#1:554\n242#1:557\n242#1:559\n245#1:562\n245#1:564\n272#1:567\n272#1:569\n283#1:572\n283#1:574\n285#1:577\n285#1:579\n292#1:582\n292#1:584\n299#1:587\n299#1:589\n333#1:592\n333#1:594\n343#1:597\n343#1:599\n356#1:602\n356#1:604\n361#1:607\n361#1:609\n368#1:612\n368#1:614\n396#1:617\n396#1:619\n444#1:622\n444#1:624\n445#1:627\n445#1:629\n481#1:633\n481#1:635\n492#1:638\n492#1:640\n510#1:643\n510#1:645\n97#1:523\n98#1:528\n100#1:533\n105#1:538\n149#1:543\n151#1:548\n202#1:553\n242#1:558\n245#1:563\n272#1:568\n283#1:573\n285#1:578\n292#1:583\n299#1:588\n333#1:593\n343#1:598\n356#1:603\n361#1:608\n368#1:613\n396#1:618\n444#1:623\n445#1:628\n481#1:634\n492#1:639\n510#1:644\n471#1:631\n517#1:647\n517#1:648,2\n517#1:650,2\n517#1:652,4\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Li60/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Li60/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Li60/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lkotlinx/coroutines/flow/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/m<",
            "Ljava/util/List<",
            "Lcom/kubi/unify/entity/UnifyPositionEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lkotlinx/coroutines/flow/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/n<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Li60/c;Li60/d;Li60/e;Lkotlinx/coroutines/flow/m;)V
    .locals 1
    .param p1    # Li60/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Li60/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Li60/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlinx/coroutines/flow/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li60/c;",
            "Li60/d;",
            "Li60/e;",
            "Lkotlinx/coroutines/flow/m<",
            "Ljava/util/List<",
            "Lcom/kubi/unify/entity/UnifyPositionEntity;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "unifyApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unifyPeriodApi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unifyWsApi"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manualPositionRefreshFlow"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->a:Li60/c;

    .line 3
    iput-object p2, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->b:Li60/d;

    .line 4
    iput-object p3, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->c:Li60/e;

    .line 5
    iput-object p4, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->d:Lkotlinx/coroutines/flow/m;

    .line 6
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    move-result-object p1

    iput-object p1, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->e:Lkotlinx/coroutines/flow/n;

    return-void
.end method

.method public synthetic constructor <init>(Li60/c;Li60/d;Li60/e;Lkotlinx/coroutines/flow/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    .line 7
    const-string v0, "create(...)"

    if-eqz p6, :cond_0

    .line 8
    invoke-static {}, Lmr/a;->d()Lretrofit2/Retrofit;

    move-result-object p1

    .line 9
    const-class p6, Li60/c;

    invoke-virtual {p1, p6}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Li60/c;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    .line 10
    sget-object p2, Lmr/a;->a:Lmr/a;

    invoke-static {p2}, Lhr/c;->a(Lmr/a;)Lretrofit2/Retrofit;

    move-result-object p2

    .line 11
    const-class p6, Li60/d;

    invoke-virtual {p2, p6}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Li60/d;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    .line 12
    new-instance p3, Lcom/kubi/network/restful/b$a;

    invoke-direct {p3}, Lcom/kubi/network/restful/b$a;-><init>()V

    .line 13
    new-instance p6, Lgr/b;

    const-string v0, "network/channel_unified"

    invoke-static {v0}, Ler/b;->e(Ljava/lang/String;)Ler/a;

    move-result-object v0

    invoke-direct {p6, v0}, Lgr/b;-><init>(Ler/a;)V

    invoke-virtual {p3, p6}, Lcom/kubi/network/restful/b$a;->b(Lkr/b;)Lcom/kubi/network/restful/b$a;

    move-result-object p3

    .line 14
    invoke-virtual {p3}, Lcom/kubi/network/restful/b$a;->a()Lcom/kubi/network/restful/b;

    move-result-object p3

    const-class p6, Li60/e;

    invoke-virtual {p3, p6}, Lcom/kubi/network/restful/b;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Li60/e;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    const/4 p4, 0x0

    const/4 p5, 0x5

    const/4 p6, 0x1

    const/4 v0, 0x0

    .line 15
    invoke-static {p4, p6, v0, p5, v0}, Lkotlinx/coroutines/flow/s;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/m;

    move-result-object p4

    .line 16
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;-><init>(Li60/c;Li60/d;Li60/e;Lkotlinx/coroutines/flow/m;)V

    return-void
.end method

.method public static final synthetic j(Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/kubi/unify/entity/UnifyBalanceEntity;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->n(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/kubi/unify/entity/UnifyBalanceEntity;

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
.end method

.method public static final synthetic k(Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;)Lkotlinx/coroutines/flow/n;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->e:Lkotlinx/coroutines/flow/n;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic l(Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;)Li60/c;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->a:Li60/c;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic m(Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;Ljava/util/List;)Ljava/util/Map;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->u(Ljava/util/List;)Ljava/util/Map;

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
.end method


# virtual methods
.method public a()Lkotlinx/coroutines/flow/e;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->c:Li60/e;

    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v2, v1, v2}, Li60/e;->h(Li60/e;Lkr/c;ILjava/lang/Object;)Lkotlinx/coroutines/flow/e;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observerAccountChanged$1;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, v2}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observerAccountChanged$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/g;->h(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    const-wide/high16 v1, 0x3ff8000000000000L    # 1.5

    .line 20
    .line 21
    sget-object v3, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v2, v3}, Lkotlin/time/DurationKt;->toDuration(DLkotlin/time/DurationUnit;)J

    .line 25
    move-result-wide v1

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1, v2}, Lcom/kubi/unify/utils/FlowExKt;->d(Lkotlinx/coroutines/flow/e;J)Lkotlinx/coroutines/flow/e;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observerAccountChanged$$inlined$filter$1;

    .line 32
    .line 33
    .line 34
    invoke-direct {v1, v0}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observerAccountChanged$$inlined$filter$1;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, Lkotlinx/coroutines/flow/g;->v(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 38
    move-result-object v0

    .line 39
    return-object v0
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
.end method

.method public b()Lkotlinx/coroutines/flow/e;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->b:Li60/d;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Li60/d;->b()Lhr/f;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->c:Li60/e;

    .line 9
    const/4 v2, 0x2

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v0, v3, v2, v3}, Li60/e;->p(Li60/e;Lhr/f;Lkr/c;ILjava/lang/Object;)Lkotlinx/coroutines/flow/e;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Lkotlinx/coroutines/flow/g;->E(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    const-wide/16 v4, 0x3e8

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v4, v5}, Lcom/kubi/unify/utils/FlowExKt;->a(Lkotlinx/coroutines/flow/e;J)Lkotlinx/coroutines/flow/e;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    new-instance v4, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeFuturesLeverageData$$inlined$filter$1;

    .line 27
    .line 28
    .line 29
    invoke-direct {v4, v1}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeFuturesLeverageData$$inlined$filter$1;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 30
    .line 31
    new-array v1, v2, [Lkotlinx/coroutines/flow/e;

    .line 32
    const/4 v2, 0x0

    .line 33
    .line 34
    aput-object v0, v1, v2

    .line 35
    const/4 v0, 0x1

    .line 36
    .line 37
    aput-object v4, v1, v0

    .line 38
    .line 39
    .line 40
    invoke-static {v1}, Lkotlinx/coroutines/flow/g;->R([Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeFuturesLeverageData$$inlined$mapNotNull$1;

    .line 44
    .line 45
    .line 46
    invoke-direct {v1, v0}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeFuturesLeverageData$$inlined$mapNotNull$1;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 47
    .line 48
    new-instance v0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeFuturesLeverageData$2;

    .line 49
    .line 50
    .line 51
    invoke-direct {v0, v3}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeFuturesLeverageData$2;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v0}, Lkotlinx/coroutines/flow/g;->a0(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeFuturesLeverageData$3;

    .line 58
    .line 59
    .line 60
    invoke-direct {v1, v3}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeFuturesLeverageData$3;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/g;->h(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeFuturesLeverageData$$inlined$filter$2;

    .line 67
    .line 68
    .line 69
    invoke-direct {v1, v0}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeFuturesLeverageData$$inlined$filter$2;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v1}, Lkotlinx/coroutines/flow/g;->v(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    .line 76
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 77
    move-result-object v1

    .line 78
    .line 79
    .line 80
    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/g;->N(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;

    .line 81
    move-result-object v0

    .line 82
    return-object v0
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
.end method

.method public c()Lkotlinx/coroutines/flow/e;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/unify/entity/UnifyAccountOverviewEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->s()Lkotlinx/coroutines/flow/e;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewData$$inlined$map$1;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v0}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewData$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->o()Lkotlinx/coroutines/flow/e;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    new-instance v2, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewData$$inlined$map$2;

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, v0}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewData$$inlined$map$2;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 19
    const/4 v0, 0x2

    .line 20
    .line 21
    new-array v0, v0, [Lkotlinx/coroutines/flow/e;

    .line 22
    const/4 v3, 0x0

    .line 23
    .line 24
    aput-object v1, v0, v3

    .line 25
    const/4 v1, 0x1

    .line 26
    .line 27
    aput-object v2, v0, v1

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->R([Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewData$3;

    .line 34
    const/4 v2, 0x0

    .line 35
    .line 36
    .line 37
    invoke-direct {v1, v2}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewData$3;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v2, v1}, Lkotlinx/coroutines/flow/g;->c0(Lkotlinx/coroutines/flow/e;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->E(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 45
    move-result-object v0

    .line 46
    return-object v0
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
.end method

.method public d()Lkotlinx/coroutines/flow/e;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->b:Li60/d;

    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v2, v1, v2}, Li60/d;->e(Li60/d;Ljava/lang/String;ILjava/lang/Object;)Lhr/f;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iget-object v3, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->c:Li60/e;

    .line 11
    const/4 v4, 0x2

    .line 12
    .line 13
    .line 14
    invoke-static {v3, v0, v2, v4, v2}, Li60/e;->n(Li60/e;Lhr/f;Lkr/c;ILjava/lang/Object;)Lkotlinx/coroutines/flow/e;

    .line 15
    move-result-object v3

    .line 16
    .line 17
    .line 18
    invoke-static {v3}, Lkotlinx/coroutines/flow/g;->E(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 19
    move-result-object v3

    .line 20
    .line 21
    new-instance v5, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeMarginMode$$inlined$map$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v5, v0}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeMarginMode$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 25
    .line 26
    new-array v0, v4, [Lkotlinx/coroutines/flow/e;

    .line 27
    const/4 v4, 0x0

    .line 28
    .line 29
    aput-object v5, v0, v4

    .line 30
    .line 31
    aput-object v3, v0, v1

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->R([Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeMarginMode$1;

    .line 38
    .line 39
    .line 40
    invoke-direct {v1, v2}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeMarginMode$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/g;->a0(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeMarginMode$2;

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, v2}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeMarginMode$2;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/g;->h(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeMarginMode$$inlined$filter$1;

    .line 56
    .line 57
    .line 58
    invoke-direct {v1, v0}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeMarginMode$$inlined$filter$1;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v1}, Lkotlinx/coroutines/flow/g;->v(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/g;->N(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;

    .line 70
    move-result-object v0

    .line 71
    return-object v0
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
.end method

.method public e()Lkotlinx/coroutines/flow/e;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/util/List<",
            "Lcom/kubi/unify/entity/UnifyFundsInfoEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->q()Lkotlinx/coroutines/flow/e;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->c:Li60/e;

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v3, v2, v3}, Li60/e;->l(Li60/e;Lkr/c;ILjava/lang/Object;)Lkotlinx/coroutines/flow/e;

    .line 12
    move-result-object v1

    .line 13
    const/4 v4, 0x2

    .line 14
    .line 15
    new-array v4, v4, [Lkotlinx/coroutines/flow/e;

    .line 16
    const/4 v5, 0x0

    .line 17
    .line 18
    aput-object v0, v4, v5

    .line 19
    .line 20
    aput-object v1, v4, v2

    .line 21
    .line 22
    .line 23
    invoke-static {v4}, Lkotlinx/coroutines/flow/g;->R([Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeEquity$1;

    .line 27
    .line 28
    .line 29
    invoke-direct {v1, v3}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeEquity$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/g;->a0(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeEquity$$inlined$filter$1;

    .line 36
    .line 37
    .line 38
    invoke-direct {v1, v0}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeEquity$$inlined$filter$1;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 39
    .line 40
    new-instance v0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeEquity$$inlined$mapNotNull$1;

    .line 41
    .line 42
    .line 43
    invoke-direct {v0, v1}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeEquity$$inlined$mapNotNull$1;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 44
    return-object v0
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
.end method

.method public f()Lkotlinx/coroutines/flow/e;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/util/List<",
            "Lcom/kubi/unify/entity/UnifyPositionEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->t()Lkotlinx/coroutines/flow/e;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->o()Lkotlinx/coroutines/flow/e;

    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x2

    .line 10
    .line 11
    new-array v2, v2, [Lkotlinx/coroutines/flow/e;

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    aput-object v0, v2, v3

    .line 15
    const/4 v0, 0x1

    .line 16
    .line 17
    aput-object v1, v2, v0

    .line 18
    .line 19
    .line 20
    invoke-static {v2}, Lkotlinx/coroutines/flow/g;->R([Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observePositions$1;

    .line 24
    const/4 v2, 0x0

    .line 25
    .line 26
    .line 27
    invoke-direct {v1, v2}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observePositions$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/g;->a0(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observePositions$$inlined$filter$1;

    .line 34
    .line 35
    .line 36
    invoke-direct {v1, v0}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observePositions$$inlined$filter$1;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 37
    .line 38
    new-instance v0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observePositions$$inlined$mapNotNull$1;

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, v1}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observePositions$$inlined$mapNotNull$1;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 42
    return-object v0
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
.end method

.method public g()Lkotlinx/coroutines/flow/e;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->b:Li60/d;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Li60/d;->c()Lhr/f;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->c:Li60/e;

    .line 9
    const/4 v2, 0x2

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v0, v3, v2, v3}, Li60/e;->c(Li60/e;Lhr/f;Lkr/c;ILjava/lang/Object;)Lkotlinx/coroutines/flow/e;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    const-wide/16 v4, 0x3e8

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v4, v5}, Lcom/kubi/unify/utils/FlowExKt;->a(Lkotlinx/coroutines/flow/e;J)Lkotlinx/coroutines/flow/e;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    new-instance v4, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeIndexPrices$$inlined$mapNotNull$1;

    .line 23
    .line 24
    .line 25
    invoke-direct {v4, v1, p0}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeIndexPrices$$inlined$mapNotNull$1;-><init>(Lkotlinx/coroutines/flow/e;Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;)V

    .line 26
    .line 27
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeIndexPrices$$inlined$filter$1;

    .line 28
    .line 29
    .line 30
    invoke-direct {v1, v4}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeIndexPrices$$inlined$filter$1;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 31
    .line 32
    new-instance v4, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeIndexPrices$$inlined$mapNotNull$2;

    .line 33
    .line 34
    .line 35
    invoke-direct {v4, v0, p0}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeIndexPrices$$inlined$mapNotNull$2;-><init>(Lkotlinx/coroutines/flow/e;Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;)V

    .line 36
    .line 37
    new-array v0, v2, [Lkotlinx/coroutines/flow/e;

    .line 38
    const/4 v2, 0x0

    .line 39
    .line 40
    aput-object v4, v0, v2

    .line 41
    const/4 v2, 0x1

    .line 42
    .line 43
    aput-object v1, v0, v2

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->R([Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeIndexPrices$2;

    .line 50
    .line 51
    .line 52
    invoke-direct {v1, v3}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeIndexPrices$2;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/g;->a0(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeIndexPrices$3;

    .line 59
    .line 60
    .line 61
    invoke-direct {v1, v3}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeIndexPrices$3;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/g;->h(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeIndexPrices$$inlined$filter$2;

    .line 68
    .line 69
    .line 70
    invoke-direct {v1, v0}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeIndexPrices$$inlined$filter$2;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v1}, Lkotlinx/coroutines/flow/g;->v(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeIndexPrices$5;

    .line 77
    .line 78
    .line 79
    invoke-direct {v1, p0, v3}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeIndexPrices$5;-><init>(Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;Lkotlin/coroutines/Continuation;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/g;->T(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    .line 86
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 87
    move-result-object v1

    .line 88
    .line 89
    .line 90
    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/g;->N(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;

    .line 91
    move-result-object v0

    .line 92
    return-object v0
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
.end method

.method public h(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/unify/entity/UnifyBalanceEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "currency"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeAvailableBalance$periodicApiFlow$1;

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p0, p1, v1}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeAvailableBalance$periodicApiFlow$1;-><init>(Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v2}, Lkotlinx/coroutines/flow/g;->N(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->r(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

    .line 27
    move-result-object v2

    .line 28
    const/4 v3, 0x2

    .line 29
    .line 30
    new-array v3, v3, [Lkotlinx/coroutines/flow/e;

    .line 31
    const/4 v4, 0x0

    .line 32
    .line 33
    aput-object v0, v3, v4

    .line 34
    const/4 v0, 0x1

    .line 35
    .line 36
    aput-object v2, v3, v0

    .line 37
    .line 38
    .line 39
    invoke-static {v3}, Lkotlinx/coroutines/flow/g;->R([Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    new-instance v2, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeAvailableBalance$1;

    .line 43
    .line 44
    .line 45
    invoke-direct {v2, p1, v1}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeAvailableBalance$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1, v2}, Lkotlinx/coroutines/flow/g;->c0(Lkotlinx/coroutines/flow/e;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Lkotlinx/coroutines/flow/g;->E(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    new-instance v0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeAvailableBalance$$inlined$filter$1;

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, p1}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeAvailableBalance$$inlined$filter$1;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->v(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 62
    move-result-object p1

    .line 63
    return-object p1
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
.end method

.method public i()Lkotlinx/coroutines/flow/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/unify/entity/UnifyCurrencyLeverageWsEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->c:Li60/e;

    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v2, v1, v2}, Li60/e;->g(Li60/e;Lkr/c;ILjava/lang/Object;)Lkotlinx/coroutines/flow/e;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->E(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeMarginCurrencyLeverage$$inlined$filter$1;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v0}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeMarginCurrencyLeverage$$inlined$filter$1;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 18
    .line 19
    new-instance v0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeMarginCurrencyLeverage$2;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v2}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeMarginCurrencyLeverage$2;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v0}, Lkotlinx/coroutines/flow/g;->h(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/g;->N(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;

    .line 34
    move-result-object v0

    .line 35
    return-object v0
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
.end method

.method public final n(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/kubi/unify/entity/UnifyBalanceEntity;
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->e:Lkotlinx/coroutines/flow/n;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    new-instance v1, Lcom/kubi/unify/entity/UnifyBalanceEntity;

    .line 17
    .line 18
    const/16 v6, 0xe

    .line 19
    const/4 v7, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    move-object v2, p1

    .line 24
    .line 25
    .line 26
    invoke-direct/range {v1 .. v7}, Lcom/kubi/unify/entity/UnifyBalanceEntity;-><init>(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 27
    return-object v1

    .line 28
    :cond_0
    move-object v2, p1

    .line 29
    .line 30
    new-instance p1, Lcom/kubi/unify/entity/UnifyBalanceEntity;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v2, p2}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->p(Ljava/lang/String;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 34
    move-result-object v4

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v2, p3}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->p(Ljava/lang/String;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 38
    move-result-object v5

    .line 39
    .line 40
    const/16 v7, 0x8

    .line 41
    const/4 v8, 0x0

    .line 42
    const/4 v6, 0x0

    .line 43
    move-object v3, v2

    .line 44
    move-object v2, p1

    .line 45
    .line 46
    .line 47
    invoke-direct/range {v2 .. v8}, Lcom/kubi/unify/entity/UnifyBalanceEntity;-><init>(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 48
    return-object v2
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
.end method

.method public final o()Lkotlinx/coroutines/flow/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/unify/entity/UnifyComposeEntity;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->c:Li60/e;

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1, v2, v1}, Li60/e;->l(Li60/e;Lkr/c;ILjava/lang/Object;)Lkotlinx/coroutines/flow/e;

    .line 8
    move-result-object v0

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
.end method

.method public final p(Ljava/lang/String;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    return-object v0

    .line 5
    .line 6
    :cond_0
    iget-object v1, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->e:Lkotlinx/coroutines/flow/n;

    .line 7
    .line 8
    .line 9
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    check-cast v1, Ljava/util/Map;

    .line 13
    .line 14
    const-string v2, "USD-USDT"

    .line 15
    .line 16
    .line 17
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    const/4 v2, 0x1

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v0, v2, v0}, Lcom/kubi/utils/extensions/DowngradeExKt;->e(Ljava/lang/String;Ljava/math/BigDecimal;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    const-string v3, "USDT"

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    move-result v3

    .line 32
    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    sget-object p1, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :cond_1
    iget-object v3, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->e:Lkotlinx/coroutines/flow/n;

    .line 39
    .line 40
    .line 41
    invoke-interface {v3}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 42
    move-result-object v3

    .line 43
    .line 44
    check-cast v3, Ljava/util/Map;

    .line 45
    .line 46
    new-instance v4, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string p1, "-USDT"

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    .line 64
    invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    check-cast p1, Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    invoke-static {p1, v0, v2, v0}, Lcom/kubi/utils/extensions/DowngradeExKt;->e(Ljava/lang/String;Ljava/math/BigDecimal;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 71
    move-result-object p1

    .line 72
    .line 73
    .line 74
    :goto_0
    invoke-static {p1}, Lkf/a;->B(Ljava/math/BigDecimal;)Z

    .line 75
    move-result v2

    .line 76
    .line 77
    if-eqz v2, :cond_2

    .line 78
    return-object v0

    .line 79
    .line 80
    .line 81
    :cond_2
    invoke-static {p2}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 82
    move-result-object p2

    .line 83
    .line 84
    .line 85
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 86
    .line 87
    sget-object v0, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2, p1, v0}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;Ljava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    const-string p2, "divide(...)"

    .line 94
    .line 95
    .line 96
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v1}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 100
    move-result-object p1

    .line 101
    return-object p1
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
.end method

.method public final q()Lkotlinx/coroutines/flow/e;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/util/List<",
            "Lcom/kubi/unify/entity/UnifyFundsInfoEntity;",
            ">;>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->b:Li60/d;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Li60/d;->a()Lhr/f;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->c:Li60/e;

    .line 9
    const/4 v2, 0x2

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v0, v3, v2, v3}, Li60/e;->d(Li60/e;Lhr/f;Lkr/c;ILjava/lang/Object;)Lkotlinx/coroutines/flow/e;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    new-array v2, v2, [Lkotlinx/coroutines/flow/e;

    .line 17
    const/4 v4, 0x0

    .line 18
    .line 19
    aput-object v0, v2, v4

    .line 20
    const/4 v0, 0x1

    .line 21
    .line 22
    aput-object v1, v2, v0

    .line 23
    .line 24
    .line 25
    invoke-static {v2}, Lkotlinx/coroutines/flow/g;->R([Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeFundsInfoInterval$1;

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v3}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeFundsInfoInterval$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/g;->a0(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeFundsInfoInterval$$inlined$mapNotNull$1;

    .line 38
    .line 39
    .line 40
    invoke-direct {v1, v0}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeFundsInfoInterval$$inlined$mapNotNull$1;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 41
    .line 42
    new-instance v0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeFundsInfoInterval$3;

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, v3}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeFundsInfoInterval$3;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v0}, Lkotlinx/coroutines/flow/g;->h(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->v(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    .line 56
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 57
    move-result-object v1

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/g;->N(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;

    .line 61
    move-result-object v0

    .line 62
    return-object v0
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
.end method

.method public final r(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/unify/entity/UnifyBalanceEntity;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->o()Lkotlinx/coroutines/flow/e;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$map$1;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v0, p1, p0}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/e;Ljava/lang/String;Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;)V

    .line 10
    .line 11
    new-instance v0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$filter$1;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$filter$1;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->s()Lkotlinx/coroutines/flow/e;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    new-instance v2, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$map$2;

    .line 21
    .line 22
    .line 23
    invoke-direct {v2, v1, p0, p1}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$map$2;-><init>(Lkotlinx/coroutines/flow/e;Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;Ljava/lang/String;)V

    .line 24
    .line 25
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$filter$2;

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v2}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$filter$2;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 29
    const/4 v2, 0x2

    .line 30
    .line 31
    new-array v2, v2, [Lkotlinx/coroutines/flow/e;

    .line 32
    const/4 v3, 0x0

    .line 33
    .line 34
    aput-object v0, v2, v3

    .line 35
    const/4 v0, 0x1

    .line 36
    .line 37
    aput-object v1, v2, v0

    .line 38
    .line 39
    .line 40
    invoke-static {v2}, Lkotlinx/coroutines/flow/g;->R([Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$1;

    .line 44
    const/4 v2, 0x0

    .line 45
    .line 46
    .line 47
    invoke-direct {v1, p1, v2}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v2, v1}, Lkotlinx/coroutines/flow/g;->c0(Lkotlinx/coroutines/flow/e;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, Lkotlinx/coroutines/flow/g;->E(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    new-instance v0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$filter$3;

    .line 58
    .line 59
    .line 60
    invoke-direct {v0, p1}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$filter$3;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->v(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 64
    move-result-object p1

    .line 65
    return-object p1
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
.end method

.method public final s()Lkotlinx/coroutines/flow/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/unify/entity/UnifyAccountOverviewEntity;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewDataInterval$1;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewDataInterval$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    new-instance v2, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewDataInterval$$inlined$flatMapLatest$1;

    .line 13
    .line 14
    .line 15
    invoke-direct {v2, v1, p0}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewDataInterval$$inlined$flatMapLatest$1;-><init>(Lkotlin/coroutines/Continuation;Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v2}, Lkotlinx/coroutines/flow/g;->n0(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    new-instance v2, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewDataInterval$3;

    .line 22
    .line 23
    .line 24
    invoke-direct {v2, v1}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewDataInterval$3;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v2}, Lkotlinx/coroutines/flow/g;->h(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/g;->N(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;

    .line 36
    move-result-object v0

    .line 37
    return-object v0
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
.end method

.method public final t()Lkotlinx/coroutines/flow/e;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/util/List<",
            "Lcom/kubi/unify/entity/UnifyPositionEntity;",
            ">;>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->b:Li60/d;

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1, v2, v3}, Li60/d;->d(Li60/d;ZILjava/lang/Object;)Lhr/f;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iget-object v4, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->c:Li60/e;

    .line 12
    const/4 v5, 0x2

    .line 13
    .line 14
    .line 15
    invoke-static {v4, v0, v3, v5, v3}, Li60/e;->a(Li60/e;Lhr/f;Lkr/c;ILjava/lang/Object;)Lkotlinx/coroutines/flow/e;

    .line 16
    move-result-object v4

    .line 17
    .line 18
    iget-object v6, p0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;->d:Lkotlinx/coroutines/flow/m;

    .line 19
    const/4 v7, 0x3

    .line 20
    .line 21
    new-array v7, v7, [Lkotlinx/coroutines/flow/e;

    .line 22
    .line 23
    aput-object v0, v7, v1

    .line 24
    .line 25
    aput-object v4, v7, v2

    .line 26
    .line 27
    aput-object v6, v7, v5

    .line 28
    .line 29
    .line 30
    invoke-static {v7}, Lkotlinx/coroutines/flow/g;->R([Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observePositionsInterval$1;

    .line 34
    .line 35
    .line 36
    invoke-direct {v1, p0, v3}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observePositionsInterval$1;-><init>(Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;Lkotlin/coroutines/Continuation;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/g;->a0(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    new-instance v1, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observePositionsInterval$$inlined$mapNotNull$1;

    .line 43
    .line 44
    .line 45
    invoke-direct {v1, v0}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observePositionsInterval$$inlined$mapNotNull$1;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 46
    .line 47
    new-instance v0, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observePositionsInterval$3;

    .line 48
    .line 49
    .line 50
    invoke-direct {v0, v3}, Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observePositionsInterval$3;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v1, v0}, Lkotlinx/coroutines/flow/g;->h(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->v(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    .line 61
    invoke-static {}, Lcom/kubi/network/api/subscribe/utils/e;->c()Lkotlinx/coroutines/m1;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/g;->N(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;

    .line 66
    move-result-object v0

    .line 67
    return-object v0
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
.end method

.method public final u(Ljava/util/List;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/unify/entity/UnifyPriceEntity;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    move-result v1

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    move-result-object v1

    .line 20
    move-object v2, v1

    .line 21
    .line 22
    check-cast v2, Lcom/kubi/unify/entity/UnifyPriceEntity;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Lcom/kubi/unify/entity/UnifyPriceEntity;->getPrice()Ljava/lang/String;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :cond_1
    const/16 p1, 0xa

    .line 35
    .line 36
    .line 37
    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 38
    move-result p1

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    .line 42
    move-result p1

    .line 43
    .line 44
    const/16 v1, 0x10

    .line 45
    .line 46
    .line 47
    invoke-static {p1, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 48
    move-result p1

    .line 49
    .line 50
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, p1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    .line 60
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    move-result v0

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    .line 66
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    check-cast v0, Lcom/kubi/unify/entity/UnifyPriceEntity;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/kubi/unify/entity/UnifyPriceEntity;->getSymbol()Ljava/lang/String;

    .line 73
    move-result-object v2

    .line 74
    .line 75
    if-nez v2, :cond_2

    .line 76
    .line 77
    const-string v2, ""

    .line 78
    .line 79
    .line 80
    :cond_2
    invoke-virtual {v0}, Lcom/kubi/unify/entity/UnifyPriceEntity;->getPrice()Ljava/lang/String;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    .line 84
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 92
    move-result-object v2

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    .line 99
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    goto :goto_1

    .line 101
    :cond_3
    return-object v1
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
.end method
