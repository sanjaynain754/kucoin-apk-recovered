.class public final Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;
.super Lcom/sumsub/sns/core/presentation/base/F;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/presentation/form/d;
.implements Lcom/sumsub/sns/core/presentation/form/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/core/presentation/base/F<",
        "Lcom/sumsub/sns/databinding/m;",
        "Lcom/sumsub/sns/internal/features/presentation/questionnaire/p;",
        "Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;",
        ">;",
        "Lcom/sumsub/sns/internal/core/presentation/form/d;",
        "Lcom/sumsub/sns/core/presentation/form/h;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001\tB\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;",
        "Lcom/sumsub/sns/core/presentation/base/F;",
        "Lcom/sumsub/sns/databinding/m;",
        "Lcom/sumsub/sns/internal/features/presentation/questionnaire/p;",
        "Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;",
        "Lcom/sumsub/sns/internal/core/presentation/form/d;",
        "Lcom/sumsub/sns/core/presentation/form/h;",
        "<init>",
        "()V",
        "Companion",
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
        "SMAP\nSNSQuestionnaireFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSQuestionnaireFragment.kt\ncom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n*L\n1#1,207:1\n106#2,15:208\n27#3,4:223\n1#4:227\n54#5,8:228\n*S KotlinDebug\n*F\n+ 1 SNSQuestionnaireFragment.kt\ncom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment\n*L\n40#1:208,15\n56#1:223,4\n149#1:228,8\n*E\n"
    }
.end annotation


# static fields
.field public static final d:Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment$Companion;


# instance fields
.field public final a:Lkotlin/Lazy;

.field public final b:Lcom/sumsub/sns/internal/core/presentation/common/a;

