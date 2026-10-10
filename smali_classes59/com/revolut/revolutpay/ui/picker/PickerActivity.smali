.class public final Lcom/revolut/revolutpay/ui/picker/PickerActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"

# interfaces
.implements Lcom/revolut/revolutpay/ui/picker/g;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0019\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008\u000b\u0010\u0004J\u001d\u0010\u000f\u001a\u00020\u00072\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'\u00a8\u0006)"
    }
    d2 = {
        "Lcom/revolut/revolutpay/ui/picker/PickerActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "Lcom/revolut/revolutpay/ui/picker/g;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "onStart",
        "onStop",
        "",
        "Lxa0/d;",
        "items",
        "a",
        "(Ljava/util/List;)V",
        "Lcom/revolut/revolutpay/ui/picker/model/a;",
        "countryInfo",
        "q",
        "(Lcom/revolut/revolutpay/ui/picker/model/a;)V",
        "Lcom/revolut/revolutpay/ui_kit/widget/SearchNavBar;",
        "i",
        "Lcom/revolut/revolutpay/ui_kit/widget/SearchNavBar;",
        "searchNavBar",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "j",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "Lcom/revolut/revolutpay/ui/picker/e;",
        "k",
        "Lcom/revolut/revolutpay/ui/picker/e;",
        "presenter",
        "Lcom/revolut/revolutpay/ui/picker/c;",
        "l",
        "Lcom/revolut/revolutpay/ui/picker/c;",
        "pickerAdapter",
        "Lcom/revolut/revolutpay/ui_kit/delegate/a;",
        "m",
        "Lcom/revolut/revolutpay/ui_kit/delegate/a;",
        "rowWidgetDelegate",
        "revolut_pay_sdk_2_0_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public i:Lcom/revolut/revolutpay/ui_kit/widget/SearchNavBar;

.field public j:Landroidx/recyclerview/widget/RecyclerView;

.field public k:Lcom/revolut/revolutpay/ui/picker/e;

.field public l:Lcom/revolut/revolutpay/ui/picker/c;

.field public final m:Lcom/revolut/revolutpay/ui_kit/delegate/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/revolut/revolutpay/ui_kit/delegate/a;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/revolut/revolutpay/ui_kit/delegate/a;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/revolut/revolutpay/ui/picker/PickerActivity;->m:Lcom/revolut/revolutpay/ui_kit/delegate/a;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static synthetic G(Lcom/revolut/revolutpay/ui/picker/PickerActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/revolut/revolutpay/ui/picker/PickerActivity;->I(Lcom/revolut/revolutpay/ui/picker/PickerActivity;Landroid/view/View;)V

    .line 4
    return-void
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
.end method

.method public static final synthetic H(Lcom/revolut/revolutpay/ui/picker/PickerActivity;)Lcom/revolut/revolutpay/ui/picker/e;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/revolut/revolutpay/ui/picker/PickerActivity;->k:Lcom/revolut/revolutpay/ui/picker/e;

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
.end method

.method public static final I(Lcom/revolut/revolutpay/ui/picker/PickerActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    const-string/jumbo p1, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 10
    return-void
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
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lxa0/d;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "items"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/revolut/revolutpay/ui/picker/PickerActivity;->l:Lcom/revolut/revolutpay/ui/picker/c;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    .line 12
    const-string/jumbo v0, "pickerAdapter"

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 16
    const/4 v0, 0x0

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    sget p1, Lcom/revolut/revolutpay/R$layout;->internal_activity_picker:I

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setContentView(I)V

    .line 9
    .line 10
    sget-object p1, Lcom/revolut/revolutpay/di/a;->a:Lcom/revolut/revolutpay/di/a;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/revolut/revolutpay/di/a;->e()Lcom/revolut/revolutpay/ui/picker/e;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    iput-object p1, p0, Lcom/revolut/revolutpay/ui/picker/PickerActivity;->k:Lcom/revolut/revolutpay/ui/picker/e;

    .line 17
    .line 18
    sget p1, Lcom/revolut/revolutpay/R$id;->internal_picker_searchNavBar:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    const-string v0, "findViewById(R.id.internal_picker_searchNavBar)"

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    check-cast p1, Lcom/revolut/revolutpay/ui_kit/widget/SearchNavBar;

    .line 30
    .line 31
    iput-object p1, p0, Lcom/revolut/revolutpay/ui/picker/PickerActivity;->i:Lcom/revolut/revolutpay/ui_kit/widget/SearchNavBar;

    .line 32
    .line 33
    sget p1, Lcom/revolut/revolutpay/R$id;->internal_picker_recyclerView:I

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    const-string v0, "findViewById(R.id.internal_picker_recyclerView)"

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 45
    .line 46
    iput-object p1, p0, Lcom/revolut/revolutpay/ui/picker/PickerActivity;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 47
    .line 48
    iget-object p1, p0, Lcom/revolut/revolutpay/ui/picker/PickerActivity;->i:Lcom/revolut/revolutpay/ui_kit/widget/SearchNavBar;

    .line 49
    .line 50
    .line 51
    const-string/jumbo v0, "searchNavBar"

    .line 52
    const/4 v1, 0x0

    .line 53
    .line 54
    if-nez p1, :cond_0

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 58
    move-object p1, v1

    .line 59
    .line 60
    :cond_0
    new-instance v2, Lcom/revolut/revolutpay/ui/picker/a;

    .line 61
    .line 62
    .line 63
    invoke-direct {v2, p0}, Lcom/revolut/revolutpay/ui/picker/a;-><init>(Lcom/revolut/revolutpay/ui/picker/PickerActivity;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v2}, Lcom/revolut/revolutpay/ui_kit/widget/SearchNavBar;->setOnNavigationClick(Landroid/view/View$OnClickListener;)V

    .line 67
    .line 68
    iget-object p1, p0, Lcom/revolut/revolutpay/ui/picker/PickerActivity;->i:Lcom/revolut/revolutpay/ui_kit/widget/SearchNavBar;

    .line 69
    .line 70
    if-nez p1, :cond_1

    .line 71
    .line 72
    .line 73
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 74
    move-object p1, v1

    .line 75
    .line 76
    :cond_1
    new-instance v0, Lcom/revolut/revolutpay/ui/picker/PickerActivity$a;

    .line 77
    .line 78
    .line 79
    invoke-direct {v0, p0}, Lcom/revolut/revolutpay/ui/picker/PickerActivity$a;-><init>(Lcom/revolut/revolutpay/ui/picker/PickerActivity;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v0}, Lcom/revolut/revolutpay/ui_kit/widget/SearchNavBar;->setSearchInputListener(Lkotlin/jvm/functions/Function1;)V

    .line 83
    .line 84
    iget-object p1, p0, Lcom/revolut/revolutpay/ui/picker/PickerActivity;->m:Lcom/revolut/revolutpay/ui_kit/delegate/a;

    .line 85
    .line 86
    new-instance v0, Lcom/revolut/revolutpay/ui/picker/PickerActivity$b;

    .line 87
    .line 88
    .line 89
    invoke-direct {v0, p0}, Lcom/revolut/revolutpay/ui/picker/PickerActivity$b;-><init>(Lcom/revolut/revolutpay/ui/picker/PickerActivity;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v0}, Lcom/revolut/revolutpay/ui_kit/delegate/a;->e(Lkotlin/jvm/functions/Function1;)V

    .line 93
    .line 94
    new-instance p1, Lcom/revolut/revolutpay/ui/picker/c;

    .line 95
    .line 96
    iget-object v0, p0, Lcom/revolut/revolutpay/ui/picker/PickerActivity;->m:Lcom/revolut/revolutpay/ui_kit/delegate/a;

    .line 97
    .line 98
    .line 99
    invoke-direct {p1, v0}, Lcom/revolut/revolutpay/ui/picker/c;-><init>(Lcom/revolut/revolutpay/ui_kit/delegate/a;)V

    .line 100
    .line 101
    iput-object p1, p0, Lcom/revolut/revolutpay/ui/picker/PickerActivity;->l:Lcom/revolut/revolutpay/ui/picker/c;

    .line 102
    .line 103
    iget-object p1, p0, Lcom/revolut/revolutpay/ui/picker/PickerActivity;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 104
    .line 105
    .line 106
    const-string/jumbo v0, "recyclerView"

    .line 107
    .line 108
    if-nez p1, :cond_2

    .line 109
    .line 110
    .line 111
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 112
    move-object p1, v1

    .line 113
    .line 114
    :cond_2
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 115
    .line 116
    .line 117
    invoke-direct {v2, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 121
    .line 122
    iget-object p1, p0, Lcom/revolut/revolutpay/ui/picker/PickerActivity;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 123
    .line 124
    if-nez p1, :cond_3

    .line 125
    .line 126
    .line 127
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 128
    move-object p1, v1

    .line 129
    .line 130
    :cond_3
    iget-object v0, p0, Lcom/revolut/revolutpay/ui/picker/PickerActivity;->l:Lcom/revolut/revolutpay/ui/picker/c;

    .line 131
    .line 132
    if-nez v0, :cond_4

    .line 133
    .line 134
    .line 135
    const-string/jumbo v0, "pickerAdapter"

    .line 136
    .line 137
    .line 138
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 139
    goto :goto_0

    .line 140
    :cond_4
    move-object v1, v0

    .line 141
    .line 142
    .line 143
    :goto_0
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 144
    return-void
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
.end method

.method public onStart()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStart()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/revolut/revolutpay/ui/picker/PickerActivity;->k:Lcom/revolut/revolutpay/ui/picker/e;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    .line 10
    const-string/jumbo v0, "presenter"

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 14
    const/4 v0, 0x0

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-interface {v0, p0}, Lsa0/b;->a(Lsa0/c;)V

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

.method public onStop()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStop()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/revolut/revolutpay/ui/picker/PickerActivity;->k:Lcom/revolut/revolutpay/ui/picker/e;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    .line 10
    const-string/jumbo v0, "presenter"

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 14
    const/4 v0, 0x0

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-interface {v0}, Lsa0/b;->c()V

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

.method public q(Lcom/revolut/revolutpay/ui/picker/model/a;)V
    .locals 2
    .param p1    # Lcom/revolut/revolutpay/ui/picker/model/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "countryInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/revolut/revolutpay/ui/picker/h;->a:Lcom/revolut/revolutpay/ui/picker/h;

    .line 8
    .line 9
    new-instance v1, Lcom/revolut/revolutpay/ui/picker/d$a;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, p1}, Lcom/revolut/revolutpay/ui/picker/d$a;-><init>(Lcom/revolut/revolutpay/ui/picker/model/a;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/revolut/revolutpay/ui/picker/h;->b(Lcom/revolut/revolutpay/ui/picker/d$a;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
