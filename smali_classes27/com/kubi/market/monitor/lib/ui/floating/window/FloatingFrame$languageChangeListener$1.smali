.class public final Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingFrame$languageChangeListener$1;
.super Ljava/lang/Object;
.source "FloatingFrame.kt"

# interfaces
.implements Lcom/kubi/sdk/function/language/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingFrame;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
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
        "com/kubi/market/monitor/lib/ui/floating/window/FloatingFrame$languageChangeListener$1",
        "Lcom/kubi/sdk/function/language/MultiLanguageManager$OnLanguageChangeListener;",
        "onLanguageChange",
        "",
        "language",
        "Lcom/kubi/sdk/function/language/LanguageType;",
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
.field public final synthetic a:Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingFrame;


# direct methods
.method public constructor <init>(Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingFrame;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingFrame$languageChangeListener$1;->a:Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingFrame;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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


# virtual methods
.method public onLanguageChange(Lcom/kubi/sdk/function/language/LanguageType;)V
    .locals 6

    .line 1
    .line 2
    const-string v0, "language"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingFrame$languageChangeListener$1;->a:Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingFrame;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lo00/a;->c()Lkotlinx/coroutines/j0;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    new-instance v3, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingFrame$languageChangeListener$1$onLanguageChange$1;

    .line 18
    const/4 p1, 0x0

    .line 19
    .line 20
    .line 21
    invoke-direct {v3, p1}, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingFrame$languageChangeListener$1$onLanguageChange$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 22
    const/4 v4, 0x2

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v2, 0x0

    .line 25
    .line 26
    .line 27
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 28
    return-void
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