.field public final c:Lcom/sumsub/sns/internal/core/presentation/common/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;->d:Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment$Companion;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/F;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/c0;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/c0;-><init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;)V

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/c;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/c;-><init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;)V

    .line 14
    .line 15
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 16
    .line 17
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/questionnaire/d;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/d;-><init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/c;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/questionnaire/e;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/e;-><init>(Lkotlin/Lazy;)V

    .line 36
    .line 37
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/questionnaire/f;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/f;-><init>(Lkotlin/Lazy;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;->a:Lkotlin/Lazy;

    .line 47
    .line 48
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/common/a;

    .line 49
    .line 50
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/a;

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/a;-><init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;)V

    .line 54
    .line 55
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/b;

    .line 56
    .line 57
    .line 58
    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/b;-><init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {v0, p0, v1, v2}, Lcom/sumsub/sns/internal/core/presentation/common/a;-><init>(Lcom/sumsub/sns/core/presentation/base/F;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 62
    .line 63
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;->b:Lcom/sumsub/sns/internal/core/presentation/common/a;

    .line 64
    .line 65
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/common/b;

    .line 66
    .line 67
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/d0;

    .line 68
    .line 69
    .line 70
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/d0;-><init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;)V

    .line 71
    .line 72
    new-instance v2, Lcom/sumsub/sns/internal/features/domain/A;

    .line 73
    .line 74
    .line 75
    invoke-direct {v2}, Lcom/sumsub/sns/internal/features/domain/A;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-direct {v0, p0, v2, v1}, Lcom/sumsub/sns/internal/core/presentation/common/b;-><init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;Lcom/sumsub/sns/internal/features/domain/A;Lkotlin/jvm/functions/Function1;)V

    .line 79
    .line 80
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;->c:Lcom/sumsub/sns/internal/core/presentation/common/b;

    .line 81
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 3

    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/J;

    .line 7
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    move-result-object v1

    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    .line 9
    invoke-direct {v0, p0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/J;-><init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;Lcom/sumsub/sns/internal/features/data/model/common/T;)Lkotlin/Unit;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;->a:Lkotlin/Lazy;

    .line 2
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 3
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/l;

    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/l;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/T;)V

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;Lcom/sumsub/sns/databinding/m;Landroid/view/View;)V
    .locals 7

    .line 12
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object p2

    .line 13
    check-cast p2, Lcom/sumsub/sns/databinding/m;

    if-eqz p2, :cond_0

    iget-object p2, p2, Lcom/sumsub/sns/databinding/m;->b:Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result p2

    invoke-virtual {v0, p2}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    move-result-object p2

    instance-of v0, p2, Lcom/sumsub/sns/core/presentation/form/f;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/sumsub/sns/core/presentation/form/f;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const/4 v0, 0x0

    if-eqz p2, :cond_1

    .line 14
    invoke-virtual {p2}, Lcom/sumsub/sns/core/presentation/form/f;->e()Z

    move-result p2

    goto :goto_1

    :cond_1
    move p2, v0

    .line 15
    :goto_1
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v1

    .line 16
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object v2

    .line 17
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;->getIdDocSetType()Ljava/lang/String;

    move-result-object v3

    .line 18
    sget-object v4, Lcom/sumsub/sns/internal/core/analytics/Control;->ContinueButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 19
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;->a:Lkotlin/Lazy;

    invoke-interface {v5}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 20
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->r:Lkotlinx/coroutines/flow/w;

    .line 21
    invoke-interface {v5}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 22
    iget v5, v5, Lcom/sumsub/sns/internal/core/presentation/form/f;->a:I

    add-int/lit8 v5, v5, -0x1

    .line 23
    invoke-static {v5, v0}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string/jumbo v5, "pageIndex"

    invoke-static {v5, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 25
    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v5

    const-string v6, "isDataValid"

    invoke-static {v6, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    filled-new-array {v0, v5}, [Lkotlin/Pair;

    move-result-object v0

    .line 26
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v5

    const/16 v6, 0x10

    .line 27
    invoke-static/range {v1 .. v6}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    if-nez p2, :cond_2

    return-void

    .line 28
    :cond_2
    iget-object p2, p1, Lcom/sumsub/sns/databinding/m;->c:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    const/4 v0, 0x4

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 29
    iget-object p1, p1, Lcom/sumsub/sns/databinding/m;->c:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    invoke-static {p1}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/view/View;)V

    .line 30
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;->a:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 31
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/k;->a:Lcom/sumsub/sns/internal/features/presentation/questionnaire/k;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/sumsub/sns/internal/core/presentation/form/k;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;->a:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    return-object v0
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Landroid/view/View;)V
    .locals 2

    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "PENDING_FORM_ITEM"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 11
    :cond_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;->b:Lcom/sumsub/sns/internal/core/presentation/common/a;

    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/core/presentation/common/a;->a(Landroid/view/View;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/questionnaire/p;)V
    .locals 6

    .line 32
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {p1}, Lcom/sumsub/sns/internal/core/common/h;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleState: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "Questionnaire"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 33
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/databinding/m;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/sumsub/sns/databinding/m;->c:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 34
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/p;->d:Ljava/lang/CharSequence;

    .line 35
    invoke-static {v0, v1}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 36
    iget-boolean v1, p1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/p;->c:Z

    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 38
    :cond_0
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/p;->b:Z

    if-eqz p1, :cond_1

    .line 39
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;->f()V

    :cond_1
    return-void
.end method

.method public final f()V
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->r:Lkotlinx/coroutines/flow/w;

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 17
    .line 18
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/form/f;->b:Ljava/util/List;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;->a:Lkotlin/Lazy;

    .line 21
    .line 22
    .line 23
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 27
    .line 28
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->r:Lkotlinx/coroutines/flow/w;

    .line 29
    .line 30
    .line 31
    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    check-cast v1, Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 35
    .line 36
    iget v1, v1, Lcom/sumsub/sns/internal/core/presentation/form/f;->a:I

    .line 37
    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 40
    move-result v2

    .line 41
    .line 42
    if-nez v2, :cond_3

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    if-nez v2, :cond_0

    .line 49
    goto :goto_1

    .line 50
    .line 51
    .line 52
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    check-cast v0, Lcom/sumsub/sns/databinding/m;

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    iget-object v0, v0, Lcom/sumsub/sns/databinding/m;->b:Landroid/widget/FrameLayout;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    check-cast v1, Lcom/sumsub/sns/databinding/m;

    .line 66
    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    iget-object v1, v1, Lcom/sumsub/sns/databinding/m;->b:Landroid/widget/FrameLayout;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 73
    move-result-object v2

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 77
    move-result v1

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    .line 81
    move-result-object v1

    .line 82
    .line 83
    instance-of v2, v1, Lcom/sumsub/sns/core/presentation/form/f;

    .line 84
    .line 85
    if-eqz v2, :cond_1

    .line 86
    .line 87
    check-cast v1, Lcom/sumsub/sns/core/presentation/form/f;

    .line 88
    goto :goto_0

    .line 89
    :cond_1
    const/4 v1, 0x0

    .line 90
    .line 91
    :goto_0
    if-nez v1, :cond_2

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 95
    move-result-object v1

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 99
    move-result-object v1

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 103
    move-result v0

    .line 104
    .line 105
    sget-object v2, Lcom/sumsub/sns/core/presentation/form/f;->o:Lcom/sumsub/sns/core/presentation/form/b;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;->getIdDocSetType()Ljava/lang/String;

    .line 109
    move-result-object v3

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    const-string v2, "Questionnaire"

    .line 115
    .line 116
    .line 117
    invoke-static {v2, v3}, Lcom/sumsub/sns/core/presentation/form/b;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/form/f;

    .line 118
    move-result-object v2

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v0, v2}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentTransaction;->commitNowAllowingStateLoss()V

    .line 125
    :cond_2
    return-void

    .line 126
    .line 127
    :cond_3
    :goto_1
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 128
    .line 129
    .line 130
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 131
    move-result v0

    .line 132
    .line 133
    new-instance v2, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 137
    .line 138
    const-string v4, "Skipping showPage(). Pages: "

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    const-string v0, ", index: "

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    move-result-object v5

    .line 157
    const/4 v7, 0x4

    .line 158
    const/4 v8, 0x0

    .line 159
    .line 160
    const-string v4, "Questionnaire"

    .line 161
    const/4 v6, 0x0

    .line 162
    .line 163
    .line 164
    invoke-static/range {v3 .. v8}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->e$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 165
    return-void
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

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    const-string v1, "IDDOCSETTYPE"

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object v0

    .line 17
    .line 18
    :cond_1
    :goto_0
    const-string v0, "TYPE_UNKNOWN"

    .line 19
    return-object v0
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

