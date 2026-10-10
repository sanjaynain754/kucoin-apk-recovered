.class public abstract Lcom/geetest/gtc4/f3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/geetest/gtc4/p5;

.field public b:Lcom/geetest/gtc4/o7;


# direct methods
.method public constructor <init>(Lcom/geetest/gtc4/p5;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/geetest/gtc4/f3;->a:Lcom/geetest/gtc4/p5;

    .line 6
    .line 7
    const-string v0, "majorType is null"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
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
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    .line 2
    instance-of v0, p1, Lcom/geetest/gtc4/f3;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    check-cast p1, Lcom/geetest/gtc4/f3;

    .line 8
    .line 9
    iget-object v0, p0, Lcom/geetest/gtc4/f3;->b:Lcom/geetest/gtc4/o7;

    .line 10
    const/4 v2, 0x1

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v3, p1, Lcom/geetest/gtc4/f3;->b:Lcom/geetest/gtc4/o7;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v3}, Lcom/geetest/gtc4/o7;->equals(Ljava/lang/Object;)Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lcom/geetest/gtc4/f3;->a:Lcom/geetest/gtc4/p5;

    .line 23
    .line 24
    iget-object p1, p1, Lcom/geetest/gtc4/f3;->a:Lcom/geetest/gtc4/p5;

    .line 25
    .line 26
    if-ne v0, p1, :cond_0

    .line 27
    return v2

    .line 28
    :cond_0
    return v1

    .line 29
    .line 30
    :cond_1
    iget-object v0, p1, Lcom/geetest/gtc4/f3;->b:Lcom/geetest/gtc4/o7;

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    iget-object v0, p0, Lcom/geetest/gtc4/f3;->a:Lcom/geetest/gtc4/p5;

    .line 35
    .line 36
    iget-object p1, p1, Lcom/geetest/gtc4/f3;->a:Lcom/geetest/gtc4/p5;

    .line 37
    .line 38
    if-ne v0, p1, :cond_2

    .line 39
    return v2

    .line 40
    :cond_2
    return v1
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
    iget-object v0, p0, Lcom/geetest/gtc4/f3;->a:Lcom/geetest/gtc4/p5;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/geetest/gtc4/f3;->b:Lcom/geetest/gtc4/o7;

    .line 5
    .line 6
    .line 7
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 12
    move-result v0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method
