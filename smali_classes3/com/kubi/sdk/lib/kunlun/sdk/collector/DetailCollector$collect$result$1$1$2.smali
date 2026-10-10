.class final Lcom/kubi/sdk/lib/kunlun/sdk/collector/DetailCollector$collect$result$1$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "DetailCollector.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/sdk/lib/kunlun/sdk/collector/DetailCollector$collect$result$1$1;->invoke(Lxg0/a0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lxg0/a0;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lxg0/a0;",
        "",
        "invoke",
        "(Lxg0/a0;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $sample:Lcom/kubi/sdk/lib/kunlun/sdk/collector/b;

.field final synthetic this$0:Lcom/kubi/sdk/lib/kunlun/sdk/collector/DetailCollector;


# direct methods
.method public constructor <init>(Lcom/kubi/sdk/lib/kunlun/sdk/collector/b;Lcom/kubi/sdk/lib/kunlun/sdk/collector/DetailCollector;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/sdk/lib/kunlun/sdk/collector/DetailCollector$collect$result$1$1$2;->$sample:Lcom/kubi/sdk/lib/kunlun/sdk/collector/b;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/sdk/lib/kunlun/sdk/collector/DetailCollector$collect$result$1$1$2;->this$0:Lcom/kubi/sdk/lib/kunlun/sdk/collector/DetailCollector;

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
    .line 76
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lxg0/a0;

    invoke-virtual {p0, p1}, Lcom/kubi/sdk/lib/kunlun/sdk/collector/DetailCollector$collect$result$1$1$2;->invoke(Lxg0/a0;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lxg0/a0;)V
    .locals 3
    .param p1    # Lxg0/a0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "$this$putJsonObject"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/kubi/sdk/lib/kunlun/sdk/collector/DetailCollector$collect$result$1$1$2;->$sample:Lcom/kubi/sdk/lib/kunlun/sdk/collector/b;

    invoke-virtual {v0}, Lcom/kubi/sdk/lib/kunlun/sdk/collector/b;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 3
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v2, v1}, Lxg0/h;->g(Lxg0/a0;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kubi/sdk/lib/kunlun/sdk/collector/DetailCollector$collect$result$1$1$2;->this$0:Lcom/kubi/sdk/lib/kunlun/sdk/collector/DetailCollector;

    invoke-virtual {v0, p1}, Lcom/kubi/sdk/lib/kunlun/sdk/collector/a;->a(Lxg0/a0;)V

    return-void
.end method
