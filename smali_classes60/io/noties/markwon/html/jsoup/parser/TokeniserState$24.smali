.class final enum Lio/noties/markwon/html/jsoup/parser/TokeniserState$24;
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
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lio/noties/markwon/html/jsoup/parser/a;->r()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p0}, Lio/noties/markwon/html/jsoup/parser/c;->p(Lio/noties/markwon/html/jsoup/parser/TokeniserState;)V

    .line 10
    .line 11
    sget-object p2, Lio/noties/markwon/html/jsoup/parser/TokeniserState;->Data:Lio/noties/markwon/html/jsoup/parser/TokeniserState;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, Lio/noties/markwon/html/jsoup/parser/c;->u(Lio/noties/markwon/html/jsoup/parser/TokeniserState;)V

    .line 15
    return-void

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p2}, Lio/noties/markwon/html/jsoup/parser/a;->d()C

    .line 19
    move-result p2

    .line 20
    .line 21
    if-eqz p2, :cond_4

    .line 22
    .line 23
    const/16 v0, 0x2d

    .line 24
    .line 25
    if-eq p2, v0, :cond_3

    .line 26
    .line 27
    const/16 v0, 0x3c

    .line 28
    .line 29
    if-eq p2, v0, :cond_2

    .line 30
    .line 31
    const/16 v0, 0x3e

    .line 32
    .line 33
    if-eq p2, v0, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p2}, Lio/noties/markwon/html/jsoup/parser/c;->i(C)V

    .line 37
    .line 38
    sget-object p2, Lio/noties/markwon/html/jsoup/parser/TokeniserState;->ScriptDataEscaped:Lio/noties/markwon/html/jsoup/parser/TokeniserState;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p2}, Lio/noties/markwon/html/jsoup/parser/c;->u(Lio/noties/markwon/html/jsoup/parser/TokeniserState;)V

    .line 42
    return-void

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-virtual {p1, p2}, Lio/noties/markwon/html/jsoup/parser/c;->i(C)V

    .line 46
    .line 47
    sget-object p2, Lio/noties/markwon/html/jsoup/parser/TokeniserState;->ScriptData:Lio/noties/markwon/html/jsoup/parser/TokeniserState;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p2}, Lio/noties/markwon/html/jsoup/parser/c;->u(Lio/noties/markwon/html/jsoup/parser/TokeniserState;)V

    .line 51
    return-void

    .line 52
    .line 53
    :cond_2
    sget-object p2, Lio/noties/markwon/html/jsoup/parser/TokeniserState;->ScriptDataEscapedLessthanSign:Lio/noties/markwon/html/jsoup/parser/TokeniserState;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, p2}, Lio/noties/markwon/html/jsoup/parser/c;->u(Lio/noties/markwon/html/jsoup/parser/TokeniserState;)V

    .line 57
    return-void

    .line 58
    .line 59
    .line 60
    :cond_3
    invoke-virtual {p1, p2}, Lio/noties/markwon/html/jsoup/parser/c;->i(C)V

    .line 61
    return-void

    .line 62
    .line 63
    .line 64
    :cond_4
    invoke-virtual {p1, p0}, Lio/noties/markwon/html/jsoup/parser/c;->q(Lio/noties/markwon/html/jsoup/parser/TokeniserState;)V

    .line 65
    .line 66
    .line 67
    const p2, 0xfffd

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, p2}, Lio/noties/markwon/html/jsoup/parser/c;->i(C)V

    .line 71
    .line 72
    sget-object p2, Lio/noties/markwon/html/jsoup/parser/TokeniserState;->ScriptDataEscaped:Lio/noties/markwon/html/jsoup/parser/TokeniserState;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, p2}, Lio/noties/markwon/html/jsoup/parser/c;->u(Lio/noties/markwon/html/jsoup/parser/TokeniserState;)V

    .line 76
    return-void
    .line 77
    .line 78
.end method
