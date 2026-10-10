.class public Lcom/tencent/bugly/proguard/v1;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/hg$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/v1$d;,
        Lcom/tencent/bugly/proguard/v1$f;,
        Lcom/tencent/bugly/proguard/v1$e;
    }
.end annotation


# static fields
.field public static final f:I = 0x14

.field public static final g:I = 0x32

.field public static final h:J = 0x240c8400L

.field public static final i:J = 0x5265c00L

.field public static final j:Ljava/lang/String; = "bugly_last_us_up_tm"

.field public static k:Z = true


# instance fields
.field public a:J

.field public b:Landroid/content/Context;

.field public c:J

.field public d:I

.field public e:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
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
.end method

.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/32 v0, 0x493e0

    .line 7
    .line 8
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/v1;->a:J

    .line 9
    .line 10
    iput-object p1, p0, Lcom/tencent/bugly/proguard/v1;->b:Landroid/content/Context;

    .line 11
    .line 12
    iput-boolean p2, p0, Lcom/tencent/bugly/proguard/v1;->e:Z

    .line 13
    .line 14
    .line 15
    :try_start_0
    const-string/jumbo p1, "userInfoMinInterval"

    .line 16
    .line 17
    const-string p2, "300000"

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/bi;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 25
    move-result-wide p1

    .line 26
    .line 27
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/v1;->a:J

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b;->d()Lcom/tencent/rmonitor/base/config/b;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    .line 34
    const-string/jumbo p2, "userinfo_report"

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/base/config/b;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    instance-of p2, p1, Lcom/tencent/bugly/proguard/zh;

    .line 41
    .line 42
    if-eqz p2, :cond_0

    .line 43
    move-object p2, p1

    .line 44
    .line 45
    check-cast p2, Lcom/tencent/bugly/proguard/zh;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/zh;->d()Z

    .line 49
    move-result p2

    .line 50
    .line 51
    if-eqz p2, :cond_0

    .line 52
    move-object p2, p1

    .line 53
    .line 54
    check-cast p2, Lcom/tencent/bugly/proguard/zh;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/zh;->c()Z

    .line 58
    move-result p2

    .line 59
    .line 60
    if-eqz p2, :cond_0

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lcom/tencent/bugly/proguard/hg;->c()Lcom/tencent/bugly/proguard/hg;

    .line 64
    move-result-object p2

    .line 65
    const/4 v0, 0x1

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, v0}, Lcom/tencent/bugly/proguard/hg;->a(Z)V

    .line 69
    .line 70
    .line 71
    invoke-static {}, Lcom/tencent/bugly/proguard/hg;->c()Lcom/tencent/bugly/proguard/hg;

    .line 72
    move-result-object p2

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2, p0}, Lcom/tencent/bugly/proguard/hg;->a(Lcom/tencent/bugly/proguard/hg$c;)V

    .line 76
    .line 77
    .line 78
    invoke-static {}, Lcom/tencent/bugly/proguard/hg;->c()Lcom/tencent/bugly/proguard/hg;

    .line 79
    move-result-object p2

    .line 80
    .line 81
    check-cast p1, Lcom/tencent/bugly/proguard/zh;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/zh;->b()J

    .line 85
    move-result-wide v0

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2, v0, v1}, Lcom/tencent/bugly/proguard/hg;->a(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    return-void

    .line 90
    :catchall_0
    move-exception p1

    .line 91
    .line 92
    .line 93
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    .line 94
    :cond_0
    return-void
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
.end method

.method public static a(Ljava/util/List;J)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/crashreport/biz/UserInfoBean;",
            ">;J)I"
        }
    .end annotation

    .line 58
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 59
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

    .line 60
    iget-wide v4, v3, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->f:J

    sub-long v6, v0, p1

    cmp-long v4, v4, v6

    if-lez v4, :cond_0

    .line 61
    iget v3, v3, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->c:I

    const/4 v4, 0x1

    if-eq v3, v4, :cond_1

    const/4 v4, 0x4

    if-eq v3, v4, :cond_1

    const/4 v4, 0x3

    if-ne v3, v4, :cond_0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method

