.class public abstract enum Lshark/ObjectInspectors;
.super Ljava/lang/Enum;
.source "ObjectInspectors.kt"

# interfaces
.implements Lshark/ObjectInspector;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lshark/ObjectInspectors$KEYED_WEAK_REFERENCE;,
        Lshark/ObjectInspectors$CLASSLOADER;,
        Lshark/ObjectInspectors$CLASS;,
        Lshark/ObjectInspectors$ANONYMOUS_CLASS;,
        Lshark/ObjectInspectors$THREAD;,
        Lshark/ObjectInspectors$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lshark/ObjectInspectors;",
        ">;",
        "Lshark/ObjectInspector;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0086\u0001\u0018\u0000 \u00122\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0012B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0003R1\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005X\u0090\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lshark/ObjectInspectors;",
        "",
        "Lshark/ObjectInspector;",
        "(Ljava/lang/String;I)V",
        "leakingObjectFilter",
        "Lkotlin/Function1;",
        "Lshark/HeapObject;",
        "Lkotlin/ParameterName;",
        "name",
        "heapObject",
        "",
        "getLeakingObjectFilter$shark",
        "()Lkotlin/jvm/functions/Function1;",
        "KEYED_WEAK_REFERENCE",
        "CLASSLOADER",
        "CLASS",
        "ANONYMOUS_CLASS",
        "THREAD",
        "Companion",
        "shark"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# static fields
.field public static final enum ANONYMOUS_CLASS:Lshark/ObjectInspectors;

.field public static final enum CLASS:Lshark/ObjectInspectors;

.field public static final enum CLASSLOADER:Lshark/ObjectInspectors;

.field public static final Companion:Lshark/ObjectInspectors$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum KEYED_WEAK_REFERENCE:Lshark/ObjectInspectors;

.field public static final enum THREAD:Lshark/ObjectInspectors;

.field public static final synthetic b:[Lshark/ObjectInspectors;

.field public static final c:Lkotlin/text/Regex;

.field public static final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lshark/FilteringLeakingObjectFinder$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final leakingObjectFilter:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lshark/HeapObject;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    .line 2
    new-instance v0, Lshark/ObjectInspectors$KEYED_WEAK_REFERENCE;

    .line 3
    .line 4
    const-string v1, "KEYED_WEAK_REFERENCE"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lshark/ObjectInspectors$KEYED_WEAK_REFERENCE;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lshark/ObjectInspectors;->KEYED_WEAK_REFERENCE:Lshark/ObjectInspectors;

    .line 11
    .line 12
    new-instance v1, Lshark/ObjectInspectors$CLASSLOADER;

    .line 13
    .line 14
    const-string v3, "CLASSLOADER"

    .line 15
    const/4 v4, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v3, v4}, Lshark/ObjectInspectors$CLASSLOADER;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v1, Lshark/ObjectInspectors;->CLASSLOADER:Lshark/ObjectInspectors;

    .line 21
    .line 22
    new-instance v3, Lshark/ObjectInspectors$CLASS;

    .line 23
    .line 24
    const-string v5, "CLASS"

    .line 25
    const/4 v6, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v3, v5, v6}, Lshark/ObjectInspectors$CLASS;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v3, Lshark/ObjectInspectors;->CLASS:Lshark/ObjectInspectors;

    .line 31
    .line 32
    new-instance v5, Lshark/ObjectInspectors$ANONYMOUS_CLASS;

    .line 33
    .line 34
    const-string v7, "ANONYMOUS_CLASS"

    .line 35
    const/4 v8, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v5, v7, v8}, Lshark/ObjectInspectors$ANONYMOUS_CLASS;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    sput-object v5, Lshark/ObjectInspectors;->ANONYMOUS_CLASS:Lshark/ObjectInspectors;

    .line 41
    .line 42
    new-instance v7, Lshark/ObjectInspectors$THREAD;

    .line 43
    .line 44
    const-string v9, "THREAD"

    .line 45
    const/4 v10, 0x4

    .line 46
    .line 47
    .line 48
    invoke-direct {v7, v9, v10}, Lshark/ObjectInspectors$THREAD;-><init>(Ljava/lang/String;I)V

    .line 49
    .line 50
    sput-object v7, Lshark/ObjectInspectors;->THREAD:Lshark/ObjectInspectors;

    .line 51
    const/4 v9, 0x5

    .line 52
    .line 53
    new-array v9, v9, [Lshark/ObjectInspectors;

    .line 54
    .line 55
    aput-object v0, v9, v2

    .line 56
    .line 57
    aput-object v1, v9, v4

    .line 58
    .line 59
    aput-object v3, v9, v6

    .line 60
    .line 61
    aput-object v5, v9, v8

    .line 62
    .line 63
    aput-object v7, v9, v10

    .line 64
    .line 65
    sput-object v9, Lshark/ObjectInspectors;->b:[Lshark/ObjectInspectors;

    .line 66
    .line 67
    new-instance v0, Lshark/ObjectInspectors$Companion;

    .line 68
    const/4 v1, 0x0

    .line 69
    .line 70
    .line 71
    invoke-direct {v0, v1}, Lshark/ObjectInspectors$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 72
    .line 73
    sput-object v0, Lshark/ObjectInspectors;->Companion:Lshark/ObjectInspectors$Companion;

    .line 74
    .line 75
    new-instance v1, Lkotlin/text/Regex;

    .line 76
    .line 77
    const-string v2, "^.+\\$\\d+$"

    .line 78
    .line 79
    .line 80
    invoke-direct {v1, v2}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    sput-object v1, Lshark/ObjectInspectors;->c:Lkotlin/text/Regex;

    .line 83
    .line 84
    const-class v1, Lshark/ObjectInspectors;

    .line 85
    .line 86
    .line 87
    invoke-static {v1}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    const-string v2, "EnumSet.allOf(ObjectInspectors::class.java)"

    .line 91
    .line 92
    .line 93
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v1}, Lshark/ObjectInspectors$Companion;->createLeakingObjectFilters(Ljava/util/Set;)Ljava/util/List;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    sput-object v0, Lshark/ObjectInspectors;->d:Ljava/util/List;

    .line 100
    return-void
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lshark/ObjectInspectors;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic access$getANONYMOUS_CLASS_NAME_PATTERN_REGEX$cp()Lkotlin/text/Regex;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lshark/ObjectInspectors;->c:Lkotlin/text/Regex;

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
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static final synthetic access$getJdkLeakingObjectFilters$cp()Ljava/util/List;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lshark/ObjectInspectors;->d:Ljava/util/List;

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
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static valueOf(Ljava/lang/String;)Lshark/ObjectInspectors;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lshark/ObjectInspectors;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lshark/ObjectInspectors;

    .line 9
    return-object p0
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

.method public static values()[Lshark/ObjectInspectors;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lshark/ObjectInspectors;->b:[Lshark/ObjectInspectors;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lshark/ObjectInspectors;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lshark/ObjectInspectors;

    .line 9
    return-object v0
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
.end method


# virtual methods
.method public getLeakingObjectFilter$shark()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lshark/HeapObject;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lshark/ObjectInspectors;->leakingObjectFilter:Lkotlin/jvm/functions/Function1;

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
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public abstract synthetic inspect(Lshark/q;)V
    .param p1    # Lshark/q;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