.method public final getLogTag()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "Questionnaire"

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

.method public final getOpenPayload()Ljava/util/Map;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->r:Lkotlinx/coroutines/flow/w;

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 17
    .line 18
    iget v0, v0, Lcom/sumsub/sns/internal/core/presentation/form/f;->a:I

    .line 19
    .line 20
    add-int/lit8 v0, v0, -0x1

    .line 21
    const/4 v1, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 25
    move-result v0

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    const-string/jumbo v1, "pageIndex"

    .line 33
    .line 34
    .line 35
    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 40
    move-result-object v0

    .line 41
    return-object v0
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

.method public final getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

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

.method public final handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V
    .locals 8

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/core/presentation/base/m;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/sumsub/sns/databinding/m;

    .line 11
    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    iget-object v0, v0, Lcom/sumsub/sns/databinding/m;->c:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/i;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;->c:Lcom/sumsub/sns/internal/core/presentation/common/b;

    .line 26
    move-object v1, p1

    .line 27
    .line 28
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/i;

    .line 29
    .line 30
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/i;->a:Lcom/sumsub/sns/internal/features/domain/documents/M;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/b;->a(Landroid/os/Parcelable;)V

    .line 34
    .line 35
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/common/b;->h:Lcom/sumsub/sns/internal/core/presentation/camera/a;

    .line 36
    .line 37
    iget-object v2, v0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 38
    .line 39
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->o:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-static {v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y;->a(Lcom/sumsub/sns/internal/features/domain/documents/M;)Lcom/sumsub/sns/core/presentation/base/I;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    const-string v1, "REQUEST_CAMERA_PICKER"

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/core/presentation/base/l;->forResult(Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/base/l;

    .line 52
    move-result-object v3

    .line 53
    const/4 v6, 0x4

    .line 54
    const/4 v7, 0x0

    .line 55
    .line 56
    const-string v4, "SNSPhotoDocumentPickerFragment2"

    .line 57
    const/4 v5, 0x0

    .line 58
    .line 59
    .line 60
    invoke-static/range {v2 .. v7}, Lcom/sumsub/sns/core/presentation/base/l;->navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 61
    goto :goto_0

    .line 62
    .line 63
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/j;

    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;->c:Lcom/sumsub/sns/internal/core/presentation/common/b;

    .line 68
    move-object v1, p1

    .line 69
    .line 70
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/j;

    .line 71
    .line 72
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/j;->a:Lcom/sumsub/sns/internal/features/domain/documents/s;

    .line 73
    .line 74
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/domain/documents/s;->c:[Ljava/lang/String;

    .line 75
    array-length v2, v2

    .line 76
    .line 77
    if-nez v2, :cond_2

    .line 78
    .line 79
    sget v2, Lcom/sumsub/sns/R$string;->sns_questionnaire_mime_types:I

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 83
    move-result-object v2

    .line 84
    .line 85
    .line 86
    invoke-static {v2}, Lcom/sumsub/sns/internal/core/common/c;->a(Ljava/lang/String;)[Ljava/lang/String;

    .line 87
    move-result-object v2

    .line 88
    .line 89
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/domain/documents/s;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 90
    .line 91
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/domain/documents/s;->b:Ljava/lang/String;

    .line 92
    .line 93
    new-instance v4, Lcom/sumsub/sns/internal/features/domain/documents/s;

    .line 94
    .line 95
    .line 96
    invoke-direct {v4, v3, v1, v2}, Lcom/sumsub/sns/internal/features/domain/documents/s;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/X;Ljava/lang/String;[Ljava/lang/String;)V

    .line 97
    move-object v1, v4

    .line 98
    .line 99
    .line 100
    :cond_2
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/b;->a(Landroid/os/Parcelable;)V

    .line 101
    .line 102
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/common/b;->i:Lcom/sumsub/sns/internal/core/presentation/common/e;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/e;->a(Lcom/sumsub/sns/internal/features/domain/documents/s;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    :goto_0
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 109
    return-void
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
.end method

.method public final bridge synthetic handleSuccessState(Lcom/sumsub/sns/core/presentation/base/V;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/p;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;->a(Lcom/sumsub/sns/internal/features/presentation/questionnaire/p;)V

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

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/base/F;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    check-cast p1, Lcom/sumsub/sns/databinding/m;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p2, p1, Lcom/sumsub/sns/databinding/m;->c:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 14
    .line 15
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/b0;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/b0;-><init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;Lcom/sumsub/sns/databinding/m;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final provideViewBinding(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding;
    .locals 3

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_questionnarie:I

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
    sget p2, Lcom/sumsub/sns/R$id;->sns_content:I

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    check-cast v0, Landroid/widget/FrameLayout;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget p2, Lcom/sumsub/sns/R$id;->sns_continue:I

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    check-cast v1, Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    sget p2, Lcom/sumsub/sns/R$id;->sns_guideline_end:I

    .line 30
    .line 31
    .line 32
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 36
    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    sget p2, Lcom/sumsub/sns/R$id;->sns_guideline_start:I

    .line 40
    .line 41
    .line 42
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 43
    move-result-object v2

    .line 44
    .line 45
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 46
    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    sget p2, Lcom/sumsub/sns/R$id;->sns_toolbar:I

    .line 50
    .line 51
    .line 52
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 53
    move-result-object v2

    .line 54
    .line 55
    check-cast v2, Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 56
    .line 57
    if-eqz v2, :cond_0

    .line 58
    .line 59
    new-instance p2, Lcom/sumsub/sns/databinding/m;

    .line 60
    .line 61
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 62
    .line 63
    .line 64
    invoke-direct {p2, p1, v0, v1}, Lcom/sumsub/sns/databinding/m;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/FrameLayout;Lcom/sumsub/sns/core/widget/SNSPrimaryButton;)V

    .line 65
    return-object p2

    .line 66
    .line 67
    .line 68
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    new-instance p2, Ljava/lang/NullPointerException;

    .line 76
    .line 77
    const-string v0, "Missing required view with ID: "

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    move-result-object p1

    .line 82
    .line 83
    .line 84
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 85
    throw p2
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
.end method
