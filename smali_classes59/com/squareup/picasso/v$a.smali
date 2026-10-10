.class public Lcom/squareup/picasso/v$a;
.super Landroid/os/Handler;
.source "Stats.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/picasso/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/squareup/picasso/v;


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lcom/squareup/picasso/v;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/squareup/picasso/v$a;->a:Lcom/squareup/picasso/v;

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
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 1
    .line 2
    iget v0, p1, Landroid/os/Message;->what:I

    .line 3
    .line 4
    if-eqz v0, :cond_4

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    if-eq v0, v1, :cond_3

    .line 8
    const/4 v1, 0x2

    .line 9
    .line 10
    if-eq v0, v1, :cond_2

    .line 11
    const/4 v1, 0x3

    .line 12
    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    const/4 v1, 0x4

    .line 15
    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    sget-object v0, Lcom/squareup/picasso/Picasso;->p:Landroid/os/Handler;

    .line 19
    .line 20
    new-instance v1, Lcom/squareup/picasso/v$a$a;

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, p0, p1}, Lcom/squareup/picasso/v$a$a;-><init>(Lcom/squareup/picasso/v$a;Landroid/os/Message;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 27
    return-void

    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, Lcom/squareup/picasso/v$a;->a:Lcom/squareup/picasso/v;

    .line 30
    .line 31
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lcom/squareup/picasso/v;->l(Ljava/lang/Long;)V

    .line 37
    return-void

    .line 38
    .line 39
    :cond_1
    iget-object v0, p0, Lcom/squareup/picasso/v$a;->a:Lcom/squareup/picasso/v;

    .line 40
    .line 41
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 42
    int-to-long v1, p1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Lcom/squareup/picasso/v;->i(J)V

    .line 46
    return-void

    .line 47
    .line 48
    :cond_2
    iget-object v0, p0, Lcom/squareup/picasso/v$a;->a:Lcom/squareup/picasso/v;

    .line 49
    .line 50
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 51
    int-to-long v1, p1

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1, v2}, Lcom/squareup/picasso/v;->h(J)V

    .line 55
    return-void

    .line 56
    .line 57
    :cond_3
    iget-object p1, p0, Lcom/squareup/picasso/v$a;->a:Lcom/squareup/picasso/v;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/squareup/picasso/v;->k()V

    .line 61
    return-void

    .line 62
    .line 63
    :cond_4
    iget-object p1, p0, Lcom/squareup/picasso/v$a;->a:Lcom/squareup/picasso/v;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/squareup/picasso/v;->j()V

    .line 67
    return-void
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method
