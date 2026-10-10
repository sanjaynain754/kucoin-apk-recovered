.class public final Lcom/kubi/margin/market/trade/q0;
.super Ljava/lang/Object;
.source "MarginMarketTradePopup.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tJ\u0010\u0010\u0014\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0012\u0010\u0019\u001a\u00020\u00122\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u0012\u0010\u0019\u001a\u00020\u00122\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001cH\u0007J\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R#\u0010\u0008\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000b\u0010\u000cR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lcom/kubi/margin/market/trade/MarginMarketTradePopup;",
        "",
        "fragment",
        "Lcom/kubi/sdk/BaseFragment;",
        "<init>",
        "(Lcom/kubi/sdk/BaseFragment;)V",
        "bmarginLayoutMarketDetailPopupBinding",
        "Lcom/kubi/margin/databinding/BmarginLayoutMarketDetailPopupBinding;",
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
        "Lcom/kubi/margin/market/info/MarketCoinInfo;",
        "setTicker",
        "ticker",
        "Lcom/kubi/margin/market/info/MarketTickerStatsEntity;",
        "Lcom/kubi/margin/market/info/WsMarketTickerStatsEntity;",
        "showTips",
        "titleId",
        "",
        "tipsId",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMarginMarketTradePopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginMarketTradePopup.kt\ncom/kubi/margin/market/trade/MarginMarketTradePopup\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1#2:208\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lcom/kubi/sdk/BaseFragment;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Ldp/q0;

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
    iput-object p1, p0, Lcom/kubi/margin/market/trade/q0;->a:Lcom/kubi/sdk/BaseFragment;

    .line 11
    .line 12
    new-instance p1, Lcom/kubi/margin/market/trade/f0;

    .line 13
    .line 14
    .line 15
    invoke-direct {p1, p0}, Lcom/kubi/margin/market/trade/f0;-><init>(Lcom/kubi/margin/market/trade/q0;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    iput-object p1, p0, Lcom/kubi/margin/market/trade/q0;->c:Lkotlin/Lazy;

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
.end method

.method public static synthetic a(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/market/trade/q0;->q(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;

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
.end method

.method public static synthetic b(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/market/trade/q0;->t(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;

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
.end method

.method public static synthetic c(Lcom/kubi/margin/market/trade/q0;)Landroid/view/View;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/market/trade/q0;->n(Lcom/kubi/margin/market/trade/q0;)Landroid/view/View;

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
.end method

.method public static synthetic d(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/market/trade/q0;->w(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;

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
.end method

.method public static synthetic e(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/market/trade/q0;->x(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;

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
.end method

.method public static synthetic f(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/market/trade/q0;->v(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;

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
.end method

.method public static synthetic g(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/market/trade/q0;->o(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;

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
.end method

.method public static synthetic h(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/market/trade/q0;->r(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;

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
.end method

.method public static synthetic i(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/market/trade/q0;->p(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;

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
.end method

.method public static synthetic j(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/market/trade/q0;->s(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;

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
.end method

.method public static synthetic k(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/market/trade/q0;->u(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;

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
.end method

.method public static final n(Lcom/kubi/margin/market/trade/q0;)Landroid/view/View;
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/margin/market/trade/q0;->a:Lcom/kubi/sdk/BaseFragment;

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
    sget v1, Lcom/kubi/margin/R$layout;->bmargin_layout_market_detail_popup:I

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
    invoke-static {v0}, Ldp/q0;->a(Landroid/view/View;)Ldp/q0;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    const-string v3, "bind(...)"

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    iput-object v1, p0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 29
    .line 30
    const-string v3, "bmarginLayoutMarketDetailPopupBinding"

    .line 31
    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    .line 35
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 36
    move-object v1, v2

    .line 37
    .line 38
    :cond_0
    iget-object v4, v1, Ldp/q0;->q:Lcom/kubi/resources/widget/DashTextView;

    .line 39
    .line 40
    const-string v1, "rankLabel"

    .line 41
    .line 42
    .line 43
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    new-instance v7, Lcom/kubi/margin/market/trade/h0;

    .line 46
    .line 47
    .line 48
    invoke-direct {v7, p0}, Lcom/kubi/margin/market/trade/h0;-><init>(Lcom/kubi/margin/market/trade/q0;)V

    .line 49
    const/4 v8, 0x1

    .line 50
    const/4 v9, 0x0

    .line 51
    .line 52
    const-wide/16 v5, 0x0

    .line 53
    .line 54
    .line 55
    invoke-static/range {v4 .. v9}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 56
    .line 57
    iget-object v1, p0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 58
    .line 59
    if-nez v1, :cond_1

    .line 60
    .line 61
    .line 62
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 63
    move-object v1, v2

    .line 64
    .line 65
    :cond_1
    iget-object v4, v1, Ldp/q0;->s:Lcom/kubi/resources/widget/DashTextView;

    .line 66
    .line 67
    const-string v1, "ratingLabel"

    .line 68
    .line 69
    .line 70
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    new-instance v7, Lcom/kubi/margin/market/trade/i0;

    .line 73
    .line 74
    .line 75
    invoke-direct {v7, p0}, Lcom/kubi/margin/market/trade/i0;-><init>(Lcom/kubi/margin/market/trade/q0;)V

    .line 76
    const/4 v8, 0x1

    .line 77
    const/4 v9, 0x0

    .line 78
    .line 79
    const-wide/16 v5, 0x0

    .line 80
    .line 81
    .line 82
    invoke-static/range {v4 .. v9}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 83
    .line 84
    iget-object v1, p0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 85
    .line 86
    if-nez v1, :cond_2

    .line 87
    .line 88
    .line 89
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 90
    move-object v1, v2

    .line 91
    .line 92
    :cond_2
    iget-object v4, v1, Ldp/q0;->m:Lcom/kubi/resources/widget/DashTextView;

    .line 93
    .line 94
    const-string v1, "marketValueLabel"

    .line 95
    .line 96
    .line 97
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    new-instance v7, Lcom/kubi/margin/market/trade/j0;

    .line 100
    .line 101
    .line 102
    invoke-direct {v7, p0}, Lcom/kubi/margin/market/trade/j0;-><init>(Lcom/kubi/margin/market/trade/q0;)V

    .line 103
    const/4 v8, 0x1

    .line 104
    const/4 v9, 0x0

    .line 105
    .line 106
    const-wide/16 v5, 0x0

    .line 107
    .line 108
    .line 109
    invoke-static/range {v4 .. v9}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 110
    .line 111
    iget-object v1, p0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 112
    .line 113
    if-nez v1, :cond_3

    .line 114
    .line 115
    .line 116
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 117
    move-object v1, v2

    .line 118
    .line 119
    :cond_3
    iget-object v4, v1, Ldp/q0;->o:Lcom/kubi/resources/widget/DashTextView;

    .line 120
    .line 121
    const-string v1, "maxSupplyLabel"

    .line 122
    .line 123
    .line 124
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    .line 126
    new-instance v7, Lcom/kubi/margin/market/trade/k0;

    .line 127
    .line 128
    .line 129
    invoke-direct {v7, p0}, Lcom/kubi/margin/market/trade/k0;-><init>(Lcom/kubi/margin/market/trade/q0;)V

    .line 130
    const/4 v8, 0x1

    .line 131
    const/4 v9, 0x0

    .line 132
    .line 133
    const-wide/16 v5, 0x0

    .line 134
    .line 135
    .line 136
    invoke-static/range {v4 .. v9}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 137
    .line 138
    iget-object v1, p0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 139
    .line 140
    if-nez v1, :cond_4

    .line 141
    .line 142
    .line 143
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 144
    move-object v1, v2

    .line 145
    .line 146
    :cond_4
    iget-object v4, v1, Ldp/q0;->k:Lcom/kubi/resources/widget/DashTextView;

    .line 147
    .line 148
    const-string v1, "circulatingSupplyLabel"

    .line 149
    .line 150
    .line 151
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    .line 153
    new-instance v7, Lcom/kubi/margin/market/trade/l0;

    .line 154
    .line 155
    .line 156
    invoke-direct {v7, p0}, Lcom/kubi/margin/market/trade/l0;-><init>(Lcom/kubi/margin/market/trade/q0;)V

    .line 157
    const/4 v8, 0x1

    .line 158
    const/4 v9, 0x0

    .line 159
    .line 160
    const-wide/16 v5, 0x0

    .line 161
    .line 162
    .line 163
    invoke-static/range {v4 .. v9}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 164
    .line 165
    iget-object v1, p0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 166
    .line 167
    if-nez v1, :cond_5

    .line 168
    .line 169
    .line 170
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 171
    move-object v1, v2

    .line 172
    .line 173
    :cond_5
    iget-object v4, v1, Ldp/q0;->g:Lcom/kubi/resources/widget/DashTextView;

    .line 174
    .line 175
    const-string v1, "change1hLabel"

    .line 176
    .line 177
    .line 178
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    .line 180
    new-instance v7, Lcom/kubi/margin/market/trade/m0;

    .line 181
    .line 182
    .line 183
    invoke-direct {v7, p0}, Lcom/kubi/margin/market/trade/m0;-><init>(Lcom/kubi/margin/market/trade/q0;)V

    .line 184
    const/4 v8, 0x1

    .line 185
    const/4 v9, 0x0

    .line 186
    .line 187
    const-wide/16 v5, 0x0

    .line 188
    .line 189
    .line 190
    invoke-static/range {v4 .. v9}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 191
    .line 192
    iget-object v1, p0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 193
    .line 194
    if-nez v1, :cond_6

    .line 195
    .line 196
    .line 197
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 198
    move-object v1, v2

    .line 199
    .line 200
    :cond_6
    iget-object v4, v1, Ldp/q0;->i:Lcom/kubi/resources/widget/DashTextView;

    .line 201
    .line 202
    const-string v1, "change24hLabel"

    .line 203
    .line 204
    .line 205
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    .line 207
    new-instance v7, Lcom/kubi/margin/market/trade/n0;

    .line 208
    .line 209
    .line 210
    invoke-direct {v7, p0}, Lcom/kubi/margin/market/trade/n0;-><init>(Lcom/kubi/margin/market/trade/q0;)V

    .line 211
    const/4 v8, 0x1

    .line 212
    const/4 v9, 0x0

    .line 213
    .line 214
    const-wide/16 v5, 0x0

    .line 215
    .line 216
    .line 217
    invoke-static/range {v4 .. v9}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 218
    .line 219
    iget-object v1, p0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 220
    .line 221
    if-nez v1, :cond_7

    .line 222
    .line 223
    .line 224
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 225
    move-object v1, v2

    .line 226
    .line 227
    :cond_7
    iget-object v4, v1, Ldp/q0;->e:Lcom/kubi/resources/widget/DashTextView;

    .line 228
    .line 229
    const-string v1, "chang7dLabel"

    .line 230
    .line 231
    .line 232
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 233
    .line 234
    new-instance v7, Lcom/kubi/margin/market/trade/o0;

    .line 235
    .line 236
    .line 237
    invoke-direct {v7, p0}, Lcom/kubi/margin/market/trade/o0;-><init>(Lcom/kubi/margin/market/trade/q0;)V

    .line 238
    const/4 v8, 0x1

    .line 239
    const/4 v9, 0x0

    .line 240
    .line 241
    const-wide/16 v5, 0x0

    .line 242
    .line 243
    .line 244
    invoke-static/range {v4 .. v9}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 245
    .line 246
    iget-object v1, p0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 247
    .line 248
    if-nez v1, :cond_8

    .line 249
    .line 250
    .line 251
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 252
    move-object v1, v2

    .line 253
    .line 254
    :cond_8
    iget-object v4, v1, Ldp/q0;->c:Lcom/kubi/resources/widget/DashTextView;

    .line 255
    .line 256
    const-string v1, "averagePriceLabel"

    .line 257
    .line 258
    .line 259
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    .line 261
    new-instance v7, Lcom/kubi/margin/market/trade/p0;

    .line 262
    .line 263
    .line 264
    invoke-direct {v7, p0}, Lcom/kubi/margin/market/trade/p0;-><init>(Lcom/kubi/margin/market/trade/q0;)V

    .line 265
    const/4 v8, 0x1

    .line 266
    const/4 v9, 0x0

    .line 267
    .line 268
    const-wide/16 v5, 0x0

    .line 269
    .line 270
    .line 271
    invoke-static/range {v4 .. v9}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 272
    .line 273
    iget-object v1, p0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 274
    .line 275
    if-nez v1, :cond_9

    .line 276
    .line 277
    .line 278
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 279
    goto :goto_0

    .line 280
    :cond_9
    move-object v2, v1

    .line 281
    .line 282
    :goto_0
    iget-object v3, v2, Ldp/q0;->u:Lcom/kubi/resources/widget/DashTextView;

    .line 283
    .line 284
    const-string v1, "topPriceLabel"

    .line 285
    .line 286
    .line 287
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    .line 289
    new-instance v6, Lcom/kubi/margin/market/trade/g0;

    .line 290
    .line 291
    .line 292
    invoke-direct {v6, p0}, Lcom/kubi/margin/market/trade/g0;-><init>(Lcom/kubi/margin/market/trade/q0;)V

    .line 293
    const/4 v7, 0x1

    .line 294
    const/4 v8, 0x0

    .line 295
    .line 296
    const-wide/16 v4, 0x0

    .line 297
    .line 298
    .line 299
    invoke-static/range {v3 .. v8}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 300
    return-object v0
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
.end method

.method public static final o(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/margin/R$string;->rank_label:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/margin/R$string;->rank_desc:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/kubi/margin/market/trade/q0;->D(II)V

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
.end method

.method public static final p(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/margin/R$string;->rating_label:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/margin/R$string;->rating_desc:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/kubi/margin/market/trade/q0;->D(II)V

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
.end method

.method public static final q(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/margin/R$string;->market_cap_label:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/margin/R$string;->market_cap_desc:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/kubi/margin/market/trade/q0;->D(II)V

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
.end method

.method public static final r(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/margin/R$string;->max_supply_label:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/margin/R$string;->max_supply_desc:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/kubi/margin/market/trade/q0;->D(II)V

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
.end method

.method public static final s(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/margin/R$string;->max_circulating_label:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/margin/R$string;->max_circulating_desc:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/kubi/margin/market/trade/q0;->D(II)V

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
.end method

.method public static final t(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/margin/R$string;->change_rate_1h_label:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/margin/R$string;->change_rate_1h_desc:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/kubi/margin/market/trade/q0;->D(II)V

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
.end method

.method public static final u(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/margin/R$string;->change_rate_24h_label:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/margin/R$string;->change_rate_24h_desc:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/kubi/margin/market/trade/q0;->D(II)V

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
.end method

.method public static final v(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/margin/R$string;->change_rate_7d_label:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/margin/R$string;->change_rate_7d_desc:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/kubi/margin/market/trade/q0;->D(II)V

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
.end method

.method public static final w(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/margin/R$string;->average_price_label:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/margin/R$string;->average_price_desc:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/kubi/margin/market/trade/q0;->D(II)V

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
.end method

.method public static final x(Lcom/kubi/margin/market/trade/q0;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/margin/R$string;->ath_label:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/margin/R$string;->ath_desc:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/kubi/margin/market/trade/q0;->D(II)V

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
.end method


# virtual methods
.method public final A(Lcom/kubi/margin/market/info/MarketCoinInfo;)V
    .locals 7
    .param p1    # Lcom/kubi/margin/market/info/MarketCoinInfo;
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
    invoke-virtual {p0}, Lcom/kubi/margin/market/trade/q0;->m()Landroid/view/View;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 11
    .line 12
    const-string v1, "bmarginLayoutMarketDetailPopupBinding"

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 19
    move-object v0, v2

    .line 20
    .line 21
    :cond_0
    iget-object v0, v0, Ldp/q0;->p:Lcom/kubi/resources/widget/BaseTextView;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getRank()Ljava/lang/String;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    const-string v4, "--"

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    new-instance v5, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    const/16 v6, 0x23

    .line 37
    .line 38
    .line 39
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    move-result-object v3

    .line 47
    .line 48
    if-eqz v3, :cond_1

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move-object v3, v4

    .line 51
    .line 52
    .line 53
    :goto_0
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    .line 55
    iget-object v0, p0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 56
    .line 57
    if-nez v0, :cond_2

    .line 58
    .line 59
    .line 60
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 61
    move-object v0, v2

    .line 62
    .line 63
    :cond_2
    iget-object v0, v0, Ldp/q0;->r:Lcom/kubi/resources/widget/BaseTextView;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getRating()Ljava/lang/String;

    .line 67
    move-result-object v3

    .line 68
    .line 69
    .line 70
    invoke-static {v3, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    move-result-object v3

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    iget-object v0, p0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 77
    .line 78
    if-nez v0, :cond_3

    .line 79
    .line 80
    .line 81
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 82
    move-object v0, v2

    .line 83
    .line 84
    :cond_3
    iget-object v0, v0, Ldp/q0;->l:Lcom/kubi/resources/widget/BaseTextView;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getMarketCap()Ljava/lang/String;

    .line 88
    move-result-object v3

    .line 89
    .line 90
    .line 91
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->k(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 92
    move-result-object v3

    .line 93
    .line 94
    if-eqz v3, :cond_4

    .line 95
    .line 96
    const-string v4, "USD"

    .line 97
    .line 98
    .line 99
    invoke-static {v3, v4}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 100
    move-result-wide v3

    .line 101
    .line 102
    new-instance v5, Ljava/math/BigDecimal;

    .line 103
    .line 104
    .line 105
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 106
    move-result-object v3

    .line 107
    .line 108
    .line 109
    invoke-direct {v5, v3}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 110
    goto :goto_1

    .line 111
    :cond_4
    move-object v5, v2

    .line 112
    :goto_1
    const/4 v3, 0x1

    .line 113
    .line 114
    .line 115
    invoke-static {v5, v3}, Lkf/a;->d(Ljava/math/BigDecimal;Z)Ljava/lang/String;

    .line 116
    move-result-object v4

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 120
    .line 121
    iget-object v0, p0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 122
    .line 123
    if-nez v0, :cond_5

    .line 124
    .line 125
    .line 126
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 127
    move-object v0, v2

    .line 128
    .line 129
    :cond_5
    iget-object v0, v0, Ldp/q0;->n:Lcom/kubi/resources/widget/BaseTextView;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getMaxSupply()Ljava/lang/String;

    .line 133
    move-result-object v4

    .line 134
    .line 135
    .line 136
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->k(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 137
    move-result-object v4

    .line 138
    const/4 v5, 0x0

    .line 139
    .line 140
    .line 141
    invoke-static {v4, v5, v3, v2}, Lkf/a;->e(Ljava/math/BigDecimal;ZILjava/lang/Object;)Ljava/lang/String;

    .line 142
    move-result-object v4

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 146
    .line 147
    iget-object v0, p0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 148
    .line 149
    if-nez v0, :cond_6

    .line 150
    .line 151
    .line 152
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 153
    move-object v0, v2

    .line 154
    .line 155
    :cond_6
    iget-object v0, v0, Ldp/q0;->j:Lcom/kubi/resources/widget/BaseTextView;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getCirculatingSupply()Ljava/lang/String;

    .line 159
    move-result-object p1

    .line 160
    .line 161
    .line 162
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->k(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 163
    move-result-object p1

    .line 164
    .line 165
    .line 166
    invoke-static {p1, v5, v3, v2}, Lkf/a;->e(Ljava/math/BigDecimal;ZILjava/lang/Object;)Ljava/lang/String;

    .line 167
    move-result-object p1

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    return-void
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
.end method

.method public final B(Lcom/kubi/margin/market/info/MarketTickerStatsEntity;)V
    .locals 17
    .param p1    # Lcom/kubi/margin/market/info/MarketTickerStatsEntity;
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
    invoke-virtual {v0}, Lcom/kubi/margin/market/trade/q0;->m()Landroid/view/View;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    iget-object v2, v0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 12
    .line 13
    const-string v3, "bmarginLayoutMarketDetailPopupBinding"

    .line 14
    const/4 v4, 0x0

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 20
    move-object v2, v4

    .line 21
    .line 22
    :cond_1
    iget-object v2, v2, Ldp/q0;->f:Lcom/kubi/resources/widget/UpDownTextView;

    .line 23
    .line 24
    .line 25
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/market/info/MarketTickerStatsEntity;->getPriceChangeRate1h()Ljava/lang/String;

    .line 26
    move-result-object v5

    .line 27
    .line 28
    .line 29
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->k(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 30
    move-result-object v5

    .line 31
    .line 32
    if-eqz v5, :cond_2

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/math/BigDecimal;->doubleValue()D

    .line 36
    move-result-wide v5

    .line 37
    .line 38
    .line 39
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 40
    move-result-object v5

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    move-object v5, v4

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 46
    move-result-object v6

    .line 47
    .line 48
    const-string v12, "getContext(...)"

    .line 49
    .line 50
    .line 51
    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/market/info/MarketTickerStatsEntity;->getPriceChangeRate1h()Ljava/lang/String;

    .line 55
    move-result-object v7

    .line 56
    .line 57
    .line 58
    invoke-static {v7}, Lcom/kubi/utils/extensions/f;->k(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 59
    move-result-object v7

    .line 60
    .line 61
    .line 62
    invoke-static {v7}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 63
    move-result-wide v7

    .line 64
    const/4 v10, 0x2

    .line 65
    const/4 v11, 0x0

    .line 66
    const/4 v9, 0x0

    .line 67
    .line 68
    .line 69
    invoke-static/range {v6 .. v11}, Lcom/kubi/resources/g;->d(Landroid/content/Context;DIILjava/lang/Object;)I

    .line 70
    move-result v6

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v5, v6}, Lcom/kubi/resources/widget/UpDownTextView;->g(Ljava/lang/Double;I)V

    .line 74
    .line 75
    iget-object v2, v0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 76
    .line 77
    if-nez v2, :cond_3

    .line 78
    .line 79
    .line 80
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 81
    move-object v2, v4

    .line 82
    .line 83
    :cond_3
    iget-object v2, v2, Ldp/q0;->h:Lcom/kubi/resources/widget/UpDownTextView;

    .line 84
    .line 85
    .line 86
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/market/info/MarketTickerStatsEntity;->getPriceChangeRate24h()Ljava/lang/String;

    .line 87
    move-result-object v5

    .line 88
    .line 89
    .line 90
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->k(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 91
    move-result-object v5

    .line 92
    .line 93
    if-eqz v5, :cond_4

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5}, Ljava/math/BigDecimal;->doubleValue()D

    .line 97
    move-result-wide v5

    .line 98
    .line 99
    .line 100
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 101
    move-result-object v5

    .line 102
    goto :goto_1

    .line 103
    :cond_4
    move-object v5, v4

    .line 104
    .line 105
    .line 106
    :goto_1
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 107
    move-result-object v6

    .line 108
    .line 109
    .line 110
    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/market/info/MarketTickerStatsEntity;->getPriceChangeRate24h()Ljava/lang/String;

    .line 114
    move-result-object v7

    .line 115
    .line 116
    .line 117
    invoke-static {v7}, Lcom/kubi/utils/extensions/f;->k(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 118
    move-result-object v7

    .line 119
    .line 120
    .line 121
    invoke-static {v7}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 122
    move-result-wide v7

    .line 123
    const/4 v10, 0x2

    .line 124
    const/4 v11, 0x0

    .line 125
    const/4 v9, 0x0

    .line 126
    .line 127
    .line 128
    invoke-static/range {v6 .. v11}, Lcom/kubi/resources/g;->d(Landroid/content/Context;DIILjava/lang/Object;)I

    .line 129
    move-result v6

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, v5, v6}, Lcom/kubi/resources/widget/UpDownTextView;->g(Ljava/lang/Double;I)V

    .line 133
    .line 134
    iget-object v2, v0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 135
    .line 136
    if-nez v2, :cond_5

    .line 137
    .line 138
    .line 139
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 140
    move-object v2, v4

    .line 141
    .line 142
    :cond_5
    iget-object v2, v2, Ldp/q0;->d:Lcom/kubi/resources/widget/UpDownTextView;

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/market/info/MarketTickerStatsEntity;->getPriceChangeRate7d()Ljava/lang/String;

    .line 146
    move-result-object v5

    .line 147
    .line 148
    .line 149
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->k(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 150
    move-result-object v5

    .line 151
    .line 152
    if-eqz v5, :cond_6

    .line 153
    .line 154
    .line 155
    invoke-virtual {v5}, Ljava/math/BigDecimal;->doubleValue()D

    .line 156
    move-result-wide v5

    .line 157
    .line 158
    .line 159
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 160
    move-result-object v5

    .line 161
    goto :goto_2

    .line 162
    :cond_6
    move-object v5, v4

    .line 163
    .line 164
    .line 165
    :goto_2
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 166
    move-result-object v6

    .line 167
    .line 168
    .line 169
    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/market/info/MarketTickerStatsEntity;->getPriceChangeRate7d()Ljava/lang/String;

    .line 173
    move-result-object v1

    .line 174
    .line 175
    .line 176
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->k(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 177
    move-result-object v1

    .line 178
    .line 179
    .line 180
    invoke-static {v1}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 181
    move-result-wide v7

    .line 182
    const/4 v10, 0x2

    .line 183
    const/4 v11, 0x0

    .line 184
    const/4 v9, 0x0

    .line 185
    .line 186
    .line 187
    invoke-static/range {v6 .. v11}, Lcom/kubi/resources/g;->d(Landroid/content/Context;DIILjava/lang/Object;)I

    .line 188
    move-result v1

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, v5, v1}, Lcom/kubi/resources/widget/UpDownTextView;->g(Ljava/lang/Double;I)V

    .line 192
    .line 193
    iget-object v1, v0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 194
    .line 195
    if-nez v1, :cond_7

    .line 196
    .line 197
    .line 198
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 199
    move-object v1, v4

    .line 200
    .line 201
    :cond_7
    iget-object v1, v1, Ldp/q0;->b:Lcom/kubi/resources/widget/BaseTextView;

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/market/info/MarketTickerStatsEntity;->getPriceAvg24h()Ljava/lang/String;

    .line 205
    move-result-object v2

    .line 206
    .line 207
    .line 208
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->k(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 209
    move-result-object v5

    .line 210
    .line 211
    if-eqz v5, :cond_8

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/market/info/MarketTickerStatsEntity;->getSymbol()Ljava/lang/String;

    .line 215
    move-result-object v6

    .line 216
    .line 217
    const/16 v13, 0x6e

    .line 218
    const/4 v14, 0x0

    .line 219
    const/4 v7, 0x0

    .line 220
    const/4 v8, 0x0

    .line 221
    const/4 v9, 0x0

    .line 222
    const/4 v10, 0x1

    .line 223
    const/4 v11, 0x0

    .line 224
    const/4 v12, 0x0

    .line 225
    .line 226
    .line 227
    invoke-static/range {v5 .. v14}, Lgf/j;->d(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 228
    move-result-object v2

    .line 229
    goto :goto_3

    .line 230
    :cond_8
    move-object v2, v4

    .line 231
    .line 232
    :goto_3
    const-string v5, "--"

    .line 233
    .line 234
    .line 235
    invoke-static {v2, v5}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 236
    move-result-object v2

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 240
    .line 241
    iget-object v1, v0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 242
    .line 243
    if-nez v1, :cond_9

    .line 244
    .line 245
    .line 246
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 247
    move-object v1, v4

    .line 248
    .line 249
    :cond_9
    iget-object v1, v1, Ldp/q0;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/market/info/MarketTickerStatsEntity;->getHigh()Ljava/lang/String;

    .line 253
    move-result-object v2

    .line 254
    .line 255
    .line 256
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->k(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 257
    move-result-object v2

    .line 258
    .line 259
    if-eqz v2, :cond_a

    .line 260
    .line 261
    const-string v3, "USD"

    .line 262
    .line 263
    .line 264
    invoke-static {v2, v3}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 265
    move-result-wide v6

    .line 266
    .line 267
    const/16 v15, 0x5f

    .line 268
    .line 269
    const/16 v16, 0x0

    .line 270
    const/4 v8, 0x0

    .line 271
    const/4 v9, 0x0

    .line 272
    const/4 v10, 0x0

    .line 273
    const/4 v11, 0x0

    .line 274
    const/4 v12, 0x0

    .line 275
    const/4 v13, 0x1

    .line 276
    const/4 v14, 0x0

    .line 277
    .line 278
    .line 279
    invoke-static/range {v6 .. v16}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 280
    move-result-object v4

    .line 281
    .line 282
    .line 283
    :cond_a
    invoke-static {v4, v5}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 284
    move-result-object v2

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 288
    return-void
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
.end method

.method public final C(Lcom/kubi/margin/market/info/WsMarketTickerStatsEntity;)V
    .locals 17
    .param p1    # Lcom/kubi/margin/market/info/WsMarketTickerStatsEntity;
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
    invoke-virtual {v0}, Lcom/kubi/margin/market/trade/q0;->m()Landroid/view/View;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    iget-object v2, v0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 12
    .line 13
    const-string v3, "bmarginLayoutMarketDetailPopupBinding"

    .line 14
    const/4 v4, 0x0

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 20
    move-object v2, v4

    .line 21
    .line 22
    :cond_1
    iget-object v2, v2, Ldp/q0;->f:Lcom/kubi/resources/widget/UpDownTextView;

    .line 23
    .line 24
    .line 25
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/market/info/WsMarketTickerStatsEntity;->getPriceChangeRate1h()Ljava/lang/String;

    .line 26
    move-result-object v5

    .line 27
    .line 28
    .line 29
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->k(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 30
    move-result-object v5

    .line 31
    .line 32
    if-eqz v5, :cond_2

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/math/BigDecimal;->doubleValue()D

    .line 36
    move-result-wide v5

    .line 37
    .line 38
    .line 39
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 40
    move-result-object v5

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    move-object v5, v4

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 46
    move-result-object v6

    .line 47
    .line 48
    const-string v12, "getContext(...)"

    .line 49
    .line 50
    .line 51
    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/market/info/WsMarketTickerStatsEntity;->getPriceChangeRate1h()Ljava/lang/String;

    .line 55
    move-result-object v7

    .line 56
    .line 57
    .line 58
    invoke-static {v7}, Lcom/kubi/utils/extensions/f;->k(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 59
    move-result-object v7

    .line 60
    .line 61
    .line 62
    invoke-static {v7}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 63
    move-result-wide v7

    .line 64
    const/4 v10, 0x2

    .line 65
    const/4 v11, 0x0

    .line 66
    const/4 v9, 0x0

    .line 67
    .line 68
    .line 69
    invoke-static/range {v6 .. v11}, Lcom/kubi/resources/g;->d(Landroid/content/Context;DIILjava/lang/Object;)I

    .line 70
    move-result v6

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v5, v6}, Lcom/kubi/resources/widget/UpDownTextView;->g(Ljava/lang/Double;I)V

    .line 74
    .line 75
    iget-object v2, v0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 76
    .line 77
    if-nez v2, :cond_3

    .line 78
    .line 79
    .line 80
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 81
    move-object v2, v4

    .line 82
    .line 83
    :cond_3
    iget-object v2, v2, Ldp/q0;->h:Lcom/kubi/resources/widget/UpDownTextView;

    .line 84
    .line 85
    .line 86
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/market/info/WsMarketTickerStatsEntity;->getPriceChangeRate24h()Ljava/lang/String;

    .line 87
    move-result-object v5

    .line 88
    .line 89
    .line 90
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->k(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 91
    move-result-object v5

    .line 92
    .line 93
    if-eqz v5, :cond_4

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5}, Ljava/math/BigDecimal;->doubleValue()D

    .line 97
    move-result-wide v5

    .line 98
    .line 99
    .line 100
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 101
    move-result-object v5

    .line 102
    goto :goto_1

    .line 103
    :cond_4
    move-object v5, v4

    .line 104
    .line 105
    .line 106
    :goto_1
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 107
    move-result-object v6

    .line 108
    .line 109
    .line 110
    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/market/info/WsMarketTickerStatsEntity;->getPriceChangeRate24h()Ljava/lang/String;

    .line 114
    move-result-object v7

    .line 115
    .line 116
    .line 117
    invoke-static {v7}, Lcom/kubi/utils/extensions/f;->k(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 118
    move-result-object v7

    .line 119
    .line 120
    .line 121
    invoke-static {v7}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 122
    move-result-wide v7

    .line 123
    const/4 v10, 0x2

    .line 124
    const/4 v11, 0x0

    .line 125
    const/4 v9, 0x0

    .line 126
    .line 127
    .line 128
    invoke-static/range {v6 .. v11}, Lcom/kubi/resources/g;->d(Landroid/content/Context;DIILjava/lang/Object;)I

    .line 129
    move-result v6

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, v5, v6}, Lcom/kubi/resources/widget/UpDownTextView;->g(Ljava/lang/Double;I)V

    .line 133
    .line 134
    iget-object v2, v0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 135
    .line 136
    if-nez v2, :cond_5

    .line 137
    .line 138
    .line 139
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 140
    move-object v2, v4

    .line 141
    .line 142
    :cond_5
    iget-object v2, v2, Ldp/q0;->d:Lcom/kubi/resources/widget/UpDownTextView;

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/market/info/WsMarketTickerStatsEntity;->getPriceChangeRate7d()Ljava/lang/String;

    .line 146
    move-result-object v5

    .line 147
    .line 148
    .line 149
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->k(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 150
    move-result-object v5

    .line 151
    .line 152
    if-eqz v5, :cond_6

    .line 153
    .line 154
    .line 155
    invoke-virtual {v5}, Ljava/math/BigDecimal;->doubleValue()D

    .line 156
    move-result-wide v5

    .line 157
    .line 158
    .line 159
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 160
    move-result-object v5

    .line 161
    goto :goto_2

    .line 162
    :cond_6
    move-object v5, v4

    .line 163
    .line 164
    .line 165
    :goto_2
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 166
    move-result-object v6

    .line 167
    .line 168
    .line 169
    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/market/info/WsMarketTickerStatsEntity;->getPriceChangeRate7d()Ljava/lang/String;

    .line 173
    move-result-object v1

    .line 174
    .line 175
    .line 176
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->k(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 177
    move-result-object v1

    .line 178
    .line 179
    .line 180
    invoke-static {v1}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 181
    move-result-wide v7

    .line 182
    const/4 v10, 0x2

    .line 183
    const/4 v11, 0x0

    .line 184
    const/4 v9, 0x0

    .line 185
    .line 186
    .line 187
    invoke-static/range {v6 .. v11}, Lcom/kubi/resources/g;->d(Landroid/content/Context;DIILjava/lang/Object;)I

    .line 188
    move-result v1

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, v5, v1}, Lcom/kubi/resources/widget/UpDownTextView;->g(Ljava/lang/Double;I)V

    .line 192
    .line 193
    iget-object v1, v0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 194
    .line 195
    if-nez v1, :cond_7

    .line 196
    .line 197
    .line 198
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 199
    move-object v1, v4

    .line 200
    .line 201
    :cond_7
    iget-object v1, v1, Ldp/q0;->b:Lcom/kubi/resources/widget/BaseTextView;

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/market/info/WsMarketTickerStatsEntity;->getPriceAvg24h()Ljava/lang/String;

    .line 205
    move-result-object v2

    .line 206
    .line 207
    .line 208
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->k(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 209
    move-result-object v5

    .line 210
    .line 211
    if-eqz v5, :cond_8

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/market/info/WsMarketTickerStatsEntity;->getSymbol()Ljava/lang/String;

    .line 215
    move-result-object v6

    .line 216
    .line 217
    const/16 v13, 0x6e

    .line 218
    const/4 v14, 0x0

    .line 219
    const/4 v7, 0x0

    .line 220
    const/4 v8, 0x0

    .line 221
    const/4 v9, 0x0

    .line 222
    const/4 v10, 0x1

    .line 223
    const/4 v11, 0x0

    .line 224
    const/4 v12, 0x0

    .line 225
    .line 226
    .line 227
    invoke-static/range {v5 .. v14}, Lgf/j;->d(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 228
    move-result-object v2

    .line 229
    goto :goto_3

    .line 230
    :cond_8
    move-object v2, v4

    .line 231
    .line 232
    :goto_3
    const-string v5, "--"

    .line 233
    .line 234
    .line 235
    invoke-static {v2, v5}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 236
    move-result-object v2

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 240
    .line 241
    iget-object v1, v0, Lcom/kubi/margin/market/trade/q0;->b:Ldp/q0;

    .line 242
    .line 243
    if-nez v1, :cond_9

    .line 244
    .line 245
    .line 246
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 247
    move-object v1, v4

    .line 248
    .line 249
    :cond_9
    iget-object v1, v1, Ldp/q0;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/market/info/WsMarketTickerStatsEntity;->getHigh()Ljava/lang/String;

    .line 253
    move-result-object v2

    .line 254
    .line 255
    .line 256
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->k(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 257
    move-result-object v2

    .line 258
    .line 259
    if-eqz v2, :cond_a

    .line 260
    .line 261
    const-string v3, "USD"

    .line 262
    .line 263
    .line 264
    invoke-static {v2, v3}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 265
    move-result-wide v6

    .line 266
    .line 267
    const/16 v15, 0x5f

    .line 268
    .line 269
    const/16 v16, 0x0

    .line 270
    const/4 v8, 0x0

    .line 271
    const/4 v9, 0x0

    .line 272
    const/4 v10, 0x0

    .line 273
    const/4 v11, 0x0

    .line 274
    const/4 v12, 0x0

    .line 275
    const/4 v13, 0x1

    .line 276
    const/4 v14, 0x0

    .line 277
    .line 278
    .line 279
    invoke-static/range {v6 .. v16}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 280
    move-result-object v4

    .line 281
    .line 282
    .line 283
    :cond_a
    invoke-static {v4, v5}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 284
    move-result-object v2

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 288
    return-void
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
.end method

.method public final D(II)V
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
    sget p2, Lcom/kubi/margin/R$string;->already_know:I

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
    iget-object p2, p0, Lcom/kubi/margin/market/trade/q0;->a:Lcom/kubi/sdk/BaseFragment;

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
.end method

.method public final l(Landroid/view/View;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/margin/market/trade/q0;->d:Lcom/kubi/resources/widget/f;

    .line 3
    .line 4
    if-nez v0, :cond_4

    .line 5
    .line 6
    new-instance v0, Lcom/kubi/resources/widget/f;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/margin/market/trade/q0;->m()Landroid/view/View;

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
    iput-object v0, p0, Lcom/kubi/margin/market/trade/q0;->d:Lcom/kubi/resources/widget/f;

    .line 18
    const/4 v1, 0x1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 22
    .line 23
    iget-object v0, p0, Lcom/kubi/margin/market/trade/q0;->d:Lcom/kubi/resources/widget/f;

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
    iget-object v0, p0, Lcom/kubi/margin/market/trade/q0;->d:Lcom/kubi/resources/widget/f;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    sget v1, Lcom/kubi/margin/R$style;->TopInOutAnimation:I

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 43
    .line 44
    :cond_1
    iget-object v0, p0, Lcom/kubi/margin/market/trade/q0;->d:Lcom/kubi/resources/widget/f;

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
    iget-object v0, p0, Lcom/kubi/margin/market/trade/q0;->d:Lcom/kubi/resources/widget/f;

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
    iget-object v0, p0, Lcom/kubi/margin/market/trade/q0;->d:Lcom/kubi/resources/widget/f;

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
.end method

.method public final m()Landroid/view/View;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/margin/market/trade/q0;->c:Lkotlin/Lazy;

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
.end method

.method public final y(Landroid/view/View;)V
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
    invoke-virtual {p0, p1}, Lcom/kubi/margin/market/trade/q0;->l(Landroid/view/View;)V

    .line 9
    .line 10
    iget-object v0, p0, Lcom/kubi/margin/market/trade/q0;->d:Lcom/kubi/resources/widget/f;

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
    iget-object v0, p0, Lcom/kubi/margin/market/trade/q0;->d:Lcom/kubi/resources/widget/f;

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
.end method

.method public final z(Landroid/view/View;)V
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
    invoke-virtual {p0, p1}, Lcom/kubi/margin/market/trade/q0;->l(Landroid/view/View;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/margin/market/trade/q0;->d:Lcom/kubi/resources/widget/f;

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
.end method
