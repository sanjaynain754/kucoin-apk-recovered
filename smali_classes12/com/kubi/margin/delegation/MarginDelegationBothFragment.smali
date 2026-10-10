.class public final Lcom/kubi/margin/delegation/MarginDelegationBothFragment;
.super Lcom/kubi/sdk/base/ui/OldBaseFragment;
.source "MarginDelegationBothFragment.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u000f\u001a\u00020\u0010H\u0014J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\n\u0010\u000c\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/kubi/margin/delegation/MarginDelegationBothFragment;",
        "Lcom/kubi/sdk/base/ui/OldBaseFragment;",
        "<init>",
        "()V",
        "bmarginLayoutSwitchFragmentbarBinding",
        "Lcom/kubi/margin/databinding/BmarginLayoutSwitchFragmentbarBinding;",
        "getBmarginLayoutSwitchFragmentbarBinding",
        "()Lcom/kubi/margin/databinding/BmarginLayoutSwitchFragmentbarBinding;",
        "bmarginLayoutSwitchFragmentbarBinding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "isIsolated",
        "",
        "()Z",
        "isIsolated$delegate",
        "Lkotlin/Lazy;",
        "getLayout",
        "",
        "onViewCreated",
        "",
        "view",
        "Landroid/view/View;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "MarginLib_googleRelease"
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
        "SMAP\nMarginDelegationBothFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginDelegationBothFragment.kt\ncom/kubi/margin/delegation/MarginDelegationBothFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,111:1\n147#2,16:112\n*S KotlinDebug\n*F\n+ 1 MarginDelegationBothFragment.kt\ncom/kubi/margin/delegation/MarginDelegationBothFragment\n*L\n36#1:112,16\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic W:[Lkotlin/reflect/KProperty;
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
.field public final U:Lcom/kubi/sdk/viewbindingdelegate/base/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final V:Lkotlin/Lazy;
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
    const-string v1, "getBmarginLayoutSwitchFragmentbarBinding()Lcom/kubi/margin/databinding/BmarginLayoutSwitchFragmentbarBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/margin/delegation/MarginDelegationBothFragment;

    .line 8
    .line 9
    const-string v4, "bmarginLayoutSwitchFragmentbarBinding"

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
    sput-object v1, Lcom/kubi/margin/delegation/MarginDelegationBothFragment;->W:[Lkotlin/reflect/KProperty;

    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/margin/delegation/MarginDelegationBothFragment$special$$inlined$viewBindingFragment$1;->INSTANCE:Lcom/kubi/margin/delegation/MarginDelegationBothFragment$special$$inlined$viewBindingFragment$1;

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/margin/delegation/MarginDelegationBothFragment$special$$inlined$viewBindingFragment$2;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/kubi/margin/delegation/MarginDelegationBothFragment$special$$inlined$viewBindingFragment$2;-><init>(Lcom/kubi/margin/delegation/MarginDelegationBothFragment;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/kubi/margin/delegation/MarginDelegationBothFragment;->U:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 17
    .line 18
    const-string v0, "B4TradeHistory"

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->setPageId(Ljava/lang/String;)V

    .line 22
    .line 23
    new-instance v0, Lcom/kubi/margin/delegation/o;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p0}, Lcom/kubi/margin/delegation/o;-><init>(Lcom/kubi/margin/delegation/MarginDelegationBothFragment;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    iput-object v0, p0, Lcom/kubi/margin/delegation/MarginDelegationBothFragment;->V:Lkotlin/Lazy;

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
.end method

.method public static synthetic k3()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/margin/delegation/MarginDelegationBothFragment;->r3()Lkotlin/Unit;

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
    .line 28
    .line 29
    .line 30
.end method

.method public static synthetic l3(Lcom/kubi/margin/delegation/MarginDelegationBothFragment;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/delegation/MarginDelegationBothFragment;->p3(Lcom/kubi/margin/delegation/MarginDelegationBothFragment;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static synthetic m3()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/margin/delegation/MarginDelegationBothFragment;->q3()Lkotlin/Unit;

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
    .line 28
    .line 29
    .line 30
.end method

.method private final n3()Ldp/t0;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/margin/delegation/MarginDelegationBothFragment;->U:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/margin/delegation/MarginDelegationBothFragment;->W:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Ldp/t0;

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
.end method

.method public static final p3(Lcom/kubi/margin/delegation/MarginDelegationBothFragment;)Z
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
    const-string v0, "positionType"

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v0}, Lcom/kubi/router/utils/RouteExKt;->y(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    .line 16
    :goto_0
    const-string v0, "isolated"

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result p0

    .line 21
    return p0
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
.end method

.method public static final q3()Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    const/16 v4, 0x8

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B4TradeHistory"

    .line 6
    .line 7
    const-string v1, "crossMarginHistory"

    .line 8
    .line 9
    const-string v2, "1"

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 14
    .line 15
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    return-object v0
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
.end method

.method public static final r3()Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    const/16 v4, 0x8

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B4TradeHistory"

    .line 6
    .line 7
    const-string v1, "isolatedMarginHistory"

    .line 8
    .line 9
    const-string v2, "1"

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 14
    .line 15
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    return-object v0
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
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/margin/R$layout;->bmargin_layout_switch_fragmentbar:I

    .line 3
    return v0
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
.end method

.method public final o3()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/margin/delegation/MarginDelegationBothFragment;->V:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    move-result v0

    .line 13
    return v0
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
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 10
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
    invoke-super {p0, p1, p2}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 9
    .line 10
    new-instance p1, Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/kubi/margin/delegation/MarginDelegationBothFragment;->n3()Ldp/t0;

    .line 17
    move-result-object p2

    .line 18
    .line 19
    if-eqz p2, :cond_a

    .line 20
    .line 21
    iget-object v0, p2, Ldp/t0;->b:Lcom/kubi/resources/widget/SwitchFragmentBar;

    .line 22
    .line 23
    sget v1, Lcom/kubi/margin/R$string;->margin_whole:I

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/SwitchFragmentBar;->setTextOneLabel(Ljava/lang/String;)V

    .line 31
    .line 32
    iget-object v0, p2, Ldp/t0;->b:Lcom/kubi/resources/widget/SwitchFragmentBar;

    .line 33
    .line 34
    sget v1, Lcom/kubi/margin/R$string;->margin_single:I

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/SwitchFragmentBar;->setTextTwoLabel(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->getNavigationBar()Lcom/kubi/resources/widget/NavigationBar;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 51
    .line 52
    :cond_0
    sget-object v0, Lcom/kubi/margin/delegation/MarginDelegationFragment;->e0:Lcom/kubi/margin/delegation/MarginDelegationFragment$Companion;

    .line 53
    .line 54
    new-instance v1, Landroid/os/Bundle;

    .line 55
    .line 56
    .line 57
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 61
    move-result-object v2

    .line 62
    .line 63
    const-string v3, "index"

    .line 64
    const/4 v4, 0x0

    .line 65
    .line 66
    if-eqz v2, :cond_1

    .line 67
    .line 68
    .line 69
    invoke-static {v2, v3}, Lcom/kubi/router/utils/RouteExKt;->S(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;

    .line 70
    move-result-object v2

    .line 71
    goto :goto_0

    .line 72
    :cond_1
    move-object v2, v4

    .line 73
    :goto_0
    const/4 v5, 0x0

    .line 74
    .line 75
    .line 76
    invoke-static {v2, v5}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 77
    move-result v2

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 84
    move-result-object v2

    .line 85
    .line 86
    const-string v6, "symbol"

    .line 87
    .line 88
    if-eqz v2, :cond_2

    .line 89
    .line 90
    .line 91
    invoke-static {v2, v6}, Lcom/kubi/router/utils/RouteExKt;->b0(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    move-result-object v2

    .line 93
    goto :goto_1

    .line 94
    :cond_2
    move-object v2, v4

    .line 95
    .line 96
    .line 97
    :goto_1
    invoke-virtual {v1, v6, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 101
    move-result-object v2

    .line 102
    .line 103
    const-string v7, "fromSymbol"

    .line 104
    .line 105
    if-eqz v2, :cond_3

    .line 106
    .line 107
    .line 108
    invoke-static {v2, v7}, Lcom/kubi/router/utils/RouteExKt;->b0(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 109
    move-result-object v2

    .line 110
    goto :goto_2

    .line 111
    :cond_3
    move-object v2, v4

    .line 112
    .line 113
    .line 114
    :goto_2
    invoke-virtual {v1, v7, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 118
    move-result-object v2

    .line 119
    .line 120
    const-string v8, "side"

    .line 121
    .line 122
    if-eqz v2, :cond_4

    .line 123
    .line 124
    .line 125
    invoke-static {v2, v8}, Lcom/kubi/router/utils/RouteExKt;->b0(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 126
    move-result-object v2

    .line 127
    goto :goto_3

    .line 128
    :cond_4
    move-object v2, v4

    .line 129
    .line 130
    .line 131
    :goto_3
    invoke-virtual {v1, v8, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    const-string v2, "MARGIN_TRADE"

    .line 134
    .line 135
    const-string v9, "tradeType"

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, v9, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    .line 140
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v1}, Lcom/kubi/margin/delegation/MarginDelegationFragment$Companion;->newInstance(Landroid/os/Bundle;)Lcom/kubi/margin/delegation/MarginDelegationFragment;

    .line 144
    move-result-object v1

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    new-instance v1, Landroid/os/Bundle;

    .line 150
    .line 151
    .line 152
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 156
    move-result-object v2

    .line 157
    .line 158
    if-eqz v2, :cond_5

    .line 159
    .line 160
    .line 161
    invoke-static {v2, v3}, Lcom/kubi/router/utils/RouteExKt;->S(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;

    .line 162
    move-result-object v2

    .line 163
    goto :goto_4

    .line 164
    :cond_5
    move-object v2, v4

    .line 165
    .line 166
    .line 167
    :goto_4
    invoke-static {v2, v5}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 168
    move-result v2

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 175
    move-result-object v2

    .line 176
    .line 177
    if-eqz v2, :cond_6

    .line 178
    .line 179
    .line 180
    invoke-static {v2, v6}, Lcom/kubi/router/utils/RouteExKt;->b0(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    move-result-object v2

    .line 182
    goto :goto_5

    .line 183
    :cond_6
    move-object v2, v4

    .line 184
    .line 185
    .line 186
    :goto_5
    invoke-virtual {v1, v6, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 190
    move-result-object v2

    .line 191
    .line 192
    if-eqz v2, :cond_7

    .line 193
    .line 194
    .line 195
    invoke-static {v2, v7}, Lcom/kubi/router/utils/RouteExKt;->b0(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 196
    move-result-object v2

    .line 197
    goto :goto_6

    .line 198
    :cond_7
    move-object v2, v4

    .line 199
    .line 200
    .line 201
    :goto_6
    invoke-virtual {v1, v7, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 205
    move-result-object v2

    .line 206
    .line 207
    if-eqz v2, :cond_8

    .line 208
    .line 209
    .line 210
    invoke-static {v2, v8}, Lcom/kubi/router/utils/RouteExKt;->b0(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 211
    move-result-object v4

    .line 212
    .line 213
    .line 214
    :cond_8
    invoke-virtual {v1, v8, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    .line 216
    const-string v2, "MARGIN_ISOLATED_TRADE"

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1, v9, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    .line 221
    const-string v2, "positionType"

    .line 222
    .line 223
    const-string v3, "isolated"

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0, v1}, Lcom/kubi/margin/delegation/MarginDelegationFragment$Companion;->newInstance(Landroid/os/Bundle;)Lcom/kubi/margin/delegation/MarginDelegationFragment;

    .line 230
    move-result-object v0

    .line 231
    .line 232
    .line 233
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    iget-object v0, p2, Ldp/t0;->b:Lcom/kubi/resources/widget/SwitchFragmentBar;

    .line 236
    .line 237
    .line 238
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 239
    move-result-object v1

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, p1, v1}, Lcom/kubi/resources/widget/SwitchFragmentBar;->h(Ljava/util/List;Landroidx/fragment/app/FragmentManager;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p0}, Lcom/kubi/margin/delegation/MarginDelegationBothFragment;->o3()Z

    .line 246
    move-result p1

    .line 247
    .line 248
    if-eqz p1, :cond_9

    .line 249
    .line 250
    iget-object p1, p2, Ldp/t0;->b:Lcom/kubi/resources/widget/SwitchFragmentBar;

    .line 251
    const/4 v0, 0x1

    .line 252
    .line 253
    .line 254
    invoke-virtual {p1, v0}, Lcom/kubi/resources/widget/SwitchFragmentBar;->setCurrentItem(I)V

    .line 255
    .line 256
    :cond_9
    iget-object p1, p2, Ldp/t0;->b:Lcom/kubi/resources/widget/SwitchFragmentBar;

    .line 257
    .line 258
    sget v0, Lcom/kubi/margin/R$id;->rb_one:I

    .line 259
    .line 260
    .line 261
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 262
    move-result-object v1

    .line 263
    .line 264
    const-string p1, "findViewById(...)"

    .line 265
    .line 266
    .line 267
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 268
    .line 269
    new-instance v4, Lcom/kubi/margin/delegation/m;

    .line 270
    .line 271
    .line 272
    invoke-direct {v4}, Lcom/kubi/margin/delegation/m;-><init>()V

    .line 273
    const/4 v5, 0x1

    .line 274
    const/4 v6, 0x0

    .line 275
    .line 276
    const-wide/16 v2, 0x0

    .line 277
    .line 278
    .line 279
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 280
    .line 281
    iget-object p2, p2, Ldp/t0;->b:Lcom/kubi/resources/widget/SwitchFragmentBar;

    .line 282
    .line 283
    sget v0, Lcom/kubi/margin/R$id;->rb_two:I

    .line 284
    .line 285
    .line 286
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 287
    move-result-object v1

    .line 288
    .line 289
    .line 290
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 291
    .line 292
    new-instance v4, Lcom/kubi/margin/delegation/n;

    .line 293
    .line 294
    .line 295
    invoke-direct {v4}, Lcom/kubi/margin/delegation/n;-><init>()V

    .line 296
    .line 297
    .line 298
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 299
    :cond_a
    return-void
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
.end method
