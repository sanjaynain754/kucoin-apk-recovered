.class public final Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;
.super Landroid/widget/FrameLayout;
.source "RecordFilterRecyclerView.kt"

# interfaces
.implements Lcom/kubi/kumex/record/filter/e;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0008\u0005*\u0001\u001a\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001dB%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0008\u0010\u001c\u001a\u00020\u0006H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001b\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;",
        "Landroid/widget/FrameLayout;",
        "Lcom/kubi/kumex/record/filter/IFilterDialogCallBack;",
        "context",
        "Landroid/content/Context;",
        "title",
        "",
        "data",
        "",
        "Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$FilterGroupList;",
        "<init>",
        "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V",
        "getTitle",
        "()Ljava/lang/String;",
        "getData",
        "()Ljava/util/List;",
        "binding",
        "Lcom/kubi/kumex/databinding/BkumexViewFilterAssetRecyclerViewBinding;",
        "getBinding",
        "()Lcom/kubi/kumex/databinding/BkumexViewFilterAssetRecyclerViewBinding;",
        "binding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "leftAdapter",
        "Lio/chad/library/adapter/base/BaseQuickAdapter;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "rightAdapter",
        "com/kubi/kumex/record/filter/RecordFilterRecyclerView$rightAdapter$1",
        "Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$rightAdapter$1;",
        "getAdapterResult",
        "FilterGroupList",
        "KumexLib_googleRelease"
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
        "SMAP\nRecordFilterRecyclerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordFilterRecyclerView.kt\ncom/kubi/kumex/record/filter/RecordFilterRecyclerView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n52#2:105\n80#2,7:106\n774#3:113\n865#3,2:114\n295#3,2:116\n1878#3,3:118\n1869#3,2:121\n1#4:123\n*S KotlinDebug\n*F\n+ 1 RecordFilterRecyclerView.kt\ncom/kubi/kumex/record/filter/RecordFilterRecyclerView\n*L\n27#1:105\n27#1:106,7\n72#1:113\n72#1:114,2\n79#1:116,2\n83#1:118,3\n95#1:121,2\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic g:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lcom/kubi/sdk/viewbindingdelegate/base/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lio/chad/library/adapter/base/BaseQuickAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/chad/library/adapter/base/BaseQuickAdapter<",
            "Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;",
            "Lio/chad/library/adapter/base/BaseViewHolder;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$rightAdapter$1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lkotlin/jvm/internal/PropertyReference1Impl;

    .line 3
    .line 4
    const-string v1, "getBinding()Lcom/kubi/kumex/databinding/BkumexViewFilterAssetRecyclerViewBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;

    .line 8
    .line 9
    const-string v4, "binding"

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->property1(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;

    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    .line 19
    new-array v1, v1, [Lkotlin/reflect/KProperty;

    .line 20
    .line 21
    aput-object v0, v1, v2

    .line 22
    .line 23
    sput-object v1, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;->g:[Lkotlin/reflect/KProperty;

    .line 24
    return-void
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
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "title"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "data"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 19
    .line 20
    iput-object p2, p0, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;->b:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p3, p0, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;->c:Ljava/util/List;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lcom/kubi/sdk/viewbindingdelegate/internal/UtilsKt;->b()Lkotlin/jvm/functions/Function1;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    new-instance v1, Lcom/kubi/sdk/viewbindingdelegate/base/LazyViewBindingProperty;

    .line 29
    .line 30
    new-instance v2, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$special$$inlined$customViewBinding$1;

    .line 31
    .line 32
    .line 33
    invoke-direct {v2}, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$special$$inlined$customViewBinding$1;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-direct {v1, v0, v2}, Lcom/kubi/sdk/viewbindingdelegate/base/LazyViewBindingProperty;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 37
    .line 38
    iput-object v1, p0, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;->d:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 39
    .line 40
    sget v0, Lcom/kubi/kumex/R$layout;->bkumex_item_asset_filter_left:I

    .line 41
    .line 42
    new-instance v1, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$leftAdapter$1;

    .line 43
    .line 44
    .line 45
    invoke-direct {v1, p0, v0}, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$leftAdapter$1;-><init>(Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;I)V

    .line 46
    .line 47
    iput-object v1, p0, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;->e:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 48
    .line 49
    sget v0, Lcom/kubi/kumex/R$layout;->bkumex_item_asset_filter_right:I

    .line 50
    .line 51
    new-instance v2, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$rightAdapter$1;

    .line 52
    .line 53
    .line 54
    invoke-direct {v2, p0, v0}, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$rightAdapter$1;-><init>(Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;I)V

    .line 55
    .line 56
    iput-object v2, p0, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;->f:Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$rightAdapter$1;

    .line 57
    .line 58
    .line 59
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    sget v0, Lcom/kubi/kumex/R$layout;->bkumex_view_filter_asset_recycler_view:I

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    invoke-direct {p0}, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;->getBinding()Ldm/u4;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    if-eqz p1, :cond_0

    .line 72
    .line 73
    iget-object p1, p1, Ldm/u4;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 74
    .line 75
    if-eqz p1, :cond_0

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    .line 80
    .line 81
    :cond_0
    invoke-direct {p0}, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;->getBinding()Ldm/u4;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    if-eqz p1, :cond_1

    .line 85
    .line 86
    iget-object p1, p1, Ldm/u4;->c:Lcom/kubi/assets/view/NonInterceptRecyclerView;

    .line 87
    .line 88
    if-eqz p1, :cond_1

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 92
    .line 93
    .line 94
    :cond_1
    invoke-direct {p0}, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;->getBinding()Ldm/u4;

    .line 95
    move-result-object p1

    .line 96
    .line 97
    if-eqz p1, :cond_2

    .line 98
    .line 99
    iget-object p1, p1, Ldm/u4;->d:Lcom/kubi/assets/view/NonInterceptRecyclerView;

    .line 100
    .line 101
    if-eqz p1, :cond_2

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 105
    .line 106
    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    .line 107
    .line 108
    .line 109
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    move-result-object p2

    .line 114
    .line 115
    .line 116
    :cond_3
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    move-result p3

    .line 118
    const/4 v0, 0x1

    .line 119
    const/4 v1, 0x0

    .line 120
    .line 121
    if-eqz p3, :cond_6

    .line 122
    .line 123
    .line 124
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    move-result-object p3

    .line 126
    move-object v2, p3

    .line 127
    .line 128
    check-cast v2, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;->b()Ljava/util/List;

    .line 132
    move-result-object v2

    .line 133
    .line 134
    if-eqz v2, :cond_5

    .line 135
    .line 136
    .line 137
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 138
    move-result v2

    .line 139
    .line 140
    if-eqz v2, :cond_4

    .line 141
    goto :goto_1

    .line 142
    :cond_4
    move v0, v1

    .line 143
    .line 144
    :cond_5
    :goto_1
    if-nez v0, :cond_3

    .line 145
    .line 146
    .line 147
    invoke-interface {p1, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 148
    goto :goto_0

    .line 149
    .line 150
    .line 151
    :cond_6
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 152
    move-result p2

    .line 153
    .line 154
    if-nez p2, :cond_e

    .line 155
    .line 156
    .line 157
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 158
    move-result p2

    .line 159
    .line 160
    if-ne p2, v0, :cond_8

    .line 161
    .line 162
    .line 163
    invoke-direct {p0}, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;->getBinding()Ldm/u4;

    .line 164
    move-result-object p2

    .line 165
    .line 166
    if-eqz p2, :cond_7

    .line 167
    .line 168
    iget-object p2, p2, Ldm/u4;->b:Landroid/view/View;

    .line 169
    .line 170
    if-eqz p2, :cond_7

    .line 171
    .line 172
    .line 173
    invoke-static {p2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 174
    .line 175
    .line 176
    :cond_7
    invoke-direct {p0}, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;->getBinding()Ldm/u4;

    .line 177
    move-result-object p2

    .line 178
    .line 179
    if-eqz p2, :cond_8

    .line 180
    .line 181
    iget-object p2, p2, Ldm/u4;->c:Lcom/kubi/assets/view/NonInterceptRecyclerView;

    .line 182
    .line 183
    if-eqz p2, :cond_8

    .line 184
    .line 185
    .line 186
    invoke-static {p2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 187
    .line 188
    :cond_8
    iget-object p2, p0, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;->e:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p2, p1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 192
    .line 193
    .line 194
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 195
    move-result-object p1

    .line 196
    .line 197
    .line 198
    :cond_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    move-result p2

    .line 200
    .line 201
    if-eqz p2, :cond_a

    .line 202
    .line 203
    .line 204
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    move-result-object p2

    .line 206
    move-object p3, p2

    .line 207
    .line 208
    check-cast p3, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;

    .line 209
    .line 210
    .line 211
    invoke-virtual {p3}, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;->c()Z

    .line 212
    move-result p3

    .line 213
    .line 214
    if-eqz p3, :cond_9

    .line 215
    goto :goto_2

    .line 216
    :cond_a
    const/4 p2, 0x0

    .line 217
    .line 218
    :goto_2
    check-cast p2, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;

    .line 219
    .line 220
    if-eqz p2, :cond_e

    .line 221
    .line 222
    .line 223
    invoke-virtual {p2}, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;->b()Ljava/util/List;

    .line 224
    move-result-object p1

    .line 225
    .line 226
    if-eqz p1, :cond_e

    .line 227
    .line 228
    iget-object p2, p0, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;->f:Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$rightAdapter$1;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p2, p1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 232
    .line 233
    .line 234
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 235
    move-result-object p1

    .line 236
    move p2, v1

    .line 237
    .line 238
    .line 239
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 240
    move-result p3

    .line 241
    .line 242
    if-eqz p3, :cond_d

    .line 243
    .line 244
    .line 245
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 246
    move-result-object p3

    .line 247
    .line 248
    add-int/lit8 v0, v1, 0x1

    .line 249
    .line 250
    if-gez v1, :cond_b

    .line 251
    .line 252
    .line 253
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 254
    .line 255
    :cond_b
    check-cast p3, Lcom/kubi/resources/widget/drop/FilterType$b;

    .line 256
    .line 257
    .line 258
    invoke-interface {p3}, Lcom/kubi/resources/widget/drop/FilterType$b;->d()Z

    .line 259
    move-result p3

    .line 260
    .line 261
    if-eqz p3, :cond_c

    .line 262
    move p2, v1

    .line 263
    :cond_c
    move v1, v0

    .line 264
    goto :goto_3

    .line 265
    .line 266
    .line 267
    :cond_d
    invoke-direct {p0}, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;->getBinding()Ldm/u4;

    .line 268
    move-result-object p1

    .line 269
    .line 270
    if-eqz p1, :cond_e

    .line 271
    .line 272
    iget-object p1, p1, Ldm/u4;->d:Lcom/kubi/assets/view/NonInterceptRecyclerView;

    .line 273
    .line 274
    if-eqz p1, :cond_e

    .line 275
    .line 276
    .line 277
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 278
    move-result-object p1

    .line 279
    .line 280
    if-eqz p1, :cond_e

    .line 281
    .line 282
    .line 283
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->scrollToPosition(I)V

    .line 284
    :cond_e
    return-void
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
.end method

.method public static final synthetic a(Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;)Lio/chad/library/adapter/base/BaseQuickAdapter;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;->e:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic b(Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;)Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$rightAdapter$1;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;->f:Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$rightAdapter$1;

    .line 3
    return-object p0
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
.end method

.method private final getBinding()Ldm/u4;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;->d:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;->g:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p0, v1}, Lcom/kubi/sdk/viewbindingdelegate/base/a;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Landroidx/viewbinding/ViewBinding;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Ldm/u4;

    .line 14
    return-object v0
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
.end method


# virtual methods
.method public getAdapterResult()Ljava/lang/String;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;->e:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    const-string v2, "getData(...)"

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    move-result v2

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    check-cast v2, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;->b()Ljava/util/List;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 40
    goto :goto_0

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    move-result v1

    .line 49
    const/4 v2, 0x0

    .line 50
    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    move-result-object v1

    .line 56
    move-object v3, v1

    .line 57
    .line 58
    check-cast v3, Lcom/kubi/resources/widget/drop/FilterType$b;

    .line 59
    .line 60
    .line 61
    invoke-interface {v3}, Lcom/kubi/resources/widget/drop/FilterType$b;->d()Z

    .line 62
    move-result v3

    .line 63
    .line 64
    if-eqz v3, :cond_1

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    move-object v1, v2

    .line 67
    .line 68
    :goto_1
    check-cast v1, Lcom/kubi/resources/widget/drop/FilterType$b;

    .line 69
    .line 70
    if-eqz v1, :cond_3

    .line 71
    .line 72
    .line 73
    invoke-interface {v1}, Lcom/kubi/resources/widget/drop/FilterType$b;->a()Ljava/lang/String;

    .line 74
    move-result-object v2

    .line 75
    .line 76
    :cond_3
    if-nez v2, :cond_4

    .line 77
    .line 78
    const-string v0, ""

    .line 79
    return-object v0

    .line 80
    :cond_4
    return-object v2
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
.end method

.method public final getData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;->c:Ljava/util/List;

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
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView;->b:Ljava/lang/String;

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
.end method
