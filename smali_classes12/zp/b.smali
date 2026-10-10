.class public final Lzp/b;
.super Ljava/lang/Object;
.source "MarketMonitorService.kt"

# interfaces
.implements Lcom/kubi/market/monitor/api/IMarketMonitorService;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/kubi/market/monitor/lib/service/MarketMonitorService;",
        "Lcom/kubi/market/monitor/api/IMarketMonitorService;",
        "<init>",
        "()V",
        "updateFloatingWidget",
        "",
        "mContext",
        "Landroid/content/Context;",
        "MarketMonitorLib_googleRelease"
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
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/market/monitor/lib/ui/floating/window/w0;->a:Lcom/kubi/market/monitor/lib/ui/floating/window/w0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/market/monitor/lib/ui/floating/window/w0;->p2()V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/kucoin/feature/widget/appwidget/WidgetProvider;->a:Lcom/kubi/kucoin/feature/widget/appwidget/WidgetProvider$Companion;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lcom/kubi/kucoin/feature/widget/appwidget/WidgetProvider$Companion;->sendUpdateBroadcast(Landroid/content/Context;)V

    .line 13
    .line 14
    sget-object v0, Lcom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService;->g:Lcom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService$Companion;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lcom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService$Companion;->startService(Landroid/content/Context;)V

    .line 18
    :cond_0
    return-void
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
