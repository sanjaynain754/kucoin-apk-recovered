.class public final Lfm/f;
.super Ljava/lang/Object;
.source "UserConfigEx.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\u000c\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0002\u001a\u000c\u0010\u0005\u001a\u00020\u0004*\u0004\u0018\u00010\u0002\u001a\u000c\u0010\u0006\u001a\u00020\u0004*\u0004\u0018\u00010\u0002\u001a\u000c\u0010\u0007\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u00a8\u0006\u0008"
    }
    d2 = {
        "getDefaultSymbol",
        "",
        "Lcom/kubi/kumex/data/platform/model/UserConfig;",
        "isLot",
        "",
        "hasPro",
        "isPro",
        "qtyUnit",
        "KumexLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/kubi/kumex/data/platform/model/UserConfig;)Ljava/lang/String;
    .locals 1
    .param p0    # Lcom/kubi/kumex/data/platform/model/UserConfig;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    const-string v0, "defaultSymbol"

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/kubi/kumex/data/platform/model/UserConfig;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    move-result-object p0

    .line 9
    .line 10
    check-cast p0, Ljava/lang/String;

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    .line 14
    :goto_0
    if-eqz p0, :cond_2

    .line 15
    .line 16
    .line 17
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 18
    move-result v0

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    return-object p0

    .line 23
    .line 24
    :cond_2
    :goto_1
    sget-object p0, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 28
    move-result-object p0

    .line 29
    .line 30
    .line 31
    invoke-interface {p0}, Lth/d;->k()Ljava/util/List;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 36
    move-result-object p0

    .line 37
    .line 38
    check-cast p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 39
    .line 40
    if-eqz p0, :cond_4

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getSymbol()Ljava/lang/String;

    .line 44
    move-result-object p0

    .line 45
    .line 46
    if-nez p0, :cond_3

    .line 47
    goto :goto_2

    .line 48
    :cond_3
    return-object p0

    .line 49
    .line 50
    .line 51
    :cond_4
    :goto_2
    invoke-static {}, Lbm/g;->a()Ljava/lang/String;

    .line 52
    move-result-object p0

    .line 53
    return-object p0
    .line 54
    .line 55
    .line 56
.end method

.method public static final b(Lcom/kubi/kumex/data/platform/model/UserConfig;)Z
    .locals 1
    .param p0    # Lcom/kubi/kumex/data/platform/model/UserConfig;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    const-string v0, "isPro"

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/kubi/kumex/data/platform/model/UserConfig;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    move-result-object p0

    .line 9
    .line 10
    check-cast p0, Ljava/lang/String;

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    .line 14
    :goto_0
    if-eqz p0, :cond_1

    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_1
    const/4 p0, 0x0

    .line 18
    return p0
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
.end method

.method public static final c(Lcom/kubi/kumex/data/platform/model/UserConfig;)Z
    .locals 1
    .param p0    # Lcom/kubi/kumex/data/platform/model/UserConfig;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    const-string v0, "isLot"

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/kubi/kumex/data/platform/model/UserConfig;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    move-result-object p0

    .line 9
    .line 10
    check-cast p0, Ljava/lang/String;

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    .line 14
    :goto_0
    const-string v0, "false"

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v0}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    .line 21
    invoke-static {p0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 22
    move-result p0

    .line 23
    return p0
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
.end method

.method public static final d(Lcom/kubi/kumex/data/platform/model/UserConfig;)Z
    .locals 2
    .param p0    # Lcom/kubi/kumex/data/platform/model/UserConfig;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/kumex/service/a;->a:Lcom/kubi/kumex/service/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/kumex/service/a;->g()Lcom/kubi/user/api/IUserService;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-interface {v1}, Lcom/kubi/user/api/IUserService;->c()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/kubi/kumex/service/a;->h()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    const-string v0, "isPro"

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lcom/kubi/kumex/data/platform/model/UserConfig;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    move-result-object p0

    .line 27
    .line 28
    check-cast p0, Ljava/lang/String;

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p0, 0x0

    .line 31
    .line 32
    :goto_0
    const-string v0, "true"

    .line 33
    .line 34
    .line 35
    invoke-static {p0, v0}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    move-result-object p0

    .line 37
    .line 38
    .line 39
    invoke-static {p0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 40
    move-result p0

    .line 41
    return p0

    .line 42
    :cond_1
    const/4 p0, 0x0

    .line 43
    return p0
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
.end method

.method public static final e(Lcom/kubi/kumex/data/platform/model/UserConfig;)Ljava/lang/String;
    .locals 2
    .param p0    # Lcom/kubi/kumex/data/platform/model/UserConfig;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    const-string v0, "qtyUnit"

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/kubi/kumex/data/platform/model/UserConfig;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Ljava/lang/String;

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    .line 14
    :goto_0
    if-eqz v0, :cond_2

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 18
    move-result v1

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    return-object v0

    .line 23
    .line 24
    .line 25
    :cond_2
    :goto_1
    invoke-static {p0}, Lfm/f;->c(Lcom/kubi/kumex/data/platform/model/UserConfig;)Z

    .line 26
    move-result p0

    .line 27
    .line 28
    if-eqz p0, :cond_3

    .line 29
    .line 30
    const-string p0, "QtyUnitOfLot"

    .line 31
    return-object p0

    .line 32
    .line 33
    :cond_3
    const-string p0, "QtyUnitOfCurrency"

    .line 34
    return-object p0
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
.end method
