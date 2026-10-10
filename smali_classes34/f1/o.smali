.class public Lf1/o;
.super Lf1/g;
.source "TextKeyframeAnimation.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf1/g<",
        "Lcom/airbnb/lottie/model/DocumentData;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lp1/a<",
            "Lcom/airbnb/lottie/model/DocumentData;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lf1/g;-><init>(Ljava/util/List;)V

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public bridge synthetic i(Lp1/a;F)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lf1/o;->q(Lp1/a;F)Lcom/airbnb/lottie/model/DocumentData;

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
.end method

.method public q(Lp1/a;F)Lcom/airbnb/lottie/model/DocumentData;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/a<",
            "Lcom/airbnb/lottie/model/DocumentData;",
            ">;F)",
            "Lcom/airbnb/lottie/model/DocumentData;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf1/a;->e:Lp1/c;

    .line 3
    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget v1, p1, Lp1/a;->g:F

    .line 7
    .line 8
    iget-object v2, p1, Lp1/a;->h:Ljava/lang/Float;

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    .line 13
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 14
    goto :goto_0

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 18
    move-result v2

    .line 19
    .line 20
    :goto_0
    iget-object v3, p1, Lp1/a;->b:Ljava/lang/Object;

    .line 21
    move-object v4, v3

    .line 22
    move-object v3, v4

    .line 23
    .line 24
    check-cast v3, Lcom/airbnb/lottie/model/DocumentData;

    .line 25
    .line 26
    iget-object p1, p1, Lp1/a;->c:Ljava/lang/Object;

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    move-object p1, v4

    .line 30
    .line 31
    check-cast p1, Lcom/airbnb/lottie/model/DocumentData;

    .line 32
    :goto_1
    move-object v4, p1

    .line 33
    goto :goto_2

    .line 34
    .line 35
    :cond_1
    check-cast p1, Lcom/airbnb/lottie/model/DocumentData;

    .line 36
    goto :goto_1

    .line 37
    .line 38
    .line 39
    :goto_2
    invoke-virtual {p0}, Lf1/a;->d()F

    .line 40
    move-result v6

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lf1/a;->f()F

    .line 44
    move-result v7

    .line 45
    move v5, p2

    .line 46
    .line 47
    .line 48
    invoke-virtual/range {v0 .. v7}, Lp1/c;->b(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    check-cast p1, Lcom/airbnb/lottie/model/DocumentData;

    .line 52
    return-object p1

    .line 53
    :cond_2
    move v5, p2

    .line 54
    .line 55
    const/high16 p2, 0x3f800000    # 1.0f

    .line 56
    .line 57
    cmpl-float p2, v5, p2

    .line 58
    .line 59
    if-nez p2, :cond_4

    .line 60
    .line 61
    iget-object p2, p1, Lp1/a;->c:Ljava/lang/Object;

    .line 62
    .line 63
    if-nez p2, :cond_3

    .line 64
    goto :goto_3

    .line 65
    .line 66
    :cond_3
    check-cast p2, Lcom/airbnb/lottie/model/DocumentData;

    .line 67
    return-object p2

    .line 68
    .line 69
    :cond_4
    :goto_3
    iget-object p1, p1, Lp1/a;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, Lcom/airbnb/lottie/model/DocumentData;

    .line 72
    return-object p1
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
.end method

.method public r(Lp1/c;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lp1/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lp1/b;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/airbnb/lottie/model/DocumentData;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/airbnb/lottie/model/DocumentData;-><init>()V

    .line 11
    .line 12
    new-instance v2, Lf1/o$a;

    .line 13
    .line 14
    .line 15
    invoke-direct {v2, p0, v0, p1, v1}, Lf1/o$a;-><init>(Lf1/o;Lp1/b;Lp1/c;Lcom/airbnb/lottie/model/DocumentData;)V

    .line 16
    .line 17
    .line 18
    invoke-super {p0, v2}, Lf1/a;->o(Lp1/c;)V

    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
.end method
