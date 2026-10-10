.class public Lcn/jiguang/privates/common/binder/RemoteMessengerHandler;
.super Landroid/os/Handler;
.source "RemoteMessengerHandler.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "RemoteMessengerHandler"


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    .line 5
    iput-object p1, p0, Lcn/jiguang/privates/common/binder/RemoteMessengerHandler;->context:Landroid/content/Context;

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
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lcn/jiguang/privates/common/binder/JMessenger;->getInstance()Lcn/jiguang/privates/common/binder/JMessenger;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcn/jiguang/privates/common/binder/JMessenger;->initMainMessenger(Landroid/os/Messenger;)V

    .line 10
    .line 11
    iget v0, p1, Landroid/os/Message;->what:I

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    const/16 v1, 0x65

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lcn/jiguang/privates/common/observer/JObservable;->getInstance()Lcn/jiguang/privates/common/observer/JObservable;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iget-object v1, p0, Lcn/jiguang/privates/common/binder/RemoteMessengerHandler;->context:Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1, p1}, Lcn/jiguang/privates/common/observer/JObservable;->observerOnRemoteProcess(Landroid/content/Context;Landroid/os/Bundle;)V

    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto :goto_0

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-static {}, Lcn/jiguang/privates/common/observer/JObservable;->getInstance()Lcn/jiguang/privates/common/observer/JObservable;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    iget-object v2, p0, Lcn/jiguang/privates/common/binder/RemoteMessengerHandler;->context:Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2, v0, p1}, Lcn/jiguang/privates/common/observer/JObservable;->dispatchMessage(Landroid/content/Context;ILandroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    return-void

    .line 42
    .line 43
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    const-string v1, "handleMessage failed "

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    const-string v0, "RemoteMessengerHandler"

    .line 65
    .line 66
    .line 67
    invoke-static {v0, p1}, Lcn/jiguang/privates/common/log/JCommonLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    return-void
    .line 69
    .line 70
    .line 71
    .line 72
.end method
