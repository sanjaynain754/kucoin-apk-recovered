.class public Lcom/tencent/bugly/proguard/pg$a;
.super Ljava/lang/Thread;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/pg;->a(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/tencent/bugly/proguard/pg;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/pg;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/pg$a;->b:Lcom/tencent/bugly/proguard/pg;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

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
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget v1, Lcom/tencent/bugly/proguard/pg;->f:I

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1, v2, v3}, Lcom/tencent/bugly/proguard/e4;->a(ILcom/tencent/bugly/proguard/d4;Z)Ljava/util/Map;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const-string v1, "device"

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    check-cast v1, [B

    .line 23
    .line 24
    const-string v2, "gateway"

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    check-cast v0, [B

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    iget-object v2, p0, Lcom/tencent/bugly/proguard/pg$a;->b:Lcom/tencent/bugly/proguard/pg;

    .line 35
    .line 36
    .line 37
    invoke-static {v2}, Lcom/tencent/bugly/proguard/pg;->a(Lcom/tencent/bugly/proguard/pg;)Landroid/content/Context;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    .line 41
    invoke-static {v2}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    new-instance v3, Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    invoke-direct {v3, v1}, Ljava/lang/String;-><init>([B)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v3}, Lcom/tencent/bugly/proguard/l2;->l(Ljava/lang/String;)V

    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    goto :goto_1

    .line 54
    .line 55
    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    .line 56
    .line 57
    iget-object v1, p0, Lcom/tencent/bugly/proguard/pg$a;->b:Lcom/tencent/bugly/proguard/pg;

    .line 58
    .line 59
    .line 60
    invoke-static {v1}, Lcom/tencent/bugly/proguard/pg;->a(Lcom/tencent/bugly/proguard/pg;)Landroid/content/Context;

    .line 61
    move-result-object v1

    .line 62
    .line 63
    .line 64
    invoke-static {v1}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    .line 65
    move-result-object v1

    .line 66
    .line 67
    new-instance v2, Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    invoke-direct {v2, v0}, Ljava/lang/String;-><init>([B)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v2}, Lcom/tencent/bugly/proguard/l2;->k(Ljava/lang/String;)V

    .line 74
    .line 75
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pg$a;->b:Lcom/tencent/bugly/proguard/pg;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/pg;->e()Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 79
    move-result-object v1

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/pg;->a(Lcom/tencent/bugly/proguard/pg;Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;)Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 83
    .line 84
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pg$a;->b:Lcom/tencent/bugly/proguard/pg;

    .line 85
    .line 86
    .line 87
    invoke-static {v0}, Lcom/tencent/bugly/proguard/pg;->b(Lcom/tencent/bugly/proguard/pg;)Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    if-eqz v0, :cond_3

    .line 91
    .line 92
    .line 93
    invoke-static {}, Lcom/tencent/bugly/proguard/pg;->a()Ljava/lang/String;

    .line 94
    move-result-object v0

    .line 95
    .line 96
    .line 97
    invoke-static {v0}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    .line 98
    move-result v0

    .line 99
    .line 100
    if-nez v0, :cond_2

    .line 101
    .line 102
    .line 103
    invoke-static {}, Lcom/tencent/bugly/proguard/pg;->a()Ljava/lang/String;

    .line 104
    move-result-object v0

    .line 105
    .line 106
    .line 107
    invoke-static {v0}, Lcom/tencent/bugly/proguard/bi;->e(Ljava/lang/String;)Z

    .line 108
    move-result v0

    .line 109
    .line 110
    if-eqz v0, :cond_2

    .line 111
    .line 112
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pg$a;->b:Lcom/tencent/bugly/proguard/pg;

    .line 113
    .line 114
    .line 115
    invoke-static {v0}, Lcom/tencent/bugly/proguard/pg;->b(Lcom/tencent/bugly/proguard/pg;)Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 116
    move-result-object v0

    .line 117
    .line 118
    .line 119
    invoke-static {}, Lcom/tencent/bugly/proguard/pg;->a()Ljava/lang/String;

    .line 120
    move-result-object v1

    .line 121
    .line 122
    iput-object v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->o:Ljava/lang/String;

    .line 123
    .line 124
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pg$a;->b:Lcom/tencent/bugly/proguard/pg;

    .line 125
    .line 126
    .line 127
    invoke-static {v0}, Lcom/tencent/bugly/proguard/pg;->b(Lcom/tencent/bugly/proguard/pg;)Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 128
    move-result-object v0

    .line 129
    .line 130
    .line 131
    invoke-static {}, Lcom/tencent/bugly/proguard/pg;->a()Ljava/lang/String;

    .line 132
    move-result-object v1

    .line 133
    .line 134
    iput-object v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->p:Ljava/lang/String;

    .line 135
    goto :goto_2

    .line 136
    .line 137
    :cond_2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pg$a;->b:Lcom/tencent/bugly/proguard/pg;

    .line 138
    .line 139
    .line 140
    invoke-static {v0}, Lcom/tencent/bugly/proguard/pg;->b(Lcom/tencent/bugly/proguard/pg;)Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 141
    move-result-object v0

    .line 142
    .line 143
    sget-object v1, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->w:Ljava/lang/String;

    .line 144
    .line 145
    iput-object v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->o:Ljava/lang/String;

    .line 146
    .line 147
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pg$a;->b:Lcom/tencent/bugly/proguard/pg;

    .line 148
    .line 149
    .line 150
    invoke-static {v0}, Lcom/tencent/bugly/proguard/pg;->b(Lcom/tencent/bugly/proguard/pg;)Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 151
    move-result-object v0

    .line 152
    .line 153
    sget-object v1, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->x:Ljava/lang/String;

    .line 154
    .line 155
    iput-object v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->p:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    goto :goto_2

    .line 157
    .line 158
    .line 159
    :goto_1
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    .line 160
    move-result v1

    .line 161
    .line 162
    if-nez v1, :cond_3

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 166
    .line 167
    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pg$a;->b:Lcom/tencent/bugly/proguard/pg;

    .line 168
    .line 169
    .line 170
    invoke-static {v0}, Lcom/tencent/bugly/proguard/pg;->b(Lcom/tencent/bugly/proguard/pg;)Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 171
    move-result-object v1

    .line 172
    const/4 v2, 0x0

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v1, v2}, Lcom/tencent/bugly/proguard/pg;->a(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;Z)V

    .line 176
    return-void
    .line 177
.end method
