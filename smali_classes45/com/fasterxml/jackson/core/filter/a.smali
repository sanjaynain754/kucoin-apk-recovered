.class public Lcom/fasterxml/jackson/core/filter/a;
.super Lcom/fasterxml/jackson/core/util/g;
.source "FilteringParserDelegate.java"


# instance fields
.field public f:Lcom/fasterxml/jackson/core/filter/TokenFilter;

.field public g:Z

.field public h:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

.field public i:Lcom/fasterxml/jackson/core/JsonToken;

.field public j:Lcom/fasterxml/jackson/core/JsonToken;

.field public k:Lg7/b;

.field public l:Lg7/b;

.field public m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

.field public n:I


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/core/filter/TokenFilter;Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/util/g;-><init>(Lcom/fasterxml/jackson/core/JsonParser;)V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/fasterxml/jackson/core/filter/a;->f:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 8
    .line 9
    .line 10
    invoke-static {p2}, Lg7/b;->o(Lcom/fasterxml/jackson/core/filter/TokenFilter;)Lg7/b;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    iput-object p1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 14
    .line 15
    iput-object p3, p0, Lcom/fasterxml/jackson/core/filter/a;->h:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 16
    .line 17
    iput-boolean p4, p0, Lcom/fasterxml/jackson/core/filter/a;->g:Z

    .line 18
    return-void
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


# virtual methods
.method public C()Ljava/math/BigDecimal;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->C()Ljava/math/BigDecimal;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public C0()Lcom/fasterxml/jackson/core/JsonParser;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const/4 v0, 0x1

    .line 13
    .line 14
    .line 15
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/filter/a;->t0()Lcom/fasterxml/jackson/core/JsonToken;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    if-nez v1, :cond_2

    .line 19
    goto :goto_1

    .line 20
    .line 21
    .line 22
    :cond_2
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/JsonToken;->isStructStart()Z

    .line 23
    move-result v2

    .line 24
    .line 25
    if-eqz v2, :cond_3

    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x1

    .line 28
    goto :goto_0

    .line 29
    .line 30
    .line 31
    :cond_3
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/JsonToken;->isStructEnd()Z

    .line 32
    move-result v1

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    add-int/lit8 v0, v0, -0x1

    .line 37
    .line 38
    if-nez v0, :cond_1

    .line 39
    :goto_1
    return-object p0
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
.end method

.method public D0()Lcom/fasterxml/jackson/core/f;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->l:Lg7/b;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-object v0

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 8
    return-object v0
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
.end method

.method public E()D
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->E()D

    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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
.end method

.method public final E0(Lg7/b;)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/fasterxml/jackson/core/filter/a;->l:Lg7/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lg7/b;->t()Lcom/fasterxml/jackson/core/JsonToken;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    return-object v0

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 12
    .line 13
    if-eq p1, v0, :cond_2

    .line 14
    .line 15
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->l:Lg7/b;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lg7/b;->p(Lg7/b;)Lg7/b;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    iput-object p1, p0, Lcom/fasterxml/jackson/core/filter/a;->l:Lg7/b;

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lg7/b;->t()Lcom/fasterxml/jackson/core/JsonToken;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    return-object v0

    .line 31
    .line 32
    :cond_1
    const-string p1, "Unexpected problem: chain of filtered context broken"

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/JsonParser;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonParseException;

    .line 36
    move-result-object p1

    .line 37
    throw p1

    .line 38
    .line 39
    :cond_2
    const-string p1, "Internal error: failed to locate expected buffered tokens"

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/JsonParser;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonParseException;

    .line 43
    move-result-object p1

    .line 44
    throw p1
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
.end method

