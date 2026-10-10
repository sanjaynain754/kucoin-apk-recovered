.class public Lcom/fasterxml/jackson/databind/type/TypeBindings$b;
.super Ljava/lang/Object;
.source "TypeBindings.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/type/TypeBindings;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:[Ljava/lang/reflect/TypeVariable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/reflect/TypeVariable<",
            "*>;"
        }
    .end annotation
.end field

.field public static final b:[Ljava/lang/reflect/TypeVariable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/reflect/TypeVariable<",
            "*>;"
        }
    .end annotation
.end field

.field public static final c:[Ljava/lang/reflect/TypeVariable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/reflect/TypeVariable<",
            "*>;"
        }
    .end annotation
.end field

.field public static final d:[Ljava/lang/reflect/TypeVariable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/reflect/TypeVariable<",
            "*>;"
        }
    .end annotation
.end field

.field public static final e:[Ljava/lang/reflect/TypeVariable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/reflect/TypeVariable<",
            "*>;"
        }
    .end annotation
.end field

.field public static final f:[Ljava/lang/reflect/TypeVariable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/reflect/TypeVariable<",
            "*>;"
        }
    .end annotation
.end field

.field public static final g:[Ljava/lang/reflect/TypeVariable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/reflect/TypeVariable<",
            "*>;"
        }
    .end annotation
.end field

.field public static final h:[Ljava/lang/reflect/TypeVariable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/reflect/TypeVariable<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const-class v0, Ljava/util/AbstractList;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sput-object v0, Lcom/fasterxml/jackson/databind/type/TypeBindings$b;->a:[Ljava/lang/reflect/TypeVariable;

    .line 9
    .line 10
    const-class v0, Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sput-object v0, Lcom/fasterxml/jackson/databind/type/TypeBindings$b;->b:[Ljava/lang/reflect/TypeVariable;

    .line 17
    .line 18
    const-class v0, Ljava/lang/Iterable;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    sput-object v0, Lcom/fasterxml/jackson/databind/type/TypeBindings$b;->c:[Ljava/lang/reflect/TypeVariable;

    .line 25
    .line 26
    const-class v0, Ljava/util/List;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    sput-object v0, Lcom/fasterxml/jackson/databind/type/TypeBindings$b;->d:[Ljava/lang/reflect/TypeVariable;

    .line 33
    .line 34
    const-class v0, Ljava/util/ArrayList;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    sput-object v0, Lcom/fasterxml/jackson/databind/type/TypeBindings$b;->e:[Ljava/lang/reflect/TypeVariable;

    .line 41
    .line 42
    const-class v0, Ljava/util/Map;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    sput-object v0, Lcom/fasterxml/jackson/databind/type/TypeBindings$b;->f:[Ljava/lang/reflect/TypeVariable;

    .line 49
    .line 50
    const-class v0, Ljava/util/HashMap;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    sput-object v0, Lcom/fasterxml/jackson/databind/type/TypeBindings$b;->g:[Ljava/lang/reflect/TypeVariable;

    .line 57
    .line 58
    const-class v0, Ljava/util/LinkedHashMap;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    sput-object v0, Lcom/fasterxml/jackson/databind/type/TypeBindings$b;->h:[Ljava/lang/reflect/TypeVariable;

    .line 65
    return-void
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
.end method

.method public static a(Ljava/lang/Class;)[Ljava/lang/reflect/TypeVariable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)[",
            "Ljava/lang/reflect/TypeVariable<",
            "*>;"
        }
    .end annotation

    .line 1
    .line 2
    const-class v0, Ljava/util/Collection;

    .line 3
    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    sget-object p0, Lcom/fasterxml/jackson/databind/type/TypeBindings$b;->b:[Ljava/lang/reflect/TypeVariable;

    .line 7
    return-object p0

    .line 8
    .line 9
    :cond_0
    const-class v0, Ljava/util/List;

    .line 10
    .line 11
    if-ne p0, v0, :cond_1

    .line 12
    .line 13
    sget-object p0, Lcom/fasterxml/jackson/databind/type/TypeBindings$b;->d:[Ljava/lang/reflect/TypeVariable;

    .line 14
    return-object p0

    .line 15
    .line 16
    :cond_1
    const-class v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    if-ne p0, v0, :cond_2

    .line 19
    .line 20
    sget-object p0, Lcom/fasterxml/jackson/databind/type/TypeBindings$b;->e:[Ljava/lang/reflect/TypeVariable;

    .line 21
    return-object p0

    .line 22
    .line 23
    :cond_2
    const-class v0, Ljava/util/AbstractList;

    .line 24
    .line 25
    if-ne p0, v0, :cond_3

    .line 26
    .line 27
    sget-object p0, Lcom/fasterxml/jackson/databind/type/TypeBindings$b;->a:[Ljava/lang/reflect/TypeVariable;

    .line 28
    return-object p0

    .line 29
    .line 30
    :cond_3
    const-class v0, Ljava/lang/Iterable;

    .line 31
    .line 32
    if-ne p0, v0, :cond_4

    .line 33
    .line 34
    sget-object p0, Lcom/fasterxml/jackson/databind/type/TypeBindings$b;->c:[Ljava/lang/reflect/TypeVariable;

    .line 35
    return-object p0

    .line 36
    .line 37
    .line 38
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 39
    move-result-object p0

    .line 40
    return-object p0
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
.end method

.method public static b(Ljava/lang/Class;)[Ljava/lang/reflect/TypeVariable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)[",
            "Ljava/lang/reflect/TypeVariable<",
            "*>;"
        }
    .end annotation

    .line 1
    .line 2
    const-class v0, Ljava/util/Map;

    .line 3
    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    sget-object p0, Lcom/fasterxml/jackson/databind/type/TypeBindings$b;->f:[Ljava/lang/reflect/TypeVariable;

    .line 7
    return-object p0

    .line 8
    .line 9
    :cond_0
    const-class v0, Ljava/util/HashMap;

    .line 10
    .line 11
    if-ne p0, v0, :cond_1

    .line 12
    .line 13
    sget-object p0, Lcom/fasterxml/jackson/databind/type/TypeBindings$b;->g:[Ljava/lang/reflect/TypeVariable;

    .line 14
    return-object p0

    .line 15
    .line 16
    :cond_1
    const-class v0, Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    if-ne p0, v0, :cond_2

    .line 19
    .line 20
    sget-object p0, Lcom/fasterxml/jackson/databind/type/TypeBindings$b;->h:[Ljava/lang/reflect/TypeVariable;

    .line 21
    return-object p0

    .line 22
    .line 23
    .line 24
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 25
    move-result-object p0

    .line 26
    return-object p0
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
.end method
