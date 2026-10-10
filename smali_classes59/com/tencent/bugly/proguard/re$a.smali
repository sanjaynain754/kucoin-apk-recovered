.class public Lcom/tencent/bugly/proguard/re$a;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/re;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/tencent/bugly/proguard/re$c;",
        ">;"
    }
.end annotation


# direct methods
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


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/re$c;Lcom/tencent/bugly/proguard/re$c;)I
    .locals 4

    .line 1
    .line 2
    iget v0, p1, Lcom/tencent/bugly/proguard/re$c;->q:I

    .line 3
    .line 4
    iget v1, p1, Lcom/tencent/bugly/proguard/re$c;->r:I

    .line 5
    add-int/2addr v0, v1

    .line 6
    .line 7
    iget v1, p2, Lcom/tencent/bugly/proguard/re$c;->q:I

    .line 8
    .line 9
    iget v2, p2, Lcom/tencent/bugly/proguard/re$c;->r:I

    .line 10
    add-int/2addr v1, v2

    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, -0x1

    .line 13
    .line 14
    if-eq v0, v1, :cond_1

    .line 15
    .line 16
    if-le v0, v1, :cond_0

    .line 17
    return v3

    .line 18
    :cond_0
    return v2

    .line 19
    .line 20
    :cond_1
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/re$c;->y:Z

    .line 21
    .line 22
    iget-boolean v1, p2, Lcom/tencent/bugly/proguard/re$c;->y:Z

    .line 23
    .line 24
    if-eq v0, v1, :cond_3

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    return v3

    .line 28
    :cond_2
    return v2

    .line 29
    .line 30
    :cond_3
    iget-boolean p1, p1, Lcom/tencent/bugly/proguard/re$c;->z:Z

    .line 31
    .line 32
    iget-boolean p2, p2, Lcom/tencent/bugly/proguard/re$c;->z:Z

    .line 33
    .line 34
    if-eq p1, p2, :cond_5

    .line 35
    .line 36
    if-eqz v0, :cond_4

    .line 37
    return v3

    .line 38
    :cond_4
    return v2

    .line 39
    :cond_5
    const/4 p1, 0x0

    .line 40
    return p1
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

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/tencent/bugly/proguard/re$c;

    .line 3
    .line 4
    check-cast p2, Lcom/tencent/bugly/proguard/re$c;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/re$a;->a(Lcom/tencent/bugly/proguard/re$c;Lcom/tencent/bugly/proguard/re$c;)I

    .line 8
    move-result p1

    .line 9
    return p1
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
.end method
