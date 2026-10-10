.class public abstract Lcom/geetest/gtc4/x2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/geetest/gtc4/z2;

.field public static final b:Lcom/geetest/gtc4/b3;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/geetest/gtc4/z2;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/geetest/gtc4/z2;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/geetest/gtc4/x2;->a:Lcom/geetest/gtc4/z2;

    .line 8
    .line 9
    new-instance v0, Lcom/geetest/gtc4/b3;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/geetest/gtc4/b3;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/geetest/gtc4/x2;->b:Lcom/geetest/gtc4/b3;

    .line 15
    return-void
    .line 16
    .line 17
    .line 18
.end method

.method public static a(Lcom/geetest/gtc4/g;)Lcom/geetest/gtc4/b3;
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/geetest/gtc4/g;->b:I

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    sget-object p0, Lcom/geetest/gtc4/x2;->b:Lcom/geetest/gtc4/b3;

    .line 8
    return-object p0

    .line 9
    .line 10
    :cond_0
    new-instance v0, Lcom/geetest/gtc4/b3;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/geetest/gtc4/b3;-><init>(Lcom/geetest/gtc4/g;)V

    .line 14
    return-object v0
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
