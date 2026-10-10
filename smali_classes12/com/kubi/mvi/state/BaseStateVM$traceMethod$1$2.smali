.class public final Lcom/kubi/mvi/state/BaseStateVM$traceMethod$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "BaseStateVM.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/mvi/state/BaseStateVM;->traceMethod(ZZLjava/lang/String;Lkotlin/jvm/functions/Function0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\t\u001a\u00020\u0006\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\u0008\u0008\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lcom/kubi/mvi/state/d;",
        "I",
        "Lcom/kubi/mvi/state/f;",
        "S",
        "",
        "it",
        "",
        "invoke",
        "(Ljava/lang/Throwable;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBaseStateVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM$traceMethod$1$2\n*L\n1#1,630:1\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $methodName:Ljava/lang/String;

.field final synthetic this$0:Lcom/kubi/mvi/state/BaseStateVM;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/kubi/mvi/state/BaseStateVM<",
            "TI;TS;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/mvi/state/BaseStateVM;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/mvi/state/BaseStateVM<",
            "TI;TS;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/mvi/state/BaseStateVM$traceMethod$1$2;->this$0:Lcom/kubi/mvi/state/BaseStateVM;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/mvi/state/BaseStateVM$traceMethod$1$2;->$methodName:Ljava/lang/String;

    .line 5
    const/4 p1, 0x1

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 9
    return-void
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
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM$traceMethod$1$2;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 7
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v1, Lcom/kubi/mvi/state/MVITracker;->a:Lcom/kubi/mvi/state/MVITracker$Companion;

    iget-object v0, p0, Lcom/kubi/mvi/state/BaseStateVM$traceMethod$1$2;->this$0:Lcom/kubi/mvi/state/BaseStateVM;

    invoke-virtual {v0}, Lcom/kubi/mvi/state/BaseStateVM;->getBiz()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/kubi/mvi/state/BaseStateVM$traceMethod$1$2;->$methodName:Ljava/lang/String;

    const-wide/16 v4, 0x0

    move-object v6, p1

    invoke-virtual/range {v1 .. v6}, Lcom/kubi/mvi/state/MVITracker$Companion;->trackEndHandleIntent(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Throwable;)V

    return-void
.end method
