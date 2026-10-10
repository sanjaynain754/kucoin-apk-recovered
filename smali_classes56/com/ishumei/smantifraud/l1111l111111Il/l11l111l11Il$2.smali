.class final Lcom/ishumei/smantifraud/l1111l111111Il/l11l111l11Il$2;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ishumei/smantifraud/l1111l111111Il/l11l111l11Il;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private synthetic l1111l111111Il:Lcom/ishumei/smantifraud/l1111l111111Il/l11l111l11Il;


# direct methods
.method public constructor <init>(Lcom/ishumei/smantifraud/l1111l111111Il/l11l111l11Il;Landroid/os/Looper;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l111l11Il$2;->l1111l111111Il:Lcom/ishumei/smantifraud/l1111l111111Il/l11l111l11Il;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

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
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 1
    .line 2
    :try_start_0
    iget v0, p1, Landroid/os/Message;->what:I

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    if-eq v0, v1, :cond_2

    .line 8
    const/4 v1, 0x2

    .line 9
    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    const/4 p1, 0x3

    .line 12
    .line 13
    if-eq v0, p1, :cond_0

    .line 14
    goto :goto_1

    .line 15
    .line 16
    :cond_0
    iget-object p1, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l111l11Il$2;->l1111l111111Il:Lcom/ishumei/smantifraud/l1111l111111Il/l11l111l11Il;

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lcom/ishumei/smantifraud/l1111l111111Il/l11l111l11Il;->l1111l111111Il(Lcom/ishumei/smantifraud/l1111l111111Il/l11l111l11Il;)Ljava/util/Set;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v0}, Lcom/ishumei/smantifraud/l1111l111111Il/l11l111l11Il;->l111l11111I1l(Lcom/ishumei/smantifraud/l1111l111111Il/l11l111l11Il;Ljava/util/Set;)V

    .line 24
    return-void

    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l111l11Il$2;->l1111l111111Il:Lcom/ishumei/smantifraud/l1111l111111Il/l11l111l11Il;

    .line 27
    .line 28
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    invoke-static {v0, p1}, Lcom/ishumei/smantifraud/l1111l111111Il/l11l111l11Il;->l111l11111lIl(Lcom/ishumei/smantifraud/l1111l111111Il/l11l111l11Il;Ljava/util/Set;)V

    .line 34
    return-void

    .line 35
    .line 36
    :cond_2
    iget-object v0, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l111l11Il$2;->l1111l111111Il:Lcom/ishumei/smantifraud/l1111l111111Il/l11l111l11Il;

    .line 37
    .line 38
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Ljava/util/Set;

    .line 41
    .line 42
    .line 43
    invoke-static {v0, p1}, Lcom/ishumei/smantifraud/l1111l111111Il/l11l111l11Il;->l1111l111111Il(Lcom/ishumei/smantifraud/l1111l111111Il/l11l111l11Il;Ljava/util/Set;)V

    .line 44
    return-void

    .line 45
    .line 46
    :cond_3
    iget-object v0, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l111l11Il$2;->l1111l111111Il:Lcom/ishumei/smantifraud/l1111l111111Il/l11l111l11Il;

    .line 47
    .line 48
    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Lorg/json/JSONObject;

    .line 51
    .line 52
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 53
    .line 54
    if-ne p1, v1, :cond_4

    .line 55
    goto :goto_0

    .line 56
    :cond_4
    const/4 v1, 0x0

    .line 57
    .line 58
    .line 59
    :goto_0
    invoke-static {v0, v2, v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l11l111l11Il;->l111l11111lIl(Lcom/ishumei/smantifraud/l1111l111111Il/l11l111l11Il;Lorg/json/JSONObject;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    :catch_0
    :goto_1
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method
