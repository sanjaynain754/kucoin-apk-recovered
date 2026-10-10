.class public Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager$c;
.super Ljava/lang/Object;
.source "RtlViewPager.java"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final b:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

.field public final synthetic c:Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;


# direct methods
.method public constructor <init>(Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager$c;->c:Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    iput-object p2, p0, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager$c;->b:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 8
    return-void
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
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager$c;->b:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;->onPageScrollStateChanged(I)V

    .line 6
    return-void
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
.end method

.method public onPageScrolled(IFI)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager$c;->c:Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager$c;->c:Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->a(Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;)Landroidx/viewpager/widget/PagerAdapter;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    iget-object v2, p0, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager$c;->c:Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;

    .line 15
    .line 16
    .line 17
    invoke-static {v2}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->b(Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;)Z

    .line 18
    move-result v2

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Landroidx/viewpager/widget/PagerAdapter;->getCount()I

    .line 26
    move-result p2

    .line 27
    int-to-float v0, v0

    .line 28
    .line 29
    const/high16 v2, 0x3f800000    # 1.0f

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p1}, Landroidx/viewpager/widget/PagerAdapter;->getPageWidth(I)F

    .line 33
    move-result v3

    .line 34
    sub-float/2addr v2, v3

    .line 35
    mul-float/2addr v2, v0

    .line 36
    float-to-int v2, v2

    .line 37
    add-int/2addr v2, p3

    .line 38
    .line 39
    :goto_0
    if-ge p1, p2, :cond_0

    .line 40
    .line 41
    if-lez v2, :cond_0

    .line 42
    .line 43
    add-int/lit8 p1, p1, 0x1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p1}, Landroidx/viewpager/widget/PagerAdapter;->getPageWidth(I)F

    .line 47
    move-result p3

    .line 48
    mul-float/2addr p3, v0

    .line 49
    float-to-int p3, p3

    .line 50
    sub-int/2addr v2, p3

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    sub-int/2addr p2, p1

    .line 53
    .line 54
    add-int/lit8 p1, p2, -0x1

    .line 55
    neg-int p3, v2

    .line 56
    int-to-float p2, p3

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, p1}, Landroidx/viewpager/widget/PagerAdapter;->getPageWidth(I)F

    .line 60
    move-result v1

    .line 61
    mul-float/2addr v0, v1

    .line 62
    div-float/2addr p2, v0

    .line 63
    .line 64
    :cond_1
    iget-object v0, p0, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager$c;->b:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 65
    .line 66
    .line 67
    invoke-interface {v0, p1, p2, p3}, Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;->onPageScrolled(IFI)V

    .line 68
    return-void
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
.end method

.method public onPageSelected(I)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager$c;->c:Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->c(Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;)Landroidx/viewpager/widget/PagerAdapter;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager$c;->c:Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->b(Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;)Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/viewpager/widget/PagerAdapter;->getCount()I

    .line 20
    move-result v0

    .line 21
    sub-int/2addr v0, p1

    .line 22
    .line 23
    add-int/lit8 p1, v0, -0x1

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager$c;->b:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, p1}, Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;->onPageSelected(I)V

    .line 29
    return-void
    .line 30
    .line 31
    .line 32
.end method
