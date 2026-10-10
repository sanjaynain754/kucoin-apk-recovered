.class public final Lcom/sumsub/sns/internal/features/presentation/country/picker/b;
.super Landroid/widget/Filter;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/features/presentation/country/picker/d;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/country/picker/d;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/b;->a:Lcom/sumsub/sns/internal/features/presentation/country/picker/d;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Landroid/widget/Filter;-><init>()V

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
.end method


# virtual methods
.method public final performFiltering(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;
    .locals 5

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    .line 10
    :goto_0
    if-eqz p1, :cond_3

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 14
    move-result v0

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    goto :goto_2

    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/b;->a:Lcom/sumsub/sns/internal/features/presentation/country/picker/d;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/country/picker/d;->d:Ljava/util/List;

    .line 22
    .line 23
    new-instance v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    move-result v2

    .line 35
    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    move-result-object v2

    .line 41
    move-object v3, v2

    .line 42
    .line 43
    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 44
    .line 45
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/country/b;->b:Ljava/lang/String;

    .line 46
    const/4 v4, 0x1

    .line 47
    .line 48
    .line 49
    invoke-static {v3, p1, v4}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 50
    move-result v3

    .line 51
    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    .line 55
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 56
    goto :goto_1

    .line 57
    .line 58
    :cond_3
    :goto_2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/b;->a:Lcom/sumsub/sns/internal/features/presentation/country/picker/d;

    .line 59
    .line 60
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/country/picker/d;->d:Ljava/util/List;

    .line 61
    .line 62
    :cond_4
    new-instance p1, Landroid/widget/Filter$FilterResults;

    .line 63
    .line 64
    .line 65
    invoke-direct {p1}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 66
    .line 67
    iput-object v1, p1, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 71
    move-result v0

    .line 72
    .line 73
    iput v0, p1, Landroid/widget/Filter$FilterResults;->count:I

    .line 74
    return-object p1
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public final publishResults(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V
    .locals 1

    .line 1
    const/4 p1, 0x0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p2, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move-object p2, p1

    .line 8
    .line 9
    :goto_0
    instance-of v0, p2, Ljava/util/List;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    move-object p1, p2

    .line 13
    .line 14
    check-cast p1, Ljava/util/List;

    .line 15
    .line 16
    :cond_1
    if-nez p1, :cond_2

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    :cond_2
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/b;->a:Lcom/sumsub/sns/internal/features/presentation/country/picker/d;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2, p1}, Lcom/sumsub/sns/internal/features/presentation/country/picker/d;->a(Ljava/util/List;)Ljava/util/List;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    .line 30
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method
