.class public final Lcom/geetest/gtc4/e;
.super Lcom/geetest/gtc4/w;
.source "SourceFile"


# static fields
.field public static final b:Lcom/geetest/gtc4/e;

.field public static final c:Lcom/geetest/gtc4/e;


# instance fields
.field public final a:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/geetest/gtc4/e;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/e;-><init>(B)V

    .line 7
    .line 8
    sput-object v0, Lcom/geetest/gtc4/e;->b:Lcom/geetest/gtc4/e;

    .line 9
    .line 10
    new-instance v0, Lcom/geetest/gtc4/e;

    .line 11
    const/4 v1, -0x1

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/e;-><init>(B)V

    .line 15
    .line 16
    sput-object v0, Lcom/geetest/gtc4/e;->c:Lcom/geetest/gtc4/e;

    .line 17
    return-void
    .line 18
.end method

.method public constructor <init>(B)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/geetest/gtc4/w;-><init>()V

    .line 4
    .line 5
    iput-byte p1, p0, Lcom/geetest/gtc4/e;->a:B

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
.method public final a(Z)I
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-static {v0, p1, v0}, Lcom/geetest/gtc4/d;->a(III)I

    move-result p1

    return p1
.end method

.method public final a(Lcom/geetest/gtc4/u;Z)V
    .locals 2

    .line 2
    iget-byte v0, p0, Lcom/geetest/gtc4/e;->a:B

    const/4 v1, 0x1

    .line 3
    invoke-virtual {p1, p2, v1}, Lcom/geetest/gtc4/u;->a(ZI)V

    .line 4
    invoke-virtual {p1, v1}, Lcom/geetest/gtc4/u;->b(I)V

    .line 5
    iget-object p1, p1, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method public final a(Lcom/geetest/gtc4/w;)Z
    .locals 3

    .line 6
    instance-of v0, p1, Lcom/geetest/gtc4/e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 7
    :cond_0
    check-cast p1, Lcom/geetest/gtc4/e;

    .line 8
    iget-byte v0, p0, Lcom/geetest/gtc4/e;->a:B

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    .line 9
    :goto_0
    iget-byte p1, p1, Lcom/geetest/gtc4/e;->a:B

    if-eqz p1, :cond_2

    move p1, v2

    goto :goto_1

    :cond_2
    move p1, v1

    :goto_1
    if-ne v0, p1, :cond_3

    return v2

    :cond_3
    return v1
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

.method public final g()Lcom/geetest/gtc4/w;
    .locals 1

    .line 1
    .line 2
    iget-byte v0, p0, Lcom/geetest/gtc4/e;->a:B

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/geetest/gtc4/e;->c:Lcom/geetest/gtc4/e;

    .line 7
    return-object v0

    .line 8
    .line 9
    :cond_0
    sget-object v0, Lcom/geetest/gtc4/e;->b:Lcom/geetest/gtc4/e;

    .line 10
    return-object v0
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
    .line 2
    iget-byte v0, p0, Lcom/geetest/gtc4/e;->a:B

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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
    iget-byte v0, p0, Lcom/geetest/gtc4/e;->a:B

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const-string v0, "TRUE"

    .line 7
    return-object v0

    .line 8
    .line 9
    :cond_0
    const-string v0, "FALSE"

    .line 10
    return-object v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method
