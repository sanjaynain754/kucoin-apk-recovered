.class public final Lcom/kubi/flutter/network/socket/WebSocketConfig$Companion;
.super Ljava/lang/Object;
.source "SocketClientHelper.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/flutter/network/socket/WebSocketConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/kubi/flutter/network/socket/WebSocketConfig$Companion;",
        "",
        "<init>",
        "()V",
        "create",
        "Lcom/kubi/flutter/network/socket/WebSocketConfig;",
        "args",
        "component_network_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
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
    invoke-direct {p0}, Lcom/kubi/flutter/network/socket/WebSocketConfig$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;)Lcom/kubi/flutter/network/socket/WebSocketConfig;
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Ljava/util/Map;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Ljava/util/Map;

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p1, v1

    .line 10
    .line 11
    :goto_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    const-string v0, "baseUrl"

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object v0

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move-object v0, v1

    .line 20
    .line 21
    :goto_1
    instance-of v2, v0, Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    check-cast v0, Ljava/lang/String;

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    move-object v0, v1

    .line 28
    .line 29
    :goto_2
    const-string v2, "https://appapi-v2.xcoinsystem.com/app/"

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v2}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    if-eqz p1, :cond_3

    .line 36
    .line 37
    .line 38
    const-string/jumbo v2, "userId"

    .line 39
    .line 40
    .line 41
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    move-result-object v2

    .line 43
    goto :goto_3

    .line 44
    :cond_3
    move-object v2, v1

    .line 45
    .line 46
    :goto_3
    instance-of v3, v2, Ljava/lang/String;

    .line 47
    .line 48
    if-eqz v3, :cond_4

    .line 49
    .line 50
    check-cast v2, Ljava/lang/String;

    .line 51
    goto :goto_4

    .line 52
    :cond_4
    move-object v2, v1

    .line 53
    .line 54
    .line 55
    :goto_4
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    if-eqz p1, :cond_5

    .line 59
    .line 60
    const-string v3, "privateTopics"

    .line 61
    .line 62
    .line 63
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    move-result-object p1

    .line 65
    goto :goto_5

    .line 66
    :cond_5
    move-object p1, v1

    .line 67
    .line 68
    .line 69
    :goto_5
    invoke-static {p1}, Lkotlin/jvm/internal/TypeIntrinsics;->isMutableList(Ljava/lang/Object;)Z

    .line 70
    move-result v3

    .line 71
    .line 72
    if-eqz v3, :cond_6

    .line 73
    move-object v1, p1

    .line 74
    .line 75
    check-cast v1, Ljava/util/List;

    .line 76
    .line 77
    :cond_6
    if-nez v1, :cond_7

    .line 78
    .line 79
    new-instance v1, Ljava/util/ArrayList;

    .line 80
    .line 81
    .line 82
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 83
    .line 84
    :cond_7
    new-instance p1, Lcom/kubi/flutter/network/socket/WebSocketConfig;

    .line 85
    .line 86
    .line 87
    invoke-direct {p1, v0, v2, v1}, Lcom/kubi/flutter/network/socket/WebSocketConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 88
    return-object p1
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
.end method
