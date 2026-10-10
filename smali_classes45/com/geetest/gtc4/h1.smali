.class public final Lcom/geetest/gtc4/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/geetest/gtc4/f;
.implements Lcom/geetest/gtc4/i5;


# instance fields
.field public final a:Lcom/geetest/gtc4/c0;


# direct methods
.method public constructor <init>(Lcom/geetest/gtc4/c0;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/geetest/gtc4/h1;->a:Lcom/geetest/gtc4/c0;

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
.end method


# virtual methods
.method public final b()Lcom/geetest/gtc4/w;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/h1;->a:Lcom/geetest/gtc4/c0;

    .line 3
    .line 4
    new-instance v1, Lcom/geetest/gtc4/g1;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/geetest/gtc4/c0;->a()Lcom/geetest/gtc4/g;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, v0}, Lcom/geetest/gtc4/g1;-><init>(Lcom/geetest/gtc4/g;)V

    .line 12
    return-object v1
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final d()Lcom/geetest/gtc4/w;
    .locals 2

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Lcom/geetest/gtc4/h1;->b()Lcom/geetest/gtc4/w;

    .line 4
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object v0

    .line 6
    :catch_0
    move-exception v0

    .line 7
    .line 8
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    throw v1
    .line 17
    .line 18
.end method
