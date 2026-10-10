.class public interface abstract Lcom/kubi/trade/core/biz/api/ITradeCoreService;
.super Ljava/lang/Object;
.source "ITradeCoreService.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/trade/core/biz/api/ITradeCoreService$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008g\u0018\u0000 32\u00020\u0001:\u00013J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00032\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u000e\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00060\tH&J\u0016\u0010\n\u001a\u00020\u000b2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\tH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\rH&J\u001c\u0010\u0011\u001a\u00020\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\t0\u0013H&J\u0008\u0010\u0014\u001a\u00020\u0015H&J.\u0010\u0016\u001a\u00020\u00172\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00192\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001cH&J\u001e\u0010\u001d\u001a\u00020\u00172\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0019H&J\u0012\u0010\u001e\u001a\u00020\u00032\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0008\u0010\u001f\u001a\u00020\u0006H&J\u0008\u0010 \u001a\u00020\u0006H&J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020#H&J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020#H&J,\u0010&\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020)0(0\'2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H&J$\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020.2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u0019H&J\u0018\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u00064\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/trade/core/biz/api/ITradeCoreService;",
        "",
        "isUtaMode",
        "",
        "isMaintenance",
        "symbol",
        "",
        "allowCancelOrder",
        "getFavor",
        "",
        "saveNewFavor",
        "",
        "list",
        "Lcom/kubi/data/entity/TradeItemBean;",
        "isNativeFavor",
        "changedFavor",
        "tradeBean",
        "getMarkets",
        "consumer",
        "Lio/reactivex/functions/Consumer;",
        "getSpotType",
        "",
        "getMaintenanceStatus",
        "Lio/reactivex/disposables/Disposable;",
        "complete",
        "Lkotlin/Function1;",
        "Lcom/kubi/data/entity/MaintenanceEntity;",
        "error",
        "Lkotlin/Function0;",
        "getCDNMaintenanceStatus",
        "getMaintenance",
        "getMarketsSpotPageId",
        "getTradingPageId",
        "baseTradeFragmentScrollToTop",
        "fragment",
        "Lcom/kubi/sdk/BaseFragment;",
        "isBaseTradeFragment",
        "currentFragment",
        "getPreviewInfo",
        "Lio/reactivex/Observable;",
        "Lcom/kubi/sdk/base/entity/BaseEntity;",
        "Lcom/kubi/data/entity/SymbolPreviewEntity;",
        "currency",
        "lang",
        "bindFlowEvent",
        "lifecycleOwner",
        "Landroidx/lifecycle/LifecycleOwner;",
        "block",
        "getRnOrderCenterFragment",
        "tradeType",
        "currentSymbol",
        "Companion",
        "TradeCoreBizApi_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lvx/b;
.end annotation


# static fields
.field public static final a:Lcom/kubi/trade/core/biz/api/ITradeCoreService$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/trade/core/biz/api/ITradeCoreService$Companion;->a:Lcom/kubi/trade/core/biz/api/ITradeCoreService$Companion;

    .line 3
    .line 4
    sput-object v0, Lcom/kubi/trade/core/biz/api/ITradeCoreService;->a:Lcom/kubi/trade/core/biz/api/ITradeCoreService$Companion;

    .line 5
    return-void
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


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/BaseFragment;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
