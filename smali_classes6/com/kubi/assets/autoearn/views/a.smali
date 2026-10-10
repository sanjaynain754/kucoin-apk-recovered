.class public final Lcom/kubi/assets/autoearn/views/a;
.super Ljava/lang/Object;
.source "AutoEarnEntryView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "toStyle",
        "Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$Style;",
        "",
        "AssetsCenterLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(Ljava/lang/String;)Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$a;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/autoearn/views/a;->b(Ljava/lang/String;)Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$a;

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

.method public static final b(Ljava/lang/String;)Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$a;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    sparse-switch v0, :sswitch_data_0

    .line 8
    goto :goto_0

    .line 9
    .line 10
    :sswitch_0
    const-string v0, "CLOSED"

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    move-result p0

    .line 15
    .line 16
    if-nez p0, :cond_0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    sget-object p0, Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$a$b;->a:Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$a$b;

    .line 20
    return-object p0

    .line 21
    .line 22
    :sswitch_1
    const-string v0, "UNAVAILABLE"

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    move-result p0

    .line 27
    .line 28
    if-nez p0, :cond_1

    .line 29
    goto :goto_0

    .line 30
    .line 31
    :cond_1
    sget-object p0, Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$a$d;->a:Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$a$d;

    .line 32
    return-object p0

    .line 33
    .line 34
    :sswitch_2
    const-string v0, "PARTIALLY_OPENED"

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    move-result p0

    .line 39
    .line 40
    if-nez p0, :cond_2

    .line 41
    goto :goto_0

    .line 42
    .line 43
    :cond_2
    sget-object p0, Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$a$c;->a:Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$a$c;

    .line 44
    return-object p0

    .line 45
    .line 46
    :sswitch_3
    const-string v0, "OPENED"

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    move-result p0

    .line 51
    .line 52
    if-nez p0, :cond_3

    .line 53
    .line 54
    :goto_0
    sget-object p0, Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$a$b;->a:Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$a$b;

    .line 55
    return-object p0

    .line 56
    .line 57
    :cond_3
    sget-object p0, Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$a$a;->a:Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$a$a;

    .line 58
    return-object p0

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
    :sswitch_data_0
    .sparse-switch
        -0x74a94397 -> :sswitch_3
        -0x41c490e6 -> :sswitch_2
        0x58a96c30 -> :sswitch_1
        0x76a8d56c -> :sswitch_0
    .end sparse-switch
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
.end method
