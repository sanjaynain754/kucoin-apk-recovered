.class public abstract Lcom/sumsub/sns/internal/util/json/a;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a(Lkotlinx/serialization/json/JsonArray;Ljava/util/Set;Ljava/lang/String;)Lkotlinx/serialization/json/JsonArray;
    .locals 4

    .line 15
    new-instance v0, Lxg0/b;

    invoke-direct {v0}, Lxg0/b;-><init>()V

    .line 16
    invoke-virtual {p0}, Lkotlinx/serialization/json/JsonArray;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "[]"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, p1, v2}, Lcom/sumsub/sns/internal/util/json/a;->a(Lkotlinx/serialization/json/JsonElement;Ljava/util/Set;Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxg0/b;->a(Lkotlinx/serialization/json/JsonElement;)Z

    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v0}, Lxg0/b;->b()Lkotlinx/serialization/json/JsonArray;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Lkotlinx/serialization/json/JsonElement;Ljava/util/Set;Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;
    .locals 1

    .line 1
    instance-of v0, p0, Lkotlinx/serialization/json/JsonArray;

    if-eqz v0, :cond_0

    check-cast p0, Lkotlinx/serialization/json/JsonArray;

    invoke-static {p0, p1, p2}, Lcom/sumsub/sns/internal/util/json/a;->a(Lkotlinx/serialization/json/JsonArray;Ljava/util/Set;Ljava/lang/String;)Lkotlinx/serialization/json/JsonArray;

    move-result-object p0

    return-object p0

    .line 2
    :cond_0
    instance-of v0, p0, Lkotlinx/serialization/json/JsonObject;

    if-eqz v0, :cond_1

    check-cast p0, Lkotlinx/serialization/json/JsonObject;

    invoke-static {p0, p1, p2}, Lcom/sumsub/sns/internal/util/json/a;->a(Lkotlinx/serialization/json/JsonObject;Ljava/util/Set;Ljava/lang/String;)Lkotlinx/serialization/json/JsonObject;

    move-result-object p0

    return-object p0

    .line 3
    :cond_1
    instance-of p1, p0, Lkotlinx/serialization/json/JsonPrimitive;

    if-eqz p1, :cond_2

    return-object p0

    .line 4
    :cond_2
    sget-object p1, Lkotlinx/serialization/json/a;->INSTANCE:Lkotlinx/serialization/json/a;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return-object p0

    .line 5
    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final a(Lkotlinx/serialization/json/JsonObject;Ljava/util/Set;Ljava/lang/String;)Lkotlinx/serialization/json/JsonObject;
    .locals 9

    .line 6
    new-instance v0, Lxg0/a0;

    invoke-direct {v0}, Lxg0/a0;-><init>()V

    .line 7
    invoke-virtual {p0}, Lkotlinx/serialization/json/JsonObject;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    .line 8
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    if-eqz p1, :cond_0

    .line 9
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    .line 10
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 11
    invoke-static {v3, v5, v8, v6, v7}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 12
    const-string/jumbo v1, "\u2588\u2588"

    invoke-static {v0, v2, v1}, Lxg0/h;->g(Lxg0/a0;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;

    goto :goto_0

    .line 13
    :cond_2
    :goto_1
    invoke-static {v1, p1, v3}, Lcom/sumsub/sns/internal/util/json/a;->a(Lkotlinx/serialization/json/JsonElement;Ljava/util/Set;Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lxg0/a0;->b(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;

    goto :goto_0

    .line 14
    :cond_3
    invoke-virtual {v0}, Lxg0/a0;->a()Lkotlinx/serialization/json/JsonObject;

    move-result-object p0

    return-object p0
.end method