.method public static a(Landroid/content/Context;I)Lcom/tencent/bugly/crashreport/biz/UserInfoBean;
    .locals 3

    .line 7
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    .line 8
    new-instance v0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

    invoke-direct {v0}, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;-><init>()V

    .line 9
    iput p1, v0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->c:I

    .line 10
    iget-object v1, p0, Lcom/tencent/bugly/proguard/l2;->f:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->d:Ljava/lang/String;

    .line 11
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l2;->F()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->e:Ljava/lang/String;

    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->f:J

    const-wide/16 v1, -0x1

    .line 13
    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->g:J

    .line 14
    iget-object v1, p0, Lcom/tencent/bugly/proguard/l2;->F:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->o:Ljava/lang/String;

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 15
    :goto_0
    iput v1, v0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->p:I

    .line 16
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l2;->K()Z

    move-result p1

    iput-boolean p1, v0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->m:Z

    .line 17
    iget-object p1, p0, Lcom/tencent/bugly/proguard/l2;->Y:Ljava/lang/String;

    iput-object p1, v0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->n:Ljava/lang/String;

    .line 18
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/l2;->Z:J

    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->h:J

    .line 19
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/l2;->a0:J

    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->i:J

    .line 20
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/l2;->b0:J

    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->j:J

    .line 21
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/l2;->c0:J

    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->l:J

    .line 22
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l2;->i()Ljava/util/Map;

    move-result-object p1

    iput-object p1, v0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->s:Ljava/util/Map;

    .line 23
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l2;->h()Ljava/util/Map;

    move-result-object p1

    iput-object p1, v0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->t:Ljava/util/Map;

    .line 24
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l2;->H()I

    move-result p1

    iput p1, v0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->q:I

    .line 25
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l2;->A()I

    move-result p0

    iput p0, v0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->r:I

    .line 26
    invoke-static {}, Lcom/tencent/bugly/proguard/w3;->a()Lcom/tencent/rmonitor/custom/a;

    move-result-object p0

    .line 27
    invoke-virtual {p0}, Lcom/tencent/rmonitor/custom/a;->f()Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 28
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    const-string/jumbo p1, "user_custom"

    invoke-virtual {v0, p1, p0}, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-object v0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/v1;Lcom/tencent/bugly/crashreport/biz/UserInfoBean;)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/v1;->a(Lcom/tencent/bugly/crashreport/biz/UserInfoBean;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/v1;Lcom/tencent/bugly/crashreport/biz/UserInfoBean;Z)V
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/v1;->a(Lcom/tencent/bugly/crashreport/biz/UserInfoBean;Z)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/v1;Z)V
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/v1;->d(Z)V

    return-void
.end method

.method public static a(Ljava/util/List;Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/crashreport/biz/UserInfoBean;",
            ">;",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/crashreport/biz/UserInfoBean;",
            ">;)V"
        }
    .end annotation

    .line 49
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x14

    if-lez v0, :cond_3

    const/4 v1, 0x0

    move v2, v1

    .line 50
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ge v2, v3, :cond_2

    add-int/lit8 v3, v2, 0x1

    move v4, v3

    .line 51
    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_1

    .line 52
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

    iget-wide v5, v5, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->f:J

    .line 53
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

    iget-wide v7, v7, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->f:J

    cmp-long v5, v5, v7

    if-lez v5, :cond_0

    .line 54
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

    .line 55
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

    invoke-interface {p0, v2, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 56
    invoke-interface {p0, v4, v5}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    move v2, v3

    goto :goto_0

    :cond_2
    :goto_2
    if-ge v1, v0, :cond_3

    .line 57
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_3
    return-void
.end method

.method public static a(Z)V
    .locals 0

    .line 6
    sput-boolean p0, Lcom/tencent/bugly/proguard/v1;->k:Z

    return-void
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/v1;)Z
    .locals 0

    .line 2
    iget-boolean p0, p0, Lcom/tencent/bugly/proguard/v1;->e:Z

    return p0
.end method

.method public static synthetic b(Lcom/tencent/bugly/proguard/v1;)J
    .locals 2

    .line 25
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/v1;->c:J

    return-wide v0
.end method

.method public static b(Ljava/util/List;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/crashreport/biz/UserInfoBean;",
            ">;",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/crashreport/biz/UserInfoBean;",
            ">;)V"
        }
    .end annotation

    .line 32
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 33
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 34
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

    .line 35
    iget-wide v1, v0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->g:J

    const-wide/16 v3, -0x1

    cmp-long v1, v1, v3

    if-eqz v1, :cond_0

    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 37
    iget-wide v1, v0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->f:J

    invoke-static {}, Lcom/tencent/bugly/proguard/bi;->b()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-gez v1, :cond_0

    .line 38
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static c()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/tencent/bugly/proguard/v1;->k:Z

    return v0
.end method


