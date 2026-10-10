.class public Lcom/facebook/react/bridge/DefaultJSExceptionHandler;
.super Ljava/lang/Object;
.source "DefaultJSExceptionHandler.java"

# interfaces
.implements Lcom/facebook/react/bridge/JSExceptionHandler;


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
.method public handleException(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    .line 2
    instance-of v0, p1, Ljava/lang/RuntimeException;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Ljava/lang/RuntimeException;

    .line 7
    throw p1

    .line 8
    .line 9
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 13
    throw v0
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
