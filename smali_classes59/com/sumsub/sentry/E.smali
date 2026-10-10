.class public final Lcom/sumsub/sentry/E;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final a:Lcom/sumsub/sentry/E;

.field public static final b:Lxg0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sentry/E;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sentry/E;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sentry/E;->a:Lcom/sumsub/sentry/E;

    .line 8
    .line 9
    sget-boolean v0, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/J;->a(Z)Lxg0/a;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    sput-object v0, Lcom/sumsub/sentry/E;->b:Lxg0/a;

    .line 16
    return-void
    .line 17
.end method

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
.end method

.method public static a(Lcom/sumsub/sentry/b0;Ljava/io/OutputStream;)V
    .locals 10

    .line 1
    .line 2
    const-string v1, "\n"

    .line 3
    .line 4
    new-instance v0, Ljava/io/BufferedOutputStream;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, p1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 8
    .line 9
    new-instance v2, Ljava/io/BufferedWriter;

    .line 10
    .line 11
    new-instance v3, Ljava/io/OutputStreamWriter;

    .line 12
    .line 13
    const-string v4, "UTF-8"

    .line 14
    .line 15
    .line 16
    invoke-direct {v3, v0, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v2, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    .line 20
    .line 21
    :try_start_0
    iget-object v0, p0, Lcom/sumsub/sentry/b0;->a:Lcom/sumsub/sentry/f0;

    .line 22
    .line 23
    sget-object v3, Lcom/sumsub/sentry/E;->b:Lxg0/a;

    .line 24
    .line 25
    .line 26
    invoke-interface {v3}, Ltg0/n;->getSerializersModule()Lyg0/a;

    .line 27
    .line 28
    sget-object v4, Lcom/sumsub/sentry/f0;->Companion:Lcom/sumsub/sentry/e0;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4}, Lcom/sumsub/sentry/e0;->serializer()Ltg0/d;

    .line 32
    move-result-object v4

    .line 33
    .line 34
    check-cast v4, Ltg0/p;

    .line 35
    .line 36
    .line 37
    invoke-interface {v3, v4, v0}, Ltg0/c0;->b(Ltg0/p;Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 45
    .line 46
    iget-object p0, p0, Lcom/sumsub/sentry/b0;->b:Ljava/util/List;

    .line 47
    .line 48
    .line 49
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    move-result-object p0

    .line 51
    .line 52
    .line 53
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    move-result v0

    .line 55
    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    move-result-object v0

    .line 61
    move-object v3, v0

    .line 62
    .line 63
    check-cast v3, Lcom/sumsub/sentry/h0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    :try_start_1
    iget-object v0, v3, Lcom/sumsub/sentry/h0;->a:Lcom/sumsub/sentry/k0;

    .line 66
    .line 67
    sget-object v4, Lcom/sumsub/sentry/E;->b:Lxg0/a;

    .line 68
    .line 69
    .line 70
    invoke-interface {v4}, Ltg0/n;->getSerializersModule()Lyg0/a;

    .line 71
    .line 72
    sget-object v5, Lcom/sumsub/sentry/k0;->Companion:Lcom/sumsub/sentry/j0;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5}, Lcom/sumsub/sentry/j0;->serializer()Ltg0/d;

    .line 76
    move-result-object v5

    .line 77
    .line 78
    check-cast v5, Ltg0/p;

    .line 79
    .line 80
    .line 81
    invoke-interface {v4, v5, v0}, Ltg0/c0;->b(Ltg0/p;Ljava/lang/Object;)Ljava/lang/String;

    .line 82
    move-result-object v0

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/io/BufferedWriter;->flush()V

    .line 92
    .line 93
    iget-object v0, v3, Lcom/sumsub/sentry/h0;->b:[B

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    goto :goto_0

    .line 101
    :catchall_0
    move-exception v0

    .line 102
    move-object p0, v0

    .line 103
    goto :goto_1

    .line 104
    :catch_0
    move-exception v0

    .line 105
    .line 106
    :try_start_2
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 107
    .line 108
    sget-object v5, Lcom/sumsub/sentry/E;->a:Lcom/sumsub/sentry/E;

    .line 109
    .line 110
    .line 111
    invoke-static {v5}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 112
    move-result-object v5

    .line 113
    .line 114
    new-instance v6, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 118
    .line 119
    const-string v7, "Failed to serialize item: "

    .line 120
    .line 121
    .line 122
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    move-result-object v6

    .line 136
    const/4 v8, 0x4

    .line 137
    const/4 v9, 0x0

    .line 138
    const/4 v7, 0x0

    .line 139
    .line 140
    .line 141
    invoke-static/range {v4 .. v9}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->e$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 142
    goto :goto_0

    .line 143
    .line 144
    .line 145
    :cond_0
    invoke-virtual {v2}, Ljava/io/BufferedWriter;->flush()V

    .line 146
    return-void

    .line 147
    .line 148
    .line 149
    :goto_1
    invoke-virtual {v2}, Ljava/io/BufferedWriter;->flush()V

    .line 150
    throw p0
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
