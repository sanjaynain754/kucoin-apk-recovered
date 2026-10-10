.class public final Lcom/forter/mobile/fortersdk/b$j;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/forter/mobile/fortersdk/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lcom/forter/mobile/fortersdk/b;


# direct methods
.method public constructor <init>(Lcom/forter/mobile/fortersdk/b;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/forter/mobile/fortersdk/b$j;->c:Lcom/forter/mobile/fortersdk/b;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/forter/mobile/fortersdk/b$j;->b:Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
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
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/b$j;->c:Lcom/forter/mobile/fortersdk/b;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/b;->h(Lcom/forter/mobile/fortersdk/b;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/forter/mobile/fortersdk/b;->m()Lcom/forter/mobile/fortersdk/c;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iget-object v1, p0, Lcom/forter/mobile/fortersdk/b$j;->b:Landroid/content/Context;

    .line 15
    const/4 v2, 0x0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v2}, Lcom/forter/mobile/fortersdk/c;->l(Z)Z

    .line 19
    move-result v3

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    iget-wide v3, v0, Lcom/forter/mobile/fortersdk/c;->q:J

    .line 24
    .line 25
    const-wide/16 v5, 0x5dc

    .line 26
    add-long/2addr v3, v5

    .line 27
    .line 28
    .line 29
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 30
    move-result-wide v5

    .line 31
    .line 32
    cmp-long v3, v3, v5

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->h()V

    .line 36
    .line 37
    if-lez v3, :cond_0

    .line 38
    return-void

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 42
    move-result-wide v3

    .line 43
    .line 44
    iput-wide v3, v0, Lcom/forter/mobile/fortersdk/c;->q:J

    .line 45
    .line 46
    iget-object v3, v0, Lcom/forter/mobile/fortersdk/c;->b:Lcom/forter/mobile/fortersdk/ae;

    .line 47
    .line 48
    const-string v4, "analytics"

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v4}, Lcom/forter/mobile/fortersdk/ae;->a(Ljava/lang/String;)Lcom/forter/mobile/fortersdk/g;

    .line 52
    move-result-object v3

    .line 53
    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    iget-object v4, v3, Lcom/forter/mobile/fortersdk/g;->c:Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    invoke-static {v4}, Lcom/forter/mobile/fortersdk/b3;->f(Ljava/lang/String;)Z

    .line 60
    move-result v4

    .line 61
    .line 62
    if-eqz v4, :cond_1

    .line 63
    .line 64
    iget-object v3, v3, Lcom/forter/mobile/fortersdk/g;->d:[Lcom/forter/mobile/fortersdk/h;

    .line 65
    array-length v4, v3

    .line 66
    .line 67
    :goto_0
    if-ge v2, v4, :cond_1

    .line 68
    .line 69
    aget-object v5, v3, v2

    .line 70
    .line 71
    iget-object v6, v5, Lcom/forter/mobile/fortersdk/h;->a:Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 75
    move-result-object v6

    .line 76
    .line 77
    const-string v7, "Queueing analytics call to %s"

    .line 78
    .line 79
    .line 80
    invoke-static {v7, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->h()V

    .line 84
    .line 85
    iget-object v5, v5, Lcom/forter/mobile/fortersdk/h;->b:Ljava/lang/String;

    .line 86
    .line 87
    iget-object v6, v0, Lcom/forter/mobile/fortersdk/c;->d:Lcom/forter/mobile/fortersdk/am;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v6, v5, v1}, Lcom/forter/mobile/fortersdk/am;->j(Ljava/lang/String;Landroid/content/Context;)Z

    .line 91
    .line 92
    add-int/lit8 v2, v2, 0x1

    .line 93
    goto :goto_0

    .line 94
    :cond_1
    return-void
    .line 95
.end method
