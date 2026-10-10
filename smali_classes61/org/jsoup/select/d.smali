.class public Lorg/jsoup/select/d;
.super Ljava/lang/Object;
.source "NodeTraversor.java"


# direct methods
.method public static a(Lorg/jsoup/select/NodeFilter;Lorg/jsoup/nodes/g;)Lorg/jsoup/select/NodeFilter$FilterResult;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    move-object v1, p1

    .line 3
    move v2, v0

    .line 4
    .line 5
    :goto_0
    if-eqz v1, :cond_a

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, v1, v2}, Lorg/jsoup/select/NodeFilter;->b(Lorg/jsoup/nodes/g;I)Lorg/jsoup/select/NodeFilter$FilterResult;

    .line 9
    move-result-object v3

    .line 10
    .line 11
    sget-object v4, Lorg/jsoup/select/NodeFilter$FilterResult;->STOP:Lorg/jsoup/select/NodeFilter$FilterResult;

    .line 12
    .line 13
    if-ne v3, v4, :cond_0

    .line 14
    return-object v3

    .line 15
    .line 16
    :cond_0
    sget-object v4, Lorg/jsoup/select/NodeFilter$FilterResult;->CONTINUE:Lorg/jsoup/select/NodeFilter$FilterResult;

    .line 17
    .line 18
    if-ne v3, v4, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lorg/jsoup/nodes/g;->m()I

    .line 22
    move-result v4

    .line 23
    .line 24
    if-lez v4, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v0}, Lorg/jsoup/nodes/g;->l(I)Lorg/jsoup/nodes/g;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    add-int/lit8 v2, v2, 0x1

    .line 31
    goto :goto_0

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_1
    invoke-virtual {v1}, Lorg/jsoup/nodes/g;->z()Lorg/jsoup/nodes/g;

    .line 35
    move-result-object v4

    .line 36
    .line 37
    if-nez v4, :cond_5

    .line 38
    .line 39
    if-lez v2, :cond_5

    .line 40
    .line 41
    sget-object v4, Lorg/jsoup/select/NodeFilter$FilterResult;->CONTINUE:Lorg/jsoup/select/NodeFilter$FilterResult;

    .line 42
    .line 43
    if-eq v3, v4, :cond_2

    .line 44
    .line 45
    sget-object v5, Lorg/jsoup/select/NodeFilter$FilterResult;->SKIP_CHILDREN:Lorg/jsoup/select/NodeFilter$FilterResult;

    .line 46
    .line 47
    if-ne v3, v5, :cond_3

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-interface {p0, v1, v2}, Lorg/jsoup/select/NodeFilter;->a(Lorg/jsoup/nodes/g;I)Lorg/jsoup/select/NodeFilter$FilterResult;

    .line 51
    move-result-object v3

    .line 52
    .line 53
    sget-object v5, Lorg/jsoup/select/NodeFilter$FilterResult;->STOP:Lorg/jsoup/select/NodeFilter$FilterResult;

    .line 54
    .line 55
    if-ne v3, v5, :cond_3

    .line 56
    return-object v3

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-virtual {v1}, Lorg/jsoup/nodes/g;->I()Lorg/jsoup/nodes/g;

    .line 60
    move-result-object v5

    .line 61
    .line 62
    add-int/lit8 v2, v2, -0x1

    .line 63
    .line 64
    sget-object v6, Lorg/jsoup/select/NodeFilter$FilterResult;->REMOVE:Lorg/jsoup/select/NodeFilter$FilterResult;

    .line 65
    .line 66
    if-ne v3, v6, :cond_4

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Lorg/jsoup/nodes/g;->L()V

    .line 70
    :cond_4
    move-object v3, v4

    .line 71
    move-object v1, v5

    .line 72
    goto :goto_1

    .line 73
    .line 74
    :cond_5
    sget-object v4, Lorg/jsoup/select/NodeFilter$FilterResult;->CONTINUE:Lorg/jsoup/select/NodeFilter$FilterResult;

    .line 75
    .line 76
    if-eq v3, v4, :cond_6

    .line 77
    .line 78
    sget-object v4, Lorg/jsoup/select/NodeFilter$FilterResult;->SKIP_CHILDREN:Lorg/jsoup/select/NodeFilter$FilterResult;

    .line 79
    .line 80
    if-ne v3, v4, :cond_7

    .line 81
    .line 82
    .line 83
    :cond_6
    invoke-interface {p0, v1, v2}, Lorg/jsoup/select/NodeFilter;->a(Lorg/jsoup/nodes/g;I)Lorg/jsoup/select/NodeFilter$FilterResult;

    .line 84
    move-result-object v3

    .line 85
    .line 86
    sget-object v4, Lorg/jsoup/select/NodeFilter$FilterResult;->STOP:Lorg/jsoup/select/NodeFilter$FilterResult;

    .line 87
    .line 88
    if-ne v3, v4, :cond_7

    .line 89
    return-object v3

    .line 90
    .line 91
    :cond_7
    if-ne v1, p1, :cond_8

    .line 92
    return-object v3

    .line 93
    .line 94
    .line 95
    :cond_8
    invoke-virtual {v1}, Lorg/jsoup/nodes/g;->z()Lorg/jsoup/nodes/g;

    .line 96
    move-result-object v4

    .line 97
    .line 98
    sget-object v5, Lorg/jsoup/select/NodeFilter$FilterResult;->REMOVE:Lorg/jsoup/select/NodeFilter$FilterResult;

    .line 99
    .line 100
    if-ne v3, v5, :cond_9

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Lorg/jsoup/nodes/g;->L()V

    .line 104
    :cond_9
    move-object v1, v4

    .line 105
    goto :goto_0

    .line 106
    .line 107
    :cond_a
    sget-object p0, Lorg/jsoup/select/NodeFilter$FilterResult;->CONTINUE:Lorg/jsoup/select/NodeFilter$FilterResult;

    .line 108
    return-object p0
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

