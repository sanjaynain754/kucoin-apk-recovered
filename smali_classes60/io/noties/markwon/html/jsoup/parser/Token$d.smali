.class public final Lio/noties/markwon/html/jsoup/parser/Token$d;
.super Lio/noties/markwon/html/jsoup/parser/Token;
.source "Token.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/noties/markwon/html/jsoup/parser/Token;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final b:Ljava/lang/StringBuilder;

.field public c:Ljava/lang/String;

.field public final d:Ljava/lang/StringBuilder;

.field public final e:Ljava/lang/StringBuilder;

.field public f:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lio/noties/markwon/html/jsoup/parser/Token$TokenType;->Doctype:Lio/noties/markwon/html/jsoup/parser/Token$TokenType;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Lio/noties/markwon/html/jsoup/parser/Token;-><init>(Lio/noties/markwon/html/jsoup/parser/Token$TokenType;)V

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    iput-object v0, p0, Lio/noties/markwon/html/jsoup/parser/Token$d;->b:Ljava/lang/StringBuilder;

    .line 13
    const/4 v0, 0x0

    .line 14
    .line 15
    iput-object v0, p0, Lio/noties/markwon/html/jsoup/parser/Token$d;->c:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    iput-object v0, p0, Lio/noties/markwon/html/jsoup/parser/Token$d;->d:Ljava/lang/StringBuilder;

    .line 23
    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    iput-object v0, p0, Lio/noties/markwon/html/jsoup/parser/Token$d;->e:Ljava/lang/StringBuilder;

    .line 30
    const/4 v0, 0x0

    .line 31
    .line 32
    iput-boolean v0, p0, Lio/noties/markwon/html/jsoup/parser/Token$d;->f:Z

    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method


# virtual methods
.method public a()Lio/noties/markwon/html/jsoup/parser/Token;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/Token$d;->b:Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lio/noties/markwon/html/jsoup/parser/Token;->b(Ljava/lang/StringBuilder;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    iput-object v0, p0, Lio/noties/markwon/html/jsoup/parser/Token$d;->c:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/Token$d;->d:Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lio/noties/markwon/html/jsoup/parser/Token;->b(Ljava/lang/StringBuilder;)V

    .line 14
    .line 15
    iget-object v0, p0, Lio/noties/markwon/html/jsoup/parser/Token$d;->e:Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lio/noties/markwon/html/jsoup/parser/Token;->b(Ljava/lang/StringBuilder;)V

    .line 19
    const/4 v0, 0x0

    .line 20
    .line 21
    iput-boolean v0, p0, Lio/noties/markwon/html/jsoup/parser/Token$d;->f:Z

    .line 22
    return-object p0
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
.end method
