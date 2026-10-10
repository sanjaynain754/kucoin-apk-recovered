.class public Lcom/tencent/bugly/proguard/rb;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final d:Ljava/lang/String; = "none"

.field public static volatile e:Lcom/tencent/bugly/proguard/rb;


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/rb;->a:Z

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/rb;->b:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/rb;->c:Z

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static a()Lcom/tencent/bugly/proguard/rb;
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/rb;->e:Lcom/tencent/bugly/proguard/rb;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/tencent/bugly/proguard/rb;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/rb;->e:Lcom/tencent/bugly/proguard/rb;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/tencent/bugly/proguard/rb;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/rb;-><init>()V

    sput-object v1, Lcom/tencent/bugly/proguard/rb;->e:Lcom/tencent/bugly/proguard/rb;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 5
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_2
    sget-object v0, Lcom/tencent/bugly/proguard/rb;->e:Lcom/tencent/bugly/proguard/rb;

    return-object v0
.end method


# virtual methods
.method public final a(ZZZ)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZ)",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_0

    .line 11
    const-string/jumbo p1, "native_memory"

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    if-eqz p2, :cond_1

    .line 12
    const-string p1, "fd_leak"

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eqz p3, :cond_2

    .line 13
    const-string p1, "asan"

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    return-object v0
.end method

.method public a(Ljava/lang/String;)Z
    .locals 3

    .line 7
    const-string v0, "fd_leak"

    const-string v1, "asan"

    const-string/jumbo v2, "native_memory"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 9
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {}, Lcom/tencent/bugly/proguard/cf;->a()Lcom/tencent/bugly/proguard/cf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/tencent/bugly/proguard/cf;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/rb;->b:Z

    if-eqz v0, :cond_0

    .line 3
    const-string/jumbo v0, "native_memory"

    return-object v0

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/rb;->a:Z

    if-eqz v0, :cond_1

    .line 5
    const-string v0, "fd_leak"

    return-object v0

    .line 6
    :cond_1
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/rb;->c:Z

    if-eqz v0, :cond_2

    .line 7
    const-string v0, "asan"

    return-object v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public final b(ZZZ)Z
    .locals 0

    .line 1
    if-nez p2, :cond_1

    if-nez p1, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public c()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/tencent/bugly/proguard/q4;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    const-string/jumbo v1, "x86"

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    const-string v1, "fail"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    return v0

    .line 29
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 30
    return v0
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
.end method

.method public d()Ljava/lang/String;
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    sget-object v1, Lcom/tencent/rmonitor/base/config/ConfigProxy;->INSTANCE:Lcom/tencent/rmonitor/base/config/ConfigProxy;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v1}, Lcom/tencent/rmonitor/base/config/ConfigProxy;->getConfig()Lcom/tencent/rmonitor/base/config/a;

    .line 7
    move-result-object v2

    .line 8
    .line 9
    .line 10
    const-string/jumbo v3, "native_memory"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, v3}, Lcom/tencent/rmonitor/base/config/a;->e(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    iget-boolean v2, v2, Lcom/tencent/bugly/proguard/hf;->g:Z

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/tencent/rmonitor/base/config/ConfigProxy;->getConfig()Lcom/tencent/rmonitor/base/config/a;

    .line 20
    move-result-object v4

    .line 21
    .line 22
    const-string v5, "fd_leak"

    .line 23
    .line 24
    .line 25
    invoke-virtual {v4, v5}, Lcom/tencent/rmonitor/base/config/a;->e(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;

    .line 26
    move-result-object v4

    .line 27
    .line 28
    iget-boolean v4, v4, Lcom/tencent/bugly/proguard/hf;->g:Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/tencent/rmonitor/base/config/ConfigProxy;->getConfig()Lcom/tencent/rmonitor/base/config/a;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    const-string v6, "asan"

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v6}, Lcom/tencent/rmonitor/base/config/a;->e(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    iget-boolean v1, v1, Lcom/tencent/bugly/proguard/hf;->g:Z

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v2, v4, v1}, Lcom/tencent/bugly/proguard/rb;->b(ZZZ)Z

    .line 44
    move-result v7

    .line 45
    .line 46
    if-nez v7, :cond_0

    .line 47
    .line 48
    .line 49
    const-string/jumbo v0, "none"

    .line 50
    return-object v0

    .line 51
    .line 52
    .line 53
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/rb;->b()Ljava/lang/String;

    .line 54
    move-result-object v7

    .line 55
    .line 56
    if-eqz v7, :cond_1

    .line 57
    return-object v7

    .line 58
    .line 59
    .line 60
    :cond_1
    invoke-virtual {p0, v2, v4, v1}, Lcom/tencent/bugly/proguard/rb;->a(ZZZ)Ljava/util/ArrayList;

    .line 61
    move-result-object v1

    .line 62
    .line 63
    .line 64
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 65
    move-result-wide v7

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 69
    move-result v2

    .line 70
    int-to-double v9, v2

    .line 71
    mul-double/2addr v7, v9

    .line 72
    double-to-int v2, v7

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 76
    move-result-object v1

    .line 77
    .line 78
    check-cast v1, Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    const/4 v2, -0x1

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 86
    move-result v4

    .line 87
    .line 88
    .line 89
    sparse-switch v4, :sswitch_data_0

    .line 90
    goto :goto_0

    .line 91
    .line 92
    .line 93
    :sswitch_0
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    move-result v3

    .line 95
    .line 96
    if-nez v3, :cond_2

    .line 97
    goto :goto_0

    .line 98
    :cond_2
    const/4 v2, 0x2

    .line 99
    goto :goto_0

    .line 100
    .line 101
    .line 102
    :sswitch_1
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    move-result v3

    .line 104
    .line 105
    if-nez v3, :cond_3

    .line 106
    goto :goto_0

    .line 107
    :cond_3
    move v2, v0

    .line 108
    goto :goto_0

    .line 109
    .line 110
    .line 111
    :sswitch_2
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    move-result v3

    .line 113
    .line 114
    if-nez v3, :cond_4

    .line 115
    goto :goto_0

    .line 116
    :cond_4
    const/4 v2, 0x0

    .line 117
    .line 118
    .line 119
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 120
    return-object v1

    .line 121
    .line 122
    :pswitch_0
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/rb;->c:Z

    .line 123
    return-object v1

    .line 124
    .line 125
    :pswitch_1
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/rb;->b:Z

    .line 126
    return-object v1

    .line 127
    .line 128
    :pswitch_2
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/rb;->a:Z

    .line 129
    return-object v1

    .line 130
    nop

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
    :sswitch_data_0
    .sparse-switch
        -0x3c326dbc -> :sswitch_2
        -0x3b0e8dd7 -> :sswitch_1
        0x2dd3df -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
