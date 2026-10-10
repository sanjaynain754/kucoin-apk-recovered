.class public Lfh0/s;
.super Lkh0/a;
.source "ThematicBreakParser.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfh0/s$a;
    }
.end annotation


# instance fields
.field public final a:Lih0/y;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lkh0/a;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lih0/y;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lih0/y;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lfh0/s;->a:Lih0/y;

    .line 11
    return-void
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

.method public static synthetic i(Ljava/lang/CharSequence;I)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lfh0/s;->j(Ljava/lang/CharSequence;I)Z

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

.method public static j(Ljava/lang/CharSequence;I)Z
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    move v3, v2

    .line 8
    move v4, v3

    .line 9
    .line 10
    :goto_0
    if-ge p1, v0, :cond_4

    .line 11
    .line 12
    .line 13
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 14
    move-result v5

    .line 15
    .line 16
    const/16 v6, 0x9

    .line 17
    .line 18
    if-eq v5, v6, :cond_3

    .line 19
    .line 20
    const/16 v6, 0x20

    .line 21
    .line 22
    if-eq v5, v6, :cond_3

    .line 23
    .line 24
    const/16 v6, 0x2a

    .line 25
    .line 26
    if-eq v5, v6, :cond_2

    .line 27
    .line 28
    const/16 v6, 0x2d

    .line 29
    .line 30
    if-eq v5, v6, :cond_1

    .line 31
    .line 32
    const/16 v6, 0x5f

    .line 33
    .line 34
    if-eq v5, v6, :cond_0

    .line 35
    return v1

    .line 36
    .line 37
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 38
    goto :goto_1

    .line 39
    .line 40
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 41
    goto :goto_1

    .line 42
    .line 43
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 44
    .line 45
    :cond_3
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 46
    goto :goto_0

    .line 47
    :cond_4
    const/4 p0, 0x3

    .line 48
    .line 49
    if-lt v2, p0, :cond_5

    .line 50
    .line 51
    if-nez v3, :cond_5

    .line 52
    .line 53
    if-eqz v4, :cond_7

    .line 54
    .line 55
    :cond_5
    if-lt v3, p0, :cond_6

    .line 56
    .line 57
    if-nez v2, :cond_6

    .line 58
    .line 59
    if-eqz v4, :cond_7

    .line 60
    .line 61
    :cond_6
    if-lt v4, p0, :cond_8

    .line 62
    .line 63
    if-nez v2, :cond_8

    .line 64
    .line 65
    if-nez v3, :cond_8

    .line 66
    :cond_7
    const/4 p0, 0x1

    .line 67
    return p0

    .line 68
    :cond_8
    return v1
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


# virtual methods
.method public c()Lih0/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lfh0/s;->a:Lih0/y;

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
