.class public final Lcom/sumsub/sns/internal/features/presentation/esign/h;
.super Lcom/sumsub/sns/core/presentation/base/I;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/presentation/form/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/core/presentation/base/I<",
        "Lcom/sumsub/sns/internal/features/presentation/esign/x;",
        "Lcom/sumsub/sns/internal/features/presentation/esign/n0;",
        ">;",
        "Lcom/sumsub/sns/internal/core/presentation/form/d;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/esign/h;",
        "Lcom/sumsub/sns/core/presentation/base/I;",
        "Lcom/sumsub/sns/internal/features/presentation/esign/x;",
        "Lcom/sumsub/sns/internal/features/presentation/esign/n0;",
        "Lcom/sumsub/sns/internal/core/presentation/form/d;",
        "<init>",
        "()V",
        "com/sumsub/sns/internal/features/presentation/esign/b",
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
        "SMAP\nSNSESignFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSESignFragment.kt\ncom/sumsub/sns/internal/features/presentation/esign/SNSESignFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,310:1\n106#2,15:311\n28#3,12:326\n50#3,12:338\n50#3,12:350\n256#4,2:362\n298#4,2:364\n298#4,2:366\n256#4,2:368\n256#4,2:370\n*S KotlinDebug\n*F\n+ 1 SNSESignFragment.kt\ncom/sumsub/sns/internal/features/presentation/esign/SNSESignFragment\n*L\n43#1:311,15\n209#1:326,12\n218#1:338,12\n236#1:350,12\n249#1:362,2\n270#1:364,2\n273#1:366,2\n292#1:368,2\n260#1:370,2\n*E\n"
    }
.end annotation


# static fields
.field public static final g:Lcom/sumsub/sns/internal/features/presentation/esign/b;

.field public static final synthetic h:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Lkotlin/Lazy;

.field public final b:Lcom/sumsub/sns/internal/core/common/L;

.field public c:Landroid/view/ViewGroup;

.field public final d:Lcom/sumsub/sns/internal/core/common/L;

.field public final e:Lcom/sumsub/sns/internal/core/common/L;