.method public static b(Lorg/jsoup/select/NodeFilter;Lorg/jsoup/select/Elements;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lnh0/b;->i(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lnh0/b;->i(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    check-cast v0, Lorg/jsoup/nodes/Element;

    .line 23
    .line 24
    .line 25
    invoke-static {p0, v0}, Lorg/jsoup/select/d;->a(Lorg/jsoup/select/NodeFilter;Lorg/jsoup/nodes/g;)Lorg/jsoup/select/NodeFilter$FilterResult;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    sget-object v1, Lorg/jsoup/select/NodeFilter$FilterResult;->STOP:Lorg/jsoup/select/NodeFilter$FilterResult;

    .line 29
    .line 30
    if-ne v0, v1, :cond_0

    .line 31
    :cond_1
    return-void
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
.end method

.method public static c(Lqh0/a;Lorg/jsoup/nodes/g;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move-object v1, p1

    .line 3
    move v2, v0

    .line 4
    .line 5
    :goto_0
    if-eqz v1, :cond_3

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, v1, v2}, Lqh0/a;->b(Lorg/jsoup/nodes/g;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lorg/jsoup/nodes/g;->m()I

    .line 12
    move-result v3

    .line 13
    .line 14
    if-lez v3, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Lorg/jsoup/nodes/g;->l(I)Lorg/jsoup/nodes/g;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    add-int/lit8 v2, v2, 0x1

    .line 21
    goto :goto_0

    .line 22
    .line 23
    .line 24
    :cond_0
    :goto_1
    invoke-virtual {v1}, Lorg/jsoup/nodes/g;->z()Lorg/jsoup/nodes/g;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    if-lez v2, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-interface {p0, v1, v2}, Lqh0/a;->a(Lorg/jsoup/nodes/g;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lorg/jsoup/nodes/g;->I()Lorg/jsoup/nodes/g;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    add-int/lit8 v2, v2, -0x1

    .line 39
    goto :goto_1

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-interface {p0, v1, v2}, Lqh0/a;->a(Lorg/jsoup/nodes/g;I)V

    .line 43
    .line 44
    if-ne v1, p1, :cond_2

    .line 45
    goto :goto_2

    .line 46
    .line 47
    .line 48
    :cond_2
    invoke-virtual {v1}, Lorg/jsoup/nodes/g;->z()Lorg/jsoup/nodes/g;

    .line 49
    move-result-object v1

    .line 50
    goto :goto_0

    .line 51
    :cond_3
    :goto_2
    return-void
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
.end method

.method public static d(Lqh0/a;Lorg/jsoup/select/Elements;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lnh0/b;->i(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lnh0/b;->i(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    check-cast v0, Lorg/jsoup/nodes/Element;

    .line 23
    .line 24
    .line 25
    invoke-static {p0, v0}, Lorg/jsoup/select/d;->c(Lqh0/a;Lorg/jsoup/nodes/g;)V

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
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
.end method
