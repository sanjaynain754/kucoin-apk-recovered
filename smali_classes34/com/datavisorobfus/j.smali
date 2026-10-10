.class public Lcom/datavisorobfus/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    const-string v1, "DVSPCRONDE"

    .line 7
    .line 8
    .line 9
    invoke-static {p0, v1}, Lcom/datavisorobfus/u0;->e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    move-result-object p0

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    .line 19
    const-string/jumbo p0, "strCronTabDE is empty"

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/String;)V

    .line 23
    return v0

    .line 24
    .line 25
    :cond_1
    :try_start_0
    new-instance v1, Lorg/json/JSONArray;

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 29
    move p0, v0

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 33
    move-result v2

    .line 34
    .line 35
    if-ge p0, v2, :cond_3

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, p0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    .line 42
    invoke-static {v2}, Lcom/datavisorobfus/w0;->a(Ljava/lang/String;)Z

    .line 43
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    if-eqz v2, :cond_2

    .line 46
    const/4 p0, 0x1

    .line 47
    return p0

    .line 48
    .line 49
    :cond_2
    add-int/lit8 p0, p0, 0x1

    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    goto :goto_1

    .line 53
    :cond_3
    return v0

    .line 54
    .line 55
    .line 56
    :goto_1
    invoke-static {p0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    .line 57
    return v0
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

.method public static b(Landroid/content/Context;)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    const-string v1, "DVSPDVDE"

    .line 7
    .line 8
    .line 9
    invoke-static {p0, v1}, Lcom/datavisorobfus/u0;->e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    move-result-object p0

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    return v0

    .line 18
    .line 19
    :cond_1
    :try_start_0
    new-instance v1, Lorg/json/JSONArray;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 23
    move p0, v0

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 27
    move-result v2

    .line 28
    .line 29
    if-ge p0, v2, :cond_3

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    const-string v3, "&"

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 39
    move-result-object v2

    .line 40
    array-length v3, v2

    .line 41
    const/4 v4, 0x2

    .line 42
    .line 43
    if-ne v3, v4, :cond_2

    .line 44
    .line 45
    aget-object v3, v2, v0

    .line 46
    const/4 v4, 0x1

    .line 47
    .line 48
    aget-object v2, v2, v4

    .line 49
    .line 50
    .line 51
    invoke-static {v3}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    .line 52
    move-result v5

    .line 53
    .line 54
    if-nez v5, :cond_2

    .line 55
    .line 56
    .line 57
    invoke-static {v2}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    .line 58
    move-result v5

    .line 59
    .line 60
    if-nez v5, :cond_2

    .line 61
    .line 62
    new-instance v5, Ljava/text/SimpleDateFormat;

    .line 63
    .line 64
    .line 65
    const-string/jumbo v6, "yyyy-MM-dd HH:mm:ss"

    .line 66
    .line 67
    .line 68
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 69
    move-result-object v7

    .line 70
    .line 71
    .line 72
    invoke-direct {v5, v6, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, v0}, Ljava/text/DateFormat;->setLenient(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    const/4 v6, 0x0

    .line 77
    .line 78
    .line 79
    :try_start_1
    invoke-virtual {v5, v3}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 80
    move-result-object v3
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    .line 82
    .line 83
    :try_start_2
    invoke-virtual {v5, v2}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 84
    move-result-object v6
    :try_end_2
    .catch Ljava/text/ParseException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 85
    goto :goto_1

    .line 86
    :catch_0
    move-object v3, v6

    .line 87
    .line 88
    :catch_1
    :goto_1
    if-eqz v3, :cond_2

    .line 89
    .line 90
    if-eqz v6, :cond_2

    .line 91
    .line 92
    .line 93
    :try_start_3
    invoke-virtual {v3, v6}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    .line 94
    move-result v2

    .line 95
    .line 96
    if-gez v2, :cond_2

    .line 97
    .line 98
    new-instance v2, Ljava/util/Date;

    .line 99
    .line 100
    .line 101
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v3}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    .line 105
    move-result v3

    .line 106
    .line 107
    if-lez v3, :cond_2

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v6}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    .line 111
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 112
    .line 113
    if-gez v2, :cond_2

    .line 114
    return v4

    .line 115
    .line 116
    :cond_2
    add-int/lit8 p0, p0, 0x1

    .line 117
    goto :goto_0

    .line 118
    :catchall_0
    :cond_3
    return v0
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
