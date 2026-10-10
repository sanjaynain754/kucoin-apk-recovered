.class public Lcom/tencent/bugly/proguard/p;
.super Ljava/lang/Object;
.source "BUGLY"


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
            "Lcom/tencent/bugly/proguard/w0;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/tencent/bugly/proguard/w0;",
            ">;"
        }
    .end annotation
.end field

.field public e:J

.field public f:J


# direct methods
.method public constructor <init>(JJ)V
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
    iput-object v0, p0, Lcom/tencent/bugly/proguard/p;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/bugly/proguard/p;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 18
    .line 19
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 23
    .line 24
    iput-object v0, p0, Lcom/tencent/bugly/proguard/p;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 25
    .line 26
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 30
    .line 31
    iput-object v0, p0, Lcom/tencent/bugly/proguard/p;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 32
    .line 33
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/p;->e:J

    .line 34
    .line 35
    iput-wide p3, p0, Lcom/tencent/bugly/proguard/p;->f:J

    .line 36
    return-void
    .line 37
.end method


# virtual methods
.method public final a(Landroid/app/PendingIntent;Landroid/app/AlarmManager$OnAlarmListener;Ljava/util/concurrent/ConcurrentLinkedQueue;)Lcom/tencent/bugly/proguard/w0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/PendingIntent;",
            "Landroid/app/AlarmManager$OnAlarmListener;",
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/tencent/bugly/proguard/w0;",
            ">;)",
            "Lcom/tencent/bugly/proguard/w0;"
        }
    .end annotation

    .line 6
    invoke-virtual {p3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/proguard/w0;

    .line 7
    instance-of v1, v0, Lcom/tencent/bugly/proguard/n;

    if-eqz v1, :cond_0

    .line 8
    move-object v1, v0

    check-cast v1, Lcom/tencent/bugly/proguard/n;

    .line 9
    iget-object v2, v1, Lcom/tencent/bugly/proguard/n;->m:Landroid/app/PendingIntent;

    if-eqz v2, :cond_1

    if-eq v2, p1, :cond_2

    :cond_1
    iget-object v1, v1, Lcom/tencent/bugly/proguard/n;->n:Landroid/app/AlarmManager$OnAlarmListener;

    if-eqz v1, :cond_0

    if-ne v1, p2, :cond_0

    :cond_2
    return-object v0

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public a(J)V
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/tencent/bugly/proguard/p;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p0, p1, p2, v0}, Lcom/tencent/bugly/proguard/p;->a(JLjava/util/concurrent/ConcurrentLinkedQueue;)V

    .line 25
    iget-object v0, p0, Lcom/tencent/bugly/proguard/p;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p0, p1, p2, v0}, Lcom/tencent/bugly/proguard/p;->a(JLjava/util/concurrent/ConcurrentLinkedQueue;)V

    .line 26
    iget-object v0, p0, Lcom/tencent/bugly/proguard/p;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p0, p1, p2, v0}, Lcom/tencent/bugly/proguard/p;->a(JLjava/util/concurrent/ConcurrentLinkedQueue;)V

    .line 27
    iget-object v0, p0, Lcom/tencent/bugly/proguard/p;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p0, p1, p2, v0}, Lcom/tencent/bugly/proguard/p;->a(JLjava/util/concurrent/ConcurrentLinkedQueue;)V

    return-void
.end method

