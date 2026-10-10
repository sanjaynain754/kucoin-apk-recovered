.class public Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$b;
.super Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;
.source "SlidingTabLayout.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic b:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;


# direct methods
.method public constructor <init>(Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$b;->b:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$b;-><init>(Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;)V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$b;->b:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eq p1, v1, :cond_1

    .line 6
    const/4 v2, 0x2

    .line 7
    .line 8
    if-ne p1, v2, :cond_0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    .line 12
    .line 13
    :cond_1
    :goto_0
    invoke-static {v0, v1}, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;->i(Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;Z)Z

    .line 14
    .line 15
    if-nez p1, :cond_3

    .line 16
    .line 17
    iget-object p1, p0, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$b;->b:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;->b(Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;)Landroidx/viewpager2/widget/ViewPager2;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$b;->b:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;->b(Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;)Landroidx/viewpager2/widget/ViewPager2;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 33
    move-result v0

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v0}, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;->f(Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;I)I

    .line 37
    .line 38
    :cond_2
    iget-object p1, p0, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$b;->b:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;->j(Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;)V

    .line 42
    .line 43
    iget-object p1, p0, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$b;->b:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;->e(Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;)I

    .line 47
    move-result v0

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v0}, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;->E(I)V

    .line 51
    :cond_3
    return-void
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
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    .line 1
    .line 2
    iget-object p3, p0, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$b;->b:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    .line 3
    .line 4
    .line 5
    invoke-static {p3, p1}, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;->f(Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;I)I

    .line 6
    .line 7
    iget-object p1, p0, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$b;->b:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, p2}, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;->g(Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;F)F

    .line 11
    .line 12
    iget-object p1, p0, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$b;->b:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;->h(Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;)V

    .line 16
    .line 17
    iget-object p1, p0, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$b;->b:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 21
    return-void
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
.end method

.method public onPageSelected(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$b;->b:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;->E(I)V

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
