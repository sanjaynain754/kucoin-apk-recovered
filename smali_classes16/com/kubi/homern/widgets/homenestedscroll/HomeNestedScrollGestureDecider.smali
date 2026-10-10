.class public final Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;
.super Ljava/lang/Object;
.source "HomeNestedScrollGestureDecider.kt"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$Companion;,
        Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$GestureAxis;,
        Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0000\u0018\u0000 \'2\u00020\u0001:\u0003%&\'BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u000e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001a\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u000fH\u0002J\u001a\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u000fH\u0002J-\u0010 \u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u000f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00110\u0008H\u0082\u0008J\u0018\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("
    }
    d2 = {
        "Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;",
        "Landroid/view/View$OnTouchListener;",
        "feed",
        "Landroid/view/View;",
        "outerProvider",
        "Lkotlin/Function0;",
        "headerProvider",
        "onFeedTouched",
        "Lkotlin/Function1;",
        "",
        "<init>",
        "(Landroid/view/View;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V",
        "state",
        "Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$GestureState;",
        "touchSlop",
        "",
        "feedToOuterHandoffDistance",
        "",
        "downwardAtFeedTopDistance",
        "lastFeedOwnsVertical",
        "",
        "Ljava/lang/Boolean;",
        "multiTouchActive",
        "onTouch",
        "view",
        "event",
        "Landroid/view/MotionEvent;",
        "onTouchEvent",
        "decide",
        "focalX",
        "skipIndex",
        "focalY",
        "focalCoordinate",
        "coordinate",
        "isHeaderPinned",
        "outer",
        "header",
        "GestureAxis",
        "GestureState",
        "Companion",
        "HomeLib_googleRelease"
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
        "SMAP\nHomeNestedScrollGestureDecider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeNestedScrollGestureDecider.kt\ncom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider\n*L\n1#1,178:1\n155#1,8:179\n155#1,8:187\n*S KotlinDebug\n*F\n+ 1 HomeNestedScrollGestureDecider.kt\ncom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider\n*L\n145#1:179,8\n148#1:187,8\n*E\n"
    }
.end annotation


# static fields
.field public static final l:Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final b:Landroid/view/View;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/view/View;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:I

.field public final h:F

.field public i:F

.field public j:Ljava/lang/Boolean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->l:Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$Companion;

    .line 9
    return-void
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
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
.end method