.method public final a(JLjava/util/concurrent/ConcurrentLinkedQueue;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/tencent/bugly/proguard/w0;",
            ">;)V"
        }
    .end annotation

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    invoke-virtual {p3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/w0;

    .line 20
    move-object v3, v2

    check-cast v3, Lcom/tencent/bugly/proguard/n;

    iget-wide v3, v3, Lcom/tencent/bugly/proguard/n;->k:J

    sub-long v3, p1, v3

    const-wide/32 v5, 0x927c0

    cmp-long v3, v3, v5

    if-ltz v3, :cond_0

    .line 21
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 22
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

    .line 23
    invoke-virtual {p3, p2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-void
.end method

.method public a(Landroid/app/PendingIntent;Landroid/app/AlarmManager$OnAlarmListener;)V
    .locals 2

    .line 10
    iget-object v0, p0, Lcom/tencent/bugly/proguard/p;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p0, p1, p2, v0}, Lcom/tencent/bugly/proguard/p;->a(Landroid/app/PendingIntent;Landroid/app/AlarmManager$OnAlarmListener;Ljava/util/concurrent/ConcurrentLinkedQueue;)Lcom/tencent/bugly/proguard/w0;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, v0, Lcom/tencent/bugly/proguard/w0;->c:J

    .line 12
    iget-object p1, p0, Lcom/tencent/bugly/proguard/p;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 13
    iget-object p1, p0, Lcom/tencent/bugly/proguard/p;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/p;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p0, p1, p2, v0}, Lcom/tencent/bugly/proguard/p;->a(Landroid/app/PendingIntent;Landroid/app/AlarmManager$OnAlarmListener;Ljava/util/concurrent/ConcurrentLinkedQueue;)Lcom/tencent/bugly/proguard/w0;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/proguard/w0;->c:J

    .line 16
    iget-object p2, p0, Lcom/tencent/bugly/proguard/p;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 17
    iget-object p2, p0, Lcom/tencent/bugly/proguard/p;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/w0;)V
    .locals 2

    .line 1
    move-object v0, p1

    check-cast v0, Lcom/tencent/bugly/proguard/n;

    iget v0, v0, Lcom/tencent/bugly/proguard/n;->j:I

    if-eqz v0, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/p;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/p;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    return-void

    .line 4
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/p;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/p;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method public final a(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/w0;",
            ">;)V"
        }
    .end annotation

    .line 30
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/proguard/w0;

    const/4 v1, 0x1

    .line 31
    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/w0;->g:Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final a(Lcom/tencent/bugly/proguard/n;JLjava/util/concurrent/ConcurrentLinkedQueue;Ljava/util/concurrent/ConcurrentLinkedQueue;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/proguard/n;",
            "J",
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/tencent/bugly/proguard/w0;",
            ">;",
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/tencent/bugly/proguard/w0;",
            ">;)Z"
        }
    .end annotation

    .line 28
    invoke-virtual {p5, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result p5

    const/4 v0, 0x1

    const-wide/32 v1, 0x927c0

    if-eqz p5, :cond_0

    iget-wide v3, p1, Lcom/tencent/bugly/proguard/w0;->c:J

    iget-wide v5, p1, Lcom/tencent/bugly/proguard/n;->k:J

    cmp-long p5, v3, v5

    if-lez p5, :cond_0

    sub-long v3, p2, v5

    cmp-long p5, v3, v1

    if-gez p5, :cond_0

    iget-boolean p5, p1, Lcom/tencent/bugly/proguard/w0;->g:Z

    if-nez p5, :cond_0

    return v0

    .line 29
    :cond_0
    invoke-virtual {p4, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_1

    iget-wide p4, p1, Lcom/tencent/bugly/proguard/n;->k:J

    cmp-long v3, p4, p2

    if-gez v3, :cond_1

    sub-long/2addr p2, p4

    cmp-long p2, p2, v1

    if-gez p2, :cond_1

    iget-boolean p1, p1, Lcom/tencent/bugly/proguard/w0;->g:Z

    if-nez p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public b(J)Ljava/util/ArrayList;
    .locals 9
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
    iget-object v1, p0, Lcom/tencent/bugly/proguard/p;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    move-result v2

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    check-cast v2, Lcom/tencent/bugly/proguard/w0;

    .line 24
    move-object v4, v2

    .line 25
    .line 26
    check-cast v4, Lcom/tencent/bugly/proguard/n;

    .line 27
    .line 28
    iget-object v7, p0, Lcom/tencent/bugly/proguard/p;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 29
    .line 30
    iget-object v8, p0, Lcom/tencent/bugly/proguard/p;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 31
    move-object v3, p0

    .line 32
    move-wide v5, p1

    .line 33
    .line 34
    .line 35
    invoke-virtual/range {v3 .. v8}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/n;JLjava/util/concurrent/ConcurrentLinkedQueue;Ljava/util/concurrent/ConcurrentLinkedQueue;)Z

    .line 36
    move-result p1

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    :cond_0
    move-wide p1, v5

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move-object v3, p0

    .line 45
    move-wide v5, p1

    .line 46
    .line 47
    iget-object p1, v3, Lcom/tencent/bugly/proguard/p;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    .line 54
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    move-result p2

    .line 56
    .line 57
    if-eqz p2, :cond_3

    .line 58
    .line 59
    .line 60
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    move-result-object p2

    .line 62
    .line 63
    check-cast p2, Lcom/tencent/bugly/proguard/w0;

    .line 64
    move-object v4, p2

    .line 65
    .line 66
    check-cast v4, Lcom/tencent/bugly/proguard/n;

    .line 67
    .line 68
    iget-object v7, v3, Lcom/tencent/bugly/proguard/p;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 69
    .line 70
    iget-object v8, v3, Lcom/tencent/bugly/proguard/p;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 71
    .line 72
    .line 73
    invoke-virtual/range {v3 .. v8}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/n;JLjava/util/concurrent/ConcurrentLinkedQueue;Ljava/util/concurrent/ConcurrentLinkedQueue;)Z

    .line 74
    move-result v1

    .line 75
    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    goto :goto_1

    .line 81
    .line 82
    .line 83
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 84
    move-result p1

    .line 85
    int-to-long p1, p1

    .line 86
    .line 87
    iget-wide v1, v3, Lcom/tencent/bugly/proguard/p;->e:J

    .line 88
    .line 89
    cmp-long p1, p1, v1

    .line 90
    .line 91
    if-lez p1, :cond_4

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/p;->a(Ljava/util/ArrayList;)V

    .line 95
    return-object v0

    .line 96
    .line 97
    :cond_4
    new-instance p1, Ljava/util/ArrayList;

    .line 98
    .line 99
    .line 100
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 101
    return-object p1
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

