.class public final Lcom/tencent/bugly/common/replay/tool/AndroidTextLayout;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/common/replay/tool/TextLayout;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000c\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/tencent/bugly/common/replay/tool/AndroidTextLayout;",
        "Lcom/tencent/bugly/common/replay/tool/TextLayout;",
        "layout",
        "Landroid/text/Layout;",
        "(Landroid/text/Layout;)V",
        "dominantTextColor",
        "",
        "getDominantTextColor",
        "()Ljava/lang/Integer;",
        "lineCount",
        "getLineCount",
        "()I",
        "getEllipsisCount",
        "line",
        "getLineBottom",
        "getLineStart",
        "getLineTop",
        "getLineVisibleEnd",
        "getPrimaryHorizontal",
        "",
        "offset",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final layout:Landroid/text/Layout;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/text/Layout;)V
    .locals 1
    .param p1    # Landroid/text/Layout;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "layout"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/tencent/bugly/common/replay/tool/AndroidTextLayout;->layout:Landroid/text/Layout;

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
    .line 22
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public getDominantTextColor()Ljava/lang/Integer;
    .locals 11
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/tool/AndroidTextLayout;->layout:Landroid/text/Layout;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    instance-of v0, v0, Landroid/text/Spanned;

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    return-object v1

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/tool/AndroidTextLayout;->layout:Landroid/text/Layout;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    const-string/jumbo v2, "null cannot be cast to non-null type android.text.Spanned"

    .line 22
    .line 23
    if-eqz v0, :cond_7

    .line 24
    .line 25
    check-cast v0, Landroid/text/Spanned;

    .line 26
    .line 27
    iget-object v3, p0, Lcom/tencent/bugly/common/replay/tool/AndroidTextLayout;->layout:Landroid/text/Layout;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 31
    move-result-object v3

    .line 32
    .line 33
    .line 34
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 35
    move-result v3

    .line 36
    .line 37
    const-class v4, Landroid/text/style/ForegroundColorSpan;

    .line 38
    const/4 v5, 0x0

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v5, v3, v4}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    check-cast v0, [Landroid/text/style/ForegroundColorSpan;

    .line 45
    .line 46
    .line 47
    const-string/jumbo v3, "spans"

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    array-length v3, v0

    .line 52
    .line 53
    const/high16 v4, -0x80000000

    .line 54
    move-object v6, v1

    .line 55
    .line 56
    :goto_0
    if-ge v5, v3, :cond_5

    .line 57
    .line 58
    aget-object v7, v0, v5

    .line 59
    .line 60
    iget-object v8, p0, Lcom/tencent/bugly/common/replay/tool/AndroidTextLayout;->layout:Landroid/text/Layout;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v8}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 64
    move-result-object v8

    .line 65
    .line 66
    if-eqz v8, :cond_4

    .line 67
    .line 68
    check-cast v8, Landroid/text/Spanned;

    .line 69
    .line 70
    .line 71
    invoke-interface {v8, v7}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 72
    move-result v8

    .line 73
    .line 74
    iget-object v9, p0, Lcom/tencent/bugly/common/replay/tool/AndroidTextLayout;->layout:Landroid/text/Layout;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v9}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 78
    move-result-object v9

    .line 79
    .line 80
    if-eqz v9, :cond_3

    .line 81
    .line 82
    check-cast v9, Landroid/text/Spanned;

    .line 83
    .line 84
    .line 85
    invoke-interface {v9, v7}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 86
    move-result v9

    .line 87
    const/4 v10, -0x1

    .line 88
    .line 89
    if-eq v8, v10, :cond_2

    .line 90
    .line 91
    if-ne v9, v10, :cond_1

    .line 92
    goto :goto_1

    .line 93
    :cond_1
    sub-int/2addr v9, v8

    .line 94
    .line 95
    if-le v9, v4, :cond_2

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7}, Landroid/text/style/ForegroundColorSpan;->getForegroundColor()I

    .line 99
    move-result v4

    .line 100
    .line 101
    .line 102
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    move-result-object v6

    .line 104
    move v4, v9

    .line 105
    .line 106
    :cond_2
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 107
    goto :goto_0

    .line 108
    .line 109
    :cond_3
    new-instance v0, Ljava/lang/NullPointerException;

    .line 110
    .line 111
    .line 112
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 113
    throw v0

    .line 114
    .line 115
    :cond_4
    new-instance v0, Ljava/lang/NullPointerException;

    .line 116
    .line 117
    .line 118
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 119
    throw v0

    .line 120
    .line 121
    :cond_5
    if-eqz v6, :cond_6

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 125
    move-result v0

    .line 126
    .line 127
    .line 128
    invoke-static {v0}, Lcom/tencent/bugly/common/replay/tool/ViewsKt;->toOpaque(I)I

    .line 129
    move-result v0

    .line 130
    .line 131
    .line 132
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    move-result-object v0

    .line 134
    return-object v0

    .line 135
    :cond_6
    return-object v1

    .line 136
    .line 137
    :cond_7
    new-instance v0, Ljava/lang/NullPointerException;

    .line 138
    .line 139
    .line 140
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 141
    throw v0
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
.end method

.method public getEllipsisCount(I)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/tool/AndroidTextLayout;->layout:Landroid/text/Layout;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getEllipsisCount(I)I

    .line 6
    move-result p1

    .line 7
    return p1
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

.method public getLineBottom(I)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/tool/AndroidTextLayout;->layout:Landroid/text/Layout;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineBottom(I)I

    .line 6
    move-result p1

    .line 7
    return p1
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

.method public getLineCount()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/tool/AndroidTextLayout;->layout:Landroid/text/Layout;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/text/Layout;->getLineCount()I

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public getLineStart(I)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/tool/AndroidTextLayout;->layout:Landroid/text/Layout;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineStart(I)I

    .line 6
    move-result p1

    .line 7
    return p1
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

.method public getLineTop(I)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/tool/AndroidTextLayout;->layout:Landroid/text/Layout;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineTop(I)I

    .line 6
    move-result p1

    .line 7
    return p1
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

.method public getLineVisibleEnd(I)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/tool/AndroidTextLayout;->layout:Landroid/text/Layout;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineVisibleEnd(I)I

    .line 6
    move-result p1

    .line 7
    return p1
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

.method public getPrimaryHorizontal(II)F
    .locals 0

    .line 1
    .line 2
    iget-object p1, p0, Lcom/tencent/bugly/common/replay/tool/AndroidTextLayout;->layout:Landroid/text/Layout;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, p2}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 6
    move-result p1

    .line 7
    return p1
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
