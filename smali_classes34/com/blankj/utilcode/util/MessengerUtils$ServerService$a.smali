.class public Lcom/blankj/utilcode/util/MessengerUtils$ServerService$a;
.super Landroid/os/Handler;
.source "MessengerUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/blankj/utilcode/util/MessengerUtils$ServerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/blankj/utilcode/util/MessengerUtils$ServerService;


# direct methods
.method public constructor <init>(Lcom/blankj/utilcode/util/MessengerUtils$ServerService;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/blankj/utilcode/util/MessengerUtils$ServerService$a;->a:Lcom/blankj/utilcode/util/MessengerUtils$ServerService;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

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
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 1
    .line 2
    iget v0, p1, Landroid/os/Message;->what:I

    .line 3
    .line 4
    if-eqz v0, :cond_2

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    if-eq v0, v1, :cond_1

    .line 8
    const/4 v1, 0x2

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 14
    return-void

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/blankj/utilcode/util/MessengerUtils$ServerService$a;->a:Lcom/blankj/utilcode/util/MessengerUtils$ServerService;

    .line 17
    .line 18
    .line 19
    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/MessengerUtils$ServerService;->b(Lcom/blankj/utilcode/util/MessengerUtils$ServerService;Landroid/os/Message;)V

    .line 20
    .line 21
    iget-object v0, p0, Lcom/blankj/utilcode/util/MessengerUtils$ServerService$a;->a:Lcom/blankj/utilcode/util/MessengerUtils$ServerService;

    .line 22
    .line 23
    .line 24
    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/MessengerUtils$ServerService;->c(Lcom/blankj/utilcode/util/MessengerUtils$ServerService;Landroid/os/Message;)V

    .line 25
    return-void

    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Lcom/blankj/utilcode/util/MessengerUtils$ServerService$a;->a:Lcom/blankj/utilcode/util/MessengerUtils$ServerService;

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lcom/blankj/utilcode/util/MessengerUtils$ServerService;->a(Lcom/blankj/utilcode/util/MessengerUtils$ServerService;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    return-void

    .line 42
    .line 43
    :cond_2
    iget-object v0, p0, Lcom/blankj/utilcode/util/MessengerUtils$ServerService$a;->a:Lcom/blankj/utilcode/util/MessengerUtils$ServerService;

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Lcom/blankj/utilcode/util/MessengerUtils$ServerService;->a(Lcom/blankj/utilcode/util/MessengerUtils$ServerService;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    iget v1, p1, Landroid/os/Message;->arg1:I

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    iget-object p1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    return-void
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
.end method
