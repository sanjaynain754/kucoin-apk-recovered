.class public final Lcom/tencent/bugly/proguard/pi$c;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/pi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:Ljava/lang/String;

.field public c:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lcom/tencent/bugly/proguard/pi$f;

.field public e:Lcom/tencent/bugly/proguard/pi$e;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:Lcom/tencent/bugly/proguard/pi$h;

.field public l:J

.field public m:Z

.field public n:Z

.field public o:Ljava/lang/String;

.field public p:Z

.field public final q:Lcom/tencent/bugly/proguard/pi;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/tencent/bugly/proguard/pi;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashSet;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/pi$c;->c:Ljava/util/HashSet;

    .line 11
    .line 12
    sget-object v1, Lcom/tencent/bugly/proguard/pi$f;->d:Lcom/tencent/bugly/proguard/pi$f;

    .line 13
    .line 14
    iput-object v1, p0, Lcom/tencent/bugly/proguard/pi$c;->d:Lcom/tencent/bugly/proguard/pi$f;

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    iput-object v1, p0, Lcom/tencent/bugly/proguard/pi$c;->e:Lcom/tencent/bugly/proguard/pi$e;

    .line 18
    const/4 v2, 0x0

    .line 19
    .line 20
    iput-boolean v2, p0, Lcom/tencent/bugly/proguard/pi$c;->f:Z

    .line 21
    .line 22
    iput-boolean v2, p0, Lcom/tencent/bugly/proguard/pi$c;->g:Z

    .line 23
    const/4 v3, 0x1

    .line 24
    .line 25
    iput-boolean v3, p0, Lcom/tencent/bugly/proguard/pi$c;->h:Z

    .line 26
    .line 27
    iput-boolean v2, p0, Lcom/tencent/bugly/proguard/pi$c;->i:Z

    .line 28
    .line 29
    iput-boolean v3, p0, Lcom/tencent/bugly/proguard/pi$c;->j:Z

    .line 30
    .line 31
    sget-object v3, Lcom/tencent/bugly/proguard/pi$h;->b:Lcom/tencent/bugly/proguard/pi$h;

    .line 32
    .line 33
    iput-object v3, p0, Lcom/tencent/bugly/proguard/pi$c;->k:Lcom/tencent/bugly/proguard/pi$h;

    .line 34
    .line 35
    const-wide/16 v3, 0xbb8

    .line 36
    .line 37
    iput-wide v3, p0, Lcom/tencent/bugly/proguard/pi$c;->l:J

    .line 38
    .line 39
    iput-boolean v2, p0, Lcom/tencent/bugly/proguard/pi$c;->m:Z

    .line 40
    .line 41
    iput-boolean v2, p0, Lcom/tencent/bugly/proguard/pi$c;->n:Z

    .line 42
    .line 43
    iput-object v1, p0, Lcom/tencent/bugly/proguard/pi$c;->o:Ljava/lang/String;

    .line 44
    .line 45
    iput-boolean v2, p0, Lcom/tencent/bugly/proguard/pi$c;->p:Z

    .line 46
    .line 47
    iput-object p1, p0, Lcom/tencent/bugly/proguard/pi$c;->a:Landroid/content/Context;

    .line 48
    .line 49
    iput-object p2, p0, Lcom/tencent/bugly/proguard/pi$c;->q:Lcom/tencent/bugly/proguard/pi;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 53
    move-result-object p2

    .line 54
    .line 55
    iget-object p2, p2, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    iget-object p2, p0, Lcom/tencent/bugly/proguard/pi$c;->c:Ljava/util/HashSet;

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lcom/tencent/bugly/proguard/pi;->d()Ljava/lang/String;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    iget-object p2, p0, Lcom/tencent/bugly/proguard/pi$c;->c:Ljava/util/HashSet;

    .line 70
    .line 71
    .line 72
    invoke-static {}, Lcom/tencent/bugly/proguard/pi;->c()Ljava/lang/String;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    iget-object p2, p0, Lcom/tencent/bugly/proguard/pi$c;->c:Ljava/util/HashSet;

    .line 79
    .line 80
    .line 81
    invoke-static {p1}, Lcom/tencent/bugly/proguard/pi;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    iget-object p1, p0, Lcom/tencent/bugly/proguard/pi$c;->c:Ljava/util/HashSet;

    .line 88
    .line 89
    new-instance p2, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-static {}, Lcom/tencent/bugly/proguard/pi;->b()Ljava/lang/String;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    const-string v0, "boot.oat"

    .line 102
    .line 103
    .line 104
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    move-result-object p2

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    iget-object p1, p0, Lcom/tencent/bugly/proguard/pi$c;->c:Ljava/util/HashSet;

    .line 114
    .line 115
    new-instance p2, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-static {}, Lcom/tencent/bugly/proguard/pi;->b()Ljava/lang/String;

    .line 122
    move-result-object v0

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    const-string v0, "boot-framework.oat"

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    move-result-object p2

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    iget-object p1, p0, Lcom/tencent/bugly/proguard/pi$c;->a:Landroid/content/Context;

    .line 140
    .line 141
    .line 142
    invoke-static {p1}, Lcom/tencent/bugly/common/utils/ProcessUtil;->isMainProcess(Landroid/content/Context;)Z

    .line 143
    move-result p1

    .line 144
    .line 145
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/pi$c;->i:Z

    .line 146
    return-void
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


