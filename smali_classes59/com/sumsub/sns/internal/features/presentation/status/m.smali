.class public final Lcom/sumsub/sns/internal/features/presentation/status/m;
.super Lcom/sumsub/sns/core/presentation/base/I;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/core/presentation/base/I<",
        "Lcom/sumsub/sns/internal/features/presentation/status/T;",
        "Lcom/sumsub/sns/internal/features/presentation/status/L;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/status/m;",
        "Lcom/sumsub/sns/core/presentation/base/I;",
        "Lcom/sumsub/sns/internal/features/presentation/status/T;",
        "Lcom/sumsub/sns/internal/features/presentation/status/L;",
        "<init>",
        "()V",
        "com/sumsub/sns/internal/features/presentation/status/c",
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
        "SMAP\nSNSApplicantStatusFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSApplicantStatusFragment.kt\ncom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,458:1\n106#2,15:459\n298#3,2:474\n256#3,2:476\n256#3,2:478\n*S KotlinDebug\n*F\n+ 1 SNSApplicantStatusFragment.kt\ncom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusFragment\n*L\n56#1:459,15\n196#1:474,2\n231#1:476,2\n295#1:478,2\n*E\n"
    }
.end annotation


# static fields
.field public static final o:Lcom/sumsub/sns/internal/features/presentation/status/c;

.field public static final synthetic p:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Lkotlin/Lazy;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/sumsub/sns/internal/core/common/L;

.field public final d:Lcom/sumsub/sns/internal/core/common/L;

.field public final e:Lcom/sumsub/sns/internal/core/common/L;

.field public final f:Lcom/sumsub/sns/internal/core/common/L;

.field public final g:Lcom/sumsub/sns/internal/core/common/L;

.field public final h:Lcom/sumsub/sns/internal/core/common/L;

.field public final i:Lcom/sumsub/sns/internal/core/common/L;

.field public final j:Lcom/sumsub/sns/internal/core/common/L;

.field public k:Landroidx/appcompat/app/AlertDialog;

.field public l:Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;

.field public m:Z

