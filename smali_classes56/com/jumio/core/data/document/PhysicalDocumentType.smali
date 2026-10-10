.class public final Lcom/jumio/core/data/document/PhysicalDocumentType;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/data/document/DocumentType;
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tB\u0011\u0008\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0008\u0010\u000cJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u0018J\u0011\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0001H\u0096\u0002J\u0013\u0010\u001d\u001a\u00020\u00162\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\u0008\u0010\u001f\u001a\u00020\u001bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006 "
    }
    d2 = {
        "Lcom/jumio/core/data/document/PhysicalDocumentType;",
        "Lcom/jumio/core/data/document/DocumentType;",
        "Ljava/io/Serializable;",
        "idType",
        "Lcom/jumio/sdk/document/JumioDocumentType;",
        "variants",
        "",
        "Lcom/jumio/core/data/document/DocumentVariant;",
        "<init>",
        "(Lcom/jumio/sdk/document/JumioDocumentType;Ljava/util/List;)V",
        "jsonObject",
        "Lorg/json/JSONObject;",
        "(Lorg/json/JSONObject;)V",
        "getIdType",
        "()Lcom/jumio/sdk/document/JumioDocumentType;",
        "getVariants",
        "()Ljava/util/List;",
        "type",
        "",
        "getType",
        "()Ljava/lang/String;",
        "hasVariant",
        "",
        "variant",
        "Lcom/jumio/sdk/document/JumioDocumentVariant;",
        "getVariant",
        "compareTo",
        "",
        "other",
        "equals",
        "",
        "hashCode",
        "jumio-core_release"
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
        "SMAP\nPhysicalDocumentType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalDocumentType.kt\ncom/jumio/core/data/document/PhysicalDocumentType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1755#2,3:64\n1#3:67\n*S KotlinDebug\n*F\n+ 1 PhysicalDocumentType.kt\ncom/jumio/core/data/document/PhysicalDocumentType\n*L\n22#1:64,3\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lcom/jumio/sdk/document/JumioDocumentType;

.field public final b:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/jumio/sdk/document/JumioDocumentType;Ljava/util/List;)V
    .locals 1
    .param p1    # Lcom/jumio/sdk/document/JumioDocumentType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/sdk/document/JumioDocumentType;",
            "Ljava/util/List<",
            "Lcom/jumio/core/data/document/DocumentVariant;",
            ">;)V"
        }
    .end annotation

    const-string v0, "idType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "variants"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jumio/core/data/document/PhysicalDocumentType;->a:Lcom/jumio/sdk/document/JumioDocumentType;

    iput-object p2, p0, Lcom/jumio/core/data/document/PhysicalDocumentType;->b:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 2
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "jsonObject"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    const-string v0, "idType"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/jumio/sdk/document/JumioDocumentType;->valueOf(Ljava/lang/String;)Lcom/jumio/sdk/document/JumioDocumentType;

    move-result-object v0

    .line 3
    const-string v1, "variants"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v1, Lm9/f;

    invoke-direct {v1}, Lm9/f;-><init>()V

    invoke-static {p1, v1}, Lcom/jumio/core/util/JsonUtilKt;->map(Lorg/json/JSONArray;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_1

    .line 4
    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    .line 5
    :cond_1
    invoke-direct {p0, v0, p1}, Lcom/jumio/core/data/document/PhysicalDocumentType;-><init>(Lcom/jumio/sdk/document/JumioDocumentType;Ljava/util/List;)V

    return-void
.end method

.method public static final a(Lorg/json/JSONObject;)Lcom/jumio/core/data/document/DocumentVariant;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lcom/jumio/core/data/document/DocumentVariant;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, p0}, Lcom/jumio/core/data/document/DocumentVariant;-><init>(Lorg/json/JSONObject;)V

    .line 11
    return-object v0
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
.end method


