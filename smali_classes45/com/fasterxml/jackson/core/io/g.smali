.class public final Lcom/fasterxml/jackson/core/io/g;
.super Ljava/lang/Object;
.source "NumberInput.java"


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    const-wide/high16 v0, -0x8000000000000000L

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    sput-object v0, Lcom/fasterxml/jackson/core/io/g;->a:Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    const-wide v0, 0x7fffffffffffffffL

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    sput-object v0, Lcom/fasterxml/jackson/core/io/g;->b:Ljava/lang/String;

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
.end method

.method public static a(Ljava/lang/String;Z)Z
    .locals 6

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    sget-object p1, Lcom/fasterxml/jackson/core/io/g;->a:Ljava/lang/String;

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    sget-object p1, Lcom/fasterxml/jackson/core/io/g;->b:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 11
    move-result v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x1

    .line 17
    .line 18
    if-ge v1, v0, :cond_1

    .line 19
    return v2

    .line 20
    :cond_1
    const/4 v3, 0x0

    .line 21
    .line 22
    if-le v1, v0, :cond_2

    .line 23
    return v3

    .line 24
    :cond_2
    move v1, v3

    .line 25
    .line 26
    :goto_1
    if-ge v1, v0, :cond_5

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 30
    move-result v4

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 34
    move-result v5

    .line 35
    sub-int/2addr v4, v5

    .line 36
    .line 37
    if-eqz v4, :cond_4

    .line 38
    .line 39
    if-gez v4, :cond_3

    .line 40
    return v2

    .line 41
    :cond_3
    return v3

    .line 42
    .line 43
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 44
    goto :goto_1

    .line 45
    :cond_5
    return v2
.end method

.method public static b([CIIZ)Z
    .locals 5

    .line 1
    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    sget-object p3, Lcom/fasterxml/jackson/core/io/g;->a:Ljava/lang/String;

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    sget-object p3, Lcom/fasterxml/jackson/core/io/g;->b:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    :goto_0
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    .line 14
    if-ge p2, v0, :cond_1

    .line 15
    return v1

    .line 16
    :cond_1
    const/4 v2, 0x0

    .line 17
    .line 18
    if-le p2, v0, :cond_2

    .line 19
    return v2

    .line 20
    :cond_2
    move p2, v2

    .line 21
    .line 22
    :goto_1
    if-ge p2, v0, :cond_5

    .line 23
    .line 24
    add-int v3, p1, p2

    .line 25
    .line 26
    aget-char v3, p0, v3

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3, p2}, Ljava/lang/String;->charAt(I)C

    .line 30
    move-result v4

    .line 31
    sub-int/2addr v3, v4

    .line 32
    .line 33
    if-eqz v3, :cond_4

    .line 34
    .line 35
    if-gez v3, :cond_3

    .line 36
    return v1

    .line 37
    :cond_3
    return v2

    .line 38
    .line 39
    :cond_4
    add-int/lit8 p2, p2, 0x1

    .line 40
    goto :goto_1

    .line 41
    :cond_5
    return v1
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

.method public static c(Ljava/lang/String;D)D
    .locals 1

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    goto :goto_0

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 7
    move-result-object p0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    goto :goto_0

    .line 15
    .line 16
    .line 17
    :cond_1
    :try_start_0
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/g;->i(Ljava/lang/String;)D

    .line 18
    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    return-wide p0

    .line 20
    :catch_0
    :goto_0
    return-wide p1
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

