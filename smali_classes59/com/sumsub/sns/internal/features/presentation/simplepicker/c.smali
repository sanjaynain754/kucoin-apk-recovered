.class public final Lcom/sumsub/sns/internal/features/presentation/simplepicker/c;
.super Lcom/sumsub/sns/internal/features/presentation/common/c;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/simplepicker/c;",
        "Lcom/sumsub/sns/internal/features/presentation/common/c;",
        "<init>",
        "()V",
        "com/sumsub/sns/internal/features/presentation/simplepicker/a",
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
        "SMAP\nSNSSimpleBottomSheetPicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSSimpleBottomSheetPicker.kt\ncom/sumsub/sns/internal/features/presentation/simplepicker/SNSSimpleBottomSheetPicker\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,99:1\n4135#2,11:100\n49#3:111\n65#3,16:112\n93#3,3:128\n*S KotlinDebug\n*F\n+ 1 SNSSimpleBottomSheetPicker.kt\ncom/sumsub/sns/internal/features/presentation/simplepicker/SNSSimpleBottomSheetPicker\n*L\n21#1:100,11\n52#1:111\n52#1:112,16\n52#1:128,3\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic U:I


# instance fields
.field public b:Lcom/sumsub/sns/internal/features/presentation/simplepicker/a;

.field public c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/internal/features/presentation/common/c;-><init>()V

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
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/simplepicker/c;Lcom/sumsub/sns/internal/features/presentation/simplepicker/h;)Lkotlin/Unit;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/simplepicker/c;->b:Lcom/sumsub/sns/internal/features/presentation/simplepicker/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/simplepicker/a;->a(Lcom/sumsub/sns/internal/features/presentation/simplepicker/h;)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;->dismiss()V

    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/simplepicker/c;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;->dismiss()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/DialogFragment;->onCancel(Landroid/content/DialogInterface;)V

    .line 4
    .line 5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/simplepicker/c;->c:Lkotlin/jvm/functions/Function0;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 11
    :cond_0
    return-void
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

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/simplepicker/c;->b:Lcom/sumsub/sns/internal/features/presentation/simplepicker/a;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;->dismiss()V

    .line 13
    :cond_0
    return-void
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

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/DialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    .line 4
    .line 5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/simplepicker/c;->c:Lkotlin/jvm/functions/Function0;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 11
    :cond_0
    return-void
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

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 4
    .line 5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/common/c;->a:Lcom/sumsub/sns/databinding/C;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    return-void

    .line 9
    .line 10
    :cond_0
    iget-object p2, p1, Lcom/sumsub/sns/databinding/C;->e:Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sget-object v1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    sget-object v2, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->CLOSE:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    .line 29
    invoke-interface {v1, v0, v2}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    sget v2, Lcom/sumsub/sns/R$drawable;->sns_ic_close:I

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-static {v1, v2, v0}, Landroidx/core/content/res/ResourcesCompat;->getDrawable(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-virtual {p2, v1}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setCloseButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 50
    .line 51
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/simplepicker/j;

    .line 52
    .line 53
    .line 54
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/simplepicker/j;-><init>(Lcom/sumsub/sns/internal/features/presentation/simplepicker/c;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2, v0}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setOnCloseButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 58
    .line 59
    iget-object p2, p1, Lcom/sumsub/sns/databinding/C;->c:Lcom/sumsub/sns/core/widget/SNSTextInputLayout;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p2}, Lcom/sumsub/sns/internal/features/presentation/common/c;->a(Lcom/sumsub/sns/core/widget/SNSTextInputLayout;)V

    .line 63
    .line 64
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/simplepicker/e;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireArguments()Landroid/os/Bundle;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    const-string v2, "extra_items"

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    .line 74
    move-result-object v1

    .line 75
    const/4 v2, 0x0

    .line 76
    .line 77
    if-eqz v1, :cond_3

    .line 78
    .line 79
    new-instance v3, Ljava/util/ArrayList;

    .line 80
    .line 81
    .line 82
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 83
    array-length v4, v1

    .line 84
    move v5, v2

    .line 85
    .line 86
    :goto_0
    if-ge v5, v4, :cond_4

    .line 87
    .line 88
    aget-object v6, v1, v5

    .line 89
    .line 90
    instance-of v7, v6, Lcom/sumsub/sns/internal/features/presentation/simplepicker/h;

    .line 91
    .line 92
    if-eqz v7, :cond_2

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 98
    goto :goto_0

    .line 99
    .line 100
    .line 101
    :cond_3
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 102
    move-result-object v3

    .line 103
    .line 104
    :cond_4
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/simplepicker/k;

    .line 105
    .line 106
    .line 107
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/simplepicker/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/simplepicker/c;)V

    .line 108
    .line 109
    .line 110
    invoke-direct {v0, v3, v1}, Lcom/sumsub/sns/internal/features/presentation/simplepicker/e;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p2}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    .line 114
    move-result-object v1

    .line 115
    .line 116
    if-eqz v1, :cond_5

    .line 117
    .line 118
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/simplepicker/b;

    .line 119
    .line 120
    .line 121
    invoke-direct {v3, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/simplepicker/b;-><init>(Lcom/sumsub/sns/internal/features/presentation/simplepicker/e;Lcom/sumsub/sns/core/widget/SNSTextInputLayout;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 125
    .line 126
    :cond_5
    iget-object p2, p1, Lcom/sumsub/sns/databinding/C;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 127
    .line 128
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 132
    move-result-object v3

    .line 133
    const/4 v4, 0x1

    .line 134
    .line 135
    .line 136
    invoke-direct {v1, v3, v4, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p2, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 140
    .line 141
    .line 142
    invoke-static {p2}, Lcom/sumsub/sns/internal/features/presentation/common/c;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 146
    .line 147
    iget-object p1, p1, Lcom/sumsub/sns/databinding/C;->b:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 148
    .line 149
    const/16 p2, 0x8

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 153
    return-void
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
