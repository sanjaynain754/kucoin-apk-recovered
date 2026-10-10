.class public final Lta/a0;
.super Ljava/lang/Object;
.source "AssetDialogEvmRepeatChainBinding.java"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final a:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final b:Lcom/kubi/resources/widget/button/KcPrimaryButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final c:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final d:Lcom/kubi/resources/widget/button/KcSecondaryButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final e:Ljy/a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final f:Ljy/c;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final g:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final h:Lcom/kubi/resources/widget/BaseTextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final i:Lcom/kubi/resources/widget/BaseTextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/widget/LinearLayout;Lcom/kubi/resources/widget/button/KcPrimaryButton;Landroid/widget/LinearLayout;Lcom/kubi/resources/widget/button/KcSecondaryButton;Ljy/a;Ljy/c;Landroidx/recyclerview/widget/RecyclerView;Lcom/kubi/resources/widget/BaseTextView;Lcom/kubi/resources/widget/BaseTextView;)V
    .locals 0
    .param p1    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/resources/widget/button/KcPrimaryButton;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/kubi/resources/widget/button/KcSecondaryButton;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Ljy/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Ljy/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # Lcom/kubi/resources/widget/BaseTextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p9    # Lcom/kubi/resources/widget/BaseTextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lta/a0;->a:Landroid/widget/LinearLayout;

    .line 6
    .line 7
    iput-object p2, p0, Lta/a0;->b:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 8
    .line 9
    iput-object p3, p0, Lta/a0;->c:Landroid/widget/LinearLayout;

    .line 10
    .line 11
    iput-object p4, p0, Lta/a0;->d:Lcom/kubi/resources/widget/button/KcSecondaryButton;

    .line 12
    .line 13
    iput-object p5, p0, Lta/a0;->e:Ljy/a;

    .line 14
    .line 15
    iput-object p6, p0, Lta/a0;->f:Ljy/c;

    .line 16
    .line 17
    iput-object p7, p0, Lta/a0;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    iput-object p8, p0, Lta/a0;->h:Lcom/kubi/resources/widget/BaseTextView;

    .line 20
    .line 21
    iput-object p9, p0, Lta/a0;->i:Lcom/kubi/resources/widget/BaseTextView;

    .line 22
    return-void
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
.end method

.method public static a(Landroid/view/View;)Lta/a0;
    .locals 12
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    sget v0, Lcom/kubi/assets/R$id;->btnKeep:I

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 6
    move-result-object v1

    .line 7
    move-object v4, v1

    .line 8
    .line 9
    check-cast v4, Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    sget v0, Lcom/kubi/assets/R$id;->btnLayout:I

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 17
    move-result-object v1

    .line 18
    move-object v5, v1

    .line 19
    .line 20
    check-cast v5, Landroid/widget/LinearLayout;

    .line 21
    .line 22
    if-eqz v5, :cond_0

    .line 23
    .line 24
    sget v0, Lcom/kubi/assets/R$id;->btnRemoveDuplicate:I

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 28
    move-result-object v1

    .line 29
    move-object v6, v1

    .line 30
    .line 31
    check-cast v6, Lcom/kubi/resources/widget/button/KcSecondaryButton;

    .line 32
    .line 33
    if-eqz v6, :cond_0

    .line 34
    .line 35
    sget v0, Lcom/kubi/assets/R$id;->failedView:I

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    .line 44
    invoke-static {v1}, Ljy/a;->a(Landroid/view/View;)Ljy/a;

    .line 45
    move-result-object v7

    .line 46
    .line 47
    sget v0, Lcom/kubi/assets/R$id;->loadingView:I

    .line 48
    .line 49
    .line 50
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    if-eqz v1, :cond_0

    .line 54
    .line 55
    .line 56
    invoke-static {v1}, Ljy/c;->a(Landroid/view/View;)Ljy/c;

    .line 57
    move-result-object v8

    .line 58
    .line 59
    sget v0, Lcom/kubi/assets/R$id;->recyclerView:I

    .line 60
    .line 61
    .line 62
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 63
    move-result-object v1

    .line 64
    move-object v9, v1

    .line 65
    .line 66
    check-cast v9, Landroidx/recyclerview/widget/RecyclerView;

    .line 67
    .line 68
    if-eqz v9, :cond_0

    .line 69
    .line 70
    sget v0, Lcom/kubi/assets/R$id;->tvSubtitle:I

    .line 71
    .line 72
    .line 73
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 74
    move-result-object v1

    .line 75
    move-object v10, v1

    .line 76
    .line 77
    check-cast v10, Lcom/kubi/resources/widget/BaseTextView;

    .line 78
    .line 79
    if-eqz v10, :cond_0

    .line 80
    .line 81
    sget v0, Lcom/kubi/assets/R$id;->tvTitle:I

    .line 82
    .line 83
    .line 84
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 85
    move-result-object v1

    .line 86
    move-object v11, v1

    .line 87
    .line 88
    check-cast v11, Lcom/kubi/resources/widget/BaseTextView;

    .line 89
    .line 90
    if-eqz v11, :cond_0

    .line 91
    .line 92
    new-instance v2, Lta/a0;

    .line 93
    move-object v3, p0

    .line 94
    .line 95
    check-cast v3, Landroid/widget/LinearLayout;

    .line 96
    .line 97
    .line 98
    invoke-direct/range {v2 .. v11}, Lta/a0;-><init>(Landroid/widget/LinearLayout;Lcom/kubi/resources/widget/button/KcPrimaryButton;Landroid/widget/LinearLayout;Lcom/kubi/resources/widget/button/KcSecondaryButton;Ljy/a;Ljy/c;Landroidx/recyclerview/widget/RecyclerView;Lcom/kubi/resources/widget/BaseTextView;Lcom/kubi/resources/widget/BaseTextView;)V

    .line 99
    return-object v2

    .line 100
    .line 101
    .line 102
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 103
    move-result-object p0

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 107
    move-result-object p0

    .line 108
    .line 109
    new-instance v0, Ljava/lang/NullPointerException;

    .line 110
    .line 111
    const-string v1, "Missing required view with ID: "

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    move-result-object p0

    .line 116
    .line 117
    .line 118
    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 119
    throw v0
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
.end method


# virtual methods
.method public b()Landroid/widget/LinearLayout;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lta/a0;->a:Landroid/widget/LinearLayout;

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
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lta/a0;->b()Landroid/widget/LinearLayout;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method
