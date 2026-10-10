.class public final Lcom/kubi/kumex/data/trade/model/ComposeUserEntity$Companion;
.super Ljava/lang/Object;
.source "ComposeUserEntity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/kumex/data/trade/model/ComposeUserEntity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/kubi/kumex/data/trade/model/ComposeUserEntity$Companion;",
        "",
        "<init>",
        "()V",
        "empty",
        "Lcom/kubi/kumex/data/trade/model/ComposeUserEntity;",
        "KumexApi_googleRelease"
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
    invoke-direct {p0}, Lcom/kubi/kumex/data/trade/model/ComposeUserEntity$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final empty()Lcom/kubi/kumex/data/trade/model/ComposeUserEntity;
    .locals 10
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/kumex/data/trade/model/ComposeUserEntity;

    .line 3
    .line 4
    new-instance v1, Lcm/o;

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 8
    move-result-object v2

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, v2, v3}, Lcm/o;-><init>(Ljava/util/List;Ljava/lang/Throwable;)V

    .line 13
    .line 14
    new-instance v2, Lcm/a;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 18
    move-result-object v4

    .line 19
    .line 20
    .line 21
    invoke-direct {v2, v4, v3}, Lcm/a;-><init>(Ljava/util/List;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    sget-object v3, Lcom/kubi/kumex/data/trade/model/LeveragesWrapper;->c:Lcom/kubi/kumex/data/trade/model/LeveragesWrapper$Companion;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, Lcom/kubi/kumex/data/trade/model/LeveragesWrapper$Companion;->getDEFAULT()Lcom/kubi/kumex/data/trade/model/LeveragesWrapper;

    .line 27
    move-result-object v3

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 31
    move-result-object v5

    .line 32
    .line 33
    const/16 v8, 0x20

    .line 34
    const/4 v9, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    .line 37
    const-wide/16 v6, 0x0

    .line 38
    .line 39
    .line 40
    invoke-direct/range {v0 .. v9}, Lcom/kubi/kumex/data/trade/model/ComposeUserEntity;-><init>(Lcm/o;Lcm/a;Lcom/kubi/kumex/data/trade/model/LeveragesWrapper;ZLjava/util/Map;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 41
    return-object v0
    .line 42
    .line 43
.end method
