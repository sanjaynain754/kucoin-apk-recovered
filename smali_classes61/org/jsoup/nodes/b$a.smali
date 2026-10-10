.class public Lorg/jsoup/nodes/b$a;
.super Ljava/lang/Object;
.source "Attributes.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/jsoup/nodes/b;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Lorg/jsoup/nodes/a;",
        ">;"
    }
.end annotation


# instance fields
.field public b:I

.field public final synthetic c:Lorg/jsoup/nodes/b;


# direct methods
.method public constructor <init>(Lorg/jsoup/nodes/b;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/jsoup/nodes/b$a;->c:Lorg/jsoup/nodes/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    const/4 p1, 0x0

    .line 7
    .line 8
    iput p1, p0, Lorg/jsoup/nodes/b$a;->b:I

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


# virtual methods
.method public a()Lorg/jsoup/nodes/a;
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lorg/jsoup/nodes/a;

    .line 3
    .line 4
    iget-object v1, p0, Lorg/jsoup/nodes/b$a;->c:Lorg/jsoup/nodes/b;

    .line 5
    .line 6
    iget-object v2, v1, Lorg/jsoup/nodes/b;->c:[Ljava/lang/String;

    .line 7
    .line 8
    iget v3, p0, Lorg/jsoup/nodes/b$a;->b:I

    .line 9
    .line 10
    aget-object v2, v2, v3

    .line 11
    .line 12
    iget-object v4, v1, Lorg/jsoup/nodes/b;->d:[Ljava/lang/String;

    .line 13
    .line 14
    aget-object v3, v4, v3

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v2, v3, v1}, Lorg/jsoup/nodes/a;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/jsoup/nodes/b;)V

    .line 18
    .line 19
    iget v1, p0, Lorg/jsoup/nodes/b$a;->b:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    iput v1, p0, Lorg/jsoup/nodes/b$a;->b:I

    .line 24
    return-object v0
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
.end method

.method public hasNext()Z
    .locals 4

    .line 1
    .line 2
    :goto_0
    iget v0, p0, Lorg/jsoup/nodes/b$a;->b:I

    .line 3
    .line 4
    iget-object v1, p0, Lorg/jsoup/nodes/b$a;->c:Lorg/jsoup/nodes/b;

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Lorg/jsoup/nodes/b;->a(Lorg/jsoup/nodes/b;)I

    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lorg/jsoup/nodes/b$a;->c:Lorg/jsoup/nodes/b;

    .line 14
    .line 15
    iget-object v1, v0, Lorg/jsoup/nodes/b;->c:[Ljava/lang/String;

    .line 16
    .line 17
    iget v3, p0, Lorg/jsoup/nodes/b$a;->b:I

    .line 18
    .line 19
    aget-object v1, v1, v3

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lorg/jsoup/nodes/b;->b(Lorg/jsoup/nodes/b;Ljava/lang/String;)Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget v0, p0, Lorg/jsoup/nodes/b$a;->b:I

    .line 28
    add-int/2addr v0, v2

    .line 29
    .line 30
    iput v0, p0, Lorg/jsoup/nodes/b$a;->b:I

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_0
    iget v0, p0, Lorg/jsoup/nodes/b$a;->b:I

    .line 34
    .line 35
    iget-object v1, p0, Lorg/jsoup/nodes/b$a;->c:Lorg/jsoup/nodes/b;

    .line 36
    .line 37
    .line 38
    invoke-static {v1}, Lorg/jsoup/nodes/b;->a(Lorg/jsoup/nodes/b;)I

    .line 39
    move-result v1

    .line 40
    .line 41
    if-ge v0, v1, :cond_1

    .line 42
    return v2

    .line 43
    :cond_1
    const/4 v0, 0x0

    .line 44
    return v0
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

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/nodes/b$a;->a()Lorg/jsoup/nodes/a;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public remove()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lorg/jsoup/nodes/b$a;->c:Lorg/jsoup/nodes/b;

    .line 3
    .line 4
    iget v1, p0, Lorg/jsoup/nodes/b$a;->b:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, -0x1

    .line 7
    .line 8
    iput v1, p0, Lorg/jsoup/nodes/b$a;->b:I

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lorg/jsoup/nodes/b;->c(Lorg/jsoup/nodes/b;I)V

    .line 12
    return-void
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
