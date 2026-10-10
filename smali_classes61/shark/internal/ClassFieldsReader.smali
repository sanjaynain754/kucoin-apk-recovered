.class public final Lshark/internal/ClassFieldsReader;
.super Ljava/lang/Object;
.source "ClassFieldsReader.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lshark/internal/ClassFieldsReader$a;,
        Lshark/internal/ClassFieldsReader$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000M\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0008\n*\u0001\u001b\u0008\u0000\u0018\u0000 \u00112\u00020\u0001:\u0002#\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001b\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001b\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J:\u0010\u0019\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u001b\u0010\u0018\u001a\u0017\u0012\u0008\u0012\u00060\u0016R\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0015\u00a2\u0006\u0002\u0008\u0017H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lshark/internal/ClassFieldsReader;",
        "",
        "",
        "identifierByteSize",
        "",
        "classFieldBytes",
        "<init>",
        "(I[B)V",
        "Lshark/internal/h$a;",
        "indexedClass",
        "",
        "Lshark/l$b$c$a$b;",
        "m",
        "(Lshark/internal/h$a;)Ljava/util/List;",
        "Lshark/l$b$c$a$a;",
        "k",
        "",
        "l",
        "(Lshark/internal/h$a;)Z",
        "R",
        "initialPosition",
        "Lkotlin/Function1;",
        "Lshark/internal/ClassFieldsReader$a;",
        "Lkotlin/ExtensionFunctionType;",
        "block",
        "n",
        "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
        "shark/internal/ClassFieldsReader$b",
        "a",
        "Lshark/internal/ClassFieldsReader$b;",
        "readInFlightThreadLocal",
        "b",
        "I",
        "c",
        "[B",
        "Companion",
        "shark-graph"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# static fields
.field public static final d:I

.field public static final e:I

.field public static final f:I

.field public static final g:I

.field public static final h:I

.field public static final i:I

.field public static final j:I

.field public static final k:I

.field public static final l:Lshark/internal/ClassFieldsReader$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lshark/internal/ClassFieldsReader$b;

.field public final b:I

.field public final c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lshark/internal/ClassFieldsReader$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lshark/internal/ClassFieldsReader$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lshark/internal/ClassFieldsReader;->l:Lshark/internal/ClassFieldsReader$Companion;

    .line 9
    .line 10
    sget-object v0, Lshark/PrimitiveType;->BOOLEAN:Lshark/PrimitiveType;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lshark/PrimitiveType;->getHprofType()I

    .line 14
    move-result v0

    .line 15
    .line 16
    sput v0, Lshark/internal/ClassFieldsReader;->d:I

    .line 17
    .line 18
    sget-object v0, Lshark/PrimitiveType;->CHAR:Lshark/PrimitiveType;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lshark/PrimitiveType;->getHprofType()I

    .line 22
    move-result v0

    .line 23
    .line 24
    sput v0, Lshark/internal/ClassFieldsReader;->e:I

    .line 25
    .line 26
    sget-object v0, Lshark/PrimitiveType;->FLOAT:Lshark/PrimitiveType;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lshark/PrimitiveType;->getHprofType()I

    .line 30
    move-result v0

    .line 31
    .line 32
    sput v0, Lshark/internal/ClassFieldsReader;->f:I

    .line 33
    .line 34
    sget-object v0, Lshark/PrimitiveType;->DOUBLE:Lshark/PrimitiveType;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lshark/PrimitiveType;->getHprofType()I

    .line 38
    move-result v0

    .line 39
    .line 40
    sput v0, Lshark/internal/ClassFieldsReader;->g:I

    .line 41
    .line 42
    sget-object v0, Lshark/PrimitiveType;->BYTE:Lshark/PrimitiveType;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lshark/PrimitiveType;->getHprofType()I

    .line 46
    move-result v0

    .line 47
    .line 48
    sput v0, Lshark/internal/ClassFieldsReader;->h:I

    .line 49
    .line 50
    sget-object v0, Lshark/PrimitiveType;->SHORT:Lshark/PrimitiveType;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lshark/PrimitiveType;->getHprofType()I

    .line 54
    move-result v0

    .line 55
    .line 56
    sput v0, Lshark/internal/ClassFieldsReader;->i:I

    .line 57
    .line 58
    sget-object v0, Lshark/PrimitiveType;->INT:Lshark/PrimitiveType;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lshark/PrimitiveType;->getHprofType()I

    .line 62
    move-result v0

    .line 63
    .line 64
    sput v0, Lshark/internal/ClassFieldsReader;->j:I

    .line 65
    .line 66
    sget-object v0, Lshark/PrimitiveType;->LONG:Lshark/PrimitiveType;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lshark/PrimitiveType;->getHprofType()I

    .line 70
    move-result v0

    .line 71
    .line 72
    sput v0, Lshark/internal/ClassFieldsReader;->k:I

    .line 73
    return-void
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
.end method

