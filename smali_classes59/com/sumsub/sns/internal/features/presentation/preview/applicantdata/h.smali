.class public final Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;
.super Lcom/sumsub/sns/internal/features/presentation/preview/a;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/presentation/form/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/internal/features/presentation/preview/a<",
        "Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/l;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;",
        ">;",
        "Lcom/sumsub/sns/internal/core/presentation/form/d;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/a;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/l;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;",
        "Lcom/sumsub/sns/internal/core/presentation/form/d;",
        "<init>",
        "()V",
        "com/sumsub/sns/internal/features/presentation/preview/applicantdata/b",
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
        "SMAP\nSNSApplicantDataDocumentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSApplicantDataDocumentFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/applicantdata/SNSApplicantDataDocumentFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n*L\n1#1,125:1\n106#2,15:126\n27#3,4:141\n1#4:145\n277#5,2:146\n54#6,8:148\n*S KotlinDebug\n*F\n+ 1 SNSApplicantDataDocumentFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/applicantdata/SNSApplicantDataDocumentFragment\n*L\n35#1:126,15\n44#1:141,4\n96#1:146,2\n102#1:148,8\n*E\n"
    }
.end annotation


# static fields
.field public static final f:Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/b;

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
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;

    .line 3
    .line 4
    const-string v1, "btnContinue"

    .line 5
    .line 6
    const-string v2, "getBtnContinue()Landroid/widget/Button;"

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
    const-string/jumbo v4, "tvSubtitle"

    .line 24
    .line 25
    const-string v5, "getTvSubtitle()Landroid/widget/TextView;"

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 29
    move-result-object v4

    .line 30
    .line 31
    .line 32
    const-string/jumbo v5, "vgContent"

    .line 33
    .line 34
    const-string v6, "getVgContent()Landroid/view/ViewGroup;"

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v5, v6, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 38
    move-result-object v0

    .line 39
    const/4 v5, 0x4

    .line 40
    .line 41
    new-array v5, v5, [Lkotlin/reflect/KProperty;

    .line 42
    .line 43
    aput-object v1, v5, v3

    .line 44
    const/4 v1, 0x1

    .line 45
    .line 46
    aput-object v2, v5, v1

    .line 47
    const/4 v1, 0x2

    .line 48
    .line 49
    aput-object v4, v5, v1

    .line 50
    const/4 v1, 0x3

    .line 51
    .line 52
    aput-object v0, v5, v1

    .line 53
    .line 54
    sput-object v5, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->g:[Lkotlin/reflect/KProperty;

    .line 55
    .line 56
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/b;

    .line 57
    .line 58
    .line 59
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/b;-><init>()V

    .line 60
    .line 61
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->f:Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/b;

    .line 62
    return-void
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
    invoke-direct {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/a;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/a0;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/a0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;)V

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/c;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/c;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;)V

    .line 14
    .line 15
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 16
    .line 17
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/d;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/d;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/c;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/e;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/e;-><init>(Lkotlin/Lazy;)V

    .line 36
    .line 37
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/f;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/f;-><init>(Lkotlin/Lazy;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->a:Lkotlin/Lazy;

    .line 47
    .line 48
    sget v0, Lcom/sumsub/sns/R$id;->sns_primary_button:I

    .line 49
    .line 50
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 54
    .line 55
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->b:Lcom/sumsub/sns/internal/core/common/L;

    .line 56
    .line 57
    sget v0, Lcom/sumsub/sns/R$id;->sns_title:I

    .line 58
    .line 59
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 60
    .line 61
    .line 62
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 63
    .line 64
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->c:Lcom/sumsub/sns/internal/core/common/L;

    .line 65
    .line 66
    sget v0, Lcom/sumsub/sns/R$id;->sns_subtitle:I

    .line 67
    .line 68
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 69
    .line 70
    .line 71
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 72
    .line 73
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->d:Lcom/sumsub/sns/internal/core/common/L;

    .line 74
    .line 75
    sget v0, Lcom/sumsub/sns/R$id;->sns_content:I

    .line 76
    .line 77
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 78
    .line 79
    .line 80
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 81
    .line 82
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->e:Lcom/sumsub/sns/internal/core/common/L;

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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 4

    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/B;

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "ARGS_DOCUMENT"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 4
    :goto_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    move-result-object v2

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v3

    .line 6
    invoke-direct {v0, v1, p0, v2, v3}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/B;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;Landroid/view/View;)V
    .locals 6

    .line 7
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    .line 8
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object v1

    .line 9
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->getIdDocSetType()Ljava/lang/String;

    move-result-object v2

    .line 10
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Control;->ContinueButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    const/4 v4, 0x0

    const/16 v5, 0x18

    .line 11
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 12
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/view/View;)V

    .line 13
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->a:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    const-string/jumbo p1, "submitApplicantData"

    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/a;->a(Ljava/lang/String;)V

    .line 16
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v0

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/u;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/u;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method


