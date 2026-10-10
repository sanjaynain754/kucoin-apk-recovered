.class public final Lcom/sumsub/sns/internal/features/presentation/error/n;
.super Lcom/sumsub/sns/core/presentation/base/F;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/core/presentation/base/F<",
        "Lcom/sumsub/sns/databinding/f;",
        "Lcom/sumsub/sns/internal/features/presentation/error/r;",
        "Lcom/sumsub/sns/internal/features/presentation/error/t;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0007B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/error/n;",
        "Lcom/sumsub/sns/core/presentation/base/F;",
        "Lcom/sumsub/sns/databinding/f;",
        "Lcom/sumsub/sns/internal/features/presentation/error/r;",
        "Lcom/sumsub/sns/internal/features/presentation/error/t;",
        "<init>",
        "()V",
        "com/sumsub/sns/internal/features/presentation/error/f",
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
        "SMAP\nSNSErrorFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSErrorFragment.kt\ncom/sumsub/sns/internal/features/presentation/error/SNSErrorFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n106#2,15:237\n1#3:252\n*S KotlinDebug\n*F\n+ 1 SNSErrorFragment.kt\ncom/sumsub/sns/internal/features/presentation/error/SNSErrorFragment\n*L\n50#1:237,15\n*E\n"
    }
.end annotation


# static fields
.field public static final f:Lcom/sumsub/sns/internal/features/presentation/error/f;

.field public static final synthetic g:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Lkotlin/Lazy;

.field public final b:Lcom/sumsub/sns/internal/core/common/L;

.field public final c:Lcom/sumsub/sns/internal/core/common/L;

.field public final d:Lcom/sumsub/sns/internal/core/common/L;