.method public constructor <init>(I[B)V
    .locals 0
    .param p2    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Lshark/internal/ClassFieldsReader;->b:I

    .line 6
    .line 7
    iput-object p2, p0, Lshark/internal/ClassFieldsReader;->c:[B

    .line 8
    .line 9
    new-instance p1, Lshark/internal/ClassFieldsReader$b;

    .line 10
    .line 11
    .line 12
    invoke-direct {p1, p0}, Lshark/internal/ClassFieldsReader$b;-><init>(Lshark/internal/ClassFieldsReader;)V

    .line 13
    .line 14
    iput-object p1, p0, Lshark/internal/ClassFieldsReader;->a:Lshark/internal/ClassFieldsReader$b;

    .line 15
    return-void
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
.end method

.method public static final synthetic a()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lshark/internal/ClassFieldsReader;->d:I

    .line 3
    return v0
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

.method public static final synthetic b()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lshark/internal/ClassFieldsReader;->h:I

    .line 3
    return v0
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

.method public static final synthetic c()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lshark/internal/ClassFieldsReader;->e:I

    .line 3
    return v0
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

.method public static final synthetic d(Lshark/internal/ClassFieldsReader;)[B
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lshark/internal/ClassFieldsReader;->c:[B

    .line 3
    return-object p0
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

.method public static final synthetic e()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lshark/internal/ClassFieldsReader;->g:I

    .line 3
    return v0
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

.method public static final synthetic f()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lshark/internal/ClassFieldsReader;->f:I

    .line 3
    return v0
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

.method public static final synthetic g()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lshark/internal/ClassFieldsReader;->j:I

    .line 3
    return v0
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

.method public static final synthetic h(Lshark/internal/ClassFieldsReader;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lshark/internal/ClassFieldsReader;->b:I

    .line 3
    return p0
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

.method public static final synthetic i()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lshark/internal/ClassFieldsReader;->k:I

    .line 3
    return v0
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

.method public static final synthetic j()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lshark/internal/ClassFieldsReader;->i:I

    .line 3
    return v0
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


# virtual methods
.method public final k(Lshark/internal/h$a;)Ljava/util/List;
    .locals 1
    .param p1    # Lshark/internal/h$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lshark/internal/h$a;",
            ")",
            "Ljava/util/List<",
            "Lshark/l$b$c$a$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lshark/internal/h$a;->c()I

    .line 4
    move-result p1

    .line 5
    .line 6
    sget-object v0, Lshark/internal/ClassFieldsReader$classDumpFields$1;->INSTANCE:Lshark/internal/ClassFieldsReader$classDumpFields$1;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, v0}, Lshark/internal/ClassFieldsReader;->n(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    check-cast p1, Ljava/util/List;

    .line 13
    return-object p1
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

.method public final l(Lshark/internal/h$a;)Z
    .locals 1
    .param p1    # Lshark/internal/h$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lshark/internal/h$a;->c()I

    .line 4
    move-result p1

    .line 5
    .line 6
    new-instance v0, Lshark/internal/ClassFieldsReader$classDumpHasReferenceFields$1;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0}, Lshark/internal/ClassFieldsReader$classDumpHasReferenceFields$1;-><init>(Lshark/internal/ClassFieldsReader;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, v0}, Lshark/internal/ClassFieldsReader;->n(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    check-cast p1, Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    move-result p1

    .line 20
    return p1
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

.method public final m(Lshark/internal/h$a;)Ljava/util/List;
    .locals 1
    .param p1    # Lshark/internal/h$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lshark/internal/h$a;",
            ")",
            "Ljava/util/List<",
            "Lshark/l$b$c$a$b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lshark/internal/h$a;->c()I

    .line 4
    move-result p1

    .line 5
    .line 6
    sget-object v0, Lshark/internal/ClassFieldsReader$classDumpStaticFields$1;->INSTANCE:Lshark/internal/ClassFieldsReader$classDumpStaticFields$1;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, v0}, Lshark/internal/ClassFieldsReader;->n(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    check-cast p1, Ljava/util/List;

    .line 13
    return-object p1
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

.method public final n(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lshark/internal/ClassFieldsReader$a;",
            "+TR;>;)TR;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/ClassFieldsReader;->a:Lshark/internal/ClassFieldsReader$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lshark/internal/ClassFieldsReader$a;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lshark/internal/ClassFieldsReader$a;->n(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    move-result-object p1

    .line 16
    return-object p1
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
.end method