# virtual methods
.method public a()Lcom/tencent/bugly/proguard/pi$c;
    .locals 1

    .line 7
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/pi$c;->p:Z

    if-eqz v0, :cond_0

    return-object p0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pi$c;->c:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    return-object p0
.end method

.method public a(Lcom/tencent/bugly/proguard/pi$e;)Lcom/tencent/bugly/proguard/pi$c;
    .locals 1

    .line 3
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/pi$c;->p:Z

    if-eqz v0, :cond_0

    return-object p0

    .line 4
    :cond_0
    iput-object p1, p0, Lcom/tencent/bugly/proguard/pi$c;->e:Lcom/tencent/bugly/proguard/pi$e;

    return-object p0
.end method

.method public a(Lcom/tencent/bugly/proguard/pi$f;)Lcom/tencent/bugly/proguard/pi$c;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/pi$c;->p:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/pi$c;->d:Lcom/tencent/bugly/proguard/pi$f;

    :cond_1
    :goto_0
    return-object p0
.end method

.method public a(Lcom/tencent/bugly/proguard/pi$h;J)Lcom/tencent/bugly/proguard/pi$c;
    .locals 1

    .line 11
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/pi$c;->p:Z

    if-eqz v0, :cond_0

    return-object p0

    .line 12
    :cond_0
    iput-object p1, p0, Lcom/tencent/bugly/proguard/pi$c;->k:Lcom/tencent/bugly/proguard/pi$h;

    .line 13
    iput-wide p2, p0, Lcom/tencent/bugly/proguard/pi$c;->l:J

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/pi$c;
    .locals 1

    .line 5
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/pi$c;->p:Z

    if-eqz v0, :cond_0

    return-object p0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pi$c;->c:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public a(Z)Lcom/tencent/bugly/proguard/pi$c;
    .locals 1

    .line 9
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/pi$c;->p:Z

    if-eqz v0, :cond_0

    return-object p0

    .line 10
    :cond_0
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/pi$c;->f:Z

    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/pi$c;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/pi$c;->p:Z

    if-eqz v0, :cond_0

    return-object p0

    .line 2
    :cond_0
    iput-object p1, p0, Lcom/tencent/bugly/proguard/pi$c;->b:Ljava/lang/String;

    return-object p0
.end method

.method public b(Z)Lcom/tencent/bugly/proguard/pi$c;
    .locals 1

    .line 3
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/pi$c;->p:Z

    if-eqz v0, :cond_0

    return-object p0

    .line 4
    :cond_0
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/pi$c;->h:Z

    return-object p0
.end method

.method public b()V
    .locals 1

    .line 5
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/pi$c;->p:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/pi$c;->p:Z

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pi$c;->q:Lcom/tencent/bugly/proguard/pi;

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/pi;->a(Lcom/tencent/bugly/proguard/pi;Lcom/tencent/bugly/proguard/pi$c;)V

    return-void
.end method

