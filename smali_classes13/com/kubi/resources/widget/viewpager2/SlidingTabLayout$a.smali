.class public Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$a;
.super Ljava/lang/Object;
.source "SlidingTabLayout.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;->k(ILjava/lang/CharSequence;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;


# direct methods
.method public constructor <init>(Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$a;->b:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

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
    iget-object v0, p0, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$a;->b:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;->a(Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;)Landroid/widget/LinearLayout;

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
    if-eq p1, v0, :cond_3

    .line 14
    .line 15
    iget-object v0, p0, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$a;->b:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;->b(Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;)Landroidx/viewpager2/widget/ViewPager2;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 23
    move-result v0

    .line 24
    .line 25
    if-eq v0, p1, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$a;->b:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;->E(I)V

    .line 31
    .line 32
    iget-object v0, p0, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$a;->b:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;->c(Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;)Lww/b;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    iget-object v0, p0, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$a;->b:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;->c(Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;)Lww/b;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p1}, Lww/b;->b(I)V

    .line 48
    .line 49
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$a;->b:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;->d(Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;)Z

    .line 53
    move-result v0

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    iget-object v0, p0, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$a;->b:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;->b(Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;)Landroidx/viewpager2/widget/ViewPager2;

    .line 61
    move-result-object v0

    .line 62
    const/4 v1, 0x0

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p1, v1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(IZ)V

    .line 66
    return-void

    .line 67
    .line 68
    :cond_1
    iget-object v0, p0, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$a;->b:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;->b(Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;)Landroidx/viewpager2/widget/ViewPager2;

    .line 72
    move-result-object v0

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    .line 76
    return-void

    .line 77
    .line 78
    :cond_2
    iget-object v0, p0, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$a;->b:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    .line 79
    .line 80
    .line 81
    invoke-static {v0}, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;->c(Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;)Lww/b;

    .line 82
    move-result-object v0

    .line 83
    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    iget-object v0, p0, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout$a;->b:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    .line 87
    .line 88
    .line 89
    invoke-static {v0}, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;->c(Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;)Lww/b;

    .line 90
    move-result-object v0

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, p1}, Lww/b;->a(I)V

    .line 94
    :cond_3
    return-void
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
