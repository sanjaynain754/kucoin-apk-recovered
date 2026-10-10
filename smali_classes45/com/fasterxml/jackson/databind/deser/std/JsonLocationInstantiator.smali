.class public Lcom/fasterxml/jackson/databind/deser/std/JsonLocationInstantiator;
.super Lcom/fasterxml/jackson/databind/deser/ValueInstantiator$Base;
.source "JsonLocationInstantiator.java"


# static fields
.field private static final serialVersionUID:J = 0x1L


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/fasterxml/jackson/core/JsonLocation;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator$Base;-><init>(Ljava/lang/Class;)V

    .line 6
    return-void
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
.end method

.method public static final a(Ljava/lang/Object;)I
    .locals 0

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    .line 6
    :cond_0
    check-cast p0, Ljava/lang/Number;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 10
    move-result p0

    .line 11
    return p0
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
.end method

.method public static final b(Ljava/lang/Object;)J
    .locals 2

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    return-wide v0

    .line 6
    .line 7
    :cond_0
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
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
.end method

.method public static c(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;I)Lcom/fasterxml/jackson/databind/deser/CreatorProperty;
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/fasterxml/jackson/databind/PropertyName;->construct(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/PropertyName;

    .line 4
    move-result-object v0

    .line 5
    const/4 v7, 0x0

    .line 6
    .line 7
    sget-object v8, Lcom/fasterxml/jackson/databind/PropertyMetadata;->STD_REQUIRED:Lcom/fasterxml/jackson/databind/PropertyMetadata;

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    move-object v1, p1

    .line 13
    move v6, p2

    .line 14
    .line 15
    .line 16
    invoke-static/range {v0 .. v8}, Lcom/fasterxml/jackson/databind/deser/CreatorProperty;->construct(Lcom/fasterxml/jackson/databind/PropertyName;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/PropertyName;Lcom/fasterxml/jackson/databind/jsontype/b;Lcom/fasterxml/jackson/databind/util/a;Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;ILcom/fasterxml/jackson/annotation/JacksonInject$Value;Lcom/fasterxml/jackson/databind/PropertyMetadata;)Lcom/fasterxml/jackson/databind/deser/CreatorProperty;

    .line 17
    move-result-object p0

    .line 18
    return-object p0
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
.end method


# virtual methods
.method public canCreateFromObjectWith()Z
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
.end method

.method public createFromObjectWith(Lcom/fasterxml/jackson/databind/DeserializationContext;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    const/4 p1, 0x0

    .line 2
    .line 3
    aget-object p1, p2, p1

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/fasterxml/jackson/core/io/ContentReference;->rawReference(Ljava/lang/Object;)Lcom/fasterxml/jackson/core/io/ContentReference;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    new-instance v0, Lcom/fasterxml/jackson/core/JsonLocation;

    .line 10
    const/4 p1, 0x1

    .line 11
    .line 12
    aget-object p1, p2, p1

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/deser/std/JsonLocationInstantiator;->b(Ljava/lang/Object;)J

    .line 16
    move-result-wide v2

    .line 17
    const/4 p1, 0x2

    .line 18
    .line 19
    aget-object p1, p2, p1

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/deser/std/JsonLocationInstantiator;->b(Ljava/lang/Object;)J

    .line 23
    move-result-wide v4

    .line 24
    const/4 p1, 0x3

    .line 25
    .line 26
    aget-object p1, p2, p1

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/deser/std/JsonLocationInstantiator;->a(Ljava/lang/Object;)I

    .line 30
    move-result v6

    .line 31
    const/4 p1, 0x4

    .line 32
    .line 33
    aget-object p1, p2, p1

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/deser/std/JsonLocationInstantiator;->a(Ljava/lang/Object;)I

    .line 37
    move-result v7

    .line 38
    .line 39
    .line 40
    invoke-direct/range {v0 .. v7}, Lcom/fasterxml/jackson/core/JsonLocation;-><init>(Lcom/fasterxml/jackson/core/io/ContentReference;JJII)V

    .line 41
    return-object v0
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public getFromObjectArguments(Lcom/fasterxml/jackson/databind/DeserializationConfig;)[Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;
    .locals 10

    .line 1
    .line 2
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->constructType(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->constructType(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    const-class v2, Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->constructType(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    .line 18
    move-result-object p1

    .line 19
    const/4 v2, 0x0

    .line 20
    .line 21
    .line 22
    const-string/jumbo v3, "sourceRef"

    .line 23
    .line 24
    .line 25
    invoke-static {v3, p1, v2}, Lcom/fasterxml/jackson/databind/deser/std/JsonLocationInstantiator;->c(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;I)Lcom/fasterxml/jackson/databind/deser/CreatorProperty;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    const-string v3, "byteOffset"

    .line 29
    const/4 v4, 0x1

    .line 30
    .line 31
    .line 32
    invoke-static {v3, v1, v4}, Lcom/fasterxml/jackson/databind/deser/std/JsonLocationInstantiator;->c(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;I)Lcom/fasterxml/jackson/databind/deser/CreatorProperty;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    const-string v5, "charOffset"

    .line 36
    const/4 v6, 0x2

    .line 37
    .line 38
    .line 39
    invoke-static {v5, v1, v6}, Lcom/fasterxml/jackson/databind/deser/std/JsonLocationInstantiator;->c(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;I)Lcom/fasterxml/jackson/databind/deser/CreatorProperty;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    const-string v5, "lineNr"

    .line 43
    const/4 v7, 0x3

    .line 44
    .line 45
    .line 46
    invoke-static {v5, v0, v7}, Lcom/fasterxml/jackson/databind/deser/std/JsonLocationInstantiator;->c(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;I)Lcom/fasterxml/jackson/databind/deser/CreatorProperty;

    .line 47
    move-result-object v5

    .line 48
    .line 49
    const-string v8, "columnNr"

    .line 50
    const/4 v9, 0x4

    .line 51
    .line 52
    .line 53
    invoke-static {v8, v0, v9}, Lcom/fasterxml/jackson/databind/deser/std/JsonLocationInstantiator;->c(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;I)Lcom/fasterxml/jackson/databind/deser/CreatorProperty;

    .line 54
    move-result-object v0

    .line 55
    const/4 v8, 0x5

    .line 56
    .line 57
    new-array v8, v8, [Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    .line 58
    .line 59
    aput-object p1, v8, v2

    .line 60
    .line 61
    aput-object v3, v8, v4

    .line 62
    .line 63
    aput-object v1, v8, v6

    .line 64
    .line 65
    aput-object v5, v8, v7

    .line 66
    .line 67
    aput-object v0, v8, v9

    .line 68
    return-object v8
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
.end method
