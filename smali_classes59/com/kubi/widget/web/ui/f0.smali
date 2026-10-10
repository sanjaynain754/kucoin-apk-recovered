.class public final Lcom/kubi/widget/web/ui/f0;
.super Ljava/lang/Object;
.source "KWebUIConfig.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u001a\u0015\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0002\u0010\u0003\u001a\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002\u00a8\u0006\u0007"
    }
    d2 = {
        "toStrictBooleanOrNull",
        "",
        "",
        "(Ljava/lang/String;)Ljava/lang/Boolean;",
        "extractRawUrlParameter",
        "url",
        "key",
        "LWebWidget_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nKWebUIConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebUIConfig.kt\ncom/kubi/widget/web/ui/KWebUIConfigKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1#2:215\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/widget/web/ui/f0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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
.end method

.method public static final synthetic b(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/widget/web/ui/f0;->d(Ljava/lang/String;)Ljava/lang/Boolean;

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
.end method

.method public static final c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    const/4 v4, 0x6

    .line 2
    const/4 v5, 0x0

    .line 3
    .line 4
    const/16 v1, 0x3f

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    move-object v0, p0

    .line 8
    .line 9
    .line 10
    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    .line 11
    move-result p0

    .line 12
    const/4 v6, 0x0

    .line 13
    .line 14
    if-gez p0, :cond_0

    .line 15
    return-object v6

    .line 16
    .line 17
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const/16 p1, 0x3d

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    add-int/lit8 p0, p0, 0x1

    .line 35
    move v2, p0

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 39
    move-result p0

    .line 40
    .line 41
    if-ge v2, p0, :cond_6

    .line 42
    const/4 v4, 0x4

    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v3, 0x0

    .line 45
    .line 46
    .line 47
    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 48
    move-result p0

    .line 49
    .line 50
    if-ltz p0, :cond_6

    .line 51
    .line 52
    if-lez p0, :cond_1

    .line 53
    .line 54
    add-int/lit8 p1, p0, -0x1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    .line 58
    move-result p1

    .line 59
    .line 60
    .line 61
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 62
    move-result-object p1

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    move-object p1, v6

    .line 65
    .line 66
    :goto_1
    if-nez p1, :cond_2

    .line 67
    goto :goto_2

    .line 68
    .line 69
    .line 70
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 71
    move-result v2

    .line 72
    .line 73
    const/16 v3, 0x3f

    .line 74
    .line 75
    if-eq v2, v3, :cond_7

    .line 76
    .line 77
    :goto_2
    if-nez p1, :cond_3

    .line 78
    goto :goto_3

    .line 79
    .line 80
    .line 81
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 82
    move-result v2

    .line 83
    .line 84
    const/16 v3, 0x26

    .line 85
    .line 86
    if-eq v2, v3, :cond_7

    .line 87
    .line 88
    :goto_3
    if-nez p1, :cond_4

    .line 89
    goto :goto_4

    .line 90
    .line 91
    .line 92
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 93
    move-result p1

    .line 94
    .line 95
    const/16 v2, 0x23

    .line 96
    .line 97
    if-ne p1, v2, :cond_5

    .line 98
    goto :goto_5

    .line 99
    .line 100
    .line 101
    :cond_5
    :goto_4
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 102
    move-result p1

    .line 103
    .line 104
    add-int v2, p0, p1

    .line 105
    goto :goto_0

    .line 106
    :cond_6
    const/4 p0, -0x1

    .line 107
    .line 108
    :cond_7
    :goto_5
    if-gez p0, :cond_8

    .line 109
    return-object v6

    .line 110
    .line 111
    .line 112
    :cond_8
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 113
    move-result p1

    .line 114
    .line 115
    add-int v2, p0, p1

    .line 116
    const/4 v4, 0x4

    .line 117
    const/4 v5, 0x0

    .line 118
    .line 119
    const/16 v1, 0x26

    .line 120
    const/4 v3, 0x0

    .line 121
    .line 122
    .line 123
    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    .line 124
    move-result p0

    .line 125
    .line 126
    .line 127
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    move-result-object p0

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 132
    move-result p1

    .line 133
    .line 134
    if-ltz p1, :cond_9

    .line 135
    goto :goto_6

    .line 136
    :cond_9
    move-object p0, v6

    .line 137
    .line 138
    :goto_6
    if-eqz p0, :cond_a

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 142
    move-result p0

    .line 143
    goto :goto_7

    .line 144
    .line 145
    .line 146
    :cond_a
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 147
    move-result p0

    .line 148
    :goto_7
    const/4 v4, 0x4

    .line 149
    const/4 v5, 0x0

    .line 150
    .line 151
    const/16 v1, 0x23

    .line 152
    const/4 v3, 0x0

    .line 153
    .line 154
    .line 155
    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    .line 156
    move-result p1

    .line 157
    .line 158
    .line 159
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 160
    move-result-object p1

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 164
    move-result v1

    .line 165
    .line 166
    if-ltz v1, :cond_b

    .line 167
    goto :goto_8

    .line 168
    :cond_b
    move-object p1, v6

    .line 169
    .line 170
    :goto_8
    if-eqz p1, :cond_c

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 174
    move-result p1

    .line 175
    goto :goto_9

    .line 176
    .line 177
    .line 178
    :cond_c
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 179
    move-result p1

    .line 180
    .line 181
    .line 182
    :goto_9
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    .line 183
    move-result p0

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v2, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 187
    move-result-object p0

    .line 188
    .line 189
    .line 190
    const-string/jumbo p1, "substring(...)"

    .line 191
    .line 192
    .line 193
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 197
    move-result p1

    .line 198
    .line 199
    if-lez p1, :cond_d

    .line 200
    return-object p0

    .line 201
    :cond_d
    return-object v6
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

.method public static final d(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p0, :cond_2

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 7
    move-result-object p0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    goto :goto_0

    .line 15
    .line 16
    .line 17
    :cond_0
    const-string/jumbo v1, "true"

    .line 18
    const/4 v2, 0x1

    .line 19
    .line 20
    .line 21
    invoke-static {p0, v1, v2}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 22
    move-result v1

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    return-object p0

    .line 28
    .line 29
    :cond_1
    const-string v1, "false"

    .line 30
    .line 31
    .line 32
    invoke-static {p0, v1, v2}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 33
    move-result p0

    .line 34
    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 38
    return-object p0

    .line 39
    :cond_2
    :goto_0
    return-object v0
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
.end method
