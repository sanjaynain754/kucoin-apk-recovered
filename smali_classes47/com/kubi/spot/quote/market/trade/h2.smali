.class public final Lcom/kubi/spot/quote/market/trade/h2;
.super Ljava/lang/Object;
.source "MarketTradePopup.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rJ\u0010\u0010\u0018\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rH\u0002J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0012\u0010\u001d\u001a\u00020\u00162\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\u0012\u0010\u001d\u001a\u00020\u00162\u0008\u0010\u001e\u001a\u0004\u0018\u00010 H\u0007J\u0012\u0010!\u001a\u0004\u0018\u00010\"2\u0008\u0010#\u001a\u0004\u0018\u00010$J\u0018\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR#\u0010\u000c\u001a\n \u000e*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u000f\u0010\u0010R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"
    }
    d2 = {
        "Lcom/kubi/spot/quote/market/trade/MarketTradePopup;",
        "",
        "fragment",
        "Lcom/kubi/sdk/BaseFragment;",
        "<init>",
        "(Lcom/kubi/sdk/BaseFragment;)V",
        "bkucoinLayoutMarketDetailPopupBinding",
        "Lcom/kubi/spot/databinding/BkucoinLayoutMarketDetailPopupBinding;",
        "getBkucoinLayoutMarketDetailPopupBinding",
        "()Lcom/kubi/spot/databinding/BkucoinLayoutMarketDetailPopupBinding;",
        "setBkucoinLayoutMarketDetailPopupBinding",
        "(Lcom/kubi/spot/databinding/BkucoinLayoutMarketDetailPopupBinding;)V",
        "mContentView",
        "Landroid/view/View;",
        "kotlin.jvm.PlatformType",
        "getMContentView",
        "()Landroid/view/View;",
        "mContentView$delegate",
        "Lkotlin/Lazy;",
        "mPopupWindow",
        "Lcom/kubi/resources/widget/BackgroundDarkPopupWindow;",
        "popUp",
        "",
        "dependView",
        "resetLoc",
        "checkPopup",
        "setContentView",
        "info",
        "Lcom/kubi/spot/quote/market/info/MarketCoinInfo;",
        "setTicker",
        "ticker",
        "Lcom/kubi/spot/quote/market/info/MarketTickerStatsEntity;",
        "Lcom/kubi/spot/quote/market/info/WsMarketTickerStatsEntity;",
        "saveCoverToBigDecimal",
        "Ljava/math/BigDecimal;",
        "string",
        "",
        "showTips",
        "titleId",
        "",
        "tipsId",
        "SpotLib_googleRelease"
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
        "SMAP\nMarketTradePopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketTradePopup.kt\ncom/kubi/spot/quote/market/trade/MarketTradePopup\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n1#2:237\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lcom/kubi/sdk/BaseFragment;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Lt20/t;

.field public final c:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public d:Lcom/kubi/resources/widget/f;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/sdk/BaseFragment;)V
    .locals 1
    .param p1    # Lcom/kubi/sdk/BaseFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "fragment"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/kubi/spot/quote/market/trade/h2;->a:Lcom/kubi/sdk/BaseFragment;

    .line 11
    .line 12
    new-instance p1, Lcom/kubi/spot/quote/market/trade/w1;

    .line 13
    .line 14
    .line 15
    invoke-direct {p1, p0}, Lcom/kubi/spot/quote/market/trade/w1;-><init>(Lcom/kubi/spot/quote/market/trade/h2;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    iput-object p1, p0, Lcom/kubi/spot/quote/market/trade/h2;->c:Lkotlin/Lazy;

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
.end method

.method public static synthetic a(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/quote/market/trade/h2;->q(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;

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
.end method

.method public static synthetic b(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/quote/market/trade/h2;->t(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;

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
.end method

.method public static synthetic c(Lcom/kubi/spot/quote/market/trade/h2;)Landroid/view/View;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/quote/market/trade/h2;->o(Lcom/kubi/spot/quote/market/trade/h2;)Landroid/view/View;

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
.end method

.method public static synthetic d(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/quote/market/trade/h2;->y(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;

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
.end method

.method public static synthetic e(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/quote/market/trade/h2;->v(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;

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
.end method

.method public static synthetic f(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/quote/market/trade/h2;->r(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;

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
.end method

.method public static synthetic g(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/quote/market/trade/h2;->u(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;

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
.end method

.method public static synthetic h(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/quote/market/trade/h2;->x(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;

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
.end method

.method public static synthetic i(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/quote/market/trade/h2;->w(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;

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
.end method

.method public static synthetic j(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/quote/market/trade/h2;->p(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;

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
.end method

.method public static synthetic k(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/quote/market/trade/h2;->s(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;

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
.end method

.method public static final o(Lcom/kubi/spot/quote/market/trade/h2;)Landroid/view/View;
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/spot/quote/market/trade/h2;->a:Lcom/kubi/sdk/BaseFragment;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    sget v1, Lcom/kubi/spot/R$layout;->bkucoin_layout_market_detail_popup:I

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lt20/t;->a(Landroid/view/View;)Lt20/t;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    const-string v2, "bind(...)"

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lcom/kubi/spot/quote/market/trade/h2;->C(Lt20/t;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    iget-object v2, v1, Lt20/t;->q:Lcom/kubi/resources/widget/DashTextView;

    .line 36
    .line 37
    const-string v1, "rankLabel"

    .line 38
    .line 39
    .line 40
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    new-instance v5, Lcom/kubi/spot/quote/market/trade/y1;

    .line 43
    .line 44
    .line 45
    invoke-direct {v5, p0}, Lcom/kubi/spot/quote/market/trade/y1;-><init>(Lcom/kubi/spot/quote/market/trade/h2;)V

    .line 46
    const/4 v6, 0x1

    .line 47
    const/4 v7, 0x0

    .line 48
    .line 49
    const-wide/16 v3, 0x0

    .line 50
    .line 51
    .line 52
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    iget-object v2, v1, Lt20/t;->s:Lcom/kubi/resources/widget/DashTextView;

    .line 59
    .line 60
    const-string v1, "ratingLabel"

    .line 61
    .line 62
    .line 63
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    new-instance v5, Lcom/kubi/spot/quote/market/trade/z1;

    .line 66
    .line 67
    .line 68
    invoke-direct {v5, p0}, Lcom/kubi/spot/quote/market/trade/z1;-><init>(Lcom/kubi/spot/quote/market/trade/h2;)V

    .line 69
    .line 70
    .line 71
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 75
    move-result-object v1

    .line 76
    .line 77
    iget-object v2, v1, Lt20/t;->m:Lcom/kubi/resources/widget/DashTextView;

    .line 78
    .line 79
    const-string v1, "marketValueLabel"

    .line 80
    .line 81
    .line 82
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    new-instance v5, Lcom/kubi/spot/quote/market/trade/a2;

    .line 85
    .line 86
    .line 87
    invoke-direct {v5, p0}, Lcom/kubi/spot/quote/market/trade/a2;-><init>(Lcom/kubi/spot/quote/market/trade/h2;)V

    .line 88
    .line 89
    .line 90
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 94
    move-result-object v1

    .line 95
    .line 96
    iget-object v2, v1, Lt20/t;->o:Lcom/kubi/resources/widget/DashTextView;

    .line 97
    .line 98
    const-string v1, "maxSupplyLabel"

    .line 99
    .line 100
    .line 101
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    new-instance v5, Lcom/kubi/spot/quote/market/trade/b2;

    .line 104
    .line 105
    .line 106
    invoke-direct {v5, p0}, Lcom/kubi/spot/quote/market/trade/b2;-><init>(Lcom/kubi/spot/quote/market/trade/h2;)V

    .line 107
    .line 108
    .line 109
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 113
    move-result-object v1

    .line 114
    .line 115
    iget-object v2, v1, Lt20/t;->k:Lcom/kubi/resources/widget/DashTextView;

    .line 116
    .line 117
    const-string v1, "circulatingSupplyLabel"

    .line 118
    .line 119
    .line 120
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    new-instance v5, Lcom/kubi/spot/quote/market/trade/c2;

    .line 123
    .line 124
    .line 125
    invoke-direct {v5, p0}, Lcom/kubi/spot/quote/market/trade/c2;-><init>(Lcom/kubi/spot/quote/market/trade/h2;)V

    .line 126
    .line 127
    .line 128
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 132
    move-result-object v1

    .line 133
    .line 134
    iget-object v2, v1, Lt20/t;->g:Lcom/kubi/resources/widget/DashTextView;

    .line 135
    .line 136
    const-string v1, "change1hLabel"

    .line 137
    .line 138
    .line 139
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    new-instance v5, Lcom/kubi/spot/quote/market/trade/d2;

    .line 142
    .line 143
    .line 144
    invoke-direct {v5, p0}, Lcom/kubi/spot/quote/market/trade/d2;-><init>(Lcom/kubi/spot/quote/market/trade/h2;)V

    .line 145
    .line 146
    .line 147
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 151
    move-result-object v1

    .line 152
    .line 153
    iget-object v2, v1, Lt20/t;->i:Lcom/kubi/resources/widget/DashTextView;

    .line 154
    .line 155
    const-string v1, "change24hLabel"

    .line 156
    .line 157
    .line 158
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    new-instance v5, Lcom/kubi/spot/quote/market/trade/e2;

    .line 161
    .line 162
    .line 163
    invoke-direct {v5, p0}, Lcom/kubi/spot/quote/market/trade/e2;-><init>(Lcom/kubi/spot/quote/market/trade/h2;)V

    .line 164
    .line 165
    .line 166
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 170
    move-result-object v1

    .line 171
    .line 172
    iget-object v2, v1, Lt20/t;->e:Lcom/kubi/resources/widget/DashTextView;

    .line 173
    .line 174
    const-string v1, "chang7dLabel"

    .line 175
    .line 176
    .line 177
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    new-instance v5, Lcom/kubi/spot/quote/market/trade/f2;

    .line 180
    .line 181
    .line 182
    invoke-direct {v5, p0}, Lcom/kubi/spot/quote/market/trade/f2;-><init>(Lcom/kubi/spot/quote/market/trade/h2;)V

    .line 183
    .line 184
    .line 185
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 189
    move-result-object v1

    .line 190
    .line 191
    iget-object v2, v1, Lt20/t;->c:Lcom/kubi/resources/widget/DashTextView;

    .line 192
    .line 193
    const-string v1, "averagePriceLabel"

    .line 194
    .line 195
    .line 196
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    new-instance v5, Lcom/kubi/spot/quote/market/trade/g2;

    .line 199
    .line 200
    .line 201
    invoke-direct {v5, p0}, Lcom/kubi/spot/quote/market/trade/g2;-><init>(Lcom/kubi/spot/quote/market/trade/h2;)V

    .line 202
    .line 203
    .line 204
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 208
    move-result-object v1

    .line 209
    .line 210
    iget-object v2, v1, Lt20/t;->u:Lcom/kubi/resources/widget/DashTextView;

    .line 211
    .line 212
    const-string v1, "topPriceLabel"

    .line 213
    .line 214
    .line 215
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 216
    .line 217
    new-instance v5, Lcom/kubi/spot/quote/market/trade/x1;

    .line 218
    .line 219
    .line 220
    invoke-direct {v5, p0}, Lcom/kubi/spot/quote/market/trade/x1;-><init>(Lcom/kubi/spot/quote/market/trade/h2;)V

    .line 221
    .line 222
    .line 223
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 224
    return-object v0
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
.end method

.method public static final p(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/spot/R$string;->rank_label:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/spot/R$string;->rank_desc:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/kubi/spot/quote/market/trade/h2;->G(II)V

    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    return-object p0
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
.end method

.method public static final q(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/spot/R$string;->rating_label:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/spot/R$string;->rating_desc:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/kubi/spot/quote/market/trade/h2;->G(II)V

    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    return-object p0
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
.end method

.method public static final r(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/spot/R$string;->market_cap_label:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/spot/R$string;->market_cap_desc:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/kubi/spot/quote/market/trade/h2;->G(II)V

    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    return-object p0
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
.end method

.method public static final s(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/spot/R$string;->max_supply_label:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/spot/R$string;->max_supply_desc:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/kubi/spot/quote/market/trade/h2;->G(II)V

    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    return-object p0
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
.end method

.method public static final t(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/spot/R$string;->max_circulating_label:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/spot/R$string;->max_circulating_desc:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/kubi/spot/quote/market/trade/h2;->G(II)V

    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    return-object p0
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
.end method

.method public static final u(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/spot/R$string;->change_rate_1h_label:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/spot/R$string;->change_rate_1h_desc:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/kubi/spot/quote/market/trade/h2;->G(II)V

    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    return-object p0
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
.end method

.method public static final v(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/spot/R$string;->change_rate_24h_label:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/spot/R$string;->change_rate_24h_desc:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/kubi/spot/quote/market/trade/h2;->G(II)V

    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    return-object p0
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
.end method

.method public static final w(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/spot/R$string;->change_rate_7d_label:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/spot/R$string;->change_rate_7d_desc:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/kubi/spot/quote/market/trade/h2;->G(II)V

    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    return-object p0
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
.end method

.method public static final x(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/spot/R$string;->average_price_label:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/spot/R$string;->average_price_desc:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/kubi/spot/quote/market/trade/h2;->G(II)V

    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    return-object p0
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
.end method

.method public static final y(Lcom/kubi/spot/quote/market/trade/h2;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/spot/R$string;->ath_label:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/spot/R$string;->ath_desc:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/kubi/spot/quote/market/trade/h2;->G(II)V

    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    return-object p0
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
.end method


# virtual methods
.method public final A(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/kubi/spot/quote/market/trade/h2;->l(Landroid/view/View;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/spot/quote/market/trade/h2;->d:Lcom/kubi/resources/widget/f;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lcom/kubi/resources/widget/f;->o(Landroid/view/View;)V

    .line 13
    :cond_0
    return-void
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
.end method

.method public final B(Ljava/lang/String;)Ljava/math/BigDecimal;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-static {p1}, Lcom/kubi/utils/extensions/DowngradeExKt;->f(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 16
    return-object p1
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
.end method

.method public final C(Lt20/t;)V
    .locals 1
    .param p1    # Lt20/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/spot/quote/market/trade/h2;->b:Lt20/t;

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
.end method

.method public final D(Lcom/kubi/spot/quote/market/info/MarketCoinInfo;)V
    .locals 5
    .param p1    # Lcom/kubi/spot/quote/market/info/MarketCoinInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "info"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/h2;->n()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iget-object v0, v0, Lt20/t;->p:Lcom/kubi/resources/widget/BaseTextView;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getRank()Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    const-string v2, "--"

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    new-instance v3, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    const/16 v4, 0x23

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    if-eqz v1, :cond_0

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move-object v1, v2

    .line 44
    .line 45
    .line 46
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    iget-object v0, v0, Lt20/t;->r:Lcom/kubi/resources/widget/BaseTextView;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getRating()Ljava/lang/String;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    .line 59
    invoke-static {v1, v2}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    iget-object v0, v0, Lt20/t;->l:Lcom/kubi/resources/widget/BaseTextView;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getMarketCap()Ljava/lang/String;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v1}, Lcom/kubi/spot/quote/market/trade/h2;->B(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 77
    move-result-object v1

    .line 78
    const/4 v2, 0x0

    .line 79
    .line 80
    if-eqz v1, :cond_1

    .line 81
    .line 82
    const-string v3, "USD"

    .line 83
    .line 84
    .line 85
    invoke-static {v1, v3}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 86
    move-result-wide v3

    .line 87
    .line 88
    new-instance v1, Ljava/math/BigDecimal;

    .line 89
    .line 90
    .line 91
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 92
    move-result-object v3

    .line 93
    .line 94
    .line 95
    invoke-direct {v1, v3}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 96
    goto :goto_1

    .line 97
    :cond_1
    move-object v1, v2

    .line 98
    :goto_1
    const/4 v3, 0x1

    .line 99
    .line 100
    .line 101
    invoke-static {v1, v3}, Lkf/a;->d(Ljava/math/BigDecimal;Z)Ljava/lang/String;

    .line 102
    move-result-object v1

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 109
    move-result-object v0

    .line 110
    .line 111
    iget-object v0, v0, Lt20/t;->n:Lcom/kubi/resources/widget/BaseTextView;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getMaxSupply()Ljava/lang/String;

    .line 115
    move-result-object v1

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, v1}, Lcom/kubi/spot/quote/market/trade/h2;->B(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 119
    move-result-object v1

    .line 120
    const/4 v4, 0x0

    .line 121
    .line 122
    .line 123
    invoke-static {v1, v4, v3, v2}, Lkf/a;->e(Ljava/math/BigDecimal;ZILjava/lang/Object;)Ljava/lang/String;

    .line 124
    move-result-object v1

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 131
    move-result-object v0

    .line 132
    .line 133
    iget-object v0, v0, Lt20/t;->j:Lcom/kubi/resources/widget/BaseTextView;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getCirculatingSupply()Ljava/lang/String;

    .line 137
    move-result-object p1

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, p1}, Lcom/kubi/spot/quote/market/trade/h2;->B(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 141
    move-result-object p1

    .line 142
    .line 143
    .line 144
    invoke-static {p1, v4, v3, v2}, Lkf/a;->e(Ljava/math/BigDecimal;ZILjava/lang/Object;)Ljava/lang/String;

    .line 145
    move-result-object p1

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 149
    return-void
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
.end method

.method public final E(Lcom/kubi/spot/quote/market/info/MarketTickerStatsEntity;)V
    .locals 20
    .param p1    # Lcom/kubi/spot/quote/market/info/MarketTickerStatsEntity;
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
    if-nez p1, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/h2;->n()Landroid/view/View;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    iget-object v2, v2, Lt20/t;->f:Lcom/kubi/resources/widget/UpDownTextView;

    .line 16
    .line 17
    .line 18
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/quote/market/info/MarketTickerStatsEntity;->getPriceChangeRate1h()Ljava/lang/String;

    .line 19
    move-result-object v3

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v3}, Lcom/kubi/spot/quote/market/trade/h2;->B(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 23
    move-result-object v4

    .line 24
    const/4 v3, 0x0

    .line 25
    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    const/16 v11, 0x37

    .line 29
    const/4 v12, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x0

    .line 33
    const/4 v8, 0x1

    .line 34
    const/4 v9, 0x0

    .line 35
    const/4 v10, 0x0

    .line 36
    .line 37
    .line 38
    invoke-static/range {v4 .. v12}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 39
    move-result-object v4

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v4, v3

    .line 42
    .line 43
    .line 44
    :goto_0
    invoke-static {v4}, Llf/b;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    move-result-object v4

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    iget-object v2, v2, Lt20/t;->f:Lcom/kubi/resources/widget/UpDownTextView;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 58
    move-result-object v4

    .line 59
    .line 60
    const-string v10, "getContext(...)"

    .line 61
    .line 62
    .line 63
    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/quote/market/info/MarketTickerStatsEntity;->getPriceChangeRate1h()Ljava/lang/String;

    .line 67
    move-result-object v5

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v5}, Lcom/kubi/spot/quote/market/trade/h2;->B(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 71
    move-result-object v5

    .line 72
    .line 73
    .line 74
    invoke-static {v5}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 75
    move-result-wide v5

    .line 76
    const/4 v8, 0x2

    .line 77
    const/4 v9, 0x0

    .line 78
    const/4 v7, 0x0

    .line 79
    .line 80
    .line 81
    invoke-static/range {v4 .. v9}, Lcom/kubi/resources/g;->d(Landroid/content/Context;DIILjava/lang/Object;)I

    .line 82
    move-result v4

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 89
    move-result-object v2

    .line 90
    .line 91
    iget-object v2, v2, Lt20/t;->h:Lcom/kubi/resources/widget/UpDownTextView;

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/quote/market/info/MarketTickerStatsEntity;->getPriceChangeRate24h()Ljava/lang/String;

    .line 95
    move-result-object v4

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v4}, Lcom/kubi/spot/quote/market/trade/h2;->B(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 99
    move-result-object v11

    .line 100
    .line 101
    if-eqz v11, :cond_2

    .line 102
    .line 103
    const/16 v18, 0x37

    .line 104
    .line 105
    const/16 v19, 0x0

    .line 106
    const/4 v12, 0x0

    .line 107
    const/4 v13, 0x0

    .line 108
    const/4 v14, 0x0

    .line 109
    const/4 v15, 0x1

    .line 110
    .line 111
    const/16 v16, 0x0

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    .line 116
    invoke-static/range {v11 .. v19}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 117
    move-result-object v4

    .line 118
    goto :goto_1

    .line 119
    :cond_2
    move-object v4, v3

    .line 120
    .line 121
    .line 122
    :goto_1
    invoke-static {v4}, Llf/b;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    move-result-object v4

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 130
    move-result-object v2

    .line 131
    .line 132
    iget-object v2, v2, Lt20/t;->h:Lcom/kubi/resources/widget/UpDownTextView;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 136
    move-result-object v4

    .line 137
    .line 138
    .line 139
    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/quote/market/info/MarketTickerStatsEntity;->getPriceChangeRate24h()Ljava/lang/String;

    .line 143
    move-result-object v5

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v5}, Lcom/kubi/spot/quote/market/trade/h2;->B(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 147
    move-result-object v5

    .line 148
    .line 149
    .line 150
    invoke-static {v5}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 151
    move-result-wide v5

    .line 152
    const/4 v8, 0x2

    .line 153
    const/4 v9, 0x0

    .line 154
    const/4 v7, 0x0

    .line 155
    .line 156
    .line 157
    invoke-static/range {v4 .. v9}, Lcom/kubi/resources/g;->d(Landroid/content/Context;DIILjava/lang/Object;)I

    .line 158
    move-result v4

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 165
    move-result-object v2

    .line 166
    .line 167
    iget-object v2, v2, Lt20/t;->d:Lcom/kubi/resources/widget/UpDownTextView;

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/quote/market/info/MarketTickerStatsEntity;->getPriceChangeRate7d()Ljava/lang/String;

    .line 171
    move-result-object v4

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, v4}, Lcom/kubi/spot/quote/market/trade/h2;->B(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 175
    move-result-object v11

    .line 176
    .line 177
    if-eqz v11, :cond_3

    .line 178
    .line 179
    const/16 v18, 0x37

    .line 180
    .line 181
    const/16 v19, 0x0

    .line 182
    const/4 v12, 0x0

    .line 183
    const/4 v13, 0x0

    .line 184
    const/4 v14, 0x0

    .line 185
    const/4 v15, 0x1

    .line 186
    .line 187
    const/16 v16, 0x0

    .line 188
    .line 189
    const/16 v17, 0x0

    .line 190
    .line 191
    .line 192
    invoke-static/range {v11 .. v19}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 193
    move-result-object v4

    .line 194
    goto :goto_2

    .line 195
    :cond_3
    move-object v4, v3

    .line 196
    .line 197
    .line 198
    :goto_2
    invoke-static {v4}, Llf/b;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 199
    move-result-object v4

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 206
    move-result-object v2

    .line 207
    .line 208
    iget-object v2, v2, Lt20/t;->d:Lcom/kubi/resources/widget/UpDownTextView;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 212
    move-result-object v4

    .line 213
    .line 214
    .line 215
    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/quote/market/info/MarketTickerStatsEntity;->getPriceChangeRate7d()Ljava/lang/String;

    .line 219
    move-result-object v1

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, v1}, Lcom/kubi/spot/quote/market/trade/h2;->B(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 223
    move-result-object v1

    .line 224
    .line 225
    .line 226
    invoke-static {v1}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 227
    move-result-wide v5

    .line 228
    const/4 v8, 0x2

    .line 229
    const/4 v9, 0x0

    .line 230
    const/4 v7, 0x0

    .line 231
    .line 232
    .line 233
    invoke-static/range {v4 .. v9}, Lcom/kubi/resources/g;->d(Landroid/content/Context;DIILjava/lang/Object;)I

    .line 234
    move-result v1

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 241
    move-result-object v1

    .line 242
    .line 243
    iget-object v1, v1, Lt20/t;->b:Lcom/kubi/resources/widget/BaseTextView;

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/quote/market/info/MarketTickerStatsEntity;->getPriceAvg24h()Ljava/lang/String;

    .line 247
    move-result-object v2

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, v2}, Lcom/kubi/spot/quote/market/trade/h2;->B(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 251
    move-result-object v4

    .line 252
    .line 253
    if-eqz v4, :cond_4

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/quote/market/info/MarketTickerStatsEntity;->getSymbol()Ljava/lang/String;

    .line 257
    move-result-object v5

    .line 258
    .line 259
    const/16 v12, 0x6e

    .line 260
    const/4 v13, 0x0

    .line 261
    const/4 v6, 0x0

    .line 262
    const/4 v7, 0x0

    .line 263
    const/4 v8, 0x0

    .line 264
    const/4 v9, 0x1

    .line 265
    const/4 v10, 0x0

    .line 266
    const/4 v11, 0x0

    .line 267
    .line 268
    .line 269
    invoke-static/range {v4 .. v13}, Lgf/j;->d(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 270
    move-result-object v2

    .line 271
    goto :goto_3

    .line 272
    :cond_4
    move-object v2, v3

    .line 273
    .line 274
    :goto_3
    const-string v4, "--"

    .line 275
    .line 276
    .line 277
    invoke-static {v2, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 278
    move-result-object v2

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 285
    move-result-object v1

    .line 286
    .line 287
    iget-object v1, v1, Lt20/t;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/quote/market/info/MarketTickerStatsEntity;->getHigh()Ljava/lang/String;

    .line 291
    move-result-object v2

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0, v2}, Lcom/kubi/spot/quote/market/trade/h2;->B(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 295
    move-result-object v2

    .line 296
    .line 297
    if-eqz v2, :cond_5

    .line 298
    .line 299
    const-string v3, "USD"

    .line 300
    .line 301
    .line 302
    invoke-static {v2, v3}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 303
    move-result-wide v5

    .line 304
    .line 305
    const/16 v14, 0x5f

    .line 306
    const/4 v15, 0x0

    .line 307
    const/4 v7, 0x0

    .line 308
    const/4 v8, 0x0

    .line 309
    const/4 v9, 0x0

    .line 310
    const/4 v10, 0x0

    .line 311
    const/4 v11, 0x0

    .line 312
    const/4 v12, 0x1

    .line 313
    const/4 v13, 0x0

    .line 314
    .line 315
    .line 316
    invoke-static/range {v5 .. v15}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 317
    move-result-object v3

    .line 318
    .line 319
    .line 320
    :cond_5
    invoke-static {v3, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 321
    move-result-object v2

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 325
    return-void
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
.end method

.method public final F(Lcom/kubi/spot/quote/market/info/WsMarketTickerStatsEntity;)V
    .locals 20
    .param p1    # Lcom/kubi/spot/quote/market/info/WsMarketTickerStatsEntity;
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
    if-nez p1, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/h2;->n()Landroid/view/View;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    iget-object v2, v2, Lt20/t;->f:Lcom/kubi/resources/widget/UpDownTextView;

    .line 16
    .line 17
    .line 18
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/quote/market/info/WsMarketTickerStatsEntity;->getPriceChangeRate1h()Ljava/lang/String;

    .line 19
    move-result-object v3

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v3}, Lcom/kubi/spot/quote/market/trade/h2;->B(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 23
    move-result-object v4

    .line 24
    const/4 v3, 0x0

    .line 25
    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    const/16 v11, 0x37

    .line 29
    const/4 v12, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x0

    .line 33
    const/4 v8, 0x1

    .line 34
    const/4 v9, 0x0

    .line 35
    const/4 v10, 0x0

    .line 36
    .line 37
    .line 38
    invoke-static/range {v4 .. v12}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 39
    move-result-object v4

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v4, v3

    .line 42
    .line 43
    .line 44
    :goto_0
    invoke-static {v4}, Llf/b;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    move-result-object v4

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    iget-object v2, v2, Lt20/t;->f:Lcom/kubi/resources/widget/UpDownTextView;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 58
    move-result-object v4

    .line 59
    .line 60
    const-string v10, "getContext(...)"

    .line 61
    .line 62
    .line 63
    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/quote/market/info/WsMarketTickerStatsEntity;->getPriceChangeRate1h()Ljava/lang/String;

    .line 67
    move-result-object v5

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v5}, Lcom/kubi/spot/quote/market/trade/h2;->B(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 71
    move-result-object v5

    .line 72
    .line 73
    .line 74
    invoke-static {v5}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 75
    move-result-wide v5

    .line 76
    const/4 v8, 0x2

    .line 77
    const/4 v9, 0x0

    .line 78
    const/4 v7, 0x0

    .line 79
    .line 80
    .line 81
    invoke-static/range {v4 .. v9}, Lcom/kubi/resources/g;->d(Landroid/content/Context;DIILjava/lang/Object;)I

    .line 82
    move-result v4

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 89
    move-result-object v2

    .line 90
    .line 91
    iget-object v2, v2, Lt20/t;->h:Lcom/kubi/resources/widget/UpDownTextView;

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/quote/market/info/WsMarketTickerStatsEntity;->getPriceChangeRate24h()Ljava/lang/String;

    .line 95
    move-result-object v4

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v4}, Lcom/kubi/spot/quote/market/trade/h2;->B(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 99
    move-result-object v11

    .line 100
    .line 101
    if-eqz v11, :cond_2

    .line 102
    .line 103
    const/16 v18, 0x37

    .line 104
    .line 105
    const/16 v19, 0x0

    .line 106
    const/4 v12, 0x0

    .line 107
    const/4 v13, 0x0

    .line 108
    const/4 v14, 0x0

    .line 109
    const/4 v15, 0x1

    .line 110
    .line 111
    const/16 v16, 0x0

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    .line 116
    invoke-static/range {v11 .. v19}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 117
    move-result-object v4

    .line 118
    goto :goto_1

    .line 119
    :cond_2
    move-object v4, v3

    .line 120
    .line 121
    .line 122
    :goto_1
    invoke-static {v4}, Llf/b;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    move-result-object v4

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 130
    move-result-object v2

    .line 131
    .line 132
    iget-object v2, v2, Lt20/t;->h:Lcom/kubi/resources/widget/UpDownTextView;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 136
    move-result-object v4

    .line 137
    .line 138
    .line 139
    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/quote/market/info/WsMarketTickerStatsEntity;->getPriceChangeRate24h()Ljava/lang/String;

    .line 143
    move-result-object v5

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v5}, Lcom/kubi/spot/quote/market/trade/h2;->B(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 147
    move-result-object v5

    .line 148
    .line 149
    .line 150
    invoke-static {v5}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 151
    move-result-wide v5

    .line 152
    const/4 v8, 0x2

    .line 153
    const/4 v9, 0x0

    .line 154
    const/4 v7, 0x0

    .line 155
    .line 156
    .line 157
    invoke-static/range {v4 .. v9}, Lcom/kubi/resources/g;->d(Landroid/content/Context;DIILjava/lang/Object;)I

    .line 158
    move-result v4

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 165
    move-result-object v2

    .line 166
    .line 167
    iget-object v2, v2, Lt20/t;->d:Lcom/kubi/resources/widget/UpDownTextView;

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/quote/market/info/WsMarketTickerStatsEntity;->getPriceChangeRate7d()Ljava/lang/String;

    .line 171
    move-result-object v4

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, v4}, Lcom/kubi/spot/quote/market/trade/h2;->B(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 175
    move-result-object v11

    .line 176
    .line 177
    if-eqz v11, :cond_3

    .line 178
    .line 179
    const/16 v18, 0x37

    .line 180
    .line 181
    const/16 v19, 0x0

    .line 182
    const/4 v12, 0x0

    .line 183
    const/4 v13, 0x0

    .line 184
    const/4 v14, 0x0

    .line 185
    const/4 v15, 0x1

    .line 186
    .line 187
    const/16 v16, 0x0

    .line 188
    .line 189
    const/16 v17, 0x0

    .line 190
    .line 191
    .line 192
    invoke-static/range {v11 .. v19}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 193
    move-result-object v4

    .line 194
    goto :goto_2

    .line 195
    :cond_3
    move-object v4, v3

    .line 196
    .line 197
    .line 198
    :goto_2
    invoke-static {v4}, Llf/b;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 199
    move-result-object v4

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 206
    move-result-object v2

    .line 207
    .line 208
    iget-object v2, v2, Lt20/t;->d:Lcom/kubi/resources/widget/UpDownTextView;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 212
    move-result-object v4

    .line 213
    .line 214
    .line 215
    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/quote/market/info/WsMarketTickerStatsEntity;->getPriceChangeRate7d()Ljava/lang/String;

    .line 219
    move-result-object v1

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, v1}, Lcom/kubi/spot/quote/market/trade/h2;->B(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 223
    move-result-object v1

    .line 224
    .line 225
    .line 226
    invoke-static {v1}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 227
    move-result-wide v5

    .line 228
    const/4 v8, 0x2

    .line 229
    const/4 v9, 0x0

    .line 230
    const/4 v7, 0x0

    .line 231
    .line 232
    .line 233
    invoke-static/range {v4 .. v9}, Lcom/kubi/resources/g;->d(Landroid/content/Context;DIILjava/lang/Object;)I

    .line 234
    move-result v1

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 241
    move-result-object v1

    .line 242
    .line 243
    iget-object v1, v1, Lt20/t;->b:Lcom/kubi/resources/widget/BaseTextView;

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/quote/market/info/WsMarketTickerStatsEntity;->getPriceAvg24h()Ljava/lang/String;

    .line 247
    move-result-object v2

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, v2}, Lcom/kubi/spot/quote/market/trade/h2;->B(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 251
    move-result-object v4

    .line 252
    .line 253
    if-eqz v4, :cond_4

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/quote/market/info/WsMarketTickerStatsEntity;->getSymbol()Ljava/lang/String;

    .line 257
    move-result-object v5

    .line 258
    .line 259
    const/16 v12, 0x6e

    .line 260
    const/4 v13, 0x0

    .line 261
    const/4 v6, 0x0

    .line 262
    const/4 v7, 0x0

    .line 263
    const/4 v8, 0x0

    .line 264
    const/4 v9, 0x1

    .line 265
    const/4 v10, 0x0

    .line 266
    const/4 v11, 0x0

    .line 267
    .line 268
    .line 269
    invoke-static/range {v4 .. v13}, Lgf/j;->d(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 270
    move-result-object v2

    .line 271
    goto :goto_3

    .line 272
    :cond_4
    move-object v2, v3

    .line 273
    .line 274
    :goto_3
    const-string v4, "--"

    .line 275
    .line 276
    .line 277
    invoke-static {v2, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 278
    move-result-object v2

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/h2;->m()Lt20/t;

    .line 285
    move-result-object v1

    .line 286
    .line 287
    iget-object v1, v1, Lt20/t;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/quote/market/info/WsMarketTickerStatsEntity;->getHigh()Ljava/lang/String;

    .line 291
    move-result-object v2

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0, v2}, Lcom/kubi/spot/quote/market/trade/h2;->B(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 295
    move-result-object v2

    .line 296
    .line 297
    if-eqz v2, :cond_5

    .line 298
    .line 299
    const-string v3, "USD"

    .line 300
    .line 301
    .line 302
    invoke-static {v2, v3}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 303
    move-result-wide v5

    .line 304
    .line 305
    const/16 v14, 0x5f

    .line 306
    const/4 v15, 0x0

    .line 307
    const/4 v7, 0x0

    .line 308
    const/4 v8, 0x0

    .line 309
    const/4 v9, 0x0

    .line 310
    const/4 v10, 0x0

    .line 311
    const/4 v11, 0x0

    .line 312
    const/4 v12, 0x1

    .line 313
    const/4 v13, 0x0

    .line 314
    .line 315
    .line 316
    invoke-static/range {v5 .. v15}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 317
    move-result-object v3

    .line 318
    .line 319
    .line 320
    :cond_5
    invoke-static {v3, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 321
    move-result-object v2

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 325
    return-void
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
.end method

.method public final G(II)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    new-array v1, v1, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    move-result-object p2

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->M4(Ljava/lang/CharSequence;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    sget p2, Lcom/kubi/spot/R$string;->already_know:I

    .line 26
    const/4 v0, 0x0

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2, v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->S4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    iget-object p2, p0, Lcom/kubi/spot/quote/market/trade/h2;->a:Lcom/kubi/sdk/BaseFragment;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 36
    move-result-object p2

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, p2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->c5(Landroidx/fragment/app/FragmentManager;)V

    .line 40
    return-void
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
.end method

.method public final l(Landroid/view/View;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/spot/quote/market/trade/h2;->d:Lcom/kubi/resources/widget/f;

    .line 3
    .line 4
    if-nez v0, :cond_4

    .line 5
    .line 6
    new-instance v0, Lcom/kubi/resources/widget/f;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/h2;->n()Landroid/view/View;

    .line 10
    move-result-object v1

    .line 11
    const/4 v2, -0x1

    .line 12
    const/4 v3, -0x2

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2, v3}, Lcom/kubi/resources/widget/f;-><init>(Landroid/view/View;II)V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/kubi/spot/quote/market/trade/h2;->d:Lcom/kubi/resources/widget/f;

    .line 18
    const/4 v1, 0x1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 22
    .line 23
    iget-object v0, p0, Lcom/kubi/spot/quote/market/trade/h2;->d:Lcom/kubi/resources/widget/f;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 28
    .line 29
    .line 30
    invoke-direct {v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 34
    .line 35
    :cond_0
    iget-object v0, p0, Lcom/kubi/spot/quote/market/trade/h2;->d:Lcom/kubi/resources/widget/f;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    sget v1, Lcom/kubi/spot/R$style;->TopInOutAnimation:I

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 43
    .line 44
    :cond_1
    iget-object v0, p0, Lcom/kubi/spot/quote/market/trade/h2;->d:Lcom/kubi/resources/widget/f;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    .line 49
    const v1, 0x3e4ccccd    # 0.2f

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/f;->q(F)V

    .line 53
    .line 54
    :cond_2
    iget-object v0, p0, Lcom/kubi/spot/quote/market/trade/h2;->d:Lcom/kubi/resources/widget/f;

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/kubi/resources/widget/f;->n()V

    .line 60
    .line 61
    :cond_3
    iget-object v0, p0, Lcom/kubi/spot/quote/market/trade/h2;->d:Lcom/kubi/resources/widget/f;

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p1}, Lcom/kubi/resources/widget/f;->h(Landroid/view/View;)V

    .line 67
    :cond_4
    return-void
    .line 68
    .line 69
    .line 70
.end method

.method public final m()Lt20/t;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/spot/quote/market/trade/h2;->b:Lt20/t;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-object v0

    .line 6
    .line 7
    :cond_0
    const-string v0, "bkucoinLayoutMarketDetailPopupBinding"

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
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
.end method

.method public final n()Landroid/view/View;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/spot/quote/market/trade/h2;->c:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Landroid/view/View;

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
.end method

.method public final z(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "dependView"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/kubi/spot/quote/market/trade/h2;->l(Landroid/view/View;)V

    .line 9
    .line 10
    iget-object v0, p0, Lcom/kubi/spot/quote/market/trade/h2;->d:Lcom/kubi/resources/widget/f;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/kubi/resources/widget/f;->h(Landroid/view/View;)V

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/kubi/spot/quote/market/trade/h2;->d:Lcom/kubi/resources/widget/f;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    const/4 v1, 0x0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1, v1, v1}, Lcom/kubi/resources/widget/f;->showAsDropDown(Landroid/view/View;II)V

    .line 24
    :cond_1
    return-void
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
.end method
