.class public final Lwv/a;
.super Ljava/lang/Object;
.source "EuRedpacketSendFlavorImpl.kt"

# interfaces
.implements Lvv/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0005H\u0016J\u0008\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/kubi/redpackage/flavor/impl/EuRedpacketSendFlavorImpl;",
        "Lcom/kubi/redpackage/flavor/IRedpacketSendFlavor;",
        "<init>",
        "()V",
        "getDefaultSelectedCoin",
        "Lcom/kubi/redpackage/entity/CurrenciesConfig;",
        "redConfig",
        "Lcom/kubi/redpackage/entity/RedConfig;",
        "coinConfig",
        "isDescendUSDT",
        "",
        "RedpackageLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEuRedpacketSendFlavorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EuRedpacketSendFlavorImpl.kt\ncom/kubi/redpackage/flavor/impl/EuRedpacketSendFlavorImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
    .line 5
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
.method public a()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
    .line 3
    .line 4
    .line 5
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

.method public b(Lcom/kubi/redpackage/entity/RedConfig;Lcom/kubi/redpackage/entity/CurrenciesConfig;)Lcom/kubi/redpackage/entity/CurrenciesConfig;
    .locals 5
    .param p1    # Lcom/kubi/redpackage/entity/RedConfig;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/redpackage/entity/CurrenciesConfig;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p2, :cond_4

    .line 4
    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/kubi/redpackage/entity/RedConfig;->getCurrenciesConfigs()Ljava/util/ArrayList;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    .line 14
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v2

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    move-result-object v2

    .line 26
    move-object v3, v2

    .line 27
    .line 28
    check-cast v3, Lcom/kubi/redpackage/entity/CurrenciesConfig;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Lcom/kubi/redpackage/entity/CurrenciesConfig;->getCurrencyCode()Ljava/lang/String;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Lcom/kubi/redpackage/entity/CurrenciesConfig;->getCurrencyCode()Ljava/lang/String;

    .line 36
    move-result-object v4

    .line 37
    .line 38
    .line 39
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    move-result v3

    .line 41
    .line 42
    if-eqz v3, :cond_0

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move-object v2, v0

    .line 45
    .line 46
    :goto_0
    check-cast v2, Lcom/kubi/redpackage/entity/CurrenciesConfig;

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move-object v2, v0

    .line 49
    .line 50
    :goto_1
    if-nez v2, :cond_3

    .line 51
    goto :goto_2

    .line 52
    :cond_3
    return-object v2

    .line 53
    .line 54
    :cond_4
    :goto_2
    if-eqz p1, :cond_5

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/kubi/redpackage/entity/RedConfig;->getCurrenciesConfigs()Ljava/util/ArrayList;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    if-eqz p1, :cond_5

    .line 61
    .line 62
    .line 63
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 64
    move-result-object p1

    .line 65
    .line 66
    check-cast p1, Lcom/kubi/redpackage/entity/CurrenciesConfig;

    .line 67
    return-object p1

    .line 68
    :cond_5
    return-object v0
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method
