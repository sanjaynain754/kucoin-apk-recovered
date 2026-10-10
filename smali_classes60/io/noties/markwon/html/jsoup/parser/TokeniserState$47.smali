.class final enum Lio/noties/markwon/html/jsoup/parser/TokeniserState$47;
.super Lio/noties/markwon/html/jsoup/parser/TokeniserState;
.source "TokeniserState.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/noties/markwon/html/jsoup/parser/TokeniserState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, v0}, Lio/noties/markwon/html/jsoup/parser/TokeniserState;-><init>(Ljava/lang/String;ILio/noties/markwon/html/jsoup/parser/TokeniserState$1;)V

    .line 5
    return-void
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
.end method


# virtual methods
.method public read(Lio/noties/markwon/html/jsoup/parser/c;Lio/noties/markwon/html/jsoup/parser/a;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lio/noties/markwon/html/jsoup/parser/a;->q()C

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    const/16 v1, 0x2d

    .line 9
    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    .line 13
    const v1, 0xffff

    .line 14
    .line 15
    if-eq v0, v1, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, Lio/noties/markwon/html/jsoup/parser/c;->n:Lio/noties/markwon/html/jsoup/parser/Token$c;

    .line 18
    .line 19
    iget-object p1, p1, Lio/noties/markwon/html/jsoup/parser/Token$c;->b:Ljava/lang/StringBuilder;

    .line 20
    const/4 v0, 0x2

    .line 21
    .line 22
    new-array v0, v0, [C

    .line 23
    .line 24
    .line 25
    fill-array-data v0, :array_0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2, v0}, Lio/noties/markwon/html/jsoup/parser/a;->m([C)Ljava/lang/String;

    .line 29
    move-result-object p2

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    return-void

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {p1, p0}, Lio/noties/markwon/html/jsoup/parser/c;->p(Lio/noties/markwon/html/jsoup/parser/TokeniserState;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lio/noties/markwon/html/jsoup/parser/c;->m()V

    .line 40
    .line 41
    sget-object p2, Lio/noties/markwon/html/jsoup/parser/TokeniserState;->Data:Lio/noties/markwon/html/jsoup/parser/TokeniserState;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lio/noties/markwon/html/jsoup/parser/c;->u(Lio/noties/markwon/html/jsoup/parser/TokeniserState;)V

    .line 45
    return-void

    .line 46
    .line 47
    :cond_1
    sget-object p2, Lio/noties/markwon/html/jsoup/parser/TokeniserState;->CommentEndDash:Lio/noties/markwon/html/jsoup/parser/TokeniserState;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p2}, Lio/noties/markwon/html/jsoup/parser/c;->a(Lio/noties/markwon/html/jsoup/parser/TokeniserState;)V

    .line 51
    return-void

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-virtual {p1, p0}, Lio/noties/markwon/html/jsoup/parser/c;->q(Lio/noties/markwon/html/jsoup/parser/TokeniserState;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Lio/noties/markwon/html/jsoup/parser/a;->a()V

    .line 58
    .line 59
    iget-object p1, p1, Lio/noties/markwon/html/jsoup/parser/c;->n:Lio/noties/markwon/html/jsoup/parser/Token$c;

    .line 60
    .line 61
    iget-object p1, p1, Lio/noties/markwon/html/jsoup/parser/Token$c;->b:Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const p2, 0xfffd

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 68
    return-void

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    :array_0
    .array-data 2
        0x2ds
        0x0s
    .end array-data
    .line 75
    .line 76
    .line 77
    .line 78
.end method
