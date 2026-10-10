.class public abstract Lcom/geetest/gtc4/o5;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field public final a:Ljava/io/InputStream;

.field public final b:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/geetest/gtc4/o5;->a:Ljava/io/InputStream;

    .line 6
    .line 7
    iput p2, p0, Lcom/geetest/gtc4/o5;->b:I

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


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/o5;->a:Ljava/io/InputStream;

    .line 3
    .line 4
    instance-of v1, v0, Lcom/geetest/gtc4/j5;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, Lcom/geetest/gtc4/j5;

    .line 9
    const/4 v1, 0x1

    .line 10
    .line 11
    iput-boolean v1, v0, Lcom/geetest/gtc4/j5;->f:Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/geetest/gtc4/j5;->b()Z

    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
.end method
