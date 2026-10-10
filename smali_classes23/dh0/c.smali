.class public Ldh0/c;
.super Ljava/lang/Object;
.source "JoinPointImpl.java"

# interfaces
.implements Lorg/aspectj/lang/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldh0/c$a;
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:[Ljava/lang/Object;

.field public d:Lorg/aspectj/lang/a$a;

.field public e:Lorg/aspectj/runtime/internal/a;

.field public f:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack<",
            "Lorg/aspectj/runtime/internal/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/aspectj/lang/a$a;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Ldh0/c;->e:Lorg/aspectj/runtime/internal/a;

    .line 7
    .line 8
    iput-object v0, p0, Ldh0/c;->f:Ljava/util/Stack;

    .line 9
    .line 10
    iput-object p1, p0, Ldh0/c;->d:Lorg/aspectj/lang/a$a;

    .line 11
    .line 12
    iput-object p2, p0, Ldh0/c;->a:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p3, p0, Ldh0/c;->b:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p4, p0, Ldh0/c;->c:[Ljava/lang/Object;

    .line 17
    return-void
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
    .line 215
    .line 216
    .line 217
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Ldh0/c;->f:Ljava/util/Stack;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Ldh0/c;->e:Lorg/aspectj/runtime/internal/a;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0}, Lorg/aspectj/runtime/internal/a;->getState()[Ljava/lang/Object;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lorg/aspectj/runtime/internal/a;->run([Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    check-cast v0, Lorg/aspectj/runtime/internal/a;

    .line 26
    .line 27
    iget-object v1, p0, Ldh0/c;->f:Ljava/util/Stack;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    check-cast v1, Lorg/aspectj/runtime/internal/a;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Lorg/aspectj/runtime/internal/a;->getState()[Ljava/lang/Object;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lorg/aspectj/runtime/internal/a;->run([Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    move-result-object v0

    .line 42
    return-object v0
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
.end method

.method public b()[Ljava/lang/Object;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Ldh0/c;->c:[Ljava/lang/Object;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-array v0, v1, [Ljava/lang/Object;

    .line 8
    .line 9
    iput-object v0, p0, Ldh0/c;->c:[Ljava/lang/Object;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Ldh0/c;->c:[Ljava/lang/Object;

    .line 12
    array-length v2, v0

    .line 13
    .line 14
    new-array v2, v2, [Ljava/lang/Object;

    .line 15
    array-length v3, v0

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 19
    return-object v2
    .line 20
.end method

.method public c(Lorg/aspectj/runtime/internal/a;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Ldh0/c;->e:Lorg/aspectj/runtime/internal/a;

    .line 3
    return-void
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public d([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Ldh0/c;->f:Ljava/util/Stack;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Ldh0/c;->e:Lorg/aspectj/runtime/internal/a;

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Lorg/aspectj/runtime/internal/a;

    .line 14
    .line 15
    :goto_0
    if-nez v0, :cond_1

    .line 16
    const/4 p1, 0x0

    .line 17
    return-object p1

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-virtual {v0}, Lorg/aspectj/runtime/internal/a;->getFlags()I

    .line 21
    move-result v1

    .line 22
    .line 23
    const/high16 v2, 0x10000

    .line 24
    and-int/2addr v2, v1

    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x1

    .line 27
    .line 28
    if-eqz v2, :cond_2

    .line 29
    move v2, v4

    .line 30
    goto :goto_1

    .line 31
    :cond_2
    move v2, v3

    .line 32
    .line 33
    :goto_1
    and-int/lit16 v5, v1, 0x1000

    .line 34
    .line 35
    if-eqz v5, :cond_3

    .line 36
    move v5, v4

    .line 37
    goto :goto_2

    .line 38
    :cond_3
    move v5, v3

    .line 39
    .line 40
    :goto_2
    and-int/lit16 v6, v1, 0x100

    .line 41
    .line 42
    if-eqz v6, :cond_4

    .line 43
    move v6, v4

    .line 44
    goto :goto_3

    .line 45
    :cond_4
    move v6, v3

    .line 46
    .line 47
    :goto_3
    and-int/lit8 v7, v1, 0x10

    .line 48
    .line 49
    if-eqz v7, :cond_5

    .line 50
    move v7, v4

    .line 51
    goto :goto_4

    .line 52
    :cond_5
    move v7, v3

    .line 53
    :goto_4
    and-int/2addr v1, v4

    .line 54
    .line 55
    if-eqz v1, :cond_6

    .line 56
    move v1, v4

    .line 57
    goto :goto_5

    .line 58
    :cond_6
    move v1, v3

    .line 59
    .line 60
    .line 61
    :goto_5
    invoke-virtual {v0}, Lorg/aspectj/runtime/internal/a;->getState()[Ljava/lang/Object;

    .line 62
    move-result-object v8

    .line 63
    .line 64
    if-eqz v7, :cond_7

    .line 65
    .line 66
    if-nez v2, :cond_7

    .line 67
    move v9, v4

    .line 68
    goto :goto_6

    .line 69
    :cond_7
    move v9, v3

    .line 70
    :goto_6
    add-int/2addr v9, v5

    .line 71
    .line 72
    if-eqz v5, :cond_8

    .line 73
    .line 74
    if-eqz v6, :cond_8

    .line 75
    .line 76
    aget-object v10, p1, v3

    .line 77
    .line 78
    aput-object v10, v8, v3

    .line 79
    move v10, v4

    .line 80
    goto :goto_7

    .line 81
    :cond_8
    move v10, v3

    .line 82
    .line 83
    :goto_7
    if-eqz v7, :cond_d

    .line 84
    .line 85
    if-eqz v1, :cond_d

    .line 86
    .line 87
    if-eqz v2, :cond_9

    .line 88
    .line 89
    add-int/lit8 v10, v6, 0x1

    .line 90
    .line 91
    aget-object v1, p1, v6

    .line 92
    .line 93
    aput-object v1, v8, v3

    .line 94
    goto :goto_a

    .line 95
    .line 96
    :cond_9
    if-eqz v5, :cond_a

    .line 97
    .line 98
    if-eqz v6, :cond_a

    .line 99
    move v10, v4

    .line 100
    goto :goto_8

    .line 101
    :cond_a
    move v10, v3

    .line 102
    .line 103
    :goto_8
    if-eqz v5, :cond_b

    .line 104
    .line 105
    if-eqz v6, :cond_b

    .line 106
    move v6, v4

    .line 107
    goto :goto_9

    .line 108
    :cond_b
    move v6, v3

    .line 109
    .line 110
    :goto_9
    if-eqz v7, :cond_c

    .line 111
    .line 112
    if-eqz v1, :cond_c

    .line 113
    .line 114
    if-nez v2, :cond_c

    .line 115
    move v3, v4

    .line 116
    .line 117
    :cond_c
    add-int v1, v6, v3

    .line 118
    .line 119
    aget-object v2, p1, v10

    .line 120
    .line 121
    aput-object v2, v8, v5

    .line 122
    move v10, v1

    .line 123
    :cond_d
    :goto_a
    move v1, v10

    .line 124
    :goto_b
    array-length v2, p1

    .line 125
    .line 126
    if-ge v1, v2, :cond_e

    .line 127
    .line 128
    sub-int v2, v1, v10

    .line 129
    add-int/2addr v2, v9

    .line 130
    .line 131
    aget-object v3, p1, v1

    .line 132
    .line 133
    aput-object v3, v8, v2

    .line 134
    .line 135
    add-int/lit8 v1, v1, 0x1

    .line 136
    goto :goto_b

    .line 137
    .line 138
    .line 139
    :cond_e
    invoke-virtual {v0, v8}, Lorg/aspectj/runtime/internal/a;->run([Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    move-result-object p1

    .line 141
    return-object p1
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
.end method

.method public e(Lorg/aspectj/runtime/internal/a;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ldh0/c;->f:Ljava/util/Stack;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Ljava/util/Stack;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    .line 10
    .line 11
    iput-object v0, p0, Ldh0/c;->f:Ljava/util/Stack;

    .line 12
    .line 13
    :cond_0
    if-nez p1, :cond_1

    .line 14
    .line 15
    iget-object p1, p0, Ldh0/c;->f:Ljava/util/Stack;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 19
    return-void

    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Ldh0/c;->f:Ljava/util/Stack;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    return-void
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
.end method

.method public getTarget()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ldh0/c;->b:Ljava/lang/Object;

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
    .line 19
    .line 20
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ldh0/c;->d:Lorg/aspectj/lang/a$a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lorg/aspectj/lang/a$a;->toString()Ljava/lang/String;

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
    .line 19
    .line 20
.end method