.method public static d(Ljava/lang/String;I)I
    .locals 5

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    goto :goto_2

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 7
    move-result-object p0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    goto :goto_2

    .line 15
    :cond_1
    const/4 v1, 0x0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 19
    move-result v2

    .line 20
    .line 21
    const/16 v3, 0x2b

    .line 22
    const/4 v4, 0x1

    .line 23
    .line 24
    if-ne v2, v3, :cond_2

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 28
    move-result-object p0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 32
    move-result v0

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_2
    const/16 v3, 0x2d

    .line 36
    .line 37
    if-ne v2, v3, :cond_3

    .line 38
    move v1, v4

    .line 39
    .line 40
    :cond_3
    :goto_0
    if-ge v1, v0, :cond_6

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 44
    move-result v2

    .line 45
    .line 46
    const/16 v3, 0x39

    .line 47
    .line 48
    if-gt v2, v3, :cond_5

    .line 49
    .line 50
    const/16 v3, 0x30

    .line 51
    .line 52
    if-ge v2, v3, :cond_4

    .line 53
    goto :goto_1

    .line 54
    .line 55
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 56
    goto :goto_0

    .line 57
    .line 58
    .line 59
    :cond_5
    :goto_1
    :try_start_0
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/g;->i(Ljava/lang/String;)D

    .line 60
    move-result-wide p0

    .line 61
    double-to-int p0, p0

    .line 62
    return p0

    .line 63
    .line 64
    .line 65
    :cond_6
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 66
    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    return p0

    .line 68
    :catch_0
    :goto_2
    return p1
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
.end method

.method public static e(Ljava/lang/String;J)J
    .locals 5

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    goto :goto_2

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 7
    move-result-object p0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    goto :goto_2

    .line 15
    :cond_1
    const/4 v1, 0x0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 19
    move-result v2

    .line 20
    .line 21
    const/16 v3, 0x2b

    .line 22
    const/4 v4, 0x1

    .line 23
    .line 24
    if-ne v2, v3, :cond_2

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 28
    move-result-object p0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 32
    move-result v0

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_2
    const/16 v3, 0x2d

    .line 36
    .line 37
    if-ne v2, v3, :cond_3

    .line 38
    move v1, v4

    .line 39
    .line 40
    :cond_3
    :goto_0
    if-ge v1, v0, :cond_6

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 44
    move-result v2

    .line 45
    .line 46
    const/16 v3, 0x39

    .line 47
    .line 48
    if-gt v2, v3, :cond_5

    .line 49
    .line 50
    const/16 v3, 0x30

    .line 51
    .line 52
    if-ge v2, v3, :cond_4

    .line 53
    goto :goto_1

    .line 54
    .line 55
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 56
    goto :goto_0

    .line 57
    .line 58
    .line 59
    :cond_5
    :goto_1
    :try_start_0
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/g;->i(Ljava/lang/String;)D

    .line 60
    move-result-wide p0

    .line 61
    double-to-long p0, p0

    .line 62
    return-wide p0

    .line 63
    .line 64
    .line 65
    :cond_6
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 66
    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    return-wide p0

    .line 68
    :catch_0
    :goto_2
    return-wide p1
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
.end method

