.class public Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout$a;
.super Ljava/lang/Object;
.source "RankSlidingTabLayout.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->g(ILjava/lang/CharSequence;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;


# direct methods
.method public constructor <init>(Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout$a;->b:Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout$a;->b:Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->a(Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;)Landroid/widget/LinearLayout;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 10
    move-result p1

    .line 11
    const/4 v0, -0x1

    .line 12
    .line 13
    if-eq p1, v0, :cond_4

    .line 14
    .line 15
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout$a;->b:Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->b(Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;)Landroidx/viewpager/widget/ViewPager;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 23
    move-result v0

    .line 24
    .line 25
    if-eq v0, p1, :cond_3

    .line 26
    .line 27
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout$a;->b:Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;

    .line 28
    .line 29
    .line 30
    invoke-static {v0, p1}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->c(Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;I)V

    .line 31
    .line 32
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout$a;->b:Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->d(Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;)Lww/b;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout$a;->b:Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->d(Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;)Lww/b;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p1}, Lww/b;->b(I)V

    .line 48
    .line 49
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout$a;->b:Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e(Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;)I

    .line 53
    move-result v0

    .line 54
    const/4 v1, 0x2

    .line 55
    .line 56
    if-ne v0, v1, :cond_1

    .line 57
    .line 58
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout$a;->b:Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->b(Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;)Landroidx/viewpager/widget/ViewPager;

    .line 62
    move-result-object v0

    .line 63
    const/4 v1, 0x1

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p1, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    .line 67
    return-void

    .line 68
    .line 69
    :cond_1
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout$a;->b:Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f(Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;)Z

    .line 73
    move-result v0

    .line 74
    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout$a;->b:Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;

    .line 78
    .line 79
    .line 80
    invoke-static {v0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->b(Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;)Landroidx/viewpager/widget/ViewPager;

    .line 81
    move-result-object v0

    .line 82
    const/4 v1, 0x0

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p1, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    .line 86
    return-void

    .line 87
    .line 88
    :cond_2
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout$a;->b:Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->b(Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;)Landroidx/viewpager/widget/ViewPager;

    .line 92
    move-result-object v0

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, p1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 96
    return-void

    .line 97
    .line 98
    :cond_3
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout$a;->b:Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;

    .line 99
    .line 100
    .line 101
    invoke-static {v0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->d(Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;)Lww/b;

    .line 102
    move-result-object v0

    .line 103
    .line 104
    if-eqz v0, :cond_4

    .line 105
    .line 106
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout$a;->b:Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;

    .line 107
    .line 108
    .line 109
    invoke-static {v0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->d(Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;)Lww/b;

    .line 110
    move-result-object v0

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, p1}, Lww/b;->a(I)V

    .line 114
    :cond_4
    return-void
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
