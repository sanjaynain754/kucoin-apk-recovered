.class public final Lcom/kubi/market/monitor/lib/ui/floating/window/util/a$b;
.super Ljava/lang/Object;
.source "FloatingWindowHelper.kt"

# interfaces
.implements Laq/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/market/monitor/lib/ui/floating/window/util/a;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowHelper$initView$1$1",
        "Lcom/kubi/market/monitor/lib/ui/floating/window/util/OnFloatWindowTouchListener;",
        "onTouch",
        "",
        "event",
        "Landroid/view/MotionEvent;",
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


# instance fields
.field public final synthetic a:Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;

.field public final synthetic b:Lcom/kubi/market/monitor/lib/ui/floating/window/util/a;


# direct methods
.method public constructor <init>(Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;Lcom/kubi/market/monitor/lib/ui/floating/window/util/a;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/a$b;->a:Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/a$b;->b:Lcom/kubi/market/monitor/lib/ui/floating/window/util/a;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public a(Landroid/view/MotionEvent;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "event"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/a$b;->a:Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/a$b;->b:Lcom/kubi/market/monitor/lib/ui/floating/window/util/a;

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, Lcom/kubi/market/monitor/lib/ui/floating/window/util/a;->d(Lcom/kubi/market/monitor/lib/ui/floating/window/util/a;)Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowFrameLayout;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/a$b;->b:Lcom/kubi/market/monitor/lib/ui/floating/window/util/a;

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, Lcom/kubi/market/monitor/lib/ui/floating/window/util/a;->f(Lcom/kubi/market/monitor/lib/ui/floating/window/util/a;)Landroid/view/WindowManager;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    iget-object v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/a$b;->b:Lcom/kubi/market/monitor/lib/ui/floating/window/util/a;

    .line 22
    .line 23
    .line 24
    invoke-static {v3}, Lcom/kubi/market/monitor/lib/ui/floating/window/util/a;->e(Lcom/kubi/market/monitor/lib/ui/floating/window/util/a;)Landroid/view/WindowManager$LayoutParams;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1, p1, v2, v3}, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->updateFloat(Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowFrameLayout;Landroid/view/MotionEvent;Landroid/view/WindowManager;Landroid/view/WindowManager$LayoutParams;)V

    .line 29
    return-void
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
