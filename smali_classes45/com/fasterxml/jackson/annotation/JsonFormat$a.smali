.class public Lcom/fasterxml/jackson/annotation/JsonFormat$a;
.super Ljava/lang/Object;
.source "JsonFormat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/annotation/JsonFormat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final c:Lcom/fasterxml/jackson/annotation/JsonFormat$a;


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/fasterxml/jackson/annotation/JsonFormat$a;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1, v1}, Lcom/fasterxml/jackson/annotation/JsonFormat$a;-><init>(II)V

    .line 7
    .line 8
    sput-object v0, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->c:Lcom/fasterxml/jackson/annotation/JsonFormat$a;

    .line 9
    return-void
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

.method public constructor <init>(II)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->a:I

    .line 6
    .line 7
    iput p2, p0, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->b:I

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
    .line 44
    .line 45
.end method

.method public static a(Lcom/fasterxml/jackson/annotation/JsonFormat;)Lcom/fasterxml/jackson/annotation/JsonFormat$a;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Lcom/fasterxml/jackson/annotation/JsonFormat;->with()[Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {p0}, Lcom/fasterxml/jackson/annotation/JsonFormat;->without()[Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;

    .line 8
    move-result-object p0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, p0}, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->b([Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;[Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;)Lcom/fasterxml/jackson/annotation/JsonFormat$a;

    .line 12
    move-result-object p0

    .line 13
    return-object p0
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

.method public static b([Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;[Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;)Lcom/fasterxml/jackson/annotation/JsonFormat$a;
    .locals 6

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    move v3, v2

    .line 5
    :goto_0
    const/4 v4, 0x1

    .line 6
    .line 7
    if-ge v2, v0, :cond_0

    .line 8
    .line 9
    aget-object v5, p0, v2

    .line 10
    .line 11
    .line 12
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 13
    move-result v5

    .line 14
    shl-int/2addr v4, v5

    .line 15
    or-int/2addr v3, v4

    .line 16
    .line 17
    add-int/lit8 v2, v2, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    array-length p0, p1

    .line 20
    move v0, v1

    .line 21
    .line 22
    :goto_1
    if-ge v1, p0, :cond_1

    .line 23
    .line 24
    aget-object v2, p1, v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 28
    move-result v2

    .line 29
    .line 30
    shl-int v2, v4, v2

    .line 31
    or-int/2addr v0, v2

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x1

    .line 34
    goto :goto_1

    .line 35
    .line 36
    :cond_1
    new-instance p0, Lcom/fasterxml/jackson/annotation/JsonFormat$a;

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, v3, v0}, Lcom/fasterxml/jackson/annotation/JsonFormat$a;-><init>(II)V

    .line 40
    return-object p0
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static c()Lcom/fasterxml/jackson/annotation/JsonFormat$a;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->c:Lcom/fasterxml/jackson/annotation/JsonFormat$a;

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
.end method


# virtual methods
.method public d(Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 5
    move-result p1

    .line 6
    .line 7
    shl-int p1, v0, p1

    .line 8
    .line 9
    iget v0, p0, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->b:I

    .line 10
    and-int/2addr v0, p1

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 15
    return-object p1

    .line 16
    .line 17
    :cond_0
    iget v0, p0, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->a:I

    .line 18
    and-int/2addr p1, v0

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 23
    return-object p1

    .line 24
    :cond_1
    const/4 p1, 0x0

    .line 25
    return-object p1
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
.end method

.method public varargs e([Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;)Lcom/fasterxml/jackson/annotation/JsonFormat$a;
    .locals 5

    .line 1
    .line 2
    iget v0, p0, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->a:I

    .line 3
    array-length v1, p1

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    :goto_0
    if-ge v2, v1, :cond_0

    .line 7
    .line 8
    aget-object v3, p1, v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 12
    move-result v3

    .line 13
    const/4 v4, 0x1

    .line 14
    .line 15
    shl-int v3, v4, v3

    .line 16
    or-int/2addr v0, v3

    .line 17
    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    iget p1, p0, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->a:I

    .line 22
    .line 23
    if-ne v0, p1, :cond_1

    .line 24
    return-object p0

    .line 25
    .line 26
    :cond_1
    new-instance p1, Lcom/fasterxml/jackson/annotation/JsonFormat$a;

    .line 27
    .line 28
    iget v1, p0, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->b:I

    .line 29
    .line 30
    .line 31
    invoke-direct {p1, v0, v1}, Lcom/fasterxml/jackson/annotation/JsonFormat$a;-><init>(II)V

    .line 32
    return-object p1
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

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p1, p0, :cond_0

    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    return v1

    .line 9
    .line 10
    .line 11
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    move-result-object v3

    .line 17
    .line 18
    if-eq v2, v3, :cond_2

    .line 19
    return v1

    .line 20
    .line 21
    :cond_2
    check-cast p1, Lcom/fasterxml/jackson/annotation/JsonFormat$a;

    .line 22
    .line 23
    iget v2, p1, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->a:I

    .line 24
    .line 25
    iget v3, p0, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->a:I

    .line 26
    .line 27
    if-ne v2, v3, :cond_3

    .line 28
    .line 29
    iget p1, p1, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->b:I

    .line 30
    .line 31
    iget v2, p0, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->b:I

    .line 32
    .line 33
    if-ne p1, v2, :cond_3

    .line 34
    return v0

    .line 35
    :cond_3
    return v1
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

.method public f(Lcom/fasterxml/jackson/annotation/JsonFormat$a;)Lcom/fasterxml/jackson/annotation/JsonFormat$a;
    .locals 4

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    goto :goto_0

    .line 4
    .line 5
    :cond_0
    iget v0, p1, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->b:I

    .line 6
    .line 7
    iget v1, p1, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->a:I

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_1
    iget v2, p0, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->a:I

    .line 15
    .line 16
    if-nez v2, :cond_2

    .line 17
    .line 18
    iget v3, p0, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->b:I

    .line 19
    .line 20
    if-nez v3, :cond_2

    .line 21
    return-object p1

    .line 22
    :cond_2
    not-int p1, v0

    .line 23
    and-int/2addr p1, v2

    .line 24
    or-int/2addr p1, v1

    .line 25
    .line 26
    iget v3, p0, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->b:I

    .line 27
    not-int v1, v1

    .line 28
    and-int/2addr v1, v3

    .line 29
    or-int/2addr v0, v1

    .line 30
    .line 31
    if-ne p1, v2, :cond_3

    .line 32
    .line 33
    if-ne v0, v3, :cond_3

    .line 34
    :goto_0
    return-object p0

    .line 35
    .line 36
    :cond_3
    new-instance v1, Lcom/fasterxml/jackson/annotation/JsonFormat$a;

    .line 37
    .line 38
    .line 39
    invoke-direct {v1, p1, v0}, Lcom/fasterxml/jackson/annotation/JsonFormat$a;-><init>(II)V

    .line 40
    return-object v1
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

.method public varargs g([Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;)Lcom/fasterxml/jackson/annotation/JsonFormat$a;
    .locals 5

    .line 1
    .line 2
    iget v0, p0, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->b:I

    .line 3
    array-length v1, p1

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    :goto_0
    if-ge v2, v1, :cond_0

    .line 7
    .line 8
    aget-object v3, p1, v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 12
    move-result v3

    .line 13
    const/4 v4, 0x1

    .line 14
    .line 15
    shl-int v3, v4, v3

    .line 16
    or-int/2addr v0, v3

    .line 17
    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    iget p1, p0, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->b:I

    .line 22
    .line 23
    if-ne v0, p1, :cond_1

    .line 24
    return-object p0

    .line 25
    .line 26
    :cond_1
    new-instance p1, Lcom/fasterxml/jackson/annotation/JsonFormat$a;

    .line 27
    .line 28
    iget v1, p0, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->a:I

    .line 29
    .line 30
    .line 31
    invoke-direct {p1, v1, v0}, Lcom/fasterxml/jackson/annotation/JsonFormat$a;-><init>(II)V

    .line 32
    return-object p1
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

.method public hashCode()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->b:I

    .line 3
    .line 4
    iget v1, p0, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->a:I

    .line 5
    add-int/2addr v0, v1

    .line 6
    return v0
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

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->c:Lcom/fasterxml/jackson/annotation/JsonFormat$a;

    .line 3
    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    const-string v0, "EMPTY"

    .line 7
    return-object v0

    .line 8
    .line 9
    :cond_0
    iget v0, p0, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->a:I

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iget v1, p0, Lcom/fasterxml/jackson/annotation/JsonFormat$a;->b:I

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    const-string v1, "(enabled=0x%x,disabled=0x%x)"

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    move-result-object v0

    .line 30
    return-object v0
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
.end method
