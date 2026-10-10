.class public final Lcom/geetest/gtc4/g2;
.super Lcom/geetest/gtc4/w;
.source "SourceFile"


# static fields
.field public static final a:Lcom/geetest/gtc4/g2;

.field public static final b:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/geetest/gtc4/g2;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/geetest/gtc4/g2;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/geetest/gtc4/g2;->a:Lcom/geetest/gtc4/g2;

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    new-array v0, v0, [B

    .line 11
    .line 12
    sput-object v0, Lcom/geetest/gtc4/g2;->b:[B

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/geetest/gtc4/w;-><init>()V

    .line 4
    return-void
    .line 5
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
.end method


# virtual methods
.method public final a(Z)I
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-static {v0}, Lcom/geetest/gtc4/u;->a(I)I

    move-result v0

    add-int/2addr v0, p1

    return v0
.end method

.method public final a(Lcom/geetest/gtc4/u;Z)V
    .locals 2

    .line 1
    sget-object v0, Lcom/geetest/gtc4/g2;->b:[B

    const/4 v1, 0x5

    invoke-virtual {p1, p2, v1, v0}, Lcom/geetest/gtc4/u;->a(ZI[B)V

    return-void
.end method

.method public final a(Lcom/geetest/gtc4/w;)Z
    .locals 0

    .line 2
    instance-of p1, p1, Lcom/geetest/gtc4/g2;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final f()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
    .line 4
    .line 5
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
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    return v0
    .line 3
    .line 4
    .line 5
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
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "NULL"

    .line 3
    return-object v0
    .line 4
    .line 5
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
.end method