.field public final e:Lcom/sumsub/sns/internal/core/common/L;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/error/n;

    .line 3
    .line 4
    const-string v1, "ivIcon"

    .line 5
    .line 6
    const-string v2, "getIvIcon()Lcom/sumsub/sns/core/widget/SNSImageView;"

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    const-string/jumbo v2, "tvTitle"

    .line 15
    .line 16
    const-string v4, "getTvTitle()Landroid/widget/TextView;"

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    .line 23
    const-string/jumbo v4, "tvSubTitle"

    .line 24
    .line 25
    const-string v5, "getTvSubTitle()Landroid/widget/TextView;"

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 29
    move-result-object v4

    .line 30
    .line 31
    const-string v5, "btn"

    .line 32
    .line 33
    const-string v6, "getBtn()Landroid/view/View;"

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v5, v6, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 37
    move-result-object v0

    .line 38
    const/4 v5, 0x4

    .line 39
    .line 40
    new-array v5, v5, [Lkotlin/reflect/KProperty;

    .line 41
    .line 42
    aput-object v1, v5, v3

    .line 43
    const/4 v1, 0x1

    .line 44
    .line 45
    aput-object v2, v5, v1

    .line 46
    const/4 v1, 0x2

    .line 47
    .line 48
    aput-object v4, v5, v1

    .line 49
    const/4 v1, 0x3

    .line 50
    .line 51
    aput-object v0, v5, v1

    .line 52
    .line 53
    sput-object v5, Lcom/sumsub/sns/internal/features/presentation/error/n;->g:[Lkotlin/reflect/KProperty;

    .line 54
    .line 55
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/error/f;

    .line 56
    .line 57
    .line 58
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/error/f;-><init>()V

    .line 59
    .line 60
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/error/n;->f:Lcom/sumsub/sns/internal/features/presentation/error/f;

    .line 61
    return-void
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
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/F;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/error/v;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/error/v;-><init>(Lcom/sumsub/sns/internal/features/presentation/error/n;)V

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/error/i;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/error/i;-><init>(Lcom/sumsub/sns/internal/features/presentation/error/n;)V

    .line 14
    .line 15
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 16
    .line 17
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/error/j;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/error/j;-><init>(Lcom/sumsub/sns/internal/features/presentation/error/i;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/error/t;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/error/k;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/error/k;-><init>(Lkotlin/Lazy;)V

    .line 36
    .line 37
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/error/l;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/error/l;-><init>(Lkotlin/Lazy;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/error/n;->a:Lkotlin/Lazy;

    .line 47
    .line 48
    sget v0, Lcom/sumsub/sns/R$id;->sns_error_icon:I

    .line 49
    .line 50
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 54
    .line 55
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/error/n;->b:Lcom/sumsub/sns/internal/core/common/L;

    .line 56
    .line 57
    sget v0, Lcom/sumsub/sns/R$id;->sns_error_title:I

    .line 58
    .line 59
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 60
    .line 61
    .line 62
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 63
    .line 64
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/error/n;->c:Lcom/sumsub/sns/internal/core/common/L;

    .line 65
    .line 66
    sget v0, Lcom/sumsub/sns/R$id;->sns_error_subtitle:I

    .line 67
    .line 68
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 69
    .line 70
    .line 71
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 72
    .line 73
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/error/n;->d:Lcom/sumsub/sns/internal/core/common/L;

    .line 74
    .line 75
    sget v0, Lcom/sumsub/sns/R$id;->sns_primary_button:I

    .line 76
    .line 77
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 78
    .line 79
    .line 80
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 81
    .line 82
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/error/n;->e:Lcom/sumsub/sns/internal/core/common/L;

    .line 83
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/error/n;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 4

    .line 55
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/error/u;

    .line 56
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    move-result-object v1

    .line 57
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAppListener$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/common/u0;

    move-result-object v2

    .line 58
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v3

    .line 59
    invoke-direct {v0, p0, v1, v2, v3}, Lcom/sumsub/sns/internal/features/presentation/error/u;-><init>(Lcom/sumsub/sns/internal/features/presentation/error/n;Lcom/sumsub/sns/internal/core/domain/h;Lcom/sumsub/sns/internal/core/common/u0;Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/error/n;Ljava/lang/String;)Lkotlin/Unit;
    .locals 3

    .line 52
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/error/n;->a:Lkotlin/Lazy;

    .line 53
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/error/t;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 54
    invoke-static {p0, p1, v2, v0, v1}, Lcom/sumsub/sns/core/presentation/base/C;->onLinkClicked$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/String;ZILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/analytics/Control;Lcom/sumsub/sns/internal/features/presentation/error/n;Landroid/view/View;)V
    .locals 7

    if-eqz p0, :cond_0

    .line 88
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    .line 89
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/presentation/error/n;->a:Lkotlin/Lazy;

    invoke-interface {p2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sumsub/sns/internal/features/presentation/error/t;

    .line 90
    iget-object v1, p2, Lcom/sumsub/sns/internal/features/presentation/error/t;->f:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 91
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/presentation/error/n;->a:Lkotlin/Lazy;

    invoke-interface {p2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sumsub/sns/internal/features/presentation/error/t;

    .line 92
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/presentation/error/t;->b:Ljava/lang/String;

    const/4 v4, 0x0

    const/16 v5, 0x18

    move-object v3, p0

    .line 93
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 94
    :cond_0
    iget-object p0, p1, Lcom/sumsub/sns/internal/features/presentation/error/n;->a:Lkotlin/Lazy;

    .line 95
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/error/t;

    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    sget-object p0, Lcom/sumsub/sns/internal/core/presentation/screen/base/ErrorClosure$Outcome;->ACTION:Lcom/sumsub/sns/internal/core/presentation/screen/base/ErrorClosure$Outcome;

    iput-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/error/t;->g:Lcom/sumsub/sns/internal/core/presentation/screen/base/ErrorClosure$Outcome;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 98
    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;Lcom/sumsub/sns/internal/core/analytics/Control;)V
    .locals 4

    .line 60
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 61
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/databinding/f;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v1, Lcom/sumsub/sns/databinding/f;->b:Landroid/widget/FrameLayout;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 62
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/error/n;->a:Lkotlin/Lazy;

    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/error/t;

    .line 63
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/error/t;->a:Lcom/sumsub/sns/internal/features/data/model/common/l0;

    .line 64
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/l0;->b()Lcom/sumsub/sns/internal/features/data/model/common/c0;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    .line 65
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/error/n;->b:Lcom/sumsub/sns/internal/core/common/L;

    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/error/n;->g:[Lkotlin/reflect/KProperty;

    aget-object v3, v3, v0

    invoke-virtual {v1, p0, v3}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/core/widget/SNSImageView;

    if-eqz v1, :cond_1

    .line 66
    invoke-static {v1, p3}, Lcom/sumsub/sns/core/widget/SNSStepViewExtensionsKt;->setSnsStepState(Landroid/view/View;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)V

    :cond_1
    if-eqz p1, :cond_3

    .line 67
    iget-object p3, p1, Lcom/sumsub/sns/internal/features/data/model/common/c0;->d:Ljava/lang/String;

    if-nez p3, :cond_2

    goto :goto_1

    :cond_2
    move-object p2, p3

    :cond_3
    :goto_1
    if-eqz p2, :cond_4

    .line 68
    sget-object p3, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {p3}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object p3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-interface {p3, v1, p2}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    .line 69
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/error/n;->b:Lcom/sumsub/sns/internal/core/common/L;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/error/n;->g:[Lkotlin/reflect/KProperty;

    aget-object v1, v1, v0

    invoke-virtual {p3, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/sumsub/sns/core/widget/SNSImageView;

    if-eqz p3, :cond_4

    .line 70
    invoke-virtual {p3, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_4
    const/4 p2, 0x3

    if-eqz p1, :cond_d

    .line 71
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/c0;->e:Lcom/sumsub/sns/core/theme/SNSColorElement;

    if-eqz p1, :cond_d

    .line 72
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/error/n;->b:Lcom/sumsub/sns/internal/core/common/L;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/error/n;->g:[Lkotlin/reflect/KProperty;

    aget-object v0, v1, v0

    invoke-virtual {p3, p0, v0}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/sumsub/sns/core/widget/SNSImageView;

    if-nez p3, :cond_5

    goto :goto_5

    .line 73
    :cond_5
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/error/g;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_a

    const/4 v1, 0x2

    if-eq v0, v1, :cond_9

    if-eq v0, p2, :cond_8

    const/4 v1, 0x4

    if-eq v0, v1, :cond_7

    const/4 v1, 0x5

    if-eq v0, v1, :cond_6

    move-object v0, v2

    goto :goto_2

    .line 74
    :cond_6
    sget v0, Lcom/sumsub/sns/R$color;->sns_backgroundInfo:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_2

    .line 75
    :cond_7
    sget v0, Lcom/sumsub/sns/R$color;->sns_backgroundCritical:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_2

    .line 76
    :cond_8
    sget v0, Lcom/sumsub/sns/R$color;->sns_backgroundWarning:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_2

    .line 77
    :cond_9
    sget v0, Lcom/sumsub/sns/R$color;->sns_backgroundSuccess:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_2

    .line 78
    :cond_a
    sget v0, Lcom/sumsub/sns/R$color;->sns_backgroundNeutral:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 79
    :goto_2
    invoke-static {p3, p1}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/view/View;Lcom/sumsub/sns/core/theme/SNSColorElement;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_b

    goto :goto_4

    :cond_b
    if-eqz v0, :cond_c

    .line 80
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_3

    :cond_c
    move-object p1, v2

    :goto_3
    if-eqz p1, :cond_d

    .line 81
    :goto_4
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 82
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-static {p3, p1}, Landroidx/core/view/ViewCompat;->setBackgroundTintList(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 83
    :cond_d
    :goto_5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/error/n;->e:Lcom/sumsub/sns/internal/core/common/L;

    sget-object p3, Lcom/sumsub/sns/internal/features/presentation/error/n;->g:[Lkotlin/reflect/KProperty;

    aget-object p2, p3, p2

    invoke-virtual {p1, p0, p2}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_e

    .line 84
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/error/x;

    invoke-direct {p2, p4, p0}, Lcom/sumsub/sns/internal/features/presentation/error/x;-><init>(Lcom/sumsub/sns/internal/core/analytics/Control;Lcom/sumsub/sns/internal/features/presentation/error/n;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    :cond_e
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->initCommonUI()V

    .line 86
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/error/n;->a:Lkotlin/Lazy;

    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/error/t;

    .line 87
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/base/p0;->getCommonUiViewState$idensic_mobile_sdk_aar_defaultRelease()Lkotlinx/coroutines/flow/w;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    move-result-object p2

    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/error/h;

    invoke-direct {p3, p0, v2}, Lcom/sumsub/sns/internal/features/presentation/error/h;-><init>(Lcom/sumsub/sns/internal/features/presentation/error/n;Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, p2, p3}, Lcom/sumsub/sns/internal/core/common/U;->b(Lkotlinx/coroutines/flow/e;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/error/r;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/error/n;->a:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/error/t;

    .line 2
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/error/t;->a:Lcom/sumsub/sns/internal/features/data/model/common/l0;

    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/databinding/f;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lcom/sumsub/sns/databinding/f;->b:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    if-gtz v1, :cond_6

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/error/o;->a:Lcom/sumsub/sns/internal/features/presentation/error/o;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    .line 4
    :cond_1
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/error/q;->a:Lcom/sumsub/sns/internal/features/presentation/error/q;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 5
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_init_error:I

    .line 6
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->ICON_WORDLESS_FAILURE:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    move-result-object v1

    .line 7
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Control;->CancelButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 8
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/sumsub/sns/internal/features/presentation/error/n;->a(ILjava/lang/String;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;Lcom/sumsub/sns/internal/core/analytics/Control;)V

    goto :goto_1

    .line 9
    :cond_2
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/g0;

    if-eqz v1, :cond_3

    .line 10
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_common_error:I

    .line 11
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->FAILURE:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;

    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->getImageName()Ljava/lang/String;

    move-result-object v1

    .line 12
    sget-object v3, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->REJECTED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 13
    sget-object v4, Lcom/sumsub/sns/internal/core/analytics/Control;->RetryButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 14
    invoke-virtual {p0, v0, v1, v3, v4}, Lcom/sumsub/sns/internal/features/presentation/error/n;->a(ILjava/lang/String;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;Lcom/sumsub/sns/internal/core/analytics/Control;)V

    goto :goto_1

    .line 15
    :cond_3
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/i0;

    if-eqz v1, :cond_4

    .line 16
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_network_error:I

    .line 17
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->WARNING:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;

    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->getImageName()Ljava/lang/String;

    move-result-object v1

    .line 18
    sget-object v3, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->PENDING:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 19
    sget-object v4, Lcom/sumsub/sns/internal/core/analytics/Control;->RetryButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 20
    invoke-virtual {p0, v0, v1, v3, v4}, Lcom/sumsub/sns/internal/features/presentation/error/n;->a(ILjava/lang/String;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;Lcom/sumsub/sns/internal/core/analytics/Control;)V

    goto :goto_1

    .line 21
    :cond_4
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/e0;

    if-eqz v1, :cond_5

    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/e0;

    .line 22
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/e0;->a:Ljava/lang/Throwable;

    .line 23
    instance-of v0, v0, Lcom/sumsub/sns/core/data/model/SNSNeedRestartSDKException;

    if-eqz v0, :cond_5

    .line 24
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_common_error:I

    .line 25
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->FAILURE:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;

    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->getImageName()Ljava/lang/String;

    move-result-object v1

    .line 26
    sget-object v3, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->PROCESSING:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 27
    sget-object v4, Lcom/sumsub/sns/internal/core/analytics/Control;->GoBackButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 28
    invoke-virtual {p0, v0, v1, v3, v4}, Lcom/sumsub/sns/internal/features/presentation/error/n;->a(ILjava/lang/String;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;Lcom/sumsub/sns/internal/core/analytics/Control;)V

    goto :goto_1

    :cond_5
    if-eqz v1, :cond_6

    .line 29
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_common_error:I

    .line 30
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->FAILURE:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;

    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->getImageName()Ljava/lang/String;

    move-result-object v1

    .line 31
    sget-object v3, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->REJECTED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 32
    sget-object v4, Lcom/sumsub/sns/internal/core/analytics/Control;->GoBackButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 33
    invoke-virtual {p0, v0, v1, v3, v4}, Lcom/sumsub/sns/internal/features/presentation/error/n;->a(ILjava/lang/String;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;Lcom/sumsub/sns/internal/core/analytics/Control;)V

    .line 34
    :cond_6
    :goto_1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/error/p;

    if-eqz v0, :cond_b

    .line 35
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/error/n;->c:Lcom/sumsub/sns/internal/core/common/L;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/error/n;->g:[Lkotlin/reflect/KProperty;

    const/4 v3, 0x1

    aget-object v3, v1, v3

    invoke-virtual {v0, p0, v3}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_7

    .line 36
    move-object v3, p1

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/error/p;

    .line 37
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/error/p;->a:Ljava/lang/CharSequence;

    .line 38
    invoke-static {v0, v3}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 39
    :cond_7
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/error/n;->d:Lcom/sumsub/sns/internal/core/common/L;

    const/4 v3, 0x2

    aget-object v4, v1, v3

    invoke-virtual {v0, p0, v4}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_8

    .line 40
    move-object v4, p1

    check-cast v4, Lcom/sumsub/sns/internal/features/presentation/error/p;

    .line 41
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/presentation/error/p;->b:Ljava/lang/CharSequence;

    .line 42
    invoke-static {v0, v4}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 43
    :cond_8
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/error/n;->e:Lcom/sumsub/sns/internal/core/common/L;

    const/4 v4, 0x3

    aget-object v4, v1, v4

    invoke-virtual {v0, p0, v4}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 44
    instance-of v4, v0, Landroid/widget/TextView;

    if-eqz v4, :cond_9

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    :cond_9
    if-eqz v2, :cond_a

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/error/p;

    .line 45
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/error/p;->c:Ljava/lang/String;

    .line 46
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    :cond_a
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/error/n;->a:Lkotlin/Lazy;

    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/error/t;

    .line 48
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/error/t;->a:Lcom/sumsub/sns/internal/features/data/model/common/l0;

    .line 49
    instance-of p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/e0;

    if-eqz p1, :cond_b

    .line 50
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/error/n;->d:Lcom/sumsub/sns/internal/core/common/L;

    aget-object v0, v1, v3

    invoke-virtual {p1, p0, v0}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_b

    .line 51
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/error/w;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/error/w;-><init>(Lcom/sumsub/sns/internal/features/presentation/error/n;)V

    invoke-static {p1, v0}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V

    :cond_b
    return-void
.end method

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/error/n;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/error/t;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/error/t;->b:Ljava/lang/String;

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/error/n;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/error/t;

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
.end method

.method public final bridge synthetic handleSuccessState(Lcom/sumsub/sns/core/presentation/base/V;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/error/r;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/error/n;->a(Lcom/sumsub/sns/internal/features/presentation/error/r;)V

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

.method public final onCancelResult()Lcom/sumsub/sns/core/data/model/SNSCompletionResult;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/core/data/model/SNSCompletionResult$AbnormalTermination;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/error/n;->a:Lkotlin/Lazy;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/error/t;

    .line 11
    .line 12
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/error/t;->a:Lcom/sumsub/sns/internal/features/data/model/common/l0;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/l0;->c()Ljava/lang/Throwable;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1}, Lcom/sumsub/sns/core/data/model/SNSCompletionResult$AbnormalTermination;-><init>(Ljava/lang/Throwable;)V

    .line 20
    return-object v0
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

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/base/F;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 4
    .line 5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/error/n;->a:Lkotlin/Lazy;

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/error/t;

    .line 12
    .line 13
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/error/t;->a:Lcom/sumsub/sns/internal/features/data/model/common/l0;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/l0;->c()Ljava/lang/Throwable;

    .line 17
    move-result-object p2

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 23
    move-result-object p2

    .line 24
    .line 25
    if-nez p2, :cond_1

    .line 26
    .line 27
    .line 28
    :cond_0
    const-string/jumbo p2, "unknown"

    .line 29
    .line 30
    :cond_1
    const-string v0, "error"

    .line 31
    .line 32
    .line 33
    invoke-static {v0, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 34
    move-result-object p2

    .line 35
    .line 36
    .line 37
    filled-new-array {p2}, [Lkotlin/Pair;

    .line 38
    move-result-object p2

    .line 39
    .line 40
    .line 41
    invoke-static {p2}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 42
    move-result-object p2

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/l0;->c()Ljava/lang/Throwable;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    instance-of v0, p1, Lcom/sumsub/sns/core/data/model/SNSGeneralException;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    check-cast p1, Lcom/sumsub/sns/core/data/model/SNSGeneralException;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/sumsub/sns/core/data/model/SNSGeneralException;->getReason()Ljava/lang/String;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/sumsub/sns/core/data/model/SNSGeneralException;->getReason()Ljava/lang/String;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    .line 65
    const-string/jumbo v0, "reason"

    .line 66
    .line 67
    .line 68
    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    :cond_2
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/error/n;->a:Lkotlin/Lazy;

    .line 75
    .line 76
    .line 77
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/error/t;

    .line 81
    .line 82
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/error/t;->f:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 83
    .line 84
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/error/n;->a:Lkotlin/Lazy;

    .line 85
    .line 86
    .line 87
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/error/t;

    .line 91
    .line 92
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/error/t;->b:Ljava/lang/String;

    .line 93
    .line 94
    const/16 v2, 0x8

    .line 95
    .line 96
    .line 97
    invoke-static {p1, v0, v1, p2, v2}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;I)V

    .line 98
    return-void
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

.method public final provideViewBinding(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding;
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_error:I

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    check-cast p1, Landroid/widget/FrameLayout;

    .line 12
    .line 13
    new-instance p2, Lcom/sumsub/sns/databinding/f;

    .line 14
    .line 15
    .line 16
    invoke-direct {p2, p1, p1}, Lcom/sumsub/sns/databinding/f;-><init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;)V

    .line 17
    return-object p2

    .line 18
    .line 19
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 20
    .line 21
    .line 22
    const-string/jumbo p2, "rootView"

    .line 23
    .line 24
    .line 25
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 26
    throw p1
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
