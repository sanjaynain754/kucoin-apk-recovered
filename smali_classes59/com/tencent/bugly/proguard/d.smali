.class public abstract Lcom/tencent/bugly/proguard/d;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/d$a;
    }
.end annotation


# instance fields
.field public a:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/tencent/bugly/proguard/w0;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/tencent/bugly/proguard/w0;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/tencent/bugly/proguard/d$a;",
            ">;"
        }
    .end annotation
.end field

.field public d:J

.field public e:J

.field public f:J

.field public g:J


# direct methods
.method public constructor <init>(JJJ)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/d;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/bugly/proguard/d;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 18
    .line 19
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/d;->d:J

    .line 20
    .line 21
    iput-wide p3, p0, Lcom/tencent/bugly/proguard/d;->e:J

    .line 22
    .line 23
    iput-wide p5, p0, Lcom/tencent/bugly/proguard/d;->f:J

    .line 24
    .line 25
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 26
    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 29
    .line 30
    iput-object p1, p0, Lcom/tencent/bugly/proguard/d;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 31
    return-void
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
.end method


# virtual methods
.method public a(J)J
    .locals 9

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    iget-object v1, p0, Lcom/tencent/bugly/proguard/d;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/d$a;

    .line 9
    new-instance v3, Lcom/tencent/bugly/proguard/d$a;

    iget-wide v5, v2, Lcom/tencent/bugly/proguard/d$a;->b:J

    move-object v4, p0

    move-wide v7, p1

    invoke-direct/range {v3 .. v8}, Lcom/tencent/bugly/proguard/d$a;-><init>(Lcom/tencent/bugly/proguard/d;JJ)V

    .line 10
    iget-wide p1, v2, Lcom/tencent/bugly/proguard/d$a;->c:J

    const-wide/16 v5, 0x0

    cmp-long v2, p1, v5

    if-eqz v2, :cond_0

    .line 11
    iput-wide p1, v3, Lcom/tencent/bugly/proguard/d$a;->c:J

    .line 12
    :cond_0
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-wide p1, v7

    goto :goto_0

    :cond_1
    move-object v4, p0

    .line 13
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/d;->a(Ljava/util/ArrayList;)J

    move-result-wide p1

    return-wide p1
.end method

