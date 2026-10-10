.class public final Lcom/sumsub/sns/core/presentation/form/f;
.super Landroidx/fragment/app/Fragment;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/sumsub/sns/core/presentation/form/f;",
        "Landroidx/fragment/app/Fragment;",
        "<init>",
        "()V",
        "com/sumsub/sns/core/presentation/form/b",
        "idensic-mobile-sdk-aar_defaultRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFormFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormFragment.kt\ncom/sumsub/sns/core/presentation/form/FormFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n+ 5 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 6 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,569:1\n360#2,7:570\n1563#2:581\n1634#2,3:582\n1374#2:585\n1460#2,5:586\n774#2:591\n865#2,2:592\n1869#2,2:594\n774#2:596\n865#2,2:597\n1#3:577\n30#4:578\n32#5,2:579\n96#6:599\n*S KotlinDebug\n*F\n+ 1 FormFragment.kt\ncom/sumsub/sns/core/presentation/form/FormFragment\n*L\n221#1:570,7\n354#1:581\n354#1:582,3\n379#1:585\n379#1:586,5\n391#1:591\n391#1:592,2\n395#1:594,2\n401#1:596\n401#1:597,2\n257#1:578\n329#1:579,2\n527#1:599\n*E\n"
    }
.end annotation


# static fields
.field public static final o:Lcom/sumsub/sns/core/presentation/form/b;

