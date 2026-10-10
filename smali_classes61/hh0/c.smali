.class public Lhh0/c;
.super Ljava/lang/Object;
.source "LinkScanner.java"


# direct methods
.method public static a(Ljava/lang/CharSequence;I)I
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    .line 7
    if-lt p1, v0, :cond_0

    .line 8
    return v1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 12
    move-result v0

    .line 13
    .line 14
    const/16 v2, 0x3c

    .line 15
    .line 16
    if-ne v0, v2, :cond_5

    .line 17
    .line 18
    :cond_1
    :goto_0
    add-int/lit8 p1, p1, 0x1

    .line 19
    .line 20
    .line 21
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 22
    move-result v0

    .line 23
    .line 24
    if-ge p1, v0, :cond_4

    .line 25
    .line 26
    .line 27
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 28
    move-result v0

    .line 29
    .line 30
    const/16 v3, 0xa

    .line 31
    .line 32
    if-eq v0, v3, :cond_4

    .line 33
    .line 34
    if-eq v0, v2, :cond_4

    .line 35
    .line 36
    const/16 v3, 0x3e

    .line 37
    .line 38
    if-eq v0, v3, :cond_3

    .line 39
    .line 40
    const/16 v3, 0x5c

    .line 41
    .line 42
    if-eq v0, v3, :cond_2

    .line 43
    goto :goto_0

    .line 44
    .line 45
    :cond_2
    add-int/lit8 v0, p1, 0x1

    .line 46
    .line 47
    .line 48
    invoke-static {p0, v0}, Lhh0/d;->g(Ljava/lang/CharSequence;I)Z

    .line 49
    move-result v3

    .line 50
    .line 51
    if-eqz v3, :cond_1

    .line 52
    move p1, v0

    .line 53
    goto :goto_0

    .line 54
    .line 55
    :cond_3
    add-int/lit8 p1, p1, 0x1

    .line 56
    return p1

    .line 57
    :cond_4
    return v1

    .line 58
    .line 59
    .line 60
    :cond_5
    invoke-static {p0, p1}, Lhh0/c;->b(Ljava/lang/CharSequence;I)I

    .line 61
    move-result p0

    .line 62
    return p0
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
.end method

.method public static b(Ljava/lang/CharSequence;I)I
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, p1

    .line 3
    .line 4
    .line 5
    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 6
    move-result v2

    .line 7
    .line 8
    if-ge v1, v2, :cond_8

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 12
    move-result v2

    .line 13
    const/4 v3, -0x1

    .line 14
    .line 15
    if-eqz v2, :cond_6

    .line 16
    .line 17
    const/16 v4, 0x20

    .line 18
    .line 19
    if-eq v2, v4, :cond_6

    .line 20
    .line 21
    const/16 v5, 0x5c

    .line 22
    .line 23
    if-eq v2, v5, :cond_4

    .line 24
    .line 25
    const/16 v5, 0x28

    .line 26
    .line 27
    if-eq v2, v5, :cond_3

    .line 28
    .line 29
    const/16 v4, 0x29

    .line 30
    .line 31
    if-eq v2, v4, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-static {v2}, Ljava/lang/Character;->isISOControl(C)Z

    .line 35
    move-result v2

    .line 36
    .line 37
    if-eqz v2, :cond_5

    .line 38
    .line 39
    if-eq v1, p1, :cond_0

    .line 40
    goto :goto_2

    .line 41
    :cond_0
    return v3

    .line 42
    .line 43
    :cond_1
    if-nez v0, :cond_2

    .line 44
    goto :goto_2

    .line 45
    .line 46
    :cond_2
    add-int/lit8 v0, v0, -0x1

    .line 47
    goto :goto_1

    .line 48
    .line 49
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    if-le v0, v4, :cond_5

    .line 52
    return v3

    .line 53
    .line 54
    :cond_4
    add-int/lit8 v2, v1, 0x1

    .line 55
    .line 56
    .line 57
    invoke-static {p0, v2}, Lhh0/d;->g(Ljava/lang/CharSequence;I)Z

    .line 58
    move-result v3

    .line 59
    .line 60
    if-eqz v3, :cond_5

    .line 61
    move v1, v2

    .line 62
    .line 63
    :cond_5
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 64
    goto :goto_0

    .line 65
    .line 66
    :cond_6
    if-eq v1, p1, :cond_7

    .line 67
    :goto_2
    return v1

    .line 68
    :cond_7
    return v3

    .line 69
    .line 70
    .line 71
    :cond_8
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 72
    move-result p0

    .line 73
    return p0
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
.end method