.method public final F0()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->t0()Lcom/fasterxml/jackson/core/JsonToken;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 11
    return-object v0

    .line 12
    .line 13
    .line 14
    :cond_1
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->id()I

    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    .line 19
    if-eq v1, v3, :cond_13

    .line 20
    const/4 v4, 0x2

    .line 21
    .line 22
    if-eq v1, v4, :cond_11

    .line 23
    const/4 v4, 0x3

    .line 24
    .line 25
    if-eq v1, v4, :cond_a

    .line 26
    const/4 v2, 0x4

    .line 27
    .line 28
    if-eq v1, v2, :cond_11

    .line 29
    const/4 v2, 0x5

    .line 30
    .line 31
    if-eq v1, v2, :cond_4

    .line 32
    .line 33
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 34
    .line 35
    sget-object v2, Lcom/fasterxml/jackson/core/filter/TokenFilter;->a:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 36
    .line 37
    if-ne v1, v2, :cond_2

    .line 38
    .line 39
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 40
    return-object v0

    .line 41
    .line 42
    :cond_2
    if-eqz v1, :cond_0

    .line 43
    .line 44
    iget-object v3, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3, v1}, Lg7/b;->l(Lcom/fasterxml/jackson/core/filter/TokenFilter;)Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    if-eq v1, v2, :cond_3

    .line 51
    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    iget-object v2, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/core/filter/TokenFilter;->h(Lcom/fasterxml/jackson/core/JsonParser;)Z

    .line 58
    move-result v1

    .line 59
    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    .line 63
    :cond_3
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/filter/a;->H0()Z

    .line 64
    move-result v1

    .line 65
    .line 66
    if-eqz v1, :cond_0

    .line 67
    .line 68
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 69
    return-object v0

    .line 70
    .line 71
    :cond_4
    iget-object v1, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/JsonParser;->w()Ljava/lang/String;

    .line 75
    move-result-object v1

    .line 76
    .line 77
    iget-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v1}, Lg7/b;->v(Ljava/lang/String;)Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 81
    move-result-object v2

    .line 82
    .line 83
    sget-object v3, Lcom/fasterxml/jackson/core/filter/TokenFilter;->a:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 84
    .line 85
    if-ne v2, v3, :cond_5

    .line 86
    .line 87
    iput-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 88
    .line 89
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 90
    return-object v0

    .line 91
    .line 92
    :cond_5
    if-nez v2, :cond_6

    .line 93
    .line 94
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->t0()Lcom/fasterxml/jackson/core/JsonToken;

    .line 98
    .line 99
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->C0()Lcom/fasterxml/jackson/core/JsonParser;

    .line 103
    goto :goto_0

    .line 104
    .line 105
    .line 106
    :cond_6
    invoke-virtual {v2, v1}, Lcom/fasterxml/jackson/core/filter/TokenFilter;->f(Ljava/lang/String;)Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 107
    move-result-object v1

    .line 108
    .line 109
    if-nez v1, :cond_7

    .line 110
    .line 111
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->t0()Lcom/fasterxml/jackson/core/JsonToken;

    .line 115
    .line 116
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->C0()Lcom/fasterxml/jackson/core/JsonParser;

    .line 120
    goto :goto_0

    .line 121
    .line 122
    :cond_7
    iput-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 123
    .line 124
    if-ne v1, v3, :cond_9

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/filter/a;->H0()Z

    .line 128
    move-result v1

    .line 129
    .line 130
    if-eqz v1, :cond_8

    .line 131
    .line 132
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->h:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 133
    .line 134
    sget-object v2, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;->INCLUDE_ALL_AND_PATH:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 135
    .line 136
    if-ne v1, v2, :cond_0

    .line 137
    .line 138
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 139
    return-object v0

    .line 140
    .line 141
    :cond_8
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->t0()Lcom/fasterxml/jackson/core/JsonToken;

    .line 145
    .line 146
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->C0()Lcom/fasterxml/jackson/core/JsonParser;

    .line 150
    .line 151
    goto/16 :goto_0

    .line 152
    .line 153
    :cond_9
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->h:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 154
    .line 155
    sget-object v1, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;->ONLY_INCLUDE_ALL:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 156
    .line 157
    if-eq v0, v1, :cond_0

    .line 158
    .line 159
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/filter/a;->G0(Lg7/b;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 163
    move-result-object v0

    .line 164
    .line 165
    if-eqz v0, :cond_0

    .line 166
    .line 167
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 168
    return-object v0

    .line 169
    .line 170
    :cond_a
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 171
    .line 172
    sget-object v4, Lcom/fasterxml/jackson/core/filter/TokenFilter;->a:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 173
    .line 174
    if-ne v1, v4, :cond_b

    .line 175
    .line 176
    iget-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v1, v3}, Lg7/b;->m(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lg7/b;

    .line 180
    move-result-object v1

    .line 181
    .line 182
    iput-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 183
    .line 184
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 185
    return-object v0

    .line 186
    .line 187
    :cond_b
    if-nez v1, :cond_c

    .line 188
    .line 189
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->C0()Lcom/fasterxml/jackson/core/JsonParser;

    .line 193
    .line 194
    goto/16 :goto_0

    .line 195
    .line 196
    :cond_c
    iget-object v5, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v5, v1}, Lg7/b;->l(Lcom/fasterxml/jackson/core/filter/TokenFilter;)Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 200
    move-result-object v1

    .line 201
    .line 202
    if-nez v1, :cond_d

    .line 203
    .line 204
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->C0()Lcom/fasterxml/jackson/core/JsonParser;

    .line 208
    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :cond_d
    if-eq v1, v4, :cond_e

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/filter/TokenFilter;->c()Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 215
    move-result-object v1

    .line 216
    .line 217
    :cond_e
    iput-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 218
    .line 219
    if-ne v1, v4, :cond_f

    .line 220
    .line 221
    iget-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2, v1, v3}, Lg7/b;->m(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lg7/b;

    .line 225
    move-result-object v1

    .line 226
    .line 227
    iput-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 228
    .line 229
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 230
    return-object v0

    .line 231
    .line 232
    :cond_f
    if-eqz v1, :cond_10

    .line 233
    .line 234
    iget-object v4, p0, Lcom/fasterxml/jackson/core/filter/a;->h:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 235
    .line 236
    sget-object v5, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;->INCLUDE_NON_NULL:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 237
    .line 238
    if-ne v4, v5, :cond_10

    .line 239
    .line 240
    iget-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2, v1, v3}, Lg7/b;->m(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lg7/b;

    .line 244
    move-result-object v1

    .line 245
    .line 246
    iput-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 247
    .line 248
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 249
    return-object v0

    .line 250
    .line 251
    :cond_10
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0, v1, v2}, Lg7/b;->m(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lg7/b;

    .line 255
    move-result-object v0

    .line 256
    .line 257
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 258
    .line 259
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->h:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 260
    .line 261
    sget-object v2, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;->INCLUDE_ALL_AND_PATH:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 262
    .line 263
    if-ne v1, v2, :cond_0

    .line 264
    .line 265
    .line 266
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/filter/a;->G0(Lg7/b;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 267
    move-result-object v0

    .line 268
    .line 269
    if-eqz v0, :cond_0

    .line 270
    .line 271
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 272
    return-object v0

    .line 273
    .line 274
    :cond_11
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1}, Lg7/b;->s()Z

    .line 278
    move-result v1

    .line 279
    .line 280
    iget-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v2}, Lg7/b;->q()Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 284
    move-result-object v2

    .line 285
    .line 286
    if-eqz v2, :cond_12

    .line 287
    .line 288
    sget-object v3, Lcom/fasterxml/jackson/core/filter/TokenFilter;->a:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 289
    .line 290
    if-eq v2, v3, :cond_12

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/filter/TokenFilter;->b()V

    .line 294
    .line 295
    :cond_12
    iget-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2}, Lg7/b;->r()Lg7/b;

    .line 299
    move-result-object v2

    .line 300
    .line 301
    iput-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2}, Lg7/b;->q()Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 305
    move-result-object v2

    .line 306
    .line 307
    iput-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 308
    .line 309
    if-eqz v1, :cond_0

    .line 310
    .line 311
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 312
    return-object v0

    .line 313
    .line 314
    :cond_13
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 315
    .line 316
    sget-object v4, Lcom/fasterxml/jackson/core/filter/TokenFilter;->a:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 317
    .line 318
    if-ne v1, v4, :cond_14

    .line 319
    .line 320
    iget-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2, v1, v3}, Lg7/b;->n(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lg7/b;

    .line 324
    move-result-object v1

    .line 325
    .line 326
    iput-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 327
    .line 328
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 329
    return-object v0

    .line 330
    .line 331
    :cond_14
    if-nez v1, :cond_15

    .line 332
    .line 333
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->C0()Lcom/fasterxml/jackson/core/JsonParser;

    .line 337
    .line 338
    goto/16 :goto_0

    .line 339
    .line 340
    :cond_15
    iget-object v5, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v5, v1}, Lg7/b;->l(Lcom/fasterxml/jackson/core/filter/TokenFilter;)Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 344
    move-result-object v1

    .line 345
    .line 346
    if-nez v1, :cond_16

    .line 347
    .line 348
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->C0()Lcom/fasterxml/jackson/core/JsonParser;

    .line 352
    .line 353
    goto/16 :goto_0

    .line 354
    .line 355
    :cond_16
    if-eq v1, v4, :cond_17

    .line 356
    .line 357
    .line 358
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/filter/TokenFilter;->d()Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 359
    move-result-object v1

    .line 360
    .line 361
    :cond_17
    iput-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 362
    .line 363
    if-ne v1, v4, :cond_18

    .line 364
    .line 365
    iget-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v2, v1, v3}, Lg7/b;->n(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lg7/b;

    .line 369
    move-result-object v1

    .line 370
    .line 371
    iput-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 372
    .line 373
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 374
    return-object v0

    .line 375
    .line 376
    :cond_18
    if-eqz v1, :cond_19

    .line 377
    .line 378
    iget-object v4, p0, Lcom/fasterxml/jackson/core/filter/a;->h:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 379
    .line 380
    sget-object v5, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;->INCLUDE_NON_NULL:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 381
    .line 382
    if-ne v4, v5, :cond_19

    .line 383
    .line 384
    iget-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v2, v1, v3}, Lg7/b;->n(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lg7/b;

    .line 388
    move-result-object v1

    .line 389
    .line 390
    iput-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 391
    .line 392
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 393
    return-object v0

    .line 394
    .line 395
    :cond_19
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v0, v1, v2}, Lg7/b;->n(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lg7/b;

    .line 399
    move-result-object v0

    .line 400
    .line 401
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 402
    .line 403
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->h:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 404
    .line 405
    sget-object v2, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;->INCLUDE_ALL_AND_PATH:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 406
    .line 407
    if-ne v1, v2, :cond_0

    .line 408
    .line 409
    .line 410
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/filter/a;->G0(Lg7/b;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 411
    move-result-object v0

    .line 412
    .line 413
    if-eqz v0, :cond_0

    .line 414
    .line 415
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 416
    return-object v0
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
.end method

.method public final G0(Lg7/b;)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->t0()Lcom/fasterxml/jackson/core/JsonToken;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    return-object v0

    .line 10
    .line 11
    .line 12
    :cond_1
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->id()I

    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x1

    .line 16
    .line 17
    if-eq v1, v3, :cond_11

    .line 18
    const/4 v4, 0x2

    .line 19
    .line 20
    if-eq v1, v4, :cond_e

    .line 21
    const/4 v4, 0x3

    .line 22
    .line 23
    if-eq v1, v4, :cond_9

    .line 24
    const/4 v4, 0x4

    .line 25
    .line 26
    if-eq v1, v4, :cond_e

    .line 27
    const/4 v0, 0x5

    .line 28
    .line 29
    if-eq v1, v0, :cond_4

    .line 30
    .line 31
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 32
    .line 33
    sget-object v1, Lcom/fasterxml/jackson/core/filter/TokenFilter;->a:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 34
    .line 35
    if-ne v0, v1, :cond_2

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/filter/a;->E0(Lg7/b;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 39
    move-result-object p1

    .line 40
    return-object p1

    .line 41
    .line 42
    :cond_2
    if-eqz v0, :cond_0

    .line 43
    .line 44
    iget-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v0}, Lg7/b;->l(Lcom/fasterxml/jackson/core/filter/TokenFilter;)Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    if-eq v0, v1, :cond_3

    .line 51
    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    iget-object v1, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/filter/TokenFilter;->h(Lcom/fasterxml/jackson/core/JsonParser;)Z

    .line 58
    move-result v0

    .line 59
    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    .line 63
    :cond_3
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/filter/a;->H0()Z

    .line 64
    move-result v0

    .line 65
    .line 66
    if-eqz v0, :cond_0

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/filter/a;->E0(Lg7/b;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 70
    move-result-object p1

    .line 71
    return-object p1

    .line 72
    .line 73
    :cond_4
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->w()Ljava/lang/String;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v0}, Lg7/b;->v(Ljava/lang/String;)Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 83
    move-result-object v1

    .line 84
    .line 85
    sget-object v2, Lcom/fasterxml/jackson/core/filter/TokenFilter;->a:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 86
    .line 87
    if-ne v1, v2, :cond_5

    .line 88
    .line 89
    iput-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/filter/a;->E0(Lg7/b;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 93
    move-result-object p1

    .line 94
    return-object p1

    .line 95
    .line 96
    :cond_5
    if-nez v1, :cond_6

    .line 97
    .line 98
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->t0()Lcom/fasterxml/jackson/core/JsonToken;

    .line 102
    .line 103
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->C0()Lcom/fasterxml/jackson/core/JsonParser;

    .line 107
    goto :goto_0

    .line 108
    .line 109
    .line 110
    :cond_6
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/filter/TokenFilter;->f(Ljava/lang/String;)Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 111
    move-result-object v1

    .line 112
    .line 113
    if-nez v1, :cond_7

    .line 114
    .line 115
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->t0()Lcom/fasterxml/jackson/core/JsonToken;

    .line 119
    .line 120
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->C0()Lcom/fasterxml/jackson/core/JsonParser;

    .line 124
    goto :goto_0

    .line 125
    .line 126
    :cond_7
    iput-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 127
    .line 128
    if-ne v1, v2, :cond_0

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/filter/a;->H0()Z

    .line 132
    move-result v1

    .line 133
    .line 134
    if-eqz v1, :cond_8

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/filter/a;->E0(Lg7/b;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 138
    move-result-object p1

    .line 139
    return-object p1

    .line 140
    .line 141
    :cond_8
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1, v0}, Lg7/b;->v(Ljava/lang/String;)Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 145
    move-result-object v0

    .line 146
    .line 147
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 148
    .line 149
    goto/16 :goto_0

    .line 150
    .line 151
    :cond_9
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 152
    .line 153
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v1}, Lg7/b;->l(Lcom/fasterxml/jackson/core/filter/TokenFilter;)Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 157
    move-result-object v0

    .line 158
    .line 159
    if-nez v0, :cond_a

    .line 160
    .line 161
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->C0()Lcom/fasterxml/jackson/core/JsonParser;

    .line 165
    .line 166
    goto/16 :goto_0

    .line 167
    .line 168
    :cond_a
    sget-object v1, Lcom/fasterxml/jackson/core/filter/TokenFilter;->a:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 169
    .line 170
    if-eq v0, v1, :cond_b

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/filter/TokenFilter;->c()Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 174
    move-result-object v0

    .line 175
    .line 176
    :cond_b
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 177
    .line 178
    if-ne v0, v1, :cond_c

    .line 179
    .line 180
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, v0, v3}, Lg7/b;->m(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lg7/b;

    .line 184
    move-result-object v0

    .line 185
    .line 186
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/filter/a;->E0(Lg7/b;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 190
    move-result-object p1

    .line 191
    return-object p1

    .line 192
    .line 193
    :cond_c
    if-eqz v0, :cond_d

    .line 194
    .line 195
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->h:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 196
    .line 197
    sget-object v4, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;->INCLUDE_NON_NULL:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 198
    .line 199
    if-ne v1, v4, :cond_d

    .line 200
    .line 201
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, v0, v3}, Lg7/b;->m(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lg7/b;

    .line 205
    move-result-object v0

    .line 206
    .line 207
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/filter/a;->E0(Lg7/b;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 211
    move-result-object p1

    .line 212
    return-object p1

    .line 213
    .line 214
    :cond_d
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, v0, v2}, Lg7/b;->m(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lg7/b;

    .line 218
    move-result-object v0

    .line 219
    .line 220
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 221
    .line 222
    goto/16 :goto_0

    .line 223
    .line 224
    :cond_e
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1}, Lg7/b;->q()Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 228
    move-result-object v1

    .line 229
    .line 230
    if-eqz v1, :cond_f

    .line 231
    .line 232
    sget-object v4, Lcom/fasterxml/jackson/core/filter/TokenFilter;->a:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 233
    .line 234
    if-eq v1, v4, :cond_f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/filter/TokenFilter;->b()V

    .line 238
    .line 239
    :cond_f
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 240
    .line 241
    if-ne v1, p1, :cond_10

    .line 242
    .line 243
    .line 244
    invoke-virtual {v1}, Lg7/b;->s()Z

    .line 245
    move-result v1

    .line 246
    .line 247
    if-eqz v1, :cond_10

    .line 248
    move v2, v3

    .line 249
    .line 250
    :cond_10
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1}, Lg7/b;->r()Lg7/b;

    .line 254
    move-result-object v1

    .line 255
    .line 256
    iput-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1}, Lg7/b;->q()Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 260
    move-result-object v1

    .line 261
    .line 262
    iput-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 263
    .line 264
    if-eqz v2, :cond_0

    .line 265
    return-object v0

    .line 266
    .line 267
    :cond_11
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 268
    .line 269
    sget-object v4, Lcom/fasterxml/jackson/core/filter/TokenFilter;->a:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 270
    .line 271
    if-ne v1, v4, :cond_12

    .line 272
    .line 273
    iget-object p1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1, v1, v3}, Lg7/b;->n(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lg7/b;

    .line 277
    move-result-object p1

    .line 278
    .line 279
    iput-object p1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 280
    return-object v0

    .line 281
    .line 282
    :cond_12
    if-nez v1, :cond_13

    .line 283
    .line 284
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->C0()Lcom/fasterxml/jackson/core/JsonParser;

    .line 288
    .line 289
    goto/16 :goto_0

    .line 290
    .line 291
    :cond_13
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0, v1}, Lg7/b;->l(Lcom/fasterxml/jackson/core/filter/TokenFilter;)Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 295
    move-result-object v0

    .line 296
    .line 297
    if-nez v0, :cond_14

    .line 298
    .line 299
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->C0()Lcom/fasterxml/jackson/core/JsonParser;

    .line 303
    .line 304
    goto/16 :goto_0

    .line 305
    .line 306
    :cond_14
    if-eq v0, v4, :cond_15

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/filter/TokenFilter;->d()Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 310
    move-result-object v0

    .line 311
    .line 312
    :cond_15
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 313
    .line 314
    if-ne v0, v4, :cond_16

    .line 315
    .line 316
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1, v0, v3}, Lg7/b;->n(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lg7/b;

    .line 320
    move-result-object v0

    .line 321
    .line 322
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 323
    .line 324
    .line 325
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/filter/a;->E0(Lg7/b;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 326
    move-result-object p1

    .line 327
    return-object p1

    .line 328
    .line 329
    :cond_16
    if-eqz v0, :cond_17

    .line 330
    .line 331
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->h:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 332
    .line 333
    sget-object v4, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;->INCLUDE_NON_NULL:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 334
    .line 335
    if-ne v1, v4, :cond_17

    .line 336
    .line 337
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v1, v0, v3}, Lg7/b;->m(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lg7/b;

    .line 341
    move-result-object v0

    .line 342
    .line 343
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 344
    .line 345
    .line 346
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/filter/a;->E0(Lg7/b;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 347
    move-result-object p1

    .line 348
    return-object p1

    .line 349
    .line 350
    :cond_17
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v1, v0, v2}, Lg7/b;->n(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lg7/b;

    .line 354
    move-result-object v0

    .line 355
    .line 356
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 357
    .line 358
    goto/16 :goto_0
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
.end method

.method public final H0()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/fasterxml/jackson/core/filter/a;->n:I

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-boolean v1, p0, Lcom/fasterxml/jackson/core/filter/a;->g:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 13
    add-int/2addr v0, v1

    .line 14
    .line 15
    iput v0, p0, Lcom/fasterxml/jackson/core/filter/a;->n:I

    .line 16
    return v1
    .line 17
    .line 18
.end method

.method public J()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->J()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public L()F
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->L()F

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public M()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->M()I

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public O()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->O()J

    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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
.end method

.method public P()Lcom/fasterxml/jackson/core/JsonParser$NumberType;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->P()Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public Q()Ljava/lang/Number;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->Q()Ljava/lang/Number;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public T()Lcom/fasterxml/jackson/core/f;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/filter/a;->D0()Lcom/fasterxml/jackson/core/f;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public V()S
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->V()S

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public W()Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/filter/a;->j()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->W()Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public X()[C
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/filter/a;->j()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->X()[C

    .line 21
    move-result-object v0

    .line 22
    return-object v0
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
.end method

.method public Y()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/filter/a;->j()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 14
    move-result v0

    .line 15
    return v0

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->Y()I

    .line 21
    move-result v0

    .line 22
    return v0
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
.end method

.method public Z()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->Z()I

    .line 14
    move-result v0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
.end method

.method public a0()Lcom/fasterxml/jackson/core/JsonLocation;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->a0()Lcom/fasterxml/jackson/core/JsonLocation;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public c0()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->c0()I

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public d0(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonParser;->d0(I)I

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public e0()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->e0()J

    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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
.end method

.method public f0(J)J
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/fasterxml/jackson/core/JsonParser;->f0(J)J

    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
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
.end method

.method public g0()Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/filter/a;->j()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->g0()Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public h0(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/filter/a;->j()Ljava/lang/String;

    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonParser;->h0(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    move-result-object p1

    .line 18
    return-object p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public i()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->j:Lcom/fasterxml/jackson/core/JsonToken;

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 10
    :cond_0
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public i0()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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
.end method

.method public j()Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/filter/a;->D0()Lcom/fasterxml/jackson/core/f;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 7
    .line 8
    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 9
    .line 10
    if-eq v1, v2, :cond_1

    .line 11
    .line 12
    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    goto :goto_0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->b()Ljava/lang/String;

    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->e()Lcom/fasterxml/jackson/core/f;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    const/4 v0, 0x0

    .line 28
    return-object v0

    .line 29
    .line 30
    .line 31
    :cond_2
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->b()Ljava/lang/String;

    .line 32
    move-result-object v0

    .line 33
    return-object v0
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
.end method

.method public j0()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->j0()Z

    .line 14
    move-result v0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
.end method

.method public k()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    return-object v0
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
    .line 18
.end method

.method public final k0(Lcom/fasterxml/jackson/core/JsonToken;)Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    const/4 p1, 0x1

    .line 6
    return p1

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    return p1
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
.end method

.method public final l()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->id()I

    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public l0(I)Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    return v2

    .line 10
    :cond_0
    return v1

    .line 11
    .line 12
    .line 13
    :cond_1
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->id()I

    .line 14
    move-result v0

    .line 15
    .line 16
    if-ne v0, p1, :cond_2

    .line 17
    return v2

    .line 18
    :cond_2
    return v1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public n()Ljava/math/BigInteger;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->n()Ljava/math/BigInteger;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public o0()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public p(Lcom/fasterxml/jackson/core/Base64Variant;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonParser;->p(Lcom/fasterxml/jackson/core/Base64Variant;)[B

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
.end method

.method public p0()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public q()B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->q()B

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public t0()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/fasterxml/jackson/core/filter/a;->g:Z

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->l:Lg7/b;

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->isScalarValue()Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lg7/b;->s()Z

    .line 25
    move-result v0

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->h:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 30
    .line 31
    sget-object v2, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;->ONLY_INCLUDE_ALL:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 32
    .line 33
    if-ne v0, v2, :cond_0

    .line 34
    .line 35
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 36
    .line 37
    sget-object v2, Lcom/fasterxml/jackson/core/filter/TokenFilter;->a:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 38
    .line 39
    if-ne v0, v2, :cond_0

    .line 40
    .line 41
    iput-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 42
    return-object v1

    .line 43
    .line 44
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->l:Lg7/b;

    .line 45
    .line 46
    if-eqz v0, :cond_5

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-virtual {v0}, Lg7/b;->t()Lcom/fasterxml/jackson/core/JsonToken;

    .line 50
    move-result-object v2

    .line 51
    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    iput-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 55
    return-object v2

    .line 56
    .line 57
    :cond_1
    iget-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 58
    .line 59
    if-ne v0, v2, :cond_3

    .line 60
    .line 61
    iput-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->l:Lg7/b;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->f()Z

    .line 65
    move-result v0

    .line 66
    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->x()Lcom/fasterxml/jackson/core/JsonToken;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 76
    return-object v0

    .line 77
    .line 78
    :cond_2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->k()Lcom/fasterxml/jackson/core/JsonToken;

    .line 82
    move-result-object v0

    .line 83
    .line 84
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 85
    .line 86
    if-eq v0, v1, :cond_5

    .line 87
    .line 88
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 89
    return-object v0

    .line 90
    .line 91
    .line 92
    :cond_3
    invoke-virtual {v2, v0}, Lg7/b;->p(Lg7/b;)Lg7/b;

    .line 93
    move-result-object v0

    .line 94
    .line 95
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->l:Lg7/b;

    .line 96
    .line 97
    if-eqz v0, :cond_4

    .line 98
    goto :goto_0

    .line 99
    .line 100
    :cond_4
    const-string v0, "Unexpected problem: chain of filtered context broken"

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/JsonParser;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonParseException;

    .line 104
    move-result-object v0

    .line 105
    throw v0

    .line 106
    .line 107
    :cond_5
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->t0()Lcom/fasterxml/jackson/core/JsonToken;

    .line 111
    move-result-object v0

    .line 112
    .line 113
    if-nez v0, :cond_6

    .line 114
    .line 115
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 116
    return-object v0

    .line 117
    .line 118
    .line 119
    :cond_6
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->id()I

    .line 120
    move-result v1

    .line 121
    const/4 v2, 0x0

    .line 122
    const/4 v3, 0x1

    .line 123
    .line 124
    if-eq v1, v3, :cond_18

    .line 125
    const/4 v4, 0x2

    .line 126
    .line 127
    if-eq v1, v4, :cond_16

    .line 128
    const/4 v4, 0x3

    .line 129
    .line 130
    if-eq v1, v4, :cond_f

    .line 131
    const/4 v2, 0x4

    .line 132
    .line 133
    if-eq v1, v2, :cond_16

    .line 134
    const/4 v2, 0x5

    .line 135
    .line 136
    if-eq v1, v2, :cond_9

    .line 137
    .line 138
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 139
    .line 140
    sget-object v2, Lcom/fasterxml/jackson/core/filter/TokenFilter;->a:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 141
    .line 142
    if-ne v1, v2, :cond_7

    .line 143
    .line 144
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 145
    return-object v0

    .line 146
    .line 147
    :cond_7
    if-eqz v1, :cond_1f

    .line 148
    .line 149
    iget-object v3, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3, v1}, Lg7/b;->l(Lcom/fasterxml/jackson/core/filter/TokenFilter;)Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 153
    move-result-object v1

    .line 154
    .line 155
    if-eq v1, v2, :cond_8

    .line 156
    .line 157
    if-eqz v1, :cond_1f

    .line 158
    .line 159
    iget-object v2, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/core/filter/TokenFilter;->h(Lcom/fasterxml/jackson/core/JsonParser;)Z

    .line 163
    move-result v1

    .line 164
    .line 165
    if-eqz v1, :cond_1f

    .line 166
    .line 167
    .line 168
    :cond_8
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/filter/a;->H0()Z

    .line 169
    move-result v1

    .line 170
    .line 171
    if-eqz v1, :cond_1f

    .line 172
    .line 173
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 174
    return-object v0

    .line 175
    .line 176
    :cond_9
    iget-object v1, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/JsonParser;->w()Ljava/lang/String;

    .line 180
    move-result-object v1

    .line 181
    .line 182
    iget-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2, v1}, Lg7/b;->v(Ljava/lang/String;)Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 186
    move-result-object v2

    .line 187
    .line 188
    sget-object v3, Lcom/fasterxml/jackson/core/filter/TokenFilter;->a:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 189
    .line 190
    if-ne v2, v3, :cond_a

    .line 191
    .line 192
    iput-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 193
    .line 194
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 195
    return-object v0

    .line 196
    .line 197
    :cond_a
    if-nez v2, :cond_b

    .line 198
    .line 199
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->t0()Lcom/fasterxml/jackson/core/JsonToken;

    .line 203
    .line 204
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->C0()Lcom/fasterxml/jackson/core/JsonParser;

    .line 208
    .line 209
    goto/16 :goto_1

    .line 210
    .line 211
    .line 212
    :cond_b
    invoke-virtual {v2, v1}, Lcom/fasterxml/jackson/core/filter/TokenFilter;->f(Ljava/lang/String;)Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 213
    move-result-object v1

    .line 214
    .line 215
    if-nez v1, :cond_c

    .line 216
    .line 217
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->t0()Lcom/fasterxml/jackson/core/JsonToken;

    .line 221
    .line 222
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->C0()Lcom/fasterxml/jackson/core/JsonParser;

    .line 226
    .line 227
    goto/16 :goto_1

    .line 228
    .line 229
    :cond_c
    iput-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 230
    .line 231
    if-ne v1, v3, :cond_e

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/filter/a;->H0()Z

    .line 235
    move-result v1

    .line 236
    .line 237
    if-eqz v1, :cond_d

    .line 238
    .line 239
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->h:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 240
    .line 241
    sget-object v2, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;->INCLUDE_ALL_AND_PATH:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 242
    .line 243
    if-ne v1, v2, :cond_e

    .line 244
    .line 245
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 246
    return-object v0

    .line 247
    .line 248
    :cond_d
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->t0()Lcom/fasterxml/jackson/core/JsonToken;

    .line 252
    .line 253
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->C0()Lcom/fasterxml/jackson/core/JsonParser;

    .line 257
    .line 258
    :cond_e
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->h:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 259
    .line 260
    sget-object v1, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;->ONLY_INCLUDE_ALL:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 261
    .line 262
    if-eq v0, v1, :cond_1f

    .line 263
    .line 264
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 265
    .line 266
    .line 267
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/filter/a;->G0(Lg7/b;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 268
    move-result-object v0

    .line 269
    .line 270
    if-eqz v0, :cond_1f

    .line 271
    .line 272
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 273
    return-object v0

    .line 274
    .line 275
    :cond_f
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 276
    .line 277
    sget-object v4, Lcom/fasterxml/jackson/core/filter/TokenFilter;->a:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 278
    .line 279
    if-ne v1, v4, :cond_10

    .line 280
    .line 281
    iget-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v2, v1, v3}, Lg7/b;->m(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lg7/b;

    .line 285
    move-result-object v1

    .line 286
    .line 287
    iput-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 288
    .line 289
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 290
    return-object v0

    .line 291
    .line 292
    :cond_10
    if-nez v1, :cond_11

    .line 293
    .line 294
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->C0()Lcom/fasterxml/jackson/core/JsonParser;

    .line 298
    .line 299
    goto/16 :goto_1

    .line 300
    .line 301
    :cond_11
    iget-object v5, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v5, v1}, Lg7/b;->l(Lcom/fasterxml/jackson/core/filter/TokenFilter;)Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 305
    move-result-object v1

    .line 306
    .line 307
    if-nez v1, :cond_12

    .line 308
    .line 309
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->C0()Lcom/fasterxml/jackson/core/JsonParser;

    .line 313
    .line 314
    goto/16 :goto_1

    .line 315
    .line 316
    :cond_12
    if-eq v1, v4, :cond_13

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/filter/TokenFilter;->c()Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 320
    move-result-object v1

    .line 321
    .line 322
    :cond_13
    iput-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 323
    .line 324
    if-ne v1, v4, :cond_14

    .line 325
    .line 326
    iget-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v2, v1, v3}, Lg7/b;->m(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lg7/b;

    .line 330
    move-result-object v1

    .line 331
    .line 332
    iput-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 333
    .line 334
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 335
    return-object v0

    .line 336
    .line 337
    :cond_14
    if-eqz v1, :cond_15

    .line 338
    .line 339
    iget-object v4, p0, Lcom/fasterxml/jackson/core/filter/a;->h:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 340
    .line 341
    sget-object v5, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;->INCLUDE_NON_NULL:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 342
    .line 343
    if-ne v4, v5, :cond_15

    .line 344
    .line 345
    iget-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2, v1, v3}, Lg7/b;->m(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lg7/b;

    .line 349
    move-result-object v1

    .line 350
    .line 351
    iput-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 352
    .line 353
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 354
    return-object v0

    .line 355
    .line 356
    :cond_15
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v0, v1, v2}, Lg7/b;->m(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lg7/b;

    .line 360
    move-result-object v0

    .line 361
    .line 362
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 363
    .line 364
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->h:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 365
    .line 366
    sget-object v2, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;->INCLUDE_ALL_AND_PATH:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 367
    .line 368
    if-ne v1, v2, :cond_1f

    .line 369
    .line 370
    .line 371
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/filter/a;->G0(Lg7/b;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 372
    move-result-object v0

    .line 373
    .line 374
    if-eqz v0, :cond_1f

    .line 375
    .line 376
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 377
    return-object v0

    .line 378
    .line 379
    :cond_16
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v1}, Lg7/b;->s()Z

    .line 383
    move-result v1

    .line 384
    .line 385
    iget-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v2}, Lg7/b;->q()Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 389
    move-result-object v2

    .line 390
    .line 391
    if-eqz v2, :cond_17

    .line 392
    .line 393
    sget-object v3, Lcom/fasterxml/jackson/core/filter/TokenFilter;->a:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 394
    .line 395
    if-eq v2, v3, :cond_17

    .line 396
    .line 397
    .line 398
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/filter/TokenFilter;->b()V

    .line 399
    .line 400
    :cond_17
    iget-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2}, Lg7/b;->r()Lg7/b;

    .line 404
    move-result-object v2

    .line 405
    .line 406
    iput-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v2}, Lg7/b;->q()Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 410
    move-result-object v2

    .line 411
    .line 412
    iput-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 413
    .line 414
    if-eqz v1, :cond_1f

    .line 415
    .line 416
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 417
    return-object v0

    .line 418
    .line 419
    :cond_18
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 420
    .line 421
    sget-object v4, Lcom/fasterxml/jackson/core/filter/TokenFilter;->a:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 422
    .line 423
    if-ne v1, v4, :cond_19

    .line 424
    .line 425
    iget-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v2, v1, v3}, Lg7/b;->n(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lg7/b;

    .line 429
    move-result-object v1

    .line 430
    .line 431
    iput-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 432
    .line 433
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 434
    return-object v0

    .line 435
    .line 436
    :cond_19
    if-nez v1, :cond_1a

    .line 437
    .line 438
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->C0()Lcom/fasterxml/jackson/core/JsonParser;

    .line 442
    goto :goto_1

    .line 443
    .line 444
    :cond_1a
    iget-object v5, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v5, v1}, Lg7/b;->l(Lcom/fasterxml/jackson/core/filter/TokenFilter;)Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 448
    move-result-object v1

    .line 449
    .line 450
    if-nez v1, :cond_1b

    .line 451
    .line 452
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->C0()Lcom/fasterxml/jackson/core/JsonParser;

    .line 456
    goto :goto_1

    .line 457
    .line 458
    :cond_1b
    if-eq v1, v4, :cond_1c

    .line 459
    .line 460
    .line 461
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/filter/TokenFilter;->d()Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 462
    move-result-object v1

    .line 463
    .line 464
    :cond_1c
    iput-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->m:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    .line 465
    .line 466
    if-ne v1, v4, :cond_1d

    .line 467
    .line 468
    iget-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v2, v1, v3}, Lg7/b;->n(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lg7/b;

    .line 472
    move-result-object v1

    .line 473
    .line 474
    iput-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 475
    .line 476
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 477
    return-object v0

    .line 478
    .line 479
    :cond_1d
    if-eqz v1, :cond_1e

    .line 480
    .line 481
    iget-object v4, p0, Lcom/fasterxml/jackson/core/filter/a;->h:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 482
    .line 483
    sget-object v5, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;->INCLUDE_NON_NULL:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 484
    .line 485
    if-ne v4, v5, :cond_1e

    .line 486
    .line 487
    iget-object v2, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v2, v1, v3}, Lg7/b;->n(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lg7/b;

    .line 491
    move-result-object v1

    .line 492
    .line 493
    iput-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 494
    .line 495
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 496
    return-object v0

    .line 497
    .line 498
    :cond_1e
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v0, v1, v2}, Lg7/b;->n(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lg7/b;

    .line 502
    move-result-object v0

    .line 503
    .line 504
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->k:Lg7/b;

    .line 505
    .line 506
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->h:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 507
    .line 508
    sget-object v2, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;->INCLUDE_ALL_AND_PATH:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 509
    .line 510
    if-ne v1, v2, :cond_1f

    .line 511
    .line 512
    .line 513
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/filter/a;->G0(Lg7/b;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 514
    move-result-object v0

    .line 515
    .line 516
    if-eqz v0, :cond_1f

    .line 517
    .line 518
    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 519
    return-object v0

    .line 520
    .line 521
    .line 522
    :cond_1f
    :goto_1
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/filter/a;->F0()Lcom/fasterxml/jackson/core/JsonToken;

    .line 523
    move-result-object v0

    .line 524
    return-object v0
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
.end method

.method public u0()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/filter/a;->t0()Lcom/fasterxml/jackson/core/JsonToken;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/filter/a;->t0()Lcom/fasterxml/jackson/core/JsonToken;

    .line 12
    move-result-object v0

    .line 13
    :cond_0
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public v()Lcom/fasterxml/jackson/core/JsonLocation;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->v()Lcom/fasterxml/jackson/core/JsonLocation;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public w()Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/filter/a;->D0()Lcom/fasterxml/jackson/core/f;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 7
    .line 8
    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 9
    .line 10
    if-eq v1, v2, :cond_1

    .line 11
    .line 12
    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    goto :goto_0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->b()Ljava/lang/String;

    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->e()Lcom/fasterxml/jackson/core/f;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    const/4 v0, 0x0

    .line 28
    return-object v0

    .line 29
    .line 30
    .line 31
    :cond_2
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->b()Ljava/lang/String;

    .line 32
    move-result-object v0

    .line 33
    return-object v0
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
.end method

.method public x()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/a;->i:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    return-object v0
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
    .line 18
.end method

.method public x0(Lcom/fasterxml/jackson/core/Base64Variant;Ljava/io/OutputStream;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/fasterxml/jackson/core/JsonParser;->x0(Lcom/fasterxml/jackson/core/Base64Variant;Ljava/io/OutputStream;)I

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public final z()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/filter/a;->l()I

    .line 4
    move-result v0

    .line 5
    return v0
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
.end method
