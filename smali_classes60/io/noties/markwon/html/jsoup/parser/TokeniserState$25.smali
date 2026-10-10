.class final enum Lio/noties/markwon/html/jsoup/parser/TokeniserState$25;
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
    invoke-virtual {p2}, Lio/noties/markwon/html/jsoup/parser/a;->C()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lio/noties/markwon/html/jsoup/parser/c;->h()V

    .line 10
    .line 11
    iget-object v0, p1, Lio/noties/markwon/html/jsoup/parser/c;->h:Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Lio/noties/markwon/html/jsoup/parser/a;->q()C

    .line 15
    move-result v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    const-string v1, "<"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Lio/noties/markwon/html/jsoup/parser/a;->q()C

    .line 32
    move-result p2

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    move-result-object p2

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p2}, Lio/noties/markwon/html/jsoup/parser/c;->k(Ljava/lang/String;)V

    .line 43
    .line 44
    sget-object p2, Lio/noties/markwon/html/jsoup/parser/TokeniserState;->ScriptDataDoubleEscapeStart:Lio/noties/markwon/html/jsoup/parser/TokeniserState;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, p2}, Lio/noties/markwon/html/jsoup/parser/c;->a(Lio/noties/markwon/html/jsoup/parser/TokeniserState;)V

    .line 48
    return-void

    .line 49
    .line 50
    :cond_0
    const/16 v0, 0x2f

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2, v0}, Lio/noties/markwon/html/jsoup/parser/a;->w(C)Z

    .line 54
    move-result p2

    .line 55
    .line 56
    if-eqz p2, :cond_1

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lio/noties/markwon/html/jsoup/parser/c;->h()V

    .line 60
    .line 61
    sget-object p2, Lio/noties/markwon/html/jsoup/parser/TokeniserState;->ScriptDataEscapedEndTagOpen:Lio/noties/markwon/html/jsoup/parser/TokeniserState;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p2}, Lio/noties/markwon/html/jsoup/parser/c;->a(Lio/noties/markwon/html/jsoup/parser/TokeniserState;)V

    .line 65
    return-void

    .line 66
    .line 67
    :cond_1
    const/16 p2, 0x3c

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
