.class public final Lshark/internal/aosp/ByteArrayTimSort;
.super Ljava/lang/Object;
.source "ByteArrayTimSort.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lshark/internal/aosp/ByteArrayTimSort$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0015\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 \r2\u00020\u0001:\u0001*B!\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J/\u0010\u001a\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001eR\u0014\u0010\n\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0014\u0010\u000b\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u001e\u00a8\u0006+"
    }
    d2 = {
        "Lshark/internal/aosp/ByteArrayTimSort;",
        "",
        "",
        "a",
        "Lbi0/a;",
        "c",
        "",
        "entrySize",
        "<init>",
        "([BLbi0/a;I)V",
        "runBase",
        "runLen",
        "",
        "m",
        "(II)V",
        "i",
        "()V",
        "j",
        "h",
        "(I)V",
        "base1",
        "len1",
        "base2",
        "len2",
        "l",
        "(IIII)V",
        "k",
        "minCapacity",
        "g",
        "(I)[B",
        "I",
        "minGallop",
        "b",
        "[B",
        "tmp",
        "stackSize",
        "",
        "d",
        "[I",
        "e",
        "f",
        "Lbi0/a;",
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
.field public static final i:I

.field public static final j:I

.field public static final k:I

.field public static final l:Z

.field public static final m:Lshark/internal/aosp/ByteArrayTimSort$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public a:I

.field public b:[B

.field public c:I

.field public final d:[I

.field public final e:[I

.field public final f:[B

.field public final g:Lbi0/a;

.field public final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lshark/internal/aosp/ByteArrayTimSort$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lshark/internal/aosp/ByteArrayTimSort$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lshark/internal/aosp/ByteArrayTimSort;->m:Lshark/internal/aosp/ByteArrayTimSort$Companion;

    .line 9
    .line 10
    const/16 v0, 0x20

    .line 11
    .line 12
    sput v0, Lshark/internal/aosp/ByteArrayTimSort;->i:I

    .line 13
    const/4 v0, 0x7

    .line 14
    .line 15
    sput v0, Lshark/internal/aosp/ByteArrayTimSort;->j:I

    .line 16
    .line 17
    const/16 v0, 0x100

    .line 18
    .line 19
    sput v0, Lshark/internal/aosp/ByteArrayTimSort;->k:I

    .line 20
    return-void
    .line 21
.end method

.method public constructor <init>([BLbi0/a;I)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lshark/internal/aosp/ByteArrayTimSort;->f:[B

    iput-object p2, p0, Lshark/internal/aosp/ByteArrayTimSort;->g:Lbi0/a;

    iput p3, p0, Lshark/internal/aosp/ByteArrayTimSort;->h:I

    .line 3
    sget p2, Lshark/internal/aosp/ByteArrayTimSort;->j:I

    iput p2, p0, Lshark/internal/aosp/ByteArrayTimSort;->a:I

    .line 4
    array-length p1, p1

    div-int/2addr p1, p3

    .line 5
    sget p2, Lshark/internal/aosp/ByteArrayTimSort;->k:I

    mul-int/lit8 v0, p2, 0x2

    if-ge p1, v0, :cond_0

    ushr-int/lit8 p2, p1, 0x1

    :cond_0
    mul-int/2addr p3, p2

    .line 6
    new-array p2, p3, [B

    .line 7
    iput-object p2, p0, Lshark/internal/aosp/ByteArrayTimSort;->b:[B

    const/16 p2, 0x78

    if-ge p1, p2, :cond_1

    const/4 p1, 0x5

    goto :goto_0

    :cond_1
    const/16 p2, 0x606

    if-ge p1, p2, :cond_2

    const/16 p1, 0xa

    goto :goto_0

    :cond_2
    const p2, 0x1d16f

    if-ge p1, p2, :cond_3

    const/16 p1, 0x13

    goto :goto_0

    :cond_3
    const/16 p1, 0x28

    .line 8
    :goto_0
    new-array p2, p1, [I

    iput-object p2, p0, Lshark/internal/aosp/ByteArrayTimSort;->d:[I

    .line 9
    new-array p1, p1, [I

    iput-object p1, p0, Lshark/internal/aosp/ByteArrayTimSort;->e:[I

    return-void
.end method

.method public synthetic constructor <init>([BLbi0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lshark/internal/aosp/ByteArrayTimSort;-><init>([BLbi0/a;I)V

    return-void
.end method

.method public static final synthetic a()Z
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lshark/internal/aosp/ByteArrayTimSort;->l:Z

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
    sget v0, Lshark/internal/aosp/ByteArrayTimSort;->i:I

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

.method public static final synthetic c(Lshark/internal/aosp/ByteArrayTimSort;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lshark/internal/aosp/ByteArrayTimSort;->c:I

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

.method public static final synthetic d(Lshark/internal/aosp/ByteArrayTimSort;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lshark/internal/aosp/ByteArrayTimSort;->i()V

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

.method public static final synthetic e(Lshark/internal/aosp/ByteArrayTimSort;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lshark/internal/aosp/ByteArrayTimSort;->j()V

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

.method public static final synthetic f(Lshark/internal/aosp/ByteArrayTimSort;II)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lshark/internal/aosp/ByteArrayTimSort;->m(II)V

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
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
.end method


# virtual methods
.method public final g(I)[B
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/aosp/ByteArrayTimSort;->b:[B

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 8
    :cond_0
    array-length v0, v0

    .line 9
    .line 10
    iget v1, p0, Lshark/internal/aosp/ByteArrayTimSort;->h:I

    .line 11
    .line 12
    mul-int v2, p1, v1

    .line 13
    .line 14
    if-ge v0, v2, :cond_2

    .line 15
    .line 16
    shr-int/lit8 v0, p1, 0x1

    .line 17
    or-int/2addr v0, p1

    .line 18
    .line 19
    shr-int/lit8 v2, v0, 0x2

    .line 20
    or-int/2addr v0, v2

    .line 21
    .line 22
    shr-int/lit8 v2, v0, 0x4

    .line 23
    or-int/2addr v0, v2

    .line 24
    .line 25
    shr-int/lit8 v2, v0, 0x8

    .line 26
    or-int/2addr v0, v2

    .line 27
    .line 28
    shr-int/lit8 v2, v0, 0x10

    .line 29
    or-int/2addr v0, v2

    .line 30
    .line 31
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    if-gez v0, :cond_1

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :cond_1
    iget-object p1, p0, Lshark/internal/aosp/ByteArrayTimSort;->f:[B

    .line 37
    array-length p1, p1

    .line 38
    div-int/2addr p1, v1

    .line 39
    .line 40
    ushr-int/lit8 p1, p1, 0x1

    .line 41
    .line 42
    .line 43
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 44
    move-result p1

    .line 45
    .line 46
    :goto_0
    iget v0, p0, Lshark/internal/aosp/ByteArrayTimSort;->h:I

    .line 47
    mul-int/2addr p1, v0

    .line 48
    .line 49
    new-array p1, p1, [B

    .line 50
    .line 51
    iput-object p1, p0, Lshark/internal/aosp/ByteArrayTimSort;->b:[B

    .line 52
    .line 53
    :cond_2
    iget-object p1, p0, Lshark/internal/aosp/ByteArrayTimSort;->b:[B

    .line 54
    .line 55
    if-nez p1, :cond_3

    .line 56
    .line 57
    .line 58
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 59
    :cond_3
    return-object p1
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
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method

.method public final h(I)V
    .locals 19

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move/from16 v1, p1

    .line 5
    .line 6
    sget-boolean v2, Lshark/internal/aosp/ByteArrayTimSort;->l:Z

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    iget v3, v0, Lshark/internal/aosp/ByteArrayTimSort;->c:I

    .line 11
    .line 12
    add-int/lit8 v4, v3, -0x2

    .line 13
    .line 14
    if-eq v1, v4, :cond_0

    .line 15
    .line 16
    add-int/lit8 v3, v3, -0x3

    .line 17
    .line 18
    :cond_0
    iget-object v3, v0, Lshark/internal/aosp/ByteArrayTimSort;->d:[I

    .line 19
    .line 20
    aget v8, v3, v1

    .line 21
    .line 22
    iget-object v4, v0, Lshark/internal/aosp/ByteArrayTimSort;->e:[I

    .line 23
    .line 24
    aget v9, v4, v1

    .line 25
    .line 26
    add-int/lit8 v5, v1, 0x1

    .line 27
    .line 28
    aget v14, v3, v5

    .line 29
    .line 30
    aget v15, v4, v5

    .line 31
    .line 32
    add-int v2, v9, v15

    .line 33
    .line 34
    aput v2, v4, v1

    .line 35
    .line 36
    iget v2, v0, Lshark/internal/aosp/ByteArrayTimSort;->c:I

    .line 37
    .line 38
    add-int/lit8 v6, v2, -0x3

    .line 39
    .line 40
    if-ne v1, v6, :cond_1

    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x2

    .line 43
    .line 44
    aget v6, v3, v1

    .line 45
    .line 46
    aput v6, v3, v5

    .line 47
    .line 48
    aget v1, v4, v1

    .line 49
    .line 50
    aput v1, v4, v5

    .line 51
    .line 52
    :cond_1
    add-int/lit8 v2, v2, -0x1

    .line 53
    .line 54
    iput v2, v0, Lshark/internal/aosp/ByteArrayTimSort;->c:I

    .line 55
    .line 56
    sget-object v4, Lshark/internal/aosp/ByteArrayTimSort;->m:Lshark/internal/aosp/ByteArrayTimSort$Companion;

    .line 57
    .line 58
    iget-object v5, v0, Lshark/internal/aosp/ByteArrayTimSort;->f:[B

    .line 59
    .line 60
    iget v11, v0, Lshark/internal/aosp/ByteArrayTimSort;->h:I

    .line 61
    .line 62
    iget-object v12, v0, Lshark/internal/aosp/ByteArrayTimSort;->g:Lbi0/a;

    .line 63
    const/4 v10, 0x0

    .line 64
    move-object v7, v5

    .line 65
    move v6, v14

    .line 66
    .line 67
    .line 68
    invoke-static/range {v4 .. v12}, Lshark/internal/aosp/ByteArrayTimSort$Companion;->access$gallopRight(Lshark/internal/aosp/ByteArrayTimSort$Companion;[BI[BIIIILbi0/a;)I

    .line 69
    move-result v1

    .line 70
    add-int/2addr v8, v1

    .line 71
    sub-int/2addr v9, v1

    .line 72
    .line 73
    if-nez v9, :cond_2

    .line 74
    goto :goto_0

    .line 75
    .line 76
    :cond_2
    iget-object v11, v0, Lshark/internal/aosp/ByteArrayTimSort;->f:[B

    .line 77
    .line 78
    add-int v1, v8, v9

    .line 79
    .line 80
    add-int/lit8 v12, v1, -0x1

    .line 81
    .line 82
    add-int/lit8 v16, v15, -0x1

    .line 83
    .line 84
    iget v1, v0, Lshark/internal/aosp/ByteArrayTimSort;->h:I

    .line 85
    .line 86
    iget-object v2, v0, Lshark/internal/aosp/ByteArrayTimSort;->g:Lbi0/a;

    .line 87
    move-object v13, v11

    .line 88
    .line 89
    move/from16 v17, v1

    .line 90
    .line 91
    move-object/from16 v18, v2

    .line 92
    move-object v10, v4

    .line 93
    .line 94
    .line 95
    invoke-static/range {v10 .. v18}, Lshark/internal/aosp/ByteArrayTimSort$Companion;->access$gallopLeft(Lshark/internal/aosp/ByteArrayTimSort$Companion;[BI[BIIIILbi0/a;)I

    .line 96
    move-result v1

    .line 97
    .line 98
    if-nez v1, :cond_3

    .line 99
    :goto_0
    return-void

    .line 100
    .line 101
    :cond_3
    if-gt v9, v1, :cond_4

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v8, v9, v14, v1}, Lshark/internal/aosp/ByteArrayTimSort;->l(IIII)V

    .line 105
    return-void

    .line 106
    .line 107
    .line 108
    :cond_4
    invoke-virtual {v0, v8, v9, v14, v1}, Lshark/internal/aosp/ByteArrayTimSort;->k(IIII)V

    .line 109
    return-void
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method

.method public final i()V
    .locals 6

    .line 1
    .line 2
    :goto_0
    iget v0, p0, Lshark/internal/aosp/ByteArrayTimSort;->c:I

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-le v0, v1, :cond_4

    .line 6
    .line 7
    add-int/lit8 v2, v0, -0x2

    .line 8
    .line 9
    if-lt v2, v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lshark/internal/aosp/ByteArrayTimSort;->e:[I

    .line 12
    .line 13
    add-int/lit8 v3, v0, -0x3

    .line 14
    .line 15
    aget v3, v1, v3

    .line 16
    .line 17
    aget v4, v1, v2

    .line 18
    .line 19
    add-int/lit8 v5, v0, -0x1

    .line 20
    .line 21
    aget v1, v1, v5

    .line 22
    add-int/2addr v4, v1

    .line 23
    .line 24
    if-le v3, v4, :cond_1

    .line 25
    :cond_0
    const/4 v1, 0x2

    .line 26
    .line 27
    if-lt v2, v1, :cond_2

    .line 28
    .line 29
    iget-object v1, p0, Lshark/internal/aosp/ByteArrayTimSort;->e:[I

    .line 30
    .line 31
    add-int/lit8 v3, v0, -0x4

    .line 32
    .line 33
    aget v3, v1, v3

    .line 34
    .line 35
    aget v4, v1, v2

    .line 36
    .line 37
    add-int/lit8 v5, v0, -0x3

    .line 38
    .line 39
    aget v1, v1, v5

    .line 40
    add-int/2addr v4, v1

    .line 41
    .line 42
    if-gt v3, v4, :cond_2

    .line 43
    .line 44
    :cond_1
    iget-object v1, p0, Lshark/internal/aosp/ByteArrayTimSort;->e:[I

    .line 45
    .line 46
    add-int/lit8 v3, v0, -0x3

    .line 47
    .line 48
    aget v3, v1, v3

    .line 49
    .line 50
    add-int/lit8 v4, v0, -0x1

    .line 51
    .line 52
    aget v1, v1, v4

    .line 53
    .line 54
    if-ge v3, v1, :cond_3

    .line 55
    .line 56
    add-int/lit8 v2, v0, -0x3

    .line 57
    goto :goto_1

    .line 58
    .line 59
    :cond_2
    iget-object v1, p0, Lshark/internal/aosp/ByteArrayTimSort;->e:[I

    .line 60
    .line 61
    aget v3, v1, v2

    .line 62
    .line 63
    add-int/lit8 v0, v0, -0x1

    .line 64
    .line 65
    aget v0, v1, v0

    .line 66
    .line 67
    if-le v3, v0, :cond_3

    .line 68
    goto :goto_2

    .line 69
    .line 70
    .line 71
    :cond_3
    :goto_1
    invoke-virtual {p0, v2}, Lshark/internal/aosp/ByteArrayTimSort;->h(I)V

    .line 72
    goto :goto_0

    .line 73
    :cond_4
    :goto_2
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

.method public final j()V
    .locals 5

    .line 1
    .line 2
    :goto_0
    iget v0, p0, Lshark/internal/aosp/ByteArrayTimSort;->c:I

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-le v0, v1, :cond_1

    .line 6
    .line 7
    add-int/lit8 v1, v0, -0x2

    .line 8
    .line 9
    if-lez v1, :cond_0

    .line 10
    .line 11
    iget-object v2, p0, Lshark/internal/aosp/ByteArrayTimSort;->e:[I

    .line 12
    .line 13
    add-int/lit8 v3, v0, -0x3

    .line 14
    .line 15
    aget v3, v2, v3

    .line 16
    .line 17
    add-int/lit8 v4, v0, -0x1

    .line 18
    .line 19
    aget v2, v2, v4

    .line 20
    .line 21
    if-ge v3, v2, :cond_0

    .line 22
    .line 23
    add-int/lit8 v1, v0, -0x3

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0, v1}, Lshark/internal/aosp/ByteArrayTimSort;->h(I)V

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return-void
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

.method public final k(IIII)V
    .locals 20

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move/from16 v1, p3

    .line 5
    .line 6
    move/from16 v2, p4

    .line 7
    .line 8
    sget-boolean v3, Lshark/internal/aosp/ByteArrayTimSort;->l:Z

    .line 9
    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    if-lez p2, :cond_0

    .line 13
    .line 14
    if-lez v2, :cond_0

    .line 15
    .line 16
    add-int v3, p1, p2

    .line 17
    .line 18
    :cond_0
    iget-object v5, v0, Lshark/internal/aosp/ByteArrayTimSort;->f:[B

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, Lshark/internal/aosp/ByteArrayTimSort;->g(I)[B

    .line 22
    move-result-object v6

    .line 23
    .line 24
    iget v11, v0, Lshark/internal/aosp/ByteArrayTimSort;->h:I

    .line 25
    .line 26
    mul-int v3, v1, v11

    .line 27
    .line 28
    mul-int v4, v2, v11

    .line 29
    const/4 v13, 0x0

    .line 30
    .line 31
    .line 32
    invoke-static {v5, v3, v6, v13, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 33
    .line 34
    add-int v3, p1, p2

    .line 35
    .line 36
    add-int/lit8 v7, v3, -0x1

    .line 37
    .line 38
    add-int/lit8 v8, v2, -0x1

    .line 39
    add-int/2addr v1, v2

    .line 40
    .line 41
    add-int/lit8 v9, v1, -0x1

    .line 42
    mul-int/2addr v9, v11

    .line 43
    mul-int/2addr v7, v11

    .line 44
    move v10, v13

    .line 45
    .line 46
    :goto_0
    if-ge v10, v11, :cond_1

    .line 47
    .line 48
    add-int v12, v9, v10

    .line 49
    .line 50
    add-int v14, v7, v10

    .line 51
    .line 52
    aget-byte v14, v5, v14

    .line 53
    .line 54
    aput-byte v14, v5, v12

    .line 55
    .line 56
    add-int/lit8 v10, v10, 0x1

    .line 57
    goto :goto_0

    .line 58
    .line 59
    :cond_1
    add-int/lit8 v1, v1, -0x2

    .line 60
    .line 61
    add-int/lit8 v3, v3, -0x2

    .line 62
    .line 63
    add-int/lit8 v7, p2, -0x1

    .line 64
    .line 65
    if-nez v7, :cond_2

    .line 66
    sub-int/2addr v1, v8

    .line 67
    mul-int/2addr v1, v11

    .line 68
    .line 69
    .line 70
    invoke-static {v6, v13, v5, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 71
    return-void

    .line 72
    :cond_2
    const/4 v14, 0x1

    .line 73
    .line 74
    if-ne v2, v14, :cond_3

    .line 75
    sub-int/2addr v1, v7

    .line 76
    sub-int/2addr v3, v7

    .line 77
    add-int/2addr v3, v14

    .line 78
    mul-int/2addr v3, v11

    .line 79
    .line 80
    add-int/lit8 v2, v1, 0x1

    .line 81
    mul-int/2addr v2, v11

    .line 82
    mul-int/2addr v7, v11

    .line 83
    .line 84
    .line 85
    invoke-static {v5, v3, v5, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 86
    mul-int/2addr v1, v11

    .line 87
    mul-int/2addr v8, v11

    .line 88
    .line 89
    :goto_1
    if-ge v13, v11, :cond_11

    .line 90
    .line 91
    add-int v2, v1, v13

    .line 92
    .line 93
    add-int v3, v8, v13

    .line 94
    .line 95
    aget-byte v3, v6, v3

    .line 96
    .line 97
    aput-byte v3, v5, v2

    .line 98
    .line 99
    add-int/lit8 v13, v13, 0x1

    .line 100
    goto :goto_1

    .line 101
    .line 102
    :cond_3
    iget-object v12, v0, Lshark/internal/aosp/ByteArrayTimSort;->g:Lbi0/a;

    .line 103
    .line 104
    iget v4, v0, Lshark/internal/aosp/ByteArrayTimSort;->a:I

    .line 105
    move v10, v4

    .line 106
    :goto_2
    move v9, v3

    .line 107
    move v3, v7

    .line 108
    move v7, v8

    .line 109
    move v15, v13

    .line 110
    .line 111
    move/from16 v16, v15

    .line 112
    .line 113
    :goto_3
    sget-boolean v4, Lshark/internal/aosp/ByteArrayTimSort;->l:Z

    .line 114
    move-object v8, v5

    .line 115
    move v5, v11

    .line 116
    move-object v4, v12

    .line 117
    .line 118
    .line 119
    invoke-interface/range {v4 .. v9}, Lbi0/a;->a(I[BI[BI)I

    .line 120
    move-result v11

    .line 121
    move-object v12, v4

    .line 122
    move v4, v11

    .line 123
    move v11, v5

    .line 124
    move-object v5, v8

    .line 125
    .line 126
    if-gez v4, :cond_6

    .line 127
    .line 128
    mul-int v4, v1, v11

    .line 129
    .line 130
    mul-int v8, v9, v11

    .line 131
    .line 132
    :goto_4
    if-ge v13, v11, :cond_4

    .line 133
    .line 134
    add-int v16, v4, v13

    .line 135
    .line 136
    add-int v18, v8, v13

    .line 137
    .line 138
    aget-byte v18, v5, v18

    .line 139
    .line 140
    aput-byte v18, v5, v16

    .line 141
    .line 142
    add-int/lit8 v13, v13, 0x1

    .line 143
    goto :goto_4

    .line 144
    .line 145
    :cond_4
    add-int/lit8 v1, v1, -0x1

    .line 146
    .line 147
    add-int/lit8 v9, v9, -0x1

    .line 148
    add-int/2addr v15, v14

    .line 149
    .line 150
    add-int/lit8 v3, v3, -0x1

    .line 151
    .line 152
    if-nez v3, :cond_5

    .line 153
    :goto_5
    move-object v4, v6

    .line 154
    .line 155
    goto/16 :goto_c

    .line 156
    .line 157
    :cond_5
    const/16 v16, 0x0

    .line 158
    goto :goto_7

    .line 159
    .line 160
    :cond_6
    mul-int v4, v1, v11

    .line 161
    .line 162
    mul-int v8, v7, v11

    .line 163
    const/4 v13, 0x0

    .line 164
    .line 165
    :goto_6
    if-ge v13, v11, :cond_7

    .line 166
    .line 167
    add-int v15, v4, v13

    .line 168
    .line 169
    add-int v18, v8, v13

    .line 170
    .line 171
    aget-byte v18, v6, v18

    .line 172
    .line 173
    aput-byte v18, v5, v15

    .line 174
    .line 175
    add-int/lit8 v13, v13, 0x1

    .line 176
    goto :goto_6

    .line 177
    .line 178
    :cond_7
    add-int/lit8 v1, v1, -0x1

    .line 179
    .line 180
    add-int/lit8 v7, v7, -0x1

    .line 181
    .line 182
    add-int/lit8 v16, v16, 0x1

    .line 183
    .line 184
    add-int/lit8 v2, v2, -0x1

    .line 185
    .line 186
    if-ne v2, v14, :cond_8

    .line 187
    goto :goto_5

    .line 188
    :cond_8
    const/4 v15, 0x0

    .line 189
    .line 190
    :goto_7
    or-int v4, v15, v16

    .line 191
    .line 192
    if-lt v4, v10, :cond_19

    .line 193
    move v13, v9

    .line 194
    move v9, v3

    .line 195
    move v3, v13

    .line 196
    move v13, v10

    .line 197
    .line 198
    :goto_8
    sget-boolean v4, Lshark/internal/aosp/ByteArrayTimSort;->l:Z

    .line 199
    .line 200
    sget-object v4, Lshark/internal/aosp/ByteArrayTimSort;->m:Lshark/internal/aosp/ByteArrayTimSort$Companion;

    .line 201
    .line 202
    add-int/lit8 v10, v9, -0x1

    .line 203
    move v8, v7

    .line 204
    move-object v7, v5

    .line 205
    move-object v5, v6

    .line 206
    move v6, v8

    .line 207
    .line 208
    move/from16 v8, p1

    .line 209
    .line 210
    .line 211
    invoke-static/range {v4 .. v12}, Lshark/internal/aosp/ByteArrayTimSort$Companion;->access$gallopRight(Lshark/internal/aosp/ByteArrayTimSort$Companion;[BI[BIIIILbi0/a;)I

    .line 212
    move-result v4

    .line 213
    .line 214
    move-object/from16 v19, v7

    .line 215
    move-object v7, v5

    .line 216
    .line 217
    move-object/from16 v5, v19

    .line 218
    .line 219
    sub-int v15, v9, v4

    .line 220
    .line 221
    if-eqz v15, :cond_9

    .line 222
    sub-int/2addr v1, v15

    .line 223
    sub-int/2addr v3, v15

    .line 224
    .line 225
    sub-int v4, v9, v15

    .line 226
    .line 227
    add-int/lit8 v8, v3, 0x1

    .line 228
    mul-int/2addr v8, v11

    .line 229
    .line 230
    add-int/lit8 v9, v1, 0x1

    .line 231
    mul-int/2addr v9, v11

    .line 232
    .line 233
    mul-int v10, v15, v11

    .line 234
    .line 235
    .line 236
    invoke-static {v5, v8, v5, v9, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 237
    move v9, v3

    .line 238
    move v3, v4

    .line 239
    .line 240
    if-nez v4, :cond_a

    .line 241
    move-object v4, v7

    .line 242
    move v10, v13

    .line 243
    move v7, v6

    .line 244
    .line 245
    goto/16 :goto_c

    .line 246
    .line 247
    :cond_9
    move/from16 v19, v9

    .line 248
    move v9, v3

    .line 249
    .line 250
    move/from16 v3, v19

    .line 251
    .line 252
    :cond_a
    mul-int v4, v1, v11

    .line 253
    .line 254
    mul-int v8, v6, v11

    .line 255
    const/4 v10, 0x0

    .line 256
    .line 257
    :goto_9
    if-ge v10, v11, :cond_b

    .line 258
    .line 259
    add-int v16, v4, v10

    .line 260
    .line 261
    add-int v18, v8, v10

    .line 262
    .line 263
    aget-byte v18, v7, v18

    .line 264
    .line 265
    aput-byte v18, v5, v16

    .line 266
    .line 267
    add-int/lit8 v10, v10, 0x1

    .line 268
    goto :goto_9

    .line 269
    .line 270
    :cond_b
    add-int/lit8 v1, v1, -0x1

    .line 271
    .line 272
    add-int/lit8 v16, v6, -0x1

    .line 273
    move v6, v9

    .line 274
    .line 275
    add-int/lit8 v9, v2, -0x1

    .line 276
    .line 277
    if-ne v9, v14, :cond_c

    .line 278
    move-object v4, v7

    .line 279
    move v2, v9

    .line 280
    move v10, v13

    .line 281
    .line 282
    move/from16 v7, v16

    .line 283
    :goto_a
    move v9, v6

    .line 284
    goto :goto_c

    .line 285
    .line 286
    :cond_c
    sget-object v4, Lshark/internal/aosp/ByteArrayTimSort;->m:Lshark/internal/aosp/ByteArrayTimSort$Companion;

    .line 287
    .line 288
    add-int/lit8 v10, v2, -0x2

    .line 289
    const/4 v8, 0x0

    .line 290
    .line 291
    .line 292
    invoke-static/range {v4 .. v12}, Lshark/internal/aosp/ByteArrayTimSort$Companion;->access$gallopLeft(Lshark/internal/aosp/ByteArrayTimSort$Companion;[BI[BIIIILbi0/a;)I

    .line 293
    move-result v2

    .line 294
    move-object v4, v7

    .line 295
    .line 296
    sub-int v2, v9, v2

    .line 297
    .line 298
    if-eqz v2, :cond_d

    .line 299
    sub-int/2addr v1, v2

    .line 300
    .line 301
    sub-int v7, v16, v2

    .line 302
    .line 303
    sub-int v8, v9, v2

    .line 304
    .line 305
    add-int/lit8 v9, v7, 0x1

    .line 306
    mul-int/2addr v9, v11

    .line 307
    .line 308
    add-int/lit8 v10, v1, 0x1

    .line 309
    mul-int/2addr v10, v11

    .line 310
    .line 311
    move/from16 p2, v1

    .line 312
    .line 313
    mul-int v1, v2, v11

    .line 314
    .line 315
    .line 316
    invoke-static {v4, v9, v5, v10, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 317
    .line 318
    move/from16 v1, p2

    .line 319
    .line 320
    if-gt v8, v14, :cond_e

    .line 321
    move v9, v6

    .line 322
    move v2, v8

    .line 323
    move v10, v13

    .line 324
    goto :goto_c

    .line 325
    :cond_d
    move v8, v9

    .line 326
    .line 327
    move/from16 v7, v16

    .line 328
    .line 329
    :cond_e
    mul-int v9, v1, v11

    .line 330
    .line 331
    mul-int v10, v6, v11

    .line 332
    const/4 v14, 0x0

    .line 333
    .line 334
    :goto_b
    if-ge v14, v11, :cond_f

    .line 335
    .line 336
    add-int v16, v9, v14

    .line 337
    .line 338
    add-int v18, v10, v14

    .line 339
    .line 340
    aget-byte v18, v5, v18

    .line 341
    .line 342
    aput-byte v18, v5, v16

    .line 343
    .line 344
    add-int/lit8 v14, v14, 0x1

    .line 345
    goto :goto_b

    .line 346
    .line 347
    :cond_f
    add-int/lit8 v1, v1, -0x1

    .line 348
    .line 349
    add-int/lit8 v6, v6, -0x1

    .line 350
    .line 351
    add-int/lit8 v9, v3, -0x1

    .line 352
    .line 353
    if-nez v9, :cond_14

    .line 354
    move v2, v8

    .line 355
    move v3, v9

    .line 356
    move v10, v13

    .line 357
    const/4 v14, 0x1

    .line 358
    goto :goto_a

    .line 359
    .line 360
    :goto_c
    if-ge v10, v14, :cond_10

    .line 361
    move v10, v14

    .line 362
    .line 363
    :cond_10
    iput v10, v0, Lshark/internal/aosp/ByteArrayTimSort;->a:I

    .line 364
    .line 365
    if-ne v2, v14, :cond_12

    .line 366
    sub-int/2addr v1, v3

    .line 367
    sub-int/2addr v9, v3

    .line 368
    add-int/2addr v9, v14

    .line 369
    mul-int/2addr v9, v11

    .line 370
    .line 371
    add-int/lit8 v2, v1, 0x1

    .line 372
    mul-int/2addr v2, v11

    .line 373
    mul-int/2addr v3, v11

    .line 374
    .line 375
    .line 376
    invoke-static {v5, v9, v5, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 377
    mul-int/2addr v1, v11

    .line 378
    mul-int/2addr v7, v11

    .line 379
    const/4 v13, 0x0

    .line 380
    .line 381
    :goto_d
    if-ge v13, v11, :cond_11

    .line 382
    .line 383
    add-int v2, v1, v13

    .line 384
    .line 385
    add-int v3, v7, v13

    .line 386
    .line 387
    aget-byte v3, v4, v3

    .line 388
    .line 389
    aput-byte v3, v5, v2

    .line 390
    .line 391
    add-int/lit8 v13, v13, 0x1

    .line 392
    goto :goto_d

    .line 393
    :cond_11
    return-void

    .line 394
    .line 395
    :cond_12
    if-eqz v2, :cond_13

    .line 396
    .line 397
    add-int/lit8 v3, v2, -0x1

    .line 398
    sub-int/2addr v1, v3

    .line 399
    mul-int/2addr v1, v11

    .line 400
    mul-int/2addr v2, v11

    .line 401
    const/4 v3, 0x0

    .line 402
    .line 403
    .line 404
    invoke-static {v4, v3, v5, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 405
    return-void

    .line 406
    .line 407
    :cond_13
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 408
    .line 409
    const-string v2, "Comparison method violates its general contract!"

    .line 410
    .line 411
    .line 412
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 413
    throw v1

    .line 414
    :cond_14
    const/4 v3, 0x0

    .line 415
    const/4 v14, 0x1

    .line 416
    .line 417
    add-int/lit8 v13, v13, -0x1

    .line 418
    .line 419
    sget v10, Lshark/internal/aosp/ByteArrayTimSort;->j:I

    .line 420
    .line 421
    if-lt v15, v10, :cond_15

    .line 422
    move v15, v14

    .line 423
    goto :goto_e

    .line 424
    :cond_15
    move v15, v3

    .line 425
    .line 426
    :goto_e
    if-lt v2, v10, :cond_16

    .line 427
    move v2, v14

    .line 428
    goto :goto_f

    .line 429
    :cond_16
    move v2, v3

    .line 430
    :goto_f
    or-int/2addr v2, v15

    .line 431
    .line 432
    if-nez v2, :cond_18

    .line 433
    .line 434
    if-gez v13, :cond_17

    .line 435
    move v13, v3

    .line 436
    .line 437
    :cond_17
    add-int/lit8 v10, v13, 0x2

    .line 438
    move v13, v3

    .line 439
    move v3, v6

    .line 440
    move v2, v8

    .line 441
    move-object v6, v4

    .line 442
    move v8, v7

    .line 443
    move v7, v9

    .line 444
    .line 445
    goto/16 :goto_2

    .line 446
    :cond_18
    move v3, v6

    .line 447
    move v2, v8

    .line 448
    move-object v6, v4

    .line 449
    .line 450
    goto/16 :goto_8

    .line 451
    .line 452
    :cond_19
    const/16 v17, 0x0

    .line 453
    .line 454
    move/from16 v13, v17

    .line 455
    .line 456
    goto/16 :goto_3
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
.end method

.method public final l(IIII)V
    .locals 20

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move/from16 v1, p2

    .line 5
    .line 6
    move/from16 v2, p3

    .line 7
    .line 8
    sget-boolean v3, Lshark/internal/aosp/ByteArrayTimSort;->l:Z

    .line 9
    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    if-lez v1, :cond_0

    .line 13
    .line 14
    if-lez p4, :cond_0

    .line 15
    .line 16
    add-int v3, p1, v1

    .line 17
    .line 18
    :cond_0
    iget-object v5, v0, Lshark/internal/aosp/ByteArrayTimSort;->f:[B

    .line 19
    .line 20
    iget v11, v0, Lshark/internal/aosp/ByteArrayTimSort;->h:I

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lshark/internal/aosp/ByteArrayTimSort;->g(I)[B

    .line 24
    move-result-object v7

    .line 25
    .line 26
    mul-int v3, p1, v11

    .line 27
    .line 28
    mul-int v4, v1, v11

    .line 29
    const/4 v13, 0x0

    .line 30
    .line 31
    .line 32
    invoke-static {v5, v3, v7, v13, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 33
    .line 34
    mul-int v6, v2, v11

    .line 35
    move v8, v13

    .line 36
    .line 37
    :goto_0
    if-ge v8, v11, :cond_1

    .line 38
    .line 39
    add-int v9, v3, v8

    .line 40
    .line 41
    add-int v10, v6, v8

    .line 42
    .line 43
    aget-byte v10, v5, v10

    .line 44
    .line 45
    aput-byte v10, v5, v9

    .line 46
    .line 47
    add-int/lit8 v8, v8, 0x1

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const/4 v3, 0x1

    .line 50
    .line 51
    add-int/lit8 v6, p1, 0x1

    .line 52
    add-int/2addr v2, v3

    .line 53
    .line 54
    add-int/lit8 v8, p4, -0x1

    .line 55
    .line 56
    if-nez v8, :cond_2

    .line 57
    mul-int/2addr v6, v11

    .line 58
    .line 59
    .line 60
    invoke-static {v7, v13, v5, v6, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 61
    return-void

    .line 62
    .line 63
    :cond_2
    if-ne v1, v3, :cond_3

    .line 64
    mul-int/2addr v2, v11

    .line 65
    .line 66
    mul-int v1, v6, v11

    .line 67
    .line 68
    mul-int v3, v8, v11

    .line 69
    .line 70
    .line 71
    invoke-static {v5, v2, v5, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 72
    add-int/2addr v6, v8

    .line 73
    mul-int/2addr v6, v11

    .line 74
    .line 75
    :goto_1
    if-ge v13, v11, :cond_11

    .line 76
    .line 77
    add-int v1, v6, v13

    .line 78
    .line 79
    aget-byte v2, v7, v13

    .line 80
    .line 81
    aput-byte v2, v5, v1

    .line 82
    .line 83
    add-int/lit8 v13, v13, 0x1

    .line 84
    goto :goto_1

    .line 85
    .line 86
    :cond_3
    iget-object v12, v0, Lshark/internal/aosp/ByteArrayTimSort;->g:Lbi0/a;

    .line 87
    .line 88
    iget v4, v0, Lshark/internal/aosp/ByteArrayTimSort;->a:I

    .line 89
    move v10, v4

    .line 90
    move v4, v13

    .line 91
    :goto_2
    move v9, v4

    .line 92
    move v14, v6

    .line 93
    move v15, v8

    .line 94
    .line 95
    move/from16 v16, v13

    .line 96
    .line 97
    move/from16 v17, v16

    .line 98
    .line 99
    :goto_3
    sget-boolean v4, Lshark/internal/aosp/ByteArrayTimSort;->l:Z

    .line 100
    move-object v6, v5

    .line 101
    move-object v8, v7

    .line 102
    move v5, v11

    .line 103
    move-object v4, v12

    .line 104
    move v7, v2

    .line 105
    .line 106
    .line 107
    invoke-interface/range {v4 .. v9}, Lbi0/a;->a(I[BI[BI)I

    .line 108
    move-result v2

    .line 109
    move-object v12, v4

    .line 110
    move v11, v5

    .line 111
    move-object v5, v6

    .line 112
    .line 113
    if-gez v2, :cond_6

    .line 114
    .line 115
    mul-int v2, v14, v11

    .line 116
    .line 117
    mul-int v4, v7, v11

    .line 118
    move v6, v13

    .line 119
    .line 120
    :goto_4
    if-ge v6, v11, :cond_4

    .line 121
    .line 122
    add-int v16, v2, v6

    .line 123
    .line 124
    add-int v18, v4, v6

    .line 125
    .line 126
    aget-byte v18, v5, v18

    .line 127
    .line 128
    aput-byte v18, v5, v16

    .line 129
    .line 130
    add-int/lit8 v6, v6, 0x1

    .line 131
    goto :goto_4

    .line 132
    .line 133
    :cond_4
    add-int/lit8 v14, v14, 0x1

    .line 134
    .line 135
    add-int/lit8 v2, v7, 0x1

    .line 136
    .line 137
    add-int/lit8 v17, v17, 0x1

    .line 138
    .line 139
    add-int/lit8 v15, v15, -0x1

    .line 140
    .line 141
    if-nez v15, :cond_5

    .line 142
    move v6, v3

    .line 143
    :goto_5
    move-object v7, v8

    .line 144
    .line 145
    goto/16 :goto_c

    .line 146
    .line 147
    :cond_5
    move/from16 v16, v13

    .line 148
    goto :goto_7

    .line 149
    .line 150
    :cond_6
    mul-int v2, v14, v11

    .line 151
    .line 152
    mul-int v4, v9, v11

    .line 153
    move v6, v13

    .line 154
    .line 155
    :goto_6
    if-ge v6, v11, :cond_7

    .line 156
    .line 157
    add-int v17, v2, v6

    .line 158
    .line 159
    add-int v18, v4, v6

    .line 160
    .line 161
    aget-byte v18, v8, v18

    .line 162
    .line 163
    aput-byte v18, v5, v17

    .line 164
    .line 165
    add-int/lit8 v6, v6, 0x1

    .line 166
    goto :goto_6

    .line 167
    .line 168
    :cond_7
    add-int/lit8 v14, v14, 0x1

    .line 169
    .line 170
    add-int/lit8 v9, v9, 0x1

    .line 171
    .line 172
    add-int/lit8 v16, v16, 0x1

    .line 173
    .line 174
    add-int/lit8 v1, v1, -0x1

    .line 175
    .line 176
    if-ne v1, v3, :cond_8

    .line 177
    move v6, v3

    .line 178
    move v2, v7

    .line 179
    goto :goto_5

    .line 180
    :cond_8
    move v2, v7

    .line 181
    .line 182
    move/from16 v17, v13

    .line 183
    .line 184
    :goto_7
    or-int v4, v16, v17

    .line 185
    .line 186
    if-lt v4, v10, :cond_19

    .line 187
    move v6, v2

    .line 188
    move-object v7, v8

    .line 189
    move v8, v9

    .line 190
    move v9, v1

    .line 191
    move v1, v10

    .line 192
    .line 193
    :goto_8
    sget-boolean v2, Lshark/internal/aosp/ByteArrayTimSort;->l:Z

    .line 194
    .line 195
    sget-object v4, Lshark/internal/aosp/ByteArrayTimSort;->m:Lshark/internal/aosp/ByteArrayTimSort$Companion;

    .line 196
    const/4 v10, 0x0

    .line 197
    .line 198
    .line 199
    invoke-static/range {v4 .. v12}, Lshark/internal/aosp/ByteArrayTimSort$Companion;->access$gallopRight(Lshark/internal/aosp/ByteArrayTimSort$Companion;[BI[BIIIILbi0/a;)I

    .line 200
    move-result v2

    .line 201
    .line 202
    if-eqz v2, :cond_a

    .line 203
    .line 204
    mul-int v4, v8, v11

    .line 205
    .line 206
    mul-int v10, v14, v11

    .line 207
    .line 208
    mul-int v13, v2, v11

    .line 209
    .line 210
    .line 211
    invoke-static {v7, v4, v5, v10, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 212
    add-int/2addr v14, v2

    .line 213
    .line 214
    add-int v4, v8, v2

    .line 215
    .line 216
    sub-int v8, v9, v2

    .line 217
    .line 218
    if-gt v8, v3, :cond_9

    .line 219
    move v10, v1

    .line 220
    move v9, v4

    .line 221
    move v2, v6

    .line 222
    move v1, v8

    .line 223
    move v6, v3

    .line 224
    .line 225
    goto/16 :goto_c

    .line 226
    :cond_9
    move v9, v4

    .line 227
    move v13, v8

    .line 228
    goto :goto_9

    .line 229
    :cond_a
    move v13, v9

    .line 230
    move v9, v8

    .line 231
    .line 232
    :goto_9
    mul-int v4, v14, v11

    .line 233
    .line 234
    mul-int v8, v6, v11

    .line 235
    const/4 v10, 0x0

    .line 236
    .line 237
    :goto_a
    if-ge v10, v11, :cond_b

    .line 238
    .line 239
    add-int v16, v4, v10

    .line 240
    .line 241
    add-int v17, v8, v10

    .line 242
    .line 243
    aget-byte v17, v5, v17

    .line 244
    .line 245
    aput-byte v17, v5, v16

    .line 246
    .line 247
    add-int/lit8 v10, v10, 0x1

    .line 248
    goto :goto_a

    .line 249
    .line 250
    :cond_b
    add-int/lit8 v14, v14, 0x1

    .line 251
    .line 252
    add-int/lit8 v8, v6, 0x1

    .line 253
    .line 254
    add-int/lit8 v15, v15, -0x1

    .line 255
    .line 256
    if-nez v15, :cond_c

    .line 257
    move v10, v1

    .line 258
    move v6, v3

    .line 259
    move v2, v8

    .line 260
    move v1, v13

    .line 261
    goto :goto_c

    .line 262
    .line 263
    :cond_c
    sget-object v4, Lshark/internal/aosp/ByteArrayTimSort;->m:Lshark/internal/aosp/ByteArrayTimSort$Companion;

    .line 264
    const/4 v10, 0x0

    .line 265
    move-object v6, v7

    .line 266
    move-object v7, v5

    .line 267
    move-object v5, v6

    .line 268
    move v6, v9

    .line 269
    move v9, v15

    .line 270
    .line 271
    .line 272
    invoke-static/range {v4 .. v12}, Lshark/internal/aosp/ByteArrayTimSort$Companion;->access$gallopLeft(Lshark/internal/aosp/ByteArrayTimSort$Companion;[BI[BIIIILbi0/a;)I

    .line 273
    move-result v4

    .line 274
    .line 275
    move-object/from16 v19, v7

    .line 276
    move-object v7, v5

    .line 277
    .line 278
    move-object/from16 v5, v19

    .line 279
    .line 280
    if-eqz v4, :cond_d

    .line 281
    .line 282
    mul-int v10, v8, v11

    .line 283
    .line 284
    mul-int v15, v14, v11

    .line 285
    .line 286
    mul-int v3, v4, v11

    .line 287
    .line 288
    .line 289
    invoke-static {v5, v10, v5, v15, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 290
    add-int/2addr v14, v4

    .line 291
    .line 292
    add-int v3, v8, v4

    .line 293
    .line 294
    sub-int v15, v9, v4

    .line 295
    .line 296
    if-nez v15, :cond_e

    .line 297
    move v10, v1

    .line 298
    move v2, v3

    .line 299
    move v9, v6

    .line 300
    move v1, v13

    .line 301
    const/4 v6, 0x1

    .line 302
    goto :goto_c

    .line 303
    :cond_d
    move v3, v8

    .line 304
    move v15, v9

    .line 305
    .line 306
    :cond_e
    mul-int v8, v14, v11

    .line 307
    .line 308
    mul-int v9, v6, v11

    .line 309
    const/4 v10, 0x0

    .line 310
    .line 311
    :goto_b
    if-ge v10, v11, :cond_f

    .line 312
    .line 313
    add-int v16, v8, v10

    .line 314
    .line 315
    add-int v17, v9, v10

    .line 316
    .line 317
    aget-byte v17, v7, v17

    .line 318
    .line 319
    aput-byte v17, v5, v16

    .line 320
    .line 321
    add-int/lit8 v10, v10, 0x1

    .line 322
    goto :goto_b

    .line 323
    .line 324
    :cond_f
    add-int/lit8 v14, v14, 0x1

    .line 325
    .line 326
    add-int/lit8 v8, v6, 0x1

    .line 327
    .line 328
    add-int/lit8 v9, v13, -0x1

    .line 329
    const/4 v6, 0x1

    .line 330
    .line 331
    if-ne v9, v6, :cond_14

    .line 332
    move v10, v1

    .line 333
    move v2, v3

    .line 334
    move v1, v9

    .line 335
    move v9, v8

    .line 336
    .line 337
    :goto_c
    if-ge v10, v6, :cond_10

    .line 338
    move v10, v6

    .line 339
    .line 340
    :cond_10
    iput v10, v0, Lshark/internal/aosp/ByteArrayTimSort;->a:I

    .line 341
    .line 342
    if-ne v1, v6, :cond_12

    .line 343
    mul-int/2addr v2, v11

    .line 344
    .line 345
    mul-int v1, v14, v11

    .line 346
    .line 347
    mul-int v3, v15, v11

    .line 348
    .line 349
    .line 350
    invoke-static {v5, v2, v5, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 351
    add-int/2addr v14, v15

    .line 352
    mul-int/2addr v14, v11

    .line 353
    mul-int/2addr v9, v11

    .line 354
    const/4 v13, 0x0

    .line 355
    .line 356
    :goto_d
    if-ge v13, v11, :cond_11

    .line 357
    .line 358
    add-int v1, v14, v13

    .line 359
    .line 360
    add-int v2, v9, v13

    .line 361
    .line 362
    aget-byte v2, v7, v2

    .line 363
    .line 364
    aput-byte v2, v5, v1

    .line 365
    .line 366
    add-int/lit8 v13, v13, 0x1

    .line 367
    goto :goto_d

    .line 368
    :cond_11
    return-void

    .line 369
    .line 370
    :cond_12
    if-eqz v1, :cond_13

    .line 371
    mul-int/2addr v9, v11

    .line 372
    mul-int/2addr v14, v11

    .line 373
    mul-int/2addr v1, v11

    .line 374
    .line 375
    .line 376
    invoke-static {v7, v9, v5, v14, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 377
    return-void

    .line 378
    .line 379
    :cond_13
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 380
    .line 381
    const-string v2, "Comparison method violates its general contract!"

    .line 382
    .line 383
    .line 384
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 385
    throw v1

    .line 386
    .line 387
    :cond_14
    add-int/lit8 v1, v1, -0x1

    .line 388
    .line 389
    sget v10, Lshark/internal/aosp/ByteArrayTimSort;->j:I

    .line 390
    .line 391
    if-lt v2, v10, :cond_15

    .line 392
    move v2, v6

    .line 393
    goto :goto_e

    .line 394
    :cond_15
    const/4 v2, 0x0

    .line 395
    .line 396
    :goto_e
    if-lt v4, v10, :cond_16

    .line 397
    move v4, v6

    .line 398
    goto :goto_f

    .line 399
    :cond_16
    const/4 v4, 0x0

    .line 400
    :goto_f
    or-int/2addr v2, v4

    .line 401
    .line 402
    if-nez v2, :cond_18

    .line 403
    .line 404
    if-gez v1, :cond_17

    .line 405
    const/4 v1, 0x0

    .line 406
    .line 407
    :cond_17
    add-int/lit8 v10, v1, 0x2

    .line 408
    move v2, v3

    .line 409
    move v3, v6

    .line 410
    move v4, v8

    .line 411
    move v1, v9

    .line 412
    move v6, v14

    .line 413
    move v8, v15

    .line 414
    const/4 v13, 0x0

    .line 415
    .line 416
    goto/16 :goto_2

    .line 417
    :cond_18
    move v13, v6

    .line 418
    move v6, v3

    .line 419
    move v3, v13

    .line 420
    const/4 v13, 0x0

    .line 421
    .line 422
    goto/16 :goto_8

    .line 423
    :cond_19
    move-object v7, v8

    .line 424
    .line 425
    goto/16 :goto_3
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
.end method

.method public final m(II)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/aosp/ByteArrayTimSort;->d:[I

    .line 3
    .line 4
    iget v1, p0, Lshark/internal/aosp/ByteArrayTimSort;->c:I

    .line 5
    .line 6
    aput p1, v0, v1

    .line 7
    .line 8
    iget-object p1, p0, Lshark/internal/aosp/ByteArrayTimSort;->e:[I

    .line 9
    .line 10
    aput p2, p1, v1

    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x1

    .line 13
    .line 14
    iput v1, p0, Lshark/internal/aosp/ByteArrayTimSort;->c:I

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