.field public final n:Lcom/sumsub/sns/internal/features/presentation/sumsubid/Q;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/status/m;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "tvTitle"

    .line 6
    .line 7
    const-string v2, "getTvTitle()Landroid/widget/TextView;"

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    const-string/jumbo v2, "tvSubtitle"

    .line 16
    .line 17
    const-string v4, "getTvSubtitle()Landroid/widget/TextView;"

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    const-string/jumbo v4, "tvFooter"

    .line 25
    .line 26
    const-string v5, "getTvFooter()Landroid/widget/TextView;"

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 30
    move-result-object v4

    .line 31
    .line 32
    const-string v5, "btnContinue"

    .line 33
    .line 34
    const-string v6, "getBtnContinue()Landroid/widget/Button;"

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v5, v6, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 38
    move-result-object v5

    .line 39
    .line 40
    .line 41
    const-string/jumbo v6, "recycler"

    .line 42
    .line 43
    const-string v7, "getRecycler()Landroidx/recyclerview/widget/RecyclerView;"

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v6, v7, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 47
    move-result-object v6

    .line 48
    .line 49
    const-string v7, "contentContainer"

    .line 50
    .line 51
    const-string v8, "getContentContainer()Landroidx/core/widget/NestedScrollView;"

    .line 52
    .line 53
    .line 54
    invoke-static {v0, v7, v8, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 55
    move-result-object v7

    .line 56
    .line 57
    .line 58
    const-string/jumbo v8, "sumsubId"

    .line 59
    .line 60
    const-string v9, "getSumsubId()Lcom/sumsub/sns/core/widget/SNSSumsubIdBanner;"

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v8, v9, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 64
    move-result-object v8

    .line 65
    .line 66
    const-string v9, "agreementBottomSheetView"

    .line 67
    .line 68
    const-string v10, "getAgreementBottomSheetView()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;"

    .line 69
    .line 70
    .line 71
    invoke-static {v0, v9, v10, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 72
    move-result-object v0

    .line 73
    .line 74
    const/16 v9, 0x8

    .line 75
    .line 76
    new-array v9, v9, [Lkotlin/reflect/KProperty;

    .line 77
    .line 78
    aput-object v1, v9, v3

    .line 79
    const/4 v1, 0x1

    .line 80
    .line 81
    aput-object v2, v9, v1

    .line 82
    const/4 v1, 0x2

    .line 83
    .line 84
    aput-object v4, v9, v1

    .line 85
    const/4 v1, 0x3

    .line 86
    .line 87
    aput-object v5, v9, v1

    .line 88
    const/4 v1, 0x4

    .line 89
    .line 90
    aput-object v6, v9, v1

    .line 91
    const/4 v1, 0x5

    .line 92
    .line 93
    aput-object v7, v9, v1

    .line 94
    const/4 v1, 0x6

    .line 95
    .line 96
    aput-object v8, v9, v1

    .line 97
    const/4 v1, 0x7

    .line 98
    .line 99
    aput-object v0, v9, v1

    .line 100
    .line 101
    sput-object v9, Lcom/sumsub/sns/internal/features/presentation/status/m;->p:[Lkotlin/reflect/KProperty;

    .line 102
    .line 103
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/status/c;

    .line 104
    .line 105
    .line 106
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/status/c;-><init>()V

    .line 107
    .line 108
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/status/m;->o:Lcom/sumsub/sns/internal/features/presentation/status/c;

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
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/I;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/status/l0;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/status/l0;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/m;)V

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/status/h;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/status/h;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/m;)V

    .line 14
    .line 15
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 16
    .line 17
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/status/i;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/status/i;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/h;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/status/j;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/status/j;-><init>(Lkotlin/Lazy;)V

    .line 36
    .line 37
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/status/k;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/status/k;-><init>(Lkotlin/Lazy;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->a:Lkotlin/Lazy;

    .line 47
    .line 48
    const-string v0, "Status"

    .line 49
    .line 50
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->b:Ljava/lang/String;

    .line 51
    .line 52
    sget v0, Lcom/sumsub/sns/R$id;->sns_title:I

    .line 53
    .line 54
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 55
    .line 56
    .line 57
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 58
    .line 59
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->c:Lcom/sumsub/sns/internal/core/common/L;

    .line 60
    .line 61
    sget v0, Lcom/sumsub/sns/R$id;->sns_subtitle:I

    .line 62
    .line 63
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 64
    .line 65
    .line 66
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 67
    .line 68
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->d:Lcom/sumsub/sns/internal/core/common/L;

    .line 69
    .line 70
    sget v0, Lcom/sumsub/sns/R$id;->sns_footer:I

    .line 71
    .line 72
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 73
    .line 74
    .line 75
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 76
    .line 77
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->e:Lcom/sumsub/sns/internal/core/common/L;

    .line 78
    .line 79
    sget v0, Lcom/sumsub/sns/R$id;->sns_primary_button:I

    .line 80
    .line 81
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 82
    .line 83
    .line 84
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 85
    .line 86
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->f:Lcom/sumsub/sns/internal/core/common/L;

    .line 87
    .line 88
    sget v0, Lcom/sumsub/sns/R$id;->sns_list:I

    .line 89
    .line 90
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 91
    .line 92
    .line 93
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 94
    .line 95
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->g:Lcom/sumsub/sns/internal/core/common/L;

    .line 96
    .line 97
    sget v0, Lcom/sumsub/sns/R$id;->sns_content:I

    .line 98
    .line 99
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 100
    .line 101
    .line 102
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 103
    .line 104
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->h:Lcom/sumsub/sns/internal/core/common/L;

    .line 105
    .line 106
    sget v0, Lcom/sumsub/sns/R$id;->sns_id_flow:I

    .line 107
    .line 108
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 109
    .line 110
    .line 111
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 112
    .line 113
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->i:Lcom/sumsub/sns/internal/core/common/L;

    .line 114
    .line 115
    sget v0, Lcom/sumsub/sns/R$id;->sns_agreement_bottom_sheet:I

    .line 116
    .line 117
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 118
    .line 119
    .line 120
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 121
    .line 122
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->j:Lcom/sumsub/sns/internal/core/common/L;

    .line 123
    .line 124
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;->Loading:Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;

    .line 125
    .line 126
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->l:Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;

    .line 127
    .line 128
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/Q;

    .line 129
    .line 130
    .line 131
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/Q;-><init>(Lcom/sumsub/sns/core/presentation/base/l;)V

    .line 132
    .line 133
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->n:Lcom/sumsub/sns/internal/features/presentation/sumsubid/Q;

    .line 134
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/status/m;)Lkotlin/Unit;
    .locals 9

    .line 36
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->a:Lkotlin/Lazy;

    .line 37
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 38
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->j:Lcom/sumsub/sns/internal/features/data/model/common/p;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 39
    sget-object p0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 40
    iget-object p0, p0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 41
    const-string v0, "SNSApplicantStatusViewModel"

    const-string/jumbo v2, "onAgreementAcceptedFromBottomSheet: applicant is null"

    invoke-virtual {p0, v0, v2, v1}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 42
    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/status/B;

    invoke-direct {v2, p0, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/status/B;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/L;Lcom/sumsub/sns/internal/features/data/model/common/p;Lkotlin/coroutines/Continuation;)V

    const/4 v0, 0x1

    .line 43
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    .line 44
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v3

    new-instance v6, Lcom/sumsub/sns/internal/core/common/e1;

    invoke-direct {v6, v2, p0, v1}, Lcom/sumsub/sns/internal/core/common/e1;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/B;Lcom/sumsub/sns/internal/features/presentation/status/L;Lkotlin/coroutines/Continuation;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 45
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/status/m;Landroid/widget/CompoundButton;Z)Lkotlin/Unit;
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->a:Lkotlin/Lazy;

    .line 2
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 3
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/status/L;->n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/status/L;->o:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 5
    iget-object v3, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 6
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 7
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/status/D;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Lcom/sumsub/sns/internal/features/presentation/status/D;-><init>(ZLkotlin/coroutines/Continuation;)V

    const/4 v3, 0x1

    invoke-static {p1, v2, v0, v3, v1}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    if-eqz p2, :cond_1

    .line 8
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object p0

    sget-object p1, Lcom/sumsub/sns/internal/core/analytics/Control;->SumsubIdPromoCheckbox:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 9
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p2

    .line 10
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/analytics/f;->a:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 11
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/analytics/f;->b:Ljava/lang/String;

    .line 12
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Screen;->Other:Lcom/sumsub/sns/internal/core/analytics/Screen;

    if-ne v0, v3, :cond_0

    goto :goto_0

    .line 13
    :cond_0
    new-instance v3, Lcom/sumsub/sns/internal/core/analytics/g;

    invoke-direct {v3}, Lcom/sumsub/sns/internal/core/analytics/g;-><init>()V

    .line 14
    invoke-virtual {v3, v0, p0, v1}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Popup;)Lcom/sumsub/sns/internal/core/analytics/g;

    move-result-object v1

    .line 15
    iget-object v3, v1, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    iget-object p1, v1, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/ControlAction;->Checked:Lcom/sumsub/sns/internal/core/analytics/ControlAction;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    invoke-static {v0, p0}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;)Ljava/util/LinkedHashMap;

    move-result-object p0

    invoke-static {p0, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    .line 18
    invoke-static {p0}, Lkotlin/collections/MapsKt;->toMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    iput-object p0, v1, Lcom/sumsub/sns/internal/core/analytics/g;->c:Ljava/util/Map;

    .line 19
    invoke-virtual {v1, v2}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Z)V

    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object p0

    sget-object p1, Lcom/sumsub/sns/internal/core/analytics/Control;->SumsubIdPromoCheckbox:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 21
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p2

    .line 22
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/analytics/f;->a:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 23
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/analytics/f;->b:Ljava/lang/String;

    .line 24
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Screen;->Other:Lcom/sumsub/sns/internal/core/analytics/Screen;

    if-ne v0, v3, :cond_2

    goto :goto_0

    .line 25
    :cond_2
    new-instance v3, Lcom/sumsub/sns/internal/core/analytics/g;

    invoke-direct {v3}, Lcom/sumsub/sns/internal/core/analytics/g;-><init>()V

    .line 26
    invoke-virtual {v3, v0, p0, v1}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Popup;)Lcom/sumsub/sns/internal/core/analytics/g;

    move-result-object v1

    .line 27
    iget-object v3, v1, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    iget-object p1, v1, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/ControlAction;->Unchecked:Lcom/sumsub/sns/internal/core/analytics/ControlAction;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    invoke-static {v0, p0}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;)Ljava/util/LinkedHashMap;

    move-result-object p0

    invoke-static {p0, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    .line 30
    invoke-static {p0}, Lkotlin/collections/MapsKt;->toMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    iput-object p0, v1, Lcom/sumsub/sns/internal/core/analytics/g;->c:Ljava/util/Map;

    .line 31
    invoke-virtual {v1, v2}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Z)V

    .line 32
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/status/m;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->a:Lkotlin/Lazy;

    .line 34
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 35
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/status/L;->b(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/status/m;Landroid/content/DialogInterface;)V
    .locals 0

    .line 223
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->k:Landroidx/appcompat/app/AlertDialog;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/status/m;Landroid/view/View;)V
    .locals 6

    .line 189
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    .line 190
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object v1

    .line 191
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->b:Ljava/lang/String;

    .line 192
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Control;->ContinueButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 193
    invoke-static {}, Lkotlin/collections/MapsKt;->createMapBuilder()Ljava/util/Map;

    move-result-object p1

    .line 194
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->l:Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;

    invoke-virtual {v4}, Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;->getState()Ljava/lang/String;

    move-result-object v4

    const-string/jumbo v5, "screenState"

    invoke-interface {p1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    invoke-static {p1}, Lkotlin/collections/MapsKt;->build(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    const/16 v5, 0x10

    .line 196
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 197
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->a:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 198
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/status/L;->e()V

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/status/m;Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 146
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    const/4 p2, 0x0

    .line 147
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p4

    if-nez p4, :cond_0

    goto :goto_1

    .line 148
    :cond_0
    invoke-virtual {p4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p6

    instance-of p7, p6, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz p7, :cond_1

    check-cast p6, Landroid/view/ViewGroup$MarginLayoutParams;

    goto :goto_0

    :cond_1
    const/4 p6, 0x0

    :goto_0
    if-nez p6, :cond_2

    goto :goto_1

    .line 149
    :cond_2
    iget-boolean p0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->m:Z

    if-eqz p0, :cond_3

    sub-int/2addr p5, p3

    .line 150
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result p0

    sub-int/2addr p5, p0

    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result p0

    sub-int/2addr p5, p0

    .line 151
    invoke-virtual {p4}, Landroid/view/View;->getHeight()I

    move-result p0

    sub-int/2addr p5, p0

    int-to-float p0, p5

    const/high16 p1, 0x3e800000    # 0.25f

    mul-float/2addr p0, p1

    invoke-static {p0}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result p0

    invoke-static {p0, p2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result p2

    .line 152
    :cond_3
    iget p0, p6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-eq p0, p2, :cond_4

    .line 153
    iput p2, p6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 154
    invoke-virtual {p4, p6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/status/m;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 6

    .line 229
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    move-result-object p1

    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v0

    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    move-result-object v1

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/status/e;

    const/4 p1, 0x0

    invoke-direct {v3, p2, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/status/e;-><init>(Landroid/os/Bundle;Lcom/sumsub/sns/internal/features/presentation/status/m;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/status/m;Ljava/util/Map;Landroid/content/DialogInterface;)V
    .locals 2

    .line 224
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object p2

    .line 225
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object v0

    .line 226
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->b:Ljava/lang/String;

    .line 227
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Popup;->VerificationExitPopup:Lcom/sumsub/sns/internal/core/analytics/Popup;

    .line 228
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, p0, p1, v1}, Lcom/sumsub/sns/internal/core/analytics/f;->b(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;)V

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/status/m;Ljava/util/Map;Landroid/content/DialogInterface;I)V
    .locals 3

    .line 213
    invoke-interface {p2}, Landroid/content/DialogInterface;->dismiss()V

    .line 214
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object p2

    .line 215
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object p3

    .line 216
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->b:Ljava/lang/String;

    .line 217
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Control;->ConfirmButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 218
    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/Popup;->VerificationExitPopup:Lcom/sumsub/sns/internal/core/analytics/Popup;

    .line 219
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p3, v0, v1, p1, v2}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;)V

    .line 220
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAppListener$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/common/u0;

    move-result-object p0

    if-eqz p0, :cond_0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;

    .line 221
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    invoke-virtual {p0}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 222
    sget-object p1, Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;->INSTANCE:Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->a(Lcom/sumsub/sns/core/data/model/SNSCompletionResult;Z)V

    :cond_0
    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/status/m;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 3

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/status/M;

    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/status/M;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/m;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/status/m;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 12
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->n:Lcom/sumsub/sns/internal/features/presentation/sumsubid/Q;

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->r()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/status/m;Landroid/view/View;)V
    .locals 6

    .line 2
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object v1

    .line 4
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->b:Ljava/lang/String;

    .line 5
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Control;->ContinueButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 6
    invoke-static {}, Lkotlin/collections/MapsKt;->createMapBuilder()Ljava/util/Map;

    move-result-object p1

    .line 7
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->l:Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;

    invoke-virtual {v4}, Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;->getState()Ljava/lang/String;

    move-result-object v4

    const-string/jumbo v5, "screenState"

    invoke-interface {p1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    invoke-static {p1}, Lkotlin/collections/MapsKt;->build(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    const/16 v5, 0x10

    .line 9
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 10
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->a:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 11
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/status/L;->e()V

    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/status/m;Ljava/util/Map;Landroid/content/DialogInterface;)V
    .locals 2

    .line 20
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object p2

    .line 21
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object v0

    .line 22
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->b:Ljava/lang/String;

    .line 23
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Popup;->VerificationExitPopup:Lcom/sumsub/sns/internal/core/analytics/Popup;

    .line 24
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, p0, p1, v1}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;)V

    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/status/m;Ljava/util/Map;Landroid/content/DialogInterface;I)V
    .locals 2

    .line 13
    invoke-interface {p2}, Landroid/content/DialogInterface;->dismiss()V

    .line 14
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object p2

    .line 15
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object p3

    .line 16
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->b:Ljava/lang/String;

    .line 17
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Control;->CancelButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 18
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Popup;->VerificationExitPopup:Lcom/sumsub/sns/internal/core/analytics/Popup;

    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p3, p0, v0, p1, v1}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;)V

    return-void