.method public a(Ljava/util/ArrayList;)J
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/d$a;",
            ">;)J"
        }
    .end annotation

    .line 18
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 19
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 20
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tencent/bugly/proguard/d$a;

    .line 21
    invoke-virtual {p0, v3, v1}, Lcom/tencent/bugly/proguard/d;->a(Lcom/tencent/bugly/proguard/d$a;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v4

    .line 22
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 23
    invoke-virtual {p0, v3, v4}, Lcom/tencent/bugly/proguard/d;->b(Lcom/tencent/bugly/proguard/d$a;Ljava/util/ArrayList;)Lcom/tencent/bugly/proguard/d$a;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const-wide/16 v0, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/d$a;

    .line 26
    iget-wide v3, v2, Lcom/tencent/bugly/proguard/d$a;->c:J

    iget-wide v5, v2, Lcom/tencent/bugly/proguard/d$a;->b:J

    sub-long/2addr v3, v5

    add-long/2addr v0, v3

    goto :goto_1

    :cond_1
    return-wide v0
.end method

.method public final a(Lcom/tencent/bugly/proguard/d$a;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/proguard/d$a;",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/d$a;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/d$a;",
            ">;"
        }
    .end annotation

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/d$a;

    .line 16
    iget-wide v2, p1, Lcom/tencent/bugly/proguard/d$a;->c:J

    iget-wide v4, v1, Lcom/tencent/bugly/proguard/d$a;->b:J

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    iget-wide v2, p1, Lcom/tencent/bugly/proguard/d$a;->b:J

    iget-wide v4, v1, Lcom/tencent/bugly/proguard/d$a;->c:J

    cmp-long v2, v2, v4

    if-ltz v2, :cond_1

    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public a(Lcom/tencent/bugly/proguard/w0;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/d;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/d;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/d;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/d$a;

    .line 4
    iget-wide v2, v2, Lcom/tencent/bugly/proguard/d$a;->b:J

    iget-wide v4, p1, Lcom/tencent/bugly/proguard/w0;->b:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    if-nez v1, :cond_3

    .line 5
    new-instance v2, Lcom/tencent/bugly/proguard/d$a;

    iget-wide v4, p1, Lcom/tencent/bugly/proguard/w0;->b:J

    const-wide/16 v6, 0x0

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/tencent/bugly/proguard/d$a;-><init>(Lcom/tencent/bugly/proguard/d;JJ)V

    .line 6
    iget-object p1, v3, Lcom/tencent/bugly/proguard/d;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    return-void

    :cond_3
    move-object v3, p0

    return-void
.end method

.method public final b(Lcom/tencent/bugly/proguard/d$a;Ljava/util/ArrayList;)Lcom/tencent/bugly/proguard/d$a;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/proguard/d$a;",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/d$a;",
            ">;)",
            "Lcom/tencent/bugly/proguard/d$a;"
        }
    .end annotation

    .line 7
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    .line 8
    :cond_0
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/d$a;->b:J

    const/4 v2, 0x0

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/d$a;

    iget-wide v2, v2, Lcom/tencent/bugly/proguard/d$a;->b:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/proguard/d$a;->b:J

    .line 9
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/d$a;->c:J

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/tencent/bugly/proguard/d$a;

    iget-wide v2, p2, Lcom/tencent/bugly/proguard/d$a;->c:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/proguard/d$a;->c:J

    return-object p1
.end method

.method public b(J)V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/tencent/bugly/proguard/d;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/w0;

    .line 3
    iget-wide v3, v2, Lcom/tencent/bugly/proguard/w0;->b:J

    sub-long v3, p1, v3

    const-wide/32 v5, 0x927c0

    cmp-long v3, v3, v5

    if-ltz v3, :cond_0

    .line 4
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/tencent/bugly/proguard/w0;

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/d;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-void
.end method

.method public c(J)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/w0;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/tencent/bugly/proguard/d;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    move-result v2

    .line 16
    .line 17
    .line 18
    const-wide/32 v3, 0x927c0

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    check-cast v2, Lcom/tencent/bugly/proguard/w0;

    .line 27
    .line 28
    iget-boolean v5, v2, Lcom/tencent/bugly/proguard/w0;->g:Z

    .line 29
    .line 30
    if-nez v5, :cond_0

    .line 31
    .line 32
    iget-wide v5, v2, Lcom/tencent/bugly/proguard/w0;->b:J

    .line 33
    .line 34
    sub-long v5, p1, v5

    .line 35
    .line 36
    cmp-long v3, v5, v3

    .line 37
    .line 38
    if-gez v3, :cond_0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    goto :goto_0

    .line 43
    .line 44
    :cond_1
    iget-object v1, p0, Lcom/tencent/bugly/proguard/d;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    .line 51
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    move-result v2

    .line 53
    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    move-result-object v2

    .line 59
    .line 60
    check-cast v2, Lcom/tencent/bugly/proguard/w0;

    .line 61
    .line 62
    iget-boolean v5, v2, Lcom/tencent/bugly/proguard/w0;->g:Z

    .line 63
    .line 64
    if-nez v5, :cond_2

    .line 65
    .line 66
    iget-wide v5, v2, Lcom/tencent/bugly/proguard/w0;->b:J

    .line 67
    .line 68
    sub-long v5, p1, v5

    .line 69
    .line 70
    cmp-long v5, v5, v3

    .line 71
    .line 72
    if-gez v5, :cond_2

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    goto :goto_1

    .line 77
    .line 78
    .line 79
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 80
    move-result p1

    .line 81
    int-to-long p1, p1

    .line 82
    .line 83
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/d;->e:J

    .line 84
    .line 85
    cmp-long p1, p1, v1

    .line 86
    .line 87
    if-lez p1, :cond_5

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    .line 94
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    move-result p2

    .line 96
    .line 97
    if-eqz p2, :cond_4

    .line 98
    .line 99
    .line 100
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    move-result-object p2

    .line 102
    .line 103
    check-cast p2, Lcom/tencent/bugly/proguard/w0;

    .line 104
    const/4 v1, 0x1

    .line 105
    .line 106
    iput-boolean v1, p2, Lcom/tencent/bugly/proguard/w0;->g:Z

    .line 107
    goto :goto_2

    .line 108
    :cond_4
    return-object v0

    .line 109
    .line 110
    :cond_5
    new-instance p1, Ljava/util/ArrayList;

    .line 111
    .line 112
    .line 113
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 114
    return-object p1
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method

.method public d(J)Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/w0;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/tencent/bugly/proguard/d;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x1

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    check-cast v2, Lcom/tencent/bugly/proguard/w0;

    .line 25
    .line 26
    iget-boolean v4, v2, Lcom/tencent/bugly/proguard/w0;->f:Z

    .line 27
    .line 28
    if-nez v4, :cond_0

    .line 29
    .line 30
    iget-wide v4, v2, Lcom/tencent/bugly/proguard/w0;->b:J

    .line 31
    .line 32
    sub-long v4, p1, v4

    .line 33
    .line 34
    iget-wide v6, p0, Lcom/tencent/bugly/proguard/d;->d:J

    .line 35
    .line 36
    cmp-long v4, v4, v6

    .line 37
    .line 38
    if-ltz v4, :cond_0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    iput-boolean v3, v2, Lcom/tencent/bugly/proguard/w0;->f:Z

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :cond_1
    iget-object p1, p0, Lcom/tencent/bugly/proguard/d;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    move-result p2

    .line 55
    .line 56
    if-eqz p2, :cond_3

    .line 57
    .line 58
    .line 59
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    move-result-object p2

    .line 61
    .line 62
    check-cast p2, Lcom/tencent/bugly/proguard/w0;

    .line 63
    .line 64
    iget-boolean v1, p2, Lcom/tencent/bugly/proguard/w0;->f:Z

    .line 65
    .line 66
    if-nez v1, :cond_2

    .line 67
    .line 68
    iget-wide v1, p2, Lcom/tencent/bugly/proguard/w0;->c:J

    .line 69
    .line 70
    iget-wide v4, p2, Lcom/tencent/bugly/proguard/w0;->b:J

    .line 71
    sub-long/2addr v1, v4

    .line 72
    .line 73
    iget-wide v4, p0, Lcom/tencent/bugly/proguard/d;->d:J

    .line 74
    .line 75
    cmp-long v1, v1, v4

    .line 76
    .line 77
    if-ltz v1, :cond_2

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    iput-boolean v3, p2, Lcom/tencent/bugly/proguard/w0;->f:Z

    .line 83
    goto :goto_1

    .line 84
    :cond_3
    return-object v0
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
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method

.method public e(J)Ljava/util/ArrayList;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/w0;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v6, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v7, Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/tencent/bugly/proguard/d;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 16
    move-result-object v8

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    move-result v0

    .line 21
    .line 22
    .line 23
    const-wide/32 v9, 0x927c0

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    check-cast v0, Lcom/tencent/bugly/proguard/w0;

    .line 32
    .line 33
    iget-boolean v2, v0, Lcom/tencent/bugly/proguard/w0;->h:Z

    .line 34
    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    iget-wide v2, v0, Lcom/tencent/bugly/proguard/w0;->b:J

    .line 38
    .line 39
    sub-long v2, p1, v2

    .line 40
    .line 41
    cmp-long v2, v2, v9

    .line 42
    .line 43
    if-gez v2, :cond_0

    .line 44
    .line 45
    .line 46
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    :cond_0
    new-instance v2, Lcom/tencent/bugly/proguard/d$a;

    .line 49
    .line 50
    iget-wide v3, v0, Lcom/tencent/bugly/proguard/w0;->b:J

    .line 51
    move-object v1, p0

    .line 52
    move-object v0, v2

    .line 53
    move-wide v2, v3

    .line 54
    move-wide v4, p1

    .line 55
    .line 56
    .line 57
    invoke-direct/range {v0 .. v5}, Lcom/tencent/bugly/proguard/d$a;-><init>(Lcom/tencent/bugly/proguard/d;JJ)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    goto :goto_0

    .line 62
    .line 63
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/d;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 67
    move-result-object v8

    .line 68
    .line 69
    .line 70
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    move-result v0

    .line 72
    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    .line 76
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    check-cast v0, Lcom/tencent/bugly/proguard/w0;

    .line 80
    .line 81
    iget-boolean v2, v0, Lcom/tencent/bugly/proguard/w0;->h:Z

    .line 82
    .line 83
    if-nez v2, :cond_2

    .line 84
    .line 85
    iget-wide v2, v0, Lcom/tencent/bugly/proguard/w0;->b:J

    .line 86
    .line 87
    sub-long v2, p1, v2

    .line 88
    .line 89
    cmp-long v2, v2, v9

    .line 90
    .line 91
    if-gez v2, :cond_2

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    :cond_2
    new-instance v2, Lcom/tencent/bugly/proguard/d$a;

    .line 97
    move-object v4, v2

    .line 98
    .line 99
    iget-wide v2, v0, Lcom/tencent/bugly/proguard/w0;->b:J

    .line 100
    .line 101
    iget-wide v11, v0, Lcom/tencent/bugly/proguard/w0;->c:J

    .line 102
    move-object v1, p0

    .line 103
    move-object v0, v4

    .line 104
    move-wide v4, v11

    .line 105
    .line 106
    .line 107
    invoke-direct/range {v0 .. v5}, Lcom/tencent/bugly/proguard/d$a;-><init>(Lcom/tencent/bugly/proguard/d;JJ)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    goto :goto_1

    .line 112
    .line 113
    .line 114
    :cond_3
    invoke-virtual {p0, v7}, Lcom/tencent/bugly/proguard/d;->a(Ljava/util/ArrayList;)J

    .line 115
    move-result-wide v2

    .line 116
    .line 117
    iput-wide v2, p0, Lcom/tencent/bugly/proguard/d;->g:J

    .line 118
    .line 119
    iget-wide v4, p0, Lcom/tencent/bugly/proguard/d;->f:J

    .line 120
    .line 121
    cmp-long v0, v2, v4

    .line 122
    .line 123
    if-lez v0, :cond_5

    .line 124
    .line 125
    .line 126
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 127
    move-result-object v0

    .line 128
    .line 129
    .line 130
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    move-result v2

    .line 132
    .line 133
    if-eqz v2, :cond_4

    .line 134
    .line 135
    .line 136
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    move-result-object v2

    .line 138
    .line 139
    check-cast v2, Lcom/tencent/bugly/proguard/w0;

    .line 140
    const/4 v3, 0x1

    .line 141
    .line 142
    iput-boolean v3, v2, Lcom/tencent/bugly/proguard/w0;->h:Z

    .line 143
    goto :goto_2

    .line 144
    :cond_4
    return-object v6

    .line 145
    .line 146
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    .line 147
    .line 148
    .line 149
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 150
    return-object v0
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method
