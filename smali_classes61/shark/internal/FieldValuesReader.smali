.class public final Lshark/internal/FieldValuesReader;
.super Ljava/lang/Object;
.source "FieldValuesReader.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lshark/internal/FieldValuesReader$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0005\n\u0002\u0008\u0004\n\u0002\u0010\n\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u000c\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 (2\u00020\u0001:\u0001)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002\u00a2\u0006\u0004\u0008#\u0010$R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010%\u00a8\u0006*"
    }
    d2 = {
        "Lshark/internal/FieldValuesReader;",
        "",
        "Lshark/l$b$c$b;",
        "record",
        "",
        "identifierByteSize",
        "<init>",
        "(Lshark/l$b$c$b;I)V",
        "Lshark/l$b$c$a$a;",
        "field",
        "Lshark/ValueHolder;",
        "j",
        "(Lshark/l$b$c$a$a;)Lshark/ValueHolder;",
        "",
        "f",
        "()J",
        "",
        "a",
        "()Z",
        "",
        "b",
        "()B",
        "g",
        "()I",
        "",
        "i",
        "()S",
        "h",
        "",
        "e",
        "()F",
        "",
        "d",
        "()D",
        "",
        "c",
        "()C",
        "I",
        "position",
        "Lshark/l$b$c$b;",
        "l",
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

.field public static final l:Lshark/internal/FieldValuesReader$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public a:I

.field public final b:Lshark/l$b$c$b;

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lshark/internal/FieldValuesReader$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lshark/internal/FieldValuesReader$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lshark/internal/FieldValuesReader;->l:Lshark/internal/FieldValuesReader$Companion;

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
    sput v0, Lshark/internal/FieldValuesReader;->d:I

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
    sput v0, Lshark/internal/FieldValuesReader;->e:I

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
    sput v0, Lshark/internal/FieldValuesReader;->f:I

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
    sput v0, Lshark/internal/FieldValuesReader;->g:I

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
    sput v0, Lshark/internal/FieldValuesReader;->h:I

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
    sput v0, Lshark/internal/FieldValuesReader;->i:I

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
    sput v0, Lshark/internal/FieldValuesReader;->j:I

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
    sput v0, Lshark/internal/FieldValuesReader;->k:I

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

.method public constructor <init>(Lshark/l$b$c$b;I)V
    .locals 0
    .param p1    # Lshark/l$b$c$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lshark/internal/FieldValuesReader;->b:Lshark/l$b$c$b;

    .line 6
    .line 7
    iput p2, p0, Lshark/internal/FieldValuesReader;->c:I

    .line 8
    return-void
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


# virtual methods
.method public final a()Z
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/FieldValuesReader;->b:Lshark/l$b$c$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lshark/l$b$c$b;->a()[B

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget v1, p0, Lshark/internal/FieldValuesReader;->a:I

    .line 9
    .line 10
    aget-byte v0, v0, v1

    .line 11
    const/4 v2, 0x1

    .line 12
    add-int/2addr v1, v2

    .line 13
    .line 14
    iput v1, p0, Lshark/internal/FieldValuesReader;->a:I

    .line 15
    const/4 v1, 0x0

    .line 16
    int-to-byte v3, v1

    .line 17
    .line 18
    if-eq v0, v3, :cond_0

    .line 19
    return v2

    .line 20
    :cond_0
    return v1
    .line 21
.end method

.method public final b()B
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/FieldValuesReader;->b:Lshark/l$b$c$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lshark/l$b$c$b;->a()[B

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget v1, p0, Lshark/internal/FieldValuesReader;->a:I

    .line 9
    .line 10
    aget-byte v0, v0, v1

    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x1

    .line 13
    .line 14
    iput v1, p0, Lshark/internal/FieldValuesReader;->a:I

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final c()C
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/FieldValuesReader;->b:Lshark/l$b$c$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lshark/l$b$c$b;->a()[B

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget v1, p0, Lshark/internal/FieldValuesReader;->a:I

    .line 9
    .line 10
    sget-object v2, Lkotlin/text/Charsets;->UTF_16BE:Ljava/nio/charset/Charset;

    .line 11
    .line 12
    new-instance v3, Ljava/lang/String;

    .line 13
    const/4 v4, 0x2

    .line 14
    .line 15
    .line 16
    invoke-direct {v3, v0, v1, v4, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 17
    .line 18
    iget v0, p0, Lshark/internal/FieldValuesReader;->a:I

    .line 19
    add-int/2addr v0, v4

    .line 20
    .line 21
    iput v0, p0, Lshark/internal/FieldValuesReader;->a:I

    .line 22
    const/4 v0, 0x0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    .line 26
    move-result v0

    .line 27
    return v0
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
    .line 105
    .line 106
    .line 107
.end method

.method public final d()D
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lkotlin/jvm/internal/DoubleCompanionObject;->INSTANCE:Lkotlin/jvm/internal/DoubleCompanionObject;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lshark/internal/FieldValuesReader;->h()J

    .line 6
    move-result-wide v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
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

.method public final e()F
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lkotlin/jvm/internal/FloatCompanionObject;->INSTANCE:Lkotlin/jvm/internal/FloatCompanionObject;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lshark/internal/FieldValuesReader;->g()I

    .line 6
    move-result v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    move-result v0

    .line 11
    return v0
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

.method public final f()J
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lshark/internal/FieldValuesReader;->c:I

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eq v0, v1, :cond_3

    .line 6
    const/4 v1, 0x2

    .line 7
    .line 8
    if-eq v0, v1, :cond_2

    .line 9
    const/4 v1, 0x4

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lshark/internal/FieldValuesReader;->h()J

    .line 19
    move-result-wide v0

    .line 20
    return-wide v0

    .line 21
    .line 22
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 23
    .line 24
    const-string v1, "ID Length must be 1, 2, 4, or 8"

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 28
    throw v0

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0}, Lshark/internal/FieldValuesReader;->g()I

    .line 32
    move-result v0

    .line 33
    :goto_0
    int-to-long v0, v0

    .line 34
    return-wide v0

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-virtual {p0}, Lshark/internal/FieldValuesReader;->i()S

    .line 38
    move-result v0

    .line 39
    goto :goto_0

    .line 40
    .line 41
    .line 42
    :cond_3
    invoke-virtual {p0}, Lshark/internal/FieldValuesReader;->b()B

    .line 43
    move-result v0

    .line 44
    goto :goto_0
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
.end method

.method public final g()I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/FieldValuesReader;->b:Lshark/l$b$c$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lshark/l$b$c$b;->a()[B

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget v1, p0, Lshark/internal/FieldValuesReader;->a:I

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lshark/internal/c;->a([BI)I

    .line 12
    move-result v0

    .line 13
    .line 14
    iget v1, p0, Lshark/internal/FieldValuesReader;->a:I

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x4

    .line 17
    .line 18
    iput v1, p0, Lshark/internal/FieldValuesReader;->a:I

    .line 19
    return v0
    .line 20
    .line 21
.end method

.method public final h()J
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/FieldValuesReader;->b:Lshark/l$b$c$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lshark/l$b$c$b;->a()[B

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget v1, p0, Lshark/internal/FieldValuesReader;->a:I

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lshark/internal/c;->b([BI)J

    .line 12
    move-result-wide v0

    .line 13
    .line 14
    iget v2, p0, Lshark/internal/FieldValuesReader;->a:I

    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x8

    .line 17
    .line 18
    iput v2, p0, Lshark/internal/FieldValuesReader;->a:I

    .line 19
    return-wide v0
    .line 20
    .line 21
.end method

.method public final i()S
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/FieldValuesReader;->b:Lshark/l$b$c$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lshark/l$b$c$b;->a()[B

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget v1, p0, Lshark/internal/FieldValuesReader;->a:I

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lshark/internal/c;->c([BI)S

    .line 12
    move-result v0

    .line 13
    .line 14
    iget v1, p0, Lshark/internal/FieldValuesReader;->a:I

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x2

    .line 17
    .line 18
    iput v1, p0, Lshark/internal/FieldValuesReader;->a:I

    .line 19
    return v0
    .line 20
    .line 21
.end method

.method public final j(Lshark/l$b$c$a$a;)Lshark/ValueHolder;
    .locals 3
    .param p1    # Lshark/l$b$c$a$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lshark/l$b$c$a$a;->b()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    new-instance p1, Lshark/ValueHolder$h;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lshark/internal/FieldValuesReader;->f()J

    .line 13
    move-result-wide v0

    .line 14
    .line 15
    .line 16
    invoke-direct {p1, v0, v1}, Lshark/ValueHolder$h;-><init>(J)V

    .line 17
    return-object p1

    .line 18
    .line 19
    :cond_0
    sget v1, Lshark/internal/FieldValuesReader;->d:I

    .line 20
    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    new-instance p1, Lshark/ValueHolder$a;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lshark/internal/FieldValuesReader;->a()Z

    .line 27
    move-result v0

    .line 28
    .line 29
    .line 30
    invoke-direct {p1, v0}, Lshark/ValueHolder$a;-><init>(Z)V

    .line 31
    return-object p1

    .line 32
    .line 33
    :cond_1
    sget v1, Lshark/internal/FieldValuesReader;->e:I

    .line 34
    .line 35
    if-ne v0, v1, :cond_2

    .line 36
    .line 37
    new-instance p1, Lshark/ValueHolder$c;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lshark/internal/FieldValuesReader;->c()C

    .line 41
    move-result v0

    .line 42
    .line 43
    .line 44
    invoke-direct {p1, v0}, Lshark/ValueHolder$c;-><init>(C)V

    .line 45
    return-object p1

    .line 46
    .line 47
    :cond_2
    sget v1, Lshark/internal/FieldValuesReader;->f:I

    .line 48
    .line 49
    if-ne v0, v1, :cond_3

    .line 50
    .line 51
    new-instance p1, Lshark/ValueHolder$e;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lshark/internal/FieldValuesReader;->e()F

    .line 55
    move-result v0

    .line 56
    .line 57
    .line 58
    invoke-direct {p1, v0}, Lshark/ValueHolder$e;-><init>(F)V

    .line 59
    return-object p1

    .line 60
    .line 61
    :cond_3
    sget v1, Lshark/internal/FieldValuesReader;->g:I

    .line 62
    .line 63
    if-ne v0, v1, :cond_4

    .line 64
    .line 65
    new-instance p1, Lshark/ValueHolder$d;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lshark/internal/FieldValuesReader;->d()D

    .line 69
    move-result-wide v0

    .line 70
    .line 71
    .line 72
    invoke-direct {p1, v0, v1}, Lshark/ValueHolder$d;-><init>(D)V

    .line 73
    return-object p1

    .line 74
    .line 75
    :cond_4
    sget v1, Lshark/internal/FieldValuesReader;->h:I

    .line 76
    .line 77
    if-ne v0, v1, :cond_5

    .line 78
    .line 79
    new-instance p1, Lshark/ValueHolder$b;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lshark/internal/FieldValuesReader;->b()B

    .line 83
    move-result v0

    .line 84
    .line 85
    .line 86
    invoke-direct {p1, v0}, Lshark/ValueHolder$b;-><init>(B)V

    .line 87
    return-object p1

    .line 88
    .line 89
    :cond_5
    sget v1, Lshark/internal/FieldValuesReader;->i:I

    .line 90
    .line 91
    if-ne v0, v1, :cond_6

    .line 92
    .line 93
    new-instance p1, Lshark/ValueHolder$i;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lshark/internal/FieldValuesReader;->i()S

    .line 97
    move-result v0

    .line 98
    .line 99
    .line 100
    invoke-direct {p1, v0}, Lshark/ValueHolder$i;-><init>(S)V

    .line 101
    return-object p1

    .line 102
    .line 103
    :cond_6
    sget v1, Lshark/internal/FieldValuesReader;->j:I

    .line 104
    .line 105
    if-ne v0, v1, :cond_7

    .line 106
    .line 107
    new-instance p1, Lshark/ValueHolder$f;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Lshark/internal/FieldValuesReader;->g()I

    .line 111
    move-result v0

    .line 112
    .line 113
    .line 114
    invoke-direct {p1, v0}, Lshark/ValueHolder$f;-><init>(I)V

    .line 115
    return-object p1

    .line 116
    .line 117
    :cond_7
    sget v1, Lshark/internal/FieldValuesReader;->k:I

    .line 118
    .line 119
    if-ne v0, v1, :cond_8

    .line 120
    .line 121
    new-instance p1, Lshark/ValueHolder$g;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Lshark/internal/FieldValuesReader;->h()J

    .line 125
    move-result-wide v0

    .line 126
    .line 127
    .line 128
    invoke-direct {p1, v0, v1}, Lshark/ValueHolder$g;-><init>(J)V

    .line 129
    return-object p1

    .line 130
    .line 131
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 132
    .line 133
    new-instance v1, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 137
    .line 138
    const-string v2, "Unknown type "

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1}, Lshark/l$b$c$a$a;->b()I

    .line 145
    move-result p1

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    move-result-object p1

    .line 153
    .line 154
    .line 155
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 156
    throw v0
    .line 157
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
.end method
