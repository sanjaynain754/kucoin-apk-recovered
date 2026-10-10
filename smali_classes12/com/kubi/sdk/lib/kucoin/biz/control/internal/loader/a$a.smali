.class public final Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/a$a;
.super Ljava/lang/Object;
.source "BizConfigContainer.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/a$a;",
        "",
        "<init>",
        "()V",
        "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizResponseEntity;",
        "bizResponseEntity",
        "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/a;",
        "a",
        "(Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizResponseEntity;)Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/a;",
        "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizConfig;",
        "bizConfig",
        "b",
        "(Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizConfig;)Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/a;",
        "biz-control-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
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
.method public final a(Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizResponseEntity;)Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/a;
    .locals 5
    .param p1    # Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizResponseEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "bizResponseEntity"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizResponseEntity;->getConfig()Ljava/util/Map;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lez/a;->a(Ljava/util/Map;)Ljava/util/Map;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizResponseEntity;->getSource()Ljava/lang/String;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    const-string p1, ""

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 25
    move-result-wide v1

    .line 26
    .line 27
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    .line 30
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {v3, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 34
    .line 35
    new-instance v0, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/a;

    .line 36
    .line 37
    new-instance v4, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizConfig;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v3, p1, v1, v2}, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizConfig;-><init>(Ljava/util/Map;Ljava/lang/String;J)V

    .line 41
    const/4 p1, 0x0

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, v4, p1}, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/a;-><init>(Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizConfig;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 45
    return-object v0
.end method

.method public final b(Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizConfig;)Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/a;
    .locals 2
    .param p1    # Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "bizConfig"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/a;

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/a;-><init>(Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizConfig;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    return-object v0
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
.end method
