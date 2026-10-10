.class public final Lcom/geetest/gtc4/u6;
.super Lcom/geetest/gtc4/h7;
.source "SourceFile"


# static fields
.field public static final g:Lcom/geetest/gtc4/u6;

.field public static final h:Lcom/geetest/gtc4/u6;

.field public static final i:Lcom/geetest/gtc4/u6;

.field public static final j:Lcom/geetest/gtc4/u6;


# instance fields
.field public final e:Lcom/geetest/gtc4/v6;

.field public final f:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/geetest/gtc4/u6;

    .line 3
    .line 4
    sget-object v1, Lcom/geetest/gtc4/v6;->FALSE:Lcom/geetest/gtc4/v6;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/u6;-><init>(Lcom/geetest/gtc4/v6;)V

    .line 8
    .line 9
    sput-object v0, Lcom/geetest/gtc4/u6;->g:Lcom/geetest/gtc4/u6;

    .line 10
    .line 11
    new-instance v0, Lcom/geetest/gtc4/u6;

    .line 12
    .line 13
    sget-object v1, Lcom/geetest/gtc4/v6;->TRUE:Lcom/geetest/gtc4/v6;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/u6;-><init>(Lcom/geetest/gtc4/v6;)V

    .line 17
    .line 18
    sput-object v0, Lcom/geetest/gtc4/u6;->h:Lcom/geetest/gtc4/u6;

    .line 19
    .line 20
    new-instance v0, Lcom/geetest/gtc4/u6;

    .line 21
    .line 22
    sget-object v1, Lcom/geetest/gtc4/v6;->NULL:Lcom/geetest/gtc4/v6;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/u6;-><init>(Lcom/geetest/gtc4/v6;)V

    .line 26
    .line 27
    sput-object v0, Lcom/geetest/gtc4/u6;->i:Lcom/geetest/gtc4/u6;

    .line 28
    .line 29
    new-instance v0, Lcom/geetest/gtc4/u6;

    .line 30
    .line 31
    sget-object v1, Lcom/geetest/gtc4/v6;->UNDEFINED:Lcom/geetest/gtc4/v6;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/u6;-><init>(Lcom/geetest/gtc4/v6;)V

    .line 35
    .line 36
    sput-object v0, Lcom/geetest/gtc4/u6;->j:Lcom/geetest/gtc4/u6;

    .line 37
    return-void
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

.method public constructor <init>(I)V
    .locals 1

    const/16 v0, 0x17

    if-gt p1, v0, :cond_0

    .line 4
    sget-object v0, Lcom/geetest/gtc4/k7;->SIMPLE_VALUE:Lcom/geetest/gtc4/k7;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/geetest/gtc4/k7;->SIMPLE_VALUE_NEXT_BYTE:Lcom/geetest/gtc4/k7;

    :goto_0
    invoke-direct {p0, v0}, Lcom/geetest/gtc4/h7;-><init>(Lcom/geetest/gtc4/k7;)V

    .line 5
    iput p1, p0, Lcom/geetest/gtc4/u6;->f:I

    .line 6
    invoke-static {p1}, Lcom/geetest/gtc4/v6;->ofByte(I)Lcom/geetest/gtc4/v6;

    move-result-object p1

    iput-object p1, p0, Lcom/geetest/gtc4/u6;->e:Lcom/geetest/gtc4/v6;

    return-void
.end method

.method public constructor <init>(Lcom/geetest/gtc4/v6;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/geetest/gtc4/k7;->SIMPLE_VALUE:Lcom/geetest/gtc4/k7;

    invoke-direct {p0, v0}, Lcom/geetest/gtc4/h7;-><init>(Lcom/geetest/gtc4/k7;)V

    .line 2
    invoke-virtual {p1}, Lcom/geetest/gtc4/v6;->getValue()I

    move-result v0

    iput v0, p0, Lcom/geetest/gtc4/u6;->f:I

    .line 3
    iput-object p1, p0, Lcom/geetest/gtc4/u6;->e:Lcom/geetest/gtc4/v6;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    .line 2
    instance-of v0, p1, Lcom/geetest/gtc4/u6;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    move-object v0, p1

    .line 7
    .line 8
    check-cast v0, Lcom/geetest/gtc4/u6;

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Lcom/geetest/gtc4/h7;->equals(Ljava/lang/Object;)Z

    .line 12
    move-result p1

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget p1, p0, Lcom/geetest/gtc4/u6;->f:I

    .line 17
    .line 18
    iget v0, v0, Lcom/geetest/gtc4/u6;->f:I

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

.method public final hashCode()I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/geetest/gtc4/h7;->hashCode()I

    .line 4
    move-result v0

    .line 5
    .line 6
    iget v1, p0, Lcom/geetest/gtc4/u6;->f:I

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    move-result v1

    .line 15
    xor-int/2addr v0, v1

    .line 16
    return v0
    .line 17
    .line 18
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/u6;->e:Lcom/geetest/gtc4/v6;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

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
