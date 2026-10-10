.class public final Lcom/geetest/gtc4/j6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/geetest/gtc4/h6;


# instance fields
.field public final synthetic a:Lcom/geetest/gtc4/k6;


# direct methods
.method public constructor <init>(Lcom/geetest/gtc4/k6;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/geetest/gtc4/j6;->a:Lcom/geetest/gtc4/k6;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public final a(Landroid/os/IBinder;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/geetest/gtc4/j6;->a:Lcom/geetest/gtc4/k6;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/geetest/gtc4/m6;->a(Landroid/os/IBinder;)Ljava/lang/String;

    .line 6
    move-result-object p1
    :try_end_0
    .catch Lcom/geetest/gtc4/e6; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object p1

    .line 8
    :catch_0
    move-exception p1

    .line 9
    goto :goto_0

    .line 10
    :catch_1
    move-exception p1

    .line 11
    goto :goto_1

    .line 12
    :catch_2
    move-exception p1

    .line 13
    goto :goto_1

    .line 14
    .line 15
    :goto_0
    new-instance v0, Lcom/geetest/gtc4/e6;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, p1}, Lcom/geetest/gtc4/e6;-><init>(Ljava/lang/Throwable;)V

    .line 19
    throw v0

    .line 20
    :goto_1
    throw p1
    .line 21
    .line 22
    .line 23
.end method
