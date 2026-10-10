.class public final Lcom/kubi/futures/share/ModifyDisplayShareDialog;
.super Lcom/kubi/resources/dialog/DialogFragmentHelper;
.source "ModifyDisplayShareDialog.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/futures/share/ModifyDisplayShareDialog$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0008\u0010\u001b\u001a\u00020\u0019H\u0016J\u0008\u0010\u001c\u001a\u00020\u0019H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/kubi/futures/share/ModifyDisplayShareDialog;",
        "Lcom/kubi/resources/dialog/DialogFragmentHelper;",
        "<init>",
        "()V",
        "params",
        "Lcom/kubi/futures/share/BasePositionShare$ShareParam;",
        "getParams",
        "()Lcom/kubi/futures/share/BasePositionShare$ShareParam;",
        "params$delegate",
        "Lkotlin/Lazy;",
        "binding",
        "Lcom/kubi/kumex/databinding/BkumexDialogSelectShareDisplayInfoBinding;",
        "getBinding",
        "()Lcom/kubi/kumex/databinding/BkumexDialogSelectShareDisplayInfoBinding;",
        "binding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "onCreateView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onViewCreated",
        "",
        "view",
        "dismissAllowingStateLoss",
        "onStart",
        "Companion",
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
        "SMAP\nModifyDisplayShareDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifyDisplayShareDialog.kt\ncom/kubi/futures/share/ModifyDisplayShareDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,159:1\n143#2,20:160\n*S KotlinDebug\n*F\n+ 1 ModifyDisplayShareDialog.kt\ncom/kubi/futures/share/ModifyDisplayShareDialog\n*L\n55#1:160,20\n*E\n"
    }
.end annotation