# virtual methods
.method public compareTo(Lcom/jumio/core/data/document/DocumentType;)I
    .locals 7
    .param p1    # Lcom/jumio/core/data/document/DocumentType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of v0, p1, Lcom/jumio/core/data/document/PhysicalDocumentType;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/jumio/core/data/document/PhysicalDocumentType;->a:Lcom/jumio/sdk/document/JumioDocumentType;

    sget-object v2, Lcom/jumio/sdk/document/JumioDocumentType;->PASSPORT:Lcom/jumio/sdk/document/JumioDocumentType;

    if-ne v0, v2, :cond_1

    move-object v3, p1

    check-cast v3, Lcom/jumio/core/data/document/PhysicalDocumentType;

    iget-object v3, v3, Lcom/jumio/core/data/document/PhysicalDocumentType;->a:Lcom/jumio/sdk/document/JumioDocumentType;

    if-eq v3, v2, :cond_1

    return v1

    .line 4
    :cond_1
    sget-object v3, Lcom/jumio/sdk/document/JumioDocumentType;->DRIVING_LICENSE:Lcom/jumio/sdk/document/JumioDocumentType;

    const/4 v4, 0x1

    if-ne v0, v3, :cond_2

    move-object v5, p1

    check-cast v5, Lcom/jumio/core/data/document/PhysicalDocumentType;

    iget-object v5, v5, Lcom/jumio/core/data/document/PhysicalDocumentType;->a:Lcom/jumio/sdk/document/JumioDocumentType;

    if-ne v5, v2, :cond_2

    return v4

    :cond_2
    if-ne v0, v3, :cond_3

    .line 5
    move-object v5, p1

    check-cast v5, Lcom/jumio/core/data/document/PhysicalDocumentType;

    iget-object v5, v5, Lcom/jumio/core/data/document/PhysicalDocumentType;->a:Lcom/jumio/sdk/document/JumioDocumentType;

    if-eq v5, v3, :cond_3

    return v1

    .line 6
    :cond_3
    sget-object v5, Lcom/jumio/sdk/document/JumioDocumentType;->ID_CARD:Lcom/jumio/sdk/document/JumioDocumentType;

    if-ne v0, v5, :cond_4

    move-object v6, p1

    check-cast v6, Lcom/jumio/core/data/document/PhysicalDocumentType;

    iget-object v6, v6, Lcom/jumio/core/data/document/PhysicalDocumentType;->a:Lcom/jumio/sdk/document/JumioDocumentType;

    if-ne v6, v2, :cond_4

    return v4

    :cond_4
    if-ne v0, v5, :cond_5

    .line 7
    move-object v2, p1

    check-cast v2, Lcom/jumio/core/data/document/PhysicalDocumentType;

    iget-object v2, v2, Lcom/jumio/core/data/document/PhysicalDocumentType;->a:Lcom/jumio/sdk/document/JumioDocumentType;

    if-ne v2, v3, :cond_5

    return v4

    :cond_5
    if-ne v0, v5, :cond_6

    .line 8
    move-object v2, p1

    check-cast v2, Lcom/jumio/core/data/document/PhysicalDocumentType;

    iget-object v2, v2, Lcom/jumio/core/data/document/PhysicalDocumentType;->a:Lcom/jumio/sdk/document/JumioDocumentType;

    sget-object v3, Lcom/jumio/sdk/document/JumioDocumentType;->VISA:Lcom/jumio/sdk/document/JumioDocumentType;

    if-ne v2, v3, :cond_6

    return v1

    .line 9
    :cond_6
    sget-object v2, Lcom/jumio/sdk/document/JumioDocumentType;->VISA:Lcom/jumio/sdk/document/JumioDocumentType;

    if-ne v0, v2, :cond_7

    check-cast p1, Lcom/jumio/core/data/document/PhysicalDocumentType;

    iget-object p1, p1, Lcom/jumio/core/data/document/PhysicalDocumentType;->a:Lcom/jumio/sdk/document/JumioDocumentType;

    if-eq p1, v2, :cond_7

    return v4

    :cond_7
    return v1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/jumio/core/data/document/DocumentType;

    invoke-virtual {p0, p1}, Lcom/jumio/core/data/document/PhysicalDocumentType;->compareTo(Lcom/jumio/core/data/document/DocumentType;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    instance-of v0, p1, Lcom/jumio/core/data/document/PhysicalDocumentType;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lcom/jumio/core/data/document/DocumentType;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/jumio/core/data/document/PhysicalDocumentType;->compareTo(Lcom/jumio/core/data/document/DocumentType;)I

    .line 10
    move-result p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, -0x1

    .line 13
    .line 14
    :goto_0
    if-nez p1, :cond_1

    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_1
    const/4 p1, 0x0

    .line 18
    return p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final getIdType()Lcom/jumio/sdk/document/JumioDocumentType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/data/document/PhysicalDocumentType;->a:Lcom/jumio/sdk/document/JumioDocumentType;

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
.end method

.method public getType()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/data/document/PhysicalDocumentType;->a:Lcom/jumio/sdk/document/JumioDocumentType;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/jumio/sdk/document/JumioDocumentType;->toString()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final getVariant(Lcom/jumio/sdk/document/JumioDocumentVariant;)Lcom/jumio/core/data/document/DocumentVariant;
    .locals 3
    .param p1    # Lcom/jumio/sdk/document/JumioDocumentVariant;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "variant"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/core/data/document/PhysicalDocumentType;->b:Ljava/util/List;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    move-result-object v1

    .line 22
    move-object v2, v1

    .line 23
    .line 24
    check-cast v2, Lcom/jumio/core/data/document/DocumentVariant;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Lcom/jumio/core/data/document/DocumentVariant;->getVariant()Lcom/jumio/sdk/document/JumioDocumentVariant;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    if-ne v2, p1, :cond_0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v1, 0x0

    .line 33
    .line 34
    :goto_0
    check-cast v1, Lcom/jumio/core/data/document/DocumentVariant;

    .line 35
    return-object v1
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
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
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
    .line 112
.end method

.method public final getVariants()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jumio/core/data/document/DocumentVariant;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/data/document/PhysicalDocumentType;->b:Ljava/util/List;

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
.end method

.method public final hasVariant(Lcom/jumio/sdk/document/JumioDocumentVariant;)Z
    .locals 3
    .param p1    # Lcom/jumio/sdk/document/JumioDocumentVariant;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "variant"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/core/data/document/PhysicalDocumentType;->b:Ljava/util/List;

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    move-result v2

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    return v1

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    move-result v2

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    check-cast v2, Lcom/jumio/core/data/document/DocumentVariant;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Lcom/jumio/core/data/document/DocumentVariant;->getVariant()Lcom/jumio/sdk/document/JumioDocumentVariant;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    if-ne v2, p1, :cond_1

    .line 40
    const/4 p1, 0x1

    .line 41
    return p1

    .line 42
    :cond_2
    return v1
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
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
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
    .line 112
.end method

.method public hashCode()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 4
    move-result v0

    .line 5
    return v0
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
.end method
