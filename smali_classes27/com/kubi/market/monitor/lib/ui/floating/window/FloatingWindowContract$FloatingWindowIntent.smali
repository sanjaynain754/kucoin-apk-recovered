.class public abstract Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent;
.super Ljava/lang/Object;
.source "FloatingWindowContract.kt"

# interfaces
.implements Lcom/kubi/mvi/state/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$AddOrRemoveDataIntent;,
        Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$AppBackgroundPollingMonitor;,
        Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$DataUpdateIntervalTimeIntent;,
        Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$InitFloating;,
        Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$OnDestroyIntent;,
        Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$PageStateIntent;,
        Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$SortListDataIntent;,
        Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$UpdateSpanRowIntent;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0008\u0004\u0005\u0006\u0007\u0008\t\n\u000bB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0008\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent;",
        "Lcom/kubi/mvi/state/IIntent;",
        "<init>",
        "()V",
        "InitFloating",
        "AddOrRemoveDataIntent",
        "SortListDataIntent",
        "DataUpdateIntervalTimeIntent",
        "PageStateIntent",
        "UpdateSpanRowIntent",
        "AppBackgroundPollingMonitor",
        "OnDestroyIntent",
        "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$AddOrRemoveDataIntent;",
        "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$AppBackgroundPollingMonitor;",
        "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$DataUpdateIntervalTimeIntent;",
        "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$InitFloating;",
        "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$OnDestroyIntent;",
        "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$PageStateIntent;",
        "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$SortListDataIntent;",
        "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$UpdateSpanRowIntent;",
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent;-><init>()V

    return-void
.end method