.end method

.method public static final c(Lcom/sumsub/sns/internal/features/presentation/status/m;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/status/L;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    return-object p0
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
.method public final a(Lcom/sumsub/sns/internal/features/presentation/status/S;)V
    .locals 11

    .line 155
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 156
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->h:Lcom/sumsub/sns/internal/core/common/L;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/status/m;->p:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x5

    aget-object v3, v1, v2

    invoke-virtual {v0, p0, v3}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/widget/NestedScrollView;

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    .line 157
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 158
    :cond_0
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getInstructionsViewHandler()Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;

    move-result-object v4

    const/4 v0, 0x0

    if-eqz v4, :cond_1

    .line 159
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v5

    .line 160
    sget-object v6, Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;->VIDEO_IDENT:Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;

    invoke-virtual {v6}, Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;->getSceneName()Ljava/lang/String;

    move-result-object v8

    .line 161
    sget-object v6, Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler$Position;->FULLSCREEN:Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler$Position;

    invoke-virtual {v6}, Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler$Position;->getValue()Ljava/lang/String;

    move-result-object v9

    const/4 v7, 0x0

    const/4 v10, 0x0

    .line 162
    const-string v6, "VIDEO_IDENT"

    invoke-interface/range {v4 .. v10}, Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;->onVerificationStep(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    move-result-object v4

    goto :goto_0

    :cond_1
    move-object v4, v0

    :goto_0
    if-eqz v4, :cond_4

    .line 163
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->h:Lcom/sumsub/sns/internal/core/common/L;

    aget-object v1, v1, v2

    invoke-virtual {v3, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/core/widget/NestedScrollView;

    if-eqz v1, :cond_2

    .line 164
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 165
    new-instance v2, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v3, -0x1

    const/4 v5, -0x2

    .line 166
    invoke-direct {v2, v3, v5}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 167
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v5, Lcom/sumsub/sns/R$dimen;->sns_margin_medium:I

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    .line 168
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 169
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 170
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 171
    invoke-virtual {v1, v4, v2}, Landroidx/core/widget/NestedScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 172
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_5

    sget v2, Lcom/sumsub/sns/R$id;->sns_primary_button:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    if-eqz v1, :cond_5

    .line 173
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/status/S;->h:Ljava/util/Map;

    .line 174
    const-string v3, "actionTitle"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_3

    move-object v0, v2

    check-cast v0, Ljava/lang/String;

    :cond_3
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 175
    :cond_4
    new-instance v0, Lcom/sumsub/sns/core/presentation/intro/b;

    .line 176
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    move-result-object v1

    .line 177
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/domain/h;->q:Lcom/sumsub/sns/internal/core/domain/d;

    .line 178
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAppListener$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/common/u0;

    move-result-object v2

    .line 179
    invoke-direct {v0, v1, v2, v3}, Lcom/sumsub/sns/core/presentation/intro/b;-><init>(Lcom/sumsub/sns/internal/features/data/repository/extensions/a;Lcom/sumsub/sns/internal/core/common/u0;I)V

    .line 180
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireView()Landroid/view/View;

    move-result-object v1

    .line 181
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/status/S;->h:Ljava/util/Map;

    .line 182
    sget v3, Lcom/sumsub/sns/R$id;->sns_content:I

    .line 183
    sget v4, Lcom/sumsub/sns/R$id;->sns_primary_button:I

    .line 184
    invoke-static {v0, v1, v2, v3, v4}, Lcom/sumsub/sns/core/presentation/intro/b;->a(Lcom/sumsub/sns/core/presentation/intro/b;Landroid/view/View;Ljava/util/Map;II)V

    .line 185
    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->f:Lcom/sumsub/sns/internal/core/common/L;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/status/m;->p:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    if-eqz v0, :cond_6

    .line 186
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/status/r0;

    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/status/r0;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/m;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 187
    :cond_6
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/status/S;->i:Lcom/sumsub/sns/internal/features/presentation/status/b;

    if-eqz p1, :cond_7

    .line 188
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/status/m;->a(Lcom/sumsub/sns/internal/features/presentation/status/b;)V

    :cond_7
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/status/T;)V
    .locals 10

    .line 46
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->c:Lcom/sumsub/sns/internal/core/common/L;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/status/m;->p:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v3, v1, v2

    invoke-virtual {v0, p0, v3}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/4 v3, 0x0

    const/16 v4, 0x8

    if-eqz v0, :cond_3

    .line 47
    iget-object v5, p1, Lcom/sumsub/sns/internal/features/presentation/status/T;->a:Ljava/lang/CharSequence;

    if-eqz v5, :cond_1

    .line 48
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    move v5, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v5, v4

    .line 49
    :goto_1
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 50
    iget-object v5, p1, Lcom/sumsub/sns/internal/features/presentation/status/T;->a:Ljava/lang/CharSequence;

    if-eqz v5, :cond_2

    .line 51
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v5

    goto :goto_2

    :cond_2
    move-object v5, v3

    :goto_2
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    :cond_3
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->d:Lcom/sumsub/sns/internal/core/common/L;

    const/4 v5, 0x1

    aget-object v6, v1, v5

    invoke-virtual {v0, p0, v6}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_7

    .line 53
    iget-object v6, p1, Lcom/sumsub/sns/internal/features/presentation/status/T;->b:Ljava/lang/CharSequence;

    if-eqz v6, :cond_5

    .line 54
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-nez v6, :cond_4

    goto :goto_3

    :cond_4
    move v6, v2

    goto :goto_4

    :cond_5
    :goto_3
    move v6, v4

    .line 55
    :goto_4
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 56
    iget-object v6, p1, Lcom/sumsub/sns/internal/features/presentation/status/T;->b:Ljava/lang/CharSequence;

    if-eqz v6, :cond_6

    .line 57
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v6

    goto :goto_5

    :cond_6
    move-object v6, v3

    :goto_5
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    :cond_7
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->e:Lcom/sumsub/sns/internal/core/common/L;

    const/4 v6, 0x2

    aget-object v6, v1, v6

    invoke-virtual {v0, p0, v6}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_b

    .line 59
    iget-object v6, p1, Lcom/sumsub/sns/internal/features/presentation/status/T;->c:Ljava/lang/CharSequence;

    if-eqz v6, :cond_9

    .line 60
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-nez v6, :cond_8

    goto :goto_6

    :cond_8
    move v6, v2

    goto :goto_7

    :cond_9
    :goto_6
    move v6, v4

    .line 61
    :goto_7
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 62
    iget-object v6, p1, Lcom/sumsub/sns/internal/features/presentation/status/T;->c:Ljava/lang/CharSequence;

    if-eqz v6, :cond_a

    .line 63
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v6

    goto :goto_8

    :cond_a
    move-object v6, v3

    :goto_8
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/status/o0;

    invoke-direct {v6, p0}, Lcom/sumsub/sns/internal/features/presentation/status/o0;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/m;)V

    invoke-static {v0, v6}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V

    .line 65
    :cond_b
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->f:Lcom/sumsub/sns/internal/core/common/L;

    const/4 v6, 0x3

    aget-object v7, v1, v6

    invoke-virtual {v0, p0, v7}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    if-eqz v0, :cond_e

    .line 66
    iget-object v7, p1, Lcom/sumsub/sns/internal/features/presentation/status/T;->e:Ljava/lang/CharSequence;

    if-eqz v7, :cond_d

    .line 67
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_c

    goto :goto_9

    :cond_c
    move v7, v2

    goto :goto_a

    :cond_d
    :goto_9
    move v7, v4

    .line 68
    :goto_a
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 69
    iget-object v7, p1, Lcom/sumsub/sns/internal/features/presentation/status/T;->e:Ljava/lang/CharSequence;

    .line 70
    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 71
    :cond_e
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->g:Lcom/sumsub/sns/internal/core/common/L;

    const/4 v7, 0x4

    aget-object v7, v1, v7

    invoke-virtual {v0, p0, v7}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_12

    .line 72
    iget-object v7, p1, Lcom/sumsub/sns/internal/features/presentation/status/T;->d:Ljava/util/List;

    .line 73
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_f

    move v7, v4

    goto :goto_b

    :cond_f
    move v7, v2

    .line 74
    :goto_b
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 75
    iget-object v7, p1, Lcom/sumsub/sns/internal/features/presentation/status/T;->d:Ljava/util/List;

    .line 76
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_12

    .line 77
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v7

    if-nez v7, :cond_10

    .line 78
    new-instance v7, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-direct {v7, v8}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 79
    new-instance v7, Lcom/sumsub/sns/core/presentation/base/adapter/e;

    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/status/d;

    invoke-direct {v8, p0}, Lcom/sumsub/sns/internal/features/presentation/status/d;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/m;)V

    invoke-direct {v7, v8}, Lcom/sumsub/sns/core/presentation/base/adapter/e;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/d;)V

    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 80
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/status/p0;

    invoke-direct {v7, p0}, Lcom/sumsub/sns/internal/features/presentation/status/p0;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/m;)V

    invoke-virtual {v0, v7}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 81
    :cond_10
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    if-eqz v0, :cond_11

    .line 82
    check-cast v0, Lcom/sumsub/sns/core/presentation/base/adapter/e;

    .line 83
    iget-object v7, p1, Lcom/sumsub/sns/internal/features/presentation/status/T;->d:Ljava/util/List;

    .line 84
    iget-object v8, v0, Lcom/sumsub/sns/core/presentation/base/adapter/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v8, v7}, Lcom/sumsub/sns/core/presentation/base/adapter/b;->a(Ljava/util/ArrayList;Ljava/util/List;)Landroidx/recyclerview/widget/DiffUtil$Callback;

    move-result-object v8

    invoke-static {v8}, Landroidx/recyclerview/widget/DiffUtil;->calculateDiff(Landroidx/recyclerview/widget/DiffUtil$Callback;)Landroidx/recyclerview/widget/DiffUtil$DiffResult;

    move-result-object v8

    .line 85
    iget-object v9, v0, Lcom/sumsub/sns/core/presentation/base/adapter/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    .line 86
    iget-object v9, v0, Lcom/sumsub/sns/core/presentation/base/adapter/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 87
    invoke-virtual {v8, v0}, Landroidx/recyclerview/widget/DiffUtil$DiffResult;->dispatchUpdatesTo(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 88
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/status/Q;

    iput-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->m:Z

    goto :goto_c

    .line 89
    :cond_11
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Required value was null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 90
    :cond_12
    :goto_c
    iput-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->k:Landroidx/appcompat/app/AlertDialog;

    .line 91
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/status/S;

    if-eqz v0, :cond_13

    .line 92
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/status/S;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/status/m;->a(Lcom/sumsub/sns/internal/features/presentation/status/S;)V

    return-void

    .line 93
    :cond_13
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/status/P;

    const/4 v7, 0x5

    if-eqz v0, :cond_14

    .line 94
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->h:Lcom/sumsub/sns/internal/core/common/L;

    aget-object v1, v1, v7

    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/widget/NestedScrollView;

    if-eqz v0, :cond_16

    .line 95
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    .line 96
    sget v4, Lcom/sumsub/sns/R$layout;->sns_layout_applicant_status_reviewing_content:I

    invoke-virtual {v1, v4, v3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 97
    invoke-static {v1}, Lcom/sumsub/sns/databinding/x;->a(Landroid/view/View;)Lcom/sumsub/sns/databinding/x;

    move-result-object v1

    .line 98
    iget-object v3, v1, Lcom/sumsub/sns/databinding/x;->c:Lcom/sumsub/sns/core/widget/SNSH1TextView;

    .line 99
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/status/T;->a:Ljava/lang/CharSequence;

    .line 100
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 101
    iget-object v3, v1, Lcom/sumsub/sns/databinding/x;->b:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 102
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/status/T;->b:Ljava/lang/CharSequence;

    .line 103
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    invoke-virtual {v0, v5}, Landroidx/core/widget/NestedScrollView;->setFillViewport(Z)V

    .line 105
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 106
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 107
    iget-object p1, v1, Lcom/sumsub/sns/databinding/x;->a:Lcom/sumsub/sns/core/widget/SNSBackgroundConstraintLayout;

    .line 108
    new-instance v1, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 109
    invoke-virtual {v0, p1, v1}, Landroidx/core/widget/NestedScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 110
    :cond_14
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->h:Lcom/sumsub/sns/internal/core/common/L;

    aget-object v0, v1, v7

    invoke-virtual {p1, p0, v0}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/core/widget/NestedScrollView;

    if-eqz p1, :cond_15

    .line 111
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 112
    :cond_15
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->f:Lcom/sumsub/sns/internal/core/common/L;

    aget-object v0, v1, v6

    invoke-virtual {p1, p0, v0}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    if-eqz p1, :cond_16

    .line 113
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/status/q0;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/status/q0;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/m;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_16
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/status/b;)V
    .locals 4

    .line 199
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->StatusScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/analytics/Screen;->getText()Ljava/lang/String;

    move-result-object v0

    const-string v1, "fromScreen"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 200
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 201
    new-instance v1, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder;-><init>(Landroid/content/Context;)V

    .line 202
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/status/b;->a:Ljava/lang/CharSequence;

    .line 203
    invoke-virtual {v1, v2}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setMessage(Ljava/lang/CharSequence;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    move-result-object v1

    .line 204
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/status/b;->b:Ljava/lang/CharSequence;

    .line 205
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/status/g0;

    invoke-direct {v3, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/status/g0;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/m;Ljava/util/Map;)V

    invoke-virtual {v1, v2, v3}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    move-result-object v1

    .line 206
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/status/b;->c:Ljava/lang/CharSequence;

    .line 207
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/status/h0;

    invoke-direct {v2, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/status/h0;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/m;Ljava/util/Map;)V

    invoke-virtual {v1, p1, v2}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    move-result-object p1

    .line 208
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/status/i0;

    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/status/i0;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/m;)V

    invoke-virtual {p1, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    move-result-object p1

    .line 209
    invoke-virtual {p1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->create()Landroidx/appcompat/app/AlertDialog;

    move-result-object p1

    .line 210
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/status/j0;

    invoke-direct {v1, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/status/j0;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/m;Ljava/util/Map;)V

    invoke-virtual {p1, v1}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 211
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/status/k0;

    invoke-direct {v1, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/status/k0;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/m;Ljava/util/Map;)V

    invoke-virtual {p1, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 212
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->k:Landroidx/appcompat/app/AlertDialog;

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/status/model/a;)V
    .locals 10

    .line 114
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->i:Lcom/sumsub/sns/internal/core/common/L;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/status/m;->p:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x6

    aget-object v3, v1, v2

    invoke-virtual {v0, p0, v3}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/core/widget/SNSSumsubIdBanner;

    if-eqz v0, :cond_6

    .line 115
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/status/model/a;->a:Lcom/sumsub/sns/internal/features/presentation/status/U;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    .line 116
    iget-boolean v3, p1, Lcom/sumsub/sns/internal/features/presentation/status/model/a;->b:Z

    if-nez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    if-eqz v3, :cond_1

    .line 117
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v5

    if-eqz v5, :cond_1

    .line 118
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v5

    sget-object v6, Lcom/sumsub/sns/internal/core/analytics/Block;->SumsubIdPromoBlock:Lcom/sumsub/sns/internal/core/analytics/Block;

    .line 119
    invoke-static {}, Lkotlin/collections/MapsKt;->createMapBuilder()Ljava/util/Map;

    move-result-object v7

    .line 120
    iget-object v8, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->l:Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;

    invoke-virtual {v8}, Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;->getState()Ljava/lang/String;

    move-result-object v8

    const-string/jumbo v9, "screenState"

    invoke-interface {v7, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    invoke-static {v7}, Lkotlin/collections/MapsKt;->build(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v7

    .line 122
    invoke-static {v5, v6, v7}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Block;Ljava/util/Map;)V

    :cond_1
    if-nez v3, :cond_2

    const/16 v4, 0x8

    .line 123
    :cond_2
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 124
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/status/model/a;->a:Lcom/sumsub/sns/internal/features/presentation/status/U;

    if-eqz p1, :cond_6

    .line 125
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/status/U;->a:Ljava/lang/CharSequence;

    .line 126
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/status/U;->b:Ljava/lang/CharSequence;

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    .line 127
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v4, v6}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v4

    goto :goto_1

    :cond_3
    move-object v4, v5

    .line 128
    :goto_1
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/status/s0;

    invoke-direct {v6, p0}, Lcom/sumsub/sns/internal/features/presentation/status/s0;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/m;)V

    invoke-virtual {v0, v3, v4, v6}, Lcom/sumsub/sns/core/widget/SNSSumsubIdBanner;->setText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)V

    .line 129
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/presentation/status/U;->c:Z

    .line 130
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->i:Lcom/sumsub/sns/internal/core/common/L;

    aget-object v3, v1, v2

    invoke-virtual {v0, p0, v3}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/core/widget/SNSSumsubIdBanner;

    if-eqz v0, :cond_4

    .line 131
    invoke-virtual {v0, v5}, Lcom/sumsub/sns/core/widget/SNSSumsubIdBanner;->setOnCheckedChanged(Lkotlin/jvm/functions/Function2;)V

    .line 132
    :cond_4
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->i:Lcom/sumsub/sns/internal/core/common/L;

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/core/widget/SNSSumsubIdBanner;

    if-eqz v0, :cond_5

    .line 133
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/core/widget/SNSSumsubIdBanner;->setIsChecked(Z)V

    .line 134
    :cond_5
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/status/m;->f()V

    :cond_6
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/status/q;)V
    .locals 5

    .line 135
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->j:Lcom/sumsub/sns/internal/core/common/L;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/status/m;->p:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x7

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    if-nez v0, :cond_0

    return-void

    .line 136
    :cond_0
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->a:Lkotlin/Lazy;

    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 137
    invoke-virtual {v1}, Lcom/sumsub/sns/core/presentation/base/M0;->getViewModelInternalState()Lkotlinx/coroutines/flow/w;

    move-result-object v1

    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/core/presentation/base/t0;

    .line 138
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/status/a;

    .line 139
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/status/m0;

    invoke-direct {v3, p0}, Lcom/sumsub/sns/internal/features/presentation/status/m0;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/m;)V

    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/status/n0;

    invoke-direct {v4, p0}, Lcom/sumsub/sns/internal/features/presentation/status/n0;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/m;)V

    .line 140
    invoke-direct {v2, v0, v3, v4}, Lcom/sumsub/sns/internal/features/presentation/status/a;-><init>(Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 141
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/status/q;->a:Ljava/lang/CharSequence;

    .line 142
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/status/q;->b:Ljava/lang/CharSequence;

    .line 143
    iget-object v3, v1, Lcom/sumsub/sns/core/presentation/base/t0;->g:Ljava/lang/CharSequence;

    .line 144
    iget-boolean v1, v1, Lcom/sumsub/sns/core/presentation/base/t0;->d:Z

    .line 145
    invoke-virtual {v2, v0, p1, v3, v1}, Lcom/sumsub/sns/internal/features/presentation/status/a;->a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)V

    return-void