.method public constructor <init>(Landroid/view/View;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 8
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Landroid/view/View;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Landroid/view/View;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/View;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "feed"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "outerProvider"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "headerProvider"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string v0, "onFeedTouched"

    .line 18
    .line 19
    .line 20
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    iput-object p1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->b:Landroid/view/View;

    .line 26
    .line 27
    iput-object p2, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->c:Lkotlin/jvm/functions/Function0;

    .line 28
    .line 29
    iput-object p3, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->d:Lkotlin/jvm/functions/Function0;

    .line 30
    .line 31
    iput-object p4, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->e:Lkotlin/jvm/functions/Function1;

    .line 32
    .line 33
    new-instance v1, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;

    .line 34
    .line 35
    const/16 v6, 0xf

    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v2, 0x0

    .line 38
    const/4 v3, 0x0

    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x0

    .line 41
    .line 42
    .line 43
    invoke-direct/range {v1 .. v7}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;-><init>(FFFLcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$GestureAxis;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 44
    .line 45
    iput-object v1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->f:Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 49
    move-result-object p2

    .line 50
    .line 51
    .line 52
    invoke-static {p2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 53
    move-result-object p2

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 57
    move-result p2

    .line 58
    .line 59
    iput p2, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->g:I

    .line 60
    int-to-float p2, p2

    .line 61
    .line 62
    const/high16 p3, 0x40000000    # 2.0f

    .line 63
    mul-float/2addr p2, p3

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 71
    move-result-object p1

    .line 72
    .line 73
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 74
    .line 75
    const/high16 p3, 0x42000000    # 32.0f

    .line 76
    mul-float/2addr p1, p3

    .line 77
    .line 78
    .line 79
    invoke-static {p2, p1}, Ljava/lang/Math;->max(FF)F

    .line 80
    move-result p1

    .line 81
    .line 82
    iput p1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->h:F

    .line 83
    return-void
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
.end method

.method public static synthetic c(Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;Landroid/view/MotionEvent;IILjava/lang/Object;)F
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p3, p3, 0x2

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    const/4 p2, -0x1

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->b(Landroid/view/MotionEvent;I)F

    .line 9
    move-result p0

    .line 10
    return p0
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
.end method

.method public static synthetic e(Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;Landroid/view/MotionEvent;IILjava/lang/Object;)F
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p3, p3, 0x2

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    const/4 p2, -0x1

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->d(Landroid/view/MotionEvent;I)F

    .line 9
    move-result p0

    .line 10
    return p0
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
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, v0, v1, v2}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->c(Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;Landroid/view/MotionEvent;IILjava/lang/Object;)F

    .line 7
    move-result v3

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1, v0, v1, v2}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->e(Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;Landroid/view/MotionEvent;IILjava/lang/Object;)F

    .line 11
    move-result p1

    .line 12
    .line 13
    iget-object v1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->f:Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;->a()Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$GestureAxis;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    if-nez v1, :cond_2

    .line 20
    .line 21
    iget-object v1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->f:Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;->b()F

    .line 25
    move-result v1

    .line 26
    sub-float/2addr v3, v1

    .line 27
    .line 28
    iget-object v1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->f:Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;->c()F

    .line 32
    move-result v1

    .line 33
    .line 34
    sub-float v1, p1, v1

    .line 35
    .line 36
    .line 37
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 38
    move-result v2

    .line 39
    .line 40
    .line 41
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 42
    move-result v4

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v4}, Ljava/lang/Math;->max(FF)F

    .line 46
    move-result v2

    .line 47
    .line 48
    iget v4, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->g:I

    .line 49
    int-to-float v4, v4

    .line 50
    .line 51
    cmpg-float v2, v2, v4

    .line 52
    .line 53
    if-gez v2, :cond_0

    .line 54
    goto :goto_1

    .line 55
    .line 56
    :cond_0
    iget-object v2, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->f:Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;

    .line 57
    .line 58
    .line 59
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 60
    move-result v3

    .line 61
    .line 62
    .line 63
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 64
    move-result v1

    .line 65
    .line 66
    cmpl-float v1, v3, v1

    .line 67
    .line 68
    if-lez v1, :cond_1

    .line 69
    .line 70
    sget-object v1, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$GestureAxis;->HORIZONTAL:Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$GestureAxis;

    .line 71
    goto :goto_0

    .line 72
    .line 73
    :cond_1
    sget-object v1, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$GestureAxis;->VERTICAL:Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$GestureAxis;

    .line 74
    .line 75
    .line 76
    :goto_0
    invoke-virtual {v2, v1}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;->e(Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$GestureAxis;)V

    .line 77
    .line 78
    :cond_2
    iget-object v1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->f:Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;->d()F

    .line 82
    move-result v1

    .line 83
    .line 84
    sub-float v1, p1, v1

    .line 85
    .line 86
    iget-object v2, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->f:Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, p1}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;->h(F)V

    .line 90
    .line 91
    iget-object p1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->f:Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;->a()Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$GestureAxis;

    .line 95
    move-result-object p1

    .line 96
    .line 97
    sget-object v2, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$GestureAxis;->HORIZONTAL:Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$GestureAxis;

    .line 98
    const/4 v3, 0x0

    .line 99
    .line 100
    if-ne p1, v2, :cond_4

    .line 101
    .line 102
    iput v3, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->i:F

    .line 103
    .line 104
    iget-object p1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->b:Landroid/view/View;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 108
    move-result-object p1

    .line 109
    .line 110
    if-eqz p1, :cond_3

    .line 111
    .line 112
    .line 113
    invoke-interface {p1, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 114
    :cond_3
    :goto_1
    return-void

    .line 115
    .line 116
    :cond_4
    iget-object p1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->c:Lkotlin/jvm/functions/Function0;

    .line 117
    .line 118
    .line 119
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 120
    move-result-object p1

    .line 121
    .line 122
    check-cast p1, Landroid/view/View;

    .line 123
    .line 124
    iget-object v2, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->d:Lkotlin/jvm/functions/Function0;

    .line 125
    .line 126
    .line 127
    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 128
    move-result-object v2

    .line 129
    .line 130
    check-cast v2, Landroid/view/View;

    .line 131
    const/4 v4, 0x1

    .line 132
    .line 133
    if-eqz p1, :cond_5

    .line 134
    .line 135
    if-eqz v2, :cond_5

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0, p1, v2}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->f(Landroid/view/View;Landroid/view/View;)Z

    .line 139
    move-result p1

    .line 140
    .line 141
    if-eqz p1, :cond_5

    .line 142
    move p1, v4

    .line 143
    goto :goto_2

    .line 144
    :cond_5
    move p1, v0

    .line 145
    .line 146
    :goto_2
    cmpl-float v2, v1, v3

    .line 147
    .line 148
    if-lez v2, :cond_6

    .line 149
    move v2, v4

    .line 150
    goto :goto_3

    .line 151
    :cond_6
    move v2, v0

    .line 152
    .line 153
    :goto_3
    iget-object v5, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->b:Landroid/view/View;

    .line 154
    const/4 v6, -0x1

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5, v6}, Landroid/view/View;->canScrollVertically(I)Z

    .line 158
    move-result v5

    .line 159
    .line 160
    if-nez p1, :cond_7

    .line 161
    .line 162
    iput v3, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->i:F

    .line 163
    goto :goto_5

    .line 164
    .line 165
    :cond_7
    if-eqz v5, :cond_9

    .line 166
    .line 167
    iput v3, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->i:F

    .line 168
    :cond_8
    :goto_4
    move v0, v4

    .line 169
    goto :goto_5

    .line 170
    .line 171
    :cond_9
    cmpg-float p1, v1, v3

    .line 172
    .line 173
    if-gez p1, :cond_a

    .line 174
    .line 175
    iput v3, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->i:F

    .line 176
    goto :goto_4

    .line 177
    .line 178
    :cond_a
    if-nez v2, :cond_b

    .line 179
    .line 180
    iget p1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->i:F

    .line 181
    .line 182
    cmpl-float p1, p1, v3

    .line 183
    .line 184
    if-lez p1, :cond_8

    .line 185
    .line 186
    :cond_b
    iget p1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->i:F

    .line 187
    .line 188
    .line 189
    invoke-static {v1, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(FF)F

    .line 190
    move-result v1

    .line 191
    add-float/2addr p1, v1

    .line 192
    .line 193
    iput p1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->i:F

    .line 194
    .line 195
    iget v1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->h:F

    .line 196
    .line 197
    cmpg-float p1, p1, v1

    .line 198
    .line 199
    if-gez p1, :cond_c

    .line 200
    goto :goto_4

    .line 201
    .line 202
    :cond_c
    :goto_5
    iget-object p1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->b:Landroid/view/View;

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 206
    move-result-object p1

    .line 207
    .line 208
    if-eqz p1, :cond_d

    .line 209
    .line 210
    .line 211
    invoke-interface {p1, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 212
    .line 213
    .line 214
    :cond_d
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 215
    move-result-object p1

    .line 216
    .line 217
    iput-object p1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->j:Ljava/lang/Boolean;

    .line 218
    return-void
    .line 219
    .line 220
    .line 221
.end method

.method public final b(Landroid/view/MotionEvent;I)F
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v4, v1

    .line 8
    move v3, v2

    .line 9
    .line 10
    :goto_0
    if-ge v2, v0, :cond_1

    .line 11
    .line 12
    if-eq v2, p2, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    .line 16
    move-result v5

    .line 17
    add-float/2addr v4, v5

    .line 18
    .line 19
    add-int/lit8 v3, v3, 0x1

    .line 20
    .line 21
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_1
    if-lez v3, :cond_2

    .line 25
    int-to-float p1, v3

    .line 26
    div-float/2addr v4, p1

    .line 27
    return v4

    .line 28
    :cond_2
    return v1
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
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
.end method

.method public final d(Landroid/view/MotionEvent;I)F
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v4, v1

    .line 8
    move v3, v2

    .line 9
    .line 10
    :goto_0
    if-ge v2, v0, :cond_1

    .line 11
    .line 12
    if-eq v2, p2, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    .line 16
    move-result v5

    .line 17
    add-float/2addr v4, v5

    .line 18
    .line 19
    add-int/lit8 v3, v3, 0x1

    .line 20
    .line 21
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_1
    if-lez v3, :cond_2

    .line 25
    int-to-float p1, v3

    .line 26
    div-float/2addr v4, p1

    .line 27
    return v4

    .line 28
    :cond_2
    return v1
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
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
.end method

.method public final f(Landroid/view/View;Landroid/view/View;)Z
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    new-array v0, v0, [I

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 15
    move-result-object p2

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 19
    move-result-object p2

    .line 20
    .line 21
    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    .line 22
    const/4 v2, 0x1

    .line 23
    .line 24
    aget v0, v0, v2

    .line 25
    int-to-float v0, v0

    .line 26
    .line 27
    aget v1, v1, v2

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 31
    move-result p1

    .line 32
    add-int/2addr v1, p1

    .line 33
    int-to-float p1, v1

    .line 34
    add-float/2addr p1, p2

    .line 35
    .line 36
    cmpg-float p1, v0, p1

    .line 37
    .line 38
    if-gtz p1, :cond_0

    .line 39
    return v2

    .line 40
    :cond_0
    const/4 p1, 0x0

    .line 41
    return p1
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
.end method

.method public final g(Landroid/view/MotionEvent;)V
    .locals 7
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "event"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    .line 15
    if-eqz v0, :cond_9

    .line 16
    .line 17
    if-eq v0, v4, :cond_8

    .line 18
    const/4 v5, 0x2

    .line 19
    .line 20
    if-eq v0, v5, :cond_5

    .line 21
    const/4 v6, 0x3

    .line 22
    .line 23
    if-eq v0, v6, :cond_8

    .line 24
    const/4 v1, 0x5

    .line 25
    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    const/4 v1, 0x6

    .line 28
    .line 29
    if-eq v0, v1, :cond_0

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->f:Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 37
    move-result v1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1, v1}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->d(Landroid/view/MotionEvent;I)F

    .line 41
    move-result v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;->h(F)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 48
    move-result p1

    .line 49
    .line 50
    if-le p1, v5, :cond_1

    .line 51
    move v3, v4

    .line 52
    .line 53
    :cond_1
    iput-boolean v3, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->k:Z

    .line 54
    .line 55
    iget-object p1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->j:Ljava/lang/Boolean;

    .line 56
    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    move-result v4

    .line 62
    .line 63
    :cond_2
    iget-object p1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->b:Landroid/view/View;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    if-eqz p1, :cond_a

    .line 70
    .line 71
    .line 72
    invoke-interface {p1, v4}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 73
    return-void

    .line 74
    .line 75
    :cond_3
    iput-boolean v4, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->k:Z

    .line 76
    .line 77
    iget-object v0, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->f:Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;

    .line 78
    .line 79
    .line 80
    invoke-static {p0, p1, v3, v5, v2}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->e(Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;Landroid/view/MotionEvent;IILjava/lang/Object;)F

    .line 81
    move-result p1

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p1}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;->h(F)V

    .line 85
    .line 86
    iget-object p1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->j:Ljava/lang/Boolean;

    .line 87
    .line 88
    if-eqz p1, :cond_4

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    move-result v4

    .line 93
    .line 94
    :cond_4
    iget-object p1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->b:Landroid/view/View;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    if-eqz p1, :cond_a

    .line 101
    .line 102
    .line 103
    invoke-interface {p1, v4}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 104
    return-void

    .line 105
    .line 106
    :cond_5
    iget-boolean v0, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->k:Z

    .line 107
    .line 108
    if-eqz v0, :cond_7

    .line 109
    .line 110
    iget-object v0, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->f:Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;

    .line 111
    .line 112
    .line 113
    invoke-static {p0, p1, v3, v5, v2}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->e(Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;Landroid/view/MotionEvent;IILjava/lang/Object;)F

    .line 114
    move-result p1

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, p1}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;->h(F)V

    .line 118
    .line 119
    iget-object p1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->b:Landroid/view/View;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 123
    move-result-object p1

    .line 124
    .line 125
    if-eqz p1, :cond_a

    .line 126
    .line 127
    iget-object v0, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->j:Ljava/lang/Boolean;

    .line 128
    .line 129
    if-eqz v0, :cond_6

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 133
    move-result v4

    .line 134
    .line 135
    .line 136
    :cond_6
    invoke-interface {p1, v4}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 137
    return-void

    .line 138
    .line 139
    .line 140
    :cond_7
    invoke-virtual {p0, p1}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->a(Landroid/view/MotionEvent;)V

    .line 141
    return-void

    .line 142
    .line 143
    :cond_8
    iget-object p1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->f:Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, v2}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;->e(Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$GestureAxis;)V

    .line 147
    .line 148
    iput v1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->i:F

    .line 149
    .line 150
    iput-object v2, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->j:Ljava/lang/Boolean;

    .line 151
    .line 152
    iput-boolean v3, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->k:Z

    .line 153
    .line 154
    iget-object p1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->b:Landroid/view/View;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 158
    move-result-object p1

    .line 159
    .line 160
    if-eqz p1, :cond_a

    .line 161
    .line 162
    .line 163
    invoke-interface {p1, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 164
    return-void

    .line 165
    .line 166
    :cond_9
    iget-object v0, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->f:Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 170
    move-result v5

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v5}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;->f(F)V

    .line 174
    .line 175
    iget-object v0, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->f:Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 179
    move-result v5

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v5}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;->g(F)V

    .line 183
    .line 184
    iget-object v0, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->f:Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 188
    move-result p1

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, p1}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;->h(F)V

    .line 192
    .line 193
    iget-object p1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->f:Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, v2}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$a;->e(Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$GestureAxis;)V

    .line 197
    .line 198
    iput v1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->i:F

    .line 199
    .line 200
    iput-object v2, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->j:Ljava/lang/Boolean;

    .line 201
    .line 202
    iput-boolean v3, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->k:Z

    .line 203
    .line 204
    iget-object p1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->e:Lkotlin/jvm/functions/Function1;

    .line 205
    .line 206
    iget-object v0, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->b:Landroid/view/View;

    .line 207
    .line 208
    .line 209
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    iget-object p1, p0, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->b:Landroid/view/View;

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 215
    move-result-object p1

    .line 216
    .line 217
    if-eqz p1, :cond_a

    .line 218
    .line 219
    .line 220
    invoke-interface {p1, v4}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 221
    :cond_a
    :goto_0
    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "view"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string p1, "event"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p2}, Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;->g(Landroid/view/MotionEvent;)V

    .line 14
    const/4 p1, 0x0

    .line 15
    return p1
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
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
.end method
