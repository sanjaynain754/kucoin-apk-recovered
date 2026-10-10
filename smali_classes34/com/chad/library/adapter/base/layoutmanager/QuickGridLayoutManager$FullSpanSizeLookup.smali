.class final Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;
.super Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;
.source "QuickGridLayoutManager.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "FullSpanSizeLookup"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0004\u0010\u0005\"\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;",
        "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;",
        "(Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;)V",
        "originalSpanSizeLookup",
        "getOriginalSpanSizeLookup",
        "()Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;",
        "setOriginalSpanSizeLookup",
        "(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V",
        "getSpanSize",
        "",
        "position",
        "com.github.CymChad.brvah"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private originalSpanSizeLookup:Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field final synthetic this$0:Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;


# direct methods
.method public constructor <init>(Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;->this$0:Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;-><init>()V

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
.end method


# virtual methods
.method public final getOriginalSpanSizeLookup()Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;->originalSpanSizeLookup:Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;

    .line 3
    return-object v0
    .line 4
    .line 5
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
.end method

.method public getSpanSize(I)I
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;->this$0:Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;->access$getAdapter$p(Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;)Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    return v1

    .line 11
    .line 12
    :cond_0
    instance-of v2, v0, Landroidx/recyclerview/widget/ConcatAdapter;

    .line 13
    .line 14
    if-eqz v2, :cond_6

    .line 15
    .line 16
    check-cast v0, Landroidx/recyclerview/widget/ConcatAdapter;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/ConcatAdapter;->getWrappedAdapterAndPosition(I)Landroid/util/Pair;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    const-string v0, "adapter.getWrappedAdapterAndPosition(position)"

    .line 23
    .line 24
    .line 25
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 30
    .line 31
    instance-of v2, v0, Lcom/chad/library/adapter/base/fullspan/FullSpanAdapterType;

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    iget-object p1, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;->this$0:Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanCount()I

    .line 39
    move-result p1

    .line 40
    return p1

    .line 41
    .line 42
    :cond_1
    instance-of v2, v0, Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 43
    .line 44
    .line 45
    const-string/jumbo v3, "pair.second"

    .line 46
    .line 47
    if-eqz v2, :cond_4

    .line 48
    .line 49
    iget-object v2, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    check-cast v2, Ljava/lang/Number;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 58
    move-result v2

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemViewType(I)I

    .line 62
    move-result v2

    .line 63
    .line 64
    check-cast v0, Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->isFullSpanItem(I)Z

    .line 68
    move-result v0

    .line 69
    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    iget-object p1, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;->this$0:Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanCount()I

    .line 76
    move-result p1

    .line 77
    return p1

    .line 78
    .line 79
    :cond_2
    iget-object v0, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;->originalSpanSizeLookup:Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;

    .line 80
    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    check-cast p1, Ljava/lang/Number;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 92
    move-result p1

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;->getSpanSize(I)I

    .line 96
    move-result p1

    .line 97
    return p1

    .line 98
    :cond_3
    return v1

    .line 99
    .line 100
    :cond_4
    iget-object v0, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;->originalSpanSizeLookup:Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;

    .line 101
    .line 102
    if-eqz v0, :cond_5

    .line 103
    .line 104
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    check-cast p1, Ljava/lang/Number;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 113
    move-result p1

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;->getSpanSize(I)I

    .line 117
    move-result p1

    .line 118
    return p1

    .line 119
    :cond_5
    return v1

    .line 120
    .line 121
    :cond_6
    instance-of v2, v0, Lcom/chad/library/adapter/base/fullspan/FullSpanAdapterType;

    .line 122
    .line 123
    if-eqz v2, :cond_7

    .line 124
    .line 125
    iget-object p1, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;->this$0:Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanCount()I

    .line 129
    move-result p1

    .line 130
    return p1

    .line 131
    .line 132
    :cond_7
    instance-of v2, v0, Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 133
    .line 134
    if-eqz v2, :cond_a

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemViewType(I)I

    .line 138
    move-result v2

    .line 139
    .line 140
    check-cast v0, Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->isFullSpanItem(I)Z

    .line 144
    move-result v0

    .line 145
    .line 146
    if-eqz v0, :cond_8

    .line 147
    .line 148
    iget-object p1, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;->this$0:Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanCount()I

    .line 152
    move-result p1

    .line 153
    return p1

    .line 154
    .line 155
    :cond_8
    iget-object v0, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;->originalSpanSizeLookup:Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;

    .line 156
    .line 157
    if-eqz v0, :cond_9

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;->getSpanSize(I)I

    .line 161
    move-result p1

    .line 162
    return p1

    .line 163
    :cond_9
    return v1

    .line 164
    .line 165
    :cond_a
    iget-object v0, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;->originalSpanSizeLookup:Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;

    .line 166
    .line 167
    if-eqz v0, :cond_b

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;->getSpanSize(I)I

    .line 171
    move-result p1

    .line 172
    return p1

    .line 173
    :cond_b
    return v1
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
.end method

.method public final setOriginalSpanSizeLookup(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;->originalSpanSizeLookup:Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;

    .line 3
    return-void
    .line 4
    .line 5
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
.end method