.method public c(J)Ljava/util/ArrayList;
    .locals 9
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
    iget-object v1, p0, Lcom/tencent/bugly/proguard/p;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    move-result v2

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    check-cast v2, Lcom/tencent/bugly/proguard/w0;

    .line 24
    move-object v4, v2

    .line 25
    .line 26
    check-cast v4, Lcom/tencent/bugly/proguard/n;

    .line 27
    .line 28
    iget-object v7, p0, Lcom/tencent/bugly/proguard/p;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 29
    .line 30
    iget-object v8, p0, Lcom/tencent/bugly/proguard/p;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 31
    move-object v3, p0

    .line 32
    move-wide v5, p1

    .line 33
    .line 34
    .line 35
    invoke-virtual/range {v3 .. v8}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/n;JLjava/util/concurrent/ConcurrentLinkedQueue;Ljava/util/concurrent/ConcurrentLinkedQueue;)Z

    .line 36
    move-result p1

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    :cond_0
    move-wide p1, v5

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move-object v3, p0

    .line 45
    move-wide v5, p1

    .line 46
    .line 47
    iget-object p1, v3, Lcom/tencent/bugly/proguard/p;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    .line 54
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    move-result p2

    .line 56
    .line 57
    if-eqz p2, :cond_3

    .line 58
    .line 59
    .line 60
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    move-result-object p2

    .line 62
    .line 63
    check-cast p2, Lcom/tencent/bugly/proguard/w0;

    .line 64
    move-object v4, p2

    .line 65
    .line 66
    check-cast v4, Lcom/tencent/bugly/proguard/n;

    .line 67
    .line 68
    iget-object v7, v3, Lcom/tencent/bugly/proguard/p;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 69
    .line 70
    iget-object v8, v3, Lcom/tencent/bugly/proguard/p;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 71
    .line 72
    .line 73
    invoke-virtual/range {v3 .. v8}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/n;JLjava/util/concurrent/ConcurrentLinkedQueue;Ljava/util/concurrent/ConcurrentLinkedQueue;)Z

    .line 74
    move-result v1

    .line 75
    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    goto :goto_1

    .line 81
    .line 82
    .line 83
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 84
    move-result p1

    .line 85
    int-to-long p1, p1

    .line 86
    .line 87
    iget-wide v1, v3, Lcom/tencent/bugly/proguard/p;->f:J

    .line 88
    .line 89
    cmp-long p1, p1, v1

    .line 90
    .line 91
    if-lez p1, :cond_4

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/p;->a(Ljava/util/ArrayList;)V

    .line 95
    return-object v0

    .line 96
    .line 97
    :cond_4
    new-instance p1, Ljava/util/ArrayList;

    .line 98
    .line 99
    .line 100
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 101
    return-object p1
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
