.class public final Lcom/sumsub/sns/internal/core/data/serializer/c;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Ltg0/d;


# static fields
.field public static final a:Lcom/sumsub/sns/internal/core/data/serializer/c;

.field public static final b:Lvg0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/core/data/serializer/c;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/core/data/serializer/c;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/core/data/serializer/c;->a:Lcom/sumsub/sns/internal/core/data/serializer/c;

    .line 8
    .line 9
    sget-object v0, Lvg0/e$i;->a:Lvg0/e$i;

    .line 10
    .line 11
    const-string v1, "JsonAsAnySerializer"

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v0}, Lvg0/m;->c(Ljava/lang/String;Lvg0/e;)Lvg0/f;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    sput-object v0, Lcom/sumsub/sns/internal/core/data/serializer/c;->b:Lvg0/f;

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
.end method

.method public static a(Lkotlinx/serialization/json/JsonElement;)Ljava/io/Serializable;
    .locals 5

    .line 18
    instance-of v0, p0, Lkotlinx/serialization/json/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 19
    :cond_0
    instance-of v0, p0, Lkotlinx/serialization/json/JsonPrimitive;

    if-eqz v0, :cond_4

    .line 20
    check-cast p0, Lkotlinx/serialization/json/JsonPrimitive;

    .line 21
    invoke-virtual {p0}, Lkotlinx/serialization/json/JsonPrimitive;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lkotlinx/serialization/json/JsonPrimitive;->a()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 22
    :cond_1
    invoke-static {p0}, Lxg0/i;->k(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_2

    .line 23
    invoke-static {p0}, Lxg0/i;->o(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_2

    .line 24
    invoke-static {p0}, Lxg0/i;->h(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Double;

    move-result-object v0

    if-nez v0, :cond_2

    .line 25
    invoke-static {p0}, Lxg0/i;->e(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_2

    .line 26
    invoke-virtual {p0}, Lkotlinx/serialization/json/JsonPrimitive;->a()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_2
    move-object p0, v0

    .line 27
    :goto_0
    nop

    instance-of v0, p0, Ljava/lang/Double;

    if-eqz v0, :cond_3

    move-object v0, p0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    const-wide v3, 0x47efffffe0000000L    # 3.4028234663852886E38

    cmpg-double v1, v1, v3

    if-gtz v1, :cond_3

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    const-wide/high16 v3, 0x36a0000000000000L    # 1.401298464324817E-45

    cmpl-double v1, v1, v3

    if-ltz v1, :cond_3

    .line 28
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    double-to-float p0, v0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    :cond_3
    return-object p0

    .line 29
    :cond_4
    instance-of v0, p0, Lkotlinx/serialization/json/JsonObject;

    if-eqz v0, :cond_6

    check-cast p0, Lkotlinx/serialization/json/JsonObject;

    .line 30
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-virtual {p0}, Lkotlinx/serialization/json/JsonObject;->size()I

    move-result v1

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 31
    invoke-virtual {p0}, Lkotlinx/serialization/json/JsonObject;->entrySet()Ljava/util/Set;

    move-result-object p0

    .line 32
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 33
    check-cast v1, Ljava/util/Map$Entry;

    .line 34
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    .line 35
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    invoke-static {v1}, Lcom/sumsub/sns/internal/core/data/serializer/c;->a(Lkotlinx/serialization/json/JsonElement;)Ljava/io/Serializable;

    move-result-object v1

    .line 36
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 37
    :cond_5
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/h;->a(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p0

    return-object p0

    .line 38
    :cond_6
    instance-of v0, p0, Lkotlinx/serialization/json/JsonArray;

    if-eqz v0, :cond_9

    check-cast p0, Lkotlinx/serialization/json/JsonArray;

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 40
    invoke-virtual {p0}, Lkotlinx/serialization/json/JsonArray;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_7
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 41
    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    .line 42
    invoke-static {v1}, Lcom/sumsub/sns/internal/core/data/serializer/c;->a(Lkotlinx/serialization/json/JsonElement;)Ljava/io/Serializable;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 43
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    return-object v0

    :cond_9
    return-object v1
.end method

.method public static final a(Ljava/lang/Object;Lxg0/a0;)Lkotlin/Unit;
    .locals 0

    .line 17
    check-cast p0, Ljava/util/Map;

    invoke-static {p1, p0}, Lcom/sumsub/sns/internal/core/data/serializer/c;->a(Lxg0/a0;Ljava/util/Map;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Ljava/lang/Object;Lxg0/b;)Lkotlin/Unit;
    .locals 0

    .line 16
    check-cast p0, Ljava/util/Collection;

    invoke-static {p1, p0}, Lcom/sumsub/sns/internal/core/data/serializer/c;->a(Lxg0/b;Ljava/util/Collection;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static a(Lxg0/a0;Ljava/util/Map;)V
    .locals 3

    .line 44
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 45
    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 46
    instance-of v2, v0, Ljava/lang/String;

    if-eqz v2, :cond_1

    check-cast v1, Ljava/lang/String;

    check-cast v0, Ljava/lang/String;

    invoke-static {p0, v1, v0}, Lxg0/h;->g(Lxg0/a0;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;

    goto :goto_0

    .line 47
    :cond_1
    instance-of v2, v0, Ljava/lang/Number;

    if-eqz v2, :cond_2

    check-cast v1, Ljava/lang/String;

    check-cast v0, Ljava/lang/Number;

    invoke-static {p0, v1, v0}, Lxg0/h;->f(Lxg0/a0;Ljava/lang/String;Ljava/lang/Number;)Lkotlinx/serialization/json/JsonElement;

    goto :goto_0

    .line 48
    :cond_2
    instance-of v2, v0, Ljava/lang/Boolean;

    if-eqz v2, :cond_3

    check-cast v1, Ljava/lang/String;

    check-cast v0, Ljava/lang/Boolean;

    invoke-static {p0, v1, v0}, Lxg0/h;->e(Lxg0/a0;Ljava/lang/String;Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonElement;

    goto :goto_0

    .line 49
    :cond_3
    instance-of v2, v0, Ljava/util/Collection;

    if-eqz v2, :cond_4

    check-cast v1, Ljava/lang/String;

    new-instance v2, Lcom/sumsub/sns/internal/core/data/serializer/d;

    invoke-direct {v2, v0}, Lcom/sumsub/sns/internal/core/data/serializer/d;-><init>(Ljava/lang/Object;)V

    invoke-static {p0, v1, v2}, Lxg0/h;->h(Lxg0/a0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/json/JsonElement;

    goto :goto_0

    .line 50
    :cond_4
    instance-of v2, v0, Ljava/util/Map;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/lang/String;

    new-instance v2, Lcom/sumsub/sns/internal/core/data/serializer/e;

    invoke-direct {v2, v0}, Lcom/sumsub/sns/internal/core/data/serializer/e;-><init>(Ljava/lang/Object;)V

    invoke-static {p0, v1, v2}, Lxg0/h;->i(Lxg0/a0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/json/JsonElement;

    goto :goto_0

    :cond_5
    return-void
.end method

.method public static a(Lxg0/b;Ljava/util/Collection;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->filterNotNull(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    .line 2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 3
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_1

    check-cast v0, Ljava/lang/String;

    invoke-static {p0, v0}, Lxg0/h;->c(Lxg0/b;Ljava/lang/String;)Z

    goto :goto_0

    .line 4
    :cond_1
    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/lang/Number;

    invoke-static {p0, v0}, Lxg0/h;->b(Lxg0/b;Ljava/lang/Number;)Z

    goto :goto_0

    .line 5
    :cond_2
    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_3

    check-cast v0, Ljava/lang/Boolean;

    invoke-static {p0, v0}, Lxg0/h;->a(Lxg0/b;Ljava/lang/Boolean;)Z

    goto :goto_0

    .line 6
    :cond_3
    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_4

    .line 7
    new-instance v1, Lxg0/b;

    invoke-direct {v1}, Lxg0/b;-><init>()V

    .line 8
    check-cast v0, Ljava/util/Collection;

    invoke-static {v1, v0}, Lcom/sumsub/sns/internal/core/data/serializer/c;->a(Lxg0/b;Ljava/util/Collection;)V

    .line 9
    invoke-virtual {v1}, Lxg0/b;->b()Lkotlinx/serialization/json/JsonArray;

    move-result-object v0

    .line 10
    invoke-virtual {p0, v0}, Lxg0/b;->a(Lkotlinx/serialization/json/JsonElement;)Z

    goto :goto_0

    .line 11
    :cond_4
    instance-of v1, v0, Ljava/util/Map;

    if-eqz v1, :cond_0

    .line 12
    new-instance v1, Lxg0/a0;

    invoke-direct {v1}, Lxg0/a0;-><init>()V

    .line 13
    check-cast v0, Ljava/util/Map;

    invoke-static {v1, v0}, Lcom/sumsub/sns/internal/core/data/serializer/c;->a(Lxg0/a0;Ljava/util/Map;)V

    .line 14
    invoke-virtual {v1}, Lxg0/a0;->a()Lkotlinx/serialization/json/JsonObject;

    move-result-object v0

    .line 15
    invoke-virtual {p0, v0}, Lxg0/b;->a(Lkotlinx/serialization/json/JsonElement;)Z

    goto :goto_0

    :cond_5
    return-void
.end method


# virtual methods
.method public final deserialize(Lkotlinx/serialization/encoding/b;)Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    instance-of v0, p1, Lxg0/g;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    check-cast p1, Lxg0/g;

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Lxg0/g;->b()Lkotlinx/serialization/json/JsonElement;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/data/serializer/c;->a(Lkotlinx/serialization/json/JsonElement;)Ljava/io/Serializable;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    return-object v0

    .line 23
    .line 24
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "JsonAsAnySerializer decoder is not JsonDecoder"

    .line 27
    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    throw p1
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
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public final getDescriptor()Lvg0/f;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/core/data/serializer/c;->b:Lvg0/f;

    .line 3
    return-object v0
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
.end method

.method public final serialize(Lwg0/c;Ljava/lang/Object;)V
    .locals 2

    .line 1
    .line 2
    instance-of v0, p1, Lxg0/r;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lxg0/r;

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    .line 10
    :goto_0
    if-nez p1, :cond_1

    .line 11
    return-void

    .line 12
    .line 13
    :cond_1
    instance-of v0, p2, Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    check-cast p2, Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, p2}, Lwg0/c;->encodeString(Ljava/lang/String;)V

    .line 21
    return-void

    .line 22
    .line 23
    :cond_2
    instance-of v0, p2, Ljava/lang/Integer;

    .line 24
    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    check-cast p2, Ljava/lang/Number;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 31
    move-result p2

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, p2}, Lwg0/c;->encodeInt(I)V

    .line 35
    return-void

    .line 36
    .line 37
    :cond_3
    instance-of v0, p2, Ljava/lang/Long;

    .line 38
    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    check-cast p2, Ljava/lang/Number;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 45
    move-result-wide v0

    .line 46
    .line 47
    .line 48
    invoke-interface {p1, v0, v1}, Lwg0/c;->encodeLong(J)V

    .line 49
    return-void

    .line 50
    .line 51
    :cond_4
    instance-of v0, p2, Ljava/lang/Float;

    .line 52
    .line 53
    if-eqz v0, :cond_5

    .line 54
    .line 55
    check-cast p2, Ljava/lang/Number;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 59
    move-result p2

    .line 60
    .line 61
    .line 62
    invoke-interface {p1, p2}, Lwg0/c;->encodeFloat(F)V

    .line 63
    return-void

    .line 64
    .line 65
    :cond_5
    instance-of v0, p2, Ljava/lang/Double;

    .line 66
    .line 67
    if-eqz v0, :cond_6

    .line 68
    .line 69
    check-cast p2, Ljava/lang/Number;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    .line 73
    move-result-wide v0

    .line 74
    .line 75
    .line 76
    invoke-interface {p1, v0, v1}, Lwg0/c;->encodeDouble(D)V

    .line 77
    return-void

    .line 78
    .line 79
    :cond_6
    instance-of v0, p2, Ljava/lang/Short;

    .line 80
    .line 81
    if-eqz v0, :cond_7

    .line 82
    .line 83
    check-cast p2, Ljava/lang/Number;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2}, Ljava/lang/Number;->shortValue()S

    .line 87
    move-result p2

    .line 88
    .line 89
    .line 90
    invoke-interface {p1, p2}, Lwg0/c;->encodeShort(S)V

    .line 91
    return-void

    .line 92
    .line 93
    :cond_7
    instance-of v0, p2, Ljava/lang/Boolean;

    .line 94
    .line 95
    if-eqz v0, :cond_8

    .line 96
    .line 97
    check-cast p2, Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 101
    move-result p2

    .line 102
    .line 103
    .line 104
    invoke-interface {p1, p2}, Lwg0/c;->encodeBoolean(Z)V

    .line 105
    return-void

    .line 106
    .line 107
    :cond_8
    instance-of v0, p2, Ljava/util/Collection;

    .line 108
    .line 109
    if-eqz v0, :cond_9

    .line 110
    .line 111
    new-instance v0, Lxg0/b;

    .line 112
    .line 113
    .line 114
    invoke-direct {v0}, Lxg0/b;-><init>()V

    .line 115
    .line 116
    check-cast p2, Ljava/util/Collection;

    .line 117
    .line 118
    .line 119
    invoke-static {v0, p2}, Lcom/sumsub/sns/internal/core/data/serializer/c;->a(Lxg0/b;Ljava/util/Collection;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Lxg0/b;->b()Lkotlinx/serialization/json/JsonArray;

    .line 123
    move-result-object p2

    .line 124
    .line 125
    .line 126
    invoke-interface {p1, p2}, Lxg0/r;->b(Lkotlinx/serialization/json/JsonElement;)V

    .line 127
    return-void

    .line 128
    .line 129
    :cond_9
    instance-of v0, p2, Ljava/util/Map;

    .line 130
    .line 131
    if-eqz v0, :cond_a

    .line 132
    .line 133
    new-instance v0, Lxg0/a0;

    .line 134
    .line 135
    .line 136
    invoke-direct {v0}, Lxg0/a0;-><init>()V

    .line 137
    .line 138
    check-cast p2, Ljava/util/Map;

    .line 139
    .line 140
    .line 141
    invoke-static {v0, p2}, Lcom/sumsub/sns/internal/core/data/serializer/c;->a(Lxg0/a0;Ljava/util/Map;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, Lxg0/a0;->a()Lkotlinx/serialization/json/JsonObject;

    .line 145
    move-result-object p2

    .line 146
    .line 147
    .line 148
    invoke-interface {p1, p2}, Lxg0/r;->b(Lkotlinx/serialization/json/JsonElement;)V

    .line 149
    return-void

    .line 150
    .line 151
    .line 152
    :cond_a
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 153
    move-result-object p2

    .line 154
    .line 155
    .line 156
    invoke-interface {p1, p2}, Lwg0/c;->encodeString(Ljava/lang/String;)V

    .line 157
    return-void
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method
