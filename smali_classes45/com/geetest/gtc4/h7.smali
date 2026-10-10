.class public Lcom/geetest/gtc4/h7;
.super Lcom/geetest/gtc4/f3;
.source "SourceFile"


# static fields
.field public static final d:Lcom/geetest/gtc4/h7;


# instance fields
.field public final c:Lcom/geetest/gtc4/k7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/geetest/gtc4/h7;

    .line 3
    .line 4
    sget-object v1, Lcom/geetest/gtc4/k7;->BREAK:Lcom/geetest/gtc4/k7;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/h7;-><init>(Lcom/geetest/gtc4/k7;)V

    .line 8
    .line 9
    sput-object v0, Lcom/geetest/gtc4/h7;->d:Lcom/geetest/gtc4/h7;

    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public constructor <init>(Lcom/geetest/gtc4/k7;)V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/geetest/gtc4/p5;->SPECIAL:Lcom/geetest/gtc4/p5;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/geetest/gtc4/f3;-><init>(Lcom/geetest/gtc4/p5;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/geetest/gtc4/h7;->c:Lcom/geetest/gtc4/k7;

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
    .locals 2

    .line 1
    .line 2
    instance-of v0, p1, Lcom/geetest/gtc4/h7;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    move-object v0, p1

    .line 7
    .line 8
    check-cast v0, Lcom/geetest/gtc4/h7;

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Lcom/geetest/gtc4/f3;->equals(Ljava/lang/Object;)Z

    .line 12
    move-result p1

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Lcom/geetest/gtc4/h7;->c:Lcom/geetest/gtc4/k7;

    .line 17
    .line 18
    iget-object v0, v0, Lcom/geetest/gtc4/h7;->c:Lcom/geetest/gtc4/k7;

    .line 19
    .line 20
    if-ne p1, v0, :cond_0

    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_0
    return v1
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
    .line 14
    iget-object v1, p0, Lcom/geetest/gtc4/h7;->c:Lcom/geetest/gtc4/k7;

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 18
    move-result v1

    .line 19
    xor-int/2addr v0, v1

    .line 20
    return v0
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
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/h7;->c:Lcom/geetest/gtc4/k7;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method
