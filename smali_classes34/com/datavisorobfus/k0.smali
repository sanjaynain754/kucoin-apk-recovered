.class public Lcom/datavisorobfus/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/datavisorobfus/c0;

.field private static b:Lcom/datavisorobfus/c0;


# direct methods
.method public static a(Landroid/content/Context;)Lcom/datavisorobfus/c0;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/datavisorobfus/k0;->a:Lcom/datavisorobfus/c0;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-object v0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-static {p0}, Lcom/datavisorobfus/k0;->d(Landroid/content/Context;)Lcom/datavisorobfus/c0;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    sput-object p0, Lcom/datavisorobfus/k0;->a:Lcom/datavisorobfus/c0;

    .line 12
    return-object p0
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
.end method

.method public static b(Landroid/content/Context;)Lcom/datavisorobfus/c0;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/datavisorobfus/k0;->b:Lcom/datavisorobfus/c0;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-object v0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-static {p0}, Lcom/datavisorobfus/k0;->c(Landroid/content/Context;)Lcom/datavisorobfus/c0;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    sput-object p0, Lcom/datavisorobfus/k0;->b:Lcom/datavisorobfus/c0;

    .line 12
    return-object p0
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
.end method

.method private static c(Landroid/content/Context;)Lcom/datavisorobfus/c0;
    .locals 1

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Lcom/datavisorobfus/w;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/datavisorobfus/w;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Lcom/datavisorobfus/c0;->a()Z

    .line 9
    move-result p0

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    return-object v0

    .line 13
    .line 14
    :cond_0
    new-instance p0, Lcom/datavisorobfus/q;

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lcom/datavisorobfus/q;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    return-object p0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    new-instance p0, Lcom/datavisorobfus/q;

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Lcom/datavisorobfus/q;-><init>()V

    .line 28
    return-object p0
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
.end method