# virtual methods
.method public a(Landroid/database/Cursor;)Lcom/tencent/bugly/crashreport/biz/UserInfoBean;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 173
    :cond_0
    :try_start_0
    const-string v1, "_dt"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v1

    if-nez v1, :cond_1

    return-object v0

    .line 174
    :cond_1
    const-string v2, "_id"

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    .line 175
    sget-object p1, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/bi;->a([BLandroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

    if-eqz p1, :cond_2

    .line 176
    iput-wide v2, p1, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_2
    return-object p1

    .line 177
    :goto_0
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 178
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3
    return-object v0
.end method

.method public a(Ljava/lang/String;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/crashreport/biz/UserInfoBean;",
            ">;"
        }
    .end annotation

    const-string v0, "_id"

    const-string v1, "_pc = \'"

    const/4 v2, 0x0

    .line 136
    :try_start_0
    invoke-static {p1}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v6, v2

    goto :goto_0

    .line 137
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    move-object v6, p1

    .line 138
    :goto_0
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    move-result-object v3

    const-string/jumbo v4, "t_ui"

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v3 .. v9}, Lcom/tencent/bugly/proguard/e4;->a(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;Z)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-nez p1, :cond_2

    if-eqz p1, :cond_1

    .line 139
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_1
    return-object v2

    .line 140
    :cond_2
    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 142
    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 143
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/v1;->a(Landroid/database/Cursor;)Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 144
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    .line 145
    :cond_3
    :try_start_2
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {p1, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    .line 146
    const-string v6, " or "

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " = "

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    .line 147
    :catchall_1
    :try_start_3
    const-string v4, "[Database] unknown id."

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v4, v5}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_1

    .line 148
    :cond_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 149
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_5

    const/4 v1, 0x4

    .line 150
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    .line 151
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    move-result-object v4

    const-string/jumbo v5, "t_ui"

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v7, 0x0

    invoke-virtual/range {v4 .. v9}, Lcom/tencent/bugly/proguard/e4;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;Z)I

    move-result v0

    .line 152
    const-string v1, "[Database] deleted %s error data %d"

    const-string/jumbo v4, "t_ui"

    .line 153
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 154
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 155
    :cond_5
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-object v3

    :catchall_2
    move-exception v0

    move-object p1, v2

    .line 156
    :goto_2
    :try_start_4
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 157
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v0

    goto :goto_4

    :cond_6
    :goto_3
    if-eqz p1, :cond_7

    .line 158
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_7
    return-object v2

    :goto_4
    if-eqz p1, :cond_8

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 159
    :cond_8
    throw v0
.end method

