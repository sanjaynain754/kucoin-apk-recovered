.class public final Lcom/geetest/gtc4/g3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/geetest/gtc4/x4;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public final a(Lcom/geetest/gtc4/i3;)V
    .locals 2

    .line 2
    new-instance v0, Lcom/geetest/gtc4/e6;

    const-string v1, "Unsupported"

    invoke-direct {v0, v1}, Lcom/geetest/gtc4/e6;-><init>(Ljava/lang/String;)V

    .line 3
    iget-object p1, p1, Lcom/geetest/gtc4/i3;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public final a()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method