.method public c()Lcom/tencent/bugly/proguard/pi$c;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/pi$c;->p:Z

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/pi$c;->g:Z

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/tencent/bugly/proguard/pi$c;
    .locals 1

    .line 3
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/pi$c;->p:Z

    if-eqz v0, :cond_0

    return-object p0

    .line 4
    :cond_0
    iput-object p1, p0, Lcom/tencent/bugly/proguard/pi$c;->o:Ljava/lang/String;

    return-object p0
.end method

.method public c(Z)Lcom/tencent/bugly/proguard/pi$c;
    .locals 1

    .line 5
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/pi$c;->p:Z

    if-eqz v0, :cond_0

    return-object p0

    .line 6
    :cond_0
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/pi$c;->n:Z

    return-object p0
.end method

.method public d(Z)Lcom/tencent/bugly/proguard/pi$c;
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/pi$c;->p:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-object p0

    .line 6
    .line 7
    :cond_0
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/pi$c;->m:Z

    .line 8
    return-object p0
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

.method public e(Z)Lcom/tencent/bugly/proguard/pi$c;
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/pi$c;->p:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-object p0

    .line 6
    .line 7
    :cond_0
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/pi$c;->i:Z

    .line 8
    return-object p0
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

.method public f(Z)Lcom/tencent/bugly/proguard/pi$c;
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/pi$c;->p:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-object p0

    .line 6
    .line 7
    :cond_0
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/pi$c;->j:Z

    .line 8
    return-object p0
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

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "\nWeChat backtrace configurations: \n>>> Backtrace Mode: "

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v1, p0, Lcom/tencent/bugly/proguard/pi$c;->d:Lcom/tencent/bugly/proguard/pi$f;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, "\n>>> Quicken always on: "

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    iget-boolean v1, p0, Lcom/tencent/bugly/proguard/pi$c;->g:Z

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, "\n>>> Saving Path: "

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/tencent/bugly/proguard/pi$c;->b:Ljava/lang/String;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    goto :goto_0

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-static {p0}, Lcom/tencent/bugly/proguard/oi;->a(Lcom/tencent/bugly/proguard/pi$c;)Ljava/lang/String;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v1, "\n>>> Custom Library Loader: "

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    iget-object v1, p0, Lcom/tencent/bugly/proguard/pi$c;->e:Lcom/tencent/bugly/proguard/pi$e;

    .line 47
    .line 48
    if-eqz v1, :cond_1

    .line 49
    const/4 v1, 0x1

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/4 v1, 0x0

    .line 52
    .line 53
    .line 54
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v1, "\n>>> Directories to Warm-up: "

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    iget-object v1, p0, Lcom/tencent/bugly/proguard/pi$c;->c:Ljava/util/HashSet;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 65
    move-result-object v1

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v1, "\n>>> Is Warm-up Process: "

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    iget-boolean v1, p0, Lcom/tencent/bugly/proguard/pi$c;->i:Z

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    const-string v1, "\n>>> Warm-up Timing: "

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    iget-object v1, p0, Lcom/tencent/bugly/proguard/pi$c;->k:Lcom/tencent/bugly/proguard/pi$h;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v1, "\n>>> Warm-up Delay: "

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/pi$c;->l:J

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string/jumbo v1, "ms\n>>> Warm-up in isolate process: "

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    iget-boolean v1, p0, Lcom/tencent/bugly/proguard/pi$c;->j:Z

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    const-string v1, "\n>>> Enable logger: "

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    iget-boolean v1, p0, Lcom/tencent/bugly/proguard/pi$c;->m:Z

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    const-string v1, "\n>>> Enable Isolate Process logger: "

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    iget-boolean v1, p0, Lcom/tencent/bugly/proguard/pi$c;->n:Z

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    const-string v1, "\n>>> Path of XLog: "

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    iget-object v1, p0, Lcom/tencent/bugly/proguard/pi$c;->o:Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    const-string v1, "\n>>> Cool-down: "

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    iget-boolean v1, p0, Lcom/tencent/bugly/proguard/pi$c;->f:Z

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    const-string v1, "\n>>> Cool-down if Apk Updated: "

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    iget-boolean v1, p0, Lcom/tencent/bugly/proguard/pi$c;->h:Z

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    const-string v1, "\n"

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    move-result-object v0

    .line 169
    return-object v0
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method