.field public f:Lcom/sumsub/sns/internal/features/presentation/esign/j;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/esign/h;

    .line 3
    .line 4
    const-string v1, "bottomSheet"

    .line 5
    .line 6
    const-string v2, "getBottomSheet()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;"

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
    const-string v2, "button"

    .line 14
    .line 15
    const-string v4, "getButton()Landroid/widget/Button;"

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    const-string v4, "content"

    .line 22
    .line 23
    const-string v5, "getContent()Landroid/view/ViewGroup;"

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 27
    move-result-object v0

    .line 28
    const/4 v4, 0x3

    .line 29
    .line 30
    new-array v4, v4, [Lkotlin/reflect/KProperty;

    .line 31
    .line 32
    aput-object v1, v4, v3

    .line 33
    const/4 v1, 0x1

    .line 34
    .line 35
    aput-object v2, v4, v1

    .line 36
    const/4 v1, 0x2

    .line 37
    .line 38
    aput-object v0, v4, v1

    .line 39
    .line 40
    sput-object v4, Lcom/sumsub/sns/internal/features/presentation/esign/h;->h:[Lkotlin/reflect/KProperty;

    .line 41
    .line 42
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/b;

    .line 43
    .line 44
    .line 45
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/esign/b;-><init>()V

    .line 46
    .line 47
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->g:Lcom/sumsub/sns/internal/features/presentation/esign/b;

    .line 48
    return-void
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

.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/I;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/o0;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/esign/o0;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/h;)V

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/esign/c;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/esign/c;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/h;)V

    .line 14
    .line 15
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 16
    .line 17
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/esign/d;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/esign/d;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/c;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/esign/e;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/esign/e;-><init>(Lkotlin/Lazy;)V

    .line 36
    .line 37
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/esign/f;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/esign/f;-><init>(Lkotlin/Lazy;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->a:Lkotlin/Lazy;

    .line 47
    .line 48
    sget v0, Lcom/sumsub/sns/R$id;->sns_esign_bottom_sheet:I

    .line 49
    .line 50
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 54
    .line 55
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->b:Lcom/sumsub/sns/internal/core/common/L;

    .line 56
    .line 57
    sget v0, Lcom/sumsub/sns/R$id;->sns_button:I

    .line 58
    .line 59
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 60
    .line 61
    .line 62
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 63
    .line 64
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->d:Lcom/sumsub/sns/internal/core/common/L;

    .line 65
    .line 66
    sget v0, Lcom/sumsub/sns/R$id;->sns_content:I

    .line 67
    .line 68
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 69
    .line 70
    .line 71
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 72
    .line 73
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->e:Lcom/sumsub/sns/internal/core/common/L;

    .line 74
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/esign/h;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 3

    .line 29
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/a;

    .line 30
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    move-result-object v1

    .line 31
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    .line 32
    invoke-direct {v0, p0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/esign/a;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/h;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/esign/h;Z)Lkotlin/Unit;
    .locals 4

    const-string v0, "SNSESignViewModel"

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->a:Lkotlin/Lazy;

    .line 3
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    sget-object p0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 6
    iget-object p0, p0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 7
    const-string/jumbo p1, "onBottomSheetShown"

    invoke-virtual {p0, v0, p1, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->a:Lkotlin/Lazy;

    .line 9
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 12
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 13
    const-string/jumbo v3, "onBottomSheetDismissed"

    invoke-virtual {v2, v0, v3, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->s:Lkotlinx/coroutines/x1;

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 15
    :cond_1
    iput-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->s:Lkotlinx/coroutines/x1;

    .line 16
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/l0;

    invoke-direct {v0, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/esign/l0;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    const/4 v3, 0x0

    invoke-static {p1, v3, v0, v2, v1}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 17
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/esign/h;->f()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    move-result-object p0

    if-eqz p0, :cond_2

    const/16 p1, 0x8

    .line 18
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 19
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/esign/h;Landroid/view/View;)V
    .locals 3

    .line 20
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->a:Lkotlin/Lazy;

    .line 21
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 24
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 25
    const-string v0, "SNSESignViewModel"

    const-string/jumbo v1, "onBottomSheetDismissClick"

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->s:Lkotlinx/coroutines/x1;

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    invoke-static {p1, v2, v0, v2}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 27
    :cond_0
    iput-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->s:Lkotlinx/coroutines/x1;

    .line 28
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/esign/l0;

    invoke-direct {p1, p0, v2}, Lcom/sumsub/sns/internal/features/presentation/esign/l0;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    const/4 v1, 0x0

    invoke-static {p0, v1, p1, v0, v2}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/esign/h;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 133
    invoke-virtual {p0, p2}, Lcom/sumsub/sns/internal/features/presentation/esign/h;->a(Landroid/os/Bundle;)V

    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/esign/h;Landroid/view/View;)V
    .locals 6

    .line 1
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/view/View;)V

    .line 2
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    .line 3
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->a:Lkotlin/Lazy;

    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 4
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->e()Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object v1

    .line 5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->a:Lkotlin/Lazy;

    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 6
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->getIdDocSetType()Ljava/lang/String;

    move-result-object v2

    .line 7
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Control;->ContinueButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 8
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->a:Lkotlin/Lazy;

    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v4

    const/16 v5, 0x10

    .line 11
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 12
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->a:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 13
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->h()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/sumsub/sns/internal/core/presentation/form/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->a:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    return-object v0
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 12

    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleOtpInputResult: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 135
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 136
    iget-object v2, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 137
    const-string v3, "SNSESignFragment"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v0, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 138
    sget-object v0, Lcom/sumsub/sns/core/presentation/base/l;->Companion:Lcom/sumsub/sns/core/presentation/base/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    const-string v0, "fragment_result_key"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v2, 0xa

    const/4 v3, 0x1

    const/4 v5, 0x0

    const-string v6, "SNSESignViewModel"

    if-eq v0, v2, :cond_1

    const/16 p1, 0xb

    if-eq v0, p1, :cond_0

    return-void

    .line 140
    :cond_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->a:Lkotlin/Lazy;

    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 141
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    iget-object v0, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 143
    const-string/jumbo v1, "onResendCode"

    invoke-virtual {v0, v6, v1, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 144
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/i0;

    invoke-direct {v0, v4}, Lcom/sumsub/sns/internal/features/presentation/esign/i0;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, v5, v0, v3, v4}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 145
    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v6

    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/esign/j0;

    invoke-direct {v9, p1, v4}, Lcom/sumsub/sns/internal/features/presentation/esign/j0;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    .line 146
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->a:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 147
    const-string/jumbo v2, "result_key_code"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    const-string p1, ""

    .line 148
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 150
    const-string/jumbo v2, "onCheckCode"

    invoke-virtual {v1, v6, v2, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 151
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/esign/b0;

    invoke-direct {v1, v4}, Lcom/sumsub/sns/internal/features/presentation/esign/b0;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v5, v1, v3, v4}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 152
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v6

    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/esign/c0;

    invoke-direct {v9, v0, p1, v4}, Lcom/sumsub/sns/internal/features/presentation/esign/c0;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/esign/o;)V
    .locals 6

    .line 153
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/esign/o;->b:Lcom/sumsub/sns/internal/features/presentation/esign/n;

    if-nez p1, :cond_0

    .line 154
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/esign/h;->g()V

    return-void

    .line 155
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/esign/h;->f()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 156
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 157
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->c:Landroid/view/ViewGroup;

    const/4 v2, 0x0

    if-nez v0, :cond_3

    .line 158
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/esign/h;->f()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    move-result-object v0

    if-eqz v0, :cond_2

    sget v3, Lcom/sumsub/sns/R$layout;->sns_esign_bottom_sheet:I

    invoke-virtual {v0, v3}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->inflate(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v2

    :goto_0
    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->c:Landroid/view/ViewGroup;

    .line 159
    :cond_3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/esign/h;->f()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/esign/r0;

    invoke-direct {v3, p0}, Lcom/sumsub/sns/internal/features/presentation/esign/r0;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/h;)V

    invoke-virtual {v0, v3}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->setStateCallback(Lkotlin/jvm/functions/Function1;)V

    .line 160
    :cond_4
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->c:Landroid/view/ViewGroup;

    if-eqz v0, :cond_5

    sget v3, Lcom/sumsub/sns/R$id;->sns_button:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    goto :goto_1

    :cond_5
    move-object v0, v2

    .line 161
    :goto_1
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->c:Landroid/view/ViewGroup;

    if-eqz v3, :cond_6

    sget v4, Lcom/sumsub/sns/R$id;->sns_title:I

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    goto :goto_2

    :cond_6
    move-object v3, v2

    .line 162
    :goto_2
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->c:Landroid/view/ViewGroup;

    if-eqz v4, :cond_7

    sget v5, Lcom/sumsub/sns/R$id;->sns_esign_bottom_progress_bar:I

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/core/widget/SNSProgressBarView;

    goto :goto_3

    :cond_7
    move-object v4, v2

    .line 163
    :goto_3
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->c:Landroid/view/ViewGroup;

    if-eqz v5, :cond_8

    sget v2, Lcom/sumsub/sns/R$id;->sns_warning:I

    invoke-virtual {v5, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/core/widget/SNSWarningView;

    :cond_8
    if-eqz v3, :cond_9

    .line 164
    iget-object v5, p1, Lcom/sumsub/sns/internal/features/presentation/esign/n;->a:Ljava/lang/String;

    .line 165
    invoke-static {v3, v5}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_9
    const/16 v3, 0x8

    if-eqz v4, :cond_b

    .line 166
    iget-boolean v5, p1, Lcom/sumsub/sns/internal/features/presentation/esign/n;->c:Z

    if-nez v5, :cond_a

    move v5, v3

    goto :goto_4

    :cond_a
    move v5, v1

    .line 167
    :goto_4
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_b
    if-eqz v2, :cond_e

    .line 168
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/esign/n;->b:Ljava/lang/String;

    if-eqz v4, :cond_c

    .line 169
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_d

    :cond_c
    move v1, v3

    .line 170
    :cond_d
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_e
    if-eqz v2, :cond_f

    .line 171
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/esign/n;->b:Ljava/lang/String;

    .line 172
    invoke-virtual {v2, v1}, Lcom/sumsub/sns/core/widget/SNSStepView;->setSubtitle(Ljava/lang/CharSequence;)V

    :cond_f
    if-eqz v2, :cond_10

    .line 173
    sget-object v1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v1

    .line 174
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v3

    .line 175
    sget-object v4, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->WARNING:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    invoke-virtual {v4}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    move-result-object v4

    .line 176
    invoke-interface {v1, v3, v4}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/sumsub/sns/core/widget/SNSStepView;->setIconStart(Landroid/graphics/drawable/Drawable;)V

    :cond_10
    if-eqz v0, :cond_11

    .line 177
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/esign/n;->d:Ljava/lang/String;

    .line 178
    invoke-static {v0, p1}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_11
    if-eqz v0, :cond_12

    .line 179
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/esign/s0;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/esign/s0;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/h;)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 180
    :cond_12
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/esign/h;->f()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    move-result-object p1

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->show()V

    :cond_13
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/esign/x;)V
    .locals 10

    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    sget v3, Lcom/sumsub/sns/R$id;->sns_child_content:I

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const/4 v3, 0x0

    if-eqz v1, :cond_1

    .line 35
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v1

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    move-result-object v0

    .line 36
    instance-of v0, v0, Lcom/sumsub/sns/internal/features/presentation/otp/j;

    const-string v1, "SNSESignFragment"

    if-eqz v0, :cond_2

    .line 37
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/esign/x;->a:Lcom/sumsub/sns/internal/features/presentation/esign/p;

    .line 38
    instance-of v0, v0, Lcom/sumsub/sns/internal/features/presentation/esign/u;

    if-nez v0, :cond_3

    .line 39
    :cond_2
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 40
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 41
    iget-object v4, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 42
    invoke-virtual {v4, v1, v0, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 43
    :cond_3
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/esign/x;->a:Lcom/sumsub/sns/internal/features/presentation/esign/p;

    .line 44
    instance-of v0, v0, Lcom/sumsub/sns/internal/features/presentation/esign/s;

    const/4 v4, 0x1

    if-nez v0, :cond_5

    .line 45
    iget-boolean v0, p1, Lcom/sumsub/sns/internal/features/presentation/esign/x;->e:Z

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    move v0, v3

    goto :goto_3

    :cond_5
    :goto_2
    move v0, v4

    .line 46
    :goto_3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAppListener$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/common/u0;

    move-result-object v5

    if-eqz v5, :cond_6

    check-cast v5, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;

    .line 47
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    invoke-virtual {v5}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 48
    invoke-virtual {v5, v0}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->e(Z)V

    .line 49
    :cond_6
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/esign/x;->d:Lcom/sumsub/sns/internal/features/presentation/esign/j;

    .line 50
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->f:Lcom/sumsub/sns/internal/features/presentation/esign/j;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 51
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/esign/h;->b(Lcom/sumsub/sns/internal/features/presentation/esign/x;)V

    .line 52
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/esign/x;->d:Lcom/sumsub/sns/internal/features/presentation/esign/j;

    .line 53
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->f:Lcom/sumsub/sns/internal/features/presentation/esign/j;

    .line 54
    :cond_7
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/esign/x;->a:Lcom/sumsub/sns/internal/features/presentation/esign/p;

    .line 55
    iget-boolean v5, v0, Lcom/sumsub/sns/internal/features/presentation/esign/p;->a:Z

    if-nez v5, :cond_8

    .line 56
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/esign/h;->g()V

    .line 57
    :cond_8
    instance-of v5, v0, Lcom/sumsub/sns/internal/features/presentation/esign/i;

    if-nez v5, :cond_15

    .line 58
    instance-of v5, v0, Lcom/sumsub/sns/internal/features/presentation/esign/o;

    if-nez v5, :cond_15

    .line 59
    instance-of v5, v0, Lcom/sumsub/sns/internal/features/presentation/esign/m;

    if-eqz v5, :cond_9

    goto/16 :goto_b

    .line 60
    :cond_9
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/u;

    if-eqz v1, :cond_1d

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/u;

    .line 61
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    .line 62
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_a

    sget v6, Lcom/sumsub/sns/R$id;->sns_child_content:I

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/view/ViewGroup;

    goto :goto_4

    :cond_a
    move-object v5, v2

    :goto_4
    if-eqz v5, :cond_b

    .line 63
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v5

    goto :goto_5

    :cond_b
    move v5, v3

    :goto_5
    invoke-virtual {v1, v5}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    move-result-object v1

    .line 64
    instance-of v5, v1, Lcom/sumsub/sns/internal/features/presentation/otp/j;

    if-eqz v5, :cond_c

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/otp/j;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->isVisible()Z

    move-result v1

    if-eqz v1, :cond_c

    goto/16 :goto_10

    .line 65
    :cond_c
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->a:Lkotlin/Lazy;

    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 66
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->a:Landroid/os/Bundle;

    if-eqz v1, :cond_d

    .line 67
    const-string v5, "ARG_DOCUMENT"

    const-class v6, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-static {v1, v5, v6, v2}, Lcom/sumsub/sns/internal/core/common/b;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Landroid/content/Context;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    goto :goto_6

    :cond_d
    move-object v1, v2

    :goto_6
    if-nez v1, :cond_e

    goto/16 :goto_10

    .line 68
    :cond_e
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v5

    .line 69
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v6

    if-eqz v6, :cond_f

    sget v7, Lcom/sumsub/sns/R$id;->sns_child_content:I

    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/view/ViewGroup;

    goto :goto_7

    :cond_f
    move-object v6, v2

    :goto_7
    if-eqz v6, :cond_10

    .line 70
    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v6

    goto :goto_8

    :cond_10
    move v6, v3

    :goto_8
    invoke-virtual {v5, v6}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    move-result-object v5

    if-eqz v5, :cond_11

    .line 71
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v6

    .line 72
    invoke-virtual {v6}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v6

    .line 73
    invoke-virtual {v6, v5}, Landroidx/fragment/app/FragmentTransaction;->remove(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 74
    invoke-virtual {v6}, Landroidx/fragment/app/FragmentTransaction;->commitNow()V

    .line 75
    :cond_11
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/otp/j;->g:Lcom/sumsub/sns/internal/features/presentation/otp/c;

    .line 76
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/esign/u;->b:Ljava/lang/String;

    .line 77
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/esign/u;->c:Lcom/sumsub/sns/internal/features/data/model/esign/s;

    if-eqz v7, :cond_12

    .line 78
    new-instance v8, Lcom/sumsub/sns/internal/core/presentation/screen/c;

    .line 79
    iget-object v9, v7, Lcom/sumsub/sns/internal/features/data/model/esign/s;->b:Ljava/lang/Integer;

    .line 80
    iget-object v7, v7, Lcom/sumsub/sns/internal/features/data/model/esign/s;->c:Ljava/lang/Integer;

    .line 81
    invoke-direct {v8, v9, v7}, Lcom/sumsub/sns/internal/core/presentation/screen/c;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    goto :goto_9

    :cond_12
    move-object v8, v2

    .line 82
    :goto_9
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/esign/u;->d:Ljava/lang/String;

    .line 83
    new-instance v7, Lcom/sumsub/sns/internal/core/presentation/screen/d;

    .line 84
    invoke-direct {v7, v6, v8, v0, v2}, Lcom/sumsub/sns/internal/core/presentation/screen/d;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/screen/c;Ljava/lang/String;Ljava/lang/Long;)V

    .line 85
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/otp/j;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/otp/j;-><init>()V

    .line 87
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 88
    const-string v6, "arg_strings_key"

    const-string v8, "esign"

    invoke-virtual {v5, v6, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    const-string v6, "arg_client_tag"

    const-string v8, "ESIGN"

    invoke-virtual {v5, v6, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    const-string v6, "arg_doc"

    invoke-virtual {v5, v6, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 91
    const-string v1, "arg_otp_params"

    invoke-virtual {v5, v1, v7}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 92
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 93
    const-string v1, "esign_otp"

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/core/presentation/base/l;->forResult(Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/base/l;

    move-result-object v0

    .line 94
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    .line 95
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v1

    .line 96
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_13

    sget v6, Lcom/sumsub/sns/R$id;->sns_child_content:I

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/view/ViewGroup;

    goto :goto_a

    :cond_13
    move-object v5, v2

    :goto_a
    if-eqz v5, :cond_14

    .line 97
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v3

    :cond_14
    const-string v5, "SNSOtpInputFragment"

    invoke-virtual {v1, v3, v0, v5}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    .line 98
    invoke-virtual {v1, v5}, Landroidx/fragment/app/FragmentTransaction;->addToBackStack(Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    .line 99
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    goto/16 :goto_10

    .line 100
    :cond_15
    :goto_b
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v5

    .line 101
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v6

    if-eqz v6, :cond_16

    sget v7, Lcom/sumsub/sns/R$id;->sns_child_content:I

    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/view/ViewGroup;

    goto :goto_c

    :cond_16
    move-object v6, v2

    :goto_c
    if-eqz v6, :cond_17

    .line 102
    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v6

    goto :goto_d

    :cond_17
    move v6, v3

    :goto_d
    invoke-virtual {v5, v6}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    move-result-object v5

    if-eqz v5, :cond_18

    .line 103
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v6

    .line 104
    invoke-virtual {v6}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v6

    .line 105
    invoke-virtual {v6, v5}, Landroidx/fragment/app/FragmentTransaction;->remove(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 106
    invoke-virtual {v6}, Landroidx/fragment/app/FragmentTransaction;->commitNow()V

    .line 107
    :cond_18
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v5

    .line 108
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->e:Lcom/sumsub/sns/internal/core/common/L;

    sget-object v7, Lcom/sumsub/sns/internal/features/presentation/esign/h;->h:[Lkotlin/reflect/KProperty;

    const/4 v8, 0x2

    aget-object v9, v7, v8

    invoke-virtual {v6, p0, v9}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/ViewGroup;

    if-eqz v6, :cond_19

    .line 109
    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v6

    goto :goto_e

    :cond_19
    move v6, v3

    :goto_e
    invoke-virtual {v5, v6}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    move-result-object v5

    instance-of v6, v5, Lcom/sumsub/sns/core/presentation/form/f;

    if-eqz v6, :cond_1a

    check-cast v5, Lcom/sumsub/sns/core/presentation/form/f;

    goto :goto_f

    :cond_1a
    move-object v5, v2

    :goto_f
    if-nez v5, :cond_1c

    .line 110
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v5

    .line 111
    invoke-virtual {v5}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v5

    .line 112
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->e:Lcom/sumsub/sns/internal/core/common/L;

    aget-object v7, v7, v8

    invoke-virtual {v6, p0, v7}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/ViewGroup;

    if-eqz v6, :cond_1b

    .line 113
    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v3

    .line 114
    :cond_1b
    sget-object v6, Lcom/sumsub/sns/core/presentation/form/f;->o:Lcom/sumsub/sns/core/presentation/form/b;

    .line 115
    iget-object v7, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->a:Lkotlin/Lazy;

    invoke-interface {v7}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 116
    invoke-virtual {v7}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->getIdDocSetType()Ljava/lang/String;

    move-result-object v7

    .line 117
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v7}, Lcom/sumsub/sns/core/presentation/form/b;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/form/f;

    move-result-object v1

    .line 118
    invoke-virtual {v5, v3, v1}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 119
    invoke-virtual {v5}, Landroidx/fragment/app/FragmentTransaction;->commitNow()V

    .line 120
    :cond_1c
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/o;

    if-eqz v1, :cond_1d

    .line 121
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/o;

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/esign/h;->a(Lcom/sumsub/sns/internal/features/presentation/esign/o;)V

    .line 122
    :cond_1d
    :goto_10
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->d:Lcom/sumsub/sns/internal/core/common/L;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/esign/h;->h:[Lkotlin/reflect/KProperty;

    aget-object v3, v1, v4

    invoke-virtual {v0, p0, v3}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    if-eqz v0, :cond_1e

    .line 123
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/esign/x;->b:Ljava/lang/String;

    .line 124
    invoke-static {v0, v3}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 125
    :cond_1e
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->d:Lcom/sumsub/sns/internal/core/common/L;

    aget-object v3, v1, v4

    invoke-virtual {v0, p0, v3}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    if-eqz v0, :cond_1f

    .line 126
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 127
    :cond_1f
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->d:Lcom/sumsub/sns/internal/core/common/L;

    aget-object v2, v1, v4

    invoke-virtual {v0, p0, v2}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    if-eqz v0, :cond_20

    .line 128
    iget-boolean v2, p1, Lcom/sumsub/sns/internal/features/presentation/esign/x;->c:Z

    .line 129
    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 130
    :cond_20
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/esign/x;->b:Ljava/lang/String;

    if-eqz p1, :cond_21

    .line 131
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->d:Lcom/sumsub/sns/internal/core/common/L;

    aget-object v0, v1, v4

    invoke-virtual {p1, p0, v0}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    if-eqz p1, :cond_21

    .line 132
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/p0;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/esign/p0;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/h;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_21
    return-void
.end method

.method public final b(Lcom/sumsub/sns/internal/features/presentation/esign/x;)V
    .locals 8

    .line 14
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/esign/x;->d:Lcom/sumsub/sns/internal/features/presentation/esign/j;

    if-nez p1, :cond_0

    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->f:Lcom/sumsub/sns/internal/features/presentation/esign/j;

    if-eqz v0, :cond_1

    .line 16
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 17
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/j;->a:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 18
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/esign/j;->b:Ljava/util/Map;

    .line 19
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Screen closed "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " "

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "SNSESignFragment"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 20
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/esign/j;->a:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 21
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/esign/j;->b:Ljava/util/Map;

    .line 22
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Screen changed "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 23
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 24
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 25
    const-string v2, "SNSESignFragment"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    .line 27
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/esign/j;->a:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 28
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->a:Lkotlin/Lazy;

    invoke-interface {v2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 29
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->getIdDocSetType()Ljava/lang/String;

    move-result-object v2

    .line 30
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/esign/j;->b:Ljava/util/Map;

    const/16 v3, 0x8

    .line 31
    invoke-static {v0, v1, v2, p1, v3}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final f()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->b:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/esign/h;->h:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

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
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final g()V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 5
    .line 6
    const-string v1, "SNSESignFragment"

    .line 7
    .line 8
    const-string v2, "hideBottomSheet"

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/esign/h;->f()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v3}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->setStateCallback(Lkotlin/jvm/functions/Function1;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/esign/h;->f()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->hide()V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/esign/h;->f()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    const/16 v1, 0x8

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    :cond_2
    iput-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->c:Landroid/view/ViewGroup;

    .line 44
    return-void
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

.method public final getClosePayload()Ljava/util/Map;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
.end method

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->getIdDocSetType()Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final getLayoutId()Ljava/lang/Integer;
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_esign:I

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
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
.end method

.method public final getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->e()Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 12
    move-result-object v0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;

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
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "handleEvent: "

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 20
    .line 21
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 22
    .line 23
    const-string v2, "SNSESignFragment"

    .line 24
    const/4 v3, 0x0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/esign/t;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAppListener$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/common/u0;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/esign/t;

    .line 40
    .line 41
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/esign/t;->a:Ljava/io/File;

    .line 42
    .line 43
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->a:Lkotlin/Lazy;

    .line 44
    .line 45
    .line 46
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->getIdDocSetType()Ljava/lang/String;

    .line 53
    move-result-object v4

    .line 54
    .line 55
    sget-object v5, Lcom/sumsub/sns/internal/core/analytics/Screen;->ESignDocumentPreviewScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 56
    .line 57
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/esign/t;->b:Ljava/lang/String;

    .line 58
    .line 59
    const-string v0, "docName"

    .line 60
    .line 61
    .line 62
    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    .line 66
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 67
    move-result-object v6

    .line 68
    const/4 v3, 0x0

    .line 69
    .line 70
    const/16 v7, 0x8

    .line 71
    .line 72
    .line 73
    invoke-static/range {v1 .. v7}, Lcom/sumsub/sns/internal/core/common/t0;->a(Lcom/sumsub/sns/internal/core/common/u0;Ljava/io/File;ILjava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/util/Map;I)V

    .line 74
    .line 75
    .line 76
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/esign/h;->g()V

    .line 77
    return-void

    .line 78
    .line 79
    .line 80
    :cond_1
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 81
    return-void
.end method

.method public final bridge synthetic handleState(Lcom/sumsub/sns/core/presentation/base/s;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/esign/x;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/esign/h;->a(Lcom/sumsub/sns/internal/features/presentation/esign/x;)V

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

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/q0;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/esign/q0;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/h;)V

    .line 13
    .line 14
    const-string v1, "esign_otp"

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/FragmentManager;->setFragmentResultListener(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroidx/fragment/app/FragmentResultListener;)V

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z
    .locals 11

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v1, "onFinishCalled: "

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 21
    .line 22
    iget-object v2, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 23
    .line 24
    const-string v3, "SNSESignFragment"

    .line 25
    const/4 v4, 0x0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v3, v0, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    sget-object v0, Lcom/sumsub/sns/internal/core/common/u;->b:Lcom/sumsub/sns/internal/core/common/u;

    .line 31
    .line 32
    .line 33
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    move-result p1

    .line 35
    .line 36
    if-eqz p1, :cond_4

    .line 37
    .line 38
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->a:Lkotlin/Lazy;

    .line 39
    .line 40
    .line 41
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    iget-object v0, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 50
    .line 51
    const-string v1, "SNSESignViewModel"

    .line 52
    .line 53
    .line 54
    const-string/jumbo v2, "onBackPress"

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1, v2, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/base/C;->isFinishingWithResult()Z

    .line 61
    move-result v0

    .line 62
    .line 63
    if-eqz v0, :cond_0

    .line 64
    goto :goto_1

    .line 65
    .line 66
    :cond_0
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->m:Lcom/sumsub/sns/internal/features/data/model/esign/Y;

    .line 67
    .line 68
    if-nez v0, :cond_1

    .line 69
    goto :goto_1

    .line 70
    .line 71
    .line 72
    :cond_1
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/base/M0;->currentState()Lcom/sumsub/sns/core/presentation/base/s;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/esign/x;

    .line 76
    .line 77
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/esign/x;->a:Lcom/sumsub/sns/internal/features/presentation/esign/p;

    .line 78
    .line 79
    instance-of v2, v1, Lcom/sumsub/sns/internal/features/presentation/esign/o;

    .line 80
    .line 81
    if-eqz v2, :cond_2

    .line 82
    .line 83
    .line 84
    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 85
    move-result-object v5

    .line 86
    .line 87
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/esign/Y;

    .line 88
    .line 89
    .line 90
    invoke-direct {v8, p1, v0, v4}, Lcom/sumsub/sns/internal/features/presentation/esign/Y;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lcom/sumsub/sns/internal/features/data/model/esign/Y;Lkotlin/coroutines/Continuation;)V

    .line 91
    const/4 v9, 0x3

    .line 92
    const/4 v10, 0x0

    .line 93
    const/4 v6, 0x0

    .line 94
    const/4 v7, 0x0

    .line 95
    .line 96
    .line 97
    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 98
    goto :goto_0

    .line 99
    .line 100
    :cond_2
    instance-of v0, v1, Lcom/sumsub/sns/internal/features/presentation/esign/i;

    .line 101
    .line 102
    if-eqz v0, :cond_3

    .line 103
    .line 104
    .line 105
    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 106
    move-result-object v5

    .line 107
    .line 108
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/esign/Z;

    .line 109
    .line 110
    .line 111
    invoke-direct {v8, p1, v4}, Lcom/sumsub/sns/internal/features/presentation/esign/Z;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    .line 112
    const/4 v9, 0x3

    .line 113
    const/4 v10, 0x0

    .line 114
    const/4 v6, 0x0

    .line 115
    const/4 v7, 0x0

    .line 116
    .line 117
    .line 118
    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 119
    goto :goto_0

    .line 120
    .line 121
    :cond_3
    instance-of v0, v1, Lcom/sumsub/sns/internal/features/presentation/esign/u;

    .line 122
    .line 123
    if-eqz v0, :cond_4

    .line 124
    .line 125
    .line 126
    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 127
    move-result-object v5

    .line 128
    .line 129
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/esign/a0;

    .line 130
    .line 131
    .line 132
    invoke-direct {v8, p1, v4}, Lcom/sumsub/sns/internal/features/presentation/esign/a0;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    .line 133
    const/4 v9, 0x3

    .line 134
    const/4 v10, 0x0

    .line 135
    const/4 v6, 0x0

    .line 136
    const/4 v7, 0x0

    .line 137
    .line 138
    .line 139
    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 140
    :goto_0
    const/4 p1, 0x0

    .line 141
    return p1

    .line 142
    .line 143
    .line 144
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->e()V

    .line 145
    const/4 p1, 0x1

    .line 146
    return p1
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