.method public final a(Lcom/tencent/bugly/proguard/tf;Lcom/tencent/bugly/proguard/wh;)Lorg/json/JSONObject;
    .locals 4

    .line 73
    sget-object v0, Lcom/tencent/bugly/proguard/nf;->T:[Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/nf;->a([Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 74
    :try_start_0
    const-string v1, "first_report"

    iget v2, p0, Lcom/tencent/bugly/proguard/v1;->d:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 75
    const-string v1, "feature_id_enabled"

    .line 76
    invoke-static {}, Lcom/tencent/bugly/proguard/cf;->a()Lcom/tencent/bugly/proguard/cf;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/cf;->b()Lorg/json/JSONArray;

    move-result-object v2

    .line 77
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 78
    const-string v1, "app_channel"

    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/l2;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 79
    const-string/jumbo v1, "process_name"

    iget-object v2, p2, Lcom/tencent/bugly/proguard/wh;->r:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 80
    const-string v1, "component_info_str"

    iget-object v2, p2, Lcom/tencent/bugly/proguard/wh;->u:Ljava/util/Map;

    const-string v3, "C04_SDK_INFO"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 81
    const-string v1, "apn"

    iget-object p1, p1, Lcom/tencent/bugly/proguard/tf;->F:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 82
    const-string p1, "custom_upload_anything"

    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object v1

    iget-boolean v1, v1, Lcom/tencent/bugly/proguard/l2;->z0:Z

    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 83
    const-string/jumbo p1, "upload_type"

    iget-byte v1, p2, Lcom/tencent/bugly/proguard/wh;->q:B

    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 84
    invoke-static {}, Lcom/tencent/bugly/proguard/hg;->c()Lcom/tencent/bugly/proguard/hg;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/hg;->d()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 85
    const-string/jumbo p1, "session_id"

    invoke-static {}, Lcom/tencent/bugly/proguard/hg;->c()Lcom/tencent/bugly/proguard/hg;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/hg;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 86
    :cond_1
    :goto_1
    const-string/jumbo p1, "sBuffer"

    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/v1;->a(Lcom/tencent/bugly/proguard/wh;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 87
    invoke-static {}, Lcom/tencent/bugly/proguard/w3;->a()Lcom/tencent/rmonitor/custom/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/rmonitor/custom/a;->f()Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 88
    const-string/jumbo p2, "user_custom"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    .line 89
    :goto_2
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    :cond_2
    return-object v0
.end method

.method public final a(Lcom/tencent/bugly/proguard/wh;)Lorg/json/JSONObject;
    .locals 7

    .line 62
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 63
    :try_start_0
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 64
    iget-object p1, p1, Lcom/tencent/bugly/proguard/wh;->t:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/tg;

    .line 65
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 66
    const-string/jumbo v4, "startTime"

    iget-wide v5, v2, Lcom/tencent/bugly/proguard/tg;->q:J

    invoke-virtual {v3, v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 67
    const-string/jumbo v4, "startType"

    iget-byte v5, v2, Lcom/tencent/bugly/proguard/tg;->r:B

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 68
    const-string/jumbo v4, "userId"

    iget-object v5, v2, Lcom/tencent/bugly/proguard/tg;->s:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 69
    const-string/jumbo v4, "proceName"

    iget-object v2, v2, Lcom/tencent/bugly/proguard/tg;->t:Ljava/lang/String;

    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 70
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 71
    :cond_0
    const-string p1, "list"

    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    .line 72
    :goto_1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    return-object v0
.end method

.method public a()V
    .locals 6

    .line 40
    invoke-static {}, Lcom/tencent/bugly/proguard/bi;->b()J

    move-result-wide v0

    const-wide/32 v2, 0x5265c00

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/v1;->c:J

    .line 41
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object v0

    new-instance v1, Lcom/tencent/bugly/proguard/v1$e;

    invoke-direct {v1, p0}, Lcom/tencent/bugly/proguard/v1$e;-><init>(Lcom/tencent/bugly/proguard/v1;)V

    iget-wide v2, p0, Lcom/tencent/bugly/proguard/v1;->c:J

    .line 42
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x1388

    add-long/2addr v2, v4

    .line 43
    invoke-virtual {v0, v1, v2, v3}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public a(I)V
    .locals 2

    .line 35
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/v1;->b()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 36
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/v1;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/v1;->a(Landroid/content/Context;I)Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

    move-result-object p1

    .line 37
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/v1;->a(Lcom/tencent/bugly/crashreport/biz/UserInfoBean;)V

    .line 38
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object v0

    new-instance v1, Lcom/tencent/bugly/proguard/v1$a;

    invoke-direct {v1, p0, p1}, Lcom/tencent/bugly/proguard/v1$a;-><init>(Lcom/tencent/bugly/proguard/v1;Lcom/tencent/bugly/crashreport/biz/UserInfoBean;)V

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public a(IZJ)V
    .locals 3

    .line 29
    invoke-static {}, Lcom/tencent/bugly/proguard/pg;->b()Lcom/tencent/bugly/proguard/pg;

    move-result-object v0

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 30
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/pg;->c()Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    move-result-object v0

    iget-boolean v0, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->e:Z

    if-nez v0, :cond_0

    if-eq p1, v2, :cond_0

    if-eq p1, v1, :cond_0

    const/4 p1, 0x0

    .line 31
    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "UserInfo is disable"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :cond_0
    if-eq p1, v2, :cond_1

    if-ne p1, v1, :cond_2

    .line 32
    :cond_1
    iget v0, p0, Lcom/tencent/bugly/proguard/v1;->d:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/tencent/bugly/proguard/v1;->d:I

    .line 33
    :cond_2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/v1;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/v1;->a(Landroid/content/Context;I)Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

    move-result-object p1

    .line 34
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object v0

    new-instance v1, Lcom/tencent/bugly/proguard/v1$d;

    invoke-direct {v1, p0, p1, p2}, Lcom/tencent/bugly/proguard/v1$d;-><init>(Lcom/tencent/bugly/proguard/v1;Lcom/tencent/bugly/crashreport/biz/UserInfoBean;Z)V

    invoke-virtual {v0, v1, p3, p4}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public a(J)V
    .locals 4

    .line 39
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object v0

    new-instance v1, Lcom/tencent/bugly/proguard/v1$d;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, p0, v2, v3}, Lcom/tencent/bugly/proguard/v1$d;-><init>(Lcom/tencent/bugly/proguard/v1;Lcom/tencent/bugly/crashreport/biz/UserInfoBean;Z)V

    invoke-virtual {v0, v1, p1, p2}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final a(Lcom/tencent/bugly/crashreport/biz/UserInfoBean;)V
    .locals 1

    if-nez p1, :cond_0

    goto :goto_0

    .line 44
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    .line 45
    :cond_1
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->B()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->k:Ljava/lang/String;

    return-void
.end method

.method public final a(Lcom/tencent/bugly/crashreport/biz/UserInfoBean;Z)V
    .locals 6

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-nez p2, :cond_1

    .line 126
    iget p2, p1, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->c:I

    if-eq p2, v0, :cond_1

    .line 127
    iget-object p2, p0, Lcom/tencent/bugly/proguard/v1;->b:Landroid/content/Context;

    invoke-static {p2}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p2

    .line 128
    iget-object p2, p2, Lcom/tencent/bugly/proguard/l2;->f:Ljava/lang/String;

    .line 129
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/v1;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 130
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/16 v2, 0x14

    if-lt v1, v2, :cond_1

    .line 131
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "[UserInfo] There are too many user info in local: %d"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 132
    :cond_1
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/v1;->b(Lcom/tencent/bugly/crashreport/biz/UserInfoBean;)Landroid/content/ContentValues;

    move-result-object p2

    .line 133
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    move-result-object v1

    const/4 v2, 0x0

    const-string/jumbo v3, "t_ui"

    invoke-virtual {v1, v3, p2, v2, v0}, Lcom/tencent/bugly/proguard/e4;->a(Ljava/lang/String;Landroid/content/ContentValues;Lcom/tencent/bugly/proguard/d4;Z)J

    move-result-wide v0

    const-wide/16 v4, 0x0

    cmp-long p2, v0, v4

    if-ltz p2, :cond_2

    .line 134
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    filled-new-array {v3, p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string v2, "[Database] insert %s success with ID: %d"

    invoke-static {v2, p2}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 135
    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->b:J

    :cond_2
    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;Z)V
    .locals 2

    .line 46
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    move-result-object v0

    const-string v1, "bugly_session_id"

    invoke-static {v0, v1, p1}, Lcom/tencent/bugly/proguard/n3;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 47
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    :goto_0
    if-eqz p2, :cond_0

    const/16 p1, 0x9

    .line 48
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/v1;->a(I)V

    :cond_0
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/crashreport/biz/UserInfoBean;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_3

    .line 160
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 161
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    .line 162
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    const/16 v3, 0x32

    if-ge v2, v3, :cond_1

    .line 163
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

    .line 164
    const-string v4, " or _id = "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, v3, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->b:J

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 165
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 166
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_2

    const/4 v2, 0x4

    .line 167
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :cond_2
    move-object v4, p1

    .line 168
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 169
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    move-result-object v2

    const-string/jumbo v3, "t_ui"

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v5, 0x0

    invoke-virtual/range {v2 .. v7}, Lcom/tencent/bugly/proguard/e4;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tencent/bugly/proguard/d4;Z)I

    move-result p1

    .line 170
    const-string v0, "[Database] deleted %s data %d"

    const-string/jumbo v1, "t_ui"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v1, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    .line 171
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 172
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3
    :goto_1
    return-void
.end method

.method public a(Ljava/util/List;Z)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/crashreport/biz/UserInfoBean;",
            ">;Z)V"
        }
    .end annotation

    .line 90
    invoke-static {}, Lcom/tencent/bugly/proguard/m7;->g()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 91
    new-array p1, v1, [Ljava/lang/Object;

    const-string/jumbo p2, "upload user info fail for app in standalone mode."

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 92
    :cond_0
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/v1;->b(Z)Z

    move-result p2

    const/4 v0, 0x1

    if-nez p2, :cond_2

    .line 93
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 94
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

    .line 95
    iput-wide v2, p2, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->g:J

    .line 96
    invoke-virtual {p0, p2, v0}, Lcom/tencent/bugly/proguard/v1;->a(Lcom/tencent/bugly/crashreport/biz/UserInfoBean;Z)V

    goto :goto_0

    .line 97
    :cond_1
    new-array p1, v1, [Ljava/lang/Object;

    const-string/jumbo p2, "uploadCheck failed"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 98
    :cond_2
    invoke-static {}, Lcom/tencent/bugly/proguard/hg;->c()Lcom/tencent/bugly/proguard/hg;

    move-result-object p2

    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/hg;->a()V

    .line 99
    iget p2, p0, Lcom/tencent/bugly/proguard/v1;->d:I

    const/4 v2, 0x2

    if-ne p2, v0, :cond_3

    move p2, v0

    goto :goto_1

    :cond_3
    move p2, v2

    .line 100
    :goto_1
    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/ue;->a(Ljava/util/List;I)Lcom/tencent/bugly/proguard/wh;

    move-result-object p2

    if-nez p2, :cond_4

    .line 101
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "[UserInfo] Failed to create UserInfoPackage."

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 102
    :cond_4
    invoke-static {p2}, Lcom/tencent/bugly/proguard/ue;->a(Lcom/tencent/bugly/proguard/JceStruct;)[B

    move-result-object v3

    if-nez v3, :cond_5

    .line 103
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "[UserInfo] Failed to encode data."

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 104
    :cond_5
    iget-object v4, p0, Lcom/tencent/bugly/proguard/v1;->b:Landroid/content/Context;

    const/16 v5, 0x348

    invoke-static {v4, v5, v0, v3}, Lcom/tencent/bugly/proguard/ue;->a(Landroid/content/Context;IZ[B)Lcom/tencent/bugly/proguard/tf;

    move-result-object v3

    if-nez v3, :cond_6

    .line 105
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "[UserInfo] Request package is null."

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 106
    :cond_6
    new-instance v5, Lcom/tencent/bugly/proguard/v1$b;

    invoke-direct {v5, p0, p1}, Lcom/tencent/bugly/proguard/v1$b;-><init>(Lcom/tencent/bugly/proguard/v1;Ljava/util/List;)V

    .line 107
    invoke-static {}, Lcom/tencent/bugly/proguard/pg;->b()Lcom/tencent/bugly/proguard/pg;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/pg;->c()Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    move-result-object p1

    .line 108
    iget-object p1, p1, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->o:Ljava/lang/String;

    .line 109
    sget-object v4, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->w:Ljava/lang/String;

    .line 110
    iget-object v6, p0, Lcom/tencent/bugly/proguard/v1;->b:Landroid/content/Context;

    invoke-static {v6}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v6

    .line 111
    invoke-virtual {v6}, Lcom/tencent/bugly/proguard/l2;->P()Z

    move-result v7

    if-eqz v7, :cond_8

    .line 112
    new-array p1, v1, [Ljava/lang/Object;

    const-string/jumbo v2, "user info with new protoc"

    invoke-static {v2, p1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 113
    invoke-virtual {p0, v3, p2}, Lcom/tencent/bugly/proguard/v1;->b(Lcom/tencent/bugly/proguard/tf;Lcom/tencent/bugly/proguard/wh;)Lorg/json/JSONObject;

    move-result-object p1

    move p2, v0

    .line 114
    invoke-static {}, Lcom/tencent/bugly/proguard/rh;->d()Lcom/tencent/bugly/proguard/rh;

    move-result-object v0

    .line 115
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    invoke-static {}, Lcom/tencent/bugly/proguard/d2;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/v1/"

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    invoke-virtual {v6}, Lcom/tencent/bugly/proguard/l2;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "/upload-json"

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 118
    sget-object v8, Lcom/tencent/bugly/proguard/d2;->p:Ljava/lang/String;

    .line 119
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    invoke-virtual {v6}, Lcom/tencent/bugly/proguard/l2;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget v3, p0, Lcom/tencent/bugly/proguard/v1;->d:I

    if-ne v3, p2, :cond_7

    move v6, p2

    goto :goto_2

    :cond_7
    move v6, v1

    :goto_2
    const/4 v7, 0x1

    const/16 v1, 0x3e9

    move-object v3, p1

    .line 121
    invoke-virtual/range {v0 .. v7}, Lcom/tencent/bugly/proguard/rh;->a(I[BLjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/qh;ZZ)V

    return-void

    :cond_8
    move p2, v0

    .line 122
    new-array v0, v1, [Ljava/lang/Object;

    const-string/jumbo v6, "user info with old protoc"

    invoke-static {v6, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 123
    invoke-static {}, Lcom/tencent/bugly/proguard/rh;->d()Lcom/tencent/bugly/proguard/rh;

    move-result-object v0

    .line 124
    invoke-static {v3}, Lcom/tencent/bugly/proguard/ue;->a(Ljava/lang/Object;)[B

    move-result-object v3

    invoke-static {v3, v2}, Lcom/tencent/bugly/proguard/bi;->b([BI)[B

    move-result-object v2

    iget v3, p0, Lcom/tencent/bugly/proguard/v1;->d:I

    if-ne v3, p2, :cond_9

    move v6, p2

    goto :goto_3

    :cond_9
    move v6, v1

    :goto_3
    const/4 v7, 0x0

    const/16 v1, 0x3e9

    move-object v3, p1

    .line 125
    invoke-virtual/range {v0 .. v7}, Lcom/tencent/bugly/proguard/rh;->a(I[BLjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/qh;ZZ)V

    return-void
.end method

.method public final a(JJ)Z
    .locals 1

    .line 1
    cmp-long v0, p1, p3

    if-ltz v0, :cond_1

    sub-long/2addr p1, p3

    const-wide/32 p3, 0x5265c00

    cmp-long p1, p1, p3

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public b(Lcom/tencent/bugly/crashreport/biz/UserInfoBean;)Landroid/content/ContentValues;
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 59
    :cond_0
    :try_start_0
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 60
    iget-wide v2, p1, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->b:J

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-lez v4, :cond_1

    .line 61
    const-string v4, "_id"

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 62
    :cond_1
    :goto_0
    const-string v2, "_tm"

    iget-wide v3, p1, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->f:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 63
    const-string v2, "_ut"

    iget-wide v3, p1, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->g:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 64
    const-string v2, "_tp"

    iget v3, p1, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->c:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 65
    const-string v2, "_pc"

    iget-object v3, p1, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->d:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    const-string v2, "_dt"

    invoke-static {p1}, Lcom/tencent/bugly/proguard/bi;->a(Landroid/os/Parcelable;)[B

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    .line 67
    :goto_1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 68
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    return-object v0
.end method

.method public b(Lcom/tencent/bugly/proguard/tf;Lcom/tencent/bugly/proguard/wh;)Lorg/json/JSONObject;
    .locals 5

    .line 39
    iget-object v0, p0, Lcom/tencent/bugly/proguard/v1;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    .line 40
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 41
    :try_start_0
    new-instance v2, Lcom/tencent/bugly/common/meta/UserMeta;

    invoke-direct {v2}, Lcom/tencent/bugly/common/meta/UserMeta;-><init>()V

    .line 42
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->F()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/tencent/bugly/common/meta/UserMeta;->uin:Ljava/lang/String;

    .line 43
    iget-object v3, v0, Lcom/tencent/bugly/proguard/l2;->g0:Ljava/lang/String;

    iput-object v3, v2, Lcom/tencent/bugly/common/meta/UserMeta;->buildNumber:Ljava/lang/String;

    .line 44
    const-string/jumbo v3, "unknow_app_key"

    iput-object v3, v2, Lcom/tencent/bugly/common/meta/UserMeta;->appKey:Ljava/lang/String;

    .line 45
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->e()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/tencent/bugly/common/meta/UserMeta;->appId:Ljava/lang/String;

    .line 46
    iget-object v3, v0, Lcom/tencent/bugly/proguard/l2;->F:Ljava/lang/String;

    iput-object v3, v2, Lcom/tencent/bugly/common/meta/UserMeta;->appVersion:Ljava/lang/String;

    .line 47
    iget-object v3, v0, Lcom/tencent/bugly/proguard/l2;->k:Ljava/lang/String;

    iput-object v3, v2, Lcom/tencent/bugly/common/meta/UserMeta;->sdkVersion:Ljava/lang/String;

    .line 48
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->o()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/tencent/bugly/common/meta/UserMeta;->setModel(Ljava/lang/String;)V

    .line 49
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/tencent/bugly/common/meta/UserMeta;->setUniqueID(Ljava/lang/String;)V

    .line 50
    invoke-static {}, Lcom/tencent/bugly/proguard/m7;->e()Lcom/tencent/bugly/common/meta/UserMeta;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/common/meta/UserMeta;->getAppVersionMode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/tencent/bugly/common/meta/UserMeta;->setAppVersionMode(Ljava/lang/String;)V

    .line 51
    iget-object v0, p0, Lcom/tencent/bugly/proguard/v1;->b:Landroid/content/Context;

    const-string/jumbo v3, "metric"

    const-string/jumbo v4, "union_dau"

    invoke-static {v0, v3, v4, v2}, Lcom/tencent/bugly/proguard/nf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/common/meta/UserMeta;)Lorg/json/JSONObject;

    move-result-object v1

    .line 52
    const-string/jumbo v0, "protocol_version"

    const/4 v2, 0x3

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 53
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/v1;->a(Lcom/tencent/bugly/proguard/tf;Lcom/tencent/bugly/proguard/wh;)Lorg/json/JSONObject;

    move-result-object p1

    .line 54
    const-string p2, "Attributes"

    invoke-virtual {v1, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 55
    const-string p2, "[UserInfo] client_identify: %s, session_id: %s"

    const-string v0, "client_identify"

    .line 56
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v2, "session_id"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 57
    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :catchall_0
    move-exception p1

    .line 58
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    return-object v1
.end method

.method public b(I)V
    .locals 0

    .line 69
    iput p1, p0, Lcom/tencent/bugly/proguard/v1;->d:I

    return-void
.end method

.method public b(J)V
    .locals 2

    .line 26
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object v0

    new-instance v1, Lcom/tencent/bugly/proguard/v1$f;

    invoke-direct {v1, p0, p1, p2}, Lcom/tencent/bugly/proguard/v1$f;-><init>(Lcom/tencent/bugly/proguard/v1;J)V

    invoke-virtual {v0, v1, p1, p2}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final b()Z
    .locals 3

    .line 27
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/v1;->e:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 28
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/rh;->d()Lcom/tencent/bugly/proguard/rh;

    move-result-object v0

    if-nez v0, :cond_1

    return v1

    .line 29
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/proguard/pg;->b()Lcom/tencent/bugly/proguard/pg;

    move-result-object v2

    if-nez v2, :cond_2

    return v1

    .line 30
    :cond_2
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/pg;->d()Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x3e9

    .line 31
    invoke-virtual {v0, v2}, Lcom/tencent/bugly/proguard/rh;->a(I)Z

    move-result v0

    if-nez v0, :cond_3

    return v1

    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public final b(Z)Z
    .locals 11

    .line 1
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    move-result-object v0

    .line 2
    const-string/jumbo v1, "userinfo_report"

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/b;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    instance-of v2, v0, Lcom/tencent/bugly/proguard/zh;

    if-eqz v2, :cond_0

    check-cast v0, Lcom/tencent/bugly/proguard/zh;

    .line 4
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/zh;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    new-array p1, v1, [Ljava/lang/Object;

    const-string/jumbo v0, "userinfo upload is disabled by remote"

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v1

    .line 6
    :cond_0
    sget-boolean v0, Lcom/tencent/bugly/proguard/v1;->k:Z

    const/4 v2, 0x1

    if-nez v0, :cond_1

    return v2

    :cond_1
    if-eqz p1, :cond_2

    return v2

    .line 7
    :cond_2
    new-instance p1, Ljava/io/File;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/v1;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    const-string v3, "bugly_last_us_up_tm"

    invoke-direct {p1, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 9
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    const-wide/16 v5, 0x400

    if-nez v0, :cond_3

    .line 10
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v5, v6, v1}, Lcom/tencent/bugly/proguard/a7;->a(Ljava/io/File;Ljava/lang/String;JZ)Z

    goto :goto_5

    .line 11
    :cond_3
    invoke-static {p1}, Lcom/tencent/bugly/proguard/bi;->a(Ljava/io/File;)Ljava/io/BufferedReader;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 12
    :try_start_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    .line 13
    invoke-static {v7}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    .line 14
    invoke-virtual {p0, v3, v4, v7, v8}, Lcom/tencent/bugly/proguard/v1;->a(JJ)Z

    move-result v9

    if-eqz v9, :cond_4

    sub-long v7, v3, v7

    iget-wide v9, p0, Lcom/tencent/bugly/proguard/v1;->a:J

    cmp-long v7, v7, v9

    if-gez v7, :cond_4

    goto :goto_3

    :catchall_0
    move-exception v7

    goto :goto_0

    .line 15
    :cond_4
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    invoke-static {p1, v7, v5, v6, v1}, Lcom/tencent/bugly/proguard/a7;->a(Ljava/io/File;Ljava/lang/String;JZ)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    .line 16
    :goto_0
    :try_start_1
    invoke-static {v7}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    .line 17
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3, v5, v6, v1}, Lcom/tencent/bugly/proguard/a7;->a(Ljava/io/File;Ljava/lang/String;JZ)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 18
    :try_start_2
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_5

    :catch_0
    move-exception p1

    .line 19
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/Throwable;)Z

    goto :goto_5

    :catchall_1
    move-exception p1

    .line 20
    :try_start_3
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    .line 21
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/Throwable;)Z

    .line 22
    :goto_1
    throw p1

    :cond_5
    :goto_2
    move v1, v2

    :goto_3
    if-eqz v0, :cond_6

    .line 23
    :try_start_4
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_4

    :catch_2
    move-exception p1

    .line 24
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    :cond_6
    :goto_4
    move v2, v1

    :goto_5
    return v2
.end method

.method public c(J)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, v0, p1

    if-gez v0, :cond_0

    const-wide/32 v0, 0x240c8400

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    .line 2
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/v1;->a:J

    .line 3
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    const-string/jumbo p2, "userInfoMinInterval"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public c(Z)V
    .locals 2

    .line 4
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    new-instance v1, Lcom/tencent/bugly/proguard/v1$c;

    invoke-direct {v1, p0, p1}, Lcom/tencent/bugly/proguard/v1$c;-><init>(Lcom/tencent/bugly/proguard/v1;Z)V

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final declared-synchronized d(Z)V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/v1;->b()Z

    .line 5
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/v1;->b:Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    iget-object v0, v0, Lcom/tencent/bugly/proguard/l2;->f:Ljava/lang/String;

    .line 18
    .line 19
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/v1;->a(Ljava/lang/String;)Ljava/util/List;

    .line 26
    move-result-object v0

    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x1

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/v1;->a(Ljava/util/List;Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/v1;->b(Ljava/util/List;Ljava/util/List;)V

    .line 37
    .line 38
    .line 39
    const-wide/32 v4, 0x927c0

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v4, v5}, Lcom/tencent/bugly/proguard/v1;->a(Ljava/util/List;J)I

    .line 43
    move-result v4

    .line 44
    .line 45
    const/16 v5, 0xf

    .line 46
    .line 47
    if-le v4, v5, :cond_2

    .line 48
    .line 49
    .line 50
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    move-result-object v3

    .line 52
    .line 53
    .line 54
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 55
    move-result-object v3

    .line 56
    .line 57
    const-string v4, "[UserInfo] Upload user info too many times in 10 min: %d"

    .line 58
    .line 59
    .line 60
    invoke-static {v4, v3}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 61
    move v3, v2

    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    goto :goto_2

    .line 65
    .line 66
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 67
    .line 68
    .line 69
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    :cond_2
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 73
    move-result v4

    .line 74
    .line 75
    if-lez v4, :cond_3

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/v1;->a(Ljava/util/List;)V

    .line 79
    .line 80
    :cond_3
    if-eqz v3, :cond_5

    .line 81
    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 84
    move-result v1

    .line 85
    .line 86
    if-nez v1, :cond_4

    .line 87
    goto :goto_1

    .line 88
    .line 89
    .line 90
    :cond_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 91
    move-result v1

    .line 92
    .line 93
    .line 94
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    move-result-object v1

    .line 96
    .line 97
    .line 98
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 99
    move-result-object v1

    .line 100
    .line 101
    const-string v2, "[UserInfo] Upload user info(size: %d)"

    .line 102
    .line 103
    .line 104
    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/proguard/v1;->a(Ljava/util/List;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    monitor-exit p0

    .line 109
    return-void

    .line 110
    .line 111
    :cond_5
    :goto_1
    :try_start_2
    new-array p1, v2, [Ljava/lang/Object;

    .line 112
    .line 113
    const-string v0, "[UserInfo] There is no user info in local database."

    .line 114
    .line 115
    .line 116
    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 117
    monitor-exit p0

    .line 118
    return-void

    .line 119
    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 120
    throw p1
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
