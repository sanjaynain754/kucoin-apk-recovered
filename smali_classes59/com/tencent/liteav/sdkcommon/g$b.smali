.class final Lcom/tencent/liteav/sdkcommon/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/sdkcommon/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/liteav/sdkcommon/g;

.field private b:I

.field private c:I


# direct methods
.method private constructor <init>(Lcom/tencent/liteav/sdkcommon/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/sdkcommon/g$b;->a:Lcom/tencent/liteav/sdkcommon/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tencent/liteav/sdkcommon/g;B)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tencent/liteav/sdkcommon/g$b;-><init>(Lcom/tencent/liteav/sdkcommon/g;)V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_4

    .line 8
    const/4 v2, 0x2

    .line 9
    .line 10
    if-eq v0, v2, :cond_0

    .line 11
    .line 12
    goto/16 :goto_1

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 16
    move-result v0

    .line 17
    float-to-int v0, v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 21
    move-result p2

    .line 22
    float-to-int p2, p2

    .line 23
    .line 24
    iget v3, p0, Lcom/tencent/liteav/sdkcommon/g$b;->b:I

    .line 25
    .line 26
    sub-int v3, v0, v3

    .line 27
    .line 28
    iget v4, p0, Lcom/tencent/liteav/sdkcommon/g$b;->c:I

    .line 29
    .line 30
    sub-int v4, p2, v4

    .line 31
    .line 32
    iget-object v5, p0, Lcom/tencent/liteav/sdkcommon/g$b;->a:Lcom/tencent/liteav/sdkcommon/g;

    .line 33
    .line 34
    iget-object v5, v5, Lcom/tencent/liteav/sdkcommon/g;->b:Landroid/view/WindowManager$LayoutParams;

    .line 35
    .line 36
    iget v6, v5, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 37
    add-int/2addr v6, v3

    .line 38
    .line 39
    iput v6, v5, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 40
    .line 41
    iget v3, v5, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 42
    add-int/2addr v3, v4

    .line 43
    .line 44
    iput v3, v5, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 45
    .line 46
    iput v0, p0, Lcom/tencent/liteav/sdkcommon/g$b;->b:I

    .line 47
    .line 48
    iput p2, p0, Lcom/tencent/liteav/sdkcommon/g$b;->c:I

    .line 49
    .line 50
    .line 51
    invoke-static {v6, v1}, Ljava/lang/Math;->max(II)I

    .line 52
    move-result p2

    .line 53
    .line 54
    iput p2, v5, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 55
    .line 56
    iget-object p2, p0, Lcom/tencent/liteav/sdkcommon/g$b;->a:Lcom/tencent/liteav/sdkcommon/g;

    .line 57
    .line 58
    iget-object p2, p2, Lcom/tencent/liteav/sdkcommon/g;->b:Landroid/view/WindowManager$LayoutParams;

    .line 59
    .line 60
    iget v0, p2, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 64
    move-result v0

    .line 65
    .line 66
    iput v0, p2, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 67
    .line 68
    iget-object p2, p0, Lcom/tencent/liteav/sdkcommon/g$b;->a:Lcom/tencent/liteav/sdkcommon/g;

    .line 69
    .line 70
    iget-object v0, p2, Lcom/tencent/liteav/sdkcommon/g;->b:Landroid/view/WindowManager$LayoutParams;

    .line 71
    .line 72
    iget v3, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 73
    .line 74
    iget-object v4, p2, Lcom/tencent/liteav/sdkcommon/g;->a:Landroid/util/DisplayMetrics;

    .line 75
    .line 76
    iget v5, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 77
    .line 78
    add-int v6, v3, v5

    .line 79
    .line 80
    if-le v6, v5, :cond_1

    .line 81
    sub-int/2addr v5, v3

    .line 82
    .line 83
    iput v5, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 84
    goto :goto_0

    .line 85
    .line 86
    :cond_1
    iput v5, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 87
    .line 88
    :goto_0
    iget v3, p2, Lcom/tencent/liteav/sdkcommon/g;->n:I

    .line 89
    .line 90
    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 91
    .line 92
    iget-boolean v5, p2, Lcom/tencent/liteav/sdkcommon/g;->m:Z

    .line 93
    .line 94
    if-eqz v5, :cond_2

    .line 95
    div-int/2addr v3, v2

    .line 96
    .line 97
    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 98
    .line 99
    :cond_2
    iget v2, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 100
    .line 101
    iget v3, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 102
    add-int/2addr v3, v2

    .line 103
    .line 104
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 105
    .line 106
    if-le v3, v4, :cond_3

    .line 107
    sub-int/2addr v4, v2

    .line 108
    .line 109
    iput v4, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 110
    .line 111
    :cond_3
    iget-object p2, p2, Lcom/tencent/liteav/sdkcommon/g;->k:Landroid/widget/ScrollView;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 115
    move-result-object p2

    .line 116
    .line 117
    iget-object v0, p0, Lcom/tencent/liteav/sdkcommon/g$b;->a:Lcom/tencent/liteav/sdkcommon/g;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Lcom/tencent/liteav/sdkcommon/g;->b()I

    .line 121
    move-result v0

    .line 122
    .line 123
    iput v0, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 124
    .line 125
    iget-object v0, p0, Lcom/tencent/liteav/sdkcommon/g$b;->a:Lcom/tencent/liteav/sdkcommon/g;

    .line 126
    .line 127
    iget-object v0, v0, Lcom/tencent/liteav/sdkcommon/g;->k:Landroid/widget/ScrollView;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 131
    .line 132
    iget-object p2, p0, Lcom/tencent/liteav/sdkcommon/g$b;->a:Lcom/tencent/liteav/sdkcommon/g;

    .line 133
    .line 134
    iget-object v0, p2, Lcom/tencent/liteav/sdkcommon/g;->f:Landroid/view/WindowManager;

    .line 135
    .line 136
    iget-object p2, p2, Lcom/tencent/liteav/sdkcommon/g;->b:Landroid/view/WindowManager$LayoutParams;

    .line 137
    .line 138
    .line 139
    invoke-interface {v0, p1, p2}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 140
    goto :goto_1

    .line 141
    .line 142
    .line 143
    :cond_4
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 144
    move-result v0

    .line 145
    float-to-int v0, v0

    .line 146
    .line 147
    iput v0, p0, Lcom/tencent/liteav/sdkcommon/g$b;->b:I

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 151
    move-result p2

    .line 152
    float-to-int p2, p2

    .line 153
    .line 154
    iput p2, p0, Lcom/tencent/liteav/sdkcommon/g$b;->c:I

    .line 155
    .line 156
    .line 157
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    .line 158
    return v1
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