# static fields
.field public static final s0:Lcom/kubi/futures/share/ModifyDisplayShareDialog$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic t0:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final u0:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final q0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final r0:Lcom/kubi/sdk/viewbindingdelegate/base/a;
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
    const-string v1, "getBinding()Lcom/kubi/kumex/databinding/BkumexDialogSelectShareDisplayInfoBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/futures/share/ModifyDisplayShareDialog;

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
    sput-object v1, Lcom/kubi/futures/share/ModifyDisplayShareDialog;->t0:[Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/futures/share/ModifyDisplayShareDialog$Companion;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/kubi/futures/share/ModifyDisplayShareDialog$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    sput-object v0, Lcom/kubi/futures/share/ModifyDisplayShareDialog;->s0:Lcom/kubi/futures/share/ModifyDisplayShareDialog$Companion;

    .line 32
    .line 33
    const-string v0, "ModifyDisplayShareDialog"

    .line 34
    .line 35
    sput-object v0, Lcom/kubi/futures/share/ModifyDisplayShareDialog;->u0:Ljava/lang/String;

    .line 36
    return-void
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
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lgi/c;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lgi/c;-><init>(Lcom/kubi/futures/share/ModifyDisplayShareDialog;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/futures/share/ModifyDisplayShareDialog;->q0:Lkotlin/Lazy;

    .line 15
    .line 16
    sget-object v0, Lcom/kubi/futures/share/ModifyDisplayShareDialog$special$$inlined$viewBindingFragment$default$1;->INSTANCE:Lcom/kubi/futures/share/ModifyDisplayShareDialog$special$$inlined$viewBindingFragment$default$1;

    .line 17
    .line 18
    new-instance v1, Lcom/kubi/futures/share/ModifyDisplayShareDialog$special$$inlined$viewBindingFragment$default$2;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1}, Lcom/kubi/futures/share/ModifyDisplayShareDialog$special$$inlined$viewBindingFragment$default$2;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    iput-object v0, p0, Lcom/kubi/futures/share/ModifyDisplayShareDialog;->r0:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static synthetic j4(Ldm/c1;Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/futures/share/ModifyDisplayShareDialog;->v4(Ldm/c1;Landroid/widget/CompoundButton;Z)V

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
.end method

.method public static synthetic k4(Lcom/kubi/futures/share/ModifyDisplayShareDialog;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/share/ModifyDisplayShareDialog;->x4(Lcom/kubi/futures/share/ModifyDisplayShareDialog;Landroid/view/View;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 57
.end method

.method public static synthetic l4(Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/share/ModifyDisplayShareDialog;->t4(Landroid/view/View;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic m4(Ldm/c1;Lcom/kubi/futures/share/ModifyDisplayShareDialog;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/futures/share/ModifyDisplayShareDialog;->u4(Ldm/c1;Lcom/kubi/futures/share/ModifyDisplayShareDialog;Landroid/view/View;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic n4(Ldm/c1;Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/futures/share/ModifyDisplayShareDialog;->w4(Ldm/c1;Landroid/widget/CompoundButton;Z)V

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
.end method

.method public static synthetic o4(Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/share/ModifyDisplayShareDialog;->y4(Landroid/view/View;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic p4(Lcom/kubi/futures/share/ModifyDisplayShareDialog;)Lcom/kubi/futures/share/BasePositionShare$ShareParam;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/share/ModifyDisplayShareDialog;->z4(Lcom/kubi/futures/share/ModifyDisplayShareDialog;)Lcom/kubi/futures/share/BasePositionShare$ShareParam;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final synthetic q4()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/futures/share/ModifyDisplayShareDialog;->u0:Ljava/lang/String;

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
.end method

.method public static final t4(Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p0
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

.method public static final u4(Ldm/c1;Lcom/kubi/futures/share/ModifyDisplayShareDialog;Landroid/view/View;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object p2, Lcom/kubi/kumex/utils/g0;->a:Lcom/kubi/kumex/utils/g0;

    .line 8
    .line 9
    iget-object v0, p0, Ldm/c1;->d:Lcom/kubi/resources/widget/KuCheckBox;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 13
    move-result v0

    .line 14
    .line 15
    const-string v1, "contract_share_show_user"

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, v1, v0}, Lcom/kubi/kumex/utils/g0;->f(Ljava/lang/String;Z)V

    .line 19
    .line 20
    iget-object p0, p0, Ldm/c1;->c:Lcom/kubi/resources/widget/KuCheckBox;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 24
    move-result p0

    .line 25
    .line 26
    const-string v0, "contract_share_show_pnl"

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, v0, p0}, Lcom/kubi/kumex/utils/g0;->f(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/kubi/futures/share/ModifyDisplayShareDialog;->dismissAllowingStateLoss()V

    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 35
    return-object p0
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
.end method

.method public static final v4(Ldm/c1;Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Ldm/c1;->e:Ldm/j3;

    .line 3
    .line 4
    iget-object p0, p0, Ldm/j3;->z:Landroidx/constraintlayout/widget/Group;

    .line 5
    .line 6
    const-string p1, "userInfo"

    .line 7
    .line 8
    .line 9
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, p2}, Lcom/kubi/utils/extensions/k;->G(Landroid/view/View;Z)V

    .line 13
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
.end method

.method public static final w4(Ldm/c1;Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Ldm/c1;->e:Ldm/j3;

    .line 3
    .line 4
    iget-object p0, p0, Ldm/j3;->p:Landroidx/appcompat/widget/AppCompatTextView;

    .line 5
    .line 6
    const-string p1, "pnl"

    .line 7
    .line 8
    .line 9
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, p2}, Lcom/kubi/utils/extensions/k;->G(Landroid/view/View;Z)V

    .line 13
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
.end method

.method public static final x4(Lcom/kubi/futures/share/ModifyDisplayShareDialog;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/futures/share/ModifyDisplayShareDialog;->dismissAllowingStateLoss()V

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object p0
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
    .line 57
.end method

.method private static final y4(Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p0
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

.method public static final z4(Lcom/kubi/futures/share/ModifyDisplayShareDialog;)Lcom/kubi/futures/share/BasePositionShare$ShareParam;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-string v0, "data"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    check-cast p0, Lcom/kubi/futures/share/BasePositionShare$ShareParam;

    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
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
.method public dismissAllowingStateLoss()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/share/ModifyDisplayShareDialog;->s4()Lcom/kubi/futures/share/BasePositionShare$ShareParam;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v1, Lcom/kubi/kumex/utils/g0;->a:Lcom/kubi/kumex/utils/g0;

    .line 9
    .line 10
    const-string v2, "contract_share_show_user"

    .line 11
    const/4 v3, 0x1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2, v3}, Lcom/kubi/kumex/utils/g0;->a(Ljava/lang/String;Z)Z

    .line 15
    move-result v2

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->setShowUserInfo(Z)V

    .line 19
    .line 20
    const-string v2, "contract_share_show_pnl"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2, v3}, Lcom/kubi/kumex/utils/g0;->a(Ljava/lang/String;Z)Z

    .line 24
    move-result v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->setShowPnl(Z)V

    .line 28
    .line 29
    const-string v1, "data"

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    sget-object v2, Lcom/kubi/futures/share/ModifyDisplayShareDialog;->u0:Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v2, v0}, Landroidx/fragment/app/FragmentManager;->setFragmentResult(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    invoke-super {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismissAllowingStateLoss()V

    .line 54
    return-void
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
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string p3, "inflater"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget p3, Lcom/kubi/kumex/R$layout;->bkumex_dialog_select_share_display_info:I

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 12
    move-result-object p1

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
.end method

.method public onStart()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->onStart()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    const v1, 0x3f333333    # 0.7f

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/Window;->setDimAmount(F)V

    .line 22
    :cond_0
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
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 6
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "view"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1, p2}, Lcom/kubi/resources/dialog/BaseDialogFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/futures/share/ModifyDisplayShareDialog;->r4()Ldm/c1;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    goto :goto_0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/futures/share/ModifyDisplayShareDialog;->s4()Lcom/kubi/futures/share/BasePositionShare$ShareParam;

    .line 19
    move-result-object p2

    .line 20
    .line 21
    if-nez p2, :cond_1

    .line 22
    :goto_0
    return-void

    .line 23
    .line 24
    :cond_1
    iget-object v0, p1, Ldm/c1;->e:Ldm/j3;

    .line 25
    .line 26
    iget-object v0, v0, Ldm/j3;->u:Landroidx/appcompat/widget/AppCompatTextView;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->formatSymbol()Ljava/lang/CharSequence;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    iget-object v0, p1, Ldm/c1;->e:Ldm/j3;

    .line 36
    .line 37
    iget-object v0, v0, Ldm/j3;->t:Landroidx/appcompat/widget/AppCompatTextView;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->formatSide()Ljava/lang/CharSequence;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    iget-object v0, p1, Ldm/c1;->e:Ldm/j3;

    .line 47
    .line 48
    iget-object v0, v0, Ldm/j3;->g:Landroidx/appcompat/widget/AppCompatTextView;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->formatLeverage()Ljava/lang/String;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    iget-object v0, p1, Ldm/c1;->e:Ldm/j3;

    .line 58
    .line 59
    iget-object v0, v0, Ldm/j3;->p:Landroidx/appcompat/widget/AppCompatTextView;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->formatPnl()Ljava/lang/CharSequence;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    iget-object v0, p1, Ldm/c1;->e:Ldm/j3;

    .line 69
    .line 70
    iget-object v0, v0, Ldm/j3;->o:Landroidx/appcompat/widget/AppCompatTextView;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->formatRoi()Ljava/lang/CharSequence;

    .line 74
    move-result-object v1

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->formatRoi()Ljava/lang/CharSequence;

    .line 84
    move-result-object v1

    .line 85
    const/4 v2, 0x0

    .line 86
    const/4 v3, 0x1

    .line 87
    .line 88
    if-eqz v1, :cond_3

    .line 89
    .line 90
    .line 91
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 92
    move-result v1

    .line 93
    .line 94
    if-nez v1, :cond_2

    .line 95
    goto :goto_1

    .line 96
    :cond_2
    move v1, v2

    .line 97
    goto :goto_2

    .line 98
    :cond_3
    :goto_1
    move v1, v3

    .line 99
    :goto_2
    xor-int/2addr v1, v3

    .line 100
    .line 101
    .line 102
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/k;->G(Landroid/view/View;Z)V

    .line 103
    .line 104
    iget-object v0, p1, Ldm/c1;->e:Ldm/j3;

    .line 105
    .line 106
    iget-object v0, v0, Ldm/j3;->m:Landroidx/appcompat/widget/AppCompatTextView;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->formatOpenPrice()Ljava/lang/String;

    .line 110
    move-result-object v1

    .line 111
    .line 112
    .line 113
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 114
    move-result-object v1

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->formatOpenPrice()Ljava/lang/String;

    .line 124
    move-result-object v1

    .line 125
    .line 126
    if-eqz v1, :cond_5

    .line 127
    .line 128
    .line 129
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 130
    move-result v1

    .line 131
    .line 132
    if-nez v1, :cond_4

    .line 133
    goto :goto_3

    .line 134
    :cond_4
    move v1, v2

    .line 135
    goto :goto_4

    .line 136
    :cond_5
    :goto_3
    move v1, v3

    .line 137
    :goto_4
    xor-int/2addr v1, v3

    .line 138
    .line 139
    .line 140
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/k;->G(Landroid/view/View;Z)V

    .line 141
    .line 142
    iget-object v0, p1, Ldm/c1;->e:Ldm/j3;

    .line 143
    .line 144
    iget-object v0, v0, Ldm/j3;->n:Landroidx/appcompat/widget/AppCompatTextView;

    .line 145
    .line 146
    sget v1, Lcom/kubi/kumex/R$string;->kumex_pnl_avg_open_price:I

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 150
    move-result-object v1

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 154
    .line 155
    .line 156
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->formatOpenPrice()Ljava/lang/String;

    .line 160
    move-result-object v1

    .line 161
    .line 162
    if-eqz v1, :cond_7

    .line 163
    .line 164
    .line 165
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 166
    move-result v1

    .line 167
    .line 168
    if-nez v1, :cond_6

    .line 169
    goto :goto_5

    .line 170
    :cond_6
    move v1, v2

    .line 171
    goto :goto_6

    .line 172
    :cond_7
    :goto_5
    move v1, v3

    .line 173
    :goto_6
    xor-int/2addr v1, v3

    .line 174
    .line 175
    .line 176
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/k;->G(Landroid/view/View;Z)V

    .line 177
    .line 178
    iget-object v0, p1, Ldm/c1;->e:Ldm/j3;

    .line 179
    .line 180
    iget-object v0, v0, Ldm/j3;->k:Landroidx/appcompat/widget/AppCompatTextView;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->formatLatestPrice()Ljava/lang/String;

    .line 184
    move-result-object v1

    .line 185
    .line 186
    .line 187
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 188
    move-result-object v1

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 192
    .line 193
    .line 194
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->formatLatestPrice()Ljava/lang/String;

    .line 198
    move-result-object v1

    .line 199
    .line 200
    if-eqz v1, :cond_9

    .line 201
    .line 202
    .line 203
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 204
    move-result v1

    .line 205
    .line 206
    if-nez v1, :cond_8

    .line 207
    goto :goto_7

    .line 208
    :cond_8
    move v1, v2

    .line 209
    goto :goto_8

    .line 210
    :cond_9
    :goto_7
    move v1, v3

    .line 211
    :goto_8
    xor-int/2addr v1, v3

    .line 212
    .line 213
    .line 214
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/k;->G(Landroid/view/View;Z)V

    .line 215
    .line 216
    iget-object v0, p1, Ldm/c1;->e:Ldm/j3;

    .line 217
    .line 218
    iget-object v0, v0, Ldm/j3;->l:Landroidx/appcompat/widget/AppCompatTextView;

    .line 219
    .line 220
    .line 221
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->isPnl()Z

    .line 222
    move-result v1

    .line 223
    .line 224
    if-eqz v1, :cond_a

    .line 225
    .line 226
    sget v1, Lcom/kubi/kumex/R$string;->kumex_pnl_avg_close_price:I

    .line 227
    .line 228
    .line 229
    :goto_9
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 230
    move-result-object v1

    .line 231
    goto :goto_a

    .line 232
    .line 233
    :cond_a
    sget v1, Lcom/kubi/kumex/R$string;->last_price:I

    .line 234
    goto :goto_9

    .line 235
    .line 236
    .line 237
    :goto_a
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 238
    .line 239
    .line 240
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->formatLatestPrice()Ljava/lang/String;

    .line 244
    move-result-object v1

    .line 245
    .line 246
    if-eqz v1, :cond_c

    .line 247
    .line 248
    .line 249
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 250
    move-result v1

    .line 251
    .line 252
    if-nez v1, :cond_b

    .line 253
    goto :goto_b

    .line 254
    :cond_b
    move v1, v2

    .line 255
    goto :goto_c

    .line 256
    :cond_c
    :goto_b
    move v1, v3

    .line 257
    :goto_c
    xor-int/2addr v1, v3

    .line 258
    .line 259
    .line 260
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/k;->G(Landroid/view/View;Z)V

    .line 261
    .line 262
    iget-object v0, p1, Ldm/c1;->e:Ldm/j3;

    .line 263
    .line 264
    iget-object v0, v0, Ldm/j3;->f:Lcom/kubi/sdk/widget/shape/view/ShapeTextView;

    .line 265
    .line 266
    const-string v1, "label"

    .line 267
    .line 268
    .line 269
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->isTrial()Z

    .line 273
    move-result v1

    .line 274
    .line 275
    .line 276
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/k;->G(Landroid/view/View;Z)V

    .line 277
    .line 278
    iget-object v0, p1, Ldm/c1;->e:Ldm/j3;

    .line 279
    .line 280
    iget-object v0, v0, Ldm/j3;->i:Landroid/view/View;

    .line 281
    .line 282
    const-string v1, "line1"

    .line 283
    .line 284
    .line 285
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->isTrial()Z

    .line 289
    move-result v1

    .line 290
    .line 291
    .line 292
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/k;->G(Landroid/view/View;Z)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->isTrial()Z

    .line 296
    move-result v0

    .line 297
    .line 298
    if-eqz v0, :cond_d

    .line 299
    .line 300
    iget-object v0, p1, Ldm/c1;->e:Ldm/j3;

    .line 301
    .line 302
    iget-object v0, v0, Ldm/j3;->f:Lcom/kubi/sdk/widget/shape/view/ShapeTextView;

    .line 303
    .line 304
    .line 305
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->getPrizeType()Ljava/lang/String;

    .line 306
    move-result-object v1

    .line 307
    .line 308
    .line 309
    invoke-static {v1}, Lcom/kubi/utils/t0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 310
    move-result-object v1

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 314
    .line 315
    :cond_d
    iget-object v0, p1, Ldm/c1;->e:Ldm/j3;

    .line 316
    .line 317
    iget-object v0, v0, Ldm/j3;->x:Lcom/kubi/resources/widget/BaseTextView;

    .line 318
    .line 319
    .line 320
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->formatTimeDisplay()Ljava/lang/CharSequence;

    .line 321
    move-result-object v1

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 325
    .line 326
    iget-object v0, p1, Ldm/c1;->e:Ldm/j3;

    .line 327
    .line 328
    iget-object v0, v0, Ldm/j3;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 329
    .line 330
    .line 331
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->getBackgroundRes()I

    .line 332
    move-result v1

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setBackgroundResource(I)V

    .line 336
    .line 337
    iget-object v0, p1, Ldm/c1;->e:Ldm/j3;

    .line 338
    .line 339
    iget-object v0, v0, Ldm/j3;->v:Landroidx/appcompat/widget/AppCompatTextView;

    .line 340
    .line 341
    .line 342
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->getHeadName()Ljava/lang/String;

    .line 343
    move-result-object v1

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 347
    .line 348
    iget-object v0, p1, Ldm/c1;->e:Ldm/j3;

    .line 349
    .line 350
    iget-object v0, v0, Ldm/j3;->w:Landroidx/appcompat/widget/AppCompatTextView;

    .line 351
    .line 352
    .line 353
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->getNickName()Ljava/lang/String;

    .line 354
    move-result-object v1

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 358
    .line 359
    iget-object v0, p1, Ldm/c1;->e:Ldm/j3;

    .line 360
    .line 361
    iget-object v0, v0, Ldm/j3;->y:Lcom/kubi/resources/widget/BaseTextView;

    .line 362
    .line 363
    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 364
    .line 365
    .line 366
    invoke-static {}, Lcom/kubi/user/config/UserInfo;->c()Lcom/kubi/user/model/LoginUserEntity;

    .line 367
    move-result-object v1

    .line 368
    .line 369
    .line 370
    invoke-virtual {v1}, Lcom/kubi/user/model/LoginUserEntity;->getFeeLevel()I

    .line 371
    move-result v1

    .line 372
    .line 373
    .line 374
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 375
    move-result-object v1

    .line 376
    .line 377
    .line 378
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 379
    move-result-object v1

    .line 380
    .line 381
    .line 382
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 383
    move-result-object v1

    .line 384
    .line 385
    const-string v4, "VIP Lv.%s"

    .line 386
    .line 387
    .line 388
    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 389
    move-result-object v1

    .line 390
    .line 391
    const-string v4, "format(...)"

    .line 392
    .line 393
    .line 394
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 398
    .line 399
    iget-object v0, p1, Ldm/c1;->e:Ldm/j3;

    .line 400
    .line 401
    iget-object v0, v0, Ldm/j3;->q:Lcom/kubi/resources/widget/BaseTextView;

    .line 402
    .line 403
    .line 404
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 405
    move-result-object v1

    .line 406
    .line 407
    const-string v4, "requireContext(...)"

    .line 408
    .line 409
    .line 410
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {p2, v1}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->formatReferralCode(Landroid/content/Context;)Lcom/kubi/utils/v0;

    .line 414
    move-result-object v1

    .line 415
    .line 416
    .line 417
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 418
    .line 419
    iget-object v0, p1, Ldm/c1;->e:Ldm/j3;

    .line 420
    .line 421
    iget-object v0, v0, Ldm/j3;->r:Landroidx/appcompat/widget/AppCompatImageView;

    .line 422
    .line 423
    .line 424
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->getShareCodeBitmap()Landroid/graphics/Bitmap;

    .line 425
    move-result-object v1

    .line 426
    .line 427
    .line 428
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 429
    .line 430
    iget-object v0, p1, Ldm/c1;->e:Ldm/j3;

    .line 431
    .line 432
    iget-object v0, v0, Ldm/j3;->z:Landroidx/constraintlayout/widget/Group;

    .line 433
    .line 434
    const-string v1, "userInfo"

    .line 435
    .line 436
    .line 437
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->getShowUserInfo()Z

    .line 441
    move-result v1

    .line 442
    .line 443
    .line 444
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/k;->G(Landroid/view/View;Z)V

    .line 445
    .line 446
    iget-object v0, p1, Ldm/c1;->e:Ldm/j3;

    .line 447
    .line 448
    iget-object v0, v0, Ldm/j3;->p:Landroidx/appcompat/widget/AppCompatTextView;

    .line 449
    .line 450
    const-string v1, "pnl"

    .line 451
    .line 452
    .line 453
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->getShowPnl()Z

    .line 457
    move-result v1

    .line 458
    .line 459
    .line 460
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/k;->G(Landroid/view/View;Z)V

    .line 461
    .line 462
    .line 463
    invoke-static {}, Lcom/blankj/utilcode/util/e0;->b()I

    .line 464
    move-result v0

    .line 465
    .line 466
    const/16 v1, 0x30

    .line 467
    .line 468
    .line 469
    invoke-static {p0, v1}, Lcom/kubi/utils/extensions/core/c;->f(Landroidx/fragment/app/Fragment;I)I

    .line 470
    move-result v1

    .line 471
    sub-int/2addr v0, v1

    .line 472
    .line 473
    mul-int/lit16 v1, v0, 0x696

    .line 474
    int-to-float v1, v1

    .line 475
    .line 476
    .line 477
    const v4, 0x448ca000    # 1125.0f

    .line 478
    div-float/2addr v1, v4

    .line 479
    float-to-int v1, v1

    .line 480
    .line 481
    iget-object v4, p1, Ldm/c1;->e:Ldm/j3;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v4}, Ldm/j3;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 485
    move-result-object v4

    .line 486
    .line 487
    const-string v5, "getRoot(...)"

    .line 488
    .line 489
    .line 490
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    invoke-static {v4, v0, v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->A(Landroid/view/View;II)Landroid/view/View;

    .line 494
    .line 495
    iget-object v0, p1, Ldm/c1;->d:Lcom/kubi/resources/widget/KuCheckBox;

    .line 496
    .line 497
    .line 498
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->getShowUserInfo()Z

    .line 499
    move-result v1

    .line 500
    .line 501
    .line 502
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/KuCheckBox;->setChecked(Z)V

    .line 503
    .line 504
    iget-object v0, p1, Ldm/c1;->c:Lcom/kubi/resources/widget/KuCheckBox;

    .line 505
    .line 506
    .line 507
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->getShowPnl()Z

    .line 508
    move-result v1

    .line 509
    .line 510
    .line 511
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/KuCheckBox;->setChecked(Z)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->isPnl()Z

    .line 515
    move-result v0

    .line 516
    .line 517
    if-eqz v0, :cond_e

    .line 518
    .line 519
    .line 520
    invoke-virtual {p2}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;->hasLeverage()Z

    .line 521
    move-result p2

    .line 522
    .line 523
    if-eqz p2, :cond_f

    .line 524
    :cond_e
    move v2, v3

    .line 525
    .line 526
    :cond_f
    iget-object p2, p1, Ldm/c1;->e:Ldm/j3;

    .line 527
    .line 528
    iget-object p2, p2, Ldm/j3;->g:Landroidx/appcompat/widget/AppCompatTextView;

    .line 529
    .line 530
    const-string v0, "leverage"

    .line 531
    .line 532
    .line 533
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    invoke-static {p2, v2}, Lcom/kubi/utils/extensions/k;->G(Landroid/view/View;Z)V

    .line 537
    .line 538
    iget-object p2, p1, Ldm/c1;->e:Ldm/j3;

    .line 539
    .line 540
    iget-object p2, p2, Ldm/j3;->h:Landroid/view/View;

    .line 541
    .line 542
    const-string v0, "line"

    .line 543
    .line 544
    .line 545
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    invoke-static {p2, v2}, Lcom/kubi/utils/extensions/k;->G(Landroid/view/View;Z)V

    .line 549
    .line 550
    iget-object p2, p1, Ldm/c1;->d:Lcom/kubi/resources/widget/KuCheckBox;

    .line 551
    .line 552
    new-instance v0, Lgi/d;

    .line 553
    .line 554
    .line 555
    invoke-direct {v0, p1}, Lgi/d;-><init>(Ldm/c1;)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {p2, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 559
    .line 560
    iget-object p2, p1, Ldm/c1;->c:Lcom/kubi/resources/widget/KuCheckBox;

    .line 561
    .line 562
    new-instance v0, Lgi/e;

    .line 563
    .line 564
    .line 565
    invoke-direct {v0, p1}, Lgi/e;-><init>(Ldm/c1;)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {p2, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 569
    .line 570
    .line 571
    invoke-virtual {p1}, Ldm/c1;->b()Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 572
    move-result-object p2

    .line 573
    .line 574
    .line 575
    invoke-static {p2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 576
    .line 577
    new-instance v0, Lgi/f;

    .line 578
    .line 579
    .line 580
    invoke-direct {v0, p0}, Lgi/f;-><init>(Lcom/kubi/futures/share/ModifyDisplayShareDialog;)V

    .line 581
    .line 582
    .line 583
    invoke-static {p2, v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->f(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 584
    .line 585
    iget-object p2, p1, Ldm/c1;->e:Ldm/j3;

    .line 586
    .line 587
    .line 588
    invoke-virtual {p2}, Ldm/j3;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 589
    move-result-object p2

    .line 590
    .line 591
    .line 592
    invoke-static {p2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 593
    .line 594
    new-instance v0, Lgi/g;

    .line 595
    .line 596
    .line 597
    invoke-direct {v0}, Lgi/g;-><init>()V

    .line 598
    .line 599
    .line 600
    invoke-static {p2, v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->f(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 601
    .line 602
    iget-object p2, p1, Ldm/c1;->b:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 603
    .line 604
    const-string v0, "bottomSheet"

    .line 605
    .line 606
    .line 607
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 608
    .line 609
    new-instance v0, Lgi/h;

    .line 610
    .line 611
    .line 612
    invoke-direct {v0}, Lgi/h;-><init>()V

    .line 613
    .line 614
    .line 615
    invoke-static {p2, v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->f(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 616
    .line 617
    iget-object p2, p1, Ldm/c1;->g:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 618
    .line 619
    const-string v0, "tvOk"

    .line 620
    .line 621
    .line 622
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 623
    .line 624
    new-instance v0, Lgi/i;

    .line 625
    .line 626
    .line 627
    invoke-direct {v0, p1, p0}, Lgi/i;-><init>(Ldm/c1;Lcom/kubi/futures/share/ModifyDisplayShareDialog;)V

    .line 628
    .line 629
    .line 630
    invoke-static {p2, v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->f(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 631
    return-void
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
.end method

.method public final r4()Ldm/c1;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/share/ModifyDisplayShareDialog;->r0:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/futures/share/ModifyDisplayShareDialog;->t0:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Ldm/c1;

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
.end method

.method public final s4()Lcom/kubi/futures/share/BasePositionShare$ShareParam;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/share/ModifyDisplayShareDialog;->q0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/futures/share/BasePositionShare$ShareParam;

    .line 9
    return-object v0
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
.end method
