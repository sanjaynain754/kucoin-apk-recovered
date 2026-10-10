.class public final Lcom/kubi/resources/CopyTradingTrendView;
.super Landroid/view/View;
.source "CopyTradingTrendView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J(\u0010\u001c\u001a\u00020\u001d2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u001f2\u0008\u0008\u0001\u0010 \u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0015J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#H\u0015R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\u0008\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006$"
    }
    d2 = {
        "Lcom/kubi/resources/CopyTradingTrendView;",
        "Landroid/view/View;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "linePain",
        "Landroid/graphics/Paint;",
        "maskFilter",
        "Landroid/graphics/BlurMaskFilter;",
        "path",
        "Landroid/graphics/Path;",
        "pointList",
        "Ljava/util/ArrayList;",
        "",
        "Lkotlin/collections/ArrayList;",
        "safePadding",
        "",
        "isLine",
        "",
        "lineFillPath",
        "lineFillPaint",
        "getLineFillPaint",
        "()Landroid/graphics/Paint;",
        "lineFillPaint$delegate",
        "Lkotlin/Lazy;",
        "setDataList",
        "",
        "list",
        "",
        "color",
        "onDraw",
        "canvas",
        "Landroid/graphics/Canvas;",
        "LComponent_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCopyTradingTrendView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTradingTrendView.kt\ncom/kubi/resources/CopyTradingTrendView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n1#2:137\n1878#3,3:138\n*S KotlinDebug\n*F\n+ 1 CopyTradingTrendView.kt\ncom/kubi/resources/CopyTradingTrendView\n*L\n82#1:138,3\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Landroid/graphics/BlurMaskFilter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:I

.field public g:Z

.field public final h:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 9
    .line 10
    new-instance p1, Landroid/graphics/Paint;

    .line 11
    .line 12
    .line 13
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 14
    .line 15
    const/high16 p2, 0x3f800000    # 1.0f

    .line 16
    .line 17
    .line 18
    invoke-static {p2}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 19
    move-result p2

    .line 20
    int-to-float p2, p2

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 24
    const/4 p2, 0x1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 28
    .line 29
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 33
    .line 34
    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 38
    .line 39
    iput-object p1, p0, Lcom/kubi/resources/CopyTradingTrendView;->b:Landroid/graphics/Paint;

    .line 40
    .line 41
    new-instance p1, Landroid/graphics/BlurMaskFilter;

    .line 42
    .line 43
    const/high16 p2, 0x40a00000    # 5.0f

    .line 44
    .line 45
    .line 46
    invoke-static {p2}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 47
    move-result p2

    .line 48
    int-to-float p2, p2

    .line 49
    .line 50
    sget-object v0, Landroid/graphics/BlurMaskFilter$Blur;->SOLID:Landroid/graphics/BlurMaskFilter$Blur;

    .line 51
    .line 52
    .line 53
    invoke-direct {p1, p2, v0}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    .line 54
    .line 55
    iput-object p1, p0, Lcom/kubi/resources/CopyTradingTrendView;->c:Landroid/graphics/BlurMaskFilter;

    .line 56
    .line 57
    new-instance p1, Landroid/graphics/Path;

    .line 58
    .line 59
    .line 60
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 61
    .line 62
    iput-object p1, p0, Lcom/kubi/resources/CopyTradingTrendView;->d:Landroid/graphics/Path;

    .line 63
    .line 64
    new-instance p1, Ljava/util/ArrayList;

    .line 65
    .line 66
    .line 67
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    iput-object p1, p0, Lcom/kubi/resources/CopyTradingTrendView;->e:Ljava/util/ArrayList;

    .line 70
    .line 71
    const/high16 p1, 0x41200000    # 10.0f

    .line 72
    .line 73
    .line 74
    invoke-static {p1}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 75
    move-result p1

    .line 76
    .line 77
    iput p1, p0, Lcom/kubi/resources/CopyTradingTrendView;->f:I

    .line 78
    .line 79
    new-instance p1, Landroid/graphics/Path;

    .line 80
    .line 81
    .line 82
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 83
    .line 84
    iput-object p1, p0, Lcom/kubi/resources/CopyTradingTrendView;->h:Landroid/graphics/Path;

    .line 85
    .line 86
    new-instance p1, Lcom/kubi/resources/h;

    .line 87
    .line 88
    .line 89
    invoke-direct {p1}, Lcom/kubi/resources/h;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 93
    move-result-object p1

    .line 94
    .line 95
    iput-object p1, p0, Lcom/kubi/resources/CopyTradingTrendView;->i:Lkotlin/Lazy;

    .line 96
    return-void
    .line 97
.end method

.method public static synthetic a()Landroid/graphics/Paint;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/resources/CopyTradingTrendView;->b()Landroid/graphics/Paint;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static final b()Landroid/graphics/Paint;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/Paint;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 6
    const/4 v1, 0x1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 10
    .line 11
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 15
    .line 16
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 20
    return-object v0
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
.end method

.method public static synthetic d(Lcom/kubi/resources/CopyTradingTrendView;Ljava/util/List;IZILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p4, p4, 0x4

    .line 3
    .line 4
    if-eqz p4, :cond_0

    .line 5
    const/4 p3, 0x0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/resources/CopyTradingTrendView;->c(Ljava/util/List;IZ)V

    .line 9
    return-void
.end method

.method private final getLineFillPaint()Landroid/graphics/Paint;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/CopyTradingTrendView;->i:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Landroid/graphics/Paint;

    .line 9
    return-object v0
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
.end method


# virtual methods
.method public final c(Ljava/util/List;IZ)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;IZ)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "list"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-boolean p3, p0, Lcom/kubi/resources/CopyTradingTrendView;->g:Z

    .line 8
    .line 9
    iget-object p3, p0, Lcom/kubi/resources/CopyTradingTrendView;->e:Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p3}, Ljava/util/ArrayList;->clear()V

    .line 13
    .line 14
    iget-object p3, p0, Lcom/kubi/resources/CopyTradingTrendView;->e:Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    .line 21
    move-result p1

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lcom/kubi/resources/CopyTradingTrendView;->e:Ljava/util/ArrayList;

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->reverse(Ljava/util/List;)V

    .line 29
    .line 30
    :cond_0
    iget-object p1, p0, Lcom/kubi/resources/CopyTradingTrendView;->b:Landroid/graphics/Paint;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 37
    return-void
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
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 25
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DrawAllocation"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "canvas"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 13
    .line 14
    iget-object v2, v0, Lcom/kubi/resources/CopyTradingTrendView;->e:Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 18
    move-result v2

    .line 19
    const/4 v7, 0x2

    .line 20
    .line 21
    if-ge v2, v7, :cond_0

    .line 22
    .line 23
    goto/16 :goto_7

    .line 24
    .line 25
    :cond_0
    iget-object v2, v0, Lcom/kubi/resources/CopyTradingTrendView;->e:Ljava/util/ArrayList;

    .line 26
    .line 27
    .line 28
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    move-result v3

    .line 34
    .line 35
    if-eqz v3, :cond_b

    .line 36
    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    move-result-object v3

    .line 40
    .line 41
    check-cast v3, Ljava/lang/Number;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 45
    move-result v3

    .line 46
    move v8, v3

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    move-result v3

    .line 51
    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    .line 55
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    move-result-object v3

    .line 57
    .line 58
    check-cast v3, Ljava/lang/Number;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 62
    move-result v3

    .line 63
    .line 64
    .line 65
    invoke-static {v8, v3}, Ljava/lang/Math;->min(FF)F

    .line 66
    move-result v8

    .line 67
    goto :goto_0

    .line 68
    .line 69
    :cond_1
    iget-object v2, v0, Lcom/kubi/resources/CopyTradingTrendView;->e:Ljava/util/ArrayList;

    .line 70
    .line 71
    .line 72
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    move-result-object v2

    .line 74
    .line 75
    .line 76
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    move-result v3

    .line 78
    .line 79
    if-eqz v3, :cond_a

    .line 80
    .line 81
    .line 82
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    move-result-object v3

    .line 84
    .line 85
    check-cast v3, Ljava/lang/Number;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 89
    move-result v3

    .line 90
    .line 91
    .line 92
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    move-result v4

    .line 94
    .line 95
    if-eqz v4, :cond_2

    .line 96
    .line 97
    .line 98
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    move-result-object v4

    .line 100
    .line 101
    check-cast v4, Ljava/lang/Number;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 105
    move-result v4

    .line 106
    .line 107
    .line 108
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 109
    move-result v3

    .line 110
    goto :goto_1

    .line 111
    :cond_2
    sub-float/2addr v3, v8

    .line 112
    const/4 v2, 0x0

    .line 113
    .line 114
    cmpg-float v4, v3, v2

    .line 115
    .line 116
    if-nez v4, :cond_3

    .line 117
    :goto_2
    move v9, v2

    .line 118
    goto :goto_3

    .line 119
    .line 120
    .line 121
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 122
    move-result v2

    .line 123
    .line 124
    iget v4, v0, Lcom/kubi/resources/CopyTradingTrendView;->f:I

    .line 125
    mul-int/2addr v4, v7

    .line 126
    sub-int/2addr v2, v4

    .line 127
    int-to-float v2, v2

    .line 128
    div-float/2addr v2, v3

    .line 129
    goto :goto_2

    .line 130
    .line 131
    .line 132
    :goto_3
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 133
    move-result v2

    .line 134
    int-to-float v2, v2

    .line 135
    .line 136
    iget-object v3, v0, Lcom/kubi/resources/CopyTradingTrendView;->e:Ljava/util/ArrayList;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 140
    move-result v3

    .line 141
    const/4 v10, 0x1

    .line 142
    sub-int/2addr v3, v10

    .line 143
    int-to-float v3, v3

    .line 144
    .line 145
    div-float v11, v2, v3

    .line 146
    .line 147
    iget-object v2, v0, Lcom/kubi/resources/CopyTradingTrendView;->e:Ljava/util/ArrayList;

    .line 148
    .line 149
    .line 150
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 151
    move-result-object v12

    .line 152
    const/4 v2, 0x0

    .line 153
    .line 154
    .line 155
    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    move-result v3

    .line 157
    .line 158
    if-eqz v3, :cond_9

    .line 159
    .line 160
    .line 161
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    move-result-object v3

    .line 163
    .line 164
    add-int/lit8 v13, v2, 0x1

    .line 165
    .line 166
    if-gez v2, :cond_4

    .line 167
    .line 168
    .line 169
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 170
    .line 171
    :cond_4
    check-cast v3, Ljava/lang/Number;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 175
    move-result v3

    .line 176
    .line 177
    if-eqz v2, :cond_8

    .line 178
    .line 179
    add-int/lit8 v4, v2, -0x1

    .line 180
    int-to-float v5, v4

    .line 181
    .line 182
    mul-float v15, v5, v11

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 186
    move-result v5

    .line 187
    int-to-float v5, v5

    .line 188
    .line 189
    iget-object v6, v0, Lcom/kubi/resources/CopyTradingTrendView;->e:Ljava/util/ArrayList;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 193
    move-result-object v4

    .line 194
    .line 195
    check-cast v4, Ljava/lang/Number;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 199
    move-result v4

    .line 200
    sub-float/2addr v4, v8

    .line 201
    mul-float/2addr v4, v9

    .line 202
    sub-float/2addr v5, v4

    .line 203
    .line 204
    iget v4, v0, Lcom/kubi/resources/CopyTradingTrendView;->f:I

    .line 205
    int-to-float v4, v4

    .line 206
    .line 207
    sub-float v16, v5, v4

    .line 208
    int-to-float v4, v2

    .line 209
    .line 210
    mul-float v17, v4, v11

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 214
    move-result v4

    .line 215
    int-to-float v4, v4

    .line 216
    sub-float/2addr v3, v8

    .line 217
    mul-float/2addr v3, v9

    .line 218
    sub-float/2addr v4, v3

    .line 219
    .line 220
    iget v3, v0, Lcom/kubi/resources/CopyTradingTrendView;->f:I

    .line 221
    int-to-float v3, v3

    .line 222
    .line 223
    sub-float v18, v4, v3

    .line 224
    .line 225
    iget-boolean v3, v0, Lcom/kubi/resources/CopyTradingTrendView;->g:Z

    .line 226
    .line 227
    if-eqz v3, :cond_5

    .line 228
    .line 229
    iget-object v6, v0, Lcom/kubi/resources/CopyTradingTrendView;->b:Landroid/graphics/Paint;

    .line 230
    move v2, v15

    .line 231
    .line 232
    move/from16 v3, v16

    .line 233
    .line 234
    move/from16 v4, v17

    .line 235
    .line 236
    move/from16 v5, v18

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 240
    .line 241
    .line 242
    invoke-direct {v0}, Lcom/kubi/resources/CopyTradingTrendView;->getLineFillPaint()Landroid/graphics/Paint;

    .line 243
    move-result-object v2

    .line 244
    .line 245
    new-instance v16, Landroid/graphics/LinearGradient;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 249
    move-result v6

    .line 250
    int-to-float v6, v6

    .line 251
    .line 252
    iget-object v14, v0, Lcom/kubi/resources/CopyTradingTrendView;->b:Landroid/graphics/Paint;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v14}, Landroid/graphics/Paint;->getColor()I

    .line 256
    move-result v14

    .line 257
    .line 258
    const/16 v10, 0x28

    .line 259
    .line 260
    .line 261
    invoke-static {v14, v10}, Lcom/blankj/utilcode/util/h;->b(II)I

    .line 262
    move-result v21

    .line 263
    .line 264
    const/16 v22, 0x0

    .line 265
    .line 266
    sget-object v23, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 267
    .line 268
    const/16 v17, 0x0

    .line 269
    .line 270
    const/16 v18, 0x0

    .line 271
    .line 272
    const/16 v19, 0x0

    .line 273
    .line 274
    move/from16 v20, v6

    .line 275
    .line 276
    .line 277
    invoke-direct/range {v16 .. v23}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 278
    .line 279
    move-object/from16 v6, v16

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 283
    .line 284
    iget-object v2, v0, Lcom/kubi/resources/CopyTradingTrendView;->h:Landroid/graphics/Path;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 288
    move-result v6

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 292
    move-result v10

    .line 293
    add-int/2addr v6, v10

    .line 294
    int-to-float v6, v6

    .line 295
    .line 296
    .line 297
    invoke-virtual {v2, v15, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 298
    .line 299
    iget-object v2, v0, Lcom/kubi/resources/CopyTradingTrendView;->h:Landroid/graphics/Path;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2, v15, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 303
    .line 304
    iget-object v2, v0, Lcom/kubi/resources/CopyTradingTrendView;->h:Landroid/graphics/Path;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 308
    .line 309
    iget-object v2, v0, Lcom/kubi/resources/CopyTradingTrendView;->h:Landroid/graphics/Path;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 313
    move-result v3

    .line 314
    .line 315
    .line 316
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 317
    move-result v5

    .line 318
    add-int/2addr v3, v5

    .line 319
    int-to-float v3, v3

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2, v4, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 323
    .line 324
    iget-object v2, v0, Lcom/kubi/resources/CopyTradingTrendView;->h:Landroid/graphics/Path;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2}, Landroid/graphics/Path;->close()V

    .line 328
    .line 329
    iget-object v2, v0, Lcom/kubi/resources/CopyTradingTrendView;->h:Landroid/graphics/Path;

    .line 330
    .line 331
    .line 332
    invoke-direct {v0}, Lcom/kubi/resources/CopyTradingTrendView;->getLineFillPaint()Landroid/graphics/Paint;

    .line 333
    move-result-object v3

    .line 334
    .line 335
    .line 336
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 337
    .line 338
    iget-object v2, v0, Lcom/kubi/resources/CopyTradingTrendView;->h:Landroid/graphics/Path;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 342
    .line 343
    const/16 v24, 0x1

    .line 344
    .line 345
    goto/16 :goto_6

    .line 346
    .line 347
    :cond_5
    move/from16 v3, v16

    .line 348
    .line 349
    move/from16 v4, v17

    .line 350
    .line 351
    move/from16 v5, v18

    .line 352
    .line 353
    iget-object v6, v0, Lcom/kubi/resources/CopyTradingTrendView;->d:Landroid/graphics/Path;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v6, v15, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 357
    .line 358
    iget-object v6, v0, Lcom/kubi/resources/CopyTradingTrendView;->d:Landroid/graphics/Path;

    .line 359
    .line 360
    add-float v10, v15, v4

    .line 361
    int-to-float v14, v7

    .line 362
    .line 363
    div-float v17, v10, v14

    .line 364
    .line 365
    move/from16 v19, v17

    .line 366
    .line 367
    move/from16 v22, v5

    .line 368
    .line 369
    move/from16 v18, v3

    .line 370
    .line 371
    move/from16 v21, v4

    .line 372
    .line 373
    move/from16 v20, v5

    .line 374
    .line 375
    move-object/from16 v16, v6

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v16 .. v22}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 379
    .line 380
    move/from16 v16, v18

    .line 381
    .line 382
    move/from16 v18, v20

    .line 383
    .line 384
    move/from16 v17, v21

    .line 385
    const/4 v3, 0x1

    .line 386
    .line 387
    if-ne v2, v3, :cond_6

    .line 388
    .line 389
    iget-object v2, v0, Lcom/kubi/resources/CopyTradingTrendView;->b:Landroid/graphics/Paint;

    .line 390
    .line 391
    new-instance v14, Landroid/graphics/LinearGradient;

    .line 392
    .line 393
    iget-object v3, v0, Lcom/kubi/resources/CopyTradingTrendView;->b:Landroid/graphics/Paint;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v3}, Landroid/graphics/Paint;->getColor()I

    .line 397
    move-result v20

    .line 398
    .line 399
    sget-object v21, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 400
    .line 401
    const/16 v19, 0x0

    .line 402
    .line 403
    .line 404
    invoke-direct/range {v14 .. v21}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2, v14}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 408
    .line 409
    const/16 v24, 0x1

    .line 410
    goto :goto_5

    .line 411
    .line 412
    :cond_6
    iget-object v3, v0, Lcom/kubi/resources/CopyTradingTrendView;->e:Ljava/util/ArrayList;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 416
    move-result v3

    .line 417
    .line 418
    const/16 v24, 0x1

    .line 419
    .line 420
    add-int/lit8 v3, v3, -0x1

    .line 421
    .line 422
    if-ne v2, v3, :cond_7

    .line 423
    .line 424
    iget-object v2, v0, Lcom/kubi/resources/CopyTradingTrendView;->b:Landroid/graphics/Paint;

    .line 425
    .line 426
    new-instance v14, Landroid/graphics/LinearGradient;

    .line 427
    .line 428
    iget-object v3, v0, Lcom/kubi/resources/CopyTradingTrendView;->b:Landroid/graphics/Paint;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v3}, Landroid/graphics/Paint;->getColor()I

    .line 432
    move-result v19

    .line 433
    .line 434
    const/16 v20, 0x0

    .line 435
    .line 436
    sget-object v21, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 437
    .line 438
    .line 439
    invoke-direct/range {v14 .. v21}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v2, v14}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 443
    .line 444
    :cond_7
    :goto_5
    iget-object v2, v0, Lcom/kubi/resources/CopyTradingTrendView;->b:Landroid/graphics/Paint;

    .line 445
    .line 446
    iget-object v3, v0, Lcom/kubi/resources/CopyTradingTrendView;->c:Landroid/graphics/BlurMaskFilter;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    .line 450
    .line 451
    iget-object v2, v0, Lcom/kubi/resources/CopyTradingTrendView;->b:Landroid/graphics/Paint;

    .line 452
    .line 453
    const/high16 v3, 0x3f000000    # 0.5f

    .line 454
    .line 455
    .line 456
    invoke-static {v3}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 457
    move-result v3

    .line 458
    int-to-float v3, v3

    .line 459
    .line 460
    .line 461
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 462
    .line 463
    iget-object v2, v0, Lcom/kubi/resources/CopyTradingTrendView;->d:Landroid/graphics/Path;

    .line 464
    .line 465
    iget-object v3, v0, Lcom/kubi/resources/CopyTradingTrendView;->b:Landroid/graphics/Paint;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 469
    .line 470
    iget-object v2, v0, Lcom/kubi/resources/CopyTradingTrendView;->b:Landroid/graphics/Paint;

    .line 471
    .line 472
    const/high16 v3, 0x3f800000    # 1.0f

    .line 473
    .line 474
    .line 475
    invoke-static {v3}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 476
    move-result v3

    .line 477
    int-to-float v3, v3

    .line 478
    .line 479
    .line 480
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 481
    .line 482
    iget-object v2, v0, Lcom/kubi/resources/CopyTradingTrendView;->b:Landroid/graphics/Paint;

    .line 483
    const/4 v3, 0x0

    .line 484
    .line 485
    .line 486
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    .line 487
    .line 488
    iget-object v2, v0, Lcom/kubi/resources/CopyTradingTrendView;->d:Landroid/graphics/Path;

    .line 489
    .line 490
    iget-object v4, v0, Lcom/kubi/resources/CopyTradingTrendView;->b:Landroid/graphics/Paint;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v1, v2, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 494
    .line 495
    iget-object v2, v0, Lcom/kubi/resources/CopyTradingTrendView;->b:Landroid/graphics/Paint;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 499
    .line 500
    iget-object v2, v0, Lcom/kubi/resources/CopyTradingTrendView;->d:Landroid/graphics/Path;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 504
    goto :goto_6

    .line 505
    .line 506
    :cond_8
    move/from16 v24, v10

    .line 507
    :goto_6
    move v2, v13

    .line 508
    .line 509
    move/from16 v10, v24

    .line 510
    .line 511
    goto/16 :goto_4

    .line 512
    :cond_9
    :goto_7
    return-void

    .line 513
    .line 514
    :cond_a
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 515
    .line 516
    .line 517
    invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V

    .line 518
    throw v1

    .line 519
    .line 520
    :cond_b
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 521
    .line 522
    .line 523
    invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V

    .line 524
    throw v1
.end method
