.class public final Lu20/a;
.super Ljava/lang/Object;
.source "LimitPlugin.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/kubi/spot/dialog/order/plugin/LimitPlugin;",
        "Lcom/kubi/spot/dialog/order/plugin/AmendOrderTypePlugin;",
        "<init>",
        "()V",
        "type",
        "Lcom/kubi/tradebase/OrderType;",
        "getType",
        "()Lcom/kubi/tradebase/OrderType;",
        "getTypeValidators",
        "",
        "Lcom/kubi/spot/dialog/order/precheck/AmendPreCheck;",
        "ctx",
        "Lcom/kubi/spot/dialog/order/model/AmendContext;",
        "SpotLib_googleRelease"
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
.field public final a:Lcom/kubi/tradebase/OrderType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/tradebase/OrderType;->LIMIT:Lcom/kubi/tradebase/OrderType;

    .line 6
    .line 7
    iput-object v0, p0, Lu20/a;->a:Lcom/kubi/tradebase/OrderType;

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
.end method


# virtual methods
.method public a(Lcom/kubi/spot/dialog/order/model/AmendContext;)Ljava/util/List;
    .locals 5
    .param p1    # Lcom/kubi/spot/dialog/order/model/AmendContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/spot/dialog/order/model/AmendContext;",
            ")",
            "Ljava/util/List<",
            "Lcom/kubi/spot/dialog/order/precheck/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "ctx"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance p1, Lcom/kubi/spot/dialog/order/precheck/c;

    .line 8
    .line 9
    .line 10
    invoke-direct {p1}, Lcom/kubi/spot/dialog/order/precheck/c;-><init>()V

    .line 11
    .line 12
    new-instance v0, Lcom/kubi/spot/dialog/order/precheck/d;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lcom/kubi/spot/dialog/order/precheck/d;-><init>()V

    .line 16
    .line 17
    new-instance v1, Lcom/kubi/spot/dialog/order/precheck/e;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1}, Lcom/kubi/spot/dialog/order/precheck/e;-><init>()V

    .line 21
    .line 22
    new-instance v2, Lcom/kubi/spot/dialog/order/precheck/b;

    .line 23
    .line 24
    .line 25
    invoke-direct {v2}, Lcom/kubi/spot/dialog/order/precheck/b;-><init>()V

    .line 26
    const/4 v3, 0x4

    .line 27
    .line 28
    new-array v3, v3, [Lcom/kubi/spot/dialog/order/precheck/a;

    .line 29
    const/4 v4, 0x0

    .line 30
    .line 31
    aput-object p1, v3, v4

    .line 32
    const/4 p1, 0x1

    .line 33
    .line 34
    aput-object v0, v3, p1

    .line 35
    const/4 p1, 0x2

    .line 36
    .line 37
    aput-object v1, v3, p1

    .line 38
    const/4 p1, 0x3

    .line 39
    .line 40
    aput-object v2, v3, p1

    .line 41
    .line 42
    .line 43
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 44
    move-result-object p1

    .line 45
    return-object p1
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
.end method
