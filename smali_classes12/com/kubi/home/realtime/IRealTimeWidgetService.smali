.class public interface abstract Lcom/kubi/home/realtime/IRealTimeWidgetService;
.super Ljava/lang/Object;
.source "IRealTimeWidgetService.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/home/realtime/IRealTimeWidgetService$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008g\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J \u0010\u0002\u001a\u00020\u0003\"\u0008\u0008\u0000\u0010\u0004*\u00020\u00052\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u0002H\u00040\u0007H&J \u0010\u0008\u001a\u00020\u0003\"\u0008\u0008\u0000\u0010\u0004*\u00020\u00052\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u0002H\u00040\nH&J \u0010\u000b\u001a\u00020\u0003\"\u0008\u0008\u0000\u0010\u0004*\u00020\u00052\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u0002H\u00040\nH&J\u0010\u0010\u000c\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0005H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0014\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/home/realtime/IRealTimeWidgetService;",
        "",
        "registerAdapter",
        "",
        "T",
        "Lcom/kubi/home/realtime/IRealTimeData;",
        "adapter",
        "Lcom/kubi/home/realtime/IRealTimeAdapter;",
        "addLifecycleListener",
        "listener",
        "Lcom/kubi/home/realtime/ViewLifecycleListener;",
        "removeLifecycleListener",
        "add",
        "data",
        "update",
        "",
        "newData",
        "remove",
        "isRemoved",
        "Companion",
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

.annotation runtime Lvx/b;
.end annotation


# static fields
.field public static final a:Lcom/kubi/home/realtime/IRealTimeWidgetService$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/home/realtime/IRealTimeWidgetService$Companion;->a:Lcom/kubi/home/realtime/IRealTimeWidgetService$Companion;

    .line 3
    .line 4
    sput-object v0, Lcom/kubi/home/realtime/IRealTimeWidgetService;->a:Lcom/kubi/home/realtime/IRealTimeWidgetService$Companion;

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
.method public abstract a(Lcom/kubi/home/realtime/a;)V
    .param p1    # Lcom/kubi/home/realtime/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/kubi/home/realtime/b;",
            ">(",
            "Lcom/kubi/home/realtime/a<",
            "TT;>;)V"
        }
    .end annotation
.end method

.method public abstract b(Lcom/kubi/home/realtime/f;)V
    .param p1    # Lcom/kubi/home/realtime/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/kubi/home/realtime/b;",
            ">(",
            "Lcom/kubi/home/realtime/f<",
            "TT;>;)V"
        }
    .end annotation
.end method

.method public abstract c(Lcom/kubi/home/realtime/b;)Z
    .param p1    # Lcom/kubi/home/realtime/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract d(Lcom/kubi/home/realtime/b;)Z
    .param p1    # Lcom/kubi/home/realtime/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract e(Lcom/kubi/home/realtime/b;)Z
    .param p1    # Lcom/kubi/home/realtime/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract f(Lcom/kubi/home/realtime/b;)V
    .param p1    # Lcom/kubi/home/realtime/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