.method public static f(Ljava/lang/String;)Ljava/math/BigDecimal;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/a;->b(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static g([C)Ljava/math/BigDecimal;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/a;->c([C)Ljava/math/BigDecimal;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static h([CII)Ljava/math/BigDecimal;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/fasterxml/jackson/core/io/a;->d([CII)Ljava/math/BigDecimal;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static i(Ljava/lang/String;)D
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "2.2250738585072012e-308"

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-wide/16 v0, 0x1

    .line 11
    return-wide v0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 15
    move-result-wide v0

    .line 16
    return-wide v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static j(Ljava/lang/String;)I
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 5
    move-result v1

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 9
    move-result v2

    .line 10
    .line 11
    const/16 v3, 0x2d

    .line 12
    const/4 v4, 0x1

    .line 13
    .line 14
    if-ne v1, v3, :cond_0

    .line 15
    move v0, v4

    .line 16
    :cond_0
    const/4 v3, 0x2

    .line 17
    .line 18
    const/16 v5, 0xa

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    if-eq v2, v4, :cond_2

    .line 23
    .line 24
    if-le v2, v5, :cond_1

    .line 25
    goto :goto_0

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 29
    move-result v1

    .line 30
    move v4, v3

    .line 31
    goto :goto_1

    .line 32
    .line 33
    .line 34
    :cond_2
    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    .line 38
    :cond_3
    const/16 v6, 0x9

    .line 39
    .line 40
    if-le v2, v6, :cond_4

    .line 41
    .line 42
    .line 43
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    .line 47
    :cond_4
    :goto_1
    const/16 v6, 0x39

    .line 48
    .line 49
    if-gt v1, v6, :cond_f

    .line 50
    .line 51
    const/16 v7, 0x30

    .line 52
    .line 53
    if-ge v1, v7, :cond_5

    .line 54
    goto :goto_7

    .line 55
    :cond_5
    sub-int/2addr v1, v7

    .line 56
    .line 57
    if-ge v4, v2, :cond_d

    .line 58
    .line 59
    add-int/lit8 v8, v4, 0x1

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 63
    move-result v9

    .line 64
    .line 65
    if-gt v9, v6, :cond_c

    .line 66
    .line 67
    if-ge v9, v7, :cond_6

    .line 68
    goto :goto_5

    .line 69
    .line 70
    :cond_6
    mul-int/lit8 v1, v1, 0xa

    .line 71
    sub-int/2addr v9, v7

    .line 72
    add-int/2addr v1, v9

    .line 73
    .line 74
    if-ge v8, v2, :cond_d

    .line 75
    add-int/2addr v4, v3

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    .line 79
    move-result v3

    .line 80
    .line 81
    if-gt v3, v6, :cond_b

    .line 82
    .line 83
    if-ge v3, v7, :cond_7

    .line 84
    goto :goto_4

    .line 85
    .line 86
    :cond_7
    mul-int/lit8 v1, v1, 0xa

    .line 87
    sub-int/2addr v3, v7

    .line 88
    add-int/2addr v1, v3

    .line 89
    .line 90
    if-ge v4, v2, :cond_d

    .line 91
    .line 92
    :goto_2
    add-int/lit8 v3, v4, 0x1

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 96
    move-result v4

    .line 97
    .line 98
    if-gt v4, v6, :cond_a

    .line 99
    .line 100
    if-ge v4, v7, :cond_8

    .line 101
    goto :goto_3

    .line 102
    :cond_8
    mul-int/2addr v1, v5

    .line 103
    .line 104
    add-int/lit8 v4, v4, -0x30

    .line 105
    add-int/2addr v1, v4

    .line 106
    .line 107
    if-lt v3, v2, :cond_9

    .line 108
    goto :goto_6

    .line 109
    :cond_9
    move v4, v3

    .line 110
    goto :goto_2

    .line 111
    .line 112
    .line 113
    :cond_a
    :goto_3
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 114
    move-result p0

    .line 115
    return p0

    .line 116
    .line 117
    .line 118
    :cond_b
    :goto_4
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 119
    move-result p0

    .line 120
    return p0

    .line 121
    .line 122
    .line 123
    :cond_c
    :goto_5
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 124
    move-result p0

    .line 125
    return p0

    .line 126
    .line 127
    :cond_d
    :goto_6
    if-eqz v0, :cond_e

    .line 128
    neg-int p0, v1

    .line 129
    return p0

    .line 130
    :cond_e
    return v1

    .line 131
    .line 132
    .line 133
    :cond_f
    :goto_7
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 134
    move-result p0

    .line 135
    return p0
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
.end method

.method public static k([CII)I
    .locals 2

    .line 1
    .line 2
    add-int v0, p1, p2

    .line 3
    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    .line 6
    aget-char v0, p0, v0

    .line 7
    .line 8
    add-int/lit8 v0, v0, -0x30

    .line 9
    .line 10
    .line 11
    packed-switch p2, :pswitch_data_0

    .line 12
    return v0

    .line 13
    .line 14
    :pswitch_0
    add-int/lit8 p2, p1, 0x1

    .line 15
    .line 16
    aget-char p1, p0, p1

    .line 17
    .line 18
    add-int/lit8 p1, p1, -0x30

    .line 19
    .line 20
    .line 21
    const v1, 0x5f5e100

    .line 22
    mul-int/2addr p1, v1

    .line 23
    add-int/2addr v0, p1

    .line 24
    move p1, p2

    .line 25
    .line 26
    :pswitch_1
    add-int/lit8 p2, p1, 0x1

    .line 27
    .line 28
    aget-char p1, p0, p1

    .line 29
    .line 30
    add-int/lit8 p1, p1, -0x30

    .line 31
    .line 32
    .line 33
    const v1, 0x989680

    .line 34
    mul-int/2addr p1, v1

    .line 35
    add-int/2addr v0, p1

    .line 36
    move p1, p2

    .line 37
    .line 38
    :pswitch_2
    add-int/lit8 p2, p1, 0x1

    .line 39
    .line 40
    aget-char p1, p0, p1

    .line 41
    .line 42
    add-int/lit8 p1, p1, -0x30

    .line 43
    .line 44
    .line 45
    const v1, 0xf4240

    .line 46
    mul-int/2addr p1, v1

    .line 47
    add-int/2addr v0, p1

    .line 48
    move p1, p2

    .line 49
    .line 50
    :pswitch_3
    add-int/lit8 p2, p1, 0x1

    .line 51
    .line 52
    aget-char p1, p0, p1

    .line 53
    .line 54
    add-int/lit8 p1, p1, -0x30

    .line 55
    .line 56
    .line 57
    const v1, 0x186a0

    .line 58
    mul-int/2addr p1, v1

    .line 59
    add-int/2addr v0, p1

    .line 60
    move p1, p2

    .line 61
    .line 62
    :pswitch_4
    add-int/lit8 p2, p1, 0x1

    .line 63
    .line 64
    aget-char p1, p0, p1

    .line 65
    .line 66
    add-int/lit8 p1, p1, -0x30

    .line 67
    .line 68
    mul-int/lit16 p1, p1, 0x2710

    .line 69
    add-int/2addr v0, p1

    .line 70
    move p1, p2

    .line 71
    .line 72
    :pswitch_5
    add-int/lit8 p2, p1, 0x1

    .line 73
    .line 74
    aget-char p1, p0, p1

    .line 75
    .line 76
    add-int/lit8 p1, p1, -0x30

    .line 77
    .line 78
    mul-int/lit16 p1, p1, 0x3e8

    .line 79
    add-int/2addr v0, p1

    .line 80
    move p1, p2

    .line 81
    .line 82
    :pswitch_6
    add-int/lit8 p2, p1, 0x1

    .line 83
    .line 84
    aget-char p1, p0, p1

    .line 85
    .line 86
    add-int/lit8 p1, p1, -0x30

    .line 87
    .line 88
    mul-int/lit8 p1, p1, 0x64

    .line 89
    add-int/2addr v0, p1

    .line 90
    move p1, p2

    .line 91
    .line 92
    :pswitch_7
    aget-char p0, p0, p1

    .line 93
    .line 94
    add-int/lit8 p0, p0, -0x30

    .line 95
    .line 96
    mul-int/lit8 p0, p0, 0xa

    .line 97
    add-int/2addr v0, p0

    .line 98
    return v0

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static l(Ljava/lang/String;)J
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    move-result v0

    .line 5
    .line 6
    const/16 v1, 0x9

    .line 7
    .line 8
    if-gt v0, v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/g;->j(Ljava/lang/String;)I

    .line 12
    move-result p0

    .line 13
    int-to-long v0, p0

    .line 14
    return-wide v0

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 18
    move-result-wide v0

    .line 19
    return-wide v0
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static m([CII)J
    .locals 5

    .line 1
    .line 2
    const/16 v0, 0x9

    .line 3
    sub-int/2addr p2, v0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, p2}, Lcom/fasterxml/jackson/core/io/g;->k([CII)I

    .line 7
    move-result v1

    .line 8
    int-to-long v1, v1

    .line 9
    .line 10
    .line 11
    const-wide/32 v3, 0x3b9aca00

    .line 12
    mul-long/2addr v1, v3

    .line 13
    add-int/2addr p1, p2

    .line 14
    .line 15
    .line 16
    invoke-static {p0, p1, v0}, Lcom/fasterxml/jackson/core/io/g;->k([CII)I

    .line 17
    move-result p0

    .line 18
    int-to-long p0, p0

    .line 19
    add-long/2addr v1, p0

    .line 20
    return-wide v1
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
.end method
