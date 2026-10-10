.class public final Lcom/sumsub/sns/internal/features/presentation/country/picker/d;
.super Landroidx/recyclerview/widget/ListAdapter;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Landroid/widget/Filterable;


# instance fields
.field public final a:Z

.field public final b:Ljava/text/Collator;

.field public final c:Lcom/sumsub/sns/internal/features/presentation/country/picker/b;

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/Set;

.field public f:Ljava/util/Set;

.field public final g:Lkotlinx/coroutines/flow/n;

.field public final h:Lkotlinx/coroutines/flow/n;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/Set;ZZ)V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/country/picker/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/country/picker/a;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/ListAdapter;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V

    .line 9
    .line 10
    iput-boolean p4, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/d;->a:Z

    .line 11
    .line 12
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->e:Ljava/util/Locale;

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Ljava/text/Collator;->getInstance(Ljava/util/Locale;)Ljava/text/Collator;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/d;->b:Ljava/text/Collator;

    .line 19
    .line 20
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/country/picker/d0;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/country/picker/d0;-><init>(Lcom/sumsub/sns/internal/features/presentation/country/picker/d;)V

    .line 24
    .line 25
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/country/picker/b;

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/country/picker/b;-><init>(Lcom/sumsub/sns/internal/features/presentation/country/picker/d;)V

    .line 29
    .line 30
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/d;->c:Lcom/sumsub/sns/internal/features/presentation/country/picker/b;

    .line 31
    .line 32
    if-eqz p3, :cond_0

    .line 33
    .line 34
    .line 35
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    :cond_0
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/d;->d:Ljava/util/List;

    .line 39
    .line 40
    if-eqz p4, :cond_1

    .line 41
    move-object p3, p2

    .line 42
    goto :goto_0

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    .line 46
    move-result-object p3

    .line 47
    .line 48
    :goto_0
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/d;->e:Ljava/util/Set;

    .line 49
    .line 50
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/d;->f:Ljava/util/Set;

    .line 51
    .line 52
    .line 53
    invoke-static {p2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 54
    move-result-object p2

    .line 55
    .line 56
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/d;->g:Lkotlinx/coroutines/flow/n;

    .line 57
    .line 58
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/d;->h:Lkotlinx/coroutines/flow/n;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/country/picker/d;->a(Ljava/util/List;)Ljava/util/List;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    .line 66
    return-void
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/country/picker/d;Lcom/sumsub/sns/internal/features/presentation/country/b;Lcom/sumsub/sns/internal/features/presentation/country/b;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/d;->b:Ljava/text/Collator;

    .line 2
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/country/b;->b:Ljava/lang/String;

    iget-object p2, p2, Lcom/sumsub/sns/internal/features/presentation/country/b;->b:Ljava/lang/String;

    .line 3
    invoke-virtual {p0, p1, p2}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/util/List;
    .locals 5

    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/d;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    .line 5
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 8
    move-object v3, v2

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 9
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/d;->e:Ljava/util/Set;

    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 11
    :cond_1
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 12
    :cond_2
    new-instance p1, Lkotlin/Pair;

    invoke-direct {p1, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 14
    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final getFilter()Landroid/widget/Filter;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/d;->c:Lcom/sumsub/sns/internal/features/presentation/country/picker/b;

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
.end method

.method public final onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/country/picker/F;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    check-cast p2, Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/d;->f:Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p2, v0}, Lcom/sumsub/sns/internal/features/presentation/country/picker/F;->a(Lcom/sumsub/sns/internal/features/presentation/country/b;Z)V

    .line 18
    return-void
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
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 5

    .line 1
    .line 2
    sget p2, Lcom/sumsub/sns/internal/features/presentation/country/picker/F;->g:I

    .line 3
    .line 4
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/country/picker/c;

    .line 5
    .line 6
    .line 7
    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/features/presentation/country/picker/c;-><init>(Lcom/sumsub/sns/internal/features/presentation/country/picker/d;)V

    .line 8
    .line 9
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/d;->a:Z

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    sget v2, Lcom/sumsub/sns/R$layout;->sns_countries_list_multiselect_item:I

    .line 20
    const/4 v3, 0x0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    const v1, 0x1020006

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    check-cast v2, Lcom/sumsub/sns/core/widget/SNSFlagView;

    .line 34
    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    sget v1, Lcom/sumsub/sns/R$id;->sns_checkbox:I

    .line 38
    .line 39
    .line 40
    invoke-static {p1, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 41
    move-result-object v3

    .line 42
    .line 43
    check-cast v3, Lcom/sumsub/sns/core/widget/SNSCheckBox;

    .line 44
    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    .line 48
    const v1, 0x1020014

    .line 49
    .line 50
    .line 51
    invoke-static {p1, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 52
    move-result-object v4

    .line 53
    .line 54
    check-cast v4, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 55
    .line 56
    if-eqz v4, :cond_0

    .line 57
    .line 58
    new-instance v1, Lcom/sumsub/sns/databinding/a;

    .line 59
    .line 60
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 61
    .line 62
    .line 63
    invoke-direct {v1, p1, v2, v3, v4}, Lcom/sumsub/sns/databinding/a;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/sumsub/sns/core/widget/SNSFlagView;Lcom/sumsub/sns/core/widget/SNSCheckBox;Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;)V

    .line 64
    .line 65
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/country/picker/F;

    .line 66
    .line 67
    .line 68
    invoke-direct {p1, v1, p2, v0}, Lcom/sumsub/sns/internal/features/presentation/country/picker/F;-><init>(Lcom/sumsub/sns/databinding/a;Lcom/sumsub/sns/internal/features/presentation/country/picker/c;Z)V

    .line 69
    return-object p1

    .line 70
    .line 71
    .line 72
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 77
    move-result-object p1

    .line 78
    .line 79
    new-instance p2, Ljava/lang/NullPointerException;

    .line 80
    .line 81
    const-string v0, "Missing required view with ID: "

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    .line 88
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 89
    throw p2
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
