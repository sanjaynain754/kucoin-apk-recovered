.class public abstract Lorg/jsoup/select/c$o;
.super Lorg/jsoup/select/c;
.source "Evaluator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jsoup/select/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "o"
.end annotation


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lorg/jsoup/select/c;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Lorg/jsoup/select/c$o;->a:I

    .line 6
    .line 7
    iput p2, p0, Lorg/jsoup/select/c$o;->b:I

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
.method public a(Lorg/jsoup/nodes/Element;Lorg/jsoup/nodes/Element;)Z
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lorg/jsoup/nodes/Element;->O0()Lorg/jsoup/nodes/Element;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    instance-of v0, v0, Lorg/jsoup/nodes/Document;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    goto :goto_0

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/jsoup/select/c$o;->b(Lorg/jsoup/nodes/Element;Lorg/jsoup/nodes/Element;)I

    .line 16
    move-result p1

    .line 17
    .line 18
    iget p2, p0, Lorg/jsoup/select/c$o;->a:I

    .line 19
    const/4 v0, 0x1

    .line 20
    .line 21
    if-nez p2, :cond_2

    .line 22
    .line 23
    iget p2, p0, Lorg/jsoup/select/c$o;->b:I

    .line 24
    .line 25
    if-ne p1, p2, :cond_1

    .line 26
    return v0

    .line 27
    :cond_1
    return v1

    .line 28
    .line 29
    :cond_2
    iget v2, p0, Lorg/jsoup/select/c$o;->b:I

    .line 30
    .line 31
    sub-int v3, p1, v2

    .line 32
    mul-int/2addr v3, p2

    .line 33
    .line 34
    if-ltz v3, :cond_3

    .line 35
    sub-int/2addr p1, v2

    .line 36
    rem-int/2addr p1, p2

    .line 37
    .line 38
    if-nez p1, :cond_3

    .line 39
    return v0

    .line 40
    :cond_3
    :goto_0
    return v1
    .line 41
    .line 42
    .line 43
.end method

.method public abstract b(Lorg/jsoup/nodes/Element;Lorg/jsoup/nodes/Element;)I
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lorg/jsoup/select/c$o;->a:I

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lorg/jsoup/select/c$o;->c()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iget v1, p0, Lorg/jsoup/select/c$o;->b:I

    .line 11
    .line 12
    .line 13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    const-string v1, ":%s(%d)"

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    .line 27
    :cond_0
    iget v0, p0, Lorg/jsoup/select/c$o;->b:I

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lorg/jsoup/select/c$o;->c()Ljava/lang/String;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    iget v1, p0, Lorg/jsoup/select/c$o;->a:I

    .line 36
    .line 37
    .line 38
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    const-string v1, ":%s(%dn)"

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    move-result-object v0

    .line 50
    return-object v0

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-virtual {p0}, Lorg/jsoup/select/c$o;->c()Ljava/lang/String;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    iget v1, p0, Lorg/jsoup/select/c$o;->a:I

    .line 57
    .line 58
    .line 59
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    iget v2, p0, Lorg/jsoup/select/c$o;->b:I

    .line 63
    .line 64
    .line 65
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    move-result-object v2

    .line 67
    .line 68
    .line 69
    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    const-string v1, ":%s(%dn%+d)"

    .line 73
    .line 74
    .line 75
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 76
    move-result-object v0

    .line 77
    return-object v0
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
