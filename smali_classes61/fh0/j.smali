.class public Lfh0/j;
.super Lkh0/a;
.source "HeadingParser.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfh0/j$a;
    }
.end annotation


# instance fields
.field public final a:Lih0/j;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lkh0/a;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lih0/j;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lih0/j;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lfh0/j;->a:Lih0/j;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lih0/j;->o(I)V

    .line 14
    .line 15
    iput-object p2, p0, Lfh0/j;->b:Ljava/lang/String;

    .line 16
    return-void
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
.end method

.method public static synthetic i(Ljava/lang/CharSequence;I)Lfh0/j;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lfh0/j;->k(Ljava/lang/CharSequence;I)Lfh0/j;

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
.end method

.method public static synthetic j(Ljava/lang/CharSequence;I)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lfh0/j;->l(Ljava/lang/CharSequence;I)I

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static k(Ljava/lang/CharSequence;I)Lfh0/j;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 4
    move-result v0

    .line 5
    .line 6
    const/16 v1, 0x23

    .line 7
    .line 8
    .line 9
    invoke-static {v1, p0, p1, v0}, Lhh0/d;->k(CLjava/lang/CharSequence;II)I

    .line 10
    move-result v0

    .line 11
    sub-int/2addr v0, p1

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    if-eqz v0, :cond_4

    .line 15
    const/4 v3, 0x6

    .line 16
    .line 17
    if-le v0, v3, :cond_0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    add-int/2addr p1, v0

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 23
    move-result v3

    .line 24
    .line 25
    if-lt p1, v3, :cond_1

    .line 26
    .line 27
    new-instance p0, Lfh0/j;

    .line 28
    .line 29
    const-string p1, ""

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lfh0/j;-><init>(ILjava/lang/String;)V

    .line 33
    return-object p0

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 37
    move-result v3

    .line 38
    .line 39
    const/16 v4, 0x20

    .line 40
    .line 41
    if-eq v3, v4, :cond_2

    .line 42
    .line 43
    const/16 v4, 0x9

    .line 44
    .line 45
    if-eq v3, v4, :cond_2

    .line 46
    return-object v2

    .line 47
    .line 48
    .line 49
    :cond_2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 50
    move-result v2

    .line 51
    .line 52
    add-int/lit8 v2, v2, -0x1

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v2, p1}, Lhh0/d;->n(Ljava/lang/CharSequence;II)I

    .line 56
    move-result v2

    .line 57
    .line 58
    .line 59
    invoke-static {v1, p0, v2, p1}, Lhh0/d;->l(CLjava/lang/CharSequence;II)I

    .line 60
    move-result v1

    .line 61
    .line 62
    .line 63
    invoke-static {p0, v1, p1}, Lhh0/d;->n(Ljava/lang/CharSequence;II)I

    .line 64
    move-result v3

    .line 65
    .line 66
    if-eq v3, v1, :cond_3

    .line 67
    .line 68
    new-instance v1, Lfh0/j;

    .line 69
    .line 70
    add-int/lit8 v3, v3, 0x1

    .line 71
    .line 72
    .line 73
    invoke-interface {p0, p1, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 74
    move-result-object p0

    .line 75
    .line 76
    .line 77
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 78
    move-result-object p0

    .line 79
    .line 80
    .line 81
    invoke-direct {v1, v0, p0}, Lfh0/j;-><init>(ILjava/lang/String;)V

    .line 82
    return-object v1

    .line 83
    .line 84
    :cond_3
    new-instance v1, Lfh0/j;

    .line 85
    .line 86
    add-int/lit8 v2, v2, 0x1

    .line 87
    .line 88
    .line 89
    invoke-interface {p0, p1, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 90
    move-result-object p0

    .line 91
    .line 92
    .line 93
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 94
    move-result-object p0

    .line 95
    .line 96
    .line 97
    invoke-direct {v1, v0, p0}, Lfh0/j;-><init>(ILjava/lang/String;)V

    .line 98
    return-object v1

    .line 99
    :cond_4
    :goto_0
    return-object v2
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

.method public static l(Ljava/lang/CharSequence;I)I
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 4
    move-result v0

    .line 5
    .line 6
    const/16 v1, 0x2d

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    const/16 v3, 0x3d

    .line 12
    .line 13
    if-eq v0, v3, :cond_0

    .line 14
    goto :goto_0

    .line 15
    .line 16
    :cond_0
    add-int/lit8 v0, p1, 0x1

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v0, v3}, Lfh0/j;->m(Ljava/lang/CharSequence;IC)Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    return v2

    .line 24
    :cond_1
    add-int/2addr p1, v2

    .line 25
    .line 26
    .line 27
    invoke-static {p0, p1, v1}, Lfh0/j;->m(Ljava/lang/CharSequence;IC)Z

    .line 28
    move-result p0

    .line 29
    .line 30
    if-eqz p0, :cond_2

    .line 31
    const/4 p0, 0x2

    .line 32
    return p0

    .line 33
    :cond_2
    :goto_0
    const/4 p0, 0x0

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
.end method

.method public static m(Ljava/lang/CharSequence;IC)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-static {p2, p0, p1, v0}, Lhh0/d;->k(CLjava/lang/CharSequence;II)I

    .line 8
    move-result p1

    .line 9
    .line 10
    .line 11
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 12
    move-result p2

    .line 13
    .line 14
    .line 15
    invoke-static {p0, p1, p2}, Lhh0/d;->m(Ljava/lang/CharSequence;II)I

    .line 16
    move-result p1

    .line 17
    .line 18
    .line 19
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 20
    move-result p0

    .line 21
    .line 22
    if-lt p1, p0, :cond_0

    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
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
.end method


# virtual methods
.method public c()Lih0/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lfh0/j;->a:Lih0/j;

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
    .line 21
.end method

.method public e(Ljh0/a;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lfh0/j;->b:Ljava/lang/String;

    .line 3
    .line 4
    iget-object v1, p0, Lfh0/j;->a:Lih0/j;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1, v0, v1}, Ljh0/a;->a(Ljava/lang/String;Lih0/s;)V

    .line 8
    return-void
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
.end method

.method public h(Lkh0/h;)Lkh0/c;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkh0/c;->d()Lkh0/c;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method
