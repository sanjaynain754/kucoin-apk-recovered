.class final Lcom/tencent/liteav/sdkcommon/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/sdkcommon/g$b;,
        Lcom/tencent/liteav/sdkcommon/g$c;,
        Lcom/tencent/liteav/sdkcommon/g$a;
    }
.end annotation


# instance fields
.field final a:Landroid/util/DisplayMetrics;

.field final b:Landroid/view/WindowManager$LayoutParams;

.field final c:Landroid/content/Context;

.field final d:Landroid/os/Handler;

.field final e:Landroid/widget/ArrayAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/widget/ArrayAdapter<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field f:Landroid/view/WindowManager;

.field g:Landroid/view/View;

.field h:Landroid/widget/TextView;

.field i:Landroid/widget/TextView;

.field j:Landroid/widget/Spinner;

.field k:Landroid/widget/ScrollView;

.field l:Ljava/lang/String;

.field m:Z

.field n:I

.field final o:Lcom/tencent/liteav/sdkcommon/g$a;

.field private final p:I

.field private q:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/tencent/liteav/sdkcommon/g$a;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/liteav/sdkcommon/g;->a:Landroid/util/DisplayMetrics;

    .line 11
    .line 12
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/liteav/sdkcommon/g;->b:Landroid/view/WindowManager$LayoutParams;

    .line 18
    .line 19
    const/high16 v0, -0x10000

    .line 20
    .line 21
    iput v0, p0, Lcom/tencent/liteav/sdkcommon/g;->p:I

    .line 22
    const/4 v0, 0x0

    .line 23
    .line 24
    iput-boolean v0, p0, Lcom/tencent/liteav/sdkcommon/g;->q:Z

    .line 25
    .line 26
    iput-boolean v0, p0, Lcom/tencent/liteav/sdkcommon/g;->m:Z

    .line 27
    .line 28
    const/16 v0, 0x780

    .line 29
    .line 30
    iput v0, p0, Lcom/tencent/liteav/sdkcommon/g;->n:I

    .line 31
    .line 32
    iput-object p1, p0, Lcom/tencent/liteav/sdkcommon/g;->c:Landroid/content/Context;

    .line 33
    .line 34
    iput-object p2, p0, Lcom/tencent/liteav/sdkcommon/g;->o:Lcom/tencent/liteav/sdkcommon/g$a;

    .line 35
    .line 36
    new-instance p2, Landroid/widget/ArrayAdapter;

    .line 37
    .line 38
    .line 39
    const v0, 0x1090008

    .line 40
    .line 41
    .line 42
    invoke-direct {p2, p1, v0}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V

    .line 43
    .line 44
    iput-object p2, p0, Lcom/tencent/liteav/sdkcommon/g;->e:Landroid/widget/ArrayAdapter;

    .line 45
    .line 46
    new-instance p1, Landroid/os/Handler;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 50
    move-result-object p2

    .line 51
    .line 52
    .line 53
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 54
    .line 55
    iput-object p1, p0, Lcom/tencent/liteav/sdkcommon/g;->d:Landroid/os/Handler;

    .line 56
    return-void
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


# virtual methods
.method public final a(I)I
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/tencent/liteav/sdkcommon/g;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    int-to-float p1, p1

    mul-float/2addr p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    return p1
.end method

.method public final a()V
    .locals 2

    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/sdkcommon/g;->j:Landroid/widget/Spinner;

    if-eqz v0, :cond_0

    .line 9
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    const/high16 v1, -0x10000

    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/tencent/liteav/sdkcommon/g;->i:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    :cond_0
    iget-object p1, p0, Lcom/tencent/liteav/sdkcommon/g;->d:Landroid/os/Handler;

    invoke-static {p0}, Lcom/tencent/liteav/sdkcommon/h;->a(Lcom/tencent/liteav/sdkcommon/g;)Ljava/lang/Runnable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final a(Z)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/tencent/liteav/sdkcommon/g;->q:Z

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/sdkcommon/g;->f:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/tencent/liteav/sdkcommon/g;->g:Landroid/view/View;

    iget-object v2, p0, Lcom/tencent/liteav/sdkcommon/g;->b:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, v1, v2}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/sdkcommon/g;->f:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/tencent/liteav/sdkcommon/g;->g:Landroid/view/View;

    invoke-interface {v0, v1}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 4
    :goto_0
    iput-boolean p1, p0, Lcom/tencent/liteav/sdkcommon/g;->q:Z

    return-void
.end method

.method public final b()I
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/sdkcommon/g;->b:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    const/16 v1, 0xe6

    .line 4
    invoke-virtual {p0, v1}, Lcom/tencent/liteav/sdkcommon/g;->a(I)I

    move-result v1

    sub-int/2addr v0, v1

    const/16 v1, 0x14

    .line 5
    invoke-virtual {p0, v1}, Lcom/tencent/liteav/sdkcommon/g;->a(I)I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    .line 6
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/sdkcommon/g;->h:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method