.method public static c(Ljava/lang/CharSequence;I)I
    .locals 2

    .line 1
    .line 2
    .line 3
    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-ge p1, v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 10
    move-result v0

    .line 11
    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    goto :goto_1

    .line 15
    :pswitch_0
    return p1

    .line 16
    .line 17
    :pswitch_1
    add-int/lit8 v0, p1, 0x1

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v0}, Lhh0/d;->g(Ljava/lang/CharSequence;I)Z

    .line 21
    move-result v1

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    move p1, v0

    .line 25
    .line 26
    :cond_0
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 27
    goto :goto_0

    .line 28
    :pswitch_2
    const/4 p0, -0x1

    .line 29
    return p0

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 33
    move-result p0

    .line 34
    return p0

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static d(Ljava/lang/CharSequence;I)I
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    .line 7
    if-lt p1, v0, :cond_0

    .line 8
    return v1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 12
    move-result v0

    .line 13
    .line 14
    const/16 v2, 0x22

    .line 15
    .line 16
    if-eq v0, v2, :cond_2

    .line 17
    .line 18
    const/16 v2, 0x27

    .line 19
    .line 20
    if-eq v0, v2, :cond_2

    .line 21
    .line 22
    const/16 v2, 0x28

    .line 23
    .line 24
    if-eq v0, v2, :cond_1

    .line 25
    return v1

    .line 26
    .line 27
    :cond_1
    const/16 v2, 0x29

    .line 28
    .line 29
    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 30
    .line 31
    .line 32
    invoke-static {p0, p1, v2}, Lhh0/c;->e(Ljava/lang/CharSequence;IC)I

    .line 33
    move-result p1

    .line 34
    .line 35
    if-ne p1, v1, :cond_3

    .line 36
    return v1

    .line 37
    .line 38
    .line 39
    :cond_3
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 40
    move-result v0

    .line 41
    .line 42
    if-ge p1, v0, :cond_5

    .line 43
    .line 44
    .line 45
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 46
    move-result p0

    .line 47
    .line 48
    if-eq p0, v2, :cond_4

    .line 49
    goto :goto_0

    .line 50
    .line 51
    :cond_4
    add-int/lit8 p1, p1, 0x1

    .line 52
    return p1

    .line 53
    :cond_5
    :goto_0
    return v1
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
.end method

.method public static e(Ljava/lang/CharSequence;IC)I
    .locals 3

    .line 1
    .line 2
    .line 3
    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-ge p1, v0, :cond_3

    .line 7
    .line 8
    .line 9
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 10
    move-result v0

    .line 11
    .line 12
    const/16 v1, 0x5c

    .line 13
    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    add-int/lit8 v1, p1, 0x1

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v1}, Lhh0/d;->g(Ljava/lang/CharSequence;I)Z

    .line 20
    move-result v2

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    move p1, v1

    .line 24
    goto :goto_1

    .line 25
    .line 26
    :cond_0
    if-ne v0, p2, :cond_1

    .line 27
    return p1

    .line 28
    .line 29
    :cond_1
    const/16 v1, 0x29

    .line 30
    .line 31
    if-ne p2, v1, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x28

    .line 34
    .line 35
    if-ne v0, v1, :cond_2

    .line 36
    const/4 p0, -0x1

    .line 37
    return p0

    .line 38
    .line 39
    :cond_2
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 40
    goto :goto_0

    .line 41
    .line 42
    .line 43
    :cond_3
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 44
    move-result p0

    .line 45
    return p0
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
.end method