.field public static final synthetic p:[Lkotlin/reflect/KProperty;


# instance fields
.field public a:Lcom/sumsub/sns/internal/core/presentation/form/h;

.field public final b:Lcom/sumsub/sns/internal/core/common/L;

.field public final c:Lcom/sumsub/sns/internal/core/common/L;

.field public d:Lcom/sumsub/sns/core/presentation/form/viewadapter/n;

.field public e:Lcom/sumsub/sns/internal/core/presentation/android/y;

.field public final f:Lcom/sumsub/sns/core/presentation/util/a;

.field public g:Z

.field public h:Ljava/util/List;

.field public i:Ljava/util/Map;

.field public final j:Lkotlin/Lazy;

.field public k:Z

.field public final l:Lcom/sumsub/sns/core/presentation/form/d;

.field public final m:Landroid/view/ViewTreeObserver$OnPreDrawListener;

.field public final n:Lcom/sumsub/sns/core/presentation/form/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/core/presentation/form/f;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "tvTitle"

    .line 6
    .line 7
    const-string v2, "getTvTitle()Landroid/widget/TextView;"

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    const-string/jumbo v2, "tvSubtitle"

    .line 16
    .line 17
    const-string v4, "getTvSubtitle()Landroid/widget/TextView;"

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 21
    move-result-object v0

    .line 22
    const/4 v2, 0x2

    .line 23
    .line 24
    new-array v2, v2, [Lkotlin/reflect/KProperty;

    .line 25
    .line 26
    aput-object v1, v2, v3

    .line 27
    const/4 v1, 0x1

    .line 28
    .line 29
    aput-object v0, v2, v1

    .line 30
    .line 31
    sput-object v2, Lcom/sumsub/sns/core/presentation/form/f;->p:[Lkotlin/reflect/KProperty;

    .line 32
    .line 33
    new-instance v0, Lcom/sumsub/sns/core/presentation/form/b;

    .line 34
    .line 35
    .line 36
    invoke-direct {v0}, Lcom/sumsub/sns/core/presentation/form/b;-><init>()V

    .line 37
    .line 38
    sput-object v0, Lcom/sumsub/sns/core/presentation/form/f;->o:Lcom/sumsub/sns/core/presentation/form/b;

    .line 39
    return-void
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

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 4
    .line 5
    sget v0, Lcom/sumsub/sns/R$id;->sns_title:I

    .line 6
    .line 7
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 11
    .line 12
    iput-object v1, p0, Lcom/sumsub/sns/core/presentation/form/f;->b:Lcom/sumsub/sns/internal/core/common/L;

    .line 13
    .line 14
    sget v0, Lcom/sumsub/sns/R$id;->sns_subtitle:I

    .line 15
    .line 16
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 20
    .line 21
    iput-object v1, p0, Lcom/sumsub/sns/core/presentation/form/f;->c:Lcom/sumsub/sns/internal/core/common/L;

    .line 22
    .line 23
    new-instance v0, Lcom/sumsub/sns/core/presentation/util/a;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Lcom/sumsub/sns/core/presentation/util/a;-><init>()V

    .line 27
    .line 28
    iput-object v0, p0, Lcom/sumsub/sns/core/presentation/form/f;->f:Lcom/sumsub/sns/core/presentation/util/a;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iput-object v0, p0, Lcom/sumsub/sns/core/presentation/form/f;->h:Ljava/util/List;

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    iput-object v0, p0, Lcom/sumsub/sns/core/presentation/form/f;->i:Ljava/util/Map;

    .line 41
    .line 42
    new-instance v0, Lcom/sumsub/sns/core/presentation/form/i;

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, p0}, Lcom/sumsub/sns/core/presentation/form/i;-><init>(Lcom/sumsub/sns/core/presentation/form/f;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    iput-object v0, p0, Lcom/sumsub/sns/core/presentation/form/f;->j:Lkotlin/Lazy;

    .line 52
    .line 53
    new-instance v0, Lcom/sumsub/sns/core/presentation/form/d;

    .line 54
    .line 55
    .line 56
    invoke-direct {v0, p0}, Lcom/sumsub/sns/core/presentation/form/d;-><init>(Lcom/sumsub/sns/core/presentation/form/f;)V

    .line 57
    .line 58
    iput-object v0, p0, Lcom/sumsub/sns/core/presentation/form/f;->l:Lcom/sumsub/sns/core/presentation/form/d;

    .line 59
    .line 60
    new-instance v0, Lcom/sumsub/sns/core/presentation/form/j;

    .line 61
    .line 62
    .line 63
    invoke-direct {v0, p0}, Lcom/sumsub/sns/core/presentation/form/j;-><init>(Lcom/sumsub/sns/core/presentation/form/f;)V

    .line 64
    .line 65
    iput-object v0, p0, Lcom/sumsub/sns/core/presentation/form/f;->m:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 66
    .line 67
    new-instance v0, Lcom/sumsub/sns/core/presentation/form/c;

    .line 68
    .line 69
    .line 70
    invoke-direct {v0, p0}, Lcom/sumsub/sns/core/presentation/form/c;-><init>(Lcom/sumsub/sns/core/presentation/form/f;)V

    .line 71
    .line 72
    iput-object v0, p0, Lcom/sumsub/sns/core/presentation/form/f;->n:Lcom/sumsub/sns/core/presentation/form/c;

    .line 73
    return-void
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
.end method

.method public static final a(Lcom/sumsub/sns/core/presentation/form/f;)Lcom/sumsub/sns/internal/core/presentation/form/l;
    .locals 0

    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->a()Lcom/sumsub/sns/internal/core/presentation/form/k;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/sumsub/sns/internal/core/presentation/form/k;->b()Lcom/sumsub/sns/internal/core/presentation/form/l;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/core/presentation/form/f;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 38
    invoke-static {p0, p1}, Lcom/sumsub/sns/internal/core/common/F;->a(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/core/presentation/form/f;Ljava/lang/String;Landroid/net/Uri;)Lkotlin/Unit;
    .locals 0

    .line 20
    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/form/f;->a(Ljava/lang/String;Landroid/net/Uri;)V

    .line 21
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/core/presentation/form/f;I)V
    .locals 0

    .line 4
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->b()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    :cond_0
    return-void
.end method

.method public static final b(Lcom/sumsub/sns/core/presentation/form/f;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 10
    invoke-static {p0, p1}, Lcom/sumsub/sns/internal/core/common/F;->a(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final b(Lcom/sumsub/sns/core/presentation/form/f;)Z
    .locals 9

    .line 2
    iget-boolean v0, p0, Lcom/sumsub/sns/core/presentation/form/f;->g:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->b()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 4
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 5
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    goto :goto_1

    .line 6
    :cond_2
    invoke-virtual {v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    move-result v2

    add-int/2addr v2, v1

    invoke-static {v2, v0}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v2

    if-lt v2, v0, :cond_3

    .line 7
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-string/jumbo v5, "onScrollStateChanged: LAST"

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 8
    iput-boolean v1, p0, Lcom/sumsub/sns/core/presentation/form/f;->g:Z

    .line 9
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->a()Lcom/sumsub/sns/internal/core/presentation/form/k;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-interface {p0}, Lcom/sumsub/sns/internal/core/presentation/form/k;->a()V

    :cond_3
    :goto_1
    return v1
.end method


# virtual methods
.method public final a()Lcom/sumsub/sns/internal/core/presentation/form/k;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    move-result-object v0

    instance-of v1, v0, Lcom/sumsub/sns/internal/core/presentation/form/d;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/form/d;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/sumsub/sns/internal/core/presentation/form/d;->a()Lcom/sumsub/sns/internal/core/presentation/form/k;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    return-object v0

    .line 2
    :cond_2
    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    instance-of v1, v0, Lcom/sumsub/sns/internal/core/presentation/form/d;

    if-eqz v1, :cond_3

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/form/d;

    goto :goto_2

    :cond_3
    move-object v0, v2

    :goto_2
    if-eqz v0, :cond_4

    invoke-interface {v0}, Lcom/sumsub/sns/internal/core/presentation/form/d;->a()Lcom/sumsub/sns/internal/core/presentation/form/k;

    move-result-object v0

    return-object v0

    :cond_4
    return-object v2
.end method

.method public final a(Ljava/util/ArrayList;)Ljava/util/List;
    .locals 14

    .line 59
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->a()Lcom/sumsub/sns/internal/core/presentation/form/k;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-interface {v0}, Lcom/sumsub/sns/internal/core/presentation/form/k;->d()Lkotlinx/coroutines/flow/w;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/form/f;

    if-eqz v0, :cond_9

    .line 60
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/form/f;->b:Ljava/util/List;

    if-eqz v0, :cond_9

    .line 61
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 62
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 63
    check-cast v2, Lcom/sumsub/sns/internal/core/presentation/form/h;

    .line 64
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/form/h;->d:Ljava/util/List;

    .line 65
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    .line 66
    :cond_0
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/form/model/f;->a:Lcom/sumsub/sns/internal/core/presentation/form/model/h0;

    .line 67
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/f;->j:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/form/l;

    .line 68
    invoke-static {v1, v0}, Lcom/sumsub/sns/internal/core/presentation/form/model/f;->a(Ljava/util/ArrayList;Lcom/sumsub/sns/internal/core/presentation/form/l;)Lcom/sumsub/sns/internal/core/presentation/form/model/e;

    move-result-object v0

    .line 69
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/form/model/e;->a:Ljava/util/LinkedHashSet;

    .line 70
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/form/model/e;->b:Ljava/util/LinkedHashSet;

    .line 71
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 72
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "hidden sections: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 73
    :cond_1
    sget-boolean v2, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    if-eqz v2, :cond_4

    .line 74
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 75
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :cond_2
    :goto_1
    if-ge v5, v3, :cond_3

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v5, v5, 0x1

    move-object v7, v6

    check-cast v7, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 76
    invoke-static {v7}, Lcom/sumsub/sns/core/presentation/form/model/b;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    move-result-object v7

    invoke-interface {v0, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 77
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 78
    :cond_3
    sget-object v8, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "hidden items: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 79
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    :goto_2
    if-ge v4, v3, :cond_4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v4, v4, 0x1

    check-cast v5, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 80
    sget-object v6, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "hidden "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    goto :goto_2

    .line 81
    :cond_4
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    .line 82
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 83
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 84
    instance-of v5, v4, Lcom/sumsub/sns/internal/core/presentation/form/model/Q;

    if-eqz v5, :cond_6

    move-object v6, v4

    check-cast v6, Lcom/sumsub/sns/internal/core/presentation/form/model/Q;

    .line 85
    iget-object v6, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/Q;->e:Ljava/lang/String;

    .line 86
    invoke-interface {v1, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    :cond_6
    if-nez v5, :cond_5

    .line 87
    invoke-static {v4}, Lcom/sumsub/sns/core/presentation/form/model/b;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    .line 88
    :cond_7
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    return-object v2

    :cond_9
    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/form/h;)V
    .locals 9

    .line 39
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/f;->a:Lcom/sumsub/sns/internal/core/presentation/form/h;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 40
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string/jumbo v3, "skipping page update"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    return-void

    .line 41
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 42
    :cond_1
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    move-result-object v2

    .line 43
    iget v0, p1, Lcom/sumsub/sns/internal/core/presentation/form/h;->a:I

    .line 44
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "creating views for page "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    const/4 v0, 0x1

    .line 45
    iput-boolean v0, p0, Lcom/sumsub/sns/core/presentation/form/f;->k:Z

    .line 46
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/sumsub/sns/core/presentation/form/f;->i:Ljava/util/Map;

    .line 47
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->d()V

    .line 48
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/f;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 49
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 50
    sget-boolean v2, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    if-eqz v2, :cond_2

    .line 51
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->j()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v6, "showing view for "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 52
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->f()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    .line 53
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->g()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :cond_4
    :goto_1
    if-eqz v2, :cond_2

    .line 54
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    move-result-object v4

    .line 55
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->j()Ljava/lang/String;

    move-result-object v1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "initial value for "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " = "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    .line 56
    invoke-static/range {v3 .. v8}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    goto :goto_0

    :cond_5
    const/4 v0, 0x0

    .line 57
    iput-boolean v0, p0, Lcom/sumsub/sns/core/presentation/form/f;->k:Z

    .line 58
    iput-object p1, p0, Lcom/sumsub/sns/core/presentation/form/f;->a:Lcom/sumsub/sns/internal/core/presentation/form/h;

    return-void
.end method

.method public final a(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 6

    .line 89
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleFilePickResult: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    if-nez p2, :cond_0

    goto :goto_0

    .line 90
    :cond_0
    :try_start_0
    sget-boolean v0, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    .line 91
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/J;->a(Z)Lxg0/a;

    move-result-object v0

    .line 92
    invoke-virtual {v0}, Lxg0/a;->getSerializersModule()Lyg0/a;

    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/form/FieldId;->Companion:Lcom/sumsub/sns/internal/core/presentation/form/b;

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/presentation/form/b;->serializer()Ltg0/d;

    move-result-object v1

    invoke-static {v1}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    move-result-object v1

    check-cast v1, Ltg0/c;

    invoke-virtual {v0, v1, p1}, Lxg0/a;->a(Ltg0/c;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/form/FieldId;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_1

    goto :goto_0

    .line 93
    :cond_1
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->a()Lcom/sumsub/sns/internal/core/presentation/form/k;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 94
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 95
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    :catchall_0
    :cond_2
    :goto_0
    return-void
.end method

.method public final a(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 7

    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/f;->e:Lcom/sumsub/sns/internal/core/presentation/android/y;

    if-eqz v0, :cond_0

    return-void

    .line 6
    :cond_0
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/android/y;

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getActivityResultRegistry()Landroidx/activity/result/ActivityResultRegistry;

    move-result-object v2

    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/f;->f:Lcom/sumsub/sns/core/presentation/util/a;

    .line 9
    iget-object v0, v0, Lcom/sumsub/sns/core/presentation/util/a;->a:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v0, :cond_1

    move-object v0, v3

    :cond_1
    if-nez p1, :cond_2

    .line 10
    sget p1, Lcom/sumsub/sns/R$string;->sns_questionnaire_mime_types:I

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    :cond_2
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/common/c;->a(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 11
    new-instance v5, Lcom/sumsub/sns/core/presentation/form/k;

    invoke-direct {v5, p0}, Lcom/sumsub/sns/core/presentation/form/k;-><init>(Lcom/sumsub/sns/core/presentation/form/f;)V

    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_4

    const-string v6, "id_doc_set_type"

    invoke-virtual {p1, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    move-object v6, p1

    move-object v3, v0

    goto :goto_2

    .line 13
    :cond_4
    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    move-result-object p1

    instance-of v6, p1, Lcom/sumsub/sns/core/presentation/base/l;

    if-eqz v6, :cond_5

    move-object v3, p1

    check-cast v3, Lcom/sumsub/sns/core/presentation/base/l;

    :cond_5
    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lcom/sumsub/sns/core/presentation/base/l;->getIdDocSetType()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 14
    :cond_6
    const-string p1, "TYPE_UNKNOWN"

    goto :goto_0

    .line 15
    :goto_2
    invoke-direct/range {v1 .. v6}, Lcom/sumsub/sns/internal/core/presentation/android/y;-><init>(Landroidx/activity/result/ActivityResultRegistry;Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;)V

    if-eqz p2, :cond_7

    .line 16
    const-string p1, "OBSERVER_ITEM_ID"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 17
    iput-object p1, v1, Lcom/sumsub/sns/internal/core/presentation/android/y;->h:Ljava/lang/String;

    .line 18
    :cond_7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 19
    iput-object v1, p0, Lcom/sumsub/sns/core/presentation/form/f;->e:Lcom/sumsub/sns/internal/core/presentation/android/y;

    return-void
.end method

.method public final a(Ljava/util/List;I)V
    .locals 8

    .line 22
    invoke-static {p1, p2}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/form/h;

    .line 23
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    move-result-object v2

    const/4 v7, 0x0

    if-eqz v0, :cond_0

    .line 24
    iget-object v3, v0, Lcom/sumsub/sns/internal/core/presentation/form/h;->d:Ljava/util/List;

    if-eqz v3, :cond_0

    .line 25
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v7

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "showPage: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " has "

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " items"

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 26
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_8

    if-nez v0, :cond_1

    goto :goto_2

    .line 27
    :cond_1
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/form/f;->b:Lcom/sumsub/sns/internal/core/common/L;

    sget-object p2, Lcom/sumsub/sns/core/presentation/form/f;->p:[Lkotlin/reflect/KProperty;

    const/4 v1, 0x0

    aget-object v2, p2, v1

    invoke-virtual {p1, p0, v2}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_3

    .line 28
    iget-object v2, v0, Lcom/sumsub/sns/internal/core/presentation/form/h;->b:Ljava/lang/String;

    if-eqz v2, :cond_2

    .line 29
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-object v2, v7

    :goto_1
    invoke-static {p1, v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 30
    :cond_3
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/form/f;->c:Lcom/sumsub/sns/internal/core/common/L;

    const/4 v2, 0x1

    aget-object v3, p2, v2

    invoke-virtual {p1, p0, v3}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_5

    .line 31
    iget-object v3, v0, Lcom/sumsub/sns/internal/core/presentation/form/h;->c:Ljava/lang/String;

    if-eqz v3, :cond_4

    .line 32
    invoke-static {v3}, Lkotlin/text/StringsKt;->trimIndent(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v7

    :cond_4
    invoke-static {p1, v7}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 33
    :cond_5
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/form/f;->b:Lcom/sumsub/sns/internal/core/common/L;

    aget-object v1, p2, v1

    invoke-virtual {p1, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_6

    .line 34
    new-instance v1, Lcom/sumsub/sns/core/presentation/form/m;

    invoke-direct {v1, p0}, Lcom/sumsub/sns/core/presentation/form/m;-><init>(Lcom/sumsub/sns/core/presentation/form/f;)V

    invoke-static {p1, v1}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V

    .line 35
    :cond_6
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/form/f;->c:Lcom/sumsub/sns/internal/core/common/L;

    aget-object p2, p2, v2

    invoke-virtual {p1, p0, p2}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_7

    .line 36
    new-instance p2, Lcom/sumsub/sns/core/presentation/form/n;

    invoke-direct {p2, p0}, Lcom/sumsub/sns/core/presentation/form/n;-><init>(Lcom/sumsub/sns/core/presentation/form/f;)V

    invoke-static {p1, p2}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V

    .line 37
    :cond_7
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/form/f;->a(Lcom/sumsub/sns/internal/core/presentation/form/h;)V

    :cond_8
    :goto_2
    return-void
.end method

.method public final b()Landroidx/recyclerview/widget/RecyclerView;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    sget v1, Lcom/sumsub/sns/R$id;->sns_list:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v1, "client_tag"

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    :cond_0
    const-string v0, "_"

    .line 17
    .line 18
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v0, "::FormFragment"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    move-result-object v0

    .line 34
    return-object v0
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

.method public final d()V
    .locals 15

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->a()Lcom/sumsub/sns/internal/core/presentation/form/k;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_9

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lcom/sumsub/sns/internal/core/presentation/form/k;->d()Lkotlinx/coroutines/flow/w;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_9

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto/16 :goto_2

    .line 23
    .line 24
    :cond_0
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/form/f;->b:Ljava/util/List;

    .line 25
    .line 26
    iget v0, v0, Lcom/sumsub/sns/internal/core/presentation/form/f;->a:I

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/form/h;

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    goto/16 :goto_2

    .line 37
    .line 38
    :cond_1
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/form/h;->d:Ljava/util/List;

    .line 39
    .line 40
    new-instance v2, Ljava/util/ArrayList;

    .line 41
    .line 42
    .line 43
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    iget-object v3, v0, Lcom/sumsub/sns/internal/core/presentation/form/h;->b:Ljava/lang/String;

    .line 46
    .line 47
    const-string v4, ""

    .line 48
    .line 49
    if-eqz v3, :cond_2

    .line 50
    .line 51
    new-instance v5, Lcom/sumsub/sns/internal/core/presentation/form/model/d0;

    .line 52
    .line 53
    .line 54
    invoke-direct {v5, v3, v4}, Lcom/sumsub/sns/internal/core/presentation/form/model/d0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    :cond_2
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/form/h;->c:Ljava/lang/String;

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    new-instance v3, Lcom/sumsub/sns/internal/core/presentation/form/model/X;

    .line 64
    .line 65
    .line 66
    invoke-direct {v3, v0, v4}, Lcom/sumsub/sns/internal/core/presentation/form/model/X;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v2}, Lcom/sumsub/sns/core/presentation/form/f;->a(Ljava/util/ArrayList;)Ljava/util/List;

    .line 76
    move-result-object v0

    .line 77
    .line 78
    new-instance v1, Ljava/util/ArrayList;

    .line 79
    .line 80
    const/16 v2, 0xa

    .line 81
    .line 82
    .line 83
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 84
    move-result v2

    .line 85
    .line 86
    .line 87
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 88
    .line 89
    check-cast v0, Ljava/util/ArrayList;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 93
    move-result v2

    .line 94
    const/4 v3, 0x0

    .line 95
    move v4, v3

    .line 96
    .line 97
    :goto_0
    if-ge v4, v2, :cond_5

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 101
    move-result-object v5

    .line 102
    .line 103
    add-int/lit8 v4, v4, 0x1

    .line 104
    .line 105
    check-cast v5, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 106
    .line 107
    iget-object v6, p0, Lcom/sumsub/sns/core/presentation/form/f;->i:Ljava/util/Map;

    .line 108
    .line 109
    .line 110
    invoke-static {v5}, Lcom/sumsub/sns/core/presentation/form/model/b;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    .line 111
    move-result-object v7

    .line 112
    .line 113
    .line 114
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    move-result-object v6

    .line 116
    .line 117
    check-cast v6, Ljava/lang/String;

    .line 118
    .line 119
    if-eqz v6, :cond_4

    .line 120
    .line 121
    sget-object v7, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    .line 125
    move-result-object v8

    .line 126
    .line 127
    .line 128
    invoke-virtual {v5}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->j()Ljava/lang/String;

    .line 129
    move-result-object v9

    .line 130
    .line 131
    new-instance v10, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    .line 136
    const-string v11, "field with error "

    .line 137
    .line 138
    .line 139
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    move-result-object v9

    .line 147
    const/4 v11, 0x4

    .line 148
    const/4 v12, 0x0

    .line 149
    const/4 v10, 0x0

    .line 150
    .line 151
    .line 152
    invoke-static/range {v7 .. v12}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    invoke-static {v5, v6}, Lcom/sumsub/sns/internal/core/presentation/form/model/g0;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 156
    move-result-object v5

    .line 157
    .line 158
    .line 159
    :cond_4
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    goto :goto_0

    .line 161
    .line 162
    :cond_5
    iput-object v1, p0, Lcom/sumsub/sns/core/presentation/form/f;->h:Ljava/util/List;

    .line 163
    .line 164
    sget-boolean v0, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    .line 165
    .line 166
    if-eqz v0, :cond_8

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 170
    move-result v0

    .line 171
    .line 172
    :cond_6
    if-ge v3, v0, :cond_7

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 176
    move-result-object v2

    .line 177
    .line 178
    add-int/lit8 v3, v3, 0x1

    .line 179
    move-object v4, v2

    .line 180
    .line 181
    check-cast v4, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 182
    .line 183
    instance-of v4, v4, Lcom/sumsub/sns/internal/core/presentation/form/model/O;

    .line 184
    .line 185
    if-eqz v4, :cond_6

    .line 186
    goto :goto_1

    .line 187
    :cond_7
    const/4 v2, 0x0

    .line 188
    .line 189
    :goto_1
    check-cast v2, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 190
    .line 191
    if-eqz v2, :cond_8

    .line 192
    .line 193
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    .line 197
    move-result-object v4

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b()Ljava/lang/CharSequence;

    .line 201
    move-result-object v0

    .line 202
    .line 203
    new-instance v2, Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 207
    .line 208
    .line 209
    const-string/jumbo v5, "phone field error="

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    move-result-object v5

    .line 220
    const/4 v7, 0x4

    .line 221
    const/4 v8, 0x0

    .line 222
    const/4 v6, 0x0

    .line 223
    .line 224
    .line 225
    invoke-static/range {v3 .. v8}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 226
    .line 227
    :cond_8
    sget-object v9, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    .line 231
    move-result-object v10

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 235
    move-result v0

    .line 236
    .line 237
    new-instance v2, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 241
    .line 242
    .line 243
    const-string/jumbo v3, "visible "

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    const-string v0, " items"

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 258
    move-result-object v11

    .line 259
    const/4 v13, 0x4

    .line 260
    const/4 v14, 0x0

    .line 261
    const/4 v12, 0x0

    .line 262
    .line 263
    .line 264
    invoke-static/range {v9 .. v14}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 265
    .line 266
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/f;->d:Lcom/sumsub/sns/core/presentation/form/viewadapter/n;

    .line 267
    .line 268
    if-eqz v0, :cond_9

    .line 269
    .line 270
    iget-object v2, v0, Lcom/sumsub/sns/core/presentation/base/adapter/b;->a:Ljava/util/ArrayList;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0, v2, v1}, Lcom/sumsub/sns/core/presentation/form/viewadapter/n;->a(Ljava/util/ArrayList;Ljava/util/List;)Landroidx/recyclerview/widget/DiffUtil$Callback;

    .line 274
    move-result-object v2

    .line 275
    .line 276
    .line 277
    invoke-static {v2}, Landroidx/recyclerview/widget/DiffUtil;->calculateDiff(Landroidx/recyclerview/widget/DiffUtil$Callback;)Landroidx/recyclerview/widget/DiffUtil$DiffResult;

    .line 278
    move-result-object v2

    .line 279
    .line 280
    iget-object v3, v0, Lcom/sumsub/sns/core/presentation/base/adapter/b;->a:Ljava/util/ArrayList;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 284
    .line 285
    iget-object v3, v0, Lcom/sumsub/sns/core/presentation/base/adapter/b;->a:Ljava/util/ArrayList;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 289
    .line 290
    .line 291
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/DiffUtil$DiffResult;->dispatchUpdatesTo(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 292
    :cond_9
    :goto_2
    return-void
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
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
.end method

.method public final e()Z
    .locals 13

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->b()Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return v1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->a()Lcom/sumsub/sns/internal/core/presentation/form/k;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_17

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lcom/sumsub/sns/internal/core/presentation/form/k;->d()Lkotlinx/coroutines/flow/w;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    if-eqz v0, :cond_17

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    goto/16 :goto_7

    .line 31
    .line 32
    :cond_1
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/form/f;->d:Lcom/sumsub/sns/internal/core/presentation/form/j;

    .line 33
    .line 34
    if-nez v0, :cond_2

    .line 35
    return v1

    .line 36
    .line 37
    :cond_2
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 38
    .line 39
    .line 40
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 41
    .line 42
    iget-object v3, p0, Lcom/sumsub/sns/core/presentation/form/f;->h:Ljava/util/List;

    .line 43
    .line 44
    .line 45
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 46
    move-result-object v3

    .line 47
    const/4 v4, 0x0

    .line 48
    move-object v5, v4

    .line 49
    .line 50
    .line 51
    :cond_3
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    move-result v6

    .line 53
    .line 54
    if-eqz v6, :cond_12

    .line 55
    .line 56
    .line 57
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    move-result-object v6

    .line 59
    .line 60
    check-cast v6, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 61
    .line 62
    iget-object v7, p0, Lcom/sumsub/sns/core/presentation/form/f;->l:Lcom/sumsub/sns/core/presentation/form/d;

    .line 63
    .line 64
    .line 65
    invoke-static {v6, v7}, Lcom/sumsub/sns/core/presentation/form/model/b;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Lcom/sumsub/sns/core/presentation/form/d;)Z

    .line 66
    move-result v7

    .line 67
    .line 68
    if-eqz v7, :cond_4

    .line 69
    goto :goto_0

    .line 70
    .line 71
    :cond_4
    if-nez v5, :cond_5

    .line 72
    move-object v5, v6

    .line 73
    .line 74
    :cond_5
    sget-object v7, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    .line 78
    move-result-object v8

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->j()Ljava/lang/String;

    .line 82
    move-result-object v9

    .line 83
    .line 84
    new-instance v10, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    const-string v11, "failed check for "

    .line 90
    .line 91
    .line 92
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    move-result-object v9

    .line 100
    const/4 v11, 0x4

    .line 101
    const/4 v12, 0x0

    .line 102
    const/4 v10, 0x0

    .line 103
    .line 104
    .line 105
    invoke-static/range {v7 .. v12}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 106
    .line 107
    iget-object v7, p0, Lcom/sumsub/sns/core/presentation/form/f;->l:Lcom/sumsub/sns/core/presentation/form/d;

    .line 108
    .line 109
    instance-of v8, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;

    .line 110
    .line 111
    if-nez v8, :cond_10

    .line 112
    .line 113
    instance-of v8, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/b0;

    .line 114
    .line 115
    if-nez v8, :cond_10

    .line 116
    .line 117
    instance-of v8, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/l;

    .line 118
    .line 119
    if-nez v8, :cond_10

    .line 120
    .line 121
    instance-of v8, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/s;

    .line 122
    .line 123
    if-nez v8, :cond_10

    .line 124
    .line 125
    instance-of v8, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/u;

    .line 126
    .line 127
    if-nez v8, :cond_10

    .line 128
    .line 129
    instance-of v8, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/q;

    .line 130
    .line 131
    if-nez v8, :cond_10

    .line 132
    .line 133
    instance-of v8, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/V;

    .line 134
    .line 135
    if-eqz v8, :cond_6

    .line 136
    .line 137
    goto/16 :goto_2

    .line 138
    .line 139
    :cond_6
    instance-of v8, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/O;

    .line 140
    .line 141
    if-eqz v8, :cond_9

    .line 142
    move-object v8, v6

    .line 143
    .line 144
    check-cast v8, Lcom/sumsub/sns/internal/core/presentation/form/model/O;

    .line 145
    .line 146
    .line 147
    invoke-static {v8}, Lcom/sumsub/sns/core/presentation/form/model/b;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/O;)Lcom/sumsub/sns/internal/core/presentation/form/model/E;

    .line 148
    move-result-object v9

    .line 149
    .line 150
    .line 151
    invoke-virtual {v7, v9}, Lcom/sumsub/sns/core/presentation/form/d;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/lang/String;

    .line 152
    move-result-object v9

    .line 153
    .line 154
    .line 155
    invoke-virtual {v7, v6}, Lcom/sumsub/sns/core/presentation/form/d;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/lang/String;

    .line 156
    move-result-object v7

    .line 157
    .line 158
    if-nez v7, :cond_7

    .line 159
    .line 160
    const-string v7, ""

    .line 161
    .line 162
    :cond_7
    sget-object v10, Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/remote/j0;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-static {v9, v7}, Lcom/sumsub/sns/internal/features/data/model/common/remote/j0;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 169
    move-result-object v9

    .line 170
    .line 171
    iget-object v8, v8, Lcom/sumsub/sns/internal/core/presentation/form/model/O;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 172
    .line 173
    .line 174
    invoke-static {v8, v9}, Lcom/sumsub/sns/internal/core/presentation/form/model/i0;->a(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/presentation/form/model/FieldError;

    .line 175
    move-result-object v8

    .line 176
    .line 177
    if-nez v8, :cond_8

    .line 178
    .line 179
    .line 180
    invoke-static {v7}, Lcom/sumsub/sns/internal/core/presentation/widget/autocompletePhone/util/a;->a(Ljava/lang/String;)Z

    .line 181
    move-result v7

    .line 182
    .line 183
    if-nez v7, :cond_8

    .line 184
    .line 185
    sget-object v7, Lcom/sumsub/sns/internal/core/presentation/form/model/FieldError;->NOT_VALID:Lcom/sumsub/sns/internal/core/presentation/form/model/FieldError;

    .line 186
    .line 187
    .line 188
    invoke-static {v7, v0}, Lcom/sumsub/sns/core/presentation/form/model/b;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/FieldError;Lcom/sumsub/sns/internal/core/presentation/form/j;)Ljava/lang/String;

    .line 189
    move-result-object v7

    .line 190
    .line 191
    goto/16 :goto_4

    .line 192
    .line 193
    :cond_8
    if-eqz v8, :cond_11

    .line 194
    .line 195
    .line 196
    invoke-static {v8, v0}, Lcom/sumsub/sns/core/presentation/form/model/b;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/FieldError;Lcom/sumsub/sns/internal/core/presentation/form/j;)Ljava/lang/String;

    .line 197
    move-result-object v7

    .line 198
    .line 199
    goto/16 :goto_4

    .line 200
    .line 201
    :cond_9
    instance-of v8, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/M;

    .line 202
    .line 203
    if-nez v8, :cond_f

    .line 204
    .line 205
    instance-of v8, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/T;

    .line 206
    .line 207
    if-nez v8, :cond_f

    .line 208
    .line 209
    instance-of v8, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/o;

    .line 210
    .line 211
    if-eqz v8, :cond_a

    .line 212
    goto :goto_1

    .line 213
    .line 214
    :cond_a
    instance-of v8, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/C;

    .line 215
    .line 216
    if-eqz v8, :cond_c

    .line 217
    move-object v8, v6

    .line 218
    .line 219
    check-cast v8, Lcom/sumsub/sns/internal/core/presentation/form/model/C;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v7, v8}, Lcom/sumsub/sns/core/presentation/form/d;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/lang/String;

    .line 223
    move-result-object v7

    .line 224
    .line 225
    iget-object v8, v8, Lcom/sumsub/sns/internal/core/presentation/form/model/C;->d:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 226
    .line 227
    iget-object v8, v8, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->e:Ljava/lang/Boolean;

    .line 228
    .line 229
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 230
    .line 231
    .line 232
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 233
    move-result v8

    .line 234
    .line 235
    if-eqz v8, :cond_11

    .line 236
    .line 237
    if-eqz v7, :cond_b

    .line 238
    .line 239
    goto/16 :goto_3

    .line 240
    .line 241
    :cond_b
    sget-object v7, Lcom/sumsub/sns/internal/core/presentation/form/model/FieldError;->REQUIRED:Lcom/sumsub/sns/internal/core/presentation/form/model/FieldError;

    .line 242
    .line 243
    .line 244
    invoke-static {v7, v0}, Lcom/sumsub/sns/core/presentation/form/model/b;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/FieldError;Lcom/sumsub/sns/internal/core/presentation/form/j;)Ljava/lang/String;

    .line 245
    move-result-object v7

    .line 246
    goto :goto_4

    .line 247
    .line 248
    :cond_c
    instance-of v8, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/K;

    .line 249
    .line 250
    if-eqz v8, :cond_d

    .line 251
    move-object v8, v6

    .line 252
    .line 253
    check-cast v8, Lcom/sumsub/sns/internal/core/presentation/form/model/K;

    .line 254
    .line 255
    .line 256
    invoke-static {v8, v7}, Lcom/sumsub/sns/core/presentation/form/model/b;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/K;Lcom/sumsub/sns/core/presentation/form/d;)Z

    .line 257
    move-result v7

    .line 258
    .line 259
    if-nez v7, :cond_11

    .line 260
    .line 261
    sget-object v7, Lcom/sumsub/sns/internal/core/presentation/form/model/FieldError;->REQUIRED:Lcom/sumsub/sns/internal/core/presentation/form/model/FieldError;

    .line 262
    .line 263
    .line 264
    invoke-static {v7, v0}, Lcom/sumsub/sns/core/presentation/form/model/b;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/FieldError;Lcom/sumsub/sns/internal/core/presentation/form/j;)Ljava/lang/String;

    .line 265
    move-result-object v7

    .line 266
    goto :goto_4

    .line 267
    .line 268
    :cond_d
    instance-of v7, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/w;

    .line 269
    .line 270
    if-nez v7, :cond_11

    .line 271
    .line 272
    instance-of v7, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/E;

    .line 273
    .line 274
    if-nez v7, :cond_11

    .line 275
    .line 276
    instance-of v7, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/Q;

    .line 277
    .line 278
    if-nez v7, :cond_11

    .line 279
    .line 280
    instance-of v7, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/X;

    .line 281
    .line 282
    if-nez v7, :cond_11

    .line 283
    .line 284
    instance-of v7, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/G;

    .line 285
    .line 286
    if-nez v7, :cond_11

    .line 287
    .line 288
    instance-of v7, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/y;

    .line 289
    .line 290
    if-nez v7, :cond_11

    .line 291
    .line 292
    instance-of v7, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/d0;

    .line 293
    .line 294
    if-nez v7, :cond_11

    .line 295
    .line 296
    instance-of v7, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/h;

    .line 297
    .line 298
    if-nez v7, :cond_11

    .line 299
    .line 300
    instance-of v7, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/I;

    .line 301
    .line 302
    if-eqz v7, :cond_e

    .line 303
    goto :goto_3

    .line 304
    .line 305
    :cond_e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 306
    .line 307
    .line 308
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 309
    throw v0

    .line 310
    .line 311
    :cond_f
    :goto_1
    sget-object v8, Lcom/sumsub/sns/internal/core/presentation/form/model/FieldError;->REQUIRED:Lcom/sumsub/sns/internal/core/presentation/form/model/FieldError;

    .line 312
    .line 313
    .line 314
    invoke-static {v8, v0}, Lcom/sumsub/sns/core/presentation/form/model/b;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/FieldError;Lcom/sumsub/sns/internal/core/presentation/form/j;)Ljava/lang/String;

    .line 315
    move-result-object v8

    .line 316
    .line 317
    .line 318
    invoke-static {v6, v7}, Lcom/sumsub/sns/core/presentation/form/model/b;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Lcom/sumsub/sns/core/presentation/form/d;)Z

    .line 319
    move-result v7

    .line 320
    .line 321
    if-nez v7, :cond_11

    .line 322
    move-object v7, v8

    .line 323
    goto :goto_4

    .line 324
    .line 325
    .line 326
    :cond_10
    :goto_2
    invoke-virtual {v6}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 327
    move-result-object v8

    .line 328
    .line 329
    .line 330
    invoke-virtual {v7, v6}, Lcom/sumsub/sns/core/presentation/form/d;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/lang/String;

    .line 331
    move-result-object v7

    .line 332
    .line 333
    .line 334
    invoke-static {v8, v7}, Lcom/sumsub/sns/internal/core/presentation/form/model/i0;->a(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/presentation/form/model/FieldError;

    .line 335
    move-result-object v7

    .line 336
    .line 337
    if-eqz v7, :cond_11

    .line 338
    .line 339
    .line 340
    invoke-static {v7, v0}, Lcom/sumsub/sns/core/presentation/form/model/b;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/FieldError;Lcom/sumsub/sns/internal/core/presentation/form/j;)Ljava/lang/String;

    .line 341
    move-result-object v7

    .line 342
    goto :goto_4

    .line 343
    :cond_11
    :goto_3
    move-object v7, v4

    .line 344
    .line 345
    :goto_4
    if-eqz v7, :cond_3

    .line 346
    .line 347
    .line 348
    invoke-static {v6}, Lcom/sumsub/sns/core/presentation/form/model/b;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    .line 349
    move-result-object v6

    .line 350
    .line 351
    .line 352
    invoke-interface {v2, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    goto/16 :goto_0

    .line 355
    .line 356
    :cond_12
    iput-object v2, p0, Lcom/sumsub/sns/core/presentation/form/f;->i:Ljava/util/Map;

    .line 357
    .line 358
    if-eqz v5, :cond_16

    .line 359
    .line 360
    .line 361
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->d()V

    .line 362
    .line 363
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/f;->h:Ljava/util/List;

    .line 364
    .line 365
    .line 366
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 367
    move-result-object v0

    .line 368
    move v2, v1

    .line 369
    .line 370
    .line 371
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 372
    move-result v3

    .line 373
    .line 374
    if-eqz v3, :cond_14

    .line 375
    .line 376
    .line 377
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 378
    move-result-object v3

    .line 379
    .line 380
    check-cast v3, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 381
    .line 382
    .line 383
    invoke-static {v3}, Lcom/sumsub/sns/core/presentation/form/model/b;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    .line 384
    move-result-object v3

    .line 385
    .line 386
    .line 387
    invoke-static {v5}, Lcom/sumsub/sns/core/presentation/form/model/b;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    .line 388
    move-result-object v4

    .line 389
    .line 390
    .line 391
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 392
    move-result v3

    .line 393
    .line 394
    if-eqz v3, :cond_13

    .line 395
    goto :goto_6

    .line 396
    .line 397
    :cond_13
    add-int/lit8 v2, v2, 0x1

    .line 398
    goto :goto_5

    .line 399
    :cond_14
    const/4 v2, -0x1

    .line 400
    .line 401
    :goto_6
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 402
    .line 403
    .line 404
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    .line 405
    move-result-object v4

    .line 406
    .line 407
    new-instance v0, Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 411
    .line 412
    .line 413
    const-string/jumbo v5, "validateForm: scroll to "

    .line 414
    .line 415
    .line 416
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    const-string v5, " position"

    .line 422
    .line 423
    .line 424
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 428
    move-result-object v5

    .line 429
    const/4 v7, 0x4

    .line 430
    const/4 v8, 0x0

    .line 431
    const/4 v6, 0x0

    .line 432
    .line 433
    .line 434
    invoke-static/range {v3 .. v8}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 435
    .line 436
    if-ltz v2, :cond_15

    .line 437
    .line 438
    .line 439
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->b()Landroidx/recyclerview/widget/RecyclerView;

    .line 440
    move-result-object v0

    .line 441
    .line 442
    if-eqz v0, :cond_15

    .line 443
    .line 444
    new-instance v3, Lcom/sumsub/sns/core/presentation/form/l;

    .line 445
    .line 446
    .line 447
    invoke-direct {v3, p0, v2}, Lcom/sumsub/sns/core/presentation/form/l;-><init>(Lcom/sumsub/sns/core/presentation/form/f;I)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 451
    :cond_15
    return v1

    .line 452
    :cond_16
    const/4 v0, 0x1

    .line 453
    return v0

    .line 454
    :cond_17
    :goto_7
    return v1
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
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/f;->f:Lcom/sumsub/sns/core/presentation/util/a;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/core/presentation/util/a;->a(Landroid/os/Bundle;)V

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, p1}, Lcom/sumsub/sns/core/presentation/form/f;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 15
    :cond_0
    return-void
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
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x0

    .line 9
    .line 10
    .line 11
    const-string/jumbo v2, "onCreateView"

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    .line 15
    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 16
    .line 17
    sget p3, Lcom/sumsub/sns/R$layout;->sns_form_fragment:I

    .line 18
    const/4 v0, 0x0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 22
    move-result-object p1

    .line 23
    return-object p1
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
.end method

.method public final onDestroy()V
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x0

    .line 9
    .line 10
    .line 11
    const-string/jumbo v2, "onDestroy"

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    .line 15
    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 16
    .line 17
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/f;->e:Lcom/sumsub/sns/internal/core/presentation/android/y;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0}, Landroidx/lifecycle/Lifecycle;->removeObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 27
    const/4 v0, 0x0

    .line 28
    .line 29
    iput-object v0, p0, Lcom/sumsub/sns/core/presentation/form/f;->e:Lcom/sumsub/sns/internal/core/presentation/android/y;

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 33
    return-void
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

.method public final onDestroyView()V
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x0

    .line 9
    .line 10
    .line 11
    const-string/jumbo v2, "onDestroyView"

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    .line 15
    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->b()Landroidx/recyclerview/widget/RecyclerView;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object v1, p0, Lcom/sumsub/sns/core/presentation/form/f;->m:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->b()Landroidx/recyclerview/widget/RecyclerView;

    .line 36
    move-result-object v0

    .line 37
    const/4 v1, 0x0

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 43
    .line 44
    :cond_1
    iput-object v1, p0, Lcom/sumsub/sns/core/presentation/form/f;->d:Lcom/sumsub/sns/core/presentation/form/viewadapter/n;

    .line 45
    .line 46
    iput-object v1, p0, Lcom/sumsub/sns/core/presentation/form/f;->a:Lcom/sumsub/sns/internal/core/presentation/form/h;

    .line 47
    .line 48
    .line 49
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 50
    return-void
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/f;->f:Lcom/sumsub/sns/core/presentation/util/a;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/sumsub/sns/core/presentation/util/a;->a:Ljava/lang/String;

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    move-object v0, v1

    .line 12
    .line 13
    :cond_0
    const-string v2, "fragment_unique_id"

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/f;->e:Lcom/sumsub/sns/internal/core/presentation/android/y;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/android/y;->h:Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    const-string v2, "OBSERVER_ITEM_ID"

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->b()Landroidx/recyclerview/widget/RecyclerView;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    :cond_2
    const-string v0, "SCROLL_STATE"

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 51
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
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->b()Landroidx/recyclerview/widget/RecyclerView;

    .line 20
    move-result-object p1

    .line 21
    const/4 v0, 0x0

    .line 22
    .line 23
    if-eqz p1, :cond_6

    .line 24
    .line 25
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 33
    .line 34
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    .line 41
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 45
    .line 46
    new-instance v1, Lcom/sumsub/sns/core/presentation/form/viewadapter/n;

    .line 47
    .line 48
    iget-object v2, p0, Lcom/sumsub/sns/core/presentation/form/f;->l:Lcom/sumsub/sns/core/presentation/form/d;

    .line 49
    .line 50
    .line 51
    invoke-direct {v1, v2}, Lcom/sumsub/sns/core/presentation/form/viewadapter/n;-><init>(Lcom/sumsub/sns/core/presentation/form/d;)V

    .line 52
    .line 53
    iget-object v2, p0, Lcom/sumsub/sns/core/presentation/form/f;->n:Lcom/sumsub/sns/core/presentation/form/c;

    .line 54
    .line 55
    iput-object v0, v1, Lcom/sumsub/sns/core/presentation/form/viewadapter/n;->c:Lcom/sumsub/sns/core/presentation/form/viewadapter/e;

    .line 56
    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    new-instance v3, Lcom/sumsub/sns/core/presentation/form/viewadapter/e;

    .line 60
    .line 61
    .line 62
    invoke-direct {v3, v2}, Lcom/sumsub/sns/core/presentation/form/viewadapter/e;-><init>(Lcom/sumsub/sns/core/presentation/form/a;)V

    .line 63
    .line 64
    iput-object v3, v1, Lcom/sumsub/sns/core/presentation/form/viewadapter/n;->c:Lcom/sumsub/sns/core/presentation/form/viewadapter/e;

    .line 65
    .line 66
    :cond_1
    iput-object v1, p0, Lcom/sumsub/sns/core/presentation/form/f;->d:Lcom/sumsub/sns/core/presentation/form/viewadapter/n;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    const-wide/16 v2, 0x64

    .line 76
    .line 77
    if-eqz v1, :cond_2

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v2, v3}, Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;->setChangeDuration(J)V

    .line 81
    .line 82
    .line 83
    :cond_2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;

    .line 84
    move-result-object v1

    .line 85
    .line 86
    if-eqz v1, :cond_3

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v2, v3}, Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;->setAddDuration(J)V

    .line 90
    .line 91
    .line 92
    :cond_3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;

    .line 93
    move-result-object v1

    .line 94
    .line 95
    if-eqz v1, :cond_4

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v2, v3}, Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;->setRemoveDuration(J)V

    .line 99
    .line 100
    .line 101
    :cond_4
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;

    .line 102
    move-result-object p1

    .line 103
    .line 104
    if-eqz p1, :cond_5

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v2, v3}, Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;->setMoveDuration(J)V

    .line 108
    .line 109
    .line 110
    :cond_5
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->b()Landroidx/recyclerview/widget/RecyclerView;

    .line 111
    move-result-object p1

    .line 112
    .line 113
    if-eqz p1, :cond_6

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 117
    move-result-object p1

    .line 118
    .line 119
    if-eqz p1, :cond_6

    .line 120
    .line 121
    iget-object v1, p0, Lcom/sumsub/sns/core/presentation/form/f;->m:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 125
    .line 126
    :cond_6
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    .line 130
    move-result-object v3

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->a()Lcom/sumsub/sns/internal/core/presentation/form/k;

    .line 134
    move-result-object p1

    .line 135
    .line 136
    if-eqz p1, :cond_7

    .line 137
    .line 138
    .line 139
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/common/h;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 140
    move-result-object p1

    .line 141
    goto :goto_0

    .line 142
    :cond_7
    move-object p1, v0

    .line 143
    .line 144
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    const-string/jumbo v4, "onViewCreated: viewModel="

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    move-result-object v4

    .line 161
    const/4 v6, 0x4

    .line 162
    const/4 v7, 0x0

    .line 163
    const/4 v5, 0x0

    .line 164
    .line 165
    .line 166
    invoke-static/range {v2 .. v7}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/form/f;->a()Lcom/sumsub/sns/internal/core/presentation/form/k;

    .line 170
    move-result-object p1

    .line 171
    .line 172
    if-eqz p1, :cond_8

    .line 173
    .line 174
    .line 175
    invoke-interface {p1}, Lcom/sumsub/sns/internal/core/presentation/form/k;->d()Lkotlinx/coroutines/flow/w;

    .line 176
    move-result-object p1

    .line 177
    .line 178
    if-eqz p1, :cond_8

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 182
    move-result-object v1

    .line 183
    .line 184
    new-instance v2, Lcom/sumsub/sns/core/presentation/form/e;

    .line 185
    .line 186
    .line 187
    invoke-direct {v2, p0, p2, v0}, Lcom/sumsub/sns/core/presentation/form/e;-><init>(Lcom/sumsub/sns/core/presentation/form/f;Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)V

    .line 188
    .line 189
    .line 190
    invoke-static {p1, v1, v2}, Lcom/sumsub/sns/internal/core/common/U;->b(Lkotlinx/coroutines/flow/e;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 191
    :cond_8
    return-void
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
