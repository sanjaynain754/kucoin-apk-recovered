.class public final Lji/a;
.super Ljava/lang/Object;
.source "PnlCalculatePriceTypeConfig.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u000c\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\u0008\u0010\u000f\u001a\u00020\u0006H\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006J\n\u0010\u0013\u001a\u00020\u0006*\u00020\u0014R\u001c\u0010\u0004\u001a\u0010\u0012\u000c\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00060\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceTypeConfig;",
        "",
        "<init>",
        "()V",
        "pnlCalculatePriceTypeSubject",
        "Lio/reactivex/subjects/BehaviorSubject;",
        "Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceType;",
        "kotlin.jvm.PlatformType",
        "pnlCalculatePriceTypeObs",
        "Lio/reactivex/Observable;",
        "getPnlCalculatePriceTypeObs",
        "()Lio/reactivex/Observable;",
        "isCalculateByMarkPrice",
        "",
        "isCalculateByLatestPrice",
        "getFromCache",
        "updatePnlCalculate",
        "",
        "priceType",
        "toPriceType",
        "",
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


# static fields
.field public static final a:Lji/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lio/reactivex/subjects/BehaviorSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/BehaviorSubject<",
            "Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lji/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lji/a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lji/a;->a:Lji/a;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lji/a;->a()Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceType;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lio/reactivex/subjects/BehaviorSubject;->createDefault(Ljava/lang/Object;)Lio/reactivex/subjects/BehaviorSubject;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    const-string v1, "createDefault(...)"

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    sput-object v0, Lji/a;->b:Lio/reactivex/subjects/BehaviorSubject;

    .line 23
    .line 24
    sput-object v0, Lji/a;->c:Lio/reactivex/Observable;

    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final a()Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceType;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/kumex/utils/g0;->a:Lcom/kubi/kumex/utils/g0;

    .line 3
    .line 4
    const-string v1, "pnl_calculate_price_type"

    .line 5
    .line 6
    const-string v2, "MarkPrice"

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lcom/kubi/kumex/utils/g0;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lji/a;->e(Ljava/lang/String;)Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceType;

    .line 14
    move-result-object v0

    .line 15
    return-object v0
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
.end method

.method public final b()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lji/a;->c:Lio/reactivex/Observable;

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
.end method

.method public final c()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lji/a;->a()Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceType;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-object v1, Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceType;->LatestPrice:Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceType;

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
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
.end method

.method public final d()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lji/a;->a()Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceType;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-object v1, Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceType;->MarkPrice:Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceType;

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
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
.end method

.method public final e(Ljava/lang/String;)Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceType;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "LatestPrice"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    move-result p1

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    sget-object p1, Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceType;->LatestPrice:Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceType;

    .line 16
    return-object p1

    .line 17
    .line 18
    :cond_0
    sget-object p1, Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceType;->MarkPrice:Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceType;

    .line 19
    return-object p1
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
.end method

.method public final f(Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceType;)V
    .locals 3
    .param p1    # Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "priceType"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/kumex/utils/g0;->a:Lcom/kubi/kumex/utils/g0;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    const-string v2, "pnl_calculate_price_type"

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v2, v1}, Lcom/kubi/kumex/utils/g0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    sget-object v0, Lji/a;->b:Lio/reactivex/subjects/BehaviorSubject;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    .line 22
    return-void
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
.end method
