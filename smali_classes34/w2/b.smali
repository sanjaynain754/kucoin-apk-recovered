.class public final Lw2/b;
.super Landroid/os/Handler;
.source "MessageHandler.java"


# instance fields
.field public final a:Lcom/contrarywind/view/WheelView;


# direct methods
.method public constructor <init>(Lcom/contrarywind/view/WheelView;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lw2/b;->a:Lcom/contrarywind/view/WheelView;

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
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    .line 2
    iget p1, p1, Landroid/os/Message;->what:I

    .line 3
    .line 4
    const/16 v0, 0x3e8

    .line 5
    .line 6
    if-eq p1, v0, :cond_2

    .line 7
    .line 8
    const/16 v0, 0x7d0

    .line 9
    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    const/16 v0, 0xbb8

    .line 13
    .line 14
    if-eq p1, v0, :cond_0

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    iget-object p1, p0, Lw2/b;->a:Lcom/contrarywind/view/WheelView;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/contrarywind/view/WheelView;->m()V

    .line 21
    return-void

    .line 22
    .line 23
    :cond_1
    iget-object p1, p0, Lw2/b;->a:Lcom/contrarywind/view/WheelView;

    .line 24
    .line 25
    sget-object v0, Lcom/contrarywind/view/WheelView$ACTION;->FLING:Lcom/contrarywind/view/WheelView$ACTION;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lcom/contrarywind/view/WheelView;->q(Lcom/contrarywind/view/WheelView$ACTION;)V

    .line 29
    return-void

    .line 30
    .line 31
    :cond_2
    iget-object p1, p0, Lw2/b;->a:Lcom/contrarywind/view/WheelView;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 35
    return-void
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
.end method
