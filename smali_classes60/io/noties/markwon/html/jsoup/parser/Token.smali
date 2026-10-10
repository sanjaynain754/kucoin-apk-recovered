.class public abstract Lio/noties/markwon/html/jsoup/parser/Token;
.super Ljava/lang/Object;
.source "Token.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/noties/markwon/html/jsoup/parser/Token$TokenType;,
        Lio/noties/markwon/html/jsoup/parser/Token$e;,
        Lio/noties/markwon/html/jsoup/parser/Token$a;,
        Lio/noties/markwon/html/jsoup/parser/Token$b;,
        Lio/noties/markwon/html/jsoup/parser/Token$c;,
        Lio/noties/markwon/html/jsoup/parser/Token$f;,
        Lio/noties/markwon/html/jsoup/parser/Token$g;,
        Lio/noties/markwon/html/jsoup/parser/Token$h;,
        Lio/noties/markwon/html/jsoup/parser/Token$d;
    }
.end annotation


# instance fields
.field public final a:Lio/noties/markwon/html/jsoup/parser/Token$TokenType;


# direct methods
.method public constructor <init>(Lio/noties/markwon/html/jsoup/parser/Token$TokenType;)V
    .locals 0
    .param p1    # Lio/noties/markwon/html/jsoup/parser/Token$TokenType;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lio/noties/markwon/html/jsoup/parser/Token;->a:Lio/noties/markwon/html/jsoup/parser/Token$TokenType;

    .line 6
    return-void
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
.end method

.method public static b(Ljava/lang/StringBuilder;)V
    .locals 2

    .line 1
    .line 2
    if-eqz p0, :cond_0

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 7
    move-result v1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 11
    :cond_0
    return-void
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
.end method


# virtual methods
.method public abstract a()Lio/noties/markwon/html/jsoup/parser/Token;
.end method
