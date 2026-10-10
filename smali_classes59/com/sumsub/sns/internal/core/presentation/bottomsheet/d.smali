.class public final Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;
.super Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;",
        "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;",
        "<init>",
        "()V",
        "com/sumsub/sns/internal/core/presentation/bottomsheet/e",
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


# instance fields
.field public a:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;-><init>()V

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

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;Landroid/content/DialogInterface;)V
    .locals 3

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;->a:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/e;

    .line 3
    .line 4
    if-eqz p0, :cond_3

    .line 5
    .line 6
    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetDialog;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/google/android/material/bottomsheet/BottomSheetDialog;->getBehavior()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setShouldRemoveExpandedCorners(Z)V

    .line 15
    .line 16
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/e;->a:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v0}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->a(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->a(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V

    .line 23
    .line 24
    sget v0, Lcom/google/android/material/R$id;->design_bottom_sheet:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    check-cast p1, Landroid/widget/FrameLayout;

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/e;->a:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->a(Landroid/widget/FrameLayout;)V

    .line 38
    .line 39
    :cond_0
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/e;->a:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->o()Lcom/sumsub/sns/internal/core/presentation/bottomsheet/c;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/b;

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/b;

    .line 56
    .line 57
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/b;->a:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 58
    .line 59
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    .line 63
    move-result-object p0

    .line 64
    .line 65
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/analytics/f;->b:Ljava/lang/String;

    .line 66
    const/4 v1, 0x0

    .line 67
    .line 68
    const/16 v2, 0xc

    .line 69
    .line 70
    .line 71
    invoke-static {v0, p1, p0, v1, v2}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;I)V

    .line 72
    return-void

    .line 73
    .line 74
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/a;

    .line 75
    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    .line 82
    move-result-object p0

    .line 83
    .line 84
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/a;

    .line 85
    .line 86
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/a;->a:Lcom/sumsub/sns/internal/core/analytics/Popup;

    .line 87
    .line 88
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/analytics/f;->a:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 89
    .line 90
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/analytics/f;->b:Ljava/lang/String;

    .line 91
    .line 92
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/analytics/f;->c:Ljava/util/Map;

    .line 93
    .line 94
    .line 95
    invoke-static {v0, v1, p0, p1}, Lcom/sumsub/sns/internal/core/analytics/f;->b(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;)V

    .line 96
    return-void

    .line 97
    .line 98
    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 99
    .line 100
    .line 101
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 102
    throw p0

    .line 103
    :cond_3
    return-void
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


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/DialogFragment;->onCancel(Landroid/content/DialogInterface;)V

    .line 4
    .line 5
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;->a:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/e;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/e;->a:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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

.method public final onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/j;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/j;-><init>(Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 13
    return-object p1
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

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    .line 2
    iget-object p3, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;->a:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/e;

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    iget-object p3, p3, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/e;->a:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p3, p1, p2}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return-object p1
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

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/DialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    .line 4
    .line 5
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;->a:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/e;

    .line 6
    .line 7
    if-eqz p1, :cond_2

    .line 8
    .line 9
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/e;->a:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->o()Lcom/sumsub/sns/internal/core/presentation/bottomsheet/c;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    instance-of v1, v0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/b;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v1, p1, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/b;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/b;->a:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 28
    .line 29
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/analytics/f;->b:Ljava/lang/String;

    .line 36
    const/4 v2, 0x0

    .line 37
    .line 38
    const/16 v3, 0xc

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v0, p1, v2, v3}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/LinkedHashMap;I)V

    .line 42
    return-void

    .line 43
    .line 44
    :cond_0
    instance-of v1, v0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/a;

    .line 45
    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/a;

    .line 55
    .line 56
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/a;->a:Lcom/sumsub/sns/internal/core/analytics/Popup;

    .line 57
    .line 58
    iget-object v1, p1, Lcom/sumsub/sns/internal/core/analytics/f;->a:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 59
    .line 60
    iget-object v2, p1, Lcom/sumsub/sns/internal/core/analytics/f;->b:Ljava/lang/String;

    .line 61
    .line 62
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/analytics/f;->c:Ljava/util/Map;

    .line 63
    .line 64
    .line 65
    invoke-static {v1, v2, p1, v0}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;)V

    .line 66
    return-void

    .line 67
    .line 68
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 69
    .line 70
    .line 71
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 72
    throw p1

    .line 73
    :cond_2
    return-void
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method
