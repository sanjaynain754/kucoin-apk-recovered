.class public Lcom/kubi/resources/widget/flyco/SegmentTabLayout$a;
.super Ljava/lang/Object;
.source "SegmentTabLayout.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->c(ILandroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/kubi/resources/widget/flyco/SegmentTabLayout;


# direct methods
.method public constructor <init>(Lcom/kubi/resources/widget/flyco/SegmentTabLayout;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$a;->b:Lcom/kubi/resources/widget/flyco/SegmentTabLayout;

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
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    check-cast p1, Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 10
    move-result p1

    .line 11
    .line 12
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$a;->b:Lcom/kubi/resources/widget/flyco/SegmentTabLayout;

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->a(Lcom/kubi/resources/widget/flyco/SegmentTabLayout;)I

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eq v0, p1, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$a;->b:Lcom/kubi/resources/widget/flyco/SegmentTabLayout;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->setCurrentTab(I)V

    .line 24
    .line 25
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$a;->b:Lcom/kubi/resources/widget/flyco/SegmentTabLayout;

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->b(Lcom/kubi/resources/widget/flyco/SegmentTabLayout;)Lww/b;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$a;->b:Lcom/kubi/resources/widget/flyco/SegmentTabLayout;

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->b(Lcom/kubi/resources/widget/flyco/SegmentTabLayout;)Lww/b;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Lww/b;->b(I)V

    .line 41
    return-void

    .line 42
    .line 43
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$a;->b:Lcom/kubi/resources/widget/flyco/SegmentTabLayout;

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->b(Lcom/kubi/resources/widget/flyco/SegmentTabLayout;)Lww/b;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$a;->b:Lcom/kubi/resources/widget/flyco/SegmentTabLayout;

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->b(Lcom/kubi/resources/widget/flyco/SegmentTabLayout;)Lww/b;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p1}, Lww/b;->a(I)V

    .line 59
    :cond_1
    return-void
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