.method private static d(Landroid/content/Context;)Lcom/datavisorobfus/c0;
    .locals 1

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lcom/datavisorobfus/l0;->j()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_c

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/datavisorobfus/l0;->k()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_3

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {}, Lcom/datavisorobfus/l0;->d()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-nez v0, :cond_b

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/datavisorobfus/l0;->c()Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    goto/16 :goto_2

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-static {}, Lcom/datavisorobfus/l0;->l()Z

    .line 32
    move-result v0

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    new-instance v0, Lcom/datavisorobfus/v0;

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, p0}, Lcom/datavisorobfus/v0;-><init>(Landroid/content/Context;)V

    .line 40
    .line 41
    goto/16 :goto_4

    .line 42
    .line 43
    .line 44
    :cond_2
    invoke-static {}, Lcom/datavisorobfus/l0;->m()Z

    .line 45
    move-result v0

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    new-instance v0, Lcom/datavisorobfus/a1;

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, p0}, Lcom/datavisorobfus/a1;-><init>(Landroid/content/Context;)V

    .line 53
    goto :goto_4

    .line 54
    .line 55
    .line 56
    :cond_3
    invoke-static {}, Lcom/datavisorobfus/l0;->n()Z

    .line 57
    move-result v0

    .line 58
    .line 59
    if-nez v0, :cond_a

    .line 60
    .line 61
    .line 62
    invoke-static {}, Lcom/datavisorobfus/l0;->g()Z

    .line 63
    move-result v0

    .line 64
    .line 65
    if-nez v0, :cond_a

    .line 66
    .line 67
    .line 68
    invoke-static {}, Lcom/datavisorobfus/l0;->b()Z

    .line 69
    move-result v0

    .line 70
    .line 71
    if-eqz v0, :cond_4

    .line 72
    goto :goto_1

    .line 73
    .line 74
    .line 75
    :cond_4
    invoke-static {}, Lcom/datavisorobfus/l0;->f()Z

    .line 76
    move-result v0

    .line 77
    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    new-instance v0, Lcom/datavisorobfus/g0;

    .line 81
    .line 82
    .line 83
    invoke-direct {v0, p0}, Lcom/datavisorobfus/g0;-><init>(Landroid/content/Context;)V

    .line 84
    goto :goto_4

    .line 85
    .line 86
    .line 87
    :cond_5
    invoke-static {}, Lcom/datavisorobfus/l0;->i()Z

    .line 88
    move-result v0

    .line 89
    .line 90
    if-eqz v0, :cond_6

    .line 91
    .line 92
    new-instance v0, Lcom/datavisorobfus/j0;

    .line 93
    .line 94
    .line 95
    invoke-direct {v0, p0}, Lcom/datavisorobfus/j0;-><init>(Landroid/content/Context;)V

    .line 96
    goto :goto_4

    .line 97
    .line 98
    .line 99
    :cond_6
    invoke-static {}, Lcom/datavisorobfus/l0;->e()Z

    .line 100
    move-result v0

    .line 101
    .line 102
    if-nez v0, :cond_9

    .line 103
    .line 104
    .line 105
    invoke-static {}, Lcom/datavisorobfus/l0;->h()Z

    .line 106
    move-result v0

    .line 107
    .line 108
    if-eqz v0, :cond_7

    .line 109
    goto :goto_0

    .line 110
    .line 111
    .line 112
    :cond_7
    invoke-static {}, Lcom/datavisorobfus/l0;->a()Z

    .line 113
    move-result v0

    .line 114
    .line 115
    if-eqz v0, :cond_8

    .line 116
    .line 117
    new-instance v0, Lcom/datavisorobfus/b;

    .line 118
    .line 119
    .line 120
    invoke-direct {v0, p0}, Lcom/datavisorobfus/b;-><init>(Landroid/content/Context;)V

    .line 121
    goto :goto_4

    .line 122
    :cond_8
    const/4 v0, 0x0

    .line 123
    goto :goto_4

    .line 124
    .line 125
    :cond_9
    :goto_0
    new-instance v0, Lcom/datavisorobfus/d0;

    .line 126
    .line 127
    .line 128
    invoke-direct {v0, p0}, Lcom/datavisorobfus/d0;-><init>(Landroid/content/Context;)V

    .line 129
    goto :goto_4

    .line 130
    .line 131
    :cond_a
    :goto_1
    new-instance v0, Lcom/datavisorobfus/b1;

    .line 132
    .line 133
    .line 134
    invoke-direct {v0, p0}, Lcom/datavisorobfus/b1;-><init>(Landroid/content/Context;)V

    .line 135
    goto :goto_4

    .line 136
    .line 137
    :cond_b
    :goto_2
    new-instance v0, Lcom/datavisorobfus/z;

    .line 138
    .line 139
    .line 140
    invoke-direct {v0, p0}, Lcom/datavisorobfus/z;-><init>(Landroid/content/Context;)V

    .line 141
    goto :goto_4

    .line 142
    .line 143
    :cond_c
    :goto_3
    new-instance v0, Lcom/datavisorobfus/n0;

    .line 144
    .line 145
    .line 146
    invoke-direct {v0, p0}, Lcom/datavisorobfus/n0;-><init>(Landroid/content/Context;)V

    .line 147
    .line 148
    :goto_4
    if-eqz v0, :cond_d

    .line 149
    .line 150
    .line 151
    invoke-interface {v0}, Lcom/datavisorobfus/c0;->a()Z

    .line 152
    move-result p0

    .line 153
    .line 154
    if-eqz p0, :cond_d

    .line 155
    return-object v0

    .line 156
    .line 157
    :cond_d
    new-instance p0, Lcom/datavisorobfus/q;

    .line 158
    .line 159
    .line 160
    invoke-direct {p0}, Lcom/datavisorobfus/q;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    return-object p0

    .line 162
    :catchall_0
    move-exception p0

    .line 163
    .line 164
    .line 165
    invoke-static {p0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    .line 166
    .line 167
    new-instance p0, Lcom/datavisorobfus/q;

    .line 168
    .line 169
    .line 170
    invoke-direct {p0}, Lcom/datavisorobfus/q;-><init>()V

    .line 171
    return-object p0
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
.end method
