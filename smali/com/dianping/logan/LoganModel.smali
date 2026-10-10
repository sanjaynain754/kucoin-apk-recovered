.class public Lcom/dianping/logan/LoganModel;
.super Ljava/lang/Object;
.source "LoganModel.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/dianping/logan/LoganModel$Action;
    }
.end annotation


# instance fields
.field public a:Lcom/dianping/logan/LoganModel$Action;

.field public b:Lcom/dianping/logan/k;

.field public c:Lcom/dianping/logan/h;


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
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public a()Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/dianping/logan/LoganModel;->a:Lcom/dianping/logan/LoganModel$Action;

    .line 3
    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    sget-object v1, Lcom/dianping/logan/LoganModel$Action;->SEND:Lcom/dianping/logan/LoganModel$Action;

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/dianping/logan/LoganModel;->c:Lcom/dianping/logan/h;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/dianping/logan/h;->a()Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    return v2

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/dianping/logan/LoganModel;->a:Lcom/dianping/logan/LoganModel$Action;

    .line 23
    .line 24
    sget-object v1, Lcom/dianping/logan/LoganModel$Action;->WRITE:Lcom/dianping/logan/LoganModel$Action;

    .line 25
    .line 26
    if-ne v0, v1, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lcom/dianping/logan/LoganModel;->b:Lcom/dianping/logan/k;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/dianping/logan/k;->a()Z

    .line 34
    move-result v0

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    return v2

    .line 38
    .line 39
    :cond_1
    iget-object v0, p0, Lcom/dianping/logan/LoganModel;->a:Lcom/dianping/logan/LoganModel$Action;

    .line 40
    .line 41
    sget-object v1, Lcom/dianping/logan/LoganModel$Action;->FLUSH:Lcom/dianping/logan/LoganModel$Action;

    .line 42
    .line 43
    if-ne v0, v1, :cond_2

    .line 44
    return v2

    .line 45
    :cond_2
    const/4 v0, 0x0

    .line 46
    return v0
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
.end method
