.class public final Lcom/kubi/flutter/widget/kline/KLineDataSession$a;
.super Ljava/lang/Object;
.source "KLineDataSession.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/flutter/widget/kline/KLineDataSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/kubi/flutter/widget/kline/KLineDataSession$Factory;",
        "",
        "container",
        "Lcom/kubi/flutter/widget/kline/IKLineContainer;",
        "interactor",
        "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;",
        "<init>",
        "(Lcom/kubi/flutter/widget/kline/IKLineContainer;Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;)V",
        "createSession",
        "Lcom/kubi/flutter/widget/kline/KLineDataSession;",
        "dataParam",
        "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$DataParam;",
        "LKLineWidget_googleRelease"
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
.field public final a:Lcom/kubi/flutter/widget/kline/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/kubi/flutter/widget/kline/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/flutter/widget/kline/b;Lcom/kubi/flutter/widget/kline/c;)V
    .locals 1
    .param p1    # Lcom/kubi/flutter/widget/kline/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/flutter/widget/kline/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "container"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "interactor"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    iput-object p1, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$a;->a:Lcom/kubi/flutter/widget/kline/b;

    .line 16
    .line 17
    iput-object p2, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$a;->b:Lcom/kubi/flutter/widget/kline/c;

    .line 18
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


# virtual methods
.method public final a(Lcom/kubi/flutter/widget/kline/c$a;)Lcom/kubi/flutter/widget/kline/KLineDataSession;
    .locals 4
    .param p1    # Lcom/kubi/flutter/widget/kline/c$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "dataParam"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lcom/kubi/flutter/widget/kline/KLineDataSession;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$a;->b:Lcom/kubi/flutter/widget/kline/c;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$a;->a:Lcom/kubi/flutter/widget/kline/b;

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p1, v1, v2, v3}, Lcom/kubi/flutter/widget/kline/KLineDataSession;-><init>(Lcom/kubi/flutter/widget/kline/c$a;Lcom/kubi/flutter/widget/kline/c;Lcom/kubi/flutter/widget/kline/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 16
    return-object v0
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
.end method