.end method

.method public final f()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->i:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/status/m;->p:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x6

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSSumsubIdBanner;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/status/t0;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/status/t0;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/m;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/core/widget/SNSSumsubIdBanner;->setOnCheckedChanged(Lkotlin/jvm/functions/Function2;)V

    .line 24
    :cond_0
    return-void
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

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->b:Ljava/lang/String;

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

.method public final getLayoutId()Ljava/lang/Integer;
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_applicant_status:I

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/collections/MapsKt;->createMapBuilder()Ljava/util/Map;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->l:Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;->getState()Ljava/lang/String;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    const-string/jumbo v2, "screenState"

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lkotlin/collections/MapsKt;->build(Ljava/util/Map;)Ljava/util/Map;

    .line 20
    move-result-object v0

    .line 21
    return-object v0
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

.method public final getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/status/L;

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
    .locals 7

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/status/r;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/status/r;

    .line 7
    .line 8
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/status/r;->a:Ljava/lang/String;

    .line 9
    .line 10
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;-><init>()V

    .line 14
    .line 15
    new-instance v1, Landroid/os/Bundle;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 19
    .line 20
    const-string v2, "ARGS_DATA"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    const-string v1, "TermsAndConditionsBottomSheet"

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/DialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 36
    return-void

    .line 37
    .line 38
    :cond_0
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/status/q;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/status/q;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/status/m;->a(Lcom/sumsub/sns/internal/features/presentation/status/q;)V

    .line 46
    return-void

    .line 47
    .line 48
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/status/o;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;

    .line 53
    .line 54
    .line 55
    invoke-direct {p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string/jumbo v0, "request_key_sumusb_id"

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/core/presentation/base/l;->forResult(Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/base/l;

    .line 62
    move-result-object v2

    .line 63
    const/4 v5, 0x4

    .line 64
    const/4 v6, 0x0

    .line 65
    .line 66
    const-string v3, "SNSSumsubIdFragment"

    .line 67
    const/4 v4, 0x0

    .line 68
    move-object v1, p0

    .line 69
    .line 70
    .line 71
    invoke-static/range {v1 .. v6}, Lcom/sumsub/sns/core/presentation/base/l;->navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 72
    return-void

    .line 73
    .line 74
    :cond_2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/status/p;

    .line 75
    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAppListener$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/common/u0;

    .line 80
    move-result-object p1

    .line 81
    .line 82
    if-eqz p1, :cond_3

    .line 83
    .line 84
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;

    .line 85
    .line 86
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    .line 90
    move-result-object p1

    .line 91
    .line 92
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 93
    const/4 v0, 0x1

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->d(Z)V

    .line 97
    :cond_3
    return-void

    .line 98
    .line 99
    .line 100
    :cond_4
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 101
    return-void
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
.end method

.method public final bridge synthetic handleState(Lcom/sumsub/sns/core/presentation/base/s;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/status/T;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/status/m;->a(Lcom/sumsub/sns/internal/features/presentation/status/T;)V

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

.method public final onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z
    .locals 12

    .line 1
    .line 2
    instance-of p1, p1, Lcom/sumsub/sns/internal/core/common/u;

    .line 3
    .line 4
    if-eqz p1, :cond_2

    .line 5
    .line 6
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->a:Lkotlin/Lazy;

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/base/M0;->currentState()Lcom/sumsub/sns/core/presentation/base/s;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/status/T;

    .line 19
    .line 20
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/presentation/status/T;->f:Z

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/g;->g:Lcom/sumsub/sns/internal/features/presentation/exitsurvey/a;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/g;

    .line 30
    .line 31
    .line 32
    invoke-direct {v1}, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/g;-><init>()V

    .line 33
    const/4 v4, 0x6

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v2, 0x0

    .line 36
    const/4 v3, 0x0

    .line 37
    move-object v0, p0

    .line 38
    .line 39
    .line 40
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/core/presentation/base/l;->navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v0, p0

    .line 43
    .line 44
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/status/m;->k:Landroidx/appcompat/app/AlertDialog;

    .line 45
    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    sget-object v1, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder;->Companion:Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder$Companion;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1}, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder$Companion;->showWithThemeExtension(Landroidx/appcompat/app/AlertDialog;)V

    .line 52
    goto :goto_0

    .line 53
    .line 54
    :cond_1
    new-instance v7, Lcom/sumsub/sns/internal/core/common/v;

    .line 55
    .line 56
    .line 57
    invoke-direct {v7}, Lcom/sumsub/sns/internal/core/common/v;-><init>()V

    .line 58
    const/4 v10, 0x6

    .line 59
    const/4 v11, 0x0

    .line 60
    const/4 v8, 0x0

    .line 61
    const/4 v9, 0x0

    .line 62
    move-object v6, v0

    .line 63
    .line 64
    .line 65
    invoke-static/range {v6 .. v11}, Lcom/sumsub/sns/core/presentation/base/l;->finish$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;ILjava/lang/Object;)V

    .line 66
    :goto_0
    const/4 p1, 0x0

    .line 67
    return p1

    .line 68
    .line 69
    .line 70
    :cond_2
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->e()V

    .line 71
    const/4 p1, 0x1

    .line 72
    return p1
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;->Loading:Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;

    .line 3
    .line 4
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->l:Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/base/I;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/status/f0;

    .line 18
    .line 19
    .line 20
    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/features/presentation/status/f0;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/m;)V

    .line 21
    .line 22
    .line 23
    const-string/jumbo v0, "request_key_sumusb_id"

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0, p0, p2}, Landroidx/fragment/app/FragmentManager;->setFragmentResultListener(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroidx/fragment/app/FragmentResultListener;)V

    .line 27
    .line 28
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->a:Lkotlin/Lazy;

    .line 29
    .line 30
    .line 31
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 35
    .line 36
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/status/L;->h:Lkotlinx/coroutines/flow/e;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 40
    move-result-object p2

    .line 41
    .line 42
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/status/f;

    .line 43
    const/4 v1, 0x0

    .line 44
    .line 45
    .line 46
    invoke-direct {v0, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/status/f;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/m;Lkotlin/coroutines/Continuation;)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1, p2, v0}, Lcom/sumsub/sns/internal/core/common/U;->b(Lkotlinx/coroutines/flow/e;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 50
    .line 51
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;->a:Lkotlin/Lazy;

    .line 52
    .line 53
    .line 54
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 58
    .line 59
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/status/L;->i:Lkotlinx/coroutines/flow/e;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 63
    move-result-object p2

    .line 64
    .line 65
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/status/g;

    .line 66
    .line 67
    .line 68
    invoke-direct {v0, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/status/g;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/m;Lkotlin/coroutines/Continuation;)V

    .line 69
    .line 70
    .line 71
    invoke-static {p1, p2, v0}, Lcom/sumsub/sns/internal/core/common/U;->b(Lkotlinx/coroutines/flow/e;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/status/m;->f()V

    .line 75
    return-void
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
.end method
