.class public abstract Lcom/kubi/home/realtime/e;
.super Ljava/lang/Object;
.source "ViewLifecycleEvent.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/home/realtime/e$a;,
        Lcom/kubi/home/realtime/e$b;,
        Lcom/kubi/home/realtime/e$c;,
        Lcom/kubi/home/realtime/e$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/kubi/home/realtime/b;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0004\u000f\u0010\u0011\u0012B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000eH\u0016R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0012\u0010\n\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u0082\u0001\u0004\u0013\u0014\u0015\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/kubi/home/realtime/ViewLifecycleEvent;",
        "T",
        "Lcom/kubi/home/realtime/IRealTimeData;",
        "",
        "<init>",
        "()V",
        "viewType",
        "Lcom/kubi/home/realtime/RealTimeViewType;",
        "getViewType",
        "()Lcom/kubi/home/realtime/RealTimeViewType;",
        "data",
        "getData",
        "()Lcom/kubi/home/realtime/IRealTimeData;",
        "dataList",
        "",
        "Show",
        "Hide",
        "Removed",
        "DialogShow",
        "Lcom/kubi/home/realtime/ViewLifecycleEvent$DialogShow;",
        "Lcom/kubi/home/realtime/ViewLifecycleEvent$Hide;",
        "Lcom/kubi/home/realtime/ViewLifecycleEvent$Removed;",
        "Lcom/kubi/home/realtime/ViewLifecycleEvent$Show;",
        "HomeApi_googleRelease"
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

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kubi/home/realtime/e;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lcom/kubi/home/realtime/RealTimeViewType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