# virtual methods
.method public final a()Lcom/sumsub/sns/internal/core/presentation/form/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->a:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;

    return-object v0
.end method

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 4

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
    const-class v1, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    const-string v3, "ARGS_DOCUMENT"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/core/common/b;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Landroid/content/Context;)Landroid/os/Parcelable;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-object v0

    .line 32
    .line 33
    :cond_1
    :goto_0
    const-string v0, "TYPE_UNKNOWN"

    .line 34
    return-object v0
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

.method public final getLayoutId()Ljava/lang/Integer;
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_applicant_data_document:I

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

.method public final getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;

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

.method public final handleState(Lcom/sumsub/sns/core/presentation/base/s;Landroid/os/Bundle;)V
    .locals 5

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/l;

    .line 3
    .line 4
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->e:Lcom/sumsub/sns/internal/core/common/L;

    .line 5
    .line 6
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->g:[Lkotlin/reflect/KProperty;

    .line 7
    const/4 v1, 0x3

    .line 8
    .line 9
    aget-object v2, v0, v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2, p0, v2}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 13
    move-result-object p2

    .line 14
    .line 15
    check-cast p2, Landroid/view/ViewGroup;

    .line 16
    .line 17
    if-nez p2, :cond_0

    .line 18
    goto :goto_1

    .line 19
    .line 20
    :cond_0
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->e:Lcom/sumsub/sns/internal/core/common/L;

    .line 21
    .line 22
    aget-object v3, v0, v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, p0, v3}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    check-cast v2, Landroid/view/ViewGroup;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 38
    move-result v2

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v2}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    instance-of v3, v2, Lcom/sumsub/sns/core/presentation/form/f;

    .line 45
    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    check-cast v2, Lcom/sumsub/sns/core/presentation/form/f;

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const/4 v2, 0x0

    .line 51
    .line 52
    :goto_0
    if-nez v2, :cond_2

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 60
    move-result-object v2

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    .line 64
    move-result p2

    .line 65
    .line 66
    sget-object v3, Lcom/sumsub/sns/core/presentation/form/f;->o:Lcom/sumsub/sns/core/presentation/form/b;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->getIdDocSetType()Ljava/lang/String;

    .line 70
    move-result-object v4

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    const-string v3, "AppData"

    .line 76
    .line 77
    .line 78
    invoke-static {v3, v4}, Lcom/sumsub/sns/core/presentation/form/b;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/form/f;

    .line 79
    move-result-object v3

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, p2, v3}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Landroidx/fragment/app/FragmentTransaction;->commitNowAllowingStateLoss()V

    .line 86
    .line 87
    :cond_2
    :goto_1
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->c:Lcom/sumsub/sns/internal/core/common/L;

    .line 88
    const/4 v2, 0x1

    .line 89
    .line 90
    aget-object v2, v0, v2

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, p0, v2}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 94
    move-result-object p2

    .line 95
    .line 96
    check-cast p2, Landroid/widget/TextView;

    .line 97
    .line 98
    if-eqz p2, :cond_3

    .line 99
    .line 100
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/l;->c:Ljava/lang/CharSequence;

    .line 101
    .line 102
    .line 103
    invoke-static {p2, v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 104
    .line 105
    :cond_3
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->d:Lcom/sumsub/sns/internal/core/common/L;

    .line 106
    const/4 v2, 0x2

    .line 107
    .line 108
    aget-object v2, v0, v2

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2, p0, v2}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 112
    move-result-object p2

    .line 113
    .line 114
    check-cast p2, Landroid/widget/TextView;

    .line 115
    .line 116
    if-eqz p2, :cond_4

    .line 117
    .line 118
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/l;->d:Ljava/lang/CharSequence;

    .line 119
    .line 120
    .line 121
    invoke-static {p2, v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 122
    .line 123
    :cond_4
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->b:Lcom/sumsub/sns/internal/core/common/L;

    .line 124
    const/4 v2, 0x0

    .line 125
    .line 126
    aget-object v3, v0, v2

    .line 127
    .line 128
    .line 129
    invoke-virtual {p2, p0, v3}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 130
    move-result-object p2

    .line 131
    .line 132
    check-cast p2, Landroid/widget/Button;

    .line 133
    .line 134
    if-eqz p2, :cond_5

    .line 135
    .line 136
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/l;->e:Ljava/lang/CharSequence;

    .line 137
    .line 138
    .line 139
    invoke-static {p2, v3}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 140
    .line 141
    :cond_5
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->e:Lcom/sumsub/sns/internal/core/common/L;

    .line 142
    .line 143
    aget-object v0, v0, v1

    .line 144
    .line 145
    .line 146
    invoke-virtual {p2, p0, v0}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 147
    move-result-object p2

    .line 148
    .line 149
    check-cast p2, Landroid/view/ViewGroup;

    .line 150
    .line 151
    if-eqz p2, :cond_7

    .line 152
    .line 153
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/l;->f:Z

    .line 154
    .line 155
    if-nez p1, :cond_6

    .line 156
    const/4 v2, 0x4

    .line 157
    .line 158
    .line 159
    :cond_6
    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 160
    :cond_7
    return-void
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

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    .line 5
    invoke-super {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/base/I;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 6
    .line 7
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->b:Lcom/sumsub/sns/internal/core/common/L;

    .line 8
    .line 9
    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->g:[Lkotlin/reflect/KProperty;

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    aget-object v3, p2, v2

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p0, v3}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    check-cast p1, Landroid/widget/Button;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/g;

    .line 23
    .line 24
    .line 25
    invoke-direct {v3, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/g;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    .line 30
    :cond_0
    sget-object p1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    .line 34
    move-result-object p1

    .line 35
    const/4 v3, 0x0

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-interface {p1}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    .line 41
    move-result-object p1

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object p1, v3

    .line 44
    .line 45
    :goto_0
    instance-of v4, p1, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 46
    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move-object p1, v3

    .line 52
    .line 53
    :goto_1
    if-eqz p1, :cond_6

    .line 54
    .line 55
    sget-object v4, Lcom/sumsub/sns/core/theme/SNSMetricElement;->SCREEN_HORIZONTAL_MARGIN:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    .line 56
    .line 57
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/theme/p;->d:Ljava/util/Map;

    .line 58
    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Lcom/sumsub/sns/core/theme/SNSMetricElement;->getValue()Ljava/lang/String;

    .line 63
    move-result-object v4

    .line 64
    .line 65
    .line 66
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/theme/j;

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    move-object p1, v3

    .line 72
    .line 73
    :goto_2
    instance-of v4, p1, Lcom/sumsub/sns/internal/core/presentation/theme/d;

    .line 74
    .line 75
    if-eqz v4, :cond_4

    .line 76
    .line 77
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/theme/d;

    .line 78
    goto :goto_3

    .line 79
    :cond_4
    move-object p1, v3

    .line 80
    .line 81
    :goto_3
    if-eqz p1, :cond_5

    .line 82
    .line 83
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/theme/d;->a:Ljava/lang/Float;

    .line 84
    goto :goto_4

    .line 85
    :cond_5
    move-object p1, v3

    .line 86
    .line 87
    :goto_4
    if-eqz p1, :cond_6

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 91
    move-result p1

    .line 92
    float-to-int p1, p1

    .line 93
    .line 94
    .line 95
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    move-result-object v4

    .line 97
    .line 98
    .line 99
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    move-result-object p1

    .line 101
    .line 102
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->b:Lcom/sumsub/sns/internal/core/common/L;

    .line 103
    .line 104
    aget-object v6, p2, v2

    .line 105
    .line 106
    .line 107
    invoke-virtual {v5, p0, v6}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 108
    move-result-object v5

    .line 109
    .line 110
    check-cast v5, Landroid/widget/Button;

    .line 111
    .line 112
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->c:Lcom/sumsub/sns/internal/core/common/L;

    .line 113
    .line 114
    aget-object v7, p2, v1

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6, p0, v7}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 118
    move-result-object v6

    .line 119
    .line 120
    check-cast v6, Landroid/widget/TextView;

    .line 121
    .line 122
    iget-object v7, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->d:Lcom/sumsub/sns/internal/core/common/L;

    .line 123
    .line 124
    aget-object p2, p2, v0

    .line 125
    .line 126
    .line 127
    invoke-virtual {v7, p0, p2}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 128
    move-result-object p2

    .line 129
    .line 130
    check-cast p2, Landroid/widget/TextView;

    .line 131
    const/4 v7, 0x3

    .line 132
    .line 133
    new-array v7, v7, [Landroid/view/View;

    .line 134
    .line 135
    aput-object v5, v7, v2

    .line 136
    .line 137
    aput-object v6, v7, v1

    .line 138
    .line 139
    aput-object p2, v7, v0

    .line 140
    .line 141
    .line 142
    invoke-static {v4, p1, v3, v7}, Lcom/sumsub/sns/internal/core/common/h;->a(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;[Landroid/view/View;)V

    .line 143
    :cond_6
    return-void
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
